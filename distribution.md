
<span id="menu"></span>

<!-- TOC -->

- [1. 分布式系统](#1-分布式系统)
    - [1.1. 基本概念](#11-基本概念)
    - [1.2. 大型网站的特点](#12-大型网站的特点)
        - [1.2.1. 特点](#121-特点)
        - [1.2.2. 模式](#122-模式)
    - [1.3. 分布式系统理论](#13-分布式系统理论)
        - [1.3.1. CAP理论](#131-cap理论)
        - [1.3.2. Base理论](#132-base理论)
        - [1.3.3. 2阶段提交2PC](#133-2阶段提交2pc)
        - [1.3.4. 3阶段提交PC](#134-3阶段提交pc)
        - [1.3.5. Paxos](#135-paxos)
        - [1.3.6. Raft](#136-raft)
    - [1.4. 常用的RPC框架](#14-常用的rpc框架)
        - [1.4.1. Thrift](#141-thrift)
        - [1.4.2. gRPC](#142-grpc)
    - [1.5. Dubbo](#15-dubbo)
        - [1.5.1. 服务架构发展](#151-服务架构发展)
        - [1.5.2. 架构](#152-架构)
        - [1.5.3. 功能](#153-功能)
            - [1.5.3.1. 启动时检查](#1531-启动时检查)
            - [1.5.3.2. 线程模型](#1532-线程模型)
            - [1.5.3.3. 直连提供者](#1533-直连提供者)
            - [1.5.3.4. 只订阅](#1534-只订阅)
            - [1.5.3.5. 只注册](#1535-只注册)
            - [1.5.3.6. 多协议](#1536-多协议)
            - [1.5.3.7. 多注册中心](#1537-多注册中心)
            - [1.5.3.8. 服务分组](#1538-服务分组)
            - [1.5.3.9. 多版本](#1539-多版本)
            - [1.5.3.10. 分组聚合](#15310-分组聚合)
            - [1.5.3.11. 参数验证](#15311-参数验证)
            - [1.5.3.12. 结果缓存](#15312-结果缓存)
            - [1.5.3.13. 泛化引用](#15313-泛化引用)
            - [1.5.3.14. 泛化实现](#15314-泛化实现)
            - [1.5.3.15. 上下文信息](#15315-上下文信息)
            - [1.5.3.16. 隐式参数](#15316-隐式参数)
            - [1.5.3.17. 异步调用](#15317-异步调用)
            - [1.5.3.18. 异步执行](#15318-异步执行)
            - [1.5.3.19. 本地调用](#15319-本地调用)
            - [1.5.3.20. 参数回调](#15320-参数回调)
            - [1.5.3.21. 事件通知](#15321-事件通知)
            - [1.5.3.22. 本地存根](#15322-本地存根)
            - [1.5.3.23. 本地伪装](#15323-本地伪装)
            - [1.5.3.24. 延迟暴露](#15324-延迟暴露)
            - [1.5.3.25. 并发控制](#15325-并发控制)
            - [1.5.3.26. 连接控制](#15326-连接控制)
            - [1.5.3.27. 延迟连接](#15327-延迟连接)
            - [1.5.3.28. 粘滞连接](#15328-粘滞连接)
            - [1.5.3.29. 令牌验证](#15329-令牌验证)
            - [1.5.3.30. 路由规则](#15330-路由规则)
            - [1.5.3.31. 配置规则](#15331-配置规则)
            - [1.5.3.32. 优雅停机](#15332-优雅停机)
        - [1.5.4. 连接协议](#154-连接协议)
            - [1.5.4.1. dubbo](#1541-dubbo)
            - [1.5.4.2. rmi](#1542-rmi)
            - [1.5.4.3. hessian](#1543-hessian)
            - [1.5.4.4. http](#1544-http)
            - [1.5.4.5. webservice](#1545-webservice)
            - [1.5.4.6. thrift](#1546-thrift)
            - [1.5.4.7. memcached](#1547-memcached)
            - [1.5.4.8. redis](#1548-redis)
            - [1.5.4.9. rest](#1549-rest)
        - [1.5.5. 框架原理](#155-框架原理)
            - [1.5.5.1. 架构图](#1551-架构图)
        - [1.5.6. Dubbo 面试](#156-dubbo-面试)
    - [1.6. 架构演进](#16-架构演进)
    - [1.7. Java 中间件](#17-java-中间件)
    - [1.8. 序列化机制](#18-序列化机制)
        - [1.8.1. 基本概念](#181-基本概念)
        - [1.8.2. 常用序列化方式性能比较](#182-常用序列化方式性能比较)
        - [1.8.3. 常用序列化方式实现](#183-常用序列化方式实现)
            - [1.8.3.1. JDK方式](#1831-jdk方式)
            - [1.8.3.2. FastJSON](#1832-fastjson)
            - [1.8.3.3. Hessian](#1833-hessian)
            - [1.8.3.4. Protostuff](#1834-protostuff)
    - [1.9. 定时任务](#19-定时任务)
    - [1.10. Cron表达式](#110-cron表达式)
        - [1.10.1. Spring Scheduler](#1101-spring-scheduler)
        - [1.10.2. Quartz](#1102-quartz)
            - [1.10.2.1. Quartz 核心概念](#11021-quartz-核心概念)
    - [1.11. 分布式ID](#111-分布式id)
        - [1.11.1. 应用场景](#1111-应用场景)
        - [1.11.2. 分布式ID生成方案](#1112-分布式id生成方案)
    - [1.12. 分布式锁](#112-分布式锁)
        - [1.12.1. 使用数据库实现](#1121-使用数据库实现)
        - [1.12.2. Redis实现分布式锁](#1122-redis实现分布式锁)
        - [1.12.3. Zookeeper实现分布式锁](#1123-zookeeper实现分布式锁)
    - [1.13. 微服务化](#113-微服务化)
        - [1.13.1. 微服务和SOA](#1131-微服务和soa)
        - [1.13.2. 拆分原则](#1132-拆分原则)
    - [1.14. 流量限流](#114-流量限流)
    - [1.15. 幂等设计](#115-幂等设计)
    - [1.16. 分布式事务实现](#116-分布式事务实现)
    - [1.17. 负载均衡算法](#117-负载均衡算法)
    - [1.18. 服务容错设计](#118-服务容错设计)
    - [1.19. 集群](#119-集群)
    - [1.20. 分库分表](#120-分库分表)
    - [1.21. 反向代理&正向代理](#121-反向代理正向代理)
    - [1.22. 客户端优化](#122-客户端优化)

<!-- /TOC -->
# 1. 分布式系统
<a href="#menu" style="float:right">目录</a>

## 1.1. 基本概念
* **分布式**
组成系统的多个应用在不同服务器上部署，应用之间通过网络进行通信，即可称为分布式系统，如Tomcat和数据库分别部署在不同的服务器上，或两个相同功能的Tomcat分别部署在不同服务器上.
* 为什么需要分布式系统
    * 升级单机处理能力的性价比越来越低
    * 单机处理能力存在瓶颈 
    * 处于稳定性和可靠性的考虑
    
* **高可用**
系统中部分节点失效时，其他节点能够接替它继续提供服务，则可认为系统具有高可用性
* **集群**
一个特定领域的软件部署在多台服务器上并作为一个整体提供一类服务，这个整体称为集群。如Zookeeper中的Master和Slave分别部署在多台服务器上，共同组成一个整体提供集中配置服务。在常见的集群中，客户端往往能够连接任意一个节点获得服务，并且当集群中一个节点掉线时，其他节点往往能够自动的接替它继续提供服务，这时候说明集群具有高可用性
* **负载均衡**
请求发送到系统时，通过某些方式把请求均匀分发到多个节点上，使系统中每个节点能够均匀的处理请求负载，则可认为系统是负载均衡的
* **正向代理和反向代理**
系统内部要访问外部网络时，统一通过一个代理服务器把请求转发出去，在外部网络看来就是代理服务器发起的访问，此时代理服务器实现的是正向代理；当外部请求进入系统时，代理服务器把该请求转发到系统中的某台服务器上，对外部请求来说，与之交互的只有代理服务器，此时代理服务器实现的是反向代理。简单来说，**正向代理**是代理服务器代替系统内部来访问外部网络的过程，**反向代理**是外部请求访问系统时通过代理服务器转发到内部服务器的过程。

* **分布式系统难点**
    * 缺乏全局时钟，每个节点都有单独的时钟，依据时序来做一些业务处理就比较难。比如雪花漂移生成分布式ID就可能因为时钟漂移出现重复ID
    * 分布式事务问题 
    
## 1.2. 大型网站的特点
<a href="#menu" style="float:right">目录</a>

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

## 1.3. 分布式系统理论


分布式系统实现起来并不轻松，因为它面临着这些问题：
* 消息传递异步无序(asynchronous): 现实网络不是一个可靠的信道，存在消息延时、丢失，节点间消息传递做不到同步有序(synchronous)
* 节点宕机(fail-stop): 节点持续宕机，不会恢复
* 节点宕机恢复(fail-recover): 节点宕机一段时间后恢复，在分布式系统中最常见
* 网络分化(network partition): 网络链路出现问题，将N个节点隔离成多个部分
* 拜占庭将军问题(byzantine failure)[2]: 节点或宕机或逻辑失败，甚至不按套路出牌抛出干扰决议的信息

### 1.3.1. CAP理论
<a href="#menu" style="float:right">目录</a>

CAP定理又称CAP原则，指的是在一个分布式系统中，Consistency（一致性）、 Availability（可用性）、Partition tolerance（分区容错性），最多只能同时三个特性中的两个，三者不可兼得。

**CAP的定义**
* Consistency (一致性)：
    * “all nodes see the same data at the same time”,即更新操作成功并返回客户端后，所有节点在同一时间的数据完全一致，这就是分布式的一致性。一致性的问题在并发系统中不可避免，对于客户端来说，一致性指的是并发访问时更新过的数据如何获取的问题。从服务端来看，则是更新如何复制分布到整个系统，以保证数据最终一致。
* Availability (可用性):
    * 可用性指“Reads and writes always succeed”，即服务一直可用，而且是正常响应时间。好的可用性主要是指系统能够很好的为用户服务，不出现用户操作失败或者访问超时等用户体验不好的情况。
* Partition Tolerance (分区容错性):
    * 分区相当于对时限的要求，系统如果不能在一定的时间内达成数据一致性 ，就意味着发生了分区，必须在C和A之间作出选择。
    * 即分布式系统在遇到某节点或网络分区故障的时候，仍然能够对外提供满足一致性或可用性的服务。

分区容错性要求能够使应用虽然是一个分布式系统，而看上去却好像是在一个可以运转正常的整体。比如现在的分布式系统中有某一个或者几个机器宕掉了，其他剩下的机器还能够正常运转满足系统需求，对于用户而言并没有什么体验上的影响。

**CAP定理的证明**
现在我们就来证明一下，为什么不能同时满足三个特性？

假设有两台服务器，一台放着应用A和数据库V，一台放着应用B和数据库V，他们之间的网络可以互通，也就相当于分布式系统的两个部分。

在满足一致性的时候，两台服务器 N1和N2，一开始两台服务器的数据是一样的，DB0=DB0。在满足可用性的时候，用户不管是请求N1或者N2，都会得到立即响应。在满足分区容错性的情况下，N1和N2有任何一方宕机，或者网络不通的时候，都不会影响N1和N2彼此之间的正常运作。                                               
![](https://img-blog.csdnimg.cn/20181215132729735.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3lleWF6aGlzaGFuZw==,size_16,color_FFFFFF,t_70)


当用户通过N1中的A应用请求数据更新到服务器DB0后，这时N1中的服务器DB0变为DB1，通过分布式系统的数据同步更新操作，N2服务器中的数据库V0也更新为了DB1，这时，用户通过B向数据库发起请求得到的数据就是即时更新后的数据DB1。

上面是正常运作的情况，但分布式系统中，最大的问题就是网络传输问题，现在假设一种极端情况，N1和N2之间的网络断开了，但我们仍要支持这种网络异常，也就是满足分区容错性，那么这样能不能同时满足一致性和可用性呢？
![](https://img-blog.csdnimg.cn/20181215133515612.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3lleWF6aGlzaGFuZw==,size_16,color_FFFFFF,t_70)


假设N1和N2之间通信的时候网络突然出现故障，有用户向N1发送数据更新请求，那N1中的数据DB0将被更新为DB1，由于网络是断开的，N2中的数据库仍旧是DB0；

如果这个时候，有用户向N2发送数据读取请求，由于数据还没有进行同步，应用程序没办法立即给用户返回最新的数据DB1，怎么办呢？有二种选择，第一，牺牲数据一致性，响应旧的数据DB0给用户；第二，牺牲可用性，阻塞等待，直到网络连接恢复，数据更新操作完成之后，再给用户响应最新的数据DB1。

上面的过程比较简单，但也说明了要满足分区容错性的分布式系统，只能在一致性和可用性两者中，选择其中一个。也就是说分布式系统不可能同时满足三个特性。这就需要我们在搭建系统时进行取舍了，那么，怎么取舍才是更好的策略呢?

**取舍策略**
CAP三个特性只能满足其中两个，那么取舍的策略就共有三种：

* CA without P：如果不要求P（不允许分区），则C（强一致性）和A（可用性）是可以保证的。但放弃P的同时也就意味着放弃了系统的扩展性，也就是分布式节点受限，没办法部署子节点，这是违背分布式系统设计的初衷的。
* CP without A：如果不要求A（可用），相当于每个请求都需要在服务器之间保持强一致，而P（分区）会导致同步时间无限延长(也就是等待数据同步完才能正常访问服务)，一旦发生网络故障或者消息丢失等情况，就要牺牲用户的体验，等待所有数据全部一致了之后再让用户访问系统。设计成CP的系统其实不少，最典型的就是分布式数据库，如Redis、HBase等。对于这些分布式数据库来说，数据的一致性是最基本的要求，因为如果连这个标准都达不到，那么直接采用关系型数据库就好，没必要再浪费资源来部署分布式数据库。
* AP wihtout C：要高可用并允许分区，则需放弃一致性。一旦分区发生，节点之间可能会失去联系，为了高可用，每个节点只能用本地数据提供服务，而这样会导致全局数据的不一致性。典型的应用就如某米的抢购手机场景，可能前几秒你浏览商品的时候页面提示是有库存的，当你选择完商品准备下单的时候，系统提示你下单失败，商品已售完。这其实就是先在 A（可用性）方面保证系统可以正常的服务，然后在数据的一致性方面做了些牺牲，虽然多少会影响一些用户体验，但也不至于造成用户购物流程的严重阻塞。

**总结**
现如今，对于多数大型互联网应用的场景，主机众多、部署分散，而且现在的集群规模越来越大，节点只会越来越多，所以节点故障、网络故障是常态，因此分区容错性也就成为了一个分布式系统必然要面对的问题。那么就只能在C和A之间进行取舍。但对于传统的项目就可能有所不同，拿银行的转账系统来说，涉及到金钱的对于数据一致性不能做出一丝的让步，C必须保证，出现网络故障的话，宁可停止服务，可以在A和P之间做取舍。




### 1.3.2. Base理论
<a href="#menu" style="float:right">目录</a>

CAP 不可能同时满足，而分区容错是对于分布式系统而言，是必须的。

**什么是 Base 理论**

BASE：全称：Basically Available(基本可用)，Soft state（软状态）,和 Eventually consistent（最终一致性）三个短语的缩写，来自 ebay 的架构师提出。

Base 理论是对 CAP 中一致性和可用性权衡的结果，其来源于对大型互联网分布式实践的总结，是基于 CAP 定理逐步演化而来的。其核心思想是：既是无法做到强一致性（Strong consistency），但每个应用都可以根据自身的业务特点，采用适当的方式来使系统达到最终一致性（Eventual consistency）。

**Basically Available(基本可用)**
什么是基本可用呢？假设系统，出现了不可预知的故障，但还是能用，相比较正常的系统而言：

响应时间上的损失：正常情况下的搜索引擎 0.5 秒即返回给用户结果，而基本可用的搜索引擎可以在 1 秒作用返回结果。
功能上的损失：在一个电商网站上，正常情况下，用户可以顺利完成每一笔订单，但是到了大促期间，为了保护购物系统的稳定性，部分消费者可能会被引导到一个降级页面。

**Soft state（软状态）**
什么是软状态呢？相对于原子性而言，要求多个节点的数据副本都是一致的，这是一种 “硬状态”。
软状态指的是：允许系统中的数据存在中间状态，并认为该状态不影响系统的整体可用性，即允许系统在多个不同节点的数据副本存在数据延时。
**Eventually consistent（最终一致性）**
这个比较好理解了哈。
上面说软状态，然后不可能一直是软状态，必须有个时间期限。在期限过后，应当保证所有副本保持数据一致性。从而达到数据的最终一致性。这个时间期限取决于网络延时，系统负载，数据复制方案设计等等因素。
稍微官方一点的说法就是：

系统能够保证在没有其他新的更新操作的情况下，数据最终一定能够达到一致的状态，因此所有客户端对系统的数据访问最终都能够获取到最新的值。

而在实际工程实践中，最终一致性分为 5 种：
1. 因果一致性（Causal consistency）
指的是：如果节点 A 在更新完某个数据后通知了节点 B，那么节点 B 之后对该数据的访问和修改都是基于 A 更新后的值。于此同时，和节点 A 无因果关系的节点 C 的数据访问则没有这样的限制。
2. 读己之所写（Read your writes）
这种就很简单了，节点 A 更新一个数据后，它自身总是能访问到自身更新过的最新值，而不会看到旧值。其实也算一种因果一致性。
3. 会话一致性（Session consistency）
会话一致性将对系统数据的访问过程框定在了一个会话当中：系统能保证在同一个有效的会话中实现 “读己之所写” 的一致性，也就是说，执行更新操作之后，客户端能够在同一个会话中始终读取到该数据项的最新值。
4. 单调读一致性（Monotonic read consistency）
单调读一致性是指如果一个节点从系统中读取出一个数据项的某个值后，那么系统对于该节点后续的任何数据访问都不应该返回更旧的值。
5. 单调写一致性（Monotonic write consistency）
指一个系统要能够保证来自同一个节点的写操作被顺序的执行。
然而，在实际的实践中，这 5 种系统往往会结合使用，以构建一个具有最终一致性的分布式系统。实际上，不只是分布式系统使用最终一致性，关系型数据库在某个功能上，也是使用最终一致性的，比如备份，数据库的复制过程是需要时间的，这个复制过程中，业务读取到的值就是旧的。当然，最终还是达成了数据一致性。这也算是一个最终一致性的经典案例。

**总结**
总的来说，BASE 理论面向的是大型高可用可扩展的分布式系统，和传统事务的 ACID 是相反的，它完全不同于 ACID 的强一致性模型，而是通过牺牲强一致性来获得可用性，并允许数据在一段时间是不一致的。


### 1.3.3. 2阶段提交2PC
<a href="#menu" style="float:right">目录</a>

在事务处理，关系型数据库及计算机网路中，2阶段提交协议是一种典型的原子提交协议。它是一种由协调器来处理分布式原子参与者是提交或者回滚事务的分布式算法。

　2PC，二阶段提交协议，即将事务的提交过程分为两个阶段来进行处理：**准备阶段和提交阶段**。事务的发起者称协调者，事务的执行者称参与者。

**阶段1：准备阶段**
1、协调者向所有参与者发送事务内容，询问是否可以提交事务，并等待所有参与者答复。
2、各参与者执行事务操作，将Undo和Redo信息记入事务日志中（但不提交事务）。
3、如参与者执行成功，给协调者反馈YES，即可以提交；如执行失败，给协调者反馈NO，即不可提交。
 
**阶段2：提交阶段**
此阶段分两种情况：所有参与者均反馈YES、或任何一个参与者反馈NO。所有参与者均反馈YES时，即提交事务。任何一个参与者反馈NO时，即中断事务。提交事务：（所有参与者均反馈YES）
1、协调者向所有参与者发出正式提交事务的请求（即Commit请求）。
2、参与者执行Commit请求，并释放整个事务期间占用的资源。
3、各参与者向协调者反馈Ack完成的消息。
4、协调者收到所有参与者反馈的Ack消息后，即完成事务提交。

**中断事务：（任何一个参与者反馈NO）**
1、协调者向所有参与者发出回滚请求（即Rollback请求）。
2、参与者使用阶段1中的Undo信息执行回滚操作，并释放整个事务期间占用的资源。
3、各参与者向协调者反馈Ack完成的消息。
4、协调者收到所有参与者反馈的Ack消息后，即完成事务中断。

**2PC的缺陷**
1、同步阻塞：最大的问题即同步阻塞，即：所有参与事务的逻辑均处于阻塞状态。
2、单点：协调者存在单点问题，如果协调者出现故障，参与者将一直处于锁定状态。
3、脑裂：在阶段2中，如果只有部分参与者接收并执行了Commit请求，会导致节点数据不一致。
 
　　由于2PC存在如上同步阻塞、单点、脑裂问题，因此又出现了2PC的改进方案，即3PC。


### 1.3.4. 3阶段提交PC
<a href="#menu" style="float:right">目录</a>

3PC，三阶段提交协议，是2PC的改进版本，即将事务的提交过程分为CanCommit、PreCommit、do Commit三个阶段来进行处理。
 
**阶段1：CanCommit**
1、协调者向所有参与者发出包含事务内容的CanCommit请求，询问是否可以提交事务，并等待所有参与者答复。
2、参与者收到CanCommit请求后，如果认为可以执行事务操作，则反馈YES并进入预备状态，否则反馈NO。
 
**阶段2：PreCommit**
此阶段分两种情况：
1、所有参与者均反馈YES，即执行事务预提交。
2、任何一个参与者反馈NO，或者等待超时后协调者尚无法收到所有参与者的反馈，即中断事务。
 
事务预提交：（所有参与者均反馈YES时）
1、协调者向所有参与者发出PreCommit请求，进入准备阶段。
2、参与者收到PreCommit请求后，执行事务操作，将Undo和Redo信息记入事务日志中（但不提交事务）。
3、各参与者向协调者反馈Ack响应或No响应，并等待最终指令。
 
中断事务：（任何一个参与者反馈NO，或者等待超时后协调者尚无法收到所有参与者的反馈时）
1、协调者向所有参与者发出abort请求。
2、无论收到协调者发出的abort请求，或者在等待协调者请求过程中出现超时，参与者均会中断事务。
 
**阶段3：do Commit**
 
此阶段也存在两种情况：
1、所有参与者均反馈Ack响应，即执行真正的事务提交。
2、任何一个参与者反馈NO，或者等待超时后协调者尚无法收到所有参与者的反馈，即中断事务。
 
提交事务：（所有参与者均反馈Ack响应时）
1、如果协调者处于工作状态，则向所有参与者发出do Commit请求。
2、参与者收到do Commit请求后，会正式执行事务提交，并释放整个事务期间占用的资源。
3、各参与者向协调者反馈Ack完成的消息。
4、协调者收到所有参与者反馈的Ack消息后，即完成事务提交。
 
中断事务：（任何一个参与者反馈NO，或者等待超时后协调者尚无法收到所有参与者的反馈时）
1、如果协调者处于工作状态，向所有参与者发出abort请求。
2、参与者使用阶段1中的Undo信息执行回滚操作，并释放整个事务期间占用的资源。
3、各参与者向协调者反馈Ack完成的消息。
4、协调者收到所有参与者反馈的Ack消息后，即完成事务中断。
 
　　注意：进入阶段三后，无论协调者出现问题，或者协调者与参与者网络出现问题，都会导致参与者无法接收到协调者发出的do Commit请求或abort请求。此时，参与者都会在等待超时之后，继续执行事务提交。

![](https://s1.51cto.com/images/blog/201801/08/c2a443b5ca846b42d9909fc079f9f360.png?x-oss-process=image/watermark,size_16,text_QDUxQ1RP5Y2a5a6i,color_FFFFFF,t_100,g_se,x_10,y_10,shadow_90,type_ZmFuZ3poZW5naGVpdGk=)


**3PC的优点和缺陷**
* 优点：降低了阻塞范围，在等待超时后协调者或参与者会中断事务。避免了协调者单点问题，阶段3中协调者出现问题时，参与者会继续提交事务。
* 缺陷：脑裂问题依然存在，即在参与者收到PreCommit请求后等待最终指令，如果此时协调者无法与参与者正常通信，会导致参与者继续提交事务，造成数据不一致。

### 1.3.5. Paxos
<a href="#menu" style="float:right">目录</a>

　Paxos是一种基于消息传递的分布式一致性算法，由Leslie Lamport（莱斯利·兰伯特）于1990提出。是目前公认的解决分布式一致性问题的最有效算法之一。

**要解决的问题及应用场景**
Paxos算法要解决的问题，可以理解为：一个异步通信的分布式系统中，如何就某一个值（决议）达成一致。而此处异步通信是指，消息在网络传输过程中存在丢失、超时、乱序现象。
 
其典型应用场景为：
　　在一个分布式系统中，如果各节点初始状态一致，而且每个节点执行相同的命令序列，那么最后就可以得到一个一致的状态。为了保证每个节点执行相同的命令序列，即需要在每一条指令上执行一致性算法（如Paxos算法），来保证每个节点指令一致。
 

**概念定义**
* Proposal：为了就某一个值达成一致而发起的提案，包括提案编号和提案的值。

* 涉及角色如下：
    * Proposer：提案发起者，为了就某一个值达成一致，Proposer可以以任意速度、发起任意数量的提案，可以停止或重启。
    * Acceptor：提案批准者，负责处理接收到的提案，响应、作出承诺、或批准提案。
    * Learner：提案学习者，可以从Acceptor处获取已被批准的提案。
 

**约定**
Paxos需要遵循如下约定：
1、一个Acceptor必须批准它收到的第一个提案。
2、如果编号为n的提案被批准了，那么所有编号大于n的提案，其值必须与编号为n的提案的值相同。
 

**算法描述**
* 阶段一：准备阶段
    * 1、Proposer选择一个提案编号n，向Acceptor广播Prepare(n)请求。
    * 2、Acceptor接收到Prepare(n)请求，如果编号n大于之前已经响应的所有Prepare请求的编号，那么将之前批准过的最大编号的提案反馈给Proposer，并承诺不再接收编号比n小的提案。否则不予理会。
 
* 阶段二：批准阶段
    * 1、Proposer收到半数以上的Acceptor响应后，如果响应中不包含任何提案，那么将提案编号n和自己的值，作为提案发送Accept请求给Acceptor。否则将编号n，与收到的响应中编号最大的提案的值，作为提案发送Accept请求给Acceptor。
    * 2、Acceptor收到编号为n的Accept请求，只要Acceptor尚未对编号大于n的Prepare请求做出响应，就可以批准这个提案。

**死循环问题**
如果Proposer1提出编号为n1的提案，并完成了阶段一。与此同时Proposer2提出了编号为n2的提案，n2>n1，同样也完成了阶段一。于是Acceptor承诺不再批准编号小于n2的提案，当Proposer1进入阶段二时，将会被忽略。同理，此时，Proposer1可以提出编号为n3的提案，n3>n2，又会导致Proposer2的编号为n2的提案进入阶段二时被忽略。以此类推，将进入死循环。
 
**解决办法：**
可以选择一个Proposer作为主Proposer，并约定只有主Proposer才可以提出提案。因此，只要主Proposer可以与过半的Acceptor保持通信，那么但凡主Proposer提出的编号更高的提案，均会被批准。
 

**Learner**
一旦Acceptor批准了某个提案，即将该提案发给所有的Learner。为了避免大量通信，Acceptor也可以将批准的提案，发给主Learner，由主Learner分发给其他Learner。考虑到主Learner单点问题，也可以考虑Acceptor将批准的提案，发给主Learner组，由主Learner组分发给其他Learner。
 


### 1.3.6. Raft
<a href="#menu" style="float:right">目录</a>

Paxos自1990年提出以后，相当长时间内几乎已成为分布式一致性算法的代名词。但因其难以理解和实现，目前知名实现仅有Chubby、Zookeeper、libpaxos几种，其中Zookeeper使用的ZAB对Paxos做了大量改进。为此，2013年斯坦福的Diego Ongaro、John Ousterhout，提出了新的更易理解和实现的一致性算法，即Raft。
 
Raft和Paxos均只要保证n/2+1节点正常，即可服务。相比Paxos，其优势即为易于理解和实现。Raf将算法分解为：选择领导者、日志复制、安全性等几个子问题。它的流程即为：开始时在集群中选举出Leader负责日志复制的管理，Leader接收来自客户端的事务请求（日志），并将它们复制给集群中的其他节点，然后通知集群中的其他节点提交日志，Leader负责保证其他节点与它的日志同步。当Leader宕机时，集群其他节点重新发起选举，选出的新的Leader。
 

**角色**

* Raft涉及三种角色：    
    * Leader：即领导者，负责处理来自客户端的请求，管理日志复制、以及与Follower保持心跳以维持其领导者地位。
    * Follower：即追随者，负责响应来自Leader的日志复制请求，响应来自Candidate的选举请求。初始时所有节点均为Follower。
    * Candidate：即候选者，负责发起选举投票，Raft启动后或Leader宕机后，一个节点从Follower转为Candidate，并发起选举，选举成功后，由Candidate转为Leader。
 
如下为Raft角色状态转换图：
![分布式一致性算法Raft](https://s1.51cto.com/images/blog/201801/10/60da7435486dc2047b07bbe55959a972.png?x-oss-process=image/watermark,size_16,text_QDUxQ1RP5Y2a5a6i,color_FFFFFF,t_100,g_se,x_10,y_10,shadow_90,type_ZmFuZ3poZW5naGVpdGk=)

**Term（任期）** 
　　在Raft中使用了Term（任期）的概念，一轮选举即为一个Term（任期），一个Term中仅能产生一个Leader。Term使用连续递增的编号表示，初始时所有Follower的Term均为1。其中某个Follower定时器到期触发选举，其状态转换为Candidate，此时Term加1变为2，然后开始选举，有如下几种可能：
1、如果当前Term为2的任期内没有选举出Leader或出现异常，Term递增为3，并开始新一轮选举。
2、此轮Term为2的任期内选举出Leader后，如果Leader宕机，此时其他Follower转为Candidate，Term递增，并发起新的选举。
3、如果Leader或Candidate发现自己的Term比其他Follower小时，Leader或Candidate转为Follower，Term递增。
4、如果Follower发现自己的Term比其他Follower小时，更新Term与其他Follower保持一致。
 
　　每次Term递增都将发生新一轮选举，在Raft正常运行过程中，所有节点Term均一致。如果节点不发生故障，一个Term（任期）会一直保持下去，当某节点收到的请求中Term比当前Term小时拒绝请求。
 

**选举**
初始时所有节点均为Follower，且定时器时间不同。某个节点定时器触发选举后，Term递增，该节点由Follower转换为Candidate，向其他节点发起投票请求（RequestVote RPC）。有如下几种可能：
1、收到过半数节点（n/2+1）投票，由Candidate转换为Leader，向其他节点发送心跳以维持领导者地位。
2、如果收到其他节点发送的AppendEntries RPC请求，且该节点Term大于当前节点Term，即发现了新的有效领导者，转换为Follower，否则保持Candidate拒绝该请求。
3、选举超时，Term递增，重新发起选举。
 
每轮Term期间，每个节点均只能投票1次，如果多个Candidate均没有接收到过半数投票，则每个Candidate Term递增，重启定时器并重新发起选举。因定时器时间随机，因此不会多次出现多个Candidate同时发起投票的问题。
 

**日志复制**

保证节点的一致性，就要保证所有节点都按顺序执行相同的操作序列，日志复制目的即为此。
1、Leader接收到客户端事务请求（即日志），先将日志追加到本地Log中，并通过AppendEntries RPC复制给其他Follower。
2、Follower接收到日志后，追加到本地Log中，并向Leader发送ACK消息。
3、Leader收到过半数Follower的ACK消息后，将日志置为已提交并正式提交日志，通知客户端，并发送AppendEntries RPC请求通知Follower提交日志。
 

**安全性**
1、每个Term期间只能选举一个Leader。
2、Leader不会删除或覆盖已有日志条目，只会追加。
3、如果相同索引位置的日志条目Term任期号相同，那么认为从头到这个索引位置均相同。
4、如果某个日志条目在某任期内提交，那么这个日志条目必然出现在更大的Term任期号的所有领导中。
5、如果Leader在某索引位置的日志条目已提交，那么其他节点相同索引位置不会提交不同的日志条目。
 

**RequestVote RPC和AppendEntries RPC**
* Raft中节点通信使用两种RPC，即RequestVote RPC和AppendEntries RPC：
    * RequestVote RPC：即请求投票，由Candidate在选举期间发起。
    * AppendEntries RPC：即附加条目RPC，由Leader发起，用于日志复制和心跳机制。


## 1.4. 常用的RPC框架
<a href="#menu" style="float:right">目录</a>


RPC(Remote Procedure Call,远程过程调用)一般用来实现部署在不同的机器上的系统之间的方法调用，使得程序能够像访问本地系统资源一样，通过网络去访问远端系统资源。
这里通过网络访问，并不限制使用何种协议，RPC不等价于TCP方式。

### 1.4.1. Thrift
* FaceBook开发
* 跨平台和语言，支持多种与语言，比如C/C++，Erlang,Java,Js
* 采用二进制编码协议，使用TCP/IP传输协议

### 1.4.2. gRPC
* 谷歌开发,面向移动和**HTTP2**设计
* 支持C，Java,Go，分别是grpc,grpc-java,grpc-go
* 具备诸如双向流，流空，头部压缩，单TCP连接上的多路复用请求等待特性
* 一般用在移动设备上
* 默认为protocol buffers序列化协议，也可以用其他序列化协议，比如json

## 1.5. Dubbo
<a href="#menu" style="float:right">目录</a>

### 1.5.1. 服务架构发展
<a href="#menu" style="float:right">目录</a>

**一应用架构**
当网站流量很小时，只需一个应用，将所有功能都部署在一起，以减少部署节点和成本。此时，用于简化增删改查工作量的数据访问框架(ORM)是关键。

**垂直应用架构**
当访问量逐渐增大，单一应用增加机器带来的加速度越来越小，将应用拆成互不相干的几个应用，以提升效率。此时，用于加速前端页面开发的Web框架(MVC)是关键。

**分布式服务架构**
当垂直应用越来越多，应用之间交互不可避免，将核心业务抽取出来，作为独立的服务，逐渐形成稳定的服务中心，使前端应用能更快速的响应多变的市场需求。此时，用于提高业务复用及整合的分布式服务框架(RPC)是关键。

**流动计算架构**
当服务越来越多，容量的评估，小服务资源的浪费等问题逐渐显现，此时需增加一个调度中心基于访问压力实时管理集群容量，提高集群利用率。此时，用于提高机器利用率的资源调度和治理中心(SOA)是关键。

### 1.5.2. 架构
<a href="#menu" style="float:right">目录</a>

![基本架构](http://dubbo.apache.org/docs/zh-cn/user/sources/images/dubbo-architecture.jpg)
![服务治理](http://dubbo.apache.org/docs/zh-cn/user/sources/images/dubbo-service-governance.jpg)

**节点角色说明**

|节点	|角色说明|
|---|---|
|Provider|	暴露服务的服务提供方
|Consumer|	调用远程服务的服务消费方
|Registry|	服务注册与发现的注册中心
|Monitor|	统计服务的调用次数和调用时间的监控中心
|Container|	服务运行容器

**调用关系说明**
* 服务容器负责启动，加载，运行服务提供者。
* 服务提供者在启动时，向注册中心注册自己提供的服务。
* 服务消费者在启动时，向注册中心订阅自己所需的服务。
* 注册中心返回服务提供者地址列表给消费者，如果有变更，注册中心将基于长连接推送变更数据给消费者。
* 服务消费者，从提供者地址列表中，基于软负载均衡算法，选一台提供者进行调用，如果调用失败，再选另一台调用。
* 服务消费者和提供者，在内存中累计调用次数和调用时间，定时每分钟发送一次统计数据到监控中心。
* Dubbo 架构具有以下几个特点，分别是连通性、健壮性、伸缩性、以及向未来架构的升级性。

**连通性**
* 注册中心负责服务地址的注册与查找，相当于目录服务，服务提供者和消费者只在启动时与注册中心交互，注册中心不转发请求，压力较小
* 监控中心负责统计各服务调用次数，调用时间等，统计先在内存汇总后每分钟一次发送到监控中心服务器，并以报表展示
* 服务提供者向注册中心注册其提供的服务，并汇报调用时间到监控中心，此时间不包含网络开销
* 服务消费者向注册中心获取服务提供者地址列表，并根据负载算法直接调用提供者，同时汇报调用时间到监控中心，此时间包含网络开销
* 注册中心，服务提供者，服务消费者三者之间均为长连接，监控中心除外
* 注册中心通过长连接感知服务提供者的存在，服务提供者宕机，注册中心将立即推送事件通知消费者
* 注册中心和监控中心全部宕机，不影响已运行的提供者和消费者，消费者在本地缓存了提供者列表
* 注册中心和监控中心都是可选的，服务消费者可以直连服务提供者

**健壮性**
* 监控中心宕掉不影响使用，只是丢失部分采样数据
* 数据库宕掉后，注册中心仍能通过缓存提供服务列表查询，但不能注册新服务
* 注册中心对等集群，任意一台宕掉后，将自动切换到另一台
* 注册中心全部宕掉后，服务提供者和服务消费者仍能通过本地缓存通讯
* 服务提供者无状态，任意一台宕掉后，不影响使用
* 服务提供者全部宕掉后，服务消费者应用将无法使用，并无限次重连等待服务提供者恢复

**伸缩性**
* 注册中心为对等集群，可动态增加机器部署实例，所有客户端将自动发现新的注册中心
* 服务提供者无状态，可动态增加机器部署实例，注册中心将推送新的服务提供者信息给消费者

### 1.5.3. 功能

#### 1.5.3.1. 启动时检查
<a href="#menu" style="float:right">目录</a>

* 启动时检查依赖的服务是否可用，不可用时会抛出异常，导致应用无法启动
* 通过该强制保证依赖的服务必须先启动
* 默认为检查，通过check=true|false进行配置

**集群容错**
* **Failfast Cluster**
    * 快速失败，只发起一次调用，失败立即报错。通常用于非幂等性的写操作，比如新增记录。
* **Failsafe Cluster**  
    * 失败安全，出现异常时，直接忽略。通常用于写入审计日志等操作。
* **Failback Cluster**
    * 失败自动恢复，后台记录失败请求，定时重发。通常用于消息通知操作。
* **Forking Cluster**
    * 并行调用多个服务器，只要一个成功即返回。通常用于实时性要求较高的读操作，但需要浪费更多服务资源。可通过 forks="2" 来设置最大并行数。
* **Broadcast Cluster**
    * 广播调用所有提供者，逐个调用，任意一台报错则报错 [2]。通常用于通知所有提供者更新缓存或日志等本地资源信息。

**负载均衡**
* **Random LoadBalance**
    * 默认 
    * 随机，按权重设置随机概率。
    * 在一个截面上碰撞的概率高，但调用量越大分布越均匀，而且按概率使用权重后也比较均匀，有利于动态调整提供者权重。
* **RoundRobin LoadBalance**
    * 轮询，按公约后的权重设置轮询比率。
    * 存在慢的提供者累积请求的问题，比如：第二台机器很慢，但没挂，当请求调到第二台时就卡在那，久而久之，所有请求都卡在调到第二台上。
* **LeastActive LoadBalance**
    * 最少活跃调用数，相同活跃数的随机，活跃数指调用前后计数差。
    * 使慢的提供者收到更少请求，因为越慢的提供者的调用前后计数差会越大。
* **ConsistentHash LoadBalance**
    * 一致性 Hash，相同参数的请求总是发到同一提供者。
    * 当某一台提供者挂时，原本发往该提供者的请求，基于虚拟节点，平摊到其它提供者，不会引起剧烈变动。
    * 算法参见：http://en.wikipedia.org/wiki/Consistent_hashing

#### 1.5.3.2. 线程模型

* 如果事件处理的逻辑能迅速完成，并且不会发起新的 IO 请求，比如只是在内存中记个标识，则直接在 IO 线程上处理更快，因为减少了线程池调度。

* 但如果事件处理逻辑较慢，或者需要发起新的 IO 请求，比如需要查询数据库，则必须派发到线程池，否则 IO 线程阻塞，将导致不能接收其它请求。

* 如果用 IO 线程处理事件，又在事件处理过程中发起新的 IO 请求，比如在连接事件中发起登录请求，会报“可能引发死锁”异常，但不会真死锁。


* Dispatcher
    * all 
        * 所有消息都派发到线程池，包括请求，响应，连接事件，断开事件，心跳等。
    * direct
        * 所有消息都不派发到线程池，全部在 IO 线程上直接执行。
    * message
        *  只有请求响应消息派发到线程池，其它连接断开事件，心跳等消息，直接在 IO 线程上执行。
    * execution 
        * 只请求消息派发到线程池，不含响应，响应和其它连接断开事件，心跳等消息，直接在 IO 线程上执行。
    * connection 
        * 在 IO 线程上，将连接断开事件放入队列，有序逐个执行，其它消息派发到线程池。
* ThreadPool
    * fixed 
        * 固定大小线程池，启动时建立线程，不关闭，一直持有。(缺省)
    * cached
        * 缓存线程池，空闲一分钟自动删除，需要时重建。
    * limited 
        * 可伸缩线程池，但池中的线程数只会增长不会收缩。只增长不收缩的目的是为了避免收缩时突然来了大流量引起的性能问题。
    * eager
        *  优先创建Worker线程池。在任务数量大于corePoolSize但是小于maximumPoolSize时，优先创建Worker来处理任务。当任务数量大于maximumPoolSize时，将任务放入阻塞队列中。阻塞队列充满时抛出RejectedExecutionException。(相比于cached:cached在任务数量超过maximumPoolSize时直接抛出异常而不是将任务放入阻塞队列)

#### 1.5.3.3. 直连提供者
* 在开发及测试环境下，经常需要绕过注册中心，只测试指定服务提供者，这时候可能需要点对点直连，点对点直连方式，将以服务接口为单位，忽略注册中心的提供者列表，A 接口配置点对点，不影响 B 接口从注册中心获取列表。

#### 1.5.3.4. 只订阅
* 为方便开发测试，经常会在线下共用一个所有服务可用的注册中心，这时，如果一个正在开发中的服务提供者注册，可能会影响消费者不能正常运行。
* 可以让服务提供者开发方，只订阅服务(开发的服务可能依赖其它服务)，而不注册正在开发的服务，通过直连测试正在开发的服务。

#### 1.5.3.5. 只注册
* 如果有两个镜像环境，两个注册中心，有一个服务只在其中一个注册中心有部署，另一个注册中心还没来得及部署，而两个注册中心的其它应用都需要依赖此服务。这个时候，可以让服务提供者方只注册服务到另一注册中心，而不从另一注册中心订阅服务。

#### 1.5.3.6. 多协议
* dubbo 
* rmi
* hessian
* http
* webservice
* thrift
* memcache
* redis
* rest

#### 1.5.3.7. 多注册中心
* Multicast
* Zookeeper
* Nacos
* Redis
* Simple

#### 1.5.3.8. 服务分组
* 当服务有多个版本时，可以通过分组进行区分

#### 1.5.3.9. 多版本
* 一般用于本版升级，对比新版本和旧版本，如果新版本有问题，可以很快进行切换 

#### 1.5.3.10. 分组聚合
按组合并返回结果，比如菜单服务，接口一样，但有多种实现，用group区分，现在消费方需从每种group中调用一次返回结果，合并结果返回，这样就可以实现聚合菜单项。


#### 1.5.3.11. 参数验证
参数验证功能是基于 JSR303 实现的，用户只需标识 JSR303 标准的验证 annotation，并通过声明 filter 来实现验证。
```xml
<dependency>
    <groupId>javax.validation</groupId>
    <artifactId>validation-api</artifactId>
    <version>1.0.0.GA</version>
</dependency>
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-validator</artifactId>
    <version>4.2.0.Final</version>
</dependency>
```
```java

    @NotNull // 不允许为空
    @Size(min = 1, max = 20) // 长度或大小范围
    private String name;
 
    @NotNull(groups = ValidationService.Save.class) // 保存时不允许为空，更新时允许为空 ，表示不更新该字段
    @Pattern(regexp = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$")
    private String email;
 
    @Min(18) // 最小值
    @Max(100) // 最大值
    private int age;
```


#### 1.5.3.12. 结果缓存
* 结果缓存，用于加速热门数据的访问速度，Dubbo 提供声明式缓存，以减少用户加缓存的工作量。
* 缓存类型
    * lru 基于最近最少使用原则删除多余缓存，保持最热的数据被缓存。
    * threadlocal 当前线程缓存，比如一个页面渲染，用到很多 portal，每个 portal 都要去查用户信息，通过线程缓存，可以减少这种多余访问。
    * jcache 与 JSR107 集成，可以桥接各种缓存实现。


#### 1.5.3.13. 泛化引用
* 泛化接口调用方式主要用于客户端没有 API 接口及模型类元的情况，参数及返回值中的所有 POJO 均用 Map 表示，通常用于框架集成，比如：实现一个通用的服务测试框架，可通过 GenericService 调用所有服务实现。

#### 1.5.3.14. 泛化实现
泛接口实现方式主要用于服务器端没有API接口及模型类元的情况，参数及返回值中的所有POJO均用Map表示，通常用于框架集成，比如：实现一个通用的远程服务Mock框架，可通过实现GenericService接口处理所有服务请求。

在 Java 代码中实现 GenericService 接口：
```java
package com.foo;
public class MyGenericService implements GenericService {
 
    public Object $invoke(String methodName, String[] parameterTypes, Object[] args) throws GenericException {
        if ("sayHello".equals(methodName)) {
            return "Welcome " + args[0];
        }
    }
}
```
通过 Spring 暴露泛化实现
在 Spring 配置申明服务的实现：
```xml
<bean id="genericService" class="com.foo.MyGenericService" />
<dubbo:service interface="com.foo.BarService" ref="genericService" />
```
通过 API 方式暴露泛化实现

```java 
// 用org.apache.dubbo.rpc.service.GenericService可以替代所有接口实现 
GenericService xxxService = new XxxGenericService(); 

// 该实例很重量，里面封装了所有与注册中心及服务提供方连接，请缓存 
ServiceConfig<GenericService> service = new ServiceConfig<GenericService>();
// 弱类型接口名 
service.setInterface("com.xxx.XxxService");  
service.setVersion("1.0.0"); 
// 指向一个通用服务实现 
service.setRef(xxxService); 
 
// 暴露及注册服务 
service.export();
```
**回声测试**
回声测试用于检测服务是否可用，回声测试按照正常请求流程执行，能够测试整个调用是否通畅，可用于监控。

所有服务自动实现 EchoService 接口，只需将任意服务引用强制转型为 EchoService，即可使用。

Spring 配置：
```xml
<dubbo:reference id="memberService" interface="com.xxx.MemberService" />
```
代码：
```java
// 远程服务引用
MemberService memberService = ctx.getBean("memberService"); 
EchoService echoService = (EchoService) memberService; // 强制转型为EchoService
// 回声测试可用性
String status = echoService.$echo("OK"); 
assert(status.equals("OK"));
```
#### 1.5.3.15. 上下文信息

上下文中存放的是当前调用过程中所需的环境信息。所有配置信息都将转换为 URL 的参数，参见 schema 配置参考手册 中的对应URL参数一列。

RpcContext 是一个 ThreadLocal 的临时状态记录器，当接收到 RPC 请求，或发起 RPC 请求时，RpcContext 的状态都会变化。比如：A 调 B，B 再调 C，则 B 机器上，在 B 调 C 之前，RpcContext 记录的是 A 调 B 的信息，在 B 调 C 之后，RpcContext 记录的是 B 调 C 的信息。

服务消费方
```java
// 远程调用
xxxService.xxx();
// 本端是否为消费端，这里会返回true
boolean isConsumerSide = RpcContext.getContext().isConsumerSide();
// 获取最后一次调用的提供方IP地址
String serverIP = RpcContext.getContext().getRemoteHost();
// 获取当前服务配置信息，所有配置信息都将转换为URL的参数
String application = RpcContext.getContext().getUrl().getParameter("application");
// 注意：每发起RPC调用，上下文状态会变化
yyyService.yyy();
```
服务提供方
```java
public class XxxServiceImpl implements XxxService {
 
    public void xxx() {
        // 本端是否为提供端，这里会返回true
        boolean isProviderSide = RpcContext.getContext().isProviderSide();
        // 获取调用方IP地址
        String clientIP = RpcContext.getContext().getRemoteHost();
        // 获取当前服务配置信息，所有配置信息都将转换为URL的参数
        String application = RpcContext.getContext().getUrl().getParameter("application");
        // 注意：每发起RPC调用，上下文状态会变化
        yyyService.yyy();
        // 此时本端变成消费端，这里会返回false
        boolean isProviderSide = RpcContext.getContext().isProviderSide();
    } 
}
```


#### 1.5.3.16. 隐式参数
可以通过 RpcContext 上的 setAttachment 和 getAttachment 在服务消费方和提供方之间进行参数的隐式传递。
在服务消费方端设置隐式参数
setAttachment 设置的 KV 对，在完成下面一次远程调用会被清空，即多次远程调用要多次设置。
```java
RpcContext.getContext().setAttachment("index", "1"); // 隐式传参，后面的远程调用都会隐式将这些参数发送到服务器端，类似cookie，用于框架集成，不建议常规业务使用
xxxService.xxx(); // 远程调用
//在服务提供方端获取隐式参数
public class XxxServiceImpl implements XxxService {
 
    public void xxx() {
        // 获取客户端隐式传入的参数，用于框架集成，不建议常规业务使用
        String index = RpcContext.getContext().getAttachment("index"); 
    }
}
```
#### 1.5.3.17. 异步调用
<a href="#menu" style="float:right">目录</a>

#### 1.5.3.18. 异步执行
<a href="#menu" style="float:right">目录</a>

#### 1.5.3.19. 本地调用
<a href="#menu" style="float:right">目录</a>

#### 1.5.3.20. 参数回调
<a href="#menu" style="float:right">目录</a>

#### 1.5.3.21. 事件通知
<a href="#menu" style="float:right">目录</a>

#### 1.5.3.22. 本地存根
<a href="#menu" style="float:right">目录</a>

#### 1.5.3.23. 本地伪装
<a href="#menu" style="float:right">目录</a>

#### 1.5.3.24. 延迟暴露
<a href="#menu" style="float:right">目录</a>

#### 1.5.3.25. 并发控制
<a href="#menu" style="float:right">目录</a>

#### 1.5.3.26. 连接控制
<a href="#menu" style="float:right">目录</a>

#### 1.5.3.27. 延迟连接
<a href="#menu" style="float:right">目录</a>

#### 1.5.3.28. 粘滞连接
<a href="#menu" style="float:right">目录</a>

#### 1.5.3.29. 令牌验证

<a href="#menu" style="float:right">目录</a>

#### 1.5.3.30. 路由规则
<a href="#menu" style="float:right">目录</a>

#### 1.5.3.31. 配置规则
<a href="#menu" style="float:right">目录</a>


#### 1.5.3.32. 优雅停机
<a href="#menu" style="float:right">目录</a>

Dubbo 是通过 JDK 的 ShutdownHook 来完成优雅停机的，所以如果用户使用 kill -9 PID 等强制关闭指令，是不会执行优雅停机的，只有通过 kill PID 时，才会执行。

原理
服务提供方
停止时，先标记为不接收新请求，新请求过来时直接报错，让客户端重试其它机器。
然后，检测线程池中的线程是否正在运行，如果有，等待所有线程执行完成，除非超时，则强制关闭。
服务消费方
停止时，不再发起新的调用请求，所有新的调用在客户端即报错。
然后，检测有没有请求的响应还没有返回，等待响应返回，除非超时，则强制关闭。
设置方式
设置优雅停机超时时间，缺省超时时间是 10 秒，如果超时则强制关闭。


    
### 1.5.4. 连接协议
<a href="#menu" style="float:right">目录</a>

**ubbo**： 单一长连接和NIO异步通讯，适合大并发小数据量的服务调用，以及消费者远大于提供者。传输协议TCP，异步，Hessian序列化；
**rmi**： 采用JDK标准的rmi协议实现，传输参数和返回参数对象需要实现Serializable接口，使用java标准序列化机制，使用阻塞式短连接，传输数据包大小混合，消费者和提供者个数差不多，可传文件，传输协议TCP。
多个短连接，TCP协议传输，同步传输，适用常规的远程服务调用和rmi互操作。在依赖低版本的Common-Collections包，java序列化存在安全漏洞；
**webservice**： 基于WebService的远程调用协议，集成CXF实现，提供和原生WebService的互操作。多个短连接，基于HTTP传输，同步传输，适用系统集成和跨语言调用；
**http**： 基于Http表单提交的远程调用协议，使用Spring的HttpInvoke实现。多个短连接，传输协议HTTP，传入参数大小混合，提供者个数多于消费者，需要给应用程序和浏览器JS调用；
**hessian**： 集成Hessian服务，基于HTTP通讯，采用Servlet暴露服务，Dubbo内嵌Jetty作为服务器时默认实现，提供与Hession服务互操作。多个短连接，同步HTTP传输，Hessian序列化，传入参数较大，提供者大于消费者，提供者压力较大，可传文件；
**memcache**： 基于memcached实现的RPC协议
**redis**： 基于redis实现的RPC协议



#### 1.5.4.1. dubbo
Dubbo 缺省协议采用单一长连接和 NIO 异步通讯，适合于小数据量大并发的服务调用，以及服务消费者机器数远大于服务提供者机器数的情况。

反之，Dubbo 缺省协议不适合传送大数据量的服务，比如传文件，传视频等，除非请求量很低。
![](http://dubbo.apache.org/docs/zh-cn/user/sources/images/dubbo-protocol.jpg)
* Transporter: mina, netty, grizzy
* Serialization: dubbo, hessian2, java, json
* Dispatcher: all, direct, message, execution, connection
* ThreadPool: fixed, cached

**特性**
缺省协议，使用基于 mina 1.1.7 和 hessian 3.2.1 的 tbremoting 交互。
* 连接个数：单连接
* 连接方式：长连接
* 传输协议：TCP
* 传输方式：NIO 异步传输
* 序列化：Hessian 二进制序列化
* 适用范围：传入传出参数数据包较小（建议小于100K），消费者比提供者个数多，单一消费者无法压满提供者，尽量不要用 dubbo 协议传输大文件或超大字符串。
* 适用场景：常规远程服务方法调用
**约束**
* 参数及返回值需实现 Serializable 接口
* 参数及返回值不能自定义实现 List, Map, Number, Date, Calendar 等接口，只能* 用 JDK 自带的实现，因为 hessian 会做特殊处理，自定义实现类中的属性值都会丢失。
* Hessian 序列化，只传成员属性值和值的类型，不传方法或静态变量，兼容情况：

|数据通讯|	情况|	结果|
|---|---|---|
|A->B	|类A多一种 属性（或者说类B少一种 属性）	|不抛异常，A多的那 个属性的值，B没有， 其他正常
|A->B	|枚举A多一种 枚举（或者说B少一种 枚举），A使用多| 出来的枚举进行传输	抛异常
|A->B	|枚举A多一种 枚举（或者说B少一种 枚举），A不使用 |多出来的枚举进行传输	不抛异常，B正常接 收数据
|A->B	|A和B的属性 名相同，但类型不相同|	抛异常
|A->B	|serialId 不相同	|正常传输
接口增加方法，对客户端无影响，如果该方法不是客户端需要的，客户端不需要重新部署。输入参数和结果集中增加属性，对客户端无影响，如果客户端并不需要新属性，不用重新部署。

输入参数和结果集属性名变化，对客户端序列化无影响，但是如果客户端不重新部署，不管输入还是输出，属性名变化的属性值是获取不到的。

总结：服务器端和客户端对领域对象并不需要完全一致，而是按照最大匹配原则。

**常见问题**
* 为什么要消费者比提供者个数多?
    * 因 dubbo 协议采用单一长连接，假设网络为千兆网卡 [3]，根据测试经验数据每条连接最多只能压满 7MByte(不同的环境可能不一样，供参考)，理论上 1 个服务提供者需要 20 个服务消费者才能压满网卡。

* 为什么不能传大包?
    *  因 dubbo 协议采用单一长连接，如果每次请求的数据包大小为 500KByte，假设网络为千兆网卡 [3:1]，每条连接最大 7MByte(不同的环境可能不一样，供参考)，单个服务提供者的 TPS(每秒处理事务数)最大为：128MByte / 500KByte = 262。单个消费者调用单个服务提供者的 TPS(每秒处理事务数)最大为：7MByte / 500KByte = 14。如果能接受，可以考虑使用，否则网络将成为瓶颈。

* 为什么采用异步单一长连接?
    * 因为服务的现状大都是服务提供者少，通常只有几台机器，而服务的消费者多，可能整个网站都在访问该服务，比如 Morgan 的提供者只有 6 台提供者，却有上百台消费者，每天有 1.5 亿次调用，如果采用常规的 hessian 服务，服务提供者很容易就被压跨，通过单一连接，保证单一消费者不会压死提供者，长连接，减少连接握手验证等，并使用异步 IO，复用线程池，防止 C10K 问题。

#### 1.5.4.2. rmi
* RMI 协议采用 JDK 标准的 java.rmi.* 实现，采用阻塞式短连接和 JDK 标准序列化方式。

* 注意：如果正在使用 RMI 提供服务给外部访问 [1]，同时应用里依赖了老的 common-collections 包 [2] 的情况下，存在反序列化安全风险 [3]。

**特性**
* 连接个数：多连接
* 连接方式：短连接
* 传输协议：TCP
* 传输方式：同步传输
* 序列化：Java 标准二进制序列化
* 适用范围：传入传出参数数据包大小混合，消费者与提供者个数差不多，可传文件。
* 适用场景：常规远程服务方法调用，与原生RMI服务互操作
**约束**
* 参数及返回值需实现 Serializable 接口
* dubbo 配置中的超时时间对 RMI 无效，需使用 java 启动参数设置：-Dsun.rmi.transport.tcp.responseTimeout=3000，参见下面的 RMI 配置

#### 1.5.4.3. hessian
Hessian [1] 协议用于集成 Hessian 的服务，Hessian 底层采用 Http 通讯，采用 Servlet 暴露服务，Dubbo 缺省内嵌 Jetty 作为服务器实现。

Dubbo 的 Hessian 协议可以和原生 Hessian 服务互操作，即：

提供者用 Dubbo 的 Hessian 协议暴露服务，消费者直接用标准 Hessian 接口调用
或者提供方用标准 Hessian 暴露服务，消费方用 Dubbo 的 Hessian 协议调用。
**特性**
* 连接个数：多连接
* 连接方式：短连接
* 传输协议：HTTP
* 传输方式：同步传输
* 序列化：Hessian二进制序列化
* 适用范围：传入传出参数数据包较大，提供者比消费者个数多，提供者压力较大，可传文件。
* 适用场景：页面传输，文件传输，或与原生hessian服务互操作
**依赖**
```xml
<dependency>
    <groupId>com.caucho</groupId>
    <artifactId>hessian</artifactId>
    <version>4.0.7</version>
</dependency>
```

**约束**
* 参数及返回值需实现 Serializable 接口
* 参数及返回值不能自定义实现 List, Map, Number, Date, Calendar 等接口，只能用 JDK 自带的实现，因为 hessian 会做特殊处理，自定义实现类中的属性值都会丢失。


#### 1.5.4.4. http
基于 HTTP 表单的远程调用协议，采用 Spring 的 HttpInvoker 实现 [1]

**特性**
* 连接个数：多连接
* 连接方式：短连接
* 传输协议：HTTP
* 传输方式：同步传输
* 序列化：表单序列化
* 适用范围：传入传出参数数据包大小混合，提供者比消费者个数多，可用浏览器查看，可用表单或URL传入参数，暂不支持传文件。
* 适用场景：需同时给应用程序和浏览器 JS 使用的服务。

**约束**
参数及返回值需符合 Bean 规范

#### 1.5.4.5. webservice
基于 WebService 的远程调用协议，基于 Apache CXF [1] 的 frontend-simple 和 transports-http 实现 [2]。

可以和原生 WebService 服务互操作，即：
* 提供者用 Dubbo 的 WebService 协议暴露服务，消费者直接用标准 WebService 接口调用，
* 或者提供方用标准 WebService 暴露服务，消费方用 Dubbo 的 WebService 协议调用。
**依赖**

```xml
<dependency>
    <groupId>org.apache.cxf</groupId>
    <artifactId>cxf-rt-frontend-simple</artifactId>
    <version>2.6.1</version>
</dependency>
<dependency>
    <groupId>org.apache.cxf</groupId>
    <artifactId>cxf-rt-transports-http</artifactId>
    <version>2.6.1</version>
</dependency>
```

**特性**
* 连接个数：多连接
* 连接方式：短连接
* 传输协议：HTTP
* 传输方式：同步传输
* 序列化：SOAP 文本序列化
* 适用场景：系统集成，跨语言调用

**约束**
* 参数及返回值需实现 Serializable 接口
* 参数尽量使用基本类型和 POJO

#### 1.5.4.6. thrift
基于 WebService 的远程调用协议，基于 Apache CXF [1] 的 frontend-simple 和 transports-http 实现 [2]。

可以和原生 WebService 服务互操作，即：

提供者用 Dubbo 的 WebService 协议暴露服务，消费者直接用标准 WebService 接口调用，
或者提供方用标准 WebService 暴露服务，消费方用 Dubbo 的 WebService 协议调用。
**依赖**
```xml
<dependency>
    <groupId>org.apache.cxf</groupId>
    <artifactId>cxf-rt-frontend-simple</artifactId>
    <version>2.6.1</version>
</dependency>
<dependency>
    <groupId>org.apache.cxf</groupId>
    <artifactId>cxf-rt-transports-http</artifactId>
    <version>2.6.1</version>
</dependency>
```

**特性**
* 连接个数：多连接
* 连接方式：短连接
* 传输协议：HTTP
* 传输方式：同步传输
* 序列化：SOAP 文本序列化
* 适用场景：系统集成，跨语言调用

**约束**
* 参数及返回值需实现 Serializable 接口
* 参数尽量使用基本类型和 POJO

#### 1.5.4.7. memcached
#### 1.5.4.8. redis
#### 1.5.4.9. rest
基于标准的Java REST API——JAX-RS 2.0（Java API for RESTful Web Services的简写）实现的REST调用支持

**快速入门**
在dubbo中开发一个REST风格的服务会比较简单，下面以一个注册用户的简单服务为例说明。

这个服务要实现的功能是提供如下URL（注：这个URL不是完全符合REST的风格，但是更简单实用）：

http://localhost:8080/users/register
而任何客户端都可以将包含用户信息的JSON字符串POST到以上URL来完成用户注册。

首先，开发服务的接口：
```java
public interface UserService {    
   void registerUser(User user);
}
```
然后，开发服务的实现：
```java
@Path("/users")
public class UserServiceImpl implements UserService {
       
    @POST
    @Path("/register")
    @Consumes({MediaType.APPLICATION_JSON})
    public void registerUser(User user) {
        // save the user...
    }
}
```
上面的实现非常简单，但是由于该 REST 服务是要发布到指定 URL 上，供任意语言的客户端甚至浏览器来访问，所以这里额外添加了几个 JAX-RS 的标准 annotation 来做相关的配置。
```java
@Path("/users")：指定访问UserService的URL相对路径是/users，即http://localhost:8080/users

@Path("/register")：指定访问registerUser()方法的URL相对路径是/register，再结合上一个@Path为UserService指定的路径，则调用UserService.register()的完整路径为http://localhost:8080/users/register

@POST：指定访问registerUser()用HTTP POST方法

@Consumes({MediaType.APPLICATION_JSON})：指定registerUser()接收JSON格式
的数据。REST框架会自动将JSON数据反序列化为User对象
```
最后，在spring配置文件中添加此服务，即完成所有服务开发工作：
```xml
<!-- 用rest协议在8080端口暴露服务 -->
<dubbo:protocol name="rest" port="8080"/>

<!-- 声明需要暴露的服务接口 -->
<dubbo:service interface="xxx.UserService" ref="userService"/>

<!-- 和本地bean一样实现服务 -->
<bean id="userService" class="xxx.UserServiceImpl" />
```

**REST服务提供端详解**
下面我们扩充“快速入门”中的UserService，进一步展示在dubbo中REST服务提供端的开发要点。

HTTP POST/GET的实现
REST服务中虽然建议使用HTTP协议中四种标准方法POST、DELETE、PUT、GET来分别实现常见的“增删改查”，但实际中，我们一般情况直接用POST来实现“增改”，GET来实现“删查”即可（DELETE和PUT甚至会被一些防火墙阻挡）。

前面已经简单演示了POST的实现，在此，我们为UserService添加一个获取注册用户资料的功能，来演示GET的实现。

这个功能就是要实现客户端通过访问如下不同URL来获取不同ID的用户资料：

http://localhost:8080/users/1001
http://localhost:8080/users/1002
http://localhost:8080/users/1003
当然，也可以通过其他形式的URL来访问不同ID的用户资料，例如：

http://localhost:8080/users/load?id=1001
JAX-RS本身可以支持所有这些形式。但是上面那种在URL路径中包含查询参数的形式（http://localhost:8080/users/1001） 更符合REST的一般习惯，所以更推荐大家来使用。下面我们就为UserService添加一个getUser()方法来实现这种形式的URL访问：
```java
@GET
@Path("/{id : \\d+}")
@Produces({MediaType.APPLICATION_JSON})
public User getUser(@PathParam("id") Long id) {
    // ...
}
```
@GET：指定用HTTP GET方法访问

@Path("/{id : \d+}")：根据上面的功能需求，访问getUser()的URL应当是“http://localhost:8080/users/ + 任意数字"，并且这个数字要被做为参数传入getUser()方法。 这里的annotation配置中，@Path中间的{id: xxx}指定URL相对路径中包含了名为id参数，而它的值也将被自动传递给下面用@PathParam("id")修饰的方法参数id。{id:后面紧跟的\d+是一个正则表达式，指定了id参数必须是数字。

@Produces({MediaType.APPLICATION_JSON})：指定getUser()输出JSON格式的数据。框架会自动将User对象序列化为JSON数据。

Annotation放在接口类还是实现类
在Dubbo中开发REST服务主要都是通过JAX-RS的annotation来完成配置的，在上面的示例中，我们都是将annotation放在服务的实现类中。但其实，我们完全也可以将annotation放到服务的接口上，这两种方式是完全等价的，例如：
```java
@Path("/users")
public interface UserService {
    
    @GET
    @Path("/{id : \\d+}")
    @Produces({MediaType.APPLICATION_JSON})
    User getUser(@PathParam("id") Long id);
}
```
在一般应用中，我们建议将annotation放到服务实现类，这样annotation和java实现代码位置更接近，更便于开发和维护。另外更重要的是，我们一般倾向于避免对接口的污染，保持接口的纯净性和广泛适用性。

但是，如后文所述，如果我们要用dubbo直接开发的消费端来访问此服务，则annotation必须放到接口上。

如果接口和实现类都同时添加了annotation，则实现类的annotation配置会生效，接口上的annotation被直接忽略。

JSON、XML等多数据格式的支持
在dubbo中开发的REST服务可以同时支持传输多种格式的数据，以给客户端提供最大的灵活性。其中我们目前对最常用的JSON和XML格式特别添加了额外的功能。

比如，我们要让上例中的getUser()方法支持分别返回JSON和XML格式的数据，只需要在annotation中同时包含两种格式即可：

@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
User getUser(@PathParam("id") Long id);
或者也可以直接用字符串（还支持通配符）表示MediaType：

@Produces({"application/json", "text/xml"})
User getUser(@PathParam("id") Long id);
如果所有方法都支持同样类型的输入输出数据格式，则我们无需在每个方法上做配置，只需要在服务类上添加annotation即可：
```java
@Path("/users")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public class UserServiceImpl implements UserService {
    // ...
}
```
在一个REST服务同时对多种数据格式支持的情况下，根据JAX-RS标准，一般是通过HTTP中的MIME header（content-type和accept）来指定当前想用的是哪种格式的数据。

但是在dubbo中，我们还自动支持目前业界普遍使用的方式，即用一个URL后缀（.json和.xml）来指定想用的数据格式。例如，在添加上述annotation后，直接访问http://localhost:8888/users/1001.json则表示用json格式，直接访问http://localhost:8888/users/1002.xml则表示用xml格式，比用HTTP Header更简单直观。Twitter、微博等的REST API都是采用这种方式。

如果你既不加HTTP header，也不加后缀，则dubbo的REST会优先启用在以上annotation定义中排位最靠前的那种数据格式。

注意：这里要支持XML格式数据，在annotation中既可以用MediaType.TEXT_XML，也可以用MediaType.APPLICATION_XML，但是TEXT_XML是更常用的，并且如果要利用上述的URL后缀方式来指定数据格式，只能配置为TEXT_XML才能生效。

中文字符支持
为了在dubbo REST中正常输出中文字符，和通常的Java web应用一样，我们需要将HTTP响应的contentType设置为UTF-8编码。

基于JAX-RS的标准用法，我们只需要做如下annotation配置即可：

@Produces({"application/json; charset=UTF-8", "text/xml; charset=UTF-8"})
User getUser(@PathParam("id") Long id);
为了方便用户，我们在dubbo REST中直接添加了一个支持类，来定义以上的常量，可以直接使用，减少出错的可能性。

@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
User getUser(@PathParam("id") Long id);
XML数据格式的额外要求
由于JAX-RS的实现一般都用标准的JAXB（Java API for XML Binding）来序列化和反序列化XML格式数据，所以我们需要为每一个要用XML传输的对象添加一个类级别的JAXB annotation，否则序列化将报错。例如为getUser()中返回的User添加如下：

@XmlRootElement
public class User implements Serializable {
    // ...
}
此外，如果service方法中的返回值是Java的 primitive类型（如int，long，float，double等），最好为它们添加一层wrapper对象，因为JAXB不能直接序列化primitive类型。

例如，我们想让前述的registerUser()方法返回服务器端为用户生成的ID号：

long registerUser(User user);
由于primitive类型不被JAXB序列化支持，所以添加一个wrapper对象：
```java
@XmlRootElement
public class RegistrationResult implements Serializable {
    
    private Long id;
    
    public RegistrationResult() {
    }
    
    public RegistrationResult(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
}
```
并修改service方法：

RegistrationResult registerUser(User user);
这样不但能够解决XML序列化的问题，而且使得返回的数据都符合XML和JSON的规范。例如，在JSON中，返回的将是如下形式：

{"id": 1001}
如果不加wrapper，JSON返回值将直接是

1001 	
而在XML中，加wrapper后返回值将是：
```xml
<registrationResult>
    <id>1002</id>
</registrationResult>
```
这种wrapper对象其实利用所谓Data Transfer Object（DTO）模式，采用DTO还能对传输数据做更多有用的定制。

定制序列化
如上所述，REST的底层实现会在service的对象和JSON/XML数据格式之间自动做序列化/反序列化。但有些场景下，如果觉得这种自动转换不满足要求，可以对其做定制。

Dubbo中的REST实现是用JAXB做XML序列化，用Jackson做JSON序列化，所以在对象上添加JAXB或Jackson的annotation即可以定制映射。

例如，定制对象属性映射到XML元素的名字：
```java
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable {
    
    @XmlElement(name="username") 
    private String name;  
}
定制对象属性映射到JSON字段的名字：

public class User implements Serializable {
    
    @JsonProperty("username")
    private String name;
}
```
更多资料请参考JAXB和Jackson的官方文档，或自行google。

配置REST Server的实现
目前在dubbo中，我们支持5种嵌入式rest server的实现，并同时支持采用外部应用服务器来做rest server的实现。rest server可以通过如下配置实现：
```xml
<dubbo:protocol name="rest" server="jetty"/>
```
以上配置选用了嵌入式的jetty来做rest server，同时，如果不配置server属性，rest协议默认也是选用jetty。jetty是非常成熟的java servlet容器，并和dubbo已经有较好的集成（目前5种嵌入式server中只有jetty和后面所述的tomcat、tjws，与dubbo监控系统等完成了无缝的集成），所以，如果你的dubbo系统是单独启动的进程，你可以直接默认采用jetty即可。
```xml
<dubbo:protocol name="rest" server="tomcat"/>
```
以上配置选用了嵌入式的tomcat来做rest server。在嵌入式tomcat上，REST的性能比jetty上要好得多（参见后面的基准测试），建议在需要高性能的场景下采用tomcat。
```xml
<dubbo:protocol name="rest" server="netty"/>
```
以上配置选用嵌入式的netty来做rest server。（TODO more contents to add）
```xml
<dubbo:protocol name="rest" server="tjws"/> (tjws is now deprecated)
<dubbo:protocol name="rest" server="sunhttp"/>
```
以上配置选用嵌入式的tjws或Sun HTTP server来做rest server。这两个server实现非常轻量级，非常方便在集成测试中快速启动使用，当然也可以在负荷不高的生产环境中使用。	注：tjws目前已经被deprecated掉了，因为它不能很好的和servlet 3.1 API工作。

如果你的dubbo系统不是单独启动的进程，而是部署到了Java应用服务器中，则建议你采用以下配置：
```xml
<dubbo:protocol name="rest" server="servlet"/>
```
通过将server设置为servlet，dubbo将采用外部应用服务器的servlet容器来做rest server。同时，还要在dubbo系统的web.xml中添加如下配置：
```xml
<web-app>
    <context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>/WEB-INF/classes/META-INF/spring/dubbo-demo-provider.xml</param-value>
    </context-param>
    
    <listener>
        <listener-class>org.apache.dubbo.remoting.http.servlet.BootstrapListener</listener-class>
    </listener>
    
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>
    
    <servlet>
        <servlet-name>dispatcher</servlet-name>
        <servlet-class>org.apache.dubbo.remoting.http.servlet.DispatcherServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
    
    <servlet-mapping>
        <servlet-name>dispatcher</servlet-name>
        <url-pattern>/*</url-pattern>
    </servlet-mapping>
</web-app>
```
即必须将dubbo的BootstrapListener和DispatherServlet添加到web.xml，以完成dubbo的REST功能与外部servlet容器的集成。

注意：如果你是用spring的ContextLoaderListener来加载spring，则必须保证BootstrapListener配置在ContextLoaderListener之前，否则dubbo初始化会出错。

其实，这种场景下你依然可以坚持用嵌入式server，但外部应用服务器的servlet容器往往比嵌入式server更加强大（特别是如果你是部署到更健壮更可伸缩的WebLogic，WebSphere等），另外有时也便于在应用服务器做统一管理、监控等等。

获取上下文（Context）信息
在远程调用中，值得获取的上下文信息可能有很多种，这里特别以获取客户端IP为例。

在dubbo的REST中，我们有两种方式获取客户端IP。

第一种方式，用JAX-RS标准的@Context annotation：
```java
public User getUser(@PathParam("id") Long id, @Context HttpServletRequest request) {
    System.out.println("Client address is " + request.getRemoteAddr());
} 
用Context修饰getUser()的一个方法参数后，就可以将当前的HttpServletRequest注入进来，然后直接调用servlet api获取IP。

注意：这种方式只能在将server设置为 tjws、tomcat、jetty 或者 servlet 的时候才能工作，因为只有这几种 server 的实现才提供了 servlet 容器。另外，标准的JAX-RS还支持用@Context修饰service类的一个实例字段来获取HttpServletRequest，但在dubbo中我们没有对此作出支持。

第二种方式，用dubbo中常用的RpcContext：

public User getUser(@PathParam("id") Long id) {
    System.out.println("Client address is " + RpcContext.getContext().getRemoteAddressString());
} 
注意：这种方式只能在设置server="jetty"或者server="tomcat"或者server="servlet"或者server="tjws"的时候才能工作。另外，目前dubbo的RpcContext是一种比较有侵入性的用法，未来我们很可能会做出重构。

如果你想保持你的项目对JAX-RS的兼容性，未来脱离dubbo也可以运行，请选择第一种方式。如果你想要更优雅的服务接口定义，请选用第二种方式。

此外，在最新的dubbo rest中，还支持通过RpcContext来获取HttpServletRequest和HttpServletResponse，以提供更大的灵活性来方便用户实现某些复杂功能，比如在dubbo标准的filter中访问HTTP Header。用法示例如下：

if (RpcContext.getContext().getRequest() != null && RpcContext.getContext().getRequest() instanceof HttpServletRequest) {
    System.out.println("Client address is " + ((HttpServletRequest) RpcContext.getContext().getRequest()).getRemoteAddr());
}

if (RpcContext.getContext().getResponse() != null && RpcContext.getContext().getResponse() instanceof HttpServletResponse) {
    System.out.println("Response object from RpcContext: " + RpcContext.getContext().getResponse());
}
```
注意：为了保持协议的中立性，RpcContext.getRequest()和RpcContext.getResponse()返回的仅仅是一个Object类，而且可能为null。所以，你必须自己做null和类型的检查。

注意：只有在设置server="jetty"或者server="tomcat"或者server="servlet"的时候，你才能通过以上方法正确的得到HttpServletRequest和HttpServletResponse，因为只有这几种server实现了servlet容器。

为了简化编程，在此你也可以用泛型的方式来直接获取特定类型的request/response：
```java
if (RpcContext.getContext().getRequest(HttpServletRequest.class) != null) {
    System.out.println("Client address is " + RpcContext.getContext().getRequest(HttpServletRequest.class).getRemoteAddr());
}

if (RpcContext.getContext().getResponse(HttpServletResponse.class) != null) {
    System.out.println("Response object from RpcContext: " + RpcContext.getContext().getResponse(HttpServletResponse.class));
}
```
如果request/response不符合指定的类型，这里也会返回null。

配置端口号和Context Path
dubbo中的rest协议默认将采用80端口，如果想修改端口，直接配置：
```xml
<dubbo:protocol name="rest" port="8888"/>
```
另外，如前所述，我们可以用@Path来配置单个rest服务的URL相对路径。但其实，我们还可以设置一个所有rest服务都适用的基础相对路径，即java web应用中常说的context path。

只需要添加如下contextpath属性即可：

< dubbo:protocol name="rest" port="8888" contextpath="services"/>
以前面代码为例：
```xml
@Path("/users")
public class UserServiceImpl implements UserService {
       
    @POST
    @Path("/register")
    @Consumes({MediaType.APPLICATION_JSON})
    public void registerUser(User user) {
        // save the user...
    }	
}
```
现在registerUser()的完整访问路径为：

http://localhost:8888/services/users/register
注意：如果你是选用外部应用服务器做rest server，即配置:
```xml
<dubbo:protocol name="rest" port="8888" contextpath="services" server="servlet"/>
```
则必须保证这里设置的port、contextpath，与外部应用服务器的端口、DispatcherServlet的上下文路径（即webapp path加上servlet url pattern）保持一致。例如，对于部署为tomcat ROOT路径的应用，这里的contextpath必须与web.xml中DispacherServlet的<url-pattern/>完全一致：
```xml
<servlet-mapping>
     <servlet-name>dispatcher</servlet-name>
     <url-pattern>/services/*</url-pattern>
</servlet-mapping>
```
配置线程数和IO线程数
可以为rest服务配置线程池大小：
```
<dubbo:protocol name="rest" threads="500"/>
```
注意：目前线程池的设置只有当server="netty"或者server="jetty"或者server="tomcat"的时候才能生效。另外，如果server="servlet"，由于这时候启用的是外部应用服务器做rest server，不受dubbo控制，所以这里的线程池设置也无效。

如果是选用netty server，还可以配置Netty的IO worker线程数：
```xml
<dubbo:protocol name="rest" iothreads="5" threads="100"/>
```
配置长连接
Dubbo中的rest服务默认都是采用http长连接来访问，如果想切换为短连接，直接配置：
```xml
<dubbo:protocol name="rest" keepalive="false"/>
```
注意：这个配置目前只对server="netty"和server="tomcat"才能生效。

配置最大的HTTP连接数
可以配置服务器提供端所能同时接收的最大HTTP连接数，防止REST server被过多连接撑爆，以作为一种最基本的自我保护机制：
```xml
<dubbo:protocol name="rest" accepts="500" server="tomcat/>
```
注意：这个配置目前只对server="tomcat"才能生效。

配置每个消费端的超时时间和HTTP连接数
如果rest服务的消费端也是dubbo系统，可以像其他dubbo RPC机制一样，配置消费端调用此rest服务的最大超时时间以及每个消费端所能启动的最大HTTP连接数。
```xml
<dubbo:service interface="xxx" ref="xxx" protocol="rest" timeout="2000" connections="10"/>
```
当然，由于这个配置针对消费端生效的，所以也可以在消费端配置：
```xml
<dubbo:reference id="xxx" interface="xxx" timeout="2000" 
```connections="10"/>
但是，通常我们建议配置在服务提供端提供此类配置。按照dubbo官方文档的说法：“Provider上尽量多配置Consumer端的属性，让Provider实现者一开始就思考Provider服务特点、服务质量的问题。”

注意：如果dubbo的REST服务是发布给非dubbo的客户端使用，则这里<dubbo:service/>上的配置完全无效，因为这种客户端不受dubbo控制。

用Annotation取代部分Spring XML配置
以上所有的讨论都是基于dubbo在spring中的xml配置。但是，dubbo/spring本身也支持用annotation来作配置，所以我们也可以按dubbo官方文档中的步骤，把相关annotation加到REST服务的实现中，取代一些xml配置，例如：
```java
@Service(protocol = "rest")
@Path("/users")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
       
    @POST
    @Path("/register")
    @Consumes({MediaType.APPLICATION_JSON})
    public void registerUser(User user) {
        // save the user
        userRepository.save(user);
    }	
}
```
annotation的配置更简单更精确，通常也更便于维护（当然现代IDE都可以在xml中支持比如类名重构，所以就这里的特定用例而言，xml的维护性也很好）。而xml对代码的侵入性更小一些，尤其有利于动态修改配置，特别是比如你要针对单个服务配置连接超时时间、每客户端最大连接数、集群策略、权重等等。另外，特别对复杂应用或者模块来说，xml提供了一个中心点来涵盖的所有组件和配置，更一目了然，一般更便于项目长时期的维护。

当然，选择哪种配置方式没有绝对的优劣，和个人的偏好也不无关系。

添加自定义的Filter、Interceptor等
Dubbo的REST也支持JAX-RS标准的Filter和Interceptor，以方便对REST的请求与响应过程做定制化的拦截处理。

其中，Filter主要用于访问和设置HTTP请求和响应的参数、URI等等。例如，设置HTTP响应的cache header：
```java
public class CacheControlFilter implements ContainerResponseFilter {

    public void filter(ContainerRequestContext req, ContainerResponseContext res) {
        if (req.getMethod().equals("GET")) {
            res.getHeaders().add("Cache-Control", "someValue");
        }
    }
}
```
Interceptor主要用于访问和修改输入与输出字节流，例如，手动添加GZIP压缩：
```java
public class GZIPWriterInterceptor implements WriterInterceptor {
 
    @Override
    public void aroundWriteTo(WriterInterceptorContext context)
                    throws IOException, WebApplicationException {
        OutputStream outputStream = context.getOutputStream();
        context.setOutputStream(new GZIPOutputStream(outputStream));
        context.proceed();
    }
}
```
在标准JAX-RS应用中，我们一般是为Filter和Interceptor添加@Provider annotation，然后JAX-RS runtime会自动发现并启用它们。而在dubbo中，我们是通过添加XML配置的方式来注册Filter和Interceptor：
```xml
<dubbo:protocol name="rest" port="8888" extension="xxx.TraceInterceptor, xxx.TraceFilter"/>
```
在此，我们可以将Filter、Interceptor和DynamicFeature这三种类型的对象都添加到extension属性上，多个之间用逗号分隔。（DynamicFeature是另一个接口，可以方便我们更动态的启用Filter和Interceptor，感兴趣请自行google。）

当然，dubbo自身也支持Filter的概念，但我们这里讨论的Filter和Interceptor更加接近协议实现的底层，相比dubbo的filter，可以做更底层的定制化。

注：这里的XML属性叫extension，而不是叫interceptor或者filter，是因为除了Interceptor和Filter，未来我们还会添加更多的扩展类型。

如果REST的消费端也是dubbo系统（参见下文的讨论），则也可以用类似方式为消费端配置Interceptor和Filter。但注意，JAX-RS中消费端的Filter和提供端的Filter是两种不同的接口。例如前面例子中服务端是ContainerResponseFilter接口，而消费端对应的是ClientResponseFilter:
```java
public class LoggingFilter implements ClientResponseFilter {
 
    public void filter(ClientRequestContext reqCtx, ClientResponseContext resCtx) throws IOException {
        System.out.println("status: " + resCtx.getStatus());
	    System.out.println("date: " + resCtx.getDate());
	    System.out.println("last-modified: " + resCtx.getLastModified());
	    System.out.println("location: " + resCtx.getLocation());
	    System.out.println("headers:");
	    for (Entry<String, List<String>> header : resCtx.getHeaders().entrySet()) {
     	    System.out.print("\t" + header.getKey() + " :");
	        for (String value : header.getValue()) {
	            System.out.print(value + ", ");
	        }
	        System.out.print("\n");
	    }
	    System.out.println("media-type: " + resCtx.getMediaType().getType());
    } 
}
```
添加自定义的Exception处理
Dubbo的REST也支持JAX-RS标准的ExceptionMapper，可以用来定制特定exception发生后应该返回的HTTP响应。
```java
public class CustomExceptionMapper implements ExceptionMapper<NotFoundException> {

    public Response toResponse(NotFoundException e) {     
        return Response.status(Response.Status.NOT_FOUND).entity("Oops! the requested resource is not found!").type("text/plain").build();
    }
}
```
和Interceptor、Filter类似，将其添加到XML配置文件中即可启用：
```xml
<dubbo:protocol name="rest" port="8888" extension="xxx.CustomExceptionMapper"/>
```
配置HTTP日志输出
Dubbo rest支持输出所有HTTP请求/响应中的header字段和body消息体。

在XML配置中添加如下自带的REST filter：
```xml
<dubbo:protocol name="rest" port="8888" extension="org.apache.dubbo.rpc.protocol.rest.support.LoggingFilter"/>
```
然后配置在logging配置中至少为org.apache.dubbo.rpc.protocol.rest.support打开INFO级别日志输出，例如，在log4j.xml中配置：
```xml
<logger name="org.apache.dubbo.rpc.protocol.rest.support">
    <level value="INFO"/>
    <appender-ref ref="CONSOLE"/>
</logger>
```
当然，你也可以直接在ROOT logger打开INFO级别日志输出：
```xml
<root>
	<level value="INFO" />
	<appender-ref ref="CONSOLE"/>
</root>
```
然后在日志中会有类似如下的内容输出：
```
The HTTP headers are: 
accept: application/json;charset=UTF-8
accept-encoding: gzip, deflate
connection: Keep-Alive
content-length: 22
content-type: application/json
host: 192.168.1.100:8888
user-agent: Apache-HttpClient/4.2.1 (java 1.5)
The contents of request body is: 
{"id":1,"name":"dang"}
```
打开HTTP日志输出后，除了正常日志输出的性能开销外，也会在比如HTTP请求解析时产生额外的开销，因为需要建立额外的内存缓冲区来为日志的输出做数据准备。

输入参数的校验
dubbo的rest支持采用Java标准的bean validation annotation（JSR 303)来做输入校验http://beanvalidation.org/

为了和其他dubbo远程调用协议保持一致，在rest中作校验的annotation必须放在服务的接口上，例如：
```java
public interface UserService {
   
    User getUser(@Min(value=1L, message="User ID must be greater than 1") Long id);
}
```
当然，在很多其他的bean validation的应用场景都是将annotation放到实现类而不是接口上。把annotation放在接口上至少有一个好处是，dubbo的客户端可以共享这个接口的信息，dubbo甚至不需要做远程调用，在本地就可以完成输入校验。

然后按照dubbo的标准方式在XML配置中打开验证：
```xml
<dubbo:service interface=xxx.UserService" ref="userService" protocol="rest" validation="true"/>
```
在dubbo的其他很多远程调用协议中，如果输入验证出错，是直接将RpcException抛向客户端，而在rest中由于客户端经常是非dubbo，甚至非java的系统，所以不便直接抛出Java异常。因此，目前我们将校验错误以XML的格式返回：
```xml
<violationReport>
    <constraintViolations>
        <path>getUserArgument0</path>
        <message>User ID must be greater than 1</message>
        <value>0</value>
    </constraintViolations>
</violationReport>
```
稍后也会支持其他数据格式的返回值。至于如何对验证错误消息作国际化处理，直接参考bean validation的相关文档即可。

如果你认为默认的校验错误返回格式不符合你的要求，可以如上面章节所述，添加自定义的ExceptionMapper来自由的定制错误返回格式。需要注意的是，这个ExceptionMapper必须用泛型声明来捕获dubbo的RpcException，才能成功覆盖dubbo rest默认的异常处理策略。为了简化操作，其实这里最简单的方式是直接继承dubbo rest的RpcExceptionMapper，并覆盖其中处理校验异常的方法即可：
```java
public class MyValidationExceptionMapper extends RpcExceptionMapper {

    protected Response handleConstraintViolationException(ConstraintViolationException cve) {
        ViolationReport report = new ViolationReport();
        for (ConstraintViolation cv : cve.getConstraintViolations()) {
            report.addConstraintViolation(new RestConstraintViolation(
                    cv.getPropertyPath().toString(),
                    cv.getMessage(),
                    cv.getInvalidValue() == null ? "null" : cv.getInvalidValue().toString()));
        }
        // 采用json输出代替xml输出
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(report).type(ContentType.APPLICATION_JSON_UTF_8).build();
    }
}
```
然后将这个ExceptionMapper添加到XML配置中即可：
```xml
<dubbo:protocol name="rest" port="8888" extension="xxx.MyValidationExceptionMapper"/>
```

### 1.5.5. 框架原理
<a href="#menu" style="float:right">目录</a>

#### 1.5.5.1. 架构图
<a href="#menu" style="float:right">目录</a>
![](https://youzhixueyuan.com/blog/wp-content/uploads/2019/07/20190731230051_40168.jpg)

**Dubbo框架设计一共划分了10个层：**
* **服务接口层（Service）**：该层是与实际业务逻辑相关的，根据服务提供方和服务消费方的业务设计对应的接口和实现。
* **配置层（Config）**：对外配置接口，以ServiceConfig和ReferenceConfig为中心。
* **服务代理层（Proxy）**：服务接口透明代理，生成服务的客户端Stub和服务器端Skeleton。
* **服务注册层（Registry）**：封装服务地址的注册与发现，以服务URL为中心。
* **集群层（Cluster）**：封装多个提供者的路由及负载均衡，并桥接注册中心，以Invoker为中心。
* **监控层（Monitor）**：RPC调用次数和调用时间监控。
* **远程调用层（Protocol）**：封将RPC调用，以Invocation和Result为中心，扩展接口为Protocol、Invoker和Exporter。
* **信息交换层（Exchange）**：封装请求响应模式，同步转异步，以Request和Response为中心。
* **网络传输层（Transport）**：抽象mina和netty为统一接口，以Message为中心。

**Dubbo的服务调用流程**


### 1.5.6. Dubbo 面试
<a href="#menu" style="float:right">目录</a>



-------------------------

## 1.6. 架构演进
<a href="#menu" style="float:right">目录</a>
![](https://youzhixueyuan.com/blog/wp-content/uploads/2019/07/20190731230122_69758.jpg)



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
## 1.7. Java 中间件
* **定义**
    * 中间件不是上层的业务，也不是底层的支撑系统，而是处于中间位置的作用，是应用和应用之间的桥梁。
    * 常见的中间件:
        * 数据库中间件,解决应用访问数据库的共性问题，比如分库分表下的数据访问。
        * 消息中间件，解决应用之间消息传递，解耦和异步的问题。

## 1.8. 序列化机制
<a href="#menu" style="float:right">目录</a>
### 1.8.1. 基本概念
**序列化**:将对象序列化为字节数组，用于网络传输或者磁盘存储。
**反序列化**:将从网络或者磁盘获取的字节数组转化为对象。

* 序列化选择关键点
    * 序列化和反序列化过程的性能
    * 序列化之后的字节长度，这将会影响网络传输。
    * 功能丰富度，比如支持List,Map，复杂对象等
    * 跨语言需求，有的系统由几个不同的应用组成，每个应用可能使用不同的语言开发，因此可能存在跨语言需求。
### 1.8.2. 常用序列化方式性能比较

![](https://img2018.cnblogs.com/blog/1404294/201904/1404294-20190418171605508-1194073956.jpg)
从图上可以看出，protostuff的性能最好，而JDK序列化方式相对来说性能是比较差的。

### 1.8.3. 常用序列化方式实现
#### 1.8.3.1. JDK方式
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
#### 1.8.3.2. FastJSON
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
#### 1.8.3.3. Hessian
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
#### 1.8.3.4. Protostuff
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

## 1.9. 定时任务
<a href="#menu" style="float:right">目录</a>
在项目开发过程中，我们经常需要执行具有周期性的任务。通过定时任务可以很好的帮助我们实现。
当出现应用进行集群部署，此时单体的定时任务管理就会出问题：两个集群中的应用会执行相同的任务。又衍生出处理分布式定时任务，它利用数据库等方式共享定时任务的信息，当集群中有一个应用运行了定时任务。其他应用便不会再次重复执行任务。

单体应用中常使用的定时任务方式是Spring Scheduler,分布式定时任务框架有Quartz.

## 1.10. Cron表达式
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

### 1.10.1. Spring Scheduler
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
### 1.10.2. Quartz
<a href="#menu" style="float:right">目录</a>
#### 1.10.2.1. Quartz 核心概念
* Job 表示一个工作，要执行的具体内容。此接口中只有一个方法，如下：
* JobDetail 表示一个具体的可执行的调度程序，Job 是这个可执行程调度程序所要执行的内容，另外 JobDetail 还包含了这个任务调度的方案和策略。 
* Trigger 代表一个调度参数的配置，什么时候去调。 
* Scheduler 代表一个调度容器，一个调度容器中可以注册多个 JobDetail 和 Trigger。当 Trigger 与 JobDetail 组合，就可以被 Scheduler 容器调度了。 
[更多使用方式参考](https://www.w3cschool.cn/quartz_doc/)

## 1.11. 分布式ID
<a href="#menu" style="float:right">目录</a>

### 1.11.1. 应用场景
分布式ID的应用场景：
* 数据库主键，在进行分库分表时，如果数据库仍然使用自增，可能会出现主键重复的问题，因此需要应用生成主键。
* 在一些消息中间件的使用场景，在处理消息幂等性时，会为每个消息添加一个唯一ID，消费者通过该ID校验消息是否已经被消费。

### 1.11.2. 分布式ID生成方案

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

## 1.12. 分布式锁
[How to do distributed locking](https://martin.kleppmann.com/2016/02/08/how-to-do-distributed-locking.html)
<a href="#menu" style="float:right">目录</a>
不管使用什么中间件，有几点是实现分布式锁必须要考虑到的。
* 互斥：互斥好像是必须的，否则怎么叫锁。
* 死锁: 如果一个线程获得锁，然后挂了，并没有释放锁，致使其他节点(线程)永远无法获取锁，这就是死锁。分布式锁必须做到避免死锁。
* 性能: 高并发分布式系统中，线程互斥等待会成为性能瓶颈，需要好的中间件和实现来保证性能。
* 锁特性：考虑到复杂的场景，分布式锁不能只是加锁，然后一直等待。最好实现如Java Lock的一些功能如：锁判断，超时设置，可重入性等。

### 1.12.1. 使用数据库实现

### 1.12.2. Redis实现分布式锁
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



### 1.12.3. Zookeeper实现分布式锁

## 1.13. 微服务化
<a href="#menu" style="float:right">目录</a>

### 1.13.1. 微服务和SOA

|微服务|SOA|
|---|---|
|能拆分的就拆分|是整体的，服务能放在一起就放在一起|
|纵向业务划分|是水平分多层|
|由单一组织负责|按层级划分不同的组织负责|
|细粒度|粗粒度|
|组件小|存在复杂的组件|
|业务逻辑存在于每一个服务中|业务逻辑横跨多个业务领域|
|使用轻量级的通信方式如HTTP|企业服务总线ESB充当了服务之间通信的角色|

### 1.13.2. 拆分原则
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
    



## 1.14. 流量限流
<a href="#menu" style="float:right">目录</a>

## 1.15. 幂等设计
<a href="#menu" style="float:right">目录</a>



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
