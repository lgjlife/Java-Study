# Netty

* Linux 5种IO模型比较 
   *  同步阻塞
   *  同步非阻塞
   *  IO多路复用
   *  IO驱动
   *  异步IO
* select/poll和 epoll 的差别和优缺点
* JAVA  NIO 概念
   *  缓冲区 Buffer
   *  通道 Channel
   *  IO多路复用器 Selector
  
* 为什么选择Netty不选择原生NIO
* Netty是如何解决NIO的空轮询Bug
* TCP 粘包 /拆包问题解决
  * TCP粘包/拆包问题产生的原因
    * 应用程序write写入的字节超过套接字发送缓冲区的大小
    * 进行MSS大小的TCP分段
    * 以太网帧的playload大于MTU进行IP分片
  * 粘包问题解决策略
    * 消息定长，每次发送都能一次性发完。
    * 在包尾增加回车换行符进行分割
    * 将消息分为消息头和消息体，消息头包含消息的总长度
    * 更复杂的应用层协议
* Netty 粘包/拆包解决：使用相关的解码器
  * 根据包尾的回车换行符进行分割 ：LineBasedFrameDecoder
  * 使用自定义的分割符进行分割： DelimiterBasedFrameDecoder
  * 根据固定长度进行分割： FixedLengthFrameDecoder
  * 将消息分为消息头和消息体：LengthFieldBasedFrameDecoder
* 序列化实现方案
  参考[serialization](https://github.com/lgjlife/serialization)
* 序列化方案选择考虑
  * 序列化之后码流的大小，影响网络传输的性能
  * 序列化反序列化过程的性能。
* Netty 客户端创建流程
  * 创建Bootstrap实例，通过API设置创建客户端相关参数，异步发起客户端连接
  * 使用NioEventLoopGroup创建线程组，用于处理与服务端连接和IO读写事件。可以通过构造参数指定IO线程的个数。默认为CPU内核数的两倍。
  * 创建用于客户端连接的NioSocketChannel。
  * 创建Channel Handler Pipeline ，用于调度和执行网络事件。
  * 异步发起TCP连接，判断连接是否成功，如果成功，则直接将NioSocketChannel注册到多路复用器上，监听读操作位，用于数据报的读取和消息发送。如果没有立即连接成功，则注册到连接监听位到多路复用器，等待连接结果。
  * 注册对应的网络监听状态位到多路复用器
  * 多路复用器轮询各个CHANNEL，处理连接结果
  * 如果连接成功，设置Future结果，发送连接成功事件，出发ChannelPipeline执行
  * 由ChannelPipeline调度执行系统和用户的ChannelHanler，执行业务逻辑。
```java

        EventLoopGroup group = new NioEventLoopGroup();
        try {

            Bootstrap bootstrap = new Bootstrap()
            bootstrap.group(group)
                    .channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .handler(new ChildChannelHandler());

            ChannelFuture future = bootstrap.connect(host, port).sync();


            //  future.channel().closeFuture().sync();
            //   future.channel().close().sync();


        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

        }

```

* Netty 服务端创建流程

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
            ChannelFuture channelFuture = serverBootstrap.bind(port).sync();
            Channel channel = channelFuture.channel();

            log.info("绑定端口，同步等待成功");
            //等待服务端监听端口关闭
            //   channelFuture.channel().close().sync();
            log.info("等待服务端监听端口关闭");

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            log.info("shutdownGracefully....");
            //  bossGroup.shutdownGracefully();
            //  workerGroup.shutdownGracefully();
        }
```  

  
  
    
  
