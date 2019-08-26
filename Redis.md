<span id="menu" >
<!-- TOC -->

- [1. Redis](#1-redis)
    - [1.1. 简介](#11-简介)
            - [1.1.0.1. 与memcache对比](#1101-与memcache对比)
    - [1.2. 常用数据结构](#12-常用数据结构)
        - [1.2.1. 字符串](#121-字符串)
        - [1.2.2. 列表](#122-列表)
        - [1.2.3. 散列](#123-散列)
        - [1.2.4. 集合](#124-集合)
        - [1.2.5. 有序集合](#125-有序集合)
        - [1.2.6. 事务](#126-事务)
        - [1.2.7. 键](#127-键)
            - [1.2.7.1. SCAN](#1271-scan)
                - [1.2.7.1.1. 基本用法](#12711-基本用法)
                - [1.2.7.1.2. SCAN命令的保证](#12712-scan命令的保证)
                - [1.2.7.1.3. 每次执行返回的元素](#12713-每次执行返回的元素)
                - [1.2.7.1.4. COUNT选项](#12714-count选项)
                - [1.2.7.1.5. MATCH 选项](#12715-match-选项)
                - [1.2.7.1.6. 并发执行多个迭代](#12716-并发执行多个迭代)
                - [1.2.7.1.7. 中途停止迭代](#12717-中途停止迭代)
                - [1.2.7.1.8. 使用错误的游标进行增量式迭代](#12718-使用错误的游标进行增量式迭代)
                - [1.2.7.1.9. 迭代终结的保证](#12719-迭代终结的保证)
            - [1.2.7.2. SORT](#1272-sort)
                - [1.2.7.2.1. 一般SORT的用法](#12721-一般sort的用法)
                - [1.2.7.2.2. 使用ALPHA](#12722-使用alpha)
                - [1.2.7.2.3. 使用LIMIT](#12723-使用limit)
                - [1.2.7.2.4. 使用外部KEY](#12724-使用外部key)
                - [1.2.7.2.5. 保存排序结果](#12725-保存排序结果)
        - [1.2.8. 连接](#128-连接)
        - [1.2.9. Server（服务器）](#129-server服务器)
    - [1.3. 数据结构和对象实现原理](#13-数据结构和对象实现原理)
        - [1.3.1. 简单动态字符串](#131-简单动态字符串)
        - [1.3.2. 链表](#132-链表)
        - [1.3.3. 字典](#133-字典)
            - [1.3.3.1. Rehash](#1331-rehash)
        - [1.3.4. 跳跃表](#134-跳跃表)
        - [1.3.5. 整数集合](#135-整数集合)
        - [1.3.6. 压缩列表](#136-压缩列表)
        - [1.3.7. 对象](#137-对象)
            - [1.3.7.1. 对象类型和编码](#1371-对象类型和编码)
            - [1.3.7.2. 字符串对象](#1372-字符串对象)
            - [1.3.7.3. 列表对象](#1373-列表对象)
            - [1.3.7.4. 哈希对象](#1374-哈希对象)
            - [1.3.7.5. 集合对象](#1375-集合对象)
            - [1.3.7.6. 由于集合对象](#1376-由于集合对象)
            - [1.3.7.7. 类型检查和命令多态](#1377-类型检查和命令多态)
            - [1.3.7.8. 内存回收](#1378-内存回收)
            - [1.3.7.9. 对象共享](#1379-对象共享)
            - [1.3.7.10. 对象空转时长](#13710-对象空转时长)
    - [1.4. 单机数据库实现](#14-单机数据库实现)
        - [1.4.1. 数据库](#141-数据库)
        - [1.4.2. RDB持久化](#142-rdb持久化)
        - [1.4.3. AOF持久化](#143-aof持久化)
        - [1.4.4. 事件](#144-事件)
        - [1.4.5. 客户端](#145-客户端)
        - [1.4.6. 服务器](#146-服务器)
    - [1.5. 多机数据库实现](#15-多机数据库实现)
        - [1.5.1. 复制](#151-复制)
        - [1.5.2. 哨兵](#152-哨兵)
        - [1.5.3. 集群](#153-集群)
    - [1.6. 独立功能实现](#16-独立功能实现)
        - [1.6.1. 发布与订阅](#161-发布与订阅)
        - [1.6.2. 事务](#162-事务)
            - [1.6.2.1. 概述](#1621-概述)
            - [1.6.2.2. 错误处理](#1622-错误处理)
            - [1.6.2.3. WATCH命令介绍](#1623-watch命令介绍)
        - [1.6.3. 过期时间](#163-过期时间)
            - [1.6.3.1. 常用命令](#1631-常用命令)
            - [1.6.3.2. 实现访问频率](#1632-实现访问频率)
            - [1.6.3.3. 键的过期策略](#1633-键的过期策略)
        - [1.6.4. 管道](#164-管道)
        - [1.6.5. LUA脚本](#165-lua脚本)
            - [1.6.5.1. LUA语法](#1651-lua语法)
            - [1.6.5.2. Redis使用LUA](#1652-redis使用lua)
                - [1.6.5.2.1. 常用命令](#16521-常用命令)
            - [1.6.5.3. 在脚本中调用Redis命令](#1653-在脚本中调用redis命令)
            - [1.6.5.4. Jedis操作LUA](#1654-jedis操作lua)
        - [1.6.6. 排序](#166-排序)
        - [1.6.7. 二进制位数组](#167-二进制位数组)
        - [1.6.8. 慢查询日志](#168-慢查询日志)
        - [1.6.9. 监视器](#169-监视器)

<!-- /TOC -->

# 1. Redis
<a href="#menu" style="float:right">目录</a>


## 1.1. 简介

Redis是速度非常快的非关系型数据库。

#### 1.1.0.1. 与memcache对比

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


## 1.2. 常用数据结构
<a href="#menu" style="float:right">目录</a>

### 1.2.1. 字符串
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
### 1.2.2. 列表
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


    
### 1.2.3. 散列
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


### 1.2.4. 集合
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


### 1.2.5. 有序集合
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


### 1.2.6. 事务
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

### 1.2.7. 键
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
    * 这个命令和 EXPIREAT 命令类似，但它以毫秒为单位设置 key 的过期 unix 时间戳，而不是像 EXPIREAT 那样，以秒为单位。
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
#### 1.2.7.1. SCAN
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

##### 1.2.7.1.1. 基本用法
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


##### 1.2.7.1.2. SCAN命令的保证

SCAN 命令， 以及其他增量式迭代命令， 在进行完整遍历的情况下可以为用户带来以下保证： 从完整遍历开始直到完整遍历结束期间， 一直存在于数据集内的所有元素都会被完整遍历返回； 这意味着， 如果有一个元素， 它从遍历开始直到遍历结束期间都存在于被遍历的数据集当中， 那么 SCAN 命令总会在某次迭代中将这个元素返回给用户。

然而因为增量式命令仅仅使用游标来记录迭代状态， 所以这些命令带有以下缺点：
* 同一个元素可能会被返回多次。 处理重复元素的工作交由应用程序负责， 比如说， 可以考虑将迭代返回的元素仅仅用于可以安全地重复执行多次的操作上。
* 如果一个元素是在迭代过程中被添加到数据集的， 又或者是在迭代过程中从数据集中被删除的， 那么这个元素可能会被返回， 也可能不会， 这是未定义的（undefined）。

##### 1.2.7.1.3. 每次执行返回的元素
增量式迭代命令并不保证每次执行都返回某个给定数量的元素。

增量式命令甚至可能会返回零个元素， 但只要命令返回的游标不是 0 ， 应用程序就不应该将迭代视作结束。

不过命令返回的元素数量总是符合一定规则的， 在实际中：
* 对于一个大数据集来说， 增量式迭代命令每次最多可能会返回数十个元素；
* 而对于一个足够小的数据集来说， 如果这个数据集的底层表示为编码数据结构（encoded data structure，适用于是小集合键、小哈希键和小有序集合键）， 那么增量迭代命令将在一次调用中返回数据集中的所有元素。

最后， 用户可以通过增量式迭代命令提供的 COUNT 选项来指定每次迭代返回元素的最大值。

##### 1.2.7.1.4. COUNT选项
虽然增量式迭代命令不保证每次迭代所返回的元素数量， 但我们可以使用 COUNT 选项， 对命令的行为进行一定程度上的调整。

基本上， COUNT 选项的作用就是让用户告知迭代命令， 在每次迭代中应该从数据集里返回多少元素。

虽然 COUNT 选项只是对增量式迭代命令的一种提示（hint）， 但是在大多数情况下， 这种提示都是有效的。
* COUNT 参数的默认值为 10 。
* 在迭代一个足够大的、由哈希表实现的数据库、集合键、哈希键或者有序集合键时， 如果用户没有使用 MATCH 选项， 那么命令返回的元素数量通常和 COUNT 选项指定的一样， 或者比 COUNT 选项指定的数量稍多一些。
* 在迭代一个编码为整数集合（intset，一个只由整数值构成的小集合）、 或者编码为压缩列表（ziplist，由不同值构成的一个小哈希或者一个小有序集合）时， 增量式迭代命令通常会无视 COUNT 选项指定的值， 在第一次迭代就将数据集包含的所有元素都返回给用户。

并非每次迭代都要使用相同的 COUNT 值。
用户可以在每次迭代中按自己的需要随意改变 COUNT 值， 只要记得将上次迭代返回的游标用到下次迭代里面就可以了。


##### 1.2.7.1.5. MATCH 选项
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

##### 1.2.7.1.6. 并发执行多个迭代
在同一时间， 可以有任意多个客户端对同一数据集进行迭代， 客户端每次执行迭代都需要传入一个游标， 并在迭代执行之后获得一个新的游标， 而这个游标就包含了迭代的所有状态， 因此， 服务器无须为迭代记录任何状态。

##### 1.2.7.1.7. 中途停止迭代
因为迭代的所有状态都保存在游标里面， 而服务器无须为迭代保存任何状态， 所以客户端可以在中途停止一个迭代， 而无须对服务器进行任何通知。

即使有任意数量的迭代在中途停止， 也不会产生任何问题。
##### 1.2.7.1.8. 使用错误的游标进行增量式迭代
使用间断的（broken）、负数、超出范围或者其他非正常的游标来执行增量式迭代并不会造成服务器崩溃， 但可能会让命令产生未定义的行为。

未定义行为指的是， 增量式命令对返回值所做的保证可能会不再为真。

只有两种游标是合法的：
* 在开始一个新的迭代时， 游标必须为 0 。
* 增量式迭代命令在执行之后返回的， 用于延续（continue）迭代过程的游标。
##### 1.2.7.1.9. 迭代终结的保证
增量式迭代命令所使用的算法只保证在数据集的大小有界（bounded）的情况下， 迭代才会停止， 换句话说， 如果被迭代数据集的大小不断地增长的话， 增量式迭代命令可能永远也无法完成一次完整迭代。

从直觉上可以看出， 当一个数据集不断地变大时， 想要访问这个数据集中的所有元素就需要做越来越多的工作， 能否结束一个迭代取决于用户执行迭代的速度是否比数据集增长的速度更快。


#### 1.2.7.2. SORT
<a href="#menu" style="float:right">目录</a>

* SORT key [BY pattern] [LIMIT offset count] [GET pattern [GET pattern ...]] [ASC | DESC] [ALPHA] [STORE destination]
返回或保存给定列表、集合、有序集合 key 中经过排序的元素。
排序默认以数字作为对象，值被解释为双精度浮点数，然后进行比较。

##### 1.2.7.2.1. 一般SORT的用法
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

##### 1.2.7.2.2. 使用ALPHA
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


##### 1.2.7.2.3. 使用LIMIT

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

##### 1.2.7.2.4. 使用外部KEY

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
##### 1.2.7.2.5. 保存排序结果

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



### 1.2.8. 连接
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

    
### 1.2.9. Server（服务器）
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

* 为了让哈希表的负载因子维持在一个合理的范围内，需要对字典表进行重新扩展或者收缩


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

### 1.3.5. 整数集合
<a href="#menu" style="float:right">目录</a>


### 1.3.6. 压缩列表
<a href="#menu" style="float:right">目录</a>

* 压缩列表是列表键和哈希键的底层实现之一


### 1.3.7. 对象
<a href="#menu" style="float:right">目录</a>

* 前面章节介绍了Redis所有的主要数结构，但是Redis并没有使用这些数据结构来实现键值对数据库。而是基于这些数据结构创建不同的对象。
* 字符串对象，列表对象，哈希对象，集合对象，无序集合对象。
* 每种对象至少使用了前面一种数据结构实现
* Redis在执行命令之前，会根据对象的类型来判断是否可以执行给定的命令
* 使用对象可以针对不同的应用场景，为对象设置多种不同的数据结构实现，从而优化对象在不同场景下的使用效率。
* Redis的垃圾回收是基于引用计数器实现

#### 1.3.7.1. 对象类型和编码
<a href="#menu" style="float:right">目录</a>

#### 1.3.7.2. 字符串对象
<a href="#menu" style="float:right">目录</a>


#### 1.3.7.3. 列表对象
<a href="#menu" style="float:right">目录</a>


#### 1.3.7.4. 哈希对象
<a href="#menu" style="float:right">目录</a>


#### 1.3.7.5. 集合对象 
<a href="#menu" style="float:right">目录</a>


#### 1.3.7.6. 由于集合对象
<a href="#menu" style="float:right">目录</a>


#### 1.3.7.7. 类型检查和命令多态
<a href="#menu" style="float:right">目录</a>

#### 1.3.7.8. 内存回收
<a href="#menu" style="float:right">目录</a>

#### 1.3.7.9. 对象共享
<a href="#menu" style="float:right">目录</a>

#### 1.3.7.10. 对象空转时长
<a href="#menu" style="float:right">目录</a>


## 1.4. 单机数据库实现
<a href="#menu" style="float:right">目录</a>


### 1.4.1. 数据库
<a href="#menu" style="float:right">目录</a>


### 1.4.2. RDB持久化
<a href="#menu" style="float:right">目录</a>



### 1.4.3. AOF持久化
<a href="#menu" style="float:right">目录</a>


### 1.4.4. 事件
<a href="#menu" style="float:right">目录</a>


### 1.4.5. 客户端
<a href="#menu" style="float:right">目录</a>


### 1.4.6. 服务器
<a href="#menu" style="float:right">目录</a>


## 1.5. 多机数据库实现
<a href="#menu" style="float:right">目录</a>


### 1.5.1. 复制
<a href="#menu" style="float:right">目录</a>

### 1.5.2. 哨兵
<a href="#menu" style="float:right">目录</a>


### 1.5.3. 集群
<a href="#menu" style="float:right">目录</a>


## 1.6. 独立功能实现
<a href="#menu" style="float:right">目录</a>


### 1.6.1. 发布与订阅
<a href="#menu" style="float:right">目录</a>


### 1.6.2. 事务
<a href="#menu" style="float:right">目录</a>

#### 1.6.2.1. 概述

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



#### 1.6.2.2. 错误处理

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


#### 1.6.2.3. WATCH命令介绍
* WATCH key [key ...]
    * 监视一个(或多个) key ，如果在事务执行之前这个(或这些) key 被其他命令所改动，那么事务将被打断。
* UNWATCH
    * 取消 WATCH 命令对所有 key 的监视。

由于在提交事务之前，其他客户端可能会对当前事务的键进行操作，因此可以使用WATCH对某个键进行监视，如果发生修改，事务将不会的到执行。
WATCH必须在事务开始之前执行 。


### 1.6.3. 过期时间
<a href="#menu" style="float:right">目录</a>

#### 1.6.3.1. 常用命令

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

#### 1.6.3.2. 实现访问频率

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

#### 1.6.3.3. 键的过期策略

|淘汰键策略|说明|
|---|---|
|volatile-lru|使用LRU算法删除一个键，只对设置了过期时间的键有效|
|allkeys-lru|使用LRU算法删除一个键，对所有的键有效|
|volatile-lfu|使用LFU算法删除一个键，只对设置了过期时间的键有效|
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

### 1.6.4. 管道
Redis是一个cs模式的tcp server，使用和http类似的请求响应协议。

一个client可以通过一个socket连接发起多个请求命令。

每个请求命令发出后client通常会阻塞并等待redis服务处理，redis处理完后请求命令后会将结果通过响应报文返回给client。
客户端和服务端通过网络进行连接。这样的连接可能非常快（在一个回路网络中），也可能非常慢（在广域网上经过多个结点才能互通的两个主机）。但是无论是否存在网络延迟，数据包从客户端传输到服务端，以及客户端从服务端获得相应都需要花费一些时间。这段时间就成为往返时延(Round Trip Time)。因此当客户端需要执行一串请求的时候，很容易看出它对性能的影响（例如往同一个队列中加入大量元素，或者往数据库中插入大量的键）。如果RTT时长为250毫秒（在基于广域网的低速连接环境下），即使服务器每秒可以处理10万个请求，但是实际上我们依然只能每秒处理最多4个请求。
如果处于一个回路网络中，RTT时长则相当短（我的主机ping 127.0.0.1时只需要0.044ms），但是如果你执行一大串写入请求的时候，还是会有点长。
幸运的是，redis给我们提供了管道技术

**Redis管道技术**
一个请求/相应服务可以实现为，即使客户端没有读取到旧请求的响应，服务端依旧可以处理新请求。通过这种方式，可以完全无需等待服务端应答地发送多条指令给服务端，并最终一次性读取所有应答。管道技术最显著的优势是提高了redis服务的性能。

### 1.6.5. LUA脚本
<a href="#menu" style="float:right">目录</a>

#### 1.6.5.1. LUA语法

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

#### 1.6.5.2. Redis使用LUA
<a href="#menu" style="float:right">目录</a>

##### 1.6.5.2.1. 常用命令
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

#### 1.6.5.3. 在脚本中调用Redis命令

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


#### 1.6.5.4. Jedis操作LUA

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







### 1.6.6. 排序
<a href="#menu" style="float:right">目录</a>


### 1.6.7. 二进制位数组
<a href="#menu" style="float:right">目录</a>



### 1.6.8. 慢查询日志
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
    * 查看日志，slowlog get 
        * 显示信息: 日志的唯一标识,命令执行时的UNIX时间戳，命令执行的时长(微秒)，命令以及命令参数
    

### 1.6.9. 监视器
<a href="#menu" style="float:right">目录</a>


