
<span id="menu"></span>


<!-- TOC -->

- [1. Mybatis](#1-mybatis)
    - [1.1. 简介](#11-简介)
        - [1.1.1. 传统的JDBC编程](#111-传统的jdbc编程)
        - [1.1.2. ORM模型](#112-orm模型)
        - [1.1.3. HIBERNATE与MYBATIS的对比](#113-hibernate与mybatis的对比)
        - [1.1.4. Mybatis与iBatis的主要差异对比](#114-mybatis与ibatis的主要差异对比)
        - [1.1.5. Mybatis基本构成](#115-mybatis基本构成)
        - [1.1.6. 常见面试题](#116-常见面试题)
    - [1.2. 配置](#12-配置)
        - [1.2.1. 配置](#121-配置)
        - [1.2.2. 属性（properties）](#122-属性properties)
        - [1.2.3. 类型别名（typeAliases）](#123-类型别名typealiases)
        - [1.2.4. 类型处理器（typeHandlers）](#124-类型处理器typehandlers)
        - [1.2.5. 处理枚举类型](#125-处理枚举类型)
        - [1.2.6. 对象工厂（objectFactory）](#126-对象工厂objectfactory)
        - [1.2.7. 插件（plugins）](#127-插件plugins)
        - [1.2.8. 事务管理器（transactionManager）](#128-事务管理器transactionmanager)
        - [1.2.9. 数据源（dataSource）](#129-数据源datasource)
        - [1.2.10. 数据库厂商标识（databaseIdProvider）](#1210-数据库厂商标识databaseidprovider)
        - [1.2.11. 映射器（mappers）](#1211-映射器mappers)
    - [1.3. XML 映射文件](#13-xml-映射文件)
        - [1.3.1. select](#131-select)
        - [1.3.2. Insert, Update, Delete 元素的属性](#132-insert-update-delete-元素的属性)
        - [1.3.3. sql](#133-sql)
        - [1.3.4. 参数](#134-参数)
        - [1.3.5. 字符串替换](#135-字符串替换)
        - [1.3.6. 结果映射](#136-结果映射)
        - [1.3.7. 高级结果映射](#137-高级结果映射)
        - [1.3.8. 结果映射（resultMap）](#138-结果映射resultmap)
        - [1.3.9. 支持的 JDBC 类型](#139-支持的-jdbc-类型)
        - [1.3.10. 构造方法](#1310-构造方法)
        - [1.3.11. 关联](#1311-关联)
        - [1.3.12. 关联的嵌套 Select 查询](#1312-关联的嵌套-select-查询)
        - [1.3.13. 关联的嵌套结果映射](#1313-关联的嵌套结果映射)
        - [1.3.14. 关联的多结果集（ResultSet）](#1314-关联的多结果集resultset)
        - [1.3.15. 集合](#1315-集合)
        - [1.3.16. 集合的嵌套 Select 查询](#1316-集合的嵌套-select-查询)
        - [1.3.17. 集合的嵌套结果映射](#1317-集合的嵌套结果映射)
        - [1.3.18. 集合的多结果集（ResultSet）](#1318-集合的多结果集resultset)
        - [1.3.19. 鉴别器](#1319-鉴别器)
        - [1.3.20. 自动映射](#1320-自动映射)
    - [1.4. 动态 SQL](#14-动态-sql)
        - [1.4.1. if](#141-if)
        - [1.4.2. choose, when, otherwise](#142-choose-when-otherwise)
        - [1.4.3. trim, where, set](#143-trim-where-set)
        - [1.4.4. WHERE](#144-where)
        - [1.4.5. foreach](#145-foreach)
        - [1.4.6. script](#146-script)
        - [1.4.7. bind](#147-bind)
    - [1.5. 缓存](#15-缓存)
        - [1.5.1. Mybatis 缓存](#151-mybatis-缓存)
        - [1.5.2. 使用自定义缓存](#152-使用自定义缓存)
    - [1.6. 插件](#16-插件)
        - [1.6.1. 拦截的接口](#161-拦截的接口)
        - [1.6.2. 拦截器实现](#162-拦截器实现)
    - [1.7. 代码生成器](#17-代码生成器)
        - [1.7.1. 创建需要生成的数据表](#171-创建需要生成的数据表)
        - [1.7.2. 创建Mybatis代码自动生成配置文件](#172-创建mybatis代码自动生成配置文件)
        - [1.7.3. 配置运行](#173-配置运行)
    - [1.8. Mybatis整体架构](#18-mybatis整体架构)
        - [1.8.1. 基础支持层](#181-基础支持层)
        - [1.8.2. 核心处理层](#182-核心处理层)
        - [1.8.3. 接口层](#183-接口层)
        - [1.8.4. 模块说明](#184-模块说明)
- [2. Redis](#2-redis)
    - [2.1. 数据结构和对象](#21-数据结构和对象)
        - [2.1.1. 简单动态字符串](#211-简单动态字符串)
        - [2.1.2. 链表](#212-链表)
        - [2.1.3. 字典](#213-字典)
            - [2.1.3.1. Rehash](#2131-rehash)
        - [2.1.4. 跳跃表](#214-跳跃表)
        - [2.1.5. 整数集合](#215-整数集合)
        - [2.1.6. 压缩列表](#216-压缩列表)
        - [2.1.7. 对象](#217-对象)
            - [2.1.7.1. 对象类型和编码](#2171-对象类型和编码)
            - [2.1.7.2. 字符串对象](#2172-字符串对象)
            - [2.1.7.3. 列表对象](#2173-列表对象)
            - [2.1.7.4. 哈希对象](#2174-哈希对象)
            - [2.1.7.5. 集合对象](#2175-集合对象)
            - [2.1.7.6. 由于集合对象](#2176-由于集合对象)
            - [2.1.7.7. 类型检查和命令多态](#2177-类型检查和命令多态)
            - [2.1.7.8. 内存回收](#2178-内存回收)
            - [2.1.7.9. 对象共享](#2179-对象共享)
            - [2.1.7.10. 对象空转时长](#21710-对象空转时长)
    - [2.2. 单机数据库实现](#22-单机数据库实现)
        - [2.2.1. 数据库](#221-数据库)
        - [2.2.2. RDB持久化](#222-rdb持久化)
        - [2.2.3. AOF持久化](#223-aof持久化)
        - [2.2.4. 事件](#224-事件)
        - [2.2.5. 客户端](#225-客户端)
        - [2.2.6. 服务器](#226-服务器)
    - [2.3. 多机数据库实现](#23-多机数据库实现)
        - [2.3.1. 复制](#231-复制)
        - [2.3.2. 哨兵](#232-哨兵)
        - [2.3.3. 集群](#233-集群)
    - [2.4. 独立功能实现](#24-独立功能实现)
        - [2.4.1. 发布与订阅](#241-发布与订阅)
        - [2.4.2. 事务](#242-事务)
        - [2.4.3. LUA脚本](#243-lua脚本)
        - [2.4.4. 排序](#244-排序)
        - [2.4.5. 二进制位数组](#245-二进制位数组)
        - [2.4.6. 慢查询日志](#246-慢查询日志)
        - [2.4.7. 监视器](#247-监视器)
- [3. Nginx](#3-nginx)
    - [3.1. 概述](#31-概述)
        - [3.1.1. 功能特性](#311-功能特性)
        - [3.1.2. Nginx快速理解](#312-nginx快速理解)
    - [3.2. 基本使用和配置](#32-基本使用和配置)
        - [3.2.1. Nginx平滑升级](#321-nginx平滑升级)
        - [3.2.2. 配置文件](#322-配置文件)
    - [3.3. 架构说明](#33-架构说明)
        - [3.3.1. 模块化结构](#331-模块化结构)
            - [3.3.1.1. 模块分类](#3311-模块分类)
        - [3.3.2. web请求处理机制](#332-web请求处理机制)
        - [3.3.3. 设计架构概览](#333-设计架构概览)
    - [3.4. 高级配置](#34-高级配置)
    - [3.5. gzip压缩](#35-gzip压缩)
    - [3.6. rewrite功能](#36-rewrite功能)
        - [3.6.1. nginx后端服务器组的配置的5个技术指令](#361-nginx后端服务器组的配置的5个技术指令)
        - [3.6.2. rewrite功能的配置](#362-rewrite功能的配置)
        - [3.6.3. rewrite使用](#363-rewrite使用)
    - [3.7. 代理服务](#37-代理服务)
        - [3.7.1. 正向代理和反向代理](#371-正向代理和反向代理)
        - [3.7.2. Nginx正向代理服务](#372-nginx正向代理服务)
        - [3.7.3. Nginx反向代理服务](#373-nginx反向代理服务)
            - [3.7.3.1. 反向代理基本设置的21个指令](#3731-反向代理基本设置的21个指令)
            - [3.7.3.2. proxy buffer 的配置的7个指令](#3732-proxy-buffer-的配置的7个指令)
            - [3.7.3.3. proxy cache 的配置的12个指令](#3733-proxy-cache-的配置的12个指令)
        - [3.7.4. Nginx服务器负载均衡](#374-nginx服务器负载均衡)
    - [3.8. 邮件服务](#38-邮件服务)
    - [3.9. 源码结构](#39-源码结构)
    - [3.10. 基本数据结构](#310-基本数据结构)
    - [3.11. 启动初始化](#311-启动初始化)
        - [3.11.1. 启动过程概览](#3111-启动过程概览)
    - [3.12. 时间管理](#312-时间管理)
    - [3.13. 内存管理](#313-内存管理)
        - [3.13.1. 内存的逻辑结构](#3131-内存的逻辑结构)
        - [3.13.2. 内存池管理](#3132-内存池管理)
        - [3.13.3. 内存的使用](#3133-内存的使用)
    - [3.14. 工作进程](#314-工作进程)
        - [3.14.1. nginx服务进程间通信](#3141-nginx服务进程间通信)
            - [3.14.1.1. Linux进程间通信方式](#31411-linux进程间通信方式)
            - [3.14.1.2. Linux进程间双工通信方式的实现](#31412-linux进程间双工通信方式的实现)
            - [3.14.1.3. 通信通道建立和设置](#31413-通信通道建立和设置)
            - [3.14.1.4. 通信通道的使用](#31414-通信通道的使用)
            - [3.14.1.5. 消息的读写](#31415-消息的读写)
    - [3.15. 模块编程](#315-模块编程)
        - [3.15.1. 模块的种类](#3151-模块的种类)
        - [3.15.2. 模块开发实战](#3152-模块开发实战)
        - [3.15.3. 模块的编译和安装](#3153-模块的编译和安装)

<!-- /TOC -->
<a id="markdown-1-mybatis" name="1-mybatis"></a>
# 1. Mybatis

<a href="#menu" style="float:right">目录</a>

<a id="markdown-11-简介" name="11-简介"></a>
## 1.1. 简介
<a href="#menu" style="float:right">目录</a>

<a id="markdown-111-传统的jdbc编程" name="111-传统的jdbc编程"></a>
### 1.1.1. 传统的JDBC编程

**流程**
* 使用JDBC编程需要连接数据库，注册驱动和数据库信息
* 操作Connection,打开Statement对象
* 通过Statement执行SQL，返回结果到ResultSet对象
* 使用ResultSet读取数据，然后转化为具体的POJO对象
* 关闭数据库连接资源

可以看到使用JDBC编程方式相对复杂。

<a id="markdown-112-orm模型" name="112-orm模型"></a>
### 1.1.2. ORM模型

* ORM(Object Relation Mapping)对象关系映射
* ORM就是数据库的表和简单的Java对象的映射关系模型，通过这种关系就能迅速地将数据库的表和POJO对象相互转化。


**什么是 MyBatis**
MyBatis 是一款优秀的持久层框架，它支持定制化 SQL、存储过程以及高级映射。MyBatis 避免了几乎所有的 JDBC 代码和手动设置参数以及获取结果集。MyBatis 可以使用简单的 XML 或注解来配置和映射原生类型、接口和 Java 的 POJO（Plain Old Java Objects，普通老式 Java 对象）为数据库中的记录。

<a id="markdown-113-hibernate与mybatis的对比" name="113-hibernate与mybatis的对比"></a>
### 1.1.3. HIBERNATE与MYBATIS的对比
<a href="#menu" style="float:right">目录</a>

**开发速度的对比**
就开发速度而言，Hibernate的真正掌握要比Mybatis来得难些。Mybatis框架相对简单很容易上手，但也相对简陋些。个人觉得要用好Mybatis还是首先要先理解好Hibernate。
比起两者的开发速度，不仅仅要考虑到两者的特性及性能，更要根据项目需求去考虑究竟哪一个更适合项目开发，比如：一个项目中用到的复杂查询基本没有，就是简单的增删改查，这样选择hibernate效率就很快了，因为基本的sql语句已经被封装好了，根本不需要你去写sql语句，这就节省了大量的时间，但是对于一个大型项目，复杂语句较多，这样再去选择hibernate就不是一个太好的选择，选择mybatis就会加快许多，而且语句的管理也比较方便。

**开发工作量的对比**

Hibernate和MyBatis都有相应的代码生成工具。可以生成简单基本的DAO层方法。针对高级查询，Mybatis需要手动编写SQL语句，以及ResultMap。而Hibernate有良好的映射机制，开发者无需关心SQL的生成与结果映射，可以更专注于业务流程。

**sql优化方面**

Hibernate的查询会将表中的所有字段查询出来，这一点会有性能消耗。Hibernate也可以自己写SQL来指定需要查询的字段，但这样就破坏了Hibernate开发的简洁性。而Mybatis的SQL是手动编写的，所以可以按需求指定查询的字段。

Hibernate HQL语句的调优需要将SQL打印出来，而Hibernate的SQL被很多人嫌弃因为太丑了。MyBatis的SQL是自己手动写的所以调整方便。但Hibernate具有自己的日志统计。Mybatis本身不带日志统计，使用Log4j进行日志记录。

**对象管理的对比**

Hibernate 是完整的对象/关系映射解决方案，它提供了对象状态管理（state management）的功能，使开发者不再需要理会底层数据库系统的细节。也就是说，相对于常见的 JDBC/SQL 持久层方案中需要管理 SQL 语句，Hibernate采用了更自然的面向对象的视角来持久化 Java 应用中的数据。

换句话说，使用 Hibernate 的开发者应该总是关注对象的状态（state），不必考虑 SQL 语句的执行。这部分细节已经由 Hibernate 掌管妥当，只有开发者在进行系统性能调优的时候才需要进行了解。而MyBatis在这一块没有文档说明，用户需要对对象自己进行详细的管理。

**缓存机制**
* **Hibernate缓存**
Hibernate一级缓存是Session缓存，利用好一级缓存就需要对Session的生命周期进行管理好。建议在一个Action操作中使用一个Session。一级缓存需要对Session进行严格管理。

Hibernate二级缓存是SessionFactory级的缓存。 SessionFactory的缓存分为内置缓存和外置缓存。内置缓存中存放的是SessionFactory对象的一些集合属性包含的数据(映射元素据及预定SQL语句等),对于应用程序来说,它是只读的。外置缓存中存放的是数据库数据的副本,其作用和一级缓存类似.二级缓存除了以内存作为存储介质外,还可以选用硬盘等外部存储设备。二级缓存称为进程级缓存或SessionFactory级缓存，它可以被所有session共享，它的生命周期伴随着SessionFactory的生命周期存在和消亡。

* **MyBatis缓存**
MyBatis 包含一个非常强大的查询缓存特性,它可以非常方便地配置和定制。MyBatis 3 中的缓存实现的很多改进都已经实现了,使得它更加强大而且易于配置。

默认情况下是没有开启缓存的,除了局部的 session 缓存,可以增强变现而且处理循环 依赖也是必须的。要开启二级缓存,你需要在你的 SQL 映射文件中添加一行: 
```xml
 <cache/>
```
字面上看就是这样。这个简单语句的效果如下:

映射语句文件中的所有 select 语句将会被缓存。
映射语句文件中的所有 insert,update 和 delete 语句会刷新缓存。
缓存会使用 Least Recently Used(LRU,最近最少使用的)算法来收回。
根据时间表(比如 no Flush Interval,没有刷新间隔), 缓存不会以任何时间顺序 来刷新。
缓存会存储列表集合或对象(无论查询方法返回什么)的 1024 个引用。
缓存会被视为是 read/write(可读/可写)的缓存,意味着对象检索不是共享的,而 且可以安全地被调用者修改,而不干扰其他调用者或线程所做的潜在修改。
所有的这些属性都可以通过缓存元素的属性来修改。

比如: 
```xml
<cache  eviction=”FIFO”  flushInterval=”60000″  size=”512″  readOnly=”true”/>
```

这个更高级的配置创建了一个 FIFO 缓存,并每隔 60 秒刷新,存数结果对象或列表的 512 个引用,而且返回的对象被认为是只读的,因此在不同线程中的调用者之间修改它们会 导致冲突。可用的收回策略有, 默认的是 LRU:

LRU – 最近最少使用的:移除最长时间不被使用的对象。
FIFO – 先进先出:按对象进入缓存的顺序来移除它们。
SOFT – 软引用:移除基于垃圾回收器状态和软引用规则的对象。
WEAK – 弱引用:更积极地移除基于垃圾收集器状态和弱引用规则的对象。
flushInterval(刷新间隔)可以被设置为任意的正整数,而且它们代表一个合理的毫秒 形式的时间段。默认情况是不设置,也就是没有刷新间隔,缓存仅仅调用语句时刷新。

size(引用数目)可以被设置为任意正整数,要记住你缓存的对象数目和你运行环境的 可用内存资源数目。默认值是1024。

readOnly(只读)属性可以被设置为 true 或 false。只读的缓存会给所有调用者返回缓 存对象的相同实例。因此这些对象不能被修改。这提供了很重要的性能优势。可读写的缓存 会返回缓存对象的拷贝(通过序列化) 。这会慢一些,但是安全,因此默认是 false。

相同点：Hibernate和Mybatis的二级缓存除了采用系统默认的缓存机制外，都可以通过实现你自己的缓存或为其他第三方缓存方案，创建适配器来完全覆盖缓存行为。

不同点：Hibernate的二级缓存配置在SessionFactory生成的配置文件中进行详细配置，然后再在具体的表-对象映射中配置是那种缓存。

MyBatis的二级缓存配置都是在每个具体的表-对象映射中进行详细配置，这样针对不同的表可以自定义不同的缓存机制。并且Mybatis可以在命名空间中共享相同的缓存配置和实例，通过Cache-ref来实现。

两者比较：因为Hibernate对查询对象有着良好的管理机制，用户无需关心SQL。所以在使用二级缓存时如果出现脏数据，系统会报出错误并提示。

而MyBatis在这一方面，使用二级缓存时需要特别小心。如果不能完全确定数据更新操作的波及范围，避免Cache的盲目使用。否则，脏数据的出现会给系统的正常运行带来很大的隐患。

<a id="markdown-114-mybatis与ibatis的主要差异对比" name="114-mybatis与ibatis的主要差异对比"></a>
### 1.1.4. Mybatis与iBatis的主要差异对比
<a href="#menu" style="float:right">目录</a>

他们都是优秀的持久层框架，MyBatis是现在最常用的持久层框架，可以动态地拼接sql语句，非常人性化，更适合逻辑复杂的sql；iBatis就是MyBatis前身，他们有很多相似的地方，今天主要讲一下sqlMap里面的变化。

**1. 传入参数**
iBatis是parameterClass，而MyBatis是可以不写的，也可以用parameterType;parameterClass，而MyBatis是可以不写的，也可以用parameterType;
iBatis的传出参数关键字是：resultClass，而MyBatis是resultMap。
iBatis： 
```xml
<select id="selectDeviceByWhere" parameterClass="Map" resultClass="BaseResultMap"> </select>
```
MyBatis：
```xml
<select id="selectDeviceByWhere" parameterType="Map" resultMap="BaseResultMap"> </select>
```

**2. 接收参数**
IBatis是使用# #和$ KaTeX parse error: Expected 'EOF', got '#' at position 23: …使用方法等同于MyBatis;#̲ #=#{ }, = =={ } ，解释一下#和KaTeX parse error: Expected 'EOF', got '#' at position 5: 的区别，#̲字符串处理，加单引号，可以一定…直接使用，当传入的是数字时，用#会进行隐式转换为字符串，耗性能。IBatis是使用# #和$ KaTeX parse error: Expected 'EOF', got '#' at position 23: …使用方法等同于MyBatis;#̲ #=#{ }, = =={ } ，解释一下#和KaTeX parse error: Expected 'EOF', got '#' at position 5: 的区别，#̲字符串处理，加单引号，可以一定…直接使用，当传入的是数字时，用#会进行隐式转换为字符串，耗性能。

**3. 判断语句，这个也是非常常用和重要的地方。**
对于MyBatis的很简单，只要在where 或者if 的标签里面添加test=""就可以了，里面写判断条件了。但是IBatis的就麻烦了许多了，它将每个都方法都进行了封装。例如isNull：判断property字段是否是null

```xml
<isNull prepend="and" property="id">   </isNull>
```
isEqual相当于equals，判断状态值。
```xml
<isEqual property="state" compareValue="0">  </isEqual>` 或
<isEqual property="state" compareProperty="nextState">  </isEqual>
```
isEmpty判断参数是否为Null或者空，满足其中一个条件则其true。
isNotEmpty相反，当参数既不为Null也不为空是其为true。

**4. 循环的使用**
iBatis是使用Iterate：这属性遍历整个集合，并为 java.util.List 集合中的元素重复元素体的内容。例如

```xml
<isNotEmpty property="deptIds">
		and dept_id in 
		<iterate property="deptIds" open="(" close=")" conjunction=",">
			#deptIds[]#
	        </iterate>
	</isNotEmpty>
```
deptIds是数组类型的属性值，当deptIds不为null或“”时，进行deptIds遍历取值。
MyBatis使用的是ForEach方法。他可以遍历List,,Map三种元素。
循环插入：

```xml
<insert id="xxxx" parameterType="CompilingRateDto">
	        insert into cm_compiling_rate (area)
	        values 
	        <foreach collection="compilingRateList" item="compilingRate"  separator="," >
	       		 (#{compilingRate.area})
	         </foreach>
	</insert>
```
循环更新：
```xml
<update id="xxxxx" parameterType="CompilingRateDto">
	        <foreach collection="updateCompilingRateList" item="compiling"  separator=";" >
		        update cm_compiling_rate cr
			      	set  compiling_manpower = #{compiling.compilingManpower},
			     where cr.valid_Month=#{compiling.validMonth}       	
		      </foreach>   	      
	 </update>
```
**5. MyBatis中一条sql结束后可以有“;”，而iBatis会报错**

**6. 存储过程的调用**
```xml
iBatis：

 <procedure id="setCaseQueueStatus.sql" parameterMap="params.caseQueueStatus">
		<![CDATA[
	    	{call CMPCCDATA.PKG_CMPCC_QUEUE_TEASE.PROC_SET_AST_ACCT_STATUS(?,?)}
     		]]>
    </procedure>
   <parameterMap id="params.caseQueueStatus" class="java.util.Map">
	        <parameter property="P_ACCT_SN" jdbcType="VARCHAR" javaType="string" mode="IN" />
	        <parameter property="P_QUEUE_STATUS" jdbcType="VARCHAR" javaType="string" mode="IN" />
    </parameterMap>
```
MyBatis ：
```xml
<select id="xxxxx"  resultType = "java.lang.String" statementType="CALLABLE">
   		{call batch_randomMark()}
</select>
```
通过 statementType 属性将该语句标识为存储过程而非普通 SQL 语句


<a id="markdown-115-mybatis基本构成" name="115-mybatis基本构成"></a>
### 1.1.5. Mybatis基本构成
<a href="#menu" style="float:right">目录</a>

![](https://img2018.cnblogs.com/blog/1715961/201907/1715961-20190725134144858-624879873.jpg)

* SqlSessionFactoryBuider(构造器):根据配置信息或者代码生成SqlSeesionFactory
* SqlSeesionFactory(工厂接口):根据工厂来生成SqlSession
* SqlSession(会话):是一个既可以发送sql语句,然后得到Mapper的接口
* SqlMapper:由java接口和xml文件(或注解)构成的,需要给出对应的sql和映射规则.它负责发送sql去执行,并返回结果.


**生命周期**
生命周期就是每一个对象应该存活的时间，而Mybatis也常用于多线程的使用，错误使用会造成严重的多线程并发问题。

* SqlSessionFactoryBuilder
    * SqlSessionFactoryBuilder的作用是用于创建SqlSessionFactory,创建成功后，SqlSessionFactoryBuilder就失去作用。所以它只能存在于创建SqlSessionFactory的方法中，而不要让其长期存在。
* SqlSessionFactory
    * 相当于是一个数据库的连接池，占据着数据库的连接资源。它的作用是创建SqlSession接口对象。它的生命周期等同于Mybatis的应用周期。一般应用我们希望它作为一个单例，让它被应用中共享，否则如果创建多个数据库连接池，这样不利于对数据库资源的控制，导致数据库连接资源被耗尽。
* SqlSession
    * SqlSession相当于一个数据库连接(Connection对象)，你可以在事务里面执行多条SQL,然后通过它的commit(提交事务)、rollback(回滚事务)等方法。处理完整的请求后，应该关闭这条连接，把它归还SqlSessionFactory,否则数据库资源很快耗尽，所以用try...cath....finally语录来保证关闭。

* Mapper
    * 是由SqlSession创建的，一旦处理完相关业务，就应该废弃它。


<a id="markdown-116-常见面试题" name="116-常见面试题"></a>
### 1.1.6. 常见面试题
<a href="#menu" style="float:right">目录</a>

**1、什么是Mybatis？**

（1）Mybatis是一个半ORM（对象关系映射）框架，它内部封装了JDBC，开发时只需要关注SQL语句本身，不需要花费精力去处理加载驱动、创建连接、创建statement等繁杂的过程。程序员直接编写原生态sql，可以严格控制sql执行性能，灵活度高。

（2）MyBatis 可以使用 XML 或注解来配置和映射原生信息，将 POJO映射成数据库中的记录，避免了几乎所有的 JDBC 代码和手动设置参数以及获取结果集。

（3）通过xml 文件或注解的方式将要执行的各种 statement 配置起来，并通过java对象和 statement中sql的动态参数进行映射生成最终执行的sql语句，最后由mybatis框架执行sql并将结果映射为java对象并返回。（从执行sql到返回result的过程）。

**2、Mybaits的优点：**

（1）基于SQL语句编程，相当灵活，不会对应用程序或者数据库的现有设计造成任何影响，SQL写在XML里，解除sql与程序代码的耦合，便于统一管理；提供XML标签，支持编写动态SQL语句，并可重用。

（2）与JDBC相比，减少了50%以上的代码量，消除了JDBC大量冗余的代码，不需要手动开关连接；

（3）很好的与各种数据库兼容（因为MyBatis使用JDBC来连接数据库，所以只要JDBC支持的数据库MyBatis都支持）。

（4）能够与Spring很好的集成；

（5）提供映射标签，支持对象与数据库的ORM字段关系映射；提供对象关系映射标签，支持对象关系组件维护。

**3、MyBatis框架的缺点：**

（1）SQL语句的编写工作量较大，尤其当字段多、关联表多时，对开发人员编写SQL语句的功底有一定要求。

（2）SQL语句依赖于数据库，导致数据库移植性差，不能随意更换数据库。

**4、MyBatis框架适用场合：**

（1）MyBatis专注于SQL本身，是一个足够灵活的DAO层解决方案。

（2）对性能的要求很高，或者需求变化较多的项目，如互联网项目，MyBatis将是不错的选择。

 

**5、MyBatis与Hibernate有哪些不同？**

（1）Mybatis和hibernate不同，它不完全是一个ORM框架，因为MyBatis需要程序员自己编写Sql语句。

（2）Mybatis直接编写原生态sql，可以严格控制sql执行性能，灵活度高，非常适合对关系数据模型要求不高的软件开发，因为这类软件需求变化频繁，一但需求变化要求迅速输出成果。但是灵活的前提是mybatis无法做到数据库无关性，如果需要实现支持多种数据库的软件，则需要自定义多套sql映射文件，工作量大。 

（3）Hibernate对象/关系映射能力强，数据库无关性好，对于关系模型要求高的软件，如果用hibernate开发可以节省很多代码，提高效率。 

 

**6、#{}和${}的区别是什么？**

 #{}是预编译处理，${}是字符串替换。

Mybatis在处理#{}时，会将sql中的#{}替换为?号，调用PreparedStatement的set方法来赋值；

Mybatis在处理${}时，就是把${}替换成变量的值。

使用#{}可以有效的防止SQL注入，提高系统安全性。

 

**7、当实体类中的属性名和表中的字段名不一样 ，怎么办 ？**

第1种： 通过在查询的sql语句中定义字段名的别名，让字段名的别名和实体类的属性名一致。

```xml
<select id=”selectorder” parametertype=”int” resultetype=”me.gacl.domain.order”>
select order_id id, order_no orderno ,order_price price form orders where order_id=#{id};
</select>
第2种： 通过<resultMap>来映射字段名和实体类属性名的一一对应的关系。

 <select id="getOrder" parameterType="int" resultMap="orderresultmap">
    select * from orders where order_id=#{id}
</select>

<resultMap type=”me.gacl.domain.order” id=”orderresultmap”>
    <!–用id属性来映射主键字段–>
    <id property=”id” column=”order_id”>

    <!–用result属性来映射非主键字段，property为实体类属性名，column为数据表中的属性–>
    <result property = “orderno” column =”order_no”/>
    <result property=”price” column=”order_price” />
</reslutMap>
```

**8、 模糊查询like语句该怎么写?**

第1种：在Java代码中添加sql通配符。

```java
    string wildcardname = “%smi%”;
    list<name> names = mapper.selectlike(wildcardname);
```
```xml
<select id=”selectlike”>
    select * from foo where bar like #{value}
</select>
```
第2种：在sql语句中拼接通配符，会引起sql注入

```java
string wildcardname = “smi”;
list<name> names = mapper.selectlike(wildcardname);
```
```xml
<select id=”selectlike”>
     select * from foo where bar like "%"#{value}"%"
</select>
```

**9、通常一个Xml映射文件，都会写一个Dao接口与之对应，请问，这个Dao接口的工作原理是什么？Dao接口里的方法，参数不同时，方法能重载吗？**


Dao接口即Mapper接口。接口的全限名，就是映射文件中的namespace的值；接口的方法名，就是映射文件中Mapper的Statement的id值；接口方法内的参数，就是传递给sql的参数。

Mapper接口是没有实现类的，当调用接口方法时，接口全限名+方法名拼接字符串作为key值，可唯一定位一个MapperStatement。在Mybatis中，每一个\<select>、\<insert>、\<update>、\<delete>标签，都会被解析为一个MapperStatement对象。

举例：com.mybatis3.mappers.StudentDao.findStudentById，可以唯一找到namespace为com.mybatis3.mappers.StudentDao下面 id 为 findStudentById 的 MapperStatement。

Mapper接口里的方法，是不能重载的，因为是使用 全限名+方法名 的保存和寻找策略。Mapper 接口的工作原理是JDK动态代理，Mybatis运行时会使用JDK动态代理为Mapper接口生成代理对象proxy，代理对象会拦截接口方法，转而执行MapperStatement所代表的sql，然后将sql执行结果返回。

 

**10、Mybatis是如何进行分页的？分页插件的原理是什么？**

Mybatis使用RowBounds对象进行分页，它是针对ResultSet结果集执行的内存分页，而非物理分页。可以在sql内直接书写带有物理分页的参数来完成物理分页功能，也可以使用分页插件来完成物理分页。

分页插件的基本原理是使用Mybatis提供的插件接口，实现自定义插件，在插件的拦截方法内拦截待执行的sql，然后重写sql，根据dialect方言，添加对应的物理分页语句和物理分页参数。

 

**11、Mybatis是如何将sql执行结果封装为目标对象并返回的？都有哪些映射形式？**

第一种是使用<resultMap>标签，逐一定义数据库列名和对象属性名之间的映射关系。

第二种是使用sql列的别名功能，将列的别名书写为对象属性名。

有了列名与属性名的映射关系后，Mybatis通过反射创建对象，同时使用反射给对象的属性逐一赋值并返回，那些找不到映射关系的属性，是无法完成赋值的。

 

**12、如何执行批量插入?**

首先,创建一个简单的insert语句:
```xml
    <insert id=”insertname”>
         insert into names (name) values (#{value})
    </insert>
```
然后在java代码中像下面这样执行批处理插入:
```java
  list<string> names = new arraylist();
    names.add(“fred”);
    names.add(“barney”);
    names.add(“betty”);
    names.add(“wilma”);
 
    // 注意这里 executortype.batch
    sqlsession sqlsession = sqlsessionfactory.opensession(executortype.batch);
    try {
     namemapper mapper = sqlsession.getmapper(namemapper.class);
     for (string name : names) {
         mapper.insertname(name);
     }
     sqlsession.commit();
    }catch(Exception e){
     e.printStackTrace();
     sqlSession.rollback(); 
     throw e; 
    }
     finally {
         sqlsession.close();
    }
```

**13、如何获取自动生成的(主)键值?**

insert 方法总是返回一个int值 ，这个值代表的是插入的行数。

如果采用自增长策略，自动生成的键值在 insert 方法执行完后可以被设置到传入的参数对象中。

示例：
```xml
<insert id=”insertname” usegeneratedkeys=”true” keyproperty=”id”>
     insert into names (name) values (#{name})
</insert>
```
```java
    name name = new name();
    name.setname(“fred”);
 
    int rows = mapper.insertname(name);
    // 完成后,id已经被设置到对象中
    system.out.println(“rows inserted = ” + rows);
    system.out.println(“generated key value = ” + name.getid());
``` 

**14、在mapper中如何传递多个参数?**

（1）第一种：
//DAO层的函数
Public UserselectUser(String name,String area);  
//对应的xml,#{0}代表接收的是dao层中的第一个参数，#{1}代表dao层中第二参数，更多参数一致往后加即可。
```xml
<select id="selectUser"resultMap="BaseResultMap">  
    select *  fromuser_user_t   whereuser_name = #{0} anduser_area=#{1}  
</select>  
```
（2）第二种： 使用 @param 注解:
```java
public interface usermapper {
   user selectuser(@param(“username”) string username,@param(“hashedpassword”) string hashedpassword);
}
```
然后,就可以在xml像下面这样使用(推荐封装为一个map,作为单个参数传递给mapper):
```xml
<select id=”selectuser” resulttype=”user”>
         select id, username, hashedpassword
         from some_table
         where username = #{username}
         and hashedpassword = #{hashedpassword}
</select>
```
（3）第三种：多个参数封装成map
try{
//映射文件的命名空间.SQL片段的ID，就可以调用对应的映射文件中的SQL
//由于我们的参数超过了两个，而方法中只有一个Object参数收集，因此我们使用Map集合来装载我们的参数
```java
Map<String, Object> map = new HashMap();
     map.put("start", start);
     map.put("end", end);
     return sqlSession.selectList("StudentID.pagination", map);
 }catch(Exception e){
     e.printStackTrace();
     sqlSession.rollback();
    throw e; }
finally{
 MybatisUtil.closeSqlSession();
 }
```

**15、Mybatis动态sql有什么用？执行原理？有哪些动态sql？**

Mybatis动态sql可以在Xml映射文件内，以标签的形式编写动态sql，执行原理是根据表达式的值 完成逻辑判断并动态拼接sql的功能。

Mybatis提供了9种动态sql标签：trim | where | set | foreach | if | choose | when | otherwise | bind。

 

**16、Xml映射文件中，除了常见的select|insert|updae|delete标签之外，还有哪些标签？**

答：\<resultMap>、\<parameterMap>、\<sql>、\<include>、\<selectKey>，加上动态sql的9个标签，其中<sql>为sql片段标签，通过\<include>标签引入sql片段，\<selectKey>为不支持自增的主键生成策略标签。

 

**17、Mybatis的Xml映射文件中，不同的Xml映射文件，id是否可以重复？**

不同的Xml映射文件，如果配置了namespace，那么id可以重复；如果没有配置namespace，那么id不能重复；

原因就是namespace+id是作为Map<String, MapperStatement>的key使用的，如果没有namespace，就剩下id，那么，id重复会导致数据互相覆盖。有了namespace，自然id就可以重复，namespace不同，namespace+id自然也就不同。

 

**18、为什么说Mybatis是半自动ORM映射工具？它与全自动的区别在哪里？**

Hibernate属于全自动ORM映射工具，使用Hibernate查询关联对象或者关联集合对象时，可以根据对象关系模型直接获取，所以它是全自动的。而Mybatis在查询关联对象或关联集合对象时，需要手动编写sql来完成，所以，称之为半自动ORM映射工具。

 

**19、 一对一、一对多的关联查询 ？** 

```xml
<mapper namespace="com.lcb.mapping.userMapper">  
    <!--association  一对一关联查询 -->  
    <select id="getClass" parameterType="int" resultMap="ClassesResultMap">  
        select * from class c,teacher t where c.teacher_id=t.t_id and c.c_id=#{id}  
    </select>  
 
    <resultMap type="com.lcb.user.Classes" id="ClassesResultMap">  
        <!-- 实体类的字段名和数据表的字段名映射 -->  
        <id property="id" column="c_id"/>  
        <result property="name" column="c_name"/>  
        <association property="teacher" javaType="com.lcb.user.Teacher">  
            <id property="id" column="t_id"/>  
            <result property="name" column="t_name"/>  
        </association>  
    </resultMap>  
 
 
    <!--collection  一对多关联查询 -->  
    <select id="getClass2" parameterType="int" resultMap="ClassesResultMap2">  
        select * from class c,teacher t,student s where c.teacher_id=t.t_id and c.c_id=s.class_id and c.c_id=#{id}  
    </select>  
 
    <resultMap type="com.lcb.user.Classes" id="ClassesResultMap2">  
        <id property="id" column="c_id"/>  
        <result property="name" column="c_name"/>  
        <association property="teacher" javaType="com.lcb.user.Teacher">  
            <id property="id" column="t_id"/>  
            <result property="name" column="t_name"/>  
        </association>  
 
        <collection property="student" ofType="com.lcb.user.Student">  
            <id property="id" column="s_id"/>  
            <result property="name" column="s_name"/>  
        </collection>  
    </resultMap>  
</mapper> 
```

**20、MyBatis实现一对一有几种方式?具体怎么操作的？**

有联合查询和嵌套查询,联合查询是几个表联合查询,只查询一次, 通过在resultMap里面配置association节点配置一对一的类就可以完成；

嵌套查询是先查一个表，根据这个表里面的结果的 外键id，去再另外一个表里面查询数据,也是通过association配置，但另外一个表的查询通过select属性配置。

 

**21、MyBatis实现一对多有几种方式,怎么操作的？**

        有联合查询和嵌套查询。联合查询是几个表联合查询,只查询一次,通过在resultMap里面的collection节点配置一对多的类就可以完成；嵌套查询是先查一个表,根据这个表里面的 结果的外键id,去再另外一个表里面查询数据,也是通过配置collection,但另外一个表的查询通过select节点配置。

 

**22、Mybatis是否支持延迟加载？如果支持，它的实现原理是什么？**

答：Mybatis仅支持association关联对象和collection关联集合对象的延迟加载，association指的就是一对一，collection指的就是一对多查询。在Mybatis配置文件中，可以配置是否启用延迟加载lazyLoadingEnabled=true|false。

它的原理是，使用CGLIB创建目标对象的代理对象，当调用目标方法时，进入拦截器方法，比如调用a.getB().getName()，拦截器invoke()方法发现a.getB()是null值，那么就会单独发送事先保存好的查询关联B对象的sql，把B查询上来，然后调用a.setB(b)，于是a的对象b属性就有值了，接着完成a.getB().getName()方法的调用。这就是延迟加载的基本原理。

当然了，不光是Mybatis，几乎所有的包括Hibernate，支持延迟加载的原理都是一样的。

 

**23、Mybatis的一级、二级缓存:**

1）一级缓存: 基于 PerpetualCache 的 HashMap 本地缓存，其存储作用域为 Session，当 Session flush 或 close 之后，该 Session 中的所有 Cache 就将清空，默认打开一级缓存。

2）二级缓存与一级缓存其机制相同，默认也是采用 PerpetualCache，HashMap 存储，不同在于其存储作用域为 Mapper(Namespace)，并且可自定义存储源，如 Ehcache。默认不打开二级缓存，要开启二级缓存，使用二级缓存属性类需要实现Serializable序列化接口(可用来保存对象的状态),可在它的映射文件中配置<cache/> ；

3）对于缓存数据更新机制，当某一个作用域(一级缓存 Session/二级缓存Namespaces)的进行了C/U/D 操作后，默认该作用域下所有 select 中的缓存将被 clear。

 

**24、什么是MyBatis的接口绑定？有哪些实现方式？**

接口绑定，就是在MyBatis中任意定义接口,然后把接口里面的方法和SQL语句绑定, 我们直接调用接口方法就可以,这样比起原来了SqlSession提供的方法我们可以有更加灵活的选择和设置。

接口绑定有两种实现方式,一种是通过注解绑定，就是在接口的方法上面加上 @Select、@Update等注解，里面包含Sql语句来绑定；另外一种就是通过xml里面写SQL来绑定, 在这种情况下,要指定xml映射文件里面的namespace必须为接口的全路径名。当Sql语句比较简单时候,用注解绑定, 当SQL语句比较复杂时候,用xml绑定,一般用xml绑定的比较多。

**25、使用MyBatis的mapper接口调用时有哪些要求？**

1.Mapper接口方法名和mapper.xml中定义的每个sql的id相同；
2.Mapper接口方法的输入参数类型和mapper.xml中定义的每个sql 的parameterType的类型相同；
3.Mapper接口方法的输出参数类型和mapper.xml中定义的每个sql的resultType的类型相同；
4.Mapper.xml文件中的namespace即是mapper接口的类路径。

**26、Mapper编写有哪几种方式？**

第一种：接口实现类继承SqlSessionDaoSupport：使用此种方法需要编写mapper接口，mapper接口实现类、mapper.xml文件。
（1）在sqlMapConfig.xml中配置mapper.xml的位置
```xml
<mappers>
    <mapper resource="mapper.xml文件的地址" />
    <mapper resource="mapper.xml文件的地址" />
</mappers>
```
（2）定义mapper接口
（3）实现类集成SqlSessionDaoSupport
mapper方法中可以this.getSqlSession()进行数据增删改查。
（4）spring 配置
```xml
<bean id=" " class="mapper接口的实现">
    <property name="sqlSessionFactory" ref="sqlSessionFactory"></property>
</bean>
```
 
第二种：使用org.mybatis.spring.mapper.MapperFactoryBean：
（1）在sqlMapConfig.xml中配置mapper.xml的位置，如果mapper.xml和mappre接口的名称相同且在同一个目录，这里可以不用配置
```xml
<mappers>
    <mapper resource="mapper.xml文件的地址" />
    <mapper resource="mapper.xml文件的地址" />
</mappers>
```
（2）定义mapper接口：
1.mapper.xml中的namespace为mapper接口的地址
2.mapper接口中的方法名和mapper.xml中的定义的statement的id保持一致
3.Spring中定义
```xml
<bean id="" class="org.mybatis.spring.mapper.MapperFactoryBean">
    <property name="mapperInterface"   value="mapper接口地址" /> 
    <property name="sqlSessionFactory" ref="sqlSessionFactory" /> 
</bean>
```

第三种：使用mapper扫描器：
（1）mapper.xml文件编写：
mapper.xml中的namespace为mapper接口的地址；
mapper接口中的方法名和mapper.xml中的定义的statement的id保持一致；
如果将mapper.xml和mapper接口的名称保持一致则不用在sqlMapConfig.xml中进行配置。 
（2）定义mapper接口：
注意mapper.xml的文件名和mapper的接口名称保持一致，且放在同一个目录
（3）配置mapper扫描器：
```
<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
    <property name="basePackage" value="mapper接口包地址"></property>
    <property name="sqlSessionFactoryBeanName" value="sqlSessionFactory"/> 
</bean>
```
（4）使用扫描器后从spring容器中获取mapper的实现对象。

 

**27、简述Mybatis的插件运行原理，以及如何编写一个插件。**

答：Mybatis仅可以编写针对ParameterHandler、ResultSetHandler、StatementHandler、Executor这4种接口的插件，Mybatis使用JDK的动态代理，为需要拦截的接口生成代理对象以实现接口方法拦截功能，每当执行这4种接口对象的方法时，就会进入拦截方法，具体就是InvocationHandler的invoke()方法，当然，只会拦截那些你指定需要拦截的方法。

编写插件：实现Mybatis的Interceptor接口并复写intercept()方法，然后在给插件编写注解，指定要拦截哪一个接口的哪些方法即可，记住，别忘了在配置文件中配置你编写的插件。





<a id="markdown-12-配置" name="12-配置"></a>
## 1.2. 配置
<a href="#menu" style="float:right">目录</a>

<a id="markdown-121-配置" name="121-配置"></a>
### 1.2.1. 配置
<a href="#menu" style="float:right">目录</a>

**配置结构**
* configuration（配置）
    * properties（属性）
    * settings（设置）
    * typeAliases（类型别名）
    * typeHandlers（类型处理器）
    * objectFactory（对象工厂）
    * plugins（插件）
    * environments（环境配置）
    * environment（环境变量）
    * transactionManager（事务管理器）
    * dataSource（数据源）
    * databaseIdProvider（数据库厂商标识）
    * mappers（映射器）

<a id="markdown-122-属性properties" name="122-属性properties"></a>
### 1.2.2. 属性（properties）
<a href="#menu" style="float:right">目录</a>

这些属性都是可外部配置且可动态替换的，既可以在典型的 Java 属性文件中配置，亦可通过 properties 元素的子元素来传递。例如：

```xml
<properties resource="org/mybatis/example/config.properties">
  <property name="username" value="dev_user"/>
  <property name="password" value="F2Fa3!33TYyg"/>
</properties>
```
然后其中的属性就可以在整个配置文件中被用来替换需要动态配置的属性值。比如:
```xml
<dataSource type="POOLED">
  <property name="driver" value="${driver}"/>
  <property name="url" value="${url}"/>
  <property name="username" value="${username}"/>
  <property name="password" value="${password}"/>
</dataSource>
```

这个例子中的 username 和 password 将会由 properties 元素中设置的相应值来替换。 driver 和 url 属性将会由 config.properties 文件中对应的值来替换。这样就为配置提供了诸多灵活选择。

属性也可以被传递到 SqlSessionFactoryBuilder.build()方法中。例如：
```java
SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader, props);

// ... 或者 ...

SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader, environment, props);
```

如果属性在不只一个地方进行了配置，那么 MyBatis 将按照下面的顺序来加载：

在 properties 元素体内指定的属性首先被读取。
然后根据 properties 元素中的 resource 属性读取类路径下属性文件或根据 url 属性指定的路径读取属性文件，并覆盖已读取的同名属性。
最后读取作为方法参数传递的属性，并覆盖已读取的同名属性。
因此，通过方法参数传递的属性具有最高优先级，resource/url 属性中指定的配置文件次之，最低优先级的是 properties 属性中指定的属性。

从 MyBatis 3.4.2 开始，你可以为占位符指定一个默认值。例如：
```xml
<dataSource type="POOLED">
  <!-- ... -->
  <property name="username" value="${username:ut_user}"/> <!-- 如果属性 'username' 没有被配置，'username' 属性的值将为 'ut_user' -->
</dataSource>
```
这个特性默认是关闭的。如果你想为占位符指定一个默认值， 你应该添加一个指定的属性来开启这个特性。例如：
```xml
<properties resource="org/mybatis/example/config.properties">
  <!-- ... -->
  <property name="org.apache.ibatis.parsing.PropertyParser.enable-default-value" value="true"/> <!-- 启用默认值特性 -->
</properties>
```
提示 如果你已经使用 ":" 作为属性的键（如：db:username） ，或者你已经在 SQL 定义中使用 OGNL 表达式的三元运算符（如： ${tableName != null ? tableName : 'global_constants'}），你应该通过设置特定的属性来修改分隔键名和默认值的字符。例如：
```xml
<properties resource="org/mybatis/example/config.properties">
  <!-- ... -->
  <property name="org.apache.ibatis.parsing.PropertyParser.default-value-separator" value="?:"/> <!-- 修改默认值的分隔符 -->
</properties>
<dataSource type="POOLED">
  <!-- ... -->
  <property name="username" value="${db:username?:ut_user}"/>
</dataSource>
```
设置（settings）
这是 MyBatis 中极为重要的调整设置，它们会改变 MyBatis 的运行时行为。 下表描述了设置中各项的意图、默认值等。

|设置名|	描述|	有效值|	默认值|
|---|---|---|---|
|cacheEnabled|全局地开启或关闭配置文件中的所有映射器已经配置的任何缓存。|true\false|true
|lazyLoadingEnabled|延迟加载的全局开关。当开启时，所有关联对象都会延迟加载。 特定关联关系中可通过设置 fetchType 属性来覆盖该项的开关状态。|true\false|false
|aggressiveLazyLoading|	当开启时，任何方法的调用都会加载该对象的所有属性。 否则，每个属性会按需加载（参考 lazyLoadTriggerMethods)。|	true \false|	false （在 3.4.1 及之前的版本默认值为 true）
|multipleResultSetsEnabled|	是否允许单一语句返回多结果集（需要驱动支持）。|	true \false|	true
|useColumnLabel|	使用列标签代替列名。不同的驱动在这方面会有不同的表现，具体可参考相关驱动文档或通过测试这两种不同的模式来观察所用驱动的结果。|	true \ false|	true
|useGeneratedKeys|	允许 JDBC 支持自动生成主键，需要驱动支持。 如果设置为 true 则这个设置强制使用自动生成主键，尽管一些驱动不能支持但仍可正常工作（比如 Derby）。|	true \false|	False
|autoMappingBehavior|	指定 MyBatis 应如何自动映射列到字段或属性。| NONE 表示取消自动映射；PARTIAL 只会自动映射没有定义嵌套结果集映射的结果集。 FULL 会自动映射任意复杂的结果集（无论是否嵌套）。|	NONE, PARTIAL, FULL	PARTIAL
|autoMappingUnknownColumnBehavior|指定发现自动映射目标未知列（或者未知属性类型）的行为。NONE: 不做任何反应WARNING: 输出提醒日志 ('org.apache.ibatis.session.AutoMappingUnknownColumnBehavior' 的日志等级必须设置为 WARN)FAILING: 映射失败 (抛出 SqlSessionException)|NONE, WARNING, FAILING	|NONE
|defaultExecutorType|配置默认的执行器。SIMPLE 就是普通的执行器；REUSE 执行器会重用预处理语句（prepared tatements）； BATCH 执行器将重用语句并执行批量更新。|	SIMPLE REUSE BATCH|	SIMPLE
|defaultStatementTimeout|设置超时时间，它决定驱动等待数据库响应的秒数。|	任意正整数|	未设置 (null)
|defaultFetchSize|	为驱动的结果集获取数量（fetchSize）设置一个提示值。此参数只可以在查询设置中被覆盖。|任意正整数|	未设置 (null)
|defaultResultSetType|Specifies a scroll strategy when omit it per statement settings. (Since: 3.5.2)	FORWARD_ONLY \SCROLL_SENSITIVE  \SCROLL_INSENSITIVE  \DEFAULT(same behavior with 'Not Set')|Not Set |(null)
|safeRowBoundsEnabled|	允许在嵌套语句中使用分页（RowBounds）。如果允许使用则设置为 false。|true  \ false|False
|safeResultHandlerEnabled|	允许在嵌套语句中使用分页（ResultHandler）。如果允许使用则设置为 false。|	true  \ false|	True
|mapUnderscoreToCamelCase|	是否开启自动驼峰命名规则（camel case）映射，即从经典数据库列名 A_COLUMN 到经典 Java 属性名 aColumn 的类似映射。|	true  \ false	|False
|localCacheScope	|MyBatis 利用本地缓存机制（Local Cache）防止循环引用（circular references）和加速重复嵌套查询。 默认值为 SESSION，这种情况下会缓存一个会话中执行的所有查询。 若设置值为 STATEMENT，本地会话仅用在语句执行上，对相同 SqlSession 的不同调用将不会共享数据。|	SESSION  \STATEMENT|	SESSION
|jdbcTypeForNull|	当没有为参数提供特定的 JDBC 类型时，为空值指定 JDBC 类型。 某些驱动需要指定列的 JDBC 类型，多数情况直接用一般类型即可，比如 NULL、VARCHAR 或 OTHER。|	JdbcType 常量，常用值：NULL, VARCHAR 或 OTHER。	|OTHER
|lazyLoadTriggerMethods	|指定哪个对象的方法触发一次延迟加载。|	用逗号分隔的方法列表。|	equals,clone,hashCode,toString
|defaultScriptingLanguage|	指定动态 SQL 生成的默认语言。	|一个类型别名或完全限定类名。|org.apache.ibatis.scripting.xmltags.XMLLanguageDriver
|defaultEnumTypeHandler	|指定 Enum 使用的默认 TypeHandler 。（新增于 3.4.5）	|一个类型别名或完全限定类名。|	org.apache.ibatis.type.EnumTypeHandler
|callSettersOnNulls	|指定当结果集中值为 null 的时候是否调用映射对象的 setter（map 对象时为 put）方法，这在依赖于 Map.keySet() 或 null 值初始化的时候比较有用。注意基本类型（int、boolean 等）是不能设置成 null 的。|	true  \ false|	false
|returnInstanceForEmptyRow|	当返回行的所有列都是空时，MyBatis默认返回 null。 当开启这个设置时，MyBatis会返回一个空实例。 请注意，它也适用于嵌套的结果集 （如集合或关联）。（新增于 3.4.2）|	true  \ false|	false
|logPrefix|	指定 MyBatis 增加到日志名称的前缀。	任何字符串	未设置
logImpl	指定 MyBatis 所用日志的具体实现，未指定时将自动查找。|	SLF4J  \LOG4J  \ LOG4J2  \ JDK_LOGGING  \COMMONS_LOGGING  \ STDOUT_LOGGING  \ NO_LOGGING|	未设置
|proxyFactory	|指定 Mybatis 创建具有延迟加载能力的对象所用到的代理工具。|	CGLIB  \JAVASSIST	|JAVASSIST （MyBatis 3.3 以上）
|vfsImpl|	指定 VFS 的实现	|自定义 VFS 的实现的类全限定名，以逗号分隔。|	未设置
|useActualParamName	|允许使用方法签名中的名称作为语句参数名称。 为了使用该特性，你的项目必须采用 Java 8 编译，并且加上 -parameters 选项。（新增于 3.4.1）|	true  \ false|	true
|configurationFactory	|指定一个提供 Configuration 实例的类。 这个被返回的 Configuration 实例用来加载被反序列化对象的延迟加载属性值。 这个类必须包含一个签名为static Configuration getConfiguration() 的方法。（新增于 3.2.3）	|类型别名或者全类名.|	未设置

一个配置完整的 settings 元素的示例如下：
```xml
<settings>
  <setting name="cacheEnabled" value="true"/>
  <setting name="lazyLoadingEnabled" value="true"/>
  <setting name="multipleResultSetsEnabled" value="true"/>
  <setting name="useColumnLabel" value="true"/>
  <setting name="useGeneratedKeys" value="false"/>
  <setting name="autoMappingBehavior" value="PARTIAL"/>
  <setting name="autoMappingUnknownColumnBehavior" value="WARNING"/>
  <setting name="defaultExecutorType" value="SIMPLE"/>
  <setting name="defaultStatementTimeout" value="25"/>
  <setting name="defaultFetchSize" value="100"/>
  <setting name="safeRowBoundsEnabled" value="false"/>
  <setting name="mapUnderscoreToCamelCase" value="false"/>
  <setting name="localCacheScope" value="SESSION"/>
  <setting name="jdbcTypeForNull" value="OTHER"/>
  <setting name="lazyLoadTriggerMethods" value="equals,clone,hashCode,toString"/>
</settings>
```

<a id="markdown-123-类型别名typealiases" name="123-类型别名typealiases"></a>
### 1.2.3. 类型别名（typeAliases）
<a href="#menu" style="float:right">目录</a>

类型别名是为 Java 类型设置一个短的名字。 它只和 XML 配置有关，存在的意义仅在于用来减少类完全限定名的冗余。例如：
```xml
<typeAliases>
  <typeAlias alias="Author" type="domain.blog.Author"/>
  <typeAlias alias="Blog" type="domain.blog.Blog"/>
  <typeAlias alias="Comment" type="domain.blog.Comment"/>
  <typeAlias alias="Post" type="domain.blog.Post"/>
  <typeAlias alias="Section" type="domain.blog.Section"/>
  <typeAlias alias="Tag" type="domain.blog.Tag"/>
</typeAliases>
```
当这样配置时，Blog 可以用在任何使用 domain.blog.Blog 的地方。

也可以指定一个包名，MyBatis 会在包名下面搜索需要的 Java Bean，比如：
```xml
<typeAliases>
  <package name="domain.blog"/>
</typeAliases>
```
每一个在包 domain.blog 中的 Java Bean，在没有注解的情况下，会使用 Bean 的首字母小写的非限定类名来作为它的别名。 比如 domain.blog.Author 的别名为 author；若有注解，则别名为其注解值。见下面的例子：
```java
@Alias("author")
public class Author {
    ...
}
```
这是一些为常见的 Java 类型内建的相应的类型别名。它们都是不区分大小写的，注意对基本类型名称重复采取的特殊命名风格。

|别名|	映射的类型|
|---|---|
|_byte|	byte
|_long|	long
|_short|	short
|_int|	int
|_integer	|int
|_double|	double
||_float|	float
|_boolean|	boolean
|string	|String
|byte|	Byte
|long	|Long
|short|	Short
|int|	Integer
|integer|	Integer
|double|	Double
|float|	Float
|boolean|	Boolean
|date|	Date
|decimal|	BigDecimal
|bigdecimal|	BigDecimal
|object	|Object
|map|	Map
|hashmap|	HashMap
|list|	List
|arraylist|	ArrayList
|collection|	Collection
|iterator|	Iterator

<a id="markdown-124-类型处理器typehandlers" name="124-类型处理器typehandlers"></a>
### 1.2.4. 类型处理器（typeHandlers）
<a href="#menu" style="float:right">目录</a>

无论是 MyBatis 在预处理语句（PreparedStatement）中设置一个参数时，还是从结果集中取出一个值时， 都会用类型处理器将获取的值以合适的方式转换成 Java 类型。下表描述了一些默认的类型处理器。

提示 从 3.4.5 开始，MyBatis 默认支持 JSR-310（日期和时间 API） 。

|类型处理器	|Java 类型|	JDBC 类型
|---|---|
|BooleanTypeHandler	|java.lang.Boolean, boolean	|数据库兼容的 BOOLEAN
|ByteTypeHandler	|java.lang.Byte, byte	|数据库兼容的 NUMERIC 或 BYTE
|ShortTypeHandler	|java.lang.Short, short	|数据库兼容的 NUMERIC 或 SMALLINT
|IntegerTypeHandler	|java.lang.Integer, int	|数据库兼容的 NUMERIC 或 INTEGER
|LongTypeHandler	|java.lang.Long, long	|数据库兼容的 NUMERIC 或 BIGINT
|FloatTypeHandler	|java.lang.Float, float	|数据库兼容的 NUMERIC 或 FLOAT
|DoubleTypeHandler	|java.lang.Double, double	|数据库兼容的 NUMERIC 或 DOUBLE
|BigDecimalTypeHandler	|java.math.BigDecimal	|数据库兼容的 NUMERIC 或 DECIMAL
|StringTypeHandler	|java.lang.String	|CHAR, VARCHAR
|ClobReaderTypeHandler	|java.io.Reader	-
|ClobTypeHandler	|java.lang.String	|CLOB, LONGVARCHAR
|NStringTypeHandler	|java.lang.String	|NVARCHAR, NCHAR
|NClobTypeHandler	|java.lang.String	|NCLOB
|BlobInputStreamTypeHandler	|java.io.InputStream	|-
|ByteArrayTypeHandler	|byte[]	|数据库兼容的字节流类型
|BlobTypeHandler	|byte[]	BLOB, |LONGVARBINARY
|DateTypeHandler	|java.util.Date	|TIMESTAMP
|DateOnlyTypeHandler	|java.util.Date	|DATE
|TimeOnlyTypeHandler	|java.util.Date	|TIME
|SqlTimestampTypeHandler	|java.sql.Timestamp	|TIMESTAMP
|SqlDateTypeHandler	|java.sql.Date	|DATE
|SqlTimeTypeHandler	|java.sql.Time	|TIME
|ObjectTypeHandler	|Any	|OTHER 或未指定类型
|EnumTypeHandler	|Enumeration Type	|VARCHAR 或任何兼容的字符串类型，用以存储枚举的名称（而不是索引值）
|EnumOrdinalTypeHandler	|Enumeration Type	|任何兼容的 NUMERIC 或 DOUBLE 类型，存储枚举的序数值（而不是名称）。
|SqlxmlTypeHandler	|java.lang.String	|SQLXML
|InstantTypeHandler	|java.time.Instant	|TIMESTAMP
|LocalDateTimeTypeHandler	|java.time.LocalDateTime	|TIMESTAMP
|LocalDateTypeHandler	|java.time.LocalDate	|DATE
|LocalTimeTypeHandler	|java.time.LocalTime	|TIME
|OffsetDateTimeTypeHandler	|java.time.OffsetDateTime	|TIMESTAMP
|OffsetTimeTypeHandler	|java.time.OffsetTime	|TIME
|ZonedDateTimeTypeHandler	|java.time.ZonedDateTime	|TIMESTAMP
|YearTypeHandler	|java.time.Year	|INTEGER
|MonthTypeHandler	|java.time.Month	|INTEGER
|YearMonthTypeHandler	|java.time.YearMonth	|VARCHAR 或 LONGVARCHAR
|JapaneseDateTypeHandler	|java.time.chrono.JapaneseDate|DATE

你可以重写类型处理器或创建你自己的类型处理器来处理不支持的或非标准的类型。 具体做法为：实现 org.apache.ibatis.type.TypeHandler 接口， 或继承一个很便利的类 org.apache.ibatis.type.BaseTypeHandler， 然后可以选择性地将它映射到一个 JDBC 类型。比如：


```java
// ExampleTypeHandler.java
@MappedJdbcTypes(JdbcType.VARCHAR)
public class ExampleTypeHandler extends BaseTypeHandler<String> {

  @Override
  public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
    ps.setString(i, parameter);
  }

  @Override
  public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
    return rs.getString(columnName);
  }

  @Override
  public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
    return rs.getString(columnIndex);
  }

  @Override
  public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
    return cs.getString(columnIndex);
  }
}
```

```xml
<!-- mybatis-config.xml -->
<typeHandlers>
  <typeHandler handler="org.mybatis.example.ExampleTypeHandler"/>
</typeHandlers>
```

使用上述的类型处理器将会覆盖已经存在的处理 Java 的 String 类型属性和 VARCHAR 参数及结果的类型处理器。 要注意 MyBatis 不会通过窥探数据库元信息来决定使用哪种类型，所以你必须在参数和结果映射中指明那是 VARCHAR 类型的字段， 以使其能够绑定到正确的类型处理器上。这是因为 MyBatis 直到语句被执行时才清楚数据类型。

通过类型处理器的泛型，MyBatis 可以得知该类型处理器处理的 Java 类型，不过这种行为可以通过两种方法改变：

在类型处理器的配置元素（typeHandler 元素）上增加一个 javaType 属性（比如：javaType="String"）；
在类型处理器的类上（TypeHandler class）增加一个 @MappedTypes 注解来指定与其关联的 Java 类型列表。 如果在 javaType 属性中也同时指定，则注解方式将被忽略。
可以通过两种方式来指定被关联的 JDBC 类型：

在类型处理器的配置元素上增加一个 jdbcType 属性（比如：jdbcType="VARCHAR"）；
在类型处理器的类上增加一个 @MappedJdbcTypes 注解来指定与其关联的 JDBC 类型列表。 如果在 jdbcType 属性中也同时指定，则注解方式将被忽略。
当在 ResultMap 中决定使用哪种类型处理器时，此时 Java 类型是已知的（从结果类型中获得），但是 JDBC 类型是未知的。 因此 Mybatis 使用 javaType=[Java 类型], jdbcType=null 的组合来选择一个类型处理器。 这意味着使用 @MappedJdbcTypes 注解可以限制类型处理器的范围，同时除非显式的设置，否则类型处理器在 ResultMap 中将是无效的。 如果希望在 ResultMap 中使用类型处理器，那么设置 @MappedJdbcTypes 注解的 includeNullJdbcType=true 即可。 然而从 Mybatis 3.4.0 开始，如果只有一个注册的类型处理器来处理 Java 类型，那么它将是 ResultMap 使用 Java 类型时的默认值（即使没有 includeNullJdbcType=true）。

最后，可以让 MyBatis 为你查找类型处理器：
```xml
<!-- mybatis-config.xml -->
<typeHandlers>
  <package name="org.mybatis.example"/>
</typeHandlers>
```

注意在使用自动发现功能的时候，只能通过注解方式来指定 JDBC 的类型。

你可以创建一个能够处理多个类的泛型类型处理器。为了使用泛型类型处理器， 需要增加一个接受该类的 class 作为参数的构造器，这样在构造一个类型处理器的时候 MyBatis 就会传入一个具体的类。

```java
//GenericTypeHandler.java
public class GenericTypeHandler<E extends MyObject> extends BaseTypeHandler<E> {

  private Class<E> type;

  public GenericTypeHandler(Class<E> type) {
    if (type == null) throw new IllegalArgumentException("Type argument cannot be null");
    this.type = type;
  }
```
EnumTypeHandler 和 EnumOrdinalTypeHandler 都是泛型类型处理器，我们将会在接下来的部分详细探讨。

<a id="markdown-125-处理枚举类型" name="125-处理枚举类型"></a>
### 1.2.5. 处理枚举类型
<a href="#menu" style="float:right">目录</a>

若想映射枚举类型 Enum，则需要从 EnumTypeHandler 或者 EnumOrdinalTypeHandler 中选一个来使用。

比如说我们想存储取近似值时用到的舍入模式。默认情况下，MyBatis 会利用 EnumTypeHandler 来把 Enum 值转换成对应的名字。

注意 EnumTypeHandler 在某种意义上来说是比较特别的，其他的处理器只针对某个特定的类，而它不同，它会处理任意继承了 Enum 的类。
不过，我们可能不想存储名字，相反我们的 DBA 会坚持使用整形值代码。那也一样轻而易举： 在配置文件中把 EnumOrdinalTypeHandler 加到 typeHandlers 中即可， 这样每个 RoundingMode 将通过���们的序数值来映射成对应的整形数值。
```xml
<!-- mybatis-config.xml -->
<typeHandlers>
  <typeHandler handler="org.apache.ibatis.type.EnumOrdinalTypeHandler" javaType="java.math.RoundingMode"/>
</typeHandlers>
```
但是怎样能将同样的 Enum 既映射成字符串又映射成整形呢？

自动映射器（auto-mapper）会自动地选用 EnumOrdinalTypeHandler 来处理， 所以如果我们想用普通的 EnumTypeHandler，就必须要显式地为那些 SQL 语句设置要使用的类型处理器。

（下一节才开始介绍映射器文件，如果你是首次阅读该文档，你可能需要先跳过这里，过会再来看。）

```xml
<!DOCTYPE mapper
    PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
    "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<mapper namespace="org.apache.ibatis.submitted.rounding.Mapper">
	<resultMap type="org.apache.ibatis.submitted.rounding.User" id="usermap">
		<id column="id" property="id"/>
		<result column="name" property="name"/>
		<result column="funkyNumber" property="funkyNumber"/>
		<result column="roundingMode" property="roundingMode"/>
	</resultMap>

	<select id="getUser" resultMap="usermap">
		select * from users
	</select>
	<insert id="insert">
	    insert into users (id, name, funkyNumber, roundingMode) values (
	    	#{id}, #{name}, #{funkyNumber}, #{roundingMode}
	    )
	</insert>

	<resultMap type="org.apache.ibatis.submitted.rounding.User" id="usermap2">
		<id column="id" property="id"/>
		<result column="name" property="name"/>
		<result column="funkyNumber" property="funkyNumber"/>
		<result column="roundingMode" property="roundingMode" typeHandler="org.apache.ibatis.type.EnumTypeHandler"/>
	</resultMap>
	<select id="getUser2" resultMap="usermap2">
		select * from users2
	</select>
	<insert id="insert2">
	    insert into users2 (id, name, funkyNumber, roundingMode) values (
	    	#{id}, #{name}, #{funkyNumber}, #{roundingMode, typeHandler=org.apache.ibatis.type.EnumTypeHandler}
	    )
	</insert>

</mapper>
```

注意，这里的 select 语句强制使用 resultMap 来代替 resultType。

<a id="markdown-126-对象工厂objectfactory" name="126-对象工厂objectfactory"></a>
### 1.2.6. 对象工厂（objectFactory）
<a href="#menu" style="float:right">目录</a>

MyBatis 每次创建结果对象的新实例时，它都会使用一个对象工厂（ObjectFactory）实例来完成。 默认的对象工厂需要做的仅仅是实例化目标类，要么通过默认构造方法，要么在参数映射存在的时候通过参数构造方法来实例化。 如果想覆盖对象工厂的默认行为，则可以通过创建自己的对象工厂来实现。比如：
```java
// ExampleObjectFactory.java
public class ExampleObjectFactory extends DefaultObjectFactory {
  public Object create(Class type) {
    return super.create(type);
  }
  public Object create(Class type, List<Class> constructorArgTypes, List<Object> constructorArgs) {
    return super.create(type, constructorArgTypes, constructorArgs);
  }
  public void setProperties(Properties properties) {
    super.setProperties(properties);
  }
  public <T> boolean isCollection(Class<T> type) {
    return Collection.class.isAssignableFrom(type);
  }}
```

```xml
<!-- mybatis-config.xml -->
<objectFactory type="org.mybatis.example.ExampleObjectFactory">
  <property name="someProperty" value="100"/>
</objectFactory>
```

ObjectFactory 接口很简单，它包含两个创建用的方法，一个是处理默认构造方法的，另外一个是处理带参数的构造方法的。 最后，setProperties 方法可以被用来配置 ObjectFactory，在初始化你的 ObjectFactory 实例后， objectFactory 元素体中定义的属性会被传递给 setProperties 方法。

<a id="markdown-127-插件plugins" name="127-插件plugins"></a>
### 1.2.7. 插件（plugins）
<a href="#menu" style="float:right">目录</a>

MyBatis 允许你在已映射语句执行过程中的某一点进行拦截调用。默认情况下，MyBatis 允许使用插件来拦截的方法调用包括：

Executor (update, query, flushStatements, commit, rollback, getTransaction, close, isClosed)
ParameterHandler (getParameterObject, setParameters)
ResultSetHandler (handleResultSets, handleOutputParameters)
StatementHandler (prepare, parameterize, batch, update, query)
这些类中方法的细节可以通过查看每个方法的签名来发现，或者直接查看 MyBatis 发行包中的源代码。 如果你想做的不仅仅是监控方法的调用，那么你最好相当了解要重写的方法的行为。 因为如果在试图修改或重写已有方法的行为的时候，你很可能在破坏 MyBatis 的核心模块。 这些都是更低层的类和方法，所以使用插件的时候要特别当心。

通过 MyBatis 提供的强大机制，使用插件是非常简单的，只需实现 Interceptor 接口，并指定想要拦截的方法签名即可。

```java
// ExamplePlugin.java
@Intercepts({@Signature(
  type= Executor.class,
  method = "update",
  args = {MappedStatement.class,Object.class})})
public class ExamplePlugin implements Interceptor {
  private Properties properties = new Properties();
  public Object intercept(Invocation invocation) throws Throwable {
    // implement pre processing if need
    Object returnObject = invocation.proceed();
    // implement post processing if need
    return returnObject;
  }
  public void setProperties(Properties properties) {
    this.properties = properties;
  }
}
```
```xml
<!-- mybatis-config.xml -->
<plugins>
  <plugin interceptor="org.mybatis.example.ExamplePlugin">
    <property name="someProperty" value="100"/>
  </plugin>
</plugins>
```

上面的插件将会拦截在 Executor 实例中所有的 “update” 方法调用， 这里的 Executor 是负责执行低层映射语句的内部对象。

提示 覆盖配置类

除了用插件来修改 MyBatis 核心行为之外，还可以通过完全覆盖配置类来达到目的。只需继承后覆盖其中的每个方法，再把它传递到 SqlSessionFactoryBuilder.build(myConfig) 方法即可。再次重申，这可能会严重影响 MyBatis 的行为，务请慎之又慎。

环境配置（environments）
MyBatis 可以配置成适应多种环境，这种机制有助于将 SQL 映射应用于多种数据库之中， 现实情况下有多种理由需要这么做。例如，开发、测试和生产环境需要有不同的配置；或者想在具有相同 Schema 的多个生产数据库中 使用相同的 SQL 映射。有许多类似的使用场景。

不过要记住：尽管可以配置多个环境，但每个 SqlSessionFactory 实例只能选择一种环境。

所以，如果你想连接两个数据库，就需要创建两个 SqlSessionFactory 实例，每个数据库对应一个。而如果是三个数据库，就需要三个实例，依此类推，记起来很简单：

每个数据库对应一个 SqlSessionFactory 实例
为了指定创建哪种环境，只要将它作为可选的参数传递给 SqlSessionFactoryBuilder 即可。可以接受环境配置的两个方法签名是：

```java
SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader, environment);
SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader, environment, properties);
如果忽略了环境参数，那么默认环境将会被加载，如下所示：

SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader, properties);
```

环境元素定义了如何配置环境。
```xml
<environments default="development">
  <environment id="development">
    <transactionManager type="JDBC">
      <property name="..." value="..."/>
    </transactionManager>
    <dataSource type="POOLED">
      <property name="driver" value="${driver}"/>
      <property name="url" value="${url}"/>
      <property name="username" value="${username}"/>
      <property name="password" value="${password}"/>
    </dataSource>
  </environment>
</environments>
```

注意这里的关键点:

默认使用的环境 ID（比如：default="development"）。
每个 environment 元素定义的环境 ID（比如：id="development"）。
事务管理器的配置（比如：type="JDBC"）。
数据源的配置（比如：type="POOLED"）。
默认的环境和环境 ID 是自解释的，因此一目了然。 你可以对环境随意命名，但一定要保证默认的环境 ID 要匹配其中一个环境 ID。

<a id="markdown-128-事务管理器transactionmanager" name="128-事务管理器transactionmanager"></a>
### 1.2.8. 事务管理器（transactionManager）
<a href="#menu" style="float:right">目录</a>

在 MyBatis 中有两种类型的事务管理器（也就是 type=”[JDBC|MANAGED]”）：

JDBC – 这个配置就是直接使用了 JDBC 的提交和回滚设置，它依赖于从数据源得到的连接来管理事务作用域。
MANAGED – 这个配置几乎没做什么。它从来不提交或回滚一个连接，而是让容器来管理事务的整个生命周期（比如 JEE 应用服务器的上下文）。 默认情况下它会关闭连接，然而一些容器并不希望这样，因此需要将 closeConnection 属性设置为 false 来阻止它默认的关闭行为。例如:

```xml
<transactionManager type="MANAGED">
  <property name="closeConnection" value="false"/>
</transactionManager>
```

提示如果你正在使用 Spring + MyBatis，则没有必要配置事务管理器， 因为 Spring 模块会使用自带的管理器来覆盖前面的配置。

这两种事务管理器类型都不需要设置任何属性。它们其实是类型别名，换句话说，你可以使用 TransactionFactory 接口的实现类的完全限定名或类型别名代替它们。

```java
public interface TransactionFactory {
  default void setProperties(Properties props) { // Since 3.5.2, change to default method
    // NOP
  }
  Transaction newTransaction(Connection conn);
  Transaction newTransaction(DataSource dataSource, TransactionIsolationLevel level, boolean autoCommit);
}
```
任何在 XML 中配置的属性在实例化之后将会被传递给 setProperties() 方法。你也需要创建一个 Transaction 接口的实现类，这个接口也很简单：


```java
public interface Transaction {
  Connection getConnection() throws SQLException;
  void commit() throws SQLException;
  void rollback() throws SQLException;
  void close() throws SQLException;
  Integer getTimeout() throws SQLException;
}
```

使用这两个接口，你可以完全自定义 MyBatis 对事务的处理。

<a id="markdown-129-数据源datasource" name="129-数据源datasource"></a>
### 1.2.9. 数据源（dataSource）
<a href="#menu" style="float:right">目录</a>

dataSource 元素使用标准的 JDBC 数据源接口来配置 JDBC 连接对象的资源。

许多 MyBatis 的应用程序会按示例中的例子来配置数据源。虽然这是可选的，但为了使用延迟加载，数据源是必须配置的。
有三种内建的数据源类型（也就是 type=”[UNPOOLED|POOLED|JNDI]”）：

**UNPOOLED**– 这个数据源的实现只是每次被请求时打开和关闭连接。虽然有点慢，但对于在数据库连接可用性方面没有太高要求的简单应用程序来说，是一个很好的选择。 不同的数据库在性能方面的表现也是不一样的，对于某些数据库来说，使用连接池并不重要，这个配置就很适合这种情形。UNPOOLED 类型的数据源具有以下属性。：
* driver – 这是 JDBC 驱动的 Java 类的完全限定名（并不是 JDBC 驱动中可能包含的数据源类）。
* url – 这是数据库的 JDBC URL 地址。
* username – 登录数据库的用户名。
* password – 登录数据库的密码。
* defaultTransactionIsolationLevel – 默认的连接事务隔离级别。
* defaultNetworkTimeout – The default network timeout value in milliseconds to wait for the database operation to complete. See the API documentation of java.sql.Connection#setNetworkTimeout() for details.
作为可选项，你也可以传递属性给数据库驱动。只需在属性名加上“driver.”前缀即可，例如：

* driver.encoding=UTF8
这将通过 DriverManager.getConnection(url,driverProperties) 方法传递值为 UTF8 的 encoding 属性给数据库驱动。

**POOLED**– 这种数据源的实现利用“池”的概念将 JDBC 连接对象组织起来，避免了创建新的连接实例时所必需的初始化和认证时间。 这是一种使得并发 Web 应用快速响应请求的流行处理方式。

除了上述提到 UNPOOLED 下的属性外，还有更多属性用来配置 POOLED 的数据源：

* poolMaximumActiveConnections – 在任意时间可以存在的活动（也就是正在使用）连接数量，默认值：10
* poolMaximumIdleConnections – 任意时间可能存在的空闲连接数。
* poolMaximumCheckoutTime – 在被强制返回之前，池中连接被检出（checked out）时间，默认值：20000 毫秒（即 20 秒）
* poolTimeToWait – 这是一个底层设置，如果获取连接花费了相当长的时间，连接池会打印状态日志并重新尝试获取一个连接（避免在误配置的情况下一直安静的失败），默认值：20000 毫秒（即 20 秒）。
* poolMaximumLocalBadConnectionTolerance – 这是一个关于坏连接容忍度的底层设置， 作用于每一个尝试从缓存池获取连接的线程。 如果这个线程获取到的是一个坏的连接，那么这个数据源允许这个线程尝试重新获取一个新的连接，但是这个重新尝试的次数不应该超过 poolMaximumIdleConnections 与 poolMaximumLocalBadConnectionTolerance 之和。 默认值：3 （新增于 3.4.5）
* poolPingQuery – 发送到数据库的侦测查询，用来检验连接是否正常工作并准备接受请求。默认是“NO PING QUERY SET”，这会导致多数数据库驱动失败时带有一个恰当的错误消息。
* poolPingEnabled – 是否启用侦测查询。若开启，需要设置 poolPingQuery 属性为一个可执行的 SQL 语句（最好是一个速度非常快的 SQL 语句），默认值：false。
* poolPingConnectionsNotUsedFor – 配置 poolPingQuery 的频率。可以被设置为和数据库连接超时时间一样，来避免不必要的侦测，默认值：0（即所有连接每一时刻都被侦测 — 当然仅当 poolPingEnabled 为 true 时适用）。

**JNDI** – 这个数据源的实现是为了能在如 EJB 或应用服务器这类容器中使用，容器可以集中或在外部配置数据源，然后放置一个 JNDI 上下文的引用。这种数据源配置只需要两个属性：
* initial_context – 这个属性用来在 InitialContext 中寻找上下文（即，initialContext.lookup(initial_context)）。这是个可选属性，如果忽略，那么将会直接从 InitialContext 中寻找 data_source 属性。
* data_source – 这是引用数据源实例位置的上下文的路径。提供了 initial_context 配置时会在其返回的上下文中进行查找，没有提供时则直接在 InitialContext 中查找。
和其他数据源配置类似，可以通过添加前缀“env.”直接把属性传递给初始上下文。比如：
* env.encoding=UTF8
这就会在初始上下文（InitialContext）实例化时往它的构造方法传递值为 UTF8 的 encoding 属性。

你可以通过实现接口 org.apache.ibatis.datasource.DataSourceFactory 来使用第三方数据源：

```java
public interface DataSourceFactory {
  void setProperties(Properties props);
  DataSource getDataSource();
}
```

org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory 可被用作父类来构建新的数据源适配器，比如下面这段插入 C3P0 数据源所必需的代码：

```java
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0DataSourceFactory extends UnpooledDataSourceFactory {

  public C3P0DataSourceFactory() {
    this.dataSource = new ComboPooledDataSource();
  }
}
```
为了令其工作，记得为每个希望 MyBatis 调用的 setter 方法在配置文件中增加对应的属性。 下面是一个可以连接至 PostgreSQL 数据库的例子：

```xml
<dataSource type="org.myproject.C3P0DataSourceFactory">
  <property name="driver" value="org.postgresql.Driver"/>
  <property name="url" value="jdbc:postgresql:mydb"/>
  <property name="username" value="postgres"/>
  <property name="password" value="root"/>
</dataSource>
```

<a id="markdown-1210-数据库厂商标识databaseidprovider" name="1210-数据库厂商标识databaseidprovider"></a>
### 1.2.10. 数据库厂商标识（databaseIdProvider）
<a href="#menu" style="float:right">目录</a>

MyBatis 可以根据不同的数据库厂商执行不同的语句，这种多厂商的支持是基于映射语句中的 databaseId 属性。 MyBatis 会加载不带 databaseId 属性和带有匹配当前数据库 databaseId 属性的所有语句。 如果同时找到带有 databaseId 和不带 databaseId 的相同语句，则后者会被舍弃。 为支持多厂商特性只要像下面这样在 mybatis-config.xml 文件中加入 databaseIdProvider 即可：

```xml
<databaseIdProvider type="DB_VENDOR" />
```

DB_VENDOR 对应的 databaseIdProvider 实现会将 databaseId 设置为 DatabaseMetaData#getDatabaseProductName() 返回的字符串。 由于通常情况下这些字符串都非常长而且相同产品的不同版本会返回不同的值，所以你可能想通过设置属性别名来使其变短，如下：
```xml
<databaseIdProvider type="DB_VENDOR">
  <property name="SQL Server" value="sqlserver"/>
  <property name="DB2" value="db2"/>
  <property name="Oracle" value="oracle" />
</databaseIdProvider>
```

在提供了属性别名时，DB_VENDOR 的 databaseIdProvider 实现会将 databaseId 设置为第一个数据库产品名与属性中的名称相匹配的值，如果没有匹配的属性将会设置为 “null”。 在这个例子中，如果 getDatabaseProductName() 返回“Oracle (DataDirect)”，databaseId 将被设置为“oracle”。

你可以通过实现接口 org.apache.ibatis.mapping.DatabaseIdProvider 并在 mybatis-config.xml 中注册来构建自己的 DatabaseIdProvider：

```java
public interface DatabaseIdProvider {
  default void setProperties(Properties p) { // Since 3.5.2, change to default method
    // NOP
  }
  String getDatabaseId(DataSource dataSource) throws SQLException;
}
```

<a id="markdown-1211-映射器mappers" name="1211-映射器mappers"></a>
### 1.2.11. 映射器（mappers）
<a href="#menu" style="float:right">目录</a>

既然 MyBatis 的行为已经由上述元素配置完了，我们现在就要定义 SQL 映射语句了。 但是首先我们需要告诉 MyBatis 到哪里去找到这些语句。 Java 在自动查找这方面没有提供一个很好的方法，所以最佳的方式是告诉 MyBatis 到哪里去找映射文件。 你可以使用相对于类路径的资源引用， 或完全限定资源定位符（包括 file:/// 的 URL），或类名和包名等。例如：

```xml
<!-- 使用相对于类路径的资源引用 -->
<mappers>
  <mapper resource="org/mybatis/builder/AuthorMapper.xml"/>
  <mapper resource="org/mybatis/builder/BlogMapper.xml"/>
  <mapper resource="org/mybatis/builder/PostMapper.xml"/>
</mappers>
<!-- 使用完全限定资源定位符（URL） -->
<mappers>
  <mapper url="file:///var/mappers/AuthorMapper.xml"/>
  <mapper url="file:///var/mappers/BlogMapper.xml"/>
  <mapper url="file:///var/mappers/PostMapper.xml"/>
</mappers>
<!-- 使用映射器接口实现类的完全限定类名 -->
<mappers>
  <mapper class="org.mybatis.builder.AuthorMapper"/>
  <mapper class="org.mybatis.builder.BlogMapper"/>
  <mapper class="org.mybatis.builder.PostMapper"/>
</mappers>
<!-- 将包内的映射器接口实现全部注册为映射器 -->
<mappers>
  <package name="org.mybatis.builder"/>
</mappers>
```

<a id="markdown-13-xml-映射文件" name="13-xml-映射文件"></a>
## 1.3. XML 映射文件
<a href="#menu" style="float:right">目录</a>

MyBatis 的真正强大在于它的映射语句，这是它的魔力所在。由于它的异常强大，映射器的 XML 文件就显得相对简单。如果拿它跟具有相同功能的 JDBC 代码进行对比，你会立即发现省掉了将近 95% 的代码。MyBatis 为聚焦于 SQL 而构建，以尽可能地为你减少麻烦。

* SQL 映射文件只有很少的几个顶级元素（按照应被定义的顺序列出）：
    * cache – 对给定命名空间的缓存配置。
    * cache-ref – 对其他命名空间缓存配置的引用。
    * resultMap – 是最复杂也是最强大的元素，用来描述如何从数据库结果集中来加载对象。
    * parameterMap – 已被废弃！老式风格的参数映射。更好的办法是使用内联参数，此元素可能在将来被移除。文档中不会介绍此元素。
    * sql – 可被其他语句引用的可重用语句块。
    * insert – 映射插入语句
    * update – 映射更新语句
    * delete – 映射删除语句
    * select – 映射查询语句
下一部分将从语句本身开始来描述每个元素的细节。

<a id="markdown-131-select" name="131-select"></a>
### 1.3.1. select
<a href="#menu" style="float:right">目录</a>

查询语句是 MyBatis 中最常用的元素之一，光能把数据存到数据库中价值并不大，只有还能重新取出来才有用，多数应用也都是查询比修改要频繁。对每个插入、更新或删除操作，通常间隔多个查询操作。这是 MyBatis 的基本原则之一，也是将焦点和努力放在查询和结果映射的原因。简单查询的 select 元素是非常简单的。比如：

```xml
<select id="selectPerson" parameterType="int" resultType="hashmap">
  SELECT * FROM PERSON WHERE ID = #{id}
</select>
```

这个语句被称作 selectPerson，接受一个 int（或 Integer）类型的参数，并返回一个 HashMap 类型的对象，其中的键是列名，值便是结果行中的对应值。

注意参数符号：
```
#{id}
```
这就告诉 MyBatis 创建一个预处理语句（PreparedStatement）参数，在 JDBC 中，这样的一个参数在 SQL 中会由一个“?”来标识，并被传递到一个新的预处理语句中，就像这样：

// 近似的 JDBC 代码，非 MyBatis 代码...
String selectPerson = "SELECT * FROM PERSON WHERE ID=?";
PreparedStatement ps = conn.prepareStatement(selectPerson);
ps.setInt(1,id);
当然，使用 JDBC 意味着需要更多的代码来提取结果并将它们映射到对象实例中，而这就是 MyBatis 节省你时间的地方。参数和结果映射还有更深入的细节。这些细节会分别在后面单独的小节中呈现。

select 元素允许你配置很多属性来配置每条语句的作用细节。
```xml
<select
  id="selectPerson"
  parameterType="int"
  parameterMap="deprecated"
  resultType="hashmap"
  resultMap="personResultMap"
  flushCache="false"
  useCache="true"
  timeout="10"
  fetchSize="256"
  statementType="PREPARED"
  resultSetType="FORWARD_ONLY">
```

Select 元素的属性
|属性|	描述
|---|---|
|id|	在命名空间中唯一的标识符，可以被用来引用这条语句。
|parameterType|	将会传入这条语句的参数类的完全限定名或别名。这个属性是可选的，因为 MyBatis 可以通过类型处理器（TypeHandler） 推断出具体传入语句的参数，默认值为未设置（unset）。
|parameterMap|	这是引用外部 parameterMap 的已经被废弃的方法。请使用内联参数映射和 parameterType 属性。
|resultType|	从这条语句中返回的期望类型的类的完全限定名或别名。 注意如果返回的是集合，那应该设置为集合包含的类型，而不是集合本身。可以使用 resultType 或 resultMap，但不能同时使用。
|resultMap|	外部 resultMap 的命名引用。结果集的映射是 MyBatis 最强大的特性，如果你对其理解透彻，许多复杂映射的情形都能迎刃而解。可以使用 resultMap 或 resultType，但不能同时使用。
|flushCache|	将其设置为 true 后，只要语句被调用，都会导致本地缓存和二级缓存被清空，默认值：false。
|useCache|	将其设置为 true 后，将会导致本条语句的结果被二级缓存缓存起来，默认值：对 select 元素为 true。
|timeout|	这个设置是在抛出异常之前，驱动程序等待数据库返回请求结果的秒数。默认值为未设置（unset）（依赖驱动）。
|fetchSize|	这是一个给驱动的提示，尝试让驱动程序每次批量返回的结果行数和这个设置值相等。 默认值为未设置（unset）（依赖驱动）。
|statementType|	STATEMENT，PREPARED 或 CALLABLE 中的一个。这会让 MyBatis 分别使用 Statement，PreparedStatement 或 CallableStatement，默认值：PREPARED。
|resultSetType|	FORWARD_ONLY，SCROLL_SENSITIVE, SCROLL_INSENSITIVE 或 DEFAULT（等价于 unset） 中的一个，默认值为 unset （依赖驱动）。
|databaseId	|如果配置了数据库厂商标识（databaseIdProvider），MyBatis 会加载所有的不带 databaseId 或匹配当前 databaseId 的语句；如果带或者不带的语句都有，则不带的会被忽略。
|resultOrdered|	这个设置仅针对嵌套结果 select 语句适用：如果为 true，就是假设包含了嵌套结果集或是分组，这样的话当返回一个主结果行的时候，就不会发生有对前面结果集的引用的情况。 这就使得在获取嵌套的结果集的时候不至于导致内存不够用。默认值：false。
|resultSets|	这个设置仅对多结果集的情况适用。它将列出语句执行后返回的结果集并给每个结果集一个名称，名称是逗号分隔的。

insert, update 和 delete数据变更语句 insert，update 和 delete 的实现非常接近：

```xml
<insert
  id="insertAuthor"
  parameterType="domain.blog.Author"
  flushCache="true"
  statementType="PREPARED"
  keyProperty=""
  keyColumn=""
  useGeneratedKeys=""
  timeout="20">

<update
  id="updateAuthor"
  parameterType="domain.blog.Author"
  flushCache="true"
  statementType="PREPARED"
  timeout="20">

<delete
  id="deleteAuthor"
  parameterType="domain.blog.Author"
  flushCache="true"
  statementType="PREPARED"
  timeout="20">
```

<a id="markdown-132-insert-update-delete-元素的属性" name="132-insert-update-delete-元素的属性"></a>
### 1.3.2. Insert, Update, Delete 元素的属性
<a href="#menu" style="float:right">目录</a>

|属性	|描述
|---|---|
|id	|命名空间中的唯一标识符，可被用来代表这条语句。
|parameterType|	将要传入语句的参数的完全限定类名或别名。这个属性是可选的，因为 MyBatis 可以通过类型处理器推断出具体传入语句的参数，默认值为未设置（unset）。
|parameterMap|	这是引用外部 parameterMap 的已经被废弃的方法。请使用内联参数映射和 parameterType 属性。
|flushCache|	将其设置为 true 后，只要语句被调用，都会导致本地缓存和二级缓存被清空，默认值：true（对于 insert、update 和 delete 语句）。
|timeout|	这个设置是在抛出异常之前，驱动程序等待数据库返回请求结果的秒数。默认值为未设置（unset）（依赖驱动）。
|statementType|	STATEMENT，PREPARED 或 CALLABLE 的一个。这会让 MyBatis 分别使用 Statement，PreparedStatement 或 CallableStatement，默认值：PREPARED。
useGeneratedKeys	（仅对 insert 和 update 有用）这会令 MyBatis 使用 JDBC 的 getGeneratedKeys 方法来取出由数据库内部生成的主键（比如：像 MySQL 和 SQL Server 这样的关系数据库管理系统的自动递增字段），默认值：false。
|keyProperty|	（仅对 insert 和 update 有用）唯一标记一个属性，MyBatis 会通过 getGeneratedKeys 的返回值或者通过 insert 语句的 selectKey 子元素设置它的键值，默认值：未设置（unset）。如果希望得到多个生成的列，也可以是逗号分隔的属性名称列表。
|keyColumn|	（仅对 insert 和 update 有用）通过生成的键值设置表中的列名，这个设置仅在某些数据库（像 PostgreSQL）是必须的，当主键列不是表中的第一列的时候需要设置。如果希望使用多个生成的列，也可以设置为逗号分隔的属性名称列表。
|databaseId|	如果配置了数据库厂商标识（databaseIdProvider），MyBatis 会加载所有的不带 databaseId 或匹配当前 databaseId 的语句；如果带或者不带的语句都有，则不带的会被忽略。
下面就是 insert，update 和 delete 语句的示例：

```xml
<insert id="insertAuthor">
  insert into Author (id,username,password,email,bio)
  values (#{id},#{username},#{password},#{email},#{bio})
</insert>

<update id="updateAuthor">
  update Author set
    username = #{username},
    password = #{password},
    email = #{email},
    bio = #{bio}
  where id = #{id}
</update>

<delete id="deleteAuthor">
  delete from Author where id = #{id}
</delete>
```

如前所述，插入语句的配置规则更加丰富，在插入语句里面有一些额外的属性和子元素用来处理主键的生成，而且有多种生成方式。

首先，如果你的数据库支持自动生成主键的字段（比如 MySQL 和 SQL Server），那么你可以设置 useGeneratedKeys=”true”，然后再把 keyProperty 设置到目标属性上就 OK 了。例如，如果上面的 Author 表已经对 id 使用了自动生成的列类型，那么语句可以修改为：
```xml
<insert id="insertAuthor" useGeneratedKeys="true"
    keyProperty="id">
  insert into Author (username,password,email,bio)
  values (#{username},#{password},#{email},#{bio})
</insert>
```
如果你的数据库还支持多行插入, 你也可以传入一个 Author 数组或集合，并返回自动生成的主键。

```xml
<insert id="insertAuthor" useGeneratedKeys="true"
    keyProperty="id">
  insert into Author (username, password, email, bio) values
  <foreach item="item" collection="list" separator=",">
    (#{item.username}, #{item.password}, #{item.email}, #{item.bio})
  </foreach>
</insert>
```

对于不支持自动生成类型的数据库或可能不支持自动生成主键的 JDBC 驱动，MyBatis 有另外一种方法来生成主键。

这里有一个简单（甚至很傻）的示例，它可以生成一个随机 ID（你最好不要这么做，但这里展示了 MyBatis 处理问题的灵活性及其所关心的广度）：
```xml
<insert id="insertAuthor">
  <selectKey keyProperty="id" resultType="int" order="BEFORE">
    select CAST(RANDOM()*1000000 as INTEGER) a from SYSIBM.SYSDUMMY1
  </selectKey>
  insert into Author
    (id, username, password, email,bio, favourite_section)
  values
    (#{id}, #{username}, #{password}, #{email}, #{bio}, #{favouriteSection,jdbcType=VARCHAR})
</insert>
```

在上面的示例中，selectKey 元素中的语句将会首先运行，Author 的 id 会被设置，然后插入语句会被调用。这可以提供给你一个与数据库中自动生成主键类似的行为，同时保持了 Java 代码的简洁。

selectKey 元素描述如下：
```xml
<selectKey
  keyProperty="id"
  resultType="int"
  order="BEFORE"
  statementType="PREPARED">
```

selectKey 元素的属性

|属性|	描述
|---|---|
|keyProperty|	selectKey 语句结果应该被设置的目标属性。如果希望得到多个生成的列，也可以是逗号分隔的属性名称列表。
|keyColumn|	匹配属性的返回结果集中的列名称。如果希望得到多个生成的列，也可以是逗号分隔的属性名称列表。
|resultType|	结果的类型。MyBatis 通常可以推断出来，但是为了更加精确，写上也不会有什么问题。MyBatis 允许将任何简单类型用作主键的类型，包括字符串。如果希望作用于多个生成的列，则可以使用一个包含期望属性的 Object 或一个 Map。
|order|	这可以被设置为 BEFORE 或 AFTER。如果设置为 BEFORE，那么它会首先生成主键，设置 keyProperty 然后执行插入语句。如果设置为 AFTER，那么先执行插入语句，然后是 selectKey 中的语句 - 这和 Oracle 数据库的行为相似，在插入语句内部可能有嵌入索引调用。
|statementType|	与前面相同，MyBatis 支持 STATEMENT，PREPARED 和 CALLABLE 语句的映射类型，分别代表 PreparedStatement 和 CallableStatement 类型。

<a id="markdown-133-sql" name="133-sql"></a>
### 1.3.3. sql
<a href="#menu" style="float:right">目录</a>

这个元素可以被用来定义可重用的 SQL 代码段，这些 SQL 代码可以被包含在其他语句中。它可以（在加载的时候）被静态地设置参数。 在不同的包含语句中可以设置不同的值到参数占位符上。比如：

```xml
<sql id="userColumns"> ${alias}.id,${alias}.username,${alias}.password </sql>
```
这个 SQL 片段可以被包含在其他语句中，例如：

```xml
<select id="selectUsers" resultType="map">
  select
    <include refid="userColumns"><property name="alias" value="t1"/></include>,
    <include refid="userColumns"><property name="alias" value="t2"/></include>
  from some_table t1
    cross join some_table t2
</select>
```
属性值也可以被用在 include 元素的 refid 属性里或 include 元素的内部语句中，例如：
```xml
<sql id="sometable">
  ${prefix}Table
</sql>

<sql id="someinclude">
  from
    <include refid="${include_target}"/>
</sql>

<select id="select" resultType="map">
  select
    field1, field2, field3
  <include refid="someinclude">
    <property name="prefix" value="Some"/>
    <property name="include_target" value="sometable"/>
  </include>
</select>
```
<a id="markdown-134-参数" name="134-参数"></a>
### 1.3.4. 参数
<a href="#menu" style="float:right">目录</a>

你之前见到的所有语句中，使用的都是简单参数。实际上参数是 MyBatis 非常强大的元素。对于简单的使用场景，大约 90% 的情况下你都不需要使用复杂的参数，比如：
```xml
<select id="selectUsers" resultType="User">
  select id, username, password
  from users
  where id = #{id}
</select>
```
上面的这个示例说明了一个非常简单的命名参数映射。参数类型被设置为 int，这样这个参数就可以被设置成任何内容。原始类型或简单数据类型（比如 Integer 和 String）因为没有相关属性，它会完全用参数值来替代。 然而，如果传入一个复杂的对象，行为就会有一点不同了。比如：
```xml
<insert id="insertUser" parameterType="User">
  insert into users (id, username, password)
  values (#{id}, #{username}, #{password})
</insert>
```
如果 User 类型的参数对象传递到了语句中，id、username 和 password 属性将会被查找，然后将它们的值传入预处理语句的参数中。

对向语句中传递参数来说，这真是既简单又有效。不过参数映射的功能远不止于此。

首先，像 MyBatis 的其他部分一样，参数也可以指定一个特殊的数据类型。
```
#{property,javaType=int,jdbcType=NUMERIC}
```
像 MyBatis 的其它部分一样，javaType 几乎总是可以根据参数对象的类型确定下来，除非该对象是一个 HashMap。这个时候，你需要显式指定 javaType 来确保正确的类型处理器（TypeHandler）被使用。

提示 JDBC 要求，如果一个列允许 null 值，并且会传递值 null 的参数，就必须要指定 JDBC Type。阅读 PreparedStatement.setNull()的 JavaDoc 文档来获取更多信息。

要更进一步地自定义类型处理方式，你也可以指定一个特殊的类型处理器类（或别名），比如：
```
#{age,javaType=int,jdbcType=NUMERIC,typeHandler=MyTypeHandler}
```
尽管看起来配置变得越来越繁琐，但实际上，很少需要如此繁琐的配置。

对于数值类型，还有一个小数保留位数的设置，来指定小数点后保留的位数。

```
#{height,javaType=double,jdbcType=NUMERIC,numericScale=2}
```
最后，mode 属性允许你指定 IN，OUT 或 INOUT 参数。如果参数的 mode 为 OUT 或 INOUT，就像你在指定输出参数时所期望的行为那样，参数对象的属性实际值将会被改变。 如果 mode 为 OUT（或 INOUT），而且 jdbcType 为 CURSOR（也就是 Oracle 的 REFCURSOR），你必须指定一个 resultMap 引用来将结果集 ResultMap 映射到参数的类型上。要注意这里的 javaType 属性是可选的，如果留空并且 jdbcType 是 CURSOR，它会被自动地被设为 ResultMap。
```
#{department, mode=OUT, jdbcType=CURSOR, javaType=ResultSet, resultMap=departmentResultMap}
```
MyBatis 也支持很多高级的数据类型，比如结构体（structs），但是当使用 out 参数时，你必须显式设置类型的名称。比如（再次提示，在实际中要像这样不能换行）：
```
#{middleInitial, mode=OUT, jdbcType=STRUCT, jdbcTypeName=MY_TYPE, resultMap=departmentResultMap}
```
尽管所有这些选项很强大，但大多时候你只须简单地指定属性名，其他的事情 MyBatis 会自己去推断，顶多要为可能为空的列指定 jdbcType。
```
#{firstName}
#{middleInitial,jdbcType=VARCHAR}
#{lastName}
```

<a id="markdown-135-字符串替换" name="135-字符串替换"></a>
### 1.3.5. 字符串替换
<a href="#menu" style="float:right">目录</a>

默认情况下,使用 #{} 格式的语法会导致 MyBatis 创建 PreparedStatement 参数占位符并安全地设置参数（就像使用 ? 一样）。 这样做更安全，更迅速，通常也是首选做法，不过有时你就是想直接在 SQL 语句中插入一个不转义的字符串。 比如，像 ORDER BY，你可以这样来使用：

ORDER BY ${columnName}
这里 MyBatis 不会修改或转义字符串。

当 SQL 语句中的元数据（如表名或列名）是动态生成的时候，字符串替换将会非常有用。 举个例子，如果你想通过任何一列从表中 select 数据时，不需要像下面这样写：
```java
@Select("select * from user where id = #{id}")
User findById(@Param("id") long id);

@Select("select * from user where name = #{name}")
User findByName(@Param("name") String name);

@Select("select * from user where email = #{email}")
User findByEmail(@Param("email") String email);

// and more "findByXxx" method
可以只写这样一个方法：
@Select("select * from user where ${column} = #{value}")
User findByColumn(@Param("column") String column, @Param("value") String value);
其中 ${column} 会被直接替换，而 #{value} 会被使用 ? 预处理。 因此你就可以像下面这样来达到上述功能：
User userOfId1 = userMapper.findByColumn("id", 1L);
User userOfNameKid = userMapper.findByColumn("name", "kid");
User userOfEmail = userMapper.findByColumn("email", "noone@nowhere.com");'
```
这个想法也同样适用于用来替换表名的情况。

提示 用这种方式接受用户的输入，并将其用于语句中的参数是不安全的，会导致潜在的 SQL 注入攻击，因此要么不允许用户输入这些字段，要么自行转义并检验。

<a id="markdown-136-结果映射" name="136-结果映射"></a>
### 1.3.6. 结果映射
<a href="#menu" style="float:right">目录</a>

resultMap 元素是 MyBatis 中最重要最强大的元素。它可以让你从 90% 的 JDBC ResultSets 数据提取代码中解放出来，并在一些情形下允许你进行一些 JDBC 不支持的操作。实际上，在为一些比如连接的复杂语句编写映射代码的时候，一份 resultMap 能够代替实现同等功能的长达数千行的代码。ResultMap 的设计思想是，对于简单的语句根本不需要配置显式的结果映射，而对于复杂一点的语句只需要描述它们的关系就行了。

你已经见过简单映射语句的示例了，但并没有显式指定 resultMap。比如：
```xml
<select id="selectUsers" resultType="map">
  select id, username, hashedPassword
  from some_table
  where id = #{id}
</select>
```
上述语句只是简单地将所有的列映射到 HashMap 的键上，这由 resultType 属性指定。虽然在大部分情况下都够用，但是 HashMap 不是一个很好的领域模型。你的程序更可能会使用 JavaBean 或 POJO（Plain Old Java Objects，普通老式 Java 对象）作为领域模型。MyBatis 对两者都提供了支持。看看下面这个 JavaBean：
```java
package com.someapp.model;
public class User {
  private int id;
  private String username;
  private String hashedPassword;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getHashedPassword() {
    return hashedPassword;
  }
  public void setHashedPassword(String hashedPassword) {
    this.hashedPassword = hashedPassword;
  }
}
```

基于 JavaBean 的规范，上面这个类有 3 个属性：id，username 和 hashedPassword。这些属性会对应到 select 语句中的列名。

这样的一个 JavaBean 可以被映射到 ResultSet，就像映射到 HashMap 一样简单。
```xml
<select id="selectUsers" resultType="com.someapp.model.User">
  select id, username, hashedPassword
  from some_table
  where id = #{id}
</select>
```
类型别名是你的好帮手。使用它们，你就可以不用输入类的完全限定名称了。比如：
```xml
<!-- mybatis-config.xml 中 -->
<typeAlias type="com.someapp.model.User" alias="User"/>

<!-- SQL 映射 XML 中 -->
<select id="selectUsers" resultType="User">
  select id, username, hashedPassword
  from some_table
  where id = #{id}
</select>
```
这些情况下，MyBatis 会在幕后自动创建一个 ResultMap，再基于属性名来映射列到 JavaBean 的属性上。如果列名和属性名没有精确匹配，可以在 SELECT 语句中对列使用别名（这是一个基本的 SQL 特性）来匹配标签。比如：
```xml
<select id="selectUsers" resultType="User">
  select
    user_id             as "id",
    user_name           as "userName",
    hashed_password     as "hashedPassword"
  from some_table
  where id = #{id}
</select>
```
ResultMap 最优秀的地方在于，虽然你已经对它相当了解了，但是根本就不需要显式地用到他们。 上面这些简单的示例根本不需要下面这些繁琐的配置。 但出于示范的原因，让我们来看看最后一个示例中，如果使用外部的 resultMap 会怎样，这也是解决列名不匹配的另外一种方式。
```xml
<resultMap id="userResultMap" type="User">
  <id property="id" column="user_id" />
  <result property="username" column="user_name"/>
  <result property="password" column="hashed_password"/>
</resultMap>
```
而在引用它的语句中使用 resultMap 属性就行了（注意我们去掉了 resultType 属性）。比如:
```xml
<select id="selectUsers" resultMap="userResultMap">
  select user_id, user_name, hashed_password
  from some_table
  where id = #{id}
</select>
```

如果世界总是这么简单就好了。

<a id="markdown-137-高级结果映射" name="137-高级结果映射"></a>
### 1.3.7. 高级结果映射
<a href="#menu" style="float:right">目录</a>

MyBatis 创建时的一个思想是：数据库不可能永远是你所想或所需的那个样子。 我们希望每个数据库都具备良好的第三范式或 BCNF 范式，可惜它们不总都是这样。 如果能有一种完美的数据库映射模式，所有应用程序都可以使用它，那就太好了，但可惜也没有。 而 ResultMap 就是 MyBatis 对这个问题的答案。

比如，我们如何映射下面这个语句？

```xml
<!-- 非常复杂的语句 -->
<select id="selectBlogDetails" resultMap="detailedBlogResultMap">
  select
       B.id as blog_id,
       B.title as blog_title,
       B.author_id as blog_author_id,
       A.id as author_id,
       A.username as author_username,
       A.password as author_password,
       A.email as author_email,
       A.bio as author_bio,
       A.favourite_section as author_favourite_section,
       P.id as post_id,
       P.blog_id as post_blog_id,
       P.author_id as post_author_id,
       P.created_on as post_created_on,
       P.section as post_section,
       P.subject as post_subject,
       P.draft as draft,
       P.body as post_body,
       C.id as comment_id,
       C.post_id as comment_post_id,
       C.name as comment_name,
       C.comment as comment_text,
       T.id as tag_id,
       T.name as tag_name
  from Blog B
       left outer join Author A on B.author_id = A.id
       left outer join Post P on B.id = P.blog_id
       left outer join Comment C on P.id = C.post_id
       left outer join Post_Tag PT on PT.post_id = P.id
       left outer join Tag T on PT.tag_id = T.id
  where B.id = #{id}
</select>
```

你可能想把它映射到一个智能的对象模型，这个对象表示了一篇博客，它由某位作者所写，有很多的博文，每篇博文有零或多条的评论和标签。 我们来看看下面这个完整的例子，它是一个非常复杂的结果映射（假设作者，博客，博文，评论和标签都是类型别名）。 不用紧张，我们会一步一步来说明。虽然它看起来令人望而生畏，但其实非常简单。

```xml
<!-- 非常复杂的结果映射 -->
<resultMap id="detailedBlogResultMap" type="Blog">
  <constructor>
    <idArg column="blog_id" javaType="int"/>
  </constructor>
  <result property="title" column="blog_title"/>
  <association property="author" javaType="Author">
    <id property="id" column="author_id"/>
    <result property="username" column="author_username"/>
    <result property="password" column="author_password"/>
    <result property="email" column="author_email"/>
    <result property="bio" column="author_bio"/>
    <result property="favouriteSection" column="author_favourite_section"/>
  </association>
  <collection property="posts" ofType="Post">
    <id property="id" column="post_id"/>
    <result property="subject" column="post_subject"/>
    <association property="author" javaType="Author"/>
    <collection property="comments" ofType="Comment">
      <id property="id" column="comment_id"/>
    </collection>
    <collection property="tags" ofType="Tag" >
      <id property="id" column="tag_id"/>
    </collection>
    <discriminator javaType="int" column="draft">
      <case value="1" resultType="DraftPost"/>
    </discriminator>
  </collection>
</resultMap>
```

resultMap 元素有很多子元素和一个值得深入探讨的结构。 下面是resultMap 元素的概念视图。

<a id="markdown-138-结果映射resultmap" name="138-结果映射resultmap"></a>
### 1.3.8. 结果映射（resultMap）
<a href="#menu" style="float:right">目录</a>

* constructor - 用于在实例化类时，注入结果到构造方法中
* idArg - ID 参数；标记出作为 ID 的结果可以帮助提高整体性能
* arg - 将被注入到构造方法的一个普通结果
* id – 一个 ID 结果；标记出作为 ID 的结果可以帮助提高整体性能
* result – 注入到字段或 JavaBean 属性的普通结果
* association – 一个复杂类型的关联；许多结果将包装成这种类型嵌套结果映射 – 关联本身可以是一个 resultMap 元素，或者从别处引用一个
* collection – 一个复杂类型的集合
嵌套结果映射 – 集合本身可以是一个 resultMap 元素，或者从别处引用一个
* discriminator – 使用结果值来决定使用哪个 resultMap
* case – 基于某些值的结果映射
嵌套结果映射 – case 本身可以是一个 resultMap 元素，因此可以具有相同的结构和元素，或者从别处引用一个

ResultMap 的属性列表
|属性|	描述
|---|---|
|id|	当前命名空间中的一个唯一标识，用于标识一个结果映射。
|type|	类的完全限定名, 或者一个类型别名（关于内置的类型别名，可以参考上面的表格）。
|autoMapping|	如果设置这个属性，MyBatis将会为本结果映射开启或者关闭自动映射。 这个属性会覆盖全局的属性 autoMappingBehavior。默认值：未设置（unset）。

最佳实践 最好一步步地建立结果映射。单元测试可以在这个过程中起到很大帮助。 如果你尝试一次创建一个像上面示例那样的巨大的结果映射，那么很可能会出现错误而且很难去使用它来完成工作。 从最简单的形态开始，逐步迭代。而且别忘了单元测试！ 使用框架的缺点是有时候它们看上去像黑盒子（无论源代码是否可见）。 为了确保你实现的行为和想要的一致，最好的选择是编写单元测试。提交 bug 的时候它也能起到很大的作用。

下一部分将详细说明每个元素。

id & result
```xml
<id property="id" column="post_id"/>
<result property="subject" column="post_subject"/>
```
这些是结果映射最基本的内容。id 和 result 元素都将一个列的值映射到一个简单数据类型（String, int, double, Date 等）的属性或字段。

这两者之间的唯一不同是，id 元素表示的结果将是对象的标识属性，这会在比较对象实例时用到。 这样可以提高整体的性能，尤其是进行缓存和嵌套结果映射（也就是连接映射）的时候。

两个元素都有一些属性：

Id 和 Result 的属性
|属性|	描述
|---|---|
|property|	映射到列结果的字段或属性。如果用来匹配的 JavaBean 存在给定名字的属性，那么它将会被使用。否则 ||MyBatis| 将会寻找给定名称的字段。 无论是哪一种情形，你都可以使用通常的点式分隔形式进行复杂属性导航。 比如，你可以这样映射一些简单的东西：“username”，或者映射到一些复杂的东西上：“address.street.number”。
|column|	数据库中的列名，或者是列的别名。一般情况下，这和传递给 resultSet.getString(columnName) 方法的参数一样。
|javaType|	一个 Java 类的完全限定名，或一个类型别名（关于内置的类型别名，可以参考上面的表格）。 如果你映射到一个 JavaBean，MyBatis 通常可以推断类型。然而，如果你映射到的是 HashMap，那么你应该明确地指定 javaType 来保证行为与期望的相一致。
|jdbcType|	JDBC 类型，所支持的 JDBC 类型参见这个表格之后的“支持的 JDBC 类型”。 只需要在可能执行插入、更新和删除的且允许空值的列上指定 JDBC 类型。这是 JDBC 的要求而非 MyBatis 的要求。如果你直接面向 JDBC 编程，你需要对可能存在空值的列指定这个类型。
|typeHandler|	我们在前面讨论过默认的类型处理器。使用这个属性，你可以覆盖默认的类型处理器。 这个属性值是一个类型处理器实现类的完全限定名，或者是类型别名。

<a id="markdown-139-支持的-jdbc-类型" name="139-支持的-jdbc-类型"></a>
### 1.3.9. 支持的 JDBC 类型
<a href="#menu" style="float:right">目录</a>

为了以后可能的使用场景，MyBatis 通过内置的 jdbcType 枚举类型支持下面的 JDBC 类型。

|||||||
|---|---|---|---|---|---|
|BIT|	FLOAT|	CHAR	|TIMESTAMP|	OTHER	|UNDEFINED|
|TINYINT|	REAL|	VARCHAR	|BINARY|	BLOB|	NVARCHAR|
|SMALLINT|	DOUBLE|	LONGVARCHAR|	VARBINARY|	CLOB|	NCHAR|
|INTEGER|	NUMERIC|	DATE|	LONGVARBINARY	|BOOLEAN|	NCLOB|
|BIGINT|	DECIMAL|	TIME|	NULL|	CURSOR|	ARRAY|

<a id="markdown-1310-构造方法" name="1310-构造方法"></a>
### 1.3.10. 构造方法
<a href="#menu" style="float:right">目录</a>

通过修改对象属性的方式，可以满足大多数的数据传输对象（Data Transfer Object, DTO）以及绝大部分领域模型的要求。但有些情况下你想使用不可变类。 一般来说，很少改变或基本不变的包含引用或数据的表，很适合使用不可变类。 构造方法注入允许你在初始化时为类设置属性的值，而不用暴露出公有方法。MyBatis 也支持私有属性和私有 JavaBean 属性来完成注入，但有一些人更青睐于通过构造方法进行注入。 constructor 元素就是为此而生的。

看看下面这个构造方法:

```java
public class User {
   //...
   public User(Integer id, String username, int age) {
     //...
  }
//...
}
```
为了将结果注入构造方法，MyBatis 需要通过某种方式定位相应的构造方法。 在下面的例子中，MyBatis 搜索一个声明了三个形参的的构造方法，参数类型以 java.lang.Integer, java.lang.String 和 int 的顺序给出。

```xml
<constructor>
   <idArg column="id" javaType="int"/>
   <arg column="username" javaType="String"/>
   <arg column="age" javaType="_int"/>
</constructor>
当你在处理一个带有多个形参的构造方法时，很容易搞乱 arg 元素的顺序。 从版本 3.4.3 开始，可以在指定参数名称的前提下，以任意顺序编写 arg 元素。 为了通过名称来引用构造方法参数，你可以添加 @Param 注解，或者使用 '-parameters' 编译选项并启用 useActualParamName 选项（默认开启）来编译项目。下面是一个等价的例子，尽管函数签名中第二和第三个形参的顺序与 constructor 元素中参数声明的顺序不匹配。

<constructor>
   <idArg column="id" javaType="int" name="id" />
   <arg column="age" javaType="_int" name="age" />
   <arg column="username" javaType="String" name="username" />
</constructor>
```

如果存在名称和类型相同的属性，那么可以省略 javaType 。

剩余的属性和规则和普通的 id 和 result 元素是一样的。

|属性|	描述|
|---|---|
|column	|数据库中的列名，或者是列的别名。一般情况下，这和传递给 resultSet.getString(columnName) 方法的参数一样。
|javaType|	一个 Java 类的完全限定名，或一个类型别名（关于内置的类型别名，可以参考上面的表格）。 如果你映射到一个 JavaBean，MyBatis 通常可以推断类型。然而，如果你映射到的是 HashMap，那么你应该明确地指定 javaType 来保证行为与期望的相一致。
|jdbcType|	JDBC 类型，所支持的 JDBC 类型参见这个表格之前的“支持的 JDBC 类型”。 只需要在可能执行插入、更新和删除的且允许空值的列上指定 JDBC 类型。这是 JDBC 的要求而非 MyBatis 的要求。如果你直接面向 JDBC 编程，你需要对可能存在空值的列指定这个类型。
|typeHandler	|我们在前面讨论过默认的类型处理器。使用这个属性，你可以覆盖默认的类型处理器。 这个属性值是一个类型处理器实现类的完全限定名，或者是类型别名。
|select|	用于加载复杂类型属性的映射语句的 ID，它会从 column 属性中指定的列检索数据，作为参数传递给此 select 语句。具体请参考关联元素。
|resultMap|	结果映射的 ID，可以将嵌套的结果集映射到一个合适的对象树中。 它可以作为使用额外 select 语句的替代方案。它可以将多表连接操作的结果映射成一个单一的 ResultSet。这样的 ResultSet 将会将包含重复或部分数据重复的结果集。为了将结果集正确地映射到嵌套的对象树中，MyBatis 允许你 “串联”结果映射，以便解决嵌套结果集的问题。想了解更多内容，请参考下面的关联元素。
|name|	构造方法形参的名字。从 3.4.3 版本开始，通过指定具体的参数名，你可以以任意顺序写入 arg 元素。参看上面的解释。

<a id="markdown-1311-关联" name="1311-关联"></a>
### 1.3.11. 关联
<a href="#menu" style="float:right">目录</a>

```xml
<association property="author" column="blog_author_id" javaType="Author">
  <id property="id" column="author_id"/>
  <result property="username" column="author_username"/>
</association>
```

关联（association）元素处理“有一个”类型的关系。 比如，在我们的示例中，一个博客有一个用户。关联结果映射和其它类型的映射工作方式差不多。 你需要指定目标属性名以及属性的javaType（很多时候 MyBatis 可以自己推断出来），在必要的情况下你还可以设置 JDBC 类型，如果你想覆盖获取结果值的过程，还可以设置类型处理器。

关联的不同之处是，你需要告诉 MyBatis 如何加载关联。MyBatis 有两种不同的方式加载关联：

嵌套 Select 查询：通过执行另外一个 SQL 映射语句来加载期望的复杂类型。
嵌套结果映射：使用嵌套的结果映射来处理连接结果的重复子集。
首先，先让我们来看看这个元素的属性。你将会发现，和普通的结果映射相比，它只在 select 和 resultMap 属性上有所不同。

|属性|	描述
|---|---|
|property|	映射到列结果的字段或属性。如果用来匹配的 JavaBean 存在给定名字的属性，那么它将会被使用。否则 MyBatis 将会寻找给定名称的字段。 无论是哪一种情形，你都可以使用通常的点式分隔形式进行复杂属性导航。 比如，你可以这样映射一些简单的东西：“username”，或者映射到一些复杂的东西上：“address.street.number”。
|javaType|	一个 Java 类的完全限定名，或一个类型别名（关于内置的类型别名，可以参考上面的表格）。 如果你映射到一个 JavaBean，MyBatis 通常可以推断类型。然而，如果你映射到的是 HashMap，那么你应该明确地指定 javaType 来保证行为与期望的相一致。
|jdbcType|	JDBC 类型，所支持的 JDBC 类型参见这个表格之前的“支持的 JDBC 类型”。 只需要在可能执行插入、更新和删除的且允许空值的列上指定 JDBC 类型。这是 JDBC 的要求而非 MyBatis 的要求。如果你直接面向 JDBC 编程，你需要对可能存在空值的列指定这个类型。
|typeHandler|	我们在前面讨论过默认的类型处理器。使用这个属性，你可以覆盖默认的类型处理器。 这个属性值是一个类型处理器实现类的完全限定名，或者是类型别名。

<a id="markdown-1312-关联的嵌套-select-查询" name="1312-关联的嵌套-select-查询"></a>
### 1.3.12. 关联的嵌套 Select 查询
<a href="#menu" style="float:right">目录</a>

|属性|	描述
|---|---|
|column|	数据库中的列名，或者是列的别名。一般情况下，这和传递给 resultSet.getString(columnName) 方法的参数一样。 注意：在使用复合主键的时候，你可以使用 column="{prop1=col1,prop2=col2}" 这样的语法来指定多个传递给嵌套 Select 查询语句的列名。这会使得 prop1 和 prop2 作为参数对象，被设置为对应嵌套 Select 语句的参数。
|select|	用于加载复杂类型属性的映射语句的 ID，它会从 column 属性指定的列中检索数据，作为参数传递给目标 select 语句。 具体请参考下面的例子。注意：在使用复合主键的时候，你可以使用 column="{prop1=col1,prop2=col2}" 这样的语法来指定多个传递给嵌套 Select 查询语句的列名。这会使得 prop1 和 prop2 作为参数对象，被设置为对应嵌套 Select 语句的参数。
|fetchType|	可选的。有效值为 lazy 和 eager。 指定属性后，将在映射中忽略全局配置参数 lazyLoadingEnabled，使用属性的值。
示例：

```xml
<resultMap id="blogResult" type="Blog">
  <association property="author" column="author_id" javaType="Author" select="selectAuthor"/>
</resultMap>

<select id="selectBlog" resultMap="blogResult">
  SELECT * FROM BLOG WHERE ID = #{id}
</select>

<select id="selectAuthor" resultType="Author">
  SELECT * FROM AUTHOR WHERE ID = #{id}
</select>
```

就是这么简单。我们有两个 select 查询语句：一个用来加载博客（Blog），另外一个用来加载作者（Author），而且博客的结果映射描述了应该使用 selectAuthor 语句加载它的 author 属性。

其它所有的属性将会被自动加载，只要它们的列名和属性名相匹配。

这种方式虽然很简单，但在大型数据集或大型数据表上表现不佳。这个问题被称为“N+1 查询问题”。 概括地讲，N+1 查询问题是这样子的：

你执行了一个单独的 SQL 语句来获取结果的一个列表（就是“+1”）。
对列表返回的每条记录，你执行一个 select 查询语句来为每条记录加载详细信息（就是“N”）。
这个问题会导致成百上千的 SQL 语句被执行。有时候，我们不希望产生这样的后果。

好消息是，MyBatis 能够对这样的查询进行延迟加载，因此可以将大量语句同时运行的开销分散开来。 然而，如果你加载记录列表之后立刻就遍历列表以获取嵌套的数据，就会触发所有的延迟加载查询，性能可能会变得很糟糕。

所以还有另外一种方法。

<a id="markdown-1313-关联的嵌套结果映射" name="1313-关联的嵌套结果映射"></a>
### 1.3.13. 关联的嵌套结果映射
<a href="#menu" style="float:right">目录</a>

|属性|	描述
|---|---|
|resultMap|	结果映射的 ID，可以将此关联的嵌套结果集映射到一个合适的对象树中。 它可以作为使用额外 select 语句的替代方案。它可以将多表连接操作的结果映射成一个单一的 ResultSet。这样的 ResultSet 有部分数据是重复的。 为了将结果集正确地映射到嵌套的对象树中, MyBatis 允许你“串联”结果映射，以便解决嵌套结果集的问题。使用嵌套结果映射的一个例子在表格以后。
|columnPrefix|	当连接多个表时，你可能会不得不使用列别名来避免在 ResultSet 中产生重复的列名。指定 columnPrefix 列名前缀允许你将带有这些前缀的列映射到一个外部的结果映射中。 详细说明请参考后面的例子。
|notNullColumn|	默认情况下，在至少一个被映射到属性的列不为空时，子对象才会被创建。 你可以在这个属性上指定非空的列来改变默认行为，指定后，Mybatis 将只在这些列非空时才创建一个子对象。可以使用逗号分隔来指定多个列。默认值：未设置（unset）。
|autoMapping|	如果设置这个属性，MyBatis 将会为本结果映射开启或者关闭自动映射。 这个属性会覆盖全局的属性 autoMappingBehavior。注意，本属性对外部的结果映射无效，所以不能搭配 select 或 resultMap 元素使用。默认值：未设置（unset）。

之前，你已经看到了一个非常复杂的嵌套关联的例子。 下面的例子则是一个非常简单的例子，用于演示嵌套结果映射如何工作。 现在我们将博客表和作者表连接在一起，而不是执行一个独立的查询语句，就像这样：

```xml
<select id="selectBlog" resultMap="blogResult">
  select
    B.id            as blog_id,
    B.title         as blog_title,
    B.author_id     as blog_author_id,
    A.id            as author_id,
    A.username      as author_username,
    A.password      as author_password,
    A.email         as author_email,
    A.bio           as author_bio
  from Blog B left outer join Author A on B.author_id = A.id
  where B.id = #{id}
</select>
```

注意查询中的连接，以及为确保结果能够拥有唯一且清晰的名字，我们设置的别名。 这使得进行映射非常简单。现在我们可以映射这个结果：
```xml
<resultMap id="blogResult" type="Blog">
  <id property="id" column="blog_id" />
  <result property="title" column="blog_title"/>
  <association property="author" column="blog_author_id" javaType="Author" resultMap="authorResult"/>
</resultMap>

<resultMap id="authorResult" type="Author">
  <id property="id" column="author_id"/>
  <result property="username" column="author_username"/>
  <result property="password" column="author_password"/>
  <result property="email" column="author_email"/>
  <result property="bio" column="author_bio"/>
</resultMap>
```
在上面的例子中，你可以看到，博客（Blog）作者（author）的关联元素委托名为 “authorResult” 的结果映射来加载作者对象的实例。

非常重要： id 元素在嵌套结果映射中扮演着非常重要的角色。你应该总是指定一个或多个可以唯一标识结果的属性。 虽然，即使不指定这个属性，MyBatis 仍然可以工作，但是会产生严重的性能问题。 只需要指定可以唯一标识结果的最少属性。显然，你可以选择主键（复合主键也可以）。

现在，上面的示例使用了外部的结果映射元素来映射关联。这使得 Author 的结果映射可以被重用。 然而，如果你不打算重用它，或者你更喜欢将你所有的结果映射放在一个具有描述性的结果映射元素中。 你可以直接将结果映射作为子元素嵌套在内。这里给出使用这种方式的等效例子：
```xml
<resultMap id="blogResult" type="Blog">
  <id property="id" column="blog_id" />
  <result property="title" column="blog_title"/>
  <association property="author" javaType="Author">
    <id property="id" column="author_id"/>
    <result property="username" column="author_username"/>
    <result property="password" column="author_password"/>
    <result property="email" column="author_email"/>
    <result property="bio" column="author_bio"/>
  </association>
</resultMap>
```
那如果博客（blog）有一个共同作者（co-author）该怎么办？select 语句看起来会是这样的：
```xml
<select id="selectBlog" resultMap="blogResult">
  select
    B.id            as blog_id,
    B.title         as blog_title,
    A.id            as author_id,
    A.username      as author_username,
    A.password      as author_password,
    A.email         as author_email,
    A.bio           as author_bio,
    CA.id           as co_author_id,
    CA.username     as co_author_username,
    CA.password     as co_author_password,
    CA.email        as co_author_email,
    CA.bio          as co_author_bio
  from Blog B
  left outer join Author A on B.author_id = A.id
  left outer join Author CA on B.co_author_id = CA.id
  where B.id = #{id}
</select>
```
回忆一下，Author 的结果映射定义如下：
```xml
<resultMap id="authorResult" type="Author">
  <id property="id" column="author_id"/>
  <result property="username" column="author_username"/>
  <result property="password" column="author_password"/>
  <result property="email" column="author_email"/>
  <result property="bio" column="author_bio"/>
</resultMap>
```
由于结果中的列名与结果映射中的列名不同。你需要指定 columnPrefix 以便重复使用该结果映射来映射 co-author 的结果。
```xml
<resultMap id="blogResult" type="Blog">
  <id property="id" column="blog_id" />
  <result property="title" column="blog_title"/>
  <association property="author"
    resultMap="authorResult" />
  <association property="coAuthor"
    resultMap="authorResult"
    columnPrefix="co_" />
</resultMap>
```

<a id="markdown-1314-关联的多结果集resultset" name="1314-关联的多结果集resultset"></a>
### 1.3.14. 关联的多结果集（ResultSet）
<a href="#menu" style="float:right">目录</a>

|属性|	描述
|---|---|
|column|	当使用多个结果集时，该属性指定结果集中用于与 foreignColumn 匹配的列（多个列名以逗号隔开），以识别关系中的父类型与子类型。
|foreignColumn|	指定外键对应的列名，指定的列将与父类型中 column 的给出的列进行匹配。
|resultSet|	指定用于加载复杂类型的结果集名字。
从版本 3.2.3 开始，MyBatis 提供了另一种解决 N+1 查询问题的方法。

某些数据库允许存储过程返回多个结果集，或一次性执行多个语句，每个语句返回一个结果集。 我们可以利用这个特性，在不使用连接的情况下，只访问数据库一次就能获得相关数据。

在例子中，存储过程执行下面的查询并返回两个结果集。第一个结果集会返回博客（Blog）的结果，第二个则返回作者（Author）的结果。

```
SELECT * FROM BLOG WHERE ID = #{id}
SELECT * FROM AUTHOR WHERE ID = #{id}
```
在映射语句中，必须通过 resultSets 属性为每个结果集指定一个名字，多个名字使用逗号隔开。

```xml
<select id="selectBlog" resultSets="blogs,authors" resultMap="blogResult" statementType="CALLABLE">
  {call getBlogsAndAuthors(#{id,jdbcType=INTEGER,mode=IN})}
</select>
```
现在我们可以指定使用 “authors” 结果集的数据来填充 “author” 关联：

```xml
<resultMap id="blogResult" type="Blog">
  <id property="id" column="id" />
  <result property="title" column="title"/>
  <association property="author" javaType="Author" resultSet="authors" column="author_id" foreignColumn="id">
    <id property="id" column="id"/>
    <result property="username" column="username"/>
    <result property="password" column="password"/>
    <result property="email" column="email"/>
    <result property="bio" column="bio"/>
  </association>
</resultMap>
```

你已经在上面看到了如何处理“有一个”类型的关联。但是该怎么处理“有很多个”类型的关联呢？这就是我们接下来要介绍的。

<a id="markdown-1315-集合" name="1315-集合"></a>
### 1.3.15. 集合
<a href="#menu" style="float:right">目录</a>

```xml
<collection property="posts" ofType="domain.blog.Post">
  <id property="id" column="post_id"/>
  <result property="subject" column="post_subject"/>
  <result property="body" column="post_body"/>
</collection>
```

集合元素和关联元素几乎是一样的，它们相似的程度之高，以致于没有必要再介绍集合元素的相似部分。 所以让我们来关注它们的不同之处吧。

我们来继续上面的示例，一个博客（Blog）只有一个作者（Author)。但一个博客有很多文章（Post)。 在博客类中，这可以用下面的写法来表示：

private List<Post> posts;
要像上面这样，映射嵌套结果集合到一个 List 中，可以使用集合元素。 和关联元素一样，我们可以使用嵌套 Select 查询，或基于连接的嵌套结果映射集合。

<a id="markdown-1316-集合的嵌套-select-查询" name="1316-集合的嵌套-select-查询"></a>
### 1.3.16. 集合的嵌套 Select 查询
<a href="#menu" style="float:right">目录</a>

首先，让我们看看如何使用嵌套 Select 查询来为博客加载文章。

```xml
<resultMap id="blogResult" type="Blog">
  <collection property="posts" javaType="ArrayList" column="id" ofType="Post" select="selectPostsForBlog"/>
</resultMap>

<select id="selectBlog" resultMap="blogResult">
  SELECT * FROM BLOG WHERE ID = #{id}
</select>

<select id="selectPostsForBlog" resultType="Post">
  SELECT * FROM POST WHERE BLOG_ID = #{id}
</select>
```

你可能会立刻注意到几个不同，但大部分都和我们上面学习过的关联元素非常相似。 首先，你会注意到我们使用的是集合元素。 接下来你会注意到有一个新的 “ofType” 属性。这个属性非常重要，它用来将 JavaBean（或字段）属性的类型和集合存储的类型区分开来。 所以你可以按照下面这样来阅读映射：

```xml
<collection property="posts" javaType="ArrayList" column="id" ofType="Post" select="selectPostsForBlog"/>
```
读作： “posts 是一个存储 Post 的 ArrayList 集合”

在一般情况下，MyBatis 可以推断 javaType 属性，因此并不需要填写。所以很多时候你可以简略成：

```xml
<collection property="posts" column="id" ofType="Post" select="selectPostsForBlog"/>
```
<a id="markdown-1317-集合的嵌套结果映射" name="1317-集合的嵌套结果映射"></a>
### 1.3.17. 集合的嵌套结果映射
<a href="#menu" style="float:right">目录</a>


现在你可能已经猜到了集合的嵌套结果映射是怎样工作的——除了新增的 “ofType” 属性，它和关联的完全相同。

首先, 让我们看看对应的 SQL 语句：
```xml
<select id="selectBlog" resultMap="blogResult">
  select
  B.id as blog_id,
  B.title as blog_title,
  B.author_id as blog_author_id,
  P.id as post_id,
  P.subject as post_subject,
  P.body as post_body,
  from Blog B
  left outer join Post P on B.id = P.blog_id
  where B.id = #{id}
</select>
```
我们再次连接了博客表和文章表，并且为每一列都赋予了一个有意义的别名，以便映射保持简单。 要映射博客里面的文章集合，就这么简单：
```xml
<resultMap id="blogResult" type="Blog">
  <id property="id" column="blog_id" />
  <result property="title" column="blog_title"/>
  <collection property="posts" ofType="Post">
    <id property="id" column="post_id"/>
    <result property="subject" column="post_subject"/>
    <result property="body" column="post_body"/>
  </collection>
</resultMap>
```

再提醒一次，要记得上面 id 元素的重要性，如果你不记得了，请阅读关联部分的相关部分。

如果你喜欢更详略的、可重用的结果映射，你可以使用下面的等价形式：
```xml
<resultMap id="blogResult" type="Blog">
  <id property="id" column="blog_id" />
  <result property="title" column="blog_title"/>
  <collection property="posts" ofType="Post" resultMap="blogPostResult" columnPrefix="post_"/>
</resultMap>

<resultMap id="blogPostResult" type="Post">
  <id property="id" column="id"/>
  <result property="subject" column="subject"/>
  <result property="body" column="body"/>
</resultMap>
```

<a id="markdown-1318-集合的多结果集resultset" name="1318-集合的多结果集resultset"></a>
### 1.3.18. 集合的多结果集（ResultSet）
<a href="#menu" style="float:right">目录</a>

像关联元素那样，我们可以通过执行存储过程实现，它会执行两个查询并返回两个结果集，一个是博客的结果集，另一个是文章的结果集：

```
SELECT * FROM BLOG WHERE ID = #{id}
SELECT * FROM POST WHERE BLOG_ID = #{id}
```

在映射语句中，必须通过 resultSets 属性为每个结果集指定一个名字，多个名字使用逗号隔开。
```xml
<select id="selectBlog" resultSets="blogs,posts" resultMap="blogResult">
  {call getBlogsAndPosts(#{id,jdbcType=INTEGER,mode=IN})}
</select>
```
我们指定 “posts” 集合将会使用存储在 “posts” 结果集中的数据进行填充：

```xml
<resultMap id="blogResult" type="Blog">
  <id property="id" column="id" />
  <result property="title" column="title"/>
  <collection property="posts" ofType="Post" resultSet="posts" column="id" foreignColumn="blog_id">
    <id property="id" column="id"/>
    <result property="subject" column="subject"/>
    <result property="body" column="body"/>
  </collection>
</resultMap>
```

注意 对关联或集合的映射，并没有深度、广度或组合上的要求。但在映射时要留意性能问题。 在探索最佳实践的过程中，应用的单元测试和性能测试会是你的好帮手。 而 MyBatis 的好处在于，可以在不对你的代码引入重大变更（如果有）的情况下，允许你之后改变你的想法。

高级关联和集合映射是一个深度话题。文档的介绍只能到此为止。配合少许的实践，你会很快了解全部的用法。

<a id="markdown-1319-鉴别器" name="1319-鉴别器"></a>
### 1.3.19. 鉴别器
<a href="#menu" style="float:right">目录</a>

```xml
<discriminator javaType="int" column="draft">
  <case value="1" resultType="DraftPost"/>
</discriminator>
```

有时候，一个数据库查询可能会返回多个不同的结果集（但总体上还是有一定的联系的）。 鉴别器（discriminator）元素就是被设计来应对这种情况的，另外也能处理其它情况，例如类的继承层次结构。 鉴别器的概念很好理解——它很像 Java 语言中的 switch 语句。

一个鉴别器的定义需要指定 column 和 javaType 属性。column 指定了 MyBatis 查询被比较值的地方。 而 javaType 用来确保使用正确的相等测试（虽然很多情况下字符串的相等测试都可以工作）。例如：

```xml
<resultMap id="vehicleResult" type="Vehicle">
  <id property="id" column="id" />
  <result property="vin" column="vin"/>
  <result property="year" column="year"/>
  <result property="make" column="make"/>
  <result property="model" column="model"/>
  <result property="color" column="color"/>
  <discriminator javaType="int" column="vehicle_type">
    <case value="1" resultMap="carResult"/>
    <case value="2" resultMap="truckResult"/>
    <case value="3" resultMap="vanResult"/>
    <case value="4" resultMap="suvResult"/>
  </discriminator>
</resultMap>
```

在这个示例中，MyBatis 会从结果集中得到每条记录，然后比较它的 vehicle type 值。 如果它匹配任意一个鉴别器的 case，就会使用这个 case 指定的结果映射。 这个过程是互斥的，也就是说，剩余的结果映射将被忽略（除非它是扩展的，我们将在稍后讨论它）。 如果不能匹配任何一个 case，MyBatis 就只会使用鉴别器块外定义的结果映射。 所以，如果 carResult 的声明如下：

```xml
<resultMap id="carResult" type="Car">
  <result property="doorCount" column="door_count" />
</resultMap>
```

那么只有 doorCount 属性会被加载。这是为了即使鉴别器的 case 之间都能分为完全独立的一组，尽管和父结果映射可能没有什么关系。在上面的例子中，我们当然知道 cars 和 vehicles 之间有关系，也就是 Car 是一个 Vehicle。因此，我们希望剩余的属性也能被加载。而这只需要一个小修改。

```xml
<resultMap id="carResult" type="Car" extends="vehicleResult">
  <result property="doorCount" column="door_count" />
</resultMap>
```

现在 vehicleResult 和 carResult 的属性都会被加载了。

可能有人又会觉得映射的外部定义有点太冗长了。 因此，对于那些更喜欢简洁的映射风格的人来说，还有另一种语法可以选择。例如：

```xml
<resultMap id="vehicleResult" type="Vehicle">
  <id property="id" column="id" />
  <result property="vin" column="vin"/>
  <result property="year" column="year"/>
  <result property="make" column="make"/>
  <result property="model" column="model"/>
  <result property="color" column="color"/>
  <discriminator javaType="int" column="vehicle_type">
    <case value="1" resultType="carResult">
      <result property="doorCount" column="door_count" />
    </case>
    <case value="2" resultType="truckResult">
      <result property="boxSize" column="box_size" />
      <result property="extendedCab" column="extended_cab" />
    </case>
    <case value="3" resultType="vanResult">
      <result property="powerSlidingDoor" column="power_sliding_door" />
    </case>
    <case value="4" resultType="suvResult">
      <result property="allWheelDrive" column="all_wheel_drive" />
    </case>
  </discriminator>
</resultMap>
```

提示 请注意，这些都是结果映射，如果你完全不设置任何的 result 元素，MyBatis 将为你自动匹配列和属性。所以上面的例子大多都要比实际的更复杂。 这也表明，大多数数据库的复杂度都比较高，我们不太可能一直依赖于这种机制。

<a id="markdown-1320-自动映射" name="1320-自动映射"></a>
### 1.3.20. 自动映射
<a href="#menu" style="float:right">目录</a>

正如你在前面一节看到的，在简单的场景下，MyBatis 可以为你自动映射查询结果。但如果遇到复杂的场景，你需要构建一个结果映射。 但是在本节中，你将看到，你可以混合使用这两种策略。让我们深入了解一下自动映射是怎样工作的。

当自动映射查询结果时，MyBatis 会获取结果中返回的列名并在 Java 类中查找相同名字的属性（忽略大小写）。 这意味着如果发现了 ID 列和 id 属性，MyBatis 会将列 ID 的值赋给 id 属性。

通常数据库列使用大写字母组成的单词命名，单词间用下划线分隔；而 Java 属性一般遵循驼峰命名法约定。为了在这两种命名方式之间启用自动映射，需要将 mapUnderscoreToCamelCase 设置为 true。

甚至在提供了结果映射后，自动映射也能工作。在这种情况下，对于每一个结果映射，在 ResultSet 出现的列，如果没有设置手动映射，将被自动映射。在自动映射处理完毕后，再处理手动映射。 在下面的例子中，id 和 userName 列将被自动映射，hashed_password 列将根据配置进行映射。

```xml
<select id="selectUsers" resultMap="userResultMap">
  select
    user_id             as "id",
    user_name           as "userName",
    hashed_password
  from some_table
  where id = #{id}
</select>
<resultMap id="userResultMap" type="User">
  <result property="password" column="hashed_password"/>
</resultMap>
```

有三种自动映射等级：

NONE - 禁用自动映射。仅对手动映射的属性进行映射。
PARTIAL - 对除在内部定义了嵌套结果映射（也就是连接的属性）以外的属性进行映射
FULL - 自动映射所有属性。
默认值是 PARTIAL，这是有原因的。当对连接查询的结果使用 FULL 时，连接查询会在同一行中获取多个不同实体的数据，因此可能导致非预期的映射。 下面的例子将展示这种风险：

```xml
<select id="selectBlog" resultMap="blogResult">
  select
    B.id,
    B.title,
    A.username,
  from Blog B left outer join Author A on B.author_id = A.id
  where B.id = #{id}
</select>
<resultMap id="blogResult" type="Blog">
  <association property="author" resultMap="authorResult"/>
</resultMap>

<resultMap id="authorResult" type="Author">
  <result property="username" column="author_username"/>
</resultMap>
```

在该结果映射中，Blog 和 Author 均将被自动映射。但是注意 Author 有一个 id 属性，在 ResultSet 中也有一个名为 id 的列，所以 Author 的 id 将填入 Blog 的 id，这可不是你期望的行为。 所以，要谨慎使用 FULL。

无论设置的自动映射等级是哪种，你都可以通过在结果映射上设置 autoMapping 属性来为指定的结果映射设置启用/禁用自动映射。

```xml
<resultMap id="userResultMap" type="User" autoMapping="false">
  <result property="password" column="hashed_password"/>
</resultMap>
```


<a id="markdown-14-动态-sql" name="14-动态-sql"></a>
## 1.4. 动态 SQL
<a href="#menu" style="float:right">目录</a>

MyBatis 的强大特性之一便是它的动态 SQL。如果你有使用 JDBC 或其它类似框架的经验，你就能体会到根据不同条件拼接 SQL 语句的痛苦。例如拼接时要确保不能忘记添加必要的空格，还要注意去掉列表最后一个列名的逗号。利用动态 SQL 这一特性可以彻底摆脱这种痛苦。

虽然在以前使用动态 SQL 并非一件易事，但正是 MyBatis 提供了可以被用在任意 SQL 映射语句中的强大的动态 SQL 语言得以改进这种情形。

动态 SQL 元素和 JSTL 或基于类似 XML 的文本处理器相似。在 MyBatis 之前的版本中，有很多元素需要花时间了解。MyBatis 3 大大精简了元素种类，现在只需学习原来一半的元素便可。MyBatis 采用功能强大的基于 OGNL 的表达式来淘汰其它大部分元素。

* if
* choose (when, otherwise)
* trim (where, set)
* foreach

<a id="markdown-141-if" name="141-if"></a>
### 1.4.1. if
<a href="#menu" style="float:right">目录</a>

动态 SQL 通常要做的事情是根据条件包含 where 子句的一部分。比如：

```xml
<select id="findActiveBlogWithTitleLike"
     resultType="Blog">
  SELECT * FROM BLOG
  WHERE state = ‘ACTIVE’
  <if test="title != null">
    AND title like #{title}
  </if>
</select>
```

这条语句提供了一种可选的查找文本功能。如果没有传入“title”，那么所有处于“ACTIVE”状态的BLOG都会返回；反之若传入了“title”，那么就会对“title”一列进行模糊查找并返回 BLOG 结果（细心的读者可能会发现，“title”参数值是可以包含一些掩码或通配符的）。

如果希望通过“title”和“author”两个参数进行可选搜索该怎么办呢？首先，改变语句的名称让它更具实际意义；然后只要加入另一个条件即可。

```xml
<select id="findActiveBlogLike"
     resultType="Blog">
  SELECT * FROM BLOG WHERE state = ‘ACTIVE’
  <if test="title != null">
    AND title like #{title}
  </if>
  <if test="author != null and author.name != null">
    AND author_name like #{author.name}
  </if>
</select>
```

<a id="markdown-142-choose-when-otherwise" name="142-choose-when-otherwise"></a>
### 1.4.2. choose, when, otherwise
有时我们不想应用到所有的条件语句，而只想从中择其一项。针对这种情况，MyBatis 提供了 choose 元素，它有点像 Java 中的 switch 语句。

还是上面的例子，但是这次变为提供了“title”就按“title”查找，提供了“author”就按“author”查找的情形，若两者都没有提供，就返回所有符合条件的 BLOG（实际情况可能是由管理员按一定策略选出 BLOG 列表，而不是返回大量无意义的随机结果）。

```xml
<select id="findActiveBlogLike"
     resultType="Blog">
  SELECT * FROM BLOG WHERE state = ‘ACTIVE’
  <choose>
    <when test="title != null">
      AND title like #{title}
    </when>
    <when test="author != null and author.name != null">
      AND author_name like #{author.name}
    </when>
    <otherwise>
      AND featured = 1
    </otherwise>
  </choose>
</select>
``` 

<a id="markdown-143-trim-where-set" name="143-trim-where-set"></a>
### 1.4.3. trim, where, set
前面几个例子已经合宜地解决了一个臭名昭著的动态 SQL 问题。现在回到“if”示例，这次我们将“ACTIVE = 1”也设置成动态的条件，看看会发生什么。

```xml
<select id="findActiveBlogLike"
     resultType="Blog">
  SELECT * FROM BLOG
  WHERE
  <if test="state != null">
    state = #{state}
  </if>
  <if test="title != null">
    AND title like #{title}
  </if>
  <if test="author != null and author.name != null">
    AND author_name like #{author.name}
  </if>
</select>
```

如果这些条件没有一个能匹配上会发生什么？最终这条 SQL 会变成这样：

SELECT * FROM BLOG

<a id="markdown-144-where" name="144-where"></a>
### 1.4.4. WHERE
这会导致查询失败。如果仅仅第二个条件匹配又会怎样？这条 SQL 最终会是这样:

SELECT * FROM BLOG
WHERE
AND title like ‘someTitle’
这个查询也会失败。这个问题不能简单地用条件句式来解决，如果你也曾经被迫这样写过，那么你很可能从此以后都不会再写出这种语句了。

MyBatis 有一个简单的处理，这在 90% 的情况下都会有用。而在不能使用的地方，你可以自定义处理方式来令其正常工作。一处简单的修改就能达到目的：

```xml
<select id="findActiveBlogLike"
     resultType="Blog">
  SELECT * FROM BLOG
  <where>
    <if test="state != null">
         state = #{state}
    </if>
    <if test="title != null">
        AND title like #{title}
    </if>
    <if test="author != null and author.name != null">
        AND author_name like #{author.name}
    </if>
  </where>
</select>
```

where 元素只会在至少有一个子元素的条件返回 SQL 子句的情况下才去插入“WHERE”子句。而且，若语句的开头为“AND”或“OR”，where 元素也会将它们去除。

如果 where 元素没有按正常套路出牌，我们可以通过自定义 trim 元素来定制 where 元素的功能。比如，和 where 元素等价的自定义 trim 元素为：

```xml
<trim prefix="WHERE" prefixOverrides="AND |OR ">
  ...
</trim>
```


prefixOverrides 属性会忽略通过管道分隔的文本序列（注意此例中的空格也是必要的）。它的作用是移除所有指定在 prefixOverrides 属性中的内容，并且插入 prefix 属性中指定的内容。

类似的用于动态更新语句的解决方案叫做 set。set 元素可以用于动态包含需要更新的列，而舍去其它的。比如：

```xml
<update id="updateAuthorIfNecessary">
  update Author
    <set>
      <if test="username != null">username=#{username},</if>
      <if test="password != null">password=#{password},</if>
      <if test="email != null">email=#{email},</if>
      <if test="bio != null">bio=#{bio}</if>
    </set>
  where id=#{id}
</update>
```

这里，set 元素会动态前置 SET 关键字，同时也会删掉无关的逗号，因为用了条件语句之后很可能就会在生成的 SQL 语句的后面留下这些逗号。（译者注：因为用的是“if”元素，若最后一个“if”没有匹配上而前面的匹配上，SQL 语句的最后就会有一个逗号遗留）

若你对 set 元素等价的自定义 trim 元素的代码感兴趣，那这就是它的真面目：

```xml
<trim prefix="SET" suffixOverrides=",">
  ...
</trim>
```

注意这里我们删去的是后缀值，同时添加了前缀值。

<a id="markdown-145-foreach" name="145-foreach"></a>
### 1.4.5. foreach
动态 SQL 的另外一个常用的操作需求是对一个集合进行遍历，通常是在构建 IN 条件语句的时候。比如：

```xml
<select id="selectPostIn" resultType="domain.blog.Post">
  SELECT *
  FROM POST P
  WHERE ID in
  <foreach item="item" index="index" collection="list"
      open="(" separator="," close=")">
        #{item}
  </foreach>
</select>
```

foreach 元素的功能非常强大，它允许你指定一个集合，声明可以在元素体内使用的集合项（item）和索引（index）变量。它也允许你指定开头与结尾的字符串以及在迭代结果之间放置分隔符。这个元素是很智能的，因此它不会偶然地附加多余的分隔符。

注意 你可以将任何可迭代对象（如 List、Set 等）、Map 对象或者数组对象传递给 foreach 作为集合参数。当使用可迭代对象或者数组时，index 是当前迭代的次数，item 的值是本次迭代获取的元素。当使用 Map 对象（或者 Map.Entry 对象的集合）时，index 是键，item 是值。

到此我们已经完成了涉及 XML 配置文件和 XML 映射文件的讨论。下一章将详细探讨 Java API，这样就能提高已创建的映射文件的利用效率。

<a id="markdown-146-script" name="146-script"></a>
### 1.4.6. script
For using dynamic SQL in annotated mapper class, script element can be used. For example:

    @Update({"<script>",
      "update Author",
      "  <set>",
      "    <if test='username != null'>username=#{username},</if>",
      "    <if test='password != null'>password=#{password},</if>",
      "    <if test='email != null'>email=#{email},</if>",
      "    <if test='bio != null'>bio=#{bio}</if>",
      "  </set>",
      "where id=#{id}",
      "</script>"})
    void updateAuthorValues(Author author);
<a id="markdown-147-bind" name="147-bind"></a>
### 1.4.7. bind
bind 元素可以从 OGNL 表达式中创建一个变量并将其绑定到上下文。比如：

```xml
<select id="selectBlogsLike" resultType="Blog">
  <bind name="pattern" value="'%' + _parameter.getTitle() + '%'" />
  SELECT * FROM BLOG
  WHERE title LIKE #{pattern}
</select>
```

多数据库支持
一个配置了“_databaseId”变量的 databaseIdProvider 可用于动态代码中，这样就可以根据不同的数据库厂商构建特定的语句。比如下面的例子：

```xml
<insert id="insert">
  <selectKey keyProperty="id" resultType="int" order="BEFORE">
    <if test="_databaseId == 'oracle'">
      select seq_users.nextval from dual
    </if>
    <if test="_databaseId == 'db2'">
      select nextval for seq_users from sysibm.sysdummy1"
    </if>
  </selectKey>
  insert into users values (#{id}, #{name})
</insert>
```

动态 SQL 中的可插拔脚本语言
MyBatis 从 3.2 开始支持可插拔脚本语言，这允许你插入一种脚本语言驱动，并基于这种语言来编写动态 SQL 查询语句。

可以通过实现以下接口来插入一种语言：
```java
public interface LanguageDriver {
  ParameterHandler createParameterHandler(MappedStatement mappedStatement, Object parameterObject, BoundSql boundSql);
  SqlSource createSqlSource(Configuration configuration, XNode script, Class<?> parameterType);
  SqlSource createSqlSource(Configuration configuration, String script, Class<?> parameterType);
}
```
一旦设定了自定义语言驱动，你就可以在 mybatis-config.xml 文件中将它设置为默认语言：

```xml
<typeAliases>
  <typeAlias type="org.sample.MyLanguageDriver" alias="myLanguage"/>
</typeAliases>
<settings>
  <setting name="defaultScriptingLanguage" value="myLanguage"/>
</settings>
```

除了设置默认语言，你也可以针对特殊的语句指定特定语言，可以通过如下的 lang 属性来完成：
```xml
<select id="selectBlog" lang="myLanguage">
  SELECT * FROM BLOG
</select>
```
或者，如果你使用的是映射器接口类，在抽象方法上加上 @Lang 注解即可：
```java
public interface Mapper {
  @Lang(MyLanguageDriver.class)
  @Select("SELECT * FROM BLOG")
  List<Blog> selectBlog();
}
```


<a id="markdown-15-缓存" name="15-缓存"></a>
## 1.5. 缓存
<a href="#menu" style="float:right">目录</a>

<a id="markdown-151-mybatis-缓存" name="151-mybatis-缓存"></a>
### 1.5.1. Mybatis 缓存

MyBatis 内置了一个强大的事务性查询缓存机制，它可以非常方便地配置和定制。 为了使它更加强大而且易于配置，我们对 MyBatis 3 中的缓存实现进行了许多改进。

默认情况下，只启用了本地的会话缓存，它仅仅对一个会话中的数据进行缓存。 要启用全局的二级缓存，只需要在你的 SQL 映射文件中添加一行：
```xml
<cache/>
```
基本上就是这样。这个简单语句的效果如下:
* 映射语句文件中的所有 select 语句的结果将会被缓存。
* 映射语句文件中的所有 insert、update 和 delete 语句会刷新缓存。
* 缓存会使用最近最少使用算法（LRU, Least Recently Used）算法来清除不需要的缓存。
* 缓存不会定时进行刷新（也就是说，没有刷新间隔）。
* 缓存会保存列表或对象（无论查询方法返回哪种）的 1024 个引用。
* 缓存会被视为读/写缓存，这意味着获取到的对象并不是共享的，可以安全地被调用者修改，而不干扰其他调用者或线程所做的潜在修改。
提示 缓存只作用于 cache 标签所在的映射文件中的语句。如果你混合使用 Java API 和 XML 映射文件，在共用接口中的语句将不会被默认缓存。你需要使用 @CacheNamespaceRef 注解指定缓存作用域。

这些属性可以通过 cache 元素的属性来修改。比如：

```xml
<cache
  eviction="FIFO"
  flushInterval="60000"
  size="512"
  readOnly="true"/>
```
这个更高级的配置创建了一个 FIFO 缓存，每隔 60 秒刷新，最多可以存储结果对象或列表的 512 个引用，而且返回的对象被认为是只读的，因此对它们进行修改可能会在不同线程中的调用者产生冲突。

**可用的清除策略有：**
* LRU – 最近最少使用：移除最长时间不被使用的对象。
* FIFO – 先进先出：按对象进入缓存的顺序来移除它们。
* SOFT – 软引用：基于垃圾回收器状态和软引用规则移除对象。
* WEAK – 弱引用：更积极地基于垃圾收集器状态和弱引用规则移除对象。
默认的清除策略是 LRU。

**flushInterval**（刷新间隔）属性可以被设置为任意的正整数，设置的值应该是一个以毫秒为单位的合理时间量。 默认情况是不设置，也就是没有刷新间隔，缓存仅仅会在调用语句时刷新。

**size**（引用数目）属性可以被设置为任意正整数，要注意欲缓存对象的大小和运行环境中可用的内存资源。默认值是 1024。
**readOnly**（只读）属性可以被设置为 true 或 false。只读的缓存会给所有调用者返回缓存对象的相同实例。 因此这些对象不能被修改。这就提供了可观的性能提升。而可读写的缓存会（通过序列化）返回缓存对象的拷贝。 速度上会慢一些，但是更安全，因此默认值是 false。

提示 二级缓存是事务性的。这意味着，当 SqlSession 完成并提交时，或是完成并回滚，但没有执行 flushCache=true 的 insert/delete/update 语句时，缓存会获得更新。

**一级缓存**
* 一级缓存默认开启，存在SqlSession的生命周期中。也就是缓存共享于同一个SqlSession
* 在同一个SqlSession查询中，Mybatis会把执行的方法和参数通过一定的方法生成缓存的键值，将键值和查询结果存入一个map中
BaseExecutor
```java
@Override
public CacheKey createCacheKey(MappedStatement ms, Object parameterObject, RowBounds rowBounds, BoundSql boundSql) {
    if (closed) {
        throw new ExecutorException("Executor was closed.");
    }
    CacheKey cacheKey = new CacheKey();
    cacheKey.update(ms.getId());
    cacheKey.update(rowBounds.getOffset());
    cacheKey.update(rowBounds.getLimit());
    cacheKey.update(boundSql.getSql());
    List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
    TypeHandlerRegistry typeHandlerRegistry = ms.getConfiguration().getTypeHandlerRegistry();
    // mimic DefaultParameterHandler logic
    for (ParameterMapping parameterMapping : parameterMappings) {
        if (parameterMapping.getMode() != ParameterMode.OUT) {
        Object value;
        String propertyName = parameterMapping.getProperty();
        if (boundSql.hasAdditionalParameter(propertyName)) {
            value = boundSql.getAdditionalParameter(propertyName);
        } else if (parameterObject == null) {
            value = null;
        } else if (typeHandlerRegistry.hasTypeHandler(parameterObject.getClass())) {
            value = parameterObject;
        } else {
            MetaObject metaObject = configuration.newMetaObject(parameterObject);
            value = metaObject.getValue(propertyName);
        }
        cacheKey.update(value);
        }
    }
    if (configuration.getEnvironment() != null) {
        // issue #176
        cacheKey.update(configuration.getEnvironment().getId());
    }
    return cacheKey;
}
```

**二级缓存**
* 二级缓存存在于SqlSessionFactory生命周期中，也就是缓存共享于同一个SqlSessionFactory

**注意:**缓存使用的是堆内存，使用前应确认是否是必须的，也需要配置好回收策略，避免出现频繁的垃圾回收。

<a id="markdown-152-使用自定义缓存" name="152-使用自定义缓存"></a>
### 1.5.2. 使用自定义缓存
<a href="#menu" style="float:right">目录</a>


除了上述自定义缓存的方式，你也可以通过实现你自己的缓存，或为其他第三方缓存方案创建适配器，来完全覆盖缓存行为。

```xml
<cache type="com.domain.something.MyCustomCache"/>
```

这个示例展示了如何使用一个自定义的缓存实现。type 属性指定的类必须实现 org.mybatis.cache.Cache 接口，且提供一个接受 String 参数作为 id 的构造器。 这个接口是 MyBatis 框架中许多复杂的接口之一，但是行为却非常简单。
```java
public interface Cache {
  String getId();
  int getSize();
  void putObject(Object key, Object value);
  Object getObject(Object key);
  boolean hasKey(Object key);
  Object removeObject(Object key);
  void clear();
}
```

为了对你的缓存进行配置，只需要简单地在你的缓存实现中添加公有的 JavaBean 属性，然后通过 cache 元素传递属性值，例如，下面的例子将在你的缓存实现上调用一个名为 setCacheFile(String file) 的方法：
```xml
<cache type="com.domain.something.MyCustomCache">
  <property name="cacheFile" value="/tmp/my-custom-cache.tmp"/>
</cache>
```

你可以使用所有简单类型作为 JavaBean 属性的类型，MyBatis 会进行转换。 你也可以使用占位符（如 ${cache.file}），以便替换成在配置文件属性中定义的值。

从版本 3.4.2 开始，MyBatis 已经支持在所有属性设置完毕之后，调用一个初始化方法。 如果想要使用这个特性，请在你的自定义缓存类里实现 org.apache.ibatis.builder.InitializingObject 接口。

```java
public interface InitializingObject {
  void initialize() throws Exception;
}
```

提示 上一节中对缓存的配置（如清除策略、可读或可读写等），不能应用于自定义缓存。

请注意，缓存的配置和缓存实例会被绑定到 SQL 映射文件的命名空间中。 因此，同一命名空间中的所有语句和缓存将通过命名空间绑定在一起。 每条语句可以自定义与缓存交互的方式，或将它们完全排除于缓存之外，这可以通过在每条语句上使用两个简单属性来达成。 默认情况下，语句会这样来配置：

```xml
<select ... flushCache="false" useCache="true"/>
<insert ... flushCache="true"/>
<update ... flushCache="true"/>
<delete ... flushCache="true"/>
```

鉴于这是默认行为，显然你永远不应该以这样的方式显式配置一条语句。但如果你想改变默认的行为，只需要设置 flushCache 和 useCache 属性。比如，某些情况下你可能希望特定 select 语句的结果排除于缓存之外，或希望一条 select 语句清空缓存。类似地，你可能希望某些 update 语句执行时不要刷新缓存。

**cache-ref**
回想一下上一节的内容，对某一命名空间的语句，只会使用该命名空间的缓存进行缓存或刷新。 但你可能会想要在多个命名空间中共享相同的缓存配置和实例。要实现这种需求，你可以使用 cache-ref 元素来引用另一个缓存。

```xml
<cache-ref namespace="com.someone.application.data.SomeMapper"/>
```

<a id="markdown-16-插件" name="16-插件"></a>
## 1.6. 插件
<a href="#menu" style="float:right">目录</a>

前言
MyBatis开放用户实现自己的插件，从而对整个调用过程进行个性化扩展。
这是MyBatis整个调用流程的主要参与者。
我们可以对其中的一些过程进行拦截，添加自己的功能，比如重写Sql添加分页参数。

![](https://img2018.cnblogs.com/blog/1404294/201906/1404294-20190610164312882-425922091.png)
 

<a id="markdown-161-拦截的接口" name="161-拦截的接口"></a>
### 1.6.1. 拦截的接口
MyBatis允许拦截的接口如下

Executor

```java
public interface Executor {
    ResultHandler NO_RESULT_HANDLER = null;
    int update(MappedStatement var1, Object var2) throws SQLException;
    <E> List<E> query(MappedStatement var1, Object var2, RowBounds var3, ResultHandler var4, CacheKey var5, BoundSql var6) throws SQLException;
    <E> List<E> query(MappedStatement var1, Object var2, RowBounds var3, ResultHandler var4) throws SQLException;
    <E> Cursor<E> queryCursor(MappedStatement var1, Object var2, RowBounds var3) throws SQLException;
    List<BatchResult> flushStatements() throws SQLException;
    void commit(boolean var1) throws SQLException;
    void rollback(boolean var1) throws SQLException;
    CacheKey createCacheKey(MappedStatement var1, Object var2, RowBounds var3, BoundSql var4);
    boolean isCached(MappedStatement var1, CacheKey var2);
    void clearLocalCache();
    void deferLoad(MappedStatement var1, MetaObject var2, String var3, CacheKey var4, Class<?> var5);
    Transaction getTransaction();
    void close(boolean var1);
    boolean isClosed();
    void setExecutorWrapper(Executor var1);
}
```
 

ParameterHandler
```java
public interface ParameterHandler {
    Object getParameterObject();

    void setParameters(PreparedStatement var1) throws SQLException;
}
```

ResultSetHandler
```java
public interface ResultSetHandler {
    <E> List<E> handleResultSets(Statement var1) throws SQLException;

    <E> Cursor<E> handleCursorResultSets(Statement var1) throws SQLException;

    void handleOutputParameters(CallableStatement var1) throws SQLException;
}
```
 

StatementHandler

```java
public interface StatementHandler {
    Statement prepare(Connection var1, Integer var2) throws SQLException;
    void parameterize(Statement var1) throws SQLException;
    void batch(Statement var1) throws SQLException;
    int update(Statement var1) throws SQLException;
    <E> List<E> query(Statement var1, ResultHandler var2) throws SQLException;
    <E> Cursor<E> queryCursor(Statement var1) throws SQLException;
    BoundSql getBoundSql();
    ParameterHandler getParameterHandler();
}
```
 

只要拦截器定义了拦截的接口和方法，后续调用该方法时，将会被拦截。

<a id="markdown-162-拦截器实现" name="162-拦截器实现"></a>
### 1.6.2. 拦截器实现
如果要实现自己的拦截器，需要实现接口Interceptor

```java
@Slf4j
@Intercepts(@Signature(type = Executor.class,
        method ="update",
        args ={MappedStatement.class,Object.class} ))
public class MyIntercetor implements Interceptor {


    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        log.info("MyIntercetor ...");

        Object result = invocation.proceed();

        log.info("result = " + result);

        return result;
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(o,this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
```
* intercept
    * 将直接覆盖你所拦截对象原有的方法，因此它是插件的核心方法。通过Invocation可以反射调度原来对象的方法。
* plugin
    * target是被拦截的对象，它的作用是给被拦截的对象生成一个代理对象，并返回它。
* setProperties
    * 允许在pluin元素中配置所需参数，方法在插件初始化就被调用了一次，然后把插件对象存入到配置中，以便以后取出来。

1. 拦截方法配置

Intercepts,Signature
```java
public @interface Intercepts {
    Signature[] value();
}
public @interface Signature {
    Class<?> type();

    String method();

    Class<?>[] args();
}
```

配置
```java
@Intercepts(@Signature(type = Executor.class,
        method ="update",
        args ={MappedStatement.class,Object.class} ))
```

我们知道Java中方法的签名包括所在的类，方法名称，入参。 

@Signature定义方法签名

type：拦截的接口，为上节定义的四个接口

method:拦截的接口方法

args:参数类型列表，需要和方法中定义的顺序一致。

 也可以配置多个
```java
@Intercepts({@Signature(
    type = Executor.class,
    method = "query",
    args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}
), @Signature(
    type = Executor.class,
    method = "query",
    args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class}
)})
```

2. intercept(Invocation invocation)

```java
public class Invocation {
    private final Object target;
    private final Method method;
    private final Object[] args;

    public Invocation(Object target, Method method, Object[] args) {
        this.target = target;
        this.method = method;
        this.args = args;
    }

    public Object getTarget() {
        return this.target;
    }

    public Method getMethod() {
        return this.method;
    }

    public Object[] getArgs() {
        return this.args;
    }

    public Object proceed() throws InvocationTargetException, IllegalAccessException {
        return this.method.invoke(this.target, this.args);
    }
}
```
 

通过Invocation可以获取到被拦截的方法的调用对象，方法，参数。

proceed()用于继续执行并获得最终的结果。

这里使用了设计模式中的责任链模式。

 

3. 这里不能返回null。

用于给被拦截的对象生成一个代理对象，并返回它。
```java
@Override
    public Object plugin(Object o) {
        return Plugin.wrap(o,this);
    }
```
 可以看下wrap方法，其实现了JDK的接口InvocationHandler，也就是为传入的target创建了一个代理对象。这里使用了JDK动态代理方式。也可以自己实现其他代理方式，比如cglib.

```java
    public class Plugin implements InvocationHandler {
    private final Object target;
    private final Interceptor interceptor;
    private final Map<Class<?>, Set<Method>> signatureMap;
　　 public static Object wrap(Object target, Interceptor interceptor) {
        Map<Class<?>, Set<Method>> signatureMap = getSignatureMap(interceptor);
        Class<?> type = target.getClass();
        Class<?>[] interfaces = getAllInterfaces(type, signatureMap);
        return interfaces.length > 0 ? Proxy.newProxyInstance(type.getClassLoader(), interfaces, new Plugin(target, interceptor, signatureMap)) : target;
    }

　　
　　public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    try {
        Set<Method> methods = (Set)this.signatureMap.get(method.getDeclaringClass());
        return methods != null && methods.contains(method) ? this.interceptor.intercept(new Invocation(this.target, method, args)) : method.invoke(this.target, args);
    } catch (Exception var5) {
        throw ExceptionUtil.unwrapThrowable(var5);
    }
 }

}
```

由于使用了动态代理，方法执行时，将会被调用invoke方法，会先判断是否设置了拦截器：methods != null && methods.contains(method)，

如果设置了拦截器，则调用拦截器this.interceptor.intercept(new Invocation(this.target, method, args))

否则直接调用method.invoke(this.target, args);

 

 

4. 拦截器在执行前输出"MyIntercetor ..."，在数据库操作返回后输出"result =xxx"

       log.info("MyIntercetor ...");
        Object result = invocation.proceed();
        log.info("result = " + result); 

插件实现完成！

**测试**
在Spring中引入很简单。

第一种方式:

创建拦截器的bean

```java
@Slf4j
@Configuration
public class IntercetorConfiguration {

    @Bean
    public MyIntercetor myIntercetor(){
        return new MyIntercetor();
    }

}
```
注意第一种方式和第二种方式仅适用于SpringBoot应用，并且引入以下依赖

```xml
<dependency>
      <groupId>org.mybatis.spring.boot</groupId>
      <artifactId>mybatis-spring-boot-starter</artifactId>
      <version>1.3.2</version>
</dependency>
```
第二种方式

手动往Configuration中添加拦截器。

```java
@Slf4j
@Configuration
public class IntercetorConfiguration {
  @Autowired
    private List<SqlSessionFactory> sqlSessionFactoryList;

    @PostConstruct
    public void addPageInterceptor() {
        MyIntercetor interceptor = new MyIntercetor();

        Iterator var3 = this.sqlSessionFactoryList.iterator();

        while(var3.hasNext()) {
            SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)var3.next();
            sqlSessionFactory.getConfiguration().addInterceptor(interceptor);
        }

    }
}
```
 第三种方式

如果是纯Spring应用，可在mybatis配置文件中配置

```xml
<plugins>
    <plugin   intercetor="xxx.xxx.MyIntercetor">
            <property   name="xxx"  value="xxx">
    </plugin>
</plugins>
```

由于上面定义的拦截器是拦截Executor的update方法，所以在执行insert,update,delete的操作时，将会被拦截。

本例子使用insert来测试。具体代码查看：GitHub
```
2019-06-10 16:08:03.109  INFO 20410 --- [nio-8110-exec-1] c.m.user.dao.intercetor.MyIntercetor     : MyIntercetor ...

2019-06-10 16:08:03.166  INFO 20410 --- [nio-8110-exec-1] com.alibaba.druid.pool.DruidDataSource   : {dataSource-1} inited
2019-06-10 16:08:03.267 DEBUG 20410 --- [nio-8110-exec-1] o.m.s.t.SpringManagedTransaction         : JDBC Connection [com.mysql.cj.jdbc.ConnectionImpl@5cb1c36e] will not be managed by Spring
2019-06-10 16:08:03.274 DEBUG 20410 --- [nio-8110-exec-1] c.m.u.dao.mapper.UserMapper.insertList   : ==>  Preparing: insert into user (name) values (?) , (?) , (?) 
2019-06-10 16:08:03.307 DEBUG 20410 --- [nio-8110-exec-1] c.m.u.dao.mapper.UserMapper.insertList   : ==> Parameters: name:58(String), name:64(String), name:69(String)
2019-06-10 16:08:03.355 DEBUG 20410 --- [nio-8110-exec-1] c.m.u.dao.mapper.UserMapper.insertList   : <==    Updates: 3
2019-06-10 16:08:03.358 DEBUG 20410 --- [nio-8110-exec-1] c.m.u.d.m.U.insertList!selectKey         : ==>  Preparing: SELECT LAST_INSERT_ID() 
2019-06-10 16:08:03.358 DEBUG 20410 --- [nio-8110-exec-1] c.m.u.d.m.U.insertList!selectKey         : ==> Parameters: 
2019-06-10 16:08:03.380 DEBUG 20410 --- [nio-8110-exec-1] c.m.u.d.m.U.insertList!selectKey         : <==      Total: 1


2019-06-10 16:08:03.381  INFO 20410 --- [nio-8110-exec-1] c.m.user.dao.intercetor.MyIntercetor     : result = 3
```
 

可以看到拦截器被调用了。

简单的分页插件实现
这里拦截StatementHandler的prepare方法，也就是SQL语句预编译之前进行SQL改写。

```java
@Slf4j
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class})})
public class PageIntercetor implements Interceptor {


    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        log.info("StatementHandler  prepare ...");

        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();

        ParameterHandler parameterHandler = statementHandler.getParameterHandler();
        BoundSql boundSql = statementHandler.getBoundSql();
        //获取到原始sql语句
        String sql = boundSql.getSql();
        String mSql = sql + " limit 0,1";
        //通过反射修改sql语句
        Field field = boundSql.getClass().getDeclaredField("sql");
        field.setAccessible(true);
        field.set(boundSql, mSql);

        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        //此处可以接收到配置文件的property参数
        System.out.println(properties.getProperty("name"));
    }

}
```
分页插件实现的难点在于当使用不同的Statement时，执行流程是不一样的。

Statement需要定义statementType="STATEMENT"，这个时候SQL语句不需要进行预编译处理，参数是与xml中配饰的SQL语句拼接在一起的。

```xml
<select id="select" resultMap="BaseResultMap" statementType="STATEMENT">
  select id, name
  from user
  where
    name = '${name}'
</select>
``` 

而当使用PreparedStatement时需要定义statementType="PREPARED"，这个时候SQL语句需要进行预编译处理。CallableStatement(用于调用存储过程)同理。

```xml
  <select id="select" resultMap="BaseResultMap" statementType="PREPARED">
    select id, name
    from user
    where
      name = #{name}
  </select>
```

<a id="markdown-17-代码生成器" name="17-代码生成器"></a>
## 1.7. 代码生成器
<a href="#menu" style="float:right">目录</a>

<a id="markdown-171-创建需要生成的数据表" name="171-创建需要生成的数据表"></a>
### 1.7.1. 创建需要生成的数据表
<a href="#menu" style="float:right">目录</a>

数据表结构
```sql
CREATE TABLE `scheduler` (
  `scheduler_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '任务ID',
  `name` varchar(30) DEFAULT NULL COMMENT '任务名称',
  `groud` varchar(30) DEFAULT NULL COMMENT '任务所在的组',
  `cron` varchar(100) DEFAULT NULL COMMENT '任务时间表达式',
  `create` datetime DEFAULT NULL COMMENT '任务创建时间',
  PRIMARY KEY (`scheduler_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='任务调度表'
```

<a id="markdown-172-创建mybatis代码自动生成配置文件" name="172-创建mybatis代码自动生成配置文件"></a>
### 1.7.2. 创建Mybatis代码自动生成配置文件
<a href="#menu" style="float:right">目录</a>

默认名称为：generatorConfig.xml
该配置文件适用于Mysql，其他数据库未进行测试。 
使用该配置文件需要修改的地方 
1. jdbcConnection ：数据库名称，用户名，密码。 
2. targetPackage ：生成代码的目录 
3. table 需要生成的数据表 
4. 如果是用在Eclipse上，targetProject=”src/main/java/“ 应当修改为 targetProject=”项目名称/src/main/java/”，IDEA不需要工程名称。

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE generatorConfiguration
        PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">

<generatorConfiguration>
    <!-- <classPathEntry location="F:\.m2\repository\mysql\mysql-connector-java\5.1.38\mysql-connector-java-5.1.38.jar"/> -->
    <classPathEntry location="/home/lgj/.m2/repository/mysql/mysql-connector-java/5.1.29/mysql-connector-java-5.1.29.jar"/>
    <context id="MySqlContext" targetRuntime="MyBatis3Simple" defaultModelType="flat">
        <!-- 设置数据库关键字分隔符 -->
        <property name="beginningDelimiter" value="`"/>
        <property name="endingDelimiter" value="`"/>
        <!-- 设置生成Java文件的编码 GBK或者UTF-8 -->
        <property name="javaFileEncoding" value="UTF-8"/>

        <!--配置生成注释信息，最多配置一个 -->
        <commentGenerator>
            <!-- 阻止生成注释包含时间戳 默认为false -->
            <property name="suppressDate" value="true"/>
            <!-- 注释是否添加数据库表的备注信息 默认为false -->
            <property name="addRemarkComments" value="true"/>
        </commentGenerator>
        <!-- 配置数据库连接信息 -->
        <jdbcConnection driverClass="com.mysql.jdbc.Driver"
                        connectionURL="jdbc:mysql://localhost:3306/spring_boot"
                        userId="root"
                        password="563739007">
        </jdbcConnection>
        <!-- 用来控制生成的实体类 -->
        <!-- targetPackage  生成文件存放的目录-->
        <!--
            targetProject: 
            .java 放置在src/main/java/下
        `````.xml 放置在src/main/resources/下
        -->
        <!-- targetPackage  生成文件存放的目录-->
        <javaModelGenerator targetPackage="com.ch12.dao.model"
                            targetProject="src/main/java/">
            <!-- 判断是否对数据库查询结果进行trim操作 -->
            <!-- = true则 this.userName = userName == null ? null : userName.trim(); -->
            <property name="trimStrings" value="false" />
        </javaModelGenerator>
        <!-- 设置生成Mapper.xml文件的属性 位置 可选-->
        <sqlMapGenerator targetPackage="com.ch12.dao.mapper"
                         targetProject="src/main/resources"/>
        <!-- 用于设置 接口类的属性-->
        <!--
            targetRuntime=MyBatis3:
                1.ANNOTATEDMAPPER 基于注解的MAPPER接口，不会有对应的XML文件
                2.MIXEDMAPPER xml和mapper混合形式
                3.XMLMAPPER 所有的方法都在XML中，接口调用依赖XML文件
            targetRuntime=MyBatis3Simple:
                1.ANNOTATEDMAPPER 基于注解的MAPPER接口，不会有对应的XML文件
                2.XMLMAPPER 所有的方法都在XML中，接口调用依赖XML文件
        -->
        <javaClientGenerator type="XMLMAPPER" targetPackage="com.ch12.dao.mapper"
                             targetProject="src/main/java"/>
        <!-- os_favorites  os_receipt_address  os_receipt_address os_user_login   -->
        <!-- 可以配置多个table,每个表单独配置-->
        <!-- type="post" identity="true" :  ORDER = AFTER -->
        <!-- type="pre" identity="false"(only  the value) : ORDER = BEFORE -->
        <!-- 配置需要生成的表 ，如果需要执行时返回主键，就设置generatedKey-->
        <table tableName="scheduler">
            <generatedKey column="scheduler_id" sqlStatement="MySql"/>
        </table>
    </context>
</generatorConfiguration>
```

配置Maven插件
工程pom文件中添加插件

```xml
 <!-- mybatis generator 自动生成代码插件 -->
 <plugin>
     <groupId>org.mybatis.generator</groupId>
     <artifactId>mybatis-generator-maven-plugin</artifactId>
     <version>1.3.2</version>
     <configuration>
<!--注意这里的 resources/generator/generatorConfig.xml 要与你上面的命名和放置的位置匹配-->
    <configurationFile>${basedir}/src/main/resources/generator/generatorConfig.xml</configurationFile>
         <overwrite>true</overwrite>
         <verbose>true</verbose>
     </configuration>
 </plugin>
```

<a id="markdown-173-配置运行" name="173-配置运行"></a>
### 1.7.3. 配置运行
<a href="#menu" style="float:right">目录</a>

选择Maven选项。 
working directory选择你的工程目录。 
Command line 填入：mybatis-generator:generate -e 
最后确认并运行即可。 
![](https://img-blog.csdn.net/20180705150605755?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTE2NzYzMDA=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

运行后出现BUILD SUCCESS说明生成成功，找到相应目录即可发现代码和配置文件已经生成。

```
[INFO] Generating Record class for table scheduler
[INFO] Generating Mapper Interface for table scheduler
[INFO] Generating SQL Map for table scheduler
[INFO] Saving file SchedulerMapper.xml
[INFO] Saving file Scheduler.java
[INFO] Saving file SchedulerMapper.java
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.364 s
[INFO] Finished at: 2018-07-05T14:42:05+08:00
[INFO] Final Memory: 14M/48M
[INFO] ------------------------------------------------------------------------
```

<a id="markdown-18-mybatis整体架构" name="18-mybatis整体架构"></a>
## 1.8. Mybatis整体架构

<a href="#menu" style="float:right">目录</a>



MyBatis 的整体架构分为三层 ， 分别是基础支持层 、 核心处理层和接口层
![MyBatis 的整体架构](https://github.com/lgjlife/Java-Study/blob/master/pic/mybatis/mybatis.png?raw=true)

<a id="markdown-181-基础支持层" name="181-基础支持层"></a>
### 1.8.1. 基础支持层
<a href="#menu" style="float:right">目录</a>

基础支持层包含整个 MyBatis 的基础模块，这些模块为核心处理层的功能提供了良好的支
撑。 下面简单描述各个模块的功能，在第 2 章将会详细分析基础支持层中每个模块的实现原理 。

* **反射模块**
Java 中的反射虽然功能强大，但对大多数开发人员来说，写出高质量的反射代码还是有一定难度的 。 MyBatis 中专门提供了反射模块，该模块对 Java 原生的反射进行了良好的封装，提供了更加简洁易用的 API，方便上层使调用，并且对反射操作进行了一系列优化，例如缓存了类的元数据，提高了反射操作的性能 。

* **类型转换模块**
正如前面示例所示， MyBatis 为简化配置文件提供了别名机制 ， 该机制是类型转换模块的主要功能之一 。 类型转换模块的另一个功能是实现 JDBC 类型与 Java 类型之间的转换，该功能在为 SQL 语句绑定实参以及映射查询结果集时都会涉及。在为 SQL 语句绑定实参时， 会将数据由 Java 类型转换成 JDBC 类型；而在映射结果集时，会将数据由 JDBC 类型转换成 Java 类型。类型转换模块的

* **日志模块**
无论在开发测试环境中，还是在线上生产环境中，日志在整个系统中的地位都是非常重要的。良好的日志功能可以帮助开发人员和测试人员快速定位 Bug 代码，也可以帮助运维人员快速定位性能瓶颈、等问题 。 目前的 Java 世界中存在很多优秀的日志框架，例如 Log4j 、 Log4j2, slf4j 等 。 MyBatis 作为一个设计优良的框架，除了提供详细的日志输出信息，还要能够集成多种日志框架，其日志模块的一个主要功能就是集成第三方日志框架。

* **资源加载模块**
资源加载模块主要是对类加载器进行封装，确定类加载器的使用顺序，并提供了加载类文件以及其他资源文件的功能 。

* **解析器模块**
解析器模块的主要提供了两个功能 ： 一个功能是对 XPath 进行封装，为 MyBatis 初始化时解析 mybatis-config.xml 配置文件以及映射配置文件提供支持；另一个功能是为处理动态 SQL 语句中的占位符提供支持。

* **数据源模块**
数据源是实际开发中常用的组件之一。 现在开源的数据源都提供了比较丰富的功能，例如，连接池功能、检测连接状态等，选择性能优秀的数据源组件对于提升 ORM 框架乃至整个应用的性能都是非常重要的。 MyBatis 自身提供了相应的数据源实现，当然 MyBatis 也提供了与第三方数据源集成的接口，这些功能都位于数据源模块之中 。

* **事务管理**
MyBatis 对数据库中的事务进行了抽象，其自身提供了相应的事务接口和简单实现。在很多场景中， MyBatis 会与 Spring 框架集成，并由 Spring 框架管理事务


* **缓存模块**
在优化系统性能时 ，优化数据库性能是非常重要的一个环节，而添加缓存则是优化数据库时最有效的手段之一。正确、合理地使用缓存可以将一部分数据库请求拦截在缓存这一层，如图 1-4 所示，这就能够减少相当一部分数据库的压力。MyBatis 中提供了一级缓存和二级缓存，而这两级缓存都是依赖于基础支持层中的缓存模块实现的。这里需要读者注意的是， MyBatis 中自带的这两级缓存与MyBatis 以及整个应用是运行在同一个 川币4 中的，共享同一块堆内存。如果这两级缓存中的数据量较大， 则可能影响系统中其他功能的运行，所以当需要缓存大量数据时 ，优先考虑使用 Redis 、 Memcache 等缓存产品。

* **Binding 模块**
通过前面的示例我们知道，在调用 SqISession 相应方法执行数据库操作时，需要指定映射文件中定义的 SQL 节点，如果出现拼写错误，我们只能在运行时才能发现相应的异常 。 为了尽早发现这种错误， MyBatis 通过 Binding 模块将用户自定义的 Mapper 接口与映射配置文件关联起来，系统可以通过调用自定义 Mapper 接口中的方法执行相应
的 SQL 语句完成数据库操作，从而避免上述问题。

值得读者注意的是，开发人员无须编写自定义 Mapper 接口的实现， MyBatis 会自动为其创建动态代理对象 。在有些场景中，自定义Mapper接口可以完全代替映射配置文件，但有的映射规则和 SQL 语句的定义还是写在映射配置文件中比较方便，例如动态 SQL语句的定义 。

<a id="markdown-182-核心处理层" name="182-核心处理层"></a>
### 1.8.2. 核心处理层
<a href="#menu" style="float:right">目录</a>

介绍完 MyBatis 的基础支持层之后，我们来分析 MyBatis 的核心处理层。在核心处理层中实现了MyBatis的核心处理流程，其中包括MyBatis 的初始化以及完成一次数据库操作的涉及的全部流程 。

* **配置解析**
在 MyBatis 初始化过程中，会加载 mybatis-config.xml 配置文件、映射配置文件以及Mapper 接口中的注解信息，解析后的配置信息会形成相应的对象并保存到Configuration 对象中 。 例如，示例中定义的＜resultMap＞节点（即 ResultSet 的映射规则）会被解析成 ResultMap 对象：示例中定义的＜result>节点（即属性映射）会被解析成ResultMapping 对象 。 之后，利用该 Configuration 对象创建 Sq!SessionFactory 对象 。待 MyBatis 初始化之后，开发人员可以通过初始化得到 Sq!SessionFactory 创建Sq!Session 对象并完成数据库操作。

* **SOL 解析与 scripting 模块**
拼凑 SQL 语句是一件烦琐且易出错的过程，为了将开发人员从这项枯燥无趣的工作中解脱出来， MyBatis 实现动态 SQL 语句的功能，提供了多种动态 SQL 语句对应的节点，例如，＜where＞节点、＜if>节点、＜foreach＞节点等。通过这些节点的组合使用， 开发人员可以写出几乎满足所有需求的动态 SQL 语句。MyBatis 中的 scripting 模块会根据用户传入的实参，解析映射文件中定义的动态 SQL节点，并形成数据库可执行的 SQL 语句 。之后会处理 SQL 语句中的占位符，绑定用户传入的实参。

* **SOL 执行**
SQL 语句的执行涉及多个组件 ，其中比较重要的是 Executor 、 StatementHandler 、ParameterHandler 和 R巳sultSetHandler 。 Executor 主要负责维护一级缓存和二级缓存，并提供事务管理的相关操作 ，它会将数据库相关操作委托给 StatementHandler 完成。StatementHandler 首先通过 ParameterHandler 完成 SQL 语句的实参绑定，然后通过java.sql.Statement 对象执行 SQL 语句并得到结果集，最后通过 ResultSetHandler 完成结果集的映射，得到结果对象并返回 。图 1-5 展示了 MyBatis 执行一条 SQL 语句的大致过程。

* **插件**
Mybatis 自身的功能虽然强大，但是并不能完美切合所有 的应用场景，因此 MyBatis提供了插件接口，我们可以通过添加用户自定义插件的方式对 MyBati s 进行扩展。用户自定义插件也可以改变 Mybatis 的默认行为，例如，我们可以拦截 SQL 语句并对其进行重写。由于用户自定义插件会影响 MyBatis 的核心行为，在使用自定义插件之前，开发人员需要了解 MyBatis 内部的原理，这样才能编写出安全、高效的插件。

![SQL执行流程](https://github.com/lgjlife/Java-Study/blob/master/pic/mybatis/mybatis-excute-sql.png?raw=true)

<a id="markdown-183-接口层" name="183-接口层"></a>
### 1.8.3. 接口层
<a href="#menu" style="float:right">目录</a>

接口层相对简单，其核心是 SqlSession 接口，该接口中定义了 MyBatis 暴露给应用程序调用的 API，也就是上层应用与 MyBatis 交互的桥梁。接口层在接收到调用请求时，会调用核心处理层的相应模块来完成具体的数据库操作

<a id="markdown-184-模块说明" name="184-模块说明"></a>
### 1.8.4. 模块说明
<a href="#menu" style="float:right">目录</a>

* SqlSession 作为MyBatis工作的主要顶层API，表示和数据库交互的会话，完成必要数据库增删改查功能
* Executor MyBatis执行器，是MyBatis 调度的核心，负责SQL语句的生成和查询缓存的维护
* StatementHandler 封装了JDBC Statement操作，负责对JDBCstatement的操作，如设置参数、将Statement结果集转换成List集合。
* ParameterHandler 负责对用户传递的参数转换成JDBC Statement 所需要的参数
* ResultSetHandler *负责将JDBC返回的ResultSet结果集对象转换成List类型的集合；
* TypeHandler 负责java数据类型和jdbc数据类型之间的映射和转换
* MappedStatement MappedStatement维护了一条select|update|delete|insert节点的封装
* SqlSource 负责根据用户传递的parameterObject，动态地生成SQL语句，将信息封装到BoundSql对象中，并返回
* BoundSql 表示动态生成的SQL语句以及相应的参数信息
* Configuration MyBatis所有的配置信息都维持在Configuration对象之中

<span id="menu" >

<a id="markdown-2-redis" name="2-redis"></a>
# 2. Redis
<a href="#menu" style="float:right">目录</a>

<a id="markdown-21-数据结构和对象" name="21-数据结构和对象"></a>
## 2.1. 数据结构和对象
<a href="#menu" style="float:right">目录</a>


<a id="markdown-211-简单动态字符串" name="211-简单动态字符串"></a>
### 2.1.1. 简单动态字符串
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
        

<a id="markdown-212-链表" name="212-链表"></a>
### 2.1.2. 链表
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


<a id="markdown-213-字典" name="213-字典"></a>
### 2.1.3. 字典
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
<a id="markdown-2131-rehash" name="2131-rehash"></a>
#### 2.1.3.1. Rehash

<a href="#menu" style="float:right">目录</a>

* 为了让哈希表的负载因子维持在一个合理的范围内，需要对字典表进行重新扩展或者收缩


<a id="markdown-214-跳跃表" name="214-跳跃表"></a>
### 2.1.4. 跳跃表
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

<a id="markdown-215-整数集合" name="215-整数集合"></a>
### 2.1.5. 整数集合
<a href="#menu" style="float:right">目录</a>


<a id="markdown-216-压缩列表" name="216-压缩列表"></a>
### 2.1.6. 压缩列表
<a href="#menu" style="float:right">目录</a>

* 压缩列表是列表键和哈希键的底层实现之一


<a id="markdown-217-对象" name="217-对象"></a>
### 2.1.7. 对象
<a href="#menu" style="float:right">目录</a>

* 前面章节介绍了Redis所有的主要数结构，但是Redis并没有使用这些数据结构来实现键值对数据库。而是基于这些数据结构创建不同的对象。
* 字符串对象，列表对象，哈希对象，集合对象，无序集合对象。
* 每种对象至少使用了前面一种数据结构实现
* Redis在执行命令之前，会根据对象的类型来判断是否可以执行给定的命令
* 使用对象可以针对不同的应用场景，为对象设置多种不同的数据结构实现，从而优化对象在不同场景下的使用效率。
* Redis的垃圾回收是基于引用计数器实现

<a id="markdown-2171-对象类型和编码" name="2171-对象类型和编码"></a>
#### 2.1.7.1. 对象类型和编码
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2172-字符串对象" name="2172-字符串对象"></a>
#### 2.1.7.2. 字符串对象
<a href="#menu" style="float:right">目录</a>


<a id="markdown-2173-列表对象" name="2173-列表对象"></a>
#### 2.1.7.3. 列表对象
<a href="#menu" style="float:right">目录</a>


<a id="markdown-2174-哈希对象" name="2174-哈希对象"></a>
#### 2.1.7.4. 哈希对象
<a href="#menu" style="float:right">目录</a>


<a id="markdown-2175-集合对象" name="2175-集合对象"></a>
#### 2.1.7.5. 集合对象 
<a href="#menu" style="float:right">目录</a>


<a id="markdown-2176-由于集合对象" name="2176-由于集合对象"></a>
#### 2.1.7.6. 由于集合对象
<a href="#menu" style="float:right">目录</a>


<a id="markdown-2177-类型检查和命令多态" name="2177-类型检查和命令多态"></a>
#### 2.1.7.7. 类型检查和命令多态
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2178-内存回收" name="2178-内存回收"></a>
#### 2.1.7.8. 内存回收
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2179-对象共享" name="2179-对象共享"></a>
#### 2.1.7.9. 对象共享
<a href="#menu" style="float:right">目录</a>

<a id="markdown-21710-对象空转时长" name="21710-对象空转时长"></a>
#### 2.1.7.10. 对象空转时长
<a href="#menu" style="float:right">目录</a>


<a id="markdown-22-单机数据库实现" name="22-单机数据库实现"></a>
## 2.2. 单机数据库实现
<a href="#menu" style="float:right">目录</a>


<a id="markdown-221-数据库" name="221-数据库"></a>
### 2.2.1. 数据库
<a href="#menu" style="float:right">目录</a>


<a id="markdown-222-rdb持久化" name="222-rdb持久化"></a>
### 2.2.2. RDB持久化
<a href="#menu" style="float:right">目录</a>


<a id="markdown-223-aof持久化" name="223-aof持久化"></a>
### 2.2.3. AOF持久化
<a href="#menu" style="float:right">目录</a>


<a id="markdown-224-事件" name="224-事件"></a>
### 2.2.4. 事件
<a href="#menu" style="float:right">目录</a>


<a id="markdown-225-客户端" name="225-客户端"></a>
### 2.2.5. 客户端
<a href="#menu" style="float:right">目录</a>


<a id="markdown-226-服务器" name="226-服务器"></a>
### 2.2.6. 服务器
<a href="#menu" style="float:right">目录</a>


<a id="markdown-23-多机数据库实现" name="23-多机数据库实现"></a>
## 2.3. 多机数据库实现
<a href="#menu" style="float:right">目录</a>


<a id="markdown-231-复制" name="231-复制"></a>
### 2.3.1. 复制
<a href="#menu" style="float:right">目录</a>

<a id="markdown-232-哨兵" name="232-哨兵"></a>
### 2.3.2. 哨兵
<a href="#menu" style="float:right">目录</a>


<a id="markdown-233-集群" name="233-集群"></a>
### 2.3.3. 集群
<a href="#menu" style="float:right">目录</a>


<a id="markdown-24-独立功能实现" name="24-独立功能实现"></a>
## 2.4. 独立功能实现
<a href="#menu" style="float:right">目录</a>


<a id="markdown-241-发布与订阅" name="241-发布与订阅"></a>
### 2.4.1. 发布与订阅
<a href="#menu" style="float:right">目录</a>


<a id="markdown-242-事务" name="242-事务"></a>
### 2.4.2. 事务
<a href="#menu" style="float:right">目录</a>


<a id="markdown-243-lua脚本" name="243-lua脚本"></a>
### 2.4.3. LUA脚本
<a href="#menu" style="float:right">目录</a>



<a id="markdown-244-排序" name="244-排序"></a>
### 2.4.4. 排序
<a href="#menu" style="float:right">目录</a>


<a id="markdown-245-二进制位数组" name="245-二进制位数组"></a>
### 2.4.5. 二进制位数组
<a href="#menu" style="float:right">目录</a>



<a id="markdown-246-慢查询日志" name="246-慢查询日志"></a>
### 2.4.6. 慢查询日志
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
    

<a id="markdown-247-监视器" name="247-监视器"></a>
### 2.4.7. 监视器
<a href="#menu" style="float:right">目录</a>




<span id="menu"></span>

<a href="#menu" style="float:right">目录</a>

<a id="markdown-3-nginx" name="3-nginx"></a>
# 3. Nginx

<a id="markdown-31-概述" name="31-概述"></a>
## 3.1. 概述
<a href="#menu" style="float:right">目录</a>

<a id="markdown-311-功能特性" name="311-功能特性"></a>
### 3.1.1. 功能特性
<a href="#menu" style="float:right">目录</a>

* 基本服务
    * 处理静态文件，处理索引文件以及支持自动索引
    * 打开并自行管理文件描述符缓存
    * 提供**反向代理**服务,并且可以使用缓存加速反向代理 ，同时完成简单的**负载均衡**和容错
    * 提供远程FastCGI服务的缓存机制，加速访问，同时完成简单的负载均衡和容错
    * 使用Nginx的模块化提供过滤功能，基本过滤器包括gzip压缩，ranges支持，chunked响应，XSLT，SSI以及图像缩放等
    * 支持HTTP下的安全套接层安全协议SSL
* 高级服务
    * 支持基于名字和IP的虚拟主机设置
    * 支持HTTP1.0中的KEEP-ALIVE模式和管线（PipeLined）模型连接
    * 支持重新加载配置和在线升级等，无需中断正在执行的请求
    * 自定义访问日志格式，带缓存的日志操作以及快速日志轮转
    * 提供3xx~5xx错误代码**重定向**功能
    * 支持重写模块扩展
    * 支持HTTP DAV模块
    * 支持FLV流和MP4流传输
    * 支持网络控制，限流
    * 支持嵌入Perl语言
* 邮件代理服务

<a id="markdown-312-nginx快速理解" name="312-nginx快速理解"></a>
### 3.1.2. Nginx快速理解

**什么是nginx,它的优势和功能？**
* Nginx是一个高性能的 HTTP 和 反向代理 服务器，也是一个 IMAP/POP3/SMTP 代理服务器。因它的稳定性、丰富的功能集、示例配置文件和低系统资源的消耗而闻名。2011年6月1日，nginx 1.0.4发布。
* 优点：
    * 更快
        * 这表现在两个方面：一方面，在正常情况下，单次请求会得到更快的响应；另一方面，在高峰期（如有数以万计的并发请求），Nginx可以比其他Web服务器更快地响应请求。
    * 高扩展性，跨平台
        * Nginx的设计极具扩展性，它完全是由多个不同功能、不同层次、不同类型且耦合度极低的模块组成。因此，当对某一个模块修复Bug或进行升级时，可以专注于模块自身，无须在意其他。而且在HTTP模块中，还设计了HTTP过滤器模块：一个正常的HTTP模块在处理完请求后，会有一串HTTP过滤器模块对请求的结果进行再处理。这样，当我们开发一个新的HTTP模块时，不但可以使用诸如HTTP核心模块、events模块、log模块等不同层次或者不同类型的模块，还可以原封不动地复用大量已有的HTTP过滤器模块。这种低耦合度的优秀设计，造就了Nginx庞大的第三方模块，当然，公开的第三方模块也如官方发布的模块一样容易使用。
        Nginx的模块都是嵌入到二进制文件中执行的，无论官方发布的模块还是第三方模块都是如此。这使得第三方模块一样具备极其优秀的性能，充分利用Nginx的高并发特性，因此，许多高流量的网站都倾向于开发符合自己业务特性的定制模块。
    * 高可靠性：用于反向代理，宕机的概率微乎其微
        * 高可靠性是我们选择Nginx的最基本条件，因为Nginx的可靠性是大家有目共睹的，很多家高流量网站都在核心服务器上大规模使用Nginx。Nginx的高可靠性来自于其核心框架代码的优秀设计、模块设计的简单性；另外，官方提供的常用模块都非常稳定，每个worker进程相对独立，master进程在1个worker进程出错时可以快速“拉起”新的worker子进程提供服务。

    * 低内存消耗
        * 一般情况下，10 000个非活跃的HTTP Keep-Alive连接在Nginx中仅消耗2.5MB的内存，这是Nginx支持高并发连接的基础。
    * 单机支持10万以上的并发连接
        * 这是一个非常重要的特性！随着互联网的迅猛发展和互联网用户数量的成倍增长，各大公司、网站都需要应付海量并发请求，一个能够在峰值期顶住10万以上并发请求的Server，无疑会得到大家的青睐。理论上，Nginx支持的并发连接上限取决于内存，10万远未封顶。当然，能够及时地处理更多的并发请求，是与业务特点紧密相关的。
    * 热部署
        * master管理进程与worker工作进程的分离设计，使得Nginx能够提供热部署功能，即可以在7×24小时不间断服务的前提下，升级Nginx的可执行文件。当然，它也支持不停止服务就更新配置项、更换日志文件等功能。
    * 最自由的BSD许可协议
        * 这是Nginx可以快速发展的强大动力。BSD许可协议不只是允许用户免费使用Nginx，它还允许用户在自己的项目中直接使用或修改Nginx源码，然后发布。这吸引了无数开发者继续为Nginx贡献自己的智慧。
以上7个特点当然不是Nginx的全部，拥有无数个官方功能模块、第三方功能模块使得Nginx能够满足绝大部分应用场景，这些功能模块间可以叠加以实现更加强大、复杂的功能，有些模块还支持Nginx与Perl、Lua等脚本语言集成工作，大大提高了开发效率。这些特点促使用户在寻找一个Web服务器时更多考虑Nginx。
----------------------
**Nginx的模块与工作原理是什么?**
Nginx由内核和模块组成，其中，内核的设计非常微小和简洁，完成的工作也非常简单，仅仅通过查找配置文件将客户端请求映射到一个location block（location是Nginx配置中的一个指令，用于URL匹配），而在这个location中所配置的每个指令将会启动不同的模块去完成相应的工作。 
Nginx的模块从结构上分为核心模块、基础模块和第三方模块：
* 核心模块：HTTP模块、EVENT模块和MAIL模块
* 基础模块：HTTP Access模块、HTTP FastCGI模块、HTTP
* 第三方模块：HTTP Upstream Request Hash模块、Notice模块和HTTPAccess Key模块。

用户根据自己的需要开发的模块都属于第三方模块。正是有了这么多模块的支撑，Nginx的功能才会如此强大。 

Nginx的模块从功能上分为如下三类：
* Handlers（处理器模块）。此类模块直接处理请求，并进行输出内容和修改headers信息等操作。Handlers处理器模块一般只能有一个。
* Filters （过滤器模块）。此类模块主要对其他处理器模块输出的内容进行修改操作，最后由Nginx输出。 Proxies（代理类模块）。此类模块是Nginx的HTTP
* Upstream之类的模块，这些模块主要与后端一些服务比如FastCGI等进行交互，实现服务代理和负载均衡等功能。

![](https://img-blog.csdn.net/20180810143236596?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI1OTM0NDAx/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

Nginx本身做的工作实际很少，当它接到一个HTTP请求时，它仅仅是通过查找配置文件将此次请求映射到一个location block，而此location中所配置的各个指令则会启动不同的模块去完成工作，因此模块可以看做Nginx真正的劳动工作者。通常一个location中的指令会涉及一个handler模块和多个filter模块（当然，多个location可以复用同一个模块）。handler模块负责处理请求，完成响应内容的生成，而filter模块对响应内容进行处理。 
Nginx的模块直接被编译进Nginx，因此属于静态编译方式。启动Nginx后，Nginx的模块被自动加载，不像Apache，首先将模块编译为一个so文件，然后在配置文件中指定是否进行加载。在解析配置文件时，Nginx的每个模块都有可能去处理某个请求，但是同一个处理请求只能由一个模块来完成

----------------------

**怎么理解Nginx的进程模型?**

在工作方式上，Nginx分为单工作进程和多工作进程两种模式。在单工作进程模式下，除主进程外，还有一个工作进程，工作进程是单线程的；在多工作进程模式下，每个工作进程包含多个线程。Nginx默认为单工作进程模式。 
Nginx在启动后，会有一个master进程和多个worker进程。 
**master进程** 
主要用来管理worker进程，包含：接收来自外界的信号，向各worker进程发送信号，监控worker进程的运行状态，当worker进程退出后(异常情况下)，会自动重新启动新的worker进程。 
master进程充当整个进程组与用户的交互接口，同时对进程进行监护。它不需要处理网络事件，不负责业务的执行，只会通过管理worker进程来实现重启服务、平滑升级、更换日志文件、配置文件实时生效等功能。 
我们要控制nginx，只需要通过kill向master进程发送信号就行了。比如kill -HUP pid，则是告诉nginx，从容地重启nginx，我们一般用这个信号来重启nginx，或重新加载配置，因为是从容地重启，因此服务是不中断的。master进程在接收到HUP信号后是怎么做的呢？首先master进程在接到信号后，会先重新加载配置文件，然后再启动新的worker进程，并向所有老的worker进程发送信号，告诉他们可以光荣退休了。新的worker在启动后，就开始接收新的请求，而老的worker在收到来自master的信号后，就不再接收新的请求，并且在当前进程中的所有未处理完的请求处理完成后，再退出。当然，直接给master进程发送信号，这是比较老的操作方式，nginx在0.8版本之后，引入了一系列命令行参数，来方便我们管理。比如，./nginx -s reload，就是来重启nginx，./nginx -s stop，就是来停止nginx的运行。如何做到的呢？我们还是拿reload来说，我们看到，执行命令时，我们是启动一个新的nginx进程，而新的nginx进程在解析到reload参数后，就知道我们的目的是控制nginx来重新加载配置文件了，它会向master进程发送信号，然后接下来的动作，就和我们直接向master进程发送信号一样了。 

![](https://img-blog.csdn.net/20180810144219311?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI1OTM0NDAx/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

而基本的网络事件，则是放在worker进程中来处理了。多个worker进程之间是对等的，他们同等竞争来自客户端的请求，各进程互相之间是独立的。一个请求，只可能在一个worker进程中处理，一个worker进程，不可能处理其它进程的请求。worker进程的个数是可以设置的，一般我们会设置与机器cpu核数一致，这里面的原因与nginx的进程模型以及事件处理模型是分不开的。 
worker进程之间是平等的，每个进程，处理请求的机会也是一样的。当我们提供80端口的http服务时，一个连接请求过来，每个进程都有可能处理这个连接，怎么做到的呢？首先，每个worker进程都是从master进程fork过来，在master进程里面，先建立好需要listen的socket（listenfd）之后，然后再fork出多个worker进程。所有worker进程的listenfd会在新连接到来时变得可读，为保证只有一个进程处理该连接，所有worker进程在注册listenfd读事件前抢accept_mutex，抢到互斥锁的那个进程注册listenfd读事件，在读事件里调用accept接受该连接。当一个worker进程在accept这个连接之后，就开始读取请求，解析请求，处理请求，产生数据后，再返回给客户端，最后才断开连接，这样一个完整的请求就是这样的了。我们可以看到，一个请求，完全由worker进程来处理，而且只在一个worker进程中处理。worker进程之间是平等的，每个进程，处理请求的机会也是一样的。当我们提供80端口的http服务时，一个连接请求过来，每个进程都有可能处理这个连接，怎么做到的呢？首先，每个worker进程都是从master进程fork过来，在master进程里面，先建立好需要listen的socket（listenfd）之后，然后再fork出多个worker进程。所有worker进程的listenfd会在新连接到来时变得可读，为保证只有一个进程处理该连接，所有worker进程在注册listenfd读事件前抢accept_mutex，抢到互斥锁的那个进程注册listenfd读事件，在读事件里调用accept接受该连接。当一个worker进程在accept这个连接之后，就开始读取请求，解析请求，处理请求，产生数据后，再返回给客户端，最后才断开连接，这样一个完整的请求就是这样的了。我们可以看到，一个请求，完全由worker进程来处理，而且只在一个worker进程中处理。 
nginx的进程模型，可以由下图来表示： 

![](https://img-blog.csdn.net/20180810144312890?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI1OTM0NDAx/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

----------------------

**Nginx+FastCGI运行原理?**
* 什么是 FastCGI 
    * FastCGI是一个可伸缩地、高速地在HTTP server和动态脚本语言间通信的接口。多数流行的HTTP server都支持FastCGI，包括Apache、Nginx和lighttpd等。同时，FastCGI也被许多脚本语言支持，其中就有PHP。 
    * FastCGI是从CGI发展改进而来的。传统CGI接口方式的主要缺点是性能很差，因为每次HTTP服务器遇到动态程序时都需要重新启动脚本解析器来执行解析，然后将结果返回给HTTP服务器。这在处理高并发访问时几乎是不可用的。另外传统的CGI接口方式安全性也很差，现在已经很少使用了。 
    * FastCGI接口方式采用C/S结构，可以将HTTP服务器和脚本解析服务器分开，同时在脚本解析服务器上启动一个或者多个脚本解析守护进程。当HTTP服务器每次遇到动态程序时，可以将其直接交付给FastCGI进程来执行，然后将得到的结果返回给浏览器。这种方式可以让HTTP服务器专一地处理静态请求或者将动态脚本服务器的结果返回给客户端，这在很大程度上提高了整个应用系统的性能。 
* Nginx+FastCGI运行原理 
    * Nginx不支持对外部程序的直接调用或者解析，所有的外部程序（包括PHP）必须通过FastCGI接口来调用。FastCGI接口在Linux下是socket（这个socket可以是文件socket，也可以是ip socket）。 
    * wrapper：为了调用CGI程序，还需要一个FastCGI的wrapper（wrapper可以理解为用于启动另一个程序的程序），这个wrapper绑定在某个固定socket上，如端口或者文件socket。当Nginx将CGI请求发送给这个socket的时候，通过FastCGI接口，wrapper接收到请求，然后Fork(派生）出一个新的线程，这个线程调用解释器或者外部程序处理脚本并读取返回数据；接着，wrapper再将返回的数据通过FastCGI接口，沿着固定的socket传递给Nginx；最后，Nginx将返回的数据（html页面或者图片）发送给客户端。这就是Nginx+FastCGI的整个运作过程，如图1-3所示。
![](https://img-blog.csdn.net/20180810144411895?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI1OTM0NDAx/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/700)

所以，我们首先需要一个wrapper，这个wrapper需要完成的工作： 
1. 通过调用fastcgi（库）的函数通过socket和ningx通信（读写socket是fastcgi内部实现的功能，对wrapper是非透明的） 
2. 调度thread，进行fork和kill 
3. 和application（php）进行通信

--------------------- 

**nginx多进程事件模型：异步非阻塞?**
虽然nginx采用多worker的方式来处理请求，每个worker里面只有一个主线程，那能够处理的并发数很有限啊，多少个worker就能处理多少个并发，何来高并发呢？非也，这就是nginx的高明之处，nginx采用了异步非阻塞的方式来处理请求，也就是说，nginx是可以同时处理成千上万个请求的。一个worker进程可以同时处理的请求数只受限于内存大小，而且在架构设计上，不同的worker进程之间处理并发请求时几乎没有同步锁的限制，worker进程通常不会进入睡眠状态，因此，当Nginx上的进程数与CPU核心数相等时（最好每一个worker进程都绑定特定的CPU核心），进程间切换的代价是最小的。

而apache的常用工作方式（apache也有异步非阻塞版本，但因其与自带某些模块冲突，所以不常用），每个进程在一个时刻只处理一个请求，因此，当并发数上到几千时，就同时有几千的进程在处理请求了。这对操作系统来说，是个不小的挑战，进程带来的内存占用非常大，进程的上下文切换带来的cpu开销很大，自然性能就上不去了，而这些开销完全是没有意义的。

------------------------
**为什么nginx可以采用异步非阻塞的方式来处理?**
看看一个请求的完整过程:首先，请求过来，要建立连接，然后再接收数据，接收数据后，再发送数据。

具体到系统底层，就是读写事件，而当读写事件没有准备好时，必然不可操作，如果不用非阻塞的方式来调用，那就得阻塞调用了，事件没有准备好，那就只能等了，等事件准备好了，你再继续吧。阻塞调用会进入内核等待，cpu就会让出去给别人用了，对单线程的worker来说，显然不合适，当网络事件越多时，大家都在等待呢，cpu空闲下来没人用，cpu利用率自然上不去了，更别谈高并发了。好吧，你说加进程数，这跟apache的线程模型有什么区别，注意，别增加无谓的上下文切换。所以，在nginx里面，最忌讳阻塞的系统调用了。不要阻塞，那就非阻塞喽。非阻塞就是，事件没有准备好，马上返回EAGAIN，告诉你，事件还没准备好呢，你慌什么，过会再来吧。好吧，你过一会，再来检查一下事件，直到事件准备好了为止，在这期间，你就可以先去做其它事情，然后再来看看事件好了没。虽然不阻塞了，但你得不时地过来检查一下事件的状态，你可以做更多的事情了，但带来的开销也是不小的。

----------------------------

**nginx支持的事件模型?**
Nginx支持如下处理连接的方法（I/O复用方法），这些方法可以通过use指令指定。
    * select– 标准方法。 如果当前平台没有更有效的方法，它是编译时默认的方法。你可以使用配置参数 –with-select_module 和 –without-select_module 来启用或禁用这个模块。
    * poll– 标准方法。 如果当前平台没有更有效的方法，它是编译时默认的方法。你可以使用配置参数 –with-poll_module 和 –without-poll_module 来启用或禁用这个模块。
    * kqueue– 高效的方法，使用于 FreeBSD 4.1+, OpenBSD 2.9+, NetBSD 2.0 和 MacOS X. 使用双处理器的MacOS X系统使用kqueue可能会造成内核崩溃。
    * epoll – 高效的方法，使用于Linux内核2.6版本及以后的系统。在某些发行版本中，如SuSE 8.2, 有让2.4版本的内核支持epoll的补丁。
    * rtsig – 可执行的实时信号，使用于Linux内核版本2.2.19以后的系统。默认情况下整个系统中不能出现大于1024个POSIX实时(排队)信号。这种情况 对于高负载的服务器来说是低效的；所以有必要通过调节内核参数 /proc/sys/kernel/rtsig-max 来增加队列的大小。可是从Linux内核版本2.6.6-mm2开始， 这个参数就不再使用了，并且对于每个进程有一个独立的信号队列，这个队列的大小可以用 RLIMIT_SIGPENDING 参数调节。当这个队列过于拥塞，nginx就放弃它并且开始使用 poll 方法来处理连接直到恢复正常。
    * /dev/poll – 高效的方法，使用于 Solaris 7 11/99+, HP/UX 11.22+ (eventport), IRIX 6.5.15+ 和 Tru64 UNIX 5.1A+.
    * eventport – 高效的方法，使用于 Solaris 10. 为了防止出现内核崩溃的问题， 有必要安装这个 安全补丁。

-------------------------

**在linux下面，只有epoll是高效的方法,epoll到底是如何高效的**
Epoll是Linux内核为处理大批量句柄而作了改进的poll。 要使用epoll只需要这三个系统调用：epoll_create(2)， epoll_ctl(2)， epoll_wait(2)。它是在2.5.44内核中被引进的(epoll(4) is a new API introduced in Linux kernel 2.5.44)，在2.6内核中得到广泛应用。

epoll的优点?
* 支持一个进程打开大数目的socket描述符(FD) 
select 最不能忍受的是一个进程所打开的FD是有一定限制的，由FD_SETSIZE设置，默认值是2048。对于那些需要支持的上万连接数目的IM服务器来说显 然太少了。这时候你一是可以选择修改这个宏然后重新编译内核，不过资料也同时指出这样会带来网络效率的下降，二是可以选择多进程的解决方案(传统的 Apache方案)，不过虽然linux上面创建进程的代价比较小，但仍旧是不可忽视的，加上进程间数据同步远比不上线程间同步的高效，所以也不是一种完 美的方案。不过 epoll则没有这个限制，它所支持的FD上限是最大可以打开文件的数目，这个数字一般远大于2048,举个例子,在1GB内存的机器上大约是10万左 右，具体数目可以cat /proc/sys/fs/file-max察看,一般来说这个数目和系统内存关系很大。 
* IO效率不随FD数目增加而线性下降 
传统的select/poll另一个致命弱点就是当你拥有一个很大的socket集合，不过由于网络延时，任一时间只有部分的socket是”活跃”的，但 是select/poll每次调用都会线性扫描全部的集合，导致效率呈现线性下降。但是epoll不存在这个问题，它只会对”活跃”的socket进行操 作—这是因为在内核实现中epoll是根据每个fd上面的callback函数实现的。那么，只有”活跃”的socket才会主动的去调用 callback函数，其他idle状态socket则不会，在这点上，epoll实现了一个”伪”AIO，因为这时候推动力在os内核。在一些 benchmark中，如果所有的socket基本上都是活跃的—比如一个高速LAN环境，epoll并不比select/poll有什么效率，相 反，如果过多使用epoll_ctl,效率相比还有稍微的下降。但是一旦使用idle connections模拟WAN环境,epoll的效率就远在select/poll之上了。 
* 使用mmap加速内核与用户空间的消息传递。 
这 点实际上涉及到epoll的具体实现了。无论是select,poll还是epoll都需要内核把FD消息通知给用户空间，如何避免不必要的内存拷贝就很 重要，在这点上，epoll是通过内核于用户空间mmap同一块内存实现的。而如果你想我一样从2.5内核就关注epoll的话，一定不会忘记手工 mmap这一步的。 
* 内核微调 
这一点其实不算epoll的优点了，而是整个linux平台的优点。也许你可以怀疑linux平台，但是你无法回避linux平台赋予你微调内核的能力。比如，内核TCP/IP协 议栈使用内存池管理sk_buff结构，那么可以在运行时期动态调整这个内存pool(skb_head_pool)的大小— 通过echo XXXX>/proc/sys/net/core/hot_list_length完成。再比如listen函数的第2个参数(TCP完成3次握手 的数据包队列长度)，也可以根据你平台内存大小动态调整。更甚至在一个数据包面数目巨大但同时每个数据包本身大小却很小的特殊系统上尝试最新的NAPI网卡驱动架构。 
(epoll内容，参考epoll_互动百科) 
推荐设置worker的个数为cpu的核数，在这里就很容易理解了，更多的worker数，只会导致进程来竞争cpu资源了，从而带来不必要的上下文切换。而且，nginx为了更好的利用多核特性，提供了cpu亲缘性的绑定选项，我们可以将某一个进程绑定在某一个核上，这样就不会因为进程的切换带来cache的失效。像这种小的优化在nginx中非常常见，同时也说明了nginx作者的苦心孤诣。比如，nginx在做4个字节的字符串比较时，会将4个字符转换成一个int型，再作比较，以减少cpu的指令数等等。

---------------
**nginx和apache的区别？**
1）轻量级，同样起web 服务，比apache 占用更少的内存及资源 
2）抗并发，nginx 处理请求是异步非阻塞的，而apache 则是阻塞型的，在高并发下nginx 能保持低资源低消耗高性能 
3）高度模块化的设计，编写模块相对简单 
4）最核心的区别在于apache是同步多进程模型，一个连接对应一个进程；nginx是异步的，多个连接（万级别）可以对应一个进程

--------------------- 
**nginx是如何实现高并发的**
一个主进程，多个工作进程，每个工作进程可以处理多个请求，每进来一个request，会有一个worker进程去处理。但不是全程的处理，处理到可能发生阻塞的地方，比如向上游（后端）服务器转发request，并等待请求返回。那么，这个处理的worker继续处理其他请求，而一旦上游服务器返回了，就会触发这个事件，worker才会来接手，这个request才会接着往下走。由于web server的工作性质决定了每个request的大部份生命都是在网络传输中，实际上花费在server机器上的时间片不多。这是几个进程就解决高并发的秘密所在。即@skoo所说的webserver刚好属于网络io密集型应用，不算是计算密集型。


--------------------- 
**请解释Nginx如何处理HTTP请求。**
Nginx使用反应器模式。主事件循环等待操作系统发出准备事件的信号，这样数据就可以从套接字读取，在该实例中读取到缓冲区并进行处理。单个线程可以提供数万个并发连接。

---------------------

**在Nginx中，如何使用未定义的服务器名称来阻止处理请求?**
只需将请求删除的服务器就可以定义为： 
```
Server { 
    listen 80; server_name “ “ ; 
    return 444; 
} 
```
这里，服务器名被保留为一个空字符串，它将在没有“主机”头字段的情况下匹配请求，而一个特殊的Nginx的非标准代码444被返回，从而终止连接。

---------------------

**使用“反向代理服务器”的优点是什么?**
反向代理服务器可以隐藏源服务器的存在和特征。它充当互联网云和web服务器之间的中间层。这对于安全方面来说是很好的，特别是当您使用web托管服务时。

---------------------

**请列举Nginx服务器的最佳用途。**
Nginx服务器的最佳用法是在网络上部署动态HTTP内容，使用SCGI、WSGI应用程序服务器、用于脚本的FastCGI处理程序。它还可以作为负载均衡器。

---------------------

**请解释Nginx服务器上的Master和Worker进程分别是什么?**
Master进程：读取及评估配置和维持 
Worker进程：处理请求

---------------------

**请解释你如何通过不同于80的端口开启Nginx?**
答：为了通过一个不同的端口开启Nginx，你必须进入/etc/Nginx/sites-enabled/，如果这是默认文件，那么你必须打开名为“default”的文件。编辑文件，并放置在你想要的端口： 
Like server { 
listen 81; 
}

---------------------

**请解释是否有可能将Nginx的错误替换为502错误、503?**
502 =错误网关 503 =服务器超载 有可能，但是您可以确保fastcgi_intercept_errors被设置为ON，并使用错误页面指令。 
Location / { fastcgi_pass 127.0.01:9001; fastcgi_intercept_errors on; error_page 502 =503/error_page.html; #… }

---------------------

**在Nginx中，解释如何在URL中保留双斜线?**
要在URL中保留双斜线，就必须使用merge_slashes_off; 
语法:merge_slashes [on/off] 
默认值: merge_slashes on 
环境: http，server

---------------------

**请解释ngx_http_upstream_module的作用是什么?**
ngx_http_upstream_module用于定义可通过fastcgi传递、proxy传递、uwsgi传递、memcached传递和scgi传递指令来引用的服务器组。

---------------------

**请解释什么是C10K问题?**
C10K问题是指无法同时处理大量客户端(10,000)的网络套接字。

---------------------

**请陈述stub_status和sub_filter指令的作用是什么?**
1）Stub_status指令：该指令用于了解Nginx当前状态的当前状态，如当前的活动连接，接受和处理当前读/写/等待连接的总数 2）Sub_filter指令：它用于搜索和替换响应中的内容，并快速修复陈旧的数据

---------------------

**解释Nginx是否支持将请求压缩到上游?**
您可以使用Nginx模块gunzip将请求压缩到上游。gunzip模块是一个过滤器，它可以对不支持“gzip”编码方法的客户机或服务器使用“内容编码:gzip”来解压缩响应。

---------------------

**解释如何在Nginx中获得当前的时间?**
要获得Nginx的当前时间，必须使用SSI模块、dategmt和dategmt和date_local的变量。Proxy_set_header THE-TIME $date_gmt;


--------------------------------

**用Nginx服务器解释-s的目的是什么?**
用于运行Nginx -s参数的可执行文件。

---------------------

**解释如何在Nginx服务器上添加模块?**
在编译过程中，必须选择Nginx模块，因为Nginx不支持模块的运行时间选择。 
nginx 的 upstream目前支持 4 种方式的分配 
* 轮询（默认） 
    * 每个请求按时间顺序逐一分配到不同的后端服务器，如果后端服务器down掉，能自动剔除。 
* weight 
    * 指定轮询几率，weight和访问比率成正比，用于后端服务器性能不均的情况。 
* ip_hash 
    * 每个请求按访问ip的hash结果分配，这样每个访客固定访问一个后端服务器，可以解决session的问题。 
* fair（第三方） 
    * 按后端服务器的响应时间来分配请求，响应时间短的优先分配。 
* url_hash（第三方） 
    * nginx内置策略包含加权轮询和ip hash 
加权轮询算法分为先深搜索和先广搜索，那么nginx采用的是先深搜索算法，即将首先将请求都分给高权重的机器，直到该机器的权值降到了比其他机器低，才开始将请求分给下一个高权重的机器；

缺省安装的 nginx + php-fpm 环境，假设用户浏览一个耗时的网页，但是却在服务端渲染页面的中途关闭了浏览器，那么请问服务端的 php 脚本是继续执行还是退出执行？
正常情况下，如果客户端client异常退出了，服务端的程序还是会继续执行，直到与IO进行了两次交互操作。服务端发现客户端已经断开连接，这个时候会触发一个user_abort，如果这个没有设置ignore_user_abort，那么这个php-fpm的程序才会被中断。 
拓展阅读：http://www.cnblogs.com/yjf512/p/5362025.html?foxhandler=RssReadRenderProcessHandler

--------------------

**在Nginx中，请说明Rewrite模块里break和last的区别。**
官方文档的定义如下： 
last：停止执行当前这一轮的ngx_http_rewrite_module指令集，然后查找匹配改变后URI的新location； 
break：停止执行当前这一轮的ngx_http_rewrite_module指令集； 
千言万语举个例子： 
```
location /test1.txt/ { 
    rewrite /test1.txt/ /test2.txt break; 
}

location ~ test2.txt { 
    return 508; 
}

``` 
使用break会匹配两次URL，如果没有满足项，就会停止匹配下面的location,直接发起请求www.xxx.com/test2.txt，由于不存在文件test2.txt，则会直接显示404。 
使用last的话，会继续搜索下面是否有符合条件(符合重写后的/test2.txt请求)的location，匹配十次，如果十次没有得到的结果，那么就跟break一样了。返回上面的例子，/test2.txt刚好与面location的条件对应上了，进入花括号{}里面的代码执行，这里会返回508。（这里的508是我自己随便设定的）

--------------------

**事件驱动框架：**
nginx事件驱动框架（书本p254）：所谓事件驱动架构，简单来说，就是由一些事件发生源来产生事件，由一个或多个事件收集器（epolld等）来收集、分发事件，然后许多事件处理器会注册自己感兴趣的事件，同时会“消费”这些事件。nginx不会使用进程或线程作为事件消费者，只能是某个模块，当前进程调用模块。

传统web服务器（如Apache）的，所谓事件局限在TCP连接建立、关闭上，其他读写都不在是事件驱动，这时会退化成按序执行每个操作的批处理模式，这样每个请求在连接建立后都将始终占用系统资源，直到连接关闭才会释放资源。大大浪费了内存、cpu等资源。并且把一个进程或线程作为事件消费者。 
传统web服务器与Nginx间重要差别： 
前者每个事件消费者独占一个进程资源，后者只是被事件分发者进程短期调用而已。

----------------------------

**请求的多阶段异步处理**
请求的多阶段异步处理只能基于事件驱动框架实现，就是把一个请求的处理过程按照事件的触发方式分为多个阶段，每个阶段都可以有事件收集、分发器（epoll等）来触发。比如一个http请求可以分为七个阶段

一个master进程（管理），多个work（工作）进程。
master对work进程采用信号进行控制

平台无关的代码实现：
在核心代码都使用了与操作系统无关的代码实现，在与操作系统相关的系统调用上则分别针对各个操作系统都有独立实现，这最终造就了Nginx的可移植性。

---------------------

**内存池的设计**
为了减少避免出现内存碎片、减少向操作系统申请内存的次数、降低各个模块的开发复杂度，Nginx采用了简单的内存池（统一申请，统一释放）。比如为每个http请求分配一个内存池，请求结束时销毁整个内存池。

---------------------

**什么是Nginx？**
Nginx是一个高性能的HTTP和反向代理服务器，及电子邮件（IMAP/POP3）代理服务器，同时也是一个非常高效的反向代理、负载平衡。 
多进程异步非阻塞事件处理机制：运用了epoll模型

---------------------

**为什么要用Nginx？**
* 优点：    
    * 跨平台、配置简单 
    * 非阻塞、高并发连接：处理2-3万并发连接数，官方监测能支持5万并发 
    * 内存消耗小：开启10个nginx才占150M内存，Nginx采取了分阶段资源分配技术 
    * nginx处理静态文件好,耗费内存少 
    * 内置的健康检查功能：如果有一个服务器宕机，会做一个健康检查，再发送的请求就不会发送到宕机的服务器了。重新将请求提交到其他的节点上。    
    * 节省宽带：支持GZIP压缩，可以添加浏览器本地缓存 
    * 稳定性高：宕机的概率非常小 
    * master/worker结构：一个master进程，生成一个或者多个worker进程 
    * 接收用户请求是异步的：浏览器将请求发送到nginx服务器，它先将用户请求全部接收下来，再一次性发送给后端web服务器，极大减轻了web服务器的压力 
    * 一边接收web服务器的返回数据，一边发送给浏览器客户端 
    * 网络依赖性比较低，只要ping通就可以负载均衡 
    * 可以有多台nginx服务器 
    * 事件驱动：通信机制采用epoll模型

------------------------

**什么Nginx性能这么高？**
得益于它的事件处理机制： 
异步非阻塞事件处理机制：运用了epoll模型，提供了一个队列，排队解决

---

**为什么不使用多线程？**
Apache: 创建多个进程或线程，而每个进程或线程都会为其分配cpu和内存（线程要比进程小的多，所以worker支持比perfork高的并发），并发过大会榨干服务器资源。

Nginx: 采用单线程来异步非阻塞处理请求（管理员可以配置Nginx主进程的工作进程的数量）(epoll)，不会为每个请求分配cpu和内存资源，节省了大量资源，同时也减少了大量的CPU的上下文切换。所以才使得Nginx支持更高的并发。

**Nginx是如何处理一个请求的呢？**
首先，nginx在启动时，会解析配置文件，得到需要监听的端口与ip地址，然后在nginx的master进程里面 
先初始化好这个监控的socket，再进行listen 
然后再fork出多个子进程出来, 子进程会竞争accept新的连接。 
此时，客户端就可以向nginx发起连接了。当客户端与nginx进行三次握手，与nginx建立好一个连接后 
此时，某一个子进程会accept成功，然后创建nginx对连接的封装，即ngx_connection_t结构体 
接着，根据事件调用相应的事件处理模块，如http模块与客户端进行数据的交换。 
最后，nginx或客户端来主动关掉连接，到此，一个连接就寿终正寝了

---------------------

**正向代理**
一个位于客户端和原始服务器(origin server)之间的服务器，为了从原始服务器取得内容，客户端向代理发送一个请求并指定目标(原始服务器)，然后代理向原始服务器转交请求并将获得的内容返回给客户端。客户端才能使用正向代理 
正向代理总结就一句话：代理端代理的是客户端

---------------------

**反向代理**
反向代理（Reverse Proxy）方式是指以代理服务器来接受internet上的连接请求，然后将请求，发给内部网络上的服务器 
并将从服务器上得到的结果返回给internet上请求连接的客户端，此时代理服务器对外就表现为一个反向代理服务器 
反向代理总结就一句话：代理端代理的是服务端

---------------------

**负载均衡**
负载均衡即是代理服务器将接收的请求均衡的分发到各服务器中 
负载均衡主要解决网络拥塞问题，提高服务器响应速度，服务就近提供，达到更好的访问质量，减少后台服务器大并发压力

--------------------- 

**为什么不使用多线程？**
* Apache: 创建多个进程或线程，而每个进程或线程都会为其分配cpu和内存（线程要比进程小的多，所以worker支持比perfork高的并发），并发过大会榨干服务器资源。
* Nginx: 采用单线程来异步非阻塞处理请求（管理员可以配置Nginx主进程的工作进程的数量）(epoll)，不会为每个请求分配cpu和内存资源，节省了大量资源，同时也减少了大量的CPU的上下文切换。所以才使得Nginx支持更高的并发。

**Nginx是如何处理一个请求的呢？**
首先，nginx在启动时，会解析配置文件，得到需要监听的端口与ip地址，然后在nginx的master进程里面
先初始化好这个监控的socket，再进行listen
然后再fork出多个子进程出来, 子进程会竞争accept新的连接。
此时，客户端就可以向nginx发起连接了。当客户端与nginx进行三次握手，与nginx建立好一个连接后，此时，某一个子进程会accept成功，然后创建nginx对连接的封装，即ngx_connection_t结构体接着，根据事件调用相应的事件处理模块，如http模块与客户端进行数据的交换，最后，nginx或客户端来主动关掉连接，到此，一个连接就寿终正寝了

**动态资源、静态资源分离的原因**
动态资源、静态资源分离是让动态网站里的动态网页根据一定规则把不变的资源和经常变的资源区分开来，动静资源做好了拆分以后，我们就可以根据静态资源的特点将其做缓存操作，这就是网站静态化处理的核心思路
动态资源、静态资源分离简单的概括是：动态文件与静态文件的分离
二者分离的原因
在我们的软件开发中，有些请求是需要后台处理的（如：.jsp,.do等等），有些请求是不需要经过后台处理的（如：css、html、jpg、js等等文件）
这些不需要经过后台处理的文件称为静态文件，否则动态文件。因此我们后台处理忽略静态文件。这会有人又说那我后台忽略静态文件不就完了吗
当然这是可以的，但是这样后台的请求次数就明显增多了。在我们对资源的响应速度有要求的时候，我们应该使用这种动静分离的策略去解决
动、静分离将网站静态资源（HTML，JavaScript，CSS，img等文件）与后台应用分开部署，提高用户访问静态代码的速度，降低对后台应用访问
这里我们将静态资源放到nginx中，动态资源转发到tomcat服务器中




<a id="markdown-32-基本使用和配置" name="32-基本使用和配置"></a>
## 3.2. 基本使用和配置
<a href="#menu" style="float:right">目录</a>

<a id="markdown-321-nginx平滑升级" name="321-nginx平滑升级"></a>
### 3.2.1. Nginx平滑升级
<a href="#menu" style="float:right">目录</a>



<a id="markdown-322-配置文件" name="322-配置文件"></a>
### 3.2.2. 配置文件
<a href="#menu" style="float:right">目录</a>

**配置文件结构** 

```
main
events{
    KEY VALUE;
}
http{
    server{
        localtion{

        }
    }
}
```
* 每条指令必须以分号结束
* 参数配置形式:   KEY VALUE;
* 语句块内的配置只在其块内或者子块里生效，main部分为全局有效，如果外层块同样配置了相同的指令，则以内部配置为准
* 执行顺序由外至内依次执行
* 内层块中的大部分指令会自定获取外层块的指令作为默认值，只有某些特殊指令除外

||说明|
|---|---|
|main|控制子进程所属用户和用户组、派生子进程数、错误日志位置与级别、pid位置、子进程优先级、进程能够打开的文件描述符数目等|
|events|控制Nginx处理连接的方式|
|http|处理Http请求的主要配置块，大多数参数都在这里配置|
|server|主机配置块，可用于配置多个虚拟主机|
|localtion|目录级别的控制块，可配置多个|

**配置nginx服务器用户组**
* 用于配置运行nginx的用户或者用户组
    * user userName [group];
        * userName 可以运行nginx的用户、
        * group 用户组，可选
        * 只有配置了的用户才可以启动，否则将报错
    * 支持所有用户
        * 删除配置，默认支持所有用户
        * user nobody nobody 
        
**配置允许生成的worker process数**

* nginx 进程数
* worker process越大，理论上支持的并发处理量也越大，实际上还受到计算机硬件的限制
* worker process num|auto
    * num 默认为1
    * auto 为自动检测



**配置nginx进程pid存放路径**
* nginx最为系统的守护进程存在，需要在某文件中保存当前运行程序的主进程号
* pif file;
    * 默认为安装目录下的 logs/nginx.pid
    * 路径需要包含文件名
    

**配置错误文件的存放路径**
* 全局块，http,server都可以对日志进行相关的配置
* error_log file|stderr  [debug|info|notice|warn|error|crit|aletr|emerg]
    * file 输出到文件 ，此时file 为文件路径
    * stderr输出到标准错误
    * error  /log/nginx.log  info;

**配置文件的引入**
* 在一些情况下，需要将其他nginx的配置或者第三方模块的配置引用到当前的主配置文件中
* include file;
    
**设置网络连接的序列化**
* 惊群效应
    * 当某一时刻只有一个网络连接到来时，多个睡眠的进程会被同时叫醒，但只有一个进程可获得连接，如果每次唤醒的数目太多，会影响一部分性能。nginx也存在这样的问题。
* accept_mutex on|off;
    * on 为开启连接序列化，防止进程争抢。
    * 只能在events中进行配置
    
**设置是否允许同时接入多个网络连接**
* 每个worker_process 都有能力同时接收多个新到达的网络连接
* multi_accept on | off;
    * 默认off,即一次只能接收一个新到达的网络连接
    * 只能在events中进行配置
    
**事件驱动模型的选择**
* use select|poll|kqueue|epoll|rtsig|/dev/poll|eventport

**配置最大连接数**
* 每个worker_process 同时开启的最大连接数
* worker_connections number;
    * 默认值512

**定义mime-type**
* 配置支持http请求的不同资源类型
* include mime.types;
    * 引入外部的配置文件，里面定义了一个 types结构，包含了浏览器能够识别的MIME类型以及对应相关类型的文件后缀名
    * types也是nginx的一个配置块
* default_type mime_type;
    * 用于处理前端请求的MIME类型
    * 默认是text/plain
    * 可以在http/server/location中进行配置

**自定义服务日志**
* 服务日志: 记录nginx服务器提供服务过程应答前端请求的日志
* access_log path[format[buffer=size]]
    * path: 服务日志存放的路径和名称
    * foemat: 可选项，服务日志的格式字符串
    * size： 存放日志的内存缓冲区
    * 可以在http/server/location中进行配置
    * 如果要取消: access_log off;
    

**配置允许sendfile方式传输文件**


**配置连接超时时间**
* 与用户建立会话连接之后，Nginx服务器可以保持 这些连接打开一段时间。
* keepalive_timeout timeout[header_timeout];
    * timeout 服务端对连接的保持时间,默认值为75s.
    * header_timeout,可选项，在应答报文头部的Keep-Alive域设置超时时间
    * 实例：keepalive_timeout 120s 100s;
    * 可以在http/server/location中进行配置

**单连接请求数上限**
* 用于限制用户通过某一个连接向nginx服务器发送请求的次数
* keepalive_requests number;
    * 默认值是100
    * 可以在server/location中进行配置
    
**配置网络监听**
* 方式1:配置监听的IP地址
    * listen address[:port] [default_server] [setfib=number] [backlog=number] [rcvbuf=size] [sndbuf=size] [deferred] [accept_filter=filter] [bind] [ssl];
* 方式2:配置监听端口
    * listen port [default_server] [setfib=number] [backlog=number] [rcvbuf=size] [sndbuf=size]  [accept_filter=filter] [deferred] [bind]  [ipv6only=on|off] [ssl];

* 方式2: 配置UNIX Domain Socket
    * listen unix:path [default_server] [backlog=number] [rcvbuf=size] [sndbuf=size]  [accept_filter=filter] [deferred] [bind] [ssl];

* 参数说明
    * address：IP地址，如果是IPV6，格式为[FE80::1]
    * port，端口号，默认80
    * path,socket文件路径
    * default_server 标识符，将虚拟主机设置为address:port的墨认主机
    * setfib=number: 为socket关联路由表，目前只对FreeBSD起作用
    * backlog=number： 设置监听函数listen最多允许多少个网络连接同时处于挂起状态，FreeBSD默认为-1,其他为511
    * rcvbuf & sndbuf：socket接收和发送缓冲区大小
    * accept_filter=filter：设置监听端口对请求的过滤，被过滤的内容不能被接收和处理。
    * bind ： 标识符，使用独立的bind(),处理此address:port
    * ssl： 标识符，设置会话使用SSL模式进行
* 默认设置: listen *:80 |*:8080
* 实例
    * listen 182.2.2.1:8125
    * listen 182.2.2.1
    * listen 8152
    
**基于名称的虚拟主机配置**
* 主机，server提供的虚拟主机，在server中进行配置
* 设置了主机的名称并配置好DNS，用户就可以使用这个名称向虚拟主机发送请求
* 语法: server_name name ...;
    * 可以有一或多个名称，之间用空格隔开
    * 每个名字就是一个域名。中间"."隔开
        * server_name xxx.com ccc.com;
    * 第一个名称作为此虚拟主机的主要名称
    * name中可以使用通配符"*",但只能放在三段式结构中的首部或者尾部，*.xxx.xxx
    * 还可以使用正则表达式，以"~"作为正则表达式 字符串的起始标志
        * server_name ~^www.xxx.com$;:以w开头，以m结尾
* 匹配优先级:使用通配符或者正则可能会出现匹配多个
    * 优先级顺序，首先匹配成功的被选择
        * 准确匹配server_name
        * 通配符在开始时匹配成功
        * 通配符在结尾时匹配成功
        * 正则表达式匹配成功
        

**基于ip的虚拟主机配置**
* server_name: 182.2.235


**配置location块**
* 语法结构:location [=|\~|\~*|^~] uri{...}
    * = : 路径与uri严格匹配
    * ~ : 使用uri正则表达式，区分大小写
    * ~* : 使用uri正则表达式，不区分大小写
    * ^~ : 以某个字符串开头的URL， ^~ /static/ :  以/static/的url
    
* 当[=|\~|\~*]存在多个时，按照从上往下进行匹配，先匹配到的被选择

* location /{} 与location =/ {}的区别
    * location /{} 遵守普通location的最大前缀匹配，如果配置了location /{} 和其他的 location规则，如果匹配其他的location规则，则选择该location规则。否则选择location /{}，也就是说location /{}的优先级最低，没有匹配才会被选择。
    * location =/ {}路径精确匹配
```
location = / {
   #规则A
}
location = /login {
   #规则B
}
location ^~ /static/ {
   #规则C
}
location ~ \.(gif|jpg|png|js|css)$ {
   #规则D
}
location ~* \.png$ {
   #规则E
}
location !~ \.xhtml$ {
   #规则F
}
location !~* \.xhtml$ {
   #规则G
}
location / {
   #规则H
}
那么产生的效果如下：
访问根目录/， 比如http://localhost/ 将匹配规则A
访问 http://localhost/login 将匹配规则B，http://localhost/register 则匹配规则H
访问 http://localhost/static/a.html 将匹配规则C
访问 http://localhost/a.gif, http://localhost/b.jpg 将匹配规则D和规则E，但是规则D顺序优先，规则E不起作用， 而 http://localhost/static/c.png 则优先匹配到 规则C
访问 http://localhost/a.PNG 则匹配规则E， 而不会匹配规则D，因为规则E不区分大小写。
访问 http://localhost/a.xhtml 不会匹配规则F和规则G，http://localhost/a.XHTML不会匹配规则G，因为不区分大小写。规则F，规则G属于排除法，符合匹配规则但是不会匹配到，所以想想看实际应用中哪里会用到。
访问 http://localhost/category/id/1111 则最终匹配到规则H，因为以上规则都不匹配，这个时候应该是nginx转发请求给后端应用服务器，比如FastCGI（php），tomcat（jsp），nginx作为方向代理服务器存在。

```  
**配置请求的根目录**
* web服务器收到请求后，首先要在服务器端指定目录中寻找请求资源。
* root path;
* path 为nginx服务器接收到请求以后查找资源的根目录路径
* 可以在http/server/location中进行配置，一般只在location中进行配置


**更改location的URI**

nginx是通过alias设置虚拟目录，在nginx的配置中，alias目录和root目录是有区别的：
1）alias指定的目录是准确的，即location匹配访问的path目录下的文件直接是在alias目录下查找的；
2）root指定的目录是location匹配访问的path目录的上一级目录,这个path目录一定要是真实存在root指定目录下的；
3）使用alias标签的目录块中不能使用rewrite的break（具体原因不明）；另外，alias指定的目录后面必须要加上"/"符号！！
4）alias虚拟目录配置中，location匹配的path目录如果后面不带"/"，那么访问的url地址中这个path目录后面加不加"/"不影响访问，访问时它会自动加上"/"；
    但是如果location匹配的path目录后面加上"/"，那么访问的url地址中这个path目录必须要加上"/"，访问时它不会自动加上"/"。如果不加上"/"，访问就会失败！
5）root目录配置中，location匹配的path目录后面带不带"/"，都不会影响访问。

```
#当收到 /img/nginx.pic,将请求映射为/var/www/image/nginx.pic，不会追加location的匹配到的部分
location /img/{
    alias /var/www/image/
}
#当收到 /img/nginx.pic,将请求映射为/var/www/image/img/nginx.pic，会追加location的匹配到的部分
location /img/{
    root /var/www/image/
}
```

举例说明（比如nginx配置的域名是www.wangshibo.com）：
**示例一**

```c
location /huan/ {
      alias /home/www/huan/;
}
```
在上面alias虚拟目录配置下，访问http://www.wangshibo.com/huan/a.html实际指定的是/home/www/huan/a.html。
注意：alias指定的目录后面必须要加上"/"，即/home/www/huan/不能改成/home/www/huan

上面的配置也可以改成root目录配置，如下，这样nginx就会去/home/www/huan下寻找http://www.wangshibo.com/huan的访问资源，两者配置后的访问效果是一样的！
```
location /huan/ {
       root /home/www/;
}
```

**示例二**
上面的例子中alias设置的目录名和location匹配访问的path目录名一致，这样可以直接改成root目录配置；那要是不一致呢？
再看一例：
```
location /web/ {
      alias /home/www/html/;
}
```

访问http://www.wangshibo.com/web的时候就会去/home/www/html/下寻找访问资源。
这样的话，还不能直接改成root目录配置。
如果非要改成root目录配置，就只能在/home/www下将html->web（做软连接，即快捷方式），如下：
```
location /web/ {
     root /home/www/;
}

# ln -s /home/www/web /home/www/html       //即保持/home/www/web和/home/www/html内容一直
```
所以，一般情况下，在nginx配置中的良好习惯是：
1）在location /中配置root目录；
2）在location /path中配置alias虚拟目录。

如下一例：
```
server {
          listen 80;
          server_name www.wangshibo.com;
          index index.html index.php index.htm;
          access_log /usr/local/nginx/logs/image.log;

    location / {
        root /var/www/html;
        }

   location /haha {                                          //匹配的path目录haha不需要真实存在alias指定的目录中
       alias /var/www/html/ops/;                       //后面的"/"符号一定要带上
       rewrite ^/opp/hen.php(.*)$ /opp/hen.php?s=$1 last;
    # rewrite ^/opp/(.*)$ /opp/hen.php?s=$1 last;
       }

   location /wang {                    //匹配的path目录wang一定要真实存在root指定的目录中（就/var/www/html下一定要有wang目录存在）
      root /var/www/html;
     }

 }

[root@web01 vhosts]# cat www.kevin.com.conf
server {
      listen      80;
      server_name www.kevin.com;
     
      access_log  /data/nginx/logs/www.kevin.com-access.log main;
      error_log  /data/nginx/logs/www.kevin.com-error.log;
     
 location / {
      root /data/web/kevin;
      index index.php index.html index.htm;
      }
 
  location /document/ {
      alias /data/web/document/;
}
 
  }
```
 
[root@web01 vhosts]# ll /data/web/
total 4
drwxrwxr-x 2 app app   33 Nov 22 10:22 document
drwxrwxr-x 4 app app  173 Sep 23 15:00 kevin
 
如上配置后,则:
访问http://www.kevin.com/admin   就会找到/data/web/kevin/admin目录
访问http://www.kevin.com/document  就会找到/data/web/document 目录 (里面是一些静态资源)


**设置网站的默认首页**
* 在前后端分离的基础上，通过Nginx配置，指定网站初始页。
* 该指令后面可以跟多个文件，用空格隔开；
* 如果包括多个文件，Nginx会根据文件的枚举顺序来检查，直到查找的文件存在；
* 文件可以是相对路径也可以是绝对路径，绝对路径需要放在最后；
* 文件可以使用变量$来命名
* index  index.$geo.html  index.0.html  /index.html;
* 该指令拥有默认值，index index.html ，即，如果没有给出index，默认初始页为index.html
* index指令并不是查到文件之后，就直接拿来用了。它的实际工作方式是：
* 如果文件存在，则使用文件作为路径，发起内部重定向。直观上看上去就像再一次从客户端发起请求，Nginx再一次搜索location一样。
* 既然是内部重定向，域名+端口不发生变化，所以只会在同一个server下搜索。
* 同样，如果内部重定向发生在proxy_pass反向代理后，那么重定向只会发生在代理配置中的同一个server。

**实例**
```
server {
    listen      80;
    server_name example.org www.example.org;    
    
    location / {
        root    /data/www;
        index   index.html index.php;
    }
    
    location ~ \.php$ {
        root    /data/www/test;
    }
}
```
上面的例子中，如果你使用example.org或www.example.org直接发起请求，那么首先会访问到“/”的location，结合root与index指令，会先判断/data/www/index.html是否存在，如果不，则接着查看
/data/www/index.php ，如果存在，则使用/index.php发起内部重定向，就像从客户端再一次发起请求一样，Nginx会再一次搜索location，毫无疑问匹配到第二个~ \.php$，从而访问到/data/www/test/index.php。



**设置网站的默认错误页面**
* error_page code ... [=[response]] uri
    * code http错误码
    * 将code的错误码转换为新的错误码response（客户端显示新的状态码）
    * 错误页面的路径或者网站地址，如果为路径，则是以nginx服务器安装路径下的html目录为根路径的相对路径，如果设置为网址。则Nginx服务器会直接访问该网址获取错误页面。并返回 给用户端。
* 实例:
    * error_page 404 /404.html;
    * error_page 404 401 /404.html;
    * error_page 403 https://www.baidu.com;
    * error_page 404 = 403 /403.html;


**基于IP配置nginx的访问权限**
* allow address |CIDR |all;
    * 允许某个地址访问,如果有多个地址，需要重复多条指令
    * address ip地址
    * CIDR 访问客户端的CIDR地址，比如 127.0.0.1/25;
    * all 默认值，支持所有IP访问
* deny address |CIDR |all;

* 多条指令的情况

从上往下检测，只要有一个匹配就不会继续往下检测

```
deny 127.1.1.2;
allow 127.1.1.3;
deny all;
```

* 这两个指令都可以在http server location中进行配置 

**基于密码配置nginx的访问权限**

* auth_basic string | off;
    * string 开启认证功能，并设置验证时的指示信息
    * off 关闭该认证功能
* auth_basic_user_file file ;
    * 保存密码的文件
```
name1:password1
name2:password2
```


<a id="markdown-33-架构说明" name="33-架构说明"></a>
## 3.3. 架构说明
<a href="#menu" style="float:right">目录</a>

<a id="markdown-331-模块化结构" name="331-模块化结构"></a>
### 3.3.1. 模块化结构
<a href="#menu" style="float:right">目录</a>

<a id="markdown-3311-模块分类" name="3311-模块分类"></a>
#### 3.3.1.1. 模块分类
<a href="#menu" style="float:right">目录</a>

**核心模块**
**标准HTTP模块**
**可选HTTP模块**
**邮件服务模块**
**第三方模块**
<a id="markdown-332-web请求处理机制" name="332-web请求处理机制"></a>
### 3.3.2. web请求处理机制
<a href="#menu" style="float:right">目录</a>

**并行处理方式**
* 多进程
    * 设计实现简单，各个进程之间相互独立，处理客户端的请求的过程彼此不受干扰，进程内部产生错误并不会影响其他进程
    * 当子线程退出时，其占用的资源会被操作系统回收，也不会留下任何垃圾
    * 创建进程需要执行内存复制操作，在资源和时间上会产生额外的开销
    * 因此，如果Web服务器接收大量的并发请求，就会对系统资源造成压力，导致系统性能下降
* 多线程
    * 创建线程不需要进行内存复制，开销小，
    * 多个线程位于同一个进程内，可以访问共同的空间，彼此之间相互影响，需要对变量进行并发访问控制，以及内存管理，容易出错
* 异步

**Nginx服务器处理请求**
* Nginx服务器的一个显著优势就是能够同时处理大量并发请求，结合多进程和异步机制(异步非阻塞)堆外提供服务。
* nginx启动后，会产生一个主进程master process,和多个工作进程。其中可以在配置文件中指定工作进程数量。工作进程用于处理客户端请求。
* 工作处理流程
    * 工作进程使用异步非阻塞,可以处理多个客户端请求，多进程+异步提高了对请求的高并发处理
    * 当某个进程接收到客户端请求后，调用IO今次嗯处理，如果不能立即得到结果，就去处理其他请求
    * 客户端也无需等待，也去处理其他事情
    * 当IO调用完成，就会通知工作进程，工作进程得到通知，暂时挂起当前处理的事务，去响应客户端的请求。
* 事件处理机制
    * IO调用返回后是如何通知工作进程的
    * 方式1
        * 工作进程轮询取检查IO调用完成状态
    * 方式2
        * IO调用后主动通知工作进程，也就是事件驱动模型

**Nginx时间驱动模型**
<a href="#menu" style="float:right">目录</a>

* select 
* poll 
* rtsig

<a id="markdown-333-设计架构概览" name="333-设计架构概览"></a>
### 3.3.3. 设计架构概览
<a href="#menu" style="float:right">目录</a>

![](https://github.com/lgjlife/Java-Study/blob/master/pic/nginx/nginx.png?raw=true)

**主进程**
* 读取配置文件，并验证正确性和有效性
* 建立，绑定和关闭Socket
* 按照配置生成，管理和结束工作进程
* 接收外界指令，比如重启，升级，退出服务器等指令
* 不中断服务，实现平滑重启，应用新配置
* 不中断服务，实现平滑升级，升级失败进行回滚
* 开启日志文件，获取文件描述符
* 编译和处理Perl脚本

**工作进程**
* 接收客户端请求
* 将请求依次送入各个功能模块进行过滤处理
* IO调用，获取响应数据
* 与后端服务器通信，接收后端服务器处理结果
* 数据缓存，访问缓存索引，查询和调用缓存数据
* 发送请求结果，响应客户端请求
* 接收主程序命令，比如重启，升级和退出等指令

**缓存索引重建及管理进程**
* 缓存索引重建进程
    * 根据本地磁盘上的缓存文件在内存中建立索引元数据库
    * 进程启动后，对本地磁盘上存放的缓存文件的目录结构进行扫描
    * 检查内存中已有的缓存元数据是否正确，并更新索引元数据
* 缓存索引管理进程
    * 在元数据更新后，对元数据是否过期作出判断

**进程交互**
* 进程之间的交互依赖管道进行交互




<a id="markdown-34-高级配置" name="34-高级配置"></a>
## 3.4. 高级配置
<a href="#menu" style="float:right">目录</a>


<a id="markdown-35-gzip压缩" name="35-gzip压缩"></a>
## 3.5. gzip压缩
<a href="#menu" style="float:right">目录</a>




<a id="markdown-36-rewrite功能" name="36-rewrite功能"></a>
## 3.6. rewrite功能
<a href="#menu" style="float:right">目录</a>

rewrite功能 用于重定向服务时起到作用。

<a id="markdown-361-nginx后端服务器组的配置的5个技术指令" name="361-nginx后端服务器组的配置的5个技术指令"></a>
### 3.6.1. nginx后端服务器组的配置的5个技术指令
<a href="#menu" style="float:right">目录</a>

**upstream指令**
* 设置后端服务器组的主要指令，其他的指令都在该指令中进行配置
* 语法: upstream name{}
    * name 是后端服务器的组名，可任意配置
    * 用于做负载均衡
    * 默认情况是随机轮询发起后端请求，如果失败则选择下一个服务器，直到响应成功，如果全都失败，返回最后一个的失败请求。

**server指令**
* 用于配置组内的服务器
* 语法: server address [parameters]
    * address服务器的地址，可以包含端口号的IP地址（IP:PORT）,或者以"unix:"为前缀用于进程间通信
    * 当前服务器更多的属性
        * weight=number;负载均衡权重，默认为1.
        * max_fails=numbers;
            * 请求失败的最大次数，默认为1.
            * 请求失败到这个数值时，则认为服务器失效(down).
            * 如果设置为0 ，则不用上面的方法检查服务器是否有效
            * 404不认为请求失败
        * fail_timeout=time;
            * 作用1:尝试请求某台服务器的时间
            * 作用2:服务器无效(down)的持续时间，在该时间内不去检查该服务器的状态
            * 默认10s
        * backup;
            * 标记为备用服务器，其他服务器失效时才会请求该服务器        
        * down ;标记服务器为无效状态，不会向其发送请求
```
upstream  servername{
    server xx.xx.xx weight=5 max_fails=1;
    server 127.0.0.1:8452;
    server unix:/tmp/bass;
}
```
**ip_hash指令**
* 根据请求IP进行负载均衡
* ip_hash不能和weight一起使用
* 根据客户端的请求IP进行哈希，因此nginx必须是客户端之后的组件，否则，将会根据前面组件的ip进行哈希
* 客户端必须是C类地址，1.3.2开始支持IPV6地址

```
upstream  servername{
    ip_hash;
    server 127.0.0.1:8452;
    server 127.0.0.2:8452;
}

```
**keppalive**
* 用于控制网络连接保持功能。
* keepalive connections;
    * 服务器每一个工作进程允许该服务器组保持的空闲网络连接的上限值。如果超过该值，工作进程将采用最近很少使用的策略关闭网络连接。
* 该值不是限制服务器工作进程能改为服务器组开启的总网络连接数

**least_conn**
* 负载均衡和算法:最少连接。配合权重进行选择。


<a id="markdown-362-rewrite功能的配置" name="362-rewrite功能的配置"></a>
### 3.6.2. rewrite功能的配置
<a href="#menu" style="float:right">目录</a>

* rewrite用于实现URL的重写。
* 地址重写和地址转发
    * 地址重写
        * 
    * 地址转发
    * 区别
        * 地址转发后客户端浏览器地址栏中的地址显示是不改变的;而地址重写浏览器显示的地址将会改变为新的地址
        * 一次地址转发整个过程，只产生一次网络请求，而地址重写一般会产生两次请求
        * 地址转发一般在同一个站点项目中，地址重写没有这个限制
        * 地址转发到的页面不用全路径名表示，而地址重写必须使用完整的路径名表示
        * 地址转发的过程中，可以将客户端请求的request范围内的属性传递给新的页面，但地址重写不可以。
        * 地址转发的速度较地址重写快。
* Rewrite规则
    * 借助PCRE实现URI重写，并且支持Nginx预设变量
    * nginx_http_rewrite_module模块支持重写功能
* if指令
    * if (condition){}
        * condition的值为空字符串或者'\0'开头，则为false 
        * "="--->等于;"!=" ---> 不等于，比较变量和字符串
            * 字符串不需要加引号
            * if ($request_method = POST)
        * 使用正则表达式进行匹配
            * 使用以下字符进行连接
                * ~ 匹配对大小写敏感
                * ~* 匹配对大小写不敏感
                * !~ & ~* : 对上面匹配结果取反
            * if ($request_method ~ POST)
        * 判断请求的文件是否存在
            *  -f : 文件存在 !-f : 文件不存在
            * if(-f $filename)
        * 判断请求的目录是否存在
            * -d &!-d
        * 判断请求的目录或者文件是否存在
            * -e & !-e
        * 判断请求的文件是否可执行
            * -x & !-x
* break 指令
    * 和其他语言类似，中断当前语句块
* return 指令
    * 用于完成对请求的处理，直接向客户端返回
    * 用法
        * return [text];
        * returm code URL;
        * return URL;
        * code ： HTTP状态码
        * text : 响应体内容
        * URL:为返回客户端的URL地址

**rewrite**

**常用全局变量**

|||
|---|---|
|$args|变量中存放了请求URL中的请求指令，http://xx.com/login?arg1=val1&arg2=vag2 中的 "arg1=val1&arg2=vag2"
|$content_length|请求头中的Content-length|
|$content_type|请求头中的Content-type|
|$document_root|针对当前请求头中的根路径|
|$document_uri|请求中的URI不包括参数，http://xx.com/login?arg1=val1&arg2=vag2 中的 "/login"|
|$host|请求URL中的主机部分，http://xx.com/login?arg1=val1&arg2=vag2 中的 "xx.com"，如果为空或者不可用，则存放的是Server块中的server_name的配置值|
|$http_user_agent|客户端的代理信息|
|$http_cookie|请求的cookie|
|$limit_rate|Nginx针对网络连接速率的限制，也就是limit_rate的值
|$remote_addr|客户端的地址|
|$remote_port|客户端与服务建立连接的端口|
|$remote_user|客户端的用户名|
|$request_body_file|发给后端服务器的本地文件资源的名称|
|$request_method|客户端请求方式，GET/POST等|
|$request_filename|当前请求的资源文件的路径名|
|$request_uri|当前请求的URI，包括请求参数|
|$query_string|与变量$args相同|
|$scheme|客户端请求的协议，http,https,ftp|
|$server_protocol|客户端请求协议的版本，HTTP/1.0，HTTP/1.1等|
|$server_addr|服务器的地址|
|$server_name|客户端请求到达服务器的名称|
|$server_port|客户端请求到达服务器的端口|
|$uri|$document_uri相同|



<a id="markdown-363-rewrite使用" name="363-rewrite使用"></a>
### 3.6.3. rewrite使用
<a href="#menu" style="float:right">目录</a>



<a id="markdown-37-代理服务" name="37-代理服务"></a>
## 3.7. 代理服务
<a href="#menu" style="float:right">目录</a>

<a id="markdown-371-正向代理和反向代理" name="371-正向代理和反向代理"></a>
### 3.7.1. 正向代理和反向代理
![](https://github.com/lgjlife/Java-Study/blob/master/pic/nginx/proxy.png?raw=true)
![](https://github.com/lgjlife/Java-Study/blob/master/pic/nginx/proxy1.png?raw=true)
* **正向代理**
    * 正向代理是**让局域网客户机接入外网以访问外网资源**   
    * 局域网内的机器借助代理服务访问局域网外的网站
    * 主要为了增强局域网内部网络的安全性，使得网外的威胁因素不容易影响到网内。
    * 代理服务器起到一定的防火墙作用
    * 利用代理服务器也可以对局域网对外网的访问进行监控和管理 
    * 正向代理不支持外部网络对内部的访问
* **反向代理**
    * 反向代理是**让外网接入局域网中的站点以访问站点中的资源**
    * 局域网向外部提供网络服务
    * 客户端并不知道局域网内部是否使用了代理，反向代理对客户是透明的

<a id="markdown-372-nginx正向代理服务" name="372-nginx正向代理服务"></a>
### 3.7.2. Nginx正向代理服务

* 使用情况少，相对简单
* 涉及三个指令，resolver,resolver_timeout,proxy_pass
* 可以在http,server,location块中配置，一般是单独配置一个server来设置代理服务器
* 不支持正向代理Https

**正向代理指令**

* resolver
    * 用于指定DNS服务器的IP地址，DNS服务器的主要工作是进行域名解析。将域名映射为对应的IP地址
    * resolver address ...[valid=time];
        * 支持ipv6地址
        * address : DNS服务器的IP地址，如果不指定端口号。默认使用53端口  
        * time,设置数据包在网络中的有效时间
            * 在访问站点时，数据包并不一定很快到达目的地，需要给数据包设置超时时间，时间到则丢弃
        * resolver 127.5.6.1 valid=30s
* resolver_timeout
    * resolver_timeout time;
        * 用于设置DNS域名解析的超时时间
* proxy_pass
    * proxy_pass URL;
    * 设置代理服务器的域名和地址

* 实例
```
server{
    #设置DNS服务器地址为8.8.8.8。默认端口53作为DNS服务器 的服务端口
    resolver 8.8.8.8;
    //代理服务的监听端口为82
    listen 82;
    location /{
        proxy_pass http://xxx.xx
    } 
}
```

<a id="markdown-373-nginx反向代理服务" name="373-nginx反向代理服务"></a>
### 3.7.3. Nginx反向代理服务
<a href="#menu" style="float:right">目录</a>

<a id="markdown-3731-反向代理基本设置的21个指令" name="3731-反向代理基本设置的21个指令"></a>
#### 3.7.3.1. 反向代理基本设置的21个指令 
<a href="#menu" style="float:right">目录</a>

* **proxy_pass**
* **proxy_hide_header**
* **proxy_pass_header**
* **proxy_pass_request_body**
* **proxy_pass_request_headers**
* **proxy_set_header**
* **proxy_set_body**
* **proxy_bind**
* **proxy_connect_timeout**
* **proxy_read_timeout**
* **proxy_send_timeout**
* **proxy_http_version**
* **proxy_method**
* **proxy_ignore_client_abort**
* **proxy_ignore_headers**
* **proxy_rediret**
* **proxy_intercepterrors**
* **proxy_headers_hash_max_size**
* **proxy_headers_hash_bucket_size**
* **proxy_next_stream**
* **proxy_ssl_session_request**

<a id="markdown-3732-proxy-buffer-的配置的7个指令" name="3732-proxy-buffer-的配置的7个指令"></a>
#### 3.7.3.2. proxy buffer 的配置的7个指令
<a href="#menu" style="float:right">目录</a>

* **proxy_buffering**
* **proxy_buffers**
* **proxy_buffer_size**
* **proxy_busy_buffer_size**
* **proxy_temp_path**
* **proxy_max_temp_file_size**
* **proxy_temp_write_size**

<a id="markdown-3733-proxy-cache-的配置的12个指令" name="3733-proxy-cache-的配置的12个指令"></a>
#### 3.7.3.3. proxy cache 的配置的12个指令
<a href="#menu" style="float:right">目录</a>

* **proxy_cache**
* **proxy_cache_bypass**
* **proxy_cache_key**
* **proxy_cache_lock**
* **proxy_cache_lock_timeout**
* **proxy_cache_min_uses**
* **proxy_cache_path**
* **proxy_cache_use_state**
* **proxy_cache_valid**
* **proxy_no_cache**
* **proxy_store**
* **proxy_store_access**


<a id="markdown-374-nginx服务器负载均衡" name="374-nginx服务器负载均衡"></a>
### 3.7.4. Nginx服务器负载均衡

**常用状态参数**



**轮询负载均衡**
<a href="#menu" style="float:right">目录</a>

```
http{
    upstream  blog{
    
        server 192.1.1.1:8223;
        server 192.1.1.1:8323;
        server 192.1.1.1:8423;
    }
    server{
        listen 8080;
        location /{
            proxy_pass http://blog;
        }
    }
}
```
* 使用默认的负载均衡策略(轮询+加权因子为1) 


**加权轮询负载均衡**
<a href="#menu" style="float:right">目录</a>

```
http{
    upstream  blog{
    
        server 192.1.1.1:8223  weight=1;
        server 192.1.1.1:8323  weight=2;
        server 192.1.1.1:8423  weight=3;
    }
    server{
        listen 8080;
        location /{
            proxy_pass http://blog;
        }
    }
}
```
* 通过weight来配置权重

**对特定资源进行负载均衡**
<a href="#menu" style="float:right">目录</a>


```
http{
    upstream  video{
    
        server 192.1.1.1:8223  weight=1;
        server 192.1.1.1:8323  weight=2;
        server 192.1.1.1:8423  weight=3;
    }
    upstream  file{
    
        server 192.1.1.1:8223  weight=1;
        server 192.1.1.1:8323  weight=2;
        server 192.1.1.1:8423  weight=3;
    }
    server{
        listen 8080;
        location /video{
            proxy_pass http://video;
        }

        location /file{
            proxy_pass http://file;
        }

    }
}
```
**ip hash负载均衡**
<a href="#menu" style="float:right">目录</a>

```
http{
    upstream  blog{
        ip_hash;
        server 192.1.1.1:8223;
        server 192.1.1.1:8323;
        server 192.1.1.1:8423;
    }
    server{
        listen 8080;
        location /{
            proxy_pass http://blog;
        }
    }
}
```

**最少连接负载均衡**
<a href="#menu" style="float:right">目录</a>

```
http{
    upstream  blog{
        least-connected;
        server 192.1.1.1:8223;
        server 192.1.1.1:8323;
        server 192.1.1.1:8423;
    }
    server{
        listen 8080;
        location /{
            proxy_pass http://blog;
        }
    }
}
```



**对不同域名实现负载均衡**
<a href="#menu" style="float:right">目录</a>

* 就是存在多个不同的server

```
http{
    upstream  video{
    
        server 192.1.1.1:8223  weight=1;
        server 192.1.1.1:8323  weight=2;
        server 192.1.1.1:8423  weight=3;
    }
    upstream  file{
    
        server 192.1.1.1:8223  weight=1;
        server 192.1.1.1:8323  weight=2;
        server 192.1.1.1:8423  weight=3;
    }
    server{
        listen 8080;
        location /video{
            proxy_pass http://video;
        }

    }
    server{
        listen 8081;
        location /file{
            proxy_pass http://file;
        }

    }
}
```

**实现带有URL重写的负载均衡**
<a href="#menu" style="float:right">目录</a>

<a id="markdown-38-邮件服务" name="38-邮件服务"></a>
## 3.8. 邮件服务
<a href="#menu" style="float:right">目录</a>


<a id="markdown-39-源码结构" name="39-源码结构"></a>
## 3.9. 源码结构
<a href="#menu" style="float:right">目录</a>


<a id="markdown-310-基本数据结构" name="310-基本数据结构"></a>
## 3.10. 基本数据结构
<a href="#menu" style="float:right">目录</a>


<a id="markdown-311-启动初始化" name="311-启动初始化"></a>
## 3.11. 启动初始化
<a href="#menu" style="float:right">目录</a>

<a id="markdown-3111-启动过程概览" name="3111-启动过程概览"></a>
### 3.11.1. 启动过程概览
* 解析输入参数，通过输入参数确定Nginx服务器具体行为
* 初始化时间和日志，备份输入参数，并初始化相关的全局变量。一些变量的值依赖于Nginx服务器所在操作系统的相关信息，比如内存页面大小，系统支持最大文件打开数目
* 保存输入参数
* 初始化描述网络套接字的相关结构
* 初始化ngx_module_t数组
* 读取并保存Nginx配置参数
* 初始化ngx_cycle_s结构体
* 保存工作进程ID到PID文件

<a id="markdown-312-时间管理" name="312-时间管理"></a>
## 3.12. 时间管理
<a href="#menu" style="float:right">目录</a>


<a id="markdown-313-内存管理" name="313-内存管理"></a>
## 3.13. 内存管理
<a href="#menu" style="float:right">目录</a>

<a id="markdown-3131-内存的逻辑结构" name="3131-内存的逻辑结构"></a>
### 3.13.1. 内存的逻辑结构
* nginx内存池相关结构体
    * ngx_pool_t ,描述nginx内存池结构
    * ngx_poll_data_t , 
    * ngx_poll_large_t , 
    * ngx_poll_cleanup_t , 

* nginx的内存管理很好，运行过程占用系统内存很少

![](https://github.com/lgjlife/Java-Study/blob/master/pic/nginx/nginx_pool.png?raw=true)

* nginx内存池本质上是一个链表结构，链表的每一个节点称为一个数据块，由ngx_poll_data_t描述
* ngx_poll_large_t 用于处理大数据内存
* ngx_poll_cleanup_t 用于处理对内存进行释放和回收
* ngx_pool_t相当于一个内存管理器，其他结构形成一个链表，需要时挂接在ngx_pool_t上面




<a id="markdown-3132-内存池管理" name="3132-内存池管理"></a>
### 3.13.2. 内存池管理

<a id="markdown-3133-内存的使用" name="3133-内存的使用"></a>
### 3.13.3. 内存的使用


<a id="markdown-314-工作进程" name="314-工作进程"></a>
## 3.14. 工作进程
<a href="#menu" style="float:right">目录</a>

<a id="markdown-3141-nginx服务进程间通信" name="3141-nginx服务进程间通信"></a>
### 3.14.1. nginx服务进程间通信
<a href="#menu" style="float:right">目录</a>

<a id="markdown-31411-linux进程间通信方式" name="31411-linux进程间通信方式"></a>
#### 3.14.1.1. Linux进程间通信方式

* 进程间通信方式
    * 使用IPC（消息队列，信号量，共享存储）
        * 功能强大，但是不能支持Nginx服务器使用的事件驱动模型
    * 管道
        * 管道简单易用，但是限制比较多，一般只是单向通信
        * 一般在父子进程间通信
    * 套接字 socket
        * 用于网络通信，也可用于系统内进程间通信
        * 支持双向通信
          
<a id="markdown-31412-linux进程间双工通信方式的实现" name="31412-linux进程间双工通信方式的实现"></a>
#### 3.14.1.2. Linux进程间双工通信方式的实现


<a id="markdown-31413-通信通道建立和设置" name="31413-通信通道建立和设置"></a>
#### 3.14.1.3. 通信通道建立和设置


<a id="markdown-31414-通信通道的使用" name="31414-通信通道的使用"></a>
#### 3.14.1.4. 通信通道的使用


<a id="markdown-31415-消息的读写" name="31415-消息的读写"></a>
#### 3.14.1.5. 消息的读写

<a id="markdown-315-模块编程" name="315-模块编程"></a>
## 3.15. 模块编程
<a href="#menu" style="float:right">目录</a>


<a id="markdown-3151-模块的种类" name="3151-模块的种类"></a>
### 3.15.1. 模块的种类
<a href="#menu" style="float:right">目录</a>

* 根据模块的重要性
    * **核心模块**
        * Nginx重要模块，提供了基本初始化功能
        * 包括网络管理，文件管理，内存管理，配置解析，模块加载等基本功能实现
    * **标准模块**
        * 配置时无需指明编译的重要模块 
        * 提供了实现HTTP WEB服务的基础功能，包括代理，反向代理，URL重写，GZIP压缩，邮件等功能的实现
    * **可选的HTTP模块**    
        * 编译时需要指明编译
        * 这些模块大多数是为了提高web服务器的性能或者扩展额外功能而提供的，比如SSL，select ,epoll
    * **第三方模块**
        * 自定义开发的模块

* 根据模块的角色划分
    * **请求处理模块**
        * 负责与客户端连接，请求收发的处理
    * **资源过滤模块**
        * 对服务器接收的各类网络资源进行管理和筛选
        * 资源来源包括客户端和后端服务器
    * **代理转发模块**
        * 负责后端服务器的选择，资源递送等服务

<a id="markdown-3152-模块开发实战" name="3152-模块开发实战"></a>
### 3.15.2. 模块开发实战
<a href="#menu" style="float:right">目录</a>


<a id="markdown-3153-模块的编译和安装" name="3153-模块的编译和安装"></a>
### 3.15.3. 模块的编译和安装
<a href="#menu" style="float:right">目录</a>




