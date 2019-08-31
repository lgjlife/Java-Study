<span id="menu"></span>

# 1. MySQL
<a href="#menu" style="float:right">目录</a>

## 1.1. 基本概念
<a href="#menu" style="float:right">目录</a>

### 1.1.1. 基本概念
* 基本概念
    * 数据库: 物理操作系统文件或者其他形式文件类型的集合。
    * 数据库实例: 数据库运行之后的应用。
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

**关系型数据库和非关系型数据库的区别**
* 关系型数据库
    * 关系型数据库最典型的数据结构是表，由二维表及其之间的联系所组成的一个数据组织
    * SQLite、Oracle、mysql
    * 特性
        * 关系型数据库，是指采用了关系模型来组织数据的数据库；
        * 关系型数据库的最大特点就是事务的一致性；
        * 简单来说，关系模型指的就是二维表格模型，
        * 而一个关系型数据库就是由二维表及其之间的联系所组成的一个数据组织
    * 优点
        * 容易理解：二维表结构是非常贴近逻辑世界一个概念，关系模型相对网状、层次等其他模型来说更容易理解；
        * 使用方便：通用的SQL语言使得操作关系型数据库非常方便；
        * 易于维护：丰富的完整性(实体完整性、参照完整性和用户定义的完整性)大大减低了数据冗余和数据不一致的概率；
        * 支持SQL，可用于复杂的查询。
    * 缺点
        * 为了维护一致性所付出的巨大代价就是其读写性能比较差；
        * 固定的表结构；
        * 高并发读写需求；
        * 海量数据的高效率读写；

* 非关系型数据库
    * 非关系型数据库严格上不是一种数据库，应该是一种数据结构化存储方法的集合，可以是文档或者键值对等。
    * MongoDb、redis、HBase
    * 特性
        * 使用键值对存储数据；
        * 分布式；
        * 一般不支持ACID特性；  
        * 非关系型数据库严格上不是一种数据库，应该是一种数据结构化存储方法的集合。
    * 优点
        * 无需经过sql层的解析，读写性能很高；
        * 基于键值对，数据没有耦合性，容易扩展；
        * 存储数据的格式：nosql的存储格式是key,value形式、文档形式、图片形式等等，文档形式、图片形式等等，而关系型数据库则只支持基础类型。
        * 2、速度快：nosql可以使用硬盘或者随机存储器作为载体，而关系型数据库只能使用硬盘；
        * 3、高扩展性；
        * 4、成本低：nosql数据库部署简单，基本都是开源软件。
    * 缺点
        * 不提供sql支持，学习和使用成本较高；   
        * 无事务处理，附加功能bi和报表等支持也不好；
        * 数据结构相对复杂，复杂查询方面稍欠。



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




## 1.2. NoSQL与关系型数据库设计理念比较　　

关系型数据库中的表都是存储一些格式化的数据结构，每个元组字段的组成都一样，即使不是每个元组都需要所有的字段，但数据库会为每个元组分配所有的字段，这样的结构可以便于表与表之间进行连接等操作，但从另一个角度来说它也是关系型数据库性能瓶颈的一个因素。而非关系型数据库以键值对存储，它的结构不固定，每一个元组可以有不一样的字段，每个元组可以根据需要增加一些自己的键值对，这样就不会局限于固定的结构，可以减少一些时间和空间的开销。

### 1.2.1. 关系型数据库
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

### 1.2.2. 非关系型数据库
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






## 1.3. 使用数据库
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
* 查看配置文件位置
```
lgj@lgj-Lenovo-G470:~$ mysql --help | grep my.cnf
                      order of preference, my.cnf, $MYSQL_TCP_PORT,
/etc/my.cnf /etc/mysql/my.cnf ~/.my.cnf 

```
按以下顺序读取配置文件
/etc/my.cnf-->/etc/mysql/my.cnf--> ~/.my.cnf 
mysql以读取的最后一个文件配置为准

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



## 1.4. 数据类型
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
|FLOAT(p,s)|（+-）3.4E38|单精度浮点数|8或4字节|
|DOUBLE(p,s)|（+-）1.79E38，（+-）2.22E308||双精度浮点数|8字节|
|DECIMAL(p,s)|可变|一般整数|自定义长度|

当使用浮点类型时，可以指定其精度(小数点左边到右边所允许的数字总位数)和有效位(小数点右边所允许的数字位数)。
这两个参数由p和s指定,如果数字超过了该列所定义的精度或者有效位，那么该列中存储的数据将会被四舍五入。
float(4,2):存储4位数字，两位在左边，两位在右边。存储17.8675将会被四舍五入17.87，178.23将会报错。


**常规字符串类型**
|数据类型|取值范围|说明|单位|
|---|---|---|---|
|char|0~255个字符|定长，效率高，一般用于固定长度的表单提交数据存储,例如：身份证号，手机号，电话，密码等||
|varchar|0～65535个字符|长度可变||

**enum set**
|数据类型|取值范围|说明|单位|
|---|---|---|---|
|Enum("","",...)|0-65535|该类型的列只允许所列值之一或者null|
|SET("","",...)|64|不重复的值或者null|

* 不要在字符串列中存储数字，数字应当使用数字类型存储效率更高
* 从速度方面考虑，应当使用固定的列类型(CHAR)
* 从节省空间来看，应当使用可变的类型
* 为了将列中的内容限制在一种选择，使用ENUM
* 为了允许在一个列中有多余一个的条目，使用SET
* 对于图像音乐或者其他二进制对象，应当存放在文件系统中，不要使用数据库



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

* 当被装载到文本列中的数据超出了该类型的最大长度，数据将会被截断
* 在向文本装载数据列时，不会消除数据的尾部空格
* 当使用文本列排序或者分组时，只会使用前1024个字节，当然也可以放宽这个限制
* 

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

* 日期格式的组成部分
|组成部分|定义|范围|
|---|---|---|
|YYYY|年份|1000-9999|
|MM|月份|01-12|
|DD|日|01-31|
|HH|小时|00-23|
|HHH|小时(过去的)|-838～838|
|MI|分钟|00-59|
|SS|秒|00-59|



**char和varchar的区别**

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

## 1.5. 数据更新

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


## 1.6. 查询入门
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

* 逻辑运算符 
AND / && /OR /|| /!/NOT 

* 算数运算符
```
+ - * / % 
```
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

**正则匹配**
|字符|描述|实例|
|---|---|---|
|*|零个或者多个字符匹配|
|+|一个或者多个字符串匹配|
|?|零个或者一个字符串匹配|
|.|任意单个字符串匹配|
|[xyz]|与xyz中任意一个字符匹配|
|[A-Z]|与任意大写字符匹配|
|[a-z]|与任意小写字符匹配|
|[0-9]|与任意数字匹配|
|^|匹配起始|
|$|匹配结束|
|\||在规则表达式中分隔字符串|
|{n,m}|字符串次数为n-m|
|{n}|字符串次数为n|
|{n,}|字符串至少n次|

```
select xx from xx where name regexp "^a"
```
例子
```
//字符串中出现abc
regexp "abc";

//以a开头的字符串
regexp "^a"

//g至少出现一次或者多次
regexp "g+"

//零个或者多个g
regexp "g*"

```

## 1.7. 多表连接查询
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

## 1.8. 函数
<a href="#menu" style="float:right">目录</a>

### 1.8.1. 聚集函数
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

### 1.8.2. 数学函数
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

### 1.8.3. 字符串函数
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

 
### 1.8.4. 日期和时间函数
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
    * YEAR(date)返回指定日期对应的年份，范围是1970~2069；
    * QUARTER(date)返回date对应一年中的季度，范围是1~4；
    * MINUTE(time)返回time对应的分钟数，范围是0~59；
    * SECOND(time)返回制定时间的秒值
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

### 1.8.5. 条件判断函数

* IF(expr,v1,v2)
    * 如果expr是TRUE则返回v1，否则返回v2
* IFNULL(v1,v2)
    * 如果v1不为NULL，则返回v1，否则返回v2
* CASE expr WHEN v1 THEN r1 [WHEN v2 THEN v2] [ELSE rn] END
    * 如果expr等于某个vn，则返回对应位置THEN后面的结果，如果与所有值都不想等，则返回ELSE后面的rn
 

### 1.8.6. 系统信息函数

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

 

### 1.8.7. 加密函数

* PASSWORD(str)
    * 从原明文密码str计算并返回加密后的字符串密码，注意这个函数的加密是单向的（不可逆），因此不应将它应用在个人的应用程序中而应该只在MySQL服务器的鉴定系统中使用
* MD5(str)
    * 为字符串算出一个MD5 128比特校验和，改值以32位十六进制数字的二进制字符串形式返回
* ENCODE(str, pswd_str)
    * 使用pswd_str作为密码，加密str
* DECODE(crypt_str,pswd_str)
    * 使用pswd_str作为密码，解密加密字符串crypt_str，crypt_str是由ENCODE函数返回的字符串
### 1.8.8. 其他函数
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


## 1.9. 存储过程
<a href="#menu" style="float:right">目录</a>

### 1.9.1. 基本概念
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

### 1.9.2. 使用存储过程


## 1.10. 视图
<a href="#menu" style="float:right">目录</a>

### 1.10.1. 基本概念

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
    * 视图可以和表一起使用。例如，编写一��联结表和视图的SELECT语句
* 视图相关操作
    * 创建视图:CREATE VIEW veiew_name AS select xxx
    * 使用SHOW CREATE VIEW viewname；来查看创建视图的语句。
    * 用DROP删除视图，其语法为DROP VIEW viewname;。
    * 更新视图时，可以先用DROP再用CREATE，也可以直接用CREATE ORREPLACE VIEW。如果要更新的视图不存在，则第2条更新语句会创建一个视图；如果要更新的视图存在，则第2条更新语句会替换原有视图。

## 1.11. 触发器
<a href="#menu" style="float:right">目录</a>

### 1.11.1. 基本概念
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
### 1.11.2. 触发器操作
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


## 1.12. 事务
<a href="#menu" style="float:right">目录</a>

### 1.12.1. 基本概念

#### 1.12.1.1. 事务特点
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

#### 1.12.1.2. 锁
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

#### 1.12.1.3. 多版本并发控制

* MVCC是行级锁的一个变种，很多情况下可以避免加锁，所以开销更低。大都实现了非阻塞读操作，写操作也只锁定必要的行。

* InnoDB的实现
    * 每行记录后保存两个隐藏的列来实现
    * 一个列保存了行的创建版本号，一个列保存行的过期(删除)版本号
    * 每开始一个新事务，系统版本号都会自动递增。事务开始时刻的系统版本号会作为事务的版本号。用来和查询到的每行记录的版本号进行比较。
    
#### 1.12.1.4. 常见术语
* 术语：
    * 事务（transaction）指一组SQL语句；
    * 回退（rollback）指撤销指定SQL语句的过程；
    * 提交（commit）指将未存储的SQL语句结果写入数据库表；   
    * 保留点（ savepoint）指事务处理中设置的临时占位符（ placeholder），你可以对它发布回退（与回退整个事务处理不同）。

### 1.12.2. 基本语句
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


## 1.13. 数据库索引 
<a href="#menu" style="float:right">目录</a>


### 1.13.1. 基本概念

#### 1.13.1.1. 分类
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
#### 1.13.1.2. 索引用途
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

#### 1.13.1.3. 索引的误区
目前，MySQL的服务器可以提供足够大的内存来提供缓存索引相关数据，提高性能，因此有些规范不再适合当前的硬件环境。
* 误区
    * 索引层级不要超过5层
    * 单表的索引数不要超过6个
        * 不要给表的索引数目设置上限，保证性能才是最主要的。
    * 不应该索引不稳定的列
        
    
#### 1.13.1.4. 索引数据结构
<a href="#menu" style="float:right">目录</a>

## 1.14. 存储引擎
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
    
### 1.14.1. InnoDB存储引擎

InnoDB是事务型数据库的首选引擎，支持事务安全表（ACID），支持行锁定和外键，上图也看到了，InnoDB是默认的MySQL引擎。InnoDB主要特性有：
* InnoDB给MySQL提供了具有提交、回滚和崩溃恢复能力的事物安全（ACID兼容）存储引擎。InnoDB锁定在行级并且也在SELECT语句中提供一个类似Oracle的非锁定读。这些功能增加了多用户部署和性能。在SQL查询中，可以自由地将InnoDB类型的表和其他MySQL的表类型混合起来，甚至在同一个查询中也可以混合
* InnoDB是为处理巨大数据量的最大性能设计。它的CPU效率可能是任何其他基于磁盘的关系型数据库引擎锁不能匹敌的
* InnoDB存储引擎完全与MySQL服务器整合，InnoDB存储引擎为在主内存中缓存数据和索引而维持它自己的缓冲池。InnoDB将它的表和索引在一个逻辑表空间中，表空间可以包含数个文件（或原始磁盘文件）。这与MyISAM表不同，比如在MyISAM表中每个表被存放在分离的文件中。InnoDB表可以是任何尺寸，即使在文件尺寸被限制为2GB的操作系统上
* InnoDB支持外键完整性约束，存储表中的数据时，每张表的存储都按主键顺序存放，如果没有显示在表定义时指定主键，InnoDB会为每一行生成一个6字节的ROWID，并以此作为主键
* InnoDB被用在众多需要高性能的大型数据库站点上
InnoDB不创建目录，使用InnoDB时，MySQL将在MySQL数据目录下创建一个名为ibdata1的10MB大小的自动扩展数据文件，以及两个名为ib_logfile0和ib_logfile1的5MB大小的日志文件

### 1.14.2. MyISAM存储引擎

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

### 1.14.3. MEMORY存储引擎

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

### 1.14.4. 存储引擎的选择

不同的存储引擎都有各自的特点，以适应不同的需求，如下表所示：

![](https://github.com/lgjlife/Java-Study/blob/master/pic/mysql/mysql-engines.jpeg?raw=true)

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

## 1.15. InnoDB存储引擎

### 1.15.1. 体系结构
<a href="#menu" style="float:right">目录</a>

#### 1.15.1.1. 后台线程
<a href="#menu" style="float:right">目录</a>

InnoDB存储引擎是多线程模型，其后台线程负责处理不同的任务

**Master Thread**
非常核心的后台线程，负责将缓冲池中的数据异步刷新到磁盘，保证数据的一致性，包括脏页的刷新，合并插入缓冲(INSERT buffer)、UNDO页的回收。

**IO 线程**
使用大量的AIO来处理写IO请求。可以极大提高数据库的性能。
IO线程负责这些请求的回调处理。
现在默认提供4个读IO线程，4个写IO线程。

```
mysql> show variables like "innodb_%io_threads";
+-------------------------+-------+
| Variable_name           | Value |
+-------------------------+-------+
| innodb_read_io_threads  | 4     |
| innodb_write_io_threads | 4     |
+-------------------------+-------+

```
查看IO线程的状态
```
mysql> show engine innodb status \G
*************************** 1. row ***************************
  Type: InnoDB
  Name: 
Status: 
=====================================
2019-08-29 23:49:55 0x7f653c5d2700 INNODB MONITOR OUTPUT

--------
FILE I/O
--------
I/O thread 0 state: waiting for completed aio requests (insert buffer thread)
I/O thread 1 state: waiting for completed aio requests (log thread)
I/O thread 2 state: waiting for completed aio requests (read thread)
I/O thread 3 state: waiting for completed aio requests (read thread)
I/O thread 4 state: waiting for completed aio requests (read thread)
I/O thread 5 state: waiting for completed aio requests (read thread)
I/O thread 6 state: waiting for completed aio requests (write thread)
I/O thread 7 state: waiting for completed aio requests (write thread)
I/O thread 8 state: waiting for completed aio requests (write thread)
I/O thread 9 state: waiting for completed aio requests (write thread)
Pending normal aio reads: [0, 0, 0, 0] , aio writes: [0, 0, 0, 0] ,


```

**Purge 线程**
事务提交以后，其所使用的undolog可能不再需要。使用Purge 线程来回收已经使用并分配的undolog页。

1.1版本之前这个操作是在Master线程完成，1.1之后可以使用单独的线程。

配置使用单独的线程
```
[mysqld]
innodb_purge_threads=1
```

默认配置使用4个
```
mysql> show variables like "innodb_purge_threads";
+----------------------+-------+
| Variable_name        | Value |
+----------------------+-------+
| innodb_purge_threads | 4     |
+----------------------+-------+

```


#### 1.15.1.2. 内存
<a href="#menu" style="float:right">目录</a>

innodb是基于磁盘存储，并将其中的记录按照页的方式进行管理。在数据库系统中 ，由于CPU速度和磁盘速度的差异，基于磁盘的数据库系统通常使用缓冲池技术来提高数据库的整体性能。

缓冲池简单来说就是一块内存，通过内存的速度来弥补磁盘速度较慢对数据库性能的影响。
* 在数据库中进行读取页的操作，首先将从磁盘读到的页存放在缓冲池中，这个过程称为将页FIX在缓冲池。下一次再读取相同的页时，首先判断该页是否在缓冲池中，若在，则直接读取缓冲池中的数据，若不再，则从磁盘中读取。
* 对于数据库中页的修改操作，则首先修改在缓冲池中的页，然后再以一定的频率刷新到磁盘上。刷新磁盘机制通过Checkpoint的机制刷新回磁盘。

大小配置
```
mysql> show variables like "innodb_buffer_pool_size";
+-------------------------+-----------+
| Variable_name           | Value     |
+-------------------------+-----------+
| innodb_buffer_pool_size | 134217728 |
+-------------------------+-----------+
```

* **缓冲池**
    * 数据页
    * 插入缓冲
    * 锁信息
    * 索引页
    * 自适应哈希索引
    * 数据字典信息
    * 重做日志缓冲
    * 额外内存池

**缓冲池实例**

```
mysql> show variables like "innodb_buffer_pool_instances";
+------------------------------+-------+
| Variable_name                | Value |
+------------------------------+-------+
| innodb_buffer_pool_instances | 1     |
+------------------------------+-------+

```
支持设置多个缓冲池实例。每个页根据哈希值平均分配到不同的缓冲池实例，减少数据库内部的资源竞争，增加数据库的并发处理能力。



### 1.15.2. checkpoint技术
<a href="#menu" style="float:right">目录</a>

**checkpoint产生的背景**
数据库在发生增删查改操作的时候，为了提高事物操作的效率，都是先在buffer pool中完成的，buffer pool中修改之后的数据，并没有立即写入到磁盘，这有可能会导致内存中数据与磁盘中的数据产生不一致的情况。
事物要求之一是持久性（Durability），buffer pool与磁盘数据的不一致性的情况下发生故障，可能会导致数据无法持久化。
为了防止在内存中修改但尚未写入到磁盘的数据，在发生故障重启数据之后产生事物未持久化的情况，是通过日志(redo log)先行的方式来保证的。
redo log可以在故障重启之后实现“重做”，保证了事物的持久化的特性，但是redo log空间不可能无限制扩大，对于内存中已修改但尚未提交到磁盘的数据，也即脏页，也需要写入磁盘。
对于内存中的脏页，什么时候，什么情况下，将多少脏页写入磁盘，是由多方面因素决定的。
checkpoint的工作之一，就是对于内存中的脏页，在一定条件下将脏页刷新到磁盘。

**checkpoint的分类**
按照checkpoint刷新的方式，MySQL中的checkpoint分为两种，也即sharp checkpoint和fuzzy checkpoint。
sharp checkpoint：在关闭数据库的时候，将buffer pool中的脏页全部刷新到磁盘中。
fuzzy checkpoint：数据库正常运行时，在不同的时机，将部分脏页写入磁盘，进刷新部分脏页到磁盘，也是为了避免一次刷新全部的脏页造成的性能问题。

 

**checkpoint发生的时机**
checkpoint都是将buffer pool中的脏页刷新到磁盘，但是在不同的情况下，checkpoint会被以不同的方式触发，同时写入到磁盘的脏页的数量也不同。

* **Master Thread checkpoint**
　　在Master Thread中，会以每秒或者每10秒一次的频率，将部分脏页从内存中刷新到磁盘，这个过程是异步的。正常的用户线程对数据的操作不会被阻塞。
* **FLUSH_LRU_LIST checkpoint**
FLUSH_LRU_LIST checkpoint是在单独的page cleaner线程中执行的。
MySQL对缓存的管理是通过buffer pool中的LRU列表实现的，LRU 空闲列表中要保留一定数量的空闲页面，来保证buffer pool中有足够的空闲页面来相应外界对数据库的请求。
当这个空间页面数量不足的时候，发生FLUSH_LRU_LIST checkpoint。
空闲页的数量由innodb_lru_scan_depth参数表来控制的，因此在空闲列表页面数量少于配置的值的时候，会发生checkpoint，剔除部分LRU列表尾端的页面。

```mysql> show variables like "innodb_lru%";
+-----------------------+-------+
| Variable_name         | Value |
+-----------------------+-------+
| innodb_lru_scan_depth | 1024  |
+-----------------------+-------+
```




* **Async/Sync Flush checkpoint**
Async/Sync Flush checkpoint是在单独的page cleaner线程中执行的。
Async/Sync Flush checkpoint 发生在重做日志不可用的时候，将buffer pool中的一部分脏页刷新到磁盘中，在脏页写入磁盘之后，事物对应的重做日志也就可以释放了。
关于redo_log文件的的大小，可以通过innodb_log_file_size来配置。

```
mysql> show variables like "innodb_log_file_size";
+----------------------+----------+
| Variable_name        | Value    |
+----------------------+----------+
| innodb_log_file_size | 50331648 |
+----------------------+----------+

```
对于是执行Async Flush checkpoint还是Sync Flush checkpoint，由checkpoint_age以及async_water_mark和sync_water_mark来决定。
定义：
　　checkpoint_age = redo_lsn-checkpoint_lsn，也即checkpoint_age等于最新的lsn减去已经刷新到磁盘的lsn的值
　　async_water_mark 　　= 75%*innodb_log_file_size
　　sync_water_mark 　　 =  90%*innodb_log_file_size
　　1）当checkpoint_age<sync_water_mark的时候，无需执行Flush checkpoint。也就说，redo log剩余空间超过25%的时候，无需执行Async/Sync Flush checkpoint。
　　2）当async_water_mark<checkpoint_age<sync_water_mark的时候，执行Async Flush checkpoint，也就说，redo log剩余空间不足25%，但是大于10%的时候，执行Async Flush checkpoint，刷新到满足条件1
　　3）当checkpoint_age>sync_water_mark的时候，执行sync Flush checkpoint。也就说，redo log剩余空间不足10%的时候，执行Sync Flush checkpoint，刷新到满足条件1。
　　在mysql 5.6之后，不管是Async Flush checkpoint还是Sync Flush checkpoint，都不会阻塞用户的查询进程。　


由于磁盘是一种相对较慢的存储设备，内存与磁盘的交互是一个相对较慢的过程
由于innodb_log_file_size定义的是一个相对较大的值，正常情况下，由前面两种checkpoint刷新脏页到磁盘，在前面两种checkpoint刷新脏页到磁盘之后，脏页对应的redo log空间随即释放，一般不会发生Async/Sync Flush checkpoint。同时也要意识到，为了避免频繁低发生Async/Sync Flush checkpoint，也应该将innodb_log_file_size配置的相对较大一些。

* **Dirty Page too much Checkpoint**
Dirty Page too much Checkpoint是在Master Thread 线程中每秒一次的频率实现的。
Dirty Page too much 意味着buffer pool中的脏页过多，执行checkpoint脏页刷入磁盘，保证buffer pool中有足够的可用页面。
Dirty Page 由innodb_max_dirty_pages_pct配置，innodb_max_dirty_pages_pct的默认值在innodb 1.0之前是90%，之后是75%。

```
mysql> show variables like "innodb_max_dirty_pages_pct";
+----------------------------+-----------+
| Variable_name              | Value     |
+----------------------------+-----------+
| innodb_max_dirty_pages_pct | 75.000000 |
+----------------------------+-----------+
```
**总结：**

MySQL数据库（当然其他关系数据也有类似的机制），为了提高事物操作的效率，在事物提交之后并不会立即将修改后的数据写入磁盘，而是通过日志先行（write log ahead）的方式保证事物的持久性。
对于将事物修改的数据页面，也即脏页，通过异步的方式刷新到磁盘中，checkpoint正是实现这种异步刷新脏页到磁盘的实施者。
不同的情况下，会发生不同的checkpoint，将不同数量的脏页刷新到磁盘，从而到达管理内存（第1,2,4种checkpoint）和redo log可用空间（第3种checkpoint）的目的。 

### 1.15.3. Master Thread 工作方式
<a href="#menu" style="float:right">目录</a>

### 1.15.4. InnoDB关键特性
插入缓存（insert buffer）、两次写(double write)、自适应哈希(Adaptive Hash index)、异步IO(Async IO)、刷新邻接页(Flush Neighbor Page)


#### 1.15.4.1. 插入缓存
<a href="#menu" style="float:right">目录</a>

**Insert Buffer**
Insert Buffer是InnoDB存储引擎关键特性中最令人激动与兴奋的一个功能。不过这个名字可能会让人认为插入缓冲是缓冲池中的一个组成部分。其实不然，InnoDB缓冲池中有Insert Buffer信息固然不错，但是Insert Buffer和数据页一样，也是物理页的一个组成部分。

一般情况下，主键是行唯一的标识符。通常应用程序中行记录的插入顺序是按照主键递增的顺序进行插入的。因此，插入聚集索引一般是顺序的，不需要磁盘的随机读取。因为，对于此类情况下的插入，速度还是非常快的。（如果主键类是UUID这样的类，那么插入和辅助索引一样，也是随机的。）

如果索引是非聚集的且不唯一。在进行插入操作时，数据的存放对于非聚集索引叶子节点的插入不是顺序的，这时需要离散地访问非聚集索引页，由于随机读取的存在而导致了插入操作性能下降。这是因为B+树的特性决定了非聚集索引插入的离散性。

Insert Buffer的设计，对于非聚集索引的插入和更新操作，不是每一次直接插入到索引页中，而是先判断插入非聚集索引页是否在缓冲池中，若存在，则直接插入，不存在，则先放入一个Insert Buffer对象中。数据库这个非聚集的索引已经插到叶子节点，而实际并没有，只是存放在另一个位置。然后再以一定的频率和情况进行Insert Buffer和辅助索引页子节点的merge（合并）操作，这时通常能将多个插入合并到一个操作中（因为在一个索引页中），这就大大提高了对于非聚集索引插入的性能。

需要满足的两个条件：
* 索引是辅助索引；
* 索引不是唯一的。

辅助索引不能是唯一的，因为在插入缓冲时，数据库并不去查找索引页来判断插入的记录的唯一性。如果去查找肯定又会有离散读取的情况发生，从而导致Insert Buffer失去了意义。

**Change Buffer**
InnoDB从1.0.x版本开始引入了Change Buffer，可将其视为Insert Buffer的升级。从这个版本开始，InnoDB存储引擎可以对DML操作——INSERT、DELETE、UPDATE都进行缓冲，他们分别是：Insert Buffer、Delete Buffer、Purge buffer。

当然和之前Insert Buffer一样，Change Buffer适用的对象依然是非唯一的辅助索引。

对一条记录进行UPDATE操作可能分为两个过程：
* 将记录标记为已删除（Delete Buffer）；
* 真正将记录删除（Purge buffer）。

因此Delete Buffer对应UPDATE操作的第一个过程，即将记录标记为删除。Purge Buffer对应UPDATE操作的第二个过程，即将记录真正的删除。同时，InnoDB存储引擎提供了参数innodb_change_buffering，用来开启各种Buffer的选项。该参数可选的值为：inserts、deletes、purges、changes、all、none。inserts、deletes、purges就是前面讨论过的三种情况。changes表示启用inserts和deletes，all表示启用所有，none表示都不启用。该参数默认值为all。

从InnoDB 1.2.x版本开始，可以通过参数innodb_change_buffer_max_size来控制Change Buffer最大使用内存的数量，innodb_change_buffer_max_size值默认为25，表示最多使用1/4的缓冲池内存空间。而需要注意的是，该参数的最大有效值为50。

在MySQL 5.5版本中通过命令SHOW ENGINE INNODB STATUS，可以观察到类似如下的内容：

```
mysql> SHOW ENGINE INNODB STATUS\G;
……
-------------------------------------
INSERT BUFFER AND ADAPTIVE HASH INDEX
-------------------------------------
Ibuf: size 1, free list len 34397, seg size 34399, 10875 merges
 
merged operations:
 
insert 20462, delete mark 20158, delete 4215
 
discarded operations:
 
insert 0, delete mark 0, delete 0
……
```
可以看到这里显示了merged operations和discarded operation，并且下面具体显示Change Buffer中每个操作的次数。insert表示Insert Buffer；delete mark表示Delete Buffer；delete表示Purge Buffer；discarded operations表示当Change Buffer发生merge时，表已经被删除，此时就无需再将记录合并（merge）到辅助索引中了。

**Merge Insert Buffer**
通过前面的小节读者应该已经知道了Insert/Change Buffer是一棵B+树。若需要实现插入记录的辅助索引页不在缓冲池中，那么需要将辅助索引记录插入到这棵实际B+树中。但是Insert Buffer中的记录何时合并（merge）到真正的辅助索引中呢？

概括地说，Merge Insert Buffer的操作可能发生在以下几种情况下：
* 辅助索引页被读取到缓冲池时；
* Insert Buffer Bitmap页追踪到该辅助索引页已无可用空间时；
* Master Thread。

第一种情况为当辅助索引页被读取到缓冲池中时，例如这在执行正常的SELECT查询操作，这时需要检查Insert Buffer Bitmap页，然后确认该辅助索引页是否有记录存放于Insert Buffer B+树中。若有，则将Insert Buffer B+树中该页的记录插入到该辅助索引页中。可以看到对该页多次的记录操作通过一次操作合并到了原有的辅助索引页中，因此性能会有大幅提高。

Insert Buffer Bitmap页用来追踪每个辅助索引页的可用空间，并至少有1/32页的空间。若插入辅助索引记录时检测到插入记录后可用空间会小于1/32页，则会强制进行一个合并操作，即强制读取辅助索引页，将Insert Buffer B+树中该页的记录及待插入的记录插入到辅助索引页中。这就是上述所说的第二种情况。

还有一种情况，之前在分析Master Thread时曾讲到，在Master Thread线程中每秒或每10秒会进行一次Merge Insert Buffer的操作，不同之处在于每次进行merge操作的页的数量不同。

#### 1.15.4.2. 两次写
<a href="#menu" style="float:right">目录</a>

**doublewrite应用场景**
我们知道，innodb的数据页一般大小是16KB，MySQL存取数据的最小单位也是页，而操作系统并不能保障一个数据页的原子性，也就是说当写入数据时，有可能在一个页中写入一半时（比如8K）数据库宕机，这种情况称为部分写失效（partial page write），从而导致数据丢失。

大家也许会问，难道我不可以根据redo log进行数据恢复吗？答案是肯定的也是否定的，要分为两种情况：1、数据库宕机，物理文件完好无损，是可以通过redo log进行崩溃恢复。2、数据库宕机，正在刷新到磁盘的页发生partial page write，而正好在磁盘上的这个数据页由于宕机发生损坏，这时就无法通过redo log进行数据恢复了，为什么？我们必须要清楚的认识到，redo log里记录的是对页的物理操作！比如一条redo记录"page number xx，偏移量 800 写记录 “this is abc”"，那当页损坏时，这条redo记录还有意义吗？于是在这种特殊情况下，doublewrite就派上用场啦！

**doublewrite体系结构及工作流程**
doublewrite由两部分组成，一部分为内存中的doublewrite buffer，其大小为2MB，另一部分是磁盘上共享表空间（ibdata x）中连续的128个页，即2个区（extent），大小也是2M。doublewrite工作流程如下：

* 当一系列机制（main函数触发、checkpoint等）触发数据缓冲池中的脏页进行刷新时，并不直接写磁盘，而是会通过memcpy函数将脏页先复制到内存中的doublewrite buffer,之后通过doublewrite buffer再分两次、每次1MB顺序写入共享表空间的物理磁盘上。
* 马上调用fsync函数，同步脏页进磁盘。由于在这个过程中，doublewrite页的存储时连续的，因此写入磁盘为顺序写，性能很高；完成doublewrite后，再将脏页写入实际的各个表空间文件，这时写入就是离散的了。各模块协作情况如下图（第一步应为脏页产生的redo记录logbuffer，然后logbuffer写入redo log file，为简化次要步骤直接连线表示）：

![](http://www.linuxidc.com/upload/2017_01/170108153616321.png)

查看doublewrite工作情况，可以执行命令：
```
mysql> show global status like 'innodb_dblwr%'\G
*************************** 1. row ***************************
Variable_name: Innodb_dblwr_pages_written
        Value: 61932183
*************************** 2. row ***************************
Variable_name: Innodb_dblwr_writes
        Value: 15237891
2 rows in set (0.00 sec)
```

以上数据显示，doublewrite一共写了 61932183个页，一共写了15237891次，从这组数据我们可以分析，之前讲过在开启doublewrite后，每次脏页刷新必须要先写doublewrite，而doublewrite存在于磁盘上的是两个连续的区，每个区由连续的页组成，一般情况下一个区最多有64个页，所以一次IO写入应该可以最多写64个页。而根据以上我这个系统Innodb_dblwr_pages_written与Innodb_dblwr_writes的比例来看，大概在4左右，远远还没到64，所以从这个角度也可以看出，系统写入压力并不高。

**崩溃恢复**
如果操作系统在将页写入磁盘的过程中发生崩溃，如上图，在恢复过程中，innodb存储引擎可以从共享表空间的doublewrite中找到该页的一个最近的副本，将其复制到表空间文件，再应用redo log，就完成了恢复过程。因为有副本所以也不担心表空间中数据页是否损坏。

#### 1.15.4.3. 自适应哈希索引
<a href="#menu" style="float:right">目录</a>

哈希是一种非常快的查找方法，在一般情况时间复杂度为O(1)。而B+树的查找次数，取决于B+树的高度，在生成环境中，B+树的高度一般为3-4层，不需要查询3-4次。

InnoDB存储引擎会监控对表上各索引页的查询。如果观察到简历哈希索引可以提升速度，这简历哈希索引，称之为自适应哈希索引(Adaptive Hash Index, AHI)。AHI是通过缓冲池的B+树页构造而来的。因此建立的速度非常快，且不要对整张表构建哈希索引。InnoDB存储哟inquiry会自动根据房屋的频率和陌生来自动的为某些热点页建立哈希索引。

AHI有一个要求，对这个页的连续访问模式(查询条件)必须一样的。例如联合索引(a,b)其访问模式可以有以下情况:
* WHERE a=XXX;
* WHERE a=xxx AND b=xxx。

若交替进行上述两张查询，InnoDB存储引擎不会对该页构造AHI。此外AHI还有如下要求：
* 以该模式访问了100次；
* 页通过该模式访问了N次，其中N=页中记录/16。

根据官方文档显示，启用AHI后，读取和写入的速度可以提高2倍，负责索引的链接操作性能可以提高5倍。其设计思想是数据库自由化的，无需DBA对数据库进行人为调整。

#### 1.15.4.4. 异步IO
<a href="#menu" style="float:right">目录</a>

为了提高磁盘操作性能，当前的数据库系统都采用异步IO的方式来处理磁盘操作。InnoDB也是如此。

与AIO对应的是Sync IO，即每进行一次IO操作，需要等待此次操作结束才能继续接下来的操作。但是如果用户发出的是一条索引扫描的查询，那么这条SQL语句可能需要扫描多个索引页，也就是需要进行多次IO操作。在每扫描一个页并等待其完成再进行下一次扫描，这是没有必要的。用户可以在发出一个IO请求后立即再发出另外一个IO请求，当全部IO请求发送完毕后，等待所有IO操作完成，这就是AIO。

AIO的另外一个优势是进行IO Merge操作，也就是将多个IO合并为一个IO操作，这样可以提高IOPS的性能。

在InnoDB 1.1.x之前，AIO的实现是通过InnoDB存储引擎中的代码来模拟的。但是从这之后，提供了内核级别的AIO的支持，称为Native AIO。Native AIO需要操作系统提供支持。Windows和Linux都支持，而Mac则未提供。在选择MySQL数据库服务器的操作系统时，需要考虑这方面的因素。

MySQL可以通过参数innodb_use_native_aio来决定是否启用Native AIO。在InnoDB存储引擎中，read ahead方式的读取都是通过AIO完成，脏页的刷新，也是通过AIO完成。

#### 1.15.4.5. 刷新邻接页
<a href="#menu" style="float:right">目录</a>

InnoDB存储引擎在刷新一个脏页时，会检测该页所在区(extent)的所有页，如果是脏页，那么一起刷新。这样做的好处是通过AIO可以将多个IO写操作合并为一个IO操作。该工作机制在传统机械磁盘下有显著优势。但是需要考虑下吧两个问题:
* 是不是将不怎么脏的页进行写入，而该页之后又会很快变成脏页？
* 固态硬盘有很高IOPS，是否还需要这个特性？

为此InnoDB存储引擎1.2.x版本开始提供参数innodb_flush_neighbors来决定是否启用。对于传统机械硬盘建议使用，而对于固态硬盘可以关闭。


#### 1.15.4.6. 启动、关闭与恢复
<a href="#menu" style="float:right">目录</a>

## 1.16. 日志文件
<a href="#menu" style="float:right">目录</a>

### 1.16.1. 参数文件
<a href="#menu" style="float:right">目录</a>

* 告诉MYSQL实例启动时在哪里可以找到数据库文件，并且指定初始化参数，这些参数定义了某种内存结构的大小等设置，还会介绍参数的类型
也就是配置文件
```bash
lgj@lgj-Lenovo-G470:~$ mysql --help | grep my.cnf
                      order of preference, my.cnf, $MYSQL_TCP_PORT,
/etc/my.cnf /etc/mysql/my.cnf ~/.my.cnf 
```


### 1.16.2. 日志文件
<a href="#menu" style="float:right">目录</a>

* 用来记录运行时产生的日志，比如慢查询日志，二进制日志

### 1.16.3. socket文件
<a href="#menu" style="float:right">目录</a>

* 当用UNIX域套接字进行连接时需要的文件 

### 1.16.4. pid文件
<a href="#menu" style="float:right">目录</a>

* MYSQL实例的进程PID文件


### 1.16.5. MySQL表结构文件
<a href="#menu" style="float:right">目录</a>

* 表结构定义文件 

### 1.16.6. 存储引擎文件
<a href="#menu" style="float:right">目录</a>

* 存储了记录和索引等数据

## 1.17. 表

### 1.17.1. 索引组织表
<a href="#menu" style="float:right">目录</a>

### 1.17.2. 逻辑存储结构
<a href="#menu" style="float:right">目录</a>

### 1.17.3. 行记录格式
<a href="#menu" style="float:right">目录</a>

### 1.17.4. 数据页结构
<a href="#menu" style="float:right">目录</a>

### 1.17.5. Nameed File Formats机制
<a href="#menu" style="float:right">目录</a>

### 1.17.6. 约束
<a href="#menu" style="float:right">目录</a>

### 1.17.7. 视图
<a href="#menu" style="float:right">目录</a>

### 1.17.8. 分区表
<a href="#menu" style="float:right">目录</a>

## 1.18. 索引与算法

### 1.18.1. 索引概述
<a href="#menu" style="float:right">目录</a>

* 支持的索引
    * B+树索引
    * 全文索引
    * 哈希索引
* B+树索引就是传统意义上的索引，这是目前关系型数据库中查找最为常用和最为有效的索引
* B+树索引并不能找到一个给定键值的具体行，能找到的是数据行所在的页。然后数据库把页读入带内存，再在内存中进行查找，最后得到要查找的数据。

### 1.18.2. 数据结构和算法
<a href="#menu" style="float:right">目录</a>

### 1.18.3. B树和B+树
<a href="#menu" style="float:right">目录</a>

注意：只有B树和B+树，没有B-树。

#### 1.18.3.1. B树
b树（balance tree）和b+树应用在数据库索引，可以认为是m叉的多路平衡查找树，但是从理论上讲，二叉树查找速度和比较次数都是最小的，为什么不用二叉树呢？ 
因为我们要考虑磁盘IO的影响，它相对于内存来说是很慢的。数据库索引是存储在磁盘上的，当数据量大时，就不能把整个索引全部加载到内存了，只能逐一加载每一个磁盘页（对应索引树的节点）。所以我们要减少IO次数，对于树来说，IO次数就是树的高度，而“矮胖”就是b树的特征之一，它的每个节点最多包含m个孩子，m称为b树的阶，m的大小取决于磁盘页的大小。

一个M阶的b树具有如下几个特征：
* 定义任意非叶子结点最多只有M个儿子，且M>2；
* 根结点的儿子数为[2, M]；
* 除根结点以外的非叶子结点的儿子数为[M/2, M]，向上取整；
* 非叶子结点的关键字个数=儿子数-1；
* 所有叶子结点位于同一层；
* k个关键字把节点拆成k+1段，分别指向k+1个儿子，同时满足查找树的大小关系。

有关b树的一些特性，注意与后面的b+树区分：
* 关键字集合分布在整颗树中；
* 任何一个关键字出现且只出现在一个结点中；
* 搜索有可能在非叶子结点结束；
* 其搜索性能等价于在关键字全集内做一次二分查找；

**b树查询过程**
如图是一个3阶b树，讲一下查询元素5的过程： 
![](https://img-blog.csdn.net/20170717203847019?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbG9naW5fc29uYXRh/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

1. 第一次磁盘IO，把9所在节点读到内存，把目标数5和9比较，小，找小于9对应的节点；

![](https://img-blog.csdn.net/20170717204159855?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbG9naW5fc29uYXRh/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

2. 第二次磁盘IO，还是读节点到内存，在内存中把5依次和2、6比较，定位到2、6中间区域对应的节点； 
3. 第三次磁盘IO就不上图了，跟第二步一样，然后就找到了目标5。

可以看到，b树在查询时的比较次数并不比二叉树少，尤其是节点中的数非常多时，但是内存的比较速度非常快，耗时可以忽略，所以只要树的高度低，IO少，就可以提高查询性能，这是b树的优势之一。

**b树的插入删除元素操作**： 
比如我们要在下图中插入元素4： 

![](https://img-blog.csdn.net/20170717204623600?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbG9naW5fc29uYXRh/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

1. 首先自顶向下查询找到4应该在的位置，即3、5之间； 
2. 但是3阶b树的节点最多只能有2个元素，所以把3、4、5里面的中间元素4上移（中间元素上移是插入操作的关键）； 
3. 上一层节点加入4之后也超载了，继续中间元素上移的操作，现在根节点变成了4、9； 
4. 还要满足查找树的性质，所以对元素进行调整以满足大小关系，始终维持多路平衡也是b树的优势，最后变成这样： 
![](https://img-blog.csdn.net/20170717204845799?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbG9naW5fc29uYXRh/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

**删除操作**
再比如我们要删除元素11： 
1，自顶向下查询到11，删掉它； 
2，然后不满足b树的条件了，因为元素12所在的节点只有一个孩子了，所以我们要“左旋”，元素12下来，元素13上去： 

![](https://img-blog.csdn.net/20170717204945516?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbG9naW5fc29uYXRh/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

这时如果再删除15呢？很简单，当元素个数太少以至于不能再旋转时，12直接上去就行了。


#### 1.18.3.2. B+树

b+树，是b树的一种变体，查询性能更好。m阶的b+树的特征：
* 有n棵子树的非叶子结点中含有n个关键字（b树是n-1个），这些关键字不保存数据，只用来索引，所有数据都保存在叶子节点（b树是每个关键字都保存数据）。
* 所有的叶子结点中包含了全部关键字的信息，及指向含这些关键字记录的指针，且叶子结点本身依关键字的大小自小而大顺序链接。
* 所有的非叶子结点可以看成是索引部分，结点中仅含其子树中的最大（或最小）关键字。
* 通常在b+树上有两个头指针，一个指向根结点，一个指向关键字最小的叶子结点。
* 同一个数字会在不同节点中重复出现，根节点的最大元素就是b+树的最大元素。

![](https://img-blog.csdn.net/20170717205509476?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbG9naW5fc29uYXRh/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

**b+树相比于b树的查询优势：**
* b+树的中间节点不保存数据，所以磁盘页能容纳更多节点元素，更“矮胖”；
* b+树查询必须查找到叶子节点，b树只要匹配到即可不用管元素位置，因此b+树查找更稳定（并不慢）；
* 对于范围查找来说，b+树只需遍历叶子节点链表即可，b树却需要重复地中序遍历，如下两图：
![](https://img-blog.csdn.net/20170717205818859?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbG9naW5fc29uYXRh/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)


### 1.18.4. B+树索引
<a href="#menu" style="float:right">目录</a>

B+树索引本质就是B+树在数据库中的实现。但是B+树索引的一个特点是高扇出性，因此在数据库中，B+树索引的高度一般都在2-4层，也就是说查找某一键值的行记录时只需要2-4次IO。

* B+树索引分类
    * 聚集索引(clustered index)
        * 也叫主键索引，存放一整行的数据
    * 辅助索引(secondary index/non-clustered index)
        * 存放页的地址

#### 1.18.4.1. 聚集索引
<a href="#menu" style="float:right">目录</a>

* 聚集索引就是按照每张表的主键构造一棵B+树，同时叶子节点中存放的即为整张表的行记录数据，也是聚集索引的叶子节点称为数据页，每个数据页之间都通过一个双向链表进行链接。
* 由于实际的数据页只能按照一棵B+树进行排序，每张表只能有一个聚集索引。
* 在多数情况下，查询优化器倾向于采用聚集索引，因为聚集索引能够在B+树的叶子节点上直接找到数据
* 由于定义了数据的逻辑顺序，聚集索引能够特别快的访问针对范围值的查询，查询优化器能够快速发现某一段范围的数据页需要扫描。



什么叫索引项的排序方式和表中数据记录排序方式一致呢？
我们把一本字典看做是数据库的表，那么字典的拼音目录就是聚集索引，它按照A-Z排列。实际存储的字也是按A-Z排列的。这就是索引项的排序方式和表中数据记录排序方式一致。

对于Innodb，主键毫无疑问是一个聚集索引。但是当一个表没有主键，或者没有一个索引，Innodb会如何处理呢。请看如下规则:
* 如果一个主键被定义了，那么这个主键就是作为聚集索引。
* 如果没有主键被定义，那么该表的第一个唯一非空索引被作为聚集索引。
* 如果没有主键也没有合适的唯一索引，那么innodb内部会生成一个隐藏的主键作为聚集索引，这个隐藏的主键是一个6个字节的列，该列的值会随着数据的插入自增。

* 聚集索引的存储不是物理上连续的，而是逻辑上连续的
    * 如果聚集索引按照特定顺序存放物理记录，则维护成本很高
    * 页通过双向链表连接，页按照主键的顺序排序
    * 每个页中的记录也是通过双向链表进行维护的，物理存储上同样不按照主键存储。
    
* 对于主键的排序查找和范围查找速度很快，叶子节点的数据就是用户所要查询的数据

#### 1.18.4.2. 辅助索引
<a href="#menu" style="float:right">目录</a>

* 辅助索引：辅助索引中索引的逻辑顺序与磁盘上行的物理存储顺序不同，一个表中可以拥有多个非聚集索引。叶子节点并不包含行记录的全部数据。叶子节点除了包含键值以外，还存储了一个指向该行数据的聚集索引键的书签。该书签用来告诉存储引擎哪里可以找到与索引相对应的行数据。
* 由于InnoDD存储引擎表是索引组织表，因此InnoDB存储引擎的书签就是相应行数据的聚集索引键。
* 辅助索引的存在并不会影响数据在聚集索引中的组织，因此每张表上可以有多个辅助索引。
* 当通过辅助索引查找数据时，InnoDB会遍历辅助索引并通过页级别的指针获得指向主键索引的主键，然后通过主键索引来找到一个完整的行记录。
    * 比如在一棵高度为3的辅助索引中查找数据
        * 先从辅助索引树遍历3次查找到指定主键
        * 如果聚集索引树的高度同样为3，那么还需要对聚集索引树进行性3次查找，最终找到一个完整的行数据所在的页
        * 因此一共需要6次逻辑IO访问以得到最终的数据页。
        

![](https://upload-images.jianshu.io/upload_images/5679451-bb23fe664141f121.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/658/format/webp)
我们直接看B+树的Leaf Level中的叶节点，只存放了辅助索引那列的数据，并不包含整个行的数据，但是他后面存放了一个“指针”，比如黄色的Rudd，后面存的是4:705:01，代表完整的行记录在第705页的第一条记录。
所以非聚集索引有二次查询的问题：
非聚集索引叶节点仍然是索引节点，只是有一个指针指向对应的数据块，因此如果使用非聚集索引查询，而查询列中包含了其他该索引没有覆盖的列，那么他还要进行第二次的查询，查询节点上对应的数据行的数据。
如何解决非聚集索引二次查询的问题：
建立两列以上的索引，即可查询复合索引里的列的数据而不需要进行回表二次查询，如index(col1, col2)，执行下面的语句：
select col1, col2 from t1 where col1 = '213';

因为复合索引的列包括了col1和col2，不需要查询别的列，所以不需要进行二次查询。
要注意使用复合索引需要满足最左侧索引的原则，也就是查询的时候如果where条件里面没有最左边的一到多列，索引就不会起作用。（看不懂的话后面讲）
通俗的讲讲最左索引原则吧:
假设创建了复合索引index(A,B,C)，那么其实相当于创建了如下三个组合索引：
index(A,B,C)
index(A,B)
index(A)
这就是最左索引原则，就是从最左侧开始组合。




#### 1.18.4.3. B+树索引的分裂
<a href="#menu" style="float:right">目录</a>

#### 1.18.4.4. B+树索引的管理
<a href="#menu" style="float:right">目录</a>

### 1.18.5. B+树索引的使用
<a href="#menu" style="float:right">目录</a>

#### 1.18.5.1. 不同应用中B+树索引的使用

#### 1.18.5.2. 联合索引

#### 1.18.5.3. 覆盖索引

#### 1.18.5.4. 优化器选择不使用索引的情况

#### 1.18.5.5. 索引提示

#### 1.18.5.6. Multi-Range Read优化

#### 1.18.5.7. Index Condition Pushdown 优化

### 1.18.6. 哈希算法
<a href="#menu" style="float:right">目录</a>

#### 1.18.6.1. InnoDB哈希算法

nnoDB存储引擎使用哈希算法对字典进行查找，其冲突机制采用链表方式，哈希函数采用除法散列方式。对于缓冲池页的哈希表来说，在缓冲池中的Page页都有一个chain指针，它指向相同哈希函数值的页。而对于除法散列，m的取值为略大于2倍的缓冲池页数量的质数。

例如：当前参数innodb_buffer_pool_size的设置大小为10MB，则共有640个16KB的页。那对于缓冲池页内存的哈希表来说，需要分配640×2=1280个槽，但是1280不是质数，需要取比1 280略大的一个质数，应该是1399，所以在启动时会分配1399个槽的哈希表，用来哈希查询所在缓冲池中的页。哈希表本身需要20个字节，每个槽需要4个字节，因此一共需要20+4×1399=5616个字节。其中哈希表的20个字节从innodb_additional_mem_pool_size中进行分配，4×1399=5596个字节从系统申请分配。因此在对InnoDB存储引擎进行内存分配规划时，也应该规划好哈希表这部分内存，这部分内存一般从系统分配，没有参数可以控制。对于前面我们说的128GB的缓冲池内存，则分配的哈希表和槽一共需要差不多640MB的额外内存空间。

那InnoDB存储引擎对于页是怎么进行查找的呢？上面只是给出了一般的算法，怎么将要查找的页转换成自然数呢？

InnoDB存储引擎的表空间都有一个space号，我们要查的应该是某个表空间的某个连续16KB的页，即偏移量offset。InnoDB存储引擎将space左移20位，然后加上这个space和offset，即关键字K=space<<20+space+offset，然后通过除法散列到各个槽中。


#### 1.18.6.2. 自适应哈希算法
自适应哈希索引采用之前，我们讨论哈希表的方式实现。不同的是，这又是数据库自己创建并使用的，DBA本身并不能对其进行干预。当在配置文件中启用了参数innodb_adaptive_hash_index后，数据库启动时会自动创建槽数为innodb_buffer_pool_size/256个的哈希表。例如，对当前参数innodb_buffer_pool_size设置为10MB，则启动时InnoDB存储引擎会创建一个有10M/256=40 960个槽的自适应哈希表。

自适应哈希索引经哈希函数映射到一个哈希表中，因此自适应哈希索引对于字典类型的查找非常快速，如SELECT * FROM TABLE WHERE index_col='xxx'，但是对于范围查找就无能为力了。通过命令SHOW ENGINE INNODB STATUS可以看到当前自适应哈希索引的使用状况，如：
```
show engine innodb status\G

-------------------------------------
INSERT BUFFER AND ADAPTIVE HASH INDEX
-------------------------------------
Ibuf: size 1, free list len 0, seg size 2, 0 merges
merged operations:
 insert 0, delete mark 0, delete 0
discarded operations:
 insert 0, delete mark 0, delete 0
Hash table size 34673, node heap has 0 buffer(s)
Hash table size 34673, node heap has 0 buffer(s)
Hash table size 34673, node heap has 0 buffer(s)
Hash table size 34673, node heap has 0 buffer(s)
Hash table size 34673, node heap has 0 buffer(s)
Hash table size 34673, node heap has 0 buffer(s)
Hash table size 34673, node heap has 0 buffer(s)
Hash table size 34673, node heap has 0 buffer(s)
0.00 hash searches/s, 0.00 non-hash searches/s


```

现在可以看到自适应哈希索引的使用信息了，包括自适应哈希索引的大小、使用情况、每秒使用自适应哈希索引搜索的情况。需要注意的是，哈希索引只能用来搜索等值的查询，如select * from table where index_col='xxx'，而对于其他查找类型，如范围查找，是不能使用哈希索引的。因此，这里出现了non-hash searches/s的情况。hash searches：non-hash searches可以大概知道使用哈希索引后的效率。

由于自适应哈希索引是由InnoDB存储引擎自己控制的，所以这里的信息只供我们参考而已。不过我们可以通过参数innodb_adaptive_hash_index来禁用或启动此特性，默认为开启。

### 1.18.7. 全文索引
<a href="#menu" style="float:right">目录</a>

从InnoDB 1.2.x开始支持全文索引，其支持MyISAM存储引擎的全部功能，并且还支持其他的一些特性。

```
select * from where xxx like "%sss%";
```
这种全文查找即使字段使用了索引，查询时也不会走索引。


#### 1.18.7.1. 倒排索引
<a href="#menu" style="float:right">目录</a>

全文索引通常使用倒排索引(inverted index)来实现.倒排索引和B+索引一样，也是一种索引结构。它在辅助表中存储了单词与单词自身在一个或者多个文档中所在位置之间的映射，其拥有两种表现形式：
* inverted file index ,其形式是{单词，单词所在的文档ID}
* full inverted index ，其表现形式{单词，{单词所在的文档ID，在文档中的位置}}

#### 1.18.7.2. InnoDB全文索引
InnoDB全文索引采用的是 full inverted index 

#### 1.18.7.3. 全文索引

```
mysql> help match ;
Name: 'MATCH AGAINST'
Description:
Syntax:
MATCH (col1,col2,...) AGAINST (expr [search_modifier])

MySQL has support for full-text indexing and searching:

o A full-text index in MySQL is an index of type FULLTEXT.

o Full-text indexes can be used only with InnoDB or MyISAM tables, and
  can be created only for CHAR, VARCHAR, or TEXT columns.

o As of MySQL 5.7.6, MySQL provides a built-in full-text ngram parser
  that supports Chinese, Japanese, and Korean (CJK), and an installable
  MeCab full-text parser plugin for Japanese. Parsing differences are
  outlined in
  http://dev.mysql.com/doc/refman/5.7/en/fulltext-search-ngram.html,
  and
  http://dev.mysql.com/doc/refman/5.7/en/fulltext-search-mecab.html.

o A FULLTEXT index definition can be given in the CREATE TABLE
  statement when a table is created, or added later using ALTER TABLE
  or CREATE INDEX.

o For large data sets, it is much faster to load your data into a table
  that has no FULLTEXT index and then create the index after that, than
  to load data into a table that has an existing FULLTEXT index.

Full-text searching is performed using MATCH() ... AGAINST syntax.
MATCH() takes a comma-separated list that names the columns to be
searched. AGAINST takes a string to search for, and an optional
modifier that indicates what type of search to perform. The search
string must be a string value that is constant during query evaluation.
This rules out, for example, a table column because that can differ for
each row.

There are three types of full-text searches:

o A natural language search interprets the search string as a phrase in
  natural human language (a phrase in free text). There are no special
  operators, with the exception of double quote (") characters. The
  stopword list applies. For more information about stopword lists, see
  http://dev.mysql.com/doc/refman/5.7/en/fulltext-stopwords.html.

  Full-text searches are natural language searches if the IN NATURAL
  LANGUAGE MODE modifier is given or if no modifier is given. For more
  information, see
  http://dev.mysql.com/doc/refman/5.7/en/fulltext-natural-language.html
  .

o A boolean search interprets the search string using the rules of a
  special query language. The string contains the words to search for.
  It can also contain operators that specify requirements such that a
  word must be present or absent in matching rows, or that it should be
  weighted higher or lower than usual. Certain common words (stopwords)
  are omitted from the search index and do not match if present in the
  search string. The IN BOOLEAN MODE modifier specifies a boolean
  search. For more information, see
  http://dev.mysql.com/doc/refman/5.7/en/fulltext-boolean.html.

o A query expansion search is a modification of a natural language
  search. The search string is used to perform a natural language
  search. Then words from the most relevant rows returned by the search
  are added to the search string and the search is done again. The
  query returns the rows from the second search. The IN NATURAL
  LANGUAGE MODE WITH QUERY EXPANSION or WITH QUERY EXPANSION modifier
  specifies a query expansion search. For more information, see
  http://dev.mysql.com/doc/refman/5.7/en/fulltext-query-expansion.html.

URL: http://dev.mysql.com/doc/refman/5.7/en/fulltext-search.html

```

使用案例

```
Examples:
mysql> SELECT id, body, MATCH (title,body) AGAINST
    ('Security implications of running MySQL as root'
    IN NATURAL LANGUAGE MODE) AS score
    FROM articles WHERE MATCH (title,body) AGAINST
    ('Security implications of running MySQL as root'
    IN NATURAL LANGUAGE MODE);
+----+-------------------------------------+-----------------+
| id | body                                | score           |
+----+-------------------------------------+-----------------+
|  4 | 1. Never run mysqld as root. 2. ... | 1.5219271183014 |
|  6 | When configured properly, MySQL ... | 1.3114095926285 |
+----+-------------------------------------+-----------------+

```
MySQL通过MATCH (col1,col2,...) AGAINST (expr [search_modifier])来使用全文索引。
MATCH：指定需要被查询的列，AGAINST指定了何种方法进行查询。

* search_modifier
    * IN NATURAL LANGUAGE MODE 
    * IN NATURAL LANGUAGE MODE WITH QUERY EXPANSION
    * IN BOOLEAN MODE
    * IN BOOLEAN MODE WITH QUERY EXPANSION

**NATURAL LANGUAGE** 
表示查询带有指定word的文档。
```
select  * from  tableName where MATCH(body(查询的字段)) AGAINST ('xxxx(查询的单词)' IN NATURAL LANGUAGE MODE);
```
该模式是数据库默认模式，因此可以省略
```
select  * from  tableName where MATCH(body) AGAINST ('xxxx');
```

在WHERE中使用全文索引查询，查询返回的结果是根据相关性进行降序排序。相关性是一个非负的浮点数字，0表示没有任何相关性。
* 相关性计算依据 ：
    * word是否在文档中出现
    * 在文档中出现的次数
    * 在索引列中的数量
    * 多少个文档包含该word.

**BOOLEAN MODE**

查询字符串前后都有特殊的含义.

以下标识name单词必须出现，query单词一定不存在
```
AGAINST ('+name -query' IN BOOLEAN  MODE);
```
* 操作符介绍
    * "+":表示该单词必须存在
    * "-":表示该单词必须被排除
    * "(no operator)": 可选的，出现的话相关性会更高
    * "@distance": 表示但吃之间的距离是否在距离字节之内
        * AGAINST ('"name query"@30' IN BOOLEAN  MODE); name, query两个单词的距离在30字节之内
    * ">"：出现该单词增加相关性
    * "<":出现该单词降低相关性
    * "~":出现该单词，相关性为负
    * "*":表示以该单词开头的单词，li*可以匹配li,liw,lisd
    * """: 表示短语
        * 'like hot',表示两个单词
        * '"like hot"',表示一个短语like hot.

**QUERY EXPANSION**

MYSQL还支持全文索引的扩展查询

## 1.19. 锁

### 1.19.1. 什么是锁
<a href="#menu" style="float:right">目录</a>

数据库系统使用锁是为了支持对共享资源进行并发访问，提供数据一致性和完整性。


#### 1.19.1.1. 锁
* 共享锁(shared lock)和排他锁(exclusive lock)
    * 读锁是共享的，可以多个线程同时读取相同的数据
    * 写锁是排他锁，任意时刻只能由一个线程操作同一个数据，否则将出现并发问题.获取到写锁时，其他线程禁止读写。
    * 根据SQL语句判定是读或者写，从而获取到对应的锁
* 锁一般由存储引擎管理，但服务器会为ALTER TABLE之类的语句使用表锁，忽略存储引擎的锁机制
* INSERT,UPDATE,DELETE,SELECT FOR UPDATE都会隐式采用行级锁，会根据实际情况确认是否升级为表锁
* 表锁
    * 锁定整张表
    * 性能/内存开销最小
    * MyISAM只支持表锁
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
            * 读共享模式，其他事务可以并发获取读锁
        * SELECT ... FOR UPDATE
            * 将会给该行加锁


   
   

### 1.19.2. lock与latch
<a href="#menu" style="float:right">目录</a>

* latch一般称为闩锁(轻量级的锁),因为其要求锁定的时间必须非常短。若持续的时间长,则应用的性能会非常差。在 InnoDB存储引擎中, latch又可以分为 mutex(互斥量)和 relock(读写锁)。其目的是用来保证并发线程操作临界资源的正确性,并且通常没有死锁检测的机制。
* lock的对象是事务,用来锁定的是数据库中的对象,如表、页、行。并且一般lock的对象仅在事务 commit或 rollback后进行释放(不同事务隔离级别释放的时间可能不同)。此外,lock,正如在大多数数据库中一样,是有死锁机制的。下表显示了lock与latch的不同。

lock与latch的比较
|条目|lock	|latch|
|---|---|---|
|对象|	事务|	线程
|保护	|数据库内容|	内存数据结构
|持续时间|	整个事务过程	|临界资源
|模式	|行锁、表锁、意向锁	读写锁、互斥量
|死锁	|通过 waits-for graph、 time out等机制进行无死锁检测与处理机制。|	无死锁检测与处理机制。仅通过应用程序加锁的顺序( lock leveling)保证无死锁的情况发生
|存在于|	Lock Manager的哈希表中|	每个数据结构的对象中

### 1.19.3. Innodb存储引擎的锁
<a href="#menu" style="float:right">目录</a>

#### 1.19.3.1. 锁的类型
<a href="#menu" style="float:right">目录</a>

* 行级锁
    * 共享锁(S Lock)，允许事务读一行数据
    * 排它锁(X Lock)，允许事务删除或更新一行数据
    * 一个事务获取到共享锁，其他事务只能获取到共享锁。一个事务获取到共享锁，其他事务无法获取带任何锁。也就是只有读读共享。

* 意向锁
    * 意向��是将锁定的对象分为多个层次，意味着事务希望在更细粒度上进行加锁，这种锁定方式允许在行级上和表级上的锁同时存在
    * 意向锁为表级锁
    * 分类
        * 意向共享锁(IS LOCK)：事务想要获得一张表中某几行的共享锁 
        * 意向排他锁(IX LOCK)：事务想要获得一张表中某几行的排他锁 

锁的兼容性
||IS|IX|S|X|
|---|---|---|---|---|
|IS|兼容|兼容|兼容|不兼容|
|IX|兼容|兼容|不兼容|不兼容|
|S|兼容|不兼容|兼容|不兼容|
|X|不兼容|不兼容|不兼容|不兼容|

当一个事务请求的锁模式与当前的锁兼容，InnoDB就将请求的锁授予该事务；反之如果请求不兼容，则该事务就等待锁释放

意向锁是InnoDB自动加的，不需要用户干预。

对于insert、update、delete，InnoDB会自动给涉及的数据加排他锁（X）；对于一般的Select语句，InnoDB不会加任何锁，事务可以通过以下语句给显示加共享锁或排他锁。

共享锁：select * from table_name where .....lock in share mode
排他锁：select * from table_name where .....for update


查看锁情况
```
mysql> show engine innodb status \G

------------
TRANSACTIONS
------------
Trx id counter 518146
Purge done for trx's n:o < 0 undo n:o < 0 state: running but idle
History list length 0
LIST OF TRANSACTIONS FOR EACH SESSION:
---TRANSACTION 421547932116832, not started
0 lock struct(s), heap size 1136, 0 row lock(s)
```

#### 1.19.3.2. 一致性非锁定读
<a href="#menu" style="float:right">目录</a>

#### 1.19.3.3. 一致性锁定读
<a href="#menu" style="float:right">目录</a>

#### 1.19.3.4. 自增长与锁
<a href="#menu" style="float:right">目录</a>

#### 1.19.3.5. 外键和锁
<a href="#menu" style="float:right">目录</a>


### 1.19.4. 锁的算法
<a href="#menu" style="float:right">目录</a>

#### 1.19.4.1. 行锁的三种算法

* Record Lock:单个记录上的锁
    * 锁定索引记录，如果没有定义索引，会使用隐式的主键来进行锁定
* Gap Lock:间隙锁，锁定一个范围，但不包含记录本身
* Next-Key Lock: Gap Lock + Record Lock,锁定一个范围，并且锁定记录本身
    * 锁定的不是一个值，而是一个范围
    * 比如一列的值为 10,11,12,13
        * 可锁定的区间为 (-无穷大，10)，[10,11),[11,12),[12,无穷大),
    * 可以解决Phantom Problem
    * 当查询的索引含有唯一属性时，会进行优化，降级为Record Lock,仅锁住索引本身，而不是范围。

**Phantom Problem问题**
默认的事务隔离级别下，Innodb存储引擎采用Next-Key Lock解决幻象问题(Phantom Problem)

Phantom Problem:只在同一事务下，连续两次读取数据不一致(增加了行数据)。

比如数据表中age列数据分别为4，5,6,7

如下语句，锁的将不会是5,6,7，这三列数据，而是(4,正无穷大)范围的列。
```
select age from xxx where age > 4 for update;
```

### 1.19.5. 锁的问题
<a href="#menu" style="float:right">目录</a>

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

### 1.19.6. 阻塞
<a href="#menu" style="float:right">目录</a>

```
mysql> show variables like "%innodb_lock_wait%";
+--------------------------+-------+
| Variable_name            | Value |
+--------------------------+-------+
| innodb_lock_wait_timeout | 50    |
+--------------------------+-------+
mysql> show variables like "%rollback_on%";
+----------------------------+-------+
| Variable_name              | Value |
+----------------------------+-------+
| innodb_rollback_on_timeout | OFF   |
+----------------------------+-------+

```
innodb_lock_wait_timeout ： 等待锁的超时时间，默认50s
innodb_rollback_on_timeout:超时是否回滚

当发生超时时，数据库会抛出1205错误。

### 1.19.7. 死锁
<a href="#menu" style="float:right">目录</a>

#### 1.19.7.1. 死锁的概念

死锁指两个或者两个以上的事务在执行过程中，引争夺锁资源而造成互相等待的现象。若无外力作用，事务将无法推进下去。

InnoDB死锁产生时解决:锁并发等待时，会检测是否存在回路(互相持有对方请求的资源)，若存在则有死锁，然后选择undo量最小的事务进行回滚。

**避免死锁**：
有多种方法可以避免死锁，这里只介绍常见的三种：
1、如果不同程序会并发存取多个表，尽量约定以相同的顺序访问表，可以大大降低死锁机会。
2、在同一个事务中，尽可能做到一次锁定所需要的所有资源，减少死锁产生概率；
3、对于非常容易产生死锁的业务部分，可以尝试使用升级锁定颗粒度，通过表级锁定来减少死锁产生的概率；

#### 1.19.7.2. 死锁的实例

|事务1|事务2|
|---|---|
|BEGIN;||
|SELECT * FROM user WHERE age=1 for update;  |BEGIN;|
||SELECT * FROM user WHERE age=2 for update;|
|SELECT * FROM user WHERE age=2 for update;因为持有age=2的事务2还没有提交，所以这里就阻塞等待|-|
||SELECT * FROM user WHERE age=1 for update;抛出错误，发生死锁异常|
|||

### 1.19.8. 锁升级
<a href="#menu" style="float:right">目录</a>

锁升级是将当前的锁的粒度降低，比如行锁升级为页锁，页锁升级为表锁。

InnoDB在绝大部分情况会使用行级锁，因为事务和行锁往往是我们选择InnoDB的原因，但是有些情况我们也考虑使用表级锁。
1、当事务需要更新大部分数据时，表又比较大，如果使用默认的行锁，不仅效率低，而且还容易造成其他事务长时间等待和锁冲突。
2、事务比较复杂，很可能引起死锁导致回滚。

### 1.19.9. 乐观锁和悲观锁

* 悲观锁
    * 假定会发生并发冲突，屏蔽一切可能违反数据完整性的操作
    * 悲观锁，从字面理解就是很悲观，每次去拿数据的时候都认为别人会修改，所以在每次拿的时候对数据上锁，这样就保证了数据的准确性。比如mysql中的表锁，行锁。
* 乐观锁
    * 假设不会发生并发冲突，只在提交操作时检查是否违反数据完整性。
    * 在每次去拿数据的时候认为别人不会修改，不对数据上锁，但是在提交更新的时候会判断在此期间数据是否被更改，如果被更改则提交失败。
    * 实现方案
        * 增加版本字段
        * 对字段进行比较

#### 1.19.9.1. 多版本并发控制MVCC

* Multi-Version Concurrency Control,乐观锁的一种实现方式

* MVCC是行级锁的一个变种，很多情况下可以避免加锁，所以开销更低。大都实现了非阻塞读操作，写操作也只锁定必要的行。

* InnoDB的实现
    * 每行记录后保存两个隐藏的列来实现
    * 一个列保存了行的创建版本号，一个列保存行的过期(删除)版本号
    * 每开始一个新事务，系统版本号都会自动递增。事务开始时刻的系统版本号会作为事务的版本号。用来和查询到的每行记录的版本号进行比较。

**特点**
* MVCC其实广泛应用于数据库技术，像Oracle,PostgreSQL等也引入了该技术，即适用范围广
* MVCC并没有简单的使用数据库的行锁，而是使用了行级锁，row_level_lock,而非InnoDB中的innodb_row_lock.

**基本原理**
MVCC的实现，通过保存数据在某个时间点的快照来实现的。这意味着一个事务无论运行多长时间，在同一个事务里能够看到数据一致的视图。根据事务开始的时间不同，同时也意味着在同一个时刻不同事务看到的相同表里的数据可能是不同的。

**基本特征**
* 每行数据都存在一个版本，每次数据更新时都更新该版本。
* 修改时Copy出当前版本随意修改，各个事务之间无干扰。
* 保存时比较版本号，如果成功（commit），则覆盖原记录；失败则放弃copy（rollback）

**InnoDB存储引擎MVCC的实现策略**
在每一行数据中额外保存两个隐藏的列：当前行创建时的版本号和删除时的版本号（可能为空，其实还有一列称为回滚指针，用于事务回滚，不在本文范畴）。这里的版本号并不是实际的时间值，而是系统版本号。每开始新的事务，系统版本号都会自动递增。事务开始时刻的系统版本号会作为事务的版本号，用来和查询每行记录的版本号进行比较。

每个事务又有自己的版本号，这样事务内执行CRUD操作时，就通过版本号的比较来达到数据版本控制的目的。

**MVCC下InnoDB的增删查改是怎么工作的**
1.插入数据（insert）:记录的版本号即当前事务的版本号

执行一条数据语句：insert into testmvcc values(1,"test");

假设事务id为1，那么插入后的数据行如下：
![Mysql中MVCC的使用及原理详解](http://p98.pstatp.com/large/pgc-image/1536286392011332dc79980)



 

2、在更新操作的时候，采用的是先标记旧的那行记录为已删除，并且删除版本号是事务版本号，然后插入一行新的记录的方式。

比如，针对上面那行记录，事务Id为2 要把name字段更新

update table set name= 'new_value' where id=1;

![Mysql中MVCC的使用及原理详解](http://p98.pstatp.com/large/pgc-image/15362864790262a85896e55)

 

3、删除操作的时候，就把事务版本号作为删除版本号。比如

delete from table where id=1;

![Mysql中MVCC的使用及原理详解](http://p9.pstatp.com/large/pgc-image/15362865324150dfbc7bf66)

 

4、查询操作：

从上面的描述可以看到，在查询时要符合以下两个条件的记录才能被事务查询出来：

1) 删除版本号未指定或者大于当前事务版本号，即查询事务开启后确保读取的行未被删除。(即上述事务id为2的事务查询时，依然能读取到事务id为3所删除的数据行)

2) 创建版本号 小于或者等于 当前事务版本号 ，就是说记录创建是在当前事务中（等于的情况）或者在当前事务启动之前的其他事物进行的insert。

（即事务id为2的事务只能读取到create version<=2的已提交的事务的数据集）

补充：

1.MVCC手段只适用于Msyql隔离级别中的读已提交（Read committed）和可重复读（Repeatable Read）.

2.Read uncimmitted由于存在脏读，即能读到未提交事务的数据行，所以不适用MVCC.

原因是MVCC的创建版本和删除版本只要在事务提交后才会产生。

3.串行化由于是会对所涉及到的表加锁，并非行锁，自然也就不存在行的版本控制问题。

4.通过以上总结，可知，MVCC主要作用于事务性的，有行锁控制的数据库模型。

**关于Mysql中MVCC的总结**
客观上，我们认为他就是乐观锁的一整实现方式，就是每行都有版本号，保存时根据版本号决定是否成功。

但由于Mysql的写操作会加排他锁（前文有讲），如果锁定了还算不算是MVCC？

了解乐观锁的小伙伴们，都知道其主要依靠版本控制，即消除锁定，二者相互矛盾，so从某种意义上来说，Mysql的MVCC并非真正的MVCC，他只是借用MVCC的名号实现了读的非阻塞而已。




## 1.20. 事务

### 1.20.1. 认识事务
<a href="#menu" style="float:right">目录</a>

#### 1.20.1.1. 事务特点

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

 
#### 1.20.1.2. 常见术语
* 术语：
    * 事务（transaction）指一组SQL语句；
    * 回退（rollback）指撤销指定SQL语句的过程；
    * 提交（commit）指将未存储的SQL语句结果写入数据库表；   
    * 保留点（ savepoint）指事务处理中设置的临时占位符（ placeholder），你可以对它发布回退（与回退整个事务处理不同）。

#### 1.20.1.3. 基本语句
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

#### 1.20.1.4. 事务分类

* 扁平事务Flat Transactions
* 带有保存点的扁平事务 Flat Transactions with savepoints
* 链事务 Chained Transactions 
* 嵌套事务 Nested Transactions
* 分布式事务 Distributed Transactions

**扁平事务**
扁平事务 是事务类型中最简单的一种，但是在实际生产环境中，这可能是使用最频繁的事务，在扁平事务中，所有操作都处于同一层次，其由BEGIN WORK开始，由COMMIT WORK或ROLLBACK WORK结束，其间的操作是源自的，要么都执行，要么都回滚，因此扁平事务是应用程序称为原子操作的的基本组成模块

下面显示了扁平事务的三种不同结果：
![扁平事务](https://img-blog.csdnimg.cn/20181118105146757.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxMzMzNTgy,size_16,color_FFFFFF,t_70)


给出的扁平事务的三种情况，同时也给出了一个典型的事务处理应用中，每个结果大概占用的百分比。再次提醒，扁平事务虽然简单，但是在实际环境中使用最为频繁，也正因为其简单，使用频繁，故每个数据库系统都实现了对扁平事务的支持。

扁平事务的主要限制是不能提交或者回滚事务的某一部分，或分几个步骤提交。
下面给出一个扁平事务不足以支持的例子。例如用户在旅行网站上进行自己的旅行度假计划，用户设想从杭州到意大利的佛罗伦萨，这两个城市没有直达的班机，需要用户预订并转呈航班，需要或者搭火车等待。用户预订旅行度假的事务为

```
S1：预订杭州到上海的高铁

S2：上海浦东国际机场坐飞机，预订到米兰的航班

S3：在米兰转火车前往佛罗伦萨，预订去佛罗伦萨的火车
```

但是当用户执行到S3时，发现由于飞机到达米兰的时间太晚，已经没有当天的火车，这时用户希望在米兰当地住一晚，第二天出发去佛罗伦萨。这时如果事务为扁平事务，需要回滚之前S1 S2 S3的三个操作，这个代价明显很大，因为当再次进行该事务是，S1 S2的执行计划是不变的，也就是说，如果支持有计划的回滚操作，那么不需要终止整个事务，因此就出现了带有保存点的扁平事务。

**带有保存点的扁平事务**
带有保存点的扁平事务 除了支持扁平事务支持的操作外，允许在事务执行过程中回滚同一事务中较早的一个状态。这是因为某些事务可能在执行过程中出现的错误并不会导致所有的操作都无效，放弃整个事务不合乎要求，开销太大，保存点用来通知事务系统应该记住事务当前的状态，以便当之后发生错误时，事务能回到保存点当时的状态。

对于扁平的事务来说，隐式的设置了一个保存点。然而整个事务中，只有这一个保存点，因此，回滚只能会滚到事务开始时的状态，保存点用SAVE WORK函数来建立，通知系统记录当前的处理状态。当出现问题时，保存点能用作内部的重启动点，根据应用逻辑，决定是回到最近一个保存点还是其他更早的保存点。图显示了事务中使用的保存点

![带有保存点的扁平事务](https://img-blog.csdnimg.cn/2018111811175949.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxMzMzNTgy,size_16,color_FFFFFF,t_70)

显示了如何在事务中使用保存点，灰色背景部分表示由ROLLBACK WORK而导致部分回滚，实际并没有执行操作，当用BEGIN WORK开启一个事务时，隐式地包含了一个保存点，当事务通过ROLLBACK WORK：2发出部分回滚命令时，事务会滚到保存点2，接着依次执行，并再次执行到ROLLBACK WORK：7，知道最后COMMIT WORK操作，表示事务结束，除灰色阴影部分的操作外，其余操作都已经执行，并且提交。

另一个需要注意的是，保存点在事务内部是递增的，从图中可以看出，有人可能会想，返回保存点2以后，下一个保存点可以为3，因为之前的工作已经终止，然而新的保存点编号为5，这意味着ROLLBACKU 不影响保存点的计数，并且单调递增编号能保持事务执行的整个历史过程，包括在执行过程中想法的改变。

此外，当事务通过ROLLBACK WORK：2命令发出部分回滚命令时，要记住事务并没有完全被回滚，只是回滚到保存点2而已，这代表当前事务是活跃的，如果想要回滚事务，还需要执行ROLLBACKUP WORK。

**链事务**
链事务 可视为保存点模式的一种变种，带有保存点的扁平事务，当发生系统崩溃是，所有的的保存点都将消失，因为其保存点是易失的，这意味着当进行恢复时，事务需要从开始处重新执行，而不能从最近的一个保存点继续执行

链事务的思想是：在提交一个事务时，释放不需要的数据对象，将必要的处理上下文隐式地传给下一个要开始的事务，提交事务操作和开始下一个事务操作 将合并为一个原子操作，这意味着下一个事务将看到上一个事务的结果，就好像一个事务中进行的一样，如图显示了链事务的工作方式：
![链事务](https://img-blog.csdnimg.cn/20181118112120467.png)

链事务与带有保存点的扁平事务不同的是，带有保存点的扁平事务能回滚到任意正确的保存点，而链事务中的回滚仅限当前事务，即只能恢复到最近的一个保存点，对于锁的处理，两者也不相同，锁事务在执行COMMIT后即释放了当前所持有的锁，而带有保存点的扁平事务不影响迄今为止所持有的锁。

**嵌套事务**

嵌套事务 是一个层次结构框架，由一个顶层事务(top-level transaction)控制着各个层次的事务，顶层事务之下嵌套的事务被称为子事务，其控制每一个局部的变换，结构如下

![嵌套事务](https://img-blog.csdnimg.cn/2018111811245012.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxMzMzNTgy,size_16,color_FFFFFF,t_70)
如图可以发现，在恢复时采用保存点技术比嵌套查询有更大的灵活性。例如在完成Tk3这事务时，可以会滚到保存点S2的状态。而在嵌套查询的层次结构中，这是不被允许的。

* 下面给出MOSS对嵌套事务的定义
    * 嵌套事务是由若干事务组成的一棵树，子树既可以是嵌套事务也可以是扁平事务
    * 处在叶节点的事务是扁平事务，但是每个事务从根到叶节点的距离可以说是不同的
    * 位于根节点的事务称为顶层事务，其他称为自事务。事务的前驱称(predecessor)为父事务(parent)，事务的下一层称为儿子事务(child)
    * 子事务既可以提交也可以回滚。但是它的提交操作并不马上生效。除非其父事务已经提交。因此可以推论出，任何子事务都在顶层事务提交后才真正的提交
    * 树中的任意事务回滚会引起它的所有子事务一同回滚，故子事务仅保留ACI特性而不具有D特性

在Moss的理论中，实际的工作是交由叶子节点完成，即只有叶子节点的事务才能才能访问数据库、发送信息、获取其他类型的资源。而高层的事务仅负责逻辑控制。决定合适调用相关的子事务。即使一个系统不支持嵌套事务，用户也可以通过保存点技术来模拟嵌套事务，如图
![嵌套事务](https://img-blog.csdnimg.cn/20181118112731573.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxMzMzNTgy,size_16,color_FFFFFF,t_70)

但是用保存点技术来模拟嵌套事务在锁的持有方面还是与嵌套查询有些区别。当通过保存点技术来模拟嵌套事务时，用户无法选择哪些锁需要被子事务集成，哪些需要被父事务保留，这就是说，无论有多少个保存点，所有被锁住的队形都可以被得到和访问。而在嵌套查询中，不同的子事务在数据库对象上持有的锁是不同观点。例如一个父事务P1 其持有对象X和Y的排他锁，现在要开始调用子事务P11 ,那么父事务P1 可以不传递锁，也可以传递所有的锁，也可以只传递一个排他锁，如果子事务P11 中还持有对象Z的排他锁，那么通过反向继承(counter-inherited)父事务P1 将持有3个对象X Y Z的排他锁。如果这时再次调用一个子事务P12 ，那么它可以传递哪里已经持有的锁。

然而，如果系统支持嵌套事务中并行地执行的各个子事务，在这种情况下，采用保存点的扁平事务来模拟嵌套事务就不切实际了。这从另一个方面反映出，想要实现事务间的并行性，需要真正支持的嵌套事务。

**分布式事务**
分布式事务 通常是一个分布式环境下运行的扁平事务，因此需要根据数据所在位置访问网络中的不同节点。

假如一个用户在ATM机上进行银行的转账操作，例如持卡人从招商银行存储卡转账10 000 元到工商银行的存储卡。这种情况下，可以将ATM机视为节点A，招商银行的后台数据库视为节点B，工商银行的后台数据库视为C，这个转账的操作可分解为以下的步骤

```
节点A发出转账命令
节点B执行存储卡中的余额减去10 000
节点C执行存储卡终端的余额增加10 000
节点A通知用户操作完成或者节点A通知用户操作失败
```
这里需要使用到分布式事务，因为节点A不能通过一台数据库就完成任务，其需要访问网络中两个节点的数据库，而在每个节点的数据库执行的实务操作有都是扁平的，对于分布式事务，其同样需要满足ACID特性，要么都发生，要么都失败。对于上述例子，如果2 3 步中任何一个操作失败，都会导致整个分布式事务回滚，若非这样，结果非常可怕。

对于InnoDB存储引擎来说，其支持扁平事务，带保存点的事务，链事务，分布式事务。对于嵌套事务，其原生不支持。因此对有并发事务需求的用户来说,MySQL数据库或InnoDB存储引擎就显得无能为力，然而用户仍可以通过带保存点的事务来模拟串行的嵌套事务。

### 1.20.2. 事务的实现
<a href="#menu" style="float:right">目录</a>

* redo log 称为重做日志
    * 用来保证事务的原子性和持久性。通常是物理日志，记录的是页的物理修改操作。
    * 基本是顺序写，在运行阶段不需要对其进行读取
* undo log
    * 用来保证事务的一致性。undo是逻辑日志，根据每行记录进行记录。
    * undo log 不是redo log 的逆过程。
    * 用来帮助实现事务回滚和MVCC功能
    * 随机读写

#### 1.20.2.1. redo
<a href="#menu" style="float:right">目录</a>

* 重做日志包含两部分
    * 内存中的重做日志缓冲 redo log buffer，其是易失的
    * 重做日志文件 redo log file ,其是持久的
    * 重做日志是在存储引擎层产生

* 持久性实现
    * 当事务提交时(commit),必须将该事务所有的日志写入到重做日志文件(redo log 文件和undo log 文件)进行持久化。写入日志成功才能算提交成功。
    * 重做日志日志是先写入日志缓冲区，再同步到硬盘
    * 重做日志日志刷新到磁盘的策略
        * innodb_flush_log_at_trx_commit 控制
        * 可以根据硬盘性能，数据库性能，数据重要性做不同的选择
        * 0:事务提交时不进行写入重做日志操作，这个操作在master thread中 完成，而该线程隔1s进行一次fstync操作。
        * 1:事务提交时必须调用一次fsync操作
        * 2:表示事务提交时将重做日志写入重做日志文件，但写入的是文件系统的缓存，没有fsync同步到文件。
            * 数据库发生宕积，操作系统没有宕积，重启数据库之后仍然可以将这部分数据fsync到文件，不会发生事务丢失
            * 操作系统宕积，会丢失还未同步到文件的事务信息
        * 不同配置下插入50万行下的性能对比
            * 0: 13.90秒
            * 1: 1分53.11秒
            * 2: 23.37秒

```
+--------------------------------+-------+
| Variable_name                  | Value |
+--------------------------------+-------+
| innodb_flush_log_at_trx_commit | 1     |
+--------------------------------+-------+

```

* log block 
    * 重做日志以512字节进行存储，意味着重做日志缓存、重做日志文件都是以块(block)的方式进行保存，称为重做日志块(log block),每块大小为512字节。
    * 若大于512字节，则需要进行分割进行存储
    * 由于重做日志块的大小和磁盘扇区一样都是512字节。因此重做日志的写入可以保证原子性，不需要双写技术
* 当发生宕积时，数据库通过redo日志进行数据恢复。所以只要事务消息写入redo 日志，还没有同步到数据库文件，即使发生宕积，数据也能够恢复。

#### 1.20.2.2. undo 
<a href="#menu" style="float:right">目录</a>

* undo log用于实现事务回滚。
* 存放位置
    * 数据库内部的一个特殊段(segment)中，这个段称为undo 段。
    * 该段位于共享表空间内。
* undo 并不是将数据库物理地恢复到事务执行之前的状态，而是逻辑地恢复到原来的样子
    * 比如插入100万条数据，表空间增大，回滚后，表的空间不会因此收缩。
    * 进行回滚时，实际做的是与之前相反的操作
        * 对于insert,则回滚执行delete
        * 对于delete,则回滚执行insert
        * 对于update,则回滚执行想法的update
* undo 的另一个功能MVCC
    * 存储引擎的MVCC是通过undo实现的
    * 当用户读取一行记录时，若该记录已经被其他事务占用，当前事务可以通过undo读取之前的版本信息，以实现非锁定读。
* undo log 也会产生redo log,也就是redo luo 的产生会伴随着redo log的产生，这是因为undo log也需要持久性的保护。

* 存储管理
    * Innodb存储引擎对undo的管理采用段的方式
    * 存储引擎有回滚段(rollback segment)，每个回滚段记录了1024个undo log segment.而在每个undo log segment段中进行undo页的申请。

* 事务在undo log segment分配页并写入undo log 的这个过程同样需要写入重做日志。事务提交时，InnoDB存储引擎会做
    * 将undo log 放入列表中，以供之后的perge操作
    * 判断undo log 所在的页是否可以重用，若可以则分配给下个事务使用

* 事务提交后并不能马上删除undo log及undo log 所在的页。这是因为可能还有其他事务需要通过undo log来得到行记录之前的版本，故事务 提交时将undo log放入一个链表中，是否删除undo log以及undo log所在的页由purge线程来判断。

* 若为一个事务分配一个单独的undo页，会非常浪费存储空间，特别是对于OLTP的应用类型。因为在事务提交时，可能并不能 马上释放页。
    * Innodb实现了undo 页的重用
    * 当事务进行提交时，首先将undo log放入链表中，然后判断undo 页的使用空间是否小于3/4,若是则表示该页可以被重用，之后新的undo log记录在当前undo log的后面。
    * 由于存放undo log的列表是以记录进行组织的，而undo页可能存放折不同事务的undo log。因此purge操作需要设计磁盘的离散化读取操作，因此purge是一个缓慢的操作。 

```
mysql> show variables like "%undo%";
+--------------------------+------------+
| Variable_name            | Value      |
+--------------------------+------------+
| innodb_max_undo_log_size | 1073741824 |
//rollback segment文件所在的路径
| innodb_undo_directory    | ./         |
//
| innodb_undo_log_truncate | OFF        |
//rollback segment的个数
| innodb_undo_logs         | 128        |
//rollback segment文件的数量
| innodb_undo_tablespaces  | 0          |
+--------------------------+------------+

```
#### 1.20.2.3. purge 
<a href="#menu" style="float:right">目录</a>

Innodb支持MVCC，所以删除和更新记录不能在事务提交时进行处理。因为这时其他事务可能正在引用这一行，故需要保存记录之前的版本。而是否删除由purge来进行判断。若该行记录已经不会被任何其他事务引用，那么就可以进行真正的删除操作。

purge操作是清理之前的delete和update操作，将上述操作最终完成。

#### 1.20.2.4. group commit 
<a href="#menu" style="float:right">目录</a>

为了提高fsync的效率，当前数据库都提供了group commit 的功能，即一次fsync可以刷新确保多个事务日志被写入文件。

对于Innodb,事务进行提交时会有两个操作
* 修改内存中事务对应的信息，并将日志写入重做日志缓冲
* 调用fsync将确保日志都从重做日志缓冲写入磁盘
 使用group commit 的功能，可以一次fsync可以刷新确保多个事务日志被写入文件



### 1.20.3. 事务控制语句
<a href="#menu" style="float:right">目录</a>

默认情况下，事务都是自动提交的，即执行SQL语句后就会马上执行COMMIT操作。可以通过SET AUTOCOMMIT=0禁止当前会话的自动提交。

* 启动事务
    * START TRANSATION;|BEGIN;
    * 存储过程中数据库分析器会将BEGIN解析为BEGIN ... END,因此在使用存储过程时必须使用 START TRANSATION启动事务。
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
        * 回退并不代表结束事务，需要显示调用ROLLBACK或者COMMIT。
    * 删除
        * RELEASE SAVEPOINT point1;删除保留点point1
    * 可以在MySQL代码中设置任意多的保留点，因为保留点越多，你就越能按自己的意愿灵活地进行回退.
    * 保留点在事务处理完成后自动释放
* 更改默认的提交行为
    * 默认自动提交，也就是事务里面多提语句时，写一句则提交一次
    * SET autocommit=0;
        * 取消自动提交,只有commit之后才会提交
    * autocommit针对单条连接，而不是MySQL服务器
* 设置事务隔离级别
    * SET TRANSACTION READ UNCOMMITED|READ COMMITED|REPEATABLE READ | SERIALIZABLE;

    

### 1.20.4. 隐式提交的SQL语句
<a href="#menu" style="float:right">目录</a>

### 1.20.5. 对于事务操作的统计
<a href="#menu" style="float:right">目录</a>

### 1.20.6. 事务的隔离级别
<a href="#menu" style="float:right">目录</a>

|隔离级别|脏读|不可重复读|幻象读|第一类丢失更新|第二类丢失更新|
|---|---|---|---|---|---|
|READ UNCOMMITED|出现|出现|出现|不出现|出现|
|READ UNCOMMITED|不出现|出现|出现|不出现|出现|
|REPEATABLE READ|不出现|不出现|出现|不出现|不出现|
|SERIALIZABLE|不出现|不出现|不出现|不出现|不出现|

Innodb默认使用REPEATABLE READ
事务隔离级别越低，事务请求的锁越少或保持锁的时间就越短，并发性也越高，但会更容易出现数据不一致的问题。

### 1.20.7. 分布式事务

#### 1.20.7.1. MYSQL分布式事务
<a href="#menu" style="float:right">目录</a>

Innodb存储引擎提供了对XA事务的支持，并通过XA事务来支持分布式事务的实现。
分布式事务指的是允许多个独立的事务参与到一个全局事务中，只要其中一个事务发生异常回滚内，其他的事务也要执行回滚操作，以保持数据的一致性，也就是分布式事务具有原子性。

在使用分布式事务时，InnoDB的事务隔离级别必须设置为Serialiaable

XA事务是一种规范，因此允许实现XA的数据库共同完成分布式事务。比如MySQL和Oracle.

* XA事务组成
    * 资源管理器： 提供访问事务资源的方法，通常一个数据库就是一个资源管理器
    * 事务管理器：协调参与全局事务中的各个事务，需要和参与全局事务的所有资源管理器进行通信
    * 应用程序： 定义事务的边界，指定全局事务中的边界
* 分布式事务使用两阶段提交方式
    * 阶段1: 所有参与者开始准备，告诉事务管理器它们好提交了
    * 阶段2: 事务管理器告诉资源管理器执行ROLLBACK还是COMMIT。
        * 如果任意一个节点不能提交，则所有的节点将被告知需要回滚。
相关命令
```
XA [START|BEGIN] xid [JOIN|RESUME]
XA END xid [SUSPEND [FOR MIGRATE]]
XA PREPARE xid
XA COMMIT xid [ONE PHASE]
XA ROLLBACK xid
XA RECOVER

```

#### 1.20.7.2. 内部XA事务
<a href="#menu" style="float:right">目录</a>

内部XA事务： 在存储引擎和插件之间，又或者在存储引擎与存储引擎之间使用。


![](https://github.com/lgjlife/Java-Study/blob/master/pic/mysql/mysql-inner-transication.png?raw=true)


### 1.20.8. 不好的事务习惯

**在循环中提交**

**使用自动提交**

**使用自动回滚**

**长事务**
事务太长可能会导致严重的并发问题，并且回滚和记录日志也很耗时，应当将长事务进行分解成小事务。

## 1.21. 备份与恢复

## 1.22. 性能优化基本的分析命令
<a href="#menu" style="float:right">目录</a>

### 1.22.1. explain
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

### 1.22.2. show indexs
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
## 1.23. 分库分表

### 1.23.1. 基本概念
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

### 1.23.2. 分布式事务
<a href="#menu" style="float:right">目录</a>

### 1.23.3. 应对多机数据查询
<a href="#menu" style="float:right">目录</a>

#### 1.23.3.1. 跨库Join
* 应用层处理，将单次Join操作分成多次查询
* 数据冗余，将表增加字段，冗余其他表的数据，需要考虑数据一致性问题
* 借助外部系统，比如搜索引擎解决一些跨库问题
#### 1.23.3.2. 外键约束
* 跨库不支持外键约束
* 需要应用层解决跨库数据一致性问题


## 1.24. 文件

### 1.24.1. 参数文件

### 1.24.2. 套接字文件

### 1.24.3. pid文件

### 1.24.4. 表结构定义文件



### 1.24.5. 日志

在MySQL中，主要有5种日志文件：
1.错误日志(error log)：记录mysql服务的启停时正确和错误的信息，还记录启动、停止、运行过程中的错误信息。
2.查询日志(general log)：记录建立的客户端连接和执行的语句。
3.二进制日志(bin log)：记录所有更改数据的语句，可用于数据复制。
4.慢查询日志(slow log)：记录所有执行时间超过long_query_time的所有查询或不使用索引的查询。
5.中继日志(relay log)：主从复制时使用的日志。

当存储事务日志的磁盘坏掉，数据是无法恢复的！因此选择一个可靠的磁盘还是相当有必要的，比如我们可以给我们的数据做raid10或者raid1（推荐使用raid10）来提供这种保障。事务日志不能帮助我们恢复数据，它的作用在于当操作系统崩溃时（比如异常断电）它能够保障已经提交的事物不丢失，而未提交的事物能回滚。如果想要恢复日志还得依赖于二进制日志。 


#### 1.24.5.1. 错误日志
<a href="#menu" style="float:right">目录</a>

#### 1.24.5.2. 查询日志
<a href="#menu" style="float:right">目录</a>
它是用来保存所有跟查询相关的日志，这种日志类型默认是关闭状态的，因为MySQL的用户有很多，如果将每个用户的查询操作都记录下来的话，对服务器的资源开销也是一件令人烦恼的事情。查询日志常见的几个参数：

```
mysql> show global variables like 'log';            　　　　　　#查看是否记录所有语句的日志信息于一般查询日志文件（general_log），默认是关闭状态。
+---------------+-------+
| Variable_name | Value |
+---------------+-------+
| log           | OFF   |
+---------------+-------+
1 row in set (0.00 sec)

mysql> show global variables like 'log_output';    　　　　　　#它有三个值，即{TABLE|FILE|NONE}，分别表示记录在表中（table），文件（file）中或是不记录（none）。注意，只有og_output的值等于 FILE时，general_log_file的参数才会有意义。且 table和file 可以同时出现，用逗号分隔即可
+---------------+-------+
| Variable_name | Value |
+---------------+-------+
| log_output    | FILE  |
+---------------+-------+
1 row in set (0.00 sec)

mysql> show global variables like 'general_log';            #查看是否启用查询日志功能
+---------------+-------+
| Variable_name | Value |
+---------------+-------+
| general_log   | OFF   |
+---------------+-------+
1 row in set (0.00 sec)

mysql> show global variables like 'general_log_file';        #定义了一般查询日志保存的文件
+------------------+----------------------------+
| Variable_name    | Value                      |
+------------------+----------------------------+
| general_log_file | /var/run/mysqld/mysqld.log |
+------------------+----------------------------+
1 row in set (0.00 sec)

mysql>
```



#### 1.24.5.3. 二进制日志
<a href="#menu" style="float:right">目录</a>

1>.什么是二进制文件
　　只记录修改相关的操作，记录了当前服务器的数据修改和有潜在可能性影响数据修改的语句。它用来实现复制的基本凭据。也就是说，你可以将生成环境中的MySQL的二进制文件拿到线下的服务器上运行一下，理论上你会拿到和生成环境中一样的数据哟，因此，二进制日志也叫复制日志。二进制日志文件默认在数据目录下，通常情况下为mysql-bin#（例如：mysql-bin.000001，mysql-bin000002）。
 
2>.查看MySQL日志文件
　　由于二进制文件格式是二进制类型的，我们不能用cat等查看普通文本类命令去查看这些二进制日志，我们可以通过mysqlbinlog来查看。注意“show master status; ”查看当前使用的二进制日志和下一个事件开始时的基于的位置。

```
MariaDB [(none)]> show binlog events\G    　　#查看mysql的日志
*************************** 1. row ***************************
   Log_name: mysql-bin.000001
        Pos: 4
 Event_type: Format_desc        　　　　　　　　#事件类型
  Server_id: 1                    　　　　　　　#指定服务器的唯一标识。
End_log_pos: 245
       Info: Server ver: 5.5.36-MariaDB-log, Binlog ver: 4
```

#### 1.24.5.4. 慢查询日志
<a href="#menu" style="float:right">目录</a>

查询执行时长超过指定时长的查询，即为慢查询。这里的慢不一定是查询语句存在问题，可能是因为访问你的资源当时不被许可访问，就好比你将一个一个MySQL库中的一个表添加写锁，那么别人就没有办法去查询这个表的内容啦，等到你将这个表锁解开之后，访问这张表的查询语句才会被执行。
　　慢查询日志是我们通常拿来定位系统上查询操作执行速度过慢时常用到的一个评估工具，所以在生产环境中很有必要启用慢查询日志功能的！它默认情况下也是没有启用的哟。慢查询常见的几个参数

```
mysql> show global variables like 'slow_query_log';            　　　　　　#是否启用慢查询日志，它的输出位置也取决log_output={table|file|none}。
+----------------+-------+
| Variable_name  | Value |
+----------------+-------+
| slow_query_log | OFF   |
+----------------+-------+
1 row in set (0.01 sec)

mysql> show global variables like 'slow_query_log_file';                #查看定义慢查询日志的文件
+---------------------+---------------------------------+
| Variable_name       | Value                           |
+---------------------+---------------------------------+
| slow_query_log_file | /var/run/mysqld/mysqld-slow.log |
+---------------------+---------------------------------+
1 row in set (0.02 sec)

mysql> show global variables like 'long_query_time';                　　#慢查询的时长，超出这个时长的都被记录为慢查询。
+-----------------+-----------+
| Variable_name   | Value     |
+-----------------+-----------+
| long_query_time | 10.000000 |
+-----------------+-----------+
1 row in set (0.00 sec)

mysql>
```

#### 1.24.5.5. 中继日志
<a href="#menu" style="float:right">目录</a>
顾名思义，这是用来记录错误的日志，但是不仅仅是记录错误信息，还包括MySQL启动，关闭，复制线程（指的是从服务器）的信息哟。错误日志默认是开启的。它主要记录的信息如下：
1>.服务器启动和关闭过程中的信息；
2>.服务器运行过程中的错误信息
3>.事件调度器运行一个事件时产生的信息
4>.在复制架构中的从服务器上启动从服务器线程时产生的信息
常见参数如下：

```
mysql> show global variables like 'log_error';            #指定错误日志文件位置。
+---------------+---------------------+
| Variable_name | Value               |
+---------------+---------------------+
| log_error     | /var/log/mysqld.log |
+---------------+---------------------+
1 row in set (0.00 sec)

mysql>
mysql> show global variables like 'log_warnings';        #是否将经过日志也记录在错误日志文件中去。
+---------------+-------+
| Variable_name | Value |
+---------------+-------+
| log_warnings  | 1     |
+---------------+-------+
1 row in set (0.00 sec)

mysql>
```

#### 1.24.5.6. 事务日志
<a href="#menu" style="float:right">目录</a>


## 1.25. 高可用

<a href="#menu" style="float:right">目录</a>

### 1.25.1. 主从复制

#### 1.25.1.1. 复制功能概述 

**复制解决了什么问题**
* 实现在不同服务器上的数据分布
    * 利用二进制日志增量进行
    * 不需要太多的带宽
    * 但是使用基于行的复制在进行性大批量的更改时会对带宽带来一定的压力，特别是在跨IDC环境下进行复制，因该分批进行 
* 实现数据读取的负载均衡
    * 需要其他组件配合完成
    * 利用DNS轮询的方式把程序的读连接到不同的备份数据库
    * 使用LVS，haproxy这样的代理方式
* 增强数据的安全性
    * 利用备库的备份来减少主库的负载
    * 复制并不代表备份
    * 方便进行数据库的高可用架构的部署
    * 避免MYSQL单点失败
* 实现数据的高可用和故障切换
* 实现数据库的在线升级

#### 1.25.1.2. 常见形式
* 多主方式 ，主主之间互相复制
* 一主一从
* 一主多从
* 多主一从
* 联级复制，树形结构
#### 1.25.1.3. 主从同步复制原理
* 主库将所有的写操作记录在binlog日志中，并生成log dump线程，将binlog日志传给从库的I/O线程
* 从库生成两个线程，一个是I/O线程，另一个是SQL线程
* I/O线程去请求主库的binlog日志，并将binlog日志中的文件写入relay log（中继日志）中
* SQL线程会读取relay loy中的内容，并解析成具体的操作，来实现主从的操作一致，达到最终数据一致的目的
#### 1.25.1.4. 主从同步配置

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
#### 1.25.1.5. 添加更多从服务器
有时候我们希望配置多台从服务器。如果是新建立的主从环境，没有什么数据，那么无论多少从服务器，搭建方式和上面说的没有什么两样。重点是，如果在已经运行了一段时间的主从环境中添加更多的从服务器，那么这台从服务器的配置就有点不一样。原因是：在主从配置的过程中，我们需要对服务器进行锁表操作，也就是说，任何数据都不可以继续写入，且持续的时间有可能会很长，在生产环境下，基本上是不允许的。
也就是说，我们不能在主服务器上下手，相反，我们应该在已经存在的从服务器这边下手。基本过程如下：

* 停止旧slave服务器的MySQL服务
* 把旧的slave服务器上的数据复制到新的从服务器里
* 为新服务器分配唯一的server-id和开启其他选项
* 重启服务器


## 1.26. SQL实战
<a href="#menu" style="float:right">目录</a>

本文内容来源于[牛课网题库](https://www.nowcoder.com/ta/sql?page=0)

### 1.26.1. 查找最晚入职员工的所有信息
<a href="#menu" style="float:right">目录</a> 

```
CREATE TABLE `employees` (
`emp_no` int(11) NOT NULL,
`birth_date` date NOT NULL,
`first_name` varchar(14) NOT NULL,
`last_name` varchar(16) NOT NULL,
`gender` char(1) NOT NULL,
`hire_date` date NOT NULL,
PRIMARY KEY (`emp_no`));
```
解答
```
select * from employees 
    order by hire_date desc limit 1;
```
### 1.26.2. 查找入职员工时间排名倒数第三的员工所有信息
<a href="#menu" style="float:right">目录</a> 
```
CREATE TABLE `employees` (
`emp_no` int(11) NOT NULL,
`birth_date` date NOT NULL,
`first_name` varchar(14) NOT NULL,
`last_name` varchar(16) NOT NULL,
`gender` char(1) NOT NULL,
`hire_date` date NOT NULL,
PRIMARY KEY (`emp_no`));
```
使用子查询
```
select * from  employees where hire_date =  (
    select hire_date
  from employees 
   order by hire_date  desc 
       limit 2,1 );
```
不使用子查询
```
select *
  from employees 
   order by hire_date  desc 
       limit 2,1 ;
```

### 1.26.3. 查找各个部门当前(to_date='9999-01-01')领导当前薪水详情以及其对应部门编号dept_no
<a href="#menu" style="float:right">目录</a> 

```
CREATE TABLE `dept_manager` (
`dept_no` char(4) NOT NULL,
`emp_no` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));
```
使用内连接查询
```
select s.*,d.dept_no
    from  salaries s  inner join dept_manager d 
    where d.to_date='9999-01-01' 
          and s.to_date='9999-01-01'
          and d.emp_no = s.emp_no;
```

### 1.26.4. 查找所有已经分配部门的员工的last_name和first_name
<a href="#menu" style="float:right">目录</a> 

```
CREATE TABLE `dept_emp` (
`emp_no` int(11) NOT NULL,
`dept_no` char(4) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

CREATE TABLE `employees` (
`emp_no` int(11) NOT NULL,
`birth_date` date NOT NULL,
`first_name` varchar(14) NOT NULL,
`last_name` varchar(16) NOT NULL,
`gender` char(1) NOT NULL,
`hire_date` date NOT NULL,
PRIMARY KEY (`emp_no`));
```

```
select e.last_name ,e.first_name,d.dept_no
    from  employees e inner join dept_emp d
      where e.emp_no = d.emp_no;
```

### 1.26.5. 查找所有员工的last_name和first_name以及对应部门编号dept_no，也包括展示没有分配具体部门的员工
<a href="#menu" style="float:right">目录</a> 

```sql
CREATE TABLE `dept_emp` (
`emp_no` int(11) NOT NULL,
`dept_no` char(4) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

CREATE TABLE `employees` (
`emp_no` int(11) NOT NULL,
`birth_date` date NOT NULL,
`first_name` varchar(14) NOT NULL,
`last_name` varchar(16) NOT NULL,
`gender` char(1) NOT NULL,
`hire_date` date NOT NULL,
PRIMARY KEY (`emp_no`));
```
```
select e.last_name,e.first_name,d.dept_no
    from employees e left join  dept_emp d
      on e.emp_no = d.emp_no;
```

### 1.26.6. 查找所有员工入职时候的薪水情况，给出emp_no以及salary， 并按照emp_no进行逆序
<a href="#menu" style="float:right">目录</a> 

```
CREATE TABLE `employees` (
`emp_no` int(11) NOT NULL,
`birth_date` date NOT NULL,
`first_name` varchar(14) NOT NULL,
`last_name` varchar(16) NOT NULL,
`gender` char(1) NOT NULL,
`hire_date` date NOT NULL,
PRIMARY KEY (`emp_no`));

CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));
```
from_date 是涨薪的起始日期，
因为是入职时的薪水，因此需要s.from_date = e.hire_date
```
select e.emp_no,s.salary
    from  salaries s inner join   employees e 
    where s.from_date = e.hire_date
      and  s.emp_no =  e.emp_no
     order by   e.emp_no desc;
```

### 1.26.7. 查找薪水涨幅超过15次的员工号emp_no以及其对应的涨幅次数t
<a href="#menu" style="float:right">目录</a> 

```
CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));
```


1、用COUNT()函数和GROUP BY语句可以统计同一emp_no值的记录条数
2、根据题意，输出的涨幅次数为t，故用AS语句将COUNT(emp_no)的值转换为t
3、由于WHERE后不可跟COUNT()函数，故用HAVING语句来限定t>15的条件
```
SELECT emp_no, COUNT(emp_no) AS t
  FROM salaries
	GROUP BY emp_no HAVING t > 15;
```
### 1.26.8. 找出所有员工当前(to_date='9999-01-01')具体的薪水salary情况，对于相同的薪水只显示一次,并按照逆序显示
<a href="#menu" style="float:right">目录</a> 

```
CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));
```
GROUP BY :值相同的为一组
ORDER BY　salary desc：降序排序
```
SELECT salary 
    FROM   salaries
      WHERE to_date='9999-01-01'
        GROUP BY salary
        ORDER BY salary desc;
```
### 1.26.9. 获取所有部门当前manager的当前薪水情况，给出dept_no, emp_no以及salary，当前表示to_date='9999-01-01'
<a href="#menu" style="float:right">目录</a> 

```
CREATE TABLE `dept_manager` (
`dept_no` char(4) NOT NULL,
`emp_no` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));
```

```
select d.dept_no,d.emp_no,s.salary
    from dept_manager d inner join salaries s
        where d.emp_no = s.emp_no
        and d.to_date='9999-01-01'
        and  s.to_date='9999-01-01';
```

### 1.26.10. 获取所有非manager的员工emp_no
<a href="#menu" style="float:right">目录</a> 

```
CREATE TABLE `dept_manager` (
`dept_no` char(4) NOT NULL,
`emp_no` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

CREATE TABLE `employees` (
`emp_no` int(11) NOT NULL,
`birth_date` date NOT NULL,
`first_name` varchar(14) NOT NULL,
`last_name` varchar(16) NOT NULL,
`gender` char(1) NOT NULL,
`hire_date` date NOT NULL,
PRIMARY KEY (`emp_no`));
```
使用not in 和子查询来解决．
```
select emp_no 
    from employees 
      where emp_no not in 
        (
            select emp_no
              from dept_manager
        );
```
<a href="#menu" style="float:right">目录</a> 

### 1.26.11. 获取所有员工当前的manager，如果当前的manager是自己的话结果不显示，当前表示to_date='9999-01-01'。
结果第一列给出当前员工的emp_no,第二列给出其manager对应的manager_no。

```
CREATE TABLE `dept_emp` (
`emp_no` int(11) NOT NULL,
`dept_no` char(4) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

CREATE TABLE `dept_manager` (
`dept_no` char(4) NOT NULL,
`emp_no` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

```
dept_emp是员工表，dept_manager是部门表
员工不一有manager，所以要通过e.dept_no = m.dept_no过滤掉没有manager的员工


```
select e.emp_no emp_no,m.emp_no manager_no 
    from  dept_manager m inner join dept_emp e
        where e.dept_no = m.dept_no
        and e.emp_no != m.emp_no
         and  m.to_date='9999-01-01' 
         and m.to_date = e.to_date;
```
<a href="#menu" style="float:right">目录</a> 

### 1.26.12. 获取所有部门中当前员工薪水最高的相关信息，给出dept_no, emp_no以及其对应的salary

```
CREATE TABLE `dept_emp` (
`emp_no` int(11) NOT NULL,
`dept_no` char(4) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));


```
求解的是每个部门工资最高的员工
所以group by　使用d.dept_no，按照部门分组．
但是分组后
```
select d.dept_no, d.emp_no ,max(s.salary)
    from  dept_emp d inner join salaries s
       on d.emp_no = s.emp_no
        where d.to_date = '9999-01-01'  and  s.to_date = '9999-01-01' 
            group by d.dept_no
```
<a href="#menu" style="float:right">目录</a> 

### 1.26.13. 从titles表获取按照title进行分组，每组个数大于等于2，给出title以及对应的数目t。

```
CREATE TABLE IF NOT EXISTS "titles" (
`emp_no` int(11) NOT NULL,
`title` varchar(50) NOT NULL,
`from_date` date NOT NULL,
`to_date` date DEFAULT NULL);


```
使用group by 分组，使用count统计个数
```
select  title,count(title)
    from titles
        group by title;
```
<a href="#menu" style="float:right">目录</a> 

### 1.26.14. 从titles表获取按照title进行分组，每组个数大于等于2，给出title以及对应的数目t。

注意对于重复的emp_no进行忽略。

```
CREATE TABLE IF NOT EXISTS "titles" (
`emp_no` int(11) NOT NULL,
`title` varchar(50) NOT NULL,
`from_date` date NOT NULL,
`to_date` date DEFAULT NULL);



```
使用distinct对结果去重
```
select  title,count(distinct emp_no) t
    from  titles
        group by title
        having t >= 2;
```
<a href="#menu" style="float:right">目录</a> 

### 1.26.15. 查找employees表所有emp_no为奇数，且last_name不为Mary的员工信息，并按照hire_date逆序排列

```
CREATE TABLE `employees` (
`emp_no` int(11) NOT NULL,
`birth_date` date NOT NULL,
`first_name` varchar(14) NOT NULL,
`last_name` varchar(16) NOT NULL,
`gender` char(1) NOT NULL,
`hire_date` date NOT NULL,
PRIMARY KEY (`emp_no`));


```
```
select * 
    from employees 
        where (emp_no%2 = 1)
        and last_name != 'Mary'
        order by hire_date desc;
```
<a href="#menu" style="float:right">目录</a> 

### 1.26.16. 统计出当前各个title类型对应的员工当前薪水对应的平均工资。结果给出title以及平均工资avg。
```
CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));

CREATE TABLE IF NOT EXISTS "titles" (
`emp_no` int(11) NOT NULL,
`title` varchar(50) NOT NULL,
`from_date` date NOT NULL,
`to_date` date DEFAULT NULL);

```
```
select t.title title ,avg(s.salary) avg
    from salaries s  inner join titles t
        where  s.emp_no = t.emp_no
        and s.to_date='9999-01-01'  and t.to_date='9999-01-01' 
        group by t.title;
```
<a href="#menu" style="float:right">目录</a> 

### 1.26.17. 获取当前（to_date='9999-01-01'）薪水第二多的员工的emp_no以及其对应的薪水salary
```
CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));


```
因为是第二大，使用　desc降序排序
limit 1,1限制第二条数据
```
select emp_no ,salary
    from salaries 
        where to_date='9999-01-01'
        order  by salary desc 
        limit 1,1;
```
<a href="#menu" style="float:right">目录</a> 

### 1.26.18. 查找当前薪水(to_date='9999-01-01')排名第二多的员工编号emp_no、薪水salary、last_name以及first_name，不准使用order by
```
CREATE TABLE `employees` (
`emp_no` int(11) NOT NULL,
`birth_date` date NOT NULL,
`first_name` varchar(14) NOT NULL,
`last_name` varchar(16) NOT NULL,
`gender` char(1) NOT NULL,
`hire_date` date NOT NULL,
PRIMARY KEY (`emp_no`));

CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));


```
先去除第一大，再获取第二大
```
select s.emp_no,s.salary,e.last_name,e.first_name 
    from employees e inner join salaries s
        on e.emp_no = s.emp_no
            where  s.to_date='9999-01-01'
                and s.salary = 
                    (
		                //获取第二大工资
                        select  max(salary)
                        from salaries
                        //去除第一大
                            where  salary not in 
                                (
                                    select  max(salary)
                                        from salaries
                                        where  to_date='9999-01-01'
                                )
                             and   to_date='9999-01-01'
                    );
```
<a href="#menu" style="float:right">目录</a> 

### 1.26.19. 查找所有员工的last_name和first_name以及对应的dept_name，也包括暂时没有分配部门的员工
```
CREATE TABLE `departments` (
`dept_no` char(4) NOT NULL,
`dept_name` varchar(40) NOT NULL,
PRIMARY KEY (`dept_no`));

CREATE TABLE `dept_emp` (
`emp_no` int(11) NOT NULL,
`dept_no` char(4) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

CREATE TABLE `employees` (
`emp_no` int(11) NOT NULL,
`birth_date` date NOT NULL,
`first_name` varchar(14) NOT NULL,
`last_name` varchar(16) NOT NULL,
`gender` char(1) NOT NULL,
`hire_date` date NOT NULL,
PRIMARY KEY (`emp_no`));


```

本题思路为运用两次LEFT JOIN连接嵌套
1、第一次LEFT JOIN连接employees表与dept_emp表，得到所有员工的last_name和first_name以及对应的dept_no，也包括暂时没有分配部门的员工
2、第二次LEFT JOIN连接上表与departments表，即连接dept_no与dept_name，得到所有员工的last_name和first_name以及对应的dept_name，也包括暂时没有分配部门的员工
```
select  e.last_name,e.first_name,dp.dept_name
     from (employees e left join dept_emp de on e.emp_no = de.emp_no )
           left join  departments dp on de.dept_no = dp.dept_no;
```
<a href="#menu" style="float:right">目录</a> 

### 1.26.20. 查找员工编号emp_no为10001其自入职以来的薪水salary涨幅值growth
```
CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));


```
to_date 是每一次薪资变化的记录时间
所以查找to_date最大和最小时的薪资差值即可
```
select 
    (select salary
           from salaries
           where  emp_no = 10001 
           order  by to_date desc limit 1
    )
     - 
     (select salary
           from salaries
           where  emp_no = 10001 
           order  by to_date asc limit 1
    )
    as growth;
   
```
<a href="#menu" style="float:right">目录</a> 

### 1.26.21. **查找所有员工自入职以来的薪水涨幅情况，给出员工编号emp_no以及其对应的薪水涨幅growth，并按照growth进行升序
```
CREATE TABLE `employees` (
`emp_no` int(11) NOT NULL,
`birth_date` date NOT NULL,
`first_name` varchar(14) NOT NULL,
`last_name` varchar(16) NOT NULL,
`gender` char(1) NOT NULL,
`hire_date` date NOT NULL,
PRIMARY KEY (`emp_no`));

CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));
**


```
```
select a.emp_no, (b.salary - c.salary) as growth
from
    employees as a
    inner join salaries as b
    on a.emp_no = b.emp_no and b.to_date = '9999-01-01'
    inner join salaries as c
    on a.emp_no = c.emp_no and a.hire_date = c.from_date
order by growth asc
```
<a href="#menu" style="float:right">目录</a> 

### 1.26.22. 统计各个部门对应员工涨幅的次数总和，给出部门编码dept_no、部门名称dept_name以及次数sum
```
CREATE TABLE `departments` (
`dept_no` char(4) NOT NULL,
`dept_name` varchar(40) NOT NULL,
PRIMARY KEY (`dept_no`));

CREATE TABLE `dept_emp` (
`emp_no` int(11) NOT NULL,
`dept_no` char(4) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));
```
先dept_emp  de  inner join  salaries s　去除没有部门的员工
再inner join  departments 获得部门表信息　
再对dept_no进行分组
```
select dp.dept_no,dp.dept_name,count(s.salary)
    from (dept_emp  de  inner join  salaries s
            on de.emp_no = s.emp_no) 
        inner join  departments  dp  on  dp.dept_no = de.dept_no
        group by dp.dept_no;
```
<a href="#menu" style="float:right">目录</a> 

### 1.26.23. 对所有员工的当前(to_date='9999-01-01')薪水按照salary进行按照1-N的排名，相同salary并列且按照emp_no升序排列
```
CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));


```
```
s
```
<a href="#menu" style="float:right">目录</a> 

### 1.26.24. 获取所有非manager员工当前的薪水情况，给出dept_no、emp_no以及salary ，当前表示to_date='9999-01-01'
```
CREATE TABLE `dept_emp` (
`emp_no` int(11) NOT NULL,
`dept_no` char(4) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

CREATE TABLE `dept_manager` (
`dept_no` char(4) NOT NULL,
`emp_no` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

CREATE TABLE `employees` (
`emp_no` int(11) NOT NULL,
`birth_date` date NOT NULL,
`first_name` varchar(14) NOT NULL,
`last_name` varchar(16) NOT NULL,
`gender` char(1) NOT NULL,
`hire_date` date NOT NULL,
PRIMARY KEY (`emp_no`));

CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));


```
```
s
```


<a href="#menu" style="float:right">目录</a> 

### 1.26.25. 获取员工其当前的薪水比其manager当前薪水还高的相关信息，当前表示to_date='9999-01-01',
结果第一列给出员工的emp_no，
第二列给出其manager的manager_no，
第三列给出该员工当前的薪水emp_salary,
第四列给该员工对应的manager当前的薪水manager_salary
```
CREATE TABLE `dept_emp` (
`emp_no` int(11) NOT NULL,
`dept_no` char(4) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

CREATE TABLE `dept_manager` (
`dept_no` char(4) NOT NULL,
`emp_no` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));
```
```
s
```

<a href="#menu" style="float:right">目录</a> 

### 1.26.26. 汇总各个部门当前员工的title类型的分配数目，结果给出部门编号dept_no、dept_name、其当前员工所有的title以及该类型title对应的数目count
```
CREATE TABLE `departments` (
`dept_no` char(4) NOT NULL,
`dept_name` varchar(40) NOT NULL,
PRIMARY KEY (`dept_no`));

CREATE TABLE `dept_emp` (
`emp_no` int(11) NOT NULL,
`dept_no` char(4) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));

CREATE TABLE IF NOT EXISTS `titles` (
`emp_no` int(11) NOT NULL,
`title` varchar(50) NOT NULL,
`from_date` date NOT NULL,
`to_date` date DEFAULT NULL);
```
```
s
```

<a href="#menu" style="float:right">目录</a> 

### 1.26.27. 给出每个员工每年薪水涨幅超过5000的员工编号emp_no、薪水变更开始日期from_date以及薪水涨幅值salary_growth，并按照salary_growth逆序排列。
提示：在sqlite中获取datetime时间对应的年份函数为strftime('%Y', to_date)

```
CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));
```
```
s
```

<a href="#menu" style="float:right">目录</a> 

### 1.26.28. 查找描述信息中包括robot的电影对应的分类名称以及电影数目，而且还需要该分类对应电影数量>=5部
```
film表
字段	说明
film_id	电影id
title	电影名称
description	电影描述信息

CREATE TABLE IF NOT EXISTS film (
film_id smallint(5)  NOT NULL DEFAULT '0',
title varchar(255) NOT NULL,
description text,
PRIMARY KEY (film_id));
category表
字段	说明
category_id	电影分类id
name	电影分类名称
last_update	电影分类最后更新时间

CREATE TABLE category  (
category_id  tinyint(3)  NOT NULL ,
name  varchar(25) NOT NULL, `last_update` timestamp,
PRIMARY KEY ( category_id ));
film_category表
字段	说明
film_id	电影id
category_id	电影分类id
last_update	电影id和分类id对应关系的最后更新时间

CREATE TABLE film_category  (
film_id  smallint(5)  NOT NULL,
category_id  tinyint(3)  NOT NULL, `last_update` timestamp);

```
```
s
```

<a href="#menu" style="float:right">目录</a> 

### 1.26.29. 使用join查询方式找出没有分类的电影id以及名称
```
film表
字段	说明
film_id	电影id
title	电影名称
description	电影描述信息

CREATE TABLE IF NOT EXISTS film (
film_id smallint(5)  NOT NULL DEFAULT '0',
title varchar(255) NOT NULL,
description text,
PRIMARY KEY (film_id));
category表
字段	说明
category_id	电影分类id
name	电影分类名称
last_update	电影分类最后更新时间

CREATE TABLE category  (
category_id  tinyint(3)  NOT NULL ,
name  varchar(25) NOT NULL, `last_update` timestamp,
PRIMARY KEY ( category_id ));
film_category表
字段	说明
film_id	电影id
category_id	电影分类id
last_update	电影id和分类id对应关系的最后更新时间

CREATE TABLE film_category  (
film_id  smallint(5)  NOT NULL,
category_id  tinyint(3)  NOT NULL, `last_update` timestamp);
```
```
s
```

<a href="#menu" style="float:right">目录</a> 

### 1.26.30. 使用子查询的方式找出属于Action分类的所有电影对应的title,description
```
lm表
字段	说明
film_id	电影id
title	电影名称
description	电影描述信息

CREATE TABLE IF NOT EXISTS film (
film_id smallint(5)  NOT NULL DEFAULT '0',
title varchar(255) NOT NULL,
description text,
PRIMARY KEY (film_id));
category表
字段	说明
category_id	电影分类id
name	电影分类名称
last_update	电影分类最后更新时间

CREATE TABLE category  (
category_id  tinyint(3)  NOT NULL ,
name  varchar(25) NOT NULL, `last_update` timestamp,
PRIMARY KEY ( category_id ));
film_category表
字段	说明
film_id	电影id
category_id	电影分类id
last_update	电影id和分类id对应关系的最后更新时间

CREATE TABLE film_category  (
film_id  smallint(5)  NOT NULL,
category_id  tinyint(3)  NOT NULL, `last_update` timestamp);

```
```
子查询解法：

select f.title,f.description from film as f
where f.film_id in (select fc.film_id from film_category as fc
               where fc.category_id in (select c.category_id from category as c
                                        where c.name = 'Action'));
```
```
非子查询解法：

select f.title,f.description
from film as f inner join film_category as fc on f.film_id = fc.film_id
               inner join category as c on c.category_id = fc.category_id
where c.name = 'Action';
```

<a href="#menu" style="float:right">目录</a> 
### 1.26.31. 获取select
```
获取select * from employees对应的执行计划
```

```
EXPLAIN SELECT * FROM employees
```

<a href="#menu" style="float:right">目录</a> 

### 1.26.32. 将employees表的所有员工的last_name和first_name拼接起来作为Name，中间以一个空格区分
```
CREATE TABLE `employees` ( `emp_no` int(11) NOT NULL,
`birth_date` date NOT NULL,
`first_name` varchar(14) NOT NULL,
`last_name` varchar(16) NOT NULL,
`gender` char(1) NOT NULL,
`hire_date` date NOT NULL,
PRIMARY KEY (`emp_no`));
```

```
select last_name||" "||first_name as name from employees
select concat（last_name，‘ ’，first_name）as name from employees
```


<a href="#menu" style="float:right">目录</a> 

### 1.26.33. 创建一个actor表，包含如下列信息

```
列表	类型	是否为NULL	含义
actor_id	smallint(5)	not null	主键id
first_name	varchar(45)	not null	名字
last_name	varchar(45)	not null	姓氏
last_update	timestamp	not null	最后更新时间，默认是系统的当前时间
```
```

根据题意，本题关键点是actor_id的主键设置与last_update的默认获取系统时间：
1、在actor_id字段末尾加上PRIMARY KEY是将该字段设置为主键，
或者在表的最后一行加上PRIMARY KEY(actor_id)
2、在last_update末尾加上DEFAULT是为该字段设置默认值，
且默认值为(datetime('now','localtime'))，即获得系统时间，注意最外层的括号不可省略
CREATE TABLE actor(
  actor_id smallint(5) PRIMARY KEY NOT NULL,
  first_name varchar(45) NOT NULL,
  last_name varchar(45) NOT NULL,
  last_update timestamp NOT NULL default (datetime('now','localtime'))
);
```


<a href="#menu" style="float:right">目录</a> 

### 1.26.34. 批量插入数据
```
对于表actor批量插入如下数据
CREATE TABLE IF NOT EXISTS actor (
actor_id smallint(5) NOT NULL PRIMARY KEY,
first_name varchar(45) NOT NULL,
last_name varchar(45) NOT NULL,
last_update timestamp NOT NULL DEFAULT (datetime('now','localtime')))
```
```
方法一：利用VALUES(value1, value2, ...), (value1, value2, ...), ...(value1, value2, ...),
INSERT INTO actor
VALUES (1, 'PENELOPE', 'GUINESS', '2006-02-15 12:34:33'),
(2, 'NICK', 'WAHLBERG', '2006-02-15 12:34:33')

方法二：利用 UNION SELECT 批量插入
INSERT INTO actor
SELECT 1, 'PENELOPE', 'GUINESS', '2006-02-15 12:34:33'
UNION SELECT 2, 'NICK', 'WAHLBERG', '2006-02-15 12:34:33'
```

<a href="#menu" style="float:right">目录</a> 

### 1.26.35. 批量插入数据，不使用replace操作
```
对于表actor批量插入如下数据,如果数据已经存在，请忽略，不使用replace操作
CREATE TABLE IF NOT EXISTS actor (
actor_id smallint(5) NOT NULL PRIMARY KEY,
first_name varchar(45) NOT NULL,
last_name varchar(45) NOT NULL,
last_update timestamp NOT NULL DEFAULT (datetime('now','localtime')))
```
```
insert IGNORE into actor
values(3,'ED','CHASE','2006-02-15 12:34:33');
```

<a href="#menu" style="float:right">目录</a> 

### 1.26.36. 创建一个actor_name表
```
对于如下表actor，其对应的数据为:
actor_id	first_name	last_name	last_update
1	PENELOPE	GUINESS	2006-02-15 12:34:33
2	NICK	WAHLBERG	2006-02-15 12:34:33

创建一个actor_name表，将actor表中的所有first_name以及last_name导入改表。 actor_name表结构如下：
列表	类型	是否为NULL	含义
first_name	varchar(45)	not null	名字
last_name	varchar(45)	not null	姓氏
```
```


create table actor_name
select first_name,last_name from actor;
```

<a href="#menu" style="float:right">目录</a> 

### 1.26.37. 对first_name创建唯一索引uniq_idx_firstname
```
针对如下表actor结构创建索引：
CREATE TABLE IF NOT EXISTS actor (
actor_id smallint(5) NOT NULL PRIMARY KEY,
first_name varchar(45) NOT NULL,
last_name varchar(45) NOT NULL,
last_update timestamp NOT NULL DEFAULT (datetime('now','localtime')))
对first_name创建唯一索引uniq_idx_firstname，对last_name创建普通索引idx_lastname
```
```


先用 CREATE UNIQUE INDEX ... ON ... 对first_name创建唯一索引值，
再用 CREATE INDEX ... ON ... 对last_name创建普通索引值
CREATE UNIQUE INDEX uniq_idx_firstname ON actor(first_name);
CREATE INDEX idx_lastname ON actor(last_name);
```

<a href="#menu" style="float:right">目录</a> 

### 1.26.38. 针对actor表创建视图actor_name_view
```
针对actor表创建视图actor_name_view，只包含first_name以及last_name两列，并对这两列重新命名，first_name为first_name_v，last_name修改为last_name_v：
CREATE TABLE IF NOT EXISTS actor (
actor_id smallint(5) NOT NULL PRIMARY KEY,
first_name varchar(45) NOT NULL,
last_name varchar(45) NOT NULL,
last_update timestamp NOT NULL DEFAULT (datetime('now','localtime')))
```
```



方法一：注意 CREATE VIEW ... AS ... 的 AS 是创建视图语法中的一部分，而后面的两个 AS 只是为字段创建别名

CREATE VIEW actor_name_view AS
SELECT first_name AS fist_name_v, last_name AS last_name_v
FROM actor 
方法二：直接在视图名的后面用小括号创建视图中的字段名
CREATE VIEW actor_name_view (fist_name_v, last_name_v) AS
SELECT first_name, last_name FROM actor 
```

<a href="#menu" style="float:right">目录</a> 

### 1.26.39. 针对上面的salaries表emp_no字段创建索引idx_emp_no
```
针对salaries表emp_no字段创建索引idx_emp_no，查询emp_no为10005, 使用强制索引。
CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));

create index idx_emp_no on salaries(emp_no);
```
```
SELECT * FROM salaries FORCE INDEX idx_emp_no WHERE emp_no = 10005
```

<a href="#menu" style="float:right">目录</a> 

### 1.26.40. 在last_update后面新增加一列名字为create_date

```
存在actor表，包含如下列信息：
CREATE TABLE IF NOT EXISTS actor (
actor_id smallint(5) NOT NULL PRIMARY KEY,
first_name varchar(45) NOT NULL,
last_name varchar(45) NOT NULL,
last_update timestamp NOT NULL DEFAULT (datetime('now','localtime')));
现在在last_update后面新增加一列名字为create_date, 类型为datetime, NOT NULL，默认值为'0000 00:00:00'
```
```
ALTER TABLE actor ADD COLUMN create_date datetime NOT NULL DEFAULT '0000-00-00 00:00:00';
其中 ADD 后的 COLUMN 可省略，NOT NULL 和 DEFAULT '0000-00-00 00:00:00' 可交换：
ALTER TABLE actor ADD create_date datetime DEFAULT '0000-00-00 00:00:00' NOT NULL ;
```

<a href="#menu" style="float:right">目录</a> 

### 1.26.41. 构造一个触发器audit_log

```SQL
构造一个触发器audit_log，在向employees_test表中插入一条数据的时候，触发插入相关的数据到audit中。
CREATE TABLE employees_test(
ID INT PRIMARY KEY NOT NULL,
NAME TEXT NOT NULL,
AGE INT NOT NULL,
ADDRESS CHAR(50),
SALARY REAL
);

CREATE TABLE audit(
EMP_no INT NOT NULL,
NAME TEXT NOT NULL
);
```

```SQL
链接：https://www.nowcoder.com/questionTerminal/7e920bb2e1e74c4e83750f5c16033e2e
来源：牛客网

1.创建触发器使用语句：CREATE TRIGGER trigname;
2.指定触发器触发的事件在执行某操作之前还是之后，使用语句：
BEFORE/AFTER [INSERT/UPDATE/ADD] ON tablename
3.触发器触发的事件写在BEGIN和END之间；
4.触发器中可以通过NEW获得触发事件之后2对应的tablename的相关列的值，
OLD获得触发事件之前的2对应的tablename的相关列的值

CREATE TRIGGER audit_log AFTER INSERT ON employees_test
BEGIN
    INSERT INTO audit VALUES(NEW.ID,NEW.NAME);
END;
```


### 1.26.42. 删除emp_no重复的记录，只保留最小的id对应的记录。

```
删除emp_no重复的记录，只保留最小的id对应的记录。
CREATE TABLE IF NOT EXISTS titles_test (
id int(11) not null primary key,
emp_no int(11) NOT NULL,
title varchar(50) NOT NULL,
from_date date NOT NULL,
to_date date DEFAULT NULL);

insert into titles_test values ('1', '10001', 'Senior Engineer', '1986-06-26', '9999-01-01'),
('2', '10002', 'Staff', '1996-08-03', '9999-01-01'),
('3', '10003', 'Senior Engineer', '1995-12-03', '9999-01-01'),
('4', '10004', 'Senior Engineer', '1995-12-03', '9999-01-01'),
('5', '10001', 'Senior Engineer', '1986-06-26', '9999-01-01'),
('6', '10002', 'Staff', '1996-08-03', '9999-01-01'),
('7', '10003', 'Senior Engineer', '1995-12-03', '9999-01-01');
```


<a href="#menu" style="float:right">目录</a> 

### 1.26.43. 将所有to_date为9999-01-01的全部更新为NULL
```SQL
将所有to_date为9999-01-01的全部更新为NULL,且 from_date更新为2001-01-01。
CREATE TABLE IF NOT EXISTS titles_test (
id int(11) not null primary key,
emp_no int(11) NOT NULL,
title varchar(50) NOT NULL,
from_date date NOT NULL,
to_date date DEFAULT NULL);

insert into titles_test values ('1', '10001', 'Senior Engineer', '1986-06-26', '9999-01-01'),
('2', '10002', 'Staff', '1996-08-03', '9999-01-01'),
('3', '10003', 'Senior Engineer', '1995-12-03', '9999-01-01'),
('4', '10004', 'Senior Engineer', '1995-12-03', '9999-01-01'),
('5', '10001', 'Senior Engineer', '1986-06-26', '9999-01-01'),
('6', '10002', 'Staff', '1996-08-03', '9999-01-01'),
('7', '10003', 'Senior Engineer', '1995-12-03', '9999-01-01');
```
```SQL
另外要注意若干列 to_date = NULL 和 from_date = '2001-01-01' 之间只能用逗号连接，切勿用 AND 连接。

UPDATE titles_test SET to_date = NULL, from_date = '2001-01-01'
WHERE to_date = '9999-01-01';
```

<a href="#menu" style="float:right">目录</a> 

### 1.26.44. 将id=5以及emp_no=10001的行数据替换成id=5以及emp_no=10005

```
将id=5以及emp_no=10001的行数据替换成id=5以及emp_no=10005,其他数据保持不变，使用replace实现。
CREATE TABLE IF NOT EXISTS titles_test (
id int(11) not null primary key,
emp_no int(11) NOT NULL,
title varchar(50) NOT NULL,
from_date date NOT NULL,
to_date date DEFAULT NULL);

insert into titles_test values ('1', '10001', 'Senior Engineer', '1986-06-26', '9999-01-01'),
('2', '10002', 'Staff', '1996-08-03', '9999-01-01'),
('3', '10003', 'Senior Engineer', '1995-12-03', '9999-01-01'),
('4', '10004', 'Senior Engineer', '1995-12-03', '9999-01-01'),
('5', '10001', 'Senior Engineer', '1986-06-26', '9999-01-01'),
('6', '10002', 'Staff', '1996-08-03', '9999-01-01'),
('7', '10003', 'Senior Engineer', '1995-12-03', '9999-01-01');
```
```



方法一：全字段更新替换。由于 REPLACE 的新记录中 id=5，与表中的主键 id=5 冲突，故会替换掉表中 id=5 的记录，否则会插入一条新记录（例如新插入的记录 id = 10）。并且要将所有字段的值写出，否则将置为空。可参考：
http://blog.csdn.net/zhangjg_blog/article/details/23267761


REPLACE INTO titles_test VALUES (5, 10005, 'Senior Engineer', '1986-06-26', '9999-01-01')
方法二：运用REPLACE(X,Y,Z)函数。其中X是要处理的字符串，Y是X中将要被替换的字符串，Z是用来替换Y的字符串，最终返回替换后的字符串。以下语句用 UPDATE和REPLACE 配合完成，用REPLACE函数替换后的新值复制给 id=5 的 emp_no。REPLACE的参数为整型时也可通过。可参考：
http://www.cnblogs.com/huangtailang/p/5cfbd242cae2bcc929c81c266d0c875b.html
http://sqlite.org/lang_corefunc.html#replace


UPDATE titles_test SET emp_no = REPLACE(emp_no,10001,10005) WHERE id = 5
/** 另外可以利用OJ系统的漏洞，不用 REPLACE 实现  **/

UPDATE titles_test SET emp_no = 10005 WHERE id = 5
```

<a href="#menu" style="float:right">目录</a> 


### 1.26.45. 将titles_test表名修改为titles_2017
```
将titles_test表名修改为titles_2017。
CREATE TABLE IF NOT EXISTS titles_test (
id int(11) not null primary key,
emp_no int(11) NOT NULL,
title varchar(50) NOT NULL,
from_date date NOT NULL,
to_date date DEFAULT NULL);

insert into titles_test values ('1', '10001', 'Senior Engineer', '1986-06-26', '9999-01-01'),
('2', '10002', 'Staff', '1996-08-03', '9999-01-01'),
('3', '10003', 'Senior Engineer', '1995-12-03', '9999-01-01'),
('4', '10004', 'Senior Engineer', '1995-12-03', '9999-01-01'),
('5', '10001', 'Senior Engineer', '1986-06-26', '9999-01-01'),
('6', '10002', 'Staff', '1996-08-03', '9999-01-01'),
('7', '10003', 'Senior Engineer', '1995-12-03', '9999-01-01');
```
```
ALTER TABLE titles_test RENAME TO titles_2017
```

<a href="#menu" style="float:right">目录</a> 

### 1.26.46. 在audit表上创建外键约束，其emp_no对应employees_test表的主键id
```
在audit表上创建外键约束，其emp_no对应employees_test表的主键id。
CREATE TABLE employees_test(
ID INT PRIMARY KEY NOT NULL,
NAME TEXT NOT NULL,
AGE INT NOT NULL,
ADDRESS CHAR(50),
SALARY REAL
);

CREATE TABLE audit(
EMP_no INT NOT NULL,
create_date datetime NOT NULL
);
```
```
drop table audit;
CREATE TABLE audit(
    EMP_no INT NOT NULL,
    create_date datetime NOT NULL,
    foreign key(EMP_no) references employees_test(ID));

```

<a href="#menu" style="float:right">目录</a> 

### 道德规范
  
### 1.26.47. 如何获取emp_v和employees有相同的数据no

```
存在如下的视图：
create view emp_v as select * from employees where emp_no >10005;
如何获取emp_v和employees有相同的数据？
CREATE TABLE `employees` (
`emp_no` int(11) NOT NULL,
`birth_date` date NOT NULL,
`first_name` varchar(14) NOT NULL,
`last_name` varchar(16) NOT NULL,
`gender` char(1) NOT NULL,
`hire_date` date NOT NULL,
PRIMARY KEY (`emp_no`));
输出格式:
emp_no	birth_date	first_name	last_name	gender	hire_date
10006	1953-04-20	Anneke	Preusig	F	1989-06-02
10007	1957-05-23	Tzvetan	Zielinski	F	1989-02-10
10008	1958-02-19	Saniya	Kalloufi	M	1994-09-15
10009	1952-04-19	Sumant	Peac	F	1985-02-18
10010	1963-06-01	Duangkaew	Piveteau	F	1989-08-24
10011	1953-11-07	Mary	Sluis	F	1990-01-22
```

```


由于视图 emp_v 的记录是从 employees 中导出的，所以要判断两者中相等的数据，只需要判断emp_no相等即可。
方法一：用 WHERE 选取二者 emp_no 相等的记录

SELECT em.* FROM employees AS em, emp_v AS ev WHERE em.emp_no = ev.emp_no
方法二：用 INTERSECT 关键字求 employees 和 emp_v 的交集
可参考：http://www.sqlite.org/lang_select.html


SELECT * FROM employees INTERSECT SELECT * FROM emp_v
方法三：仔细一想，emp_v的全部记录均由 employees 导出，因此可以投机取巧，直接输出 emp_v 所有记录

SELECT * FROM emp_v
【错误方法：】用以下方法直接输出 *，会得到两张表中符合条件的重复记录，因此不合题意，必须在 * 前加表名作限定

SELECT * FROM employees, emp_v WHERE employees.emp_no = emp_v.emp_no
```

<a href="#menu" style="float:right">目录</a> 


### 48.将所有获取奖金的员工当前的薪水增加10%

```
将所有获取奖金的员工当前的薪水增加10%。
create table emp_bonus(
emp_no int not null,
recevied datetime not null,
btype smallint not null);
CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL, PRIMARY KEY (`emp_no`,`from_date`));
```
```


按照正常的逻辑以及之前题目的尿性，要先选出符合条件的 emp_no，即用 INNER JOIN 连接 salaries 和 emp_bonus，且用 s.to_date = '9999-01-01' 表示当前薪水，然后再用 UPDATE ... SET ... WHERE ... IN ... 语句来更新表中数据。

UPDATE salaries SET salary = salary * 1.1 WHERE emp_no IN
(SELECT s.emp_no FROM salaries AS s INNER JOIN emp_bonus AS eb 
ON s.emp_no = eb.emp_no AND s.to_date = '9999-01-01')
但又发现题目测试用例没设置好，emp_bonus里面的全部 emp_no 都是当前获奖的所有员工，于是就有了以下简易答案：

UPDATE salaries SET salary = salary * 1.1 WHERE emp_no IN 
(SELECT emp_no FROM emp_bonus)
谁知道还能继续投机取巧，估计是OJ系统的问题，将所有 salary 都上涨10%也能通过，于是又有了以下终极版最短答案：

UPDATE salaries SET salary = salary * 1.1 
```
