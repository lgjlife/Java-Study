
<span id="menu" >
<!-- TOC -->

- [1. RabbitMQ](#1-rabbitmq)
    - [1.1. 概述](#11-概述)
    - [1.2. 安装和使用](#12-安装和使用)
        - [1.2.1. 安装](#121-安装)
        - [1.2.2. 启动](#122-启动)
    - [1.3. 入门](#13-入门)
        - [1.3.1. 相关概念介绍](#131-相关概念介绍)
            - [1.3.1.1. 生产者和消费值](#1311-生产者和消费值)
            - [1.3.1.2. 队列](#1312-队列)
            - [1.3.1.3. 交换器,路由键,绑定](#1313-交换器路由键绑定)
            - [1.3.1.4. 交换器类型](#1314-交换器类型)
            - [1.3.1.5. RabbitMQ运转流程](#1315-rabbitmq运转流程)
            - [1.3.1.6. 通信模式](#1316-通信模式)
        - [1.3.2. AMQP协议介绍](#132-amqp协议介绍)
            - [1.3.2.1. AMQP生产者流转过程](#1321-amqp生产者流转过程)
            - [1.3.2.2. AMQP消费者流转过程](#1322-amqp消费者流转过程)
        - [1.3.3. 配置](#133-配置)
            - [1.3.3.1. 环境变量](#1331-环境变量)
            - [1.3.3.2. 配置文件](#1332-配置文件)
            - [1.3.3.3. 参数和策略](#1333-参数和策略)
    - [1.4. 客户端开发](#14-客户端开发)
        - [1.4.1. 依赖](#141-依赖)
        - [1.4.2. 连接RabbitMQ](#142-连接rabbitmq)
        - [1.4.3. 使用交换器和队列](#143-使用交换器和队列)
        - [1.4.4. 发送消息](#144-发送消息)
        - [1.4.5. 消费消息](#145-消费消息)
            - [1.4.5.1. 推模式](#1451-推模式)
            - [1.4.5.2. 拉模式](#1452-拉模式)
        - [1.4.6. 消息端的确认和拒绝](#146-消息端的确认和拒绝)
        - [1.4.7. 关闭连接](#147-关闭连接)
    - [1.5. 进阶](#15-进阶)
        - [1.5.1. 参数mandatory 和 immediate介绍](#151-参数mandatory-和-immediate介绍)
        - [1.5.2. 备份交换器](#152-备份交换器)
        - [1.5.3. 过期时间TTL](#153-过期时间ttl)
            - [1.5.3.1. 设置消息的过期时间](#1531-设置消息的过期时间)
            - [1.5.3.2. 设置队列的过期时间](#1532-设置队列的过期时间)
        - [1.5.4. 死信队列](#154-死信队列)
        - [1.5.5. 延迟队列](#155-延迟队列)
        - [1.5.6. 优先级队列](#156-优先级队列)
        - [1.5.7. RPC实现](#157-rpc实现)
        - [1.5.8. 持久化](#158-持久化)
        - [1.5.9. 生产者确认](#159-生产者确认)
            - [1.5.9.1. 事务机制](#1591-事务机制)
            - [1.5.9.2. 发送方确认机制](#1592-发送方确认机制)
        - [1.5.10. 消费端要点介绍](#1510-消费端要点介绍)
            - [1.5.10.1. 消息分发](#15101-消息分发)
            - [1.5.10.2. 消息顺序性](#15102-消息顺序性)
        - [1.5.11. 消息传输保障](#1511-消息传输保障)
    - [1.6. Spring集成RabbitMQ](#16-spring集成rabbitmq)
        - [1.6.1. 依赖](#161-依赖)
        - [1.6.2. 配置](#162-配置)
        - [1.6.3. 配置类](#163-配置类)
        - [1.6.4. 生产者](#164-生产者)
        - [1.6.5. 消费者](#165-消费者)
        - [1.6.6. 为Rabbitmq中的Jackson2JsonMessageConverter自定义ClassMapper](#166-为rabbitmq中的jackson2jsonmessageconverter自定义classmapper)
        - [1.6.7. SimpleMessageListenerContainer](#167-simplemessagelistenercontainer)
    - [1.7. RabbitMQ管理](#17-rabbitmq管理)
    - [1.8. 数据存储](#18-数据存储)
    - [1.9. 集群](#19-集群)
    - [1.10. 源码说明](#110-源码说明)

<!-- /TOC -->
# 1. RabbitMQ
<a href="#menu" style="float:right">目录</a>

## 1.1. 概述
<a href="#menu" style="float:right">目录</a>

它是采用Erlang语言实现的AMQP(Advanced Message Queued Protocol)的消息中间件，最初起源于金融系统，用在分布式系统存储转发消息。

RabbitMQ发展到今天，被越来越多的人认可，这和它在易用性、扩展性、可靠性和高可用性等方面的卓著表现是分不开的。RabbitMQ的具体特点可以概括为以下几点:
* 可靠性:RabbitMQ使用一些机制来保证可靠性，如持久化、传输确认及发布确认等。
* 灵活的路由:在消息进入队列之前，通过交换器来路由消息。对于典型的路由功能，RabbitMQ己经提供了一些内置的交换器来实现。针对更复杂的路由功能，可以将多个交换器绑定在一起，也可以通过插件机制来实现自己的交换器。
* 扩展性:多个RabbitMQ节点可以组成一个集群，也可以根据实际业务情况动态地扩展集群中节点。
* 高可用性:队列可以在集群中的机器上设置镜像，使得在部分节点出现问题的情况下队仍然可用。
* 多种协议:RabbitMQ除了原生支持AMQP协议，还支持STOMP，MQTT等多种消息中间件协议。
* 多语言客户端:RabbitMQ几乎支持所有常用语言，比如Jav a、Python、Ruby、PHP、C#、JavaScript等。
* 管理界面:RabbitMQ提供了一个易用的用户界面，使得用户可以监控和管理消息、集群中的节点等。
* 插件机制:RabbitMQ提供了许多插件，以实现从多方面进行扩展，当然也可以编写自己的插件。



## 1.2. 安装和使用 
<a href="#menu" style="float:right">目录</a>

### 1.2.1. 安装
<a href="#menu" style="float:right">目录</a>

**安装 Erlang**

下面首先演示 Erlang 的安装。

第一步，解压安装包，并配置安装目录，这里我们预备安装
到 /opt/erlang 目录下:
```
[root@hidden -)# tar zxvf otp_src_19 . 3.tar . gz
[root@hidden -)# cd otp src 19 . 3
[root@hidden otp src_19.3)# ./configure --prefix=/opt/er1ang
```

第二步，如果出现类似关键报错信息 : No curses library functions found。那么此时需要安装
ncurses ，安装步骤(遇到提示输入 y 后直接回车即可)如下:
```
[root@hidden otp_src_19.3)# yum install ncurses-devel
```

第三步，安装 Erlang:
```
[root@hidden otp_src_19 . 3)# make
[root@hidden otp_src_19 . 3)# make install
```

如果在安装的过程中出现类似 "No ***** found" 的提示，可根据提示信息安装相应的包，
之后再执行第二或者第三步，直到提示安装完毕为止。


第四步，修改 /etc/profile 配置文件，添加下面的环境变量:
```
ERLANG HOME=/opt/erlang
export PATH=$PATH:$ERLANG HOME/bin
export ERLANG_HOME
```
最后执行如下命令让配置文件生效 :
```
[root@hidden otp_src_19 .3) # source /etc/profile
```
可以输入 erl 命令来验证 Erlang 是否安装成功，如果出现类似以下的提示即表示安装成功:
```
lgj@lgj-Lenovo-G470:$ erl
Erlang/OTP 20 [erts-9.2] [source] [64-bit] [smp:4:4] [ds:4:4:10] [async-threads:10] [kernel-poll:false]

Eshell V9.2  (abort with ^G)
1> 
```

**RabbitMQ 的安装**
RabbitMQ 的安装比 Erlang 的安装要简单，直接将下载的安装包解压到相应的目录下即可，官网下载地址 : http://www.rabbitmq.comlreleases/rabbitmq-server/。
这里选择将 RabbitMQ 安装到与 Erlang 同一个目录 (/ opt) 下面 :
```
[root@hidden -]# tar zvxf rabbitmq-server- generic-unix-3.6.10 . tar . gz -c lopt
[root@hidden - ]# cd lopt
[root@hidden -]# mv rabbitmq_server-3 . 6.10 rabbitmq
```
同样修改 /etc/profile 文件 ， 添加下面的环境变量 :
```
export PATH=$PATH : /opt/rabbitmq/sbin
export RABBITMQ HOME=/opt/rabbitmq
```
之后执行 source/etc/profile 命令让配置文件生效。


### 1.2.2. 启动
<a href="#menu" style="float:right">目录</a>

在修改了 /etc/profile 配置文件之后，可以任意打开一个 Shell 窗口，输入如下命令以运行 RabbitMQ 服务 :
```
rabbitmq-server -detached
```

在 rabbitmq-s erver 命令后面添加一个 "-detached" 参数是为了能够让 RabbitMQ服务以守护进程的方式在后台运行，这样就不会因为当前 Shell 窗口的关闭而影响服务。

运行 rabbitmqctl status 命令查看 RabbitMQ 是否正常启动



## 1.3. 入门
<a href="#menu" style="float:right">目录</a>

整体模型
![ribbitmq](https://github.com/lgjlife/Java-Study/blob/master/pic/ribbitmq/ribbitmq.png?raw=true)

### 1.3.1. 相关概念介绍
<a href="#menu" style="float:right">目录</a>


#### 1.3.1.1. 生产者和消费值
<a href="#menu" style="float:right">目录</a>

* 生产者:生产者创建消息,然后发布到RabbitMQ中.
* 消息
    * 标签
        * 消息相关的内容,比如交换器名称等信息
    * 消息体
        * 具体的消息内容
    * 路由之后,存入到队列的消息只有消息体,没有标签
* 消费者
    * 从RabbitMQ中获取消息
    * 分为推模式和拉模式
* Broker
    * 消息中间件的服务节点
* 消息流转流程
    * 生产者发送数据
    * 数据被序列化为字节数据
    * 指定交换器路由方式等信息
    * 发送到Broker
    * 消息根据指定的策略分发到队列中
    * 消费者获取消息
    * 对消息进行反序列化操作
    * 获取到实际的消息,并进行处理

#### 1.3.1.2. 队列
<a href="#menu" style="float:right">目录</a>

Queue: 队列，是 RabbitMQ 的内部对象，用于存储消息

RabbitMQ 中消息都只能存储在队列中，这一点和 Katka 这种消息中间件相反 。 Katka 将消息存储在 topic C 主题)这个逻辑层面，而相对应的队列逻辑只是 topic 实际存储文件中的位移标识。 RabbitMQ 的生产者生产消息井最终技递到队列中，消费者可以从队列中获取消息并消费 。

多个消费者可以订阅同一个队列，这时队列中的消息会被平均分摊 CRound-Robin ，即轮询)给多个消费者进行处理，而不是每个消费者都收到所有的消息井处理.RabbitMQ 不支持队列层面的广播消费，如果需要广播消费,可在消费端进行处理.

#### 1.3.1.3. 交换器,路由键,绑定
<a href="#menu" style="float:right">目录</a>

* Exchange (交换器)
    * 生产者将消息发送到 Exchange (交换器，通常也可以用大写的 "X" 来表示)，由交换器将消息路由到一个或者多个队列中。如果路由不到，或许会返回给生产者，或许直接丢弃。这里可以将 RabbitMQ 中的交换器看作一个简单的实体，
* RoutingKey: 路由键
    * 生产者将消息发给交换器 的时候， 一般会指定 一个 RoutingKey ，用来指定这个消息的路由规则，而这个 RoutingKey 需要与交换器类型和绑定键 (BindingKey) 联合使用才能最终生效。
* Binding: 绑定
    * RabbitMQ 中通过绑定将交换器与队列关联起来
    * 在绑定的时候一般会指定一个绑定键 ( BindingKey ) ，这样 RabbitMQ 就知道如何正确地将消息路由到队列

生产者将消息发送给交换器时， 需要一个 RoutingKey ， 当 BindingKey 和 RoutingKey 相匹配时， 消息会被路由 到对应的 队列 中。在绑定多个队列到同一个交换器的时候 ， 这些绑定允许使用相 同的 BindingKey 0 BindingKey 并不是在所有的情况下都生效，它依赖于交换器类型 ， 比如 fanout 类型 的交换器就会无视 BindingKey ， 而是将消息路由到所有绑定到该交换器的队列中 。



#### 1.3.1.4. 交换器类型
<a href="#menu" style="float:right">目录</a>

RabbitMQ 常用的交换器类型有 fanout 、 direct 、topic 、headers 这四种 。 AMQP协议里还提到另外两种类型: System 和自定义

* fanout
    * 它会把所有发送到该交换器的消息路由到所有与该交换器绑定的队列中。
* direct
    * direct 类型的交换器路由规则也很简单，它会把消息路由到那些 BindingKey 和 RoutingKey完全匹配的队列中。
* topic
    * topic 类型的交换器在匹配规则上进行了扩展，它与 direct 类型的交换器相似，也是将消息路由到 BindingKey 和 RoutingKey 相匹配的队列中
    * 匹配规则
        * RoutingKey 为一个点号"."分隔的字符串(被点号"."分隔开的每一段独立的字符串称为一个单词 )，如 "com.rabbimq.client"
        * BindingKey 和 RoutingKey 一样也是点号"."分隔的字符串;
        * BindingKey 中可以存在两种特殊字符串"*"和"#"，用于做模糊匹配，其中"*"用于匹配一个单词，"#"用于匹配多规格单词(可以是零个)。
* headers
    * headers 类型的交换器不依赖于路由键的匹配规则来路由消息，而是根据发送的消息内容中的 headers 属性进行匹配。在绑定队列和交换器时制定一组键值对 ， 当发送消息到交换器时，RabbitMQ 会获取到该消息的 headers (也是一个键值对的形式) ，对比其中的键值对是否完全匹配队列和交换器绑定时指定的键值对，如果完全匹配则消息会路由到该队列，否则不会路由到该队列 。 headers 类型的交换器性能会很差，而且也不实用，基本上不会看到它的存在。

#### 1.3.1.5. RabbitMQ运转流程
<a href="#menu" style="float:right">目录</a>

**生产者**
(1) 生产者连接到 RabbitMQ Broker ， 建立一个连接( Connection) ，开启 一个信道 (Channel)
(2) 生产者声明一个交换器 ，并设置相关属性，比如 交换机类型、是否持久化等
(3) 生产者声明 一个队列井设置相关属性，比如是否排他、是否持久化、是否自动删除等
(4) 生产者通过路由键将交换器和队列绑定起来
(5) 生产者发送消息至 RabbitMQ Broker，其中包含路由键、交换器等信息
(6) 相应的交换器根据接收到的路由键查找相匹配的队列 。
(7) 如果找到 ，则将从生产者发送过来的消息存入相应的队列中。
(8) 如果没有找到 ，则根据生产者配置的属性选择丢弃还是回退给生产者
(9) 关闭信道。
(10) 关闭连接。

**消费者**
(1) 消费者连接到 RabbitMQ Broker，建立一个连接 (Connection ) ，开启 一个信道 (Channel) 。
(2) 消费者向 RabbitMQ Broker 请求消费相应队列中的消息，可能会设置相应的回调函数，以及做一些准备工作
(3) 等待 RabbitMQ Broker 回应并投递相应队列中的消息， 消费者接收消息。
(4) 消费者确认 ( ack) 接收到的消息 。
(5) RabbitMQ 从队列中删除相应己经被确认的消息 。
(6) 关闭信道。
(7) 关闭连接。


两个新的概念: Connection 和 Channel。我们知道无论是生产者还是消费者，都需要和 RabbitMQ Broker 建立连接，这个连接就是一条 TCP 连接，也就是Connection 。 一旦 TCP 连接建立起来，客户端紧接着可以创建一个 AMQP 信道 (Channel) ，每个信道都会被指派一个唯一的 D。信道是建立在 Connection 之上的虚拟连接， RabbitMQ 处理的每条 AMQP 指令都是通过信道完成的。

我们完全可以直接使用 Connection 就能完成信道的工作，为什么还要引入信道呢?试想这样一个场景， 一个应用程序中有很多个线程需要从 RabbitMQ 中消费消息，或者生产消息，那么必然需要建立很多个 Connection，也就是许多个 TCP 连接。然而对于操作系统而言，建立和销毁 TCP 连接是非常昂贵的开销，如果遇到使用高峰，性能瓶颈也随之显现。 RabbitMQ 采用类似 NIO' (Non-blocking 1/0) 的做法，选择 TCP 连接复用，不仅可以减少性能开销，同时也便于管理 。

NIO，也称非阻塞 UO ， 包含三大核心部分 Channel (信道)、 Buffer (缓冲区)和 Selector (选择器). NIO 基于 Channel 和Buffer 进行操作，数据总是从信道读取数据到缓冲区中，或者从缓冲区写入到信道中。 Selector 用于监听多个信道的事件(比如连接打开，数据到达等)。因此，单线程可以监听多个数据的信道。

每个线程把持一个信道，所以信道复用了 Connection 的 TCP 连接。同时 RabbitMQ 可以确保每个线程的私密性，就像拥有独立的连接一样。当每个信道的流量不是很大时，复用单一 的Connection 可以在产生性能瓶颈的情况下有效地节省 TCP 连接资源。但是当信道本身的流量很大时，这时候多个信道复用一个 Connection 就会产生性能瓶颈，进而使整体的流量被限制了。此时就需要开辟多个 Connection，将这些信道均摊到这些 Connection 中， 至于这些相关的调优策略需要根据业务自身的实际情况进行调节

信道在 AMQP 中是一个很重要的概念，大多数操作都是在信道这个层面展开的。


#### 1.3.1.6. 通信模式
<a href="#menu" style="float:right">目录</a>

* TCP的创建和销毁，开销大，创建需要三次握手，销毁需要四次分手
* 如果不使用信道，那么应用程序就会使用TCP的方式连接到rabbitmq，高峰时每秒成千上万条连接会造成资源的巨大浪费(一条tcp消耗资源，成千上万的tcp会非常消耗资源)，而且操作系统每秒处理TCP连接数量也是有限的，必定会造成性能瓶颈
* 信道的原理是一条线程一条信道，多条线程多条信道共同使用一条TCP连接。一条TCP连接可以容纳无限的信道，及时每秒造成成千上万的请求也不会造成性能瓶颈

**为什么使用信道而不是连接**
对操作系统来说,建立和销毁TCP会话是非常昂贵的开销.假设每个线程都需要自行连接到RabbitMQ服务器.将会导致高峰期连接数很高.导致连接资源不够用,造成性能问题.

### 1.3.2. AMQP协议介绍
<a href="#menu" style="float:right">目录</a>

RabbitMQ 就是 AMQP协议的 Erlang 的实现(当然 RabbitMQ 还支持 STOMP2 、 MQTT3 等协议 ) AMQP 的模型架构和 RabbitMQ 的模型架构是一样的，生产者将消息发送给交换器，交换器和队列绑定 。当生产者发送消息时所携带的 RoutingKey 与绑定时 的 BindingKey 相匹配时，消息即被存入相应的队列之中 。 消费者可以订阅相应的队列来获取消息 。

RabbitMQ 中的交换器、交换器类型、队列、绑定 、路由键等都是遵循的 AMQP 协议中相应的概念

AMQP 协议本身包括三层。
* Module Layer: 位于协议最高层，主要定义了一些供客户端调用的命令，客户端可以利用这些命令实现自己的业务逻辑。例如，客户端可以使用 Queue . Declare 命令声明一个队列或者使用 Basic.Consume 订阅消费一个队列中的消息。
* Session Layer: 位于中间层，主要负责将客户端的命令发送给服务器，再将服务端的应答返回给客户端，主要为客户端与服务器之间的通信提供可靠性同步机制和错误处理。
* Transport Layer: 位于最底层，主要传输二进制数据流 ，提供帧的处理、信道复用、错误检测和数据表示等。

AMQP 说到底还是一个通信协议，通信协议都会涉及报文交互，从 low-level 举例来说，AMQP 本身是应用层的协议，其填充于 TCP 协议层的数据部分。而从 high-level 来说， AMQP是通过协议命令进行交互的。 AMQP 协议可以看作一系列结构化命令的集合，这里的命令代表一种操作，类似于 HTTP 中的方法 (GET、 POST 、 PUT、 DELETE 等) 。

#### 1.3.2.1. AMQP生产者流转过程
<a href="#menu" style="float:right">目录</a>

#### 1.3.2.2. AMQP消费者流转过程
<a href="#menu" style="float:right">目录</a>

### 1.3.3. 配置
<a href="#menu" style="float:right">目录</a>

RabbitMQ提供了三种方式来定制化服务:
(1)环境变量(EnviromentVariables).RabbitMQ服务端参数可以通过环境变量进行配置，例如，节点名称、RabbitMQ配直文件的地址、节点内部通信端口等。
(2)配直文件(ConfigurationFile).可以定义RabbitMQ服务和插件设直，例如，TCP监听端口，以及其他网络相关的设直、内存限制、磁盘限制等。
(3)运行时参数和策略(RuntimeParametersandPolicies)。可以在运行时定义集群层面的服务设直.

#### 1.3.3.1. 环境变量
<a href="#menu" style="float:right">目录</a>

#### 1.3.3.2. 配置文件
<a href="#menu" style="float:right">目录</a>

#### 1.3.3.3. 参数和策略
<a href="#menu" style="float:right">目录</a>



## 1.4. 客户端开发
<a href="#menu" style="float:right">目录</a>


### 1.4.1. 依赖

```xml
 <dependency>
    <groupId>com.rabbitmq</groupId>
    <artifactId>amqp-client</artifactId>
    <version>5.5.1</version>
</dependency>
```

### 1.4.2. 连接RabbitMQ
<a href="#menu" style="float:right">目录</a>

```java
//获取工厂类
ConnectionFactory factory = new ConnectionFactory();
//设置连接信息
factory.setUsername("lgj");
factory.setPassword("lgj");
factory.setHost(HOST);
factory.setPort(PORT);
factory.setVirtualHost("/blog");
//获取连接
Connection connection = factory.newConnection();  
//通过连接获取channel
Channel channel = connection.createChannel();

```

Connection 可以 用来创建多个 Channel 实例，但是 Channel 实例不能在线程问共享，应用程序应该为每一个线程开辟一个 Channel 。某些情况下 Channel 的操作可以并发运行，但是在其他情况下会导致在网络上出现错误的通信帧交错，同时也会影响友送方确认( publisherconfrrm)机制的运行，所以多线程问共享 Channel 实例是非线程安全的 。




### 1.4.3. 使用交换器和队列
<a href="#menu" style="float:right">目录</a>

**创建交换器**
```java
//创建一个交换器
AMQP.Exchange.DeclareOk declareOk = channel.exchangeDeclare(EXCHANGE_NAME,ExchangeType.DIRECT_TYPE,true,false,null);
//创建一个队列
AMQP.Queue.DeclareOk queueOk =  channel.queueDeclare(QUEUE_NAME,true,false,false,null);
//通过绑定键将队列和交换器绑定
channel.queueBind(QUEUE_NAME,EXCHANGE_NAME,ROUTING_KEY);
```

```JAVA
 public DeclareOk exchangeDeclare(String exchange, BuiltinExchangeType type, boolean durable, boolean autoDelete, boolean internal, Map<String, Object> arguments) throws IOException {
        return this.exchangeDeclare(exchange, type.getType(), durable, autoDelete, internal, arguments);
    }
```
* exchange : 交换器的名称。
* type : 交换器的类型，常见的如 fanout、 direct 、 topic
* durable: 设置是否持久化 。 durable 设置为 true 表示持久化， 反之是非持久化 。持久化可以将交换器存盘，在服务器重启 的时候不会丢失相关信息。
* autoDelete : 设置是否自动删除。 autoDelete 设置为 true 则表示自动删除。自动删除的前提是至少有一个队列或者交换器与这个交换器绑定 ， 之后所有与这个交换器绑定的队列或者交器都与此解绑。注意不能错误地把这个参数理解为 : "当与此交换器连接的客户端都断开时 ， RabbitMQ 会自动删除本交换器 "。
* internal : 设置是否是内置的。如果设置为 true ，则表示是内置的交换器，客户端程序无法直接发送消息到这个交换器中，只能通过交换器路由到交换器这种方式。
* argument : 其他一些结构化参数，比如 alternate - exchange

上面的是同步创建,下面是异步创建交换器.
一般不建议使用,有可能客户端调用完之后,立即使用这个交换器,但是服务端还未创建完成,这时会抛出异常.
```JAVA
public void exchangeDeclareNoWait(String exchange, String type, boolean durable, boolean autoDelete, boolean internal, Map<String, Object> arguments) throws IOException {
    RecordedExchange x = (new RecordedExchange(this, exchange)).type(type).durable(durable).autoDelete(autoDelete).arguments(arguments);
    this.recordExchange(exchange, x);
    this.delegate.exchangeDeclareNoWait(exchange, type, durable, autoDelete, internal, arguments);
}
```

**创建队列**

```java
public com.rabbitmq.client.AMQP.Queue.DeclareOk queueDeclare(String queue, boolean durable, boolean exclusive, boolean autoDelete, Map<String, Object> arguments) throws IOException {
    com.rabbitmq.client.AMQP.Queue.DeclareOk ok = this.delegate.queueDeclare(queue, durable, exclusive, autoDelete, arguments);
    this.recordQueue(ok, queue, durable, exclusive, autoDelete, arguments);
    return ok;
}

public void queueDeclareNoWait(String queue, boolean durable, boolean exclusive, boolean autoDelete, Map<String, Object> arguments) throws IOException {
    RecordedQueue meta = (new RecordedQueue(this, queue)).durable(durable).exclusive(exclusive).autoDelete(autoDelete).arguments(arguments);
    this.delegate.queueDeclareNoWait(queue, durable, exclusive, autoDelete, arguments);
    this.recordQueue(queue, meta);
}

```
* queue : 队列的名称。
* durable: 设置是否持久化。为 true 则设置队列为持久化。持久化的队列会存盘，在服务器重启的时候可以保证不丢失相关信息。
* exclusive : 设置是否排他。为 true 则设置队列为排他的。如果一个队列被声明为排他队列，该队列仅对首次声明它的连接可见，并在连接断开时自动删除。这里需要注意三点:排他队列是基于连接( Connection) 可见的，同一个连接的不同信道 (Channel)是可以同时访问同一连接创建的排他队列; "首次"是指如果一个连接己经声明了 一个排他队列，其他连接是不允许建立同名的排他队列的，这个与普通队列不同:即使该队列是持久化的，一旦连接关闭或者客户端退出，该排他队列都会被自动删除，这种队列适用于一个客户端同时发送和读取消息的应用场景。
* autoDelete: 设置是否自动删除。为 true 则设置队列为自动删除。自动删除的前提是:至少有一个消费者连接到这个队列，之后所有与这个队列连接的消费者都断开时，才会自动删除。不能把这个参数错误地理解为: "当连接到此队列的所有客户端断开时，这个队列自动删除"，因为生产者客户端创建这个队列，或者没有消费者客户端与这个队列连接时，都不会自动删除这个队列。
* argurnents: 设置队列的其他一些参数，如 x-rnessage-ttl 、 x-expires ,x -rnax-length 、 x-rnax-length-bytes 、 x-dead-letter-exchange 、x-deadletter-routing-key, x-rnax-priority 等。

生产者和消费者都能够使用 queueDeclare 来声明一个队列，但是如果消费者在同一个信道上订阅了另一个队列，就无法再声明队列了。必须先取消订阅，然后将信道直为"传输"模式，之后才能声明队列。


**queueBind 方法详解**

将队列和交换器绑定 的方法
```java
public com.rabbitmq.client.AMQP.Queue.BindOk queueBind(String queue, String exchange, String routingKey, Map<String, Object> arguments) throws IOException {
    com.rabbitmq.client.AMQP.Queue.BindOk ok = this.delegate.queueBind(queue, exchange, routingKey, arguments);
    this.recordQueueBinding(queue, exchange, routingKey, arguments);
    return ok;
}
```

* queue: 队列名称:
* exchange: 交换器的名称:
* routingKey: 用来绑定队列和交换器的路由键;
* argument: 定义绑定的一些参数。

**exchangeBind 方法详解**

我们不仅可以将交换器与队列绑定，也可以将交换器与交换器绑定，后者和前者的用法如出一辙

```java
 public BindOk exchangeBind(String destination, String source, String routingKey, Map<String, Object> arguments) throws IOException {
    BindOk ok = this.delegate.exchangeBind(destination, source, routingKey, arguments);
    this.recordExchangeBinding(destination, source, routingKey, arguments);
    return ok;
}
```

**何时创建**

RabbitMQ 的消息存储在队列中，交换器的使用 并不真正耗费服务器的性能，而队列会。如果要衡量 RabbitMQ当前的QPS只需看队列的即可。在实际业务应用中，需要对所创建的队列的流量、内存占用及网卡占用有一个清晰的认知，预估其平均值和峰值，以便在固定硬件资源的情况下能够进行合理有效的分配。

按照 RabbitMQ 官方建议，生产者和消费者都应该尝试创建(这里指声明操作)队列。这是一个很好的建议，但不适用于所有的情况。如果业务本身在架构设计之初己经充分地预估了队列的使用情况，完全可以在业务程序上线之前在服务器上创建好(比如通过页面管理、 RabbitMQ命令或者更好的是从配置中心下发)，这样业务程序也可以免去声明的过程，直接使用即可。

预先创建好资源还有一个好处是，可以确保交换器和队列之间正确地绑定匹配。很多时候，由于人为因素、代码缺陷等，发送消息的交换器并没有绑定任何队列，那么消息将会丢失:或者交换器绑定了某个队列，但是发送消息时的路由键无法与现存的队列匹配，那么消息也会丢失。当然可以配合 mandatory 参数或者备份交换器(详细可参考 4.1节〉来提高程序的健壮性。

与此同时，预估好队列的使用情况非常重要，如果在后期运行过程中超过预定的阔值，可以根据实际情况对当前集群进行扩容或者将相应的队列迁移到其他集群。迁移的过程也可以对业务程序完全透明。此种方法也更有利于开发和运维分工，便于相应资源的管理。

如果集群资源充足，而即将使用的队列所占用的资源又在可控的范围之内，为了增加业务程序的灵活性，也完全可以在业务程序中声明队列。至于是使用预先分配创建资源的静态方式还是动态的创建方式，需要从业务逻辑本身、公司运维体系和公司硬件资源等方面考虑。

### 1.4.4. 发送消息
<a href="#menu" style="float:right">目录</a>

```java

//普通方式
channe1.basicPub1ish(exchangeName , rout 工 ngKey ， mandatory,MessageProperties.PERSISTENT TEXT PLAIN,messageBodyBytes);

//BasicPropertie构建属性
channe1.basicPub1ish(exchangeName , routingKey,
    new AMQP.BasicProperties.Builder()
    .contentType("text/p1ain")
    .deliveryMode(2)
    .priority (1)
    .userld( "hidden " )
    .build()) ,
    messageBodyBytes) ;

//带有 headers 的消息
Map<String, Object> headers = new HashMap<String, Object>() ;
headers.put( "loca1tion" , "here " );
headers . put( " time " , " today" );
channel.basicPublish(exchangeName ， routingKey ，
    new AMQP.BasicProperties.Builder()
    .headers(headers)
    .build()) ,
    messageBodyBytes) ;

```

```java
public void basicPublish(String exchange, String routingKey, boolean mandatory, boolean immediate, BasicProperties props, byte[] body) throws IOException {
    this.delegate.basicPublish(exchange, routingKey, mandatory, immediate, props, body);
}
```

* exchange: 交换器的名称，指明消息需要发送到哪个交换器中 。 如果设置为空字符串，则消息会被发送到 RabbitMQ 默认的交换器中。
* routingKey : 路由键，交换器根据路由键将消息存储到相应的队列之中 。
* props : 消息的基本属性集，其包含 14 个属性成员，分别有 contentType 、contentencoding 、headers ( Map<String ， Object>)、deliveryMode、priority 、correlationld 、 replyTo 、 expiration 、 messageld、 timestamp 、type 、 userld 、appld 、 clusterId。其中常用的几种都在上面的示例中进行了演示 。
* byte[] body : 消息体 ( pay1oad ) ，真正需要发送的消息 。
* mandatory 和工mmediate 的详细内容


### 1.4.5. 消费消息
<a href="#menu" style="float:right">目录</a>

RabbitMQ 的消费模式分两种 : 推 ( Push )模式和拉 ( Pull )模式 。 推模式采用 Basic.Consume进行消费，而拉模式则是调用 Basic.Get 进行消费。

推模式由RabbitMQ向消费者推送数据.
而拉模式由消费者主动向RabbitMQ获取数据.

#### 1.4.5.1. 推模式
<a href="#menu" style="float:right">目录</a>

```JAVA
public void  recdata() throws Exception{

    final  Channel  channel = connection.createChannel();
    //
    channel.basicQos(64);
    Consumer consumer  = new DefaultConsumer(channel) {
        @Override
        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
            // System.out.println("接收到的数据：" + new String(body));

            User obj = serialize.deserialize(body,User.class);

            System.out.println("接收到的数据：" +obj.toString());

            channel.basicAck(envelope.getDeliveryTag(),false);
        }

    };
    channel.basicConsume(QUEUE_NAME,consumer);
}
```
```java

public String basicConsume(String queue, boolean autoAck, String consumerTag, boolean noLocal, boolean exclusive, Map<String, Object> arguments, DeliverCallback deliverCallback, CancelCallback cancelCallback, ConsumerShutdownSignalCallback shutdownSignalCallback) throws IOException {
        return this.basicConsume(queue, autoAck, consumerTag, noLocal, exclusive, arguments, this.consumerFromDeliverCancelShutdownCallbacks(deliverCallback, cancelCallback, shutdownSignalCallback));
    }
```
* queue : 队列的名称:
* autoAck : 设置是否自动确认。建议设成 false ，即不自动确认:
* consumerTag: 消费者标签，用来区分多个消费者:
* noLocal : 设置为 true 则表示不能将同一个 Connectio口中生产者发送的消息传送给这个 Connection 中的消费者:
* exclusive : 设置是否排他 :
* arguments : 设置消费者的其他参数:
* callback : 设置消费者的回调函数。可以在创建consumer时重写DefaultConsumer相关方法进行处理
    * deliverCallback
    * cancelCallback
    * shutdownSignalCallback

每个 Channel 都拥有自己独立的线程。最常用的做法是一个 Channel 对应一个消费者，也就是意味着消费者彼此之间没有任何关联。当然也可以在一个 Channel 中维持多个消费者，但是要注意一个问题，如果 Channel 中的一个消费者一直在运行，那么其他消费者的 callback会被"耽搁"。

#### 1.4.5.2. 拉模式
<a href="#menu" style="float:right">目录</a>

```java
public void pushMode()throws Exception{
    final  Channel  channel = connection.createChannel();
    GetResponse response = channel.basicGet(QUEUE_NAME, false) ;
    System.out.println(new String(response.getBody()));
    channel .basicAck(response.getEnvelope().getDeliveryTag() , false);
}
```
通过 channel.basicGet方法可以单条地获取消息，其返回值是GetRespone . Channel 类的 basicGet 方法没有其他重载方法，只有 :GetResponse basicGet(String queue , boolean autoAck) throws IOException;
其中 queue 代表队列的名称，如果设置 autoAck 为 false ， 那么同样需要调用channel.basicAck 来确认消息己被成功接收。

Basic.Consume 将信道 (Channel) 设置为接收模式，直到取消队列的订阅为止。在接收模式期间， RabbitMQ 会不断地推送消息给消费者，当然推送消息的个数还是会受到 Basic.Qos的限制.如果只想从队列获得单条消息而不是持续订阅，建议还是使用 Basic.Get 进行消费.但是不能将 Basic.Get 放在一个循环里来代替 Basic.Consume ，这样做会严重影响 RabbitMQ的性能.如果要实现高吞吐量，消费者理应使用 Basic.Consume 方法。



### 1.4.6. 消息端的确认和拒绝
<a href="#menu" style="float:right">目录</a>

为了保证消息从队列可靠地达到消费者， RabbitMQ 提供了消息确认机制( messageacknowledgement) 。 消费者在订阅队列时，可以指定 autoAck 参数，当 autoAck 等于 false时， RabbitMQ 会等待消费者显式地回复确认信号后才从内存(或者磁盘)中移去消息(实质上是先打上删除标记，之后再删除) 。当 autoAck 等于 true 时， RabbitMQ 会自动把发送出去的消息置为确认，然后从内存(或者磁盘)中删除，而不管消费者是否真正地消费到了这些消息 。

采用消息确认机制后，只要设置 autoAck 参数为 false，消费者就有足够的时间处理消息(任务) ，不用担心处理消息过程中消费者进程挂掉后消息丢失的问题 ， 因为 RabbitMQ 会一直等待持有消息直到消费者显式调用 Basic.Ack 命令为止 。

```java
public void basicAck(long deliveryTag, boolean multiple) throws IOException {
    this.delegate.basicAck(deliveryTag, multiple);
}
```
当autoAck参数置为false，对于RabbitMQ 服务端而言，队列中的消息分成了两个部分 :一部分是等待投递给消费者的消息:一部分是己经投递给消费者，但是还没有收到消费者确认信号的消息。如果 RabbitMQ 一直没有收到消费者的确认信号，并且消费此消息的消费者己经断开连接，则 RabbitMQ 会安排该消息重新进入队列，等待投递给下一个消费者，当然也有可能还是原来的那个消费者。

RabbitMQ 不会为未确认的消息设置过期时间，它判断此消息是否需要重新投递给消费者的唯一依据是消费该消息的消费者连接是否己经断开，这么设计的原因是 RabbitMQ 允许消费者消费一条消息的时间可以很久很久。


可以通过basicReject来拒绝消息.服务器收到该请求之后,会将消息重新投递.
```java
 public void basicReject(long deliveryTag, boolean requeue) throws IOException {
    this.delegate.basicReject(deliveryTag, requeue);
}

```
其中 deliveryTag 可以看作消息的编号 ，它是一个 64 位的长整型值，最大值是9223372036854775807 。如果 requeue 参数设置为 true ，则 RabbitMQ 会重新将这条消息存入队列，以便可以发送给下一个订阅的消费者;如果 requeue 参数设置为 false，则 RabbitMQ立即会把消息从队列中移除，而不会把它发送给新的消费者。

Basic.Reject 命令一次只能拒绝一条消息 ，如果想要批量拒绝消息，则可以使用Basic.Nack 这个命令 。 消费者客户端可以调用 channel.basicNack 方法来实现，方法定义如下:

```java
void basicNack(long deliveryTag, boolean multiple, boolean requeue) throws IOException;
```
其中 deliveryTag 和 requeue的含义可以参考basicReject 方法。multiple参数设置为false则表示拒绝编号为deliveryT坷的这一条消息，这时候basicNack和basicReject 方法一样; multiple 参数设置为 true 则表示拒绝 deliveryTag 编号之前所有未被当前消费者确认的消息。

对于 requeue ， AMQP 中还有一个命令 Basic.Recover 具备可重入队列的特性 。其对应的客户端方法为:
(1) Basic.RecoverOk basicRecover() throws IOException;
(2) Basic.RecoverOk basicRecover(boolean requeue) throws IOException;
这个 channel.basicRecover 方法用来请求 RabbitMQ 重新发送还未被确认的消息 。 如果 requeue 参数设置为 true ，则未被确认的消息会被重新加入到队列中，这样对于同一条消息来说，可能会被分配给与之前不同的消费者。如果 requeue 参数设置为 false，那么同一条消息会被分配给与之前相同的消费者。默认情况下，如果不设置 requeue 这个参数，相当于channel.basicRecover(true) ，即 requeue 默认为 true



### 1.4.7. 关闭连接
<a href="#menu" style="float:right">目录</a>

在应用程序使用完之后，需要关闭连接，释放资源:
channel.close();
conn.close() ;
显式地关闭 Channel 是个好习惯，但这不是必须的，在 Conection 关闭的时候，Channel 也会自动关闭。

AMQP 协议中的 C on口 ection 和 Channel 采用 同样的方式来管理网络失败、内部错误和显式地关闭连接。 Connection 和 Channel 所具备的生命周期如下所述。
* Open : 开启状态，代表当前对象可以使用。
* Closi 口 g : 正在关闭状态。当前对象被显式地通知调用关闭方法( shutdown) ，这样就产生了一个关闭请求让其内部对象进行相应的操作， 并等待这些关闭操作的完成。
* Closed : 已经关闭状态。当前对象己经接收到所有的内部对象己完成关闭动作的通知，并且其也关闭了自身。

Connection 和 Channel 最终都是会成为 Closed 的状态，不论是程序正常调用的关闭方法，或者是客户端的异常，再或者是发生了网络异常。
在 Connection 和 Channel 中，与关闭相关的方法有 addShutdownListener(ShutdownListener listener) 和 removeShutdownListener (ShutdownListnerlistener) 。当 Connection 或者 Channel 的状 态转变为 Closed 的时候会调用ShutdownListener 。而且如果将一个 ShutdownListener 注册到一个己经处于 Closed状态的对象(这里特指 Connection 和 Channel 对象)时，会立刻调用 ShutdownListener 。

getCloseReason 方法可以让你知道对象关闭的原因 ; isOpen 方法检测对象当前是否处于开启状态; close(int closeCode , String closeMessage ) 方法显式地通知当前对象执行关闭操作 。

```java
channel.addShutdownListener(new ShutdownListener() {
    @Override
    public void shutdownCompleted(ShutdownSignalException e) {


    }
});
public class ShutdownSignalException extends RuntimeException implements SensibleClone<ShutdownSignalException> {
    private static final long serialVersionUID = 1L;

    //isHardError 方法可以知道是 Collectio丑的还是 Channel 的错误;
    private final boolean _hardError;
    private final boolean _initiatedByApplication;
    //异常相关信息
    private final Method _reason;
    private final Object _ref;
}
```


## 1.5. 进阶
<a href="#menu" style="float:right">目录</a>

### 1.5.1. 参数mandatory 和 immediate介绍
<a href="#menu" style="float:right">目录</a>

mandatory 和 immediate 是 channel . basicPublish 方法中的两个参数，它们都有当消息传递过程中不可达目的地时将消息返回给生产者的功能。 RabbitMQ 提供的备份交换器(Altemate Exchange) 可以将未能被交换器路由的消息(没有绑定队列或者没有匹配的绑定〉存储起来，而不用返回给客户端。

**mandatory**
当 mandatory 参数设为 true 时，交换器无法根据自身的类型和路由键找到一个**符合条件的队列**，那么 RabbitMQ 会调用 Basic.Return 命令将消息返回给生产者 。当 mandatory 参数设置为 false 时，出现上述情形，则消息直接被丢弃 。

以通过调用channel.addReturnListener 来添加 ReturnListener 监昕器实现获取到没有被正确路由到合适队列的消息.

```java
channel.addReturnListener(new ReturnListener() {
    public void handleReturn(int replyCode, String replyText,
                                String exchange, String routingKey,
                                AMQP.BasicProperties basicProperties,
                                byte[] body) throws IOException {
        String message = new String(body);
        System.out.println("Basic.Return 返回的结果是: " + message);
    }
});
```
**immediate**

当 imrnediate 参数设为 true 时，如果交换器在将消息路由到队列时发现**队列上并不存在任何消费者**，那么这条消息将不会存入队列中。当与路由键匹配的所有队列都没有消费者时 ，该消息会通过 Basic.Return 返回至生产者。

概括来说 ， ma口datory 参数告诉服务器至少将该消息路由到一个队列 中， 否则将消息返回给生产者。 imrnediate 参数告诉服务器 ， 如果该消息关联的队列上有消费者， 则 立刻投递:
如果所有匹配的队列上都没有消费者，则直接将消息返还给生产者 ， 不用将消息存入队列而等待消费者了。

RabbitMQ 3.0版本开始去掉了对imrnediate参数的支持，对此 RabbitMQ 官方解释是 :imrnediate 参数会影响镜像队列的性能，增加了代码复杂性，建议采用 TTL 和 DLX 的方法替代

### 1.5.2. 备份交换器
<a href="#menu" style="float:right">目录</a>

备份交换器，英文名称为 Altemate Exchange，简称庙，或者更直白地称之为"备胎交换器"。
生产者在发送消息的时候如果不设置 mandatory 参数 ， 那么消息在未被路由的情况下将会丢失 :如果设置了 mandatory 参数，那么需要添加 ReturnListener 的编程逻辑，生产者的代码将
变得复杂。如果既不想复杂化生产者的编程逻辑，又不想消息丢失，那么可以使用备份交换器，这样可以将未被路由的消息存储在 RabbitMQ 中，再在需要的时候去处理这些消息。

可以通过在声明交换器(调用 channel.exchangeDeclare 方法)的时候添加alternate-exchange 参数来实现
```java
Map<String, Object> args = new HashMap<String, Object>();
args.put("a1ternate-exchange" , "myAe");
channe1.exchangeDec1are( "norma1Exchange" , "direct" , true , fa1se , args);
channe1 . exchangeDec1are( "myAe " , "fanout" , true, fa1se , nu11) ;
channe1 .queueDec1are( "norma1Queue " , true , fa1se , fa1se , nu11);
channe1 .queueB 工 nd( " norma1Queue " ， " norma1Exchange" , " norma1Key");
channe1 .queueDec1are( "unroutedQueue " , true , fa1se , fa1se , nu11);
```
上面的代码中声明了两个交换器 nonnallixchange 和 myAe，分别绑定了 nonnalQueue 和umoutedQueue 这两个队列

如果此时发送一条消息到 nonnalExchange 上，当路由键等于" nonnalKey" 的时候，消息能正确路由到 nonnalQueue 这个队列中。如果路由键设为其他值，比如 "errorKey飞即消息不能被正确地路由到与 nonnallixchange 绑定的任何队列上，此时就会发送给 myAe，进而发送到 unroutedQueue 这个队列 

备份交换器其实和普通的交换器没有太大的区别，为了方便使用，建议设置为 fanout 类型，如若读者想设置为 direct 或者 topic 的类型也没有什么不妥。需要注意的是，消息被重新发送到备份交换器时的路由键和从生产者发出的路由键是一样的。

考虑这样一种情况，如果备份交换器的类型是 direct ， 并且有一个与其绑定的队列，假设绑定的路由键是 keyl ， 当某条携带路由键为 key2 的消息被转发到这个备份交换器的时候，备份交换器没有匹配到合适的队列，则消息丢失。如果消息携带的路由键为 keyl，则可以存储到队列中。

对于备份交换器，总结了以下几种特殊情况:
* 令如果设置的备份交换器不存在，客户端和 RabbitMQ 服务端都不会有异常出现，此时消息会丢失。
* 令如果备份交换器没有绑定任何队列，客户端和 RabbitMQ 服务端都不会有异常出现，此时消息会丢失。
* 令如果备份交换器没有任何匹配的队列，客户端和 RabbitMQ 服务端都不会有异常出现，此时消息会丢失。
* 如果备份交换器和 mandatory 参数一起使用，那么 mandatory 参数无效。



### 1.5.3. 过期时间TTL
<a href="#menu" style="float:right">目录</a>

RabbitMQ 可以对消息和队列设置 TTL 。

#### 1.5.3.1. 设置消息的过期时间
<a href="#menu" style="float:right">目录</a>

* 目前有两种方法可以设置消息的 TTL
    * 第一种方法是通过**队列属性**设置，队列中所有消息都有相同的过期时间。
    * 第二种方法是对**消息本身**进行单独设置，每条消息的 TTL 可以不同。
    * 如果两种方法一起使用，则消息的 TTL 以两者之间较小的那个数值为准。
    * 消息在队列中的生存时间一旦超过设置 的 TTL 值时，就会变成"死信" (Dead Message) ，消费者将无法再收到该消息

通过队列属性设置消息 TTL 的方法是在 channel.queueDeclare 方法中加入x-message -ttl 参数实现的，这个参数的单位是毫秒。

```java
Map<String, Object> argss = new HashMap<String , Object>();
argss.put("x-message-ttl " , 6000);
channel.queueDeclare(queueName , durable , exclusive , autoDelete , argss) ;
```
如果不设置 TTL.则表示此消息不会过期 ;如果将 TTL 设置为 0，则表示除非此时可以直接将消息投递到消费者，否则该消息会被立即丢弃

针对每条消息设置 TTL 的方法是在 channel.basicPublish 方法中加入 expiration的属性参数，单位为毫秒。

```java
AMQP.BasicProperties.Builder builder = new AMQP.BasicProperties.Builder();
builder.deliveryMode(2); / / 持久化消息
builder.expiration("60000" );/ / 设置 TTL=60000ms
AMQP.BasicProperties properties = builder.build() ;
channel.basicPublish(exchangeName, routingKey, mandatory, properties ,"ttlTestMessage".getBytes());

//或者
AMQP.BasicProperties properties = new AMQP.BasicProperties() ;
Properties.setDeliveryMode(2);
properties.setExpiration("60000");
channel.basicPublish (exchangeName,routingKey,mandatory，properties，"ttlTestMessage".getBytes());
```
对于第一种设置队列 TTL 属性的方法，一旦消息过期，就会从队列中抹去，而在第二种方法中，即使消息过期，也不会马上从队列中抹去，因为每条消息是否过期是在即将投递到消费者之前判定的。
因为第一种方法里，队列中己过期的消息肯定在队列头部， RabbitMQ 只要定期从队头开始扫描是否有过期的消息即可。而第二种方法里，每条消息的过期时间不同，如果要删除所有过期消息势必要扫描整个队列，所以不如等到此消息即将被消费时再判定是否过期 ， 如果过期再进行删除即可。

#### 1.5.3.2. 设置队列的过期时间
<a href="#menu" style="float:right">目录</a>

通过 channel.queueDeclare 方法中的 x-expires 参数可以控制队列被自动删除前处于未使用状态的时间。未使用的意思是队列上没有任何的消费者，队列也没有被重新声明，并且在过期时间段内也未调用过 Basic.Get 命令。

```java
Map<String, Object> args = new HashMap<String, Object>{) ;
args.put( "x-expires" , 1800000);
channel.queueDeclare("myqueue " , false , false , false , args) ;

```

RabbitMQ 会确保在过期时间到达后将队列删除，但是不保障删除的动作有多及时 。在RabbitMQ 重启后，持久化的队列的过期时间会被重新计算。
用于表示过期时间的 x-expires 参数以毫秒为单位 ， 井且服从和 x-message-ttl 一样的约束条件，不过不能设置为 0。比如该参数设置为 1 000 ，则表示该队列如果在 1 秒钟之内未使用则会被删除。


### 1.5.4. 死信队列
<a href="#menu" style="float:right">目录</a>


DLX ，全称为 Dead-Letter-Exchange ，可以称之为死信交换器，也有人称之为死信邮箱。当消息在一个队列中变成死信 (dead message) 之后，它能被重新被发送到另一个交换器中，这个
交换器就是 DLX，绑定 DLX 的队列就称之为死信队列。

消息变成死信一般是由于以下几种情况:
* 消息被拒绝 (Basic.Reject/Basic.Nack) ，井且设置 requeue 参数为 false;
* 消息过期;
* 队列达到最大长度。
DLX也是一个正常的交换器，和一般的交换器没有区别，它能在任何的队列上被指定，实际上就是设置某个队列的属性。当这个队列中存在死信时，RabbitMQ 就会自动地将这个消息重新发布到设置的 DLX上去 ，进而被路由到另一个队列，即死信队列。可以监听这个队列中的消息、以进行相应的处理，这个特性与将消息的 TTL 设置为 0 配合使用可以弥补 imrnediate 参数的功能。

通过在 channel.queueDeclare 方法中设置 x-dead-letter-exchange 参数来为这个队列添加 DLX (代码清单 4-7 中的 dl x exchange):

```java
channel.exchangeDeclare("dlx_exchange " , "direct "); //创建 DLX: dlx_exchange
Map<String, Object> args = new HashMap<String, Object>();
args.put("x-dead-letter-exchange" , "dlx_exchange");
//为队列 myqueue 添加 DLX
channel.queueDeclare("myqueue", false , false , false , args);
```

也可以为这个 DLX 指定路由键，如果没有特殊指定，则使用原队列的路由键:
```java
args.put("x-dead-letter-routing-key" , "dlx-routing-key");
```

```java
channel.exchangeDeclare("exchange.dlx" , "direct" , true);
channel.exchangeDeclare( "exchange.normal" , "fanout" , true);
Map<String , Object> args = new HashMap<String, Object>( );
args.put("x-message-ttl " , 10000);
args.put( "x-dead-letter-exchange " , "exchang.dlx");
args.put( "x-dead-letter-routing-key", "routingkey");
channe1.queueDec1are( "queue.norma1" , true , fa1se , fa1se , args);
channe1.queueBind( "queue.normal" , "exchange .normal" , "");
channe1.queueDec1are( "queue.d1x" , true , false , false , null) ;
channel.queueBind( "queue.dlx" , "exchange.dlx" , Wroutingkey");
channel.basicPublish( "exchange.normal" , "rk" ,MessageProperties.PERSISTENT_TEXT_PLAIN, "dlx".getBytes()) ;


```
这里创建了两个交换器 exchange.normal 和 exchange.dlx ， 分别绑定两个队列 queue.normal和 queue.dlx 。

生产者首先发送一条携带路由键为 "rk" 的消息，然后经过交换器exchange .normal 顺利地存储到队列 queue.normal 中 。由于队列 queue.normal 设置了过期时间为10s ， 在这 10s 内没有消费者消费这条消息，那么判定这条消息为过期。由于设置了 DLX ， 过期之时 ， 消息被丢给交换器 exchange.dlx 中，这时找到与 exchange.dlx 匹配的队列 queue.dlx，最后消息被存储在 queue.dlx 这个死信队列中。


对于 RabbitMQ 来说， DLX 是一个非常有用的特性 。 它可以处理异常情况下，消息不能够被消费者正确消费(消费者调用了 Basic.Nack 或者 Basic.Reject) 而被置入死信队列中的情况，后续分析程序可以通过消费这个死信队列中的内容来分析当时所遇到的异常情况，进而可以改善和优化系统。 DLX 配合 TTL 使用还可以实现延迟队列的功能


### 1.5.5. 延迟队列
<a href="#menu" style="float:right">目录</a>


延迟队列存储的对象是对应的延迟消息，所谓"延迟消息"是指当消息被发送以后，并不想让消费者立刻拿到消息，而是等待特定时间后，消费者才能拿到这个消息进行消费 

延迟队列的使用场景有很多，比如:
* 令在订单系统中， 一个用户下单之后通常有 3 0 分钟的时间进行支付，如果 30 分钟之内没有支付成功，那么这个订单将进行异常处理，这时就可以使用延迟队列来处理这些订单了 。
* 用户希望通过手机远程遥控家里的智能设备在指定的时间进行工作。这时候就可以将用户指令发送到延迟队列，当指令设定的时间到了再将指令推送到智能设备 。

在 AMQP 协议中，或者 RabbitMQ 本身没有直接支持延迟队列的功能，但是可以通过前面所介绍的 DLX 和 TTL 模拟出延迟队列的功能。

假设一个应用中需要将每条消息都设置为 10 秒的延迟，生产者通过 exchange.normal 这个交换器将发送的消息存储在 queue.normal 这个队列中。消费者订阅的并非是 queue.normal 这个队列，而是 queue.dlx 这个队列 。当消息从 queue.normal 这个队列中过期之后被存入 queue.dlx 这个队列中，消费者就恰巧消费到了延迟 10 秒的这条消息 。



### 1.5.6. 优先级队列
<a href="#menu" style="float:right">目录</a>

优先级队列，顾名思义，具有高优先级的队列具有高的优先权，优先级高的消息具备优先被消费的特权。
可以通过设置队列的 x -max -priority 参数来实现

```java
Map<String, Object> args = new HashMap<String, Object>() ;
//设置最大优先级
args.put( "x-max-priority" , 10) ;
channel.queueDeclare( "queue.priority" , true, fa1se , false , args) ;
```
发送数据
```java
AMQP.BasicProperties.Bui1der builder = new AMQP.BasicProperties.Builder();
//指定消息优先级,如果不设置,默认为0
builder.priority(5) ;
AMQP.BasicProperties properties = builder.build () ;
channel.basicPub1ish( "exchange_priority" , " rk_priority " , properties , "messages".getBytes () ) ;
```
优先级高的消息可以被优先消费，这个也是有前提的:如果在消费者的消费速度大于生产者的速度且Broker中没有消息堆积的情况下，对发送的消息设置优先级也就没有什么实际意义。因为生产者刚发送完一条消息就被消费者消费了，那么就相当于 Broker 中至多只有一条消息，对于单条消息来说优先级是没有什么意义的。




### 1.5.7. RPC实现
<a href="#menu" style="float:right">目录</a>


### 1.5.8. 持久化
<a href="#menu" style="float:right">目录</a>

* 交换器持久化
    * 声明队列时将 durable 参数置为 true 
    * 如果交换器不设置持久化，那么在 RabbitMQ 服务重启之后，相关的交换器元数据会丢失
    * 由于消息存放在队列中,因此消息不会丢失，只是不能将消息发送到这个交换器中。
    * 对一个长期使用的交换器来说，建议将其置为持久化的。

* 队列的持久化
    * 声明队列时将 durable 参数置为 true 
    * 如果队列不设置持久化，那么在 RabbitMQ 服务重启之后，相关队列的元数据会丢失，此时数据也会丢失
    * 队列的持久化能保证其本身的元数据不会因异常情况而丢失，但是并不能保证内部所存储的消息不会丢失,消息也必须实现持久化

* 消息持久化
    * 通过将消息的投递模式(BasicProperties 中的 deliveryMode 属性)设置为 2 即可实现消息的持久化
    * 前面示例中多次提及的 MessageProperties.PERSISTENT_TEXT_PLAIN 实际上是封装了这个属性 

可以将所有的消息都设直为持久化，但是这样会严重影响 RabbitMQ 的性能(随机)。写入磁盘的速度比写入内存的速度慢得不只一点点。对于可靠性不是那么高的消息可以不采用持久化处理以提高整体的吞吐量。在选择是否要将消息持久化时，需要在可靠性和吐吞量之间做一个权衡。

将交换器、队列、消息都设置了持久化之后就能百分之百保证数据不丢失了吗?答案是否定的 。
首先从消费者来说，如果在订阅消费队列时将 autoAck 参数设置为 true，那么 当消费者接收到相关消息之后，还没来得及处理就看机了，这样也算数据丢失。这种情况很好解决，将autoAck 参数设置为 false ， 并进行手动确认.
其次，在持久化的消息正确存入RabbitMQ之后，还需要有一段时间(虽然很短，但是不可忽视)才能存入磁盘之中。RabbitMQ 并不会为每条消息都进行同步存盘(调用内核的 fsync方法)的处理，可能仅仅保存到操作系统缓存之中而不是物理磁盘之中。如果在这段时间内RabbitMQ 服务节点发生了岩机、重启等异常情况，消息保存还没来得及落盘，那么这些消息将会丢失。

这个问题怎么解决呢?这里可以引入 RabbitMQ 的镜像队列机制，相当于配置了副本，如果主节点 C master ) 在此特殊时间内挂掉，可以自动切换到从节点 Cslave ),这样有效地保证了高可用性，除非整个集群都挂掉。虽然这样也不能完全保证 RabbitMQ 消息不丢失，但是配置了镜像队列要比没有配置镜像队列的可靠性要高很多，在实际生产环境中的关键业务队列一般都会设置镜像队列。

还可以在发送端引入事务机制或者发送方确认机制来保证消息己经正确地发送并存储至RabbitMQ 中，前提还要保证在调用 channel.basicPublish 方法的时候交换器能够将消息正确路由到相应的队列之中。

### 1.5.9. 生产者确认
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.1. 事务机制
<a href="#menu" style="float:right">目录</a>

RabbitMQ客户端中与事务机制相关的方法有 三 个: channel.txSelect 、channel.txCommit 和 channel.txRollbacko channel.txSelect 用于将当前的信道设置成事务模式
* 在通过 channel.txSelect 方法开启事务之后，我们便可以发布消息给 RabbitMQ 了
* channel.txCommit 用于提交事务
* channel.txRollback 用于事务回滚。
如果事务提交成功，则消息一定到达了RabbitMQ 中，如果在事务提交执行之前由于 RabbitMQ异常崩溃或者其他原因抛出异常，这个时候我们便可以将其捕获，进而通过执行channel.txRollback 方法来实现事务回滚。注意这里的 RabbitMQ 中的事务机制与大多数数据库中的事务概念井不相同，需要注意区分。

```java
try {
    channel.txSelect() ;
    channel.basicPublish(exchange, rout 工口gKey ，
    MessageProperties . PERSISTENT TEXT PLAIN , msg.getBytes());
    int result = 1 / 0 ;
    channel . txCommit() ;
}
 catch (Exception e) {
    e.printStackTrace();
    channel.txRollback();
 }

```
如果要发送多条消息，则将 channel.basicPublish 和 channel.txCommit 等方法包裹进循环内即可，可以参考如下示例代码，

```java
channel.txSelect();
for (int i=O ; i<LOOP_TIMES;i++) {
    try {
        channel.basicPublish ("exchange " , "routingKey" , null ,("messages" + i) . getBytes()) ;
        channel.txCommit();
    } catch (IOException e){
        e.printStackTrace();
        channel.txRollback();
    }
}
```

事务确实能够解决消息发送方和 RabbitMQ 之间消息确认的问题，只有消息成功被RabbitMQ 接收，事务才能提交成功，否则便可在捕获异常之后进行事务回滚 ，与此同时可以进行消息重发。但是使用事务机制会"吸干" RabbitMQ 的性能，那么有没有更好的方法既能保证消息发送方确认消息已经正确送达，又能基本上不带来性能上的损失呢?从 AMQP 协议层面来看并没有更好的办法，但是 RabbitMQ 提供了一个改进方案，即发送方确认机制，

#### 1.5.9.2. 发送方确认机制
<a href="#menu" style="float:right">目录</a>

生产者将信道设置成 confirm (确认)模式，一旦信道进入 confirm 模式，所有在该信道上面发布的消息都会被指派一个唯一的 ID(从1开始)，一旦消息被投递到所有匹配的队列之后，RabbitMQ 就会发送一个确认 (Basic.Ack) 给生产者(包含消息的唯一 ID) ，这就使得生产者知晓消息已经正确到达了目的地了。如果消息和队列是可持久化的，那么确认消息会在消息写入磁盘之后发出。 RabbitMQ 回传给生产者的确认消息中的 deliveryTag 包含了确认消息的序号，此外 RabbitMQ 也可以设置 channel.basicAck 方法中的 multiple 参数，表示到这个序号之前的所有消息都己经得到了处理。注意辨别这里的确认和消费时候的确认之间的异同。

事务机制在一条消息发送之后会使发送端阻塞，以等待 RabbitMQ 的回应，之后才能继续发送下一条消息。相比之下 ， 发送方确认机制最大的好处在于它是异步的，一旦发布一条消息，生产者应用程序就可以在等信道返回确认的同时继续发送下一条消息，当消息最终得到确认之后，生产者应用程序便可以通过回调方法来处理该确认消息，如果 RabbitMQ 因为自身内部错误导致消息丢失，就会发送一条 nack (Basic.Nack) 命令，生产者应用程序同样可以在回调方法中处理该 nack 命令。

生产者通过调用 channel . confirmSelect 方法(即 Confirm.Select 命令)将信道设置为 confrrm 模式，之后 RabbitMQ 会返回 Confirm . Select-Ok 命令表示同意生产者将当
前信道设置为 confirm 模式。所有被发送的后续消息都被 ack 或者 nack 一次，不会出现一条消息既被 ack 又被 nack 的情况 ， 并且 RabbitMQ 也并没有对消息被 confrrm 的快慢做任何保证。

```java
channel.confirmSelect(); //将信道置为 publisher confirm 模式
//之后正常发送消息
channel.basicPublish( "exchange" , "routingKey" , null ,"publisher confirm test ".getBytes());
if(!channel.waitForConfirms()) {
    System.out .println( "send message failed " ) ;
}

```

如果发送多条消息，只需要将 channel.basicPublish 和 channel.waitForConfirms 方法包裹在循环里面即可，可以参考事务机制，不过不需要把channel.confirmSelect 方法包裹在循环内部。

如果信道没有开启 publisher confirm 模式，则调用任何 waitForConfirms 方法都会报出java.lang.IllegalStateException 。

```java
public boolean waitForConfirms() throws InterruptedException {
        return this.delegate.waitForConfirms();
}

public boolean waitForConfirms(long timeout) throws InterruptedException, TimeoutException {
    return this.delegate.waitForConfirms(timeout);
}

public void waitForConfirmsOrDie() throws IOException, InterruptedException {
    this.delegate.waitForConfirmsOrDie();
}

public void waitForConfirmsOrDie(long timeout) throws IOException, InterruptedException, TimeoutException {
    this.delegate.waitForConfirmsOrDie(timeout);
}
```
对于没有参数的 waitForConfirms 方法来说，其返回的条件是客户端收到了相应的 Basic.Ack/.Nack 或者被中断。参数 timeout 表示超时时间， 一旦等待RabbitMQ回应超时就会抛出 java.util.concurrent.TimeoutException 的异常。两个 waitForConfirmsOrDie 方法在接收到 RabbitMQ 返回的 Basic.Nack 之后会抛出 java.io.IOException 。业务代码可以根据自身的特性灵活地运用这四种方法来保障消息的可靠发送。

**注意要点**
* 事务机制和 publisher confirm 机制两者是互斥的，不能共存
* 事务和 publisher confirm 机制确保的是消息能够正确地发送至 RabbitMQ ，这里的"发送至 RabbitMQ" 的含义是指消息被正确地发往至 RabbitMQ 的交换器，如果此交换器没有匹配的队列，那么消息也会丢失。所以在使用这两种机制的时候要确保所涉及的交换器能够有匹配的队列 . 更进一步地讲，发送方要配合 mandatory 参数或者备份交换器一起使用来提高消息传输的可靠性 。


publisher confirm的优势在于并不一定需要同步确认.其他优化方法
* 批量confirm方法:每发送一批消息后，调用channel.waitForConfirms方法，等待服务器的确认返回。
* 异步confirm方法:提供一个回调方法，服务端确认了一条或者多条消息后客户端会回调这个方法进行处理。

在批量confirm方法中，客户端程序需要定期或者定量(达到多少条)，亦或者两者结合起来调用channel.waitForConfirms来等待RabbitMQ的确认返回。相比于前面示例中的普通confirm方法，批量极大地提升了confirm的效率，但是问题在于出现返回Basic.Nack或者超时情况时，客户端需要将这一批次的消息全部重发，这会带来明显的重复消息���量，并且当消息经常丢失时，批量confirm的性能应该是不升反降的。

异步confirm方法的编程实现最为复杂。在客户端Channel接口中提供的addConfirmListener方法可以添加ConfirmListener这个回调接口，这个ConfirmListener接口包含两个方法:handleAck和handleNack，分别用来处理RabbitMQ回传的Basic.Ack和Basic.Nack。在这两个方法中都包含有一个参数deliveryTag(在publisher  confirm模式下用来标记消息的唯一有序序号),我们需要为每一个信道维护一个"unconfirm"的消息序号集合，每发送一条消息，集合中的元素加1。每当调用ConfirmListener中的handleAck方法时，"unconfirm"集合中删掉相应的一条(multiple设置为false)或者多条(multiple设置为true)记录。从程序运行效率上来看，这个"unconfrrm"集合最好采用有序集合SortedSet的存储结构。事实上，Java客户端SDK中的waitForConfirms方法也是通过SortedSet维护消息序号的。


```java
public void addConfirmListener(ConfirmListener listener) {
    this.confirmListeners.add(listener);
    this.delegate.addConfirmListener(listener);
}

public ConfirmListener addConfirmListener(final ConfirmCallback ackCallback, final ConfirmCallback nackCallback) {
    ConfirmListener confirmListener = new ConfirmListener() {
        public void handleAck(long deliveryTag, boolean multiple) throws IOException {
            ackCallback.handle(deliveryTag, multiple);
        }

        public void handleNack(long deliveryTag, boolean multiple) throws IOException {
            nackCallback.handle(deliveryTag, multiple);
        }
    };
    this.addConfirmListener(confirmListener);
    return confirmListener;
}
public interface ConfirmListener {
    void handleAck(long var1, boolean var3) throws IOException;

    void handleNack(long var1, boolean var3) throws IOException;
}

public interface ConfirmCallback {
    void handle(long var1, boolean var3) throws IOException;
}
```

### 1.5.10. 消费端要点介绍
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.1. 消息分发
<a href="#menu" style="float:right">目录</a>

当 RabbitMQ 队列拥有多个消费者时 ，队列收到的消息将以轮询 (round-robin )的分发方式发送给消费者。每条消息只会发送给订阅列表里的一个消费者。这种方式非常适合扩展，而且它是专门为并发程序设计的。如果现在负载加重，那么只需要创建更多的消费者来消费处理消息即可。

很多时候轮询的分发机制也不是那么优雅。默认情况下，如果有 n 个消费者，那么 RabbitMQ会将第 m 条消息分发给第 m%n (取余的方式)个消费者， RabbitMQ 不管消费者是否消费并己经确认 (Basic.Ack) 了消息。试想一下，如果某些消费者任务繁重，来不及消费那么多的消息，而某些其他消费者由于某些原因(比如业务逻辑简单、机器性能卓越等)很快地处理完了所分配到的消息，进而进程空闲，这样就会造成整体应用吞吐量的下降。

那么该如何处理这种情况呢?这里就要用到 channel.basicQos(int prefetchCount)这个方法，如前面章节所述， channel.basicQos 方法允许限制信道上的消费者所能保持的最大未确认消息的数量。

```JAVA
public void  recdata() throws Exception{

    final  Channel  channel = connection.createChannel();
    //
    channel.basicQos(64);
    Consumer consumer  = new DefaultConsumer(channel) {
        @Override
        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
            // System.out.println("接收到的数据：" + new String(body));

            User obj = serialize.deserialize(body,User.class);

            System.out.println("接收到的数据：" +obj.toString());

            channel.basicAck(envelope.getDeliveryTag(),false);
        }

    };
    channel.basicConsume(QUEUE_NAME,consumer);
}
```

在订阅消费队列之前，消费端程序调用了 channel.basicQos(5) ，之后订阅了某个队列进行消费。 RabbitMQ 会保存一个消费者的列表，每发送一条消息都会为对应的消费者计数，如果达到了所设定的上限，那么 RabbitMQ 就不会向这个消费者再发送任何消息。直到消费者确认了某条消息之后 ， RabbitMQ 将相应的计数减1，之后消费者可以继续接收消息，直到再次到达计数上限。这种机制可以类比于 TCP!IP中的"滑动窗口"。

```java
 public void basicQos(int prefetchSize, int prefetchCount, boolean global) throws IOException {
    if (global) {
        this.prefetchCountGlobal = prefetchCount;
    } else {
        this.prefetchCountConsumer = prefetchCount;
    }

    this.delegate.basicQos(prefetchSize, prefetchCount, global);
}

public void basicQos(int prefetchCount) throws IOException {
    this.basicQos(0, prefetchCount, false);
}

public void basicQos(int prefetchCount, boolean global) throws IOException {
    this.basicQos(0, prefetchCount, global);
}
```
前面介绍的都只用到了 prefetchCount 这个参数，当 prefetchCount 设置为 0 则表示没有上限。还有 prefetchSize 这个参数表示消费者所能接收未确认消息的总体大小的上限，单位为 B ，设置为 0 则表示没有上限。

对于一个信道来说，它可以同时消费多个队列，当设置了prefetchCount大于0时，这个信道需要和各个队列协调以确保发送的消息都没有超过所限定的prefetchCoun的值，这样会使 RabbitMQ 的性能降低，尤其是这些队列分散在集群中的多个 Broker 节点之中。RabbitMQ 为了提升相关的性能，在 AMQPO-9-1 协议之上重新定义了 global 这个参数

|global参数 |AMQP 0-9-1| RabbitMQ
|---|---|---|
|false|信道上所有的消费者都需要遵从 prefetchCount 的限定值| 信道上新的消费者需要遵从 prefetchCount 的限定值
|true|当前通信链路( Connection) 上所有的消费者都需要遵从 prefetchCount 的限定值 | 信道上所有的消费者都需要遵从 prefetchCount 的限定值

前面章节中的channel.basicQos方法的示例都是针对单个消费者的，而对于同一个信道上的多个消费者而言，如果设置了prefetchCount的值，那么都会生效

如果在订阅消息之前，既设置了global为true的限制，又设置了global为false的限制，那么哪个会生效呢?RabbitMQ会确保两者都会生效。举例说明，当前有两个队列queue1
和queue2:queue1有10条消息，分别为1到10;queue2也有10条消息，分别为11到20。有两个消费者分别消费这两个队列
```java
Channel channel = . ..;
Consumer consumerl = ...;
Consumer consumer2 = ...;
channel.basicQos(3 , false); // Per consumer limit
channel.basicQos(5 , true); // Per channel limit
channel.basicConsume( "queuel" , false , consumerl) ;
channel.basicConsume("queue2 " , false , consumer2) ;
```
那么这里每个消费者最多只能收到3个未确认的消息，两个消费者能收到的未确认的消息个数之和的上限为5。在未确认消息的情况下，如果consumerl接收到了消息1、2和3，那么consumer2至多只能收到11和12。如果像这样同时使用两种global的模式，则会增加RabbitMQ的负载，因为RabbitMQ需要更多的资源来协调完成这些限制。如无特殊需要，最好只使用global为false的设置，这也是默认的设置。

#### 1.5.10.2. 消息顺序性

<a href="#menu" style="float:right">目录</a>

消息的顺序性是指消费者消费到的消息和发送者发布的消息的顺序是一致的。举个例子，不考虑消息重复的情况，如果生产者发布的消息分别为msgl、msg2、msg3，那么消费者必然也是按照msgl、msg2、msg3的顺序进行消费的。

哪些情况下RabbitMQ的消息顺序性会被打破?
* 在使用事务机制或者publisher confirm时,消息发送失败情况下应用重新发送,就有可能导致消息的顺序性出现问题.
* 如果生产者发送的消息设置了不同的超时时间，井且也设置了死信队列，整体上来说相当于一个延迟队列，那么消费者在消费这个延迟队列的时候，消息的顺序必然不会和生产者发送消息的顺序一致。
* 如果消息设置了优先级，那么消费者消费到的消息也必然不是顺序性的

包括但不仅限于以上几种情形会使RabbitMQ消息错序。如果要保证消息的顺序性，需要业务方使用RabbitMQ之后做进一步的处理，比如在消息体内添加全局有序标识(类似Sequence
ID)来实现

### 1.5.11. 消息传输保障
<a href="#menu" style="float:right">目录</a>

消息可靠传输一般是业务系统接入消息中间件时首要考虑的问题，一般消息中间件的消息传输保障分为三个层级。
* At most once: 最多一次。消息可能会丢失 ，但绝不会重复传输 。
* At least once: 最少一次。消息绝不会丢失，但可能会重复传输。
* Exactly once: 恰好一次。每条消息肯定会被传输一次且仅传输一次。

RabbitMQ支持其中的"最多一次"和"最少一次"。其中"最少一次"投递实现需要考虑以下这个几个方面的内容:
(1)消息生产者需要开启事务机制或者publisherconfirm机制，以确保消息可以可靠地传输到RabbitMQ中。
(2)消息生产者需要配合使用mandatory参数或者备份交换器来确保消息能够从交换器路由到队列中，进而能够保存下来而不会被丢弃。
(3)消息和队列都需要进行持久化处理，以确保RabbitMQ服务器在遇到异常情况时不会造成消息丢失。
(4)消费者在消费消息的同时需要将autoAck设置为false，然后通过手动确认的方式去确认己经正确消费的消息，以避免在消费端引起不必要的消息丢失。

"恰好一次"是RabbitMQ目前无法保障的。考虑这样一种情况，消费者在消费完一条消息之后向RabbitMQ发送确认Basic.Ack命令，此时由于网络断开或者其他原因造成RabbitMQ
并没有收到这个确认命令，那么RabbitMQ不会将此条消息标记删除。在重新建立连接之后，消费者还是会消费到这一条消息，这就造成了重复消费。再考虑一种情况，生产者在使用
publisherconfirm机制的时候，发送完一条消息等待RabbitMQ返回确认通知，此时网络断开，生产者捕获到异常情况，为了确保消息可靠性选择重新发送，这样RabbitMQ中就有两条同样
的消息，在消费的时候，消费者就会重复消费。

那么RabbitMQ有没有去重的机制来保证"恰好一次"呢?答案是并没有，不仅是RabbitMQ，目前大多数主流的消息中间件都没有消息去重机制，也不保障"恰好一次"。去重处理一般是在业务客户端实现，比如引入GUID(GloballyUniqueIdentifier)的概念。针对GUID，如果从客户端的角度去重，那么需要引入集中式缓存，必然会增加依赖复杂度，另外缓存的大小也难以界定。建议在实际生产环境中，业务方根据自身的业务特性进行去重，比如业务消息本身具备军等'性，或者借助Redis等其他产品进行去重处理。

## 1.6. Spring集成RabbitMQ

### 1.6.1. 依赖
<a href="#menu" style="float:right">目录</a>

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>
```

### 1.6.2. 配置
<a href="#menu" style="float:right">目录</a>

```java
@ConfigurationProperties(
    prefix = "spring.rabbitmq"
)
public class RabbitProperties {
    //ip
    private String host = "localhost";
    //端口
    private int port = 5672;
    //用户名称和密码
    private String username = "guest";
    private String password = "guest";
    private final RabbitProperties.Ssl ssl = new RabbitProperties.Ssl();
    //虚拟主机
    private String virtualHost;
    //
    private String addresses;
    @DurationUnit(ChronoUnit.SECONDS)
    private Duration requestedHeartbeat;
    private boolean publisherConfirms;
    private boolean publisherReturns;
    private Duration connectionTimeout;
    private final RabbitProperties.Cache cache = new RabbitProperties.Cache();
    private final RabbitProperties.Listener listener = new RabbitProperties.Listener();
    private final RabbitProperties.Template template = new RabbitProperties.Template();
    private List<RabbitProperties.Address> parsedAddresses;
}
```

```yml
spring:
  rabbitmq:
    host: 127.0.0.1
    port: 5672
    username: guest
    password: guest
    virtual-host: /rabbitmq
```
### 1.6.3. 配置类

```java
@Slf4j
@Configuration
public class RabbitConfig {

    @Value("${spring.rabbitmq.host}")
    private String host;

    @Value("${spring.rabbitmq.port}")
    private int port;

    @Value("${spring.rabbitmq.username}")
    private String username;

    @Value("${spring.rabbitmq.password}")
    private String password;

    @Value("${spring.rabbitmq.virtual-host}")
    private String virtualhost;


    public static final String EXCHANGE_A = "my-mq-exchange_A";
    public static final String EXCHANGE_B = "my-mq-exchange_B";
    public static final String EXCHANGE_C = "my-mq-exchange_C";


    public static final String QUEUE_A = "QUEUE_A";
    public static final String QUEUE_B = "QUEUE_B";
    public static final String QUEUE_C = "QUEUE_C";

    public static final String ROUTINGKEY_A = "spring-boot-routingKey_A";
    public static final String ROUTINGKEY_B = "spring-boot-routingKey_B";
    public static final String ROUTINGKEY_C = "spring-boot-routingKey_C";

    /*
    配置工厂
    */
    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory(host,port);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        connectionFactory.setVirtualHost(virtualhost);
        connectionFactory.setPublisherConfirms(true);
        return connectionFactory;
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    //必须是prototype类型
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate template = new RabbitTemplate(connectionFactory());
        return template;
    }


    //配置队列
    /**
     * 获取队列A
     * @return
     */
    @Bean
    public Queue queueA() {
        return new Queue(QUEUE_A, true); //队列持久
    }

    /**
     * 获取队列A
     * @return
     */
    @Bean
    public Queue queueB() {
        return new Queue(QUEUE_B, true); //队列持久
    }





    /**
     * 针对消费者配置
     * 1. 设置交换机类型
     * 2. 将队列绑定到交换机
     FanoutExchange: 将消息分发到所有的绑定队列，无routingkey的概念
     HeadersExchange ：通过添加属性key-value匹配
     DirectExchange:按照routingkey分发到指定队列
     TopicExchange:多关键字匹配
     */
    @Bean
    public DirectExchange defaultExchange() {
        return new DirectExchange(EXCHANGE_A);
    }

    //绑定
    @Bean
    public Binding bindingA() {
        return BindingBuilder.bind(queueA()).to(defaultExchange()).with(RabbitConfig.ROUTINGKEY_A);
    }
    @Bean
    public Binding bindingB(){
        return BindingBuilder.bind(queueB()).to(defaultExchange()).with(RabbitConfig.ROUTINGKEY_B);
    }
}
```

从上面可以看到主要有以下几个步骤
* 配置连接工厂,用于创建连接
* 配置RabbitTemplate,后续通过这个对象发送数据
* 配置队列Queue
* 配置交换器Exchange
* 绑定交换器和队列

**队列**
```java
 public Queue(String name, boolean durable, boolean exclusive, boolean autoDelete, Map<String, Object> arguments);
```
* name : 队列的名称。
* durable: 设置是否持久化。为 true 则设置队列为持久化。持久化的队列会存盘，在服务器重启的时候可以保证不丢失相关信息。
* exclusive : 设置是否排他。为 true 则设置队列为排他的。如果一个队列被声明为排他队列，该队列仅对首次声明它的连接可见，并在连接断开时自动删除。这里需要注意三点:排他队列是基于连接( Connection) 可见的，同一个连接的不同信道 (Channel)是可以同时访问同一连接创建的排他队列; "首次"是指如果一个连接己经声明了 一个排他队列，其他连接是不允许建立同名的排他队列的，这个与普通队列不同:即使该队列是持久化的，一旦连接关闭或者客户端退出，该排他队列都会被自动删除，这种队列适用于一个客户端同时发送和读取消息的应用场景。
* autoDelete: 设置是否自动删除。为 true 则设置队列为自动删除。自动删除的前提是:至少有一个消费者连接到这个队列，之后所有与这个队列连接的消费者都断开时，才会自动删除。不能把这个参数错误地理解为: "当连接到此队列的所有客户端断开时，这个队列自动删除"，因为生产者客户端创建这个队列，或者没有消费者客户端与这个队列连接时，都不会自动删除这个队列。
* argurnents: 设置队列的其他一些参数，如 x-rnessage-ttl 、 x-expires ,x -rnax-length 、 x-rnax-length-bytes 、 x-dead-letter-exchange 、x-deadletter-routing-key, x-rnax-priority 等。

**交换器**
```java
public Exchange(String name, boolean durable, boolean autoDelete, Map<String, Object> arguments)
```
* name : 交换器的名称。
* durable: 设置是否持久化 。 durable 设置为 true 表示持久化， 反之是非持久化 。持久化可以将交换器存盘，在服务器重启 的时候不会丢失相关信息。
* autoDelete : 设置是否自动删除。 autoDelete 设置为 true 则表示自动删除。自动删除的前提是至少有一个队列或者交换器与这个交换器绑定 ， 之后所有与这个交换器绑定的队列或者交器都与此解绑。注意不能错误地把这个参数理解为 : "当与此交换器连接的客户端都断开时 ， RabbitMQ 会自动删除本交换器 "。
* argument : 其他一些结构化参数，比如 alternate - exchange

根据不同的类型,一共有以下几种交换器
* DirectExchange
* FanoutExchange
* CustomExchange(自定义)
* TopicExchange
* HeadersExchange



### 1.6.4. 生产者
<a href="#menu" style="float:right">目录</a>

```java
@Slf4j
@Component
public class MsgProducer implements RabbitTemplate.ConfirmCallback {

 
    //由于rabbitTemplate的scope属性设置为ConfigurableBeanFactory.SCOPE_PROTOTYPE，所以不能自动注入
    private RabbitTemplate rabbitTemplate;
    /**
     * 构造方法注入rabbitTemplate
     */
    @Autowired
    public MsgProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
        rabbitTemplate.setConfirmCallback(this); //rabbitTemplate如果为单例的话，那回调就是最后设置的内容
    }

    public void sendMsg(String content) {
        CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
        //把消息放入ROUTINGKEY_A对应的队列当中去，对应的是队列A
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_A, RabbitConfig.ROUTINGKEY_A, content, correlationId);
    }
    /**
     * 回调
     */
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        logger.info(" 回调id:" + correlationData);
        if (ack) {
            logger.info("消息成功消费");
        } else {
            logger.info("消息消费失败:" + cause);
        }
    }
}
```

### 1.6.5. 消费者
<a href="#menu" style="float:right">目录</a>


```java
@Slf4j
@Component
@RabbitListener(queues = RabbitConfig.QUEUE_A)
public class MsgReceiver {
    
    @RabbitHandler
    public void process(String content) {
        log.info("接收处理队列A当中的消息： " + content);
    }
}

```

### 1.6.6. 为Rabbitmq中的Jackson2JsonMessageConverter自定义ClassMapper
<a href="#menu" style="float:right">目录</a>

每次发消息都要自己构造 Message 对象比较麻烦。Spring-AMQP 允许我们直接使用自定义的类，然后会利用指定好的 MessageConverter 将自定义的类转换为 Message 进行发送，在接收时也会利用 MessageConverter 将接收到的 Message 对象转成需要的对象。Spring-AMQP 提供了多种 MessageConverter，比如 SimpleMessageConverter，SerializerMessageConverter，Jackson2JsonMessageConverter，MarshallingMessageConverter等等，如果发送的消息对象不是 Message 实例，并且没有指定 MessageConverter 的话，默认用 SimpleMessageConverter。以上各种 MessageConverter 归根结底都是实现了 MessageConverter 接口，该接口只有两个方法：

```java
public interface MessageConverter {
    Message toMessage(Object var1, MessageProperties var2) throws MessageConversionException;

    default Message toMessage(Object object, MessageProperties messageProperties, @Nullable Type genericType) throws MessageConversionException {
        return this.toMessage(object, messageProperties);
    }

    Object fromMessage(Message var1) throws MessageConversionException;
}
```
这两个方法一个是在发送消息时将我们的消息对象转换成标准的 Message 对象，另一个是在接受消息时将 Message 对象转换为相应的对象。
比较常用的 Converter 就是 Jackson2JsonMessageConverter(以下简称 JsonMessageConverter)，在发送消息时，它会先将自定义的消息类序列化成json格式，再转成byte构造 Message，在接收消息时，会将接收到的 Message 再反序列化成自定义的类

不过使用 JsonMessageConverter 时有一个小问题，在不对它进行任何改造的前提下，发送消息的类和接受消息的类必须是一样的，不仅是要里面的字段一样，类名一样，连类的包路径都要一样。

所以当系统1使用 JsonMessageConverter 发送消息类A给系统2时，系统2可以有如下几种方式来接收：
1.依赖系统1的jar包,直接使用类A来接收
2.不依赖系统1的jar包，自己建一个和A一模一样的类，连名称，包路径都一样
3.负责监听 queue 的类实现 MessageListener 接口，直接接收 Message 类，再自己转换
上面三个方法都不是很好，按照正常的想法，我们肯定是期望系统2直接使用自己的类来接收就可以了，只要与A类的字段名一样即可。那有没有方法可以让系统2既不依赖无用的jar包，也不用建立个与自己命名规范不相符的类， 也无需自己转换呢?

要解决这个问题，就要先看看 JsonMessageConverter 是如何将 Message 进行反序列化的。
在 JsonMessageConverter 的 fromMessage 方法中有这么一段:
```java
if (conversionHint instanceof ParameterizedTypeReference) {
    content = this.convertBytesToObject(message.getBody(), encoding, this.objectMapper.getTypeFactory().constructType(((ParameterizedTypeReference)conversionHint).getType()));
} else if (this.getClassMapper() == null) {
    JavaType targetJavaType = this.getJavaTypeMapper().toJavaType(message.getMessageProperties());
    content = this.convertBytesToObject(message.getBody(), encoding, targetJavaType);
} else {
    Class<?> targetClass = this.getClassMapper().toClass(message.getMessageProperties());
    content = this.convertBytesToObject(message.getBody(), encoding, targetClass);
}
```

就是说默认情况下，JsonMessageConverter 使用的 ClassMapper 是 DefaultJackson2JavaTypeMapper，在转换时通过 Message 的 Properties 来获取要转换的目标类的类型。通过 Debug 可以发现，目标类的类型是存储在 Message 的 Proterties 的 一个 headers 的 Map 中，Key 叫“__TypeId__”。所以只要想办法在传输消息时更改__TypeId__的值即可。

下面是解决办法，在消息的生产者端为 JsonMessageConverter， 设置一个自定义的 ClassMapper，重写 fromClass 方法，将 __TypeId__ 的值设为消费端用来接收的类的路径+名称。当然了，也可以在消费者端重写toClass方法，直接返回想要转换的目标类的类类型。两种选一种就可以。

```java
Jackson2JsonMessageConverter converter = new Jackson2JsonMessageConverter();
converter.setClassMapper(new ClassMapper() {

    //发送端重写
    @Override
    public void fromClass(Class<?> aClass, MessageProperties messageProperties) {

        // messageProperties.setHeader("__TypeId__", "com.xxx.B");
        throw new UnsupportedOperationException("this mapper is only for outbound, do not use for receive message");

    }
    //消费端重写
    @Override
    public Class<?> toClass(MessageProperties messageProperties) {
        // messageProperties.setHeader("__TypeId__", "com.xxx.B");
        return UserRecDto.class;
    }
});
```

### 1.6.7. SimpleMessageListenerContainer
<a href="#menu" style="float:right">目录</a>

SimpleMessageListenerContainer 即简单消息监听容器。

这个类非常的强大，我们可以对他进行很多的设置，用对于消费者的配置项，这个类都可以满足。它有监听单个或多个队列、自动启动、自动声明功能。
* 它可以设置事务特性、事务管理器、事务属性、事务并发、是否开启事务、回滚消息等。但是我们在实际生产中，很少使用事务，基本都是采用补偿机制。
* 它可以设置消费者数量、最小最大数量、批量消费。
* 它可以设置消息确认和自动确认模式、是否重回队列、异常捕获 Handler 函数。
* 它可以设置消费者标签生成策略、是否独占模式、消费者属性等。
* 它还可以设置具体的监听器、消息转换器等等。
注意: SimpleMessageListenerContainer 可以进行动态设置，比如在运行中的应用可以动态的修改其消费者数量的大小、接收消息的模式等。
很多基于 rabbitMQ 的自制定化后端管控台在进行设置的时候，也是根据这一去实现的。所以可以看出 SpringAMQP 非常的强大。

```java
@Bean
public SimpleMessageListenerContainer messageContainer() {
    //加载处理消息A的队列
    SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory());
    //设置接收多个队列里面的消息，这里设置接收队列A
    //假如想一个消费者处理多个队列里面的信息可以如下设置：
    //container.setQueues(queueA(),queueB(),queueC());
    //container.setQueues(queueA());
    container.setQueueNames(RabbitConfig.QUEUE_A);
    container.setExposeListenerChannel(true);
    //设置最大的并发的消费者数量
    container.setMaxConcurrentConsumers(10);
    //最小的并发消费者的数量
    container.setConcurrentConsumers(1);
    //设置确认模式手工确认
    container.setAcknowledgeMode(AcknowledgeMode.MANUAL);


    MessageListenerAdapter messageListener = new MessageListenerAdapter(new Object() {

        @SuppressWarnings("unused")
        public void handleMessage(UserRecDto object) {
            System.out.println("Got a " + object);
        }

    });


    Jackson2JsonMessageConverter converter = new Jackson2JsonMessageConverter();
    converter.setClassMapper(new ClassMapper() {
        @Override
        public void fromClass(Class<?> aClass, MessageProperties messageProperties) {

            throw new UnsupportedOperationException("this mapper is only for outbound, do not use for receive message");

        }

        @Override
        public Class<?> toClass(MessageProperties messageProperties) {
            // messageProperties.setHeader("__TypeId__", "com.xxx.B");
            return UserRecDto.class;
        }
    });
    container.setMessageConverter(converter);

    //定义接收监听器
    container.setMessageListener(new ChannelAwareMessageListener(){

        @Override
        public void onMessage(Message message, Channel channel) throws Exception {

            /**通过basic.qos方法设置prefetch_count=1，这样RabbitMQ就会使得每个Consumer在同一个时间点最多处理一个Message，
                换句话说,在接收到该Consumer的ack前,它不会将新的Message分发给它 */
            channel.basicQos(1);

            UserRecDto userRecDto = (UserRecDto)container.getMessageConverter().fromMessage(message);

            log.info("接收处理队列A当中的消息:" + userRecDto);
            long deliveryTag = message.getMessageProperties().getDeliveryTag();
            /**为了保证永远不会丢失消息，RabbitMQ支持消息应答机制。
                当消费者接收到消息并完成任务后会往RabbitMQ服务器发送一条确认的命令，然后RabbitMQ才会将消息删除。*/
            channel.basicAck(deliveryTag,false);
        }
    });
    
    return container;
}
```

同时生产者要设定MessageConverter为jackson2JsonMessageConverter.
```java
@Bean
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//必须是prototype类型
public RabbitTemplate rabbitTemplate() {
    RabbitTemplate template = new RabbitTemplate(connectionFactory());
    template.setMessageConverter(jackson2JsonMessageConverter());
    return template;
}
```
发送消息
```java
public void sendMsgObject(Object content) {
    CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
    //把消息放入ROUTINGKEY_A对应的队列当中去，对应的是队列A
    rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_A, RabbitConfig.ROUTINGKEY_A, content, correlationId);
}
```


## 1.7. RabbitMQ管理
<a href="#menu" style="float:right">目录</a>

## 1.8. 数据存储
<a href="#menu" style="float:right">目录</a>


## 1.9. 集群
<a href="#menu" style="float:right">目录</a>


## 1.10. 源码说明

```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.rabbitmq.client;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.AMQP.Basic.RecoverOk;
import com.rabbitmq.client.AMQP.Exchange.BindOk;
import com.rabbitmq.client.AMQP.Exchange.DeclareOk;
import com.rabbitmq.client.AMQP.Exchange.DeleteOk;
import com.rabbitmq.client.AMQP.Exchange.UnbindOk;
import com.rabbitmq.client.AMQP.Queue.PurgeOk;
import com.rabbitmq.client.AMQP.Tx.CommitOk;
import com.rabbitmq.client.AMQP.Tx.RollbackOk;
import com.rabbitmq.client.AMQP.Tx.SelectOk;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;

public interface Channel extends ShutdownNotifier, AutoCloseable {
    int getChannelNumber();
    Connection getConnection();
    void close() throws IOException, TimeoutException;
    void close(int var1, String var2) throws IOException, TimeoutException;
    void abort() throws IOException;
    void abort(int var1, String var2) throws IOException;
    void addReturnListener(ReturnListener var1);
    ReturnListener addReturnListener(ReturnCallback var1);
    boolean removeReturnListener(ReturnListener var1);
    void clearReturnListeners();
    void addConfirmListener(ConfirmListener var1);
    ConfirmListener addConfirmListener(ConfirmCallback var1, ConfirmCallback var2);
    boolean removeConfirmListener(ConfirmListener var1);
    void clearConfirmListeners();
    Consumer getDefaultConsumer();
    void setDefaultConsumer(Consumer var1);
    void basicQos(int var1, int var2, boolean var3) throws IOException;
    void basicQos(int var1, boolean var2) throws IOException;
    void basicQos(int var1) throws IOException;
    void basicPublish(String var1, String var2, BasicProperties var3, byte[] var4) throws IOException;
    void basicPublish(String var1, String var2, boolean var3, BasicProperties var4, byte[] var5) throws IOException;
    void basicPublish(String var1, String var2, boolean var3, boolean var4, BasicProperties var5, byte[] var6) throws IOException;
    DeclareOk exchangeDeclare(String var1, String var2) throws IOException;
    DeclareOk exchangeDeclare(String var1, BuiltinExchangeType var2) throws IOException;
    DeclareOk exchangeDeclare(String var1, String var2, boolean var3) throws IOException;
    DeclareOk exchangeDeclare(String var1, BuiltinExchangeType var2, boolean var3) throws IOException;
    DeclareOk exchangeDeclare(String var1, String var2, boolean var3, boolean var4, Map<String, Object> var5) throws IOException;
    DeclareOk exchangeDeclare(String var1, BuiltinExchangeType var2, boolean var3, boolean var4, Map<String, Object> var5) throws IOException;
    DeclareOk exchangeDeclare(String var1, String var2, boolean var3, boolean var4, boolean var5, Map<String, Object> var6) throws IOException;
    DeclareOk exchangeDeclare(String var1, BuiltinExchangeType var2, boolean var3, boolean var4, boolean var5, Map<String, Object> var6) throws IOException;
    void exchangeDeclareNoWait(String var1, String var2, boolean var3, boolean var4, boolean var5, Map<String, Object> var6) throws IOException;
    void exchangeDeclareNoWait(String var1, BuiltinExchangeType var2, boolean var3, boolean var4, boolean var5, Map<String, Object> var6) throws IOException;
    DeclareOk exchangeDeclarePassive(String var1) throws IOException;
    DeleteOk exchangeDelete(String var1, boolean var2) throws IOException;
    void exchangeDeleteNoWait(String var1, boolean var2) throws IOException;
    DeleteOk exchangeDelete(String var1) throws IOException;
    BindOk exchangeBind(String var1, String var2, String var3) throws IOException;
    BindOk exchangeBind(String var1, String var2, String var3, Map<String, Object> var4) throws IOException;
    void exchangeBindNoWait(String var1, String var2, String var3, Map<String, Object> var4) throws IOException;
    UnbindOk exchangeUnbind(String var1, String var2, String var3) throws IOException;
    UnbindOk exchangeUnbind(String var1, String var2, String var3, Map<String, Object> var4) throws IOException;
    void exchangeUnbindNoWait(String var1, String var2, String var3, Map<String, Object> var4) throws IOException;
    com.rabbitmq.client.AMQP.Queue.DeclareOk queueDeclare() throws IOException;
    com.rabbitmq.client.AMQP.Queue.DeclareOk queueDeclare(String var1, boolean var2, boolean var3, boolean var4, Map<String, Object> var5) throws IOException;
    void queueDeclareNoWait(String var1, boolean var2, boolean var3, boolean var4, Map<String, Object> var5) throws IOException;
    com.rabbitmq.client.AMQP.Queue.DeclareOk queueDeclarePassive(String var1) throws IOException;
    com.rabbitmq.client.AMQP.Queue.DeleteOk queueDelete(String var1) throws IOException;
    com.rabbitmq.client.AMQP.Queue.DeleteOk queueDelete(String var1, boolean var2, boolean var3) throws IOException;
    void queueDeleteNoWait(String var1, boolean var2, boolean var3) throws IOException;
    com.rabbitmq.client.AMQP.Queue.BindOk queueBind(String var1, String var2, String var3) throws IOException;
    com.rabbitmq.client.AMQP.Queue.BindOk queueBind(String var1, String var2, String var3, Map<String, Object> var4) throws IOException;
    void queueBindNoWait(String var1, String var2, String var3, Map<String, Object> var4) throws IOException;
    com.rabbitmq.client.AMQP.Queue.UnbindOk queueUnbind(String var1, String var2, String var3) throws IOException;    com.rabbitmq.client.AMQP.Queue.UnbindOk queueUnbind(String var1, String var2, String var3, Map<String, Object> var4) throws IOException;
    PurgeOk queuePurge(String var1) throws IOException;
    GetResponse basicGet(String var1, boolean var2) throws IOException;
    void basicAck(long var1, boolean var3) throws IOException;
    void basicNack(long var1, boolean var3, boolean var4) throws IOException;
    void basicReject(long var1, boolean var3) throws IOException;
    String basicConsume(String var1, Consumer var2) throws IOException;
    String basicConsume(String var1, DeliverCallback var2, CancelCallback var3) throws IOException;
    String basicConsume(String var1, DeliverCallback var2, ConsumerShutdownSignalCallback var3) throws IOException;
    String basicConsume(String var1, DeliverCallback var2, CancelCallback var3, ConsumerShutdownSignalCallback var4) throws IOException;
    String basicConsume(String var1, boolean var2, Consumer var3) throws IOException;
    String basicConsume(String var1, boolean var2, DeliverCallback var3, CancelCallback var4) throws IOException;
    String basicConsume(String var1, boolean var2, DeliverCallback var3, ConsumerShutdownSignalCallback var4) throws IOException;
    String basicConsume(String var1, boolean var2, DeliverCallback var3, CancelCallback var4, ConsumerShutdownSignalCallback var5) throws OException;
    String basicConsume(String var1, boolean var2, Map<String, Object> var3, Consumer var4) throws IOException;
    String basicConsume(String var1, boolean var2, Map<String, Object> var3, DeliverCallback var4, CancelCallback var5) throws IOException;
    String basicConsume(String var1, boolean var2, Map<String, Object> var3, DeliverCallback var4, ConsumerShutdownSignalCallback var5) throws OException;
    String basicConsume(String var1, boolean var2, Map<String, Object> var3, DeliverCallback var4, CancelCallback var5, ConsumerShutdownSignalCallback var6) throws IOException;
    String basicConsume(String var1, boolean var2, String var3, Consumer var4) throws IOException;
    String basicConsume(String var1, boolean var2, String var3, DeliverCallback var4, CancelCallback var5) throws IOException;
    String basicConsume(String var1, boolean var2, String var3, DeliverCallback var4, ConsumerShutdownSignalCallback var5) throws IOException;
    String basicConsume(String var1, boolean var2, String var3, DeliverCallback var4, CancelCallback var5, ConsumerShutdownSignalCallback var6) throws IOException;
    String basicConsume(String var1, boolean var2, String var3, boolean var4, boolean var5, Map<String, Object> var6, Consumer var7) throws IOException;
    String basicConsume(String var1, boolean var2, String var3, boolean var4, boolean var5, Map<String, Object> var6, DeliverCallback var7, CancelCallback var8) throws IOException;
    String basicConsume(String var1, boolean var2, String var3, boolean var4, boolean var5, Map<String, Object> var6, DeliverCallback var7, ConsumerShutdownSignalCallback var8) throws IOException;
    String basicConsume(String var1, boolean var2, String var3, boolean var4, boolean var5, Map<String, Object> var6, DeliverCallback var7, CancelCallback var8, ConsumerShutdownSignalCallback var9) throws IOException;
    void basicCancel(String var1) throws IOException;
    RecoverOk basicRecover() throws IOException;
    RecoverOk basicRecover(boolean var1) throws IOException;
    SelectOk txSelect() throws IOException;
    CommitOk txCommit() throws IOException;
    RollbackOk txRollback() throws IOException;
    com.rabbitmq.client.AMQP.Confirm.SelectOk confirmSelect() throws IOException;
    long getNextPublishSeqNo();
    boolean waitForConfirms() throws InterruptedException;
    boolean waitForConfirms(long var1) throws InterruptedException, TimeoutException;
    void waitForConfirmsOrDie() throws IOException, InterruptedException;
    void waitForConfirmsOrDie(long var1) throws IOException, InterruptedException, TimeoutException;
    void asyncRpc(Method var1) throws IOException;
    Command rpc(Method var1) throws IOException;
    long messageCount(String var1) throws IOException;
    long consumerCount(String var1) throws IOException;
    CompletableFuture<Command> asyncCompletableRpc(Method var1) throws IOException;
}

```