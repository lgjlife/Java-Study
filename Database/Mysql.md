# MySQL 基础

[MySQL官网](https://dev.mysql.com/doc/)

##  常用命令
### 数据库和表基本操作
```sql
显示数据库
show databases;
使用数据库
use databaseName;
显示数据表
show tables;
显示数据表创建信息
show create table table_name

删除数据库
DROP DATABASE database_name
DROP DATABASE IF EXISTS `database_name`;
删除表
DROP TABLE  table_name
DROP TABLE IF EXISTS `table_name`;
创建表
CREATE TABLE `blog_collect` (
  `collect_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '转发ID',
  `blog_id` bigint(20) DEFAULT NULL COMMENT '博客ID',
  `user_id` bigint(20) DEFAULT NULL COMMENT '收藏用户ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`collect_id`),
  KEY `blog_id` (`blog_id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='博客收藏表';

AUTO_INCREMENT COMMENT : 该字段为递增，一般用于主键
DEFAULT： 设置默认值
NOT NULL： 非空，插入NULL会报错。
PRIMARY KEY： 指定主键，主键不能有NULL值
KEY： 普通键，普通键可以有NULL值
ENGINE=InnoDB： 指定存储引擎InnoDB/MEMORY/MyISAM，5.0 版本开始默认 Innodb
CHARSET=utf8： 字符编码;
COMMENT='博客收藏表'： 注解

```
### 查询数据
```sql
查询所有数据
select * from table_name;

查询某个字段
select name1,name2 from table_name; 

设置别名，查询结果显示  aaa 和 name2
select name1 as aaa,name2 from table_name; 
select table_name.name1 as aaa,table_name.name2 from table_name;

限制数据量 查询从第一条数据开始，总共5条数据。
语法：limit  start,count.  //start从0开始，count 为查询的条数
select  * from limit 0,5;

单列排序
select * from table_name group by name1;
多列排序
先按照字段name1排序，再按照name2排序。
select * from table_name group by name1,name2;
name1 name2
1      a
1      b
2      a
2      b

排序方向，放置在排序字段的后面：
desc: 递减
asc: 递增，默认
```
注意： 在实际开发过程中，为了减轻网络传输的压力，应当尽量实现需要什么字段就查询什么字段，减少select * 的使用。

### 过滤数据
操作符

|操作符|说明|
|---| --- |
|=| 等于 |
|<>| 不等于|
|!=| |
|<| |
|<=| |
|>| |
|>=| |
|BETWEEN|指定两个值之间，例子：BETWEEN 5 AND 10 |

```sql
select * from table_name where name = 1;
select * from table_name where name = null;
select * from table_name where name between  5 and 10;
select * from table_name where name1 = 1  and name2 = "aa";
select * from table_name where name1 in ( 1,2,3,4);
select * from table_name where name1  not in ( 1,2,3,4);
```
### 通配符

1. _ : 下划线，匹配单个字符
2. % : 匹配多个字符

```sql
匹配 a1a,a11a,a1111a
不匹配 ba1a,ba11a,ba1111a
select * from table_name where name like "a%a";
```
需要注意的是，当该字段上加索引时，"%aa"左匹配无效。
并且使用通配符效率较低，实际开发过程中能不用尽量不用。

### 正则表达式
[百度百科：正则表达式](https://baike.baidu.com/item/%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F/1700215?fr=aladdin)

正则匹配使用关键字： REGEXP
默认不区分大小写，如果需要区分大小写，使用 REGEXP BINARY

与通配符比较
like 匹配整个字段
正则匹配匹配字段中的值。只要字段中出现该字符，就能查找到。
```sql
字段 name 值： "12345"
select * from table_name where name like "123";  //无法匹配
select * from table_name where name like "123%";  //能够匹配
select * from table_name where name REGEXP "123";  //能够匹配
```
常用正则介绍

|正则表达式|说明|
|---|---|
|[123]|匹配 1,2,3 其中之一|||
|[0~9][a-z][A-Z]|匹配范围,单个字符。|
匹配特殊字符,使用双反斜杠\\，  \\. , \\-, \\f  换页, \\n 换行 , \\r  回车,\\t 制表,\\v纵向制表
aa|bb ,或操作,匹配字符串 "aa" 或者"bb"都能够查找到。

重复元字符

|元字符|说明|
|---|---|
|*|0或多个匹配|
|+|1个或多个匹配|
|?|0或1个匹配|
|{n}|指定数目的匹配|
|{n,}|不少于指定数目的匹配|
|{n,m}|匹配范围|
|^|文本的开始|
|$|文本的结尾|
|[[:<:]]|词的开始|
|[[:>:]]|词的结尾|

### 函数
#### 数学函数
#### 字符串函数
#### 日期和时间函数
#### 条件判断函数
#### 系统信息函数
#### 加密函数
#### 其他函数

### 聚集函数

|||
|---|---|
|AVG()|返回某列的平均值|
|COUNT()|返回某列的行数|
|MAX()|返回某列的最大值|
|MIN()|返回某列的最小值|
|SUM|返回某列的值之和|

DISTINCT 去重关键字
name ： 1,1,2,2,3,3
```sql
select  count(name)  as name_count from table_name;  --> 2
select  count(DISTINCT name)  as name_count from table_name; --> 1
```
### 分组数据
GROUP BY

对于其他查询字段，需要使用聚集函数。
```sql
SELECT  name1 , COUNT(name2)  from table_name group by name1 ;
```
使用having 进行过滤
```sql
SELECT  name1 , COUNT(name2)  from table_name group by name1  HAVING  COUNT(name2)>10;
```
WHERE只能在分组前进行过滤，HAVING只能在分组后进行过滤。
```sql
SELECT  name1 , COUNT(name2) as new_name2  from table_name 
    where name3 = "aaa"
    group by name1
    HAVING  COUNT(name2)>10;
```
执行顺序:
where -- > group by --> having --> order by ;
```sql
SELECT  name1 , COUNT(name2) as new_name2  from table_name 
    where name3 = "aaa"
    group by name1
    HAVING  COUNT(name2)>10
    order by new_name2 ;
```

### 子查询
```sql

SELECT  name1  from table_name1 
  where name in (
    select  name2 from table_name2
  
  );

```
### 表关联

两个表数据
```sql
mysql> select * from table1;
+-------+  
| name1 |
+-------+
|     1 |
|     2 |
|     3 |
|     4 |
|     5 |
+-------+

mysql> select * from table2;
+-------+
| name2 |
+-------+
|     3 |
|     4 |
|     7 |
+-------+
```

方式1： 没有连接条件的查询,也就是迪卡尔积，检索出的数目等于表1和表2行数之积。
```sql
mysql> select * from table1,table2;
+-------+-------+
| name1 | name2 |
+-------+-------+
|     1 |     3 |
|     1 |     4 |
|     1 |     7 |
|     2 |     3 |
|     2 |     4 |
|     2 |     7 |
|     3 |     3 |
|     3 |     4 |
|     3 |     7 |
|     4 |     3 |
|     4 |     4 |
|     4 |     7 |
|     5 |     3 |
|     5 |     4 |
|     5 |     7 |
+-------+-------+

```
方式2：使用inner join ，也就是内连接，inner可省略。
```sql
mysql> select * from table1 t1 join table2 t2 on t1.name1 = t2.name2;
等价：select * from table1 t1 ,table2 t2 where t1.name1 = t2.name2;
+-------+-------+
| name1 | name2 |
+-------+-------+
|     3 |     3 |
|     4 |     4 |
+-------+-------+
```
方式3： 左外连接，会将左表所有的数据查询出来，右表只查询匹配的数据，其他使用NULL表示
```sql
mysql> select * from table1 t1 left join table2 t2 on t1.name1 = t2.name2; 
+-------+-------+
| name1 | name2 |
+-------+-------+
|     3 |     3 |
|     4 |     4 |
|     1 |  NULL |
|     2 |  NULL |
|     5 |  NULL |
+-------+-------+

```
方式4： 右外连接，会将右表所有的数据查询出来，右表只查询匹配的数据，其他使用NULL表示
```sql
mysql> select * from table1 t1 right join table2 t2 on t1.name1 = t2.name2;
+-------+-------+
| name1 | name2 |
+-------+-------+
|     3 |     3 |
|     4 |     4 |
|  NULL |     7 |
+-------+-------+

```
on是在生成连接表的起作用的，where是生成连接表之后对连接表再进行过滤。
当使用left join时，无论on的条件是否满足，都会返回左表的所有记录，对于满足的条件的记录，两个表对应的记录会连接起来，对于不满足条件的记录，那右表字段全部是null
当使用right join时，类似，只不过是全部返回右表的所有记录
当使用inner join时，功能与where完全相同
多个分表--> on --> 临时表 --> where 过滤 --> 最终表

```sql

select * from table1 t1 join table2 t2 on t1.name1 = t2.name2;
等价：select * from table1 t1 ,table2 t2 where t1.name1 = t2.name2;

以下写法时错误的，外连接关联条件不能使用 where
select * from table1 t1 left join table2 t2 where t1.name1 = t2.name2 and t2.name2 = "a";
select * from table1 t1 right join table2 t2 where t1.name1 = t2.name2;

正确写法：
select * from table1 t1 left join table2 t2 on t1.name1 = t2.name2 where t2.name2 = "a";
select * from table1 t1 right join table2 t2 on t1.name1 = t2.name2;

```

多表关联；

```sql
select * from 
  table1 t1 right join table2 t2 
  on t1.name1 = t2.name2  
  right join table3 t3
  on t3.name3 = t2.name2  
  ;
```
### 增删改数据

* 插入数据
value 和 values 等价。
```sql
插入一行数据
insert into table_name  values(1,2,3);
插入多行数据
insert into table_name  values(1,2,3),(1,2,3),(1,2,3);

插入指定字段数据
insert into table_name (name1,name2) values(1,2),(1,2),(1,2);


```

* 更新数据
```sql

update table_name 
    set  name1 = xxx,
         name2 =xxx
      where  name3 =xxx;

```

* 删除数据
```sql
delete from table_name 
    where name1 = xxx;
```

需要注意: 删除和更新必须带where条件，否则将会删除全表和更新全表。尤其在生产环境，必须谨慎使用。

### 视图

创建语法： create view  view_name --- as  slect xxxx
```sql

create  view  view_name  as   
    select name1,name2 from  xxx

```
其他操作和普通表一样。

1. 视图只是一个或者多个普通表导出的虚拟表，并不存储数据，两者共享数据，相当于C语言中的指针。修改其中一个的数据也会影响到对方。
2. 使用视图可以隐藏某些字段，不提供该开发者。

### 触发器
使用触发器可以实现当表更新(UPDATE/DELETE/INSERT)时,触发执行一条或者多条SQL语句。

创建触发器注意事项：
* 触发器名称必须在该表内唯一，同一个数据库不同的表可以有不同的名称。
* 触发器关联的表
* 触发条件
* 触发后执行的语句
* 视图不支持触发器
* 每个表每个事件只允许一个触发器，因此最多有6个触发器（INSERT/UPDATE 前+后 /DELETE 前+后）


```sql

/*新增*/
CREATE  TRICGER tricger_name AFTER INSERT ON  table_name   
    FOR  EACH ROW 
      SELECT   NEW.name;
/*删除*/      
CREATE  TRICGER tricger_name AFTER DELETE ON  table_name   
    FOR  EACH ROW 
      SELECT   OLD.name;
/*修改*/
CREATE  TRICGER tricger_name AFTER UPDATE ON  table_name   
    FOR  EACH ROW 
      SELECT   OLD.name;
      
CREATE  TRICGER tricger_name AFTER UPDATE ON  table_name   
    FOR  EACH ROW 
      BEGIN
      SELECT   NEW.name;
      END
```
OLD: 删除或者修改前的表引用,可以获得事件发生之前的数据
NEW: 新增或者修改后的表引用，可以获得事件发生之后的数据

如果有多条SQL语句需要执行，使用BEGIN 和END。


例子：
```sql
/*user 表删除数据时将user_id字段插入到 user_delete 表中 */
DROP TRIGGER IF EXISTS `user_update_trigger`;
CREATE TRIGGER user_update_trigger AFTER DELETE
ON user  FOR EACH ROW
BEGIN
INSERT  INTO user_delete (user_id) values(OLD.user_id);
END; 
```

### 创建表

* 主键和外键
    * 主键：唯一标识表中每行的这个列为主键。
        * 不更新主键列中的值
        * 不重用
        * 主键不应当为会改变的值，比如用户名。
    * 外键
        *
     