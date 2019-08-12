
<span id="menu" >
<!-- TOC -->

- [1. RocketMQ消息中间件](#1-rocketmq消息中间件)
    - [1.1. 基本介绍](#11-基本介绍)
        - [1.1.1. 模块说明](#111-模块说明)
        - [1.1.2. 配置参数](#112-配置参数)
        - [1.1.3. 底层通信实现](#113-底层通信实现)
        - [1.1.4. RocketMQ源代码的目录结构](#114-rocketmq源代码的目录结构)
        - [1.1.5. 设计理念](#115-设计理念)
        - [1.1.6. 设计目标](#116-设计目标)
        - [1.1.7. 常用面试题](#117-常用面试题)
    - [1.2. 安装配置](#12-安装配置)
    - [1.3. 基本使用](#13-基本使用)
        - [1.3.1. **基本的例子**](#131-基本的例子)
        - [1.3.2. **顺序发送**](#132-顺序发送)
        - [1.3.3. **广播发送**](#133-广播发送)
        - [1.3.4. **定时发送**](#134-定时发送)
        - [1.3.5. **批量发送**](#135-批量发送)
        - [1.3.6. **过滤**](#136-过滤)
        - [1.3.7. **日志appender**](#137-日志appender)
        - [1.3.8. **事务消息**](#138-事务消息)
    - [1.4. 协调者NameServer](#14-协调者nameserver)
        - [1.4.1. 路由元信息](#141-路由元信息)
    - [1.5. 生产者](#15-生产者)
        - [1.5.1. 消息发送方式](#151-消息发送方式)
        - [1.5.2. 生产者API](#152-生产者api)
        - [1.5.3. 队列选择器](#153-队列选择器)
        - [1.5.4. 发送流程分析](#154-发送流程分析)
        - [1.5.5. 默认的队列选择](#155-默认的队列选择)
    - [1.6. 消费者](#16-消费者)
        - [1.6.1. 消息消费概述](#161-消息消费概述)
        - [1.6.2. 消息消费推/拉方式](#162-消息消费推拉方式)
        - [1.6.3. 提高 Consumer 处理能力](#163-提高-consumer-处理能力)
        - [1.6.4. Consumer 的负载均衡](#164-consumer-的负载均衡)
        - [1.6.5. 定时消息](#165-定时消息)
    - [1.7. 消息存储](#17-消息存储)
        - [1.7.1. 消息存储结构](#171-消息存储结构)
        - [1.7.2. 消息队列与索引文件恢复](#172-消息队列与索引文件恢复)
            - [1.7.2.1. Broker 正常停止文件恢复](#1721-broker-正常停止文件恢复)
            - [1.7.2.2. Broker 异常停止文件恢复](#1722-broker-异常停止文件恢复)
        - [1.7.3. 文件刷盘机制](#173-文件刷盘机制)
        - [1.7.4. 过期文件删除机制](#174-过期文件删除机制)
    - [1.8. 高可用机制](#18-高可用机制)
        - [1.8.1. 动态增减broker](#181-动态增减broker)
        - [1.8.2. 各种故障对消息的影响](#182-各种故障对消息的影响)
    - [1.9. 顺序消息](#19-顺序消息)
    - [1.10. 消息饥饿问题](#110-消息饥饿问题)
    - [1.11. 消息过滤](#111-消息过滤)
    - [1.12. 事务消息](#112-事务消息)
        - [1.12.1. 事务实现思想](#1121-事务实现思想)
        - [1.12.2. 事务消息发送流程](#1122-事务消息发送流程)
        - [1.12.3. 提交或者回滚事务](#1123-提交或者回滚事务)
        - [1.12.4. 事务消息回查事务状态](#1124-事务消息回查事务状态)
    - [1.13. 基于Netty的通信实现](#113-基于netty的通信实现)

<!-- /TOC -->


# 1. RocketMQ消息中间件
<a href="#menu" style="float:right">目录</a>


## 1.1. 基本介绍
<a href="#menu" style="float:right">目录</a>

### 1.1.1. 模块说明
<a href="#menu" style="float:right">目录</a>

![](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/rocketmq.png?raw=true)

**NameServer**
**Broker**
**生产者**
**消费者**

### 1.1.2. 配置参数
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
    

### 1.1.3. 底层通信实现
<a href="#menu" style="float:right">目录</a>

* rocketMQ底层基于Netty实现

消息协议

||长度（字节）|说明|
|---|---|---|
|length|4|后面部分的总长度|
|header length|4|头部信息的长度|
|header data |不定长度|头部信息|
|body data|不定长度|消息体|

### 1.1.4. RocketMQ源代码的目录结构
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

### 1.1.5. 设计理念
<a href="#menu" style="float:right">目录</a>

* RocketMQ 设计基于主题的发布与订阅模式 ， 其核心功能包括消息 发送消息存储(Broker）、消息消费，整体设计追求简单与性能第一，主要体现在如下三个方面 。首先， NameServer 设计极其简单，摒弃了业界常用的使用 Zookeeper 充当信息管理的 “注册中心”，而是自研 NameServer 来实现元数据 的管理（ Topic 路由信息等 ） 。 从实际需求出发，因为 Topic 路由信息无须在集群之间保持强一致，追求最终一致性，并且能容忍分钟级的不一致。 正是基于此种情况 ， RocketMQ 的 NameServer 集群之间互不通信，极
大地降低了 NameServer 实现的 复杂程度， 对网络的要求也降低了不少 ， 但是性能相比较Zookeeper 有了极大的提升 。
* 其次是高效的 IO 存储机制 。 RocketMQ 追求消息发送的高吞吐量， RocketMQ 的消息存储文件设计成文件组的概念，组内单个文件大小固定，方便引人内存 l映射机制，所有主题的消息存储基于顺序写 ， 极大地提供了消息写性能， 同时为了兼顾消息消费与消息查找，引入了消息消费队列文件与索引文件 。
* 最后是容忍存在设计缺陷 ，适当将某些工作下放给 RocketMQ 使用者 。 消息中间件的实现者经常会遇到一个难题：如何保证消息一定能被消息消费者消费，并且保证只消费一次。
RocketMQ 的设计者给出的解决办法是不解决这个难题，而是退而求其次 ，只保证消息被消
费者消费，但设计上允许消息被重复消费，这样极大地简化了消息中间件的内核，使得实现
消息发送高可用变得非常简单与高效 消息重复问题由消费者在消息消费时实现幕等 。


### 1.1.6. 设计目标
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

### 1.1.7. 常用面试题


## 1.2. 安装配置
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

## 1.3. 基本使用
<a href="#menu" style="float:right">目录</a>

**依赖引入**
```xml
<dependency>
    <groupId>org.apache.rocketmq</groupId>
    <artifactId>rocketmq-client</artifactId>
    <version>4.3.0</version>
</dependency>
    
```
### 1.3.1. **基本的例子**
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
### 1.3.2. **顺序发送**
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
### 1.3.3. **广播发送**
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
### 1.3.4. **定时发送**
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
### 1.3.5. **批量发送**
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
### 1.3.6. **过滤**
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
### 1.3.7. **日志appender**
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
### 1.3.8. **事务消息**
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

## 1.4. 协调者NameServer
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

### 1.4.1. 路由元信息
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


## 1.5. 生产者
<a href="#menu" style="float:right">目录</a>

### 1.5.1. 消息发送方式
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

### 1.5.2. 生产者API
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



### 1.5.3. 队列选择器

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
### 1.5.4. 发送流程分析
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

### 1.5.5. 默认的队列选择

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

## 1.6. 消费者
<a href="#menu" style="float:right">目录</a>

### 1.6.1. 消息消费概述
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




### 1.6.2. 消息消费推/拉方式
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

### 1.6.3. 提高 Consumer 处理能力
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

### 1.6.4. Consumer 的负载均衡
<a href="#menu" style="float:right">目录</a>

当消费组里面有多个

要做负载均衡，必须知道一些全局信息，也就是一个 ConsumerGroup 里到底有多少个 Consumer ， 知道了全局信息，才可以根据某种算法来分配，比如简单地平均分到各个 Consumer。 在 RocketMQ 中，负载均衡或者消息分配是在Consumer 端代码中完成的， Consumer 从 Broker 处获得全局信息，然后自己做负载均衡，只处理分给自己的那部分消息 

**DefaultMQPushConsumer 的负载均衡**

**DefaultMQPullConsumer 的负载均衡**

### 1.6.5. 定时消息
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


## 1.7. 消息存储
<a href="#menu" style="float:right">目录</a>


### 1.7.1. 消息存储结构
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


### 1.7.2. 消息队列与索引文件恢复
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

#### 1.7.2.1. Broker 正常停止文件恢复
<a href="#menu" style="float:right">目录</a>

Broker 正常停止文件恢复的实现为 CommitLog#recoverNormally 。

* Broker正常停止再重启时，从倒数第三个文件开始进行恢复，如果不足3 个文件，则从第一个文件开始恢复。checkCRCOnRecover 参数设置在进行文件恢复时查找消息时是否验证 CRC 。

* 解释一下两个局部变量，mappedFileOffset为当前文件已校验通过的offset,processOffset为Commitlog文件已确认的物理偏移量等于mappedFile.getFileFromOffset加上 mappedFileOffset。

* 遍历Commitlog文件，每次取出一条消息，如果查找结果为true并且消息的长度大于0表示消息正确，mappedFileOffset指针向前移动本条消息的长度；如果查找结果为true并且消息的长度等于0，表示已到该文件的末尾，如果还有下一个文件，则重置processOffset 、mappedFileOffset 重复步骤3，否则跳出循环；如果查找结构为 false ，表明该文件未填满所有消息，跳出循环，结束遍历文件
* 更新 MappedFileQueue 的 flushedWhere 与 commiteedWhere 指针 。
* 删除 offset 之后的所有文件 。遍历目录下的文件，如果文件的尾部偏移量小于offset则跳过该文件，如果尾部的偏移量大于 offset ，则进一步比较offset与文件的开始偏移量，如果 offset 大于文件的起始偏移量， 说明 当前文件包含了有效偏移里 ，设置MappedFile 的 flushedPosition 和 commitedPosition ；如果 offse t 小于文件的起始偏移量，说明该文件是有效文件后面创建的，调用 MappedFile#destory 释放 MappedFile 占用的内存资源（内存映射与内存通道等），然后加入到待删除文件列表中，最终调用 deleteExpiredFile将文件从物理磁盘删除 。 过期文件的删除将在下文详细介绍 。

#### 1.7.2.2. Broker 异常停止文件恢复
<a href="#menu" style="float:right">目录</a>

Broker 异常停止文件恢复的实现为 CommitLog#recoverAbnormally 。
异常文件恢复的步骤与正常停止文件恢复 的流程基本相同，其主要差别有两个 。 首先，正常停止默认从倒数第三个文件开始进行恢复， 而异常停止则需要从最后一个文件往前走，找到第一个消息存储正常的文件 。 其次，如果 commitlog 目录没有消息文件，如果在消息消费 队列目录下存在文件，则需要销毁 。

* 首先判断文件的魔数，如果不是 MESSAGE MAGIC_CODE ，返回 false ，表示该文件不符合 commitlog 消息文件的存储格式 
* 如果文件中第一条消息的存储时间 等于 0 ， 返回 false ，说明该消息存储文件中未存储任何消息 。
* 对比文件第一条 消息的时间戳与检测点，文件第 一条 消息的时间戳小于文件检测点说明 该文件部分消息是可靠 的 ， 则从该文件开始恢 复 。 文件检测点中保存了Commitlog 文件 、消息消费 队列（ ConsumeQueue ） 、索 引文件 （ IndexFile ）的 文件刷盘点，RocketMQ 默认选择这消息文件与消息消 费 队列这两个文件的时间刷盘点中最小值与消息文件第一消息 的时间戳对比，如果 messagelndexEnable 为 true ， 表示索引 文件的刷盘时间点也参与计算 。
* 如果根据前 3 步算法找到 MappedFile ，则遍历 MappedFile 中的消息，验证消息的合法性，并将消息重新转发到消息消费队列与索引 文件 
* 如果未找到有效 Mappe dFile ， 则设置 commitlog 目 录的 flushedWhere 、 committedWhere 指针都为 0 ，并销毁消息消费队列文件 。

存储启动时所谓的文件恢复主要完成 flushedPosition, committedWhere 指针的设置 、消息消费队列最大偏移 量加载到内存，并删除 flushedPosition 之后所有的文件。如果 Broker异常启 动， 在文件 恢复过程中 ， RocketMQ 会将最后一个有效文件中的所有消息重新转发到消息消费队 列与索引文件，确保不丢失消息，但同时会带来消息重复的 问 题，纵观RocktMQ 的整体设计思想， RocketMQ 保证消息不丢失但不保证消息不会重复消费 ， 故消息消费业务方需要 实现消息消费的幕等设计 。


### 1.7.3. 文件刷盘机制
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


    


### 1.7.4. 过期文件删除机制
<a href="#menu" style="float:right">目录</a>

* 由于使用了内存映射，只要存在于存储目录下的文件，都需要对应创建内存映射文件，如果不定时将已消费的消息从存储文件中删除，会造成极大的内存压力与资源浪费，所有 RocketMQ 采取定时删除存储文件的策略，也就是说在存储文件中， 第一个文件不一定是 00000000000000000000 ，因为该文件在某一时刻会被删除
* 由于 RocketMQ 操作 CommitLog 、 ConsumeQueue文件是基于内存映射机制并在启动的时候会加载 commitlog 、 ConsumeQueue 目录下的所有文件，为了避免内存与磁盘的浪费，不可能将消息永久存储在消息服务器上，所以需要引人一种机制来删除己过期的文件 。
* RocketMQ 顺序写 Commitlog 文件 、 ConsumeQueue 文件，所有写操作全部落在最后一个CommitLog 或 ConsumeQueue 文件上，之前的文件在下一个文件创建后将不会再被更新 。
* RocketMQ 清除过期文件的方法是 ：如果非当前写文件在一定时间间隔内没有再次被更新，则认为是过期文件，可以被删除， RocketMQ **不会关注这个文件上的消息是否全部被消费** 。
* 默认每个文件的过期时间为 72 小时 ，通过在 Broker 配置文件中设置fileReservedTime 来改变过期时间，单位为小时.


## 1.8. 高可用机制

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

### 1.8.1. 动态增减broker
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

### 1.8.2. 各种故障对消息的影响
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



## 1.9. 顺序消息
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

## 1.10. 消息饥饿问题
<a href="#menu" style="float:right">目录</a>

* 有AA，BB两种类型的消息，都放在同一个topic中，如果AA的数据量特别大，BB的数据量特别小，就会导致BB类型的消息不能即时处理
    * AA和BB放在不同的topic中，这样两种类型的消息都能够同时处理
    * AA和BB放在同一个topic的不同队列中，消费者轮询各个队列进行消费
    

## 1.11. 消息过滤 
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

## 1.12. 事务消息
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

### 1.12.1. 事务实现思想
<a href="#menu" style="float:right">目录</a>

* RocketMQ 事务消息的实现原理基于两阶段提交和定时事务状态回查来决定消息最终是提交还是回滚。
    * 应用程序在事务内完成相关业务数据落库后，需要同步调用 RocketMQ 消息发送接口，发送状态为 prepare 的消息 。 消息发送成功后， RocketMQ 服务器会回调 RocketMQ 消息发送者的事件监听程序，记录消息的本地事务状态，该相关标记与本地业务操作同属一个事务，确保消息发送与本地事务的原子’性 。
    * RocketMQ 在收到类型为 prepare 的消息时， 会首先备份消息的原主题与原消息消费队列，然后将消息存储在主题为 RMQ_SYS_TRANS_HALF_TOPIC 的消息消费队列中。
    * RocketMQ 消息服务器开启一个定时任务，消费 RMQ_SYS_TRANS_HALF_TOPIC的消息，向消息发送端（应用程序）发起消息事务状态回查，应用程序根据保存的事务状态回馈消息服务器事务的状态（提交、回滚、未知），如果是提交或回滚， 则消息服务器提交或回滚消息，如果是未知，待下一次回查， RocketMQ 允许设置一条消息的回查间隔与回查次数，如果在超过回查次数后依然无法获知消息的事务状态， 则默认回滚消息 。

![事务原理图](https://github.com/lgjlife/Java-Study/blob/master/pic/rocketmq/rockrtmq-transaction.png?raw=true)

### 1.12.2. 事务消息发送流程

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



### 1.12.3. 提交或者回滚事务
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

### 1.12.4. 事务消息回查事务状态
<a href="#menu" style="float:right">目录</a>

执行完本地事务返回本地事务状态为 UN KNOW 时，结束事务时将不做任何处理，而是通过事务状态定时回查以期得到发送端明确的事务操作（提交事务或回滚事务） 

RocketMQ 通过 TransactionalMessageCheckService 线程定 时去检测 RMQ_SYS_TRANS_HALF TOPIC 主题中的消息，回查消息的事务状态 。 TransactionalMessageCheckService 的检测频率默认为 l 分钟，可通过在 broker.conf文件中设置 transactionChecklnterval 来改变默认值，单位为毫秒。



## 1.13. 基于Netty的通信实现
<a href="#menu" style="float:right">目录</a>


