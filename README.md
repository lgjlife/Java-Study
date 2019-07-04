<h1> Java知识点总结</h1>

**声明**
本文档由[GitHub/liglife]总结整理，版权归个人所有，如果转载使用，需保留此段声明，注明来源。
[博客园:https://www.cnblogs.com/lgjlife/](https://www.cnblogs.com/lgjlife/)
[GitHub:https://github.com/lgjlife](https://github.com/lgjlife)



<H2 id="menu">目录</H2>

<!-- TOC -->

- [1. 技术社区](#1-技术社区)
- [2. 常用工具](#2-常用工具)
    - [2.1. 编译器](#21-编译器)
    - [2.2. IDEA插件](#22-idea插件)
    - [2.3. HTTP请求](#23-http请求)
    - [2.4. 前端开发编辑](#24-前端开发编辑)
    - [2.5. 绘图工具](#25-绘图工具)
        - [2.5.1. 思维导图](#251-思维导图)
        - [2.5.2. UML](#252-uml)
    - [2.6. 编辑器](#26-编辑器)
    - [2.7. 调优工具](#27-调优工具)
    - [2.8. 压测工具](#28-压测工具)
    - [2.9. 版本管理](#29-版本管理)
    - [2.10. 其他](#210-其他)
- [3. 计算机基础](#3-计算机基础)
    - [3.1. 数据类型](#31-数据类型)
        - [3.1.1. ASCII](#311-ascii)
- [4. 算法](#4-算法)
- [5. 网络TCP](#5-网络tcp)
    - [5.1. OSI网路分层](#51-osi网路分层)
    - [5.2. IP(Internet Protocol,网际协议)](#52-ipinternet-protocol网际协议)
        - [5.2.1. 基本概念](#521-基本概念)
        - [5.2.2. IP地址定义](#522-ip地址定义)
        - [5.2.3. IP协议相关技术](#523-ip协议相关技术)
            - [5.2.3.1. DNS](#5231-dns)
            - [5.2.3.2. ARP](#5232-arp)
    - [5.3. 传输层](#53-传输层)
        - [5.3.1. 基本概念](#531-基本概念)
            - [5.3.1.1. TCP和UDP差别](#5311-tcp和udp差别)
            - [5.3.1.2. 端口](#5312-端口)
        - [5.3.2. UDP](#532-udp)
        - [5.3.3. TCP](#533-tcp)
            - [5.3.3.1. 连接管理](#5331-连接管理)
            - [5.3.3.2. 超时重传机制](#5332-超时重传机制)
            - [5.3.3.3. 数据流和窗口机制](#5333-数据流和窗口机制)
            - [5.3.3.4. 阻塞控制](#5334-阻塞控制)
- [6. 网络HTTP](#6-网络http)
    - [6.1. 基本概念](#61-基本概念)
        - [6.1.1. 访问一个网站的流程](#611-访问一个网站的流程)
        - [6.1.2. 媒体类型(MIME)](#612-媒体类型mime)
    - [6.2. URL和资源](#62-url和资源)
    - [6.3. HTTP报文](#63-http报文)
        - [6.3.1. 请求报文和响应报文](#631-请求报文和响应报文)
        - [6.3.2. 首部](#632-首部)
        - [6.3.3. 方法](#633-方法)
        - [6.3.4. 状态码](#634-状态码)
    - [6.4. 连接管理](#64-连接管理)
        - [6.4.1. 对TCP性能的考虑](#641-对tcp性能的考虑)
        - [6.4.2. 持久连接](#642-持久连接)
    - [6.5. WEB服务器](#65-web服务器)
    - [6.6. 代理](#66-代理)
    - [6.7. 缓存](#67-缓存)
    - [6.8. 网关](#68-网关)
    - [6.9. 客户端识别与Cookie机制](#69-客户端识别与cookie机制)
    - [6.10. 基本认证机制](#610-基本认证机制)
    - [6.11. 摘要认证](#611-摘要认证)
    - [6.12. 安全HTTP](#612-安全http)
    - [6.13. 实体和编码](#613-实体和编码)
    - [6.14. 国际化](#614-国际化)
    - [6.15. WEB主机托管](#615-web主机托管)
    - [6.16. 重定向和负载均衡](#616-重定向和负载均衡)
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
    - [9.1. 基本概念](#91-基本概念)
    - [9.2. 常用命令](#92-常用命令)
- [10. Maven](#10-maven)
- [11. Jenkins](#11-jenkins)
- [12. Docker](#12-docker)
    - [12.1. Docker常用指令](#121-docker常用指令)
- [13. Java基础](#13-java基础)
    - [13.1. 数据类型](#131-数据类型)
        - [13.1.1. 数据类型](#1311-数据类型)
        - [13.1.2. Integer 缓存对象](#1312-integer-缓存对象)
        - [13.1.3. 数组](#1313-数组)
        - [13.1.4. String](#1314-string)
    - [13.2. 面向对象](#132-面向对象)
        - [13.2.1. 三大特性](#1321-三大特性)
        - [13.2.2. 权限修饰符](#1322-权限修饰符)
        - [13.2.3. 接口和抽象类](#1323-接口和抽象类)
        - [13.2.4. 内部类](#1324-内部类)
        - [13.2.5. 枚举类](#1325-枚举类)
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
    - [16.1. 常用语句](#161-常用语句)
        - [16.1.1.](#1611)
- [17. MyBatis](#17-mybatis)
- [18. Netty](#18-netty)
- [19. Dubbo](#19-dubbo)
- [20. Redis](#20-redis)
- [21. Spring](#21-spring)
- [22. SpringBoot](#22-springboot)
    - [22.1. 基本概念](#221-基本概念)
    - [22.2. Spring Boot 环境下创建Bean](#222-spring-boot-环境下创建bean)
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
    - [33.2. UML图](#332-uml图)
    - [33.3. 单例模式](#333-单例模式)
        - [33.3.1. 基本概念](#3331-基本概念)
        - [33.3.2. 实现](#3332-实现)
    - [33.4. 工厂方法模式](#334-工厂方法模式)
    - [33.5. 抽象工厂模式](#335-抽象工厂模式)
    - [33.6. 模板方法模式](#336-模板方法模式)
    - [33.7. 建造者模式](#337-建造者模式)
    - [33.8. 代理模式](#338-代理模式)
    - [33.9. 原型模式](#339-原型模式)
    - [33.10. 中介者模式](#3310-中介者模式)
    - [33.11. 命令模式](#3311-命令模式)
    - [33.12. 责任链模式](#3312-责任链模式)
    - [33.13. 装饰模式](#3313-装饰模式)
    - [33.14. 策略模式](#3314-策略模式)
    - [33.15. 适配器模式](#3315-适配器模式)
    - [33.16. 迭代器模式](#3316-迭代器模式)
    - [33.17. 组合模式](#3317-组合模式)
    - [33.18. 观察者模式](#3318-观察者模式)
    - [33.19. 门面模式](#3319-门面模式)
    - [33.20. 备忘录模式](#3320-备忘录模式)
    - [33.21. 访问者模式](#3321-访问者模式)
    - [33.22. 状态模式](#3322-状态模式)
    - [33.23. 解释器模式](#3323-解释器模式)
    - [33.24. 享元模式](#3324-享元模式)
    - [33.25. 桥梁模式](#3325-桥梁模式)
- [34. Zookeeper](#34-zookeeper)
    - [34.1. 基本概念](#341-基本概念)
        - [34.1.1. zk架构](#3411-zk架构)
        - [34.1.2. 提供的功能](#3412-提供的功能)
        - [34.1.3. 节点类型](#3413-节点类型)
- [35. 登录认证](#35-登录认证)
    - [35.1. Shiro](#351-shiro)
    - [35.2. oauth2](#352-oauth2)
    - [35.3. token](#353-token)
- [36. 分布式系统&高并发](#36-分布式系统高并发)
    - [基本概念](#基本概念)
    - [架构演进](#架构演进)
    - [36.1. 序列化机制](#361-序列化机制)
        - [基本概念](#基本概念-1)
        - [常用序列化方式性能比较](#常用序列化方式性能比较)
        - [常用序列化方式实现](#常用序列化方式实现)
            - [JDK方式](#jdk方式)
            - [FastJSON](#fastjson)
            - [Hessian](#hessian)
            - [Protostuff](#protostuff)
    - [36.2. 分布式锁](#362-分布式锁)
    - [36.3. 分布式ID](#363-分布式id)
    - [36.4. 微服务化](#364-微服务化)
    - [36.5. 缓存](#365-缓存)
        - [36.5.1. 缓存一致性问题](#3651-缓存一致性问题)
    - [36.6. 消息机制](#366-消息机制)
    - [36.7. 服务降级](#367-服务降级)
    - [36.8. 流量限流](#368-流量限流)
    - [36.9. 幂等设计](#369-幂等设计)
    - [36.10. 数据一致性](#3610-数据一致性)
        - [36.10.1. CAP理论](#36101-cap理论)
        - [36.10.2. Base理论](#36102-base理论)
    - [36.11. 分布式事务实现](#3611-分布式事务实现)
    - [36.12. 负载均衡算法](#3612-负载均衡算法)
    - [36.13. 服务容错设计](#3613-服务容错设计)
    - [36.14. 集群](#3614-集群)
    - [36.15. 分库分表](#3615-分库分表)
    - [36.16. 反向代理&正向代理](#3616-反向代理正向代理)
    - [36.17. 客户端优化](#3617-客户端优化)

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


## 2.3. HTTP请求
* POSTMAN（https://www.getpostman.com/）:一款功能强大的网页调试与发送网页HTTP请求的工具
* curl指令

## 2.4. 前端开发编辑
* [vscode](https://code.visualstudio.com/Download)
* IDEA
* Brackets   代码提示，颜色区分
* sublime_text_3   这个Linux下安装后，不支持中文输入，网上有解决办法。

## 2.5. 绘图工具
### 2.5.1. 思维导图
* MindMaster   多平台，免费，可以导出为图片。
### 2.5.2. UML
* https://www.draw.io/ ：在线UML绘制工具，可以保存到本地或者Github
* Dia
```bash
//安装Dia
sudo apt install dia
//运行Dia
dia
```
## 2.6. 编辑器
* VIM
* GEDIT　

## 2.7. 调优工具
* visualVm(https://visualvm.github.io/):是一款免费的,集成了多个 JDK 命令行工具的可视化工具,它能为您提供强大的分析能力,对 Java 应用程序做性能分析和调优.

## 2.8. 压测工具
* Jmeter   可以开多个线程对接口进行压测，并分析压测结果。

## 2.9. 版本管理
* git     
* svn
* 码云
* Git在线练习 [try git](https://try.github.io/)/[git real](https://www.pluralsight.com/courses/code-school-git-real)/[Learn Git Branching](https://learngitbranching.js.org/)

## 2.10. 其他
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
|---|---|---|---|
|0010 0000|	32|	20|	（空格）(␠)
|0010 0001|	33|	21	|!
|0010 0010|	34|	22	|"
|0010 0011|	35|	23	|#
|0010 0100|	36|	24|	$
|0010 0101|	37|	25|	 %
|0010 0110|	38|	26|	&
|0010 0111|	39|	27|	'
|0010 1000|	40|	28|	(
|0010 1001|	41|	29|	)
|0010 1010|	42|	2A|	*
|0010 1011|	43|	2B|	+
|0010 1100|	44|	2C|	,
|0010 1101|	45|	2D|	-
|0010 1110|	46|	2E|	.
|0010 1111|	47|	2F|	/
|0011 0000|	48|	30|	0
|0011 0001|	49|	31|	1
|0011 0010|	50|	32|	2
|0011 0011|	51|	33|	3
|0011 0100|	52|	34|	4
|0011 0101|	53|	35|	5
|0011 0110|	54|	36|	6
|0011 0111|	55|	37|	7
|0011 1000|	56|	38|	8
|0011 1001|	57|	39|	9
|0011 1010|	58|	3A|	:
|0011 1011|	59|	3B|	;
|0011 1100|	60|	3C|	<
|0011 1101|	61|	3D|	=
|0011 1110|	62|	3E|	>
|0011 1111|	63|	3F|	?
|0100 0000|	64|	40	|@
|0100 0001|	65|	41	|A
|0100 0010|	66|	42	|B
|0100 0011|	67|	43	|C
|0100 0100|	68|	44	|D
|0100 0101|	69|	45	|E
|0100 0110|	70|	46	|F
|0100 0111|	71|	47	|G
|0100 1000|	72|	48	|H
|0100 1001|	73|	49	|I
|0100 1010|	74|	4A	|J
|0100 1011|	75|	4B	|K
|0100 1100|	76|	4C	|L
|0100 1101|	77|	4D	|M
|0100 1110|	78|   4E	|N
|0100 1111|	79|	4F|	O
|0101 0000|	80|	50	|P
|0101 0001|	81|	51	|Q
|0101 0010|	82|	52	|R
|0101 0011|	83|	53	|S
|0101 0100|	84|	54	|T
|0101 0101|	85|	55	|U
|0101 0110|	86|	56	|V
|0101 0111|	87|	57	|W
|0101 1000|	88|	58	|X
|0101 1001|	89|	59	|Y
|0101 1010|	90|	5A	|Z
|0101 1011|	91|	5B	|[
|0101 1100|	92|	5C	|\
|0101 1101|	93|	5D	|]
|0101 1110|	94|	5E	|^
|0101 1111|	95|	5F	|_
|0110 0000|	96|	60	|`
|0110 0001|	97|	61	|a
|0110 0010|	98|	62	|b
|0110 0011|	99|	63	|c
|0110 0100|	100|	64	|d
|0110 0101|	101| 65	|e
|0110 0110|	102|	66	|f
|0110 0111|	103|	67	|g
|0110 1000|	104|	68	|h
|0110 1001|	105|	69	|i
|0110 1010|	106|	6A	|j
|0110 1011|	107|	6B	|k
|0110 1100|	108|	6C	|l
|0110 1101|	109|	6D	|m
|0110 1110|	110|	6E	|n
|0110 1111|	111|	6F	|o
|0111 0000|	112|	70	|p
|0111 0001|	113|	71	|q
|0111 0010|	114|	72	|r
|0111 0011|	115|	73	|s
|0111 0100|	116|	74	|t
|0111 0101|	117|	75	|u
|0111 0110|	118|	76	|v
|0111 0111|	119|	77	|w
|0111 1000|	120|	78	|x
|0111 1001|	121|	79	|y
|0111 1010|	122|	7A	|z
|0111 1011|	123|	7B	|{
|0111 1100|	124|	7C	|\|
|0111 1101|	125|	7D	|}
|0111 1110|	126|	7E	|~



# 4. 算法
<a href="#menu" style="float:right">目录</a>
# 5. 网络TCP
<a href="#menu" style="float:right">目录</a>
## 5.1. OSI网路分层



![](https://github.com/lgjlife/Java-Study/pic/tcp/osi.png)

||层|说明||
|---|---|---|---|
|7|应用层|针对特定应用的协议|电子邮件，远程登录，文件传输等。HTTP，DNS，DHCP，SSH，FTP|
|6|表示层|设备固有数据格式和网络标准数据格式的转换|接收不同表现形式的信息，比如文字，图片，声音等|
|5|会话层|通信管理，负责建立连接和断开通信连接，管理传输层以下的分层|何时建立连接，何时断开连接，保持多久的连接|
|4|传输层|管理两个节点之间的可靠传输|TCP，UDP，SCYP，DCCP|
|3|网络层|地址管理和路由选择|如何通过IP地址寻找目标主机，IPV4,IPV6,ARP地址解析协议|
|2|数据链路层|互联设备之间传送和识别数据帧|数据帧和比特位之间的转换|
|1|物理层|数据比特流在实际物理设备上的传输，比如光纤。负责比特流和物理电压之间的转换||
![](https://github.com/lgjlife/Java-Study/blob/master/pic/tcp/send.png?raw=true)
在数据发送时，下层不会改变上层的PDU（消息），只会在上层上添加头部或者尾部信息。
* 分层优点
    * 解耦，每层内部协议改变，不影响其他层。
    * 开发方便，每层负责自己的协议即可。
* 传输方式分类
    * 有连接型
        * 发送数据前，两个通信端必须建立连接的通信链路(TCP)
    * 无连接型
        * 不要求建立和断开连接，发送端任何时候都可以发送数据(UDP)
    * 根据接收端数据分类
        * 单播：一对一通信
        * 多播:一对多通信，组播通信
        * 任播:特定的多台主机中选出一台进行通信
## 5.2. IP(Internet Protocol,网际协议)
### 5.2.1. 基本概念
IP协议负责将数据包发送给最终的目标主机。
通信链路层是负责两个直连两个设备之间的通信，而IP是负责两个没有直连设备之间的通信。每个计算机都有自己的IP地址，发送端在发送数据之前要先确定接收者是属于哪台计算机。也就是ARP地址解析协议，通过广播发送请求，有回应的是便是目标主机，然后获取目标主机的网卡地址，缓在发送端，下次发送的时候，就可以从缓存中获取到目标主机的网卡地址。

* IP协议是面向无连接的，通信可靠性由上层解决
    * 一是为了简化
    * 二是为了快速
### 5.2.2. IP地址定义

* IPV4
    * 使用32位来表示，每8位一组，中间使用"."分隔
    * 最大值2的32次方，也就是42.94亿，无法满足全球用户
    * 组成
        * 由网络标识(网络地址)和主机标识(主机地址)组成
        * 192.168.1.10/24
        * "/24"表示从第一位到24位是网络标识，后面的为主机标识
        * 路由器通过比较网络标识决定如何转发
        * 同一个网络标识作为一个网段
    * IPV4地址的分类
        * A类
            * 0开头的地址
            * 第一位到第八都是它的网络标识：0.0.0.0～127.0.0.0
            * A类地址后24位为主机标识，也就是A类网段可以容纳16777214个主机
        * B类
            * "10"开头的地址
            * 1～16位是它的网络标识，128.0.0.1～191.255.0.0是B类的网络地址
            * 后16位是主机标识，所以B类一个网段可以容纳的主机最大为65534
        * C类
            * "110"开头的地址
            * 1~24位是网络标识，192.168.0.0～239.255.255.0
            * 主机标识为后8位，一个网段最大主机数为254个
        * D类
            * "1110"开头的地址
            * 1~32位是它的网络标识，224.0.0.0～239.255.255.255
            * 没有主机标识，常被用于多播
        * IP主机地址不能全部为0或者全闭为1
            * 全部为0表示IP地址或者网络地址不可获知的情况下才使用，因此上面每个都少了两个IP地址。
            * 全部为1通常用作广播地址
    * 广播
        * 广播主机地址全部设置为1
        * 本地广播:本网络内的广播
        * 直接广播:不同网络之间的广播
    * IP多播
        * 广播是将数据发送给网络上的所有计算机，由于不是目标的主机也会收到消息，因此造成通讯效率差。
        * 多播是放送给特定组的主机
        * 应用场景:电视会议中的1对多
        * 多播采用D类地址   

* IPV4首部

||长度(bit)|
|---|---|
|版本 Version|4|
|首部长度 IHL|4|
|区分服务 Type of Service|8|
|总长度 Total Length|32|
|标识 Identification|16|
|标志 Flags|3|
|片偏移 Fragment Offset|29|
|生存时间 Time To Live |8|
|协议 Protocal|8|
|首部校验和 Header CheckSum|32|
|源地址 Source Address |32|
|目标地址 Destination Adress|32|
|可选字段 Options|24|
|填充 Padding|8|
|实际的数据部分Data|~|



* IPV6
    * IPV6地址
        * 长度为128位，16位为1组，中间使用::分隔
        * 二进制表示
            * 10101010:10101010:10101010:10101010:10101010:10101010:10101010:10101010
        * 16进制表示
            * AABB:AABB:AABB:AABB:AABB:AABB:AABB:AABB
        * 省略表示，中间连续多个0的,使用::替换
            * AABB:0:0:0:0:0:0:AABB
            * AABB::AABB
            
||||
|---|---|---|
|未定义|0000...0000（128比特位）|::/128|
|环回地址|0000...0001|::1/128|
|唯一本地地址|1111 110|FC00::/7|
|链路本地单播地址|1111 1110 10|FE8O::/10|
|多播地址|11111111|FF00::/8|
|全局单播地址|其他||

### 5.2.3. IP协议相关技术
#### 5.2.3.1. DNS
TCP/IP网络中，每一个互联的设备都有其唯一的IP地址，都可以通过IP地址访问到对方。但是IP地址不便于记忆，因此产生了一种方式，就是给每台计算机赋予唯一的主机名，可以通过主机名访问该主机名对应的IP地址的计算机。在这个背景下，便产生了一个可以有效管理主机名和IP地址之间对应关系的系统，那就是DNS系统。

**域名**:域名是为了识别主机名称和组织机构名称的一种具有分层的名称。比如:www.baidu.com
![](https://github.com/lgjlife/Java-Study/blob/master/pic/tcp/yuming.png?raw=true)
**域名服务器**:域名服务器是指管理域名的主机和相应的软件，它可以管理所在分层的域的相关信息。根部所设置的DNS叫做根域名服务器。他对DNS的检索起着至关重要的作用。根域名服务器注册着根以下第一层域名服务器的IP地址。也就是说上一层注册着下一层的域名服务器的IP地址。根据每个域名服务器所管理的域名，如果下面再没有其他分层，就可以自由的指定主机名称或者子网名称。如果想修改分层的域名名称或者想重新修改域名服务器的IP地址，还必须向其上层的域名服务器进行追加或修改。
由于是分层设计，如果某一台域名服务器宕机，那么针对该域名的查询将会失效，一般设置两台以上域名服务器，以提高容灾能力，第一个查询失败，则转到另一个。

**域名查询**
* 进行DNS查询的主机和软件叫做DNS解析器
* 查询过程

![](https://github.com/lgjlife/Java-Study/blob/master/pic/tcp/dns-search.png?raw=true)
解析器为了查询IP地址，向域名服务器查询，接收这个请求的域名服务器先在自己的数据库中查找，没有查找到则向上一级查找，直至遍历完查找到，查找到则将数据缓存起来，下次使用可以从缓存里面获取。

#### 5.2.3.2. ARP
DNS是通过访问名称获取到IP地址，但是有进行访问还需要获取到这个IP地址对应的MAC地址。

* 查找流程:
    * 主机A访问主机B
    * 主机A广播发送一个ARP请求包，这个包包括主机B的IP地址
    * 这个广播包将会被链路上所有的计算机接收并解析
    * 如果请求包中的IP地址和自己的IP地址一致，那么这个节点将会把自己的MAC地址塞入ARP响应包并返回给主机A
    * 主机A获取到主机B的MAC地址，就可以和主机B进行通信了。
    * 主机A会将主机B的MAC地址进行缓存到本地，以供下次使用
    * 这个缓存会按照一定机制被清除，也就是有过期时间。同时若请求失败，也会重新发起获取MAC地址请求。

## 5.3. 传输层
<a href="#menu" style="float:right">目录</a>

### 5.3.1. 基本概念

#### 5.3.1.1. TCP和UDP差别

 TCP和UDP是传输层的两个具有代表性的传输层协议。TCP提供可靠的通信传输。UDP常被用于广播和细节控制交给应用的通信传输，比如可靠性保证，失败重传等策略由应用实现。
 IP首部字段有一个字段标明传输层使用的是UDP还是TCP或者其他协议。

* TCP
    * 面向连接的，可靠的流协议。流指不间断的数据结构。
    * 在发送数据之前，必须建立连接
    * 提供复杂的功能，比如顺序控制，重发机制，流量控制
    * 应用场景是需要可靠性传输的场景
* UDP
    * 不具有可靠性的数据报协议
    * 不需要建立连接就能发送数据
    * 没有TCP复杂的辅助功能，需要应用自己实现
    * 应用场景是告诉传输和实行性有较高要求的场景，比如广播，IP电话等

* 套接字(Socket)
    * 操作系统提供的网络编程接口

* HTTP或者TCP中常出现的长连接，都是基于TCP来实现，也就是创建TCP连接以后不关闭，一直保持连接状态，下次发送数据的时候就可以不用重新建立连接，毕竟建立TCP连接是很费时的事情，不再通信时再关闭连接。

#### 5.3.1.2. 端口
数据链路中的MAC地址: 识别同一链路中的不同计算机
IP中的IP地址:识别TCP/IP网络中互联的主机和路由器
端口号:用于识别同一台计算机中不同的应用程序


端口号的范围万为0-65535之间
（1）公认端口（WellKnownPorts）：从0到1023，它们紧密绑定（binding）于一些服务。通常这些端口的通讯明确表明了某种服务的协议。例如：80端口实际上总是HTTP通讯。
（2）注册端口（RegisteredPorts）：从1024到49151。它们松散地绑定于一些服务。也就是说有许多服务绑定于这些端口，这些端口同样用于许多其它目的。例如：许多系统处理动态端口从1024左右开始。
（3）动态和/或私有端口（Dynamicand/orPrivatePorts）：从49152到65535。理论上，不应为服务分配这些端口。实际上，机器通常从1024起分配动态端口。但也有例外：SUN的RPC端口从32768开始

### 5.3.2. UDP
### 5.3.3. TCP
TCP通信中的四元组:源IP，源端口，目标IP，目标端口

#### 5.3.3.1. 连接管理
![](https://github.com/lgjlife/Java-Study/blob/master/pic/tcp/tcp-connect.png?raw=true)
* 三次连接
    * 客户端发送一个SYN报文，并指明自己想要连接的端口号和它的客户端初始序列号(ISN(C))
    * 服务端返回响应报文，并带上它的初始序列号(SYN(S)),ACK为客户端的序列号+1
    * 确认服务器的响应报文，回复Seq和ACK如图

* 四次断开
    * 客户端发送给FIN报文请求关闭 
    * 服务端响应客户端关闭请求
    * 服务端发送FIN报文请求关闭
    * 客户端响应服务端关闭请求

* SYN攻击
在三次握手过程中，服务器发送SYN-ACK之后，收到客户端的ACK之前的TCP连接称为半连接(half-open connect).此时服务器处于Syn_RECV状态.当收到ACK后，服务器转入ESTABLISHED状态.Syn攻击就是 攻击客户端 在短时间内伪造大量不存在的IP地址，向服务器不断地发送syn包，服务器回复确认包，并等待客户的确认，由于源地址是不存在的，服务器需要不断的重发直 至超时，这些伪造的SYN包将长时间占用未连接队列，正常的SYN请求被丢弃，目标系统运行缓慢，严重者引起网络堵塞甚至系统瘫痪。Syn攻击是一个典型的DDOS攻击。检测SYN攻击非常的方便，当你在服务器上看到大量的半连接状态时，特别是源IP地址是随机的，基本上可以断定这是一次SYN攻击.在Linux下可以如下命令检测是否被Syn攻击netstat -n -p TCP | grep SYN_RECV一般较新的TCP/IP协议栈都对这一过程进行修正来防范Syn攻击，修改tcp协议实现。主要方法有SynAttackProtect保护机制、SYN cookies技术、增加最大半连接和缩短超时时间等.
但是不能完全防范syn攻击

* 为什么要进行三次握手
    * 假如连接时没有第三次ACK回复。当客户端第一次SYN请求时，由于网络拥堵，客户端检测超时重新发送SYN请求，第二次服务端收到并回复ACK，此时连接建立。后来又收到客户端的第一次请求，服务端以为是新的请求，返回ACK，但是客户端并没有发新的连接请求，所以会忽略服务端的ACK，但是服务端认为这个连接是存在的，其实是一个无效连接，因此会占用服务端的连接资源。
    假如有三次握手，服务端收到客户端的第一次请求并返回ACK之后，即使客户端忽略了该ACK响应，但是服务端超时未收到客户端的ACK将会断开本次连接。

* 为什么需要四次挥手
    * 这是因为服务端在LISTEN状态下，收到建立连接请求的SYN报文后，把ACK和SYN放在一个报文里发送给客户端。而关闭连接时，当收到对方的FIN报文时，仅仅表示对方不再发送数据了但是还能接收数据，己方也未必全部数据都发送给对方了，所以己方可以立即close，也可以发送一些数据给对方后，再发送FIN报文给对方来表示同意现在关闭连接，因此，己方ACK和FIN一般都会分开发送.

**连接时的11种状态**

|状态|说明|
|---|---|
|CLOSED|初始状态，表示TCP连接是“关闭着的”或“未打开的”。
|LISTEN|表示服务器端的某个SOCKET处于监听状态，可以接受客户端的连接。
|SYN_RCVD |表示服务器接收到了来自客户端请求连接的SYN报文。在正常情况下，这个状态是服务器端的SOCKET在建立TCP连接时的三次握手会话过程中的一个中间状态，很短暂，基本上用netstat很难看到这种状态，除非故意写一个监测程序，将三次TCP握手过程中最后一个ACK报文不予发送。当TCP连接处于此状态时，再收到客户端的ACK报文，它就会进入到ESTABLISHED 状态。
|SYN_SENT|这个状态与SYN_RCVD 状态相呼应，当客户端SOCKET执行connect()进行连接时，它首先发送SYN报文，然后随即进入到SYN_SENT 状态，并等待服务端的发送三次握手中的第2个报文。SYN_SENT 状态表示客户端已发送SYN报文。
|ESTABLISHED |表示TCP连接已经成功建立。
|FIN_WAIT_1 |这个状态得好好解释一下，其实FIN_WAIT_1 和FIN_WAIT_2 两种状态的真正含义都是表示等待对方的FIN报文。而这两种状态的区别是：FIN_WAIT_1状态实际上是当SOCKET在ESTABLISHED状态时，它想主动关闭连接，向对方发送了FIN报文，此时该SOCKET进入到FIN_WAIT_1 状态。而当对方回应ACK报文后，则进入到FIN_WAIT_2 状态。当然在实际的正常情况下，无论对方处于任何种情况下，都应该马上回应ACK报文，所以FIN_WAIT_1 状态一般是比较难见到的，而FIN_WAIT_2 状态有时仍可以用netstat看到。
|FIN_WAIT_2 |上面已经解释了这种状态的由来，实际上FIN_WAIT_2状态下的SOCKET表示半连接，即有一方调用close()主动要求关闭连接。注意：FIN_WAIT_2 是没有超时的（不像TIME_WAIT 状态），这种状态下如果对方不关闭（不配合完成4次挥手过程），那这个 FIN_WAIT_2 状态将一直保持到系统重启，越来越多的FIN_WAIT_2 状态会导致内核crash。
|TIME_WAIT |表示收到了对方的FIN报文，并发送出了ACK报文。 TIME_WAIT状态下的TCP连接会等待2*MSL（Max Segment Lifetime，最大分段生存期，指一个TCP报文在Internet上的最长生存时间。每个具体的TCP协议实现都必须选择一个确定的MSL值，RFC 1122建议是2分钟，但BSD传统实现采用了30秒，Linux可以cat /proc/sys/net/ipv4/tcp_fin_timeout看到本机的这个值），然后即可回到CLOSED 可用状态了。如果FIN_WAIT_1状态下，收到了对方同时带FIN标志和ACK标志的报文时，可以直接进入到TIME_WAIT状态，而无须经过FIN_WAIT_2状态。（这种情况应该就是四次挥手变成三次挥手的那种情况）
|CLOSING |这种状态在实际情况中应该很少见，属于一种比较罕见的例外状态。正常情况下，当一方发送FIN报文后，按理来说是应该先收到（或同时收到）对方的ACK报文，再收到对方的FIN报文。但是CLOSING 状态表示一方发送FIN报文后，并没有收到对方的ACK报文，反而却也收到了对方的FIN报文。什么情况下会出现此种情况呢？那就是当双方几乎在同时close()一个SOCKET的话，就出现了双方同时发送FIN报文的情况，这是就会出现CLOSING 状态，表示双方都正在关闭SOCKET连接。
|CLOSE_WAIT|表示正在等待关闭。怎么理解呢？当对方close()一个SOCKET后发送FIN报文给自己，你的系统毫无疑问地将会回应一个ACK报文给对方，此时TCP连接则进入到CLOSE_WAIT状态。接下来呢，你需要检查自己是否还有数据要发送给对方，如果没有的话，那你也就可以close()这个SOCKET并发送FIN报文给对方，即关闭自己到对方这个方向的连接。有数据的话则看程序的策略，继续发送或丢弃。简单地说，当你处于CLOSE_WAIT 状态下，需要完成的事情是等待你去关闭连接。
|LAST_ACK|当被动关闭的一方在发送FIN报文后，等待对方的ACK报文的时候，就处于LAST_ACK 状态。当收到对方的ACK报文后，也就可以进入到CLOSED 可用状态了。


#### 5.3.3.2. 超时重传机制
#### 5.3.3.3. 数据流和窗口机制
#### 5.3.3.4. 阻塞控制 


# 6. 网络HTTP
<a href="#menu" style="float:right">目录</a>

## 6.1. 基本概念
### 6.1.1. 访问一个网站的流程
* 输入网址
* DNS域名解析服务解析域名，获取域名对应的服务器IP
* ARP地址解析协议根据IP查找服务端的MAC地址
* TCP 3次连接流程，客户端和服务端建立连接
* 连接建立之后，客户端发送请求
* 服务端收到请求之后，进行业务处理，根据请求返回客户端的数据。
* 客户端收到服务端响应，渲染页面
* 如果是短连接，客户端将发送关闭连接请求。也就是四次挥手。
### 6.1.2. 媒体类型(MIME)
* 因特网上有数千种不同的数据类型，http会给每种要通过web传输的对象都打上一个名为MIME类型（MIME type）的数据格式标签
* web服务器会为所有http对象数据附加一个MIME类型。
* 当web浏览器从服务器中取回一个对象时，会去查看相关的MIME类型，看看他们是否知道如何处理这个对象。
* 大多数浏览器都可以处理数百种常见的对象类型：显示图片文件、解析并格式化html文件等等。
* MIME类型是一种文本标记，表示一种主要的对象类型和一个特定的子类型，中间由一个斜杠来分割。

## 6.2. URL和资源
<a href="#menu" style="float:right">目录</a>
URI是一类更通用的资源标识符，URL是它的一个子集。URI由两个子集URL和URN构成。URL通过描述资源的位置类标识资源。URN则通过名字来识别。

URI = Universal Resource Identifier 统一资源标志符
URL = Universal Resource Locator 统一资源定位符
URN = Universal Resource Name 统一资源名称

* URL
    * 第一部分就是访问资源所用的协议，比如Http,ftp
    * 第二部分就是资源所在的服务器网站，比如www.baidu.com
    * 第三部分，资源在服务器中的位置，比如 /xxx/xx.pic

目前，基本所有的URI都为URL，URN还在实验阶段。

URL通用格式：
```
<scheme>://<user>:<password>@<host>:port/path;<param>?<query>#<frag>
```
|组件|描述|默认值|
|---|---|---|
|方案|访问资源时的协议|无|
|用户|用户名|匿名|
|密码|访问密码||
|主机|访问资源所在的宿主主机的IP地址|无|
|端口|资源所在应用的端口|无|
|路径|资源在服务器上的访问路径|无|
|参数|参数之间使用(;)分隔||
|查询|查询字符串？a=1234;b=234||
|片段|一小片或者一部分资源的名字，不会将其发送给服务器，仅在客户端内部使用||


## 6.3. HTTP报文
<a href="#menu" style="float:right">目录</a>

### 6.3.1. 请求报文和响应报文

* 格式：
```
报文首部(包括请求行和请求头)
空行
报文主体

HTTP/2.0 200 OK
Content-type: text/html
Set-Cookie: yummy_cookie=choco
Set-Cookie: tasty_cookie=strawberry

[page content]

```
* 请求报文格式
```
<method> <request-url> <version>
<headers>

<entity-body>
```
* 响应报文格式
```
<version> <status> <reason-phrase>
<headers>

<entity-body>
```
method: 请求方法，GET，POST等
request-url: 请求资源在服务器内的URL
version: HTTP版本 ， 格式： http/1.1
headers：请求头和响应头,格式： Connection: close
status: 状态码，401/404
reason-phrase: 原因短语,状态码的简要说明
body: 实际数据部分，可以承载很多类型的数据，比如图片，音频，视频等

### 6.3.2. 首部
HTTP 首部字段根据实际用途被分为以下 4 种类型：
* 通用首部字段（General Header Fields）
  请求报文和响应报文两方都会使用的首部。
* 请求首部字段（Request Header Fields）
从客户端向服务器端发送请求报文时使用的首部。补充了请求的附加内容、客户端信息、响应内容相关优先级等信息。
* 响应首部字段（Response Header Fields）
从服务器端向客户端返回响应报文时使用的首部。补充了响应的附加内容，也会要求客户端附加额外的内容信息。
* 实体首部字段（Entity Header Fields）
针对请求报文和响应报文的实体部分使用的首部。补充了资源内容更新时间等与实体有关的信息。

如果首部内容过长，可以分行写，但是前面必须有空格或者制表符。

[首部官方说明：https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html](https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html)
* 通用首部
    * Date：报文创建时间
    * Connection：客户端和服务器连接的有关选项
    * Via：报文经过的中间节点（代理、网关）
    * Cache-control：缓存

* 请求首部
    * From：客户端用户的E-mail地址
    * Host：接受请求的服务器的主机名和端口
    * Referer：当前请求的URL
    * UA-Color：客户端显示器颜色信息
    * UA-OS：客户端操作系统及版本
    * Accept：告诉服务器能够发送的媒体类型
    * Accept-Charset：告诉服务器能够发送的字符集
    * Accept-Encoding：告诉服务器能够发送的编码方式
    * Accept-Language：告诉服务器能够发送的语言
    * Expect：要求服务器的行为
    * If-Match：实体标记与文档当前的标记相匹配，则获取该文档
    * If-Modified-Since：除非在某个指定日期后资源被修改过，否则限制该请求
    * If-None-Match：实体标记与文档当前的标记不匹配，则获取该文档
    * If-Unmodified-Since：除非在某个指定日期后资源没有被修改过，否则限制该请求
    * Authorization：包含客户端提供给服务端，以便进行安全认证的数据
    * Cookie：客户端需要发送的cookie
    * Cookie2：客户端支持的cookie版本

* 响应首部
    * Server：服务器应用软件名称及版本
    * Accept-Range：服务器可以接受的范围类型
    * Set-Cookie：设置cookie

* 实体首部
    * Allow：对该实体可执行的请求方法
    * Location：资源的新地址，重定向中常用到
    * Content-Language：理解主体应该使用的语言
    * Content-Length：主体的长度
    * Content-Encoding：对主体实行的编码方式
    * Content-Range：在整个资源中实体表示的字节范围
    * Content-Type：主体的类型
    * ETag：与实体相关的实体标记
    * Expires：实体不再有效，需要再次获取该实体的时间
    * Last-Modified：实体最后一次被修改的时间
### 6.3.3. 方法

* GET
    * 通常用于向服务器请求资源
    * GET请求的参数将会拼接在URL后面，因此如果是密码等参数，会存在安全性问题
    * GET请求的URL有长度限制问题，不是协议本身限制，是浏览器限制，每个浏览器都不同
    * GET 请求可被缓存
    * GET 请求保留在浏览器历史记录中
    * GET 请求可被收藏为书签
    * GET 请求不应在处理敏感数据时使用
    * GET 请求只应当用于取回数据
* POST
    * 向服务器写入数据请求。
    * POST 请求不会被缓存
    * POST 请求不会保留在浏览器历史记录中
    * POST 不能被收藏为书签
    * POST 请求对数据长度没有要求,一般也是web服务器的限制
* HEAD
    * 服务器响应只返回首部，不返回body数据
    * 在不获取资源的情况下了解资源的类型
    * 通过查看状态码，查看资源是否存在
    * 查看首部，测试资源是否被修改

* PUT
    * 向服务器写入数据请求。
* TRACE
    * 用于回环测试
    * 每个请求可能经过网关，代理，防火墙等，测试经过这些之后报文发生了啥变化
    * 最后接收到的服务器将会返回TRACE响应，响应主体为原始请求报文
* OPTIONS
    * 查看资源支持的方法，通过响应头中的Allow: GET,POST
* DELETE
    * 请求删除资源

### 6.3.4. 状态码

* 1xx 信息性状态码
    * 100/Continue: 说明收到了请求的初始部分，请客户端继续
    * 101 Switching Protocols ：说明服务器正在根据客户端的指定，将协议切换成Udate首部所列的协议

* 2xx 正常
    * 200 OK,请求正常
    * 204 NO Content,请求处理成功，但是返回的请求主体中没有内容。
* 3xx 重定向
    * 301 Moved Permanenty ,永久重定向，该状态标识请求的资源已经分配新的URL，以后使用新的URI进行访问。Location返回新的URI
    * 302 Found,临时性重定向,该状态标识请求的资源已经分配新的URL，希望用户本次使用新的URI进行访问。
    * 303 See Other,URI已经更新，应使用GET方法使用新的uri获取资源。
    * 304 Not Modified,客户端发送附带条件的请求时(首部：If-match,If-Modified-Sinch,If-None-Match,If-Range,If-Unmodified-Since),服务端允许请求访问资源，但未满足条件的情况，此时响应不包含任何主体。
* 4xx 客户端错误
    * 400 Bad Request,错误的请求，请求报文存在语法错误。
    * 401 Unauthorzied,用户认证失败
    * 403 Forbidden,被拒绝访问
    * 404 Not Found ,无法找到资源，可能路径\方法\请求参数有问题
* 5xx 服务器错误
    * 500 Internal Server Error,服务器内部错误，比如抛出异常。
    * 503 Service Unavailable,服务不可用，常见场景是网关正常，但是底下的服务不正常。

## 6.4. 连接管理
<a href="#menu" style="float:right">目录</a>
HTTP要传送一条报文时，会以流的形式将报文数据的内容通过一条打开的TCP连接按序传输，TCP收到数据流之后，会将数据流砍成被称作段的小数据块。并将段封装在IP分组中，通过因特网进行传输。

### 6.4.1. 对TCP性能的考虑
HTTP是TCP的上层，主要通信实现由TCP/IP层实现，因此影响性能的主要也是这两层。
影响性能主要以下几点
* 首次访问时的DNS域名解析，可能花费数十秒，后续访问会进行缓存。
* TCP连接建立过程
### 6.4.2. 持久连接

* HTTP1.0方式
    * keep-alive实现 ,keep-Alive 也是首部字段,由服务器响应决定
        * keep-Alive： max=5,timeout=120 
        * max:服务器能接受的最大长连接数
        * timeout: 服务器希望连接在活跃状态的时间
    * 客户端请求时包含头部: Connection: keep-Alive.请求将一条连接保持在打开状态
    * 服务端响应若返回头部: Connection: keep-Alive，则说明支持持久连接，否则将关闭本次连接。
* HTTP1.1方式
    * 默认情况下激活，也就是默认情况下保持长连接
    * 客户端若收到的响应中包含首部信息: Connection: close，将会关闭连接。
    * 客户端和服务端可以随时关闭连接
    * 客户端发送一个请求首部  Connection: close之后将不能在该连接上发送信息。
    * HTTP1.1的代理必须能够分别管理客户端和服务端的持久连接。
    
## 6.5. WEB服务器
<a href="#menu" style="float:right">目录</a>

## 6.6. 代理
<a href="#menu" style="float:right">目录</a>

## 6.7. 缓存
<a href="#menu" style="float:right">目录</a>

## 6.8. 网关 
<a href="#menu" style="float:right">目录</a>

## 6.9. 客户端识别与Cookie机制
<a href="#menu" style="float:right">目录</a>

## 6.10. 基本认证机制
<a href="#menu" style="float:right">目录</a>

## 6.11. 摘要认证
<a href="#menu" style="float:right">目录</a>

## 6.12. 安全HTTP
<a href="#menu" style="float:right">目录</a>

## 6.13. 实体和编码
<a href="#menu" style="float:right">目录</a>

## 6.14. 国际化
<a href="#menu" style="float:right">目录</a>

## 6.15. WEB主机托管
<a href="#menu" style="float:right">目录</a>

## 6.16. 重定向和负载均衡
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

## 9.1. 基本概念
* 工作区：当前的工作目录
* 本地库: 工作区有一个隐藏目录.git，这个不算工作区，而是Git的版本库
  Git的版本库里存了很多东西，其中最重要的就是称为stage（或者叫index）的暂存区，还有Git为我们自动创建的第一个分支master，以及指向master的一个指针叫HEAD
![](https://www.liaoxuefeng.com/files/attachments/919020037470528/0)
* 远端仓库: 存放在GitHub网站上的版本库

工作区---git add --> 暂存区 ---git commit--->本地仓库---git push --->远程仓库

![](http://img5.imgtn.bdimg.com/it/u=4071081808,3892000553&fm=26&gp=0.jpg)
* 分支相当于给当前的文件创建一个副本，在副本上进行修改，可以创建无数个分支进行同步开发，开发完成后再进行合并操作。

## 9.2. 常用命令
* 查看版本
    * git --version
* 配置
    * 配置文件
        * 版本库配置文件，优先级最高位于版本库.git/config中
            * 进入工作空间
            * git config -e 打开，编辑
        * 全局配置文件，优先级次之，用户目录下的。gitconfig
            * git config -e --global 打开编辑
        * 系统级配置文件,优先级最低，/etc/gitconfig
            * git config -e --system
    * 配置用户名和邮箱
        * git config --global user.name "xxx"
        * git config --global user.name 读取配置信息用户名称
        * git config --unset  --global user.name 删除用户信息
        * git config --global user.email "xxx@xxx"
* 初始化一个仓库
    * git init
* 为本地仓库关联远程仓库
    * git remote add origin git@github.com:yourName/yourRepo.git 
        * origin 为自定义名称，可以取github/gitee,就可以关联不同的远端库了
        * git push github master /git push gitee master
    * git remote -v 查看关联的远端仓库
    * git remote rm origin 删除关联的远程库信息
    
* 将更新的文件提交到本地暂存区
    * git add .    添加所有的文件
    * git add demo.text 只添加demo.text文件
* 将本地暂存区的文件提交到本地仓库
    * git commit -m "xxxx"  添加一行信息
    * git commit 不加-m,将会弹出新编辑窗口，需要按照以下格式编写，如果此时想终止提交，需将编辑器内容清空，并直接关闭，提交会被终止。
        * 第一行：用一行文字简述提交的更改内容
        * 第二行: 空行
        * 第三行以后，详细描述更改的内容

* 查看提交后的状态
    * git status
* 查看提交日志
    * git log 
        * 提交ID
        * 提交人
        * 提交时间
        * 提交前后差别
    * git log --pretty=short 只显示提交信息的第一行
    * git log xx.file 只显示指定目录或者文件的日志
    * git log -p xx.file 显示文件前后差别
    * git log --graph 以图表形式查看分支
    * git log --graph --oneline 查看每次提交的短ID
    * git reflog 查看当前仓库的操作日志，获取短ID
* 查看更改前后的区别
    * 工作树---git add --> 暂存区---git commit --> 本地仓库---git push --> 远程仓库
    * 修改文件--->git diff--->显示工作树和暂存区的区别
    * git add --->git diff ---> 什么都不显示，因为工作树和暂存区内容一致
    * git add --->git diff HEAD --->显示暂存区和本地仓库的区别，在commmit之前应该执行该命令，验证是否修改错误。这里的HEAD指的是当前分支中最新一次提交的指针
    * 显示的内容差异内容中，"+"表示添加的内容，"-"表示减少的内容
* 分支操作
    * 分支管理
        * master 应当为稳定分支，不应该在master上修改代码
        * dev 开发分支，比如说加新功能
        * fix 修复Bug分支
        * 每一次和master合并分支前，应当使用git pull 拉取远端仓库最新的代码，避免在push时出现冲突。
    * 显示所有分支
        * git branch  带*的是当前的分支
        * git branch -a 显示远程分支和本地分支
    * 创建，切换分支
        * git branch name 创建分支
        * git checkout name 切换分支
        * git checkout -b name 创建并切换分支name
        * git checkout - 切回上一个分支
    * 合并分支
        * 注意每次合并前必须git add和git commit 
        * git merge --no-ff feature-A  合并当前分支和feature-A
    * 删除分支
        * git branch -d fea-A
* 更改提交
    * git reset --hard  HEAD^ 恢复到上一次提交
    * git reset --hard  HEAD^^^^^ 恢复到前5次提交
    * git reset --hard  HEAD~2  恢复到前两次提交
    * git reset --hard  commitID;  git log 的长ID或者git reflog的短ID
    * 远程版本回退
        * 先使用git reset 回退本地分支
        * 再使用 git push -f origin master 强制推送到远端分支

* 冲突消除
    * 如果两个分支修改了同一个文件的。在进行合并的时候就会提示哪个文件发生冲突，无法合并。
 ```
 <<<<<<HEAD
 - feature-A
 =========
 - fix-B
 >>>>>>feature-B
 ```
 =====以上的部分是当前HEAD的内容，以下是要合并的feature-B的内容。
 修改之后，重新合并即可。

* 压缩历史
    * 在创建分支后，会在该分支上进行开发，期间可能会发生n次提交。如果进行合并，这个分支记录也会跟着一起被记录到主分支。因此需要对这些分支上的各个提交合并为一个提交记录。
    * git rebase -i HEAD~2 合并最近的两次提交

* 推送分支
    * git push origin master|其他分支名称
* 从远程仓库获取
    * git clone 仓库地址  默认为master分支
    * git checkout -b fea-A origin/fea-A   
    -b 为本地创建的分支名称，应当与远程分支名称一样。
    * git pull origin 远程分支名称，将远端分支合并到本地分支
    为了减少发生push提交冲突冲突，push之前应当先pull到本地。
* 标签tag
    * 相当于一个时刻的文件快照。比如说给每一个发布版本定版本号1.0/2.0/3.0.每个版本号打一次标签。再去寻找时就不用从数量庞大的提交记录中寻找。
    * git tag v1.0 给当前分支打包，标签为v1.0
    * git tag v0.9 f52c633 通过提交ID打标签
    * git tag -a v0.1 -m "version 0.1 released" 1094adb  -a指定标签名。-m 指定说明
    * git show v1.0  查看说明
    * git tag  查看所有的标签
* 忽略文件上传
    * 在使用git 时，有些文件不想提交，比如密码文件，编译出来的文件，这时候可以使用该功能进行忽略
    * 工作区创建.gitignore
        * *.class 忽略class结尾的文件
        * aa.text 忽略aa.text文件
        * target 忽略target 下的所有文件
    * 如果之前已经提交过，必须先执行如下清空缓存,否则远端的文件还是会存在。须在当前的工作目录执行。
        * git rm -r --cached .
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
### 13.2.2. 权限修饰符
<a href="#menu" style="float:right">目录</a>
* private 本类可见
* default 同一个包/子包可见
* protect 子类可见
* public 所有可见

### 13.2.3. 接口和抽象类
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


### 13.2.4. 内部类
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
### 13.2.5. 枚举类
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
## 16.1. 常用语句
### 16.1.1.  
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

## 22.1. 基本概念
SpringBoot的核心
* 自动配置，针对很多Spring应用常用框架进行自动默认配置，可以让你轻松启动项目。比如jedis。原先使用Jedis需要配置连接地址，配置连接池，使用SpringBoot之后，这些都会帮你配置好，只要引入相关依赖，调用其提供的接口，即可实现对Redis的访问。
* 起步依赖:告诉Spring使用什么功能，他都能引入需要的库。
* Actuator

## 22.2. Spring Boot 环境下创建Bean

**方式1**：

使用@Component,@Service,@Controler,@Repository注解

这几个注解都是同样的功能，被注解的类将会被Spring 容器创建单例对象。

@Component : 侧重于通用的Bean类

@Service：标识该类用于业务逻辑

@Controler：标识该类为Spring MVC的控制器类

@Repository: 标识该类是一个实体类，只有属性和Setter,Getter

```java
@Component
public class User{
}
```
当用于Spring Boot应用时，被注解的类必须在启动类的根路径或者子路径下，否则不会生效。

如果不在，可以使用@ComponentScan标注扫描的路径。

spring xml 也有相关的标签<component-scan />

```java
@ComponentScan(value={"com.microblog.blog","com.microblog.common"})
public class MicroblogBlogApplication {
    public static void main(String args[]){
        SpringApplication.run(MicroblogBlogApplication.class,args);
    }
}
```
 

**方式2**：
使用@Bean注解,这种方式用在Spring Boot 应用中。

@Configuration 标识这是一个Spring Boot 配置类，其将会扫描该类中是否存在@Bean 注解的方法，比如如下代码，将会创建User对象并放入容器中。

@ConditionalOnBean 用于判断存在某个Bean时才会创建User Bean.

这里创建的Bean名称默认为方法的名称user。也可以@Bean("xxxx")定义。

```java
@Configuration
public class UserConfiguration{
     
      @Bean
　　　 @ConditionalOnBean(Location.class)
      public User user(){
           return new User();
      }
      
}  
```
 

Spring boot 还为我们提供了更多类似的注解。
```java
//某个Bean存在时才创建
ConditionalOnBean
//某个类存在时才创建
ConditionalOnClass
ConditionalOnCloudPlatform
ConditionalOnExpression
ConditionalOnJava
ConditionalOnJndi
//某个Bean不存在时才创建
ConditionalOnMissingBean
//某个类不存在时才创建
ConditionalOnMissingClass
//不是web环境时才创建
ConditionalOnNotWebApplication
//某个属性存在时才创建
ConditionalOnProperty
//某个资源存在时才创建
ConditionalOnResource
ConditionalOnSingleCandidate
//web环境下才创建
ConditionalOnWebApplication
ConditionEvaluationReport
ConditionEvaluationReportAutoConfigurationImportListener
ConditionMessage
ConditionOutcome
```
也和方式1一样，也会存在扫描路径的问题，除了以上的解决方式，还有使用Spring boot starter 的解决方式

在resources下创建如下文件。META-INF/spring.factories.

Spring Boot 在启动的时候将会扫描该文件，从何获取到配置类UserConfiguration。



spring.factories
```xml
org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.log.config.UserConfiguration
```
 

如果不成功，请引入该依赖
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-configuration-processor</artifactId>
    <optional>true</optional>
</dependency>   
``` 
 

这个方式也是创建SpringBoot-starter的方式。

 

**方式3**：
使用注解@Import,也会创建对象并注入容器中

```java
@Import(User.class)
public class MicroblogUserWebApplication {
    public static void main(String args[]) {
        SpringApplication.run(MicroblogUserWebApplication.class, args);
    }
}
```
**方式4**：
使用ImportSelector或者ImportBeanDefinitionRegistrar接口，配合@Import实现。

在使用一些Spring Boot第三方组件时，经常会看到@EnableXXX来使能相关的服务，这里以一个例子来实现。

创建测试类
```java

@Slf4j
public class House {

    public void run(){

        log.info("House  run ....");
    }
}

@Slf4j
public class User {


    public void run(){

        log.info("User  run ....");

    }

}

@Slf4j
public class Student {

    public void run(){

        log.info("Student  run ....");

    }

} 
```

实现ImportSelector接口
selectImports方法的返回值为需要创建Bean的类名称。这里创建User类。

```java
@Slf4j
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {


        log.info("MyImportSelector selectImports ...");
        return new String[]{
            User.class.getName()};
    }
}
```


 

实现ImportBeanDefinitionRegistrar接口
beanDefinitionRegistry.registerBeanDefinition用于设置需要创建Bean的类名称。这里创建House类。

```java
@Slf4j
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {

        log.info("MyImportBeanDefinitionRegistrar  registerBeanDefinitions .....");
        BeanDefinition beanDefinition =  new RootBeanDefinition(House.class.getName());
        beanDefinitionRegistry.registerBeanDefinition(House.class.getName(),beanDefinition);
    }
}
```
 

创建一个配置类
这里创建Student类。

```java
@Configuration
public class ImportAutoconfiguration {

    @Bean
    public Student student(){
        return new Student();
    }
}
```
 

创建EnableImportSelector注解
EnableImportSelector注解上使用@Import，引入以上的三个类。

```java
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import({MyImportSelector.class,ImportAutoconfiguration.class,MyImportBeanDefinitionRegistrar.class})
public @interface EnableImportSelector {

    String value();

}
```
 测试
```java
@EnableImportSelector(value = "xxx")
@SpringBootApplication
public class ImportDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(ImportDemoApplication.class, args);

        User user =  context.getBean(User.class);
        user.run();

        Student student =  context.getBean(Student.class);
        student.run();

        House house =  context.getBean(House.class);
        house.run();

    }

}
```
 

输出，可以看到，三个类User Student House都创建成功，都可从Spring 容器中获取到。
```
2019-06-20 17:53:39.528  INFO 27255 --- [           main] com.springboot.importselector.pojo.User  : User  run ....
2019-06-20 17:53:39.530  INFO 27255 --- [           main] c.s.importselector.pojo.Student          : Student  run ....
2019-06-20 17:53:39.531  INFO 27255 --- [           main] c.springboot.importselector.pojo.House   : House  run ....
```

 

**方式5**
手动注入Bean容器，有些场景下需要代码动态注入，以上方式都不适用。这时就需要创建 对象手动注入。

通过DefaultListableBeanFactory注入。

registerSingleton(String beanName,Object object);

这里手动使用new创建了一个Location对象。并注入容器中。

 
```java
@Component
public class LocationRegister implements BeanFactoryAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        DefaultListableBeanFactory listableBeanFactory = (DefaultListableBeanFactory)beanFactory;
　　　　//方式1
　　　//　Location location = new Location();
　　　//　listableBeanFactory.registerSingleton(Location.class.getName(),location);

　　　　//方式2
　　　　BeanDefinition locationBeanDefinition = new RootBeanDefinition(Location.class);
　　　　listableBeanFactory.registerBeanDefinition(Location.class.getName(),locationBeanDefinition);

    }
}
```
这种方式的应用场景是为接口创建动态代理对象，并向SPRING容器注册。

比如MyBatis中的Mapper接口，Mapper没有实现类，启动时创建动态代理对象，将该对象注册到容器中，使用时只要@Autowired注入即可使用，调用接口方法将会被代理拦截，进而调用相关的SqlSession执行相关的SQL业务逻辑。

 

可以看以下它的继承体系

DefaultListableBeanFactory 是ConfigurableListableBeanFactory的实现类。是对BeanFactory功能的扩展。



测试代码和以上一样
```java
Location location =  context.getBean(Location.class);
location.run();
```

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

## 33.2. UML图

## 33.3. 单例模式
<a href="#menu" style="float:right">目录</a>
### 33.3.1. 基本概念

**定义**:确保某一个类只有一个对象实例。
**衍生**：有限多例，比如对象池技术，使用缓存将创建的对象缓存起来。
**优点**:
* 减少内存开支，每创建一个对象都会占用一定的系统内存，创建过多容易造成JVM进行垃圾回收。
* 降低系统性能开销，创建和垃圾回收会耗费一定的系统性能
* 从业务层面讲。可以提供公共的资源访问点。

**缺点**:

### 33.3.2. 实现
单例模式需要注意的关键点是如何避免高并发条件下出现多例的问题。高并发环境下，任何两条语句执行之间都有可能被其他线程所抢占并执行完整的指令。这种情况处理不好，很容易产生出多例。
还有需要关注的是，一个系统中存在很多类，但是有的类在系统运行的生命周期中是始终没机会创建对象，比如有个偏门的用户操作才会触发某个类创建对象。这种情况下就没必要创建对象，也就是需要延迟创建对象，在使用时才去创建。
作为单例类，没必要去考虑通过反射会破解单例模式，定义一个类为单例，作为开发者应当遵循这个规范，而不是尝试使用反射来创建多个对象从而破坏这个规定。单例模式只防君子不防小人。

**饥饿式创建单例**
这种写法就是在类加载时就创建一次，singleton属性定义为static,static属性只会在类加载的时候执行，因此不存在线程安全问题。由于是在类加载时就创建，因此称为饥饿式。
同时需要将构造器私有化。
```java
public class Singleton1 implements Serializable {

    private static Singleton1 singleton = new Singleton1();
    private Singleton1(){
        
    }
    public static Singleton1 getSingleton(){
        return singleton;
    }

    //解决序列化和反序列化之后的单例问题
    private Object readResolve(){
        return singleton;
    }
}
```
上面的代码添加了一个方法readResolve，是为了解决序列化反序列化后两个对象不是同一个对象的问题。

**饱汉式创建单例**
也就是说在类加载时还不创建对象，只有在获取对象时才会创建。这里需要注意的就是线程安全问题了，所以在类上添加了同步锁。
```java
public class Singleton2 implements Serializable {
    private static Singleton2 singleton = null;
    private Singleton2(){
        
    }
    public synchronized static Singleton2 getSingleton(){
        if(singleton == null){
            singleton = new Singleton2();
        }
        return singleton;
    }
    private Object readResolve(){
        return singleton;
    }
}
```

**双检锁创建单例**
以上的方式有个问题，每次获取对象都要加锁，加锁在jvm中是一项耗费资源的操作，因此更改为在方法内部加同步锁。只有第一次创建的时候才会加锁，对象创建成功之后，后续操作不需要再重新加锁。
```java
public class Singleton3 implements Serializable {

    private static Singleton3 singleton = null;
    private Singleton3(){

    }
    public static Singleton3 getSingleton(){
        if(singleton == null){
            synchronized(Singleton3.class){

                if(singleton == null){
                    singleton =  new Singleton3();
                }
            }
        }        
        return singleton;
    }
    private Object readResolve(){
        return singleton;
    }
}
```

**使用工厂模式和双检锁方式创建**
由于指令重排序的存在，有可能helper=null会在getHelper之后执行。解决这个问题是使用volatile修饰Helper.
详细查看[The "Double-Checked Locking is Broken" Declaration](http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html)
```java

// Single threaded version
class Foo { 
  private Helper helper = null;
  public Helper getHelper() {
    if (helper == null) 
        helper = new Helper();
    return helper;
    }
  // other functions and members...
  }
```

**使用静态内部类来创建**
由于内部类是静态的，因此是线程安全的，对象也是在首次调用内部类的时候才会创建。
```java
public class Singleton4 implements Serializable {

    private static class Singleton4Holder{
        private static Singleton4 singleton4 = new Singleton4();

    }
    public static Singleton4 getSingleton(){
        return Singleton4Holder.singleton4;
    }

    private Object readResolve(){
        return Singleton4Holder.singleton4;
    }
}
```

**使用枚举类来创建**
```java
public class Singleton5 implements Serializable {

    private enum Singleto5Enum{
        singletonFactory;

        private  Singleton5 singleton;

        private Singleto5Enum() {
            this.singleton = new Singleton5();
        }

        public Singleton5 getSingleton(){
            return singleton;
        }
    }

    public static Singleton5 getSingleton(){
        return Singleto5Enum.singletonFactory.getSingleton();
    }

    private Object readResolve(){
        return Singleto5Enum.singletonFactory.getSingleton();
    }

}
```

## 33.4. 工厂方法模式
<a href="#menu" style="float:right">目录</a>

## 33.5. 抽象工厂模式
<a href="#menu" style="float:right">目录</a>
## 33.6. 模板方法模式
<a href="#menu" style="float:right">目录</a>
## 33.7. 建造者模式
<a href="#menu" style="float:right">目录</a>
## 33.8. 代理模式
<a href="#menu" style="float:right">目录</a>
## 33.9. 原型模式
<a href="#menu" style="float:right">目录</a>
## 33.10. 中介者模式
<a href="#menu" style="float:right">目录</a>
## 33.11. 命令模式
<a href="#menu" style="float:right">目录</a>
## 33.12. 责任链模式
<a href="#menu" style="float:right">目录</a>
## 33.13. 装饰模式
<a href="#menu" style="float:right">目录</a>
## 33.14. 策略模式
<a href="#menu" style="float:right">目录</a>
## 33.15. 适配器模式
<a href="#menu" style="float:right">目录</a>
## 33.16. 迭代器模式
<a href="#menu" style="float:right">目录</a>
## 33.17. 组合模式
<a href="#menu" style="float:right">目录</a>
## 33.18. 观察者模式
<a href="#menu" style="float:right">目录</a>
## 33.19. 门面模式
<a href="#menu" style="float:right">目录</a>
## 33.20. 备忘录模式
<a href="#menu" style="float:right">目录</a>
## 33.21. 访问者模式
<a href="#menu" style="float:right">目录</a>
## 33.22. 状态模式
<a href="#menu" style="float:right">目录</a>
## 33.23. 解释器模式
<a href="#menu" style="float:right">目录</a>
## 33.24. 享元模式
<a href="#menu" style="float:right">目录</a>
## 33.25. 桥梁模式
<a href="#menu" style="float:right">目录</a>

# 34. Zookeeper
<a href="#menu" style="float:right">目录</a>
## 34.1. 基本概念
<a href="#menu" style="float:right">目录</a>
### 34.1.1. zk架构
![](https://zookeeper.apache.org/doc/r3.5.5/images/zkservice.jpg)
zk的结构如下，类似于一个Linux文件系统，根节点是"/"。
同时你可以在每个节点上添加监听器，当数据发生变化(增加，修改，删除)时，将会通知客户端。
因此zk简单理解就是一个类似文件系统结构的并且具有变更通知功能的分布式协调系统。
每一个节点称为zode。每个节点下可以创建多个子节点，每个节点还可以存放数据。

![](https://zookeeper.apache.org/doc/r3.5.5/images/zknamespace.jpg)


* 适用场景
在分布式系统中，多个服务需要共享一些系统配置信息，比如微服务环境下，服务提供者向zookeeper注册自己多的元数据信息(比如服务名称，地址等)。服务消费者通过注册监听器，获取到zk中服务信息的变化，服务消费者拉取新的配置信息同时更新本地缓存。就解决了服务提供者变更信息的情况下，服务消费者无需更新配置，所有过程都是自动化进行高的。

目前使用zk作为分布式协调系统的有Dubbo和Kafka

* 不适用场景
不适合做海量数据存储，海量数据应当使用数据库，分布式文件系统等。

* 主从模式
为了提高系统的可靠性，zk提供主从模式的分布式部署方式。

**主节点**: 主节点负责监视新的从节点和任务，分配任务给可用的从节点。每个集群只能有一个主节点。
**从节点**: 从节点通过系统注册自己，以确保主节点看到它们可以执行任务，然后开始监视新任务。

* 可靠性和快速性保证
    * 顺序一致性 - 客户端的更新将按发送顺序执行。
    * 原子性 - 更新成功或失败。 没有部分结果。
    * 单系统映像 - 无论服务器连接到哪个服务器，客户端都将看到相同的服务视图。
    * 可靠性 - 一旦应用了更新，它将从那时起持续到客户端覆盖更新。
    * 及时性 - 系统的客户视图保证在特定时间范围内是最新的。

### 34.1.2. 提供的功能
* 给节点创建监听器
* create : 创建节点
* delete : 删除节点
* exists : 检测节点是否存在
* get data : 从节点读取数据
* set data : 向节点写入数据
* get children : 获取子节点列表
* sync : 等待数据传播

### 34.1.3. 节点类型

以下两种类型可以交叉组合，比如持久有序，持久无序。
* 持久化节点(persistent)和临时节点(ephemeral)，临时节点在与创建它的客户端连接断开以后，判定连接失效之后将会被删除,或者客户端主动删除。持久化节点在创建成功之后，将会一直存在，除非手动删除。
* 有序节点和无序节点，有序节点在每次创建时同一个名称的节点时会自动在节点名称后面加上序列号。

**应用场景**:微服务中的失效剔除可以使用临时节点来实现，当服务提供者失效时，zk判断连接失败之后将服务信息删除，如果消费者监听该节点，将会收到删除请求。

# 35. 登录认证
## 35.1. Shiro
## 35.2. oauth2
## 35.3. token

# 36. 分布式系统&高并发
<a href="#menu" style="float:right">目录</a>

## 基本概念
* **分布式**
系统中的多个模块在不同服务器上部署，即可称为分布式系统，如Tomcat和数据库分别部署在不同的服务器上，或两个相同功能的Tomcat分别部署在不同服务器上
* **高可用**
系统中部分节点失效时，其他节点能够接替它继续提供服务，则可认为系统具有高可用性
* **集群**
一个特定领域的软件部署在多台服务器上并作为一个整体提供一类服务，这个整体称为集群。如Zookeeper中的Master和Slave分别部署在多台服务器上，共同组成一个整体提供集中配置服务。在常见的集群中，客户端往往能够连接任意一个节点获得服务，并且当集群中一个节点掉线时，其他节点往往能够自动的接替它继续提供服务，这时候说明集群具有高可用性
* **负载均衡**
请求发送到系统时，通过某些方式把请求均匀分发到多个节点上，使系统中每个节点能够均匀的处理请求负载，则可认为系统是负载均衡的
* **正向代理和反向代理**
系统内部要访问外部网络时，统一通过一个代理服务器把请求转发出去，在外部网络看来就是代理服务器发起的访问，此时代理服务器实现的是正向代理；当外部请求进入系统时，代理服务器把该请求转发到系统中的某台服务器上，对外部请求来说，与之交互的只有代理服务器，此时代理服务器实现的是反向代理。简单来说，正向代理是代理服务器代替系统内部来访问外部网络的过程，反向代理是外部请求访问系统时通过代理服务器转发到内部服务器的过程。

## 架构演进
[来源](https://segmentfault.com/a/1190000018626163)
* **单机架构**
![](https://segmentfault.com/img/bVbqHnQ?w=579&h=210)

以淘宝作为例子。在网站最初时，应用数量与用户数都较少，可以把Tomcat和数据库部署在同一台服务器上。浏览器往www.taobao.com发起请求时，首先经过DNS服务器（域名系统）把域名转换为实际IP地址10.102.4.1，浏览器转而访问该IP对应的Tomcat。

随着用户数的增长，Tomcat和数据库之间竞争资源，单机性能不足以支撑业务
* **第一次演进：Tomcat与数据库分开部署**
![](https://segmentfault.com/img/bVbqHnF?w=581&h=207)

Tomcat和数据库分别独占服务器资源，显著提高两者各自性能。

随着用户数的增长，并发读写数据库成为瓶颈
* **第二次演进：引入本地缓存和分布式缓存**
![](https://segmentfault.com/img/bVbqHo5?w=581&h=321)

在Tomcat同服务器上或同JVM中增加本地缓存，并在外部增加分布式缓存，缓存热门商品信息或热门商品的html页面等。通过缓存能把绝大多数请求在读写数据库前拦截掉，大大降低数据库压力。其中涉及的技术包括：使用memcached作为本地缓存，使用Redis作为分布式缓存，还会涉及缓存一致性、缓存穿透/击穿、缓存雪崩、热点数据集中失效等问题。

缓存抗住了大部分的访问请求，随着用户数的增长，并发压力主要落在单机的Tomcat上，响应逐渐变慢
* **第三次演进：引入反向代理实现负载均衡**
![](https://segmentfault.com/img/bVbqjM7?w=401&h=330)

在多台服务器上分别部署Tomcat，使用反向代理软件（Nginx）把请求均匀分发到每个Tomcat中。此处假设Tomcat最多支持100个并发，Nginx最多支持50000个并发，那么理论上Nginx把请求分发到500个Tomcat上，就能抗住50000个并发。其中涉及的技术包括：Nginx、HAProxy，两者都是工作在网络第七层的反向代理软件，主要支持http协议，还会涉及session共享、文件上传下载的问题。

反向代理使应用服务器可支持的并发量大大增加，但并发量的增长也意味着更多请求穿透到数据库，单机的数据库最终成为瓶颈
* **第四次演进：数据库读写分离**
![](https://segmentfault.com/img/bVbqjPI?w=427&h=293)

把数据库划分为读库和写库，读库可以有多个，通过同步机制把写库的数据同步到读库，对于需要查询最新写入数据场景，可通过在缓存中多写一份，通过缓存获得最新数据。其中涉及的技术包括：Mycat，它是数据库中间件，可通过它来组织数据库的分离读写和分库分表，客户端通过它来访问下层数据库，还会涉及数据同步，数据一致性的问题。

业务逐渐变多，不同业务之间的访问量差距较大，不同业务直接竞争数据库，相互影响性能
* **第五次演进：数据库按业务分库**
![](https://segmentfault.com/img/bVbqknA?w=537&h=442)

把不同业务的数据保存到不同的数据库中，使业务之间的资源竞争降低，对于访问量大的业务，可以部署更多的服务器来支撑。这样同时导致跨业务的表无法直接做关联分析，需要通过其他途径来解决，但这不是本文讨论的重点，有兴趣的可以自行搜索解决方案。

随着用户数的增长，单机的写库会逐渐会达到性能瓶颈
* **第六次演进：把大表拆分为小表**
![](https://segmentfault.com/img/bVbqjUO?w=584&h=442)

比如针对评论数据，可按照商品ID进行hash，路由到对应的表中存储；针对支付记录，可按照小时创建表，每个小时表继续拆分为小表，使用用户ID或记录编号来路由数据。只要实时操作的表数据量足够小，请求能够足够均匀的分发到多台服务器上的小表，那数据库就能通过水平扩展的方式来提高性能。其中前面提到的Mycat也支持在大表拆分为小表情况下的访问控制。

这种做法显著的增加了数据库运维的难度，对DBA的要求较高。数据库设计到这种结构时，已经可以称为分布式数据库，但是这只是一个逻辑的数据库整体，数据库里不同的组成部分是由不同的组件单独来实现的，如分库分表的管理和请求分发，由Mycat实现，SQL的解析由单机的数据库实现，读写分离可能由网关和消息队列来实现，查询结果的汇总可能由数据库接口层来实现等等，这种架构其实是MPP（大规模并行处理）架构的一类实现。

目前开源和商用都已经有不少MPP数据库，开源中比较流行的有Greenplum、TiDB、Postgresql XC、HAWQ等，商用的如南大通用的GBase、睿帆科技的雪球DB、华为的LibrA等等，不同的MPP数据库的侧重点也不一样，如TiDB更侧重于分布式OLTP场景，Greenplum更侧重于分布式OLAP场景，这些MPP数据库基本都提供了类似Postgresql、Oracle、MySQL那样的SQL标准支持能力，能把一个查询解析为分布式的执行计划分发到每台机器上并行执行，最终由数据库本身汇总数据进行返回，也提供了诸如权限管理、分库分表、事务、数据副本等能力，并且大多能够支持100个节点以上的集群，大大降低了数据库运维的成本，并且使数据库也能够实现水平扩展。

数据库和Tomcat都能够水平扩展，可支撑的并发大幅提高，随着用户数的增长，最终单机的Nginx会成为瓶颈
* **第七次演进：使用LVS或F5来使多个Nginx负载均衡**
![](https://segmentfault.com/img/bVbqkrJ?w=589&h=515)

由于瓶颈在Nginx，因此无法通过两层的Nginx来实现多个Nginx的负载均衡。图中的LVS和F5是工作在网络第四层的负载均衡解决方案，其中LVS是软件，运行在操作系统内核态，可对TCP请求或更高层级的网络协议进行转发，因此支持的协议更丰富，并且性能也远高于Nginx，可假设单机的LVS可支持几十万个并发的请求转发；F5是一种负载均衡硬件，与LVS提供的能力类似，性能比LVS更高，但价格昂贵。由于LVS是单机版的软件，若LVS所在服务器宕机则会导致整个后端系统都无法访问，因此需要有备用节点。可使用keepalived软件模拟出虚拟IP，然后把虚拟IP绑定到多台LVS服务器上，浏览器访问虚拟IP时，会被路由器重定向到真实的LVS服务器，当主LVS服务器宕机时，keepalived软件会自动更新路由器中的路由表，把虚拟IP重定向到另外一台正常的LVS服务器，从而达到LVS服务器高可用的效果。

此处需要注意的是，上图中从Nginx层到Tomcat层这样画并不代表全部Nginx都转发请求到全部的Tomcat，在实际使用时，可能会是几个Nginx下面接一部分的Tomcat，这些Nginx之间通过keepalived实现高可用，其他的Nginx接另外的Tomcat，这样可接入的Tomcat数量就能成倍的增加。

由于LVS也是单机的，随着并发数增长到几十万时，LVS服务器最终会达到瓶颈，此时用户数达到千万甚至上亿级别，用户分布在不同的地区，与服务器机房距离不同，导致了访问的延迟会明显不同
* **第八次演进：通过DNS轮询实现机房间的负载均衡**
![](https://segmentfault.com/img/bVbqkuH?w=752&h=535)

在DNS服务器中可配置一个域名对应多个IP地址，每个IP地址对应到不同的机房里的虚拟IP。当用户访问www.taobao.com时，DNS服务器会使用轮询策略或其他策略，来选择某个IP供用户访问。此方式能实现机房间的负载均衡，至此，系统可做到机房级别的水平扩展，千万级到亿级的并发量都可通过增加机房来解决，系统入口处的请求并发量不再是问题。

随着数据的丰富程度和业务的发展，检索、分析等需求越来越丰富，单单依靠数据库无法解决如此丰富的需求
* **第九次演进：引入NoSQL数据库和搜索引擎等技术**
![](https://segmentfault.com/img/bVbqHtd?w=685&h=443)

当数据库中的数据多到一定规模时，数据库就不适用于复杂的查询了，往往只能满足普通查询的场景。对于统计报表场景，在数据量大时不一定能跑出结果，而且在跑复杂查询时会导致其他查询变慢，对于全文检索、可变数据结构等场景，数据库天生不适用。因此需要针对特定的场景，引入合适的解决方案。如对于海量文件存储，可通过分布式文件系统HDFS解决，对于key value类型的数据，可通过HBase和Redis等方案解决，对于全文检索场景，可通过搜索引擎如ElasticSearch解决，对于多维分析场景，可通过Kylin或Druid等方案解决。

当然，引入更多组件同时会提高系统的复杂度，不同的组件保存的数据需要同步，需要考虑一致性的问题，需要有更多的运维手段来管理这些组件等。

引入更多组件解决了丰富的需求，业务维度能够极大扩充，随之而来的是一个应用中包含了太多的业务代码，业务的升级迭代变得困难
* **第十次演进：大应用拆分为小应用**
![](https://segmentfault.com/img/bVbqHzB?w=687&h=455)

按照业务板块来划分应用代码，使单个应用的职责更清晰，相互之间可以做到独立升级迭代。这时候应用之间可能会涉及到一些公共配置，可以通过分布式配置中心Zookeeper来解决。

不同应用之间存在共用的模块，由应用单独管理会导致相同代码存在多份，导致公共功能升级时全部应用代码都要跟着升级
* **第十一次演进：复用的功能抽离成微服务**
![](https://segmentfault.com/img/bVbqHAs?w=682&h=536)

如用户管理、订单、支付、鉴权等功能在多个应用中都存在，那么可以把这些功能的代码单独抽取出来形成一个单独的服务来管理，这样的服务就是所谓的微服务，应用和服务之间通过HTTP、TCP或RPC请求等多种方式来访问公共服务，每个单独的服务都可以由单独的团队来管理。此外，可以通过Dubbo、SpringCloud等框架实现服务治理、限流、熔断、降级等功能，提高服务的稳定性和可用性。

不同服务的接口访问方式不同，应用代码需要适配多种访问方式才能使用服务，此外，应用访问服务，服务之间也可能相互访问，调用链将会变得非常复杂，逻辑变得混乱
* **第十二次演进：引入企业服务总线ESB屏蔽服务接口的访问差异**
![](https://segmentfault.com/img/bVbqHBi?w=693&h=593)

通过ESB统一进行访问协议转换，应用统一通过ESB来访问后端服务，服务与服务之间也通过ESB来相互调用，以此降低系统的耦合程度。这种单个应用拆分为多个应用，公共服务单独抽取出来来管理，并使用企业消息总线来解除服务之间耦合问题的架构，就是所谓的SOA（面向服务）架构，这种架构与微服务架构容易混淆，因为表现形式十分相似。个人理解，微服务架构更多是指把系统里的公共服务抽取出来单独运维管理的思想，而SOA架构则是指一种拆分服务并使服务接口访问变得统一的架构思想，SOA架构中包含了微服务的思想。

业务不断发展，应用和服务都会不断变多，应用和服务的部署变得复杂，同一台服务器上部署多个服务还要解决运行环境冲突的问题，此外，对于如大促这类需要动态扩缩容的场景，需要水平扩展服务的性能，就需要在新增的服务上准备运行环境，部署服务等，运维将变得十分困难
* **第十三次演进：引入容器化技术实现运行环境隔离与动态服务管理**
![](https://segmentfault.com/img/bVbqHBG?w=645&h=614)

目前最流行的容器化技术是Docker，最流行的容器管理服务是Kubernetes(K8S)，应用/服务可以打包为Docker镜像，通过K8S来动态分发和部署镜像。Docker镜像可理解为一个能运行你的应用/服务的最小的操作系统，里面放着应用/服务的运行代码，运行环境根据实际的需要设置好。把整个“操作系统”打包为一个镜像后，就可以分发到需要部署相关服务的机器上，直接启动Docker镜像就可以把服务起起来，使服务的部署和运维变得简单。

在大促的之前，可以在现有的机器集群上划分出服务器来启动Docker镜像，增强服务的性能，大促过后就可以关闭镜像，对机器上的其他服务不造成影响（在3.14节之前，服务运行在新增机器上需要修改系统配置来适配服务，这会导致机器上其他服务需要的运行环境被破坏）。

使用容器化技术后服务动态扩缩容问题得以解决，但是机器还是需要公司自身来管理，在非大促的时候，还是需要闲置着大量的机器资源来应对大促，机器自身成本和运维成本都极高，资源利用率低
* **第十四次演进：以云平台承载系统**
![](https://segmentfault.com/img/bVbqHDy?w=977&h=583)

系统可部署到公有云上，利用公有云的海量机器资源，解决动态硬件资源的问题，在大促的时间段里，在云平台中临时申请更多的资源，结合Docker和K8S来快速部署服务，在大促结束后释放资源，真正做到按需付费，资源利用率大大提高，同时大大降低了运维成本。

所谓的云平台，就是把海量机器资源，通过统一的资源管理，抽象为一个资源整体，在之上可按需动态申请硬件资源（如CPU、内存、网络等），并且之上提供通用的操作系统，提供常用的技术组件（如Hadoop技术栈，MPP数据库等）供用户使用，甚至提供开发好的应用，用户不需要关系应用内部使用了什么技术，就能够解决需求（如音视频转码服务、邮件服务、个人博客等）。在云平台中会涉及如下几个概念：

IaaS：基础设施即服务。对应于上面所说的机器资源统一为资源整体，可动态申请硬件资源的层面；
PaaS：平台即服务。对应于上面所说的提供常用的技术组件方便系统的开发和维护；
SaaS：软件即服务。对应于上面所说的提供开发好的应用或服务，按功能或性能要求付费。
至此，以上所提到的从高并发访问问题，到服务的架构和系统实施的层面都有了各自的解决方案，但同时也应该意识到，在上面的介绍中，其实是有意忽略了诸如跨机房数据同步、分布式事务实现等等的实际问题，这些问题以后有机会再拿出来单独讨论
* **架构设计总结**
* 架构的调整是否必须按照上述演变路径进行？
不是的，以上所说的架构演变顺序只是针对某个侧面进行单独的改进，在实际场景中，可能同一时间会有几个问题需要解决，或者可能先达到瓶颈的是另外的方面，这时候就应该按照实际问题实际解决。如在政府类的并发量可能不大，但业务可能很丰富的场景，高并发就不是重点解决的问题，此时优先需要的可能会是丰富需求的解决方案。
* 对于将要实施的系统，架构应该设计到什么程度？
对于单次实施并且性能指标明确的系统，架构设计到能够支持系统的性能指标要求就足够了，但要留有扩展架构的接口以便不备之需。对于不断发展的系统，如电商平台，应设计到能满足下一阶段用户量和性能指标要求的程度，并根据业务的增长不断的迭代升级架构，以支持更高的并发和更丰富的业务。
* 服务端架构和大数据架构有什么区别？
所谓的“大数据”其实是海量数据采集清洗转换、数据存储、数据分析、数据服务等场景解决方案的一个统称，在每一个场景都包含了多种可选的技术，如数据采集有Flume、Sqoop、Kettle等，数据存储有分布式文件系统HDFS、FastDFS，NoSQL数据库HBase、MongoDB等，数据分析有Spark技术栈、机器学习算法等。总的来说大数据架构就是根据业务的需求，整合各种大数据组件组合而成的架构，一般会提供分布式存储、分布式计算、多维分析、数据仓库、机器学习算法等能力。而服务端架构更多指的是应用组织层面的架构，底层能力往往是由大数据架构来提供。
* 有没有一些架构设计的原则？
    * N+1设计。系统中的每个组件都应做到没有单点故障；
    * 回滚设计。确保系统可以向前兼容，在系统升级时应能有办法回滚版本；
    * 禁用设计。应该提供控制具体功能是否可用的配置，在系统出现故障时能够快速下线功能；
    * 监控设计。在设计阶段就要考虑监控的手段；
    * 多活数据中心设计。若系统需要极高的高可用，应考虑在多地实施数据中心进行多活，至少在一个机房断电的情况下系统依然可用；
    * 采用成熟的技术。刚开发的或开源的技术往往存在很多隐藏的bug，出了问题没有商业支持可能会是一个灾难；
    * 资源隔离设计。应避免单一业务占用全部资源；
    * 架构应能水平扩展。系统只有做到能水平扩展，才能有效避免瓶颈问题；
    * 非核心则购买。非核心功能若需要占用大量的研发资源才能解决，则考虑购买成熟的产品；
    * 使用商用硬件。商用硬件能有效降低硬件故障的机率；
    * 快速迭代。系统应该快速开发小功能模块，尽快上线进行验证，早日发现问题大大降低系统交付的风险；
    * 无状态设计。服务接口应该做成无状态的，当前接口的访问不依赖于接口上次访问的状态。
## 36.1. 序列化机制
<a href="#menu" style="float:right">目录</a>
### 基本概念
**序列化**:将对象序列化为字节数组，用于网络传输或者磁盘存储。
**反序列化**:将从网络或者磁盘获取的字节数组转化为对象。

* 序列化选择关键点
    * 序列化和反序列化过程的性能
    * 序列化之后的字节长度，这将会影响网络传输。
    * 功能丰富度，比如支持List,Map，复杂对象等
    * 跨语言需求，有的系统由几个不同的应用组成，每个应用可能使用不同的语言开发，因此可能存在跨语言需求。
### 常用序列化方式性能比较

![](https://img2018.cnblogs.com/blog/1404294/201904/1404294-20190418171605508-1194073956.jpg)
从图上可以看出，protostuff的性能最好，而JDK序列化方式相对来说性能是比较差的。

### 常用序列化方式实现
#### JDK方式
```java
public class JdkSerializeUtil extends AbstractSerialize {

    public <T> byte[] serialize(T obj) {

        if (obj  == null){
            throw new NullPointerException();
        }

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(obj);
            return bos.toByteArray();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new byte[0];
    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {
        ByteArrayInputStream bis = new ByteArrayInputStream(data);

        try {
            ObjectInputStream ois = new ObjectInputStream(bis);
            T obj = (T)ois.readObject();
            return obj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return  null;
    }
}
```
#### FastJSON
```xml
 <dependency>
     <groupId>com.alibaba</groupId>
     <artifactId>fastjson</artifactId>
     <version>1.2.56</version>
 </dependency>
            
```
```java
public class FastjsonSerializeUtil  extends AbstractSerialize {

    public <T> byte[] serialize(T obj) {
        if (obj  == null){
            throw new NullPointerException();
        }

        String json = JSON.toJSONString(obj);
        byte[] data = json.getBytes();
        return data;
    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {

        T obj = JSON.parseObject(new String(data),clazz);
        return obj;
    }
}
```
#### Hessian
```xml
<dependency>
    <groupId>com.caucho</groupId>
    <artifactId>hessian</artifactId>
    <version>4.0.60</version>
 </dependency>
```
```java
public class HessianSerializeUtil extends AbstractSerialize {



    public <T> byte[] serialize(T obj) {

        if (obj  == null){
            throw new NullPointerException();
        }
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            HessianOutput ho = new HessianOutput(bos);
            ho.writeObject(obj);

            return  bos.toByteArray();
        }
        catch(Exception ex){
            log.error("HessianSerializeUtil序列化发生异常!"+ex);
            throw new  RuntimeException();
        }

    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {

        if (data == null){
            throw  new  NullPointerException();
        }
        try{
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            HessianInput hi = new HessianInput(bis);
            return (T)hi.readObject();

        }
        catch(Exception ex){
            log.error("HessianSerializeUtil反序列化发生异常!"+ex);
            throw new  RuntimeException();
        }

    }
}
```
#### Protostuff
```xml
<dependency>
    <groupId>io.protostuff</groupId>
    <artifactId>protostuff-core</artifactId>
    <version>1.6.0</version>
     <scope>compile</scope>
</dependency>


<!-- https://mvnrepository.com/artifact/io.protostuff/protostuff-runtime -->
 <dependency>
    <groupId>io.protostuff</groupId>
    <artifactId>protostuff-runtime</artifactId>
    <version>1.6.0</version>
</dependency>
```
```java
public class ProtostuffSerializeUtil  extends AbstractSerialize {

    /**
     * 避免每次序列化都重新申请Buffer空间
     */
    private static LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
    /**
     * 缓存Schema
     */
    private static Map<Class<?>, Schema<?>> schemaCache = new ConcurrentHashMap<Class<?>, Schema<?>>();

    public   <T> byte[] serialize(T obj) {

        if (obj  == null){
            throw new NullPointerException();
        }
        Class<T> clazz = (Class<T>) obj.getClass();
        Schema<T> schema = getSchema(clazz);
        byte[] data;
        try {
            data = ProtostuffIOUtil.toByteArray(obj, schema, buffer);
        } finally {
            buffer.clear();
        }

        return data;
    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {
        Schema<T> schema = getSchema(clazz);
        T obj = schema.newMessage();
        ProtostuffIOUtil.mergeFrom(data, obj, schema);
        return obj;
    }


    private static <T> Schema<T> getSchema(Class<T> clazz) {
        Schema<T> schema = (Schema<T>) schemaCache.get(clazz);
        if (schema == null) {
            //这个schema通过RuntimeSchema进行懒创建并缓存
            //所以可以一直调用RuntimeSchema.getSchema(),这个方法是线程安全的
            schema = RuntimeSchema.getSchema(clazz);
            if (schema != null) {
                schemaCache.put(clazz, schema);
            }
        }

        return schema;
    }


}
```
* 测试

|	|码流大小(byte)	|10次(us)	|100次(us)|	1000次(us)|	10000次(us)	|100000次(us)|	 
|---|---|---|---|---|---|---|
|FastJson	|305	|116-243|	106-185|	90-140|	26-39|	8-12|	 
|JDK	|866	|383-777	|502-1101|	123-334	|54-237|	15-76	 |
|Hessian|	520|	959-3836	|376-567|	191-329|	99-161	|30-47|	 
|Protostuff|	193|	103-145|	90-137	|75-135	|15-24|	5-8|

## 36.2. 分布式锁
<a href="#menu" style="float:right">目录</a>

## 36.3. 分布式ID
<a href="#menu" style="float:right">目录</a>


## 36.4. 微服务化
<a href="#menu" style="float:right">目录</a>

## 36.5. 缓存
<a href="#menu" style="float:right">目录</a>

### 36.5.1. 缓存一致性问题

## 36.6. 消息机制
<a href="#menu" style="float:right">目录</a>

## 36.7. 服务降级
<a href="#menu" style="float:right">目录</a>

## 36.8. 流量限流
<a href="#menu" style="float:right">目录</a>

## 36.9. 幂等设计
<a href="#menu" style="float:right">目录</a>

## 36.10. 数据一致性
<a href="#menu" style="float:right">目录</a>

### 36.10.1. CAP理论
### 36.10.2. Base理论

## 36.11. 分布式事务实现
<a href="#menu" style="float:right">目录</a>

## 36.12. 负载均衡算法
<a href="#menu" style="float:right">目录</a>

## 36.13. 服务容错设计
<a href="#menu" style="float:right">目录</a>

## 36.14. 集群
<a href="#menu" style="float:right">目录</a>

## 36.15. 分库分表
<a href="#menu" style="float:right">目录</a>

## 36.16. 反向代理&正向代理
<a href="#menu" style="float:right">目录</a>

## 36.17. 客户端优化
<a href="#menu" style="float:right">目录</a>
