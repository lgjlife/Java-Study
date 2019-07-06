
<!-- TOC -->

- [1. Du<!-- TOC -->](#1-du---toc---)
- [2. RocketMQ](#2-rocketmq)
- [3. RabbitMQ](#3-rabbitmq)
- [4. Kafka](#4-kafka)
- [5. Nginx](#5-nginx)
- [6. Tomcat](#6-tomcat)
- [7. elasticsearch](#7-elasticsearch)
- [8. FastDfs](#8-fastdfs)
- [9. Zookeeper](#9-zookeeper)
    - [9.1. 基本概念](#91-基本概念)
        - [9.1.1. zk架构](#911-zk架构)
        - [9.1.2. 提供的功能](#912-提供的功能)
        - [9.1.3. 节点类型](#913-节点类型)

<!-- /TOC -->
<a href="#menu" style="float:right">目录</a>
# 2. RocketMQ
<a href="#menu" style="float:right">目录</a>
# 3. RabbitMQ
<a href="#menu" style="float:right">目录</a>
# 4. Kafka
<a href="#menu" style="float:right">目录</a>
# 5. Nginx
<a href="#menu" style="float:right">目录</a>
# 6. Tomcat
<a href="#menu" style="float:right">目录</a>
# 7. elasticsearch
<a href="#menu" style="float:right">目录</a>
# 8. FastDfs
<a href="#menu" style="float:right">目录</a>

# 9. Zookeeper
<a href="#menu" style="float:right">目录</a>
## 9.1. 基本概念
<a href="#menu" style="float:right">目录</a>
### 9.1.1. zk架构
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

### 9.1.2. 提供的功能
* 给节点创建监听器
* create : 创建节点
* delete : 删除节点
* exists : 检测节点是否存在
* get data : 从节点读取数据
* set data : 向节点写入数据
* get children : 获取子节点列表
* sync : 等待数据传播

### 9.1.3. 节点类型

以下两种类型可以交叉组合，比如持久有序，持久无序。
* 持久化节点(persistent)和临时节点(ephemeral)，临时节点在与创建它的客户端连接断开以后，判定连接失效之后将会被删除,或者客户端主动删除。持久化节点在创建成功之后，将会一直存在，除非手动删除。
* 有序节点和无序节点，有序节点在每次创建时同一个名称的节点时会自动在节点名称后面加上序列号。

**应用场景**:微服务中的失效剔除可以使用临时节点来实现，当服务提供者失效时，zk判断连接失败之后将服务信息删除，如果消费者监听该节点，将会收到删除请求。

