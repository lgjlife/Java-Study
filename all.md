
<span id="menu"></span>
<!-- TOC -->

- [27. RocketMQ消息中间件](#27-rocketmq消息中间件)
    - [27.1. 基本介绍](#271-基本介绍)
        - [27.1.1. 模块说明](#2711-模块说明)
        - [27.1.2. 配置参数](#2712-配置参数)
        - [27.1.3. 底层通信实现](#2713-底层通信实现)
        - [27.1.4. RocketMQ源代码的目录结构](#2714-rocketmq源代码的目录结构)
        - [27.1.5. 设计理念](#2715-设计理念)
        - [27.1.6. 设计目标](#2716-设计目标)
        - [27.1.7. 常用面试题](#2717-常用面试题)
    - [27.2. 安装配置](#272-安装配置)
    - [27.3. 基本使用](#273-基本使用)
        - [27.3.1. **基本的例子**](#2731-基本的例子)
        - [27.3.2. **顺序发送**](#2732-顺序发送)
        - [27.3.3. **广播发送**](#2733-广播发送)
        - [27.3.4. **定时发送**](#2734-定时发送)
        - [27.3.5. **批量发送**](#2735-批量发送)
        - [27.3.6. **过滤**](#2736-过滤)
        - [27.3.7. **日志appender**](#2737-日志appender)
        - [27.3.8. **事务消息**](#2738-事务消息)
    - [27.4. 协调者NameServer](#274-协调者nameserver)
        - [27.4.1. 路由元信息](#2741-路由元信息)
    - [27.5. 生产者](#275-生产者)
        - [27.5.1. 消息发送方式](#2751-消息发送方式)
        - [27.5.2. 生产者API](#2752-生产者api)
        - [27.5.3. 队列选择器](#2753-队列选择器)
        - [27.5.4. 发送流程分析](#2754-发送流程分析)
        - [27.5.5. 默认的队列选择](#2755-默认的队列选择)
    - [27.6. 消费者](#276-消费者)
        - [27.6.1. 消息消费概述](#2761-消息消费概述)
        - [27.6.2. 消息消费推/拉方式](#2762-消息消费推拉方式)
        - [27.6.3. 提高 Consumer 处理能力](#2763-提高-consumer-处理能力)
        - [27.6.4. Consumer 的负载均衡](#2764-consumer-的负载均衡)
        - [27.6.5. 定时消息](#2765-定时消息)
    - [27.7. 消息存储](#277-消息存储)
        - [27.7.1. 消息存储结构](#2771-消息存储结构)
        - [27.7.2. 消息队列与索引文件恢复](#2772-消息队列与索引文件恢复)
            - [27.7.2.1. Broker 正常停止文件恢复](#27721-broker-正常停止文件恢复)
            - [27.7.2.2. Broker 异常停止文件恢复](#27722-broker-异常停止文件恢复)
        - [27.7.3. 文件刷盘机制](#2773-文件刷盘机制)
        - [27.7.4. 过期文件删除机制](#2774-过期文件删除机制)
    - [27.8. 高可用机制](#278-高可用机制)
        - [27.8.1. 动态增减broker](#2781-动态增减broker)
        - [27.8.2. 各种故障对消息的影响](#2782-各种故障对消息的影响)
    - [27.9. 顺序消息](#279-顺序消息)
    - [27.10. 消息饥饿问题](#2710-消息饥饿问题)
    - [27.11. 消息过滤](#2711-消息过滤)
    - [27.12. 事务消息](#2712-事务消息)
        - [27.12.1. 事务实现思想](#27121-事务实现思想)
        - [27.12.2. 事务消息发送流程](#27122-事务消息发送流程)
        - [27.12.3. 提交或者回滚事务](#27123-提交或者回滚事务)
        - [27.12.4. 事务消息回查事务状态](#27124-事务消息回查事务状态)
    - [27.13. 基于Netty的通信实现](#2713-基于netty的通信实现)
- [28. Zookeeper](#28-zookeeper)
    - [28.1. 基本概念](#281-基本概念)
        - [28.1.1. zk架构](#2811-zk架构)
        - [28.1.2. 提供的功能](#2812-提供的功能)
        - [28.1.3. 节点类型](#2813-节点类型)
- [29. 性能调优](#29-性能调优)
    - [29.1. 性能调优概述](#291-性能调优概述)
    - [29.2. 操作系统性能监控](#292-操作系统性能监控)
    - [29.3. JVM](#293-jvm)
        - [29.3.1. JIT编译器](#2931-jit编译器)
            - [29.3.1.1. 概述](#29311-概述)
        - [29.3.2. JVM内存模型](#2932-jvm内存模型)
        - [29.3.3. JVM的内存空间](#2933-jvm的内存空间)
            - [29.3.3.1. 对象内存布局](#29331-对象内存布局)
            - [29.3.3.2. 对象访问定位](#29332-对象访问定位)
        - [29.3.4. 垃圾回收算法](#2934-垃圾回收算法)
            - [29.3.4.1. 对象回收判定](#29341-对象回收判定)
            - [29.3.4.2. 对象引用分类](#29342-对象引用分类)
            - [29.3.4.3. 标记清除算法](#29343-标记清除算法)
            - [29.3.4.4. 复制算法](#29344-复制算法)
            - [29.3.4.5. 标记整理算法](#29345-标记整理算法)
            - [29.3.4.6. 分代收集算法](#29346-分代收集算法)
        - [29.3.5. 垃圾收集器](#2935-垃圾收集器)
            - [29.3.5.1. Serial收集器](#29351-serial收集器)
            - [29.3.5.2. ParNew收集器](#29352-parnew收集器)
            - [29.3.5.3. Parallel Scavenge收集器](#29353-parallel-scavenge收集器)
            - [29.3.5.4. Serial Old收集器](#29354-serial-old收集器)
            - [29.3.5.5. Parallel Old收集器](#29355-parallel-old收集器)
            - [29.3.5.6. CMS收集器](#29356-cms收集器)
            - [29.3.5.7. G1收集器](#29357-g1收集器)
        - [29.3.6. 内存分配和回收策略](#2936-内存分配和回收策略)
        - [29.3.7. JVM相关参数介绍](#2937-jvm相关参数介绍)
        - [29.3.8. 性能监控与故障处理工具](#2938-性能监控与故障处理工具)
            - [29.3.8.1. JDK命令行工具](#29381-jdk命令行工具)
            - [29.3.8.2. Jdk可视化工具](#29382-jdk可视化工具)
        - [29.3.9. JVM性能调优](#2939-jvm性能调优)
        - [29.3.10. 类文件结构](#29310-类文件结构)
        - [29.3.11. 类加载器](#29311-类加载器)
- [30. 概述](#30-概述)
    - [30.1. 高并发原则](#301-高并发原则)
    - [30.2. 高可用原则](#302-高可用原则)
- [31. 负载均衡](#31-负载均衡)
    - [31.1. 什么是负载均衡](#311-什么是负载均衡)
    - [31.2. 硬件负载均衡](#312-硬件负载均衡)
    - [31.3. 四层和七层负载均衡的区别？](#313-四层和七层负载均衡的区别)
        - [31.3.1. 技术原理上的区别。](#3131-技术原理上的区别)
        - [31.3.2. 应用场景的需求。](#3132-应用场景的需求)
        - [31.3.3. 七层应用需要考虑的问题。](#3133-七层应用需要考虑的问题)
    - [31.4. 负载均衡的算法](#314-负载均衡的算法)
        - [31.4.1. 随机算法](#3141-随机算法)
        - [31.4.2. 轮询及加权轮询](#3142-轮询及加权轮询)
        - [31.4.3. 最小连接及加权最小连接](#3143-最小连接及加权最小连接)
        - [31.4.4. 哈希算法](#3144-哈希算法)
        - [31.4.5. IP地址散列](#3145-ip地址散列)
        - [31.4.6. URL散列](#3146-url散列)
        - [31.4.7. 一致性哈希算法](#3147-一致性哈希算法)
    - [31.5. 负载均衡的实现（DNS > 数据链路层 > IP层 > Http层）](#315-负载均衡的实现dns--数据链路层--ip层--http层)
        - [31.5.1. DNS域名解析负载均衡（延迟）](#3151-dns域名解析负载均衡延迟)
        - [31.5.2. 数据链路层负载均衡(LVS)](#3152-数据链路层负载均衡lvs)
        - [31.5.3. IP负载均衡(SNAT)](#3153-ip负载均衡snat)
        - [31.5.4. HTTP重定向负载均衡(少见)](#3154-http重定向负载均衡少见)
        - [31.5.5. 反向代理负载均衡(nginx)](#3155-反向代理负载均衡nginx)
- [32. 隔离](#32-隔离)
    - [32.1. 概述](#321-概述)
- [33. 限流](#33-限流)
    - [33.1. 概述](#331-概述)
    - [33.2. 限流算法](#332-限流算法)
        - [33.2.1. 计数器法](#3321-计数器法)
        - [33.2.2. 滑动窗口](#3322-滑动窗口)
        - [33.2.3. 漏桶算法](#3323-漏桶算法)
        - [33.2.4. 令牌桶算法](#3324-令牌桶算法)
    - [33.3. 分布式限流](#333-分布式限流)
- [34. 降级](#34-降级)
- [35. 超时与重试](#35-超时与重试)
- [36. 回滚机制](#36-回滚机制)
    - [36.1. 事务回滚](#361-事务回滚)
    - [36.2. 代码库回滚](#362-代码库回滚)
    - [36.3. 部署版本回滚](#363-部署版本回滚)
    - [36.4. 静态资源回滚](#364-静态资源回滚)
- [37. 压测与预案](#37-压测与预案)
    - [37.1. 系统压测](#371-系统压测)
        - [37.1.1. 线下压测](#3711-线下压测)
        - [37.1.2. 线上压测](#3712-线上压测)
    - [37.2. 系统优化和容灾](#372-系统优化和容灾)
- [38. 缓存](#38-缓存)
    - [38.1. 应用级缓存](#381-应用级缓存)
        - [38.1.1. 缓存回收策略](#3811-缓存回收策略)
        - [38.1.2. 回收算法](#3812-回收算法)
            - [38.1.2.1. FIFO](#38121-fifo)
            - [38.1.2.2. LRU](#38122-lru)
            - [38.1.2.3. LFU](#38123-lfu)
            - [38.1.2.4. LRFU](#38124-lrfu)
        - [38.1.3. Java 缓存类型](#3813-java-缓存类型)
            - [38.1.3.1. 堆缓存](#38131-堆缓存)
            - [38.1.3.2. 对外缓存](#38132-对外缓存)
            - [38.1.3.3. 磁盘缓存](#38133-磁盘缓存)
            - [38.1.3.4. 分布式缓存](#38134-分布式缓存)
            - [38.1.3.5. 多级缓存](#38135-多级缓存)
        - [38.1.4. 应用级缓存示例](#3814-应用级缓存示例)
        - [38.1.5. 缓存使用模式实践](#3815-缓存使用模式实践)
            - [38.1.5.1. Cache-Aside](#38151-cache-aside)
            - [38.1.5.2. Cache-As-SOR](#38152-cache-as-sor)
            - [38.1.5.3. Read-Through](#38153-read-through)
            - [38.1.5.4. Write-Through](#38154-write-through)
            - [38.1.5.5. Write-Behind](#38155-write-behind)
            - [38.1.5.6. Copy-Pattern](#38156-copy-pattern)
        - [38.1.6. 缓存一致性处理](#3816-缓存一致性处理)
        - [38.1.7. 缓存异常处理](#3817-缓存异常处理)
            - [38.1.7.1. 缓存穿透](#38171-缓存穿透)
            - [38.1.7.2. 缓存击穿](#38172-缓存击穿)
            - [38.1.7.3. 缓存雪崩](#38173-缓存雪崩)
            - [38.1.7.4. 解决方案](#38174-解决方案)
            - [38.1.7.5. 缓存并发问题](#38175-缓存并发问题)
    - [38.2. HTTP缓存](#382-http缓存)
        - [38.2.1. 浏览器缓存](#3821-浏览器缓存)
        - [38.2.2. CDN缓存](#3822-cdn缓存)
        - [38.2.3. NGINX缓存](#3823-nginx缓存)
- [39. 分布式系统](#39-分布式系统)
    - [39.1. 基本概念](#391-基本概念)
    - [39.2. 大型网站的特点](#392-大型网站的特点)
        - [39.2.1. 特点](#3921-特点)
        - [39.2.2. 模式](#3922-模式)
    - [39.3. 常用的RPC框架](#393-常用的rpc框架)
        - [39.3.1. Thrift](#3931-thrift)
        - [39.3.2. gRPC](#3932-grpc)
    - [39.4. Dubbo](#394-dubbo)
        - [39.4.1. 架构](#3941-架构)
        - [39.4.2. 功能](#3942-功能)
        - [39.4.3. 连接协议](#3943-连接协议)
            - [39.4.3.1. dubbo](#39431-dubbo)
            - [39.4.3.2. rmi](#39432-rmi)
            - [39.4.3.3. hessian](#39433-hessian)
            - [39.4.3.4. http](#39434-http)
            - [39.4.3.5. webservice](#39435-webservice)
            - [39.4.3.6. thrift](#39436-thrift)
            - [39.4.3.7. memcached](#39437-memcached)
            - [39.4.3.8. redis](#39438-redis)
            - [39.4.3.9. rest](#39439-rest)
    - [39.5. 架构演进](#395-架构演进)
    - [39.6. Java 中间件](#396-java-中间件)
    - [39.7. 序列化机制](#397-序列化机制)
        - [39.7.1. 基本概念](#3971-基本概念)
        - [39.7.2. 常用序列化方式性能比较](#3972-常用序列化方式性能比较)
        - [39.7.3. 常用序列化方式实现](#3973-常用序列化方式实现)
            - [39.7.3.1. JDK方式](#39731-jdk方式)
            - [39.7.3.2. FastJSON](#39732-fastjson)
            - [39.7.3.3. Hessian](#39733-hessian)
            - [39.7.3.4. Protostuff](#39734-protostuff)
    - [39.8. 定时任务](#398-定时任务)
    - [39.9. Cron表达式](#399-cron表达式)
        - [39.9.1. Spring Scheduler](#3991-spring-scheduler)
        - [39.9.2. Quartz](#3992-quartz)
            - [39.9.2.1. Quartz 核心概念](#39921-quartz-核心概念)
    - [39.10. 分布式ID](#3910-分布式id)
        - [39.10.1. 应用场景](#39101-应用场景)
        - [39.10.2. 分布式ID生成方案](#39102-分布式id生成方案)
    - [39.11. 分布式锁](#3911-分布式锁)
        - [39.11.1. 使用数据库实现](#39111-使用数据库实现)
        - [39.11.2. Redis实现分布式锁](#39112-redis实现分布式锁)
        - [39.11.3. Zookeeper实现分布式锁](#39113-zookeeper实现分布式锁)
    - [39.12. 微服务化](#3912-微服务化)
        - [39.12.1. 微服务和SOA](#39121-微服务和soa)
        - [39.12.2. 拆分原则](#39122-拆分原则)
    - [39.13. 消息机制](#3913-消息机制)
    - [39.14. 服务降级](#3914-服务降级)
    - [39.15. 流量限流](#3915-流量限流)
    - [39.16. 幂等设计](#3916-幂等设计)
    - [39.17. 数据一致性](#3917-数据一致性)
        - [39.17.1. CAP理论](#39171-cap理论)
        - [39.17.2. Base理论](#39172-base理论)
    - [39.18. 分布式事务实现](#3918-分布式事务实现)
    - [39.19. 负载均衡算法](#3919-负载均衡算法)
    - [39.20. 服务容错设计](#3920-服务容错设计)
    - [39.21. 集群](#3921-集群)
    - [39.22. 分库分表](#3922-分库分表)
    - [39.23. 反向代理&正向代理](#3923-反向代理正向代理)
    - [39.24. 客户端优化](#3924-客户端优化)
- [40. 浏览器安全](#40-浏览器安全)
    - [40.1. 同源策略](#401-同源策略)
- [41. 跨站脚本攻击XSS](#41-跨站脚本攻击xss)
    - [41.1. 简介](#411-简介)
    - [41.2. XSS攻击](#412-xss攻击)
    - [41.3. XSS防御](#413-xss防御)
- [42. 跨站点请求伪造CSRF](#42-跨站点请求伪造csrf)
    - [42.1. 基本概念](#421-基本概念)
- [43. 点击劫持](#43-点击劫持)
- [44. HTML5安全](#44-html5安全)
- [45. 注入攻击](#45-注入攻击)
- [46. 文件上传漏洞](#46-文件上传漏洞)
- [47. 认证和会话管理](#47-认证和会话管理)
- [48. 访问控制](#48-访问控制)
- [49. 加密算法和随机数](#49-加密算法和随机数)
- [50. WEB框架安全](#50-web框架安全)
- [51. 应用拒绝服务攻击](#51-应用拒绝服务攻击)
- [52. WEB SERVER配置安全](#52-web-server配置安全)

<!-- /TOC -->


# 27. RocketMQ消息中间件
<a href="#menu" style="float:right">目录</a>


## 27.1. 基本介绍
<a href="#menu" style="float:right">目录</a>

### 27.1.1. 模块说明
<a href="#menu" style="float:right">目录</a>

![](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/rocketmq.png?raw=true)

**NameServer**
**Broker**
**生产者**
**消费者**

### 27.1.2. 配置参数
<a href="#menu" style="float:right">目录</a>

**broker配置参数**
* namesrvAddr=127.2.2.1;157.2.2.2
    * namesrvAddr地址
    * 可以配置多个，中间使用分号连接
* brokerClusterName=xxxx
    * 集群的名称，集群内的所有节点集群名称必须一样
* brokerName=xxx
    * broker的名称
* brokerId=0
    * 一个master broker可以有多个slaver broker
    * 0标识Master,大于0标识Slaver
* fileReservedTime=41
    * 磁盘上保存消息的时长，超过则消息被删除
    * 单位为小时

* deleteWhen=04
    * 表明几点做失效消息删除，上面为凌晨4点
* brokerRole=SYNC_MASTER
    * brokerRole 有3种
        * SYNC_MASTER
        * ASYNC_MASTER 
        * SLAVE 
    * SYNC 和 ASYNC 表示Master和Slave之间同步消息的机制，SYNC的意思是当 Slave 和 Master 消息同步完成后，再返回发送成功的状态
* flushDiskType=ASYNC_FLUSH
    * flushDiskType 表示刷盘策略，分为 SYNC_FLUSH 和 ASYNC_FLUSH 两种，分别代表同步刷盘和异步刷盘 。 同步刷盘情况下，消息真正写人磁盘后再返回成功状态；异步刷盘情况下，消息写人 page_cache 后就返回成功状态 。
* listenPort=8911
    * Broker 监听的端口号，如果一台机器上启动了多个Broker，则要设置不同的端口号，避免冲突 。
* storePathRootDir=/home/rocketmq/store-a
    * 存储消息以及一些配置信息的根目录 。
* storePathCommitLog=/xx/xx
    * CommitLog存储路径
* storePathConsumerQueue=/xx/xx
    * 消费队列存储路径
* storePathIndex
    * 消息索引存储路径
* storeCheckpoint=/xx/xx
    * checkPoint文件存储路径
* abortFile=/xx/xx
    * abort文件存储路径
    

### 27.1.3. 底层通信实现
<a href="#menu" style="float:right">目录</a>

* rocketMQ底层基于Netty实现

消息协议

||长度（字节）|说明|
|---|---|---|
|length|4|后面部分的总长度|
|header length|4|头部信息的长度|
|header data |不定长度|头部信息|
|body data|不定长度|消息体|

### 27.1.4. RocketMQ源代码的目录结构
<a href="#menu" style="float:right">目录</a>


* broker: broker 模块（broker 启动进程） 。
* client ：消息客户端，包含消息生产者、消息消费者相关类 。
* common ：公共包 。
* dev ：开发者信息（非源代码） 。
* distribution ：部署实例文件夹（非源代码） 。
* example: RocketMQ 示例代码 。
* filter ：消息过滤相关基础类 。
* filtersrv ： 消息过滤服务器实现相关类（Filter 启动进程） 。
* logappender ：日志实现相关类 。
* namesrv : NameServer 实现相关类（Names巳rver 启动进程） 。
* openmessaging ： 消息开放标准，正在制定中 。
* remoting ： 远程通信模块，基于 Netty 。
* srvutil ：服务器工具类 。
* store ：消息存储实现相关类 。
* style: checkstyle 相关实现 。
* test ： 测试相关类 。
* tools ： 工具类 ，监控命令相关实现类 。

### 27.1.5. 设计理念
<a href="#menu" style="float:right">目录</a>

* RocketMQ 设计基于主题的发布与订阅模式 ， 其核心功能包括消息 发送消息存储(Broker）、消息消费，整体设计追求简单与性能第一，主要体现在如下三个方面 。首先， NameServer 设计极其简单，摒弃了业界常用的使用 Zookeeper 充当信息管理的 “注册中心”，而是自研 NameServer 来实现元数据 的管理（ Topic 路由信息等 ） 。 从实际需求出发，因为 Topic 路由信息无须在集群之间保持强一致，追求最终一致性，并且能容忍分钟级的不一致。 正是基于此种情况 ， RocketMQ 的 NameServer 集群之间互不通信，极
大地降低了 NameServer 实现的 复杂程度， 对网络的要求也降低了不少 ， 但是性能相比较Zookeeper 有了极大的提升 。
* 其次是高效的 IO 存储机制 。 RocketMQ 追求消息发送的高吞吐量， RocketMQ 的消息存储文件设计成文件组的概念，组内单个文件大小固定，方便引人内存 l映射机制，所有主题的消息存储基于顺序写 ， 极大地提供了消息写性能， 同时为了兼顾消息消费与消息查找，引入了消息消费队列文件与索引文件 。
* 最后是容忍存在设计缺陷 ，适当将某些工作下放给 RocketMQ 使用者 。 消息中间件的实现者经常会遇到一个难题：如何保证消息一定能被消息消费者消费，并且保证只消费一次。
RocketMQ 的设计者给出的解决办法是不解决这个难题，而是退而求其次 ，只保证消息被消
费者消费，但设计上允许消息被重复消费，这样极大地简化了消息中间件的内核，使得实现
消息发送高可用变得非常简单与高效 消息重复问题由消费者在消息消费时实现幕等 。


### 27.1.6. 设计目标
<a href="#menu" style="float:right">目录</a>

* 架构模式
    * RocketMQ 与大部分消息中间件一样，采用发布订阅模式，基本的参与组件主要包括 ：消息发送者、消息服务器（消息存储）、消息消费、路由发现 。
* 顺序消患
    * 所谓顺序消息，就是消息消费者按照消息达到消息存储服务器的顺序消费 。 RocketMQ可以严格保证消息有序 。
* 消息过滤
    * 消息过滤是指在消息消费时，消息消费者可以对同一主题下的消息按照规则 只消费自己感兴趣的消息 。 RocketMQ 消息过滤支持在服务端与消费端的消息过滤机制 。
        * 消息在 Broker 端过滤 。 Broker 只将消息消费者感兴趣的消息发送给消息消费者 。
        * 消息在消息消费端过滤，消息过滤方式完全 由消息消费者自定义，但缺点是有很多元用的消息会从 Broker 传输到消费端。
* 消息存储
    * 消息中间件的一个核心实现是消息的存储 对消息存储一般有如下两个维度的考量 ：消息堆积能力和消息存储性能 。 RocketMQ 追求消息存储的高性能，引人内存映射机制，所有主题的消息顺序存储在同一个文件中 。 同时为了避免消息无限在消息存储服务器中累积，引入了消息文件过期机制与文件存储空间报警机制 。
* 消息高可用性
    * 通常影响消息可靠性的有以下几种情况 。
        * Broker 正常关机。
        * Broker 异常 Crash 。
        * OS Crash 。
        * 机器断电，但是能立即恢复供电情况 。
        * 机器无法开机（可能是 CPU 、主板、 内存等关键设备损 坏） 。
        * 磁盘设备损坏 。
    * 针对上述情况，情况 1~4 的 RocketMQ 在同步刷盘机制下可以确保不丢失消息，在异步刷盘模式下，会丢失少量消息 。 情况 5-6 属于单点故障，一旦发生，该节点上的消息全部丢失，如果开启了异步复制机制， RoketMQ 能保证只丢失少量消息， RocketMQ 在后续版本中将引人双写机制，以满足消息可靠性要求极高的场合 。
* 消息到达 （ 消费 ）低延迟
    * RocketMQ 在消息不发生消息堆积时，以长轮询模式实现准实时的消息推送模式 。
* 确保消息必须被消费一次
    * RocketMQ 通过消息消费确认机制（ACK）来确保消息至少被消费一次 ，但由于 ACK 消息有可能丢失等其他原因， RocketMQ 无法做到消息只被消费一次，有重复消费的可能 。
* 回溯消息
    * 回溯消息是指消息消费端已经消费成功的消息，由于业务要求需要重新消费消息 。RocketMQ 支持按时间回溯消息，时间维度可精确到毫秒，可以向前或向后回溯 。
* 消息堆积
    * 消息中间件的主要功能是异步解锢，必须具备应对前端的数据洪峰，提高后端系统的可用性，必然要求消息中间件具备一定的消息堆积能力 。 RocketMQ 消息存储使用磁盘文件（内存映射机制），并且在物理布局上为多个大小相等的文件组成逻辑文件组，可以无限循环使用 。 RocketMQ 消息存储文件并不是永久存储在消息服务器端，而是提供了过期机制，默认保留 3 天 。
* 定时消息
    * 定时消息是指消息发送到 Broker 后， 不能被消息消费端立即消费，要到特定的时间点或者等待特定的时间后才能被消费 。 如果要支持任意精度的定时消息消费，必须在消息服务端对消息进行排序，势必带来很大的性能损耗，故 RocketMQ 不支持任意进度的定时消息，而只支持特定延迟级别 。
* 消息重试机制
    * 消息重试是指消息在消费时，如果发送异常，消息中间件需要支持消息重新投递，RocketMQ 支持消息重试机制 。

### 27.1.7. 常用面试题


## 27.2. 安装配置
<a href="#menu" style="float:right">目录</a>

**Start Name Server**
```
  > nohup sh bin/mqnamesrv &
  > tail -f ~/logs/rocketmqlogs/namesrv.log
  The Name Server boot success...
```

**Start Broker**
```
  > nohup sh bin/mqbroker -n localhost:9876 &
  > tail -f ~/logs/rocketmqlogs/broker.log 
  The broker[%s, 172.30.30.233:10911] boot success...
```

## 27.3. 基本使用
<a href="#menu" style="float:right">目录</a>

**依赖引入**
```xml
<dependency>
    <groupId>org.apache.rocketmq</groupId>
    <artifactId>rocketmq-client</artifactId>
    <version>4.3.0</version>
</dependency>
    
```
### 27.3.1. **基本的例子**
<a href="#menu" style="float:right">目录</a>


```java
public class SyncProducer {
    public static void main(String[] args) throws Exception {
        //Instantiate with a producer group name.
        DefaultMQProducer producer = new
            DefaultMQProducer("please_rename_unique_group_name");
        // Specify name server addresses.
        producer.setNamesrvAddr("localhost:9876");
        //Launch the instance.
        producer.start();
        for (int i = 0; i < 100; i++) {
            //Create a message instance, specifying topic, tag and message body.
            Message msg = new Message("TopicTest" /* Topic */,
                "TagA" /* Tag */,
                ("Hello RocketMQ " +
                    i).getBytes(RemotingHelper.DEFAULT_CHARSET) /* Message body */
            );
            //Call send message to deliver message to one of brokers.
            SendResult sendResult = producer.send(msg);
            System.out.printf("%s%n", sendResult);
        }
        //Shut down once the producer instance is not longer in use.
        producer.shutdown();
    }
}
public class AsyncProducer {
    public static void main(String[] args) throws Exception {
        //Instantiate with a producer group name.
        DefaultMQProducer producer = new DefaultMQProducer("please_rename_unique_group_name");
        // Specify name server addresses.
        producer.setNamesrvAddr("localhost:9876");
        //Launch the instance.
        producer.start();
        producer.setRetryTimesWhenSendAsyncFailed(0);
        for (int i = 0; i < 100; i++) {
                final int index = i;
                //Create a message instance, specifying topic, tag and message body.
                Message msg = new Message("TopicTest",
                    "TagA",
                    "OrderID188",
                    "Hello world".getBytes(RemotingHelper.DEFAULT_CHARSET));
                producer.send(msg, new SendCallback() {
                    @Override
                    public void onSuccess(SendResult sendResult) {
                        System.out.printf("%-10d OK %s %n", index,
                            sendResult.getMsgId());
                    }
                    @Override
                    public void onException(Throwable e) {
                        System.out.printf("%-10d Exception %s %n", index, e);
                        e.printStackTrace();
                    }
                });
        }
        //Shut down once the producer instance is not longer in use.
        producer.shutdown();
    }
}

public class OnewayProducer {
    public static void main(String[] args) throws Exception{
        //Instantiate with a producer group name.
        DefaultMQProducer producer = new DefaultMQProducer("please_rename_unique_group_name");
        // Specify name server addresses.
        producer.setNamesrvAddr("localhost:9876");
        //Launch the instance.
        producer.start();
        for (int i = 0; i < 100; i++) {
            //Create a message instance, specifying topic, tag and message body.
            Message msg = new Message("TopicTest" /* Topic */,
                "TagA" /* Tag */,
                ("Hello RocketMQ " +
                    i).getBytes(RemotingHelper.DEFAULT_CHARSET) /* Message body */
            );
            //Call send message to deliver message to one of brokers.
            producer.sendOneway(msg);

        }
        //Shut down once the producer instance is not longer in use.
        producer.shutdown();
    }
}

public class Consumer {

    public static void main(String[] args) throws InterruptedException, MQClientException {

        // Instantiate with specified consumer group name.
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("please_rename_unique_group_name");
         
        // Specify name server addresses.
        consumer.setNamesrvAddr("localhost:9876");
        
        // Subscribe one more more topics to consume.
        consumer.subscribe("TopicTest", "*");
        // Register callback to execute on arrival of messages fetched from brokers.
        consumer.registerMessageListener(new MessageListenerConcurrently() {

            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs,
                ConsumeConcurrentlyContext context) {
                System.out.printf("%s Receive New Messages: %s %n", Thread.currentThread().getName(), msgs);
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        //Launch the consumer instance.
        consumer.start();

        System.out.printf("Consumer Started.%n");
    }
}

```
### 27.3.2. **顺序发送**
<a href="#menu" style="float:right">目录</a>

```java
public class OrderedProducer {
    public static void main(String[] args) throws Exception {
        //Instantiate with a producer group name.
        MQProducer producer = new DefaultMQProducer("example_group_name");
        //Launch the instance.
        producer.start();
        String[] tags = new String[] {"TagA", "TagB", "TagC", "TagD", "TagE"};
        for (int i = 0; i < 100; i++) {
            int orderId = i % 10;
            //Create a message instance, specifying topic, tag and message body.
            Message msg = new Message("TopicTestjjj", tags[i % tags.length], "KEY" + i,
                    ("Hello RocketMQ " + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
            SendResult sendResult = producer.send(msg, new MessageQueueSelector() {
            @Override
            public MessageQueue select(List<MessageQueue> mqs, Message msg, Object arg) {
                Integer id = (Integer) arg;
                int index = id % mqs.size();
                return mqs.get(index);
            }
            }, orderId);

            System.out.printf("%s%n", sendResult);
        }
        //server shutdown
        producer.shutdown();
    }
}
public class OrderedConsumer {
    public static void main(String[] args) throws Exception {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("example_group_name");

        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);

        consumer.subscribe("TopicTest", "TagA || TagC || TagD");

        consumer.registerMessageListener(new MessageListenerOrderly() {

            AtomicLong consumeTimes = new AtomicLong(0);
            @Override
            public ConsumeOrderlyStatus consumeMessage(List<MessageExt> msgs,
                                                       ConsumeOrderlyContext context) {
                context.setAutoCommit(false);
                System.out.printf(Thread.currentThread().getName() + " Receive New Messages: " + msgs + "%n");
                this.consumeTimes.incrementAndGet();
                if ((this.consumeTimes.get() % 2) == 0) {
                    return ConsumeOrderlyStatus.SUCCESS;
                } else if ((this.consumeTimes.get() % 3) == 0) {
                    return ConsumeOrderlyStatus.ROLLBACK;
                } else if ((this.consumeTimes.get() % 4) == 0) {
                    return ConsumeOrderlyStatus.COMMIT;
                } else if ((this.consumeTimes.get() % 5) == 0) {
                    context.setSuspendCurrentQueueTimeMillis(3000);
                    return ConsumeOrderlyStatus.SUSPEND_CURRENT_QUEUE_A_MOMENT;
                }
                return ConsumeOrderlyStatus.SUCCESS;

            }
        });

        consumer.start();

        System.out.printf("Consumer Started.%n");
    }
}
```
### 27.3.3. **广播发送**
<a href="#menu" style="float:right">目录</a>


```java
public class BroadcastProducer {
    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("ProducerGroupName");
        producer.start();

        for (int i = 0; i < 100; i++){
            Message msg = new Message("TopicTest",
                "TagA",
                "OrderID188",
                "Hello world".getBytes(RemotingHelper.DEFAULT_CHARSET));
            SendResult sendResult = producer.send(msg);
            System.out.printf("%s%n", sendResult);
        }
        producer.shutdown();
    }
}
public class BroadcastConsumer {
    public static void main(String[] args) throws Exception {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("example_group_name");

        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);

        //set to broadcast mode
        consumer.setMessageModel(MessageModel.BROADCASTING);

        consumer.subscribe("TopicTest", "TagA || TagC || TagD");

        consumer.registerMessageListener(new MessageListenerConcurrently() {

            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs,
                ConsumeConcurrentlyContext context) {
                System.out.printf(Thread.currentThread().getName() + " Receive New Messages: " + msgs + "%n");
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        consumer.start();
        System.out.printf("Broadcast Consumer Started.%n");
    }
}

```
### 27.3.4. **定时发送**
<a href="#menu" style="float:right">目录</a>


```java
public class ScheduledMessageConsumer {
    
     public static void main(String[] args) throws Exception {
         // Instantiate message consumer
         DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("ExampleConsumer");
         // Subscribe topics
         consumer.subscribe("TestTopic", "*");
         // Register message listener
         consumer.registerMessageListener(new MessageListenerConcurrently() {
             @Override
             public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> messages, ConsumeConcurrentlyContext context) {
                 for (MessageExt message : messages) {
                     // Print approximate delay time period
                     System.out.println("Receive message[msgId=" + message.getMsgId() + "] "
                             + (System.currentTimeMillis() - message.getStoreTimestamp()) + "ms later");
                 }
                 return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
             }
         });
         // Launch consumer
         consumer.start();
     }
 }
 public class ScheduledMessageProducer {
    
     public static void main(String[] args) throws Exception {
         // Instantiate a producer to send scheduled messages
         DefaultMQProducer producer = new DefaultMQProducer("ExampleProducerGroup");
         // Launch producer
         producer.start();
         int totalMessagesToSend = 100;
         for (int i = 0; i < totalMessagesToSend; i++) {
             Message message = new Message("TestTopic", ("Hello scheduled message " + i).getBytes());
             // This message will be delivered to consumer 10 seconds later.
             message.setDelayTimeLevel(3);
             // Send the message
             producer.send(message);
         }
    
         // Shutdown producer after use.
         producer.shutdown();
     }
        
 }
```
### 27.3.5. **批量发送**
<a href="#menu" style="float:right">目录</a>


```java
String topic = "BatchTest";
List<Message> messages = new ArrayList<>();
messages.add(new Message(topic, "TagA", "OrderID001", "Hello world 0".getBytes()));
messages.add(new Message(topic, "TagA", "OrderID002", "Hello world 1".getBytes()));
messages.add(new Message(topic, "TagA", "OrderID003", "Hello world 2".getBytes()));
try {
    producer.send(messages);
} catch (Exception e) {
    e.printStackTrace();
    //handle the error
}

public class ListSplitter implements Iterator<List<Message>> {
    private final int SIZE_LIMIT = 1000 * 1000;
    private final List<Message> messages;
    private int currIndex;
    public ListSplitter(List<Message> messages) {
            this.messages = messages;
    }
    @Override public boolean hasNext() {
        return currIndex < messages.size();
    }
    @Override public List<Message> next() {
        int nextIndex = currIndex;
        int totalSize = 0;
        for (; nextIndex < messages.size(); nextIndex++) {
            Message message = messages.get(nextIndex);
            int tmpSize = message.getTopic().length() + message.getBody().length;
            Map<String, String> properties = message.getProperties();
            for (Map.Entry<String, String> entry : properties.entrySet()) {
                tmpSize += entry.getKey().length() + entry.getValue().length();
            }
            tmpSize = tmpSize + 20; //for log overhead
            if (tmpSize > SIZE_LIMIT) {
                //it is unexpected that single message exceeds the SIZE_LIMIT
                //here just let it go, otherwise it will block the splitting process
                if (nextIndex - currIndex == 0) {
                   //if the next sublist has no element, add this one and then break, otherwise just break
                   nextIndex++;  
                }
                break;
            }
            if (tmpSize + totalSize > SIZE_LIMIT) {
                break;
            } else {
                totalSize += tmpSize;
            }
    
        }
        List<Message> subList = messages.subList(currIndex, nextIndex);
        currIndex = nextIndex;
        return subList;
    }
}
//then you could split the large list into small ones:
ListSplitter splitter = new ListSplitter(messages);
while (splitter.hasNext()) {
   try {
       List<Message>  listItem = splitter.next();
       producer.send(listItem);
   } catch (Exception e) {
       e.printStackTrace();
       //handle the error
   }
}
```
### 27.3.6. **过滤**
<a href="#menu" style="float:right">目录</a>


```java

DefaultMQProducer producer = new DefaultMQProducer("please_rename_unique_group_name");
producer.start();

Message msg = new Message("TopicTest",
    tag,
    ("Hello RocketMQ " + i).getBytes(RemotingHelper.DEFAULT_CHARSET)
);
// Set some properties.
msg.putUserProperty("a", String.valueOf(i));

SendResult sendResult = producer.send(msg);
   
producer.shutdown();
/////消费者
DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("please_rename_unique_group_name_4");

// only subsribe messages have property a, also a >=0 and a <= 3
consumer.subscribe("TopicTest", MessageSelector.bySql("a between 0 and 3");

consumer.registerMessageListener(new MessageListenerConcurrently() {
    @Override
    public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    }
});
consumer.start();

///
DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("CID_EXAMPLE");
consumer.subscribe("TOPIC", "TAGA || TAGB || TAGC");


```
### 27.3.7. **日志appender**
<a href="#menu" style="float:right">目录</a>


```xml
<!-- log4j -->
log4j.appender.mq=org.apache.rocketmq.logappender.log4j.RocketmqLog4jAppender
log4j.appender.mq.Tag=yourTag
log4j.appender.mq.Topic=yourLogTopic
log4j.appender.mq.ProducerGroup=yourLogGroup
log4j.appender.mq.NameServerAddress=yourRocketmqNameserverAddress
log4j.appender.mq.layout=org.apache.log4j.PatternLayout
log4j.appender.mq.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} %-4r [%t] (%F:%L) %-5p - %m%n

<appender name="mqAppender1" class="org.apache.rocketmq.logappender.log4j.RocketmqLog4jAppender">
    <param name="Tag" value="yourTag" />
    <param name="Topic" value="yourLogTopic" />
    <param name="ProducerGroup" value="yourLogGroup" />
    <param name="NameServerAddress" value="yourRocketmqNameserverAddress"/>
    <layout class="org.apache.log4j.PatternLayout">
        <param name="ConversionPattern" value="%d{yyyy-MM-dd HH:mm:ss}-%p %t %c - %m%n" />
    </layout>
</appender>

<appender name="mqAsyncAppender1" class="org.apache.log4j.AsyncAppender">
    <param name="BufferSize" value="1024" />
    <param name="Blocking" value="false" />
    <appender-ref ref="mqAppender1"/>
</appender>
<!-- log4j2 -->
<RocketMQ name="rocketmqAppender" producerGroup="yourLogGroup" nameServerAddress="yourRocketmqNameserverAddress"
     topic="yourLogTopic" tag="yourTag">
    <PatternLayout pattern="%d [%p] hahahah %c %m%n"/>
</RocketMQ>

<!-- logback -->
<appender name="mqAppender1" class="org.apache.rocketmq.logappender.logback.RocketmqLogbackAppender">
    <tag>yourTag</tag>
    <topic>yourLogTopic</topic>
    <producerGroup>yourLogGroup</producerGroup>
    <nameServerAddress>yourRocketmqNameserverAddress</nameServerAddress>
    <layout>
        <pattern>%date %p %t - %m%n</pattern>
    </layout>
</appender>

<appender name="mqAsyncAppender1" class="ch.qos.logback.classic.AsyncAppender">
    <queueSize>1024</queueSize>
    <discardingThreshold>80</discardingThreshold>
    <maxFlushTime>2000</maxFlushTime>
    <neverBlock>true</neverBlock>
    <appender-ref ref="mqAppender1"/>
</appender>

```
**OpenMessaging**
```java
public class OMSProducer {
    public static void main(String[] args) {
        final MessagingAccessPoint messagingAccessPoint = MessagingAccessPointFactory
            .getMessagingAccessPoint("openmessaging:rocketmq://IP1:9876,IP2:9876/namespace");

        final Producer producer = messagingAccessPoint.createProducer();

        messagingAccessPoint.startup();
        System.out.printf("MessagingAccessPoint startup OK%n");

        producer.startup();
        System.out.printf("Producer startup OK%n");

        {
            Message message = producer.createBytesMessageToTopic("OMS_HELLO_TOPIC", "OMS_HELLO_BODY".getBytes(Charset.forName("UTF-8")));
            SendResult sendResult = producer.send(message);
            System.out.printf("Send sync message OK, msgId: %s%n", sendResult.messageId());
        }

        {
            final Promise<SendResult> result = producer.sendAsync(producer.createBytesMessageToTopic("OMS_HELLO_TOPIC", "OMS_HELLO_BODY".getBytes(Charset.forName("UTF-8"))));
            result.addListener(new PromiseListener<SendResult>() {
                @Override
                public void operationCompleted(Promise<SendResult> promise) {
                    System.out.printf("Send async message OK, msgId: %s%n", promise.get().messageId());
                }

                @Override
                public void operationFailed(Promise<SendResult> promise) {
                    System.out.printf("Send async message Failed, error: %s%n", promise.getThrowable().getMessage());
                }
            });
        }

        {
            producer.sendOneway(producer.createBytesMessageToTopic("OMS_HELLO_TOPIC", "OMS_HELLO_BODY".getBytes(Charset.forName("UTF-8"))));
            System.out.printf("Send oneway message OK%n");
        }

        producer.shutdown();
        messagingAccessPoint.shutdown();
    }
}


public class OMSPullConsumer {
    public static void main(String[] args) {
        final MessagingAccessPoint messagingAccessPoint = MessagingAccessPointFactory
            .getMessagingAccessPoint("openmessaging:rocketmq://IP1:9876,IP2:9876/namespace");

        final PullConsumer consumer = messagingAccessPoint.createPullConsumer("OMS_HELLO_TOPIC",
            OMS.newKeyValue().put(NonStandardKeys.CONSUMER_GROUP, "OMS_CONSUMER"));

        messagingAccessPoint.startup();
        System.out.printf("MessagingAccessPoint startup OK%n");
        
        consumer.startup();
        System.out.printf("Consumer startup OK%n");

        Message message = consumer.poll();
        if (message != null) {
            String msgId = message.headers().getString(MessageHeader.MESSAGE_ID);
            System.out.printf("Received one message: %s%n", msgId);
            consumer.ack(msgId);
        }

        consumer.shutdown();
        messagingAccessPoint.shutdown();
    }
}

public class OMSPushConsumer {
    public static void main(String[] args) {
        final MessagingAccessPoint messagingAccessPoint = MessagingAccessPointFactory
            .getMessagingAccessPoint("openmessaging:rocketmq://IP1:9876,IP2:9876/namespace");

        final PushConsumer consumer = messagingAccessPoint.
            createPushConsumer(OMS.newKeyValue().put(NonStandardKeys.CONSUMER_GROUP, "OMS_CONSUMER"));

        messagingAccessPoint.startup();
        System.out.printf("MessagingAccessPoint startup OK%n");

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                consumer.shutdown();
                messagingAccessPoint.shutdown();
            }
        }));
        
        consumer.attachQueue("OMS_HELLO_TOPIC", new MessageListener() {
            @Override
            public void onMessage(final Message message, final ReceivedMessageContext context) {
                System.out.printf("Received one message: %s%n", message.headers().getString(MessageHeader.MESSAGE_ID));
                context.ack();
            }
        });
        
    }
}
```
### 27.3.8. **事务消息**
<a href="#menu" style="float:right">目录</a>


```java
public class TransactionProducer {
    public static void main(String[] args) throws MQClientException, InterruptedException {
        TransactionListener transactionListener = new TransactionListenerImpl();
        TransactionMQProducer producer = new TransactionMQProducer("please_rename_unique_group_name");
        ExecutorService executorService = new ThreadPoolExecutor(2, 5, 100, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2000), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setName("client-transaction-msg-check-thread");
                return thread;
            }
        });

        producer.setExecutorService(executorService);
        producer.setTransactionListener(transactionListener);
        producer.start();

        String[] tags = new String[] {"TagA", "TagB", "TagC", "TagD", "TagE"};
        for (int i = 0; i < 10; i++) {
            try {
                Message msg =
                    new Message("TopicTest1234", tags[i % tags.length], "KEY" + i,
                        ("Hello RocketMQ " + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
                SendResult sendResult = producer.sendMessageInTransaction(msg, null);
                System.out.printf("%s%n", sendResult);

                Thread.sleep(10);
            } catch (MQClientException | UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 100000; i++) {
            Thread.sleep(1000);
        }
        producer.shutdown();
    }
}
  public class TransactionListenerImpl implements TransactionListener {
       private AtomicInteger transactionIndex = new AtomicInteger(0);
   
       private ConcurrentHashMap<String, Integer> localTrans = new ConcurrentHashMap<>();
   
       @Override
       public LocalTransactionState executeLocalTransaction(Message msg, Object arg) {
           int value = transactionIndex.getAndIncrement();
           int status = value % 3;
           localTrans.put(msg.getTransactionId(), status);
           return LocalTransactionState.UNKNOW;
       }
   
       @Override
       public LocalTransactionState checkLocalTransaction(MessageExt msg) {
           Integer status = localTrans.get(msg.getTransactionId());
           if (null != status) {
               switch (status) {
                   case 0:
                       return LocalTransactionState.UNKNOW;
                   case 1:
                       return LocalTransactionState.COMMIT_MESSAGE;
                   case 2:
                       return LocalTransactionState.ROLLBACK_MESSAGE;
               }
           }
           return LocalTransactionState.COMMIT_MESSAGE;
       }
   }

```

## 27.4. 协调者NameServer
<a href="#menu" style="float:right">目录</a>

![nameserver](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/rocketmq-nameserver.png?raw=true)

* NameServer是整个消息队列中的状态服务器
* broker向其注册broker相关信息，消费者和生产者从NameServer上获取broker信息并缓存在本地
* NameServer之间是相互独立的，broker会向所有的NameServer注册信息，因此会存在短时的数据不一致情况，但是是最终一致。

* 为何不使用zk
    * zk功能强大，不需要那么强的功能
    * nameServer只有很少的代码，容易维护，不需要再依赖另一个中间件，减少维护成本。

* 消息服务器broker在启动时向所有的NameServer注册，并每隔30s发送一次。
* 生产者在发送消息之前先从NameServer获取Broker服务器地址列表，然后根据负载均衡算法从类表中选择一台消息服务器进行消息发送。
* NameServer和Broker之间为长连接，间隔30s检测broker是否存活，如果检测到宕积，则将其从注册表中移除。但不会立即通知生产者，生产者也会定时从NameServer中获取Broker相关信息并 缓存在本地
* Broker 在正常被关闭的情况下，会执行 unregisterBroker 指令。也就是主动通知NameServer删除注册表中的信息。
* RocketMQ路由注册是通过Broker与NameServer的心跳功能实现的 。Broker启动时向集群中所有的 NameServer发送心跳语句，每隔30s向集群中所有NameServer发送心跳包，NameServer收到Broker心跳包时会更新brokerLiveTable缓存中BrokerLivelnfo的lastUpdateTimestamp，然后NameServer 每隔10s扫描brokerLiveTable，如果连续120s 没有收到心跳包，NameServer 将移除该Broker的路由信息同时关闭Socket 连接 。

### 27.4.1. 路由元信息
<a href="#menu" style="float:right">目录</a>

```java
public class RouteInfoManager {
    private static final InternalLogger log = InternalLoggerFactory.getLogger(LoggerName.NAMESRV_LOGGER_NAME);
    private final static long BROKER_CHANNEL_EXPIRED_TIME = 1000 * 60 * 2;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final HashMap<String/* topic */, List<QueueData>> topicQueueTable;
    private final HashMap<String/* brokerName */, BrokerData> brokerAddrTable;
    private final HashMap<String/* clusterName */, Set<String/* brokerName */>> clusterAddrTable;
    private final HashMap<String/* brokerAddr */, BrokerLiveInfo> brokerLiveTable;
    private final HashMap<String/* brokerAddr */, List<String>/* Filter Server */> filterServerTable;

```
* topicQueueTable: Topic 消息队列路由信息，消息发送时根据路由表进行负载均衡 。
* brokerAddrTable : Broker 基础信息， 包含 brokerName 、所属集群名称、主备Broker地址 。
* clusterAddrTable: Broker 集群信息，存储集群中所有 Broker 名称 。
* brokerLiveTable: Broker 状态信息 。 NameServer 每次收到心跳包时会替换该信息 。
* filterServerTable : Broker 上的 FilterServer 列表，用于类模式消息过滤


## 27.5. 生产者
<a href="#menu" style="float:right">目录</a>

### 27.5.1. 消息发送方式
<a href="#menu" style="float:right">目录</a>

* 同步
    * 发送者向 MQ 执行发送消息 API 时，同步等待， 直到消息服务器返回发送结果 .
    * 发送失败时会进行重试
* 异步
    * 发送者向 MQ 执行发送消息 API 时，指定消息发送成功后的回掉函数，然后调用消息发送 API 后，立即返回，消息发送者线程不阻塞 ，直到运行结束，消息发送成功或失败的回调任务在一个新的线程中执行 。
    * 发送失败时会进行重试
* 单向
    * 消息发送者向 MQ 执行发送消息 API 时，直接返回，不等待消息服务器的结果，也不注册回调函数，简单地说，就是只管发，不在乎消息是否成功存储在消息服务器上。并且没有重试发送。

* 批量消息发送
    * 批量消息发送是将 同一主题的多条消息一起打包发送到消息服务端，减少网络调用次数，提高网络传输效率
    * 并不是在同一批次中发送的消息数量越多性能就越好，其判断依据是单条消息的长度，如果单条消息内容比较长， 则打包多条消息发送会影响其他线程发送消息的响应时间 ，并且单批次消息发送总长度不能超过 DefaultMQProducer#maxMessageSize 。 
* 消息队列负载均衡
    * 默认是使用轮询
    * 还可以设置为故障延迟机制，也就是如果该broker发生了故障，下一次发送时就先不尝试这个broker,过一段时间再进行尝试。

* RocketMQ 消息发送需要考虑以下几个问题 。
    * 消息队列如何进行负载 ？
    * 消息发送如何实现高可用 ？
    * 批量消息发送如何实现一致性？

**消息定义**
```java
public Message(String topic, String tags, String keys, int flag, byte[] body, boolean waitStoreMsgOK)
```
* Message 扩展属性主要包含下面几个 。
    * tag ：消息 TAG ，用于消息过滤 。
    * keys: Message 索引键， 多个用空格隔开， RocketMQ 可以根据这些 key 快速检索到消息 。   
    * waitStoreMsgOK ：消息发送时是否等消息存储完成后再返回 。
    * delayTimeLevel ： 消息延迟级别，用于定时消息或消息重试 。

### 27.5.2. 生产者API
<a href="#menu" style="float:right">目录</a>

```java

public class DefaultMQProducer extends ClientConfig implements MQProducer {

    private final InternalLogger log = ClientLogger.getLog();
    protected final transient DefaultMQProducerImpl defaultMQProducerImpl;
    //生产者组别
    private String producerGroup;
    //仅用于测试
    private String createTopicKey = MixAll.AUTO_CREATE_TOPIC_KEY_TOPIC;
    //创建topic时默认的队列数目
    private volatile int defaultTopicQueueNums = 4;
    //发送消息的超时时间
    private int sendMsgTimeout = 3000;
    //压缩消息的body阈值，超过4k将会被压缩
    private int compressMsgBodyOverHowmuch = 1024 * 4;
    //同步模式下，失败重试的次数
    private int retryTimesWhenSendFailed = 2;
    //异步模式下失败重试的次数
    private int retryTimesWhenSendAsyncFailed = 2;
    //当发生发送失败时是否尝试其他broker
    private boolean retryAnotherBrokerWhenNotStoreOK = false;
    //最大的发送消息大小
    private int maxMessageSize = 1024 * 1024 * 4; // 4M
    //Interface of asynchronous transfer data
    private TraceDispatcher traceDispatcher = null;



    /**
     * Constructor specifying namespace, producer group, RPC hook, enabled msgTrace flag and customized trace topic
     * name.
     *
     * @param namespace Namespace for this MQ Producer instance.
     * @param producerGroup Producer group, see the name-sake field.
     * @param rpcHook RPC hook to execute per each remoting command execution.
     * @param enableMsgTrace Switch flag instance for message trace.
     * @param customizedTraceTopic The name value of message trace topic.If you don't config,you can use the default
     * trace topic name.
     */
    public DefaultMQProducer(final String namespace, final String producerGroup, RPCHook rpcHook,
        boolean enableMsgTrace, final String customizedTraceTopic);
    //启动生产者
    @Override
    public void start() throws MQClientException;
    //关闭生产者，并释放相关资源
    @Override
    public void shutdown();
    //获取topic的队列
    @Override
    public List<MessageQueue> fetchPublishMessageQueues(String topic) throws MQClientException;
    /**
     * 同步发送
     * @throws MQClientException if there is any client error.
     * @throws RemotingException if there is any network-tier error.
     * @throws MQBrokerException if there is any error with broker.
     * @throws InterruptedException if the sending thread is interrupted.
     */
    @Override
    public SendResult send(Message msg) throws MQClientException, RemotingException, MQBrokerException, InterruptedException；
   
    //带超时时间的同步发送
    @Override
    public SendResult send(Message msg,long timeout) throws MQClientException, RemotingException, MQBrokerException, InterruptedException;

    //异步发送,SendCallback执行回调
    @Override
    public void send(Message msg,SendCallback sendCallback) throws MQClientException, RemotingException, InterruptedException;
    @Override
    public void send(Message msg, SendCallback sendCallback, long timeout);
    //单向发送
    @Override
    public void sendOneway(Message msg) throws MQClientException, RemotingException, InterruptedException;

    //指定队列发送
    @Override
    public SendResult send(Message msg, MessageQueue mq)throws MQClientException, RemotingException, MQBrokerException, InterruptedException;
    @Override
    public SendResult send(Message msg, MessageQueue mq, long timeout);
    @Override
    public void send(Message msg, MessageQueue mq, SendCallback sendCallback);
    @Override
    public void send(Message msg, MessageQueue mq, SendCallback sendCallback, long timeout);
    @Override
    public void sendOneway(Message msg,MessageQueue mq) throws MQClientException, RemotingException, InterruptedException;

    //自定义队列选择器
    @Override
    public SendResult send(Message msg, MessageQueueSelector selector, Object arg)
        throws MQClientException, RemotingException, MQBrokerException, InterruptedException;
    @Override
    public SendResult send(Message msg, MessageQueueSelector selector, Object arg, long timeout);
    @Override
    public void send(Message msg, MessageQueueSelector selector, Object arg, SendCallback sendCallback);
    @Override
    public void send(Message msg, MessageQueueSelector selector, Object arg, SendCallback sendCallback, long timeout);
    @Override
    public void sendOneway(Message msg, MessageQueueSelector selector, Object arg);
    //根据时间戳获取偏移量
    @Override
    public long searchOffset(MessageQueue mq, long timestamp) throws MQClientException;

    //批量写入消息，为什么只有一个返回结果？
    @Override
    public SendResult send(
        Collection<Message> msgs) throws MQClientException, RemotingException, MQBrokerException, InterruptedException {
        return this.defaultMQProducerImpl.send(batch(msgs));
    }
      private MessageBatch batch(Collection<Message> msgs) throws MQClientException {
        MessageBatch msgBatch;
        try {
            msgBatch = MessageBatch.generateFromList(msgs);
            for (Message message : msgBatch) {
                Validators.checkMessage(message, this);
                MessageClientIDSetter.setUniqID(message);
                message.setTopic(withNamespace(message.getTopic()));
            }
            msgBatch.setBody(msgBatch.encode());
        } catch (Exception e) {
            throw new MQClientException("Failed to initiate the MessageBatch", e);
        }
        msgBatch.setTopic(withNamespace(msgBatch.getTopic()));
        return msgBatch;
    }

}


```



### 27.5.3. 队列选择器

用户可以定义自己的队列选择器，实现消息的局部有序发送。

队列定义
```java
public class MessageQueue implements Comparable<MessageQueue>, Serializable {
    private static final long serialVersionUID = 6191200464116433425L;
    private String topic;
    private String brokerName;
    private int queueId;
}
```
```java
public interface MessageQueueSelector {
    MessageQueue select(final List<MessageQueue> mqs, final Message msg, final Object arg);
}
public class SelectMessageQueueByHash implements MessageQueueSelector {

    @Override
    public MessageQueue select(List<MessageQueue> mqs, Message msg, Object arg) {
        int value = arg.hashCode();
        if (value < 0) {
            value = Math.abs(value);
        }

        value = value % mqs.size();
        return mqs.get(value);
    }
}
public class SelectMessageQueueByMachineRoom implements MessageQueueSelector {
    private Set<String> consumeridcs;

    @Override
    public MessageQueue select(List<MessageQueue> mqs, Message msg, Object arg) {
        return null;
    }

    public Set<String> getConsumeridcs() {
        return consumeridcs;
    }

    public void setConsumeridcs(Set<String> consumeridcs) {
        this.consumeridcs = consumeridcs;
    }
}
public class SelectMessageQueueByRandom implements MessageQueueSelector {
    private Random random = new Random(System.currentTimeMillis());

    @Override
    public MessageQueue select(List<MessageQueue> mqs, Message msg, Object arg) {
        int value = random.nextInt(mqs.size());
        return mqs.get(value);
    }
}


```
### 27.5.4. 发送流程分析
<a href="#menu" style="float:right">目录</a>

```java
 private SendResult sendDefaultImpl(
        Message msg,
        final CommunicationMode communicationMode,
        final SendCallback sendCallback,
        final long timeout
    ) throws MQClientException, RemotingException, MQBrokerException, InterruptedException {
        this.makeSureStateOK();
        //检测消息有效性，包括时长否过规定的长度
        Validators.checkMessage(msg, this.defaultMQProducer);

        final long invokeID = random.nextLong();
        long beginTimestampFirst = System.currentTimeMillis();
        long beginTimestampPrev = beginTimestampFirst;
        long endTimestamp = beginTimestampFirst;
        // //查找主题路由信息，先从缓存中查找，没有则向nameServer申请
        TopicPublishInfo topicPublishInfo = this.tryToFindTopicPublishInfo(msg.getTopic());
        if (topicPublishInfo != null && topicPublishInfo.ok()) {
            boolean callTimeout = false;
            MessageQueue mq = null;
            Exception exception = null;
            SendResult sendResult = null;
            int timesTotal = communicationMode == CommunicationMode.SYNC ? 1 + this.defaultMQProducer.getRetryTimesWhenSendFailed() : 1;
            int times = 0;
            String[] brokersSent = new String[timesTotal];
            for (; times < timesTotal; times++) {
                String lastBrokerName = null == mq ? null : mq.getBrokerName();
                //队列选择
                MessageQueue mqSelected = this.selectOneMessageQueue(topicPublishInfo, lastBrokerName);
                if (mqSelected != null) {
                    mq = mqSelected;
                    brokersSent[times] = mq.getBrokerName();
                    try {
                        beginTimestampPrev = System.currentTimeMillis();
                        if (times > 0) {
                            //Reset topic with namespace during resend.
                            msg.setTopic(this.defaultMQProducer.withNamespace(msg.getTopic()));
                        }
                        long costTime = beginTimestampPrev - beginTimestampFirst;
                        if (timeout < costTime) {
                            callTimeout = true;
                            break;
                        }

                        sendResult = this.sendKernelImpl(msg, mq, communicationMode, sendCallback, topicPublishInfo, timeout - costTime);
                        endTimestamp = System.currentTimeMillis();
                        this.updateFaultItem(mq.getBrokerName(), endTimestamp - beginTimestampPrev, false);
                        switch (communicationMode) {
                            case ASYNC:
                                return null;
                            case ONEWAY:
                                return null;
                            case SYNC:
                                if (sendResult.getSendStatus() != SendStatus.SEND_OK) {
                                    if (this.defaultMQProducer.isRetryAnotherBrokerWhenNotStoreOK()) {
                                        continue;
                                    }
                                }

                                return sendResult;
                            default:
                                break;
                        }
                    } catch (RemotingException e) {
                        endTimestamp = System.currentTimeMillis();
                        this.updateFaultItem(mq.getBrokerName(), endTimestamp - beginTimestampPrev, true);
                        log.warn(String.format("sendKernelImpl exception, resend at once, InvokeID: %s, RT: %sms, Broker: %s", invokeID, endTimestamp - beginTimestampPrev, mq), e);
                        log.warn(msg.toString());
                        exception = e;
                        continue;
                    } catch (MQClientException e) {
                        endTimestamp = System.currentTimeMillis();
                        this.updateFaultItem(mq.getBrokerName(), endTimestamp - beginTimestampPrev, true);
                        log.warn(String.format("sendKernelImpl exception, resend at once, InvokeID: %s, RT: %sms, Broker: %s", invokeID, endTimestamp - beginTimestampPrev, mq), e);
                        log.warn(msg.toString());
                        exception = e;
                        continue;
                    } catch (MQBrokerException e) {
                        endTimestamp = System.currentTimeMillis();
                        this.updateFaultItem(mq.getBrokerName(), endTimestamp - beginTimestampPrev, true);
                        log.warn(String.format("sendKernelImpl exception, resend at once, InvokeID: %s, RT: %sms, Broker: %s", invokeID, endTimestamp - beginTimestampPrev, mq), e);
                        log.warn(msg.toString());
                        exception = e;
                        switch (e.getResponseCode()) {
                            case ResponseCode.TOPIC_NOT_EXIST:
                            case ResponseCode.SERVICE_NOT_AVAILABLE:
                            case ResponseCode.SYSTEM_ERROR:
                            case ResponseCode.NO_PERMISSION:
                            case ResponseCode.NO_BUYER_ID:
                            case ResponseCode.NOT_IN_CURRENT_UNIT:
                                continue;
                            default:
                                if (sendResult != null) {
                                    return sendResult;
                                }

                                throw e;
                        }
                    } catch (InterruptedException e) {
                        endTimestamp = System.currentTimeMillis();
                        this.updateFaultItem(mq.getBrokerName(), endTimestamp - beginTimestampPrev, false);
                        log.warn(String.format("sendKernelImpl exception, throw exception, InvokeID: %s, RT: %sms, Broker: %s", invokeID, endTimestamp - beginTimestampPrev, mq), e);
                        log.warn(msg.toString());

                        log.warn("sendKernelImpl exception", e);
                        log.warn(msg.toString());
                        throw e;
                    }
                } else {
                    break;
                }
            }

            if (sendResult != null) {
                return sendResult;
            }

            String info = String.format("Send [%d] times, still failed, cost [%d]ms, Topic: %s, BrokersSent: %s",
                times,
                System.currentTimeMillis() - beginTimestampFirst,
                msg.getTopic(),
                Arrays.toString(brokersSent));

            info += FAQUrl.suggestTodo(FAQUrl.SEND_MSG_FAILED);

            MQClientException mqClientException = new MQClientException(info, exception);
            if (callTimeout) {
                throw new RemotingTooMuchRequestException("sendDefaultImpl call timeout");
            }

            if (exception instanceof MQBrokerException) {
                mqClientException.setResponseCode(((MQBrokerException) exception).getResponseCode());
            } else if (exception instanceof RemotingConnectException) {
                mqClientException.setResponseCode(ClientErrorCode.CONNECT_BROKER_EXCEPTION);
            } else if (exception instanceof RemotingTimeoutException) {
                mqClientException.setResponseCode(ClientErrorCode.ACCESS_BROKER_TIMEOUT);
            } else if (exception instanceof MQClientException) {
                mqClientException.setResponseCode(ClientErrorCode.BROKER_NOT_EXIST_EXCEPTION);
            }

            throw mqClientException;
        }

        List<String> nsList = this.getmQClientFactory().getMQClientAPIImpl().getNameServerAddressList();
        if (null == nsList || nsList.isEmpty()) {
            throw new MQClientException(
                "No name server address, please set it." + FAQUrl.suggestTodo(FAQUrl.NAME_SERVER_ADDR_NOT_EXIST_URL), null).setResponseCode(ClientErrorCode.NO_NAME_SERVER_EXCEPTION);
        }

        throw new MQClientException("No route info of this topic, " + msg.getTopic() + FAQUrl.suggestTodo(FAQUrl.NO_TOPIC_ROUTE_INFO),
            null).setResponseCode(ClientErrorCode.NOT_FOUND_TOPIC_EXCEPTION);
    }
```

### 27.5.5. 默认的队列选择

默认的队列选择没有使用以上的的接口实现类，而是自行实现了一个 

* sendLatencyFaultEnable=false 
    * 默认不启用 Broker 故障延迟机制 。
    * 队列采用轮询方式选择
    
* sendLatencyFaultEnable=true 
    * 启用 Broker 故障延迟机制 。如果Broker出现过故障，暂时不选择该broker中的队列，而是先选择其他Broker的队列

```java
 public MessageQueue selectOneMessageQueue(final TopicPublishInfo tpInfo, final String lastBrokerName) {
    //
    if (this.sendLatencyFaultEnable) {
        try {
            int index = tpInfo.getSendWhichQueue().getAndIncrement();
            for (int i = 0; i < tpInfo.getMessageQueueList().size(); i++) {
                int pos = Math.abs(index++) % tpInfo.getMessageQueueList().size();
                if (pos < 0)
                    pos = 0;
                MessageQueue mq = tpInfo.getMessageQueueList().get(pos);
                if (latencyFaultTolerance.isAvailable(mq.getBrokerName())) {
                    if (null == lastBrokerName || mq.getBrokerName().equals(lastBrokerName))
                        return mq;
                }
            }

            final String notBestBroker = latencyFaultTolerance.pickOneAtLeast();
            int writeQueueNums = tpInfo.getQueueIdByBroker(notBestBroker);
            if (writeQueueNums > 0) {
                final MessageQueue mq = tpInfo.selectOneMessageQueue();
                if (notBestBroker != null) {
                    mq.setBrokerName(notBestBroker);
                    mq.setQueueId(tpInfo.getSendWhichQueue().getAndIncrement() % writeQueueNums);
                }
                return mq;
            } else {
                latencyFaultTolerance.remove(notBestBroker);
            }
        } catch (Exception e) {
            log.error("Error occurred when selecting message queue", e);
        }

        return tpInfo.selectOneMessageQueue();
    }

    return tpInfo.selectOneMessageQueue(lastBrokerName);
}
public MessageQueue selectOneMessageQueue(final String lastBrokerName) {
    if (lastBrokerName == null) {
        return selectOneMessageQueue();
    } else {
        int index = this.sendWhichQueue.getAndIncrement();
        for (int i = 0; i < this.messageQueueList.size(); i++) {
            int pos = Math.abs(index++) % this.messageQueueList.size();
            if (pos < 0)
                pos = 0;
            MessageQueue mq = this.messageQueueList.get(pos);
            if (!mq.getBrokerName().equals(lastBrokerName)) {
                return mq;
            }
        }
        return selectOneMessageQueue();
    }
}


```

## 27.6. 消费者
<a href="#menu" style="float:right">目录</a>

### 27.6.1. 消息消费概述
* 消息消费以组的模式开展， 一个消费组内可以包含多个消费者，每一个消费组可订阅多个主题
* 消费组之间有集群模式与广播模式两种消费模式 。
    *  集群模式，主题下的同一条消息只允许被其中一个消费者消费 。
    *  广播模式，主题下的同一条消息将被集群内的所有消费者消费一次。 
* 消息服务器与消费者之间的消息传送也有两种方式：推模式、拉模式 。 
    * 拉模式
        * 是消费端主动发起拉消息请求
        * 消息拉模式，主要是由客户端手动调用消息拉取 API 
    * 推模式
        * 消息到达消息服务器后，推送给消息消费者 。 
        * 消息推模式是消息服务器主动将消息推送到消息消费端
        * RocketMQ 消息推模式的实现基于拉模式，在拉模式上包装一层，一个拉取任务完成后开始下一个拉取任务 。
* 集群模式下，多个消费者如何对消息队列进行负载呢？消息队列负载机制遵循一个通用的思想 ： 一个消息队列同一时间只允许被一个消费者消费，一个消费者可以消费多个消息队列 。
* RocketMQ 支持局部顺序消息消费，也就是保证同一个消息队列上的消息顺序消费 。 不
支持消息全局顺序消 费， 如果要实现某一主题的全局顺序消息消费， 可以将该主题的队列
数设置为 1 ，牺牲高可用性 。
* RocketMQ 支持两种消息过滤模式：表达式（ TAG 、 SQL92 ）与类过滤模式 。




### 27.6.2. 消息消费推/拉方式
<a href="#menu" style="float:right">目录</a>


RocketMQ消息消费本质上是基于的拉（pull）模式，consumer主动向消息服务器broker拉取消息。
consumer被分为2类：MQPullConsumer和MQPushConsumer，其实本质都是拉模式（pull），即consumer轮询从broker拉取消息。 区别：
**MQPushConsumer方式**，consumer把轮询过程封装了，并注册MessageListener监听器，取到消息后，唤醒MessageListener的consumeMessage()来消费，对用户而言，感觉消息是被推送（push）过来的。主要用的也是这种方式。
**MQPullConsumer方式**，取消息的过程需要用户自己写，首先通过打算消费的Topic拿到MessageQueue的集合，遍历MessageQueue集合，然后针对每个MessageQueue批量取消息，一次取完后，记录该队列下一次要取的开始offset，直到取完了，再换另一个MessageQueue。

 RocketMQ 并没有真正实现推模式，而是消费者主动向消息服务器拉取消息， RocketMQ推模式是循环向消息服务端发送消息拉取请求，如果消息消费者向 RocketMQ 发送消息拉取时，消息并未到达消费队列，如果不启用长轮询机制，则会在服务端等待hortPollingTimeMills 时间后（挂起）再去判断消息是否已到达消息队列，如果消息未到达则提示消息拉取客户端 PULL_NOT_FOUND （消息不存在），如果开启长轮询模式，RocketMQ 一方面会每5s 轮询检查一次消息是否可达 ， 同时一有新消息到达后立马通知挂起线程再次验证新消息是否是自 己感兴趣的消息，如果是则从 commitlog 文件提取消息返回给消息拉取客户端，否则直到挂起超时，超时时间由消息拉取方在消息拉取时封装在请求参数中， PUSH 模式默认为15s, PULL 模式通过 DefaultMQPullConsumer#setBrokerSuspendMaxTim巳Millis 设置。 RocketMQ 通过在 Broker 端配置 longPollingEnable 为仕回来开启长轮询模式 。
长轮询的主动权还是掌握在Consumer手中，Broker即使有大量消息积压，也不会主动推送给Consumer 。因为pull之前会去检查当前的消费情况。

数据交互有两种模式：Push（推模式）、Pull（拉模式）。真正的PUSH和PULL的区别：
* 推模式指的是客户端与服务端建立好网络长连接，服务方有相关数据，直接通过长连接通道推送到客户端。其优点是及时，一旦有数据变更，客户端立马能感知到；另外对客户端来说逻辑简单，不需要关心有无数据这些逻辑处理。缺点是不知道客户端的数据消费能力，可能导致数据积压在客户端，来不及处理。
* 拉模式指的是客户端主动向服务端发出请求，拉取相关数据。其优点是此过程由客户端发起请求，故不存在推模式中数据积压的问题。缺点是可能不够及时，对客户端来说需要考虑数据拉取相关逻辑，何时去拉，拉的频率怎么控制等等。

拉模式中，为了保证消息消费的实时性，采取了长轮询消息服务器拉取消息的方式。每隔一定时间，客户端想服务端发起一次请求，服务端有数据就返回数据，服务端如果此时没有数据，保持连接。等到有数据返回（相当于一种push），或者超时返回。

长轮询Pull的好处就是可以减少无效请求，保证消息的实时性，又不会造成客户端积压。

目前绝大部分的MQ都是基于的PULL模式

**PushConsumer**
```java

public class PushConsumer { 
    public static void main(String[] args) throws InterruptedException, MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("CID_JODIE_1");
        consumer.subscribe("Jodie_topic_1023", "*");
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
        //wrong time format 2017_0422_221800
        consumer.setConsumeTimestamp("20170422221800");
        consumer.registerMessageListener(new MessageListenerConcurrently() {
 
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
                System.out.printf(Thread.currentThread().getName() + " Receive New Messages: " + msgs + "%n");
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        consumer.start();
        System.out.printf("Consumer Started.%n");
    }
}

```
**PullConsumer**
```JAVA
public class PullConsumer {
    private static final Map<MessageQueue, Long> OFFSE_TABLE = new HashMap<MessageQueue, Long>();
 
    public static void main(String[] args) throws MQClientException {
        DefaultMQPullConsumer consumer = new DefaultMQPullConsumer("please_rename_unique_group_name_5");
 
        consumer.start();
 
        Set<MessageQueue> mqs = consumer.fetchSubscribeMessageQueues("TopicTest1");
        for (MessageQueue mq : mqs) {
            System.out.printf("Consume from the queue: %s%n", mq);
            SINGLE_MQ:
            while (true) {
                try {
                    PullResult pullResult =
                        consumer.pullBlockIfNotFound(mq, null, getMessageQueueOffset(mq), 32);
                    System.out.printf("%s%n", pullResult);
                    putMessageQueueOffset(mq, pullResult.getNextBeginOffset());
                    switch (pullResult.getPullStatus()) {
                        case FOUND:
                            break;
                        case NO_MATCHED_MSG:
                            break;
                        case NO_NEW_MSG:
                            break SINGLE_MQ;
                        case OFFSET_ILLEGAL:
                            break;
                        default:
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
 
        consumer.shutdown();
    }
 
    private static long getMessageQueueOffset(MessageQueue mq) {
        Long offset = OFFSE_TABLE.get(mq);
        if (offset != null)
            return offset;
 
        return 0;
    }
 
    private static void putMessageQueueOffset(MessageQueue mq, long offset) {
        OFFSE_TABLE.put(mq, offset);
    }
 
}

```
* 处理逻辑是逐个读取某Topic下所有Message Queue的内容，读完一遍后退出，主要处理额外的三件事情:
    * 获取Message Queue并遍历
        * 一个Topic包括多个Message Queue，如果这个 Consumer 需要获取Topic下所有的消息，就要遍历多有的 Message Queue。如果有特殊情况，也可以选择某些特定的 Message Queue 来读取消息 。
    * 维护 Offsetstore
        * 从一个 Message Queue 里拉取消息的时候，要传人 Offset参数( long类型 的值)，随着不断读取消息 ， Offset会不断增长 。 这个时候由用户负责把 Offset 存储下来，根据具体情况可以存到内存里、写到磁盘或者数据库里等 。
    * 根据不同的消息状态做不同的处理
        * 拉取消息的请求发出后，会返回: FOUND、 NO_MATCHED_MSG、 NO_NEW_MSG、 OFFSET_ILLEGAL 四种状态，需要根据每个状态做不同的处理 。比较重要的两个状态是 FOUNT 和 NO_NEW_MSG ，分别表示获取到消息和没有新的消息 。

 
**Consumer 的启动、关闭流程**
对于 PullConsumer来说，使用者主动权很高，可以根据实际需要暂停、停止、启动消费过程 。 需要注意的是 Offset 的保存，要在程序的异常处理部分增加把 Offset 写人磁盘方 面的处理，记准了每个 Message Queue 的 Offset，才能保证消息消 费 的准确性 。

DefaultMQPushConsumer 的退出， 要调用 shutdown() 函数， 以便 释放资 源、保存 Offset 等 。 这个调用要加到 Consumer 所在应用的退出逻辑中 。

启动 DefaultMQPushConsumer 时, NameServer 地址填错，程序仍然 可以正常启动，但是不会收到消息 。
解决启动时NameServer填写错误报错：可以在 Consumer.start()语句后调用: Consumer.fetchSubscribeMessageQueues(”TopicName”)，这时如果配置信息写得不准确，或者当前服务不可用，这个语句会报 MQClientException 异常 。

### 27.6.3. 提高 Consumer 处理能力
<a href="#menu" style="float:right">目录</a>`

* 提高消费者数量
    * 不要超过读队列，否则会出现消费者闲置问题。
    * 单个消费者内使用多线程方式消费消息
* 以批量方式进行消费
    * 比如update操作，一次提取多条消息处理之后进行update
* 检测延时情况，跳过非重要消息
    * Consumer 在消 费的过程中， 如果发现由于某种原因发生严重的消 息堆积，短时间无法消除堆积，这个时候可以选择丢弃不重要 的消息，使 Consumer 尽快追上 Producer 的进度
```java
public ConsumeConcurrentlyStatus consumeMessage (List<MessageExt> msgs,ConsumeConcurrentlyContext context) {
    long Offset = msgs. get (0) . getQueueOffset() ;
    String maxOffset = msgs. get (0) . getProperty (Message.PROPERTY.MAX_OFFSET) ;
    long diff = Long . parseLong(maxOffset) - Offset ;
    if (diff > 90000) {
        return ConsumeConcurrentlyStatus.CONSUME.SUCCESS;
    }
    ／／正常消费消息
    return ConsumeConcurrentlyStatus.CONSUME.SUCCESS;
 }
```

### 27.6.4. Consumer 的负载均衡
<a href="#menu" style="float:right">目录</a>

当消费组里面有多个

要做负载均衡，必须知道一些全局信息，也就是一个 ConsumerGroup 里到底有多少个 Consumer ， 知道了全局信息，才可以根据某种算法来分配，比如简单地平均分到各个 Consumer。 在 RocketMQ 中，负载均衡或者消息分配是在Consumer 端代码中完成的， Consumer 从 Broker 处获得全局信息，然后自己做负载均衡，只处理分给自己的那部分消息 

**DefaultMQPushConsumer 的负载均衡**

**DefaultMQPullConsumer 的负载均衡**

### 27.6.5. 定时消息
<a href="#menu" style="float:right">目录</a>


```java
public class ScheduledMessageConsumer {
    
     public static void main(String[] args) throws Exception {
         // Instantiate message consumer
         DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("ExampleConsumer");
         // Subscribe topics
         consumer.subscribe("TestTopic", "*");
         // Register message listener
         consumer.registerMessageListener(new MessageListenerConcurrently() {
             @Override
             public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> messages, ConsumeConcurrentlyContext context) {
                 for (MessageExt message : messages) {
                     // Print approximate delay time period
                     System.out.println("Receive message[msgId=" + message.getMsgId() + "] "
                             + (System.currentTimeMillis() - message.getStoreTimestamp()) + "ms later");
                 }
                 return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
             }
         });
         // Launch consumer
         consumer.start();
     }
 }
 public class ScheduledMessageProducer {
    
     public static void main(String[] args) throws Exception {
         // Instantiate a producer to send scheduled messages
         DefaultMQProducer producer = new DefaultMQProducer("ExampleProducerGroup");
         // Launch producer
         producer.start();
         int totalMessagesToSend = 100;
         for (int i = 0; i < totalMessagesToSend; i++) {
             Message message = new Message("TestTopic", ("Hello scheduled message " + i).getBytes());
             // This message will be delivered to consumer 10 seconds later.
             message.setDelayTimeLevel(3);
             // Send the message
             producer.send(message);
         }
    
         // Shutdown producer after use.
         producer.shutdown();
     }
        
 }
```

定时消息是指消息发送到 Broker 后，并不立即被消费者消费而是要等到特定的时间后才能被消费， RocketMQ 并不支持任意的时间 精度， 如果要支持任 意 时间精度的定时调度，不可避免地需要在 Broker 层做消息排序（可以参考 JDK 并发包调度线程池ScheduledExecutorService 的实现原理），再加上持久化方面的考量，将不可避免地带来具大的性能消耗，所以 RocketMQ 只支持特定级别的延迟消息 。 消息延迟级别在 Broker 端通过messageDelayLevel 配置，默认为 ” 1s 5s 10s 30s lm 2m 3m 4m 5m 6m 7m 8m 9m 1Om 20m 30m 1h 2h ",可在·配置文件里面改,delayLevel=1，表示延迟1s,delayLevel=3，表示延迟10s.

上文提到的消息重试正是借助定时任务实现的，在将消息存入 commitlog 文件之前需要判断消息的重试次数 ，如果大于 0 ，则会将消息的 主题设置为 SCHEDULE_TOPIC_XXXX 。RocketMQ 定时消息实现类为 org.apache.rocketmq.store.schedule.ScheduleMessageService 。该类的实例在 DefaultMessageStore 中创建 ，通过在 DefaultMessageStore中调用load方法加载并调用 start 方法进行启动 。 接下来我们分析一下 ScheduleMessageService 实现原理 。

**load 方法**
该方法主要完成延迟消息消费队列消息进度的加载与 delayL巳velTable 数据的构造，延迟队列消息消费进度默认存储路径为$｛ROCKET一HOME} /store/config/delayOffset.json.

**start 方法**
Stepl ：根据延迟队列创建定 时任务，遍历延迟级别，根据延迟级别 level 从 offsetTable中获取消费队列的消费进度， 如果不存在， 则使用 0。 也就是说每一个延迟级别对应一个消息消费队列 。然后创建定时任务，每一个定时任务第一次启动时默认延迟 ls 先执行一次定时任务，第二次调度开始才使用相应的延迟时间 。 延迟级别与消息消费队列 的映射关系为 ：消息队列 ID＝延迟级别-1 。
Step2 ：创建定时任务，每隔 10s 持久化一次延迟队列的消息消 费进度（延迟消息调进度），持久化频率可以通过 flushDe layOffsetlnterva l 配置属性进行设置 。

定时消息的第 一 个设计关键点是 ， 定时消息单独一个 主 题 ： SCHEDULE TOPICxxxx ， 该主题 下 队列数量等于 MessageStoreConfig#messageDelayLevel 配置的延迟级别数量 ， 其对应关系为 queueld 等于延迟级别减 1 。 ScheduleMessageS巳rvice 为每 一 个延迟级别创建 一个定时 Timer 根据延迟级别对应的延迟时间进行延迟调度 。 在消息发送时 ， 如果消息的延迟级别 delayLevel 大于 0 ， 将消息的原主题名称、队列 ID 存入消息的属性中，然后改变消息的 主 题、队列与延迟主题与延迟 主 题所属队列 ， 消息将最终转发到延迟队列的消费队列 。

**定时调度逻辑**
cheduleMessageService 的 start 方法启动后，会为每一个延迟级别创建一个调度任务，每一个延迟级别其实对应 SCHEDULE TOPIC XXXX 主题下的一个消息消费队列 。定时调度任务的实现类为 DeliverDelayedMessageTimerTask ，其核心实现为 executeOnTimeup 。
* Step1 ：根据队列 ID 与延迟主题查找消息消费 队列，如 果未找 到 ， 说明目前并不存在该延时级别的消息，忽略本次任务，根据延时级别创建下一次调度任务即可 。
* Step2 ：根据 offset 从消 息消费队列中获取当前队列中所有有效的消息 。 如果未找到，则更新一下延迟队列定时拉取进度并创建定时任务待下一次继续尝试 。
* Step3 ：遍历 ConsumeQueue ，每一个标准 ConsumeQueue 条目为20个字节, 解析出消息的物理偏移量、 消息长度 、 消息 tag hashcode ，为从 commitlog 加载具体的消息做准备 。
* Step4 ：根据消息物理偏移量与消息大小从commitlog 文件中查找消息 。 如果未找到消息，打印错误日志，根据延迟时间创建下一个定时器
* Step5 ：根据消息重新构建新的消息对象，清除消息的延迟级别属性（ delayLevel ）、并恢复消息原先的消息主题与消息消费队列，消息的消费次数 reconsumeTimes 并不会丢失 
* Step6 ：将消息再次存入到 commitlog ，并转发到主题对应的消息队列上，供消费者再次消费 。
* Step7： 更新延迟队列拉取进度 。

上述就是定时消息的实现原理，其整个流程如图所示 。
1 ）消息消费者发送消息 ，如 果发送消息 的 delayLevel 大于 0 ，则改 变消息主题为
SCHEDULE_TOPIC_XXXX ，消息队列为 delayLevel 减 l 。
2 ）消息经由 commitlog 转发到消息消费队列 SCHED叽E TOPIC_XXXX 的消息消费队列 0。
3 ）定时任务 Time 每隔 Is 根据上次拉取偏移量从消费 队列中取出所有消息 。
4 ）根据消息的物理偏移量与消息大小从 CommitLog 中拉取消息 。
5 ）根据消息 属 性 重新创 建消息，并恢复原主题 topicA 、原队列 ID ，清除 delayLevel属性，存入 commitlog 文件 。
6 ）转发到原主题 topicA 的消息消费队列，供消息消费者消费 。

![消息日志结构图](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/message-scheduler.png?raw=true)


## 27.7. 消息存储
<a href="#menu" style="float:right">目录</a>


### 27.7.1. 消息存储结构
<a href="#menu" style="float:right">目录</a>

![消息日志结构图](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/rocketmq-log.png?raw=true)

* RocketMQ 消息的存储是由 ConsumeQueue 和 CommitLog ，IndexFile配合完成的
    * 消息真正的物理存储文件是 CommitLog, 
        * 每台 Broker 上的 CommitLog 被本机器所有 ConsumeQueue 共享
        * 存储目 录默认为$｛ ROCKET_HOME } /store/commitlog
        * 在 CommitLog 中，一个消息的存储长度是不固定的
        * CommitLog是顺序写，但是随机读
        * 所有的消息都存在同一个CommitLog文件
        * 每一个文件默认1G ， 一个文件写满后再创建另外一个，以该文件中第一个偏移量为文件名，偏移量小于20 位用 0 补齐 ,这样根据物理偏移量能快速定位到消息
        * 在写入 CommitLog 之前，先申请 putMessageLock ，也就是将消息存储到CommitLog 文件中是串行的 
    * ConsumeQueue 
        * 是消息的逻辑队列，类似数据库的索引文件，存储的是指向物理存储的地址
        * 每个队列独有一个ConsumeQueue
    * IndexFile
        * 消息索引文件，主要存储消息 Key 与 Offset 的对应关系
        * 为了加速消息的检索性能，根据消息的属性快速从 Commitlog 文件中检索消息 
        
* 存储机制好处
    * CommitLog 顺序写 ，可以大大提高写人效率 。
    * 虽然是随机读，但是利用操作系统的 pagecac h e 机制，可以批量地从磁盘读取，作为 cache 存到 内存中，加速后续的读取速度 。
    * 为了保证完全的顺序写，需要 ConsumeQueue 这个中间结构 ，因为ConsumeQu巳ue 里只存偏移量信息，所以尺寸是有限的，在实际情况中，大部分的 ConsumeQueue 能够被全部读人内存，所以这个中间结构的操作速度很快，可以认为是内存读取的速度 。 此外为了保证 CommitLog 和 ConsumeQueue 的一致性， CommitLog 里存储了 Consume Queues 、 Message k町、 Tag 等所信息，即使 ConsumeQueue 丢失，也可以通过 commitLog 完全恢复出来
* 事务状态服务 ： 存储每条消息的事务状态 。
* 定时消息服务：每一个延迟级别对应一个消息消费队列，存储延迟队列的消息拉取进度 。
```
CommitLog地址
${user.home} \store\${commitlog}\$｛fileName ｝
ConsumeQueue地址
${$storeRoot} \consumequeue\$ {topicName}\$ {queueId} \$ {fileName ｝

```

* 优化点
    * 使用顺序写，顺序写比随机写可以达到几千倍的差距
    * 使用零拷贝技术
        * 操作系统分为内核态和用户态，如果不使用零拷贝，至少要进行四次复制
        * 使用了零拷贝，当内核接收到网络数据时，不复制到用户层面，直接复制写入到磁盘，只需要一次复制。
        * 使用内存映射机制，提高读写速度

**Commitlog 文件**
Commitlog用于存储具体的消息，其特点是每一条消息长度不相同，消息格式如下   
![Commitlog 文件](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/Commitlog.png?raw=true)

* 根据偏移量与消息长度查找消息
    * 首先根据偏移找到所在的物理偏移量
    * 然后用 offset与文件长度取余得到在文件内 的偏移量 
    * 从该偏移量读取 size 长度的 内容返回即可 
* 如果只根据消息偏移查找消息
    * 首先找到文件内的偏移量 
    * 然后尝试读取 4 个字节获取消息的实际长度 
    * 最后读取指定字节即可 。

**消息队列文件ConsumeQueue**
![消息队列文件ConsumeQueue](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/ConsumeQueue.png?raw=true)
单个 ConsumeQueue 文件中默认包含 30 万个条目，单个文件的长度为 30w × 20 字节，单个 ConsumeQueue 文件可以看出是一个 ConsumeQueue 条目的数组，其下标为 ConsumeQueue 的逻辑偏 移量，消息消费进度存储的偏移量 即逻辑偏移 量 。 ConsumeQueue 即为Commitlog 文件的索引文件， 其构建机制是 当消息到达 Comm itlog 文件后 ， 由专门的线程产生消息转发任务，从而构建消息消费队列文件与下文提到的索引文件 。

**IndexFile索引文件**
消息消费队列是RocketMQ 专门为消息订阅构建的索引文件 ，提高根据主题与消息队列检索消息的速度，另外RocketMQ引入了Hash索引机制为消息建立索引，HashMap的设计包含两个基本点：Hash 槽与Hash冲突的链表结构 。RocketMQ索引文件布局如图。

![IndexFile索引文件](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/IndexLog.png?raw=true)
* lndexFile 总共包含 lndexHeader 、 Hash 槽 、 Hash 条目（数据） 。
    * IndexHeader 头部，包含 40 个字节，记录该 IndexFile 的统计信息，其结构如下 。
        * beginTimestamp ： 该索引 文件中包含消息 的最小存储时间 。
        * endTimestamp ： 该索引文件中包含消息的最大存储时间 。
        * beginPhyoffset ： 该索引文件 中包含消息的最小物理偏移量（ c ommitlog 文件偏移量） 。
        * endPhyoffset ：该索引 文件中包含消息 的最大物理偏移量（ commitlog 文件偏移量） 。
        * hashslotCount: hashslot 个数，并不是 hash 槽使用的个数，在这里意义不大 。
        * indexCount: Index 条目列表当前已使用的个数， Index 条目在 Index 条目列表中按顺序存储 。
    * Hash槽， 一个IndexFile默认包含500 万个 Hash 槽，每个 Hash 槽存储的是落在该
        * Hash 槽的 hashcode 最新的 In dex 的索引 。    
    * Index 条目列表，默认一个索引文件包含 2000 万个条目，每一个 Index 条目结构如下 。
        * hashcode: key 的 hashcode 。
        * phyoffset ： 消息对应的物理偏移量 。
        * timedif：该消息存储时间与第一条消息的 时间戳的差值，小于 0 该消息无效 。
        * prelndexNo ：该条目 的前一条记录 的 Index 索引， 当 出现 hash 冲突 时 ， 构建的链表结构 。

* 如何将 Map<String／＊消息索引 key灯，long phyOffset／＊消息物理偏移量＊／＞存入索引文件
    * 如果当前已使用条目大于等于允许最大条目数时，则返回 fas le ，表示当前索引文件已写满 。 如果当前索引文件未写满则根据 key 算 出key 的 hashcode ，然后 keyHash 对hash 槽数量取余定位到 hasbcod巳对应的 hash 槽下标， hashcode 对应的 hash 槽的物理地址为 IndexHeader 头部（40 字节）加上下标乘以每个 hash 槽的大小（4 字节） 。
    * 读取 hash 槽中存储的数据，如果 hash 槽存储的数据小于 0 或大于当前索引文件中的索引条目格式， 则将 slotValue 设置为 0 。
    * 计算待存储消息 的时间戳与第一条消 息时间戳的差值，并转换成秒 。
    * 将条目信息存储在 IndexFile 中 。
        * 计算新添加条目的起始物理偏移量 ， 等于头部字节长度＋ hash 槽数量 ＊ 单个 hash槽大小（4 个字节）＋当前 Index 条目个数＊单个 Index 条目大小（20 个字节） 。
        * 依 次将 hash cod巳 、 消息物理偏移 量、消 息存储时间戳与索引文件时间戳、当前Hash 槽的值存入 MappedByteBuffer 中 。
        * 将当前 Index 中包含 的条 目 数量存入 Hash 槽中 ，将覆盖原先 Hash 槽的值
    * 更新文件索引头信息,如果当前文件只包含一个条目，更新 b eginPhyOffset 与beginTimestamp 、更新 endPyhOffset、endTimestamp 、当前文件使用索引条目等信息 。
* 如何根据消息索引 key 快速查找消息 。
    * 根据 key 算 出 key 的 hashcode ，然后 keyHash 对 hash 槽数 量 取余定位到hashcode 对应的 hash 槽下标， hashcode 对应的 hash 槽的物理地址为 IndexHeader 头部（ 40字节）加上下标乘以每个 hash 槽的大小（ 4 字节） 
    * 如果对应的 Hash 槽中存储的数据小于 1 或 大于当 前索引条目个数则表示 该HashCode 没有对应的条目， 直接返回 。
    * 由于会存在 hash 冲突，根据 slotValue 定位该 hash 槽最新 的一个 Item 条目， 将存储的物理偏移加入到 phyOffsets 中 ，然后继续验证 Item 条 目中存储的上一个 Index 下标，如果大于等于 l 并且小于最大条 目 数， 则继续查找 ， 否则结束查找 。
    * 根据 Index 下标定位 到 条目 的起始物理偏移量，然后依次读取 hashcode 、 物理偏移量、 时间差 、 上一个条目的 Index 下标 。
    * 如果存储的时间差小于 0 ，则直接结束 ；如果 hashcode 匹配并且消息存储时间介于待查找时间 start 、 end 之间则将消 息物理偏移量加入到 phyOffsets ， 并验证条目的前一个Index 索引 ，如果索引 大于等于 l 并且小于 Index 条目数， 则继续查找 ，否则结束整个查找 

**checkpoint文件**

![checkpoint文件](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/checkpoint.png?raw=true)
* heckpoint 的作用是记录 Comitlog 、ConsumeQueue 、Index文件的刷盘时间点，文件固定长度为 4k，其中只用该文件的前面 24 个字节


### 27.7.2. 消息队列与索引文件恢复
<a href="#menu" style="float:right">目录</a>

由于RocketMQ存储首先将消息全量存储在 Commitlog 文件中，然后异步生成转发任务更新 ConsumeQueue 、 Index 文件 。 如果消息成功存储到 Commitlog 文件中，转发任务未成功执行，此时消息服务器 Broker 由 于某个原因看机，导致Commitlog 、ConsumeQueue 、IndexFile 文件数据不一致 。如果不加以人工修复的话，会有一部分消息即便在 Commitlog文件中存在，但由于并没有转发到 Consum巳queue ，这部分消息将永远不会被消费者消费。

* 一致性处理
    * 判断上 一次退出是否正常 。 其实 现机制 是 Broker 在启动时创 建$｛ ROCKET_HOME} /store/abort 文件，在退 出时通过注册 NM 钩子函数删除 abort 文件 。如果下一次启动时存在 abort 文件 。 说明 Broker 是异常退出的， Commitlog 与 Consumequeue 数据有可能不一致，需要进行修复.
    * 加载延迟队列 ， RocketMQ 定时消 息相关
    * 加 载 Commitlog 文 件 ， 加载 $ ｛ ROCKET_HOME }/store/commitlog 目 录 下所有文件并按照文件名 排序 。 如果文件大小与配置文件的单个文件大小不一致，将忽略该目 录下所有文件，然后创建 MappedFile 对象 。注意load 方法将 wrotePosition 、 flushedPosition ,committedPosition 三个指针都设置为文件大小 。
    * 加载消息消费队列，调用 DefaultMessageStore# loadConsumeQueue，其思路与 CommitLog大体一致，遍历消息消费队列根目录，获取该Broker存储的所有主题，然后遍历每个主题目录，获取该主题下的所有消息消费队列，然后分别加载每个消息消费队列下的文件，构建ConsumeQueue对象，主要初始化ConsumeQueue 的 topic,queueld,storePath ,mappedFileSize属性 。
    * 加载存储检测点，检测点主要记录commitlog文件,Consumequeue文件 、Index 索引文件的刷盘点，将在下文的文件刷盘机制中再次提交 。
    * 加载索引文件，如果上次异常退出，而且索引文件上次刷盘时间小于该索引文件最大的消息时间戳该文件将立即销毁 。
    * 根据Broker是否是正常停止执行不同的恢复策略，下文将分别介绍异常停止 、正常停止的文件恢复机制 。
    * 恢复ConsumeQueue 文件后，将在 CommitLog 实例中保存每个消息消费队列当前的存储逻辑偏移量，这也是消息中不仅存储主题 、消息队列ID还存储了消息队列偏移量的关键所在 。

#### 27.7.2.1. Broker 正常停止文件恢复
<a href="#menu" style="float:right">目录</a>

Broker 正常停止文件恢复的实现为 CommitLog#recoverNormally 。

* Broker正常停止再重启时，从倒数第三个文件开始进行恢复，如果不足3 个文件，则从第一个文件开始恢复。checkCRCOnRecover 参数设置在进行文件恢复时查找消息时是否验证 CRC 。

* 解释一下两个局部变量，mappedFileOffset为当前文件已校验通过的offset,processOffset为Commitlog文件已确认的物理偏移量等于mappedFile.getFileFromOffset加上 mappedFileOffset。

* 遍历Commitlog文件，每次取出一条消息，如果查找结果为true并且消息的长度大于0表示消息正确，mappedFileOffset指针向前移动本条消息的长度；如果查找结果为true并且消息的长度等于0，表示已到该文件的末尾，如果还有下一个文件，则重置processOffset 、mappedFileOffset 重复步骤3，否则跳出循环；如果查找结构为 false ，表明该文件未填满所有消息，跳出循环，结束遍历文件
* 更新 MappedFileQueue 的 flushedWhere 与 commiteedWhere 指针 。
* 删除 offset 之后的所有文件 。遍历目录下的文件，如果文件的尾部偏移量小于offset则跳过该文件，如果尾部的偏移量大于 offset ，则进一步比较offset与文件的开始偏移量，如果 offset 大于文件的起始偏移量， 说明 当前文件包含了有效偏移里 ，设置MappedFile 的 flushedPosition 和 commitedPosition ；如果 offse t 小于文件的起始偏移量，说明该文件是有效文件后面创建的，调用 MappedFile#destory 释放 MappedFile 占用的内存资源（内存映射与内存通道等），然后加入到待删除文件列表中，最终调用 deleteExpiredFile将文件从物理磁盘删除 。 过期文件的删除将在下文详细介绍 。

#### 27.7.2.2. Broker 异常停止文件恢复
<a href="#menu" style="float:right">目录</a>

Broker 异常停止文件恢复的实现为 CommitLog#recoverAbnormally 。
异常文件恢复的步骤与正常停止文件恢复 的流程基本相同，其主要差别有两个 。 首先，正常停止默认从倒数第三个文件开始进行恢复， 而异常停止则需要从最后一个文件往前走，找到第一个消息存储正常的文件 。 其次，如果 commitlog 目录没有消息文件，如果在消息消费 队列目录下存在文件，则需要销毁 。

* 首先判断文件的魔数，如果不是 MESSAGE MAGIC_CODE ，返回 false ，表示该文件不符合 commitlog 消息文件的存储格式 
* 如果文件中第一条消息的存储时间 等于 0 ， 返回 false ，说明该消息存储文件中未存储任何消息 。
* 对比文件第一条 消息的时间戳与检测点，文件第 一条 消息的时间戳小于文件检测点说明 该文件部分消息是可靠 的 ， 则从该文件开始恢 复 。 文件检测点中保存了Commitlog 文件 、消息消费 队列（ ConsumeQueue ） 、索 引文件 （ IndexFile ）的 文件刷盘点，RocketMQ 默认选择这消息文件与消息消 费 队列这两个文件的时间刷盘点中最小值与消息文件第一消息 的时间戳对比，如果 messagelndexEnable 为 true ， 表示索引 文件的刷盘时间点也参与计算 。
* 如果根据前 3 步算法找到 MappedFile ，则遍历 MappedFile 中的消息，验证消息的合法性，并将消息重新转发到消息消费队列与索引 文件 
* 如果未找到有效 Mappe dFile ， 则设置 commitlog 目 录的 flushedWhere 、 committedWhere 指针都为 0 ，并销毁消息消费队列文件 。

存储启动时所谓的文件恢复主要完成 flushedPosition, committedWhere 指针的设置 、消息消费队列最大偏移 量加载到内存，并删除 flushedPosition 之后所有的文件。如果 Broker异常启 动， 在文件 恢复过程中 ， RocketMQ 会将最后一个有效文件中的所有消息重新转发到消息消费队 列与索引文件，确保不丢失消息，但同时会带来消息重复的 问 题，纵观RocktMQ 的整体设计思想， RocketMQ 保证消息不丢失但不保证消息不会重复消费 ， 故消息消费业务方需要 实现消息消费的幕等设计 。


### 27.7.3. 文件刷盘机制
<a href="#menu" style="float:right">目录</a>

* RocketMQ 的存储与读写是基于 JDK NIO 的内存映射机制（ MappedByteBuffer）的，消息存储时首先将消息追加到内存，再根据配置的刷盘策略在不同时间进行刷写磁盘。
* 同步刷盘
    * 消息追加到内存映射文件的内存中后，立即将数据从内存刷写到磁盘文件 
    * 数据写入成功才会向客户端返回写入成功响应
    * 具体流程是，消息、写入内存的 PAGECACHE 后，立刻通知刷盘线程刷盘，然后等待刷盘完成，刷盘线程执行完成后唤醒等待的线程，返回消息写成功的状态 
    * 延迟大，效率低，但是可靠性高。
* 异步刷盘
    * 在返回写成功状态时，消息可能只是被写人了内存的PAGECACHE ，写操作的返回快，吞吐量大；
    * 当内存里的消息量积累到一定程度时 ，统一触发写磁盘动作，快速写人 。
    * 在消息追加到内存后立刻返回给消息发送端 。
    * 延迟低，但是数据可靠性不高
* RocketMQ 使用一个单独的线程按照某一个设定的频率执行刷盘操作 。 通过在 broker 配置文件中配置 flushDiskType 来设定刷盘方式，可选值为 ASYNC_FLUSH （异步刷盘）、 SYNC_FLUSH （ 同步刷盘） ， 默认为异步刷盘。 
* ConsumerQueue 、 IndexFile 刷盘的实现原理与 Commitlog 刷盘机制类似 。 
* RocketMQ 处理刷盘的实现方法为 Commitlog#handleDiskFlush()方法， 刷盘流程作为消息发送 、 消息存储的子流程
* 值得注意的是索引文件的刷盘并不是采取定时刷盘机制，而是每更新一次索引文件就会将上一次的改动刷写到磁盘 。


    


### 27.7.4. 过期文件删除机制
<a href="#menu" style="float:right">目录</a>

* 由于使用了内存映射，只要存在于存储目录下的文件，都需要对应创建内存映射文件，如果不定时将已消费的消息从存储文件中删除，会造成极大的内存压力与资源浪费，所有 RocketMQ 采取定时删除存储文件的策略，也就是说在存储文件中， 第一个文件不一定是 00000000000000000000 ，因为该文件在某一时刻会被删除
* 由于 RocketMQ 操作 CommitLog 、 ConsumeQueue文件是基于内存映射机制并在启动的时候会加载 commitlog 、 ConsumeQueue 目录下的所有文件，为了避免内存与磁盘的浪费，不可能将消息永久存储在消息服务器上，所以需要引人一种机制来删除己过期的文件 。
* RocketMQ 顺序写 Commitlog 文件 、 ConsumeQueue 文件，所有写操作全部落在最后一个CommitLog 或 ConsumeQueue 文件上，之前的文件在下一个文件创建后将不会再被更新 。
* RocketMQ 清除过期文件的方法是 ：如果非当前写文件在一定时间间隔内没有再次被更新，则认为是过期文件，可以被删除， RocketMQ **不会关注这个文件上的消息是否全部被消费** 。
* 默认每个文件的过期时间为 72 小时 ，通过在 Broker 配置文件中设置fileReservedTime 来改变过期时间，单位为小时.


## 27.8. 高可用机制

<a href="#menu" style="float:right">目录</a>

* RocketMQ 分布式集群是通过 Master 和 Slave 的配合达到高可用性的
* broker配置文件中，brokerId为0则为master,大于0则为slave
* brokerRole=SYNC_MASTER
    * brokerRole 有3种
        * SYNC_MASTER
        * ASYNC_MASTER 
        * SLAVE 
    * SYNC 和 ASYNC 表示Master和Slave之间同步消息的机制，SYNC的意思是当 Slave 和 Master 消息同步完成后，再返回发送成功的状态
* master支持读写，slave仅支持读,如果master宕积，消费者会切换到slaver读取
* 不支持slave自动转化为master,需要手动更改配置


* 消息需要从 Master 复制到 Slav巳上，有同步和异步两种复制方式 。 
* 同步复制方式是等 Master 和 Slave 均写成功后才反馈给客户端写成功状态；
    * 在同步复制方式下，如果 Master 出故障， Slave 上有全部的备份数据，容易恢复，但是同步复制会增大数据写人延迟，降低系统吞吐量
* 异步复制方式是只要 Master 写成功即可反馈给客户端写成功状态 。
    * 在异步复制方式下，系统拥有较低的延迟和较高的吞吐量，但是如果 Master 出了故障，有些数据因为没有被写人 Slave ，有可能会丢失

### 27.8.1. 动态增减broker
<a href="#menu" style="float:right">目录</a>

* 由于业务增长，需要对集群进行扩容的时候，可以动态增加 Broker 角色的机器 。 只增加 Broker 不会对原有的 Topic 产生影响，原来创建好的 Topic 中数据的读写依然在原来的那些 Broker 上进行 。
* 集群扩容后， 一是可以把新建的 Topic 指定到新的 Broker 机器上，均衡利用资源；另一种方式是通过 updateTopic 命令更改现有的 Topic 配置，在新加的 Broker 上创建新的队列

* 减少broker
    * topic只有一个master的broker,关闭broker发送会受影响，因此在关闭前需要停止生产者发送消息
    * topic有多个master的broker
        * 如果使用同步发送，因为存在重试逻辑，broker停止之后生产者会尝试其他broker，不会发生消息丢失。
        * 如果使用异步或者one-way发送，没有重试逻辑，会丢失切换过程的消息。因为生产者30s（默认）才会向nameServer更新broker消息。

* 关闭broker应当使用kill命令，broker会在ShutdownHook 中做一些清理工作，不要使用 kill -9，这会强制关闭，不会执行ShutdownHook 。
        

![创建topic](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/create-topic.png?raw=true)

### 27.8.2. 各种故障对消息的影响
<a href="#menu" style="float:right">目录</a>

* Broker 正常关闭，启动；
    * 情况属于可控的软件 问题，内存中的数据不会丢失.
    * 如果重启过程中有持续运行的 Consumer, Master 机器出故障后， Consumer 会自动 重连到对应的 Slave 机器，不会有消息丢失和偏差 。 当 Master 角色的机器重启 以后， Co nsumer 又会重新连接到 Master 机器（ 注意在启动 Mas ter 机器的时候，如果 Consumer 正在从 Slave 消费消息，不要停止 Consumer 。 假如此时先停止Consumer 后再启动 Master 机器，然后再启动 Consumer ，这个时候 Consumer就会去读 Master 机器上已经滞后的 offset 值，造成消息大量重复） 。
    * 如果情况出现时有持续运行的 Producer ， 一 台 Master 出故障后，Producer 只能向 Topic 下其他的 Master 机器发送消息，如果 Pro ducer 采用同步发送方式，不会有消息丢失
* Broker 异常 Crash ，然后启动；OS Crash ，重启；机器断电，但能马上恢复供电；
    * 属于软件故障，内存的数据可能丢失，所 以刷盘策略不同，造成的影响也不同，如果 Master 、 Slave 都配置成 SYNC_FLUSH ，可以达到和第1 种情况相同的效果 。

* 磁盘损坏；CPU 、 主板、内存等关键设备损坏 。
    * 属于硬件故障，原有机器的磁盘数据可能会丢失 。 如果 Master 和 Slave 机器间配置成同步复制方式，某一台机器发生该的故障，也可以达到消息不丢失的效果 。 如果 Master 和 Slave机器间是异步复制，两次 Sync 间的消息会丢失 。
* 总的来说，当设置成以下配置，就可以消除单点依赖，即使某台机器出现极端故障也不会丢消息 。
    * 多 Master ，每个 Master 带有 Slave;
    * 主从之间设置成 SYNC_MASTER;
    * Producer 用同步方式写；
    * 刷盘策略设置成 SYNC FLUSH 。



## 27.9. 顺序消息
<a href="#menu" style="float:right">目录</a>

顺序消息是指消息的消费顺序和产生顺序相同，在有些业务逻辑下，必须保证顺序 。 比如订单的生成 、 付款、发货，这 3 个消息必须按顺序处理才行 。顺序消息分为全局顺序消息和部分顺序消息，全局顺序消息指某个 Topic 下的所有消息都要保证顺序；部分顺序消息只要保证每一组消息被顺序消费即可，比如上面订单消息的例子，只要保证同一个订单 ID 的三个消息能按顺序消费即可 。

**全局顺序消息**
* rocket默认情况下不保证顺序。一个topic默认创建8个写队列，8个读队列，消息被哪个消费者读取到是不确定的，因此不能保证顺序。
* 要保 证全局顺序消息， 需要 先把 Topic 的读写队列数设置为 一，然后Producer 和 Consumer 的并发设置也要是一 。 简单来说，为了保证整个 Topic 的
全局消息有序，只能消除所有的并发处理，各部分都设置成单线程处理。 这时高并发、高吞吐量的功能完全用不上了 。
* 在实际应用中，更多的是像订单类消息那样，只需要部分有序即可.

**部分顺序消息**
要保证部分消息有序，需要发送端和消费端配合处理 。 在发送端，要做到把同一业务 ID 的消息发送到同一个 Message Queue ；在消费过程中，要做到从同一个 Message Queue 读取的消息不被并发处理，这样才能达到部分有序 。

**顺序发送**

生产端通过MessageQueueSelector来控制 把消息发往哪个 MessageQueue 
消费端通过MessageListenerOrderly来解决单 Message Queue 的消息被并发处理的问题
```java
public class OrderedProducer {
    public static void main(String[] args) throws Exception {
        //Instantiate with a producer group name.
        MQProducer producer = new DefaultMQProducer("example_group_name");
        //Launch the instance.
        producer.start();
        String[] tags = new String[] {"TagA", "TagB", "TagC", "TagD", "TagE"};
        for (int i = 0; i < 100; i++) {
            int orderId = i % 10;
            //Create a message instance, specifying topic, tag and message body.
            Message msg = new Message("TopicTestjjj", tags[i % tags.length], "KEY" + i,
                    ("Hello RocketMQ " + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
            SendResult sendResult = producer.send(msg, new MessageQueueSelector() {
            @Override
            public MessageQueue select(List<MessageQueue> mqs, Message msg, Object arg) {
                Integer id = (Integer) arg;
                int index = id % mqs.size();
                return mqs.get(index);
            }
            }, orderId);

            System.out.printf("%s%n", sendResult);
        }
        //server shutdown
        producer.shutdown();
    }
}
public class OrderedConsumer {
    public static void main(String[] args) throws Exception {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("example_group_name");

        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);

        consumer.subscribe("TopicTest", "TagA || TagC || TagD");

        consumer.registerMessageListener(new MessageListenerOrderly() {

            AtomicLong consumeTimes = new AtomicLong(0);
            @Override
            public ConsumeOrderlyStatus consumeMessage(List<MessageExt> msgs,
                                                       ConsumeOrderlyContext context) {
                context.setAutoCommit(false);
                System.out.printf(Thread.currentThread().getName() + " Receive New Messages: " + msgs + "%n");
                this.consumeTimes.incrementAndGet();
                if ((this.consumeTimes.get() % 2) == 0) {
                    return ConsumeOrderlyStatus.SUCCESS;
                } else if ((this.consumeTimes.get() % 3) == 0) {
                    return ConsumeOrderlyStatus.ROLLBACK;
                } else if ((this.consumeTimes.get() % 4) == 0) {
                    return ConsumeOrderlyStatus.COMMIT;
                } else if ((this.consumeTimes.get() % 5) == 0) {
                    context.setSuspendCurrentQueueTimeMillis(3000);
                    return ConsumeOrderlyStatus.SUSPEND_CURRENT_QUEUE_A_MOMENT;
                }
                return ConsumeOrderlyStatus.SUCCESS;

            }
        });

        consumer.start();

        System.out.printf("Consumer Started.%n");
    }
}
```
MessageListenerOrderly 并不是简单地禁止并发处理 。 在 MessageListenerOrderly 的实现中，为每个 Consumer Queue 加个
锁，消费每个消息前，需要先获得这个消息对应的 Consumer Queue 所对应的锁，这样保证了同一时间，同一个 Consumer Queue 的消息不被并发消费，但不同 Consumer Queue 的消息可以并发处理 。

## 27.10. 消息饥饿问题
<a href="#menu" style="float:right">目录</a>

* 有AA，BB两种类型的消息，都放在同一个topic中，如果AA的数据量特别大，BB的数据量特别小，就会导致BB类型的消息不能即时处理
    * AA和BB放在不同的topic中，这样两种类型的消息都能够同时处理
    * AA和BB放在同一个topic的不同队列中，消费者轮询各个队列进行消费
    

## 27.11. 消息过滤 
<a href="#menu" style="float:right">目录</a>

* 消息的 Tag 和 Key
    * tag 
        * 消息可以使用tag进行标识，每条消息只能设置一个tag
        * 消费者订阅消息时，可以利用tag在broker进行消息过滤
        * 用于服务端消息过滤
    * key 
        * 根据key来查找消息
        * 用于通过命令行查找消息
消息 
```java
Message(String topic, String tags, String keys, int flag, byte[] body, boolean waitStoreMsgOK)
```

**用tag方式进行过滤**
ConsumerQueue 的存储格式:
```
CommitLog Offset：8Byte ,Size:4Byte, Message Tag Hashcode:8Byte
```

Consume Queue 的第三部分存储的是 Tag 对应的 hashcode ，是一个定长的字符串，通过 Tag 过滤的过程就是对 比定长的 hashcode 。 经过 hash code 对比 ，符合要求的消息被从CommitLog 读取出来，不用担心 Hash 冲突问题，消息在被消费前，会对比完整的 Message Tag 字符串，消除 Hash 冲突造成的误读 。

消费者订阅时指定接收的tag,以下接收TAGA~TAGC的消息
```java
DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("CID_EXAMPLE");
consumer.subscribe("TOPIC", "TAGA || TAGB || TAGC");
```

**用SQL方式进行过滤**

如下代码，生产者通过putUserProperty（）设置一个参数值。
消费者通过MessageSelector的bySql()指定根据该参数值的过滤条件
```java
Message msg = new Message("TopicTest",
    tag,
    ("Hello RocketMQ " + i).getBytes(RemotingHelper.DEFAULT_CHARSET)
);
// Set some properties.
msg.putUserProperty("a", String.valueOf(i));

//消费者
// only subsribe messages have property a, also a >=0 and a <= 3
consumer.subscribe("TopicTest", MessageSelector.bySql("a between 0 and 3");

```

* 类似SQL的过滤表达式，支持如下语法 ：
    * 数字对比 ， 比如 ＞、＞＝、＜、＜＝、 BETWEEN 、 ＝；
    * 字符串对比，比如＝ 、＜＞、 IN;
    * 0 IS NULL or IS NOT NULL;
    * 逻辑符号 AND 、 OR 、 NOT。
* 支持的数据类型：
    * 数字型，比如 123 、 3.1415;
    * 字符型 ，比如 ＇ abe’ 、注意必须用单号 ；
    * NULL ，这个特殊字符；
    * 布尔型， TRUE or FALSE 。

SQL 表达式方式的过滤需 要 Broker 先读出消息 里 的属性内容， 然后做SQL 计算，增大磁盘压力，没有 Tag 方式高效 。

**Filter Server 方式过滤**
* Filter Server 是一 种比 SQL 表达式更灵活的过滤方式，允许用户自定义Java 函数，根据 Java 函数 的逻辑对消息进行过滤 。
* 要使用 Filter Server，首先要在启动 Broker 前在配置文件里加上 filterServerNums = 3 这样的配 置
* Broker 在 启动的时 候 ， 就会在本 机启动 3 个 Filter Server 进程 。 
* Filter Server 类 似 一 个 RocketMQ 的 Consumer 进程，它从本机Broker获取消息，然后根据用户上传过来的 Java 函数进行过滤，过滤后的消息再传给远端的 Consumer 。 
* 这种方式会占用很多 Broker 机器的 CPU 资源，要根据实际情况谨慎使用 。 
* 上传的 java 代码也要经过检查 ，不能有申请大内存、建线程等这样的操作，否则容易造成 Broker 服务器右机 。

```java
public class MessageFilterimpl implements MessageFilter {
    @Override
    public boolean match (MessageExt msg) {
        String property= msg.getUserProperty ("Sequenceid");
        if (property != null) {
            int id= Integer . parseint (property) ;
            if ((id % 3) == 0 && (id > 10) ) {
                return true ;
            }
            return false;
        }
    }
} 

```

```java
public static void main (String [] args) throws InterruptedException ,MQClientException {
    DefaultMQPushConsumer consumer ＝new DefaultMQPushConsumer("Consumer ­GroupNamecc4") ;
    //使用 Java代码，在服务器做消息过滤
    String filterCode = MixAll.file2String("/home/admin/MessageFilterimpl.java" );
    consumer.subscribe("TopicFilter7","com.alibaba.rocketmq.example.filter.MessageFilterimpl",filterCode);
    consumer.registerMessageL 工stener(new MessageListenerConcurrently() {
    @Override
    public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs,ConsumeConcurrentlyContext context) {
        System.out.println(Thread.currentThread().getName() + "Receive New Messages:" + msgs);
        return ConsumeConcurrentlyStatus . CONSUME SUCCESS;
    });
    consumer.start();
    System.out.println ("Consumer Started . ") ;
}

```
在使用 Filter Server 的 Consumer 例子中，主要是把实现过滤逻辑的类作为参数传到 Broker 端， Broker 端的 Filter Server 会解析这个类，然后根据 match函数里的逻辑进行过滤

## 27.12. 事务消息
<a href="#menu" style="float:right">目录</a>

**分布式消息队列RocketMQ--事务消息--解决分布式事务的最佳实践** 

说到分布式事务，就会谈到那个经典的”账号转账”问题：2个账号，分布处于2个不同的DB，或者说2个不同的子系统里面，A要扣钱，B要加钱，如何保证原子性？

一般的思路都是通过消息中间件来实现“最终一致性”：A系统扣钱，然后发条消息给中间件，B系统接收此消息，进行加钱。

但这里面有个问题：A是先update DB，后发送消息呢？ 还是先发送消息，后update DB？

假设先update DB成功，发送消息网络失败，重发又失败，怎么办？ 
假设先发送消息成功，update DB失败。消息已经发出去了，又不能撤回，怎么办？

所以，这里下个结论： 只要发送消息和update DB这2个操作不是原子的，无论谁先谁后，都是有问题的。

**错误的方案**
如果把“发送消息”这个网络调用和update DB放在同1个事务里面，如果发送消息失败，update DB自动回滚。这样不就保证2个操作的原子性了吗？

这个方案看似正确，其实是错误的，原因有2：

（1）消息发布问题：发送消息失败，发送方并不知道是消息中间件真的没有收到消息呢？还是消息已经收到了，只是返回response的时候失败了？

如果是已经收到消息了，而发送端认为没有收到，执行update db的回滚操作。则会导致A账号的钱没有扣，B账号的钱却加了。

（2）把网络调用放在DB事务里面，可能会因为网络的延时，导致DB长事务。严重的，会block整个DB。这个风险很大。

### 27.12.1. 事务实现思想
<a href="#menu" style="float:right">目录</a>

* RocketMQ 事务消息的实现原理基于两阶段提交和定时事务状态回查来决定消息最终是提交还是回滚。
    * 应用程序在事务内完成相关业务数据落库后，需要同步调用 RocketMQ 消息发送接口，发送状态为 prepare 的消息 。 消息发送成功后， RocketMQ 服务器会回调 RocketMQ 消息发送者的事件监听程序，记录消息的本地事务状态，该相关标记与本地业务操作同属一个事务，确保消息发送与本地事务的原子’性 。
    * RocketMQ 在收到类型为 prepare 的消息时， 会首先备份消息的原主题与原消息消费队列，然后将消息存储在主题为 RMQ_SYS_TRANS_HALF_TOPIC 的消息消费队列中。
    * RocketMQ 消息服务器开启一个定时任务，消费 RMQ_SYS_TRANS_HALF_TOPIC的消息，向消息发送端（应用程序）发起消息事务状态回查，应用程序根据保存的事务状态回馈消息服务器事务的状态（提交、回滚、未知），如果是提交或回滚， 则消息服务器提交或回滚消息，如果是未知，待下一次回查， RocketMQ 允许设置一条消息的回查间隔与回查次数，如果在超过回查次数后依然无法获知消息的事务状态， 则默认回滚消息 。

![事务原理图](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/rockrtmq-transaction.png?raw=true)

### 27.12.2. 事务消息发送流程

<a href="#menu" style="float:right">目录</a>


```java
public class TransactionProducer {
    public static void main(String[] args) throws MQClientException, InterruptedException {
        TransactionListener transactionListener = new TransactionListenerImpl();
        TransactionMQProducer producer = new TransactionMQProducer("please_rename_unique_group_name");
        ExecutorService executorService = new ThreadPoolExecutor(2, 5, 100, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2000), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setName("client-transaction-msg-check-thread");
                return thread;
            }
        });

        producer.setExecutorService(executorService);
        producer.setTransactionListener(transactionListener);
        producer.start();

        String[] tags = new String[] {"TagA", "TagB", "TagC", "TagD", "TagE"};
        for (int i = 0; i < 10; i++) {
            try {
                Message msg =
                    new Message("TopicTest1234", tags[i % tags.length], "KEY" + i,
                        ("Hello RocketMQ " + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
                SendResult sendResult = producer.sendMessageInTransaction(msg, null);
                System.out.printf("%s%n", sendResult);

                Thread.sleep(10);
            } catch (MQClientException | UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 100000; i++) {
            Thread.sleep(1000);
        }
        producer.shutdown();
    }
}

public class TransactionListenerImpl implements TransactionListener {
       private AtomicInteger transactionIndex = new AtomicInteger(0);
   
       private ConcurrentHashMap<String, Integer> localTrans = new ConcurrentHashMap<>();
   
       @Override
       public LocalTransactionState executeLocalTransaction(Message msg, Object arg) {
           int value = transactionIndex.getAndIncrement();
           int status = value % 3;
           localTrans.put(msg.getTransactionId(), status);
           return LocalTransactionState.UNKNOW;
       }
   
       @Override
       public LocalTransactionState checkLocalTransaction(MessageExt msg) {
           Integer status = localTrans.get(msg.getTransactionId());
           if (null != status) {
               switch (status) {
                   case 0:
                       return LocalTransactionState.UNKNOW;
                   case 1:
                       return LocalTransactionState.COMMIT_MESSAGE;
                   case 2:
                       return LocalTransactionState.ROLLBACK_MESSAGE;
               }
           }
           return LocalTransactionState.COMMIT_MESSAGE;
       }
   }
```
![事务执行基本原理](http://lifestack.cn/wp-content/uploads/2015/09/%E4%BA%8B%E5%8A%A1%E9%80%BB%E8%BE%91.jpg)

第一阶段是：步骤1，2，3。
第二阶段是：步骤4，5。
具体说明：
只有在消息发送成功，并且本地操作执行成功时，才发送提交事务消息，做事务提交。

其他的情况，例如消息发送失败，直接发送回滚消息，进行回滚，或者发送消息成功，但是执行本地操作失败，也是发送回滚消息，进行回滚。

事务消息原理实现过程：

一阶段：
Producer向Broker发送1条类型为TransactionPreparedType的消息，Broker接收消息保存在CommitLog中，然后返回消息的queueOffset和MessageId到Producer，MessageId包含有commitLogOffset（即消息在CommitLog中的偏移量，通过该变量可以直接定位到消息本身），由于该类型的消息在保存的时候，commitLogOffset没有被保存到consumerQueue中，此时客户端通过consumerQueue取不到commitLogOffset，所以该类型的消息无法被取到，导致不会被消费。

一阶段的过程中，Broker保存了1条消息。

二阶段：
Producer端的TransactionExecuterImpl执行本地操作，返回本地事务的状态，然后发送一条类型为TransactionCommitType或者TransactionRollbackType的消息到Broker确认提交或者回滚，Broker通过Request中的commitLogOffset，获取到上面状态为TransactionPreparedType的消息（简称消息A），然后重新构造一条与消息A内容相同的消息B，设置状态为TransactionCommitType或者TransactionRollbackType，然后保存。其中TransactionCommitType类型的，会放commitLogOffset到consumerQueue中，TransactionRollbackType类型的，消息体设置为空，不会放commitLogOffset到consumerQueue中。

二阶段的过程中，Broker也保存了1条消息。

总结：事务消息过程中，broker一共保存2条消息。

RocketMQ将事务拆分成小事务异步执行的方式来执行。
    RocketMQ第一阶段发送Prepared消息时，会拿到消息的地址，第二阶段执行本地事物，第三阶段通过第一阶段拿到的地址去访问消息，并修改状态。RocketMQ会定期扫描消息集群中的事物消息，这时候发现了Prepared消息，它会向消息发送者确认，RocketMQ会根据发送端设置的策略来决定是回滚还是继续发送确认消息。这样就保证了消息发送与本地事务同时成功或同时失败。
RocketMQ事务消息：
![](http://static.oschina.net/uploads/space/2016/1019/154854_NEZF_2950586.png)


上面涉及到两个类 TransactionMQProducer和TransactionListener,LocalTransactionState
* TransactionMQProducer
    * 事务消息生产者
* TransactionListener
    * 事务监听器，主要定义实现本地事务状态执行 、本地事务状态回查两个接口 。
    * LocalTransactionState executeLocalTransaction(final Message msg, final Object arg ) 
        * 该方法主要是设置本地事务状态，与业务方代码在一个事务中，例如 OrderServer#createMap 中，只要本地事务提交成功，该方法也会提交成功 。故在这里，主要是向 t_message_transaction 添加一条记录，在事务回查时，如果存在记录，就认为是该消息需要提交，其返回值建议返还Loca!TransactionState.UNKNOW 。
    * LocalTransactionState checkLocalTransaction (final MessageExt msg ）： 
        * 事务消息状态回查,相当于再次确认。
        * 该方法主要是告知 RocketMQ 消息是需要提交还是回滚，如果本地事务表（ t message transaction ）存在记录， 则认为提交；如果不存在，可以设置回查次数，如果指定次数内还是未查到消息，则因滚，否则返回未知 。 rocketmq会按一定的频率 回查事务 ， 当然 回查次数也有限制， 默认为 5 次，可配置
    

* LocalTransactionState
    * TransactionListener事务执行结果状态
        * COMMIT_MESSAGE，提交消息事务成功状态
        * ROLLBACK_MESSAGE，消息事务回滚
        * UNKNOW，结束事务，但不作任何处理
        
```java
public class TransactionMQProducer extends DefaultMQProducer {
    //事务监听器，主要定义实现本地事务状态执行 、本地事务状态回查两个接口 。
    private TransactionListener transactionListener;
    //事务状态 回查异步执行线程池 
    private ExecutorService executorService;

    public TransactionMQProducer() {
    }

    public TransactionMQProducer(String producerGroup) {
        super(producerGroup);
    }

    public TransactionMQProducer(String producerGroup, RPCHook rpcHook) {
        super(producerGroup, rpcHook);
    }

    public void start() throws MQClientException {
        this.defaultMQProducerImpl.initTransactionEnv();
        super.start();
    }

    public void shutdown() {
        super.shutdown();
        this.defaultMQProducerImpl.destroyTransactionEnv();
    }

    public TransactionSendResult sendMessageInTransaction(Message msg, Object arg) throws MQClientException {
        if (null == this.transactionListener) {
            throw new MQClientException("TransactionListener is null", (Throwable)null);
        } else {
            return this.defaultMQProducerImpl.sendMessageInTransaction(msg, this.transactionListener, arg);
        }
    }

    public TransactionListener getTransactionListener() {
        return this.transactionListener;
    }

    public void setTransactionListener(TransactionListener transactionListener) {
        this.transactionListener = transactionListener;
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }
}

public interface TransactionListener {
    LocalTransactionState executeLocalTransaction(Message var1, Object var2);

    LocalTransactionState checkLocalTransaction(MessageExt var1);
}

public enum LocalTransactionState {
    COMMIT_MESSAGE,
    ROLLBACK_MESSAGE,
    UNKNOW;

    private LocalTransactionState() {
    }
}


```

具体的发送处理
```java
 public TransactionSendResult sendMessageInTransaction(Message msg, TransactionListener tranExecuter, Object arg) throws MQClientException {
    if (null == tranExecuter) {
        throw new MQClientException("tranExecutor is null", (Throwable)null);
    } else {
        Validators.checkMessage(msg, this.defaultMQProducer);
        SendResult sendResult = null;
        /*首先为消息添加属性， TRAN_MSG 和 PGROUP ，分别表示消息为 prepare 消息 、消息所属消息生产者组
        设置消息生产者组的目的是在查询事务消息本地事务状态时，从该生产者组中随机选择一个消息生产者即可，然后通过同步调用方式向 RocketMQ 发送消息*/
        MessageAccessor.putProperty(msg, "TRAN_MSG", "true");
        MessageAccessor.putProperty(msg, "PGROUP", this.defaultMQProducer.getProducerGroup());

        try {
            //发送消息
            sendResult = this.send(msg);
        } catch (Exception var10) {
            throw new MQClientException("send message Exception", var10);
        }

        LocalTransactionState localTransactionState = LocalTransactionState.UNKNOW;
        Throwable localException = null;
        switch(sendResult.getSendStatus()) {
        //发送成功
        case SEND_OK:
            try {
                //获取transactionId
                if (sendResult.getTransactionId() != null) {
                    msg.putUserProperty("__transactionId__", sendResult.getTransactionId());
                }

                String transactionId = msg.getProperty("UNIQ_KEY");
                if (null != transactionId && !"".equals(transactionId)) {
                    msg.setTransactionId(transactionId);
                }
                //调用该事务监听器，执行executeLocalTransaction，里面执行本地事务，并返回执行状态
                localTransactionState = tranExecuter.executeLocalTransaction(msg, arg);
                if (null == localTransactionState) {
                    localTransactionState = LocalTransactionState.UNKNOW;
                }

                if (localTransactionState != LocalTransactionState.COMMIT_MESSAGE) {
                    this.log.info("executeLocalTransactionBranch return {}", localTransactionState);
                    this.log.info(msg.toString());
                }
            } catch (Throwable var9) {
                this.log.info("executeLocalTransactionBranch exception", var9);
                this.log.info(msg.toString());
                localException = var9;
            }
            break;
        case FLUSH_DISK_TIMEOUT:
        case FLUSH_SLAVE_TIMEOUT:
        case SLAVE_NOT_AVAILABLE:
            //消息发送失败，设置为ROLLBACK_MESSAGE
            localTransactionState = LocalTransactionState.ROLLBACK_MESSAGE;
        }

        try {
            //结束事务，根据本地事务执行结果返回的事务状态执行提交，回滚或暂时不处理事务 。
            this.endTransaction(sendResult, localTransactionState, localException);
        } catch (Exception var8) {
            this.log.warn("local transaction execute " + localTransactionState + ", but end broker transaction failed", var8);
        }

        TransactionSendResult transactionSendResult = new TransactionSendResult();
        transactionSendResult.setSendStatus(sendResult.getSendStatus());
        transactionSendResult.setMessageQueue(sendResult.getMessageQueue());
        transactionSendResult.setMsgId(sendResult.getMsgId());
        transactionSendResult.setQueueOffset(sendResult.getQueueOffset());
        transactionSendResult.setTransactionId(sendResult.getTransactionId());
        transactionSendResult.setLocalTransactionState(localTransactionState);
        return transactionSendResult;
    }
}


    
```

![事务发送流程](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/rockrtmq-transaction-send.png?raw=true)



### 27.12.3. 提交或者回滚事务
<a href="#menu" style="float:right">目录</a>

根据消息所属 的消息队列获取 Broker 的 IP 与端口 信息 ，然后发送结束事务命令 ，其关键就是根据本地执行事务的状态分别发送提交 、 回滚或 “不作为”的命令 。

```java
 public void endTransaction(SendResult sendResult, LocalTransactionState localTransactionState, Throwable localException) throws RemotingException, MQBrokerException, InterruptedException, UnknownHostException {
        MessageId id;
    if (sendResult.getOffsetMsgId() != null) {
        id = MessageDecoder.decodeMessageId(sendResult.getOffsetMsgId());
    } else {
        id = MessageDecoder.decodeMessageId(sendResult.getMsgId());
    }

    String transactionId = sendResult.getTransactionId();
    String brokerAddr = this.mQClientFactory.findBrokerAddressInPublish(sendResult.getMessageQueue().getBrokerName());
    EndTransactionRequestHeader requestHeader = new EndTransactionRequestHeader();
    requestHeader.setTransactionId(transactionId);
    requestHeader.setCommitLogOffset(id.getOffset());
    switch(localTransactionState) {
    case COMMIT_MESSAGE:
        requestHeader.setCommitOrRollback(8);
        break;
    case ROLLBACK_MESSAGE:
        requestHeader.setCommitOrRollback(12);
        break;
    case UNKNOW:
        requestHeader.setCommitOrRollback(0);
    }

    requestHeader.setProducerGroup(this.defaultMQProducer.getProducerGroup());
    requestHeader.setTranStateTableOffset(sendResult.getQueueOffset());
    requestHeader.setMsgId(sendResult.getMsgId());
    String remark = localException != null ? "executeLocalTransactionBranch exception: " + localException.toString() : null;
    this.mQClientFactory.getMQClientAPIImpl().endTransactionOneway(brokerAddr, requestHeader, remark, (long)this.defaultMQProducer.getSendMsgTimeout());
}

```

### 27.12.4. 事务消息回查事务状态
<a href="#menu" style="float:right">目录</a>

执行完本地事务返回本地事务状态为 UN KNOW 时，结束事务时将不做任何处理，而是通过事务状态定时回查以期得到发送端明确的事务操作（提交事务或回滚事务） 

RocketMQ 通过 TransactionalMessageCheckService 线程定 时去检测 RMQ_SYS_TRANS_HALF TOPIC 主题中的消息，回查消息的事务状态 。 TransactionalMessageCheckService 的检测频率默认为 l 分钟，可通过在 broker.conf文件中设置 transactionChecklnterval 来改变默认值，单位为毫秒。



## 27.13. 基于Netty的通信实现
<a href="#menu" style="float:right">目录</a>



# 28. Zookeeper
<a href="#menu" style="float:right">目录</a>

## 28.1. 基本概念
<a href="#menu" style="float:right">目录</a>

### 28.1.1. zk架构
![](https://zookeeper.apache.org/doc/r3.5.5/images/zkservice.jpg)
zk的结构如下，类似于一个Linux文件系统，根节点是"/"。
同时你可以在每个节点上添加监听器，当数据发生变化(增加，修改，删除)时，将会通知客户端。
因此zk简单理解就是一个类似文件系统结构的并且具有变更通知功能的分布式协调系统。
每一个节点称为zode。每个节点下可以创建多个子节点，每个节点还可以存放数据。

![](https://zookeeper.apache.org/doc/r3.5.5/images/zknamespace.jpg)


* 适用场景
在分布式系统中，多个服务需要共享一些系统配置信息，比如微服务环境下，服务提供者向zookeeper注册自己多的元数据信息(比如服务名称，地址等)。服务消费者通过注册监听器，获取到zk中服务信息的变化，服务消费者拉取新的配置信息同时更新本地缓存。就解决了服务提供者变更信息的情况下，服务消费者无需更新配置，所有过程都是自动化进行高的。

目前使用zk作为分布式协调系统的有Dubbo和Kafka

* 不适用场景
不适合做海量数据存储，海量数据应当使用数据库，分布式文件系统等。

* 主从模式
为了提高系统的可靠性，zk提供主从模式的分布式部署方式。

**主节点**: 主节点负责监视新的从节点和任务，分配任务给可用的从节点。每个集群只能有一个主节点。
**从节点**: 从节点通过系统注册自己，以确保主节点看到它们可以执行任务，然后开始监视新任务。

* 可靠性和快速性保证
    * 顺序一致性 - 客户端的更新将按发送顺序执行。
    * 原子性 - 更新成功或失败。 没有部分结果。
    * 单系统映像 - 无论服务器连接到哪个服务器，客户端都将看到相同的服务视图。
    * 可靠性 - 一旦应用了更新，它将从那时起持续到客户端覆盖更新。
    * 及时性 - 系统的客户视图保证在特定时间范围内是最新的。

### 28.1.2. 提供的功能
* 给节点创建监听器
* create : 创建节点
* delete : 删除节点
* exists : 检测节点是否存在
* get data : 从节点读取数据
* set data : 向节点写入数据
* get children : 获取子节点列表
* sync : 等待数据传播

### 28.1.3. 节点类型

以下两种类型可以交叉组合，比如持久有序，持久无序。
* 持久化节点(persistent)和临时节点(ephemeral)，临时节点在与创建它的客户端连接断开以后，判定连接失效之后将会被删除,或者客户端主动删除。持久化节点在创建成功之后，将会一直存在，除非手动删除。
* 有序节点和无序节点，有序节点在每次创建时同一个名称的节点时会自动在节点名称后面加上序列号。

**应用场景**:微服务中的失效剔除可以使用临时节点来实现，当服务提供者失效时，zk判断连接失败之后将服务信息删除，如果消费者监听该节点，将会收到删除请求。


<span id="menu"></span>


# 29. 性能调优
<a href="#menu" style="float:right">目录</a>

## 29.1. 性能调优概述

## 29.2. 操作系统性能监控
<a href="#menu" style="float:right">目录</a>

**vmstat**

```bash
lgj@lgj-Lenovo-G470:~/aProject/aRealPrj/Java-Interview$ vmstat 5
procs -----------memory---------- ---swap-- -----io---- -system-- ------cpu-----
 r  b   swpd   free   buff  cache   si   so    bi    bo   in   cs us sy id wa st
 0  0      0 2583376 206884 2458524    0    0    17    17  204  216  8  2 89  1  0
 0  0      0 2600524 206892 2439504    0    0     0    91  485 1380  2  1 97  0  0

```

## 29.3. JVM
<a href="#menu" style="float:right">目录</a>

### 29.3.1. JIT编译器

#### 29.3.1.1. 概述

* JIT编译器，英文写作Just-In-Time Compiler，中文意思是即时编译器。
JIT是一种提高程序运行效率的方法。通常，程序有两种运行方式：静态编译与动态解释。静态编译的程序在执行前全部被翻译为机器码，而动态解释执行的则是一句一句边运行边翻译。
* 在Java编程语言和环境中，即时编译器（JIT compiler，just-in-time compiler）是一个把Java的字节码（包括需要被解释的指令的程序）转换成可以直接发送给处理器的指令的程序。当你写好一个Java程序后，源语言的语句将由Java编译器编译成字节码，而不是编译成与某个特定的处理器硬件平台对应的指令代码（比如，Intel的Pentium微处理器或IBM的System/390处理器）。字节码是可以发送给任何平台并且能在那个平台上运行的独立于平台的代码。
* JIT编译器是JVM的核心。它对于程序性能的影响最大。
* CPU只能执行汇编代码或者二进制代码，所有程序都需要被翻译成它们，然后才能被CPU执行。
* C++以及Fortran这类编译型语言都会通过一个静态的编译器将程序编译成CPU相关的二进制代码。
* PHP以及Perl这列语言则是解释型语言，只需要安装正确的解释器，它们就能运行在任何CPU之上。当程序被执行的时候，程序代码会被逐行解释并执行。
* 编译型语言的优缺点：
    * 速度快：因为在编译的时候它们能够获取到更多的有关程序结构的信息，从而有机会对它们进行优化。
    * 适用性差：它们编译得到的二进制代码往往是CPU相关的，在需要适配多种CPU时，可能需要编译多次。
* 解释型语言的优缺点：
    * 适应性强：只需要安装正确的解释器，程序在任何CPU上都能够被运行
    * 速度慢：因为程序需要被逐行翻译，导致速度变慢。同时因为缺乏编译这一过程，执行代码不能通过编译器进行优化。
* Java的做法是找到编译型语言和解释性语言的一个中间点：
    * Java代码会被编译：被编译成Java字节码，而不是针对某种CPU的二进制代码。
    * Java代码会被解释：Java字节码需要被java程序解释执行，此时，Java字节码被翻译成CPU相关的二进制代码。
    * JIT编译器的作用：在程序运行期间，将Java字节码编译成平台相关的二进制代码。正因为此编译行为发生在程序运行期间，所以该编译器被称为Just-In-Time编译器。
* HotSpot VM名字也体现了JIT编译器的工作方式。在VM开始运行一段代码时，并不会立即对它们进行编译。在程序中，总有那么一些“热点”区域，该区域的代码会被反复的执行。而JIT编译器只会编译这些“热点”区域的代码。这么做的原因在于：
    * 编译那些只会被运行一次的代码性价比太低，直接解释执行Java字节码反而更快。
    * JVM在执行这些代码的时候，能获取到这些代码的信息，一段代码被执行的次数越多，JVM也对它们愈加熟悉，因此能够在对它们进行编译的时候做出一些优化。
    * 一个例子是：当在解释执行
        b = obj.equals(otherObj)
        的时候，需要查询该equals方法定义在哪个类型上，因为equals方法可能存在于继承树上的任意一个类。如果这段代码被会执行很多次，那么查询操作会耗费很多时间。而在JVM运行这段代码的时候，也许会发现equals方法定义在String类型上，那么当JIT编译器编译这段代码的时候，就会直接调用String类型上的equals方法(当然，在JIT编译得到的代码中，也会考虑到当obj的引用发生变化的时候，需要再次进行查询)。此时，这段代码会在两个方面被优化：
        * 由解释执行转换为编译执行
        * 跳过了方法查询阶段(直接调用String的equals方法)

**客户端版或服务器版**
一般只需要选择是使用客户端版或者服务器版的JIT编译器即可。
* 客户端版的JIT编译器使用：
    * -client
* 指定，服务器版的使用：
    * -server
* 选择哪种类型一般和硬件的配置相关，当然随着硬件的发展，也没有一个确定的标准哪种硬件适合哪种配置。
* 两种JIT编译器的区别：
    * Client版对于代码的编译早于Server版，也意味着代码的执行速度在程序执行早期Client版更快。
    * Server版对代码的编译会稍晚一些，这是为了获取到程序本身的更多信息，以便编译得到优化程度更高的代码。因为运行在Server上的程序通常都会持续很久。
* Tiered编译的原理：
    * XX:+TieredCompilation
    * JVM启动之初使用Client版JIT编译器
    * 当HotSpot形成之后使用Server版JIT编译器再次编译
* 在Java 8中，默认使用Tiered编译方式。



### 29.3.2. JVM内存模型
<a href="#menu" style="float:right">目录</a>
![](https://img2018.cnblogs.com/blog/163758/201811/163758-20181101131229284-1189515543.png)

### 29.3.3. JVM的内存空间
* 堆内存
    * 新生代
        * Eden区
        * From Survivor区
        * To Survivor区
    * 老年代
* 方法区
* 栈内存(线程私有)
    * java虚拟机栈
    * 本地方法栈
* 程序计数器（线程私有）



* **堆内存（Heap）**
    * 对于大多数应用来说，Java 堆（Java Heap）是Java 虚拟机所管理的内存中最大的一块。Java 堆是被所有线程共享的一块内存区域，在虚拟机启动时创建。
    * 此内存区域的唯一目的就是存放对象实例，几乎所有的对象实例都在这里分配内存。
    * 堆内存是所有线程共有的，可以分为两个部分：年轻代和老年代。
    * 下图中的Perm代表的是永久代，但是注意永久代并不属于堆内存中的一部分，同时jdk1.8之后永久代已经被移除。
![](https://img2018.cnblogs.com/blog/163758/201811/163758-20181101131302208-1666214046.png)
    * 新生代 ( Young ) 与老年代 ( Old ) 的比例的值为 1:2 ( 该值可以通过参数 –XX:NewRatio 来指定 )
    * 默认的，Eden : from : to = 8 : 1 : 1 ( 可以通过参数 –XX:SurvivorRatio 来设定 )，即： Eden = 8/10 的新生代空间大小，from = to = 1/10 的新生代空间大小。

* **方法区（Method Area）**
    * 方法区也称"永久代"，它用于存储虚拟机加载的类信息、常量、静态变量、是各个线程共享的内存区域。
    * 在JDK8之前的HotSpot JVM，存放这些”永久的”的区域叫做“永久代(permanent generation)”。永久代是一片连续的堆空间，在JVM启动之前通过在命令行设置参数-XX:MaxPermSize来设定永久代最大可分配的内存空间，默认大小是64M（64位JVM默认是85M）。
    * 随着JDK8的到来，JVM不再有 永久代(PermGen)。但类的元数据信息（metadata）还在，只不过不再是存储在连续的堆空间上，而是移动到叫做“Metaspace”的本地内存（Native memory。
    * 方法区是一种规范，永久代和元空间只是实现方式
    * 由于永久代使用应用内存，很可能导致OOM，因此更换为元空间，可以无限制使用本地内存
* **虚拟机栈(JVM Stack)**
    * 描述的是java方法执行的内存模型：每个方法被执行的时候都会创建一个"栈帧",用于存储局部变量表(包括参数)、操作栈、方法出口等信息。每个方法被调用到执行完的过程，就对应着一个栈帧在虚拟机栈中从入栈到出栈的过程。
    * 本地方法栈(Native Stack)
    * 本地方法栈（Native Method Stacks）与虚拟机栈所发挥的作用是非常相似的，其区别不过是虚拟机栈为虚拟机执行Java方法（也就是字节码）服务，而本地方法栈则是为虚拟机使用到的Native方法服务。

* **程序计数器（PC Register）**
    *  程序计数器是用于标识当前线程执行的字节码文件的行号指示器。多线程情况下，每个线程都具有各自独立的程序计数器，所以该区域是非线程共享的内存区域。
    * 当执行java方法时候，计数器中保存的是字节码文件的行号；当执行Native方法时，计数器的值为空。

* **直接内存**
    * 直接内存并不是虚拟机内存的一部分，也不是Java虚拟机规范中定义的内存区域。jdk1.4中新加入的NIO，引入了通道与缓冲区的IO方式，它可以调用Native方法直接分配堆外内存，这个堆外内存就是本机内存，不会影响到堆内存的大小。

* **JVM内存参数设置**             
    * -Xms设置堆的最小空间大小。
    * -Xmx设置堆的最大空间大小。
    * -Xmn:设置年轻代大小
    * -XX:NewSize设置新生代最小空间大小。
    * -XX:MaxNewSize设置新生代最大空间大小。
    * -XX:PermSize设置永久代最小空间大小。
    * -XX:MaxPermSize设置永久代最大空间大小。
    * -Xss设置每个线程的堆栈大小
    * -XX:+UseParallelGC:选择垃圾收集器为并行收集器。此配置仅对年轻代有效。即上述配置下,年轻代使用并发收集,而年老代仍旧使用串行收集。
    * -XX:ParallelGCThreads=20:配置并行收集器的线程数,即:同时多少个线程一起进行垃圾回收。此值最好配置与处理器数目相等。

* 内存泄露
    * 强引用所指向的对象不会被回收，可能导致内存泄漏，虚拟机宁愿抛出OOM也不会去回收他指向的对象
    * 分类
        * 常发性内存泄漏。发生内存泄漏的代码会被多次执行到，每次被执行的时候都会导致一块内存泄漏。 
        * 偶发性内存泄漏。发生内存泄漏的代码只有在某些特定环境或操作过程下才会发生。常发性和偶发性是相对的。对于特定的环境，偶发性的也许就变成了常发性的。所以测试环境和测试方法对检测内存泄漏至关重要。 
        * 一次性内存泄漏。发生内存泄漏的代码只会被执行一次，或者由于算法上的缺陷，导致总会有一块仅且一块内存发生泄漏。比如，在类的构造函数中分配内存，在析构函数中却没有释放该内存，所以内存泄漏只会发生一次。 
        * 隐式内存泄漏。程序在运行过程中不停的分配内存，但是直到结束的时候才释放内存。严格的说这里并没有发生内存泄漏，因为最终程序释放了所有申请的内存。但是对于一个服务器程序，需要运行几天，几周甚至几个月，不及时释放内存也可能导致最终耗尽系统的所有内存。所以，我们称这类内存泄漏为隐式内存泄漏
* 内存溢出
    * 系统已经不能再分配出你所需要的空间
    * 内存泄露将导致内存溢出
    * 内存溢出分析
        * 内存中加载的数据量过于庞大，如一次从数据库取出过多数据； 
        * 集合类中有对对象的引用，使用完后未清空，使得JVM不能回收； 
        * 代码中存在死循环或循环产生过多重复的对象实体； 
        * 使用的第三方软件中的BUG； 
        * 启动参数内存值设定的过小
    * 解决方法
        * 修改JVM启动参数，直接增加内存。(-Xms，-Xmx参数一定不要忘记加。)
        * 检查错误日志，查看“OutOfMemory”错误前是否有其 它异常或错误。        
        * 使用内存查看工具动态查看内存使用情况　
        * 对代码进行走查和分析，找出可能发生内存溢出的位置。
            * 检查对数据库查询中，是否有一次获得全部数据的查询。一般来说，如果一次取十万条记录到内存，就可能引起内存溢出。这个问题比较隐蔽，在上线前，数据库中数据较少，不容易出问题，上线后，数据库中数据多了，一次查询就有可能引起内存溢出。因此对于数据库查询尽量采用分页的方式查询。
            * 检查代码中是否有死循环或递归调用。
            * 检查是否有大循环重复产生新对象实体。
            * 检查对数据库查询中，是否有一次获得全部数据的查询。一般来说，如果一次取十万条记录到内存，就可能引起内存溢出。这个问题比较隐蔽，在上线前，数据库中数据较少，不容易出问题，上线后，数据库中数据多了，一次查询就有可能引起内存溢出。因此对于数据库查询尽量采用分页的方式查询。
            * 检查List、MAP等集合对象是否有使用完后，未清除的问题。List、MAP等集合对象会始终存有对对象的引用，使得这些对象不能被GC回收。 
* 异常
    * OutOfMemoryError
        * 堆内存不足，无法分配新的内存
    * StackOverflowError
        * 递归调用导致方法深度过高
#### 29.3.3.1. 对象内存布局
* HotSpot对象头
    * 用于存储对象自身运行时数据
    * 类型指针，即对象指向类元数据的指针
        * 通过这个指针确定对象是哪个类的实例
        * 如果Java对象是一个Java数组，那么对象头中还必须有一块用于记录数组长度的数据

HotSpot对象头 Mark Word

|存储内容|标志位|状态|
|---|---|---|
|对象哈希码，对象分代年龄|01|未锁定|
|指向锁记录的指针|00|轻量级锁定|
|指向重量级锁的指针|10|膨胀(重量级锁定)|
|空，不需要记录信息|11|GC标志|
|偏向线程ID，偏向时间戳，对象分代年龄 |01|可偏向|

Mark Word有32bit,25bit对象哈希码，4bit存储对象分代年龄，2bit用于存储锁标志位，1bit固定为0。

#### 29.3.3.2. 对象访问定位

* 句柄访问
    * 使用句柄访问方式，java堆将会划分出来一部分内存去来作为句柄池，reference中存储的就是对象的句柄地址。而句柄中则包含对象实例数据的地址和对象类型数据（如对象的类型，实现的接口、方法、父类、field等）的具体地址信息。
    * 使用句柄访最大的好处是reference中存储着稳定的句柄地址，当对象移动之后（垃圾收集时移动对象是非常普遍的行为），只需要改变句柄中的对象实例地址即可，reference不用修改。
* 直接指针访问(hotspot使用)
    * 如果使用指针访问，那么java堆对象的布局中就必须考虑如何放置访问类型的相关信息（如对象的类型，实现的接口、方法、父类、field等），而reference中存储的就是对象的地址。
    * 使用指针访问的好处是访问速度快，它减少了一次指针定位的时间开销，由于java是面向对象的语言，在开发中java对象的访问非常的频繁，因此这类开销积少成多也是非常可观的，反之则提升访问速度。

### 29.3.4. 垃圾回收算法
<a href="#menu" style="float:right">目录</a>

#### 29.3.4.1. 对象回收判定

**引用计数法**
* 给对象添加一个引用计数器，引用一次则计数器+1,引用失效计数器-1，当计数器为0的时候，说明没有地方引用，垃圾收集器可以将它进行回收
* 缺点：无法解决循环引用

**可达性分析算法**
* 以GC ROOTS为起始点，从这些节点开始向下搜索，搜索所走过的路径称为引用链，当一个对象到GC ROOTS没有引用链相连时，说明不可达，也说明没有任何引用。
* GC Roots对象
    * 虚拟机栈中引用的对象
    * 方法区中类静态对象引用的对象
    * 方法区中常量引用的对象
    * 本地方法栈中引用的对象

#### 29.3.4.2. 对象引用分类
**强引用**
* Object obj = new Object();
* 只要强引用存在，就不会被垃圾回收
* 对于Map,List中存放的对象是强引用，因此一般通过虚引用和弱引用来缓存数据

**软引用**
* 通过SoftReference来实现 
* 内存不足时才会回收，回收之后内存不足将抛出OOM异常
* 可以通过get来获取对象实例
* 用于缓存热数据

**弱引用**
* 通过WeakReference来实现
* 只要发生垃圾回收，将会被回收
* 可以通过get来获取对象实例
* 用于缓存冷数据

**虚引用**
* 通过PhantomReference来实现
* 无法通过虚引用来获取对象的实例
* 虚引用和前面的软引用、弱引用不同，它并不影响对象的生命周期
* 如果一个对象与虚引用关联，则跟没有引用与之关联一样，在任何时候都可能被垃圾回收器回收。
* 虚引用必须和引用队列关联使用，当垃圾回收器准备回收一个对象时，如果发现它还有虚引用，就会把这个虚引用加入到与之 关联的引用队列中

#### 29.3.4.3. 标记清除算法
* 先标记可回收的对象空间，在标记完成之后进行统一的回收
* 缺点
    * 效率问题，标记和清除两个过程的效率都不高
    * 空间问题，清除后将产生内存碎片，不利于二次使用

#### 29.3.4.4. 复制算法
* 内存按容量分为两个区块，每次只使用一个区块用于内存分配
* 垃圾回收时，将存活的对象复制到另一个区块，按顺序存放
* 复制完成后，一次性清理之前的区块
* 新创建对象将在另一个区块中分配
* 优点
    * 不产生碎片内存
* 缺点
    * 空间利用率不高，每次只能有一块区域分配内存。
    * 复制效率不高

#### 29.3.4.5. 标记整理算法
* 标记对象，然后让存活的对象往一边移动，最后一次性清理掉端边界以外的内存。

#### 29.3.4.6. 分代收集算法
* 将内存分为老年代和新生代
* 新创建的对象在新生代进行内存分配，经过多次垃圾回收之后仍然存活的对象将被放到老年代
* 新生代的对象一般生命周期短，大部分都会被回收掉，因此每次垃圾收集只有很少的对象存活，因此使用复制算法效率比较高
* 老年代的对象经过多次回收仍然存活，说明生命周期长，不容易被回收。因此每次垃圾回收只有少量的对象被回收，因此使用标记清除/标记整理算法效率比较高。


### 29.3.5. 垃圾收集器
<a href="#menu" style="float:right">目录</a>

* HotSpot虚拟机的垃圾收集器
    * 年轻代
        * Serial收集器
        * ParNew收集器
        * Parallel Scavenge收集器
        * G1收集器
    * 老年代
        * CMS收集器
        * Serial Old收集器
        * Parallel Old收集器
        * G1收集器

* 并发和并行
    * 并发:多条垃圾收集线程并行工作，此时用户线程处于等待状态
    * 并发:用户线程和垃圾收集线程同时进行，此时用户线程也可以工作，垃圾收集线程在另一个CPU工作
* stop the world
    * 由于执行垃圾回收，用户线程无法执行，将会导致不可预知的错误，比如响应缓慢，任务超时等
    * 垃圾收集器应当尽量避免发生这种情况
    
#### 29.3.5.1. Serial收集器
<a href="#menu" style="float:right">目录</a>
* 进行垃圾收集时，将会暂停其他工作线程，直到回收完成
* 这将导致出现"stop the world"问题，应用代码会发生不可预知的问题
* 桌面应用场景，分配内存不多，可以使用该垃圾收集器
* client 模式中比较好的选择

#### 29.3.5.2. ParNew收集器
<a href="#menu" style="float:right">目录</a>

* Serial收集器的多线程版本
* Server环境下比较好的新生代收集器
* 与CMS(老年代收集器)很好的配合
* 单CPU环境下，由于存在线程切换，因此效率可能会比Serial收集器低
* 参数配置
    * 配置-XX:+UseConcMarkSweepGC将默认新生代使用ParNew收集器
    * 也可以通过 -XX:+UseParNewGC进行配置
    * 通过-XX：ParallelGCThreads限制线程数


#### 29.3.5.3. Parallel Scavenge收集器
<a href="#menu" style="float:right">目录</a>

* 使用复制算法和多线程方式实现
* 目标是达到一个可控制的吞吐量，吞吐量=用户运行代码时间/(用户运行代码时间+垃圾收集时间)
* 参数配置
    * 控制垃圾收集最大停顿时间，-XX:MaxGCPauseMillis
        * 设置过小，将发生频繁的垃圾收集行为，因为每次只能收集很少的一部分，导致吞吐量降低
    * 设置吞吐量大小:-XX:GCTimeRation (0-100)
        


#### 29.3.5.4. Serial Old收集器
<a href="#menu" style="float:right">目录</a>

* 老年代单线程收集算法，使用标记整理
* 将会发生stop the world 问题

#### 29.3.5.5. Parallel Old收集器
<a href="#menu" style="float:right">目录</a>

* Parallel Scavenge收集器的老年代版本
* 使用标记整理算法

#### 29.3.5.6. CMS收集器
<a href="#menu" style="float:right">目录</a>

* 以获取最短停顿时间为目标的收集器，能够给用户带来更好的响应速度
* 标记清除算法
* 垃圾收集过程
    * 初始标记
        * 需要 stop the world
        * 标记GC Roots能之间关联到的对象 
    * 并发标记
        * 需要 stop the world
        * 进行GC Roots Tracing 的过程
    * 重新标记
        * 修正并发标记期间由于用户线程工作而产生标记变动的那一部分对象的标记记录
        * 停顿时间比初始标记时间长，比并发标记时间短很多
    * 并发清除
* 问题
    * 对CPU资源敏感
    * 无法处理浮动垃圾（Floating Garbage）,可能出现Concurrent Mode Failure失败而导致另一次Fullgc.
    * 使用标记清除算法，会产生比较多的垃圾碎片
        * 碎片过多，老年代没有空间分配，将会触发FULL GC。
        * -XX:UseCMSCompactAtFullCollection（默认开启）
            * FullGC时同时进行内存碎片整理，同时将导致停顿时间变长
        * -XX:CMSFullGCsBeforeCompaction
            * 执行多少次FullGC后才会进行内存碎片整理，默认为0  


#### 29.3.5.7. G1收集器
<a href="#menu" style="float:right">目录</a>

* JDK7+ 默认的垃圾收集器
* 场景
    * 垃圾收集线程和应用线程并发执行，和CMS一样
    * 空闲内存压缩时避免冗长的暂停时间
    * 应用需要更多可预测的GC暂停时间
    * 不希望牺牲太多的吞吐性能
    * 不需要很大的Java堆
* 特点
    * 并行和并发
        * 充分利用多核来缩短stop the world时间
    * 分代收集
    * 空间整合
        * 从整体看是标记-整理算法，从局部看是基于复制算法
        * 收集后不产生内存碎片
    * 可预测的停顿
        * 让使用者指定Mms的时间片段内，垃圾收集的时间不超过Mms.

**内存结构**
* 以往的垃圾回收算法，如CMS，使用的堆内存结构如下：
![](https://upload-images.jianshu.io/upload_images/2184951-f6a73e5ef608cfa8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1000/format/webp)
* 新生代：eden space + 2个survivor
* 老年代：old space
* 持久代：1.8之前的perm space
* 元空间：1.8之后的metaspace
这些space必须是地址连续的空间。

* 在G1算法中，采用了另外一种完全不同的方式组织堆内存，堆内存被划分为多个大小相等的内存块（Region），每个Region是逻辑连续的一段内存，结构如下：
![](https://upload-images.jianshu.io/upload_images/2184951-715388c6f6799bd9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1000/format/webp)
* 每个Region被标记了E、S、O和H，说明每个Region在运行时都充当了一种角色，其中H是以往算法中没有的，它代表Humongous，这表示这些Region存储的是巨型对象（humongous object，H-obj），当新建对象大小超过Region大小一半时，直接在新的一个或多个连续Region中分配，并标记为H。

**Region**
堆内存中一个Region的大小可以通过-XX:G1HeapRegionSize参数指定，大小区间只能是1M、2M、4M、8M、16M和32M，总之是2的幂次方，如果G1HeapRegionSize为默认值，则在堆初始化时计算Region的实践大小，具体实现如下：
![](https://upload-images.jianshu.io/upload_images/2184951-c6194652e3232be2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1000/format/webp)

默认把堆内存按照2048份均分，最后得到一个合理的大小。

**GC模式**

G1中提供了三种模式垃圾回收模式，young gc、mixed gc 和 full gc，在不同的条件下被触发。

**young gc**
发生在年轻代的GC算法，一般对象（除了巨型对象）都是在eden region中分配内存，当所有eden region被耗尽无法申请内存时，就会触发一次young gc，这种触发机制和之前的young gc差不多，执行完一次young gc，活跃对象会被拷贝到survivor region或者晋升到old region中，空闲的region会被放入空闲列表中，等待下次被使用。



|参数|含义
|---|---|
|-XX:MaxGCPauseMillis|设置G1收集过程目标时间，默认值200ms
|-XX:G1NewSizePercent|新生代最小值，默认值5%
|-XX:G1MaxNewSizePercent|新生代最大值，默认值60%

**mixed gc**
当越来越多的对象晋升到老年代old region时，为了避免堆内存被耗尽，虚拟机会触发一个混合的垃圾收集器，即mixed gc，该算法并不是一个old gc，除了回收整个young region，还会回收一部分的old region，这里需要注意：是一部分老年代，而不是全部老年代，可以选择哪些old region进行收集，从而可以对垃圾回收的耗时时间进行控制。
那么mixed gc什么时候被触发？
先回顾一下cms的触发机制，如果添加了以下参数：
-XX:CMSInitiatingOccupancyFraction=80 
-XX:+UseCMSInitiatingOccupancyOnly

当老年代的使用率达到80%时，就会触发一次cms gc。相对的，mixed gc中也有一个阈值参数 -XX:InitiatingHeapOccupancyPercent，当老年代大小占整个堆大小百分比达到该阈值时，会触发一次mixed gc.
mixed gc的执行过程有点类似cms，主要分为以下几个步骤：

initial mark: 初始标记过程，整个过程STW，标记了从GC Root可达的对象
concurrent marking: 并发标记过程，整个过程gc collector线程与应用线程可以并行执行，标记出GC Root可达对象衍生出去的存活对象，并收集各个Region的存活对象信息
remark: 最终标记过程，整个过程STW，标记出那些在并发标记过程中遗漏的，或者内部引用发生变化的对象
clean up: 垃圾清除过程，如果发现一个Region中没有存活对象，则把该Region加入到空闲列表中

**full gc**
如果对象内存分配速度过快，mixed gc来不及回收，导致老年代被填满，就会触发一次full gc，G1的full gc算法就是单线程执行的serial old gc，会导致异常长时间的暂停时间，需要进行不断的调优，尽可能的避免full gc.

### 29.3.6. 内存分配和回收策略
<a href="#menu" style="float:right">目录</a>

* 大多数情况下，对象优先在Eden区中分配，当Eden中没有足够空间，虚拟机将发生一次minor GC.
* 大对象（需要大量连续内存空间的Java对象，比如长字符串和数组）直接进入老年代
* 长期存活的对象将进入老年代
    * 虚拟机给每一个对象定义了一个Age年龄计数器，每经过一次Minor GC.年龄增加1,超过阈值将被移动到老年代，默认是15岁。
* 动态对象年龄判定
    * 如果Survivor空间中相同年龄的对象大小的总和大于Survivor空间中总和的一半，则年龄大于或者和等于该年龄的对象则直接进入老年代，不受上面年龄阈值的限制
* 空间分配担保
    * 为什么要进行老年代担保
        * Minor GC最差的情况就是垃圾收集完所有的对象都存活，此时将超过 survivor空间，导致这些对象进入老年代，最终可能导致OOM
    * 在Minor GC之前，虚拟机会先检查老年代最大可用的连续空间是否大于新生代所有对象的空间。
        * 如果成立，那么Minor GC就确认是安全的
        * 如果不成立，那么Minor GC就是不安全的
            * 检查HandlerPromotionFailure是否允许担保失败
                * 如果允许，继续检查老年代最大的连续空间是否大于历次晋升到老年代对象的平均大小，如果大于，则进行Monor GC,尽管存在风险。
                * 如果不允许，那么则进行一次Full GC
                



### 29.3.7. JVM相关参数介绍
<a href="#menu" style="float:right">目录</a>

除少数例外外，大多数参数都是以下格式
* 布尔标志
    * -XX：+FlagName 标识开启
    * -XX：-FlagName 标识关闭
* 属性参数
    * -XX:FlagName=xxx

**内存管理参数**
|参数|默认值|说明 |
|---|---|---|

**即时编译参数**
|参数|默认值|说明 |
|---|---|---|

**类型加载参数**
|参数|默认值|说明 |
|---|---|---|

**多线程相关参数**
|参数|默认值|说明 |
|---|---|---|

**性能参数**
|参数|默认值|说明 |
|---|---|---|

**调试参数**
|参数|默认值|说明 |
|---|---|---|


### 29.3.8. 性能监控与故障处理工具
<a href="#menu" style="float:right">目录</a>

#### 29.3.8.1. JDK命令行工具
<a href="#menu" style="float:right">目录</a>

**javap**
* 反编译工具,可用来查看java编译器生成的字节码
    * -help 帮助
    * -l 输出行和变量的表
    * -public 只输出public方法和域
    * -protected 只输出public和protected类和成员
    * -package 只输出包，public和protected类和成员，这是默认的
    * -p -private 输出所有类和成员
    * -s 输出内部类型签名
    * -c 输出分解后的代码，例如，类中每一个方法内，包含java字节码的指令
    * -verbose 输出栈大小，方法参数的个数
    * -constants 输出静态final常量
    
**jps**
* 虚拟机进程状况工具

```
usage: jps [-help]
       jps [-q] [-m | -l|-v|-V] [<hostid>]

Definitions:
    <hostid>:      <hostname>[:<port>]
    
```

**jstat**
* 虚拟机统计信息监视工具
```
Usage: jstat -help|-options
       jstat -<option> [-t] [-h<lines>] <vmid> [<interval> [<count>]]

Definitions:
  <option>      An option reported by the -options option
  <vmid>        Virtual Machine Identifier. A vmid takes the following form:
                     <lvmid>[@<hostname>[:<port>]]
                Where <lvmid> is the local vm identifier for the target
                Java virtual machine, typically a process id; <hostname> is
                the name of the host running the target Java virtual machine;
                and <port> is the port number for the rmiregistry on the
                target host. See the jvmstat documentation for a more complete
                description of the Virtual Machine Identifier.
  <lines>       Number of samples between header lines.
  <interval>    Sampling interval. The following forms are allowed:
                    <n>["ms"|"s"]
                Where <n> is an integer and the suffix specifies the units as 
                milliseconds("ms") or seconds("s"). The default units are "ms".
  <count>       Number of samples to take before terminating.
  -J<flag>      Pass <flag> directly to the runtime system.
```
**jinfo**
* Java配置信息工具类
```
Usage:
    jinfo [option] <pid>
        (to connect to running process)
    jinfo [option] <executable <core>
        (to connect to a core file)
    jinfo [option] [server_id@]<remote server IP or hostname>
        (to connect to remote debug server)

where <option> is one of:
    -flag <name>         to print the value of the named VM flag
    -flag [+|-]<name>    to enable or disable the named VM flag
    -flag <name>=<value> to set the named VM flag to the given value
    -flags               to print VM flags
    -sysprops            to print Java system properties
    <no option>          to print both of the above
    -h | -help           to print this help message

```
**jmap**
Java内存映像工具
```
Usage:
    jmap [option] <pid>
        (to connect to running process)
    jmap [option] <executable <core>
        (to connect to a core file)
    jmap [option] [server_id@]<remote server IP or hostname>
        (to connect to remote debug server)

where <option> is one of:
    <none>               to print same info as Solaris pmap
    -heap                to print java heap summary
    -histo[:live]        to print histogram of java object heap; if the "live"
                         suboption is specified, only count live objects
    -clstats             to print class loader statistics
    -finalizerinfo       to print information on objects awaiting finalization
    -dump:<dump-options> to dump java heap in hprof binary format
                         dump-options:
                           live         dump only live objects; if not specified,
                                        all objects in the heap are dumped.
                           format=b     binary format
                           file=<file>  dump heap to <file>
                         Example: jmap -dump:live,format=b,file=heap.bin <pid>
    -F                   force. Use with -dump:<dump-options> <pid> or -histo
                         to force a heap dump or histogram when <pid> does not
                         respond. The "live" suboption is not supported
                         in this mode.
    -h | -help           to print this help message
    -J<flag>             to pass <flag> directly to the runtime system


```
**jhat**
* 虚拟机堆转储快照分析工具
```
Usage:  jhat [-stack <bool>] [-refs <bool>] [-port <port>] [-baseline <file>] [-debug <int>] [-version] [-h|-help] <file>

	-J<flag>          Pass <flag> directly to the runtime system. For
			  example, -J-mx512m to use a maximum heap size of 512MB
	-stack false:     Turn off tracking object allocation call stack.
	-refs false:      Turn off tracking of references to objects
	-port <port>:     Set the port for the HTTP server.  Defaults to 7000
	-exclude <file>:  Specify a file that lists data members that should
			  be excluded from the reachableFrom query.
	-baseline <file>: Specify a baseline object dump.  Objects in
			  both heap dumps with the same ID and same class will
			  be marked as not being "new".
	-debug <int>:     Set debug level.
			    0:  No debug output
			    1:  Debug hprof file parsing
			    2:  Debug hprof file parsing, no server
	-version          Report version number
	-h|-help          Print this help and exit
	<file>            The file to read

For a dump file that contains multiple heap dumps,
you may specify which dump in the file
by appending "#<number>" to the file name, i.e. "foo.hprof#3".

All boolean options default to "true"

```
**jstack**
* Java堆栈跟踪工具
```
Usage:
    jstack [-l] <pid>
        (to connect to running process)
    jstack -F [-m] [-l] <pid>
        (to connect to a hung process)
    jstack [-m] [-l] <executable> <core>
        (to connect to a core file)
    jstack [-m] [-l] [server_id@]<remote server IP or hostname>
        (to connect to a remote debug server)

Options:
    -F  to force a thread dump. Use when jstack <pid> does not respond (process is hung)
    -m  to print both java and native frames (mixed mode)
    -l  long listing. Prints additional information about locks
    -h or -help to print this help message


```
****


#### 29.3.8.2. Jdk可视化工具
<a href="#menu" style="float:right">目录</a>

* JConsole
* JVisualVM
![](https://github.com/lgjlife/Java-Study/blob/master/pic/jvm/monitor.png?raw=true)
![](https://github.com/lgjlife/Java-Study/blob/master/pic/jvm/thread.png?raw=true)
![](https://github.com/lgjlife/Java-Study/blob/master/pic/jvm/gc.png?raw=true)
### 29.3.9. JVM性能调优

### 29.3.10. 类文件结构

### 29.3.11. 类加载器



<h1>高并发</h1>


<span id="menu"></span>




# 30. 概述
<a href="#menu" style="float:right">目录</a>

## 30.1. 高并发原则
* 无状态
    * 应用无状态，可以方便的进行集群扩展
    * 应用的配置从配置文件中读取，或者从配置中心读取
* 拆分
    * 服务垂直拆分，合理利用计算机资源
    * 降低某个模块出现故障导致其他模块无法使用的问题
    * 拆分原则
        * 系统维度，按照业务进行拆分，比如用户服务，积分服务
        * 功能维度，系统维度拆分之后再进行进一步按照功能进行拆分,比如积分分为领取系统，消费积分系统
        * 读写维度，按照读写差异进行拆分、读写分离
        * 模块维度，比如MVC架构
* 服务化
    * 系统拆分之后的微服务化
* 消息队列
    * 服务解耦
    * 异步处理
    * 流量消峰
* 数据异构
    * 分库分表
* 缓存
    * 客户端缓存
    * 代理缓存
    * 广域网缓存
        * CDN
        * 镜像服务器
        * P2P技术
    * 进程缓存
    * 分布式缓存
* 并发化
    * 多线程处理
## 30.2. 高可用原则
<a href="#menu" style="float:right">目录</a>

* 降级
    * 降级为在高并发下，将某些应用或者某些功能暂停使用，减少对资源的争抢，保障系统可用
    * 降级处理
        * 开关集中化，可以通过服务配置中心进行降级操作
        * 可降级的多级读服务，比如降级为只读本地缓存，只读分布式缓存
        * 开关前置化，比如并发流量大时，在Nginx处进行限流
        * 业务降级
            * 不重要的业务暂停工作
            * 同步调用改异步调用，保证数据最终一致即可
* 限流
    * 防止恶意请求流量，恶意攻击，防止流量超出系统峰值。
    * 恶意请求流量只访问到cache
    * 对于穿透到后端的可以考虑Nginx的Limit模块处理
    * 对于恶意IP可以使用nginx deny进行屏蔽
    
* 切流量
    * 机房挂了或者某台服务器挂了需要切流量
    * DNS:切换机房入口
    * HttpsDNS,在客户端分配好流量入口，绕过运营商的LocalDNS,并实现更精准流量调度
    * LVS/HAProxy:切换故障的Nginx接入层
    * Nginx:切换故障的应用层
* 可回滚
    * 版本回滚，新版本上线出现问题，可以回滚到之前的版本
* 集群部署，负载均衡，避免单点故障
    * 硬件负载均衡
    * 软件负载均衡
* 设计可容错的系统
    * 当某个服务不可用时，请求该服务应当有容错处理，避免频繁地重试。或者阻塞等待。造成系统线程武无限增长，最后宕积
* 限制使用资源
    * 比如使用堆内存时，应当限制最大内存限值，避免无限制的使用造成频繁地GC
    * 线程以及线程池中的无限队列不合适使用都有可能造成内存溢出
    * 循环使用也有可能出现CPU飙升
    * 限制网络的使用， 频繁地建立连接和关闭连接非常地耗性能,可以使用长连接或者连接池
* 热备
* 使用多机房
    
# 31. 负载均衡
<a href="#menu" style="float:right">目录</a>

## 31.1. 什么是负载均衡
　互联网早期，业务流量比较小并且业务逻辑比较简单，单台服务器便可以满足基本的需求；但随着互联网的发展，业务流量越来越大并且业务逻辑也越来越复杂，单台机器的性能问题以及单点问题凸显了出来，因此需要多台机器来进行性能的水平扩展以及避免单点故障。但是要如何将不同的用户的流量分发到不同的服务器上面呢？

　 早期的方法是使用DNS做负载，通过给客户端解析不同的IP地址，让客户端的流量直接到达各个服务器。但是这种方法有一个很大的缺点就是延时性问题，在做出调度策略改变以后，由于DNS各级节点的缓存并不会及时的在客户端生效，而且DNS负载的调度策略比较简单，无法满足业务需求，因此就出现了负载均衡。


　客户端的流量首先会到达负载均衡服务器，由负载均衡服务器通过一定的调度算法将流量分发到不同的应用服务器上面，同时负载均衡服务器也会对应用服务器做周期性的健康检查，当发现故障节点时便动态的将节点从应用服务器集群中剔除，以此来保证应用的高可用。


　负载均衡又分为四层负载均衡和七层负载均衡。四层负载均衡工作在OSI模型的传输层，主要工作是转发，它在接收到客户端的流量以后通过修改数据包的地址信息将流量转发到应用服务器。

　七层负载均衡工作在OSI模型的应用层，因为它需要解析应用层流量，所以七层负载均衡在接到客户端的流量以后，还需要一个完整的TCP/IP协议栈。七层负载均衡会与客户端建立一条完整的连接并将应用层的请求流量解析出来，再按照调度算法选择一个应用服务器，并与应用服务器建立另外一条连接将请求发送过去，因此七层负载均衡的主要工作就是代理。

## 31.2. 硬件负载均衡

硬件负载均衡解决方案是直接在服务器和外部网络间安装负载均衡设备，这种设备我们通常称之为负载均衡器，由于专门的设备完成网络请求转发的任务，独立于操作系统，整体性能高，负载均衡策略多样化，流量管理智能化。

**硬件负载均衡的优缺点是什么？**

* 优点
    * 直接连接交换机,处理网络请求能力强，与系统无关，负载性可以强。可以应用于大量设施、适应大访问量、使用简单。
* 缺点
    * 成本高，配置冗余．即使网络请求分发到服务器集群，负载均衡设施却是单点配置；无法有效掌握服务器及应使用状态.

**使用的注意事项以及应用的场景？**

注意事项，需要注意的是硬件负载均衡技术只专注网络判断，不考虑业务系统与应用使用的情况。有时候系统处理能力已经达到了瓶颈，但是此时网络并没有异常，由于硬件负载均衡并没有察觉到应用服务器的异常，还是让流量继续进入到应用服务器。

**硬件负载均衡器实现哪些功能？**

目前市面上有NetScaler, F5, Radware, Array 等产品，基本实现原理大致相同，我们这里把使用的比较多的 F5做为例子给大家做简单解释，算是窥豹一斑。

**多链路负载均衡**

关键业务都需要安排和配置多条ISP（网络服务供应商）接入链路以保证网络服务的质量。如果某个ISP停止服务或者服务异常了，那么可以利用另一个ISP替代服务，提高了网络的可用性。不同的ISP有不同自治域,因此需要考虑两种情况:INBOUND 和 OUTBOUND。

INBOUND，来自网络的请求信息。F5 分别绑定两个ISP 服务商的公网地址,解析来自两个ISP服务商的DNS解析请求。F5可以根据服务器状况和响应情况对DNS进行发送,也可以通过多条链路分别建立DNS连接。
OUTBOUND，返回给请求者的应答信息。F5可以将流量分配到不同的网络接口，并做源地址的NAT（网络地址转换）,即通过IP地址转换为源请求地址。也可以用接口地址自动映射,保证数据包返回时能够被源头正确接收。

**防火墙负载均衡**

针对大量网络请求的情况单一防火墙的能力就有限了，而且防火墙本身要求数据同进同出，为了解决多防火墙负载均衡的问题，F5提出了防火墙负载均衡的“防火墙三明治"方案

防火墙会对用户会话的双向数据流进行监控，从而确定数据的合法性。如果采取多台防火墙进行负载均衡，有可能会造成同一个用户会话的双向数据在多台防火墙上都进行处理，而单个防火墙上看不到完成用户会话的信息，就会认为数据非法因此抛弃数据。所以在每个防火墙的两端要架设四层交换机，可以在作流量分发的同时，维持用户会话的完整性，使同一用户的会话由一个防火墙来处理。而F5 会协调上述方案的配置和实现，把“交换机”，“防火墙”，“交换机”夹在了一起好像三明治一样。

![](http://5b0988e595225.cdn.sohucs.com/images/20190123/daf62f34338741818adada510f393b91.jpeg)

防火墙“三明治”

**服务器负载均衡**

对于应用服务器服务器可以在F5上配置并且实现负载均衡，F5可以检查服务器的健康状态如果发现故障，将其从负载均衡组中移除。
F5 对于外网而言有一个真实的IP，对于内网的每个服务器都生成一个虚拟IP，进行负载均衡和管理工作。因此,它能够为大量的基于TCP/IP的网络应用提供服务器负载均衡服务。
根据服务类型不同定义不同的服务器群组。
根据不同服务端口将流量导向对应的服务器。甚至可以对VIP用户的请求进行特殊的处理，把这类请求导入到高性能的服务器使VIP客户得到最好的服务响应。
根据用户访问内容的不同将流量导向指定服务器。

* 可用性
    * 自身高可用性，在双机冗余模式下工作时实现毫秒级切换。
    * 设备冗余电源模块可选。
    * 每台设备通过心跳线监控其他设备的电频，发现故障的时候可以完成自动切换。
    * 链路冗余：对链路故障进行实时检测，一旦发现故障进行自动流量切换，过程透明。
    * 服务器冗余：对服务器进行心跳检测，一旦发现故障立即从服务器列表中移除，如果恢复工作又重新加入到服务器列表中。

* 安全性
    * 站点安全防护
    * 拆除空闲连接防止拒绝服务攻击
    * 能够执行源路由跟踪防止IP欺骗
    * 拒绝没有ACK缓冲确认的SYN防止SYN攻击
    * 拒绝teartop和land攻击;保护自己和服务器免受ICMP攻击
* 系统管理
    * 提供浏览器级别管理软件，Web图形用户界面。
    * 总结：对于高并发，高访问量的互联网应用可以考虑加入硬件负载均衡器作为接入层，协助代理层的软件负载均衡器进行负载均衡的工作。硬件负载均衡器的特点是独立于操作系统，处理大访问量，费用高。从功能上来说支持多链路，多服务器，多防火墙的负载均衡，在可用性和安全性上也有良好的表现

## 31.3. 四层和七层负载均衡的区别？
<a href="#menu" style="float:right">目录</a>

### 31.3.1. 技术原理上的区别。
　所谓四层负载均衡，也就是主要通过报文中的目标地址和端口，再加上负载均衡设备设置的服务器选择方式，决定最终选择的内部服务器。

　以常见的TCP为例，负载均衡设备在接收到第一个来自客户端的SYN 请求时，即通过上述方式选择一个最佳的服务器，并对报文中目标IP地址进行修改(改为后端服务器IP），直接转发给该服务器。TCP的连接建立，即三次握手是客户端和服务器直接建立的，负载均衡设备只是起到一个类似路由器的转发动作。在某些部署情况下，为保证服务器回包可以正确返回给负载均衡设备，在转发报文的同时可能还会对报文原来的源地址进行修改。

　所谓七层负载均衡，也称为“内容交换”，也就是主要通过报文中的真正有意义的应用层内容，再加上负载均衡设备设置的服务器选择方式，决定最终选择的内部服务器。

　以常见的TCP为例，负载均衡设备如果要根据真正的应用层内容再选择服务器，只能先代理最终的服务器和客户端建立连接(三次握手)后，才可能接受到客户端发送的真正应用层内容的报文，然后再根据该报文中的特定字段，再加上负载均衡设备设置的服务器选择方式，决定最终选择的内部服务器。
　
　负载均衡设备在这种情况下，更类似于一个代理服务器。负载均衡和前端的客户端以及后端的服务器会分别建立TCP连接。所以从这个技术原理上来看，七层负载均衡明显的对负载均衡设备的要求更高，处理七层的能力也必然会低于四层模式的部署方式。那么，为什么还需要七层负载均衡呢？

### 31.3.2. 应用场景的需求。
　七层应用负载的好处，是使得整个网络更"智能化", 参考我们之前的另外一篇专门针对HTTP应用的优化的介绍，就可以基本上了解这种方式的优势所在。例如访问一个网站的用户流量，可以通过七层的方式，将对图片类的请求转发到特定的图片服务器并可以使用缓存技术；将对文字类的请求可以转发到特定的文字服务器并可以使用压缩技术。

　当然这只是七层应用的一个小案例，从技术原理上，这种方式可以对客户端的请求和服务器的响应进行任意意义上的修改，极大的提升了应用系统在网络层的灵活性。很多在后台，(例如Nginx或者Apache)上部署的功能可以前移到负载均衡设备上，例如客户请求中的Header重写，服务器响应中的关键字过滤或者内容插入等功能。

　另外一个常常被提到功能就是安全性。网络中最常见的SYN Flood攻击，即黑客控制众多源客户端，使用虚假IP地址对同一目标发送SYN攻击，通常这种攻击会大量发送SYN报文，耗尽服务器上的相关资源，以达到Denial of Service(DoS)的目的。

　从技术原理上也可以看出，四层模式下这些SYN攻击都会被转发到后端的服务器上；而七层模式下这些SYN攻击自然在负载均衡设备上就截止，不会影响后台服务器的正常运营。另外负载均衡设备可以在七层层面设定多种策略，过滤特定报文，例如SQL Injection等应用层面的特定攻击手段，从应用层面进一步提高系统整体安全。

　现在的7层负载均衡，主要还是着重于应用广泛的HTTP协议，所以其应用范围主要是众多的网站或者内部信息平台等基于B/S开发的系统。 4层负载均衡则对应其他TCP应用，例如基于C/S开发的ERP等系统。

### 31.3.3. 七层应用需要考虑的问题。
是否真的必要，七层应用的确可以提高流量智能化，同时必不可免的带来设备配置复杂，负载均衡压力增高以及故障排查上的复杂性等问题。在设计系统时需要考虑四层七层同时应用的混杂情况。

是否真的可以提高安全性。例如SYN Flood攻击，七层模式的确将这些流量从服务器屏蔽，但负载均衡设备本身要有强大的抗DDoS能力，否则即使服务器正常而作为中枢调度的负载均衡设备故障也会导致整个应用的崩溃。

是否有足够的灵活度。七层应用的优势是可以让整个应用的流量智能化，但是负载均衡设备需要提供完善的七层功能，满足客户根据不同情况的基于应用的调度。最简单的一个考核就是能否取代后台Nginx或者Apache等服务器上的调度功能。能够提供一个七层应用开发接口的负载均衡设备，可以让客户根据需求任意设定功能，才真正有可能提供强大的灵活性和智能性。

## 31.4. 负载均衡的算法
<a href="#menu" style="float:right">目录</a>

### 31.4.1. 随机算法
* Random随机，按权重设置随机概率。在一个截面上碰撞的概率高，但调用量越大分布越均匀，而且按概率使用权重后也比较均匀，有利于动态调整提供者权重。
* 加权随机

### 31.4.2. 轮询及加权轮询
* 轮询(Round Robbin)当服务器群中各服务器的处理能力相同时，且每笔业务处理量差异不大时，最适合使用这种算法。 轮循，按公约后的权重设置轮循比率。存在慢的提供者累积请求问题，比如：第二台机器很慢，但没挂，当请求调到第二台时就卡在那，久而久之，所有请求都卡在调到第二台上。
* 加权轮询(Weighted Round Robbin)为轮询中的每台服务器附加一定权重的算法。比如服务器1权重1，服务器2权重2，服务器3权重3，则顺序为1-2-2-3-3-3-1-2-2-3-3-3- ......
### 31.4.3. 最小连接及加权最小连接
* 最少连接(Least Connections)在多个服务器中，与处理连接数(会话数)最少的服务器进行通信的算法。即使在每台服务器处理能力各不相同，每笔业务处理量也不相同的情况下，也能够在一定程度上降低服务器的负载。
加权最少连接(Weighted Least Connection)为最少连接算法中的每台服务器附加权重的算法，该算法事先为每台服务器分配处理连接的数量，并将客户端请求转至连接数最少的服务器上。
### 31.4.4. 哈希算法
* 普通哈希
* 一致性哈希一致性Hash，相同参数的请求总是发到同一提供者。当某一台提供者挂时，原本发往该提供者的请求，基于虚拟节点，平摊到其它提供者，不会引起剧烈变动。
### 31.4.5. IP地址散列
* 通过管理发送方IP和目的地IP地址的散列，将来自同一发送方的分组(或发送至同一目的地的分组)统一转发到相同服务器的算法。当客户端有一系列业务需要处理而必须和一个服务器反复通信时，该算法能够以流(会话)为单位，保证来自相同客户端的通信能够一直在同一服务器中进行处理。
### 31.4.6. URL散列
* 通过管理客户端请求URL信息的散列，将发送至相同URL的请求转发至同一服务器的算法。

### 31.4.7. 一致性哈希算法
先构造一个长度为232的整数环（这个环被称为一致性Hash环），根据节点名称的Hash值（其分布为[0, 232-1]）将服务器节点放置在这个Hash环上，然后根据数据的Key值计算得到其Hash值（其分布也为[0, 232-1]），接着在Hash环上顺时针查找距离这个Key值的Hash值最近的服务器节点，完成Key到服务器的映射查找。
一致性hash算法还可以实现一个消费者一直命中一个服务提供者。

如下图，一共有四个服务提供者
provider-1: 127.0.0.1:8001
provider-2: 127.0.5.2:8145
provider-3: 127.0.1.2:8123
provider-4: 127.1.3.2:8256
通过hash计算后，四个节点分布在hash环的不同位置上
当有一个消费者(127.0.0.1:8011)通过hash计算后，定位到如图中所示位置，它会顺时针查找下一个节点，选择第一个查找到的节点。
![](https://img2018.cnblogs.com/blog/1404294/201904/1404294-20190418012355339-761343066.png)

**这里存在几个关键问题：**
* hash算法的影响
如果hash算法计算结果过于集中，如下图，节点分布再很小的范围内，如果消费者大部分命中范围之外，就会导致node1负载异常的大，出现负载不均衡的问题。

所以需要一个比较好的hash算法。
![](https://img2018.cnblogs.com/blog/1404294/201904/1404294-20190418013347849-699391562.png)


解决这个问题的办法是需要选择一个好的hashcode算法,hash算法比较 

* 增加或者删除节点时会导致负载不均衡
如下图：
正常情况下每个节点都是25%的命中概率
节点node2失效时，之前节点2的所有命中全部加到节点３,导致节点3的负载变大
当增加节点5时，之前节点３的命中全部给了节点５,也还是出现了负载不均衡。
![](https://img2018.cnblogs.com/blog/1404294/201904/1404294-20190418014307245-148213017.png)
解决这个问题的办法是增加虚拟节点
如下图，为每个节点都增加了虚拟节点，增加虚拟节点，可以使整个hash环分布的更加均匀，但有个问题是，节点越多，维护的性能越大，因此，需要增加多少个虚拟节点，需要根据实际需要进行测试。
![](https://img2018.cnblogs.com/blog/1404294/201904/1404294-20190418015507692-1757023041.png)

**实现**
虚拟节点的格式为　127.0.0.1:8001&&node1
分别使用jdk 的hashcode算法和FNV1_32_HASH算法进行比较。　.
```java
public class UniformityHashLoadbalanceStrategy  implements  LoadbalanceStrategy{

    private static final int VIRTUAL_NODES = 5;


    public ProviderConfig select(List<ProviderConfig> configs, Object object){

        SortedMap<Integer, ProviderConfig> sortedMap = new TreeMap();

        for(ProviderConfig config:configs){
            for(int j = 0; j < VIRTUAL_NODES; j++){
                sortedMap.put(caculHash(getKey(config.getHost(),config.getPort(),"&&node"+j)),config);
            }
        }

        System.out.println(sortedMap);
        Integer requestHashcCode = caculHash((String)object);


        SortedMap<Integer, ProviderConfig> subMap = sortedMap.subMap(requestHashcCode,Integer.MAX_VALUE);
        ProviderConfig result= null;
        if(subMap.size()  != 0){
            Integer index = subMap.firstKey();
            result =  subMap.get(index);
        }
        else{
            result = sortedMap.get(0);
        }

        ////　打印测试数据

        new PrintResult(sortedMap,requestHashcCode).print();

        /////

        return  result;


    }
    private String getKey(String host,int port,String node){
        return new StringBuilder().append(host).append(":").append(port).append(node).toString();
    }

    private int caculHash(String str){

       /* int hashCode =  str.hashCode();
        hashCode = (hashCode<0)?(-hashCode):hashCode;
        return hashCode;*/

        final int p = 16777619;
        int hash = (int)2166136261L;
        for (int i = 0; i < str.length(); i++)
            hash = (hash ^ str.charAt(i)) * p;
        hash += hash << 13;
        hash ^= hash >> 7;
        hash += hash << 3;
        hash ^= hash >> 17;
        hash += hash << 5;

        // 如果算出来的值为负数则取其绝对值
        if (hash < 0)
            hash = Math.abs(hash);
        return hash;

    }

}
//用于打印测试数据
@Data
class PrintResult{

    private  boolean flag =false;
    private SortedMap<Integer, ProviderConfig> sortedMap;
    private int requestHashcCode;

    public PrintResult(SortedMap<Integer, ProviderConfig> sortedMap, int requestHashcCode) {
        this.sortedMap = sortedMap;
        this.requestHashcCode = requestHashcCode;
    }

    public void print(){

        sortedMap.forEach((k,v)->{

            if( (false == flag) && ( k > requestHashcCode)){
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            }
            System.out.println("hashcode: " + k + "  " + v.getHost()+":"+v.getPort());
            if( (false == flag) && ( k > requestHashcCode)){
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                flag = true;
            }

        });

        System.out.println("------------------请求的hashcode:"+requestHashcCode);

    }
}
```
测试：
```java
public void uniformityHashLoadbalanceStrategyTest(LoadbalanceStrategy strategy ,int configNum){

        List<ProviderConfig> configs = new ArrayList<>();
        for(int i = 0; i< configNum; i++){
            ProviderConfig config = new ProviderConfig();
            config.setInterfaceName("com.serviceImpl");
            config.setHost("127.0.0.1");
            config.setPort(new Random().nextInt(9999));
            config.setWeight(i);
            config.setCallTime(new Random().nextInt(100));
            configs.add(config);
        }

        ProviderConfig config = strategy.select(configs,"127.0.0.1:1234");
        System.out.println("选择结果:" + config.getHost() + ":" + config.getPort());
    }
```
jdk 的　hashcode 算法

```
hashcode: 441720772  127.0.0.1:1280
hashcode: 441720773  127.0.0.1:1280
hashcode: 441720774  127.0.0.1:1280
hashcode: 441720775  127.0.0.1:1280
hashcode: 441720776  127.0.0.1:1280
hashcode: 1307619854  127.0.0.1:3501
hashcode: 1307619855  127.0.0.1:3501
hashcode: 1307619856  127.0.0.1:3501
hashcode: 1307619857  127.0.0.1:3501
hashcode: 1307619858  127.0.0.1:3501
hashcode: 1363372970  127.0.0.1:779
hashcode: 1363372971  127.0.0.1:779
hashcode: 1363372972  127.0.0.1:779
hashcode: 1363372973  127.0.0.1:779
hashcode: 1363372974  127.0.0.1:779
hashcode: 1397780469  127.0.0.1:5928
hashcode: 1397780470  127.0.0.1:5928
hashcode: 1397780471  127.0.0.1:5928
hashcode: 1397780472  127.0.0.1:5928
hashcode: 1397780473  127.0.0.1:5928
hashcode: 1700521830  127.0.0.1:4065
hashcode: 1700521831  127.0.0.1:4065
hashcode: 1700521832  127.0.0.1:4065
hashcode: 1700521833  127.0.0.1:4065
hashcode: 1700521834  127.0.0.1:4065
hashcode: 1774961903  127.0.0.1:5931
hashcode: 1774961904  127.0.0.1:5931
hashcode: 1774961905  127.0.0.1:5931
hashcode: 1774961906  127.0.0.1:5931
hashcode: 1774961907  127.0.0.1:5931
hashcode: 1814135809  127.0.0.1:5050
hashcode: 1814135810  127.0.0.1:5050
hashcode: 1814135811  127.0.0.1:5050
hashcode: 1814135812  127.0.0.1:5050
hashcode: 1814135813  127.0.0.1:5050
hashcode: 1881959435  127.0.0.1:1991
hashcode: 1881959436  127.0.0.1:1991
hashcode: 1881959437  127.0.0.1:1991
hashcode: 1881959438  127.0.0.1:1991
hashcode: 1881959439  127.0.0.1:1991
hashcode: 1889283041  127.0.0.1:4071
hashcode: 1889283042  127.0.0.1:4071
hashcode: 1889283043  127.0.0.1:4071
hashcode: 1889283044  127.0.0.1:4071
hashcode: 1889283045  127.0.0.1:4071
hashcode: 2118931362  127.0.0.1:7152
hashcode: 2118931363  127.0.0.1:7152
hashcode: 2118931364  127.0.0.1:7152
hashcode: 2118931365  127.0.0.1:7152
hashcode: 2118931366  127.0.0.1:7152
------------------请求的hashcode:35943393
选择结果:127.0.0.1:1280
```
 

可以看到ＪＤＫ默认的hashcode方法的问题，各个虚拟节点都是比较集中，会出现很严重的负载不均衡问题。

２.使用　FNV1_32_HASH算法
```
hashcode: 87760808 127.0.0.1:1926
hashcode: 127858684 127.0.0.1:2285
hashcode: 137207685 127.0.0.1:4429
hashcode: 189558739 127.0.0.1:4429
hashcode: 345597173 127.0.0.1:1926
hashcode: 411873143 127.0.0.1:5844
hashcode: 427733007 127.0.0.1:4429
hashcode: 429935214 127.0.0.1:5844
hashcode: 471059330 127.0.0.1:6013
hashcode: 508134701 127.0.0.1:6141
hashcode: 537200659 127.0.0.1:4429
hashcode: 572740331 127.0.0.1:9615
hashcode: 584730561 127.0.0.1:4429
hashcode: 586630909 127.0.0.1:6013
hashcode: 588198036 127.0.0.1:6297
hashcode: 601750027 127.0.0.1:6013
hashcode: 670864146 127.0.0.1:6297
hashcode: 823792818 127.0.0.1:9615
hashcode: 832758991 127.0.0.1:2285
hashcode: 847195135 127.0.0.1:1926
hashcode: 852642706 127.0.0.1:92
hashcode: 855431312 127.0.0.1:1926
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
hashcode: 1008339891 127.0.0.1:6430
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
hashcode: 1126143483 127.0.0.1:9615
hashcode: 1127241369 127.0.0.1:9615
hashcode: 1169946536 127.0.0.1:6297
hashcode: 1184995718 127.0.0.1:92
hashcode: 1204728048 127.0.0.1:5844
hashcode: 1218277576 127.0.0.1:2285
hashcode: 1253667665 127.0.0.1:92
hashcode: 1294893013 127.0.0.1:9615
hashcode: 1334096245 127.0.0.1:2285
hashcode: 1591823392 127.0.0.1:92
hashcode: 1597482385 127.0.0.1:6141
hashcode: 1647613853 127.0.0.1:6430
hashcode: 1653621871 127.0.0.1:6013
hashcode: 1749432497 127.0.0.1:6297
hashcode: 1765516223 127.0.0.1:92
hashcode: 1860173617 127.0.0.1:6430
hashcode: 1883591368 127.0.0.1:2285
hashcode: 1941022162 127.0.0.1:6430
hashcode: 1952262824 127.0.0.1:6141
hashcode: 1991871891 127.0.0.1:1926
hashcode: 2009814649 127.0.0.1:5844
hashcode: 2011432907 127.0.0.1:6297
hashcode: 2020508878 127.0.0.1:6141
hashcode: 2083262842 127.0.0.1:6013
hashcode: 2086348077 127.0.0.1:6141
hashcode: 2107422149 127.0.0.1:6430
hashcode: 2117355968 127.0.0.1:5844
------------------请求的hashcode:986344464
选择结果:127.0.0.1:6430
```
* 总结
    * 随机算法：
        * 好的随机算法可以使选择比较均衡，但还是会出现机器性能差异导致的调用耗时不一样。优点是实现简单。
    * 加权随机算法：
        * 可以根据不同的机器性能调整不同的权重比，从而降低机器性能差异带来的问题。
    * 轮询算法：
        * 可以使每个节点的选中概率一致，但也会出现随机算法的问题。
    * 加权轮询：
        * 可以根据不同的机器性能调整不同的权重比，从而降低机器性能差异带来的问题。
    * 最小时延算法：
        * 根据服务调用耗时动态调整，可以达到比较好的负载均衡。缺点是实现比较复杂。
    * 一致性hash算法：
        * 可以使消费者始终对应一个服务提供者。缺点是实现相对复杂。同时通过优化hashcode算法和增加虚拟节点解决分布不均的问题。

## 31.5. 负载均衡的实现（DNS > 数据链路层 > IP层 > Http层）
<a href="#menu" style="float:right">目录</a>


### 31.5.1. DNS域名解析负载均衡（延迟）
DNS域名解析负载均衡

　利用DNS处理域名解析请求的同时进行负载均衡是另一种常用的方案。在DNS服务器中配置多个A记录，如：www.mysite.com IN A 114.100.80.1、www.mysite.com IN A 114.100.80.2、www.mysite.com IN A 114.100.80.3.
　每次域名解析请求都会根据负载均衡算法计算一个不同的IP地址返回，这样A记录中配置的多个服务器就构成一个集群，并可以实现负载均衡。
　DNS域名解析负载均衡的优点是将负载均衡工作交给DNS，省略掉了网络管理的麻烦，缺点就是DNS可能缓存A记录，不受网站控制。事实上，大型网站总是部分使用DNS域名解析，作为第一级负载均衡手段，然后再在内部做第二级负载均衡。

### 31.5.2. 数据链路层负载均衡(LVS)
数据链路层负载均衡(LVS)

　数据链路层负载均衡是指在通信协议的数据链路层修改mac地址进行负载均衡。
　这种数据传输方式又称作三角传输模式，负载均衡数据分发过程中不修改IP地址，只修改目的的mac地址，通过配置真实物理服务器集群所有机器虚拟IP和负载均衡服务器IP地址一样，从而达到负载均衡，这种负载均衡方式又称为直接路由方式（DR）.
　在上图中，用户请求到达负载均衡服务器后，负载均衡服务器将请求数据的目的mac地址修改为真是WEB服务器的mac地址，并不修改数据包目标IP地址，因此数据可以正常到达目标WEB服务器，该服务器在处理完数据后可以经过网管服务器而不是负载均衡服务器直接到达用户浏览器。
　使用三角传输模式的链路层负载均衡是目前大型网站所使用的最广的一种负载均衡手段。在linux平台上最好的链路层负载均衡开源产品是LVS(linux virtual server)。

### 31.5.3. IP负载均衡(SNAT)
IP负载均衡
　IP负载均衡：即在网络层通过修改请求目标地址进行负载均衡。
　用户请求数据包到达负载均衡服务器后，负载均衡服务器在操作系统内核进行获取网络数据包，根据负载均衡算法计算得到一台真实的WEB服务器地址，然后将数据包的IP地址修改为真实的WEB服务器地址，不需要通过用户进程处理。真实的WEB服务器处理完毕后，相应数据包回到负载均衡服务器，负载均衡服务器再将数据包源地址修改为自身的IP地址发送给用户浏览器。
　这里的关键在于真实WEB服务器相应数据包如何返回给负载均衡服务器，一种是负载均衡服务器在修改目的IP地址的同时修改源地址，将数据包源地址改为自身的IP，即源地址转换（SNAT），另一种方案是将负载均衡服务器同时作为真实物理服务器的网关服务器，这样所有的数据都会到达负载均衡服务器。
　IP负载均衡在内核进程完成数据分发，较反向代理均衡有更好的处理性能。但由于所有请求响应的数据包都需要经过负载均衡服务器，因此负载均衡的网卡带宽成为系统的瓶颈。

### 31.5.4. HTTP重定向负载均衡(少见)
HTTP重定向负载均衡
　HTTP重定向服务器是一台普通的应用服务器，其唯一的功能就是根据用户的HTTP请求计算一台真实的服务器地址，并将真实的服务器地址写入HTTP重定向响应中（响应状态吗302）返回给浏览器，然后浏览器再自动请求真实的服务器。
　这种负载均衡方案的优点是比较简单，缺点是浏览器需要每次请求两次服务器才能拿完成一次访问，性能较差；使用HTTP302响应码重定向，可能是搜索引擎判断为SEO作弊，降低搜索排名。重定向服务器自身的处理能力有可能成为瓶颈。因此这种方案在实际使用中并不见多。

### 31.5.5. 反向代理负载均衡(nginx)
反向代理负载均衡
　传统代理服务器位于浏览器一端，代理浏览器将HTTP请求发送到互联网上。而反向代理服务器则位于网站机房一侧，代理网站web服务器接收http请求。
　反向代理的作用是保护网站安全，所有互联网的请求都必须经过代理服务器，相当于在web服务器和可能的网络攻击之间建立了一个屏障。
　除此之外，代理服务器也可以配置缓存加速web请求。当用户第一次访问静态内容的时候，静态内存就被缓存在反向代理服务器上，这样当其他用户访问该静态内容时，就可以直接从反向代理服务器返回，加速web请求响应速度，减轻web服务器负载压力。
　另外，反向代理服务器也可以实现负载均衡的功能。
反向代理服务器
　由于反向代理服务器转发请求在HTTP协议层面，因此也叫应用层负载均衡。优点是部署简单，缺点是可能成为系统的瓶颈。

# 32. 隔离
<a href="#menu" style="float:right">目录</a>

## 32.1. 概述
* 隔离是将系统或者资源分隔开，系统隔离是为了某个系统发生故障或者业务发生故障时，尽量减少影响面。保证其他服务或者业务能够继续运行。

* 线程隔离
    * 使用线程池，某一个线程出现故障时，不会影响其他线程。
* 进程隔离
* 集群隔离
* 机房隔离
    * 为了提高可用性，进行多机房部署，每个机房都会有自己的服务分组
    * 本机房的服务应该只调用本机房的服务，不进行跨机房调用
    * 当一个机房发生问题时，可以通过DNS负载均衡将请求全部切换到另一个机房，或者考虑服务能够重试其他机房的服务。
* 读写隔离
* 动静隔离
    * 将动态内容和静态资源分离
    * 一般将静态资源放在CDN上
* 爬虫隔离
    * 限流
    * 识别，路由到单独集群
* 热点隔离
    * 比如秒杀服务单独部署
* 资源隔离
    * 磁盘，CPU，网络等会存在竞争
    * 不同需求的应用部署在不同的硬件环境上
* 环境隔离
    * 测试环境，预发布环境，灰度环境，正式环境
* 压测隔离
    * 真实数据，压测数据隔离
    * AB测试，为不同的用户提供不同版本的服务
* 缓存隔离
    * 不同的应用使用不同得到缓存服务器
* 查询隔离
    * 简单，复杂，批量查询分别路由到不同的集群

# 33. 限流
<a href="#menu" style="float:right">目录</a>

## 33.1. 概述
<a href="#menu" style="float:right">目录</a>
* 限流的目的是通过对并发访问的请求进行限速或者对于一定窗口内的请求进行限速，一旦达到系统的限制值就可以拒绝服务(定向错误页，返回错误通知，排队，降级)。
* 可以通过压测来测试系统的处理峰值
* 也可以根据系统的吞吐量，响应时间，可用率来动态调整限流峰值
* 常见的限流策略
    * 限制总并发数
        * 数据库连接出，线程池
    * 限制瞬时并发数
        * Nginx的limit_conn模块
    * 限制时间窗口内的平均速率
        * Guava的RateLimiter ,Nginx的limit_req 
    * 限制远程接口的调用速率
    * 限制MQ的消费速率
    * 还可以根据网络连接数，网络流量，CPU或内存负载等来限流  


## 33.2. 限流算法


### 33.2.1. 计数器法
计数器法是限流算法里最简单也是最容易实现的一种算法。比如我们规定，对于A接口来说，我们1分钟的访问次数不能超过100个。那么我们可以这么做：在一开 始的时候，我们可以设置一个计数器counter，每当一个请求过来的时候，counter就加1，如果counter的值大于100并且该请求与第一个 请求的间隔时间还在1分钟之内，那么说明请求数过多；如果该请求与第一个请求的间隔时间大于1分钟，且counter的值还在限流范围内，那么就重置 counter

### 33.2.2. 滑动窗口
滑动窗口，又称rolling window。为了解决这个问题，我们引入了滑动窗口算法。如果学过TCP网络协议的话，那么一定对滑动窗口这个名词不会陌生。下面这张图，很好地解释了滑动窗口算法：

在上图中，整个红色的矩形框表示一个时间窗口，在我们的例子中，一个时间窗口就是一分钟。然后我们将时间窗口进行划分，比如图中，我们就将滑动窗口 划成了6格，所以每格代表的是10秒钟。每过10秒钟，我们的时间窗口就会往右滑动一格。每一个格子都有自己独立的计数器counter，比如当一个请求 在0:35秒的时候到达，那么0:30~0:39对应的counter就会加1。

那么滑动窗口怎么解决刚才的临界问题的呢？我们可以看上图，0:59到达的100个请求会落在灰色的格子中，而1:00到达的请求会落在橘黄色的格 子中。当时间到达1:00时，我们的窗口会往右移动一格，那么此时时间窗口内的总请求数量一共是200个，超过了限定的100个，所以此时能够检测出来触 发了限流。

我再来回顾一下刚才的计数器算法，我们可以发现，计数器算法其实就是滑动窗口算法。只是它没有对时间窗口做进一步地划分，所以只有1格。

由此可见，当滑动窗口的格子划分的越多，那么滑动窗口的滚动就越平滑，限流的统计就会越精确。

* 计数器 VS 滑动窗口
计数器算法是最简单的算法，可以看成是滑动窗口的低精度实现。滑动窗口由于需要存储多份的计数器（每一个格子存一份），所以滑动窗口在实现上需要更多的存储空间。也就是说，如果滑动窗口的精度越高，需要的存储空间就越大。

### 33.2.3. 漏桶算法
<a href="#menu" style="float:right">目录</a>
<a href="#menu" style="float:right">目录</a>
漏桶(Leaky Bucket)算法思路很简单，水（请求）先进入到漏桶里，漏桶以一定的速度出水（接口有响应速率），当水流入速度过大会直接溢出（访问频率超过接口响应速率），然后就拒绝请求，可以看出漏桶算法能强行限制数据的传输速率。示意图如下：
![](https://img2018.cnblogs.com/blog/1136672/201904/1136672-20190421202927762-1718486905.png)

### 33.2.4. 令牌桶算法
<a href="#menu" style="float:right">目录</a>

令牌桶算法（Token Bucket）和 Leaky Bucket 效果一样但方向相反的算法，更加容易理解。随着时间流逝，系统会按恒定1/QPS时间间隔（如果QPS=100，则间隔是10ms）往桶里加入Token（想象和漏洞漏水相反，有个水龙头在不断的加水），如果桶已经满了就不再加了。新请求来临时，会各自拿走一个Token，如果没有Token可拿了就阻塞或者拒绝服务。示意图如下：
![](https://img2018.cnblogs.com/blog/1136672/201904/1136672-20190421202936084-459487536.jpg)

漏桶算法与令牌桶算法的区别在于，漏桶算法能够强行限制数据的传输速率，令牌桶算法能够在限制数据的平均传输速率的同时还允许某种程度的突发传输。令牌桶的另外一个好处是可以方便的改变速度。 一旦需要提高速率，则按需提高放入桶中的令牌的速率。一般会定时（比如100毫秒）往桶中增加一定数量的令牌, 有些变种算法则实时的计算应该增加的令牌的数量。

## 33.3. 分布式限流
<a href="#menu" style="float:right">目录</a>

# 34. 降级
<a href="#menu" style="float:right">目录</a>
*  降级的最终目的是保证核心服务可用，降级也是要根据系统的吞吐量，响应时间，可用率等条件进行手动降级或者自动降级。
* 降级等级分类
    * 一般
        * 比如服务偶尔因为网络抖动或者服务正在上线而超时，可以自动降级
    * 警告
        * 有些服务在一段时间内成功率有波动，可以自动降级或者人工降级，并发送警告
    * 错误
        * 比如可用率降低，访问量猛增超过系统阈值
    * 严重错误
* 按照自动化分类
    * 自动开关降级
    * 人工降级
* 功能区分
    * 读服务降级
    * 写服务降级
* 系统层次区分
    * 多级降级
* 降级处理
    * 页面降级
    * 页面片段降级
    * 页面异步请求降级
    * 服务功能降级
    * 读降级
    * 服务降级
    * 爬虫降级
    * 风控降级

# 35. 超时与重试
<a href="#menu" style="float:right">目录</a>

# 36. 回滚机制
<a href="#menu" style="float:right">目录</a>

## 36.1. 事务回滚
* 事务回滚是为了防止出现数据不一致的问题。
* 对于单库回滚，数据库支持单库回滚
* 分布式事务方案
    * 强一致性
        * 两阶段提交
        * 三阶段协议
        * 这两种实现回滚难度较低，但是对性能影响较大
    * 最终一致性实现
        * 事务表
        * 消息队列
        * 补偿机制（执行/回滚）
        * TCC模式（预占/确认/消息）
        * Sagas（拆分事务/补偿机制）
## 36.2. 代码库回滚
* Git
* SVN
## 36.3. 部署版本回滚
* 部署版本化
    * 发布时全量发布，避免增量发布（只发布修改过的类），全版本可以直接回滚，不会受到约束或限制。
* 小版本增量发布
* 大版本灰度发布
    * 两个版本同时发布，一些用户访问老版本，一些用户访问新版本
    * 不同版本就是不同的服务，在一套集群内部署
    * 运行一段时间后没问题再全量发布
* 架构升级
    * 在nginx层面慢慢将流量路由到新版本，直到100%
    * 如中间出现故障，可立即切换到旧版本
## 36.4. 静态资源回滚

# 37. 压测与预案
<a href="#menu" style="float:right">目录</a>

一般通过系统压测发现系统瓶颈和问题，然后进行系统优化啊和容灾，进而提升系统的健壮性和处理能力。

* TP=Top Percentile，Top百分数，是一个统计学里的术语，与平均数、中位数都是一类。
    * TP50、TP90和TP99等指标常用于系统性能监控场景，指高于50%、90%、99%等百分线的情况。
    * TP50：指在一个时间段内（如5分钟），统计该方法每次调用所消耗的时间，并将这些时间按从小到大的顺序进行排序，取第50%的那个值作为TP50的值；配置此监控指标对应的报警阀值后，需要保证在这个时间段内该方法所有调用的消耗时间至少有50%的值要小于此阀值，否则系统将会报警
    * TP90，TP99，TP999与TP50值计算方式一致，它们分别代表着对方法的不同性能要求，TP50相对较低，TP90则比较高，TP99，TP999则对方法性能要求很高
    
* 在系统的高可靠性（也称为可用性，英文描述为HA，High Available）里有个衡量其可靠性的标准——X个9，这个X是代表数字3~5。X个9表示在系统1年时间的使用过程中，系统可以正常使用时间与总时间（1年）之比，我们通过下面的计算来感受下X个9在不同级别的可靠性差异。
    * 3个9：(1-99.9%)*365*24=8.76小时，表示该系统在连续运行1年时间里最多可能的业务中断时间是8.76小时。
    * 4个9：(1-99.99%)*365*24=0.876小时=52.6分钟，表示该系统在连续运行1年时间里最多可能的业务中断时间是52.6分钟。
    * 5个9：(1-99.999%)*365*24*60=5.26分钟，表示该系统在连续运行1年时间里最多可能的业务中断时间是5.26分钟
## 37.1. 系统压测
* 压测方案
    * 压测接口
    * 并发量
    * 压测策略(突发,逐步加压,并发量)
* 压测指标
    * 机器负载
    * QPS/TPS
    * 响应时间(平均，最小，最大)
* 压测报告
    * 相关参数以及测试结果
### 37.1.1. 线下压测
* 线下通过Jmeter或者Apache ab压测系统的某个接口，然后进行调优。以达到组件性能最优状态
* 线下压测环境和线上环境(服务器，网络，数据量)和线上完全不一样，因此测试结果只能作为参考

### 37.1.2. 线上压测
* 读写区分
    * 读压测
    * 写压测
    * 混合压测
* 数据仿真度
    * 仿真压测
    * 引流压测
* 是否给用户提供服务
    * 隔离集群压测
    * 线上集群压测
    * 单机压测
* 压测可靠性保证
    * 数据离散化，比如分库分表情况下，避免压测的数据都是路由到同一个数据库
    * 全链路压测，对所有的服务进行压测

## 37.2. 系统优化和容灾
* 很据压测报告进行相应的优化和升级，比如硬件升级，集群扩容，参数优化，代码优化




# 38. 缓存
<a href="#menu" style="float:right">目录</a>
* 缓存命中率
    * 缓存命中的次数/缓存查询次数
    * 命中率越高越好
    * 通过监控该参数确认是否工作良好

## 38.1. 应用级缓存
<a href="#menu" style="float:right">目录</a>

### 38.1.1. 缓存回收策略
<a href="#menu" style="float:right">目录</a>

* 基于空间
    * 占用的存储空间大小
* 基于容量
    * 缓存的数量
* 基于时间
    * 缓存的存在时间
* 基于Java对象引用
    
### 38.1.2. 回收算法
<a href="#menu" style="float:right">目录</a>

#### 38.1.2.1. FIFO
* FIFO ：（First In First Out）：先进先出算法，即先放入缓存的先被移除。
* 存在的问题
    * 当大量的新缓存插入会使早期进入的热点缓存会被移除掉。
#### 38.1.2.2. LRU 
* LRU（Least Recently Used）：最近最少使用算法，使用时间距离现在最久的那个被移除。
* 实现
    * 当有新数据时插入链表头部
    * 当缓存命中，则将数据移到链表头部
    * 当链表满的时候，移除链表尾部的数据
* 存在的问题
    * 如果最近一段时间没有访问热点缓存，访问的是冷数据，热点缓存会被移除掉

#### 38.1.2.3. LFU
* LFU（Least Frequently Used）：最不常用算法，一定时间段内使用【次数（频率）】最少的那个被移除。
* 给每一个缓存添加访问计数器，缓存不足时移除计数器最小的缓存
* 存在的问题
    * 如果频率时间度量是1小时，则平均一天每个小时内的访问频率1000的热点数据可能会被2个小时的一段时间内的访问频率是1001的数据剔除掉；
    *  最近新加入的数据总会易于被剔除掉，由于其起始的频率值低。本质上其“重要性”指标访问频率是指在多长的时间维度进行衡量？其难以标定，所以在业界很少单一直接使用。也由于两种算法的各自特点及缺点，所以通常在生产线上会根据业务场景联合LRU与LFU一起使用，称之为LRFU。
#### 38.1.2.4. LRFU
* 利用两个队列维护访问的数据元素，按被访问的频率的维度把元素分别搁在热端与冷端队列；而在同一个队列内，最后访问时间越久的元素会越被排在队列尾。
 
### 38.1.3. Java 缓存类型
<a href="#menu" style="float:right">目录</a>

#### 38.1.3.1. 堆缓存
* 使用堆内存来存储对象
* 好处是不需要序列化和反序列化，速度快。
* 当缓存比较大时，GC回收时间比较长
* 一般通过软引用/弱引用来存储对象,即当堆内存不足时，可以强制回收这部分内存。
* 一般用于缓存少量的热点数据，并且不是频繁修改的，因为集群环境下会出现数据不一致问题，需要做好过期时间设置
* 常用实现方案有: Guava ,Ehcache ,MapDB

#### 38.1.3.2. 对外缓存
* 使用堆外内存进行缓存,减少GC暂停时间
* 可以使用更大的缓存空间，受机器内存限制
* 实现方案:Ehcache ,MapDB

#### 38.1.3.3. 磁盘缓存
* 存储磁盘，重启后仍可以加载缓存
* 实现方案:Ehcache ,MapDB

#### 38.1.3.4. 分布式缓存
* 实现多应用共享缓存
* 实现方案:Redis

#### 38.1.3.5. 多级缓存
多级缓存就是根据不同的访问速率来设置多级缓存。优先访问速率高的缓存，提升系统性能。
比如先访问本地缓存，本地缓存不存在，再访问分布式缓存。可以尽量减少一次网络操作。

### 38.1.4. 应用级缓存示例
<a href="#menu" style="float:right">目录</a>

* 设计策略
    * 统一API封装
    * 可选的缓存方案
    * 失败统计以提供系统监控和分析
    * 命中率低通知报警
    * 缓存一致性考虑


### 38.1.5. 缓存使用模式实践
<a href="#menu" style="float:right">目录</a>

* SOR
    * 记录系统，实际存储原始数据的系统，比如数据库
* Cache
    * 缓存，访问速度比SOR快
* 回源
    * 缓存没有命中，回源数据库拿数据

#### 38.1.5.1. Cache-Aside
* 业务代码维护缓存，也就是业务代码和缓存操作混在一起
* 并发更新问题，多个实例同时更新
    * 如果是用户维度的问题，比如用户的订单数据、用户数据，并发更新的情况很少，加上过去时间就可以
    * 对于商品数据，可以考虑canal订阅binlog.来进行增量更新，不会出现不一致情况，但会存在延迟
    * 
#### 38.1.5.2. Cache-As-SOR
* Cache 看作SOR，所有操作都是对Cache进行，然后Cache再委托给SOR进行真实的读写，即代码中只看到Cache的操作
* 有三种实现: Read-Through, Write-Through,Write-Behind

#### 38.1.5.3. Read-Through
* 先查询缓存，缓存不命中再回源SOR，而不是业务代码进行回源。比如Guava的失败回调
* 优点:业务代码更加简洁
* 缺点：不适合复杂的查询，因为每次回源的查询条件 是不一样的，需要根据每个查询单独编写代码，可以使用回调函数解决

#### 38.1.5.4. Write-Through
* 穿透写模式/直写模式
* 业务代码首先调用Cache写数据，然后由Cache负责写缓存和写Sor,而不是由业务代码操作

#### 38.1.5.5. Write-Behind
* 回写模式,异步操作，异步之后可以实现批量写，合并写，延时写和限流

#### 38.1.5.6. Copy-Pattern
* 两种复制模式，Copy on read,copy on write
* Guava Cache 和Ehcache中堆缓存都是基于引用，有可能发生有人拿到缓存后修改，导致数据出现修改问题。
* Ehcache3.x提供解决方案

### 38.1.6. 缓存一致性处理
<a href="#menu" style="float:right">目录</a>

先做一个说明，从理论上来说，给缓存设置过期时间，是保证最终一致性的解决方案。这种方案下，我们可以对存入缓存的数据设置过期时间，所有的写操作以数据库为准，对缓存操作只是尽最大努力即可。也就是说如果数据库写成功，缓存更新失败，那么只要到达过期时间，则后面的读请求自然会从数据库中读取新值然后回填缓存。因此，接下来讨论的思路不依赖于给缓存设置过期时间这个方案。

在这里，我们讨论三种更新策略：
* 先更新数据库，再更新缓存
* 先删除缓存，再更新数据库
* 先更新数据库，再删除缓存

* 先更新数据库，再更新缓存
这套方案，大家是普遍反对的。为什么呢？有如下两点原因。
原因一（线程安全角度）
同时有请求A和请求B进行更新操作，那么会出现
（1）线程A更新了数据库
（2）线程B更新了数据库
（3）线程B更新了缓存
（4）线程A更新了缓存
这就出现请求A更新缓存应该比请求B更新缓存早才对，但是因为网络等原因，B却比A更早更新了缓存。这就导致了脏数据，因此不考虑。
原因二（业务场景角度）
有如下两点：
（1）如果你是一个写数据库场景比较多，而读数据场景比较少的业务需求，采用这种方案就会导致，数据压根还没读到，缓存就被频繁的更新，浪费性能。
（2）如果你写入数据库的值，并不是直接写入缓存的，而是要经过一系列复杂的计算再写入缓存。那么，每次写入数据库后，都再次计算写入缓存的值，无疑是浪费性能的。显然，删除缓存更为适合。

* 先删缓存，再更新数据库
该方案会导致不一致的原因是。同时有一个请求A进行更新操作，另一个请求B进行查询操作。那么会出现如下情形:
（1）请求A进行写操作，删除缓存
（2）请求B查询发现缓存不存在
（3）请求B去数据库查询得到旧值
（4）请求B将旧值写入缓存
（5）请求A将新值写入数据库
上述情况就会导致不一致的情形出现。而且，如果不采用给缓存设置过期时间策略，该数据永远都是脏数据。
那么，如何解决呢？采用延时双删策略
伪代码如下

public void write(String key,Object data){
        redis.delKey(key);
        db.updateData(data);
        Thread.sleep(1000);
        redis.delKey(key);
    }
转化为中文描述就是
（1）先淘汰缓存
（2）再写数据库（这两步和原来一样）
（3）休眠1秒，再次淘汰缓存
这么做，可以将1秒内所造成的缓存脏数据，再次删除。
那么，这个1秒怎么确定的，具体该休眠多久呢？
针对上面的情形，读者应该自行评估自己的项目的读数据业务逻辑的耗时。然后写数据的休眠时间则在读数据业务逻辑的耗时基础上，加几百ms即可。这么做的目的，就是确保读请求结束，写请求可以删除读请求造成的缓存脏数据。
如果你用了mysql的读写分离架构怎么办？
ok，在这种情况下，造成数据不一致的原因如下，还是两个请求，一个请求A进行更新操作，另一个请求B进行查询操作。
（1）请求A进行写操作，删除缓存
（2）请求A将数据写入数据库了，
（3）请求B查询缓存发现，缓存没有值
（4）请求B去从库查询，这时，还没有完成主从同步，因此查询到的是旧值
（5）请求B将旧值写入缓存
（6）数据库完成主从同步，从库变为新值
上述情形，就是数据不一致的原因。还是使用双删延时策略。只是，睡眠时间修改为在主从同步的延时时间基础上，加几百ms。
采用这种同步淘汰策略，吞吐量降低怎么办？
ok，那就将第二次删除作为异步的。自己起一个线程，异步删除。这样，写的请求就不用沉睡一段时间后了，再返回。这么做，加大吞吐量。
第二次删除,如果删除失败怎么办？
这是个非常好的问题，因为第二次删除失败，就会出现如下情形。还是有两个请求，一个请求A进行更新操作，另一个请求B进行查询操作，为了方便，假设是单库：
（1）请求A进行写操作，删除缓存
（2）请求B查询发现缓存不存在
（3）请求B去数据库查询得到旧值
（4）请求B将旧值写入缓存
（5）请求A将新值写入数据库
（6）请求A试图去删除请求B写入对缓存值，结果失败了。
ok,这也就是说。如果第二次删除缓存失败，会再次出现缓存和数据库不一致的问题。
如何解决呢？
具体解决方案，且看博主对第(3)种更新策略的解析。

* 先更新数据库，再删缓存
首先，先说一下。老外提出了一个缓存更新套路，名为《Cache-Aside pattern》。其中就指出

失效：应用程序先从cache取数据，没有得到，则从数据库中取数据，成功后，放到缓存中。
命中：应用程序从cache中取数据，取到后返回。
更新：先把数据存到数据库中，成功后，再让缓存失效。
另外，知名社交网站facebook也在论文《Scaling Memcache at Facebook》中提出，他们用的也是先更新数据库，再删缓存的策略。
这种情况不存在并发问题么？
不是的。假设这会有两个请求，一个请求A做查询操作，一个请求B做更新操作，那么会有如下情形产生
（1）缓存刚好失效
（2）请求A查询数据库，得一个旧值
（3）请求B将新值写入数据库
（4）请求B删除缓存
（5）请求A将查到的旧值写入缓存
ok，如果发生上述情况，确实是会发生脏数据。
然而，发生这种情况的概率又有多少呢？
发生上述情况有一个先天性条件，就是步骤（3）的写数据库操作比步骤（2）的读数据库操作耗时更短，才有可能使得步骤（4）先于步骤（5）。可是，大家想想，数据库的读操作的速度远快于写操作的（不然做读写分离干嘛，做读写分离的意义就是因为读操作比较快，耗资源少），因此步骤（3）耗时比步骤（2）更短，这一情形很难出现。
假设，有人非要抬杠，有强迫症，一定要解决怎么办？
如何解决上述并发问题？
首先，给缓存设有效时间是一种方案。其次，采用策略（2）里给出的异步延时删除策略，保证读请求完成以后，再进行删除操作。
还有其他造成不一致的原因么？
有的，这也是缓存更新策略（2）和缓存更新策略（3）都存在的一个问题，如果删缓存失败了怎么办，那不是会有不一致的情况出现么。比如一个写数据请求，然后写入数据库了，删缓存失败了，这会就出现不一致的情况了。这也是缓存更新策略（2）里留下的最后一个疑问。
如何解决？
提供一个保障的重试机制即可，这里给出两套方案。
方案一：
如下图所示
![](https://images.cnblogs.com/cnblogs_com/rjzheng/1202350/o_update1.png)
流程如下所示
（1）更新数据库数据；
（2）缓存因为种种问题删除失败
（3）将需要删除的key发送至消息队列
（4）自己消费消息，获得需要删除的key
（5）继续重试删除操作，直到成功
然而，该方案有一个缺点，对业务线代码造成大量的侵入。于是有了方案二，在方案二中，启动一个订阅程序去订阅数据库的binlog，获得需要操作的数据。在应用程序中，另起一段程序，获得这个订阅程序传来的信息，进行删除缓存操作。
方案二：
![](https://images.cnblogs.com/cnblogs_com/rjzheng/1202350/o_update2.png)
流程如下图所示：
（1）更新数据库数据
（2）数据库会将操作信息写入binlog日志当中
（3）订阅程序提取出所需要的数据以及key
（4）另起一段非业务代码，获得该信息
（5）尝试删除缓存操作，发现删除失败
（6）将这些信息发送至消息队列
（7）重新从消息队列中获得该数据，重试操作。

备注说明：上述的订阅binlog程序在mysql中有现成的中间件叫canal，可以完成订阅binlog日志的功能。至于oracle中，博主目前不知道有没有现成中间件可以使用。另外，重试机制，博主是采用的是消息队列的方式。如果对一致性要求不是很高，直接在程序中另起一个线程，每隔一段时间去重试即可，这些大家可以灵活自由发挥，只是提供一个思路。


### 38.1.7. 缓存异常处理
<a href="#menu" style="float:right">目录</a>

#### 38.1.7.1. 缓存穿透
缓存击穿表示恶意用户模拟请求很多缓存中不存在的数据，由于缓存中都没有，导致这些请求短时间内直接落在了数据库上，导致数据库异常。这个我们在实际项目就遇到了，有些抢购活动、秒杀活动的接口API被大量的恶意用户刷，导致短时间内数据库宕机了，好在数据库是多主多从的，hold住了。
#### 38.1.7.2. 缓存击穿
对于一些设置了过期时间的key，如果这些key可能会在某些时间点被超高并发地访问，是一种非常“热点”的数据。这个时候，需要考虑一个问题：缓存被“击穿”的问题，这个和缓存雪崩的区别在于这里针对某一key缓存，前者则是很多key。
缓存在某个时间点过期的时候，恰好在这个时间点对这个Key有大量的并发请求过来，这些请求发现缓存过期一般都会从后端DB加载数据并回设到缓存，这个时候大并发的请求可能会瞬间把后端DB压垮。
#### 38.1.7.3. 缓存雪崩
缓存在同一时间内大量键过期（失效），接着来的一大波请求瞬间都落在了数据库中导致连接异常。

#### 38.1.7.4. 解决方案

**一、 缓存空数据**
如果数据库查询不到数据，仍将向缓存存入一个空数据。

**二、 使用互斥锁排队**

业界比价普遍的一种做法，即根据key获取value值为空时，锁上，从数据库中load数据后再释放锁。若其它线程获取锁失败，则等待一段时间后重试。这里要注意，分布式环境中要使用分布式锁，单机的话用普通的锁（synchronized、Lock）就够了。


```java
public String getWithLock( String key, Jedis jedis, String lockKey, String uniqueId, long expireTime )
{
	/* 通过key获取value */
	String value = redisService.get( key );
	if ( StringUtil.isEmpty( value ) )
	{
		/*
		 * 分布式锁，详细可以参考https://blog.csdn.net/fanrenxiang/article/details/79803037
		 * 封装的tryDistributedLock包括setnx和expire两个功能，在低版本的redis中不支持
		 */
		try {
			boolean locked = redisService.tryDistributedLock( jedis, lockKey, uniqueId, expireTime );
			if ( locked )
			{
				value = userService.getById( key );
				redisService.set( key, value );
				redisService.del( lockKey );
				return(value);
			} else {
				/* 其它线程进来了没获取到锁便等待50ms后重试 */
				Thread.sleep( 50 );
				getWithLock( key, jedis, lockKey, uniqueId, expireTime );
			}
		} catch ( Exception e ) {
			log.error( "getWithLock exception=" + e );
			return(value);
		} finally {
			redisService.releaseDistributedLock( jedis, lockKey, uniqueId );
		}
	}
	return(value);
}
```

这样做思路比较清晰，也从一定程度上减轻数据库压力，但是锁机制使得逻辑的复杂度增加，吞吐量也降低了，有点治标不治本。

**三、 布隆过滤器（推荐）**

bloomfilter就类似于一个hash set，用于快速判某个元素是否存在于集合中，其典型的应用场景就是快速判断一个key是否存在于某容器，不存在就直接返回。布隆过滤器的关键就在于hash算法和容器大小，下面先来简单的实现下看看效果，我这里用guava实现的布隆过滤器：

```
 <dependency>
    <groupId>com.google.guava</groupId>
    <artifactId>guava</artifactId>
    <version> 23.0 </version>
    </dependency>
 </dependencies >
```
```java
 public class BloomFilterTest {
	 private static final int capacity	= 1000000;
	 private static final int key		= 999998;
	 private static BloomFilter<Integer> bloomFilter = BloomFilter.create( Funnels.integerFunnel(), capacity );
	 static {
		 for ( int i = 0; i < capacity; i++ )
		 {
			 bloomFilter.put( i );
		 }
	 }
	 public static void main( String[] args )
	 {
 /*返回计算机最精确的时间，单位微妙*/
		 long start = System.nanoTime();
		 if ( bloomFilter.mightContain( key ) )
		 {
			 System.out.println( "成功过滤到" + key );
		 }
		 long end = System.nanoTime();
		 System.out.println( "布隆过滤器消耗时间:" + (end - start) );
		 int sum = 0;
		 for ( int i = capacity + 20000; i < capacity + 30000; i++ )
		 {
			 if ( bloomFilter.mightContain( i ) )
			 {
				 sum = sum + 1;
			 }
		 }
		 System.out.println( "错判率为:" + sum );
	 }
 }
```
 
 成功过滤到999998
 布隆过滤器消 耗 时间 : 215518
 错判率 为 : 318
可以看到，100w个数据中只消耗了约0.2毫秒就匹配到了key，速度足够快。然后模拟了1w个不存在于布隆过滤器中的key，匹配错误率为318/10000，也就是说，出错率大概为3%，跟踪下BloomFilter的源码发现默认的容错率就是0.03：

```java
public static < T > BloomFilter<T> create( Funnel<T> funnel, int expectedInsertions)
{
	return(create( funnel, expectedInsertions, 0.03 ) ); /* FYI, for 3%, we always get 5 hash functions */
}
```
我们可调用BloomFilter的这个方法显式的指定误判率：

```java
private static BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(), capacity,0.01);
```

我们断点跟踪下，误判率为0.02和默认的0.03时候的区别:

对比两个出错率可以发现，误判率为0.02时数组大小为8142363，0.03时为7298440，误判率降低了0.01，BloomFilter维护的数组大小也减少了843923，可见BloomFilter默认的误判率0.03是设计者权衡系统性能后得出的值。要注意的是，布隆过滤器不支持删除操作。用在这边解决缓存穿透问题就是：
```java
public String getByKey( String key )
{
	/* 通过key获取value */
	String value = redisService.get( key );
	if ( StringUtil.isEmpty( value ) )
	{
		if ( bloomFilter.mightContain( key ) )
		{
			value = userService.getById( key );
			redisService.set( key, value );
			return(value);
		} else {
			return(null);
		}
	}
	return(value);
}
```

**四、永远不过期**
不过期则不会出现失效问题，可以解决缓存击穿和雪崩问题。

**五、建立备份缓存，设置多级缓存**
缓存A和缓存B，A设置超时时间，B不设值超时时间，先从A读缓存，A没有读B，并且更新A缓存和B缓存;

```java
public String getByKey( String keyA, String keyB )
{
	String value = redisService.get( keyA );
	if ( StringUtil.isEmpty( value ) )
	{
		value = redisService.get( keyB );
		String newValue = getFromDbById();
		redisService.set( keyA, newValue, 31, TimeUnit.DAYS );
		redisService.set( keyB, newValue );
	}
	return(value);
}
```

#### 38.1.7.5. 缓存并发问题

这里的并发指的是多个redis的client同时set key引起的并发问题。比较有效的解决方案就是把redis.set操作放在队列中使其串行化，必须的一个一个执行，具体的代码就不上了，当然加锁也是可以的，至于为什么不用redis中的事务，留给各位看官自己思考探究。


## 38.2. HTTP缓存
<a href="#menu" style="float:right">目录</a>

### 38.2.1. 浏览器缓存

* Cookie
    * Cookie 是小甜饼的意思。顾名思义，cookie 确实非常小，它的大小限制为4KB左右。它的主要用途有保存登录信息，比如你登录某个网站市场可以看到“记住密码”，这通常就是通过在 Cookie 中存入一段辨别用户身份的数据来实现的。

* localStorage
    * localStorage 是 HTML5 标准中新加入的技术，它并不是什么划时代的新东西。早在 IE 6 时代，就有一个叫 userData 的东西用于本地存储，而当时考虑到浏览器兼容性，更通用的方案是使用 Flash。而如今，localStorage 被大多数浏览器所支持，如果你的网站需要支持 IE6+，那以 userData 作为你的 polyfill 的方案是种不错的选择。

* sessionStorage
    * sessionStorage 与 localStorage 的接口类似，但保存数据的生命周期与 localStorage 不同。做过后端开发的同学应该知道 Session 这个词的意思，直译过来是“会话”。而 sessionStorage 是一个前端的概念，它只是可以将一部分数据在当前会话中保存下来，刷新页面数据依旧存在。但当页面关闭后，sessionStorage 中的数据就会被清空。

|特性|	Cookie|	localStorage|	sessionStorage|
|---|---|---|---|
|数据的生命期|	一般由服务器生成，可设置失效时间。如果在浏览器端生成Cookie，默认是关闭浏览器后失效|	除非被清除，否则永久保存|	仅在当前会话下有效，关闭页面或浏览器后被清除|	仅在当前会话下有效，关闭页面或浏览器后被清除
|存放数据大小|	4K左右|  	一般为5MB|一般为5MB|
|与服务器端通信	|每次都会携带在HTTP头中，如果使用cookie保存过多数据会带来性能问题	|仅在客户端（即浏览器）中保存，不参与和服务器的通信|仅在客户端（即浏览器）中保存，不参与和服务器的通信
|易用性	|需要程序员自己封装，源生的Cookie接口不友好	|源生接口可以接受，亦可再次封装来对Object和Array有更好的支持|源生接口可以接受，亦可再次封装来对Object和Array有更好的支持

* 这三者都是无法跨域的。

**应用场景**
因为考虑到每个 HTTP 请求都会带着 Cookie 的信息，所以 Cookie 当然是能精简就精简啦，比较常用的一个应用场景就是判断用户是否登录。针对登录过的用户，服务器端会在他登录时往 Cookie 中插入一段加密过的唯一辨识单一用户的辨识码，下次只要读取这个值就可以判断当前用户是否登录啦。曾经还使用 Cookie 来保存用户在电商网站的购物车信息，如今有了 localStorage，似乎在这个方面也可以给 Cookie 放个假了~

而另一方面 localStorage 接替了 Cookie 管理购物车的工作，同时也能胜任其他一些工作。比如HTML5游戏通常会产生一些本地数据，localStorage 也是非常适用的。如果遇到一些内容特别多的表单，为了优化用户体验，我们可能要把表单页面拆分成多个子页面，然后按步骤引导用户填写。这时候 sessionStorage 的作用就发挥出来了。

**安全性的考虑**
需要注意的是，不是什么数据都适合放在 Cookie、localStorage 和 sessionStorage 中的。使用它们的时候，需要时刻注意是否有代码存在 XSS 注入的风险。因为只要打开控制台，你就随意修改它们的值，也就是说如果你的网站中有 XSS 的风险，它们就能对你的 localStorage 肆意妄为。所以千万不要用它们存储你系统中的敏感数据。

**操作**
localStorage和sessionStorage都具有相同的操作方法，例如setItem、getItem和removeItem，clear
localStorage和sessionStorage没有过期时间和超时回收策略，因此可以保存数据的时候顺便保存当前时间和超时，读取时再检测是否超时。


### 38.2.2. CDN缓存
* **基本概念**
    * CDN的全称是Content Delivery Network，即内容分发网络。CDN是构建在现有网络基础之上的智能虚拟网络，依靠部署在各地的边缘服务器，通过中心平台的负载均衡、内容分发、调度等功能模块，使用户就近获取所需内容，降低网络拥塞，提高用户访问响应速度和命中率。CDN的关键技术主要有内容存储和分发技术。
* **组成**
    * CDN网络中包含的功能实体包括内容缓存设备、内容交换机、内容路由器、CDN内容管理系统等组成。 
    * 内容缓存为CDN网络节点，位于用户接入点，是面向最终用户的内容提供设备，可缓存静态Web内容和流媒体内容，实现内容的边缘传播和存储，以便用户的就近访问。 
    * 内容交换机处于用户接入集中点，可以均衡单点多个内容缓存设备的负载，并对内容进行缓存负载平衡及访问控制 
    * 内容路由器负责将用户的请求调度到适当的设备上。内容路由通常通过负载均衡系统来实现，动态均衡各个内容缓存站点的载荷分配，为用户的请求选择最佳的访问站点，同时提高网站的可用性。内容路由器可根据多种因素制定路由，包括站点与用户的临近度、内容的可用性、网络负载、设备状况等。负载均衡系统是整个CDN的核心。负载均衡的准确性和效率直接决定了整个CDN的效率和性能。
    * 内容管理系统负责整个CDN的管理，是可选部件，作用是进行内容管理，如内容的注入和发布、内容的分发、内容的审核、内容的服务等。 
* **功能**
    * 节省骨干网带宽，减少带宽需求量； 
    * 提供服务器端加速，解决由于用户访问量大造成的服务器过载问题；
    * 服务商能使用Web Cache技术在本地缓存用户访问过的Web页面和对象，实现相同对象的访问无须占用主干的出口带宽，并提高用户访问因特网页面的相应时间的需求；
    * 能克服网站分布不均的问题，并且能降低网站自身建设和维护成本； 
    * 降低“通信风暴”的影响，提高网络访问的稳定性。 
* **基本原理**
    * CDN的基本原理是广泛采用各种缓存服务器，将这些缓存服务器分布到用户访问相对集中的地区或网络中，在用户访问网站时，利用全局负载技术将用户的访问指向距离最近的工作正常的缓存服务器上，由缓存服务器直接响应用户请求。 
    * CDN的基本思路是尽可能避开互联网上有可能影响数据传输速度和稳定性的瓶颈和环节，使内容传输的更快、更稳定。通过在网络各处放置节点服务器所构成的在现有的互联网基础之上的一层智能虚拟网络，CDN系统能够实时地根据网络流量和各节点的连接、负载状况以及到用户的距离和响应时间等综合信息将用户的请求重新导向离用户最近的服务节点上。其目的是使用户可就近取得所需内容，解决 Internet网络拥挤的状况，提高用户访问网站的响应速度。 
* **服务模式**
    * 内容分发网络（CDN）是一种新型网络构建方式，它是为能在传统的IP网发布宽带丰富媒体而特别优化的网络覆盖层；而从广义的角度，CDN代表了一种基于质量与秩序的网络服务模式。 
    * 简单地说，内容分发网络（CDN）是一个经策略性部署的整体系统，包括分布式存储、负载均衡、网络请求的重定向和内容管理4个要件，而内容管理和全局的网络流量管理（Traffic Management）是CDN的核心所在。通过用户就近性和服务器负载的判断，CDN确保内容以一种极为高效的方式为用户的请求提供服务。  
    * 总的来说，内容服务基于缓存服务器，也称作代理缓存（Surrogate），它位于网络的边缘，距用户仅有"一跳"（Single Hop）之遥。同时，代理缓存是内容提供商源服务器（通常位于CDN服务提供商的数据中心）的一个透明镜像。这样的架构使得CDN服务提供商能够代表他们客户，即内容供应商，向最终用户提供尽可能好的体验，而这些用户是不能容忍请求响应时间有任何延迟的。  
* **主要特点**
    * 本地Cache加速：提高了企业站点（尤其含有大量图片和静态页面站点）的访问速度，并大大提高以上性质站点的稳定性。  
    * 镜像服务：消除了不同运营商之间互联的瓶颈造成的影响，实现了跨运营商的网络加速，保证不同网络中的用户都能得到良好的访问质量。 
    * 远程加速：远程访问用户根据DNS负载均衡技术智能自动选择Cache服务器，选择最快的Cache服务器，加快远程访问的速度。 
    * 带宽优化：自动生成服务器的远程Mirror（镜像）cache服务器，远程用户访问时从cache服务器上读取数据，减少远程访问的带宽、分担网络流量、减轻原站点WEB服务器负载等功能。
    * 集群抗攻击：广泛分布的CDN节点加上节点之间的智能冗余机制，可以有效地预防黑客入侵以及降低各种D.D.o.S攻击对网站的影响，同时保证较好的服务质量 。 
* **关键技术**
    * 内容发布
        * 它借助于建立索引、缓存、流分裂、组播（Multicast）等技术，将内容发布或投递到距离用户最近的远程服务点（POP）处。
        * 内容分发包含从内容源到CDN边缘的Cache的过程。从实现上，有两种主流的内容分发技术：PUSH和PULL。 
        * PUSH是一种主动分发的技术。通常，PUSH由内容管理系统发起，将内容从源或者中心媒体资源库分发到各边缘的 Cache节点。分发的协议可以采用 Http/ftp等。通过PUSH分发的内容一般是比较热点的内容，这些内容通过PUSH方式预分发（ Preload）到边缘Cache，可以实现有针对的内容提供。对于PUSH分发需要考虑的主要问题是分发策略，即在什么时候分发什么内容。一般来说，内容分发可以由CP（内容提供商）或者CDN内容管理员人工确定，也可以通过智能的方式决定，即所谓的智能分发，它根据用户访问的统计信息，以及预定义的内容分发的规则，确定内容分发的过程PULL是一种被动的分发技术，PULL分发通常由用户请求驱动。当用户请求的内容在本地的边缘 Cache上不存在（未命中）时， Cache启动PUL方法从内容源或者其他CDN节点实时获取内容。在PULL方式下，内容的分发是按需的。 
    * 内容路由
        * 它是整体性的网络负载均衡技术，通过内容路由器中的重定向（DNS）机制，在多个远程POP上均衡用户的请求，以使用户请求得到最近内容源的响应。 
        * CDN负载均衡系统实现CDN的内容路由功能。它的作用是将用户的请求导向整个CDN网络中的最佳节点。最佳节点的选定可以根据多种策略，例如距离最近、节点负载最轻等。负载均衡系统是整个CDN的核心，负载均衡的准确性和效率直接决定了整个CDN的效率和性能。通常负载均衡可以分为两个层次:全局负载均衡（GSLB）和本地负载均衡（SLB）。全局负载均衡主要的目的是在整个网络范围内将用户的请求定向到最近的节点（或者区域）。因此，就近性判断是全局负载均衡的主要功能。本地负载均衡一般局限于一定的区域范围内，其目标是在特定的区域范围内寻找一台最适合的节点提供服务，因此，CDN节点的健康性、负载情况、支持的媒体格式等运行状态是本地负载均衡进行决策的主要依据。 
    * 内容存储
        * 对于CDN系统而言，需要考虑两个方面的内容存储问题。一个是内容源的存储，一个是内容在 Cache节点中的存储。
        * 对于内容源的存储，由于内容的规模比较大（通常可以达到几个甚至几十个TB），而且内容的吞吐量较大，因此，通常采用海量存储架构，如NAS和SON。对于在 Cache节点中的存储，是 Cache设计的一个关键问题。需要考虑的因素包括功能和性能两个方面:功能上包括对各种内容格式的支持，对部分缓存的支持;在性能上包括支持的容量、多文件吞吐率、可靠性、稳定性。
        * 其中，多种内容格式的支持要求存储系统根据不同文件格式的读写特点进行优化，以提高文件内容读写的效率。特别是对针对流媒体文件的读写。部分缓存能力指流媒体内容可以以不完整的方式存储和读取。部分缓存的需求来自用户访问行为的随机性，因为许多用户并不会完整地收看整个流媒体节目。事实上，许多用户访问单个流媒体节目的时间不超过10分钟。因此，部分缓存能力能够大大提高存储空间的利用率，并有效提高用户请求的响应时间。但是部分缓存可能导致内容的碎片问题，需要进行良好的设计和控制。 
        * Cache存储的另一个重要因素是存储的可靠性，目前，多数存储系统都采用了独立磁盘冗余阵列（RAID）技术进行可靠存储。但是不同设备使用的RAID方式各有不同。 
    * 内容管理
        * 它通过内部和外部监控系统，获取网络部件的状况信息，测量内容发布的端到端性能（如包丢失、延时、平均带宽、启动时间、帧速率等），保证网络处于最佳的运行状态。  
        * 内容管理在广义上涵盖了从内容的发布、注入、分发、调整、传递等一系列过程。在这里，内容管理重点强调内容进人 Cache点后的内容管理，称其为本地内容管理。本地内容管理主要针对一个ODN节点（有多个 CDN Cache设备和一个SLB设备构成）进行。本地内容管理的主要目标是提高内容服务的效率，提高本地节点的存储利用率。通过本地内容管理，可以在CDN节点实现基于内容感知的调度，通过内容感知的调度，可以避免将用户重定向到没有该内容的 Cache设备上，从而提高负载均衡的效率。通过本地内容管理还可以有效实现在ODN节点内容的存储共享，提高存储空间的利用率

**浏览器访问网站流程**
* 没有CDN的时候
    * 用户向浏览器提交要访问的域名
    * 浏览器对域名进行解析，得到域名对应的IP地址
    * 浏览器向所得到的IP地址发送请求
    * 浏览器根据返回的数据进行显示
* 存在CDN的时候
    * 用户向浏览器提交要访问的域名
    * 浏览器对域名进行解析
    * 由于CDN对域名解析过程进行了调整，所以得到的是该域名对应的CNAME记录
    * 对CNAME再次进行解析，得到实际的IP地址。
        * 使用全局负载均衡DNS解析，获取到最近的访问IP地址
        * 需要根据地理位置和所在的ISP来确定返回结果
        * 让身处不同地域，连接不同接入商的用户得到最适合自己访问的CDN地址，才能做到最近访问，从而提升速度
    * 得到实际的IP地址，向服务器发出请求
    * 如果不存在，则CDN请求源站，获取内容，然后再返回结果
* 关键技术
    * 全局调度
    * 缓存技术
    * 内容分发
    * 带宽优化
* CDN意义
    * 把资源放到离用户近的地方，从而提高访问速度
    * 可以让用户上传的文件传到CDN，CDN再传到源站，从而提高上传速度
    
### 38.2.3. NGINX缓存





<span id="menu"></span>


# 39. 分布式系统
<a href="#menu" style="float:right">目录</a>

## 39.1. 基本概念
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
    
## 39.2. 大型网站的特点
<a href="#menu" style="float:right">目录</a>

### 39.2.1. 特点
高并发，大流量;高可用；海量数据;用户分布广泛，网络情况复杂;安全环境恶劣；需求快速变更，发布频繁；渐进式发展.
### 39.2.2. 模式
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
## 39.3. 常用的RPC框架
<a href="#menu" style="float:right">目录</a>
RPC(Remote Procedure Call,远程过程调用)一般用来实现部署在不同的机器上的系统之间的方法调用，使得程序能够像访问本地系统资源一样，通过网络去访问远端系统资源。
这里通过网络访问，并不限制使用何种协议，RPC不等价于TCP方式。

### 39.3.1. Thrift
* FaceBook开发
* 跨平台和语言，支持多种与语言，比如C/C++，Erlang,Java,Js
* 采用二进制编码协议，使用TCP/IP传输协议

### 39.3.2. gRPC
* 谷歌开发,面向移动和**HTTP2**设计
* 支持C，Java,Go，分别是grpc,grpc-java,grpc-go
* 具备诸如双向流，流空，头部压缩，单TCP连接上的多路复用请求等待特性
* 一般用在移动设备上
* 默认为protocol buffers序列化协议，也可以用其他序列化协议，比如json

## 39.4. Dubbo

### 39.4.1. 架构
![](http://dubbo.apache.org/docs/zh-cn/user/sources/images/dubbo-architecture.jpg)

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

### 39.4.2. 功能

**启动时检查**
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

**线程模型**

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

**直连提供者**
* 在开发及测试环境下，经常需要绕过注册中心，只测试指定服务提供者，这时候可能需要点对点直连，点对点直连方式，将以服务接口为单位，忽略注册中心的提供者列表，A 接口配置点对点，不影响 B 接口从注册中心获取列表。

**只订阅**
* 为方便开发测试，经常会在线下共用一个所有服务可用的注册中心，这时，如果一个正在开发中的服务提供者注册，可能会影响消费者不能正常运行。
* 可以让服务提供者开发方，只订阅服务(开发的服务可能依赖其它服务)，而不注册正在开发的服务，通过直连测试正在开发的服务。

**只注册**
* 如果有两个镜像环境，两个注册中心，有一个服务只在其中一个注册中心有部署，另一个注册中心还没来得及部署，而两个注册中心的其它应用都需要依赖此服务。这个时候，可以让服务提供者方只注册服务到另一注册中心，而不从另一注册中心订阅服务。

**多协议**
* dubbo 
* rmi
* hessian
* http
* webservice
* thrift
* memcache
* redis
* rest

**多注册中心**
* Multicast
* Zookeeper
* Nacos
* Redis
* Simple

**服务分组**
* 当服务有多个版本时，可以通过分组进行区分

**多版本**
* 一般用于本版升级，对比新版本和旧版本，如果新版本有问题，可以很快进行切换 

**分组聚合**
按组合并返回结果，比如菜单服务，接口一样，但有多种实现，用group区分，现在消费方需从每种group中调用一次返回结果，合并结果返回，这样就可以实现聚合菜单项。


**参数验证**
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


**结果缓存**
* 结果缓存，用于加速热门数据的访问速度，Dubbo 提供声明式缓存，以减少用户加缓存的工作量。
* 缓存类型
    * lru 基于最近最少使用原则删除多余缓存，保持最热的数据被缓存。
    * threadlocal 当前线程缓存，比如一个页面渲染，用到很多 portal，每个 portal 都要去查用户信息，通过线程缓存，可以减少这种多余访问。
    * jcache 与 JSR107 集成，可以桥接各种缓存实现。


**泛化引用**
* 泛化接口调用方式主要用于客户端没有 API 接口及模型类元的情况，参数及返回值中的所有 POJO 均用 Map 表示，通常用于框架集成，比如：实现一个通用的服务测试框架，可通过 GenericService 调用所有服务实现。

**泛化实现**
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
**上下文信息**

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


**隐式参数**
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
**异步调用**
**异步执行**
**本地调用**
**参数回调**
**事件通知**
**本地存根**
**本地伪装**
**延迟暴露**
**并发控制**
**连接控制**
**延迟连接**
**粘滞连接**
**令牌验证**
**路由规则**
**配置规则**
**服务降级**
**优雅停机**
**主机绑定**
**日志适配**
**访问日志**
**服务容器**
**配置缓存**
**分布式事务**
**线程栈自动dump**
**Netty4**
**Kryo与Fst序列化**
**简化注册中心URL**

### 39.4.3. 连接协议
<a href="#menu" style="float:right">目录</a>

#### 39.4.3.1. dubbo
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

#### 39.4.3.2. rmi
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

#### 39.4.3.3. hessian
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


#### 39.4.3.4. http
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

#### 39.4.3.5. webservice
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

#### 39.4.3.6. thrift
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

#### 39.4.3.7. memcached
#### 39.4.3.8. redis
#### 39.4.3.9. rest
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

<dubbo:protocol name="rest" port="8888" contextpath="services"/>
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

## 39.5. 架构演进
<a href="#menu" style="float:right">目录</a>


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
## 39.6. Java 中间件
* **定义**
    * 中间件不是上层的业务，也不是底层的支撑系统，而是处于中间位置的作用，是应用和应用之间的桥梁。
    * 常见的中间件:
        * 数据库中间件,解决应用访问数据库的共性问题，比如分库分表下的数据访问。
        * 消息中间件，解决应用之间消息传递，解耦和异步的问题。

## 39.7. 序列化机制
<a href="#menu" style="float:right">目录</a>
### 39.7.1. 基本概念
**序列化**:将对象序列化为字节数组，用于网络传输或者磁盘存储。
**反序列化**:将从网络或者磁盘获取的字节数组转化为对象。

* 序列化选择关键点
    * 序列化和反序列化过程的性能
    * 序列化之后的字节长度，这将会影响网络传输。
    * 功能丰富度，比如支持List,Map，复杂对象等
    * 跨语言需求，有的系统由几个不同的应用组成，每个应用可能使用不同的语言开发，因此可能存在跨语言需求。
### 39.7.2. 常用序列化方式性能比较

![](https://img2018.cnblogs.com/blog/1404294/201904/1404294-20190418171605508-1194073956.jpg)
从图上可以看出，protostuff的性能最好，而JDK序列化方式相对来说性能是比较差的。

### 39.7.3. 常用序列化方式实现
#### 39.7.3.1. JDK方式
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
#### 39.7.3.2. FastJSON
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
#### 39.7.3.3. Hessian
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
#### 39.7.3.4. Protostuff
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

## 39.8. 定时任务
<a href="#menu" style="float:right">目录</a>
在项目开发过程中，我们经常需要执行具有周期性的任务。通过定时任务可以很好的帮助我们实现。
当出现应用进行集群部署，此时单体的定时任务管理就会出问题：两个集群中的应用会执行相同的任务。又衍生出处理分布式定时任务，它利用数据库等方式共享定时任务的信息，当集群中有一个应用运行了定时任务。其他应用便不会再次重复执行任务。

单体应用中常使用的定时任务方式是Spring Scheduler,分布式定时任务框架有Quartz.

## 39.9. Cron表达式
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

### 39.9.1. Spring Scheduler
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
### 39.9.2. Quartz
<a href="#menu" style="float:right">目录</a>
#### 39.9.2.1. Quartz 核心概念
* Job 表示一个工作，要执行的具体内容。此接口中只有一个方法，如下：
* JobDetail 表示一个具体的可执行的调度程序，Job 是这个可执行程调度程序所要执行的内容，另外 JobDetail 还包含了这个任务调度的方案和策略。 
* Trigger 代表一个调度参数的配置，什么时候去调。 
* Scheduler 代表一个调度容器，一个调度容器中可以注册多个 JobDetail 和 Trigger。当 Trigger 与 JobDetail 组合，就可以被 Scheduler 容器调度了。 
[更多使用方式参考](https://www.w3cschool.cn/quartz_doc/)

## 39.10. 分布式ID
<a href="#menu" style="float:right">目录</a>

### 39.10.1. 应用场景
分布式ID的应用场景：
* 数据库主键，在进行分库分表时，如果数据库仍然使用自增，可能会出现主键重复的问题，因此需要应用生成主键。
* 在一些消息中间件的使用场景，在处理消息幂等性时，会为每个消息添加一个唯一ID，消费者通过该ID校验消息是否已经被消费。

### 39.10.2. 分布式ID生成方案

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

## 39.11. 分布式锁
[How to do distributed locking](https://martin.kleppmann.com/2016/02/08/how-to-do-distributed-locking.html)
<a href="#menu" style="float:right">目录</a>
不管使用什么中间件，有几点是实现分布式锁必须要考虑到的。
* 互斥：互斥好像是必须的，否则怎么叫锁。
* 死锁: 如果一个线程获得锁，然后挂了，并没有释放锁，致使其他节点(线程)永远无法获取锁，这就是死锁。分布式锁必须做到避免死锁。
* 性能: 高并发分布式系统中，线程互斥等待会成为性能瓶颈，需要好的中间件和实现来保证性能。
* 锁特性：考虑到复杂的场景，分布式锁不能只是加锁，然后一直等待。最好实现如Java Lock的一些功能如：锁判断，超时设置，可重入性等。

### 39.11.1. 使用数据库实现

### 39.11.2. Redis实现分布式锁
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



### 39.11.3. Zookeeper实现分布式锁

## 39.12. 微服务化
<a href="#menu" style="float:right">目录</a>

### 39.12.1. 微服务和SOA

|微服务|SOA|
|---|---|
|能拆分的就拆分|是整体的，服务能放在一起就放在一起|
|纵向业务划分|是水平分多层|
|由单一组织负责|按层级划分不同的组织负责|
|细粒度|粗粒度|
|组件小|存在复杂的组件|
|业务逻辑存在于每一个服务中|业务逻辑横跨多个业务领域|
|使用轻量级的通信方式如HTTP|企业服务总线ESB充当了服务之间通信的角色|

### 39.12.2. 拆分原则
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
    



## 39.13. 消息机制
<a href="#menu" style="float:right">目录</a>

## 39.14. 服务降级
<a href="#menu" style="float:right">目录</a>

## 39.15. 流量限流
<a href="#menu" style="float:right">目录</a>

## 39.16. 幂等设计
<a href="#menu" style="float:right">目录</a>

## 39.17. 数据一致性
<a href="#menu" style="float:right">目录</a>

### 39.17.1. CAP理论
### 39.17.2. Base理论

## 39.18. 分布式事务实现
<a href="#menu" style="float:right">目录</a>

## 39.19. 负载均衡算法
<a href="#menu" style="float:right">目录</a>

## 39.20. 服务容错设计
<a href="#menu" style="float:right">目录</a>

## 39.21. 集群
<a href="#menu" style="float:right">目录</a>

## 39.22. 分库分表
<a href="#menu" style="float:right">目录</a>

## 39.23. 反向代理&正向代理
<a href="#menu" style="float:right">目录</a>

## 39.24. 客户端优化
<a href="#menu" style="float:right">目录</a>

<h1>WEB安全</h1>

<span id="menu"></span>


# 40. 浏览器安全
<a href="#menu" style="float:right">目录</a>

## 40.1. 同源策略

* 定义
    * 脚本只访问同源的服务器 
    * 同源策略是浏览器的行为，是为了保护本地数据不被JavaScript代码获取回来的数据污染，因此拦截的是客户端发出的请求回来的数据接收，即请求发送了，服务器响应了，但是无法被浏览器接收
    * html中的 img / a /link / script /  ifame 等标签不受此限制，脚本访问才会受限制
    * DOM,Cookie,XMLHttpRequest(ajax)受同源限制,以及浏览器加载的第三方插件比如Flash,JavaApplet等有自己的控制策略
    * 脚本访问不同源的数据叫跨域访问
    
* 同源区分
    * 协议
    * host
    * 端口
    * 子域名
* 破解跨域访问
    * 通过响应的HTTP头来授权
    * Access-Control-Allow-Origin   
        * https://www.zhoutao123.com	
        * 标明允许https://www.zhoutao123.com	发起跨域请求
    * Access-Control-Max-Age	
        * 3628800	
        * 表明在3628800秒内，不需要再发送预检验请求
    * Access-Control-Allow-Methods	
        * GET，PUT, DELETE	允许GET、PUT、DELETE的外域请求
    * Access-Control-Allow-Headers
        * content-type	
        * 允许跨域请求包含content-type头
* Spring Boot开启
方式1：
```java
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CrossOrigin {
    
    //允许跨域的服务器
    @AliasFor("origins")
    String[] value() default {};
    
    //和上面是一样的 AliasFor
    @AliasFor("value")
    String[] origins() default {};

    //允许头部
    String[] allowedHeaders() default {};

    String[] exposedHeaders() default {};
    
    /**
     * The list of supported HTTP request methods.
     * <p>By default the supported methods are the same as the ones to which a
     * controller method is mapped.
     */
    RequestMethod[] methods() default {};
    
    String allowCredentials() default "";
    
    /**
     * The maximum age (in seconds) of the cache duration for preflight responses.
     * <p>This property controls the value of the {@code Access-Control-Max-Age}
     * response header of preflight requests.
     * <p>Setting this to a reasonable value can reduce the number of preflight
     * request/response interactions required by the browser.
     * A negative value means <em>undefined</em>.
     * <p>By default this is set to {@code 1800} seconds (30 minutes).
     */
    long maxAge() default -1;
}
 //根据CrossOrigin的注释可以再请求参数的不存在的时候,CORS支持的方法和Mapper支持的方法一致
@CrossOrigin(origins = "http://localhost:9000")
@GetMapping("/test")
public Greeting greeting(@RequestParam(required=false, defaultValue="World") String name) {
    System.out.println("==== in tesing ====");
    return "SUCCESS";
}
```  
方式2
```java
 @Bean
  @SuppressWarnings("deprecation")
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurerAdapter() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        log.info("CORS 配置参数 origins = {}  url = {}", allowedOrigins, allowedUrl);
        registry
            .addMapping("/**")
            .allowedMethods("GET", "POST", "PATCH", "DELETE", "PUT", "OPTIONS")
            .allowedOrigins("http://localhost:9090");
      }
    };
  }
```

# 41. 跨站脚本攻击XSS
<a href="#menu" style="float:right">目录</a>

## 41.1. 简介
<a href="#menu" style="float:right">目录</a>
* 全称 Cross Site Script,为与CSS区别，使用XSS
* 概念
    * 通过HTML注入篡改了网页，插入恶意的脚本，从而在用户浏览网页的时候，控制用户浏览器的一种攻击。
    * 这种攻击是跨域的，所以叫跨站脚本。
    * 操作
        * 输入用户名为lxx,输入成功后显示的也是lxx
        * 如果存在恶意的脚本攻击，发送到服务器的为 < script>alter(xxx)</ script>
        * 页面显示将会弹出弹框 
* 根据效果区分
    * 反射型
        * 用户点击一个恶意链接，才能攻击成功
        * 脚本不会传输到服务器
    * 存储型
        * 恶意脚本将会存储到服务端
        * 比如在一篇博客中嵌入恶意脚本，用户访问时将会执行这段恶意代码

## 41.2. XSS攻击
<a href="#menu" style="float:right">目录</a>

## 41.3. XSS防御
<a href="#menu" style="float:right">目录</a>

* 服务端设置Cookie时，将属性设置为HttpOnly,将禁止页面的js访问该Cookie
    * Cookie的使用过程
        * 浏览器向服务器发起请求，这个时候没有Cookie
        * 服务器返回时发送Set-Cookie头，向客户端浏览器写入Cookie
        * 在该Cookie到期前，浏览器访问该域下的所有请求，都将发送该Cookie
        * 服务器可以设置多个Cookie,HttpOnl可以有选择性的设置
* 输入检查
    * 比如电话邮箱正确性校验，特殊字符校验
* 输出编码
    * 服务器返回的参数进行编码
    * 即死恶意脚本获取到编码后的数据，可能也无法破解出原始数据


# 42. 跨站点请求伪造CSRF

<a href="#menu" style="float:right">目录</a>

## 42.1. 基本概念
* Cross Site Request Forgery
 
# 43. 点击劫持
<a href="#menu" style="float:right">目录</a>

# 44. HTML5安全
<a href="#menu" style="float:right">目录</a>

# 45. 注入攻击
<a href="#menu" style="float:right">目录</a>

# 46. 文件上传漏洞
<a href="#menu" style="float:right">目录</a>

# 47. 认证和会话管理
<a href="#menu" style="float:right">目录</a>

# 48. 访问控制
<a href="#menu" style="float:right">目录</a>

# 49. 加密算法和随机数
<a href="#menu" style="float:right">目录</a>

# 50. WEB框架安全
<a href="#menu" style="float:right">目录</a>

# 51. 应用拒绝服务攻击
<a href="#menu" style="float:right">目录</a>

# 52. WEB SERVER配置安全
<a href="#menu" style="float:right">目录</a>

