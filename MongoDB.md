
<span id="menu"></span>

<!-- TOC -->

- [1. MongoDB](#1-mongodb)
    - [1.1. 基本介绍](#11-基本介绍)
        - [1.1.1. MongoDB特性、优势](#111-mongodb特性优势)
        - [1.1.2. 使用场景](#112-使用场景)
        - [1.1.3. Redis和MongoDB的区别](#113-redis和mongodb的区别)
        - [1.1.4. 安装和运行](#114-安装和运行)
            - [1.1.4.1. Docker方式安装运行](#1141-docker方式安装运行)
        - [1.1.5. 基础知识](#115-基础知识)
            - [1.1.5.1. 文档](#1151-文档)
            - [1.1.5.2. 集合](#1152-集合)
            - [1.1.5.3. 数据库](#1153-数据库)
        - [1.1.6. MongoDB shell简介](#116-mongodb-shell简介)
            - [1.1.6.1. 运行](#1161-运行)
            - [1.1.6.2. 基本操作](#1162-基本操作)
            - [1.1.6.3. 使用shell执行脚本](#1163-使用shell执行脚本)
        - [1.1.7. 数据类型](#117-数据类型)
            - [1.1.7.1. 基本数据类型](#1171-基本数据类型)
    - [1.2. 创建,更新和删除文档](#12-创建更新和删除文档)
        - [1.2.1. 插入并保存文档](#121-插入并保存文档)
        - [1.2.2. 删除文档](#122-删除文档)
        - [1.2.3. 更新文档](#123-更新文档)
    - [1.3. 查询](#13-查询)
        - [1.3.1. 基本的find操作](#131-基本的find操作)
    - [1.4. 索引](#14-索引)
    - [1.5. 聚合](#15-聚合)
    - [1.6. 复制](#16-复制)
        - [副本集](#副本集)
    - [1.7. 分片](#17-分片)
    - [应用管理](#应用管理)
    - [服务器管理](#服务器管理)
    - [1.8. SpringBoot中使用Mongodb](#18-springboot中使用mongodb)
        - [1.8.1. 引入依赖](#181-引入依赖)
        - [1.8.2. 配置](#182-配置)
        - [1.8.3. 使用](#183-使用)
            - [1.8.3.1. 创建实体](#1831-创建实体)
            - [1.8.3.2. 使用MongoTemplate方式](#1832-使用mongotemplate方式)
            - [1.8.3.3. 使用MongoRepository方式](#1833-使用mongorepository方式)

<!-- /TOC -->
# 1. MongoDB
<a href="#menu" >目录</a>


## 1.1. 基本介绍
<a href="#menu" >目录</a>

MongoDB 是一个基于分布式文件存储的数据库。由 C++ 语言编写。旨在为 WEB 应用提供可扩展的高性能数据存储解决方案。

MongoDB 是一个介于关系数据库和非关系数据库之间的产品，是非关系数据库当中功能最丰富，最像关系数据库的。

### 1.1.1. MongoDB特性、优势
<a href="#menu" >目录</a>

* 易于使用
    * 面向文档的数据库,不是关系型数据库
    * 没有行的概念,文档可以使用一条记录来表现复杂的层次关系
    * 这里的文档可以简单理解为键值对象系统,值为简单的基本类型对象(数值字符串等),也可以是复杂的JSON对象
* 易于扩展
    * 采用横向扩展,使用多台服务器进行数据分割.其能够自动处理跨集群的数据和负载,自动重新分配文档,以及将用户请求路由到正确的机器上.
    * 如果集群需要添加新服务器,MongoDB能够将现有数据向新服务器传送
* 丰富的功能
    * 索引
        * 支持通用的二级索引,允许快速查询,且提供唯一索引,符合索引,地理空间索引,以及全文索引'
    * 聚合
        * 支持聚合管道
        * 能够通过简单的片段创建复杂的聚合,并通过数据库自动优化
    * 特殊的集合类型
    * 文件存储
* 事务支持
    * MongoDB 目前只支持单文档事务，需要复杂事务支持的场景暂时不适合
* 灵活的文档模型
    * JSON 格式存储最接近真实对象模型，对开发者友好，方便快速开发迭代
* 高可用复制集
    * 满足数据高可靠、服务高可用的需求，运维简单，故障自动切换
* 可扩展分片集群
    * 海量数据存储，服务能力水平扩展
* 高性能
    * mmapv1、wiredtiger、mongorocks（rocksdb）、in-memory 等多引擎支持满足各种场景需求
* 强大的索引支持
    * 地理位置索引可用于构建 各种 O2O 应用、文本索引解决搜索的需求、TTL索引解决历史数据自动过期的需求
* Gridfs
    * 解决文件存储的需求
* aggregation & mapreduce
    * 解决数据分析场景需求，用户可以自己写查询语句或脚本，将请求都分发到 MongoDB 上完成

### 1.1.2. 使用场景
<a href="#menu" >目录</a>

* 应用不需要事务及复杂 join 支持
* 新应用，需求会变，数据模型无法确定，想快速迭代开发
* 应用需要2000-3000以上的读写QPS（更高也可以）
* 应用需要TB甚至 PB 级别数据存储
* 应用发展迅速，需要能快速水平扩展
* 应用要求存储的数据不丢失
* 应用需要99.999%高可用
* 应用需要大量的地理位置查询、文本查询

### 1.1.3. Redis和MongoDB的区别
<a href="#menu" >目录</a>

从以下几个维度，对redis、mongoDB 做了对比：
* 性能
    * 都比较高，性能对我们来说应该都不是瓶颈
    * 总体来讲，TPS方面redis要大于mongodb
* 操作的便利性
    * redis丰富一些，数据操作方面，redis更好一些，较少的网络IO次数
    * mongodb支持丰富的数据表达，索引，最类似关系型数据库，支持的查询语言非常丰富
* 内存空间的大小和数据量的大小
    * redis在2.0版本后增加了自己的VM特性，突破物理内存的限制；可以对key value设置过期时间（类似memcache）
    * mongoDB适合大数据量的存储，依赖操作系统VM做内存管理，吃内存也比较厉害，服务不要和别的服务在一起
* 可用性（单点问题）
    * 对于单点问题
        * redis，依赖客户端来实现分布式读写；主从复制时，每次从节点重新连接主节点都要依赖整个快照,无增量复制，因性能和效率问题，所以单点问题比较复杂；不支持自动sharding,需要依赖程序设定一致hash 机制。
        * 一种替代方案是，不用redis本身的复制机制，采用自己做主动复制（多份存储），或者改成增量复制的方式（需要自己实现），一致性问题和性能的权衡
        * mongoDB支持master-slave,replicaset（内部采用paxos选举算法，自动故障恢复）,auto sharding机制，对客户端屏蔽了故障转移和切分机制。
* 可靠性（持久化）
    * 对于数据持久化和数据恢复，
        * redis支持（快照、AOF）：依赖快照进行持久化，aof增强了可靠性的同时，对性能有所影响
        * MongoDB从1.8版本开始采用binlog方式支持持久化的可靠性
* 数据一致性（事务支持）
    * redis事务支持比较弱，只能保证事务中的每个操作连续执行
    * mongoDB不支持事务
* 数据分析
    * mongoDB内置了数据分析的功能(mapreduce),其他不支持
* 应用场景
    * redis：数据量较小的更性能操作和运算上
    * MongoDB:主要解决海量数据的访问效率问题


### 1.1.4. 安装和运行
<a href="#menu" >目录</a>

#### 1.1.4.1. Docker方式安装运行
<a href="#menu" >目录</a>

**下载镜像**
```
docker pull mongo
```

**创建容器**
```
docker run --name mongo-server -p 27017:27017 -v $PWD/db:/data/db -d mongo:latest
```
进入容器
```
docker exec -it  mongo-server /bin/bash 
```
**运行mongo启动shell客户端**

```
root@9b5700cb51ed:/data/db# mongo
MongoDB shell version v4.2.0
connecting to: mongodb://127.0.0.1:27017/?compressors=disabled&gssapiServiceName=mongodb
Implicit session: session { "id" : UUID("e69fef45-2389-4cc8-957c-29beb425e48e") }
MongoDB server version: 4.2.0
Server has startup warnings: 
2019-10-20T04:09:19.566+0000 I  STORAGE  [initandlisten] 
2019-10-20T04:09:19.566+0000 I  STORAGE  [initandlisten] ** WARNING: Using the XFS filesystem is strongly recommended with the WiredTiger storage engine
2019-10-20T04:09:19.566+0000 I  STORAGE  [initandlisten] **          See http://dochub.mongodb.org/core/prodnotes-filesystem
2019-10-20T04:09:21.395+0000 I  CONTROL  [initandlisten] 
2019-10-20T04:09:21.395+0000 I  CONTROL  [initandlisten] ** WARNING: Access control is not enabled for the database.
2019-10-20T04:09:21.395+0000 I  CONTROL  [initandlisten] **          Read and write access to data and configuration is unrestricted.
2019-10-20T04:09:21.395+0000 I  CONTROL  [initandlisten] 

Enable MongoDB's free cloud-based monitoring service, which will then receive and display
metrics about your deployment (disk utilization, CPU, operation statistics, etc).

The monitoring data will be available on a MongoDB website with a unique URL accessible to you
and anyone you share the URL with. MongoDB may use this information to make product
improvements and to suggest MongoDB products and deployment options to you.

To enable free monitoring, run the following command: db.enableFreeMonitoring()
To permanently disable this reminder, run the following command: db.disableFreeMonitoring()
```


**简单的例子**

```js
//获取当前的数据库 
> db
test
//创建变量
> book = {"name":"Java"}
{ "name" : "Java" }
//插入变量
> db.mybook.insert(book)
WriteResult({ "nInserted" : 1 })
//查找变量
> db.mybook.find()
{ "_id" : ObjectId("5dafc885a1e7153715cc775e"), "name" : "Java" }

```

### 1.1.5. 基础知识
<a href="#menu" >目录</a>

#### 1.1.5.1. 文档
<a href="#menu" >目录</a>

文档是MongoDB中数据的基本单元,类似于数据库中的行.

文档相当于一个JSON对象

```json
{"name": "libai"}
{"age":15}
```

* 文档键的限制
    * 不能含有'\0'空字符,这个字符表示键的结尾
    * 不能含有'.','$',这两个字符只能在特定环境下使用

```json
//不同的文档
{"name": "libai"}
{"name": 1}

//不同的文档
{"name": "libai"}
{"Name": 1}

```
#### 1.1.5.2. 集合
<a href="#menu" >目录</a>

集合可以看作是一个拥有动态模式的表.动态模式意味着集合里面的文档可以是各式各样的,文档的字段等可以完全不一样.一般使用中为了规范,一个集合中只存储同一种文档.

**集合命名规范**
* 集合名不能为空字符串(” “)
* 不能包含\0或空字符,这个字符表示键的结尾
* 集合名不能以”system.”开头,此前缀是系统本身保留的
* 集合名不能包含$字符(注:可包含 . 点号)

**子集合**
集合可以使用"."分隔不同的命名空间的子集合,比如blog.comment,blog.img

#### 1.1.5.3. 数据库
<a href="#menu" >目录</a>

多个文档组成集合,多个集合组成数据库.一个Mongo可以包含多个数据库.每个数据库都有独立的权限.

"数据库名.集合名"为集合的完全限定名.即命名空间.


**数据库命名规范**
* 不能为空字符串(” “)
* 不能以$开头
* 不能包含.(点号)和空字符串
* 数据库名区分大小写(建议数据库名全部使用小写)
* 数据库名最长为64个字节
* 不要与系统保留的数据库名相同,这写数据库包括:admin,local,config等


### 1.1.6. MongoDB shell简介
<a href="#menu" >目录</a>

MongoDB自带JavaScript Shel,可在Shell中使用命令与MongoDB实例交互

#### 1.1.6.1. 运行

使用mongo命令启动shell
```
root@9b5700cb51ed:/data/db# mongo --help
MongoDB shell version v4.2.0
usage: mongo [options] [db address] [file names (ending in .js)]
db address can be:
  foo                   foo database on local machine
  192.168.0.5/foo       foo database on 192.168.0.5 machine
  192.168.0.5:9999/foo  foo database on 192.168.0.5 machine on port 9999
  mongodb://192.168.0.5:9999/foo  connection string URI can also be used
Options:
  --ipv6                               enable IPv6 support (disabled by 
                                       default)
  --host arg                           server to connect to
  --port arg                           port to connect to

```

#### 1.1.6.2. 基本操作


**数据库常用操作**
* show dbs: 展示所有的数据库
* db:查看当前选择的数据库
* use db_name:选择数据库

**在线文档**
```
> help
	db.help()                    help on db methods
	db.mycoll.help()             help on collection methods
	sh.help()                    sharding helpers
	rs.help()                    replica set helpers
	help admin                   administrative help
	help connect                 connecting to a db help
	help keys                    key shortcuts
	help misc                    misc things to know
	help mr                      mapreduce

	show dbs                     show database names
	show collections             show collections in current database
	show users                   show users in current database
	show profile                 show most recent system.profile entries with time >= 1ms
	show logs                    show the accessible logger names
	show log [name]              prints out the last segment of log in memory, 'global' is default
	use <db_name>                set current database
	db.foo.find()                list objects in collection foo
	db.foo.find( { a : 1 } )     list objects in foo where a == 1
	it                           result of the last line evaluated; use to further iterate
	DBQuery.shellBatchSize = x   set default number of items to display on shell
	exit                         quit the mongo shell

```
**基本例子**
```js
//获取当前的数据库 
> db
test
//创建变量
> book = {"name":"Java"}
{ "name" : "Java" }
//插入变量
> db.mybook.insert(book)
WriteResult({ "nInserted" : 1 })
//查找变量
> db.mybook.find()
{ "_id" : ObjectId("5dafc885a1e7153715cc775e"), "name" : "Java" }
> db.mybook.findOne()
//添加文档的键

//更新
book.page=[]
db.mybook.update({"name":"Java"},book)

//删除
> db.mybook.remove({"name":"Java"})
WriteResult({ "nRemoved" : 1 })
> db.mybook.find()

```

以上的update和remove操作,第一个参数都是匹配条件

#### 1.1.6.3. 使用shell执行脚本

```
$ mongo  xxx.js xxx1.js
```
会依次执行传入的脚本.


### 1.1.7. 数据类型
<a href="#menu" >目录</a>

#### 1.1.7.1. 基本数据类型

* null        
    * null表示空值或者不存在的字段           
    * {"a" : null}
* 布尔型
    * 与java的boolean一样                           
    * {"a" : true}
* 数值（不区分整数或浮点数）
    * {"a" : 1.34}
    * 但是对于整数类型可以用下面方式表示
    * {"a" : NumberInt("3")}表示4字节的整数
    * {"a" : NumberLong("3")} 表示8字节的整数
* 字符串
    * UTF-8的字符串,{"a" : "string"}
* 日期
    * {"a" : new Date()}
* 数组                                                                  
    * {"a" : ["b", "c" , "d", "e"]}
* 内嵌文档
    * {"a" : {"b" : "c" , "d" : "e"}}
* 对象id
    * 对象id是一个12字节的ID，我文档的唯一表示，对象的默认主键 _id 就是一个对象id,{"a" : ObjectId()}
* 二进制数据
    * 可以用UTF-8字符串保存到文档中，不能使用shell进行保存
* 代码(JS代码)
    * {"a" : function() { /*     ...      */ }} 
    * 后续在创建副本集、分片时会经常使用代码类型。
* 正则表达式
    * 查询时可以使用正则表达式作为限定条件.语法也和JS的正则表达式语法相同
    * {"x": /a/i }

## 1.2. 创建,更新和删除文档
<a href="#menu" >目录</a>

### 1.2.1. 插入并保存文档
<a href="#menu" >目录</a>

```
db.mybook.insert(book)
db.mybook.insert({"age":1})

//批量插入

db.mybook.batchInsert({"age":1},{"age":11},{"age":111})
```
如果批量插入时某一个文档失败,这个文档之前的插入都会成功,但是后续的插入会失败.

### 1.2.2. 删除文档
<a href="#menu" >目录</a>

删除数据是永久性的,不能恢复

```
//删除所有的文档,但不会删除集合
db.mybook.remove()

//根据条件删除,所有name为libai都会被删除
db.mybook.remove({"name":"libai"})

//删除集合
db.mybook.drop()

```


### 1.2.3. 更新文档
<a href="#menu" >目录</a>


## 1.3. 查询
<a href="#menu" >目录</a>

### 1.3.1. 基本的find操作
<a href="#menu" >目录</a>

find:返回所有符合的文档
fineOne:返回一个文档

```
//查询所有的文档
db.mybook.find()

//查询符合的文档
db.mybook.find({"page":100})
//多个条件
db.mybook.find({"page":100,"name":"xxx"})

//指定需要返回的键,使用第二个参数指定返回的键,但是"_id"都是一定返回的,type=1,只返回该键,type=0:除了该键都返回
db.mybook.find({},{"page":type})
```

## 1.4. 索引
<a href="#menu" >目录</a>

## 1.5. 聚合
<a href="#menu" >目录</a>

## 1.6. 复制
<a href="#menu" >目录</a>

### 副本集

副本集是一组服务器,其中一个主服务器(primary),用于处理客户端的请求.还有多个备份服务器(secondary),用于保存主服务器的数据副本,如果主服务器崩溃了,备份服务器会自动将其中一个成员升级为主服务器.


## 1.7. 分片
<a href="#menu" >目录</a>


## 应用管理
<a href="#menu" >目录</a>

**查看正在进行的操作:db.currentOp()**

```json
> db.currentOp()
{
	"inprog" : [
		{
			"type" : "op",
			"host" : "9b5700cb51ed:27017",
			"desc" : "conn13",
			"connectionId" : 13,
			"client" : "127.0.0.1:59988",
			"appName" : "MongoDB Shell",
			"clientMetadata" : {
				"application" : {
					"name" : "MongoDB Shell"
				},
				"driver" : {
					"name" : "MongoDB Internal Client",
					"version" : "4.2.0"
				},
				"os" : {
					"type" : "Linux",
					"name" : "Ubuntu",
					"architecture" : "x86_64",
					"version" : "18.04"
				}
			},
			"active" : true,
			"currentOpTime" : "2019-10-23T10:19:33.748+0000",
			"opid" : 712495,
			"lsid" : {
				"id" : UUID("f418a63c-f2f3-4f2b-8e35-947083697e42"),
				"uid" : BinData(0,"47DEQpj8HBSa+/TImW+5JCeuQeRkm5NMpJWZG3hSuFU=")
			},
			"secs_running" : NumberLong(0),
			"microsecs_running" : NumberLong(264545),
			"op" : "command",
			"ns" : "admin.$cmd.aggregate",
			"command" : {
				"currentOp" : 1,
				"lsid" : {
					"id" : UUID("f418a63c-f2f3-4f2b-8e35-947083697e42")
				},
				"$db" : "admin"
			},
			"numYields" : 0,
			"locks" : {
				
			},
			"waitingForLock" : false,
			"lockStats" : {
				
			},
			"waitingForFlowControl" : false,
			"flowControlStats" : {
				
			}
		},
		{
			"type" : "op",
			"host" : "9b5700cb51ed:27017",
			"desc" : "waitForMajority",
			"active" : true,
			"currentOpTime" : "2019-10-23T10:19:33.749+0000",
			"opid" : 2,
			"op" : "none",
			"ns" : "",
			"command" : {
				
			},
			"numYields" : 0,
			"locks" : {
				
			},
			"waitingForLock" : false,
			"lockStats" : {
				
			},
			"waitingForFlowControl" : false,
			"flowControlStats" : {
				
			}
		}
	],
	"ok" : 1
}

```

## 服务器管理
<a href="#menu" >目录</a>


## 1.8. SpringBoot中使用Mongodb
<a href="#menu" >目录</a>


### 1.8.1. 引入依赖
<a href="#menu" >目录</a>

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>
```

### 1.8.2. 配置
<a href="#menu" >目录</a>

如果mongodb端口是默认端口，并且没有设置密码，可不配置，sprinboot会开启默认的。

```yml
spring.data.mongodb.uri=mongodb://localhost:27017/test
```
如何mongodb设置了密码，这样配置：
```yml
spring.data.mongodb.uri=mongodb://zzq:123456@localhost:27017/test
```
如果多个节点集群配置
```yml
#more ip cluster  
#spring.data.mongodb.uri=mongodb://user:pwd@ip1:port1,ip2:port2/database  
```

**配置类**

```java
package org.springframework.boot.autoconfigure.mongo;

import com.mongodb.MongoClientURI;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(
    prefix = "spring.data.mongodb"
)
public class MongoProperties {
    public static final int DEFAULT_PORT = 27017;
    public static final String DEFAULT_URI = "mongodb://localhost/test";
    private String host;
    private Integer port = null;
    private String uri;
    private String database;
    private String authenticationDatabase;
    private String gridFsDatabase;
    private String username;
    private char[] password;
    private Class<?> fieldNamingStrategy;
    private Boolean autoIndexCreation;
}
```
### 1.8.3. 使用
<a href="#menu" >目录</a>

#### 1.8.3.1. 创建实体
<a href="#menu" >目录</a>

```java
//文档声明,集合名称为user
@Document(collection = "user")
public class User {

    //指定ID,用户插入时可以自行设定,不设定就是随机生成
    @Id
    private String id;

    //指定索引
    @Field("username")
    private String username;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
```

```java
public @interface Document {
    @AliasFor("collection")
    String value() default "";

    @AliasFor("value")
    String collection() default "";

    String language() default "";

    String collation() default "";
}
```

```java
public @interface Id {
}
```
```java
public @interface Field {
    @AliasFor("name")
    String value() default "";

    @AliasFor("value")
    String name() default "";

    int order() default 2147483647;

    FieldType targetType() default FieldType.IMPLICIT;
}
```

```java
public enum FieldType {
    IMPLICIT(-1, Object.class),
    DOUBLE(1, Double.class),
    STRING(2, String.class),
    ARRAY(4, Object[].class),
    BINARY(5, Binary.class),
    OBJECT_ID(7, ObjectId.class),
    BOOLEAN(8, Boolean.class),
    DATE_TIME(9, Date.class),
    PATTERN(11, Pattern.class),
    SCRIPT(13, Code.class),
    INT32(15, Integer.class),
    TIMESTAMP(16, BSONTimestamp.class),
    INT64(17, Long.class),
    DECIMAL128(18, Decimal128.class),
}
```
#### 1.8.3.2. 使用MongoTemplate方式
<a href="#menu" >目录</a>

```java
@Autowired
MongoTemplate mongotemplate;

//插入数据

User user = new User();
user.setUsername("name:"+new Random().nextInt(100));
User u = mongotemplate.insert(user);

//查找数据
ExecutableFindOperation.ExecutableFind<User> executableFind =  mongotemplate.query(User.class);
long count = executableFind.count();
log.info("count = " + count);
List<User> users =  executableFind.all();
```

shell客户端查看,可以看到数据插入成功
```
> db.mybook.find()
{ "_id" : ObjectId("5dafc885a1e7153715cc775e"), "name" : "Java" }
> db.user.find();
{ "_id" : ObjectId("5dafcfe16fff2773479b60ea"), "_class" : "com.springboot.mongo.entity.User" }
{ "_id" : ObjectId("5dafd0af1e2f206c2854a01c"), "username" : "name:45", "_class" : "com.springboot.mongo.entity.User" }
{ "_id" : ObjectId("5dafd0b31e2f206c2854a01d"), "username" : "name:94", "_class" : "com.springboot.mongo.entity.User" }

```



#### 1.8.3.3. 使用MongoRepository方式
<a href="#menu" >目录</a>

```java
@Service
public interface UserRepository extends MongoRepository<User, String> {

    public User findByName(String name);

}

```
MongoRepository
```java
public interface MongoRepository<T, ID> extends PagingAndSortingRepository<T, ID>, QueryByExampleExecutor<T> {
    <S extends T> List<S> saveAll(Iterable<S> var1);
    List<T> findAll();
    List<T> findAll(Sort var1);
    <S extends T> S insert(S var1);
    <S extends T> List<S> insert(Iterable<S> var1);
    <S extends T> List<S> findAll(Example<S> var1);
    <S extends T> List<S> findAll(Example<S> var1, Sort var2);
}
```

通过继承MongoRepository接口，我们可以非常方便地实现对一个对象的增删改查，要使用Repository的功能，先继承MongoRepository接口，其中T为仓库保存的bean类，TD为该bean的唯一标识的类型，一般为ObjectId。之后在service中注入该接口就可以使用，无需实现里面的方法，spring会根据定义的规则自动生成。

MongoRepository实现了的只是最基本的增删改查的功能，要想增加额外的查询方法，可以按照以下规则定义接口的方法。自定义查询方法，格式为“findBy+字段名+方法后缀”，方法传进的参数即字段的值，此外还支持分页查询，通过传进一个Pageable对象，返回Page集合。

下面是支持的查询类型，每三条数据分别对应：（方法后缀，方法例子，mongodb原生查询语句）

```java

GreaterThan(大于) 
findByAgeGreaterThan(int age) 
{"age" : {"$gt" : age}}

LessThan（小于） 
findByAgeLessThan(int age) 
{"age" : {"$lt" : age}}

Between（在...之间） 
findByAgeBetween(int from, int to) 
{"age" : {"$gt" : from, "$lt" : to}}

IsNotNull, NotNull（是否非空） 
findByFirstnameNotNull() 
{"age" : {"$ne" : null}}

IsNull, Null（是否为空） 
findByFirstnameNull() 
{"age" : null}

Like（模糊查询） 
findByFirstnameLike(String name) 
{"age" : age} ( age as regex)

(No keyword) findByFirstname(String name) 
{"age" : name}

Not（不包含） 
findByFirstnameNot(String name) 
{"age" : {"$ne" : name}}

Near（查询地理位置相近的） 
findByLocationNear(Point point) 
{"location" : {"$near" : [x,y]}}

Within（在地理位置范围内的） 
findByLocationWithin(Circle circle) 
{"location" : {"$within" : {"$center" : [ [x, y], distance]}}}

Within（在地理位置范围内的） 
findByLocationWithin(Box box) 
{"location" : {"$within" : {"$box" : [ [x1, y1], x2, y2]}}}
```

尽管以上查询功能已经很丰富，但如果还不能满足使用情况的话可以用一下方法---基于mongodb原本查询语句的查询方式。
例：在原接口中加入
```java
@Query("{ 'name':{'$regex':?2,'$options':'i'}, sales': {'$gte':?1,'$lte':?2}}")    
public Page<Product> findByNameAndAgeRange(String name,double ageFrom,double ageTo,Pageable page);  
```
注释Query里面的就是mongodb原来的查询语法，我们可以定义传进来的查询参数，通过坐标定义方法的参数。

还可以在后面指定要返回的数据字段，如上面的例子修改如下，则只通过person表里面的name和age字段构建person对象。 
```java
@Query(value="{ 'name':{'$regex':?2,'$options':'i'}, sales':{'$gte':?1,'$lte':?2}}",fields="{ 'name' : 1, 'age' : 1}")     
public Page<Product> findByNameAndAgeRange(String name,double ageFrom,double ageTo,Pageable page);   
```
