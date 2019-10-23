
<span id="menu"></span>
<!-- TOC -->

- [1. MongoDB](#1-mongodb)
    - [1.1. 基本介绍](#11-基本介绍)
    - [1.2. 安装和运行](#12-安装和运行)
        - [1.2.1. Docker方式安装运行](#121-docker方式安装运行)
    - [1.3. 复制](#13-复制)
    - [1.4. 分片](#14-分片)
    - [1.5. SpringBoot中使用Mongodb](#15-springboot中使用mongodb)
        - [1.5.1. 引入依赖](#151-引入依赖)
        - [1.5.2. 配置](#152-配置)
        - [1.5.3. 使用](#153-使用)
            - [1.5.3.1. 创建实体](#1531-创建实体)
            - [1.5.3.2. 使用MongoTemplate方式](#1532-使用mongotemplate方式)
            - [1.5.3.3. 使用MongoRepository方式](#1533-使用mongorepository方式)

<!-- /TOC -->

# 1. MongoDB
<a href="#menu" style="float:right">目录</a>


## 1.1. 基本介绍
<a href="#menu" style="float:right">目录</a>


## 1.2. 安装和运行
<a href="#menu" style="float:right">目录</a>

### 1.2.1. Docker方式安装运行
<a href="#menu" style="float:right">目录</a>

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
---
Enable MongoDB's free cloud-based monitoring service, which will then receive and display
metrics about your deployment (disk utilization, CPU, operation statistics, etc).

The monitoring data will be available on a MongoDB website with a unique URL accessible to you
and anyone you share the URL with. MongoDB may use this information to make product
improvements and to suggest MongoDB products and deployment options to you.

To enable free monitoring, run the following command: db.enableFreeMonitoring()
To permanently disable this reminder, run the following command: db.disableFreeMonitoring()
---

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


## 1.3. 复制
<a href="#menu" style="float:right">目录</a>


## 1.4. 分片
<a href="#menu" style="float:right">目录</a>


## 1.5. SpringBoot中使用Mongodb
<a href="#menu" style="float:right">目录</a>


### 1.5.1. 引入依赖
<a href="#menu" style="float:right">目录</a>

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>
```

### 1.5.2. 配置
<a href="#menu" style="float:right">目录</a>

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
### 1.5.3. 使用
<a href="#menu" style="float:right">目录</a>

#### 1.5.3.1. 创建实体
<a href="#menu" style="float:right">目录</a>

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
#### 1.5.3.2. 使用MongoTemplate方式
<a href="#menu" style="float:right">目录</a>

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



#### 1.5.3.3. 使用MongoRepository方式
<a href="#menu" style="float:right">目录</a>

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
