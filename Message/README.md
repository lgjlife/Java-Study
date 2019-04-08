# 消息中间件


|[数据来源](http://rocketmq.apache.org/docs/motivation/)|ActiveMQ|Kafka|RocketMQ|
|---|---|---|---|
|客户端|Java, .NET, C++ etc.|Java, Scala etc.|Java, C++, Go|
|协议|Push model, support OpenWire, STOMP, AMQP, MQTT, JMS|Pull model, support TCP|Pull model, support TCP, JMS, OpenMessaging|
|消息顺序性|Exclusive Consumer or Exclusive Queues can ensure ordering|Ensure ordering of messages within a partition|Ensure strict ordering of messages,and can scale out gracefully|
|定时消息|Exclusive Consumer or Exclusive Queues can ensure ordering|Ensure ordering of messages within a partition|Ensure strict ordering of messages,and can scale out gracefully|
|Batched Message|Supported|Not Supported|Supported|
|BroadCast Message|Not Supported|Supported, with async producer|Supported, with sync mode to avoid message loss|
|消息过滤|  Supported|Supported, you can use Kafka Streams to filter messages|Supported, property filter expressions based on SQL92|
|服务器触发重新传递|Supported|Not Supported|Supported|
|消息持久化|  Supports very fast persistence using JDBC along with a high performance journal，such as levelDB, kahaDB|High performance file storage|Supported timestamp and offset two indicates|
|消息追溯|Not Supported|Supported offset indicate|Supported timestamp and offset two indicates|
|消息优先级|Supported|Not Supported|Not Supported|
|高可用性和故障转移|Supported, depending on storage,if using kahadb it requires a ZooKeeper server|Supported, requires a ZooKeeper server|Supported, Master-Slave model, without another kit|
|消息跟踪|Not Supported|Not Supported|Supported|
|配置|The default configuration is low level, user need to optimize the configuration parameters|Kafka uses key-value pairs format for configuration. These values can be supplied either from a file or programmatically.|Work out of box,user only need to pay attention to a few configurations|
|管理工具|Supported|Supported, use terminal command to expose core metrics|Supported, rich web and terminal command to expose core metrics|
