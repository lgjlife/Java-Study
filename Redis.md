<span id="menu" >

# 1. Redis
<a href="#menu" style="float:right">目录</a>

## 1.1. 数据结构和对象
<a href="#menu" style="float:right">目录</a>


### 1.1.1. 简单动态字符串
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
        

### 1.1.2. 链表
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


### 1.1.3. 字典
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
#### 1.1.3.1. Rehash

<a href="#menu" style="float:right">目录</a>

* 为了让哈希表的负载因子维持在一个合理的范围内，需要对字典表进行重新扩展或者收缩


### 1.1.4. 跳跃表
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

### 1.1.5. 整数集合
<a href="#menu" style="float:right">目录</a>


### 1.1.6. 压缩列表
<a href="#menu" style="float:right">目录</a>

* 压缩列表是列表键和哈希键的底层实现之一


### 1.1.7. 对象
<a href="#menu" style="float:right">目录</a>

* 前面章节介绍了Redis所有的主要数结构，但是Redis并没有使用这些数据结构来实现键值对数据库。而是基于这些数据结构创建不同的对象。
* 字符串对象，列表对象，哈希对象，集合对象，无序集合对象。
* 每种对象至少使用了前面一种数据结构实现
* Redis在执行命令之前，会根据对象的类型来判断是否可以执行给定的命令
* 使用对象可以针对不同的应用场景，为对象设置多种不同的数据结构实现，从而优化对象在不同场景下的使用效率。
* Redis的垃圾回收是基于引用计数器实现

#### 1.1.7.1. 对象类型和编码
<a href="#menu" style="float:right">目录</a>

#### 1.1.7.2. 字符串对象
<a href="#menu" style="float:right">目录</a>


#### 1.1.7.3. 列表对象
<a href="#menu" style="float:right">目录</a>


#### 1.1.7.4. 哈希对象
<a href="#menu" style="float:right">目录</a>


#### 1.1.7.5. 集合对象 
<a href="#menu" style="float:right">目录</a>


#### 1.1.7.6. 由于集合对象
<a href="#menu" style="float:right">目录</a>


#### 1.1.7.7. 类型检查和命令多态
<a href="#menu" style="float:right">目录</a>

#### 1.1.7.8. 内存回收
<a href="#menu" style="float:right">目录</a>

#### 1.1.7.9. 对象共享
<a href="#menu" style="float:right">目录</a>

#### 1.1.7.10. 对象空转时长
<a href="#menu" style="float:right">目录</a>


## 1.2. 单机数据库实现
<a href="#menu" style="float:right">目录</a>


### 1.2.1. 数据库
<a href="#menu" style="float:right">目录</a>


### 1.2.2. RDB持久化
<a href="#menu" style="float:right">目录</a>


### 1.2.3. AOF持久化
<a href="#menu" style="float:right">目录</a>


### 1.2.4. 事件
<a href="#menu" style="float:right">目录</a>


### 1.2.5. 客户端
<a href="#menu" style="float:right">目录</a>


### 1.2.6. 服务器
<a href="#menu" style="float:right">目录</a>


## 1.3. 多机数据库实现
<a href="#menu" style="float:right">目录</a>


### 1.3.1. 复制
<a href="#menu" style="float:right">目录</a>

### 1.3.2. 哨兵
<a href="#menu" style="float:right">目录</a>


### 1.3.3. 集群
<a href="#menu" style="float:right">目录</a>


## 1.4. 独立功能实现
<a href="#menu" style="float:right">目录</a>


### 1.4.1. 发布与订阅
<a href="#menu" style="float:right">目录</a>


### 1.4.2. 事务
<a href="#menu" style="float:right">目录</a>


### 1.4.3. LUA脚本
<a href="#menu" style="float:right">目录</a>



### 1.4.4. 排序
<a href="#menu" style="float:right">目录</a>


### 1.4.5. 二进制位数组
<a href="#menu" style="float:right">目录</a>



### 1.4.6. 慢查询日志
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
    

### 1.4.7. 监视器
<a href="#menu" style="float:right">目录</a>




