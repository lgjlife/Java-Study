<!-- TOC -->

- [1. 分布式系统&高并发](#1-分布式系统高并发)
    - [1.1. 基本概念](#11-基本概念)
    - [1.2. 大型网站的特点](#12-大型网站的特点)
        - [1.2.1. 特点](#121-特点)
        - [1.2.2. 模式](#122-模式)
    - [1.3. 架构演进](#13-架构演进)
    - [1.4. 序列化机制](#14-序列化机制)
        - [1.4.1. 基本概念](#141-基本概念)
        - [1.4.2. 常用序列化方式性能比较](#142-常用序列化方式性能比较)
        - [1.4.3. 常用序列化方式实现](#143-常用序列化方式实现)
            - [1.4.3.1. JDK方式](#1431-jdk方式)
            - [1.4.3.2. FastJSON](#1432-fastjson)
            - [1.4.3.3. Hessian](#1433-hessian)
            - [1.4.3.4. Protostuff](#1434-protostuff)
    - [1.5. 定时任务](#15-定时任务)
    - [1.6. Cron表达式](#16-cron表达式)
        - [1.6.1. Spring Scheduler](#161-spring-scheduler)
        - [1.6.2. Quartz](#162-quartz)
            - [1.6.2.1. Quartz 核心概念](#1621-quartz-核心概念)
    - [1.7. 分布式ID](#17-分布式id)
        - [1.7.1. 应用场景](#171-应用场景)
        - [1.7.2. 分布式ID生成方案](#172-分布式id生成方案)
    - [1.8. 分布式锁](#18-分布式锁)
        - [1.8.1. 使用数据库实现](#181-使用数据库实现)
        - [1.8.2. Redis实现分布式锁](#182-redis实现分布式锁)
        - [1.8.3. Zookeeper实现分布式锁](#183-zookeeper实现分布式锁)
    - [1.9. 微服务化](#19-微服务化)
        - [微服务和SOA](#微服务和soa)
        - [1.9.1. 拆分原则](#191-拆分原则)
    - [1.10. 缓存](#110-缓存)
        - [1.10.1. 缓存一致性问题](#1101-缓存一致性问题)
    - [1.11. 消息机制](#111-消息机制)
    - [1.12. 服务降级](#112-服务降级)
    - [1.13. 流量限流](#113-流量限流)
    - [1.14. 幂等设计](#114-幂等设计)
    - [1.15. 数据一致性](#115-数据一致性)
        - [1.15.1. CAP理论](#1151-cap理论)
        - [1.15.2. Base理论](#1152-base理论)
    - [1.16. 分布式事务实现](#116-分布式事务实现)
    - [1.17. 负载均衡算法](#117-负载均衡算法)
    - [1.18. 服务容错设计](#118-服务容错设计)
    - [1.19. 集群](#119-集群)
    - [1.20. 分库分表](#120-分库分表)
    - [1.21. 反向代理&正向代理](#121-反向代理正向代理)
    - [1.22. 客户端优化](#122-客户端优化)

<!-- /TOC -->
# 1. 分布式系统&高并发
<a href="#menu" style="float:right">目录</a>

## 1.1. 基本概念
* **分布式**
系统中的多个模块在不同服务器上部署，即可称为分布式系统，如Tomcat和数据库分别部署在不同的服务器上，或两个相同功能的Tomcat分别部署在不同服务器上
* **高可用**
系统中部分节点失效时，其他节点能够接替它继续提供服务，则可认为系统具有高可用性
* **集群**
一个特定领域的软件部署在多台服务器上并作为一个整体提供一类服务，这个整体称为集群。如Zookeeper中的Master和Slave分别部署在多台服务器上，共同组成一个整体提供集中配置服务。在常见的集群中，客户端往往能够连接任意一个节点获得服务，并且当集群中一个节点掉线时，其他节点往往能够自动的接替它继续提供服务，这时候说明集群具有高可用性
* **负载均衡**
请求发送到系统时，通过某些方式把请求均匀分发到多个节点上，使系统中每个节点能够均匀的处理请求负载，则可认为系统是负载均衡的
* **正向代理和反向代理**
系统内部要访问外部网络时，统一通过一个代理服务器把请求转发出去，在外部网络看来就是代理服务器发起的访问，此时代理服务器实现的是正向代理；当外部请求进入系统时，代理服务器把该请求转发到系统中的某台服务器上，对外部请求来说，与之交互的只有代理服务器，此时代理服务器实现的是反向代理。简单来说，正向代理是代理服务器代替系统内部来访问外部网络的过程，反向代理是外部请求访问系统时通过代理服务器转发到内部服务器的过程。

## 1.2. 大型网站的特点

### 1.2.1. 特点
高并发，大流量;高可用；海量数据;用户分布广泛，网络情况复杂;安全环境恶劣；需求快速变更，发布频繁；渐进式发展.
### 1.2.2. 模式
* 分层
    * 将系统进行横向分层，比如视图层，业务层，数据层
    * 各层之间通过接口实现交流
    * 降低耦合，便于开发，一层进行修改很少影响其他的层
* 分割 
    * 对网站进行纵向分割，按业务分割，比如用户服务，订单服务，支付服务，也就是微服务化
    * 每一个服务之间通过网络进行沟通，比如消息中间件，RPC，HTTP ResFul
    * 对复杂系统简单化，降低模块间的耦合度
    * 同时微服务化之后也会衍生出一系列问题，比如分布式事务，分布式锁等问题
* 分布式
    * 应用进行服务化之后，就需要进行分布式部署
    * 分布式应用和服务
        * 改善网站性能和并发特性
        * 单个应用复杂度降低，加快开发和发布速度
        * 不同应用复用共同的服务，便于扩展。比如用户服务，基本是其他服务共享的。
        * 缺点是将会增加运维的难度，单体服务只需要监控一个服务，分布式之后将需要监控多个服务
    * 分布式静态资源
        * 将JS，CSS，Html，图片等静态资源文件发布在不同的CDN节点上，用户将会访问最近的节点，因此可以提高页面静态资源的响应速度
    * 分布式数据和存储
        * 大型网站的特点是数据量大
        * 数据库分库分表
        * 使用分布式缓存
        * 使用分布式文件系统
    * 分布式计算
        * 大数据处理领域，需要多台计算机共同完成计算
* 集群
    * 分布式是将不同的应用部署在不同的计算机上(当然也可以部署在同一个计算机上，端口不一样)
    * 集群是将同一个应用发布在不同的计算机上(当然也可以部署在同一个计算机上，端口不一样)，每个应用之间的代码一致
    * 集群部署可以提高网站的并发性，因为有更多的计算机共同处理同一个业务
    * 集群还涉及到请求路由的问题，也就是负载均衡。

* 缓存
    * 使用缓存可以减少对后端的访问，减少对数据库的访问。从而提高网站性能。
    * CDN缓存页面静态文件
    * 客户端缓存，比如浏览器的localStorage,SessionStorage,减少对页面的请求
    * 反向代理服务器。这里也可以实现页面静态数据的缓存，比如nginx具备缓存功能
    * 本地缓存，本地缓存可以缓存一些热点数据，减少对数据库和分布式缓存的请求，但本地缓存使用的是应用的内存，空间有限。实现方案有GUAVA
    * 分布式缓存，缓存实例可以发布在不同的计算机上，可以持久化到本地存储，因此空间大。
* 异步
    * 同步是指发出请求之后一直等待响应才会返回
    * 异步是指发出请求之后立即返回，再通过其他方式查看结果
    * 比如消息中间件，RPC的异步请求
    * 提高网站的响应速度
    * 提高对网络洪峰的处理
* 冗余
    * 冗余就是当整个系统中部分节点出现问题，如何保证系统的高可用性
    * 集群化，数据备份等解决
    
* 自动化
    * 自动化部署，自动化监控，自动化故障修复等
* 安全
    * 登录认证
    * 脚本攻击，跨域攻击，SQL注入攻击等的应对


## 1.3. 架构演进
[来源](https://segmentfault.com/a/1190000018626163)
* **单机架构**
![](https://segmentfault.com/img/bVbqHnQ?w=579&h=210)

以淘宝作为例子。在网站最初时，应用数量与用户数都较少，可以把Tomcat和数据库部署在同一台服务器上。浏览器往www.taobao.com发起请求时，首先经过DNS服务器（域名系统）把域名转换为实际IP地址10.102.4.1，浏览器转而访问该IP对应的Tomcat。

随着用户数的增长，Tomcat和数据库之间竞争资源，单机性能不足以支撑业务
* **第一次演进：Tomcat与数据库分开部署**
![](https://segmentfault.com/img/bVbqHnF?w=581&h=207)

Tomcat和数据库分别独占服务器资源，显著提高两者各自性能。

随着用户数的增长，并发读写数据库成为瓶颈
* **第二次演进：引入本地缓存和分布式缓存**
![](https://segmentfault.com/img/bVbqHo5?w=581&h=321)

在Tomcat同服务器上或同JVM中增加本地缓存，并在外部增加分布式缓存，缓存热门商品信息或热门商品的html页面等。通过缓存能把绝大多数请求在读写数据库前拦截掉，大大降低数据库压力。其中涉及的技术包括：使用memcached作为本地缓存，使用Redis作为分布式缓存，还会涉及缓存一致性、缓存穿透/击穿、缓存雪崩、热点数据集中失效等问题。

缓存抗住了大部分的访问请求，随着用户数的增长，并发压力主要落在单机的Tomcat上，响应逐渐变慢
* **第三次演进：引入反向代理实现负载均衡**
![](https://segmentfault.com/img/bVbqjM7?w=401&h=330)

在多台服务器上分别部署Tomcat，使用反向代理软件（Nginx）把请求均匀分发到每个Tomcat中。此处假设Tomcat最多支持100个并发，Nginx最多支持50000个并发，那么理论上Nginx把请求分发到500个Tomcat上，就能抗住50000个并发。其中涉及的技术包括：Nginx、HAProxy，两者都是工作在网络第七层的反向代理软件，主要支持http协议，还会涉及session共享、文件上传下载的问题。

反向代理使应用服务器可支持的并发量大大增加，但并发量的增长也意味着更多请求穿透到数据库，单机的数据库最终成为瓶颈
* **第四次演进：数据库读写分离**
![](https://segmentfault.com/img/bVbqjPI?w=427&h=293)

把数据库划分为读库和写库，读库可以有多个，通过同步机制把写库的数据同步到读库，对于需要查询最新写入数据场景，可通过在缓存中多写一份，通过缓存获得最新数据。其中涉及的技术包括：Mycat，它是数据库中间件，可通过它来组织数据库的分离读写和分库分表，客户端通过它来访问下层数据库，还会涉及数据同步，数据一致性的问题。

业务逐渐变多，不同业务之间的访问量差距较大，不同业务直接竞争数据库，相互影响性能
* **第五次演进：数据库按业务分库**
![](https://segmentfault.com/img/bVbqknA?w=537&h=442)

把不同业务的数据保存到不同的数据库中，使业务之间的资源竞争降低，对于访问量大的业务，可以部署更多的服务器来支撑。这样同时导致跨业务的表无法直接做关联分析，需要通过其他途径来解决，但这不是本文讨论的重点，有兴趣的可以自行搜索解决方案。

随着用户数的增长，单机的写库会逐渐会达到性能瓶颈
* **第六次演进：把大表拆分为小表**
![](https://segmentfault.com/img/bVbqjUO?w=584&h=442)

比如针对评论数据，可按照商品ID进行hash，路由到对应的表中存储；针对支付记录，可按照小时创建表，每个小时表继续拆分为小表，使用用户ID或记录编号来路由数据。只要实时操作的表数据量足够小，请求能够足够均匀的分发到多台服务器上的小表，那数据库就能通过水平扩展的方式来提高性能。其中前面提到的Mycat也支持在大表拆分为小表情况下的访问控制。

这种做法显著的增加了数据库运维的难度，对DBA的要求较高。数据库设计到这种结构时，已经可以称为分布式数据库，但是这只是一个逻辑的数据库整体，数据库里不同的组成部分是由不同的组件单独来实现的，如分库分表的管理和请求分发，由Mycat实现，SQL的解析由单机的数据库实现，读写分离可能由网关和消息队列来实现，查询结果的汇总可能由数据库接口层来实现等等，这种架构其实是MPP（大规模并行处理）架构的一类实现。

目前开源和商用都已经有不少MPP数据库，开源中比较流行的有Greenplum、TiDB、Postgresql XC、HAWQ等，商用的如南大通用的GBase、睿帆科技的雪球DB、华为的LibrA等等，不同的MPP数据库的侧重点也不一样，如TiDB更侧重于分布式OLTP场景，Greenplum更侧重于分布式OLAP场景，这些MPP数据库基本都提供了类似Postgresql、Oracle、MySQL那样的SQL标准支持能力，能把一个查询解析为分布式的执行计划分发到每台机器上并行执行，最终由数据库本身汇总数据进行返回，也提供了诸如权限管理、分库分表、事务、数据副本等能力，并且大多能够支持100个节点以上的集群，大大降低了数据库运维的成本，并且使数据库也能够实现水平扩展。

数据库和Tomcat都能够水平扩展，可支撑的并发大幅提高，随着用户数的增长，最终单机的Nginx会成为瓶颈
* **第七次演进：使用LVS或F5来使多个Nginx负载均衡**
![](https://segmentfault.com/img/bVbqkrJ?w=589&h=515)

由于瓶颈在Nginx，因此无法通过两层的Nginx来实现多个Nginx的负载均衡。图中的LVS和F5是工作在网络第四层的负载均衡解决方案，其中LVS是软件，运行在操作系统内核态，可对TCP请求或更高层级的网络协议进行转发，因此支持的协议更丰富，并且性能也远高于Nginx，可假设单机的LVS可支持几十万个并发的请求转发；F5是一种负载均衡硬件，与LVS提供的能力类似，性能比LVS更高，但价格昂贵。由于LVS是单机版的软件，若LVS所在服务器宕机则会导致整个后端系统都无法访问，因此需要有备用节点。可使用keepalived软件模拟出虚拟IP，然后把虚拟IP绑定到多台LVS服务器上，浏览器访问虚拟IP时，会被路由器重定向到真实的LVS服务器，当主LVS服务器宕机时，keepalived软件会自动更新路由器中的路由表，把虚拟IP重定向到另外一台正常的LVS服务器，从而达到LVS服务器高可用的效果。

此处需要注意的是，上图中从Nginx层到Tomcat层这样画并不代表全部Nginx都转发请求到全部的Tomcat，在实际使用时，可能会是几个Nginx下面接一部分的Tomcat，这些Nginx之间通过keepalived实现高可用，其他的Nginx接另外的Tomcat，这样可接入的Tomcat数量就能成倍的增加。

由于LVS也是单机的，随着并发数增长到几十万时，LVS服务器最终会达到瓶颈，此时用户数达到千万甚至上亿级别，用户分布在不同的地区，与服务器机房距离不同，导致了访问的延迟会明显不同
* **第八次演进：通过DNS轮询实现机房间的负载均衡**
![](https://segmentfault.com/img/bVbqkuH?w=752&h=535)

在DNS服务器中可配置一个域名对应多个IP地址，每个IP地址对应到不同的机房里的虚拟IP。当用户访问www.taobao.com时，DNS服务器会使用轮询策略或其他策略，来选择某个IP供用户访问。此方式能实现机房间的负载均衡，至此，系统可做到机房级别的水平扩展，千万级到亿级的并发量都可通过增加机房来解决，系统入口处的请求并发量不再是问题。

随着数据的丰富程度和业务的发展，检索、分析等需求越来越丰富，单单依靠数据库无法解决如此丰富的需求
* **第九次演进：引入NoSQL数据库和搜索引擎等技术**
![](https://segmentfault.com/img/bVbqHtd?w=685&h=443)

当数据库中的数据多到一定规模时，数据库就不适用于复杂的查询了，往往只能满足普通查询的场景。对于统计报表场景，在数据量大时不一定能跑出结果，而且在跑复杂查询时会导致其他查询变慢，对于全文检索、可变数据结构等场景，数据库天生不适用。因此需要针对特定的场景，引入合适的解决方案。如对于海量文件存储，可通过分布式文件系统HDFS解决，对于key value类型的数据，可通过HBase和Redis等方案解决，对于全文检索场景，可通过搜索引擎如ElasticSearch解决，对于多维分析场景，可通过Kylin或Druid等方案解决。

当然，引入更多组件同时会提高系统的复杂度，不同的组件保存的数据需要同步，需要考虑一致性的问题，需要有更多的运维手段来管理这些组件等。

引入更多组件解决了丰富的需求，业务维度能够极大扩充，随之而来的是一个应用中包含了太多的业务代码，业务的升级迭代变得困难
* **第十次演进：大应用拆分为小应用**
![](https://segmentfault.com/img/bVbqHzB?w=687&h=455)

按照业务板块来划分应用代码，使单个应用的职责更清晰，相互之间可以做到独立升级迭代。这时候应用之间可能会涉及到一些公共配置，可以通过分布式配置中心Zookeeper来解决。

不同应用之间存在共用的模块，由应用单独管理会导致相同代码存在多份，导致公共功能升级时全部应用代码都要跟着升级
* **第十一次演进：复用的功能抽离成微服务**
![](https://segmentfault.com/img/bVbqHAs?w=682&h=536)

如用户管理、订单、支付、鉴权等功能在多个应用中都存在，那么可以把这些功能的代码单独抽取出来形成一个单独的服务来管理，这样的服务就是所谓的微服务，应用和服务之间通过HTTP、TCP或RPC请求等多种方式来访问公共服务，每个单独的服务都可以由单独的团队来管理。此外，可以通过Dubbo、SpringCloud等框架实现服务治理、限流、熔断、降级等功能，提高服务的稳定性和可用性。

不同服务的接口访问方式不同，应用代码需要适配多种访问方式才能使用服务，此外，应用访问服务，服务之间也可能相互访问，调用链将会变得非常复杂，逻辑变得混乱
* **第十二次演进：引入企业服务总线ESB屏蔽服务接口的访问差异**
![](https://segmentfault.com/img/bVbqHBi?w=693&h=593)

通过ESB统一进行访问协议转换，应用统一通过ESB来访问后端服务，服务与服务之间也通过ESB来相互调用，以此降低系统的耦合程度。这种单个应用拆分为多个应用，公共服务单独抽取出来来管理，并使用企业消息总线来解除服务之间耦合问题的架构，就是所谓的SOA（面向服务）架构，这种架构与微服务架构容易混淆，因为表现形式十分相似。个人理解，微服务架构更多是指把系统里的公共服务抽取出来单独运维管理的思想，而SOA架构则是指一种拆分服务并使服务接口访问变得统一的架构思想，SOA架构中包含了微服务的思想。

业务不断发展，应用和服务都会不断变多，应用和服务的部署变得复杂，同一台服务器上部署多个服务还要解决运行环境冲突的问题，此外，对于如大促这类需要动态扩缩容的场景，需要水平扩展服务的性能，就需要在新增的服务上准备运行环境，部署服务等，运维将变得十分困难
* **第十三次演进：引入容器化技术实现运行环境隔离与动态服务管理**
![](https://segmentfault.com/img/bVbqHBG?w=645&h=614)

目前最流行的容器化技术是Docker，最流行的容器管理服务是Kubernetes(K8S)，应用/服务可以打包为Docker镜像，通过K8S来动态分发和部署镜像。Docker镜像可理解为一个能运行你的应用/服务的最小的操作系统，里面放着应用/服务的运行代码，运行环境根据实际的需要设置好。把整个“操作系统”打包为一个镜像后，就可以分发到需要部署相关服务的机器上，直接启动Docker镜像就可以把服务起起来，使服务的部署和运维变得简单。

在大促的之前，可以在现有的机器集群上划分出服务器来启动Docker镜像，增强服务的性能，大促过后就可以关闭镜像，对机器上的其他服务不造成影响（在3.14节之前，服务运行在新增机器上需要修改系统配置来适配服务，这会导致机器上其他服务需要的运行环境被破坏）。

使用容器化技术后服务动态扩缩容问题得以解决，但是机器还是需要公司自身来管理，在非大促的时候，还是需要闲置着大量的机器资源来应对大促，机器自身成本和运维成本都极高，资源利用率低
* **第十四次演进：以云平台承载系统**
![](https://segmentfault.com/img/bVbqHDy?w=977&h=583)

系统可部署到公有云上，利用公有云的海量机器资源，解决动态硬件资源的问题，在大促的时间段里，在云平台中临时申请更多的资源，结合Docker和K8S来快速部署服务，在大促结束后释放资源，真正做到按需付费，资源利用率大大提高，同时大大降低了运维成本。

所谓的云平台，就是把海量机器资源，通过统一的资源管理，抽象为一个资源整体，在之上可按需动态申请硬件资源（如CPU、内存、网络等），并且之上提供通用的操作系统，提供常用的技术组件（如Hadoop技术栈，MPP数据库等）供用户使用，甚至提供开发好的应用，用户不需要关系应用内部使用了什么技术，就能够解决需求（如音视频转码服务、邮件服务、个人博客等）。在云平台中会涉及如下几个概念：

IaaS：基础设施即服务。对应于上面所说的机器资源统一为资源整体，可动态申请硬件资源的层面；
PaaS：平台即服务。对应于上面所说的提供常用的技术组件方便系统的开发和维护；
SaaS：软件即服务。对应于上面所说的提供开发好的应用或服务，按功能或性能要求付费。
至此，以上所提到的从高并发访问问题，到服务的架构和系统实施的层面都有了各自的解决方案，但同时也应该意识到，在上面的介绍中，其实是有意忽略了诸如跨机房数据同步、分布式事务实现等等的实际问题，这些问题以后有机会再拿出来单独讨论
* **架构设计总结**
* 架构的调整是否必须按照上述演变路径进行？
不是的，以上所说的架构演变顺序只是针对某个侧面进行单独的改进，在实际场景中，可能同一时间会有几个问题需要解决，或者可能先达到瓶颈的是另外的方面，这时候就应该按照实际问题实际解决。如在政府类的并发量可能不大，但业务可能很丰富的场景，高并发就不是重点解决的问题，此时优先需要的可能会是丰富需求的解决方案。
* 对于将要实施的系统，架构应该设计到什么程度？
对于单次实施并且性能指标明确的系统，架构设计到能够支持系统的性能指标要求就足够了，但要留有扩展架构的接口以便不备之需。对于不断发展的系统，如电商平台，应设计到能满足下一阶段用户量和性能指标要求的程度，并根据业务的增长不断的迭代升级架构，以支持更高的并发和更丰富的业务。
* 服务端架构和大数据架构有什么区别？
所谓的“大数据”其实是海量数据采集清洗转换、数据存储、数据分析、数据服务等场景解决方案的一个统称，在每一个场景都包含了多种可选的技术，如数据采集有Flume、Sqoop、Kettle等，数据存储有分布式文件系统HDFS、FastDFS，NoSQL数据库HBase、MongoDB等，数据分析有Spark技术栈、机器学习算法等。总的来说大数据架构就是根据业务的需求，整合各种大数据组件组合而成的架构，一般会提供分布式存储、分布式计算、多维分析、数据仓库、机器学习算法等能力。而服务端架构更多指的是应用组织层面的架构，底层能力往往是由大数据架构来提供。
* 有没有一些架构设计的原则？
    * N+1设计。系统中的每个组件都应做到没有单点故障；
    * 回滚设计。确保系统可以向前兼容，在系统升级时应能有办法回滚版本；
    * 禁用设计。应该提供控制具体功能是否可用的配置，在系统出现故障时能够快速下线功能；
    * 监控设计。在设计阶段就要考虑监控的手段；
    * 多活数据中心设计。若系统需要极高的高可用，应考虑在多地实施数据中心进行多活，至少在一个机房断电的情况下系统依然可用；
    * 采用成熟的技术。刚开发的或开源的技术往往存在很多隐藏的bug，出了问题没有商业支持可能会是一个灾难；
    * 资源隔离设计。应避免单一业务占用全部资源；
    * 架构应能水平扩展。系统只有做到能水平扩展，才能有效避免瓶颈问题；
    * 非核心则购买。非核心功能若需要占用大量的研发资源才能解决，则考虑购买成熟的产品；
    * 使用商用硬件。商用硬件能有效降低硬件故障的机率；
    * 快速迭代。系统应该快速开发小功能模块，尽快上线进行验证，早日发现问题大大降低系统交付的风险；
    * 无状态设计。服务接口应该做成无状态的，当前接口的访问不依赖于接口上次访问的状态。
## 1.4. 序列化机制
<a href="#menu" style="float:right">目录</a>
### 1.4.1. 基本概念
**序列化**:将对象序列化为字节数组，用于网络传输或者磁盘存储。
**反序列化**:将从网络或者磁盘获取的字节数组转化为对象。

* 序列化选择关键点
    * 序列化和反序列化过程的性能
    * 序列化之后的字节长度，这将会影响网络传输。
    * 功能丰富度，比如支持List,Map，复杂对象等
    * 跨语言需求，有的系统由几个不同的应用组成，每个应用可能使用不同的语言开发，因此可能存在跨语言需求。
### 1.4.2. 常用序列化方式性能比较

![](https://img2018.cnblogs.com/blog/1404294/201904/1404294-20190418171605508-1194073956.jpg)
从图上可以看出，protostuff的性能最好，而JDK序列化方式相对来说性能是比较差的。

### 1.4.3. 常用序列化方式实现
#### 1.4.3.1. JDK方式
```java
public class JdkSerializeUtil extends AbstractSerialize {

    public <T> byte[] serialize(T obj) {

        if (obj  == null){
            throw new NullPointerException();
        }

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(obj);
            return bos.toByteArray();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new byte[0];
    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {
        ByteArrayInputStream bis = new ByteArrayInputStream(data);

        try {
            ObjectInputStream ois = new ObjectInputStream(bis);
            T obj = (T)ois.readObject();
            return obj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return  null;
    }
}
```
#### 1.4.3.2. FastJSON
```xml
 <dependency>
     <groupId>com.alibaba</groupId>
     <artifactId>fastjson</artifactId>
     <version>1.2.56</version>
 </dependency>
            
```
```java
public class FastjsonSerializeUtil  extends AbstractSerialize {

    public <T> byte[] serialize(T obj) {
        if (obj  == null){
            throw new NullPointerException();
        }

        String json = JSON.toJSONString(obj);
        byte[] data = json.getBytes();
        return data;
    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {

        T obj = JSON.parseObject(new String(data),clazz);
        return obj;
    }
}
```
#### 1.4.3.3. Hessian
```xml
<dependency>
    <groupId>com.caucho</groupId>
    <artifactId>hessian</artifactId>
    <version>4.0.60</version>
 </dependency>
```
```java
public class HessianSerializeUtil extends AbstractSerialize {



    public <T> byte[] serialize(T obj) {

        if (obj  == null){
            throw new NullPointerException();
        }
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            HessianOutput ho = new HessianOutput(bos);
            ho.writeObject(obj);

            return  bos.toByteArray();
        }
        catch(Exception ex){
            log.error("HessianSerializeUtil序列化发生异常!"+ex);
            throw new  RuntimeException();
        }

    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {

        if (data == null){
            throw  new  NullPointerException();
        }
        try{
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            HessianInput hi = new HessianInput(bis);
            return (T)hi.readObject();

        }
        catch(Exception ex){
            log.error("HessianSerializeUtil反序列化发生异常!"+ex);
            throw new  RuntimeException();
        }

    }
}
```
#### 1.4.3.4. Protostuff
```xml
<dependency>
    <groupId>io.protostuff</groupId>
    <artifactId>protostuff-core</artifactId>
    <version>1.6.0</version>
     <scope>compile</scope>
</dependency>


<!-- https://mvnrepository.com/artifact/io.protostuff/protostuff-runtime -->
 <dependency>
    <groupId>io.protostuff</groupId>
    <artifactId>protostuff-runtime</artifactId>
    <version>1.6.0</version>
</dependency>
```
```java
public class ProtostuffSerializeUtil  extends AbstractSerialize {

    /**
     * 避免每次序列化都重新申请Buffer空间
     */
    private static LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
    /**
     * 缓存Schema
     */
    private static Map<Class<?>, Schema<?>> schemaCache = new ConcurrentHashMap<Class<?>, Schema<?>>();

    public   <T> byte[] serialize(T obj) {

        if (obj  == null){
            throw new NullPointerException();
        }
        Class<T> clazz = (Class<T>) obj.getClass();
        Schema<T> schema = getSchema(clazz);
        byte[] data;
        try {
            data = ProtostuffIOUtil.toByteArray(obj, schema, buffer);
        } finally {
            buffer.clear();
        }

        return data;
    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {
        Schema<T> schema = getSchema(clazz);
        T obj = schema.newMessage();
        ProtostuffIOUtil.mergeFrom(data, obj, schema);
        return obj;
    }


    private static <T> Schema<T> getSchema(Class<T> clazz) {
        Schema<T> schema = (Schema<T>) schemaCache.get(clazz);
        if (schema == null) {
            //这个schema通过RuntimeSchema进行懒创建并缓存
            //所以可以一直调用RuntimeSchema.getSchema(),这个方法是线程安全的
            schema = RuntimeSchema.getSchema(clazz);
            if (schema != null) {
                schemaCache.put(clazz, schema);
            }
        }

        return schema;
    }


}
```
* 测试

|	|码流大小(byte)	|10次(us)	|100次(us)|	1000次(us)|	10000次(us)	|100000次(us)|	 
|---|---|---|---|---|---|---|
|FastJson	|305	|116-243|	106-185|	90-140|	26-39|	8-12|	 
|JDK	|866	|383-777	|502-1101|	123-334	|54-237|	15-76	 |
|Hessian|	520|	959-3836	|376-567|	191-329|	99-161	|30-47|	 
|Protostuff|	193|	103-145|	90-137	|75-135	|15-24|	5-8|

## 1.5. 定时任务
<a href="#menu" style="float:right">目录</a>
在项目开发过程中，我们经常需要执行具有周期性的任务。通过定时任务可以很好的帮助我们实现。
当出现应用进行集群部署，此时单体的定时任务管理就会出问题：两个集群中的应用会执行相同的任务。又衍生出处理分布式定时任务，它利用数据库等方式共享定时任务的信息，当集群中有一个应用运行了定时任务。其他应用便不会再次重复执行任务。

单体应用中常使用的定时任务方式是Spring Scheduler,分布式定时任务框架有Quartz.

## 1.6. Cron表达式
[在线Cron表达式生成:http://cron.qqe2.com/](http://cron.qqe2.com/)
![](https://github.com/lgjlife/Java-Study/blob/master/pic/distribution/cron.png?raw=true)
Cron表达式是一个字符串，字符串以5或6个空格隔开，分为6或7个域，每一个域代表一个含义，Cron有如下两种语法格式：
* Seconds Minutes Hours DayofMonth Month DayofWeek Year
* Seconds Minutes Hours DayofMonth Month DayofWeek

|字段	|允许值	|允许的特殊字符|
|---|---|---|
|秒（Seconds）	|0~59的整数|	, - * /    四个字符|
|分（Minutes）	|0~59的整数	|, - * /    四个字符
|小时（Hours）|	0~23的整数|	, - * /    四个字符
|日期（DayofMonth）	|1~31的整数（但是你需要考虑你月的天数）|	,- * ? / L W C     八个字符
|月份（Month）|	1~12的整数或者 JAN-DEC|	, - * /    四个字符
|星期（DayofWeek）|	1~7的整数或者 SUN-SAT （1=SUN）|	, - * ? / L C #     八个字符
|年(可选，留空)（Year）|	1970~2099|	, - * /    四个字符

**说明：**

* *：表示匹配该域的任意值。假如在Minutes域使用*, 即表示每分钟都会触发事件。
* ?：只能用在DayofMonth和DayofWeek两个域。它也匹配域的任意值，但实际不会。因为DayofMonth和DayofWeek会相互影响。例如想在每月的20日触发调度，不管20日到底是星期几，则只能使用如下写法： 13 13 15 20 * ?, 其中最后一位只能用？，而不能使用*，如果使用*表示不管星期几都会触发，实际上并不是这样。
* -：表示范围。例如在Minutes域使用5-20，表示从5分到20分钟每分钟触发一次 
* /：表示起始时间开始触发，然后每隔固定时间触发一次。例如在Minutes域使用5/20,则意味着5分钟触发一次，而25，45等分别触发一次. 
* ,：表示列出枚举值。例如：在Minutes域使用5,20，则意味着在5和20分每分钟触发一次。 
* L：表示最后，只能出现在DayofWeek和DayofMonth域。如果在DayofWeek域使用5L,意味着在最后的一个星期四触发。 
* W:表示有效工作日(周一到周五),只能出现在DayofMonth域，系统将在离指定日期的最近的有效工作日触发事件。例如：在 DayofMonth使用5W，如果5日是星期六，则将在最近的工作日：星期五，即4日触发。如果5日是星期天，则在6日(周一)触发；如果5日在星期一到星期五中的一天，则就在5日触发。另外一点，W的最近寻找不会跨过月份 。
* LW:这两个字符可以连用，表示在某个月最后一个工作日，即最后一个星期五。 
* #:用于确定每个月第几个星期几，只能出现在DayofMonth域。例如在4#2，表示某月的第二个星期三。

**常用表达式例子**
* 0 0 2 1 * ? *   表示在每月的1日的凌晨2点调整任务
* 0 15 10 ? * MON-FRI   表示周一到周五每天上午10:15执行作业
* 0 15 10 ? 6L 2002-2006   表示2002-2006年的每个月的最后一个星期五上午10:15执行作
* 0 0 10,14,16 * * ?   每天上午10点，下午2点，4点 
* 0 0/30 9-17 * * ?   朝九晚五工作时间内每半小时 
* 0 0 12 ? * WED    表示每个星期三中午12点 
* 0 0 12 * * ?   每天中午12点触发 
* 0 15 10 ? * *    每天上午10:15触发 
* 0 15 10 * * ?     每天上午10:15触发 
* 0 15 10 * * ? *    每天上午10:15触发 
* 0 15 10 * * ? 2005    2005年的每天上午10:15触发 
* 0 * 14 * * ?     在每天下午2点到下午2:59期间的每1分钟触发 
* 0 0/5 14 * * ?    在每天下午2点到下午2:55期间的每5分钟触发 
* 0 0/5 14,18 * * ?     在每天下午2点到2:55期间和下午6点到6:55期间的每5分钟触发 
* 0 0-5 14 * * ?    在每天下午2点到下午2:05期间的每1分钟触发 
* 0 10,44 14 ? 3 WED    每年三月的星期三的下午2:10和2:44触发 
* 0 15 10 ? * MON-FRI    周一至周五的上午10:15触发 
* 0 15 10 15 * ?    每月15日上午10:15触发 
* 0 15 10 L * ?    每月最后一日的上午10:15触发 
* 0 15 10 ? * 6L    每月的最后一个星期五上午10:15触发 
* 0 15 10 ? * 6L 2002-2005   2002年至2005年的每月的最后一个星期五上午10:15触发 
* 0 15 10 ? * 6#3   每月的第三个星期五上午10:15触发

### 1.6.1. Spring Scheduler
<a href="#menu" style="float:right">目录</a>

注解Scheduled
```java
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(Schedules.class)
public @interface Scheduled {
    String CRON_DISABLED = "-";

    String cron() default "";

    String zone() default "";

    long fixedDelay() default -1L;

    String fixedDelayString() default "";

    long fixedRate() default -1L;

    String fixedRateString() default "";

    long initialDelay() default -1L;

    String initialDelayString() default "";
}
````
```java
//在启动类上添加@EnableScheduling
@EnableScheduling
@SpringBootApplication
public class SpringSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSchedulerApplication.class, args);
    }

}

//创建任务类
@Slf4j
@Component
public class Task1 {

    //使用Cron表达式 ，5秒执行一次
    @Scheduled(cron = "0/5 * * * * *")
    public void work1(){
        log.info("work1");
    }


    //下一次的任务执行时间，是从方法最后一次任务执行结束时间开始计算。并以此规则开始周期性的执行任务。
    //也就是说间隔时间是:任务执行的时间+fixedDelay
    @Scheduled(fixedDelay = 1000*3)
    public void work2(){
        log.info("work2");
        try{
            Thread.sleep(5*1000);
        }
        catch(Exception ex){
            log.error(ex.getMessage());
        }

    }

    //按照指定频率执行任务，并以此规则开始周期性的执行调度。
    //以固定周期fixedRate执行
    @Scheduled(fixedRate = 1000*3)
    public void work3(){
        log.info("work3");
        try{
            Thread.sleep(5*1000);
        }
        catch(Exception ex){
            log.error(ex.getMessage());
        }

    }
}
```
Spring Scheduler 底层是由ScheduledThreadPoolExecutor实现，默认只创建一个线程，如果单个应用中出现多个定时任务，将会出现时间漂移，定时时间不准确。因此应当一个任务配置一个线程。需要自定义线程数。
```java
@Configuration
public class ScheduleConfig implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(taskExecutor());
    }

    @Bean
    public Executor taskExecutor() {
        //自定义线程池的线程数，和应用中的任务数量一致
        return Executors.newScheduledThreadPool(2);
    }
}
```
### 1.6.2. Quartz
<a href="#menu" style="float:right">目录</a>
#### 1.6.2.1. Quartz 核心概念
* Job 表示一个工作，要执行的具体内容。此接口中只有一个方法，如下：
* JobDetail 表示一个具体的可执行的调度程序，Job 是这个可执行程调度程序所要执行的内容，另外 JobDetail 还包含了这个任务调度的方案和策略。 
* Trigger 代表一个调度参数的配置，什么时候去调。 
* Scheduler 代表一个调度容器，一个调度容器中可以注册多个 JobDetail 和 Trigger。当 Trigger 与 JobDetail 组合，就可以被 Scheduler 容器调度了。 
[更多使用方式参考](https://www.w3cschool.cn/quartz_doc/)

## 1.7. 分布式ID
<a href="#menu" style="float:right">目录</a>

### 1.7.1. 应用场景
分布式ID的应用场景：
* 数据库主键，在进行分库分表时，如果数据库仍然使用自增，可能会出现主键重复的问题，因此需要应用生成主键。
* 在一些消息中间件的使用场景，在处理消息幂等性时，会为每个消息添加一个唯一ID，消费者通过该ID校验消息是否已经被消费。

### 1.7.2. 分布式ID生成方案

* 分布式ID一般的要求是：
    * 占用空间少，利于存储数字优先于字符串
    * 单调变化
    * 全局唯一
    * 高可用
    * 生成性能好，低延迟
    * 接入简单

**方案1：JDK的UUID方式**
```java
UUID.randomUUID();

0ffe6419-c69c-4266-a5f3-c6327a7d6bf1
```
从上面可以看出，UUID的方式所生成的ID过长，不利于存储，也没有顺序，优点是生成简单。

**方式2：Redis**
使用Redis的自增命令,缺点是如果应用中没有Redis，需要引入新的组件。

**方式3:Zookeeper**
使用ZK的版本号，ZK每次对节点数据进行修改，版本号都会自增。缺点也是要引入新的组件。读写效率也需要进行验证。

**方式4：snowflake算法**
64比特位的数据，使用Long型即可表达。
主要分为三部分： 时间戳(ms)+自定义机器ID+序列号。每个部分的长度根据需求自定义。
机器ID是固定的，时间戳是当前的时间戳，如果两次获取ID都是同一个时间戳，则序列号部分自增，如果是新的时间戳，则将序列号清零。
优点是占用空间小，仅仅8个字节。生成效率高。整体单调递增。但是无法解决时钟漂移问题。假如机器时钟回拨，可能会出现重复ID的问题。分布式环境下也会因为时钟问题出现非单调递增。同时页需要考虑润秒的情况。

**方式5:数据库生成方式**
[Leaf：美团分布式ID生成服务开源](https://tech.meituan.com/2019/03/07/open-source-project-leaf.html)
Leaf是美团基础研发平台推出的一个分布式ID生成服务，名字取自德国哲学家、数学家莱布尼茨的一句话：“There are no two identical leaves in the world.”Leaf具备高可靠、低延迟、全局唯一等特点。目前已经广泛应用于美团金融、美团外卖、美团酒旅等多个部门。具体的技术细节，可参考此前美团技术博客的一篇文章：《Leaf美团分布式ID生成服务》。近日，Leaf项目已经在Github上开源：https://github.com/Meituan-Dianping/Leaf，希望能和更多的技术同行一起交流、共建。

Leaf特性
Leaf在设计之初就秉承着几点要求：

全局唯一，绝对不会出现重复的ID，且ID整体趋势递增。
高可用，服务完全基于分布式架构，即使MySQL宕机，也能容忍一段时间的数据库不可用。
高并发低延时，在CentOS 4C8G的虚拟机上，远程调用QPS可达5W+，TP99在1ms内。
接入简单，直接通过公司RPC服务或者HTTP调用即可接入。
Leaf诞生
Leaf第一个版本采用了预分发的方式生成ID，即可以在DB之上挂N个Server，每个Server启动时，都会去DB拿固定长度的ID List。这样就做到了完全基于分布式的架构，同时因为ID是由内存分发，所以也可以做到很高效。接下来是数据持久化问题，Leaf每次去DB拿固定长度的ID List，然后把最大的ID持久化下来，也就是并非每个ID都做持久化，仅仅持久化一批ID中最大的那一个。这个方式有点像游戏里的定期存档功能，只不过存档的是未来某个时间下发给用户的ID，这样极大地减轻了DB持久化的压力。

整个服务的具体处理过程如下：
![](https://p1.meituan.net/travelcube/210ca1564c70b228ed46f3b33c9bb9b161120.png)


Leaf Server 1：从DB加载号段[1，1000]。
Leaf Server 2：从DB加载号段[1001，2000]。
Leaf Server 3：从DB加载号段[2001，3000]。
用户通过Round-robin的方式调用Leaf Server的各个服务，所以某一个Client获取到的ID序列可能是：1，1001，2001，2，1002，2002……也可能是：1，2，1001，2001，2002，2003，3，4……当某个Leaf Server号段用完之后，下一次请求就会从DB中加载新的号段，这样保证了每次加载的号段是递增的。

Leaf数据库中的号段表格式如下：
```sql
+-------------+--------------+------+-----+-------------------+-----------------------------+
| Field       | Type         | Null | Key | Default           | Extra                       |
+-------------+--------------+------+-----+-------------------+-----------------------------+
| biz_tag     | varchar(128) | NO   | PRI |                   |                             |
| max_id      | bigint(20)   | NO   |     | 1                 |                             |
| step        | int(11)      | NO   |     | NULL              |                             |
| desc        | varchar(256) | YES  |     | NULL              |                             |
| update_time | timestamp    | NO   |     | CURRENT_TIMESTAMP | on update CURRENT_TIMESTAMP |
+-------------+--------------+------+-----+-------------------+-----------------------------+
```
Leaf Server加载号段的SQL语句如下：
```sql
Begin
UPDATE table SET max_id=max_id+step WHERE biz_tag=xxx
SELECT tag, max_id, step FROM table WHERE biz_tag=xxx
Commit
```
整体上，V1版本实现比较简单，主要是为了尽快解决业务层DB压力的问题，而快速迭代出的一个版本。因而在生产环境中，也发现了些问题。比如：

在更新DB的时候会出现耗时尖刺，系统最大耗时取决于更新DB号段的时间。
当更新DB号段的时候，如果DB宕机或者发生主从切换，会导致一段时间的服务不可用。
Leaf双Buffer优化
为了解决这两个问题，Leaf采用了异步更新的策略，同时通过双Buffer的方式，保证无论何时DB出现问题，都能有一个Buffer的号段可以正常对外提供服务，只要DB在一个Buffer的下发的周期内恢复，就不会影响整个Leaf的可用性。

![](https://p1.meituan.net/travelcube/64a44ac6db45e4b7b88b10c85a76614a52159.png)

这个版本代码在线上稳定运行了半年左右，Leaf又遇到了新的问题：

号段长度始终是固定的，假如Leaf本来能在DB不可用的情况下，维持10分钟正常工作，那么如果流量增加10倍就只能维持1分钟正常工作了。
号段长度设置的过长，导致缓存中的号段迟迟消耗不完，进而导致更新DB的新号段与前一次下发的号段ID跨度过大。
Leaf动态调整Step
假设服务QPS为Q，号段长度为L，号段更新周期为T，那么Q * T = L。最开始L长度是固定的，导致随着Q的增长，T会越来越小。但是Leaf本质的需求是希望T是固定的。那么如果L可以和Q正相关的话，T就可以趋近一个定值了。所以Leaf每次更新号段的时候，根据上一次更新号段的周期T和号段长度step，来决定下一次的号段长度nextStep：

T < 15min，nextStep = step * 2
15min < T < 30min，nextStep = step
T > 30min，nextStep = step / 2
至此，满足了号段消耗稳定趋于某个时间区间的需求。当然，面对瞬时流量几十、几百倍的暴增，该种方案仍不能满足可以容忍数据库在一段时间不可用、系统仍能稳定运行的需求。因为本质上来讲，Leaf虽然在DB层做了些容错方案，但是号段方式的ID下发，最终还是需要强依赖DB。

MySQL高可用
在MySQL这一层，Leaf目前采取了半同步的方式同步数据，通过公司DB中间件Zebra加MHA做的主从切换。未来追求完全的强一致，会考虑切换到MySQL Group Replication。

现阶段由于公司数据库强一致的特性还在演进中，Leaf采用了一个临时方案来保证机房断网场景下的数据一致性：

多机房部署数据库，每个机房一个实例，保证都是跨机房同步数据。
半同步超时时间设置到无限大，防止半同步方式退化为异步复制。
Leaf监控
针对服务自身的监控，Leaf提供了Web层的内存数据映射界面，可以实时看到所有号段的下发状态。比如每个号段双buffer的使用情况，当前ID下发到了哪个位置等信息都可以在Web界面上查看。



Leaf Snowflake
Snowflake，Twitter开源的一种分布式ID生成算法。基于64位数实现，下图为Snowflake算法的ID构成图。

![](https://p0.meituan.net/travelcube/96034f8fa0f2cb14c21844a4fa12f50441574.png)

第1位置为0。
第2-42位是相对时间戳，通过当前时间戳减去一个固定的历史时间戳生成。
第43-52位是机器号workerID，每个Server的机器ID不同。
第53-64位是自增ID。
这样通过时间+机器号+自增ID的组合来实现了完全分布式的ID下发。

在这里，Leaf提供了Java版本的实现，同时对Zookeeper生成机器号做了弱依赖处理，即使Zookeeper有问题，也不会影响服务。Leaf在第一次从Zookeeper拿取workerID后，会在本机文件系统上缓存一个workerID文件。即使ZooKeeper出现问题，同时恰好机器也在重启，也能保证服务的正常运行。这样做到了对第三方组件的弱依赖，一定程度上提高了SLA。

未来规划
号段加载优化：Leaf目前重启后的第一次请求还是会同步加载MySQL，之所以这么做而非服务初始化加载号段的原因，主要是MySQL中的Leaf Key并非一定都被这个Leaf服务节点所加载，如果每个Leaf节点都在初始化加载所有的Leaf Key会导致号段的大量浪费。因此，未来会在Leaf服务Shutdown时，备份这个服务节点近一天使用过的Leaf Key列表，这样重启后会预先从MySQL加载Key List中的号段。
单调递增：简易的方式，是只要保证同一时间、同一个Leaf Key都从一个Leaf服务节点获取ID，即可保证递增。需要注意的问题是Leaf服务节点切换时，旧Leaf 服务用过的号段需要废弃。路由逻辑，可采用主备的模型或者每个Leaf Key 配置路由表的方式来实现。
关于开源
分布式ID生成的方案有很多种，Leaf开源版本提供了两种ID的生成方式：

号段模式：低位趋势增长，较少的ID号段浪费，能够容忍MySQL的短时间不可用。
Snowflake模式：完全分布式，ID有语义。
读者可以按需选择适合自身业务场景的ID下发方式。希望美团的方案能给予大家一些帮助，同时也希望各位能够一起交流、共建。

Leaf项目Github地址：https://github.com/Meituan-Dianping/Leaf 。

## 1.8. 分布式锁
[How to do distributed locking](https://martin.kleppmann.com/2016/02/08/how-to-do-distributed-locking.html)
<a href="#menu" style="float:right">目录</a>
不管使用什么中间件，有几点是实现分布式锁必须要考虑到的。
* 互斥：互斥好像是必须的，否则怎么叫锁。
* 死锁: 如果一个线程获得锁，然后挂了，并没有释放锁，致使其他节点(线程)永远无法获取锁，这就是死锁。分布式锁必须做到避免死锁。
* 性能: 高并发分布式系统中，线程互斥等待会成为性能瓶颈，需要好的中间件和实现来保证性能。
* 锁特性：考虑到复杂的场景，分布式锁不能只是加锁，然后一直等待。最好实现如Java Lock的一些功能如：锁判断，超时设置，可重入性等。

### 1.8.1. 使用数据库实现

### 1.8.2. Redis实现分布式锁
redis-2.9之后的set指令如下，提供了不存在则设置，设者超时时间的功能，这条语句具备原子性。
```
set key value px milliseconds nx；
```
使用Redis实现分布式锁需要考虑的问题是：
* 获取到锁之后，该应用宕机了，这个锁还没释放，如何解决
* 获取锁失败如何处理
* 设置了超时时间，但是本次的执行任务的时间超过了锁的超时时间，导致可能出现竞争性问题，如何解决
* 使用主从模式或者哨兵模式提高分布式锁的高可用，但是写入master成功，但是数据还未同步到slave，此时master宕机，slave升级为新的master,其他线程申请该所将会获取到锁，从而发生竞争性问题，如何解决。
* 如何解决操作原子性问题
* 如何实现更加复杂的功能，比如可重入特性

下面讲解如何使用Redis实现分布式锁



### 1.8.3. Zookeeper实现分布式锁

## 1.9. 微服务化
<a href="#menu" style="float:right">目录</a>

### 微服务和SOA

|微服务|SOA|
|---|---|
|能拆分的就拆分|是整体的，服务能放在一起就放在一起|
|纵向业务划分|是水平分多层|
|由单一组织负责|按层级划分不同的组织负责|
|细粒度|粗粒度|
|组件小|存在复杂的组件|
|业务逻辑存在于每一个服务中|业务逻辑横跨多个业务领域|
|使用轻量级的通信方式如HTTP|企业服务总线ESB充当了服务之间通信的角色|

### 1.9.1. 拆分原则
* 公共的业务功能
    * 基础服务
        * 用户服务
        * 计算服务
        * 配置服务
* 重点业务
* 对系统影响较大的业务
‘   * 性能和资源消耗比较大的服务
* 经常变化的业务
    * 说明需要经常变更发布
* 特殊业务主体
    

## 1.10. 缓存
<a href="#menu" style="float:right">目录</a>

### 1.10.1. 缓存一致性问题

## 1.11. 消息机制
<a href="#menu" style="float:right">目录</a>

## 1.12. 服务降级
<a href="#menu" style="float:right">目录</a>

## 1.13. 流量限流
<a href="#menu" style="float:right">目录</a>

## 1.14. 幂等设计
<a href="#menu" style="float:right">目录</a>

## 1.15. 数据一致性
<a href="#menu" style="float:right">目录</a>

### 1.15.1. CAP理论
### 1.15.2. Base理论

## 1.16. 分布式事务实现
<a href="#menu" style="float:right">目录</a>

## 1.17. 负载均衡算法
<a href="#menu" style="float:right">目录</a>

## 1.18. 服务容错设计
<a href="#menu" style="float:right">目录</a>

## 1.19. 集群
<a href="#menu" style="float:right">目录</a>

## 1.20. 分库分表
<a href="#menu" style="float:right">目录</a>

## 1.21. 反向代理&正向代理
<a href="#menu" style="float:right">目录</a>

## 1.22. 客户端优化
<a href="#menu" style="float:right">目录</a>
