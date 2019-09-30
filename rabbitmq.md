
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
        - [1.3.2. AMQP协议介绍](#132-amqp协议介绍)
            - [1.3.2.1. AMQP生产者流转过程](#1321-amqp生产者流转过程)
            - [1.3.2.2. AMQP消费者流转过程](#1322-amqp消费者流转过程)
        - [1.3.3. 配置](#133-配置)
    - [1.4. 客户端开发](#14-客户端开发)
        - [1.4.1. 连接RabbitMQ](#141-连接rabbitmq)
        - [1.4.2. 使用交换器和队列](#142-使用交换器和队列)
        - [1.4.3. 发送消息](#143-发送消息)
        - [1.4.4. 消费消息](#144-消费消息)
        - [1.4.5. 消息端的确认和拒绝](#145-消息端的确认和拒绝)
        - [1.4.6. 关闭连接](#146-关闭连接)
    - [1.5. 进阶](#15-进阶)
        - [1.5.1. 参数介绍](#151-参数介绍)
        - [1.5.2. 过期时间TTL](#152-过期时间ttl)
        - [1.5.3. 死信队列](#153-死信队列)
        - [1.5.4. 延迟队列](#154-延迟队列)
        - [1.5.5. 优先级队列](#155-优先级队列)
        - [1.5.6. RPC实现](#156-rpc实现)
        - [1.5.7. 持久化](#157-持久化)
        - [1.5.8. 生产者确认](#158-生产者确认)
            - [1.5.8.1. 事务机制](#1581-事务机制)
            - [1.5.8.2. 发送方确认机制](#1582-发送方确认机制)
        - [1.5.9. 消费端要点介绍](#159-消费端要点介绍)
        - [1.5.10. 消息传输保障](#1510-消息传输保障)
    - [1.6. 数据存储](#16-数据存储)
    - [1.7. 集群](#17-集群)

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
![ribbitmq]()

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

## 1.4. 客户端开发
<a href="#menu" style="float:right">目录</a>

### 1.4.1. 连接RabbitMQ
<a href="#menu" style="float:right">目录</a>

### 1.4.2. 使用交换器和队列
<a href="#menu" style="float:right">目录</a>

### 1.4.3. 发送消息
<a href="#menu" style="float:right">目录</a>

### 1.4.4. 消费消息
<a href="#menu" style="float:right">目录</a>

### 1.4.5. 消息端的确认和拒绝
<a href="#menu" style="float:right">目录</a>

### 1.4.6. 关闭连接
<a href="#menu" style="float:right">目录</a>

## 1.5. 进阶
<a href="#menu" style="float:right">目录</a>

### 1.5.1. 参数介绍
<a href="#menu" style="float:right">目录</a>

### 1.5.2. 过期时间TTL
<a href="#menu" style="float:right">目录</a>

### 1.5.3. 死信队列
<a href="#menu" style="float:right">目录</a>

### 1.5.4. 延迟队列
<a href="#menu" style="float:right">目录</a>

### 1.5.5. 优先级队列
<a href="#menu" style="float:right">目录</a>


### 1.5.6. RPC实现
<a href="#menu" style="float:right">目录</a>


### 1.5.7. 持久化
<a href="#menu" style="float:right">目录</a>


### 1.5.8. 生产者确认
<a href="#menu" style="float:right">目录</a>

#### 1.5.8.1. 事务机制
<a href="#menu" style="float:right">目录</a>

#### 1.5.8.2. 发送方确认机制
<a href="#menu" style="float:right">目录</a>


### 1.5.9. 消费端要点介绍
<a href="#menu" style="float:right">目录</a>

### 1.5.10. 消息传输保障
<a href="#menu" style="float:right">目录</a>


## 1.6. 数据存储
<a href="#menu" style="float:right">目录</a>


## 1.7. 集群
<a href="#menu" style="float:right">目录</a>
