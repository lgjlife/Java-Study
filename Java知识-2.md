---
puppeteer:
    landscape: true
    format: "A4"
    timeout: 50000 # <= 特殊设置，意味着等待（waitFor） 3000 毫秒
---


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
            - [1.3.9.6. NioEventLoop 源码分析](#1396-nioeventloop-源码分析)
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
- [2. 消息中间件](#2-消息中间件)
    - [2.1. 消息中间件对比](#21-消息中间件对比)
    - [2.2. 消息队列的作用](#22-消息队列的作用)
    - [2.3. 消息堆积处理](#23-消息堆积处理)
    - [2.4. 消息幂等性](#24-消息幂等性)
    - [2.5. 消息顺序性](#25-消息顺序性)
    - [2.6. JMS,AMQP,MQTT区别与联系](#26-jmsamqpmqtt区别与联系)
        - [2.6.1. Java消息传递服务（Java Messaging Service (JMS)）](#261-java消息传递服务java-messaging-service-jms)
            - [2.6.1.1. 简介](#2611-简介)
            - [2.6.1.2. 体系架构](#2612-体系架构)
            - [2.6.1.3. JMS对象模型](#2613-jms对象模型)
            - [2.6.1.4. JMS消息模型](#2614-jms消息模型)
            - [2.6.1.5. 接收消息](#2615-接收消息)
            - [2.6.1.6. JMS消息结构（Message）](#2616-jms消息结构message)
        - [2.6.2. 高级消息队列协议（Advanced Message Queueing Protocol (AMQP)）](#262-高级消息队列协议advanced-message-queueing-protocol-amqp)
            - [2.6.2.1. AMQP 是什么](#2621-amqp-是什么)
            - [2.6.2.2. AMQP模型](#2622-amqp模型)
            - [2.6.2.3. Exchange交换机](#2623-exchange交换机)
            - [2.6.2.4. Queue队列](#2624-queue队列)
            - [2.6.2.5. Consumer消费者](#2625-consumer消费者)
            - [2.6.2.6. 消息机制](#2626-消息机制)
            - [2.6.2.7. 其他](#2627-其他)
        - [2.6.3. 消息队列遥测传输（Message Queueing Telemetry Transport (MQTT)）](#263-消息队列遥测传输message-queueing-telemetry-transport-mqtt)
            - [2.6.3.1. 简述](#2631-简述)
            - [2.6.3.2. 设计规范](#2632-设计规范)
            - [2.6.3.3. 主要特性](#2633-主要特性)
            - [2.6.3.4. MQTT协议原理](#2634-mqtt协议原理)
            - [2.6.3.5. MQTT协议数据包结构](#2635-mqtt协议数据包结构)
    - [2.7. 面试准备](#27-面试准备)
- [3. Kafka](#3-kafka)
    - [3.1. 概述](#31-概述)
        - [3.1.1. 架构](#311-架构)
        - [3.1.2. 基本概念](#312-基本概念)
        - [3.1.3. 快速理解](#313-快速理解)
    - [3.2. 安装配置](#32-安装配置)
        - [3.2.1. 安装&&启动](#321-安装启动)
        - [3.2.2. 配置](#322-配置)
    - [3.3. Kafka生产者](#33-kafka生产者)
        - [3.3.1. 生产者例子](#331-生产者例子)
        - [3.3.2. 生产者配置](#332-生产者配置)
        - [3.3.3. 序列化器](#333-序列化器)
        - [3.3.4. 分区](#334-分区)
    - [3.4. Kafka消费者](#34-kafka消费者)
        - [3.4.1. 消费者和消费者群组](#341-消费者和消费者群组)
        - [3.4.2. 消费者实例](#342-消费者实例)
        - [3.4.3. 消费者配置](#343-消费者配置)
        - [3.4.4. 提交和偏移量](#344-提交和偏移量)
            - [3.4.4.1. 自动提交](#3441-自动提交)
            - [3.4.4.2. 提交当前偏移量](#3442-提交当前偏移量)
            - [3.4.4.3. 异步提交](#3443-异步提交)
            - [3.4.4.4. 同步和异步组合提交](#3444-同步和异步组合提交)
            - [3.4.4.5. 提交特定的偏移量](#3445-提交特定的偏移量)
        - [3.4.5. 再均衡监听器](#345-再均衡监听器)
        - [3.4.6. 从特定偏移量处开始处理](#346-从特定偏移量处开始处理)
        - [3.4.7. 如何退出](#347-如何退出)
        - [3.4.8. 独立消费者](#348-独立消费者)
    - [3.5. 深入Kafka](#35-深入kafka)
        - [3.5.1. 集群成员关系](#351-集群成员关系)
        - [3.5.2. 控制器](#352-控制器)
        - [3.5.3. 协调器](#353-协调器)
        - [3.5.4. 网络通信服务](#354-网络通信服务)
        - [3.5.5. 日志管理](#355-日志管理)
            - [3.5.5.1. 日志结构](#3551-日志结构)
            - [3.5.5.2. 日志管理器启动过程](#3552-日志管理器启动过程)
            - [3.5.5.3. 日志加载及恢复](#3553-日志加载及恢复)
            - [3.5.5.4. 日志清理](#3554-日志清理)
        - [3.5.6. 复制](#356-复制)
        - [3.5.7. 处理请求](#357-处理请求)
        - [3.5.8. 生产请求](#358-生产请求)
        - [3.5.9. 获取请求](#359-获取请求)
        - [3.5.10. 其他请求](#3510-其他请求)
        - [3.5.11. 物理存储](#3511-物理存储)
    - [3.6. 可靠的数据传递](#36-可靠的数据传递)
        - [3.6.1. 可靠性保证](#361-可靠性保证)
        - [3.6.2. 复制](#362-复制)
        - [3.6.3. broker配置](#363-broker配置)
        - [3.6.4. 在可靠的系统里使用生产者](#364-在可靠的系统里使用生产者)
        - [3.6.5. 在可靠的系统里使用消费者](#365-在可靠的系统里使用消费者)
        - [3.6.6. 验证系统可靠性](#366-验证系统可靠性)
    - [3.7. 构建数据管道](#37-构建数据管道)
    - [3.8. 跨越集群数据镜像](#38-跨越集群数据镜像)
        - [3.8.1. 跨集群镜像的使用场景](#381-跨集群镜像的使用场景)
        - [3.8.2. 多集群架构](#382-多集群架构)
    - [3.9. 管理Kafaka](#39-管理kafaka)
    - [3.10. 监控Kafka](#310-监控kafka)
        - [3.10.1. broker的度量指标](#3101-broker的度量指标)
        - [3.10.2. 非同步分区](#3102-非同步分区)
        - [3.10.3. broker度量指标](#3103-broker度量指标)
        - [3.10.4. 主题和分区的度量指标](#3104-主题和分区的度量指标)
        - [3.10.5. Java虚拟机监控](#3105-java虚拟机监控)
        - [3.10.6. 操作系统监控](#3106-操作系统监控)
        - [3.10.7. 日志](#3107-日志)
        - [3.10.8. 客户端监控](#3108-客户端监控)
        - [3.10.9. 生产者度量指标](#3109-生产者度量指标)
        - [3.10.10. 消费者度量指标](#31010-消费者度量指标)
        - [3.10.11. 配额](#31011-配额)
        - [3.10.12. 延迟监控](#31012-延迟监控)
        - [3.10.13. 端到端监控](#31013-端到端监控)
    - [3.11. 流式处理](#311-流式处理)
        - [3.11.1. 什么是流式处理](#3111-什么是流式处理)
        - [3.11.2. 流式处理的概念](#3112-流式处理的概念)
        - [3.11.3. 使用场景](#3113-使用场景)
        - [3.11.4. 流式处理的设计模式](#3114-流式处理的设计模式)
        - [3.11.5. 实例](#3115-实例)
        - [3.11.6. 架构概览](#3116-架构概览)
        - [3.11.7. 如何选择流式处理框架](#3117-如何选择流式处理框架)
- [4. RocketMQ消息中间件](#4-rocketmq消息中间件)
    - [4.1. 基本介绍](#41-基本介绍)
        - [4.1.1. 模块说明](#411-模块说明)
        - [4.1.2. 配置参数](#412-配置参数)
        - [4.1.3. 底层通信实现](#413-底层通信实现)
        - [4.1.4. RocketMQ源代码的目录结构](#414-rocketmq源代码的目录结构)
        - [4.1.5. 设计理念](#415-设计理念)
        - [4.1.6. 设计目标](#416-设计目标)
        - [4.1.7. 常用面试题](#417-常用面试题)
    - [4.2. 安装配置](#42-安装配置)
    - [4.3. 基本使用](#43-基本使用)
        - [4.3.1. **基本的例子**](#431-基本的例子)
        - [4.3.2. **顺序发送**](#432-顺序发送)
        - [4.3.3. **广播发送**](#433-广播发送)
        - [4.3.4. **定时发送**](#434-定时发送)
        - [4.3.5. **批量发送**](#435-批量发送)
        - [4.3.6. **过滤**](#436-过滤)
        - [4.3.7. **日志appender**](#437-日志appender)
        - [4.3.8. **事务消息**](#438-事务消息)
    - [4.4. 协调者NameServer](#44-协调者nameserver)
        - [4.4.1. 路由元信息](#441-路由元信息)
    - [4.5. 生产者](#45-生产者)
        - [4.5.1. 消息发送方式](#451-消息发送方式)
        - [4.5.2. 生产者API](#452-生产者api)
        - [4.5.3. 队列选择器](#453-队列选择器)
        - [4.5.4. 发送流程分析](#454-发送流程分析)
        - [4.5.5. 默认的队列选择](#455-默认的队列选择)
    - [4.6. 消费者](#46-消费者)
        - [4.6.1. 消息消费概述](#461-消息消费概述)
        - [4.6.2. 消息消费推/拉方式](#462-消息消费推拉方式)
        - [4.6.3. 提高 Consumer 处理能力](#463-提高-consumer-处理能力)
        - [4.6.4. Consumer 的负载均衡](#464-consumer-的负载均衡)
        - [4.6.5. 定时消息](#465-定时消息)
    - [4.7. 消息存储](#47-消息存储)
        - [4.7.1. 消息存储结构](#471-消息存储结构)
        - [4.7.2. 消息队列与索引文件恢复](#472-消息队列与索引文件恢复)
            - [4.7.2.1. Broker 正常停止文件恢复](#4721-broker-正常停止文件恢复)
            - [4.7.2.2. Broker 异常停止文件恢复](#4722-broker-异常停止文件恢复)
        - [4.7.3. 文件刷盘机制](#473-文件刷盘机制)
        - [4.7.4. 过期文件删除机制](#474-过期文件删除机制)
    - [4.8. 高可用机制](#48-高可用机制)
        - [4.8.1. 动态增减broker](#481-动态增减broker)
        - [4.8.2. 各种故障对消息的影响](#482-各种故障对消息的影响)
    - [4.9. 顺序消息](#49-顺序消息)
    - [4.10. 消息饥饿问题](#410-消息饥饿问题)
    - [4.11. 消息过滤](#411-消息过滤)
    - [4.12. 事务消息](#412-事务消息)
        - [4.12.1. 事务实现思想](#4121-事务实现思想)
        - [4.12.2. 事务消息发送流程](#4122-事务消息发送流程)
        - [4.12.3. 提交或者回滚事务](#4123-提交或者回滚事务)
        - [4.12.4. 事务消息回查事务状态](#4124-事务消息回查事务状态)
    - [4.13. 基于Netty的通信实现](#413-基于netty的通信实现)
- [5. Zookeeper](#5-zookeeper)
    - [5.1. 基本概念](#51-基本概念)
        - [5.1.1. zk架构](#511-zk架构)
        - [5.1.2. 提供的功能](#512-提供的功能)
        - [5.1.3. 节点类型](#513-节点类型)
- [6. FastDfs](#6-fastdfs)
    - [6.1. 为什么要使用分布式文件系统](#61-为什么要使用分布式文件系统)
        - [6.1.1. 单机时代](#611-单机时代)
        - [6.1.2. 独立文件服务器](#612-独立文件服务器)
        - [6.1.3. 分布式文件系统](#613-分布式文件系统)
    - [6.2. 基本概念](#62-基本概念)
        - [6.2.1. 什么是FastDFS](#621-什么是fastdfs)
    - [6.3. 工作流程](#63-工作流程)
        - [6.3.1. 文件上传](#631-文件上传)
        - [6.3.2. 文件下载](#632-文件下载)
    - [6.4. FastDFS为什么要结合Nginx](#64-fastdfs为什么要结合nginx)
    - [6.5. 配置文件说明](#65-配置文件说明)
    - [6.6. FastDFS 同步机制说明：](#66-fastdfs-同步机制说明)
    - [6.7. 安装配置](#67-安装配置)
    - [6.8. Java客户端使用](#68-java客户端使用)
- [7. 性能调优](#7-性能调优)
    - [7.1. 性能调优概述](#71-性能调优概述)
    - [7.2. 操作系统性能监控](#72-操作系统性能监控)
    - [7.3. 使用JMH做Benchmark基准测试](#73-使用jmh做benchmark基准测试)
    - [7.4. JVM](#74-jvm)
        - [7.4.1. JIT编译器](#741-jit编译器)
            - [7.4.1.1. 概述](#7411-概述)
        - [7.4.2. JVM内存模型](#742-jvm内存模型)
        - [7.4.3. JVM的内存空间](#743-jvm的内存空间)
            - [7.4.3.1. 对象内存布局](#7431-对象内存布局)
            - [7.4.3.2. 对象访问定位](#7432-对象访问定位)
        - [7.4.4. 垃圾回收算法](#744-垃圾回收算法)
            - [7.4.4.1. 对象回收判定](#7441-对象回收判定)
            - [7.4.4.2. 对象引用分类](#7442-对象引用分类)
            - [7.4.4.3. 标记清除算法](#7443-标记清除算法)
            - [7.4.4.4. 复制算法](#7444-复制算法)
            - [7.4.4.5. 标记整理算法](#7445-标记整理算法)
            - [7.4.4.6. 分代收集算法](#7446-分代收集算法)
        - [7.4.5. 垃圾收集器](#745-垃圾收集器)
            - [7.4.5.1. Serial收集器](#7451-serial收集器)
            - [7.4.5.2. ParNew收集器](#7452-parnew收集器)
            - [7.4.5.3. Parallel Scavenge收集器](#7453-parallel-scavenge收集器)
            - [7.4.5.4. Serial Old收集器](#7454-serial-old收集器)
            - [7.4.5.5. Parallel Old收集器](#7455-parallel-old收集器)
            - [7.4.5.6. CMS收集器](#7456-cms收集器)
            - [7.4.5.7. G1收集器](#7457-g1收集器)
        - [7.4.6. 内存分配和回收策略](#746-内存分配和回收策略)
        - [7.4.7. JVM相关参数介绍](#747-jvm相关参数介绍)
        - [7.4.8. 性能监控与故障处理工具](#748-性能监控与故障处理工具)
            - [7.4.8.1. JDK命令行工具](#7481-jdk命令行工具)
            - [7.4.8.2. Jdk可视化工具](#7482-jdk可视化工具)
        - [7.4.9. JVM性能调优](#749-jvm性能调优)
        - [7.4.10. 类文件结构](#7410-类文件结构)
        - [7.4.11. 类加载器](#7411-类加载器)
- [8. Elasticsearch搜索引擎](#8-elasticsearch搜索引擎)
    - [8.1. 基本概念](#81-基本概念)
    - [8.2. Elasticsearch工作流程](#82-elasticsearch工作流程)
        - [8.2.1. 启动过程](#821-启动过程)
        - [8.2.2. 故障检测](#822-故障检测)
        - [8.2.3. 与El通信](#823-与el通信)
            - [8.2.3.1. 索引数据](#8231-索引数据)
            - [8.2.3.2. 查询数据](#8232-查询数据)
    - [8.3. 安装与配置](#83-安装与配置)
        - [8.3.1. 配置文件说明](#831-配置文件说明)
            - [8.3.1.1. elasticsearch.yml](#8311-elasticsearchyml)
    - [8.4. 索引](#84-索引)
        - [8.4.1. 索引](#841-索引)
        - [8.4.2. 映射配置](#842-映射配置)
    - [8.5. 集群管理](#85-集群管理)
        - [8.5.1. 集群健康](#851-集群健康)
        - [8.5.2. 添加索引](#852-添加索引)
    - [8.6. 数据](#86-数据)
        - [8.6.1. 文档](#861-文档)
        - [8.6.2. 处理冲突](#862-处理冲突)
    - [8.7. 分布式增删改查](#87-分布式增删改查)
        - [8.7.1. 路由文档到分片](#871-路由文档到分片)
        - [8.7.2. 分片交互](#872-分片交互)
            - [8.7.2.1. 新建，索引和删除文档](#8721-新建索引和删除文档)
            - [8.7.2.2. 索引文档](#8722-索引文档)
    - [8.8. 面试小结之Elasticsearch篇](#88-面试小结之elasticsearch篇)
- [9. 高并发网站设计](#9-高并发网站设计)
    - [9.1. 概述](#91-概述)
        - [9.1.1. 高并发原则](#911-高并发原则)
        - [9.1.2. 高可用原则](#912-高可用原则)
    - [9.2. 负载均衡](#92-负载均衡)
        - [9.2.1. 什么是负载均衡](#921-什么是负载均衡)
        - [9.2.2. 硬件负载均衡](#922-硬件负载均衡)
        - [9.2.3. 四层和七层负载均衡的区别？](#923-四层和七层负载均衡的区别)
            - [9.2.3.1. 技术原理上的区别。](#9231-技术原理上的区别)
            - [9.2.3.2. 应用场景的需求。](#9232-应用场景的需求)
            - [9.2.3.3. 七层应用需要考虑的问题。](#9233-七层应用需要考虑的问题)
        - [9.2.4. 负载均衡的算法](#924-负载均衡的算法)
            - [9.2.4.1. 随机算法](#9241-随机算法)
            - [9.2.4.2. 轮询及加权轮询](#9242-轮询及加权轮询)
            - [9.2.4.3. 最小连接及加权最小连接](#9243-最小连接及加权最小连接)
            - [9.2.4.4. 哈希算法](#9244-哈希算法)
            - [9.2.4.5. IP地址散列](#9245-ip地址散列)
            - [9.2.4.6. URL散列](#9246-url散列)
            - [9.2.4.7. 一致性哈希算法](#9247-一致性哈希算法)
        - [9.2.5. 负载均衡的实现（DNS > 数据链路层 > IP层 > Http层）](#925-负载均衡的实现dns--数据链路层--ip层--http层)
            - [9.2.5.1. DNS域名解析负载均衡（延迟）](#9251-dns域名解析负载均衡延迟)
            - [9.2.5.2. 数据链路层负载均衡(LVS)](#9252-数据链路层负载均衡lvs)
            - [9.2.5.3. IP负载均衡(SNAT)](#9253-ip负载均衡snat)
            - [9.2.5.4. HTTP重定向负载均衡(少见)](#9254-http重定向负载均衡少见)
            - [9.2.5.5. 反向代理负载均衡(nginx)](#9255-反向代理负载均衡nginx)
    - [9.3. 隔离](#93-隔离)
        - [9.3.1. 概述](#931-概述)
    - [9.4. 限流](#94-限流)
        - [9.4.1. 概述](#941-概述)
        - [9.4.2. 限流算法](#942-限流算法)
            - [9.4.2.1. 计数器法](#9421-计数器法)
            - [9.4.2.2. 滑动窗口](#9422-滑动窗口)
            - [9.4.2.3. 漏桶算法](#9423-漏桶算法)
            - [9.4.2.4. 令牌桶算法](#9424-令牌桶算法)
        - [9.4.3. 应用级限流](#943-应用级限流)
            - [9.4.3.1. 限流总并发数/连接/请求数](#9431-限流总并发数连接请求数)
            - [9.4.3.2. 限流总资源数](#9432-限流总资源数)
            - [9.4.3.3. 限流某个接口的总并发数/请求数](#9433-限流某个接口的总并发数请求数)
            - [9.4.3.4. 限流某个接口的时间窗请求数](#9434-限流某个接口的时间窗请求数)
            - [9.4.3.5. 平滑限流某个接口的请求数](#9435-平滑限流某个接口的请求数)
        - [9.4.4. 分布式限流](#944-分布式限流)
            - [9.4.4.1. Redis与Lua](#9441-redis与lua)
            - [9.4.4.2. Nginx](#9442-nginx)
    - [9.5. 降级](#95-降级)
        - [9.5.1. 降级概念](#951-降级概念)
        - [9.5.2. 使用Hystrix实现降级](#952-使用hystrix实现降级)
            - [9.5.2.1. 降级Demo](#9521-降级demo)
            - [9.5.2.2. 降级参数](#9522-降级参数)
            - [9.5.2.3. 熔断](#9523-熔断)
            - [9.5.2.4. 采样统计](#9524-采样统计)
            - [9.5.2.5. 线程/信号量隔离](#9525-线程信号量隔离)
    - [9.6. 回滚机制](#96-回滚机制)
        - [9.6.1. 事务回滚](#961-事务回滚)
        - [9.6.2. 代码库回滚](#962-代码库回滚)
        - [9.6.3. 部署版本回滚](#963-部署版本回滚)
        - [9.6.4. 静态资源回滚](#964-静态资源回滚)
    - [9.7. 压测与预案](#97-压测与预案)
        - [9.7.1. 系统压测](#971-系统压测)
            - [9.7.1.1. 线下压测](#9711-线下压测)
            - [9.7.1.2. 线上压测](#9712-线上压测)
        - [9.7.2. 系统优化和容灾](#972-系统优化和容灾)
    - [9.8. 缓存](#98-缓存)
        - [9.8.1. 应用级缓存](#981-应用级缓存)
            - [9.8.1.1. 缓存命中率](#9811-缓存命中率)
            - [9.8.1.2. 缓存回收策略](#9812-缓存回收策略)
            - [9.8.1.3. 回收算法](#9813-回收算法)
                - [9.8.1.3.1. FIFO](#98131-fifo)
                - [9.8.1.3.2. LRU](#98132-lru)
                - [9.8.1.3.3. LFU](#98133-lfu)
                - [9.8.1.3.4. LRFU](#98134-lrfu)
            - [9.8.1.4. Java 缓存类型](#9814-java-缓存类型)
                - [9.8.1.4.1. 堆缓存](#98141-堆缓存)
                - [9.8.1.4.2. 堆外缓存](#98142-堆外缓存)
                - [9.8.1.4.3. 磁盘缓存](#98143-磁盘缓存)
                - [9.8.1.4.4. 分布式缓存](#98144-分布式缓存)
                - [9.8.1.4.5. 多级缓存](#98145-多级缓存)
            - [9.8.1.5. 应用级缓存示例](#9815-应用级缓存示例)
            - [9.8.1.6. 缓存使用模式实践](#9816-缓存使用模式实践)
                - [9.8.1.6.1. Cache-Aside](#98161-cache-aside)
                - [9.8.1.6.2. Cache-As-SOR](#98162-cache-as-sor)
                - [9.8.1.6.3. Read-Through](#98163-read-through)
                - [9.8.1.6.4. Write-Through](#98164-write-through)
                - [9.8.1.6.5. Write-Behind](#98165-write-behind)
                - [9.8.1.6.6. Copy-Pattern](#98166-copy-pattern)
            - [9.8.1.7. 缓存一致性处理](#9817-缓存一致性处理)
            - [9.8.1.8. 缓存异常处理](#9818-缓存异常处理)
                - [9.8.1.8.1. 缓存穿透](#98181-缓存穿透)
                - [9.8.1.8.2. 缓存击穿](#98182-缓存击穿)
                - [9.8.1.8.3. 缓存雪崩](#98183-缓存雪崩)
                - [9.8.1.8.4. 解决方案](#98184-解决方案)
                - [9.8.1.8.5. 缓存并发问题](#98185-缓存并发问题)
        - [9.8.2. HTTP缓存](#982-http缓存)
            - [9.8.2.1. 浏览器缓存](#9821-浏览器缓存)
            - [9.8.2.2. CDN缓存](#9822-cdn缓存)
            - [9.8.2.3. NGINX缓存](#9823-nginx缓存)
        - [9.8.3. 多级缓存](#983-多级缓存)
            - [9.8.3.1. 多级缓存介绍](#9831-多级缓存介绍)
            - [9.8.3.2. 如何缓存数据](#9832-如何缓存数据)
    - [9.9. 系统稳定性](#99-系统稳定性)
        - [9.9.1. 在线日志分析](#991-在线日志分析)
            - [9.9.1.1. 日志分析常用命令](#9911-日志分析常用命令)
        - [9.9.2. 集群监控](#992-集群监控)
        - [9.9.3. 流量控制](#993-流量控制)
        - [9.9.4. 性能优化](#994-性能优化)
        - [9.9.5. Java故障排查](#995-java故障排查)
- [10. 分布式系统](#10-分布式系统)
    - [10.1. 基本概念](#101-基本概念)
    - [10.2. 大型网站的特点](#102-大型网站的特点)
        - [10.2.1. 特点](#1021-特点)
        - [10.2.2. 模式](#1022-模式)
    - [10.3. 常用的RPC框架](#103-常用的rpc框架)
        - [10.3.1. Thrift](#1031-thrift)
        - [10.3.2. gRPC](#1032-grpc)
    - [10.4. Dubbo](#104-dubbo)
        - [10.4.1. 架构](#1041-架构)
        - [10.4.2. 功能](#1042-功能)
        - [10.4.3. 连接协议](#1043-连接协议)
            - [10.4.3.1. dubbo](#10431-dubbo)
            - [10.4.3.2. rmi](#10432-rmi)
            - [10.4.3.3. hessian](#10433-hessian)
            - [10.4.3.4. http](#10434-http)
            - [10.4.3.5. webservice](#10435-webservice)
            - [10.4.3.6. thrift](#10436-thrift)
            - [10.4.3.7. memcached](#10437-memcached)
            - [10.4.3.8. redis](#10438-redis)
            - [10.4.3.9. rest](#10439-rest)
    - [10.5. 架构演进](#105-架构演进)
    - [10.6. Java 中间件](#106-java-中间件)
    - [10.7. 序列化机制](#107-序列化机制)
        - [10.7.1. 基本概念](#1071-基本概念)
        - [10.7.2. 常用序列化方式性能比较](#1072-常用序列化方式性能比较)
        - [10.7.3. 常用序列化方式实现](#1073-常用序列化方式实现)
            - [10.7.3.1. JDK方式](#10731-jdk方式)
            - [10.7.3.2. FastJSON](#10732-fastjson)
            - [10.7.3.3. Hessian](#10733-hessian)
            - [10.7.3.4. Protostuff](#10734-protostuff)
    - [10.8. 定时任务](#108-定时任务)
    - [10.9. Cron表达式](#109-cron表达式)
        - [10.9.1. Spring Scheduler](#1091-spring-scheduler)
        - [10.9.2. Quartz](#1092-quartz)
            - [10.9.2.1. Quartz 核心概念](#10921-quartz-核心概念)
    - [10.10. 分布式ID](#1010-分布式id)
        - [10.10.1. 应用场景](#10101-应用场景)
        - [10.10.2. 分布式ID生成方案](#10102-分布式id生成方案)
    - [10.11. 分布式锁](#1011-分布式锁)
        - [10.11.1. 使用数据库实现](#10111-使用数据库实现)
        - [10.11.2. Redis实现分布式锁](#10112-redis实现分布式锁)
        - [10.11.3. Zookeeper实现分布式锁](#10113-zookeeper实现分布式锁)
    - [10.12. 微服务化](#1012-微服务化)
        - [10.12.1. 微服务和SOA](#10121-微服务和soa)
        - [10.12.2. 拆分原则](#10122-拆分原则)
    - [10.13. 消息机制](#1013-消息机制)
    - [10.14. 流量限流](#1014-流量限流)
    - [10.15. 幂等设计](#1015-幂等设计)
    - [10.16. 数据一致性](#1016-数据一致性)
        - [10.16.1. CAP理论](#10161-cap理论)
        - [10.16.2. Base理论](#10162-base理论)
    - [10.17. 分布式事务实现](#1017-分布式事务实现)
    - [10.18. 负载均衡算法](#1018-负载均衡算法)
    - [10.19. 服务容错设计](#1019-服务容错设计)
    - [10.20. 集群](#1020-集群)
    - [10.21. 分库分表](#1021-分库分表)
    - [10.22. 反向代理&正向代理](#1022-反向代理正向代理)
    - [10.23. 客户端优化](#1023-客户端优化)
- [11. 网络安全](#11-网络安全)
    - [11.1. 浏览器安全](#111-浏览器安全)
        - [11.1.1. 同源策略](#1111-同源策略)
    - [11.2. 常见的WEB攻击手段](#112-常见的web攻击手段)
        - [11.2.1. 跨站脚本攻击XSS](#1121-跨站脚本攻击xss)
        - [11.2.2. 跨站点请求伪造CSRF](#1122-跨站点请求伪造csrf)
        - [11.2.3. SQL注入攻击](#1123-sql注入攻击)
        - [11.2.4. 文件上传漏洞](#1124-文件上传漏洞)
        - [11.2.5. DOS攻击](#1125-dos攻击)
    - [11.3. 常见的安全算法](#113-常见的安全算法)
        - [11.3.1. 数字摘要](#1131-数字摘要)
        - [11.3.2. 对称加密算法](#1132-对称加密算法)
        - [11.3.3. 非对称加密算法](#1133-非对称加密算法)
        - [11.3.4. 数字签名](#1134-数字签名)
        - [11.3.5. 数字证书](#1135-数字证书)

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
* 如果业务简单，���以很快完成，就直接在IO线程中进行处理。业务复杂，耗时较长，就另起业务线程进行处理。

#### 1.3.9.6. NioEventLoop 源码分析

![NioEventLoop继承体系](https://github.com/lgjlife/Java-Study/blob/master/pic/netty/NioEventLoop.png?raw=true)

```java
public final class NioEventLoop extends SingleThreadEventLoop
```

* NioEventLoop作用
    * IO线程的读写
    * 系统Task,通过调用NioEventLoop的execute(Runable task)方法实现，Netty有很多系统Task,创建它们的主要原因是：当IO线程和用户线程同时操作网络资源时，为了防止并发操作导致的锁竞争，将用户线程的操作封装成Task放入消息队列，由IO线程负责执行，这样就实现了局部无锁化。
    * 定时任务,通过NioEventLoop的schedule(Runnable command, long delay, TimeUnit unit) 实现。

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




<span id="menu">




# 2. 消息中间件


## 2.1. 消息中间件对比

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

## 2.2. 消息队列的作用
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


## 2.3. 消息堆积处理
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

## 2.4. 消息幂等性
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

## 2.5. 消息顺序性
<a href="#menu" style="float:right">目录</a>

 顺序性指的是在一些具体的业务中，前后的业务操作必须有顺序，否则会导致业务处理错误。例如在电商系统中，订单和支付通常是两个不同的业务逻辑，我们通常会将其分拆开来处理。这两个业务逻辑之间存在非常清晰的依赖关系：需要先生成订单，然后才能支付订单。对于这种情况，我们就说订单消息和支付消息是有顺序性的。

对于消息中间件的消息顺序性问题，一般通用的处理方案是保证局部的消息有序。例如对于 Kafka 来说，我们会保证 Partition 区域的消息有序性。对于上面所说的订单消息、支付消息的例子，我们一般会将订单消息和支付消息里的用户ID作为key，将其分配到同一个 partition 中，这样它们就是有序的。

## 2.6. JMS,AMQP,MQTT区别与联系
<a href="#menu" style="float:right">目录</a>


消息传递作为基本通信机制已经在全世界成功运用。无论是人与人、机器与人还是机器与机器之间，消息传递一直都是唯一常用的通信方式。在双方（或更多）之间交换消息有两种基本机制。

同步消息传递
异步消息传递
同步消息传递在这种情况下使用，当消息发送者希望在某个时间范围内收到响应，然后再进行下一个任务。基本上就是他在收到响应前一直处于“阻塞”状态。

异步消息意味着发送者并不要求立即收到响应，而且也不会阻塞整个流程。响应可有可无，发送者总会执行剩下的任务。

上面提到的技术，当两台计算机上的程序相互通信的时候，就广泛使用了异步消息传递。随着微服务架构的兴起，很明显我们需要使用异步消息传递模型来构建服务。

这一直是软件工程中的基本问题，而且不同的人和组织机构会提出不同的方法。我将介绍在企业IT系统中广泛使用的三种最成功的异步消息传递技术。


### 2.6.1. Java消息传递服务（Java Messaging Service (JMS)）

<a href="#menu" style="float:right">目录</a>

#### 2.6.1.1. 简介
<a href="#menu" style="float:right">目录</a>

JMS即Java消息服务（Java Message Service）应用程序接口，是一个Java平台中关于面向消息中间件（MOM-分布式系统的集成）的API，用于在两个应用程序之间，或分布式系统中发送消息，进行异步通信。

JMS是一种与厂商无关的 API，用来访问消息收发系统消息，它类似于JDBC(Java Database Connectivity)。

#### 2.6.1.2. 体系架构
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

#### 2.6.1.3. JMS对象模型
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

#### 2.6.1.4. JMS消息模型
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

#### 2.6.1.5. 接收消息
<a href="#menu" style="float:right">目录</a>

在JMS中，消息的接收可以使用以下两种方式：
|||
|---|---|
|同步|使用同步方式接收消息的话，消息订阅者调用receive()方法。在receive()中，消息未到达或在到达指定时间之前，方法会阻塞，直到消息可用。
|异步|使用异步方式接收消息的话，消息订阅者需注册一个消息监听者，类似于事件监听器，只要消息到达，JMS服务提供者会通过调用监听器的onMessage()递送消息。

#### 2.6.1.6. JMS消息结构（Message）
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


### 2.6.2. 高级消息队列协议（Advanced Message Queueing Protocol (AMQP)）
<a href="#menu" style="float:right">目录</a>

#### 2.6.2.1. AMQP 是什么
<a href="#menu" style="float:right">目录</a>


AMQP（Advanced Message Queuing Protocol，高级消息队列协议）是一个进程间传递异步消息的网络协议。

#### 2.6.2.2. AMQP模型
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

#### 2.6.2.3. Exchange交换机
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

#### 2.6.2.4. Queue队列
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

#### 2.6.2.5. Consumer消费者
<a href="#menu" style="float:right">目录</a>

消息如果只是存储在队列里是没有任何用处的。被应用消费掉，消息的价值才能够体现。在 AMQP 0-9-1 模型中，有两种途径可以达到此目的：

1）将消息投递给应用 (“push API”)
2）应用根据需要主动获取消息 (“pull API”)

使用 push API，应用（application）需要明确表示出它在某个特定队列里所感兴趣的，想要消费的消息。如是，我们可以说应用注册了一个消费者，或者说订阅了一个队列。一个队列可以注册多个消费者，也可以注册一个独享的消费者（当独享消费者存在时，其他消费者即被排除在外）。

每个消费者（订阅者）都有一个叫做消费者标签的标识符。它可以被用来退订消息。消费者标签实际上是一个字符串。

#### 2.6.2.6. 消息机制
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

#### 2.6.2.7. 其他
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

### 2.6.3. 消息队列遥测传输（Message Queueing Telemetry Transport (MQTT)）
<a href="#menu" style="float:right">目录</a>

#### 2.6.3.1. 简述
MQTT（Message Queuing Telemetry Transport，消息队列遥测传输协议），是一种基于发布/订阅（publish/subscribe）模式的"轻量级"通讯协议，该协议构建于TCP/IP协议上，由IBM在1999年发布。MQTT最大优点在于，可以以极少的代码和有限的带宽，为连接远程设备提供实时可靠的消息服务。作为一种低开销、低带宽占用的即时通讯协议，使其在物联网、小型设备、移动应用等方面有较广泛的应用。

MQTT是一个基于客户端-服务器的消息发布/订阅传输协议。MQTT协议是轻量、简单、开放和易于实现的，这些特点使它适用范围非常广泛。在很多情况下，包括受限的环境中，如：机器与机器（M2M）通信和物联网（IoT）。其在，通过卫星链路通信传感器、偶尔拨号的医疗设备、智能家居、及一些小型化设备中已广泛使用。

![](https://static.runoob.com/images/mix/mqtt-fidge-2.svg)

#### 2.6.3.2. 设计规范
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

#### 2.6.3.3. 主要特性
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

#### 2.6.3.4. MQTT协议原理
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

#### 2.6.3.5. MQTT协议数据包结构
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

## 2.7. 面试准备

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
如果让你来动手实现一个分布式消息中间件，整体架构你会如何设计实现?<span id="menu">


# 3. Kafka

## 3.1. 概述
<a href="#menu" style="float:right">目录</a>

### 3.1.1. 架构
<a href="#menu" style="float:right">目录</a>
![](https://images2018.cnblogs.com/blog/1385722/201808/1385722-20180804221732434-2116774825.png)



### 3.1.2. 基本概念
<a href="#menu" style="float:right">目录</a>

* 主题(topic)
    * Kafka消息通过主题进行分类
    * 通过主题进行不同类别的消息分类
    * 生产者把消息发送到主题，消费者订阅主题或者主题的某些分区进行消费
* 消息
    * Kafka的基本单位
    * 由一个固定长度的消息头和可变长度的消息体构成
    * 在老版本中，每一条消息称为Message,新版本Java客户端实现，每一条消息称为Record


* 分区
    * 一个主题可以设置多个分区
    * 主题中的消息将会通过相关负载均衡算法发送到各个分区
    * 消息以追加的方式加入到分区中,是顺序写磁盘，因此效率高
    * 分区可以分布在不同的服务器上，一般会分散在不同的broker上，当只有一个broker时，所有的分区就只分配到该Broker上
    * 使用分区是一是为了保证高可用，一个分区挂了，还有其他分区可用。二是为了提高吞吐率。
    * 消息无法在主题层面保证消息的顺序性，只能保证在单个分区内的顺序性
    * 参数partions用于配置分区数
    * Kafka不会立即删除已被消费的消息，会根据分区的大小或者消息的时间长度进行删除

* 副本
    * 分区分为Leader副本和Follower副本
    * 总副本的数量不能超过broker的数量
    * 只有Leader才处理客户端的读写请求，Follwer副本从Leader副本同步数据，如果Leader失效，会通过相应的算法选举新的Leader副本。也就是谁先向zk注册broker/ids节点谁就选举成功，其他则进行监听
    * 使用副本是为了消息的高可用
    
* 生产者
    * 生产者产生消息，一条消息会被负载均衡到对应主题的各个分区上
    * 生产者也可以自定义分区策略

* 消费者
    * 消费者订阅一个或者多个主题，并按照消息生成的顺序读取它们
    * 消费者通过检查偏移量来区分已经读取过的消息

* 偏移量
    * 任何发布到分区的消息会被直接追加到日志文件(分区目录下.log结尾的日志文件)
    * 每条消息在日志中的位置都会对应一个按序递增的偏移量
    * 偏移量是一个分区下严格按序递增的逻辑值，并不是消息在磁盘上的物理位置
    * Kafka并没有给偏移量再提供索引，消费者可以通过设置不同的偏移量来消费消息
    * 新版本的偏移量不是保存在zk中，而是保存在_consumer_offset的topic中
    * 只有客户端提交偏移量时才会被保存到该topic中，消费者也可以使用其他方式进行保存，比如数据库，重启的时候从数据库中读取。

* 日志段
    * 一个日志又分为多个日志段(LogSegment)
    * 日志段是kafkar日志对象分片的最小单位
    * 日志段也是一个逻辑概念，一个日志段对应磁盘上一个具体日志文件和两个索引文件。日志文件是以 “ .log”为文件名后缀的数据文件，用于保存消息实际数据 。两个索引文件分别以“ .index ”和“ .timeindex ”作为文件名后缀，分别表示消息偏移量索引文件和消息时间戳索引文件。


* 消费组
    * 消费者按组进行区分
    * 同一个主题中的一条消息只能被同一群组的消费者中的消费一次
    * 同一个主题中的一条消息可以被不同的群组共同消费

* broker
    * 一个独立的Kafka服务器被称为broker
    * 接收来自生产者的消息，为消息设置偏移量，并保存到磁盘中
    * 消费者也是通过broker消费消息
    * 在硬件性能的保证下，单个broker可以处理数千个分区以及每秒百万级的消息量

* 集群
    * 多个broker组成集群
    * 每一个集群都有一个broker作为控制器
    * 控制器
        * 从集群的活跃成员中选出来
        * 控制器负责管理工作
        * 包括将分区分配给broker和监控broker

* ISR
    * kafka在zk中动态维护了一个ISR（In-sync-Replica）,用于保存同步的副本列表
    * 保存的是与Leader保持消息同步的所有副本对应的代理节点id.
    * 如果一个 Follower副本岩机（本书用岩机来特指某个代理失效的情景，包括但不限于代理被关闭，如代理被人为关闭或是发生物理故障、心跳检测过期、网络延迟、进程崩溃等）或是落后太多，则该 Follower副本节点将从 ISR 列表中移除 。

* zookeeper作用
    * Kafka 利用 ZooKeeper 保存相应元数据信息， Kafka 元数据信息包括如代理节点信息、 Kafka集群信息、旧版消费者信息及其消费偏移量信息、主题信息、分区状态信息、分区副本分配方案信息、动态配置信息等。
    

* 使用场景
    * 具有高吞吐量来支持诸如实时的日志集这样的大规模事件流。
    * 能够很好地处理大量积压的数据，以便能够周期性地加载离线数据进行处理 。
    * 能够低延迟地处理传统消息应用场景。
    * 能够支持分区、分布式，实时地处理消息，同时具有容错保障机制 。

* 为什么选择kafka
    * 多个生产者
    * 多个消费者
    * 基于磁盘的数据存储
    * 伸缩性
    * 高性能

* kafka特性
    * 消息持久化
    * 高吞吐量
        * Kafka 将数据写到磁盘，充分利用磁盘的顺序读写 。同时， Kafka 在数据写入及数据同步采用了零拷贝（ zero-copy ）技术
        * Kafka 还支持数据压缩及批量发送，同时
        * Kafka 将每个主题划分为多个分区
    * 扩展性
        * 集群动态扩展
    * 多客户端支持
    * Kafka Streams
    * 安全机制
        * 通过 SSL 和 SASL(Kerberos), SASL/PLA时验证机制支持生产者、消费者与代理连接时的身份认证：
        * 支持代理与 ZooKeeper 连接身份验证：
        * 通信时数据加密：
        * 客户端读、写权限认证：
        * Kafka 支持与外部其他认证授权服务的集成 。

    * 数据备份
        * Kafka 可以为每个主题指定副本数，对数据进行持久化备份，这可以 一定程度上防止数据丢失，提高可用性。
    * 轻量级
        * Kafka 的代理是无状态的，即代理不记录消息是否被消费，消费偏移量的管理交由消费者自己或组协调器来维护。同时集群本身几乎不需要生产者和消费者的状态信息，这就使得 Kafka非常轻量级，同时生产者和消费者客户端实现也非常轻量级。

    * 消息压缩
        * Kafka 支持 Gzip, Snappy 、 LZ4 这 3 种压缩方式，通常把多条消息放在一起组成 MessageSet,然后再把 MessageSet 放到一条消息里面去，从而提高压缩比率进而提高吞吐量。

    
### 3.1.3. 快速理解
<a href="#menu" style="float:right">目录</a>


## 3.2. 安装配置
<a href="#menu" style="float:right">目录</a>

### 3.2.1. 安装&&启动

**安装JDK环境**
**安装ZOOKEEPER**
**安装Kafka**

* 从[官网 http://kafka.apache.org/downloads](http://kafka.apache.org/downloads)下载安装包

**启动**

```bash
./kafka-server-start.sh  -daemon  ../config/server.properties
```



### 3.2.2. 配置

* broker配置文件位于目录下的config/server.properties
**broker常用配置**

* broker.id
    * broker标识符，必须为整数，默认值为0
    * 集群中必须唯一
* port 
    * 监听端口
* zookeeper.connect
    * zk连接地址
    * localhost:2181，有多个则使用","间隔
* log.dirs
    * 消息存放路径，不需要配置文件名称
* num.recovery.threads.per.data.dir
    * 对于如下三种情况，Kafka会使用可配置的线程池来处理日志片段
        * 服务器正常启动。用于打开每个分区的日志片段
        * 服务器崩溃后重启，用于检查和截短每个分区的日志片段
        * 服务器正常关闭，用于关闭日志片段 
    * 这些线程只是在服务器启动和关闭时会用到
    * 对于包含大量分区来说，一旦发生崩溃，在进行恢复时提高并行数量可以提高很大的处理效率
    * per.data.dir也就是单个目录的线程数，如果log.dirs配置多个，那么总线程数就相乘的结果
* auto.create.topics.enable
    * 默认情况下，Kafka会在如下几种情形下自动创建主题
        * 当一个生产者开始往主题写入消息时
        * 当一个消费者开始从主题读取消息时
        * 当任意一个客户端向主题发送元数据请求
    * 当设置为true时，碰到以上情形将会自动创建，false时需要手动创建
* num.partitions
    * 主题的默认分区数
        * 如何确定
            * 主题需要达到的吞吐量
            * 从单个分区读取数据的最大吞吐量
            * 每个broker包含的分区数，可用的磁盘空间和网络带宽
            * 如果消息是按照不同的键来写入分区的，那么为已有的主题新增分区就会很困难
            * 单个broker对分区个数是有限制的，因为分区数越多，占用的内存越多，完成首领选择的时间越多
* log.retention.ms
    * 
* log.retention.byte
    * 
* log.segment,bytes
    * 
* message.max.bytes
    * 限制单个消息的大小，默认是1000000（1MB）
    * 如果发送的消息超过这个值，将会返回错误
    * 这个参数限制的是压缩后的大小
    * 值越大，那么负责处理网络连接和请求的线程就需要花越多的时间来处理这些请求，从而影响IO的吞吐量
    * 消费者客户端的fetch.max.bytes如果小于该值，当消息大于fetch.max.bytes将会无法接收这个消息，集群的replca.fetch.max.bytes,也遵循这个原则

**硬件的选择**
* 磁盘吞吐量
* 磁盘容量
* 内存
* 网络
* CPU

**垃圾回收器选项**
* G1参数
    * MaxGCPauseMillis
        * 每次垃圾回收的停顿时间，默认是200ms
    * InitiatingHeapOccupancyPercent
        * 指定了G启动新一轮垃圾回收之前可用的的堆内存百分比，默认是45，也就是堆内存使用率达到45%之前，不会进行垃圾回收操作。这个百分比包括新生代和老年代
    * kafka对堆内存使用率非常高，容易产生垃圾，上面两个只可以设小一些，减少暂停时间以及早一些启动垃圾回收
    * kafka启动脚本使用的是ParallelNew,换成G1需要进行修改
            

## 3.3. Kafka生产者
<a href="#menu" style="float:right">目录</a>

生产者发送流程
![](https://github.com/lgjlife/Java-Study/blob/master/pic/kafka/kafka-producer.png?raw=true)

**发送方式**
* 同步发送
    * 返回Future对象，调用get等待获取结果
* 异步发送
    * 指定回调函数
* 单向发送
    * 不等带发送结果返回
    * 一般用于日志等数据丢失问题不大的场景

### 3.3.1. 生产者例子
<a href="#menu" style="float:right">目录</a>

* 生产者
```java
public class ProducerClientUtil {


    private KafkaProducer kafkaProducer;
    private static String BROKER_LISTS = "localhost:9092,localhost:9093";

    private    AbstractSerialize serialize = HessianSerializeUtil.getSingleton();

    public static ProducerClientUtil  create(){

        ProducerClientUtil producerClientUtil = new ProducerClientUtil();
        KafkaProducer producer = new KafkaProducer(initConfig());
        producerClientUtil.kafkaProducer = producer;
        return producerClientUtil;
    }

    public void   sendData(String TOPIC, String key, String data){

        kafkaProducer.send(new ProducerRecord<String, String>(TOPIC, key, data), new Callback() {
            @Override
            public void onCompletion(RecordMetadata record, Exception e) {
                //log.info("recordMetadata = " + recordMetadata);
                log.info("topic:{}; 分区partition:[{}]; offset:{};",record.topic(),record.partition(),record.offset());
            }
        });
    }

    private static  Properties initConfig(){
        Properties props = new Properties();

        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BROKER_LISTS);
        props.put(ProducerConfig.ACKS_CONFIG, "all");
        props.put(ProducerConfig.RETRIES_CONFIG, 0);
        props.put(ProducerConfig.BATCH_SIZE_CONFIG, 160);
        props.put(ProducerConfig.LINGER_MS_CONFIG, 1);
        props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        return props;
    }

}
```


### 3.3.2. 生产者配置
<a href="#menu" style="float:right">目录</a>

* acks
    * 指定必须有多少个分区副本收到消息，生产者才会认为消息写入是成功的。
    * acks=0
        * 生产者写入消息时不等待服务器的响应就返回，有可能会出现丢消息
    * acks=1
        * 只要集群的首领节点收到消息，就会返回写入成功响应
        * 如果消息无法达到首领节点(还没有选举出来)，生产者会收到一个错误的响应，为了避免丢失消息，生产者会重发消息。如果收到消息的节点成为新首领，消息还是会丢失
    * acks=all
        * 所有复制节点都收到消息才会返回成功响应
* buffer.memory
    * 生产者内存缓冲区的大小，生产者用它缓冲要发送到服务器的消息
    * 如果应用程序发送消息的速度超过发送到服务器的速度，会导致生产者空间不足，继续发送send要么阻塞要么抛出异常，阻塞时间由max.block.ms决定
* compression.type
    * 默认情况不压缩
    * 参数值snappy,gzip,lz4,也就是指定压缩算法
        * snappy
            * 占用较少的cpu，性能和压缩比也比较好
        * gzip
            * 占用更多的CPU，但是可以提供更高的压缩比
            * 压缩比大，说明总字节少，可以减少网络带宽占用
* retries
    * 生产者重发消息的次数
    * 超过则放弃重试返回错误
    * 默认每次重试之间间隔100ms,通过retry.backoff.ms确定
* batch.size
    * 当多个消息需要被发送到同一个topic时，生产者会把它们放在同一个批次
    * 该参数指定一个批次的内存空间(字节数目)
    * 生产者不一定会等待到满了才发送，可能只有一条消息时也会发送

* linger.ms
    * 指定生产者在发送批次之前等待更多消息加入批次的时间
    * 生产者会在批次填满或者到达linger.ms定义的时间后将批次消息统一发送
    * 默认情况下，只要有可用的线程，生产者就会把消息发送出去,就算批次里只有一个消息
* client.id
    * 任意字符串，服务器会用它来识别消息的来源，可以用在日志和配额指标里
* max.in.flight.request.per.connection
    * 指定了生产者在收到服务器响应之前可以发送多少个消息
    * 设置高会占用内存，不过可以提高吞吐量
    
* timeout.ms
    * 指定broker等待同步副本返回消息确认时间，与acks相匹配，如果在时间内未收到回复，将返回错误响应
* request.timeout.ms
    * 指定生产者在发送数据时等待服务器响应的超时时间
* metadata.fetch.timeout.ms
    * 生产者获取元数据(比如目标分区的首领)时的响应超时时间

* max.block.ms
    * 调用send发送数据或者调用partitionsFor获取元数据时生产者的阻塞时间
    * 当生产者的发送缓冲区已满，或者没有可用的元数据时，就会发生阻塞
    * 阻塞时间到，则生产者会抛出异常

* max.request.size
    * 生产者发送请求的大小
    * 指的是单个消息或者一个批次中消息的总大小
* receive.buffer.bytes/send.buffer.bytes
    * TCP socket接收和发送数据包的缓冲区大小
    * 如果为-1，就使用操作系统的默认值
    
### 3.3.3. 序列化器
<a href="#menu" style="float:right">目录</a>

kafka客户端提供了String的序列化方式，用户也可以自行定义
```java
 //序列化方式
 props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
 props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());


 //反序列化方式
props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());

        
```

自行定义需要实现这两个接口Serializer和Deserializer

```java
public interface Serializer<T> extends Closeable {
    void configure(Map<String, ?> var1, boolean var2);

    byte[] serialize(String var1, T var2);

    default byte[] serialize(String topic, Headers headers, T data) {
        return this.serialize(topic, data);
    }

    void close();
}


public interface Deserializer<T> extends Closeable {
    void configure(Map<String, ?> var1, boolean var2);

    T deserialize(String var1, byte[] var2);

    default T deserialize(String topic, Headers headers, byte[] data) {
        return this.deserialize(topic, data);
    }

    void close();
}
```

### 3.3.4. 分区
<a href="#menu" style="float:right">目录</a>

一条完整的消息对象ProducerRecord类型对象,包含topic,key,具体的消息value
```java
public ProducerRecord(String topic, K key, V value) {
        this(topic, (Integer)null, (Long)null, key, value, (Iterable)null);
    }
```
* key为null
    * 使用默认分区器(轮询)，消息会被轮询均衡到各个分区
* key不为null
    * 即使使用默认分区器(轮询)，默认分区器无效
    * 而是使用对key进行散列，根据散猎值决定消息被发到哪个分区

默认分区器
```java
public class DefaultPartitioner implements Partitioner {
    private final ConcurrentMap<String, AtomicInteger> topicCounterMap = new ConcurrentHashMap();

    public DefaultPartitioner() {
    }

    public void configure(Map<String, ?> configs) {
    }

    public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {
        List<PartitionInfo> partitions = cluster.partitionsForTopic(topic);
        int numPartitions = partitions.size();
        if (keyBytes == null) {
            int nextValue = this.nextValue(topic);
            List<PartitionInfo> availablePartitions = cluster.availablePartitionsForTopic(topic);
            if (availablePartitions.size() > 0) {
                int part = Utils.toPositive(nextValue) % availablePartitions.size();
                return ((PartitionInfo)availablePartitions.get(part)).partition();
            } else {
                return Utils.toPositive(nextValue) % numPartitions;
            }
        } else {
            return Utils.toPositive(Utils.murmur2(keyBytes)) % numPartitions;
        }
    }

    private int nextValue(String topic) {
        AtomicInteger counter = (AtomicInteger)this.topicCounterMap.get(topic);
        if (null == counter) {
            counter = new AtomicInteger(ThreadLocalRandom.current().nextInt());
            AtomicInteger currentCounter = (AtomicInteger)this.topicCounterMap.putIfAbsent(topic, counter);
            if (currentCounter != null) {
                counter = currentCounter;
            }
        }

        return counter.getAndIncrement();
    }

    public void close() {
    }
}
```
自定义分区器需要实现Partitioner接口
生产者配置参数 "partitioner.class"进行配置


## 3.4. Kafka消费者
<a href="#menu" style="float:right">目录</a>

### 3.4.1. 消费者和消费者群组
<a href="#menu" style="float:right">目录</a>


* 消费者从属于消费者群组，一个群组里的消费者订阅的是同一个主题，每个消费者接收主题的一部分分区的消息
* 如果群组里的消费者数目**小于**分区的数目，则一个消费者会接收多个分区数据
* 如果群组里的消费者数目**大于**分区的数目，则会有消费者闲置
* 同一个主题不同群组间消费消息不互相影响，通过群组实现了广播和多播

**再均衡**
* 当群组加入或者退出消费者时，就会发生再均衡
* 再均衡期间，群组内的消费者无法读取消息
* 每个群组都有一个群组协调器(broker),不同的群组可以有不同的协调器
* 消费者向群组协调器发送心跳来维持它们和群组的从属关系和它们对分区的所有权关系
* 消费者会在轮询消息或者提交偏移量时发送心跳
* 如果超时未收到消费者心跳消息。协调器将认为消费者已经挂掉，就会触发一次再均衡

**分配分区**
* 当消费者要加入群组时，会向群组发送一个JoinGroup的请求
* 第一个假如群组的将称为群主，群主从协调器那里获得群组的成员列表，并负责给每一个成员分配分区。

### 3.4.2. 消费者实例
<a href="#menu" style="float:right">目录</a>


```java
public class ConsumerClientUtil {


    private AtomicInteger  recCount = new AtomicInteger(0);
    private KafkaConsumer kafkaConsumer;
    private static String BROKER_LISTS = "localhost:9092,localhost:9093";
    private AbstractSerialize serialize = HessianSerializeUtil.getSingleton();




    public static ConsumerClientUtil  create(ConsumerCfg cfg){

        ConsumerClientUtil consumerClientUtil = new ConsumerClientUtil();
        KafkaConsumer  kafkaConsumer = new KafkaConsumer(initConfig(cfg));
        consumerClientUtil.kafkaConsumer = kafkaConsumer;

        
        return consumerClientUtil;
    }



    public void   recData(String TOPIC){



        kafkaConsumer.subscribe(Arrays.asList(TOPIC), new ConsumerRebalanceListener() {
            @Override
            public void onPartitionsRevoked(Collection<TopicPartition> collection) {

                collection.forEach((value)-> {
                    log.debug("+++执行平衡消费者之前:onPartitionsRevoked+++");

                    log.debug("topic = {}, partition = {};",value.topic(),value.partition());
                    kafkaConsumer.commitSync();
                });

            }

            @Override
            public void onPartitionsAssigned(Collection<TopicPartition> collection) {
                collection.forEach((value)-> {
                    log.debug("+++执行平衡消费者之后:onPartitionsAssigned+++");

                    log.debug("topic = {}, partition = {};",value.topic(),value.partition());

                    //获取消费偏移量，实现原理是向协调者发送获取请求
                    OffsetAndMetadata offset = kafkaConsumer.committed(value);
                    //设置本地拉取分量，下次拉取消息以这个偏移量为准
                    kafkaConsumer.seek(value, offset.offset());

                });
            }
        });

        new Thread(){
            @Override
            public void run() {
                while (true) {
                    ConsumerRecords<String, String> records = kafkaConsumer.poll(Duration.ofSeconds(2));
                    for (ConsumerRecord<String, String> record : records){

                       log.info(Thread.currentThread().getName() + "  "+ record.value());

                        log.info("result = :topic:{}; partition:{}; offset:{};",record.topic(),record.partition(),record.offset());

                    }

                }
            }
        }.start();


    }


    private static  Properties initConfig(ConsumerCfg cfg ){

        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BROKER_LISTS);
        //每个消费者分配独立的组号
        props.put(ConsumerConfig.GROUP_ID_CONFIG, cfg.getGroupId());
        //如果value合法，则自动提交偏移量
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        props.put( ConsumerConfig.MAX_POLL_RECORDS_CONFIG,"5");
        //设置多久一次更新被消费消息的偏移量
        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "10000");
        //设置会话响应的时间，超过这个时间kafka可以选择放弃消费或者消费下一条消息
        props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "30000");
        //自动重置offset　latest　earliest　none
        /**
         earliest
         当各分区下有已提交的offset时，从提交的offset开始消费；无提交的offset时，从头开始消费
         latest
         当各分区下有已提交的offset时，从提交的offset开始消费；无提交的offset时，消费新产生的该分区下的数据
         none
         topic各分区都存在已提交的offset时，从offset后开始消费；只要有一个分区不存在已提交的offset，则抛出异常
        */
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG ,"latest");
        //反序列化方式
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());

        return props;
    }


}

```
### 3.4.3. 消费者配置
<a href="#menu" style="float:right">目录</a>

* fetch.min.bytes
    * 消费者从服务器获取记录的最小字节数
    * broker收到消费者的读取数据请求时，如果可用的数据量小于该配置值。会等到足够的数据量才会返回给消费者。
    * 如果消费者的数据量比较多，可以将该值设的稍微大，降低broker的负载
    
* fetch.max.wait.ms
    * 指定broker等待的时间,默认500ms如果broker中可读的数据没到达fetch.min.bytes，时间到则返回客户端

* max.partition.fetch.bytes
    * 服务器从每个分区里返回给消费者的最大字节数，默认值是1MB
    * 该值必须比broker能够接收的最大字节数(max.message.size)大,否则可能存在无法接收大消息
    * 也不能设置过大，过大导致消费者消息处理时间过长，如果消费者异步处理也没问题

* heartbeat.interval.ms
    * 指定poll方法向协调器发送心跳的频率 

* session.timeout.ms
    * 消费者在被认为死亡之前可以与服务器断开连接的时间，默认是3s
    * 超过这个时间，群组协调器就认为该消费者已经死亡，将会发生再均衡
    * 需要和heartbeat.interval.ms相匹配
    
* auto.offset.reset
    * 指定消费者在读取一个没有偏移量的分区或者偏移量无效的情况下(因消费者长时间失效，包含偏移量的记录已经过时并被删除)该如何处理
    * 值
        * latest（默认值）
            * 在偏移量无效的情况下，消费者从最新的记录开始读取数据(消费者启动之后生成的记录)
        * earliest
            * 从起始位置读取分区数据
            
* enable.auto.commit
    * 是否自动提交偏移量，默认值为true
    * 为了避免重复消费或者消息丢失，可以将它设为false,由用户手动提交

* partition.assignment.strategy
    * 分区分配给群组里消费者的策略
    * Range
        * 把主题若干个连续分区分配给消费者
        * 比如3个分区两个消费者，消费者1可能分到分区1和分区2,消费者2分到分区3 
    * RoundRobin
        * 把主题所有分区逐个分配
        * 比如3个分区两个消费者，消费者1分到分区1和分区3,消费者2分到分区2 

* client.id
    * 任意字符串
    * 用来标识从客户端发送过来的消息，通常用在日志，度量指标，和配额里

* max.poll.records
    * 控制单次调用call方法能够返回的记录数 
* receive.buffer.bytes & send.buffer.bytes
    * TCP socket接收和发送数据包的缓冲区大小
    * 如果为-1，就使用操作系统的默认值
    
### 3.4.4. 提交和偏移量
<a href="#menu" style="float:right">目录</a>

* Kafka不会像其他JMS队列那样需要得到消费者的确认，消费者可以使用Kafka来追踪消息在分区里的位置(偏移量)

* **提交:** 更新当前位置的操作叫做提交
* 消费者是往_consumer_offset的特殊主题上发送消息，消息包含每个分区的偏移量
    * 如果消费者一直处于运行状态，那么偏移量就没有什么用处
    * 如果发生再均衡之后，消费者可能分到新的分区，就需要从_consumer_offset上读取该分区的偏移量
* 如果提交的偏移量小于客户端处理的最后一个消息的偏移量，那么处于两个偏移量之间的消息会被重复处理
* 如果提交的偏移量大于客户端处理的最后一个消息的偏移量，那么处于两个偏移量之间的消息会丢失


#### 3.4.4.1. 自动提交 
<a href="#menu" style="float:right">目录</a>

* enable.auto.commit为true时
    * 消费者会自动把从poll方法接收到的最大偏移量提交上去，提交时间间隔由auto.commit.interval.ms控制默认值是5s
    * 存在的问题
        * 提交之前发生再均衡，将会出现重复消费的问题
* 以下几种方式需要设置enable.auto.commit为false


#### 3.4.4.2. 提交当前偏移量
<a href="#menu" style="float:right">目录</a>

Consumer类
```java
void commitSync();
void commitSync(Duration var1);
void commitSync(Map<TopicPartition, OffsetAndMetadata> var1);
void commitSync(Map<TopicPartition, OffsetAndMetadata> var1, Duration var2);
```
以上便是消费者同步提交的API，在broker返回响应之前将阻塞

#### 3.4.4.3. 异步提交
<a href="#menu" style="float:right">目录</a>

```java
void commitAsync();
void commitAsync(OffsetCommitCallback var1);
void commitAsync(Map<TopicPartition, OffsetAndMetadata> var1, OffsetCommitCallback var2);
```
* 提交时不会进行阻塞。
* 在成功提交或碰到无法恢复的错误之前，commitSync将会一直重试，而commitAsync不会，因为它收到broker响应之前，可能有一个更大的偏移量提交上去，如果进行重试，将会发生重复消费的问题
* 可以使用序号记录每次提交，在回调函数里面检查序号大小，如果没有更新的提交，则可以进行重试。

#### 3.4.4.4. 同步和异步组合提交
<a href="#menu" style="float:right">目录</a>
try 里面执行异步提交
finnally 里面执行同步提交


#### 3.4.4.5. 提交特定的偏移量
<a href="#menu" style="float:right">目录</a>

* 以上的无参方法提交的都是最后一次的偏移量
* 可以使用参数Map<TopicPartition, OffsetAndMetadata> var1 来自定义提交的偏移量。
* 使用场景是消费者收到很多消息，需要在很多时间处理，需要在处理的中间进行提交，防止再均衡导致的重消费问题。

### 3.4.5. 再均衡监听器
<a href="#menu" style="float:right">目录</a>

在subscribe时可以注册一个再均衡监听器，
```java
//Consumer 类
void subscribe(Collection<String> var1, ConsumerRebalanceListener var2);

public interface ConsumerRebalanceListener {
    void onPartitionsRevoked(Collection<TopicPartition> var1);
    void onPartitionsAssigned(Collection<TopicPartition> var1);
}

```
* 在消费者退出和进行分区再均衡之前，会做一些清理工作，可以使用再均衡监听器
* onPartitionsRevoked
    * 在再均衡之前和消费者读取消息之后被调用，可以在这里提交偏移量，下个接管该分区的消费者就可以知道从哪里读取数据了
* onPartitionsAssigned
    * 在再均衡之后和消费者读取分区之前调用
    


### 3.4.6. 从特定偏移量处开始处理
<a href="#menu" style="float:right">目录</a>

```java
//指定位置
void seek(TopicPartition var1, long var2);
//分区起始位置
void seekToBeginning(Collection<TopicPartition> var1);
//分区末尾位置
void seekToEnd(Collection<TopicPartition> var1);

```

### 3.4.7. 如何退出
<a href="#menu" style="float:right">目录</a>

consumer.wakeup()调用时，可以退出poll循环，并抛出WakeupException异常，不需要处理，因为这个异常只是为了退出poll循环

### 3.4.8. 独立消费者
<a href="#menu" style="float:right">目录</a>

* 场景
    * 一个消费者从一个主题的所有分区读取数据
    * 或者某个特定的分区读取数据
    * 这个时候就不需要消费者群组和再均衡了

* 这种场景就不需要订阅主题，而是进行分配分区

```java
//根据主题获取可用分区
List<PartitionInfo> partitionsFor(String var1);
List<PartitionInfo> partitionsFor(String var1, Duration var2);
//消费者注册分区
void assign(Collection<TopicPartition> var1);
```
这样就不会出现再均衡问题，但是当增加分区时，不会通知消费者，需要消费者手动轮询检测处理。


## 3.5. 深入Kafka
<a href="#menu" style="float:right">目录</a>


### 3.5.1. 集群成员关系
<a href="#menu" style="float:right">目录</a>

* kafka使用zookeeper来维护集群成员的信息
* 每个broker都有一个唯一的标识符broker ID，这个标识符可以配置文件指定，也可以自动生成，在启动时，通过创建临时节点把自己的ID注册到Zookeeper（/brokers/ids）
* 在broker停机，出现网络分区或长时间垃圾回收停顿时，broker会从Zookeeper上断开连接



### 3.5.2. 控制器
<a href="#menu" style="float:right">目录</a>

* 控制器
    * 就是一个broker,除了具有一般broker的功能之外。还负责分区首领的选举。
    * 控制器负责主题的创建与删除、分区和副本的管理以及代理故障转移处理等
    * 控制器负责在节点加入或者离开集群时进行分区首领选举，控制器使用epoch来避免脑裂
    * 集群里第一个启动的broker通过在zk里创建一个临时节点/controller让自己成为控制器
   
    * controler_epoch  
        * 用于记录控制器发生变更次数，即记录当前的控制器是第几代控制器（本书中我们称之为控制器轮值次数）。初始值为 0，当控制器发生变更时，每选出一个新的控制器需将该宇段加 1 ，每个向控制器发迭的请求都会带上该字段，如果请求的controller_epoch 的值小于内存中 controller_epoch 的值，则认为这个请求是向己过期的控制器发迭的请求，那么本次请求就是一个无效的请求。若该值大于内存中 controller_epoch 的值，则说明己有新的控制器当选了。通过该值来保证集群控制器的唯一性，进而保证相关操作一致性。该字段对应 ZooKeeper 的 controller_epoch 节点，通过登录 ZooKeeper客户端执行 get/controller_epoch 命令，可以查看该字段对应的值。
    * zkVersion 
        * 作用类似数据库乐观锁，用于更新 ZooKeeper 路径下相应元数据信息，如ontroller epoch, JSR 信息等。
    * leader_epoch
        * 分区 Leader 更新次数。 controller_epoch 是相对代理而言的，而 leader_epoch是相对于分区来说的。由于各请求达到顺序不同，控制器通过 con位oller_epoch 和leader_epoch 来确定具体应该执行哪个命令操作。
    * 己分配副本（ assigned replica ）
        * 每个分区的所有副本集合被称作己分配副本，简写为AR，本书中所有 AR 均表示此含义，而 JSR 是与分区 Leader 保持同步的副本列表。
    * LeaderAndlsr
        *  Kafka 将 Leader 对应的 brokerld 和 ISR 列表封装成一个 LeaderAndlsr类 。 以 JSON 串表示为｛” leader”：Leader 的 brokerld，”leader_epoch”：leader 更新次数，” isr”： ISR 列表｝
    * 优先副本（ preferred replica ）
        * 在 AR 中，第一个副本称为preferredreplica，也就是我们说的优先副本。理想情况下，优先副本即是该分区的 Leader , Kafka 要确保所有主题的优先副本在 Kafka 集群中均衡分布，这样就保证了所有分区的 Leader 均衡分布。保证Leader 在集群中均衡分布很重要，因为所有的读写请求都由分区 Leader 副本进行处理，如果 Leader 分布过于集中，就会造成集群负载不均衡。为了保证优先副本的均衡分布，Kafka 提供了 5 种分区选举器（ PartitionLeaderSelector ），当分区数发生变化或是分区Leader 岩机时就会通过分区选举器及时选出分区新的 Leader 。
    * Leader选举
        * 每个集群节点从zk的/controller获取Leader信息，从中提取leaderId
        * leaderId为-1，说明还没有进行选举，则该节点将带自己的brokerId信息{"version":1,"brokerId":1,"timestamp":xxxx}写入zk节点/controller.写入成功，那么将被选举为Leader
        * 如果创建失败或者读取的leadeId为-1，说明其他节点已经称为Leader,那么将读取zk中已经注册的leaderId读取并缓存到内存中。
        * 其他的节点也会尝试创建，由于控制器节点已经存在，后续创建将会失败，并监听该zk节点，保证控制器下线时其他节点能够接管。
        * 控制器节点下线以后，临时节点删除，其他的broker节点会尝试申请作为控制器，第一个申请到的将作为控制器，并创建控制器节点，其他节点会监听这个新的zk控制器节点


* 集群有节点下线
    * 监听zk路径能够知道哪个broker下线
    * 假如离开的是分区的新首领
        * 控制器将遍历这些分区，并确定谁称为新首领(分区副本列表里的下一个副本)
        * 然后向所有包含新首领或现有跟随者的broker发送请求，该请求消息包含了谁是新首领以及谁是分区跟随者。
        * 随后，新首领开始处理来自生产者和消费者的请求，而跟随者开始从新首领复制消息。
* 集群节点上线
    * 新的节点上线时，会使用broker ID检查新加入的broker是否包含现有分区的副本。
        * 如果有，控制器会把变更通知发送给新加入的broker和其他broker,新的broker开始从首领那里复制消息

* 主题管理
    * 创建主题
        * 当创建一个主题时会在 ZooKeeper 的/brokers/topics 目录下创建一个与主题同名的节点 ， 在该节点下会记录该主题的分区副本分配方案。 
    * 删除主题

### 3.5.3. 协调器
Kafka 提供了消费者协调器（ ConsumerCoordinator ）、组协调器 （ roupCoordinator ）和任务管理协调器 C WorkCoordinator) 3 种协调器（ coordinator ） 。 其中任务管理协调器被 Kafka Conn巳ct用于对 works 的管理，本书不进行介绍，我们重点关注的是消费者协调器和组协调器，这两种协调器与消费者密切相关。
Kafka 的高级消费者即通过 ZooKeeperConsumerConnector 实现的消费者是强依赖于 ZooKeeper的，每一个消费者启动时都会在 ZooKeeper 的／consumers/${group.id }/ids 上注册消费者的客户端id ，即$ {client. id｝，会在该路径以及/brokers/i ds 路径下注册监昕器，用于当代理或是消费者发生变化时，消费者进行平衡操作 。 由于这种方式是每一个消费者对 ZooKeeper 路径分别进行监听，当发生平衡操作时 ， 一个消费组下的所有消费者同时会触发平衡操作，而消费者之间井不知道其他消费者平衡操作的结果，这样就可能导致 Kafka 工作在一个不正确的状态 。 同时这种方式完全依赖于 ZooKeeper，以监听的方式来管理消费者，存在以下两个缺陷 。
* 羊群效应（ herd effect ）
    * 任何代理或是消费者的增、减都会触发所有的消费者同时进行平衡操作 ，每个消费者都对 ZooKeeper 同一个路径进行操作，这样就有可能发生类似死锁的情况，从而导致平衡操作失败 。
* 脑裂问题（ split brain ）
    * 消费者进行平衡操作时每个消费者都与 ZooKeeper 进行通信，以判断消费者或是代理变化情况，由于 ZooKeeper 本身的特性可能导致在同一时候各消费者所获取的状态不一致，这样就会导致 Kafka 运行在一个不正确状态之下 .
    
鉴于旧版高级消费者存在问题，新版消费者进行了重新设计，引入了协调器 。 对于 Kafka引入协调器的发展过程我们不做细化。大家需要知道的是，为了解决消费者依赖 ZooKeeper 所带来的问题， Kafka 在服务端引入了组协调器（ GroupCoordinator ），每个 KafkaServer 启动时都会创建一个 GroupCoordinator 实例，用于管理部分消费组和该消费组下每个消费者的消费偏移量。 同时在客户端引入了消费者协调器（ConsumerCoordinator ），每个 KafkaConsumer 实例化时会实例化一个 ConsumerCoordinator 对象，消费者协调器负责同一个消费组下各消费者与服务端组协调器之间的通信 。

**消费者协调器**
**组协调器**

### 3.5.4. 网络通信服务

![](https://github.com/lgjlife/Java-Study/blob/master/pic/kafka/kafka-communication.png?raw=true)

* SocketServer基于Java NIO实现的网络通信组件
* 线程模型
    * 一个Acceptor负责接收客户端所有的连接
    * N ( ${num.network血reads ｝ ）个 Processor 线程 ， 每个 Processor 有多个Selector ， 负责从每个连接中读取请求； M ( ${num.io.threads ｝ ）个 Handler ( KafkaRequestHandler )线程处理请求，井将产生的请求返回给 Processor 线程。、
    * 而 Handler 是由 KafkaRequestHandlerPool管理 ，在 Processor 和 Handler 之间通过 RequestChannel 来缓冲请求，每个 Handler 从RequestChannel.requestQueue 接受 RequestChannel.Request ， 井把 Request 交由 KafkaA pis 的handle（）方法处理 ， 经处理后把对应的 Response 存进 RequestChannel.responseQueues 队列 。

**Acceptor**
* Acceptor 的主要职责是监昕并接受客户端（统指请求发起方） 的请求，建立和客户端的数据传输通道 ServerSocketChannel ，然后为客户端指定一个 Processor。
    
**Processor**
* Processor 也是一个线程类 ，继承 AbstractServerThread 类，主要用于从客户端读取请求数据和将相应的响应结果返回给客户端。

**RequestChannel**
* RequestChannel 是为了给 Processor 线程与 Handler线程之间通信提供数据缓冲，是通信过程中 Request 与 Response 缓存的通道，是 Processor 线程与 Handler 线程交换数据的地方 。

### 3.5.5. 日志管理
<a href="#menu" style="float:right">目录</a>

日志管理器 （ LogManager）是 Kafka 用来管理所有日志的 ， 也称为日志管理子系统（ LogManagement Subsystem ）。 它负责管理 日 志的创建与删除 、 日志检索 、 日志加载和恢复、检查点及日志文件刷写磁盘 以及日志清理等

#### 3.5.5.1. 日志结构
<a href="#menu" style="float:right">目录</a>


* Kafka 消息是以主题为基本单位进行组织的， 各个主题之间相互独立 。 
* 每个主题在逻辑结构上又由一个或多个分区构成，分区数可以在创建主题时指定，也可以在主题创建后再修改。 但只能增加一个主题的分区数而不能减少其分区数 。因为减少分区数，还需要进行数据复制，而增加分区就不需要
* 每个分区可以有一个或多个副本，从副本中会选出一个副本作为Leader,Leader负责与客户端进行读写操作，其他副本作为Follower。生产者将消息发送到Leader副本的代理节点，而Follower副本从Leader副本同步数据。

在存储结构 上分区 的每个副本在逻辑上对应一个 Log 对象 ， 每个 Log 又划分为多个LogSegment，每个LogSegment包括一个日志文件和两个索引文件，其中两个索引文件分别为偏移量索引文件和时间戳索引文件。 Log 负责对 LogSegment 的管理，在 Log 对象中维护了 一个 ConcurrentSkipListMap，其底层是一个跳跃表，保存该主题所有分区对应的所有 LogSegment。Kafka 将日志文件封装为 一 个 FileMessageSet 对象，将两个索引文件封装为 Offsetlndex 和Timelndex 对 象。 Log 和 LogSegment 都是逻辑上的概念， Log 是对副本在代理上存储文件的逻辑抽象， LogSegrnnent 是对副本存储文件下每个日志片段的抽象，日志文件和索引文件才与磁盘上的物理存储相对应。假设有一个名为“ log-format”的主题，该主题有 3 个分区，每个分区对应一个副本，则在存储结构中各对象映射关系如图 

![](https://github.com/lgjlife/Java-Study/blob/master/pic/kafka/kafka-log.png?raw=true)

在存储结构上每个分区副本对应一个目录，每个分区副本由一个或多个日志段（ LogSegment ）组成。每个日志段在物理结构上对应一个以“ .index ”为文件名后缀的偏移量索引文件、一个以“ .timeindex ”为文件名后缀的时间戳索引文件以及一个以“ .log”为文件名后缀的消息集文件（ FileMessageSet），消息集文件即日志文件或数据文件。需要说明的是 ，时间戳索引文件是在 0.10.1.1 版本新增加的索引文件，在这之前的版本只有偏移量索引文件。
数据文件的大小由配置项 log.segment.bytes 指定，默认为 l GB ( 1 073 741 824 字节），同时 Kafka提供了根据时间来切分日志段的机制，即若数据文件大小没有达到 log.segment.bytes 设置的阔值，但达到了 log.roll.ms 或是 log.roll.hours 设置的阔值，同样会创建新的日志段 ， 在磁盘上创建一个数据文件和两个索引文件。接收消息追加（ append ）操作的日志段也称为活跃段( activeSegment ） 。
由图于 19 也可以看出 ， 分区所对应目录的命名规则为 ： 主题名 ．分区编号，分区编号从 0开始，顺序递增 ， 分区编号最大值为分区总数减 1 ，例如，对“ log-format”主题，其分区目录依次为 log-format-0 、 log-format-I 和 log-format-2。数据文件命名规则为：由数据文件的第一条消息偏移量，也称为基准偏移量（ BaseO:ffset ）， 左补 0 构成 20 位数字字符组成 ， 每个分区第一个数据文件的基准偏移量为 0， 因此每个分区第一个数据文件对应的日志文件为 0000000000000000000.log,两个索引文件分别为 0000000000000000000.index 和 0000000000000000000.timeindex 。后续每个数据文件的基准偏移量为上一个数据文件最后一条消息对应的偏移量 Clog end offset, LEO ）值
加 1 。

**消息结构**

数据文件用来存储消息，每条消息由一个固定长度的消息头和一个可变长度（N 字节〉的净荷(payload ）组成。


|名称|长度(字节)|说明|
|---|---|---|
|CRC32|4|CRC32 校验和
|magic|1|Kafka 服务程序协议版本号 ，用来作兼容，当前版本的 Kafka 该值为 1
|attributes|1|该字段占1字节，其中低两位用来表示压缩方式，第三位表示时间戳类型 ，高 4 位为预留位置，暂无实际意义
|timestamp|8|消息时间戳，当 magic 值大于 0 时消息头必须包括该字段
|key-length|4|消息 Key 的长度
|key|N|消息、 Key 实际数据
|payload-length|4|消息实际数据长度
|payload|N|消息实际数据
在实际存储时一条消息总长度还包括 12 字节额外的开销（ LogOverhead ），这 12 字节包括两部分。其中一部分用 8 字节长度记录消息的偏移量，每条消息的偏移量是相对该分区下第一个数据文件的基准偏移量而言，它唯一确定一条消息在分区下的逻辑位置，同一个分区下的消息偏移量按序递增，若与数据库类比，消息偏移量即为消息的 Id，即自增的主键。另外 4 字节表示消息总长度。











#### 3.5.5.2. 日志管理器启动过程
<a href="#menu" style="float:right">目录</a>


#### 3.5.5.3. 日志加载及恢复
<a href="#menu" style="float:right">目录</a>


#### 3.5.5.4. 日志清理
<a href="#menu" style="float:right">目录</a>




### 3.5.6. 复制
<a href="#menu" style="float:right">目录</a>

* 副本类型
    * 首领副本
        * 每个分区都有一个，为了保证一致性，所有生产者请求和消费者请求都会经过首领副本
        * 
    * 跟随者副本
        * 首领以外的都是跟随者副本
        * 跟随者副本不处理客户端的请求
        * 唯一的任务就是从首领复制消息，保持数据一致性。
        * 如果首领节点失败，其中一个跟随者将成为首领副本

### 3.5.7. 处理请求
<a href="#menu" style="float:right">目录</a>

* 消息标准头
    * Request Type 
    * Request Version（客户端版本，根据客户端版本作出不同的响应）
    * Correlation ID .一个具有唯一性的数字，用于标识请求消息，同时也会出现在响应消息和错误日志里
    * Client ID用于标识发送请求的客户端
* 消息线程处理
    * broker会在它监听的每一个端口上运行一个Acceptor线程，这个线程会创建一个连接，并把它交给Processor线程去处理，Processor线程数量是可配置的
    * 网络线程负责从客户端获取请求消息，把它们放进**请求队列**，然后从**响应队列**里获取响应消息，把它们发送给客户端
    * IO线程从**请求队列**里获取请求并处理，处理结果放入**响应队列**

### 3.5.8. 生产请求
<a href="#menu" style="float:right">目录</a>

* 生产者发送的请求，它包含客户端要写入broker的消息



### 3.5.9. 获取请求
<a href="#menu" style="float:right">目录</a>

* 在消费者和跟随者副本需要从broker读取消息时发送的请求

### 3.5.10. 其他请求
<a href="#menu" style="float:right">目录</a>



### 3.5.11. 物理存储
<a href="#menu" style="float:right">目录</a>




## 3.6. 可靠的数据传递
<a href="#menu" style="float:right">目录</a>

### 3.6.1. 可靠性保证
<a href="#menu" style="float:right">目录</a>

### 3.6.2. 复制
<a href="#menu" style="float:right">目录</a>

### 3.6.3. broker配置
<a href="#menu" style="float:right">目录</a>


### 3.6.4. 在可靠的系统里使用生产者
<a href="#menu" style="float:right">目录</a>


### 3.6.5. 在可靠的系统里使用消费者
<a href="#menu" style="float:right">目录</a>


### 3.6.6. 验证系统可靠性
<a href="#menu" style="float:right">目录</a>




## 3.7. 构建数据管道
<a href="#menu" style="float:right">目录</a>


## 3.8. 跨越集群数据镜像
<a href="#menu" style="float:right">目录</a>

### 3.8.1. 跨集群镜像的使用场景
<a href="#menu" style="float:right">目录</a>


### 3.8.2. 多集群架构
<a href="#menu" style="float:right">目录</a>




## 3.9. 管理Kafaka
<a href="#menu" style="float:right">目录</a>


## 3.10. 监控Kafka
<a href="#menu" style="float:right">目录</a>

### 3.10.1. broker的度量指标
<a href="#menu" style="float:right">目录</a>

### 3.10.2. 非同步分区
<a href="#menu" style="float:right">目录</a>

### 3.10.3. broker度量指标
<a href="#menu" style="float:right">目录</a>


### 3.10.4. 主题和分区的度量指标
<a href="#menu" style="float:right">目录</a>

### 3.10.5. Java虚拟机监控
<a href="#menu" style="float:right">目录</a>

### 3.10.6. 操作系统监控
<a href="#menu" style="float:right">目录</a>


### 3.10.7. 日志
<a href="#menu" style="float:right">目录</a>


### 3.10.8. 客户端监控
<a href="#menu" style="float:right">目录</a>

### 3.10.9. 生产者度量指标

### 3.10.10. 消费者度量指标

### 3.10.11. 配额




### 3.10.12. 延迟监控
<a href="#menu" style="float:right">目录</a>


### 3.10.13. 端到端监控
<a href="#menu" style="float:right">目录</a>




## 3.11. 流式处理
<a href="#menu" style="float:right">目录</a>

### 3.11.1. 什么是流式处理
<a href="#menu" style="float:right">目录</a>

* 数据流
    * 无边界数据集的抽象表示，无边界意味着无限和持续增长。无限是因为随着时间的推移，新的记录会不断加入进来。
* 事件流是有序的，比如要先存钱再取钱。如果顺序颠倒呈现结果就会不一样。
* 不可变的数据记录
    * 时间一旦发生，就不能被改变
* 事件流是可重播的

* 数据处理的三种范式
    * 请求与响应
        * 延迟最小，响应时间在亚毫秒和毫秒之间 
    * 批处理
        * 具有高延迟和高吞吐量的特点
    * 流式处理

### 3.11.2. 流式处理的概念
<a href="#menu" style="float:right">目录</a>

**时间**

* 事件时间
    * 追踪事件的发声时间和记录的创建时间
* 日志追加时间 
    * 事件保存到broker的时间
* 处理时间
    * 应用程序在收到事件之后要对齐进行处理的时间

在处理与时间有关的问题时，需要注意时区的问题，整个数据管道应该使用同一个时区，否则操作结果可能会出现混淆。



**状态**

* 本地状态和内部状态

* 外部状态

**流和表的二元性**
流包含了变更，流是一系列事件，每个事件就是一个变更。
表包含了当前的状态，是多个变更所产生的结果。

为了将表转化成流，需要捕捉到表上的所发生的变化，将增删改操作事件保存到流里。

为了将流转化成表，需要应用流里所包含的所有变更，这就叫做流的物化。现在数据库里创建一张表，然后从头到尾遍历流里的所有事件，逐个改变状态。在完成这个过程之后，就得到一张表。


**时间窗口**
* 大部分针对流的操作都是基于时间窗口的，比如移动平均数，一周内销量最好的产品。一般需要关注以下几个点:窗口的大小，窗口移动的频率，窗口的可更新时间多长。



### 3.11.3. 使用场景
<a href="#menu" style="float:right">目录</a>

### 3.11.4. 流式处理的设计模式
<a href="#menu" style="float:right">目录</a>

### 3.11.5. 实例
<a href="#menu" style="float:right">目录</a>


### 3.11.6. 架构概览
<a href="#menu" style="float:right">目录</a>


### 3.11.7. 如何选择流式处理框架
<a href="#menu" style="float:right">目录</a>





<span id="menu" >



# 4. RocketMQ消息中间件
<a href="#menu" style="float:right">目录</a>


## 4.1. 基本介绍
<a href="#menu" style="float:right">目录</a>

### 4.1.1. 模块说明
<a href="#menu" style="float:right">目录</a>

![](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/rocketmq.png?raw=true)

**NameServer**
**Broker**
**生产者**
**消费者**

### 4.1.2. 配置参数
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
    

### 4.1.3. 底层通信实现
<a href="#menu" style="float:right">目录</a>

* rocketMQ底层基于Netty实现

消息协议

||长度（字节）|说明|
|---|---|---|
|length|4|后面部分的总长度|
|header length|4|头部信息的长度|
|header data |不定长度|头部信息|
|body data|不定长度|消息体|

### 4.1.4. RocketMQ源代码的目录结构
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

### 4.1.5. 设计理念
<a href="#menu" style="float:right">目录</a>

* RocketMQ 设计基于主题的发布与订阅模式 ， 其核心功能包括消息 发送消息存储(Broker）、消息消费，整体设计追求简单与性能第一，主要体现在如下三个方面 。首先， NameServer 设计极其简单，摒弃了业界常用的使用 Zookeeper 充当信息管理的 “注册中心”，而是自研 NameServer 来实现元数据 的管理（ Topic 路由信息等 ） 。 从实际需求出发，因为 Topic 路由信息无须在集群之间保持强一致，追求最终一致性，并且能容忍分钟级的不一致。 正是基于此种情况 ， RocketMQ 的 NameServer 集群之间互不通信，极
大地降低了 NameServer 实现的 复杂程度， 对网络的要求也降低了不少 ， 但是性能相比较Zookeeper 有了极大的提升 。
* 其次是高效的 IO 存储机制 。 RocketMQ 追求消息发送的高吞吐量， RocketMQ 的消息存储文件设计成文件组的概念，组内单个文件大小固定，方便引人内存 l映射机制，所有主题的消息存储基于顺序写 ， 极大地提供了消息写性能， 同时为了兼顾消息消费与消息查找，引入了消息消费队列文件与索引文件 。
* 最后是容忍存在设计缺陷 ，适当将某些工作下放给 RocketMQ 使用者 。 消息中间件的实现者经常会遇到一个难题：如何保证消息一定能被消息消费者消费，并且保证只消费一次。
RocketMQ 的设计者给出的解决办法是不解决这个难题，而是退而求其次 ，只保证消息被消
费者消费，但设计上允许消息被重复消费，这样极大地简化了消息中间件的内核，使得实现
消息发送高可用变得非常简单与高效 消息重复问题由消费者在消息消费时实现幕等 。


### 4.1.6. 设计目标
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

### 4.1.7. 常用面试题


## 4.2. 安装配置
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

## 4.3. 基本使用
<a href="#menu" style="float:right">目录</a>

**依赖引入**
```xml
<dependency>
    <groupId>org.apache.rocketmq</groupId>
    <artifactId>rocketmq-client</artifactId>
    <version>4.3.0</version>
</dependency>
    
```
### 4.3.1. **基本的例子**
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
### 4.3.2. **顺序发送**
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
### 4.3.3. **广播发送**
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
### 4.3.4. **定时发送**
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
### 4.3.5. **批量发送**
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
### 4.3.6. **过滤**
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
### 4.3.7. **日志appender**
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
### 4.3.8. **事务消息**
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

## 4.4. 协调者NameServer
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

### 4.4.1. 路由元信息
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


## 4.5. 生产者
<a href="#menu" style="float:right">目录</a>

### 4.5.1. 消息发送方式
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

### 4.5.2. 生产者API
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



### 4.5.3. 队列选择器

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
### 4.5.4. 发送流程分析
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

### 4.5.5. 默认的队列选择

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

## 4.6. 消费者
<a href="#menu" style="float:right">目录</a>

### 4.6.1. 消息消费概述
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




### 4.6.2. 消息消费推/拉方式
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

### 4.6.3. 提高 Consumer 处理能力
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

### 4.6.4. Consumer 的负载均衡
<a href="#menu" style="float:right">目录</a>

当消费组里面有多个

要做负载均衡，必须知道一些全局信息，也就是一个 ConsumerGroup 里到底有多少个 Consumer ， 知道了全局信息，才可以根据某种算法来分配，比如简单地平均分到各个 Consumer。 在 RocketMQ 中，负载均衡或者消息分配是在Consumer 端代码中完成的， Consumer 从 Broker 处获得全局信息，然后自己做负载均衡，只处理分给自己的那部分消息 

**DefaultMQPushConsumer 的负载均衡**

**DefaultMQPullConsumer 的负载均衡**

### 4.6.5. 定时消息
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


## 4.7. 消息存储
<a href="#menu" style="float:right">目录</a>


### 4.7.1. 消息存储结构
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


### 4.7.2. 消息队列与索引文件恢复
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

#### 4.7.2.1. Broker 正常停止文件恢复
<a href="#menu" style="float:right">目录</a>

Broker 正常停止文件恢复的实现为 CommitLog#recoverNormally 。

* Broker正常停止再重启时，从倒数第三个文件开始进行恢复，如果不足3 个文件，则从第一个文件开始恢复。checkCRCOnRecover 参数设置在进行文件恢复时查找消息时是否验证 CRC 。

* 解释一下两个局部变量，mappedFileOffset为当前文件已校验通过的offset,processOffset为Commitlog文件已确认的物理偏移量等于mappedFile.getFileFromOffset加上 mappedFileOffset。

* 遍历Commitlog文件，每次取出一条消息，如果查找结果为true并且消息的长度大于0表示消息正确，mappedFileOffset指针向前移动本条消息的长度；如果查找结果为true并且消息的长度等于0，表示已到该文件的末尾，如果还有下一个文件，则重置processOffset 、mappedFileOffset 重复步骤3，否则跳出循环；如果查找结构为 false ，表明该文件未填满所有消息，跳出循环，结束遍历文件
* 更新 MappedFileQueue 的 flushedWhere 与 commiteedWhere 指针 。
* 删除 offset 之后的所有文件 。遍历目录下的文件，如果文件的尾部偏移量小于offset则跳过该文件，如果尾部的偏移量大于 offset ，则进一步比较offset与文件的开始偏移量，如果 offset 大于文件的起始偏移量， 说明 当前文件包含了有效偏移里 ，设置MappedFile 的 flushedPosition 和 commitedPosition ；如果 offse t 小于文件的起始偏移量，说明该文件是有效文件后面创建的，调用 MappedFile#destory 释放 MappedFile 占用的内存资源（内存映射与内存通道等），然后加入到待删除文件列表中，最终调用 deleteExpiredFile将文件从物理磁盘删除 。 过期文件的删除将在下文详细介绍 。

#### 4.7.2.2. Broker 异常停止文件恢复
<a href="#menu" style="float:right">目录</a>

Broker 异常停止文件恢复的实现为 CommitLog#recoverAbnormally 。
异常文件恢复的步骤与正常停止文件恢复 的流程基本相同，其主要差别有两个 。 首先，正常停止默认从倒数第三个文件开始进行恢复， 而异常停止则需要从最后一个文件往前走，找到第一个消息存储正常的文件 。 其次，如果 commitlog 目录没有消息文件，如果在消息消费 队列目录下存在文件，则需要销毁 。

* 首先判断文件的魔数，如果不是 MESSAGE MAGIC_CODE ，返回 false ，表示该文件不符合 commitlog 消息文件的存储格式 
* 如果文件中第一条消息的存储时间 等于 0 ， 返回 false ，说明该消息存储文件中未存储任何消息 。
* 对比文件第一条 消息的时间戳与检测点，文件第 一条 消息的时间戳小于文件检测点说明 该文件部分消息是可靠 的 ， 则从该文件开始恢 复 。 文件检测点中保存了Commitlog 文件 、消息消费 队列（ ConsumeQueue ） 、索 引文件 （ IndexFile ）的 文件刷盘点，RocketMQ 默认选择这消息文件与消息消 费 队列这两个文件的时间刷盘点中最小值与消息文件第一消息 的时间戳对比，如果 messagelndexEnable 为 true ， 表示索引 文件的刷盘时间点也参与计算 。
* 如果根据前 3 步算法找到 MappedFile ，则遍历 MappedFile 中的消息，验证消息的合法性，并将消息重新转发到消息消费队列与索引 文件 
* 如果未找到有效 Mappe dFile ， 则设置 commitlog 目 录的 flushedWhere 、 committedWhere 指针都为 0 ，并销毁消息消费队列文件 。

存储启动时所谓的文件恢复主要完成 flushedPosition, committedWhere 指针的设置 、消息消费队列最大偏移 量加载到内存，并删除 flushedPosition 之后所有的文件。如果 Broker异常启 动， 在文件 恢复过程中 ， RocketMQ 会将最后一个有效文件中的所有消息重新转发到消息消费队 列与索引文件，确保不丢失消息，但同时会带来消息重复的 问 题，纵观RocktMQ 的整体设计思想， RocketMQ 保证消息不丢失但不保证消息不会重复消费 ， 故消息消费业务方需要 实现消息消费的幕等设计 。


### 4.7.3. 文件刷盘机制
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


    


### 4.7.4. 过期文件删除机制
<a href="#menu" style="float:right">目录</a>

* 由于使用了内存映射，只要存在于存储目录下的文件，都需要对应创建内存映射文件，如果不定时将已消费的消息从存储文件中删除，会造成极大的内存压力与资源浪费，所有 RocketMQ 采取定时删除存储文件的策略，也就是说在存储文件中， 第一个文件不一定是 00000000000000000000 ，因为该文件在某一时刻会被删除
* 由于 RocketMQ 操作 CommitLog 、 ConsumeQueue文件是基于内存映射机制并在启动的时候会加载 commitlog 、 ConsumeQueue 目录下的所有文件，为了避免内存与磁盘的浪费，不可能将消息永久存储在消息服务器上，所以需要引人一种机制来删除己过期的文件 。
* RocketMQ 顺序写 Commitlog 文件 、 ConsumeQueue 文件，所有写操作全部落在最后一个CommitLog 或 ConsumeQueue 文件上，之前的文件在下一个文件创建后将不会再被更新 。
* RocketMQ 清除过期文件的方法是 ：如果非当前写文件在一定时间间隔内没有再次被更新，则认为是过期文件，可以被删除， RocketMQ **不会关注这个文件上的消息是否全部被消费** 。
* 默认每个文件的过期时间为 72 小时 ，通过在 Broker 配置文件中设置fileReservedTime 来改变过期时间，单位为小时.


## 4.8. 高可用机制

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

### 4.8.1. 动态增减broker
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

### 4.8.2. 各种故障对消息的影响
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



## 4.9. 顺序消息
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

## 4.10. 消息饥饿问题
<a href="#menu" style="float:right">目录</a>

* 有AA，BB两种类型的消息，都放在同一个topic中，如果AA的数据量特别大，BB的数据量特别小，就会导致BB类型的消息不能即时处理
    * AA和BB放在不同的topic中，这样两种类型的消息都能够同时处理
    * AA和BB放在同一个topic的不同队列中，消费者轮询各个队列进行消费
    

## 4.11. 消息过滤 
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

## 4.12. 事务消息
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

### 4.12.1. 事务实现思想
<a href="#menu" style="float:right">目录</a>

* RocketMQ 事务消息的实现原理基于两阶段提交和定时事务状态回查来决定消息最终是提交还是回滚。
    * 应用程序在事务内完成相关业务数据落库后，需要同步调用 RocketMQ 消息发送接口，发送状态为 prepare 的消息 。 消息发送成功后， RocketMQ 服务器会回调 RocketMQ 消息发送者的事件监听程序，记录消息的本地事务状态，该相关标记与本地业务操作同属一个事务，确保消息发送与本地事务的原子’性 。
    * RocketMQ 在收到类型为 prepare 的消息时， 会首先备份消息的原主题与原消息消费队列，然后将消息存储在主题为 RMQ_SYS_TRANS_HALF_TOPIC 的消息消费队列中。
    * RocketMQ 消息服务器开启一个定时任务，消费 RMQ_SYS_TRANS_HALF_TOPIC的消息，向消息发送端（应用程序）发起消息事务状态回查，应用程序根据保存的事务状态回馈消息服务器事务的状态（提交、回滚、未知），如果是提交或回滚， 则消息服务器提交或回滚消息，如果是未知，待下一次回查， RocketMQ 允许设置一条消息的回查间隔与回查次数，如果在超过回查次数后依然无法获知消息的事务状态， 则默认回滚消息 。

![事务原理图](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/rockrtmq-transaction.png?raw=true)

### 4.12.2. 事务消息发送流程

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



### 4.12.3. 提交或者回滚事务
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

### 4.12.4. 事务消息回查事务状态
<a href="#menu" style="float:right">目录</a>

执行完本地事务返回本地事务状态为 UN KNOW 时，结束事务时将不做任何处理，而是通过事务状态定时回查以期得到发送端明确的事务操作（提交事务或回滚事务） 

RocketMQ 通过 TransactionalMessageCheckService 线程定 时去检测 RMQ_SYS_TRANS_HALF TOPIC 主题中的消息，回查消息的事务状态 。 TransactionalMessageCheckService 的检测频率默认为 l 分钟，可通过在 broker.conf文件中设置 transactionChecklnterval 来改变默认值，单位为毫秒。



## 4.13. 基于Netty的通信实现
<a href="#menu" style="float:right">目录</a>



# 5. Zookeeper
<a href="#menu" style="float:right">目录</a>

## 5.1. 基本概念
<a href="#menu" style="float:right">目录</a>

### 5.1.1. zk架构
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

### 5.1.2. 提供的功能
* 给节点创建监听器
* create : 创建节点
* delete : 删除节点
* exists : 检测节点是否存在
* get data : 从节点读取数据
* set data : 向节点写入数据
* get children : 获取子节点列表
* sync : 等待数据传播

### 5.1.3. 节点类型

以下两种类型可以交叉组合，比如持久有序，持久无序。
* 持久化节点(persistent)和临时节点(ephemeral)，临时节点在与创建它的客户端连接断开以后，判定连接失效之后将会被删除,或者客户端主动删除。持久化节点在创建成功之后，将会一直存在，除非手动删除。
* 有序节点和无序节点，有序节点在每次创建时同一个名称的节点时会自动在节点名称后面加上序列号。

**应用场景**:微服务中的失效剔除可以使用临时节点来实现，当服务提供者失效时，zk判断连接失败之后将服务信息删除，如果消费者监听该节点，将会收到删除请求。


<span id="menu"></span>

[TOC]





# 6. FastDfs

<a href="#menu" style="float:right">目录</a>

## 6.1. 为什么要使用分布式文件系统
<a href="#menu" style="float:right">目录</a>

### 6.1.1. 单机时代
初创时期由于时间紧迫，在各种资源有限的情况下，通常就直接在项目目录下建立静态文件夹，用于用户存放项目中的文件资源。如果按不同类型再细分，可以在项目目录下再建立不同的子目录来区分。例如：resources\static\file、resources\static\img等。

* 优点
    * 这样做比较便利，项目直接引用就行，实现起来也简单，无需任何复杂技术，保存数据库记录和访问起来也很方便。
* 缺点
    * 如果只是后台系统的使用一般也不会有什么问题，但是作为一个前端网站使用的话就会存在弊端。一方面，文件和代码耦合在一起，文件越多存放越混乱；另一方面，如果流量比较大，静态文件访问会占据一定的资源，影响正常业务进行，不利于网站快速发展。

### 6.1.2. 独立文件服务器
随着公司业务不断发展，将代码和文件放在同一服务器的弊端就会越来越明显。为了解决上面的问题引入独立图片服务器，工作流程如下：项目上传文件时，首先通过ftp或者ssh将文件上传到图片服务器的某个目录下，再通过ngnix或者apache来访问此目录下的文件，返回一个独立域名的图片URL地址，前端使用文件时就通过这个URL地址读取。

* 优点
    * 图片访问是很消耗服务器资源的（因为会涉及到操作系统的上下文切换和磁盘I/O操作），分离出来后，Web/App服务器可以更专注发挥动态处理的能力；独立存储，更方便做扩容、容灾和数据迁移；方便做图片访问请求的负载均衡，方便应用各种缓存策略（HTTP Header、Proxy Cache等），也更加方便迁移到CDN。
* 缺点
    * 单机存在性能瓶颈，容灾、垂直扩展性稍差

### 6.1.3. 分布式文件系统
通过独立文件服务器可以解决一些问题，如果某天存储文件的那台服务突然down了怎么办？可能你会说，定时将文件系统备份，这台down机的时候，迅速切换到另一台就OK了，但是这样处理需要人工来干预。另外，当存储的文件超过100T的时候怎么办？单台服务器的性能问题？这个时候我们就应该考虑分布式文件系统了。

业务继续发展，单台服务器存储和响应也很快到达了瓶颈，新的业务需要文件访问具有高响应性、高可用性来支持系统。分布式文件系统，一般分为三块内容来配合，服务的存储、访问的仲裁系统，文件存储系统，文件的容灾系统来构成，仲裁系统相当于文件服务器的大脑，根据一定的算法来决定文件存储的位置，文件存储系统负责保存文件，容灾系统负责文件系统和自己的相互备份。

* 优点
    * 扩展能力: 毫无疑问，扩展能力是一个分布式文件系统最重要的特点；高可用性: 在分布式文件系统中，高可用性包含两层，一是整个文件系统的可用性，二是数据的完整和一致性；弹性存储: 可以根据业务需要灵活地增加或缩减数据存储以及增删存储池中的资源，而不需要中断系统运行
* 缺点
    系统复杂度稍高，需要更多服务器







## 6.2. 基本概念
<a href="#menu" style="float:right">目录</a>

### 6.2.1. 什么是FastDFS
FastDFS是一个开源的轻量级分布式文件系统。它解决了大数据量存储和负载均衡等问题。特别适合以中小文件（建议范围：4KB < file_size <500MB）为载体的在线服务，如相册网站、视频网站等等。在UC基于FastDFS开发向用户提供了：网盘，社区，广告和应用下载等业务的存储服务。

FastDFS是一款开源的轻量级分布式文件系统纯C实现，支持Linux、FreeBSD等UNIX系统类google FS，不是通用的文件系统，只能通过专有API访问，目前提供了C、Java和PHP API为互联网应用量身定做，解决大容量文件存储问题，追求高性能和高扩展性FastDFS可以看做是基于文件的key value pair存储系统，称作分布式文件存储服务更为合适。

* FastDFS特性：
    * 文件不分块存储，上传的文件和OS文件系统中的文件一一对应
    * 支持相同内容的文件只保存一份，节约磁盘空间
    * 下载文件支持HTTP协议，可以使用内置Web Server，也可以和其他Web Server配合使用
    * 支持在线扩容
    * 支持主从文件
    * 存储服务器上可以保存文件属性（meta-data）V2.0网络通信采用libevent，支持大并发访问，整体性能更好

存储节点采用了分组（group）的方式。存储系统由一个或多个group组成，group与group之间的文件是相互独立的，所有group的文件容量累加就是整个存储系统中的文件容量。一个group可以由一台或多台存储服务器组成，一个group下的存储服务器中的文件都是相同的，group中的多台存储服务器起到了冗余备份和负载均衡的作用（一个组的存储容量为该组内存储服务器容量最小的那个，不同组的Storage server之间不会相互通信，同组内的Storage server之间会相互连接进行文件同步）。

在group中增加服务器时，同步已有的文件由系统自动完成，同步完成后，系统自动将新增服务器切换到线上提供服务。

当存储空间不足或即将耗尽时，可以动态添加group。只需要增加一台或多台服务器，并将它们配置为一个新的group，这样就扩大了存储系统的容量。

FastDFS只有两个角色：Tracker server和Storage server。Tracker server作为中心结点，其主要作用是负载均衡和调度。Tracker server在内存中记录分组和Storage server的状态等信息，不记录文件索引信息，占用的内存量很少。另外，客户端（应用）和Storage server访问Tracker server时，Tracker server扫描内存中的分组和Storage server信息，然后给出应答。由此可以看出Tracker server非常轻量化，不会成为系统瓶颈。

FastDFS中的Storage server在其他文件系统中通常称作Trunk server或Data server。Storage server直接利用OS的文件系统存储文件。FastDFS不会对文件进行分块存储，客户端上传的文件和Storage server上的文件一一对应（FastDFS中的文件标识分为两个部分：组名和文件名，二者缺一不可）


* FastDFS是一个轻量级分布式文件系统。能够对文件进行管理，功能包括：文件存储、文件同步、文件访问（文件上传、文件下载）等。

![网络拓扑图](http://www.ityouknow.com/assets/images/2018/fastdfs/fastdfs_arch.png)

* client
    * 客户端
* tracker
    * 调度服务器,负载均衡和调度，管理所有的卷[volume]包括其中的storage server
    * 每个storage在启动后会连接Tracker，告知自己所属的group等信息，并保持周期性的心跳，tracker根据storage的心跳信息，建立group==>[storage server list]的映射表。
    * Tracker的集群中所有的tracker是平等的，客户端请求tracker server采用轮询的方法，如果请求的tracker不能提供服务就换另一个tracker。
* storage
    * 存储服务器,主要作用是文件存储
    * 如上图，storage做集群时，以组[group]为单位（也可以将一个组看成一个卷[volume]，不同材料称呼不同。集群的总容量为所有组的总和。
    * 一个卷内storage server之间相互通信，文件进行同步，保证组内storage完全一致，所以一个卷的容量以最小的服务器为准。不同的卷之间相互不通信。
    * 当某个卷的压力较大时可以添加storage server（纵向扩展），如果系统容量不够可以添加卷（横向扩展）。

**Storage server**

存储服务器（又称：存储节点或数据服务器），文件和文件属性（meta data）都保存到存储服务器上。Storage server直接利用OS的文件系统调用管理文件。

Storage server（后简称storage）以组（卷，group或volume）为单位组织，一个group内包含多台storage机器，数据互为备份，存储空间以group内容量最小的storage为准，所以建议group内的多个storage尽量配置相同，以免造成存储空间的浪费。

以group为单位组织存储能方便的进行应用隔离、负载均衡、副本数定制（group内storage server数量即为该group的副本数），比如将不同应用数据存到不同的group就能隔离应用数据，同时还可根据应用的访问特性来将应用分配到不同的group来做负载均衡；缺点是group的容量受单机存储容量的限制，同时当group内有机器坏掉时，数据恢复只能依赖group内地其他机器，使得恢复时间会很长。

group内每个storage的存储依赖于本地文件系统，storage可配置多个数据存储目录，比如有10块磁盘，分别挂载在/data/disk1-/data/disk10，则可将这10个目录都配置为storage的数据存储目录。

storage接受到写文件请求时，会根据配置好的规则（后面会介绍），选择其中一个存储目录来存储文件。为了避免单个目录下的文件数太多，在storage第一次启动时，会在每个数据存储目录里创建2级子目录，每级256个，总共65536个文件，新写的文件会以hash的方式被路由到其中某个子目录下，然后将文件数据直接作为一个本地文件存储到该目录中。

**Tracker server**
和数据服务器交互的枢纽。相比GFS中的master更为精简，不记录文件索引信息，占用的内存量很少。

Tracker是FastDFS的协调者，负责管理所有的storage server和group，每个storage在启动后会连接Tracker，告知自己所属的group等信息，并保持周期性的心跳，tracker根据storage的心跳信息，建立group==>[storage server list]的映射表。

Tracker需要管理的元信息很少，会全部存储在内存中；另外tracker上的元信息都是由storage汇报的信息生成的，本身不需要持久化任何数据，这样使得tracker非常容易扩展，直接增加tracker机器即可扩展为tracker cluster来服务，cluster里每个tracker之间是完全对等的，所有的tracker都接受stroage的心跳信息，生成元数据信息来提供读写服务。

**client**
客户端，作为业务请求的发起方，通过专有接口，使用TCP/IP协议与跟踪器服务器或存储节点进行数据交互。FastDFS向使用者提供基本文件访问接口，比如upload、download、append、delete等，以客户端库的方式提供给用户使用。

**group**
组， 也可称为卷。 同组内服务器上的文件是完全相同的 ，同一组内的storage server之间是对等的， 文件上传、 删除等操作可以在任意一台storage server上进行 。

**meta data**
文件相关属性，键值对（ Key Value Pair） 方式，如：width=1024,heigth=768 。



## 6.3. 工作流程
<a href="#menu" style="float:right">目录</a>

### 6.3.1. 文件上传
<a href="#menu" style="float:right">目录</a>

首先客户端请求Tracker服务获取到存储服务器的ip地址和端口，然后客户端根据返回的IP地址和端口号请求上传文件，存储服务器接收到请求后生产文件，并且将文件内容写入磁盘并返回给客户端file_id、路径信息、文件名等信息，客户端保存相关信息上传完毕。

![文件上传示意图](https://img-blog.csdn.net/20161225092626091?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXhmbG92ZWdzMjAxMg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

**选择tracker server**
当集群中不止一个tracker server时，由于tracker之间是完全对等的关系，客户端在upload文件时可以任意选择一个trakcer。
选择存储的group
当tracker接收到upload file的请求时，会为该文件分配一个可以存储该文件的group，支持如下选择group的规则：
* Round robin，所有的group间轮询
* Specified group，指定某一个确定的group
* Load balance，剩余存储空间多多group优先

**选择storage server**
当选定group后，tracker会在group内选择一个storage server给客户端，支持如下选择storage的规则：
* Round robin，在group内的所有storage间轮询
* First server ordered by ip，按ip排序
* First server ordered by priority，按优先级排序（优先级在storage上配置）

**选择storage path**
当分配好storage server后，客户端将向storage发送写文件请求，storage将会为文件分配一个数据存储目录，支持如下规则：
* Round robin，多个存储目录间轮询
* 剩余存储空间最多的优先

**生成Fileid**
选定存储目录之后，storage会为文件生一个Fileid，由storage server ip、文件创建时间、文件大小、文件crc32和一个随机数拼接而成，然后将这个二进制串进行base64编码，转换为可打印的字符串。
选择两级目录
当选定存储目录之后，storage会为文件分配一个fileid，每个存储目录下有两级256*256的子目录，storage会按文件fileid进行两次hash（猜测），路由到其中一个子目录，然后将文件以fileid为文件名存储到该子目录下。

**生成文件名**
当文件存储到某个子目录后，即认为该文件存储成功，接下来会为该文件生成一个文件名，文件名由group、存储目录、两级子目录、fileid、文件后缀名（由客户端指定，主要用于区分文件类型）拼接而成。



**文件索引FID**
![文件路径名称](https://img-blog.csdn.net/20161225092446927?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXhmbG92ZWdzMjAxMg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)
* 组名
    * 文件上传后所在的存储组名称，在文件上传成功后有存储服务器返回，需要客户端自行保存。
* 虚拟磁盘路径
    * 存储服务器配置的虚拟路径，与磁盘选项store_path*对应。
* 数据两级目录
    * 存储服务器在每个虚拟磁盘路径下创建的两级目录，用于存储数据文件。
* 文件名
    * 与文件上传时不同。是由存储服务器根据特定信息生成，文件名包含：源存储服务器IP地址、文件创建时间戳、文件大小、随机数和文件拓展名等信息。

**文件快速定位**
![快速定位文件](http://www.ityouknow.com/assets/images/2018/fastdfs/find.jpg)
知道FastDFS FID的组成后，我们来看看FastDFS是如何通过这个精巧的FID定位到需要访问的文件。
1、通过组名tracker能够很快的定位到客户端需要访问的存储服务器组，并将选择合适的存储服务器提供客户端访问；
2、存储服务器根据“文件存储虚拟磁盘路径”和“数据文件两级目录”可以很快定位到文件所在目录，并根据文件名找到客户端需要访问的文件






### 6.3.2. 文件下载
<a href="#menu" style="float:right">目录</a>
客户端带上文件名信息请求Tracker服务获取到存储服务器的ip地址和端口，然后客户端根据返回的IP地址和端口号请求下载文件，存储服务器接收到请求后返回文件给客户端。
![文件下载](https://img-blog.csdn.net/20161225092601950?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXhmbG92ZWdzMjAxMg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

* 选择tracker server：和upload file一样，在download file时随机选择tracker server。
* 选择group：tracker发送download请求给某个tracker，必须带上文件名信息，tracke从文件名中解析出文件的group、大小、创建时间等信息，根据group信息选择对应的group
* 选择storage server：从group中选择一个storage用来服务读请求。由于group内的文件同步时在后台异步进行的，所以有可能出现在读到时候，文件还没有同步到某些storage server上，为了尽量避免访问到这样的storage，tracker按照一定的规则选择group内可读的storage。

客户端upload file成功后，会拿到一个storage生成的文件名，接下来客户端根据这个文件名即可访问到该文件。
跟upload file一样，在download file时客户端可以选择任意tracker server。
tracker发送download请求给某个tracker，必须带上文件名信息，tracke从文件名中解析出文件的group、大小、创建时间等信息，然后为该请求选择一个storage用来服务读请求。由于group内的文件同步时在后台异步进行的，所以有可能出现在读到时候，文件还没有同步到某些storage server上，为了尽量避免访问到这样的storage，tracker按照如下规则选择group内可读的storage。

该文件上传到的源头storage -源头storage只要存活着，肯定包含这个文件，源头的地址被编码在文件名中。
文件创建时间戳==storage被同步到的时间戳且(当前时间-文件创建时间戳)>文件同步最大时间（如5分钟)-文件创建后，
认为经过最大同步时间后，肯定已经同步到其他storage了。
文件创建时间戳< storage被同步到的时间戳。-同步时间戳之前的文件确定已经同步了
4.(当前时间-文件创建时间戳)>同步延迟阀值（如一天）。-经过同步延迟阈值时间，认为文件肯定已经同步了。



## 6.4. FastDFS为什么要结合Nginx
<a href="#menu" style="float:right">目录</a>

我们在使用FastDFS部署一个分布式文件系统的时候，通过FastDFS的客户端API来进行文件的上传、下载、删除等操作。同时通过FastDFS的HTTP服务器来提供HTTP服务。但是FastDFS的HTTP服务较为简单，无法提供负载均衡等高性能的服务，所以FastDFS的开发者——淘宝的架构师余庆同学，为我们提供了Nginx上使用的FastDFS模块（也可以叫FastDFS的Nginx模块）。其使用非常简单。

FastDFS通过Tracker服务器,将文件放在Storage服务器存储,但是同组之间的服务器需要复制文件,有延迟的问题.假设Tracker服务器将文件上传到了192.168.1.80,文件ID已经返回客户端,这时,后台会将这个文件复制到192.168.1.30,如果复制没有完成,客户端就用这个ID在192.168.1.30取文件,肯定会出现错误。这个fastdfs-nginx-module可以重定向连接到源服务器取文件,避免客户端由于复制延迟的问题,出现错误.

## 6.5. 配置文件说明
<a href="#menu" style="float:right">目录</a>

**track.conf**

```
 # is this config file disabled
 # false for enabled
 # true for disabled
 disabled=false
 # 这个配置文件是否不生效,呵呵(改成是否生效是不是会让人感觉好点呢?) false 为生效(否则不生效) true反之

# bind an address of this host
 # empty for bind all addresses of this host
 bind_addr=
 # 是否绑定IP,
 # bind_addr= 后面为绑定的IP地址 (常用于服务器有多个IP但只希望一个IP提供服务)。如果不填则表示所有的(一般不填就OK),相信较熟练的SA都常用到类似功能,很多系统和应用都有

# the tracker server port
 port=22122
 # 提供服务的端口,不作过多解释了

# connect timeout in seconds
 # default value is 30s
 connect_timeout=30
 #连接超时时间，针对socket套接字函数connect

 # network timeout in seconds
 network_timeout=60
 #  tracker server的网络超时，单位为秒。发送或接收数据时，如果在超时时间后还不能发送或接收数据，则本次网络通信失败。

# the base path to store data and log files
 base_path=/home/yuqing/fastdfs
 # base_path 目录地址(根目录必须存在,子目录会自动创建)
 # 附目录说明: 
  tracker server目录及文件结构：
  ${base_path}
    |__data
    |    |__storage_groups.dat：存储分组信息
    |    |__storage_servers.dat：存储服务器列表
    |__logs
          |__trackerd.log：tracker server日志文件

 数据文件storage_groups.dat和storage_servers.dat中的记录之间以换行符（\n）分隔，字段之间以西文逗号（,）分隔。
storage_groups.dat中的字段依次为：
  1. group_name：组名
  2. storage_port：storage server端口号

storage_servers.dat中记录storage server相关信息，字段依次为：
  1. group_name：所属组名
  2. ip_addr：ip地址
  3. status：状态
  4. sync_src_ip_addr：向该storage server同步已有数据文件的源服务器
  5. sync_until_timestamp：同步已有数据文件的截至时间（UNIX时间戳）
  6. stat.total_upload_count：上传文件次数
  7. stat.success_upload_count：成功上传文件次数
  8. stat.total_set_meta_count：更改meta data次数
  9. stat.success_set_meta_count：成功更改meta data次数
  10. stat.total_delete_count：删除文件次数
  11. stat.success_delete_count：成功删除文件次数
  12. stat.total_download_count：下载文件次数
  13. stat.success_download_count：成功下载文件次数
  14. stat.total_get_meta_count：获取meta data次数
  15. stat.success_get_meta_count：成功获取meta data次数
  16. stat.last_source_update：最近一次源头更新时间（更新操作来自客户端）
  17. stat.last_sync_update：最近一次同步更新时间（更新操作来自其他storage server的同步）

# max concurrent connections this server supported
 # max_connections worker threads start when this service startup
 max_connections=256
 # 系统提供服务时的最大连接数。对于V1.x，因一个连接由一个线程服务，也就是工作线程数。
# 对于V2.x，最大连接数和工作线程数没有任何关系

# work thread count, should <= max_connections
 # default value is 4
 # since V2.00
 # V2.0引入的这个参数，工作线程数，通常设置为CPU数
work_threads=4

 # the method of selecting group to upload files
 # 0: round robin
 # 1: specify group
 # 2: load balance, select the max free space group to upload file
 store_lookup=2
 # 上传组(卷) 的方式 0:轮询方式 1: 指定组 2: 平衡负载(选择最大剩余空间的组(卷)上传)
 # 这里如果在应用层指定了上传到一个固定组,那么这个参数被绕过

# which group to upload file
 # when store_lookup set to 1, must set store_group to the group name
 store_group=group2
 # 当上一个参数设定为1 时 (store_lookup=1，即指定组名时)，必须设置本参数为系统中存在的一个组名。如果选择其他的上传方式，这个参数就没有效了。

# which storage server to upload file
 # 0: round robin (default)
 # 1: the first server order by ip address
 # 2: the first server order by priority (the minimal)
 store_server=0
 # 选择哪个storage server 进行上传操作(一个文件被上传后，这个storage server就相当于这个文件的storage server源，会对同组的storage server推送这个文件达到同步效果)
 # 0: 轮询方式 
 # 1: 根据ip 地址进行排序选择第一个服务器（IP地址最小者）
# 2: 根据优先级进行排序（上传优先级由storage server来设置，参数名为upload_priority）

# which path(means disk or mount point) of the storage server to upload file
 # 0: round robin
 # 2: load balance, select the max free space path to upload file
 store_path=0
 # 选择storage server 中的哪个目录进行上传。storage server可以有多个存放文件的base path（可以理解为多个磁盘）。
# 0: 轮流方式，多个目录依次存放文件
# 2: 选择剩余空间最大的目录存放文件（注意：剩余磁盘空间是动态的，因此存储到的目录或磁盘可能也是变化的）

# which storage server to download file
 # 0: round robin (default)
 # 1: the source storage server which the current file uploaded to
 download_server=0
 # 选择哪个 storage server 作为下载服务器 
# 0: 轮询方式，可以下载当前文件的任一storage server
 # 1: 哪个为源storage server 就用哪一个 (前面说过了这个storage server源 是怎样产生的) 就是之前上传到哪个storage server服务器就是哪个了

# reserved storage space for system or other applications.
 # if the free(available) space of any stoarge server in
 # a group <= reserved_storage_space,
 # no file can be uploaded to this group.
 # bytes unit can be one of follows:
 ### G or g for gigabyte(GB)
 ### M or m for megabyte(MB)
 ### K or k for kilobyte(KB)
 ### no unit for byte(B)
 ### XX.XX% as ratio such as reserved_storage_space = 10%
 reserved_storage_space = 10%
 # storage server 上保留的空间，保证系统或其他应用需求空间。可以用绝对值或者百分比（V4开始支持百分比方式）。
#(指出 如果同组的服务器的硬盘大小一样,以最小的为准,也就是只要同组中有一台服务器达到这个标准了,这个标准就生效,原因就是因为他们进行备份)

 #standard log level as syslog, case insensitive, value list:
 ### emerg for emergency
 ### alert
 ### crit for critical
 ### error
 ### warn for warning
 ### notice
 ### info
 ### debug
 log_level=info
 # 选择日志级别(日志写在哪?看前面的说明了,有目录介绍哦 呵呵)

 #unix group name to run this program, 
 #not set (empty) means run by the group of current user
 run_by_group=
 # 操作系统运行FastDFS的用户组 (不填 就是当前用户组,哪个启动进程就是哪个)

 #unix username to run this program,
 #not set (empty) means run by current user
 run_by_user=
 # 操作系统运行FastDFS的用户 (不填 就是当前用户,哪个启动进程就是哪个)

 # allow_hosts can ocur more than once, host can be hostname or ip address,
 # "*" means match all ip addresses, can use range like this: 10.0.1.[1-15,20] or
 # host[01-08,20-25].domain.com, for example:
 # allow_hosts=10.0.1.[1-15,20]
 # allow_hosts=host[01-08,20-25].domain.com
 allow_hosts=*
 # 可以连接到此 tracker server 的ip范围（对所有类型的连接都有影响，包括客户端，storage server）

# sync log buff to disk every interval seconds
 # default value is 10 seconds
 sync_log_buff_interval = 10
 # 同步或刷新日志信息到硬盘的时间间隔，单位为秒
# 注意：tracker server 的日志不是时时写硬盘的，而是先写内存。

# check storage server alive interval
 check_active_interval = 120
 # 检测 storage server 存活的时间隔，单位为秒。
# storage server定期向tracker server 发心跳，如果tracker server在一个check_active_interval内还没有收到storage server的一次心跳，那边将认为该storage server已经下线。所以本参数值必须大于storage server配置的心跳时间间隔。通常配置为storage server心跳时间间隔的2倍或3倍。

# thread stack size, should > 512KB
 # default value is 1MB
 thread_stack_size=1MB
 # 线程栈的大小。FastDFS server端采用了线程方式。更正一下，tracker server线程栈不应小于64KB，不是512KB。
# 线程栈越大，一个线程占用的系统资源就越多。如果要启动更多的线程（V1.x对应的参数为max_connections，
V2.0为work_threads），可以适当降低本参数值。

# auto adjust when the ip address of the storage server changed
 # default value is true
 storage_ip_changed_auto_adjust=true
 # 这个参数控制当storage server IP地址改变时，集群是否自动调整。注：只有在storage server进程重启时才完成自动调整。

# storage sync file max delay seconds
 # default value is 86400 seconds (one day)
 # since V2.00
 storage_sync_file_max_delay = 86400
 # V2.0引入的参数。存储服务器之间同步文件的最大延迟时间，缺省为1天。根据实际情况进行调整
# 注：本参数并不影响文件同步过程。本参数仅在下载文件时，判断文件是否已经被同步完成的一个阀值（经验值）

# the max time of storage sync a file
 # default value is 300 seconds
 # since V2.00
 storage_sync_file_max_time = 300
 # V2.0引入的参数。存储服务器同步一个文件需要消耗的最大时间，缺省为300s，即5分钟。
# 注：本参数并不影响文件同步过程。本参数仅在下载文件时，作为判断当前文件是否被同步完成的一个阀值（经验��）

# if use a trunk file to store several small files
 # default value is false
 # since V3.00
 use_trunk_file = false
 # V3.0引入的参数。是否使用小文件合并存储特性，缺省是关闭的。

# the min slot size, should <= 4KB
 # default value is 256 bytes
 # since V3.00
 slot_min_size = 256
 # V3.0引入的参数。
# trunk file分配的最小字节数。比如文件只有16个字节，系统也会分配slot_min_size个字节。

# the max slot size, should > slot_min_size
 # store the upload file to trunk file when it's size <=  this value
 # default value is 16MB
 # since V3.00
 slot_max_size = 16MB
 # V3.0引入的参数。
# 只有文件大小<=这个参数值的文件，才会合并存储。如果一个文件的大小大于这个参数值，将直接保存到一个文件中（即不采用合并存储方式）。

# the trunk file size, should >= 4MB
 # default value is 64MB
 # since V3.00
 trunk_file_size = 64MB
 # V3.0引入的参数。
# 合并存储的trunk file大小，至少4MB，缺省值是64MB。不建议设置得过大。

# if create trunk file advancely
 # default value is false
 trunk_create_file_advance = false
 # 是否提前创建trunk file。只有当这个参数为true，下面3个以trunk_create_file_打头的参数才有效。

# the time base to create trunk file
 # the time format: HH:MM
 # default value is 02:00
 trunk_create_file_time_base = 02:00
 # 提前创建trunk file的起始时间点（基准时间），02:00表示第一次创建的时间点是凌晨2点。

# the interval of create trunk file, unit: second
 # default value is 38400 (one day)
 trunk_create_file_interval = 86400
 # 创建trunk file的时间间隔，单位为秒。如果每天只提前创建一次，则设置为86400

 # the threshold to create trunk file
 # when the free trunk file size less than the threshold, will create 
 # the trunk files
 # default value is 0
 trunk_create_file_space_threshold = 20G
 # 提前创建trunk file时，需要达到的空闲trunk大小
# 比如本参数为20G，而当前空闲trunk为4GB，那么只需要创建16GB的trunk file即可。

# if check trunk space occupying when loading trunk free spaces
 # the occupied spaces will be ignored
 # default value is false
 # since V3.09
 # NOTICE: set this parameter to true will slow the loading of trunk spaces
 # when startup. you should set this parameter to true when neccessary.
 trunk_init_check_occupying = false
 #trunk初始化时，是否检查可用空间是否被占用

# if ignore storage_trunk.dat, reload from trunk binlog
 # default value is false
 # since V3.10
 # set to true once for version upgrade when your version less than V3.10
 trunk_init_reload_from_binlog = false
 # 是否无条件从trunk binlog中加载trunk可用空间信息
# FastDFS缺省是从快照文件storage_trunk.dat中加载trunk可用空间，
# 该文件的第一行记录的是trunk binlog的offset，然后从binlog的offset开始加载

# if use storage ID instead of IP address
 # default value is false
 # since V4.00
 use_storage_id = false
 # 是否使用server ID作为storage server标识

# specify storage ids filename, can use relative or absolute path
 # since V4.00
 storage_ids_filename = storage_ids.conf
 # use_storage_id 设置为true，才需要设置本参数
# 在文件中设置组名、server ID和对应的IP地址，参见源码目录下的配置示例：conf/storage_ids.conf

 # if store slave file use symbol link
 # default value is false
 # since V4.01
 store_slave_file_use_link = false
 # 存储从文件是否采用symbol link（符号链接）方式
# 如果设置为true，一个从文件将占用两个文件：原始文件及指向它的符号链接。

# if rotate the error log every day
 # default value is false
 # since V4.02
 rotate_error_log = false
 # 是否定期轮转error log，目前仅支持一天轮转一次

# rotate error log time base, time format: Hour:Minute
 # Hour from 0 to 23, Minute from 0 to 59
 # default value is 00:00
 # since V4.02
 error_log_rotate_time=00:00
 # error log定期轮转的时间点，只有当rotate_error_log设置为true时有效

# rotate error log when the log file exceeds this size
 # 0 means never rotates log file by log file size
 # default value is 0
 # since V4.02
 rotate_error_log_size = 0
 # error log按大小轮转
# 设置为0表示不按文件大小轮转，否则当error log达到该大小，就会轮转到新文件中

# 以下是关于http的设置了 默认编译是不生效的 要求更改 #WITH_HTTPD=1 将 注释#去掉 再编译
# 关于http的应用 说实话 不是很了解 没有见到 相关说明 ,望 版主可以完善一下 以下是字面解释了
#HTTP settings
 http.disabled=false  # HTTP服务是否不生效 
http.server_port=8080  # HTTP服务端口


#use "#include" directive to include http other settiongs
 ##include http.conf  # 如果加载http.conf的配置文件 去掉第一个#

```

**storage.conf**

```
 # is this config file disabled
 # false for enabled
 # true for disabled
 disabled=false  
 #同上文了 就不多说了

# the name of the group this storage server belongs to
 group_name=group1
 # 指定 此 storage server 所在 组(卷)

 # bind an address of this host
 # empty for bind all addresses of this host
 bind_addr=
 # 同上文

# if bind an address of this host when connect to other servers 
 # (this storage server as a client)
 # true for binding the address configed by above parameter: "bind_addr"
 # false for binding any address of this host
 client_bind=true
 # bind_addr通常是针对server的。当指定bind_addr时，本参数才有效。
# 本storage server作为client连接其他服务器（如tracker server、其他storage server），是否绑定bind_addr。

# the storage server port
 port=23000
 #  storage server服务端口

# connect timeout in seconds
 # default value is 30s
 connect_timeout=30
 #连接超时时间，针对socket套接字函数connect

 # network timeout in seconds
 network_timeout=60
 #  storage server 网络超时时间，单位为秒。发送或接收数据时，如果在超时时间后还不能发送或接收数据，则本次网络通信失败。

# heart beat interval in seconds
 heart_beat_interval=30
 # 心跳间隔时间，单位为秒 (这里是指主动向tracker server 发送心跳)

 # disk usage report interval in seconds
 stat_report_interval=60
 # storage server向tracker server报告磁盘剩余空间的时间间隔，单位为秒。


# the base path to store data and log files
 base_path=/home/yuqing/fastdfs
 # base_path 目录地址,根目录必须存在  子目录会自动生成 (注 :这里不是上传的文件存放的地址,之前是的,在某个版本后更改了)
 # 目录结构 因为 版主没有更新到 论谈上 这里就不发了 大家可以看一下置顶贴:

 # max concurrent connections server supported
 # max_connections worker threads start when this service startup
 max_connections=256
 # 同上文

# work thread count, should <= max_connections
 # default value is 4
 # since V2.00
 # V2.0引入的这个参数，工作线程数，通常设置为CPU数
work_threads=4

 # the buff size to recv / send data
 # default value is 64KB
 # since V2.00
 buff_size = 256KB
 # V2.0引入本参数。设置队列结点的buffer大小。工作队列消耗的内存大小 = buff_size * max_connections
 # 设置得大一些，系统整体性能会有所提升。
# 消耗的内存请不要超过系统物理内存大小。另外，对于32位系统，请注意使用到的内存不要超过3GB

 # if read / write file directly
 # if set to true, open file will add the O_DIRECT flag to avoid file caching
 # by the file system. be careful to set this parameter.
 # default value is false
 disk_rw_direct = false
 # V2.09引入本参数。设置为true，表示不使用操作系统的文件内容缓冲特性。
# 如果文件数量很多，且访问很分散，可以考虑将本参数设置为true

 # if disk read / write separated
 ##  false for mixed read and write
 ##  true for separated read and write
 # default value is true
 # since V2.00
 disk_rw_separated = true
 # V2.0引入本参数。磁盘IO读写是否分离，缺省是分离的。

# disk reader thread count per store base path
 # for mixed read / write, this parameter can be 0
 # default value is 1
 # since V2.00
 disk_reader_threads = 1
 # V2.0引入本参数。针对单个存储路径的读线程数，缺省值为1。
# 读写分离时，系统中的读线程数 = disk_reader_threads * store_path_count
 # 读写混合时，系统中的读写线程数 = (disk_reader_threads + disk_writer_threads) * store_path_count

 # disk writer thread count per store base path
 # for mixed read / write, this parameter can be 0
 # default value is 1
 # since V2.00
 disk_writer_threads = 1
 # V2.0引入本参数。针对单个存储路径的写线程数，缺省值为1。
# 读写分离时，系统中的写线程数 = disk_writer_threads * store_path_count
 # 读写混合时，系统中的读写线程数 = (disk_reader_threads + disk_writer_threads) * store_path_count

 # when no entry to sync, try read binlog again after X milliseconds
 # 0 for try again immediately (not need to wait)
 sync_wait_msec=200
 # 同步文件时，如果从binlog中没有读到要同步的文件，休眠N毫秒后重新读取。0表示不休眠，立即再次尝试读取。
# 出于CPU消耗考虑，不建议设置为0。如何希望同步尽可能快一些，可以将本参数设置得小一些，比如设置为10ms

 # after sync a file, usleep milliseconds
 # 0 for sync successively (never call usleep)
 sync_interval=0
 # 同步上一个文件后，再同步下一个文件的时间间隔，单位为毫秒，0表示不休眠，直接同步下一个文件。

# sync start time of a day, time format: Hour:Minute
 # Hour from 0 to 23, Minute from 0 to 59
 sync_start_time=00:00

 # sync end time of a day, time format: Hour:Minute
 # Hour from 0 to 23, Minute from 0 to 59
 sync_end_time=23:59
 # 上面二个一起解释。允许系统同步的时间段 (默认是全天) 。一般用于避免高峰同步产生一些问题而设定，相信sa都会明白

# write to the mark file after sync N files
 # default value is 500
 write_mark_file_freq=500
 # 同步完N个文件后，把storage的mark文件同步到磁盘
# 注：如果mark文件内容没有变化，则不会同步

# path(disk or mount point) count, default value is 1
 store_path_count=1
 # 存放文件时storage server支持多个路径（例如磁盘）。这里配置存放文件的基路径数目，通常只配一个目录。

# store_path#, based 0, if store_path0 not exists, it's value is base_path
 # the paths must be exist
 store_path0=/home/yuqing/fastdfs
 #store_path1=/home/yuqing/fastdfs2
 # 逐一配置store_path个路径，索引号基于0。注意配置方法后面有0,1,2 ......，需要配置0到store_path - 1。
# 如果不配置base_path0，那边它就和base_path对应的路径一样。

# subdir_count  * subdir_count directories will be auto created under each 
 # store_path (disk), value can be 1 to 256, default value is 256
 subdir_count_per_path=256
 # FastDFS存储文件时，采用了两级目录。这里配置存放文件的目录个数 (系统的存储机制,大家看看文件存储的目录就知道了)
 # 如果本参数只为N（如：256），那么storage server在初次运行时，会自动创建 N * N 个存放文件的子目录。

# tracker_server can ocur more than once, and tracker_server format is
 #  "host:port", host can be hostname or ip address
 tracker_server=10.62.164.84:22122
 tracker_server=10.62.245.170:22122
 # tracker_server 的列表 要写端口的哦 (再次提醒是主动连接tracker_server )
 # 有多个tracker server时，每个tracker server写一行

#standard log level as syslog, case insensitive, value list:
 ### emerg for emergency
 ### alert
 ### crit for critical
 ### error
 ### warn for warning
 ### notice
 ### info
 ### debug
 log_level=info
 # 日志级别不多说

#unix group name to run this program, 
 #not set (empty) means run by the group of current user
 run_by_group=
 # 同上文了

#unix username to run this program,
 #not set (empty) means run by current user
 run_by_user=
 # 同上文了 (提醒注意权限 如果和 webserver不搭 可以会产生错误 哦)

 # allow_hosts can ocur more than once, host can be hostname or ip address,
 # "*" means match all ip addresses, can use range like this: 10.0.1.[1-15,20] or
 # host[01-08,20-25].domain.com, for example:
 # allow_hosts=10.0.1.[1-15,20]
 # allow_hosts=host[01-08,20-25].domain.com
 allow_hosts=*
 # 允许连接本storage server的IP地址列表 （不包括自带HTTP服务的所有连接）
# 可以配置多行，每行都会起作用

# the mode of the files distributed to the data path 
 # 0: round robin(default)
 # 1: random, distributted by hash code
 file_distribute_path_mode=0
 #  文件在data目录下分散存储策略。
# 0: 轮流存放，在一个目录下存储设置的文件数后（参数file_distribute_rotate_count中设置文件数），使用下一个目录进行存储。
# 1: 随机存储，根据文件名对应的hash code来分散存储。

# valid when file_distribute_to_path is set to 0 (round robin), 
 # when the written file count reaches this number, then rotate to next path
 # default value is 100
 file_distribute_rotate_count=100  
 # 当上面的参数file_distribute_path_mode配置为0（轮流存放方式）时，本参数有效。
# 当一个目录下的文件存放的文件数达到本参数值时，后���上传的文件存储到下一个目录中。

# call fsync to disk when write big file
 # 0: never call fsync
 # other: call fsync when written bytes >= this bytes
 # default value is 0 (never call fsync)
 fsync_after_written_bytes=0
 # 当写入大文件时，每写入N个字节，调用一次系统函数fsync将内容强行同步到硬盘。0表示从不调用fsync 

 # sync log buff to disk every interval seconds
 # default value is 10 seconds
 sync_log_buff_interval=10
 # 同步或刷新日志信息到硬盘的时间间隔，单位为秒
# 注意：storage server 的日志信息不是时时写硬盘的，而是先写内存。

# sync binlog buff / cache to disk every interval seconds
 # this parameter is valid when write_to_binlog set to 1
 # default value is 60 seconds
 sync_binlog_buff_interval=60
 # 同步binglog（更新操作日志）到硬盘的时间间隔，单位为秒
# 本参数会影响新上传文件同步延迟时间

# sync storage stat info to disk every interval seconds
 # default value is 300 seconds
 sync_stat_file_interval=300
 # 把storage的stat文件同步到磁盘的时间间隔，单位为秒。
# 注：如果stat文件内容没有变化，不会进行同步

# thread stack size, should >= 512KB
 # default value is 512KB
 thread_stack_size=512KB
 # 线程栈的大小。FastDFS server端采用了线程方式。
# 对于V1.x，storage server线程栈不应小于512KB；对于V2.0，线程栈大于等于128KB即可。
# 线程栈越大，一个线程占用的系统资源就越多。
# 对于V1.x，如果要启动更多的线程（max_connections），可以适当降低本参数值。

# the priority as a source server for uploading file.
 # the lower this value, the higher its uploading priority.
 # default value is 10
 upload_priority=10
 #  本storage server作为源服务器，上传文件的优先级，可以为负数。值越小，优先级越高。这里就和 tracker.conf 中store_server= 2时的配置相对应了

# if check file duplicate, when set to true, use FastDHT to store file indexes
 # 1 or yes: need check
 # 0 or no: do not check
 # default value is 0
 check_file_duplicate=0
 # 是否检测上传文件已经存在。如果已经存在，则不存在文件内容，建立一个符号链接以节省磁盘空间。 
 # 这个应用要配合FastDHT 使用，所以打开前要先安装FastDHT 
 # 1或yes 是检测，0或no 是不检测

# file signature method for check file duplicate
 ## hash: four 32 bits hash code
 ## md5: MD5 signature
 # default value is hash
 # since V4.01
 file_signature_method=hash
 # 文件去重时，文件内容的签名方式：
## hash： 4个hash code
 ## md5：MD5

 # namespace for storing file indexes (key-value pairs)
 # this item must be set when check_file_duplicate is true / on
 key_namespace=FastDFS
 # 当上个参数设定为1 或 yes时 (true/on也是可以的) ， 在FastDHT中的命名空间。

# set keep_alive to 1 to enable persistent connection with FastDHT servers
 # default value is 0 (short connection)
 keep_alive=0
 # 与FastDHT servers 的连接方式 (是否为持久连接) ，默认是0（短连接方式）。可以考虑使用长连接，这要看FastDHT server的连接数是否够用。

# 下面是关于FastDHT servers 的设定 需要对FastDHT servers 有所了解,这里只说字面意思了
# you can use "#include filename" (not include double quotes) directive to 
 # load FastDHT server list, when the filename is a relative path such as 
 # pure filename, the base path is the base path of current/this config file.
 # must set FastDHT server list when check_file_duplicate is true / on
 # please see INSTALL of FastDHT for detail
 ##include /home/yuqing/fastdht/conf/fdht_servers.conf
 # 可以通过 #include filename 方式来加载 FastDHT servers  的配置，装上FastDHT就知道该如何配置啦。
# 同样要求 check_file_duplicate=1 时才有用，不然系统会忽略
# fdht_servers.conf 记载的是 FastDHT servers 列表

# if log to access log
 # default value is false
 # since V4.00
 use_access_log = false
 # 是否将文件操作记录到access log

 # if rotate the access log every day
 # default value is false
 # since V4.00
 rotate_access_log = false
 # 是否定期轮转access log，目前仅支持一天轮转一次

# rotate access log time base, time format: Hour:Minute
 # Hour from 0 to 23, Minute from 0 to 59
 # default value is 00:00
 # since V4.00
 access_log_rotate_time=00:00
 # access log定期轮转的时间点，只有当rotate_access_log设置为true时有效

# if rotate the error log every day
 # default value is false
 # since V4.02
 rotate_error_log = false
 # 是否定期轮转error log，目前仅支持一天轮转一次

# rotate error log time base, time format: Hour:Minute
 # Hour from 0 to 23, Minute from 0 to 59
 # default value is 00:00
 # since V4.02
 error_log_rotate_time=00:00
 # error log定期轮转的时间点，只有当rotate_error_log设置为true时有效

# rotate access log when the log file exceeds this size
 # 0 means never rotates log file by log file size
 # default value is 0
 # since V4.02
 rotate_access_log_size = 0
 # access log按文件大小轮转
# 设置为0表示不按文件大小轮转，否则当access log达到该大小，就会轮转到新文件中

# rotate error log when the log file exceeds this size
 # 0 means never rotates log file by log file size
 # default value is 0
 # since V4.02
 rotate_error_log_size = 0
 # error log按文件大小轮转
# 设置为0表示不按文件大小轮转，否则当error log达到该大小，就会轮转到新文件中

# if skip the invalid record when sync file
 # default value is false
 # since V4.02
 file_sync_skip_invalid_record=false
 # 文件同步的时候，是否忽略无效的binlog记录

 下面是http的配置了。如果系统较大，这个服务有可能支持不了，可以自行换一个webserver，我喜欢lighttpd，当然ng也很好了。具体不说明了。相应这一块的说明大家都懂，不明白见上文。
#HTTP settings
 http.disabled=false

 # the port of the web server on this storage server
 http.server_port=8888

 http.trunk_size=256KB
 # http.trunk_size表示读取文件内容的buffer大小（一次读取的文件内容大小），也就是回复给HTTP client的块大小。


# use the ip address of this storage server if domain_name is empty,
 # else this domain name will ocur in the url redirected by the tracker server
 http.domain_name=
 # storage server上web server域名，通常仅针对单独部署的web server。这样URL中就可以通过域名方式来访问storage server上的文件了，
# 这个参数为空就是IP地址的方式。

#use "#include" directive to include HTTP other settiongs
 ##include http.conf
 
```

## 6.6. FastDFS 同步机制说明：

写文件时，客户端将文件写至group内一个storage server即认为写文件成功，storage server写完文件后，会由后台线程将文件同步至同group内其他的storage server。
每个storage写文件后，同时会写一份binlog，binlog里不包含文件数据，只包含文件名等元信息，这份binlog用于后台同步，storage会记录向group内其他storage同步的进度，以便重启后能接上次的进度继续同步；进度以时间戳的方式进行记录，所以最好能保证集群内所有server的时钟保持同步。
storage的同步进度会作为元数据的一部分汇报到tracker上，tracke在选择读storage的时候会以同步进度作为参考



tracker server会在内存中保存storage分组及各个组下的storage server，并将连接过自己的storage server及其分组保存到文件中，以便下次重启服务时能直接从本地磁盘中获得storage相关信息。storage server会在内存中记录本组的所有服务器，并将服务器信息记录到文件中。tracker server和storage server之间相互同步storage server列表：

1. 如果一个组内增加了新的storage
server或者storage server的状态发生了改变，tracker server都会将storage server列表同步给该组内的所有storage server。以新增storage server为例，因为新加入的storage
server主动连接tracker server，tracker server发现有新的storage server加入，就会将该组内所有的storage server返回给新加入的storage server，并重新将该组的storage server列表返回给该组内的其他storage server；
2. 如果新增加一台tracker server，storage server连接该tracker server，发现该tracker server返回的本组storage server列表比本机记录的要少，就会将该tracker server上没有的storage server同步给该tracker server。同一组内的storage server之间是对等的，文件上传、删除等操作可以在任意一台storage server上进行。文件同步只在同组内的storage server之间进行，采用push方式，即源服务器同步给目标服务器。以文件上传为例，假设一个组内有3台storage server A、B和C，文件F上传到服务器B，由B将文件F同步到其余的两台服务器A和C。我们不妨把文件F上传到服务器B的操作为源头操作，在服务器B上的F文件为源头数据；文件F被同步到服务器A和C的操作为备份操作，在A和C上的F文件为备份数据。同步规则总结如下：
1. 只在本组内的storage server之间进行同步；
2. 源头数据才需要同步，备份数据不需要再次同步，否则就构成环路了；
3. 上述第二条规则有个例外，就是新增加一台storage server时，由已有的一台storage server将已有的所有数据（包括源头数据和备份数据）同步给该新增服务器。storage server有7个状态，如下：
* FDFS_STORAGE_STATUS_INIT :初始化，尚未得到同步已有数据的源服务器
* FDFS_STORAGE_STATUS_WAIT_SYNC :等待同步，已得到同步已有数据的源服务器
* FDFS_STORAGE_STATUS_SYNCING :同步中
* FDFS_STORAGE_STATUS_DELETED :已删除，该服务器从本组中摘除（注：本状态的功能尚未实现）
* FDFS_STORAGE_STATUS_OFFLINE :离线
* FDFS_STORAGE_STATUS_ONLINE :在线，尚不能提供服务
* FDFS_STORAGE_STATUS_ACTIVE :在线，可以提供服务

当storageserver的状态为FDFS_STORAGE_STATUS_ONLINE时，当该storage server向tracker server发起一次heart beat时，tracker server将其状态更改为FDFS_STORAGE_STATUS_ACTIVE。


组内新增加一台storage server A时，由系统自动完成已有数据同步，处理逻辑如下：
1. storage server A连接tracker server，tracker server将storage server A的状态设置为FDFS_STORAGE_STATUS_INIT。storage server A询问追加同步的源服务器和追加同步截至时间点，如果该组内只有storage server A或该组内已成功上传的文件数为0，则没有数据需要同步，storage server A就可以提供在线服务，此时tracker将其状态设置为FDFS_STORAGE_STATUS_ONLINE，否则tracker
server将其状态设置为FDFS_STORAGE_STATUS_WAIT_SYNC，进入第二步的处理；
2. 假设tracker
server分配向storage server A同步已有数据的源storage server为B。同组的storage server和tracker server通讯得知新增了storage server A，将启动同步线程，并向tracker server询问向storage server A追加同步的源服务器和截至时间点。storage server B将把截至时间点之前的所有数据同步给storage server A；而其余的storage server从截至时间点之后进行正常同步，只把源头数据同步给storage server A。到了截至时间点之后，storage server B对storage server A的同步将由追加同步切换为正常同步，只同步源头数据；
3. storage server
B向storage server A同步完所有数据，暂时没有数据要同步时，storage server B请求tracker server将storage server A的状态设置为FDFS_STORAGE_STATUS_ONLINE；
4 当storage server A向tracker server发起heart beat时，tracker server将其状态更改为FDFS_STORAGE_STATUS_ACTIVE。

## 6.7. 安装配置
<a href="#menu" style="float:right">目录</a>

[参考](https://www.cnblogs.com/chiangchou/p/fastdfs.html)

## 6.8. Java客户端使用
<a href="#menu" style="float:right">目录</a>

```xml
<dependency>
    <groupId>com.github.tobato</groupId>
    <artifactId>fastdfs-client</artifactId>
    <version>1.26.6-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>

```

[参考GitHub](https://github.com/tobato/FastDFS_Client)
<span id="menu"></span>


# 7. 性能调优
<a href="#menu" style="float:right">目录</a>

## 7.1. 性能调优概述

## 7.2. 操作系统性能监控
<a href="#menu" style="float:right">目录</a>

**vmstat**

```bash
lgj@lgj-Lenovo-G470:~/aProject/aRealPrj/Java-Interview$ vmstat 5
procs -----------memory---------- ---swap-- -----io---- -system-- ------cpu-----
 r  b   swpd   free   buff  cache   si   so    bi    bo   in   cs us sy id wa st
 0  0      0 2583376 206884 2458524    0    0    17    17  204  216  8  2 89  1  0
 0  0      0 2600524 206892 2439504    0    0     0    91  485 1380  2  1 97  0  0

```
## 7.3. 使用JMH做Benchmark基准测试
<a href="#menu" style="float:right">目录</a>

**BenchMark介绍**
BenchMark 又叫做基准测试，主要用来测试一些方法的性能，可以根据不同的参数以不同的单位进行计算（例如可以使用吞吐量为单位，也可以使用平均时间作为单位，在 BenchmarkMode 里面进行调整）。

**开始前的步骤**
项目使用的是 Maven，因此只要对 pom.xml 添加依赖即可。

```XML
<dependency>
    <groupId>org.openjdk.jmh</groupId>
    <artifactId>jmh-core</artifactId>
    <version>1.19</version>
</dependency>
<dependency>
    <groupId>org.openjdk.jmh</groupId>
    <artifactId>jmh-generator-annprocess</artifactId>
    <version>1.19</version>
    <scope>provided</scope>
</dependency>
```

**例子**

```JAVA
package com.psd.benchmark;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Author: Shadowdsp
 * Date: 18/07/22
 */

@BenchmarkMode(Mode.Throughput) // 吞吐量
@OutputTimeUnit(TimeUnit.MILLISECONDS) // 结果所使用的时间单位
@State(Scope.Thread) // 每个测试线程分配一个实例
@Fork(2) // Fork进行的数目
@Warmup(iterations = 4) // 先预热4轮
@Measurement(iterations = 10) // 进行10轮测试
public class BenchMark {

    @Param({"10", "40", "70", "100"}) // 定义四个参数，之后会分别对这四个参数进行测试
    private int n;

    private List<Integer> array;
    private List<Integer> list;

    @Setup(Level.Trial) // 初始化方法，在全部Benchmark运行之前进行
    public void init() {
        array = new ArrayList<>(0);
        list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            array.add(i);
            list.add(i);
        }
    }

    @Benchmark
    public void arrayTraverse() {
        for (int i = 0; i < n; i++) {
            array.get(i);
        }
    }

    @Benchmark
    public void listTraverse() {
        for (int i = 0; i < n; i++) {
            list.get(i);
        }
    }

    @TearDown(Level.Trial) // 结束方法，在全部Benchmark运行之后进行
    public void arrayRemove() {
        for (int i = 0; i < n; i++) {
            array.remove(0);
            list.remove(0);
        }
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder().include(BenchMark.class.getSimpleName()).build();
        new Runner(options).run();
    }
}
```

```
# JMH version: 1.19
# VM version: JDK 1.8.0_144, VM 25.144-b01
# VM invoker: E:\Java\JDK8\jre\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.3.1\lib\idea_rt.jar=6182:C:\Program Files\JetBrains\IntelliJ IDEA 2017.3.1\bin -Dfile.encoding=UTF-8
# Warmup: 4 iterations, 1 s each
# Measurement: 10 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.psd.benchmark.BenchMark.arrayTraverse
# Parameters: (n = 10)

# Run progress: 0.00% complete, ETA 00:03:44
# Fork: 1 of 2
# Warmup Iteration   1: 189538.902 ops/ms
# Warmup Iteration   2: 287165.702 ops/ms
# Warmup Iteration   3: 282388.510 ops/ms
# Warmup Iteration   4: 277296.753 ops/ms
Iteration   1: 288687.174 ops/ms
Iteration   2: 277046.541 ops/ms
Iteration   3: 288680.458 ops/ms
Iteration   4: 279775.705 ops/ms
Iteration   5: 289098.257 ops/ms
Iteration   6: 287462.515 ops/ms
Iteration   7: 255330.788 ops/ms
Iteration   8: 282631.894 ops/ms
Iteration   9: 277038.372 ops/ms
Iteration  10: 277690.784 ops/ms

# Run progress: 6.25% complete, ETA 00:03:42
# Fork: 2 of 2
# Warmup Iteration   1: 286568.900 ops/ms
# Warmup Iteration   2: 288014.591 ops/ms
# Warmup Iteration   3: 281790.934 ops/ms
# Warmup Iteration   4: 279647.288 ops/ms
Iteration   1: 280839.175 ops/ms
Iteration   2: 289208.462 ops/ms
Iteration   3: 282724.949 ops/ms
Iteration   4: 289762.265 ops/ms
Iteration   5: 284551.820 ops/ms
Iteration   6: 283700.745 ops/ms
Iteration   7: 261083.800 ops/ms
Iteration   8: 283651.988 ops/ms
Iteration   9: 284418.725 ops/ms
Iteration  10: 282418.733 ops/ms




# Run complete. Total time: 00:03:56
(一般只需要关注这下面的东西)

Benchmark                (n)   Mode  Cnt       Score       Error   Units
BenchMark.arrayTraverse   10  thrpt   20  281290.158 ±  7750.303  ops/ms
BenchMark.arrayTraverse   40  thrpt   20  279251.339 ±  6287.385  ops/ms
BenchMark.arrayTraverse   70  thrpt   20  281224.067 ±  7376.077  ops/ms
BenchMark.arrayTraverse  100  thrpt   20  269576.123 ± 14237.446  ops/ms
BenchMark.listTraverse    10  thrpt   20   36438.771 ±  1680.987  ops/ms
BenchMark.listTraverse    40  thrpt   20    5912.221 ±   271.819  ops/ms
BenchMark.listTraverse    70  thrpt   20    1752.306 ±    77.143  ops/ms
BenchMark.listTraverse   100  thrpt   20     767.444 ±    28.363  ops/ms


Process finished with exit code 0

```

大多数情况只需要关注最下面的结果。

可以结合 Score 和 Unit 这两列，看到方法的效率。这里显然 arrayTraverse 的效率比 listTraverse 的高很多，因为 Unit 单位是 ops/ms，即单位时间内执行的操作数。所以显然在遍历的时候，ArrayList的效率是比LinkedList高的。

**注解介绍**

* **@BenchmarkMode**
Mode 表示 JMH 进行 Benchmark 时所使用的模式。通常是测量的维度不同，或是测量的方式不同。目前 JMH 共有四种模式：

    Throughput: 整体吞吐量，例如“1秒内可以执行多少次调用”，单位是操作数/时间。
    AverageTime: 调用的平均时间，例如“每次调用平均耗时xxx毫秒”，单位是时间/操作数。
    SampleTime: 随机取样，最后输出取样结果的分布，例如“99%的调用在xxx毫秒以内，99.99%的调用在xxx毫秒以内”
    SingleShotTime: 以上模式都是默认一次 iteration 是 1s，唯有 SingleShotTime 是只运行一次。往往同时把 warmup 次数设为0，用于测试冷启动时的性能。
    
* **@OutputTimeUnit**
输出的时间单位。

* **@Iteration**
Iteration 是 JMH 进行测试的最小单位。在大部分模式下，一次 iteration 代表的是一秒，JMH 会在这一秒内不断调用需要 Benchmark 的方法，然后根据模式对其采样，计算吞吐量，计算平均执行时间等。

* **@WarmUp**
Warmup 是指在实际进行 Benchmark 前先进行预热的行为。

    为什么需要预热？因为 JVM 的 JIT 机制的存在，如果某个函数被调用多次之后，JVM 会尝试将其编译成为机器码从而提高执行速度。为了让 Benchmark 的结果更加接近真实情况就需要进行预热。

* **@State**
类注解，JMH测试类必须使用 @State 注解，它定义了一个类实例的生命周期，可以类比 Spring Bean 的 Scope。由于 JMH 允许多线程同时执行测试，不同的选项含义如下：

    Scope.Thread：默认的 State，每个测试线程分配一个实例；
    Scope.Benchmark：所有测试线程共享一个实例，用于测试有状态实例在多线程共享下的性能；
    Scope.Group：每个线程组共享一个实例；

* **@Fork**
进行 fork 的次数。如果 fork 数是2的话，则 JMH 会 fork 出两个进程来进行测试。

* **@Meansurement**
提供真正的测试阶段参数。指定迭代的次数，每次迭代的运行时间和每次迭代测试调用的数量(通常使用 @BenchmarkMode(Mode.SingleShotTime) 测试一组操作的开销——而不使用循环)

* **@Setup**
方法注解，会在执行 benchmark 之前被执行，正如其名，主要用于初始化。

* **@TearDown**
方法注解，与@Setup 相对的，会在所有 benchmark 执行结束以后执行，主要用于资源的回收等。

* **@Setup/@TearDown注解使用Level参数来指定何时调用fixture：**

|名称|	描述
|---|---|	
|Level.Trial|	默认level。全部benchmark运行(一组迭代)之前/之后	
|Level.Iteration|	一次迭代之前/之后(一组调用)	
|Level.Invocation|	每个方法调用之前/之后(不推荐使用，除非你清楚这样做的目的)	

* **@Benchmark**
方法注解，表示该方法是需要进行 benchmark 的对象。

* **@Param**
成员注解，可以用来指定某项参数的多种情况。特别适合用来测试一个函数在不同的参数输入的情况下的性能。@Param 注解接收一个String数组，在 @Setup 方法执行前转化为为对应的数据类型。多个 @Param 注解的成员之间是乘积关系，譬如有两个用 @Param 注解的字段，第一个有5个值，第二个字段有2个值，那么每个测试方法会跑5*2=10次。



## 7.4. JVM
<a href="#menu" style="float:right">目录</a>

### 7.4.1. JIT编译器

#### 7.4.1.1. 概述

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



### 7.4.2. JVM内存模型
<a href="#menu" style="float:right">目录</a>
![](https://img2018.cnblogs.com/blog/163758/201811/163758-20181101131229284-1189515543.png)

### 7.4.3. JVM的内存空间
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
#### 7.4.3.1. 对象内存布局
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

#### 7.4.3.2. 对象访问定位

* 句柄访问
    * 使用句柄访问方式，java堆将会划分出来一部分内存去来作为句柄池，reference中存储的就是对象的句柄地址。而句柄中则包含对象实例数据的地址和对象类型数据（如对象的类型，实现的接口、方法、父类、field等）的具体地址信息。
    * 使用句柄访最大的好处是reference中存储着稳定的句柄地址，当对象移动之后（垃圾收集时移动对象是非常普遍的行为），只需要改变句柄中的对象实例地址即可，reference不用修改。
* 直接指针访问(hotspot使用)
    * 如果使用指针访问，那么java堆对象的布局中就必须考虑如何放置访问类型的相关信息（如对象的类型，实现的接口、方法、父类、field等），而reference中存储的就是对象的地址。
    * 使用指针访问的好处是访问速度快，它减少了一次指针定位的时间开销，由于java是面向对象的语言，在开发中java对象的访问非常的频繁，因此这类开销积少成多也是非常可观的，反之则提升访问速度。

### 7.4.4. 垃圾回收算法
<a href="#menu" style="float:right">目录</a>

#### 7.4.4.1. 对象回收判定

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

#### 7.4.4.2. 对象引用分类
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

#### 7.4.4.3. 标记清除算法
* 先标记可回收的对象空间，在标记完成之后进行统一的回收
* 缺点
    * 效率问题，标记和清除两个过程的效率都不高
    * 空间问题，清除后将产生内存碎片，不利于二次使用

#### 7.4.4.4. 复制算法
* 内存按容量分为两个区块，每次只使用一个区块用于内存分配
* 垃圾回收时，将存活的对象复制到另一个区块，按顺序存放
* 复制完成后，一次性清理之前的区块
* 新创建对象将在另一个区块中分配
* 优点
    * 不产生碎片内存
* 缺点
    * 空间利用率不高，每次只能有一块区域分配内存。
    * 复制效率不高

#### 7.4.4.5. 标记整理算法
* 标记对象，然后让存活的对象往一边移动，最后一次性清理掉端边界以外的内存。

#### 7.4.4.6. 分代收集算法
* 将内存分为老年代和新生代
* 新创建的对象在新生代进行内存分配，经过多次垃圾回收之后仍然存活的对象将被放到老年代
* 新生代的对象一般生命周期短，大部分都会被回收掉，因此每次垃圾收集只有很少的对象存活，因此使用复制算法效率比较高
* 老年代的对象经过多次回收仍然存活，说明生命周期长，不容易被回收。因此每次垃圾回收只有少量的对象被回收，因此使用标记清除/标记整理算法效率比较高。


### 7.4.5. 垃圾收集器
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
    
#### 7.4.5.1. Serial收集器
<a href="#menu" style="float:right">目录</a>
* 进行垃圾收集时，将会暂停其他工作线程，直到回收完成
* 这将导致出现"stop the world"问题，应用代码会发生不可预知的问题
* 桌面应用场景，分配内存不多，可以使用该垃圾收集器
* client 模式中比较好的选择

#### 7.4.5.2. ParNew收集器
<a href="#menu" style="float:right">目录</a>

* Serial收集器的多线程版本
* Server环境下比较好的新生代收集器
* 与CMS(老年代收集器)很好的配合
* 单CPU环境下，由于存在线程切换，因此效率可能会比Serial收集器低
* 参数配置
    * 配置-XX:+UseConcMarkSweepGC将默认新生代使用ParNew收集器
    * 也可以通过 -XX:+UseParNewGC进行配置
    * 通过-XX：ParallelGCThreads限制线程数


#### 7.4.5.3. Parallel Scavenge收集器
<a href="#menu" style="float:right">目录</a>

* 使用复制算法和多线程方式实现
* 目标是达到一个可控制的吞吐量，吞吐量=用户运行代码时间/(用户运行代码时间+垃圾收集时间)
* 参数配置
    * 控制垃圾收集最大停顿时间，-XX:MaxGCPauseMillis
        * 设置过小，将发生频繁的垃圾收集行为，因为每次只能收集很少的一部分，导致吞吐量降低
    * 设置吞吐量大小:-XX:GCTimeRation (0-100)
        


#### 7.4.5.4. Serial Old收集器
<a href="#menu" style="float:right">目录</a>

* 老年代单线程收集算法，使用标记整理
* 将会发生stop the world 问题

#### 7.4.5.5. Parallel Old收集器
<a href="#menu" style="float:right">目录</a>

* Parallel Scavenge收集器的老年代版本
* 使用标记整理算法

#### 7.4.5.6. CMS收集器
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


#### 7.4.5.7. G1收集器
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

### 7.4.6. 内存分配和回收策略
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
                



### 7.4.7. JVM相关参数介绍
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


### 7.4.8. 性能监控与故障处理工具
<a href="#menu" style="float:right">目录</a>

#### 7.4.8.1. JDK命令行工具
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


#### 7.4.8.2. Jdk可视化工具
<a href="#menu" style="float:right">目录</a>

* JConsole
* JVisualVM
![](https://github.com/lgjlife/Java-Study/blob/master/pic/jvm/monitor.png?raw=true)
![](https://github.com/lgjlife/Java-Study/blob/master/pic/jvm/thread.png?raw=true)
![](https://github.com/lgjlife/Java-Study/blob/master/pic/jvm/gc.png?raw=true)
### 7.4.9. JVM性能调优

### 7.4.10. 类文件结构

### 7.4.11. 类加载器





<span id="menu"></span>




# 8. Elasticsearch搜索引擎
<a href="#menu" style="float:right">目录</a>

## 8.1. 基本概念
<a href="#menu" style="float:right">目录</a>

* 索引
    * 逻辑数据的存储，可以看作一个数据库
    * 一个索引有一个或者多个分片，每个分片可以有多个副本
* 文档类型
    * 可以看作数据库的表名，用于区分不同类型文档
* 文档 document
    * 索引和搜索时使用的主要数据载体，包含一个或者多个存有数据的字段，可以看作数据库的一行数据
* 文档ID
    * 索引的唯一标识符，如果索引建立时不指定，el将会随机生成一个随机字符串当作文档哪个ID
    * 两个不同的文档类型可以有相同的文档ID
* 字段 Field
    * 文档的一部分，包含名称和值两部分
* 词 term
    * 搜索的词
* 标记 token
    * 表示字段在文本中出现的词，由这个词的文本、开始偏移量以及类型组成

* 倒排索引
文档1： 中国伟大
文档2： 中建公司

|词|计数|文档|
|---|---|---|
|中|2|<1><2>|
|中国|1|<1>|
|公司|1|<2>|
|...|...|...|

每一个词指向包含它的文档编号。这样就可以执行一种非常高效且快速的搜索，比如基于词的查询。此外，每个词有一个计数，告诉Lucene该词出现的频率。


* 输入数据分析
    * 传入文档中的数据怎么转化为到排索引，这个过程叫做分析
    * 分析的工作由分析器完成，分析器由一个分词器和零或多个标记过滤器组成，也可以有零个或多个字符映射器
        * 分词器
            * 把文本分隔成多个标记‘
            * 基本就是词加上一些额外的信息，比如该词在原始文本中的位置和长度
            * 分词器的处理结果称为标记流（ token stream），它是一个接一个的标记，准备被过滤器处理
        * 过滤器
            * 小写过滤器，把所有标记变为小写
            * 同义词过滤器，基于基本的同义词规则，把一个标记换成另一个同义的标记。
            * 多语言词干提取过滤器（ multiple language stemming filter）：减少标记（实际上是标记中的文本部分），得到词根或者基本形式，即词干
            * 过滤器是一个接一个进行处理，可以使用多个过滤器进行处理
        * 字符映射器
            * 对未经分析的文本其作用，在分词器之前进行工作
            * 可以将文本中的Html标签去除

* el集群基本概念
    * 节点和集群
        * el可以作为一个独立的搜索的服务器
        * 但为了处理大型数据集，实现容错和可用性，可以多个服务器组成集群。
    * 分片
        * 当存在大量的文档时，由于内存的限制、硬盘能力、处理能力不足、无法足够快地响应客户端请求等，一个节点可能不够
        * 在这种情况下，数据可以分为较小的称为分片（ shard）的部分（其中每个分片都是一个独立的Apache Lucene索引）。每个分片可以放在不同的服务器上
        * 当你查询的索引分布在多个分片上时， Elasticsearch会把查询发送给每个相关的分片，并将结果合并在一起，而应用程序并不知道分片的存在
    * 副本
        * 副本（ replica）只是一个分片的精确复制，每个分片可以有零个或多个副本
        * 副本分为主分片和副本分片
        * 主分片不可用时，则集群将副本分片提升为主分片
        * 使用副本机制可以提高查询吞吐量和实现高可用
        * 索引建立时，副本只是作为额外的位置来存放数据
        * 索引查询时，el会尽量平衡分片和它副本之间的负载
        
* 索引建立和搜索
    * 索引建立
        * 发送一个新的文档给集群，这个节点是任意选择的。
        * 这个节点知道目标索引有多少分片，并且能够确定哪个分片应该用来存储你的文档
        * Elasticsearch使用文档的唯一标识符来计算文档应该被放到哪个分片中
    * 索引查询
        * 使用文档标识符进行查询，根据ID确认持有的节点和分片，然后转发请求，获取结果，返回给客户端

* Elasticsearch架构特点
    * 合理的默认配置，使得用户在简单安装后能直接使用，而不需要额外的调优，这其中包括内置的发现(例如字段类型检测)和自动配置功能
    * 默认的分布式工作模式，每个节点总是假定自己是某个集群的一部分或将是某个集群的一部分
    * 对等架构，可以避免单点故障，节点会自动连接到集群中的其他节点，进行相互的数据交换和监控操作。这其中包括索引分片的自动复制
    * 容易扩充新节点至集群，不论是从数据容量的角度还是数量的角度
    * 没有对索引中的数据结构强加任何限制
    * 准实时搜索和版本同步，由于分布式特性，无法保证数据实时同步，el尝试解决这些问题，并且提供额外的机制用于版本同步。




## 8.2. Elasticsearch工作流程
<a href="#menu" style="float:right">目录</a>

### 8.2.1. 启动过程
<a href="#menu" style="float:right">目录</a>

* 当节点启动时，它使用发现模块来发现同一个集群(集群名称需要一样)中的其他节点，并与他们连接，默认情况下节点会发送广播请求，以找到拥有相同集群名称的其他节点。
* 集群中的一个节点被选为主(master)节点。该节点负责集群的状态管理以及在集群拓扑变化时做出反映，分发索引分片至集群相应的节点上去。
* 用户不需要关注哪个是master,请求可以发送到任何的节点其内部会自行转发处理。
* 管理节点读取集群的状态信息，如果有必要，它会进行会恢复处理，在该阶段，管理节点会检查哪些索引分片，并决定哪些分片将用作主分片，然后整个集群进入**黄色状态**。
* 黄色状态意味着集群可以进行查询，但是系统的吞吐量以及各种可能的状态是未知的(可以理解为所有的主分片已经分配，但是副本分片还没有分配)
* el寻找冗余的分片用作副本，如果某个主分片的副本数过少，管理节点将决定基于某个主分片创建分片和副本，如果主分片和副本分片已经分配好，那么将进入**绿色状态**

### 8.2.2. 故障检测
<a href="#menu" style="float:right">目录</a>

* 集群正常工作时，管理节点会监控所有可用的节点，检查它们是否正常工作。
* 如果任何节点在预订的超时时间内不响应，则认为该节点已经断开，然后错误处理开始启动
    * 这意味着集群-分片之间重新做平衡，选择新的主节点等
    * 对每个丢失的主分片，一个新的主分片将会从原来的主分片副本中选出来


### 8.2.3. 与El通信
<a href="#menu" style="float:right">目录</a>

#### 8.2.3.1. 索引数据
<a href="#menu" style="float:right">目录</a>

![索引建立](https://github.com/lgjlife/Java-Study/blob/master/pic/elasticsearch/index-create.png?raw=true)

* 索引操作只能发生在主分片上，而不是副本，当一个索引请求被发送到一个节点上时
* 如果该节点没有对应的主分片或者只有副本，那么这个请求会被转发到拥有正确的主分片节点。
* 然后该主节点会将请求发送到各个副本，然后等待响应，当达到规定数目的副本返回响应，完成索引过程并返回响应给客户端。


#### 8.2.3.2. 查询数据
<a href="#menu" style="float:right">目录</a>

![索引搜索](https://github.com/lgjlife/Java-Study/blob/master/pic/elasticsearch/index-search.png?raw=true)

* 查询分为分散阶段和合并阶段
    * 分散阶段
        * 查询请求分发到包含相关文档的多个分片中执行查询
    * 合并阶段
        * 从众多分片中收集返回结果，。然后进行合并，排序等操作之后再返回客户端。

## 8.3. 安装与配置
<a href="#menu" style="float:right">目录</a>

新创建的目录中。应该可以看到下面的目录结构：
|目录 |描述|
|---|---|
|bin| 运行Elasticsearch实例和插件管理所需的脚本
|config| 配置文件所在的目录
|lib| Elasticsearch使用的库
Elasticsearch启动后，会创建如下目录（如果目录不存在）：
|目 录 |描 述
|---|---|
|data| Elasticsearch使用的所有数据的存储位置
|logs| 关于事件和错误记录的文件
|plugins| 存储所安装插件的地方
|work| Elasticsearch使用的临时文件

### 8.3.1. 配置文件说明
<a href="#menu" style="float:right">目录</a>

* elasticsearch.yml  Elasticsearch配置文件
* jvm.options jvm参数配置
* log4j2.properties 日志配置


#### 8.3.1.1. elasticsearch.yml
<a href="#menu" style="float:right">目录</a>

```
cluster.name: elasticsearch                 配置集群名称，默认elasticsearch
node.name: node1                            配置节点名称
node.master: true                           配置当前节点是否具有可选为master节点的资格，默认值为true
node.data: true                             配置当前节点是否允许存储数据，默认值为true
node.rack: rack314                          每个节点都可以定义一些与之关联的通用属性，用于后期集群进行碎片分配时的过滤
node.max_local_storage_nodes: 1             默认情况下，多个节点可以在同一个安装路径启动，如果你想让你的es只启动一个节点，可以进行如下设置
index.number_of_shards: 5                   配置索引的默认分片数，默认值为5
index.number_of_replicas: 1                 配置索引的默认副本数，默认值为1
path.conf: /path/to/conf                    配置文件所在的位置，即elasticsearch.yml和logging.yml所在的位置
path.data: /path/to/data                    分配给当前节点的索引数据所在的位置
path.work: /path/to/work                    临时文件位置
path.logs: /path/to/logs                    日志文件所在位置
path.plugins: /path/to/plugins              插件安装位置
plugin.mandatory: mapper-attachments,lang-groovy 
                                            插件托管位置，若列表中的某一个插件未安装，则节点无法启动： 
bootstrap.mlockall: true                    JVM开始交换时，ElasticSearch表现并不好：你需要保障JVM不进行交换，可以将bootstrap.mlockall设置为true禁止交换
network.bind_host: 192.168.0.1              默认情况下，ElasticSearch使用0.0.0.0地址，并为http传输开启9200-9300端口，为节点到节点的通信开启9300-9400端口，也可以自行设置IP地址
network.publish_host: 192.168.0.1           publish_host设置其他节点连接此节点的地址，如果不设置的话，则自动获取，publish_host的地址必须为真实地址
network.host: 192.168.0.1                   bind_host和publish_host可以一起设置
transport.tcp.port: 9300                    配置节点之间交互的端口
transport.tcp.compress: true                节点间交互时，可以设置是否压缩，转为为不压缩
http.port: 9200                             可以为Http传输监听定制端口
http.max_content_length: 100mb              设置内容的最大长度
http.enabled: false                         禁止HTTP 
http.cors.enabled: true                     设置运行跨域访问，默认为false
http.cors.allow-origin: "*"                 设置跨域访问的允许范围
gateway.type: local                         网关允许在所有集群重启后持有集群状态，集群状态的变更都会被保存下来，当第一次启用集群时，可以从网关中读取到状态
gateway.recover_after_nodes: 1              允许在N个节点启动后恢复过程
gateway.recover_after_time: 5m              设置初始化恢复过程的超时时间
gateway.expected_nodes: 2                   设置该集群中可存在的节点上限
cluster.routing.allocation.node_initial_primaries_recoveries: 4 
                                            设置一个节点的并发数量，有两种情况，一种是在初始复苏过程中，另一种是在添加、删除节点及调整时
indices.recovery.max_size_per_sec: 0        设置复苏时的吞吐量，默认情况下是无限的
indices.recovery.concurrent_streams: 5      设置从对等节点恢复片段时打开的流的数量上限
discovery.zen.minimum_master_nodes: 1       设置一个集群中主节点的数量，当多于三个节点时，该值可在2-4之间
discovery.zen.ping.timeout: 3s              设置ping其他节点时的超时时间，网络比较慢时可将该值设大
discovery.zen.ping.multicast.group:224.2.2.4组地址
discovery.zen.ping.multicast.port：54328    端口
discovery.zen.ping.multicast.ttl:3          广播消息ttl
discovery.zen.ping.multicast.address:null   绑定的地址，null表示绑定所有可用的网络接口
discovery.zen.ping.multicast.enabled:true   多播自动发现禁用开关，默认值为true

discovery.zen.ping.unicast.hosts: ["host1", "host2:port", "host3[portX-portY]"] 
                                            设置新节点被启动时能够发现的主节点列表（主要用于不同网段机器连接）


action.destructive_requires_name            设置是否可以通过正则或者_all删除或者关闭索引，默认false 允许 可设置true不允许
action.auto_create_index: true              是否允许自动创建索引，除了true或者false,还可以使用名字匹配模式
action.auto_create_index: -an*,+a*,-*       允许自动创建以a开头的索引，但以an开头的索引则允许。其他索引也必须手动创建（因为指令中的-*）。注意顺序，匹配到就不会继续往下匹配。
```



## 8.4. 索引
<a href="#menu" style="float:right">目录</a>

### 8.4.1. 索引
<a href="#menu" style="float:right">目录</a>

* 分片和副本
    * 每个索引是由一个或者多个分片组成，每个分片包含了文档集的一部分
    * 每个分片可以有副本，每个副本是分片的完整数据副本
    * 创建索引，可以指定分片和副本数，也可以按照配置文件中的默认值
    * 分片分为主分片和副分片副本。
    * 更多分片使索引能传送到更多服务器，意味着可以处理更多文件，而不会降低性能。
    * 更多分片意味着获取特定文档所需的资源量会减少，因为相较于部署更少分片时，存储在单个分片中的文件数量更少。
    * 更多分片意味着搜索索引时会面临更多问题，因为必须从更多分片中合并结果，使得查询的聚合阶段需要更多资源。
    * 更多副本会增强集群系统的容错性，因为当原始分片不可用时，其副本将替代原始分片发挥作用。只拥有单个副本，集群可能在不丢失数据的情况下遗失分片。当有两个副本时，即使丢失了原始分片及其中一个副本，一切工作仍可以很好地持续下去。
    * 更多副本意味着查询吞吐量将会增加，因为执行查询可以使用分片或分片的任一副本。
    * 一旦建立好分片，就无法更新分片数量，涉及到数据迁移的问题。副本数量可以改变。

### 8.4.2. 映射配置
<a href="#menu" style="float:right">目录</a>

* Elasticsearch有以下核心类型
    * string 字符串
    * number 数字
    * date 日期
    * boolean 布尔型
    * binary 二进制

现在来讨论Elasticsearch中可用的每个核心类型，以及它们用来定义行为的属性。

* **公共属性**
    * index_name：该属性定义将存储在索引中的字段名称。若未定义，字段将以对象的名字来命名。
    * index：可设置值为analyzed和no。另外，对基于字符串的字段，也可以设置为not_analyzed。如果设置为analyzed，该字段将被编入索引以供搜索。如果设置为no，将无法搜索该字段。默认值为analyzed。在基于字符串的字段中，还有一个额外的选项not_analyzed。此设置意味着字段将不经分析而编入索引，使用原始值被编入索引，在搜索的过程中必须全部匹配。索引属性设置为no将使include_in_all属性失效。
    * store：这个属性的值可以是yes或no，指定了该字段的原始值是否被写入索引中。默认值设置为no，这意味着在结果中不能返回该字段（然而，如果你使用_source字段，即使没有存储也可返回这个值），但是如果该值编入索引，仍可以基于它来搜索数据。
    * boost：该属性的默认值是1。基本上，它定义了在文档中该字段的重要性。 boost的值越高，字段中值的重要性也越高。
    * null_value：如果该字段并非索引文档的一部分，此属性指定应写入索引的值。默认的行为是忽略该字段。
    * copy_to：此属性指定一个字段，字段的所有值都将复制到该指定字段。
    * include_in_all：此属性指定该字段是否应包括在_all字段中。默认情况下，如果使用_all字段，所有字段都会包括在其中。 2.4节将更详细地介绍_all字段。
* **字符串**
字符串是最基本的文本类型，我们能够用它存储一个或多个字符。字符串字段的示例定义如
下所示：

```json
"contents" : { "type" : "string", "store" : "no", "index" :"analyzed" }
```
* 除了公共属性，基于字符串的字段还可以使用以下属性。
    * term_vector ： 此 属 性 的 值 可 以 设 置 为 no （ 默 认 值 ）、 yes 、 with_offsets 、with_positions和with_positions_offsets。它定义是否要计算该字段的Lucene词向量（ term vector）。如果你使用高亮，那就需要计算这个词向量。
    * omit_norms：该属性可以设置为true或false。对于经过分析的字符串字段，默认值为false，而对于未经分析但已编入索引的字符串字段，默认值设置为true。当属性为true时，它会禁用Lucene对该字段的加权基准计算（ norms calculation），这样就无法使用索引期间的加权，从而可以为只用于过滤器中的字段节省内存（在计算所述文件的得分时不会被考虑在内）。
    * analyzer：该属性定义用于索引和搜索的分析器名称。它默认为全局定义的分析器名称。
    * index_analyzer：该属性定义了用于建立索引的分析器名称。
    * search_analyzer：该属性定义了的分析器，用于处理发送到特定字段的那部分查询字符串。
    * norms.enabled：此属性指定是否为字段加载加权基准（ norms）。默认情况下，为已分析字段设置为true（这意味着字段可加载加权基准），而未经分析字段则设置为false。
    * norms.loading：该属性可设置eager和lazy。第一个属性值表示此字段总是载入加权基准。第二个属性值是指只在需要时才载入。
    * position_offset_gap：此属性的默认值为0，它指定索引中在不同实例中具有相同名称的字段的差距。若想让基于位置的查询（如短语查询）只与一个字段实例相匹配，可将该属性值设为较高值。
    * index_options：该属性定义了信息列表（ postings list）的索引选项（ 2.2.4节将详细讨论）。可能的值是docs（仅对文档编号建立索引）， freqs（对文档编号和词频建立索引），positions（对文档编号、词频和它们的位置建立索引）， offsets（对文档编号、词频、它们的位置和偏移量建立索引）。对于经分析的字段，此属性的默认值是positions，对于未经分析的字段，默认值为docs。
    * ignore_above：该属性定义字段中字符的最大值。当字段的长度高于指定值时，分析器会将其忽略。
* **数值**

* 这一核心类型汇集了所有适用的数值字段类型Elasticsearch中可使用以下类型（使用type属性指定）。
    * byte：定义字节值，例如1。
    * short：定义短整型值，例如12。
    * integer：定义整型值，例如134。
    * long：定义长整型值，例如123456789。   
    * float：定义浮点值，例如12.23。
    * double：定义双精度值，例如123.45。
* 数值类型字段的定义如下所示：
```json
"price" : { "type" : "float", "store" : "yes", "precision_step" : "4" }
```
* 除了公共属性，以下属性也适用于数值字段。
    * precision_step：此属性指定为某个字段中每个值生成的词条数。值越低，产生的词条数越高。对于每个值的词条数更高的字段，范围查询（ range query）会更快，但索引会稍微大点，默认值为4。
    * ignore_malformed：此属性值可以设为true或false。默认值是false。若要忽略格式错误的值，则应设置属性值为true。
    * 布尔值
        布尔值核心类型是专为索引布尔值（ true或false）设计的。基于布尔值类型的字段定义如下所示："allowed" : { "type" : "boolean", "store": "yes" }
    * 二进制
        * 二进制字段是存储在索引中的二进制数据的Base64表示，可用来存储以二进制形式正常写入的数据，例如图像。基于此类型的字段在默认情况下只被存储，而不索引，因此只能提取，但无法对其执行搜索操作。二进制类型只支持index_name属性。基于binary字段的字段定义如下所示："image" : { "type" : "binary" }
    * 日期
        * 日期核心类型被设计用于日期的索引。它遵循一个特定的、可改变的格式，并默认使用UTC保存。能被Elasticsearch理解的默认日期格式是相当普遍的，它允许指定日期，也可指定时间，例如， 2012-12-24T12:10:22。基于日期类型的字段的示例定义如下所示："published" : { "type" : "date", "store" : "yes", "format" :"YYYY-mm-dd" }使用上述字段的示例文档如下所示{"name" : "Sample document","published" : "2012-12-22"}
* 除了公共属性，日期类型的字段还可以设置以下属性。
    * format：此属性指定日期的格式。默认值为dateOptionalTime。对于格式的完整列表，请 访 问 http://www.elasticsearch.org/guide/en/elasticsearch/reference/current/mapping-dateormat.html。
    * precision_step：此属性指定在该字段中的每个值生成的词条数。该值越低，产生的词条数越高，从而范围查询的速度越快（但索引大小增加）。默认值是4。
    * ignore_malformed：此属性值可以设为true或false，默认值是false。若要忽略格式错误的值，则应设置属性值为true。

* 多字段
    * 有时候你希望两个字段中有相同的字段值，例如，一个字段用于搜索，一个字段用于排序；或一个经语言分析器分析，一个只基于空白字符来分析。 Elasticsearch允许加入多字段对象来拓展字段定义，从而解决这个需求。它允许把几个核心类型映射到单个字段，并逐个分析。例如，想计算切面并在name字段中搜索，可以定义以下字段：

```json
"name": {
    "type": "string",
    "fields": {
        "facet": { "type" : "string", "index": "not_analyzed" }
    }
}
```
上述定义将创建两个字段：我们将第一个字段称为name，第二个称为name.facet。当然，你不必在索引的过程中指定两个独立字段，指定一个name字段就足够了。 Elasticsearch会处理余下的工作，将该字段的数值复制到多字段定义的所有字段。

* **IP地址类型**
Elasticsearch添加了IP字段类型，以数字形式简化IPv4地址的使用。此字段类型可以帮搜索作为IP地址索引的数据、对这些数据排序，并使用IP值做范围查询。基于IP地址类型的字段示例定义如下所示：
```json
"address" : { "type" : "ip", "store" : "yes" }
```
除公共属性外， IP地址类型的字段还可以设置precision_step属性。该属性指定了字段中的每个值生成的词条数。值越低，词条数越高。对于每个值的词条数更高的字段，范围查询会更快，但索引会稍微大点，默认值为4。

* **使用分析器**
正如我们提到的那样，对于字符串类型的字段，可以指定Elasticsearch应该使用哪个分析器。
回想第1章的内容，分析器是一个用于分析数据或以我们想要的方式查询数据的工具。例如，用
空格和小写字符把单词隔开时，不必担心用户发送的单词是小写还是大写。 Elasticsearch使我们
能够在索引和查询时使用不同的分析器，并且可以在搜索过程的每个阶段选择处理数据的方式。
使用分析器时，只需在指定字段的正确属性上设置它的名字，就这么简单。

* 开箱即用的分析器,Elasticsearch允许我们使用众多默认定义的分析器中的一种。如下分析器可以开箱即用。
    * standard：方便大多数欧洲语言的标准分析器（关于参数的完整列表，请参阅http://www.lasticsearch.org/guide/en/elasticsearch/reference/current/analysis-standard-analyzer.html）。
    * simple：这个分析器基于非字母字符来分离所提供的值，并将其转换为小写形式。
    * whitespace：这个分析器基于空格字符来分离所提供的值。
    * stop：这个分析器类似于simple分析器，但除了simple分析器的功能，它还能基于所提供的停用词（ stop word）过滤数据（参数的完整列表，请参阅http://www.elasticsearch.rg/guide/en/elasticsearch/reference/current/analysis-stop-analyzer.html）。
    * keyword：这是一个非常简单的分析器，只传入提供的值。你可以通过指定字段为not_analyzed来达到相同的目的。
    * pattern：这个分析器通过使用正则表达式灵活地分离文本（参数的完整列表，请参阅http://www.elasticsearch.org/guide/en/elasticsearch/reference/current/analysis-pattern-analyzer.html）。
    * language：这个分析器旨在特定的语言环境下工作。该分析器所支持语言的完整列表可参考http://www.elasticsearch.org/guide/en/elasticsearch/reference/current/nalysis-lang-analyzer. tml。
    * snowball：这个分析器类似于standard分析器，但提供了词干提取算法（ stemmingalgorithm ， 参 数 的 完 整 列 表 请 参 阅 http://www.elasticsearch.org/guide/en/elasticsearch/eference/current/analysis-snowball-analyzer.html）。


## 8.5. 集群管理
<a href="#menu" style="float:right">目录</a>

一个节点(node)就是一个Elasticsearch实例， 而一个集群(cluster)由一个或多个节点组成， 它们具有相同的 cluster.name 它们协同工作， 分享数据和负载。 当加入新的节点或者删除一个节点时， 集群就会感知到并平衡数据。

集群中一个节点会被选举为主节点(master),它将临时管理集群级别的一些变更， 例如新建或删除索引、 增加或移除节点等。主节点不参与文档级别的变更或搜索， 这意味着在流量增长的时候， 该主节点不会成为集群的瓶颈。 任何节点都可以成为主节点。 我们例子中的集群只有一个节点， 所以它会充当主节点的角色。

做为用户， 我们能够与集群中的任何节点通信， 包括主节点。 每一个节点都知道文档存在于哪个节点上，它们可以转发请求到相应的节点上。 我们访问的节点负责收集各节点返回的数据， 最后一起返回给客户端。 这一切都由Elasticsearch处理。

### 8.5.1. 集群健康
<a href="#menu" style="float:right">目录</a>

|颜色| 意义|
|---|---|
|green| 所有主要分片和复制分片都可用
|yellow| 所有主要分片可用， 但不是所有复制分片都可用
|red| 不是所有的主要分片都可用

比如你定义三个分片，每个分片有2个副本。
* 当只启动一个节点时，主分片可用，但是副本只有一个。此时为**yellow**
* 当启动两个节点时，主分片和副本分片都可用，此时为**green**.此时el平衡负载，可能两个节点都有主分片。
* 此时关闭一个节点，必然至少有一个主分片被关掉，此时状态为**red**.经过内部调整，被关掉的主分片的副本分片升级为主分片，此时所有主要分片可用， 但不是所有复制分片都可用，因此为yellow

### 8.5.2. 添加索引
<a href="#menu" style="float:right">目录</a>


为了将数据添加到Elasticsearch， 我们需要索引(index)——一个存储关联数据的地方。 实际上， 索引只是一个用来指向一个或多个分片(shards)的“逻辑命名空间(logical namespace)”.
一个分片(shard)是一个最小级别“工作单元(worker unit)”,它只是保存了索引中所有数据的一部分。 在接下来的《深入分片》 一章， 我们将详细说明分片的工作原理， 但是现在我们只要知道分片就是一个Lucene实例， 并且它本身就是一个完整的搜索引擎。 我们的文档存储在分片中， 并且在分片中被索引， 但是我们的应用程序不会直接与它们通信， 取而代之的是， 直接与索引通信。
分片是Elasticsearch在集群中分发数据的关键。 把分片想象成数据的容器。 文档存储在分片中， 然后分片分配到你集群中的节点上。 当你的集群扩容或缩小， Elasticsearch将会自动在你的节点间迁移分片， 以使集群保持平衡。
分片可以是主分片(primary shard)或者是复制分片(replica shard)。 你索引中的每个文档属于一个单独的主分片， 所以主分片的数量决定了索引最多能存储多少数据。
理论上主分片能存储的数据大小是没有限制的， 限制取决于你实际的使用情况。 分片的最大容量完全取决于你的使用状况： 硬件存储的大小、 文档的大小和复杂度、 如何索引和查询你的文档， 以及你期望的响应时间。
复制分片只是主分片的一个副本， 它可以防止硬件故障导致的数据丢失， 同时可以提供读请求， 比如搜索或者从别的shard取回文档。
当索引创建完成的时候， 主分片的数量就固定了， 但是复制分片的数量可以随时调整。
让我们在集群中唯一一个空节点上创建一个叫做 blogs 的索引。 默认情况下， 一个索引被分配5个主分片，但是为了演示的目的， 我们只分配3个主分片和一个复制分片（每个主分片都有一个复制分片）

```json
PUT /blogs
{
    "settings" : {
        "number_of_shards" : 3,
        "number_of_replicas" : 1
    }
}
```


## 8.6. 数据
<a href="#menu" style="float:right">目录</a>

### 8.6.1. 文档
<a href="#menu" style="float:right">目录</a>

在Elasticsearch中， 文档(document)这个术语有着特殊含义。 它特指最顶层结构或者根对象(root object)序列化成的JSON数据（以唯一ID标识并存储于Elasticsearch中） 。

**文档元数据**
一个文档不只有数据。 它还包含了元数据(metadata)——关于文档的信息。 三个必须的元数据节点是：
|节点| 说明
|---|---|
|_index| 文档存储的地方
|_type| 文档代表的对象的类
|_id| 文档的唯一标识

**_index**
索引(index)类似于关系型数据库里的“数据库”——它是我们存储和索引关联数据的地方。
提示：
事实上，我们的数据被存储和索引在分片(shards)中， 索引只是一个把一个或多个分片分组在一起的逻辑空间。 然而， 这只是一些内部细节——我们的程序完全不用关心分片。 对于我们的程序而言， 文档存储在索引(index)中。 剩下的细节由Elasticsearch关心既可。

索引名必须是全部小写，不能以下划线开头，不能包含逗号。 让我们使用 website 做为索引名。

**_type**
在应用中， 我们使用对象表示一些“事物”， 例如一个用户、 一篇博客、 一个评论， 或者一封邮件。 每个对象都属于一个类(class)， 这个类定义了属性或与对象关联的数据。 user 类的对象可能包含姓名、 性别、 年龄和Email地址。
在关系型数据库中， 我们经常将相同类的对象存储在一个表里， 因为它们有着相同的结构。 同理， 在Elasticsearch中， 我们使用相同类型(type)的文档表示相同的“事物”， 因为他们的数据结构也是相同的。
每个类型(type)都有自己的映射(mapping)或者结构定义， 就像传统数据库表中的列一样。 所有类型下的文档被存储在同一个索引下， 但是类型的映射(mapping)会告诉Elasticsearch不同的文档如何被索引。 我们将会在《映射》 章节探讨如何定义和管理映射， 但是现在我们将依赖ELasticsearch去自动处理数据结构。
_type 的名字可以是大写或小写， 不能包含下划线或逗号。 我们将使用 `blog 做为类型名。

**_id**
d仅仅是一个字符串， 它与 _index 和 _type 组合时， 就可以在ELasticsearch中唯一标识一个文档。 当创建一个文档， 你可以自定义 _id ， 也可以让Elasticsearch帮你自动生成。


### 8.6.2. 处理冲突
<a href="#menu" style="float:right">目录</a>

当某个文档被并发修改时，如何确保修改丢失?

在数据库中， 有两种通用的方法确保在并发更新时修改不丢失：
* 悲观并发控制
    * 这在关系型数据库中被广泛的使用， 假设冲突的更改经常发生， 为了解决冲突我们把访问区块化。 典型的例子是在读一行数据前锁定这行， 然后确保只有加锁的那个线程可以修改这行数据。
* 乐观并发控制
    * 被Elasticsearch使用， 假设冲突不经常发生， 也不区块化访问， 然而， 如果在读写过程中数据发生了变化， 更新操作将失败。 这时候由程序决定在失败后如何解决冲突。 实际情况中， 可以重新尝试更新， 刷新数据（重新读取） 或者直接反馈给用户。

Elasticsearch是分布式的。 当文档被创建、 更新或删除， 文档的新版本会被复制到集群的其它节点。 Elasticsearch即是同步的又是异步的， 意思是这些复制请求都是平行发送的， 并无序(out of sequence)的到达目的地。 这就需要一种方法确保老版本的文档永远不会覆盖新的版本.

每个文档都有一个 _version 号码， 这个号码在文档被改变时加一。Elasticsearch使用这个_version 保证所有修改都被正确排序。 当一个旧版本出现在新版本之后， 它会被简单的忽略。



## 8.7. 分布式增删改查
<a href="#menu" style="float:right">目录</a>

### 8.7.1. 路由文档到分片
<a href="#menu" style="float:right">目录</a>

当你索引一个文档， 它被存储在单独一个主分片上。 Elasticsearch是如何知道文档属于哪个分片的呢？ 当你创建一个新文档， 它是如何知道是应该存储在分片1还是分片2上的呢？
进程不能是随机的， 因为我们将来要检索文档。 事实上， 它根据一个简单的算法决定：shard = hash(routing) % number_of_primary_shards ，routing 值是一个任意字符串， 它默认是 _id 但也可以自定义。 这个 routing 字符串通过哈希函数生成一个数字， 然后除以主切片的数量得到一个余数(remainder)， 余数的范围永远是 0 到 number_of_primary_shards - 1 ， 这个数字就是特定文档所在的分片。
这也解释了为什么主分片的数量只能在创建索引时定义且不能修改： 如果主分片的数量在未来改变了， 所有先前的路由值就失效了， 文档也就永远找不到了。
有时用户认为固定数量的主分片会让之后的扩展变得很困难。 现实中， 有些技术会在你需要的时候让扩展变得容易。

### 8.7.2. 分片交互
<a href="#menu" style="float:right">目录</a>

每个节点都能够接收客户端的请求，每个节点都能知道任意文档所在的节点，所以也可以将请求转发到需要的节点。

#### 8.7.2.1. 新建，索引和删除文档
<a href="#menu" style="float:right">目录</a>


新建、索引和删除请求都是写(write)操作， 它们必须在主分片上成功完成才能复制到相关的复制分片上。

* 在主分片和复制分片上成功新建、 索引或删除一个文档必要的顺序步骤：
1. 客户端给 Node 1 发送新建、 索引或删除请求。
2. 节点使用文档的 _id 确定文档属于分片 0 。 它转发请求到 Node 3 ， 分片 0 位于这个节点上。
3. Node 3 在主分片上执行请求， 如果成功， 它转发请求到相应的位于 Node 1 和 Node 2 的复制节点上。 当所有的复制节点报告成功， Node 3 报告成功到请求的节点， 请求的节点再报告给客户端。

![document-write](https://github.com/lgjlife/Java-Study/blob/master/pic/elasticsearch/document-write.png?raw=true)

客户端接收到成功响应的时候， 文档的修改已经被应用于主分片和所有的复制分片。 你的修改生效了。
有很多可选的请求参数允许你更改这一过程。 你可能想牺牲一些安全来提高性能。 这一选项很少使用因为Elasticsearch已经足够快， 不过为了内容的完整我们将做一些阐述。

**replication**

复制默认的值是 sync 。 这将导致主分片得到复制分片的成功响应后才返回。
如果你设置 replication 为 async ， 请求在主分片上被执行后就会返回给客户端。 它依旧会转发请求给复制节点， 但你将不知道复制节点成功与否。
上面的这个选项不建议使用。 默认的 sync 复制允许Elasticsearch强制反馈传输。 async 复制可能会因为在不等待其它分片就绪的情况下发送过多的请求而使Elasticsearch过载。

**consistency**

默认主分片在尝试写入时需要规定数量(quorum)或过半的分片（可以是主节点或复制节点） 可用。 这是防止数据被写入到错的网络分区。 规定的数量计算公式如下：
int( (primary + number_of_replicas) / 2 ) + 1
consistency 允许的值为 one （只有一个主分片） ， all （所有主分片和复制分片） 或者默认的 quorum 或过半分片。
注意 number_of_replicas 是在索引中的的设置， 用来定义复制分片的数量， 而不是现在活动的复制节点的数量。 如果你定义了索引有3个复制节点， 那规定数量是：

int( (primary + 3 replicas) / 2 ) + 1 = 3
但如果你只有2个节点， 那你的活动分片不够规定数量， 也就不能索引或删除任何文档。

**timeout**
当分片副本不足时会怎样？ Elasticsearch会等待更多的分片出现。 默认等待一分钟。 如果需要， 你可以设置 timeout 参数让它终止的更早： 100 表示100毫秒， 30s 表示30秒。
注意：
新索引默认有 1 个复制分片， 这意味着为了满足 quorum 的要求需要两个活动的分片。 当然， 这个默认设置将阻止我们在单一节点集群中进行操作。 为了避开这个问题， 规定数量只有在 number_of_replicas 大于一时才生效。

#### 8.7.2.2. 索引文档
<a href="#menu" style="float:right">目录</a>


文档能够从主分片或任意一个复制分片被检索。

![document-write](https://github.com/lgjlife/Java-Study/blob/master/pic/elasticsearch/document-read.png?raw=true)

1. 客户端给 Node 1 发送get请求。
2. 节点使用文档的 _id 确定文档属于分片 0 。 分片 0 对应的复制分片在三个节点上都有。 此时， 它转发请求到 Node 2 。
3. Node 2 返回endangered给 Node 1 然后返回给客户端。

对于读请求， 为了平衡负载， 请求节点会为每个请求选择不同的分片——它会循环所有分片副本。

可能的情况是， 一个被索引的文档已经存在于主分片上却还没来得及同步到复制分片上。 这时复制分片会报告文档未找到，主分片会成功返回文档。一旦索引请求成功返回给用户，文档则在主分片和复制分片都是可用的。

## 8.8. 面试小结之Elasticsearch篇
<a href="#menu" style="float:right">目录</a>

**Elasticsearch是如何实现Master选举的？**
* Elasticsearch的选主是ZenDiscovery模块负责的，主要包含Ping（节点之间通过这个RPC来发现彼此）和Unicast（单播模块包含一个主机列表以控制哪些节点需要ping通）这两部分；
* 对所有可以成为master的节点（node.master: true）根据nodeId字典排序，每次选举每个节点都把自己所知道节点排一次序，然后选出第一个（第0位）节点，暂且认为它是master节点。
* 如果对某个节点的投票数达到一定的值（可以成为master节点数n/2+1）并且该节点自己也选举自己，那这个节点就是master。否则重新选举一直到满足上述条件。
* 补充：master节点的职责主要包括集群、节点和索引的管理，不负责文档级别的管理；data节点可以关闭http功能。

**Elasticsearch中的节点（比如共20个），其中的10个选了一个master，另外10个选了另一个master，怎么办？**

* 当集群master候选数量不小于3个时，可以通过设置最少投票通过数量（discovery.zen.minimum_master_nodes）超过所有候选节点一半以上来解决脑裂问题；
* 当候选数量为两个时，只能修改为唯一的一个master候选，其他作为data节点，避免脑裂问题。

**客户端在和集群连接时，如何选择特定的节点执行请求的？**

* TransportClient利用transport模块远程连接一个elasticsearch集群。它并不加入到集群中，只是简单的获得一个或者多个初始化的transport地址，并以 轮询 的方式与这些地址进行通信。

**详细描述一下Elasticsearch索引文档的过程。**
* 协调节点默认使用文档ID参与计算（也支持通过routing），以便为路由提供合适的分片。
shard = hash(document_id) % (num_of_primary_shards)
* 当分片所在的节点接收到来自协调节点的请求后，会将请求写入到Memory Buffer，然后定时（默认是每隔1秒）写入到Filesystem Cache，这个从Momery Buffer到Filesystem Cache的过程就叫做refresh；
* 当然在某些情况下，存在Momery Buffer和Filesystem Cache的数据可能会丢失，ES是通过translog的机制来保证数据的可靠性的。其实现机制是接收到请求后，同时也会写入到translog中，当Filesystem cache中的数据写入到磁盘中时，才会清除掉，这个过程叫做flush；
* 在flush过程中，内存中的缓冲将被清除，内容被写入一个新段，段的fsync将创建一个新的提交点，并将内容刷新到磁盘，旧的translog将被删除并开始一个新的translog。
* flush触发的时机是定时触发（默认30分钟）或者translog变得太大（默认为512M）时；
![Elasticsearch索引文档的过程](https://upload-images.jianshu.io/upload_images/3709321-2084bd0268a42ae1.jpeg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

* 补充：关于Lucene的Segement：
    * Lucene索引是由多个段组成，段本身是一个功能齐全的倒排索引。
    * 段是不可变的，允许Lucene将新的文档增量地添加到索引中，而不用从头重建索引。
    * 对于每一个搜索请求而言，索引中的所有段都会被搜索，并且每个段会消耗CPU的时钟周、文件句柄和内存。这意味着段的数量越多，搜索性能会越低。
    * 为了解决这个问题，Elasticsearch会合并小段到一个较大的段，提交新的合并段到磁盘，并删除那些旧的小段。
    
**详细描述一下Elasticsearch更新和删除文档的过程**
* 删除和更新也都是写操作，但是Elasticsearch中的文档是不可变的，因此不能被删除或者改动以展示其变更；
* 磁盘上的每个段都有一个相应的.del文件。当删除请求发送后，文档并没有真的被删除，而是在.del文件中被标记为删除。该文档依然能匹配查询，但是会在结果中被过滤掉。当段合并时，在.del文件中被标记为删除的文档将不会被写入新段。
* 在新的文档被创建时，Elasticsearch会为该文档指定一个版本号，当执行更新时，旧版本的文档在.del文件中被标记为删除，新版本的文档被索引到一个新段。旧版本的文档依然能匹配查询，但是会在结果中被过滤掉。

**详细描述一下Elasticsearch搜索的过程。**
* 搜索被执行成一个两阶段过程，我们称之为 Query Then Fetch；
* 在初始查询阶段时，查询会广播到索引中每一个分片拷贝（主分片或者副本分片）。 每个分片在本地执行搜索并构建一个匹配文档的大小为 from + size 的优先队列。PS：在搜索的时候是会查询Filesystem Cache的，但是有部分数据还在Memory Buffer，所以搜索是近实时的。
* 每个分片返回各自优先队列中 所有文档的 ID 和排序值 给协调节点，它合并这些值到自己的优先队列中来产生一个全局排序后的结果列表。
* 接下来就是 取回阶段，协调节点辨别出哪些文档需要被取回并向相关的分片提交多个 GET 请求。每个分片加载并 丰富 文档，如果有需要的话，接着返回文档给协调节点。一旦所有的文档都被取回了，协调节点返回结果给客户端。
* 补充：Query Then Fetch的搜索类型在文档相关性打分的时候参考的是本分片的数据，这样在文档数量较少的时候可能不够准确，DFS Query Then Fetch增加了一个预查询的处理，询问Term和Document frequency，这个评分更准确，但是性能会变差。

![Elasticsearch执行搜索的过程](https://upload-images.jianshu.io/upload_images/3709321-88f589037638c93d.jpeg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


**在Elasticsearch中，是怎么根据一个词找到对应的倒排索引的？**

* SEE：
    * Lucene的索引文件格式(1)
    * Lucene的索引文件格式(2)

**Elasticsearch在部署时，对Linux的设置有哪些优化方法？**
* 64GB内存的机器是非常理想的，但是32GB和16GB机器也是很常见的。少于8GB会适得其反。
* 如果你要在更快的 CPUs 和更多的核心之间选择，选择更多的核心更好。多个内核提供的额外并发远胜过稍微快一点点的时钟频率。
* 如果你负担得起 SSD，它将远远超出任何旋转介质。 基于 SSD 的节点，查询和索引性能都有提升。如果你负担得起，SSD 是一个好的选择。
* 即使数据中心们近在咫尺，也要避免集群跨越多个数据中心。绝对要避免集群跨越大的地理距离。
* 请确保运行你应用程序的 JVM 和服务器的 JVM 是完全一样的。 在 Elasticsearch 的几个地方，使用 Java 的本地序列化。
* 通过设置gateway.recover_after_nodes、gateway.expected_nodes、gateway.recover_after_time可以在集群重启的时候避免过多的分片交换，这可能会让数据恢复从数个小时缩短为几秒钟。
* Elasticsearch 默认被配置为使用单播发现，以防止节点无意中加入集群。只有在同一台机器上运行的节点才会自动组成集群。最好使用单播代替组播。
* 不要随意修改垃圾回收器（CMS）和各个线程池的大小。
* 把你的内存的（少于）一半给 Lucene（但不要超过 32 GB！），通过ES_HEAP_SIZE 环境变量设置。
* 内存交换到磁盘对服务器性能来说是致命的。如果内存交换到磁盘上，一个 100 微秒的操作可能变成 10 毫秒。 再想想那么多 10 微秒的操作时延累加起来。 不难看出 swapping 对于性能是多么可怕。
* Lucene 使用了大量的文件。同时，Elasticsearch 在节点和 HTTP 客户端之间进行通信也使用了大量的套接字。 所有这一切都需要足够的文件描述符。你应该增加你的文件描述符，设置一个很大的值，如 64,000。

* 补充：索引阶段性能提升方法
    * 使用批量请求并调整其大小：每次批量数据 5–15 MB 大是个不错的起始点。
    * 存储：使用 SSD
    * 段和合并：Elasticsearch 默认值是 20 MB/s，对机械磁盘应该是个不错的设置。如果你用的是 SSD，可以考虑提高到 100–200 MB/s。如果你在做批量导入，完全不在意搜索，你可以彻底关掉合并限流。另外还可以增加 index.translog.flush_threshold_size 设置，从默认的 512 MB 到更大一些的值，比如 1 GB，这可以在一次清空触发的时候在事务日志里积累出更大的段。 
    * 如果你的搜索结果不需要近实时的准确度，考虑把每个索引的index.refresh_interval 改到30s。
    * 如果你在做大批量导入，考虑通过设置index.number_of_replicas: 0 关闭副本。

**对于GC方面，在使用Elasticsearch时要注意什么？**
* SEE：https://elasticsearch.cn/article/32
* 倒排词典的索引需要常驻内存，无法GC，需要监控data node上segment memory增长趋势。
* 各类缓存，field cache, filter cache, indexing cache, bulk queue等等，要设置合理的大小，并且要应该根据最坏的情况来看heap是否够用，也就是各类缓存全部占满的时候，还有heap空间可以分配给其他任务吗？避免采用clear cache等“自欺欺人”的方式来释放内存。
* 避免返回大量结果集的搜索与聚合。确实需要大量拉取数据的场景，可以采用scan & scroll api来实现。
* cluster stats驻留内存并无法水平扩展，超大规模集群可以考虑分拆成多个集群通过tribe node连接。
想知道heap够不够，必须结合实际应用场景，并对集群的heap使用情况做持续的监控。


**Elasticsearch对于大数据量（上亿量级）的聚合如何实现？**
* Elasticsearch 提供的首个近似聚合是cardinality 度量。它提供一个字段的基数，即该字段的distinct或者unique值的数目。它是基于HLL算法的。HLL 会先对我们的输入作哈希运算，然后根据哈希运算的结果中的 bits 做概率估算从而得到基数。其特点是：可配置的精度，用来控制内存的使用（更精确 ＝ 更多内存）；小的数据集精度是非常高的；我们可以通过配置参数，来设置去重需要的固定内存使用量。无论数千还是数十亿的唯一值，内存使用量只与你配置的精确度相关。

**在并发情况下，Elasticsearch如果保证读写一致？**
* 可以通过版本号使用乐观并发控制，以确保新版本不会被旧版本覆盖，由应用层来处理具体的冲突；
另外对于写操作，一致性级别支持quorum/one/all，默认为quorum，即只有当大多数分片可用时才允许写操作。但即使大多数可用，也可能存在因为网络等原因导致写入副本失败，这样该副本被认为故障，分片将会在一个不同的节点上重建。
* 对于读操作，可以设置replication为sync(默认)，这使得操作在主分片和副本分片都完成后才会返回；* 如果设置replication为async时，也可以通过设置搜索请求参数_preference为primary来查询主分片，确保文档是最新版本。

**如何监控Elasticsearch集群状态？**
* Marvel 让你可以很简单的通过 Kibana 监控 Elasticsearch。你可以实时查看你的集群健康状态和性能，也可以分析过去的集群、索引和节点指标。

**介绍下你们电商搜索的整体技术架构**
![整体技术架构](https://upload-images.jianshu.io/upload_images/3709321-3a013fdb77aa88fc.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


**介绍一下你们的个性化搜索方案？**

* SEE 基于word2vec和Elasticsearch实现个性化搜索

**是否了解字典树？**

* 常用字典数据结构如下所示：
![常用字典数据结构](https://upload-images.jianshu.io/upload_images/3709321-7b6f0fab6f412f51.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

* Trie的核心思想是空间换时间，利用字符串的公共前缀来降低查询时间的开销以达到提高效率的目的。它有3个基本性质：
根节点不包含字符，除根节点外每一个节点都只包含一个字符。
从根节点到某一节点，路径上经过的字符连接起来，为该节点对应的字符串。
每个节点的所有子节点包含的字符都不相同。
![字典树](https://github.com/julycoding/The-Art-Of-Programming-By-July/raw/master/ebook/images/8/8.4/1.jpg)


可以看到，trie树每一层的节点数是26^i级别的。所以为了节省空间，我们还可以用动态链表，或者用数组来模拟动态。而空间的花费，不会超过单词数×单词长度。
实现：对每个结点开一个字母集大小的数组，每个结点挂一个链表，使用左儿子右兄弟表示法记录这棵树；
对于中文的字典树，每个节点的子节点用一个哈希表存储，这样就不用浪费太大的空间，而且查询速度上可以保留哈希的复杂度O(1)。

**拼写纠错是如何实现的？**
* 拼写纠错是基于编辑距离来实现；编辑距离是一种标准的方法，它用来表示经过插入、删除和替换操作从一个字符串转换到另外一个字符串的最小操作步数；
* 编辑距离的计算过程：比如要计算batyu和beauty的编辑距离，先创建一个7×8的表（batyu长度为5，coffee长度为6，各加2），接着，在如下位置填入黑色数字。其他格的计算过程是取以下三个值的最小值：
如果最上方的字符等于最左方的字符，则为左上方的数字。否则为左上方的数字+1。（对于3,3来说为0）
左方数字+1（对于3,3格来说为2）
上方数字+1（对于3,3格来说为2）
最终取右下角的值即为编辑距离的值3。

![编辑距离](https://upload-images.jianshu.io/upload_images/3709321-31bef8a5bbf14a13.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


对于拼写纠错，我们考虑构造一个度量空间（Metric Space），该空间内任何关系满足以下三条基本条件：
d(x,y) = 0 -- 假如x与y的距离为0，则x=y
d(x,y) = d(y,x)  -- x到y的距离等同于y到x的距离
d(x,y) + d(y,z) >= d(x,z) -- 三角不等式
* 根据三角不等式，则满足与query距离在n范围内的另一个字符转B，其与A的距离最大为d+n，最小为d-n。
* BK树的构造就过程如下：每个节点有任意个子节点，每条边有个值表示编辑距离。所有子节点到父节点的边上标注n表示编辑距离恰好为n。比如，我们有棵树父节点是”book”和两个子节点”cake”和”books”，”book”到”books”的边标号1，”book”到”cake”的边上标号4。从字典里构造好树后，无论何时你想插入新单词时，计算该单词与根节点的编辑距离，并且查找数值为d(neweord, root)的边。递归得与各子节点进行比较，直到没有子节点，你就可以创建新的子节点并将新单词保存在那。比如，插入”boo”到刚才上述例子的树中，我们先检查根节点，查找d(“book”, “boo”) = 1的边，然后检查标号为1的边的子节点，得到单词”books”。我们再计算距离d(“books”, “boo”)=2，则将新单词插在”books”之后，边标号为2。
* 查询相似词如下：计算单词与根节点的编辑距离d，然后递归查找每个子节点标号为d-n到d+n（包含）的边。假如被检查的节点与搜索单词的距离d小于n，则返回该节点并继续查询。比如输入cape且最大容忍距离为1，则先计算和根的编辑距离d(“book”, “cape”)=4，然后接着找和根节点之间编辑距离为3到5的，这个就找到了cake这个节点，计算d(“cake”, “cape”)=1，满足条件所以返回cake，然后再找和cake节点编辑距离是0到2的，分别找到cape和cart节点，这样就得到cape这个满足条件的结果。

![BK树](https://upload-images.jianshu.io/upload_images/3709321-7cdb109e6f73c192.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

<h1>高并发</h1>


<span id="menu"></span>



# 9. 高并发网站设计

## 9.1. 概述
<a href="#menu" style="float:right">目录</a>

### 9.1.1. 高并发原则
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
### 9.1.2. 高可用原则
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
    
## 9.2. 负载均衡
<a href="#menu" style="float:right">目录</a>

### 9.2.1. 什么是负载均衡
　互联网早期，业务流量比较小并且业务逻辑比较简单，单台服务器便可以满足基本的需求；但随着互联网的发展，业务流量越来越大并且业务逻辑也越来越复杂，单台机器的性能问题以及单点问题凸显了出来，因此需要多台机器来进行性能的水平扩展以及避免单点故障。但是要如何将不同的用户的流量分发到不同的服务器上面呢？

　 早期的方法是使用DNS做负载，通过给客户端解析不同的IP地址，让客户端的流量直接到达各个服务器。但是这种方法有一个很大的缺点就是延时性问题，在做出调度策略改变以后，由于DNS各级节点的缓存并不会及时的在客户端生效，而且DNS负载的调度策略比较简单，无法满足业务需求，因此就出现了负载均衡。


　客户端的流量首先会到达负载均衡服务器，由负载均衡服务器通过一定的调度算法将流量分发到不同的应用服务器上面，同时负载均衡服务器也会对应用服务器做周期性的健康检查，当发现故障节点时便动态的将节点从应用服务器集群中剔除，以此来保证应用的高可用。


　负载均衡又分为四层负载均衡和七层负载均衡。四层负载均衡工作在OSI模型的传输层，主要工作是转发，它在接收到客户端的流量以后通过修改数据包的地址信息将流量转发到应用服务器。

　七层负载均衡工作在OSI模型的应用层，因为它需要解析应用层流量，所以七层负载均衡在接到客户端的流量以后，还需要一个完整的TCP/IP协议栈。七层负载均衡会与客户端建立一条完整的连接并将应用层的请求流量解析出来，再按照调度算法选择一个应用服务器，并与应用服务器建立另外一条连接将请求发送过去，因此七层负载均衡的主要工作就是代理。

### 9.2.2. 硬件负载均衡

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

### 9.2.3. 四层和七层负载均衡的区别？
<a href="#menu" style="float:right">目录</a>

#### 9.2.3.1. 技术原理上的区别。
　所谓四层负载均衡，也就是主要通过报文中的目标地址和端口，再加上负载均衡设备设置的服务器选择方式，决定最终选择的内部服务器。

　以常见的TCP为例，负载均衡设备在接收到第一个来自客户端的SYN 请求时，即通过上述方式选择一个最佳的服务器，并对报文中目标IP地址进行修改(改为后端服务器IP），直接转发给该服务器。TCP的连接建立，即三次握手是客户端和服务器直接建立的，负载均衡设备只是起到一个类似路由器的转发动作。在某些部署情况下，为保证服务器回包可以正确返回给负载均衡设备，在转发报文的同时可能还会对报文原来的源地址进行修改。

　所谓七层负载均衡，也称为“内容交换”，也就是主要通过报文中的真正有意义的应用层内容，再加上负载均衡设备设置的服务器选择方式，决定最终选择的内部服务器。

　以常见的TCP为例，负载均衡设备如果要根据真正的应用层内容再选择服务器，只能先代理最终的服务器和客户端建立连接(三次握手)后，才可能接受到客户端发送的真正应用层内容的报文，然后再根据该报文中的特定字段，再加上负载均衡设备设置的服务器选择方式，决定最终选择的内部服务器。
　
　负载均衡设备在这种情况下，更类似于一个代理服务器。负载均衡和前端的客户端以及后端的服务器会分别建立TCP连接。所以从这个技术原理上来看，七层负载均衡明显的对负载均衡设备的要求更高，处理七层的能力也必然会低于四层模式的部署方式。那么，为什么还需要七层负载均衡呢？

#### 9.2.3.2. 应用场景的需求。
　七层应用负载的好处，是使得整个网络更"智能化", 参考我们之前的另外一篇专门针对HTTP应用的优化的介绍，就可以基本上了解这种方式的优势所在。例如访问一个网站的用户流量，可以通过七层的方式，将对图片类的请求转发到特定的图片服务器并可以使用缓存技术；将对文字类的请求可以转发到特定的文字服务器并可以使用压缩技术。

　当然这只是七层应用的一个小案例，从技术原理上，这种方式可以对客户端的请求和服务器的响应进行任意意义上的修改，极大的提升了应用系统在网络层的灵活性。很多在后台，(例如Nginx或者Apache)上部署的功能可以前移到负载均衡设备上，例如客户请求中的Header重写，服务器响应中的关键字过滤或者内容插入等功能。

　另外一个常常被提到功能就是安全性。网络中最常见的SYN Flood攻击，即黑客控制众多源客户端，使用虚假IP地址对同一目标发送SYN攻击，通常这种攻击会大量发送SYN报文，耗尽服务器上的相关资源，以达到Denial of Service(DoS)的目的。

　从技术原理上也可以看出，四层模式下这些SYN攻击都会被转发到后端的服务器上；而七层模式下这些SYN攻击自然在负载均衡设备上就截止，不会影响后台服务器的正常运营。另外负载均衡设备可以在七层层面设定多种策略，过滤特定报文，例如SQL Injection等应用层面的特定攻击手段，从应用层面进一步提高系统整体安全。

　现在的7层负载均衡，主要还是着重于应用广泛的HTTP协议，所以其应用范围主要是众多的网站或者内部信息平台等基于B/S开发的系统。 4层负载均衡则对应其他TCP应用，例如基于C/S开发的ERP等系统。

#### 9.2.3.3. 七层应用需要考虑的问题。
是否真的必要，七层应用的确可以提高流量智能化，同时必不可免的带来设备配置复杂，负载均衡压力增高以及故障排查上的复杂性等问题。在设计系统时需要考虑四层七层同时应用的混杂情况。

是否真的可以提高安全性。例如SYN Flood攻击，七层模式的确将这些流量从服务器屏蔽，但负载均衡设备本身要有强大的抗DDoS能力，否则即使服务器正常而作为中枢调度的负载均衡设备故障也会导致整个应用的崩溃。

是否有足够的灵活度。七层应用的优势是可以让整个应用的流量智能化，但是负载均衡设备需要提供完善的七层功能，满足客户根据不同情况的基于应用的调度。最简单的一个考核就是能否取代后台Nginx或者Apache等服务器上的调度功能。能够提供一个七层应用开发接口的负载均衡设备，可以让客户根据需求任意设定功能，才真正有可能提供强大的灵活性和智能性。

### 9.2.4. 负载均衡的算法
<a href="#menu" style="float:right">目录</a>

#### 9.2.4.1. 随机算法
* Random随机，按权重设置随机概率。在一个截面上碰撞的概率高，但调用量越大分布越均匀，而且按概率使用权重后也比较均匀，有利于动态调整提供者权重。
* 加权随机

#### 9.2.4.2. 轮询及加权轮询
* 轮询(Round Robbin)当服务器群中各服务器的处理能力相同时，且每笔业务处理量差异不大时，最适合使用这种算法。 轮循，按公约后的权重设置轮循比率。存在慢的提供者累积请求问题，比如：第二台机器很慢，但没挂，当请求调到第二台时就卡在那，久而久之，所有请求都卡在调到第二台上。
* 加权轮询(Weighted Round Robbin)为轮询中的每台服务器附加一定权重的算法。比如服务器1权重1，服务器2权重2，服务器3权重3，则顺序为1-2-2-3-3-3-1-2-2-3-3-3- ......
#### 9.2.4.3. 最小连接及加权最小连接
* 最少连接(Least Connections)在多个服务器中，与处理连接数(会话数)最少的服务器进行通信的算法。即使在每台服务器处理能力各不相同，每笔业务处理量也不相同的情况下，也能够在一定程度上降低服务器的负载。
加权最少连接(Weighted Least Connection)为最少连接算法中的每台服务器附加权重的算法，该算法事先为每台服务器分配处理连接的数量，并将客户端请求转至连接数最少的服务器上。
#### 9.2.4.4. 哈希算法
* 普通哈希
* 一致性哈希一致性Hash，相同参数的请求总是发到同一提供者。当某一台提供者挂时，原本发往该提供者的请求，基于虚拟节点，平摊到其它提供者，不会引起剧烈变动。
#### 9.2.4.5. IP地址散列
* 通过管理发送方IP和目的地IP地址的散列，将来自同一发送方的分组(或发送至同一目的地的分组)统一转发到相同服务器的算法。当客户端有一系列业务需要处理而必须和一个服务器反复通信时，该算法能够以流(会话)为单位，保证来自相同客户端的通信能够一直在同一服务器中进行处理。
#### 9.2.4.6. URL散列
* 通过管理客户端请求URL信息的散列，将发送至相同URL的请求转发至同一服务器的算法。

#### 9.2.4.7. 一致性哈希算法
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

### 9.2.5. 负载均衡的实现（DNS > 数据链路层 > IP层 > Http层）
<a href="#menu" style="float:right">目录</a>


#### 9.2.5.1. DNS域名解析负载均衡（延迟）
DNS域名解析负载均衡

　利用DNS处理域名解析请求的同时进行负载均衡是另一种常用的方案。在DNS服务器中配置多个A记录，如：www.mysite.com IN A 114.100.80.1、www.mysite.com IN A 114.100.80.2、www.mysite.com IN A 114.100.80.3.
　每次域名解析请求都会根据负载均衡算法计算一个不同的IP地址返回，这样A记录中配置的多个服务器就构成一个集群，并可以实现负载均衡。
　DNS域名解析负载均衡的优点是将负载均衡工作交给DNS，省略掉了网络管理的麻烦，缺点就是DNS可能缓存A记录，不受网站控制。事实上，大型网站总是部分使用DNS域名解析，作为第一级负载均衡手段，然后再在内部做第二级负载均衡。

#### 9.2.5.2. 数据链路层负载均衡(LVS)
数据链路层负载均衡(LVS)

　数据链路层负载均衡是指在通信协议的数据链路层修改mac地址进行负载均衡。
　这种数据传输方式又称作三角传输模式，负载均衡数据分发过程中不修改IP地址，只修改目的的mac地址，通过配置真实物理服务器集群所有机器虚拟IP和负载均衡服务器IP地址一样，从而达到负载均衡，这种负载均衡方式又称为直接路由方式（DR）.
　在上图中，用户请求到达负载均衡服务器后，负载均衡服务器将请求数据的目的mac地址修改为真是WEB服务器的mac地址，并不修改数据包目标IP地址，因此数据可以正常到达目标WEB服务器，该服务器在处理完数据后可以经过网管服务器而不是负载均衡服务器直接到达用户浏览器。
　使用三角传输模式的链路层负载均衡是目前大型网站所使用的最广的一种负载均衡手段。在linux平台上最好的链路层负载均衡开源产品是LVS(linux virtual server)。

#### 9.2.5.3. IP负载均衡(SNAT)
IP负载均衡
　IP负载均衡：即在网络层通过修改请求目标地址进行负载均衡。
　用户请求数据包到达负载均衡服务器后，负载均衡服务器在操作系统内核进行获取网络数据包，根据负载均衡算法计算得到一台真实的WEB服务器地址，然后将数据包的IP地址修改为真实的WEB服务器地址，不需要通过用户进程处理。真实的WEB服务器处理完毕后，相应数据包回到负载均衡服务器，负载均衡服务器再将数据包源地址修改为自身的IP地址发送给用户浏览器。
　这里的关键在于真实WEB服务器相应数据包如何返回给负载均衡服务器，一种是负载均衡服务器在修改目的IP地址的同时修改源地址，将数据包源地址改为自身的IP，即源地址转换（SNAT），另一种方案是将负载均衡服务器同时作为真实物理服务器的网关服务器，这样所有的数据都会到达负载均衡服务器。
　IP负载均衡在内核进程完成数据分发，较反向代理均衡有更好的处理性能。但由于所有请求响应的数据包都需要经过负载均衡服务器，因此负载均衡的网卡带宽成为系统的瓶颈。

#### 9.2.5.4. HTTP重定向负载均衡(少见)
HTTP重定向负载均衡
　HTTP重定向服务器是一台普通的应用服务器，其唯一的功能就是根据用户的HTTP请求计算一台真实的服务器地址，并将真实的服务器地址写入HTTP重定向响应中（响应状态吗302）返回给浏览器，然后浏览器再自动请求真实的服务器。
　这种负载均衡方案的优点是比较简单，缺点是浏览器需要每次请求两次服务器才能拿完成一次访问，性能较差；使用HTTP302响应码重定向，可能是搜索引擎判断为SEO作弊，降低搜索排名。重定向服务器自身的处理能力有可能成为瓶颈。因此这种方案在实际使用中并不见多。

#### 9.2.5.5. 反向代理负载均衡(nginx)
反向代理负载均衡
　传统代理服务器位于浏览器一端，代理浏览器将HTTP请求发送到互联网上。而反向代理服务器则位于网站机房一侧，代理网站web服务器接收http请求。
　反向代理的作用是保护网站安全，所有互联网的请求都必须经过代理服务器，相当于在web服务器和可能的网络攻击之间建立了一个屏障。
　除此之外，代理服务器也可以配置缓存加速web请求。当用户第一次访问静态内容的时候，静态内存就被缓存在反向代理服务器上，这样当其他用户访问该静态内容时，就可以直接从反向代理服务器返回，加速web请求响应速度，减轻web服务器负载压力。
　另外，反向代理服务器也可以实现负载均衡的功能。
反向代理服务器
　由于反向代理服务器转发请求在HTTP协议层面，因此也叫应用层负载均衡。优点是部署简单，缺点是可能成为系统的瓶颈。

## 9.3. 隔离
<a href="#menu" style="float:right">目录</a>

### 9.3.1. 概述
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

## 9.4. 限流
<a href="#menu" style="float:right">目录</a>

### 9.4.1. 概述
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


### 9.4.2. 限流算法


#### 9.4.2.1. 计数器法
计数器法是限流算法里最简单也是最容易实现的一种算法。比如我们规定，对于A接口来说，我们1分钟的访问次数不能超过100个。那么我们可以这么做：在一开 始的时候，我们可以设置一个计数器counter，每当一个请求过来的时候，counter就加1，如果counter的值大于100并且该请求与第一个 请求的间隔时间还在1分钟之内，那么说明请求数过多；如果该请求与第一个请求的间隔时间大于1分钟，且counter的值还在限流范围内，那么就重置 counter

#### 9.4.2.2. 滑动窗口
滑动窗口，又称rolling window。为了解决这个问题，我们引入了滑动窗口算法。如果学过TCP网络协议的话，那么一定对滑动窗口这个名词不会陌生。下面这张图，很好地解释了滑动窗口算法：

在上图中，整个红色的矩形框表示一个时间窗口，在我们的例子中，一个时间窗口就是一分钟。然后我们将时间窗口进行划分，比如图中，我们就将滑动窗口 划成了6格，所以每格代表的是10秒钟。每过10秒钟，我们的时间窗口就会往右滑动一格。每一个格子都有自己独立的计数器counter，比如当一个请求 在0:35秒的时候到达，那么0:30~0:39对应的counter就会加1。

那么滑动窗口怎么解决刚才的临界问题的呢？我们可以看上图，0:59到达的100个请求会落在灰色的格子中，而1:00到达的请求会落在橘黄色的格 子中。当时间到达1:00时，我们的窗口会往右移动一格，那么此时时间窗口内的总请求数量一共是200个，超过了限定的100个，所以此时能够检测出来触 发了限流。

我再来回顾一下刚才的计数器算法，我们可以发现，计数器算法其实就是滑动窗口算法。只是它没有对时间窗口做进一步地划分，所以只有1格。

由此可见，当滑动窗口的格子划分的越多，那么滑动窗口的滚动就越平滑，限流的统计就会越精确。

* 计数器 VS 滑动窗口
计数器算法是最简单的算法，可以看成是滑动窗口的低精度实现。滑动窗口由于需要存储多份的计数器（每一个格子存一份），所以滑动窗口在实现上需要更多的存储空间。也就是说，如果滑动窗口的精度越高，需要的存储空间就越大。

#### 9.4.2.3. 漏桶算法
<a href="#menu" style="float:right">目录</a>
<a href="#menu" style="float:right">目录</a>
漏桶(Leaky Bucket)算法思路很简单，水（请求）先进入到漏桶里，漏桶以一定的速度出水（接口有响应速率），当水流入速度过大会直接溢出（访问频率超过接口响应速率），然后就拒绝请求，可以看出漏桶算法能强行限制数据的传输速率。示意图如下：
![](https://img2018.cnblogs.com/blog/1136672/201904/1136672-20190421202927762-1718486905.png)

#### 9.4.2.4. 令牌桶算法
<a href="#menu" style="float:right">目录</a>

令牌桶算法（Token Bucket）和 Leaky Bucket 效果一样但方向相反的算法，更加容易理解。随着时间流逝，系统会按恒定1/QPS时间间隔（如果QPS=100，则间隔是10ms）往桶里加入Token（想象和漏洞漏水相反，有个水龙头在不断的加水），如果桶已经满了就不再加了。新请求来临时，会各自拿走一个Token，如果没有Token可拿了就阻塞或者拒绝服务。示意图如下：
![](https://img2018.cnblogs.com/blog/1136672/201904/1136672-20190421202936084-459487536.jpg)

漏桶算法与令牌桶算法的区别在于，漏桶算法能够强行限制数据的传输速率，令牌桶算法能够在限制数据的平均传输速率的同时还允许某种程度的突发传输。令牌桶的另外一个好处是可以方便的改变速度。 一旦需要提高速率，则按需提高放入桶中的令牌的速率。一般会定时（比如100毫秒）往桶中增加一定数量的令牌, 有些变种算法则实时的计算应该增加的令牌的数量。

### 9.4.3. 应用级限流
<a href="#menu" style="float:right">目录</a>

#### 9.4.3.1. 限流总并发数/连接/请求数

#### 9.4.3.2. 限流总资源数

#### 9.4.3.3. 限流某个接口的总并发数/请求数

#### 9.4.3.4. 限流某个接口的时间窗请求数

#### 9.4.3.5. 平滑限流某个接口的请求数





### 9.4.4. 分布式限流
<a href="#menu" style="float:right">目录</a>

#### 9.4.4.1. Redis与Lua

案例-实现访问频率限制: 实现访问者 $ip 在一定的时间 $time 内只能访问 $limit 次.
非脚本实现
```java
private boolean accessLimit(String ip, int limit, int time, Jedis jedis) {
    boolean result = true;

    String key = "rate.limit:" + ip;
    if (jedis.exists(key)) {
        long afterValue = jedis.incr(key);
        if (afterValue > limit) {
            result = false;
        }
    } else {
        Transaction transaction = jedis.multi();
        transaction.incr(key);
        transaction.expire(key, time);
        transaction.exec();
    }
    return result;
}
```

以上代码有两点缺陷 
可能会出现竞态条件: 解决方法是用 WATCH 监控 rate.limit:$IP 的变动, 但较为麻烦;
以上代码在不使用 pipeline 的情况下最多需要向Redis请求5条指令, 传输过多.
Lua脚本实现 
Redis 允许将 Lua 脚本传到 Redis 服务器中执行, 脚本内可以调用大部分 Redis 命令, 且 Redis 保证脚本的原子性:

首先需要准备Lua代码: script.lua
```lua
local key = "rate.limit:" .. KEYS[1]
local limit = tonumber(ARGV[1])
local expire_time = ARGV[2]

local is_exists = redis.call("EXISTS", key)
if is_exists == 1 then
    if redis.call("INCR", key) > limit then
        return 0
    else
        return 1
    end
else
    redis.call("SET", key, 1)
    redis.call("EXPIRE", key, expire_time)
    return 1
end
```

Java
```java
private boolean accessLimit(String ip, int limit, int timeout, Jedis connection) throws IOException {
    List<String> keys = Collections.singletonList(ip);
    List<String> argv = Arrays.asList(String.valueOf(limit), String.valueOf(timeout));

    return 1 == (long) connection.eval(loadScriptString("script.lua"), keys, argv);
}

// 加载Lua代码
private String loadScriptString(String fileName) throws IOException {
    Reader reader = new InputStreamReader(Client.class.getClassLoader().getResourceAsStream(fileName));
    return CharStreams.toString(reader);
}
```

Lua 嵌入 Redis 优势: 
减少网络开销: 不使用 Lua 的代码需要向 Redis 发送多次请求, 而脚本只需一次即可, 减少网络传输;
原子操作: Redis 将整个脚本作为一个原子执行, 无需担心并发, 也就无需事务;
复用: 脚本会永久保存 Redis 中, 其他客户端可继续使用.


#### 9.4.4.2. Nginx

nginx本身有限流模块


## 9.5. 降级
<a href="#menu" style="float:right">目录</a>

### 9.5.1. 降级概念

**服务降级**
当服务器压力剧增的时候,根据当前业务情况以及流量，对一些服务和页面有策略的降级，以此缓解服务器资源的压力以保障核心任务的正常运行，同时也保证了大部分客户能得到正常的响应。
* 服务接口拒绝服务：页面能访问，但是添加删除提示服务器繁忙。页面内容也可在Varnish或CDN内获取。
* 页面拒绝服务：页面提示由于服务繁忙此服务暂停。跳转到varnish或nginx的一个静态页面。
* 延迟持久化：页面访问照常，但是涉及记录变更，会提示稍晚能看到结果，将数据记录到异步队列或log，服务恢复后执行。
* 随机拒绝服务：服务接口随机拒绝服务，让用户重试，目前较少有人采用。因为用户体验不佳。

  在一般稍微大一点的互联网公司基本上都会有一个配置中心的角色,通常由配置服务和代理和应用程序组成，Agent会定期的或者实时的接受配置中心的变更，将配置信息写入本地文件。此时SDK会同步代理的配置以达到同步配置中心的数据。当然也可以没有Agent这一角色，SDK直接监听配置中心的变更。
  拥有了这一架构之后,对于每个应用程序的请求或者数据库都可以通过配置中心来进行降级与切换。当然了如果目前所处环境没有这一条件也可以使用单纯的DB来保存 key-value来简易实现这一功能。

**服务熔断(过载保护)**
  对于炒股的同学，熔断这个词可能并不陌生，它是指当某一股值波浮达到某一个点后交易所为了控制风险，采取一些暂停交易的措施。响应的如果某个目标服务调用慢或者有大量超时，此时，熔断该服务的调用，对于后续调用请求，不在继续调用目标服务，直接返回，快速释放资源。如果目标服务情况好转则恢复调用。
  三个模块：熔断请求判断算法、熔断恢复机制、熔断报警
（1）熔断请求判断机制算法：使用无锁循环队列计数，每个熔断器默认维护10个bucket，每1秒一个bucket，每个blucket记录请求的成功、失败、超时、拒绝的状态，默认错误超过50%且10秒内超过20个请求进行中断拦截。
（2）熔断恢复：对于被熔断的请求，每隔5s允许部分请求通过，若请求都是健康的（RT<250ms）则对请求健康恢复。
（3）熔断报警：对于熔断的请求打日志，异常请求超过某些设定则报警

**降级与熔断对比**

* **共性**
    * 目的: 目的一致，都是从系统的可用性、可靠性着想。放了防止系统的整体缓慢甚至奔溃而采用的技术手段。
    * 最终表现: 表现类似,最终都是给用户一种当前服务不可用或者不可达的感觉
    * 粒度: 大多都是在服务级别，当然也有一些在持久层层面的应用
    * 自治: 基本都是靠系统达到某一临界条件时，实现自动的降级与熔断，人工降级并不是那么稳妥。

* **区别**
    * 触发原因: 服务熔断一般指某个服务的下游服务出现问题时采用的手段,而服务降级一般是从整体层面考虑的。
    * 管理目标层次: 熔断是一种框架级的处理，每一个微服务都需要。而降级一般需要对业务有层级之分，降级一般都是从外围服务开始的。
    * 实现方式: 代码级别实现有差异

**服务降级需要考虑的问题**
* 核心服务、非核心服务
* 是否支持降级，降级策略
* 业务放通场景、策略

**使用场景**
当整个微服务架构整体的负载超出了预设的上限阈值或即将到来的流量预计将会超过预设的阈值时，为了保证重要或基本的服务能正常运行，我们可以将一些不重要或不紧急的服务或任务进行服务的延迟使用或暂停使用。



* 降级的最终目的是保证核心服务可用，降级也是要根据系统的吞吐量，响应时间，可用率等条件进行手动降级或者自动降级。
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
        * 超时降级
            * 响应缓慢的时候自动降级
        * 统计失败次数降级
            * 失败后进行尝试，尝试失败多次则进行降级
        * 故障降级
            * 出现故障时降级，比如RPC调用失败
        * 限流降级
            * 并发大的情况下，超过限流值时进行降级，比如拒绝服务。
    * 人工降级
        * 通过监控，发现CPU，内存等出现异常，则手动进行降级
* 功能区分
    * 读服务降级
        * 后端数据库等存储出现不可用，更换为读端存，仅适用于数据一致性要求不高的场景
    * 写服务降级
        * 并发大的情况下，写数据库会出现问题，先将数据读到缓存，在缓存里面进行操作，需要保证最终的数据一致性
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

### 9.5.2. 使用Hystrix实现降级
<a href="#menu" style="float:right">目录</a>

#### 9.5.2.1. 降级Demo
话不多说，下面先来一个Demo（对于Hystrix的依赖，这里就不再介绍了）。

**GetStockServiceCommand**
```java
public class GetStockServiceCommand extends HystrixCommand<String> {

    private StockService stockService;

    public GetStockServiceCommand (StockService stockService) {
        super(setter());
        this.stockService = stockService;
    }

    private static Setter setter() {
        // 服务分组
        HystrixCommandGroupKey groupKey = HystrixCommandGroupKey.Factory.asKey("stock");
        // 命令配置
        HystrixCommandProperties.Setter commandProperties = HystrixCommandProperties.Setter()
                .withExecutionIsolationStrategy(HystrixCommandProperties.ExecutionIsolationStrategy.THREAD)
                .withFallbackEnabled(true)
                .withFallbackIsolationSemaphoreMaxConcurrentRequests(100)
                .withExecutionIsolationThreadInterruptOnFutureCancel(true)
                .withExecutionIsolationThreadInterruptOnTimeout(true)
                .withExecutionTimeoutEnabled(true)
                .withExecutionTimeoutInMilliseconds(1000);
        return HystrixCommand.Setter.withGroupKey(groupKey).andCommandPropertiesDefaults(commandProperties);
    }

    @Override
    protected String run() throws Exception {
        // 可以通过异常/Thread.sleep()模拟超时
        return stockService.getStock();
    }

    @Override
    protected String getFallback() {
        return "有货";
    }
}
```

**StockService**
```java
public class StockService {

    public String getStock() {
        throw new RuntimeException("出现异常了!");
    }
}
```

**GetStockTest**
```java
public class GetStockTest {

    public static void main(String[] args) {
        StockService stockService = new StockService();
        GetStockServiceCommand stockServiceCommand = new GetStockServiceCommand(stockService);
        String result = stockServiceCommand.execute();// 同步执行
        System.out.println(result);

        // 异步调用, 可自由控制获取结果时机
        // Future<String> future = helloworldCommand.queue();
        // get操作不能超过command定义的超时时间, 默认1秒
        // result = future.get(100, TimeUnit.MILLISECONDS);
    }
}
```

GetStockTest为测试入口，为了对stockService服务做自动降级。对stockService做了一层Command包装，然后调用execute()去执行GetStockServiceCommand里面的run()方法。因为stockService.getStock()方法抛出了异常，所以会执行降级操作，也就是getFallback()方法会被执行并返回。

#### 9.5.2.2. 降级参数

**使用HystrixCommandProperties配置和getFallback()方法可以实现降级处理。下面详细介绍一下配置参数：**
* withFallbackEnabled：是否启用降级，若启用，则在超时或异常时调用getFallback进行降级。（默认开启）
* withFallbackIsolationSemaphoreMaxConcurrentRequests：配置了fallback()请求并发的信号量，当调用fallback()的并发超过阀值（默认10），则会进入快速失败。
* withExecutionIsolationThreadInterruptOnFutureCancel：当隔离策略为THREAD时，当线程执行超时，是否进行中断处理，即异步的Future#cancel()。（默认为false）
* withExecutionIsolationThreadInterruptOnTimeout：当隔离策略为THREAD时，当线程执行超时，是否进行中断处理。（默认为true）这里指的是同步调用：execute()
* withExecutionTimeoutEnabled：是否启用超时机制，默认为true。
* withExecutionTimeoutInMilliseconds：执行超时时间，默认1000毫秒。1、配置线程隔离，则执行中断处理；2、配置信号量隔离，则进行终止操作。因为信号量隔离和主线程是在一个线程中执行，其不会中断线程处理。所以要根据实际情况选择类型。

**除了上面的部分参数，对于getFallback()还需要注意以下的几点：**
最大并发数受fallbackIsolationSemaphoreMaxConcurrentRequests控制，如果失败率非常高，则需要重新配置该参数。如果并发数超过了该配置，则不会再执行getFallback()，而是快速失败。如抛出HystrixRuntimeException的异常。
该方法不能进行网络调用，应该只是返回兜底的数据。
如果必须要走一个网络调用，则就需要调用另外一个Command。
Command可以有降级和熔断机制，而getFallback只有fallbackIsolationSemaphoreMaxConcurrentRequest参数控制最大并发数。

#### 9.5.2.3. 熔断
Command首先调用HystrixCircuitBreaker#allowRequest判断是否熔断了，如果没有则执行Command#run方法；若熔断了则直接调用Command#getFallback方法降级处理。

通过circuitBreakerSleepWindowInMilliseconds可以控制一个时间窗口内，可进行一次请求测试。若测试成功，则闭合熔断开关，否则还是打开状态，从而实现了快速失败和恢复。关于熔断有以下几个概念需要了解一下：

**概念**
* 闭合（Closed）：如果配置了熔断开关强制闭合，或者当前请求失败率没有超过阀值，则熔断开关处于闭合状态，此时不会启动熔断机制，即不进行降级处理。
* 打开（Open）：如果配置了熔断开关强制打开，或者当前失败率超过了阀值，则熔断开关打开，此时会调用getFallback()方法进行降级处理。
* 半打开（Half-Open）：当熔断处于打开状态后，不能一直熔断下去，需要在一个时间窗口之后进行重试，这就是半打开状态。Hystrix允许在circuitBreakerSleepWindowInMilliseconds的时间窗口内进行一次重试。重试成功后闭合熔断开关，否则熔断开关还是处于打开状态
。
上面所指的失败包含：异常、超时、线程池拒绝、信号量拒绝的总和。

**配置示例**
```java
HystrixCommandProperties.Setter commandProperties = HystrixCommandProperties.Setter()
    .withCircuitBreakerEnabled(true)// 默认为true
    .withCircuitBreakerForceClosed(false)// 默认为false
    .withCircuitBreakerForceOpen(false)// 默认为false
    .withCircuitBreakerErrorThresholdPercentage(50)// 默认50%
    .withCircuitBreakerRequestVolumeThreshold(20)// 默认为20
    .withCircuitBreakerSleepWindowInMilliseconds(5000)// 默认5秒
```
* withCircuitBreakerEnabled：是否开启熔断机制，默认为true。
* withCircuitBreakerForceClosed：是否强制关闭熔断开关，如果强制关闭了熔断开关，则请求不会被降级，一些场景可以动态设置该开关，默认为false。
* withCircuitBreakerForceOpen：是否强制打开熔断开关，如果打开了，则请求强制降级调用getFallback处理，可以通过动态配置来打开开关实现一些特殊需求，默认为false。
* withCircuitBreakerErrorThresholdPercentage：如果在一个采样时间窗口内，失败率超过该配置，则自动打开熔断开关，快速失败。默认采样周期为10秒，失败率为50%。
* withCircuitBreakerRequestVolumeThreshold：在熔断开关闭合的情况下，在进行失败率判断之前，一个采样周期内必须进行至少N个请求才能进行采样统计。目的是有足够的采样使得失败率计算的比较接近真实值，默认为20.
* withCircuirBreakerSleepWindowInMilliseconds：熔断后的重试时间窗口，在窗口内只允许一次重试。在熔断开关打开后，若重试成功，则重试Health采样统计，并闭合熔断开关实现快速恢复。否则熔断开关还是打开状态，会进行快速失败。


**通过下面的方法可以获取熔断器的状态：**
* isCircuitBreakerOpen：熔断开关是否打开了，通过 circuitBreakerForceOpen().get() || (!circuitBreakerForceClosed().get() && circuitBreaker.isOpen()) 判断。
* isResponseShortCircuited：isCircuitBreakerOpen=true，且调用getFallback()时返回true。

#### 9.5.2.4. 采样统计

**Hystrix在内存中存储采样数据，支持如下3种采样：**
* BucketedCounterStream：计数统计。记录一定时间窗口内的失败、超时、线程池拒绝、信号量拒绝数量。写入第N组时，用前N-1组统计，然后基于时间窗口平滑后移统计。
![](https://img-blog.csdn.net/20180713101312536?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3d1eGlhbjkw/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
* RollingConcurrencyStream：最大并发数统计。如Command/ThreadPool的最大并发数。
* RollingDistributionStream：延迟百分比统计，和HystrixRollingNumber类似，差别在于其是百分位数的统计。比如每组记录P（如100）个数值，统计时用前N-1组数据，将分组数据按从小到大排序，然后累加，处于p%位置的就是p百分位数，通过它可以实现P50、P99、P999，Hystrix用来统计延时的分布情况。

**1、Command、ThreadPool计数/最大并发采样统计**
```java
HystrixThreadPoolProperties.Setter threadPoolProperties = HystrixThreadPoolProperties.Setter()
    .withMetricsRollingStatisticalWindowInMilliseconds(1000)
    .withMetricsRollingStatisticalWindowBuckets(10);
HystrixCommandProperties.Setter commandProperties = HystrixCommandProperties.Setter()
    .withMetricsRollingStatisticalWindowInMilliseconds(10000)
    .withMetricsRollingStatisticalWindowBuckets(10);
```

* withMetricsRollingStatisticalWindowInMilliseconds：配置采样统计滚转之间窗口，默认为10秒。
* withMetricsRollingStatisticalWindowBuckets：配置采用统计滚转时间窗口内的桶的总数量，默认为10，比如时间窗口为10000，桶数量为10，则采用统计间隔为每秒一个桶统计。

**2、Command健康度采样统计**
```java
HystrixCommandProperties.Setter commandProperties = HystrixCommandProperties.Setter()
    .withMetricsRollingStatisticalWindowInMilliseconds(10000)
    .withMetricsHealthSnapshotIntervalInMilliseconds(500);
```
* withMetricsRollingStatisticalWindowInMilliseconds：同上。
* withMetricsHealthSnapshotIntervalInMilliseconds：记录健康度采用统计的快照频率，默认为500ms，即500ms一个采样统计间隔，那么桶的数量为10000/500=20个。
该统计在熔断机制中使用时，如果计算熔断的频率非常高，则需要控制好采样的频率。如果太频繁，就有可能造成CPU计算密集。所以选择Hystrix要注意此处的性能消耗和调优，如果此处是瓶颈，则可以费除掉统计。

**3、Command时延分布采样统计**
```java
HystrixCommandProperties.Setter commandProperties = HystrixCommandProperties.Setter()
    .withMetricsRollingPercentileWindowInMilliseconds(60000)
    .withMetricsRollingPercentileWindowBuckets(6);

上面默认采样滚转时间窗口为60S，有6个桶，即每10S一个桶统计。

```

Hystrix流程结构
![](https://img-blog.csdn.net/20180713101455796?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3d1eGlhbjkw/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

**流程说明**
* 1、每次调用创建一个新的HystrixCommand，把依赖调用封装在run()方法中。 
* 2、执行execute/queue做同步或异步调用。 
* 3、判断熔断器(circuit-breaker)是否打开，如果打开跳到步骤8，进行降级策略，如果关闭进入步骤4。 
* 4、判断线程池/队列/信号量是否跑满，如果跑满进入降级步骤8，否则继续后续步骤。 
* 5、调用HystrixCommand的run方法，运行依赖逻辑。 
* 5a、依赖逻辑调用超时，进入步骤8。 
* 6、判断逻辑是否调用成功。 
* 6a、返回成功调用结果。 
* 6b、调用出错，进入步骤8。 
* 7、计算熔断器状态，所有的运行状态(成功、失败、拒绝、超时)上报给熔断器，用于统计从而判断熔断器状态。 
* 8、getFallback()降级逻辑。
    * 以下四种情况将触发getFallback调用：
        * (1) run()方法抛出非HystrixBadRequestException异常
        * (2) run()方法调用超时
        * (3) 熔断器开启拦截调用 
        * (4) 线程池/队列/信号量是否跑满
* 8a、没有实现getFallback的Command将直接抛出异常。 
* 8b、fallback降级逻辑调用成功直接返回。 
* 8c、降级逻辑调用失败抛出异常。 
* 9、返回执行成功结果。

#### 9.5.2.5. 线程/信号量隔离

**线程隔离**
把执行依赖代码的线程与请求线程分离，请求线程可以自由控制离开的时间(异步过程)。通过线程池大小可以控制并发量，当线程池饱和时可以提前拒绝服务，防止依赖问题扩散。线上建议线程池不要设置过大，否则大量堵塞线程有可能会拖慢服务器。

**信号量隔离**
信号隔离也可以用于限制并发访问，防止阻塞扩散，与线程隔离最大不同在于执行依赖代码的线程依然是请求线程（该线程需要通过信号申请），如果客户端是可信的且可以快速返回，可以使用信号隔离替换线程隔离，降低开销。


## 9.6. 回滚机制
<a href="#menu" style="float:right">目录</a>

### 9.6.1. 事务回滚
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
### 9.6.2. 代码库回滚
* Git
* SVN
### 9.6.3. 部署版本回滚
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
### 9.6.4. 静态资源回滚

## 9.7. 压测与预案
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
### 9.7.1. 系统压测
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
#### 9.7.1.1. 线下压测
* 线下通过Jmeter或者Apache ab压测系统的某个接口，然后进行调优。以达到组件性能最优状态
* 线下压测环境和线上环境(服务器，网络，数据量)和线上完全不一样，因此测试结果只能作为参考

#### 9.7.1.2. 线上压测
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

### 9.7.2. 系统优化和容灾
* 很据压测报告进行相应的优化和升级，比如硬件升级，集群扩容，参数优化，代码优化




## 9.8. 缓存
<a href="#menu" style="float:right">目录</a>
* 缓存命中率
    * 缓存命中的次数/缓存查询次数
    * 命中率越高越好
    * 通过监控该参数确认是否工作良好

### 9.8.1. 应用级缓存
<a href="#menu" style="float:right">目录</a>

#### 9.8.1.1. 缓存命中率
缓存命中率是指缓存读取成功与总读取次数之比，越高越好，应该通过这个数据监控缓存是否工作良好。


#### 9.8.1.2. 缓存回收策略
<a href="#menu" style="float:right">目录</a>

* 基于空间
    * 占用的存储空间大小
* 基于容量
    * 缓存的数量
* 基于时间
    * 缓存的存在时间
* 基于Java对象引用
    * 软引用
    * 弱引用
    
#### 9.8.1.3. 回收算法
<a href="#menu" style="float:right">目录</a>

##### 9.8.1.3.1. FIFO
* FIFO ：（First In First Out）：先进先出算法，即先放入缓存的先被移除。
* 存在的问题
    * 当大量的新缓存插入会使早期进入的热点缓存会被移除掉。
##### 9.8.1.3.2. LRU 
* LRU（Least Recently Used）：最近最少使用算法，使用时间距离现在最久的那个被移除。
* 实现
    * 当有新数据时插入链表头部
    * 当缓存命中，则将数据移到链表头部
    * 当链表满的时候，移除链表尾部的数据
* 存在的问题
    * 如果最近一段时间没有访问热点缓存，访问的是冷数据，热点缓存会被移除掉

##### 9.8.1.3.3. LFU
* LFU（Least Frequently Used）：最不常用算法，一定时间段内使用【次数（频率）】最少的那个被移除。
* 给每一个缓存添加访问计数器，缓存不足时移除计数器最小的缓存
* 存在的问题
    * 如果频率时间度量是1小时，则平均一天每个小时内的访问频率1000的热点数据可能会被2个小时的一段时间内的访问频率是1001的数据剔除掉；
    *  最近新加入的数据总会易于被剔除掉，由于其起始的频率值低。本质上其“重要性”指标访问频率是指在多长的时间维度进行衡量？其难以标定，所以在业界很少单一直接使用。也由于两种算法的各自特点及缺点，所以通常在生产线上会根据业务场景联合LRU与LFU一起使用，称之为LRFU。
##### 9.8.1.3.4. LRFU
* 利用两个队列维护访问的数据元素，按被访问的频率的维度把元素分别搁在热端与冷端队列；而在同一个队列内，最后访问时间越久的元素会越被排在队列尾。
 
#### 9.8.1.4. Java 缓存类型
<a href="#menu" style="float:right">目录</a>

##### 9.8.1.4.1. 堆缓存
* 使用堆内存来存储对象
* 好处是不需要序列化和反序列化，速度快。
* 当缓存比较大时，GC回收时间比较长
* 一般通过软引用/弱引用来存储对象,即当堆内存不足时，可以强制回收这部分内存。
* 一般用于缓存少量的热点数据，并且不是频繁修改的，因为集群环境下会出现数据不一致问题，需要做好过期时间设置
* 常用实现方案有: Guava ,Ehcache ,MapDB

##### 9.8.1.4.2. 堆外缓存
* 使用堆外内存进行缓存,减少GC暂停时间
* 可以使用更大的缓存空间，受机器内存限制
* 实现方案:Ehcache ,MapDB

##### 9.8.1.4.3. 磁盘缓存
* 存储磁盘，重启后仍可以加载缓存
* 实现方案:Ehcache ,MapDB

##### 9.8.1.4.4. 分布式缓存
* 实现多应用共享缓存
* 实现方案:Redis

##### 9.8.1.4.5. 多级缓存
多级缓存就是根据不同的访问速率来设置多级缓存。优先访问速率高的缓存，提升系统性能。
比如先访问本地缓存，本地缓存不存在，再访问分布式缓存。可以尽量减少一次网络操作。

#### 9.8.1.5. 应用级缓存示例
<a href="#menu" style="float:right">目录</a>

* 设计策略
    * 统一API封装
    * 可选的缓存方案
    * 失败统计以提供系统监控和分析
    * 命中率低通知报警
    * 缓存一致性考虑


#### 9.8.1.6. 缓存使用模式实践
<a href="#menu" style="float:right">目录</a>

* SOR
    * 记录系统，实际存储原始数据的系统，比如数据库
* Cache
    * 缓存，访问速度比SOR快
* 回源
    * 缓存没有命中，回源数据库拿数据

##### 9.8.1.6.1. Cache-Aside
* 业务代码维护缓存，也就是业务代码和缓存操作混在一起
* 并发更新问题，多个实例同时更新
    * 如果是用户维度的问题，比如用户的订单数据、用户数据，并发更新的情况很少，加上过去时间就可以
    * 对于商品数据，可以考虑canal订阅binlog.来进行增量更新，不会出现不一致情况，但会存在延迟
    * 
##### 9.8.1.6.2. Cache-As-SOR
* Cache 看作SOR，所有操作都是对Cache进行，然后Cache再委托给SOR进行真实的读写，即代码中只看到Cache的操作
* 有三种实现: Read-Through, Write-Through,Write-Behind

##### 9.8.1.6.3. Read-Through
* 先查询缓存，缓存不命中再回源SOR，而不是业务代码进行回源。比如Guava的失败回调
* 优点:业务代码更加简洁
* 缺点：不适合复杂的查询，因为每次回源的查询条件 是不一样的，需要根据每个查询单独编写代码，可以使用回调函数解决

##### 9.8.1.6.4. Write-Through
* 穿透写模式/直写模式
* 业务代码首先调用Cache写数据，然后由Cache负责写缓存和写Sor,而不是由业务代码操作

##### 9.8.1.6.5. Write-Behind
* 回写模式,异步操作，异步之后可以实现批量写，合并写，延时写和限流

##### 9.8.1.6.6. Copy-Pattern
* 两种复制模式，Copy on read,copy on write
* Guava Cache 和Ehcache中堆缓存都是基于引用，有可能发生有人拿到缓存后修改，导致数据出现修改问题。
* Ehcache3.x提供解决方案

#### 9.8.1.7. 缓存一致性处理
<a href="#menu" style="float:right">目录</a>

先做一个说明，从理论上来说，给缓存设置过期时间，是保证最终一致性的解决方案。这种方案下，我们可以对存入缓存的数据设置过期时间，所有的写操作以数据库为准，对缓存操作只是尽最大努力即可。也就是说如果数据库写成功，缓存更新失败，那么只要到达过期时间，则后面的读请求自然会从数据库中读取新值然后回填缓存。因此，接下来讨论的思路不依赖于给缓存设置过期时间这个方案。

在这里，我们讨论三种更新策略：
* 先更新数据库，再更新缓存
* 先删除缓存，再更新数据库
* 先更新数据库，再删除缓存

* **先更新数据库，再更新缓存**
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

* **先删缓存，再更新数据库**
该方案会导致不一致的原因是。同时有一个请求A进行更新操作，另一个请求B进行查询操作。那么会出现如下情形:
（1）请求A进行写操作，删除缓存
（2）请求B查询发现缓存不存在
（3）请求B去数据库查询得到旧值
（4）请求B将旧值写入缓存
（5）请求A将新值写入数据库
上述情况就会导致不一致的情形出现。而且，如果不采用给缓存设置过期时间策略，该数据永远都是脏数据。
那么，如何解决呢？采用延时双删策略
伪代码如下
```java
public void write(String key,Object data){
    redis.delKey(key);
    db.updateData(data);
    Thread.sleep(1000);
    redis.delKey(key);
}
```
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

* **先更新数据库，再删缓存**
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


#### 9.8.1.8. 缓存异常处理
<a href="#menu" style="float:right">目录</a>

##### 9.8.1.8.1. 缓存穿透
缓存击穿表示恶意用户模拟请求很多缓存中不存在的数据，由于缓存中都没有，导致这些请求短时间内直接落在了数据库上，导致数据库异常。这个我们在实际项目就遇到了，有些抢购活动、秒杀活动的接口API被大量的恶意用户刷，导致短时间内数据库宕机了，好在数据库是多主多从的，hold住了。
##### 9.8.1.8.2. 缓存击穿
对于一些设置了过期时间的key，如果这些key可能会在某些时间点被超高并发地访问，是一种非常“热点”的数据。这个时候，需要考虑一个问题：缓存被“击穿”的问题，这个和缓存雪崩的区别在于这里针对某一key缓存，前者则是很多key。
缓存在某个时间点过期的时候，恰好在这个时间点对这个Key有大量的并发请求过来，这些请求发现缓存过期一般都会从后端DB加载数据并回设到缓存，这个时候大并发的请求可能会瞬间把后端DB压垮。
##### 9.8.1.8.3. 缓存雪崩
缓存在同一时间内大量键过期（失效），接着来的一大波请求瞬间都落在了数据库中导致连接异常。

##### 9.8.1.8.4. 解决方案

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

```xml
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

##### 9.8.1.8.5. 缓存并发问题

这里的并发指的是多个redis的client同时set key引起的并发问题。比较有效的解决方案就是把redis.set操作放在队列中使其串行化，必须的一个一个执行，具体的代码就不上了，当然加锁也是可以的，至于为什么不用redis中的事务，留给各位看官自己思考探究。


### 9.8.2. HTTP缓存
<a href="#menu" style="float:right">目录</a>

#### 9.8.2.1. 浏览器缓存

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


#### 9.8.2.2. CDN缓存
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
    
#### 9.8.2.3. NGINX缓存


### 9.8.3. 多级缓存
<a href="#menu" style="float:right">目录</a>

#### 9.8.3.1. 多级缓存介绍

多级缓存就是在整个系统架构的不同系统层级进行数据缓存。以提升访问效率。

![](https://images2018.cnblogs.com/blog/531691/201802/531691-20180223174306584-2092797691.png)

* 前端做缓存，比如不常更新的数据进行缓存，比如图片，用户数据等，同时借助CDN实现静态文件的缓存和快速访问
* 接入Nginx将请求负载均衡到应用Nginx，此处常用的负载均衡算法是轮询或者一致性哈希，轮询可以使服务器的请求更加均衡，而一致性哈希可以提升应用Nginx的缓存命中率，相对于轮询，一致性哈希会存在单机热点问题，一种解决办法是热点直接推送到接入层Nginx，一种办法是设置一个阀值，当超过阀值，改为轮询算法。
* 接着应用Nginx读取本地缓存（本地缓存可以使用Lua Shared Dict、Nginx Proxy Cache（磁盘/内存）、Local Redis实现），如果本地缓存命中则直接返回，使用应用Nginx本地缓存可以提升整体的吞吐量，降低后端的压力，尤其应对热点问题非常有效。
* 如果Nginx本地缓存没命中，则会读取相应的分布式缓存（如Redis缓存，另外可以考虑使用主从架构来提升性能和吞吐量），如果分布式缓存命中则直接返回相应数据（并回写到Nginx本地缓存）。
* 如果分布式缓存也没有命中，则会回源到Tomcat集群，在回源到Tomcat集群时也可以使用轮询和一致性哈希作为负载均衡算法。
* 在Tomcat应用中，首先读取本地堆缓存，如果有则直接返回（并会写到主Redis集群），为什么要加一层本地堆缓存将在缓存崩溃与快速修复部分细聊。
* 作为可选部分，如果步骤4没有命中可以再尝试一次读主Redis集群操作。目的是防止当从有问题时的流量冲击。
* 如果所有缓存都没有命中只能查询DB或相关服务获取相关数据并返回。
* 步骤7返回的数据异步写到主Redis集群，此处可能多个Tomcat实例同时写主Redis集群，可能造成数据错乱，如何解决该问题将在更新缓存与原子性部分细聊。
应用整体分了三部分缓存：应用Nginx本地缓存、分布式缓存、Tomcat堆缓存，每一层缓存都用来解决相关的问题，如应用Nginx本地缓存用来解决热点缓存问题，分布式缓存用来减少访问回源率、Tomcat堆缓存用于防止相关缓存失效/崩溃之后的冲击。

#### 9.8.3.2. 如何缓存数据
接下来部将从缓存过期、维度化缓存、增量缓存、大Value缓存、热点缓存几个方面来详细介绍如何缓存数据。

**过期与不过期**
对于缓存的数据我们可以考虑不过期缓存和带过期时间缓存，什么场景应该选择哪种模式需要根据业务和数据量等因素来决定。

* 不过期缓存场景一般思路如图所示：
![不过期缓存方案](https://images2018.cnblogs.com/blog/531691/201802/531691-20180223174453437-1543922855.png) 

使用Cache-Aside模式，首先写数据库，如果成功，则写缓存。这种场景下存在事务成功、缓存写失败但无法回滚事务的情况。另外，不要把写缓存放在事务中，尤其写分布式缓存，因为网络抖动可能导致写缓存响应时间很慢，引起数据库事务阻塞。如果对缓存数据一致性要求不是那么高，数据量也不是很大，则可以考虑定期全量同步缓存。 

也有提到如下思路：先删缓存，然后执行数据库事务；不过这种操作对于如商品这种查询非常频繁的业务不适用，因为在你删缓存的同时，已经有另一个系统来读缓存了，此时事务还没有提交。当然对于如用户维度的业务是可以考虑的。

不过为了更好地解决以上多个事务的问题，可以考虑使用订阅数据库日志的架构，如使用canal订阅mysql的binlog实现缓存同步。

对于长尾访问的数据、大多数数据访问频率都很高的场景、缓存空间足够都可以考虑不过期缓存，比如用户、分类、商品、价格、订单等，当缓存满了可以考虑LRU机制驱逐老的缓存数据。

* 过期缓存机制
即采用懒加载，一般用于缓存别的系统的数据（无法订阅变更消息、或者成本很高）、缓存空间有限、低频热点缓存等场景；常见步骤是：首先读取缓存如果不命中则查询数据，然后异步写入缓存并过期缓存，设置过期时间，下次读取将命中缓存。热点数据经常使用即在应用系统上缓存比较短的时间。这种缓存可能存在一段时间的数据不一致情况，需要根据场景来决定如何设置过期时间。如库存数据可以在前端应用上缓存几秒钟，短时间的不一致时可以忍受的。

**维度化缓存与增量缓存**
对于电商系统，一个商品可能拆成如基础属性、图片列表、上下架、规格参数、商品介绍等；如果商品变更了要把这些数据都更新一遍那么整个更新成本很高：接口调用量和带宽；因此最好将数据进行维度化并增量更新（只更新变的部分）。尤其如上下架这种只是一个状态变更，但是每天频繁调用的，维度化后能减少服务很大的压力。
按照不同维度接收MQ进行更新。

**大Value 缓存**
要警惕缓存中的大Value，尤其是使用Redis时。遇到这种情况时可以考虑使用多线程实现的缓存，如Memcached，来缓存大Value；或者对Value进行压缩；或者将Value拆分为多个小Value，客户端再进行查询、聚合。

 

**热点缓存**
对于那些访问非常频繁的热点缓存，如果每次都去远程缓存系统中获取，可能会因为访问量太大导致远程缓存系统请求过多、负载过高或者带宽过高等问题，最终可能导致缓存响应慢，使客户端请求超时。一种解决方案是通过挂更多的从缓存，客户端通过负载均衡机制读取从缓存系统数据。不过也可以在客户端所在的应用/ 代理层本地存储一份，从而避免访问远程缓存，即使像库存这种数据，在有些应用系统中也可以进行几秒钟的本地缓存，从而降低远程系统的压力。

## 9.9. 系统稳定性
<a href="#menu" style="float:right">目录</a>

### 9.9.1. 在线日志分析

#### 9.9.1.1. 日志分析常用命令

**查看文件内容 cat**
```bash
cat xxx.log
```

**分页显示文件 more/less**
* Enter显示文件下一行
* 空格键下一页
* F显示下一屏
* B显示上一屏

* less 支持内容查找和高亮显示，进入之后输入命令 /xxx

**显示文件尾 tail**
```bash
tail -n 10 -f xxx.log
```
-n 显示的行数
-f 动态显示

**显示文件头 head**
```bash
head -n 10  xxx.log
```
**内容排序 sort**

```bash
sort -n xx.log
```

**字符串查找 grep**

```bash
grep  123  xx.log

# 正则表达式A开头B结尾
grep 'A.*B' xx.log
```

**文件查找 find**
```bash
fina / -name xxx
fina / -name "*.txt"

```
**查找可执行文件的位置 whereis**
```bash
whereis nginx
```

**sed**

**awk**



### 9.9.2. 集群监控

### 9.9.3. 流量控制

### 9.9.4. 性能优化

### 9.9.5. Java故障排查


<span id="menu"></span>


# 10. 分布式系统
<a href="#menu" style="float:right">目录</a>

## 10.1. 基本概念
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
    
## 10.2. 大型网站的特点
<a href="#menu" style="float:right">目录</a>

### 10.2.1. 特点
高并发，大流量;高可用；海量数据;用户分布广泛，网络情况复杂;安全环境恶劣；需求快速变更，发布频繁；渐进式发展.
### 10.2.2. 模式
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
## 10.3. 常用的RPC框架
<a href="#menu" style="float:right">目录</a>
RPC(Remote Procedure Call,远程过程调用)一般用来实现部署在不同的机器上的系统之间的方法调用，使得程序能够像访问本地系统资源一样，通过网络去访问远端系统资源。
这里通过网络访问，并不限制使用何种协议，RPC不等价于TCP方式。

### 10.3.1. Thrift
* FaceBook开发
* 跨平台和语言，支持多种与语言，比如C/C++，Erlang,Java,Js
* 采用二进制编码协议，使用TCP/IP传输协议

### 10.3.2. gRPC
* 谷歌开发,面向移动和**HTTP2**设计
* 支持C，Java,Go，分别是grpc,grpc-java,grpc-go
* 具备诸如双向流，流空，头部压缩，单TCP连接上的多路复用请求等待特性
* 一般用在移动设备上
* 默认为protocol buffers序列化协议，也可以用其他序列化协议，比如json

## 10.4. Dubbo

### 10.4.1. 架构
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

### 10.4.2. 功能

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

### 10.4.3. 连接协议
<a href="#menu" style="float:right">目录</a>

#### 10.4.3.1. dubbo
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

#### 10.4.3.2. rmi
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

#### 10.4.3.3. hessian
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


#### 10.4.3.4. http
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

#### 10.4.3.5. webservice
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

#### 10.4.3.6. thrift
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

#### 10.4.3.7. memcached
#### 10.4.3.8. redis
#### 10.4.3.9. rest
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

## 10.5. 架构演进
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
## 10.6. Java 中间件
* **定义**
    * 中间件不是上层的业务，也不是底层的支撑系统，而是处于中间位置的作用，是应用和应用之间的桥梁。
    * 常见的中间件:
        * 数据库中间件,解决应用访问数据库的共性问题，比如分库分表下的数据访问。
        * 消息中间件，解决应用之间消息传递，解耦和异步的问题。

## 10.7. 序列化机制
<a href="#menu" style="float:right">目录</a>
### 10.7.1. 基本概念
**序列化**:将对象序列化为字节数组，用于网络传输或者磁盘存储。
**反序列化**:将从网络或者磁盘获取的字节数组转化为对象。

* 序列化选择关键点
    * 序列化和反序列化过程的性能
    * 序列化之后的字节长度，这将会影响网络传输。
    * 功能丰富度，比如支持List,Map，复杂对象等
    * 跨语言需求，有的系统由几个不同的应用组成，每个应用可能使用不同的语言开发，因此可能存在跨语言需求。
### 10.7.2. 常用序列化方式性能比较

![](https://img2018.cnblogs.com/blog/1404294/201904/1404294-20190418171605508-1194073956.jpg)
从图上可以看出，protostuff的性能最好，而JDK序列化方式相对来说性能是比较差的。

### 10.7.3. 常用序列化方式实现
#### 10.7.3.1. JDK方式
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
#### 10.7.3.2. FastJSON
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
#### 10.7.3.3. Hessian
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
#### 10.7.3.4. Protostuff
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

## 10.8. 定时任务
<a href="#menu" style="float:right">目录</a>
在项目开发过程中，我们经常需要执行具有周期性的任务。通过定时任务可以很好的帮助我们实现。
当出现应用进行集群部署，此时单体的定时任务管理就会出问题：两个集群中的应用会执行相同的任务。又衍生出处理分布式定时任务，它利用数据库等方式共享定时任务的信息，当集群中有一个应用运行了定时任务。其他应用便不会再次重复执行任务。

单体应用中常使用的定时任务方式是Spring Scheduler,分布式定时任务框架有Quartz.

## 10.9. Cron表达式
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

### 10.9.1. Spring Scheduler
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
### 10.9.2. Quartz
<a href="#menu" style="float:right">目录</a>
#### 10.9.2.1. Quartz 核心概念
* Job 表示一个工作，要执行的具体内容。此接口中只有一个方法，如下：
* JobDetail 表示一个具体的可执行的调度程序，Job 是这个可执行程调度程序所要执行的内容，另外 JobDetail 还包含了这个任务调度的方案和策略。 
* Trigger 代表一个调度参数的配置，什么时候去调。 
* Scheduler 代表一个调度容器，一个调度容器中可以注册多个 JobDetail 和 Trigger。当 Trigger 与 JobDetail 组合，就可以被 Scheduler 容器调度了。 
[更多使用方式参考](https://www.w3cschool.cn/quartz_doc/)

## 10.10. 分布式ID
<a href="#menu" style="float:right">目录</a>

### 10.10.1. 应用场景
分布式ID的应用场景：
* 数据库主键，在进行分库分表时，如果数据库仍然使用自增，可能会出现主键重复的问题，因此需要应用生成主键。
* 在一些消息中间件的使用场景，在处理消息幂等性时，会为每个消息添加一个唯一ID，消费者通过该ID校验消息是否已经被消费。

### 10.10.2. 分布式ID生成方案

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

## 10.11. 分布式锁
[How to do distributed locking](https://martin.kleppmann.com/2016/02/08/how-to-do-distributed-locking.html)
<a href="#menu" style="float:right">目录</a>
不管使用什么中间件，有几点是实现分布式锁必须要考虑到的。
* 互斥：互斥好像是必须的，否则怎么叫锁。
* 死锁: 如果一个线程获得锁，然后挂了，并没有释放锁，致使其他节点(线程)永远无法获取锁，这就是死锁。分布式锁必须做到避免死锁。
* 性能: 高并发分布式系统中，线程互斥等待会成为性能瓶颈，需要好的中间件和实现来保证性能。
* 锁特性：考虑到复杂的场景，分布式锁不能只是加锁，然后一直等待。最好实现如Java Lock的一些功能如：锁判断，超时设置，可重入性等。

### 10.11.1. 使用数据库实现

### 10.11.2. Redis实现分布式锁
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



### 10.11.3. Zookeeper实现分布式锁

## 10.12. 微服务化
<a href="#menu" style="float:right">目录</a>

### 10.12.1. 微服务和SOA

|微服务|SOA|
|---|---|
|能拆分的就拆分|是整体的，服务能放在一起就放在一起|
|纵向业务划分|是水平分多层|
|由单一组织负责|按层级划分不同的组织负责|
|细粒度|粗粒度|
|组件小|存在复杂的组件|
|业务逻辑存在于每一个服务中|业务逻辑横跨多个业务领域|
|使用轻量级的通信方式如HTTP|企业服务总线ESB充当了服务之间通信的角色|

### 10.12.2. 拆分原则
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
    



## 10.13. 消息机制
<a href="#menu" style="float:right">目录</a>


## 10.14. 流量限流
<a href="#menu" style="float:right">目录</a>

## 10.15. 幂等设计
<a href="#menu" style="float:right">目录</a>

## 10.16. 数据一致性
<a href="#menu" style="float:right">目录</a>

### 10.16.1. CAP理论
### 10.16.2. Base理论

## 10.17. 分布式事务实现
<a href="#menu" style="float:right">目录</a>

## 10.18. 负载均衡算法
<a href="#menu" style="float:right">目录</a>

## 10.19. 服务容错设计
<a href="#menu" style="float:right">目录</a>

## 10.20. 集群
<a href="#menu" style="float:right">目录</a>

## 10.21. 分库分表
<a href="#menu" style="float:right">目录</a>

## 10.22. 反向代理&正向代理
<a href="#menu" style="float:right">目录</a>

## 10.23. 客户端优化
<a href="#menu" style="float:right">目录</a>

<h1>WEB安全</h1>

<span id="menu"></span>

# 11. 网络安全
## 11.1. 浏览器安全
<a href="#menu" style="float:right">目录</a>

### 11.1.1. 同源策略

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

## 11.2. 常见的WEB攻击手段

### 11.2.1. 跨站脚本攻击XSS
<a href="#menu" style="float:right">目录</a>

**基础概念**
　　XSS（Cross Site Scripting）攻击全称跨站脚本攻击，是为不和层叠样式表(Cascading Style Sheets, CSS)的缩写混淆，故将跨站脚本攻击缩写为XSS，XSS是一种经常出现在web应用中的计算机安全漏洞，它允许恶意web用户将代码植入到提供给其它用户使用的页面中。比如这些代码包括HTML代码和客户端脚本。（摘自百度百科）

**主要危害**
1、盗取各类用户帐号，如机器登录帐号、用户网银帐号、各类管理员帐号
2、控制企业数据，包括读取、篡改、添加、删除企业敏感数据的能力
3、盗窃企业重要的具有商业价值的资料
4、非法转账
5、强制发送电子邮件
6、网站挂马
7、控制受害者机器向其它网站发起攻击

**攻击方式**
1、反射型
　反射型XSS，也叫非持久型XSS，是指发生请求时，XSS代码出现在请求URL中，作为参数提交到服务器，服务器解析并响应。响应结果中包含XSS代码，最后浏览器解析并执行。从概念上可以看出，反射型XSS代码是首先出现在URL中的，然后需要服务端解析，最后需要浏览器解析之后XSS代码才能够攻击。

这类通常使用URL，具体流程：
1、Alice给Bob发送一个恶意构造了Web的URL。
2、Bob点击并查看了这个URL。
3、恶意页面中的JavaScript打开一个具有漏洞的HTML页面并将其安装在Bob电脑上。
4、具有漏洞的HTML页面包含了在Bob电脑本地域执行的JavaScript。
5、Alice的恶意脚本可以在Bob的电脑上执行Bob所持有的权限下的命令。

举个列子：
http://localhost:8080/helloController/search?name=<script>alert("hey!")</script>
http://localhost:8080/helloController/search?name=<img src='w.123' onerror='alert("hey!")'>
http://localhost:8080/helloController/search?name=<a onclick='alert("hey!")'>点我</a>

服务端代码片段，只做了一个简单的字符串连接就返回给客户端。
![](https://images2018.cnblogs.com/blog/976001/201808/976001-20180811173613221-1624378045.png)
![](https://images2018.cnblogs.com/blog/976001/201808/976001-20180811171704722-737520172.png)
![](https://images2018.cnblogs.com/blog/976001/201808/976001-20180811171720157-1963269620.png)

![](https://images2018.cnblogs.com/blog/976001/201808/976001-20180811171929834-200684964.png)
　　
我们可以看到Google Chrome是有做处理的相对比较安全，但是Firefox就没有。

2、存储型
　　存储型XSS，也叫持久型XSS，主要是将XSS代码发送到服务器（不管是数据库、内存还是文件系统等。），然后在下次请求页面的时候就不用带上XSS代码了。最典型的就是留言板XSS。用户提交了一条包含XSS代码的留言到数据库。当目标用户查询留言时，那些留言的内容会从服务器解析之后加载出来。浏览器发现有XSS代码，就当做正常的HTML和JS解析执行。XSS攻击就发生了。

常用来干嘛？
1、窃取用户信息，如cookie，token，账号密码等。
例如：张三发了一篇帖子，李四进行回复：但内容却是一段js脚本，这篇帖子被他人浏览的时候就会中招，例子中的只是一个alert()，但脚本可以写的比较复杂一点盗用用户cookie等等操作。
![](https://images2018.cnblogs.com/blog/976001/201808/976001-20180811161936913-1572944108.png)

2、除了这种hacker还有个很惯用的伎俩，例如存储型XSS生成一些诱人的图片，文字（你懂的！），然后用户去点击的时候就可以执行某些坏事，窃取信息或者诱导到钓鱼网站。

```html
< img onclick="window.location.href='http://www.baidu.com'" width='300' src='img/webwxgetmsgimg.jpg'/>
```
![](https://images2018.cnblogs.com/blog/976001/201808/976001-20180811163711085-2044434057.png)

![](https://images2018.cnblogs.com/blog/976001/201808/976001-20180811163733106-1179998230.png)
点击图片后，就会进入到目标网站了。
![](https://images2018.cnblogs.com/blog/976001/201808/976001-20180811163742523-848373955.png)
![]()

3、劫持流量实现恶意跳转
用户打开的网址，会默认跳转至指定网站，脚本如下：
```js
　<script>window.location.href="http://www.baidu.com";</script>
```

**防范手段**
1、入参字符过滤
　　在源头控制，把输入的一些不合法的东西都过滤掉，从而保证安全性。如移除用户提交的的DOM属性如onerror，移除用户上传的Style节点，<iframe>, <script>，<a>节点等
2、出参进行编码
　　如果源头没控制好，就得后期补救了：像一些常见的符号，如<>在输出的时候要对其进行转换编码，这样做浏览器是不会对该标签进行解释执行的，同时也不影响显示效果。例如：对<>做编码如："<"用:"&lt;",">"用:"&gt;"来代替。
3、入参长度限制
　　通过以上的案例我们不难发现xss攻击要能达成往往需要较长的字符串，因此对于一些可以预期的输入可以通过限制长度强制截断来进行防御。
4、设置cookie httponly为true

### 11.2.2. 跨站点请求伪造CSRF

<a href="#menu" style="float:right">目录</a>

**CSRF概念**
CSRF跨站点请求伪造(Cross—Site Request Forgery)，跟XSS攻击一样，存在巨大的危害性，你可以这样来理解：攻击者盗用了你的身份，以你的名义发送恶意请求，对服务器来说这个请求是完全合法的，但是却完成了攻击者所期望的一个操作，比如以你的名义发送邮件、发消息，盗取你的账号，添加系统管理员，甚至于购买商品、虚拟货币转账等。 如下：其中Web A为存在CSRF漏洞的网站，Web B为攻击者构建的恶意网站，User C为Web A网站的合法用户。

**CSRF攻击介绍及防御**

* CSRF攻击攻击原理及过程如下：
    * 用户C打开浏览器，访问受信任网站A，输入用户名和密码请求登录网站A；
    * 在用户信息通过验证后，网站A产生Cookie信息并返回给浏览器，此时用户登录网站A成功，可以正常发送请求到网站A；
    * 用户未退出网站A之前，在同一浏览器中，打开一个TAB页访问网站B；
    * 网站B接收到用户请求后，返回一些攻击性代码，并发出一个请求要求访问第三方站点A；
    * 浏览器在接收到这些攻击性代码后，根据网站B的请求，在用户不知情的情况下携带Cookie信息，向网站A发出请求。网站A并不知道该请求其实是由B发起的，所以会根据用户C的Cookie信息以C的权限处理该请求，导致来自网站B的恶意代码被执行。 

**CSRF攻击实例**


受害者 Bob 在银行有一笔存款，通过对银行的网站发送请求 http://bank.example/withdraw?account=bob&amount=1000000&for=bob2 可以使 Bob 把 1000000 的存款转到 bob2 的账号下。通常情况下，该请求发送到网站后，服务器会先验证该请求是否来自一个合法的 session，并且该 session 的用户 Bob 已经成功登陆。

黑客 Mallory 自己在该银行也有账户，他知道上文中的 URL 可以把钱进行转帐操作。Mallory 可以自己发送一个请求给银行：http://bank.example/withdraw?account=bob&amount=1000000&for=Mallory。但是这个请求来自 Mallory 而非 Bob，他不能通过安全认证，因此该请求不会起作用。

这时，Mallory 想到使用 CSRF 的攻击方式，他先自己做一个网站，在网站中放入如下代码： src=”http://bank.example/withdraw?account=bob&amount=1000000&for=Mallory ”，并且通过广告等诱使 Bob 来访问他的网站。当 Bob 访问该网站时，上述 url 就会从 Bob 的浏览器发向银行，而这个请求会附带 Bob 浏览器中的 cookie 一起发向银行服务器。大多数情况下，该请求会失败，因为他要求 Bob 的认证信息。但是，如果 Bob 当时恰巧刚访问他的银行后不久，他的浏览器与银行网站之间的 session 尚未过期，浏览器的 cookie 之中含有 Bob 的认证信息。这时，悲剧发生了，这个 url 请求就会得到响应，钱将从 Bob 的账号转移到 Mallory 的账号，而 Bob 当时毫不知情。等以后 Bob 发现账户钱少了，即使他去银行查询日志，他也只能发现确实有一个来自于他本人的合法请求转移了资金，没有任何被攻击的痕迹。而 Mallory 则可以拿到钱后逍遥法外。 

**CSRF漏洞检测：**
检测CSRF漏洞是一项比较繁琐的工作，最简单的方法就是抓取一个正常请求的数据包，去掉Referer字段后再重新提交，如果该提交还有效，那么基本上可以确定存在CSRF漏洞。

随着对CSRF漏洞研究的不断深入，不断涌现出一些专门针对CSRF漏洞进行检测的工具，如CSRFTester，CSRF Request Builder等。

以CSRFTester工具为例，CSRF漏洞检测工具的测试原理如下：使用CSRFTester进行测试时，首先需要抓取我们在浏览器中访问过的所有链接以及所有的表单等信息，然后通过在CSRFTester中修改相应的表单等信息，重新提交，这相当于一次伪造客户端请求。如果修改后的测试请求成功被网站服务器接受，则说明存在CSRF漏洞，当然此款工具也可以被用来进行CSRF攻击。


**防御CSRF攻击：**
目前防御 CSRF 攻击主要有三种策略：验证 HTTP Referer 字段；在请求地址中添加 token 并验证；在 HTTP 头中自定义属性并验证。

* 验证 HTTP Referer 字段
    * 根据 HTTP 协议，在 HTTP 头中有一个字段叫 Referer，它记录了该 HTTP 请求的来源地址。在通常情况下，访问一个安全受限页面的请求来自于同一个网站，比如需要访问 http://bank.example/withdraw?account=bob&amount=1000000&for=Mallory，用户必须先登陆 bank.example，然后通过点击页面上的按钮来触发转账事件。这时，该转帐请求的 Referer 值就会是转账按钮所在的页面的 URL，通常是以 bank.example 域名开头的地址。而如果黑客要对银行网站实施 CSRF 攻击，他只能在他自己的网站构造请求，当用户通过黑客的网站发送请求到银行时，该请求的 Referer 是指向黑客自己的网站。因此，要防御 CSRF 攻击，银行网站只需要对于每一个转账请求验证其 Referer 值，如果是以 bank.example 开头的域名，则说明该请求是来自银行网站自己的请求，是合法的。如果 Referer 是其他网站的话，则有可能是黑客的 CSRF 攻击，拒绝该请求。
    * 这种方法的显而易见的好处就是简单易行，网站的普通开发人员不需要操心 CSRF 的漏洞，只需要在最后给所有安全敏感的请求统一增加一个拦截器来检查 Referer 的值就可以。特别是对于当前现有的系统，不需要改变当前系统的任何已有代码和逻辑，没有风险，非常便捷。
    * 然而，这种方法并非万无一失。Referer 的值是由浏览器提供的，虽然 HTTP 协议上有明确的要求，但是每个浏览器对于 Referer 的具体实现可能有差别，并不能保证浏览器自身没有安全漏洞。使用验证 Referer 值的方法，就是把安全性都依赖于第三方（即浏览器）来保障，从理论上来讲，这样并不安全。事实上，对于某些浏览器，比如 IE6 或 FF2，目前已经有一些方法可以篡改 Referer 值。如果 bank.example 网站支持 IE6 浏览器，黑客完全可以把用户浏览器的 Referer 值设为以 bank.example 域名开头的地址，这样就可以通过验证，从而进行 CSRF 攻击。
    * 即便是使用最新的浏览器，黑客无法篡改 Referer 值，这种方法仍然有问题。因为 Referer 值会记录下用户的访问来源，有些用户认为这样会侵犯到他们自己的隐私权，特别是有些组织担心 Referer 值会把组织内网中的某些信息泄露到外网中。因此，用户自己可以设置浏览器使其在发送请求时不再提供 Referer。当他们正常访问银行网站时，网站会因为请求没有 Referer 值而认为是 CSRF 攻击，拒绝合法用户的访问。

 * 在请求地址中添加 token 并验证
    * CSRF 攻击之所以能够成功，是因为黑客可以完全伪造用户的请求，该请求中所有的用户验证信息都是存在于 cookie 中，因此黑客可以在不知道这些验证信息的情况下直接利用用户自己的 cookie 来通过安全验证。要抵御 CSRF，关键在于在请求中放入黑客所不能伪造的信息，并且该信息不存在于 cookie 之中。可以在 HTTP 请求中以参数的形式加入一个随机产生的 token，并在服务器端建立一个拦截器来验证这个 token，如果请求中没有 token 或者 token 内容不正确，则认为可能是 CSRF 攻击而拒绝该请求。
    * 这种方法要比检查 Referer 要安全一些，token 可以在用户登陆后产生并放于 session 之中，然后在每次请求时把 token 从 session 中拿出，与请求中的 token 进行比对，但这种方法的难点在于如何把 token 以参数的形式加入请求。对于 GET 请求，token 将附在请求地址之后，这样 URL 就变成 http://url?csrftoken=tokenvalue。 而对于 POST 请求来说，要在 form 的最后加上 <input type=”hidden” name=”csrftoken” value=”tokenvalue”/>，这样就把 token 以参数的形式加入请求了。但是，在一个网站中，可以接受请求的地方非常多，要对于每一个请求都加上 token 是很麻烦的，并且很容易漏掉，通常使用的方法就是在每次页面加载时，使用 javascript 遍历整个 dom 树，对于 dom 中所有的 a 和 form 标签后加入 token。这样可以解决大部分的请求，但是对于在页面加载之后动态生成的 html 代码，这种方法就没有作用，还需要程序员在编码时手动添加 token。
    * 该方法还有一个缺点是难以保证 token 本身的安全。特别是在一些论坛之类支持用户自己发表内容的网站，黑客可以在上面发布自己个人网站的地址。由于系统也会在这个地址后面加上 token，黑客可以在自己的网站上得到这个 token，并马上就可以发动 CSRF 攻击。为了避免这一点，系统可以在添加 token 的时候增加一个判断，如果这个链接是链到自己本站的，就在后面添加 token，如果是通向外网则不加。不过，即使这个 csrftoken 不以参数的形式附加在请求之中，黑客的网站也同样可以通过 Referer 来得到这个 token 值以发动 CSRF 攻击。这也是一些用户喜欢手动关闭浏览器 Referer 功能的原因。

* 在 HTTP 头中自定义属性并验证
    * 这种方法也是使用 token 并进行验证，和上一种方法不同的是，这里并不是把 token 以参数的形式置于 HTTP 请求之中，而是把它放到 HTTP 头中自定义的属性里。通过 XMLHttpRequest 这个类，可以一次性给所有该类请求加上 csrftoken 这个 HTTP 头属性，并把 token 值放入其中。这样解决了上种方法在请求中加入 token 的不便，同时，通过 XMLHttpRequest 请求的地址不会被记录到浏览器的地址栏，也不用担心 token 会透过 Referer 泄露到其他网站中去。
    * 然而这种方法的局限性非常大。XMLHttpRequest 请求通常用于 Ajax 方法中对于页面局部的异步刷新，并非所有的请求都适合用这个类来发起，而且通过该类请求得到的页面不能被浏览器所记录下，从而进行前进，后退，刷新，收藏等操作，给用户带来不便。另外，对于没有进行 CSRF 防护的遗留系统来说，要采用这种方法来进行防护，要把所有请求都改为 XMLHttpRequest 请求，这样几乎是要重写整个网站，这代价无疑是不能接受的。
 

### 11.2.3. SQL注入攻击

**什么是SQL注入攻击?**

SQL注入(SQL injection，SQLi)攻击是指：攻击者通过执行恶意SQL语句，来控制某个Web应用的数据库服务器，进而未经授权地访问、修改或删除各种数据。

在互联网发展的早期，构建网站曾是一个非常简单的过程：既没有JavaScript，又没有CSS，且少有图像。但是，随着各类网站的普及，人们对于先进技术和动态网站的需求也在不断增长。这就导致了JSP和PHP等服务器端脚本语言的不断发展。

同时，各类网站也开始在数据库中存储丰富的用户输入内容。如今，MySQL已经成为了访问和操作数据库的最流行、且标准化的应用。不过，黑客当然也找到了利用SQL技术漏洞的新方法，SQL注入攻击就是最常用的数据库入侵方式之一。黑客使用定制化的SQL语句来入侵数据库，以欺骗系统执行各种异常的、且不应该的操作。

**SQL注入攻击有何危害?**

在易受攻击的网站上，攻击者可以利用SQL注入实现许多操作与目的。可以说，只要客观条件满足，攻击者就能够执行如下各项操作：
* 绕过Web应用的授权机制，以提取敏感信息。
* 基于数据库中不同数据，轻松地控制应用程序的各种行为。
* 伴随着用户访问应用的过程，注入更多需要执行的恶意代码。
* 添加、修改和删除数据，破坏数据库，以及迫使应用的服务不可用。
* 在某个网站上，通过枚举以获取已注册用户的详细身份信息，并将其用于攻击其他站点。

虽然上述一切都取决于攻击者的技巧与能力，但不可否认的是，有时候SQL注入在整个攻击过程中，对他们能够成功并完全地接管数据库和Web应用起到了关键性的作用。下面我们来深入了解此类攻击是如何实现的。



**SQL注入攻击如何运作的?**

开发人员通过定义某种SQL查询，在对应的应用程序运行过程中，让数据库执行一系列操作。此类查询通常带有一到两个参数，以便根据用户所提供的合适参数值，返回预期的查询记录。

不过，SQL注入攻击会在如下两个阶段发生：
* 研究 - 攻击者提供一些随机的异常参数值，以观察应用程序将如何做出响应，进而决定进行何种攻击尝试。
* 攻击 - 在此，攻击者会提供精心设计的参数值。应用程序将解析整条SQL命令，而不仅仅是数据。然后，数据库会按照攻击者所修改意图，来执行该SQL命令。
让我们来观察一下如下示例。在登录表单的过程中，网站用户可以更改下面语句中的$user和$password参数值：

```SQL
$statement = "SELECT * FROM users WHERE username ='$user' AND password '$password'";  
```
在服务器端，这一特定的SQL语句会被传递给相应的函数，而那个函数又将该字符串发送给已连接的数据库。接着，该数据库对其进行解析、执行并返回相应的结果。

```SQL
#Define POST variables 
uname = request.POST['username'] 
passwd = request.POST['password'] 
#SQL query vulnerable to SQLi 
sql = "SELECT id FROM users WHERE username='" + uname + "' AND password='" + passwd + "'" 
#Execute the SQL statement  
database.execute(sql) 
```

那么，如果用户的输入没有得到应用程序的适当“消毒”，攻击者则可以轻松地植入精心设计的参数值。例如下面这条输入语句：

```SQL
$statement = "SELECT * FROM users WHERE username ='Dean' OR '1'='1'-- ' AND password = 'WinchesterS'";  
```
深入分析上述语句，我们可以注意到它包含的两个特殊部分：

OR'1'='1' - 是一个永远为真的条件，因此它会被应用程序无条件地接受为有效的输入。
--(双连字符) - 是告诉SQL解析器：该行的其余部分为注释，不必执行。
因此，一旦该查询被执行之后，SQL注入就能够有效地跳过密码验证，进而导致身份验证环节的缺失。而且，凭借着此类查询的记录，攻击者能够很容易地使用获取到的第一手数据库帐户，即管理员用户的信息，进而成功地登录到对应的应用程序之中。

值得注意的是，上面只是通过SQL的查询，以非正式的方式获取必要的信息。而实际上，SQL注入攻击还有许多种类型。

**SQL注入攻击有哪些不同类型?**

正所谓“条条道路通罗马”。下面我们来看看攻击者可以使用哪些类型的SQL注入漏洞，从服务器上提取数据。一般而言，SQL注入可分为如下种类：

1. 带内(In-Band)SQL注入

此类是最常见的SQL注入攻击。它通常发生在攻击者能够使用相同的通信信道，来发起攻击和收集各种结果。因此，最为常见的带内SQL注入类型分别是：

基于错误的(Error-based)SQL注入 - 这种技术是根据数据库服务器所抛出的错误异常消息，来获取有关数据库结构方面的信息。有时候，这种简单的攻击方式足以让攻击者通过枚举的手段获悉整个数据库。
基于联合的(Union-based)SQL注入 – 这种技术是利用UNION SQL操作符将两到多个SELECT语句的结果合并为一个，然后作为HTTP响应的一部分予以返回。
在上述两种注入类型中，各种数据实际上并未通过Web应用程序进行传输。因此，攻击者也就无法直观地看到攻击的结果。下面，攻击者可以通过发送有效的负载，并观察Web应用的响应，以及数据库服务器的结果行为，来对数据库结构进行重建。因此，我们称如下两种SQL注入为推理类型：

基于布尔的(Boolean-based)SQL注入 – 这种技术根据查询的返回结果是TRUE还是FALSE，来产生不同的结果。也就是说，根据结果的真伪​​，以决定HTTP响应中的内容是要被更改，还是保持不变。
基于时间的(Time-based)SQL注入 - 这种技术是在向数据库发送SQL查询的过程中，强制在数据库响应之前等待指定的时长(以秒为单位)。也就是说，某个网站的响应耗时，将能够向攻击者表明其查询结果是TRUE还是FALSE。
2. 带外(Out-of-Band)SQL注入

此类SQL注入攻击的特点是：不但最不常见，而且通常也是最难以被执行。它们通常涉及到，将各种数据直接从数据库服务器发送到由攻击者所控制的计算机上。从某种程度上说，带外技术为攻击者提供了SQL带内或盲注式攻击的替代方法，其主要针对的是服务器响应并不十分稳定的情况。

可见，服务端脚本(server-scripting)语言并不能够确定SQL查询字符串是否存在着格式错误。他们所能做的只是将某个字符串发送到数据库服务器上，并等待解析的完成与响应。不过话说回来，我们总能找到各种办法来对用户的输入进行“消毒”，并确保SQL注入攻击无法得逞。

**如何防御SQL注入攻击?**

现如今，我们有许多种简单的方法，以避免网站陷入SQL注入攻击，并抑制它们可能造成的危害。下面，我们仅列举其中的一小部分：

* 通过使用静态和动态测试，定期检查并发现应用程序中的SQL注入漏洞。
* 通过使用参数化查询和对象关系映射(Object Relational Mappers，ORM)，来避免和修复注入漏洞。此类查询通过指定参数的占位符，以便数据库始终将它们视为数据，而非SQL命令的一部分。
* 使用转义字符，来修复SQL注入漏洞，以便忽略掉一些特殊字符。
* 通过对数据库强制执行最小权限原则，来减缓SQL注入漏洞的影响。籍此，应用程序的每一个软件组件都只能访问、并仅影响它所需要的资源。
* 对访问数据库的Web应用程序采用Web应用防火墙(Web Application Firewall，WAF)。这有助于识别出针对SQL注入的各种尝试，进而防止此类尝试作用到应用程序上。


### 11.2.4. 文件上传漏洞
<a href="#menu" style="float:right">目录</a>

**基本概念**
恶意攻击者利用一些网站站点没有对上传的文件进行完善的校验漏洞，上传一些可执行文件或者脚本，并且通过脚本获取服务器上相应的权利。或者通过诱导其他用户下载并运行上传的恶意文件，最终达到攻击的目的。

由于上传的文件后缀名是可以进行更改的，对于上传的文件，不能通过文件后缀名进行判断。可以通过文件模数进行判断。

```
JPEG (jpg)，文件头：FFD8FF 
PNG (png)，文件头：89504E47 
GIF (gif)，文件头：47494638 
TIFF (tif)，文件头：49492A00 
Windows Bitmap (bmp)，文件头：424D 
CAD (dwg)，文件头：41433130 
Adobe Photoshop (psd)，文件头：38425053 
Rich Text Format (rtf)，文件头：7B5C727466 
XML (xml)，文件头：3C3F786D6C 
HTML (html)，文件头：68746D6C3E 
Email [thorough only] (eml)，文件头：44656C69766572792D646174653A 
Outlook Express (dbx)，文件头：CFAD12FEC5FD746F 
Outlook (pst)，文件头：2142444E 
MS Word/Excel (xls.or.doc)，文件头：D0CF11E0 
MS Access (mdb)，文件头：5374616E64617264204A 
WordPerfect (wpd)，文件头：FF575043 
Postscript (eps.or.ps)，文件头：252150532D41646F6265 
Adobe Acrobat (pdf)，文件头：255044462D312E 
Quicken (qdf)，文件头：AC9EBD8F 
Windows Password (pwl)，文件头：E3828596 
ZIP Archive (zip)，文件头：504B0304 
RAR Archive (rar)，文件头：52617221 
Wave (wav)，文件头：57415645 
AVI (avi)，文件头：41564920 
Real Audio (ram)，文件头：2E7261FD 
Real Media (rm)，文件头：2E524D46 
MPEG (mpg)，文件头：000001BA 
MPEG (mpg)，文件头：000001B3 
Quicktime (mov)，文件头：6D6F6F76 
Windows Media (asf)，文件头：3026B2758E66CF11 
MIDI (mid)，文件头：4D546864 
```

### 11.2.5. DOS攻击
<a href="#menu" style="float:right">目录</a>

**定义**
分布式拒绝服务攻击(英文意思是Distributed Denial of Service，简称DDoS)是指处于不同位置的多个攻击者同时向一个或数个目标发动攻击，或者一个攻击者控制了位于不同位置的多台机器并利用这些机器对受害者同时实施攻击。由于攻击的发出点是分布在不同地方的，这类攻击称为分布式拒绝服务攻击，其中的攻击者可以有多个。

**攻击原理**
分布式拒绝服务攻击原理分布式拒绝服务攻击DDoS是一种基于DoS的特殊形式的拒绝服务攻击，是一种分布的、协同的大规模攻击方式。单一的DoS攻击一般是采用一对一方式的，它利用网络协议和操作系统的一些缺陷，采用欺骗和伪装的策略来进行网络攻击，使网站服务器充斥大量要求回复的信息，消耗网络带宽或系统资源，导致网络或系统不胜负荷以至于瘫痪而停止提供正常的网络服务。与DoS攻击由单台主机发起攻击相比较，分布式拒绝服务攻击DDoS是借助数百、甚至数千台被入侵后安装了攻击进程的主机同时发起的集团行为
一个完整的DDoS攻击体系由攻击者、主控端、代理端和攻击目标四部分组成。主控端和代理端分别用于控制和实际发起攻击，其中主控端只发布命令而不参与实际的攻击，代理端发出DDoS的实际攻击包。对于主控端和代理端的计算机，攻击者有控制权或者部分控制权．它在攻击过程中会利用各种手段隐藏自己不被别人发现。真正的攻击者一旦将攻击的命令传送到主控端，攻击者就可以关闭或离开网络．而由主控端将命令发布到各个代理主机上。这样攻击者可以逃避追踪。每一个攻击代理主机都会向目标主机发送大量的服务请求数据包，这些数据包经过伪装，无法识别它的来源，而且这些数据包所请求的服务往往要消耗大量的系统资源，造成目标主机无法为用户提供正常服务。甚至导致系统崩溃。

**分类**
* 基于自动化程度分类
    * 手工的DDoS攻击。
        * 早期的DDoS攻击全是采用手动配置的，即发动DDoS攻击时，扫描远端有漏洞的计算机，侵入它们并且安装代码全是手动完成的。
    * 半自动化的DDoS攻击。
        * 在半自动化的攻击中，DDoS攻击属于主控端一代理端的攻击模型，攻击者用自动化的Scripts来扫描，主控端的机器对主控端和代理端之间进行协商攻击的类型、受害者的地址、何时发起攻击等信息由进行详细记录。
    * 自动化的DDoS攻击。
        * 在这类攻击中。攻击者和代理端机器之间的通信是绝对不允许的。这类攻击的攻击阶段绝大部分被限制用一个单一的命令来实现，攻击的所有特征，例如攻击的类型，持续的时间和受害者的地址在攻击代码中都预先用程序实现。
* 基于系统及协议的弱点分类
    * 洪水攻击。
        在洪水攻击中。傀儡机向受害者系统发送大量的数据流为了充塞受害者系统的带宽，影响小的则降低受害者提供的服务，影响大的则使整个网络带宽持续饱和，以至于网络服务瘫痪。典型的洪水攻击有UDP洪水攻击和ICMP洪水攻击。 
    * 扩大攻击。
        * 扩大攻击分为两种，一种是利用广播lP地址的特性，一种是利用反射体来发动攻击。前一种攻击者是利用了广播IP地址的特性来扩大和映射攻击，导致路由器将数据包发送到整个网络的广播地址列表中的所有的广播IP地址。这些恶意的流量将减少受害者系统可提供的带宽。典型的扩大攻击有Smurf和Fraggle攻击。 
    * 利用协议的攻击。
        * 该类攻击则是利用某些协议的特性或者利用了安装在受害者机器上的协议中存在的漏洞来耗尽它的大量资源。典型的利用协议攻击的例子是TCP SYN攻击。 
    * 畸形数据包攻击。
        * 攻击者通过向受害者发送不正确的IP地址的数据包，导致受害系统崩溃。畸形数据包攻击可分为两种类型：IP地址攻击和IP数据包属性攻击。 
* 基于攻击速率分类
    * DDoS攻击从基于速率上进行分类，可以分为持续速率和可变速率的攻击。持续速率的攻击是指只要开始发起攻击，就用全力不停顿也不消减力量。像这种攻击的影响是非常快的。可变速率的攻击，从名字就可以看出，用不同的攻击速率，基于这种速率改变的机制，可以把这种攻击分为增加速率和波动的速率。 
* 基于影响力进行分类
    * DDoS攻击从基于影响力方面可以分为网络服务彻底崩溃和降低网络服务的攻击。服务彻底崩溃的攻击将导致受害者的服务器完全拒绝对客户端提供服务。降低网络服务的攻击，消耗受害者系统的一部分资源，这将延迟攻击被发现的时间，同时对受害者造成一定的破坏。 
* 基于入侵目标分类
    * DDoS攻击从基于入侵目标，可以将DDoS攻击分为带宽攻击和连通性攻击，带宽攻击通过使用大量的数据包来淹没整个网络，使得有效的网络资源被浪费，合法朋户的请求得不到响应，大大降低了效率。而连通性攻击是通过发送大量的请求来使的计算机瘫痪，所有有效的操作系统资源被耗尽，导致计算机不能够再处理合法的用户请求。 
* 基于攻击路线分类
    * 直接攻击：攻击者和主控端通信，主控端接到攻击者的命令后，再控制代理端向受害者发动攻击数据流。代理端向受害者系统发送大量的伪IP地址的网络数据流，这样攻击者很难被追查到。  
    * 反复式攻击通过利用反射体，发动更强大的攻击流。反射体是任何一台主机只要发送一个数据包就能收到一个数据包，反复式攻击就是攻击者利用中间的网络节点发动攻击。 
* 基于攻击特征分类
    * 从攻击特征的角度，可以将DDoS攻击分为攻击行为特征可提取和攻击行为特征不可提取两类。攻击行为特征可提取的DDoS攻击又可以细分为可过滤型和不可过滤型。可过滤型的DDoS攻击主要指那些使用畸形的非法数据包。不可过滤型DDoS攻击通过使用精心设计的数据包，模仿合法用户的正常请求所用的数据包，一旦这类数据包被过滤将会影响合法用户的正常使用。

**攻击现象**
DDoS的表现形式主要有两种，一种为流量攻击，主要是针对网络带宽的攻击，即大量攻击包导致网络带宽被阻塞，合法网络包被虚假的攻击包淹没而无法到达主机；另一种为资源耗尽攻击，主要是针对服务器主机的攻击，即通过大量攻击包导致主机的内存被耗尽或CPU被内核及应用程序占完而造成无法提供网络服务。当被DDoS攻击时，主要表现为： 
(1)被攻击主机上有大量等待的TCP连接。 
(2)网络中充斥着大量的无用的数据包，源地址为假。  
(3)制造高流量无用数据，造成网络拥塞，使受害主机无法正常和外界通讯。 
(4)利用受害主机提供的服务或传输协议上的缺陷，反复高速地发出特定的服务请求，使受害主机无法及时处理所有正常请求。 
(5)严重时会造成系统死机。

**攻击流程**
攻击者进行一次DDoS攻击大概需要经过了解攻击目标、攻占傀儡机、实际攻击三个主要步骤，下面依次说明每一步骤的具体过程： 
1、了解攻击目标就是对所要攻击的目标有一个全面和准确的了解，以便对将来的攻击做到心中有数。主要关心的内容包括被攻击目标的主机数目、地址情况。目标主机的配置、性能、目标的带宽等等。对于DDoS攻击者来说，攻击互联网上的某个站点，有一个重点就是确定到底有多少台主机在支持这个站点，一个大的网站可能有很多台主机利用负载均衡技术提供服务。所有这些攻击目标的信息都关系到后面两个阶段的实施目标和策略，如果盲目的发动DDoS攻击就不能保证攻击目的的完成，还可能过早的暴露攻击者的身份，所以了解攻击目标是有经验的攻击者必经的步骤。 
2、攻占傀儡主机就是控制尽可能多的机器，然后安装相应的攻击程序。在主控机上安装控制攻击的程序，而攻击机则安装DDoS攻击的发包程序。攻击者最感兴趣，也最有可能成为别人的傀儡主机的机器包括那些链路状态好、性能好同时安全管理水平差的主机。攻击者一般会利用已有的或者未公布的一些系统或者应用软件的漏洞．取得一定的控制权，起码可以安装攻击实施所需要的程序，更厉害的可能还会取得最高控制权、留下后门等等。在早期的DDoS攻击过程中，攻占傀儡主机这一步主要是攻击者自己手动完成的，亲自扫描网络，发现安全性比较差的主机，将其攻占并且安装攻击程序。但是后来随着DDoS攻击和蠕虫的融合，攻占傀儡机变成了一个自动化的过程，攻击者只要将蠕虫放入网络中，蠕虫就会在不断扩散中不停地攻占主机，这样所能联合的攻击机将变得非常巨大，DDoS攻击的威力更大。 
3、DDoS攻击的最后一个阶段就是实际的攻击过程，攻击者通过主控机向攻击机发出攻击指令，或者按照原先设定好的攻击时间和目标，攻击机不停的向目标或者反射服务器发送大量的攻击包，来吞没被攻击者，达到拒绝服务的最终日的。和前两个过程相比，实际攻击过程倒是最简单的一个阶段，一些有经验的攻击者可能还会在攻击的同时通过各种手段检查攻击效果，甚至在攻击过程中动态调整攻击策略，尽可能清除在主控机和攻击机上留下的蛛丝马迹。 

**攻击方式**
1、SYN Flood攻击
SYN Flood攻击是当前网络上最为常见的DDoS攻击，它利用了TCP协议实现上的一个缺陷。通过向网络服务所在端口发送大量的伪造源地址的攻击报文，就可能造成目标服务器中的半开连接队列被占满，从而阻止其他合法用户进行访问。 
2、UDP Flood攻击
UDP Flood是日渐猖厥的流量型DDoS攻击，原理也很简单。常见的情况是利用大量UDP小包冲击DNS服务器或Radius认证服务器、流媒体视频服务器。由于UDP协议是一种无连接的服务，在UDP Flood攻击中，攻击者可发送大量伪造源IP地址的小UDP包。 
3、ICMP Flood攻击
ICMP Flood攻击属于流量型的攻击方式，是利用大的流量给服务器带来较大的负载，影响服务器的正常服务。由于目前很多防火墙直接过滤ICMP报文。因此ICMP Flood出现的频度较低。 [7] 
4、Connection Flood攻击
Connection Flood是典型的利用小流量冲击大带宽网络服务的攻击方式，这种攻击的原理是利用真实的IP地址向服务器发起大量的连接。并且建立连接之后很长时间不释放，占用服务器的资源，造成服务器上残余连接(WAIT状态)过多，效率降低，甚至资源耗尽，无法响应其他客户所发起的链接。  
5、HTTP Get攻击
这种攻击主要是针对存在ASP、JSP、PHP、CGI等脚本程序，特征是和服务器建立正常的TCP连接，并不断的向脚本程序提交查询、列表等大量耗费数据库资源的调用。这种攻击的特点是可以绕过普通的防火墙防护，可通过Proxy代理实施攻击，缺点是攻击静态页面的网站效果不佳，会暴露攻击者的lP地址。 
6、UDP DNS Query Flood攻击
UDP DNS Query Flood攻击采用的方法是向被攻击的服务器发送大量的域名解析请求，通常请求解析的域名是随机生成或者是网络世界上根本不存在的域名。域名解析的过程给服务器带来了很大的负载，每秒钟域名解析请求超过一定的数星就会造成DNS服务器解析域名超时。 

**应对策略**
* 防御措施
    * 不但是对DDoS，而且是对于所有网络的攻击，都应该是采取尽可能周密的防御措施，同时加强对系统的检测，建立迅速有效的应对策略。应该采取的防御措施有： 
        * (1)全面综合地设计网络的安全体系，注意所使用的安全产品和网络设备。 
        * (2)提高网络管理人员的素质，关注安全信息，遵从有关安全措施，及时地升级系统，加强系统抗击攻击的能力。
        * (3)在系统中加装防火墙系统，利用防火墙系统对所有出入的数据包进行过滤，检查边界安全规则，确保输出的包受到正确限制。 
        * (4)优化路由及网络结构。对路由器进行合理设置，降低攻击的可能性。 
        * (5)优化对外提供服务的主机，对所有在网上提供公开服务的主机都加以限制。 
        * (6)安装入侵检测工具(如NIPC、NGREP)，经常扫描检查系统，解决系统的漏洞，对系统文件和应用程序进行加密，并定期检查这些文件的变化。 
* 防御原则
    * 在响应方面，虽然还没有很好的对付攻击行为的方法，但仍然可以采取措施使攻击的影响降至最小。对于提供信息服务的主机系统，应对的根本原则是： 
    * 尽可能地保持服务、迅速恢复服务。由于分布式攻击入侵网络上的大量机器和网络设备，所以要对付这种攻击归根到底还是要解决网络的整体安全问题。真正解决安全问题一定要多个部门的配合，从边缘设备到骨干网络都要认真做好防范攻击的准备，一旦发现攻击就要及时地掐断最近攻击来源的那个路径，限制攻击力度的无限增强。网络用户、管理者以及ISP之间应经常交流，共同制订计划，提高整个网络的安全性。 



## 11.3. 常见的安全算法
<a href="#menu" style="float:right">目录</a>

### 11.3.1. 数字摘要
<a href="#menu" style="float:right">目录</a>

对数据(文件字节流/消息字节流)进行类似的HASH算法之后获取到的固定长度的值(摘要)，如果原数据被修改，校验时的摘要将无法进行匹配。
摘要一般是单向的，无法从摘要值获取原数据。

常用的摘要算法
* MD5
    * 128位，不可逆
    * JDK实现MessageDigest
    * MessageDigest md5 = MessageDigest.getInstance("MD5");
* SHA
    * 安全散列算法
    * 160位，比MD5慢，但是更安全
    * JDK实现MessageDigest
    * MessageDigest md5 = MessageDigest.getInstance("SHA-1");

由于计算出的摘要可能包含无法显示和网络传输的控制字符。因此需要对生成的摘要进行编码
* 16进制编码
```java
public static String bytesToHex(byte[] bytes) {  
    StringBuffer sb = new StringBuffer();  
    for(int i = 0; i < bytes.length; i++) {  
        String hex = Integer.toHexString(bytes[i] & 0xFF);  
        if(hex.length() < 2){  
            sb.append(0);  
        }  
        sb.append(hex);  
    }  
    return sb.toString();  
} 
public static byte[] hexToByteArray(String inHex){  
    int hexlen = inHex.length();  
    byte[] result;  
    if (hexlen % 2 == 1){  
        //奇数  
        hexlen++;  
        result = new byte[(hexlen/2)];  
        inHex="0"+inHex;  
    }else {  
        //偶数  
        result = new byte[(hexlen/2)];  
    }  
    int j=0;  
    for (int i = 0; i < hexlen; i+=2){  
        result[j]=hexToByte(inHex.substring(i,i+2));  
        j++;  
    }  
    return result;   
}  

```
* BASE64编码
JDK有提供相关的类。


### 11.3.2. 对称加密算法
<a href="#menu" style="float:right">目录</a>
对称加密算法 是应用较早的加密算法，又称为 共享密钥加密算法。在 对称加密算法 中，使用的密钥只有一个，发送 和 接收 双方都使用这个密钥对数据进行 加密 和 解密。这就要求加密和解密方事先都必须知道加密的密钥。

* 数据加密过程：在对称加密算法中，数据发送方 将 明文 (原始数据) 和 加密密钥 一起经过特殊 加密处理，生成复杂的 加密密文 进行发送。
* 数据解密过程：数据接收方 收到密文后，若想读取原数据，则需要使用 加密使用的密钥 及相同算法的 逆算法 对加密的密文进行解密，才能使其恢复成 可读明文。

**常见的对称加密算法**
* DES
* 3DES
* AES




### 11.3.3. 非对称加密算法
<a href="#menu" style="float:right">目录</a>

非对称加密算法，又称为公开密钥加密算法。它需要两个密钥，一个称为公开密钥 (public key)，即公钥，另一个称为私有密钥 (private key)，即私钥。因为加密和解密使用的是两个不同的密钥，所以这种算法称为非对称加密算法。
* 如果使用 公钥 对数据 进行加密，只有用对应的 私钥 才能 进行解密。
* 如果使用 私钥 对数据 进行加密，只有用对应的 公钥 才能 进行解密。

**常见的对称加密算法**
* RSA


### 11.3.4. 数字签名
<a href="#menu" style="float:right">目录</a>

### 11.3.5. 数字证书
<a href="#menu" style="float:right">目录</a>















  




                                


 

