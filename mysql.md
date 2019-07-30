<span id="menu"></span>

# 1. MySQL
<a href="#menu" style="float:right">目录</a>

## 1.1. 基本概念
<a href="#menu" style="float:right">目录</a>

### 1.1.1. 基本概念
* 基本概念
    * 数据库: 数据库是一些关联表的集合。
    * SQL:一种结构化查询语言，专门用来和数据库进行通信的语言。
    * 数据表: 表是数据的矩阵。在一个数据库中的表看起来像一个简单的电子表格。
    * 列: 一列(数据元素) 包含了相同的数据, 例如邮政编码的数据。
    * 行：一行（=元组，或记录）是一组相关的数据，例如一条用户订阅的数据。
    * 冗余：存储两倍数据，冗余降低了性能，但提高了数据的安全性。
    * 主键：用于唯一标识表中每个行的一个或者多个列。主键是唯一的。一个数据表中只能包含一个主键。你可以使用主键来查询数据。
    * 外键：用于唯一标识其他表中每个行的一个或者多个列。外键用于关联两个表。
    * 复合键：复合键（组合键）将多个列作为一个索引键，一般用于复合索引。
    * 索引：使用索引可快速访问数据库表中的特定信息。索引是对数据库表中一列或多列的值进行排序的一种结构。类似于书籍的目录。
    * 参照完整性: 参照的完整性要求关系中不允许引用不存在的实体。与实体完整性是关系模型必须满足的完整性约束条件，目的是保证数据的一致性。
* 主键、外键
    * 不要更新主键列中的值
    * 不能重用主键列中的值
    * 不在主键列中使用可能会更改的值，比如名称。

||定义|作用|个数|
|---|---|---|---|
|主键|唯一标识一条记录，不能有重复的，不允许为空|用来保证数据完整性|主键只能有一个|
|外键|表的外键是另一表的主键, 外键可以有重复的, 可以是空值|用来和其他表建立联系用的|一个表可以有多个外键|

创建外键
```sql
FOREIGN KEY (P_Id) REFERENCES Persons(P_Id)
```


### 1.1.2. 常用工具
* workbench 跨平台可视化客户端

### 1.1.3. 逻辑架构图
<a href="#menu" style="float:right">目录</a>

![](https://github.com/lgjlife/Java-Study/blob/master/pic/mysql/mysql1.jpeg?raw=true)
![](https://github.com/lgjlife/Java-Study/blob/master/pic/mysql/mysql2.jpeg?raw=true)

* 连接--->认证---->确认可执行的权限
* MYSQL5.5及以上提供线程池插件，可以使用池中较少的线程来服务大量的连接
* MYSQL会对SQL进行相对应的优化，以提供最佳的访问性能
* 在解析查询之前，服务器会先检察查询缓存(如果开启的话)，存在缓存则直接将缓存返回客户端，更新操作将会修改缓存，缓存中没有数据，查询之后也会更新缓存。



### 1.1.4. 常用配置
<a href="#menu" style="float:right">目录</a>

## 1.2. 日志文件
<a href="#menu" style="float:right">目录</a>

### 1.2.1. 参数文件
<a href="#menu" style="float:right">目录</a>

* 告诉MYSQL实例启动时在哪里可以找到数据库文件，并且指定初始化参数，这些参数定义了某种内存结构的大小等设置，还会介绍参数的类型
也就是配置文件
```bash
lgj@lgj-Lenovo-G470:~$ mysql --help | grep my.cnf
                      order of preference, my.cnf, $MYSQL_TCP_PORT,
/etc/my.cnf /etc/mysql/my.cnf ~/.my.cnf 
```


### 1.2.2. 日志文件
<a href="#menu" style="float:right">目录</a>
* 用来记录运行时产生的日志，比如慢查询日志，二进制日志

### 1.2.3. socket文件
<a href="#menu" style="float:right">目录</a>
* 当用UNIX域套接字进行连接时需要的文件 

### 1.2.4. pid文件
<a href="#menu" style="float:right">目录</a>
* MYSQL实例的进程PID文件


### 1.2.5. MySQL表结构文件
<a href="#menu" style="float:right">目录</a>
* 表结构定义文件 

### 1.2.6. 存储引擎文件
<a href="#menu" style="float:right">目录</a>
* 存储了记录和索引等数据


## 1.3. NoSQL与关系型数据库设计理念比较　　

关系型数据库中的表都是存储一些格式化的数据结构，每个元组字段的组成都一样，即使不是每个元组都需要所有的字段，但数据库会为每个元组分配所有的字段，这样的结构可以便于表与表之间进行连接等操作，但从另一个角度来说它也是关系型数据库性能瓶颈的一个因素。而非关系型数据库以键值对存储，它的结构不固定，每一个元组可以有不一样的字段，每个元组可以根据需要增加一些自己的键值对，这样就不会局限于固定的结构，可以减少一些时间和空间的开销。

### 1.3.1. 关系型数据库
<a href="#menu" style="float:right">目录</a>
* 关系型数据库中一对多，多对一，多对多关系
    * 一对一
        * 一个学生对应一个身份证帐号
    * 一对多
        * 一个学生只有一个班级，但是一个班级有多名学生
    * 多对多
        * 一个学生可以选择多门课，一门课也可以被多个学生选

* 关系型数据库
    * 关系型数据库：指采用了关系模型来组织数据的数据库。
    关系模型指的就是二维表格模型，而一个关系型数据库就是由二维表及其之间的联系所组成的一个数据组织。
* 关系模型中常用的概念：
    * 关系：一张二维表，每个关系都具有一个关系名，也就是表名
    * 元组：二维表中的一行，在数据库中被称为记录
    * 属性：二维表中的一列，在数据库中被称为字段
    * 域：属性的取值范围，也就是数据库中某一列的取值限制
    * 关键字：一组可以唯一标识元组的属性，数据库中常称为主键，由一个或多个列组成
    * 关系模式：指对关系的描述。其格式为：关系名(属性1，属性2， ... ... ，属性N)，在数据库中成为表结构
* 关系型数据库的优点：
    * 容易理解：二维表结构是非常贴近逻辑世界的一个概念，关系模型相对网状、层次等其他模型来说更容易理解
    * 使用方便：通用的SQL语言使得操作关系型数据库非常方便
    * 易于维护：丰富的完整性(实体完整性、参照完整性和用户定义的完整性)大大减低了数据冗余和数据不一致的概率
* 关系型数据库存在的问题
    * 网站的用户并发性非常高，往往达到每秒上万次读写请求，对于传统关系型数据库来说，硬盘I/O是一个很大的瓶颈
    * 网站每天产生的数据量是巨大的，对于关系型数据库来说，在一张包含海量数据的表中查询，效率是非常低的
    * 在基于web的结构当中，数据库是最难进行横向扩展的，当一个应用系统的用户量和访问量与日俱增的时候，数据库却没有办法像web server和app server那样简单的通过添加更多的硬件和服务节点来扩展性能和负载能力。当需要对数据库系统进行升级和扩展时，往往需要停机维护和数据迁移。
    * 性能欠佳：在关系型数据库中，导致性能欠佳的最主要原因是多表的关联查询，以及复杂的数据分析类型的复杂SQL报表查询。为了保证数据库的ACID特性，必须尽量按照其要求的范式进行设计，关系型数据库中的表都是存储一个格式化的数据结构。
* 数据库事务必须具备ACID特性，ACID分别是Atomic原子性，Consistency一致性，Isolation隔离性，Durability持久性。

* 当今十大主流的关系型数据库
    * Oracle，Microsoft SQL Server，MySQL，PostgreSQL，DB2，
Microsoft Access， SQLite，Teradata，MariaDB(MySQL的一个分支)，SAP

### 1.3.2. 非关系型数据库
<a href="#menu" style="float:right">目录</a>
* 非关系型数据库：指非关系型的，分布式的，且一般不保证遵循ACID原则的数据存储系统。
* 非关系型数据库结构
    * 非关系型数据库以键值对存储，且结构不固定，每一个元组可以有不一样的字段，每个元组可以根据需要增加一些自己的键值对，不局限于固定的结构，可以减少一些时间和空间的开销。
* 优点
    * 用户可以根据需要去添加自己需要的字段，为了获取用户的不同信息，不像关系型数据库中，要对多表进行关联查询。仅需要根据id取出相应的value就可以完成查询。
    * 适用于SNS(Social Networking Services)中，例如facebook，微博。系统的升级，功能的增加，往往意味着数据结构巨大变动，这一点关系型数据库难以应付，需要新的结构化数据存储。由于不可能用一种数据结构化存储应付所有的新的需求，因此，非关系型数据库严格上不是一种数据库，应该是一种数据结构化存储方法的集合。
* 不足：
    * 只适合存储一些较为简单的数据，对于需要进行较复杂查询的数据，关系型数据库显的更为合适。不适合持久存储海量数据
* 非关系型数据库的分类
    * 非关系型数据库都是针对某些特定的应用需求出现的，因此，对于该类应用，具有极高的性能。依据结构化方法以及应用场合的不同，主要分为以下几类：
        * 面向高性能并发读写的key-value数据库：
            * key-value数据库的主要特点是具有极高的并发读写性能
            * Key-value数据库是一种以键值对存储数据的一种数据库，类似Java中的map。可以将整个数据库理解为一个大的map，每个键都会对应一个唯一的值。
            * 主流代表为Redis， Amazon DynamoDB， Memcached，Microsoft Azure Cosmos DB和Hazelcast
        * 面向海量数据访问的面向文档数据库：
            * 这类数据库的主要特点是在海量的数据中可以快速的查询数据
            * 文档存储通常使用内部表示法，可以直接在应用程序中处理，主要是JSON。JSON文档也可以作为纯文本存储在键值存储或关系数据库系统中。
            * 主流代表为MongoDB，Amazon DynamoDB，Couchbase，Microsoft Azure Cosmos DB和CouchDB
        * 面向搜索数据内容的搜索引擎：
            * 搜索引擎是专门用于搜索数据内容的NoSQL数据库管理系统。
            * 主要是用于对海量数据进行近实时的处理和分析处理，可用于机器学习和数据挖掘
            * 主流代表为Elasticsearch，Splunk，Solr，MarkLogic和Sphinx
        * 面向可扩展性的分布式数据库：
            * 这类数据库的主要特点是具有很强的可拓展性
            * 普通的关系型数据库都是以行为单位来存储数据的，擅长以行为单位的读入处理，比如特定条件数据的获取。因此，关系型数据库也被成为面向行的数据库。相反，面向列的数据库是以列为单位来存储数据的，擅长以列为单位读入数据。
            * 这类数据库想解决的问题就是传统数据库存在可扩展性上的缺陷，这类数据库可以适应数据量的增加以及数据结构的变化，将数据存储在记录中，能够容纳大量动态列。由于列名和记录键不是固定的，并且由于记录可能有数十亿列，因此可扩展性存储可以看作是二维键值存储。
            * 主流代表为Cassandra，HBase，Microsoft Azure Cosmos DB，Datastax Enterprise和Accumulo
* CAP理论
    * NoSQL的基本需求就是支持分布式存储，严格一致性与可用性需要互相取舍
    * CAP理论：一个分布式系统不可能同时满足C(一致性)、A(可用性)、P(分区容错性)三个基本需求，并且最多只能满足其中的两项。对于一个分布式系统来说，分区容错是基本需求，否则不能称之为分布式系统，因此需要在C和A之间寻求平衡
        * C(Consistency)一致性
            * 一致性是指更新操作成功并返回客户端完成后，所有节点在同一时间的数据完全一致。与ACID的C完全不同
        * A(Availability)可用性
            * 可用性是指服务一直可用，而且是正常响应时间。
        * P(Partition tolerance)分区容错性
            * 分区容错性是指分布式系统在遇到某节点或网络分区故障的时候，仍然能够对外提供满足一致性和可用性的服务。

* 关系型与非关系型数据库的比较
    * 成本
        * Nosql数据库简单易部署，基本都是开源软件，不需要像使用Oracle那样花费大量成本购买使用，相比关系型数据库价格便宜。
    * 查询速度
        * Nosql数据库将数据存储于缓存之中，而且不需要经过SQL层的解析，关系型数据库将数据存储在硬盘中，自然查询速度远不及Nosql数据库。
    * 存储数据的格式
        * Nosql的存储格式是key,value形式、文档形式、图片形式等等，所以可以存储基础类型以及对象或者是集合等各种格式，而数据库则只支持基础类型。
    * 扩展性
        * 关系型数据库有类似join这样的多表查询机制的限制导致扩展很艰难。Nosql基于键值对，数据之间没有耦合性，所以非常容易水平扩展。
    * 持久存储
        * Nosql不使用于持久存储，海量数据的持久存储，还是需要关系型数据库
    * 数据一致性 
        * 非关系型数据库一般强调的是数据最终一致性，不像关系型数据库一样强调数据的强一致性，从非关系型数据库中读到的有可能还是处于一个中间态的数据，Nosql不提供对事务的处理。






## 1.4. 使用数据库
<a href="#menu" style="float:right">目录</a>

* 启停数据库
    * service mysql start|stop|restart
* 连接数据库
    * mysql  -h 127.0.0.1 -P 3349 -u root -p 123456
    * mysql  -h127.0.0.1 -P3349 -uroot -p123456
* 查看mysql支持的存储引擎
    * show engines

* 创建数据库
    * create database database_name
* 查看数据库
    * show databases
* 删除数据库
    * drop database database_name
* 选择数据库据
    * use database_name
* 查看数据表
    * show tables
* 查看数据表结构
    * show columns from table_name
    * desc table_name
* 创建表
    * 设置默认值: default xxx
    * 不能为NULL: NOT NULL,默认为NULL
    * 注释: COMMENT "XXXX" 
```sql
DROP TABLE IF EXISTS `relation`;
CREATE TABLE `relation`(
   `id` BIGINT   AUTO_INCREMENT COMMENT "ID",
   `followerId` BIGINT   COMMENT "关注者ID",
   `followeeId` BIGINT   COMMENT "被关注者ID",
    PRIMARY KEY (`id`),
    index(`followerId`),
    index(`followeeId`),
    index(`followerId`,`followeeId`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT="关系表";
```

* 插入数据
    * insert into table_name (xx,xx) value|values(xx,xx),(xx,xx),(xx,xx);

* 查看指令的功能
    * help command
    * help create table

* 修改表结构
    * ALTER TABLE tbl_name
    [alter_specification [, alter_specification] ...]
    [partition_options]

* 删除表
    * drop table table_name
* 删除表中数据
    * delete from table_name where xx=xxx
* 查看支持字符集
    * show character set



## 1.5. 数据类型
<a href="#menu" style="float:right">目录</a>
**整形数据类型**

|数据类型|取值范围|说明|单位|
|---|---|---|---|
|TINYINT|符号值 -128～127,无符号0～255|最小的整数|1字节|
|BIT|符号值 -128～127,无符号0～255|最小的整数|1字节|
|BOOL|符号值 -128～127,无符号0～255|最小的整数|1字节|
|SMALLINT|符号值 -32768～32767,无符号0～65535|小型整数|2字节|
|MEDIUMINT|符号值 -8388608～8388607,无符号0～16777215|中型整数|3字节|
|INT|符号值 -2147683648～2147683647,无符号0～4294967295|标准整数|4字节|
|BIGINT||大型整数|8字节|
* INT(10) 并不是限制其大小，大小都是4字节，唯一不同的是在某些条件下显示的位数不同，不足的补0。比如int(5)--显示-->00023
* 应当选择满足要求的数据类型，比如一个字段年龄最大为120，就没不要使用int类型.

**浮点型数据类型**
|数据类型|取值范围|说明|单位|
|---|---|---|---|
|FLOAT|（+-）3.4E38|单精度浮点数|8或4字节|
|DOUBLE|（+-）1.79E38，（+-）2.22E308||双精度浮点数|8字节|
|DECIMAL|可变|一般整数|自定义长度|


**常规字符串类型**
|数据类型|取值范围|说明|单位|
|---|---|---|---|
|char|0~255个字符|定长，效率高，一般用于固定长度的表单提交数据存储,例如：身份证号，手机号，电话，密码等||
|varchar|0～65535个字符|长度可变||

**text和blog**
|数据类型|取值范围|说明
|---|---|---|
|TINYBLOG|255||
|TINYTEXT|255||
|BLOG|65535||
|TEXT|65535||
|MEDIUMBLOG|16777215||
|MEDIUMTEXT|16777215||
|LONGBLOG|4294967295||
|LONGTEXT|4294967295||

**ENUM,SET**
|数据类型|取值范围|说明
|---|---|---|
|Enum("1","2")|||
|Set("1","2")|||

* 从速度方面考虑，要选择固定的列，CHAR
* 要节省空间，使用VARCHAR
* 要将列内容限制在某些选择中，ENUM
* 要使某些列是一系列的值，使用 set
* 要搜索的内容区分大小写，text
* 要搜索的内容不区分大小写，blog



**日期和时间类型**
|数据类型|取值范围|说明|
|---|---|---|
|DATE|1000-01-01 999-12-31|日期，YYYY-MM-DD|
|TIME|-383：58：59  835：59：59|时间，HH-MM-SS|
|DATETIME|1000-01-01 00：00：00 - 9999-12-31 23：59：59|日期和时间|
|TIMESTAMP|1970-01-01 00：00：00 - 2037 的时间戳||
|YEAR|1901-2155|年份可以指定两位数字和四位数字的格式|

char：定长，效率高，一般用于固定长度的表单提交数据存储  ；例如：身份证号，手机号，电话，密码等

varchar：不定长，效率偏低

1、varchar类型的变化
MySQL 数据库的varchar类型在4.1以下的版本中的最大长度限制为255，其数据范围可以是0~255或1~255（根据不同版本数据库来定）。在 MySQL5.0以上的版本中，varchar数据类型的长度支持到了65535，也就是说可以存放65532个字节的数据，起始位和结束位占去了3个字 节，也就是说，在4.1或以下版本中需要使用固定的TEXT或BLOB格式存放的数据可以使用可变长的varchar来存放，这样就能有效的减少数据库文 件的大小。

MySQL 数据库的varchar类型在4.1以下的版本中,nvarchar（存储的是Unicode数据类型的字符）不管是一个字符还是一个汉字,都存为2个字 节 ，一般用作中文或者其他语言输入，这样不容易乱码 ;varchar: 汉字是2个字节,其他字符存为1个字节 ，varchar适合输入英文和数字。

4.0版本以下，varchar(20)，指的是20字节，如果存放UTF8汉字时，只能存6个（每个汉字3字节） ；5.0版本以上，varchar(20)，指的是20字符，无论存放的是数字、字母还是UTF8汉字（每个汉字3字节），都可以存放20个，最大大小是 65532字节 ；varchar(20)在Mysql4中最大也不过是20个字节,但是Mysql5根据编码不同,存储大小也不同，具体有以下规则：

a) 存储限制

varchar 字段是将实际内容单独存储在聚簇索引之外，内容开头用1到2个字节表示实际长度（长度超过255时需要2个字节），因此最大长度不能超过65535。

b) 编码长度限制

字符类型若为gbk，每个字符最多占2个字节，最大长度不能超过32766;

字符类型若为utf8，每个字符最多占3个字节，最大长度不能超过21845。

若定义的时候超过上述限制，则varchar字段会被强行转为text类型，并产生warning。

c) 行长度限制

导致实际应用中varchar长度限制的是一个行定义的长度。 MySQL要求一个行的定义长度不能超过65535。若定义的表长度超过这个值，则提示

ERROR 1118 (42000): Row size too large. The maximum row size for the used table type, not counting BLOBs, is 65535. You have to change some columns to TEXT or BLOBs。

2、CHAR(M), VARCHAR(M)不同之处
CHAR(M)定义的列的长度为固定的，M取值可以为0～255之间，当保存CHAR值时，在它们的右边填充空格以达到指定的长度。当检 索到CHAR值时，尾部的空格被删除掉。在存储或检索过程中不进行大小写转换。CHAR存储定长数据很方便，CHAR字段上的索引效率级高，比如定义 char(10)，那么不论你存储的数据是否达到了10个字节，都要占去10个字节的空间,不足的自动用空格填充。

VARCHAR(M)定义的列的长度为可变长字符串，M取值可以为0~65535之间，(VARCHAR的最大有效长度由最大行大小和使用 的字符集确定。整体最大长度是65,532字节）。VARCHAR值保存时只保存需要的字符数，另加一个字节来记录长度(如果列声明的长度超过255，则 使用两个字节)。VARCHAR值保存时不进行填充。当值保存和检索时尾部的空格仍保留，符合标准SQL。varchar存储变长数据，但存储效率没有 CHAR高。如果一个字段可能的值是不固定长度的，我们只知道它不可能超过10个字符，把它定义为 VARCHAR(10)是最合算的。VARCHAR类型的实际长度是它的值的实际长度+1。为什么”+1″呢？这一个字节用于保存实际使用了多大的长度。 从空间上考虑，用varchar合适；从效率上考虑，用char合适，关键是根据实际情况找到权衡点。

CHAR和VARCHAR最大的不同就是一个是固定长度，一个是可变长度。由于是可变长度，因此实际存储的时候是实际字符串再加上一个记录 字符串长度的字节(如果超过255则需要两个字节)。如果分配给CHAR或VARCHAR列的值超过列的最大长度，则对值进行裁剪以使其适合。如果被裁掉 的字符不是空格，则会产生一条警告。如果裁剪非空格字符，则会造成错误(而不是警告)并通过使用严格SQL模式禁用值的插入。

3、VARCHAR和TEXT、BlOB类型的区别
VARCHAR，BLOB和TEXT类型是变长类型，对于其存储需求取决于列值的实际长度(在前面的表格中用L表示)，而不是取决于类型 的最大可能尺寸。例如，一个VARCHAR(10)列能保存最大长度为10个字符的一个字符串，实际的存储需要是字符串的长度 ，加上1个字节以记录字符串的长度。对于字符串’abcd’，L是4而存储要求是5个字节。

BLOB和TEXT类型需要1，2，3或4个字节来记录列值的长度，这取决于类型的最大可能长度。VARCHAR需要定义大小，有65535字节的最大限制；TEXT则不需要。如果你把一个超过列类型最大长度的值赋给一个BLOB或TEXT列，值被截断以适合它。

一个BLOB是一个能保存可变数量的数据的二进制的大对象。4个BLOB类型TINYBLOB、BLOB、MEDIUMBLOB和LONGBLOB仅仅在他们能保存值的最大长度方面有所不同。

BLOB 可以储存图片，TEXT不行，TEXT只能储存纯文本文件。4个TEXT类型TINYTEXT、TEXT、MEDIUMTEXT和LONGTEXT对应于 4个BLOB类型，并且有同样的最大长度和存储需求。在BLOB和TEXT类型之间的唯一差别是对BLOB值的排序和比较以大小写敏感方式执行，而对 TEXT值是大小写不敏感的。换句话说，一个TEXT是一个大小写不敏感的BLOB。

4、总结char，varchar和text的区别
长度的区别，char范围是0～255，varchar最长是64k，但是注意这里的64k是整个row的长度，要考虑到其它的 column，还有如果存在not null的时候也会占用一位，对不同的字符集，有效长度还不一样，比如utf8的，最多21845，还要除去别的column，但是varchar在一般 情况下存储都够用了。如果遇到了大文本，考虑使用text，最大能到4G。

效率来说基本是char>varchar>text，但是如果使用的是Innodb引擎的话，推荐使用varchar代替char。

char和varchar可以有默认值，text不能指定默认值。

数据库选择合适的数据类型存储还是很有必要的，对性能有一定影响。这里在零碎记录两笔，对于int类型的，如果不需要存取负值，最好加上unsigned；对于经常出现在where语句中的字段，考虑加索引，整形的尤其适合加索引

## 1.6. 数据更新

```sql
//插入单条数据
insert into table_name(xx,xx) value|values (xxx,xxx)
//插入多条数据
insert into table_name(xx,xx) value|values (xxx,xxx), (xxx,xxx), (xxx,xxx)
//更新数据
update table_name
    set xxx=xxx
        where xx=xx
//删除数据
delete from table_name where xx=xx
```


## 1.7. 查询入门
<a href="#menu" style="float:right">目录</a>

* select 基本语法
```sql
select * 
from table_name
where xx=xxx
group by column
order by column
having  xxx 
limit start,count 
```
* 比较运算法

|运算符|名称|示例|运算符|名称|示例|
|---|---|---|---|---|---|
|=|等于|i=5|is not null||id is not null|
|>|大于|id>5|between|范围| id between 5 and 15|
|<|小于| id < 5|in |在集合里|id in (2,3,4)|
|=>|大于等于|id => 5|Not in |||
|<=|小于等于| id<=5|Like|字符串匹配,"%"多个字符，"_"单个字符| name like "%a%"|
|!= 或者<>|不等于|id != 5|Not Like|||
|is null|空值|id is null|Regexp|正则表达式||

* 多条件查询 and  /  or

* from
    * 永久表
    * 临时表
    * 虚拟表(视图)
    * 子查询产生的表
        * select e.xxx from table_name from (select xxx from table_name from xxx ) e;

* 表的别名
    * from  user as u
    * from user u
* select 
    * select column1,colums2   获取特定的列
    * select *    获取所有的列
    * select table_name.column  获取 表名.列名
    * select u.name 获取 别名.列名
    * select column as new_name  使用别名

* 去除重复的行
    * age 的值有 1,2,3,4,4,4,5
    * select age from user , 会存在重复的age -> 1,2,3,4,4,4,5
    * select distinct age from user,去除重复的数据 -> 1,2,3,4,5

* From
    * from table1  从单表中查询
    * from table1 and table2
    * select e.xxx from (select * from user) e  从子查询中查 
    * select xxx from view_name 从视图中查询
* group by 分组
    * 非 group by 的字段需要使用聚合函数进行聚合

* having 过滤掉不需要的组
    * select age SUM(name) AS NAME 
        FROM xxx
        GROUP age
        HAVING SUM(name) > 10
        ORDER BY(xxx);
* order by 
    * 用于排序,默认为升序
    * order by xxx desc 降序
    * 升序: asc 默认值
    * 降序: desc
* 使用时遵循的顺序
    * SELECT-->FROM-->WHERE-->GROUP BY-->HAVING-->ORDER BY-->LIMIT


## 1.8. 多表连接查询
<a href="#menu" style="float:right">目录</a>

* 迪卡尔积
```sql
select * from table1 JOIN table2';
```
只将将两表关联查询，没有判断条件，查询结果的条数为两表的数据记录之积。实际应用基本不用。

连接是把不同表的记录连接到一起最普遍的方法。 
本文将使用实例测试各个不同连接情况的查询。

创建两个数据表stu_info(学生信息表)和stu_score(学生成绩表)。 
如下图所示： 
 ![](https://img-blog.csdn.net/20180315123052801?watermark/2/text/Ly9ibG9nLmNzZG4ubmV0L3UwMTE2NzYzMDA=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
 ![](https://img-blog.csdn.net/20180315123059458?watermark/2/text/Ly9ibG9nLmNzZG4ubmV0L3UwMTE2NzYzMDA=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)


一.内连接查询 
内连接是最普遍的连接类型，而且是最匀称的。因为他们们要求构成链接的每一部分的每一个表匹配，不匹配的行将会被排除。

**内连接相等查询** 
概述：指使用等号”=”比较两个表的连接列的值，相当于两表执行笛卡尔后，取两表连结列值相等的记录。
```sql
 select * from stu_info A inner join stu_score  B where A.id=B.id;
```
可以看到，结果集只包含参与连接的表中与指定字段相符的行。 
![](https://img-blog.csdn.net/2018031512344414?watermark/2/text/Ly9ibG9nLmNzZG4ubmV0L3UwMTE2NzYzMDA=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

**内连接非等值连接**

概述：指使用大于号”>”或小于号”<”比较两个表的连接列的值，相当于两表执行笛卡尔后，取一个表大于或小于另一个表的连结列值的记录。
```sql
select * from stu_info A inner join stu_score  B where A.id>B.id;
```
![](https://img-blog.csdn.net/20180315123808798?watermark/2/text/Ly9ibG9nLmNzZG4ubmV0L3UwMTE2NzYzMDA=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

二.外连接查询 
外连接是指使用OUTER JOIN关键字将两个表连接起来，外连接生成的结果集不仅包含符合连接条件的数据，而且还包含左表（左外连接时的表），右表（右外连接时的表）或两边连接表（全外连接时的表）

MySql没有全连接。

语法格式
```sql
SELECT 字段名称 FROM 表1 LEFT|RIGHT JOIN 表2  ON 表1.字段=表2.字段
```
**左外连接** 
右表未包含在内的部分用NULL表示
如果没有指定连接类型，默认为左外连接
```sql
select * from stu_score A left join stu_info  B on A.id=B.id;
```
 ![](https://img-blog.csdn.net/20180315124635661?watermark/2/text/Ly9ibG9nLmNzZG4ubmV0L3UwMTE2NzYzMDA=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

**右外连接**

```sql
select * from stu_info A right join stu_score  B on A.id=B.id;
```
![](https://img-blog.csdn.net/20180315124705297?watermark/2/text/Ly9ibG9nLmNzZG4ubmV0L3UwMTE2NzYzMDA=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

**多表连接**
```sql
select * from stu_info A right join stu_score  B on A.id=B.id left join xxx on xxx=xx;
```

## 1.9. 函数
<a href="#menu" style="float:right">目录</a>

### 1.9.1. 聚集函数
* 运行在行祖上，计算和返回单个值的函数
* avg
* count
    * count(*) 包括NULL值
    * count(1) 和count(*)一样
    * count(column) 忽略null值
    * 在表没有主键时，count(1)比count(*)快；
    * 有主键时，主键作为计算条件，count(主键)效率最高；
    * 若表格只有一个字段，则count(*)效率较高。
* max
* min
* sum

### 1.9.2. 数学函数
* ABS(x)
    * 返回x的绝对值
* PI()
    * 返回圆周率π，默认显示6位小数
* SQRT(x)
    * 返回非负数的x的二次方根
* MOD(x,y)
    * 返回x被y除后的余数
* CEIL(x)、CEILING(x)
    * 返回不小于x的最小整数
* FLOOR(x)
    * 返回不大于x的最大整数
* ROUND(x)、ROUND(x,y)
    * 前者返回最接近于x的整数，即对x进行四舍五入；后者返回最接近x的数，其值保留到小数点后面y位，若y为负值，则将保留到x到小数点左边y位
* SIGN(x)
    * 返回参数x的符号，-1表示负数，0表示0，1表示正数
* POW(x,y)和、POWER(x,y)
    * 返回x的y次乘方的值
* EXP(x)
    * 返回e的x乘方后的值
* LOG(x)
    * 返回x的自然对数，x相对于基数e的对数
* LOG10(x)
    * 返回x的基数为10的对数
* RADIANS(x)
    * 返回x由角度转化为弧度的值
* DEGREES(x)
    * 返回x由弧度转化为角度的值
* SIN(x)、ASIN(x)
    * 前者返回x的正弦，其中x为给定的弧度值；后者返回x的反正弦值，x为正弦
* COS(x)、ACOS(x)
    * 前者返回x的余弦，其中x为给定的弧度值；后者返回x的反余弦值，x为余弦
* TAN(x)、ATAN(x)
    * 前者返回x的正切，其中x为给定的弧度值；后者返回x的反正切值，x为正切
* COT(x)
    * 返回给定弧度值x的余切

### 1.9.3. 字符串函数
* CHAR_LENGTH(str)
    * 计算字符串字符个数
* CONCAT(s1,s2，...)
    * 返回连接参数产生的字符串，一个或多个待拼接的内容，任意一个为NULL则返回值为NULL
* CONCAT_WS(x,s1,s2,...)
    * 返回多个字符串拼接之后的字符串，每个字符串之间有一个x
* INSERT(s1,x,len,s2)
    * 返回字符串s1，其子字符串起始于位置x，被字符串s2取代len个字符
* LOWER(str)和LCASE(str)、UPPER(str)和UCASE(str)
    * 前两者将str中的字母全部转换成小写，后两者将字符串中的字母全部转换成大写
* LEFT(s,n)、RIGHT(s,n)
    * 前者返回字符串s从最左边开始的n个字符，后者返回字符串s从最右边开始的n个字符
* LPAD(s1,len,s2)、RPAD(s1,len,s2)
    * 前者返回s1，其左边由字符串s2填补到len字符长度，假如s1的长度大于len，则返回值被缩短至len字符；前者返回s1，其右边由字符串s2填补到len字符长度，假如s1的长度大于len，则返回值被缩短至len字符
* LTRIM(s)、RTRIM(s)
    * 前者返回字符串s，其左边所有空格被删除；后者返回字符串s，其右边所有空格被删除
* TRIM(s)
    * 返回字符串s删除了两边空格之后的字符串
* TRIM(s1 FROM s)
    * 删除字符串s两端所有子字符串s1，未指定s1的情况下则默认删除空格
* REPEAT(s,n)
    * 返回一个由重复字符串s组成的字符串，字符串s的数目等于n
* SPACE(n)
    * 返回一个由n个空格组成的字符串
* REPLACE(s,s1,s2)
    * 返回一个字符串，用字符串s2替代字符串s中所有的字符串s1
* STRCMP(s1,s2)
    * 若s1和s2中所有的字符串都相同，则返回0；根据当前分类次序，第一个参数小于第二个则返回-1，其他情况返回1
* SUBSTRING(s,n,len)、MID(s,n,len)
    * 两个函数作用相同，从字符串s中返回一个第n个字符开始、长度为len的字符串
* LOCATE(str1,str)、POSITION(str1 IN str)、INSTR(str,str1)
    * 三个函数作用相同，返回子字符串str1在字符串str中的开始位置（从第几个字符开始）
* REVERSE(s)
    * 将字符串s反转
* ELT(N,str1,str2,str3,str4,...)
    * 返回第N个字符串

 
### 1.9.4. 日期和时间函数
* CURDATE()、CURRENT_DATE()
    * 将当前日期按照"YYYY-MM-DD"或者"YYYYMMDD"格式的值返回，具体格式根据函数用在字符串或是数字语境中而定
* CURRENT_TIMESTAMP()、LOCALTIME()、NOW()、SYSDATE()
    * 这四个函数作用相同，返回当前日期和时间值，格式为"YYYY_MM-DD HH:MM:SS"或"YYYYMMDDHHMMSS"，具体格式根据函数用在字符串或数字语境中而定
* UNIX_TIMESTAMP()、UNIX_TIMESTAMP(date)
    * 前者返回一个格林尼治标准时间1970-01-01 00:00:00到现在的秒数，后者返回一个格林尼治标准时间1970-01-01 00:00:00到指定时间的秒数
* FROM_UNIXTIME(date)
    * 和UNIX_TIMESTAMP互为反函数，把UNIX时间戳转换为普通格式的时间
* UTC_DATE()和UTC_TIME()
    * 前者返回当前UTC（世界标准时间）日期值，其格式为"YYYY-MM-DD"或"YYYYMMDD"，后者返回当前UTC时间值，其格式为"YYYY-MM-DD"或"YYYYMMDD"。具体使用哪种取决于函数用在字符串还是数字语境中
* MONTH(date)和MONTHNAME(date)
    * 前者返回指定日期中的月份，后者返回指定日期中的月份的名称
* DAYNAME(d)、DAYOFWEEK(d)、WEEKDAY(d)
    * DAYNAME(d)返回d对应的工作日的英文名称，如Sunday、Monday等；DAYOFWEEK(d)返回的对应一周中的索引，1表示周日、2表示周一；WEEKDAY(d)表示d对应的工作日索引，0表示周一，1表示周二
* WEEK(d)、WEEKOFYEAD(d)
    * 前者计算日期d是一年中的第几周，后者计算某一天位于一年中的第几周
* DAYOFYEAR(d)、DAYOFMONTH(d)
    * 前者返回d是一年中的第几天，后者返回d是一月中的第几天
* YEAR(date)、QUARTER(date)、MINUTE(time)、SECOND(time)
    * YEAR(date)返回指定日期对应的年份，范围是1970~2069；QUARTER(date)返回date对应一年中的季度，范围是1~4；MINUTE(time)返回time对应的分钟数，范围是0~59；SECOND(time)返回制定时间的秒值
* EXTRACE(type FROM date)
    * 从日期中提取一部分，type可以是YEAR、YEAR_MONTH、DAY_HOUR、DAY_MICROSECOND、DAY_MINUTE、DAY_SECOND
* TIME_TO_SEC(time)
    * 返回以转换为秒的time参数，转换公式为"3600*小时 + 60*分钟 + 秒"
* SEC_TO_TIME()
    * 和TIME_TO_SEC(time)互为反函数，将秒值转换为时间格式
* DATE_ADD(date,INTERVAL expr type)、ADD_DATE(date,INTERVAL expr type)
    * 返回将起始时间加上expr type之后的时间，比如DATE_ADD('2010-12-31 23:59:59', INTERVAL 1 SECOND)表示的就是把第一个时间加1秒
* DATE_SUB(date,INTERVAL expr type)、SUBDATE(date,INTERVAL expr type)
    * 返回将起始时间减去expr type之后的时间
* ADDTIME(date,expr)、SUBTIME(date,expr)
    * 前者进行date的时间加操作，后者进行date的时间减操作

### 1.9.5. 条件判断函数

* IF(expr,v1,v2)
    * 如果expr是TRUE则返回v1，否则返回v2
* IFNULL(v1,v2)
    * 如果v1不为NULL，则返回v1，否则返回v2
* CASE expr WHEN v1 THEN r1 [WHEN v2 THEN v2] [ELSE rn] END
    * 如果expr等于某个vn，则返回对应位置THEN后面的结果，如果与所有值都不想等，则返回ELSE后面的rn
 

### 1.9.6. 系统信息函数

* VERSION()
    * 查看MySQL版本号
* CONNECTION_ID()
    * 查看当前用户的连接数
* USER()、CURRENT_USER()、SYSTEM_USER()、SESSION_USER()
    * 查看当前被MySQL服务器验证的用户名和主机的组合，一般这几个函数的返回值是相同的
* CHARSET(str)
    * 查看字符串str使用的字符集
* COLLATION()
    * 查看字符串排列方式

 

### 1.9.7. 加密函数

* PASSWORD(str)
    * 从原明文密码str计算并返回加密后的字符串密码，注意这个函数的加密是单向的（不可逆），因此不应将它应用在个人的应用程序中而应该只在MySQL服务器的鉴定系统中使用
* MD5(str)
    * 为字符串算出一个MD5 128比特校验和，改值以32位十六进制数字的二进制字符串形式返回
* ENCODE(str, pswd_str)
    * 使用pswd_str作为密码，加密str
* DECODE(crypt_str,pswd_str)
    * 使用pswd_str作为密码，解密加密字符串crypt_str，crypt_str是由ENCODE函数返回的字符串
### 1.9.8. 其他函数
* FORMAT(x,n)
    * 将数字x格式化，并以四舍五入的方式保留小数点后n位，结果以字符串形式返回
* CONV(N,from_base,to_base)
    * 不同进制数之间的转换，返回值为数值N的字符串表示，由from_base进制转换为to_base进制
* INET_ATON(expr)
    * 给出一个作为字符串的网络地址的点地址表示，返回一个代表该地址数值的整数，地址可以使4或8比特
* INET_NTOA(expr)
    * 给定一个数字网络地址（4或8比特），返回作为字符串的该地址的点地址表示
* BENCHMARK(count,expr)
    * 重复执行count次表达式expr，它可以用于计算MySQL处理表达式的速度，结果值通常是0（0只是表示很快，并不是没有速度）。另一个作用是用它在MySQL客户端内部报告语句执行的时间
* CONVERT(str USING charset)
    * 使用字符集charset表示字符串str


## 1.10. 存储过程
<a href="#menu" style="float:right">目录</a>

### 1.10.1. 基本概念
* 存储过程
    * 将多条SQL语句进行封装，类似于函数。有输入和输出。
* 为什么使用
    * 通过把处理封装在容易使用的单元中，简化复杂的操作（正如前面例子所述）。
    * 由于不要求反复建立一系列处理步骤，这保证了数据的完整性。如果所有开发人员和应用程序都使用同一（试验和测试）存储过程，则所使用的代码都是相同的。这一点的延伸就是防止错误。需要执行的步骤越多，出错的可能性就越大。防止错误保证了数据的一致性。
    * 简化对变动的管理。如果表名、列名或业务逻辑（或别的内容）有变化，只需要更改存储过程的代码。使用它的人员甚至不需要知道这些变化
    * 提高性能。因为使用存储过程比使用单独的SQL语句要快。
    * 存在一些只能用在单个请求中的MySQL元素和特性，存储过程可以使用它们来编写功能更强更灵活的代码
* 缺点
    * 一般来说，存储过程的编写比基本SQL语句复杂，编写存储过程需要更高的技能，更丰富的经验。
    * 你可能没有创建存储过程的安全访问权限。许多数据库管理员限制存储过程的创建权限，允许用户使用存储过程，但不允许他们创建存储过程。

### 1.10.2. 使用存储过程


## 1.11. 视图
<a href="#menu" style="float:right">目录</a>

### 1.11.1. 基本概念

* 视图是虚拟的表，视图本身不包含数据，原始表数据更改，视图查询将会返回最新的数据
* 使用视图的原因
    * 重用SQL语句
    * 简化复杂的SQL操作，在编写查询后，可以重用它不必知道它的基本查询细节
    * 使用表的部分字段，而不是全表字段，对关键字段进行隐藏，比如密码
    * 保护数据。可以给用户授予表的特定部分的访问权限而不是整个表的访问权限
    * 更改数据格式和表示。视图可返回与底层表的表示和格式不同的数据
* 对视图的操作和普通表的操作一致
* 对视图的操作将会执行视图构成相关的查询语句，因此创建视图的查询语句复杂，比如多表关联，那么查询的性能也会相对降低，因为视图本身不包含数据。
* 视图的规则和限制
    * 与表一样，视图必须唯一命名（不能给视图取与别的视图或表相同的名字）。
    * 对于可以创建的视图数目没有限制。
    * 为了创建视图，必须具有足够的访问权限。这些限制通常由数据库管理人员授予。
    * 视图可以嵌套，即可以利用从其他视图中检索数据的查询来构造一个视图。
    * ORDER BY可以用在视图中，但如果从该视图检索数据SELECT中也含有ORDER BY，那么该视图中的ORDER BY将被覆盖。
    * 视图不能索引，也不能有关联的触发器或默认值。
    * 视图可以和表一起使用。例如，编写一条联结表和视图的SELECT语句
* 视图相关操作
    * 创建视图:CREATE VIEW veiew_name AS select xxx
    * 使用SHOW CREATE VIEW viewname；来查看创建视图的语句。
    * 用DROP删除视图，其语法为DROP VIEW viewname;。
    * 更新视图时，可以先用DROP再用CREATE，也可以直接用CREATE ORREPLACE VIEW。如果要更新的视图不存在，则第2条更新语句会创建一个视图；如果要更新的视图存在，则第2条更新语句会替换原有视图。

## 1.12. 触发器
<a href="#menu" style="float:right">目录</a>

### 1.12.1. 基本概念
* 触发器
    * 用于在对表进行修改（DELETE，UPDATE，INSERT）时触发其他操作。
    * 仅支持表，不支持视图
    * 每个表仅支持6个触发器，DELETE，INSERT或UPDATE之前或者之后。
    * 可以使用BEGIN和END来标识触发器触发之后的语句
    * 不支持存储过程调用
```SQL
CREATE TRIGGER tri_name AFTER|BEFORE 
INSERT|DELETE|UPDATE ON table_name
FOR EACH ROW 
BEGIN
    SELECT NEW.order_num;
END;
```
* 应用场景
    * 在删除表数据时，将删除的数据存入其他表
    * 保证数据的一致性
### 1.12.2. 触发器操作
* 在创建触发器时，需要给出4条信息：
    * 唯一的触发器名(表中唯一，不同的关联表可以有相同名称的触发器)；
    * 触发器关联的表；
    * 触发器应该响应的活动（DELETE，INSERT或UPDATE）；
    * 触发器何时执行（处理之前或之后）

**创建触发器**
* INSERT
    * 在INSERT触发器代码内，可引用一个名为NEW的虚拟表，访问被插入的行；
    * 在BEFORE INSERT触发器中， NEW中的值也可以被更新（允许更改被插入的值）；
    * 对于AUTO_INCREMENT列， NEW在INSERT执行之前包含0，在INSERT执行之后包含新的自动生成值
```SQL
CREATE TRIGGER tri_name AFTER INSERT ON order
FOR EACH ROW SELECT NEW.order_num;
```

* DELETE
    * 在DELETE触发器代码内，你可以引用一个名为OLD的虚拟表，访问被删除的行；
    * OLD中的值全都是只读的，不能更新

* UPDATE
    *  在UPDATE触发器代码中，你可以引用一个名为OLD的虚拟表访问以前（ UPDATE语句前）的值，引用一个名为NEW的虚拟表访问新更新的值；
    * 在BEFORE UPDATE触发器中， NEW中的值可能也被更新（允许更改将要用于UPDATE语句中的值）；
    * OLD中的值全都是只读的，不能更新。


## 1.13. 事务
<a href="#menu" style="float:right">目录</a>

### 1.13.1. 基本概念

#### 1.13.1.1. 事务特点
* 事务:
    * 数据库事务是指作为单个逻辑工作单元执行的一系列操作（SQL语句）。这些操作要么全部执行，要么全部不执行
* 四个特征 ACID 特性。 
    * 原子性 Atomicity 
        * 事务是数据库的逻辑工作单位，事务中包含的各操作要么都做，要么都不做 
    * 一致性 Consistency
        * 事务执行的结果必须是使数据库从一个一致性状态变到另一个一致性状态。因此当数据库只包含成功事务提交的结果时，就说数据库处于一致性状态。如果数据库系统 运行中发生故障，有些事务尚未完成就被迫中断，这些未完成事务对数据库所做的修改有一部分已写入物理数据库，这时数据库就处于一种不正确的状态，或者说是 不一致的状态。 
    * 隔离性 Isolation
        * 一个事务的执行不能其它事务干扰。即一个事务内部的操作及使用的数据对其它并发事务是隔离的，并发执行的各个事务之间不能互相干扰。 
    * 持续性 Durability
        * 也称永久性，指一个事务一旦提交，它对数据库中的数据的改变就应该是永久性的。接下来的其它操作或故障不应该对其执行结果有任何影响。
* 数据并发问题
    * 脏读
        * A事务读到B事务还未提交的更改数据，并且在这个基础上进行操作，如果B事务进行回滚，那么将会出现脏读问题。
    * 不可重复读
        * A事务先开启，第一次读取，B事务开启，B事务修改数据，B事务结束提交，第二次读取，两次读取的数据不一致。
        * A事务多次读取，读取到的数据不一致。也就是读取到别人已经提交的数据。
    * 幻象读
        * A事务读取到B事务新增的数据。
        * 幻象读侧重新增数据，不可重复读侧重已有数据被修改。
        * 因此解决幻象读使用表级锁，不可重复读使用行级锁即可。
    * 第一类丢失更新
        * A事务开始-->查询余额为100-->B事务开始-->B事务修改余额为1000-->B事务提交--->A事务撤销--->余额被撤销到100
        * A事务撤销，把已经提交的B事务数据给覆盖了        
    * 第二类丢失更新
        * A事务开始-->查询余额为100-->B事务开始-->B事务修改余额为1000-->B事务提交--->A事务修改余额为200并提交--->余额为200
        * A事务提交覆盖B事务的提交

* 事务隔离级别
    * InnoDB使用MVCC多版本控制来解决幻读问题
    * MySQL默认的隔离级别是，MySQL默认
    * SERIALIZABLE会给每一行数据上加锁，可能导致大量的锁争用和锁超时。实际应用中很少使用。

|隔离级别|脏读|不可重复读|幻象读|第一类丢失更新|第二类丢失更新|
|---|---|---|---|---|---|
|READ UNCOMMITED|出现|出现|出现|不出现|出现|
|READ UNCOMMITED|不出现|出现|出现|不出现|出现|
|REPEATABLE READ|不出现|不出现|出现|不出现|不出现|
|SERIALIZABLE|不出现|不出现|不出现|不出现|不出现|

* 如果事务操作中包括事务型(InnoDB)的表和非事务型(MyISAM)的表，回滚时非事务型的表将不会回滚，使用时要注意，尽量不要混合使用。
* 对非事务型的表进行事务操作，不会有错误提示。但是回滚无效。

#### 1.13.1.2. 锁
* 共享锁(shared lock)和排他锁(exclusive lock)
    * 读锁是共享的，可以多个线程同时读取相同的数据
    * 写锁是排他锁，任意时刻只能由一个线程操作同一个数据，否则将出现并发问题.获取到写锁时，其他线程禁止读写。
    * 根据SQL语句判定是读或者写，从而获取到对应的锁
* 锁一般由存储引擎管理，但服务器会为ALTER TABLE之类的语句使用表锁，忽略存储引擎的锁机制
* INSERT,UPDATE,DELETE,SELECT FOR UPDATE都会隐式采用行级锁，会根据实际情况确认是否升级为表锁
* 表锁
    * 锁定整张表
    * 性能/内存开销最小
    * 
* 表级锁
    
* 行级锁
    * 锁开销比较大
    * 只在InnoDB和XtraDB实现
    * 锁定一行数据，因此可以提供较大的并发访问
* 死锁
    * 多个事务在同一资源上互相占用，并请求锁定对方所持有的资源，如果对方无法释放该资源的锁定，将会发生死锁
    * 多个事务以不同的顺序访问资源，有可能产生死锁
    * 多个事务锁定同一个资源，也有可能产生死锁
    * InnoDB解决锁超时
        * 当发生死锁并超时时，将持有的最少行级排他锁的事务进行回滚。

* 隐式和显式锁定
    * 隐式锁定
        * InnoDB使用两阶段锁定协议(two-phase locking protocol)
        * 在事务执行过程中，随时都可能进行锁定
        * 锁只有在COMMIT或ROLLBACK时才会进行释放，并且所有的锁是在同一时刻释放。
    * 显示锁定
        * SELECT ... LOCK IN SHARE MODE
        * SELECT ... FOR UPDATE

#### 1.13.1.3. 多版本并发控制

* MVCC是行级锁的一个变种，很多情况下可以避免加锁，所以开销更低。大都实现了非阻塞读操作，写操作也只锁定必要的行。

* InnoDB的实现
    * 每行记录后保存两个隐藏的列来实现
    * 一个列保存了行的创建版本号，一个列保存行的过期(删除)版本号
    * 每开始一个新事务，系统版本号都会自动递增。事务开始时刻的系统版本号会作为事务的版本号。用来和查询到的每行记录的版本号进行比较。
    
#### 1.13.1.4. 常见术语
* 术语：
    * 事务（transaction）指一组SQL语句；
    * 回退（rollback）指撤销指定SQL语句的过程；
    * 提交（commit）指将未存储的SQL语句结果写入数据库表；   
    * 保留点（ savepoint）指事务处理中设置的临时占位符（ placeholder），你可以对它发布回退（与回退整个事务处理不同）。

### 1.13.2. 基本语句
* 启动事务
    * START TRANSATION;
* 回滚事务
    * ROLLBACK;
* 提交事务
    * COMMIT
* 使用保留点
    * 简单的ROLLBACK和COMMIT语句就可以写入或撤销整个事务处理。但是，只是对简单的事务处理才能这样做，更复杂的事务处理可能需要部分提交或回退。
    * 创建保留点
        * SAVEPOINT point1;
    * 回退
        * ROLLBACK TO point1 ; 回退到point1.
    * 可以在MySQL代码中设置任意多的保留点，因为保留点越多，你就越能按自己的意愿灵活地进行回退.
    * 保留点在事务处理完成后自动释放
* 更改默认的提交行为
    * 默认自动提交，也就是事务里面多提语句时，写一句则提交一次
    * SET autocommit=0;
        * 取消自动提交,只有commit之后才会提交
    * autocommit针对单条连接，而不是MySQL服务器


## 1.14. 数据库索引 
<a href="#menu" style="float:right">目录</a>


### 1.14.1. 基本概念

#### 1.14.1.1. 分类
* 索引类型
    * primary key 主键索引
    * normal：表示普通索引
    * unique：表示唯一的，不允许重复的索引，如果该字段信息保证不会重复例如身份证号用作索引时，可设置为unique
    * full textl: 表示 全文搜索的索引。 FULLTEXT 用于搜索很长一篇文章的时候，效果最好。用在比较短的文本，如果就一两行字的，普通的 INDEX 也可以。
    * 联合索引

* 创建索引语法
```SQL
CREATE [UNIQUE | FULLTEXT | SPATIAL] INDEX index_name
    [index_type]
    ON tbl_name (key_part,...)
    [index_option]
    [algorithm_option | lock_option] ...

key_part:
    col_name [(length)] [ASC | DESC]

index_option:
    KEY_BLOCK_SIZE [=] value
  | index_type
  | WITH PARSER parser_name
  | COMMENT 'string'

index_type:
    USING {BTREE | HASH}

algorithm_option:
    ALGORITHM [=] {DEFAULT | INPLACE | COPY}

lock_option:
    LOCK [=] {DEFAULT | NONE | SHARED | EXCLUSIVE}

```
* 例子
```SQL

--创建普通索引
CREATE INDEX index_name ON table_name(col_name);
--创建唯一索引
CREATE UNIQUE INDEX index_name ON table_name(col_name);
--创建普通组合索引
CREATE INDEX index_name ON table_name(col_name_1,col_name_2);
--创建唯一组合索引
CREATE UNIQUE INDEX index_name ON table_name(col_name_1,col_name_2);
-- 创建表时直接指定索引
CREATE TABLE table_name (
    ID INT NOT NULL,col_name VARCHAR (16) NOT NULL,INDEX index_name (col_name)
);


```
* 删除索引
```SQL
DROP INDEX index_name ON tbl_name
    [algorithm_option | lock_option] ...

algorithm_option:
    ALGORITHM [=] {DEFAULT|INPLACE|COPY}

lock_option:
    LOCK [=] {DEFAULT|NONE|SHARED|EXCLUSIVE}
```
#### 1.14.1.2. 索引用途
<a href="#menu" style="float:right">目录</a>
* 数据完整性
    * 使用主键索引或者唯一键来确保数据唯一性
    * 主键
        * 每个表只能有一个主键
        * 主键不能包含NULL值
        * 如果定义了AUTO_INCREMENT,那么此列必须是主键
    * 唯一键
        * 表可以有多个唯一键
        * 唯一键可以包含NULL值，可以有多个NULL值
* 优化数据访问
    * 使用索引可以减少查询时扫描的行数，提高访问效率
    * 即使添加索引，数据库依然会自行决定是否使用索引，有时候使用全表扫描反而更加高效。这取决于所要求的行数。
    * 查询结果的记录数量小于表中记录一定比例的时候。这个主要是由于索引扫描后要利用索引中的指针去逐一访问记录，假设每个记录都使用索引访问，则读取磁盘的次数是查询包含的记录数T，而如果表扫描则读取磁盘的次数是存储记录的块数B，如果T>B 的话索引就没有优势了。对于大多数数据库来说，这个比例是10%（oracle，postgresql等），即先对结果数量估算，如果小于这个比例用索引，大于的话即直接表扫描
* 表连接
    * 在需要连接的列上使用索引可以显著提高性能，可以快速在另一个表中查询到匹配值。
* 结果排序
    * 索引本身是有序存储的，如果使用ORDER BY，可以快速获取到排序的数据。如果没有索引，则先查找，再内部排序。
* 聚合操作
    * 聚合操作的字段添加索引也可以提高速度

#### 1.14.1.3. 索引的误区
目前，MySQL的服务器可以提供足够大的内存来提供缓存索引相关数据，提高性能，因此有些规范不再适合当前的硬件环境。
* 误区
    * 索引层级不要超过5层
    * 单表的索引数不要超过6个
        * 不要给表的索引数目设置上限，保证性能才是最主要的。
    * 不应该索引不稳定的列
        
    
#### 1.14.1.4. 索引数据结构
<a href="#menu" style="float:right">目录</a>

## 1.15. 存储引擎
<a href="#menu" style="float:right">目录</a>

* 查看存储引擎
```SQL
mysql> show engines;
+--------------------+---------+----------------------------------------------------------------+--------------+------+------------+
| Engine             | Support | Comment                                                        | Transactions | XA   | Savepoints |
+--------------------+---------+----------------------------------------------------------------+--------------+------+------------+
| InnoDB             | DEFAULT | Supports transactions, row-level locking, and foreign keys     | YES          | YES  | YES        |
| MRG_MYISAM         | YES     | Collection of identical MyISAM tables                          | NO           | NO   | NO         |
| MEMORY             | YES     | Hash based, stored in memory, useful for temporary tables      | NO           | NO   | NO         |
| BLACKHOLE          | YES     | /dev/null storage engine (anything you write to it disappears) | NO           | NO   | NO         |
| MyISAM             | YES     | MyISAM storage engine                                          | NO           | NO   | NO         |
| CSV                | YES     | CSV storage engine                                             | NO           | NO   | NO         |
| ARCHIVE            | YES     | Archive storage engine                                         | NO           | NO   | NO         |
| PERFORMANCE_SCHEMA | YES     | Performance Schema                                             | NO           | NO   | NO         |
| FEDERATED          | NO      | Federated MySQL storage engine                                 | NULL         | NULL | NULL       |
+--------------------+---------+----------------------------------------------------------------+--------------+------+------------+

```

XA:存储引擎所支持的分布式是否支持XA
Savepoints：事务中的保留点

* 查看默认的存储引擎
    * show variable like "storage_enging%"
    
### 1.15.1. InnoDB存储引擎

InnoDB是事务型数据库的首选引擎，支持事务安全表（ACID），支持行锁定和外键，上图也看到了，InnoDB是默认的MySQL引擎。InnoDB主要特性有：
* InnoDB给MySQL提供了具有提交、回滚和崩溃恢复能力的事物安全（ACID兼容）存储引擎。InnoDB锁定在行级并且也在SELECT语句中提供一个类似Oracle的非锁定读。这些功能增加了多用户部署和性能。在SQL查询中，可以自由地将InnoDB类型的表和其他MySQL的表类型混合起来，甚至在同一个查询中也可以混合
* InnoDB是为处理巨大数据量的最大性能设计。它的CPU效率可能是任何其他基于磁盘的关系型数据库引擎锁不能匹敌的
* InnoDB存储引擎完全与MySQL服务器整合，InnoDB存储引擎为在主内存中缓存数据和索引而维持它自己的缓冲池。InnoDB将它的表和索引在一个逻辑表空间中，表空间可以包含数个文件（或原始磁盘文件）。这与MyISAM表不同，比如在MyISAM表中每个表被存放在分离的文件中。InnoDB表可以是任何尺寸，即使在文件尺寸被限制为2GB的操作系统上
* InnoDB支持外键完整性约束，存储表中的数据时，每张表的存储都按主键顺序存放，如果没有显示在表定义时指定主键，InnoDB会为每一行生成一个6字节的ROWID，并以此作为主键
* InnoDB被用在众多需要高性能的大型数据库站点上
InnoDB不创建目录，使用InnoDB时，MySQL将在MySQL数据目录下创建一个名为ibdata1的10MB大小的自动扩展数据文件，以及两个名为ib_logfile0和ib_logfile1的5MB大小的日志文件

### 1.15.2. MyISAM存储引擎

MyISAM基于ISAM存储引擎，并对其进行扩展。它是在Web、数据仓储和其他应用环境下最常使用的存储引擎之一。MyISAM拥有较高的插入、查询速度，但不支持事物。MyISAM主要特性有：
* 大文件（达到63位文件长度）在支持大文件的文件系统和操作系统上被支持
* 当把删除和更新及插入操作混合使用的时候，动态尺寸的行产生更少碎片。这要通过合并相邻被删除的块，以及若下一个块被删除，就扩展到下一块自动完成
* 每个MyISAM表最大索引数是64，这可以通过重新编译来改变。每个索引最大的列数是16
* 最大的键长度是1000字节，这也可以通过编译来改变，对于键长度超过250字节的情况，一个超过1024字节的键将被用上
* BLOB和TEXT列可以被索引
* NULL被允许在索引的列中，这个值占每个键的0~1个字节
* 所有数字键值以高字节优先被存储以允许一个更高的索引压缩
* 每个MyISAM类型的表都有一个AUTO_INCREMENT的内部列，当INSERT和UPDATE操作的时候该列被更新，同时AUTO_INCREMENT列将被刷新。所以说，MyISAM类型表的AUTO_INCREMENT列更新比InnoDB类型的AUTO_INCREMENT更快
* 可以把数据文件和索引文件放在不同目录
* 每个字符列可以有不同的字符集
* 有VARCHAR的表可以固定或动态记录长度
* VARCHAR和CHAR列可以多达64KB

使用MyISAM引擎创建数据库，将产生3个文件。文件的名字以表名字开始，扩展名之处文件类型：frm文件存储表定义、数据文件的扩展名为.MYD（MYData）、索引文件的扩展名时.MYI（MYIndex）

### 1.15.3. MEMORY存储引擎

MEMORY存储引擎将表中的数据存储到内存中，未查询和引用其他表数据提供快速访问。MEMORY主要特性有：
* MEMORY表的每个表可以有多达32个索引，每个索引16列，以及500字节的最大键长度
* MEMORY存储引擎执行HASH和BTREE缩影
* 可以在一个MEMORY表中有非唯一键值
* MEMORY表使用一个固定的记录长度格式
* MEMORY不支持BLOB或TEXT列
* MEMORY支持AUTO_INCREMENT列和对可包含NULL值的列的索引
* MEMORY表在所由客户端之间共享（就像其他任何非TEMPORARY表）
* MEMORY表内存被存储在内存中，内存是MEMORY表和服务器在查询处理时的空闲中，创建的内部表共享
* 当不再需要MEMORY表的内容时，要释放被MEMORY表使用的内存，应该执行DELETE FROM或TRUNCATE TABLE，或者删除整个表（使用DROP TABLE）

### 1.15.4. 存储引擎的选择

不同的存储引擎都有各自的特点，以适应不同的需求，如下表所示：


|功 能|MYISAM|Memory|InnoDB|
|---|---|---|---|
|存储限制|256TB|RAM|64TB
|支持事物|No|No|Yes|
|支持全文索引|Yes|No|No|
|支持B数索引|Yes|Yes|Yes|
|支持哈希索引|No|Yes|N|
|支持数据缓存|NA|Yes|Yes|
|索引缓存|Yes|Yes|Yes|
|支持外键|No|No|Yes|
|锁机制|表锁|行锁|表锁|

* 如果要提供提交、回滚、崩溃恢复能力的事物安全（ACID兼容）能力，并要求实现并发控制，InnoDB是一个好的选择
* 如果数据表主要用来插入和查询记录，则MyISAM引擎能提供较高的处理效率
* 如果只是临时存放数据，数据量不大，并且不需要较高的数据安全性，可以选择将数据保存在内存中的Memory引擎，MySQL中使用该引擎作为临时表，存放查询的中间结果
* 如果只有INSERT和SELECT操作，可以选择Archive，Archive支持高并发的插入操作，但是本身不是事务安全的。Archive非常适合存储归档数据，如记录日志信息可以使用Archive
* 使用哪一种引擎需要灵活选择，一个数据库中多个表可以使用不同引擎以满足各种性能和实际需求，使用合适的存储引擎，将会提高整个数据库的性能

## 1.16. 性能优化基本的分析命令
<a href="#menu" style="float:right">目录</a>

### 1.16.1. explain
<a href="#menu" style="float:right">目录</a>
```SQL
mysql> explain select * from user;
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+-------+
| id | select_type | table | partitions | type | possible_keys | key  | key_len | ref  | rows | filtered | Extra |
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+-------+
|  1 | SIMPLE      | user  | NULL       | ALL  | NULL          | NULL | NULL    | NULL |    4 |   100.00 | NULL  |
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+-------+
```

* id	
    * 查询的序号，包含一组数字，表示查询中执行select子句或操作表的顺序
    * id相同，执行顺序从上往下
    * id不同，id值越大，优先级越高，越先执行
* select_type
    * 查询类型，主要用于区别普通查询，联合查询，子查询等的复杂查询
    * simple ——简单的select查询，查询中不包含子查询或者UNION
    * primary ——查询中若包含任何复杂的子部分，最外层查询被标记
    * subquery——在select或where列表中包含了子查询
    * derived——在from列表中包含的子查询被标记为derived（衍生），MySQL会递归执行这些子查询，把结果放到临时表中
    * union——如果第二个select出现在UNION之后，则被标记为UNION，如果union包含在from子句的子查询中，外层select被标记为derived
    * union result UNION 的结果
* table
    * 输出的行所引用的表
* type	
    * 显示联结类型，显示查询使用了何种类型，按照从最佳到最坏类型排序
    * system：表中仅有一行（=系统表）这是const联结类型的一个特例。
    * const：表示通过索引一次就找到，const用于比较primary key或者unique索引。因为只匹配一行数据，所以如果将主键置于where列表中，mysql能将该查询转换为一个常量
    * eq_ref:唯一性索引扫描，对于每个索引键，表中只有一条记录与之匹配。常见于唯一索引或者主键扫描
    * ref:非唯一性索引扫描，返回匹配某个单独值的所有行，本质上也是一种索引访问，它返回所有匹配某个单独值的行，可能会找多个符合条件的行，属于查找和扫描的混合体
    * range:只检索给定范围的行，使用一个索引来选择行。key列显示使用了哪个索引，一般就是where语句中出现了between,in等范围的查询。这种范围扫描索引扫描比全表扫描要好，因为它开始于索引的某一个点，而结束另一个点，不用全表扫描
    * index:index 与all区别为index类型只遍历索引树。通常比all快，因为索引文件比数据文件小很多。
    * all：遍历全表以找到匹配的行
    * 一般保证查询至少达到range级别，最好能达到ref。
* possible_keys
    * 指出MySQL能使用哪个索引在该表中找到行
* key	
    * 显示MySQL实际决定使用的键(索引)。如果没有选择索引,键是NULL。查询中如果使用覆盖索引，则该索引和查询的select字段重叠。
* key_len	
    * 表示索引中使用的字节数，该列计算查询中使用的索引的长度在不损失精度的情况下，长度越短越好。如果键是NULL,则长度为NULL。该字段显示为索引字段的最大可能长度，并非实际使用长度。
* ref	
    * 显示索引的哪一列被使用了，如果有可能是一个常数，哪些列或常量被用于查询索引列上的值
* rows	
    * 根据表统计信息以及索引选用情况，大致估算出找到所需的记录所需要读取的行数
* Extra	
    * 包含不适合在其他列中显示，但是十分重要的额外信息
    * Using filesort：说明mysql会对数据适用一个外部的索引排序。而不是按照表内的索引顺序进行读取。MySQL中无法利用索引完成排序操作称为“文件排序”  
    * Using temporary:使用了临时表保存中间结果，mysql在查询结果排序时使用临时表。常见于排序order by和分组查询group by。
    * Using index:表示相应的select操作用使用覆盖索引，避免访问了表的数据行。如果同时出现using where，表名索引被用来执行索引键值的查找；如果没有同时出现using where，表名索引用来读取数据而非执行查询动作。
    * Using where :表明使用where过滤
    * using join buffer:使用了连接缓存
    * impossible where:where子句的值总是false，不能用来获取任何元组
    * select tables optimized away：在没有group by子句的情况下，基于索引优化Min、max操作或者对于MyISAM存储引擎优化count（*），不必等到执行阶段再进行计算，查询执行计划生成的阶段即完成优化。
    * distinct：优化distinct操作，在找到第一匹配的元组后即停止找同样值的动作。

### 1.16.2. show indexs
<a href="#menu" style="float:right">目录</a>

查看表的索引信息
```SQL
mysql> show INDEX FROM  user \G
*************************** 1. row ***************************
        Table: user
   Non_unique: 0
     Key_name: PRIMARY
 Seq_in_index: 1
  Column_name: user_id
    Collation: A
  Cardinality: 0
     Sub_part: NULL
       Packed: NULL
         Null: 
   Index_type: BTREE
      Comment: 
Index_comment: 
1 row in set (0.00 sec)

```
## 1.17. 分库分表

### 1.17.1. 基本概念
* 数据拆分
    * 垂直拆分
        * 垂直拆分是按照不同的业务进行拆分，比如用户服务，订单服务分别使用不同的数据库
        * 问题
            * 单机的ACID被打破，单机的数据库事务无法使用。需要引入复杂的分布式事务
            * 无法进行跨表JOIN操作
            * 无法使用外键跨库约束
            * 存储过程以及触发器也无法跨库
    * 水平拆分
        * 水平拆分是由于单表数据量增加到上千或者上亿的数据量，造成查询效率低，因此需要将数据进行分表
        * 问题
            * 单机的ACID被打破，单机的数据库事务无法使用。需要引入复杂的分布式事务
            * 无法进行跨表JOIN操作
            * 无法使用外键跨库约束 
            * 依赖单库的自动ID作为主键受到限制，需要自行实现分布式ID生成
            * 针对单个表的逻辑查询可能要跨库
    * 分库分表后使用数据库中间件，比如MyCAT,sharding-jdbc

### 1.17.2. 分布式事务
<a href="#menu" style="float:right">目录</a>

### 1.17.3. 应对多机数据查询
<a href="#menu" style="float:right">目录</a>

#### 1.17.3.1. 跨库Join
* 应用层处理，将单次Join操作分成多次查询
* 数据冗余，将表增加字段，冗余其他表的数据，需要考虑数据一致性问题
* 借助外部系统，比如搜索引擎解决一些跨库问题
#### 1.17.3.2. 外键约束
* 跨库不支持外键约束
* 需要应用层解决跨库数据一致性问题


## 1.18. 高可用

<a href="#menu" style="float:right">目录</a>

### 1.18.1. 主从复制
#### 1.18.1.1. 常见形式
* 多主方式 ，主主之间互相复制
* 一主一从
* 一主多从
* 多主一从
* 联级复制，树形结构
#### 1.18.1.2. 主从同步复制原理
* 主库将所有的写操作记录在binlog日志中，并生成log dump线程，将binlog日志传给从库的I/O线程
* 从库生成两个线程，一个是I/O线程，另一个是SQL线程
* I/O线程去请求主库的binlog日志，并将binlog日志中的文件写入relay log（中继日志）中
* SQL线程会读取relay loy中的内容，并解析成具体的操作，来实现主从的操作一致，达到最终数据一致的目的
#### 1.18.1.3. 主从同步配置

* 主数据库
```cnf
[mysqld]
## 同一局域网内注意要唯一
server-id=100  
## 开启二进制日志功能，可以随便取（关键）
log-bin=mysql-bin

bind-address = 0.0.0.0
```
配置完成后需重启
在Master数据库创建数据同步用户，授予用户 slave REPLICATION SLAVE权限和REPLICATION CLIENT权限，用于在主从库之间同步数据。
```SQL
CREATE USER 'slave'@'%' IDENTIFIED BY '123456';
GRANT REPLICATION SLAVE, REPLICATION CLIENT ON *.* TO 'slave'@'%';
```
* 从数据库
```
[mysqld]
## 设置server_id,注意要唯一
server-id=101  
## 开启二进制日志功能，以备Slave作为其它Slave的Master时使用
log-bin=mysql-slave-bin   
## relay_log配置中继日志
relay_log=edu-mysql-relay-bin 

bind-address = 0.0.0.0
```
* 链接Master(主)和Slave(从)
Master进入mysql，执行show master status;
获取到bin文件名称(File),偏移位置(Position)
File和Position字段的值后面将会用到，在后面的操作完成之前，需要保证Master库不能做任何操作，否则将会引起状态变化，File和Position字段的值变化。
在Slave 中进入 mysql，执行
```SQL
change master to master_host='172.17.0.2', master_user='slave', master_password='123456', master_port=3306, master_log_file='mysql-bin.000001', master_log_pos= 2830, master_connect_retry=30;
```
master_port：Master的端口号，指的是容器的端口号
master_user：用于数据同步的用户
master_password：用于同步的用户的密码
master_log_file：指定 Slave 从哪个日志文件开始复制数据，即上文中提到的 File 字段的值
master_log_pos：从哪个 Position 开始读，即上文中提到的 Position 字段的值
master_connect_retry：如果连接失败，重试的时间间隔，单位是秒，默认是60秒

* 在Slave 中的mysql终端执行show slave status \G;用于查看主从同步状态。

当前情况下，SlaveIORunning 和 SlaveSQLRunning 都是No，因为我们还没有开启主从复制过程。使用start slave开启主从复制过程，然后再次查询主从同步状态show slave status \G;两者为YES

* 在master 查看从机
```SQL
mysql> show slave hosts ;
+-----------+------+------+-----------+--------------------------------------+
| Server_id | Host | Port | Master_id | Slave_UUID                           |
+-----------+------+------+-----------+--------------------------------------+
|       101 |      | 3306 |       100 | 9e7dc405-a842-11e9-b616-0242ac110003 |
+-----------+------+------+-----------+--------------------------------------+

```
#### 1.18.1.4. 添加更多从服务器
有时候我们希望配置多台从服务器。如果是新建立的主从环境，没有什么数据，那么无论多少从服务器，搭建方式和上面说的没有什么两样。重点是，如果在已经运行了一段时间的主从环境中添加更多的从服务器，那么这台从服务器的配置就有点不一样。原因是：在主从配置的过程中，我们需要对服务器进行锁表操作，也就是说，任何数据都不可以继续写入，且持续的时间有可能会很长，在生产环境下，基本上是不允许的。
也就是说，我们不能在主服务器上下手，相反，我们应该在已经存在的从服务器这边下手。基本过程如下：

* 停止旧slave服务器的MySQL服务
* 把旧的slave服务器上的数据复制到新的从服务器里
* 为新服务器分配唯一的server-id和开启其他选项
* 重启服务器


