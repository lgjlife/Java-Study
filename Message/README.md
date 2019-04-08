# 消息中间件


|[数据来源](http://rocketmq.apache.org/docs/motivation/)|ActiveMQ|Kafka|RocketMQ|
|---|---|---|---|
|Client SDK|Java, .NET, C++ etc.|Java, Scala etc.|Java, C++, Go|
|Protocol and Specification|Push model, support OpenWire, STOMP, AMQP, MQTT, JMS|Pull model, support TCP|Pull model, support TCP, JMS, OpenMessaging|
|Ordered Message|Push model, support OpenWire, STOMP, AMQP, MQTT, JMS|Pull model, support TCP|Pull model, support TCP, JMS, OpenMessaging|
|Scheduled Message|Exclusive Consumer or Exclusive Queues can ensure ordering|Ensure ordering of messages within a partition|Ensure strict ordering of messages,and can scale out gracefully|
|Batched Message|Supported|Not Supported|Supported|
|BroadCast Message|Not Supported|Supported, with async producer|Supported, with sync mode to avoid message loss|
|Message Filter| Supported|Not Supported|Supported|
|Server Triggered Redelivery|Supported|Supported, you can use Kafka Streams to filter messages|Supported, property filter expressions based on SQL92|
|Message Storage|Not Supported|Not Supported|Supported|
|Message Retroactive|Supports very fast persistence using JDBC along with a high performance journal，such as levelDB, kahaDB|High performance file storage|Supported timestamp and offset two indicates|
|Message Priority|Supported|Not Supported|Not Supported|
|High Availability and Failover|Supported, depending on storage,if using kahadb it requires a ZooKeeper server|Supported, requires a ZooKeeper server|Supported, Master-Slave model, without another kit|
|Message Track|Not Supported|Not Supported|Supported|
|Configuration|The default configuration is low level, user need to optimize the configuration parameters|Kafka uses key-value pairs format for configuration. These values can be supplied either from a file or programmatically.|Work out of box,user only need to pay attention to a few configurations|
|Management and Operation Tools|Supported|Supported, use terminal command to expose core metrics|Supported, rich web and terminal command to expose core metrics|
