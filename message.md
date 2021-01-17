
<span id="menu">




# 1. 消息中间件


## 1.1. 什么是消息中间件
<a href="#menu" >目录</a>

消息是应用间传送的数据.消息队列中间件(Message Queue Middleware;MQ)是指利用高效可靠的消息机制进行与平台无关的数据交流,并基于数据通信来进行分布式系统的集成.通过提供消息传递和消息排队模型.它可以在分布式环境下扩展进程间的通信.

有两种传递模式:
* 点对点模式
    * 基于队列
    * 生产者发送消息到队列,消费者从队列中接收消息
* 发布订阅模式
    * 发布订阅模式定义了如何向一个内容节点发布和订阅消息,这个内容节点称为主题
    * 生产者发送消息到主题,消费者从主题中接收消息
    * 在一对多广播时采用


## 1.2. 消息中间件对比

<a href="#menu" >目录</a>

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

## 1.3. 消息队列的作用
<a href="#menu" >目录</a>

* 应用解耦：在项目启动之初是很难预测未来会遇到什么困难的，消息中间件在处理过程中插入了一个隐含的，基于数据的接口层，两边都实现这个接口，这样就允许独立的修改或者扩展两边的处理过程，只要两边遵守相同的接口约束即可。
* 冗余（存储）：在某些情况下处理数据的过程中会失败，消息中间件允许把数据持久化知道他们完全被处理
* 扩展性：消息中间件解耦了应用的过程，所以提供消息入队和处理的效率是很容易的，只需要增加处理流程就可以了。
* 流量削峰：在访问量剧增的情况下，但是应用仍然需要发挥作用，但是这样的突发流量并不常见。而使用消息中间件采用队列的形式可以减少突发访问压力，不会因为突发的超时负荷要求而崩溃
* 可恢复性：当系统一部分组件失效时，不会影响到整个系统。消息中间件降低了进程间的耦合性，当一个处理消息的进程挂掉后，加入消息中间件的消息仍然可以在系统恢复后重新处理
* 顺序保证：在大多数场景下，处理数据的顺序也很重要，大部分消息中间件支持一定的顺序性
* 缓冲：消息中间件通过一个缓冲层来帮助任务最高效率的执行
* 异步通信：通过把把消息发送给消息中间件，消息中间件并不立即处理它，后续在慢慢处理。
* 分布式事务

**使用了消息队列会有什么缺点?**

* 系统可用性降低
    * 本来其他系统只要运行好好的，那你的系统就是正常的。现在你非要加个消息队列进去，那消息队列挂了，系统业务会得不到即时处理。因此，系统可用性降低
* 系统复杂性增加
    * 要多考虑很多方面的问题，比如一致性问题、如何保证消息不被重复消费，如何保证保证消息可靠传输。因此，需要考虑的东西更多，系统复杂性增大。

## 1.4. 消息中间件需要解决的问题
<a href="#menu" >目录</a>

**架构模式**

RocketMQ 与大部分消息中间件一样，采用发布订阅模式，基本的参与组件主要包括 ：消息发送者、消息服务器（消息存储）、消息消费、路由发现 。

**顺序消患**

所谓顺序消息，就是消息消费者按照消息达到消息存储服务器的顺序消费 。 RocketMQ可以严格保证消息有序 。

**消息过滤**

消息过滤是指在消息消费时，消息消费者可以对同一主题下的消息按照规则 只消费自己感兴趣的消息 。 RocketMQ 消息过滤支持在服务端与消费端的消息过滤机制 。
* 消息在 Broker 端过滤 。 Broker 只将消息消费者感兴趣的消息发送给消息消费者 。
* 消息在消息消费端过滤，消息过滤方式完全 由消息消费者自定义，但缺点是有很多元用的消息会从 Broker 传输到消费端 。
* 
**消息存储**

消息中间件的一个核心实现是消息的存储 对消息存储一般有如下两个维度的考量 ：消息堆积能力和消息存储性能 。 RocketMQ 追求消息存储的高性能，引人内存映射机制，所有主题的消息顺序存储在同一个文件中 。 同时为了避免消息无限在消息存储服务器中累积，引入了消息文件过期机制与文件存储空间报警机制 。

**消息高可用性**

通常影响消息可靠性的有以下几种情况 。
1) Broker 正常关机。
1) Broker 异常 Crash 。
2) OS Crash 。
4）机器断电，但是能立即恢复供电情况 。
5）机器无法开机（可能是 CPU 、主板、 内存等关键设备损 坏） 。
6）磁盘设备损坏 。

针对上述情况，情况 1~4 的 RocketMQ 在同步刷盘机制下可以确保不丢失消息，在异步刷盘模式下，会丢失少量消息 。 情况 5-6 属于单点故障，一旦发生，该节点上的消息全部丢失，如果开启了异步复制机制， RoketMQ 能保证只丢失少量消息， RocketMQ 在后续版本中将引人双写机制，以满足消息可靠性要求极高的场合 。

**消息到达 （ 消费 ）低延迟**

RocketMQ 在消息不发生消息堆积时，以长轮询模式实现准实时的消息推送模式 。

**确保消息必须被消费一次**

RocketMQ 通过消息消费确认机制（ACK）来确保消息至少被消费一次 ，但由于 ACK 消息有可能丢失等其他原因， RocketMQ 无法做到消息只被消费一次，有重复消费的可能 。

**回溯消息**

回溯消息是指消息消费端已经消费成功的消息，由于业务要求需要重新消费消息 。RocketMQ 支持按时间回溯消息，时间维度可精确到毫秒，可以向前或向后回溯 。

**消息堆积**

消息中间件的主要功能是异步解锢，必须具备应对前端的数据洪峰，提高后端系统的可用性，必然要求消息中间件具备一定的消息堆积能力 。 RocketMQ 消息存储使用磁盘文件
（内存映射机制），并且在物理布局上为多个大小相等的文件组成逻辑文件组，可以无限循环使用 。 RocketMQ 消息存储文件并不是永久存储在消息服务器端，而是提供了过期机制，默认保留 3 天 。

**定时消息**

定时消息是指消息发送到 Broker 后， 不能被消息消费端立即消费，要到特定的时间点或者等待特定的时间后才能被消费 。 如果要支持任意精度的定时消息消费，必须在消息服务端对消息进行排序，势必带来很大的性能损耗，故 RocketMQ 不支持任意进度的定时消息，而只支持特定延迟级别 。

**消息重试机制**

消息重试是指消息在消费时，如果发送异常，消息中间件需要支持消息重新投递，RocketMQ 支持消息重试机制 。



## 1.5. 消息堆积处理
<a href="#menu" >目录</a>

**如何解决消息队列的延时以及过期失效问题？消息队列满了以后该怎么处理？有几百万消息持续积压几小时，说说怎么解决？**


**问题分析**
* 消费者出现故障
* 消费者处理缓慢(消费者计算机负载压力大，数据库负载压力大或者出现问题)

**处理**
* 先确定什么原因导致消息堆积，解决该问题，确保消费者恢复正常的消费速度
* 如果是Kafka或者RocketMQ则增加分区数目，如果是RabbitMQ,则增加队列数目
* 增加消费者部署数目，或者消费者内部增加多线程进行并发处理。
* 如果消息数量恢复到正常水平，恢复原来的架构部署。

## 1.6. 消息幂等性
<a href="#menu" >目录</a>

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

## 1.7. 消息顺序性
<a href="#menu" >目录</a>

 顺序性指的是在一些具体的业务中，前后的业务操作必须有顺序，否则会导致业务处理错误。例如在电商系统中，订单和支付通常是两个不同的业务逻辑，我们通常会将其分拆开来处理。这两个业务逻辑之间存在非常清晰的依赖关系：需要先生成订单，然后才能支付订单。对于这种情况，我们就说订单消息和支付消息是有顺序性的。

对于消息中间件的消息顺序性问题，一般通用的处理方案是保证局部的消息有序。例如对于 Kafka 来说，我们会保证 Partition 区域的消息有序性。对于上面所说的订单消息、支付消息的例子，我们一般会将订单消息和支付消息里的用户ID作为key，将其分配到同一个 partition 中，这样它们就是有序的。

## 1.8. JMS,AMQP,MQTT区别与联系
<a href="#menu" >目录</a>


消息传递作为基本通信机制已经在全世界成功运用。无论是人与人、机器与人还是机器与机器之间，消息传递一直都是唯一常用的通信方式。在双方（或更多）之间交换消息有两种基本机制。

同步消息传递
异步消息传递
同步消息传递在这种情况下使用，当消息发送者希望在某个时间范围内收到响应，然后再进行下一个任务。基本上就是他在收到响应前一直处于“阻塞”状态。

异步消息意味着发送者并不要求立即收到响应，而且也不会阻塞整个流程。响应可有可无，发送者总会执行剩下的任务。

上面提到的技术，当两台计算机上的程序相互通信的时候，就广泛使用了异步消息传递。随着微服务架构的兴起，很明显我们需要使用异步消息传递模型来构建服务。

这一直是软件工程中的基本问题，而且不同的人和组织机构会提出不同的方法。我将介绍在企业IT系统中广泛使用的三种最成功的异步消息传递技术。


### 1.8.1. Java消息传递服务（Java Messaging Service (JMS)）

<a href="#menu" >目录</a>

#### 1.8.1.1. 简介
<a href="#menu" >目录</a>

JMS即Java消息服务（Java Message Service）应用程序接口，是一个Java平台中关于面向消息中间件（MOM-分布式系统的集成）的API，用于在两个应用程序之间，或分布式系统中发送消息，进行异步通信。

JMS是一种与厂商无关的 API，用来访问消息收发系统消息，它类似于JDBC(Java Database Connectivity)。

#### 1.8.1.2. 体系架构
<a href="#menu" >目录</a>

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

#### 1.8.1.3. JMS对象模型
<a href="#menu" >目录</a>

![](https://images2018.cnblogs.com/blog/1182616/201805/1182616-20180528082100248-989741849.png)

|||
|---|---|
|ConnectionFactory|创建Connection对象的工厂，针对两种不同的JMS消息模型，分别有QueueConnectionFactory和TopicConnectionFactory两种。可以通过JNDI来查找ConnectionFactory对象。
|Connection|Connection表示在客户端和JMS系统之间建立的链接（对TCP/IP socket的包装）。Connection可以产生一个或多个Session。跟ConnectionFactory一样，Connection也有两种类型：QueueConnection和TopicConnection。
|Session|Session是操作消息的接口。可以通过session创建生产者、消费者、消息等。Session提供了事务的功能。当需要使用session发送/接收多个消息时，可以将这些发送/接收动作放到一个事务中。同样，也分QueueSession和TopicSession。
|MessageProducer|消息生产者由Session创建，并用于将消息发送到Destination。同样，消息生产者分两种类型：QueueSender和TopicPublisher。可以调用消息生产者的方法（send或publish方法）发送消息。
|MessageConsumer|消息消费者由Session创建，用于接收被发送到Destination的消息。两种类型：QueueReceiver和TopicSubscriber。可分别通过session的createReceiver(Queue)或createSubscriber(Topic)来创建。当然，也可以session的creatDurableSubscriber方法来创建持久化的订阅者。
|Destination|Destination的意思是消息生产者的消息发送目标或者说消息消费者的消息来源。对于消息生产者来说，它的Destination是某个队列（Queue）或某个主题（Topic）;对于消息消费者来说，它的Destination也是某个队列或主题（即消息来源）。

#### 1.8.1.4. JMS消息模型
<a href="#menu" >目录</a>

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

#### 1.8.1.5. 接收消息
<a href="#menu" >目录</a>

在JMS中，消息的接收可以使用以下两种方式：
|||
|---|---|
|同步|使用同步方式接收消息的话，消息订阅者调用receive()方法。在receive()中，消息未到达或在到达指定时间之前，方法会阻塞，直到消息可用。
|异步|使用异步方式接收消息的话，消息订阅者需注册一个消息监听者，类似于事件监听器，只要消息到达，JMS服务提供者会通过调用监听器的onMessage()递送消息。

#### 1.8.1.6. JMS消息结构（Message）
<a href="#menu" >目录</a>

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


### 1.8.2. 高级消息队列协议（Advanced Message Queueing Protocol (AMQP)）
<a href="#menu" >目录</a>

#### 1.8.2.1. AMQP 是什么
<a href="#menu" >目录</a>


AMQP（Advanced Message Queuing Protocol，高级消息队列协议）是一个进程间传递异步消息的网络协议。

#### 1.8.2.2. AMQP模型
<a href="#menu" >目录</a>

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

#### 1.8.2.3. Exchange交换机
<a href="#menu" >目录</a>
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

#### 1.8.2.4. Queue队列
<a href="#menu" >目录</a>

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

#### 1.8.2.5. Consumer消费者
<a href="#menu" >目录</a>

消息如果只是存储在队列里是没有任何用处的。被应用消费掉，消息的价值才能够体现。在 AMQP 0-9-1 模型中，有两种途径可以达到此目的：

1）将消息投递给应用 (“push API”)
2）应用根据需要主动获取消息 (“pull API”)

使用 push API，应用（application）需要明确表示出它在某个特定队列里所感兴趣的，想要消费的消息。如是，我们可以说应用注册了一个消费者，或者说订阅了一个队列。一个队列可以注册多个消费者，也可以注册一个独享的消费者（当独享消费者存在时，其他消费者即被排除在外）。

每个消费者（订阅者）都有一个叫做消费者标签的标识符。它可以被用来退订消息。消费者标签实际上是一个字符串。

#### 1.8.2.6. 消息机制
<a href="#menu" >目录</a>


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

#### 1.8.2.7. 其他
<a href="#menu" >目录</a>


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

### 1.8.3. 消息队列遥测传输（Message Queueing Telemetry Transport (MQTT)）
<a href="#menu" >目录</a>

#### 1.8.3.1. 简述
MQTT（Message Queuing Telemetry Transport，消息队列遥测传输协议），是一种基于发布/订阅（publish/subscribe）模式的"轻量级"通讯协议，该协议构建于TCP/IP协议上，由IBM在1999年发布。MQTT最大优点在于，可以以极少的代码和有限的带宽，为连接远程设备提供实时可靠的消息服务。作为一种低开销、低带宽占用的即时通讯协议，使其在物联网、小型设备、移动应用等方面有较广泛的应用。

MQTT是一个基于客户端-服务器的消息发布/订阅传输协议。MQTT协议是轻量、简单、开放和易于实现的，这些特点使它适用范围非常广泛。在很多情况下，包括受限的环境中，如：机器与机器（M2M）通信和物联网（IoT）。其在，通过卫星链路通信传感器、偶尔拨号的医疗设备、智能家居、及一些小型化设备中已广泛使用。

![](https://static.runoob.com/images/mix/mqtt-fidge-2.svg)

#### 1.8.3.2. 设计规范
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

#### 1.8.3.3. 主要特性
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

#### 1.8.3.4. MQTT协议原理
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

#### 1.8.3.5. MQTT协议数据包结构
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

## 1.9. 面试准备

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
如果让你来动手实现一个分布式消息中间件，整体架构你会如何设计实现?