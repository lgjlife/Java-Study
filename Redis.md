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
        - [1.6.3. LUA脚本](#163-lua脚本)
        - [1.6.4. 排序](#164-排序)
        - [1.6.5. 二进制位数组](#165-二进制位数组)
        - [1.6.6. 慢查询日志](#166-慢查询日志)
        - [1.6.7. 监视器](#167-监视器)

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
* BRPOP
* BRPOPLPUSH
* LINDEX
* LINSERT
* LLEN
* LPOP
* LPUSH
* LPUSHX
* LRANGE
* LREM
* LSET
* LTRIM
* RPOP
* RPOPLPUSH
* RPUSH
* RPUSHX

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
* SCARD
* SDIFF
* SDIFFSTORE
* SINTER
* SINTERSTORE
* SISMEMBER
* SMEMBERS
* SMOVE
* SPOP
* SRANDMEMBER
* SREM
* SUNION
* SUNIONSTORE
* SSCAN

### 1.2.5. 有序集合
<a href="#menu" style="float:right">目录</a>

* ZADD
* ZCARD
* ZCOUNT
* ZINCRBY
* ZRANGE
* ZRANGEBYSCORE
* ZRANK
* ZREM
* ZREMRANGEBYRANK
* ZREMRANGEBYSCORE
* ZREVRANGE
* ZREVRANGEBYSCORE
* ZREVRANK
* ZSCORE
* ZUNIONSTORE
* ZINTERSTORE
* ZSCAN

### 1.2.6. 事务
<a href="#menu" style="float:right">目录</a>


* DISCARD
* EXEC
* MULTI
* UNWATCH
* WATCH

### 1.2.7. 键
<a href="#menu" style="float:right">目录</a>

* DEL
* DUMP
* EXISTS
* EXPIRE
* EXPIREAT
* KEYS
* MIGRATE
* MOVE
* OBJECT
* PERSIST
* PEXPIRE
* PEXPIREAT
* PTTL
* RANDOMKEY
* RENAME
* RENAMENX
* RESTORE
* SORT
* TTL
* TYPE
* SCAN

### 1.2.8. 连接
<a href="#menu" style="float:right">目录</a>

* AUTH
* ECHO
* PING
* QUIT
* SELECT
### 1.2.9. Server（服务器）
<a href="#menu" style="float:right">目录</a>

* BGREWRITEAOF
* BGSAVE
* CLIENT GETNAME
* CLIENT KILL
* CLIENT LIST
* CLIENT SETNAME
* CONFIG GET
* CONFIG RESETSTAT
* CONFIG REWRITE
* CONFIG SET
* DBSIZE
* DEBUG OBJECT
* DEBUG SEGFAULT
* FLUSHALL
* FLUSHDB
* INFO
* LASTSAVE
* MONITOR
* PSYNC
* SAVE
* SHUTDOWN
* SLAVEOF
* SLOWLOG
* SYNC
* TIME

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


### 1.6.3. LUA脚本
<a href="#menu" style="float:right">目录</a>



### 1.6.4. 排序
<a href="#menu" style="float:right">目录</a>


### 1.6.5. 二进制位数组
<a href="#menu" style="float:right">目录</a>



### 1.6.6. 慢查询日志
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
    

### 1.6.7. 监视器
<a href="#menu" style="float:right">目录</a>


