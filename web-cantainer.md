
<span id="menu"></span>

# 1. WEB容器
<a href="#menu" style="float:right">目录</a>


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
## 1.2. SpringBoot WEB相关配置
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






## 1.3. Tomcat
<a href="#menu" style="float:right">目录</a>

### 1.3.1. 概述
<a href="#menu" style="float:right">目录</a>


#### 1.3.1.1. Tomcat快速理解
<a href="#menu" style="float:right">目录</a>

### 1.3.2. Web服务机制
<a href="#menu" style="float:right">目录</a>

#### 1.3.2.1. 通信协议
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
    
### 1.3.3. Servlet规范
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


### 1.3.4. Tomcat 总体架构
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



### 1.3.5. Server和Service组件
<a href="#menu" style="float:right">目录</a>


### 1.3.6. Connect组件
<a href="#menu" style="float:right">目录</a>

* http11Protocol
    * HTTP阻塞模式协议
* http11NioProtocol
    * HTTP非阻塞模式协议
* http11ArpProtocol
    * HTTPARP模式协议
* http11AjpProtocol
    * HTTP阻塞模式协议

### 1.3.7. Engine组件
<a href="#menu" style="float:right">目录</a>

### 1.3.8. Host容器
<a href="#menu" style="float:right">目录</a>

### 1.3.9. Context容器
<a href="#menu" style="float:right">目录</a>


### 1.3.10. Wrapper容器
<a href="#menu" style="float:right">目录</a>


### 1.3.11. 生命周期管理
<a href="#menu" style="float:right">目录</a>


### 1.3.12. 日志框架和国家化
<a href="#menu" style="float:right">目录</a>

### 1.3.13. 公共与隔离类加载器
<a href="#menu" style="float:right">目录</a>


### 1.3.14. 请求URI映射器Mapper
<a href="#menu" style="float:right">目录</a>

### 1.3.15. Tomcat的JNDI
<a href="#menu" style="float:right">目录</a>


### 1.3.16. 运行、通信、及访问安全管理
<a href="#menu" style="float:right">目录</a>


### 1.3.17. 处理请求和响应的管道
<a href="#menu" style="float:right">目录</a>


### 1.3.18. 多样化的会话管理器
<a href="#menu" style="float:right">目录</a>


### 1.3.19. 高可用集群实现
<a href="#menu" style="float:right">目录</a>


### 1.3.20. 集群通信框架
<a href="#menu" style="float:right">目录</a>


### 1.3.21. 监控和管理
<a href="#menu" style="float:right">目录</a>



## 1.4. Jetty
<a href="#menu" style="float:right">目录</a>
