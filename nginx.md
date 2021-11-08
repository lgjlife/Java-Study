<span id="menu"></span>
<!-- TOC -->

- [1. 概述](#1-概述)
  - [1.1. 功能特性](#11-功能特性)
  - [1.2. Nginx快速理解](#12-nginx快速理解)
- [2. 安装和使用](#2-安装和使用)
  - [2.1. 使用包管理器安装](#21-使用包管理器安装)
  - [2.2. 使用二进制文件安装](#22-使用二进制文件安装)
  - [2.3. docker 方式安装](#23-docker-方式安装)
  - [2.4. configure配置说明](#24-configure配置说明)
    - [2.4.1. 常见配置说明](#241-常见配置说明)
    - [2.4.2. Nginx重新编译添加模块的方法](#242-nginx重新编译添加模块的方法)
    - [2.4.3. 安装第三方模块](#243-安装第三方模块)
    - [2.4.4. 常用命令](#244-常用命令)
- [3. 配置文件](#3-配置文件)
  - [3.1. 内核参数优化](#31-内核参数优化)
  - [3.2. Nginx中的进程](#32-nginx中的进程)
  - [3.3. 配置文件结构](#33-配置文件结构)
  - [3.4. 全局配置参数](#34-全局配置参数)
    - [3.4.1. 常用配置](#341-常用配置)
    - [3.4.2. 日志文件](#342-日志文件)
      - [3.4.2.1. 访问日志](#3421-访问日志)
      - [3.4.2.2. 错误日志](#3422-错误日志)
      - [3.4.2.3. 日志文件切割](#3423-日志文件切割)
  - [3.5. 虚拟主机server配置](#35-虚拟主机server配置)
    - [3.5.1. 配置网络监听](#351-配置网络监听)
    - [3.5.2. 访问权限控制](#352-访问权限控制)
    - [3.5.3. 基于名称的虚拟主机配置](#353-基于名称的虚拟主机配置)
    - [3.5.4. 基于端口配置虚拟主机](#354-基于端口配置虚拟主机)
    - [3.5.5. 基于IP配置虚拟主机](#355-基于ip配置虚拟主机)
    - [3.5.6. 基于域名配置虚拟主机](#356-基于域名配置虚拟主机)
    - [3.5.7. 自定义错误页](#357-自定义错误页)
  - [3.6. 其他配置](#36-其他配置)
  - [3.7. 目录设置](#37-目录设置)
    - [3.7.1. root配置](#371-root配置)
    - [3.7.2. alias配置](#372-alias配置)
  - [3.8. 配置location块匹配](#38-配置location块匹配)
  - [3.9. 网页压缩传输](#39-网页压缩传输)
  - [3.10. 重写和重定向](#310-重写和重定向)
  - [3.11. 防盗链配置](#311-防盗链配置)
    - [3.11.1. 图片防盗链](#3111-图片防盗链)
    - [3.11.2. 下载防盗链](#3112-下载防盗链)
  - [3.12. 配置https网站](#312-配置https网站)
- [4. 代理服务](#4-代理服务)
  - [4.1. 正向代理和反向代理区别](#41-正向代理和反向代理区别)
  - [4.2. Nginx正向代理服务](#42-nginx正向代理服务)
  - [4.3. 反向代理服务](#43-反向代理服务)
    - [4.3.1. 常用配置指令](#431-常用配置指令)
      - [4.3.1.1. 反向代理基本设置的21个指令](#4311-反向代理基本设置的21个指令)
      - [4.3.1.2. proxy buffer 的配置的7个指令](#4312-proxy-buffer-的配置的7个指令)
      - [4.3.1.3. proxy cache 的配置的12个指令](#4313-proxy-cache-的配置的12个指令)
  - [4.4. 负载均衡](#44-负载均衡)
    - [4.4.1. 基本理论](#441-基本理论)
    - [4.4.2. 配置](#442-配置)
- [5. 缓存机制](#5-缓存机制)
  - [5.1. 缓存实现原理](#51-缓存实现原理)
  - [5.2. 永久缓存配置](#52-永久缓存配置)
  - [5.3. 临时缓存配置](#53-临时缓存配置)
  - [5.4. 缓存清理配置](#54-缓存清理配置)
- [6. nginx中集成lua](#6-nginx中集成lua)
- [7. 高级配置](#7-高级配置)
- [8. gzip压缩](#8-gzip压缩)
- [9. rewrite功能](#9-rewrite功能)
  - [9.1. nginx后端服务器组的配置的5个技术指令](#91-nginx后端服务器组的配置的5个技术指令)
  - [9.2. rewrite功能的配置](#92-rewrite功能的配置)
  - [9.3. rewrite使用](#93-rewrite使用)
- [10. 邮件服务](#10-邮件服务)
- [11. 架构说明](#11-架构说明)
  - [11.1. 模块化结构](#111-模块化结构)
    - [11.1.1. 模块分类](#1111-模块分类)
  - [11.2. web请求处理机制](#112-web请求处理机制)
  - [11.3. 设计架构概览](#113-设计架构概览)
- [12. 工作进程](#12-工作进程)
  - [12.1. nginx服务进程间通信](#121-nginx服务进程间通信)
    - [12.1.1. Linux进程间通信方式](#1211-linux进程间通信方式)
    - [12.1.2. Linux进程间双工通信方式的实现](#1212-linux进程间双工通信方式的实现)
    - [12.1.3. 通信通道建立和设置](#1213-通信通道建立和设置)
    - [12.1.4. 通信通道的使用](#1214-通信通道的使用)
    - [12.1.5. 消息的读写](#1215-消息的读写)
- [13. 模块编程](#13-模块编程)
  - [13.1. 模块的种类](#131-模块的种类)
  - [13.2. 模块开发实战](#132-模块开发实战)
  - [13.3. 模块的编译和安装](#133-模块的编译和安装)
- [14. nginx 优化](#14-nginx-优化)
  - [14.1. Nginx运行工作进程数量](#141-nginx运行工作进程数量)
  - [14.2. Nginx最大打开文件数](#142-nginx最大打开文件数)
  - [14.3. Nginx事件处理模型](#143-nginx事件处理模型)
  - [14.4. 开启高效传输模式](#144-开启高效传输模式)
  - [14.5. 连接超时时间](#145-连接超时时间)
  - [14.6. fastcgi 调优](#146-fastcgi-调优)
  - [14.7. gzip 调优](#147-gzip-调优)
  - [14.8. expires 缓存调优](#148-expires-缓存调优)
  - [14.9. 防盗链](#149-防盗链)
  - [14.10. 内核参数优化](#1410-内核参数优化)
- [15. nginx源码结构](#15-nginx源码结构)
  - [15.1. 目录结构](#151-目录结构)
  - [15.2. 模块结构](#152-模块结构)
- [16. 启动初始化](#16-启动初始化)
  - [16.1. 启动过程概览](#161-启动过程概览)
- [17. 时间管理](#17-时间管理)
- [18. 内存管理](#18-内存管理)
  - [18.1. 内存的逻辑结构](#181-内存的逻辑结构)
  - [18.2. 内存池管理](#182-内存池管理)
  - [18.3. 内存的使用](#183-内存的使用)

<!-- /TOC -->
<a href="#menu" >目录</a>

# 1. 概述
<a href="#menu" >目录</a>

## 1.1. 功能特性
<a href="#menu" >目录</a>

**三大基本功能**
* 基本http服务
    * 处理静态文件，处理索引文件以及支持自动索引
    * 打开并自行管理文件描述符缓存
    * 提供**反向代理**服务,并且可以使用缓存加速反向代理 ，同时完成简单的**负载均衡**和容错
    * 提供远程FastCGI服务的缓存机制，加速访问，同时完成简单的负载均衡和容错
    * 使用Nginx的模块化提供过滤功能，基本过滤器包括gzip压缩，ranges支持，chunked响应，XSLT，SSI以及图像缩放等
    * 支持HTTP下的安全套接层安全协议SSL
* 高级http服务
    * 支持基于名字和IP的虚拟主机设置
    * 支持HTTP1.0中的KEEPALIVE模式和管线（PipeLined）模型连接
    * 支持重新加载配置和在线升级等，无需中断正在执行的请求
    * 自定义访问日志格式，带缓存的日志操作以及快速日志轮转
    * 提供3xx~5xx错误代码**重定向**功能
    * 支持重写模块扩展
    * 支持HTTP DAV模块
    * 支持FLV流和MP4流传输
    * 支持网络控制，限流
    * 支持嵌入Perl语言
* 邮件代理服务

**常用功能介绍**

* Http代理和反向代理
* 负载均衡
* web缓存

## 1.2. Nginx快速理解

**什么是nginx,它的优势和功能？**
* Nginx是一个高性能的 HTTP 和 反向代理 服务器，也是一个 IMAP/POP3/SMTP 代理服务器。因它的稳定性、丰富的功能集、示例配置文件和低系统资源的消耗而闻名。2011年6月1日，nginx 1.0.4发布。
* 优点：
    * 更快
        * 这表现在两个方面：一方面，在正常情况下，单次请求会得到更快的响应；另一方面，在高峰期（如有数以万计的并发请求），Nginx可以比其他Web服务器更快地响应请求。
    * 高扩展性，跨平台
        * Nginx的设计极具扩展性，它完全是由多个不同功能、不同层次、不同类型且耦合度极低的模块组成。因此，当对某一个模块修复Bug或进行升级时，可以专注于模块自身，无须在意其他。而且在HTTP模块中，还设计了HTTP过滤器模块：一个正常的HTTP模块在处理完请求后，会有一串HTTP过滤器模块对请求的结果进行再处理。这样，当我们开发一个新的HTTP模块时，不但可以使用诸如HTTP核心模块、events模块、log模块等不同层次或者不同类型的模块，还可以原封不动地复用大量已有的HTTP过滤器模块。这种低耦合度的优秀设计，造就了Nginx庞大的第三方模块，当然，公开的第三方模块也如官方发布的模块一样容易使用。
        Nginx的模块都是嵌入到二进制文件中执行的，无论官方发布的模块还是第三方模块都是如此。这使得第三方模块一样具备极其优秀的性能，充分利用Nginx的高并发特性，因此，许多高流量的网站都倾向于开发符合自己业务特性的定制模块。
    * 高可靠性：用于反向代理，宕机的概率微乎其微
        * 高可靠性是我们选择Nginx的最基本条件，因为Nginx的可靠性是大家有目共睹的，很多家高流量网站都在核心服务器上大规模使用Nginx。Nginx的高可靠性来自于其核心框架代码的优秀设计、模块设计的简单性；另外，官方提供的常用模块都非常稳定，每个worker进程相对独立，master进程在1个worker进程出错时可以快速“拉起”新的worker子进程提供服务。

    * 低内存消耗
        * 一般情况下，10 000个非活跃的HTTP KeepAlive连接在Nginx中仅消耗2.5MB的内存，这是Nginx支持高并发连接的基础。
    * 单机支持10万以上的并发连接
        * 这是一个非常重要的特性！随着互联网的迅猛发展和互联网用户数量的成倍增长，各大公司、网站都需要应付海量并发请求，一个能够在峰值期顶住10万以上并发请求的Server，无疑会得到大家的青睐。理论上，Nginx支持的并发连接上限取决于内存，10万远未封顶。当然，能够及时地处理更多的并发请求，是与业务特点紧密相关的。
    * 热部署
        * master管理进程与worker工作进程的分离设计，使得Nginx能够提供热部署功能，即可以在7×24小时不间断服务的前提下，升级Nginx的可执行文件。当然，它也支持不停止服务就更新配置项、更换日志文件等功能。
    * 最自由的BSD许可协议
        * 这是Nginx可以快速发展的强大动力。BSD许可协议不只是允许用户免费使用Nginx，它还允许用户在自己的项目中直接使用或修改Nginx源码，然后发布。这吸引了无数开发者继续为Nginx贡献自己的智慧。
以上7个特点当然不是Nginx的全部，拥有无数个官方功能模块、第三方功能模块使得Nginx能够满足绝大部分应用场景，这些功能模块间可以叠加以实现更加强大、复杂的功能，有些模块还支持Nginx与Perl、Lua等脚本语言集成工作，大大提高了开发效率。这些特点促使用户在寻找一个Web服务器时更多考虑Nginx。

**Nginx的模块与工作原理是什么?**

Nginx由内核和模块组成，其中，内核的设计非常微小和简洁，完成的工作也非常简单，仅仅通过查找配置文件将客户端请求映射到一个location block（location是Nginx配置中的一个指令，用于URL匹配），而在这个location中所配置的每个指令将会启动不同的模块去完成相应的工作。 
Nginx的模块从结构上分为核心模块、基础模块和第三方模块：
* 核心模块：HTTP模块、EVENT模块和MAIL模块
* 基础模块：HTTP Access模块、HTTP FastCGI模块、HTTP
* 第三方模块：HTTP Upstream Request Hash模块、Notice模块和HTTPAccess Key模块。

用户根据自己的需要开发的模块都属于第三方模块。正是有了这么多模块的支撑，Nginx的功能才会如此强大。 

Nginx的模块从功能上分为如下三类：
* Handlers（处理器模块）。此类模块直接处理请求，并进行输出内容和修改headers信息等操作。Handlers处理器模块一般只能有一个。
* Filters （过滤器模块）。此类模块主要对其他处理器模块输出的内容进行修改操作，最后由Nginx输出。 Proxies（代理类模块）。此类模块是Nginx的HTTP
* Upstream之类的模块，这些模块主要与后端一些服务比如FastCGI等进行交互，实现服务代理和负载均衡等功能。

![](https://imgblog.csdn.net/20180810143236596?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI1OTM0NDAx/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

Nginx本身做的工作实际很少，当它接到一个HTTP请求时，它仅仅是通过查找配置文件将此次请求映射到一个location block，而此location中所配置的各个指令则会启动不同的模块去完成工作，因此模块可以看做Nginx真正的劳动工作者。通常一个location中的指令会涉及一个handler模块和多个filter模块（当然，多个location可以复用同一个模块）。handler模块负责处理请求，完成响应内容的生成，而filter模块对响应内容进行处理。 
Nginx的模块直接被编译进Nginx，因此属于静态编译方式。启动Nginx后，Nginx的模块被自动加载，不像Apache，首先将模块编译为一个so文件，然后在配置文件中指定是否进行加载。在解析配置文件时，Nginx的每个模块都有可能去处理某个请求，但是同一个处理请求只能由一个模块来完成



**怎么理解Nginx的进程模型?**

在工作方式上，Nginx分为单工作进程和多工作进程两种模式。在单工作进程模式下，除主进程外，还有一个工作进程，工作进程是单线程的；在多工作进程模式下，每个工作进程包含多个线程。Nginx默认为单工作进程模式。 
Nginx在启动后，会有一个master进程和多个worker进程。 

**master进程** 

主要用来管理worker进程，包含：接收来自外界的信号，向各worker进程发送信号，监控worker进程的运行状态，当worker进程退出后(异常情况下)，会自动重新启动新的worker进程。 
master进程充当整个进程组与用户的交互接口，同时对进程进行监护。它不需要处理网络事件，不负责业务的执行，只会通过管理worker进程来实现重启服务、平滑升级、更换日志文件、配置文件实时生效等功能。 
我们要控制nginx，只需要通过kill向master进程发送信号就行了。比如kill HUP pid，则是告诉nginx，从容地重启nginx，我们一般用这个信号来重启nginx，或重新加载配置，因为是从容地重启，因此服务是不中断的。master进程在接收到HUP信号后是怎么做的呢？首先master进程在接到信号后，会先重新加载配置文件，然后再启动新的worker进程，并向所有老的worker进程发送信号，告诉他们可以光荣退休了。新的worker在启动后，就开始接收新的请求，而老的worker在收到来自master的信号后，就不再接收新的请求，并且在当前进程中的所有未处理完的请求处理完成后，再退出。当然，直接给master进程发送信号，这是比较老的操作方式，nginx在0.8版本之后，引入了一系列命令行参数，来方便我们管理。比如，./nginx s reload，就是来重启nginx，./nginx s stop，就是来停止nginx的运行。如何做到的呢？我们还是拿reload来说，我们看到，执行命令时，我们是启动一个新的nginx进程，而新的nginx进程在解析到reload参数后，就知道我们的目的是控制nginx来重新加载配置文件了，它会向master进程发送信号，然后接下来的动作，就和我们直接向master进程发送信号一样了。 

![](https://imgblog.csdn.net/20180810144219311?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI1OTM0NDAx/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

而基本的网络事件，则是放在worker进程中来处理了。多个worker进程之间是对等的，他们同等竞争来自客户端的请求，各进程互相之间是独立的。一个请求，只可能在一个worker进程中处理，一个worker进程，不可能处理其它进程的请求。worker进程的个数是可以设置的，一般我们会设置与机器cpu核数一致，这里面的原因与nginx的进程模型以及事件处理模型是分不开的。 

worker进程之间是平等的，每个进程，处理请求的机会也是一样的。当我们提供80端口的http服务时，一个连接请求过来，每个进程都有可能处理这个连接，怎么做到的呢？首先，每个worker进程都是从master进程fork过来，在master进程里面，先建立好需要listen的socket（listenfd）之后，然后再fork出多个worker进程。所有worker进程的listenfd会在新连接到来时变得可读，为保证只有一个进程处理该连接，所有worker进程在注册listenfd读事件前抢accept_mutex，抢到互斥锁的那个进程注册listenfd读事件，在读事件里调用accept接受该连接。当一个worker进程在accept这个连接之后，就开始读取请求，解析请求，处理请求，产生数据后，再返回给客户端，最后才断开连接，这样一个完整的请求就是这样的了。我们可以看到，一个请求，完全由worker进程来处理，而且只在一个worker进程中处理。 
nginx的进程模型，可以由下图来表示： 

![](https://imgblog.csdn.net/20180810144312890?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI1OTM0NDAx/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)



**Nginx+FastCGI运行原理?**

* 什么是 FastCGI 
    * FastCGI是一个可伸缩地、高速地在HTTP server和动态脚本语言间通信的接口。多数流行的HTTP server都支持FastCGI，包括Apache、Nginx和lighttpd等。同时，FastCGI也被许多脚本语言支持，其中就有PHP。 
    * FastCGI是从CGI发展改进而来的。传统CGI接口方式的主要缺点是性能很差，因为每次HTTP服务器遇到动态程序时都需要重新启动脚本解析器来执行解析，然后将结果返回给HTTP服务器。这在处理高并发访问时几乎是不可用的。另外传统的CGI接口方式安全性也很差，现在已经很少使用了。 
    * FastCGI接口方式采用C/S结构，可以将HTTP服务器和脚本解析服务器分开，同时在脚本解析服务器上启动一个或者多个脚本解析守护进程。当HTTP服务器每次遇到动态程序时，可以将其直接交付给FastCGI进程来执行，然后将得到的结果返回给浏览器。这种方式可以让HTTP服务器专一地处理静态请求或者将动态脚本服务器的结果返回给客户端，这在很大程度上提高了整个应用系统的性能。 
* Nginx+FastCGI运行原理 
    * Nginx不支持对外部程序的直接调用或者解析，所有的外部程序（包括PHP）必须通过FastCGI接口来调用。FastCGI接口在Linux下是socket（这个socket可以是文件socket，也可以是ip socket）。 
    * wrapper：为了调用CGI程序，还需要一个FastCGI的wrapper（wrapper可以理解为用于启动另一个程序的程序），这个wrapper绑定在某个固定socket上，如端口或者文件socket。当Nginx将CGI请求发送给这个socket的时候，通过FastCGI接口，wrapper接收到请求，然后Fork(派生）出一个新的线程，这个线程调用解释器或者外部程序处理脚本并读取返回数据；接着，wrapper再将返回的数据通过FastCGI接口，沿着固定的socket传递给Nginx；最后，Nginx将返回的数据（html页面或者图片）发送给客户端。这就是Nginx+FastCGI的整个运作过程，如图13所示。
![](https://imgblog.csdn.net/20180810144411895?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI1OTM0NDAx/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/700)

所以，我们首先需要一个wrapper，这个wrapper需要完成的工作： 
1. 通过调用fastcgi（库）的函数通过socket和ningx通信（读写socket是fastcgi内部实现的功能，对wrapper是非透明的） 
2. 调度thread，进行fork和kill 
3. 和application（php）进行通信

 

**nginx多进程事件模型：异步非阻塞?**

虽然nginx采用多worker的方式来处理请求，每个worker里面只有一个主线程，那能够处理的并发数很有限啊，多少个worker就能处理多少个并发，何来高并发呢？非也，这就是nginx的高明之处，nginx采用了异步非阻塞的方式来处理请求，也就是说，nginx是可以同时处理成千上万个请求的。一个worker进程可以同时处理的请求数只受限于内存大小，而且在架构设计上，不同的worker进程之间处理并发请求时几乎没有同步锁的限制，worker进程通常不会进入睡眠状态，因此，当Nginx上的进程数与CPU核心数相等时（最好每一个worker进程都绑定特定的CPU核心），进程间切换的代价是最小的。

而apache的常用工作方式（apache也有异步非阻塞版本，但因其与自带某些模块冲突，所以不常用），每个进程在一个时刻只处理一个请求，因此，当并发数上到几千时，就同时有几千的进程在处理请求了。这对操作系统来说，是个不小的挑战，进程带来的内存占用非常大，进程的上下文切换带来的cpu开销很大，自然性能就上不去了，而这些开销完全是没有意义的。


**为什么nginx可以采用异步非阻塞的方式来处理?**

看看一个请求的完整过程:首先，请求过来，要建立连接，然后再接收数据，接收数据后，再发送数据。

具体到系统底层，就是读写事件，而当读写事件没有准备好时，必然不可操作，如果不用非阻塞的方式来调用，那就得阻塞调用了，事件没有准备好，那就只能等了，等事件准备好了，你再继续吧。阻塞调用会进入内核等待，cpu就会让出去给别人用了，对单线程的worker来说，显然不合适，当网络事件越多时，大家都在等待呢，cpu空闲下来没人用，cpu利用率自然上不去了，更别谈高并发了。好吧，你说加进程数，这跟apache的线程模型有什么区别，注意，别增加无谓的上下文切换。所以，在nginx里面，最忌讳阻塞的系统调用了。不要阻塞，那就非阻塞喽。非阻塞就是，事件没有准备好，马上返回EAGAIN，告诉你，事件还没准备好呢，你慌什么，过会再来吧。好吧，你过一会，再来检查一下事件，直到事件准备好了为止，在这期间，你就可以先去做其它事情，然后再来看看事件好了没。虽然不阻塞了，但你得不时地过来检查一下事件的状态，你可以做更多的事情了，但带来的开销也是不小的。



**nginx支持的事件模型?**

Nginx支持如下处理连接的方法（I/O复用方法），这些方法可以通过use指令指定。
    * select– 标准方法。 如果当前平台没有更有效的方法，它是编译时默认的方法。你可以使用配置参数 –withselect_module 和 –withoutselect_module 来启用或禁用这个模块。
    * poll– 标准方法。 如果当前平台没有更有效的方法，它是编译时默认的方法。你可以使用配置参数 –withpoll_module 和 –withoutpoll_module 来启用或禁用这个模块。
    * kqueue– 高效的方法，使用于 FreeBSD 4.1+, OpenBSD 2.9+, NetBSD 2.0 和 MacOS X. 使用双处理器的MacOS X系统使用kqueue可能会造成内核崩溃。
    * epoll – 高效的方法，使用于Linux内核2.6版本及以后的系统。在某些发行版本中，如SuSE 8.2, 有让2.4版本的内核支持epoll的补丁。
    * rtsig – 可执行的实时信号，使用于Linux内核版本2.2.19以后的系统。默认情况下整个系统中不能出现大于1024个POSIX实时(排队)信号。这种情况 对于高负载的服务器来说是低效的；所以有必要通过调节内核参数 /proc/sys/kernel/rtsigmax 来增加队列的大小。可是从Linux内核版本2.6.6mm2开始， 这个参数就不再使用了，并且对于每个进程有一个独立的信号队列，这个队列的大小可以用 RLIMIT_SIGPENDING 参数调节。当这个队列过于拥塞，nginx就放弃它并且开始使用 poll 方法来处理连接直到恢复正常。
    * /dev/poll – 高效的方法，使用于 Solaris 7 11/99+, HP/UX 11.22+ (eventport), IRIX 6.5.15+ 和 Tru64 UNIX 5.1A+.
    * eventport – 高效的方法，使用于 Solaris 10. 为了防止出现内核崩溃的问题， 有必要安装这个 安全补丁。



**在linux下面，只有epoll是高效的方法,epoll到底是如何高效的**

Epoll是Linux内核为处理大批量句柄而作了改进的poll。 要使用epoll只需要这三个系统调用：epoll_create(2)， epoll_ctl(2)， epoll_wait(2)。它是在2.5.44内核中被引进的(epoll(4) is a new API introduced in Linux kernel 2.5.44)，在2.6内核中得到广泛应用。

epoll的优点?
* 支持一个进程打开大数目的socket描述符(FD) 
select 最不能忍受的是一个进程所打开的FD是有一定限制的，由FD_SETSIZE设置，默认值是2048。对于那些需要支持的上万连接数目的IM服务器来说显 然太少了。这时候你一是可以选择修改这个宏然后重新编译内核，不过资料也同时指出这样会带来网络效率的下降，二是可以选择多进程的解决方案(传统的 Apache方案)，不过虽然linux上面创建进程的代价比较小，但仍旧是不可忽视的，加上进程间数据同步远比不上线程间同步的高效，所以也不是一种完 美的方案。不过 epoll则没有这个限制，它所支持的FD上限是最大可以打开文件的数目，这个数字一般远大于2048,举个例子,在1GB内存的机器上大约是10万左 右，具体数目可以cat /proc/sys/fs/filemax察看,一般来说这个数目和系统内存关系很大。 
* IO效率不随FD数目增加而线性下降 
传统的select/poll另一个致命弱点就是当你拥有一个很大的socket集合，不过由于网络延时，任一时间只有部分的socket是”活跃”的，但 是select/poll每次调用都会线性扫描全部的集合，导致效率呈现线性下降。但是epoll不存在这个问题，它只会对”活跃”的socket进行操 作—这是因为在内核实现中epoll是根据每个fd上面的callback函数实现的。那么，只有”活跃”的socket才会主动的去调用 callback函数，其他idle状态socket则不会，在这点上，epoll实现了一个”伪”AIO，因为这时候推动力在os内核。在一些 benchmark中，如果所有的socket基本上都是活跃的—比如一个高速LAN环境，epoll并不比select/poll有什么效率，相 反，如果过多使用epoll_ctl,效率相比还有稍微的下降。但是一旦使用idle connections模拟WAN环境,epoll的效率就远在select/poll之上了。 
* 使用mmap加速内核与用户空间的消息传递。 
这 点实际上涉及到epoll的具体实现了。无论是select,poll还是epoll都需要内核把FD消息通知给用户空间，如何避免不必要的内存拷贝就很 重要，在这点上，epoll是通过内核于用户空间mmap同一块内存实现的。而如果你想我一样从2.5内核就关注epoll的话，一定不会忘记手工 mmap这一步的。 
* 内核微调 
这一点其实不算epoll的优点了，而是整个linux平台的优点。也许你可以怀疑linux平台，但是你无法回避linux平台赋予你微调内核的能力。比如，内核TCP/IP协 议栈使用内存池管理sk_buff结构，那么可以在运行时期动态调整这个内存pool(skb_head_pool)的大小— 通过echo XXXX>/proc/sys/net/core/hot_list_length完成。再比如listen函数的第2个参数(TCP完成3次握手 的数据包队列长度)，也可以根据你平台内存大小动态调整。更甚至在一个数据包面数目巨大但同时每个数据包本身大小却很小的特殊系统上尝试最新的NAPI网卡驱动架构。 
(epoll内容，参考epoll_互动百科) 
推荐设置worker的个数为cpu的核数，在这里就很容易理解了，更多的worker数，只会导致进程来竞争cpu资源了，从而带来不必要的上下文切换。而且，nginx为了更好的利用多核特性，提供了cpu亲缘性的绑定选项，我们可以将某一个进程绑定在某一个核上，这样就不会因为进程的切换带来cache的失效。像这种小的优化在nginx中非常常见，同时也说明了nginx作者的苦心孤诣。比如，nginx在做4个字节的字符串比较时，会将4个字符转换成一个int型，再作比较，以减少cpu的指令数等等。


**nginx和apache的区别？**

1）轻量级，同样起web 服务，比apache 占用更少的内存及资源 
2）抗并发，nginx 处理请求是异步非阻塞的，而apache 则是阻塞型的，在高并发下nginx 能保持低资源低消耗高性能 
3）高度模块化的设计，编写模块相对简单 
4）最核心的区别在于apache是同步多进程模型，一个连接对应一个进程；nginx是异步的，多个连接（万级别）可以对应一个进程

 
**nginx是如何实现高并发的**

一个主进程，多个工作进程，每个工作进程可以处理多个请求，每进来一个request，会有一个worker进程去处理。但不是全程的处理，处理到可能发生阻塞的地方，比如向上游（后端）服务器转发request，并等待请求返回。那么，这个处理的worker继续处理其他请求，而一旦上游服务器返回了，就会触发这个事件，worker才会来接手，这个request才会接着往下走。由于web server的工作性质决定了每个request的大部份生命都是在网络传输中，实际上花费在server机器上的时间片不多。这是几个进程就解决高并发的秘密所在。即@skoo所说的webserver刚好属于网络io密集型应用，不算是计算密集型。


 
**请解释Nginx如何处理HTTP请求。**

Nginx使用反应器模式。主事件循环等待操作系统发出准备事件的信号，这样数据就可以从套接字读取，在该实例中读取到缓冲区并进行处理。单个线程可以提供数万个并发连接。



**在Nginx中，如何使用未定义的服务器名称来阻止处理请求?**

只需将请求删除的服务器就可以定义为： 
```
Server { 
    listen 80; server_name “ “ ; 
    return 444; 
} 
```
这里，服务器名被保留为一个空字符串，它将在没有“主机”头字段的情况下匹配请求，而一个特殊的Nginx的非标准代码444被返回，从而终止连接。



**使用“反向代理服务器”的优点是什么?**

反向代理服务器可以隐藏源服务器的存在和特征。它充当互联网云和web服务器之间的中间层。这对于安全方面来说是很好的，特别是当您使用web托管服务时。



**请列举Nginx服务器的最佳用途。**

Nginx服务器的最佳用法是在网络上部署动态HTTP内容，使用SCGI、WSGI应用程序服务器、用于脚本的FastCGI处理程序。它还可以作为负载均衡器。



**请解释Nginx服务器上的Master和Worker进程分别是什么?**

Master进程：读取及评估配置和维持 
Worker进程：处理请求



**请解释你如何通过不同于80的端口开启Nginx?**

答：为了通过一个不同的端口开启Nginx，你必须进入/etc/Nginx/sitesenabled/，如果这是默认文件，那么你必须打开名为“default”的文件。编辑文件，并放置在你想要的端口： 
Like server { 
listen 81; 
}



**请解释是否有可能将Nginx的错误替换为502错误、503?**

502 =错误网关 503 =服务器超载 有可能，但是您可以确保fastcgi_intercept_errors被设置为ON，并使用错误页面指令。 
Location / { fastcgi_pass 127.0.01:9001; fastcgi_intercept_errors on; error_page 502 =503/error_page.html; #… }



**在Nginx中，解释如何在URL中保留双斜线?**

要在URL中保留双斜线，就必须使用merge_slashes_off; 
语法:merge_slashes [on/off] 
默认值: merge_slashes on 
环境: http，server



**请解释ngx_http_upstream_module的作用是什么?**

ngx_http_upstream_module用于定义可通过fastcgi传递、proxy传递、uwsgi传递、memcached传递和scgi传递指令来引用的服务器组。



**请解释什么是C10K问题?**

C10K问题是指无法同时处理大量客户端(10,000)的网络套接字。



**请陈述stub_status和sub_filter指令的作用是什么?**

1）Stub_status指令：该指令用于了解Nginx当前状态的当前状态，如当前的活动连接，接受和处理当前读/写/等待连接的总数 2）Sub_filter指令：它用于搜索和替换响应中的内容，并快速修复陈旧的数据



**解释Nginx是否支持将请求压缩到上游?**

您可以使用Nginx模块gunzip将请求压缩到上游。gunzip模块是一个过滤器，它可以对不支持“gzip”编码方法的客户机或服务器使用“内容编码:gzip”来解压缩响应。



**解释如何在Nginx中获得当前的时间?**

要获得Nginx的当前时间，必须使用SSI模块、dategmt和dategmt和date_local的变量。Proxy_set_header THETIME $date_gmt;

**用Nginx服务器解释s的目的是什么?**

用于运行Nginx s参数的可执行文件。

**解释如何在Nginx服务器上添加模块?**

在编译过程中，必须选择Nginx模块，因为Nginx不支持模块的运行时间选择。 
nginx 的 upstream目前支持 4 种方式的分配 
* 轮询（默认） 
    * 每个请求按时间顺序逐一分配到不同的后端服务器，如果后端服务器down掉，能自动剔除。 
* weight 
    * 指定轮询几率，weight和访问比率成正比，用于后端服务器性能不均的情况。 
* ip_hash 
    * 每个请求按访问ip的hash结果分配，这样每个访客固定访问一个后端服务器，可以解决session的问题。 
* fair（第三方） 
    * 按后端服务器的响应时间来分配请求，响应时间短的优先分配。 
* url_hash（第三方） 
    * nginx内置策略包含加权轮询和ip hash 
加权轮询算法分为先深搜索和先广搜索，那么nginx采用的是先深搜索算法，即将首先将请求都分给高权重的机器，直到该机器的权值降到了比其他机器低，才开始将请求分给下一个高权重的机器；

缺省安装的 nginx + phpfpm 环境，假设用户浏览一个耗时的网页，但是却在服务端渲染页面的中途关闭了浏览器，那么请问服务端的 php 脚本是继续执行还是退出执行？
正常情况下，如果客户端client异常退出了，服务端的程序还是会继续执行，直到与IO进行了两次交互操作。服务端发现客户端已经断开连接，这个时候会触发一个user_abort，如果这个没有设置ignore_user_abort，那么这个phpfpm的程序才会被中断。 
拓展阅读：http://www.cnblogs.com/yjf512/p/5362025.html?foxhandler=RssReadRenderProcessHandler



**在Nginx中，请说明Rewrite模块里break和last的区别。**

官方文档的定义如下： 
last：停止执行当前这一轮的ngx_http_rewrite_module指令集，然后查找匹配改变后URI的新location； 
break：停止执行当前这一轮的ngx_http_rewrite_module指令集； 
千言万语举个例子： 
```
location /test1.txt/ { 
    rewrite /test1.txt/ /test2.txt break; 
}

location ~ test2.txt { 
    return 508; 
}

``` 
使用break会匹配两次URL，如果没有满足项，就会停止匹配下面的location,直接发起请求www.xxx.com/test2.txt，由于不存在文件test2.txt，则会直接显示404。 
使用last的话，会继续搜索下面是否有符合条件(符合重写后的/test2.txt请求)的location，匹配十次，如果十次没有得到的结果，那么就跟break一样了。返回上面的例子，/test2.txt刚好与面location的条件对应上了，进入花括号{}里面的代码执行，这里会返回508。（这里的508是我自己随便设定的）



**事件驱动框架：**

nginx事件驱动框架（书本p254）：所谓事件驱动架构，简单来说，就是由一些事件发生源来产生事件，由一个或多个事件收集器（epolld等）来收集、分发事件，然后许多事件处理器会注册自己感兴趣的事件，同时会“消费”这些事件。nginx不会使用进程或线程作为事件消费者，只能是某个模块，当前进程调用模块。

传统web服务器（如Apache）的，所谓事件局限在TCP连接建立、关闭上，其他读写都不在是事件驱动，这时会退化成按序执行每个操作的批处理模式，这样每个请求在连接建立后都将始终占用系统资源，直到连接关闭才会释放资源。大大浪费了内存、cpu等资源。并且把一个进程或线程作为事件消费者。 
传统web服务器与Nginx间重要差别： 
前者每个事件消费者独占一个进程资源，后者只是被事件分发者进程短期调用而已。



**请求的多阶段异步处理**

请求的多阶段异步处理只能基于事件驱动框架实现，就是把一个请求的处理过程按照事件的触发方式分为多个阶段，每个阶段都可以有事件收集、分发器（epoll等）来触发。比如一个http请求可以分为七个阶段

一个master进程（管理），多个work（工作）进程。
master对work进程采用信号进行控制

平台无关的代码实现：
在核心代码都使用了与操作系统无关的代码实现，在与操作系统相关的系统调用上则分别针对各个操作系统都有独立实现，这最终造就了Nginx的可移植性。



**内存池的设计**

为了减少避免出现内存碎片、减少向操作系统申请内存的次数、降低各个模块的开发复杂度，Nginx采用了简单的内存池（统一申请，统一释放）。比如为每个http请求分配一个内存池，请求结束时销毁整个内存池。



**什么是Nginx？**

Nginx是一个高性能的HTTP和反向代理服务器，及电子邮件（IMAP/POP3）代理服务器，同时也是一个非常高效的反向代理、负载平衡。 
多进程异步非阻塞事件处理机制：运用了epoll模型



**为什么要用Nginx？**

* 优点：    
    * 跨平台、配置简单 
    * 非阻塞、高并发连接：能够支持10万的并发请求，理论上并发数取决于内存，
    * 内存消耗小：开启10个nginx才占150M内存，Nginx采取了分阶段资源分配技术 
    * nginx处理静态文件好,耗费内存少 
    * 内置的健康检查功能：如果有一个服务器宕机，会做一个健康检查，再发送的请求就不会发送到宕机的服务器了。重新将请求提交到其他的节点上。    
    * 节省宽带：支持GZIP压缩，可以添加浏览器本地缓存 
    * 稳定性高：宕机的概率非常小 
    * master/worker结构：一个master进程，生成一个或者多个worker进程 
    * 接收用户请求是异步的：浏览器将请求发送到nginx服务器，它先将用户请求全部接收下来，再一次性发送给后端web服务器，极大减轻了web服务器的压力 
    * 一边接收web服务器的返回数据，一边发送给浏览器客户端 
    * 网络依赖性比较低，只要ping通就可以负载均衡 
    * 可以有多台nginx服务器 
    * 事件驱动：通信机制采用epoll模型
    * 更快，单次请求响应快，高并发下响应也很快
    * 高扩展性，模块化设计，扩展方便
    * 热部署，不停止服务的前提下，升级nginx的可执行文件，也支持更新配置项，更换日志文件等
  



**什么Nginx性能这么高？**

得益于它的事件处理机制： 
异步非阻塞事件处理机制：运用了epoll模型，提供了一个队列，排队解决



**为什么不使用多线程？**

Apache: 创建多个进程或线程，而每个进程或线程都会为其分配cpu和内存（线程要比进程小的多，所以worker支持比perfork高的并发），并发过大会榨干服务器资源。

Nginx: 采用单线程来异步非阻塞处理请求（管理员可以配置Nginx主进程的工作进程的数量）(epoll)，不会为每个请求分配cpu和内存资源，节省了大量资源，同时也减少了大量的CPU的上下文切换。所以才使得Nginx支持更高的并发。

**Nginx是如何处理一个请求的呢？**

首先，nginx在启动时，会解析配置文件，得到需要监听的端口与ip地址，然后在nginx的master进程里面 
先初始化好这个监控的socket，再进行listen 
然后再fork出多个子进程出来, 子进程会竞争accept新的连接。 
此时，客户端就可以向nginx发起连接了。当客户端与nginx进行三次握手，与nginx建立好一个连接后 
此时，某一个子进程会accept成功，然后创建nginx对连接的封装，即ngx_connection_t结构体 
接着，根据事件调用相应的事件处理模块，如http模块与客户端进行数据的交换。 
最后，nginx或客户端来主动关掉连接，到此，一个连接就寿终正寝了



**正向代理**

一个位于客户端和原始服务器(origin server)之间的服务器，为了从原始服务器取得内容，客户端向代理发送一个请求并指定目标(原始服务器)，然后代理向原始服务器转交请求并将获得的内容返回给客户端。客户端才能使用正向代理 
正向代理总结就一句话：代理端代理的是客户端



**反向代理**

反向代理（Reverse Proxy）方式是指以代理服务器来接受internet上的连接请求，然后将请求，发给内部网络上的服务器 
并将从服务器上得到的结果返回给internet上请求连接的客户端，此时代理服务器对外就表现为一个反向代理服务器 
反向代理总结就一句话：代理端代理的是服务端



**负载均衡**

负载均衡即是代理服务器将接收的请求均衡的分发到各服务器中 
负载均衡主要解决网络拥塞问题，提高服务器响应速度，服务就近提供，达到更好的访问质量，减少后台服务器大并发压力

 

**为什么不使用多线程？**

* Apache: 创建多个进程或线程，而每个进程或线程都会为其分配cpu和内存（线程要比进程小的多，所以worker支持比perfork高的并发），并发过大会榨干服务器资源。
* Nginx: 采用单线程来异步非阻塞处理请求（管理员可以配置Nginx主进程的工作进程的数量）(epoll)，不会为每个请求分配cpu和内存资源，节省了大量资源，同时也减少了大量的CPU的上下文切换。所以才使得Nginx支持更高的并发。

**Nginx是如何处理一个请求的呢？**

首先，nginx在启动时，会解析配置文件，得到需要监听的端口与ip地址，然后在nginx的master进程里面
先初始化好这个监控的socket，再进行listen
然后再fork出多个子进程出来, 子进程会竞争accept新的连接。
此时，客户端就可以向nginx发起连接了。当客户端与nginx进行三次握手，与nginx建立好一个连接后，此时，某一个子进程会accept成功，然后创建nginx对连接的封装，即ngx_connection_t结构体接着，根据事件调用相应的事件处理模块，如http模块与客户端进行数据的交换，最后，nginx或客户端来主动关掉连接，到此，一个连接就寿终正寝了

**动态资源、静态资源分离的原因**

动态资源、静态资源分离是让动态网站里的动态网页根据一定规则把不变的资源和经常变的资源区分开来，动静资源做好了拆分以后，我们就可以根据静态资源的特点将其做缓存操作，这就是网站静态化处理的核心思路
动态资源、静态资源分离简单的概括是：动态文件与静态文件的分离
二者分离的原因
在我们的软件开发中，有些请求是需要后台处理的（如：.jsp,.do等等），有些请求是不需要经过后台处理的（如：css、html、jpg、js等等文件）
这些不需要经过后台处理的文件称为静态文件，否则动态文件。因此我们后台处理忽略静态文件。这会有人又说那我后台忽略静态文件不就完了吗
当然这是可以的，但是这样后台的请求次数就明显增多了。在我们对资源的响应速度有要求的时候，我们应该使用这种动静分离的策略去解决
动、静分离将网站静态资源（HTML，JavaScript，CSS，img等文件）与后台应用分开部署，提高用户访问静态代码的速度，降低对后台应用访问
这里我们将静态资源放到nginx中，动态资源转发到tomcat服务器中





# 2. 安装和使用

## 2.1. 使用包管理器安装

**Linux**
```
sudo apt-get install nginx
```
**rpm**
```
sudo yum install nginx
```

## 2.2. 使用二进制文件安装

下载并解压nginx的二进制文件，进入目录

```
~/java/nginx1.17.9$ ls l
total 784
rwrr 1 lgj lgj 302630 Mar  3 23:04 CHANGES
rwrr 1 lgj lgj 461926 Mar  3 23:04 CHANGES.ru
rwrr 1 lgj lgj   1397 Mar  3 23:04 LICENSE
rwrr 1 lgj lgj     49 Mar  3 23:04 README
drwxrxrx 6 lgj lgj   4096 Mar  3 23:04 auto
drwxrxrx 2 lgj lgj   4096 Mar  3 23:04 conf
rwxrxrx 1 lgj lgj   2502 Mar  3 23:04 configure
drwxrxrx 4 lgj lgj   4096 Mar  3 23:04 contrib
drwxrxrx 2 lgj lgj   4096 Mar  3 23:04 html
drwxrxrx 2 lgj lgj   4096 Mar  3 23:04 man
drwxrxrx 9 lgj lgj   4096 Mar  3 23:04 src
```

```bash
#1.运行configure，才会生成makefile 文件
 ./configure prefix=/usr/local/nginx user=nginx group=nginx  
#如果出错
./configure: error: the HTTP gzip module requires the zlib library.
You can either disable the module by using --without-http_gzip_module
option, or install the zlib library into the system, or build the zlib library
statically from the source with nginx by using --with-zlib=<path> option.


#2.编译并安装
make && make install 
```

* configure命令做了大量的“幕后”工作， 包括检测操作系统内核和已经安装的软件， 参数的解析， 中间目录的生成以及根据各种参数生成一些C源码文件、 Makefile文件等。
* make命令根据configure命令生成的Makefile文件编译Nginx工程， 并生成目标文件、 最终的二进制文件。
* make install命令根据configure执行时的参数将Nginx部署到指定的安装目录， 包括相关目录的建立和二进制文件、 配置文件的复制。

如果失败，可能以下工具没有进行安装

1. GCC——GNU编译器集合（GCC可以使用默认包管理器的仓库（repositories）来安装，包管理器的选择依赖于你使用的Linux发布版本，包管理器有不同的实现：yum是基于Red Hat的发布版本；apt用于Debian和Ubuntu；yast用于SuSE Linux等等。）
* RedHat中安装GCC：yum install gcc
* Ubuntu中安装GCC：aptget install gcc

2. PCRE库（Nginx编译需要PCRE（Perl Compatible Regular Expression），因为Nginx的Rewrite模块和HTTP核心模块会使用到PCRE正则表达式语法。这里需要安装两个安装包pcre和pcredevel。第一个安装包提供编译版本的库，而第二个提供开发阶段的头文件和编译项目的源代码，这正是我们需要的理由。）
* RedHat中安装PCRE：yum install pcre pcredevel
* Ubuntu中安装PCRE：aptget install libpcre3 libpcre3dev

3. zlib库（zlib库提供了开发人员的压缩算法，在Nginx的各种模块中需要使用gzip压缩。如同安装PCRE一样，同样需要安装库和它的源代码：zlib和zlibdevel。）
* RedHat中安装zlib：yum install zlib zlibdevel
* Ubuntu中安装zlib：aptget install zlib1g zlib1gdev

4. OpenSSL库（在Nginx中，如果服务器提供安全网页时则会用到OpenSSL库，我们需要安装库文件和它的开发安装包（openssl和openssldevel）。）
* RedHat中安装OpenSSL：yum install openssl openssldevel
* Ubuntu中安装OpenSSL：（注：Ubuntu14.04的仓库中没有发现openssldev）：aptget install openssl openssldev

## 2.3. docker 方式安装

```sh
 下载镜像
docker pull nginx

 运行,端口配置为8080
 docker run name nginxtest p 8080:80 d nginx

#启动时配置数据卷,-d后台运行　
docker run --name nginx-test -v /home/lgj/docker-volume/nginx:/etc/nginx -p 8555:80 -d nginx

#进入容器
docker exec -it image_id /bin/bash
```

## 2.4. configure配置说明

**查看已经安装的模块**
```　
nginx V
```
### 2.4.1. 常见配置说明

使用help命令可以查看configure包含的参数: ./configure help

```yml
–prefix=<path> – Nginx安装路径。如果没有指定，默认为 /usr/local/nginx。 
–sbinpath=<path> – Nginx可执行文件安装路径。只能安装时指定，如果没有指定，默认为<prefix>/sbin/nginx。 
–confpath=<path> – 在没有给定c选项下默认的nginx.conf的路径。如果没有指定，默认为<prefix>/conf/nginx.conf。 
–pidpath=<path> – 在nginx.conf中没有指定pid指令的情况下，默认的nginx.pid的路径。如果没有指定，默认为 <prefix>/logs/nginx.pid。 
–lockpath=<path> – nginx.lock文件的路径。 
–errorlogpath=<path> – 在nginx.conf中没有指定error_log指令的情况下，默认的错误日志的路径。如果没有指定，默认为 <prefix>/logs/error.log。 
–httplogpath=<path> – 在nginx.conf中没有指定access_log指令的情况下，默认的访问日志的路径。如果没有指定，默认为 <prefix>/logs/access.log。 
–user=<user> – 在nginx.conf中没有指定user指令的情况下，默认的nginx使用的用户。如果没有指定，默认为 nobody。 
–group=<group> – 在nginx.conf中没有指定user指令的情况下，默认的nginx使用的组。如果没有指定，默认为 nobody。 
–builddir=DIR – 指定编译的目录 
–withrtsig_module – 启用 rtsig 模块 
–withselect_module –withoutselect_module – 允许或不允许开启SELECT模式，如果 configure 没有找到更合适的模式，比如：kqueue(sun os),epoll (linux kenel 2.6+), rtsig(实时信号)或者/dev/poll(一种类似select的模式，底层实现与SELECT基本相 同，都是采用轮训方法) SELECT模式将是默认安装模式 
–withpoll_module –withoutpoll_module – Whether or not to enable the poll module. This module is enabled by default if a more suitable method such as kqueue, epoll, rtsig or /dev/poll is not discovered by configure. 
–withhttp_ssl_module – 开启HTTP SSL模块，使NGINX可以支持HTTPS请求。这个模块需要已经安装了OPENSSL，在DEBIAN上是libssl 
–withhttp_realip_module – 启用 ngx_http_realip_module 
–withhttp_addition_module – 启用 ngx_http_addition_module 
–withhttp_sub_module – 启用 ngx_http_sub_module 
–withhttp_dav_module – 启用 ngx_http_dav_module 
–withhttp_flv_module – 启用 ngx_http_flv_module 
–withhttp_stub_status_module – 启用 “server status” 页 
–withouthttp_charset_module – 禁用 ngx_http_charset_module 
–withouthttp_gzip_module – 禁用 ngx_http_gzip_module. 如果启用，需要 zlib 。 
–withouthttp_ssi_module – 禁用 ngx_http_ssi_module 
–withouthttp_userid_module – 禁用 ngx_http_userid_module 
–withouthttp_access_module – 禁用 ngx_http_access_module 
–withouthttp_auth_basic_module – 禁用 ngx_http_auth_basic_module 
–withouthttp_autoindex_module – 禁用 ngx_http_autoindex_module 
–withouthttp_geo_module – 禁用 ngx_http_geo_module 
–withouthttp_map_module – 禁用 ngx_http_map_module 
–withouthttp_referer_module – 禁用 ngx_http_referer_module 
–withouthttp_rewrite_module – 禁用 ngx_http_rewrite_module. 如果启用需要 PCRE 。 
–withouthttp_proxy_module – 禁用 ngx_http_proxy_module 
–withouthttp_fastcgi_module – 禁用 ngx_http_fastcgi_module 
–withouthttp_memcached_module – 禁用 ngx_http_memcached_module 
–withouthttp_limit_zone_module – 禁用 ngx_http_limit_zone_module 
–withouthttp_empty_gif_module – 禁用 ngx_http_empty_gif_module 
–withouthttp_browser_module – 禁用 ngx_http_browser_module 
–withouthttp_upstream_ip_hash_module – 禁用 ngx_http_upstream_ip_hash_module 
–withhttp_perl_module – 启用 ngx_http_perl_module 
–withperl_modules_path=PATH – 指定 perl 模块的路径 
–withperl=PATH – 指定 perl 执行文件的路径 
–httplogpath=PATH – Set path to the http access log 
–httpclientbodytemppath=PATH – Set path to the http client request body temporary files 
–httpproxytemppath=PATH – Set path to the http proxy temporary files 
–httpfastcgitemppath=PATH – Set path to the http fastcgi temporary files 
–withouthttp – 禁用 HTTP server 
–withmail – 启用 IMAP4/POP3/SMTP 代理模块 
–withmail_ssl_module – 启用 ngx_mail_ssl_module 
–withcc=PATH – 指定 C 编译器的路径 
–withcpp=PATH – 指定 C 预处理器的路径 
–withccopt=OPTIONS – Additional parameters which will be added to the variable CFLAGS. With the use of the system library PCRE in FreeBSD, it is necessary to indicate –withccopt=”I /usr/local/include”. If we are using select() and it is necessary to increase the number of file descriptors, then this also can be assigned here: –withccopt=”D FD_SETSIZE=2048″. 
–withldopt=OPTIONS – Additional parameters passed to the linker. With the use of the system library PCRE in FreeBSD, it is necessary to indicate –withldopt=”L /usr/local/lib”. 
–withcpuopt=CPU – 为特定的 CPU 编译，有效的值包括：pentium, pentiumpro, pentium3, pentium4, athlon, opteron, amd64, sparc32, sparc64, ppc64 
–withoutpcre – 禁止 PCRE 库的使用。同时也会禁止 HTTP rewrite 模块。在 “location” 配置指令中的正则表达式也需要 PCRE 。 
–withpcre=DIR – 指定 PCRE 库的源代码的路径。 
–withpcreopt=OPTIONS – Set additional options for PCRE building. 
–withmd5=DIR – Set path to md5 library sources. 
–withmd5opt=OPTIONS – Set additional options for md5 building. 
–withmd5asm – Use md5 assembler sources. 
–withsha1=DIR – Set path to sha1 library sources. 
–withsha1opt=OPTIONS – Set additional options for sha1 building. 
–withsha1asm – Use sha1 assembler sources. 
–withzlib=DIR – Set path to zlib library sources. 
–withzlibopt=OPTIONS – Set additional options for zlib building. 
–withzlibasm=CPU – Use zlib assembler sources optimized for specified CPU, valid values are: pentium, pentiumpro 
–withopenssl=DIR – Set path to OpenSSL library sources 
–withopensslopt=OPTIONS – Set additional options for OpenSSL building 
–withdebug – 启用调试日志 
–addmodule=PATH – Add in a thirdparty module found in directory PATH 


```

在不同版本间，选项可能会有些许变化，请总是使用 ./configure –help 命令来检查

### 2.4.2. Nginx重新编译添加模块的方法

1. 找到安装nginx的源码根目录(即安装包存放目录)，如果没有的话下载新的源码并解压
2. 查看nginx版本极其编译参数
3. 进入nginx源码目录,重新编译的代码和模块
```
./configure prefix=/usr/local/nginx withhttp_ssl_module
```
4. 执行 make （注意：千万别 make install ，否则就覆盖安装了）， make完之后在objs目录下就多了个nginx，这个就是新版本的程序了。
5. 备份旧的nginx程序,防止出错时恢复原来的程序
6. 把新的nginx程序复制到/usr/local/nginx/sbin/下
7. 测试新的nginx程序是否正确

```
nginx t
nginx: the configuration file /usr/local/nginx/conf/nginx.conf syntax is ok
nginx: configuration file /usr/local/nginx/conf/nginx.conf test is successful
```
8. 平滑启动服务
```
nginx s reload
```

查看模块是否已安装
```
/usr/local/nginx/sbin/nginx V
nginx version: nginx/1.10.2
built by gcc 4.8.5 20150623 (Red Hat 4.8.54) (GCC)
built with OpenSSL 1.0.1efips 11 Feb 2013
TLS SNI support enabled
configure arguments: prefix=/usr/local/nginx withhttp_ssl_module
```

9. 重启Nginx
```
./nginx s quit
./nginx
```
nginx重新加载模块完成！

### 2.4.3. 安装第三方模块　

下载第三方模块的源码后，将使用 addmodule进行添加，
```
./configure –prefix=/你的安装目录 addmodule=/第三方模块目录 
```

其他操作步骤如上一节内容．

nginx　提供了很多的第三方(模块链接)[https://www.nginx.com/resources/wiki/modules/index.html]:https://www.nginx.com/resources/wiki/modules/index.html

### 2.4.4. 常用命令

* nginx 
    * 启动,默认使用configure配置的路径(–confpath)
    * nginx -c　con.conf 可指定其他配置文件
* nginx -p /usr/local/nginx/
    * 使用p参数指定Nginx的安装目录
* nginx -g "pid varnginx/test.pid;"
    * 通过g参数临时指定一些全局配置项， 以使新的配置项生效
    * g参数的约束条件是指定的配置项不能与默认路径下的nginx.conf中的配置项相冲突
    * 以g方式启动的Nginx服务执行其他命令行时， 需要把g参数也带上， 否则可能出现配置项不匹配的情形
        * nginx -g "pid varnginx/test.pid;" s stop
* nginx -t -c 
    * 测试配置文件语法是否有错误,-c可显示更详细的内容
* nginx -t -q
    * 测试配置选项时， 使用q参数可以不把error级别以下的信息输出到屏幕
* nginx -v
    * 显示版本信息
* nginx -V
    * 显示编译阶段的参数
* nginx -s signal : 用于发送信号
    * stop          
        * 快速地停止服务 
    * quit
        * “优雅”地停止服务 
    * reload
        * 使用-s reload参数可以使运行中的Nginx服务重新加载nginx.conf文件
        * Nginx会先检查新的配置项是否有误， 如果全部正确就以“优雅”的方式关闭，再重新启动Nginx来实现这个目的
    * reopen
        * 使用-s reopen参数可以重新打开日志文件， 这样可以先把当前日志文件改名或转移到其他目录中进行备份， 再重新打开时就会生成新的日志文件。 这个功能使得日志文件不至于过大。
* 平滑升级Nginx
    * 当Nginx服务升级到新的版本时， 必须要将旧的二进制文件Nginx替换掉， 通常情况下这是需要重启服务的， 但Nginx支持不重启服务来完成新版本的平滑升级
    * 步骤
        * 通知正在运行的旧版本Nginx准备升级。 通过向master进程发送USR2信号可达到目的
            * kill s SIGUSR2 <　nginx master pid>
        * 启动新版本的Nginx， 可以使用以上介绍过的任意一种启动方法
        * 通过kill命令向旧版本的master进程发送SIGQUIT信号， 以“优雅”的方式关闭旧版本的Nginx。 随后将只有新版本的Nginx服务运行， 此时平滑升级完毕

Ｎginx可接收的信号(kill signal pid)
* TERM或者INT: 快速停止nginx服务
* QUIT: 平缓停止nginx服务
* HUP: 使用新的配置文件启动进程，之后平缓停止原有的进程，也就是平滑启动
* USR1: 重新打开日志文件，常用于日志切割
* USR2: 使用新版本的nginx文件启动服务，之后平缓地停止原有的nginx进程，也就是平滑升级
* WINCH: 平缓停止worker process，用于nginx平滑升级


# 3. 配置文件
<a href="#menu" >目录</a>



## 3.1. 内核参数优化
<a href="#menu" >目录</a>

**文件: /etc/sysctl.conf**
```
fs.filemax = 999999
net.ipv4.tcp_tw_reuse = 1
net.ipv4.tcp_keepalive_time = 600
net.ipv4.tcp_fin_timeout = 30
net.ipv4.tcp_max_tw_buckets = 5000
net.ipv4.ip_local_port_range = 1024 61000
net.ipv4.tcp_rmem = 4096 32768 262142
net.ipv4.tcp_wmem = 4096 32768 262142
net.core.netdev_max_backlog = 8096
net.core.rmem_default = 262144
net.core.wmem_default = 262144
net.core.rmem_max = 2097152
net.core.wmem_max = 2097152
net.ipv4.tcp_syncookies = 1
net.ipv4.tcp_max_syn.backlog=1024

```
然后执行sysctlp命令， 使上述修改生效。

* filemax： 这个参数表示进程（比如一个worker进程） 可以同时打开的最大句柄数， 这个参数直接限制最大并发连接数， 需根据实际情况配置。
* tcp_tw_reuse： 这个参数设置为1， 表示允许将TIMEWAIT状态的socket重新用于新的TCP连接， 这对于服务器来说很有意义， 因为服务器上总会有大量TIMEWAIT状态的连接。
* tcp_keepalive_time： 这个参数表示当keepalive启用时， TCP发送keepalive消息的频度。默认是2小时， 若将其设置得小一些， 可以更快地清理无效的连接。
* tcp_fin_timeout： 这个参数表示当服务器主动关闭连接时， socket保持在FINWAIT2状态的最大时间。
* tcp_max_tw_buckets： 这个参数表示操作系统允许TIME_WAIT套接字数量的最大值，如果超过这个数字， TIME_WAIT套接字将立刻被清除并打印警告信息。 该参数默认为180000， 过多的TIME_WAIT套接字会使Web服务器变慢。
* tcp_max_syn_backlog： 这个参数表示TCP三次握手建立阶段接收SYN请求队列的最大长度， 默认为1024， 将其设置得大一些可以使出现Nginx繁忙来不及accept新连接的情况时，Linux不至于丢失客户端发起的连接请求。
* ip_local_port_range： 这个参数定义了在UDP和TCP连接中本地（不包括连接的远端）端口的取值范围。
* net.ipv4.tcp_rmem： 这个参数定义了TCP接收缓存（用于TCP接收滑动窗口） 的最小值、 默认值、 最大值。
* net.ipv4.tcp_wmem： 这个参数定义了TCP发送缓存（用于TCP发送滑动窗口） 的最小值、 默认值、 最大值。
* netdev_max_backlog： 当网卡接收数据包的速度大于内核处理的速度时， 会有一个队列保存这些数据包。 这个参数表示该队列的最大值。
* rmem_default： 这个参数表示内核套接字接收缓存区默认的大小。
* wmem_default： 这个参数表示内核套接字发送缓存区默认的大小。
* rmem_max： 这个参数表示内核套接字接收缓存区的最大大小。
* wmem_max： 这个参数表示内核套接字发送缓存区的最大大小。
* tcp_syncookies： 该参数与性能无关， 用于解决TCP的SYN攻击。

滑动窗口的大小与套接字缓存区会在一定程度上影响并发连接的数目。 每个TCP连接都会为维护TCP滑动窗口而消耗内存， 这个窗口会根据服务器的处理速度收缩或扩张。
参数wmem_max的设置， 需要平衡物理内存的总大小、 Nginx并发处理的最大连接数量（由nginx.conf中的worker_processes和worker_connections参数决定） 而确定。 当然， 如果仅仅
为了提高并发量使服务器不出现Out Of Memory问题而去降低滑动窗口大小， 那么并不合适， 因为滑动窗口过小会影响大数据量的传输速度。 rmem_default、 wmem_default、rmem_max、wmem_max这4个参数的设置需要根据我们的业务特性以及实际的硬件成本来综合考虑。

## 3.2. Nginx中的进程
<a href="#menu" >目录</a>

nginx使用一个master进程管理多个worker进程，一般worker进程和cpu数量相同．每一个worker进程都是繁忙的， 它们在真正地提供互联网服务， master进程则很“清闲”， 只负责监控管理worker进程。 worker进程之间通过共享内存、 原子操作等一些进程间通信机制来实现负载均衡等功能．

![进程设计思想](pic/nginx/masterworker.png)

* 由于master进程不会对用户请求提供服务， 只用于管理真正提供服务的worker进程，所以master进程可以是唯一的， 它仅专注于自己的纯管理工作， 为管理员提供命令行服务，包括诸如启动服务、 停止服务、 重载配置文件、 平滑升��程序等
* master进程需要拥有较大的权限， 例如， 通常会利用root用户启动master进程。 worker进程的权限要小于或等于master进程， 这样master进程才可以完全地管理worker进程。 当任意一个worker进程出现错误从而导致coredump时， master进程会立刻启动新的worker进程继续服务。
* 多个worker进程处理互联网请求不但可以提高服务的健壮性（一个worker进程出错后， 其他worker进程仍然可以正常提供服务） ， 最重要的是， 这样可以充分利用现在常见的SMP多核架构， 从而实现微观上真正的多核并发处理
* 一个worker进程可以同时处理的请求数只受限于内存大小， 而且在架构设计上， 不同的worker进程之间处理并发请求时几乎没有同步锁的限制， worker进程通常不会进入睡眠状态， 因此， 当Nginx上的进程数与CPU核心数相等时（最好每一个worker进程都绑定特定的CPU核心） ， 进程间切换的代价是最小的

## 3.3. 配置文件结构 
<a href="#menu" >目录</a>

```
main
events{
    KEY VALUE;
}
http{
    server{
        localtion{

        }
    }
}
```
* 每条指令必须以分号结束
* 参数配置形式:   KEY VALUE;
* 语句块内的配置只在其块内或者子块里生效，main部分为全局有效，如果外层块同样配置了相同的指令，则以内部配置为准
* 执行顺序由外至内依次执行
* 内层块中的大部分指令会自定获取外层块的指令作为默认值，只有某些特殊指令除外
* 注释使用#
* 配置项的值可以有数字/字符串/正则表达式．可能可以有多个值，每个值之间使用空格隔开
* 大小单位: K/k/M/m. 时间单位: y/M/w/d/h/m/s/ms
* 使用已经存在的变量: $memory,这种变量只有在极少数模块中存在


**全局块**

从配置文件开始到events之间的配置内容。主要设置一些影响nginx服务器整体运行的配置指令。这些指令是全局起作用的。通常包括了运行的用户或者用户组，允许生成的worker process数，nginx进程片pid文件路径，日志的存放路径和类型以及配置文件引入等

**events块**

主要是nginx服务器和用户的连接配置。通常配置是否开启worker process　下的网络连接进行序列化，是否允许同时接收多个网络连接，选取哪种事件驱动模型，每个worker process可以同时支持的最大连接数等。

**http块**

主要用于配置服务器相关的，包括代理，缓存，虚拟主机等。同时，可以在http块内引入配置文件，MIME-Type定义，日志自定义，是否使用sendfile传输文件，连接超时时间，单连接请求数上限等

**server块**

虚拟主机的配置，每一个server都是一个虚拟主机。配置比如监听的端口，监听的ip地址，域名等。

**location块**

对请求路径进行匹配定义。

**基本的配置文件**

```bash
worker_processes 1;
events{
    worker_connections 1024;
}
http{
    include    mime.types;
    sendfile on;

    server{
        listen  8081;
        server_name localhost;
        #localhost:8081/
        localtion /{
            root html;
            index index.html;
        }
        #localhost:8081/app
        localtion /app{
            root html;
            index index.html;
        }

    }
}

```

## 3.4. 全局配置参数
<a href="#menu" >目录</a>

### 3.4.1. 常用配置 
<a href="#menu" >目录</a>

* 用于配置运行nginx的用户或者用户组：　user userName [group];
    * 全局块配置
    * userName 可以运行nginx的用户、
    * group 用户组，可选
    * 只有配置了的用户或者用户组才可以启动，否则将报错
    * 支持所有用户
        * 删除配置，默认支持所有用户
        * 或者配置:user nobody nobody 
        
* 工作进程数：worker_process num|auto
    * 全局块配置
    * nginx工作由master进程和worker进程配合完成，worker负责具体的请求处理
    * worker_process越大，理论上支持的并发处理量也越大，实际上还受到计算机硬件的限制 
    * num 默认为1
    * auto 为自动检测
    * 配置完成可以通过:ps -ef | grep nginx　进行查看
    
* pid文件的存放路径: pid path/file;
    * 全局块配置
    * 用于存储nginx主进程的进程号
    * 默认为安装目录下的 logs/nginx.pid
    * 路径需要包含文件名

* 配置文件的引入: include file;
    * 任何位置
    * 在一些情况下，需要将其他nginx的配置或者第三方模块的配置引用到当前的主配置文件中
    * 使用通配符: include  /xx/*．conf
    * 如果没有给定全路径，那么将会按照主配置文件路径进行搜索
    * 使用以下命令测试配置文件的语法正确性: nginx -t -c nginx.conf

* 配置最大连接数：　worker_connections number;
    * 只能在events中进行配置
    * 默认值512
    * 配置 Nginx 允许单个进程并发连接的最大请求数,只是接收而已，处理还是串行处理请求
    * 该指令配置一个工作进程能够接受并发连接的最大数。这个连接包括客户连接和向上游服务器的连接，但并不限于此。这对于反向代理服务器尤为重要，为了达到这个并发性连接数量，需要在操作系统层面进行一些额外调整
    * 每个worker_process 同时开启的最大连接数

* 设置默认文件类型: default_type type;

* 开启高效文件传输模式: send_file on|off
    * 可以在http，server,location中进行配置
    * 默认值为on
    * sendfile_max_chunk size;
        * size如果大于0，则nginx进程的每个worker每次调用sendfile（）传输的数据量最大不能超过这个值，为0则没有限制，默认值为0。
    
* 设置长连接超时时间（单位：秒）: keepalive_timeout time [header_timeout];
    * 可以在http，server,location中进行配置
    * time：服务器对连接的保持时间，默认值75s
    * header_timeout,可选项。在应答报文头部的Keep－Alive域设置超时时间

* 单连接请求数上限: keepalive_requests number
    * 可以在server,location中进行配置
    * nginx通过单连接发送请求的上限,默认值为100

* 事件驱动模型的选择: use select|poll|kqueue|epoll|rtsig|/dev/poll|eventport
    * 只能在events中进行配置


* 自定义错误页面: error_page file;

* 设置网络连接的序列化: accept_mutex on|off;
    * 只能在events中进行配置
    * 惊群效应:当某一时刻只有一个网络连接到来时，多个睡眠的进程会被同时叫醒，但只有一个进程可获得连接，如果每次唤醒的数目太多，会影响一部分性能。nginx也存在这样的问题。
    * on 为开启连接序列化，防止进程争抢一个连接。不过由于一般nginx的worker设置和cpu个数相同，即使发生惊群效应，影响也不大。只有那些有几十几百个进程处理连接的应用才会影响性能。
    
    
* 设置是否允许同时接入多个网络连接:multi_accept on | off;
    * 只能在events中进行配置
    * 每个worker_process 都有能力同时接收多个新到达的网络连接
    * 默认off,即一次只能接收一个新到达的网络连接



* 定义mimetype
    * 可以在http，server,location中进行配置
    * 配置支持http请求的不同资源类型
    * include mime.types;
        * 引入外部的配置文件，里面定义了一个 types结构，包含了浏览器能够识别的MIME类型以及对应相关类型的文件后缀名
        * types也是nginx的一个配置块
    * default_type mime_type;
        * 用于处理前端请求的MIME类型
        * 默认是text/plain
        * 可以在http/server/location中进行配置
```yml
$ cat mime.types 

types {
    text/html                             html htm shtml;
    text/css                              css;
    text/xml                              xml;
    image/gif                             gif;
}
```

* 自定义服务日志
    * 服务日志: 记录nginx服务器提供服务过程应答前端请求的日志
    * access_log path[format[buffer=size]]
        * path: 服务日志存放的路径和名称
        * format: 可选项，服务日志的格式字符串
        * size： 存放日志的内存缓冲区
        * 可以在http/server/location中进行配置
        * 如果要取消: access_log off;


### 3.4.2. 日志文件
<a href="#menu" >目录</a>

#### 3.4.2.1. 访问日志
<a href="#menu" >目录</a>

访问日志 主要用于记录客户端访问 Ng inx 的每一个请求，格式可通过 log_format 指令进行自定义，存储路径、缓存大小等可使用 access_ log 指令设置 。 通过访问日志的配置，可以记录用户 IP 、访问时间、请求方式、响应状态、地域来源、跳转来源、使用终端等信息 

Nginx 默认开启了访问日志的功能，且 log_format 指令的配置仅可用在http块内， 否则会出现警告信息 

```yml
#定义格式
log_format my_log_format_name '$remote_addr ...'
#指定保存的文件
access_log 1ogs/access.log my_log_format_name buffer=2k flush=5s;

#关闭访问日志功能
access_log　off;
```

|内置变量 |含义|
|||
|$remote_addr| 客户端的 IP 地址
|$remote_user| 客户端用户名，用于记录浏览者进行身份验证时提供的名称，如果没有登录则 为空
|$time_local| 访问的时间与时区，如 21/Sep/2016:12:21,25 + 0800 ，时间信息最后的+ o8oo 表示服务器所处时区位于 UTC 之后的 8 小时
|$request| 请求的 URI 和 HTTP 协议，如 GET /HTTP/1.1
|$status |记录请求返回的 HTTP 状态码，如 200（成功）
|$body_bytes_sent |发送给客户端的文件主体内容的大小，如 899
|$http_referer |来路 URL 地址
|$http_user_agent |客户端浏览器信息
|$http_x_forwarded_for| 客户端 IP 地址列表（包括中间 经过的代理 ）



#### 3.4.2.2. 错误日志
<a href="#menu" >目录</a>

**配置错误文件的存放路径**
* 全局块，http,server都可以对日志进行相关的配置
* error_log file|stderr  [debug|info|notice|warn|error|crit|aletr|emerg]
    * 任何位置配置
    * file 输出到文件 ，此时file 为文件路径
    * stderr输出到标准错误
    * error  /log/nginx.log  info;

emerg紧急级别，意味着nginx没有启动，有可能是配置文件出现错误。注意 debug 级别只有在 configure 时选择了--with-debug 选项才可以使用。


错误日志文件
```yml
2012/10/14 18:50:34 [error] 2632#0: *1 open() "/opt/nginx/html/blog"
failed (2: No such file or directory), client: 127.0.0.1, server: www.
example.com, request: "GET /blog HTTP/1.0", host: "www.example.com"
```
* 时间戳（2012/10/14 18:50:34）；
* 日志级别（error）；
* 运行 pid（2632）；
* 连接数（1）；
* 系统调用（open）；
* 系统调用的参数（/opt/nginx/html/blog）；
* 从系统调用产生的错误消息（2: No such file or directory）；
* 造成错误请求的客户端（127.0.0.1）；
* 负责处理请求的 server（www.example.com）；
* 请求本身（GET /blog Http/1.0）；
* 在请求中发送的 Host 头（www.example.com）

**关闭错误日志**
```
error_log /dev/null ;
```
上述配置的含义就是，将错误日志信息全部输出到 Linux 的空设备中，表示丢掉输出信息，也可以将其当做一个“垃圾桶”。


#### 3.4.2.3. 日志文件切割
<a href="#menu" >目录</a>

nginx本身不自带日志文件自行切割功能，需要自行编写脚本实现．

## 3.5. 虚拟主机server配置
<a href="#menu" >目录</a>

虚拟主机技术是指在一台物理主机服务器上划分出多个磁盘空间，每个磁盘空间都是一台虚拟主机，每台虚拟主机都可以独立对外提供 Web 服务，且互不干扰 。 在外界看来，虚拟主机就是一台 独立的服务器主机，这就意味着用户能够利用虚拟主机把多个不同域名的网站部署在同 一台 服务器上，而不必再为建立一个网站单独购买一台服务器，既解决了维护服务器技术的难题，同时又极大地节省了服务器硬件成本和相关的维护费用。

### 3.5.1. 配置网络监听
<a href="#menu" >目录</a>

* 方式1:配置监听的IP地址
    * listen address[:port] [default_server] [setfib=number] [backlog=number] [rcvbuf=size] [sndbuf=size] [deferred] [accept_filter=filter] [bind] [ssl];
* 方式2:配置监听端口
    * listen port [default_server] [setfib=number] [backlog=number] [rcvbuf=size] [sndbuf=size]  [accept_filter=filter] [deferred] [bind]  [ipv6only=on|off] [ssl];

* 方式2: 配置UNIX Domain Socket
    * listen unix:path [default_server] [backlog=number] [rcvbuf=size] [sndbuf=size]  [accept_filter=filter] [deferred] [bind] [ssl];

* 参数说明
    * address：IP地址，如果是IPV6，格式为[FE80::1]
    * port，端口号，默认80
    * path,socket文件路径
    * default_server 标识符，将虚拟主机设置为address:port的墨认主机
    * setfib=number: 为socket关联路由表，目前只对FreeBSD起作用
    * backlog=number： 设置监听函数listen最多允许多少个网络连接同时处于挂起状态，FreeBSD默认为1,其他为511
    * rcvbuf & sndbuf：socket接收和发送缓冲区大小
    * accept_filter=filter：设置监听端口对请求的过滤，被过滤的内容不能被接收和处理。
    * bind ： 标识符，使用独立的bind(),处理此address:port
    * ssl： 标识符，设置会话使用SSL模式进行
* 默认设置: listen *:80 |*:8080
* 实例
    * listen 182.2.2.1:8125
    * listen 182.2.2.1
    * listen 8152

### 3.5.2. 访问权限控制
<a href="#menu" >目录</a>

**基于IP配置nginx的访问权限**
* allow address|CIDR |all;
    * 允许某个地址访问,如果有多个地址，需要重复多条指令
    * address ip地址
    * CIDR 访问客户端的CIDR地址，比如 127.0.0.1/25;
    * all 默认值，支持所有IP访问
* deny address|CIDR|all;

* 多条指令的情况

```
deny 127.1.1.2;
allow 127.1.1.3;
deny all;
```

从上往下检测，只要有一个匹配就不会继续往下检测，也就是先出现的会覆盖后面的配置．上面的配置只允许127.1.1.3访问。但是如果在不同的块内嵌套．内层的会覆盖外层的配置．

* 这两个指令都可以在http server location中进行配置 

**基于密码配置nginx的访问权限**

* auth_basic string | off;
    * string 开启认证功能，并设置验证时的指示信息
    * off 关闭该认证功能
* auth_basic_user_file file ;
    * 保存密码的文件
```
name1:password1
name2:password2
```

### 3.5.3. 基于名称的虚拟主机配置
<a href="#menu" >目录</a>

* 主机，server提供的虚拟主机，在server中进行配置
* 设置了主机的名称并配置好DNS，用户就可以使用这个名称向虚拟主机发送请求
* 语法: server_name name ...;
    * 可以有一或多个名称，之间用空格隔开
    * 每个名字就是一个域名。中间"."隔开
        * server_name xxx.com ccc.com;
    * 第一个名称作为此虚拟主机的主要名称
    * name中可以使用通配符"*",但只能放在三段式结构中的首部或者尾部，*.xxx.xxx
    * 还可以使用正则表达式，以"~"作为正则表达式 字符串的起始标志
        * server_name ~^www.xxx.com$;:以w开头，以m结尾
* 匹配优先级:使用通配符或者正则可能会出现匹配多个
    * 优先级顺序，首先匹配成功的被选择
        * 准确匹配server_name
        * 通配符在开始时匹配成功
        * 通配符在结尾时匹配成功
        * 正则表达式匹配成功
        

**基于ip的虚拟主机配置**
* server_name: 182.2.235



### 3.5.4. 基于端口配置虚拟主机
<a href="#menu" >目录</a>

```
http{

    server{
        listen 8001;
    }
    server {
        listen 8002;
    }
}
```
### 3.5.5. 基于IP配置虚拟主机
<a href="#menu" >目录</a>

可以通过ifconfig查看网卡的ipv4地址，然后进行设置实验
```yml
http{
    server{
        listen 80;
        server_name 192.168.78.1;
    }
    server {
        listen 80;
        server_name 192.168.78.2;
    }
}
```



### 3.5.6. 基于域名配置虚拟主机
<a href="#menu" >目录</a>

通过修改/etc/hosts实现域名访问测试
```yml
192.168.78.1 www.aa.com
192.168.78.2 www.bb.com
```

```yml
http{

    server{
        listen 80;
        server_name www.aa.com;
    }
    server {
        listen 80;
        server_name www.bb.com;
    }
}
```

上面可以配置多个域名．

server_ name 指令除了上述讲解到的精准配直方式外，还可利用通配符（头）与正则表达式设直域名，实现域名的泛解析 。 具体使用示例如下 。

```yml
＃以通配符开始的字符.
server_name *.test.com;
＃以通配符结束的字符串
server_name www.* ;
＃匹配正则表达式
server_name xxxx;
```
值得一提的是， server_name 指令的几种设置方式，在使用中只要有一项匹配成功，则停止继续匹配其他设置 。 且匹配的优先级顺序依次为，精准匹配 〉 以通配符开始的字符串 〉 以通配符结束的字符串 〉 正则表达式

### 3.5.7. 自定义错误页
<a href="#menu" >目录</a>

```yml
server{
    #自定义页面
    error_page 500 502 503 504 /50x.html ;
    #图片
    error_page 500 502 503 504 /error.pic ;
    #外部网站
    error_page 500 502 503 504 https://www.baidu.com ;
    #将返回前端的500错误码更改为200
    error_page 500 ＝200 /50x.html ;
    #错误码由重定向后的处理结果决定
    error_page 500＝/50x.html ;
}
```

## 3.6. 其他配置
<a href="#menu" >目录</a>

**配置连接超时时间**
* 与用户建立会话连接之后，Nginx服务器可以保持 这些连接打开一段时间。
* keepalive_timeout timeout[header_timeout];
    * timeout 服务端对连接的保持时间,默认值为75s.
    * header_timeout,可选项，在应答报文头部的KeepAlive域设置超时时间
    * 实例：keepalive_timeout 120s 100s;
    * 可以在http/server/location中进行配置

**单连接请求数上限**
* 用于限制用户通过某一个连接向nginx服务器发送请求的次数
* keepalive_requests number;
    * 默认值是100
    * 可以在server/location中进行配置

## 3.7. 目录设置
<a href="#menu" >目录</a>




### 3.7.1. root配置
<a href="#menu" >目录</a>

**配置请求的根目录**
* web服务器收到请求后，首先要在服务器端指定目录中寻找请求资源。
* root path;
* path 为nginx服务器接收到请求以后查找资源的根目录路径
* 可以在http/server/location中进行配置，一般只在location中进行配置


index指令详解（在前后端分离的基础上，通过Nginx配置，指定网站初始页）
* 该指令后面可以跟多个文件，用空格隔开；
* 如果包括多个文件，Nginx会根据文件的枚举顺序来检查，直到查找的文件存在；
* 文件可以是相对路径也可以是绝对路径，绝对路径需要放在最后；
* 文件可以使用变量$来命名；
* 该指令拥有默认值：index index.html 



```yml
#
root /myproject;
index index.html;

```
* 切记，index指令并不是查到文件之后，就直接拿来用了。它的实际工作方式是：
    * 如果文件存在，则使用文件作为路径，发起内部重定向。直观上看上去就像再一次从客户端发起请求，Nginx再一次搜索location一样。
    * 既然是内部重定向，域名+端口不发生变化，所以只会在同一个server下搜索。
    * 同样，如果内部重定向发生在proxy_pass反向代理后，那么重定向只会发生在代理配置中的同一个server。

```yml
server {
    listen      80;
    server_name example.org www.example.org;    
    
    location / {
        root    /data/www;
        index   index.html index.php;
    }
    
    location ~ \.php$ {
        root    /data/www/test;
    }
}

```
上面的例子中，如果你使用example.org或www.example.org直接发起请求，那么首先会访问到“/”的location，结合root与index指令，会先判断/data/www/index.html是否存在，如果不，则接着查看/data/www/index.php ，如果存在，则使用/index.php发起内部重定向，就像从客户端再一次发起请求一样，Nginx会再一次搜索location，毫无疑问匹配到第二个~ \.php$，从而访问到/data/www/test/index.php。

**开启目录列表功能**

如果配置了autoindex为on,当查找不到index 配置的资源时，将会列表展示root根目录下的所有资源。如果为off（默认），则将返回403错误。
```yml
autoindex on 
```

在开启目录列表功能时·，还可以通过 Nginx 提供的 autoindex_exact_size 指令设置精准显示文件大小还是大概显示文件大小；通过 autoindex_localtime 指令设置文件最后一次修改时间的格式 。 默认情况下， autoindex_exact_size 指令和 autoindex_localtime 指 令 的值分别为 on 和 off


以上指令如果放在htttp块内，则对所有的站点有效，如果放在server,则只对当前站点有效，如果放在location内，则只对当前目录有效。



### 3.7.2. alias配置
<a href="#menu" >目录</a>


nginx指定文件路径有两种方式root和alias，指令的使用方法和作用域：
* root
    * 语法：root path
    * 默认值：root html
    * 配置段：http、server、location、if
* alias
    * 语法：alias path
    * 配置段：location

root与alias主要区别在于nginx如何解释location后面的uri，这会使两者分别以不同的方式将请求映射到服务器文件上。root的处理结果是：root路径＋location路径。alias的处理结果是：使用alias路径替换location路径。alias是一个目录别名的定义，root则是最上层目录的定义。alias后面必须要用“/”结束，否则会找不到文件

```yml

server{

    location /a{
        root /b
    }

    location /a{
        alias /c/
    }
}
```

如果请求URI是/a/index.html。
* 如果是root,服务器会返回/b/a/index.html的文件。
* 如果是alias,服务器会返回/c/index.html的文件

nginx是通过root和alias设置虚拟目录，在nginx的配置中，alias目录和root目录是有区别的：
* alias指定的目录是准确的，即location匹配访问的path目录下的文件直接是在alias目录下查找的；
* root指定的目录是location匹配访问的path目录的上一级目录,这个path目录一定要是真实存在root指定目录下的；
* 使用alias标签的目录块中不能使用rewrite的break（具体原因不明）；另外，alias指定的目录后面必须要加上"/"符号！！
* alias虚拟目录配置中，location匹配的path目录如果后面不带"/"，那么访问的url地址中这个path目录后面加不加"/"不影响访问，访问时它会自动加上"/"；但是如果location匹配的path目录后面加上"/"，那么访问的url地址中这个path目录必须要加上"/"，访问时它不会自动加上"/"。如果不加上"/"，访问就会失败！
* root目录配置中，location匹配的path目录后面带不带"/"，都不会影响访问。

```yml
#当收到 /img/nginx.pic,将请求映射为/var/www/image/nginx.pic，不会追加location的匹配到的部分
location /img/{
    alias /var/www/image/
}
#当收到 /img/nginx.pic,将请求映射为/var/www/image/img/nginx.pic，会追加location的匹配到的部分
location /img/{
    root /var/www/image/
}
```



## 3.8. 配置location块匹配
<a href="#menu" >目录</a>

* 语法结构:location [=|\~|\~*|^~] uri{...}
    * = : 路径与uri严格匹配，会禁止继续搜索正则匹配
    * ~ : 使用uri正则表达式，区分大小写
    * ~* : 使用uri正则表达式，不区分大小写
    * ^~ : 以某个字符串开头的URL， ^~ /static/ :  以/static/的url，会禁止继续搜索正则匹配
    * @: 用于定义一个 location 块，且该块不能被外部客户端所访问，只能被nginx内部配置指令所访问


    
* 当[=|\~|\~*]存在多个时，按照从上往下进行匹配，先匹配到的被选择

* location /{} 与location =/ {}的区别
    * location /{} 遵守普通location的最大前缀匹配，如果配置了location /{} 和其他的 location规则，如果匹配其他的location规则，则选择该location规则。否则选择location /{}，也就是说location /{}的优先级最低，没有匹配才会被选择。
    * location =/ {}路径精确匹配,会禁止继续搜索正则匹配

* location /aa/bb {}为最大前缀匹配，也就是前缀是这个都可以匹配到
    * 当同时存在两个时，比如/aa 和/aa/bb两个location块时，遵循谁匹配度最高就匹配谁，而不是按照顺序来进行配置．
        * 比如访问路/aa/bb/cc．匹配到的是/aa/bb的location块
        * 访问路径/aa．匹配到的是/aa的location块
    * 当最大前缀匹配和上面的正则匹配都存在．如果访问路径两个都匹配．则优先选择正则匹配成功的location块．
    
多种类型匹配同时出现时的优先级: 精确匹配 > "^~"前缀匹配规则　> 正则匹配规则　> 最大前缀匹配规则

```yml
location = / {
   #规则A
}
location = /login {
   #规则B
}
location ^~ /static/ {
   #规则C
}
#.是正则表达式关键字，需要使用'\'进行转换
location ~ \.(gif|jpg|png|js|css)$ {
   #规则D
}
location ~* \.png$ {
   #规则E
}
location !~ \.xhtml$ {
   #规则F
}
location !~* \.xhtml$ {
   #规则G
}
location / {
   #规则H
}
```  
* 那么产生的效果如下：
    * 访问根目录/， 比如http://localhost/ 将匹配规则A
    * 访问 http://localhost/login 将匹配规则B，http://localhost/register 则匹配规则H
    * 访问 http://localhost/static/a.html 将匹配规则C
    * 访问 http://localhost/a.gif, http://localhost/b.jpg 将匹配规则D和规则E，但是规则D顺序优先，规则E不起作用， 而 http://localhost/static/c.png 则优先匹配到 规则C
    * 访问 http://localhost/a.PNG 则匹配规则E， 而不会匹配规则D，因为规则E不区分大小写。
    * 访问 http://localhost/a.xhtml 不会匹配规则F和规则G，http://localhost/a.XHTML不会匹配规则G，因为不区分大小写。规则F，规则G属于排除法，符合匹配规则但是不会匹配到，所以想想看实际应用中哪里会用到。
    * 访问 http://localhost/category/id/1111 则最终匹配到规则H，因为以上规则都不匹配，这个时候应该是nginx转发请求给后端应用服务器，比如FastCGI（php），tomcat（jsp），nginx作为方向代理服务器存在。

**另一种匹配规则**
　　　　　　　　　　　　　
location @name{}：该块不能被外部客户端访问，只能被内部配置指令所访问．





## 3.9. 网页压缩传输

gzip(GNU ZIP）是一种压缩技术，经过 gzip 压缩后，页面大小可以变为原来的30%甚至更小。这样，用户浏览页面的时候速度会快得多。gzip 网页压缩的实现需要浏览器和服务器的支持，

gzip 压缩的过程，首先在服务器端压缩，然后传到浏览器端后解压。当浏览器支持 gzip 解压时，会在请求消息头中包含 AcceptEncoding : gzip ，这样 Nginx就会向浏览器发送经过 gzip 后的内容，同时在响应消息头中加入 ContentEncoding:gzip,声明这是gzip后的内容，告知浏览器要先解压后才能解析输出

Nginx服务器为网页压缩专门提供了gzip模块，并且模块中的相关指令均可以设置在http 、server 或 location 块中

|||
|||
|gzip|用于开启或者关闭gzip功能|
|gzip_buffer|设置系统获取几个单位的缓存用于存储 gzip 的压缩结果数据流|
|gzip_comp_level|gzip 压缩比，压缩级别是 1 ～ 9,1 的压缩级别最低， 9 的压缩级别最高。压缩级别越高压缩率越大，压缩时间越长|
|gzip_disable|可以通过该指令对一些特定的 UserAgent 不使用压缩功能|
|gzip_min_length|设置允许压缩的页面最小字节数，页面字节数从响应消息头的 ContentLength 中gztp_mm_length 进行获取|
|gzip_http_version|识别 HTTP 协议版本，其值可以是 1. 1（默认值）或 1. 0|
|gzip_proxied|用于设置启用或禁用从代理服务器上收到响应内容的 gzip 压缩功能|
|gzip_types|匹配 MIME 类型进行压缩 。且无论是否指定， text/ html 类型总是会被压缩的|
|gzip_vary|用于在响应消息头中添加 Vary: AcceptEncoding，使代理服务然根据请求头中的AcceptEncoding 识别是否启用 gzip 压缩 。|

**gzip proxied 常用参数**
* any 无条件压缩所有响应数据
* off 关闭反向代理的压缩
* expired 如果响应消息头中包含 Expires ，启用压缩
* no cache 如果响应消息头中包含 CacheControl: nocache ，启用压缩
* nostore 如果响应消息头中包含 CacheControl: nostore ，启用压缩
* private 如果响应消息头中包含 CacheControl: private ，启用压缩
* no_last_modified 如果响应消息头中不包含 LastModifi时，启用压缩
* no_etag 如果响应消息头中不包含 Etag ，启用压缩
* auth 如果响应消息头中包含 Authorization 头信息，启用压缩


## 3.10. 重写和重定向

## 3.11. 防盗链配置

盗链是指有一些不良网站，为了在不增加成本的前提下扩充自己站点的内容，直接盗用其他网站的资源链接，而大部分用户又不会发现 。 这样的做法一方面损害了原网站的合法利益，另一方面又加重了原网站服务器的流量负担

### 3.11.1. 图片防盗链

**原理**
首先要了解HTTP请求消息中的一个名称为referer的字段，它用于保存当前网页的来源 UＲL 地址。当用户打开一个含有图片内容的网页时，浏览器会在图片的请求消息中将网页的URL放在 referer 中，从而使图片所在的服务器能够跟踪到它被显示的网页地址 。若要实现图片防盗链，最简单的防护手段就是判断 referer 的值，来判断当前图片的引用是否合法， 一旦检测到来源不是本站，就立即阻止图片的发送，或换成一 张禁止防盗链提示的图片 。

**配置图片防盗链**
```
location ~* ＼.(gif|jpg|png｜swf|flv)$ {
     配置域名白名单
    valid_referers www.ng.test ng.test ;
    if ($invalid_referer ) {
        ＃返回403状态码
        return 403 ;
    }
}
```

**valid_referers 可选参数值**

|参数值|　说明|
|||
|none|匹配没有 Referer 的 HTTP 请求，如 valid_referers none;
|blocked|匹配 HTTP 请求中含有 Referer ，但是被防火墙或者代理服务器修改，去掉了https:／或 http：//的情况，如 valid_referers blocked;
|server_names|允许文件资源链出的域名白名单，如 valid_referers www.ng.test ng.test;
|string|任意的字符串，如 valid_referers *.ng.test bxg.* ；
|regular expression| 正则表达式，如 valid_referers ～＼.img\ .;

图片防盗链只能根据请求消息中的 referer 进行验证，这种方式存在伪造referer 的问题


### 3.11.2. 下载防盗链

对于图片之外的下载资源，如果不需要考虑资源链接的长期有效性，可以使用 Nginx 提供的 secure_link 和 secure_link_md5 指令来实现下载地址的加密和时效性 。

下载防盗链的实现原理就是在服务器端根据特定规则对下载地址进行加密，并在用户请求下载链接时，验证加密链接是否有效，防止用户伪造下载链接。同时，为了避免加密后的链接被盗链，在加密时添加过期时间，使得下载地址只在一定时间内有效，过期后只能到原网站获取新的地址。

 

## 3.12. 配置https网站

要想实现 HTTPS 加密网站，在服务器端首先要获得 CA( CertificationAuthority）认证机构颁发的服务器数字证书（ CRT ） ， 然后浏览器在发起 HTTPS 请求时会验证服务器的CRT 是否合法，若不合法则 给出一个 warning 提示信息；若合法，用户在与网站交互时，所传输的数据都是加密后的数据，达到了安全可靠的效果 。

Nginx 服务器中的 ngx_http_ssl_module 模块用于提供 HTTPS 网站的配置。由于专业的 CA 机构颁发的证书是收费的，且需要 IP 地址和域名 。 在学习阶段， Nginx服务器若要获取数字证书，可以使用 OpenSSL 开源软件将自己作为 CA 为自己颁发证书。

1. 生成服务器的 RSA 私钥
```
openssl genrsa out server.key 2048
```

|参数 |说明|
|||
|genrsa ｜表示用于生成 RSA 私钥
| out server.key ｜表示输出的文件名为 server.key ，文件所在目录为执行 当前 openssl时所在目录
|2048 ｜密钥长度为 2048 （ 推荐至少 2048 ，长度越长，安全性越强）


生成的文件内容如下
```
BEGIN RSA PRIVATE KEY
MIIEpAIBAAKCAQEAzryxBJrQ9UjD/2pjsRgQAIqY8QGKuCK3yYtYYvtL4P5gai9+
.....
F9GFYNNojY9ixRbXTtNOCpDjF9iJ1u5aBoWNhnImKD43Ehe4zcCLgg==
END RSA PRIVATE KEY

```
2. 生成服务器的 CSR 证书请求文件
```
openssl req new key server.key out server.csr
```
以上操作生成的文件， server.key 是服务器的私钥，而 server.csr 相当于公钥。利用公钥可以对数据进行加密，加密后只有用私钥才能解密。而私钥用于对数据进行数字签名，签名后的数据可以利用公钥进行验证 。 因此，用户应妥善保管私钥，一旦泄露或丢失将无法保证安全。

3. CA 为服务器认证证书
```
openssl x509  req days 30  in server.csr signkey server.key －out server.crt
```
上述指令用于使用CA的私钥 server.key为服务器的 CSR 证书申请文件 server.csr进行签名认证。其中， x509 是自签名证书格式， days 30 用于设置签发证书的有效期为30 天

在 CA 利用私钥签名证书后，该证书将用于浏览器验证请求的网站是杏其实，防止网络通信过程中被伪造。浏览器保存了受信任的 CA 机构的公钥，在请求 HTTPS 网站时，会利用 CA 公钥验证服务器的证书，并检查域名是否吻合、证书是否过期、证书是杏已经被吊销等 。 由于当前的证书是服务器自己作为 CA 签名的，因此浏览器无法信任，会出现瞥告，但不影响学习和测试。

CA 的认证证书颁发完成后，在 Nginx 中添加 CRT 证书和服务器的私钥即可完成HTTPS 网站的配置 。在加密通信时，浏览器通过网站的证书可以 获得服务器的公钥 ，然后
利用公钥加密请求信息， Nginx 收到后再利用服务器私钥解开信息 。
浏览器在证书认证后， 会在请求信息中包含一个自动生成的高强度密钥（或称为随机
数），服务器收到后会利用该密钥加密响应信息 。 由于证书认证和 RSA 非对称力｜］密的过程
复杂，为了提高效率，在证书认证后的 一 段时间内是直接利用这个密钥进行对称加密通
信的 。

# 4. 代理服务
<a href="#menu" >目录</a>



## 4.1. 正向代理和反向代理区别
<a href="#menu" >目录</a>

![](pic/nginx/proxy.png)
![](pic/nginx/proxy1.png)

**正向代理**

代理也被称为正向代理，是一个位于客户端和目标服务器之间的代理服务器，客户端将发送的请求和指定的目标服务器提交给代理服务器，然后代理服务器向目标服务器发起请求，并将获得的响应结果返回给客户端的过程

若一个用户 A 没有访问目标服务器的权限，但是该用户可以访问代理服务器，且代理服务器又可以访问目标服务器 。 此时，就可以通过代理服务完成相应的请求，使用户获取到目标服务器响应的内容 。需要注意的是，要想实现代理服务，客户端必须要进行一些特别的设置．

如果把局域网外Internet看成一个巨大的资源库，那么资源就分布在Internet的各个站点上，局域网内的客户端要访问这些资源就必须通过代理读取器才能对各个站点进行访问。这种方式主要是为了增强局域网内部网络的安全性，使得网外的威胁因素不容易影响到网内，起到了一定的防火墙作用。同时，利用代理服务器也可以对局域网对外网的访问进行必要的监控和管理。正向代理服务器不支持外部对内部网络的访问请求。

![正向代理服务器](pic/nginx/agent.png)

**反向代理服务器**

相对于代理服务，反向代理对于客户端而言就是目标服务器，客户端向反向代理服务器发送请求后，反向代理服务器将该请求转发给内部网络上的后端服务器，并将从后端服务器上得到的响应结果返回给客户端

若用户 A 、用户 B 、用户 C 同时对反向代理服务器发送请求，反向代理服务器则根据其内部的具体配置，将用户的请求分发给后端服务器进行处理，并将后端服务器处理后的响应结果作为自己的响应结果返回给用户 。 反向代理服务器的整个处理过程，用户并不知情 。

![反向代理服务器](pic/nginx/agent1.png)

与正向代理相反，如果局域网向Internet提供资源，让Internet上的其他用户可以访问局域网内的资源，也可以设置使用一个代理服务器，它提供的服务就叫做反向代理服务。

正向代理服务器用来让局域网客户机接入外网以访问外网资源。反向代理服务器用来让外网的客户机接入局域网中的站点以访问站点中的资源。在正向代理服务器中，我们是客户端，目的是访问外网的资源，在反向代理服务中，我们的角色是站点，目的是把站点的资源发布出去让其他客户端能够访问。

* 安全性 
    * 正向代理的客户端能够在隐藏自身信息的同时访问任意网站，这给网络安全带来了极大的威胁。因此， 在使用时必须采取安全措施以确保仅为经过授权的客户端用户提供服务 。
    * 而反向代理的客户端用户只能通过外网来访问代理服务器，并且用户并不知道自己访问的是一个代理服务器，好处就是反向代理将真正的处理放在内网中，有效地提高了网络安全性 。
* 功能性
    * 正向代理的主要用途是为在防火墙内的局域网用户提供访问 Internet 的途径 。 
    * 而反向代理的主要用途是将防火墙后的服务器提供给 Internet 用户访问，还可以为多个后端服务器提供负载均衡功能、缓存功能等

## 4.2. Nginx正向代理服务
<a href="#menu" >目录</a>

实际使用较少，主要涉及三个指令:resolver,resolver_timeout,proxy_pass.可以放在http,server,location中。

* resolver
    * 指定DNS服务器的IP地址
    * resolver address ... [vali=time]
        * address : dns的IP地址,如果不指定端口号，默认就是53
        * time：数据包在网络中的有效时间，当数据包超时，则会被丢弃，发送者会收到丢弃响应，再确定是否重发
* resolver_timeout time
    * 设置dns域名解析超时时间
* proxy_pass　URL
    * 代理服务器的协议和地址
    * proxy_pass http://$http_host$request_uri

实例
```yml
server{
    #设置DNS服务器地址为8.8.8.8。默认端口53作为DNS服务器 的服务端口
    resolver 8.8.8.8;
    //代理服务的监听端口为82
    listen 82;
    location /{
        proxy_pass http://$http_host$request_uri
    } 
}
```

设置nginx正向代理服务器，一般是配置到一个server中。注意，在该server块中，不要出现server_name指令，即不要设置虚拟主机的名称或者ip。而resolver是必须的，如果没有，nginx服务器无法处理接收到的域名。

nginx不支持长相代理https域名。


## 4.3. 反向代理服务
<a href="#menu" >目录</a>

### 4.3.1. 常用配置指令


#### 4.3.1.1. 反向代理基本设置的21个指令 
<a href="#menu" >目录</a>

**proxy_pass**

URL为要设置的被代理服务器的地址，包含传输协议(http或者https)，主机名称或者IP地址加端口号，URI等要素
```YML
proxy_pass URL

#方式１：直接定义地址
proxy_pass http://www.baidu.com

#方式２，后端是一组服务
#注意:协议只能在一个地方加
upstream server_name{
    server http://192.1.0.1/uri;
    server http://192.1.0.2/uri;
}

server {

    location / {
        proxy_pass server_name;
    }
}
#或者
upstream server_name1{
    server 192.1.0.1/uri;
    server 192.1.0.2/uri;
}

server {

    location / {
        proxy_pass http://server_name;
    }
}

```

server http://192.1.0.2/uri　后面要不要加'/'的问题

```yml

#-------
server_name www.bai.com
 当访问http://www.bai.com/aa
#　两个配置都是转向　http://www.bai.com/aa
location / {

    #配置1
    proxy_pass http://192.1.0.1;

    #配置2
    proxy_pass http://192.1.0.1/;
}
#-------
server_name www.bai.com
 当访问http://www.bai.com/server/aa
#　配置1转向　http://www.bai.com/server/aa
#　配置2转向　http://www.bai.com/aa ./server被替换为'/'
location /server {

    #配置1
    proxy_pass http://192.1.0.1;

    #配置2
    proxy_pass http://192.1.0.1/;
}

```

**proxy_hide_header**

用于在转发时隐藏的header,可以在http,server,location中配置
```yml
proxy_hide_header header_key;
```

**proxy_pass_header**

默认情况下，nginx服务器在发送响应报文时，报文头中不包含Date,Server，X-Accel等来自被代理服务器的头域信息，该指令可以设置这些头域信息被发送。
```yml
proxy_pass_header  header_key;
```

**proxy_pass_request_body**

用于配置是否将客户端请求的请求体发送给代理服务器
```yml
proxy_pass_request_body　on|off;
```

**proxy_pass_request_headers**

用于配置是否将客户端请求的请求头发送给代理服务器
```yml
proxy_pass_request_headers on|off;
```
**proxy_set_header**

可以用来更改客户端发送来的header
```yml
proxy_set_header key value;
```
**proxy_set_body**

更改请求体信息
```yml
proxy_set_body　value;
```
**proxy_bind**

配置多个主机的情况下，强制绑定到某个主机
```yml
proxy_bind　address;
```
**proxy_connect_timeout**

与后端的连接超时时间,默认60s;
```yml
proxy_connect_timeout　10s;
```
**proxy_read_timeout**

向后端发出读请求之后，等待响应的超时时间
```yml
proxy_read_timeout　60s;
```
**proxy_send_timeout**

向后端发出写请求之后，等待响应的超时时间
```yml
proxy_send_timeout　60s;
```
**proxy_http_version**

用于设置提供代理服务器的http版本
```yml
proxy_http_version　1.0|1.1;
```
**proxy_method**

更改客户端的请求方法
```yml
proxy_method　get|post|...;
```
**proxy_ignore_client_abort**

客户端中断网络连接时，是否中断对被代理服务器的请求。默认为off
```yml
proxy_ignore_client_abort on|off;
```
**proxy_ignore_headers**

nginx收到被代理服务器的响应数据之后，不会处理被设置的头域
```yml
proxy_ignore_headers　header_key;
```

**proxy_rediret**

//TODO:proxy_rediret需要进行测试验证
客户端发起请求，响应中如果包含location字段，浏览器会自动跳转。常与3××状态码搭配使用，告诉客户端接下来访问哪里.该指令用于修改代理服务器返回的响应头中的Location和Ｒefresh。与proxy_pass配合使用。也就是用来修改被代理服务器的Location值。如果直接返回后端的Location，那么可能会出现问题，因此，需要该指令进行修改Location

当上游服务器返回的响应是重定向或刷新请求（如HTTP响应码是301或者302）时，proxy_redirect可以重设HTTP头部的location或refresh字段。

```yml
proxy_rediret rediret replacement;
proxy_rediret default;
proxy_rediret off;
```
* rediret:　与原Location匹配的值，可以是字符串或者正则表达式，支持变量的使用
* replacement：替代的字符串，支持变量的使用
* off：不使用该功能


**proxy_intercept_errors**

* 开启状态时，如果被代理服务器返回错误码时(4xx或者5xx)。nginx使用自定义的错误页(error_page定义)
* 如果关闭，则直接将被代理服务器返回的状态码返回给客户端_
```yml

```
**proxy_headers_hash_max_size**

用于配置**存放**http报文头的哈希表的容量,申请通常以固定大小为单位进行申请，由proxy_headers_hash_bucket_size决定
```yml
#默认为512个字符
proxy_headers_hash_max_size　512
```
**proxy_headers_hash_bucket_size**

用于设置nginx服务器**申请存放**http报文头的哈希表容量的单位大小。
```yml
#默认为64个字符
proxy_headers_hash_bucket_size　64;
```
**proxy_next_stream**

在配置nginx服务器作为反向代理功能时，如果使用upstream指令配置了一组服务器作为被代理服务器，服务器组中各服务器的访问规则遵循upstream指令配置的轮询规则，同时可以使用该指令配置在发生哪些异常情况时，将请求顺次交给下一组内服务器处理
```yml
#status可以配置一个或者多个
proxy_next_stream　status ...;
```
* error: 在建立连接，向被代理的服务器发送请求或者读取响应头时服务器发生连接错误
* timeout: 在建立连接，向被代理的服务器发送请求或者读取响应头时服务器发生超时
* invalid_header: 被代理的服务器返回的响应头为空或者无效
* http_500|http_503|http_504|http_404　：　被代理的服务器发生这些错误时
* off: 无法将请求发送给被代理的服务器

**proxy_ssl_session_reuse**

配置是否使用基于SS安全协议的会话连接("https://")被代理的服务器。
```yml
proxy_ssl_session_reuse on|off;
```
#### 4.3.1.2. proxy buffer 的配置的7个指令
<a href="#menu" >目录</a>

**proxy_buffering**
```yml
```
**proxy_buffers**
```yml
```
**proxy_buffer_size**
```yml
```
**proxy_busy_buffer_size**
```yml
```
**proxy_temp_path**
```yml
```
**proxy_max_temp_file_size**
```yml
```
**proxy_temp_write_size**
```yml
```

#### 4.3.1.3. proxy cache 的配置的12个指令
<a href="#menu" >目录</a>

**proxy_cache**
```yml
```
**proxy_cache_bypass**
```yml
```
**proxy_cache_key**
```yml
```
**proxy_cache_lock**
```yml
```
**proxy_cache_lock_timeout**
```yml
```
**proxy_cache_min_uses**
```yml
```
**proxy_cache_path**
```yml
```
**proxy_cache_use_state**
```yml
```
**proxy_cache_valid**
```yml
```
**proxy_no_cache**
```yml
```
**proxy_store**
```yml
```
**proxy_store_access**
```yml
```

```yml
＃配置E域名为 test.ng.test 的虚拟主机
 server (
    listen 80;
    server_name test.ng.test; ＃域名 test.ng.test 的请求全部转发到 Web 服务器 192.168.78.128
    location /{
        proxy_pass http://192.168.78.128;
    }
 ＃配置域名为 test.web.com 的虚拟主机
 server {
     listen 80;
     server_name test.web.test; ＃域名 test.web.test 的请求全部转发到 Web 服务器 192.168.78.128
     location /{
        proxy_pass http://192.168.78.200;
     }
 }

```

## 4.4. 负载均衡
<a href="#menu" >目录</a>

### 4.4.1. 基本理论
<a href="#menu" >目录</a>

负载均衡是利用一定的分配策略将网络负载尽可能地平摊到网络集群中的各个操作单元上，使得单个单元不会承担较重的负载，同时还可以利用多台机器实现并行执行多个请求，提高了响应速度。

现代负载均衡一般在第七层(传输层tcp)或者第四层(应用层http)实现。nginx属于第七层。


* 轮询方式 
    * 负载均衡默认设置方式，每个请求按照时间顺序逐一分配到不同的后端服务器进行处理，如果有服务器容机，会自动剔除
* 权重方式
    * 利用 weight 指定轮询的权重 比率，与访问率成正比，用于后端服务器性能不均的情况
* ip_hash 方式
    * 每个请求按访问 IP 的 hash 结果分配，这样可以使每个访客固定访问一个后端服务器，可以解决 Session 共享的问题
* 第三方模块
    * 第三方模块采用 fair 时，按照每台服务器的响应时间来分配请求，响应时间短的优先分配；若第三方模块采用 url_hash 时，按照访问 url 的 hash 值来分配请
    求

### 4.4.2. 配置
<a href="#menu" >目录</a>

```yml
#配置域名为 test.ng.test 的虚拟主机
server {
    listen 80;
    server_name test.ng.test;
    location /{
        proxy_pass http://web_server;
    }
    #配置负载均衡服务组轮询方式,默认方式
    upstream web_server {
        server 192.168.78.128;
        server 192.168.78.200;
    }

    #配置负载均衡服务组权重方式
    upstream web_server {
        server 192.168.78.128 weight=1;
        server 192.168.78.200 weight=2;
    }

    #配置负载均衡服务组ip_hash 方式
    upstream web_server {

        ip_hash;
        server 192.168.78.128;
        server 192.168.78.200;
    }
    #最少连接负载均衡
    upstream  blog{
        leastconnected;
        server 192.1.1.1:8223;
        server 192.1.1.1:8323;
        server 192.1.1.1:8423;
    }

    #配置负载均衡服务组第三方模块
    #必须先添加nginx upstream fair master模块
    upstream web_server {

        fair;
        server 192.168.78.128;
        server 192.168.78.200;
    }
}

```

[nginx-upstream-fair下载:https://github.com/gnosek/nginx-upstream-fair](https://github.com/gnosek/nginx-upstream-fair)

然后重新编译nginx： ./configure .......... --add-module=path of nginx-upstream-fair  && make && make install

**其他辅助参数**
* max_fails
    * 默认为1．允许请求失败的次数．超过时，返回proxy_next_upstream指令定义的错误
* fail_timeout
    * 在经历max_fails之后，暂停服务的时间
* backup
    * 预留的备份机器，其他服务器出现故障的时候才会使用
* down
    * 当前server不参与
```yml
upstream web_server {
    server 192.168.78.128 weight=l max_fails=1 fail_timeout=2 ;
    server 192.168.78.200 weight=3 max_fails=2 fail_timeout=2 ;
    server 192.168.78.201 backup;
｝
```

# 5. 缓存机制

## 5.1. 缓存实现原理

Web 缓存服务器位于内容源 Web 服务器和客户端之间，当客户端用户访问 一个 URL时， Web 缓存服务器就会请求相应的内容源 W eb 服务器，并将响应的信息缓存至内存或磁盘；然后，当下一个请求到来时，如果访问的是相同的 URL, Web 缓存服务器会直接将已缓存的内容输出给客户端，而不用再次向内容源 Web 服务器发送请求 。
利用缓存服务器，可以有效降低内容源服务器和数据库的负载，提高用户访问的响应速度

使用压缩可以降低传输数据的大小，但是压缩会消耗cpu.因此需要综合考虑

![缓存实现原理](pic/nginx/cache.png)

## 5.2. 永久缓存配置

Nginx 提供的 proxy_store 指令可以用于将内容源服务器响应的内容缓存到本地，若不手动删除，该缓存文件会一直生效 。 因此，永久缓存方式适用于缓存网站中几乎不会更改的一些内容 。

//TODO: 缓存有问题，需要进程测试
```yml

server {
    listen 80;
    server_name 127.1.10.1;

    location /{
    
        root cache;
        index index.html;
        #缓存配置
        #开启本地缓存
        proxy_store on;
        #设置缓存的读写规则
        proxy_store_access user:rw  group:rw all:rw;
        #设置反向代理时接收的数据临时存储文件的目录，该目录会由 Nginx 在配置生效后自动创建 。
        proxy_temp_path /cache/cache_temp;
        proxy_pass http://192.1.1.1;
    }
}
```
这里将其设定在 Nginx 安装目录下的 cache 目录中，需要用户手动创建，创建后修改此目录的用户权限，要求与 Nginx 工作进程的用户相同（如 nobody）。

## 5.3. 临时缓存配置

```yml
＃代理临时目录
proxy_temp_path /usr/local/nginx/proxy_temp_dir;
#Web 缓存 H 录和参数设置
proxy_cache_path /usr/1ocal/nginx/proxy_cache_dir levels=1:2 keys_zone=cache_one:5Om inactive=1m max_size=5OOm;
```

* /usr/local/nginx/proxy_cache_dir 参数：表示用户自定义的缓存文件保存目录 。
* levels 参数：表示缓存目录下的层级目录结构，它是根据哈希后的请求 URL 地址创建的，目录名称从晗希后的字符串结尾处开始截取 。假设哈希后的请求链接地址为 af7098al5e430326l97ee015l6fdace0 ，则levels=1:2表示，第1层子目录的名称是长度为1的字符0，第2层子目录的名称是长度为2的字符 ce,
* keys_zone 参数：指定缓存区名称及大 小，例如， cache_one: 50m 表示缓存区名称为cache_one ，在内存中的空间是 50MB 。
* inactive 参数：表示主动清空在指定时间内未被访问的缓存。例如， 1m 清空在 1 分钟内未被访问过的缓存， 1h 表示 1 小时， 1d 表示 1 天等 。
* max_size 参数：表示指定磁盘空间大小 。 例如， 500m,10g 。

Nginx 在进行缓存时，首先会被写人 proxy_temp_path 指定的临时目录中，因 此建议 proxy_cache_path 和 proxy_temp_path 指令设置的目录应在同 一个文件系统中，避免不同文件系统之间的磁盘 I/O消耗 。


## 5.4. 缓存清理配置

# 6. nginx中集成lua
<a href="#menu" >目录</a>




# 7. 高级配置
<a href="#menu" >目录</a>


# 8. gzip压缩
<a href="#menu" >目录</a>




# 9. rewrite功能
<a href="#menu" >目录</a>

rewrite功能 用于重定向服务时起到作用。

## 9.1. nginx后端服务器组的配置的5个技术指令
<a href="#menu" >目录</a>

**upstream指令**
* 设置后端服务器组的主要指令，其他的指令都在该指令中进行配置
* 语法: upstream name{}
    * name 是后端服务器的组名，可任意配置
    * 用于做负载均衡
    * 默认情况是随机轮询发起后端请求，如果失败则选择下一个服务器，直到响应成功，如果全都失败，返回最后一个的失败请求。

**server指令**
* 用于配置组内的服务器
* 语法: server address [parameters]
    * address服务器的地址，可以包含端口号的IP地址（IP:PORT）,或者以"unix:"为前缀用于进程间通信
    * 当前服务器更多的属性
        * weight=number;负载均衡权重，默认为1.
        * max_fails=numbers;
            * 请求失败的最大次数，默认为1.
            * 请求失败到这个数值时，则认为服务器失效(down).
            * 如果设置为0 ，则不用上面的方法检查服务器是否有效
            * 404不认为请求失败
        * fail_timeout=time;
            * 作用1:尝试请求某台服务器的时间
            * 作用2:服务器无效(down)的持续时间，在该时间内不去检查该服务器的状态
            * 默认10s
        * backup;
            * 标记为备用服务器，其他服务器失效时才会请求该服务器        
        * down ;标记服务器为无效状态，不会向其发送请求
```
upstream  servername{
    server xx.xx.xx weight=5 max_fails=1;
    server 127.0.0.1:8452;
    server unix:/tmp/bass;
}
```
**ip_hash指令**
* 根据请求IP进行负载均衡
* ip_hash不能和weight一起使用
* 根据客户端的请求IP进行哈希，因此nginx必须是客户端之后的组件，否则，将会根据前面组件的ip进行哈希
* 客户端必须是C类地址，1.3.2开始支持IPV6地址

```
upstream  servername{
    ip_hash;
    server 127.0.0.1:8452;
    server 127.0.0.2:8452;
}

```
**keppalive**
* 用于控制网络连接保持功能。
* keepalive connections;
    * 服务器每一个工作进程允许该服务器组保持的空闲网络连接的上限值。如果超过该值，工作进程将采用最近很少使用的策略关闭网络连接。
* 该值不是限制服务器工作进程能改为服务器组开启的总网络连接数

**least_conn**
* 负载均衡和算法:最少连接。配合权重进行选择。


## 9.2. rewrite功能的配置
<a href="#menu" >目录</a>

* rewrite用于实现URL的重写。
* 地址重写和地址转发
    * 地址重写
        * 
    * 地址转发
    * 区别
        * 地址转发后客户端浏览器地址栏中的地址显示是不改变的;而地址重写浏览器显示的地址将会改变为新的地址
        * 一次地址转发整个过程，只产生一次网络请求，而地址重写一般会产生两次请求
        * 地址转发一般在同一个站点项目中，地址重写没有这个限制
        * 地址转发到的页面不用全路径名表示，而地址重写必须使用完整的路径名表示
        * 地址转发的过程中，可以将客户端请求的request范围内的属性传递给新的页面，但地址重写不可以。
        * 地址转发的速度较地址重写快。
* Rewrite规则
    * 借助PCRE实现URI重写，并且支持Nginx预设变量
    * nginx_http_rewrite_module模块支持重写功能
* if指令
    * if (condition){}
        * condition的值为空字符串或者'\0'开头，则为false 
        * "=">等于;"!=" > 不等于，比较变量和字符串
            * 字符串不需要加引号
            * if ($request_method = POST)
        * 使用正则表达式进行匹配
            * 使用以下字符进行连接
                * ~ 匹配对大小写敏感
                * ~* 匹配对大小写不敏感
                * !~ & ~* : 对上面匹配结果取反
            * if ($request_method ~ POST)
        * 判断请求的文件是否存在
            *  f : 文件存在 !f : 文件不存在
            * if(f $filename)
        * 判断请求的目录是否存在
            * d &!d
        * 判断请求的目录或者文件是否存在
            * e & !e
        * 判断请求的文件是否可执行
            * x & !x
* break 指令
    * 和其他语言类似，中断当前语句块
* return 指令
    * 用于完成对请求的处理，直接向客户端返回
    * 用法
        * return [text];
        * returm code URL;
        * return URL;
        * code ： HTTP状态码
        * text : 响应体内容
        * URL:为返回客户端的URL地址

**rewrite**

**常用全局变量**

|||
|||
|$args|变量中存放了请求URL中的请求指令，http://xx.com/login?arg1=val1&arg2=vag2 中的 "arg1=val1&arg2=vag2"
|$content_length|请求头中的Contentlength|
|$content_type|请求头中的Contenttype|
|$document_root|针对当前请求头中的根路径|
|$document_uri|请求中的URI不包括参数，http://xx.com/login?arg1=val1&arg2=vag2 中的 "/login"|
|$host|请求URL中的主机部分，http://xx.com/login?arg1=val1&arg2=vag2 中的 "xx.com"，如果为空或者不可用，则存放的是Server块中的server_name的配置值|
|$http_user_agent|客户端的代理信息|
|$http_cookie|请求的cookie|
|$limit_rate|Nginx针对网络连接速率的限制，也就是limit_rate的值
|$remote_addr|客户端的地址|
|$remote_port|客户端与服务建立连接的端口|
|$remote_user|客户端的用户名|
|$request_body_file|发给后端服务器的本地文件资源的名称|
|$request_method|客户端请求方式，GET/POST等|
|$request_filename|当前请求的资源文件的路径名|
|$request_uri|当前请求的URI，包括请求参数|
|$query_string|与变量$args相同|
|$scheme|客户端请求的协议，http,https,ftp|
|$server_protocol|客户端请求协议的版本，HTTP/1.0，HTTP/1.1等|
|$server_addr|服务器的地址|
|$server_name|客户端请求到达服务器的名称|
|$server_port|客户端请求到达服务器的端口|
|$uri|$document_uri相同|



## 9.3. rewrite使用
<a href="#menu" >目录</a>



# 10. 邮件服务
<a href="#menu" >目录</a>


# 11. 架构说明
<a href="#menu" >目录</a>

## 11.1. 模块化结构
<a href="#menu" >目录</a>

* 模块化设计思想
    * 模块功能化，一个模块就实现一个相对独立的功能，也就是单一职责原则
    * 模块化设计自顶向下，逐步求精，将程序进行功能分解
    * 整个程序遵循高内聚低耦合的原则，尽量避免模块之间得到互相依赖
    
### 11.1.1. 模块分类
<a href="#menu" >目录</a>

* 核心模块
* 标准HTTP模块
* 可选HTTP模块
* 邮件服务模块
* 第三方模块

核心模块是nginx运行必不可少的模块，提供了ngixn最基本的核心服务，入进程管理　，权限控制错误日志记录等。标准HTTP模块是nginx在编译时默认加入的。 可选HTTP模块是用于扩展标准的HTTP功能，使其能够处理一些特殊的HTTP请求。

Ｎginx模块基本符合单一职责原则，可根据实际需要在编译运行程序时进行增减。


**核心模块**

* 主体功能:进程管理，权限控制，错误日志，配置解析等
* 响应请求事件必须的功能，包括事件驱动机制，正则表达式解析等

**标准HTTP模块**

|模块|功能|
|||


**可选HTTP模块**
**邮件服务模块**

快速编译不会包含邮件服务模块，需要手动添加。

**第三方模块**





## 11.2. web请求处理机制
<a href="#menu" >目录</a>

**并行处理方式**

* 多进程
    * 设计实现简单，各个进程之间相互独立，处理客户端的请求的过程彼此不受干扰，进程内部产生错误并不会影响其他进程
    * 当子线程退出时，其占用的资源会被操作系统回收，也不会留下任何垃圾
    * 创建进程需要执行内存复制操作，在资源和时间上会产生额外的开销
    * 因此，如果Web服务器接收大量的并发请求，就会对系统资源造成压力，导致系统性能下降
* 多线程
    * 创建线程不需要进行内存复制，开销小，
    * 多个线程位于同一个进程内，可以访问共同的空间，彼此之间相互影响，需要对变量进行并发访问控制，以及内存管理，容易出错
* 异步
    * 同步机制:　是指发送方发送请求后，需要等待接收到接收方返回的响应，才接着发送下一个请求。所有的请求都在服务端得到同步，发送方和接收方对请求的处理步调是一致的。
    * 异步机制:　发送方发送一个请求后，不用等待接收方响应这个请求，就可以继续发送下一个请求。所有来自发送方的请求形成一个队列，接收方处理完成后通知发送方。
    * 网络通信IO模型
        * 同步阻塞方式
        * 同步非阻塞
        * 异步阻塞
        * 异步非阻塞

**Nginx服务器处理请求**
* Nginx服务器的一个显著优势就是能够同时处理大量并发请求，结合多进程和异步机制(异步非阻塞)对外提供服务。
* nginx启动后，会产生一个主进程master process,和多个工作进程。其中可以在配置文件中指定工作进程数量。工作进程用于处理客户端请求。
* 工作处理流程
    * 工作进程使用异步非阻塞,可以处理多个客户端请求，多进程+异步提高了对请求的高并发处理
    * 当某个进程接收到客户端请求后，调用IO进行处理，如果不能立即得到结果，就去处理其他请求
    * 客户端也无需等待，也去处理其他事情
    * 当IO调用完成，就会通知工作进程，工作进程得到通知，暂时挂起当前处理的事务，去响应客户端的请求。
* 事件处理机制
    * IO调用返回后是如何通知工作进程的
    * 方式1
        * 工作进程轮询取检查IO调用完成状态
    * 方式2
        * IO调用后主动通知工作进程，也就是事件驱动模型
        * select,poll.epollkqueue等这样的系统调用就是用来支持这种方式的，它们提供了一种机制，让进程可以同时处理多个并发请求，不用关心IO调用的具体状态。IO调用完全由时间驱动模型来管理，事件准备好了就通知工作进程事件已经就绪。


**Nginx事件驱动模型**
<a href="#menu" >目录</a>

* 事件驱动模型基本组成部分
    * 事件收集器
        * 负责收集所有事件，包括来自用户的(鼠标键盘等)，来自硬件的(比如中断，时钟实践)，来自软件的(比如系统，应用程序本身)
    * 事件发送器
        * 负责将收集到的事件分发给目标对象，目标对象就是事件处理器
    * 事件处理器
        * 负责具体事件的处理
        * 处理方式
            * 创建新进程处理调用事件处理器来处理该请求(性能开销大)
            * 创建新线程处理调用事件处理器来处理该请求(涉及到线程同步问题，可能会发生死锁等问题)
            * 放入待处理事件的列表，使用非阻塞IO方式调用事件处理器来处理该请求(逻辑比较复杂，但是也是常用的实现方案)
* select 
    * 首先，创建所关注事件的文件描述符集合，对于一个描述符，可以关注其上面的读写以及异常事件，所以要创建三类描述符集合，分别用来收集读事件的描述符，写事件的描述符，和异常事件的描述符
    * 其次调用底层提供的select()函数，等待事件的发生，select的阻塞与是否设置非阻塞IO是没有关系的
    * 轮询所有事件描述符集合中的每一个事件描述符，检查是否有相应的事件发生，如果有，就进行处理

nginx服务器在编译过程中如果没有为其指定其他高性能事件驱动模型库，它将自动编译该库。可以使用参数--with-select_module和--without-select_module进行选择

* poll
    * poll和select的工作流程基本相同
    * 主要区别是select需要为读事件写事件和异常事件分别创建一个描述符集合，因此在最后轮询的时候，需要分别轮询这三个集合。
    * 而poll库只需要创建一个集合，在每个描述符对应的结构上分别设置读事件，写事件，异常事件。最后轮询的时候，可以同时检查这三种事件是否发生。可以说poll是select的优化版本
    * 可以使用参数--with-poll_module和--without-poll_module进行选择
* epoll
    * select和poll的处理方式是将描述符列表交给内核，再去轮询是否所有事件发生，效率相对低下。比较好的做法是，把文件描述符交给内核，一旦有事件发生，内核就将发生事件的描述符列表通知给应用层，这就避免了轮询整个描述符列表。epoll就是这种模型
    * 首先,epoll库通过相关调用通知内核创建一个N个描述符的事件列表。然后，给这些描述符设者所关注的事件，并把它添加到内核事件列表中。后续也可以通过相关调用对事件列表中的描述符进行修改
    * 之后，epoll库就开始等待内核通知事件发生。事件发生后，内核将发生事件的描述符列表上报给epoll库，得到事件列表的epoll库，就可以进行处理了

## 11.3. 设计架构概览
<a href="#menu" >目录</a>

![](pic/nginx/nginx.png)

它由一个主进程和多个工作进程组成，主进程接收容户端请求，转交给工作进程处理，从而很好地利用多核心 CPU 的计算能力。当管理员执行 reload 命令重新加载自己直时，主进程会等待工作进程完成 工作 后再结束工作进程，然后基于新的配直重新创建工作进程，避免了工作过程中被打断的情况 。 由于整个过程中主进程没有停止，因此也不会发生漏掉客户端请求的情况 。

**主进程**
* 读取配置文件，并验证正确性和有效性
* 建立，绑定和关闭Socket
* 按照配置生成，管理和结束工作进程
* 接收外界指令，比如重启，升级，退出服务器等指令
* 不中断服务，实现平滑重启，应用新配置
* 不中断服务，实现平滑升级，升级失败进行回滚
* 开启日志文件，获取文件描述符
* 编译和处理Perl脚本

**工作进程**
* 接收客户端请求
* 将请求依次送入各个功能模块进行过滤处理
* IO调用，获取响应数据
* 与后端服务器通信，接收后端服务器处理结果
* 数据缓存，访问缓存索引，查询和调用缓存数据
* 发送请求结果，响应客户端请求
* 接收主程序命令，比如重启，升级和退出等指令

**缓存索引重建及管理进程**

* 缓存索引重建进程
    * 该进程是在nginx启动一段时间之后(默认1分钟)由主进程生成，在缓存元数据重建完成后就自动退出　
    * 根据本地磁盘上的缓存文件在内存中建立索引元数据库
    * 进程启动后，对本地磁盘上存放的缓存文件的目录结构进行扫描
    * 检查内存中已有的缓存元数据是否正确，并更新索引元数据
* 缓存索引管理进程
    * 在元数据更新后，对元数据是否过期作出判断

**进程交互**

nginx在使用master-worker模型时，会涉及主进程和工作进程之间的交互和工作进程之间的交互。这两类交互都依赖于管道机制

**Run Loop事件处理循环模型**

# 12. 工作进程
<a href="#menu" >目录</a>

## 12.1. nginx服务进程间通信
<a href="#menu" >目录</a>

### 12.1.1. Linux进程间通信方式

* 进程间通信方式
    * 使用IPC（消息队列，信号量，共享存储）
        * 功能强大，但是不能支持Nginx服务器使用的事件驱动模型
    * 管道
        * 管道简单易用，但是限制比较多，一般只是单向通信
        * 一般在父子进程间通信
    * 套接字 socket
        * 用于网络通信，也可用于系统内进程间通信
        * 支持双向通信
          
### 12.1.2. Linux进程间双工通信方式的实现


### 12.1.3. 通信通道建立和设置


### 12.1.4. 通信通道的使用


### 12.1.5. 消息的读写

# 13. 模块编程
<a href="#menu" >目录</a>


## 13.1. 模块的种类
<a href="#menu" >目录</a>

* 根据模块的重要性
    * **核心模块**
        * Nginx重要模块，提供了基本初始化功能
        * 包括网络管理，文件管理，内存管理，配置解析，模块加载等基本功能实现
    * **标准模块**
        * 配置时无需指明编译的重要模块 
        * 提供了实现HTTP WEB服务的基础功能，包括代理，反向代理，URL重写，GZIP压缩，邮件等功能的实现
    * **可选的HTTP模块**    
        * 编译时需要指明编译
        * 这些模块大多数是为了提高web服务器的性能或者扩展额外功能而提供的，比如SSL，select ,epoll
    * **第三方模块**
        * 自定义开发的模块

* 根据模块的角色划分
    * **请求处理模块**
        * 负责与客户端连接，请求收发的处理
    * **资源过滤模块**
        * 对服务器接收的各类网络资源进行管理和筛选
        * 资源来源包括客户端和后端服务器
    * **代理转发模块**
        * 负责后端服务器的选择，资源递送等服务

## 13.2. 模块开发实战
<a href="#menu" >目录</a>


## 13.3. 模块的编译和安装
<a href="#menu" >目录</a>




# 14. nginx 优化
<a href="#menu" >目录</a>


## 14.1. Nginx运行工作进程数量
<a href="#menu" >目录</a>

Nginx运行工作进程个数一般设置CPU的核心或者核心数x2。如果不了解cpu的核数，可以top命令之后按1看出来，也可以查看/proc/cpuinfo文件 grep ^processor /proc/cpuinfo | wc -l

```yml
#worker_processes最多开启8个，8个以上性能提升不会再提升了，而且稳定性变得更低，所以8个进程够用了。
worker_processes 4;

$ ps -ef | grep nginx 
root     11396 11370  0 18:39 ?        00:00:00 nginx: master process nginx -g daemon off;
systemd+ 11442 11396  0 18:39 ?        00:00:00 nginx: worker process
systemd+ 11444 11396  0 18:39 ?        00:00:00 nginx: worker process
systemd+ 11445 11396  0 18:39 ?        00:00:00 nginx: worker process
systemd+ 11446 11396  0 18:39 ?        00:00:00 nginx: worker process

```

## 14.2. Nginx最大打开文件数
<a href="#menu" >目录</a>

```yml
worker_rlimit_nofile 65535;
```

这个指令是指当一个nginx进程打开的最多文件描述符数目，理论值应该是最多打开文件数（ulimit -n）与nginx进程数相除，但是nginx分配请求并不是那么均匀，所以最好与ulimit -n的值保持一致。

注：文件资源限制的配置可以在/etc/security/limits.conf设置，针对root/user等各个用户或者*代表所有用户来设置。

使用ulimit -a 可以查看当前系统的所有限制值，使用ulimit -n 可以查看当前的最大打开文件数。

新装的linux 默认只有1024 ，当作负载较大的服务器时，很容易遇到error: too many open files。因此，需要将其改大，在/etc/security/limits.conf最后增加：

```yml
* soft nofile 65535
* hard nofile 65535
* soft noproc 65535
* hard noproc 65535
```
用户重新登录生效（ulimit -n）

## 14.3. Nginx事件处理模型
<a href="#menu" >目录</a>

```yml
events {
  use epoll;
  worker_connections 65535;
  multi_accept on;
}
```

nginx采用epoll事件模型，处理效率高。

work_connections是单个worker进程允许客户端最大连接数，这个数值一般根据服务器性能和内存来制定，实际最大值就是worker进程数乘以work_connections。

实际我们填入一个65535，足够了，这些都算并发值，一个网站的并发达到这么大的数量，也算一个大站了！

multi_accept 告诉nginx收到一个新连接通知后接受尽可能多的连接，默认是on，设置为on后，多个worker按串行方式来处理连接，也就是一个连接只有一个worker被唤醒，其他的处于休眠状态，设置为off后，多个worker按并行方式来处理连接，也就是一个连接会唤醒所有的worker，直到连接分配完毕，没有取得连接的继续休眠。当你的服务器连接数不多时，开启这个参数会让负载有一定的降低，但是当服务器的吞吐量很大时，为了效率，可以关闭这个参数。

## 14.4. 开启高效传输模式
<a href="#menu" >目录</a>

```yml
http {
  include mime.types;
  default_type application/octet-stream;
  ……

  sendfile on;
  tcp_nopush on;
  ……
}
```

* Include mime.types ： 媒体类型,include 只是一个在当前文件中包含另一个文件内容的指令。
* default_type application/octet-stream ：默认媒体类型
* sendfile on：开启高效文件传输模式，sendfile指令指定nginx是否调用sendfile函数来输出文件，对于普通应用设为 on，如果用来进行下载等应用磁盘IO重负载应用，可设置为off，以平衡磁盘与网络I/O处理速度，降低系统的负载。注意：如果图片显示不正常把这个改成off。
* tcp_nopush on：必须在sendfile开启模式才有效，防止网路阻塞，积极的减少网络报文段的数量（将响应头和正文的开始部分一起发送，而不一个接一个的发送。）

## 14.5. 连接超时时间
<a href="#menu" >目录</a>


主要目的是保护服务器资源，CPU，内存，控制连接数，因为建立连接也是需要消耗资源的。
```yml
keepalive_timeout 60;
tcp_nodelay on;
client_header_buffer_size 4k;
open_file_cache max=102400 inactive=20s;
open_file_cache_valid 30s;
open_file_cache_min_uses 1;
client_header_timeout 15;
client_body_timeout 15;
reset_timedout_connection on;
send_timeout 15;
server_tokens off;
client_max_body_size 10m;
```
* keepalived_timeout ：客户端连接保持会话超时时间，超过这个时间，服务器断开这个链接。
* tcp_nodelay：也是防止网络阻塞，不过要包涵在keepalived参数才有效。
* client_header_buffer_size 4k：客户端请求头部的缓冲区大小，这个可以根据你的系统分页大小来设置，一般一个请求头的大小不会超过 1k，不过由于一般系统分页都要大于1k，所以这里设置为分页大小。分页大小可以用命令getconf PAGESIZE取得。
* open_file_cache max=102400 inactive=20s ：这个将为打开文件指定缓存，默认是没有启用的，max指定缓存数量，建议和打开文件数一致，inactive 是指经过多长时间文件没被请求后删除缓存。
* open_file_cache_valid 30s：这个是指多长时间检查一次缓存的有效信息。
* open_file_cache_min_uses 1 ：open_file_cache指令中的inactive 参数时间内文件的最少使用次数，如果超过这个数字，文件描述符一直是在缓存中打开的，如上例，如果有一个文件在inactive 时间内一次没被使用，它将被移除。
* client_header_timeout ： 设置请求头的超时时间。我们也可以把这个设置低些，如果超过这个时间没有发送任何数据，nginx将返回request time out的错误。
* client_body_timeout设置请求体的超时时间。我们也可以把这个设置低些，超过这个时间没有发送任何数据，和上面一样的错误提示。
* reset_timeout_connection ：告诉nginx关闭不响应的客户端连接。这将会释放那个客户端所占有的内存空间。
* send_timeout ：响应客户端超时时间，这个超时时间仅限于两个活动之间的时间，如果超过这个时间，客户端没有任何活动，nginx关闭连接。
* server_tokens ：并不会让nginx执行的速度更快，但它可以关闭在错误页面中的nginx版本数字，这样对于安全性是有好处的。
* client_max_body_size：上传文件大小限制。

## 14.6. fastcgi 调优
<a href="#menu" >目录</a>

```yml
fastcgi_connect_timeout 600;
fastcgi_send_timeout 600;
fastcgi_read_timeout 600;
fastcgi_buffer_size 64k;
fastcgi_buffers 4 64k;
fastcgi_busy_buffers_size 128k;
fastcgi_temp_file_write_size 128k;
fastcgi_temp_path/usr/local/nginx1.10/nginx_tmp;
fastcgi_intercept_errors on;
fastcgi_cache_path/usr/local/nginx1.10/fastcgi_cache levels=1:2 keys_zone=cache_fastcgi:128minactive=1d max_size=10g;
```
* fastcgi_connect_timeout 600 ：指定连接到后端FastCGI的超时时间。
* astcgi_send_timeout 600 ：向FastCGI传送请求的超时时间。
* fastcgi_read_timeout 600 ：指定接收FastCGI应答的超时时间。
* fastcgi_buffer_size 64k ：指定读取FastCGI应答第一部分需要用多大的缓冲区，默认的缓冲区大小为。fastcgi_buffers指令中的每块大小，可以将这个值设置更小。
* fastcgi_buffers 4 64k ：指定本地需要用多少和多大的缓冲区来缓冲FastCGI的应答请求，如果一个php脚本所产生的页面大小为256KB，那么会分配4个64KB的缓冲区来缓存，如果页面大小大于256KB，那么大于256KB的部分会缓存到fastcgi_temp_path指定的路径中，但是这并不是好方法，因为内存中的数据处理速度要快于磁盘。一般这个值应该为站点中php脚本所产生的页面大小的中间值，如果站点大部分脚本所产生的页面大小为256KB，那么可以把这个值设置为“8 32K”、“4 64k”等。
* fastcgi_busy_buffers_size 128k ：建议设置为fastcgi_buffers的两倍，繁忙时候的buffer。
* fastcgi_temp_file_write_size 128k ：在写入fastcgi_temp_path时将用多大的数据块，默认值是fastcgi_buffers的两倍，该数值设置小时若负载上来时可能报502BadGateway。
* fastcgi_temp_path  ：缓存临时目录。
* fastcgi_intercept_errors on ：这个指令指定是否传递4xx和5xx错误信息到客户端，或者允许nginx使用error_page处理错误信息。注：静态文件不存在会返回404页面，但是php页面则返回空白页！
* fastcgi_cache_path /usr/local/nginx1.10/fastcgi_cachelevels=1:2 keys_zone=cache_fastcgi:128minactive=1d max_size=10g ：fastcgi_cache缓存目录，可以设置目录层级，比如1:2会生成16*256个子目录，cache_fastcgi是这个缓存空间的名字，cache是用多少内存（这样热门的内容nginx直接放内存，提高访问速度），inactive表示默认失效时间，如果缓存数据在失效时间内没有被访问,将被删除，max_size表示最多用多少硬盘空间。
* fastcgi_cache cache_fastcgi ：#表示开启FastCGI缓存并为其指定一个名称。开启缓存非常有用，可以有效降低CPU的负载，并且防止502的错误放生。cache_fastcgi为proxy_cache_path指令创建的缓存区名称。
* fastcgi_cache_valid 200 302 1h ：#用来指定应答代码的缓存时间，实例中的值表示将200和302应答缓存一小时，要和fastcgi_cache配合使用。
* fastcgi_cache_valid 301 1d ：将301应答缓存一天。
* fastcgi_cache_valid any 1m ：将其他应答缓存为1分钟。
* fastcgi_cache_min_uses 1 ：该指令用于设置经过多少次请求的相同URL将被缓存。
* fastcgi_cache_key http://$host$request_uri ：该指令用来设置web缓存的Key值,nginx根据Key值md5哈希存储.一般根据$host(域名)、$request_uri(请求的路径)等变量组合成proxy_cache_key 。
* fastcgi_pass  ：指定FastCGI服务器监听端口与地址，可以是本机或者其它。

* 总结：
    * nginx的缓存功能有：proxy_cache / fastcgi_cache
    * proxy_cache的作用是缓存后端服务器的内容，可能是任何内容，包括静态的和动态。
    * fastcgi_cache的作用是缓存fastcgi生成的内容，很多情况是php生成的动态的内容。
    * proxy_cache缓存减少了nginx与后端通信的次数，节省了传输时间和后端宽带。
    * fastcgi_cache缓存减少了nginx与php的通信的次数，更减轻了php和数据库(mysql)的压力。

## 14.7. gzip 调优
<a href="#menu" >目录</a>

使用gzip压缩功能，可能为我们节约带宽，加快传输速度，有更好的体验，也为我们节约成本，所以说这是一个重点。

Nginx启用压缩功能需要你来ngx_http_gzip_module模块，apache使用的是mod_deflate。

一般我们需要压缩的内容有：文本，js，html，css，对于图片，视频，flash什么的不压缩，同时也要注意，我们使用gzip的功能是需要消耗CPU的！
```yml
gzip on;
gzip_min_length 2k;
gzip_buffers   4 32k;
gzip_http_version 1.1;
gzip_comp_level 6;
gzip_typestext/plain text/css text/javascriptapplication/json application/javascript application/x-javascriptapplication/xml;
gzip_vary on;
gzip_proxied any;
gzip on;   #开启压缩功能
```
* gzip_min_length 1k ：设置允许压缩的页面最小字节数，页面字节数从header头的Content-Length中获取，默认值是0，不管页面多大都进行压缩，建议设置成大于1K，如果小与1K可能会越压越大。
* gzip_buffers 4 32k ：压缩缓冲区大小，表示申请4个单位为32K的内存作为压缩结果流缓存，默认值是申请与原始数据大小相同的内存空间来存储gzip压缩结果。
* gzip_http_version 1.1 ：压缩版本，用于设置识别HTTP协议版本，默认是1.1，目前大部分浏览器已经支持GZIP解压，使用默认即可。
* gzip_comp_level 6 ：压缩比例，用来指定GZIP压缩比，1压缩比最小，处理速度最快，9压缩比最大，传输速度快，但是处理慢，也比较消耗CPU资源。
* gzip_types text/css text/xml application/javascript ：用来指定压缩的类型，‘text/html’类型总是会被压缩。默认值: gzip_types text/html (默认不对js/css文件进行压缩)
    * 压缩类型，匹配MIME型进行压缩；
    * 不能用通配符 text/*；
    * text/html默认已经压缩 (无论是否指定)；
    * 设置哪压缩种文本文件可参考 conf/mime.types。
* gzip_vary on ：varyheader支持，改选项可以让前端的缓存服务器缓存经过GZIP压缩的页面，例如用Squid缓存经过nginx压缩的数据。

## 14.8. expires 缓存调优
<a href="#menu" >目录</a>


缓存，主要针对于图片，css，js等元素更改机会比较少的情况下使用，特别是图片，占用带宽大，我们完全可以设置图片在浏览器本地缓存365d，css，js，html可以缓存个10来天，这样用户第一次打开加载慢一点，第二次，就非常快了！缓存的时候，我们需要将需要缓存的拓展名列出来， Expires缓存配置在server字段里面。

```yml
location ~* \.(ico|jpe?g|gif|png|bmp|swf|flv)$ {
    expires 30d;
    log_not_found off;

    access_log off;
}

location ~* \.(js|css)$ {
    expires 7d;
    log_not_found off;
    access_log off;
}
```
注：log_not_found off;是否在error_log中记录不存在的错误。默认是。

* 总结：expire功能优点：
    * expires可以降低网站购买的带宽，节约成本；
    * 同时提升用户访问体验；
    * 减轻服务的压力，节约服务器成本，是web服务非常重要的功能。
* expire功能缺点：
    * 被缓存的页面或数据更新了，用户看到的可能还是旧的内容，反而影响用户体验。
    * 解决办法：第一个缩短缓存时间，例如：1天，但不彻底，除非更新频率大于1天；第二个对缓存的对象改名。

## 14.9. 防盗链
<a href="#menu" >目录</a>


防止别人直接从你网站引用图片等链接，消耗了你的资源和网络流量，那么我们的解决办法由几种：
* 水印，品牌宣传，你的带宽，服务器足够；
* 防火墙，直接控制，前提是你知道IP来源；

防盗链策略下面的方法是直接给予404的错误提示。
```yml
location ~*^.+\.(jpg|gif|png|swf|flv|wma|wmv|asf|mp3|mmf|zip|rar)$ {
valid_referers noneblocked www.benet.com benet.com;
if($invalid_referer) {
  #return 302 http://www.benet.com/img/nolink.jpg;
  return 404;
  break;
}
    access_log off;
}
```
参数可以使如下形式：
* none  ：意思是不存在的Referer头(表示空的，也就是直接访问，比如直接在浏览器打开一个图片)。
* blocked  ：意为根据防火墙伪装Referer头，如：“Referer:XXXXXXX”。
* server_names  ：为一个或多个服务器的列表，0.5.33版本以后可以在名称中使用“*”通配符。

## 14.10. 内核参数优化
<a href="#menu" >目录</a>

* fs.file-max = 999999：这个参数表示进程（比如一个worker进程）可以同时打开的最大句柄数，这个参数直线限制最大并发连接数，需根据实际情况配置。
* net.ipv4.tcp_max_tw_buckets = 6000 ：这个参数表示操作系统允许TIME_WAIT套接字数量的最大值，如果超过这个数字，TIME_WAIT套接字将立刻被清除并打印警告信息。该参数默认为180000，过多的TIME_WAIT套接字会使Web服务器变慢。注：主动关闭连接的服务端会产生TIME_WAIT状态的连接
* net.ipv4.ip_local_port_range = 1024 65000  ：允许系统打开的端口范围。
* net.ipv4.tcp_tw_recycle = 1 ：启用timewait快速回收。
* net.ipv4.tcp_tw_reuse = 1 ：开启重用。允许将TIME-WAIT sockets重新用于新的TCP连接。这对于服务器来说很有意义，因为服务器上总会有大量TIME-WAIT状态的连接。
* net.ipv4.tcp_keepalive_time = 30：这个参数表示当keepalive启用时，TCP发送keepalive消息的频度。默认是2小时，若将其设置的小一些，可以更快地清理无效的连接。
* net.ipv4.tcp_syncookies = 1 ：开启SYN Cookies，当出现SYN等待队列溢出时，启用cookies来处理。
* net.core.somaxconn = 40960  ：web 应用中 listen 函数的 backlog 默认会给我们内核参数的。
* net.core.somaxconn  ：限制到128，而nginx定义的NGX_LISTEN_BACKLOG 默认为511，所以有必要调整这个值。注：对于一个TCP连接，Server与Client需要通过三次握手来建立网络连接.当三次握手成功后,我们可以看到端口的状态由LISTEN转变为ESTABLISHED,接着这条链路上就可以开始传送数据了.每一个处于监听(Listen)状态的端口,都有自己的监听队列.监听队列的长度与如somaxconn参数和使用该端口的程序中listen()函数有关。somaxconn定义了系统中每一个端口最大的监听队列的长度,这是个全局的参数,默认值为128，对于一个经常处理新连接的高负载 web服务环境来说，默认的 128 太小了。大多数环境这个值建议增加到 1024 或者更多。大的侦听队列对防止拒绝服务 DoS 攻击也会有所帮助。
* net.core.netdev_max_backlog = 262144  ：每个网络接口接收数据包的速率比内核处理这些包的速率快时，允许送到队列的数据包的最大数目。
* net.ipv4.tcp_max_syn_backlog = 262144 ：这个参数标示TCP三次握手建立阶段接受SYN请求队列的最大长度，默认为1024，将其设置得大一些可以使出现Nginx繁忙来不及accept新连接的情况时，Linux不至于丢失客户端发起的连接请求。
* net.ipv4.tcp_rmem = 10240 87380 12582912 ：这个参数定义了TCP接受缓存（用于TCP接受滑动窗口）的最小值、默认值、最大值。
* net.ipv4.tcp_wmem = 10240 87380 12582912：这个参数定义了TCP发送缓存（用于TCP发送滑动窗口）的最小值、默认值、最大值。
* net.core.rmem_default = 6291456：这个参数表示内核套接字接受缓存区默认的大小。
* net.core.wmem_default = 6291456：这个参数表示内核套接字发送缓存区默认的大小。
* net.core.rmem_max = 12582912：这个参数表示内核套接字接受缓存区的最大大小。
* net.core.wmem_max = 12582912：这个参数表示内核套接字发送缓存区的最大大小。
* net.ipv4.tcp_syncookies = 1：该参数与性能无关，用于解决TCP的SYN攻击。
 

下面贴一个完整的内核优化设置：
```yml
fs.file-max = 999999
net.ipv4.ip_forward = 0
net.ipv4.conf.default.rp_filter = 1
net.ipv4.conf.default.accept_source_route = 0
kernel.sysrq = 0
kernel.core_uses_pid = 1
net.ipv4.tcp_syncookies = 1
kernel.msgmnb = 65536
kernel.msgmax = 65536
kernel.shmmax = 68719476736
kernel.shmall = 4294967296
net.ipv4.tcp_max_tw_buckets = 6000
net.ipv4.tcp_sack = 1
net.ipv4.tcp_window_scaling = 1
net.ipv4.tcp_rmem = 10240 87380 12582912
net.ipv4.tcp_wmem = 10240 87380 12582912
net.core.wmem_default = 8388608
net.core.rmem_default = 8388608
net.core.rmem_max = 16777216
net.core.wmem_max = 16777216
net.core.netdev_max_backlog = 262144
net.core.somaxconn = 40960
net.ipv4.tcp_max_orphans = 3276800
net.ipv4.tcp_max_syn_backlog = 262144
net.ipv4.tcp_timestamps = 0
net.ipv4.tcp_synack_retries = 1
net.ipv4.tcp_syn_retries = 1
net.ipv4.tcp_tw_recycle = 1
net.ipv4.tcp_tw_reuse = 1
net.ipv4.tcp_mem = 94500000 915000000 927000000
net.ipv4.tcp_fin_timeout = 1
net.ipv4.tcp_keepalive_time = 30
net.ipv4.ip_local_port_range = 1024 65000
```

执行sysctl -p使内核修改生效。



# 15. nginx源码结构
<a href="#menu" >目录</a>

## 15.1. 目录结构
<a href="#menu" >目录</a>

nginx源码目录
```yml
 ls -l
total 28
drwxr-xr-x 2 lgj lgj 4096 Mar  3 23:04 core
drwxr-xr-x 3 lgj lgj 4096 Mar  3 23:04 event
drwxr-xr-x 4 lgj lgj 4096 Mar  3 23:04 http
drwxr-xr-x 2 lgj lgj 4096 Mar  3 23:04 mail
drwxr-xr-x 2 lgj lgj 4096 Mar  3 23:04 misc
drwxr-xr-x 3 lgj lgj 4096 Mar  3 23:04 os
drwxr-xr-x 2 lgj lgj 4096 Mar  3 23:04 stream

```
* main
    * nginx服务器邮件服务的源码，主要实现对邮件服务依赖的数据结构的定义和初始化，对SMTP协议,IMAP协议的实现，以及SSL的支持等
* misc
```yml
misc/
total 8
#测试程序中引用的头文件是否与c++兼容
-rw-r--r-- 1 lgj lgj  565 Mar  3 23:04 ngx_cpp_test_module.cpp
#支持谷歌google_perftools的使用，该工具用于优化内存分配的效率和速度，帮助在高并发下很好地控制内存的使用
-rw-r--r-- 1 lgj lgj 3046 Mar  3 23:04 ngx_google_perftools_module.c
```

* os
    * 默认只包含一个unix目录，其中存放的源代码是针对类unix系统

* core目录（存放了nginx使用到的关键数据结构和nginx内核实现源码）
    * nginx.*文件:　包含了nginx程序入口函数main()的文件，实现了对nginx的各模块的整体控制
    * nginx_connection.*文件:　实现与网络连接管理相关的功能
    * ngx_inet.*文件:　实现对socket网络套接字相关的功能
    * ngx_cycle.*文件:　实现对系统整个运行过程中参数，资源统一管理和调配
    * ngx)log.*文件:　实现日志输出，管理的相关功能
    * ngx_file.*文件:　实现文件读写相关功能
    * ngx_regex.*文件:　实现nginx服务器对正则表达式的支持
    * ngx_string.*文件:　实现对字符串处理的基本功能
    * ngx_times.*文件:　实现对时间的获取和处理操作

该目录定义了nginx服务器赖以运行的最基础的数据结构，实现了对它们的基本操作，也实现了用户各模块公共调用的基本功能

* event
```yml
ls event/
modules      
ngx_event.h         
ngx_event_connect.c  
ngx_event_openssl.c  
ngx_event_openssl_stapling.c  
ngx_event_pipe.h    
ngx_event_posted.h  
ngx_event_timer.h
ngx_event.c  
ngx_event_accept.c  
ngx_event_connect.h  
ngx_event_openssl.h  
ngx_event_pipe.c             
ngx_event_posted.c  
ngx_event_timer.c   
ngx_event_udp.c

```

实现了nginx服务器的事件驱动模型，实现了nginx服务器的消息机制。modules中是服务器支持的各类事件驱动模型

* http

```yml
ls   
modules           ngx_http_config.h              ngx_http_file_cache.c              ngx_http_request.c       ngx_http_script.h            ngx_http_upstream_round_robin.c  ngx_http_write_filter_module.c
ngx_http.c        ngx_http_copy_filter_module.c  ngx_http_header_filter_module.c    ngx_http_request.h       ngx_http_special_response.c  ngx_http_upstream_round_robin.h  v2
ngx_http.h        ngx_http_core_module.c         ngx_http_parse.c                   ngx_http_request_body.c  ngx_http_upstream.c          ngx_http_variables.c
ngx_http_cache.h  ngx_http_core_module.h         ngx_http_postpone_filter_module.c  ngx_http_script.c        ngx_http_upstream.h          ngx_http_variables.h

```
对web服务提供了支持。包括数据结构定义，初始化功能，完成网络连接的建立，管理，断开的功能，数据报文的解析，服务器组管理的功能等


## 15.2. 模块结构
<a href="#menu" >目录</a>

* 公共功能
    * 字符串处理
    * 时间管理
    * 脚本执行
    * 文件读写
    * 消息输出
    * 锁机制
    * .....
* 配置解析
    * 语法检查
    * 正则表达式
    * 参数解析
    * 参数值初始化
    * .....
* 内存管理
    * 内存池管理
    * 共享内存分配
    * 缓存区管理
    * .....
* 事件驱动
    * 主进程创建
    * 工作进程创建
    * 信号接收处理
    * 事件驱动模型实现
    * 高级ＩＯ功能
    * .....
* 日志管理
    * 错误日志管理
    * 任务日志管理
    * ..... 
* http服务
    * 网络连接管理
    * 客户端请求处理
    * 虚拟主机管理
    * 服务器组管理
    * 服务器代理
    * 认证以及权限管理
* mail服务
    * 网络连接管理
    * 客户端请求管理
    * 虚拟主机管理
    * POP3,IMAP,SMTP协议实现 
* 模块支持
    * 模块初始化
    * 模块管理和组织
    * 模块调用
    * 行为控制

# 16. 启动初始化
<a href="#menu" >目录</a>

## 16.1. 启动过程概览

* 解析输入参数，通过输入参数确定Nginx服务器具体行为
* 初始化时间和日志，备份输入参数，并初始化相关的全局变量。一些变量的值依赖于Nginx服务器所在操作系统的相关信息，比如内存页面大小，系统支持最大文件打开数目
* 保存输入参数
* 初始化描述网络套接字的相关结构
* 初始化ngx_module_t数组
* 读取并保存Nginx配置参数
* 初始化ngx_cycle_s结构体
* 保存工作进程ID到PID文件

nginx在程序初始化工作之后。就开始启动进程工作。ngin进程模型分为single和master两种，其中single模型是以单进程方式进行工作的，一般不会在实际应用中使用，master模型是以master-worker多进程方式进行工作。它是实际应用环境中使用的主要模式，在程序中，通过全局变量ngx_process的值来判断nginx服务器当前的工作模式，进而启动相应模式的进程。

![master模型下多进程启动过程](pic/nginx/master模型下多进程启动过程.png)

# 17. 时间管理
<a href="#menu" >目录</a>


# 18. 内存管理
<a href="#menu" >目录</a>

## 18.1. 内存的逻辑结构

* nginx内存池相关结构体
    * ngx_pool_t ,描述nginx内存池结构
    * ngx_poll_data_t , 
    * ngx_poll_large_t , 
    * ngx_poll_cleanup_t , 

* nginx的内存管理很好，运行过程占用系统内存很少

![](pic/nginx/nginx_pool.png)

* nginx内存池本质上是一个链表结构，链表的每一个节点称为一个数据块，由ngx_poll_data_t描述
* ngx_poll_large_t 用于处理大数据内存
* ngx_poll_cleanup_t 用于处理对内存进行释放和回收
* ngx_pool_t相当于一个内存管理器，其他结构形成一个链表，需要时挂接在ngx_pool_t上面




## 18.2. 内存池管理

## 18.3. 内存的使用
