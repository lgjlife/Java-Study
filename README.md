<h1> Java知识点总结</h1>

[声明：本文档由本人总结整理，版权归个人所有，如果转载使用，需保留此段声明。
[博客园:https://www.cnblogs.com/lgjlife/](https://www.cnblogs.com/lgjlife/)
[GitHub:https://github.com/lgjlife](https://github.com/lgjlife)]


<H2 id="menu">目录</H2>

<!-- TOC -->

- [1. 技术社区](#1-技术社区)
- [2. 常用工具](#2-常用工具)
    - [2.1. 编译器](#21-编译器)
    - [2.2. IDEA插件](#22-idea插件)
    - [2.3. UML绘制](#23-uml绘制)
    - [2.4. HTTP请求](#24-http请求)
    - [2.5. 前端开发编辑](#25-前端开发编辑)
    - [2.6. 思维导图软件](#26-思维导图软件)
    - [2.7. 编辑器](#27-编辑器)
    - [2.8. 调优工具](#28-调优工具)
    - [2.9. 压测工具](#29-压测工具)
    - [2.10. 版本管理](#210-版本管理)
    - [2.11. 其他](#211-其他)
- [3. 计算机基础](#3-计算机基础)
    - [3.1. 数据类型](#31-数据类型)
        - [3.1.1. ASCII](#311-ascii)
- [4. 算法](#4-算法)
- [5. 网络TCP](#5-网络tcp)
- [6. 网络HTTP](#6-网络http)
- [7. Unix环境编程](#7-unix环境编程)
- [8. Shell](#8-shell)
    - [8.1. 文件相关](#81-文件相关)
    - [8.2. 系统监控](#82-系统监控)
    - [8.3. 处理数据文件](#83-处理数据文件)
    - [8.4. 环境变量](#84-环境变量)
    - [8.5. 基本脚本命令](#85-基本脚本命令)
    - [8.6. 结构化命令](#86-结构化命令)
    - [8.7. 处理用户输入](#87-处理用户输入)
    - [8.8. 控制脚本](#88-控制脚本)
- [9. Git](#9-git)
- [10. Maven](#10-maven)
- [11. Jenkins](#11-jenkins)
- [12. Docker](#12-docker)
    - [12.1. Docker常用指令](#121-docker常用指令)
    - [12.2.](#122)
- [13. Java基础](#13-java基础)
    - [13.1. 数据类型](#131-数据类型)
        - [13.1.1. 数据类型](#1311-数据类型)
        - [13.1.2. Integer 缓存对象](#1312-integer-缓存对象)
        - [13.1.3. 数组](#1313-数组)
        - [13.1.4. String](#1314-string)
    - [13.2. 面向对象](#132-面向对象)
        - [13.2.1. 三大特性](#1321-三大特性)
        - [13.2.3. 权限修饰符](#1323-权限修饰符)
        - [接口和抽象类](#接口和抽象类)
        - [内部类](#内部类)
        - [枚举类](#枚举类)
    - [13.3. 范型](#133-范型)
    - [13.4. 集合](#134-集合)
    - [13.5. 异常](#135-异常)
    - [13.6. 注解](#136-注解)
    - [13.7. IO](#137-io)
    - [13.8. 反射](#138-反射)
    - [13.9. JDBC](#139-jdbc)
- [14. 测试](#14-测试)
    - [14.1. 基本测试](#141-基本测试)
    - [14.2. 控制层测试](#142-控制层测试)
    - [14.3. 服务层测试](#143-服务层测试)
    - [14.4. DAO层测试](#144-dao层测试)
- [15. JVM](#15-jvm)
- [16. MySQL](#16-mysql)
- [17. MyBatis](#17-mybatis)
- [18. Netty](#18-netty)
- [19. Dubbo](#19-dubbo)
- [20. Redis](#20-redis)
- [21. Spring](#21-spring)
- [22. SpringBoot](#22-springboot)
- [23. SpringCloud](#23-springcloud)
- [24. Dubbo](#24-dubbo)
- [25. RocketMQ](#25-rocketmq)
- [26. RabbitMQ](#26-rabbitmq)
- [27. Kafka](#27-kafka)
- [28. Nginx](#28-nginx)
- [29. Tomcat](#29-tomcat)
- [30. elasticsearch](#30-elasticsearch)
- [31. FastDfs](#31-fastdfs)
- [32. Quartz](#32-quartz)
- [33. 设计模式](#33-设计模式)
    - [33.1. 设计原则](#331-设计原则)
        - [33.1.1. 单一职责原则](#3311-单一职责原则)
        - [33.1.2. 里氏替换原则](#3312-里氏替换原则)
        - [33.1.3. 依赖倒置原则](#3313-依赖倒置原则)
        - [33.1.4. 接口隔离原则](#3314-接口隔离原则)
        - [33.1.5. 迪米特法则](#3315-迪米特法则)
        - [33.1.6. 开闭原则](#3316-开闭原则)
    - [33.2. 单例模式](#332-单例模式)
    - [33.3. 工厂方法模式](#333-工厂方法模式)
    - [33.4. 抽象工厂模式](#334-抽象工厂模式)
    - [33.5. 模板方法模式](#335-模板方法模式)
    - [33.6. 建造者模式](#336-建造者模式)
    - [33.7. 代理模式](#337-代理模式)
    - [33.8. 原型模式](#338-原型模式)
    - [33.9. 中介者模式](#339-中介者模式)
    - [33.10. 命令模式](#3310-命令模式)
    - [33.11. 责任链模式](#3311-责任链模式)
    - [33.12. 装饰模式](#3312-装饰模式)
    - [33.13. 策略模式](#3313-策略模式)
    - [33.14. 适配器模式](#3314-适配器模式)
    - [33.15. 迭代器模式](#3315-迭代器模式)
    - [33.16. 组合模式](#3316-组合模式)
    - [33.17. 观察者模式](#3317-观察者模式)
    - [33.18. 门面模式](#3318-门面模式)
    - [33.19. 备忘录模式](#3319-备忘录模式)
    - [33.20. 访问者模式](#3320-访问者模式)
    - [33.21. 状态模式](#3321-状态模式)
    - [33.22. 解释器模式](#3322-解释器模式)
    - [33.23. 享元模式](#3323-享元模式)
    - [33.24. 桥梁模式](#3324-桥梁模式)
- [34. Zookeeper](#34-zookeeper)
- [35. 分布式系统](#35-分布式系统)

<!-- /TOC -->





# 1. 技术社区
<a href="#menu" style="float:right">目录</a>
* [博客园](https://www.cnblogs.com/)
* [开源中国](https://www.oschina.net/)
* [stackoverflow](https://stackoverflow.com/)
* [CSDN](https://www.csdn.net/)
* [掘金](https://juejin.im/)
* [技术文档下载](http://www.java1234.com/)
* [leetcode](https://leetcode.com/)
* [牛客网](https://www.nowcoder.com/)
# 2. 常用工具

## 2.1. 编译器
* IDEA （个人觉得IDEA比较好用）
* Eclipse
* MyEclipse

## 2.2. IDEA插件
* Lombok： 使用注解，免去实体类中get /set/构造器等代码 ，需要引入lombok包
* Alibaba Java Coding Guidelines ：《阿里巴巴Java开发规约》扫描插件,安装后右键单击选择扫描，会提示哪些地方不符合规范
* MyBatis plugin ： 可以从mybatis mappe接口的方法直接跳转到mapper.xml配置文件
* jclasslib: JClassLib不但是一个字节码阅读器而且还包含一个类库允许开发者读取,修改,写入Java Class文件与字节码

## 2.3. UML绘制
* https://www.draw.io/ ：在线UML绘制工具，可以保存到本地或者Github

## 2.4. HTTP请求
* POSTMAN（https://www.getpostman.com/）:一款功能强大的网页调试与发送网页HTTP请求的工具
* curl指令

## 2.5. 前端开发编辑
* [vscode](https://code.visualstudio.com/Download)
* IDEA
* Brackets   代码提示，颜色区分
* sublime_text_3   这个Linux下安装后，不支持中文输入，网上有解决办法。

## 2.6. 思维导图软件
* MindMaster   多平台，免费，可以导出为图片。
## 2.7. 编辑器
* VIM
* GEDIT　

## 2.8. 调优工具
* visualVm(https://visualvm.github.io/):是一款免费的,集成了多个 JDK 命令行工具的可视化工具,它能为您提供强大的分析能力,对 Java 应用程序做性能分析和调优.

## 2.9. 压测工具
* Jmeter   可以开多个线程对接口进行压测，并分析压测结果。

## 2.10. 版本管理
* git     
* svn
* 码云
* Git在线练习 [try git](https://try.github.io/)/[git real](https://www.pluralsight.com/courses/code-school-git-real)/[Learn Git Branching](https://learngitbranching.js.org/)

## 2.11. 其他
* SpringBoot Banner 字符生成 [根据图片生成](https://www.degraeve.com/img2txt.php)/[根据文字生成](http://patorjk.com/software/taag/#p=display&f=3D-ASCII&t=MicroBlog%0A)


<a href="#menu" style="float:right">目录</a>
# 3. 计算机基础
<a href="#menu" style="float:right">目录</a>
## 3.1. 数据类型
### 3.1.1. ASCII
* ASCII控制字符

|二进制|	十进制|	十六进制	|缩写	|名称/意义|
|---|---|---|---|---|
|0000 0000	|0	|00	|NUL	|空字符（Null）
|0000 0001	|1	|01	|SOH		|标题开始
|0000 0010	|2	|02	|STX	  |本文开始
|0000 0011	|3	|03	|ETX		|本文结束
|0000 0100	|4	|04	|EOT		|传输结束
|0000 0101	|5	|05	|ENQ		|请求
|0000 0110	|6	|06	|ACK		|确认回应
|0000 0111	|7	|07	|BEL		|响铃
|0000 1000	|8	|08	|BS	|退格
|0000 1001	|9	|09	|HT		|水平定位符号
|0000 1010	|10	|0A	|LF		|换行键
|0000 1011	|11	||0B	|VT	|垂直定位符号
|0000 1100	|12	|0C	|FF		|换页键
|0000 1101	|13	|0D	|CR		|归位键
|0000 1110	|14	|0E	|SO		|取消变换（Shift out）
|0000 1111	|15	|0F	|SI		|启用变换（Shift in）
|0001 0000	|16	|10	|DLE		|跳出数据通讯
|0001 0001	|17	|11	|DC1		|设备控制一（XON 启用软件速度控制）
|0001 0010	|18	|12	|DC2		|设备控制二
|0001 0011	|19	|13	|DC3		|设备控制三（XOFF 停用软件速度控制）
|0001 0100	|20	|14	|DC4		|设备控制四
|0001 0101	|21	|15	|NAK		|确认失败回应
|0001 0110	|22	|16	|SYN		|同步用暂停
|0001 0111	|23	|17	|ETB		|区块传输结束
|0001 1000	|24	|18	|CAN		|取消
|0001 1001	|25	|19	|EM		|连接介质中断
|0001 1010	|26	|1A	|SUB		|替换
|0001 1011	|27	|1B	|ESC		|跳出
|0001 1100	|28	|1C	|FS		|文件分割符
|0001 1101	|29	|1D	|GS	|组群分隔符
|0001 1110	|30	|1E	|RS		|记录分隔符
|0001 1111	|31	|1F	|US		|单元分隔符
|0111 1111	|127	|7F	|DEL	|删除

* ASCII可显示字符

|二进制	|十进制	|十六进制	|图形|
|---|---|---|---|---|---|
0010 0000|	32|	20|	（空格）(␠)
0010 0001|	33|	21	|!
0010 0010|	34|	22	|"
0010 0011|	35|	23	|#
0010 0100|	36|	24|	$
0010 0101|	37|	25|	 %
0010 0110|	38|	26|	&
0010 0111|	39|	27|	'
0010 1000|	40|	28|	(
0010 1001|	41|	29|	)
0010 1010|	42|	2A|	*
0010 1011|	43|	2B|	+
0010 1100|	44|	2C|	,
0010 1101|	45|	2D|	-
0010 1110|	46|	2E|	.
0010 1111|	47|	2F|	/
0011 0000|	48|	30|	0
0011 0001|	49|	31|	1
0011 0010|	50|	32|	2
0011 0011|	51|	33|	3
0011 0100|	52|	34|	4
0011 0101|	53|	35|	5
0011 0110|	54|	36|	6
0011 0111|	55|	37|	7
0011 1000|	56|	38|	8
0011 1001|	57|	39|	9
0011 1010|	58|	3A|	:
0011 1011|	59|	3B|	;
0011 1100|	60|	3C|	<
0011 1101|	61|	3D|	=
0011 1110|	62|	3E|	>
0011 1111|	63|	3F|	?
0100 0000|	64|	40	|@
0100 0001|	65|	41	|A
0100 0010|	66|	42	|B
0100 0011|	67|	43	|C
0100 0100|	68|	44	|D
0100 0101|	69|	45	|E
0100 0110|	70|	46	|F
0100 0111|	71|	47	|G
0100 1000|	72|	48	|H
0100 1001|	73|	49	|I
0100 1010|	74|	4A	|J
0100 1011|	75|	4B	|K
0100 1100|	76|	4C	|L
0100 1101|	77|	4D	|M
0100 1110|	78|4E	|N
0100 1111|	79|	4F|	O
0101 0000|	80|	50	|P
0101 0001|	81|	51	|Q
0101 0010|	82|	52	|R
0101 0011|	83|	53	|S
0101 0100|	84|	54	|T
0101 0101|	85|	55	|U
0101 0110|	86|	56	|V
0101 0111|	87|	57	|W
0101 1000|	88|	58	|X
0101 1001|	89|	59	|Y
0101 1010|	90|	5A	|Z
0101 1011|	91|	5B	|[
0101 1100|	92|	5C	|\
0101 1101|	93|	5D	|]
0101 1110|	94|	5E	|^
0101 1111|	95|	5F	|_
0110 0000|	96|	60	|`
0110 0001|	97|	61	|a
0110 0010|	98|	62	|b
0110 0011|	99|	63	|c
0110 0100|	100|	64	|d
0110 0101|	101| 65	|e
0110 0110|	102|	66	|f
0110 0111|	103|	67	|g
0110 1000|	104|	68	|h
0110 1001|	105|	69	|i
0110 1010|	106|	6A	|j
0110 1011|	107|	6B	|k
0110 1100|	108|	6C	|l
0110 1101|	109|	6D	|m
0110 1110|	110|	6E	|n
0110 1111|	111|	6F	|o
0111 0000|	112|	70	|p
0111 0001|	113|	71	|q
0111 0010|	114|	72	|r
0111 0011|	115|	73	|s
0111 0100|	116|	74	|t
0111 0101|	117|	75	|u
0111 0110|	118|	76	|v
0111 0111|	119|	77	|w
0111 1000|	120|	78	|x
0111 1001|	121|	79	|y
0111 1010|	122|	7A	|z
0111 1011|	123|	7B	|{
0111 1100|	124|	7C	|\|
0111 1101|	125|	7D	|}
0111 1110|	126|	7E	|~
# 4. 算法
<a href="#menu" style="float:right">目录</a>
# 5. 网络TCP
<a href="#menu" style="float:right">目录</a>
# 6. 网络HTTP
<a href="#menu" style="float:right">目录</a>
# 7. Unix环境编程
<a href="#menu" style="float:right">目录</a>
# 8. Shell
<a href="#menu" style="float:right">目录</a>
## 8.1. 文件相关
* 路径
  * /   根路径
  * .   当前目录
  * .. 上一级目录
  * ~/  当前用户目录
  * cd  path  进入路径
  * cd -  返回上一级目录
  
* 文件列表
  * ls 只列出当前目录文件名称
  * ls -l 包含文件权限等信息
  * ls -a 包含"."开头的隐藏文件
  * ls -F 区分文件和目录
  * ls -R 递归显示目录
  * ls -l  aa 只显示带aa的列表，“?”单个字符，"*"多个字符
  * pwd 显示当前绝对路径
* 处理文件
  * touch 创建文件
  * mkdir 创建目录
  * cp source  dest 复制文件，加  -r 用于复制目录
  * rm 删除，-r 删除目录 -f 强制删除文件
  * mv source dest 重命名/复制文件
* 查看文件
  * file xxx 查看文件类型
  * cat 打印文件数据，-n 加上行号， -b 只给有文本的加上行号
* 文件权限
  * 文件权限包括用户(U)-组(G)-其他用户(O),包括读(4-r)写(2-w)执行(1-x)权限。
  * chmod u+x file 用户添加执行权限
  * chmod u-x file 用户去除执行权限
  * chmod 111 file 所有的都为执行权限
  * chmod 721 file 用户有读写执行，组用户有写，其他用户有执行权限
```bash
-rw-rw-r-- 1 lgj lgj  1215779 Jun 28 18:08  1.mp4
```
* 文件链接：给文件创建虚拟副本
   * 符号链接:仅保存引用，文件内容和原文件不一样，和源文件同步更新,仅可读，不可修改，即使修改文件权限。
   * 硬链接: 保存引用和文件信息，和源文件同步更新，可以修改。
   * 使用cp 复制链接文件时，复制的文件仍然保留和源文件之间的链接关系，一般不这么做。
   * ln source dest ,加-s 时创建的是软连接。
*查看文件
   * more 只显示一页，按页翻页。空格键翻页。
   * less 按行翻行，方向键，可向前和向后翻。 
   * tail -n 2 file 实时查看文件后2行数据，动态更新。
   * head -5 file 查看看文件前5行数据

## 8.2. 系统监控
<a href="#menu" style="float:right">目录</a>
## 8.3. 处理数据文件
<a href="#menu" style="float:right">目录</a>
## 8.4. 环境变量
<a href="#menu" style="float:right">目录</a>
## 8.5. 基本脚本命令
<a href="#menu" style="float:right">目录</a>
## 8.6. 结构化命令
<a href="#menu" style="float:right">目录</a>
## 8.7. 处理用户输入
<a href="#menu" style="float:right">目录</a>
## 8.8. 控制脚本
<a href="#menu" style="float:right">目录</a>


# 9. Git
<a href="#menu" style="float:right">目录</a>
# 10. Maven
<a href="#menu" style="float:right">目录</a>
* mvn compile 编译源代码
* mvn test-compile 编译测试代码
* mvn test 运行测试代码
* mvn site 生成site
* mvn install 安装到本地仓库
* mvn package 打包
* mvn -Dmaven.test.skip package 打包时忽略测试
* mvn clear 清除产生的项目
* mvn idea:idea 生成idea项目
* mvn eclipse:eclipse生成ecllipse项目文件
# 11. Jenkins
<a href="#menu" style="float:right">目录</a>
# 12. Docker
<a href="#menu" style="float:right">目录</a>
## 12.1. Docker常用指令
<a href="#menu" style="float:right">目录</a>
* 安装
   * 安装 sudo snap install docker
   * 移除 sudo snap remove docker
   * 查看snap安装的文件： snap list docker 
* 查看版本号: docker --version
* 查看支持的指令： docker
* 查看本地镜像：docker images
* 查看安装的容器: docker ps -a
* 查看正在运行的容器: docker ps -a
* 查看容器信息: docker inspect 容器名称/ID
## 12.2.  
# 13. Java基础
<a href="#menu" style="float:right">目录</a>
## 13.1. 数据类型
<a href="#menu" style="float:right">目录</a>
### 13.1.1. 数据类型
|基本数据类型|包装器类型|长度（字节）|范围|类型标识|
|---|---|---|---|---|
|byte|Byte|1|-128,127|
|short|Short|2|-32768,32767|
|int|Integer|4|-2147483648,2147483647|8进制(012),16进制(0x)|
|long|Long|8|-9223372036854775808,9223372036854775807|123L|
|char|charater|2||数值，'',Unicode '\u0061'|
|float|Float|4||3.45f|
|double|Double|8||
包装类主要用于集合数据，判断非空的场景。局部变量一般使用基本类型。对象属性一般使用包装器类型。
装箱就是基本类型转换为包装类型。valueOf方法。
拆箱就是包装类型转换为基本类型。intValue方法。

* 自动类型转换
   * char-->int
   * byte-->short-->int
   * int-->long--float--double
   * 整数类型默认为int,浮点类型默认为float
   * 左边类型赋值给右边类型会自动转换，反之需要强制转换，强制转换可能会出现溢出，导致数据丢失。比如将int(1000)转换为byte.多出来的比特位将会强制截断。
   * 任何类型和字符串类型相加，都会自动转换为字符串类型
   * byte,char,short类型之间相互运算将会自动提升为int类型，这是系统避免计算溢出。
### 13.1.2. Integer 缓存对象
<a href="#menu" style="float:right">目录</a>
缓存范围为[-128,127]，超过则创建新的对象
```java
 private static class IntegerCache {
        static final int low = -128;
        static final int high;
        static final Integer cache[];

        static {
            // high value may be configured by property
            int h = 127;
            String integerCacheHighPropValue =
                sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
            if (integerCacheHighPropValue != null) {
                try {
                    int i = parseInt(integerCacheHighPropValue);
                    i = Math.max(i, 127);
                    // Maximum array size is Integer.MAX_VALUE
                    h = Math.min(i, Integer.MAX_VALUE - (-low) -1);
                } catch( NumberFormatException nfe) {
                    // If the property cannot be parsed into an int, ignore it.
                }
            }
            high = h;

            cache = new Integer[(high - low) + 1];
            int j = low;
            for(int k = 0; k < cache.length; k++)
                cache[k] = new Integer(j++);

            // range [-128, 127] must be interned (JLS7 5.1.7)
            assert IntegerCache.high >= 127;
        }

        private IntegerCache() {}
    }
    public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }
```
示例：
```java
public static void main(String args[]){

        Integer a1 =10;
        Integer a2 = 10;

        System.out.println("a1==a2?  " + (a1==a2));

        Integer b1 = 210;
        Integer b2 = 210;

        System.out.println("b1==b2?  " + (b1==b2));

        Integer c1 = new Integer(10);
        Integer c2 = new Integer(10);

        System.out.println("c1==c2?  " + (c1==c2));

    }
//输出
a1==a2?  true
b1==b2?  false
c1==c2?  false
```
### 13.1.3. 数组
初始化
```java
/创建数组，需要定义长度
int arr = new int[5];
//创建数组，顺便初始化，长度为元素的数量
int arr = new int[]{1,2,3};
//简化方式
int arr = {1,2,4};

//二维数组
int[][] arr = new int[1][2];
int[][] arr1 = new int[][]{{1,2},{1,2}};
int[][] arr2 =  {{1,2},{1,2}};
```
数组工具类java.util.Arrays。提供排序,复制，比较，初始化等功能。
### 13.1.4. String 
<a href="#menu" style="float:right">目录</a>
```java
public static void main(String args[]){

        String a1 = "a1";
        String a2 = "a1";

        System.out.println("a1==a2?  " + (a1==a2));

        String b1 = new String("b1");
        String b2 = new String("b1");

        System.out.println("b1==b2?  " + (b1==b2));

        String c1 = "c1";
        String c2 = "c2";
        String c3 = "c1c2";
        String c4 = c1+c2;

        System.out.println("c3==\"c1c2\"?  " + (c3=="c1c2"));
        System.out.println("c3==c4?  " + (c3==c4));
        System.out.println("c4==\"c1c2\"?  " + (c4=="c1c2"));
    }
//输出
a1==a2?  true
b1==b2?  false
c3=="c1c2"?  true
c3==c4?  false
c4=="c1c2"?  false
```
//至少创建一个对象
String a = "123";
//最多创建两个对象，至少创建一个对象。
String a = new String("1243");

* 创建字符串时，JVM将会把字符串放入字符串缓存池中，JDK8把缓存池放在堆中。
* 如果使用直接赋值，则先去缓存池查找，没有则先创建，有则把缓存对象引用赋给栈变量。所以最多创建一个对象
* 如果使用new,则先在堆中创建一个String对象,再去缓存池查找有没有缓存对象，把缓存对象引用传给堆中的对象，再把堆中的String对象引用传给栈中的变量。所以至少创建一个，最多创建两个对象。

* 由于String变量相加时，会创建新的对象。因此效率较低。
使用StringBuilder和StringBuffer，StringBuffer在一些方法上加上了Synchronized同步锁，一般不使用。


## 13.2. 面向对象
<a href="#menu" style="float:right">目录</a>
### 13.2.1. 三大特性
<a href="#menu" style="float:right">目录</a>
* 继承
通过继承可以实现代码的复用。
* 封装
将一些属性和方法隐藏起来，只提供公共的接口。我觉得这里应该是为了安全性，比如如果对某些属性赋值，要经过一定的内部计算，如果直接调用属性赋值，肯定会出现问题。
* 多态 
同一种类型的对象，调用同一个方法，其呈现的效果不一样。
Java有两种类型，编译时类型(由声明的类型决定)，运行时类型(由实际赋给这个变量的对象类型决定)。当运行时类型不一样的时候，就会出现多态。
* 向上转型: 子类对象赋给父类变量。自动转换。只能调用父类拥有的方法。
* 向下转型: 父类对象赋给子类变量，需要强制转换。可以调用子类拥有的方法。

**构造器**
默认有一个无参构造器，如果实现了其他有参构造器，无参构造器便不存在。

```java
class Base{

}

class Sub extends Base{

    public void func(){

    }
}
public static void main(String args[]){
        //向上转型，自动转换
        Base base = new Sub();
        //调用子类方法，先强制转换为子类类型再调用
        ((Sub) base).func();

        //向下转型，需要强制转换
        Sub sub = (Sub)(new Base());
        sub.func();

    }
```
**初始化问题**
```java
   public static void main(String args[]){
        Sub base = new Sub();

    }

class Base{

    static {
        System.out.println("父类静态初始化块");
    }
    {
        System.out.println("父类普通初始化块");
    }

    public Base() {
        System.out.println("父类构造器");
    }
}

class Sub extends Base{

    static {
        System.out.println("子类静态初始化块");
    }
    {
        System.out.println("子类普通初始化块");
    }

    public Sub() {
        System.out.println("子类构造器");
    }
    public void func(){

    }
}
//输出
父类静态初始化块
子类静态初始化块
父类普通初始化块
父类构造器
子类普通初始化块
子类构造器
```
### 13.2.3. 权限修饰符
<a href="#menu" style="float:right">目录</a>
* private 本类可见
* default 同一个包/子包可见
* protect 子类可见
* public 所有可见

### 接口和抽象类
**接口**
* interface定义，implements 实现
* 接口方法默认为public abstract 
* 接口中的属性默认为public static 
* 接口可以有自己的实现方法，JDK8提供了default关键字支持
* 接口可以没有方法
* 接口可以实现接口


**抽象类**
* abstract定义，extends 继承
* 抽象类可以有和普通类一样的属性和方法定义
* 抽象类必须至少有一个抽象方法
* 抽象方法必须使用abstract修饰
* 抽象方法不能是私有的，否则不能被子类实现

**如何选择:**
一般接口定义行为，抽象类实现多个接口，聚合行为，并定义子类的公共实现方法。
尽量不要有多个层级的实现类，减少代码修改的难度，一般使用装饰器模式解决类功能扩展问题。

**重载overload和重写overwride**
重写发生在父子类之间，重写改变方法的功能。两同两小一大。
* 方法名称，行参列表必须一样
* 返回值类型和抛出异常要么和原来一样，要么是子类。
* 访问权限应该比原来的大或者一样

重载发生在本类中,规范如下
* 方法名称相同
* 行参列表不同（类型，顺序，个数），一般应当减少这种情况出现func(List)和func(ArrayList).会造成困扰。
* 与返回值，权限，异常定义无关

**final**
* 修饰属性，标识该属性赋值之后不能再被赋值，可以用在局部变量中。
* 修饰类，标识该类不能被继承,比如String类
* 修饰方法，标识该类不能被重写

**static**
* 修饰属性和方法和内部类，标识是类属性和方法，如果公有，可直接通过类名访问
* static块不能有对象元素
* 修饰初始化块，类加载时会先被调用
* 与import配合，引入static元素(属性和方法)


### 内部类
内部类分为普通内部类，静态内部类，局部内部类，匿名内部类。

**普通内部类和静态内部类**
* 普通内部类可以直接使用外部类属性
* 外部类使用普通内部类属性必须先常见内部类对象
* 访问权限如之前所定义的
* 创建普通内部类对象必须先创建外部类对象，内部类对象是依存外部类对象存在的
* 创建静态内部类对象不需要创建外部类对象
* 静态内部类符合static规范，只能调用外部类static元素
* 外部类可以访问静态内部类的静态成员，使用类名来访问。

```java
public class Outer {

    int a;
    static int  b;
    public class Inner{

        void func(){
           //直接调用外部类属性
            a =1;
        }
    }

    public static  class StaticInner{

        public static int   c;
        public int d;
        void func(){
            b =1;
        }
    }
    
    static void func(){
       //外部类静态方法通过类名访问内部类静态属性
        StaticInner.c = 1;
    }
}
```
**局部内部类**
在方法中创建，仅在方法内可见
```java

public void func(){
   Class User{
      int a;
   };

   User user = new User();
}
```
**匿名类**
没有名字的类，用于在实现类简单的场景。
```java
//定义类
class Handle{

   public void  do(){

   }
}
//定义方法
public void func(){

}

//使用

func(new Handle{
   public void  do(){
      ///do sth
   }

});
```
### 枚举类
```java
public enum BlogReturnCode implements  ReturnCode{
    //空参数 0
    ERROR_PARAM(0,"输入参数无效"),
    //代码
    private Integer code;
    //代码对应的信息
    private String message;

    BlogReturnCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
```
## 13.3. 范型
<a href="#menu" style="float:right">目录</a>
## 13.4. 集合
<a href="#menu" style="float:right">目录</a>
## 13.5. 异常
<a href="#menu" style="float:right">目录</a>
## 13.6. 注解
<a href="#menu" style="float:right">目录</a>
## 13.7. IO
<a href="#menu" style="float:right">目录</a>
## 13.8. 反射
<a href="#menu" style="float:right">目录</a>
## 13.9. JDBC
<a href="#menu" style="float:right">目录</a>
# 14. 测试
<a href="#menu" style="float:right">目录</a>
## 14.1. 基本测试
<a href="#menu" style="float:right">目录</a>
## 14.2. 控制层测试
<a href="#menu" style="float:right">目录</a>
## 14.3. 服务层测试
<a href="#menu" style="float:right">目录</a>
## 14.4. DAO层测试
<a href="#menu" style="float:right">目录</a>
# 15. JVM
<a href="#menu" style="float:right">目录</a>
# 16. MySQL
<a href="#menu" style="float:right">目录</a>
# 17. MyBatis
<a href="#menu" style="float:right">目录</a>
# 18. Netty 
<a href="#menu" style="float:right">目录</a>
# 19. Dubbo
<a href="#menu" style="float:right">目录</a>
# 20. Redis
<a href="#menu" style="float:right">目录</a>
# 21. Spring
<a href="#menu" style="float:right">目录</a>
# 22. SpringBoot
<a href="#menu" style="float:right">目录</a>
# 23. SpringCloud
<a href="#menu" style="float:right">目录</a>
# 24. Dubbo
<a href="#menu" style="float:right">目录</a>
# 25. RocketMQ
<a href="#menu" style="float:right">目录</a>
# 26. RabbitMQ
<a href="#menu" style="float:right">目录</a>
# 27. Kafka
<a href="#menu" style="float:right">目录</a>
# 28. Nginx
<a href="#menu" style="float:right">目录</a>
# 29. Tomcat
<a href="#menu" style="float:right">目录</a>
# 30. elasticsearch
<a href="#menu" style="float:right">目录</a>
# 31. FastDfs
<a href="#menu" style="float:right">目录</a>
# 32. Quartz
<a href="#menu" style="float:right">目录</a>
# 33. 设计模式
<a href="#menu" style="float:right">目录</a>
## 33.1. 设计原则
<a href="#menu" style="float:right">目录</a>
### 33.1.1. 单一职责原则
* 每个类只负责单一的功能，避免出现复杂臃肿的类。造成维护困难。
### 33.1.2. 里氏替换原则
* 父类出现的地方子类也可以出现。方便实现类替换，减少代码修改。
### 33.1.3. 依赖倒置原则
* 高层模块不应该依赖细节，而应该依赖其抽象
* 也就是说定义类属性时，使用接口或者抽象类来定义，而不是实现类。
### 33.1.4. 接口隔离原则
* 创建单一的接口，不要创建臃肿的接口。每个接口应该只是负责单一的功能，避免增加新抽象方法时，造成较多的实现类页需要修改。
### 33.1.5. 迪米特法则
* 一个类应当降低对其他类的依赖,避免其他类修改时，使用类也要进行修改。
### 33.1.6. 开闭原则
* 对修改关闭，对扩展开放
* 当需要增加新功能时，应当避免修改原类的代码，应当通过一些设计模式来进行功能扩展。比如装饰模式，这样可以达到对其他使用类的影响。
* 以上的原则都是施行指南，开闭原则是最终目标。

## 33.2. 单例模式
<a href="#menu" style="float:right">目录</a>
## 33.3. 工厂方法模式
<a href="#menu" style="float:right">目录</a>
## 33.4. 抽象工厂模式
<a href="#menu" style="float:right">目录</a>
## 33.5. 模板方法模式
<a href="#menu" style="float:right">目录</a>
## 33.6. 建造者模式
<a href="#menu" style="float:right">目录</a>
## 33.7. 代理模式
<a href="#menu" style="float:right">目录</a>
## 33.8. 原型模式
<a href="#menu" style="float:right">目录</a>
## 33.9. 中介者模式
<a href="#menu" style="float:right">目录</a>
## 33.10. 命令模式
<a href="#menu" style="float:right">目录</a>
## 33.11. 责任链模式
<a href="#menu" style="float:right">目录</a>
## 33.12. 装饰模式
<a href="#menu" style="float:right">目录</a>
## 33.13. 策略模式
<a href="#menu" style="float:right">目录</a>
## 33.14. 适配器模式
<a href="#menu" style="float:right">目录</a>
## 33.15. 迭代器模式
<a href="#menu" style="float:right">目录</a>
## 33.16. 组合模式
<a href="#menu" style="float:right">目录</a>
## 33.17. 观察者模式
<a href="#menu" style="float:right">目录</a>
## 33.18. 门面模式
<a href="#menu" style="float:right">目录</a>
## 33.19. 备忘录模式
<a href="#menu" style="float:right">目录</a>
## 33.20. 访问者模式
<a href="#menu" style="float:right">目录</a>
## 33.21. 状态模式
<a href="#menu" style="float:right">目录</a>
## 33.22. 解释器模式
<a href="#menu" style="float:right">目录</a>
## 33.23. 享元模式
<a href="#menu" style="float:right">目录</a>
## 33.24. 桥梁模式
<a href="#menu" style="float:right">目录</a>

# 34. Zookeeper
<a href="#menu" style="float:right">目录</a>

# 35. 分布式系统
<a href="#menu" style="float:right">目录</a>