
<span id="menu"></span>
<!-- TOC -->

- [1. WEB容器](#1-web容器)
    - [1.1. WEB容器比较](#11-web容器比较)
    - [1.2. Servlet规范](#12-servlet规范)
    - [1.3. Session和Cookie的区别](#13-session和cookie的区别)
        - [1.3.1. 概念理解](#131-概念理解)
        - [1.3.2. cookie](#132-cookie)
        - [1.3.3. Session](#133-session)
        - [1.3.4. 总结](#134-总结)
        - [1.3.5. 应用场景](#135-应用场景)
    - [1.4. SpringBoot WEB相关配置](#14-springboot-web相关配置)
    - [1.5. Tomcat](#15-tomcat)
        - [1.5.1. 概述](#151-概述)
            - [1.5.1.1. Tomcat快速理解](#1511-tomcat快速理解)
        - [1.5.2. Web服务机制](#152-web服务机制)
            - [1.5.2.1. 通信协议](#1521-通信协议)
        - [1.5.3. Tomcat 总体架构](#153-tomcat-总体架构)
        - [1.5.4. Server和Service组件](#154-server和service组件)
        - [1.5.5. Connect组件](#155-connect组件)
        - [1.5.6. Engine组件](#156-engine组件)
        - [1.5.7. Host容器](#157-host容器)
        - [1.5.8. Context容器](#158-context容器)
        - [1.5.9. Wrapper容器](#159-wrapper容器)
        - [1.5.10. 生命周期管理](#1510-生命周期管理)
        - [1.5.11. 日志框架和国家化](#1511-日志框架和国家化)
        - [1.5.12. 公共与隔离类加载器](#1512-公共与隔离类加载器)
        - [1.5.13. 请求URI映射器Mapper](#1513-请求uri映射器mapper)
        - [1.5.14. Tomcat的JNDI](#1514-tomcat的jndi)
        - [1.5.15. 运行、通信、及访问安全管理](#1515-运行通信及访问安全管理)
        - [1.5.16. 处理请求和响应的管道](#1516-处理请求和响应的管道)
        - [1.5.17. 多样化的会话管理器](#1517-多样化的会话管理器)
        - [1.5.18. 高可用集群实现](#1518-高可用集群实现)
        - [1.5.19. 集群通信框架](#1519-集群通信框架)
        - [1.5.20. 监控和管理](#1520-监控和管理)
    - [1.6. Jetty](#16-jetty)
    - [1.7. 编码问题](#17-编码问题)
        - [1.7.1. 常见的编码格式](#171-常见的编码格式)
- [2. Java网路通信](#2-java网路通信)
    - [2.1. Java IO 演进之路](#21-java-io-演进之路)
    - [2.2. Java IO对比](#22-java-io对比)
        - [2.2.1. BIO编程](#221-bio编程)
        - [2.2.2. 伪异步I/O编程](#222-伪异步io编程)
        - [2.2.3. NIO编程](#223-nio编程)
        - [2.2.4. AIO编程](#224-aio编程)
        - [2.2.5. IO模型对比总结](#225-io模型对比总结)
        - [2.2.6. 选择Netty的理由](#226-选择netty的理由)
    - [2.3. Netty](#23-netty)
        - [2.3.1. Netty基本案例](#231-netty基本案例)
        - [2.3.2. TCP粘包拆包](#232-tcp粘包拆包)
            - [2.3.2.1. 粘包拆包基本概念](#2321-粘包拆包基本概念)
            - [2.3.2.2. Netty 中的拆包器](#2322-netty-中的拆包器)
        - [2.3.3. 私有协议开发](#233-私有协议开发)
            - [2.3.3.1. Netty协议栈功能设计](#2331-netty协议栈功能设计)
            - [2.3.3.2. Netty协议栈开发](#2332-netty协议栈开发)
        - [2.3.4. 服务端创建流程分析](#234-服务端创建流程分析)
        - [2.3.5. 客户端创建流程分析](#235-客户端创建流程分析)
        - [2.3.6. ByteBuf说明](#236-bytebuf说明)
            - [2.3.6.1. ByteBuf功能说明](#2361-bytebuf功能说明)
        - [2.3.7. Channel和Unsafe](#237-channel和unsafe)
        - [2.3.8. ChannelPipeline和ChannelHandler](#238-channelpipeline和channelhandler)
        - [2.3.9. EventLoop和EventLoopGroup](#239-eventloop和eventloopgroup)
            - [2.3.9.1. Reactor单线程模型](#2391-reactor单线程模型)
            - [2.3.9.2. Reactor多线程模型](#2392-reactor多线程模型)
            - [2.3.9.3. 主从Reactor多线程模型](#2393-主从reactor多线程模型)
            - [2.3.9.4. Netty线程模型](#2394-netty线程模型)
            - [2.3.9.5. 最佳实践](#2395-最佳实践)
            - [2.3.9.6. NioEventLoop 源码分析](#2396-nioeventloop-源码分析)
        - [2.3.10. Futur和Promise](#2310-futur和promise)
        - [2.3.11. Netty架构分析](#2311-netty架构分析)
        - [2.3.12. Java多线程编程在Netty中的应用](#2312-java多线程编程在netty中的应用)
        - [2.3.13. 高性能之道](#2313-高性能之道)
        - [2.3.14. 可靠性](#2314-可靠性)
            - [2.3.14.1. 高可靠性设计](#23141-高可靠性设计)
                - [2.3.14.1.1. 网络通信类故障](#231411-网络通信类故障)
                - [2.3.14.1.2. 链路有效性检测](#231412-链路有效性检测)
                - [2.3.14.1.3. Reactor线程的保护](#231413-reactor线程的保护)
                - [2.3.14.1.4. 内存保护](#231414-内存保护)
                - [2.3.14.1.5. 流量整形](#231415-流量整形)
                - [2.3.14.1.6. 优雅停机接口](#231416-优雅停机接口)
            - [2.3.14.2. 优化建议](#23142-优化建议)
- [3. 消息中间件](#3-消息中间件)
    - [3.1. 消息中间件对比](#31-消息中间件对比)
    - [3.2. 消息队列的作用](#32-消息队列的作用)
    - [3.3. 消息堆积处理](#33-消息堆积处理)
    - [3.4. 消息幂等性](#34-消息幂等性)
    - [3.5. 消息顺序性](#35-消息顺序性)
    - [3.6. JMS,AMQP,MQTT区别与联系](#36-jmsamqpmqtt区别与联系)
        - [3.6.1. Java消息传递服务（Java Messaging Service (JMS)）](#361-java消息传递服务java-messaging-service-jms)
            - [3.6.1.1. 简介](#3611-简介)
            - [3.6.1.2. 体系架构](#3612-体系架构)
            - [3.6.1.3. JMS对象模型](#3613-jms对象模型)
            - [3.6.1.4. JMS消息模型](#3614-jms消息模型)
            - [3.6.1.5. 接收消息](#3615-接收消息)
            - [3.6.1.6. JMS消息结构（Message）](#3616-jms消息结构message)
        - [3.6.2. 高级消息队列协议（Advanced Message Queueing Protocol (AMQP)）](#362-高级消息队列协议advanced-message-queueing-protocol-amqp)
            - [3.6.2.1. AMQP 是什么](#3621-amqp-是什么)
            - [3.6.2.2. AMQP模型](#3622-amqp模型)
            - [3.6.2.3. Exchange交换机](#3623-exchange交换机)
            - [3.6.2.4. Queue队列](#3624-queue队列)
            - [3.6.2.5. Consumer消费者](#3625-consumer消费者)
            - [3.6.2.6. 消息机制](#3626-消息机制)
            - [3.6.2.7. 其他](#3627-其他)
        - [3.6.3. 消息队列遥测传输（Message Queueing Telemetry Transport (MQTT)）](#363-消息队列遥测传输message-queueing-telemetry-transport-mqtt)
            - [3.6.3.1. 简述](#3631-简述)
            - [3.6.3.2. 设计规范](#3632-设计规范)
            - [3.6.3.3. 主要特性](#3633-主要特性)
            - [3.6.3.4. MQTT协议原理](#3634-mqtt协议原理)
            - [3.6.3.5. MQTT协议数据包结构](#3635-mqtt协议数据包结构)
    - [3.7. 面试准备](#37-面试准备)

<!-- /TOC -->
<a id="markdown-1-web容器" name="1-web容器"></a>
# 1. WEB容器
<a href="#menu" style="float:right">目录</a>


<a id="markdown-11-web容器比较" name="11-web容器比较"></a>
## 1.1. WEB容器比较
<a href="#menu" style="float:right">目录</a>

**Jetty和tomcat的比较**
* 相同点：
    * Tomcat和Jetty都是一种Servlet引擎，他们都支持标准的servlet规范和JavaEE的规范。
* 不同点：
    * 架构比较 
        * Jetty的架构比Tomcat的更为简单 
        * Jetty的架构是基于Handler来实现的，主要的扩展功能都可以用Handler来实现，扩展简单。 
        * Tomcat的架构是基于容器设计的，进行扩展是需要了解Tomcat的整体设计结构，不易扩展。
    * 性能比较 
        * Jetty和Tomcat性能方面差异不大 
        * Jetty可以同时处理大量连接而且可以长时间保持连接，适合于web聊天应用等等。 
        * Jetty的架构简单，因此作为服务器，Jetty可以按需加载组件，减少不需要的组件，减少了服务器内存开销，从而提高服务器性能。 
        * Jetty默认采用NIO结束在处理I/O请求上更占优势，在处理静态资源时，性能较高
        * 少数非常繁忙;Tomcat适合处理少数非常繁忙的链接，也就是说链接生命周期短的话，Tomcat的总体性能更高。 
        * Tomcat默认采用BIO处理I/O请求，在处理静态资源时，性能较差。
    * 其它比较 
        * Jetty的应用更加快速，修改简单，对新的Servlet规范的支持较好。 
        * Tomcat目前应用比较广泛，对JavaEE和Servlet的支持更加全面，很多特性会直接集成进来。
    
<a id="markdown-12-servlet规范" name="12-servlet规范"></a>
## 1.2. Servlet规范
<a href="#menu" style="float:right">目录</a>

**Servlet 是什么？**
* Java Servlet 是运行在 Web 服务器或应用服务器上的程序，它是作为来自 Web 浏览器或其他 HTTP 客户端的请求和 HTTP 服务器上的数据库或应用程序之间的中间层。

* 使用 Servlet，您可以收集来自网页表单的用户输入，呈现来自数据库或者其他源的记录，还可以动态创建网页。

* Java Servlet 通常情况下与使用 CGI（Common Gateway Interface，公共网关接口）实现的程序可以达到异曲同工的效果。但是相比于 CGI，Servlet 有以下几点优势：
性能明显更好。
    * Servlet 在 Web 服务器的地址空间内执行。这样它就没有必要再创建一个单独的进程来处理每个客户端请求。
    * Servlet 是独立于平台的，因为它们是用 Java 编写的。服务器上的 Java 安全管理器执行了一系列限制，以保护服务器计算机上的资源。因此，Servlet 是可信的。
    * Java 类库的全部功能对 Servlet 来说都是可用的。它可以通过 sockets 和 RMI 机制与 applets、数据库或其他软件进行交互。

**Servlet 任务**
* Servlet 执行以下主要任务：
    * 读取客户端（浏览器）发送的显式的数据。这包括网页上的 HTML 表单，或者也可以是来自 applet 或自定义的 HTTP 客户端程序的表单。
    * 读取客户端（浏览器）发送的隐式的 HTTP 请求数据。这包括 cookies、媒体类型和浏览器能理解的压缩格式等等。
    * 处理数据并生成结果。这个过程可能需要访问数据库，执行 RMI 或 CORBA 调用，调用 Web 服务，或者直接计算得出对应的响应。
    * 发送显式的数据（即文档）到客户端（浏览器）。该文档的格式可以是多种多样的，包括文本文件（HTML 或 XML）、二进制文件（GIF 图像）、Excel 等。
    * 发送隐式的 HTTP 响应到客户端（浏览器）。这包括告诉浏览器或其他客户端被返回的文档类型（例如 HTML），设置 cookies 和缓存参数，以及其他类似的任务。


**Servlet创建方式**
* 实现接口Servlet
* 继承抽象类GenericServlet
* 继承HttpServlet，并重写doGet,doPost等方法

**Servlet 生命周期**

* Servlet 生命周期可被定义为从创建直到毁灭的整个过程。以下是 Servlet 遵循的过程：
    * Servlet 通过调用 init () 方法进行初始化。
    * Servlet 调用 service() 方法来处理客户端的请求。
    * Servlet 通过调用 destroy() 方法终止（结束）。
    * 最后，Servlet 是由 JVM 的垃圾回收器进行垃圾回收的。

* **init() 方法**
    * init 方法被设计成只调用一次。它在第一次创建 Servlet 时被调用，在后续每次用户请求时不再调用。因此，它是用于一次性初始化，就像 Applet 的 init 方法一样。
    * Servlet 创建于用户第一次调用对应于该 Servlet 的 URL 时，但是您也可以指定 Servlet 在服务器第一次启动时被加载。
    * 当用户调用一个 Servlet 时，就会创建一个 Servlet 实例，每一个用户请求都会产生一个新的线程，适当的时候移交给 doGet 或 doPost 方法。init() 方法简单地创建或加载一些数据，这些数据将被用于 Servlet 的整个生命周期。
    * init 方法的定义如下：
```java
public void init() throws ServletException {
  // 初始化代码...
}
```
* **service() 方法**
    * service() 方法是执行实际任务的主要方法。Servlet 容器（即 Web 服务器）调用 service() 方法来处理来自客户端（浏览器）的请求，并把格式化的响应写回给客户端。
    * 每次服务器接收到一个 Servlet 请求时，服务器会产生一个新的线程并调用服务。service() 方法检查 HTTP 请求类型（GET、POST、PUT、DELETE 等），并在适当的时候调用 doGet、doPost、doPut，doDelete 等方法。
    * service() 方法由容器调用，service 方法在适当的时候调用 doGet、doPost、doPut、doDelete 等方法。所以，您不用对 service() 方法做任何动作，您只需要根据来自客户端的请求类型来重写 doGet() 或 doPost() 即可。
```java
public void service(ServletRequest request, 
                    ServletResponse response) 
      throws ServletException, IOException{
}
```
* **doGet() 方法**
    * GET 请求来自于一个 URL 的正常请求，或者来自于一个未指定 METHOD 的 HTML 表单，它由 doGet() 方法处理。
```java
public void doGet(HttpServletRequest request,
                  HttpServletResponse response)
    throws ServletException, IOException {
    // Servlet 代码
}
```
* **doPost() 方法**
POST 请求来自于一个特别指定了 METHOD 为 POST 的 HTML 表单，它由 doPost() 方法处理。

```java
public void doPost(HttpServletRequest request,
                   HttpServletResponse response)
    throws ServletException, IOException {
    // Servlet 代码
}
```
* **destroy() 方法**
    * destroy() 方法只会被调用一次，在 Servlet 生命周期结束时被调用。destroy() 方法可以让您的 Servlet 关闭数据库连接、停止后台线程、把 Cookie 列表或点击计数器写入到磁盘，并执行其他类似的清理活动。

    * 在调用 destroy() 方法之后，servlet 对象被标记为垃圾回收。destroy 方法定义如下所示：

```java
  public void destroy() {
    // 终止化代码...
  }
```
* 一个典型的 Servlet 生命周期方案。
    * 第一个到达服务器的 HTTP 请求被委派到 Servlet 容器。
    * Servlet 容器在调用 service() 方法之前加载 Servlet。
    * 然后 Servlet 容器处理由多个线程产生的多个请求，每个线程执行一个单一的 Servlet 实例的 service() 方法。
![](https://www.runoob.com/wp-content/uploads/2014/07/Servlet-LifeCycle.jpg)

**Servlet 编写过滤器**
* Servlet 过滤器可以动态地拦截请求和响应，以变换或使用包含在请求或响应中的信息。
可以将一个或多个 Servlet 过滤器附加到一个 Servlet 或一组 Servlet。Servlet 过滤器也可以附加到 JavaServer Pages (JSP) 文件和 HTML 页面。调用 Servlet 前调用所有附加的 Servlet 过滤器。
* Servlet 过滤器是可用于 Servlet 编程的 Java 类，可以实现以下目的：
* 在客户端的请求访问后端资源之前，拦截这些请求。
* 在服务器的响应发送回客户端之前，处理这些响应。
* 根据规范建议的各种类型的过滤器：
    * 身份验证过滤器（Authentication Filters）。
    * 数据压缩过滤器（Data compression Filters）。  
    * 加密过滤器（Encryption Filters）。
    * 触发资源访问事件过滤器。
    * 图像转换过滤器（Image Conversion Filters）。
    * 日志记录和审核过滤器（Logging and Auditing Filters）。
    * MIME-TYPE 链过滤器（MIME-TYPE Chain Filters）。
    * 标记化过滤器（Tokenizing Filters）。
    * XSL/T 过滤器（XSL/T Filters），转换 XML 内容。

* Servlet 过滤器方法
    * 过滤器是一个实现了 javax.servlet.Filter 接口的 Java 类。javax.servlet.Filter 接口定义了三个方法
        * public void doFilter (ServletRequest, ServletResponse, FilterChain)
            * 该方法完成实际的过滤操作，当客户端请求方法与过滤器设置匹配的URL时，Servlet容器将先调用过滤器的doFilter方法。FilterChain用户访问后续过滤器。
        * public void init(FilterConfig filterConfig)
            * web 应用程序启动时，web 服务器将创建Filter 的实例对象，并调用其init方法，读取web.xml配置，完成对象的初始化功能，从而为后续的用户请求作好拦截的准备工作（filter对象只会创建一次，init方法也只会执行一次）。开发人员通过init方法的参数，可获得代表当前filter配置信息的FilterConfig对象。
        * public void destroy()
            * Servlet容器在销毁过滤器实例前调用该方法，在该方法中释放Servlet过滤器占用的资源。

<a id="markdown-13-session和cookie的区别" name="13-session和cookie的区别"></a>
## 1.3. Session和Cookie的区别

<a id="markdown-131-概念理解" name="131-概念理解"></a>
### 1.3.1. 概念理解

首先呢，要了解session和cookie的区别先要了解以下几个概念：

1、无状态的HTTP协议：
协议，是指计算机通信网络中两台计算机之间进行通信所必须共同遵守的规定或规则，超文本传输协议(HTTP)是一种通信协议，它允许将超文本标记语言(HTML)文档从Web服务器
传送到客户端的浏览器。
HTTP协议是无状态的协议。一旦数据交换完毕，客户端与服务器端的连接就会关闭，再次交换数据需要建立新的连接。这就意味着服务器无法从连接上跟踪会话。

2、会话（Session）跟踪：
会话，指用户登录网站后的一系列动作，比如浏览商品添加到购物车并购买。会话（Session）跟踪是Web程序中常用的技术，用来跟踪用户的整个会话。常用的会话跟踪技术是Cookie与Session。Cookie通过在客户端记录信息确定用户身份，Session通过在服务器端记录信息确定用户身份。

<a id="markdown-132-cookie" name="132-cookie"></a>
### 1.3.2. cookie

由于HTTP是一种无状态的协议，服务器单从网络连接上无从知道客户身份。用户A购买了一件商品放入购物车内，当再次购买商品时服务器已经无法判断该购买行为是属于用户A的会话还是用户B的会话了。怎么办呢？就给客户端们颁发一个通行证吧，每人一个，无论谁访问都必须携带自己通行证。这样服务器就能从通行证上确认客户身份了。这就是Cookie 的工作原理。

Cookie实际上是一小段的文本信息。客户端请求服务器，如果服务器需要记录该用户状态，就使用response向客户端浏览器颁发一个Cookie。客户端会把Cookie保存起来。当浏览器再请求该网站时，浏览器把请求的网址连同该Cookie一同提交给服务器。服务器检查该Cookie，以此来辨认用户状态。服务器还可以根据需要修改Cookie的内容。

1、会话Cookie和持久Cookie
若不设置过期时间，则表示这个cookie的生命期为浏览器会话期间，关闭浏览器窗口，cookie就消失。这种生命期为浏览器会话期的cookie被称为会话cookie。会话cookie一般不存储在硬盘上而是保存在内存里，当然这种行为并不是规范规定的。
若设置了过期时间，浏览器就会把cookie保存到硬盘上，关闭后再次打开浏览器，这些cookie仍然有效直到超过设定的过期时间。存储在硬盘上的cookie可以在浏览器的不同进程间共享。这种称为持久Cookie。 

2、Cookie具有不可跨域名性
就是说，浏览器访问百度不会带上谷歌的cookie;

<a id="markdown-133-session" name="133-session"></a>
### 1.3.3. Session

Session是另一种记录客户状态的机制，不同的是Cookie保存在客户端浏览器中，而Session保存在服务器上。客户端浏览器访问服务器的时候，服务器把客户端信息以某种形式记录在服务器上。这就是Session。客户端浏览器再次访问时只需要从该Session中查找该客户的状态就可以了。
每个用户访问服务器都会建立一个session，那服务器是怎么标识用户的唯一身份呢？事实上，用户与服务器建立连接的同时，服务器会自动为其分配一个SessionId。

1、两个问题：
1）什么东西可以让你每次请求都把SessionId自动带到服务器呢？显然就是cookie了，如果你想为用户建立一次会话，可以在用户授权成功时给他一个唯一的cookie。当一个用户提交了表单时，浏览器会将用户的SessionId自动附加在HTTP头信息中，（这是浏览器的自动功能，用户不会察觉到），当服务器处理完这个表单后，将结果返回给SessionId所对应的用户。试想，如果没有 SessionId，当有两个用户同时进行注册时，服务器怎样才能知道到底是哪个用户提交了哪个表单呢。

2）储存需要的信息。服务器通过SessionId作为key，读写到对应的value，这就达到了保持会话信息的目的。

2、session的创建：
当程序需要为某个客户端的请求创建一个session时，服务器首先检查这个客户端的请求里是否已包含了sessionId，如果已包含则说明以前已经为此客户端创建过session，服务器就按照sessionId把这个session检索出来使用（检索不到，会新建一个），如果客户端请求不包含sessionId，则为此客户端创建一个session并且生成一个与此session相关联的sessionId，sessionId的值是一个既不会重复，又不容易被找到规律以仿造的字符串，这个sessionId将被在本次响应中返回给客户端保存。

3、禁用cookie：
如果客户端禁用了cookie，通常有两种方法实现session而不依赖cookie。
1）URL重写，就是把sessionId直接附加在URL路径的后面。
2）表单隐藏字段。就是服务器会自动修改表单，添加一个隐藏字段，以便在表单提交时能够把session id传递回服务器。比如： 

```html
<form name="testform" action="/xxx"> 
<input type="hidden" name="jsessionid" value="ByOK3vjFD75aPnrF7C2HmdnV6QZcEbzWoWiBYEnLerjQ99zWpBng!-145788764"> 
<input type="text"> 
</form> 
```

4、Session共享：
对于多网站(同一父域不同子域)单服务器，我们需要解决的就是来自不同网站之间SessionId的共享。由于域名不同(aaa.test.com和bbb.test.com)，而SessionId又分别储存在各自的cookie中，因此服务器会认为对于两个子站的访问,是来自不同的会话。解决的方法是通过修改cookies的域名为父域名达到cookie共享的目的,从而实现SessionId的共享。带来的弊端就是，子站间的cookie信息也同时被共享了。  

<a id="markdown-134-总结" name="134-总结"></a>
### 1.3.4. 总结

1、cookie数据存放在客户的浏览器上，session数据放在服务器上。
2、cookie不是很安全，别人可以分析存放在本地的cookie并进行cookie欺骗，考虑到安全应当使用session。
3、session会在一定时间内保存在服务器上。当访问增多，会比较占用你服务器的性能，考虑到减轻服务器性能方面，应当使用cookie。
4、单个cookie保存的数据不能超过4K，很多浏览器都限制一个站点最多保存20个cookie。
5、可以考虑将登陆信息等重要信息存放为session，其他信息如果需要保留，可以放在cookie中。

<a id="markdown-135-应用场景" name="135-应用场景"></a>
### 1.3.5. 应用场景
登录网站，今输入用户名密码登录了，第二天再打开很多情况下就直接打开了。这个时候用到的一个机制就是cookie。
session一个场景是购物车，添加了商品之后客户端处可以知道添加了哪些商品，而服务器端如何判别呢，所以也需要存储一些信息就用到了session



<a id="markdown-14-springboot-web相关配置" name="14-springboot-web相关配置"></a>
## 1.4. SpringBoot WEB相关配置
```properties
# EMBEDDED SERVER CONFIGURATION (ServerProperties)

#服务器绑定地址，默认为0.0.0.0
server.address= # Network address to which the server should bind to.
server.compression.enabled=false # If response compression is enabled.
server.compression.excluded-user-agents= # List of user-agents to exclude from compression.
server.compression.mime-types= # Comma-separated list of MIME types that should be compressed. For instance `text/html,text/css,application/json`
server.compression.min-response-size= # Minimum response size that is required for compression to be performed. For instance 2048
#服务器连接超时
server.connection-timeout= #3s, Time in milliseconds that connectors will wait for another HTTP request before closing the connection. When not set, the connector's container-specific default will be used. Use a value of -1 to indicate no (i.e. infinite) timeout.
server.display-name=application # Display name of the application.
#请求头的最大大小：
server.max-http-header-size=0 # Maximum size in bytes of the HTTP message header.
#确定显示有关错误的信息。例如，我们可以包含错误消息和堆栈跟踪：
server.error.include-exception=false # Include the "exception" attribute.
server.error.include-stacktrace=never # or always， When to include a "stacktrace" attribute.
#Whitelabel的默认路径是*/error*。可以通过设置server.error.path参数来自定义它：
server.error.path=/error # Path of the error controller.
#默认情况下，Spring Boot提供标准错误网页。此页面称为Whitelabel
server.error.whitelabel.enabled=true # Enable the default error page displayed in browsers in case of a server error.
server.jetty.acceptors= # Number of acceptor threads to use.
server.jetty.accesslog.append=false # Append to log.
server.jetty.accesslog.date-format=dd/MMM/yyyy:HH:mm:ss Z # Timestamp format of the request log.
server.jetty.accesslog.enabled=false # Enable access log.
server.jetty.accesslog.extended-format=false # Enable extended NCSA format.
server.jetty.accesslog.file-date-format= # Date format to place in log file name.
server.jetty.accesslog.filename= # Log filename. If not specified, logs will be redirected to "System.err".
server.jetty.accesslog.locale= # Locale of the request log.
server.jetty.accesslog.log-cookies=false # Enable logging of the request cookies.
server.jetty.accesslog.log-latency=false # Enable logging of request processing time.
server.jetty.accesslog.log-server=false # Enable logging of the request hostname.
server.jetty.accesslog.retention-period=31 # Number of days before rotated log files are deleted.
server.jetty.accesslog.time-zone=GMT # Timezone of the request log.
server.jetty.max-http-post-size=0 # Maximum size in bytes of the HTTP post or put content.
server.jetty.selectors= # Number of selector threads to use.

# 服务器端口，默认8080
server.port=8080 # Server HTTP port.
server.server-header= # Value to use for the Server response header (no header is sent if empty)
server.use-forward-headers= # If X-Forwarded-* headers should be applied to the HttpRequest.
server.servlet.context-parameters.*= # Servlet context init parameters
server.servlet.context-path= # Context path of the application.
server.servlet.jsp.class-name=org.apache.jasper.servlet.JspServlet # The class name of the JSP servlet.
server.servlet.jsp.init-parameters.*= # Init parameters used to configure the JSP servlet
server.servlet.jsp.registered=true # Whether or not the JSP servlet is registered
server.servlet.path=/ # Path of the main dispatcher servlet.
server.session.cookie.comment= # Comment for the session cookie.
server.session.cookie.domain= # Domain for the session cookie.
server.session.cookie.http-only= # "HttpOnly" flag for the session cookie.
server.session.cookie.max-age= # Maximum age of the session cookie in seconds.
server.session.cookie.name= # Session cookie name.
server.session.cookie.path= # Path of the session cookie.
server.session.cookie.secure= # "Secure" flag for the session cookie.
server.session.persistent=false # Persist session data between restarts.
server.session.servlet.filter-order=-2147483598 # Session repository filter order.
server.session.servlet.filter-dispatcher-types=ASYNC, ERROR, REQUEST # Session repository filter dispatcher types.
server.session.store-dir= # Directory used to store session data.
server.session.timeout= # Session timeout in seconds.
server.session.tracking-modes= # Session tracking modes (one or more of the following: "cookie", "url", "ssl").
server.ssl.ciphers= # Supported SSL ciphers.
server.ssl.client-auth= # Whether client authentication is wanted ("want") or needed ("need"). Requires a trust store.
server.ssl.enabled= # Enable SSL support.
server.ssl.enabled-protocols= # Enabled SSL protocols.
server.ssl.key-alias= # Alias that identifies the key in the key store.
server.ssl.key-password= # Password used to access the key in the key store.
server.ssl.key-store= # Path to the key store that holds the SSL certificate (typically a jks file).
server.ssl.key-store-password= # Password used to access the key store.
server.ssl.key-store-provider= # Provider for the key store.
server.ssl.key-store-type= # Type of the key store.
server.ssl.protocol=TLS # SSL protocol to use.
server.ssl.trust-store= # Trust store that holds SSL certificates.
server.ssl.trust-store-password= # Password used to access the trust store.
server.ssl.trust-store-provider= # Provider for the trust store.
server.ssl.trust-store-type= # Type of the trust store.
server.tomcat.accept-count= # Maximum queue length for incoming connection requests when all possible request processing threads are in use.
server.tomcat.accesslog.buffered=true # Buffer output such that it is only flushed periodically.
server.tomcat.accesslog.directory=logs # Directory in which log files are created. Can be relative to the tomcat base dir or absolute.
server.tomcat.accesslog.enabled=false # Enable access log.
server.tomcat.accesslog.file-date-format=.yyyy-MM-dd # Date format to place in log file name.
server.tomcat.accesslog.pattern=common # Format pattern for access logs.
server.tomcat.accesslog.prefix=access_log # Log file name prefix.
server.tomcat.accesslog.rename-on-rotate=false # Defer inclusion of the date stamp in the file name until rotate time.
server.tomcat.accesslog.request-attributes-enabled=false # Set request attributes for IP address, Hostname, protocol and port used for the request.
server.tomcat.accesslog.rotate=true # Enable access log rotation.
server.tomcat.accesslog.suffix=.log # Log file name suffix.
server.tomcat.additional-tld-skip-patterns= # Comma-separated list of additional patterns that match jars to ignore for TLD scanning.
server.tomcat.background-processor-delay=30 # Delay in seconds between the invocation of backgroundProcess methods.
server.tomcat.basedir= # Tomcat base directory. If not specified a temporary directory will be used.
server.tomcat.internal-proxies=10\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\
        192\\.168\\.\\d{1,3}\\.\\d{1,3}|\\
        169\\.254\\.\\d{1,3}\\.\\d{1,3}|\\
        127\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\
        172\\.1[6-9]{1}\\.\\d{1,3}\\.\\d{1,3}|\\
        172\\.2[0-9]{1}\\.\\d{1,3}\\.\\d{1,3}|\\
        172\\.3[0-1]{1}\\.\\d{1,3}\\.\\d{1,3} # regular expression matching trusted IP addresses.
server.tomcat.max-connections= # Maximum number of connections that the server will accept and process at any given time.
server.tomcat.max-http-header-size=0 # Maximum size in bytes of the HTTP message header.
#整个POST请求的最大大小：
server.tomcat.max-http-post-size=0 # 2MB, Maximum size in bytes of the HTTP post content.
Tomcat工作线程的最大数量：
server.tomcat.max-threads=0 # Maximum amount of worker threads.
server.tomcat.min-spare-threads=0 # Minimum amount of worker threads.
server.tomcat.port-header=X-Forwarded-Port # Name of the HTTP header used to override the original port value.
server.tomcat.protocol-header= # Header that holds the incoming protocol, usually named "X-Forwarded-Proto".
server.tomcat.protocol-header-https-value=https # Value of the protocol header that indicates that the incoming request uses SSL.
server.tomcat.redirect-context-root= # Whether requests to the context root should be redirected by appending a / to the path.
server.tomcat.remote-ip-header= # Name of the http header from which the remote ip is extracted. For instance `X-FORWARDED-FOR`
server.tomcat.uri-encoding=UTF-8 # Character encoding to use to decode the URI.
server.undertow.accesslog.dir= # Undertow access log directory.
server.undertow.accesslog.enabled=false # Enable access log.
server.undertow.accesslog.pattern=common # Format pattern for access logs.
server.undertow.accesslog.prefix=access_log. # Log file name prefix.
server.undertow.accesslog.rotate=true # Enable access log rotation.
server.undertow.accesslog.suffix=log # Log file name suffix.
server.undertow.buffer-size= # Size of each buffer in bytes.
server.undertow.direct-buffers= # Allocate buffers outside the Java heap.
server.undertow.io-threads= # Number of I/O threads to create for the worker.
server.undertow.eager-filter-init=true # Whether servlet filters should be initialized on startup.
server.undertow.max-http-post-size=0 # Maximum size in bytes of the HTTP post content.
server.undertow.worker-threads= # Number of worker threads.
```

**SpringBoot自定义Tomcat相关配置** 
```
@Component
public class MyEmbeddedServletContainerFactory  {



    @Bean
    public TomcatServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
            @Override
            protected void postProcessContext(Context context) {
                SecurityConstraint constraint = new SecurityConstraint();
                constraint.setUserConstraint("CONFIDENTIAL");
                SecurityCollection collection = new SecurityCollection();
                collection.addPattern("/*");
                constraint.addCollection(collection);
                context.addConstraint(constraint);
            }
        };
        tomcat.addAdditionalTomcatConnectors(httpConnector());
        return tomcat;
    }
    @Bean
    public Connector httpConnector() {
       ;
        Connector connector = new Connector( Http11NioProtocol.class.getName());
        connector.setScheme("http");
        //Connector监听的http的端口号
       // connector.setPort(httpPort);
        connector.setSecure(false);
        //监听到http的端口号后转向到的https的端口号
      //  connector.setRedirectPort(httpsPort);
        return connector;
    }
}

```






<a id="markdown-15-tomcat" name="15-tomcat"></a>
## 1.5. Tomcat
<a href="#menu" style="float:right">目录</a>

<a id="markdown-151-概述" name="151-概述"></a>
### 1.5.1. 概述
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1511-tomcat快速理解" name="1511-tomcat快速理解"></a>
#### 1.5.1.1. Tomcat快速理解
<a href="#menu" style="float:right">目录</a>

<a id="markdown-152-web服务机制" name="152-web服务机制"></a>
### 1.5.2. Web服务机制
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1521-通信协议" name="1521-通信协议"></a>
#### 1.5.2.1. 通信协议
<a href="#menu" style="float:right">目录</a>

* HTTP协议
    * Hyper Text Transfer Protocol 超文本传输协议
    * 用于从WEB服务器传输超文本到本地浏览器的过程
    * 能够使网络传输减少，保证计算机正确快速地传输超文本文档
    * 无状态协议，两次传输之间没有关系
    * 由请求和响应组成
* HTTPS协议
    * http的安全版本
    * 只是在HTTP中增加一个SSL或TLS协议层
    * 提供了加解密的机制,比HTTP明文传输更加安全

* 常用加解密算法分类
    * 对称加密
        * 密钥只有一个，加密，解密都是这个密码。DES，AES，RC4
    * 非对称加密
        * 密钥成对出现，使用公钥加密，私钥解密
        * RSA,DSA,DSS
    * Hash算法
        * 不可逆算法，用于验证数据的完整性
* HTTPS执行流程
    * 客户端浏览器向服务器发送SSL/TLS协议的版本号，加密算法的种类，产生的随机数，以其他需要的各种信息。
    * 服务器从客户端支持的加密算法中选择一组加密算法与Hash算法，并且把自己的证书(包含网址地址，加密公钥，证书颁发机构)也发送给客户端
    * 浏览器获取服务器的证书后验证其合法性，验证证书中的网址是否与正在访问的地址一致，通过验证的浏览器会显示一个小锁头，否则证书不受信。
    * 客户端浏览器生成一串随机数并用服务器传来的公钥加密，再使用约定好的Hash算法计算握手消息，发送到服务器
    * 服务器接到握手消息后用自己的私钥解密，并用Hash验证，这样双方都有了此次通信的密钥
    * 服务端再使用密钥加密一段握手消息，返回给客户端浏览器
    * 浏览器用密钥揭秘，并用Hash算法验证，确定算法与密钥
    * 双方利用此次协商好的密钥进行通信
    

<a id="markdown-153-tomcat-总体架构" name="153-tomcat-总体架构"></a>
### 1.5.3. Tomcat 总体架构
<a href="#menu" style="float:right">目录</a>

Tomcat总计架构
![](https://github.com/lgjlife/Java-Study/blob/master/pic/tomcat/tomcat.png?raw=true)
默认配置文件
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!--
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
-->
<!-- Note:  A "Server" is not itself a "Container", so you may not
     define subcomponents such as "Valves" at this level.
     Documentation at /docs/config/server.html
 -->
<Server port="8005" shutdown="SHUTDOWN">
  <Listener className="org.apache.catalina.startup.VersionLoggerListener" />
  <!-- Security listener. Documentation at /docs/config/listeners.html
  <Listener className="org.apache.catalina.security.SecurityListener" />
  -->
  <!--APR library loader. Documentation at /docs/apr.html -->
  <Listener className="org.apache.catalina.core.AprLifecycleListener" SSLEngine="on" />
  <!-- Prevent memory leaks due to use of particular java/javax APIs-->
  <Listener className="org.apache.catalina.core.JreMemoryLeakPreventionListener" />
  <Listener className="org.apache.catalina.mbeans.GlobalResourcesLifecycleListener" />
  <Listener className="org.apache.catalina.core.ThreadLocalLeakPreventionListener" />

  <!-- Global JNDI resources
       Documentation at /docs/jndi-resources-howto.html
  -->
  <GlobalNamingResources>
    <!-- Editable user database that can also be used by
         UserDatabaseRealm to authenticate users
    -->
    <Resource name="UserDatabase" auth="Container"
              type="org.apache.catalina.UserDatabase"
              description="User database that can be updated and saved"
              factory="org.apache.catalina.users.MemoryUserDatabaseFactory"
              pathname="conf/tomcat-users.xml" />
  </GlobalNamingResources>

  <!-- A "Service" is a collection of one or more "Connectors" that share
       a single "Container" Note:  A "Service" is not itself a "Container",
       so you may not define subcomponents such as "Valves" at this level.
       Documentation at /docs/config/service.html
   -->
  <Service name="Catalina">

    <!--The connectors can use a shared executor, you can define one or more named thread pools-->
    <!--
    <Executor name="tomcatThreadPool" namePrefix="catalina-exec-"
        maxThreads="150" minSpareThreads="4"/>
    -->


    <!-- A "Connector" represents an endpoint by which requests are received
         and responses are returned. Documentation at :
         Java HTTP Connector: /docs/config/http.html
         Java AJP  Connector: /docs/config/ajp.html
         APR (HTTP/AJP) Connector: /docs/apr.html
         Define a non-SSL/TLS HTTP/1.1 Connector on port 8080
    -->
    <Connector port="8180" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" />
    <!-- A "Connector" using the shared thread pool-->
    <!--
    <Connector executor="tomcatThreadPool"
               port="8080" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" />
    -->
    <!-- Define a SSL/TLS HTTP/1.1 Connector on port 8443
         This connector uses the NIO implementation. The default
         SSLImplementation will depend on the presence of the APR/native
         library and the useOpenSSL attribute of the
         AprLifecycleListener.
         Either JSSE or OpenSSL style configuration may be used regardless of
         the SSLImplementation selected. JSSE style configuration is used below.
    -->
    <!--
    <Connector port="8443" protocol="org.apache.coyote.http11.Http11NioProtocol"
               maxThreads="150" SSLEnabled="true">
        <SSLHostConfig>
            <Certificate certificateKeystoreFile="conf/localhost-rsa.jks"
                         type="RSA" />
        </SSLHostConfig>
    </Connector>
    -->
    <!-- Define a SSL/TLS HTTP/1.1 Connector on port 8443 with HTTP/2
         This connector uses the APR/native implementation which always uses
         OpenSSL for TLS.
         Either JSSE or OpenSSL style configuration may be used. OpenSSL style
         configuration is used below.
    -->
    <!--
    <Connector port="8443" protocol="org.apache.coyote.http11.Http11AprProtocol"
               maxThreads="150" SSLEnabled="true" >
        <UpgradeProtocol className="org.apache.coyote.http2.Http2Protocol" />
        <SSLHostConfig>
            <Certificate certificateKeyFile="conf/localhost-rsa-key.pem"
                         certificateFile="conf/localhost-rsa-cert.pem"
                         certificateChainFile="conf/localhost-rsa-chain.pem"
                         type="RSA" />
        </SSLHostConfig>
    </Connector>
    -->

    <!-- Define an AJP 1.3 Connector on port 8009 -->
    <Connector port="8009" protocol="AJP/1.3" redirectPort="8443" />


    <!-- An Engine represents the entry point (within Catalina) that processes
         every request.  The Engine implementation for Tomcat stand alone
         analyzes the HTTP headers included with the request, and passes them
         on to the appropriate Host (virtual host).
         Documentation at /docs/config/engine.html -->

    <!-- You should set jvmRoute to support load-balancing via AJP ie :
    <Engine name="Catalina" defaultHost="localhost" jvmRoute="jvm1">
    -->
    <Engine name="Catalina" defaultHost="localhost">

      <!--For clustering, please take a look at documentation at:
          /docs/cluster-howto.html  (simple how to)
          /docs/config/cluster.html (reference documentation) -->
      <!--
      <Cluster className="org.apache.catalina.ha.tcp.SimpleTcpCluster"/>
      -->

      <!-- Use the LockOutRealm to prevent attempts to guess user passwords
           via a brute-force attack -->
      <Realm className="org.apache.catalina.realm.LockOutRealm">
        <!-- This Realm uses the UserDatabase configured in the global JNDI
             resources under the key "UserDatabase".  Any edits
             that are performed against this UserDatabase are immediately
             available for use by the Realm.  -->
        <Realm className="org.apache.catalina.realm.UserDatabaseRealm"
               resourceName="UserDatabase"/>
      </Realm>

      <Host name="localhost"  appBase="webapps"
            unpackWARs="true" autoDeploy="true">

        <!-- SingleSignOn valve, share authentication between web applications
             Documentation at: /docs/config/valve.html -->
        <!--
        <Valve className="org.apache.catalina.authenticator.SingleSignOn" />
        -->

        <!-- Access log processes all example.
             Documentation at: /docs/config/valve.html
             Note: The pattern used is equivalent to using pattern="common" -->
        <Valve className="org.apache.catalina.valves.AccessLogValve" directory="logs"
               prefix="localhost_access_log" suffix=".txt"
               pattern="%h %l %u %t &quot;%r&quot; %s %b" />

      </Host>
    </Engine>
  </Service>
</Server>
```

配置文件
```xml
<Server>
    <Listener/>
    <GlobalNamingResources>
        <Resources/>
    </GlobalNamingResources>

    <Service>
        <Executor/>            
        <Connector/>
        <Engine>
            <Cluster/>
            <Realm/>
            <Host>
                <Context/>
            </Host>
        </Engine>
    </Service>
</Server>
```
**组件说明**

* Server
    * 最顶级组件，代表Tomcat的运行实例,一个JVM中只包含一个Server
    * 为了方便扩展，引入了监听器
    * 为了方便在Tomcat中集成JNDI，引入了GlobalNamingResources组件
* Service
    * 服务的抽象，代表请求从接收到处理的所有组件的集合
    * 一个Server可以有多个Service
    * 一个Service包含多个用于接收请求的Conneector和处理请求的Engine.
    * 不同的Connector可以提供不同的通信协议
    * Executor提供线程池
* Connector
    * 接收客户端连接和接收报文，经过处理后送往容器处理
    * 可以配置不同的协议，Http,AJP等
    * 可以配置多个Connector
* Engine
    * 处理所有Connector的请求
    * 包含以下组件
        * Host:虚拟主机
        * Listener:在Tomcat生命周期中完成某些Engine容器相关工作的监听器
        * AccessLog: 客户端访问日志，所有客户端访问都会被记录
        * Cluster：提供集群功能，可以将Engine容器需要共享的数据同步到集群中的其他Tomcat
        * Pipeline： Engine对请求进行处理的管道
        * Realm：提供Engine容器级别的用户，密码，权限数据对象，配合资源认证模块使用。        
* Host
    * 虚拟主机
    * 包含以下组件
        * Listener:在Tomcat生命周期中完成某些Host容器相关工作的监听器
        * AccessLog: 客户端访问日志，所有客户端访问都会被记录
        * Cluster：提供集群功能，可以将Host容器需要共享的数据同步到集群中的其他Tomcat
        * Pipeline： Host对请求进行处理的管道
        * Realm：提供Host容器级别的用户，密码，权限数据对象，配合资源认证模块使用。 
        * Context   
* Context
    * WEB应用的抽象，我们开发的WEB应用部署到Tomcat后运行时就会转化为Context对象。
    * 包含了各种静态资源，若干Servlet和其他动态资源
    * 包含以下组件
        * Listener:在Tomcat生命周期中完成某些Context容器相关工作的监听器
        * AccessLog: 客户端访问日志，所有客户端访问都会被记录
        * Pipeline： Context对请求进行处理的管道
        * Realm：提供Context容器级别的用户，密码，权限数据对象，配合资源认证模块使用。
        * Loader: WEB应用加载器，用于加载WEB应用的资源，保证不同WEB应用资源的隔离
        * Manager: 会话管理器，用于管理对应WEB容器的会话，包括维护会话多的生成，更新，和销毁
        * NamingResources: 命名资源。负责将Tomcat配置文件的server.xml和WEB应用的context.xml资源和属性映射到内存中。
        * Mapper:Servelet映射器，负责该Context容器的路由导航
        * Wrapper:Context子容器
* Wrapper
    * Servelet 组件
    * ServletPool ： Servlet对象池
    * Pipeline： Wrapper对请求进行处理的管道
**Tomcat请求处理过程**
![](https://github.com/lgjlife/Java-Study/blob/master/pic/tomcat/tomcat-request.png?raw=true)



<a id="markdown-154-server和service组件" name="154-server和service组件"></a>
### 1.5.4. Server和Service组件
<a href="#menu" style="float:right">目录</a>


<a id="markdown-155-connect组件" name="155-connect组件"></a>
### 1.5.5. Connect组件
<a href="#menu" style="float:right">目录</a>

* http11Protocol
    * HTTP阻塞模式协议
* http11NioProtocol
    * HTTP非阻塞模式协议
* http11ArpProtocol
    * HTTPARP模式协议
* http11AjpProtocol
    * HTTP阻塞模式协议

<a id="markdown-156-engine组件" name="156-engine组件"></a>
### 1.5.6. Engine组件
<a href="#menu" style="float:right">目录</a>

<a id="markdown-157-host容器" name="157-host容器"></a>
### 1.5.7. Host容器
<a href="#menu" style="float:right">目录</a>

<a id="markdown-158-context容器" name="158-context容器"></a>
### 1.5.8. Context容器
<a href="#menu" style="float:right">目录</a>


<a id="markdown-159-wrapper容器" name="159-wrapper容器"></a>
### 1.5.9. Wrapper容器
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1510-生命周期管理" name="1510-生命周期管理"></a>
### 1.5.10. 生命周期管理
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1511-日志框架和国家化" name="1511-日志框架和国家化"></a>
### 1.5.11. 日志框架和国家化
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1512-公共与隔离类加载器" name="1512-公共与隔离类加载器"></a>
### 1.5.12. 公共与隔离类加载器
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1513-请求uri映射器mapper" name="1513-请求uri映射器mapper"></a>
### 1.5.13. 请求URI映射器Mapper
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1514-tomcat的jndi" name="1514-tomcat的jndi"></a>
### 1.5.14. Tomcat的JNDI
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1515-运行通信及访问安全管理" name="1515-运行通信及访问安全管理"></a>
### 1.5.15. 运行、通信、及访问安全管理
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1516-处理请求和响应的管道" name="1516-处理请求和响应的管道"></a>
### 1.5.16. 处理请求和响应的管道
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1517-多样化的会话管理器" name="1517-多样化的会话管理器"></a>
### 1.5.17. 多样化的会话管理器
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1518-高可用集群实现" name="1518-高可用集群实现"></a>
### 1.5.18. 高可用集群实现
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1519-集群通信框架" name="1519-集群通信框架"></a>
### 1.5.19. 集群通信框架
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1520-监控和管理" name="1520-监控和管理"></a>
### 1.5.20. 监控和管理
<a href="#menu" style="float:right">目录</a>



<a id="markdown-16-jetty" name="16-jetty"></a>
## 1.6. Jetty
<a href="#menu" style="float:right">目录</a>

<a id="markdown-17-编码问题" name="17-编码问题"></a>
## 1.7. 编码问题
<a href="#menu" style="float:right">目录</a>

* 需要编码的原因
    * 计算机中存储信息的最小单位是一个字节，所能表示的字符范围是0～255
    * 人类表示的符号太多，无法使用一个字节完全表示，比如汉字就有几千个。

* 当将一种编码格式的数据转化成另一种编码格式的数据就要进行翻译

<a id="markdown-171-常见的编码格式" name="171-常见的编码格式"></a>
### 1.7.1. 常见的编码格式
<a href="#menu" style="float:right">目录</a>

**ASCII码**
* 总共128个，用一个字节的低7位表示。
* 0-31是控制字符，比如换行回车等，都是不可打印的。
* 32~126是可打印字符，可以通过键盘输入并显示出来


**ISO-8859-1**
* 涵盖了大多数西欧的语言字符
* 单字节编码，总共能表示256字符

**GB2312**
* 双字节编，全称信息技术 中文编码字符集
* 编码范围：A1-F7，A1-A9是符号区，总共包含682个字符;B0-F7是汉字区，包含6763个汉字。

**GBK**
* 全称：汉字内码扩展规范,用于扩展GB2312,加入了更多的汉字，编码和GB2312兼容，只有多出来的汉字GB2312不能表示

**GB18030**
* 全称:信息技术 中文编码字符集
* 可能是单字节，双字节，或者四字节编码

**UTF-16**
* 两个字节表示
* 问题:有的字符只需要一个字节就可以表示，使用两个字节就会占用更多的空间。


**UTF-8**
* 采用变长技术，每个编码区域有不同的字码长度，不同类型的字符可以由1-6个字节组成
* 编码规则
    * 如果是一个字节，以0开头，则表示这是一个ASCII字符00-7F
    * 如果是一个字节，以11开头，则连续1的个数暗示这个字符的字节数
    * 如果一个字节以10开始，表示不是首字节，需要向前查找才能找到首字节。

```
0111 1111 :以0开头，单字节，有效数据是 111 1111；
1101 1111 1011 1010 ：首字节以11开头，说明有两个字节，第2个字节必须以10开头，有效数据是01 1111 11 1010.
1111 1111 1011 1010 1011 1010 ：首字节以111开头，说明有三个字节，第2个字节必须以10开头，有效数据是01 1111 11 1010 11 1010.

```



<span id="menu">

<a id="markdown-2-java网路通信" name="2-java网路通信"></a>
# 2. Java网路通信
<a href="#menu" style="float:right">目录</a>


<a id="markdown-21-java-io-演进之路" name="21-java-io-演进之路"></a>
## 2.1. Java IO 演进之路
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

<a id="markdown-22-java-io对比" name="22-java-io对比"></a>
## 2.2. Java IO对比
<a href="#menu" style="float:right">目录</a>

<a id="markdown-221-bio编程" name="221-bio编程"></a>
### 2.2.1. BIO编程
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

<a id="markdown-222-伪异步io编程" name="222-伪异步io编程"></a>
### 2.2.2. 伪异步I/O编程
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

<a id="markdown-223-nio编程" name="223-nio编程"></a>
### 2.2.3. NIO编程
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
<a id="markdown-224-aio编程" name="224-aio编程"></a>
### 2.2.4. AIO编程
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


<a id="markdown-225-io模型对比总结" name="225-io模型对比总结"></a>
### 2.2.5. IO模型对比总结
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

<a id="markdown-226-选择netty的理由" name="226-选择netty的理由"></a>
### 2.2.6. 选择Netty的理由
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



<a id="markdown-23-netty" name="23-netty"></a>
## 2.3. Netty
<a href="#menu" style="float:right">目录</a>


<a id="markdown-231-netty基本案例" name="231-netty基本案例"></a>
### 2.3.1. Netty基本案例
<a href="#menu" style="float:right">目录</a>

<a id="markdown-232-tcp粘包拆包" name="232-tcp粘包拆包"></a>
### 2.3.2. TCP粘包拆包
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2321-粘包拆包基本概念" name="2321-粘包拆包基本概念"></a>
#### 2.3.2.1. 粘包拆包基本概念
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

<a id="markdown-2322-netty-中的拆包器" name="2322-netty-中的拆包器"></a>
#### 2.3.2.2. Netty 中的拆包器
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


<a id="markdown-233-私有协议开发" name="233-私有协议开发"></a>
### 2.3.3. 私有协议开发
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2331-netty协议栈功能设计" name="2331-netty协议栈功能设计"></a>
#### 2.3.3.1. Netty协议栈功能设计
<a href="#menu" style="float:right">目录</a>

**协议栈功能描述**
* 基于Netty的NIO通信框架，提高高性能的异步通信能力
* 提供消息的编解码，实现POJO的序列化和反序列化
* 提供基于IP地址的白名单接入认证机制
* 链路有效性校验机制
* 链路的断连重连机制

<a id="markdown-2332-netty协议栈开发" name="2332-netty协议栈开发"></a>
#### 2.3.3.2. Netty协议栈开发
<a href="#menu" style="float:right">目录</a>



<a id="markdown-234-服务端创建流程分析" name="234-服务端创建流程分析"></a>
### 2.3.4. 服务端创建流程分析
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




<a id="markdown-235-客户端创建流程分析" name="235-客户端创建流程分析"></a>
### 2.3.5. 客户端创建流程分析
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


<a id="markdown-236-bytebuf说明" name="236-bytebuf说明"></a>
### 2.3.6. ByteBuf说明
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2361-bytebuf功能说明" name="2361-bytebuf功能说明"></a>
#### 2.3.6.1. ByteBuf功能说明




<a id="markdown-237-channel和unsafe" name="237-channel和unsafe"></a>
### 2.3.7. Channel和Unsafe
<a href="#menu" style="float:right">目录</a>

<a id="markdown-238-channelpipeline和channelhandler" name="238-channelpipeline和channelhandler"></a>
### 2.3.8. ChannelPipeline和ChannelHandler
<a href="#menu" style="float:right">目录</a>

<a id="markdown-239-eventloop和eventloopgroup" name="239-eventloop和eventloopgroup"></a>
### 2.3.9. EventLoop和EventLoopGroup
<a href="#menu" style="float:right">目录</a>

Netty线程模型的设计，既提升了框架的并发性能，又能在很大程度避免锁，局部实现了无所化设计。


<a id="markdown-2391-reactor单线程模型" name="2391-reactor单线程模型"></a>
#### 2.3.9.1. Reactor单线程模型
<a href="#menu" style="float:right">目录</a>

* 单线程模型，是指所有的IO操作都在同一个NIO线程上完成。
* NIO线程职责如下
    * 作为NIO服务端，接收客户端的TCP连接,读取通信对端的请求或者应答消息
    * 作为NIO客户端，向服务端发起TCP连接，向通信对端发送消息或者应答消息

* Netty是基于NIO,所有的IO操作都是异步非阻塞，原则上可以处理所有的IO操作。但仅适用于负载较低的场景。对于高并发，高负载并不适合
    * 一个NIO线程同时处理成百上千的链路，性能上无法支撑。即使NIO线程的CPU负荷达到100%，也无法满足海量消息的编码，解码，读取和发送。
    * 当NIO线程负载过重之后，处理速度将变慢，这会导致大量客户端连接超时，超时之后 往往进行重发，更加重了NIO线程的负载，最终导致大量消息积压和处理超时，称为系统的性能瓶颈
    * 可靠性问题，一旦NIO线程意外跑飞，或者进入死循环，会导致系统通信模型不可用，不能接收或处理外部消息，造成节点故障

<a id="markdown-2392-reactor多线程模型" name="2392-reactor多线程模型"></a>
#### 2.3.9.2. Reactor多线程模型
<a href="#menu" style="float:right">目录</a>

* 与单线程最大的区别是有一组NIO线程来处理IO操作。
* 特点
    * 有一个专门的NIO线程用于监听服务端，接收客户端的TCP连接请求。
    * 网络IO操作的读写等由一个NIO线程池负责，由这些NIO线程负责消息的读取，解码，编码和发送
    * 一个NIO线程可以处理多条链路，但是一个链路只对应一个NIO线程，防止发生并发操作问题。

* 在并发较高的情况下，如果只使用一个线程处理大量的连接，仍然会存在性能问题

<a id="markdown-2393-主从reactor多线程模型" name="2393-主从reactor多线程模型"></a>
#### 2.3.9.3. 主从Reactor多线程模型
<a href="#menu" style="float:right">目录</a>

* 一个线程池负责处理连接操作，一个线程池负责处理IO读写操作、
* 连接线程池仅仅用于客户端的登录，握手和安全认证。一旦链路建立成功，就将链路注册到后端IO线程池上，由IO线程池负责后续的IO操作。

<a id="markdown-2394-netty线程模型" name="2394-netty线程模型"></a>
#### 2.3.9.4. Netty线程模型
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

<a id="markdown-2395-最佳实践" name="2395-最佳实践"></a>
#### 2.3.9.5. 最佳实践
<a href="#menu" style="float:right">目录</a>

* 服务端创建两个线程池，用于隔离连接和IO操作
* 尽量不要在ChannelHandler中启动用户线程(解码后用于将POJO消息派发到业务线程除外)
* 解码放在NIO线程中进行，不要放到业务线程
* 如果业务简单，���以很快完成，就直接在IO线程中进行处理。业务复杂，耗时较长，就另起业务线程进行处理。

<a id="markdown-2396-nioeventloop-源码分析" name="2396-nioeventloop-源码分析"></a>
#### 2.3.9.6. NioEventLoop 源码分析

![NioEventLoop继承体系](https://github.com/lgjlife/Java-Study/blob/master/pic/netty/NioEventLoop.png?raw=true)

```java
public final class NioEventLoop extends SingleThreadEventLoop
```

* NioEventLoop作用
    * IO线程的读写
    * 系统Task,通过调用NioEventLoop的execute(Runable task)方法实现，Netty有很多系统Task,创建它们的主要原因是：当IO线程和用户线程同时操作网络资源时，为了防止并发操作导致的锁竞争，将用户线程的操作封装成Task放入消息队列，由IO线程负责执行，这样就实现了局部无锁化。
    * 定时任务,通过NioEventLoop的schedule(Runnable command, long delay, TimeUnit unit) 实现。

<a id="markdown-2310-futur和promise" name="2310-futur和promise"></a>
### 2.3.10. Futur和Promise
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

<a id="markdown-2311-netty架构分析" name="2311-netty架构分析"></a>
### 2.3.11. Netty架构分析
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2312-java多线程编程在netty中的应用" name="2312-java多线程编程在netty中的应用"></a>
### 2.3.12. Java多线程编程在Netty中的应用
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2313-高性能之道" name="2313-高性能之道"></a>
### 2.3.13. 高性能之道
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2314-可靠性" name="2314-可靠性"></a>
### 2.3.14. 可靠性
<a href="#menu" style="float:right">目录</a>

<a id="markdown-23141-高可靠性设计" name="23141-高可靠性设计"></a>
#### 2.3.14.1. 高可靠性设计
<a href="#menu" style="float:right">目录</a>

<a id="markdown-231411-网络通信类故障" name="231411-网络通信类故障"></a>
##### 2.3.14.1.1. 网络通信类故障
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
<a id="markdown-231412-链路有效性检测" name="231412-链路有效性检测"></a>
##### 2.3.14.1.2. 链路有效性检测
<a href="#menu" style="float:right">目录</a>


<a id="markdown-231413-reactor线程的保护" name="231413-reactor线程的保护"></a>
##### 2.3.14.1.3. Reactor线程的保护
<a href="#menu" style="float:right">目录</a>

<a id="markdown-231414-内存保护" name="231414-内存保护"></a>
##### 2.3.14.1.4. 内存保护
<a href="#menu" style="float:right">目录</a>

<a id="markdown-231415-流量整形" name="231415-流量整形"></a>
##### 2.3.14.1.5. 流量整形
<a href="#menu" style="float:right">目录</a>


<a id="markdown-231416-优雅停机接口" name="231416-优雅停机接口"></a>
##### 2.3.14.1.6. 优雅停机接口
<a href="#menu" style="float:right">目录</a>


<a id="markdown-23142-优化建议" name="23142-优化建议"></a>
#### 2.3.14.2. 优化建议
<a href="#menu" style="float:right">目录</a>




<span id="menu">




<a id="markdown-3-消息中间件" name="3-消息中间件"></a>
# 3. 消息中间件


<a id="markdown-31-消息中间件对比" name="31-消息中间件对比"></a>
## 3.1. 消息中间件对比

<a href="#menu" style="float:right">目录</a>

|功能|RocketMA|Kafka|RabbitMQ|
|---|---|---|---|
|语言|Java|erlang|scala|
|安全防护|支持|支持|支持|
|主子帐号支持|支持|支持|不支持|
|可靠性|同步刷盘，同步双写|同步刷盘，同步双写|同步刷盘|
|可用性|非常好|非常好|好|
|横向扩展能力|支持 平滑扩展|支持平滑扩展|集群扩容|
|Low Latency|低延迟|支持|不支持|
|消费模型|Push/Pull|Push/Pull|Push/Pull|
|定时消息|支持(精确到ms)|不支持|支持 |
|事务消息|支持|不支持|不支持|

<a id="markdown-32-消息队列的作用" name="32-消息队列的作用"></a>
## 3.2. 消息队列的作用
<a href="#menu" style="float:right">目录</a>

* 解耦
    * 传统模式:
        * 传统模式的缺点：系统间耦合性太强，如上图所示，系统A在代码中直接调用系统B和系统C的代码，如果将来D系统接入，系统A还需要修改代码，过于麻烦！
    * 中间件模式:
        * 中间件模式的的优点：将消息写入消息队列，需要消息的系统自己从消息队列中订阅，从而系统A不需要做任何修改。
* 异步
    * 传统模式:
        * 传统模式的缺点：一些非必要的业务逻辑以同步的方式运行，太耗费时间。
    * 中间件模式:
        * 中间件模式的的优点：将消息写入消息队列，非必要的业务逻辑以异步的方式运行，加快响应速度
* 削峰
    * 传统模式
        * 传统模式的缺点：并发量大的时候，所有的请求直接怼到数据库，造成数据库连接异常
    * 中间件模式:
        * 中间件模式的的优点：系统A慢慢的按照数据库能处理的并发量，从消息队列中慢慢拉取消息。在生产中，这个短暂的高峰期积压是允许的。


**使用了消息队列会有什么缺点?**

* 系统可用性降低
    * 本来其他系统只要运行好好的，那你的系统就是正常的。现在你非要加个消息队列进去，那消息队列挂了，系统业务会得不到即时处理。因此，系统可用性降低
* 系统复杂性增加
    * 要多考虑很多方面的问题，比如一致性问题、如何保证消息不被重复消费，如何保证保证消息可靠传输。因此，需要考虑的东西更多，系统复杂性增大。


<a id="markdown-33-消息堆积处理" name="33-消息堆积处理"></a>
## 3.3. 消息堆积处理
<a href="#menu" style="float:right">目录</a>

**如何解决消息队列的延时以及过期失效问题？消息队列满了以后该怎么处理？有几百万消息持续积压几小时，说说怎么解决？**


**问题分析**
* 消费者出现故障
* 消费者处理缓慢(消费者计算机负载压力大，数据库负载压力大或者出现问题)

**处理**
* 先确定什么原因导致消息堆积，解决该问题，确保消费者恢复正常的消费速度
* 如果是Kafka或者RocketMQ则增加分区数目，如果是RabbitMQ,则增加队列数目
* 增加消费者部署数目，或者消费者内部增加多线程进行并发处理。
* 如果消息数量恢复到正常水平，恢复原来的架构部署。

<a id="markdown-34-消息幂等性" name="34-消息幂等性"></a>
## 3.4. 消息幂等性
<a href="#menu" style="float:right">目录</a>

* 幂等性
    * 一般指消息执行一次或者执行多次的效果是一样
    * get天然幂等性
    * set +1需要处理确保幂等型 
* 消息中间件定义了三种语义
    * 消息最多投递一次，也就是我已经投出去了，收没收到不管了，会存在消息丢失；
    * 消息至少投递一次，可能网络问题，broker 没有及时确认消息的接收，producer 没有及时收到确认，producer 又发送了消息，存在重复的消息；
    * 消息只投一次 ，producer 初始化的时候生成一个唯一的 PID， 生成的消息也生成一个seq，实现 producer 端的消息不重复

* 解决方式1
    * 每个消息带上全局唯一ID，当消息消费成功，就把这个ID存到分布式存储系统(Redis/Mysql)，需要设置好超时时间或者定时清理，避免历史数据堆积占用空间
    * 当出现重复消费时，先读取存储里面的ID是否存在，存在说明消息已经消费，消息丢弃
* 解决方式2
    * 使用业务ID，比如订单号(订单号一般都是全局唯一的)，如果订单执行成功，那么数据库中就存在记录，在执行之前查询先数据库中是否存在记录。

<a id="markdown-35-消息顺序性" name="35-消息顺序性"></a>
## 3.5. 消息顺序性
<a href="#menu" style="float:right">目录</a>

 顺序性指的是在一些具体的业务中，前后的业务操作必须有顺序，否则会导致业务处理错误。例如在电商系统中，订单和支付通常是两个不同的业务逻辑，我们通常会将其分拆开来处理。这两个业务逻辑之间存在非常清晰的依赖关系：需要先生成订单，然后才能支付订单。对于这种情况，我们就说订单消息和支付消息是有顺序性的。

对于消息中间件的消息顺序性问题，一般通用的处理方案是保证局部的消息有序。例如对于 Kafka 来说，我们会保证 Partition 区域的消息有序性。对于上面所说的订单消息、支付消息的例子，我们一般会将订单消息和支付消息里的用户ID作为key，将其分配到同一个 partition 中，这样它们就是有序的。

<a id="markdown-36-jmsamqpmqtt区别与联系" name="36-jmsamqpmqtt区别与联系"></a>
## 3.6. JMS,AMQP,MQTT区别与联系
<a href="#menu" style="float:right">目录</a>


消息传递作为基本通信机制已经在全世界成功运用。无论是人与人、机器与人还是机器与机器之间，消息传递一直都是唯一常用的通信方式。在双方（或更多）之间交换消息有两种基本机制。

同步消息传递
异步消息传递
同步消息传递在这种情况下使用，当消息发送者希望在某个时间范围内收到响应，然后再进行下一个任务。基本上就是他在收到响应前一直处于“阻塞”状态。

异步消息意味着发送者并不要求立即收到响应，而且也不会阻塞整个流程。响应可有可无，发送者总会执行剩下的任务。

上面提到的技术，当两台计算机上的程序相互通信的时候，就广泛使用了异步消息传递。随着微服务架构的兴起，很明显我们需要使用异步消息传递模型来构建服务。

这一直是软件工程中的基本问题，而且不同的人和组织机构会提出不同的方法。我将介绍在企业IT系统中广泛使用的三种最成功的异步消息传递技术。


<a id="markdown-361-java消息传递服务java-messaging-service-jms" name="361-java消息传递服务java-messaging-service-jms"></a>
### 3.6.1. Java消息传递服务（Java Messaging Service (JMS)）

<a href="#menu" style="float:right">目录</a>

<a id="markdown-3611-简介" name="3611-简介"></a>
#### 3.6.1.1. 简介
<a href="#menu" style="float:right">目录</a>

JMS即Java消息服务（Java Message Service）应用程序接口，是一个Java平台中关于面向消息中间件（MOM-分布式系统的集成）的API，用于在两个应用程序之间，或分布式系统中发送消息，进行异步通信。

JMS是一种与厂商无关的 API，用来访问消息收发系统消息，它类似于JDBC(Java Database Connectivity)。

<a id="markdown-3612-体系架构" name="3612-体系架构"></a>
#### 3.6.1.2. 体系架构
<a href="#menu" style="float:right">目录</a>

JMS由以下元素组成：

|||
|---|---|
|JMS提供者|连接面向消息中间件的，JMS接口的一个实现。提供者可以是Java平台的JMS实现，也可以是非Java平台的面向消息中间件的适配器。
|JMS客户|生产或消费基于消息的Java的应用程序或对象。
|JMS生产者|JMS生产者创建并发送消息的JMS客户。
|JMS消费者|接收消息的JMS客户。
|JMS消息|包括可以在JMS客户之间传递的数据的对象。
|JMS队列|一个容纳那些被发送的等待阅读的消息的区域。与队列名字所暗示的意思不同，消息的接受顺序并不一定要与消息的发送顺序相同。一旦一个消息被阅读，该消息将被从队列中移走。
|JMS主题|一种支持发送消息给多个订阅者的机制。

<a id="markdown-3613-jms对象模型" name="3613-jms对象模型"></a>
#### 3.6.1.3. JMS对象模型
<a href="#menu" style="float:right">目录</a>

![](https://images2018.cnblogs.com/blog/1182616/201805/1182616-20180528082100248-989741849.png)

|||
|---|---|
|ConnectionFactory|创建Connection对象的工厂，针对两种不同的JMS消息模型，分别有QueueConnectionFactory和TopicConnectionFactory两种。可以通过JNDI来查找ConnectionFactory对象。
|Connection|Connection表示在客户端和JMS系统之间建立的链接（对TCP/IP socket的包装）。Connection可以产生一个或多个Session。跟ConnectionFactory一样，Connection也有两种类型：QueueConnection和TopicConnection。
|Session|Session是操作消息的接口。可以通过session创建生产者、消费者、消息等。Session提供了事务的功能。当需要使用session发送/接收多个消息时，可以将这些发送/接收动作放到一个事务中。同样，也分QueueSession和TopicSession。
|MessageProducer|消息生产者由Session创建，并用于将消息发送到Destination。同样，消息生产者分两种类型：QueueSender和TopicPublisher。可以调用消息生产者的方法（send或publish方法）发送消息。
|MessageConsumer|消息消费者由Session创建，用于接收被发送到Destination的消息。两种类型：QueueReceiver和TopicSubscriber。可分别通过session的createReceiver(Queue)或createSubscriber(Topic)来创建。当然，也可以session的creatDurableSubscriber方法来创建持久化的订阅者。
|Destination|Destination的意思是消息生产者的消息发送目标或者说消息消费者的消息来源。对于消息生产者来说，它的Destination是某个队列（Queue）或某个主题（Topic）;对于消息消费者来说，它的Destination也是某个队列或主题（即消息来源）。

<a id="markdown-3614-jms消息模型" name="3614-jms消息模型"></a>
#### 3.6.1.4. JMS消息模型
<a href="#menu" style="float:right">目录</a>

在JMS标准中，有两种消息模型PTP（Point to Point）,Publish/Subscribe(Pub/Sub)。

**PTP模式-点对点消息传送模型**

在点对点消息传送模型中，应用程序由消息队列，发送者，接收者组成。每一个消息发送给一个特殊的消息队列，该队列保存了所有发送给它的消息(除了被接收者消费掉的和过期的消息)。

![](https://images2018.cnblogs.com/blog/1182616/201805/1182616-20180528082100568-1791719539.gif)
* PTP的特点
    * 每个消息只有一个消费者（Consumer）(即一旦被消费，消息就不再在消息队列中)。
    * 发送者和接收者之间在时间上没有依赖性，也就是说当发送者发送了消息之后，不管接收者有没有正在运行，它不会影响到消息被发送到队列。
    * 接收者在成功接收消息之后需向队列发送确认收到通知（acknowledgement）。

**Pub/Sub-发布/订阅消息传递模型**

在发布/订阅消息模型中，发布者发布一个消息，该消息通过topic传递给所有的客户端。在这种模型中，发布者和订阅者彼此不知道对方，是匿名的且可以动态发布和订阅topic。

在发布/订阅消息模型中，目的地被称为主题（topic），topic主要用于保存和传递消息，且会一直保存消息直到消息被传递给客户端。

![](https://images2018.cnblogs.com/blog/1182616/201805/1182616-20180528082100808-945786782.gif)
* Pub/Sub特点
    * 每个消息可以有多个消费者。
    * 发布者和订阅者之间有时间上的依赖性。针对某个主题（Topic）的订阅者，它必须创建一个或多个订阅者之后，才能消费发布者的消息，而且为了消费消息，订阅者必须保持运行的状态。
    * 为了缓和这样严格的时间相关性，JMS允许订阅者创建一个可持久化的订阅。这样，即使订阅者没有被激活（运行），它也能接收到发布者的消息。

<a id="markdown-3615-接收消息" name="3615-接收消息"></a>
#### 3.6.1.5. 接收消息
<a href="#menu" style="float:right">目录</a>

在JMS中，消息的接收可以使用以下两种方式：
|||
|---|---|
|同步|使用同步方式接收消息的话，消息订阅者调用receive()方法。在receive()中，消息未到达或在到达指定时间之前，方法会阻塞，直到消息可用。
|异步|使用异步方式接收消息的话，消息订阅者需注册一个消息监听者，类似于事件监听器，只要消息到达，JMS服务提供者会通过调用监听器的onMessage()递送消息。

<a id="markdown-3616-jms消息结构message" name="3616-jms消息结构message"></a>
#### 3.6.1.6. JMS消息结构（Message）
<a href="#menu" style="float:right">目录</a>

Message主要由三部分组成，分别是Header，Properties，Body， 详细如下：
|||
|---|---|
|Header|消息头，所有类型的这部分格式都是一样的
|Properties|属性，按类型可以分为应用设置的属性，标准属性和消息中间件定义的属性
|Body|消息正文，指我们具体需要消息传输的内容。

下面是Message接口的部分定义，它显示了JMS消息头使用的所有方法：

```JAVA
public interface Message {
    public Destination getJMSDestination() throws JMSException;
    public void setJMSDestination(Destination destination) throws JMSException;
    public int getJMSDeliveryMode() throws JMSException
    public void setJMSDeliveryMode(int deliveryMode) throws JMSException;
    public String getJMSMessageID() throws JMSException;
    public void setJMSMessageID(String id) throws JMSException;
    public long getJMSTimestamp() throws JMSException'
    public void setJMSTimestamp(long timestamp) throws JMSException;
    public long getJMSExpiration() throws JMSException;
    public void setJMSExpiration(long expiration) throws JMSException;
    public boolean getJMSRedelivered() throws JMSException;
    public void setJMSRedelivered(boolean redelivered) throws JMSException;
    public int getJMSPriority() throws JMSException;
    public void setJMSPriority(int priority) throws JMSException;
    public Destination getJMSReplyTo() throws JMSException;
    public void setJMSReplyTo(Destination replyTo) throws JMSException;
    public String getJMScorrelationID() throws JMSException;
    public void setJMSCorrelationID(String correlationID) throws JMSException;
    public byte[] getJMSCorrelationIDAsBytes() throws JMSException;
    public void setJMSCorrelationIDAsBytes(byte[] correlationID) throws JMSException;
    public String getJMSType() throws JMSException;
    public void setJMSType(String type) throws JMSException;
}
```

**Header**

header中的各个属性，可以分为两大类：

* 自动分配的消息头：

这里这些JMS消息头是自动分配的。

在传送消息时，消息头的值由JMS提供者来设置，因此开发者使用setJMSxxx()方法分配的值就被忽略了。换句话说，对于大多数自动分配的消息头来说，使用赋值函数方法显然是徒劳的。不过，这并非意味着开发者无法控制这些消息头的值。一些自动分配的消息头可以在创建Session和MessageProducer（也就是TopicPublisher）时，由开发者通过编程方式来设置。

|属性名称|说明  |设置者|
|---|---|---|
|JMSDeliveryMode|消息的发送模式，分为NON_PERSISTENT和PERSISTENT，即非持久性模式的和持久性模式。默认设置为PERSISTENT（持久性）。一条持久性消息应该被传送一次（就一次），这就意味着如果JMS提供者出现故障，该消息并不会丢失； 它会在服务器恢复正常之后再次传送。一条非持久性消息最多只会传送一次，这意味着如果JMS提供者出现故障，该消息可能会永久丢失。在持久性和非持久性这两种传送模式中，消息服务器都不会将一条消息向同一消息者发送一次以上（成功算一次）。//在消息生产者上设置JMS传送模式TopicPublishertopicPublisher = topicSession.createPublisher(topic);topicPubiisher.setDeliveryMode(DeliveryMode.NON_PERSISTENT);|send
|JMSMessageID|消息ID，需要以ID:开头，用于唯一地标识了一条消息|send
|JMSTimestamp|消息发送时的时间。这条消息头用于确定发送消息和它被消费者实际接收的时间间隔。时间戳是一个以毫秒来计算的Long类型时间值（自1970年1月1日算起）。|send
|JMSExpiration|消息的过期时间，以毫秒为单位，用来防止把过期的消息传送给消费者。任何直接通过编程方式来调用setJMSExpiration()方法都会被忽略。TopicPublisher topicPublisher = topicSession.createPublisher(topic);//将生存时间设置为1小时（1000毫秒 ＊60 ＊60）topicPublisher.setTimeToLive(3600000)|send
|JMSRedelivered|消息是否重复发送过，如果该消息之前发送过，那么这个属性的值需要被设置为true, 客户端可以根据这个属性的值来确认这个消息是否重复发送过，以避免重复处理。|Provider
|JMSPriority|消息的优先级,0-4为普通的优化级，而5-9为高优先级，通常情况下，高优化级的消息需要优先发送。任何直接通过编程方式调用setJMSPriority()方法都将被忽略。TopicPublisher topicPublisher = TopicSession.createPublisher(someTopic);//设置消息的优先级topicPublisher.setPriority(9);|send
|JMSDestination|消息发送的目的地，是一个Topic或Queue|send

**开发者分配的消息头：**
|属性名称|说明|设置者
|---|---|---|
|JMSCorrelationID|关联的消息ID，这个通常用在需要回传消息的时候|client
|JMSReplyTo|消息回复的目的地，其值为一个Topic或Queue, 这个由发送者设置，但是接收者可以决定是否响应|client
|JMSType|由消息发送者设置的消息类型，代表消息的结构，有的消息中间件可能会用到这个，但这个并不是是批消息的种类，比如TextMessage之类的|client

从上表中我们可以看到，系统提供的标准头信息一共有10个属性，其中有6个是由send方法在调用时设置的，有三个是由客户端（client）设置的，还有一个是由消息中间件（Provider）设置的。

需要注意的是，这里的客户端（client）不是指消费者，而是指使用JMS的客户端，即开发者所写的应用程序，即在生产消息时，这三个属性是可以由应用程序来设定的，而其它的header要么由消息中间件设置，要么由发送方法来决定，开发者即使设置了，也是无效的。测试如下：

生产者：
```java
//创建文本消息
TextMessage textMessage = session.createTextMessage("消息内容" + (i + 1 ));
//消息发送的目的地
textMessage.setJMSDestination(new Queue(){
    @Override
    public String getQueueName() throws JMSException {
        return name;
    }
});
//消息的发送模式
textMessage.setJMSDeliveryMode(DeliveryMode.NON_PERSISTENT);
//消息ID
textMessage.setJMSMessageID("ID:JMSMessageID");
//消息发送时的时间
textMessage.setJMSTimestamp(1000);
//关联的消息ID
textMessage.setJMSCorrelationID("100:JMSCorrelationID");
//消息回复的目的地
textMessage.setJMSReplyTo(new Queue(){
    @Override
    public String getQueueName() throws JMSException {
        return name;
    }
});
//消息是否重复发送过
textMessage.setJMSRedelivered(true);
//消息类型，代表消息的结构
textMessage.setJMSType("type");
//消息的过期时间，以毫秒为单位
textMessage.setJMSExpiration(36000);
//消息的优先级,0-4为普通的优化级，而5-9为高优先级
textMessage.setJMSPriority(5);
```


消费者：
```java

TextMessage msg = (TextMessage) messageConsumer.receive();
//获得消息的发送模式
int jmsDeliveryMode = msg.getJMSDeliveryMode();
//获得消息ID
String jmsMessageID = msg.getJMSMessageID();
//获得消息发送时的时间
Long jmsTimestamp = msg.getJMSTimestamp();
//获得关联的消息ID
String jmsCorrelationID = msg.getJMSCorrelationID();
//获得消息回复的目的地
String jmsReplyTo = ((Queue)msg.getJMSReplyTo()).getQueueName();
//获得消息是否重复发送过
Boolean jmsRedelivered = msg.getJMSRedelivered();
//获得消息类型，代表消息的结构
String jmsType = msg.getJMSType();
//获得消息的过期时间，以毫秒为单位
Long jmsExpiration = msg.getJMSExpiration();
//获得消息的优先级,0-4为普通的优化级，而5-9为高优先级
int jmsPriority = msg.getJMSPriority();
System.out.println("jmsDeliveryMode:" + jmsDeliveryMode);
System.out.println("jmsMessageID:" + jmsMessageID);
System.out.println("jmsTimestamp:" + jmsTimestamp);
System.out.println("jmsCorrelationID:" + jmsCorrelationID);
System.out.println("jmsReplyTo:" + jmsReplyTo);
System.out.println("jmsRedelivered:" + jmsRedelivered);
System.out.println("jmsType:" + jmsType);
System.out.println("jmsExpiration:" + jmsExpiration);
System.out.println("jmsPriority:" + jmsPriority);
System.out.println("----------------------------");
```


```java
public interface Message {
    public Destination getJMSDestination() throws JMSException;
    public void setJMSDestination(Destination destination) throws JMSException;
    public int getJMSDeliveryMode() throws JMSException
    public void setJMSDeliveryMode(int deliveryMode) throws JMSException;
    public String getJMSMessageID() throws JMSException;
    public void setJMSMessageID(String id) throws JMSException;
    public long getJMSTimestamp() throws JMSException'
    public void setJMSTimestamp(long timestamp) throws JMSException;
    public long getJMSExpiration() throws JMSException;
    public void setJMSExpiration(long expiration) throws JMSException;
    public boolean getJMSRedelivered() throws JMSException;
    public void setJMSRedelivered(boolean redelivered) throws JMSException;
    public int getJMSPriority() throws JMSException;
    public void setJMSPriority(int priority) throws JMSException;
    public Destination getJMSReplyTo() throws JMSException;
    public void setJMSReplyTo(Destination replyTo) throws JMSException;
    public String getJMScorrelationID() throws JMSException;
    public void setJMSCorrelationID(String correlationID) throws JMSException;
    public byte[] getJMSCorrelationIDAsBytes() throws JMSException;
    public void setJMSCorrelationIDAsBytes(byte[] correlationID) throws JMSException;
    public String getJMSType() throws JMSException;
    public void setJMSType(String type) throws JMSException;
}
```

**消息属性**

消息的属性就像可以分配给一条消息的附加消息头一样。它们允许开发者添加有关消息的不透明附加信息。它们还用于暴露消息选择器在消息过滤时使用的数据。

Message接口为读取和写入属性提供了若干个取值函数和赋值函数方法。消息的属性值可以是String, boolean , byte,short, double, int ,long或float型。Message接口为每种类型的属性值都提供了取值函数和赋值方法。如下：

```java
public interface Message {
    public String getStringProperty(String name) throws JMSException,MessageFormatException;
    public void setStringProperty(String name,String value) throws JMSException,MessageNotWriteableException;
    public int getIntProperty(String name) throws JMSException,MessageFormatException;
    public void setIntProperty(String name,int value) throws JMSException,MessageNotWriteableException;
    public boolean getBooleanProperty(String name) throws JMSException,MessageFormatException;
    public void setBooleanProperty(String name,boolean value) throws JMSException,MessageNotWriteableException;
    public double getDoubleProperty(String name) throws JMSException,MessageFormatException;
    public void setDoubleProperty(String name) throws JMSException,MessageFormatException;
    public float getFloatProperty (String name) throws JMSException,MessageFormatExdeption;
    public void setFloatProperty(String name,float value) throws JMSException,MessageNotWriteableException;
    public byte getByteProperty(String name) throws JMSException,MessageFormatException;
    public void setByteProperty(String name) throws JMSException,MessageNotWriteableException;
    public long getLongProperty(String name) throws JMSException,MessageNotWriteableException;
    public void setLongProperty(String name,long value) throws JMSException,MessageNotWriteableException;
    public short getShortProperty(String name) throws JMSException,MessageFormatException;
    public void setShortProperty(String name,short value) throws JMSException,MessageNotWriteableException;
    public Object getObjectProperty(String name) throws JMSException,MessageNotWriteableException;
    public void setObjectProperty(String name,Object value) throws JMSException,MessageNotWriteableException;
    ......
}
```
**应用程序特定的属性**

由应用程序开发者定义的所有属性都可以作为一个应用程序特定的属性。应用程序属性在消息传送之前进行设置。并不存在预先定义的应用程序属性，开发者可以自由定义能够满足它们需要的任何属性。例如，在一个应用中，可以添加一个特定的属性，该属性用于标识正在发送消息的用户：
```java
TextMessage message = pubSession.createTextMessage();

message.setStringProperty("username",username);//自定义属性

publisher.publish(message);
```
作为一个应用程序的特定属性，username一旦离开该应用程序就变得毫无意义，它专门用于应用程序根据发布者身份对消息进行过滤。

一旦一条消息发布或发送以后，它就变成了只读属性；消费者或生产者都无法修改它的属性。如果消费者试图设置某个属性，该方法就会抛出一个javax.jms.MessageNotWriteableException。

**JMS定义的属性**

JMS定义的属性具有和应用程序属性相同的特性，除了前者大多数在消息发送时由JMS提供者来设置之外。JMS定义的属性可以作为可选的JMS消息头，下面是JMS定义的9个属性清单：
* JMSXUserID
* JMSXAppID
* JMSXProducerTXID
* JMSXConsumerTXID
* JMSXRcvTimestamp
* JMSXDeliveryCount
* JMSXState
* JMSXGroupID
* JMSXGroupSeq

在这份清单中，只有JMSXGroupID和JMSXGroupSeq需要所有JMS提供者的支持。这些可选属性用于聚合消息。

请注意：在Message接口中，您将无法找到对应的setJMSX<PROPERTY>()和getJMSX<PROPERTY>()方法定义，在使用这些方法时，必须使用和应用程序特定属性相同的方法来设置它们，如下：
```java
message.setStringProperty("JMSXGroupID","GroupID-001");
message.setIntProperty("JMSXGroupSeq",5);
```
**提供者特定的属性**

每个JMS提供者都可以定义一组私有属性，这些属性可以由客户端或提供者自动设置。提供者特定的属性必须以前缀JMS开头，后面紧接着是属性名称（JMS<vendor-property-name>），例如：JMSUserID。提供者特定的属性，其作用就是支持厂商的私有特性。

**消息体××

为了适应不同场景下的消息，提高消息存储的灵活性，JMS定义了几种具体类型的消息，不同的子类型的消息体也不一样，需要注意的是，Message接口并没有提供一个统一的getBody之类的方法。消息子接口定义如下：
|||
|---|---|
|TextMessage|最简单的消息接口，用于发送文本类的消息，设置/获取其body的方法定义如下setText()/getText()。
|StreamMessage|流式消息接口，里面定义了一系列的对基本类型的set/get方法，消息发送者可以通过这些方法写入基本类型的数据，消息接收者需要按发送者的写入顺序来读取相应的数据。
|MapMessage|把消息内容存储在Map里，本接口定义了一系列对基本类型的的set/get方法，与StreamMessage不同的是，每个值都对应了一个相应的key，所以消息接收者不必按顺序去读取数据。
|ObjectMessage|将对象作为消息的接口，提供了一个set/get 对象的方法，需要注意的是只能设置一个对象，这个对象可以是一个Collection，但必须是序列化的。
|BytesMessage|以字节的形式来传递消息的接口，除了提供了对基本类型的set/get，还提供了按字节方式进行set/get。


<a id="markdown-362-高级消息队列协议advanced-message-queueing-protocol-amqp" name="362-高级消息队列协议advanced-message-queueing-protocol-amqp"></a>
### 3.6.2. 高级消息队列协议（Advanced Message Queueing Protocol (AMQP)）
<a href="#menu" style="float:right">目录</a>

<a id="markdown-3621-amqp-是什么" name="3621-amqp-是什么"></a>
#### 3.6.2.1. AMQP 是什么
<a href="#menu" style="float:right">目录</a>


AMQP（Advanced Message Queuing Protocol，高级消息队列协议）是一个进程间传递异步消息的网络协议。

<a id="markdown-3622-amqp模型" name="3622-amqp模型"></a>
#### 3.6.2.2. AMQP模型
<a href="#menu" style="float:right">目录</a>

![](https://img-blog.csdn.net/20181022113306601?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl8zNzY0MTgzMg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

**工作过程**
* 发布者（Publisher）发布消息（Message），经由交换机（Exchange）。
* 交换机根据路由规则将收到的消息分发给与该交换机绑定的队列（Queue）。
* 最后 AMQP 代理会将消息投递给订阅了此队列的消费者，或者消费者按照需求自行获取。

**深入理解**
* 发布者、交换机、队列、消费者都可以有多个。同时因为 AMQP 是一个网络协议，所以这个过程中的发布者，消费者，消息代理 可以分别存在于不同的设备上。
* 发布者发布消息时可以给消息指定各种消息属性（Message Meta-data）。有些属性有可能会被消息代理（Brokers）使用，然而其他的属性则是完全不透明的，它们只能被接收消息的应用所使用。
* 从安全角度考虑，网络是不可靠的，又或是消费者在处理消息的过程中意外挂掉，这样没有处理成功的消息就会丢失。基于此原因，AMQP 模块包含了一个消息确认（Message Acknowledgements）机制：当一个消息从队列中投递给消费者后，不会立即从队列中删除，直到它收到来自消费者的确认回执（Acknowledgement）后，才完全从队列中删除。
* 在某些情况下，例如当一个消息无法被成功路由时（无法从交换机分发到队列），消息或许会被返回给发布者并被丢弃。或者，如果消息代理执行了延期操作，消息会被放入一个所谓的死信队列中。此时，消息发布者可以选择某些参数来处理这些特殊情况。

<a id="markdown-3623-exchange交换机" name="3623-exchange交换机"></a>
#### 3.6.2.3. Exchange交换机
<a href="#menu" style="float:right">目录</a>
交换机是用来发送消息的 AMQP 实体。
交换机拿到一个消息之后将它路由给一个或零个队列。
它使用哪种路由算法是由交换机类型和绑定（Bindings）规则所决定的。

AMQP 0-9-1 的代理提供了四种交换机：
* diect
* fanout
* topic
* header

---

* 交换机可以有两个状态：持久（durable）、暂存（transient）。
    * 持久化的交换机会在消息代理（broker）重启后依旧存在
    * 暂存的交换机则不会（它们需要在代理再次上线后重新被声明）。
    
**默认交换机**
默认交换机（default exchange）实际上是一个由消息代理预先声明好的没有名字（名字为空字符串）的直连交换机（direct exchange）。

它有一个特殊的属性使得它对于简单应用特别有用处：那就是每个新建队列（queue）都会自动绑定到默认交换机上，绑定的路由键（routing key）名称与队列名称相同。

举个栗子：当你声明了一个名为 “search-indexing-online” 的队列，AMQP 代理会自动将其绑定到默认交换机上，绑定（binding）的路由键名称也是为 “search-indexing-online”。因此，当携带着名为 “search-indexing-online” 的路由键的消息被发送到默认交换机的时候，此消息会被默认交换机路由至名为 “search-indexing-online” 的队列中。换句话说，默认交换机看起来貌似能够直接将消息投递给队列，尽管技术上并没有做相关的操作。

**直连交换机**
直连型交换机（direct exchange）是根据消息携带的路由键（routing key）将消息投递给对应绑定键的队列。直连交换机用来处理消息的单播路由（unicast routing）（尽管它也可以处理多播路由）。下边介绍它是如何工作的：

1）将一个队列绑定到某个交换机上时，赋予该绑定一个绑定键（Binding Key），假设为R；
2）当一个携带着路由键（Routing Key）为R的消息被发送给直连交换机时，交换机会把它路由给绑定键为R的队列。

直连交换机的队列通常是循环分发任务给多个消费者（我们称之为轮询）。比如说有3个消费者，4个任务。分别分发每个消费者一个任务后，第4个任务又分发给了第一个消费者。综上，我们很容易得出一个结论，在 AMQP 0-9-1 中，消息的负载均衡是发生在消费者（consumer）之间的，而不是队列（queue）之间。

直连型交换机图例：
![](https://img-blog.csdn.net/20181022130416336?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl8zNzY0MTgzMg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
当生产者（P）发送消息时 Rotuing key=booking 时，这时候将消息传送给 Exchange，Exchange 获取到生产者发送过来消息后，会根据自身的规则进行与匹配相应的 Queue，这时发现 Queue1 和 Queue2 都符合，就会将消息传送给这两个队列。

如果我们以 Rotuing key=create 和 Rotuing key=confirm 发送消息时，这时消息只会被推送到 Queue2 队列中，其他 Routing Key 的消息将会被丢弃。

**扇型交换机**
扇型交换机（funout exchange）将消息路由给绑定到它身上的所有队列，而不理会绑定的路由键。如果 N 个队列绑定到某个扇型交换机上，当有消息发送给此扇型交换机时，交换机会将消息的拷贝分别发送给这所有的 N 个队列。扇型用来交换机处理消息的广播路由（broadcast routing）。

因为扇型交换机投递消息的拷贝到所有绑定到它的队列，所以他的应用案例都极其相似：

大规模多用户在线（MMO）游戏可以使用它来处理排行榜更新等全局事件
体育新闻网站可以用它来近乎实时地将比分更新分发给移动客户端
分发系统使用它来广播各种状态和配置更新
在群聊的时候，它被用来分发消息给参与群聊的用户。（AMQP 没有内置 presence 的概念，因此 XMPP 可能会是个更好的选择）
扇型交换机图例：
![](https://img-blog.csdn.net/20181022130646170?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl8zNzY0MTgzMg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
上图所示，生产者（P）生产消息 1 将消息 1 推送到 Exchange，由于 Exchange Type=fanout 这时候会遵循 fanout 的规则将消息推送到所有与它绑定 Queue，也就是图上的两个 Queue 最后两个消费者消费。

**主题交换机**
![](https://img-blog.csdn.net/20181022131252616?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl8zNzY0MTgzMg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
前面提到的 direct 规则是严格意义上的匹配，换言之 Routing Key 必须与 Binding Key 相匹配的时候才将消息传送给 Queue.

而Topic 的路由规则是一种模糊匹配，可以通过通配符满足一部分规则就可以传送。

它的约定是：

1）binding key 中可以存在两种特殊字符 “” 与“#”，用于做模糊匹配，其中 “” 用于匹配一个单词，“#”用于匹配多个单词（可以是零个）

2）routing key 为一个句点号 “.” 分隔的字符串（我们将被句点号 “. ” 分隔开的每一段独立的字符串称为一个单词），如“stock.usd.nyse”、“nyse.vmw”、“quick.orange.rabbit”
binding key 与 routing key 一样也是句点号 “.” 分隔的字符串

主题交换机图例：

当生产者发送消息 Routing Key=F.C.E 的时候，这时候只满足 Queue1，所以会被路由到 Queue 中，如果 Routing Key=A.C.E 这时候会被同是路由到 Queue1 和 Queue2 中，如果 Routing Key=A.F.B 时，这里只会发送一条消息到 Queue2 中。

主题交换机拥有非常广泛的用户案例。无论何时，当一个问题涉及到那些想要有针对性的选择需要接收消息的 多消费者 / 多应用（multiple consumers/applications） 的时候，主题交换机都可以被列入考虑范围。

使用案例：

分发有关于特定地理位置的数据，例如销售点
由多个工作者（workers）完成的后台任务，每个工作者负责处理某些特定的任务
股票价格更新（以及其他类型的金融数据更新）
涉及到分类或者标签的新闻更新（例如，针对特定的运动项目或者队伍）
云端的不同种类服务的协调
分布式架构 / 基于系统的软件封装，其中每个构建者仅能处理一个特定的架构或者系统。

**头交换机**
headers 类型的 Exchange 不依赖于 routing key 与 binding key 的匹配规则来路由消息，而是根据发送的消息内容中的 headers 属性进行匹配。

头交换机可以视为直连交换机的另一种表现形式。但直连交换机的路由键必须是一个字符串，而头属性值则没有这个约束，它们甚至可以是整数或者哈希值（字典）等。灵活性更强（但实际上我们很少用到头交换机）。工作流程：

1）绑定一个队列到头交换机上时，会同时绑定多个用于匹配的头（header）。
2）传来的消息会携带header，以及会有一个 “x-match” 参数。当 “x-match” 设置为 “any” 时，消息头的任意一个值被匹配就可以满足条件，而当 “x-match” 设置为 “all” 的时候，就需要消息头的所有值都匹配成功。

交换机小结
|类型名称|路由规则|
|---|---|
|Default|	自动命名的直交换机
|Direct|	Routing Key==Binding Key，严格匹配
|Fanout|	把发送到该 Exchange 的消息路由到所有与它绑定的 Queue 中
|Topic|	Routing Key==Binding Key，模糊匹配
|Headers|	根据发送的消息内容中的 headers 属性进行匹配

<a id="markdown-3624-queue队列" name="3624-queue队列"></a>
#### 3.6.2.4. Queue队列
<a href="#menu" style="float:right">目录</a>

AMQP 中的队列（queue）跟其他消息队列或任务队列中的队列是很相似的：它们存储着即将被应用消费掉的消息。

**队列属性**
队列跟交换机共享某些属性，但是队列也有一些另外的属性。
* Name
* Durable（消息代理重启后，队列依旧存在）
* Exclusive（只被一个连接（connection）使用，而且当连接关闭后队列即被删除）
* Auto-delete（当最后一个消费者退订后即被删除）
* Arguments（一些消息代理用他来完成类似与 TTL 的某些额外功能）

**队列创建**
队列在声明（declare）后才能被使用。如果一个队列尚不存在，声明一个队列会创建它。如果声明的队列已经存在，并且属性完全相同，那么此次声明不会对原有队列产生任何影响。如果声明中的属性与已存在队列的属性有差异，那么一个错误代码为 406 的通道级异常就会被抛出。

**队列持久化**
持久化队列（Durable queues）会被存储在磁盘上，当消息代理（broker）重启的时候，它依旧存在。没有被持久化的队列称作暂存队列（Transient queues）。并不是所有的场景和案例都需要将队列持久化。

持久化的队列并不会使得路由到它的消息也具有持久性。倘若消息代理挂掉了，重新启动，那么在重启的过程中持久化队列会被重新声明，无论怎样，只有经过持久化的消息才能被重新恢复。

<a id="markdown-3625-consumer消费者" name="3625-consumer消费者"></a>
#### 3.6.2.5. Consumer消费者
<a href="#menu" style="float:right">目录</a>

消息如果只是存储在队列里是没有任何用处的。被应用消费掉，消息的价值才能够体现。在 AMQP 0-9-1 模型中，有两种途径可以达到此目的：

1）将消息投递给应用 (“push API”)
2）应用根据需要主动获取消息 (“pull API”)

使用 push API，应用（application）需要明确表示出它在某个特定队列里所感兴趣的，想要消费的消息。如是，我们可以说应用注册了一个消费者，或者说订阅了一个队列。一个队列可以注册多个消费者，也可以注册一个独享的消费者（当独享消费者存在时，其他消费者即被排除在外）。

每个消费者（订阅者）都有一个叫做消费者标签的标识符。它可以被用来退订消息。消费者标签实际上是一个字符串。

<a id="markdown-3626-消息机制" name="3626-消息机制"></a>
#### 3.6.2.6. 消息机制
<a href="#menu" style="float:right">目录</a>


**消息确认**
消费者应用（Consumer applications） - 用来接受和处理消息的应用 - 在处理消息的时候偶尔会失败或者有时会直接崩溃掉。而且网络原因也有可能引起各种问题。这就给我们出了个难题，AMQP 代理在什么时候删除消息才是正确的？AMQP 0-9-1 规范给我们两种建议：

1）自动确认模式：当消息代理（broker）将消息发送给应用后立即删除。（使用 AMQP 方法：basic.deliver 或 basic.get-ok）)
2）显式确认模式：待应用（application）发送一个确认回执（acknowledgement）后再删除消息。（使用 AMQP 方法：basic.ack）

如果一个消费者在尚未发送确认回执的情况下挂掉了，那 AMQP 代理会将消息重新投递给另一个消费者。如果当时没有可用的消费者了，消息代理会死等下一个注册到此队列的消费者，然后再次尝试投递。

**拒绝消息**
当一个消费者接收到某条消息后，处理过程有可能成功，有可能失败。应用可以向消息代理表明，本条消息由于 “拒绝消息（Rejecting Messages）” 的原因处理失败了（或者未能在此时完成）。

当拒绝某条消息时，应用可以告诉消息代理如何处理这条消息——销毁它或者重新放入队列。

当此队列只有一个消费者时，请确认不要由于拒绝消息并且选择了重新放入队列的行为而引起消息在同一个消费者身上无限循环的情况发生。

在 AMQP 中，basic.reject 方法用来执行拒绝消息的操作。但 basic.reject 有个限制：你不能使用它决绝多个带有确认回执（acknowledgements）的消息。但是如果你使用的是 RabbitMQ，那么你可以使用被称作 negative acknowledgements（也叫 nacks）的 AMQP 0-9-1 扩展来解决这个问题。

**预取消息**
在多个消费者共享一个队列的案例中，明确指定在收到下一个确认回执前每个消费者一次可以接受多少条消息是非常有用的。这可以在试图批量发布消息的时候起到简单的负载均衡和提高消息吞吐量的作用。For example, if a producing application sends messages every minute because of the nature of the work it is doing.（？？？例如，如果生产应用每分钟才发送一条消息，这说明处理工作尚在运行。）

注意，RabbitMQ 只支持通道级的预取计数，而不是连接级的或者基于大小的预取。

**消息属性**
AMQP 模型中的消息（Message）对象是带有属性（Attributes）的。有些属性及其常见，以至于 AMQP 0-9-1 明确的定义了它们，并且应用开发者们无需费心思思考这些属性名字所代表的具体含义。例如：

* Content type（内容类型）
* Content encoding（内容编码）
* Routing key（路由键）
* Delivery mode (persistent or not)
* 投递模式（持久化 或 非持久化）
* Message priority（消息优先权）
* Message publishing timestamp（消息发布的时间戳）
* Expiration period（消息有效期）
* Publisher application id（发布应用的 ID）

有些属性是被 AMQP 代理所使用的，但是大多数是开放给接收它们的应用解释器用的。有些属性是可选的也被称作消息头（headers）。他们跟 HTTP 协议的 X-Headers 很相似。消息属性需要在消息被发布的时候定义。

**消息主体**
AMQP 的消息除属性外，也含有一个有效载荷 - Payload（消息实际携带的数据），它被 AMQP 代理当作不透明的字节数组来对待。

消息代理不会检查或者修改有效载荷。消息可以只包含属性而不携带有效载荷。它通常会使用类似 JSON 这种序列化的格式数据，为了节省，协议缓冲器和 MessagePack 将结构化数据序列化，以便以消息的有效载荷的形式发布。AMQP 及其同行者们通常使用 “content-type” 和 “content-encoding” 这两个字段来与消息沟通进行有效载荷的辨识工作，但这仅仅是基于约定而已。

**消息持久化**
消息能够以持久化的方式发布，AMQP 代理会将此消息存储在磁盘上。如果服务器重启，系统会确认收到的持久化消息未丢失。

简单地将消息发送给一个持久化的交换机或者路由给一个持久化的队列，并不会使得此消息具有持久化性质：它完全取决与消息本身的持久模式（persistence mode）。将消息以持久化方式发布时，会对性能造成一定的影响（就像数据库操作一样，健壮性的存在必定造成一些性能牺牲）。

<a id="markdown-3627-其他" name="3627-其他"></a>
#### 3.6.2.7. 其他
<a href="#menu" style="float:right">目录</a>


* 连接
    * AMQP 连接通常是长连接。AMQP 是一个使用 TCP 提供可靠投递的应用层协议。AMQP 使用认证机制并且提供 TLS（SSL）保护。当一个应用不再需要连接到 AMQP 代理的时候，需要优雅的释放掉 AMQP 连接，而不是直接将 TCP 连接关闭。
* 通道
    * 有些应用需要与 AMQP 代理建立多个连接。无论怎样，同时开启多个 TCP 连接都是不合适的，因为这样做会消耗掉过多的系统资源并且使得防火墙的配置更加困难。AMQP 0-9-1 提供了通道（channels）来处理多连接，可以把通道理解成共享一个 TCP 连接的多个轻量化连接。
    * 在涉及多线程 / 进程的应用中，为每个线程 / 进程开启一个通道（channel）是很常见的，并且这些通道不能被线程 / 进程共享。
    * 一个特定通道上的通讯与其他通道上的通讯是完全隔离的，因此每个 AMQP 方法都需要携带一个通道号，这样客户端就可以指定此方法是为哪个通道准备的。

* 虚拟主机
    * 为了在一个单独的代理上实现多个隔离的环境（用户、用户组、交换机、队列 等），AMQP 提供了一个虚拟主机（virtual hosts - vhosts）的概念。这跟 Web servers 虚拟主机概念非常相似，这为 AMQP 实体提供了完全隔离的环境。当连接被建立的时候，AMQP 客户端来指定使用哪个虚拟主机。

* AMQP 是可扩展的
    * AMQP 0-9-1 拥有多个扩展点：
        * 定制化交换机类型：可以让开发者们实现一些开箱即用的交换机类型尚未很好覆盖的路由方案。例如 geodata-based routing。)
        * 交换机和队列的声明中可以包含一些消息代理能够用到的额外属性。例如 RabbitMQ 中的 per-queue message TTL 即是使用该方式实现。)
        * 特定消息代理的协议扩展。例如 RabbitMQ 所实现的扩展。新的 AMQP 0-9-1 方法类可被引入。)
        * 消息代理可以被其他的插件扩展，例如 RabbitMQ 的管理前端 和 已经被插件化的 HTTP API。

这些特性使得 AMQP 0-9-1 模型更加灵活，并且能够适用于解决更加宽泛的问题。

**AMQP 0-9-1 客户端生态系统**
AMQP 0-9-1 拥有众多的适用于各种流行语言和框架的客户端。其中一部分严格遵循 AMQP 规范，提供 AMQP 方法的实现。另一部分提供了额外的技术，方便使用的方法和抽象。有些客户端是异步的（非阻塞的），有些是同步的（阻塞的），有些将这两者同时实现。有些客户端支持 “供应商的特定扩展”（例如 RabbitMQ 的特定扩展）。

因为 AMQP 的主要目标之一就是实现交互性，所以对于开发者来讲，了解协议的操作方法而不是只停留在弄懂特定客户端的库就显得十分重要。这样一来，开发者使用不同类型的库与协议进行沟通时就会容易的多。

<a id="markdown-363-消息队列遥测传输message-queueing-telemetry-transport-mqtt" name="363-消息队列遥测传输message-queueing-telemetry-transport-mqtt"></a>
### 3.6.3. 消息队列遥测传输（Message Queueing Telemetry Transport (MQTT)）
<a href="#menu" style="float:right">目录</a>

<a id="markdown-3631-简述" name="3631-简述"></a>
#### 3.6.3.1. 简述
MQTT（Message Queuing Telemetry Transport，消息队列遥测传输协议），是一种基于发布/订阅（publish/subscribe）模式的"轻量级"通讯协议，该协议构建于TCP/IP协议上，由IBM在1999年发布。MQTT最大优点在于，可以以极少的代码和有限的带宽，为连接远程设备提供实时可靠的消息服务。作为一种低开销、低带宽占用的即时通讯协议，使其在物联网、小型设备、移动应用等方面有较广泛的应用。

MQTT是一个基于客户端-服务器的消息发布/订阅传输协议。MQTT协议是轻量、简单、开放和易于实现的，这些特点使它适用范围非常广泛。在很多情况下，包括受限的环境中，如：机器与机器（M2M）通信和物联网（IoT）。其在，通过卫星链路通信传感器、偶尔拨号的医疗设备、智能家居、及一些小型化设备中已广泛使用。

![](https://static.runoob.com/images/mix/mqtt-fidge-2.svg)

<a id="markdown-3632-设计规范" name="3632-设计规范"></a>
#### 3.6.3.2. 设计规范
由于物联网的环境是非常特别的，所以MQTT遵循以下设计原则：
* 精简，不添加可有可无的功能；
* 发布/订阅（Pub/Sub）模式，方便消息在传感器之间传递；
* 允许用户动态创建主题，零运维成本；
* 把传输量降到最低以提高传输效率；
* 把低带宽、高延迟、不稳定的网络等因素考虑在内；
* 支持连续的会话控制；
* 理解客户端计算能力可能很低；
* 提供服务质量管理；
* 假设数据不可知，不强求传输数据的类型与格式，保持灵活性。

<a id="markdown-3633-主要特性" name="3633-主要特性"></a>
#### 3.6.3.3. 主要特性
MQTT协议工作在低带宽、不可靠的网络的远程传感器和控制设备通讯而设计的协议，它具有以下主要的几项特性：
* 使用发布/订阅消息模式，提供一对多的消息发布，解除应用程序耦合。这一点很类似于XMPP，但是MQTT的信息冗余远小于XMPP，因为XMPP使用XML格式文本来传递数据。
* 对负载内容屏蔽的消息传输。
* 使用TCP/IP提供网络连接。
主流的MQTT是基于TCP连接进行数据推送的，但是同样有基于UDP的版本，叫做MQTT-SN。这两种版本由于基于不同的连接方式，优缺点自然也就各有不同了。
* 有三种消息发布服务质量：
    * "至多一次"，消息发布完全依赖底层TCP/IP网络。会发生消息丢失或重复。这一级别可用于如下情况，环境传感器数据，丢失一次读记录无所谓，因为不久后还会有第二次发送。这一种方式主要普通APP的推送，倘若你的智能设备在消息推送时未联网，推送过去没收到，再次联网也就收不到了。
    * "至少一次"，确保消息到达，但消息重复可能会发生。
    * "只有一次"，确保消息到达一次。在一些要求比较严格的计费系统中，可以使用此级别。在计费系统中，消息重复或丢失会导致不正确的结果。这种最高质量的消息发布服务还可以用于即时通讯类的APP的推送，确保用户收到且只会收到一次。
* 小型传输，开销很小（固定长度的头部是2字节），协议交换最小化，以降低网络流量。
这就是为什么在介绍里说它非常适合"在物联网领域，传感器与服务器的通信，信息的收集"，要知道嵌入式设备的运算能力和带宽都相对薄弱，使用这种协议来传递消息再适合不过了。
* 使用Last Will和Testament特性通知有关各方客户端异常中断的机制。
    * Last Will：即遗言机制，用于通知同一主题下的其他设备发送遗言的设备已经断开了连接。
    * Testament：遗嘱机制，功能类似于Last Will。

<a id="markdown-3634-mqtt协议原理" name="3634-mqtt协议原理"></a>
#### 3.6.3.4. MQTT协议原理
* MQTT协议实现方式
实现MQTT协议需要客户端和服务器端通讯完成，在通讯过程中，MQTT协议中有三种身份：发布者（Publish）、代理（Broker）（服务器）、订阅者（Subscribe）。其中，消息的发布者和订阅者都是客户端，消息代理是服务器，消息发布者可以同时是订阅者。

* MQTT传输的消息分为：主题（Topic）和负载（payload）两部分：
    * Topic，可以理解为消息的类型，订阅者订阅（Subscribe）后，就会收到该主题的消息内容（payload）；
    * payload，可以理解为消息的内容，是指订阅者具体要使用的内容。
* 网络传输与应用消息
MQTT会构建底层网络传输：它将建立客户端到服务器的连接，提供两者之间的一个有序的、无损的、基于字节流的双向传输。
当应用数据通过MQTT网络发送时，MQTT会把与之相关的服务质量（QoS）和主题名（Topic）相关连。
* MQTT客户端
    * 一个使用MQTT协议的应用程序或者设备，它总是建立到服务器的网络连接。客户端可以：
        * 发布其他客户端可能会订阅的信息；
        * 订阅其它客户端发布的消息；
        * 退订或删除应用程序的消息；
        * 断开与服务器连接。

**MQTT服务器**
* MQTT服务器以称为"消息代理"（Broker），可以是一个应用程序或一台设备。它是位于消息发布者和订阅者之间，它可以：
    * 接受来自客户的网络连接；
    * 接受客户发布的应用信息；
    * 处理来自客户端的订阅和退订请求；
    * 向订阅的客户转发应用程序消息。

**MQTT协议中的订阅、主题、会话**
* 订阅（Subscription）
    * 订阅包含主题筛选器（Topic Filter）和最大服务质量（QoS）。订阅会与一个会话（Session）关联。一个会话可以包含多个订阅。每一个会话中的每个订阅都有一个不同的主题筛选器。
* 会话（Session）
    * 每个客户端与服务器建立连接后就是一个会话，客户端和服务器之间有状态交互。会话存在于一个网络之间，也可能在客户端和服务器之间跨越多个连续的网络连接。
* 主题名（Topic Name）
    * 连接到一个应用程序消息的标签，该标签与服务器的订阅相匹配。服务器会将消息发送给订阅所匹配标签的每个客户端。

**主题筛选器（Topic Filter）**
* 一个对主题名通配符筛选器，在订阅表达式中使用，表示订阅所匹配到的多个主题。


**负载（Payload)**
消息订阅者所具体接收的内容。

**MQTT协议中的方法**
MQTT协议中定义了一些方法（也被称为动作），来于表示对确定资源所进行操作。这个资源可以代表预先存在的数据或动态生成数据，这取决于服务器的实现。通常来说，资源指服务器上的文件或输出。主要方法有：
* Connect。等待与服务器建立连接。
* Disconnect。等待MQTT客户端完成所做的工作，并与服务器断开TCP/IP会话。
* Subscribe。等待完成订阅。
* UnSubscribe。等待服务器取消客户端的一个或多个topics订阅。
* Publish。MQTT客户端发送消息请求，发送完成后返回应用程序线程。

<a id="markdown-3635-mqtt协议数据包结构" name="3635-mqtt协议数据包结构"></a>
#### 3.6.3.5. MQTT协议数据包结构
在MQTT协议中，一个MQTT数据包由：固定头（Fixed header）、可变头（Variable header）、消息体（payload）三部分构成。MQTT数据包结构如下：
* 固定头（Fixed header）。存在于所有MQTT数据包中，表示数据包类型及数据包的分组类标识。
* 可变头（Variable header）。存在于部分MQTT数据包中，数据包类型决定了可变头是否存在及其具体内容。
* 消息体（Payload）。存在于部分MQTT数据包中，表示客户端收到的具体内容。

**MQTT固定头**
固定头存在于所有MQTT数据包中，其结构如下：

**MQTT数据包类型**

位置：Byte 1中bits 7-4。
相于一个4位的无符号值，类型、取值及描述如下：

**标识位**

位置：Byte 1中bits 3-0。
在不使用标识位的消息类型中，标识位被作为保留位。如果收到无效的标志时，接收端必须关闭网络连接：

* DUP：发布消息的副本。用来在保证消息的可靠传输，如果设置为1，则在下面的变长中增加MessageId，并且需要回复确认，以保证消息传输完成，但不能用于检测消息重复发送。
* QoS：发布消息的服务质量，即：保证消息传递的次数
    * 000：最多一次，即：<=1
    * 001：至少一次，即：>=1
    * 010：一次，即：=1
    * 011：预留
* RETAIN： 发布保留标识，表示服务器要保留这次推送的信息，如果有新的订阅者出现，就把这消息推送给它，如果设有那么推送至当前订阅者后释放。 5.1.3 剩余长度（Remaining Length）
地址：Byte 2。

固定头的第二字节用来保存变长头部和消息体的总大小的，但不是直接保存的。这一字节是可以扩展，其保存机制，前7位用于保存长度，后一部用做标识。当最后一位为1时，表示长度不足，需要使用二个字节继续保存。例如：计算出后面的大小为0

**MQTT可变头**
MQTT数据包中包含一个可变头，它驻位于固定的头和负载之间。可变头的内容因数据包类型而不同，较常的应用是作为包的标识：
很多类型数据包中都包括一个2字节的数据包标识字段，这些类型的包有：PUBLISH (QoS > 0)、PUBACK、PUBREC、PUBREL、PUBCOMP、SUBSCRIBE、SUBACK、UNSUBSCRIBE、UNSUBACK。

**Payload消息体**
Payload消息体位MQTT数据包的第三部分，包含CONNECT、SUBSCRIBE、SUBACK、UNSUBSCRIBE四种类型的消息：
* CONNECT，消息体内容主要是：客户端的ClientID、订阅的Topic、Message以及用户名和密码。
* SUBSCRIBE，消息体内容是一系列的要订阅的主题以及QoS。
* SUBACK，消息体内容是服务器对于SUBSCRIBE所申请的主题及QoS进行确认和回复。
* UNSUBSCRIBE，消息体内容是要订阅的主题。

<a id="markdown-37-面试准备" name="37-面试准备"></a>
## 3.7. 面试准备

说说你们公司线上生产环境用的是什么消息中间件?
那你们线上系统是有哪些技术挑战，为什么必须要在系统里引入消息中间件?
你们的消息中间件技术选型为什么是RabbitMQ?
为什么不用RocketMQ或者是Kafka?技术选型的依据是什么?
你们怎么保证消息中间件的高可用性?避免消息中间件故障后引发系统整体故障?
使用消息中间件技术的时候，你们怎么保证投递出去的消息一定不会丢失?
你们怎么保证投递出去的消息只有一条且仅仅一条，不会出现重复的数据?
如果消费了重复的消息怎么保证数据的准确性?
你们线上业务用消息中间件的时候，是否需要保证消息的顺序性?
如果不需要保证消息顺序，为什么不需要?假如我有一个场景要保证消息的顺序，你们应该如何保证?
下游消费系统如果宕机了，导致几百万条消息在消息中间件里积压，此时怎么处理?
你们线上是否遇到过消息积压的生产故障?如果没遇到过，你考虑一下如何应对?
你们用的是RabbitMQ?那你说说RabbitMQ的底层架构原理，逻辑架构、物理架构以及数据持久化机制?
你们RabbitMQ的最高峰QPS每秒是多少?线上如何部署的，部署了多少台机器，机器的配置如何?
你们用的是Kafka?那你说说Kafka的底层架构原理，磁盘上数据如何存储的，整体分布式架构是如何实现的?
再说说Kafka是如何保证数据的高容错性的?零拷贝等技术是如何运用的?高吞吐量下如何优化生产者和消费者的性能?
看过Kafka的源码没有。如果看过，说说你对Kafka源码的理解?
你们用的是RocketMQ?RocketMQ很大的一个特点是对分布式事务的支持，你说说他在分布式事务支持这块机制的底层原理?
RocketMQ的源码看过么，聊聊你对RocketMQ源码的理解?
如果让你来动手实现一个分布式消息中间件，整体架构你会如何设计实现?