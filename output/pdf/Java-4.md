
<span id="menu">


<!-- TOC -->

- [1. Kafka](#1-kafka)
    - [1.1. 概述](#11-概述)
        - [1.1.1. 架构](#111-架构)
        - [1.1.2. 基本概念](#112-基本概念)
        - [1.1.3. 快速理解](#113-快速理解)
    - [1.2. 安装配置](#12-安装配置)
        - [1.2.1. 安装&&启动](#121-安装启动)
        - [1.2.2. 配置](#122-配置)
    - [1.3. Kafka生产者](#13-kafka生产者)
        - [1.3.1. 生产者例子](#131-生产者例子)
        - [1.3.2. 生产者配置](#132-生产者配置)
        - [1.3.3. 序列化器](#133-序列化器)
        - [1.3.4. 分区](#134-分区)
    - [1.4. Kafka消费者](#14-kafka消费者)
        - [1.4.1. 消费者和消费者群组](#141-消费者和消费者群组)
        - [1.4.2. 消费者实例](#142-消费者实例)
        - [1.4.3. 消费者配置](#143-消费者配置)
        - [1.4.4. 提交和偏移量](#144-提交和偏移量)
            - [1.4.4.1. 自动提交](#1441-自动提交)
            - [1.4.4.2. 提交当前偏移量](#1442-提交当前偏移量)
            - [1.4.4.3. 异步提交](#1443-异步提交)
            - [1.4.4.4. 同步和异步组合提交](#1444-同步和异步组合提交)
            - [1.4.4.5. 提交特定的偏移量](#1445-提交特定的偏移量)
        - [1.4.5. 再均衡监听器](#145-再均衡监听器)
        - [1.4.6. 从特定偏移量处开始处理](#146-从特定偏移量处开始处理)
        - [1.4.7. 如何退出](#147-如何退出)
        - [1.4.8. 独立消费者](#148-独立消费者)
    - [1.5. 深入Kafka](#15-深入kafka)
        - [1.5.1. 集群成员关系](#151-集群成员关系)
        - [1.5.2. 控制器](#152-控制器)
        - [1.5.3. 协调器](#153-协调器)
        - [1.5.4. 网络通信服务](#154-网络通信服务)
        - [1.5.5. 日志管理](#155-日志管理)
            - [1.5.5.1. 日志结构](#1551-日志结构)
            - [1.5.5.2. 日志管理器启动过程](#1552-日志管理器启动过程)
            - [1.5.5.3. 日志加载及恢复](#1553-日志加载及恢复)
            - [1.5.5.4. 日志清理](#1554-日志清理)
        - [1.5.6. 复制](#156-复制)
        - [1.5.7. 处理请求](#157-处理请求)
        - [1.5.8. 生产请求](#158-生产请求)
        - [1.5.9. 获取请求](#159-获取请求)
        - [1.5.10. 其他请求](#1510-其他请求)
        - [1.5.11. 物理存储](#1511-物理存储)
    - [1.6. 可靠的数据传递](#16-可靠的数据传递)
        - [1.6.1. 可靠性保证](#161-可靠性保证)
        - [1.6.2. 复制](#162-复制)
        - [1.6.3. broker配置](#163-broker配置)
        - [1.6.4. 在可靠的系统里使用生产者](#164-在可靠的系统里使用生产者)
        - [1.6.5. 在可靠的系统里使用消费者](#165-在可靠的系统里使用消费者)
        - [1.6.6. 验证系统可靠性](#166-验证系统可靠性)
    - [1.7. 构建数据管道](#17-构建数据管道)
    - [1.8. 跨越集群数据镜像](#18-跨越集群数据镜像)
        - [1.8.1. 跨集群镜像的使用场景](#181-跨集群镜像的使用场景)
        - [1.8.2. 多集群架构](#182-多集群架构)
    - [1.9. 管理Kafaka](#19-管理kafaka)
    - [1.10. 监控Kafka](#110-监控kafka)
        - [1.10.1. broker的度量指标](#1101-broker的度量指标)
        - [1.10.2. 非同步分区](#1102-非同步分区)
        - [1.10.3. broker度量指标](#1103-broker度量指标)
        - [1.10.4. 主题和分区的度量指标](#1104-主题和分区的度量指标)
        - [1.10.5. Java虚拟机监控](#1105-java虚拟机监控)
        - [1.10.6. 操作系统监控](#1106-操作系统监控)
        - [1.10.7. 日志](#1107-日志)
        - [1.10.8. 客户端监控](#1108-客户端监控)
        - [1.10.9. 生产者度量指标](#1109-生产者度量指标)
        - [1.10.10. 消费者度量指标](#11010-消费者度量指标)
        - [1.10.11. 配额](#11011-配额)
        - [1.10.12. 延迟监控](#11012-延迟监控)
        - [1.10.13. 端到端监控](#11013-端到端监控)
    - [1.11. 流式处理](#111-流式处理)
        - [1.11.1. 什么是流式处理](#1111-什么是流式处理)
        - [1.11.2. 流式处理的概念](#1112-流式处理的概念)
        - [1.11.3. 使用场景](#1113-使用场景)
        - [1.11.4. 流式处理的设计模式](#1114-流式处理的设计模式)
        - [1.11.5. 实例](#1115-实例)
        - [1.11.6. 架构概览](#1116-架构概览)
        - [1.11.7. 如何选择流式处理框架](#1117-如何选择流式处理框架)
- [2. RocketMQ消息中间件](#2-rocketmq消息中间件)
    - [2.1. 基本介绍](#21-基本介绍)
        - [2.1.1. 模块说明](#211-模块说明)
        - [2.1.2. 配置参数](#212-配置参数)
        - [2.1.3. 底层通信实现](#213-底层通信实现)
        - [2.1.4. RocketMQ源代码的目录结构](#214-rocketmq源代码的目录结构)
        - [2.1.5. 设计理念](#215-设计理念)
        - [2.1.6. 设计目标](#216-设计目标)
        - [2.1.7. 常用面试题](#217-常用面试题)
    - [2.2. 安装配置](#22-安装配置)
    - [2.3. 基本使用](#23-基本使用)
        - [2.3.1. **基本的例子**](#231-基本的例子)
        - [2.3.2. **顺序发送**](#232-顺序发送)
        - [2.3.3. **广播发送**](#233-广播发送)
        - [2.3.4. **定时发送**](#234-定时发送)
        - [2.3.5. **批量发送**](#235-批量发送)
        - [2.3.6. **过滤**](#236-过滤)
        - [2.3.7. **日志appender**](#237-日志appender)
        - [2.3.8. **事务消息**](#238-事务消息)
    - [2.4. 协调者NameServer](#24-协调者nameserver)
        - [2.4.1. 路由元信息](#241-路由元信息)
    - [2.5. 生产者](#25-生产者)
        - [2.5.1. 消息发送方式](#251-消息发送方式)
        - [2.5.2. 生产者API](#252-生产者api)
        - [2.5.3. 队列选择器](#253-队列选择器)
        - [2.5.4. 发送流程分析](#254-发送流程分析)
        - [2.5.5. 默认的队列选择](#255-默认的队列选择)
    - [2.6. 消费者](#26-消费者)
        - [2.6.1. 消息消费概述](#261-消息消费概述)
        - [2.6.2. 消息消费推/拉方式](#262-消息消费推拉方式)
        - [2.6.3. 提高 Consumer 处理能力](#263-提高-consumer-处理能力)
        - [2.6.4. Consumer 的负载均衡](#264-consumer-的负载均衡)
        - [2.6.5. 定时消息](#265-定时消息)
    - [2.7. 消息存储](#27-消息存储)
        - [2.7.1. 消息存储结构](#271-消息存储结构)
        - [2.7.2. 消息队列与索引文件恢复](#272-消息队列与索引文件恢复)
            - [2.7.2.1. Broker 正常停止文件恢复](#2721-broker-正常停止文件恢复)
            - [2.7.2.2. Broker 异常停止文件恢复](#2722-broker-异常停止文件恢复)
        - [2.7.3. 文件刷盘机制](#273-文件刷盘机制)
        - [2.7.4. 过期文件删除机制](#274-过期文件删除机制)
    - [2.8. 高可用机制](#28-高可用机制)
        - [2.8.1. 动态增减broker](#281-动态增减broker)
        - [2.8.2. 各种故障对消息的影响](#282-各种故障对消息的影响)
    - [2.9. 顺序消息](#29-顺序消息)
    - [2.10. 消息饥饿问题](#210-消息饥饿问题)
    - [2.11. 消息过滤](#211-消息过滤)
    - [2.12. 事务消息](#212-事务消息)
        - [2.12.1. 事务实现思想](#2121-事务实现思想)
        - [2.12.2. 事务消息发送流程](#2122-事务消息发送流程)
        - [2.12.3. 提交或者回滚事务](#2123-提交或者回滚事务)
        - [2.12.4. 事务消息回查事务状态](#2124-事务消息回查事务状态)
    - [2.13. 基于Netty的通信实现](#213-基于netty的通信实现)
- [3. Zookeeper](#3-zookeeper)
    - [3.1. 基本概念](#31-基本概念)
        - [3.1.1. zk架构](#311-zk架构)
        - [3.1.2. 提供的功能](#312-提供的功能)
        - [3.1.3. 节点类型](#313-节点类型)

<!-- /TOC -->
<a id="markdown-1-kafka" name="1-kafka"></a>
# 1. Kafka

<a id="markdown-11-概述" name="11-概述"></a>
## 1.1. 概述
<a href="#menu" style="float:right">目录</a>

<a id="markdown-111-架构" name="111-架构"></a>
### 1.1.1. 架构
<a href="#menu" style="float:right">目录</a>
![](https://images2018.cnblogs.com/blog/1385722/201808/1385722-20180804221732434-2116774825.png)




<a id="markdown-112-基本概念" name="112-基本概念"></a>
### 1.1.2. 基本概念
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

    
<a id="markdown-113-快速理解" name="113-快速理解"></a>
### 1.1.3. 快速理解
<a href="#menu" style="float:right">目录</a>


<a id="markdown-12-安装配置" name="12-安装配置"></a>
## 1.2. 安装配置
<a href="#menu" style="float:right">目录</a>

<a id="markdown-121-安装启动" name="121-安装启动"></a>
### 1.2.1. 安装&&启动

**安装JDK环境**
**安装ZOOKEEPER**
**安装Kafka**

* 从[官网 http://kafka.apache.org/downloads](http://kafka.apache.org/downloads)下载安装包

**启动**

```bash
./kafka-server-start.sh  -daemon  ../config/server.properties
```



<a id="markdown-122-配置" name="122-配置"></a>
### 1.2.2. 配置

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
            

<a id="markdown-13-kafka生产者" name="13-kafka生产者"></a>
## 1.3. Kafka生产者
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

<a id="markdown-131-生产者例子" name="131-生产者例子"></a>
### 1.3.1. 生产者例子
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


<a id="markdown-132-生产者配置" name="132-生产者配置"></a>
### 1.3.2. 生产者配置
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
    
<a id="markdown-133-序列化器" name="133-序列化器"></a>
### 1.3.3. 序列化器
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

<a id="markdown-134-分区" name="134-分区"></a>
### 1.3.4. 分区
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


<a id="markdown-14-kafka消费者" name="14-kafka消费者"></a>
## 1.4. Kafka消费者
<a href="#menu" style="float:right">目录</a>

<a id="markdown-141-消费者和消费者群组" name="141-消费者和消费者群组"></a>
### 1.4.1. 消费者和消费者群组
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

<a id="markdown-142-消费者实例" name="142-消费者实例"></a>
### 1.4.2. 消费者实例
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
<a id="markdown-143-消费者配置" name="143-消费者配置"></a>
### 1.4.3. 消费者配置
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
    
<a id="markdown-144-提交和偏移量" name="144-提交和偏移量"></a>
### 1.4.4. 提交和偏移量
<a href="#menu" style="float:right">目录</a>

* Kafka不会像其他JMS队列那样需要得到消费者的确认，消费者可以使用Kafka来追踪消息在分区里的位置(偏移量)

* **提交:** 更新当前位置的操作叫做提交
* 消费者是往_consumer_offset的特殊主题上发送消息，消息包含每个分区的偏移量
    * 如果消费者一直处于运行状态，那么偏移量就没有什么用处
    * 如果发生再均衡之后，消费者可能分到新的分区，就需要从_consumer_offset上读取该分区的偏移量
* 如果提交的偏移量小于客户端处理的最后一个消息的偏移量，那么处于两个偏移量之间的消息会被重复处理
* 如果提交的偏移量大于客户端处理的最后一个消息的偏移量，那么处于两个偏移量之间的消息会丢失


<a id="markdown-1441-自动提交" name="1441-自动提交"></a>
#### 1.4.4.1. 自动提交 
<a href="#menu" style="float:right">目录</a>

* enable.auto.commit为true时
    * 消费者会自动把从poll方法接收到的最大偏移量提交上去，提交时间间隔由auto.commit.interval.ms控制默认值是5s
    * 存在的问题
        * 提交之前发生再均衡，将会出现重复消费的问题
* 以下几种方式需要设置enable.auto.commit为false


<a id="markdown-1442-提交当前偏移量" name="1442-提交当前偏移量"></a>
#### 1.4.4.2. 提交当前偏移量
<a href="#menu" style="float:right">目录</a>

Consumer类
```java
void commitSync();
void commitSync(Duration var1);
void commitSync(Map<TopicPartition, OffsetAndMetadata> var1);
void commitSync(Map<TopicPartition, OffsetAndMetadata> var1, Duration var2);
```
以上便是消费者同步提交的API，在broker返回响应之前将阻塞

<a id="markdown-1443-异步提交" name="1443-异步提交"></a>
#### 1.4.4.3. 异步提交
<a href="#menu" style="float:right">目录</a>

```java
void commitAsync();
void commitAsync(OffsetCommitCallback var1);
void commitAsync(Map<TopicPartition, OffsetAndMetadata> var1, OffsetCommitCallback var2);
```
* 提交时不会进行阻塞。
* 在成功提交或碰到无法恢复的错误之前，commitSync将会一直重试，而commitAsync不会，因为它收到broker响应之前，可能有一个更大的偏移量提交上去，如果进行重试，将会发生重复消费的问题
* 可以使用序号记录每次提交，在回调函数里面检查序号大小，如果没有更新的提交，则可以进行重试。

<a id="markdown-1444-同步和异步组合提交" name="1444-同步和异步组合提交"></a>
#### 1.4.4.4. 同步和异步组合提交
<a href="#menu" style="float:right">目录</a>
try 里面执行异步提交
finnally 里面执行同步提交


<a id="markdown-1445-提交特定的偏移量" name="1445-提交特定的偏移量"></a>
#### 1.4.4.5. 提交特定的偏移量
<a href="#menu" style="float:right">目录</a>

* 以上的无参方法提交的都是最后一次的偏移量
* 可以使用参数Map<TopicPartition, OffsetAndMetadata> var1 来自定义提交的偏移量。
* 使用场景是消费者收到很多消息，需要在很多时间处理，需要在处理的中间进行提交，防止再均衡导致的重消费问题。

<a id="markdown-145-再均衡监听器" name="145-再均衡监听器"></a>
### 1.4.5. 再均衡监听器
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
    


<a id="markdown-146-从特定偏移量处开始处理" name="146-从特定偏移量处开始处理"></a>
### 1.4.6. 从特定偏移量处开始处理
<a href="#menu" style="float:right">目录</a>

```java
//指定位置
void seek(TopicPartition var1, long var2);
//分区起始位置
void seekToBeginning(Collection<TopicPartition> var1);
//分区末尾位置
void seekToEnd(Collection<TopicPartition> var1);

```

<a id="markdown-147-如何退出" name="147-如何退出"></a>
### 1.4.7. 如何退出
<a href="#menu" style="float:right">目录</a>

consumer.wakeup()调用时，可以退出poll循环，并抛出WakeupException异常，不需要处理，因为这个异常只是为了退出poll循环

<a id="markdown-148-独立消费者" name="148-独立消费者"></a>
### 1.4.8. 独立消费者
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


<a id="markdown-15-深入kafka" name="15-深入kafka"></a>
## 1.5. 深入Kafka
<a href="#menu" style="float:right">目录</a>


<a id="markdown-151-集群成员关系" name="151-集群成员关系"></a>
### 1.5.1. 集群成员关系
<a href="#menu" style="float:right">目录</a>

* kafka使用zookeeper来维护集群成员的信息
* 每个broker都有一个唯一的标识符broker ID，这个标识符可以配置文件指定，也可以自动生成，在启动时，通过创建临时节点把自己的ID注册到Zookeeper（/brokers/ids）
* 在broker停机，出现网络分区或长时间垃圾回收停顿时，broker会从Zookeeper上断开连接



<a id="markdown-152-控制器" name="152-控制器"></a>
### 1.5.2. 控制器
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

<a id="markdown-153-协调器" name="153-协调器"></a>
### 1.5.3. 协调器
Kafka 提供了消费者协调器（ ConsumerCoordinator ）、组协调器 （ roupCoordinator ）和任务管理协调器 C WorkCoordinator) 3 种协调器（ coordinator ） 。 其中任务管理协调器被 Kafka Conn巳ct用于对 works 的管理，本书不进行介绍，我们重点关注的是消费者协调器和组协调器，这两种协调器与消费者密切相关。
Kafka 的高级消费者即通过 ZooKeeperConsumerConnector 实现的消费者是强依赖于 ZooKeeper的，每一个消费者启动时都会在 ZooKeeper 的／consumers/${group.id }/ids 上注册消费者的客户端id ，即$ {client. id｝，会在该路径以及/brokers/i ds 路径下注册监昕器，用于当代理或是消费者发生变化时，消费者进行平衡操作 。 由于这种方式是每一个消费者对 ZooKeeper 路径分别进行监听，当发生平衡操作时 ， 一个消费组下的所有消费者同时会触发平衡操作，而消费者之间井不知道其他消费者平衡操作的结果，这样就可能导致 Kafka 工作在一个不正确的状态 。 同时这种方式完全依赖于 ZooKeeper，以监听的方式来管理消费者，存在以下两个缺陷 。
* 羊群效应（ herd effect ）
    * 任何代理或是消费者的增、减都会触发所有的消费者同时进行平衡操作 ，每个消费者都对 ZooKeeper 同一个路径进行操作，这样就有可能发生类似死锁的情况，从而导致平衡操作失败 。
* 脑裂问题（ split brain ）
    * 消费者进行平衡操作时每个消费者都与 ZooKeeper 进行通信，以判断消费者或是代理变化情况，由于 ZooKeeper 本身的特性可能导致在同一时候各消费者所获取的状态不一致，这样就会导致 Kafka 运行在一个不正确状态之下 .
    
鉴于旧版高级消费者存在问题，新版消费者进行了重新设计，引入了协调器 。 对于 Kafka引入协调器的发展过程我们不做细化。大家需要知道的是，为了解决消费者依赖 ZooKeeper 所带来的问题， Kafka 在服务端引入了组协调器（ GroupCoordinator ），每个 KafkaServer 启动时都会创建一个 GroupCoordinator 实例，用于管理部分消费组和该消费组下每个消费者的消费偏移量。 同时在客户端引入了消费者协调器（ConsumerCoordinator ），每个 KafkaConsumer 实例化时会实例化一个 ConsumerCoordinator 对象，消费者协调器负责同一个消费组下各消费者与服务端组协调器之间的通信 。

**消费者协调器**
**组协调器**

<a id="markdown-154-网络通信服务" name="154-网络通信服务"></a>
### 1.5.4. 网络通信服务

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

<a id="markdown-155-日志管理" name="155-日志管理"></a>
### 1.5.5. 日志管理
<a href="#menu" style="float:right">目录</a>

日志管理器 （ LogManager）是 Kafka 用来管理所有日志的 ， 也称为日志管理子系统（ LogManagement Subsystem ）。 它负责管理 日 志的创建与删除 、 日志检索 、 日志加载和恢复、检查点及日志文件刷写磁盘 以及日志清理等

<a id="markdown-1551-日志结构" name="1551-日志结构"></a>
#### 1.5.5.1. 日志结构
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











<a id="markdown-1552-日志管理器启动过程" name="1552-日志管理器启动过程"></a>
#### 1.5.5.2. 日志管理器启动过程
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1553-日志加载及恢复" name="1553-日志加载及恢复"></a>
#### 1.5.5.3. 日志加载及恢复
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1554-日志清理" name="1554-日志清理"></a>
#### 1.5.5.4. 日志清理
<a href="#menu" style="float:right">目录</a>




<a id="markdown-156-复制" name="156-复制"></a>
### 1.5.6. 复制
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

<a id="markdown-157-处理请求" name="157-处理请求"></a>
### 1.5.7. 处理请求
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

<a id="markdown-158-生产请求" name="158-生产请求"></a>
### 1.5.8. 生产请求
<a href="#menu" style="float:right">目录</a>

* 生产者发送的请求，它包含客户端要写入broker的消息



<a id="markdown-159-获取请求" name="159-获取请求"></a>
### 1.5.9. 获取请求
<a href="#menu" style="float:right">目录</a>

* 在消费者和跟随者副本需要从broker读取消息时发送的请求

<a id="markdown-1510-其他请求" name="1510-其他请求"></a>
### 1.5.10. 其他请求
<a href="#menu" style="float:right">目录</a>



<a id="markdown-1511-物理存储" name="1511-物理存储"></a>
### 1.5.11. 物理存储
<a href="#menu" style="float:right">目录</a>




<a id="markdown-16-可靠的数据传递" name="16-可靠的数据传递"></a>
## 1.6. 可靠的数据传递
<a href="#menu" style="float:right">目录</a>

<a id="markdown-161-可靠性保证" name="161-可靠性保证"></a>
### 1.6.1. 可靠性保证
<a href="#menu" style="float:right">目录</a>

<a id="markdown-162-复制" name="162-复制"></a>
### 1.6.2. 复制
<a href="#menu" style="float:right">目录</a>

<a id="markdown-163-broker配置" name="163-broker配置"></a>
### 1.6.3. broker配置
<a href="#menu" style="float:right">目录</a>


<a id="markdown-164-在可靠的系统里使用生产者" name="164-在可靠的系统里使用生产者"></a>
### 1.6.4. 在可靠的系统里使用生产者
<a href="#menu" style="float:right">目录</a>


<a id="markdown-165-在可靠的系统里使用消费者" name="165-在可靠的系统里使用消费者"></a>
### 1.6.5. 在可靠的系统里使用消费者
<a href="#menu" style="float:right">目录</a>


<a id="markdown-166-验证系统可靠性" name="166-验证系统可靠性"></a>
### 1.6.6. 验证系统可靠性
<a href="#menu" style="float:right">目录</a>




<a id="markdown-17-构建数据管道" name="17-构建数据管道"></a>
## 1.7. 构建数据管道
<a href="#menu" style="float:right">目录</a>


<a id="markdown-18-跨越集群数据镜像" name="18-跨越集群数据镜像"></a>
## 1.8. 跨越集群数据镜像
<a href="#menu" style="float:right">目录</a>

<a id="markdown-181-跨集群镜像的使用场景" name="181-跨集群镜像的使用场景"></a>
### 1.8.1. 跨集群镜像的使用场景
<a href="#menu" style="float:right">目录</a>


<a id="markdown-182-多集群架构" name="182-多集群架构"></a>
### 1.8.2. 多集群架构
<a href="#menu" style="float:right">目录</a>




<a id="markdown-19-管理kafaka" name="19-管理kafaka"></a>
## 1.9. 管理Kafaka
<a href="#menu" style="float:right">目录</a>


<a id="markdown-110-监控kafka" name="110-监控kafka"></a>
## 1.10. 监控Kafka
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1101-broker的度量指标" name="1101-broker的度量指标"></a>
### 1.10.1. broker的度量指标
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1102-非同步分区" name="1102-非同步分区"></a>
### 1.10.2. 非同步分区
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1103-broker度量指标" name="1103-broker度量指标"></a>
### 1.10.3. broker度量指标
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1104-主题和分区的度量指标" name="1104-主题和分区的度量指标"></a>
### 1.10.4. 主题和分区的度量指标
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1105-java虚拟机监控" name="1105-java虚拟机监控"></a>
### 1.10.5. Java虚拟机监控
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1106-操作系统监控" name="1106-操作系统监控"></a>
### 1.10.6. 操作系统监控
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1107-日志" name="1107-日志"></a>
### 1.10.7. 日志
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1108-客户端监控" name="1108-客户端监控"></a>
### 1.10.8. 客户端监控
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1109-生产者度量指标" name="1109-生产者度量指标"></a>
### 1.10.9. 生产者度量指标

<a id="markdown-11010-消费者度量指标" name="11010-消费者度量指标"></a>
### 1.10.10. 消费者度量指标

<a id="markdown-11011-配额" name="11011-配额"></a>
### 1.10.11. 配额




<a id="markdown-11012-延迟监控" name="11012-延迟监控"></a>
### 1.10.12. 延迟监控
<a href="#menu" style="float:right">目录</a>


<a id="markdown-11013-端到端监控" name="11013-端到端监控"></a>
### 1.10.13. 端到端监控
<a href="#menu" style="float:right">目录</a>




<a id="markdown-111-流式处理" name="111-流式处理"></a>
## 1.11. 流式处理
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1111-什么是流式处理" name="1111-什么是流式处理"></a>
### 1.11.1. 什么是流式处理
<a href="#menu" style="float:right">目录</a>

* ���据流
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

<a id="markdown-1112-流式处理的概念" name="1112-流式处理的概念"></a>
### 1.11.2. 流式处理的概念
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



<a id="markdown-1113-使用场景" name="1113-使用场景"></a>
### 1.11.3. 使用场景
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1114-流式处理的设计模式" name="1114-流式处理的设计模式"></a>
### 1.11.4. 流式处理的设计模式
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1115-实例" name="1115-实例"></a>
### 1.11.5. 实例
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1116-架构概览" name="1116-架构概览"></a>
### 1.11.6. 架构概览
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1117-如何选择流式处理框架" name="1117-如何选择流式处理框架"></a>
### 1.11.7. 如何选择流式处理框架
<a href="#menu" style="float:right">目录</a>





<span id="menu" >



<a id="markdown-2-rocketmq消息中间件" name="2-rocketmq消息中间件"></a>
# 2. RocketMQ消息中间件
<a href="#menu" style="float:right">目录</a>


<a id="markdown-21-基本介绍" name="21-基本介绍"></a>
## 2.1. 基本介绍
<a href="#menu" style="float:right">目录</a>

<a id="markdown-211-模块说明" name="211-模块说明"></a>
### 2.1.1. 模块说明
<a href="#menu" style="float:right">目录</a>

![](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/rocketmq.png?raw=true)

**NameServer**
**Broker**
**生产者**
**消费者**

<a id="markdown-212-配置参数" name="212-配置参数"></a>
### 2.1.2. 配置参数
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
    

<a id="markdown-213-底层通信实现" name="213-底层通信实现"></a>
### 2.1.3. 底层通信实现
<a href="#menu" style="float:right">目录</a>

* rocketMQ底层基于Netty实现

消息协议

||长度（字节）|说明|
|---|---|---|
|length|4|后面部分的总长度|
|header length|4|头部信息的长度|
|header data |不定长度|头部信息|
|body data|不定长度|消息体|

<a id="markdown-214-rocketmq源代码的目录结构" name="214-rocketmq源代码的目录结构"></a>
### 2.1.4. RocketMQ源代码的目录结构
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

<a id="markdown-215-设计理念" name="215-设计理念"></a>
### 2.1.5. 设计理念
<a href="#menu" style="float:right">目录</a>

* RocketMQ 设计基于主题的发布与订阅模式 ， 其核心功能包括消息 发送消息存储(Broker）、消息消费，整体设计追求简单与性能第一，主要体现在如下三个方面 。首先， NameServer 设计极其简单，摒弃了业界常用的使用 Zookeeper 充当信息管理的 “注册中心”，而是自研 NameServer 来实现元数据 的管理（ Topic 路由信息等 ） 。 从实际需求出发，因为 Topic 路由信息无须在集群之间保持强一致，追求最终一致性，并且能容忍分钟级的不一致。 正是基于此种情况 ， RocketMQ 的 NameServer 集群之间互不通信，极
大地降低了 NameServer 实现的 复杂程度， 对网络的要求也降低了不少 ， 但是性能相比较Zookeeper 有了极大的提升 。
* 其次是高效的 IO 存储机制 。 RocketMQ 追求消息发送的高吞吐量， RocketMQ 的消息存储文件设计成文件组的概念，组内单个文件大小固定，方便引人内存 l映射机制，所有主题的消息存储基于顺序写 ， 极大地提供了消息写性能， 同时为了兼顾消息消费与消息查找，引入了消息消费队列文件与索引文件 。
* 最后是容忍存在设计缺陷 ，适当将某些工作下放给 RocketMQ 使用者 。 消息中间件的实现者经常会遇到一个难题：如何保证消息一定能被消息消费者消费，并且保证只消费一次。
RocketMQ 的设计者给出的解决办法是不解决这个难题，而是退而求其次 ，只保证消息被消
费者消费，但设计上允许消息被重复消费，这样极大地简化了消息中间件的内核，使得实现
消息发送高可用变得非常简单与高效 消息重复问题由消费者在消息消费时实现幕等 。


<a id="markdown-216-设计目标" name="216-设计目标"></a>
### 2.1.6. 设计目标
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

<a id="markdown-217-常用面试题" name="217-常用面试题"></a>
### 2.1.7. 常用面试题


<a id="markdown-22-安装配置" name="22-安装配置"></a>
## 2.2. 安装配置
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

<a id="markdown-23-基本使用" name="23-基本使用"></a>
## 2.3. 基本使用
<a href="#menu" style="float:right">目录</a>

**依赖引入**
```xml
<dependency>
    <groupId>org.apache.rocketmq</groupId>
    <artifactId>rocketmq-client</artifactId>
    <version>4.3.0</version>
</dependency>
    
```
<a id="markdown-231-基本的例子" name="231-基本的例子"></a>
### 2.3.1. **基本的例子**
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
<a id="markdown-232-顺序发送" name="232-顺序发送"></a>
### 2.3.2. **顺序发送**
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
<a id="markdown-233-广播发送" name="233-广播发送"></a>
### 2.3.3. **广播发送**
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
<a id="markdown-234-定时发送" name="234-定时发送"></a>
### 2.3.4. **定时发送**
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
<a id="markdown-235-批量发送" name="235-批量发送"></a>
### 2.3.5. **批量发送**
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
<a id="markdown-236-过滤" name="236-过滤"></a>
### 2.3.6. **过滤**
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
<a id="markdown-237-日志appender" name="237-日志appender"></a>
### 2.3.7. **日志appender**
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
<a id="markdown-238-事务消息" name="238-事务消息"></a>
### 2.3.8. **事务消息**
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

<a id="markdown-24-协调者nameserver" name="24-协调者nameserver"></a>
## 2.4. 协调者NameServer
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

<a id="markdown-241-路由元信息" name="241-路由元信息"></a>
### 2.4.1. 路由元信息
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


<a id="markdown-25-生产者" name="25-生产者"></a>
## 2.5. 生产者
<a href="#menu" style="float:right">目录</a>

<a id="markdown-251-消息发送方式" name="251-消息发送方式"></a>
### 2.5.1. 消息发送方式
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

<a id="markdown-252-生产者api" name="252-生产者api"></a>
### 2.5.2. 生产者API
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



<a id="markdown-253-队列选择器" name="253-队列选择器"></a>
### 2.5.3. 队列选择器

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
<a id="markdown-254-发送流程分析" name="254-发送流程分析"></a>
### 2.5.4. 发送流程分析
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

<a id="markdown-255-默认的队列选择" name="255-默认的队列选择"></a>
### 2.5.5. 默认的队列选择

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

<a id="markdown-26-消费者" name="26-消费者"></a>
## 2.6. 消费者
<a href="#menu" style="float:right">目录</a>

<a id="markdown-261-消息消费概述" name="261-消息消费概述"></a>
### 2.6.1. 消息消费概述
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




<a id="markdown-262-消息消费推拉方式" name="262-消息消费推拉方式"></a>
### 2.6.2. 消息消费推/拉方式
<a href="#menu" style="float:right">目录</a>


RocketMQ消息消费本质上是基于的拉（pull）模式，consumer主动向消息服务器broker拉取消息。
consumer被分为2类：MQPullConsumer和MQPushConsumer，其实本质都是拉模式（pull），即consumer轮询从broker拉取消息。 区别：
**MQPushConsumer方式**，consumer把轮询过程封装了，并注册MessageListener监听器，取到消息后，唤醒MessageListener的consumeMessage()来消费，对用户而言，感觉消息是被推送（push）过来的。主要用的也是这种方式。
**MQPullConsumer方式**，取消息的过程需要用户自己写，首先通过打算消费的Topic拿到MessageQueue的集合，遍历MessageQueue集合，然后针对每个MessageQueue批量取消息，一次取完后，记录该队列下一次要取的开始offset，直到取完了，再换另一个MessageQueue。

 RocketMQ 并没有真正实现推模式，而是消费者主动向消息服务器拉取消息， RocketMQ推模式是循环向消息服务端发送消息拉取请求，如果消息消费者向 RocketMQ 发送消息拉取时，消息并未到达消费队列，如果不启用长轮询机制，则会在服务端等待hortPollingTimeMills 时间后（挂起）再去判断消息是否已到达消息队列，如果消息未到达则提示消息拉取���户端 PULL_NOT_FOUND （消息不存在），如果开启长轮询模式，RocketMQ 一方面会每5s 轮询检查一次消息是否可达 ， 同时一有新消息到达后立马通知挂起线程再次验证新消息是否是自 己感兴趣的消息，如果是则从 commitlog 文件提取消息返回给消息拉取客户端，否则直到挂起超时，超时时间由消息拉取方在消息拉取时封装在请求参数中， PUSH 模式默认为15s, PULL 模式通过 DefaultMQPullConsumer#setBrokerSuspendMaxTim巳Millis 设置。 RocketMQ 通过在 Broker 端配置 longPollingEnable 为仕回来开启长轮询模式 。
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

<a id="markdown-263-提高-consumer-处理能力" name="263-提高-consumer-处理能力"></a>
### 2.6.3. 提高 Consumer 处理能力
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

<a id="markdown-264-consumer-的负载均衡" name="264-consumer-的负载均衡"></a>
### 2.6.4. Consumer 的负载均衡
<a href="#menu" style="float:right">目录</a>

当消费组里面有多个

要做负载均衡，必须知道一些全局信息，也就是一个 ConsumerGroup 里到底有多少个 Consumer ， 知道了全局信息，才可以根据某种算法来分配，比如简单地平均分到各个 Consumer。 在 RocketMQ 中，负载均衡或者消息分配是在Consumer 端代码中完成的， Consumer 从 Broker 处获得全局信息，然后自己做负载均衡，只处理分给自己的那部分消息 

**DefaultMQPushConsumer 的负载均衡**

**DefaultMQPullConsumer 的负载均衡**

<a id="markdown-265-定时消息" name="265-定时消息"></a>
### 2.6.5. 定时消息
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


<a id="markdown-27-消息存储" name="27-消息存储"></a>
## 2.7. 消息存储
<a href="#menu" style="float:right">目录</a>


<a id="markdown-271-消息存储结构" name="271-消息存储结构"></a>
### 2.7.1. 消息存储结构
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


<a id="markdown-272-消息队列与索引文件恢复" name="272-消息队列与索引文件恢复"></a>
### 2.7.2. 消息队列与索引文件恢复
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

<a id="markdown-2721-broker-正常停止文件恢复" name="2721-broker-正常停止文件恢复"></a>
#### 2.7.2.1. Broker 正常停止文件恢复
<a href="#menu" style="float:right">目录</a>

Broker 正常停止文件恢复的实现为 CommitLog#recoverNormally 。

* Broker正常停止再重启时，从倒数第三个文件开始进行恢复，如果不足3 个文件，则从第一个文件开始恢复。checkCRCOnRecover 参数设置在进行文件恢复时查找消息时是否验证 CRC 。

* 解释一下两个局部变量，mappedFileOffset为当前文件已校验通过的offset,processOffset为Commitlog文件已确认的物理偏移量等于mappedFile.getFileFromOffset加上 mappedFileOffset。

* 遍历Commitlog文件，每次取出一条消息，如果查找结果为true并且消息的长度大于0表示消息正确，mappedFileOffset指针向前移动本条消息的长度；如果查找结果为true并且消息的长度等于0，表示已到该文件的末尾，如果还有下一个文件，则重置processOffset 、mappedFileOffset 重复步骤3，否则跳出循环；如果查找结构为 false ，表明该文件未填满所有消息，跳出循环，结束遍历文件
* 更新 MappedFileQueue 的 flushedWhere 与 commiteedWhere 指针 。
* 删除 offset 之后的所有文件 。遍历目录下的文件，如果文件的尾部偏移量小于offset则跳过该文件，如果尾部的偏移量大于 offset ，则进一步比较offset与文件的开始偏移量，如果 offset 大于文件的起始偏移量， 说明 当前文件包含了有效偏移里 ，设置MappedFile 的 flushedPosition 和 commitedPosition ；如果 offse t 小于文件的起始偏移量，说明该文件是有效文件后面创建的，调用 MappedFile#destory 释放 MappedFile 占用的内存资源（内存映射与内存通道等），然后加入到待删除文件列表中，最终调用 deleteExpiredFile将文件从物理磁盘删除 。 过期文件的删除将在下文详细介绍 。

<a id="markdown-2722-broker-异常停止文件恢复" name="2722-broker-异常停止文件恢复"></a>
#### 2.7.2.2. Broker 异常停止文件恢复
<a href="#menu" style="float:right">目录</a>

Broker 异常停止文件恢复的实现为 CommitLog#recoverAbnormally 。
异常文件恢复的步骤与正常停止文件恢复 的流程基本相同，其主要差别有两个 。 首先，正常停止默认从倒数第三个文件开始进行恢复， 而异常停止则需要从最后一个文件往前走，找到第一个消息存储正常的文件 。 其次，如果 commitlog 目录没有消息文件，如果在消息消费 队列目录下存在文件，则需要销毁 。

* 首先判断文件的魔数，如果不是 MESSAGE MAGIC_CODE ，返回 false ，表示该文件不符合 commitlog 消息文件的存储格式 
* 如果文件中第一条消息的存储时间 等于 0 ， 返回 false ，说明该消息存储文件中未存储任何消息 。
* 对比文件第一条 消息的时间戳与检测点，文件第 一条 消息的时间戳小于文件检测点说明 该文件部分消息是可靠 的 ， 则从该文件开始恢 复 。 文件检测点中保存了Commitlog 文件 、消息消费 队列（ ConsumeQueue ） 、索 引文件 （ IndexFile ）的 文件刷盘点，RocketMQ 默认选择这消息文件与消息消 费 队列这两个文件的时间刷盘点中最小值与消息文件第一消息 的时间戳对比，如果 messagelndexEnable 为 true ， 表示索引 文件的刷盘时间点也参与计算 。
* 如果根据前 3 步算法找到 MappedFile ，则遍历 MappedFile 中的消息，验证消息的合法性，并将消息重新转发到消息消费队列与索引 文件 
* 如果未找到有效 Mappe dFile ， 则设置 commitlog 目 录的 flushedWhere 、 committedWhere 指针都为 0 ，并销毁消息消费队列文件 。

存储启动时所谓的文件恢复主要完成 flushedPosition, committedWhere 指针的设置 、消息消费队列最大偏移 量加载到内存，并删除 flushedPosition 之后所有的文件。如果 Broker异常启 动， 在文件 恢复过程中 ， RocketMQ 会将最后一个有效文件中的所有消息重新转发到消息消费队 列与索引文件，确保不丢失消息，但同时会带来消息重复的 问 题，纵观RocktMQ 的整体设计思想， RocketMQ 保证消息不丢失但不保证消息不会重复消费 ， 故消息消费业务方需要 实现消息消费的幕等设计 。


<a id="markdown-273-文件刷盘机制" name="273-文件刷盘机制"></a>
### 2.7.3. 文件刷盘机制
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


    


<a id="markdown-274-过期文件删除机制" name="274-过期文件删除机制"></a>
### 2.7.4. 过期文件删除机制
<a href="#menu" style="float:right">目录</a>

* 由于使用了内存映射，只要存在于存储目录下的文件，都需要对应创建内存映射文件，如果不定时将已消费的消息从存储文件中删除，会造成极大的内存压力与资源浪费，所有 RocketMQ 采取定时删除存储文件的策略，也就是说在存储文件中， 第一个文件不一定是 00000000000000000000 ，因为该文件在某一时刻会被删除
* 由于 RocketMQ 操作 CommitLog 、 ConsumeQueue文件是基于内存映射机制并在启动的时候会加载 commitlog 、 ConsumeQueue 目录下的所有文件，为了避免内存与磁盘的浪费，不可能将消息永久存储在消息服务器上，所以需要引人一种机制来删除己过期的文件 。
* RocketMQ 顺序写 Commitlog 文件 、 ConsumeQueue 文件，所有写操作全部落在最后一个CommitLog 或 ConsumeQueue 文件上，之前的文件在下一个文件创建后将不会再被更新 。
* RocketMQ 清除过期文件的方法是 ：如果非当前写文件在一定时间间隔内没有再次被更新，则认为是过期文件，可以被删除， RocketMQ **不会关注这个文件上的消息是否全部被消费** 。
* 默认每个文件的过期时间为 72 小时 ，通过在 Broker 配置文件中设置fileReservedTime 来改变过期时间，单位为小时.


<a id="markdown-28-高可用机制" name="28-高可用机制"></a>
## 2.8. 高可用机制

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

<a id="markdown-281-动态增减broker" name="281-动态增减broker"></a>
### 2.8.1. 动态增减broker
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

<a id="markdown-282-各种故障对消息的影响" name="282-各种故障对消息的影响"></a>
### 2.8.2. 各种故障对消息的影响
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



<a id="markdown-29-顺序消息" name="29-顺序消息"></a>
## 2.9. 顺序消息
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

<a id="markdown-210-消息饥饿问题" name="210-消息饥饿问题"></a>
## 2.10. 消息饥饿问题
<a href="#menu" style="float:right">目录</a>

* 有AA，BB两种类型的消息，都放在同一个topic中，如果AA的数据量特别大，BB的数据量特别小，就会导致BB类型的消息不能即时处理
    * AA和BB放在不同的topic中，这样两种类型的消息都能够同时处理
    * AA和BB放在同一个topic的不同队列中，消费者轮询各个队列进行消费
    

<a id="markdown-211-消息过滤" name="211-消息过滤"></a>
## 2.11. 消息过滤 
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

<a id="markdown-212-事务消息" name="212-事务消息"></a>
## 2.12. 事务消息
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

<a id="markdown-2121-事务实现思想" name="2121-事务实现思想"></a>
### 2.12.1. 事务实现思想
<a href="#menu" style="float:right">目录</a>

* RocketMQ 事务消息的实现原理基于两阶段提交和定时事务状态回查来决定消息最终是提交还是回滚。
    * 应用程序在事务内完成相关业务数据落库后，需要同步调用 RocketMQ 消息发送接口，发送状态为 prepare 的消息 。 消息发送成功后， RocketMQ 服务器会回调 RocketMQ 消息发送者的事件监听程序，记录消息的本地事务状态，该相关标记与本地业务操作同属一个事务，确保消息发送与本地事务的原子’性 。
    * RocketMQ 在收到类型为 prepare 的消息时， 会首先备份消息的原主题与原消息消费队列，然后将消息存储在主题为 RMQ_SYS_TRANS_HALF_TOPIC 的消息消费队列中。
    * RocketMQ 消息服务器开启一个定时任务，消费 RMQ_SYS_TRANS_HALF_TOPIC的消息，向消息发送端（应用程序）发起消息事务状态回查，应用程序根据保存的事务状态回馈消息服务器事务的状态（提交、回滚、未知），如果是提交或回滚， 则消息服务器提交或回滚消息，如果是未知，待下一次回查， RocketMQ 允许设置一条消息的回查间隔与回查次数，如果在超过回查次数后依然无法获知消息的事务状态， 则默认回滚消息 。

![事务原理图](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/rockrtmq-transaction.png?raw=true)

<a id="markdown-2122-事务消息发送流程" name="2122-事务消息发送流程"></a>
### 2.12.2. 事务消息发送流程

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



<a id="markdown-2123-提交或者回滚事务" name="2123-提交或者回滚事务"></a>
### 2.12.3. 提交或者回滚事务
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

<a id="markdown-2124-事务消息回查事务状态" name="2124-事务消息回查事务状态"></a>
### 2.12.4. 事务消息回查事务状态
<a href="#menu" style="float:right">目录</a>

执行完本地事务返回本地事务状态为 UN KNOW 时，结束事务时将不做任何处理，而是通过事务状态定时回查以期得到发送端明确的事务操作（提交事务或回滚事务） 

RocketMQ 通过 TransactionalMessageCheckService 线程定 时去检测 RMQ_SYS_TRANS_HALF TOPIC 主题中的消息，回查消息的事务状态 。 TransactionalMessageCheckService 的检测频率默认为 l 分钟，可通过在 broker.conf文件中设置 transactionChecklnterval 来改变默认值，单位为毫秒。



<a id="markdown-213-基于netty的通信实现" name="213-基于netty的通信实现"></a>
## 2.13. 基于Netty的通信实现
<a href="#menu" style="float:right">目录</a>



<a id="markdown-3-zookeeper" name="3-zookeeper"></a>
# 3. Zookeeper
<a href="#menu" style="float:right">目录</a>

<a id="markdown-31-基本概念" name="31-基本概念"></a>
## 3.1. 基本概念
<a href="#menu" style="float:right">目录</a>

<a id="markdown-311-zk架构" name="311-zk架构"></a>
### 3.1.1. zk架构
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

<a id="markdown-312-提供的功能" name="312-提供的功能"></a>
### 3.1.2. 提供的功能
* 给节点创建监听器
* create : 创建节点
* delete : 删除节点
* exists : 检测节点是否存在
* get data : 从节点读取数据
* set data : 向节点写入数据
* get children : 获取子节点列表
* sync : 等待数据传播

<a id="markdown-313-节点类型" name="313-节点类型"></a>
### 3.1.3. 节点类型

以下两种类型可以交叉组合，比如持久有序，持久无序。
* 持久化节点(persistent)和临时节点(ephemeral)，临时节点在与创建它的客户端连接断开以后，判定连接失效之后将会被删除,或者客户端主动删除。持久化节点在创建成功之后，将会一直存在，除非手动删除。
* 有序节点和无序节点，有序节点在每次创建时同一个名称的节点时会自动在节点名称后面加上序列号。

**应用场景**:微服务中的失效剔除可以使用临时节点来实现，当服务提供者失效时，zk判断连接失败之后将服务信息删除，如果消费者监听该节点，将会收到删除请求。

