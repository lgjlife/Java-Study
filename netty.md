
<span id="menu">
<!-- TOC -->

- [1. Java网路通信](#1-java网路通信)
    - [1.1. Java IO 演进之路](#11-java-io-演进之路)
    - [1.2. Java IO对比](#12-java-io对比)
        - [1.2.1. BIO编程](#121-bio编程)
        - [1.2.2. 伪异步I/O编程](#122-伪异步io编程)
        - [1.2.3. NIO编程](#123-nio编程)
        - [1.2.4. AIO编程](#124-aio编程)
        - [1.2.5. IO模型对比总结](#125-io模型对比总结)
        - [1.2.6. 选择Netty的理由](#126-选择netty的理由)
    - [1.3. Netty](#13-netty)
        - [1.3.1. Netty基本案例](#131-netty基本案例)
        - [1.3.2. TCP粘包拆包](#132-tcp粘包拆包)
            - [1.3.2.1. 粘包拆包基本概念](#1321-粘包拆包基本概念)
            - [1.3.2.2. Netty 中的拆包器](#1322-netty-中的拆包器)
        - [1.3.3. 私有协议开发](#133-私有协议开发)
            - [1.3.3.1. Netty协议栈功能设计](#1331-netty协议栈功能设计)
            - [1.3.3.2. Netty协议栈开发](#1332-netty协议栈开发)
        - [1.3.4. 服务端创建流程分析](#134-服务端创建流程分析)
        - [1.3.5. 客户端创建流程分析](#135-客户端创建流程分析)
        - [1.3.6. ByteBuf说明](#136-bytebuf说明)
            - [1.3.6.1. ByteBuf功能说明](#1361-bytebuf功能说明)
        - [1.3.7. Channel和Unsafe](#137-channel和unsafe)
        - [1.3.8. ChannelPipeline和ChannelHandler](#138-channelpipeline和channelhandler)
        - [1.3.9. EventLoop和EventLoopGroup](#139-eventloop和eventloopgroup)
            - [1.3.9.1. Reactor单线程模型](#1391-reactor单线程模型)
            - [1.3.9.2. Reactor多线程模型](#1392-reactor多线程模型)
            - [1.3.9.3. 主从Reactor多线程模型](#1393-主从reactor多线程模型)
            - [1.3.9.4. Netty线程模型](#1394-netty线程模型)
            - [1.3.9.5. 最佳实践](#1395-最佳实践)
            - [NioEventLoop 源码分析](#nioeventloop-源码分析)
        - [1.3.10. Futur和Promise](#1310-futur和promise)
        - [1.3.11. Netty架构分析](#1311-netty架构分析)
        - [1.3.12. Java多线程编程在Netty中的应用](#1312-java多线程编程在netty中的应用)
        - [1.3.13. 高性能之道](#1313-高性能之道)
        - [1.3.14. 可靠性](#1314-可靠性)
            - [1.3.14.1. 高可靠性设计](#13141-高可靠性设计)
                - [1.3.14.1.1. 网络通信类故障](#131411-网络通信类故障)
                - [1.3.14.1.2. 链路有效性检测](#131412-链路有效性检测)
                - [1.3.14.1.3. Reactor线程的保护](#131413-reactor线程的保护)
                - [1.3.14.1.4. 内存保护](#131414-内存保护)
                - [1.3.14.1.5. 流量整形](#131415-流量整形)
                - [1.3.14.1.6. 优雅停机接口](#131416-优雅停机接口)
            - [1.3.14.2. 优化建议](#13142-优化建议)

<!-- /TOC -->
# 1. Java网路通信
<a href="#menu" style="float:right">目录</a>


## 1.1. Java IO 演进之路
<a href="#menu" style="float:right">目录</a>

* 在JDK 1.4推出NIO之前，基于Java的所有Socket通信都采用同步阻塞模式BIO，这种一请求一响应的通信模型简化了上层的应用开发，但是在性能和可靠性上却存在很大的瓶颈。

* JDK 1.4 推出了NIO 1.0，主要的类和接口如下
    * 进行异步IO操作的缓冲区ByteBuffer等
    * 进行异步IO操作的管道Pipe
    * 进行各种IO操作的Channel,包括ServerSocketChannel,SocketChannel
    * 多种字符集的编码能力和解码能力
    * 实现非阻塞IO操作的多路复用器Selector
    * 正则表达式类库
    * 文件通道FileChannel
* NIO 1.0的问题
    * 没有统一的文件属性(例如读写权限)
    * API能力较弱，例如目录的级联创建和递归遍历，需要自己实现
    * 底层存储系统的一些高级API无法使用
    * 所有的文件操作都是同步阻塞调用，不支持异步文件操作
* JDK 1.7 推出 NIO2.0
    * 提供能够批量获取文件属性的API，这些API具有平台无关性，不与特定的文件系统相耦合。另外还提供了标准文件系统的SPI，供各个服务提供商扩展实现
    * 提供AIO功能，包括对配置和多播数据报的支持
    * 完成JSR-51定义的通道功能，包括对配置和多播数据报的支持。

## 1.2. Java IO对比
<a href="#menu" style="float:right">目录</a>

### 1.2.1. BIO编程
<a href="#menu" style="float:right">目录</a>

网络编程的基本模型是C/S模型，即两个进程间的通信。

服务端提供IP和监听端口，客户端通过连接操作想服务端监听的地址发起连接请求，通过三次握手连接，如果连接成功建立，双方就可以通过套接字进行通信。

传统的同步阻塞模型开发中，ServerSocket负责绑定IP地址，启动监听端口；Socket负责发起连接操作。连接成功后，双方通过输入和输出流进行同步阻塞式通信。 

简单的描述一下BIO的服务端通信模型：采用BIO通信模型的服务端，通常由一个独立的Acceptor线程负责监听客户端的连接，它接收到客户端连接请求之后为每个客户端创建一个新的线程进行链路处理没处理完成后，通过输出流返回应答给客户端，线程销毁。即典型的一请求一应答通宵模型。

传统BIO通信模型图
![](http://blog.anxpp.com/usr/uploads/2016/05/549520916.png)

该模型最大的问题就是缺乏弹性伸缩能力，当客户端并发访问量增加后，服务端的线程个数和客户端并发访问数呈1:1的正比关系，Java中的线程也是比较宝贵的系统资源，线程数量快速膨胀后，系统的性能将急剧下降，随着访问量的继续增大，系统最终就死-掉-了。

**同步阻塞式I/O创建的Server源码**
```JAVA
package com.anxpp.io.calculator.bio;  
import java.io.IOException;  
import java.net.ServerSocket;  
import java.net.Socket;  
/** 
 * BIO服务端源码 
 * @author yangtao__anxpp.com 
 * @version 1.0 
 */  
public final class ServerNormal {  
    //默认的端口号  
    private static int DEFAULT_PORT = 12345;  
    //单例的ServerSocket  
    private static ServerSocket server;  
    //根据传入参数设置监听端口，如果没有参数调用以下方法并使用默认值  
    public static void start() throws IOException{  
        //使用默认值  
        start(DEFAULT_PORT);  
    }  
    //这个方法不会被大量并发访问，不太需要考虑效率，直接进行方法同步就行了  
    public synchronized static void start(int port) throws IOException{  
        if(server != null) return;  
        try{  
            //通过构造函数创建ServerSocket  
            //如果端口合法且空闲，服务端就监听成功  
            server = new ServerSocket(port);  
            System.out.println("服务器已启动，端口号：" + port);  
            Socket socket;  
            //通过无线循环监听客户端连接  
            //如果没有客户端接入，将阻塞在accept操作上。  
            while(true){  
                socket = server.accept();  
                //当有新的客户端接入时，会执行下面的代码  
                //然后创建一个新的线程处理这条Socket链路  
                new Thread(new ServerHandler(socket)).start();  
            }  
        }finally{  
            //一些必要的清理工作  
            if(server != null){  
                System.out.println("服务器已关闭。");  
                server.close();  
                server = null;  
            }  
        }  
    }  
}  
```
**客户端消息处理线程ServerHandler源码：**
```JAVA
package com.anxpp.io.calculator.bio;  
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.PrintWriter;  
import java.net.Socket;  
  
import com.anxpp.io.utils.Calculator;  
/** 
 * 客户端线程 
 * @author yangtao__anxpp.com 
 * 用于处理一个客户端的Socket链路 
 */  
public class ServerHandler implements Runnable{  
    private Socket socket;  
    public ServerHandler(Socket socket) {  
        this.socket = socket;  
    }  
    @Override  
    public void run() {  
        BufferedReader in = null;  
        PrintWriter out = null;  
        try{  
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
            out = new PrintWriter(socket.getOutputStream(),true);  
            String expression;  
            String result;  
            while(true){  
                //通过BufferedReader读取一行  
                //如果已经读到输入流尾部，返回null,退出循环  
                //如果得到非空值，就尝试计算结果并返回  
                if((expression = in.readLine())==null) break;  
                System.out.println("服务器收到消息：" + expression);  
                try{  
                    result = Calculator.cal(expression).toString();  
                }catch(Exception e){  
                    result = "计算错误：" + e.getMessage();  
                }  
                out.println(result);  
            }  
        }catch(Exception e){  
            e.printStackTrace();  
        }finally{  
            //一些必要的清理工作  
            if(in != null){  
                try {  
                    in.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
                in = null;  
            }  
            if(out != null){  
                out.close();  
                out = null;  
            }  
            if(socket != null){  
                try {  
                    socket.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
                socket = null;  
            }  
        }  
    }  
}  
```
**同步阻塞式I/O创建的Client源码**
```JAVA
package com.anxpp.io.calculator.bio;  
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.PrintWriter;  
import java.net.Socket;  
/** 
 * 阻塞式I/O创建的客户端 
 * @author yangtao__anxpp.com 
 * @version 1.0 
 */  
public class Client {  
    //默认的端口号  
    private static int DEFAULT_SERVER_PORT = 12345;  
    private static String DEFAULT_SERVER_IP = "127.0.0.1";  
    public static void send(String expression){  
        send(DEFAULT_SERVER_PORT,expression);  
    }  
    public static void send(int port,String expression){  
        System.out.println("算术表达式为：" + expression);  
        Socket socket = null;  
        BufferedReader in = null;  
        PrintWriter out = null;  
        try{  
            socket = new Socket(DEFAULT_SERVER_IP,port);  
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
            out = new PrintWriter(socket.getOutputStream(),true);  
            out.println(expression);  
            System.out.println("___结果为：" + in.readLine());  
        }catch(Exception e){  
            e.printStackTrace();  
        }finally{  
            //一下必要的清理工作  
            if(in != null){  
                try {  
                    in.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
                in = null;  
            }  
            if(out != null){  
                out.close();  
                out = null;  
            }  
            if(socket != null){  
                try {  
                    socket.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
                socket = null;  
            }  
        }  
    }  
}  

```

### 1.2.2. 伪异步I/O编程
<a href="#menu" style="float:right">目录</a>

为了改进这种一连接一线程的模型，我们可以使用线程池来管理这些线程（需要了解更多请参考前面提供的文章），实现1个或多个线程处理N个客户端的模型（但是底层还是使用的同步阻塞I/O），通常被称为“伪异步I/O模型“。
![伪异步I/O编程](http://blog.anxpp.com/usr/uploads/2016/05/614169023.png)

实现很简单，我们只需要将新建线程的地方，交给线程池管理即可，只需要改动刚刚的Server代码即可：

```java
package com.anxpp.io.calculator.bio;  
import java.io.IOException;  
import java.net.ServerSocket;  
import java.net.Socket;  
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
/** 
 * BIO服务端源码__伪异步I/O 
 * @author yangtao__anxpp.com 
 * @version 1.0 
 */  
public final class ServerBetter {  
    //默认的端口号  
    private static int DEFAULT_PORT = 12345;  
    //单例的ServerSocket  
    private static ServerSocket server;  
    //线程池 懒汉式的单例  
    private static ExecutorService executorService = Executors.newFixedThreadPool(60);  
    //根据传入参数设置监听端口，如果没有参数调用以下方法并使用默认值  
    public static void start() throws IOException{  
        //使用默认值  
        start(DEFAULT_PORT);  
    }  
    //这个方法不会被大量并发访问，不太需要考虑效率，直接进行方法同步就行了  
    public synchronized static void start(int port) throws IOException{  
        if(server != null) return;  
        try{  
            //通过构造函数创建ServerSocket  
            //如果端口合法且空闲，服务端就监听成功  
            server = new ServerSocket(port);  
            System.out.println("服务器已启动，端口号：" + port);  
            Socket socket;  
            //通过无线循环监听客户端连接  
            //如果没有客户端接入，将阻塞在accept操作上。  
            while(true){  
                socket = server.accept();  
                //当有新的客户端接入时，会执行下面的代码  
                //然后创建一个新的线程处理这条Socket链路  
                executorService.execute(new ServerHandler(socket));  
            }  
        }finally{  
            //一些必要的清理工作  
            if(server != null){  
                System.out.println("服务器已关闭。");  
                server.close();  
                server = null;  
            }  
        }  
    }  
}  


```
 我们知道，如果使用CachedThreadPool线程池（不限制线程数量，如果不清楚请参考文首提供的文章），其实除了能自动帮我们管理线程（复用），看起来也就像是1:1的客户端：线程数模型，而使用FixedThreadPool我们就有效的控制了线程的最大数量，保证了系统有限的资源的控制，实现了N:M的伪异步I/O模型。

但是，正因为限制了线程数量，如果发生大量并发请求，超过最大数量的线程就只能等待，直到线程池中的有空闲的线程可以被复用。而对Socket的输入流就行读取时，会一直阻塞，直到发生：
* 有数据可读
* 可用数据以及读取完毕
* 发生空指针或I/O异常

所以在读取数据较慢时（比如数据量大、网络传输慢等），大量并发的情况下，其他接入的消息，只能一直等待，这就是最大的弊端。

### 1.2.3. NIO编程
<a href="#menu" style="float:right">目录</a>

NIO我们一般认为是New I/O（也是官方的叫法），因为它是相对于老的I/O类库新增的（其实在JDK 1.4中就已经被引入了，但这个名词还会继续用很久，即使它们在现在看来已经是“旧”的了，所以也提示我们在命名时，需要好好考虑），做了很大的改变。但民间跟多人称之为Non-block I/O，即非阻塞I/O，因为这样叫，更能体现它的特点。而下文中的NIO，不是指整个新的I/O库，而是非阻塞I/O。

NIO提供了与传统BIO模型中的Socket和ServerSocket相对应的SocketChannel和ServerSocketChannel两种不同的套接字通道实现。

新增的着两种通道都支持阻塞和非阻塞两种模式。

阻塞模式使用就像传统中的支持一样，比较简单，但是性能和可靠性都不好；非阻塞模式正好与之相反。

对于低负载、低并发的应用程序，可以使用同步阻塞I/O来提升开发速率和更好的维护性；对于高负载、高并发的（网络）应用，应使用NIO的非阻塞模式来开发。

下面会先对基础知识进行介绍。

**缓冲区 Buffer**
Buffer是一个对象，包含一些要写入或者读出的数据。

在NIO库中，所有数据都是用缓冲区处理的。在读取数据时，它是直接读到缓冲区中的；在写入数据时，也是写入到缓冲区中。任何时候访问NIO中的数据，都是通过缓冲区进行操作。

缓冲区实际上是一个数组，并提供了对数据结构化访问以及维护读写位置等信息。

具体的缓存区有这些：ByteBuffe、CharBuffer、 ShortBuffer、IntBuffer、LongBuffer、FloatBuffer、DoubleBuffer。他们实现了相同的接口：Buffer。

**通道 Channel**
我们对数据的读取和写入要通过Channel，它就像水管一样，是一个通道。通道不同于流的地方就是通道是双向的，可以用于读、写和同时读写操作。

底层的操作系统的通道一般都是全双工的，所以全双工的Channel比流能更好的映射底层操作系统的API。

Channel主要分两大类：

SelectableChannel：用户网络读写
FileChannel：用于文件操作
后面代码会涉及的ServerSocketChannel和SocketChannel都是SelectableChannel的子类。

**多路复用器 Selector**
Selector是Java  NIO 编程的基础。

Selector提供选择已经就绪的任务的能力：Selector会不断轮询注册在其上的Channel，如果某个Channel上面发生读或者写事件，这个Channel就处于就绪状态，会被Selector轮询出来，然后通过SelectionKey可以获取就绪Channel的集合，进行后续的I/O操作。

一个Selector可以同时轮询多个Channel，因为JDK使用了epoll()代替传统的select实现，所以没有最大连接句柄1024/2048的限制。所以，只需要一个线程负责Selector的轮询，就可以接入成千上万的客户端。

**NIO服务端**
```java

package com.anxpp.io.calculator.nio;  
public class Server {  
    private static int DEFAULT_PORT = 12345;  
    private static ServerHandle serverHandle;  
    public static void start(){  
        start(DEFAULT_PORT);  
    }  
    public static synchronized void start(int port){  
        if(serverHandle!=null)  
            serverHandle.stop();  
        serverHandle = new ServerHandle(port);  
        new Thread(serverHandle,"Server").start();  
    }  
    public static void main(String[] args){  
        start();  
    }  
}  
package com.anxpp.io.calculator.nio;  
import java.io.IOException;  
import java.net.InetSocketAddress;  
import java.nio.ByteBuffer;  
import java.nio.channels.SelectionKey;  
import java.nio.channels.Selector;  
import java.nio.channels.ServerSocketChannel;  
import java.nio.channels.SocketChannel;  
import java.util.Iterator;  
import java.util.Set;  
  
import com.anxpp.io.utils.Calculator;  
/** 
 * NIO服务端 
 * @author yangtao__anxpp.com 
 * @version 1.0 
 */  
public class ServerHandle implements Runnable{  
    private Selector selector;  
    private ServerSocketChannel serverChannel;  
    private volatile boolean started;  
    /** 
     * 构造方法 
     * @param port 指定要监听的端口号 
     */  
    public ServerHandle(int port) {  
        try{  
            //创建选择器  
            selector = Selector.open();  
            //打开监听通道  
            serverChannel = ServerSocketChannel.open();  
            //如果为 true，则此通道将被置于阻塞模式；如果为 false，则此通道将被置于非阻塞模式  
            serverChannel.configureBlocking(false);//开启非阻塞模式  
            //绑定端口 backlog设为1024  
            serverChannel.socket().bind(new InetSocketAddress(port),1024);  
            //监听客户端连接请求  
            serverChannel.register(selector, SelectionKey.OP_ACCEPT);  
            //标记服务器已开启  
            started = true;  
            System.out.println("服务器已启动，端口号：" + port);  
        }catch(IOException e){  
            e.printStackTrace();  
            System.exit(1);  
        }  
    }  
    public void stop(){  
        started = false;  
    }  
    @Override  
    public void run() {  
        //循环遍历selector  
        while(started){  
            try{  
                //无论是否有读写事件发生，selector每隔1s被唤醒一次  
                selector.select(1000);  
                //阻塞,只有当至少一个注册的事件发生的时候才会继续.  
//              selector.select();  
                Set<SelectionKey> keys = selector.selectedKeys();  
                Iterator<SelectionKey> it = keys.iterator();  
                SelectionKey key = null;  
                while(it.hasNext()){  
                    key = it.next();  
                    it.remove();  
                    try{  
                        handleInput(key);  
                    }catch(Exception e){  
                        if(key != null){  
                            key.cancel();  
                            if(key.channel() != null){  
                                key.channel().close();  
                            }  
                        }  
                    }  
                }  
            }catch(Throwable t){  
                t.printStackTrace();  
            }  
        }  
        //selector关闭后会自动释放里面管理的资源  
        if(selector != null)  
            try{  
                selector.close();  
            }catch (Exception e) {  
                e.printStackTrace();  
            }  
    }  
    private void handleInput(SelectionKey key) throws IOException{  
        if(key.isValid()){  
            //处理新接入的请求消息  
            if(key.isAcceptable()){  
                ServerSocketChannel ssc = (ServerSocketChannel) key.channel();  
                //通过ServerSocketChannel的accept创建SocketChannel实例  
                //完成该操作意味着完成TCP三次握手，TCP物理链路正式建立  
                SocketChannel sc = ssc.accept();  
                //设置为非阻塞的  
                sc.configureBlocking(false);  
                //注册为读  
                sc.register(selector, SelectionKey.OP_READ);  
            }  
            //读消息  
            if(key.isReadable()){  
                SocketChannel sc = (SocketChannel) key.channel();  
                //创建ByteBuffer，并开辟一个1M的缓冲区  
                ByteBuffer buffer = ByteBuffer.allocate(1024);  
                //读取请求码流，返回读取到的字节数  
                int readBytes = sc.read(buffer);  
                //读取到字节，对字节进行编解码  
                if(readBytes>0){  
                    //将缓冲区当前的limit设置为position=0，用于后续对缓冲区的读取操作  
                    buffer.flip();  
                    //根据缓冲区可读字节数创建字节数组  
                    byte[] bytes = new byte[buffer.remaining()];  
                    //将缓冲区可读字节数组复制到新建的数组中  
                    buffer.get(bytes);  
                    String expression = new String(bytes,"UTF-8");  
                    System.out.println("服务器收到消息：" + expression);  
                    //处理数据  
                    String result = null;  
                    try{  
                        result = Calculator.cal(expression).toString();  
                    }catch(Exception e){  
                        result = "计算错误：" + e.getMessage();  
                    }  
                    //发送应答消息  
                    doWrite(sc,result);  
                }  
                //没有读取到字节 忽略  
//              else if(readBytes==0);  
                //链路已经关闭，释放资源  
                else if(readBytes<0){  
                    key.cancel();  
                    sc.close();  
                }  
            }  
        }  
    }  
    //异步发送应答消息  
    private void doWrite(SocketChannel channel,String response) throws IOException{  
        //将消息编码为字节数组  
        byte[] bytes = response.getBytes();  
        //根据数组容量创建ByteBuffer  
        ByteBuffer writeBuffer = ByteBuffer.allocate(bytes.length);  
        //将字节数组复制到缓冲区  
        writeBuffer.put(bytes);  
        //flip操作  
        writeBuffer.flip();  
        //发送缓冲区的字节数组  
        channel.write(writeBuffer);  
        //****此处不含处理“写半包”的代码  
    }  
}  
```

* 可以看到，创建NIO服务端的主要步骤如下：
    * 打开ServerSocketChannel，监听客户端连接
    * 绑定监听端口，设置连接为非阻塞模式
    * 创建Reactor线程，创建多路复用器并启动线程
    * 将ServerSocketChannel注册到Reactor线程中的Selector上，监听ACCEPT事件
    * Selector轮询准备就绪的key
    * Selector监听到新的客户端接入，处理新的接入请求，完成TCP三次握手，简历物理链路
    * 设置客户端链路为非阻塞模式
    * 将新接入的客户端连接注册到Reactor线程的Selector上，监听读操作，读取客户端发送的网络消息
    * 异步读取客户端消息到缓冲区
    * 对Buffer编解码，处理半包消息，将解码成功的消息封装成Task
    * 将应答消息编码为Buffer，调用SocketChannel的write将消息异步发送给客户端

因为应答消息的发送，SocketChannel也是异步非阻塞的，所以不能保证一次能吧需要发送的数据发送完，此时就会出现写半包的问题。我们需要注册写操作，不断轮询Selector将没有发送完的消息发送完毕，然后通过Buffer的hasRemain()方法判断消息是否发送完成。

**NIO客户端**

```java
package com.anxpp.io.calculator.nio;  
public class Client {  
    private static String DEFAULT_HOST = "127.0.0.1";  
    private static int DEFAULT_PORT = 12345;  
    private static ClientHandle clientHandle;  
    public static void start(){  
        start(DEFAULT_HOST,DEFAULT_PORT);  
    }  
    public static synchronized void start(String ip,int port){  
        if(clientHandle!=null)  
            clientHandle.stop();  
        clientHandle = new ClientHandle(ip,port);  
        new Thread(clientHandle,"Server").start();  
    }  
    //向服务器发送消息  
    public static boolean sendMsg(String msg) throws Exception{  
        if(msg.equals("q")) return false;  
        clientHandle.sendMsg(msg);  
        return true;  
    }  
    public static void main(String[] args){  
        start();  
    }  
}  

package com.anxpp.io.calculator.nio;  
import java.io.IOException;  
import java.net.InetSocketAddress;  
import java.nio.ByteBuffer;  
import java.nio.channels.SelectionKey;  
import java.nio.channels.Selector;  
import java.nio.channels.SocketChannel;  
import java.util.Iterator;  
import java.util.Set;  
/** 
 * NIO客户端 
 * @author yangtao__anxpp.com 
 * @version 1.0 
 */  
public class ClientHandle implements Runnable{  
    private String host;  
    private int port;  
    private Selector selector;  
    private SocketChannel socketChannel;  
    private volatile boolean started;  
  
    public ClientHandle(String ip,int port) {  
        this.host = ip;  
        this.port = port;  
        try{  
            //创建选择器  
            selector = Selector.open();  
            //打开监听通道  
            socketChannel = SocketChannel.open();  
            //如果为 true，则此通道将被置于阻塞模式；如果为 false，则此通道将被置于非阻塞模式  
            socketChannel.configureBlocking(false);//开启非阻塞模式  
            started = true;  
        }catch(IOException e){  
            e.printStackTrace();  
            System.exit(1);  
        }  
    }  
    public void stop(){  
        started = false;  
    }  
    @Override  
    public void run() {  
        try{  
            doConnect();  
        }catch(IOException e){  
            e.printStackTrace();  
            System.exit(1);  
        }  
        //循环遍历selector  
        while(started){  
            try{  
                //无论是否有读写事件发生，selector每隔1s被唤醒一次  
                selector.select(1000);  
                //阻塞,只有当至少一个注册的事件发生的时候才会继续.  
//              selector.select();  
                Set<SelectionKey> keys = selector.selectedKeys();  
                Iterator<SelectionKey> it = keys.iterator();  
                SelectionKey key = null;  
                while(it.hasNext()){  
                    key = it.next();  
                    it.remove();  
                    try{  
                        handleInput(key);  
                    }catch(Exception e){  
                        if(key != null){  
                            key.cancel();  
                            if(key.channel() != null){  
                                key.channel().close();  
                            }  
                        }  
                    }  
                }  
            }catch(Exception e){  
                e.printStackTrace();  
                System.exit(1);  
            }  
        }  
        //selector关闭后会自动释放里面管理的资源  
        if(selector != null)  
            try{  
                selector.close();  
            }catch (Exception e) {  
                e.printStackTrace();  
            }  
    }  
    private void handleInput(SelectionKey key) throws IOException{  
        if(key.isValid()){  
            SocketChannel sc = (SocketChannel) key.channel();  
            if(key.isConnectable()){  
                if(sc.finishConnect());  
                else System.exit(1);  
            }  
            //读消息  
            if(key.isReadable()){  
                //创建ByteBuffer，并开辟一个1M的缓冲区  
                ByteBuffer buffer = ByteBuffer.allocate(1024);  
                //读取请求码流，返回读取到的字节数  
                int readBytes = sc.read(buffer);  
                //读取到字节，对字节进行编解码  
                if(readBytes>0){  
                    //将缓冲区当前的limit设置为position=0，用于后续对缓冲区的读取操作  
                    buffer.flip();  
                    //根据缓冲区可读字节数创建字节数组  
                    byte[] bytes = new byte[buffer.remaining()];  
                    //将缓冲区可读字节数组复制到新建的数组中  
                    buffer.get(bytes);  
                    String result = new String(bytes,"UTF-8");  
                    System.out.println("客户端收到消息：" + result);  
                }  
                //没有读取到字节 忽略  
//              else if(readBytes==0);  
                //链路已经关闭，释放资源  
                else if(readBytes<0){  
                    key.cancel();  
                    sc.close();  
                }  
            }  
        }  
    }  
    //异步发送消息  
    private void doWrite(SocketChannel channel,String request) throws IOException{  
        //将消息编码为字节数组  
        byte[] bytes = request.getBytes();  
        //根据数组容量创建ByteBuffer  
        ByteBuffer writeBuffer = ByteBuffer.allocate(bytes.length);  
        //将字节数组复制到缓冲区  
        writeBuffer.put(bytes);  
        //flip操作  
        writeBuffer.flip();  
        //发送缓冲区的字节数组  
        channel.write(writeBuffer);  
        //****此处不含处理“写半包”的代码  
    }  
    private void doConnect() throws IOException{  
        if(socketChannel.connect(new InetSocketAddress(host,port)));  
        else socketChannel.register(selector, SelectionKey.OP_CONNECT);  
    }  
    public void sendMsg(String msg) throws Exception{  
        socketChannel.register(selector, SelectionKey.OP_READ);  
        doWrite(socketChannel, msg);  
    }  
}  

```
### 1.2.4. AIO编程
NIO 2.0引入了新的异步通道的概念，并提供了异步文件通道和异步套接字通道的实现。

异步的套接字通道时真正的异步非阻塞I/O，对应于UNIX网络编程中的事件驱动I/O（AIO）。他不需要过多的Selector对注册的通道进行轮询即可实现异步读写，从而简化了NIO的编程模型。

**Server端代码**
```java
package com.anxpp.io.calculator.aio.server;  
/** 
 * AIO服务端 
 * @author yangtao__anxpp.com 
 * @version 1.0 
 */  
public class Server {  
    private static int DEFAULT_PORT = 12345;  
    private static AsyncServerHandler serverHandle;  
    public volatile static long clientCount = 0;  
    public static void start(){  
        start(DEFAULT_PORT);  
    }  
    public static synchronized void start(int port){  
        if(serverHandle!=null)  
            return;  
        serverHandle = new AsyncServerHandler(port);  
        new Thread(serverHandle,"Server").start();  
    }  
    public static void main(String[] args){  
        Server.start();  
    }  
}  
package com.anxpp.io.calculator.aio.server;  
import java.io.IOException;  
import java.net.InetSocketAddress;  
import java.nio.channels.AsynchronousServerSocketChannel;  
import java.util.concurrent.CountDownLatch;  
public class AsyncServerHandler implements Runnable {  
    public CountDownLatch latch;  
    public AsynchronousServerSocketChannel channel;  
    public AsyncServerHandler(int port) {  
        try {  
            //创建服务端通道  
            channel = AsynchronousServerSocketChannel.open();  
            //绑定端口  
            channel.bind(new InetSocketAddress(port));  
            System.out.println("服务器已启动，端口号：" + port);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
    @Override  
    public void run() {  
        //CountDownLatch初始化  
        //它的作用：在完成一组正在执行的操作之前，允许当前的现场一直阻塞  
        //此处，让现场在此阻塞，防止服务端执行完成后退出  
        //也可以使用while(true)+sleep   
        //生成环境就不需要担心这个问题，以为服务端是不会退出的  
        latch = new CountDownLatch(1);  
        //用于接收客户端的连接  
        channel.accept(this,new AcceptHandler());  
        try {  
            latch.await();  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
    }  
}  
 
package com.anxpp.io.calculator.aio.server;  
import java.nio.ByteBuffer;  
import java.nio.channels.AsynchronousSocketChannel;  
import java.nio.channels.CompletionHandler;  
//作为handler接收客户端连接  
public class AcceptHandler implements CompletionHandler<AsynchronousSocketChannel, AsyncServerHandler> {  
    @Override  
    public void completed(AsynchronousSocketChannel channel,AsyncServerHandler serverHandler) {  
        //继续接受其他客户端的请求  
        Server.clientCount++;  
        System.out.println("连接的客户端数：" + Server.clientCount);  
        serverHandler.channel.accept(serverHandler, this);  
        //创建新的Buffer  
        ByteBuffer buffer = ByteBuffer.allocate(1024);  
        //异步读  第三个参数为接收消息回调的业务Handler  
        channel.read(buffer, buffer, new ReadHandler(channel));  
    }  
    @Override  
    public void failed(Throwable exc, AsyncServerHandler serverHandler) {  
        exc.printStackTrace();  
        serverHandler.latch.countDown();  
    }  
}  
package com.anxpp.io.calculator.aio.server;  
import java.io.IOException;  
import java.io.UnsupportedEncodingException;  
import java.nio.ByteBuffer;  
import java.nio.channels.AsynchronousSocketChannel;  
import java.nio.channels.CompletionHandler;  
import com.anxpp.io.utils.Calculator;  
public class ReadHandler implements CompletionHandler<Integer, ByteBuffer> {  
    //用于读取半包消息和发送应答  
    private AsynchronousSocketChannel channel;  
    public ReadHandler(AsynchronousSocketChannel channel) {  
            this.channel = channel;  
    }  
    //读取到消息后的处理  
    @Override  
    public void completed(Integer result, ByteBuffer attachment) {  
        //flip操作  
        attachment.flip();  
        //根据  
        byte[] message = new byte[attachment.remaining()];  
        attachment.get(message);  
        try {  
            String expression = new String(message, "UTF-8");  
            System.out.println("服务器收到消息: " + expression);  
            String calrResult = null;  
            try{  
                calrResult = Calculator.cal(expression).toString();  
            }catch(Exception e){  
                calrResult = "计算错误：" + e.getMessage();  
            }  
            //向客户端发送消息  
            doWrite(calrResult);  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
    }  
    //发送消息  
    private void doWrite(String result) {  
        byte[] bytes = result.getBytes();  
        ByteBuffer writeBuffer = ByteBuffer.allocate(bytes.length);  
        writeBuffer.put(bytes);  
        writeBuffer.flip();  
        //异步写数据 参数与前面的read一样  
        channel.write(writeBuffer, writeBuffer,new CompletionHandler<Integer, ByteBuffer>() {  
            @Override  
            public void completed(Integer result, ByteBuffer buffer) {  
                //如果没有发送完，就继续发送直到完成  
                if (buffer.hasRemaining())  
                    channel.write(buffer, buffer, this);  
                else{  
                    //创建新的Buffer  
                    ByteBuffer readBuffer = ByteBuffer.allocate(1024);  
                    //异步读  第三个参数为接收消息回调的业务Handler  
                    channel.read(readBuffer, readBuffer, new ReadHandler(channel));  
                }  
            }  
            @Override  
            public void failed(Throwable exc, ByteBuffer attachment) {  
                try {  
                    channel.close();  
                } catch (IOException e) {  
                }  
            }  
        });  
    }  
    @Override  
    public void failed(Throwable exc, ByteBuffer attachment) {  
        try {  
            this.channel.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  

```
虽然代码感觉很多，但是API比NIO的使用起来真的简单多了，主要就是监听、读、写等各种CompletionHandler。此处本应有一个WriteHandler的，确实，我们在ReadHandler中，以一个匿名内部类实现了它。

**Client端代码**
```java
package com.anxpp.io.calculator.aio.client;  
import java.util.Scanner;  
public class Client {  
    private static String DEFAULT_HOST = "127.0.0.1";  
    private static int DEFAULT_PORT = 12345;  
    private static AsyncClientHandler clientHandle;  
    public static void start(){  
        start(DEFAULT_HOST,DEFAULT_PORT);  
    }  
    public static synchronized void start(String ip,int port){  
        if(clientHandle!=null)  
            return;  
        clientHandle = new AsyncClientHandler(ip,port);  
        new Thread(clientHandle,"Client").start();  
    }  
    //向服务器发送消息  
    public static boolean sendMsg(String msg) throws Exception{  
        if(msg.equals("q")) return false;  
        clientHandle.sendMsg(msg);  
        return true;  
    }  
    @SuppressWarnings("resource")  
    public static void main(String[] args) throws Exception{  
        Client.start();  
        System.out.println("请输入请求消息：");  
        Scanner scanner = new Scanner(System.in);  
        while(Client.sendMsg(scanner.nextLine()));  
    }  
}  

package com.anxpp.io.calculator.aio.client;  
import java.io.IOException;  
import java.net.InetSocketAddress;  
import java.nio.ByteBuffer;  
import java.nio.channels.AsynchronousSocketChannel;  
import java.nio.channels.CompletionHandler;  
import java.util.concurrent.CountDownLatch;  
public class AsyncClientHandler implements CompletionHandler<Void, AsyncClientHandler>, Runnable {  
    private AsynchronousSocketChannel clientChannel;  
    private String host;  
    private int port;  
    private CountDownLatch latch;  
    public AsyncClientHandler(String host, int port) {  
        this.host = host;  
        this.port = port;  
        try {  
            //创建异步的客户端通道  
            clientChannel = AsynchronousSocketChannel.open();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
    @Override  
    public void run() {  
        //创建CountDownLatch等待  
        latch = new CountDownLatch(1);  
        //发起异步连接操作，回调参数就是这个类本身，如果连接成功会回调completed方法  
        clientChannel.connect(new InetSocketAddress(host, port), this, this);  
        try {  
            latch.await();  
        } catch (InterruptedException e1) {  
            e1.printStackTrace();  
        }  
        try {  
            clientChannel.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
    //连接服务器成功  
    //意味着TCP三次握手完成  
    @Override  
    public void completed(Void result, AsyncClientHandler attachment) {  
        System.out.println("客户端成功连接到服务器...");  
    }  
    //连接服务器失败  
    @Override  
    public void failed(Throwable exc, AsyncClientHandler attachment) {  
        System.err.println("连接服务器失败...");  
        exc.printStackTrace();  
        try {  
            clientChannel.close();  
            latch.countDown();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
    //向服务器发送消息  
    public void sendMsg(String msg){  
        byte[] req = msg.getBytes();  
        ByteBuffer writeBuffer = ByteBuffer.allocate(req.length);  
        writeBuffer.put(req);  
        writeBuffer.flip();  
        //异步写  
        clientChannel.write(writeBuffer, writeBuffer,new WriteHandler(clientChannel, latch));  
    }  
}  

package com.anxpp.io.calculator.aio.client;  
import java.io.IOException;  
import java.nio.ByteBuffer;  
import java.nio.channels.AsynchronousSocketChannel;  
import java.nio.channels.CompletionHandler;  
import java.util.concurrent.CountDownLatch;  
public class WriteHandler implements CompletionHandler<Integer, ByteBuffer> {  
    private AsynchronousSocketChannel clientChannel;  
    private CountDownLatch latch;  
    public WriteHandler(AsynchronousSocketChannel clientChannel,CountDownLatch latch) {  
        this.clientChannel = clientChannel;  
        this.latch = latch;  
    }  
    @Override  
    public void completed(Integer result, ByteBuffer buffer) {  
        //完成全部数据的写入  
        if (buffer.hasRemaining()) {  
            clientChannel.write(buffer, buffer, this);  
        }  
        else {  
            //读取数据  
            ByteBuffer readBuffer = ByteBuffer.allocate(1024);  
            clientChannel.read(readBuffer,readBuffer,new ReadHandler(clientChannel, latch));  
        }  
    }  
    @Override  
    public void failed(Throwable exc, ByteBuffer attachment) {  
        System.err.println("数据发送失败...");  
        try {  
            clientChannel.close();  
            latch.countDown();  
        } catch (IOException e) {  
        }  
    }  
}  

package com.anxpp.io.calculator.aio.client;  
import java.io.IOException;  
import java.io.UnsupportedEncodingException;  
import java.nio.ByteBuffer;  
import java.nio.channels.AsynchronousSocketChannel;  
import java.nio.channels.CompletionHandler;  
import java.util.concurrent.CountDownLatch;  
public class ReadHandler implements CompletionHandler<Integer, ByteBuffer> {  
    private AsynchronousSocketChannel clientChannel;  
    private CountDownLatch latch;  
    public ReadHandler(AsynchronousSocketChannel clientChannel,CountDownLatch latch) {  
        this.clientChannel = clientChannel;  
        this.latch = latch;  
    }  
    @Override  
    public void completed(Integer result,ByteBuffer buffer) {  
        buffer.flip();  
        byte[] bytes = new byte[buffer.remaining()];  
        buffer.get(bytes);  
        String body;  
        try {  
            body = new String(bytes,"UTF-8");  
            System.out.println("客户端收到结果:"+ body);  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
    }  
    @Override  
    public void failed(Throwable exc,ByteBuffer attachment) {  
        System.err.println("数据读取失败...");  
        try {  
            clientChannel.close();  
            latch.countDown();  
        } catch (IOException e) {  
        }  
    }  
}  


```


### 1.2.5. IO模型对比总结
<a href="#menu" style="float:right">目录</a>

||同步阻塞IO(BIO)|伪异步IO|非阻塞IO(NIO)|异步IO(AIO)|
|---|---|---|---|--|
|客户端个数:IO线程|1：1|M：N(M>=N)|M:1|M:0(不需要启动额外的线程)|
|IO类型(阻塞)|阻塞|阻塞|非阻塞|非阻塞|
|IO类型(同步)|同步|同步|IO多路复用|异步|
|API使用难度|简单|简单|复杂|非常复杂|
|调试难度|简单|简单|复杂|复杂|
|可靠性 |非常差|差|高|高|
|吞吐量|低|中|高|高|

### 1.2.6. 选择Netty的理由
<a href="#menu" style="float:right">目录</a>

**Java NIO的问题**
* API复杂使用麻烦
* 需要具备其他的知识运用，比如多线程网络编程等
* 可靠性需要自行处理，比如断线重连，拆包问题，网络拥塞等问题
* NIO epoll bug,会导致Selector空轮询。新版本概率较低，不确定完全解决。

**选择Netty的理由**
* API使用简单,开发门槛低
* 功能强大，预置多种编解码能力，支持多种主流协议
* 定制能力强
* 性能高
* 成熟稳定
* 社区活跃，迭代快



## 1.3. Netty
<a href="#menu" style="float:right">目录</a>


### 1.3.1. Netty基本案例
<a href="#menu" style="float:right">目录</a>

### 1.3.2. TCP粘包拆包
<a href="#menu" style="float:right">目录</a>

#### 1.3.2.1. 粘包拆包基本概念
<a href="#menu" style="float:right">目录</a>

TCP是个流协议，所谓流，就是没有界限的一串数据。TCP底层并不了解上层业务数据的具体数据的具体含义，它会根据TCP缓冲区的世纪情况进行包的划分，所以每发送一个数据包，可能包含多个的上层业务数据包。也有可能一个大的业务数据包分成多个TCP数据包进行发送。



而对于接收端，并不知道接收的数据流包含了多少个业务数据包。因此需要在整个发送层面做粘包/拆包处理。

粘包、拆包表现形式
第一种情况，接收端正常收到两个数据包，即没有发生拆包和粘包的现象，此种情况不在本文的讨论范围内。
![](https://static.oschina.net/uploads/space/2018/0315/123035_GCyK_3318187.jpg)
第二种情况，接收端只收到一个数据包，由于TCP是不会出现丢包的，所以这一个数据包中包含了发送端发送的两个数据包的信息，这种现象即为粘包。这种情况由于接收端不知道这两个数据包的界限，所以对于接收端来说很难处理。
![](https://static.oschina.net/uploads/space/2018/0315/123101_m6Bf_3318187.jpg)
第三种情况，这种情况有两种表现形式，如下图。接收端收到了两个数据包，但是这两个数据包要么是不完整的，要么就是多出来一块，这种情况即发生了拆包和粘包。这两种情况如果不加特殊处理，对于接收端同样是不好处理的。
![](https://static.oschina.net/uploads/space/2018/0315/123125_1LCT_3318187.jpg)

* 粘包和半包定义如下：
    * 粘包和半包，指的都不是一次是正常的 ByteBuf 缓存区接收。
    * 粘包，就是接收端读取的时候，多个发送过来的 ByteBuf “粘”在了一起。换句话说，接收端读取一次的 ByteBuf ，读到了多个发送端的 ByteBuf ，是为粘包。
    * 半包，就是接收端将一个发送端的ByteBuf “拆”开了，形成一个破碎的包，我们定义这种 ByteBuf 为半包。

换句话说，接收端读取一次的 ByteBuf ，读到了发送端的一个 ByteBuf的一部分，是为半包。

**如何解决呢？**

* 基本思路是，在接收端，需要根据自定义协议来，来读取底层的数据包，重新组装我们应用层的数据包，这个过程通常在接收端称为拆包。

* 拆包的原理
    * 接收端应用层不断从底层的TCP 缓冲区中读取数据。
    * 每次读取完，判断一下是否为一个完整的应用层数据包。如果是，上层应用层数据包读取完成。
    * 如果不是，那就保留该数据在应用层缓冲区，然后继续从 TCP 缓冲区中读取，直到得到一个完整的应用层数据包为止。
    * 至此，**半包**问题得以解决。
    * 如果从TCP底层读到了多个应用层数据包，则将整个应用层缓冲区，拆成一个一个的独立的应用层数据包，返回给调用程序。
    * 至此，**粘包**问题得以解决。



**粘包、拆包发生原因**
1、要发送的数据大于TCP发送缓冲区剩余空间大小，将会发生拆包。
2、待发送数据大于MSS（最大报文长度），TCP在传输前将进行拆包。
3、要发送的数据小于TCP发送缓冲区的大小，TCP将多次写入缓冲区的数据一次发送出去，将会发生粘包。
4、接收数据端的应用层没有及时读取接收缓冲区中的数据，将发生粘包。

**粘包、拆包解决办法**
通过以上分析，我们清楚了粘包或拆包发生的原因，那么如何解决这个问题呢？解决问题的关键在于如何给每个数据包添加边界信息，常用的方法有如下几个：
1、发送端给每个数据包添加包首部，首部中应该至少包含数据包的长度，这样接收端在接收到数据后，通过读取包首部的长度字段，便知道每一个数据包的实际长度了。
2、发送端将每个数据包封装为固定长度（不够的可以通过补0填充），这样接收端每次从接收缓冲区中读取固定长度的数据就自然而然的把每个数据包拆分开来。
3、可以在数据包之间设置边界，如添加特殊符号，这样，接收端通过这个边界就可以将不同的数据包拆分开。

#### 1.3.2.2. Netty 中的拆包器
拆包这个工作，Netty 已经为大家备好了很多不同的拆包器。本着不重复发明轮子的原则，我们直接使用Netty现成的拆包器。

**Netty 中的拆包器大致如下：**
* 固定长度的拆包器 **FixedLengthFrameDecoder**
    * 每个应用层数据包的都拆分成都是固定长度的大小，比如 1024字节。
    * 这个显然不大适应在 Java 聊天程序 进行实际应用。
* 行拆包器 **LineBasedFrameDecoder**
    * 每个应用层数据包，都以换行符作为分隔符，进行分割拆分。
    * 这个显然不大适应在 Java 聊天程序 进行实际应用。
* 分隔符拆包器 **DelimiterBasedFrameDecoder**
    * 每个应用层数据包，都通过自定义的分隔符，进行分割拆分。
    * 这个版本，是LineBasedFrameDecoder 的通用版本，本质上是一样的。
    * 这个显然不大适应在 Java 聊天程序 进行实际应用。
* 基于数据包长度的拆包器 **LengthFieldBasedFrameDecoder**
    * 将应用层数据包的长度，作为接收端应用层数据包的拆分依据。按照应用层数据包的大小，拆包。这个拆包器，有一个要求，就是应用层协议中包含数据包的长度。


### 1.3.3. 私有协议开发
<a href="#menu" style="float:right">目录</a>

#### 1.3.3.1. Netty协议栈功能设计
<a href="#menu" style="float:right">目录</a>

**协议栈功能描述**
* 基于Netty的NIO通信框架，提高高性能的异步通信能力
* 提供消息的编解码，实现POJO的序列化和反序列化
* 提供基于IP地址的白名单接入认证机制
* 链路有效性校验机制
* 链路的断连重连机制

#### 1.3.3.2. Netty协议栈开发
<a href="#menu" style="float:right">目录</a>



### 1.3.4. 服务端创建流程分析
<a href="#menu" style="float:right">目录</a>

![](https://img-blog.csdnimg.cn/20190228093932476.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3N1bnNoaW5lMDUyNjk3,size_16,color_FFFFFF,t_70)

```java
 //bossGroup接受传入的连接
EventLoopGroup bossGroup = new NioEventLoopGroup();
//一旦bossGroup接受连接并注册到workerGroup，workerGroup则处理连接相关的流量
EventLoopGroup workerGroup = new NioEventLoopGroup();
try {

    ServerBootstrap serverBootstrap = new ServerBootstrap();
    //用于设置服务端
    serverBootstrap.group(bossGroup, workerGroup)
            .channel(NioServerSocketChannel.class)
            .option(ChannelOption.SO_BACKLOG, 1024)
            .childHandler(new ChildChannelHandler());

    //绑定端口，同步等待成功
    serverBootstrap.bind(port).sync();

} catch (Exception ex) {
    ex.printStackTrace();
} finally {
    log.info("shutdownGracefully....");
    //  bossGroup.shutdownGracefully();
    //  workerGroup.shutdownGracefully();
}
```

**步骤1**
创建ServerBootstrap实例。ServerBootstrap是服务端的启动辅助类，提供一系列方法用于设置服务端启动的相关参数，底层通过门面模式对各种能力进行抽象和封装。

```java
ServerBootstrap serverBootstrap = new ServerBootstrap();
```
**步骤2**
设置并绑定Reactor线程池EventLoopGroup.如果只有一个，则该线程池负责连接处理和IO读写处理。如果有两个线程池，一个用于连接处理，另一个用于IO读写处理。
NioEventLoopGroup可自行设置线程池大小以及线程工厂，默认的线程数量是CPU核心数量*2.

```java
EventLoopGroup bossGroup = new NioEventLoopGroup();

public ServerBootstrap group(EventLoopGroup group) {
    return this.group(group, group);
}
public ServerBootstrap group(EventLoopGroup parentGroup, EventLoopGroup childGroup){}
```
**步骤3**
设置并绑定服务端Channel.
服务端需要创建NioServerSocketChannel，客户端则为NioSocketChannel
```java
channel(NioServerSocketChannel.class)
```

**步骤4**
配置TCP相关参数
```java
option(ChannelOption.SO_BACKLOG, 1024)
```
**步骤5**
配置消息处理责任链。
常见的处理有消息编解码，消息处理，定时心跳处理。

```java
childHandler(new ChildChannelHandler());

public class ChildChannelHandler extends ChannelInitializer<SocketChannel> {


    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        //  socketChannel.pipeline().addLast(new LineBasedFrameDecoder(1024));
        //  socketChannel.pipeline().addLast(new StringDecoder());
        // socketChannel.pipeline().addLast(new StringEncoder());
        // CoderUtil.DelimiterBasedFramDecoder(socketChannel,1024);
        //  socketChannel.pipeline().addLast(new TimeServerHandler());
        //  socketChannel.pipeline().addLast(new NettyConnectServerHandler());

        // socketChannel.pipeline().addLast(new MsgpackDecoder());
        //  socketChannel.pipeline().addLast(new MsgpackEncoder());
        CoderConfig.JsonCoder(socketChannel);
        socketChannel.pipeline().addLast(new MsgServerHandler());
    }
}


```
**步骤6**

绑定端口，可以选择同步或者异步方式，异步方式需要添加监听器。
在绑定监听端口之前系统会做一系列的初始化和检测工作，完成之后，会启动端口，并将ServerSocketChannel注册到Selector上监听客户端连接。
```java

public ChannelFuture bind(int inetPort) {
    return this.bind(new InetSocketAddress(inetPort));
}

public interface ChannelFuture extends Future<Void> {
    Channel channel();

    ChannelFuture addListener(GenericFutureListener<? extends Future<? super Void>> var1);

    ChannelFuture addListeners(GenericFutureListener... var1);

    ChannelFuture removeListener(GenericFutureListener<? extends Future<? super Void>> var1);

    ChannelFuture removeListeners(GenericFutureListener... var1);

    ChannelFuture sync() throws InterruptedException;

    ChannelFuture syncUninterruptibly();

    ChannelFuture await() throws InterruptedException;

    ChannelFuture awaitUninterruptibly();
}


    
//绑定端口，同步等待成功
serverBootstrap.bind(port).sync();

//绑定端口，异步方式，需要添加GenericFutureListener监听器
serverBootstrap.bind(port).addListener(new GenericFutureListener{
    xxx
};


```
**步骤7**
Selector轮询，由Rector线程NioEventLoop负责调度和执行Selector轮询操作，选择就绪的Channel集合。
```java
 private void select() throws IOException {
    Selector selector = this.selector;

    try {
        int selectCnt = 0;
        long currentTimeNanos = System.nanoTime();
        long selectDeadLineNanos = currentTimeNanos + this.delayNanos(currentTimeNanos);

        while(true) {
            long timeoutMillis = (selectDeadLineNanos - currentTimeNanos + 500000L) / 1000000L;
            if (timeoutMillis <= 0L) {
                if (selectCnt == 0) {
                    selector.selectNow();
                    selectCnt = 1;
                }
                break;
            }

            int selectedKeys = selector.select(timeoutMillis);
            ++selectCnt;
            if (selectedKeys != 0 || this.oldWakenUp || this.wakenUp.get() || this.hasTasks()) {
                break;
            }

            if (SELECTOR_AUTO_REBUILD_THRESHOLD > 0 && selectCnt >= SELECTOR_AUTO_REBUILD_THRESHOLD) {
                logger.warn("Selector.select() returned prematurely {} times in a row; rebuilding selector.", selectCnt);
                this.rebuildSelector();
                selector = this.selector;
                selector.selectNow();
                selectCnt = 1;
                break;
            }

            currentTimeNanos = System.nanoTime();
        }

        if (selectCnt > 3 && logger.isDebugEnabled()) {
            logger.debug("Selector.select() returned prematurely {} times in a row.", selectCnt - 1);
        }
    } catch (CancelledKeyException var10) {
        if (logger.isDebugEnabled()) {
            logger.debug(CancelledKeyException.class.getSimpleName() + " raised by a Selector - JDK bug?", var10);
        }
    }

}
    
```




### 1.3.5. 客户端创建流程分析
<a href="#menu" style="float:right">目录</a>

![](https://img-blog.csdnimg.cn/2019022810332549.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3N1bnNoaW5lMDUyNjk3,size_16,color_FFFFFF,t_70)



**步骤1**
**步骤2**
**步骤3**
**步骤4**
**步骤5**
**步骤6**
**步骤7**
**步骤8**
**步骤9**


### 1.3.6. ByteBuf说明
<a href="#menu" style="float:right">目录</a>

#### 1.3.6.1. ByteBuf功能说明




### 1.3.7. Channel和Unsafe
<a href="#menu" style="float:right">目录</a>

### 1.3.8. ChannelPipeline和ChannelHandler
<a href="#menu" style="float:right">目录</a>

### 1.3.9. EventLoop和EventLoopGroup
<a href="#menu" style="float:right">目录</a>

Netty线程模型的设计，既提升了框架的并发性能，又能在很大程度避免锁，局部实现了无所化设计。


#### 1.3.9.1. Reactor单线程模型
<a href="#menu" style="float:right">目录</a>

* 单线程模型，是指所有的IO操作都在同一个NIO线程上完成。
* NIO线程职责如下
    * 作为NIO服务端，接收客户端的TCP连接,读取通信对端的请求或者应答消息
    * 作为NIO客户端，向服务端发起TCP连接，向通信对端发送消息或者应答消息

* Netty是基于NIO,所有的IO操作都是异步非阻塞，原则上可以处理所有的IO操作。但仅适用于负载较低的场景。对于高并发，高负载并不适合
    * 一个NIO线程同时处理成百上千的链路，性能上无法支撑。即使NIO线程的CPU负荷达到100%，也无法满足海量消息的编码，解码，读取和发送。
    * 当NIO线程负载过重之后，处理速度将变慢，这会导致大量客户端连接超时，超时之后 往往进行重发，更加重了NIO线程的负载，最终导致大量消息积压和处理超时，称为系统的性能瓶颈
    * 可靠性问题，一旦NIO线程意外跑飞，或者进入死循环，会导致系统通信模型不可用，不能接收或处理外部消息，造成节点故障

#### 1.3.9.2. Reactor多线程模型
<a href="#menu" style="float:right">目录</a>

* 与单线程最大的区别是有一组NIO线程来处理IO操作。
* 特点
    * 有一个专门的NIO线程用于监听服务端，接收客户端的TCP连接请求。
    * 网络IO操作的读写等由一个NIO线程池负责，由这些NIO线程负责消息的读取，解码，编码和发送
    * 一个NIO线程可以处理多条链路，但是一个链路只对应一个NIO线程，防止发生并发操作问题。

* 在并发较高的情况下，如果只使用一个线程处理大量的连接，仍然会存在性能问题

#### 1.3.9.3. 主从Reactor多线程模型
<a href="#menu" style="float:right">目录</a>

* 一个线程池负责处理连接操作，一个线程池负责处理IO读写操作、
* 连接线程池仅仅用于客户端的登录，握手和安全认证。一旦链路建立成功，就将链路注册到后端IO线程池上，由IO线程池负责后续的IO操作。

#### 1.3.9.4. Netty线程模型
<a href="#menu" style="float:right">目录</a>

Netty的线程模型由用户自行设置。
两种方式，一种是单线程池模型，连接和IO操作是由单个线程池负责处理。一种是双线程池模型，连接和IO操作是由两个线程池负责处理
线程池的线程数量也可以在定义EventLoopGroup时指定。
客户端只能设置单个线程池，服务端可以设置两个。

ServerBootstrap 有两个方法用于设置线程池，分别用于设置单个和双个线程池。
```java
public ServerBootstrap group(EventLoopGroup group) {
        return this.group(group, group);
    }

public ServerBootstrap group(EventLoopGroup parentGroup, EventLoopGroup childGroup);

 //bossGroup接受传入的连接
EventLoopGroup bossGroup = new NioEventLoopGroup();
//一旦bossGroup接受连接并注册到workerGroup，workerGroup则处理连接相关的流量
EventLoopGroup workerGroup = new NioEventLoopGroup();
try {

    ServerBootstrap serverBootstrap = new ServerBootstrap();
    //用于设置服务端
    serverBootstrap.group(bossGroup, workerGroup)
            .channel(NioServerSocketChannel.class)
            .option(ChannelOption.SO_BACKLOG, 1024)
            .option(ChannelOption.CONNECT_TIMEOUT_MILLIS,3000)
            .childHandler(new ChildChannelHandler());
}
```

* Netty用于接收客户端请求的线程池职责
    * 接收客户端TCP连接，初始化Channel参数
    * 将链路状态变更事件通知给ChannelPipeline

* Netty用于处理IO请求的线程池职责
    * 异步读取通信对端的数据报，发送事件到ChannelPipeline
    * 异步发送消息到通信对端，调用ChannelPipeline的消息发送接口
    * 执行系统调用Task
    * 执行定时任务Task,例如链路空闲状态监测定时任务

* Netty读取到数据之后，直接调用ChannelPipeline的fireChannelRead(Object msg).只要用户不切换线程，一直都是IO线程处理，这种串行化方式避免了多线程操作导致的锁的竞争，从性能角度看是最优的。

#### 1.3.9.5. 最佳实践
<a href="#menu" style="float:right">目录</a>

* 服务端创建两个线程池，用于隔离连接和IO操作
* 尽量不要在ChannelHandler中启动用户线程(解码后用于将POJO消息派发到业务线程除外)
* 解码放在NIO线程中进行，不要放到业务线程
* 如果业务简单，可以很快完成，就直接在IO线程中进行处理。业务复杂，耗时较长，就另起业务线程进行处理。

#### NioEventLoop 源码分析

![NioEventLoop继承体系](https://github.com/lgjlife/Java-Study/blob/master/pic/netty/NioEventLoop.png?raw=true)

```java
public final class NioEventLoop extends SingleThreadEventLoop
```

* NioEventLoop作用
    * IO线程的读写
    * 系统Task,通过调用NioEventLoop的execute(Runable task)方法实现，Netty有很多系统Task,创建它们的主要原因是：当IO线程和用户线程同时操作网络资源时，为了防止并发操作导致的锁竞争，将用户线程的操作封装成Task放入消息队列，由IO线程负责执行，这样就实现了局部无锁化。
    * 定时任务,通过NioEventLoop的schedule(Runnable command, long delay, TimeUnit unit) 实现

### 1.3.10. Futur和Promise
<a href="#menu" style="float:right">目录</a>

```java

public interface Future<V> {
    boolean cancel(boolean mayInterruptIfRunning);
    boolean isCancelled();
    boolean isDone();
    V get() throws InterruptedException, ExecutionException;
    V get(long timeout, TimeUnit unit)
        throws InterruptedException, ExecutionException, TimeoutException;
}

public interface Future<V> extends java.util.concurrent.Future<V> {
    boolean isSuccess();
    boolean isCancellable();
    Throwable cause();
    Future<V> addListener(GenericFutureListener<? extends Future<? super V>> var1);
    Future<V> addListeners(GenericFutureListener... var1);
    Future<V> removeListener(GenericFutureListener<? extends Future<? super V>> var1);
    Future<V> removeListeners(GenericFutureListener... var1);
    Future<V> sync() throws InterruptedException;
    Future<V> syncUninterruptibly();
    Future<V> await() throws InterruptedException;
    Future<V> awaitUninterruptibly();
    boolean await(long var1, TimeUnit var3) throws InterruptedException;
    boolean await(long var1) throws InterruptedException;
    boolean awaitUninterruptibly(long var1, TimeUnit var3);
    boolean awaitUninterruptibly(long var1);
    V getNow();
    boolean cancel(boolean var1);
}

public interface Promise<V> extends Future<V> {
    Promise<V> setSuccess(V var1);
    boolean trySuccess(V var1);
    Promise<V> setFailure(Throwable var1);
    boolean tryFailure(Throwable var1);
    boolean setUncancellable();
    Promise<V> addListener(GenericFutureListener<? extends Future<? super V>> var1);
    Promise<V> addListeners(GenericFutureListener... var1);
    Promise<V> removeListener(GenericFutureListener<? extends Future<? super V>> var1);
    Promise<V> removeListeners(GenericFutureListener... var1);
    Promise<V> await() throws InterruptedException;
    Promise<V> awaitUninterruptibly();
    Promise<V> sync() throws InterruptedException;
    Promise<V> syncUninterruptibly();
}

public interface ChannelFuture extends Future<Void> {
    Channel channel();
    ChannelFuture addListener(GenericFutureListener<? extends Future<? super Void>> var1);
    ChannelFuture addListeners(GenericFutureListener... var1);
    ChannelFuture removeListener(GenericFutureListener<? extends Future<? super Void>> var1);
    ChannelFuture removeListeners(GenericFutureListener... var1);
    ChannelFuture sync() throws InterruptedException;
    ChannelFuture syncUninterruptibly();
    ChannelFuture await() throws InterruptedException;
    ChannelFuture awaitUninterruptibly();
}

public interface ChannelPromise extends ChannelFuture, Promise<Void> {
    Channel channel();
    ChannelPromise setSuccess(Void var1);
    ChannelPromise setSuccess();
    boolean trySuccess();
    ChannelPromise setFailure(Throwable var1);
    ChannelPromise addListener(GenericFutureListener<? extends Future<? super Void>> var1);
    ChannelPromise addListeners(GenericFutureListener... var1);
    ChannelPromise removeListener(GenericFutureListener<? extends Future<? super Void>> var1);
    ChannelPromise removeListeners(GenericFutureListener... var1);
    ChannelPromise sync() throws InterruptedException;
    ChannelPromise syncUninterruptibly();
    ChannelPromise await() throws InterruptedException;
    ChannelPromise awaitUninterruptibly();
}


``` 

### 1.3.11. Netty架构分析
<a href="#menu" style="float:right">目录</a>

### 1.3.12. Java多线程编程在Netty中的应用
<a href="#menu" style="float:right">目录</a>

### 1.3.13. 高性能之道
<a href="#menu" style="float:right">目录</a>

### 1.3.14. 可靠性
<a href="#menu" style="float:right">目录</a>

#### 1.3.14.1. 高可靠性设计
<a href="#menu" style="float:right">目录</a>

##### 1.3.14.1.1. 网络通信类故障
<a href="#menu" style="float:right">目录</a>

**客户端超时连接**

* 传统的BIO编程由于是阻塞式的，需要设置连接超时时间。

* netty连接超时时间实现

设置
```JAVA
serverBootstrap.group(bossGroup, workerGroup).option.(ChannelOption.CONNECT_TIMEOUT_MILLIS,3000);
```

Netty在发起连接的时候，会根据超时时间创建schedule定时任务，定时时间到检测是否连接成功
AbstractNioChannel类的内部类AbstractNioUnsafe
```java
public final void connect(final SocketAddress remoteAddress, SocketAddress localAddress, ChannelPromise promise) {
    if (promise.setUncancellable() && this.ensureOpen(promise)) {
        try {
            if (AbstractNioChannel.this.connectPromise != null) {
                throw new ConnectionPendingException();
            }

            boolean wasActive = AbstractNioChannel.this.isActive();
            if (AbstractNioChannel.this.doConnect(remoteAddress, localAddress)) {
                this.fulfillConnectPromise(promise, wasActive);
            } else {
                AbstractNioChannel.this.connectPromise = promise;
                AbstractNioChannel.this.requestedRemoteAddress = remoteAddress;
                int connectTimeoutMillis = AbstractNioChannel.this.config().getConnectTimeoutMillis();
                if (connectTimeoutMillis > 0) {
                    //
                    AbstractNioChannel.this.connectTimeoutFuture = AbstractNioChannel.this.eventLoop().schedule(new Runnable() {
                        public void run() {
                            ChannelPromise connectPromise = AbstractNioChannel.this.connectPromise;
                            ConnectTimeoutException cause = new ConnectTimeoutException("connection timed out: " + remoteAddress);
                            if (connectPromise != null && connectPromise.tryFailure(cause)) {
                                AbstractNioUnsafe.this.close(AbstractNioUnsafe.this.voidPromise());
                            }

                        }
                    }, (long)connectTimeoutMillis, TimeUnit.MILLISECONDS);
                }

                promise.addListener(new ChannelFutureListener() {
                    public void operationComplete(ChannelFuture future) throws Exception {
                        if (future.isCancelled()) {
                            if (AbstractNioChannel.this.connectTimeoutFuture != null) {
                                AbstractNioChannel.this.connectTimeoutFuture.cancel(false);
                            }

                            AbstractNioChannel.this.connectPromise = null;
                            AbstractNioUnsafe.this.close(AbstractNioUnsafe.this.voidPromise());
                        }

                    }
                });
            }
        } catch (Throwable var6) {
            promise.tryFailure(this.annotateConnectException(var6, remoteAddress));
            this.closeIfClosed();
        }

    }
}
```
Netty客户端超时配置方便，用户无需关心底层如何实现。

**通信对端强制关闭连接**
在客户端和服务端正常通信的过程中，如果发生网络闪断，对方进程突然宕积或者非正常关闭链路事件时，TCP链路就会发生异常。由于TCP是全双工的，通信双方需要关闭和释放Socket句柄才不会发生句柄泄漏。
```
netstat -ano | find 8080

```

**链路关闭**


**定制IO故障**
用户需要对一些异常进行定制化处理
* 客户端断连重连机制
* 消息的缓存重发
* 接口日志中详细记录故障细节
* 运维相关功能，例如告警，触发邮件通知等

Netty当底层发生IO异常时，底层的资源由它释放，同时将异常堆栈信息以事件的形式通知给上层用户。
```java
public class ChannelInboundHandlerAdapter{

    //异常处理
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.fireExceptionCaught(cause);
    }
}
```
##### 1.3.14.1.2. 链路有效性检测
<a href="#menu" style="float:right">目录</a>


##### 1.3.14.1.3. Reactor线程的保护
<a href="#menu" style="float:right">目录</a>

##### 1.3.14.1.4. 内存保护
<a href="#menu" style="float:right">目录</a>

##### 1.3.14.1.5. 流量整形
<a href="#menu" style="float:right">目录</a>


##### 1.3.14.1.6. 优雅停机接口
<a href="#menu" style="float:right">目录</a>


#### 1.3.14.2. 优化建议
<a href="#menu" style="float:right">目录</a>



