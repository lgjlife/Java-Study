
<span id="menu"></span>
<!-- TOC -->

- [1. WEB相关](#1-web相关)
    - [1.1. Servlet规范](#11-servlet规范)
    - [1.2. Session和Cookie的区别](#12-session和cookie的区别)
        - [1.2.1. 概念理解](#121-概念理解)
        - [1.2.2. cookie](#122-cookie)
        - [1.2.3. Session](#123-session)
        - [1.2.4. 总结](#124-总结)
        - [1.2.5. 应用场景](#125-应用场景)
    - [1.3. SpringBoot WEB相关配置](#13-springboot-web相关配置)
    - [1.4. 短网址生成方案](#14-短网址生成方案)
        - [1.4.1. 实现思路](#141-实现思路)
        - [1.4.2. 进制转换](#142-进制转换)
    - [1.5. WEB容器](#15-web容器)
    - [1.6. Tomcat](#16-tomcat)
        - [1.6.1. 概述](#161-概述)
            - [1.6.1.1. Tomcat快速理解](#1611-tomcat快速理解)
        - [1.6.2. Web服务机制](#162-web服务机制)
            - [1.6.2.1. 通信协议](#1621-通信协议)
        - [1.6.3. Tomcat 总体架构](#163-tomcat-总体架构)
        - [1.6.4. Server和Service组件](#164-server和service组件)
        - [1.6.5. Connect组件](#165-connect组件)
        - [1.6.6. Engine组件](#166-engine组件)
        - [1.6.7. Host容器](#167-host容器)
        - [1.6.8. Context容器](#168-context容器)
        - [1.6.9. Wrapper容器](#169-wrapper容器)
        - [1.6.10. 生命周期管理](#1610-生命周期管理)
        - [1.6.11. 日志框架和国家化](#1611-日志框架和国家化)
        - [1.6.12. 公共与隔离类加载器](#1612-公共与隔离类加载器)
        - [1.6.13. 请求URI映射器Mapper](#1613-请求uri映射器mapper)
        - [1.6.14. Tomcat的JNDI](#1614-tomcat的jndi)
        - [1.6.15. 运行、通信、及访问安全管理](#1615-运行通信及访问安全管理)
        - [1.6.16. 处理请求和响应的管道](#1616-处理请求和响应的管道)
        - [1.6.17. 多样化的会话管理器](#1617-多样化的会话管理器)
        - [1.6.18. 高可用集群实现](#1618-高可用集群实现)
        - [1.6.19. 集群通信框架](#1619-集群通信框架)
        - [1.6.20. 监控和管理](#1620-监控和管理)
    - [1.7. Jetty](#17-jetty)
    - [1.8. 编码问题](#18-编码问题)
        - [1.8.1. 常见的编码格式](#181-常见的编码格式)

<!-- /TOC -->


# 1. WEB相关

## 1.1. Servlet规范
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

## 1.2. Session和Cookie的区别

### 1.2.1. 概念理解

首先呢，要了解session和cookie的区别先要了解以下几个概念：

1、无状态的HTTP协议：
协议，是指计算机通信网络中两台计算机之间进行通信所必须共同遵守的规定或规则，超文本传输协议(HTTP)是一种通信协议，它允许将超文本标记语言(HTML)文档从Web服务器
传送到客户端的浏览器。
HTTP协议是无状态的协议。一旦数据交换完毕，客户端与服务器端的连接就会关闭，再次交换数据需要建立新的连接。这就意味着服务器无法从连接上跟踪会话。

2、会话（Session）跟踪：
会话，指用户登录网站后的一系列动作，比如浏览商品添加到购物车并购买。会话（Session）跟踪是Web程序中常用的技术，用来跟踪用户的整个会话。常用的会话跟踪技术是Cookie与Session。Cookie通过在客户端记录信息确定用户身份，Session通过在服务器端记录信息确定用户身份。

### 1.2.2. cookie

由于HTTP是一种无状态的协议，服务器单从网络连接上无从知道客户身份。用户A购买了一件商品放入购物车内，当再次购买商品时服务器已经无法判断该购买行为是属于用户A的会话还是用户B的会话了。怎么办呢？就给客户端们颁发一个通行证吧，每人一个，无论谁访问都必须携带自己通行证。这样服务器就能从通行证上确认客户身份了。这就是Cookie 的工作原理。

Cookie实际上是一小段的文本信息。客户端请求服务器，如果服务器需要记录该用户状态，就使用response向客户端浏览器颁发一个Cookie。客户端会把Cookie保存起来。当浏览器再请求该网站时，浏览器把请求的网址连同该Cookie一同提交给服务器。服务器检查该Cookie，以此来辨认用户状态。服务器还可以根据需要修改Cookie的内容。

1、会话Cookie和持久Cookie
若不设置过期时间，则表示这个cookie的生命期为浏览器会话期间，关闭浏览器窗口，cookie就消失。这种生命期为浏览器会话期的cookie被称为会话cookie。会话cookie一般不存储在硬盘上而是保存在内存里，当然这种行为并不是规范规定的。
若设置了过期时间，浏览器就会把cookie保存到硬盘上，关闭后再次打开浏览器，这些cookie仍然有效直到超过设定的过期时间。存储在硬盘上的cookie可以在浏览器的不同进程间共享。这种称为持久Cookie。 

2、Cookie具有不可跨域名性
就是说，浏览器访问百度不会带上谷歌的cookie;

### 1.2.3. Session

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

### 1.2.4. 总结

1、cookie数据存放在客户的浏览器上，session数据放在服务器上。
2、cookie不是很安全，别人可以分析存放在本地的cookie并进行cookie欺骗，考虑到安全应当使用session。
3、session会在一定时间内保存在服务器上。当访问增多，会比较占用你服务器的性能，考虑到减轻服务器性能方面，应当使用cookie。
4、单个cookie保存的数据不能超过4K，很多浏览器都限制一个站点最多保存20个cookie。
5、可以考虑将登陆信息等重要信息存放为session，其他信息如果需要保留，可以放在cookie中。

### 1.2.5. 应用场景
登录网站，今输入用户名密码登录了，第二天再打开很多情况下就直接打开了。这个时候用到的一个机制就是cookie。
session一个场景是购物车，添加了商品之后客户端处可以知道添加了哪些商品，而服务器端如何判别呢，所以也需要存储一些信息就用到了session



## 1.3. SpringBoot WEB相关配置
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

## 1.4. 短网址生成方案
<a href="#menu" style="float:right">目录</a>


### 1.4.1. 实现思路
<a href="#menu" style="float:right">目录</a>

网页短链接是指将原本较长的网址转化成较短的网址，从而便于用户的记忆与社交软件上的传播。很多互联网公司都提供了生成短链接的服务，比如新浪微博短网址服务等

* 实现短链接服务的关键是两个步骤
    * 如何把一个任意长的字符串转化成一个较短的字符串；
    * 从短网址如何还原出长网址

**实现方案**

* 转换过程:
    * 长网址---对应唯一ID--->ID(数据库自增主键)--多进制实现-->短网址
* 逆过程
    * 短网址--多进制-->ID--查表--->长网址--->重定向
    
* 创建表
    * 我们可以创建一个用于保存长网址的数据表，比如就叫Url，这张表很简单，只需要两个字段，一个主键用于保存id，一个url字段用于存放原始的长网址，每个长网址都在这张表有一条记录。
* 获取长网址对应的ID
    * 当进行长网址转换时，先检查数据表中是否存在该长网址，若是直接获取该记录的id，否则在数据表中创建一条新记录，并返回其id。
* 多进制实现
    * 对于这个id，我们可以得到一个多进制表示下的新值，比如在以“0-9a-z”这36个字符表示的36进制中，一亿这个数字可以被表示成1njchs，只需要6个字符即可，将这6个字符拼接到准备好的域名后即可得到一个对应的短网址返回给用户。由于一亿个网址只需要6个字符，因此这种方式足够满足大部分网站的需求。
* 还原长网址
    * 而当用户点击了我们生成的短网址后，只需要将代表多进制的这部分提取出来，还原成十进制的数字ID后查表即可得到原始的长网址，再根据网址做一个重定向即可让用户访问到原始的网页

### 1.4.2. 进制转换
<a href="#menu" style="float:right">目录</a>

**把10进制转成N进制：除N取余，逆序排列**

这里逆序排列使用StringBuilder类的reverse()函数来实现。
```java
/**
 * 10进制整数转换为N进制整数。 10进制转换为N进制的方法是：这个10进制数除以N,求出余数，并把余数倒叙排列。 除N取余，倒叙排列
 * @param tenRadix
 *            十进制整数
 * @param radix
 *            要转换的进制数，例如，要转成2进制数，radix就传入2
 * @return radix进制的字符串
 */
public static String string10ToN(int tenRadix, int radix)
{
    // 进制编码支持9+26=35进制
    String code = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    StringBuilder buf = new StringBuilder();
    int remainder = 0;
    while (tenRadix != 0)
    {
        remainder = tenRadix % radix;// 求余数
        tenRadix = tenRadix / radix;// 除以基数
        buf.append(code.charAt(remainder));// 保存余数，记得要倒叙排列
    }
    buf.reverse();// 倒叙排列
    return buf.toString();
}
```

**把N进制数转成10进制数：按权展开**

(1)这里的权就是N的ex次幂，例如2进制：1110=1*2^3+1*2^2+1*2^1+0*2^0 =8+4+2+0=14

所以这里需要一个求x的ex次幂的方法，这里用一个自定义的方法：
```java
/**
 * 返回x的ex次幂。
 * @param x
 *            底数
 * @param ex
 *            幂指数
 * @return x的ex次幂
 */
public static int pow(int x, int ex)
{
	int result = 1;
	for (int i = 0; i < ex; i++)
	{
		result *= x;
	}
	return result;
}
```
当然也可以使用Math.pow()方法

下面是N进制转10进制的按权展开的方法：
```java
	/**
 * 返回N进制对应的10进制数。
 * 
 * @param N_num
 *            N进制数
 * @param radix
 *            N进制计数
 * @return N进制数对应的10进制数
 */
public static int stringNTo10(String N_num, int radix)
{
    StringBuilder stringBuilder = new StringBuilder(N_num);
    stringBuilder.reverse();// 反转字符，为了把权重最大的放在最右边，便于下面从左到右遍历，根据下标求权重。
    //如果不反转，从右向左遍历(从字符串下标大的一端)也可以
    char bitCh;
    int result = 0;
    for (int i = 0; i < stringBuilder.length(); i++)
    {
        bitCh = stringBuilder.charAt(i);
        if (bitCh >= '0' && bitCh <= '9')
        {
            // '0'对应的ASCII码整数：48
            result += (int) (bitCh - '0') * pow(radix, i);
        } else if (bitCh >= 'A' && bitCh <= 'Z')
        {
            // 减去'A'的ASCII码值(65),再加上10
            result += ((int) (bitCh - 'A') + 10) * pow(radix, i);
        } else if (bitCh >= 'a' && bitCh <= 'z')
        {
            // 减去'a'的ASCII码值(97),再加上10
            result += ((int) (bitCh - 'a') + 10) * pow(radix, i);
        }
    }
    return result;
}
```
有了这两个核心的方法，其他的方法如十进制转2进制，十进制转8进制，十进制转16进制。N进制转M进制都可调用上面的两个方法来实现了：

**N进制转M进制方法：**
```java
/**
 * 把nRadix进制数nRadixNum转换为m进制数字符串并返回。
 * 具体做法是先把nRadix的nRadixNum转换成10进制数，然后再把这个10进制数转换成mRadix进制数。
 * 
 * @param nRadixNum
 *            n进制数
 * @param nRadix
 *            n进制的基数
 * @param mRadix
 *            要转成的进制数基数m
 * @return m进制数字符串
 */
public static String stringNToM(String nRadixNum, int nRadix, int mRadix)
{
    return string10ToN(stringNTo10(nRadixNum, nRadix), mRadix);
}
```

**10进转2进制，10进制转8进制，10进制转16进制，调用十进制转N进制方法即可**

```java
public static String string10To2(int tenRadixNum)
{
	return string10ToN(tenRadixNum, 2);
}
public static String string10To8(int tenRadixNum)
{
	return string10ToN(tenRadixNum, 8);
}
public static String string10To16(int tenRadixNum)
{
	return string10ToN(tenRadixNum, 16);
}
```
同理2进制转10进制，8进制转10进制，16进制转10进制，也只要调用N进制转10进制的方法即可，这里不再累赘。

**完整代码**

```java
package lan.java.jinzhizhuanhuan;
 
public class TheMoronicCowmpouter
{
	public static void main(String[] args)
	{
		String HexNum = "f9";
		System.out.println(
				"16进制数：" + HexNum + "对应的2 进制数：" + stringNToM(HexNum, 16, 2));
		System.out.println(
				"16进制数：" + HexNum + "对应的10进制数：" + string16To10(HexNum));
		System.out.println(
				"16进制数：" + HexNum + "对应的32进制数：" + stringNToM(HexNum, 16, 32));
	}
	/**
	 * 返回N进制对应的10进制数。
	 * 
	 * @param N_num
	 *            N进制数
	 * @param radix
	 *            N进制计数
	 * @return N进制数对应的10进制数
	 */
	public static int stringNTo10(String N_num, int radix)
	{
		StringBuilder stringBuilder = new StringBuilder(N_num);
		stringBuilder.reverse();// 反转字符
		char bitCh;
		int result = 0;
		for (int i = 0; i < stringBuilder.length(); i++)
		{
			bitCh = stringBuilder.charAt(i);
			if (bitCh >= '0' && bitCh <= '9')
			{
				// '0'对应的ASCII码整数：48
				result += (int) (bitCh - '0') * pow(radix, i);
			} else if (bitCh >= 'A' && bitCh <= 'Z')
			{
				// 减去'A'的ASCII码值(65),再加上10
				result += ((int) (bitCh - 'A') + 10) * pow(radix, i);
			} else if (bitCh >= 'a' && bitCh <= 'z')
			{
				// 减去'a'的ASCII码值(97),再加上10
				result += ((int) (bitCh - 'a') + 10) * pow(radix, i);
			}
		}
		return result;
	}
	public static int string2To10(String tenRadixNum)
	{
		return stringNTo10(tenRadixNum, 2);
	}
	public static int string8To10(String tenRadixNum)
	{
		return stringNTo10(tenRadixNum, 8);
	}
	public static int string16To10(String tenRadixNum)
	{
		return stringNTo10(tenRadixNum, 16);
	}
	/**
	 * 返回x的ex次幂。
	 * 
	 * @param x
	 *            底数
	 * @param ex
	 *            幂指数
	 * @return x的ex次幂
	 */
	public static int pow(int x, int ex)
	{
		int result = 1;
		for (int i = 0; i < ex; i++)
		{
			result *= x;
		}
		return result;
	}
	/**
	 * 10进制整数转换为N进制整数。 10进制转换为N进制的方法是：这个10进制数除以N,求出余数，并把余数倒叙排列。 除N取余，倒叙排列
	 * 
	 * @param tenRadix
	 *            十进制整数
	 * @param radix
	 *            要转换的进制数，例如，要转成2进制数，radix就传入2
	 * @return radix进制的字符串
	 */
	public static String string10ToN(int tenRadix, int radix)
	{
		// 进制编码支持9+26=35进制
		String code = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder buf = new StringBuilder();
		int remainder = 0;
		while (tenRadix != 0)
		{
			remainder = tenRadix % radix;// 求余数
			tenRadix = tenRadix / radix;// 除以2
			buf.append(code.charAt(remainder));// 保存余数，记得要倒叙排列
		}
		buf.reverse();// 倒叙排列
		return buf.toString();
	}
	public static String string10To2(int tenRadixNum)
	{
		return string10ToN(tenRadixNum, 2);
	}
	public static String string10To8(int tenRadixNum)
	{
		return string10ToN(tenRadixNum, 8);
	}
	public static String string10To16(int tenRadixNum)
	{
		return string10ToN(tenRadixNum, 16);
	}
	/**
	 * 把nRadix进制数nRadixNum转换为m进制数字符串并返回。
	 * 具体做法是先把nRadix的nRadixNum转换成10进制数，然后再把这个10进制数转换成mRadix进制数。
	 * 
	 * @param nRadixNum
	 *            n进制数
	 * @param nRadix
	 *            n进制的基数
	 * @param mRadix
	 *            要转成的进制数基数m
	 * @return m进制数字符串
	 */
	public static String stringNToM(String nRadixNum, int nRadix, int mRadix)
	{
		return string10ToN(stringNTo10(nRadixNum, nRadix), mRadix);
	}
}
```
运行结果：

16进制数：f9对应的2 进制数：11111001
16进制数：f9对应的10进制数：249
16进制数：f9对应的32进制数：7P
这上面只支持到9+26=35进制以内的整数之间的进制相互转换，大于35进制的我不方便符号化就算了，知道进制转换的原理就行了，主要是10进制转N进制，以及N进制转10进制这两个重要的转换方法。





## 1.5. WEB容器
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
   



## 1.6. Tomcat
<a href="#menu" style="float:right">目录</a>

### 1.6.1. 概述
<a href="#menu" style="float:right">目录</a>


#### 1.6.1.1. Tomcat快速理解
<a href="#menu" style="float:right">目录</a>

### 1.6.2. Web服务机制
<a href="#menu" style="float:right">目录</a>

#### 1.6.2.1. 通信协议
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
    

### 1.6.3. Tomcat 总体架构
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



### 1.6.4. Server和Service组件
<a href="#menu" style="float:right">目录</a>


### 1.6.5. Connect组件
<a href="#menu" style="float:right">目录</a>

* http11Protocol
    * HTTP阻塞模式协议
* http11NioProtocol
    * HTTP非阻塞模式协议
* http11ArpProtocol
    * HTTPARP模式协议
* http11AjpProtocol
    * HTTP阻塞模式协议

### 1.6.6. Engine组件
<a href="#menu" style="float:right">目录</a>

### 1.6.7. Host容器
<a href="#menu" style="float:right">目录</a>

### 1.6.8. Context容器
<a href="#menu" style="float:right">目录</a>


### 1.6.9. Wrapper容器
<a href="#menu" style="float:right">目录</a>


### 1.6.10. 生命周期管理
<a href="#menu" style="float:right">目录</a>


### 1.6.11. 日志框架和国家化
<a href="#menu" style="float:right">目录</a>

### 1.6.12. 公共与隔离类加载器
<a href="#menu" style="float:right">目录</a>


### 1.6.13. 请求URI映射器Mapper
<a href="#menu" style="float:right">目录</a>

### 1.6.14. Tomcat的JNDI
<a href="#menu" style="float:right">目录</a>


### 1.6.15. 运行、通信、及访问安全管理
<a href="#menu" style="float:right">目录</a>


### 1.6.16. 处理请求和响应的管道
<a href="#menu" style="float:right">目录</a>


### 1.6.17. 多样化的会话管理器
<a href="#menu" style="float:right">目录</a>


### 1.6.18. 高可用集群实现
<a href="#menu" style="float:right">目录</a>


### 1.6.19. 集群通信框架
<a href="#menu" style="float:right">目录</a>


### 1.6.20. 监控和管理
<a href="#menu" style="float:right">目录</a>



## 1.7. Jetty
<a href="#menu" style="float:right">目录</a>

## 1.8. 编码问题
<a href="#menu" style="float:right">目录</a>

* 需要编码的原因
    * 计算机中存储信息的最小单位是一个字节，所能表示的字符范围是0～255
    * 人类表示的符号太多，无法使用一个字节完全表示，比如汉字就有几千个。

* 当将一种编码格式的数据转化成另一种编码格式的数据就要进行翻译

### 1.8.1. 常见的编码格式
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


