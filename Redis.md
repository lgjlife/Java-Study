<span id="menu" >
<!-- TOC -->

- [1. Redis(Remote Dictionary Server)](#1-redisremote-dictionary-server)
  - [1.1. 简介](#11-简介)
    - [1.1.1. 特性](#111-特性)
    - [1.1.2. 应用场景](#112-应用场景)
    - [1.1.3. 常见客户端](#113-常见客户端)
    - [1.1.4. 与memcache对比](#114-与memcache对比)
    - [1.1.5. 安装使用](#115-安装使用)
    - [1.1.6. 常用配置说明](#116-常用配置说明)
    - [1.1.7. info　命令](#117-info命令)
    - [1.1.8. 常见面试题](#118-常见面试题)
  - [1.2. 常用数据结构](#12-常用数据结构)
    - [1.2.1. redis-cli和redis-server](#121-redis-cli和redis-server)
    - [1.2.2. 多数据库](#122-多数据库)
    - [1.2.3. 基本数据类型](#123-基本数据类型)
    - [1.2.4. 字符串](#124-字符串)
    - [1.2.5. 列表](#125-列表)
    - [1.2.6. 散列](#126-散列)
    - [1.2.7. 集合](#127-集合)
    - [1.2.8. 有序集合](#128-有序集合)
    - [1.2.9. HyperLogLog去重计数方案](#129-hyperloglog去重计数方案)
      - [1.2.9.1. 基本使用](#1291-基本使用)
      - [1.2.9.2. 实现原理](#1292-实现原理)
    - [1.2.10. BITMAP](#1210-bitmap)
      - [1.2.10.1. 基本操作](#12101-基本操作)
      - [1.2.10.2. 使用场景](#12102-使用场景)
      - [1.2.10.3. BITCOUNT实现原理](#12103-bitcount实现原理)
    - [1.2.11. 布隆过滤器](#1211-布隆过滤器)
      - [1.2.11.1. 基本原理](#12111-基本原理)
      - [1.2.11.2. 使用](#12112-使用)
    - [1.2.12. 限流](#1212-限流)
    - [1.2.13. 事务](#1213-事务)
      - [1.2.13.1. 错误处理](#12131-错误处理)
      - [1.2.13.2. WATCH命令介绍](#12132-watch命令介绍)
      - [1.2.13.3. 优化](#12133-优化)
    - [1.2.14. 键](#1214-键)
      - [1.2.14.1. SCAN](#12141-scan)
        - [1.2.14.1.1. 基本用法](#121411-基本用法)
        - [1.2.14.1.2. SCAN命令的保证](#121412-scan命令的保证)
        - [1.2.14.1.3. 每次执行返回的元素](#121413-每次执行返回的元素)
- [开销金额列表](#开销金额列表)
- [排序](#排序)
- [逆序排序](#逆序排序)
- [网址](#网址)
- [默认（按数字）排序](#默认按数字排序)
- [按字符排序](#按字符排序)
- [添加测试数据，列表值为 1 指 10](#添加测试数据列表值为-1-指-10)
- [返回列表中最小的 5 个值](#返回列表中最小的-5-个值)
- [admin](#admin)
- [jack](#jack)
- [peter](#peter)
- [mary](#mary)
- [测试数据](#测试数据)
- [排序后的结果](#排序后的结果)

<!-- /TOC -->

# 1. Redis(Remote Dictionary Server)
<a href="#menu" >目录</a>


## 1.1. 简介

Redis（Remote Dictionary Server）是一个开源的（BSD许可）使用ANSI C语言编写的，内存中的数据结构存储系统(key-value)，它可以用作数据库、缓存和消息中间件，它使用字典结构存储数据，它支持多种类型的数据结构，如 字符串（strings） ， 散列（hashes） ， 列表（lists） ， 集合（sets） ， 有序集合（sorted sets） ， bitmaps， hyperloglogs 和地理空间（geospatial） 索引半径查询。 Redis 内置了 复制（replication） ， LUA脚本（Lua scripting） ， LRU驱动事件（LRU eviction） ， 事务（transactions） 和不同级别的 磁盘持久化（persistence） ， 并通过 Redis哨兵（Sentinel） 和自动 分区（Cluster） 提供高可用性（high availability）


### 1.1.1. 特性
* 速度快
    * Redis是用C语言实现的,所有数据存储在计算机内存中。读写性能可以达到10万/秒， 当然这也取决于机器的性能
    * Redis的所有数据都是存放在内存中的， 内存操作速度相比磁盘操作快很多。
    * Redis是用C语言实现的， 一般来说C语言实现的程序“距离”操作系统更近， 执行速度相对会更快。
    * Redis使用了单线程架构， 预防了多线程可能产生的竞争问题。
    * 作者对于Redis源代码可以说是精打细磨， 曾经有人评价Redis是少有的集性能和优雅于一身的开源代码
* 持久化
    * Redis将内存中的数据定期保存到文件系统中。当Redis节点故障时， 数据文件中可以从Redis数据文件恢复。
* 支持多种数据结构
    * 支持多种数据结构： String、 List、 Set、 Hash、 Sorted Set 、 地理空间(geospatial),HyperLogLog（用于计数统计） 等等。
* 支持多种编程语言API
    * 支持Java、 C、 C++、 Go、 C#、 php、 Python、 Ruby、 Lua、 Node.js
* 功能丰富
    * 管道（Pipelining）命令， 支持事务、发布/订阅、 LUA脚本等功能
* 主从复制
    * 主服务器（master）执行添加、修改、删除，从服务器执行查询。
* 高可用及分布式
    * Redis-Sentinel（v2.8）支持高可用 ,Redis-Cluster（v3.0）支持分布式

* 版本号
    * 非稳定版本使用奇数，2.7、2.9
    * 稳定版本使用偶数，2.8、3.0

![各层级硬件读写速度](pic/redis/各层级硬件读写速度.png)

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

在社区论坛中的应用
1. 记录帖子的点赞数、 评论数和点击数 (hash)
2. 记录用户的帖子 ID 列表 (排序)， 便于快速显示用户的帖子列表 (zset)。
3. 记录帖子的标题、 摘要、 作者和封面信息， 用于列表页展示 (hash)。
4. 记录帖子的点赞用户 ID 列表， 评论 ID 列表， 用于显示和去重计数 (zset)。
5. 缓存近期热帖内容 (帖子内容空间占用比较大)， 减少数据库压力 (hash)。
6. 记录帖子的相关文章 ID， 根据内容推荐相关帖子 (list)。
7. 如果帖子 ID 是整数自增的， 可以使用 Redis 来分配帖子 ID(计数器)。
8. 收藏集和帖子之间的关系 (zset)。
9. 记录热榜帖子 ID 列表， 总热榜和分类热榜 (zset)。
10. 缓存用户行为历史， 进行恶意行为过滤 (zset,hash)。


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

* 性能上：
    * Redis只使用单核，而Memcached可以使用多核，所以平均每一个核上Redis在存储小数据时比Memcached性能更高。而在100k以上的数据中，Memcached性能要高于Redis。
* 内存空间和数据量大小：
    * Memcached可以修改最大内存，采用LRU算法。 Memcached单个key-value大小有限，一个value最大只支持1MB，而Redis最大支持512MB
* 操作便利上：
    * Memcached数据结构单一，而Redis支持更加丰富的数据类型，在服务器端直接对数据进行丰富的操作,这样可以减少网络IO次数和数据体积。
* 可靠性上：
    * MemCached不支持数据持久化，断电或重启后数据消失。 Redis支持数据持久化和数据恢复和集群，允许单点故障。
* 应用场景：
    * Memcached：动态系统中减轻数据库负载，提升性能；做缓存，适合多读少写，大数据量的情况（如人人网大量查询用户信息、好友信息、文章信息等）。
    * Redis：适用于对读写效率要求都很高，数据处理业务复杂和对安全性要求较高的系统（如新浪微博的计数和微博发布部分系统，对数据安全性、读写要求都很高）
    
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

### 1.1.5. 安装使用
<a href="#menu" >目录</a>

```yml
wget http://download.redis.io/releases/redis-x.x.x.tar.gz
$ tar xzf redis-x.x.x.tar.gz
$ ln -s redis-x.x.x redis
$ cd redis
$ make
$ make install
```
编译完成后将会在bin目录中生成相关的脚本和默认配置文件，主要是redis-server,redis-cli. 可以将相关运行文件放到／usr/local/bin。就可以直接运行。
|可执行文件|作用|
|---|---|
|redis-server|启动redis|
|redis-cli|启动客户端|
|redis-benchmark|基准测试工具|
|redis-check-aof|aof持久化文件检测和修复工具|
|redis-check-dump|rdb持久化文件检测和修复工具|
|redis-sentinel|启动redis　sentinel|



* 启动: redis-server redis.conf
* 客户端连接:　redis-cli -h 127.0.0. -p 6379 
* 停止redis: redis-cli shutdown,服务端会优雅关闭，先断开连接，生成持久化文件。直接使用kill不会进行持久化操作。
    * redis-cli shutdown　nosave|save ,是否关闭前进行持久化操作，默认是save

### 1.1.6. 常用配置说明
<a href="#menu" >目录</a>

```bash
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

#此TCP三次握手后， 会将接受的连接放入队列中， tcpbacklog就是队列的大小， 当然此值必须不大于Linux系统定义的/proc/sys/net/core/somaxconn值，默认是511，而Linux的默认参数值是128。当系统并发量大并且客户端速度缓慢的时候，可以将这二个参数一起参考设定。该内核参数默认值一般是128，对于负载很大的服务程序来说大大的不够。一般会将它修改为2048或者更大。在/etc/sysctl.conf中添加:net.core.somaxconn = 2048，然后在终端中执行sysctl -p。
tcp-backlog 511

#指定 redis 只接收来自于该 IP 地址的请求，如果不进行设置或者设置为0.0.0.0，那么将处理所有请求 
bind 127.0.0.1

#配置unix socket来让redis支持监听本地连接。
# unixsocket /var/run/redis/redis.sock
#配置unix socket使用文件的权限
# unixsocketperm 700

#此参数为设置客户端空闲超过timeout，服务端会断开连接，为0则服务端不会主动断开连接，不能小于0。
timeout 0

#tcp keepalive参数。如果设置不为0，就使用配置tcp的SO_KEEPALIVE值，使用keepalive有两个好处:检测挂掉的对端。降低中间设备出问题而导致网络看似连接却已经与对端端口的问题。在Linux内核中，设置了keepalive，redis会定时给对端发送ack。检测到对端关闭需要两倍的设置值。
#检测TCP连接活性的周期， 默认值为0， 也就是不进行检测， 如果需要设置， 建议为60， 那么Redis会每隔60秒对它创建的TCP连接进行活性检测， 防止大量死连接占用系统资源
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
# if-elseif-elseif
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

### 1.1.7. info　命令

Redis Info信息包括Server,Clients,Memory,Persistence,Stats,Replication,CPU,Commandstats,Cluster,Keyspace等。

在客户端执行　info　或者info [section]



```yml
# Server
#Redis 服务器版本
redis_version:5.0.3
#Git SHA1
redis_git_sha1:00000000
#Git dirty flag
redis_git_dirty:0
#Git dirty flag
redis_build_id:fba7e8a72b50cd84
#运行模式，单机或者集群
redis_mode:standalone
#服务器的宿主操作系统
os:Linux 4.15.0-46-generic x86_64
#架构（32 或 64 位）
arch_bits:64
# Redis 所使用的事件处理机制
multiplexing_api:epoll
#原子处理api
atomicvar_api:atomic-builtin
#编译 Redis 时所使用的 GCC 版本
gcc_version:7.3.0
#服务器进程的 PID
process_id:23560
#Redis 服务器的随机标识符（用于 Sentinel 和集群）
run_id:da97e23eb244c7c162ba30894d1682d121593947
#TCP/IP 监听端口
tcp_port:6379
#自 Redis 服务器启动以来，经过的秒数
uptime_in_seconds:2294
#
uptime_in_days:0
#redis内部调度（进行关闭timeout的客户端，删除过期key等等）频率，程序规定serverCron每秒运行10次。
hz:10
#
configured_hz:10
#自增的时钟，用于LRU管理,该时钟100ms(hz=10,因此每1000ms/10=100ms执行一次定时任务)更新一次。
lru_clock:16316798
#执行文件
executable:/home/lgj/java/redis-5.0.3/user/./redis-server
#配置文件路径
config_file: 

# Clients
#已连接客户端的数量（不包括通过从属服务器连接的客户端）
connected_clients:2
#当前连接的客户端当中，最大输入缓存
client_recent_max_input_buffer:2
#当前连接的客户端当中，最长的输出列表
client_recent_max_output_buffer:0
#正在等待阻塞命令（BLPOP、BRPOP、BRPOPLPUSH）的客户端的数量
blocked_clients:1


# Memor
   
#由 Redis 分配器分配的内存总量，以字节（byte）为单位
used_memory:596928
#以人类可读的格式返回 Redis 分配的内存总量
used_memory_human:582.94K
#从操作系统的角度，返回 Redis 已分配的内存总量（俗称常驻集大小）。这个值和 top 、 ps等命令的输出一致。
used_memory_rss:6782976
#以人类可读的格式，从操作系统的角度，返回 Redis 已分配的内存总量（俗称常驻集大小）。这个值和 top 、 ps等命令的输出一致。
used_memory_rss_human:6.47M
# redis的内存消耗峰值(以字节为单位) 
used_memory_peak:596928
#以人类可读的格式返回redis的内存消耗峰值
used_memory_peak_human:582.94K
#(used_memory/ used_memory_peak) *100%
used_memory_peak_perc:100.17%
#Redis为了维护数据集的内部机制所需的内存开销，包括所有客户端输出缓冲区、查询缓冲区、AOF重写缓冲区和主从复制的backlog。
used_memory_overhead:580344
# Redis服务器启动时消耗的内存
used_memory_startup:513392
#used_memory—used_memory_overhead
used_memory_dataset:16584
#100%*(used_memory_dataset/(used_memory—used_memory_startup))
used_memory_dataset_perc:19.85%
#
allocator_allocated:1134384
#
allocator_active:1400832
#
allocator_resident:14098432
#整个系统内存
total_system_memory:10418728960
#以人类可读的格式，显示整个系统内存
total_system_memory_human:9.70G
#Lua脚本存储占用的内存
used_memory_lua:37888
# 以人类可读的格式，显示Lua脚本存储占用的内存
used_memory_lua_human:37.00K
#
used_memory_scripts:0
#
used_memory_scripts_human:0B
#
number_of_cached_scripts:0
#Redis实例的最大内存配置
maxmemory:0
#以人类可读的格式，显示Redis实例的最大内存配置
maxmemory_human:0B
#当达到maxmemory时的淘汰策略
maxmemory_policy:noeviction
#used_memory_rss/ used_memory
allocator_frag_ratio:1.23
#
allocator_frag_bytes:266448
#
allocator_rss_ratio:10.06
#
allocator_rss_bytes:12697600
#
rss_overhead_ratio:0.48
#
rss_overhead_bytes:-7315456
#
mem_fragmentation_ratio:12.22
#
mem_fragmentation_bytes:6228040
#
mem_not_counted_for_evict:0
#
mem_replication_backlog:0
#
mem_clients_slaves:0
#
mem_clients_normal:66616
#
mem_aof_buffer:0
#内存分配器
mem_allocator:jemalloc-5.1.0
#表示没有活动的defrag任务正在运行，1表示有活动的defrag任务正在运行（defrag:表示内存碎片整理）
active_defrag_running:0
# 0表示不存在延迟释放（也有资料翻译未惰性删除）的挂起对象
lazyfree_pending_objects:0

# Persistence
#服务器是否正在载入持久化文件
loading:0
# 离最近一次成功生成rdb文件，写入命令的个数，即有多少个写入命令没有持久化
rdb_changes_since_last_save:7
# 服务器是否正在创建rdb文件
rdb_bgsave_in_progress:0
#离最近一次成功创建rdb文件的时间戳。当前时间戳 - rdb_last_save_time=多少秒未成功生成rdb文件
rdb_last_save_time:1610150024
#最近一次rdb持久化是否成功
rdb_last_bgsave_status:ok
#最近一次成功生成rdb文件耗时秒数
rdb_last_bgsave_time_sec:-1
#如果服务器正在创建rdb文件，那么这个域记录的就是当前的创建操作已经耗费的秒数
rdb_current_bgsave_time_sec:-1
#RDB过程中父进程与子进程相比执行了多少修改(包括读缓冲区，写缓冲区，数据修改等)。
rdb_last_cow_size:0
#是否开启了aof
aof_enabled:0
#标识aof的rewrite操作是否在进行中
aof_rewrite_in_progress:0
#rewrite任务计划，当客户端发送bgrewriteaof指令，如果当前rewrite子进程正在执行，那么将客户端请求的bgrewriteaof变为计划任务，待aof子进程结束后执行rewrite
aof_rewrite_scheduled:0
#最近一次aof rewrite耗费的时长
aof_last_rewrite_time_sec:-1
# 如果rewrite操作正在进行，则记录所使用的时间，单位秒
aof_current_rewrite_time_sec:-1
#上次bgrewriteaof操作的状态
aof_last_bgrewrite_status:ok
#上次aof写入状态
aof_last_write_status:ok
#AOF过程中父进程与子进程相比执行了多少修改(包括读缓冲区，写缓冲区，数据修改等)。
aof_last_cow_size:0

# Stats


#新创建连接个数,如果新创建连接过多，过度地创建和销毁连接对性能有影响，说明短连接严重或连接池使用有问题，需调研代码的连接设置
total_connections_received:3
#redis处理的命令数
total_commands_processed:21
#redis当前的qps，redis内部较实时的每秒执行的命令数
instantaneous_ops_per_sec:0
#redis网络入口流量字节数
total_net_input_bytes:694
#redis网络出口流量字节数
total_net_output_bytes:35973
# redis网络入口kps
instantaneous_input_kbps:0.00
#redis网络出口kps
instantaneous_output_kbps:0.00
# 拒绝的连接个数，redis连接个数达到maxclients限制，拒绝新连接的个数
rejected_connections:0
#主从完全同步成功次数
sync_full:0
#主从部分同步成功次数
sync_partial_ok:0
#主从部分同步失败次数
sync_partial_err:0
#运行以来过期的key的数量
expired_keys:0
# 过期的比率
expired_stale_perc:0.00
#过期计数
expired_time_cap_reached_count:0
#运行以来剔除(超过了maxmemory后)的key的数量
evicted_keys:0
#命中次数
keyspace_hits:1
#没命中次数
keyspace_misses:0
#当前使用中的频道数量
pubsub_channels:0
#当前使用的模式的数量
pubsub_patterns:0
#最近一次fork操作阻塞redis进程的耗时数，单位微秒 
latest_fork_usec:0
#是否已经缓存了到该地址的连接
migrate_cached_sockets:0
#从实例到期key数量
slave_expires_tracked_keys:0
#主动碎片整理命中次数
active_defrag_hits:0
#主动碎片整理未命中次数
active_defrag_misses:0

#主动碎片整理key命中次数
active_defrag_key_hits:0
#主动碎片整理key未命中次数
active_defrag_key_misses:0

# Replication


#实例的角色，是master or slave
role:master
#连接的slave实例个数
connected_slaves:0
#主实例启动随机字符串
master_replid:610c819d6b9c4f7c9af2dd3cbe5e86a23ef9ea6b
#主实例启动随机字符串2
master_replid2:0000000000000000000000000000000000000000
#主从同步偏移量,此值如果和上面的offset相同说明主从一致没延迟，与master_replid可被用来标识主实例复制流中的位置。
master_repl_offset:0
#: 主从同步偏移量2,此值如果和上面的offset相同说明主从一致没延迟
second_repl_offset:-1
# 复制积压缓冲区是否开启
repl_backlog_active:0

#复制积压缓冲大小
repl_backlog_size:1048576
#复制缓冲区里偏移量的大小
repl_backlog_first_byte_offset:0
#此值等于 master_repl_offset - repl_backlog_first_byte_offset,该值不会超过repl_backlog_size的大小
repl_backlog_histlen:0

# CPU
#将所有redis主进程在核心态所占用的CPU时求和累计起来
used_cpu_sys:1.720221
#将所有redis主进程在用户态所占用的CPU时求和累计起来
used_cpu_user:1.976231
#将后台进程在核心态所占用的CPU时求和累计起来
used_cpu_sys_children:0.000000
# 将后台进程在用户态所占用的CPU时求和累计起来
used_cpu_user_children:0.000000

# Cluster
#实例是否启用集群模式
cluster_enabled:0

# Keyspace
#db0的key的数量,以及带有生存期的key的数,平均存活时间
db0:keys=6,expires=0,avg_ttl=0

```

### 1.1.8. 常见面试题
<a href="#menu" >目录</a>

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

**Ｒedis为什么这么快**
* 数据的读写是基于内存的，所以操作非常快
* 单线程处理读写，没有锁竞争问题
* 使用多路 I/O 复用模型,降低了io读写的阻塞情况
* 数据结构和算法的良好使用，比如字符串使用sds，减少了内存分配和回收的次数。
* 主从复制时采用增量复制，减少了复制过程对cpu和网络带宽的占用
* 集群通信时的数据结构中，存储哈希槽的变量使用位图实现，降低了通信时对带宽的占用。



## 1.2. 常用数据结构

命令执行流程
![命令执行流程](pic/redis/do-cmd.png)

### 1.2.1. redis-cli和redis-server

* redis-cli
    * redis-cli -p 3306 指定连接的端口
    * redis-cli -h 127.0.0.1 指定连接的host
    * 如果没有-p 、-h,默认连接127.0.0.1：6379
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
    * redis-cli SHUTDOWN ，先断开所有客户端连接，然后根据配置执行持久化，最后完成退出

* redis-server
    * redis-server redis.conf
        * 启动时指定配置文件
    * --port 6378 指定端口 
    * redis-server --test-memory 1024 # 操作检测当前操作系统能否提供1G的内存给Redis
        * redis-server除了启动Redis外， 还有一个--test-memory选项。 redis-server --test-memory可以用来检测当前操作系统能否稳定地分配指定容量的内存给Redis， 通过这种检测可以有效避免因为内存问题造成Redis崩溃
        * 
redis的配置既可以通过配置文件进行配置 ，也可以通过客户端命令来进行配置
```yml
#连接上客户端之后
#配置
config set slowlog-max-len 1000
#持久化到配置文件
config rewrite
```      

### 1.2.2. 多数据库

redis是一个字典结构的存储服务器，而实际上一个redis实例提供了多个用来存储数据的字典，客户端可以指定将数据存储在哪个字典中，类似于多数据库的概念，实际上并不是存在多个数据库，而是存在多个存储字典，每个字典可以理解为一个独立的数据库。每个数据库对外都是一个以0开始的递增命名。默认支持16个，可以修改参数databases来修改。客户端默认连接的是0号数据库。可以通过命令select no.进行选择。常规的读写命令是针对单个数据库的。但是有些命令是针对所有数据库有效，比如清除命令FLUSHHALL.实际使用中，应该不同的应用使用不同的redis实例，而不应该使用不同的数据库进行隔离。

### 1.2.3. 基本数据类型
<a href="#menu" >目录</a>


|类型|结构存储的值|
|---|---|
|String|字符串，整数，或者浮点数|
|List|一个链表，链表上每个节点都包含了一个字符串|
|Hash|包含键值对的无序散列表|
|Set|包含字符串的无序收集器，并且每个字符串都是独一无二的|
|ZSet|包含字符串的有序收集器，并且每个字符串都是独一无二的|



### 1.2.4. 字符串
<a href="#menu" >目录</a>

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
### 1.2.5. 列表
<a href="#menu" >目录</a>

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

**使用场景**

* lpush+lpop=Stack（ 栈）
* lpush+rpop=Queue（ 队列）
* lpush+ltrim=Capped Collection（ 有限集合）
* lpush+brpop=Message Queue（ 消息队列）


* 消息队列
    * 可作为简单的消息队列，同时还可以使用阻塞读写
* 文章列表

    
### 1.2.6. 散列
<a href="#menu" >目录</a>

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
    * 返回值比较多时，有阻塞的可能性
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

散列表可以用于存储对象信息，比如用户信息　
```yml
hset userInfo user:10012 name libai
hset userInfo user:10012 age 17
hset userInfo user:10012 address guangdong

hset userInfo user:10034 name zhangfei
hset userInfo user:10034 age 27
hset userInfo user:10034 address guangdong

```

哈希类型是稀疏的， 而关系型数据库是完全结构化的,每个键可以有不同的field,关系型数据库可以做复杂的关系查询， 而Redis去模拟关系型复杂查询开发困难， 维护成本高

其他存储用户信息的方式


```yml
#set方式，缺点:占用较多的键，内存占用较多。
set user:10012:name libai
set user:10012:age 17

#先序列化再set,修改麻烦，每次修改都要反序列化和序列化
set user:10012 serialize(user)
```

### 1.2.7. 集合
<a href="#menu" >目录</a>

集合（set） 类型也是用来保存多个的字符串元素， 但和列表类型不一样的是， 集合中不允许有重复元素， 并且集合中的元素是无序的， 不能通过索引下标获取元素。 一个集合最多可以存储232-1个元素。 Redis除了支持集合内的增删改查， 同时还支持多个集合取交集、 并集、 差集， 合理地使用好集合类型， 能在实际开发中解决很多实际问题。


* SADD
    * SADD key member [member ...]
    * 将一个或多个 member 元素加入到集合 key 当中，已经存在于集合的 member 元素将被忽略。
* SCARD
    * SCARD key
    * 返回集合 key 的基数(集合中元素的数量)。
* SDIFF
    * SDIFF key [key ...]
    * 返回一个集合的全部成员，该集合是所有给定集合之间的**差集**。
    * 不存在的 key 被视为空集
    * 返回值:差集成员的列表。
```yml
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
    * 返回一个集合的全部成员，该集合是所有给定集合的**交集**。
    * 不存在的 key 被视为空集。
    * 当给定集合当中有一个空集时，结果也为空集(根据集合运算定律)。
    * 返回值:交集成员的列表
* SINTERSTORE
    * SINTERSTORE destination key [key ...]
    * 这个命令类似于 SINTER 命令，但它将结果保存到 destination 集合，而不是简单地返回结果集。
    * 如果 destination 集合已经存在，则将其覆盖。
    * destination 可以是 key 本身
    * 返回值:结果集中的成员数量。
* SUNION
    * SUNION key [key ...]
    * 返回一个集合的全部成员，该集合是所有给定集合的**并集**。
* SUNIONSTORE
    * SUNIONSTORE destination key [key ...]
    * 这个命令类似于 SUNION 命令，但它将结果保存到 destination 集合，而不是简单地返回结果集。

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

**使用场景**

* 标签－多个用户
* 用户－多个标签
* 共同兴趣／共同关注(交集)

### 1.2.8. 有序集合
<a href="#menu" >目录</a>

有序集合中的元素不能重复， 但是score可以重复

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


列表，集合，有序集合的异同

|数据结构|是否允许重复元素|是否有序|有序实现方式|应用场景|
|---|----|---|---|---|
|列表|是|是|索引下标|时间轴，消息队列|
|集合|否|否|无|标签，社交|
|有序集合|否|是|scope|排行榜，社交|


### 1.2.9. HyperLogLog去重计数方案
<a href="#menu" >目录</a>

HyperLogLog 提供不精确的去重计数方案，虽然不精确但是也不是非常不精确，标准误差是 0.81%.可以用这个来实现每日的登录用户计数。

#### 1.2.9.1. 基本使用

**使用set集合实现去重**

使用sadd添加数据，使用scard进行计数。

```yml
127.0.0.1:6379> sadd uv-key user1
(integer) 1
127.0.0.1:6379> sadd uv-key user2
(integer) 1
127.0.0.1:6379> sadd uv-key user3
(integer) 1
127.0.0.1:6379> sadd uv-key user1
(integer) 0
127.0.0.1:6379> scard uv-key
(integer) 3

```

**使用HyperLogLog实现去重**

```yml
127.0.0.1:6379> pfadd uv-key1 user1
(integer) 1
127.0.0.1:6379> pfadd uv-key1 user2
(integer) 1
127.0.0.1:6379> pfadd uv-key1 user4
(integer) 1
127.0.0.1:6379> pfadd uv-key1 user3
(integer) 1
127.0.0.1:6379> pfcount uv-key1
(integer) 4

```

使用set集合的问题是占用的空间比较大，当数据量非常大时，占用的空间是非常可观的。HyperLogLog虽然不精确，但是相对节省很多的空间。

#### 1.2.9.2. 实现原理

Redis 对 HyperLogLog 的存储进行了优化，在计数比较小时，它的存储空间采用稀疏矩阵存储，空间占用很小，仅仅在计数慢慢变大，稀疏矩阵占用空间渐渐超过了阈值时才会一次性转变成稠密矩阵，才会占用 12k 的空间。

### 1.2.10. BITMAP
<a href="#menu" >目录</a>


#### 1.2.10.1. 基本操作

* SETBIT
    * SETBIT key offset value
    * offset 参数必须大于或等于 0 ，小于 2^32 (bit 映射被限制在 512 MB 之内，2^32／(8 * 1024 * 1024)  = 512M)。
    * 返回值:指定偏移量原来储存的位
    * SETBIT bit 10086 1

* GETBIT
    * GETBIT key offset
    * 对 key 所储存的字符串值，获取指定偏移量上的位(bit)。
    * 当 offset 比字符串值的长度大，或者 key 不存在时，返回 0 。
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
        * BITOP NOT destkey key ，对给定 key 求逻辑非(按位取反)，并将结果保存到 destkey 。

其底层是使用sds中的数组来保存。

#### 1.2.10.2. 使用场景

由于用户的id是唯一的，因此可以利用BITMAP来实现以下功能。

* 用户周活跃
* 用户签到
* 在线用户
* 统计活跃用户

#### 1.2.10.3. BITCOUNT实现原理

**轮询法**

BITCOUNT用于对该key的值中bit为1的个数进行技术。常规的方法是循环计数，最大偏移量为2^32，那么就要进行2^32次方轮询计数，将会非常浪费性能。

注意由于SDS是动态扩容／缩容，因此遍历的次数和最大偏移量有关。

**查表法**

另一种更省时间的做法是使用查表法，每次设置bit时都会将记录位数组中含１的数量。

|位数组|bit数量|
|---|---|
|0000 0000|56|
|0000 0001|453|
|1111 1111|45|

比如上表总数为:56 * 0 + 453 * 1 + 45 * 8.

但是查表法需要额外的内存空间。

**汉明算法**

```java
public static int conut(int data){

    data = (data & 0x55555555) + ((data >>1) &  0x55555555);
    data = (data & 0x33333333) + ((data >>2) &  0x33333333);
    data = (data & 0x0F0F0F0F) + ((data >>4) &  0x0F0F0F0F);
    data = (data * (0x01010101))>>24;

    return data;
}
```

汉明算法不需要额外的存储空间，只是单纯的计算操作。

**REDIS实现**

redis使用了查表和汉明算法相结合。


### 1.2.11. 布隆过滤器
<a href="#menu" >目录</a>

#### 1.2.11.1. 基本原理

**布隆过滤器使用场景**
* 原本有10亿个号码，现在又来了10万个号码，要快速准确判断这10万个号码是否在10亿个号码库中？
    * 解决办法一：将10亿个号码存入数据库中，进行数据库查询，准确性有了，但是速度会比较慢。
    * 解决办法二：将10亿号码放入内存中，比如Redis缓存中，这里我们算一下占用内存大小：10亿*8字节=8GB，通过内存查询，准确性和速度都有了，但是大约8gb的内存空间，挺浪费内存空间的。
* 需要爬虫的网站千千万万，对于一个新的网站url，我们如何判断这个url我们是否已经爬过了？
    * 解决办法还是上面的两种，很显然，都不太好。
* 同理还有垃圾邮箱的过滤。

那么对于类似这种，大数据量集合，如何准确快速的判断某个数据是否在大数据量集合中，并且不占用内存，布隆过滤器应运而生了。



这里就可以使用布隆过滤器，它说不存在一定不存在，说存在不一定存在，也就是判断存在时是有误差的。

布隆过滤器的原理是一个键经过多个哈希函数获得不同的哈希值，然后使用bitmap存储，bitmap中该hash所在的位就设置为1.当进行检测是否存在时，也对请求键进行哈希，然后和bitmap中的数据进行比较，如果有一个为0，则一定不存在，如果全为１，就可能存在，因为不同的键会哈希到同一个值。

这里的关键是要增加哈希结果得到平均性，越平均结果越准确。

**布隆过滤器优缺点**
* 优点：优点很明显，二进制组成的数组，占用内存极少，并且插入和查询速度都足够快。
* 缺点：随着数据的增加，误判率会增加；还有无法判断数据一定存在；另外还有一个重要缺点，无法删除数据。

#### 1.2.11.2. 使用

**编译安装**

```yml
#创建目录并下载插件
cd redis_home && mkdir modules && cd modules
git clone https://github.com/RedisLabsModules/redisbloom.gi
#编译插件
make

#配置文件配置，集群每个都要配置，配置的目录为redis-server的相对目录
loadmodule ../module/redisbloom/redisbloom.so

#运行使用配置文件
./resid-server redis.conf
```

**使用**

redis 布隆过滤器主要就两个命令：
* bf.add 添加元素到布隆过滤器中：bf.add urls https://jaychen.cc。
* bf.exists 判断某个元素是否在过滤器中：bf.exists urls https://jaychen.cc。

上面说过布隆过滤器存在误判的情况，在 redis 中有两个值决定布隆过滤器的准确率：
* error_rate：允许布隆过滤器的错误率，这个值越低过滤器的位数组的大小越大，占用空间也就越大。
* initial_size：布隆过滤器可以储存的元素个数，当实际存储的元素个数超过这个值之后，过滤器的准确率会下降。
  
redis 中有一个命令可以来设置这两个值：bf.reserve urls 0.01 100

如果不使用 bf.reserve，默认的error_rate是 0.01，默认的initial_size是 100。

```yml
127.0.0.1:6379> bf.add urls bbb.com
(integer) 1
127.0.0.1:6379> bf.exists urls bbb.com
(integer) 1
127.0.0.1:6379> bf.exists urls bba.com
(integer) 0

```

布隆过滤器的initial_size估计的过大，会浪费存储空间，估计的过小，就会影响准确率，用户在使用之前一定要尽可能地精确估计好元素数量，还需要加上一定的冗余空间以避免实际元素可能会意外高出估计值很多。

布隆过滤器的error_rate越小，需要的存储空间就越大，对于不需要过于精确的场合，error_rate设置稍大一点也无伤大雅。比如在新闻去重上而言，误判率高一点只会让小部分文章不能让合适的人看到，文章的整体阅读量不会因为这点误判率就带来巨大的改变。

对于没有相关方法的客户端，可以使用lua脚本来调用。


### 1.2.12. 限流

redis提供了redis cell，其实现了漏桶限流功能。

[下载地址](https://github.com/brandur/redis-cell)





### 1.2.13. 事务
<a href="#menu" >目录</a>

Redis事务是一组命令的集合。事务同命令一样都是Redis的最小执行单位，一个事务的命令要么全部执行成功，要么全部执行失败。

事务的基本操作
```yml
//开始事务
127.0.0.1:6379> multi
OK
//发送语句
127.0.0.1:6379> set k1 1
QUEUED
127.0.0.1:6379> exec
1) OK
//提交事务

```
开始事务之后，发送给Redis的命令都会放入一个事务队列中，当**提交exec命令**时，将会按照提交的顺序执行之前的所有命令。执行时不会插入其他命令，所以这组事务中的所有命令具有原子性。事务中的每个命令的执行结果都是最后一起返回的，无法将前一条的命令作为下一条命令的参数，要实现这个功能，可以使用lua脚本。


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

* DISCARD
    * 取消事务，放弃执行事务块内的所有命令。
    * 如果正在使用 WATCH 命令监视某个(或某些) key，那么取消所有监视，等同于执行命令 UNWATCH 。
* EXEC
    * 执行所有事务块内的命令。
    * 假如某个(或某些) key 正处于 WATCH 命令的监视之下，且事务块中有和这个(或这些) key 相关的命令，那么 EXEC 命令只在这个(或这些) key 没有被其他命令所改动的情况下执行并生效，否则该事务被打断(abort)。


#### 1.2.13.1. 错误处理
<a href="#menu" >目录</a>

REDIS事务具有原子性、一致性、隔离性。当配置持久化时，事务也具有持久性。


* 导致命令执行错误的场景
    * 语法错误
        * 指的是指令不存在或者参数不对
        * 因为是在执行之前进行检查，只要出现语法错误，所有的命令**都不会得到执行**
    * 运行错误。
        * 运行错误指在命令执行时出现的错误
        * 比如字符串类型的命令操作列表类型的键
        * 因为在执行时才会发现错误，因此其他没出现错误的命令**依然能够执行**，只有错误的命令执行失败
* 为什么不支持回滚
    * 以上的两个错误在研发阶段都可以发现并解决，在生产环境并不会出现。并且一般客户端都已经封装好，并不会出现上述错误。
    * 回滚实现复杂，可能会降低吞吐量。

* 执行事务时服务器停机
    * 如果服务器没有持久化配置，那么数据库数据将会是空白的，因此也就不存在什么一致性问题
    * 如果配置了持久化rdb模式／aof模式，服务器重启之后饥饿以根据现有的rdb／aof文件来恢复数据，从而将数据库还原到一个一致的状态，如果不存在rdb文件，则数据库将会是空白的

* 由于事务是单线程处理，因此也就不存在事务并发的执行，也就没有了隔离性问题 
    


#### 1.2.13.2. WATCH命令介绍
<a href="#menu" >目录</a>

* WATCH key [key ...]
    * 监视一个(或多个) key ，如果在事务执行之前这个(或这些) key 被其他命令所改动，那么事务将被打断。
* UNWATCH
    * 取消 WATCH 命令对所有 key 的监视。

由于在提交事务之前，其他客户端可能会对当前事务的键进行操作，因此可以使用WATCH对某个键进行监视，如果发生修改，事务将不会的到执行。

WATCH必须在事务开始之前执行 。

watch可以实现乐观锁。



#### 1.2.13.3. 优化
<a href="#menu" >目录</a>

上面的 Redis 事务在发送每个指令到事务缓存队列时都要经过一次网络读写，当一个事务内部的指令较多时，需要的网络 IO 时间也会线性增长。所以通常 Redis 的客户端在执行事务时都会结合 pipeline 一起使用，这样可以将多次 IO 操作压缩为单次 IO 操作。比如我们在使用 Python 的 Redis 客户端时执行事务时是要强制使用 pipeline 的。

```java
pipe = redis.pipeline(transaction=true)
pipe.multi()
pipe.incr("books")
pipe.incr("books")
values = pipe.execute()
```



### 1.2.14. 键
<a href="#menu" >目录</a>

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
      *  '*':匹配任意个字符
      *  '?':匹配一个字符
      *  '[]':匹配括号间的任意字符，比如 a[　b-d　],匹配ab,ac,ad
      *  '\x': 匹配字符x，用于转义字符
```
KEYS * 匹配数据库中所有 key 。
KEYS h?llo 匹配 hello ， hallo 和 hxllo 等。
KEYS h*llo 匹配 hllo 和 heeeeello 等。
KEYS h[ae]llo 匹配 hello 和 hallo ，但不匹配 hillo 。
特殊符号用 \ 隔开
```

keys 算法是遍历算法， 复杂度是 O(n)， 如果实例中有千万级以上的 key， 这个指令就会导致 Redis 服务卡顿， 所有读写 Redis 的其它的指令都会被延后甚至会超时报错， 因为Redis 是单线程程序， 顺序执行所有指令， 其它指令必须等到当前的 keys 指令执行完了才可以继续


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
#### 1.2.14.1. SCAN
<a href="#menu" >目录</a>

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


scan 相比keys 具备有以下特点:
1. 复杂度虽然也是 O(n)， 但是它是通过游标分步进行的， 不会阻塞线程;
2. 提供 limit 参数， 可以控制每次返回结果的最大条数， limit 只是一个 hint， 返回的结果可多可少;
3. 同 keys 一样， 它也提供模式匹配功能;
4. 服务器不需要为游标保存状态， 游标的唯一状态就是 scan 返回给客户端的游标整数;
5. 返回的结果可能会有重复， 需要客户端去重复， 这点非常重要;
6. 遍历的过程中如果有数据修改， 改动后的数据能不能遍历到是不确定的;
7. 单次返回的结果是空的并不意味着遍历结束， 而要看返回的游标值是否为零;


##### 1.2.14.1.1. 基本用法

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


##### 1.2.14.1.2. SCAN命令的保证

SCAN 命令， 以及其他增量式迭代命令， 在进行完整遍历的情况下可以为用户带来以下保证： 从完整遍历开始直到完整遍历结束期间， 一直存在于数据集内的所有元素都会被完整遍历返回； 这意味着， 如果有一个元素， 它从遍历开始直到遍历结束期间都存在于被遍历的数据集当中， 那么 SCAN 命令总会在某次迭代中将这个元素返回给用户。

然而因为增量式命令仅仅使用游标来记录迭代状态， 所以这些命令带有以下缺点：
* 同一个元素可能会被返回多次。 处理重复元素的工作交由应用程序负责， 比如说， 可以考虑将迭代返回的元素仅仅用于可以安全地重复执行多次的操作上。
* 如果一个元素是在迭代过程中被添加到数据集的， 又或者是在迭代过程中从数据集中被删除的， 那么这个元素可能会被返回， 也可能不会， 这是未定义的（undefined）。

##### 1.2.14.1.3. 每次执行返回的元素
增量式迭代命令并不保证每次执行都返回某个给定数量的元素。

增量式命令甚至可能会返回零个元素， 但只要命令返回的游标不是 0 ， 应用程序就不应该将迭代视作结束。

不过命令返回的元素数量总是符合一定规则的， 在实际中：
* 对于一个大数据集来说， 增量式迭代命令每次最多可能会返回数十个元素；
* 而对于一个足够小的数据集来说， 如果这个数据集的底层表示为编码数据结构（encoded data structure，适用于是小集合键、小哈希键和小有序集合键）， 那么增量迭代命令将在一次调用中返回数据集中的所有元素。

最后， 用户可以通过增量式迭代命令提供的 COUNT 选项来指定每次迭代返回元素的最大值。


1.2.14.1.4. COUNT选项
虽然增量式迭代命令不保证每次迭代所返回的元素数量， 但我们可以使⽤ COUNT 选项， 对命令的⾏为进⾏⼀
定程度上的调整。
基本上， COUNT 选项的作⽤就是让⽤户告知迭代命令， 在每次迭代中应该从数据集⾥返回多少元素。
虽然 COUNT 选项只是对增量式迭代命令的⼀种提⽰（hint）， 但是在⼤多数情况下， 这种提⽰都是有效的。
COUNT 参数的默认值为 10 。

在迭代⼀个⾜够⼤的、由哈希表实现的数据库、集合键、哈希键或者有序集合键时， 如果⽤户没有使⽤
MATCH 选项， 那么命令返回的元素数量通常和 COUNT 选项指定的⼀样， 或者⽐ COUNT 选项指定的数
量稍多⼀些。
在迭代⼀个编码为整数集合（intset，⼀个只由整数值构成的⼩集合）、 或者编码为压缩列表（ziplist，
由不同值构成的⼀个⼩哈希或者⼀个⼩有序集合）时， 增量式迭代命令通常会⽆视 COUNT 选项指定的
值， 在第⼀次迭代就将数据集包含的所有元素都返回给⽤户。
并⾮每次迭代都要使⽤相同的 COUNT 值。 ⽤户可以在每次迭代中按⾃⼰的需要随意改变 COUNT 值， 只要记
得将上次迭代返回的游标⽤到下次迭代⾥⾯就可以了。
1.2.14.1.5. MATCH 选项
和 KEYS 命令⼀样， 增量式迭代命令也可以通过提供⼀个 glob ⻛格的模式参数， 让命令只返回和给定模式相
匹配的元素， 这⼀点可以通过在执⾏增量式迭代命令时， 通过给定 MATCH < pattern > 参数来实现。
以下是⼀个使⽤ MATCH 选项进⾏迭代的⽰例：
redis 127.0.0.1:6379> sadd myset 1 2 3 foo foobar feelsgood
(integer) 6
redis 127.0.0.1:6379> sscan myset 0 match f*
1) "0"
2) 1) "foo"
2) "feelsgood"
3) "foobar"
需要注意的是， 对元素的模式匹配⼯作是在命令从数据集中取出元素之后， 向客户端返回元素之前的这段时间
内进⾏的， 所以如果被迭代的数据集中只有少量元素和模式相匹配， 那么迭代命令或许会在多次执⾏中都不返
回任何元素。
以下是这种情况的⼀个例⼦：
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
2) 1) "key:611"
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
如你所⻅， 以上的⼤部分迭代都不返回任何元素。
在最后⼀次迭代， 我们通过将 COUNT 选项的参数设置为 1000 ， 强制命令为本次迭代扫描更多元素， 从⽽使
得命令返回的元素也变多了。
1.2.14.1.6. 并发执⾏多个迭代
在同⼀时间， 可以有任意多个客户端对同⼀数据集进⾏迭代， 客户端每次执⾏迭代都需要传⼊⼀个游标， 并
在迭代执⾏之后获得⼀个新的游标， ⽽这个游标就包含了迭代的所有状态， 因此， 服务器⽆须为迭代记录任
何状态。
1.2.14.1.7. 中途停⽌迭代
因为迭代的所有状态都保存在游标⾥⾯， ⽽服务器⽆须为迭代保存任何状态， 所以客户端可以在中途停⽌⼀个
迭代， ⽽⽆须对服务器进⾏任何通知。
即使有任意数量的迭代在中途停⽌， 也不会产⽣任何问题。
1.2.14.1.8. 使⽤错误的游标进⾏增量式迭代
使⽤间断的（broken）、负数、超出范围或者其他⾮正常的游标来执⾏增量式迭代并不会造成服务器崩溃， 但
可能会让命令产⽣未定义的⾏为。
未定义⾏为指的是， 增量式命令对返回值所做的保证可能会不再为真。
只有两种游标是合法的：
在开始⼀个新的迭代时， 游标必须为 0 。
增量式迭代命令在执⾏之后返回的， ⽤于延续（continue）迭代过程的游标。
1.2.14.1.9. 迭代终结的保证
增量式迭代命令所使⽤的算法只保证在数据集的⼤⼩有界（bounded）的情况下， 迭代才会停⽌， 换句话说，
如果被迭代数据集的⼤⼩不断地增⻓的话， 增量式迭代命令可能永远也⽆法完成⼀次完整迭代。
从直觉上可以看出， 当⼀个数据集不断地变⼤时， 想要访问这个数据集中的所有元素就需要做越来越多的⼯
作， 能否结束⼀个迭代取决于⽤户执⾏迭代的速度是否⽐数据集增⻓的速度更快。
1.2.14.2. SORT
⽬录
SORT key [BY pattern] [LIMIT offset count] [GET pattern [GET pattern ...]] [ASC | DESC] [ALPHA]
[STORE destination] 返回或保存给定列表、集合、有序集合 key 中经过排序的元素。 排序默认以数字作
为对象，值被解释为双精度浮点数，然后进⾏⽐较。
1.2.14.2.1. ⼀般SORT的⽤法
最简单的 SORT 使⽤⽅法是 SORT key 和 SORT key DESC ：
SORT key 返回键值从⼩到⼤排序的结果。
SORT key DESC 返回键值从⼤到⼩排序的结果。 假设 today_cost 列表保存了今⽇的开销⾦额， 那么可
以⽤ SORT 命令对它进⾏排序：
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
1.2.14.2.2. 使⽤ALPHA
因为 SORT 命令默认排序对象为数字， 当需要对字符串进⾏排序时， 需要显式地在 SORT 命令之后添加
ALPHA 修饰符：
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
4) 如果系统正确地设置了 LC_COLLATE 环境变量的话，Redis能识别 UTF-8 编码。
1.2.14.2.3. 使⽤LIMIT
排序之后返回元素的数量可以通过 LIMIT 修饰符进⾏限制， 修饰符接受 offset 和 count 两个参数：
offset 指定要跳过的元素数量。 count 指定跳过 offset 个指定的元素之后，要返回多少个对象。 以下例⼦返回
排序结果的前 5 个对象( offset 为 0 表⽰没有元素被跳过)。
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
4) 4) "7"
5) "6"
1.2.14.2.4. 使⽤外部KEY
可以使⽤外部 key 的数据作为权重，代替默认的直接对⽐键值的⽅式来进⾏排序。
假设现在有⽤户数据如下：
uid user_name_{uid} user_level_{uid}
1 admin 9999
2 jack 10
3 peter 25
4 mary 70
以下代码将数据输⼊到 Redis 中：
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
BY 选项
默认情况下， SORT uid 直接按 uid 中的值排序：
redis 127.0.0.1:6379> SORT uid
1) "1" # admin
2) "2" # jack
3) "3" # peter
4) "4" # mary
通过使⽤ BY 选项，可以让 uid 按其他键的元素来排序。
⽐如说， 以下代码让 uid 键按照 user_level_{uid} 的⼤⼩来排序：
redis 127.0.0.1:6379> SORT uid BY user_level_*
1) "2" # jack , level = 10
2) "3" # peter, level = 25
3) "4" # mary, level = 70
4) "1" # admin, level = 9999
user_level_* 是⼀个占位符， 它先取出 uid 中的值， 然后再⽤这个值来查找相应的键。
⽐如在对 uid 列表进⾏排序时， 程序就会先取出 uid 的值 1 、 2 、 3 、 4 ， 然后使⽤ user_level_1 、
user_level_2 、 user_level_3 和 user_level_4 的值作为排序 uid 的权重。
GET 选项 使⽤ GET 选项， 可以根据排序的结果来取出相应的键值。
⽐如说， 以下代码先排序 uid ， 再取出键 user_name_{uid} 的值：
redis 127.0.0.1:6379> SORT uid GET user_name_*
1) "admin"
2) "jack"
3) "peter"
4) "mary
组合使⽤ BY 和 GET 通过组合使⽤ BY 和 GET ， 可以让排序结果以更直观的⽅式显⽰出来。
⽐如说， 以下代码先按 user_level_{uid} 来排序 uid 列表， 再取出相应的 user_name_{uid} 的值：
redis 127.0.0.1:6379> SORT uid BY user_level_* GET user_name_*
1) "jack" # level = 10
2) "peter" # level = 25
3) "mary" # level = 70
4) "admin" # level = 9999
现在的排序结果要⽐只使⽤ SORT uid BY user_level_* 要直观得多。
获取多个外部键 可以同时使⽤多个 GET 选项， 获取多个外部键的值。
以下代码就按 uid 分别获取 user_level_{uid} 和 user_name_{uid} ：
redis 127.0.0.1:6379> SORT uid GET user_level_* GET user_name_*
1) "9999" # level
2) "admin" # name
3) "10"
4) "jack"
5) "25"
6) "peter"
7) "70"
8) "mary"
GET 有⼀个额外的参数规则，那就是 —— 可以⽤ # 获取被排序键的值。
以下代码就将 uid 的值、及其相应的 user_level_* 和 user_name_* 都返回为结果：
redis 127.0.0.1:6379> SORT uid GET # GET user_level_* GET user_name_*
1) "1" # uid
2) "9999" # level
3) "admin" # name
4) "2"
5) "10"
6) "jack"
7) "3"
8) "25"
9) "peter"
10) "4"
11) "70"
12) "mary"
获取外部键，但不进⾏排序 通过将⼀个不存在的键作为参数传给 BY 选项， 可以让 SORT 跳过排序操作， 直接
返回结果：
redis 127.0.0.1:6379> SORT uid BY not-exists-key
1) "4"
2) "3"
3) "2"
4) "1" 
   
   这种⽤法在单独使⽤时，没什么实际⽤处。
不过，通过将这种⽤法和 GET 选项配合， 就可以在不排序的情况下， 获取多个外部键， 相当于执⾏⼀个整合
的获取操作（类似于 SQL 数据库的 join 关键字）。
以下代码演⽰了，如何在不引起排序的情况下，使⽤ SORT 、 BY 和 GET 获取多个外部键：
redis 127.0.0.1:6379> SORT uid BY not-exists-key GET # GET user_level_* GET
user_name_*
1) "4" # id
2) "70" # level
3) "mary" # name
4) "3"
5) "25"
6) "peter"
7) "2"
8) "10"
9) "jack"
10) "1"
11) "9999"
12) "admin"
将哈希表作为 GET 或 BY 的参数 除了可以将字符串键之外， 哈希表也可以作为 GET 或 BY 选项的参数来使
⽤。
⽐如说，对于前⾯给出的⽤户信息表：
uid user_name_{uid} user_level_{uid}
1 admin 9999
2 jack 10
3 peter 25
4 mary 70
我们可以不将⽤户的名字和级别保存在 user_name_{uid} 和 user_level_{uid} 两个字符串键中， ⽽是⽤⼀个带
有 name 域和 level 域的哈希表 user_info_{uid} 来保存⽤户的名字和级别信息：
redis 127.0.0.1:6379> HMSET user_info_1 name admin level 9999
OK
redis 127.0.0.1:6379> HMSET user_info_2 name jack level 10
OK
redis 127.0.0.1:6379> HMSET user_info_3 name peter level 25
OK
redis 127.0.0.1:6379> HMSET user_info_4 name mary level 70
OK
之后， BY 和 GET 选项都可以⽤ key->field 的格式来获取哈希表中的域的值， 其中 key 表⽰哈希表键， ⽽
field 则表⽰哈希表的域：
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
1.2.14.2.5. 保存排序结果
默认情况下， SORT 操作只是简单地返回排序结果，并不进⾏任何保存操作。
通过给 STORE 选项指定⼀个 key 参数，可以将排序结果保存到给定的键上。
如果被指定的 key 已存在，那么原有的值将被排序结果覆盖。
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
可以通过将 SORT 命令的执⾏结果保存，并⽤ EXPIRE 为结果设置⽣存时间，以此来产⽣⼀个 SORT 操作的结
果缓存。
这样就可以避免对 SORT 操作的频繁调⽤：只有当结果集过期时，才需要再调⽤⼀次 SORT 操作。
另外，为了正确实现这⼀⽤法，你可能需要加锁以避免多个客户端同时进⾏缓存重建(也就是多个客户端，同⼀
时间进⾏ SORT 操作，并保存为结果集)，具体参⻅ SETNX 命令。
1.2.14.2.6. sort命令问题
sort的时间复杂度是O(n+mlog(m)) ,其中n是要待排序的列表中的元素个数，m是要返回的个数。排序前也会建
⽴⼀个n⻓度的容器来存放结果。同时运⾏多个sort命令进⾏⼤数据量的运算会严重影响性能。因此使⽤时要注
意
1. 尽可能减少待排序键中元素的数量n
2. 使⽤limit来限制返回的数据
3. 如果数据量⽐较⼤，尽可能使⽤store参数将结果缓存
1.2.15. 管道
Redis是⼀个cs模式的tcp server，使⽤和http类似的请求响应协议。
⼀个client可以通过⼀个socket连接发起多个请求命令。
每个请求命令发出后client通常会阻塞并等待redis服务处理，redis处理完后请求命令后会将结果通过响应报⽂
返回给client。 客户端和服务端通过⽹络进⾏连接。这样的连接可能⾮常快（在⼀个回路⽹络中），也可能⾮
常慢（在⼴域⽹上经过多个结点才能互通的两个主机）。但是⽆论是否存在⽹络延迟，数据包从客户端传输到
服务端，以及客户端从服务端获得相应都需要花费⼀些时间。这段时间就成为往返时延(Round Trip Time)。因
此当客户端需要执⾏⼀串请求的时候，很容易看出它对性能的影响（例如往同⼀个队列中加⼊⼤量元素，或者
往数据库中插⼊⼤量的键）。如果RTT时⻓为250毫秒（在基于⼴域⽹的低速连接环境下），即使服务器每秒可
以处理10万个请求，但是实际上我们依然只能每秒处理最多4个请求。 如果处于⼀个回路⽹络中，RTT时⻓则


相当短（我的主机ping 127.0.0.1时只需要0.044ms），但是如果你执⾏⼀⼤串写⼊请求的时候，还是会有点
⻓。 幸运的是，redis给我们提供了管道技术
Pipeline虽然好⽤， 但是每次Pipeline组装的命令个数不能没有节制， 否则⼀次组装Pipeline数据量过⼤， ⼀
⽅⾯会增加客户端的等待时间， 另⼀⽅⾯会造成⼀定的⽹络阻塞， 可以将⼀次包含⼤量命令的Pipeline拆分成
多次较⼩的Pipeline来完成
Redis客户端执⾏⼀条命令分为如下四个过程：发送命令∕命令排队∕命令执⾏∕返回结果，其中发送命令＋返
回结果称为Round Trip Time（RTT， 往返时间） 。
Pipeline（流⽔线） 机制能改善上⾯这类问题， 它能将⼀组Redis命令进⾏组装， 通过⼀次RTT传输给Redis，
再将这组Redis命令的执⾏结果按顺序返回给客户端。
Redis 客户端与 Redis 服务器之间使⽤ TCP 协议进⾏连接，⼀个客户端可以通过⼀个 socket 连接发起多个请求
命令。每个请求命令发出后 client 通常会阻塞并等待 redis 服务器处理，redis 处理完请求命令后会将结果通过
响应报⽂返回给 client，因此当执⾏多条命令的时候都需要等待上⼀条命令执⾏完毕才能执⾏
管道（pipeline）可以⼀次性发送多条命令并在执⾏完后⼀次性将结果返回，pipeline 通过减少客户端与 redis
的通信次数来实现降低往返延时时间，⽽且 Pipeline 实现的原理是队列，⽽队列的原理是时先进先出，这样就
保证数据的顺序性。 Pipeline 的默认的同步的个数为53个，也就是说 arges 中累加到53条数据时会把数据提交。其过程如下图所⽰：client 可以将三个命令放到⼀个 tcp 报⽂⼀起发送，server 则可以将三条命令的处理
结果放到⼀个 tcp 报⽂返回。
需要注意到是⽤ pipeline ⽅式打包命令发送，redis 必须在处理完所有命令前先缓存起所有命令的处理结果。
打包的命令越多，缓存消耗内存也越多。所以并不是打包的命令越多越好。具体多少合适需要根据具体情况测
试。
注意pipeline并不能保证原⼦性。
Redis管道技术
⼀个请求/相应服务可以实现为，即使客户端没有读取到旧请求的响应，服务端依旧可以处理新请求。通过这种
⽅式，可以完全⽆需等待服务端应答地发送多条指令给服务端，并最终⼀次性读取所有应答。管道技术最显著
的优势是提⾼了redis服务的性能。
⽹络通信流程
1. 客户端进程调⽤ write 将消息写到操作系统内核为套接字分配的发送缓冲 sendbuffer。
2. 客户端操作系统内核将发送缓冲的内容发送到⽹卡， ⽹卡硬件将数据通过「⽹际路由」送到服务器的⽹
卡。
3. 服务器操作系统内核将⽹卡的数据放到内核为套接字分配的接收缓冲 recv buffer。
4. 服务器进程调⽤ read 从接收缓冲中取出消息进⾏处理。
5. 服务器进程调⽤ write 将响应消息写到内核为套接字分配的发送缓冲 send buffer。
6. 服务器操作系统内核将发送缓冲的内容发送到⽹卡， ⽹卡硬件将数据通过「⽹际路由」送到客户端的⽹
卡。
7. 客户端操作系统内核将⽹卡的数据放到内核为套接字分配的接收缓冲 recv buffer。
8. 客户端进程调⽤ read 从接收缓冲中取出消息返回给上层业务逻辑进⾏处理。
9. 结束
我们开始以为 write 操作是要等到对⽅收到消息才会返回，但实际上不是这样的。 write操作只负责将数据写到
本地操作系统内核的发送缓冲然后就返回了。剩下的事交给操作系统内核异步将数据送到⽬标机器。但是如果
发送缓冲满了，那么就需要等待缓冲空出空闲空间来，这个就是写操作 IO 操作的真正耗时。 我们开始以为
read 操作是从⽬标机器拉取数据，但实际上不是这样的。 read 操作只负责将数据从本地操作系统内核的接收
缓冲中取出来就了事了。但是如果缓冲是空的，那么就需要等待数据到来，这个就是读操作 IO 操作的真正耗
时。
所以对于 value = redis.get(key)这样⼀个简单的请求来说， write 操作⼏乎没有耗时，直接写到发送缓冲就返
回，⽽ read 就会⽐较耗时了，因为它要等待消息经过⽹络路由到⽬标机器处理后的响应消息,再回送到当前的
内核读缓冲才可以返回。这才是⼀个⽹络来回的真正开销。
⽽对于管道来说，连续的 write 操作根本就没有耗时，之后第⼀个 read 操作会等待⼀个⽹络的来回开销，然后
所有的响应消息就都已经回送到内核的读缓冲了，后续的 read 操作直接就可以从缓冲拿到结果，瞬间就返回了
Pipeline 在某些场景下⾮常有⽤，⽐如有多个 command 需要被“及时的”提交，⽽且他们对相应结果没有互相
依赖，对结果响应也⽆需⽴即获得，那么 pipeline 就可以充当这种“批处理”的⼯具；⽽且在⼀定程度上，可以
较⼤的提升性能，性能提升的原因主要是 TCP 连接中减少了“交互往返”的时间。
不过在编码时请注意，pipeline 期间将“独占”链接，此期间将不能进⾏⾮“管道”类型的其他操作，直到 pipeline
关闭；如果你的 pipeline 的指令集很庞⼤，为了不⼲扰链接中的其他操作，你可以为 pipeline 操作新建 Client
链接，让 pipeline 和其他正常操作分离在2个 client 中。不过 pipeline 事实上所能容忍的操作个数，和 socket-output 缓冲区⼤⼩/返回结果的数据尺⼨都有很⼤的关系；同时也意味着每个 redis-server 同时所能⽀撑的
pipeline 链接的个数，也是有限的，这将受限于 server 的物理内存或⽹络接⼝的缓冲能⼒。
jedis使⽤实例
Jedis jedis = new Jedis("127.0.0.1",6379);
jedis.connect();
Pipeline pipeline = jedis.pipelined();
pipeline.set("k1","1223");
pipeline.rpush("k2","2234");
List<Object> result = pipeline.syncAndReturnAll();
System.out.println(result);
Pipeline pipeline1 = jedis.pipelined();
pipeline1.get("k1");
pipeline1.rpop("k2");
List<Object> result1 = pipeline1.syncAndReturnAll();
System.out.println(result1);
//输出
[OK, 2]
[1223, 2234]
//另一种写法
//res.get()必须在sync()后面执行，否则会报错
Pipeline pipeline = jedis.pipelined();
Response<String> res1 = pipeline.set("k1","1223");
Response<Long> res2 = pipeline.rpush("k2","2234");
pipeline.sync();
System.out.println(res1.get());
System.out.println(res2.get());
1.2.16. 连接
⽬录
AUTH
AUTH password
通过设置配置⽂件中 requirepass 项的值(使⽤命令 CONFIG SET requirepass password )，可以使
⽤密码来保护 Redis 服务器。



