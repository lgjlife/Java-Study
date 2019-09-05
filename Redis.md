<span id="menu" >
<!-- TOC -->

- [1. Redis](#1-redis)
    - [1.1. 简介](#11-简介)
        - [1.1.1. 特性](#111-特性)
        - [1.1.2. 应用场景](#112-应用场景)
        - [1.1.3. 常见客户端](#113-常见客户端)
        - [1.1.4. 与memcache对比](#114-与memcache对比)
        - [1.1.5. 常用配置说明](#115-常用配置说明)
        - [1.1.6. 常见面试题](#116-常见面试题)
    - [1.2. 常用数据结构](#12-常用数据结构)
        - [1.2.1. redis-cli和redis-server](#121-redis-cli和redis-server)
        - [1.2.2. 种基本数据类型](#122-种基本数据类型)
        - [1.2.3. 字符串](#123-字符串)
        - [1.2.4. 列表](#124-列表)
        - [1.2.5. 散列](#125-散列)
        - [1.2.6. 集合](#126-集合)
        - [1.2.7. 有序集合](#127-有序集合)
        - [1.2.8. 事务](#128-事务)
        - [1.2.9. 键](#129-键)
            - [1.2.9.1. SCAN](#1291-scan)
                - [1.2.9.1.1. 基本用法](#12911-基本用法)
                - [1.2.9.1.2. SCAN命令的保证](#12912-scan命令的保证)
                - [1.2.9.1.3. 每次执行返回的元素](#12913-每次执行返回的元素)
                - [1.2.9.1.4. COUNT选项](#12914-count选项)
                - [1.2.9.1.5. MATCH 选项](#12915-match-选项)
                - [1.2.9.1.6. 并发执行多个迭代](#12916-并发执行多个迭代)
                - [1.2.9.1.7. 中途停止迭代](#12917-中途停止迭代)
                - [1.2.9.1.8. 使用错误的游标进行增量式迭代](#12918-使用错误的游标进行增量式迭代)
                - [1.2.9.1.9. 迭代终结的保证](#12919-迭代终结的保证)
            - [1.2.9.2. SORT](#1292-sort)
                - [1.2.9.2.1. 一般SORT的用法](#12921-一般sort的用法)
                - [1.2.9.2.2. 使用ALPHA](#12922-使用alpha)
                - [1.2.9.2.3. 使用LIMIT](#12923-使用limit)
                - [1.2.9.2.4. 使用外部KEY](#12924-使用外部key)
                - [1.2.9.2.5. 保存排序结果](#12925-保存排序结果)
        - [1.2.10. 连接](#1210-连接)
        - [1.2.11. Server（服务器）](#1211-server服务器)
    - [1.3. 数据结构和对象实现原理](#13-数据结构和对象实现原理)
        - [1.3.1. 简单动态字符串](#131-简单动态字符串)
        - [1.3.2. 链表](#132-链表)
        - [1.3.3. 字典](#133-字典)
            - [1.3.3.1. Rehash](#1331-rehash)
            - [1.3.3.2. 渐进式Hash](#1332-渐进式hash)
        - [1.3.4. 跳跃表](#134-跳跃表)
        - [1.3.5. 整数集合](#135-整数集合)
        - [1.3.6. 压缩列表](#136-压缩列表)
        - [1.3.7. 对象](#137-对象)
            - [1.3.7.1. 对象类型和编码](#1371-对象类型和编码)
            - [1.3.7.2. 字符串对象](#1372-字符串对象)
            - [1.3.7.3. 列表对象](#1373-列表对象)
            - [1.3.7.4. 哈希对象](#1374-哈希对象)
            - [1.3.7.5. 集合对象](#1375-集合对象)
            - [1.3.7.6. 有序集合对象](#1376-有序集合对象)
            - [1.3.7.7. 类型检查和命令多态](#1377-类型检查和命令多态)
            - [1.3.7.8. 内存回收](#1378-内存回收)
            - [1.3.7.9. 对象共享](#1379-对象共享)
            - [1.3.7.10. 对象空转时长](#13710-对象空转时长)
    - [1.4. 持久化](#14-持久化)
        - [1.4.1. Redis持久化](#141-redis持久化)
        - [1.4.2. RDB持久化](#142-rdb持久化)
            - [1.4.2.1. 快照条件](#1421-快照条件)
            - [1.4.2.2. 快照原理](#1422-快照原理)
            - [1.4.2.3. 优点和缺点](#1423-优点和缺点)
        - [1.4.3. AOF持久化(append-only file)](#143-aof持久化append-only-file)
            - [1.4.3.1. 基本实现](#1431-基本实现)
            - [1.4.3.2. 重写AOF文件](#1432-重写aof文件)
            - [1.4.3.3. 优点和缺点](#1433-优点和缺点)
        - [1.4.4. RDB和AOF选择](#144-rdb和aof选择)
        - [1.4.5. 验证快照文件和AOF文件](#145-验证快照文件和aof文件)
        - [1.4.6. 备份 Redis 数据](#146-备份-redis-数据)
        - [1.4.7. 问题定位和优化](#147-问题定位和优化)
            - [1.4.7.1. fork操作](#1471-fork操作)
            - [1.4.7.2. 子进程开销监控和优化](#1472-子进程开销监控和优化)
    - [1.5. 集群](#15-集群)
        - [1.5.1. 复制](#151-复制)
            - [1.5.1.1. cap原理](#1511-cap原理)
            - [1.5.1.2. 配置](#1512-配置)
            - [1.5.1.3. 原理](#1513-原理)
            - [1.5.1.4. 数据库崩溃处理](#1514-数据库崩溃处理)
            - [1.5.1.5. 无硬盘复制](#1515-无硬盘复制)
            - [1.5.1.6. 增量复制](#1516-增量复制)
            - [1.5.1.7. 心跳机制](#1517-心跳机制)
        - [1.5.2. 哨兵](#152-哨兵)
            - [1.5.2.1. 什么是哨兵](#1521-什么是哨兵)
            - [1.5.2.2. 基本操作](#1522-基本操作)
            - [1.5.2.3. 配置 Sentinel](#1523-配置-sentinel)
            - [1.5.2.4. 主观下线和客观下线](#1524-主观下线和客观下线)
            - [1.5.2.5. 每个 Sentinel 都需要定期执行的任务](#1525-每个-sentinel-都需要定期执行的任务)
            - [1.5.2.6. 自动发现 Sentinel 和从服务器](#1526-自动发现-sentinel-和从服务器)
            - [1.5.2.7. Sentinel API](#1527-sentinel-api)
            - [1.5.2.8. 故障转移](#1528-故障转移)
            - [1.5.2.9. TILT 模式](#1529-tilt-模式)
            - [1.5.2.10. 处理 -BUSY 状态](#15210-处理--busy-状态)
            - [1.5.2.11. 实现原理](#15211-实现原理)
            - [1.5.2.12. 哨兵的部署](#15212-哨兵的部署)
        - [1.5.3. 集群](#153-集群)
            - [1.5.3.1. 集群简介](#1531-集群简介)
            - [1.5.3.2. Redis 集群数据共享](#1532-redis-集群数据共享)
            - [1.5.3.3. Redis 集群中的主从复制](#1533-redis-集群中的主从复制)
            - [1.5.3.4. Redis 集群的一致性保证（guarantee）](#1534-redis-集群的一致性保证guarantee)
    - [1.6. 事务](#16-事务)
        - [1.6.1. 概述](#161-概述)
        - [1.6.2. 错误处理](#162-错误处理)
        - [1.6.3. WATCH命令介绍](#163-watch命令介绍)
        - [1.6.4. 优化](#164-优化)
    - [1.7. 过期时间](#17-过期时间)
        - [1.7.1. 常用命令](#171-常用命令)
        - [1.7.2. 实现访问频率](#172-实现访问频率)
        - [1.7.3. 键的过期策略](#173-键的过期策略)
    - [1.8. 管道](#18-管道)
    - [1.9. Redis 安全](#19-redis-安全)
        - [1.9.1. 指令安全](#191-指令安全)
        - [1.9.2. 端口安全](#192-端口安全)
        - [1.9.3. Lua脚本安全](#193-lua脚本安全)
        - [1.9.4. SSL代理](#194-ssl代理)
    - [1.10. 发布订阅](#110-发布订阅)
        - [1.10.1. PubSub 缺点](#1101-pubsub-缺点)
    - [1.11. LUA脚本](#111-lua脚本)
        - [1.11.1. LUA语法](#1111-lua语法)
        - [1.11.2. Redis使用LUA](#1112-redis使用lua)
            - [1.11.2.1. 常用命令](#11121-常用命令)
        - [1.11.3. 在脚本中调用Redis命令](#1113-在脚本中调用redis命令)
            - [1.11.3.1. Jedis操作LUA](#11131-jedis操作lua)
    - [1.12. 客户端](#112-客户端)
        - [1.12.1. 通信协议](#1121-通信协议)
        - [1.12.2. 客户端管理](#1122-客户端管理)
            - [1.12.2.1. Redis 的info 命令](#11221-redis-的info-命令)
            - [1.12.2.2. 客户端API](#11222-客户端api)
            - [1.12.2.3. 客户端相关配置](#11223-客户端相关配置)
            - [1.12.2.4. 客户端统计片段](#11224-客户端统计片段)
        - [1.12.3. 客户端常见异常](#1123-客户端常见异常)
        - [1.12.4. 客户端案例分析](#1124-客户端案例分析)
            - [1.12.4.1. Redis 内存陡增](#11241-redis-内存陡增)
            - [1.12.4.2. 客户端周期性超时](#11242-客户端周期性超时)
    - [1.13. 线程模型](#113-线程模型)
        - [1.13.1. 相关概念](#1131-相关概念)
        - [1.13.2. 阻塞问题](#1132-阻塞问题)
            - [1.13.2.1. 发现阻塞](#11321-发现阻塞)
            - [1.13.2.2. 内在原因](#11322-内在原因)
            - [1.13.2.3. 外在原因](#11323-外在原因)
    - [1.14. 慢查询日志](#114-慢查询日志)
    - [1.15. 监视器](#115-监视器)
    - [1.16. 关于redis性能问题分析和优化](#116-关于redis性能问题分析和优化)
        - [1.16.1. 如何查看Redis性能](#1161-如何查看redis性能)
        - [1.16.2. 内存](#1162-内存)
        - [1.16.3. 命令处理数](#1163-命令处理数)
        - [1.16.4. 延迟时间](#1164-延迟时间)
        - [1.16.5. 内存碎片率](#1165-内存碎片率)
        - [1.16.6. 回收key](#1166-回收key)

<!-- /TOC -->

# 1. Redis
<a href="#menu" style="float:right">目录</a>


## 1.1. 简介

Redis是速度非常快的非关系型数据库。

### 1.1.1. 特性
* 速度快
    * Redis是用C语言实现的,所有数据存储在计算机内存中。
* 持久化
    * Redis将内存中的数据定期保存到文件系统中。当Redis节点故障时， 数据文件中可以从Redis数据文件恢复。
* 支持多种数据结构
    * 支持多种数据结构： String、 List、 Set、 Hash、 Sorted Set 、 地理空间(geospatial) 等等。
* 支持多种编程语言API
    * 支持Java、 C、 C++、 Go、 C#、 php、 Python、 Ruby、 Lua、 Node.js
* 功能丰富
    * 管道（Pipelining）命令， 支持事务、发布/订阅、 LUA脚本等功能
* 主从复制
    * 主服务器（master）执行添加、修改、删除，从服务器执行查询。
* 高可用及分布式
    * Redis-Sentinel（v2.8）支持高可用 ,Redis-Cluster（v3.0）支持分布式


### 1.1.2. 应用场景

* 会话缓存（Session Cache） 
    * 最常用的情景是会话缓存。 用Redis缓存会话比其他存储（如Memcached）的优势在于： Redis提供持久化。 当维护一个不是严格要求一致性的缓存时， 如果用户的购物车信息全部丢失， 大部分人都会不高兴的。
* 对象缓存 
    * 做Java项目的时候， 通常会了加快查询效率， 减少和数据库的连接次数， 我们都会在代码中加入缓存功能。 Redis的高效缓存给我们解决了难题
* 分布式锁 
    * 在互联网产品应用中， 有些场景需要加锁处理， 比如：秒杀， 全局递增ID， 分布式批处理。Redis提供一些命令SETNX， GETSET， 可以方便实现分布式锁机制。
* 队列
    * Reids 在内存存储引擎领域的一大优点是提供 list 和 set 操作， 这使得Redis能作为一个很好的消息队列平台来使用。
* 排行榜/计数器 
    * Redis在内存中对数字进行递增或递减的操作实现的非常好。 集合（Set） 和有序集合（Sorted Set） 也使得我们在执行这些操作的时候变的非常简单， Redis只是正好提供了这两种数据结构。所以， 我们要从排序集合中获取到排名最靠前的10个用户–我们称之为“user_scores”
* 流量控制
    * 借助过期时间配置实现请求流量控制
* 布隆过滤器
    * 解决缓存击穿问题

### 1.1.3. 常见客户端

* Jedis
    * 使用阻塞的I/O，且其方法调用都是同步的，程序流需要等到sockets处理完I/O才能执行，不支持异步。Jedis客户端实例不是线程安全的，所以需要通过连接池来使用Jedis。

* Redisson
    * 基于Netty框架的事件驱动的通信层，其方法调用是异步的。Redisson的API是线程安全的，所以可以操作单个Redisson连接来完成各种操作
* RedLock
    * 分布式锁实现


### 1.1.4. 与memcache对比

* Redis和Memcache都是将数据存放在内存中，都是内存数据库。不过memcache还可用于缓存其他东西，例如图片、视频等等。 
* Redis不仅仅支持简单的k/v类型的数据，同时还提供list，set，hash等数据结构的存储。 
* 虚拟内存–Redis当物理内存用完时，可以将一些很久没用到的value 交换到磁盘 
* 过期策略–memcache在set时就指定，例如set key1 0 0 8,即永不过期。Redis可以通过例如expire 设定，例如expire name 10 
* 分布式–设定memcache集群，利用magent做一主多从;redis可以做一主多从。都可以一主一从 
* 存储数据安全–memcache挂掉后，数据没了；redis可以定期保存到磁盘（持久化） 
* 灾难恢复–memcache挂掉后，数据不可恢复; redis数据丢失后可以通过aof恢复 
* Redis支持数据的备份，即master-slave模式的数据备份。

有持久化需求或者对数据结构和处理有高级要求的应用，选择redis，其他简单的key/value存储，选择memcache。

**性能上：** 
性能上都很出色，具体到细节，由于Redis只使用单核，而Memcached可以使用多核，所以平均每一个核上Redis在存储小数据时比 
Memcached性能更高。而在100k以上的数据中，Memcached性能要高于Redis，虽然Redis最近也在存储大数据的性能上进行优化，但是比起 Memcached，还是稍有逊色。

**内存空间和数据量大小：** 
* MemCached可以修改最大内存，采用LRU算法。
* Redis增加了VM的特性，突破了物理内存的限制。

**操作便利上：** 
* MemCached数据结构单一，仅用来缓存数据
* 而Redis支持更加丰富的数据类型，也可以在服务器端直接对数据进行丰富的操作,这样可以减少网络IO次数和数据体积。

**可靠性上：** 
* MemCached不支持数据持久化，断电或重启后数据消失，但其稳定性是有保证的。
* Redis支持数据持久化和数据恢复，允许单点故障，但是同时也会付出性能的代价。

**应用场景：** 
* Memcached：动态系统中减轻数据库负载，提升性能；做缓存，适合多读少写，大数据量的情况（如人人网大量查询用户信息、好友信息、文章信息等）。 
* Redis：适用于对读写效率要求都很高，数据处理业务复杂和对安全性要求较高的系统（如新浪微博的计数和微博发布部分系统，对数据安全性、读写要求都很高）。

**需要慎重考虑的部分**
1. Memcached单个key-value大小有限，一个value最大只支持1MB，而Redis最大支持512MB 
2. Memcached只是个内存缓存，对可靠性无要求；而Redis更倾向于内存数据库，因此对对可靠性方面要求比较高 
3. 从本质上讲，Memcached只是一个单一key-value内存Cache；而Redis则是一个数据结构内存数据库，支持五种数据类型，因此Redis除单纯缓存作用外，还可以处理一些简单的逻辑运算，Redis不仅可以缓存，而且还可以作为数据库用 
4. 新版本（3.0）的Redis是指集群分布式，也就是说集群本身均衡客户端请求，各个节点可以交流，可拓展行、可维护性更强大。

### 1.1.5. 常用配置说明
<a href="#menu" style="float:right">目录</a>

```
################################## INCLUDES ###################################
#这在你有标准配置模板但是每个redis服务器又需要个性设置的时候很有用。
# include /path/to/local.conf
# include /path/to/other.conf

################################ GENERAL #####################################

#是否在后台执行，yes：后台运行；no：不是后台运行（老版本默认）
daemonize yes

#3.2里的参数，是否开启保护模式，默认开启。要是配置里没有指定bind和密码。开启该参数后，redis只会本地进行访问，拒绝外部访问。要是开启了密码和bind，可以开启。否则最好关闭，设置为no。
protected-mode yes
#redis的进程文件
pidfile /var/run/redis/redis-server.pid

#redis监听的端口号。
port 6379

#此参数确定了TCP连接中已完成队列(完成三次握手之后)的长度， 当然此值必须不大于Linux系统定义的/proc/sys/net/core/somaxconn值，默认是511，而Linux的默认参数值是128。当系统并发量大并且客户端速度缓慢的时候，可以将这二个参数一起参考设定。该内核参数默认值一般是128，对于负载很大的服务程序来说大大的不够。一般会将它修改为2048或者更大。在/etc/sysctl.conf中添加:net.core.somaxconn = 2048，然后在终端中执行sysctl -p。
tcp-backlog 511

#指定 redis 只接收来自于该 IP 地址的请求，如果不进行设置，那么将处理所有请求
bind 127.0.0.1

#配置unix socket来让redis支持监听本地连接。
# unixsocket /var/run/redis/redis.sock
#配置unix socket使用文件的权限
# unixsocketperm 700

#此参数为设置客户端空闲超过timeout，服务端会断开连接，为0则服务端不会主动断开连接，不能小于0。
timeout 0

#tcp keepalive参数。如果设置不为0，就使用配置tcp的SO_KEEPALIVE值，使用keepalive有两个好处:检测挂掉的对端。降低中间设备出问题而导致网络看似连接却已经与对端端口的问题。在Linux内核中，设置了keepalive，redis会定时给对端发送ack。检测到对端关闭需要两倍的设置值。
tcp-keepalive 0

#指定了服务端日志的级别。级别包括：debug（很多信息，方便开发、测试），verbose（许多有用的信息，但是没有debug级别信息多），notice（适当的日志级别，适合生产环境），warn（只有非常重要的信息）
loglevel notice

#指定了记录日志的文件。空字符串的话，日志会打印到标准输出设备。后台运行的redis标准输出是/dev/null。
logfile /var/log/redis/redis-server.log

#是否打开记录syslog功能
# syslog-enabled no

#syslog的标识符。
# syslog-ident redis

#日志的来源、设备
# syslog-facility local0

#数据库的数量，默认使用的数据库是DB 0。可以通过”SELECT “命令选择一个db
databases 16

################################ SNAPSHOTTING ################################
# 快照配置
# 注释掉“save”这一行配置项就可以让保存数据库功能失效
# 设置sedis进行数据库镜像的频率。
# 900秒（15分钟）内至少1个key值改变（则进行数据库保存--持久化） 
# 300秒（5分钟）内至少10个key值改变（则进行数据库保存--持久化） 
# 60秒（1分钟）内至少10000个key值改变（则进行数据库保存--持久化）
save 900 1
save 300 10
save 60 10000

#当RDB持久化出现错误后，是否依然进行继续进行工作，yes：不能进行工作，no：可以继续进行工作，可以通过info中的rdb_last_bgsave_status了解RDB持久化是否有错误
stop-writes-on-bgsave-error yes

#使用压缩rdb文件，rdb文件压缩使用LZF压缩算法，yes：压缩，但是需要一些cpu的消耗。no：不压缩，需要更多的磁盘空间
rdbcompression yes

#是否校验rdb文件。从rdb格式的第五个版本开始，在rdb文件的末尾会带上CRC64的校验和。这跟有利于文件的容错性，但是在保存rdb文件的时候，会有大概10%的性能损耗，所以如果你追求高性能，可以关闭该配置。
rdbchecksum yes

#rdb文件的名称
dbfilename dump.rdb

#数据目录，数据库的写入会在这个目录。rdb、aof文件也会写在这个目录
dir /var/lib/redis

################################# REPLICATION #################################
#复制选项，slave复制对应的master。
# slaveof <masterip> <masterport>

#如果master设置了requirepass，那么slave要连上master，需要有master的密码才行。masterauth就是用来配置master的密码，这样可以在连上master后进行认证。
# masterauth <master-password>

#当从库同主机失去连接或者复制正在进行，从机库有两种运行方式：1) 如果slave-serve-stale-data设置为yes(默认设置)，从库会继续响应客户端的请求。2) 如果slave-serve-stale-data设置为no，除去INFO和SLAVOF命令之外的任何请求都会返回一个错误”SYNC with master in progress”。
slave-serve-stale-data yes

#作为从服务器，默认情况下是只读的（yes），可以修改成NO，用于写（不建议）。
slave-read-only yes

#是否使用socket方式复制数据。目前redis复制提供两种方式，disk和socket。如果新的slave连上来或者重连的slave无法部分同步，就会执行全量同步，master会生成rdb文件。有2种方式：disk方式是master创建一个新的进程把rdb文件保存到磁盘，再把磁盘上的rdb文件传递给slave。socket是master创建一个新的进程，直接把rdb文件以socket的方式发给slave。disk方式的时候，当一个rdb保存的过程中，多个slave都能共享这个rdb文件。socket的方式就的一个个slave顺序复制。在磁盘速度缓慢，网速快的情况下推荐用socket方式。
repl-diskless-sync no

#diskless复制的延迟时间，防止设置为0。一旦复制开始，节点不会再接收新slave的复制请求直到下一个rdb传输。所以最好等待一段时间，等更多的slave连上来。
repl-diskless-sync-delay 5

#slave根据指定的时间间隔向服务器发送ping请求。时间间隔可以通过 repl_ping_slave_period 来设置，默认10秒。
# repl-ping-slave-period 10

#复制连接超时时间。master和slave都有超时时间的设置。master检测到slave上次发送的时间超过repl-timeout，即认为slave离线，清除该slave信息。slave检测到上次和master交互的时间超过repl-timeout，则认为master离线。需要注意的是repl-timeout需要设置一个比repl-ping-slave-period更大的值，不然会经常检测到超时。
# repl-timeout 60

#是否禁止复制tcp链接的tcp nodelay参数，可传递yes或者no。默认是no，即使用tcp nodelay。如果master设置了yes来禁止tcp nodelay设置，在把数据复制给slave的时候，会减少包的数量和更小的网络带宽。但是这也可能带来数据的延迟。默认我们推荐更小的延迟，但是在数据量传输很大的场景下，建议选择yes。
repl-disable-tcp-nodelay no

#复制缓冲区大小，这是一个环形复制缓冲区，用来保存最新复制的命令。这样在slave离线的时候，不需要完全复制master的数据，如果可以执行部分同步，只需要把缓冲区的部分数据复制给slave，就能恢复正常复制状态。缓冲区的大小越大，slave离线的时间可以更长，复制缓冲区只有在有slave连接的时候才分配内存。没有slave的一段时间，内存会被释放出来，默认1m。
# repl-backlog-size 5mb

#master没有slave一段时间会释放复制缓冲区的内存，repl-backlog-ttl用来设置该时间长度。单位为秒。
# repl-backlog-ttl 3600

#当master不可用，Sentinel会根据slave的优先级选举一个master。最低的优先级的slave，当选master。而配置成0，永远不会被选举。
slave-priority 100

#redis提供了可以让master停止写入的方式，如果配置了min-slaves-to-write，健康的slave的个数小于N，mater就禁止写入。master最少得有多少个健康的slave存活才能执行写命令。这个配置虽然不能保证N个slave都一定能接收到master的写操作，但是能避免没有足够健康的slave的时候，master不能写入来避免数据丢失。设置为0是关闭该功能。
# min-slaves-to-write 3

#延迟小于min-slaves-max-lag秒的slave才认为是健康的slave。
# min-slaves-max-lag 10

# 设置1或另一个设置为0禁用这个特性。
# Setting one or the other to 0 disables the feature.
# By default min-slaves-to-write is set to 0 (feature disabled) and
# min-slaves-max-lag is set to 10.

################################## SECURITY ###################################
#requirepass配置可以让用户使用AUTH命令来认证密码，才能使用其他命令。这让redis可以使用在不受信任的网络中。为了保持向后的兼容性，可以注释该命令，因为大部分用户也不需要认证。使用requirepass的时候需要注意，因为redis太快了，每秒可以认证15w次密码，简单的密码很容易被攻破，所以最好使用一个更复杂的密码。
# requirepass foobared

#把危险的命令给修改成其他名称。比如CONFIG命令可以重命名为一个很难被猜到的命令，这样用户不能使用，而内部工具还能接着使用。
# rename-command CONFIG b840fc02d524045429941cc15f59e41cb7be6c52

#设置成一个空的值，可以禁止一个命令
# rename-command CONFIG ""
################################### LIMITS ####################################

# 设置能连上redis的最大客户端连接数量。默认是10000个客户端连接。由于redis不区分连接是客户端连接还是内部打开文件或者和slave连接等，所以maxclients最小建议设置到32。如果超过了maxclients，redis会给新的连接发送’max number of clients reached’，并关闭连接。
# maxclients 10000

#redis配置的最大内存容量。当内存满了，需要配合maxmemory-policy策略进行处理。注意slave的输出缓冲区是不计算在maxmemory内的。所以为了防止主机内存使用完，建议设置的maxmemory需要更小一些。
# maxmemory <bytes>

#内存容量超过maxmemory后的处理策略。
#volatile-lru：利用LRU算法移除设置过过期时间的key。
#volatile-random：随机移除设置过过期时间的key。
#volatile-ttl：移除即将过期的key，根据最近过期时间来删除（辅以TTL）
#allkeys-lru：利用LRU算法移除任何key。
#allkeys-random：随机移除任何key。
#noeviction：不移除任何key，只是返回一个写错误。
#上面的这些驱逐策略，如果redis没有合适的key驱逐，对于写命令，还是会返回错误。redis将不再接收写请求，只接收get请求。写命令包括：set setnx setex append incr decr rpush lpush rpushx lpushx linsert lset rpoplpush sadd sinter sinterstore sunion sunionstore sdiff sdiffstore zadd zincrby zunionstore zinterstore hset hsetnx hmset hincrby incrby decrby getset mset msetnx exec sort。
# maxmemory-policy noeviction

#lru检测的样本数。使用lru或者ttl淘汰算法，从需要淘汰的列表中随机选择sample个key，选出闲置时间最长的key移除。
# maxmemory-samples 5

############################## APPEND ONLY MODE ###############################
#默认redis使用的是rdb方式持久化，这种方式在许多应用中已经足够用了。但是redis如果中途宕机，会导致可能有几分钟的数据丢失，根据save来策略进行持久化，Append Only File是另一种持久化方式，可以提供更好的持久化特性。Redis会把每次写入的数据在接收后都写入 appendonly.aof 文件，每次启动时Redis都会先把这个文件的数据读入内存里，先忽略RDB文件。
appendonly no

#aof文件名
appendfilename "appendonly.aof"

#aof持久化策略的配置
#no表示不执行fsync，由操作系统保证数据同步到磁盘，速度最快。
#always表示每次写入都执行fsync，以保证数据同步到磁盘。
#everysec表示每秒执行一次fsync，可能会导致丢失这1s数据。
appendfsync everysec

# 在aof重写或者写入rdb文件的时候，会执行大量IO，此时对于everysec和always的aof模式来说，执行fsync会造成阻塞过长时间，no-appendfsync-on-rewrite字段设置为默认设置为no。如果对延迟要求很高的应用，这个字段可以设置为yes，否则还是设置为no，这样对持久化特性来说这是更安全的选择。设置为yes表示rewrite期间对新写操作不fsync,暂时存在内存中,等rewrite完成后再写入，默认为no，建议yes。Linux的默认fsync策略是30秒。可能丢失30秒数据。
no-appendfsync-on-rewrite no

#aof自动重写配置。当目前aof文件大小超过上一次重写的aof文件大小的百分之多少进行重写，即当aof文件增长到一定大小的时候Redis能够调用bgrewriteaof对日志文件进行重写。当前AOF文件大小是上次日志重写得到AOF文件大小的二倍（设置为100）时，自动启动新的日志重写过程。
auto-aof-rewrite-percentage 100
#设置允许重写的最小aof文件大小，避免了达到约定百分比但尺寸仍然很小的情况还要重写
auto-aof-rewrite-min-size 64mb

#aof文件可能在尾部是不完整的，当redis启动的时候，aof文件的数据被载入内存。重启可能发生在redis所在的主机操作系统宕机后，尤其在ext4文件系统没有加上data=ordered选项（redis宕机或者异常终止不会造成尾部不完整现象。）出现这种现象，可以选择让redis退出，或者导入尽可能多的数据。如果选择的是yes，当截断的aof文件被导入的时候，会自动发布一个log给客户端然后load。如果是no，用户必须手动redis-check-aof修复AOF文件才可以。
aof-load-truncated yes

################################ LUA SCRIPTING ###############################
# 如果达到最大时间限制（毫秒），redis会记个log，然后返回error。当一个脚本超过了最大时限。只有SCRIPT KILL和SHUTDOWN NOSAVE可以用。第一个可以杀没有调write命令的东西。要是已经调用了write，只能用第二个命令杀。
lua-time-limit 5000

################################ REDIS CLUSTER ###############################
#集群开关，默认是不开启集群模式。
# cluster-enabled yes

#集群配置文件的名称，每个节点都有一个集群相关的配置文件，持久化保存集群的信息。这个文件并不需要手动配置，这个配置文件有Redis生成并更新，每个Redis集群节点需要一个单独的配置文件，请确保与实例运行的系统中配置文件名称不冲突
# cluster-config-file nodes-6379.conf

#节点互连超时的阀值。集群节点超时毫秒数
# cluster-node-timeout 15000

#在进行故障转移的时候，全部slave都会请求申请为master，但是有些slave可能与master断开连接一段时间了，导致数据过于陈旧，这样的slave不应该被提升为master。该参数就是用来判断slave节点与master断线的时间是否过长。判断方法是：
#比较slave断开连接的时间和(node-timeout * slave-validity-factor) + repl-ping-slave-period
#如果节点超时时间为三十秒, 并且slave-validity-factor为10,假设默认的repl-ping-slave-period是10秒，即如果超过310秒slave将不会尝试进行故障转移 
# cluster-slave-validity-factor 10

#master的slave数量大于该值，slave才能迁移到其他孤立master上，如这个参数若被设为2，那么只有当一个主节点拥有2 个可工作的从节点时，它的一个从节点会尝试迁移。
# cluster-migration-barrier 1

#默认情况下，集群全部的slot有节点负责，集群状态才为ok，才能提供服务。设置为no，可以在slot没有全部分配的时候提供服务。不建议打开该配置，这样会造成分区的时候，小分区的master一直在接受写请求，而造成很长时间数据不一致。
# cluster-require-full-coverage yes

################################## SLOW LOG ###################################
###slog log是用来记录redis运行中执行比较慢的命令耗时。当命令的执行超过了指定时间，就记录在slow log中，slog log保存在内存中，所以没有IO操作。
#执行时间比slowlog-log-slower-than大的请求记录到slowlog里面，单位是微秒，所以1000000就是1秒。注意，负数时间会禁用慢查询日志，而0则会强制记录所有命令。
slowlog-log-slower-than 10000

#慢查询日志长度。当一个新的命令被写进日志的时候，最老的那个记录会被删掉。这个长度没有限制。只要有足够的内存就行。你可以通过 SLOWLOG RESET 来释放内存。
slowlog-max-len 128

################################ LATENCY MONITOR ##############################
#延迟监控功能是用来监控redis中执行比较缓慢的一些操作，用LATENCY打印redis实例在跑命令时的耗时图表。只记录大于等于下边设置的值的操作。0的话，就是关闭监视。默认延迟监控功能是关闭的，如果你需要打开，也可以通过CONFIG SET命令动态设置。
latency-monitor-threshold 0

############################# EVENT NOTIFICATION ##############################
#键空间通知使得客户端可以通过订阅频道或模式，来接收那些以某种方式改动了 Redis 数据集的事件。因为开启键空间通知功能需要消耗一些 CPU ，所以在默认配置下，该功能处于关闭状态。
#notify-keyspace-events 的参数可以是以下字符的任意组合，它指定了服务器该发送哪些类型的通知：
##K 键空间通知，所有通知以 __keyspace@__ 为前缀
##E 键事件通知，所有通知以 __keyevent@__ 为前缀
##g DEL 、 EXPIRE 、 RENAME 等类型无关的通用命令的通知
##$ 字符串命令的通知
##l 列表命令的通知
##s 集合命令的通知
##h 哈希命令的通知
##z 有序集合命令的通知
##x 过期事件：每当有过期键被删除时发送
##e 驱逐(evict)事件：每当有键因为 maxmemory 政策而被删除时发送
##A 参数 g$lshzxe 的别名
#输入的参数中至少要有一个 K 或者 E，否则的话，不管其余的参数是什么，都不会有任何 通知被分发。详细使用可以参考http://redis.io/topics/notifications

notify-keyspace-events ""

############################### ADVANCED CONFIG ###############################
#数据量小于等于hash-max-ziplist-entries的用ziplist，大于hash-max-ziplist-entries用hash
hash-max-ziplist-entries 512
#value大小小于等于hash-max-ziplist-value的用ziplist，大于hash-max-ziplist-value用hash。
hash-max-ziplist-value 64

#数据量小于等于list-max-ziplist-entries用ziplist，大于list-max-ziplist-entries用list。
list-max-ziplist-entries 512
#value大小小于等于list-max-ziplist-value的用ziplist，大于list-max-ziplist-value用list。
list-max-ziplist-value 64

#数据量小于等于set-max-intset-entries用iniset，大于set-max-intset-entries用set。
set-max-intset-entries 512

#数据量小于等于zset-max-ziplist-entries用ziplist，大于zset-max-ziplist-entries用zset。
zset-max-ziplist-entries 128
#value大小小于等于zset-max-ziplist-value用ziplist，大于zset-max-ziplist-value用zset。
zset-max-ziplist-value 64

#value大小小于等于hll-sparse-max-bytes使用稀疏数据结构（sparse），大于hll-sparse-max-bytes使用稠密的数据结构（dense）。一个比16000大的value是几乎没用的，建议的value大概为3000。如果对CPU要求不高，对空间要求较高的，建议设置到10000左右。
hll-sparse-max-bytes 3000

#Redis将在每100毫秒时使用1毫秒的CPU时间来对redis的hash表进行重新hash，可以降低内存的使用。当你的使用场景中，有非常严格的实时性需要，不能够接受Redis时不时的对请求有2毫秒的延迟的话，把这项配置为no。如果没有这么严格的实时性要求，可以设置为yes，以便能够尽可能快的释放内存。
activerehashing yes

##对客户端输出缓冲进行限制可以强迫那些不从服务器读取数据的客户端断开连接，用来强制关闭传输缓慢的客户端。
#对于normal client，第一个0表示取消hard limit，第二个0和第三个0表示取消soft limit，normal client默认取消限制，因为如果没有寻问，他们是不会接收数据的。
client-output-buffer-limit normal 0 0 0
#对于slave client和MONITER client，如果client-output-buffer一旦超过256mb，又或者超过64mb持续60秒，那么服务器就会立即断开客户端连接。
client-output-buffer-limit slave 256mb 64mb 60
#对于pubsub client，如果client-output-buffer一旦超过32mb，又或者超过8mb持续60秒，那么服务器就会立即断开客户端连接。
client-output-buffer-limit pubsub 32mb 8mb 60

#redis执行任务的频率为1s除以hz。
hz 10

#在aof重写的时候，如果打开了aof-rewrite-incremental-fsync开关，系统会每32MB执行一次fsync。这对于把文件写入磁盘是有帮助的，可以避免过大的延迟峰值。
aof-rewrite-incremental-fsync yes
```

### 1.1.6. 常见面试题
<a href="#menu" style="float:right">目录</a>

1、什么是Redis？

2、Redis相比memcached有哪些优势？

3、Redis支持哪几种数据类型？

4、Redis主要消耗什么物理资源？

5、Redis的全称是什么？

6、Redis有哪几种数据淘汰策略？

7、Redis官方为什么不提供Windows版本？

8、一个字符串类型的值能存储最大容量是多少？

9、为什么Redis需要把所有数据放到内存中？

10、Redis集群方案应该怎么做？都有哪些方案？

11、Redis集群方案什么情况下会导致整个集群不可用？

12、MySQL里有2000w数据，redis中只存20w的数据，如何保证redis中的数据都是热点数据？

13、Redis有哪些适合的场景？

14、Redis支持的Java客户端都有哪些？官方推荐用哪个？

15、Redis和Redisson有什么关系？

16、Jedis与Redisson对比有什么优缺点？

17、Redis如何设置密码及验证密码？

18、说说Redis哈希槽的概念？

19、Redis集群的主从复制模型是怎样的？

20、Redis集群会有写操作丢失吗？为什么？

21、Redis集群之间是如何复制的？

22、Redis集群最大节点个数是多少？

23、Redis集群如何选择数据库？

24、怎么测试Redis的连通性？

25、Redis中的管道有什么用？

26、怎么理解Redis事务？

27、Redis事务相关的命令有哪几个？

28、Redis key的过期时间和永久有效分别怎么设置？

29、Redis如何做内存优化？

30、Redis回收进程如何工作的？

31、Redis回收使用的是什么算法？

32、Redis如何做大量数据插入？

33、为什么要做Redis分区？

34、你知道有哪些Redis分区实现方案？

35、Redis分区有什么缺点？

36、Redis持久化数据和缓存怎么做扩容？

37、分布式Redis是前期做还是后期规模上来了再做好？为什么？

38、Twemproxy是什么？

39、支持一致性哈希的客户端有哪些？

40、Redis与其他key-value存储有什么不同？

41、Redis的内存占用情况怎么样？

42、都有哪些办法可以降低Redis的内存使用情况呢？

43、查看Redis使用情况及状态信息用什么命令？

44、Redis的内存用完了会发生什么？

45、Redis是单线程的，如何提高多核CPU的利用率？

46、一个Redis实例最多能存放多少的keys？List、Set、Sorted Set他们最多能存放多少元素？

47、Redis常见性能问题和解决方案？

48、Redis提供了哪几种持久化方式？

49、如何选择合适的持久化方式？

50、修改配置不重启Redis会实时生效吗？


## 1.2. 常用数据结构

命令执行流程
![命令执行流程](https://github.com/lgjlife/Java-Study/blob/master/pic/redis/do-cmd.png?raw=true)

### 1.2.1. redis-cli和redis-server

* redis-cli
    * redis-cli -p 3306 指定连接的端口
    * redis-cli -h 127.0.0.1 指定连接的host
    * redis-cli -c 以集群方式运行
    * redis-cli -r 3 ping 指定执行命令的次数
    * redis-cli -r 3  -i 1 ping,指定每隔1秒执行一次命令，必须和-r一起使用，毫秒则为 -i 0.05
    * -a
        * 如果Redis配置了密码， 可以用-a（auth） 选项， 有了这个选项就不需要手动输入auth命令
    * --scan和--pattern
        * --scan选项和--pattern选项用于扫描指定模式的键， 相当于使用scan命令
    * --slave
        * --slave选项是把当前客户端模拟成当前Redis服务器节点的从节点， 可以用来获取当前Redis节点的更新操作
        * 可以用来查看其他客户端对服务器的修改
    * -rdb
        * --rdb选项会请求Redis实例生成并发送RDB持久化文件， 保存在本地。可使用它做持久化文件的定期备份。 
    * --pipe
        * --pipe选项用于将命令封装成Redis通信协议定义的数据格式， 批量发送给Redis执行

* redis-server
    * redis-server redis.conf
        * 启动时指定配置文件
    * redis-server --test-memory 1024 # 操作检测当前操作系统能否提供1G的内存给Redis
        * redis-server除了启动Redis外， 还有一个--test-memory选项。 redis-server --test-memory可以用来检测当前操作系统能否稳定地分配指定容量的内存给Redis， 通过这种检测可以有效避免因为内存问题造成Redis崩溃
        



### 1.2.2. 种基本数据类型
<a href="#menu" style="float:right">目录</a>


|类型|结构存储的值|
|---|---|
|String|字符串，整数，或者浮点数|
|List|一个链表，链表上每个节点都包含了一个字符串|
|Hash|包含键值对的无序散列表|
|Set|包含字符串的无序收集器，并且每个字符串都是独一无二的|
|ZSet|包含字符串的有序收集器，并且每个字符串都是独一无二的|



### 1.2.3. 字符串
<a href="#menu" style="float:right">目录</a>

* SET
    * SET key value [EX seconds] [PX milliseconds] [NX|XX]
        * EX second ：设置键的过期时间为 second 秒。 SET key value EX second 效果等同于 SETEX key second value 。
        * PX millisecond ：设置键的过期时间为 millisecond 毫秒。 SET key value PX millisecond 效果等同于 PSETEX key millisecond value 。
        * NX ：只在键不存在时，才对键进行设置操作。 SET key value NX 效果等同于 SETNX key value 。
        * XX ：只在键已经存在时，才对键进行设置操作
    * 将字符串值 value 关联到 key 。
    * 因为 SET 命令可以通过参数来实现和 SETNX 、 SETEX 和 PSETEX 三个命令的效果，所以将来的 Redis 版本可能会废弃并最终移除 SETNX 、 SETEX 和 PSETEX 这三个命令
    * SET key-with-expire-time "hello" EX 10086
* SETBIT
    * SETBIT key offset value
    * offset 参数必须大于或等于 0 ，小于 2^32 (bit 映射被限制在 512 MB 之内)。
    * 返回值:指定偏移量原来储存的位
    * SETBIT bit 10086 1
* SETEX
    * SETEX key seconds value
    * SETEX cache_user_id 60 10086
* SETNX
    * SETNX key value
    * 将 key 的值设为 value ，当且仅当 key 不存在。
* SETRANGE
    * SETRANGE key offset value
    * 用 value 参数覆写(overwrite)给定 key 所储存的字符串值，从偏移量 offset 开始。
    * SETRANGE 命令会确保字符串足够长以便将 value 设置在指定的偏移量上，如果给定 key 原来储存的字符串长度比偏移量小(比如字符串只有 5 个字符长，但你设置的 offset 是 10 )，那么原字符和偏移量之间的空白将用零字节(zerobytes, "\x00" )来填充
    * 返回值:被 SETRANGE 修改之后，字符串的长度。
* APPEND
    * 如果 key 已经存在并且是一个字符串， APPEND 命令将 value 追加到 key 原来的值的末尾。
    * 如果 key 不存在， APPEND 就简单地将给定 key 设为 value ，就像执行 SET key value 一样。
    * 追加 value 之后， key 中字符串的长度。
    * 例子: APPEND myphone "nokia"
* BITCOUNT
    * BITCOUNT key [start] [end]
    * 计算给定字符串中，被设置为 1 的比特位的数量。
* BITOP
    * BITOP operation destkey key [key ...]
    * 对一个或多个保存二进制位的字符串 key 进行位元操作，并将结果保存到 destkey 上。
    * operation 可以是 AND 、 OR 、 NOT 、 XOR 这四种操作中的任意一种：
        * BITOP AND destkey key [key ...] ，对一个或多个 key 求逻辑并，并将结果保存到 destkey 。
        * BITOP OR destkey key [key ...] ，对一个或多个 key 求逻辑或，并将结果保存到 destkey 。
        * BITOP XOR destkey key [key ...] ，对一个或多个 key 求逻辑异或，并将结果保存到 destkey 。
        * BITOP NOT destkey key ，对给定 key 求逻辑非，并将结果保存到 destkey 。
* DECR
    * DECR key
    * 将 key 中储存的数字值减一。
    * 如果 key 不存在，那么 key 的值会先被初始化为 0 ，然后再执行 DECR 操作。
    * 如果值包含错误的类型，或字符串类型的值不能表示为数字，那么返回一个错误
* DECRBY   
    * DECRBY key decrement
    * 将 key 所储存的值减去减量 decrement 。
    * 如果 key 不存在，那么 key 的值会先被初始化为 0 ，然后再执行 DECRBY 操作。
    * 如果值包含错误的类型，或字符串类型的值不能表示为数字，那么返回一个错误。
* INCR
* INCRBY
* INCRBYFLOAT
    * INCRBYFLOAT key increment
    * 为 key 中所储存的值加上浮点数增量 increment 。
    * 如果 key 不存在，那么 INCRBYFLOAT 会先将 key 的值设为 0 ，再执行加法操作。
    * 如果命令执行成功，那么 key 的值会被更新为（执行加法之后的）新值，并且新值会以字符串的形式返回给调用者。
    
* GET
* GETBIT
    * GETBIT key offset
    * 对 key 所储存的字符串值，获取指定偏移量上的位(bit)。
    * 当 offset 比字符串值的长度大，或者 key 不存在时，返回 0 。
* GETRANGE
    * GETRANGE key start end
    * 返回 key 中字符串值的子字符串，字符串的截取范围由 start 和 end 两个偏移量决定(包括 start 和 end 在内)。
    * 负数偏移量表示从字符串最后开始计数， -1 表示最后一个字符， -2 表示倒数第二个，以此类推。
* GETSET
    * GETSET key value
    * 将给定 key 的值设为 value ，并返回 key 的旧值(old value)。
* MGET
    * MGET key [key ...]
    * 返回所有(一个或多个)给定 key 的值。
    * 如果给定的 key 里面，有某个 key 不存在，那么这个 key 返回特殊值 nil 。因此，该命令永不失败。
* MSET
    * MSET key value [key value ...]
    * 同时设置一个或多个 key-value 对。
* MSETNX
    * MSETNX key value [key value ...]
    * 同时设置一个或多个 key-value 对，当且仅当所有给定 key 都不存在。
    * 即使只有一个给定 key 已存在， MSETNX 也会拒绝执行所有给定 key 的设置操作。
* PSETEX
    * 这个命令和 SETEX 命令相似，但它以毫秒为单位设置 key 的生存时间，而不是像 SETEX 命令那样，以秒为单位。
* STRLEN
    * STRLEN key
    * 返回 key 所储存的字符串值的长度。
### 1.2.4. 列表
<a href="#menu" style="float:right">目录</a>

* BLPOP
    * BLPOP key [key ...] timeout
    * 它是 LPOP 命令的阻塞版本，当给定列表内没有任何元素可供弹出的时候，连接将被 BLPOP 命令阻塞，直到等待超时或发现可弹出元素为止。
    * 当给定多个 key 参数时，按参数 key 的先后顺序依次检查各个列表，弹出第一个非空列表的头元素。
* BRPOP
    * BRPOP key [key ...] timeout
    * BRPOP 是列表的阻塞式(blocking)弹出原语。
* RPOPLPUSH
    * RPOPLPUSH source destination
    * 命令 RPOPLPUSH 在一个原子时间内，执行以下两个动作：
        * 将列表 source 中的最后一个元素(尾元素)弹出，并返回给客户端。
        * 将source 弹出的元素插入到列表 destination ，作为 destination 列表的的头元素。
* BRPOPLPUSH
    * BRPOPLPUSH source destination timeout
    * BRPOPLPUSH 是 RPOPLPUSH 的阻塞版本，当给定列表 source 不为空时， BRPOPLPUSH 的表现和 RPOPLPUSH 一样。
* LINDEX
    * LINDEX key index
    * 返回列表 key 中，下标为 index 的元素。
* LINSERT
    * LINSERT key BEFORE|AFTER pivot value
    * 将值 value 插入到列表 key 当中，位于值 pivot 之前或之后。
    * 当 pivot 不存在于列表 key 时，不执行任何操作。
    * 当 key 不存在时， key 被视为空列表，不执行任何操作。
    * 如果 key 不是列表类型，返回一个错误。
* LLEN
    * LLEN key
    * 返回列表 key 的长度。
    * 如果 key 不存在，则 key 被解释为一个空列表，返回 0 .
    * 如果 key 不是列表类型，返回一个错误。
* LPOP
    * LPOP key
    * 移除并返回列表 key 的头元素。
* LPUSH
    * LPUSH key value [value ...]
    * 将一个或多个值 value 插入到列表 key 的表头
    * 如果 key 不存在，一个空列表会被创建并执行 LPUSH 操作。
* LPUSHX
    * LPUSHX key value
    * 将值 value 插入到列表 key 的表头，当且仅当 key 存在并且是一个列表。
    * 和 LPUSH 命令相反，当 key 不存在时， LPUSHX 命令什么也不做。
* RPUSH
    * RPUSH key value [value ...]
    * 将一个或多个值 value 插入到列表 key 的表尾(最右边)
* RPUSHX
    * RPUSHX key value
    * 将值 value 插入到列表 key 的表尾，当且仅当 key 存在并且是一个列表。
    * 和 RPUSH 命令相反，当 key 不存在时， RPUSHX 命令什么也不做。
* LRANGE
    * LRANGE key start stop
    * 返回列表 key 中指定区间内的元素，区间以偏移量 start 和 stop 指定。
* LREM
    * LREM key count value
    * 根据参数 count 的值，移除列表中与参数 value 相等的元素。
    * count 的值可以是以下几种：
        * count > 0 : 从表头开始向表尾搜索，移除与 value 相等的元素，数量为 count 。
        * count < 0 : 从表尾开始向表头搜索，移除与 value 相等的元素，数量为 count 的绝对值。
        * count = 0 : 移除表中所有与 value 相等的值。
* LSET
    * LSET key index value
    * 将列表 key 下标为 index 的元素的值设置为 value 。
* LTRIM
    * LTRIM key start stop
    * 对一个列表进行修剪(trim)，就是说，让列表只保留指定区间内的元素，不在指定区间之内的元素都将被删除。
* RPOP
    * RPOP key
    * 移除并返回列表 key 的尾元素。


    
### 1.2.5. 散列
<a href="#menu" style="float:right">目录</a>

* HDEL
    * HDEL key field [field ...]
    * 删除哈希表 key 中的一个或多个指定域，不存在的域将被忽略。
    * 返回值:被成功移除的域的数量，不包括被忽略的域。
* HEXISTS
    * HEXISTS key field
    * 查看哈希表 key 中，给定域 field 是否存在。
    * 返回值：
        * 如果哈希表含有给定域，返回 1 。
        * 如果哈希表不含有给定域，或 key 不存在，返回 0 。
* HGET
    * HGET key field
    * 返回哈希表 key 中给定域 field 的值。不存在时，返回 nil 。
* HGETALL
    * HGETALL key
    * 返回哈希表 key 中，所有的域和值。
    * 在返回值里，紧跟每个域名(field name)之后是域的值(value)，所以返回值的长度是哈希表大小的两倍。
* HINCRBY
    * HINCRBY key field increment
    * 为哈希表 key 中的域 field 的值加上增量 increment 。
* HINCRBYFLOAT
* HKEYS
    * HKEYS key返回哈希表 key 中的所有域。
    * HMSET website google www.google.com yahoo www.yahoo.com
    * HKEYS website -->  1) "google"  2) "yahoo"

* HLEN
    * HLEN key
    * 返回哈希表 key 中域的数量。
* HMGET
    * HMGET key field [field ...]
    * 返回哈希表 key 中，一个或多个给定域的值
* HMSET
    * HMSET key field value [field value ...]
    * 同时将多个 field-value (域-值)对设置到哈希表 key 中。
* HSET
    * HSET key field value
    * 将哈希表 key 中的域 field 的值设为 value 。
* HSETNX
    * HSETNX key field value
    * 将哈希表 key 中的域 field 的值设置为 value ，当且仅当域 field 不存在
* HVALS
    * HVALS key
    * 返回哈希表 key 中所有域的值。


### 1.2.6. 集合
<a href="#menu" style="float:right">目录</a>

* SADD
    * SADD key member [member ...]
    * 将一个或多个 member 元素加入到集合 key 当中，已经存在于集合的 member 元素将被忽略。
* SCARD
    * SCARD key
    * 返回集合 key 的基数(集合中元素的数量)。
* SDIFF
    * SDIFF key [key ...]
    * 返回一个集合的全部成员，该集合是所有给定集合之间的差集。
    * 不存在的 key 被视为空集
    * 返回值:差集成员的列表。
```r
redis> SMEMBERS peter's_movies
1) "bet man"
2) "start war"
3) "2012"

redis> SMEMBERS joe's_movies
1) "hi, lady"
2) "Fast Five"
3) "2012"

redis> SDIFF peter's_movies joe's_movies
1) "bet man"
2) "start war"
```
* SDIFFSTORE
    * SDIFFSTORE destination key [key ...]
    * 这个命令的作用和 SDIFF 类似，但它将结果保存到 destination 集合，而不是简单地返回结果集。
    * 如果 destination 集合已经存在，则将其覆盖。
    * destination 可以是 key 本身
    * 返回值:结果集中的元素数量。
* SINTER
    * SINTER key [key ...]
    * 返回一个集合的全部成员，该集合是所有给定集合的交集。
    * 不存在的 key 被视为空集。
    * 当给定集合当中有一个空集时，结果也为空集(根据集合运算定律)。
    * 返回值:交集成员的列表
* SINTERSTORE
    * SINTERSTORE destination key [key ...]
    * 这个命令类似于 SINTER 命令，但它将结果保存到 destination 集合，而不是简单地返回结果集。
    * 如果 destination 集合已经存在，则将其覆盖。
    * destination 可以是 key 本身
    * 返回值:结果集中的成员数量。
* SISMEMBER
    * SISMEMBER key member
    * 判断 member 元素是否集合 key 的成员。
* SMEMBERS
    * SMEMBERS key
    * 返回集合 key 中的所有成员。
    * 不存在的 key 被视为空集合
* SMOVE
    * SMOVE source destination member
    * 将 member 元素从 source 集合移动到 destination 集合
* SPOP
    * SPOP key
    * 移除并返回集合中的一个随机元素。
    * 如果只想获取一个随机元素，但不想该元素从集合中被移除的话，可以使用 SRANDMEMBER 命令
* SRANDMEMBER
* SREM
    * SREM key member [member ...]
    * 移除集合 key 中的一个或多个 member 元素，不存在的 member 元素会被忽略
* SUNION
    * SUNION key [key ...]
    * 返回一个集合的全部成员，该集合是所有给定集合的并集。
* SUNIONSTORE
    * SUNIONSTORE destination key [key ...]
    * 这个命令类似于 SUNION 命令，但它将结果保存到 destination 集合，而不是简单地返回结果集。


### 1.2.7. 有序集合
<a href="#menu" style="float:right">目录</a>

* ZADD
    * ZADD key score member [[score member] [score member] ...]
    * 将一个或多个 member 元素及其 score 值加入到有序集 key 当中。
    * score 值可以是整数值或双精度浮点数。
    * 返回值:被成功添加的新成员的数量，不包括那些被更新的、已经存在的成员。
```
redis> ZADD page_rank 10 google.com
(integer) 1
```
* ZCARD
    * ZCARD key
    * 返回有序集 key 的数量。
* ZCOUNT
    * ZCOUNT key min max
    * 返回有序集 key 中， score 值在 min 和 max 之间(默认包括 score 值等于 min 或 max )的成员的数量。
* ZINCRBY
    * ZINCRBY key increment member
    * 为有序集 key 的成员 member 的 score 值加上增量 increment.increment可为赋值
* ZRANGE
    * ZRANGE key start stop [WITHSCORES]
    * 返回有序集 key 中，指定区间内的成员。
    * 其中成员的位置按 score 值递增(从小到大)来排序。
    * 具有相同 score 值的成员按字典序(lexicographical order )来排列。
    * 如果你需要成员按 score 值递减(从大到小)来排列，请使用 ZREVRANGE 命令。
    * 下标参数 start 和 stop 都以 0 为底，也就是说，以 0 表示有序集第一个成员，以 1 表示有序集第二个成员，以此类推。
    * 你也可以使用负数下标，以 -1 表示最后一个成员， -2 表示倒数第二个成员，以此类推。
    * 超出范围的下标并不会引起错误。
        * 比如说，当 start 的值比有序集的最大下标还要大，或是 start > stop 时， ZRANGE 命令只是简单地返回一个空列表。
        * 另一方面，假如 stop 参数的值比有序集的最大下标还要大，那么 Redis 将 stop 当作最大下标来处理。
    * 可以通过使用 WITHSCORES 选项，来让成员和它的 score 值一并返回，返回列表以 value1,score1, ..., valueN,scoreN 的格式表示。
* ZRANGEBYSCORE
    * ZRANGEBYSCORE key min max [WITHSCORES] [LIMIT offset count]
    * 返回有序集 key 中，所有 score 值介于 min 和 max 之间(包括等于 min 或 max )的成员。有序集成员按 score 值递增(从小到大)次序排列。
    * 具有相同 score 值的成员按字典序(lexicographical order)来排列(该属性是有序集提供的，不需要额外的计算)。
    * 可选的 LIMIT 参数指定返回结果的数量及区间(就像SQL中的 SELECT LIMIT offset, count )，注意当 offset 很大时，定位 offset 的操作可能需要遍历整个有序集，此过程最坏复杂度为 O(N) 时间。
    * 可选的 WITHSCORES 参数决定结果集是单单返回有序集的成员，还是将有序集成员及其 score 值一起返回。
    * 区间及无限
        * min 和 max 可以是 -inf 和 +inf ，这样一来，你就可以在不知道有序集的最低和最高 score 值的情况下，使用 ZRANGEBYSCORE 这类命令。
        * 默认情况下，区间的取值使用闭区间 (小于等于或大于等于)，你也可以通过给参数前增加 ( 符号来使用可选的开区间 (小于或大于)。
举个例子：
```


ZRANGEBYSCORE zset (1 5
返回所有符合条件 1 < score <= 5 的成员，而

ZRANGEBYSCORE zset (5 (10
则返回所有符合条件 5 < score < 10 的成员

redis> ZRANGEBYSCORE salary -inf +inf               # 显示整个有序集
redis> ZRANGEBYSCORE salary -inf +inf WITHSCORES    # 显示整个有序集及成员的 score 值
redis> ZRANGEBYSCORE salary -inf 5000 WITHSCORES    # 显示工资 <=5000 的所有成员
redis> ZRANGEBYSCORE salary (5000 400000            # 显示工资大于 5000 小于等于 400000 的成员

```
* ZRANK
    * ZRANK key member
    * 返回有序集 key 中成员 member 的排名。其中有序集成员按 score 值递增(从小到大)顺序排列。
    * 排名以 0 为底，也就是说， score 值最小的成员排名为 0 。
* ZREM
    * ZREM key member [member ...]
    * 移除有序集 key 中的一个或多个成员，不存在的成员将被忽略。
* ZREMRANGEBYRANK
    * ZREMRANGEBYRANK key start stop
    * 移除有序集 key 中，指定排名(rank)区间内的所有成员。
    * 区间分别以下标参数 start 和 stop 指出，包含 start 和 stop 在内
    * 下标参数 start 和 stop 都以 0 为底
* ZREMRANGEBYSCORE
    * ZREMRANGEBYSCORE key min max
    * 移除有序集 key 中，所有 score 值介于 min 和 max 之间(包括等于 min 或 max )的成员。
* ZREVRANGE
    * ZREVRANGE key start stop [WITHSCORES]
    * 返回有序集 key 中，指定区间内的成员。
    * 其中成员的位置按 score 值递减(从大到小)来排列。
    * 具有相同 score 值的成员按字典序的逆序(reverse lexicographical order)排列。
    * 除了成员按 score 值递减的次序排列这一点外， ZREVRANGE 命令的其他方面和 ZRANGE 命令一样。
* ZREVRANGEBYSCORE
    * ZREVRANGEBYSCORE key max min [WITHSCORES] [LIMIT offset count]
    * 返回有序集 key 中， score 值介于 max 和 min 之间(默认包括等于 max 或 min )的所有的成员。有序集成员按 score 值递减(从大到小)的次序排列。
    * 具有相同 score 值的成员按字典序的逆序(reverse lexicographical order )排列。
    * 除了成员按 score 值递减的次序排列这一点外， ZREVRANGEBYSCORE 命令的其他方面和 ZRANGEBYSCORE 命令一样
* ZREVRANK
    * ZREVRANK key member
    * 返回有序集 key 中成员 member 的排名。其中有序集成员按 score 值递减(从大到小)排序。
    * 排名以 0 为底，也就是说， score 值最大的成员排名为 0 。
    * 使用 ZRANK 命令可以获得成员按 score 值递增(从小到大)排列的排名
* ZSCORE
    * ZSCORE key member
    * 如果 member 元素不是有序集 key 的成员，或 key 不存在，返回 nil 。
* ZUNIONSTORE
    * ZUNIONSTORE destination numkeys key [key ...] [WEIGHTS weight [weight ...]] [AGGREGATE SUM|MIN|MAX]
    * 计算给定的一个或多个有序集的并集，其中给定 key 的数量必须以 numkeys 参数指定，并将该并集(结果集)储存到 destination 。
    * 默认情况下，结果集中某个成员的 score 值是所有给定集下该成员 score 值之 和 。
    * WEIGHTS
        * 使用 WEIGHTS 选项，你可以为 每个 给定有序集 分别 指定一个乘法因子(multiplication factor)，每个给定有序集的所有成员的 score 值在传递给聚合函数(aggregation function)之前都要先乘以该有序集的因子。
        * 如果没有指定 WEIGHTS 选项，乘法因子默认设置为 1 。
    * AGGREGATE
        * 使用 AGGREGATE 选项，你可以指定并集的结果集的聚合方式。
        * 默认使用的参数 SUM ，可以将所有集合中某个成员的 score 值之 和 作为结果集中该成员的 score 值；使用参数 MIN ，可以将所有集合中某个成员的 最小 score 值作为结果集中该成员的 score 值；而参数 MAX 则是将所有集合中某个成员的 最大 score 值作为结果集中该成员的 score 值。
* ZINTERSTORE
    * ZINTERSTORE destination numkeys key [key ...] [WEIGHTS weight [weight ...]] [AGGREGATE SUM|MIN|MAX]
    * 计算给定的一个或多个有序集的交集，其中给定 key 的数量必须以 numkeys 参数指定，并将该交集(结果集)储存到 destination 。
    * 默认情况下，结果集中某个成员的 score 值是所有给定集下该成员 score 值之和. 
    * 关于 WEIGHTS 和 AGGREGATE 选项的描述，参见 ZUNIONSTORE 命令。


### 1.2.8. 事务
<a href="#menu" style="float:right">目录</a>


* DISCARD
    * 取消事务，放弃执行事务块内的所有命令。
    * 如果正在使用 WATCH 命令监视某个(或某些) key，那么取消所有监视，等同于执行命令 UNWATCH 。
* EXEC
    * 执行所有事务块内的命令。
    * 假如某个(或某些) key 正处于 WATCH 命令的监视之下，且事务块中有和这个(或这些) key 相关的命令，那么 EXEC 命令只在这个(或这些) key 没有被其他命令所改动的情况下执行并生效，否则该事务被打断(abort)。
* MULTI
    * 标记一个事务块的开始。
    * 事务块内的多条命令会按照先后顺序被放进一个队列当中，最后由 EXEC 命令原子性(atomic)地执行。
* UNWATCH
    * 取消 WATCH 命令对所有 key 的监视。
    * 如果在执行 WATCH 命令之后， EXEC 命令或 DISCARD 命令先被执行了的话，那么就不需要再执行 UNWATCH 了。
    * 因为 EXEC 命令会执行事务，因此 WATCH 命令的效果已经产生了；而 DISCARD 命令在取消事务的同时也会取消所有对 key 的监视，因此这两个命令执行之后，就没有必要执行 UNWATCH 了。
* WATCH
    * WATCH key [key ...]
    * 监视一个(或多个) key ，如果在事务执行之前这个(或这些) key 被其他命令所改动，那么事务将被打断。

### 1.2.9. 键
<a href="#menu" style="float:right">目录</a>

* DEL
    * DEL key [key ...]
    * 删除给定的一个或多个 key 。
    * 返回值：被删除 key 的数量。
* DUMP
    * DUMP key
    * 序列化给定 key ，并返回被序列化的值，使用 RESTORE 命令可以将这个值反序列化为 Redis 键。
```
edis> SET greeting "hello, dumping world!"
OK

redis> DUMP greeting
"\x00\x15hello, dumping world!\x06\x00E\xa0Z\x82\xd8r\xc1\xde"

```
* EXISTS
    * EXISTS key
    * 检查给定 key 是否存在。 
    * 返回值：若 key 存在，返回 1 ，否则返回 0 。
* EXPIRE
    * EXPIRE key seconds
    * 为给定 key 设置生存时间，当 key 过期时(生存时间为 0 )，它会被自动删除。
    * 使用 PERSIST 命令可以在不删除 key 的情况下，移除 key 的生存时间，让 key 重新成为一个『持久的』(persistent) key 。
* EXPIREAT
    * EXPIREAT key timestamp
    * EXPIREAT 的作用和 EXPIRE 类似，都用于为 key 设置生存时间。
    * 不同在于 EXPIREAT 命令接受的时间参数是 UNIX 时间戳(unix timestamp)。
    * 返回值：如果生存时间设置成功，返回 1 。当 key 不存在或没办法设置生存时间，返回 0 。
* KEYS
    * KEYS pattern
    * 查找所有符合给定模式 pattern 的 key 。
```
KEYS * 匹配数据库中所有 key 。
KEYS h?llo 匹配 hello ， hallo 和 hxllo 等。
KEYS h*llo 匹配 hllo 和 heeeeello 等。
KEYS h[ae]llo 匹配 hello 和 hallo ，但不匹配 hillo 。
特殊符号用 \ 隔开
```

* MIGRATE
    * MIGRATE host port key destination-db timeout [COPY] [REPLACE]
    * 将 key 原子性地从当前实例传送到目标实例的指定数据库上，一旦传送成功， key 保证会出现在目标实例上，而当前实例上的 key 会被删除。
    * 这个命令是一个原子操作，它在执行的时候会阻塞进行迁移的两个实例，直到以下任意结果发生：迁移成功，迁移失败，等到超时。
    * 命令的内部实现是这样的：它在当前实例对给定 key 执行 DUMP 命令 ，将它序列化，然后传送到目标实例，目标实例再使用 RESTORE 对数据进行反序列化，并将反序列化所得的数据添加到数据库中；当前实例就像目标实例的客户端那样，只要看到 RESTORE 命令返回 OK ，它就会调用 DEL 删除自己数据库上的 key 。
    * timeout 参数以毫秒为格式，指定当前实例和目标实例进行沟通的最大间隔时间。这说明操作并不一定要在 timeout 毫秒内完成，只是说数据传送的时间不能超过这个 timeout 数。
    * MIGRATE 命令需要在给定的时间规定内完成 IO 操作。如果在传送数据时发生 IO 错误，或者达到了超时时间，那么命令会停止执行，并返回一个特殊的错误： IOERR 。
    * 当 IOERR 出现时，有以下两种可能：
        * key 可能存在于两个实例
        * key 可能只存在于当前实例
        * 唯一不可能发生的情况就是丢失 key ，因此，如果一个客户端执行 MIGRATE 命令，并且不幸遇上 IOERR 错误，那么这个客户端唯一要做的就是检查自己数据库上的 key 是否已经被正确地删除。
    * 如果有其他错误发生，那么 MIGRATE 保证 key 只会出现在当前实例中。（当然，目标实例的给定数据库上可能有和 key 同名的键，不过这和 MIGRATE 命令没有关系）。
    * 可选项：
        * COPY ：不移除源实例上的 key 。
        * REPLACE ：替换目标实例上已存在的 key 。
* MOVE
    * MOVE key db
    * 将当前数据库的 key 移动到给定的数据库 db 当中。
    * 如果当前数据库(源数据库)和给定数据库(目标数据库)有相同名字的给定 key ，或者 key 不存在于当前数据库，那么 MOVE 没有任何效果
    * 返回值：移动成功返回 1 ，失败则返回 0 。

* OBJECT
    * 
* PERSIST
    * PERSIST key
    * 移除给定 key 的生存时间，将这个 key 从『易失的』(带生存时间 key )转换成『持久的』(一个不带生存时间、永不过期的 key )。
* PEXPIRE
    * PEXPIRE key milliseconds
    * 这个命令和 EXPIRE 命令的作用类似，但是它以毫秒为单位设置 key 的生存时间，而不像 EXPIRE 命令那样，以秒为单位。
* PEXPIREAT
    * PEXPIREAT key milliseconds-timestamp
    * 这个命令和 EXPIREAT 命令类似，但它以毫秒为单位设置 key 的过期 unix 时间戳，而不是像 EXPIREAT 那样，以秒为���位。
* PTTL
    * PTTL key
    * 这个命令类似于 TTL 命令，但它以毫秒为单位返回 key 的剩余生存时间，而不是像 TTL 命令那样，以秒为单位。
* RANDOMKEY
    * RANDOMKEY
    * 从当前数据库中随机返回(不删除)一个 key 。
* RENAME
    * RENAME key newkey
    * 将 key 改名为 newkey 。
    * 当 key 和 newkey 相同，或者 key 不存在时，返回一个错误。
    * 当 newkey 已经存在时， RENAME 命令将覆盖旧值
* RENAMENX
    * RENAMENX key newkey
    * 当且仅当 newkey 不存在时，将 key 改名为 newkey 。
    * 当 key 不存在时，返回一个错误。
* RESTORE

* TTL
    * TTL key
    * 以秒为单位，返回给定 key 的剩余生存时间(TTL, time to live)。
* TYPE
    * TYPE key
    * 返回 key 所储存的值的类型。
    * 返回值：
        * none (key不存在)
        * string (字符串)
        * list (列表)
        * set (集合)
        * zset (有序集)
        * hash (哈希表)
#### 1.2.9.1. SCAN
<a href="#menu" style="float:right">目录</a>

* SCAN cursor [MATCH pattern] [COUNT count]

* SCAN 命令及其相关的 SSCAN 命令、 HSCAN 命令和 ZSCAN 命令都用于增量地迭代（incrementally iterate）一集元素（a collection of elements）：
    * SCAN 命令用于迭代当前数据库中的数据库键。
    * SSCAN 命令用于迭代集合键中的元素。
    * HSCAN 命令用于迭代哈希键中的键值对。
    * ZSCAN 命令用于迭代有序集合中的元素（包括元素成员和元素分值）。
以上列出的四个命令都支持增量式迭代， 它们每次执行都只会返回少量元素， 所以这些命令可以用于生产环境， 而不会出现像 KEYS 命令、 SMEMBERS 命令带来的问题 —— 当 KEYS 命令被用于处理一个大的数据库时， 又或者 SMEMBERS 命令被用于处理一个大的集合键时， 它们可能会阻塞服务器达数秒之久。

不过， 增量式迭代命令也不是没有缺点的： 举个例子， 使用 SMEMBERS 命令可以返回集合键当前包含的所有元素， 但是对于 SCAN 这类增量式迭代命令来说， 因为在对键进行增量式迭代的过程中， 键可能会被修改， 所以增量式迭代命令只能对被返回的元素提供有限的保证 （offer limited guarantees about the returned elements）。

因为 SCAN 、 SSCAN 、 HSCAN 和 ZSCAN 四个命令的工作方式都非常相似， 所以这个文档会一并介绍这四个命令， 但是要记住：
* SSCAN 命令、 HSCAN 命令和 ZSCAN 命令的第一个参数总是一个数据库键。
* 而 SCAN 命令则不需要在第一个参数提供任何数据库键 —— 因为它迭代的是当前数据库中的所有数据库键。

##### 1.2.9.1.1. 基本用法
SCAN 命令是一个基于游标的迭代器（cursor based iterator）： SCAN 命令每次被调用之后， 都会向用户返回一个新的游标， 用户在下次迭代时需要使用这个新游标作为 SCAN 命令的游标参数， 以此来延续之前的迭代过程。

当 SCAN 命令的游标参数被设置为 0 时， 服务器将开始一次新的迭代， 而当服务器向用户返回值为 0 的游标时， 表示迭代已结束。

以下是一个 SCAN 命令的迭代过程示例：

```
redis 127.0.0.1:6379> scan 0
1) "17"
2)  1) "key:12"
    2) "key:8"
    3) "key:4"
    4) "key:14"
    5) "key:16"
    6) "key:17"
    7) "key:15"
    8) "key:10"
    9) "key:3"
    10) "key:7"
    11) "key:1"

redis 127.0.0.1:6379> scan 17
1) "0"
2) 1) "key:5"
   2) "key:18"
   3) "key:0"
   4) "key:2"
   5) "key:19"
   6) "key:13"
   7) "key:6"
   8) "key:9"
   9) "key:11"
```
在上面这个例子中， 第一次迭代使用 0 作为游标， 表示开始一次新的迭代。

第二次迭代使用的是第一次迭代时返回的游标， 也即是命令回复第一个元素的值 —— 17 。

从上面的示例可以看到， SCAN 命令的回复是一个包含两个元素的数组， 第一个数组元素是用于进行下一次迭代的新游标， 而第二个数组元素则是一个数组， 这个数组中包含了所有被迭代的元素。

在第二次调用 SCAN 命令时， 命令返回了游标 0 ， 这表示迭代已经结束， 整个数据集（collection）已经被完整遍历过了。

以 0 作为游标开始一次新的迭代， 一直调用 SCAN 命令， 直到命令返回游标 0 ， 我们称这个过程为一次完整遍历（full iteration）。


##### 1.2.9.1.2. SCAN命令的保证

SCAN 命令， 以及其他增量式迭代命令， 在进行完整遍历的情况下可以为用户带来以下保证： 从完整遍历开始直到完整遍历结束期间， 一直存在于数据集内的所有元素都会被完整遍历返回； 这意味着， 如果有一个元素， 它从遍历开始直到遍历结束期间都存在于被遍历的数据集当中， 那么 SCAN 命令总会在某次迭代中将这个元素返回给用户。

然而因为增量式命令仅仅使用游标来记录迭代状态， 所以这些命令带有以下缺点：
* 同一个元素可能会被返回多次。 处理重复元素的工作交由应用程序负责， 比如说， 可以考虑将迭代返回的元素仅仅用于可以安全地重复执行多次的操作上。
* 如果一个元素是在迭代过程中被添加到数据集的， 又或者是在迭代过程中从数据集中被删除的， 那么这个元素可能会被返回， 也可能不会， 这是未定义的（undefined）。

##### 1.2.9.1.3. 每次执行返回的元素
增量式迭代命令并不保证每次执行都返回某个给定数量的元素。

增量式命令甚至可能会返回零个元素， 但只要命令返回的游标不是 0 ， 应用程序就不应该将迭代视作结束。

不过命令返回的元素数量总是符合一定规则的， 在实际中：
* 对于一个大数据集来说， 增量式迭代命令每次最多可能会返回数十个元素；
* 而对于一个足够小的数据集来说， 如果这个数据集的底层表示为编码数据结构（encoded data structure，适用于是小集合键、小哈希键和小有序集合键）， 那么增量迭代命令将在一次调用中返回数据集中的所有元素。

最后， 用户可以通过增量式迭代命令提供的 COUNT 选项来指定每次迭代返回元素的最大值。

##### 1.2.9.1.4. COUNT选项
虽然增量式迭代命令不保证每次迭代所返回的元素数量， 但我们可以使用 COUNT 选项， 对命令的行为进行一定程度上的调整。

基本上， COUNT 选项的作用就是让用户告知迭代命令， 在每次迭代中应该从数据集里返回多少元素。

虽然 COUNT 选项只是对增量式迭代命令的一种提示（hint）， 但是在大多数情况下， 这种提示都是有效的。
* COUNT 参数的默认值为 10 。
* 在迭代一个足够大的、由哈希表实现的数据库、集合键、哈希键或者有序集合键时， 如果用户没有使用 MATCH 选项， 那么命令返回的元素数量通常和 COUNT 选项指定的一样， 或者比 COUNT 选项指定的数量稍多一些。
* 在迭代一个编码为整数集合（intset，一个只由整数值构成的小集合）、 或者编码为压缩列表（ziplist，由不同值构成的一个小哈希或者一个小有序集合）时， 增量式迭代命令通常会无视 COUNT 选项指定的值， 在第一次迭代就将数据集包含的所有元素都返回给用户。

并非每次迭代都要使用相同的 COUNT 值。
用户可以在每次迭代中按自己的需要随意改变 COUNT 值， 只要记得将上次迭代返回的游标用到下次迭代里面就可以了。


##### 1.2.9.1.5. MATCH 选项
和 KEYS 命令一样， 增量式迭代命令也可以通过提供一个 glob 风格的模式参数， 让命令只返回和给定模式相匹配的元素， 这一点可以通过在执行增量式迭代命令时， 通过给定 MATCH < pattern > 参数来实现。

以下是一个使用 MATCH 选项进行迭代的示例：
```
redis 127.0.0.1:6379> sadd myset 1 2 3 foo foobar feelsgood
(integer) 6

redis 127.0.0.1:6379> sscan myset 0 match f*
1) "0"
2) 1) "foo"
   2) "feelsgood"
   3) "foobar"
```
需要注意的是， 对元素的模式匹配工作是在命令从数据集中取出元素之后， 向客户端返回元素之前的这段时间内进行的， 所以如果被迭代的数据集中只有少量元素和模式相匹配， 那么迭代命令或许会在多次执行中都不返回任何元素。

以下是这种情况的一个例子：
```
redis 127.0.0.1:6379> scan 0 MATCH *11*
1) "288"
2) 1) "key:911"

redis 127.0.0.1:6379> scan 288 MATCH *11*
1) "224"
2) (empty list or set)

redis 127.0.0.1:6379> scan 224 MATCH *11*
1) "80"
2) (empty list or set)

redis 127.0.0.1:6379> scan 80 MATCH *11*
1) "176"
2) (empty list or set)

redis 127.0.0.1:6379> scan 176 MATCH *11* COUNT 1000
1) "0"
2)  1) "key:611"
    2) "key:711"
    3) "key:118"
    4) "key:117"
    5) "key:311"
    6) "key:112"
    7) "key:111"
    8) "key:110"
    9) "key:113"
   10) "key:211"
   11) "key:411"
   12) "key:115"
   13) "key:116"
   14) "key:114"
   15) "key:119"
   16) "key:811"
   17) "key:511"
   18) "key:11"
```
如你所见， 以上的大部分迭代都不返回任何元素。

在最后一次迭代， 我们通过将 COUNT 选项的参数设置为 1000 ， 强制命令为本次迭代扫描更多元素， 从而使得命令返回的元素也变多了。

##### 1.2.9.1.6. 并发执行多个迭代
在同一时间， 可以有任意多个客户端对同一数据集进行迭代， 客户端每次执行迭代都需要传入一个游标， 并在迭代执行之后获得一个新的游标， 而这个游标就包含了迭代的所有状态， 因此， 服务器无须为迭代记录任何状态。

##### 1.2.9.1.7. 中途停止迭代
因为迭代的所有状态都保存在游标里面， 而服务器无须为迭代保存任何状态， 所以客户端可以在中途停止一个迭代， 而无须对服务器进行任何通知。

即使有任意数量的迭代在中途停止， 也不会产生任何问题。
##### 1.2.9.1.8. 使用错误的游标进行增量式迭代
使用间断的（broken）、负数、超出范围或者其他非正常的游标来执行增量式迭代并不会造成服务器崩溃， 但可能会让命令产生未定义的行为。

未定义行为指的是， 增量式命令对返回值所做的保证可能会不再为真。

只有两种游标是合法的：
* 在开始一个新的迭代时， 游标必须为 0 。
* 增量式迭代命令在执行之后返回的， 用于延续（continue）迭代过程的游标。
##### 1.2.9.1.9. 迭代终结的保证
增量式迭代命令所使用的算法只保证在数据集的大小有界（bounded）的情况下， 迭代才会停止， 换句话说， 如果被迭代数据集的大小不断地增长的话， 增量式迭代命令可能永远也无法完成一次完整迭代。

从直觉上可以看出， 当一个数据集不断地变大时， 想要访问这个数据集中的所有元素就需要做越来越多的工作， 能否结束一个迭代取决于用户执行迭代的速度是否比数据集增长的速度更快。


#### 1.2.9.2. SORT
<a href="#menu" style="float:right">目录</a>

* SORT key [BY pattern] [LIMIT offset count] [GET pattern [GET pattern ...]] [ASC | DESC] [ALPHA] [STORE destination]
返回或保存给定列表、集合、有序集合 key 中经过排序的元素。
排序默认以数字作为对象，值被解释为双精度浮点数，然后进行比较。

##### 1.2.9.2.1. 一般SORT的用法
最简单的 SORT 使用方法是 SORT key 和 SORT key DESC ：
* SORT key 返回键值从小到大排序的结果。
* SORT key DESC 返回键值从大到小排序的结果。
假设 today_cost 列表保存了今日的开销金额， 那么可以用 SORT 命令对它进行排序：

```
# 开销金额列表

redis> LPUSH today_cost 30 1.5 10 8
(integer) 4

# 排序

redis> SORT today_cost
1) "1.5"
2) "8"
3) "10"
4) "30"

# 逆序排序

redis 127.0.0.1:6379> SORT today_cost DESC
1) "30"
2) "10"
3) "8"
4) "1.5"
```

##### 1.2.9.2.2. 使用ALPHA
因为 SORT 命令默认排序对象为数字， 当需要对字符串进行排序时， 需要显式地在 SORT 命令之后添加 ALPHA 修饰符：

```
# 网址
redis> LPUSH website "www.reddit.com"
(integer) 1
redis> LPUSH website "www.slashdot.com"
(integer) 2
redis> LPUSH website "www.infoq.com"
(integer) 3

# 默认（按数字）排序

redis> SORT website
1) "www.infoq.com"
2) "www.slashdot.com"
3) "www.reddit.com"

# 按字符排序

redis> SORT website ALPHA
1) "www.infoq.com"
2) "www.reddit.com"
3) "www.slashdot.com"
```

如果系统正确地设置了 LC_COLLATE 环境变量的话，Redis能识别 UTF-8 编码。


##### 1.2.9.2.3. 使用LIMIT

排序之后返回元素的数量可以通过 LIMIT 修饰符进行限制， 修饰符接受 offset 和 count 两个参数：

offset 指定要跳过的元素数量。
count 指定跳过 offset 个指定的元素之后，要返回多少个对象。
以下例子返回排序结果的前 5 个对象( offset 为 0 表示没有元素被跳过)。

```
# 添加测试数据，列表值为 1 指 10
redis 127.0.0.1:6379> RPUSH rank 1 3 5 7 9
(integer) 5
redis 127.0.0.1:6379> RPUSH rank 2 4 6 8 10
(integer) 10
# 返回列表中最小的 5 个值
redis 127.0.0.1:6379> SORT rank LIMIT 0 5
1) "1"
2) "2"
3) "3"
4) "4"
5) "5"
可以组合使用多个修饰符。以下例子返回从大到小排序的前 5 个对象。

redis 127.0.0.1:6379> SORT rank LIMIT 0 5 DESC
1) "10"
2) "9"
3) "8"
4) "7"
5) "6"
```

##### 1.2.9.2.4. 使用外部KEY

可以使用外部 key 的数据作为权重，代替默认的直接对比键值的方式来进行排序。

假设现在有用户数据如下：

|uid|	user_name_{uid}	|user_level_{uid}
|---|---|--|
|1|	admin	|9999
|2|	jack	|10
|3|	peter	|25
|4|	mary	|70
以下代码将数据输入到 Redis 中：

```
# admin

redis 127.0.0.1:6379> LPUSH uid 1
(integer) 1

redis 127.0.0.1:6379> SET user_name_1 admin
OK

redis 127.0.0.1:6379> SET user_level_1 9999
OK

# jack

redis 127.0.0.1:6379> LPUSH uid 2
(integer) 2

redis 127.0.0.1:6379> SET user_name_2 jack
OK

redis 127.0.0.1:6379> SET user_level_2 10
OK

# peter

redis 127.0.0.1:6379> LPUSH uid 3
(integer) 3

redis 127.0.0.1:6379> SET user_name_3 peter
OK

redis 127.0.0.1:6379> SET user_level_3 25
OK

# mary

redis 127.0.0.1:6379> LPUSH uid 4
(integer) 4

redis 127.0.0.1:6379> SET user_name_4 mary
OK

redis 127.0.0.1:6379> SET user_level_4 70
OK
```

**BY 选项**
默认情况下， SORT uid 直接按 uid 中的值排序：

```
redis 127.0.0.1:6379> SORT uid
1) "1"      # admin
2) "2"      # jack
3) "3"      # peter
4) "4"      # mary
```
通过使用 BY 选项，可以让 uid 按其他键的元素来排序。

比如说， 以下代码让 uid 键按照 user_level_{uid} 的大小来排序：
```
redis 127.0.0.1:6379> SORT uid BY user_level_*
1) "2"      # jack , level = 10
2) "3"      # peter, level = 25
3) "4"      # mary, level = 70
4) "1"      # admin, level = 9999
```
user_level_* 是一个占位符， 它先取出 uid 中的值， 然后再用这个值来查找相应的键。

比如在对 uid 列表进行排序时， 程序就会先取出 uid 的值 1 、 2 、 3 、 4 ， 然后使用 user_level_1 、 user_level_2 、 user_level_3 和 user_level_4 的值作为排序 uid 的权重。

**GET 选项**
使用 GET 选项， 可以根据排序的结果来取出相应的键值。

比如说， 以下代码先排序 uid ， 再取出键 user_name_{uid} 的值：
```
redis 127.0.0.1:6379> SORT uid GET user_name_*
1) "admin"
2) "jack"
3) "peter"
4) "mary"
```

**组合使用 BY 和 GET**
通过组合使用 BY 和 GET ， 可以让排序结果以更直观的方式显示出来。

比如说， 以下代码先按 user_level_{uid} 来排序 uid 列表， 再取出相应的 user_name_{uid} 的值：
```
redis 127.0.0.1:6379> SORT uid BY user_level_* GET user_name_*
1) "jack"       # level = 10
2) "peter"      # level = 25
3) "mary"       # level = 70
4) "admin"      # level = 9999
```
现在的排序结果要比只使用 SORT uid BY user_level_* 要直观得多。

**获取多个外部键**
可以同时使用多个 GET 选项， 获取多个外部键的值。

以下代码就按 uid 分别获取 user_level_{uid} 和 user_name_{uid} ：
```
redis 127.0.0.1:6379> SORT uid GET user_level_* GET user_name_*
1) "9999"       # level
2) "admin"      # name
3) "10"
4) "jack"
5) "25"
6) "peter"
7) "70"
8) "mary"
```
GET 有一个额外的参数规则，那就是 —— 可以用 # 获取被排序键的值。

以下代码就将 uid 的值、及其相应的 user_level_* 和 user_name_* 都返回为结果：
```
redis 127.0.0.1:6379> SORT uid GET # GET user_level_* GET user_name_*
1) "1"          # uid
2) "9999"       # level
3) "admin"      # name
4) "2"
5) "10"
6) "jack"
7) "3"
8) "25"
9) "peter"
10) "4"
11) "70"
12) "mary"
```

**获取外部键，但不进行排序**
通过将一个不存在的键作为参数传给 BY 选项， 可以让 SORT 跳过排序操作， 直接返回结果：
```
redis 127.0.0.1:6379> SORT uid BY not-exists-key
1) "4"
2) "3"
3) "2"
4) "1"
```
这种用法在单独使用时，没什么实际用处。

不过，通过将这种用法和 GET 选项配合， 就可以在不排序的情况下， 获取多个外部键， 相当于执行一个整合的获取操作（类似于 SQL 数据库的 join 关键字）。

以下代码演示了，如何在不引起排序的情况下，使用 SORT 、 BY 和 GET 获取多个外部键：
```
redis 127.0.0.1:6379> SORT uid BY not-exists-key GET # GET user_level_* GET user_name_*
1) "4"      # id
2) "70"     # level
3) "mary"   # name
4) "3"
5) "25"
6) "peter"
7) "2"
8) "10"
9) "jack"
10) "1"
11) "9999"
12) "admin"
```

**将哈希表作为 GET 或 BY 的参数**
除了可以将字符串键之外， 哈希表也可以作为 GET 或 BY 选项的参数来使用。

比如说，对于前面给出的用户信息表：

|uid|	user_name_{uid}	|user_level_{uid}
|---|---|---|
|1|	admin	|9999
|2|	jack	|10
|3|	peter	|25
|4|	mary	|70

我们可以不将用户的名字和级别保存在 user_name_{uid} 和 user_level_{uid} 两个字符串键中， 而是用一个带有 name 域和 level 域的哈希表 user_info_{uid} 来保存用户的名字和级别信息：
```
redis 127.0.0.1:6379> HMSET user_info_1 name admin level 9999
OK

redis 127.0.0.1:6379> HMSET user_info_2 name jack level 10
OK

redis 127.0.0.1:6379> HMSET user_info_3 name peter level 25
OK

redis 127.0.0.1:6379> HMSET user_info_4 name mary level 70
OK
```
之后， BY 和 GET 选项都可以用 key->field 的格式来获取哈希表中的域的值， 其中 key 表示哈希表键， 而 field 则表示哈希表的域：
```
redis 127.0.0.1:6379> SORT uid BY user_info_*->level
1) "2"
2) "3"
3) "4"
4) "1"

redis 127.0.0.1:6379> SORT uid BY user_info_*->level GET user_info_*->name
1) "jack"
2) "peter"
3) "mary"
4) "admin"
```
##### 1.2.9.2.5. 保存排序结果

默认情况下， SORT 操作只是简单地返回排序结果，并不进行任何保存操作。

通过给 STORE 选项指定一个 key 参数，可以将排序结果保存到给定的键上。

如果被指定的 key 已存在，那么原有的值将被排序结果覆盖。
```
# 测试数据

redis 127.0.0.1:6379> RPUSH numbers 1 3 5 7 9
(integer) 5

redis 127.0.0.1:6379> RPUSH numbers 2 4 6 8 10
(integer) 10

redis 127.0.0.1:6379> LRANGE numbers 0 -1
1) "1"
2) "3"
3) "5"
4) "7"
5) "9"
6) "2"
7) "4"
8) "6"
9) "8"
10) "10"

redis 127.0.0.1:6379> SORT numbers STORE sorted-numbers
(integer) 10

# 排序后的结果

redis 127.0.0.1:6379> LRANGE sorted-numbers 0 -1
1) "1"
2) "2"
3) "3"
4) "4"
5) "5"
6) "6"
7) "7"
8) "8"
9) "9"
10) "10"
```
可以通过将 SORT 命令的执行结果保存，并用 EXPIRE 为结果设置生存时间，以此来产生一个 SORT 操作的结果缓存。

这样就可以避免对 SORT 操作的频繁调用：只有当结果集过期时，才需要再调用一次 SORT 操作。

另外，为了正确实现这一用法，你可能需要加锁以避免多个客户端同时进行缓存重建(也就是多个客户端，同一时间进行 SORT 操作，并保存为结果集)，具体参见 SETNX 命令。



### 1.2.10. 连接
<a href="#menu" style="float:right">目录</a>

* AUTH
    * AUTH password
    * 通过设置配置文件中 requirepass 项的值(使用命令 CONFIG SET requirepass password )，可以使用密码来保护 Redis 服务器。
    * 如果开启了密码保护的话，在每次连接 Redis 服务器之后，就要使用 AUTH 命令解锁，解锁之后才能使用其他 Redis 命令。
    * 如果 AUTH 命令给定的密码 password 和配置文件中的密码相符的话，服务器会返回 OK 并开始接受命令输入。
    * 另一方面，假如密码不匹配的话，服务器将返回一个错误，并要求客户端需重新输入密码。
* ECHO
    * ECHO message
    * 打印一个特定的信息 message ，测试时使用。
* PING
    * PING
    * 使用客户端向 Redis 服务器发送一个 PING ，如果服务器运作正常的话，会返回一个 PONG 。
    * 通常用于测试与服务器的连接是否仍然生效，或者用于测量延迟值。
* QUIT
    * QUIT
    * 请求服务器关闭与当前客户端的连接。
    * 一旦所有等待中的回复(如果有的话)顺利写入到客户端，连接就会被关闭
* SELECT
    * SELECT index
    * 切换到指定的数据库，数据库索引号 index 用数字值指定，以 0 作为起始索引值。
    * 默认使用 0 号数据库

    
### 1.2.11. Server（服务器）
<a href="#menu" style="float:right">目录</a>

* BGREWRITEAOF
    * 执行一个 AOF文件 重写操作。重写会创建一个当前 AOF 文件的体积优化版本。
    * 即使 BGREWRITEAOF 执行失败，也不会有任何数据丢失，因为旧的 AOF 文件在 BGREWRITEAOF 成功之前不会被修改。
    * 重写操作只会在没有其他持久化工作在后台执行时被触发，也就是说：
        * 如果 Redis 的子进程正在执行快照的保存工作，那么 AOF 重写的操作会被预定(scheduled)，等到保存工作完成之后再执行 AOF 重写。在这种情况下， BGREWRITEAOF 的返回值仍然是 OK ，但还会加上一条额外的信息，说明 BGREWRITEAOF 要等到保存操作完成之后才能执行。在 Redis 2.6 或以上的版本，可以使用 INFO 命令查看 BGREWRITEAOF 是否被预定。
        * 如果已经有别的 AOF 文件重写在执行，那么 BGREWRITEAOF 返回一个错误，并且这个新的 BGREWRITEAOF 请求也不会被预定到下次执行。
* BGSAVE
    * 在后台异步(Asynchronously)保存当前数据库的数据到磁盘。
    * BGSAVE 命令执行之后立即返回 OK ，然后 Redis fork 出一个新子进程，原来的 Redis 进程(父进程)继续处理客户端请求，而子进程则负责将数据保存到磁盘，然后退出。
* CLIENT GETNAME
    * 返回 CLIENT SETNAME 命令为连接设置的名字。
    * 因为新创建的连接默认是没有名字的， 对于没有名字的连接， CLIENT GETNAME 返回空白回复。
* CLIENT KILL
    * CLIENT KILL ip:port
    * 关闭地址为 ip:port 的客户端。
    * ip:port 应该和 CLIENT LIST 命令输出的其中一行匹配。
    * 因为 Redis 使用单线程设计，所以当 Redis 正在执行命令的时候，不会有客户端被断开连接。
    * 如果要被断开连接的客户端正在执行命令，那么当这个命令执行之后，在发送下一个命令的时候，它就会收到一个网络错误，告知它自身的连接已被关闭。
* CLIENT LIST
    * CLIENT LIST
    * 返回所有连接到服务器的客户端信息和统计数据。
    * 命令返回多行字符串，这些字符串按以下形式被格式化：
        * 每个已连接客户端对应一行（以 LF 分割）
        * 每行字符串由一系列 属性=值 形式的域组成，每个域之间以空格分开
    * 以下是域的含义：
        * addr ： 客户端的地址和端口
        * fd ： 套接字所使用的文件描述符
        * age ： 以秒计算的已连接时长
        * idle ： 以秒计算的空闲时长
        * flags ： 客户端 flag （见下文）
        * db ： 该客户端正在使用的数据库 ID
        * sub ： 已订阅频道的数量
        * psub ： 已订阅模式的数量
        * multi ： 在事务中被执行的命令数量
        * qbuf ： 查询缓存的长度（ 0 表示没有查询在等待）
        * qbuf-free ： 查询缓存的剩余空间（ 0 表示没有剩余空间）
        * obl ： 输出缓存的长度
        * oll ： 输出列表的长度（当输出缓存没有剩余空间时，回复被入队到这个队列里）
        * omem ： 输出缓存的内存占用量
        * events ： 文件描述符事件（见下文）
        * cmd ： 最近一次执行的命令
    * 客户端 flag 可以由以下部分组成：
        * O ： 客户端是 MONITOR 模式下的附属节点（slave）
        * S ： 客户端是一般模式下（normal）的附属节点
        * M ： 客户端是主节点（master）
        * x ： 客户端正在执行事务
        * b ： 客户端正在等待阻塞事件
        * i ： 客户端正在等待 VM I/O 操作（已废弃）
        * d ： 一个受监视（watched）的键已被修改， EXEC 命令将失败
        * c : 在将回复完整地写出之后，关闭链接
        * u : 客户端未被阻塞（unblocked）
        * A : 尽可能快地关闭连接
        * N : 未设置任何 flag
    * 文件描述符事件可以是：
        * r : 客户端套接字（在事件 loop 中）是可读的（readable）
        * w : 客户端套接字（在事件 loop 中）是可写的（writeable）
```
redis> CLIENT LIST
addr=127.0.0.1:43143 fd=6 age=183 idle=0 flags=N db=0 sub=0 psub=0 multi=-1 qbuf=0 qbuf-free=32768 obl=0 oll=0 omem=0 events=r cmd=client
addr=127.0.0.1:43163 fd=5 age=35 idle=15 flags=N db=0 sub=0 psub=0 multi=-1 qbuf=0 qbuf-free=0 obl=0 oll=0 omem=0 events=r cmd=ping
addr=127.0.0.1:43167 fd=7 age=24 idle=6 flags=N db=0 sub=0 psub=0 multi=-1 qbuf=0 qbuf-free=0 obl=0 oll=0 omem=0 events=r cmd=get
```

* CLIENT SETNAME
    * CLIENT SETNAME connection-name
    * 为当前连接分配一个名字。这个名字会显示在 CLIENT LIST 命令的结果中， 用于识别当前正在与服务器进行连接的客户端。
* CONFIG GET
    * CONFIG GET parameter
    * CONFIG GET 命令用于取得运行中的 Redis 服务器的配置参数(configuration parameters)
    * 例子
        * 执行 CONFIG GET s* 命令，服务器就会返回所有以 s 开头的配置参数及参数的值：
        * 使用命令 CONFIG GET * ，可以列出 CONFIG GET 命令支持的所有参数：
        * CONFIG GET save 单个参数
* CONFIG RESETSTAT
    * CONFIG RESETSTAT
    * 重置 INFO 命令中的某些统计数据，包括：
        * Keyspace hits (键空间命中次数)
        * Keyspace misses (键空间不命中次数)
        * Number of commands processed (执行命令的次数)
        * Number of connections received (连接服务器的次数)
        * Number of expired keys (过期key的数量)
        * Number of rejected connections (被拒绝的连接数量)
        * Latest fork(2) time(最后执行 fork(2) 的时间)
        * The aof_delayed_fsync counter(aof_delayed_fsync 计数器的值)

* CONFIG REWRITE
    * CONFIG REWRITE
    * CONFIG REWRITE 命令对启动 Redis 服务器时所指定的 redis.conf 文件进行改写： 因为 CONFIG SET 命令可以对服务器的当前配置进行修改， 而修改后的配置可能和 redis.conf 文件中所描述的配置不一样， CONFIG REWRITE 的作用就是通过尽可能少的修改， 将服务器当前所使用的配置记录到 redis.conf 文件中。
    * 重写会以非常保守的方式进行：
        * 原有 redis.conf 文件的整体结构和注释会被尽可能地保留。
        * 如果一个选项已经存在于原有 redis.conf 文件中 ， 那么对该选项的重写会在选项原本所在的位置（行号）上进行。
        * 如果一个选项不存在于原有 redis.conf 文件中， 并且该选项被设置为默认值， 那么重写程序不会将这个选项添加到重写后的 redis.conf 文件中。
        * 如果一个选项不存在于原有 redis.conf 文件中， 并且该选项被设置为非默认值， 那么这个选项将被添加到重写后的 redis.conf 文件的末尾。
        * 未使用的行会被留白。 比如说， 如果你在原有 redis.conf 文件上设置了数个关于 save 选项的参数， 但现在你将这些 save 参数的一个或全部都关闭了， 那么这些不再使用的参数原本所在的行就会变成空白的。
    * 即使启动服务器时所指定的 redis.conf 文件已经不再存在， CONFIG REWRITE 命令也可以重新构建并生成出一个新的 redis.conf 文件。
    * 另一方面， 如果启动服务器时没有载入 redis.conf 文件， 那么执行 CONFIG REWRITE 命令将引发一个错误。
* CONFIG SET
    * CONFIG SET parameter value
    * CONFIG SET 命令可以动态地调整 Redis 服务器的配置(configuration)而无须重启。
    * CONFIG SET 可以修改的配置参数可以使用命令 CONFIG GET * 来列出，所有被 CONFIG SET 修改的配置参数都会立即生效。
* DBSIZE
    * DBSIZE
    * 返回当前数据库的 key 的数量。
* DEBUG OBJECT
    * DEBUG OBJECT key
    * DEBUG OBJECT 是一个调试命令，它不应被客户端所使用
* DEBUG SEGFAULT
    * DEBUG SEGFAULT
    * 执行一个不合法的内存访问从而让 Redis 崩溃，仅在开发时用于 BUG 模拟。
* FLUSHALL
    * FLUSHALL
    * 清空整个 Redis 服务器的数据(删除所有数据库的所有 key )。
* FLUSHDB
    * FLUSHDB
    * 清空当前数据库中的所有 key。
* INFO
    * INFO [section]
    * 以一种易于解释（parse）且易于阅读的格式，返回关于 Redis 服务器的各种信息和统计数值。
    * 通过给定可选的参数 section ，可以让命令只返回某一部分的信息：
    * server : 一般 Redis 服务器信息，包含以下域：
        * redis_version : Redis 服务器版本
        * redis_git_sha1 : Git SHA1
        * redis_git_dirty : Git dirty flag
        * os : Redis 服务器的宿主操作系统
        * arch_bits : 架构（32 或 64 位）
        * multiplexing_api : Redis 所使用的事件处理机制
        * gcc_version : 编译 Redis 时所使用的 GCC 版本
        * process_id : 服务器进程的 PID
        * run_id : Redis 服务器的随机标识符（用于 Sentinel 和集群）
        * tcp_port : TCP/IP 监听端口
        * uptime_in_seconds : 自 Redis 服务器启动以来，经过的秒数
        * uptime_in_days : 自 Redis 服务器启动以来，经过的天数
        * lru_clock : 以分钟为单位进行自增的时钟，用于 LRU 管理
    * clients : 已连接客户端信息，包含以下域：
        * connected_clients : 已连接客户端的数量（不包括通过从属服务器连接的客户端）
        * client_longest_output_list : 当前连接的客户端当中，最长的输出列表
        * client_longest_input_buf : 当前连接的客户端当中，最大输入缓存
        * blocked_clients : 正在等待阻塞命令（BLPOP、BRPOP、BRPOPLPUSH）的客户端的数量
    * memory : 内存信息，包含以下域：
        * used_memory : 由 Redis 分配器分配的内存总量，以字节（byte）为单位
        * used_memory_human : 以人类可读的格式返回 Redis 分配的内存总量
        * used_memory_rss : 从操作系统的角度，返回 Redis 已分配的内存总量（俗称常驻集大小）。这个值和 top 、 ps 等命令的输出一致。
        * used_memory_peak : Redis 的内存消耗峰值（以字节为单位）
        * used_memory_peak_human : 以人类可读的格式返回 Redis 的内存消耗峰值
        * used_memory_lua : Lua 引擎所使用的内存大小（以字节为单位）
        * mem_fragmentation_ratio : used_memory_rss 和 used_memory 之间的比率
        * mem_allocator : 在编译时指定的， Redis 所使用的内存分配器。可以是 libc 、 jemalloc 或者 tcmalloc 。
        * 在理想情况下， used_memory_rss 的值应该只比 used_memory 稍微高一点儿。
        * 当 rss > used ，且两者的值相差较大时，表示存在（内部或外部的）内存碎片。
        * 内存碎片的比率可以通过 mem_fragmentation_ratio 的值看出。
        * 当 used > rss 时，表示 Redis 的部分内存被操作系统换出到交换空间了，在这种情况下，操作可能会产生明显的延迟。
        * Because Redis does not have control over how its allocations are mapped to memory pages, high used_memory_rss is often the result of a spike in memory usage.

        * 当 Redis 释放内存时，分配器可能会，也可能不会，将内存返还给操作系统。
        * 如果 Redis 释放了内存，却没有将内存返还给操作系统，那么 used_memory 的值可能和操作系统显示的 Redis 内存占用并不一致。
        * 查看 used_memory_peak 的值可以验证这种情况是否发生。
    * persistence : RDB 和 AOF 的相关信息
    * stats : 一般统计信息
    * replication : 主/从复制信息
    * cpu : CPU 计算量统计信息
    * commandstats : Redis 命令统计信息
    * cluster : Redis 集群信息
    * keyspace : 数据库相关的统计信息
    * all : 返回所有信息
    * default : 返回默认选择的信息
    * 当不带参数直接调用 INFO 命令时，使用 default 作为默认参数。
    
* LASTSAVE
    * LASTSAVE
    * 返回最近一次 Redis 成功将数据保存到磁盘上的时间，以 UNIX 时间戳格式表示。
* MONITOR
    * MONITOR
    * 实时打印出 Redis 服务器接收到的命令，调试用。
* PSYNC
    * PSYNC <MASTER_RUN_ID> <OFFSET>
    * 用于复制功能(replication)的内部命令。
* SAVE
    * SAVE
    * SAVE 命令执行一个同步保存操作，将当前 Redis 实例的所有数据快照(snapshot)以 RDB 文件的形式保存到硬盘。
* SHUTDOWN
    * SHUTDOWN
    * SHUTDOWN 命令执行以下操作：
        * 停止所有客户端
        * 如果有至少一个保存点在等待，执行 SAVE 命令
        * 如果 AOF 选项被打开，更新 AOF 文件
        * 关闭 redis 服务器(server)
    * 如果持久化被打开的话， SHUTDOWN 命令会保证服务器正常关闭而不丢失任何数据。
    * 另一方面，假如只是单纯地执行 SAVE 命令，然后再执行 QUIT 命令，则没有这一保证 —— 因为在执行 SAVE 之后、执行 QUIT 之前的这段时间中间，其他客户端可能正在和服务器进行通讯，这时如果执行 QUIT 就会造成数据丢失。
    * SAVE 和 NOSAVE 修饰符
        * 通过使用可选的修饰符，可以修改 SHUTDOWN 命令的表现。比如说：
        * 执行 SHUTDOWN SAVE 会强制让数据库执行保存操作，即使没有设定(configure)保存点
        * 执行 SHUTDOWN NOSAVE 会阻止数据库执行保存操作，即使已经设定有一个或多个保存点(你可以将这一用法看作是强制停止服务器的一个假想的 ABORT 命令)
* SLAVEOF
    * SLAVEOF host port
    * SLAVEOF 命令用于在 Redis 运行时动态地修改复制(replication)功能的行为。
    * 通过执行 SLAVEOF host port 命令，可以将当前服务器转变为指定服务器的从属服务器(slave server)。
    * 如果当前服务器已经是某个主服务器(master server)的从属服务器，那么执行 SLAVEOF host port 将使当前服务器停止对旧主服务器的同步，丢弃旧数据集，转而开始对新主服务器进行同步。
    * 另外，对一个从属服务器执行命令 SLAVEOF NO ONE 将使得这个从属服务器关闭复制功能，并从从属服务器转变回主服务器，原来同步所得的数据集不会被丢弃。
    * 利用『 SLAVEOF NO ONE 不会丢弃同步所得数据集』这个特性，可以在主服务器失败的时候，将从属服务器用作新的主服务器，从而实现无间断运行。
* SLOWLOG
    * SLOWLOG subcommand [argument]
    * 什么是 SLOWLOG
        * Slow log 是 Redis 用来记录查询执行时间的日志系统。
        * 查询执行时间指的是不包括像客户端响应(talking)、发送回复等 IO 操作，而单单是执行一个查询命令所耗费的时间。
        * 另外，slow log 保存在内存里面，读写速度非常快，因此你可以放心地使用它，不必担心因为开启 slow log 而损害 Redis 的速度。
**设置 SLOWLOG**

Slow log 的行为由两个配置参数(configuration parameter)指定，可以通过改写 redis.conf 文件或者用 CONFIG GET 和 CONFIG SET 命令对它们动态地进行修改。

第一个选项是 slowlog-log-slower-than ，它决定要对执行时间大于多少微秒(microsecond，1秒 = 1,000,000 微秒)的查询进行记录。

比如执行以下命令将让 slow log 记录所有查询时间大于等于 100 微秒的查询：
```
CONFIG SET slowlog-log-slower-than 100
```
而以下命令记录所有查询时间大于 1000 微秒的查询：
```
CONFIG SET slowlog-log-slower-than 1000
```
另一个选项是 slowlog-max-len ，它决定 slow log 最多能保存多少条日志， slow log 本身是一个 FIFO 队列，当队列大小超过 slowlog-max-len 时，最旧的一条日志将被删除，而最新的一条日志加入到 slow log ，以此类推。

以下命令让 slow log 最多保存 1000 条日志：
```
CONFIG SET slowlog-max-len 1000
```
使用 CONFIG GET 命令可以查询两个选项的当前值：
```
redis> CONFIG GET slowlog-log-slower-than
1) "slowlog-log-slower-than"
2) "1000"

redis> CONFIG GET slowlog-max-len
1) "slowlog-max-len"
2) "1000"
```
**查看 slow log**

要查看 slow log ，可以使用 SLOWLOG GET 或者 SLOWLOG GET number 命令，前者打印所有 slow log ，最大长度取决于 slowlog-max-len 选项的值，而 SLOWLOG GET number 则只打印指定数量的日志。

最新的日志会最先被打印：

```
# 为测试需要，将 slowlog-log-slower-than 设成了 10 微秒

redis> SLOWLOG GET
1) 1) (integer) 12                      # 唯一性(unique)的日志标识符
   2) (integer) 1324097834              # 被记录命令的执行时间点，以 UNIX 时间戳格式表示
   3) (integer) 16                      # 查询执行时间，以微秒为单位
   4) 1) "CONFIG"                       # 执行的命令，以数组的形式排列
      2) "GET"                          # 这里完整的命令是 CONFIG GET slowlog-log-slower-than
      3) "slowlog-log-slower-than"

2) 1) (integer) 11
   2) (integer) 1324097825
   3) (integer) 42
   4) 1) "CONFIG"
      2) "GET"
      3) "*"

3) 1) (integer) 10
   2) (integer) 1324097820
   3) (integer) 11
   4) 1) "CONFIG"
      2) "GET"
      3) "slowlog-log-slower-than"
```

日志的唯一 id 只有在 Redis 服务器重启的时候才会重置，这样可以避免对日志的重复处理(比如你可能会想在每次发现新的慢查询时发邮件通知你)。

查看当前日志的数量

使用命令 SLOWLOG LEN 可以查看当前日志的数量。

请注意这个值和 slower-max-len 的区别，它们一个是当前日志的数量，一个是允许记录的最大日志的数量。

redis> SLOWLOG LEN
(integer) 14

**清空日志**

使用命令 SLOWLOG RESET 可以清空 slow log 。
```
redis> SLOWLOG LEN
(integer) 14

redis> SLOWLOG RESET
OK

redis> SLOWLOG LEN
(integer) 0
```
* SYNC
    * SYNC
    * 用于复制功能(replication)的内部命令。
* TIME
    * TIME
    * 返回当前服务器时间。

## 1.3. 数据结构和对象实现原理
<a href="#menu" style="float:right">目录</a>


### 1.3.1. 简单动态字符串
<a href="#menu" style="float:right">目录</a>

* C语言中的字符串是以空字符'\0'结尾的字符序列
* Redis没有使用C语言的传统的字符串，而是使用SDS(Simple Dynamic String)简单动态字符串,SDS具有'\0'结尾的字符数组
* Redis中的字符串对象都是使用SDS，包括键，键值为字符串的存储对象
* 除了用于字符串，SDS还被用作缓冲区(buffer)，AOF中的AOF缓冲区，和客户端状态中的输入缓冲区
* SDS的定义,支持多种长度5,8,16,32,64。
```c
struct __attribute__ ((__packed__)) sdshdr32 {
    //实际字符串长度，不包含空字符
    uint32_t len; /* used */
    //总空间
    uint32_t alloc; /* excluding the header and null terminator */
    //用于定义类型
    unsigned char flags; /* 3 lsb of type, 5 unused bits */
    //字符数组，字符数组是以'\0'结尾
    char buf[];
};
struct __attribute__ ((__packed__)) sdshdr64 {
    uint64_t len; /* used */
    uint64_t alloc; /* excluding the header and null terminator */
    unsigned char flags; /* 3 lsb of type, 5 unused bits */
    char buf[];
};

```
* 与C字符串相比
    * 获取字符串长度从C字符串的O(n)变为SDS的O(1).提升了性能
    * 杜绝缓冲区溢的可能性
        * C字符串在进行复制时，如果原字符串长度不足，将可能发生溢出，导致不可预知的错误。需要先判断空间是否足够再进行复制。
        * SDS会先检查空间是否足够，不足够先进行扩容
    * SDS空间分配
        * 空间预分配
            * 如果对SDS修改之后，SDS(len)小于1MB，那么程序分配和len属性同样大小的空间。
                * 如果进行修改之后，len变为13个字节，那么将分配13个字节，最终=13+13+1.
            * 如果对SDS修改之后，SDS(len)大于等于1MB，那么程序会分配1MB的未使用空间.
                * 如果进行修改之后，len变为30MB,修改后将为30MB+1MB+1byte
            * 通过预分配，Redis可以减少连续执行字符串增长操作所需的内存分配次数 
        * 惰性空间释放
            * 用于优化SDS的字符串缩短操作。
            * 当SDS的API需要缩短字符串操作时，并不立即进行内存重分配回收不用的空间
    * 二进制安全
        * C字符串必须为可见字符。并且字符串里面不能包含空字符。当保存音频，视频等数据时就会存在问题。
        * 而SDS则没有这种限制，可以保存任何数据
    * 兼容部分C字符串函数(通过重写)
        

### 1.3.2. 链表
<a href="#menu" style="float:right">目录</a>

链表数据结构，可以看到Redis是一个双向链表结构。
```c
typedef struct listNode {
    //前节点
    struct listNode *prev;
    //后节点
    struct listNode *next;
    //节点值， void 型，可以保存任何数据
    void *value;
} listNode;

typedef struct list {
    //头节点
    listNode *head;
    //尾节节点
    listNode *tail;
    //节点值复制函数
    void *(*dup)(void *ptr);
    //节点值释放函数
    void (*free)(void *ptr);
    //节点值对比函数
    int (*match)(void *ptr, void *key);
    //链表长度
    unsigned long len;
} list;


```

* 链表广泛用于Redis各种功能，比如列表，发布订阅，慢查询，监视器等。


### 1.3.3. 字典
<a href="#menu" style="float:right">目录</a>

* 字典，又称符号表(symbol table),关联数组(associative array)或映射(map)，是一种用于保存键值对(key-value)的抽象数据结构。
* Redis底层就是在字典数据结构之上实现的
    * set key value ,保存一个键值对

* 采用链地址法解决hash冲突

* 字典所用的哈希表定义
```c

typedef struct dictht {
    //哈希数组表
    dictEntry **table;
    //哈希表大小
    unsigned long size;
    //哈希表大小掩码，用于计算索引值
    //总是等于size-1
    unsigned long sizemask;
    //该hash表已有节点的数量
    unsigned long used;
} dictht;
```
* 哈希表节点定义
```c
typedef struct dictEntry {
    //键
    void *key;
    //值，可保存浮点，整形，或者其他类型数据
    union {
        void *val;
        uint64_t u64;
        int64_t s64;
        double d;
    } v;
    //指向下一个节点
    struct dictEntry *next;
} dictEntry;
```
* 字典结构定义
```c
typedef struct dict {
    //类型特定函数
    dictType *type;
    //私有数据
    void *privdata;
    //哈希表
    dictht ht[2];

    long rehashidx; /* rehashing not in progress if rehashidx == -1 */
    unsigned long iterators; /* number of iterators currently running */
} dict;

```
#### 1.3.3.1. Rehash

<a href="#menu" style="float:right">目录</a>

* 随着操作的不断进行，哈希表的键值对数量不断增多或者减少，为了让哈希表的负载因子维持在一个合理的范围内，需要对字典表进行重新扩展或者收缩

**Rehash步骤**
* 为字典ht[1]哈希表分配空间，这个哈希表空间的大小取决于要执行的操作，以及ht[0]当前包含的键值对数量(也就是ht[0].used属性的值)
    * 如果执行的是扩展操作，那么ht[1]的大小为第一个大于等于ht[0].used * 2的2的n次幂
    * 如果执行的是收缩操作，那么ht[1]的大小为第一个大于等于ht[0].used的2的2的次幂
* 将保存的ht[0]中的所有键值对rehash到ht[1]上面，
* 将ht[0]包含的所有键值对都迁移到ht[1]之后(ht[0]变为空表)，释放ht[0],将ht[1]设置为ht[0],并在ht[1]创建一个空白哈希表，为下一次rehash作准备。



**哈希表扩展和收缩**

* 当以下任意条件被满足时，程序开始对哈希表进行扩展操作
    * 服务器目前没有执行BGSAVE或者BGREWRITEAOF命令，但是哈希表的负载因子大于等于1
    * 服务器目前正在执行BGSAVE或者BGREWRITEAOF，并且负载因子大于等于5
        * 负载因子=哈希表使用的节点数量/哈希表大小
        * 由于这两个命令采用写时复制来优化子进程的使用效率，所以在子进程执行期间，为了避免哈希表扩展操作，从而提高了负载因子。
* 收缩条件
    * 当负载因子小于0.1时，程序自动开始对哈希表执行收缩操作。


#### 1.3.3.2. 渐进式Hash
<a href="#menu" style="float:right">目录</a>

rehash需要将ht[0]的键值rehash到ht[1],但这个过程并不是一次性完成，而是分多次渐进式完成。比如说几千万个键值对，很难在一瞬间完成rehash,庞大的计算会导致服务器在一段时间内停止服务。

* 渐进式ReHash
    * 为ht[1]分配空间，让字典同时拥有ht[0],ht[1]
    * 在字典中维持一个索引计数器变量rehashidx，并将它的值设置为0,标识rehash工作正是开始
    * 在rehash进行期间，每次对字典执行添加，删除，查找或者更新操作时，程序除了在ht[0]上执行指定的操作以外，还会顺带将ht[0]哈希表在rehashidx索引上的所有键值对rehash到ht[1],当rehash工作完成，程序将rehashidx属性+1;
        * 添加:新添加的数据会被添加到ht[1],不会添加到ht[0]
        * 查找:先找ht[0],找不到找ht[1]

    * 随着操作的不断进行，最终在某个时间点上，ht[0]的所有键值对都会被rehash至ht[1],这时rehashidx设置为1，表示操作完成。





### 1.3.4. 跳跃表
<a href="#menu" style="float:right">目录</a>

* 跳跃表是一种有序的数据结构，通过在每个节点中维持多个指向其他节点的指针，从而达到快速访问节点的目的。
* 跳跃表支持平均O(logN),最坏O(n)复杂度的节点查找，还可以通过顺序性操作来处理节点
* 在大部分情况下，跳跃表的效率可以和平衡数相媲美，跳跃表实现更为简单。
* 跳跃表是有序集合的底层实现之一
    * 如果一个有序集合包含的元素数量比较多使用跳跃表
    * 有序集合中元素的成员是比较长的字符串的时候使用跳跃表

![](https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=536082564,3976559421&fm=173&s=8CB8E412CA11D2035E4824D6020090B2&w=640&h=213&img.JPEG)
* 原链表保存所有的数据，并且根据一定的规则进行高顺序存放，因可以获取范围值
* 原链表之上是不同的层级，每层节点是抽取下一层的节点，节点从左到右也是排序的
* 搜索节点时是从最顶层往下搜索
* 跳跃表可以减少比较的次数，比如搜索8，只需要比较三次即可、如果是链表，需要比较8次。


**总结**
* 跳跃表是有序集合的底层实现之一
* Redis的跳跃表由zskiplist和zskiplistNode两个结构组成，其中zskiplist用于保存跳跃表信息(比如表头节点，表尾节点，长度)，而zskiplistNode则用于跳跃表节点
* 每一个跳跃表层高在1-32之间的随机数
* 在同一个跳跃表中，多个节点可以包含相同的分值，但每个节点的成员对象必须是唯一的。
* 跳跃表中的节点按照分值大小进行排序，当分值相同时，节点按照成员对象的大小进行排序。


### 1.3.5. 整数集合
<a href="#menu" style="float:right">目录</a>


### 1.3.6. 压缩列表
<a href="#menu" style="float:right">目录</a>

* 压缩列表是列表键和哈希键的底层实现之一，当一个列表键只包含**少量的列表项**,并且每个列表项要么就是小整数值，要么就是长度比较短的字符串，Redis就会使用压缩列表来做 列表键的底层实现。

压缩列表是一种数据结构，这种数据结构的功能是将一系列数据与其编码信息存储在一块连续的内存区域，这块内存物理上是连续的，逻辑上被分为多个组成部分，其目的是在一定可控的时间复杂读条件下尽可能的减少不必要的内存开销，从而达到节省内存的效果


Redis对于每种数据结构、无论是列表、哈希表还是有序集合，在决定是否应用压缩列表作为当前数据结构类型的底层编码的时候都会依赖一个开关和一个阈值，开关用来决定我们是否要启用压缩列表编码，阈值总的来说通常指当前结构存储的key数量有没有达到一个数值（条件），或者是value值长度有没有达到一定的长度（条件）。任何策略都有其应用场景，不同场景应用不同策略。为什么当前结构存储的数据条目达到一定数值使用压缩列表就不好？压缩列表的新增、删除的操作平均时间复杂度为O(N)，随着N的增大，时间必然会增加，他不像哈希表可以以O(1)的时间复杂度找到存取位置，然而在一定N内的时间复杂度我们可以容忍。然而压缩列表利用巧妙的编码技术除了存储内容尽可能的减少不必要的内存开销，将数据存储于连续的内存区域，这对于Redis本身来说是有意义的，因为Redis是一款内存数据库软件，想办法尽可能减少内存的开销是Redis设计者一定要考虑的事情。

另外，经过仔细琢磨，我认为使用压缩列表的好处除了节约内存之外，还有减少内存碎片的作用，我把这种行为叫做"合并存储"，也就是将很多小的数据块存储在一个比较大的内存区域，试想想，如果我们将要存储的数据都是很小的条目，我们为每一个数据条目都单独的申请内存，结果是这些条目将有可能分散在内存的每一个角落，最终导致碎片增加，这是一件令人头疼的事情




### 1.3.7. 对象
<a href="#menu" style="float:right">目录</a>

* 前面章节介绍了Redis所有的主要数结构，但是Redis并没有使用这些数据结构来实现键值对数据库。而是基于这些数据结构创建不同的对象。
* 字符串对象，列表对象，哈希对象，集合对象，无序集合对象。
* 每种对象至少使用了前面一种数据结构实现
* Redis在执行命令之前，会根据对象的类型来判断是否可以执行给定的命令
* 使用对象可以针对不同的应用场景，为对象设置多种不同的数据结构实现，从而优化对象在不同场景下的使用效率。
* Redis的垃圾回收是基于引用计数器实现，当程序不再使用某个对象时，这个对象所占用的内存将会被释放掉
* Redsi还通过引用计数法实现了对象共享机制，这一机制在适当的条件下，通过让多个数据库键共享同一个对象来节约内存。
* Redis的对象还带有访问时间记录信息，该记录用于 计算数据库键的空转时长，在服务器启用maxmemory功能的情况下，空转时长较大的键可能会优先被删除。

#### 1.3.7.1. 对象类型和编码
<a href="#menu" style="float:right">目录</a>

**对象结构题定义**

```c
typedef struct redisObject {
    //类型
    unsigned type:4;
    //编码
    unsigned encoding:4;
    unsigned lru:LRU_BITS; /* LRU time (relative to global lru_clock) or
                            * LFU data (least significant 8 bits frequency
                            * and most significant 16 bits access time). */
    //引用计数器
    int refcount;
    //指向底层数据结构的指针
    void *ptr;
} robj;

```

**对象的类型**

|类型常量|对象的名称|TYPE命令输出|
|---|---|---|
|REDIS_STRING|字符串对象|string|
|REDIS_LIST|列表对象|list|
|REDIS_HASH|哈希对象|hash|
|REDIS_SET|集合对象|set|
|REDIS_ZET|有序集合对象|zset|

使用TYPE命令查看键的类型
```
TYPE key
```
**对象的编码**
对象的ptr指针指向对象的底层实现数据结构，而这些数据结构由对象的encoding属性决定。

|编码常量|编码所对应的底层数据结构|
|---|---|
|REDIS_ENCODING_INT|long类型的整数|
|REDIS_ENCODING_EMBSTR|embstr编码的简单动态字符串|
|REDIS_ENCODING_RAW|简单动态字符串|
|REDIS_ENCODING_HT|字典|
|REDIS_ENCODING_LINKEDLIST|双端链表|
|REDIS_ENCODING_ZIPLIST|压缩列表|
|REDIS_ENCODING_INTSET|整数集合|
|REDIS_ENCODING_SKIPLIST|跳跃表和字典|

**不同类型和编码的对象**

|类型	|编码|	对象|
|---|---|---|
|REDIS_STRING|	REDIS_ENCODING_INT|	使用整数值实现的字符串对象。
|REDIS_STRING|	REDIS_ENCODING_EMBSTR	|使用 embstr 编码的简单动态字符串实现的字符串对象。
|REDIS_STRING|	REDIS_ENCODING_RAW|	使用简单动态字符串实现的字符串对象。
|REDIS_LIST	|REDIS_ENCODING_ZIPLIST|	使用压缩列表实现的列表对象。
|REDIS_LIST	|REDIS_ENCODING_LINKEDLIST|	使用双端链表实现的列表对象。
|REDIS_HASH	|REDIS_ENCODING_ZIPLIST	|使用压缩列表实现的哈希对象。
|REDIS_HASH|	REDIS_ENCODING_HT	|使用字典实现的哈希对象。
|REDIS_SET|	REDIS_ENCODING_INTSET	|使用整数集合实现的集合对象。
|REDIS_SET|	REDIS_ENCODING_HT	|使用字典实现的集合对象。
|REDIS_ZSET	|REDIS_ENCODING_ZIPLIST|	使用压缩列表实现的有序集合对象。
|REDIS_ZSET|	REDIS_ENCODING_SKIPLIST|	使用跳跃表和字典实现的有序集合对象。

查看键对应的编码
```
OBJECT ENCODING key

redis> SET msg "hello wrold"
OK

redis> OBJECT ENCODING msg
"embstr"

redis> SET story "long long long long long long ago ..."
OK

redis> OBJECT ENCODING story
"raw"

redis> SADD numbers 1 3 5
(integer) 3

redis> OBJECT ENCODING numbers
"intset"

redis> SADD numbers "seven"
(integer) 1

redis> OBJECT ENCODING numbers
"hashtable"

```

**OBJECT ENCODING 对不同编码的输出**

|对象所使用的底层数据结构	|编码常量	|OBJECT ENCODING 命令输出|
|---|---|---|
|整数	|REDIS_ENCODING_INT	|"int"
|embstr| 编码的简单动态字符串（SDS）|	REDIS_ENCODING_EMBSTR	"embstr"
|简单动态字符串|	REDIS_ENCODING_RAW|	"raw"
|字典	|REDIS_ENCODING_HT|	"hashtable"
|双端链表	|REDIS_ENCODING_LINKEDLIST|	"linkedlist"
|压缩列表	|REDIS_ENCODING_ZIPLIST|	"ziplist"
|整数集合	|REDIS_ENCODING_INTSET|	"intset"
|跳跃表和字典|	REDIS_ENCODING_SKIPLIST	|"skiplist"

通过 encoding 属性来设定对象所使用的编码， 而不是为特定类型的对象关联一种固定的编码， 极大地提升了 Redis 的灵活性和效率， 因为 Redis 可以根据不同的使用场景来为一个对象设置不同的编码， 从而优化对象在某一场景下的效率。

举个例子， 在列表对象包含的元素比较少时， Redis 使用压缩列表作为列表对象的底层实现：

因为压缩列表比双端链表更节约内存， 并且在元素数量较少时， 在内存中以连续块方式保存的压缩列表比起双端链表可以更快被载入到缓存中；
随着列表对象包含的元素越来越多， 使用压缩列表来保存元素的优势逐渐消失时， 对象就会将底层实现从压缩列表转向功能更强、也更适合保存大量元素的双端链表上面；
其他类型的对象也会通过使用多种不同的编码来进行类似的优化。

#### 1.3.7.2. 字符串对象
<a href="#menu" style="float:right">目录</a>


#### 1.3.7.3. 列表对象
<a href="#menu" style="float:right">目录</a>


#### 1.3.7.4. 哈希对象
<a href="#menu" style="float:right">目录</a>


#### 1.3.7.5. 集合对象 
<a href="#menu" style="float:right">目录</a>


#### 1.3.7.6. 有序集合对象
<a href="#menu" style="float:right">目录</a>


#### 1.3.7.7. 类型检查和命令多态
<a href="#menu" style="float:right">目录</a>

#### 1.3.7.8. 内存回收
<a href="#menu" style="float:right">目录</a>
因为 C 语言并不具备自动的内存回收功能， 所以 Redis 在自己的对象系统中构建了一个引用计数（reference counting）技术实现的内存回收机制， 通过这一机制， 程序可以通过跟踪对象的引用计数信息， 在适当的时候自动释放对象并进行内存回收。

每个对象的引用计数信息由 redisObject 结构的 refcount 属性记录：
```c
typedef struct redisObject {

    // ...

    // 引用计数
    int refcount;

    // ...

} robj;
```

对象的引用计数信息会随着对象的使用状态而不断变化：

在创建一个新对象时， 引用计数的值会被初始化为 1 ；
当对象被一个新程序使用时， 它的引用计数值会被增一；
当对象不再被一个程序使用时， 它的引用计数值会被减一；
当对象的引用计数值变为 0 时， 对象所占用的内存会被释放。


**修改对象引用计数的 API**

|函数	|作用|
|---|---|
|incrRefCount|	将对象的引用计数值增一。|
|decrRefCount|	将对象的引用计数值减一， 当对象的引用计数值等于 0 时， 释放对象。|
|resetRefCount|	将对象的引用计数值设置为 0 ， 但并不释放对象， 这个函数通常在需要重新设置对象的引用计数值时使用。|
对象的整个生命周期可以划分为创建对象、操作对象、释放对象三个阶段。

作为例子， 以下代码展示了一个字符串对象从创建到释放的整个过程：
```c
// 创建一个字符串对象 s ，对象的引用计数为 1
robj *s = createStringObject(...)

// 对象 s 执行各种操作 ...

// 将对象 s 的引用计数减一，使得对象的引用计数变为 0
// 导致对象 s 被释放
decrRefCount(s)
```
其他不同类型的对象也会经历类似的过程。

#### 1.3.7.9. 对象共享
<a href="#menu" style="float:right">目录</a>

除了用于实现引用计数内存回收机制之外， 对象的引用计数属性还带有对象共享的作用。

举个例子， 假设键 A 创建了一个包含整数值 100 的字符串对象作为值对象， 如图 8-20 所示。
![](http://redisbook.com/_images/graphviz-e200961ca4084b22cf9eb006dc3668c0027a8061.png)

如果这时键 B 也要创建一个同样保存了整数值 100 的字符串对象作为值对象， 那么服务器有以下两种做法：

为键 B 新创建一个包含整数值 100 的字符串对象；
让键 A 和键 B 共享同一个字符串对象；
以上两种方法很明显是第二种方法更节约内存。

在 Redis 中， 让多个键共享同一个值对象需要执行以下两个步骤：
1. 将数据库键的值指针指向一个现有的值对象；
2. 将被共享的值对象的引用计数增一。

举个例子， 图 8-21 就展示了包含整数值 100 的字符串对象同时被键 A 和键 B 共享之后的样子， 可以看到， 除了对象的引用计数从之前的 1 变成了 2 之外， 其他属性都没有变化。
![](http://redisbook.com/_images/graphviz-b7d3f41024d6c7c34b8d226c6fe1d7a34bbaf44e.png)

共享对象机制对于节约内存非常有帮助， 数据库中保存的相同值对象越多， 对象共享机制就能节约越多的内存。

比如说， 假设数据库中保存了整数值 100 的键不只有键 A 和键 B 两个， 而是有一百个， 那么服务器只需要用一个字符串对象的内存就可以保存原本需要使用一百个字符串对象的内存才能保存的数据。

目前来说， Redis 会在初始化服务器时， 创建一万个字符串对象， 这些对象包含了从 0 到 9999 的所有整数值， 当服务器需要用到值为 0 到 9999 的字符串对象时， 服务器就会使用这些共享对象， 而不是新创建对象。

**注意**:创建共享字符串对象的数量可以通过修改 redis.h/REDIS_SHARED_INTEGERS 常量来修改。

举个例子， 如果我们创建一个值为 100 的键 A ， 并使用 OBJECT REFCOUNT 命令查看键 A 的值对象的引用计数， 我们会发现值对象的引用计数为 2 ：
```
redis> SET A 100
OK

redis> OBJECT REFCOUNT A
(integer) 2
```
引用这个值对象的两个程序分别是持有这个值对象的服务器程序， 以及共享这个值对象的键 A ， 如图 8-22 所示。

![](http://redisbook.com/_images/graphviz-695f7ee11e454777af12ec8ce4dfd67a20d2adf4.png)

如果这时我们再创建一个值为 100 的键 B ， 那么键 B 也会指向包含整数值 100 的共享对象， 使得共享对象的引用计数值变为 3 ：
```
redis> SET B 100
OK

redis> OBJECT REFCOUNT A
(integer) 3

redis> OBJECT REFCOUNT B
(integer) 3
```
图 8-23 展示了共享值对象的三个程序。
![](http://redisbook.com/_images/graphviz-b67a99e375084b9847331a258fb5a98373562122.png)
另外， 这些共享对象不单单只有字符串键可以使用， 那些在数据结构中嵌套了字符串对象的对象（linkedlist 编码的列表对象、 hashtable 编码的哈希对象、 hashtable 编码的集合对象、以及 zset 编码的有序集合对象）都可以使用这些共享对象。

**为什么 Redis 不共享包含字符串的对象？**

当服务器考虑将一个共享对象设置为键的值对象时， 程序需要先检查给定的共享对象和键想创建的目标对象是否完全相同， 只有在共享对象和目标对象完全相同的情况下， 程序才会将共享对象用作键的值对象， 而一个共享对象保存的值越复杂， 验证共享对象和目标对象是否相同所需的复杂度就会越高， 消耗的 CPU 时间也会越多：

* 如果共享对象是保存整数值的字符串对象， 那么验证操作的复杂度为 O(1) ；
* 如果共享对象是保存字符串值的字符串对象， 那么验证操作的复杂度为 O(N) ；
* 如果共享对象是包含了多个值（或者对象的）对象， 比如列表对象或者哈希对象， 那么验证操作的复杂度将会是 O(N^2) 。

因此， 尽管共享更复杂的对象可以节约更多的内存， 但受到 CPU 时间的限制， Redis 只对包含整数值的字符串对象进行共享。


#### 1.3.7.10. 对象空转时长
<a href="#menu" style="float:right">目录</a>

除了前面介绍过的 type 、 encoding 、 ptr 和 refcount 四个属性之外， redisObject 结构包含的最后一个属性为 lru 属性， 该属性记录了对象最后一次被命令程序访问的时间：

```c
typedef struct redisObject {

    // ...

    unsigned lru:22;

    // ...

} robj;
```
OBJECT IDLETIME 命令可以打印出给定键的空转时长， 这一空转时长就是通过将当前时间减去键的值对象的 lru 时间计算得出的：

```
redis> SET msg "hello world"
OK

# 等待一小段时间
redis> OBJECT IDLETIME msg
(integer) 20

# 等待一阵子
redis> OBJECT IDLETIME msg
(integer) 180

# 访问 msg 键的值
redis> GET msg
"hello world"

# 键处于活跃状态，空转时长为 0
redis> OBJECT IDLETIME msg
(integer) 0
```
**注意**
OBJECT IDLETIME 命令的实现是特殊的， 这个命令在访问键的值对象时， 不会修改值对象的 lru 属性。

除了可以被 OBJECT IDLETIME 命令打印出来之外， 键的空转时长还有另外一项作用： 如果服务器打开了 maxmemory 选项， 并且服务器用于回收内存的算法为 volatile-lru 或者 allkeys-lru ， 那么当服务器占用的内存数超过了 maxmemory 选项所设置的上限值时， 空转时长较高的那部分键会优先被服务器释放， 从而回收内存。



## 1.4. 持久化

### 1.4.1. Redis持久化

Redis 提供了多种不同级别的持久化方式：
* RDB 持久化可以在指定的时间间隔内生成数据集的时间点快照（point-in-time snapshot）。
* AOF 持久化记录服务器执行的所有写操作命令，并在服务器启动时，通过重新执行这些命令来还原数据集。 AOF 文件中的命令全部以 Redis 协议的格式来保存，新命令会被追加到文件的末尾。 Redis 还可以在后台对 AOF 文件进行重写（rewrite），使得 AOF 文件的体积不会超出保存数据集状态所需的实际大小。
* Redis 还可以同时使用 AOF 持久化和 RDB 持久化。 在这种情况下， 当 Redis 重启时， 它会优先使用 AOF 文件来还原数据集， 因为 AOF 文件保存的数据集通常比 RDB 文件所保存的数据集更完整。
* 你甚至可以关闭持久化功能，让数据只在服务器运行时存在。


![命令执行流程](https://github.com/lgjlife/Java-Study/blob/master/pic/redis/startup-with-rdbaof.png?raw=true)


### 1.4.2. RDB持久化
<a href="#menu" style="float:right">目录</a>

#### 1.4.2.1. 快照条件

* 快照
    * RDB方式的持久化是通过快照方式完成的。当符合一定条件时会自动将内存中的所有数据生成一份副本并存储在硬盘上，这个过程即为”快照“
* 快照情况
    * 根据配置规则(save)进行快照
    * 用户执行SAVE或者BGSAVE命令
    * 执行FLUSHALL命令
    * 执行复制时

**根据配置规则进行自动快照**

配置文件配置
```
# save 时间窗口(秒) 改动的键的个数
# 900 秒内有一个键改动
save  900 1 
save  300 10
save  60 10000
```
配置多条时，多条的关系是和”或“，只要有一个满足就会执行RDB操作。


**用户执行SAVE或者BGSAVE命令**

* SAVE
    * 同步执行快照操作，直到快照完成。会阻塞客户端的请求，因此可能造成客户端较长的响应时间
* BGSAVE
    * 异步执行，可以通过LASTSAVE查看最近一次成功执行快照的时间(时间戳)
    * 随着Redis占用的内存越来越多，那么创建子进程所消耗的时间也越来越多，因此也会出现系统长时间的停顿，无法响应客户端。
    
**执行FLUSHALL命令**
FLUSHALL会清除数据库中的所有数据，只要自动快照的条件不为空，则会执行一次快照。


**执行复制时**
当设置了主从模式，Redis会在复制初始化时进行自动快照。

#### 1.4.2.2. 快照原理

* Redis默认将快照文件存储在Redis当前进程的工作目录中的dump.rdb文件中。可以通过配置dir和dbfilename两个参数分别指定快照文件的存储路径和文件名

**快照流程**
* Redis使用fork函数复制一份当前进程(父进程)的子进程
* 父进程继续接收并处理客户端发来的命令，而子进程开始将内存中的数据写入硬盘中的临时文件。
    * 采用写时复制策略，fork时刻父子进程共享同一个内存数据，当父进程需要修改某片数据时，会复制该片数据出来进行修改以保证子进程数据不受影响。 
    * 所以RDB保存的是fork时刻的数据
* 当子进程写入完所有数据后会用该临时文件替换原来的RDB文件，快照完成。

----
* RDB文件是经过压缩的二进制文件，可以通过rdbcompression禁用压缩以便节省CPU占用。
* Redis启动后会读取RDB文件，将数据从硬盘载入内存中。通常一个记录1000万个字符串类型键，大小为1GB的快照文件载入需要花费20-30秒。
* 一旦快照过程Redis异常退出，就会丢失最后一次快照之后修改的内容

#### 1.4.2.3. 优点和缺点

**优点**
* RDB 是一个非常紧凑（compact）的文件，它保存了 Redis 在某个时间点上的数据集。 这种文件非常适合用于进行备份： 比如说，你可以在最近的 24 小时内，每小时备份一次 RDB 文件，并且在每个月的每一天，也备份一个 RDB 文件。 这样的话，即使遇上问题，也可以随时将数据集还原到不同的版本。
* RDB 非常适用于灾难恢复（disaster recovery）：它只有一个文件，并且内容都非常紧凑，可以（在加密后）将它传送到别的数据中心，或者亚马逊 S3 中。
* RDB 可以最大化 Redis 的性能：父进程在保存 RDB 文件时唯一要做的就是 fork 出一个子进程，然后这个子进程就会处理接下来的所有保存工作，父进程无须执行任何磁盘 I/O 操作。
* RDB 在恢复大数据集时的速度比 AOF 的恢复速度要快。

**缺点**
* 如果你需要尽量避免在服务器故障时丢失数据，那么 RDB 不适合你。 虽然 Redis 允许你设置不同的保存点（save point）来控制保存 RDB 文件的频率， 但是， 因为RDB 文件需要保存整个数据集的状态， 所以它并不是一个轻松的操作。 因此你可能会至少 5 分钟才保存一次 RDB 文件。 在这种情况下， 一旦发生故障停机， 你就可能会丢失好几分钟的数据。
* 每次保存 RDB 的时候，Redis 都要 fork() 出一个子进程，并由子进程来进行实际的持久化工作。 在数据集比较庞大时， fork() 可能会非常耗时，造成服务器在某某毫秒内停止处理客户端； 如果数据集非常巨大，并且 CPU 时间非常紧张的话，那么这种停止时间甚至可能会长达整整一秒。 虽然 AOF 重写也需要进行 fork() ，但无论 AOF 重写的执行间隔有多长，数据的耐久性都不会有任何损失。

### 1.4.3. AOF持久化(append-only file)

<a href="#menu" style="float:right">目录</a>


#### 1.4.3.1. 基本实现
AOF是将Redis执行的每一条写命令追加到硬盘文件中。

**开启AOF**
```
开启
appendonly yes 

文件配置
appendfilename xxx.aof
```
aof文件位置和rdb文件位置一样，都是dir进行配置


**同步硬盘数据**

* **文件同步**  
    * 在向硬盘写入文件时，至少会发生三件事：
        * file.write()对文件进行写入时，写入的内容首先会被存储到缓冲区，然后操作系统会在将来的某个时候将缓冲区的内容写入到硬盘中。
        * 用户可以自行调用file.flush（）请求操作系统尽快将缓冲区写入硬盘，但何时写入仍然由操作系统控制。
        * 用户还可以命令操作系统将文件同步(sync)到硬盘，同步操作会一直阻塞直到数据被写入硬盘。
        

虽然更改数据库内容时，命令会记录到aof文件中，但是由于计算机缓存的存在，命令不会立即被写入到文件中，而是存在于硬盘缓存中。
默认情况下30秒执行一次同步硬盘操作，以便将数据更新到硬盘中。这种情况下仍然可能会导致数据丢失。

* appendfsync  always|everysec|no
    * always
        * 每次执行写入都会进行同步
    * everysec
        * 每秒执行一次
    * no
        * 不主动进行同步，而是交由操作系统(30秒一次)
    * 考虑到性能和数据可靠性，建议使用everysec

#### 1.4.3.2. 重写AOF文件

AOF 重写和 RDB 创建快照一样，都巧妙地利用了写时复制机制。

AOF方式将会记录每一条命令。导致的问题就是文件膨胀，因为对一个键进行多次操作时，前面的命令就无效了，比如多次set操作。

**自动方式**
可以通过以下参数进行设置，自动进行压缩 优化
```
auto-aof-rewrite-percentage 100
auto-aof-rewrite-min-size 100mb
```
auto-aof-rewrite-percentage: 当aof文件超过上一次重写时的文件大小百分比时会再进行重写操作。如果之前没有重写过，则以启动时的文件大小为准。
auto-aof-rewrite-min-size : 允许重写的最小文件大小，只有超过并满足上面的条件才允许重写。因为小文件时没必要考虑占用空间。

**手动方式**
也可以发送BGREWRITEAOF让Redis服务器执行AOF重写

**AOF重写执行过程**
以下是 AOF 重写的执行步骤：
* Redis 执行 fork() ，现在同时拥有父进程和子进程。
* 子进程开始将新 AOF 文件的内容写入到临时文件。
* 对于所有新执行的写入命令，父进程一边将它们累积到一个内存缓存中，一边将这些改动追加到现有 AOF 文件的末尾： 这样即使在重写的中途发生停机，现有的 AOF 文件也还是安全的。
* 当子进程完成重写工作时，它给父进程发送一个信号，父进程在接收到信号之后，将内存缓存中的所有数据追加到新 AOF 文件的末尾。
* Redis 原子地用新文件替换旧文件，之后所有命令都会直接追加到新 AOF 文件的末尾。

---






#### 1.4.3.3. 优点和缺点
* 使用 AOF 持久化会让 Redis 变得非常耐久（much more durable）：你可以设置不同的 fsync 策略，比如无 fsync ，每秒钟一次 fsync ，或者每次执行写入命令时 fsync 。 AOF 的默认策略为每秒钟 fsync 一次，在这种配置下，Redis 仍然可以保持良好的性能，并且就算发生故障停机，也最多只会丢失一秒钟的数据（ fsync 会在后台线程执行，所以主线程可以继续努力地处理命令请求）。
* AOF 文件是一个只进行追加操作的日志文件（append only log）， 因此对 AOF 文件的写入不需要进行 seek ， 即使日志因为某些原因而包含了未写入完整的命令（比如写入时磁盘已满，写入中途停机，等等）， redis-check-aof 工具也可以轻易地修复这种问题。
* Redis 可以在 AOF 文件体积变得过大时，自动地在后台对 AOF 进行重写： 重写后的新 AOF 文件包含了恢复当前数据集所需的最小命令集合。 整个重写操作是绝对安全的，因为 Redis 在创建新 AOF 文件的过程中，会继续将命令追加到现有的 AOF 文件里面，即使重写过程中发生停机，现有的 AOF 文件也不会丢失。 而一旦新 AOF 文件创建完毕，Redis 就会从旧 AOF 文件切换到新 AOF 文件，并开始对新 AOF 文件进行追加操作。
* AOF 文件有序地保存了对数据库执行的所有写入操作， 这些写入操作以 Redis 协议的格式保存， 因此 AOF 文件的内容非常容易被人读懂， 对文件进行分析（parse）也很轻松。 导出（export） AOF 文件也非常简单： 举个例子， 如果你不小心执行了 FLUSHALL 命令， 但只要 AOF 文件未被重写， 那么只要停止服务器， 移除 AOF 文件末尾的 FLUSHALL 命令， 并重启 Redis ， 就可以将数据集恢复到 FLUSHALL 执行之前的状态。

* 对于相同的数据集来说，AOF 文件的体积通常要大于 RDB 文件的体积。
* 根据所使用的 fsync 策略，AOF 的速度可能会慢于 RDB 。 在一般情况下， 每秒 fsync 的性能依然非常高， 而关闭 fsync 可以让 AOF 的速度和 RDB 一样快， 即使在高负荷之下也是如此。 不过在处理巨大的写入载入时，RDB 可以提供更有保证的最大延迟时间（latency）。
* AOF 在过去曾经发生过这样的 bug ： 因为个别命令的原因，导致 AOF 文件在重新载入时，无法将数据集恢复成保存时的原样。 （举个例子，阻塞命令 BRPOPLPUSH 就曾经引起过这样的 bug 。） 测试套件里为这种情况添加了测试： 它们会自动生成随机的、复杂的数据集， 并通过重新载入这些数据来确保一切正常。 虽然这种 bug 在 AOF 文件中并不常见， 但是对比来说， RDB 几乎是不可能出现这种 bug 的


### 1.4.4. RDB和AOF选择
<a href="#menu" style="float:right">目录</a>

如果你非常关心你的数据， 但仍然可以承受数分钟以内的数据丢失， 那么你可以只使用 RDB 持久化。

有很多用户都只使用 AOF 持久化， 但我们并不推荐这种方式： 因为定时生成 RDB 快照（snapshot）非常便于进行数据库备份， 并且 RDB 恢复数据集的速度也要比 AOF 恢复的速度要快， 除此之外， 使用 RDB 还可以避免之前提到的 AOF 程序的 bug 。


### 1.4.5. 验证快照文件和AOF文件

服务器可能在程序正在对 快照文件 或者AOF 文件进行写入时停机， 如果停机造成了 快照文件、AOF 文件出错（corrupt）， 那么 Redis 在重启时会拒绝载入这个  文件， 从而确保数据的一致性不会被破坏。


验证快照文件
```
redis-check-dump  xxx.rdb
```




当发生这种情况时， 可以用以下方法来修复出错的 AOF 文件：
* 为现有的 AOF 文件创建一个备份。
* 使用 Redis 附带的 redis-check-aof 程序，对原来的 AOF 文件进行修复。
```
$ redis-check-aof --fix xxx.aof
```
* （可选）使用 diff -u 对比修复后的 AOF 文件和原始 AOF 文件的备份，查看两个文件之间的不同之处。
重启 Redis 服务器，等待服务器载入修复后的 AOF 文件，并进行数据恢复。



### 1.4.6. 备份 Redis 数据
磁盘故障， 节点失效， 诸如此类的问题都可能让你的数据消失不见， 不进行备份是非常危险的。

Redis 对于数据备份是非常友好的， 因为你可以在服务器运行的时候对 RDB 文件进行复制： RDB 文件一旦被创建， 就不会进行任何修改。 当服务器要创建一个新的 RDB 文件时， 它先将文件的内容保存在一个临时文件里面， 当临时文件写入完毕时， 程序才使用 rename(2) 原子地用临时文件替换原来的 RDB 文件。

这也就是说， 无论何时， 复制 RDB 文件都是绝对安全的。

以下是我们的建议：
* 创建一个定期任务（cron job）， 每小时将一个 RDB 文件备份到一个文件夹， 并且每天将一个 RDB 文件备份到另一个文件夹。
* 确保快照的备份都带有相应的日期和时间信息， 每次执行定期任务脚本时， 使用 find 命令来删除过期的快照： 比如说， 你可以保留最近 48 小时内的每小时快照， 还可以保留最近一两个月的每日快照。
* 至少每天一次， 将 RDB 备份到你的数据中心之外， 或者至少是备份到你运行 Redis 服务器的物理机器之外。


### 1.4.7. 问题定位和优化

#### 1.4.7.1. fork操作

当Redis做RDB或AOF重写时， 一个必不可少的操作就是执行fork操作创建子进程， 对于大多数操作系统来说fork是个重量级错误。 虽然fork创建的子进程不需要拷贝父进程的物理内存空间， 但是会复制父进程的空间内存页表。 例如对于10GB的Redis进程， 需要复制大约20MB的内存页表， 因此fork操作耗时跟进程总内存量息息相关， 如果使用虚拟化技术， 特别是Xen虚拟
机， fork操作会更耗时。

fork耗时问题定位： 对于高流量的Redis实例OPS可达5万以上， 如果fork操作耗时在秒级别将拖慢Redis几万条命令执行， 对线上应用延迟影响非常明显。 正常情况下fork耗时应该是每GB消耗20毫秒左右。 可以在info stats统计中查latest_fork_usec指标获取最近一次fork操作耗时， 单位微秒。

如何改善fork操作的耗时：
1） 优先使用物理机或者高效支持fork操作的虚拟化技术， 避免使用Xen。
2） 控制Redis实例最大可用内存， fork耗时跟内存量成正比， 线上建议每个Redis实例内存控制在10GB以内。
3） 合理配置Linux内存分配策略， 避免物理内存不足导致fork失败， 具体细节见12.1节“Linux配置优化”。
4） 降低fork操作的频率， 如适度放宽AOF自动触发时机， 避免不必要的全量复制等

#### 1.4.7.2. 子进程开销监控和优化
子进程负责AOF或者RDB文件的重写， 它的运行过程主要涉及CPU、 内存、 硬盘三部分的消耗。

**1.CPU**
* CPU开销分析。 子进程负责把进程内的数据分批写入文件， 这个过程属于CPU密集操作， 通常子进程对单核CPU利用率接近90%.
* CPU消耗优化。 Redis是CPU密集型服务， 不要做绑定单核CPU操作。由于子进程非常消耗CPU， 会和父进程产生单核资源竞争。

不要和其他CPU密集型服务部署在一起， 造成CPU过度竞争。
如果部署多个Redis实例， 尽量保证同一时刻只有一个子进程执行重写工作

**2.内存**
* 内存消耗分析。 子进程通过fork操作产生， 占用内存大小等同于父进程， 理论上需要两倍的内存来完成持久化操作， 但Linux有写时复制机制（copy-on-write） 。 父子进程会共享相同的物理内存页， 当父进程处理写请求时会把要修改的页创建副本， 而子进程在fork操作过程中共享整个父进程内存快照。
* 内存消耗监控。 RDB重写时， Redis日志输出容如下：
```
* Background saving started by pid 7692
* DB saved on disk
* RDB: 5 MB of memory used by copy-on-write
* Background saving terminated with success
```
如果重写过程中存在内存修改操作， 父进程负责创建所修改内存页的副本， 从日志中可以看出这部分内存消耗了5MB， 可以等价认为RDB重写消耗了5MB的内存。

AOF重写时， Redis日志输出容如下：
```
* Background append only file rewriting started by pid 8937
* AOF rewrite child asks to stop sending diffs.
* Parent agreed to stop sending diffs. Finalizing AOF...
* Concatenating 0.00 MB of AOF diff received from parent.
* SYNC append only file rewrite performed
* AOF rewrite: 53 MB of memory used by copy-on-write
* Background AOF rewrite terminated with success
* Residual parent diff successfully flushed to the rewritten AOF (1.49 MB)
* Background AOF rewrite finished successfully
```
* 父进程维护页副本消耗同RDB重写过程类似， 不同之处在于AOF重写需要AOF重写缓冲区， 因此根据以上日志可以预估内存消耗为：53MB+1.49MB， 也就是AOF重写时子进程消耗的内存量。
* 避免在大量写入时做子进程重写操作， 这样将导致父进程维护大量页副本， 造成内存消耗。

**内存消耗优化：**
同CPU优化一样， 如果部署多个Redis实例， 尽量保证同一时刻只有一个子进程在工作

**硬盘:**
* 不要和其他高硬盘负载的服务部署在一起。 如： 存储服务、 消息队列服务等。
* AOF重写时会消耗大量硬盘IO， 可以开启配置no-appendfsync-onrewrite， 默认关闭。 表示在AOF重写期间不做fsync操作。
* 当开启AOF功能的Redis用于高流量写入场景时， 如果使用普通机械磁盘， 写入吞吐一般在100MB/s左右， 这时Redis实例的瓶颈主要在AOF同步硬盘上。
* 对于单机配置多个Redis实例的情况， 可以配置不同实例分盘存储AOF文件， 分摊硬盘写入压力。

## 1.5. 集群
<a href="#menu" style="float:right">目录</a>



### 1.5.1. 复制
<a href="#menu" style="float:right">目录</a>

* Redis 使用异步复制。 从 Redis 2.8 开始， 从服务器会以每秒一次的频率向主服务器报告复制流（replication stream）的处理进度。
* 一个主服务器（MASTER）可以有多个从服务器(SLAVE)。
* 不仅主服务器可以有从服务器， 从服务器也可以有自己的从服务器， 多个从服务器之间可以构成一个图状结构。
* 复制功能不会阻塞主服务器： 即使有一个或多个从服务器正在进行初次同步， 主服务器也可以继续处理命令请求。
* 复制功能也不会阻塞从服务器： 只要在 redis.conf 文件中进行了相应的设置， 即使从服务器正在进行初次同步， 服务器也可以使用旧版本的数据集来处理命令查询。
* 不过， 在从服务器删除旧版本数据集并载入新版本数据集的那段时间内， 连接请求会被阻塞。
* 你还可以配置从服务器， 让它在与主服务器之间的连接断开时， 向客户端发送一个错误。
* 复制功能可以单纯地用于数据冗余（data redundancy）， 也可以通过让多个从服务器处理只读命令请求来提升扩展性（scalability）： 比如说， 繁重的 SORT 命令可以交给附属节点去运行。
* 可以通过复制功能来让主服务器免于执行持久化操作： 只要关闭主服务器的持久化功能， 然后由从服务器去执行持久化操作即可。

#### 1.5.1.1. cap原理
CAP 原理就好比分布式领域的牛顿定律，它是分布式存储的理论基石。自打 CAP 的论文发表之后，分布式存储中间件犹如雨后春笋般一个一个涌现出来。理解这个原理其实很简单，本节我们首先对这个原理进行一些简单的讲解。
* C - Consistent ， 一致性
* A - Availability ， 可用性
* P - Partition tolerance ， 分区容忍性

分布式系统的节点往往都是分布在不同的机器上进行网络隔离开的，这意味着必然会有网络断开的风险，这个网络断开的场景的专业词汇叫着「 网络分区」。
在网络分区发生时，两个分布式节点之间无法进行通信，我们对一个节点进行的修改操作将无法同步到另外一个节点，所以数据的「一致性」将无法满足，因为两个分布式节点的数据不再保持一致。除非我们牺牲「可用性」，也就是暂停分布式节点服务，在网络分区发生时，不再提供修改数据的功能，直到网络状况完全恢复正常再继续对外提供服务。

一句话概括 CAP 原理就是——网络分区发生时，一致性和可用性两难全。

**最终一致**
Redis 的主从数据是异步同步的，所以分布式的 Redis 系统并不满足「 一致性」要求。
当客户端在 Redis 的主节点修改了数据后，立即返回，即使在主从网络断开的情况下，主节点依旧可以正常对外提供修改服务，所以 Redis 满足「 可用性」。
Redis 保证「 最终一致性」，从节点会努力追赶主节点，最终从节点的状态会和主节点的状态将保持一致。如果网络断开了，主从节点的数据将会出现大量不一致，一旦网络恢复，从节点会采用多种策略努力追赶上落后的数据，继续尽力保持和主节点一致。


#### 1.5.1.2. 配置
<a href="#menu" style="float:right">目录</a>

**配置从服务器**
配置一个从服务器非常简单， 只要在配置文件中增加以下的这一行就可以了：
```
slaveof 主数据库IP 主数据库端口
slaveof 192.168.1.1 6379
```
当然， 你需要将代码中的 192.168.1.1 和 6379 替换成你的主服务器的 IP 和端口号。

另外一种方法是调用 SLAVEOF 命令， 输入主服务器的 IP 和端口， 然后同步就会开始：
```
127.0.0.1:6379> SLAVEOF 192.168.1.1 10086
OK
```

**配置只读**

从服务器支持只读模式， 并且该模式为从服务器的默认模式。

只读模式由 redis.conf 文件中的 slave-read-only 选项控制， 也可以通过 CONFIG SET 命令来开启或关闭这个模式。

只读从服务器会拒绝执行任何写命令， 所以不会出现因为操作失误而将数据不小心写入到了从服务器的情况。

即使从服务器是只读的， DEBUG 和 CONFIG 等管理式命令仍然是可以使用的， 所以我们还是不应该将服务器暴露给互联网或者任何不可信网络。 不过， 使用 redis.conf 中的命令改名选项， 我们可以通过禁止执行某些命令来提升只读从服务器的安全性。

你可能会感到好奇， 既然从服务器上的写数据会被重同步数据覆盖， 也可能在从服务器重启时丢失， 那么为什么要让一个从服务器变得可写呢？

原因是， 一些不重要的临时数据， 仍然是可以保存在从服务器上面的。 比如说， 客户端可以在从服务器上保存主服务器的可达性（reachability）信息， 从而实现故障转移（failover）策略

**从服务器相关配置**
如果主服务器通过 requirepass 选项设置了密码， 那么为了让从服务器的同步操作可以顺利进行， 我们也必须为从服务器进行相应的身份验证设置。

对于一个正在运行的服务器， 可以使用客户端输入以下命令：
```
config set masterauth <password>
```
要永久地设置这个密码， 那么可以将它加入到配置文件中：
```
masterauth <password>
```
另外还有几个选项， 它们和主服务器执行部分重同步时所使用的复制流缓冲区有关

**主服务器只在有至少 N 个从服务器的情况下，才执行写操作**

为了保证数据的安全性， 可以通过配置， 让主服务器只在有至少 N 个当前已连接从服务器的情况下， 才执行写命令。

不过， 因为 Redis 使用异步复制， 所以主服务器发送的写数据并不一定会被从服务器接收到， 因此， 数据丢失的可能性仍然是存在的。

以下是这个特性的运作原理：

从服务器以每秒一次的频率 PING 主服务器一次， 并报告复制流的处理情况。
主服务器会记录各个从服务器最后一次向它发送 PING 的时间。
用户可以通过配置， 指定网络延迟的最大值 min-slaves-max-lag ， 以及执行写操作所需的至少从服务器数量 min-slaves-to-write 。
如果至少有 min-slaves-to-write 个从服务器， 并且这些服务器的延迟值都少于 min-slaves-max-lag 秒， 那么主服务器就会执行客户端请求的写操作。

你可以将这个特性看作 CAP 理论中的 C 的条件放宽版本： 尽管不能保证写操作的持久性， 但起码丢失数据的窗口会被严格限制在指定的秒数中。

另一方面， 如果条件达不到 min-slaves-to-write 和 min-slaves-max-lag 所指定的条件， 那么写操作就不会被执行， 主服务器会向请求执行写操作的客户端返回一个错误。

以下是这个特性的两个选项和它们所需的参数：
```
min-slaves-to-write <number of slaves>
min-slaves-max-lag <number of seconds>
```

#### 1.5.1.3. 原理
<a href="#menu" style="float:right">目录</a>
无论是初次连接还是重新连接， 当建立一个从服务器时， 从服务器都将向主服务器发送一个 SYNC 命令。

接到 SYNC 命令的主服务器将开始执行 BGSAVE ， 并在保存操作执行期间， 将所有新执行的写入命令都保存到一个缓冲区里面。

当 BGSAVE 执行完毕后， 主服务器将执行保存操作所得的 .rdb 文件发送给从服务器， 从服务器接收这个 .rdb 文件， 并将文件中的数据载入到内存中。

之后主服务器会以 Redis 命令协议的格式， 将写命令缓冲区中积累的所有内容都发送给从服务器。

你可以通过 telnet 命令来亲自验证这个同步过程： 首先连上一个正在处理命令请求的 Redis 服务器， 然后向它发送 SYNC 命令， 过一阵子， 你将看到 telnet 会话（session）接收到服务器发来的大段数据（.rdb 文件）， 之后还会看到， 所有在服务器执行过的写命令， 都会重新发送到 telnet 会话来。

即使有多个从服务器同时向主服务器发送 SYNC ， 主服务器也只需执行一次 BGSAVE 命令， 就可以处理所有这些从服务器的同步请求。

从服务器可以在主从服务器之间的连接断开时进行自动重连， 在 Redis 2.8 版本之前， 断线之后重连的从服务器总要执行一次完整重同步（full resynchronization）操作， 但是从 Redis 2.8 版本开始， 从服务器可以根据主服务器的情况来选择执行完整重同步还是部分重同步（partial resynchronization）。


#### 1.5.1.4. 数据库崩溃处理
<a href="#menu" style="float:right">目录</a>

* 为了提高性能，主数据库禁止持久化，从数据库持久化

**从数据崩溃**
* 从数据库崩溃，重启之后主数据库自动将数据复制到从数据库

**主数据库崩溃**
* 从数据库使用SLAVEOF NO ONE命令将从数据库提升为主数据库
* 主数据库配置为从数据库，启动之后从新的主数据库中进行数据同步
* 如果原来有多个从数据库，也要将这些从数据库指向新的主数据库

上面有两个问题
* 崩溃之后的操作都是手动操作，操作麻烦。后续使用哨兵模式解决
* 主数据库崩溃之后不要直接重启，由于重启之后，主数据库为空，由于复制，导致所有的从数据库数据也被清空


#### 1.5.1.5. 无硬盘复制
<a href="#menu" style="float:right">目录</a>

使用RDB方式执行复制的问题
* 即使数据库禁用RDB快照(没有save相关的配置)，但是在执行复制时仍然会生成RDB文件，数据库重启时将会从该rdb文件恢复数据，由于rdb文件生成时间的不确定性，因此可能会产生丢失数据
* 复制初始化时生成rdb文件时，如果硬盘性能缓慢，将会对这以过程的性能产生影响。

可以使用无硬盘复制方式
```
repl-diskless-sync yes
```

在进行复制初始化时不会将快照内容存储到硬盘上，而是直接通过网络发送给从数据库，避免硬盘的性能瓶颈


#### 1.5.1.6. 增量复制
<a href="#menu" style="float:right">目录</a>

上述的方式每次进行复制都要进行一次rdb文件生成并且全部传输给从服务器，即使两次之间间隔只是增加很少的数据。

可以使用增量复制，只复制增加的数据。

当从节点正在复制主节点时，如果出现网络闪断和其他异常，从节点会让主节点补发丢失的命令数据，主节点只需要将复制缓冲区的数据发送到从节点就能够保证数据的一致性，相比较全量复制，成本小很多

**实现步骤**
* 从数据库会存储主数据库的运行ID，每个Redis运行实例均会有一个唯一的ID，每当实例重启后，就会自动生成一个新的运行ID
* 主从连接建立后，发送的是PSYNC，格式为 ”PSYNC 主数据库的运行ID 断开前最新的命令偏移量“
    * 主数据库收到该命令后会执行以下判断
        * 判断从数据库传送过来的运行ID是否和自己的相同，确保从数据库之前确实和自己同步过。以免从数据库拿到错误的数据。
        * 判断偏移量是否在积压队列里
    * 如果判断不满足，则进行全量复制
* 在复制同步阶段，主数据库每将一个命令传送给从数据库时，都会把该命令存放到一个积压队列中，并记录下当前积压队列存放的命令的偏移范围。
* 同时，从数据库接收到主数据库的命令，会记录该命令的偏移量

![](http://5b0988e595225.cdn.sohucs.com/images/20190530/7255f8056cc348b39953b8f274fc06a9.jpeg)

---
**积压队列**
* 一个固定长度的循环队列，默认情况下为1MB
* 参数repl-backlog-size进行调整
* 积压队列越大，允许主从断线的时间越长。


1. **psync命令需要3个组件支持**
主从节点各自复制偏移量
主节点复制积压缓冲区
主节点运行 ID 

2. **主从节点各自复制偏移量**
参与复制的主从节点都会维护自身的复制偏移量。
主节点在处理完写入命令后，会把命令的字节长度做累加记录，统计信息在 info replication 中的 masterreploffset 指标中。
从节点每秒钟上报自身的的复制偏移量给主节点，因此主节点也会保存从节点的复制偏移量。
从节点在接收到主节点发送的命令后，也会累加自身的偏移量，统计信息在 info replication 中。
通过对比主从节点的复制偏移量，可以判断主从节点数据是否一致。


3. **主节点复制积压缓冲区**
复制积压缓冲区是一个保存在主节点的一个固定长度的先进先出的队列，默认大小 1MB。
这个队列在 slave 连接是创建。这时主节点响应写命令时，不但会把命令发送给从节点，也会写入复制缓冲区。
他的作用就是用于部分复制和复制命令丢失的数据补救。通过 info replication 可以看到相关信息。

4. **主节点运行ID**
每个 redis 启动的时候，都会生成一个 40 位的运行 ID。
运行 ID 的主要作用是用来识别 Redis 节点。如果使用 ip+port 的方式，那么如果主节点重启修改了 RDB/AOF 数据，从节点再基于偏移量进行复制将是不安全的。所以，当运行 id 变化后，从节点将进行全量复制。也就是说，redis 重启后，默认从节点会进行全量复制。

5. **如果在重启时不改变运行ID呢？**
可以通过 debug reload 命令重新加载 RDB 并保持运行 ID 不变，从而有效的避免不必要的全量复制。
缺点是：debug reload 命令会阻塞当前 Redis 节点主线程，因此对于大数据量的主节点或者无法容忍阻塞的节点，需要谨慎使用。一般通过故障转移机制可以解决这个问题。


#### 1.5.1.7. 心跳机制
主从节点在建立复制后，他们之间维护着长连接并彼此发送心跳命令。

心跳的关键机制如下：
* 主从都有心跳检测机制，各自模拟成对方的客户端进行通信，通过 client list 命令查看复制相关客户端信息，主节点的连接状态为 flags = M，从节点的连接状态是 flags = S。
* 主节点默认每隔 10 秒对从节点发送 ping 命令，可修改配置 repl-ping-slave-period 控制发送频率。
* 从节点在主线程每隔一秒发送 replconf ack{offset} 命令，给主节点上报自身当前的复制偏移量。
* 主节点收到 replconf 信息后，判断从节点超时时间，如果超过 repl-timeout 60 秒，则判断节点下线。


### 1.5.2. 哨兵
<a href="#menu" style="float:right">目录</a>

上面主从复制当出现主数据崩溃时，需要手动去处理，无法实现自动化。
哨兵模式可以解决

#### 1.5.2.1. 什么是哨兵
<a href="#menu" style="float:right">目录</a>

1. 监控主数据库和从数据库是否正常运行。
2. 主数据库出现故障时自动将从数据库转换为主数据库
3. 哨兵是一个独立的进程，一个主从复制结构可以有多个哨兵，提高可用性。哨兵之间也可以互相监控。
![](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1566910534119&di=bdc4f5b7487d94f55840b9cfa2a499d9&imgtype=0&src=http%3A%2F%2Fwww.th7.cn%2Fd%2Ffile%2Fp%2F2015%2F12%2F30%2F2660bccb766407e2aa79b11c47e72afe.jpg)


Redis 的 Sentinel 系统用于管理多个 Redis 服务器（instance）， 该系统执行以下三个任务：

监控（Monitoring）： Sentinel 会不断地检查你的主服务器和从服务器是否运作正常。
提醒（Notification）： 当被监控的某个 Redis 服务器出现问题时， Sentinel 可以通过 API 向管理员或者其他应用程序发送通知。
自动故障迁移（Automatic failover）： 当一个主服务器不能正常工作时， Sentinel 会开始一次自动故障迁移操作， 它会将失效主服务器的其中一个从服务器升级为新的主服务器， 并让失效主服务器的其他从服务器改为复制新的主服务器； 当客户端试图连接失效的主服务器时， 集群也会向客户端返回新主服务器的地址， 使得集群可以使用新主服务器代替失效服务器。
Redis Sentinel 是一个分布式系统， 你可以在一个架构中运行多个 Sentinel 进程（progress）， 这些进程使用流言协议（gossip protocols)来接收关于主服务器是否下线的信息， 并使用投票协议（agreement protocols）来决定是否执行自动故障迁移， 以及选择哪个从服务器作为新的主服务器。

虽然 Redis Sentinel 释出为一个单独的可执行文件 redis-sentinel ， 但实际上它只是一个运行在特殊模式下的 Redis 服务器， 你可以在启动一个普通 Redis 服务器时通过给定 --sentinel 选项来启动 Redis Sentinel 。



#### 1.5.2.2. 基本操作
<a href="#menu" style="float:right">目录</a>

**哨兵配置**

```
sentinel monitor master-name ip_host port quorum
sentinel monitor mymaster 127.0.0.1 6379 1

```
mymaster表示要监控的主数据库的名字，可以自定义，由大小写字母，数字，".-_"组成。
后边为主数据库的地址
最后的quorum表示最低通过的票数 。也就是执行故障恢复操作前至少有几个哨兵节点同意。

配置哨兵时，只需要配置主数据库即可，会自动从主数据库中读取到其所有的从数据库地址等信息。

一个哨兵节点可以监控多个主从系统，只要按照上面的配置多个即可。

**启动**
对于 redis-sentinel 程序， 你可以用以下命令来启动 Sentinel 系统：
```
redis-sentinel /path/to/sentinel.conf
```
对于 redis-server 程序， 你可以用以下命令来启动一个运行在 Sentinel 模式下的 Redis 服务器：
```
redis-server /path/to/sentinel.conf --sentinel
```
两种方法都可以启动一个 Sentinel 实例。

启动 Sentinel 实例必须指定相应的配置文件， 系统会使用配置文件来保存 Sentinel 的当前状态， 并在 Sentinel 重启时通过载入配置文件来进行状态还原。

如果启动 Sentinel 时没有指定相应的配置文件， 或者指定的配置文件不可写（not writable）， 那么 Sentinel 会拒绝启动。


#### 1.5.2.3. 配置 Sentinel
Redis 源码中包含了一个名为 sentinel.conf 的文件， 这个文件是一个带有详细注释的 Sentinel 配置文件示例。

运行一个 Sentinel 所需的最少配置如下所示：

```
sentinel monitor mymaster 127.0.0.1 6379 2
sentinel down-after-milliseconds mymaster 60000
sentinel failover-timeout mymaster 180000
sentinel parallel-syncs mymaster 1

sentinel monitor resque 192.168.1.3 6380 4
sentinel down-after-milliseconds resque 10000
sentinel failover-timeout resque 180000
sentinel parallel-syncs resque 5
```

第一行配置指示 Sentinel 去监视一个名为 mymaster 的主服务器， 这个主服务器的 IP 地址为 127.0.0.1 ， 端口号为 6379 ， 而将这个主服务器判断为失效至少需要 2 个 Sentinel 同意 （只要同意 Sentinel 的数量不达标，自动故障迁移就不会执行）。

不过要注意， 无论你设置要多少个 Sentinel 同意才能判断一个服务器失效， 一个 Sentinel 都需要获得系统中多数（majority） Sentinel 的支持， 才能发起一次自动故障迁移， 并预留一个给定的配置纪元 （configuration Epoch ，一个配置纪元就是一个新主服务器配置的版本号）。

换句话说， 在只有少数（minority） Sentinel 进程正常运作的情况下， Sentinel 是不能执行自动故障迁移的。

其他选项的基本格式如下：
```
sentinel <选项的名字> <主服务器的名字> <选项的值>
```
* 各个选项的功能如下：
    * down-after-milliseconds 选项指定了 Sentinel 认为服务器已经断线所需的毫秒数。
    * 如果服务器在给定的毫秒数之内， 没有返回 Sentinel 发送的 PING 命令的回复， 或者返回一个错误， 那么 Sentinel 将这个服务器标记为主观下线（subjectively down，简称 SDOWN ）。
    * 不过只有一个 Sentinel 将服务器标记为主观下线并不一定会引起服务器的自动故障迁移： 只有在足够数量的 Sentinel 都将一个服务器标记为主观下线之后， 服务器才会被标记为客观下线（objectively down， 简称 ODOWN ）， 这时自动故障迁移才会执行。
    * 将服务器标记为客观下线所需的 Sentinel 数量由对主服务器的配置决定。
    * parallel-syncs 选项指定了在执行故障转移时， 最多可以有多少个从服务器同时对新的主服务器进行同步， 这个数字越小， 完成故障转移所需的时间就越长。
    * 如果从服务器被设置为允许使用过期数据集（参见对 redis.conf 文件中对 slave-serve-stale-data 选项的说明）， 那么你可能不希望所有从服务器都在同一时间向新的主服务器发送同步请求， 因为尽管复制过程的绝大部分步骤都不会阻塞从服务器， 但从服务器在载入主服务器发来的 RDB 文件时， 仍然会造成从服务器在一段时间内不能处理命令请求： 如果全部从服务器一起对新的主服务器进行同步， 那么就可能会造成所有从服务器在短时间内全部不可用的情况出现。
    * 你可以通过将这个值设为 1 来保证每次只有一个从服务器处于不能处理命令请求的状态。

#### 1.5.2.4. 主观下线和客观下线
前面说过， Redis 的 Sentinel 中关于下线（down）有两个不同的概念：
* 主观下线（Subjectively Down， 简称 SDOWN）指的是单个 Sentinel 实例对服务器做出的下线判断。
* 客观下线（Objectively Down， 简称 ODOWN）指的是多个 Sentinel 实例在对同一个服务器做出 SDOWN 判断， 并且通过 SENTINEL is-master-down-by-addr 命令互相交流之后， 得出的服务器下线判断。 （一个 Sentinel 可以通过向另一个 Sentinel 发送 SENTINEL is-master-down-by-addr 命令来询问对方是否认为给定的服务器已下线。）

如果一个服务器没有在 master-down-after-milliseconds 选项所指定的时间内， 对向它发送 PING 命令的 Sentinel 返回一个有效回复（valid reply）， 那么 Sentinel 就会将这个服务器标记为主观下线。

* 服务器对 PING 命令的有效回复可以是以下三种回复的其中一种：
    * 返回 +PONG 。
    * 返回 -LOADING 错误。
    * 返回 -MASTERDOWN 错误。

如果服务器返回除以上三种回复之外的其他回复， 又或者在指定时间内没有回复 PING 命令， 那么 Sentinel 认为服务器返回的回复无效（non-valid）。

注意， 一个服务器必须在 master-down-after-milliseconds 毫秒内， 一直返回无效回复才会被 Sentinel 标记为主观下线。

举个例子， 如果 master-down-after-milliseconds 选项的值为 30000 毫秒（30 秒）， 那么只要服务器能在每 29 秒之内返回至少一次有效回复， 这个服务器就仍然会被认为是处于正常状态的。

从主观下线状态切换到客观下线状态并没有使用严格的法定人数算法（strong quorum algorithm）， 而是使用了流言协议： 如果 Sentinel 在给定的时间范围内， 从其他 Sentinel 那里接收到了足够数量的主服务器下线报告， 那么 Sentinel 就会将主服务器的状态从主观下线改变为客观下线。 如果之后其他 Sentinel 不再报告主服务器已下线， 那么客观下线状态就会被移除。

客观下线条件只适用于主服务器： 对于任何其他类型的 Redis 实例， Sentinel 在将它们判断为下线前不需要进行协商， 所以从服务器或者其他 Sentinel 永远不会达到客观下线条件。

只要一个 Sentinel 发现某个主服务器进入了客观下线状态， 这个 Sentinel 就可能会被其他 Sentinel 推选出， 并对失效的主服务器执行自动故障迁移操作。

#### 1.5.2.5. 每个 Sentinel 都需要定期执行的任务
* 每个 Sentinel 以每秒钟一次的频率向它所知的主服务器、从服务器以及其他 Sentinel 实例发送一个 PING 命令。
* 如果一个实例（instance）距离最后一次有效回复 PING 命令的时间超过 down-after-milliseconds 选项所指定的值， 那么这个实例会被 Sentinel 标记为主观下线。 一个有效回复可以是： +PONG 、 -LOADING 或者 -MASTERDOWN 。
* 如果一个主服务器被标记为主观下线， 那么正在监视这个主服务器的所有 Sentinel 要以每秒一次的频率确认主服务器的确进入了主观下线状态。
* 如果一个主服务器被标记为主观下线， 并且有足够数量的 Sentinel （至少要达到配置文件指定的数量）在指定的时间范围内同意这一判断， 那么这个主服务器被标记为客观下线。
* 在一般情况下， 每个 Sentinel 会以每 10 秒一次的频率向它已知的所有主服务器和从服务器发送 INFO 命令。 当一个主服务器被 Sentinel 标记为客观下线时， Sentinel 向下线主服务器的所有从服务器发送 INFO 命令的频率会从 10 秒一次改为每秒一次。
* 当没有足够数量的 Sentinel 同意主服务器已经下线， 主服务器的客观下线状态就会被移除。 当主服务器重新向 Sentinel 的 PING 命令返回有效回复时， 主服务器的主管下线状态就会被移除。

#### 1.5.2.6. 自动发现 Sentinel 和从服务器
一个 Sentinel 可以与其他多个 Sentinel 进行连接， 各个 Sentinel 之间可以互相检查对方的可用性， 并进行信息交换。

你无须为运行的每个 Sentinel 分别设置其他 Sentinel 的地址， 因为 Sentinel 可以通过发布与订阅功能来自动发现正在监视相同主服务器的其他 Sentinel ， 这一功能是通过向频道 __sentinel__:hello 发送信息来实现的。


与此类似， 你也不必手动列出主服务器属下的所有从服务器， 因为 Sentinel 可以通过询问主服务器来获得所有从服务器的信息。
* 每个 Sentinel 会以每两秒一次的频率， 通过发布与订阅功能， 向被它监视的所有主服务器和从服务器的 __sentinel__:hello 频道发送一条信息， 信息中包含了 Sentinel 的 IP 地址、端口号和运行 ID （runid）。
* 每个 Sentinel 都订阅了被它监视的所有主服务器和从服务器的 __sentinel__:hello 频道， 查找之前未出现过的 sentinel （looking for unknown sentinels）。 当一个 Sentinel 发现一个新的 Sentinel 时， 它会将新的 Sentinel 添加到一个列表中， 这个列表保存了 Sentinel 已知的， 监视同一个主服务器的所有其他 Sentinel 。
* Sentinel 发送的信息中还包括完整的主服务器当前配置（configuration）。 如果一个 Sentinel 包含的主服务器配置比另一个 Sentinel 发送的配置要旧， 那么这个 Sentinel 会立即升级到新配置上。
* 在将一个新 Sentinel 添加到监视主服务器的列表上面之前， Sentinel 会先检查列表中是否已经包含了和要添加的 Sentinel 拥有相同运行 ID 或者相同地址（包括 IP 地址和端口号）的 Sentinel ， 如果是的话， Sentinel 会先移除列表中已有的那些拥有相同运行 ID 或者相同地址的 Sentinel ， 然后再添加新 Sentinel 。

#### 1.5.2.7. Sentinel API
在默认情况下， Sentinel 使用 TCP 端口 26379 （普通 Redis 服务器使用的是 6379 ）。

Sentinel 接受 Redis 协议格式的命令请求， 所以你可以使用 redis-cli 或者任何其他 Redis 客户端来与 Sentinel 进行通讯。

* 有两种方式可以和 Sentinel 进行通讯：
    * 第一种方法是通过直接发送命令来查询被监视 Redis 服务器的当前状态， 以及 Sentinel 所知道的关于其他 Sentinel 的信息， 诸如此类。
    * 另一种方法是使用发布与订阅功能， 通过接收 Sentinel 发送的通知： 当执行故障转移操作， 或者某个被监视的服务器被判断为主观下线或者客观下线时， Sentinel 就会发送相应的信息。

**Sentinel 命令**
以下列出的是 Sentinel 接受的命令：
* PING ：返回 PONG 。
* SENTINEL masters ：列出所有被监视的主服务器，以及这些主服务器的当前状态。
* SENTINEL slaves < master name> ：列出给定主服务器的所有从服务器，以及这些从服务器的当前状态。
* SENTINEL get-master-addr-by-name < master name> ： 返回给定名字的主服务器的 IP 地址和端口号。 如果这个主服务器正在执行故障转移操作， 或者针对这个主服务器的故障转移操作已经完成， 那么这个命令返回新的主服务器的 IP 地址和端口号。
* SENTINEL reset < pattern> ： 重置所有名字和给定模式 pattern 相匹配的主服务器。 pattern 参数是一个 Glob 风格的模式。 重置操作清楚主服务器目前的所有状态， 包括正在执行中的故障转移， 并移除目前已经发现和关联的， 主服务器的所有从服务器和 Sentinel 。
* SENTINEL failover < master name> ： 当主服务器失效时， 在不询问其他 Sentinel 意见的情况下， 强制开始一次自动故障迁移 （不过发起故障转移的 Sentinel 会向其他 Sentinel 发送一个新的配置，其他 Sentinel 会根据这个配置进行相应的更新）。

**发布与订阅信息**
客户端可以将 Sentinel 看作是一个只提供了订阅功能的 Redis 服务器： 你不可以使用 PUBLISH 命令向这个服务器发送信息， 但你可以用 SUBSCRIBE 命令或者 PSUBSCRIBE 命令， 通过订阅给定的频道来获取相应的事件提醒。

一个频道能够接收和这个频道的名字相同的事件。 比如说， 名为 +sdown 的频道就可以接收所有实例进入主观下线（SDOWN）状态的事件。

通过执行 PSUBSCRIBE * 命令可以接收所有事件信息。

以下列出的是客户端可以通过订阅来获得的频道和信息的格式： 第一个英文单词是频道/事件的名字， 其余的是数据的格式。

注意， 当格式中包含 instance details 字样时， 表示频道所返回的信息中包含了以下用于识别目标实例的内容：
```
<instance-type> <name> <ip> <port> @ <master-name> <master-ip> <master-port>
```
@ 字符之后的内容用于指定主服务器， 这些内容是可选的， 它们仅在 @ 字符之前的内容指定的实例不是主服务器时使用。
```
+reset-master <instance details> ：主服务器已被重置。
+slave <instance details> ：一个新的从服务器已经被 Sentinel 识别并关联。
+failover-state-reconf-slaves <instance details> ：故障转移状态切换到了 reconf-slaves 状态。
+failover-detected <instance details> ：另一个 Sentinel 开始了一次故障转移操作，或者一个从服务器转换成了主服务器。
+slave-reconf-sent <instance details> ：领头（leader）的 Sentinel 向实例发送了 SLAVEOF 命令，为实例设置新的主服务器。
+slave-reconf-inprog <instance details> ：实例正在将自己设置为指定主服务器的从服务器，但相应的同步过程仍未完成。
+slave-reconf-done <instance details> ：从服务器已经成功完成对新主服务器的同步。
-dup-sentinel <instance details> ：对给定主服务器进行监视的一个或多个 Sentinel 已经因为重复出现而被移除 —— 当 Sentinel 实例重启的时候，就会出现这种情况。
+sentinel <instance details> ：一个监视给定主服务器的新 Sentinel 已经被识别并添加。
+sdown <instance details> ：给定的实例现在处于主观下线状态。
-sdown <instance details> ：给定的实例已经不再处于主观下线状态。
+odown <instance details> ：给定的实例现在处于客观下线状态。
-odown <instance details> ：给定的实例已经不再处于客观下线状态。
+new-epoch <instance details> ：当前的纪元（epoch）已经被更新。
+try-failover <instance details> ：一个新的故障迁移操作正在执行中，等待被大多数 Sentinel 选中（waiting to be elected by the majority）。
+elected-leader <instance details> ：赢得指定纪元的选举，可以进行故障迁移操作了。
+failover-state-select-slave <instance details> ：故障转移操作现在处于 select-slave 状态 —— Sentinel 正在寻找可以升级为主服务器的从服务器。
no-good-slave <instance details> ：Sentinel 操作未能找到适合进行升级的从服务器。Sentinel 会在一段时间之后再次尝试寻找合适的从服务器来进行升级，又或者直接放弃执行故障转移操作。
selected-slave <instance details> ：Sentinel 顺利找到适合进行升级的从服务器。
failover-state-send-slaveof-noone <instance details> ：Sentinel 正在将指定的从服务器升级为主服务器，等待升级功能完成。
failover-end-for-timeout <instance details> ：故障转移因为超时而中止，不过最终所有从服务器都会开始复制新的主服务器（slaves will eventually be configured to replicate with the new master anyway）。
failover-end <instance details> ：故障转移操作顺利完成。所有从服务器都开始复制新的主服务器了。
+switch-master <master name> <oldip> <oldport> <newip> <newport> ：配置变更，主服务器的 IP 和地址已经改变。 这是绝大多数外部用户都关心的信息。
+tilt ：进入 tilt 模式。
-tilt ：退出 tilt 模式。

```


#### 1.5.2.8. 故障转移
* 一次故障转移操作由以下步骤组成：
    * 发现主服务器已经进入客观下线状态。
    * 对我们的当前纪元进行自增（详情请参考 Raft leader election ）， 并尝试在这个纪元中当选。
    * 如果当选失败， 那么在设定的故障迁移超时时间的两倍之后， 重新尝试当选。 如果当选成功， 那么执行以下步骤。
    * 选出一个从服务器，并将它升级为主服务器。
    * 向被选中的从服务器发送 SLAVEOF NO ONE 命令，让它转变为主服务器。
    * 通过发布与订阅功能， 将更新后的配置传播给所有其他 Sentinel ， 其他 Sentinel 对它们自己的配置进行更新。
    * 向已下线主服务器的从服务器发送 SLAVEOF 命令， 让它们去复制新的主服务器。
    * 当所有从服务器都已经开始复制新的主服务器时， 领头 Sentinel 终止这次故障迁移操作。


每当一个 Redis 实例被重新配置（reconfigured） —— 无论是被设置成主服务器、从服务器、又或者被设置成其他主服务器的从服务器 —— Sentinel 都会向被重新配置的实例发送一个 CONFIG REWRITE 命令， 从而确保这些配置会持久化在硬盘里。

* Sentinel 使用以下规则来选择新的主服务器：
    * 在失效主服务器属下的从服务器当中， 那些被标记为主观下线、已断线、或者最后一次回复 PING 命令的时间大于五秒钟的从服务器都会被淘汰。
    * 在失效主服务器属下的从服务器当中， 那些与失效主服务器连接断开的时长超过 down-after 选项指定的时长十倍的从服务器都会被淘汰。
    * 在经历了以上两轮淘汰之后剩下来的从服务器中， 我们选出复制偏移量（replication offset）最大的那个从服务器作为新的主服务器； 如果复制偏移量不可用， 或者从服务器的复制偏移量相同， 那么带有最小运行 ID 的那个从服务器成为新的主服务器。

**Sentinel 自动故障迁移的一致性特质**
Sentinel 自动故障迁移使用 Raft 算法来选举领头（leader） Sentinel ， 从而确保在一个给定的纪元（epoch）里， 只有一个领头产生。

这表示在同一个纪元中， 不会有两个 Sentinel 同时被选中为领头， 并且各个 Sentinel 在同一个纪元中只会对一个领头进行投票。

更高的配置纪元总是优于较低的纪元， 因此每个 Sentinel 都会主动使用更新的纪元来代替自己的配置。

简单来说， 我们可以将 Sentinel 配置看作是一个带有版本号的状态。 一个状态会以最后写入者胜出（last-write-wins）的方式（也即是，最新的配置总是胜出）传播至所有其他 Sentinel 。

举个例子， 当出现网络分割（network partitions）时， 一个 Sentinel 可能会包含了较旧的配置， 而当这个 Sentinel 接到其他 Sentinel 发来的版本更新的配置时， Sentinel 就会对自己的配置进行更新。

如果要在网络分割出现的情况下仍然保持一致性， 那么应该使用 min-slaves-to-write 选项， 让主服务器在连接的从实例少于给定数量时停止执行写操作， 与此同时， 应该在每个运行 Redis 主服务器或从服务器的机器上运行 Redis Sentinel 进程。

**Sentinel 状态的持久化**
Sentinel 的状态会被持久化在 Sentinel 配置文件里面。

每当 Sentinel 接收到一个新的配置， 或者当领头 Sentinel 为主服务器创建一个新的配置时， 这个配置会与配置纪元一起被保存到磁盘里面。

这意味着停止和重启 Sentinel 进程都是安全的。

**Sentinel 在非故障迁移的情况下对实例进行重新配置**
即使没有自动故障迁移操作在进行， Sentinel 总会尝试将当前的配置设置到被监视的实例上面。 特别是：

根据当前的配置， 如果一个从服务器被宣告为主服务器， 那么它会代替原有的主服务器， 成为新的主服务器， 并且成为原有主服务器的所有从服务器的复制对象。
那些连接了错误主服务器的从服务器会被重新配置， 使得这些从服务器会去复制正确的主服务器。
不过， 在以上这些条件满足之后， Sentinel 在对实例进行重新配置之前仍然会等待一段足够长的时间， 确保可以接收到其他 Sentinel 发来的配置更新， 从而避免自身因为保存了过期的配置而对实例进行了不必要的重新配置。

#### 1.5.2.9. TILT 模式
Redis Sentinel 严重依赖计算机的时间功能： 比如说， 为了判断一个实例是否可用， Sentinel 会记录这个实例最后一次相应 PING 命令的时间， 并将这个时间和当前时间进行对比， 从而知道这个实例有多长时间没有和 Sentinel 进行任何成功通讯。

不过， 一旦计算机的时间功能出现故障， 或者计算机非常忙碌， 又或者进程因为某些原因而被阻塞时， Sentinel 可能也会跟着出现故障。

TILT 模式是一种特殊的保护模式： 当 Sentinel 发现系统有些不对劲时， Sentinel 就会进入 TILT 模式。

因为 Sentinel 的时间中断器默认每秒执行 10 次， 所以我们预期时间中断器的两次执行之间的间隔为 100 毫秒左右。 Sentinel 的做法是， 记录上一次时间中断器执行时的时间， 并将它和这一次时间中断器执行的时间进行对比：

如果两次调用时间之间的差距为负值， 或者非常大（超过 2 秒钟）， 那么 Sentinel 进入 TILT 模式。
如果 Sentinel 已经进入 TILT 模式， 那么 Sentinel 延迟退出 TILT 模式的时间。
当 Sentinel 进入 TILT 模式时， 它仍然会继续监视所有目标， 但是：

它不再执行任何操作，比如故障转移。
当有实例向这个 Sentinel 发送 SENTINEL is-master-down-by-addr 命令时， Sentinel 返回负值： 因为这个 Sentinel 所进行的下线判断已经不再准确。
如果 TILT 可以正常维持 30 秒钟， 那么 Sentinel 退出 TILT 模式。

#### 1.5.2.10. 处理 -BUSY 状态
该功能尚未实现
当 Lua 脚本的运行时间超过指定时限时， Redis 就会返回 -BUSY 错误。

当出现这种情况时， Sentinel 在尝试执行故障转移操作之前， 会先向服务器发送一个 SCRIPT KILL 命令， 如果服务器正在执行的是一个只读脚本的话， 那么这个脚本就会被杀死， 服务器就会回到正常状态。




#### 1.5.2.11. 实现原理
<a href="#menu" style="float:right">目录</a>

哨兵启动后


#### 1.5.2.12. 哨兵的部署
<a href="#menu" style="float:right">目录</a>


### 1.5.3. 集群
<a href="#menu" style="float:right">目录</a>

#### 1.5.3.1. 集群简介

Redis 集群是一个可以在多个 Redis 节点之间进行数据共享的设施（installation）。

Redis 集群不支持那些需要同时处理多个键的 Redis 命令， 因为执行这些命令需要在多个 Redis 节点之间移动数据， 并且在高负载的情况下， 这些命令将降低 Redis 集群的性能， 并导致不可预测的行为。

Redis 集群通过分区（partition）来提供一定程度的可用性（availability）： 即使集群中有一部分节点失效或者无法进行通讯， 集群也可以继续处理命令请求。

Redis 集群提供了以下两个好处：
* 将数据自动切分（split）到多个节点的能力。
* 当集群中的一部分节点失效或者无法进行通讯时， 仍然可以继续处理命令请求的能力。

#### 1.5.3.2. Redis 集群数据共享
Redis 集群使用数据分片（sharding）而非一致性哈希（consistency hashing）来实现： 一个 Redis 集群包含 16384 个哈希槽（hash slot）， 数据库中的每个键都属于这 16384 个哈希槽的其中一个， 集群使用公式 CRC16(key) % 16384 来计算键 key 属于哪个槽， 其中 CRC16(key) 语句用于计算键 key 的 CRC16 校验和 。

集群中的每个节点负责处理一部分哈希槽。 举个例子， 一个集群可以有三个哈希槽， 其中：

节点 A 负责处理 0 号至 5500 号哈希槽。
节点 B 负责处理 5501 号至 11000 号哈希槽。
节点 C 负责处理 11001 号至 16384 号哈希槽。
这种将哈希槽分布到不同节点的做法使得用户可以很容易地向集群中添加或者删除节点。 比如说：

如果用户将新节点 D 添加到集群中， 那么集群只需要将节点 A 、B 、 C 中的某些槽移动到节点 D 就可以了。
与此类似， 如果用户要从集群中移除节点 A ， 那么集群只需要将节点 A 中的所有哈希槽移动到节点 B 和节点 C ， 然后再移除空白（不包含任何哈希槽）的节点 A 就可以了。
因为将一个哈希槽从一个节点移动到另一个节点不会造成节点阻塞， 所以无论是添加新节点还是移除已存在节点， 又或者改变某个节点包含的哈希槽数量， 都不会造成集群下线。

#### 1.5.3.3. Redis 集群中的主从复制
为了使得集群在一部分节点下线或者无法与集群的大多数（majority）节点进行通讯的情况下， 仍然可以正常运作， Redis 集群对节点使用了主从复制功能： 集群中的每个节点都有 1 个至 N 个复制品（replica）， 其中一个复制品为主节点（master）， 而其余的 N-1 个复制品为从节点（slave）。

在之前列举的节点 A 、B 、C 的例子中， 如果节点 B 下线了， 那么集群将无法正常运行， 因为集群找不到节点来处理 5501 号至 11000 号的哈希槽。

另一方面， 假如在创建集群的时候（或者至少在节点 B 下线之前）， 我们为主节点 B 添加了从节点 B1 ， 那么当主节点 B 下线的时候， 集群就会将 B1 设置为新的主节点， 并让它代替下线的主节点 B ， 继续处理 5501 号至 11000 号的哈希槽， 这样集群就不会因为主节点 B 的下线而无法正常运作了。

不过如果节点 B 和 B1 都下线的话， Redis 集群还是会停止运作。

#### 1.5.3.4. Redis 集群的一致性保证（guarantee）
Redis 集群不保证数据的强一致性（strong consistency）： 在特定条件下， Redis 集群可能会丢失已经被执行过的写命令。

使用异步复制（asynchronous replication）是 Redis 集群可能会丢失写命令的其中一个原因。 考虑以下这个写命令的例子：
* 客户端向主节点 B 发送一条写命令。
* 主节点 B 执行写命令，并向客户端返回命令回复。
* 主节点 B 将刚刚执行的写命令复制给它的从节点 B1 、 B2 和 B3 。

如你所见， 主节点对命令的复制工作发生在返回命令回复之后， 因为如果每次处理命令请求都需要等待复制操作完成的话， 那么主节点处理命令请求的速度将极大地降低 —— 我们必须在性能和一致性之间做出权衡。

如果真的有必要的话， Redis 集群可能会在将来提供同步地（synchronou）执行写命令的方法。
Redis 集群另外一种可能会丢失命令的情况是， 集群出现网络分裂（network partition）， 并且一个客户端与至少包括一个主节点在内的少数（minority）实例被孤立。

举个例子， 假设集群包含 A 、 B 、 C 、 A1 、 B1 、 C1 六个节点， 其中 A 、B 、C 为主节点， 而 A1 、B1 、C1 分别为三个主节点的从节点， 另外还有一个客户端 Z1 。

假设集群中发生网络分裂， 那么集群可能会分裂为两方， 大多数（majority）的一方包含节点 A 、C 、A1 、B1 和 C1 ， 而少数（minority）的一方则包含节点 B 和客户端 Z1 。

在网络分裂期间， 主节点 B 仍然会接受 Z1 发送的写命令：
* 如果网络分裂出现的时间很短， 那么集群会继续正常运行；
* 但是， 如果网络分裂出现的时间足够长， 使得大多数一方将从节点 B1 设置为新的主节点， 并使用 B1 来代替原来的主节点 B ， 那么 Z1 发送给主节点 B 的写命令将丢失。


注意， 在网络分裂出现期间， 客户端 Z1 可以向主节点 B 发送写命令的最大时间是有限制的， 这一时间限制称为节点超时时间（node timeout）， 是 Redis 集群的一个重要的配置选项：
* 对于大多数一方来说， 如果一个主节点未能在节点超时时间所设定的时限内重新联系上集群， 那么集群会将这个主节点视为下线， 并使用从节点来代替这个主节点继续工作。
* 对于少数一方， 如果一个主节点未能在节点超时时间所设定的时限内重新联系上集群， 那么它将停止处理写命令， 并向客户端报告错误。



## 1.6. 事务
<a href="#menu" style="float:right">目录</a>

### 1.6.1. 概述

Redis事务是一组命令的集合。事务同命令一样都是Redis的最小执行单位，一个事务的命令要么全部执行成功，要么全部执行失败。

事务的基本操作
```
//开始事务
MULTI
//执行语句
set key1 1 
sey key2 2
//提交事务
exec
```
开始事务之后，发送给Redis的命令都会放入一个事务队列中，当**提交exec命令**时，将会按照提交的顺序执行之前的所有命令。执行时不会插入其他命令，所以这组事务中的所有命令具有原子性。

* DISCARD
    * 取消事务，放弃执行事务块内的所有命令。
    * 如果正在使用 WATCH 命令监视某个(或某些) key，那么取消所有监视，等同于执行命令 UNWATCH 。



### 1.6.2. 错误处理

* 导致命令执行错误的场景
    * 语法错误。
        * 指的是指令不存在或者参数不对
        * 因为是在执行之前进行检查，只要出现语法错误，所有的命令**都不会得到执行**
    * 运行错误。
        * 运行错误指在命令执行时出现的错误
        * 比如字符串类型的命令操作列表类型的键
        * 因为在执行时才会发现错误，因此其他没出现错误的命令**依然能够执行**，只有错误的命令执行失败
* 为什么不支持回滚
    * 以上的两个错误在研发阶段都可以发现并解决，在生产环境并不会出现。并且一般客户端都已经封装好，并不会出现上述错误。
    * 回滚实现复杂，可能会降低吞吐量。


### 1.6.3. WATCH命令介绍
* WATCH key [key ...]
    * 监视一个(或多个) key ，如果在事务执行之前这个(或这些) key 被其他命令所改动，那么事务将被打断。
* UNWATCH
    * 取消 WATCH 命令对所有 key 的监视。

由于在提交事务之前，其他客户端可能会对当前事务的键进行操作，因此可以使用WATCH对某个键进行监视，如果发生修改，事务将不会的到执行。

WATCH必须在事务开始之前执行 。

watch可以实现乐观锁。

### 1.6.4. 优化

上面的 Redis 事务在发送每个指令到事务缓存队列时都要经过一次网络读写，当一个事务内部的指令较多时，需要的网络 IO 时间也会线性增长。所以通常 Redis 的客户端在执行事务时都会结合 pipeline 一起使用，这样可以将多次 IO 操作压缩为单次 IO 操作。比如我们在使用 Python 的 Redis 客户端时执行事务时是要强制使用 pipeline 的。

```java
pipe = redis.pipeline(transaction=true)
pipe.multi()
pipe.incr("books")
pipe.incr("books")
values = pipe.execute()
```

## 1.7. 过期时间
<a href="#menu" style="float:right">目录</a>

### 1.7.1. 常用命令

常用命令的有
```
设置时顺便设置超时时间
set  
//设置超时时间，单位秒
EXPIRE
//设置超时时间，使用时间戳，单位秒
EXPIREAT
//设置超时时间，单位毫秒
PEXPIRE
//设置超时时间，使用时间戳，单位毫秒
PEXPIREAT
//返回剩余时间，单位秒
TTL
//返回剩余时间，单位毫秒
PTTL
```

### 1.7.2. 实现访问频率

* **方式1，实现单位时间的访问限制**

```
if(exist key){
    incr key;
    if(key < limit){
        return true;
    }
    else{
        return false;
    }
}
else {
    incr key;
    expire key time;
    return true;
}

```
由于组合了多个操作，因此需要注意原子性问题，可以使用LUA脚本。

这种方式优点问题，实现的是单位时间内的访问限制,而不是单位时间窗口内的访问限制。

* **方式2，实现单位窗口时间的访问限制**
需要使用列表键来实现

```
//当前列表键的数据量
listLen = key.length;

if(listLen < limit)
{
    //value为当前时间
    lpush key now();
}
else{
    //获取最早的键
    firstTime = LINDEX KEY -1;
    if（now() - firstTime > 1minute ）{
        //最早的值已经超过1分钟，移除该值
        并添加当前值
        return true;
    }
    else{
        
        return false;
    }
}
```

### 1.7.3. 键的过期策略

|淘汰键策略|说明|
|---|---|
|volatile-lru|使用LRU算法删除一个键，只对设置了过期时间的键有效|
|allkeys-lru|使用LRU算法删除一个键，对所有的键有效|
|volatile-lfu|使用LFU算法删除一个键，只对设置了过��时间的键有效|
|allkeys-lfu|使用LFU算法删除一个键，只对设置了过期时间的键有效|
|volatile-random|使用随机算法删除一个键，只对设置了过期时间的键有效|
|allkeys-random|使用随机算法删除一个键，只对设置了过期时间的键有效|
|volatile-ttl|删除过期时间最近的一个键|
|noeviction|不删除，只返回错误|


**三种过期策略**
* 定时删除
    * 含义：在设置key的过期时间的同时，为该key创建一个定时器，让定时器在key的过期时间来临时，对key进行删除
    * 优点：保证内存被尽快释放
    * 缺点：
        * 若过期key很多，删除这些key会占用很多的CPU时间，在CPU时间紧张的情况下，CPU不能把所有的时间用来做要紧的事儿，还需要去花时间删除这些key
        * 定时器的创建耗时，若为每一个设置过期时间的key创建一个定时器（将会有大量的定时器产生），性能影响严重
    * 没人用
* 惰性删除
    * 含义：key过期的时候不删除，每次从数据库获取key的时候去检查是否过期，若过期，则删除，返回null。
    * 优点：删除操作只发生在从数据库取出key的时候发生，而且只删除当前key，所以对CPU时间的占用是比较少的，而且此时的删除是已经到了非做不可的地步（如果此时还不删除的话，我们就会获取到了已经过期的key了）
    * 缺点：若大量的key在超出超时时间后，很久一段时间内，都没有被获取过，那么可能发生内存泄露（无用的垃圾占用了大量的内存）
* 定期删除
    * 含义：每隔一段时间执行一次删除过期key操作
    * 优点：
        * 通过限制删除操作的时长和频率，来减少删除操作对CPU时间的占用–处理"定时删除"的缺点
        * 定期删除过期key–处理"惰性删除"的缺点
    * 缺点
        * 在内存友好方面，不如"定时删除"
        * 在CPU时间友好方面，不如"惰性删除"
    * 难点
        * 合理设置删除操作的执行时长（每次删除执行多长时间）和执行频率（每隔多长时间做一次删除）（这个要根据服务器运行情况来定了）

**Redis采用的过期策略**

* 惰性删除+定期删除
    * 惰性删除流程
        * 在进行get或setnx等操作时，先检查key是否过期，
        * 若过期，删除key，然后执行相应操作；
        * 若没过期，直接执行相应操作
    * 定期删除流程（简单而言，对指定个数个库的每一个库随机删除小于等于指定个数个过期key）
        * 遍历每个数据库（就是redis.conf中配置的"database"数量，默认为16）
        * 检查当前库中的指定个数个key（默认是每个库检查20个key，注意相当于该循环执行20次，循环体时下边的描述）
            * 如果当前库中没有一个key设置了过期时间，直接执行下一个库的遍历
            * 随机获取一个设置了过期时间的key，检查该key是否过期，如果过期，删除key
            * 判断定期删除操作是否已经达到指定时长，若已经达到，直接退出定期删除。
* 注意：
* 对于定期删除，在程序中有一个全局变量current_db来记录下一个将要遍历的库，假设有16个库，我们这一次定期删除遍历了10个，那此时的current_db就是11，下一次定期删除就从第11个库开始遍历，假设current_db等于15了，那么之后遍历就再从0号库开始（此时current_db==0）
* 由于在实际中并没有操作过定期删除的时长和频率，所以这两个值的设置方式作为疑问？

**RDB对过期key的处理**

* 过期key对RDB没有任何影响
* 从内存数据库持久化数据到RDB文件
    * 持久化key之前，会检查是否过期，过期的key不进入RDB文件
* 从RDB文件恢复数据到内存数据库 
    * 数据载入数据库之前，会对key先进行过期检查，如果过期，不导入数据库（主库情况）
    
**AOF对过期key的处理**

* 过期key对AOF没有任何影响
* 从内存数据库持久化数据到AOF文件：
    * 当key过期后，还没有被删除，此时进行执行持久化操作（该key是不会进入aof文件的，因为没有发生修改命令）
    * 当key过期后，在发生删除操作时，程序会向aof文件追加一条del命令（在将来的以aof文件恢复数据的时候该过期的键就会被删掉）
* AOF重写
    * 重写时，会先判断key是否过期，已过期的key不会重写到aof文件

**从库的过期策略**
从库不会进行过期扫描，从库对过期的处理是被动的。主库在 key 到期时，会在 AOF文件里增加一条 del 指令，同步到所有的从库，从库通过执行这条 del 指令来删除过期的key。
因为指令同步是异步进行的，所以主库过期的 key 的 del 指令没有及时同步到从库的话，会出现主从数据的不一致，主库没有的数据在从库里还存在，比如上一节的集群环境分布式锁的算法漏洞就是因为这个同步延迟产生的。


## 1.8. 管道
Redis是一个cs模式的tcp server，使用和http类似的请求响应协议。

一个client可以通过一个socket连接发起多个请求命令。

每个请求命令发出后client通常会阻塞并等待redis服务处理，redis处理完后请求命令后会将结果通过响应报文返回给client。
客户端和服务端通过网络进行连接。这样的连接可能非常快（在一个回路网络中），也可能非常慢（在广域网上经过多个结点才能互通的两个主机）。但是无论是否存在网络延迟，数据包从客户端传输到服务端，以及客户端从服务端获得相应都需要花费一些时间。这段时间就成为往返时延(Round Trip Time)。因此当客户端需要执行一串请求的时候，很容易看出它对性能的影响（例如往同一个队列中加入大量元素，或者往数据库中插入大量的键）。如果RTT时长为250毫秒（在基于广域网的低速连接环境下），即使服务器每秒可以处理10万个请求，但是实际上我们依然只能每秒处理最多4个请求。
如果处于一个回路网络中，RTT时长则相当短（我的主机ping 127.0.0.1时只需要0.044ms），但是如果你执行一大串写入请求的时候，还是会有点长。
幸运的是，redis给我们提供了管道技术

Pipeline虽然好用， 但是每次Pipeline组装的命令个数不能没有节制， 否则一次组装Pipeline数据量过大， 一方面会增加客户端的等待时间， 另一方面会造成一定的网络阻塞， 可以将一次包含大量命令的Pipeline拆分成多次较小的Pipeline来完成




**Redis管道技术**
一个请求/相应服务可以实现为，即使客户端没有读取到旧请求的响应，服务端依旧可以处理新请求。通过这种方式，可以完全无需等待服务端应答地发送多条指令给服务端，并最终一次性读取所有应答。管道技术最显著的优势是提高了redis服务的性能。

**网络通信流程**
1、 客户端进程调用 write 将消息写到操作系统内核为套接字分配的发送缓冲 sendbuffer。
2、 客户端操作系统内核将发送缓冲的内容发送到网卡， 网卡硬件将数据通过「网际路由」送到服务器的网卡。
3、 服务器操作系统内核将网卡的数据放到内核为套接字分配的接收缓冲 recv buffer。
4、 服务器进程调用 read 从接收缓冲中取出消息进行处理。
5、 服务器进程调用 write 将响应消息写到内核为套接字分配的发送缓冲 send buffer。
6、 服务器操作系统内核将发送缓冲的内容发送到网卡， 网卡硬件将数据通过「网际路由」送到客户端的网卡。
7、 客户端操作系统内核将网卡的数据放到内核为套接字分配的接收缓冲 recv buffer。
8、 客户端进程调用 read 从接收缓冲中取出消息返回给上层业务逻辑进行处理。
9、 结束

我们开始以为 write 操作是要等到对方收到消息才会返回，但实际上不是这样的。 write操作只负责将数据写到本地操作系统内核的发送缓冲然后就返回了。剩下的事交给操作系统内核异步将数据送到目标机器。但是如果发送缓冲满了，那么就需要等待缓冲空出空闲空间来，这个就是写操作 IO 操作的真正耗时。
我们开始以为 read 操作是从目标机器拉取数据，但实际上不是这样的。 read 操作只负责将数据从本地操作系统内核的接收缓冲中取出来就了事了。但是如果缓冲是空的，那么就需要等待数据到来，这个就是读操作 IO 操作的真正耗时。
所以对于 value = redis.get(key)这样一个简单的请求来说， write 操作几乎没有耗时，直接写到发送缓冲就返回，而 read 就会比较耗时了，因为它要等待消息经过网络路由到目标机器处理后的响应消息,再回送到当前的内核读缓冲才可以返回。这才是一个网络来回的真正开销。
而对于管道来说，连续的 write 操作根本就没有耗时，之后第一个 read 操作会等待一个网络的来回开销，然后所有的响应消息就都已经回送到内核的读缓冲了，后续的 read 操作直接就可以从缓冲拿到结果，瞬间就返回了


## 1.9. Redis 安全

### 1.9.1. 指令安全
<a href="#menu" style="float:right">目录</a>

Redis 有一些非常危险的指令，这些指令会对 Redis 的稳定以及数据安全造成非常严重的影响。比如 keys 指令会导致 Redis 卡顿， flushdb 和 flushall 会让 Redis 的所有数据全部清空。如何避免人为操作失误导致这些灾难性的后果也是运维人员特别需要注意的风险点之一。
Redis 在配置文件中提供了 rename-command 指令用于将某些危险的指令修改成特别的名称，用来避免人为误操作。比如在配置文件的 security 块增加下面的内容:
```
rename-command keys abckeysabc
```
如果还想执行 keys 方法，那就不能直接敲 keys 命令了，而需要键入 abckeysabc。 如果想完全封杀某条指令，可以将指令 rename 成空串，就无法通过任何字符串指令来执行这条指令了。

```
rename-command flushall ""
```

### 1.9.2. 端口安全
<a href="#menu" style="float:right">目录</a>

Redis 默认会监听 *:6379，如果当前的服务器主机有外网地址， Redis 的服务将会直接暴露在公网上，任何一个初级黑客使用适当的工具对 IP 地址进行端口扫描就可以探测出来。

Redis 的服务地址一旦可以被外网直接访问，内部的数据就彻底丧失了安全性。高级一点的黑客们可以通过 Redis 执行 Lua 脚本拿到服务器权限，恶意的竞争对手们甚至会直接清空你的 Redis 数据库。
```
bind 10.100.20.13
```
所以，运维人员务必在 Redis 的配置文件中指定监听的 IP 地址，避免这样的惨剧发生。更进一步，还可以增加 Redis 的密码访问限制，客户端必须使用 auth 指令传入正确的密码才可以访问 Redis，这样即使地址暴露出去了，普通黑客也无法对 Redis 进行任何指令操作。
```
requirepass yoursecurepasswordhereplease
```
密码控制也会影响到从库复制，从库必须在配置文件里使用 masterauth 指令配置相应的密码才可以进行复制操作。
```
masterauth yoursecurepasswordhereplease
```

### 1.9.3. Lua脚本安全
<a href="#menu" style="float:right">目录</a>

开发者必须禁止 Lua 脚本由用户输入的内容 (UGC) 生成，这可能会被黑客利用以植入恶意的攻击代码来得到 Redis 的主机权限。
同时，我们应该让 Redis 以普通用户的身份启动，这样即使存在恶意代码黑客也无法拿到 root 权限。


### 1.9.4. SSL代理
<a href="#menu" style="float:right">目录</a>

Redis 并不支持 SSL 链接，意味着客户端和服务器之间交互的数据不应该直接暴露在公网上传输，否则会有被窃听的风险。如果必须要用在公网上，可以考虑使用 SSL 代理。
SSL 代理比较常见的有 ssh，不过 Redis 官方推荐使用 spiped 工具，可能是因为spiped 的功能相对比较单一，使用也比较简单，易于理解。下面这张图是使用 spiped 对 ssh通道进行二次加密 (因为 ssh 通道也可能存在 bug)

同样 SSL 代理也可以用在主从复制上，如果 Redis 主从实例需要跨机房复制， spiped也可以派上用场


## 1.10. 发布订阅


### 1.10.1. PubSub 缺点
<a href="#menu" style="float:right">目录</a>

PubSub 的生产者传递过来一个消息， Redis 会直接找到相应的消费者传递过去。如果一个消费者都没有，那么消息直接丢弃。如果开始有三个消费者，一个消费者突然挂掉了，生产者会继续发送消息，另外两个消费者可以持续收到消息。但是挂掉的消费者重新连上的时候，这断连期间生产者发送的消息，对于这个消费者来说就是彻底丢失了。
如果 Redis 停机重启， PubSub 的消息是不会持久化的，毕竟 Redis 宕机就相当于一个消费者都没有，所有的消息直接被丢弃。
正是因为 PubSub 有这些缺点，它几乎找不到合适的应用场景

近期 Redis5.0 新增了 Stream 数据结构，这个功能给 Redis 带来了持久化消息队列。


## 1.11. LUA脚本
<a href="#menu" style="float:right">目录</a>

### 1.11.1. LUA语法

**关键词**
以下列出了 Lua 的保留关键字。保留关键字不能作为常量或变量或其他用户自定义标示符：
||||||
|---|---|---|---|---|
|and|	break|	do|	else|
|elseif	|end|	false	|for|
|function|	if	|in|	local|
|nil|	not|	or|	repeat|
|return|	then|	true|	until|
|while	|		

**数据类型**
1.数值(number):内部以double表示.
2.字符串(string):总是以零结尾,但可以包含任意字符(包括零),因此并不等价于C字符串,而是其超集.
3.布尔(boolean):只有"true"和"false"两个值.
4.函数(function):Lua的关键概念之一.不简单等同于C的函数或函数指针.
5.表(table):异构的Hash表.Lua的关键概念之一.
6.userdata:用户(非脚本用户)定义的C数据结构.脚本用户只能使用它,不能定义.
7.线程(thread):Lua协作线程(coroutine),与一般操作系统的抢占式线程不一样.
8.nil:代表什么也没有,可以与C的NULL类比,但它不是空指针.

**变量**
* Lua的变量分为全局变量和局部变量，全局变量无需生命就可以使用，默认值是nil.
* 删除全局变量的方法是将其值设置为nil,全局变量没有声明和未声明之分，只有nil和非nil的区分。
* redis中不能使用全局变量，只允许局部变量以防止脚本之间相互影响。声明局部变量的方法使用local修饰
    * local name
* 变量名非数字开头，只能包含字母、数字、下划线。区分大小写。变量么不能与LUA的关键字相同。

**注释**
单行注释
两个减号是单行注释:
```
--
```
多行注释
```
--[[
 多行注释
 多行注释
 --]]
```
**赋值**
赋值是改变一个变量的值和改变表域的最基本的方法。
```
a = "hello" .. "world"
```
t.n = t.n + 1 Lua 可以对多个变量同时赋值，变量列表和值列表的各个元素用逗号分开，赋值语句右边的值会依次赋给左边的变量。
```
a, b = 10, 2*x       <-->       a=10; b=2*x
```
遇到赋值语句Lua会先计算右边所有的值然后再执行赋值操作，所以我们可以这样进行交换变量的值：
```
x, y = y, x                     -- swap 'x' for 'y'
a[i], a[j] = a[j], a[i]         -- swap 'a[i]' for 'a[j]'
```
当变量个数和值的个数不一致时，Lua会一直以变量个数为基础采取以下策略：
```
a. 变量个数 > 值的个数             按变量个数补足nil
b. 变量个数 < 值的个数             多余的值会被忽略
```
实例
```
a, b, c = 0, 1
print(a,b,c)             --> 0   1   nil
 
a, b = a+1, b+1, b+2     -- value of b+2 is ignored
print(a,b)               --> 1   2
 
a, b, c = 0
print(a,b,c)             --> 0   nil   nil
```

**操作符**

* **算术运算符**

|操作符|	描述|	实例|
|---|---|---|
|+|	加法|	A + B 输出结果 30
|-	|减法|	A - B 输出结果 -10
|*	|乘法|	A * B 输出结果 200
|/	|除法|	B / A w输出结果 2
|%	|取余|	B % A 输出结果 0
|^	|乘幂|	A^2 输出结果 100
|-	|负号|	-A 输出结果 -10

* **关系运算符**

|操作符	|描述	|实例|
|---|---|---|
|==	|等于，检测两个值是否相等，相等返回 true，否则返回 false	|(A == B) 为 false。
|~=	|不等于，检测两个值是否相等，相等返回 false，否则返回 true|	(A ~= B) 为 true
|` >	|大于，如果左边的值大于右边的值，返回 true，否则返回 false|	(A > B) 为 false。
|<	|小于，如果左边的值大于右边的值，返回 false，否则返回 true|	(A < B) 为 true。
|>=	|大于等于，如果左边的值大于等于右边的值，返回 true，否则返回 false|	(A >= B) 返回 false。
|<=	|小于等于， 如果左边的值小于等于右边的值，返回 true，否则返回 false	|(A <= B) 返回 true。

* **逻辑运算符**

|操作符	|描述|	实例|
|---|---|---|
|and	|逻辑与操作符。 若 A 为 false，则返回 A，否则返回 B。|	(A and B) 为 false。
|or	|逻辑或操作符。 若 A 为 true，则返回 A，否则返回 B。	|(A or B) 为 true。
|not|	逻辑非操作符。与逻辑运算结果相反，如果条件为 true，逻辑非为 false。|	not(A and B) 为 true。
* **其他运算符**

|操作符	|描述	|实例|
|---|---|---|
|..	|连接两个字符串	|a..b ，其中 a 为 "Hello " ， b 为 "World", 输出结果为 "Hello World"。
|#	|一元运算符，返回字符串或表的长度。	|#"Hello" 返回 5
实例

**if语句**

```
if(布尔表达式)
then
   --[ 在布尔表达式为 true 时执行的语句 --]
end
----
if(布尔表达式)
then
   --[ 布尔表达式为 true 时执行该语句块 --]
else
   --[ 布尔表达式为 false 时执行该语句块 --]
end
---
if( 布尔表达式 1)
then
   --[ 布尔表达式 1 为 true 时执行该语句块 --]
   if(布尔表达式 2)
   then
      --[ 布尔表达式 2 为 true 时执行该语句块 --]
   end
end
```
**循环语句**
* while 循环,在条件为 true 时，让程序重复地执行某些语句。执行语句前会先检查条件是否为 true。
* for 循环,	重复执行指定语句，重复次数可在 for 语句中控制。
* repeat...until,重复执行循环，直到 指定的条件为真时为止
* 循环嵌套,可以在循环内嵌套一个或多个循环语句（while do ... end;for ... do ... end;repeat ... until;）

```
while(condition)
do
   statements
end

---
for var=exp1,exp2,exp3 do  
    <执行体>  
end  
---
repeat
   statements
until( condition )
---
for init,max/min value, increment
do
   for init,max/min value, increment
   do
      statements
   end
   statements
end
---
while(condition)
do
   while(condition)
   do
      statements
   end
   statements
end

---
repeat
   statements
   repeat
      statements
   until( condition )
until( condition )
```
**表类型**
table 是 Lua 的一种数据结构用来帮助我们创建不同的数据类型，如：数组、字典等。
Lua table 使用关联型数组，你可以用任意类型的值来作数组的索引，但这个值不能是 nil。
Lua table 是不固定大小的，你可以根据自己需要进行扩容。
Lua也是通过table来解决模块（module）、包（package）和对象（Object）的。 例如string.format表示使用"format"来索引table string。

* **table(表)的构造**
构造器是创建和初始化表的表达式。表是Lua特有的功能强大的东西。最简单的构造函数是{}，用来创建一个空表。可以直接初始化数组:
```
-- 初始化表
mytable = {}

-- 指定值
mytable[1]= "Lua"

-- 移除引用
mytable = nil
-- lua 垃圾回收会释放内存
```

* **Table 操作**
以下列出了 Table 操作常用的方法：

* table.concat (table [, sep [, start [, end]]]):
    * concat是concatenate(连锁, 连接)的缩写. table.concat()函数列出参数中指定table的数组部分从start位置到end位置的所有元素, 元素间以指定的分隔符(sep)隔开。
* table.insert (table, [pos,] value):
    * 在table的数组部分指定位置(pos)插入值为value的一个元素. pos参数可选, 默认为数组部分末尾.
* table.maxn (table)
    * 指定table中所有正数key值中最大的key值. 如果不存在key值为正数的元素, 则返回0。(Lua5.2之后该方法已经不存在了,本文使用了自定义函数实现)
* table.remove (table [, pos])
    * 返回table数组部分位于pos位置的元素. 其后的元素会被前移. pos参数可选, 默认为table长度, 即从最后一个元素删起。
* table.sort (table [, comp])
    * 对给定的table进行升序排序。


**函数**

```
optional_function_scope function function_name( argument1, argument2, argument3..., argumentn)
    function_body
    return result_params_comma_separated
end
```
* **解析：**
    * optional_function_scope: 该参数是可选的制定函数是全局函数还是局部函数，未设置该参数默认为全局函数，如果你需要设置函数为局部函数需要使用关键字 local。
    * function_name: 指定函数名称。
    * argument1, argument2, argument3..., argumentn: 函数参数，多个参数以逗号隔开，函数也可以不带参数。
    * function_body: 函数体，函数中需要执行的代码语句块。
    * result_params_comma_separated: 函数返回值，Lua语言函数可以返回多个值，每个值以逗号隔开。

* **实例**
以下实例定义了函数 max()，参数为 num1, num2，用于比较两值的大小，并返回最大值：

实例
```
--[[ 函数返回两个值的最大值 --]]
function max(num1, num2)

   if (num1 > num2) then
      result = num1;
   else
      result = num2;
   end

   return result; 
end
-- 调用函数
print("两值比较最大值为 ",max(10,4))
print("两值比较最大值为 ",max(5,6))
```

* **多返回值**
```
function maximum (a)
    local mi = 1             -- 最大值索引
    local m = a[mi]          -- 最大值
    for i,val in ipairs(a) do
       if val > m then
           mi = i
           m = val
       end
    end
    return m, mi
end
```
* **可变参数**
Lua 函数可以接受可变数目的参数，和 C 语言类似，在函数参数列表中使用三点 ... 表示函数有可变的参数。
```
function add(...)  
```

**Lua 迭代器**
迭代器（iterator）是一种对象，它能够用来遍历标准模板库容器中的部分或全部元素，每个迭代器对象代表容器中的确定的地址。
在 Lua 中迭代器是一种支持指针类型的结构，它可以遍历集合的每一个元素。

* **泛型 for 迭代器**
泛型 for 在自己内部保存迭代函数，实际上它保存三个值：迭代函数、状态常量、控制变量。
泛型 for 迭代器提供了集合的 key/value 对，语法格式如下：

```
for k, v in pairs(t) do
    print(k, v)
end
```

### 1.11.2. Redis使用LUA
<a href="#menu" style="float:right">目录</a>

#### 1.11.2.1. 常用命令
* **EVAL**
    * EVAL script numkeys key [key ...] arg [arg ...]
    * script 参数是一段 Lua 5.1 脚本程序，它会被运行在 Redis 服务器上下文中，这段脚本不必(也不应该)定义为一个 Lua 函数。
    * numkeys 参数用于指定键名参数的个数。
    * 键名参数 key [key ...] 从 EVAL 的第三个参数开始算起，表示在脚本中所用到的那些 Redis 键(key)，这些键名参数可以在 Lua 中通过全局变量 KEYS 数组，用 1 为基址的形式访问( KEYS[1] ， KEYS[2] ，以此类推)。
    * 在命令的最后，那些不是键名参数的附加参数 arg [arg ...] ，可以在 Lua 中通过全局变量 ARGV 数组访问，访问的形式和 KEYS 变量类似( ARGV[1] 、 ARGV[2] ，诸如此类)。

上面这几段长长的说明可以用一个简单的例子来概括：
```
> eval "return {KEYS[1],KEYS[2],ARGV[1],ARGV[2]}" 2 key1 key2 first second
1) "key1"
2) "key2"
3) "first"
4) "second"
```
在 Lua 脚本中，可以使用两个不同函数来执行 Redis 命令，它们分别是：
```
redis.call()
redis.pcall()
```

* **EVALSHA**
    * EVALSHA sha1 numkeys key [key ...] arg [arg ...]
    * 根据给定的 sha1 校验码，对缓存在服务器中的脚本进行求值。
    * 将脚本缓存到服务器的操作可以通过 SCRIPT LOAD 命令进行。
    * 这个命令的其他地方，比如参数的传入方式，都和 EVAL 命令一样。
```
redis> SCRIPT LOAD "return 'hello moto'"
"232fd51614574cf0867b83d384a5e898cfd24e5a"

redis> EVALSHA "232fd51614574cf0867b83d384a5e898cfd24e5a" 0
"hello moto"
```

* **SCRIPT EXISTS**
    * SCRIPT EXISTS script [script ...]
    * 给定一个或多个脚本的 SHA1 校验和，返回一个包含 0 和 1 的列表，表示校验和所指定的脚本是否已经被保存在缓存当中。
```
redis> SCRIPT LOAD "return 'hello moto'"    # 载入一个脚本
"232fd51614574cf0867b83d384a5e898cfd24e5a"

redis> SCRIPT EXISTS 232fd51614574cf0867b83d384a5e898cfd24e5a
1) (integer) 1

redis> SCRIPT FLUSH     # 清空缓存
OK

redis> SCRIPT EXISTS 232fd51614574cf0867b83d384a5e898cfd24e5a
1) (integer) 0
```

* **SCRIPT FLUSH**
    * SCRIPT FLUSH
    * 清除所有 Lua 脚本缓存。
    
* **SCRIPT KILL**
    * SCRIPT KILL
    * 杀死当前正在运行的 Lua 脚本，当且仅当这个脚本没有执行过任何写操作时，这个命令才生效。
    * 这个命令主要用于终止运行时间过长的脚本，比如一个因为 BUG 而发生无限 loop 的脚本，诸如此类。
    * SCRIPT KILL 执行之后，当前正在运行的脚本会被杀死，执行这个脚本的客户端会从 EVAL 命令的阻塞当中退出，并收到一个错误作为返回值。
    * 另一方面，假如当前正在运行的脚本已经执行过写操作，那么即使执行 SCRIPT KILL ，也无法将它杀死，因为这是违反 Lua 脚本的原子性执行原则的。在这种情况下，唯一可行的办法是使用 SHUTDOWN NOSAVE 命令，通过停止整个 Redis 进程来停止脚本的运行，并防止不完整(half-written)的信息被写入数据库中。

* **SCRIPT LOAD**
    * SCRIPT LOAD script
    * 将脚本 script 添加到脚本缓存中，但并不立即执行这个脚本。
    * EVAL 命令也会将脚本添加到脚本缓存中，但是它会立即对输入的脚本进行求值。
    * 如果给定的脚本已经在缓存里面了，那么不做动作。
    * 在脚本被加入到缓存之后，通过 EVALSHA 命令，可以使用脚本的 SHA1 校验和来调用这个脚本。
    * 脚本可以在缓存中保留无限长的时间，直到执行 SCRIPT FLUSH 为止。
    
**脚本的原子性**
Redis 使用单个 Lua 解释器去运行所有脚本，并且， Redis 也保证脚本会以原子性(atomic)的方式执行：当某个脚本正在运行的时候，不会有其他脚本或 Redis 命令被执行。这和使用 MULTI / EXEC 包围的事务很类似。在其他别的客户端看来，脚本的效果(effect)要么是不可见的(not visible)，要么就是已完成的(already completed)。

另一方面，这也意味着，执行一个运行缓慢的脚本并不是一个好主意。写一个跑得很快很顺溜的脚本并不难，因为脚本的运行开销(overhead)非常少，但是当你不得不使用一些跑得比较慢的脚本时，请小心，因为当这些蜗牛脚本在慢吞吞地运行的时候，其他客户端会因为服务器正忙而无法执行命令。

**错误处理**
前面的命令介绍部分说过， redis.call() 和 redis.pcall() 的唯一区别在于它们对错误处理的不同。

当 redis.call() 在执行命令的过程中发生错误时，脚本会停止执行，并返回一个脚本错误，错误的输出信息会说明错误造成的原因：
```
redis> lpush foo a
(integer) 1

redis> eval "return redis.call('get', 'foo')" 0
(error) ERR Error running script (call to f_282297a0228f48cd3fc6a55de6316f31422f5d17): ERR Operation against a key holding the wrong kind of value
```

和 redis.call() 不同， redis.pcall() 出错时并不引发(raise)错误，而是返回一个带 err 域的 Lua 表(table)，用于表示错误：
```
redis 127.0.0.1:6379> EVAL "return redis.pcall('get', 'foo')" 0
(error) ERR Operation against a key holding the wrong kind of value
```

### 1.11.3. 在脚本中调用Redis命令

```
redis.call('set','foo','bar')
local value=redis.call('get','foo')

```
redis.call()函数返回的值就是Redis命令的执行结果。
redis.call()出现错误时会继续执行，redis.pcall()会记录错误并继续执行

Redis返回值类型和Lua数据类型的转换规则（从脚本中返回则正好相反）：
|Redis返回值类型|Lua数据类型|
|---|---|
|整数|数字类型|
|字符串|字符串类型|
|多行字符串|表类型（数组形式）|
|状态回复|表类型(只有一个OK字段存储信息)|
|错误回复|表类型(只有一个err字段存储信息)|


#### 1.11.3.1. Jedis操作LUA

**普通使用**
```java
// 执行简单的脚本
String helloLua = (String)jedis.eval("return 'Hello Lua'");
System.out.println(helloLua);
// 执行带参数的脚本
jedis.eval("redis.call('set',KEYS[1],ARGV[1])", 1, "lua-key","lua-value");
String luaKey = jedis.get("lua-key");
System.out.println(luaKey);
// 缓存脚本，返回sha1签名标识
String sha1 = (String)jedis.scriptLoad("redis.call('set',KEYS[1],ARGV[1])");
// 通过标识执行脚本
jedis.evalsha(sha1, 1, new String[] {"sha-key","sha-val1"});
// 获取执行脚本后的数据
String value = jedis.get("sha-key");
System.out.println(value);

```

**存储发现复杂对象**

先定义一个可序列的对象Role

```java
public class Role implements Serializable {

    private static final long serialVersionUID = 247558898916003817L;
    private long id;
    private String roleName;
    private String note;
    // get set
}
```
通过Spring提供的DefaultRedisScript对象执行Lua脚本来操作对象
```java
public void testRedisScript() {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    RedisTemplate rt = applicationContext.getBean(RedisTemplate.class);
    // 定义默认脚本封装类
    DefaultRedisScript<Role> rs = new DefaultRedisScript<>();
    // 设置脚本
    rs.setScriptText("redis.call('set',KEYS[1],ARGV[1]) return redis.call('get', KEYS[1])");
    // 定义操作的key列表
    List<String> keyList = new ArrayList<>();
    keyList.add("role1");
    // 需要序列化保存和获取的对象
    Role role = new Role();
    role.setId(1L);
    role.setNote("note1");
    role.setRoleName("roleName1");
    // 获得标识字符串
    String sha1 = rs.getSha1();
    System.out.println(sha1);
    // 设置返回结果类型，如果没有这句，则返回为空
    rs.setResultType(Role.class);
    // 定义序列化器
    JdkSerializationRedisSerializer jdk = new JdkSerializationRedisSerializer();
    // 执行脚本，第一个参数是RedisScript接口对象，第二个是参数序列化器
    // 第三个是结果序列化器，第四个是Redis的key列表，最后是参数列表
    Role obj = (Role)rt.execute(rs, jdk, jdk, keyList, role);
    System.out.println(obj);
}

```


**使用脚本文件**

当Lua脚本存在比较多的逻辑时，显然使用上面的方式明显不合适，这时就有必要单独编写一个Lua文件。

test.lua
```lua
redis.call('set', KEYS[1], ARGV[1])
redis.call('set', KEYS[2], ARGV[2])
local n1 = tonumber(redis.call('get', KEYS[1]))
local n2 = tonumber(redis.call('get', KEYS[2]))
if n1 > n2 then
    return 1
end
if n1 == n2 then 
    return 0
end
if n1 < n2 then
    return 2
end
```
如果我们将sha1这个标识字符串保存起来，那么就可以通过这个标识反复执行Lua脚本文件。只需传递sha1标识和参数即可，无需传递脚本，有利于系统性能的提高。这里是采用的Java Redis操作Redis，还可以使用Spring的RedisScript操作文件，这样就可以序列化直接操作对象。
```java
/**
 * 运行Lua文件脚本
 * @author liu
 */
public class TestLuaFile {
    @SuppressWarnings({ "resource", "rawtypes" })
    @Test
    public void testLuaFile() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        RedisTemplate rt = applicationContext.getBean(RedisTemplate.class);
        // 读入文件流
        String path = this.getClass().getClassLoader().getResource("test.lua").getPath();
        System.out.println(path);
        File file = new File(path);
        byte[] bytes = getFileToByte(file);
        Jedis jedis = (Jedis)rt.getConnectionFactory().getConnection().getNativeConnection();
        // 发送文件二进制给Redis，返回sha1标识
        byte[] sha1 = jedis.scriptLoad(bytes);
        // 使用返回的标识执行，2表示有两个键
        Object obj = jedis.evalsha(sha1, 2, "key1".getBytes(), "key2".getBytes(), "2".getBytes(), "4".getBytes());
        System.out.println(obj);
    }

    /**
     * 把文件转化为二进制数组
     * @param file 文件
     * @return 二进制数组
     */
    public byte[] getFileToByte(File file) {
        byte[] by = new byte[(int)file.length()];
        InputStream is = null;
        try {
            is = new FileInputStream(file);
            ByteArrayOutputStream bytestream = new ByteArrayOutputStream();
            byte[] bb = new byte[2048];
            // 从此输入流中读入bb.length个字节放进bb数组
            int ch = is.read(bb);
            while(ch != -1) {
                // 将bb数组中的内容写入到输出流
                bytestream.write(bb, 0, ch);
                ch = is.read(bb);
            }
            // 将输出流中的内容复制到by数组
            by = bytestream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return by;
    }
}
```
## 1.12. 客户端
<a href="#menu" style="float:right">目录</a>

### 1.12.1. 通信协议
<a href="#menu" style="float:right">目录</a>

Redis的通信协议首先是以行来划分，每行以\r\n(换行符)行结束。每一行都有一个消息头，消息头共分为5种分别如下:
(+) 表示一个正确的状态信息，具体信息是当前行+后面的字符。
(-) 表示一个错误信息，具体信息是当前行－后面的字符。
(*) 表示消息体总共有多少行，不包括当前行,*后面是具体的行数。
()表示下一行数据长度，不包括换行符长度\r\n,后面则是对应的长度的数据。
(:) 表示返回一个数值，：后面是相应的数字节符。
举个例子：

```
*3  #消息一共有三行
$3 #第一行有长度为3
set #第一行的消息
$4  #第二行长度为4 
demo #第二行的消息
$6 #第三行长度为6
123456 #第三行的消息
+OK #操作成功
```

### 1.12.2. 客户端管理
<a href="#menu" style="float:right">目录</a>

#### 1.12.2.1. Redis 的info 命令
<a href="#menu" style="float:right">目录</a>

* server : 一般 Redis 服务器信息，包含以下域：
    * redis_version : Redis 服务器版本
    * redis_git_sha1 : Git SHA1
    * redis_git_dirty : Git dirty flag
    * os : Redis 服务器的宿主操作系统
    * arch_bits : 架构（32 或 64 位）
    * multiplexing_api : Redis 所使用的事件处理机制
    * gcc_version : 编译 Redis 时所使用的 GCC 版本
    * process_id : 服务器进程的 PID
    * run_id : Redis 服务器的随机标识符（用于 Sentinel 和集群）
    * tcp_port : TCP/IP 监听端口
    * uptime_in_seconds : 自 Redis 服务器启动以来，经过的秒数
    * uptime_in_days : 自 Redis 服务器启动以来，经过的天数
    * lru_clock : 以分钟为单位进行自增的时钟，用于 LRU 管理

* clients : 已连接客户端信息，包含以下域：
    * connected_clients : 已连接客户端的数量（不包括通过从属服务器连接的客户端）
    * client_longest_output_list : 当前连接的客户端当中，最长的输出列表
    * client_longest_input_buf : 当前连接的客户端当中，最大输入缓存
    * blocked_clients : 正在等待阻塞命令（BLPOP、BRPOP、BRPOPLPUSH）的客户端的数量

* memory : 内存信息，包含以下域：
    * used_memory : 由 Redis 分配器分配的内存总量，以字节（byte）为单位
    * used_memory_human : 以人类可读的格式返回 Redis 分配的内存总量
    * used_memory_rss : 从操作系统的角度，返回 Redis 已分配的内存总量（俗称常驻集大小）。这个值和 top 、 ps 等命令的输出一致。
    * used_memory_peak : Redis 的内存消耗峰值（以字节为单位）
    * used_memory_peak_human : 以人类可读的格式返回 Redis 的内存消耗峰值
    * used_memory_lua : Lua 引擎所使用的内存大小（以字节为单位）
    * mem_fragmentation_ratio : used_memory_rss 和 used_memory 之间的比率
    * mem_allocator : 在编译时指定的， Redis 所使用的内存分配器。可以是 libc 、 jemalloc 或者 tcmalloc 。
在理想情况下， used_memory_rss 的值应该只比 used_memory 稍微高一点儿。
当 rss > used ，且两者的值相差较大时，表示存在（内部或外部的）内存碎片。
内存碎片的比率可以通过 mem_fragmentation_ratio 的值看出。
当 used > rss 时，表示 Redis 的部分内存被操作系统换出到交换空间了，在这种情况下，操作可能会产生明显的延迟。
当 Redis 释放内存时，分配器可能会，也可能不会，将内存返还给操作系统。
如果 Redis 释放了内存，却没有将内存返还给操作系统，那么 used_memory 的值可能和操作系统显示的 Redis 内存占用并不一致。
查看 used_memory_peak 的值可以验证这种情况是否发生。

* persistence : RDB 和 AOF 的相关信息
* stats : 一般统计信息
* replication : 主/从复制信息
* cpu : CPU 计算量统计信息
* commandstats : Redis 命令统计信息
* cluster : Redis 集群信息
* keyspace : 数据库相关的统计信息

#### 1.12.2.2. 客户端API
<a href="#menu" style="float:right">目录</a>

**client list**
* 127.0.0.1:6379> client list
    * 列出与服务端相连的客户端
```
127.0.0.1:8207> client list
id=4 addr=172.18.0.1:8202 fd=16 name= age=41 idle=10 flags=M db=0 sub=0 psub=0 multi=-1 qbuf=0 qbuf-free=0 obl=0 oll=0 omem=0 events=r cmd=ping
id=5 addr=172.18.0.1:35146 fd=20 name= age=16 idle=0 flags=N db=0 sub=0 psub=0 multi=-1 qbuf=26 qbuf-free=32742 obl=0 oll=0 omem=0 events=r cmd=client
```
* 标识： id、 addr、 fd、 name
    * 这四个属性属于客户端的标识：
    * id： 客户端连接的唯一标识， 这个id是随着Redis的连接自增的， 重启Redis后会重置为0。
    * addr： 客户端连接的ip和端口。
    * fd： socket的文件描述符， 与lsof命令结果中的fd是同一个， 如果fd=-1代表当前客户端不是外部客户端， 而是Redis内部的伪装客户端。
    * name： 客户端的名字， 后面的client setName和client getName两个命令会对其进行说明。
* 输入缓冲区： qbuf、 qbuf-free
    * Redis为每个客户端分配了输入缓冲区， 它的作用是将客户端发送的命令临时保存， 同时Redis从会输入缓冲区拉取命令并执行， 输入缓冲区为客户端发送命令到Redis执行命令提供了缓冲功能.client list中qbuf和qbuf-free分别代表这个缓冲区的总容量和剩余容量，Redis没有提供相应的配置来规定每个缓冲区的大小， 输入缓冲区会根据输入内容大小的不同动态调整， 只是要求每个客户端缓冲区的大小不能超过1G， 超过后客户端将被关闭
    * 输入缓冲区不受maxmemory控制， 假设一个Redis实例设置了maxmemory为4G， 已经存储了2G数据， 但是如果此时输入缓冲区使用了3G， 已经超过maxmemory限制， 可能会产生数据丢失、 键值淘汰、 OOM等情况
    * 输入缓冲区过大主要是因为Redis的处理速度跟不上输入缓冲区的输入速度， 并且每次进入输入缓冲区的命令包含了大量bigkey， 从而造成了输入缓冲区过大的情况。 还有一种情况就是Redis发生了阻塞， 短期内不能处理命令， 造成客户端输入的命令积压在了输入缓冲区，造成了输入缓冲区过大
    * 如何快速发现和监控
        * 通过定期执行client list命令， 收集qbuf和qbuf-free找到异常的连接记录并分析， 最终找到可能出问题的客户端。
            * 优点：精准分析每个客户端来定位问题
            * 缺点:执行速度较慢，尤其是存在大量连接的情况，频繁执行会存在阻塞redis的问题
        * 通过info命令的info clients模块， 找到最大的输入缓冲区，
            * 优点: 执行速度较快，分析过程比较简单
            * 缺点: 不能精确定位到客户端，不能显示所有输入缓冲区的总量 ，只能显示最大值
    * 输入缓冲区问题出现概率比较低， 但是也要做好防范， 在开发中要减少bigkey、 减少Redis阻塞、 合理的监控报警。
```
127.0.0.1:8207> info clients
# Clients
connected_clients:2
client_recent_max_input_buffer:2
client_recent_max_output_buffer:0
blocked_clients:0

```
* 输出缓冲区： obl、 oll、 omem
    * Redis为每个客户端分配了输出缓冲区， 它的作用是保存命令执行的结果返回给客户端， 为Redis和客户端交互返回结果提供缓冲
    * 与输入缓冲区不同的是， 输出缓冲区的容量可以通过参数client-outputbuffer-limit来进行设置， 并且输出缓冲区做得更加细致， 按照客户端的不同分为三种： 普通客户端、 发布订阅客户端、 slave客户端，
    * client-output-buffer-limit < class> < hard limit> < soft limit> < soft seconds>
        * < class>： 客户端类型， 分为三种。 a） normal： 普通客户端； b）slave： slave客户端， 用于复制； c） pubsub： 发布订阅客户端。
        * < hard limit>： 如果客户端使用的输出缓冲区大于< hard limit>， 客户端会被立即关闭。
        * < soft limit>和< soft seconds>： 如果客户端使用的输出缓冲区超过了< softlimit>并且持续了< soft limit>秒， 客户端会被立即关闭
    * Redis的默认配置是：
        * client-output-buffer-limit normal 0 0 0
        * client-output-buffer-limit slave 256mb 64mb 60
        * client-output-buffer-limit pubsub 32mb 8mb 60
    * 和输入缓冲区相同的是， 输出缓冲区也不会受到maxmemory的限制， 如果使用不当同样会造成maxmemory用满产生的数据丢失、 键值淘汰、 OOM等情况
    * 实际上输出缓冲区由两部分组成： 固定缓冲区（16KB） 和动态缓冲区， 其中固定缓冲区返回比较小的执行结果， 而动态缓冲区返回比较大的结果， 例如大的字符串、 hgetall、 smembers命令的结果等
    * 固定缓冲区使用的是字节数组， 动态缓冲区使用的是列表。 当固定缓冲区存满后会将Redis新的返回结果存放在动态缓冲区的队列中， 队列中的每个对象就是每个返回结果
    * 监控输出缓冲区的方法依然有两种
        * 通过定期执行client list命令
        * 通过info命令的info clients模块， 找到输出缓冲区列表最大对象数
    * 输出缓冲区预防
        * 进行上述监控， 设置阀值， 超过阀值及时处理。
        * 限制普通客户端输出缓冲区的， 把错误扼杀在摇篮中
        * 适当增大slave的输出缓冲区的， 如果master节点写入较大， slave客户端的输出缓冲区可能会比较大， 一旦slave客户端连接因为输出缓冲区溢出被kill， 会造成复制重连。
        * 限制容易让输出缓冲区增大的命令， 例如， 高并发下的monitor命令就是一个危险的命令。
        * 及时监控内存， 一旦发现内存抖动频繁， 可能就是输出缓冲区过大
```java
typedef struct redisClient {
    // 动态缓冲区列表
    list *reply;
    // 动态缓冲区列表的长度(对象个数)
    unsigned long reply_bytes;
    // 固定缓冲区已经使用的字节数
    int bufpos;
    // 字节数组作为固定缓冲区
    char buf[REDIS_REPLY_CHUNK_BYTES];
} redisClient;
```

命令返回多行字符串，这些字符串按以下形式被格式化：

* client list
    * addr ： 客户端的地址和端口
    * fd ： 套接字所使用的文件描述符
        * r : 客户端套接字（在事件 loop 中）是可读的（readable）
        * w : 客户端套接字（在事件 loop 中）是可写的（writeable）
    * age ： 以秒计算的已连接时长
    * idle ： 以秒计算的空闲时长
    * flags ： 客户端 flag
        * O ： 客户端是 MONITOR 模式下的附属节点（slave）
        * S ： 客户端是一般模式下（normal）的附属节点
        * M ： 客户端是主节点（master）
        * x ： 客户端正在执行事务
        * b ： 客户端正在等待阻塞事件
        * i ： 客户端正在等待 VM I/O 操作（已废弃）
        * d ： 一个受监视（watched）的键已被修改， EXEC 命令将失败
        * c : 在将回复完整地写出之后，关闭链接
        * u : 客户端未被阻塞（unblocked）
        * A : 尽可能快地关闭连接
        * N : 未设置任何 flag
    * db ： 该客户端正在使用的数据库 ID
    * sub ： 已订阅频道的数量
    * psub ： 已订阅模式的数量
    * multi ： 在事务中被执行的命令数量
    * qbuf ： 查询缓冲区的长度（字节为单位， 0 表示没有分配查询缓冲区）
    * qbuf-free ： 查询缓冲区剩余空间的长度（字节为单位， 0 表示没有剩余空间）
    * obl ： 输出缓冲区的长度（字节为单位， 0 表示没有分配输出缓冲区）
    * oll ： 输出列表包含的对象数量（当输出缓冲区没有剩余空间时，命令回复会以字符串对象的形式被入队到这个队列里）
    * omem ： 输出缓冲区和输出列表占用的内存总量
    * events ： 文件描述符事件
    * cmd ： 最近一次执行的命令

#### 1.12.2.3. 客户端相关配置

#### 1.12.2.4. 客户端统计片段

### 1.12.3. 客户端常见异常
<a href="#menu" style="float:right">目录</a>

### 1.12.4. 客户端案例分析
<a href="#menu" style="float:right">目录</a>


#### 1.12.4.1. Redis 内存陡增

**服务端现象:**主节点内存陡增，而从节点并没有变化
**客户端现象:**客户端发生Redis OOM异常
**分析原因：**
* 确实有大量的写入，但是主从复制出现问题，可以通过dbsize查看主从节点的键个数
* 通过 info client 和 client list 查看缓存不正常的连接

**处理**
* 使用client kill杀掉这个客户端

#### 1.12.4.2. 客户端周期性超时

**服务端现象:**服务端并没有明显的异常，只是有一些慢查询操作
**分析:**
* 网络原因:客户端和服务端之间的网络出现周期性的问题，经过观察网络是正常的
* 存在比较耗时的命令，导致其他命令没能得到即时执行，需要设置慢查询功能查看


## 1.13. 线程模型
<a href="#menu" style="float:right">目录</a>


### 1.13.1. 相关概念

**Redis 是个单线程程序！ 这点必须铭记。**
也许你会怀疑高并发的 Redis 中间件怎么可能是单线程。很抱歉，它就是单线程，你的怀疑暴露了你基础知识的不足。莫要瞧不起单线程，除了 Redis 之外， Node.js 也是单线程， Nginx 也是单线程，但是它们都是服务器高性能的典范。

但是进行复制持久化操作时，会使用fork()创建进程进行异步处理；只有处理客户端读写数据时是单线程。

**Redis 单线程为什么还能这么快？**
因为它所有的数据都在内存中，所有的运算都是内存级别的运算。正因为 Redis 是单线程，所以要小心使用 Redis 指令，对于那些时间复杂度为 O(n) 级别的指令，一定要谨慎使用，一不小心就可能会导致 Redis 卡顿。

**Redis 单线程如何处理那么多的并发客户端连接？**
Redis使用的是IO多路复用器，可以使用单线程处理多个客户端连接管理。


**指令队列**
Redis 会将每个客户端套接字都关联一个指令队列。客户端的指令通过队列来排队进行顺序处理，先到先服务。

**响应队列**
Redis 同样也会为每个客户端套接字关联一个响应队列。 Redis 服务器通过响应队列来将指令的返回结果回复给客户端。 如果队列为空，那么意味着连接暂时处于空闲状态，不需要去获取写事件，也就是可以将当前的客户端描述符从 write_fds 里面移出来。等到队列有数据了，再将描述符放进去。避免 select 系统调用立即返回写事件，结果发现没什么数据可以
写。出这种情况的线程会飙高 CPU。

**定时任务**

服务器处理要响应 IO 事件外，还要处理其它事情。比如定时任务就是非常重要的一件事。如果线程阻塞在 select 系统调用上，定时任务将无法得到准时调度。那 Redis 是如何解决这个问题的呢？

Redis 的定时任务会记录在一个称为最小堆的数据结构中。这个堆中，最快要执行的任务排在堆的最上方。在每个循环周期， Redis 都会将最小堆里面已经到点的任务立即进行处理。处理完毕后，将最快要执行的任务还需要的时间记录下来，这个时间就是 select 系统调用的 timeout 参数。因为 Redis 知道未来 timeout 时间内，没有其它定时任务需要处理，所以
可以安心睡眠 timeout 的时间。

Nginx 和 Node 的事件处理原理和 Redis 也是类似的


### 1.13.2. 阻塞问题
<a href="#menu" style="float:right">目录</a>

Redis是典型的单线程架构， 所有的读写操作都是在一条主线程中完成的。 当Redis用于高并发场景时， 这条线程就变成了它的生命线。 如果出现阻塞， 哪怕是很短时间， 对于我们的应用来说都是噩梦。 导致阻塞问题的场景大致分为内在原因和外在原因：
* 内在原因包括： 不合理地使用API或数据结构、 CPU饱和、 持久化阻塞等。
* 外在原因包括： CPU竞争、 内存交换、 网络问题等。

#### 1.13.2.1. 发现阻塞

#### 1.13.2.2. 内在原因

#### 1.13.2.3. 外在原因



## 1.14. 慢查询日志
<a href="#menu" style="float:right">目录</a>

* 慢查询日志用于记录执行时间超过阈值的命令
* 参数配置
    * slowlog-log-slower-than 
        * 超过多少微秒则记录
        * CONFIG set slowlog-log-slower-than 100
    * slowlog-max-len 
        * 指定服务器最多保存多少条慢查询日志
        * 当等于时则先删除旧的日志删除，类似一个固定长度的List
        * CONFIG set slowlog-max-len 5
        * 实际上Redis使用了一个列表来存储慢查询日志， slowlog-max-len就是列表的最大长度。 一个新的命令满足慢查询条件时被插入到这个列表中， 当慢查询日志列表已处于其最大长度时， 最早插入的一个命令将从列表中移出
    * 查看日志，slowlog get [n]
        * 显示信息: 日志的唯一标识,命令执行时的UNIX时间戳，命令执行的时长(微秒)，命令以及命令参数
        * n指定条数
    * 获取慢查询日志列表当前的长度
        * slowlog len
    * 慢查询日志重置
        * slowlog reset

        
运行时修改,如果要Redis将配置持久化到本地配置文件， 需要执行config rewrite命令
```
config set slowlog-log-slower-than 20000
config set slowlog-max-len 1000
config rewrite
```
可以看到每个慢查询日志有4个属性组成， 分别是慢查询日志的标识id、 发生时间戳、 命令耗时、 执行命令和参数
```
127.0.0.1:6379> slowlog get
1) 1) (integer) 666
2) (integer) 1456786500
3) (integer) 11615
4) 1) "BGREWRITEAOF"

```
* 使用注意事项
    * slowlog-max-len配置建议
        * 线上建议调大慢查询列表， 记录慢查询时Redis会对长命令做截断操作， 并不会占用大量内存。 增大慢查询列表可以减缓慢查询被剔除的可能， 例如线上可设置为1000以上
    * slowlog-log-slower-than配置建议：
        * 默认值超过10毫秒判定为慢查询，需要根据Redis并发量调整该值。 由于Redis采用单线程响应命令， 对于高流量的场景， 如果命令执行时间在1毫秒以上， 那么Redis最多可支撑OPS不到1000。 因此对于高OPS场景的Redis建议设置为1毫秒
    * 慢查询只记录命令执行时间， 并不包括命令排队和网络传输时间。 因此客户端执行命令的时间会大于命令实际执行时间。 因为命令执行排队机制， 慢查询会导致其他命令级联阻塞， 因此当客户端出现请求超时， 需要检查该时间点是否有对应的慢查询， 从而分析出是否为慢查询导致的命令级联阻塞
    * 由于慢查询日志是一个先进先出的队列， 也就是说如果慢查询比较多的情况下， 可能会丢失部分慢查询命令， 为了防止这种情况发生， 可以定期执行slow get命令将慢查询日志持久化到其他存储中（例如MySQL） ， 然后可以制作可视化界面进行查询， 第13章介绍的Redis私有云CacheCloud提供了这样的功能， 好的工具可以让问题排查事半功倍
    
## 1.15. 监视器
<a href="#menu" style="float:right">目录</a>


## 1.16. 关于redis性能问题分析和优化

### 1.16.1. 如何查看Redis性能
<a href="#menu" style="float:right">目录</a>

info命令输出的数据可以分为10个分类，分别是：
server,clients,memory,persistence,stats,replication,cpu,commandstats,cluster,keyspace

为了快速定位并解决性能问题，这里选择5个关键性的数据指标，它包含了大多数人在使用Redis上会经常碰到的性能问题

### 1.16.2. 内存
<a href="#menu" style="float:right">目录</a>

上图中used_memory 字段数据表示的是：由Redis分配器分配的内存总量，以字节（byte）为单位。 其中used_memory_human和used_memory是一样的，以G为单位显示

```
info memory
# Memory
used_memory:8589645288
used_memory_human:8.00G
used_memory_rss:9439997952
used_memory_peak:9082282776
used_memory_peak_human:8.46G
used_memory_lua:35840
mem_fragmentation_ratio:1.10
mem_allocator:jemalloc-3.6.0
```

used_memory是Redis使用的内存总量，包含了实际缓存占用的内存和Redis自身运行所占用的内存(如元数据、lua)，是由Redis使用内存分配器分配的内存，所以这个数据不包括内存碎片浪费掉的内存，其他字段代表的含义，都以字节为单位：
* used_memory_rss：从操作系统上显示已经分配的内存总量。
* mem_fragmentation_ratio： 内存碎片率。
* used_memory_lua： Lua脚本引擎所使用的内存大小。
* mem_allocator： 在编译时指定的Redis使用的内存分配器，可以是libc、jemalloc、tcmalloc。

**因内存交换引起的性能问题**
内存使用率是Redis服务最关键的一部分。如果Redis实例的内存使用率超过可用最大内存 (used_memory > 可用最大内存)，那么操作系统开始进行内存与swap空间交换，把内存中旧的或不再使用的内容写入硬盘上（硬盘上的这块空间叫Swap分区），以便留出新的物理内存给新页或活动页(page)使用。 

如果Redis进程上发生内存交换，那么Redis和依赖Redis上数据的应用会受到严重的性能影响。 通过查看used_memory指标可知道Redis正在使用的内存情况，如果used_memory>可用最大内存，那就说明Redis实例正在进行内存交换或者已经内存交换完毕。

**跟踪内存使用率**
若是在使用Redis期间没有开启rdb快照或aof持久化策略，那么缓存数据在Redis崩溃时就有丢失的危险。因为当Redis内存使用率超过可用内存的95%时，部分数据开始在内存与swap空间来回交换，这时就可能有丢失数据的危险。

当开启并触发快照功能时，Redis会fork一个子进程把当前内存中的数据完全复制一份写入到硬盘上。因此若是当前使用内存超过可用内存的45%时触发快照功能，那么此时进行的内存交换会变的非常危险(可能会丢失数据)。 倘若在这个时候实例上有大量频繁的更新操作，问题会变得更加严重。

通过减少Redis的内存占用率，来避免这样的问题，或者使用下面的技巧来避免内存交换发生：

假如缓存数据小于4GB，就使用32位的Redis实例。因为32位实例上的指针大小只有64位的一半，它的内存空间占用空间会更少些。 这有一个坏处就是，假设物理内存超过4GB，那么32位实例能使用的内存仍然会被限制在4GB以下。 要是实例同时也共享给其他一些应用使用的话，那可能需要更高效的64位Redis实例，这种情况下切换到32位是不可取的。 不管使用哪种方式，Redis的dump文件在32位和64位之间是互相兼容的， 因此倘若有减少占用内存空间的需求，可以尝试先使用32位，后面再切换到64位上。

尽可能的使用Hash数据结构。因为Redis在储存小于100个字段的Hash结构上，其存储效率是非常高的。所以在不需要集合(set)操作或list的push/pop操作的时候，尽可能的使用Hash结构。比如，在一个web应用程序中，需要存储一个对象表示用户信息，使用单个key表示一个用户，其每个属性存储在Hash的字段里，这样要比给每个属性单独设置一个key-value要高效的多。 通常情况下倘若有数据使用string结构，用多个key存储时，那么应该转换成单key多字段的Hash结构。 如上述例子中介绍的Hash结构应包含，单个对象的属性或者单个用户各种各样的资料。Hash结构的操作命令是HSET(key, fields, value)和HGET(key, field)，使用它可以存储或从Hash中取出指定的字段。

设置key的过期时间。一个减少内存使用率的简单方法就是，每当存储对象时确保设置key的过期时间。倘若key在明确的时间周期内使用或者旧key不大可能被使用时，就可以用Redis过期时间命令(expire,expireat, pexpire, pexpireat)去设置过期时间，这样Redis会在key过期时自动删除key。 假如你知道每秒钟有多少个新key-value被创建，那可以调整key的存活时间，并指定阀值去限制Redis使用的最大内存。

回收key。在Redis配置文件中(一般叫Redis.conf)，通过设置“maxmemory”属性的值可以限制Redis最大使用的内存，修改后重启实例生效。 也可以使用客户端命令config set maxmemory 去修改值，这个命令是立即生效的，但会在重启后会失效，需要使用config rewrite命令去刷新配置文件。 若是启用了Redis快照功能，应该设置“maxmemory”值为系统可使用内存的45%，因为快照时需要一倍的内存来复制整个数据集，也就是说如果当前已使用45%，在快照期间会变成95%(45%+45%+5%)，其中5%是预留给其他的开销。 如果没开启快照功能，maxmemory最高能设置为系统可用内存的95%。

当内存使用达到设置的最大阀值时，需要选择一种key的回收策略，可在Redis.conf配置文件中修改“maxmemory-policy”属性值。 若是Redis数据集中的key都设置了过期时间，那么“volatile-ttl”策略是比较好的选择。但如果key在达到最大内存限制时没能够迅速过期，或者根本没有设置过期时间。那么设置为“allkeys-lru”值比较合适，它允许Redis从整个数据集中挑选最近最少使用的key进行删除(LRU淘汰算法)。Redis还提供了一些其他淘汰策略，如下：

volatile-lru：使用LRU算法从已设置过期时间的数据集合中淘汰数据。

volatile-ttl：从已设置过期时间的数据集合中挑选即将过期的数据淘汰。

volatile-random：从已设置过期时间的数据集合中随机挑选数据淘汰。

allkeys-lru：使用LRU算法从所有数据集合中淘汰数据。

allkeys-random：从数据集合中任意选择数据淘汰

no-enviction：禁止淘汰数据。

通过设置maxmemory为系统可用内存的45%或95%(取决于持久化策略)和设置“maxmemory-policy”为“volatile-ttl”或“allkeys-lru”(取决于过期设置)，可以比较准确的限制Redis最大内存使用率，在绝大多数场景下使用这2种方式可确保Redis不会进行内存交换。倘若你担心由于限制了内存使用率导致丢失数据的话，可以设置noneviction值禁止淘汰数据。

### 1.16.3. 命令处理数
<a href="#menu" style="float:right">目录</a>

在info信息里的total_commands_processed字段显示了Redis服务处理命令的总数，其命令来自一个或多个Redis客户端

```
info stats
# Stats
total_connections_received:843391006
total_commands_processed:3946780282
instantaneous_ops_per_sec:1447
total_net_input_bytes:5060670300797
total_net_output_bytes:13788457111609
instantaneous_input_kbps:1399.63
instantaneous_output_kbps:2863.71
rejected_connections:0
sync_full:2
sync_partial_ok:1
sync_partial_err:0
expired_keys:231497375
evicted_keys:0
keyspace_hits:613100363
keyspace_misses:252710911
pubsub_channels:0
pubsub_patterns:0
latest_fork_usec:60179
```

分析命令处理总数，诊断响应延迟
在Redis实例中，跟踪命令处理总数是解决响应延迟问题最关键的部分，因为Redis是个单线程模型，客户端过来的命令是按照顺序执行的。比较常见的延迟是带宽，通过千兆网卡的延迟大约有200μs。倘若明显看到命令的响应时间变慢，延迟高于200μs，那可能是Redis命令队列里等待处理的命令数量比较多。 如上所述，延迟时间增加导致响应时间变慢可能是由于一个或多个慢命令引起的，这时可以看到每秒命令处理数在明显下降，甚至于后面的命令完全被阻塞，导致Redis性能降低。要分析解决这个性能问题，需要跟踪命令处理数的数量和延迟时间。

比如可以写个脚本，定期记录total_commands_processed的值。当客户端明显发现响应时间过慢时，可以通过记录的total_commands_processed历史数据值来判断命理处理总数是上升趋势还是下降趋势，以便排查问题。

使用命令处理总数解决延迟时间增加
通过与记录的历史数据比较得知，命令处理总数确实是处于上升或下降状态，那么可能是有2个原因引起的:

命令队列里的命令数量过多，后面命令一直在等待中

几个慢命令阻塞Redis

下面有三个办法可以解决，因上面2条原因引起的响应延迟问题。

* 使用多参数命令：若是客户端在很短的时间内发送大量的命令过来，会发现响应时间明显变慢，这由于后面命令一直在等待队列中前面大量命令执行完毕。有个方法可以改善延迟问题，就是通过单命令多参数的形式取代多命令单参数的形式。举例来说，循环使用LSET命令去添加1000个元素到list结构中，是性能比较差的一种方式，更好的做法是在客户端创建一个1000元素的列表，用单个命令LPUSH或RPUSH，通过多参数构造形式一次性把1000个元素发送的Redis服务上。下面是Redis的一些操作命令，有单个参数命令和支持多个参数的命令，通过这些命令可尽量减少使用多命令的次数。  
```
set  -> mset
get  -> mget
lset -> lpush, rpush
lindex -> lrange
hset -> hmset
hget -> hmget
```                                                                                                                                
* 管道命令：另一个减少多命令的方法是使用管道(pipeline)，把几个命令合并一起执行，从而减少因网络开销引起的延迟问题。因为10个命令单独发送到服务端会引起10次网络延迟开销，使用管道会一次性把执行结果返回，仅需要一次网络延迟开销。Redis本身支持管道命令，大多数客户端也支持，倘若当前实例延迟很明显，那么使用管道去降低延迟是非常有效的。

* 避免操作大集合的慢命令：如果命令处理频率过低导致延迟时间增加，这可能是因为使用了高时间复杂度的命令操作导致，这意味着每个命令从集合中获取数据的时间增大。 所以减少使用高时间复杂的命令，能显著的提高的Redis的性能。

### 1.16.4. 延迟时间
<a href="#menu" style="float:right">目录</a>
Redis的延迟数据是无法从info信息中获取的。可以用 Redis-cli工具加 --latency参数运行，如:

```
redis-cli --latency -h 127.0.0.1 -p 6379
```

由于当前服务器不同的运行情况，延迟时间可能有所误差，通常1G网卡的延迟时间是200μs，Redis的响应延迟时间以毫秒为单位

```
[root@localhost ~]# redis-cli --latency -h 127.0.0.1 -p 6379
min: 0, max: 1, avg: 0.07 (12596 samples)
```
* 跟踪Redis延迟性能
Redis之所以这么流行的主要原因之一就是低延迟特性带来的高性能，所以说解决延迟问题是提高Redis性能最直接的办法。拿1G带宽来说，若是延迟时间远高于200μs，那明显是出现了性能问题。 虽然在服务器上会有一些慢的IO操作，但Redis是单核接受所有客户端的请求，所有请求是按良好的顺序排队执行。因此若是一个客户端发过来的命令是个慢操作，那么其他所有请求必须等待它完成后才能继续执行。

* 使用延迟命令提高性能
一旦确定延迟时间是个性能问题后，这里有几个办法可以用来分析解决性能问题。

**1.使用slowlog查出引发延迟的慢命令**：Redis中的slowlog命令可以让我们快速定位到那些超出指定执行时间的慢命令，默认情况下命令若是执行时间超过10ms就会被记录到日志。slowlog只会记录其命令执行的时间，不包含io往返操作，也不记录单由网络延迟引起的响应慢。通常1gb带宽的网络延迟，预期在200μs左右，倘若一个命令仅执行时间就超过10ms，那比网络延迟慢了近50倍。 想要查看所有执行时间比较慢的命令，可以通过使用Redis-cli工具，输入slowlog get命令查看，返回结果的第三个字段以微妙位单位显示命令的执行时间。假如只需要查看最后10个慢命令，输入slowlog get 10即可

```
slowlog get
 1) 1) (integer) 12849
    2) (integer) 1495630160
    3) (integer) 61916
    4) 1) "KEYS"
       2) "20170524less*"
 2) 1) (integer) 12848
    2) (integer) 1495629901
    3) (integer) 59368
    4) 1) "KEYS"
       2) "20170524more*"
 3) 1) (integer) 12847
    2) (integer) 1495629504
    3) (integer) 59522
    4) 1) "KEYS"
       2) "sou_dzmore_16_*"
 4) 1) (integer) 12846
    2) (integer) 1495629504
    3) (integer) 57941
    4) 1) "KEYS"
       2) "sou_dz_16_*"
 5) 1) (integer) 12845
    2) (integer) 1495629504
    3) (integer) 15053
    4) 1) "KEYS"
       2) "list_dingzhis_16_*"
 6) 1) (integer) 12844
    2) (integer) 1495629504
    3) (integer) 24391
    4) 1) "KEYS"
       2) "cache_kwnew_*"
 7) 1) (integer) 12843
    2) (integer) 1495629469
    3) (integer) 57001
    4) 1) "KEYS"
       2) "sou_dzmore_15_*"
 8) 1) (integer) 12842
    2) (integer) 1495629469
    3) (integer) 61131
    4) 1) "KEYS"
       2) "sou_dz_15_*"
 9) 1) (integer) 12841
    2) (integer) 1495629469
    3) (integer) 10035
    4) 1) "KEYS"
       2) "ztlistnew_dingzhi_15_*"
10) 1) (integer) 12840
    2) (integer) 1495629469
    3) (integer) 17974
    4) 1) "KEYS"
       2) "list_dingzhis_15_*"
```

图中字段分别意思是：

1、日志的唯一标识符

2、被记录命令的执行时间点，以 UNIX 时间戳格式表示

3、查询执行时间，以微秒为单位

4、执行的命令，以数组的形式排列。完整命令是config get *

倘若你想自定义慢命令的标准，可以调整触发日志记录慢命令的阀值。若是很少或没有命令超过10ms，想降低记录的阀值，比如5毫秒，可在Redis-cli工具中输入下面的命令配置：

config set slowlog-log-slower-than 5000
也可以在Redis.config配置文件中设置，以微妙位单位。

**2.监控客户端的连接**：因为Redis是单线程模型(只能使用单核)，来处理所有客户端的请求， 但由于客户端连接数的增长，处理请求的线程资源开始降低分配给单个客户端连接的处理时间，这时每个客户端需要花费更多的时间去等待Redis共享服务的响应。这种情况下监控客户端连接数是非常重要的，因为客户端创建连接数的数量可能超出预期的数量，也可能是客户端端没有有效的释放连接。在Redis-cli工具中输入info clients可以查看到当前实例的所有客户端连接信息。如下图，第一个字段(connected_clients)显示当前实例客户端连接的总数：
```
info clients
# Clients
connected_clients:21
client_longest_output_list:0
client_biggest_input_buf:13856
blocked_clients:0
```
Redis默认允许客户端连接的最大数量是10000。若是看到连接数超过5000以上，那可能会影响Redis的性能。倘若一些或大部分客户端发送大量的命令过来，这个数字会低的多。

**3.限制客户端连接数**:自Redis2.6以后，允许使用者在配置文件(Redis.conf)maxclients属性上修改客户端连接的最大数，也可以通过在Redis-cli工具上输入config set maxclients 去设置最大连接数。根据连接数负载的情况，这个数字应该设置为预期连接数峰值的110到150之间，若是连接数超出这个数字后，Redis会拒绝并立刻关闭新来的连接。通过设置最大连接数来限制非预期数量的连接数增长，是非常重要的。另外，新连接尝试失败会返回一个错误消息，这可以让客户端知道，Redis此时有非预期数量的连接数，以便执行对应的处理措施。 上述二种做法对控制连接数的数量和持续保持Redis的性能最优是非常重要的，

**4.加强内存管理**:较少的内存会引起Redis延迟时间增加。如果Redis占用内存超出系统可用内存，操作系统会把Redis进程的一部分数据，从物理内存交换到硬盘上，内存交换会明显的增加延迟时间。关于怎么监控和减少内存使用，可查看used_memory介绍章节。

**5. 性能数据指标**:分析解决Redis性能问题，通常需要把延迟时间的数据变化与其他性能指标的变化相关联起来。命令处理总数下降的发生可能是由慢命令阻塞了整个系统，但如果命令处理总数的增加，同时内存使用率也增加，那么就可能是由于内存交换引起的性能问题。对于这种性能指标相关联的分析，需要从历史数据上来观察到数据指标的重要变化，此外还可以观察到单个性能指标相关联的所有其他性能指标信息。这些数据可以在Redis上收集，周期性的调用内容为Redis info的脚本，然后分析输出的信息，记录到日志文件中。当延迟发生变化时，用日志文件配合其他数据指标，把数据串联起来排查定位问题。

### 1.16.5. 内存碎片率
<a href="#menu" style="float:right">目录</a>

info信息中的mem_fragmentation_ratio给出了内存碎片率的数据指标，它是由操系统分配的内存除以Redis分配的内存得出：
```
mem_fragmentation_ratio = used_memory_rss / used_memory
used_memory和used_memory_rss都包含的内存分配有：
```
* 用户定义的数据：内存被用来存储key-value值。
* 内部开销： 存储内部Redis信息用来表示不同的数据类型。

used_memory_rss的rss是Resident Set Size的缩写，表示该进程所占物理内存的大小，是操作系统分配给Redis实例的内存大小。除了用户定义的数据和内部开销以外，used_memory_rss指标还包含了内存碎片的开销，内存碎片是由操作系统低效的分配/回收物理内存导致的。

操作系统负责分配物理内存给各个应用进程，Redis使用的内存与物理内存的映射是由操作系统上虚拟内存管理分配器完成的。
举个例子来说，Redis需要分配连续内存块来存储1G的数据集，这样的话更有利，但可能物理内存上没有超过1G的连续内存块，那操作系统就不得不使用多个不连续的小内存块来分配并存储这1G数据，也就导致内存碎片的产生。

内存分配器另一个复杂的层面是，它经常会预先分配一些内存块给引用，这样做会使加快应用程序的运行。

**理解资源性能**
跟踪内存碎片率对理解Redis实例的资源性能是非常重要的。内存碎片率稍大于1是合理的，这个值表示内存碎片率比较低，也说明redis没有发生内存交换。但如果内存碎片率超过1.5，那就说明Redis消耗了实际需要物理内存的150%，其中50%是内存碎片率。若是内存碎片率低于1的话，说明Redis内存分配超出了物理内存，操作系统正在进行内存交换。内存交换会引起非常明显的响应延迟，可查看used_memory介绍章节。

```
info memory
# Memory
used_memory:21189222536
used_memory_human:19.73G
used_memory_rss:21901688832
used_memory_peak:27350156888
used_memory_peak_human:25.47G
used_memory_lua:35840
mem_fragmentation_ratio:1.03
mem_allocator:jemalloc-3.6.0
```
用内存碎片率预测性能问题
倘若内存碎片率超过了1.5，那可能是操作系统或Redis实例中内存管理变差的表现。下面有3种方法解决内存管理变差的问题，并提高Redis性能：

**1. 重启Redis服务器**：如果内存碎片率超过1.5，重启Redis服务器可以让额外产生的内存碎片失效并重新作为新内存来使用，使操作系统恢复高效的内存管理。额外碎片的产生是由于Redis释放了内存块，但内存分配器并没有返回内存给操作系统，这个内存分配器是在编译时指定的，可以是libc、jemalloc或者tcmalloc。 通过比较used_memory_peak, used_memory_rss和used_memory_metrics的数据指标值可以检查额外内存碎片的占用。从名字上可以看出，used_memory_peak是过去Redis内存使用的峰值，而不是当前使用内存的值。如果used_memory_peak和used_memory_rss的值大致上相等，而且二者明显超过了used_memory值，这说明额外的内存碎片正在产生。 在Redis-cli工具上输入info memory可以查看上面三个指标的信息：

在重启服务器之前，需要在Redis-cli工具上输入shutdown save命令，意思是强制让Redis数据库执行保存操作并关闭Redis服务，这样做能保证在执行Redis关闭时不丢失任何数据。 在重启后，Redis会从硬盘上加载持久化的文件，以确保数据集持续可用。

**2.限制内存交换：** 如果内存碎片率低于1，Redis实例可能会把部分数据交换到硬盘上。内存交换会严重影响Redis的性能，所以应该增加可用物理内存或减少实Redis内存占用。 可查看used_memory章节的优化建议。

**3.修改内存分配器：**Redis支持glibc’s malloc、jemalloc11、tcmalloc几种不同的内存分配器，每个分配器在内存分配和碎片上都有不同的实现。不建议普通管理员修改Redis默认内存分配器，因为这需要完全理解这几种内存分配器的差异，也要重新编译Redis。这个方法更多的是让其了解Redis内存分配器所做的工作，当然也是改善内存碎片问题的一种办法。

### 1.16.6. 回收key
<a href="#menu" style="float:right">目录</a>

info信息中的evicted_keys字段显示的是，因为maxmemory限制导致key被回收删除的数量。回收key的情况只会发生在设置maxmemory值后，不设置会发生内存交换。 当Redis由于内存压力需要回收一个key时，Redis首先考虑的不是回收最旧的数据，而是在最近最少使用的key或即将过期的key中随机选择一个key，从数据集中删除。

这可以在配置文件中设置maxmemory-policy值为“volatile-lru”或“volatile-ttl”，来确定Redis是使用lru策略还是过期时间策略。 倘若所有的key都有明确的过期时间，那过期时间回收策略是比较合适的。若是没有设置key的过期时间或者说没有足够的过期key，那设置lru策略是比较合理的，这可以回收key而不用考虑其过期状态。

```
# 2. Stats
total_connections_received:843708918
total_commands_processed:3947987793
instantaneous_ops_per_sec:1360
total_net_input_bytes:5061895225788
total_net_output_bytes:13791028024582
instantaneous_input_kbps:1247.52
instantaneous_output_kbps:2756.92
rejected_connections:0
sync_full:2
sync_partial_ok:1
sync_partial_err:0
expired_keys:231544806
evicted_keys:0
keyspace_hits:613324172
keyspace_misses:252815503
pubsub_channels:0
pubsub_patterns:0
latest_fork_usec:60179
```
根据key回收定位性能问题
跟踪key回收是非常重要的，因为通过回收key，可以保证合理分配Redis有限的内存资源。如果evicted_keys值经常超过0，那应该会看到客户端命令响应延迟时间增加，因为Redis不但要处理客户端过来的命令请求，还要频繁的回收满足条件的key。
需要注意的是，回收key对性能的影响远没有内存交换严重，若是在强制内存交换和设置回收策略做一个选择的话，选择设置回收策略是比较合理的，因为把内存数据交换到硬盘上对性能影响非常大(见前面章节)。

**减少回收key以提升性能**
减少回收key的数量是提升Redis性能的直接办法，下面有2种方法可以减少回收key的数量：

**1.增加内存限制**：倘若开启快照功能，maxmemory需要设置成物理内存的45%，这几乎不会有引发内存交换的危险。若是没有开启快照功能，设置系统可用内存的95%是比较合理的，具体参考前面的快照和maxmemory限制章节。如果maxmemory的设置是低于45%或95%(视持久化策略)，通过增加maxmemory的值能让Redis在内存中存储更多的key，这能显著减少回收key的数量。 若是maxmemory已经设置为推荐的阀值后，增加maxmemory限制不但无法提升性能，反而会引发内存交换，导致延迟增加、性能降低。 maxmemory的值可以在Redis-cli工具上输入config set maxmemory命令来设置。
需要注意的是，这个设置是立即生效的，但重启后丢失，需要永久化保存的话，再输入config rewrite命令会把内存中的新配置刷新到配置文件中。

**2.对实例进行分片**：分片是把数据分割成合适大小，分别存放在不同的Redis实例上，每一个实例都包含整个数据集的一部分。通过分片可以把很多服务器联合起来存储数据，相当于增加总的物理内存，使其在没有内存交换和回收key的策略下也能存储更多的key。假如有一个非常大的数据集，maxmemory已经设置，实际内存使用也已经超过了推荐设置的阀值，那通过数据分片能明显减少key的回收，从而提高Redis的性能。 分片的实现有很多种方法，下面是Redis实现分片的几种常见方式：

a. Hash分片：一个比较简单的方法实现，通过Hash函数计算出key的Hash值，然后值所在范围对应特定的Redis实例。
b. 代理分片：客户端把请求发送到代理上，代理通过分片配置表选择对应的Redis实例。 如Twitter的Twemproxy，豌豆荚的codis。
c. 一致性Hash分片
d. 虚拟桶分片