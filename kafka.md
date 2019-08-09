<span id="menu">


# 1. Kafka

## 1.1. 概述
<a href="#menu" style="float:right">目录</a>

### 1.1.1. 架构
<a href="#menu" style="float:right">目录</a>
![](https://images2018.cnblogs.com/blog/1385722/201808/1385722-20180804221732434-2116774825.png)



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

    
### 1.1.3. 快速理解
<a href="#menu" style="float:right">目录</a>


## 1.2. 安装配置
<a href="#menu" style="float:right">目录</a>

### 1.2.1. 安装&&启动

**安装JDK环境**
**安装ZOOKEEPER**
**安装Kafka**

* 从[官网 http://kafka.apache.org/downloads](http://kafka.apache.org/downloads)下载安装包

**启动**

```bash
./kafka-server-start.sh  -daemon  ../config/server.properties
```



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


## 1.4. Kafka消费者
<a href="#menu" style="float:right">目录</a>

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
    
### 1.4.4. 提交和偏移量
<a href="#menu" style="float:right">目录</a>

* Kafka不会像其他JMS队列那样需要得到消费者的确认，消费者可以使用Kafka来追踪消息在分区里的位置(偏移量)

* **提交:** 更新当前位置的操作叫做提交
* 消费者是往_consumer_offset的特殊主题上发送消息，消息包含每个分区的偏移量
    * 如果消费者一直处于运行状态，那么偏移量就没有什么用处
    * 如果发生再均衡之后，消费者可能分到新的分区，就需要从_consumer_offset上读取该分区的偏移量
* 如果提交的偏移量小于客户端处理的最后一个消息的偏移量，那么处于两个偏移量之间的消息会被重复处理
* 如果提交的偏移量大于客户端处理的最后一个消息的偏移量，那么处于两个偏移量之间的消息会丢失


#### 1.4.4.1. 自动提交 
<a href="#menu" style="float:right">目录</a>

* enable.auto.commit为true时
    * 消费者会自动把从poll方法接收到的最大偏移量提交上去，提交时间间隔由auto.commit.interval.ms控制默认值是5s
    * 存在的问题
        * 提交之前发生再均衡，将会出现重复消费的问题
* 以下几种方式需要设置enable.auto.commit为false


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

#### 1.4.4.4. 同步和异步组合提交
<a href="#menu" style="float:right">目录</a>
try 里面执行异步提交
finnally 里面执行同步提交


#### 1.4.4.5. 提交特定的偏移量
<a href="#menu" style="float:right">目录</a>

* 以上的无参方法提交的都是最后一次的偏移量
* 可以使用参数Map<TopicPartition, OffsetAndMetadata> var1 来自定义提交的偏移量。
* 使用场景是消费者收到很多消息，需要在很多时间处理，需要在处理的中间进行提交，防止再均衡导致的重消费问题。

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

### 1.4.7. 如何退出
<a href="#menu" style="float:right">目录</a>

consumer.wakeup()调用时，可以退出poll循环，并抛出WakeupException异常，不需要处理，因为这个异常只是为了退出poll循环

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


## 1.5. 深入Kafka
<a href="#menu" style="float:right">目录</a>


### 1.5.1. 集群成员关系
<a href="#menu" style="float:right">目录</a>

* kafka使用zookeeper来维护集群成员的信息
* 每个broker都有一个唯一的标识符broker ID，这个标识符可以配置文件指定，也可以自动生成，在启动时，通过创建临时节点把自己的ID注册到Zookeeper（/brokers/ids）
* 在broker停机，出现网络分区或长时间垃圾回收停顿时，broker会从Zookeeper上断开连接



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

### 1.5.5. 日志管理
<a href="#menu" style="float:right">目录</a>

日志管理器 （ LogManager）是 Kafka 用来管理所有日志的 ， 也称为日志管理子系统（ LogManagement Subsystem ）。 它负责管理 日 志的创建与删除 、 日志检索 、 日志加载和恢复、检查点及日志文件刷写磁盘 以及日志清理等

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











#### 1.5.5.2. 日志管理器启动过程
<a href="#menu" style="float:right">目录</a>


#### 1.5.5.3. 日志加载及恢复
<a href="#menu" style="float:right">目录</a>


#### 1.5.5.4. 日志清理
<a href="#menu" style="float:right">目录</a>




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

### 1.5.8. 生产请求
<a href="#menu" style="float:right">目录</a>

* 生产者发送的请求，它包含客户端要写入broker的消息



### 1.5.9. 获取请求
<a href="#menu" style="float:right">目录</a>

* 在消费者和跟随者副本需要从broker读取消息时发送的请求

### 1.5.10. 其他请求
<a href="#menu" style="float:right">目录</a>



### 1.5.11. 物理存储
<a href="#menu" style="float:right">目录</a>




## 1.6. 可靠的数据传递
<a href="#menu" style="float:right">目录</a>

### 1.6.1. 可靠性保证
<a href="#menu" style="float:right">目录</a>

### 1.6.2. 复制
<a href="#menu" style="float:right">目录</a>

### 1.6.3. broker配置
<a href="#menu" style="float:right">目录</a>


### 1.6.4. 在可靠的系统里使用生产者
<a href="#menu" style="float:right">目录</a>


### 1.6.5. 在可靠的系统里使用消费者
<a href="#menu" style="float:right">目录</a>


### 1.6.6. 验证系统可靠性
<a href="#menu" style="float:right">目录</a>




## 1.7. 构建数据管道
<a href="#menu" style="float:right">目录</a>


## 1.8. 跨越集群数据镜像
<a href="#menu" style="float:right">目录</a>

### 1.8.1. 跨集群镜像的使用场景
<a href="#menu" style="float:right">目录</a>


### 1.8.2. 多集群架构
<a href="#menu" style="float:right">目录</a>




## 1.9. 管理Kafaka
<a href="#menu" style="float:right">目录</a>


## 1.10. 监控Kafka
<a href="#menu" style="float:right">目录</a>

### 1.10.1. broker的度量指标
<a href="#menu" style="float:right">目录</a>

### 1.10.2. 非同步分区
<a href="#menu" style="float:right">目录</a>

### 1.10.3. broker度量指标
<a href="#menu" style="float:right">目录</a>


### 1.10.4. 主题和分区的度量指标
<a href="#menu" style="float:right">目录</a>

### 1.10.5. Java虚拟机监控
<a href="#menu" style="float:right">目录</a>

### 1.10.6. 操作系统监控
<a href="#menu" style="float:right">目录</a>


### 1.10.7. 日志
<a href="#menu" style="float:right">目录</a>


### 1.10.8. 客户端监控
<a href="#menu" style="float:right">目录</a>

### 1.10.9. 生产者度量指标

### 1.10.10. 消费者度量指标

### 1.10.11. 配额




### 1.10.12. 延迟监控
<a href="#menu" style="float:right">目录</a>


### 1.10.13. 端到端监控
<a href="#menu" style="float:right">目录</a>




## 1.11. 流式处理
<a href="#menu" style="float:right">目录</a>

### 1.11.1. 什么是流式处理
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



### 1.11.3. 使用场景
<a href="#menu" style="float:right">目录</a>

### 1.11.4. 流式处理的设计模式
<a href="#menu" style="float:right">目录</a>

### 1.11.5. 实例
<a href="#menu" style="float:right">目录</a>


### 1.11.6. 架构概览
<a href="#menu" style="float:right">目录</a>


### 1.11.7. 如何选择流式处理框架
<a href="#menu" style="float:right">目录</a>




