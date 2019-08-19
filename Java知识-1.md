
<span id="menu"></span>
<!-- TOC -->

- [1. 基础工具](#1-基础工具)
    - [1.1. 技术社区](#11-技术社区)
    - [1.2. 常用工具](#12-常用工具)
        - [1.2.1. 编译器](#121-编译器)
        - [1.2.2. IDEA插件](#122-idea插件)
        - [1.2.3. HTTP请求](#123-http请求)
        - [1.2.4. 前端开发编辑](#124-前端开发编辑)
        - [1.2.5. 绘图工具](#125-绘图工具)
            - [1.2.5.1. 思维导图](#1251-思维导图)
            - [1.2.5.2. UML](#1252-uml)
        - [1.2.6. 编辑器](#126-编辑器)
        - [1.2.7. 调优工具](#127-调优工具)
        - [1.2.8. 压测工具](#128-压测工具)
        - [1.2.9. 版本管理](#129-版本管理)
        - [1.2.10. 其他](#1210-其他)
    - [1.3. Git](#13-git)
        - [1.3.1. 基本概念](#131-基本概念)
        - [1.3.2. 常用命令](#132-常用命令)
    - [1.4. Maven](#14-maven)
    - [1.5. Jenkins](#15-jenkins)
    - [1.6. Docker](#16-docker)
        - [1.6.1. Docker常用指令](#161-docker常用指令)
            - [1.6.1.1. 基本概念](#1611-基本概念)
        - [1.6.2. 常用指令](#162-常用指令)
        - [1.6.3. 容器](#163-容器)
            - [1.6.3.1. 容器的管理操作](#1631-容器的管理操作)
            - [1.6.3.2. 容器内部信息的获取](#1632-容器内部信息的获取)
        - [1.6.4. 镜像](#164-镜像)
            - [1.6.4.1. 基本概念](#1641-基本概念)
            - [1.6.4.2. 本地镜像的管理](#1642-本地镜像的管理)
        - [1.6.5. Docker File](#165-docker-file)
        - [1.6.6. 数据卷和容器连接](#166-数据卷和容器连接)
            - [1.6.6.1. 容器网络基础](#1661-容器网络基础)
            - [1.6.6.2. 数据卷](#1662-数据卷)
        - [1.6.7. 案例](#167-案例)
            - [1.6.7.1. docker 安装Mysqk主从复制](#1671-docker-安装mysqk主从复制)
            - [1.6.7.2. docker 安装mycat](#1672-docker-安装mycat)
    - [1.7. VIM](#17-vim)
    - [1.8. NMON监控工具](#18-nmon监控工具)
    - [1.9. 正则表达式](#19-正则表达式)
    - [1.10. curl命令](#110-curl命令)
    - [1.11. 面试考察](#111-面试考察)
        - [1.11.1. 技术广度的考察](#1111-技术广度的考察)
        - [1.11.2. 底层技术的考察](#1112-底层技术的考察)
        - [1.11.3. 技术深度的考察](#1113-技术深度的考察)
- [2. 计算机&网络&操作系统](#2-计算机网络操作系统)
    - [2.1. 计算机基础](#21-计算机基础)
        - [2.1.1. 数据类型](#211-数据类型)
            - [2.1.1.1. ASCII](#2111-ascii)
    - [2.2. 操作系统](#22-操作系统)
        - [2.2.1. 操作系统基本概念](#221-操作系统基本概念)
                - [2.2.1.0.1. 操作系统发展过程](#22101-操作系统发展过程)
                - [2.2.1.0.2. 基本特性](#22102-基本特性)
            - [2.2.1.1. Linux进程和线程的区别](#2211-linux进程和线程的区别)
    - [2.3. 网络TCP](#23-网络tcp)
        - [2.3.1. OSI网路分层](#231-osi网路分层)
        - [2.3.2. IP(Internet Protocol,网际协议)](#232-ipinternet-protocol网际协议)
            - [2.3.2.1. 基本概念](#2321-基本概念)
            - [2.3.2.2. IP地址定义](#2322-ip地址定义)
            - [2.3.2.3. IP协议相关技术](#2323-ip协议相关技术)
                - [2.3.2.3.1. DNS](#23231-dns)
                - [2.3.2.3.2. ARP](#23232-arp)
        - [2.3.3. 传输层](#233-传输层)
            - [2.3.3.1. 基本概念](#2331-基本概念)
                - [2.3.3.1.1. TCP和UDP差别](#23311-tcp和udp差别)
                - [2.3.3.1.2. 端口](#23312-端口)
            - [2.3.3.2. UDP](#2332-udp)
            - [2.3.3.3. TCP](#2333-tcp)
                - [2.3.3.3.1. 连接管理](#23331-连接管理)
                - [2.3.3.3.2. 超时重传机制](#23332-超时重传机制)
                - [2.3.3.3.3. 数据流和窗口机制](#23333-数据流和窗口机制)
                - [2.3.3.3.4. 阻塞控制](#23334-阻塞控制)
    - [2.4. 网络HTTP](#24-网络http)
        - [2.4.1. 基本概念](#241-基本概念)
            - [2.4.1.1. 访问一个网站的流程](#2411-访问一个网站的流程)
            - [2.4.1.2. 媒体类型(MIME)](#2412-媒体类型mime)
        - [2.4.2. URL和资源](#242-url和资源)
        - [2.4.3. HTTP报文](#243-http报文)
            - [2.4.3.1. 请求报文和响应报文](#2431-请求报文和响应报文)
            - [2.4.3.2. 首部](#2432-首部)
            - [2.4.3.3. 方法](#2433-方法)
            - [2.4.3.4. 状态码](#2434-状态码)
        - [2.4.4. 连接管理](#244-连接管理)
            - [2.4.4.1. 对TCP性能的考虑](#2441-对tcp性能的考虑)
            - [2.4.4.2. 持久连接](#2442-持久连接)
        - [2.4.5. WEB服务器](#245-web服务器)
        - [2.4.6. 代理](#246-代理)
        - [2.4.7. 缓存](#247-缓存)
        - [2.4.8. 网关](#248-网关)
        - [2.4.9. 客户端识别与Cookie机制](#249-客户端识别与cookie机制)
        - [2.4.10. 基本认证机制](#2410-基本认证机制)
        - [2.4.11. 摘要认证](#2411-摘要认证)
        - [2.4.12. 安全HTTP](#2412-安全http)
        - [2.4.13. 实体和编码](#2413-实体和编码)
        - [2.4.14. 国际化](#2414-国际化)
        - [2.4.15. WEB主机托管](#2415-web主机托管)
        - [2.4.16. 重定向和负载均衡](#2416-重定向和负载均衡)
    - [2.5. Unix环境编程](#25-unix环境编程)
        - [2.5.1. 基本概念](#251-基本概念)
        - [2.5.2. IO模型](#252-io模型)
        - [2.5.3. select&poll&epoll比较](#253-selectpollepoll比较)
            - [2.5.3.1. 整体概览](#2531-整体概览)
            - [2.5.3.2. 对比总结](#2532-对比总结)
    - [2.6. Shell](#26-shell)
        - [2.6.1. 文件相关](#261-文件相关)
        - [2.6.2. 系统监控](#262-系统监控)
        - [2.6.3. 处理数据文件](#263-处理数据文件)
        - [2.6.4. 环境变量](#264-环境变量)
        - [2.6.5. 基本脚本命令](#265-基本脚本命令)
        - [2.6.6. 结构化命令](#266-结构化命令)
        - [2.6.7. 处理用户输入](#267-处理用户输入)
        - [2.6.8. 控制脚本](#268-控制脚本)
- [3. Java与面向对象](#3-java与面向对象)
    - [3.1. Java基础](#31-java基础)
        - [3.1.1. 数据类型](#311-数据类型)
            - [3.1.1.1. Integer 缓存对象](#3111-integer-缓存对象)
            - [3.1.1.2. 数组](#3112-数组)
            - [3.1.1.3. String](#3113-string)
    - [3.2. 面向对象](#32-面向对象)
        - [3.2.1. 三大特性](#321-三大特性)
            - [3.2.1.1. 权限修饰符](#3211-权限修饰符)
            - [3.2.1.2. 接口和抽象类](#3212-接口和抽象类)
            - [3.2.1.3. 建议](#3213-建议)
            - [3.2.1.4. 内部类](#3214-内部类)
            - [3.2.1.5. 枚举类](#3215-枚举类)
        - [3.2.2. 泛型](#322-泛型)
        - [3.2.3. 概述](#323-概述)
        - [3.2.4. 集合](#324-集合)
        - [3.2.5. 异常](#325-异常)
        - [3.2.6. 注解](#326-注解)
    - [3.3. IO](#33-io)
        - [3.3.1. File](#331-file)
            - [3.3.1.1. IO流](#3311-io流)
            - [3.3.1.2. 序列化](#3312-序列化)
        - [3.3.2. NIO](#332-nio)
            - [3.3.2.1. 内存映射](#3321-内存映射)
    - [3.4. Javac编译原理](#34-javac编译原理)
        - [3.4.1. Javac编译器的基本结构](#341-javac编译器的基本结构)
        - [3.4.2. Javac的工作原理分析](#342-javac的工作原理分析)
    - [3.5. 类加载和反射](#35-类加载和反射)
        - [3.5.1. Class文件结构](#351-class文件结构)
            - [3.5.1.1. JVM指令集简介](#3511-jvm指令集简介)
            - [3.5.1.2. class文件头的表示形式](#3512-class文件头的表示形式)
            - [3.5.1.3. 常量池](#3513-常量池)
            - [3.5.1.4. 类信息](#3514-类信息)
            - [3.5.1.5. Fields和Method定义](#3515-fields和method定义)
            - [3.5.1.6. 类属性描述](#3516-类属性描述)
            - [3.5.1.7. Javap生成的class文件结构](#3517-javap生成的class文件结构)
        - [3.5.2. 类加载器](#352-类加载器)
            - [3.5.2.1. 基本概念](#3521-基本概念)
            - [3.5.2.2. 常见的类加载器](#3522-常见的类加载器)
            - [3.5.2.3. 类加载过程](#3523-类加载过程)
            - [3.5.2.4. 全盘委托机制](#3524-全盘委托机制)
            - [3.5.2.5. 定义自已的ClassLoader](#3525-定义自已的classloader)
            - [3.5.2.6. 常见加载类错误](#3526-常见加载类错误)
            - [3.5.2.7. 线程上下文类加载器](#3527-线程上下文类加载器)
            - [3.5.2.8. 类加载器与Web容器](#3528-类加载器与web容器)
            - [3.5.2.9. 常见问题分析](#3529-常见问题分析)
        - [3.5.3. 反射](#353-反射)
    - [3.6. JDBC](#36-jdbc)
    - [3.7. 函数式编程](#37-函数式编程)
    - [3.8. Java 8 的新特性：](#38-java-8-的新特性)
        - [3.8.1. Java 8 Lambda 表达式](#381-java-8-lambda-表达式)
        - [3.8.2. Java 8 函数式接口](#382-java-8-函数式接口)
        - [3.8.3. 默认方法](#383-默认方法)
        - [3.8.4. Optional 类](#384-optional-类)
        - [3.8.5. Stream](#385-stream)
        - [3.8.6. Java 8 日期时间 API](#386-java-8-日期时间-api)
        - [3.8.7. Java8 Base64](#387-java8-base64)
    - [3.9. JDK版本变化](#39-jdk版本变化)
    - [3.10. 设计模式](#310-设计模式)
        - [3.10.1. 设计原则](#3101-设计原则)
            - [3.10.1.1. 单一职责原则](#31011-单一职责原则)
            - [3.10.1.2. 里氏替换原则](#31012-里氏替换原则)
            - [3.10.1.3. 依赖倒置原则](#31013-依赖倒置原则)
            - [3.10.1.4. 接口隔离原则](#31014-接口隔离原则)
            - [3.10.1.5. 迪米特法则](#31015-迪米特法则)
            - [3.10.1.6. 开闭原则](#31016-开闭原则)
        - [3.10.2. UML图](#3102-uml图)
        - [3.10.3. 单例模式](#3103-单例模式)
            - [3.10.3.1. 基本概念](#31031-基本概念)
            - [3.10.3.2. 实现](#31032-实现)
        - [3.10.4. 工厂方法模式](#3104-工厂方法模式)
        - [3.10.5. 抽象工厂模式](#3105-抽象工厂模式)
        - [3.10.6. 模板方法模式](#3106-模板方法模式)
        - [3.10.7. 建造者模式](#3107-建造者模式)
        - [3.10.8. 代理模式](#3108-代理模式)
        - [3.10.9. 原型模式](#3109-原型模式)
        - [3.10.10. 中介者模式](#31010-中介者模式)
        - [3.10.11. 命令模式](#31011-命令模式)
        - [3.10.12. 责任链模式](#31012-责任链模式)
        - [3.10.13. 装饰模式](#31013-装饰模式)
        - [3.10.14. 策略模式](#31014-策略模式)
        - [3.10.15. 适配器模式](#31015-适配器模式)
        - [3.10.16. 迭代器模式](#31016-迭代器模式)
        - [3.10.17. 组合模式](#31017-组合模式)
        - [3.10.18. 观察者模式](#31018-观察者模式)
        - [3.10.19. 门面模式](#31019-门面模式)
        - [3.10.20. 备忘录模式](#31020-备忘录模式)
        - [3.10.21. 访问者模式](#31021-访问者模式)
        - [3.10.22. 状态模式](#31022-状态模式)
        - [3.10.23. 解释器模式](#31023-解释器模式)
        - [3.10.24. 享元模式](#31024-享元模式)
        - [3.10.25. 桥梁模式](#31025-桥梁模式)
- [4. 多线程](#4-多线程)
    - [4.1. 基本概念](#41-基本概念)
    - [4.2. Java多线程](#42-java多线程)
        - [4.2.1. 实现方式](#421-实现方式)
        - [4.2.2. 基本属性](#422-基本属性)
        - [4.2.3. 常用方法](#423-常用方法)
        - [4.2.4. 生命周期 & 线程状态](#424-生命周期--线程状态)
        - [4.2.5. 线程监控工具](#425-线程监控工具)
    - [4.3. Synchronized](#43-synchronized)
        - [4.3.1. 基本概念](#431-基本概念)
        - [4.3.2. 基本使用](#432-基本使用)
        - [4.3.3. 实现原理](#433-实现原理)
    - [4.4. 线程间通信](#44-线程间通信)
        - [4.4.1. 基本概念](#441-基本概念)
        - [4.4.2. 实现消费者和生产者](#442-实现消费者和生产者)
    - [4.5. Java内存模型](#45-java内存模型)
    - [4.6. volatile](#46-volatile)
    - [4.7. Lock](#47-lock)
    - [4.8. 线程池](#48-线程池)
    - [4.9. 并发工具类](#49-并发工具类)
    - [4.10. 异步编程](#410-异步编程)
    - [4.11. 并发编程的挑战](#411-并发编程的挑战)
        - [4.11.1. 上下文切换](#4111-上下文切换)
        - [4.11.2. 死锁](#4112-死锁)
    - [4.12. Java内存模型](#412-java内存模型)
        - [4.12.1. Java内存模型基础](#4121-java内存模型基础)
        - [4.12.2. 重排序](#4122-重排序)
        - [4.12.3. 顺序一致性](#4123-顺序一致性)
        - [4.12.4. volatile的内存语义](#4124-volatile的内存语义)
        - [4.12.5. 锁的内存语义](#4125-锁的内存语义)
        - [4.12.6. final的内存语义](#4126-final的内存语义)
        - [4.12.7. happens-before](#4127-happens-before)
        - [4.12.8. 双重检查锁定与延迟初始化](#4128-双重检查锁定与延迟初始化)
        - [4.12.9. Java内存模型综述](#4129-java内存模型综述)
    - [4.13. Java并发机制的底层实现原理](#413-java并发机制的底层实现原理)
    - [4.14. 并发编程基础](#414-并发编程基础)
    - [4.15. 锁](#415-锁)
        - [4.15.1. 提高锁性能方案](#4151-提高锁性能方案)
        - [4.15.2. Java虚拟机的锁优化](#4152-java虚拟机的锁优化)
    - [4.16. 并发容器和框架](#416-并发容器和框架)
        - [4.16.1. 常见的并发容器](#4161-常见的并发容器)
        - [4.16.2. Fork/Join框架](#4162-forkjoin框架)
            - [4.16.2.1. 基本概念](#41621-基本概念)
            - [4.16.2.2. 工作窃取算法](#41622-工作窃取算法)
            - [4.16.2.3. Fork/Join框架的设计](#41623-forkjoin框架的设计)
            - [4.16.2.4. 例子](#41624-例子)
            - [4.16.2.5. Fork/Join框架的异常处理](#41625-forkjoin框架的异常处理)
            - [4.16.2.6. 实现原理](#41626-实现原理)
    - [4.17. 原子操作类](#417-原子操作类)
        - [4.17.1. CAS算法](#4171-cas算法)
        - [4.17.2. 原子更新基本类型](#4172-原子更新基本类型)
        - [4.17.3. 原子更新数组](#4173-原子更新数组)
        - [4.17.4. 原子更新引用类型](#4174-原子更新引用类型)
        - [4.17.5. 原子更新字段类](#4175-原子更新字段类)
    - [4.18. 并发工具类](#418-并发工具类)
        - [4.18.1. 等待多线程完成的CountDownLatch](#4181-等待多线程完成的countdownlatch)
            - [4.18.1.1. 基本概念](#41811-基本概念)
            - [4.18.1.2. 实现原理](#41812-实现原理)
        - [4.18.2. 同步屏障CyclicBarrier](#4182-同步屏障cyclicbarrier)
            - [4.18.2.1. 实现原理](#41821-实现原理)
        - [4.18.3. 控制并发线程数的Semaphore](#4183-控制并发线程数的semaphore)
            - [4.18.3.1. 基本概念](#41831-基本概念)
            - [4.18.3.2. 实现原理](#41832-实现原理)
        - [4.18.4. 线程间交换数据的Exchanger](#4184-线程间交换数据的exchanger)
    - [4.19. 线程池](#419-线程池)
        - [4.19.1. 线程池的实现原理](#4191-线程池的实现原理)
        - [4.19.2. 线程池的使用](#4192-线程池的使用)
        - [4.19.3. 提交任务](#4193-提交任务)
        - [4.19.4. 关闭线程池](#4194-关闭线程池)
        - [4.19.5. 合理地配置线程池](#4195-合理地配置线程池)
        - [4.19.6. 线程池的监控](#4196-线程池的监控)
    - [4.20. Executor框架](#420-executor框架)
        - [4.20.1. Executor体系](#4201-executor体系)
        - [4.20.2. Executors](#4202-executors)
    - [4.21. 并发编程实战](#421-并发编程实战)
    - [4.22. 队列](#422-队列)
        - [4.22.1. JDK队列概述](#4221-jdk队列概述)
        - [4.22.2. DelayedWorkQueue](#4222-delayedworkqueue)
- [5. Spring 体系](#5-spring-体系)
    - [5.1. Spring](#51-spring)
        - [5.1.1. IOC容器](#511-ioc容器)
        - [5.1.2. AOP面向切面编程](#512-aop面向切面编程)
        - [5.1.3. Spring 事务管理](#513-spring-事务管理)
        - [5.1.4. 常用注解](#514-常用注解)
        - [5.1.5. 常用工具类](#515-常用工具类)
    - [5.2. Sppring MVC](#52-sppring-mvc)
        - [5.2.1. Servlet](#521-servlet)
    - [5.3. SpringBoot](#53-springboot)
        - [5.3.1. 基本概念](#531-基本概念)
        - [5.3.2. Spring Boot 环境下创建Bean](#532-spring-boot-环境下创建bean)
- [6. SpringCloud](#6-springcloud)
    - [6.1. 测试](#61-测试)
        - [6.1.1. 基本测试](#611-基本测试)
        - [6.1.2. 控制层测试](#612-控制层测试)
        - [6.1.3. 服务层测试](#613-服务层测试)
        - [6.1.4. DAO层测试](#614-dao层测试)
    - [6.2. 登录认证](#62-登录认证)
        - [6.2.1. Shiro](#621-shiro)
        - [6.2.2. oauth2](#622-oauth2)
        - [6.2.3. token<span id="menu"></span>](#623-tokenspan-idmenuspan)
- [7. MySQL](#7-mysql)
    - [7.1. 基本概念](#71-基本概念)
        - [7.1.1. 基本概念](#711-基本概念)
        - [7.1.2. 常用工具](#712-常用工具)
        - [7.1.3. 逻辑架构图](#713-逻辑架构图)
        - [7.1.4. 常用配置](#714-常用配置)
    - [7.2. 日志文件](#72-日志文件)
        - [7.2.1. 参数文件](#721-参数文件)
        - [7.2.2. 日志文件](#722-日志文件)
        - [7.2.3. socket文件](#723-socket文件)
        - [7.2.4. pid文件](#724-pid文件)
        - [7.2.5. MySQL表结构文件](#725-mysql表结构文件)
        - [7.2.6. 存储引擎文件](#726-存储引擎文件)
    - [7.3. NoSQL与关系型数据库设计理念比较](#73-nosql与关系型数据库设计理念比较)
        - [7.3.1. 关系型数据库](#731-关系型数据库)
        - [7.3.2. 非关系型数据库](#732-非关系型数据库)
    - [7.4. 使用数据库](#74-使用数据库)
    - [7.5. 数据类型](#75-数据类型)
    - [7.6. 数据更新](#76-数据更新)
    - [7.7. 查询入门](#77-查询入门)
    - [7.8. 多表连接查询](#78-多表连接查询)
    - [7.9. 函数](#79-函数)
        - [7.9.1. 聚集函数](#791-聚集函数)
        - [7.9.2. 数学函数](#792-数学函数)
        - [7.9.3. 字符串函数](#793-字符串函数)
        - [7.9.4. 日期和时间函数](#794-日期和时间函数)
        - [7.9.5. 条件判断函数](#795-条件判断函数)
        - [7.9.6. 系统信息函数](#796-系统信息函数)
        - [7.9.7. 加密函数](#797-加密函数)
        - [7.9.8. 其他函数](#798-其他函数)
    - [7.10. 存储过程](#710-存储过程)
        - [7.10.1. 基本概念](#7101-基本概念)
        - [7.10.2. 使用存储过程](#7102-使用存储过程)
    - [7.11. 视图](#711-视图)
        - [7.11.1. 基本概念](#7111-基本概念)
    - [7.12. 触发器](#712-触发器)
        - [7.12.1. 基本概念](#7121-基本概念)
        - [7.12.2. 触发器操作](#7122-触发器操作)
    - [7.13. 事务](#713-事务)
        - [7.13.1. 基本概念](#7131-基本概念)
            - [7.13.1.1. 事务特点](#71311-事务特点)
            - [7.13.1.2. 锁](#71312-锁)
            - [7.13.1.3. 多版本并发控制](#71313-多版本并发控制)
            - [7.13.1.4. 常见术语](#71314-常见术语)
        - [7.13.2. 基本语句](#7132-基本语句)
    - [7.14. 数据库索引](#714-数据库索引)
        - [7.14.1. 基本概念](#7141-基本概念)
            - [7.14.1.1. 分类](#71411-分类)
            - [7.14.1.2. 索引用途](#71412-索引用途)
            - [7.14.1.3. 索引的误区](#71413-索引的误区)
            - [7.14.1.4. 索引数据结构](#71414-索引数据结构)
    - [7.15. 存储引擎](#715-存储引擎)
        - [7.15.1. InnoDB存储引擎](#7151-innodb存储引擎)
        - [7.15.2. MyISAM存储引擎](#7152-myisam存储引擎)
        - [7.15.3. MEMORY存储引擎](#7153-memory存储引擎)
        - [7.15.4. 存储引擎的选择](#7154-存储引擎的选择)
    - [7.16. 性能优化基本的分析命令](#716-性能优化基本的分析命令)
        - [7.16.1. explain](#7161-explain)
        - [7.16.2. show indexs](#7162-show-indexs)
    - [7.17. 分库分表](#717-分库分表)
        - [7.17.1. 基本概念](#7171-基本概念)
        - [7.17.2. 分布式事务](#7172-分布式事务)
        - [7.17.3. 应对多机数据查询](#7173-应对多机数据查询)
            - [7.17.3.1. 跨库Join](#71731-跨库join)
            - [7.17.3.2. 外键约束](#71732-外键约束)
    - [7.18. 高可用](#718-高可用)
        - [7.18.1. 主从复制](#7181-主从复制)
            - [7.18.1.1. 常见形式](#71811-常见形式)
            - [7.18.1.2. 主从同步复制原理](#71812-主从同步复制原理)
            - [7.18.1.3. 主从同步配置](#71813-主从同步配置)
            - [7.18.1.4. 添加更多从服务器](#71814-添加更多从服务器)
- [8. Mybatis](#8-mybatis)
    - [8.1. 简介](#81-简介)
        - [8.1.1. 传统的JDBC编程](#811-传统的jdbc编程)
        - [8.1.2. ORM模型](#812-orm模型)
        - [8.1.3. HIBERNATE与MYBATIS的对比](#813-hibernate与mybatis的对比)
        - [8.1.4. Mybatis与iBatis的主要差异对比](#814-mybatis与ibatis的主要差异对比)
        - [8.1.5. Mybatis基本构成](#815-mybatis基本构成)
        - [8.1.6. 常见面试题](#816-常见面试题)
    - [8.2. 配置](#82-配置)
        - [8.2.1. 配置](#821-配置)
        - [8.2.2. 属性（properties）](#822-属性properties)
        - [8.2.3. 类型别名（typeAliases）](#823-类型别名typealiases)
        - [8.2.4. 类型处理器（typeHandlers）](#824-类型处理器typehandlers)
        - [8.2.5. 处理枚举类型](#825-处理枚举类型)
        - [8.2.6. 对象工厂（objectFactory）](#826-对象工厂objectfactory)
        - [8.2.7. 插件（plugins）](#827-插件plugins)
        - [8.2.8. 事务管理器（transactionManager）](#828-事务管理器transactionmanager)
        - [8.2.9. 数据源（dataSource）](#829-数据源datasource)
        - [8.2.10. 数据库厂商标识（databaseIdProvider）](#8210-数据库厂商标识databaseidprovider)
        - [8.2.11. 映射器（mappers）](#8211-映射器mappers)
    - [8.3. XML 映射文件](#83-xml-映射文件)
        - [8.3.1. select](#831-select)
        - [8.3.2. Insert, Update, Delete 元素的属性](#832-insert-update-delete-元素的属性)
        - [8.3.3. sql](#833-sql)
        - [8.3.4. 参数](#834-参数)
        - [8.3.5. 字符串替换](#835-字符串替换)
        - [8.3.6. 结果映射](#836-结果映射)
        - [8.3.7. 高级结果映射](#837-高级结果映射)
        - [8.3.8. 结果映射（resultMap）](#838-结果映射resultmap)
        - [8.3.9. 支持的 JDBC 类型](#839-支持的-jdbc-类型)
        - [8.3.10. 构造方法](#8310-构造方法)
        - [8.3.11. 关联](#8311-关联)
        - [8.3.12. 关联的嵌套 Select 查询](#8312-关联的嵌套-select-查询)
        - [8.3.13. 关联的嵌套结果映射](#8313-关联的嵌套结果映射)
        - [8.3.14. 关联的多结果集（ResultSet）](#8314-关联的多结果集resultset)
        - [8.3.15. 集合](#8315-集合)
        - [8.3.16. 集合的嵌套 Select 查询](#8316-集合的嵌套-select-查询)
        - [8.3.17. 集合的嵌套结果映射](#8317-集合的嵌套结果映射)
        - [8.3.18. 集合的多结果集（ResultSet）](#8318-集合的多结果集resultset)
        - [8.3.19. 鉴别器](#8319-鉴别器)
        - [8.3.20. 自动映射](#8320-自动映射)
    - [8.4. 动态 SQL](#84-动态-sql)
        - [8.4.1. if](#841-if)
        - [8.4.2. choose, when, otherwise](#842-choose-when-otherwise)
        - [8.4.3. trim, where, set](#843-trim-where-set)
        - [8.4.4. WHERE](#844-where)
        - [8.4.5. foreach](#845-foreach)
        - [8.4.6. script](#846-script)
        - [8.4.7. bind](#847-bind)
    - [8.5. 缓存](#85-缓存)
        - [8.5.1. Mybatis 缓存](#851-mybatis-缓存)
        - [8.5.2. 使用自定义缓存](#852-使用自定义缓存)
    - [8.6. 插件](#86-插件)
        - [8.6.1. 拦截的接口](#861-拦截的接口)
        - [8.6.2. 拦截器实现](#862-拦截器实现)
    - [8.7. 代码生成器](#87-代码生成器)
        - [8.7.1. 创建需要生成的数据表](#871-创建需要生成的数据表)
        - [8.7.2. 创建Mybatis代码自动生成配置文件](#872-创建mybatis代码自动生成配置文件)
        - [8.7.3. 配置运行](#873-配置运行)
    - [8.8. Mybatis整体架构](#88-mybatis整体架构)
        - [8.8.1. 基础支持层](#881-基础支持层)
        - [8.8.2. 核心处理层](#882-核心处理层)
        - [8.8.3. 接口层](#883-接口层)
        - [8.8.4. 模块说明](#884-模块说明)
- [9. Redis](#9-redis)
    - [9.1. 数据结构和对象](#91-数据结构和对象)
        - [9.1.1. 简单动态字符串](#911-简单动态字符串)
        - [9.1.2. 链表](#912-链表)
        - [9.1.3. 字典](#913-字典)
            - [9.1.3.1. Rehash](#9131-rehash)
        - [9.1.4. 跳跃表](#914-跳跃表)
        - [9.1.5. 整数集合](#915-整数集合)
        - [9.1.6. 压缩列表](#916-压缩列表)
        - [9.1.7. 对象](#917-对象)
            - [9.1.7.1. 对象类型和编码](#9171-对象类型和编码)
            - [9.1.7.2. 字符串对象](#9172-字符串对象)
            - [9.1.7.3. 列表对象](#9173-列表对象)
            - [9.1.7.4. 哈希对象](#9174-哈希对象)
            - [9.1.7.5. 集合对象](#9175-集合对象)
            - [9.1.7.6. 由于集合对象](#9176-由于集合对象)
            - [9.1.7.7. 类型检查和命令多态](#9177-类型检查和命令多态)
            - [9.1.7.8. 内存回收](#9178-内存回收)
            - [9.1.7.9. 对象共享](#9179-对象共享)
            - [9.1.7.10. 对象空转时长](#91710-对象空转时长)
    - [9.2. 单机数据库实现](#92-单机数据库实现)
        - [9.2.1. 数据库](#921-数据库)
        - [9.2.2. RDB持久化](#922-rdb持久化)
        - [9.2.3. AOF持久化](#923-aof持久化)
        - [9.2.4. 事件](#924-事件)
        - [9.2.5. 客户端](#925-客户端)
        - [9.2.6. 服务器](#926-服务器)
    - [9.3. 多机数据库实现](#93-多机数据库实现)
        - [9.3.1. 复制](#931-复制)
        - [9.3.2. 哨兵](#932-哨兵)
        - [9.3.3. 集群](#933-集群)
    - [9.4. 独立功能实现](#94-独立功能实现)
        - [9.4.1. 发布与订阅](#941-发布与订阅)
        - [9.4.2. 事务](#942-事务)
        - [9.4.3. LUA脚本](#943-lua脚本)
        - [9.4.4. 排序](#944-排序)
        - [9.4.5. 二进制位数组](#945-二进制位数组)
        - [9.4.6. 慢查询日志](#946-慢查询日志)
        - [9.4.7. 监视器](#947-监视器)
- [10. Nginx](#10-nginx)
    - [10.1. 概述](#101-概述)
        - [10.1.1. 功能特性](#1011-功能特性)
        - [10.1.2. Nginx快速理解](#1012-nginx快速理解)
    - [10.2. 基本使用和配置](#102-基本使用和配置)
        - [10.2.1. Nginx平滑升级](#1021-nginx平滑升级)
        - [10.2.2. 配置文件](#1022-配置文件)
    - [10.3. 架构说明](#103-架构说明)
        - [10.3.1. 模块化结构](#1031-模块化结构)
            - [10.3.1.1. 模块分类](#10311-模块分类)
        - [10.3.2. web请求处理机制](#1032-web请求处理机制)
        - [10.3.3. 设计架构概览](#1033-设计架构概览)
    - [10.4. 高级配置](#104-高级配置)
    - [10.5. gzip压缩](#105-gzip压缩)
    - [10.6. rewrite功能](#106-rewrite功能)
        - [10.6.1. nginx后端服务器组的配置的5个技术指令](#1061-nginx后端服务器组的配置的5个技术指令)
        - [10.6.2. rewrite功能的配置](#1062-rewrite功能的配置)
        - [10.6.3. rewrite使用](#1063-rewrite使用)
    - [10.7. 代理服务](#107-代理服务)
        - [10.7.1. 正向代理和反向代理](#1071-正向代理和反向代理)
        - [10.7.2. Nginx正向代理服务](#1072-nginx正向代理服务)
        - [10.7.3. Nginx反向代理服务](#1073-nginx反向代理服务)
            - [10.7.3.1. 反向代理基本设置的21个指令](#10731-反向代理基本设置的21个指令)
            - [10.7.3.2. proxy buffer 的配置的7个指令](#10732-proxy-buffer-的配置的7个指令)
            - [10.7.3.3. proxy cache 的配置的12个指令](#10733-proxy-cache-的配置的12个指令)
        - [10.7.4. Nginx服务器负载均衡](#1074-nginx服务器负载均衡)
    - [10.8. 邮件服务](#108-邮件服务)
    - [10.9. 源码结构](#109-源码结构)
    - [10.10. 基本数据结构](#1010-基本数据结构)
    - [10.11. 启动初始化](#1011-启动初始化)
        - [10.11.1. 启动过程概览](#10111-启动过程概览)
    - [10.12. 时间管理](#1012-时间管理)
    - [10.13. 内存管理](#1013-内存管理)
        - [10.13.1. 内存的逻辑结构](#10131-内存的逻辑结构)
        - [10.13.2. 内存池管理](#10132-内存池管理)
        - [10.13.3. 内存的使用](#10133-内存的使用)
    - [10.14. 工作进程](#1014-工作进程)
        - [10.14.1. nginx服务进程间通信](#10141-nginx服务进程间通信)
            - [10.14.1.1. Linux进程间通信方式](#101411-linux进程间通信方式)
            - [10.14.1.2. Linux进程间双工通信方式的实现](#101412-linux进程间双工通信方式的实现)
            - [10.14.1.3. 通信通道建立和设置](#101413-通信通道建立和设置)
            - [10.14.1.4. 通信通道的使用](#101414-通信通道的使用)
            - [10.14.1.5. 消息的读写](#101415-消息的读写)
    - [10.15. 模块编程](#1015-模块编程)
        - [10.15.1. 模块的种类](#10151-模块的种类)
        - [10.15.2. 模块开发实战](#10152-模块开发实战)
        - [10.15.3. 模块的编译和安装](#10153-模块的编译和安装)
- [11. WEB容器](#11-web容器)
    - [11.1. WEB容器比较](#111-web容器比较)
    - [11.2. Servlet规范](#112-servlet规范)
    - [11.3. Session和Cookie的区别](#113-session和cookie的区别)
        - [11.3.1. 概念理解](#1131-概念理解)
        - [11.3.2. cookie](#1132-cookie)
        - [11.3.3. Session](#1133-session)
        - [11.3.4. 总结](#1134-总结)
        - [11.3.5. 应用场景](#1135-应用场景)
    - [11.4. SpringBoot WEB相关配置](#114-springboot-web相关配置)
    - [11.5. Tomcat](#115-tomcat)
        - [11.5.1. 概述](#1151-概述)
            - [11.5.1.1. Tomcat快速理解](#11511-tomcat快速理解)
        - [11.5.2. Web服务机制](#1152-web服务机制)
            - [11.5.2.1. 通信协议](#11521-通信协议)
        - [11.5.3. Tomcat 总体架构](#1153-tomcat-总体架构)
        - [11.5.4. Server和Service组件](#1154-server和service组件)
        - [11.5.5. Connect组件](#1155-connect组件)
        - [11.5.6. Engine组件](#1156-engine组件)
        - [11.5.7. Host容器](#1157-host容器)
        - [11.5.8. Context容器](#1158-context容器)
        - [11.5.9. Wrapper容器](#1159-wrapper容器)
        - [11.5.10. 生命周期管理](#11510-生命周期管理)
        - [11.5.11. 日志框架和国家化](#11511-日志框架和国家化)
        - [11.5.12. 公共与隔离类加载器](#11512-公共与隔离类加载器)
        - [11.5.13. 请求URI映射器Mapper](#11513-请求uri映射器mapper)
        - [11.5.14. Tomcat的JNDI](#11514-tomcat的jndi)
        - [11.5.15. 运行、通信、及访问安全管理](#11515-运行通信及访问安全管理)
        - [11.5.16. 处理请求和响应的管道](#11516-处理请求和响应的管道)
        - [11.5.17. 多样化的会话管理器](#11517-多样化的会话管理器)
        - [11.5.18. 高可用集群实现](#11518-高可用集群实现)
        - [11.5.19. 集群通信框架](#11519-集群通信框架)
        - [11.5.20. 监控和管理](#11520-监控和管理)
    - [11.6. Jetty](#116-jetty)
    - [11.7. 编码问题](#117-编码问题)
        - [11.7.1. 常见的编码格式](#1171-常见的编码格式)

<!-- /TOC -->
# 1. 基础工具
## 1.1. 技术社区
<a href="#menu" style="float:right">目录</a>


* [博客园](https://www.cnblogs.com/)
* [开源中国](https://www.oschina.net/)
* [stackoverflow](https://stackoverflow.com/)
* [CSDN](https://www.csdn.net/)
* [掘金](https://juejin.im/)
* [技术文档下载](http://www.java1234.com/)
* [leetcode](https://leetcode.com/)
* [牛客网](https://www.nowcoder.com/)

## 1.2. 常用工具

### 1.2.1. 编译器
* IDEA （个人觉得IDEA比较好用）
* Eclipse
* MyEclipse

### 1.2.2. IDEA插件
* Lombok： 使用注解，免去实体类中get /set/构造器等代码 ，需要引入lombok包
* Alibaba Java Coding Guidelines ：《阿里巴巴Java开发规约》扫描插件,安装后右键单击选择扫描，会提示哪些地方不符合规范
* MyBatis plugin ： 可以从mybatis mappe接口的方法直接跳转到mapper.xml配置文件
* jclasslib: JClassLib不但是一个字节码阅读器而且还包含一个类库允许开发者读取,修改,写入Java Class文件与字节码


### 1.2.3. HTTP请求
* POSTMAN（https://www.getpostman.com/）:一款功能强大的网页调试与发送网页HTTP请求的工具
* curl指令

### 1.2.4. 前端开发编辑
* [vscode](https://code.visualstudio.com/Download)
* IDEA
* Brackets   代码提示，颜色区分
* sublime_text_3   这个Linux下安装后，不支持中文输入，网上有解决办法。

### 1.2.5. 绘图工具
#### 1.2.5.1. 思维导图
* MindMaster   多平台，免费，可以导出为图片。
#### 1.2.5.2. UML
* https://www.draw.io/ ：在线UML绘制工具，可以保存到本地或者Github
* Dia
```bash
//安装Dia
sudo apt install dia
//运行Dia
dia
```
### 1.2.6. 编辑器
* VIM
* GEDIT　

### 1.2.7. 调优工具
* visualVm(https://visualvm.github.io/):是一款免费的,集成了多个 JDK 命令行工具的可视化工具,它能为您提供强大的分析能力,对 Java 应用程序做性能分析和调优.

### 1.2.8. 压测工具
* Jmeter   可以开多个线程对接口进行压测，并分析压测结果。

### 1.2.9. 版本管理
* git     
* svn
* 码云
* Git在线练习 [try git](https://try.github.io/)/[git real](https://www.pluralsight.com/courses/code-school-git-real)/[Learn Git Branching](https://learngitbranching.js.org/)

### 1.2.10. 其他
* SpringBoot Banner 字符生成 [根据图片生成](https://www.degraeve.com/img2txt.php)/[根据文字生成](http://patorjk.com/software/taag/#p=display&f=3D-ASCII&t=MicroBlog%0A)


## 1.3. Git
<a href="#menu" style="float:right">目录</a>

### 1.3.1. 基本概念
* 工作区：当前的工作目录
* 本地库: 工作区有一个隐藏目录.git，这个不算工作区，而是Git的版本库
  Git的版本库里存了很多东西，其中最重要的就是称为stage（或者叫index）的暂存区，还有Git为我们自动创建的第一个分支master，以及指向master的一个指针叫HEAD
![](https://www.liaoxuefeng.com/files/attachments/919020037470528/0)
* 远端仓库: 存放在GitHub网站上的版本库

工作区---git add --> 暂存区 ---git commit--->本地仓库---git push --->远程仓库

![](http://img5.imgtn.bdimg.com/it/u=4071081808,3892000553&fm=26&gp=0.jpg)
* 分支相当于给当前的文件创建一个副本，在副本上进行修改，可以创建无数个分支进行同步开发，开发完成后再进行合并操作。

### 1.3.2. 常用命令
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
## 1.4. Maven
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
* mvn dependency:tree 打印依赖
* 全局移除依赖

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-logging</artifactId>
    <exclusions>
        <exclusion>
            <groupId>*</groupId>
            <artifactId>*</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```

## 1.5. Jenkins
<a href="#menu" style="float:right">目录</a>

## 1.6. Docker
<a href="#menu" style="float:right">目录</a>

### 1.6.1. Docker常用指令

#### 1.6.1.1. 基本概念
* Docker： 可以让开发者打包它们的应用和依赖包到一个可移植的容器中，然后将其发布到任何流行该的Linux机器上。利用docker,可以实现软件一次配置，出处运行。
* DockerHub:存储DOCKER镜像远程仓库，类似GitHub,用户可以进行对镜像进行存储，分享，管理。
* Docker是一种容器，容器是一种轻量级的虚拟技术，和容器相对应的是更为重量级的虚拟技术是虚拟机。
![](https://github.com/lgjlife/Java-Study/blob/master/pic/docker/docker1.png?raw=true)
![](https://github.com/lgjlife/Java-Study/blob/master/pic/docker/docker2.png?raw=true)

* Docker组件
    * 镜像Image
        * 只读的静态模板，保存容器需要的环境和应用的执行代码，可以把镜像看成容器的带代码。
        * 当代码运行起来就成了容器
        * 镜像采用分层机制，每个镜像都是只读的
        * 可以将写数据的层通过联合文件附加到原有的镜像之上，这种增量式修改使得镜像非常容易存储，传输和更新。
    * 容器 container
        * 是一个运行时环境，是镜像的运行状态
        * 容器是可读写的
        * 可以在容器中运行多个服务
    * 仓库
        * 用于存放镜像
        * 可以从仓库中拉取镜像，向仓库传送镜像
        * 可以创建私有和公有的仓库  

* Docker特点
    * 隔离性
        * 主机和容器，容器和容器之间的进程，网络，消息和文件系统相互隔离
    * 可度量性
    * 移植性
    * 安全性
* Docker 安装
    * 文档地址 https://docs.docker.com/install/linux/docker-ce/ubuntu/#install-from-a-package
```bash
# 查看可以安装的版本
lgj@lgj-Lenovo-G470:~/Downloads$ apt-cache madison docker-ce
 docker-ce | 5:18.09.7~3-0~ubuntu-bionic | https://mirrors.aliyun.com/docker-ce/linux/ubuntu bionic/edge amd64 Packages
 docker-ce | 5:18.09.6~3-0~ubuntu-bionic | https://mirrors.aliyun.com/docker-ce/linux/ubuntu bionic/edge amd64 Packages
 docker-ce | 5:18.09.5~3-0~ubuntu-bionic | https://mirrors.aliyun.com/docker-ce/linux/ubuntu bionic/edge amd64 Packages
 docker-ce | 5:18.09.4~3-0~ubuntu-bionic | https://mirrors.aliyun.com/docker-ce/linux/ubuntu bionic/edge amd64 Packages
 docker-ce | 5:18.09.3~3-0~ubuntu-bionic | https://mirrors.aliyun.com/docker-ce/linux/ubuntu bionic/edge amd64 Packages
 docker-ce | 5:18.09.2~3-0~ubuntu-bionic | https://mirrors.aliyun.com/docker-ce/linux/ubuntu bionic/edge amd64 Packages
 docker-ce | 5:18.09.1~3-0~ubuntu-bionic | https://mirrors.aliyun.com/docker-ce/linux/ubuntu bionic/edge amd64 Packages
 docker-ce | 5:18.09.0~3-0~ubuntu-bionic | https://mirrors.aliyun.com/docker-ce/linux/ubuntu bionic/edge amd64 Packages
 docker-ce | 18.06.3~ce~3-0~ubuntu | https://mirrors.aliyun.com/docker-ce/linux/ubuntu bionic/edge amd64 Packages
 docker-ce | 18.06.2~ce~3-0~ubuntu | https://mirrors.aliyun.com/docker-ce/linux/ubuntu bionic/edge amd64 Packages
 docker-ce | 18.06.1~ce~3-0~ubuntu | https://mirrors.aliyun.com/docker-ce/linux/ubuntu bionic/edge amd64 Packages
 docker-ce | 18.06.0~ce~3-0~ubuntu | https://mirrors.aliyun.com/docker-ce/linux/ubuntu bionic/edge amd64 Packages
 docker-ce | 18.05.0~ce~3-0~ubuntu | https://mirrors.aliyun.com/docker-ce/linux/ubuntu bionic/edge amd64 Packages
 docker-ce | 18.03.1~ce~3-0~ubuntu | https://mirrors.aliyun.com/docker-ce/linux/ubuntu bionic/edge amd64 Packages
#安装
lgj@lgj-Lenovo-G470:~/Downloads$ sudo apt-get install  docker-ce=18.06.3~ce~3-0~ubuntu
#查看安装成功与否
lgj@lgj-Lenovo-G470:~$ docker version
Client:
 Version:           18.06.3-ce
 API version:       1.38
 Go version:        go1.10.3
 Git commit:        d7080c1
 Built:             Wed Feb 20 02:28:10 2019
 OS/Arch:           linux/amd64
 Experimental:      false

Server:
 Engine:
  Version:          18.06.3-ce
  API version:      1.38 (minimum version 1.12)
  Go version:       go1.10.3
  Git commit:       d7080c1
  Built:            Wed Feb 20 02:26:34 2019
  OS/Arch:          linux/amd64
  Experimental:     false


```
            
### 1.6.2. 常用指令
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

### 1.6.3. 容器
<a href="#menu" style="float:right">目录</a>

#### 1.6.3.1. 容器的管理操作
* 创建容器
    * docker create image-name
        * 创建的容器处于停止状态
    * docker run image-name
        * 创建并运行容器

* 容器标识符
    * 容器名称，不配置则自动生成
    * 容器短ID和长ID     
命令介绍
```
dpcker run - i -t --name=xxxx ubuntu /bin/bash
```
镜像后面是执行的命令，上面是执行bash shell。
常用
-i:打开容器的标准输入
-t:为容器建立一个命令行终端
--name:设置容器名称
--ip:设置容器ip
-p:开放的端口
-d：以后台方式运行，不显示控制台
```bash
Usage:	docker run [OPTIONS] IMAGE [COMMAND] [ARG...]

Run a command in a new container

Options:
      --add-host list                  Add a custom host-to-IP mapping
                                       (host:ip)
  -a, --attach list                    Attach to STDIN, STDOUT or STDERR
      --blkio-weight uint16            Block IO (relative weight),
                                       between 10 and 1000, or 0 to
                                       disable (default 0)
      --blkio-weight-device list       Block IO weight (relative device
                                       weight) (default [])
      --cap-add list                   Add Linux capabilities
      --cap-drop list                  Drop Linux capabilities
      --cgroup-parent string           Optional parent cgroup for the
                                       container
      --cidfile string                 Write the container ID to the file
      --cpu-period int                 Limit CPU CFS (Completely Fair
                                       Scheduler) period
      --cpu-quota int                  Limit CPU CFS (Completely Fair
                                       Scheduler) quota
      --cpu-rt-period int              Limit CPU real-time period in
                                       microseconds
      --cpu-rt-runtime int             Limit CPU real-time runtime in
                                       microseconds
  -c, --cpu-shares int                 CPU shares (relative weight)
      --cpus decimal                   Number of CPUs
      --cpuset-cpus string             CPUs in which to allow execution
                                       (0-3, 0,1)
      --cpuset-mems string             MEMs in which to allow execution
                                       (0-3, 0,1)
  -d, --detach                         Run container in background and
                                       print container ID
      --detach-keys string             Override the key sequence for
                                       detaching a container
      --device list                    Add a host device to the container
      --device-cgroup-rule list        Add a rule to the cgroup allowed
                                       devices list
      --device-read-bps list           Limit read rate (bytes per second)
                                       from a device (default [])
      --device-read-iops list          Limit read rate (IO per second)
                                       from a device (default [])
      --device-write-bps list          Limit write rate (bytes per
                                       second) to a device (default [])
      --device-write-iops list         Limit write rate (IO per second)
                                       to a device (default [])
      --disable-content-trust          Skip image verification (default true)
      --dns list                       Set custom DNS servers
      --dns-option list                Set DNS options
      --dns-search list                Set custom DNS search domains
      --entrypoint string              Overwrite the default ENTRYPOINT
                                       of the image
  -e, --env list                       Set environment variables
      --env-file list                  Read in a file of environment variables
      --expose list                    Expose a port or a range of ports
      --group-add list                 Add additional groups to join
      --health-cmd string              Command to run to check health
      --health-interval duration       Time between running the check
                                       (ms|s|m|h) (default 0s)
      --health-retries int             Consecutive failures needed to
                                       report unhealthy
      --health-start-period duration   Start period for the container to
                                       initialize before starting
                                       health-retries countdown
                                       (ms|s|m|h) (default 0s)
      --health-timeout duration        Maximum time to allow one check to
                                       run (ms|s|m|h) (default 0s)
      --help                           Print usage
  -h, --hostname string                Container host name
      --init                           Run an init inside the container
                                       that forwards signals and reaps
                                       processes
  -i, --interactive                    Keep STDIN open even if not attached
      --ip string                      IPv4 address (e.g., 172.30.100.104)
      --ip6 string                     IPv6 address (e.g., 2001:db8::33)
      --ipc string                     IPC mode to use
      --isolation string               Container isolation technology
      --kernel-memory bytes            Kernel memory limit
  -l, --label list                     Set meta data on a container
      --label-file list                Read in a line delimited file of labels
      --link list                      Add link to another container
      --link-local-ip list             Container IPv4/IPv6 link-local
                                       addresses
      --log-driver string              Logging driver for the container
      --log-opt list                   Log driver options
      --mac-address string             Container MAC address (e.g.,
                                       92:d0:c6:0a:29:33)
  -m, --memory bytes                   Memory limit
      --memory-reservation bytes       Memory soft limit
      --memory-swap bytes              Swap limit equal to memory plus
                                       swap: '-1' to enable unlimited swap
      --memory-swappiness int          Tune container memory swappiness
                                       (0 to 100) (default -1)
      --mount mount                    Attach a filesystem mount to the
                                       container
      --name string                    Assign a name to the container
      --network string                 Connect a container to a network
                                       (default "default")
      --network-alias list             Add network-scoped alias for the
                                       container
      --no-healthcheck                 Disable any container-specified
                                       HEALTHCHECK
      --oom-kill-disable               Disable OOM Killer
      --oom-score-adj int              Tune host's OOM preferences (-1000
                                       to 1000)
      --pid string                     PID namespace to use
      --pids-limit int                 Tune container pids limit (set -1
                                       for unlimited)
      --privileged                     Give extended privileges to this
                                       container
  -p, --publish list                   Publish a container's port(s) to
                                       the host
  -P, --publish-all                    Publish all exposed ports to
                                       random ports
      --read-only                      Mount the container's root
                                       filesystem as read only
      --restart string                 Restart policy to apply when a
                                       container exits (default "no")
      --rm                             Automatically remove the container
                                       when it exits
      --runtime string                 Runtime to use for this container
      --security-opt list              Security Options
      --shm-size bytes                 Size of /dev/shm
      --sig-proxy                      Proxy received signals to the
                                       process (default true)
      --stop-signal string             Signal to stop a container
                                       (default "SIGTERM")
      --stop-timeout int               Timeout (in seconds) to stop a
                                       container
      --storage-opt list               Storage driver options for the
                                       container
      --sysctl map                     Sysctl options (default map[])
      --tmpfs list                     Mount a tmpfs directory
  -t, --tty                            Allocate a pseudo-TTY
      --ulimit ulimit                  Ulimit options (default [])
  -u, --user string                    Username or UID (format:
                                       <name|uid>[:<group|gid>])
      --userns string                  User namespace to use
      --uts string                     UTS namespace to use
  -v, --volume list                    Bind mount a volume
      --volume-driver string           Optional volume driver for the
                                       container
      --volumes-from list              Mount volumes from the specified
                                       container(s)
  -w, --workdir string                 Working directory inside the container

``` 
* 查看容器
    * 查看全部的容器 docker ps -a
    * 查看正在运行的容器 docker ps 
    * 显示的参数列表
        * CONTAINER ID：容器的唯一ID
        * IMAGE：创建容器时使用的镜像
        * COMMAND：容器最后运行的命令
        * CREATE：创建容器的时间
        * STATUS：容器的状态
            * 正常 ： Up 49s
            * 异常 : exited（0），数字为错误码
        * PORTS ： 开放的端口
        * NAMES : 容器的名称，不使用--name指定则系统随机生成

* 启动容器
    * docker start name|id

* 终止容器
    * docker stop name|id
* 删除容器
    * docker rm name|id

以上操作可能会出现无法执行的问题，执行以下指令再操作
```
sudo aa-remove-unknown
```
#### 1.6.3.2. 容器内部信息的获取
* 查看容器日志
    * docker logs -f --tail=5 name|id
```bash
lgj@lgj-Lenovo-G470:~$ docker logs --help

Usage:	docker logs [OPTIONS] CONTAINER

Fetch the logs of a container

Options:
      --details        Show extra details provided to logs
  -f, --follow         Follow log output //动态更新
      --since string   Show logs since timestamp (e.g. 2013-01-02T13:23:37) or relative (e.g. 42m for 42 minutes)
      --tail string    Number of lines to show from the end of the logs (default "all") //显示行数
  -t, --timestamps     Show timestamps
      --until string   Show logs before a timestamp (e.g. 2013-01-02T13:23:37) or relative (e.g. 42m for 42 minutes)

```

* 查看容器进程
    * docker top name|id

* 查看容器信息
    * docker inspect name|id

* 容器内执行命令
    * docker exec -it name /bin/bash 执行时确保容器处于运行状态
    
### 1.6.4. 镜像
<a href="#menu" style="float:right">目录</a>

#### 1.6.4.1. 基本概念
* 镜像是一个包含程序运行必要依赖环境和代码的只读文件，采用分层的文件系统，将每一次改变以读写层的形式增加到原来的只读文件上

* Docker镜像的系统结构(由上而下)
    * kernel(bootfs)
    * ubuntu(根镜像)
    * add nginx （镜像1）
    * add vim (镜像2)
    * 可读写(容器)
* 镜像的本质是磁盘上一系列文件的集合。创建新的镜像是在原有的镜像文件上进行增删改，镜像之间并不孤立，而是上层依赖下层。
* 镜像的写时复制机制
    * 创建一个容器时，实际上是在该镜像上创建一个空的可读写文件系统层级。可以将这个容器当成一个临时镜像。
    * 原镜像的内容都是以只读方式挂载进来的，容器会读取镜像的内容。
    * 一旦涉及到修改镜像文件，便会触发Docker从原镜像中复制这个文件到临时镜像中，所有修改均发生在临时镜像中。不会对原镜像产生任何影响。  

#### 1.6.4.2. 本地镜像的管理

* 查看镜像
    * docker images
    * 显示参数说明
        * REPOSITORY
            * 镜像仓库
        * TAG
            * 镜像标签，没指定则latest
        * IMAGE ID
            * 镜像ID
        * CREATE
            * 创建时间信息
        * VIRTUAL SIZE
            * 镜像所占用的虚拟大小，包括所有共享文件的大小
    * 镜像的完整标识
        * 仓库：TAG

* 下载镜像
    * docker run 时，如果本地没有，则从仓库下载
    * docker search 搜素镜像
        * 显示信息说明
            *  mame
                * 镜像名称,由命名空间和仓库名称组成
            * description 
                * 镜像描述
            * stars
                * 评分
            * official
                * 是否为官方镜像
            * automated
                * 是否使用了自动构建
    * 拉取镜像到本地
        * docker pull ubuntu:18

* 删除镜像
    * docker rmi name|id

* 创建本地镜像
    * 基于容器创建
        * docker commit -m="xxxx" --author="xxx"  containName|id  xxx/xxx:1.0
```bash
lgj@lgj-Lenovo-G470:~$ docker commit --help

Usage:	docker commit [OPTIONS] CONTAINER [REPOSITORY[:TAG]]

Create a new image from a container's changes

Options:
  -a, --author string    Author (e.g., "John Hannibal Smith <hannibal@a-team.com>")
  -c, --change list      Apply Dockerfile instruction to the created image
  -m, --message string   Commit message
  -p, --pause            Pause container during commit (default true)

```
### 1.6.5. Docker File
<a href="#menu" style="float:right">目录</a>

**FROM**
* 功能为指定基础镜像，并且必须是第一条指令。
* 如果不以任何镜像为基础，那么写法为：FROM scratch。
* 同时意味着接下来所写的指令将作为镜像的第一层开始

* 语法：
    * FROM image
    * FROM image:tag
    * FROM image:digest 
    * 三种写法，其中tag和digest 是可选项，如果没有选择，那么默认值为latest

**RUN**
* 功能为运行指定的命令
* RUN命令有两种格式
    * RUN command
    * RUN ["executable", "param1", "param2"]

第一种后边直接跟shell命令
在linux操作系统上默认 /bin/sh -c
在windows操作系统上默认 cmd /S /C
第二种是类似于函数调用。
可将executable理解成为可执行文件，后面就是两个参数。

两种写法比对：
RUN /bin/bash -c 'source $HOME/.bashrc; echo $HOME
RUN ["/bin/bash", "-c", "echo hello"]
注意：多行命令不要写多个RUN，原因是Dockerfile中每一个指令都会建立一层.
多少个RUN就构建了多少层镜像，会造成镜像的臃肿、多层，不仅仅增加了构件部署的时间，还容易出错。
RUN书写时的换行符是\
多条命令:
RUN apt-get update && \
    apt install vim


**CMD**
* 功能为容器启动时要运行的命令
* 语法有三种写法
    * CMD ["executable","param1","param2"]
    * CMD ["param1","param2"]
    * CMD command param1 param2

第三种比较好理解了，就时shell这种执行方式和写法
第一种和第二种其实都是可执行文件加上参数的形式

举例说明两种写法：
CMD [ "sh", "-c", "echo $HOME" 
CMD [ "echo", "$HOME" ]
补充细节：这里边包括参数的一定要用双引号，就是",不能是单引号。千万不能写成单引号。
原因是参数传递后，docker解析的是一个JSON array


**RUN & CMD**

不要把RUN和CMD搞混了。
RUN是构件容器时就运行的命令以及提交运行结果
CMD是容器启动时执行的命令，在构件时并不运行，构件时紧紧指定了这个命令到底是个什么样子

**LABEL**

功能是为镜像指定标签
* 语法：
    * LABEL key=value key=value key=value ...
 一个Dockerfile种可以有多个LABEL，如下：
LABEL "com.example.vendor"="ACME Incorporated"
LABEL com.example.label-with-value="foo"
LABEL version="1.0"
LABEL description="This text illustrates \
that label-values can span multiple lines."
 但是并不建议这样写，最好就写成一行，如太长需要换行的话则使用\符号

如下：

LABEL multi.label1="value1" \
multi.label2="value2" \
other="value3"
 
说明：LABEL会继承基础镜像种的LABEL，如遇到key相同，则值覆盖

**MAINTAINER**
指定作者
* 语法：
    * MAINTAINER name

**EXPOSE**

功能为暴漏容器运行时的监听端口给外部
但是EXPOSE并不会使容器访问主机的端口
如果想使得容器与主机的端口有映射关系，必须在容器启动的时候加上 -P参数

**ENV**

功能为设置环境变量
语法有两种
1. ENV key value
2. ENV key=value ...
两者的区别就是第一种是一次设置一个，第二种是一次设置多个

**ADD**
一个复制命令，把文件复制到景象中。
如果把虚拟机与容器想象成两台linux服务器的话，那么这个命令就类似于scp，只是scp需要加用户名和密码的权限验证，而ADD不用。
语法如下：

1. ADD src... dest
2. ADD ["src",... "dest"]

dest路径的填写可以是容器内的绝对路径，也可以是相对于工作目录的相对路径
src可以是一个本地文件或者是一个本地压缩文件，还可以是一个url
如果把src写成一个url，那么ADD就类似于wget命令

如以下写法都是可以的：
ADD test relativeDir/ 
ADD test /relativeDir
ADD http://example.com/foobar /
尽量不要把scr写成一个文件夹，如果src是一个文件夹了，复制整个目录的内容,包括文件系统元数据

**COPY**
看这个名字就知道，又是一个复制命令
语法如下：
1. COPY src... dest
2. COPY ["src",... "dest"]
与ADD的区别
COPY的src只能是本地文件，其他用法一致

**ENTRYPOINT**
功能是启动时的默认命令
语法如下：
1. ENTRYPOINT ["executable", "param1", "param2"]
2. ENTRYPOINT command param1 param2

如果从上到下看到这里的话，那么你应该对这两种语法很熟悉啦。
第二种就是写shel
第一种就是可执行文件加参数
与CMD比较说明（这俩命令太像了，而且还可以配合使用）：
1. 相同点：
只能写一条，如果写了多条，那么只有最后一条生效
容器启动时才运行，运行时机相同
2. 不同点：
ENTRYPOINT不会被运行的command覆盖，而CMD则会被覆盖
如果我们在Dockerfile种同时写了ENTRYPOINT和CMD，并且CMD指令不是一个完整的可执行命令，那么CMD指定的内容将会作为ENTRYPOINT的参数

如下：
FROM ubuntu
ENTRYPOINT ["top", "-b"]
CMD ["-c"]
如果我们在Dockerfile种同时写了ENTRYPOINT和CMD，并且CMD是一个完整的指令，那么它们两个会互相覆盖，谁在最后谁生效

如下：
FROM ubuntu
ENTRYPOINT ["top", "-b"]
CMD ls -al
那么将执行ls -al ,top -b不会执行。

**VOLUME**
可实现挂载功能，可以将内地文件夹或者其他容器种得文件夹挂在到这个容器种
语法为：
VOLUME ["/data"]
说明：
["/data"]可以是一个JsonArray ，也可以是多个值。所以如下几种写法都是正确的

VOLUME ["/var/log/"]
VOLUME /var/log
VOLUME /var/log /var/db
一般的使用场景为需要持久化存储数据时

容器使用的是AUFS，这种文件系统不能持久化数据，当容器关闭后，所有的更改都会丢失。

所以当数据需要持久化时用这个命令。

**USER**
设置启动容器的用户，可以是用户名或UID，所以，只有下面的两种写法是正确的
USER daemo
USER UID
注意：如果设置了容器以daemon用户去运行，那么RUN, CMD 和 ENTRYPOINT 都会以这个用户去运行

**WORKDIR**
语法：
WORKDIR /path/to/workdir

设置工作目录，对RUN,CMD,ENTRYPOINT,COPY,ADD生效。如果不存在则会创建，也可以设置多次。
如：
WORKDIR /a
WORKDIR b
WORKDIR c
RUN pwd
pwd执行的结果是/a/b/c

WORKDIR也可以解析环境变量
如：
ENV DIRPATH /path
WORKDIR $DIRPATH/$DIRNAME
RUN pwd
pwd的执行结果是/path/$DIRNAME

**ARG**
语法：
ARG name[default value]
设置变量命令，ARG命令定义了一个变量，在docker build创建镜像的时候，使用 --build-arg varname=value来指定参数

如果用户在build镜像时指定了一个参数没有定义在Dockerfile种，那么将有一个Warning

提示如下：

[Warning] One or more build-args [foo] were not consumed.
    

我们可以定义一个或多个参数，如下：

FROM busybox
ARG user1
ARG buildno
...
也可以给参数一个默认值：

FROM busybox
ARG user1=someuser
ARG buildno=1
...
如果我们给了ARG定义的参数默认值，那么当build镜像时没有指定参数值，将会使用这个默认值

**ONBUILD**

语法：
ONBUILD [INSTRUCTION]
这个命令只对当前镜像的子镜像生效。
比如当前镜像为A，在Dockerfile种添加：
ONBUILD RUN ls -al
这个 ls -al 命令不会在A镜像构建或启动的时候执行
此时有一个镜像B是基于A镜像构建的，那么这个ls -al 命令会在B镜像构建的时候被执行。

**STOPSIGNAL**

语法：
STOPSIGNAL signal
STOPSIGNAL命令是的作用是当容器推出时给系统发送什么样的指令

**HEALTHCHECK**
容器健康状况检查命令

语法有两种：
1. HEALTHCHECK [OPTIONS] CMD command
2. HEALTHCHECK NONE
第一个的功能是在容器内部运行一个命令来检查容器的健康状况
第二个的功能是在基础镜像中取消健康检查命令
[OPTIONS]的选项支持以下三中选项：
    --interval=DURATION 两次检查默认的时间间隔为30秒
    --timeout=DURATION 健康检查命令运行超时时长，默认30秒
    --retries=N 当连续失败指定次数后，则容器被认为是不健康的，状态为unhealthy，默认次数是3

注意：
HEALTHCHECK命令只能出现一次，如果出现了多次，只有最后一个生效。
CMD后边的命令的返回值决定了本次健康检查是否成功，具体的返回值如下：
0: success - 表示容器是健康的
1: unhealthy - 表示容器已经不能工作了
2: reserved - 保留值
例子：
HEALTHCHECK --interval=5m --timeout=3s \
CMD curl -f http://localhost/ || exit 1
健康检查命令是：curl -f http://localhost/ || exit 
两次检查的间隔时间是5秒
命令超时时间为3秒    

```
lgj@lgj-Lenovo-G470:~$ docker build --help

Usage:	docker build [OPTIONS] PATH | URL | -

Build an image from a Dockerfile

Options:
      --add-host list           Add a custom host-to-IP mapping (host:ip)
      --build-arg list          Set build-time variables
      --cache-from strings      Images to consider as cache sources
      --cgroup-parent string    Optional parent cgroup for the container
      --compress                Compress the build context using gzip
      --cpu-period int          Limit the CPU CFS (Completely Fair Scheduler) period
      --cpu-quota int           Limit the CPU CFS (Completely Fair Scheduler) quota
  -c, --cpu-shares int          CPU shares (relative weight)
      --cpuset-cpus string      CPUs in which to allow execution (0-3, 0,1)
      --cpuset-mems string      MEMs in which to allow execution (0-3, 0,1)
      --disable-content-trust   Skip image verification (default true)
  -f, --file string             Name of the Dockerfile (Default is 'PATH/Dockerfile')
      --force-rm                Always remove intermediate containers
      --iidfile string          Write the image ID to the file
      --isolation string        Container isolation technology
      --label list              Set metadata for an image
  -m, --memory bytes            Memory limit
      --memory-swap bytes       Swap limit equal to memory plus swap: '-1' to enable unlimited swap
      --network string          Set the networking mode for the RUN instructions during build (default "default")
      --no-cache                Do not use cache when building the image
      --pull                    Always attempt to pull a newer version of the image
  -q, --quiet                   Suppress the build output and print image ID on success
      --rm                      Remove intermediate containers after a successful build (default true)
      --security-opt strings    Security options
      --shm-size bytes          Size of /dev/shm
  -t, --tag list                Name and optionally a tag in the 'name:tag' format
      --target string           Set the target build stage to build.
      --ulimit ulimit           Ulimit options (default [])

```
```
OPTIONS说明：

--build-arg=[] :设置镜像创建时的变量；

--cpu-shares :设置 cpu 使用权重；

--cpu-period :限制 CPU CFS周期；

--cpu-quota :限制 CPU CFS配额；

--cpuset-cpus :指定使用的CPU id；

--cpuset-mems :指定使用的内存 id；

--disable-content-trust :忽略校验，默认开启；

-f :指定要使用的Dockerfile路径；

--force-rm :设置镜像过程中删除中间容器；

--isolation :使用容器隔离技术；

--label=[] :设置镜像使用的元数据；

-m :设置内存最大值；

--memory-swap :设置Swap的最大值为内存+swap，"-1"表示不限swap；

--no-cache :创建镜像的过程不使用缓存；

--pull :尝试去更新镜像的新版本；

--quiet, -q :安静模式，成功后只输出镜像 ID；

--rm :设置镜像成功后删除中间容器；

--shm-size :设置/dev/shm的大小，默认值是64M；

--ulimit :Ulimit配置。

--tag, -t: 镜像的名字及标签，通常 name:tag 或者 name 格式；可以在一次构建中为一个镜像设置多个标签。

--network: 默认 default。在构建期间设置RUN指令的网络模式
```
### 1.6.6. 数据卷和容器连接
<a href="#menu" style="float:right">目录</a>

#### 1.6.6.1. 容器网络基础
ifconfig 可以看到docker的默认分配地址是172.17.0.1
```bash
lgj@lgj-Lenovo-G470:~$ ifconfig
docker0: flags=4099<UP,BROADCAST,MULTICAST>  mtu 1500
        inet 172.17.0.1  netmask 255.255.0.0  broadcast 172.17.255.255
        ether 02:42:d8:73:72:ea  txqueuelen 0  (Ethernet)
        RX packets 0  bytes 0 (0.0 B)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 0  bytes 0 (0.0 B)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

```
* 配置容器端口
    * 大写 -P
        * docker run|create -P
            * 随机分配一个49000～49900内未分配的端口
    * 小写 -p
        * docker run|create -p  ip:hostPort:containerPort
        * docker run|create -p  ip::containerPort
            * 主机的随机端口和容器的端口进行映射
        * docker run|create -p  hostPort:containerPort
    * 查看容器端口映射情况
        * docker port name|id  5000  查看容器5000端口与主机端口映射情况
    * 查看容器所有信息，包括端口映射
        * docker inspect name|id 

* Docker设置固定IP
    * Docker安装后，默认会创建下面三种网络类型
        * docker network ls 查看
            * bridge：桥接网络
                * 默认情况下启动的Docker容器，都是使用 bridge，Docker安装时创建的桥接网络，每次Docker容器重启时，会按照顺序获取对应的IP地址，这个就导致重启下，Docker的IP地址就变了
            * none：无指定网络
                * 使用 --network=none ，docker 容器就不会分配局域网的IP
            * host： 主机网络
                * 使用 --network=host，此时，Docker 容器的网络会附属在主机上，两者是互通的。
    * 创建自定义网络：（设置固定IP）
        *  创建自定义网络，并且指定网段：172.18.0.0/16
        *  docker network create --subnet=172.18.0.0/16 mynetwork
    * 创建容器时指定IP
        * --net mynetwork 指定网络
        * --ip 172.18.0.5 指定ip
        * docker run --net mynetwork --ip 172.18.0.5 -p 7205:6379 --name redis7205 -d redis-cluster:5.0.3 redis-server /etc/redis/redis.conf
        * 查看 docker inspect redis7205 |grep IPAddress
        * docker inspect --format '{{.NetworkSettings.IPAddress}}' mysqlslaver



#### 1.6.6.2. 数据卷
* 数据卷作用
    * 是一个目录或者文件，绑定到容器的目录或者文件，两处内容同步更新   
    * 绕过"拷贝写"系统，以达到本地磁盘IO性能
    * 绕过"拷贝写"系统，有些文件不需要在docker commit 的时候打包进镜像中
    * 在多个容器之间共享目录
    * 在宿主和容器之间共享目录
    * 在宿主和容器之间共享单个文件
* 创建数据卷
    * 路径需要是绝对路径
    * dockerfile
        * volume /xxx/xxx
    * docker run -v 容器目录
    * docker inspect |grep volumns 查看
    * 挂载文件
        * -v 本地目录:容器目录 ，本地目录为绝对目录，可以是文件 
        * docker run -v /xx/xx.text:/xx/xx.text
    * 主机上的数据卷位置为/var/lib/docker/volumes
    * 共享数据卷
        * docker run --volumes-from=aaa   --name=bbb    xxxx
        * 容器bbb 将共享容器aaa的数据卷
        * 无论是声明数据卷的容器还是后续引用该数据卷的容器，容器的停止和删除都不会导致数据卷本身删除。如果需要将数据卷删除，那么需要删除所有它依赖的容器，并且在删除最后一个依赖的容器时加入-v标识。docker rm -v name|id

* 数据卷管理
    * docker volume ls  列出数据卷
    * docker volume rm volume_id  根据数据卷ID删除 
    * docker rm -v name|id  随人容器删除，数据卷没被其他容器使用才会被删除
```
docker volume  --help

Usage:	docker volume COMMAND

Manage volumes

Commands:
  create      Create a volume
  inspect     Display detailed information on one or more volumes
  ls          List volumes
  prune       Remove all unused local volumes
  rm          Remove one or more volumes

```


### 1.6.7. 案例
<a href="#menu" style="float:right">目录</a>

#### 1.6.7.1. docker 安装Mysqk主从复制
* https://www.cnblogs.com/songwenjie/p/9371422.html

#### 1.6.7.2. docker 安装mycat


* 安装openjdk:8镜像
    * docker pull  openjdk:8
* 下载mycat
    * http://www.mycat.io/
    * http://dl.mycat.io/1.6.7.1/
* 

## 1.7. VIM
<a href="#menu" style="float:right">目录</a>

* 安装
    * apt-get update && apt install vim

* 启动配置文件
    * /etc/vim/vimrc 全局配置文件
    * ~/vimrc

* 支持鼠标操作
    * 输入命令 set mouse=a


## 1.8. NMON监控工具

<a href="#menu" style="float:right">目录</a>

* 安装
    * sudo apt -install nmon
* 使用 
    * 执行命令: nmon
* 常用命令
```bash
 Use these keys to toggle statistics on/off:                                                                                                                                                             │
│     c = CPU        l = CPU Long-term   - = Faster screen updates                                                                                                                                         │
│     m = Memory     j = Filesystems     + = Slower screen updates                                                                                                                                         │
│     d = Disks      n = Network         V = Virtual Memory                                                                                                                                                │
│     r = Resource   N = NFS             v = Verbose hints                                                                                                                                                 │
│     k = kernel     t = Top-processes   . = only busy disks/procs                                                                                                                                         │
│     h = more options                   q = Quit  

```

## 1.9. 正则表达式
正则表达式(regular expression)描述了一种字符串匹配的模式（pattern），可以用来检查一个串是否含有某种子串、将匹配的子串替换或者从某个串中取出符合某个条件的子串等。

**非打印字符**
非打印字符也可以是正则表达式的组成部分。下表列出了表示非打印字符的转义序列：

**普通字符**
普通字符包括没有显式指定为元字符的所有可打印和不可打印字符。这包括所有大写和小写字母、所有数字、所有标点符号和一些其他符号。

|字符|	描述
|---|---|
|\cx|	匹配由x指明的控制字符。例如， \cM 匹配一个 Control-M 或回车符。x 的值必须为 A-Z 或 a-z 之一。否则，将 c 视为一个原义的 'c' 字符。
|\f	|匹配一个换页符。等价于 \x0c 和 \cL。
|\n	|匹配一个换行符。等价于 \x0a 和 \cJ。
|\r	|匹配一个回车符。等价于 \x0d 和 \cM。
|\s	|匹配任何空白字符，包括空格、制表符、换页符等等。等价于 [ \f\n\r\t\v]。注意 Unicode 正则表达式会匹配全角空格符。
|\S	|匹配任何非空白字符。等价于 [^ \f\n\r\t\v]。
|\t	|匹配一个制表符。等价于 \x09 和 \cI。
|\v	|匹配一个垂直制表符。等价于 \x0b 和 \cK。


**特殊字符**
所谓特殊字符，就是一些有特殊含义的字符，如上面说的 runoo*b 中的 *，简单的说就是表示任何字符串的意思。如果要查找字符串中的 * 符号，则需要对 * 进行转义，即在其前加一个 \: runo\*ob 匹配 runo*ob。

许多元字符要求在试图匹配它们时特别对待。若要匹配这些特殊字符，必须首先使字符"转义"，即，将反斜杠字符\ 放在它们前面。下表列出了正则表达式中的特殊字符：

|特别字符|	描述
|---|---|
|$|	匹配输入字符串的结尾位置。如果设置了 RegExp 对象的 Multiline 属性，则 \$ 也匹配 '\n' 或 '\r'。要匹配 $ 字符本身，请使用 \\$。
|( )|	标记一个子表达式的开始和结束位置。子表达式可以获取供以后使用。要匹配这些字符，请使用 \\( 和 \\)。
|*|	匹配前面的子表达式零次或多次。要匹配 * 字符，请使用 \\*。
|+|	匹配前面的子表达式一次或多次。要匹配 + 字符，请使用 \\+。
|.|	匹配除换行符 \n 之外的任何单字符。要匹配 . ，请使用 \\. 。
|[|	标记一个中括号表达式的开始。要匹配 [，请使用 \\[。
|?|	匹配前面的子表达式零次或一次，或指明一个非贪婪限定符。要匹配 ? 字符，请使用 \\?。
|\\|	将下一个字符标记为或特殊字符、或原义字符、或向后引用、或八进制转义符。例如\|'n'\| 匹配字符 'n'。'\n' 匹配换行符。序列 '\\\\' 匹配 "\\"，而 '\\(' 则匹配 "("。
|^|	匹配输入字符串的开始位置，除非在方括号表达式中使用，此时它表示不接受该字符集合。要匹配 ^ 字符本身，请使用 \\^。
|{|	标记限定符表达式的开始。要匹配 {，请使用 \\\{。
|\||	指明两项之间的一个选择。要匹配 \|，请使用 \\\|。

**限定符**
限定符用来指定正则表达式的一个给定组件必须要出现多少次才能满足匹配。有 * 或 + 或 ? 或 {n} 或 {n,} 或 {n,m} 共6种。

正则表达式的限定符有：

|字符|	描述
|---|---|
|*|	匹配前面的子表达式零次或多次。例如，zo* 能匹配 "z" 以及 "zoo"。* 等价于{0,}。
|+|	匹配前面的子表达式一次或多次。例如，'zo+' 能匹配 "zo" 以及 "zoo"，但不能匹配 "z"。+ 等价于 {1,}。
|?|	匹配前面的子表达式零次或一次。例如，"do(es)?" 可以匹配 "do" 、 "does" 中的 "does" 、 "doxy" 中的 "do" 。? 等价于 {0,1}。
|{n}|	n 是一个非负整数。匹配确定的 n 次。例如，'o{2}' 不能匹配 "Bob" 中的 'o'，但是能匹配 "food" 中的两个 o。
|{n,}|	n 是一个非负整数。至少匹配n 次。例如，'o{2,}' 不能匹配 "Bob" 中的 'o'，但能匹配 "foooood" 中的所有 o。'o{1,}' 等价于 'o+'。'o{0,}' 则等价于 'o*'。
|{n,m}|	m 和 n 均为非负整数，其中n <= m。最少匹配 n 次且最多匹配 m 次。例如，"o{1,3}" 将匹配 "fooooood" 中的前三个 o。'o{0,1}' 等价于 'o?'。请注意在逗号和两个数之间不能有空格。

**定位符**
定位符使您能够将正则表达式固定到行首或行尾。它们还使您能够创建这样的正则表达式，这些正则表达式出现在一个单词内、在一个单词的开头或者一个单词的结尾。

定位符用来描述字符串或单词的边界，^ 和 $ 分别指字符串的开始与结束，\b 描述单词的前或后边界，\B 表示非单词边界。

正则表达式的定位符有：

|字符|	描述|
|---|---|
|^|	匹配输入字符串开始的位置。如果设置了 RegExp 对象的 Multiline 属性，^ 还会与 \n 或 \r 之后的位置匹配。
|$|	匹配输入字符串结尾的位置。如果设置了 RegExp 对象的 Multiline 属性，$ 还会与 \n 或 \r 之前的位置匹配。
|\b|	匹配一个单词边界，即字与空格间的位置。
|\B|	非单词边界匹配。

* 注意：不能将限定符与定位符一起使用。由于在紧靠换行或者单词边界的前面或后面不能有一个以上位置，因此不允许诸如 ^* 之类的表达式。
* 若要匹配一行文本开始处的文本，请在正则表达式的开始使用 ^ 字符。不要将 ^ 的这种用法与中括号表达式内的用法混淆。
* 若要匹配一行文本的结束处的文本，请在正则表达式的结束处使用 $ 字符。

**速记理解技巧编辑**
.,[ ],^,$
四个字符是所有语言都支持的正则表达式，所以这四个是基础的正则表达式。正则难理解因为里面有一个等价的概念，这个概念大大增加了理解难度，让很多初学者看起来会懵，如果把等价都恢复成原始写法，自己书写正则就超级简单了，就像说话一样去写你的正则了：

**等价：**
等价是等同于的意思，表示同样的功能，用不同符号来书写。
?,*,+,\d,\w 都是等价字符
　　?等价于匹配长度{0,1}
　　*等价于匹配长度{0,} 
　　+等价于匹配长度{1,}
　　\d等价于[0-9]
\D等价于[^0-9]
　　\w等价于[A-Za-z_0-9]
\W等价于[^A-Za-z_0-9]。

**常用运算符与表达式：**
　　^ 开始
　　（） 域段
　　[] 包含,默认是一个字符长度
　　[^] 不包含,默认是一个字符长度
　　{n,m} 匹配长度 
　　. 任何单个字符(\. 字符点)
　　| 或
　　\ 转义
　　$ 结尾
　　[A-Z] 26个大写字母
　　[a-z] 26个小写字母
　　[0-9] 0至9数字
[A-Za-z0-9] 26个大写字母、26个小写字母和0至9数字
　　， 分割
　　.
　　
**分割语法：**
　　[A,H,T,W] 包含A或H或T或W字母
　　[a,h,t,w] 包含a或h或t或w字母
　　[0,3,6,8] 包含0或3或6或8数字

**语法与释义：**
　　基础语法 "^([]{})([]{})([]{})$"
　　正则字符串 = "开始（[包含内容]{长度}）（[包含内容]{长度}）（[包含内容]{长度}）结束" 
　　
　　?,*,+,\d,\w 这些都是简写的,完全可以用[]和{}代替，在(?:)(?=)(?!)(?<=)(?<!)(?i)(*?)(+?)这种特殊组合情况下除外。
　　初学者可以忽略?,*,+,\d,\w一些简写标示符，学会了基础使用再按表自己去等价替换



**实例**
```
1.验证用户名和密码：（"^[a-zA-Z]\w{5,15}$"）正确格式："[A-Z][a-z]_[0-9]"组成,并且第一个字必须为字母6~16位；
2.验证电话号码：（"^(\d{3,4}-)\d{7,8}$"）正确格式：xxx/xxxx-xxxxxxx/xxxxxxxx；
3.验证手机号码："^1[3|4|5|7|8][0-9]{9}$"；
4.验证身份证号（15位）："\d{14}[[0-9],0-9xX]"，（18位）："\d{17}(\d|X|x)"；
5.验证Email地址：("^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$")；
6.只能输入由数字和26个英文字母组成的字符串：("^[A-Za-z0-9]+$")；
7.整数或者小数：^[0-9]+([.][0-9]+){0,1}$
8.只能输入数字："^[0-9]*$"。
9.只能输入n位的数字："^\d{n}$"。
10.只能输入至少n位的数字："^\d{n,}$"。
11.只能输入m~n位的数字："^\d{m,n}$"。
12.只能输入零和非零开头的数字："^(0|[1-9][0-9]*)$"。
13.只能输入有两位小数的正实数："^[0-9]+(\.[0-9]{2})?$"。
14.只能输入有1~3位小数的正实数："^[0-9]+(\.[0-9]{1,3})?$"。
15.只能输入非零的正整数："^\+?[1-9][0-9]*$"。
16.只能输入非零的负整数："^\-[1-9][0-9]*$"。
17.只能输入长度为3的字符："^.{3}$"。
18.只能输入由26个英文字母组成的字符串："^[A-Za-z]+$"。
19.只能输入由26个大写英文字母组成的字符串："^[A-Z]+$"。
20.只能输入由26个小写英文字母组成的字符串："^[a-z]+$"。
21.验证是否含有^%&',;=?$\"等字符："[%&',;=?$\\^]+"。
22.只能输入汉字："^[\u4e00-\u9fa5]{0,}$"。
23.验证URL："^http://([\w-]+\.)+[\w-]+(/[\w-./?%&=]*)?$"。
24.验证一年的12个月："^(0?[1-9]|1[0-2])$"正确格式为："01"～"09"和"10"～"12"。
25.验证一个月的31天："^((0?[1-9])|((1|2)[0-9])|30|31)$"正确格式为；"01"～"09"、"10"～"29"和“30”~“31”。
26.获取日期正则表达式：\\d{4}[年|\-|\.]\d{\1-\12}[月|\-|\.]\d{\1-\31}日?
评注：可用来匹配大多数年月日信息。
27.匹配双字节字符(包括汉字在内)：[^\x00-\xff]
评注：可以用来计算字符串的长度（一个双字节字符长度计2，ASCII字符计1）
28.匹配空白行的正则表达式：\n\s*\r
评注：可以用来删除空白行
29.匹配HTML标记的正则表达式：<(\S*?)[^>]*>.*?</>|<.*? />
评注：网上流传的版本太糟糕，上面这个也仅仅能匹配部分，对于复杂的嵌套标记依旧无能为力
30.匹配首尾空白字符的正则表达式：^\s*|\s*$
评注：可以用来删除行首行尾的空白字符(包括空格、制表符、换页符等等)，非常有用的表达式
31.匹配网址URL的正则表达式：[a-zA-z]+://[^\s]*
评注：网上流传的版本功能很有限，上面这个基本可以满足需求
32.匹配帐号是否合法(字母开头，允许5-16字节，允许字母数字下划线)：^[a-zA-Z][a-zA-Z0-9_]{4,15}$
评注：表单验证时很实用
33.匹配腾讯QQ号：[1-9][0-9]{4,}
评注：腾讯QQ号从10 000 开始
34.匹配中国邮政编码：[1-9]\\d{5}(?!\d)
评注：中国邮政编码为6位数字
35.匹配ip地址：([1-9]{1,3}\.){3}[1-9]。
```

## 1.10. curl命令
<a href="#menu" style="float:right">目录</a>

curl 是一种命令行工具，作用是发出网络请求，然后获取数据，显示在"标准输出"（stdout）上面。它支持多种协议，下面列举其常用功能。

**查看网页源码**
直接在 curl 命令后加上网址，就可以看到网页源码。以网址 www.sina.com为例（选择该网址，主要因为它的网页代码较短）。
```
$ curl www.sina.com
<html>
<head><title>301 Moved Permanently</title></head>
<body bgcolor="white">
<center><h1>301 Moved Permanently</h1></center>
<hr><center>nginx</center>
</body>
</html>
```
如果要把这个网页保存下来，可以使用 -o 参数：

$ curl -o [文件名] www.sina.com
**自动跳转**
有的网址是自动跳转的。使用 -L 参数，curl 就会跳转到新的网址。
```
$ curl -L www.sina.com
```
键入上面的命令，结果自动跳转为 www.sina.com.cn。

**显示头信息**
-i 参数可以显示 http response 的头信息，连同网页代码一起。-I 参数则只显示 http response 的头信息。
```
$ curl -i www.sina.com
HTTP/1.1 301 Moved Permanently
Server: nginx
Date: Tue, 23 Aug 2016 08:30:16 GMT
Content-Type: text/html
Location: http://www.sina.com.cn/
Expires: Tue, 23 Aug 2016 08:32:16 GMT
Cache-Control: max-age=120
Age: 102
Content-Length: 178
X-Cache: HIT from xd33-83.sina.com.cn

<html>
<head><title>301 Moved Permanently</title></head>
<body bgcolor="white">
<center><h1>301 Moved Permanently</h1></center>
<hr><center>nginx</center>
</body>
</html>
```
**显示通信过程**
-v 参数可以显示一次 http 通信的整个过程，包括端口连接和 http request 头信息。

```html
$ curl -v www.sina.com
* Rebuilt URL to: www.sina.com/
* Hostname was NOT found in DNS cache
*   Trying 202.108.33.60...
* Connected to www.sina.com (202.108.33.60) port 80 (#0)
> GET / HTTP/1.1
> User-Agent: curl/7.35.0
> Host: www.sina.com
> Accept: */*
> 
< HTTP/1.1 301 Moved Permanently
* Server nginx is not blacklisted
< Server: nginx
< Date: Tue, 23 Aug 2016 08:48:14 GMT
< Content-Type: text/html
< Location: http://www.sina.com.cn/
< Expires: Tue, 23 Aug 2016 08:50:14 GMT
< Cache-Control: max-age=120
< Age: 40
< Content-Length: 178
< X-Cache: HIT from xd33-81.sina.com.cn
< 
<html>
<head><title>301 Moved Permanently</title></head>
    <body bgcolor="white">
        <center><h1>301 Moved Permanently</h1></center>
        <hr><center>nginx</center>
    </body>
</html>
```
* Connection #0 to host www.sina.com left intact
如果觉得上面的信息还不够，那么下面的命令可以查看更详细的通信过程。
```
$ curl --trace output.txt www.sina.com
```
或者
```
$ curl --trace-ascii output.txt www.sina.com
```
运行后，打开 output.txt 文件查看。

**发送表单信息**
发送表单信息有 GET 和 POST 两种方法。GET 方法相对简单，只要把数据附在网址后面就行。
```
$ curl example.com/form.cgi?data=xxx
```
POST 方法必须把数据和网址分开，curl 就要用到 --data 或者 -d 参数。

$ curl -X POST --data "data=xxx" example.com/form.cgi
如果你的数据没有经过表单编码，还可以让 curl 为你编码，参数是--data-urlencode。
```
$ curl -X POST--data-urlencode "date=April 1" example.com/form.cgi
```

**HTTP动词**
curl 默认的 HTTP 动词是 GET，使用 -X 参数可以支持其他动词。

```
$ curl -X POST www.example.com
$ curl -X DELETE www.example.com
```

**User Agent字段**
这个字段是用来表示客户端的设备信息。服务器有时会根据这个字段，针对不同设备，返回不同格式的网页，比如手机版和桌面版。
浏览器的 User Agent 是：

```
Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.84 Safari/537.36
```
curl 可以这样模拟：

```
$ curl --user-agent "[User Agent]" [URL]
```

**cookie**
使用 --cookie 参数，可以让 curl 发送 cookie。

```
$ curl --cookie "name=xxx" www.example.com
```

至于具体的 cookie 的值，可以从 http response 头信息的 Set-Cookie 字段中得到。

**增加头信息**
有时需要在 http request 之中，自行增加一个头信息。--header 参数就可以起到这个作用。

```
$ curl --header "Content-Type:application/json" http://example.com
```

**HTTP认证**
有些网域需要 HTTP 认证，这时 curl 需要用到 --user 或者 -u 参数。

```
$ curl --user name:password example.com
```

**附录 curl 命令完整的参数**
```bash
$ curl --help
Usage: curl [options...] <url>
Options: (H) means HTTP/HTTPS only, (F) means FTP only
     --anyauth       Pick "any" authentication method (H)
 -a, --append        Append to target file when uploading (F/SFTP)
     --basic         Use HTTP Basic Authentication (H)
     --cacert FILE   CA certificate to verify peer against (SSL)
     --capath DIR    CA directory to verify peer against (SSL)
 -E, --cert CERT[:PASSWD] Client certificate file and password (SSL)
     --cert-type TYPE Certificate file type (DER/PEM/ENG) (SSL)
     --ciphers LIST  SSL ciphers to use (SSL)
     --compressed    Request compressed response (using deflate or gzip)
 -K, --config FILE   Specify which config file to read
     --connect-timeout SECONDS  Maximum time allowed for connection
 -C, --continue-at OFFSET  Resumed transfer offset
 -b, --cookie STRING/FILE  String or file to read cookies from (H)
 -c, --cookie-jar FILE  Write cookies to this file after operation (H)
     --create-dirs   Create necessary local directory hierarchy
     --crlf          Convert LF to CRLF in upload
     --crlfile FILE  Get a CRL list in PEM format from the given file
 -d, --data DATA     HTTP POST data (H)
     --data-ascii DATA  HTTP POST ASCII data (H)
     --data-binary DATA  HTTP POST binary data (H)
     --data-urlencode DATA  HTTP POST data url encoded (H)
     --delegation STRING GSS-API delegation permission
     --digest        Use HTTP Digest Authentication (H)
     --disable-eprt  Inhibit using EPRT or LPRT (F)
     --disable-epsv  Inhibit using EPSV (F)
     --dns-servers    DNS server addrs to use: 1.1.1.1;2.2.2.2
     --dns-interface  Interface to use for DNS requests
     --dns-ipv4-addr  IPv4 address to use for DNS requests, dot notation
     --dns-ipv6-addr  IPv6 address to use for DNS requests, dot notation
 -D, --dump-header FILE  Write the headers to this file
     --egd-file FILE  EGD socket path for random data (SSL)
     --engine ENGINE  Crypto engine (SSL). "--engine list" for list
 -f, --fail          Fail silently (no output at all) on HTTP errors (H)
 -F, --form CONTENT  Specify HTTP multipart POST data (H)
     --form-string STRING  Specify HTTP multipart POST data (H)
     --ftp-account DATA  Account data string (F)
     --ftp-alternative-to-user COMMAND  String to replace "USER [name]" (F)
     --ftp-create-dirs  Create the remote dirs if not present (F)
     --ftp-method [MULTICWD/NOCWD/SINGLECWD] Control CWD usage (F)
     --ftp-pasv      Use PASV/EPSV instead of PORT (F)
 -P, --ftp-port ADR  Use PORT with given address instead of PASV (F)
     --ftp-skip-pasv-ip Skip the IP address for PASV (F)
     --ftp-pret      Send PRET before PASV (for drftpd) (F)
     --ftp-ssl-ccc   Send CCC after authenticating (F)
     --ftp-ssl-ccc-mode ACTIVE/PASSIVE  Set CCC mode (F)
     --ftp-ssl-control Require SSL/TLS for ftp login, clear for transfer (F)
 -G, --get           Send the -d data with a HTTP GET (H)
 -g, --globoff       Disable URL sequences and ranges using {} and []
 -H, --header LINE   Custom header to pass to server (H)
 -I, --head          Show document info only
 -h, --help          This help text
     --hostpubmd5 MD5  Hex encoded MD5 string of the host public key. (SSH)
 -0, --http1.0       Use HTTP 1.0 (H)
     --http1.1       Use HTTP 1.1 (H)
     --http2.0       Use HTTP 2.0 (H)
     --ignore-content-length  Ignore the HTTP Content-Length header
 -i, --include       Include protocol headers in the output (H/F)
 -k, --insecure      Allow connections to SSL sites without certs (H)
     --interface INTERFACE  Specify network interface/address to use
 -4, --ipv4          Resolve name to IPv4 address
 -6, --ipv6          Resolve name to IPv6 address
 -j, --junk-session-cookies Ignore session cookies read from file (H)
     --keepalive-time SECONDS  Interval between keepalive probes
     --key KEY       Private key file name (SSL/SSH)
     --key-type TYPE Private key file type (DER/PEM/ENG) (SSL)
     --krb LEVEL     Enable Kerberos with specified security level (F)
     --libcurl FILE  Dump libcurl equivalent code of this command line
     --limit-rate RATE  Limit transfer speed to this rate
 -l, --list-only     List only mode (F/POP3)
     --local-port RANGE  Force use of these local port numbers
 -L, --location      Follow redirects (H)
     --location-trusted like --location and send auth to other hosts (H)
 -M, --manual        Display the full manual
     --mail-from FROM  Mail from this address (SMTP)
     --mail-rcpt TO  Mail to this/these addresses (SMTP)
     --mail-auth AUTH  Originator address of the original email (SMTP)
     --max-filesize BYTES  Maximum file size to download (H/F)
     --max-redirs NUM  Maximum number of redirects allowed (H)
 -m, --max-time SECONDS  Maximum time allowed for the transfer
     --metalink      Process given URLs as metalink XML file
     --negotiate     Use HTTP Negotiate Authentication (H)
 -n, --netrc         Must read .netrc for user name and password
     --netrc-optional Use either .netrc or URL; overrides -n
     --netrc-file FILE  Set up the netrc filename to use
 -N, --no-buffer     Disable buffering of the output stream
     --no-keepalive  Disable keepalive use on the connection
     --no-sessionid  Disable SSL session-ID reusing (SSL)
     --noproxy       List of hosts which do not use proxy
     --ntlm          Use HTTP NTLM authentication (H)
     --oauth2-bearer TOKEN  OAuth 2 Bearer Token (IMAP, POP3, SMTP)
 -o, --output FILE   Write output to <file> instead of stdout
     --pass PASS     Pass phrase for the private key (SSL/SSH)
     --post301       Do not switch to GET after following a 301 redirect (H)
     --post302       Do not switch to GET after following a 302 redirect (H)
     --post303       Do not switch to GET after following a 303 redirect (H)
 -#, --progress-bar  Display transfer progress as a progress bar
     --proto PROTOCOLS  Enable/disable specified protocols
     --proto-redir PROTOCOLS  Enable/disable specified protocols on redirect
 -x, --proxy [PROTOCOL://]HOST[:PORT] Use proxy on given port
     --proxy-anyauth Pick "any" proxy authentication method (H)
     --proxy-basic   Use Basic authentication on the proxy (H)
     --proxy-digest  Use Digest authentication on the proxy (H)
     --proxy-negotiate Use Negotiate authentication on the proxy (H)
     --proxy-ntlm    Use NTLM authentication on the proxy (H)
 -U, --proxy-user USER[:PASSWORD]  Proxy user and password
     --proxy1.0 HOST[:PORT]  Use HTTP/1.0 proxy on given port
 -p, --proxytunnel   Operate through a HTTP proxy tunnel (using CONNECT)
     --pubkey KEY    Public key file name (SSH)
 -Q, --quote CMD     Send command(s) to server before transfer (F/SFTP)
     --random-file FILE  File for reading random data from (SSL)
 -r, --range RANGE   Retrieve only the bytes within a range
     --raw           Do HTTP "raw", without any transfer decoding (H)
 -e, --referer       Referer URL (H)
 -J, --remote-header-name Use the header-provided filename (H)
 -O, --remote-name   Write output to a file named as the remote file
     --remote-name-all Use the remote file name for all URLs
 -R, --remote-time   Set the remote file's time on the local output
 -X, --request COMMAND  Specify request command to use
     --resolve HOST:PORT:ADDRESS  Force resolve of HOST:PORT to ADDRESS
     --retry NUM   Retry request NUM times if transient problems occur
     --retry-delay SECONDS When retrying, wait this many seconds between each
     --retry-max-time SECONDS  Retry only within this period
     --sasl-ir       Enable initial response in SASL authentication
 -S, --show-error    Show error. With -s, make curl show errors when they occur
 -s, --silent        Silent mode. Don't output anything
     --socks4 HOST[:PORT]  SOCKS4 proxy on given host + port
     --socks4a HOST[:PORT]  SOCKS4a proxy on given host + port
     --socks5 HOST[:PORT]  SOCKS5 proxy on given host + port
     --socks5-hostname HOST[:PORT] SOCKS5 proxy, pass host name to proxy
     --socks5-gssapi-service NAME  SOCKS5 proxy service name for gssapi
     --socks5-gssapi-nec  Compatibility with NEC SOCKS5 server
 -Y, --speed-limit RATE  Stop transfers below speed-limit for 'speed-time' secs
 -y, --speed-time SECONDS  Time for trig speed-limit abort. Defaults to 30
     --ssl           Try SSL/TLS (FTP, IMAP, POP3, SMTP)
     --ssl-reqd      Require SSL/TLS (FTP, IMAP, POP3, SMTP)
 -2, --sslv2         Use SSLv2 (SSL)
 -3, --sslv3         Use SSLv3 (SSL)
     --ssl-allow-beast Allow security flaw to improve interop (SSL)
     --stderr FILE   Where to redirect stderr. - means stdout
     --tcp-nodelay   Use the TCP_NODELAY option
 -t, --telnet-option OPT=VAL  Set telnet option
     --tftp-blksize VALUE  Set TFTP BLKSIZE option (must be >512)
 -z, --time-cond TIME  Transfer based on a time condition
 -1, --tlsv1         Use TLSv1 (SSL)
     --trace FILE    Write a debug trace to the given file
     --trace-ascii FILE  Like --trace but without the hex output
     --trace-time    Add time stamps to trace/verbose output
     --tr-encoding   Request compressed transfer encoding (H)
 -T, --upload-file FILE  Transfer FILE to destination
     --url URL       URL to work with
 -B, --use-ascii     Use ASCII/text transfer
 -u, --user USER[:PASSWORD][;OPTIONS]  Server user, password and login options
     --tlsuser USER  TLS username
     --tlspassword STRING TLS password
     --tlsauthtype STRING  TLS authentication type (default SRP)
 -A, --user-agent STRING  User-Agent to send to server (H)
 -v, --verbose       Make the operation more talkative
 -V, --version       Show version number and quit
 -w, --write-out FORMAT  What to output after completion
     --xattr        Store metadata in extended file attributes
 -q                 If used as the first parameter disables .curlrc
```


## 1.11. 面试考察
<a href="#menu" style="float:right">目录</a>

### 1.11.1. 技术广度的考察
<a href="#menu" style="float:right">目录</a>

首先考察候选人技术面的完整性，因为工作中是需要具备一定的技术视野的，不能说光知道消息中间件，但是分布式缓存却一无所知。

类似于以前高考的时候，你语文特别好，结果物理特别差，那也是不太合适的。

所以工程师首先要避免自己的技术短板，尤其是三到五年经验的同学，已经彻底度过了自己人生的职场生涯的初期小白入门菜鸟阶段。

所以，务必在工作三到五年的时候，保证自己的技术绝对没有任何短板，整体技术栈要或多或少都知道一些，不能出现盲区。


比如，我现在问你，你们公司有没有什么业务场景是可以用NoSQL的?现在国内各个公司用NoSQL的技术都有哪些选型?具体NoSQL可以解决什么问题?

如果你一问三不知，这就是典型的技术短板，你至少需要大概知道，每个技术一般在什么情况下用，怎么来用，解决的是什么问题。

因此，上面说的消息中间件、分布式缓存、海量数据、分布式搜索、NoSQL、分布式架构、高并发、高可用、高性能这些技术。并不是说真的要求工作几年的同学都要精通到源码层面。

而是说你工作几年以后，应该有一定的技术广度，开阔的技术视野。

### 1.11.2. 底层技术的考察
<a href="#menu" style="float:right">目录</a>

现在很多互联网大厂都会有基本功的考察，举个例子，Java虚拟机的核心原理、内存模型、垃圾回收、线上FullGC卡顿性能优化、线上OOM内存溢出问题你处理。

Java并发中的volatile、锁优化、AQS源码;

Netty背后的IO、网络相关的知识。

其实这种底层技术，是线上高负载大型系统的架构设计和开发，必须要具备的。

因为底层技术不扎实，很多中间件或其他高阶的技术，都无法深入理解其原理。

而且很多时候，解决线上系统的生产故障，都需要这些技术。因此，底层技术的掌握是一个优秀工程师必须具备的素养。

### 1.11.3. 技术深度的考察
<a href="#menu" style="float:right">目录</a>

此外，我们一定会深入考察候选人平时工作中熟悉的以及常用的一些技术。

举个例子，比如你项目里用了Redis或者是Elasticsearch。

只要你用过了，而且是你某个项目里的核心技术，那么一定会用连环炮式的发问，深入各种细节、底层、生产环境可能遇到的技术挑战。

总之，就是要用压力测试出来你在这块技术水平掌握的到底有多深，实践经验有多强。

一个好的面试官，自己本身技术功底扎实，是可以对一个技术问出一连串的连环炮的，就比如上面的那个消息中间件的连环炮发问。

而且只要面试官在一个技术上的深度超过候选人，那么通过不断加深的发问，是可以考察出来一个候选人在自己最熟悉的技术领域的技术深度的。

举个例子，比如说你对一个技术的掌握是否达到了源码级别?

是否对某个框架，或者是中间件深入的理解底层的源码实现，从源码级别说清楚他的架构原理?

是否对这个技术有过线上的高可用部署，承载过高并发流量的访问?

是否对这个技术在线上生产环境解决过各种各样的复杂技术挑战?

是否基于这个技术落地到你的业务系统中，设计出各种复杂的系统架构?

通过这种连环炮，可以非常好的考察出某个候选人对技术深度的掌握。

技术深度的考察是中大型互联网公司面试官对一个高级/资深的候选人必须考察的。

因为如果一个人工作5年以上，来应聘高级职位的话，那我们绝对是要求他对至少一个技术领域有着较为深入的研究的。

比如说起码你得深入阅读过某个热门技术的核心源码，有一定的技术功底，可以解决一些复杂的线上故障。

技术广度决定了你可以利用各种技术来做项目，但是技术深度决定了你的技术功底。

你未来学新东西有多快，线上系统出了故障你能否快速定位和解决，你能否基于对技术的深刻理解为公司的项目设计和开发出复杂而且优秀的架构出来，这都取决于技术深度。

你只有真正了解了面试官的选拔标准，考察范围，才能更好的进行针对性的准备，成为行走的“offer收割机”

<span id="menu" >




# 2. 计算机&网络&操作系统
<a href="#menu" style="float:right">目录</a>

## 2.1. 计算机基础

<a href="#menu" style="float:right">目录</a>

### 2.1.1. 数据类型

#### 2.1.1.1. ASCII
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

## 2.2. 操作系统
### 2.2.1. 操作系统基本概念
##### 2.2.1.0.1. 操作系统发展过程

* 无操作系统的计算机
* 单道批处理系统
* 分时系统
* 实时系统
##### 2.2.1.0.2. 基本特性
#### 2.2.1.1. Linux进程和线程的区别
进程与线程的区别，早已经成为了经典问题。自线程概念诞生起，关于这个问题的讨论就没有停止过。无论是初级程序员，还是资深专家，都应该考虑过这个问题，只是层次角度不同罢了。一般程序员而言，搞清楚二者的概念，在工作实际中去运用成为了焦点。而资深工程师则在考虑系统层面如何实现两种技术及其各自的性能和实现代价。以至于到今天，Linux内核还在持续更新完善(关于进程和线程的实现模块也是内核完善的任务之一)。

本文将以一个从事Linux平台系统开发的程序员角度描述这个经典问题。本文素材全部来源于工作实践经验与知识规整，若有疏漏或不正之处，敬请读者慷慨指出。



0.首先，简要了解一下进程和线程。对于操作系统而言，进程是核心之核心，整个现代操作系统的根本，就是以进程为单位在执行任务。系统的管理架构也是基于进程层面的。在按下电源键之后，计算机就开始了复杂的启动过程，此处有一个经典问题：当按下电源键之后，计算机如何把自己由静止启动起来的？本文不讨论系统启动过程，请读者自行科普。操作系统启动的过程简直可以描述为上帝创造万物的过程，期初没有世界，但是有上帝，是上帝创造了世界，之后创造了万物，然后再创造了人，然后塑造了人的七情六欲，再然后人类社会开始遵循自然规律繁衍生息。。。操作系统启动进程的阶段就相当于上帝造人的阶段。本文讨论的全部内容都是“上帝造人”之后的事情。第一个被创造出来的进程是0号进程，这个进程在操作系统层面是不可见的，但它存在着。0号进程完成了操作系统的功能加载与初期设定，然后它创造了1号进程(init)，这个1号进程就是操作系统的“耶稣”。1号进程是上帝派来管理整个操作系统的，所以在用pstree查看进程树可知，1号进程位于树根。再之后，系统的很多管理程序都以进程身份被1号进程创造出来，还创造了与人类沟通的桥梁——shell。从那之后，人类可以跟操作系统进行交流，可以编写程序，可以执行任务。。。

而这一切，都是基于进程的。每一个任务(进程)被创建时，系统会为他分配存储空间等必要资源，然后在内核管理区为该进程创建管理节点，以便后来控制和调度该任务的执行。

进程真正进入执行阶段，还需要获得CPU的使用权，这一切都是操作系统掌管着，也就是所谓的调度，在各种条件满足(资源与CPU使用权均获得)的情况下，启动进程的执行过程。

除CPU而外，一个很重要的资源就是存储器了，系统会为每个进程分配独有的存储空间，当然包括它特别需要的别的资源，比如写入时外部设备是可使用状态等等。有了上面的引入，我们可以对进程做一个简要的总结：

进程，是计算机中的程序关于某数据集合上的一次运行活动，是系统进行资源分配和调度的基本单位，是操作系统结构的基础。它的执行需要系统分配资源创建实体之后，才能进行。

随着技术发展，在执行一些细小任务时，本身无需分配单独资源时(多个任务共享同一组资源即可，比如所有子进程共享父进程的资源)，进程的实现机制依然会繁琐的将资源分割，这样造成浪费，而且还消耗时间。后来就有了专门的多任务技术被创造出来——线程。

线程的特点就是在不需要独立资源的情况下就可以运行。如此一来会极大节省资源开销，以及处理时间。

 

1.好了，前面的一段文字是简要引入两个名词，即进程和线程。本文讨论目标是解释清楚进程和线程的区别，关于二者的技术实现，请读者查阅相关资料。

下面我们开始重点讨论本文核心了。从下面几个方面阐述进程和线程的区别。

1).二者的相同点

2).实现方式的差异

3).多任务程序设计模式的区别

4).实体间(进程间，线程间，进线程间)通信方式的不同

5).控制方式的异同

6).资源管理方式的异同

7).个体间辈分关系的迥异

8).进程池与线程池的技术实现差别

 

接下来我们就逐个进行解释。

1).二者的相同点

无论是进程还是线程，对于程序员而言，都是用来实现多任务并发的技术手段。二者都可以独立调度，因此在多任务环境下，功能上并无差异。并且二者都具有各自的实体，是系统独立管理的对象个体。所以在系统层面，都可以通过技术手段实现二者的控制。而且二者所具有的状态都非常相似。而且，在多任务程序中，子进程(子线程)的调度一般与父进程(父线程)平等竞争。

其实在Linux内核2.4版以前，线程的实现和管理方式就是完全按照进程方式实现的。在2.6版内核以后才有了单独的线程实现。

 

 

2).实现方式的差异

进程是资源分配的基本单位，线程是调度的基本单位。

这句经典名言已流传数十年，各种操作系统教材都可见此描述。确实如此，这就是二者的显著区别。读者请注意“基本”二字。相信有读者看到前半句的时候就在心里思考，“进程岂不是不能调度？”，非也！进程和线程都可以被调度，否则多进程程序该如何运行呢！

只是，线程是更小的可以调度的单位，也就是说，只要达到线程的水平就可以被调度了，进程自然可以被调度。它强调的是分配资源时的对象必须是进程，不会给一个线程单独分配系统管理的资源。若要运行一个任务，想要获得资源，最起码得有进程，其他子任务可以以线程身份运行，资源共享就行了。

    简而言之，进程的个体间是完全独立的，而线程间是彼此依存的。多进程环境中，任何一个进程的终止，不会影响到其他进程。而多线程环境中，父线程终止，全部子线程被迫终止(没有了资源)。而任何一个子线程终止一般不会影响其他线程，除非子线程执行了exit()系统调用。任何一个子线程执行exit()，全部线程同时灭亡。

其实，也没有人写出只有线程而没有进程的程序。多线程程序中至少有一个主线程，而这个主线程其实就是有main函数的进程。它是整个程序的进程，所有线程都是它的子线程。我们通常把具有多线程的主进程称之为主线程。

从系统实现角度讲，进程的实现是调用fork系统调用：

pid_t fork(void);

线程的实现是调用clone系统调用：

int clone(int (*fn)(void *), void *child_stack, int flags, void *arg, ...

/* pid_t *ptid, struct user_desc *tls, pid_t *ctid */

);

其中，fork()是将父进程的全部资源复制给了子进程。而线程的clone只是复制了一小部分必要的资源。在调用clone时可以通过参数控制要复制的对象。可以说，fork实现的是clone的加强完整版。当然，后来操作系统还进一步优化fork实现——写时复制技术。在子进程需要复制资源(比如子进程执行写入动作更改父进程内存空间)时才复制，否则创建子进程时先不复制。

实际中，编写多进程程序时采用fork创建子进程实体。而创建线程时并不采用clone系统调用，而是采用线程库函数。常用线程库有Linux-Native线程库和POSIX线程库。其中应用最为广泛的是POSIX线程库。因此读者在多线程程序中看到的是pthread_create而非clone。

我们知道，库是建立在操作系统层面上的功能集合，因而它的功能都是操作系统提供的。由此可知，线程库的内部很可能实现了clone的调用。不管是进程还是线程的实体，都是操作系统上运行的实体。

    最后，我们说一下vfork() 。这也是一个系统调用，用来创建一个新的进程。它创建的进程并不复制父进程的资源空间，而是共享，也就说实际上vfork实现的是一个接近线程的实体，只是以进程方式来管理它。并且，vfork()的子进程与父进程的运行时间是确定的：子进程“结束”后父进程才运行。请读者注意“结束”二字。并非子进程完成退出之意，而是子进程返回时。一般采用vfork()的子进程，都会紧接着执行execv启动一个全新的进程，该进程的进程空间与父进程完全独立不相干，所以不需要复制父进程资源空间。此时，execv返回时父进程就认为子进程“结束”了，自己开始运行。实际上子进程继续在一个完全独立的空间运行着。举个例子，比如在一个聊天程序中，弹出了一个视频播放器。你说视频播放器要继承你的聊天程序的进程空间的资源干嘛？莫非视频播放器想要窥探你的聊天隐私不成？懂了吧！

 

3).多任务程序设计模式的区别

由于进程间是独立的，所以在设计多进程程序时，需要做到资源独立管理时就有了天然优势，而线程就显得麻烦多了。比如多任务的TCP程序的服务端，父进程执行accept()一个客户端连接请求之后会返回一个新建立的连接的描述符DES，此时如果fork()一个子进程，将DES带入到子进程空间去处理该连接的请求，父进程继续accept等待别的客户端连接请求，这样设计非常简练，而且父进程可以用同一变量(val)保存accept()的返回值，因为子进程会复制val到自己空间，父进程再覆盖此前的值不影响子进程工作。但是如果换成多线程，父线程就不能复用一个变量val多次执行accept()了。因为子线程没有复制val的存储空间，而是使用父线程的，如果子线程在读取val时父线程接受了另一个客户端请求覆盖了该值，则子线程无法继续处理上一次的连接任务了。改进的办法是子线程立马复制val的值在自己的栈区，但父线程必须保证子线程复制动作完成之后再执行新的accept()。但这执行起来并不简单，因为子线程与父线程的调度是独立的，父线程无法知道子线程何时复制完毕。这又得发生线程间通信，子线程复制完成后主动通知父线程。这样一来父线程的处理动作必然不能连贯，比起多进程环境，父线程显得效率有所下降。

PS：这里引述一个知名的面试问题：多进程的TCP服务端，能否互换fork()与accept()的位置？请读者自行思考。

关于资源不独立，看似是个缺点，但在有的情况下就成了优点。多进程环境间完全独立，要实现通信的话就得采用进程间的通信方式，它们通常都是耗时间的。而线程则不用任何手段数据就是共享的。当然多个子线程在同时执行写入操作时需要实现互斥，否则数据就写“脏”了。

 

4).实体间(进程间，线程间，进线程间)通信方式的不同

进程间的通信方式有这样几种：

A.共享内存    B.消息队列    C.信号量    D.有名管道    E.无名管道    F.信号

G.文件        H.socket

线程间的通信方式上述进程间的方式都可沿用，且还有自己独特的几种：

A.互斥量      B.自旋锁      C.条件变量  D.读写锁      E.线程信号

G.全局变量

值得注意的是，线程间通信用的信号不能采用进程间的信号，因为信号是基于进程为单位的，而线程是共属于同一进程空间的。故而要采用线程信号。

综上，进程间通信手段有8种。线程间通信手段有13种。

而且，进程间采用的通信方式要么需要切换内核上下文，要么要与外设访问(有名管道，文件)。所以速度会比较慢。而线程采用自己特有的通信方式的话，基本都在自己的进程空间内完成，不存在切换，所以通信速度会较快。也就是说，进程间与线程间分别采用的通信方式，除了种类的区别外，还有速度上的区别。

另外，进程与线程之间穿插通信的方式，除信号以外其他进程间通信方式都可采用。
    线程有内核态线程与用户级线程，相关知识请参看我的另一篇博文《Linux线程的实质》。

 

5).控制方式的异同

进程与线程的身份标示ID管理方式不一样，进程的ID为pid_t类型，实际为一个int型的变量(也就是说是有限的)：

/usr/include/unistd.h:260:typedef __pid_t   pid_t;

/usr/include/bits/types.h:126:# define __STD_TYPE    typedef

/usr/include/bits/types.h:142:__STD_TYPE  __PID_T_TYPE   __pid_t;

/usr/include/bits/typesizes.h:53:#define __PID_T_TYPE   __S32_TYPE

/usr/include/bits/types.h:100:#define   __S32_TYPE      int

在全系统中，进程ID是唯一标识，对于进程的管理都是通过PID来实现的。每创建一个进程，内核去中就会创建一个结构体来存储该进程的全部信息：

注：下述代码来自 Linux内核3.18.1

 

include/linux/sched.h:1235:struct task_struct {

        volatile long state;    /* -1 unrunnable, 0 runnable, >0 stopped */

        void *stack;

...

        pid_t pid;

        pid_t tgid;

...

};

每一个存储进程信息的节点也都保存着自己的PID。需要管理该进程时就通过这个ID来实现(比如发送信号)。当子进程结束要回收时(子进程调用exit()退出或代码执行完)，需要通过wait()系统调用来进行，未回收的消亡进程会成为僵尸进程，其进程实体已经不复存在，但会虚占PID资源，因此回收是有必要的。

线程的ID是一个long型变量：

/usr/include/bits/pthreadtypes.h:60:typedef unsigned long int pthread_t;

它的范围大得多，管理方式也不一样。线程ID一般在本进程空间内作用就可以了，当然系统在管理线程时也需要记录其信息。其方式是，在内核创建一个内核态线程与之对应，也就是说每一个用户创建的线程都有一个内核态线程对应。但这种对应关系不是一对一，而是多对一的关系，也就是一个内核态线程可以对应着多个用户级线程。还是请读者参看《Linux线程的实质》普及相关概念。此处贴出blog地址：

http://my.oschina.net/cnyinlinux/blog/367910

对于线程而言，若要主动终止需要调用pthread_exit() ，主线程需要调用pthread_join()来回收(前提是该线程没有被detached，相关概念请查阅线程的“分离属性”)。像线发送线程信号也是通过线程ID实现的。

 

6).资源管理方式的异同

进程本身是资源分配的基本单位，因而它的资源都是独立的，如果有多进程间的共享资源，就要用到进程间的通信方式了，比如共享内存。共享数据就放在共享内存去，大家都可以访问，为保证数据写入的安全，加上信号量一同使用。一般而言，共享内存都是和信号量一起使用。消息队列则不同，由于消息的收发是原子操作，因而自动实现了互斥，单独使用就是安全的。

线程间要使用共享资源不需要用共享内存，直接使用全局变量即可，或者malloc()动态申请内存。显得方便直接。而且互斥使用的是同一进程空间内的互斥量，所以效率上也有优势。

实际中，为了使程序内资源充分规整，也都采用共享内存来存储核心数据。不管进程还是线程，都采用这种方式。原因之一就是，共享内存是脱离进程的资源，如果进程发生意外终止的话，共享内存可以独立存在不会被回收(是否回收由用户编程实现)。进程的空间在进程崩溃的那一刻也被系统回收了。虽然有coredump机制，但也只能是有限的弥补。共享内存在进程down之后还完整保存，这样可以拿来分析程序的故障原因。同时，运行的宝贵数据没有丢失，程序重启之后还能继续处理之前未完成的任务，这也是采用共享内存的又一大好处。

总结之，进程间的通信方式都是脱离于进程本身存在的，是全系统都可见的。这样一来，进程的单点故障并不会损毁数据，当然这不一定全是优点。比如，进程崩溃前对信号量加锁，崩溃后重启，然后再次进入运行状态，此时直接进行加锁，可能造成死锁，程序再也无法继续运转。再比如，共享内存是全系统可见的，如果你的进程资源被他人误读误写，后果肯定也是你不想要的。所以，各有利弊，关键在于程序设计时如何考量，技术上如何规避。这说起来又是编程技巧和经验的事情了。

 

7).个体间辈分关系的迥异

进程的备份关系森严，在父进程没有结束前，所有的子进程都尊从父子关系，也就是说A创建了B，则A与B是父子关系，B又创建了C，则B与C也是父子关系，A与C构成爷孙关系，也就是说C是A的孙子进程。在系统上使用pstree命令打印进程树，可以清晰看到备份关系。

多线程间的关系没有那么严格，不管是父线程还是子线程创建了新的线程，都是共享父线程的资源，所以，都可以说是父线程的子线程，也就是只存在一个父线程，其余线程都是父线程的子线程。

 

8).进程池与线程池的技术实现差别

我们都知道，进程和线程的创建时需要时间的，并且系统所能承受的进程和线程数也是有上限的，这样一来，如果业务在运行中需要动态创建子进程或线程时，系统无法承受不能立即创建的话，必然影响业务。综上，聪明的程序员发明了一种新方法——池。

在程序启动时，就预先创建一些子进程或线程，这样在需要用时直接使唤。这就是老人口中的“多生孩子多种树”。程序才开始运行，没有那么多的服务请求，必然大量的进程或线程空闲，这时候一般让他们“冬眠”，这样不耗资源，要不然一大堆孩子的口食也是个负担啊。对于进程和线程而言，方式是不一样的。另外，当你有了任务，要分配给那些孩子的时候，手段也不一样。下面就分别来解说。
**进程池**
首先创建了一批进程，就得管理，也就是你得分开保存进程ID，可以用数组，也可用链表。建议用数组，这样可以实现常数内找到某个线程，而且既然做了进程池，就预先估计好了生产多少进程合适，一般也不会再动态延展。就算要动态延展，也能预估范围，提前做一个足够大的数组。不为别的，就是为了快速响应。本来错进程池的目的也是为了效率。

接下来就要让闲置进程冬眠了，可以让他们pause()挂起，也可用信号量挂起，还可以用IPC阻塞，方法很多，分析各自优缺点根据实际情况采用就是了。

然后是分配任务了，当你有任务的时候就要让他干活了。唤醒了进程，让它从哪儿开始干呢？肯定得用到进程间通信了，比如信号唤醒它，然后让它在预先指定的地方去读取任务，可以用函数指针来实现，要让它干什么，就在约定的地方设置代码段指针。这也只是告诉了它怎么干，还没说干什么(数据条件)，再通过共享内存把要处理的数据设置好，这也子进程就知道怎么做了。干完之后再来一次进程间通信然后自己继续冬眠，父进程就知道孩子干完了，收割成果。

最后结束时回收子进程，向各进程发送信号唤醒，改变激活状态让其主动结束，然后逐个wait()就可以了。

**线程池**
线程池的思想与上述类似，只是它更为轻量级，所以调度起来不用等待额外的资源。
要让线程阻塞，用条件变量就是了，需要干活的时候父线程改变条件，子线程就被激活。
线程间通信方式就不用赘述了，不用繁琐的通信就能达成，比起进程间效率要高一些。
线程干完之后自己再改变条件，这样父线程也就知道该收割成果了。
整个程序结束时，逐个改变条件并改变激活状态让子线程结束，最后逐个回收即可。


## 2.3. 网络TCP
<a href="#menu" style="float:right">目录</a>

### 2.3.1. OSI网路分层



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
### 2.3.2. IP(Internet Protocol,网际协议)
#### 2.3.2.1. 基本概念
IP协议负责将数据包发送给最终的目标主机。
通信链路层是负责两个直连两个设备之间的通信，而IP是负责两个没有直连设备之间的通信。每个计算机都有自己的IP地址，发送端在发送数据之前要先确定接收者是属于哪台计算机。也就是ARP地址解析协议，通过广播发送请求，有回应的是便是目标主机，然后获取目标主机的网卡地址，缓在发送端，下次发送的时候，就可以从缓存中获取到目标主机的网卡地址。

* IP协议是面向无连接的，通信可靠性由上层解决
    * 一是为了简化
    * 二是为了快速
#### 2.3.2.2. IP地址定义

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

#### 2.3.2.3. IP协议相关技术
##### 2.3.2.3.1. DNS
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

##### 2.3.2.3.2. ARP
DNS是通过访问名称获取到IP地址，但是有进行访问还需要获取到这个IP地址对应的MAC地址。

* 查找流程:
    * 主机A访问主机B
    * 主机A广播发送一个ARP请求包，这个包包括主机B的IP地址
    * 这个广播包将会被链路上所有的计算机接收并解析
    * 如果请求包中的IP地址和自己的IP地址一致，那么这个节点将会把自己的MAC地址塞入ARP响应包并返回给主机A
    * 主机A获取到主机B的MAC地址，就可以和主机B进行通信了。
    * 主机A会将主机B的MAC地址进行缓存到本地，以供下次使用
    * 这个缓存会按照一定机制被清除，也就是有过期时间。同时若请求失败，也会重新发起获取MAC地址请求。

### 2.3.3. 传输层
<a href="#menu" style="float:right">目录</a>

#### 2.3.3.1. 基本概念

##### 2.3.3.1.1. TCP和UDP差别

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

##### 2.3.3.1.2. 端口
数据链路中的MAC地址: 识别同一链路中的不同计算机
IP中的IP地址:识别TCP/IP网络中互联的主机和路由器
端口号:用于识别同一台计算机中不同的应用程序


端口号的范围万为0-65535之间
（1）公认端口（WellKnownPorts）：从0到1023，它们紧密绑定（binding）于一些服务。通常这些端口的通讯明确表明了某种服务的协议。例如：80端口实际上总是HTTP通讯。
（2）注册端口（RegisteredPorts）：从1024到49151。它们松散地绑定于一些服务。也就是说有许多服务绑定于这些端口，这些端口同样用于许多其它目的。例如：许多系统处理动态端口从1024左右开始。
（3）动态和/或私有端口（Dynamicand/orPrivatePorts）：从49152到65535。理论上，不应为服务分配这些端口。实际上，机器通常从1024起分配动态端口。但也有例外：SUN的RPC端口从32768开始

#### 2.3.3.2. UDP
#### 2.3.3.3. TCP
TCP通信中的四元组:源IP，源端口，目标IP，目标端口

##### 2.3.3.3.1. 连接管理
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


##### 2.3.3.3.2. 超时重传机制
##### 2.3.3.3.3. 数据流和窗口机制
##### 2.3.3.3.4. 阻塞控制 


## 2.4. 网络HTTP
<a href="#menu" style="float:right">目录</a>

### 2.4.1. 基本概念
#### 2.4.1.1. 访问一个网站的流程
* 输入网址
* DNS域名解析服务解析域名，获取域名对应的服务器IP
* ARP地址解析协议根据IP查找服务端的MAC地址
* TCP 3次连接流程，客户端和服务端建立连接
* 连接建立之后，客户端发送请求
* 服务端收到请求之后，进行业务处理，根据请求返回客户端的数据。
* 客户端收到服务端响应，渲染页面
* 如果是短连接，客户端将发送关闭连接请求。也就是四次挥手。
#### 2.4.1.2. 媒体类型(MIME)
* 因特网上有数千种不同的数据类型，http会给每种要通过web传输的对象都打上一个名为MIME类型（MIME type）的数据格式标签
* web服务器会为所有http对象数据附加一个MIME类型。
* 当web浏览器从服务器中取回一个对象时，会去查看相关的MIME类型，看看他们是否知道如何处理这个对象。
* 大多数浏览器都可以处理数百种常见的对象类型：显示图片文件、解析并格式化html文件等等。
* MIME类型是一种文本标记，表示一种主要的对象类型和一个特定的子类型，中间由一个斜杠来分割。

### 2.4.2. URL和资源
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


### 2.4.3. HTTP报文
<a href="#menu" style="float:right">目录</a>

#### 2.4.3.1. 请求报文和响应报文

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

#### 2.4.3.2. 首部
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
#### 2.4.3.3. 方法

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

#### 2.4.3.4. 状态码

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

### 2.4.4. 连接管理
<a href="#menu" style="float:right">目录</a>
HTTP要传送一条报文时，会以流的形式将报文数据的内容通过一条打开的TCP连接按序传输，TCP收到数据流之后，会将数据流砍成被称作段的小数据块。并将段封装在IP分组中，通过因特网进行传输。

#### 2.4.4.1. 对TCP性能的考虑
HTTP是TCP的上层，主要通信实现由TCP/IP层实现，因此影响性能的主要也是这两层。
影响性能主要以下几点
* 首次访问时的DNS域名解析，可能花费数十秒，后续访问会进行缓存。
* TCP连接建立过程
#### 2.4.4.2. 持久连接

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
   
### 2.4.5. WEB服务器
<a href="#menu" style="float:right">目录</a>

### 2.4.6. 代理
<a href="#menu" style="float:right">目录</a>

### 2.4.7. 缓存
<a href="#menu" style="float:right">目录</a>

### 2.4.8. 网关 
<a href="#menu" style="float:right">目录</a>

### 2.4.9. 客户端识别与Cookie机制
<a href="#menu" style="float:right">目录</a>

### 2.4.10. 基本认证机制
<a href="#menu" style="float:right">目录</a>

### 2.4.11. 摘要认证
<a href="#menu" style="float:right">目录</a>

### 2.4.12. 安全HTTP
<a href="#menu" style="float:right">目录</a>

### 2.4.13. 实体和编码
<a href="#menu" style="float:right">目录</a>

### 2.4.14. 国际化
<a href="#menu" style="float:right">目录</a>

### 2.4.15. WEB主机托管
<a href="#menu" style="float:right">目录</a>

### 2.4.16. 重定向和负载均衡
<a href="#menu" style="float:right">目录</a>


## 2.5. Unix环境编程
<a href="#menu" style="float:right">目录</a>

### 2.5.1. 基本概念
<a href="#menu" style="float:right">目录</a>

* **内核**
管理和分配计算机资源(CPU,内存等)的核心层软件

* **内核任务**
    * 进程调度，Linux是抢占式多任务操作系统，内核需要协调好多个任务的执行。`
    * 内存管理
    * 提供文件系统
    * 创建和终止进程
    * 对设备的访问
    * 联网
    * 提供系统应用调用API接口

* **内核态和用户态**
    * 可将虚拟内存区域划分为用户空间和内核空间两部分
    * 在用户态下只能访问用户空间，试图访问内核空间将会报硬件错误
    * 在内核态下两者都可以访问到

* **文件描述符**
    * Linux下一切皆是文件，每打开一个文件或者Socket,都会获得一个文件描述符(整型)来唯一标识。

* **进程**
    * 进程是正在执行的程序实例，执行程序时，内核会将程序代码载入虚拟内存，为程序变量分配空间，建立内核记账数据结构，以记录与进程有关的各种信息（比如，进程ID，用户ID，组ID以及终止状态）
    * 进程内存布局
        * 文本: 程序的指令
        * 数据: 程序使用的静态变量
        * 堆:程序可从该区域动态分配额外的内存
        * 栈:随函数调用，返回而增减的一片内存，用于为局部变量和函数调用链接信息分配存储空间
    * 创建进程和执行程序
        * fork进行创建
        * 内核通过对父进程的复制来创建子进程
        * 子进程从父进程处继承数据段、栈段、以及堆段的副本，即使修改也不会互相影响，两者之间的内存空间是独立的
    * 进程IP
        * 每一个进程都有一个唯一标识符PID，如果有父进程，还有一个父进程PPID

### 2.5.2. IO模型
<a href="#menu" style="float:right">目录</a>

**概念理解**
 在进行网络编程时，我们常常见到同步(Sync)/异步(Async)，阻塞(Block)/非阻塞(Unblock)四种调用方式：
 * 同步
    * 所谓同步，就是在发出一个功能调用时，在没有得到结果之前，该调用就不返回。也就是必须一件一件事做,等前一件做完了才能做下一件事。
    * 例如普通B/S模式（同步）：提交请求->等待服务器处理->处理完毕返回 这个期间客户端浏览器不能干任何事
* 异步：
    * 异步的概念和同步相对。当一个异步过程调用发出后，调用者不能立刻得到结果。实际处理这个调用的部件在完成后，通过状态、通知和回调来通知调用者。
    * 例如 ajax请求（异步）: 请求通过事件触发->服务器处理（这是浏览器仍然可以作其他事情）->处理完毕
* 阻塞
    * 阻塞调用是指调用结果返回之前，当前线程会被挂起（线程进入非可执行状态，在这个状态下，cpu不会给线程分配时间片，即线程暂停运行）。函数只有在得到结果之后才会返回。
    * 有人也许会把阻塞调用和同步调用等同起来，实际上他是不同的。对于同步调用来说，很多时候当前线程还是激活的，只是从逻辑上当前函数没有返回而已。 例如，我们在socket中调用recv函数，如果缓冲区中没有数据，这个函数就会一直等待，直到有数据才返回。而此时，当前线程还会继续处理各种各样的消息。

* 非阻塞
    * 非阻塞和阻塞的概念相对应，指在不能立刻得到结果之前，该函数不会阻塞当前线程，而会立刻返回。

**对象的阻塞模式和阻塞函数调用**
对象是否处于阻塞模式和函数是不是阻塞调用有很强的相关性，但是并不是一一对应的。阻塞对象上可以有非阻塞的调用方式，我们可以通过一定的API去轮询状 态，在适当的时候调用阻塞函数，就可以避免阻塞。而对于非阻塞对象，调用特殊的函数也可以进入阻塞调用。函数select就是这样的一个例子。

* 同步，就是我调用一个功能，该功能没有结束前，我死等结果。
* 异步，就是我调用一个功能，不需要知道该功能结果，该功能有结果后通知我（回调通知）
* 阻塞，就是调用我（函数），我（函数）没有接收完数据或者没有得到结果之前，我不会返回。
* 非阻塞，就是调用我（函数），我（函数）立即返回，通过select通知调用者

 

同步IO和异步IO的区别就在于：数据拷贝的时候进程是否阻塞！
阻塞IO和非阻塞IO的区别就在于：应用程序的调用是否立即返回！


对于举个简单c/s 模式：

 

同步：提交请求->等待服务器处理->处理完毕返回这个期间客户端浏览器不能干任何事
异步：请求通过事件触发->服务器处理（这是浏览器仍然可以作其他事情）->处理完毕
同步和异步都只针对于本机SOCKET而言的。
同步和异步,阻塞和非阻塞,有些混用,其实它们完全不是一回事,而且它们修饰的对象也不相同。
阻塞和非阻塞是指当进程访问的数据如果尚未就绪,进程是否需要等待,简单说这相当于函数内部的实现区别,也就是未就绪时是直接返回还是等待就绪;

而同步和异步是指访问数据的机制,同步一般指主动请求并等待I/O操作完毕的方式,当数据就绪后在读写的时候必须阻塞(区别就绪与读写二个阶段,同步的读写必须阻塞),异步则指主动请求数据后便可以继续处理其它任务,随后等待I/O,操作完毕的通知,这可以使进程在数据读写时也不阻塞。(等待"通知")

**Linux下的五种I/O模型**
* 阻塞I/O（blocking I/O）
* 非阻塞I/O （nonblocking I/O）
* I/O复用(select 和poll) （I/O multiplexing）
* 信号驱动I/O （signal driven I/O (SIGIO)）
* 异步I/O （asynchronous I/O (the POSIX aio_functions)）
前四种都是同步，只有最后一种才是异步IO。


**阻塞I/O模型：**
![](https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3808372216,1260325684&fm=26&gp=0.jpg)
* 简介：进程会一直阻塞，直到数据拷贝完成

应用程序调用一个IO函数，导致应用程序阻塞，等待数据准备好。 如果数据没有准备好，一直等待….数据准备好了，从内核拷贝到用户空间,IO函数返回成功指示。

阻塞I/O模型图：在调用recv()/recvfrom（）函数时，发生在内核中等待数据和复制数据的过程。

当调用recv()函数时，系统首先查是否有准备好的数据。如果数据没有准备好，那么系统就处于等待状态。当数据准备好后，将数据从系统缓冲区复制到用户空间，然后该函数返回。在套接应用程序中，当调用recv()函数时，未必用户空间就已经存在数据，那么此时recv()函数就会处于等待状态。

当使用socket()函数和WSASocket()函数创建套接字时，默认的套接字都是阻塞的。这意味着当调用Windows Sockets API不能立即完成时，线程处于等待状态，直到操作完成。

并不是所有Windows Sockets API以阻塞套接字为参数调用都会发生阻塞。例如，以阻塞模式的套接字为参数调用bind()、listen()函数时，函数会立即返回。将可能阻塞套接字的Windows Sockets API调用分为以下四种:

1．输入操作： recv()、recvfrom()、WSARecv()和WSARecvfrom()函数。以阻塞套接字为参数调用该函数接收数据。如果此时套接字缓冲区内没有数据可读，则调用线程在数据到来前一直睡眠。

2．输出操作： send()、sendto()、WSASend()和WSASendto()函数。以阻塞套接字为参数调用该函数发送数据。如果套接字缓冲区没有可用空间，线程会一直睡眠，直到有空间。

3．接受连接：accept()和WSAAcept()函数。以阻塞套接字为参数调用该函数，等待接受对方的连接请求。如果此时没有连接请求，线程就会进入睡眠状态。

4．外出连接：connect()和WSAConnect()函数。对于TCP连接，客户端以阻塞套接字为参数，调用该函数向服务器发起连接。该函数在收到服务器的应答前，不会返回。这意味着TCP连接总会等待至少到服务器的一次往返时间。

　　使用阻塞模式的套接字，开发网络程序比较简单，容易实现。当希望能够立即发送和接收数据，且处理的套接字数量比较少的情况下，使用阻塞模式来开发网络程序比较合适。

阻塞模式套接字的不足表现为，在大量建立好的套接字线程之间进行通信时比较困难。当使用“生产者-消费者”模型开发网络程序时，为每个套接字都分别分配一个读线程、一个处理数据线程和一个用于同步的事件，那么这样无疑加大系统的开销。其最大的缺点是当希望同时处理大量套接字时，将无从下手，其扩展性很差

**非阻塞IO模型** 
 ![](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1564857412314&di=0d854bfa102034baf1b415032bb0cff8&imgtype=0&src=http%3A%2F%2Fpic.victorchu.info%2F%25E9%259D%259E%25E9%2598%25BB%25E5%25A1%259EIO.jpeg%3FimageView2%2F2%2Fw%2F800%2Fh%2F600%2Fq%2F75%257Cimageslim)

简介：非阻塞IO通过进程反复调用IO函数（多次系统调用，并马上返回）；在数据拷贝的过程中，进程是阻塞的；
 
我们把一个SOCKET接口设置为非阻塞就是告诉内核，当所请求的I/O操作无法完成时，不要将进程睡眠，而是返回一个错误。这样我们的I/O操作函数将不断的测试数据是否已经准备好，如果没有准备好，继续测试，直到数据准备好为止。在这个不断测试的过程中，会大量的占用CPU的时间。

把SOCKET设置为非阻塞模式，即通知系统内核：在调用Windows Sockets API时，不要让线程睡眠，而应该让函数立即返回。在返回时，该函数返回一个错误代码。图所示，一个非阻塞模式套接字多次调用recv()函数的过程。前三次调用recv()函数时，内核数据还没有准备好。因此，该函数立即返回WSAEWOULDBLOCK错误代码。第四次调用recv()函数时，数据已经准备好，被复制到应用程序的缓冲区中，recv()函数返回成功指示，应用程序开始处理数据。

当使用socket()函数和WSASocket()函数创建套接字时，默认都是阻���的。在创建套接字之后，通过调用ioctlsocket()函数，将该套接字设置为非阻塞模式。Linux下的函数是:fcntl().

套接字设置为非阻塞模式后，在调用Windows Sockets API函数时，调用函数会立即返回。大多数情况下，这些函数调用都会调用“失败”，并返回WSAEWOULDBLOCK错误代码。说明请求的操作在调用期间内没有时间完成。通常，应用程序需要重复调用该函数，直到获得成功返回代码。

需要说明的是并非所有的Windows Sockets API在非阻塞模式下调用，都会返回WSAEWOULDBLOCK错误。例如，以非阻塞模式的套接字为参数调用bind()函数时，就不会返回该错误代码。当然，在调用WSAStartup()函数时更不会返回该错误代码，因为该函数是应用程序第一调用的函数，当然不会返回这样的错误代码。

要将套接字设置为非阻塞模式，除了使用ioctlsocket()函数之外，还可以使用WSAAsyncselect()和WSAEventselect()函数。当调用该函数时，套接字会自动地设置为非阻塞方式。

由于使用非阻塞套接字在调用函数时，会经常返回WSAEWOULDBLOCK错误。所以在任何时候，都应仔细检查返回代码并作好对“失败”的准备。应用程序连续不断地调用这个函数，直到它返回成功指示为止。上面的程序清单中，在While循环体内不断地调用recv()函数，以读入1024个字节的数据。这种做法很浪费系统资源。

要完成这样的操作，有人使用MSG_PEEK标志调用recv()函数查看缓冲区中是否有数据可读。同样，这种方法也不好。因为该做法对系统造成的开销是很大的，并且应用程序至少要调用recv()函数两次，才能实际地读入数据。较好的做法是，使用套接字的“I/O模型”来判断非阻塞套接字是否可读可写。

非阻塞模式套接字与阻塞模式套接字相比，不容易使用。使用非阻塞模式套接字，需要编写更多的代码，以便在每个Windows Sockets API函数调用中，对收到的WSAEWOULDBLOCK错误进行处理。因此，非阻塞套接字便显得有些难于使用。

但是，非阻塞套接字在控制建立的多个连接，在数据的收发量不均，时间不定时，明显具有优势。这种套接字在使用上存在一定难度，但只要排除了这些困难，它在功能上还是非常强大的。通常情况下，可考虑使用套接字的“I/O模型”，它有助于应用程序通过异步方式，同时对一个或多个套接字的通信加以管理。


**IO复用模型：**
![](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1564857181158&di=13d24a895a5417ce847d6768a8f6f0f3&imgtype=jpg&src=http%3A%2F%2Fimg0.imgtn.bdimg.com%2Fit%2Fu%3D770609745%2C3299491672%26fm%3D214%26gp%3D0.jpg)

简介：主要是select和epoll；对一个IO端口，两次调用，两次返回，比阻塞IO并没有什么优越性；关键是能实现同时对多个IO端口进行监听；

I/O复用模型会用到select、poll、epoll函数，这几个函数也会使进程阻塞，但是和阻塞I/O所不同的的，这两个函数可以同时阻塞多个I/O操作。而且可以同时对多个读操作，多个写操作的I/O函数进行检测，直到有数据可读或可写时，才真正调用I/O操作函数。



**信号驱动IO**
![](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1564857276750&di=a736eec5e67ae951a456a8882f3b968d&imgtype=0&src=http%3A%2F%2Fimage.mamicode.com%2Finfo%2F201904%2F20190420195009891716.png) 

简介：两次调用，两次返回；

首先我们允许套接口进行信号驱动I/O,并安装一个信号处理函数，进程继续运行并不阻塞。当数据准备好时，进程会收到一个SIGIO信号，可以在信号处理函数中调用I/O操作函数处理数据。



**异步IO模型**
![](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1564857069930&di=25759da9819bd9b52f14476aea277376&imgtype=0&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20190624%2Ff5b1176ce6e241f48403c7e999d91b69.jpeg)

简介：数据拷贝的时候进程无需阻塞。

当一个异步过程调用发出后，调用者不能立刻得到结果。实际处理这个调用的部件在完成后，通过状态、通知和回调来通知调用者的输入输出操作


同步IO引起进程阻塞，直至IO操作完成。
异步IO不会引起进程阻塞。
IO复用是先通过select调用阻塞。

![](https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=176532706,1323700702&fm=26&gp=0.jpg)

### 2.5.3. select&poll&epoll比较
<a href="#menu" style="float:right">目录</a>


#### 2.5.3.1. 整体概览

**水平触发和边缘触发** 
* 水平触发通知
    * 如果文件描述符上可以非阻塞地执行I/O系统调用，此时认为它已经就绪
    * 也就是说主动去(轮询)检查文件描述符状态
    * select,poll,epoll
    * 可以任意时刻去检查文件描述符状态，因此不需要每次尽可能多的读取数据。
* 边缘触发通知
    * 如果文件描述符自上次状态检查以来有了新的I/O活动，此时需要触发通知。
    * select,信号驱动IO模型
    * I/O事件发生时才会收到通知型
    * 当收到通知时，应当尽可能多的读取字节，因为只有下一次I/O来时才能收到通知。


#### 2.5.3.2. 对比总结
epoll跟select都能提供多路I/O复用的解决方案。在现在的Linux内核里有都能够支持，其中epoll是Linux所特有，而select则应该是POSIX所规定，一般操作系统均有实现

**select：**
select本质上是通过设置或者检查存放fd标志位的数据结构来进行下一步处理。这样所带来的缺点是：
* 单个进程可监视的fd数量被限制，即能监听端口的大小有限。
一般来说这个数目和系统内存关系很大，具体数目可以cat /proc/sys/fs/file-max察看。32位机默认是1024个。64位机默认是2048.

* 对socket进行扫描时是线性扫描，即采用轮询的方法，效率较低：
当套接字比较多的时候，每次select()都要通过遍历FD_SETSIZE个Socket来完成调度,不管哪个Socket是活跃的,都遍历一遍。这会浪费很多CPU时间。如果能给套接字注册某个回调函数，当他们活跃时，自动完成相关操作，那就避免了轮询，这正是epoll与kqueue做的。

* 需要维护一个用来存放大量fd的数据结构，这样会使得用户空间和内核空间在传递该结构时复制开销大

* select函数
```c
int select(int nfds,fd_set *readfds,fd_set *writefds,fd_set *exceptfds, struct timeval *timeout)
```

* 参数
    * readfds 用来检测输入是否就绪的文件描述符集合
    * writefds 输出
    * exceptfds 异常情况是否发生
    * timeout  超时时间结构体
* 返回值
    * 0 ：超时
    * -1 ：发生错误
    * 大于1：就绪状态的描述符的总数，包括读写异常三个参数 
    

**poll：**

poll本质上和select没有区别，它将用户传入的数组拷贝到内核空间，然后查询每个fd对应的设备状态，如果设备就绪则在设备等待队列中加入一项并继续遍历，如果遍历完所有fd后没有发现就绪设备，则挂起当前进程，直到设备就绪或者主动超时，被唤醒后它又要再次遍历fd。这个过程经历了多次无谓的遍历。

它没有最大连接数的限制，原因是它是基于链表来存储的，但是同样有一个缺点：

* 大量的fd的数组被整体复制于用户态和内核地址空间之间，而不管这样的复制是不是有意义。
* poll还有一个特点是“水平触发”，如果报告了fd后，没有被处理，那么下次poll时会再次报告该fd。

* poll 函数
```c
int poll(struct pollfd fds[],nfds_t nfds,int timeout)

struct pollfd{
    //文件描述符
    int fd;
    //请求事件位掩码
    short events; 
    //返回事件位源码
    short revents;
}
```


* 参数
    * nfds 指定fds的元素个数，nfds_t实际为无符号整形
    * fds-fd 文件描述符
    * fds-events 需要做检查的事件位掩码，调用者初始化
    * fds-revents 发生了事件的位掩码，内核设置并返回
    * timeout   
        * -1 : 一直阻塞直到有一个文件描述符发生事件
        * 0: 不阻塞，全部检查完即使没有事件也返回
        * 大于0:最多阻塞时间
* 返回:同select

**select poll区别**
* select 检查的文件描述符有数量上限(FD_SETZIZE),LINUX默认为1024，修改需要重新编译内核。poll没有限制

* select的fd_set同时也是保存调用结果的地方，如果多次调用select需要每次都要进行初始化。poll是两个参数存放检查和就绪的文件描述符，从而避免每次都要进行初始化。

* select提供的超时精度比poll高 



**select poll 问题**
* 每次调用select和epoll都要向内核传入需要检查的文件描述符，检测是否处于就绪状态。当检查的文件描述符较多时，将会很耗时
* select 和 poll调用完成以后，程序必须检查返回的数据结构中的每一个元素，以此查明哪个文件描述符处于就绪态。
* 每次调用select和epoll都要向内核传入需要检查的文件描述符，检查完成，又从内核返回应用，如果文件描述符过多，复制也很耗时。



**epoll:**
epoll支持水平触发和边缘触发，最大的特点在于边缘触发，它只告诉进程哪些fd刚刚变为就需态，并且只会通知一次。还有一个特点是，epoll使用“事件”的就绪通知方式，通过epoll_ctl注册fd，一旦该fd就绪，内核就会采用类似callback的回调机制来激活该fd，epoll_wait便可以收到通知

* 适用场景:
    * 同时处理许多客户端的服务器;
    * 需要监视大量的文件描述符，但大部分属于空闲状态，只有少数文件描述符处于就绪状态。

* epoll水平触发和边缘触发的区别
    * 例子
        * 套接字上有输入到来
        * 调用一次epoll_wait(),无论采用的是水平触发还是边缘触发，该调用都会告诉我们套接字已经给处于就绪态
        * 再次调用epoll_wait()
    * 说明
        * 如果是水平触发通知，第二个epoll_wait()会告诉我们套接字已经给处于就绪态
        * 如果是边缘触发通知，将会被阻塞，因为没有新的输入进来

* epoll边缘触发通知机制的程序基本框架
    * 让所有监视的文件描述符都成为非阻塞
    * 通过epoll_wait()取得就绪状态的描述符列表
    * 针对每一个处于就绪状态文件描述符，不断进行IO处理直到相关的系统调用(例如read,write,recv,send,accept)返回EAGAIN或EWOULDBLOCK错误 

epoll的接口非常简单，一共就三个函数：
1. int epoll_create(int size);
创建一个epoll的句柄，size用来告诉内核这个监听的数目一共有多大。这个参数不同于select()中的第一个参数，给出最大监听的fd+1的值。需要注意的是，当创建好epoll句柄后，它就是会占用一个fd值，在linux下如果查看/proc/进程id/fd/，是能够看到这个fd的，所以在使用完epoll后，必须调用close()关闭，否则可能导致fd被耗尽。


2. int epoll_ctl(int epfd, int op, int fd, struct epoll_event *event);
epoll的事件注册函数，它不同与select()是在监听事件时告诉内核要监听什么类型的事件，而是在这里先注册要监听的事件类型。第一个参数是epoll_create()的返回值，第二个参数表示动作，用三个宏来表示：
EPOLL_CTL_ADD：注册新的fd到epfd中；
EPOLL_CTL_MOD：修改已经注册的fd的监听事件；
EPOLL_CTL_DEL：从epfd中删除一个fd；
第三个参数是需要监听的fd，第四个参数是告诉内核需要监听什么事，struct epoll_event结构如下：

```c
typedef union epoll_data {
    void *ptr;
    int fd;
    __uint32_t u32;
    __uint64_t u64;
} epoll_data_t;

struct epoll_event {
    __uint32_t events; /* Epoll events */
    epoll_data_t data; /* User data variable */
};

```
 


events可以是以下几个宏的集合：
EPOLLIN ：表示对应的文件描述符可以读（包括对端SOCKET正常关闭）；
EPOLLOUT：表示对应的文件描述符可以写；
EPOLLPRI：表示对应的文件描述符有紧急的数据可读（这里应该表示有带外数据到来）；
EPOLLERR：表示对应的文件描述符发生错误；
EPOLLHUP：表示对应的文件描述符被挂断；
EPOLLET： 将EPOLL设为边缘触发(Edge Triggered)模式，这是相对于水平触发(Level Triggered)来说的。
EPOLLONESHOT：只监听一次事件，当监听完这次事件之后，如果还需要继续监听这个socket的话，需要再次把这个socket加入到EPOLL队列里


3. int epoll_wait(int epfd, struct epoll_event * events, int maxevents, int timeout);
等待事件的产生，类似于select()调用。参数events用来从内核得到事件的集合，maxevents告之内核这个events有多大，这个 maxevents的值不能大于创建epoll_create()时的size，参数timeout是超时时间（毫秒，0会立即返回，-1将不确定，也有说法说是永久阻塞）。该函数返回需要处理的事件数目，如返回0表示已超时。


4、关于ET、LT两种工作模式：
可以得出这样的结论:
ET模式仅当状态发生变化的时候才获得通知,这里所谓的状态的变化并不包括缓冲区中还有未处理的数据,也就是说,如果要采用ET模式,需要一直read/write直到出错为止,很多人反映为什么采用ET模式只接收了一部分数据就再也得不到通知了,大多因为这样;而LT模式是只要有数据没有处理就会一直通知下去的.


那么究竟如何来使用epoll呢？其实非常简单。
通过在包含一个头文件#include <sys/epoll.h> 以及几个简单的API将可以大大的提高你的网络服务器的支持人数。

首先通过create_epoll(int maxfds)来创建一个epoll的句柄，其中maxfds为你epoll所支持的最大句柄数。这个函数会返回一个新的epoll句柄，之后的所有操作将通过这个句柄来进行操作。在用完之后，记得用close()来关闭这个创建出来的epoll句柄。

之后在你的网络主循环里面，每一帧的调用epoll_wait(int epfd, epoll_event events, int max events, int timeout)来查询所有的网络接口，看哪一个可以读，哪一个可以写了。基本的语法为：
nfds = epoll_wait(kdpfd, events, maxevents, -1);
其中kdpfd为用epoll_create创建之后的句柄，events是一个epoll_event*的指针，当epoll_wait这个函数操作成功之后，epoll_events里面将储存所有的读写事件。max_events是当前需要监听的所有socket句柄数。最后一个timeout是 epoll_wait的超时，为0的时候表示马上返回，为-1的时候表示一直等下去，直到有事件范围，为任意正整数的时候表示等这么长的时间，如果一直没有事件，则范围。一般如果网络主循环是单独的线程的话，可以用-1来等，这样可以保证一些效率，如果是和主逻辑在同一个线程的话，则可以用0来保证主循环的效率。

epoll_wait范围之后应该是一个循环，遍利所有的事件。

几乎所有的epoll程序都使用下面的框架：
```c
for( ; ; )
    {
        nfds = epoll_wait(epfd,events,20,500);
        for(i=0;i<nfds;++i)
        {
            if(events[i].data.fd==listenfd) //有新的连接
            {
                connfd = accept(listenfd,(sockaddr *)&clientaddr, &clilen); //accept这个连接
                ev.data.fd=connfd;
                ev.events=EPOLLIN|EPOLLET;
                epoll_ctl(epfd,EPOLL_CTL_ADD,connfd,&ev); //将新的fd添加到epoll的监听队列中
            }
            else if( events[i].events&EPOLLIN ) //接收到数据，读socket
            {
                n = read(sockfd, line, MAXLINE)) < 0    //读
                ev.data.ptr = md;     //md为自定义类型，添加数据
                ev.events=EPOLLOUT|EPOLLET;
                epoll_ctl(epfd,EPOLL_CTL_MOD,sockfd,&ev);//修改标识符，等待下一个循环时发送数据，异步处理的精髓
            }
            else if(events[i].events&EPOLLOUT) //有数据待发送，写socket
            {
                struct myepoll_data* md = (myepoll_data*)events[i].data.ptr;    //取数据
                sockfd = md->fd;
                send( sockfd, md->ptr, strlen((char*)md->ptr), 0 );        //发送数据
                ev.data.fd=sockfd;
                ev.events=EPOLLIN|EPOLLET;
                epoll_ctl(epfd,EPOLL_CTL_MOD,sockfd,&ev); //修改标识符，等待下一个循环时接收数据
            }
            else
            {
                //其他的处理
            }
        }
    }

```
完整的服务端例子

```cpp
#include <iostream>
#include <sys/socket.h>
#include <sys/epoll.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <fcntl.h>
#include <unistd.h>
#include <stdio.h>
#include <errno.h>

using namespace std;

#define MAXLINE 5
#define OPEN_MAX 100
#define LISTENQ 20
#define SERV_PORT 5000
#define INFTIM 1000

void setnonblocking(int sock)
{
    int opts;
    opts=fcntl(sock,F_GETFL);
    if(opts<0)
    {
        perror("fcntl(sock,GETFL)");
        exit(1);
    }
    opts = opts|O_NONBLOCK;
    if(fcntl(sock,F_SETFL,opts)<0)
    {
        perror("fcntl(sock,SETFL,opts)");
        exit(1);
    }
}

int main(int argc, char* argv[])
{
    int i, maxi, listenfd, connfd, sockfd,epfd,nfds, portnumber;
    ssize_t n;
    char line[MAXLINE];
    socklen_t clilen;


    if ( 2 == argc )
    {
        if( (portnumber = atoi(argv[1])) < 0 )
        {
            fprintf(stderr,"Usage:%s portnumber/a/n",argv[0]);
            return 1;
        }
    }
    else
    {
        fprintf(stderr,"Usage:%s portnumber/a/n",argv[0]);
        return 1;
    }



    //声明epoll_event结构体的变量,ev用于注册事件,数组用于回传要处理的事件

    struct epoll_event ev,events[20];
    //生成用于处理accept的epoll专用的文件描述符

    epfd=epoll_create(256);
    struct sockaddr_in clientaddr;
    struct sockaddr_in serveraddr;
    listenfd = socket(AF_INET, SOCK_STREAM, 0);
    //把socket设置为非阻塞方式

    //setnonblocking(listenfd);

    //设置与要处理的事件相关的文件描述符

    ev.data.fd=listenfd;
    //设置要处理的事件类型

    ev.events=EPOLLIN|EPOLLET;
    //ev.events=EPOLLIN;

    //注册epoll事件

    epoll_ctl(epfd,EPOLL_CTL_ADD,listenfd,&ev);
    bzero(&serveraddr, sizeof(serveraddr));
    serveraddr.sin_family = AF_INET;
    char *local_addr="127.0.0.1";
    inet_aton(local_addr,&(serveraddr.sin_addr));//htons(portnumber);

    serveraddr.sin_port=htons(portnumber);
    bind(listenfd,(sockaddr *)&serveraddr, sizeof(serveraddr));
    listen(listenfd, LISTENQ);
    maxi = 0;
    for ( ; ; ) {
        //等待epoll事件的发生

        nfds=epoll_wait(epfd,events,20,500);
        //处理所发生的所有事件

        for(i=0;i<nfds;++i)
        {
            if(events[i].data.fd==listenfd)//如果新监测到一个SOCKET用户连接到了绑定的SOCKET端口，建立新的连接。

            {
                connfd = accept(listenfd,(sockaddr *)&clientaddr, &clilen);
                if(connfd<0){
                    perror("connfd<0");
                    exit(1);
                }
                //setnonblocking(connfd);

                char *str = inet_ntoa(clientaddr.sin_addr);
                cout << "accapt a connection from " << str << endl;
                //设置用于读操作的文件描述符

                ev.data.fd=connfd;
                //设置用于注测的读操作事件

                ev.events=EPOLLIN|EPOLLET;
                //ev.events=EPOLLIN;

                //注册ev

                epoll_ctl(epfd,EPOLL_CTL_ADD,connfd,&ev);
            }
            else if(events[i].events&EPOLLIN)//如果是已经连接的用户，并且收到数据，那么进行读入。

            {
                cout << "EPOLLIN" << endl;
                if ( (sockfd = events[i].data.fd) < 0)
                    continue;
                if ( (n = read(sockfd, line, MAXLINE)) < 0) {
                    if (errno == ECONNRESET) {
                        close(sockfd);
                        events[i].data.fd = -1;
                    } else
                        std::cout<<"readline error"<<std::endl;
                } else if (n == 0) {
                    close(sockfd);
                    events[i].data.fd = -1;
                }
                line[n] = '/0';
                cout << "read " << line << endl;
                //设置用于写操作的文件描述符

                ev.data.fd=sockfd;
                //设置用于注测的写操作事件

                ev.events=EPOLLOUT|EPOLLET;
                //修改sockfd上要处理的事件为EPOLLOUT

                //epoll_ctl(epfd,EPOLL_CTL_MOD,sockfd,&ev);

            }
            else if(events[i].events&EPOLLOUT) // 如果有数据发送

            {
                sockfd = events[i].data.fd;
                write(sockfd, line, n);
                //设置用于读操作的文件描述符

                ev.data.fd=sockfd;
                //设置用于注测的读操作事件

                ev.events=EPOLLIN|EPOLLET;
                //修改sockfd上要处理的事件为EPOLIN

                epoll_ctl(epfd,EPOLL_CTL_MOD,sockfd,&ev);
            }
        }
    }
    return 0;
}
```

**select、poll、epoll 区别总结：** 

* 支持一个进程所能打开的最大连接数

|||
|---|---|
|select|单个进程所能打开的最大连接数有FD_SETSIZE宏定义，其大小是32个整数的大小（在32位的机器上，大小就是32*32，同理64位机器上FD_SETSIZE为32*64），当然我们可以对进行修改，然后重新编译内核，但是性能可能会受到影响，这需要进一步的测试。
|poll|poll本质上和select没有区别，但是它没有最大连接数的限制，原因是它是基于链表来存储的
|epoll|虽然连接数有上限，但是很大，1G内存的机器上可以打开10万左右的连接，2G内存的机器可以打开20万左右的连接

* FD剧增后带来的IO效率问题

|||
|---|---|
|select|因为每次调用时都会对连接进行线性遍历，所以随着FD的增加会造成遍历速度慢的“线性下降性能问题”。
|poll|同上
|epoll|因为epoll内核中实现是根据每个fd上的callback函数来实现的，只有活跃的socket才会主动调用callback，所以在活跃socket较少的情况下，使用epoll没有前面两者的线性下降的性能问题，但是所有socket都很活跃的情况下，可能会有性能问题。

* 消息传递方式

|||
|---|---|
|select|内核需要将消息传递到用户空间，都需要内核拷贝动作
|poll|同上
|epoll|epoll通过内核和用户空间共享一块内存来实现的。

**总结：**
综上，在选择select，poll，epoll时要根据具体的使用场合以及这三种方式的自身特点。
* 表面上看epoll的性能最好，但是在连接数少并且连接都十分活跃的情况下，select和poll的性能可能比epoll好，毕竟epoll的通知机制需要很多函数回调。
* select低效是因为每次它都需要轮询。但低效也是相对的，视情况而定，也可通过良好的设计改善



## 2.6. Shell
<a href="#menu" style="float:right">目录</a>


### 2.6.1. 文件相关
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

### 2.6.2. 系统监控
<a href="#menu" style="float:right">目录</a>

### 2.6.3. 处理数据文件
<a href="#menu" style="float:right">目录</a>

### 2.6.4. 环境变量
<a href="#menu" style="float:right">目录</a>

### 2.6.5. 基本脚本命令

<a href="#menu" style="float:right">目录</a>

### 2.6.6. 结构化命令
<a href="#menu" style="float:right">目录</a>

### 2.6.7. 处理用户输入
<a href="#menu" style="float:right">目录</a>

### 2.6.8. 控制脚本
<a href="#menu" style="float:right">目录</a><span id="menu"></span>




# 3. Java与面向对象

## 3.1. Java基础
<a href="#menu" style="float:right">目录</a>

### 3.1.1. 数据类型
<a href="#menu" style="float:right">目录</a>


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

#### 3.1.1.1. Integer 缓存对象
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
#### 3.1.1.2. 数组
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
#### 3.1.1.3. String 
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


## 3.2. 面向对象
<a href="#menu" style="float:right">目录</a>

### 3.2.1. 三大特性
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



**创建对象的多种方式**
* 用new关键字创建.会调用构造器
* 利用反射，调用Class类的或者是Constructor类的newInstance（）方法.会调用构造器
* 用反序列化，调用ObjectInputStream类的readObject（）方法，不会调用构造器
* 调用对象的clone方法，不会调用构造器





#### 3.2.1.1. 权限修饰符
<a href="#menu" style="float:right">目录</a>
* private 本类可见
* default 同一个包/子包可见
* protect 子类可见
* public 所有可见

#### 3.2.1.2. 接口和抽象类
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

#### 3.2.1.3. 建议
* 考虑使用静态工厂方法代替构造器
    * 如果类的实例化参数较复杂，应当通过工厂方法向用户提供简单明了的实例化方法
* 参数较多时使用构建器
    * 由用户决定初始化哪个属性
* 避免创建不必要的对象
    * 创建对象将占用JVM堆内存，为了减少堆内存的使用，要么减少不必要的对象，重复使用的对象可使用对象池，比如数据库连接池
* 消除过期的对象引用
    * 不再使用的对象应当消除其引用
    * 栈中创建的引用不需要显示消除
    * 需要注意的是使用集合存储对象时，如果不再使用应当移除该对象，以便JVM能够对其进行回收
* 避免使用终结方法
    * 终结方法finalizer在垃圾回收之前会被调用
    * 因为何时被调用并不确定，可能很快，可能很长时间，如果使用其来释放资源，将存在很大的不确定性。
* 覆盖equals应遵循的约定
    * 自反性
        * 对于任何非null的对象x，x.equals(x) 必须返回 true
    * 对称性
        * 对于任何非null的对象x、y ,x.equals(y) 和y.equals(x)结果必须相同
    * 传递性
        * 对于任何非null的对象x、y、z，x.equals(y)并且y.equals(z)都返回true，那么必须x.equals(z)返回true.
    * 一致性
        *  对于任何非null的对象x、y,如果equals中比较的信息没改，那么多次调用的结果都是一致的。
    * 对于任何非null的对象，x.equals(null)必须返回false.
* 重写equals时也要重写HashCode
    * 规范:如果两个对象根据equals方法比较的结果是true,那么它们的hashCode方法结果也一样,反过来没有强制
    * 在应用程序的执行期间，只要对象的equals方法的比较操作所用到的信息没有被修改，那么多次调用hashCode获得的整数是一致的
    

#### 3.2.1.4. 内部类
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
#### 3.2.1.5. 枚举类
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
### 3.2.2. 泛型
<a href="#menu" style="float:right">目录</a>

### 3.2.3. 概述
泛型在java中有很重要的地位，在面向对象编程及各种设计模式中有非常广泛的应用。

**什么是泛型？为什么要使用泛型？**
* 泛型，即“参数化类型”。一提到参数，最熟悉的就是定义方法时有形参，然后调用此方法时传递实参。那么参数化类型怎么理解呢？
* 顾名思义，就是将类型由原来的具体的类型参数化，类似于方法中的变量参数，此时类型也定义成参数形式（可以称之为类型形参），然后在使用/调用时传入具体的类型（类型实参）。
* 泛型的本质是为了参数化类型（在不创建新的类型的情况下，通过泛型指定的不同类型来控制形参具体限制的类型）。也就是说在泛型使用过程中，
* 操作的数据类型被指定为一个参数，这种参数类型可以用在类、接口和方法中，分别被称为泛型类、泛型接口、泛型方法。

```java
List arrayList = new ArrayList();
arrayList.add("aaaa");
arrayList.add(100);

for(int i = 0; i< arrayList.size();i++){
    String item = (String)arrayList.get(i);
    Log.d("泛型测试","item = " + item);
}
```
毫无疑问，程序的运行结果会以崩溃结束：
java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
ArrayList可以存放任意类型，例子中添加了一个String类型，添加了一个Integer类型，再使用时都以String的方式使用，因此程序崩溃了。为了解决类似这样的问题（在编译阶段就可以解决），泛型应运而生。

我们将第一行声明初始化list的代码更改一下，编译器会在编译阶段就能够帮我们发现类似这样的问题。
```
List<String> arrayList = new ArrayList<String>();
//arrayList.add(100); 在编译阶段，编译器就会报错
```
* 如果不使用范型，可以把任意类型的对象放入集合，但这将丢失对象的状态信息，集合只知道它盛装的是Object,因此取出需要进行强制转换，如果类型不同，将会发送异常
* 如果使用范型，如果放入对象的类型与集合定义的范型类型不一致，将会发生异常，该对象不会被放入集合。


* 泛型只在编译阶段有效。看下面的代码：
```java
List<String> stringArrayList = new ArrayList<String>();
List<Integer> integerArrayList = new ArrayList<Integer>();

Class classStringArrayList = stringArrayList.getClass();
Class classIntegerArrayList = integerArrayList.getClass();

if(classStringArrayList.equals(classIntegerArrayList)){
    Log.d("泛型测试类型相同");
}
```
输出结果：泛型测试: 类型相同。

通过上面的例子可以证明，在编译之后程序会采取去泛型化的措施。也就是说Java中的泛型，只在编译阶段有效。在编译过程中，正确检验泛型结果后，会将泛型的相关信息擦出，并且在对象进入和离开方法的边界处添加类型检查和类型转换的方法。也就是说，泛型信息不会进入到运行时阶段。
对此总结成一句话：泛型类型在逻辑上看以看成是多个不同的类型，实际上都是相同的基本类型。

**泛型的使用**
泛型有三种使用方式，分别为：泛型类、泛型接口、泛型方法

**泛型类**
泛型类型用于类的定义中，被称为泛型类。通过泛型可以完成对一组类的操作对外开放相同的接口。最典型的就是各种容器类，如：List、Set、Map。

泛型类的最基本写法（这么看可能会有点晕，会在下面的例子中详解）：

```java
class 类名称 <泛型标识：可以随便写任意标识号，标识指定的泛型的类型>{
  private 泛型标识 /*（成员变量类型）*/ var; 
  .....

  }
}
```
一个最普通的泛型类：
```java
//此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
//在实例化泛型类时，必须指定T的具体类型
public class Generic<T>{ 
    //key这个成员变量的类型为T,T的类型由外部指定  
    private T key;

    public Generic(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }

    public T getKey(){ //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }
}

//泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
//传入的实参类型需与泛型的类型参数类型相同，即为Integer.
Generic<Integer> genericInteger = new Generic<Integer>(123456);

//传入的实参类型需与泛型的类型参数类型相同，即为String.
Generic<String> genericString = new Generic<String>("key_vlaue");
Log.d("泛型测试","key is " + genericInteger.getKey());
Log.d("泛型测试","key is " + genericString.getKey());
```
12-27 09:20:04.432 13063-13063/? D/泛型测试: key is 123456
12-27 09:20:04.432 13063-13063/? D/泛型测试: key is key_vlaue

定义的泛型类，就一定要传入泛型类型实参么？并不是这样，在使用泛型的时候如果传入泛型实参，则会根据传入的泛型实参做相应的限制，此时泛型才会起到本应起到的限制作用。如果不传入泛型类型实参的话，在泛型类中使用泛型的方法或成员变量定义的类型可以为任何的类型。

看一个例子：

```java
Generic generic = new Generic("111111");
Generic generic1 = new Generic(4444);
Generic generic2 = new Generic(55.55);
Generic generic3 = new Generic(false);

Log.d("泛型测试","key is " + generic.getKey());
Log.d("泛型测试","key is " + generic1.getKey());
Log.d("泛型测试","key is " + generic2.getKey());
Log.d("泛型测试","key is " + generic3.getKey());
```

D/泛型测试: key is 111111
D/泛型测试: key is 4444
D/泛型测试: key is 55.55
D/泛型测试: key is false
 

注意：
泛型的类型参数只能是类类型，不能是简单类型。
不能对确切的泛型类型使用instanceof操作。如下面的操作是非法的，编译时会出错。
if(ex_num instanceof Generic<Number>){ }

**泛型接口**
泛型接口与泛型类的定义及使用基本相同。泛型接口常被用在各种类的生产器中，可以看一个例子：

//定义一个泛型接口
public interface Generator<T> {
    public T next();
}
当实现泛型接口的类，未传入泛型实参时：

```java
/**
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
 * 即：class FruitGenerator<T> implements Generator<T>{
 * 如果不声明泛型，如：class FruitGenerator implements Generator<T>，编译器会报错："Unknown class"
 */
class FruitGenerator<T> implements Generator<T>{
    @Override
    public T next() {
        return null;
    }
}
```

当实现泛型接口的类，传入泛型实参时：

```java
/**
 * 传入泛型实参时：
 * 定义一个生产器实现这个接口,虽然我们只创建了一个泛型接口Generator<T>
 * 但是我们可以为T传入无数个实参，形成无数种类型的Generator接口。
 * 在实现类实现泛型接口时，如已将泛型类型传入实参类型，则所有使用泛型的地方都要替换成传入的实参类型
 * 即：Generator<T>，public T next();中的的T都要替换成传入的String类型。
 */
public class FruitGenerator implements Generator<String> {

    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    @Override
    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }
}
```

**泛型通配符**
我们知道Ingeter是Number的一个子类，同时在特性章节中我们也验证过Generic<Ingeter>与Generic<Number>实际上是相同的一种基本类型。那么问题来了，在使用Generic<Number>作为形参的方法中，能否使用Generic<Ingeter>的实例传入呢？在逻辑上类似于Generic<Number>和Generic<Ingeter>是否可以看成具有父子关系的泛型类型呢？

为了弄清楚这个问题，我们使用Generic<T>这个泛型类继续看下面的例子：

public void showKeyValue1(Generic<Number> obj){
    Log.d("泛型测试","key value is " + obj.getKey());
}
 

```java
Generic<Integer> gInteger = new Generic<Integer>(123);
Generic<Number> gNumber = new Generic<Number>(456);

showKeyValue(gNumber);

// showKeyValue这个方法编译器会为我们报错：Generic<java.lang.Integer> 
// cannot be applied to Generic<java.lang.Number>
// showKeyValue(gInteger);
```
 

通过提示信息我们可以看到Generic<Integer>不能被看作为`Generic<Number>的子类。由此可以看出:同一种泛型可以对应多个版本（因为参数类型是不确定的），不同版本的泛型类实例是不兼容的。

回到上面的例子，如何解决上面的问题？总不能为了定义一个新的方法来处理Generic<Integer>类型的类，这显然与java中的多台理念相违背。因此我们需要一个在逻辑上可以表示同时是Generic<Integer>和Generic<Number>父类的引用类型。由此类型通配符应运而生。

我们可以将上面的方法改一下：

public void showKeyValue1(Generic<?> obj){
    Log.d("泛型测试","key value is " + obj.getKey());
}
类型通配符一般是使用？代替具体的类型实参，注意了，此处’？’是类型实参，而不是类型形参 。重要说三遍！此处’？’是类型实参，而不是类型形参 ！ 此处’？’是类型实参，而不是类型形参 ！再直白点的意思就是，此处的？和Number、String、Integer一样都是一种实际的类型，可以把？看成所有类型的父类。是一种真实的类型。

可以解决当具体类型不确定的时候，这个通配符就是 ?  ；当操作类型时，不需要使用类型的具体功能时，只使用Object类中的功能。那么可以用 ? 通配符来表未知类型。

**泛型方法**
在java中,泛型类的定义非常简单，但是泛型方法就比较复杂了。

尤其是我们见到的大多数泛型类中的成员方法也都使用了泛型，有的甚至泛型类中也包含着泛型方法，这样在初学者中非常容易将泛型方法理解错了。
泛型类，是在实例化类的时候指明泛型的具体类型；泛型方法，是在调用方法的时候指明泛型的具体类型 。

```java
/**
 * 泛型方法的基本介绍
 * @param tClass 传入的泛型实参
 * @return T 返回值为T类型
 * 说明：
 *     1）public 与 返回值中间<T>非常重要，可以理解为声明此方法为泛型方法。
 *     2）只有声明了<T>的方法才是泛型方法，泛型类中的使用了泛型的成员方法并不是泛型方法。
 *     3）<T>表明该方法将使用泛型类型T，此时才可以在方法中使用泛型类型T。
 *     4）与泛型类的定义一样，此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型。
 */
public <T> T genericMethod(Class<T> tClass)throws InstantiationException ,
  IllegalAccessException{
        T instance = tClass.newInstance();
        return instance;
}
```
 

Object obj = genericMethod(Class.forName("com.test.test"));
4.6.1 泛型方法的基本用法
光看上面的例子有的同学可能依然会非常迷糊，我们再通过一个例子，把我泛型方法再总结一下。

```java
public class GenericTest {
   //这个类是个泛型类，在上面已经介绍过
   public class Generic<T>{     
        private T key;

        public Generic(T key) {
            this.key = key;
        }

        //我想说的其实是这个，虽然在方法中使用了泛型，但是这并不是一个泛型方法。
        //这只是类中一个普通的成员方法，只不过他的返回值是在声明泛型类已经声明过的泛型。
        //所以在这个方法中才可以继续使用 T 这个泛型。
        public T getKey(){
            return key;
        }

        /**
         * 这个方法显然是有问题的，在编译器会给我们提示这样的错误信息"cannot reslove symbol E"
         * 因为在类的声明中并未声明泛型E，所以在使用E做形参和返回值类型时，编译器会无法识别。
        public E setKey(E key){
             this.key = keu
        }
        */
    }

    /** 
     * 这才是一个真正的泛型方法。
     * 首先在public与返回值之间的<T>必不可少，这表明这是一个泛型方法，并且声明了一个泛型T
     * 这个T可以出现在这个泛型方法的任意位置.
     * 泛型的数量也可以为任意多个 
     *    如：public <T,K> K showKeyName(Generic<T> container){
     *        ...
     *        }
     */
    public <T> T showKeyName(Generic<T> container){
        System.out.println("container key :" + container.getKey());
        //当然这个例子举的不太合适，只是为了说明泛型方法的特性。
        T test = container.getKey();
        return test;
    }

    //这也不是一个泛型方法，这就是一个普通的方法，只是使用了Generic<Number>这个泛型类做形参而已。
    public void showKeyValue1(Generic<Number> obj){
        Log.d("泛型测试","key value is " + obj.getKey());
    }

    //这也不是一个泛型方法，这也是一个普通的方法，只不过使用了泛型通配符?
    //同时这也印证了泛型通配符章节所描述的，?是一种类型实参，可以看做为Number等所有类的父类
    public void showKeyValue2(Generic<?> obj){
        Log.d("泛型测试","key value is " + obj.getKey());
    }

     /**
     * 这个方法是有问题的，编译器会为我们提示错误信息："UnKnown class 'E' "
     * 虽然我们声明了<T>,也表明了这是一个可以处理泛型的类型的泛型方法。
     * 但是只声明了泛型类型T，并未声明泛型类型E，因此编译器并不知道该如何处理E这个类型。
    public <T> T showKeyName(Generic<E> container){
        ...
    }  
    */

    /**
     * 这个方法也是有问题的，编译器会为我们提示错误信息："UnKnown class 'T' "
     * 对于编译器来说T这个类型并未项目中声明过，因此编译也不知道该如何编译这个类。
     * 所以这也不是一个正确的泛型方法声明。
    public void showkey(T genericObj){

    }
    */

    public static void main(String[] args) {


    }
}
```
**类中的泛型方法**
当然这并不是泛型方法的全部，泛型方法可以出现杂任何地方和任何场景中使用。但是有一种情况是非常特殊的，当泛型方法出现在泛型类中时，我们再通过一个例子看一下

```java
public class GenericFruit {
    class Fruit{
        @Override
        public String toString() {
            return "fruit";
        }
    }

    class Apple extends Fruit{
        @Override
        public String toString() {
            return "apple";
        }
    }

    class Person{
        @Override
        public String toString() {
            return "Person";
        }
    }

    class GenerateTest<T>{
        public void show_1(T t){
            System.out.println(t.toString());
        }

        //在泛型类中声明了一个泛型方法，使用泛型E，这种泛型E可以为任意类型。可以类型与T相同，也可以不同。
        //由于泛型方法在声明的时候会声明泛型<E>，因此即使在泛型类中并未声明泛型，编译器也能够正确识别泛型方法中识别的泛型。
        public <E> void show_3(E t){
            System.out.println(t.toString());
        }

        //在泛型类中声明了一个泛型方法，使用泛型T，注意这个T是一种全新的类型，可以与泛型类中声明的T不是同一种类型。
        public <T> void show_2(T t){
            System.out.println(t.toString());
        }
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Person person = new Person();

        GenerateTest<Fruit> generateTest = new GenerateTest<Fruit>();
        //apple是Fruit的子类，所以这里可以
        generateTest.show_1(apple);
        //编译器会报错，因为泛型类型实参指定的是Fruit，而传入的实参类是Person
        //generateTest.show_1(person);

        //使用这两个方法都可以成功
        generateTest.show_2(apple);
        generateTest.show_2(person);

        //使用这两个方法也都可以成功
        generateTest.show_3(apple);
        generateTest.show_3(person);
    }
}
```

**泛型方法与可变参数**

再看一个泛型方法和可变参数的例子：
```java
public <T> void printMsg( T... args){
    for(T t : args){
        Log.d("泛型测试","t is " + t);
    }
}
printMsg("111",222,"aaaa","2323.4",55.55);
```

**静态方法与泛型**
静态方法有一种情况需要注意一下，那就是在类中的静态方法使用泛型：静态方法无法访问类上定义的泛型；如果静态方法操作的引用数据类型不确定的时候，必须要将泛型定义在方法上。

即：如果静态方法要使用泛型的话，必须将静态方法也定义成泛型方法 。

```java
public class StaticGenerator<T> {
    ....
    ....
    /**
     * 如果在类中定义使用泛型的静态方法，需要添加额外的泛型声明（将这个方法定义成泛型方法）
     * 即使静态方法要使用泛型类中已经声明过的泛型也不可以。
     * 如：public static void show(T t){..},此时编译器会提示错误信息：
          "StaticGenerator cannot be refrenced from static context"
     */
    public static <T> void show(T t){

    }
}
```
**泛型方法总结**
泛型方法能使方法独立于类而产生变化，以下是一个基本的指导原则：

无论何时，如果你能做到，你就该尽量使用泛型方法。也就是说，如果使用泛型方法将整个类泛型化，

那么就应该使用泛型方法。另外对于一个static的方法而已，无法访问泛型类型的参数。

所以如果static方法要使用泛型能力，就必须使其成为泛型方法。
**泛型上下边界**
在使用泛型的时候，我们还可以为传入的泛型类型实参进行上下边界的限制，如：类型实参只准传入某种类型的父类或某种类型的子类。

为泛型添加上边界，即传入的类型实参必须是指定类型的子类型

public void showKeyValue1(Generic<? extends Number> obj){
    Log.d("泛型测试","key value is " + obj.getKey());
}
```java
Generic<String> generic1 = new Generic<String>("11111");
Generic<Integer> generic2 = new Generic<Integer>(2222);
Generic<Float> generic3 = new Generic<Float>(2.4f);
Generic<Double> generic4 = new Generic<Double>(2.56);

//这一行代码编译器会提示错误，因为String类型并不是Number类型的子类
//showKeyValue1(generic1);

showKeyValue1(generic2);
showKeyValue1(generic3);
showKeyValue1(generic4);
```
如果我们把泛型类的定义也改一下:

```java
public class Generic<T extends Number>{
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey(){
        return key;
    }
}
```
 

//这一行代码也会报错，因为String不是Number的子类
Generic<String> generic1 = new Generic<String>("11111");
再来一个泛型方法的例子：

 

```java
//在泛型方法中添加上下边界限制的时候，必须在权限声明与返回值之间的<T>上添加上下边界，即在泛型声明的时候添加
//public <T> T showKeyName(Generic<T extends Number> container)，编译器会报错："Unexpected bound"
public <T extends Number> T showKeyName(Generic<T> container){
    System.out.println("container key :" + container.getKey());
    T test = container.getKey();
    return test;
}
```
通过上面的两个例子可以看出：泛型的上下边界添加，必须与泛型的声明在一起 。

**泛型数组**
看到了很多文章中都会提起泛型数组，经过查看sun的说明文档，在java中是”不能创建一个确切的泛型类型的数组”的。

也就是说下面的这个例子是不可以的：

List<String>[] ls = new ArrayList<String>[10];  
而使用通配符创建泛型数组是可以的，如下面这个例子：

List<?>[] ls = new ArrayList<?>[10]; 
这样也是可以的：

List<String>[] ls = new ArrayList[10];
下面使用Sun的一篇文档的一个例子来说明这个问题：

```java
List<String>[] lsa = new ArrayList<String>[10]; // Not really allowed.    
Object o = lsa;    
Object[] oa = (Object[]) o;    
List<Integer> li = new ArrayList<Integer>();    
li.add(new Integer(3));    
oa[1] = li; // Unsound, but passes run time store check    
String s = lsa[1].get(0); // Run-time error: ClassCastException.
```
这种情况下，由于JVM泛型的擦除机制，在运行时JVM是不知道泛型信息的，所以可以给oa[1]赋上一个ArrayList而不会出现异常，但是在取出数据的时候却要做一次类型转换，所以就会出现ClassCastException，如果可以进行泛型数组的声明，上面说的这种情况在编译期将不会出现任何的警告和错误，只有在运行时才会出错。而对泛型数组的声明进行限制，对于这样的情况，可以在编译期提示代码有类型安全问题，比没有任何提示要强很多。 

下面采用通配符的方式是被允许的:数组的类型不可以是类型变量，除非是采用通配符的方式，因为对于通配符的方式，最后取出数据是要做显式的类型转换的。

```java
List<?>[] lsa = new ArrayList<?>[10]; // OK, array of unbounded wildcard type.    
Object o = lsa;    
Object[] oa = (Object[]) o;    
List<Integer> li = new ArrayList<Integer>();    
li.add(new Integer(3));    
oa[1] = li; // Correct.    
Integer i = (Integer) lsa[1].get(0); // OK 
```


### 3.2.4. 集合
<a href="#menu" style="float:right">目录</a>

![](http://images2015.cnblogs.com/blog/745114/201603/745114-20160314011243365-185967687.png)

**Collections**

Collections则是集合类的一个工具类/帮助类，其中提供了一系列静态方法，用于对集合中元素进行排序、搜索以及线程安全等各种操作。
* 排序(Sort)
    * 使用sort方法可以根据元素的自然顺序 对指定列表按升序进行排序。列表中的所有元素都必须实现 Comparable 接口。此列表内的所有元素都必须是使用指定比较器可相互比较的
* 混排（Shuffling）
    * 混排算法所做的正好与 sort 相反: 它打乱在一个 List 中可能有的任何排列的踪迹。也就是说，基于随机源的输入重排该 List, 这样的排列具有相同的可能性（假设随机源是公正的）。这个算法在实现一个碰运气的游戏中是非常有用的。例如，它可被用来混排代表一副牌的 Card 对象的一个 List 。另外，在生成测试案例时，它也是十分有用的。
    * Collections.Shuffling(list)
* 反转(Reverse)
    * 使用Reverse方法可以根据元素的自然顺序 对指定列表按降序进行排序。
    * Collections.reverse(list)
* 替换所以的元素(Fill)
    * 使用指定元素替换指定列表中的所有元素。
    * Collections.fill(li,"aaa");
* 拷贝(Copy)
    * 用两个参数，一个目标 List 和一个源 List, 将源的元素拷贝到目标，并覆盖它的内容。目标 List 至少与源一样长。如果它更长，则在目标 List 中的剩余元素不受影响。
    * Collections.copy(list,li): 前面一个参数是目标列表 ,后一个是源列表。

* 返回Collections中最小元素(min)
    * 根据指定比较器产生的顺序，返回给定 collection 的最小元素。collection 中的所有元素都必须是通过指定比较器可相互比较的。
    * Collections.min(list)
* 返回Collections中最小元素(max)
    * 根据指定比较器产生的顺序，返回给定 collection 的最大元素。collection 中的所有元素都必须是通过指定比较器可相互比较的。
    * Collections.max(list)
* lastIndexOfSubList
    * 返回指定源列表中最后一次出现指定目标列表的起始位置
    * int count = Collections.lastIndexOfSubList(list,li);
* IndexOfSubList
    * 返回指定源列表中第一次出现指定目标列表的起始位置
    * int count = Collections.indexOfSubList(list,li);
* Rotate
    * 根据指定的距离循环移动指定列表中的元素
    * Collections.rotate(list,-1);
    * 如果是负数，则正向移动，正数则方向移动

**Arrays**
java.util.Arrays 类是 JDK 提供的一个工具类，用来处理数组的各种方法，而且每个方法基本上都是静态方法，能直接通过类名Arrays调用。
* 转化成List
```java
public static <T> List<T> asList(T... a) {
    return new ArrayList<>(a);
}
```
这个方法返回的 ArrayList 不是我们常用的集合类 java.util.ArrayList。这里的 ArrayList 是 Arrays 的一个内部类 java.util.Arrays.ArrayList
返回的 ArrayList 数组是一个定长列表，我们只能对其进行查看或者修改，但是不能进行添加或者删除操作
返回的列表ArrayList里面的元素都是引用，不是独立出来的对象
```java
private static class ArrayList<E> extends AbstractList<E>
        implements RandomAccess, java.io.Serializable
    {
        private static final long serialVersionUID = -2764017481108945198L;
        private final E[] a;

        ArrayList(E[] array) {
            a = Objects.requireNonNull(array);
        }

        @Override
        public int size() {
            return a.length;
        }

        @Override
        public Object[] toArray() {
            return a.clone();
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T> T[] toArray(T[] a) {
            int size = size();
            if (a.length < size)
                return Arrays.copyOf(this.a, size,
                                     (Class<? extends T[]>) a.getClass());
            System.arraycopy(this.a, 0, a, 0, size);
            if (a.length > size)
                a[size] = null;
            return a;
        }

        @Override
        public E get(int index) {
            return a[index];
        }

        @Override
        public E set(int index, E element) {
            E oldValue = a[index];
            a[index] = element;
            return oldValue;
        }

        @Override
        public int indexOf(Object o) {
            E[] a = this.a;
            if (o == null) {
                for (int i = 0; i < a.length; i++)
                    if (a[i] == null)
                        return i;
            } else {
                for (int i = 0; i < a.length; i++)
                    if (o.equals(a[i]))
                        return i;
            }
            return -1;
        }

        @Override
        public boolean contains(Object o) {
            return indexOf(o) != -1;
        }

        @Override
        public Spliterator<E> spliterator() {
            return Spliterators.spliterator(a, Spliterator.ORDERED);
        }

        @Override
        public void forEach(Consumer<? super E> action) {
            Objects.requireNonNull(action);
            for (E e : a) {
                action.accept(e);
            }
        }

        @Override
        public void replaceAll(UnaryOperator<E> operator) {
            Objects.requireNonNull(operator);
            E[] a = this.a;
            for (int i = 0; i < a.length; i++) {
                a[i] = operator.apply(a[i]);
            }
        }

        @Override
        public void sort(Comparator<? super E> c) {
            Arrays.sort(a, c);
        }
    }
```
* Arrays.asList() 方法使用场景
    * Arrays工具类提供了一个方法asList, 使用该方法可以将一个变长参数或者数组转换成List 。但是，生成的List的长度是固定的；能够进行修改操作（比如，修改某个位置的元素）；不能执行影响长度的操作（如add、remove等操作），否则会抛出UnsupportedOperationException异常。
    * 所以 Arrays.asList 比较适合那些已经有数组数据或者一些元素，而需要快速构建一个List，只用于读取操作，而不进行添加或删除操作的场景。

* 排序 sort 
    * 七种基本类型和引用对象排序(自定义Comparator或者引用对象实现Comparable)
* 查找元素 binarySearch
* 拷贝数组元素 copyOf
    * 底层采用 System.arraycopy() 实现，这是一个native方法。
```java
public static native void arraycopy(Object src,  int  srcPos,
                                        Object dest, int destPos,
                                        int length);
```
* equals
    * equals 用来比较两个数组中对应位置的每个元素是否相等。
* deepEquals
    * 也是用来比较两个数组的元素是否相等，不过 deepEquals 能够进行比较多维数组，而且是任意层次的嵌套数组。

* 给数组赋值fill 
```java
//给a数组所有元素赋值 val
public static void fill(int[] a, int val) {
    for (int i = 0, len = a.length; i < len; i++)
        a[i] = val;
}

//给从 fromIndex 开始的下标，toIndex-1结尾的下标都赋值 val,左闭右开
public static void fill(int[] a, int fromIndex, int toIndex, int val) {
    rangeCheck(a.length, fromIndex, toIndex);//判断范围是否合理
    for (int i = fromIndex; i < toIndex; i++)
        a[i] = val;
}
```
* toString 和 deepToString
    * toString 用来打印一维数组的元素，而 deepToString 用来打印多层次嵌套的数组元素。

**Comparator 和 Comparable 比较**

**Comparable 简介**
Comparable 是排序接口。
若一个类实现了Comparable接口，就意味着“该类支持排序”。  即然实现Comparable接口的类支持排序，假设现在存在“实现Comparable接口的类的对象的List列表(或数组)”，则该List列表(或数组)可以通过 Collections.sort（或 Arrays.sort）进行排序。
此外，“实现Comparable接口的类的对象”可以用作“有序映射(如TreeMap)”中的键或“有序集合(TreeSet)”中的元素，而不需要指定比较器。

Comparable 定义

Comparable 接口仅仅只包括一个函数，它的定义如下：
```java
package java.lang;
import java.util.*;

public interface Comparable<T> {
    public int compareTo(T o);
}
```
说明：
假设我们通过 x.compareTo(y) 来“比较x和y的大小”。若返回“负数”，意味着“x比y小”；返回“零”，意味着“x等于y”；返回“正数”，意味着“x大于y”。

**Comparator 简介**

Comparator 是比较器接口。
我们若需要控制某个类的次序，而该类本身不支持排序(即没有实现Comparable接口)；那么，我们可以建立一个“该类的比较器”来进行排序。这个“比较器”只需要实现Comparator接口即可。
也就是说，我们可以通过“实现Comparator类来新建一个比较器”，然后通过该比较器对类进行排序。

Comparator 定义
Comparator 接口仅仅只包括两个个函数，它的定义如下：

```java
package java.util;

public interface Comparator<T> {

    int compare(T o1, T o2);

    boolean equals(Object obj);
}
```
说明：
(01) 若一个类要实现Comparator接口：它一定要实现compareTo(T o1, T o2) 函数，但可以不实现 equals(Object obj) 函数。
为什么可以不实现 equals(Object obj) 函数呢？ 因为任何类，默认都是已经实现了equals(Object obj)的。 Java中的一切类都是继承于java.lang.Object，在Object.java中实现了equals(Object obj)函数；所以，其它所有的类也相当于都实现了该函数。
(02) int compare(T o1, T o2) 是“比较o1和o2的大小”。返回“负数”，意味着“o1比o2小”；返回“零”，意味着“o1等于o2”；返回“正数”，意味着“o1大于o2”。

* Comparator 和 Comparable 比较
    * Comparable是排序接口；若一个类实现了Comparable接口，就意味着“该类支持排序”。
    * 而Comparator是比较器；我们若需要控制某个类的次序，可以建立一个“该类的比较器”来进行排序。
    * 我们不难发现：Comparable相当于“内部比较器”，而Comparator相当于“外部比较器”。


### 3.2.5. 异常
<a href="#menu" style="float:right">目录</a>

![](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1564945249663&di=9c6ee8dcda7a4b1e21c970cef177ec3f&imgtype=jpg&src=http%3A%2F%2Fimg4.imgtn.bdimg.com%2Fit%2Fu%3D1403341014%2C2801110274%26fm%3D214%26gp%3D0.jpg)

* Error是无法处理的异常，比如OutOfMemoryError，一般发生这种异常，JVM会选择终止程序。因此我们编写程序时不需要关心这类异常。
* Exception，也就是我们经常见到的一些异常情况，比如NullPointerException、IndexOutOfBoundsException，这些异常是我们可以处理的异常。
* Exception类还包含运行异常类Runtime_Exception和非运行异常类Non_RuntimeException这两个直接的子类。

运行异常类对应于编译错误，它是指Java程序在运行时产生的由解释器引发的各种异常。运行异常可能出现在任何地方，且出现频率很高，因此为了避免巨大的系统资源开销，编译器不对异常进行检查。所以Java语言中的运行异常不一定被捕获。出现运行错误往往表示代码有错误，如：算数异常（如被0除）、下标异常（如数组越界）等。

非运行异常时Non_RuntimeException类及其子类的实例，又称为可检测异常。Java编译器利用分析方法或构造方法中可能产生的结果来检测Java程序中是否含有检测异常的处理程序，对于每个可能的可检测异常，方法或构造方法的throws子句必须列出该异常对应的类。在Java的标准包java.lang java.util 和 java.net 中定义的异常都是非运行异常。

* try-catch-finally语句
    * try块：负责捕获异常，一旦try中发现异常，程序的控制权将被移交给catch块中的异常处理程序。
    * try语句块不可以独立存在，必须与 catch 或者 finally 块同存】
    * catch块：如何处理？比如发出警告：提示、检查配置、网络连接，记录错误等。执行完catch块之后程序跳出catch块，继续执行后面的代码。
    * 【编写catch块的注意事项：多个catch块处理的异常类，要按照先catch子类后catch父类的处理方式，因为会【就近处理】异常（由上自下）。】
    * finally：最终执行的代码，用于关闭和释放资源。
```java
try{

}
catch(Exception ex1){

}
catch(Exception ex2){

}
finally{
    
}

```
* **总结：**
    * 不管有木有出现异常或者try和catch中有返回值return，finally块中代码都会执行；
    * finally中最好不要包含return，否则程序会提前退出，返回会覆盖try或catch中保存的返回值。
    * e.printStackTrace()可以输出异常信息。
    * return值为-1为抛出异常的习惯写法。
    * 如果方法中try,catch,finally中没有返回语句，则会调用这三个语句块之外的return结果。
    * finally 在try中的return之后,在返回主调函数之前执行。

* **throw和throws关键字**
throws: 方法声明抛出的异常 
throw： 抛出异常
```java
public void func() throws IOException{
   throw new IOException();
}
```

```java
public class TryCatch {
    public static void main(String[] args) {
        int num = 0;
        try {
             num = 11;
             return;

        } catch (Exception e) {
             num = 22;
             return;
        }
        finally {
             num = 33;
             return;
        }
    }
}

//使用该指令查看编译后的字节码
javap -c TryCatch 

//当finally块中有return时
public class org.TryCatch.TryCatch {
  public org.TryCatch.TryCatch();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
      //try块
       0: iconst_0
       1: istore_1
       2: bipush        11
       4: istore_1
       //如果finally块中有return，则使用goto跳转到finally块
       5: goto          16
       //catch块
       8: astore_2
       9: bipush        22
      11: istore_1
       //如果finally块中有return，则使用goto跳转到finally块
      12: goto          16
      15: pop
      //finally块
      16: bipush        33
      18: istore_1
      //最后在这里返回
      19: return
    Exception table:
       from    to  target type
           2     8     8   Class java/lang/Exception
           2    15    15   any
}
当finally块中不存在return时
public class org.TryCatch.TryCatch {
  public org.TryCatch.TryCatch();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       //try块
       0: iconst_0
       1: istore_1
       2: bipush        11
       4: istore_1
        //复制一份finally块中的代码
       5: bipush        33
       7: istore_1
       //try最后返回
       8: return
       //catch块
       9: astore_2
      10: bipush        22
      //复制一份finally块中的代码
      12: istore_1
      13: bipush        33
      15: istore_1
      //catch最后返回
      16: return
      //finally块
      17: astore_3
      18: bipush        33
      20: istore_1
      21: aload_3
      22: athrow
    Exception table:
       from    to  target type
           2     5     9   Class java/lang/Exception
           2     5    17   any
           9    13    17   any
}

```
1 . 从以上两段字节码可以看出，当finally和try中都存在return语句时，try中指令执行完后会跳转到finally，执行finally块中的指令，最后执行finally块中的return指令，注意这里不会再跳转到try中执行try块中的return指令. 
2 . 当只有try中存在return语句时，try会复制一份finally中的指令到try中执行。 
3 . catch和try的处理相同。

```java

//三个语句块中都不存在return时
public static void main(java.lang.String[]);
    Code:
    //try
       0: iconst_0
       1: istore_1
       2: bipush        11
       4: istore_1
       5: goto          24
       //catch
       8: astore_2
       9: bipush        22
       //复制finally中的语句
      11: istore_1
      12: bipush        33
      14: istore_1
      15: goto          27
      //finally
      18: astore_3
      19: bipush        33
      21: istore_1
      22: aload_3
      23: athrow
      //为什么多这个？？
      24: bipush        33
      26: istore_1
      //自动添加return
      27: return

```
三个语句块中都不存在return时 
1. try中执行完会跳转去执行finally的指令 ，再执行try-catch-finally之后的指令，最后执行return指令结束方法。 
2. 如果出现异常，catch中会复制一份finally的指令，执行完后跳转到27: return结束方法。




### 3.2.6. 注解
<a href="#menu" style="float:right">目录</a>

**概念定义**
* 注解
    * 提供一种为程序元素设置元数据的方法
* 基本原则
    * 注解不能够直接干扰程序代码的运行，无论增加或者删除注解。代码都能够正常运行
* 注解分类
    * 标注注解,没有元素的注解
    * 单值注解
    * 完整注解
* 元数据
    * 就是关于数据的数据
    * 作用
        * 编写文档：通过代码里标识的元数据生成文档
        * 代码分析:通过代码里标识的元数据对代码进行分析
        * 编译检查:通过代码里标识的元数据让编译器能实现基本的编译检查
* 标准注解
    * @Override
        * 保证编译的时候Override函数的声明正确
        * target：METHOD
    * @Deprecated
        * 标识该类或者方法，参数不再推荐使用，相当于过期，仍可以使用，但是不推荐使用
        * target：CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE
    * @SuppressWarnings
        * 关闭特定的警告信息
        * target：TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE
        * 参数
            * deprecation : 使用了过时的类或者方法时的警告  
            * unchecked :  执行了未检查时转换的警告
            * fallthrough :  当Switch程序块直接通往下一种情况而没有Break时的警告
            * path :  在类路径，源文件路径中有不存在的路径时的警告
            * serial  :  当在可序列化的类上缺少serialVersionUID定义时的警告  
            * finally : 任何finally子句不能正常完成时的警告 
            * all :  关于以上所有情况的警告
        * @SuppressWarnings(value={"deprecation"})

* 元注解
    * 负责注解其他注解
    * @Retention
        * 表示需要在什么级别保留该注解信息
        * SOURCE：注解仅保留在源代码中，在编译时被去掉
        * CLASS：保留在类级别，运行时不存在
        * RUNTIME: 保留到运行时
    * @Target
        * CONSTRUCTOR(构造器的声明), FIELD, LOCAL_VARIABLE(局部变量), METHOD, PACKAGE, PARAMETER（参数声明）, TYPE(类，接口)
    * @Documented
        * JavaDOC提取文档时，如果注解上有@Documented，那么被注解的对象（类，方法等）将显示该注解
    * @Inhertied
        * 允许子类继承父类中的注释
    * @Repeatable
        * 支持注解在同一个地方添加多个
        * 参数:Class<? extends Annotation> value();       
```java

//声明支持重复注解
@Repeatable(Persons.class)
public  @interface Person{
	String role() default "";
}
//多次使用
@Person(role="CEO")
@Person(role="husband")
@Person(role="father")
@Person(role="son")
public   class Man {
	String name="";
}

```

* 自定义注解
```java

@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.METHOD, ElementType.TYPE })
public @interface MyAnnotation {

    Integer age();
    //default设置默认值 xx 
    String color() default "xx"; 

    Class[] zlz;
}
//
@MyAnnotation(age=13,color="red",zlz={xx.class,xxx.class})
```

**AnnotatedElement**
* **简介**
    * 这个接口（AnnotatedElement）的对象代表了在当前JVM中的一个“被注解元素”（可以是Class，Method，Field，Constructor，Package等）。在Java语言中，所有实现了这个接口的“元素”都是可以“被注解的元素”。使用这个接口中声明的方法可以读取（通过Java的反射机制）“被注解元素”的注解。这个接口中的所有方法返回的注解都是不可变的、并且都是可序列化的。这个接口中所有方法返回的数组可以被调用者修改，而不会影响其返回给其他调用者的数组。
* **子接口**
    * AnnotatedArrayType （被注解的数组类型）
    * AnnotatedParameterizedType （被注解的参数化类型）
    * AnnotatedType （被注解的类型）
    * AnnotatedTypeVariable （被注解的类型变量）
    * AnnotatedWildcardType （被注解的通配类型）
    * GenericDeclaration （通用声明，用于表示声明型元素，如：类、方法、构造器等）
    * TypeVariable<D> （类型变量）

* **其实现类**
    * AccessibleObject（可访问对象，如：方法、构造器、属性等）
    * Class（类，就是你用Java语言编程时每天都要写的那个东西）
    * Constructor（构造器，类的构造方法的类型）
    * Executable（可执行的，如构造器和方法）
    * Field（属性，类中属性的类型）
    * Method（方法，类中方法的类型）
    * Package（包，你每天都在声明的包的类型）
    * Parameter（参数，主要指方法或函数的参数，其实是这些参数的类型）

以上类型对象都可以通过 AnnotatedElement相关方法获取注解信息
```java
public interface AnnotatedElement {

    default boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {}
    <T extends Annotation> T getAnnotation(Class<T> annotationClass);
    Annotation[] getAnnotations();
    default <T extends Annotation> T[] getAnnotationsByType(Class<T> annotationClass) {}
    default <T extends Annotation> T getDeclaredAnnotation(Class<T> annotationClass) { }
    default <T extends Annotation> T[] getDeclaredAnnotationsByType(Class<T> annotationClass) { }
    Annotation[] getDeclaredAnnotations();
}
```

## 3.3. IO
<a href="#menu" style="float:right">目录</a>

### 3.3.1. File
* File是java.io包下与平台无关的文件和目录操作类。
* File能改新建，删除和重命名文件和目录。
* File不能访问文件内容，访问文件内容使用相关的流操作类。
* 绝对路径: Linux：以根路径开头的路径(/xx/xx),WIN：以磁盘开头的路径(d://,c://)
* 相对路径: 相对当前项目的路径( pic/header)

**常用方法**
```java
//返回由此抽象路径名表示的文件或目录的名称。
public String getName()
//返回此抽象路径名的父路径名的路径名字符串，如果此路径名没有指定父目录，则返回 null。
public String getParent()、
//返回此抽象路径名的父路径名的抽象路径名，如果此路径名没有指定父目录，则返回 null。
public File getParentFile()
//将此抽象路径名转换为一个路径名字符串。
public String getPath()
//测试此抽象路径名是否为绝对路径名。
public boolean isAbsolute()
//返回抽象路径名的绝对路径名字符串。
public String getAbsolutePath()
//测试应用程序是否可以读取此抽象路径名表示的文件。
public boolean canRead()
//测试应用程序是否可以修改此抽象路径名表示的文件。
public boolean canWrite()
//测试此抽象路径名表示的文件或目录是否存在
public boolean exists()
//测试此抽象路径名表示的文件是否是一个目录。
public boolean isDirectory()
//测试此抽象路径名表示的文件是否是一个标准文件。
public boolean isFile()
//返回此抽象路径名表示的文件最后一次被修改的时间。
public long lastModified()
//返回由此抽象路径名表示的文件的长度。
public long length()
//当且仅当不存在具有此抽象路径名指定的名称的文件时，原子地创建由此抽象路径名指定的一个新的空文件。
public boolean createNewFile() throws IOException
// 删除此抽象路径名表示的文件或目录。
public boolean delete()
//在虚拟机终止时，请求删除此抽象路径名表示的文件或目录。
public void deleteOnExit()
//返回由此抽象路径名所表示的目录中的文件和目录的名称所组成字符串数组。
public String[] list()
//返回由包含在目录中的文件和目录的名称所组成的字符串数组，这一目录是通过满足指定过滤器的抽象路径名来表示的。
public String[] list(FilenameFilter filter)
 // 返回一个抽象路径名数组，这些路径名表示此抽象路径名所表示目录中的文件。
public File[] listFiles()
//返回表示此抽象路径名所表示目录中的文件和目录的抽象路径名数组，这些路径名满足特定过滤器。
public File[] listFiles(FileFilter filter)
//创建此抽象路径名指定的目录。
public boolean mkdir()
//创建此抽象路径名指定的目录，包括创建必需但不存在的父目录。
public boolean mkdirs()
 //重新命名此抽象路径名表示的文件。
public boolean renameTo(File dest)
//设置由此抽象路径名所指定的文件或目录的最后一次修改时间。
public boolean setLastModified(long time)
//标记此抽象路径名指定的文件或目录，以便只可对其进行读操作。
public boolean setReadOnly()
//在指定目录中创建一个新的空文件，使用给定的前缀和后缀字符串生成其名称。
public static File createTempFile(String prefix, String suffix, File directory) throws IOException
//在默认临时文件目录中创建一个空文件，使用给定前缀和后缀生成其名称。
public static File createTempFile(String prefix, String suffix) throws IOException
//按字母顺序比较两个抽象路径名。
public int compareTo(File pathname)
//按字母顺序比较抽象路径名与给定对象。
public int compareTo(Object o)
//测试此抽象路径名与给定对象是否相等。
public boolean equals(Object obj)
 //返回此抽象路径名的路径名字符串。
public String toString()
```
**文件过滤器**
```java
public interface FilenameFilter {
    /**
     * Tests if a specified file should be included in a file list.
     *
     * @param   dir    the directory in which the file was found.
     * @param   name   the name of the file.
     * @return  <code>true</code> if and only if the name should be
     * included in the file list; <code>false</code> otherwise.
     */
    boolean accept(File dir, String name);
}
@FunctionalInterface
public interface FileFilter {

    /**
     * Tests whether or not the specified abstract pathname should be
     * included in a pathname list.
     *
     * @param  pathname  The abstract pathname to be tested
     * @return  <code>true</code> if and only if <code>pathname</code>
     *          should be included
     */
    boolean accept(File pathname);
}
//File获取文件列表时添加过滤器
public File[] listFiles(FileFilter filter) ;
public File[] listFiles(FilenameFilter filter)
```
#### 3.3.1.1. IO流

**流的概念和作用**

流是一组有顺序的，有起点和终点的字节集合，是对数据传输的总称或抽象。即数据在两设备间的传输称为流，流的本质是数据传输，根据数据传输特性将流抽象为各种类，方便更直观的进行数据操作。 

**IO流的分类**
根据处理数据类型的不同分为：字符流和字节流
根据数据流向不同分为：输入流和输出流
 
**字符流和字节流**
字符流的由来： 因为数据编码的不同，而有了对字符进行高效操作的流对象。本质其实就是基于字节流读取时，去查了指定的码表。 字节流和字符流的区别：
* 读写单位不同：字节流以字节（8bit）为单位，字符流以字符为单位，根据码表映射字符，一次可能读多个字节。
* 处理对象不同：字节流能处理所有类型的数据（如图片、avi等），而字符流只能处理字符类型的数据。
* 结论：只要是处理纯文本数据，就优先考虑使用字符流。 除此之外都使用字节流。

**输入流和输出流**
对输入流只能进行读操作，对输出流只能进行写操作，程序中需要根据待传输数据的不同特性而使用不同的流。  

**节点流和处理流**
* 节点流
    * 可以从一个特定的IO设备(磁盘，网络)读写数据的流，称为节点流
    * 当使用节点流来进行输入输出时，程序直接连接到实际的数据源，和实际的输入输出节点连接
* 处理流
    * 对一个已存在的流进行连接或封装，通过封装后实现数据的读写
    * 当使用处理流来进行输入输出时，程序并不会直接连接到实际的数据源，没有和实际的输入输出节点连接
    * 只要使用相同的处理流，程序就可以采用完全相同的输入输出代码访问不同的数据源，相当于做了顶层封装，提供公共的访问接口。
    


|分类|字节输入流|字节输出流|字符输入流|字符输出流|
|---|---|---|---|---|
|抽象基类|InputStream|OutputStream|Reader|Writer|
|访问文件|FileInputStream|FileOutoutStream|FileReader|FileWriter|
|访问数组|ByteArrayInputStream|ByteArrayOutputStream|CharArrayReader|CharArrayWriter|
|访问管道|PipedInputStream|PipedOutputStream|PipedReader|PipedWriter|
|访问字符串|||StringReader|StringWriter|
|缓冲流|BufferedInputStream|BufferedOutputStream|BufferedReader|BufferedWriter|
|转换流|||InputStreamReader|OutputStreamWriter|
|对象流|ObjectInputStream|ObjectOutputStream|||
|抽象基类|FilterInputStream|FilterOutputStream|FilterReader|FilterWriter|
|打印流||PrintOutputStream||PrintWriter|
|推回输入流|PushbackInputStream||PushbackOutputStream||
|特殊流|DataInputStream|DataOutputStream|||

**输出追加内容**

append 参数控制，默认是不追加，写入文件时全部覆盖。
```java
public FileOutputStream(String name, boolean append)
        throws FileNotFoundException
{
    this(name != null ? new File(name) : null, append);
}

```
**关闭输出流**
* 不要忘记关闭输出流
* 关闭输出流可以保证物理资源被回
* 还可以将输出流缓冲区中的数据flush到物理节点中
* Java很多输出流默认都提供了缓冲功能

**什么时候使用字节流、什么时候使用字符流，二者的区别**
* 在程序中所有的数据都是以流的方式进行传输或保存的，程序需要数据的时候要使用输入流读取数据，而当程序需要将一些数据保存起来的时候，就要使用输出流完成。
* InputStream 和OutputStream,两个是为字节流设计的,主要用来处理字节或二进制对象,
* Reader和 Writer.两个是为字符流（一个字符占两个字节）设计的,主要用来处理字符或字符串.
 
* 字符流处理的单元为2个字节的Unicode字符，操作字符、字符数组或字符串，
字节流处理单元为1个字节，操作字节和字节数组。
所以字符流是由Java虚拟机将字节转化为2个字节的Unicode字符为单位的字符而成的，
所以它对多国语言支持性比较好！
如果是音频文件、图片、歌曲，就用字节流好点，
如果是关系到中文（文本）的，用字符流好点


* 所有文件的储存是都是字节（byte）的储存，在磁盘上保留的并不是文件的字符而是先把字符编码成字节，再储存这些字节到磁盘。在读取文件（特别是文本文件）时，也是一个字节一个字节地读取以形成字节序列
字节流可用于任何类型的对象，包括二进制对象，而字符流只能处理字符或者字符串；
字节流提供了处理任何类型的IO操作的功能，但它不能直接处理Unicode字符，而字符流就可以
* 字节流是最基本的，所有的InputStrem和OutputStream的子类都是,主要用在处理二进制数据，它是按字节来处理的,但实际中很多的数据是文本，又提出了字符流的概念，它是按虚拟机的encode来处理，也就是要进行字符集的转化 .这两个之间通过 InputStreamReader,OutputStreamWriter来关联，实际上是通过byte[]和String来关联 .在实际开发中出现的汉字问题实际上都是在字符流和字节流之间转化不统一而造成的 


* Reader类的read()方法返回类型为int ：作为整数读取的字符（占两个字节共16位），范围在 0 到 65535 之间 (0x00-0xffff)，如果已到达流的末尾，则返回 -1

* inputStream的read()虽然也返回int，但由于此类是面向字节流的，一个字节占8个位，所以返回 0 到 255 范围内的 int 字节值。如果因为已经到达流末尾而没有可用的字节，则返回值 -1。因此对于不能用0-255来表示的值就得用字符流来读取！比如说汉字.

* 字节流和字符流的主要区别是什么呢？
    * 字节流在操作时不会用到缓冲区（内存），是直接对文件本身进行操作的。而字符流在操作时使用了缓冲区，通过缓冲区再操作文件。
        *  我们知道，如果一个程序频繁对一个资源进行IO操作，效率会非常低。此时，通过缓冲区，先把需要操作的数据暂时放入内存中，以后直接从内存中读取数据，则可以避免多次的IO操作，提高效率
    * 在硬盘上的所有文件都是以字节形式存在的（图片，声音，视频），而字符值在内存中才会形成。
        * 真正存储和传输数据时都是以字节为单位的，字符只是存在与内存当中的，所以，字节流适用范围更为宽广

**缓冲流**
BufferedInputStream和BufferedOutputStream这两个类分别是FilterInputStream和FilterOutputStream的子类，作为装饰器子类，使用它们可以防止每次读取/发送数据时进行实际的写操作，代表着使用缓冲区。

我们有必要知道不带缓冲的操作，每读一个字节就要写入一个字节，由于涉及磁盘的IO操作相比内存的操作要慢很多，所以不带缓冲的流效率很低。带缓冲的流，可以一次读很多字节，但不向磁盘中写入，只是先放到内存里。等凑够了缓冲区大小的时候一次性写入磁盘，这种方式可以减少磁盘操作次数，速度就会提高很多！

同时正因为它们实现了缓冲功能，所以要注意在使用BufferedOutputStream写完数据后，要调用flush()方法或close()方法，强行将缓冲区中的数据写出。否则可能无法写出数据。与之相似还BufferedReader和BufferedWriter两个类。

**RandomAccessFile**
* 除了常规的读写功能，还支持任意位置读写内容
* long getFilePointer(); 返回文件记录指针的当前位置
* void seek(long pos); 将文件指针定位到pos 
* 支持读和写
    * RandomAccessFile(String name, String mode)
    * mode : 
        * r :以只读方式打开文件 
        * rw : 以读写方式打开文件
        * rws : 除了rw,还要求对文件的内容或者元数据的每个更新都同步写入到底层存储设备
        * rwd : 除了rw,还要求对文件内容的每个更新都同步写入到底层的存储设备。
* 如果seek 定位后写入内容，将会覆盖后续内容，如果需要实现插入写，需要先读出后面的内容，写入之后再追加写入读出的内容。
  
#### 3.3.1.2. 序列化
* 序列化
    * 将对象转化为二进制字节数组，以方便存储到磁盘或者进行网络传输
* 反序列化
    * 将二进制字节数组转化为对象

* 需要序列化的对象必须实现Serializable接口
* transient 修饰的属性不会被序列化
* 引用类型的属性只有也实现Serializable接口才会被序列化
* 自定义序列化属性,对象类加入以下方法
    * private void writeObject（ObjectOutputStream out） throws IOException;
        * out.writeInt(this.name);
    * private void readObject（ObjectInputStream in throws IOException;
        * this.name = in.readInt();
    * private void readObjectNoData（ObjectInputStream in throws IOException;
        * 当序列化版本不一致，流被更改等情况，掉用该方法提供默认值。
    * 属性读写顺序必须一致，否则会出现问题
* serialVersionUID
    * 对象的序列化版本ID，可设置任何值
    * 如果不显示指定，JVM将根据类的相关信息进行修改，修改后的类的计算结果可能和之前的不一样，就会导致序列化失败，因此显示指定版本ID，并根据以下情况决定当类信息修改时是否更新序列化ID
        * 仅仅修改了方法，不会影响反序列化
        * 修改了类静态属性或瞬态属性，不会影响反序列化
        * 如果修改了**非类静态属性或瞬态属性**,如果新增属性，不会影响，如果修改之前的属性，将会影响，反序列化时将会失败，应当修改serialVersionUID。
    * 如果序列化版本ID和当前类中的ID不一样，那么序列化将会失败

* 注意点
    * 对象的类名，属性（包括基本类型，数组，对其他对象的引用）都会被序列化，static,transient属性不会被序列化
    * 反序列化时该JVM必须有该类类文件，否则将抛出异常
    


**方式1:实现Serializable**


```java
public class Person implements  Serializable{
    
}
```

**方式2:实现Externalizable**

强制自定义序列化方式，需要程序员决定需要序列化哪些属性

```java
public class Person implements  Externalizable{

    private String name = null;

    transient private Integer age = null;

    private Gender gender = null;

    public Person() {
        System.out.println("none-arg constructor");
    }

    public Person(String name, Integer age, Gender gender) {
        System.out.println("arg constructor");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //自定义
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //自定义
    }
    
}
```
**序列化操作**
```java
Person person = new Person();
FileOutputStream fs = new FileOutputStream("foo.ser");  
ObjectOutputStream os =  new ObjectOutputStream(fs);  
os.writeObject(person);  

```

### 3.3.2. NIO

#### 3.3.2.1. 内存映射  

内存映射的方式是指操作系统将内存中的某一块区域与磁盘中的文件相关联，当访问内存中的一段数据时，转换为访问文件的某一段数据。这种方式的目的同样是减少数据从内核空间缓存到用户空间缓存的数据复制操作，因为这两个空间的数据是共享的。


![内存映射方式](https://github.com/lgjlife/Java-Study/blob/master/pic/java/nio-storage-mapping.png?raw=true)


Java类库中的NIO包相对于IO 包来说有一个新功能是内存映射文件，日常编程中并不是经常用到，但是在处理大文件时是比较理想的提高效率的手段。本文我主要想结合操作系统中（OS）相关方面的知识介绍一下原理。

在传统的文件IO操作中，我们都是调用操作系统提供的底层标准IO系统调用函数  read()、write() ，此时调用此函数的进程（在JAVA中即java进程）由当前的用户态切换到内核态，然后OS的内核代码负责将相应的文件数据读取到内核的IO缓冲区，然后再把数据从内核IO缓冲区拷贝到进程的私有地址空间中去，这样便完成了一次IO操作。至于为什么要多此一举搞一个内核IO缓冲区把原本只需一次拷贝数据的事情搞成需要2次数据拷贝呢？ 我想学过操作系统或者计算机系统结构的人都知道，这么做是为了减少磁盘的IO操作，为了提高性能而考虑的，因为我们的程序访问一般都带有局部性，也就是所谓的局部性原理，在这里主要是指的空间局部性，即我们访问了文件的某一段数据，那么接下去很可能还会访问接下去的一段数据，由于磁盘IO操作的速度比直接访问内存慢了好几个数量级，所以OS根据局部性原理会在一次 read()系统调用过程中预读更多的文件数据缓存在内核IO缓冲区中，当继续访问的文件数据在缓冲区中时便直接拷贝数据到进程私有空间，避免了再次的低效率磁盘IO操作。在JAVA中当我们采用IO包下的文件操作流，如：

```JAVA
FileInputStream in = new FileInputStream("D:\\java.txt");  
in.read();
```

JAVA虚拟机内部便会调用OS底层的 read()系统调用完成操作，如上所述，在第二次调用 in.read()的时候可能就是从内核缓冲区直接返回数据了（可能还有经过 native堆做一次中转，因为这些函数都被声明为 native，即本地平台相关，所以可能在C代码中有做一次中转，如 win32中是通过 C代码从OS读取数据，然后再传给JVM内存）。既然如此，JAVA的IO包中为啥还要提供一个 BufferedInputStream 类来作为缓冲区呢。关键在于四个字，"系统调用"！当读取OS内核缓冲区数据的时候，便发起了一次系统调用操作（通过native的C函数调用），而系统调用的代价相对来说是比较高的，涉及到进程用户态和内核态的上下文切换等一系列操作，所以我们经常采用如下的包装：

```JAVA
FileInputStream in = new FileInputStream("D:\\java.txt"); 
BufferedInputStream buf_in = new BufferedInputStream(in); 
buf_in.read();
```

这样一来，我们每一次 buf_in.read() 时候，BufferedInputStream 会根据情况自动为我们预读更多的字节数据到它自己维护的一个内部字节数组缓冲区中，这样我们便可以减少系统调用次数，从而达到其缓冲区的目的。所以要明确的一点是 BufferedInputStream 的作用不是减少 磁盘IO操作次数（这个OS已经帮我们做了），而是通过减少系统调用次数来提高性能的。同理 BufferedOuputStream , BufferedReader/Writer 也是一样的。在 C语言的函数库中也有类似的实现，如 fread()，这个函数就是 C语言中的缓冲IO，作用与BufferedInputStream()相同.

    这里简单的引用下JDK6 中 BufferedInputStream 的源码验证下：

```JAVA
 1 public  
 2 class BufferedInputStream extends FilterInputStream {  
 3   
 4     private static int defaultBufferSize = 8192;  
 5   
 6     /** 
 7      * The internal buffer array where the data is stored. When necessary, 
 8      * it may be replaced by another array of 
 9      * a different size. 
10      */  
11     protected volatile byte buf[];  
12   /** 
13      * The index one greater than the index of the last valid byte in  
14      * the buffer.  
15      * This value is always 
16      * in the range <code>0</code> through <code>buf.length</code>; 
17      * elements <code>buf[0]</code>  through <code>buf[count-1] 
18      * </code>contain buffered input data obtained 
19      * from the underlying  input stream. 
20      */  
21     protected int count;  
22   
23     /** 
24      * The current position in the buffer. This is the index of the next  
25      * character to be read from the <code>buf</code> array.  
26      * <p> 
27      * This value is always in the range <code>0</code> 
28      * through <code>count</code>. If it is less 
29      * than <code>count</code>, then  <code>buf[pos]</code> 
30      * is the next byte to be supplied as input; 
31      * if it is equal to <code>count</code>, then 
32      * the  next <code>read</code> or <code>skip</code> 
33      * operation will require more bytes to be 
34      * read from the contained  input stream. 
35      * 
36      * @see     java.io.BufferedInputStream#buf 
37      */  
38     protected int pos;  
39   
40  /* 这里省略去 N 多代码 ------>>  */  
41   
42   /** 
43      * See 
44      * the general contract of the <code>read</code> 
45      * method of <code>InputStream</code>. 
46      * 
47      * @return     the next byte of data, or <code>-1</code> if the end of the 
48      *             stream is reached. 
49      * @exception  IOException  if this input stream has been closed by 
50      *              invoking its {@link #close()} method, 
51      *              or an I/O error occurs.  
52      * @see        java.io.FilterInputStream#in 
53      */  
54     public synchronized int read() throws IOException {  
55     if (pos >= count) {  
56         fill();  
57         if (pos >= count)  
58         return -1;  
59     }  
60     return getBufIfOpen()[pos++] & 0xff;  
61     } 
```
 我们可以看到，BufferedInputStream 内部维护着一个 字节数组 byte[] buf 来实现缓冲区的功能，我们调用的  buf_in.read() 方法在返回数据之前有做一个 if 判断，如果 buf 数组的当前索引不在有效的索引范围之内，即 if 条件成立， buf 字段维护的缓冲区已经不够了，这时候会调用 内部的 fill() 方法进行填充，而fill()会预读更多的数据到 buf 数组缓冲区中去，然后再返回当前字节数据，如果 if 条件不成立便直接从 buf缓冲区数组返回数据了。其中getBufIfOpen()返回的就是 buf字段的引用。顺便说下，源码中的 buf 字段声明为  protected volatile byte buf[];  主要是为了通过 volatile 关键字保证 buf数组在多线程并发环境中的内存可见性.

和 Java NIO 的内存映射无关的部分说了这么多篇幅，主要是为了做个铺垫，这样才能建立起一个知识体系，以便更好的理解内存映射文件的优点。

内存映射文件和之前说的 标准IO操作最大的不同之处就在于它虽然最终也是要从磁盘读取数据，但是它并不需要将数据读取到OS内核缓冲区，而是直接将进程的用户私有地址空间中的一部分区域与文件对象建立起映射关系，就好像直接从内存中读、写文件一样，速度当然快了。为了说清楚这个，我们以 Linux操作系统为例子，看下图：
![](https://images2015.cnblogs.com/blog/1025117/201703/1025117-20170317110759276-1661554576.jpg)
    

 此图为 Linux 2.X 中的进程虚拟存储器，即进程的虚拟地址空间，如果你的机子是 32 位，那么就有  2^32 = 4G的虚拟地址空间，我们可以看到图中有一块区域： “Memory mapped region for shared libraries” ，这段区域就是在内存映射文件的时候将某一段的虚拟地址和文件对象的某一部分建立起映射关系，此时并没有拷贝数据到内存中去，而是当进程代码第一次引用这段代码内的虚拟地址时，触发了缺页异常，这时候OS根据映射关系直接将文件的相关部分数据拷贝到进程的用户私有空间中去，当有操作第N页数据的时候重复这样的OS页面调度程序操作。注意啦，原来内存映射文件的效率比标准IO高的重要原因就是因为少了把数据拷贝到OS内核缓冲区这一步（可能还少了native堆中转这一步）。

java中提供了3种内存映射模式，即：只读(readonly)、读写(read_write)、专用(private) ，对于  只读模式来说，如果程序试图进行写操作，则会抛出ReadOnlyBufferException异常；第二种的读写模式表明了通过内存映射文件的方式写或修改文件内容的话是会立刻反映到磁盘文件中去的，别的进程如果共享了同一个映射文件，那么也会立即看到变化！而不是像标准IO那样每个进程有各自的内核缓冲区，比如JAVA代码中，没有执行 IO输出流的 flush() 或者  close() 操作，那么对文件的修改不会更新到磁盘去，除非进程运行结束；最后一种专用模式采用的是OS的“写时拷贝”原则，即在没有发生写操作的情况下，多个进程之间都是共享文件的同一块物理内存（进程各自的虚拟地址指向同一片物理地址），一旦某个进程进行写操作，那么将会把受影响的文件数据单独拷贝一份到进程的私有缓冲区中，不会反映到物理文件中去。

 

在JAVA NIO中可以很容易的创建一块内存映射区域，代码如下：
```JAVA
1 File file = new File("E:\\download\\office2007pro.chs.ISO");  
2 FileInputStream in = new FileInputStream(file);  
3 FileChannel channel = in.getChannel();  
4 MappedByteBuffer buff = channel.map(FileChannel.MapMode.READ_ONLY, 0,channel.size());
```

这里创建了一个只读模式的内存映射文件区域，接下来我就来测试下与普通NIO中的通道操作相比性能上的优势，先看如下代码：

```JAVA
 1 public class IOTest {  
 2     static final int BUFFER_SIZE = 1024;  
 3   
 4     public static void main(String[] args) throws Exception {  
 5   
 6         File file = new File("F:\\aa.pdf");  
 7         FileInputStream in = new FileInputStream(file);  
 8         FileChannel channel = in.getChannel();  
 9         MappedByteBuffer buff = channel.map(FileChannel.MapMode.READ_ONLY, 0,  
10                 channel.size());  
11   
12         byte[] b = new byte[1024];  
13         int len = (int) file.length();  
14   
15         long begin = System.currentTimeMillis();  
16   
17         for (int offset = 0; offset < len; offset += 1024) {  
18   
19             if (len - offset > BUFFER_SIZE) {  
20                 buff.get(b);  
21             } else {  
22                 buff.get(new byte[len - offset]);  
23             }  
24         }  
25   
26         long end = System.currentTimeMillis();  
27         System.out.println("time is:" + (end - begin));  
28   
29     }  
30 } 
```

输出为 63，即通过内存映射文件的方式读取 86M多的文件只需要78毫秒，我现在改为普通NIO的通道操作看下：

```JAVA
 1 File file = new File("F:\\liq.pdf");  
 2 FileInputStream in = new FileInputStream(file);  
 3 FileChannel channel = in.getChannel();  
 4 ByteBuffer buff = ByteBuffer.allocate(1024);   
 5   
 6 long begin = System.currentTimeMillis();  
 7 while (channel.read(buff) != -1) {  
 8     buff.flip();  
 9     buff.clear();  
10 }  
11 long end = System.currentTimeMillis();  
12 System.out.println("time is:" + (end - begin));  
```

输出为 468毫秒，几乎是 6 倍的差距，文件越大，差距便越大。所以内存映射文件特别适合于对大文件的操作，JAVA中的限制是最大不得超过 Integer.MAX_VALUE，即2G左右，不过我们可以通过分次映射文件(channel.map)的不同部分来达到操作整个文件的目的。

按照jdk文档的官方说法，内存映射文件属于JVM中的直接缓冲区，还可以通过 ByteBuffer.allocateDirect() ，即DirectMemory的方式来创建直接缓冲区。他们相比基础的 IO操作来说就是少了中间缓冲区的数据拷贝开销。同时他们属于JVM堆外内存，不受JVM堆内存大小的限制。

 

其中 DirectMemory 默认的大小是等同于JVM最大堆，理论上说受限于 进程的虚拟地址空间大小，比如 32位的windows上，每个进程有4G的虚拟空间除去 2G为OS内核保留外，再减去 JVM堆的最大值，剩余的才是DirectMemory大小。通过 设置 JVM参数 -Xmx64M，即JVM最大堆为64M，然后执行以下程序可以证明DirectMemory不受JVM堆大小控制：

```JAVA
1 public static void main(String[] args) {       
2     ByteBuffer.allocateDirect(1024*1024*100); // 100MB  
3 } 
``` 
我们设置了JVM堆 64M限制，然后在 直接内存上分配了 100MB空间，程序执行后直接报错：Exception in thread "main" java.lang.OutOfMemoryError: Direct buffer memory。接着我设置 -Xmx200M，程序正常结束。然后我修改配置： -Xmx64M  -XX:MaxDirectMemorySize=200M，程序正常结束。因此得出结论： 直接内存DirectMemory的大小默认为 -Xmx 的JVM堆的最大值，但是并不受其限制，而是由JVM参数 MaxDirectMemorySize单独控制。接下来我们来证明直接内存不是分配在JVM堆中。我们先执行以下程序，并设置 JVM参数 -XX:+PrintGC，

```JAVA
1 public static void main(String[] args) {         
2  for(int i=0;i<20000;i++) {  
3            ByteBuffer.allocateDirect(1024*100);  //100K  
4       }  
5   } 
```

```
[GC 1371K->1328K(61312K), 0.0070033 secs]
[Full GC 1328K->1297K(61312K), 0.0329592 secs]
[GC 3029K->2481K(61312K), 0.0037401 secs]
[Full GC 2481K->2435K(61312K), 0.0102255 secs]
```
   我们看到这里执行 GC的次数较少，但是触发了 两次 Full GC，原因在于直接内存不受 GC(新生代的Minor GC)影响，只有当执行老年代的 Full GC时候才会顺便回收直接内存！而直接内存是通过存储在JVM堆中的DirectByteBuffer对象来引用的，所以当众多的DirectByteBuffer对象从新生代被送入老年代后才触发了 full gc。

 再看直接在JVM堆上分配内存区域的情况：
```JAVA
1 public static void main(String[] args) {         
2     for(int i=0;i<10000;i++) {  
3           ByteBuffer.allocate(1024*100);  //100K  
4     }
5 }  
```

ByteBuffer.allocate 意味着直接在 JVM堆上分配内存，所以受 新生代的 Minor GC影响，输出如下：

```
[GC 16023K->224K(61312K), 0.0012432 secs]
[GC 16211K->192K(77376K), 0.0006917 secs]
[GC 32242K->176K(77376K), 0.0010613 secs]
[GC 32225K->224K(109504K), 0.0005539 secs]
[GC 64423K->192K(109504K), 0.0006151 secs]
[GC 64376K->192K(171392K), 0.0004968 secs]
[GC 128646K->204K(171392K), 0.0007423 secs]
[GC 128646K->204K(299968K), 0.0002067 secs]
[GC 257190K->204K(299968K), 0.0003862 secs]
[GC 257193K->204K(287680K), 0.0001718 secs]
[GC 245103K->204K(276480K), 0.0001994 secs]
[GC 233662K->204K(265344K), 0.0001828 secs]
[GC 222782K->172K(255232K), 0.0001998 secs]
[GC 212374K->172K(245120K), 0.0002217 secs]
```

可以看到，由于直接在 JVM堆上分配内存，所以触发了多次GC，且不会触及  Full GC，因为对象根本没机会进入老年代。


我想提个疑问，NIO中的DirectMemory和内存文件映射同属于直接缓冲区，但是前者和 -Xmx和-XX:MaxDirectMemorySize有关，而后者完全没有JVM参数可以影响和控制，这让我不禁怀疑两者的直接缓冲区是否相同，前者指的是 JAVA进程中的 native堆，即涉及底层平台如 win32的dll 部分，因为 C语言中的 malloc()分配的内存就属于 native堆，不属于 JVM堆，这也是DirectMemory能在一些场景中显著提高性能的原因，因为它避免了在 native堆和jvm堆之间数据的来回复制；而后者则是没有经过 native堆，是由 JAVA进程直接建立起 某一段虚拟地址空间和文件对象的关联映射关系，参见 Linux虚拟存储器图中的 “Memory mapped region for shared libraries”  区域，所以内存映射文件的区域并不在JVM GC的回收范围内，因为它本身就不属于堆区，卸载这部分区域只能通过系统调用 unmap()来实现 (Linux)中，而 JAVA API 只提供了 FileChannel.map 的形式创建内存映射区域，却没有提供对应的 unmap()，让人十分费解，导致要卸载这部分区域比较麻烦。

最后再试试通过 DirectMemory来操作前面 内存映射和基本通道操作的例子，来看看直接内存操作的话，程序的性能如何：

```JAVA
 1 File file = new File("F:\\liq.pdf");  
 2 FileInputStream in = new FileInputStream(file);  
 3 FileChannel channel = in.getChannel();  
 4 ByteBuffer buff = ByteBuffer.allocateDirect(1024);   
 5   
 6 long begin = System.currentTimeMillis();  
 7 while (channel.read(buff) != -1) {  
 8     buff.flip();  
 9     buff.clear();  
10 }  
11 long end = System.currentTimeMillis();  
12 System.out.println("time is:" + (end - begin));
```

程序输出为 312毫秒，看来比普通的NIO通道操作（468毫秒）来的快，但是比 mmap 内存映射的 63秒差距太多了，我想应该不至于吧，通过修改;ByteBuffer buff = ByteBuffer.allocateDirect(1024);  为 ByteBuffer buff = ByteBuffer.allocateDirect((int)file.length())，即一次性分配整个文件长度大小的堆外内存，最终输出为 78毫秒，由此可以得出两个结论：
1.堆外内存的分配耗时比较大.   
2.还是比mmap内存映射来得慢，都不要说通过mmap读取数据的时候还涉及缺页异常、页面调度的系统调用了，看来内存映射文件确实NB啊，这还只是 86M的文件，如果上 G 的大小呢？

最后一点为 DirectMemory的内存只有在 JVM执行 full gc 的时候才会被回收，那么如果在其上分配过大的内存空间，那么也将出现 OutofMemoryError，即便 JVM 堆中的很多内存处于空闲状态。


## 3.4. Javac编译原理
<a href="#menu" style="float:right">目录</a>

* Javac是一种编译器，将Java源码编译成Java字节码。.Java文件转化成。class文件。
* 经过以下流程
    * 词法分析器
        * 将Java源文件的字符流 转变成对应的Token流
    * 语法分析器
        * 将Token流组建成更加结构化的语法树
    * 语义分析器
### 3.4.1. Javac编译器的基本结构
<a href="#menu" style="float:right">目录</a>

### 3.4.2. Javac的工作原理分析
<a href="#menu" style="float:right">目录</a>


## 3.5. 类加载和反射
<a href="#menu" style="float:right">目录</a>

### 3.5.1. Class文件结构
<a href="#menu" style="float:right">目录</a>

#### 3.5.1.1. JVM指令集简介
<a href="#menu" style="float:right">目录</a>

#### 3.5.1.2. class文件头的表示形式
<a href="#menu" style="float:right">目录</a>

#### 3.5.1.3. 常量池
<a href="#menu" style="float:right">目录</a>


#### 3.5.1.4. 类信息
<a href="#menu" style="float:right">目录</a>

#### 3.5.1.5. Fields和Method定义
<a href="#menu" style="float:right">目录</a>

#### 3.5.1.6. 类属性描述
<a href="#menu" style="float:right">目录</a>

#### 3.5.1.7. Javap生成的class文件结构
<a href="#menu" style="float:right">目录</a>

javap用法

```bash
lgj@lgj-Lenovo-G470:~/aProject/aRealPrj/Java-Interview$ javap --help
Usage: javap <options> <classes>
where possible options include:
  -help  --help  -?        Print this usage message
  -version                 Version information
  -v  -verbose             Print additional information
  -l                       Print line number and local variable tables
  -public                  Show only public classes and members
  -protected               Show protected/public classes and members
  -package                 Show package/protected/public classes
                           and members (default)
  -p  -private             Show all classes and members
  -c                       Disassemble the code
  -s                       Print internal type signatures
  -sysinfo                 Show system info (path, size, date, MD5 hash)
                           of class being processed
  -constants               Show final constants
  -classpath <path>        Specify where to find user class files
  -cp <path>               Specify where to find user class files
  -bootclasspath <path>    Override location of bootstrap class files

```

源代码
```java
package com.code.base.javap;

public class JavapTest {

    private  String name;

    private  Integer age;


    public Integer func1(){

        int aaa;

        int bbb = 123;

        try{
            System.out.println("func1");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            System.out.println("finally");
        }

        return 12;

    }


    public void func2(){
        System.out.println("func2");
    }


    public static void   func3(){
        System.out.println("func3");
    }
}


```
javap -c 
类文件
```
Compiled from "JavapTest.java"
public class com.code.base.javap.JavapTest {
  public com.code.base.javap.JavapTest();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: sipush        456
       8: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      11: putfield      #3                  // Field age:Ljava/lang/Integer;
      14: return

  public java.lang.Integer func1();
    Code:
       0: bipush        123
       2: istore_2
       3: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
       6: ldc           #5                  // String func1
       8: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      11: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
      14: ldc           #7                  // String finally
      16: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      19: goto          51
      22: astore_3
      23: aload_3
      24: invokevirtual #9                  // Method java/lang/Exception.printStackTrace:()V
      27: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
      30: ldc           #7                  // String finally
      32: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      35: goto          51
      38: astore        4
      40: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
      43: ldc           #7                  // String finally
      45: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      48: aload         4
      50: athrow
      51: bipush        12
      53: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      56: areturn
    Exception table:
       from    to  target type
           3    11    22   Class java/lang/Exception
           3    11    38   any
          22    27    38   any
          38    40    38   any

  public void func2();
    Code:
       0: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #10                 // String func2
       5: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return

  public static void func3();
    Code:
       0: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #11                 // String func3
       5: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return
}


```


### 3.5.2. 类加载器
<a href="#menu" style="float:right">目录</a>

#### 3.5.2.1. 基本概念
<a href="#menu" style="float:right">目录</a>

类加载器是负责将可能是网络上、也可能是磁盘上的class文件加载到内存中。并为其生成对应的java.lang.class对象。一旦一个类被载入JVM了，同一个类就不会被再次加载。那么怎样才算是同一个类？在JAVA中一个类用其全限定类名（包名和类名）作为其唯一标识，但是在JVM中，一个类用其全限定类名和其类加载器作为其唯一标识。也就是说，在JAVA中的同一个类，如果用不同的类加载器加载，则生成的class对象认为是不同的。

**JAVA类装载方式**
* 隐式加载
    * 不通过在代码里调用ClassLoader来加载需要的类。而是通过JVM来自动加载需要的类到内存的方式
    * 例如，当我们在类中继承或者引用某个类时，JVM在解析当前这个类时发现引用的类不存在，那么就会自动将这些类加载到内存中。
* 显示加载
    * 显示调用ClassLoader的相关方法加载类

**类加载的动态性体现:**
一个应用程序总是由n多个类组成，Java程序启动时，并不是一次把所有的类全部加载后再运行，它总是先把保证程序运行的基础类一次性加载到jvm中，其它类等到jvm用到的时候再加载，这样的好处是节省了内存的开销，因为java最早就是为嵌入式系统而设计的，内存宝贵，这是一种可以理解的机制，而用到时再加载这也是java动态性的一种体现


#### 3.5.2.2. 常见的类加载器
<a href="#menu" style="float:right">目录</a>

* JDK 默认提供了如下几种ClassLoader
    * Bootstrp loader
        * Bootstrp加载器是用C++语言写的，它是在Java虚拟机启动后初始化的，它主要负责加载%JAVA_HOME%/jre/lib,-Xbootclasspath参数指定的路径以及%JAVA_HOME%/jre/classes中的类。
    * ExtClassLoader  
        * Bootstrp loader加载ExtClassLoader,并且将ExtClassLoader的父加载器设置为Bootstrp loader.ExtClassLoader是用Java写的，具体来说就是 sun.misc.Launcher$ExtClassLoader，ExtClassLoader主要加载%JAVA_HOME%/jre/lib/ext，此路径下的所有classes目录以及java.ext.dirs系统变量指定的路径中类库。
        * ExtClassLoader的父类不是Bootstrp loader
    * AppClassLoader 
        * Bootstrp loader加载完ExtClassLoader后，就会加载AppClassLoader,并且将AppClassLoader的父加载器指定为 ExtClassLoader。AppClassLoader也是用Java写成的，它的实现类是 sun.misc.Launcher$AppClassLoader，另外我们知道ClassLoader中有个getSystemClassLoader方法,此方法返回的正是AppclassLoader.AppClassLoader主要负责加载classpath所指定的位置的类或者是jar文档，它也是Java程序默认的类加载器。

![java类装载器](http://static.oschina.net/uploads/img/201405/09113619_cx03.png)

* 为什么要有三个类加载器
    * 一方面是分工，各自负责各自的区块，另一方面为了实现委托模型。

 类加载器之间是如何协调工作的

前面说了，java中有三个类加载器，问题就来了，碰到一个类需要加载时，它们之间是如何协调工作的，即java是如何区分一个类该由哪个类加载器来完成呢。 在这里java采用了委托模型机制，这个机制简单来讲，就是“类装载器有载入类的需求时，会先请示其Parent使用其搜索路径帮忙载入，如果Parent 找不到,那么才由自己依照自己的搜索路径搜索类”

下面举一个例子来说明，为了更好的理解，先弄清楚几行代码：

```Java
Public class Test{
 
    Public static void main(String[] arg){
 
      ClassLoader c  = Test.class.getClassLoader();  //获取Test类的类加载器
 
        System.out.println(c); 
 
      ClassLoader c1 = c.getParent();  //获取c这个类加载器的父类加载器
 
        System.out.println(c1);
 
      ClassLoader c2 = c1.getParent();//获取c1这个类加载器的父类加载器
 
        System.out.println(c2);
 
  }
 
}
```
运行结果：
```
……AppClassLoader……
 
……ExtClassLoader……
Null
``` 
可以看出Test是由AppClassLoader加载器加载的，AppClassLoader的Parent 加载器是 ExtClassLoader,但是ExtClassLoader的Parent为 null 是怎么回事呵，朋友们留意的话，前面有提到Bootstrap Loader是用C++语言写的，依java的观点来看，逻辑上并不存在Bootstrap Loader的类实体，所以在java程序代码里试图打印出其内容时，我们就会看到输出为null。


#### 3.5.2.3. 类加载过程
<a href="#menu" style="float:right">目录</a>

类装载器就是寻找类或接口字节码文件进行解析并构造JVM内部对象表示的组件，在java中类装载器把一个类装入JVM，经过以下步骤：
* 装载：查找和导入Class文件 
* 链接：其中解析步骤是可以选择的 
    * 检查：检查载入的class文件数据的正确性 
    * 准备：给类的静态变量分配存储空间 
    * 解析：将符号引用转成直接引用 
* 初始化：对静态变量，静态代码块执行初始化工作

类装载工作由ClassLoder和其子类负责。JVM在运行时会产生三个ClassLoader：根装载器，ExtClassLoader(扩展类装载器)和AppClassLoader，其中根装载器不是ClassLoader的子类，由C++编写，因此在java中看不到他，负责装载JRE的核心类库，如JRE目录下的rt.jar,charsets.jar等。ExtClassLoader是ClassLoder的子类，负责装载JRE扩展目录ext下的jar类包；AppClassLoader负责装载classpath路径下的类包，这三个类装载器存在父子层级关系****，即根装载器是ExtClassLoader的父装载器，ExtClassLoader是AppClassLoader的父装载器。默认情况下使用AppClassLoader装载应用程序的类

#### 3.5.2.4. 全盘委托机制
<a href="#menu" style="float:right">目录</a>

Java装载类使用“全盘负责委托机制”。“全盘负责”是指当一个ClassLoder装载一个类时，除非显示的使用另外一个ClassLoder，该类所依赖及引用的类也由这个ClassLoder载入；“委托机制”是指先委托父类装载器寻找目标类，只有在找不到的情况下才从自己的类路径中查找并装载目标类。这一点是从安全方面考虑的，试想如果一个人写了一个恶意的基础类（如java.lang.String）并加载到JVM将会引起严重的后果，但有了全盘负责制，java.lang.String永远是由根装载器来装载，避免以上情况发生 除了JVM默认的三个ClassLoder以外，第三方可以编写自己的类装载器，以实现一些特殊的需求。类文件被装载解析后，在JVM中都有一个对应的java.lang.Class对象，提供了类结构信息的描述。数组，枚举及基本数据类型，甚至void都拥有对应的Class对象。Class类没有public的构造方法，Class对象是在装载类时由JVM通过调用类装载器中的defineClass()方法自动构造的。

**为什么要使用这种双亲委托模式呢？**
因为这样可以避免重复加载，当父亲已经加载了该类的时候，就没有必要子ClassLoader再加载一次。
考虑到安全因素，我们试想一下，如果不使用这种委托模式，那我们就可以随时使用自定义的String来动态替代java核心api中定义类型，这样会存在非常大的安全隐患，而双亲委托的方式，就可以避免这种情况，因为String已经在启动时被加载，所以用户自定义类是无法加载一个自定义的ClassLoader。

**思考：假如我们自己写了一个java.lang.String的类，我们是否可以替换调JDK本身的类？**
答案是否定的。我们不能实现。为什么呢？我看很多网上解释是说双亲委托机制解决这个问题，其实不是非常的准确。因为双亲委托机制是可以打破的，你完全可以自己写一个classLoader来加载自己写的java.lang.String类，但是你会发现也不会加载成功，具体就是因为针对java.*开头的类，jvm的实现中已经保证了必须由bootstrp来加载。

#### 3.5.2.5. 定义自已的ClassLoader
<a href="#menu" style="float:right">目录</a>

* 有以下几个情景是值得我们花费时间实现自己的classLoader的:
    * 我们需要的类不一定存放在已经设置好的classPath下(有系统类加载器AppClassLoader加载的路径)，对于自定义路径中的class类文件的加载，我们需要自己的ClassLoader
    * 有时我们不一定是从类文件中读取类，可能是从网络的输入流中读取类，这就需要做一些加密和解密操作，这就需要自己实现加载类的逻辑，当然其他的特殊处理也同样适用。
    * 可以定义类的实现机制，实现类的热部署,如OSGi中的bundle模块就是通过实现自己的ClassLoader实现的。
 
* 定义自已的类加载器分为两步：
    * 继承java.lang.ClassLoader
    * 重写父类的findClass方法
 
父类有那么多方法，为什么偏偏只重写findClass方法？
```java
protected synchronized Class<?> loadClass ( String name , boolean resolve ) throws ClassNotFoundException{
    //检查指定类是否被当前类加载器加载过
    Class c = findLoadedClass(name);
    if( c == null ){//如果没被加载过，委派给父加载器加载
        try{
            if( parent != null )
                c = parent.loadClass(name,resolve);
            else 
                c = findBootstrapClassOrNull(name);
        }catch ( ClassNotFoundException e ){
            //如果父加载器无法加载
        }
        if( c == null ){//父类不能加载，由当前的类加载器加载
            c = findClass(name);
        }
    }
    if( resolve ){//如果要求立即链接，那么加载完类直接链接
        resolveClass();
    }
    //将加载过这个类对象直接返回
    return c;
}

```
从上面的代码中，我们可以看到在父加载器不能完成加载任务时，会调用findClass(name)函数，这个就是我们自己实现的ClassLoader的查找类文件的规则，所以在继承后，我们只需要覆盖findClass()这个函数，实现我们在本加载器中的查找逻辑，而且还不会破坏双亲委托模型

```java
public class MyClassLoader extends ClassLoader{

    private String rootPath;
    
    public MyClassLoader(String rootPath){
        this.rootPath = rootPath;
    }
    
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        //check if the class have been loaded
        Class<?> c = findLoadedClass(name);        
        if(c!=null){
            return c;
        }
        //load the class
        byte[] classData = getClassData(name);
        if(classData==null){
            throw new ClassNotFoundException();
        }
        else{
            c = defineClass(name,classData, 0, classData.length);
            return c;
        }    
    }
    
    private byte[] getClassData(String className){
        String path = rootPath+"/"+className.replace('.', '/')+".class";
        
        InputStream is = null;
        ByteArrayOutputStream bos = null;
        try {
            is = new FileInputStream(path);
            bos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int temp = 0;
            while((temp = is.read(buffer))!=-1){
                bos.write(buffer,0,temp);
            }
            return bos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                is.close();
                bos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }            
        }
        
        return null;        
    }    

}

```

测试自定义的类加载器

创建一个测试类HelloWorld

```java
package testOthers;

public class HelloWorld {

}
```
在D盘根目录创建一个testOthers文件夹，编译HelloWorld.java，将得到的class文件放到testOthers文件夹下。

利用如下代码进行测试

```java
public class testMyClassLoader {
    @Test
    public void test() throws Exception{
        MyClassLoader loader = new MyClassLoader("D:");
        Class<?> c = loader.loadClass("testOthers.HelloWorld");
        System.out.println(c.getClassLoader());
    }
}
```
输出：

 

说明HelloWorld类是被我们的自定义类加载器MyClassLoader加载的


#### 3.5.2.6. 常见加载类错误

* ClassNotFoudException
    * 类不存在
* NoClassDefFoundError
* UnsatisfiedLinkError
* ClassCastException
    * 强制类型转换时出现得到错误，比如将A类型转换为没有继承或实现关系的B类型时出现
* ExceptionOInInitializerError

#### 3.5.2.7. 线程上下文类加载器
<a href="#menu" style="float:right">目录</a>

　　线程上下文类加载器（context class loader）是从 JDK 1.2 开始引入的。类 java.lang.Thread中的方法 getContextClassLoader()和 setContextClassLoader(ClassLoader cl)用来获取和设置线程的上下文类加载器。如果没有通过 setContextClassLoader(ClassLoader cl)方法进行设置的话，线程将继承其父线程的上下文类加载器。Java 应用运行的初始线程的上下文类加载器是系统类加载器。在线程中运行的代码可以通过此类加载器来加载类和资源。

　　前面提到的类加载器的代理模式并不能解决 Java 应用开发中会遇到的类加载器的全部问题。Java 提供了很多服务提供者接口（Service Provider Interface，SPI），允许第三方为这些接口提供实现。常见的 SPI 有 JDBC、JCE、JNDI、JAXP 和 JBI 等。这些 SPI 的接口由 Java 核心库来提供，如 JAXP 的 SPI 接口定义包含在 javax.xml.parsers包中。这些 SPI 的实现代码很可能是作为 Java 应用所依赖的 jar 包被包含进来，可以通过类路径（CLASSPATH）来找到，如实现了 JAXP SPI 的 Apache Xerces所包含的 jar 包。SPI 接口中的代码经常需要加载具体的实现类。如 JAXP 中的 javax.xml.parsers.DocumentBuilderFactory类中的 newInstance()方法用来生成一个新的 DocumentBuilderFactory的实例。这里的实例的真正的类是继承自 javax.xml.parsers.DocumentBuilderFactory，由 SPI 的实现所提供的。如在 Apache Xerces 中，实现的类是 org.apache.xerces.jaxp.DocumentBuilderFactoryImpl。而问题在于，SPI 的接口是 Java 核心库的一部分，是由引导类加载器来加载的；SPI 实现的 Java 类一般是由系统类加载器来加载的。引导类加载器是无法找到 SPI 的实现类的，因为它只加载 Java 的核心库。它也不能代理给系统类加载器，因为它是系统类加载器的祖先类加载器。也就是说，类加载器的代理模式无法解决这个问题。
　　线程上下文类加载器正好解决了这个问题。如果不做任何的设置，Java 应用的线程的上下文类加载器默认就是系统上下文类加载器。在 SPI 接口的代码中使用线程上下文类加载器，就可以成功的加载到 SPI 实现的类。线程上下文类加载器在很多 SPI 的实现中都会用到。



#### 3.5.2.8. 类加载器与Web容器
<a href="#menu" style="float:right">目录</a>
　　对于运行在 Java EE容器中的 Web 应用来说，类加载器的实现方式与一般的 Java 应用有所不同。不同的 Web 容器的实现方式也会有所不同。以 Apache Tomcat 来说，每个 Web 应用都有一个对应的类加载器实例。该类加载器也使用代理模式，所不同的是它是首先尝试去加载某个类，如果找不到再代理给父类加载器。这与一般类加载器的顺序是相反的。这是 Java Servlet 规范中的推荐做法，其目的是使得 Web 应用自己的类的优先级高于 Web 容器提供的类。这种代理模式的一个例外是：Java 核心库的类是不在查找范围之内的。这也是为了保证 Java 核心库的类型安全。
　　
绝大多数情况下，Web 应用的开发人员不需要考虑与类加载器相关的细节。下面给出几条简单的原则：
（1）每个 Web 应用自己的 Java 类文件和使用的库的 jar 包，分别放在 WEB-INF/classes和 WEB-INF/lib目录下面。
（2）多个应用共享的 Java 类文件和 jar 包，分别放在 Web 容器指定的由所有 Web 应用共享的目录下面。
（3）当出现找不到类的错误时，检查当前类的类加载器和当前线程的上下文类加载器是否正确。


#### 3.5.2.9. 常见问题分析
**由不同的类加载器加载的指定类还是相同的类型吗？**

　　在Java中，一个类用其完全匹配类名(fully qualified class name)作为标识，这里指的完全匹配类名包括包名和类名。但在JVM中，一个类用其 全名 和 一个ClassLoader的实例 作为唯一标识，不同类加载器加载的类将被置于不同的命名空间。我们可以用两个自定义类加载器去加载某自定义类型（注意不要将自定义类型的字节码放置到系统路径或者扩展路径中，否则会被系统类加载器或扩展类加载器抢先加载），然后用获取到的两个Class实例进行java.lang.Object.equals（…）判断，将会得到不相等的结果，如下所示：

```java
public class TestBean {

    public static void main(String[] args) throws Exception {
        // 一个简单的类加载器，逆向双亲委派机制
        // 可以加载与自己在同一路径下的Class文件
        ClassLoader myClassLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name)
                    throws ClassNotFoundException {
                try {
                    String filename = name.substring(name.lastIndexOf(".") + 1)
                            + ".class";
                    InputStream is = getClass().getResourceAsStream(filename);
                    if (is == null) {
                        return super.loadClass(name);   // 递归调用父类加载器
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (Exception e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };

        Object obj = myClassLoader.loadClass("classloader.test.bean.TestBean")
                .newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof classloader.test.bean.TestBean);
    }
}/* Output: 
        class classloader.test.bean.TestBean
        false  
 *///:~    
```
　　我们发现，obj 确实是类classloader.test.bean.TestBean实例化出来的对象，但当这个对象与类classloader.test.bean.TestBean做所属类型检查时却返回了false。这是因为虚拟机中存在了两个TestBean类，一个是由系统类加载器加载的，另一个则是由我们自定义的类加载器加载的，虽然它们来自同一个Class文件，但依然是两个独立的类，因此做所属类型检查时返回false。

**在代码中直接调用Class.forName(String name)方法，到底会触发那个类加载器进行类加载行为？**

Class.forName(String name)默认会使用调用类的类加载器来进行类加载。我们直接来分析一下对应的jdk的代码：

```java
//java.lang.Class.java  
public static Class<?> forName(String className) throws ClassNotFoundException {  
    return forName0(className, true, ClassLoader.getCallerClassLoader());  
}  

//java.lang.ClassLoader.java  
//Returns the invoker's class loader, or null if none.  
static ClassLoader getCallerClassLoader() {  
    // 获取调用类（caller）的类型  
    Class caller = Reflection.getCallerClass(3);  
    // This can be null if the VM is requesting it  
    if (caller == null) {  
        return null;  
    }  
    // 调用java.lang.Class中本地方法获取加载该调用类（caller）的ClassLoader  
    return caller.getClassLoader0();  
}  

//java.lang.Class.java  
//虚拟机本地实现，获取当前类的类加载器，前面介绍的Class的getClassLoader()也使用此方法  
native ClassLoader getClassLoader0(); 

```

**在编写自定义类加载器时，如果没有设定父加载器，那么父加载器是谁？**
　　前面讲过，在不指定父类加载器的情况下，默认采用系统类加载器。可能有人觉得不明白，现在我们来看一下JDK对应的代码实现。众所周知，我们编写自定义的类加载器直接或者间接继承自java.lang.ClassLoader抽象类，对应的无参默认构造函数实现如下：

```java
//摘自java.lang.ClassLoader.java  
protected ClassLoader() {  
    SecurityManager security = System.getSecurityManager();  
    if (security != null) {  
        security.checkCreateClassLoader();  
    }  
    this.parent = getSystemClassLoader();  
    initialized = true;  
} 
```

我们再来看一下对应的getSystemClassLoader()方法的实现：
```java
private static synchronized void initSystemClassLoader() {  
    //...  
    sun.misc.Launcher l = sun.misc.Launcher.getLauncher();  
    scl = l.getClassLoader();  
    //...  
}  
```
我们可以写简单的测试代码来测试一下：
```java
System.out.println(sun.misc.Launcher.getLauncher().getClassLoader());  
```
本机对应输出如下：
```java
sun.misc.Launcher$AppClassLoader@73d16e93 
```
　　所以，我们现在可以相信当自定义类加载器没有指定父类加载器的情况下，默认的父类加载器即为系统类加载器。同时，我们可以得出如下结论：即使用户自定义类加载器不指定父类加载器，那么，同样可以加载如下三个地方的类：

```
<Java_Runtime_Home>/lib下的类；
<Java_Runtime_Home>/lib/ext下或者由系统变量java.ext.dir指定位置中的类；
```
当前工程类路径下或者由系统变量java.class.path指定位置中的类。

**在编写自定义类加载器时，如果将父类加载器强制设置为null，那么会有什么影响？如果自定义的类加载器不能加载指定类，就肯定会加载失败吗？**

　　JVM规范中规定如果用户自定义的类加载器将父类加载器强制设置为null，那么会自动将启动类加载器设置为当前用户自定义类加载器的父类加载器（这个问题前面已经分析过了）。同时，我们可以得出如下结论：即使用户自定义类加载器不指定父类加载器，那么，同样可以加载到<JAVA_HOME>/lib下的类，但此时就不能够加载<JAVA_HOME>/lib/ext目录下的类了。

　　Ps：问题3和问题4的推断结论是基于用户自定义的类加载器本身延续了java.lang.ClassLoader.loadClass（…）默认委派逻辑，如果用户对这一默认委派逻辑进行了改变，以上推断结论就不一定成立了，详见问题5。

**编写自定义类加载器时，一般有哪些注意点？**

1)、一般尽量不要覆写已有的loadClass(…)方法中的委派逻辑（Old Generation）

　　一般在JDK 1.2之前的版本才这样做，而且事实证明，这样做极有可能引起系统默认的类加载器不能正常工作。在JVM规范和JDK文档中（1.2或者以后版本中），都没有建议用户覆写loadClass(…)方法，相比而言，明确提示开发者在开发自定义的类加载器时覆写findClass(…)逻辑。举一个例子来验证该问题：

```java
//用户自定义类加载器WrongClassLoader.Java（覆写loadClass逻辑）  
public class WrongClassLoader extends ClassLoader {  

    public Class<?> loadClass(String name) throws ClassNotFoundException {  
        return this.findClass(name);  
    }  

    protected Class<?> findClass(String name) throws ClassNotFoundException {  
        // 假设此处只是到工程以外的特定目录D:\library下去加载类  
        // 具体实现代码省略  
    }  
}  
```
　　通过前面的分析我们已经知道，这个自定义类加载器WrongClassLoader的默认类加载器是系统类加载器，但是现在问题4中的结论就不成立了。大家可以简单测试一下，现在JAVA_HOME/lib、JAVA_HOME/lib/ext 和 工程类路径上的类都加载不上了。

```java
//问题5测试代码一  
public class WrongClassLoaderTest {  
    publicstaticvoid main(String[] args) {  
        try {  
            WrongClassLoader loader = new WrongClassLoader();  
            Class classLoaded = loader.loadClass("beans.Account");  
            System.out.println(classLoaded.getName());  
            System.out.println(classLoaded.getClassLoader());  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}/* Output: 
        java.io.FileNotFoundException: D:"classes"java"lang"Object.class (系统找不到指定的路径。)  
        at java.io.FileInputStream.open(Native Method)  
        at java.io.FileInputStream.<init>(FileInputStream.java:106)  
        at WrongClassLoader.findClass(WrongClassLoader.java:40)  
        at WrongClassLoader.loadClass(WrongClassLoader.java:29)  
        at java.lang.ClassLoader.loadClassInternal(ClassLoader.java:319)  
        at java.lang.ClassLoader.defineClass1(Native Method)  
        at java.lang.ClassLoader.defineClass(ClassLoader.java:620)  
        at java.lang.ClassLoader.defineClass(ClassLoader.java:400)  
        at WrongClassLoader.findClass(WrongClassLoader.java:43)  
        at WrongClassLoader.loadClass(WrongClassLoader.java:29)  
        at WrongClassLoaderTest.main(WrongClassLoaderTest.java:27)  
Exception in thread "main" java.lang.NoClassDefFoundError: java/lang/Object  
        at java.lang.ClassLoader.defineClass1(Native Method)  
        at java.lang.ClassLoader.defineClass(ClassLoader.java:620)  
        at java.lang.ClassLoader.defineClass(ClassLoader.java:400)  
        at WrongClassLoader.findClass(WrongClassLoader.java:43)  
        at WrongClassLoader.loadClass(WrongClassLoader.java:29)  
        at WrongClassLoaderTest.main(WrongClassLoaderTest.java:27)  
 *///:~    
```
　　注意，这里D:”classes”beans”Account.class是物理存在的。这说明，连要加载的类型的超类型java.lang.Object都加载不到了。这里列举的由于覆写loadClass()引起的逻辑错误明显是比较简单的，实际引起的逻辑错误可能复杂的多。

```java
//问题5测试二  
//用户自定义类加载器WrongClassLoader.Java(不覆写loadClass逻辑)  
public class WrongClassLoader extends ClassLoader {  
    protected Class<?> findClass(String name) throws ClassNotFoundException {  
        //假设此处只是到工程以外的特定目录D:\library下去加载类  
        //具体实现代码省略  
    }  
}/* Output: 
        beans.Account  
        WrongClassLoader@1c78e57  
 *///:~  
```
　　将自定义类加载器代码WrongClassLoader.Java做以上修改后，再运行测试代码，输出正确。

2). 正确设置父类加载器

　　通过上面问题4和问题5的分析我们应该已经理解，个人觉得这是自定义用户类加载器时最重要的一点，但常常被忽略或者轻易带过。有了前面JDK代码的分析作为基础，我想现在大家都可以随便举出例子了。

3). 保证findClass(String name)方法的逻辑正确性

　　事先尽量准确理解待定义的类加载器要完成的加载任务，确保最大程度上能够获取到对应的字节码内容。

**如何在运行时判断系统类加载器能加载哪些路径下的类？**

　　一是可以直接调用ClassLoader.getSystemClassLoader()或者其他方式获取到系统类加载器（系统类加载器和扩展类加载器本身都派生自URLClassLoader），调用URLClassLoader中的getURLs()方法可以获取到。二是可以直接通过获取系统属性java.class.path来查看当前类路径上的条目信息 ：System.getProperty(“java.class.path”)。如下所示，
```java
public class Test {
    public static void main(String[] args) {
        System.out.println("Rico");
        Gson gson = new Gson();
        System.out.println(gson.getClass().getClassLoader());
        System.out.println(System.getProperty("java.class.path"));
    }
}/* Output: 
        Rico
        sun.misc.Launcher$AppClassLoader@6c68bcef
        I:\AlgorithmPractice\TestClassLoader\bin;I:\Java\jars\Gson\gson-2.3.1.jar
 *///:~ 
```
　　如上述程序所示，Test类和Gson类由系统类加载器加载，并且其加载路径就是用户类路径，包括当前类路径和引用的第三方类库的路径。

**如何在运行时判断标准扩展类加载器能加载哪些路径下的类？**

利用如下方式即可判断：

```java
import java.net.URL;
import java.net.URLClassLoader;  

public class ClassLoaderTest {  

    /** 
     * @param args the command line arguments 
     */  
    public static void main(String[] args) {  
        try {  
            URL[] extURLs = ((URLClassLoader) ClassLoader.getSystemClassLoader().getParent()).getURLs();  
            for (int i = 0; i < extURLs.length; i++) {  
                System.out.println(extURLs[i]);  
            }  
        } catch (Exception e) {  
            //…  
        }  
    }  
} 
/* Output: 
        file:/C:/Program%20Files/Java/jdk1.7.0_79/jre/lib/ext/access-bridge-64.jar
        file:/C:/Program%20Files/Java/jdk1.7.0_79/jre/lib/ext/dnsns.jar
        file:/C:/Program%20Files/Java/jdk1.7.0_79/jre/lib/ext/jaccess.jar
        file:/C:/Program%20Files/Java/jdk1.7.0_79/jre/lib/ext/localedata.jar
        file:/C:/Program%20Files/Java/jdk1.7.0_79/jre/lib/ext/sunec.jar
        file:/C:/Program%20Files/Java/jdk1.7.0_79/jre/lib/ext/sunjce_provider.jar
        file:/C:/Program%20Files/Java/jdk1.7.0_79/jre/lib/ext/sunmscapi.jar
        file:/C:/Program%20Files/Java/jdk1.7.0_79/jre/lib/ext/zipfs.jar
 */

```

 
### 3.5.3. 反射
<a href="#menu" style="float:right">目录</a>


## 3.6. JDBC
<a href="#menu" style="float:right">目录</a>

**数据库驱动**
这里的驱动的概念和平时听到的那种驱动的概念是一样的，比如平时购买的声卡，网卡直接插到计算机上面是不能用的，必须要安装相应的驱动程序之后才能够使用声卡和网卡，同样道理，我们安装好数据库之后，我们的应用程序也是不能直接使用数据库的，必须要通过相应的数据库驱动程序，通过驱动程序去和数据库打交道，如下所示：
* 应用程序-->Mysq驱动--Mysql
* 应用程序-->Oracle驱动--Oracle

**JDBC介绍**
　　SUN公司为了简化、统一对数据库的操作，定义了一套Java操作数据库的规范（接口），称之为JDBC。这套接口由数据库厂商去实现，这样，开发人员只需要学习jdbc接口，并通过jdbc加载具体的驱动，就可以操作数据库。
```java
package me.gacl.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcFirstDemo {

    public static void main(String[] args) throws Exception {
        //要连接的数据库URL
        String url = "jdbc:mysql://localhost:3306/jdbcStudy";
        //连接的数据库时使用的用户名
        String username = "root";
        //连接的数据库时使用的密码
        String password = "XDP";
        
        //1.加载驱动
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());不推荐使用这种方式来加载驱动
        Class.forName("com.mysql.jdbc.Driver");//推荐使用这种方式来加载驱动
        //2.获取与数据库的链接
        Connection conn = DriverManager.getConnection(url, username, password);
        
        //3.获取用于向数据库发送sql语句的statement
        Statement st = conn.createStatement();
        
        String sql = "select id,name,password,email,birthday from users";
        //4.向数据库发sql,并获取代表结果集的resultset
        ResultSet rs = st.executeQuery(sql);
        
        //5.取出结果集的数据
        while(rs.next()){
            System.out.println("id=" + rs.getObject("id"));
            System.out.println("name=" + rs.getObject("name"));
            System.out.println("password=" + rs.getObject("password"));
            System.out.println("email=" + rs.getObject("email"));
            System.out.println("birthday=" + rs.getObject("birthday"));
        }
        
        //6.关闭链接，释放资源
        rs.close();
        st.close();
        conn.close();
    }
}
```
* **JDBC之Statement,PreparedStatement,CallableStatement的区别**
    * Statement、PreparedStatement和CallableStatement都是接口(interface)。 
    * Statement继承自Wrapper、PreparedStatement继承自Statement、CallableStatement继承自PreparedStatement。 
    * Statement接口提供了执行语句和获取结果的基本方法； 
        * PreparedStatement接口添加了处理 IN 参数的方法； 
        * CallableStatement接口添加了处理 OUT 参数的方法。 
    * Statement: 
        * 普通的不带参的查询SQL；支持批量更新,批量删除; 
    * PreparedStatement: 
        * 可变参数的SQL,编译一次,执行多次,效率高; 
        * 安全性好，有效防止Sql注入等问题; 
        * 支持批量更新,批量删除; 
    * CallableStatement: 
        * 继承自PreparedStatement,支持带参数的SQL操作; 
        * 支持调用存储过程,提供了对输出和输入/输出参数(INOUT)的支持; 
    * Statement每次执行sql语句，数据库都要执行sql语句的编译 ，最好用于仅执行一次查询并返回结果的情形时，效率高于PreparedStatement。
    * PreparedStatement是预编译的，使用PreparedStatement有几个好处 
        * 在执行可变参数的一条SQL时，PreparedStatement比Statement的效率高，因为DBMS预编译一条SQL当然会比多次编译一条SQL的效率要高。 
        * 安全性好，有效防止Sql注入等问题。 
        * 对于多次重复执行的语句，使用PreparedStament效率会更高一点，并且在这种情况下也比较适合使用batch； 
        * 代码的可读性和可维护性。 
    * 其他
        * executeQuery：返回结果集(ResultSet)。 
        * executeUpdate: 执行给定SQL语句,该语句可能为 INSERT、UPDATE 或 DELETE 语句， 
        * 或者不返回任何内容的SQL语句（如 SQL DDL 语句）。 
        * execute: 可用于执行任何SQL语句，返回一个boolean值， 
        * 表明执行该SQL语句是否返回了ResultSet。如果执行后第一个结果是ResultSet，则返回true，否则返回false。 

```java
//Statement用法:  
String sql = "select seq_orderdetailid.nextval as test dual";  
Statement stat1=conn.createStatement();  
ResultSet rs1 = stat1.executeQuery(sql);  
if ( rs1.next() ) {  
    id = rs1.getLong(1);  
}  

//Statement的Batch使用:  
Statement stmt  = conn.createStatement();  
String sql = null;  
for(int i =0;i<20;i++){  
    sql = "insert into test(id,name)values("+i+","+i+"_name)";  
    stmt.addBatch(sql);  
}  
stmt.executeBatch();  

   
//PreparedStatement用法:  
PreparedStatement pstmt  = con.prepareStatement("UPDATE EMPLOYEES  SET SALARY = ? WHERE ID =?");  
pstmt.setBigDecimal(1, 153.00);  
pstmt.setInt(2, 1102);  
pstmt. executeUpdate()
   
//PreparedStatement的Batch使用:  
PreparedStatement pstmt  = con.prepareStatement("UPDATE EMPLOYEES  SET SALARY = ? WHERE ID =?");  
for(int i =0;i<length;i++){  
    pstmt.setBigDecimal(1, param1[i]);  
    pstmt.setInt(2, param2[i]);  
    pstmt.addBatch();  
}  
pstmt.executeBatch();  

//CallableStatement
CallableStatement cstmt = conn.prepareCall("{call revise_total(?)}");  
cstmt.setByte(1, 25);  
cstmt.registerOutParameter(1, java.sql.Types.TINYINT);  
cstmt.executeUpdate();  
byte x = cstmt.getByte(1);  
```
## 3.7. 函数式编程

函数式编程就是一种抽象程度很高的编程范式，纯粹的函数式编程语言编写的函数没有变量，因此，任意一个函数，只要输入是确定的，输出就是确定的，这种纯函数我们称之为没有副作用。而允许使用变量的程序设计语言，由于函数内部的变量状态不确定，同样的输入，可能得到不同的输出，因此，这种函数是有副作用的。

函数式编程的一个特点就是，允许把函数本身作为参数传入另一个函数，还允许返回一个函数！
## 3.8. Java 8 的新特性：

### 3.8.1. Java 8 Lambda 表达式
Lambda 表达式，也可称为闭包，它是推动 Java 8 发布的最重要新特性。
Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
使用 Lambda 表达式可以使代码变的更加简洁紧凑。
法
lambda 表达式的语法格式如下：

```java
(parameters) -> expression
或
(parameters) ->{ statements; }
```
* 以下是lambda表达式的重要特征:
    * 可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
    * 可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
    * 可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
    * 可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值。

**Lambda 表达式实例**

```java
// 1. 不需要参数,返回值为 5  
() -> 5    
// 2. 接收一个参数(数字类型),返回其2倍的值  
x -> 2 * x    
// 3. 接受2个参数(数字),并返回他们的差值  
(x, y) -> x – y    
// 4. 接收2个int型整数,返回他们的和  
(int x, int y) -> x + y   
// 5. 接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void)  
(String s) -> System.out.print(s)
```
* lambda 表达式只能引用标记了 final 的外层局部变量，这就是说不能在 lambda 内部修改定义在域外的局部变量，否则会编译错误。
* lambda 表达式的局部变量可以不用声明为 final，但是必须不可被后面的代码修改（即隐性的具有 final 的语义）
* 在Lambda 表达式当中不允许声明一个与外部局部变量同名的参数或者局部变量

### 3.8.2. Java 8 函数式接口
函数式接口(Functional Interface)就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。

函数式接口可以被隐式转换为 lambda 表达式。

Lambda 表达式和方法引用（实际上也可认为是Lambda表达式）上。

如定义了一个函数式接口如下：

@FunctionalInterface
interface GreetingService 
{
    void sayMessage(String message);
}
那么就可以使用Lambda表达式来表示该接口的一个实现(注：JAVA 8 之前一般是用匿名类实现的)：

GreetingService greetService1 = message -> System.out.println("Hello " + message);
函数式接口可以对现有的函数友好地支持 lambda。

JDK 1.8 之前已有的函数式接口:

java.lang.Runnable
java.util.concurrent.Callable
java.security.PrivilegedAction
java.util.Comparator
java.io.FileFilter
java.nio.file.PathMatcher
java.lang.reflect.InvocationHandler
java.beans.PropertyChangeListener
java.awt.event.ActionListener
javax.swing.event.ChangeListener
JDK 1.8 新增加的函数接口：

java.util.function
java.util.function 它包含了很多类，用来支持 Java的 函数式编程，该包中的函数式接口有：

|序号	|接口 & 描述
|---|---|
|1|	BiConsumer<T,U>代表了一个接受两个输入参数的操作，并且不返回任何结果
|2|	BiFunction<T,U,R>代表了一个接受两个输入参数的方法，并且返回一个结果
|3|	BinaryOperator<T>代表了一个作用于于两个同类型操作符的操作，并且返回了操作符同类型的结果
|4|	BiPredicate<T,U>代表了一个两个参数的boolean值方法
|5|BooleanSupplier代表了boolean值结果的提供方
|6|	Consumer<T>代表了接受一个输入参数并且无返回的操作
|7|	DoubleBinaryOperator代表了作用于两个double值操作符的操作，并且返回了一个double值的结果。
|8|	DoubleConsumer代表一个接受double值参数的操作，并且不返回结果。
|9|	DoubleFunction<R>代表接受一个double值参数的方法，并且返回结果
|10|	DoublePredicate代表一个拥有double值参数的boolean值方法
|11|	DoubleSupplier代表一个double值结构的提供方
|12|	DoubleToIntFunction接受一个double类型输入，返回一个int类型结果。
|13|	DoubleToLongFunction接受一个double类型输入，返回一个long类型结果
|14|	DoubleUnaryOperator接受一个参数同为类型double,返回值类型也为double 。
|15|	Function<T,R>接受一个输入参数，返回一个结果。
|16|	IntBinaryOperator接受两个参数同为类型int,返回值类型也为int 。
|17|	IntConsumer接受一个int类型的输入参数，无返回值 。
|18|	IntFunction<R>接受一个int类型输入参数，返回一个结果 。
|19|	IntPredicate接受一个int输入参数，返回一个布尔值的结果。
|20|	IntSupplie无参数，返回一个int类型结果。
|21|	IntToDoubleFunction接受一个int类型输入，返回一个double类型结果 。
|22|	IntToLongFunction接受一个int类型输入，返回一个long类型结果。
|23|	IntUnaryOperator接受一个参数同为类型int,返回值类型也为int 。
|24|	LongBinaryOperator接受两个参数同为类型long,返回值类型也为long。
|25|	LongConsumer接受一个long类型的输入参数，无返回值。
|26	|LongFunction<R>接受一个long类型输入参数，返回一个结果。
|27|	LongPredicate接受一个long输入参数，返回一个布尔值类型结果。
|28|	LongSupplier无参数，返回一个结果long类型的值。
|29|	LongToDoubleFunction接受一个long类型输入，返回一个double类型结果。
|30|	LongToIntFunction接受一个long类型输入，返回一个int类型结果。
|31|	LongUnaryOperator接受一个参数同为类型long,返回值类型也为long。
|32|	ObjDoubleConsumer<T>接受一个object类型和一个double类型的输入参数，无返回值。
|33	|ObjIntConsumer<T>接受一个object类型和一个int类型的输入参数，无返回值。
|34|	ObjLongConsumer<T>接受一个object类型和一个long类型的输入参数，无返回值。
|35	|Predicate<T>\接受一个输入参数，返回一个布尔值结果。
|36|	Supplier<T>无参数，返回一个结果。
|37|	ToDoubleBiFunction<T,U>接受两个输入参数，返回一个double类型结果
|38|	ToDoubleFunction<T>接受一个输入参数，返回一个double类型结果
|39|	ToIntBiFunction<T,U>接受两个输入参数，返回一个int类型结果。
|40|	ToIntFunction<T>接受一个输入参数，返回一个int类型结果。
|41|	ToLongBiFunction<T,U>接受两个输入参数，返回一个long类型结果。
|42	|ToLongFunction<T>接受一个输入参数，返回一个long类型结果。
|43|	UnaryOperator<T>接受一个参数为类型T,返回值类型也为T。

**函数式接口实例**
Predicate <T> 接口是一个函数式接口，它接受一个输入参数 T，返回一个布尔值结果。

该接口包含多种默认方法来将Predicate组合成其他复杂的逻辑（比如：与，或，非）。

该接口用于测试对象是 true 或 false。

我们可以通过以下实例（Java8Tester.java）来了解函数式接口 Predicate <T> 的使用：
```java
Java8Tester.java 文件
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
 
public class Java8Tester {
   public static void main(String args[]){
      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
      // Predicate<Integer> predicate = n -> true
      // n 是一个参数传递到 Predicate 接口的 test 方法
      // n 如果存在则 test 方法返回 true
        
      System.out.println("输出所有数据:");
        
      // 传递参数 n
      eval(list, n->true);
        
      // Predicate<Integer> predicate1 = n -> n%2 == 0
      // n 是一个参数传递到 Predicate 接口的 test 方法
      // 如果 n%2 为 0 test 方法返回 true
        
      System.out.println("输出所有偶数:");
      eval(list, n-> n%2 == 0 );
        
      // Predicate<Integer> predicate2 = n -> n > 3
      // n 是一个参数传递到 Predicate 接口的 test 方法
      // 如果 n 大于 3 test 方法返回 true
        
      System.out.println("输出大于 3 的所有数字:");
      eval(list, n-> n > 3 );
   }
    
   public static void eval(List<Integer> list, Predicate<Integer> predicate) {
      for(Integer n: list) {
        
         if(predicate.test(n)) {
            System.out.println(n + " ");
         }
      }
   }
}
```
### 3.8.3. 默认方法
Java 8 新增了接口的默认方法。
简单说，默认方法就是接口可以有实现方法，而且不需要实现类去实现其方法。
我们只需在方法名前面加个 default 关键字即可实现默认方法。

为什么要有这个特性？

首先，之前的接口是个双刃剑，好处是面向抽象而不是面向具体编程，缺陷是，当需要修改接口时候，需要修改全部实现该接口的类，目前的 java 8 之前的集合框架没有 foreach 方法，通常能想到的解决办法是在JDK里给相关的接口添加新的方法及实现。然而，对于已经发布的版本，是没法在给接口添加新方法的同时不影响已有的实现。所以引进的默认方法。他们的目的是为了解决接口的修改与现有的实现不兼容的问题。
```java
public interface Vehicle {
   default void print(){
      System.out.println("我是一辆车!");
   }
}
默认方法也可以设置为静态。
```

### 3.8.4. Optional 类
Optional 类是一个可以为null的容器对象。如果值存在则isPresent()方法会返回true，调用get()方法会返回该对象。

Optional 是个容器：它可以保存类型T的值，或者仅仅保存null。Optional提供很多有用的方法，这样我们就不用显式进行空值检测。

Optional 类的引入很好的解决空指针异常。

类声明
以下是一个 java.util.Optional<T> 类的声明：

public final class Optional<T>
extends Object
类方法
|序号|	方法 & 描述
|---|---|
|1|	static <T> Optional<T> empty()返回空的 Optional 实例。
|2|	boolean equals(Object obj判断其他对象是否等于 Optional。
|3|	Optional<T> filter(Predicate<? super <T> predicate)如果值存在，并且这个值匹配给定的 predicate，返回一个Optional用以描述这个值，否则返回一个空的Optional。
|4|	<U> Optional<U> flatMap(Function<? super T,Optional<U>> mapper)如果值存在，返回基于Optional包含的映射方法的值，否则返回一个空的Optional
|5|	T get()如果在这个Optional中包含这个值，返回值，否则抛出异常：NoSuchElementException
|6|	int hashCode()返回存在值的哈希码，如果值不存在 返回 0。
|7|	void ifPresent(Consumer<? super T> consumer)如果值存在则使用该值调用 consumer , 否则不做任何事情。
|8|	boolean isPresent()如果值存在则方法会返回true，否则返回 false。
|9|	<U>Optional<U> map(Function<? super T,? extends U> mapper)如果有值，则对其执行调用映射函数得到返回值。如果返回值不为 null，则创建包含映射返回值的Optional作为map方法返回值，否则返回空Optional。
|10|	static <T> Optional<T> of(T value)返回一个指定非null值的Optional。
|11|	static <T> Optional<T> ofNullable(T value)如果为非空，返回 Optional 描述的指定值，否则返回空的 Optional。
|12|	T orElse(T other)如果存在该值，返回值， 否则返回 other。
|13|	T orElseGet(Supplier<? extends T> other)如果存在该值，返回值， 否则触发 other，并返回 other 调用的结果。
|14|	<X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier)如果存在该值，返回包含的值，否则抛出由 Supplier 继承的异常
|15|	String toString()返回一个Optional的非空字符串，用来调试

注意： 这些方法是从 java.lang.Object 类继承来的。

Optional 实例
我们可以通过以下实例来更好的了解 Optional 类的使用：

Java8Tester.java 文件
```java
import java.util.Optional;
 
public class Java8Tester {
   public static void main(String args[]){
   
      Java8Tester java8Tester = new Java8Tester();
      Integer value1 = null;
      Integer value2 = new Integer(10);
        
      // Optional.ofNullable - 允许传递为 null 参数
      Optional<Integer> a = Optional.ofNullable(value1);
        
      // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
      Optional<Integer> b = Optional.of(value2);
      System.out.println(java8Tester.sum(a,b));
   }
    
   public Integer sum(Optional<Integer> a, Optional<Integer> b){
    
      // Optional.isPresent - 判断值是否存在
        
      System.out.println("第一个参数值存在: " + a.isPresent());
      System.out.println("第二个参数值存在: " + b.isPresent());
        
      // Optional.orElse - 如果值存在，返回它，否则返回默认值
      Integer value1 = a.orElse(new Integer(0));
        
      //Optional.get - 获取值，值需要存在
      Integer value2 = b.get();
      return value1 + value2;
   }
}
```

### 3.8.5. Stream
Java 8 API添加了一个新的抽象称为流Stream，可以让你以一种声明的方式处理数据。

Stream 使用一种类似用 SQL 语句从数据库查询数据的直观方式来提供一种对 Java 集合运算和表达的高阶抽象。

Stream API可以极大提高Java程序员的生产力，让程序员写出高效率、干净、简洁的代码。

这种风格将要处理的元素集合看作一种流， 流在管道中传输， 并且可以在管道的节点上进行处理， 比如筛选， 排序，聚合等。

元素流在管道中经过中间操作（intermediate operation）的处理，最后由最终操作(terminal operation)得到前面处理的结果。

+--------------------+       +------+   +------+   +---+   +-------+
| stream of elements +-----> |filter+-> |sorted+-> |map+-> |collect|
+--------------------+       +------+   +------+   +---+   +-------+
以上的流程转换为 Java 代码为：
```java
List<Integer> transactionsIds = 
widgets.stream()
             .filter(b -> b.getColor() == RED)
             .sorted((x,y) -> x.getWeight() - y.getWeight())
             .mapToInt(Widget::getWeight)
             .sum();
```

**什么是 Stream？**
* Stream（流）是一个来自数据源的元素队列并支持聚合操作
* 元素是特定类型的对象，形成一个队列。 Java中的Stream并不会存储元素，而是按需计算。
* 数据源 流的来源。 可以是集合，数组，I/O channel， 产生器generator 等。
* 聚合操作 类似SQL语句一样的操作， 比如filter, map, reduce, find, match, sorted等。

和以前的Collection操作不同， Stream操作还有两个基础的特征：
* Pipelining: 中间操作都会返回流对象本身。 这样多个操作可以串联成一个管道， 如同流式风格（fluent style）。 这样做可以对操作进行优化， 比如延迟执行(laziness)和短路( short-circuiting)。
* 内部迭代： 以前对集合遍历都是通过Iterator或者For-Each的方式, 显式的在集合外部进行迭代， 这叫做外部迭代。 Stream提供了内部迭代的方式， 通过访问者模式(Visitor)实现。

**生成流**
在 Java 8 中, 集合接口有两个方法来生成流：
* stream() − 为集合创建串行流。
* parallelStream() − 为集合创建并行流。

**forEach**
Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。以下代码片段使用 forEach 输出了10个随机数：
```JAVA
Random random = new Random();
random.ints().limit(10).forEach(System.out::println);
```
**map**

map 方法用于映射每个元素到对应的结果，以下代码片段使用 map 输出了元素对应的平方数：
```JAVA
List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
// 获取对应的平方数
List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
```

**filter**

filter 方法用于通过设置的条件过滤出元素。以下代码片段使用 filter 方法过滤出空字符串：
```JAVA
List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
// 获取空字符串的数量
int count = strings.stream().filter(string -> string.isEmpty()).count();
```
**limit**
limit 方法用于获取指定数量的流。 以下代码片段使用 limit 方法打印出 10 条数据：
```JAVA
Random random = new Random();
random.ints().limit(10).forEach(System.out::println);
```
**sorted**
sorted 方法用于对流进行排序。以下代码片段使用 sorted 方法对输出的 10 个随机数进行排序：
```JAVA
Random random = new Random();
random.ints().limit(10).sorted().forEach(System.out::println);
并行（parallel）程序
parallelStream 是流并行处理程序的代替方法。以下实例我们使用 parallelStream 来输出空字符串的数量：

List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
// 获取空字符串的数量
int count = strings.parallelStream().filter(string -> string.isEmpty()).count();
```
我们可以很容易的在顺序运行和并行直接切换。

**Collectors**
Collectors 类实现了很多归约操作，例如将流转换成集合和聚合元素。Collectors 可用于返回列表或字符串：
```JAVA
List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
 
System.out.println("筛选列表: " + filtered);
String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
System.out.println("合并字符串: " + mergedString);
```

统计
另外，一些产生统计结果的收集器也非常有用。它们主要用于int、double、long等基本类型上，它们可以用来产生类似如下的统计结果。
```JAVA
List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
 
IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
 
System.out.println("列表中最大的数 : " + stats.getMax());
System.out.println("列表中最小的数 : " + stats.getMin());
System.out.println("所有数之和 : " + stats.getSum());
System.out.println("平均数 : " + stats.getAverage());
```
Stream 完整实例
将以下代码放入 Java8Tester.java 文件中：

```JAVA
Java8Tester.java 文件
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Map;
 
public class Java8Tester {
   public static void main(String args[]){
      System.out.println("使用 Java 7: ");
        
      // 计算空字符串
      List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
      System.out.println("列表: " +strings);
      long count = getCountEmptyStringUsingJava7(strings);
        
      System.out.println("空字符数量为: " + count);
      count = getCountLength3UsingJava7(strings);
        
      System.out.println("字符串长度为 3 的数量为: " + count);
        
      // 删除空字符串
      List<String> filtered = deleteEmptyStringsUsingJava7(strings);
      System.out.println("筛选后的列表: " + filtered);
        
      // 删除空字符串，并使用逗号把它们合并起来
      String mergedString = getMergedStringUsingJava7(strings,", ");
      System.out.println("合并字符串: " + mergedString);
      List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        
      // 获取列表元素平方数
      List<Integer> squaresList = getSquares(numbers);
      System.out.println("平方数列表: " + squaresList);
      List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
        
      System.out.println("列表: " +integers);
      System.out.println("列表中最大的数 : " + getMax(integers));
      System.out.println("列表中最小的数 : " + getMin(integers));
      System.out.println("所有数之和 : " + getSum(integers));
      System.out.println("平均数 : " + getAverage(integers));
      System.out.println("随机数: ");
        
      // 输出10个随机数
      Random random = new Random();
        
      for(int i=0; i < 10; i++){
         System.out.println(random.nextInt());
      }
        
      System.out.println("使用 Java 8: ");
      System.out.println("列表: " +strings);
        
      count = strings.stream().filter(string->string.isEmpty()).count();
      System.out.println("空字符串数量为: " + count);
        
      count = strings.stream().filter(string -> string.length() == 3).count();
      System.out.println("字符串长度为 3 的数量为: " + count);
        
      filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
      System.out.println("筛选后的列表: " + filtered);
        
      mergedString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
      System.out.println("合并字符串: " + mergedString);
        
      squaresList = numbers.stream().map( i ->i*i).distinct().collect(Collectors.toList());
      System.out.println("Squares List: " + squaresList);
      System.out.println("列表: " +integers);
        
      IntSummaryStatistics stats = integers.stream().mapToInt((x) ->x).summaryStatistics();
        
      System.out.println("列表中最大的数 : " + stats.getMax());
      System.out.println("列表中最小的数 : " + stats.getMin());
      System.out.println("所有数之和 : " + stats.getSum());
      System.out.println("平均数 : " + stats.getAverage());
      System.out.println("随机数: ");
        
      random.ints().limit(10).sorted().forEach(System.out::println);
        
      // 并行处理
      count = strings.parallelStream().filter(string -> string.isEmpty()).count();
      System.out.println("空字符串的数量为: " + count);
   }
    
   private static int getCountEmptyStringUsingJava7(List<String> strings){
      int count = 0;
        
      for(String string: strings){
        
         if(string.isEmpty()){
            count++;
         }
      }
      return count;
   }
    
   private static int getCountLength3UsingJava7(List<String> strings){
      int count = 0;
        
      for(String string: strings){
        
         if(string.length() == 3){
            count++;
         }
      }
      return count;
   }
    
   private static List<String> deleteEmptyStringsUsingJava7(List<String> strings){
      List<String> filteredList = new ArrayList<String>();
        
      for(String string: strings){
        
         if(!string.isEmpty()){
             filteredList.add(string);
         }
      }
      return filteredList;
   }
    
   private static String getMergedStringUsingJava7(List<String> strings, String separator){
      StringBuilder stringBuilder = new StringBuilder();
        
      for(String string: strings){
        
         if(!string.isEmpty()){
            stringBuilder.append(string);
            stringBuilder.append(separator);
         }
      }
      String mergedString = stringBuilder.toString();
      return mergedString.substring(0, mergedString.length()-2);
   }
    
   private static List<Integer> getSquares(List<Integer> numbers){
      List<Integer> squaresList = new ArrayList<Integer>();
        
      for(Integer number: numbers){
         Integer square = new Integer(number.intValue() * number.intValue());
            
         if(!squaresList.contains(square)){
            squaresList.add(square);
         }
      }
      return squaresList;
   }
    
   private static int getMax(List<Integer> numbers){
      int max = numbers.get(0);
        
      for(int i=1;i < numbers.size();i++){
        
         Integer number = numbers.get(i);
            
         if(number.intValue() > max){
            max = number.intValue();
         }
      }
      return max;
   }
    
   private static int getMin(List<Integer> numbers){
      int min = numbers.get(0);
        
      for(int i=1;i < numbers.size();i++){
         Integer number = numbers.get(i);
        
         if(number.intValue() < min){
            min = number.intValue();
         }
      }
      return min;
   }
    
   private static int getSum(List numbers){
      int sum = (int)(numbers.get(0));
        
      for(int i=1;i < numbers.size();i++){
         sum += (int)numbers.get(i);
      }
      return sum;
   }
    
   private static int getAverage(List<Integer> numbers){
      return getSum(numbers) / numbers.size();
   }
}
```
### 3.8.6. Java 8 日期时间 API

Java 8通过发布新的Date-Time API (JSR 310)来进一步加强对日期与时间的处理。
在旧版的 Java 中，日期时间 API 存在诸多问题，其中有：
非线程安全 − java.util.Date 是非线程安全的，所有的日期类都是可变的，这是Java日期类最大的问题之一。

设计很差 − Java的日期/时间类的定义并不一致，在java.util和java.sql的包中都有日期类，此外用于格式化和解析的类在java.text包中定义。java.util.Date同时包含日期和时间，而java.sql.Date仅包含日期，将其纳入java.sql包并不合理。另外这两个类都有相同的名字，这本身就是一个非常糟糕的设计。
时区处理麻烦 − 日期类并不提供国际化，没有时区支持，因此Java引入了java.util.Calendar和java.util.TimeZone类，但他们同样存在上述所有的问题。
Java 8 在 java.time 包下提供了很多新的 API。以下为两个比较重要的 API：
Local(本地) − 简化了日期时间的处理，没有时区的问题。
Zoned(时区) − 通过制定的时区处理日期时间。
新的java.time包涵盖了所有处理日期，时间，日期/时间，时区，时刻（instants），过程（during）与时钟（clock）的操作。

**本地化日期时间 API**
LocalDate/LocalTime 和 LocalDateTime 类可以在处理时区不是必须的情况。代码如下：

Java8Tester.java 文件
```JAVA
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
 
public class Java8Tester {
   public static void main(String args[]){
      Java8Tester java8tester = new Java8Tester();
      java8tester.testLocalDateTime();
   }
    
   public void testLocalDateTime(){
    
      // 获取当前的日期时间
      LocalDateTime currentTime = LocalDateTime.now();
      System.out.println("当前时间: " + currentTime);
        
      LocalDate date1 = currentTime.toLocalDate();
      System.out.println("date1: " + date1);
        
      Month month = currentTime.getMonth();
      int day = currentTime.getDayOfMonth();
      int seconds = currentTime.getSecond();
        
      System.out.println("月: " + month +", 日: " + day +", 秒: " + seconds);
        
      LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
      System.out.println("date2: " + date2);
        
      // 12 december 2014
      LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
      System.out.println("date3: " + date3);
        
      // 22 小时 15 分钟
      LocalTime date4 = LocalTime.of(22, 15);
      System.out.println("date4: " + date4);
        
      // 解析字符串
      LocalTime date5 = LocalTime.parse("20:15:30");
      System.out.println("date5: " + date5);
   }
}
```
### 3.8.7. Java8 Base64


在Java 8中，Base64编码已经成为Java类库的标准。

Java 8 内置了 Base64 编码的编码器和解码器。

Base64工具类提供了一套静态方法获取下面三种BASE64编解码器：

基本：输出被映射到一组字符A-Za-z0-9+/，编码不添加任何行标，输出的解码仅支持A-Za-z0-9+/。
URL：输出映射到一组字符A-Za-z0-9+_，输出是URL和文件。
MIME：输出隐射到MIME友好格式。输出每行不超过76字符，并且使用'\r'并跟随'\n'作为分割。编码输出最后没有行分割。
内嵌类
|序号|	内嵌类 & 描述
|---|---|
|1|	static class Base64.Decoder
该类实现一个解码器用于，使用 Base64 编码来解码字节数据。

|2|	static class Base64.Encoder
该类实现一个编码器，使用 Base64 编码来编码字节数据。


|序号|	方法名 & 描述
|---|---|
|1|	static Base64.Decoder getDecoder()返回一个 Base64.Decoder ，解码使用基本型 base64 编码方案。
|2|	static Base64.Encoder getEncoder()返回一个 Base64.Encoder ，编码使用基本型 base64 编码方案。
|3|	static Base64.Decoder getMimeDecoder()返回一个 Base64.Decoder ，解码使用 MIME 型 base64 编码方案。
|4|	static Base64.Encoder getMimeEncoder()返回一个 Base64.Encoder ，编码使用 MIME 型 base64 编码方案。
|5|	static Base64.Encoder getMimeEncoder(int lineLength, byte[] lineSeparator)返回一个 Base64.Encoder ，编码使用 MIME 型 base64 编码方案，可以通过参数指定每行的长度及行的分隔符。
|6|	static Base64.Decoder getUrlDecoder()
返回一个 Base64.Decoder ，解码使用 URL 和文件名安全型 base64 编码方案。
|7|	static Base64.Encoder getUrlEncoder()返回一个 Base64.Encoder ，编码使用 URL 和文件名安全型 base64 编码方案。




## 3.9. JDK版本变化
* JDK5的新特性：
    * 自动拆装箱
    * Foreach
    * 静态导入
    * 可变参数 Var args
    * 枚举
    * 格式化输出
    * 泛型
    * ProcessBuilder
    * 内省
    * 线程并发库（JUC）
    * 监控和管理虚拟机
    * 元数据

* JDK6的新特性：
    * Desktop类和SystemTray类
    * JAXB2实现对象与XML之间的映射
    * StAX
    * Compiler API
    * 轻量级 Http Server API
    * 插入式注解处理API（Pluggable Annotation Processing API）
    * 用Console开发控制台程序
    * 对脚本语言的支持（如：ruby，groovy，javascript）
    * Common Annotations

* JDK7的新特性：
    * 二进制字面值
    * switch 语句支持 String
    * try-with-resources
    * catch 多个类型异常
    * 字面值中使用下划线
    * 类型推断
    * 改进泛型类型可变参数其它

* JDK8的新特性：
    * Lambda 表达式
    * 函数式接口
    * 方法引用、构造器引用和数组引用
    * 接口支持默认方法和静态方法
    * Stream API
    * 增强类型推断
    * 新的日期时间 API
    * Optional 类
    * 重复注解和类型注解

* JDK9的新特性：
    * 目录结构
    * 模块化系统
    * jshell
    * 多版本兼容JAR
    * 接口的私有方法
    * 改进try-with-resourcs
    * 改进砖石操作符
    * 限制使用单独下划线标识符
    * String存储结构变更
    * 快速创建只读结合
    * 增强Stream API
    * 改进Optional 类
    * 多分辨率图像 API
    * 全新 HTTP客服端API
    * 智能JAVA 编译工具
    * 统一JVM 日志系统
    * javadoc 的 HTML5 支持
    * java 动态编译

* JDK10的新特性：
    * 局部变量类型推断
    * 将JDK多存储库合并为单储存库
    * 垃圾回收接口
    * 并行Full GC 的G1
    * 应用数据共享
    * 线程局部管控
    * 移除Native-Header Generation Tool （javah）
    * Unicode 标签扩展
    * 备用内存设备上分配堆内存
    * 基于实验JAVA 的JIT 编译器
    * Root 证书
    * 基于时间的版本控制





## 3.10. 设计模式
<a href="#menu" style="float:right">目录</a>

### 3.10.1. 设计原则
<a href="#menu" style="float:right">目录</a>

#### 3.10.1.1. 单一职责原则
* 每个类只负责单一的功能，避免出现复杂臃肿的类。造成维护困难。
#### 3.10.1.2. 里氏替换原则
* 父类出现的地方子类也可以出现。方便实现类替换，减少代码修改。
#### 3.10.1.3. 依赖倒置原则
* 高层模块不应该依赖细节，而应该依赖其抽象
* 也就是说定义类属性时，使用接口或者抽象类来定义，而不是实现类。
#### 3.10.1.4. 接口隔离原则
* 创建单一的接口，不要创建臃肿的接口。每个接口应该只是负责单一的功能，避免增加新抽象方法时，造成较多的实现类页需要修改。
#### 3.10.1.5. 迪米特法则
* 一个类应当降低对其他类的依赖,避免其他类修改时，使用类也要进行修改。
#### 3.10.1.6. 开闭原则
* 对修改关闭，对扩展开放
* 当需要增加新功能时，应当避免修改原类的代码，应当通过一些设计模式来进行功能扩展。比如装饰模式，这样可以达到对其他使用类的影响。
* 以上的原则都是施行指南，开闭原则是最终目标。

### 3.10.2. UML图

![](https://github.com/lgjlife/Java-Study/blob/master/pic/designerPattern/uml.png?raw=true)

### 3.10.3. 单例模式
<a href="#menu" style="float:right">目录</a>

#### 3.10.3.1. 基本概念

**定义**:确保某一个类只有一个对象实例。
**衍生**：有限多例，比如对象池技术，使用缓存将创建的对象缓存起来。
**优点**:
* 减少内存开支，每创建一个对象都会占用一定的系统内存，创建过多容易造成JVM进行垃圾回收。
* 降低系统性能开销，创建和垃圾回收会耗费一定的系统性能
* 从业务层面讲。可以提供公共的资源访问点。

**缺点**:

#### 3.10.3.2. 实现
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

### 3.10.4. 工厂方法模式
<a href="#menu" style="float:right">目录</a>
工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。

![](https://www.runoob.com/wp-content/uploads/2014/08/factory_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
* 主要解决
    * 主要解决接口选择的问题。
* 何时使用
    * 我们明确地计划不同条件下创建不同实例时。
* 如何解决
    * 让其子类实现工厂接口，返回的也是一个抽象的产品。
* 关键代码
    * 创建过程在其子类执行。
* 应用实例
    * 您需要一辆汽车，可以直接从工厂里面提货，而不用去管这辆汽车是怎么做出来的，以及这个汽车里面的具体实现
    * Hibernate 换数据库只需换方言和驱动就可以。
* 优点
    * 一个调用者想创建一个对象，只要知道其名称就可以了。 
    * 扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。 
    * 屏蔽产品的具体实现，调用者只关心产品的接口。
* 缺点
    * 每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
* 使用场景
    * 日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。 
    * 数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。 
    * 设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。
* 注意事项
    * 作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。


### 3.10.5. 抽象工厂模式
<a href="#menu" style="float:right">目录</a>
抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。

![](https://www.runoob.com/wp-content/uploads/2014/08/abstractfactory_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
* 主要解决
    * 主要解决接口选择的问题。
* 何时使用
    * 系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
* 如何解决
    * 在一个产品族里面，定义多个产品。
* 关键代码
    * 在一个工厂里聚合多个同类产品。
* 应用实例：工作了，为了参加一些聚会，肯定有两套或多套衣服吧，比如说有商务装（成套，一系列具体产品）、时尚装（成套，一系列具体产品），甚至对于一个家庭来说，可能有商务女装、商务男装、时尚女装、时尚男装，这些也都是成套的，即一系列具体产品。假设一种情况（现实中是不存在的，要不然，没法进入共产主义了，但有利于说明抽象工厂模式），在您的家中，某一个衣柜（具体工厂）只能存放某一种这样的衣服（成套，一系列具体产品），每次拿这种成套的衣服时也自然要从这个衣柜中取出了。用 OOP 的思想去理解，所有的衣柜（具体工厂）都是衣柜类的（抽象工厂）某一个，而每一件成套的衣服又包括具体的上衣（某一具体产品），裤子（某一具体产品），这些具体的上衣其实也都是上衣（抽象产品），具体的裤子也都是裤子（另一个抽象产品）。
* 优点
    * 当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
* 缺点
    * 产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
* 使用场景
    * QQ 换皮肤，一整套一起换。 
    * 生成不同操作系统的程序。
* 注意事项
    * 产品族难扩展，产品等级易扩展。

### 3.10.6. 模板方法模式
<a href="#menu" style="float:right">目录</a>
在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。

![](https://www.runoob.com/wp-content/uploads/2014/08/template_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
* 主要解决
    * 一些方法通用，却在每一个子类都重新写了这一方法。
* 何时使用
    * 有一些通用的方法。
* 如何解决
    * 将这些通用算法抽象出来。
* 关键代码
    * 在抽象类实现，其他步骤在子类实现。
* 应用实例
    * 在造房子的时候，地基、走线、水管都一样，只有在建筑的后期才有加壁橱加栅栏等差异。
    * 西游记里面菩萨定好的 81 难，这就是一个顶层的逻辑骨架。 3、spring 中对 Hibernate 的支持，将一些已经定好的方法封装起来，比如开启事务、获取 Session、关闭 Session 等，程序员不重复写那些已经规范好的代码，直接丢一个实体就可以保存。
* 优点
    * 封装不变部分，扩展可变部分。
    * 提取公共代码，便于维护。 
    * 行为由父类控制，子类实现。
* 缺点
    * 每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。
* 使用场景
    * 有多个子类共有的方法，且逻辑相同。
    * 重要的、复杂的方法，可以考虑作为模板方法。
* 注意事项
    * 为防止恶意操作，一般模板方法都加上 final 关键词。

### 3.10.7. 建造者模式
<a href="#menu" style="float:right">目录</a>
建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。

![](https://www.runoob.com/wp-content/uploads/2014/08/builder_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
* 主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
* 何时使用
    * 一些基本部件不会变，而其组合经常变化的时候。
* 如何解决
    * 将变与不变分离开。
* 关键代码
    * 建造者：创建和提供实例，导演：管理建造出来的实例的依赖关系。
* 应用实例
    * 去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"。 
    * JAVA 中的 StringBuilder。
* 优点
    * 建造者独立，易扩展。
    * 便于控制细节风险。
* 缺点
    * 产品必须有共同点，范围有限制。
    * 如内部变化复杂，会有很多的建造类。
* 使用场景
    * 需要生成的对象具有复杂的内部结构。
    * 需要生成的对象内部属性本身相互依赖。
* 注意事项
    * 与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。
    
### 3.10.8. 代理模式
<a href="#menu" style="float:right">目录</a>

代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。

![](https://www.runoob.com/wp-content/uploads/2014/08/proxy_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 为其他对象提供一种代理以控制对这个对象的访问。
* 主要解决
    * 在直接访问对象时带来的问题，比如说：要访问的对象在远程的机器上。在面向对象系统中，有些对象由于某些原因（比如对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问），直接访问会给使用者或者系统结构带来很多麻烦，我们可以在访问此对象时加上一个对此对象的访问层。
* 何时使用
    * 想在访问一个类时做一些控制。
* 如何解决
    * 增加中间层。
* 关键代码
    * 实现与被代理类组合。
* 应用实例
    * Windows 里面的快捷方式。 
    * 猪八戒去找高翠兰结果是孙悟空变的，可以这样理解：把高翠兰的外貌抽象出来，高翠兰本人和孙悟空都实现了这个接口，猪八戒访问高翠兰的时候看不出来这个是孙悟空，所以说孙悟空是高翠兰代理类。 
    * 买火车票不一定在火车站买，也可以去代售点。
    * 一张支票或银行存单是账户中资金的代理。支票在市场交易中用来代替现金，并提供对签发人账号上资金的控制。 
    * spring aop。
* 优点
    * 职责清晰。 
    * 高扩展性。 
    * 智能化。
* 缺点
    * 由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢
    * 实现代理模式需要额外的工作，有些代理模式的实现非常复杂。
* 使用场景
    * 按职责来划分，通常有以下使用场景
        * 远程代理。 
        * 虚拟代理。 
        * Copy-on-Write 代理。 
        * 保护（Protect or Access）代理。 
        * Cache代理。 
        * 防火墙（Firewall）代理。 
        * 同步化（Synchronization）代理。 
        * 智能引用（Smart Reference）代理。
* 注意事项
    * 和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。 
    * 和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制。

### 3.10.9. 原型模式
<a href="#menu" style="float:right">目录</a>
原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。例如，一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。

![](https://www.runoob.com/wp-content/uploads/2014/08/prototype_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
* 主要解决
    * 在运行期建立和删除原型。
* 何时使用
    * 当一个系统应该独立于它的产品创建，构成和表示时。
    * 当要实例化的类是在运行时刻指定时，例如，通过动态装载。
    * 为了避免创建一个与产品类层次平行的工厂类层次时。
    * 当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。
* 如何解决
    * 利用已有的一个原型对象，快速地生成和原型对象一样的实例。
* 关键代码
    * 实现克隆操作，在 JAVA 继承 Cloneable，重写 clone()，在 .NET 中可以使用 Object 类的 MemberwiseClone() 方法来实现对象的浅拷贝或通过序列化的方式来实现深拷贝。 
    * 原型模式同样用于隔离类对象的使用者和具体类型（易变类）之间的耦合关系，它同样要求这些"易变类"拥有稳定的接口。
* 应用实例
    * 细胞分裂。 
    * JAVA 中的 Object clone() 方法。
* 优点
    * 性能提高。
    * 逃避构造函数的约束。
* 缺点
    * 配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类不是很难，但对于已有的类不一定很容易，特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候。
    * 必须实现 Cloneable 接口。
* 使用场景
    * 资源优化场景。
    * 类初始化需要消化非常多的资源，这个资源包括数据、硬件资源等。 
    * 性能和安全要求的场景。 
    * 通过 new 产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。 
    * 一个对象多个修改者的场景。 
    * 一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以考虑使用原型模式拷贝多个对象供调用者使用。
    * 在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过 clone 的方法创建一个对象，然后由工厂方法提供给调用者。原型模式已经与 Java 融为浑然一体，大家可以随手拿来使用。
* 注意事项
    * 与通过对一个类进行实例化来构造新对象不同的是，原型模式是通过拷贝一个现有对象生成新对象的。浅拷贝实现 Cloneable，重写，深拷贝是通过实现 Serializable 读取二进制流。

### 3.10.10. 中介者模式
<a href="#menu" style="float:right">目录</a>
中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。中介者模式属于行为型模式。

![](https://www.runoob.com/wp-content/uploads/2014/08/mediator_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
* 主要解决
    * 对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，同时若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时做出相应的处理。
* 何时使用
    * 多个类相互耦合，形成了网状结构。
* 如何解决
    * 将上述网状结构分离为星型结构。
* 关键代码
    * 对象 Colleague 之间的通信封装到一个类中单独处理。
* 应用实例
    * 中国加入 WTO 之前是各个国家相互贸易，结构复杂，现在是各个国家通过 WTO 来互相贸易。
    * 机场调度系统。 3、MVC 框架，其中C（控制器）就是 M（模型）和 V（视图）的中介者。
* 优点
    * 降低了类的复杂度，将一对多转化成了一对一。 
    * 各个类之间的解耦。 3、符合迪米特原则。
* 缺点
    * 中介者会庞大，变得复杂难以维护。
* 使用场景
    * 系统中对象之间存在比较复杂的引用关系，导致它们之间的依赖关系结构混乱而且难以复用该对象。 
    * 想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。
* 注意事项
    * 不应当在职责混乱的时候使用。


```java

```

### 3.10.11. 命令模式
<a href="#menu" style="float:right">目录</a>
命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。

![](https://www.runoob.com/wp-content/uploads/2014/08/command_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。
* 主要解决
    * 在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
* 何时使用
    * 在某些场合，比如要对行为进行"记录、撤销/重做、事务"等处理，这种无法抵御变化的紧耦合是不合适的。在这种情况下，如何将"行为请求者"与"行为实现者"解耦？将一组行为抽象为对象，可以实现二者之间的松耦合。
* 如何解决
    * 通过调用者调用接受者执行命令，顺序：调用者→接受者→命令。
* 关键代码
    * 定义三个角色：
        * received 真正的命令执行对象 
        * Command 
        * invoker 使用命令对象的入口
* 应用实例：
    * struts 1 中的 action 核心控制器 ActionServlet 只有一个，相当于 Invoker，而模型层的类会随着不同的应用有不同的模型类，相当于具体的 Command。
* 优点
    * 降低了系统耦合度。 
    * 新的命令可以很容易添加到系统中去。
* 缺点
    * 使用命令模式可能会导致某些系统有过多的具体命令类。
* 使用场景
    * 认为是命令的地方都可以使用命令模式，比如： 1、GUI 中每一个按钮都是一条命令。 2、模拟 CMD。
* 注意事项
    * 系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作，也可以考虑使用命令模式，见命令模式的扩展。
```java
public interface Order {
   void execute();
}
public class Stock {
   
   private String name = "ABC";
   private int quantity = 10;
 
   public void buy(){
      System.out.println("Stock [ Name: "+name+", 
         Quantity: " + quantity +" ] bought");
   }
   public void sell(){
      System.out.println("Stock [ Name: "+name+", 
         Quantity: " + quantity +" ] sold");
   }
}
public class BuyStock implements Order {
   private Stock abcStock;
 
   public BuyStock(Stock abcStock){
      this.abcStock = abcStock;
   }
 
   public void execute() {
      abcStock.buy();
   }
}
public class SellStock implements Order {
   private Stock abcStock;
 
   public SellStock(Stock abcStock){
      this.abcStock = abcStock;
   }
 
   public void execute() {
      abcStock.sell();
   }
}
public class Broker {
   private List<Order> orderList = new ArrayList<Order>(); 
 
   public void takeOrder(Order order){
      orderList.add(order);      
   }
 
   public void placeOrders(){
      for (Order order : orderList) {
         order.execute();
      }
      orderList.clear();
   }
}
public class CommandPatternDemo {
   public static void main(String[] args) {
      Stock abcStock = new Stock();
 
      BuyStock buyStockOrder = new BuyStock(abcStock);
      SellStock sellStockOrder = new SellStock(abcStock);
 
      Broker broker = new Broker();
      broker.takeOrder(buyStockOrder);
      broker.takeOrder(sellStockOrder);
 
      broker.placeOrders();
   }
}

```
### 3.10.12. 责任链模式
<a href="#menu" style="float:right">目录</a>
顾名思义，责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。

在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。

![]()

**介绍**
* 意图
    * 避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。
* 主要解决
    * 职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，所以职责链将请求的发送者和请求的处理者解耦了。
* 何时使用
    * 在处理消息的时候以过滤很多道。
* 如何解决
    * 拦截的类都实现统一接口。
* 关键代码
    * Handler 里面聚合它自己，在 HandlerRequest 里判断是否合适，如果没达到条件则向下传递，向谁传递之前 set 进去。
* 应用实例
    * 红楼梦中的"击鼓传花"。 
    * JS 中的事件冒泡。 
    * JAVA WEB 中 Apache Tomcat 对 Encoding 的处理，Struts2 的拦截器，jsp servlet 的 Filter。
* 优点
    * 降低耦合度。它将请求的发送者和接收者解耦。 
    * 简化了对象。使得对象不需要知道链的结构。 
    * 增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。 
    * 增加新的请求处理类很方便。
* 缺点
    * 不能保证请求一定被接收。 
    * 系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用。 
    * 可能不容易观察运行时的特征，有碍于除错。
* 使用场景
    * 有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定。 
    * 在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。 
    * 可动态指定一组对象处理请求。
* 注意事项
    * 在 JAVA WEB 中遇到很多应用。
    
### 3.10.13. 装饰模式
<a href="#menu" style="float:right">目录</a>
装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。

这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。

我们通过下面的实例来演示装饰器模式的用法。其中，我们将把一个形状装饰上不同的颜色，同时又不改变形状类。

![](https://www.runoob.com/wp-content/uploads/2014/08/decorator_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
* 主要解决
    * 一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。
* 何时使用
    * 在不想增加很多子类的情况下扩展类。
* 如何解决
    * 将具体功能职责划分，同时继承装饰者模式。
* 关键代码
    * Component 类充当抽象角色，不应该具体实现。 
    * 修饰类引用和继承 Component 类，具体扩展类重写父类方法。
* 应用实例
    * 孙悟空有 72 变，当他变成"庙宇"后，他的根本还是一只猴子，但是他又有了庙宇的功能。 
    * 不论一幅画有没有画框都可以挂在墙上，但是通常都是有画框的，并且实际上是画框被挂在墙上。在挂在墙上之前，画可以被蒙上玻璃，装到框子里；这时画、玻璃和画框形成了一个物体。
* 优点
    * 装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
* 缺点
    * 多层装饰比较复杂。
* 使用场景
    * 扩展一个类的功能。
    * 动态增加功能，动态撤销。
* 注意事项
    * 可代替继承。

### 3.10.14. 策略模式
<a href="#menu" style="float:right">目录</a>
在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。

在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。

![](https://www.runoob.com/wp-content/uploads/2014/08/strategy_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
* 主要解决
    * 在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
* 何时使用
    * 一个系统有许多许多类，而区分它们的只是他们直接的行为。
* 如何解决
    * 将这些算法封装成一个一个的类，任意地替换。
* 关键代码
    * 实现同一个接口。
* 应用实例
    * 诸葛亮的锦囊妙计，每一个锦囊就是一个策略。
    * 旅行的出游方式，选择骑自行车、坐汽车，每一种旅行方式都是一个策略。 
    * JAVA AWT 中的 LayoutManager。
* 优点
    * 算法可以自由切换。 
    * 避免使用多重条件判断。 
    * 扩展性良好。
* 缺点
    * 策略类会增多。 
    * 所有策略类都需要对外暴露。
* 使用场景
    * 如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为。
    * 一个系统需要动态地在几种算法中选择一种。
    * 如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用多重的条件选择语句来实现。
* 注意事项
    * 如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题。
```java
public interface Strategy {
   public int doOperation(int num1, int num2);
}
public class OperationAdd implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 + num2;
   }
}

public class OperationSubstract implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 - num2;
   }
}
public class OperationMultiply implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 * num2;
   }
}
public class Context {
   private Strategy strategy;
 
   public Context(Strategy strategy){
      this.strategy = strategy;
   }
 
   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
}
public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context(new OperationAdd());    
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
 
      context = new Context(new OperationSubstract());      
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
 
      context = new Context(new OperationMultiply());    
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
   }
}


```

### 3.10.15. 适配器模式
<a href="#menu" style="float:right">目录</a>
适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。

这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能。举个真实的例子，读卡器是作为内存卡和笔记本之间的适配器。您将内存卡插入读卡器，再将读卡器插入笔记本，这样就可以通过笔记本来读取内存卡。

我们通过下面的实例来演示适配器模式的使用。其中，音频播放器设备只能播放 mp3 文件，通过使用一个更高级的音频播放器来播放 vlc 和 mp4 文件。

![](https://www.runoob.com/wp-content/uploads/2014/08/adapter_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
* 主要解决
    * 主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，而新环境要求的接口是现对象不能满足的。
* 何时使用
    * 系统需要使用现有的类，而此类的接口不符合系统的需要。
    * 想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作，这些源类不一定有一致的接口。
    * 通过接口转换，将一个类插入另一个类系中。（比如老虎和飞禽，现在多了一个飞虎，在不增加实体的需求下，增加一个适配器，在里面包容一个虎对象，实现飞的接口。）
* 如何解决
    * 继承或依赖（推荐）。
* 关键代码
    * 适配器继承或依赖已有的对象，实现想要的目标接口。

* 应用实例
    * 美国电器 110V，中国 220V，就要有一个适配器将 110V 转化为 220V。 
    * JAVA JDK 1.1 提供了 Enumeration 接口，而在 1.2 中提供了 Iterator 接口，想要使用 1.2 的 JDK，则要将以前系统的 Enumeration 接口转化为 Iterator 接口，这时就需要适配器模式。
    * 在 LINUX 上运行 WINDOWS 程序。 
    * JAVA 中的 jdbc。
* 优点
    * 可以让任何两个没有关联的类一起运行。
    * 提高了类的复用。 
    * 增加了类的透明度。 
    * 灵活性好。
* 缺点
    * 过多地使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是 A 接口，其实内部被适配成了 B 接口的实现，一个系统如果太多出现这种情况，无异于一场灾难。因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构。 2.由于 JAVA 至多继承一个类，所以至多只能适配一个适配者类，而且目标类必须是抽象类。

* 使用场景
    * 有动机地修改一个正常运行的系统的接口，这时应该考虑使用适配器模式。
* 注意事项
    * 适配器不是在详细设计时添加的，而是解决正在服役的项目的问题。
```java
public interface MediaPlayer {
   public void play(String audioType, String fileName);
}
public interface AdvancedMediaPlayer { 
   public void playVlc(String fileName);
   public void playMp4(String fileName);
}
public class VlcPlayer implements AdvancedMediaPlayer{
   @Override
   public void playVlc(String fileName) {
      System.out.println("Playing vlc file. Name: "+ fileName);      
   }
 
   @Override
   public void playMp4(String fileName) {
      //什么也不做
   }
}
public class Mp4Player implements AdvancedMediaPlayer{
 
   @Override
   public void playVlc(String fileName) {
      //什么也不做
   }
 
   @Override
   public void playMp4(String fileName) {
      System.out.println("Playing mp4 file. Name: "+ fileName);      
   }
}
public class MediaAdapter implements MediaPlayer {
 
   AdvancedMediaPlayer advancedMusicPlayer;
 
   public MediaAdapter(String audioType){
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();       
      } else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }  
   }
 
   @Override
   public void play(String audioType, String fileName) {
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}
public class AudioPlayer implements MediaPlayer {
   MediaAdapter mediaAdapter; 
 
   @Override
   public void play(String audioType, String fileName) {    
 
      //播放 mp3 音乐文件的内置支持
      if(audioType.equalsIgnoreCase("mp3")){
         System.out.println("Playing mp3 file. Name: "+ fileName);         
      } 
      //mediaAdapter 提供了播放其他文件格式的支持
      else if(audioType.equalsIgnoreCase("vlc") 
         || audioType.equalsIgnoreCase("mp4")){
         mediaAdapter = new MediaAdapter(audioType);
         mediaAdapter.play(audioType, fileName);
      }
      else{
         System.out.println("Invalid media. "+
            audioType + " format not supported");
      }
   }   
}
public class AdapterPatternDemo {
   public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();
 
      audioPlayer.play("mp3", "beyond the horizon.mp3");
      audioPlayer.play("mp4", "alone.mp4");
      audioPlayer.play("vlc", "far far away.vlc");
      audioPlayer.play("avi", "mind me.avi");
   }
}

```

### 3.10.16. 迭代器模式
<a href="#menu" style="float:right">目录</a>
迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。

迭代器模式属于行为型模式。

![]()

**介绍** 
* 意图
    * 提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
* 主要解决
    * 不同的方式来遍历整个整合对象。
* 何时使用
    * 遍历一个聚合对象。
* 如何解决
    * 把在元素之间游走的责任交给迭代器，而不是聚合对象。
* 关键代码
    * 定义接口：hasNext, next。
* 应用实例
    * JAVA 中的 iterator。
* 优点
    * 它支持以不同的方式遍历一个聚合对象。
    * 迭代器简化了聚合类。
    * 在同一个聚合上可以有多个遍历。 
    * 在迭代器模式中，增加新的聚合类和迭代器类都很方便，无须修改原有代码。
* 缺点
    * 由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性。
* 使用场景
    * 访问一个聚合对象的内容而无须暴露它的内部表示。 
    * 需要为聚合对象提供多种遍历方式。 
    * 为遍历不同的聚合结构提供一个统一的接口。
* 注意事项
    * 迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器类来负责，这样既可以做到不暴露集合的内部结构，又可让外部代码透明地访问集合内部的数据。

### 3.10.17. 组合模式
<a href="#menu" style="float:right">目录</a>
组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。

这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。

我们通过下面的实例来演示组合模式的用法。实例演示了一个组织中员工的层次结构。

![]()

**介绍**  
* 意图
    * 将对象组合成树形结构以表示"部分-整体"的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
* 主要解决
    * 它在我们树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以向处理简单元素一样来处理复杂元素，从而使得客户程序与复杂元素的内部结构解耦。
* 何时使用
    * 您想表示对象的部分-整体层次结构（树形结构）。 
    * 您希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
* 如何解决
    * 树枝和叶子实现统一接口，树枝内部组合该接口。
* 关键代码
    * 树枝内部组合该接口，并且含有内部属性 List，里面放 Component。

* 应用实例
    * 算术表达式包括操作数、操作符和另一个操作数，其中，另一个操作符也可以是操作数、操作符和另一个操作数。
    * 在 JAVA AWT 和 SWING 中，对于 Button 和 Checkbox 是树叶，Container 是树枝。
* 优点
    * 高层模块调用简单。 
    * 节点自由增加。
* 缺点
    * 在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
* 使用场景
    * 部分、整体场景，如树形菜单，文件、文件夹的管理。
* 注意事项
    * 定义时为具体类。


### 3.10.18. 观察者模式
<a href="#menu" style="float:right">目录</a>
当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知它的依赖对象。观察者模式属于行为型模式。

![](https://www.runoob.com/wp-content/uploads/2014/08/observer_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
* 主要解决
    * 一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。
* 何时使用
    * 一个对象（目标对象）的状态发生改变，所有的依赖对象（观察者对象）都将得到通知，进行广播通知。
* 如何解决
    * 使用面向对象技术，可以将这种依赖关系弱化。
* 关键代码
    * 在抽象类里有一个 ArrayList 存放观察者们。
* 应用实例
    * 拍卖的时候，拍卖师观察最高标价，然后通知给其他竞价者竞价。 
    * 西游记里面悟空请求菩萨降服红孩儿，菩萨洒了一地水招来一个老乌龟，这个乌龟就是观察者，他观察菩萨洒水这个动作。
* 优点
    * 观察者和被观察者是抽象耦合的。 
    * 建立一套触发机制。
* 缺点
    * 如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。
    * 如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。 
    * 观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。
* 使用场景：
    * 一个抽象模型有两个方面，其中一个方面依赖于另一个方面。将这些方面封装在独立的对象中使它们可以各自独立地改变和复用。
    * 一个对象的改变将导致其他一个或多个对象也发生改变，而不知道具体有多少对象将发生改变，可以降低对象之间的耦合度。
    * 一个对象必须通知其他对象，而并不知道这些对象是谁。
    * 需要在系统中创建一个触发链，A对象的行为将影响B对象，B对象的行为将影响C对象……，可以使用观察者模式创建一种链式触发机制。
* 注意事项
    * JAVA 中已经有了对观察者模式的支持类。 
    * 避免循环引用。 
    * 如果顺序执行，某一观察者错误会导致系统卡壳，一般采用异步方式。
```java
public class Subject {
   
   private List<Observer> observers 
      = new ArrayList<Observer>();
   private int state;
 
   public int getState() {
      return state;
   }
 
   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }
 
   public void attach(Observer observer){
      observers.add(observer);      
   }
 
   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   }  
}
public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}
public class BinaryObserver extends Observer{
 
   public BinaryObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
 
   @Override
   public void update() {
      System.out.println( "Binary String: " 
      + Integer.toBinaryString( subject.getState() ) ); 
   }
}
public class OctalObserver extends Observer{
 
   public OctalObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
 
   @Override
   public void update() {
     System.out.println( "Octal String: " 
     + Integer.toOctalString( subject.getState() ) ); 
   }
}
public class HexaObserver extends Observer{
 
   public HexaObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
 
   @Override
   public void update() {
      System.out.println( "Hex String: " 
      + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
}
public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();
 
      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);
 
      System.out.println("First state change: 15");   
      subject.setState(15);
      System.out.println("Second state change: 10");  
      subject.setState(10);
   }
}

```

### 3.10.19. 门面模式
<a href="#menu" style="float:right">目录</a>
外观模式（Facade Pattern）隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。

这种模式涉及到一个单一的类，该类提供了客户端请求的简化方法和对现有系统类方法的委托调用。

![](https://www.runoob.com/wp-content/uploads/2014/08/facade_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
* 主要解决
    * 降低访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口。
* 何时使用
    * 客户端不需要知道系统内部的复杂联系，整个系统只需提供一个"接待员"即可。 
    * 定义系统的入口。
* 如何解决
    * 客户端不与系统耦合，外观类与系统耦合。
* 关键代码
    * 在客户端和复杂系统之间再加一层，这一层将调用顺序、依赖关系等处理好。
* 应用实例
    * 去医院看病，可能要去挂号、门诊、划价、取药，让患者或患者家属觉得很复杂，如果有提供接待人员，只让接待人员来处理，就很方便。
    * JAVA 的三层开发模式。
* 优点
    * 减少系统相互依赖。 
    * 提高灵活性。 
    * 提高了安全性。
* 缺点
    * 不符合开闭原则，如果要改东西很麻烦，继承重写都不合适。
* 使用场景
    * 为复杂的模块或子系统提供外界访问的模块。 
    * 子系统相对独立。 
    * 预防低水平人员带来的风险。
* 注意事项
    * 在层次化结构中，可以使用外观模式定义系统中每一层的入口。

### 3.10.20. 备忘录模式
<a href="#menu" style="float:right">目录</a>
备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。

![](https://www.runoob.com/wp-content/uploads/2014/08/memento_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
* 主要解决
    * 所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。
* 何时使用
    * 很多时候我们总是需要记录一个对象的内部状态，这样做的目的就是为了允许用户取消不确定或者错误的操作，能够恢复到他原先的状态，使得他有"后悔药"可吃。
* 如何解决
    * 通过一个备忘录类专门存储对象状态。
* 关键代码
    * 客户不与备忘录类耦合，与备忘录管理类耦合。
* 应用实例
    * 后悔药。 
    * 打游戏时的存档。 
    * Windows 里的 ctri + z。 
    * IE 中的后退。 
    * 数据库的事务管理。
* 优点
    * 给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。 
    * 实现了信息的封装，使得用户不需要关心状态的保存细节。
* 缺点
    * 消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。
* 使用场景
    * 需要保存/恢复数据的相关状态场景。 
    * 提供一个可回滚的操作。
* 注意事项
    * 为了符合迪米特原则，还要增加一个管理备忘录的类。 
    * 为了节约内存，可使用原型模式+备忘录模式。

```java
public class Memento {
   private String state;
 
   public Memento(String state){
      this.state = state;
   }
 
   public String getState(){
      return state;
   }  
}
public class Originator {
   private String state;
 
   public void setState(String state){
      this.state = state;
   }
 
   public String getState(){
      return state;
   }
 
   public Memento saveStateToMemento(){
      return new Memento(state);
   }
 
   public void getStateFromMemento(Memento Memento){
      state = Memento.getState();
   }
}

public class CareTaker {
   private List<Memento> mementoList = new ArrayList<Memento>();
 
   public void add(Memento state){
      mementoList.add(state);
   }
 
   public Memento get(int index){
      return mementoList.get(index);
   }
}
public class MementoPatternDemo {
   public static void main(String[] args) {
      Originator originator = new Originator();
      CareTaker careTaker = new CareTaker();
      originator.setState("State #1");
      originator.setState("State #2");
      careTaker.add(originator.saveStateToMemento());
      originator.setState("State #3");
      careTaker.add(originator.saveStateToMemento());
      originator.setState("State #4");
 
      System.out.println("Current State: " + originator.getState());    
      originator.getStateFromMemento(careTaker.get(0));
      System.out.println("First saved State: " + originator.getState());
      originator.getStateFromMemento(careTaker.get(1));
      System.out.println("Second saved State: " + originator.getState());
   }
}
```


### 3.10.21. 访问者模式
<a href="#menu" style="float:right">目录</a>
在访问者模式（Visitor Pattern）中，我们使用了一个访问者类，它改变了元素类的执行算法。通过这种方式，元素的执行算法可以随着访问者改变而改变。这种类型的设计模式属于行为型模式。根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。

![](https://www.runoob.com/wp-content/uploads/2014/08/visitor_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 主要将数据结构与数据操作分离。
* 主要解决
    * 稳定的数据结构和易变的操作耦合问题。
* 何时使用
    * 需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，使用访问者模式将这些封装到类中。
* 如何解决
    * 在被访问的类里面加一个对外提供接待访问者的接口。
* 关键代码
    * 在数据基础类里面有一个方法接受访问者，将自身引用传入访问者。
* 应用实例
    * 您在朋友家做客，您是访问者，朋友接受您的访问，您通过朋友的描述，然后对朋友的描述做出一个判断，这就是访问者模式。
* 优点
    * 符合单一职责原则。 
    * 优秀的扩展性。 
    * 灵活性。
* 缺点
    * 具体元素对访问者公布细节，违反了迪米特原则。 
    * 具体元素变更比较困难。 
    * 违反了依赖倒置原则，依赖了具体类，没有依赖抽象。
* 使用场景
    * 对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作。 
    * 需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，也不希望在增加新操作时修改这些类。
* 注意事项：访问者可以对功能进行统一，可以做报表、UI、拦截器与过滤器。
```java
public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}
public class Keyboard  implements ComputerPart {
 
   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}
public class Monitor  implements ComputerPart {
 
   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}

public class Mouse  implements ComputerPart {
 
   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}
public class Computer implements ComputerPart {
   
   ComputerPart[] parts;
 
   public Computer(){
      parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};      
   } 
 
 
   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      for (int i = 0; i < parts.length; i++) {
         parts[i].accept(computerPartVisitor);
      }
      computerPartVisitor.visit(this);
   }
}
public interface ComputerPartVisitor {
   public void visit(Computer computer);
   public void visit(Mouse mouse);
   public void visit(Keyboard keyboard);
   public void visit(Monitor monitor);
}
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
 
   @Override
   public void visit(Computer computer) {
      System.out.println("Displaying Computer.");
   }
 
   @Override
   public void visit(Mouse mouse) {
      System.out.println("Displaying Mouse.");
   }
 
   @Override
   public void visit(Keyboard keyboard) {
      System.out.println("Displaying Keyboard.");
   }
 
   @Override
   public void visit(Monitor monitor) {
      System.out.println("Displaying Monitor.");
   }
}
public class VisitorPatternDemo {
   public static void main(String[] args) {
 
      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
   }
}


```


### 3.10.22. 状态模式
<a href="#menu" style="float:right">目录</a>
在状态模式（State Pattern）中，类的行为是基于它的状态改变的。这种类型的设计模式属于行为型模式。

在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。

![](https://www.runoob.com/wp-content/uploads/2014/08/state_pattern_uml_diagram.png)
**介绍**
* 意图
    * 允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
* 主要解决
    * 对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。
* 何时使用
    * 代码中包含大量与对象状态有关的条件语句。
* 如何解决
    * 将各种具体的状态类抽象出来。
* 关键代码
    * 通常命令模式的接口中只有一个方法。而状态模式的接口中有一个或者多个方法。而且，状态模式的实现类的方法，一般返回值，或者是改变实例变量的值。也就是说，状态模式一般和对象的状态有关。实现类的方法有不同的功能，覆盖接口中的方法。状态模式和命令模式一样，也可以用于消除 if...else 等条件选择语句。
* 应用实例
    * 打篮球的时候运动员可以有正常状态、不正常状态和超常状态。 
    * 曾侯乙编钟中，'钟是抽象接口','钟A'等是具体状态，'曾侯乙编钟'是具体环境（Context）。
* 优点
    * 封装了转换规则。
    * 枚举可能的状态，在枚举状态之前需要确定状态种类。 
    * 将所有与某个状态有关的行为放到一个类中，并且可以方便地增加新的状态，只需要改变对象状态即可改变对象的行为。
    * 允许状态转换逻辑与状态对象合成一体，而不是某一个巨大的条件语句块。 
    * 可以让多个环境对象共享一个状态对象，从而减少系统中对象的个数。
* 缺点
    * 状态模式的使用必然会增加系统类和对象的个数。 
    * 状态模式的结构与实现都较为复杂，如果使用不当将导致程序结构和代码的混乱。 
    * 状态模式对"开闭原则"的支持并不太好，对于可以切换状态的状态模式，增加新的状态类需要修改那些负责状态转换的源代码，否则无法切换到新增状态，而且修改某个状态类的行为也需修改对应类的源代码。
* 使用场景
    * 行为随状态改变而改变的场景。 
    * 条件、分支语句的代替者。
* 注意事项
    * 在行为受状态约束的时候使用状态模式，而且状态不超过 5 个。
```java
public interface State {
   public void doAction(Context context);
}
public class StartState implements State {
 
   public void doAction(Context context) {
      System.out.println("Player is in start state");
      context.setState(this); 
   }
 
   public String toString(){
      return "Start State";
   }
}
public class StopState implements State {
 
   public void doAction(Context context) {
      System.out.println("Player is in stop state");
      context.setState(this); 
   }
 
   public String toString(){
      return "Stop State";
   }
}
public class Context {
   private State state;
 
   public Context(){
      state = null;
   }
 
   public void setState(State state){
      this.state = state;     
   }
 
   public State getState(){
      return state;
   }
}

public class StatePatternDemo {
   public static void main(String[] args) {
      Context context = new Context();
 
      StartState startState = new StartState();
      startState.doAction(context);
 
      System.out.println(context.getState().toString());
 
      StopState stopState = new StopState();
      stopState.doAction(context);
 
      System.out.println(context.getState().toString());
   }
}
```



### 3.10.23. 解释器模式
<a href="#menu" style="float:right">目录</a>
解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，它属于行为型模式。这种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。

![](https://www.runoob.com/wp-content/uploads/2014/08/interpreter_pattern_uml_diagram.jpg)
**介绍**
* 意图
    * 给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。
* 主要解决
    * 对于一些固定文法构建一个解释句子的解释器。
* 何时使用
    * 如果一种特定类型的问题发生的频率足够高，那么可能就值得将该问题的各个实例表述为一个简单语言中的句子。这样就可以构建一个解释器，该解释器通过解释这些句子来解决该问题。
* 如何解决
    * 构建语法树，定义终结符与非终结符。
* 关键代码
    * 构建环境类，包含解释器之外的一些全局信息，一般是 HashMap。
* 应用实例
    * 编译器、运算表达式计算。
* 优点
    * 可扩展性比较好，灵活。 
    * 增加了新的解释表达式的方式。
    * 易于实现简单文法。
* 缺点
    * 可利用场景比较少。 
    * 对于复杂的文法比较难维护。 
    * 解释器模式会引起类膨胀。 
    * 解释器模式采用递归调用方法。
* 使用场景
    * 可以将一个需要解释执行的语言中的句子表示为一个抽象语法树。 
    * 一些重复出现的问题可以用一种简单的语言来进行表达。 
    * 一个简单语法需要解释的场景。
* 注意事项
    * 可利用场景比较少，JAVA 中如果碰到可以用 expression4J 代替
```java

public interface Expression {
   public boolean interpret(String context);
}
public class TerminalExpression implements Expression {
   
   private String data;
 
   public TerminalExpression(String data){
      this.data = data; 
   }
 
   @Override
   public boolean interpret(String context) {
      if(context.contains(data)){
         return true;
      }
      return false;
   }
}
public class OrExpression implements Expression {
    
   private Expression expr1 = null;
   private Expression expr2 = null;
 
   public OrExpression(Expression expr1, Expression expr2) { 
      this.expr1 = expr1;
      this.expr2 = expr2;
   }
 
   @Override
   public boolean interpret(String context) {      
      return expr1.interpret(context) || expr2.interpret(context);
   }
}
public class AndExpression implements Expression {
    
   private Expression expr1 = null;
   private Expression expr2 = null;
 
   public AndExpression(Expression expr1, Expression expr2) { 
      this.expr1 = expr1;
      this.expr2 = expr2;
   }
 
   @Override
   public boolean interpret(String context) {      
      return expr1.interpret(context) && expr2.interpret(context);
   }
}
public class InterpreterPatternDemo {
 
   //规则：Robert 和 John 是男性
   public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert, john);    
   }
 
   //规则：Julie 是一个已婚的女性
   public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);    
   }
 
   public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();
 
      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie is a married women? " 
      + isMarriedWoman.interpret("Married Julie"));
   }
}
```


### 3.10.24. 享元模式
<a href="#menu" style="float:right">目录</a>
享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。

享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。我们将通过创建 5 个对象来画出 20 个分布于不同位置的圆来演示这种模式。由于只有 5 种可用的颜色，所以 color 属性被用来检查现有的 Circle 对象。

![](https://www.runoob.com/wp-content/uploads/2014/08/flyweight_pattern_uml_diagram-1.jpg)


**介绍**
* 意图
    * 运用共享技术有效地支持大量细粒度的对象。
* 主要解决
    * 在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建。
* 何时使用
    * 系统中有大量对象。 
    * 这些对象消耗大量内存。 
    * 这些对象的状态大部分可以外部化。 
    * 这些对象可以按照内蕴状态分为很多组，当把外蕴对象从对象中剔除出来时，每一组对象都可以用一个对象来代替。 
    * 系统不依赖于这些对象身份，这些对象是不可分辨的。
* 如何解决
    * 用唯一标识码判断，如果在内存中有，则返回这个唯一标识码所标识的对象。
* 关键代码
    * 用 HashMap 存储这些对象。
* 应用实例
    * JAVA 中的 String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面。
    * 数据库的数据池。
* 优点
    * 大大减少对象的创建，降低系统的内存，使效率提高。
* 缺点
    * 提高了系统的复杂度，需要分离出外部状态和内部状态，而且外部状态具有固有化的性质，不应该随着内部状态的变化而变化，否则会造成系统的混乱。
* 使用场景
    * 系统有大量相似对象
    * 需要缓冲池的场景。
* 注意事项
    * 注意划分外部状态和内部状态，否则可能会引起线程安全问题。
    * 这些类必须有一个工厂对象加以控制。


### 3.10.25. 桥梁模式
<a href="#menu" style="float:right">目录</a>
桥梁模式（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。

这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。

我们通过下面的实例来演示桥接模式（Bridge Pattern）的用法。其中，可以使用相同的抽象类方法但是不同的桥接实现类，来画出不同颜色的圆。

![](https://www.runoob.com/wp-content/uploads/2014/08/bridge_pattern_uml_diagram.jpg)
**介绍**



* 意图
    * 将抽象部分与实现部分分离，使它们都可以独立的变化。
* 主要解决
    * 在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
* 何时使用
    * 实现系统可能有多个角度分类，每一种角度都可能变化。
* 如何解决
    * 把这种多角度分类分离出来，让它们独立变化，减少它们之间耦合。
* 关键代码
    * 抽象类依赖实现类。
* 应用实例
    * 猪八戒从天蓬元帅转世投胎到猪，转世投胎的机制将尘世划分为两个等级，即：灵魂和肉体，前者相当于抽象化，后者相当于实现化。生灵通过功能的委派，调用肉体对象的功能，使得生灵可以动态地选择。 2、墙上的开关，可以看到的开关是抽象的，不用管里面具体怎么实现的。
* 优点
    * 抽象和实现的分离。 
    * 优秀的扩展能力。 
    * 实现细节对客户透明。
* 缺点
    * 桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。
* 使用场景
    * 如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系
    * 对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。 
    * 一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
* 注意事项
    * 对于两个独立变化的维度，使用桥接模式再适合不过了。
```java
public interface DrawAPI {
   public void drawCircle(int radius, int x, int y);
}
public class RedCircle implements DrawAPI {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing Circle[ color: red, radius: "
         + radius +", x: " +x+", "+ y +"]");
   }
}
public class GreenCircle implements DrawAPI {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing Circle[ color: green, radius: "
         + radius +", x: " +x+", "+ y +"]");
   }
}
public abstract class Shape {
   protected DrawAPI drawAPI;
   protected Shape(DrawAPI drawAPI){
      this.drawAPI = drawAPI;
   }
   public abstract void draw();  
}
public class Circle extends Shape {
   private int x, y, radius;
 
   public Circle(int x, int y, int radius, DrawAPI drawAPI) {
      super(drawAPI);
      this.x = x;  
      this.y = y;  
      this.radius = radius;
   }
 
   public void draw() {
      drawAPI.drawCircle(radius,x,y);
   }
}
public class BridgePatternDemo {
   public static void main(String[] args) {
      Shape redCircle = new Circle(100,100, 10, new RedCircle());
      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
 
      redCircle.draw();
      greenCircle.draw();
   }
}
```






<span id="menu">

<h1>多线程</h1>


# 4. 多线程
## 4.1. 基本概念
<a href="#menu" style="float:right">目录</a>

* 进程
    * 受操作系统管理和资源分配的基本单元，进程之间的内存空间是相互独立的。
* 线程
    * 进程中独立运行的子任务，线程共享进程内存空间。
* 串行&并行&并发
    * 串行:一个任务执行完再去执行其他任务
    * 并行:任务交替执行，就好象同时执行一样
    * 并发:任务同步执行，多核CPU的计算机，可以同步执行任务
* 使用多线程优点
    * 多核CPU的时候，可以有效利用多核提高程序执行效率
    * 在程序任务阻塞的场景下，利用多线程执行其他任务，提高执行效率
* 临界区
    * 临界区用来表示一种公共资源或者共享数据
* 线程安全
    * 一段操纵共享数据的代码能够保证在同一时间内被多个线程执行而仍然能够保持其正确性，就被称为是线程安全的

* 死锁
    * 多个线程阻塞在临界区，都无法获取到锁，程序无法继续执行
* 饥饿锁
    * 一个线程因为种种原因无法获取到所需要的资源，导致一直无法执行，比如线程优先级低。
* 活锁
    * 主动将资源让给他人而自己无法执行。
* 并发级别
    * 阻塞
    * 无饥饿
    * 无障碍
    * 无锁
    * 无等待
* JMM模型
    * 原子性
        * 一组不能够被打断的操作具有原子性
    * 可见性
        * 一个线程修改了某个变量的值，其他线程是否能改看到该值的变化
    * 有序性
        * 在执行程序时，为了提高性能，编译器和处理器常常会对指令进行重排序
    * Happen-before原则
        * 程序顺序规则：一个线程中的每个操作，happens-before于该线程中的任意后续操作。
        * 监视器锁规则：对一个锁的解锁，happens-before于随后对这个锁的加锁。
        * volatile变量规则：对一个volatile域的写，happens-before于任意后续对这个volatile域的读。
        * 传递性：如果A happens-before B，且B happens-before C，那么A happens-before C。
        * start()规则：如果线程A执行操作ThreadB.start()（启动线程B），那么A线程的ThreadB.start()操作happens-before于线程B中的任意操作。
        * Join()规则：如果线程A执行操作ThreadB.join()并成功返回，那么线程B中的任意操作happens-before于线程A从ThreadB.join()操作成功返回。
        * 程序中断规则：对线程interrupted()方法的调用先行于被中断线程的代码检测到中断时间的发生。
        * 对象finalize规则：一个对象的初始化完成（构造函数执行结束）先行于发生它的finalize()方法的开始



## 4.2. Java多线程
<a href="#menu" style="float:right">目录</a>

### 4.2.1. 实现方式
**方式1:继承Thread类**
```java

class MyThread1  extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread1");
    }
}

 public  static  void stype1(){

        Thread thread = new MyThread1();
        thread.start();
 }
```
**方式2:实现Runnable**
```java
class MyThread2  implements Runnable{

    public void run() {
        System.out.println("MyThread2");
    }
}
 public  static  void stype1(){

    MyThread2 thread2 = new MyThread2();
    Thread  th =  new Thread(thread2);
    th.start();
 }
```
**方式3:实现Callable**
```java

class MyThread3  implements Callable {

    public Object call() throws Exception {
        System.out.println("MyThread3");
        return 123;
    }

}
 public  static  void stype1(){

    MyThread3 thread3 = new MyThread3();

    FutureTask<Integer> result = new FutureTask<Integer>(thread3);
    Thread  th1 =  new Thread(result);
    th1.start();

    try{
        System.out.println( result.get());
    }
    catch(Exception ex){

    }
}
```

*   Callable和Runnable的区别
```java
public interface Callable<V> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    V call() throws Exception;
}
public interface Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see     java.lang.Thread#run()
     */
    public abstract void run();
}
```
通过Callable配合Future类可以获取线程的执行结果。

### 4.2.2. 基本属性
* 线程名称，主线程为main，其他线程为Thread-1,Thread-2,可自定义，用于区分不同的线程。
* 线程分组
* 线程优先级
* 守护线程标志，默认为非守护线程

### 4.2.3. 常用方法

* run & start
    * run 方法是Runable接口的方法，是线程执行任务的方法，线程类需要实现该方法
    * start 是Thread类的方法，用于告知操作系统需要启动该线程，至于何时执行run中的任务代码，由操作系统决定
    * 直接调用run方法相当于调用一个普通方法，不会以多线程方式执行。
    * start只能允许调用一次，多次调用将会抛出异常
* yield
    * 该方法让线程放弃CPU，让其它线程执行，何时能改继续执行由操作系统决定，可能调用之后右获得继续执行，也可能等待其他任务执行

* sleep 
    * 线程进入睡眠状态，不会释放持有的锁
    * 如果线程被中断，将会抛出InterruptedException异常

* stop
    * 退出当前线程，调用之后线程任务将不会再被执行
    * 由于是强制退出，由可能会造成数据不一致，资源没释放等问题，不建议使用


* interrupt
    * 中断线程，并不会造成线程暂停问题，会将中断标志位置位
    * 如果线程中正在调用能够抛出异常InterruptedException的方法，将会抛出该异常

*  interrupted & isInterrupted
    * interrupted 是静态方法，测试当前线程(调用代码所在的线程)是否被中断
    * isInterrupted 测试调用线程是否被中断
    * 可以使用中断来实现优雅停止线程，其他线程中断要被停止的线程，被停止的线程循环检测中断位，有中断则抛出异常，在捕获代码里执行释放资源等操作

* suspend & resume
    * suspend 暂停阻塞线程执行
    * resume 恢复线程执行
    * 由于suspend不会释放锁持有的锁，使其他线程无法访问该资源
    * 假如resume没能执行，将会造成严重的死锁，所以不推荐使用这两个方法

* setDaemon 
    * 守护线程设置，默认为非守护线程
    * 该方法必须在调用start之前执行，否则将会抛出异常
    * 守护线程在所有非守护线程执行完后将会自动停止，垃圾回收器就是守护线程

* setPriority
    * 线程优先级设置，范围为1-10,默认为5
    * 线程优先级具有继承特性，比如A线程启动B线程，B线程的优先级和A线程一样
    * 线程优先级会映射到操作系统的优先级等级，比如有的操作系统是7个等级的优先级
    * 等级越大，操作系统将会分配更多的时间给该线程，但并不意味着一定先完成

* join
    * 用于等待调用的线程执行结束
    * 内部使用wait实现，所以会释放锁
    
### 4.2.4. 生命周期 & 线程状态

* 线程创建
* 线程运行
    * 使用start方法，向操作系统提交线程任务
* 线程结束
    * 调用 stop ,不推荐
    * run方法正常执行完
    * 直接调用return返回
    * 使用中断法，在捕获里面处理好后再嗲用return结束线程。
    * 抛出未捕获的异常或者error

* 线程状态
![](https://github.com/lgjlife/Java-Study/blob/master/pic/thread/thread-state.png?raw=true)
* New
    * 新建状态。创建线程后但还未调用start时的状态
* Runnable
    * 可运行状态。要么处于执行状态，要么由于线程切换等待状态

* Waiting & Timed  Waiting
    * 等待阶段。将释放线程锁持有的锁

* Block
    * 阻塞状态。不会释放线程所持有的锁
* Terminated
    * 结束状态
### 4.2.5. 线程监控工具
* jstack
查看线程的状态，优先级，可以检测是否存在死锁
```
//使用jps查看Java应用的pid
lgj@lgj-Lenovo-G470:~/aProject/aRealPrj/Java-Interview$ jps
13872 RemoteMavenServer
15121 SpringSchedulerApplication
12642 Main
3349 Jps
//jstack查看线程情况
lgj@lgj-Lenovo-G470:~/aProject/aRealPrj/Java-Interview$ jstack 13872
2019-07-05 14:51:57
Full thread dump OpenJDK 64-Bit Server VM (25.152-b26 mixed mode):

"Attach Listener" #288 daemon prio=9 os_prio=0 tid=0x00007f6e60001000 nid=0xd4b runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"RMI Scheduler(0)" #17 daemon prio=5 os_prio=0 tid=0x00007f6e38015800 nid=0x364f waiting on condition [0x00007f6e7fcdf000]
   java.lang.Thread.State: TIMED_WAITING (parking)
	at sun.misc.Unsafe.park(Native Method)
	- parking to wait for  <0x00000000d00a2f88> (a java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)
	at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(AbstractQueuedSynchronizer.java:2078)
	at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:1093)
	at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(ScheduledThreadPoolExecutor.java:809)
	at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1067)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1127)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)

"VM Thread" os_prio=0 tid=0x00007f6ea007b800 nid=0x3636 runnable 

"GC task thread#0 (ParallelGC)" os_prio=0 tid=0x00007f6ea0023800 nid=0x3632 runnable 

"GC task thread#1 (ParallelGC)" os_prio=0 tid=0x00007f6ea0025000 nid=0x3633 runnable 

"GC task thread#2 (ParallelGC)" os_prio=0 tid=0x00007f6ea0027000 nid=0x3634 runnable 

"GC task thread#3 (ParallelGC)" os_prio=0 tid=0x00007f6ea0028800 nid=0x3635 runnable 

"VM Periodic Task Thread" os_prio=0 tid=0x00007f6ea00cb000 nid=0x363e waiting on condition 

JNI global references: 200

```
* jconsole,jvisual 
集成多个java命令，通过界面查看各个状态

## 4.3. Synchronized
<a href="#menu" style="float:right">目录</a>
### 4.3.1. 基本概念
* 为什么要同步
看一个简单的例子：
```java
i++;
```
这条语句实际上主要包含了三个操作。
1.从内存中获取i值
2.对i进行自增操作
3.将新值写入内存中

这三个操作不具有原子性，任何操作之间都有可能执行其他指令，最终导致结果出现错误,也就是非线程安全。
因此需要对这个i++操作进行同步，同一时刻只能有一个线程访问该操作。Java中能实现这个功能的有使用Synchronized和Lock.
本节讲解的是Synchronized.

**线程安全：**如果一个操作在多线程和单线程环境下执行，都具备相同的执行结果和正确性，则说明该操作是线程安全的。
**临界区:**被同步的代码
**重入锁：**可重入特性是指当一个线程获取到了对象的锁，再次申请时也可以获取到该锁。Synchronized和Lock都具有可重入特性。可重入特性避免了死锁的发生。
比如如下例子
同步方法func1调用同步方法func2，即使两个都使用synchronized进行加锁，虽然是同一把锁，监视器都是同一个对象，但是func2还是能执行,因为具备了可重入特性。
```java
class Service{

    public synchronized void func1(){
        this.func2();
    }
    public synchronized void func2(){
      
    }

}
```

* Synchronized不具有继承性，也就是父类方法使用synchronized进行同步，如果子类重写的方法也要具备同步，是需要添加synchronized的。
* synchronized具有可重入特性  
* 发生未捕获的异常时，线程将会释放锁并退出。

### 4.3.2. 基本使用
* 同步语句
**同步方法**
```java
class Service{
    private int count;
    public synchronized void inc(){
        count++;
    }
}
```
* 如果同步的是普通方法，则同步对象为当前对象
* 如果同步的是静态方法，则同步对象为类

* 同步语句
**同步语句**
```java
//同步当前调用对象
class Service{
    private int count;
    public  void inc(){
        synchronized(this){
            count++;
        }
       
    }
}

//同步lock属性
class Service{
    private int count;
    private String lock="lock";

    public  void inc(){
        synchronized(lock){
            count++;
        } 
       
    }
}

//同步Service类
class Service{
    private int count;
    private String lock="lock";

    public  void inc(){
        synchronized(Service.class){
            count++;
        }
       
    }
}

```
使用Synchronized需要关注的是哪些方法/临界区会互斥，主要看一点，监视器是否一样
1. Synchronized 修饰普通方法，那么监视器是当前对象
2. Synchronized(this) 同步语句块，监视器是调用该方法的对象
3. Synchronized(Service.class) ，监视器是Service类
4. Synchronized修饰Service 的静态方法，那么监视器也是Service类
5. Synchronized(obj) ,监视器就是obj对象

只要监视器一样，那么多线程调用将会发生同步。

如下一个例子，由于监视器都是对象a,
因此同时不同线程调用
a.func();
b.func(); 
将会发生互斥。

```java
class A {

    public synchronized void func(){

    } 
}

class B {

    private A a ;
    
    public B(A a){
        this.a = a;
    }
    public  void func(){

        synchronized(a){
            try{

                Thread.sleep(10000);
            }catch(ex){

            }
        }

    } 
}
class ThreadService extends Thread{
    private B b;
    public ThreadService(B b){
        this.b = b;
    }   
    public void run(){
         b.func();  
    }

}
main(){
   A  a = new A();
   B b = new B(a);

    new ThreadService(b).start(); 
    a.func();
  
}
```


* 死锁例子
死锁是两个线程互相持有对方的锁，导致两个线程无法继续执行。
如下例子，两个线程同时执行，ServiceA和ServiceB的方法task同时被调用，两个对方又在等待对方释放自己需要的锁，无法继续往下执行，便发生了死锁。
```java
class ServiceA{
    
    private String lock1;
    private String lock2;

    public ServiceA(String lock1,String lock2){
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public  void task(){
        try{
            synchronized(lock1){
                Thread.sleep(5);

                synchronized(lock2){
                    Thread.sleep(5);                
                }
            }
        }
        catch(ex){
        }        
    }
}

class ServiceAThread extends Thread{
    
    ServiceA serviceA;

    public ServiceAThread(ServiceA serviceA){
        this.serviceA = serviceA;
    }

    public void run(){
        serviceA.task();
    }
}

class ServiceB{
    
    private String lock1;
    private String lock2;

    public ServiceB(String lock1,String lock2){
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public  void task(){
        try{
            synchronized(lock2){
                Thread.sleep(5);

                synchronized(lock1){
                    Thread.sleep(5);                
                }
            }
        }
        catch(ex){
        }        
    }
}

class ServiceBThread extends Thread{
    
    ServiceB serviceB;

    public ServiceBThread(ServiceB serviceB){
        this.serviceB = serviceB;
    }

    public void run(){
        serviceB.task();
    }
}

//测试
main(){
    
    String lock1 = "lock1";
    String lock2 = "lock2";

    ServiceA serviceA = new ServiceA(lock1,lock2);
    ServiceB serviceB = new ServiceB(lock1,lock2);

    ServiceAThread serviceAThread = new ServiceAThread();
    ServiceBThread serviceBThread = new ServiceBThread();

    serviceAThread.start();
    serviceBThread.start();
}



```
### 4.3.3. 实现原理
Java 虚拟机中的同步(Synchronization)基于进入和退出Monitor对象实现， 无论是显式同步(有明确的 monitorenter 和 monitorexit 指令,即同步代码块)还是隐式同步都是如此。在 Java 语言中，同步用的最多的地方可能是被 synchronized 修饰的同步方法。同步方法 并不是由 monitorenter 和 monitorexit 指令来实现同步的，而是由方法调用指令读取运行时常量池中方法表结构的 ACC_SYNCHRONIZED 标志来隐式实现的，关于这点，稍后详细分析。
同步代码块：monitorenter指令插入到同步代码块的开始位置，monitorexit指令插入到同步代码块的结束位置，JVM需要保证每一个monitorenter都有一个monitorexit与之相对应。任何对象都有一个monitor与之相关联，当且一个monitor被持有之后，他将处于锁定状态。线程执行到monitorenter指令时，将会尝试获取对象所对应的monitor所有权，即尝试获取对象的锁；
在JVM中，对象在内存中的布局分为三块区域：对象头、实例变量和填充数据。如下：
堆内存(实例对象(对象头，实例变量，填充数据))

* 实例变量
    * 存放类的属性数据信息，包括父类的属性信息，如果是数组的实例部分还包括数组的长度，这部分内存按4字节对齐。
* 填充数据
    * 由于虚拟机要求对象起始地址必须是8字节的整数倍。填充数据不是必须存在的，仅仅是为了字节对齐，这点了解即可。
* 对象头
    * Hotspot虚拟机的对象头主要包括两部分数据：Mark Word（标记字段）、Klass Pointer（类型指针）。
    其中Klass Point是是对象指向它的类元数据的指针，虚拟机通过这个指针来确定这个对象是哪个类的实例，Mark Word用于存储对象自身的运行时数据，它是实现轻量级锁和偏向锁的关键。
* Mark Word
    * 用于存储对象自身的运行时数据，如哈希码（HashCode）、GC分代年龄、锁状态标志、线程持有的锁、偏向线程 ID、偏向时间戳等等。
    Java对象头一般占有两个机器码（在32位虚拟机中，1个机器码等于4字节，也就是32bit），但是如果对象是数组类型，则需要三个机器码，
    因为JVM虚拟机可以通过Java对象的元数据信息确定Java对象的大小，但是无法从数组的元数据来确认数组的大小，所以用一块来记录数组长度。
* Monior
    * 我们可以把它理解为一个同步工具，也可以描述为一种同步机制，它通常被描述为一个对象。与一切皆对象一样，所有的Java对象是天生的Monitor，
    每一个Java对象都有成为Monitor的潜质，因为在Java的设计中 ，每一个Java对象自打娘胎里出来就带了一把看不见的锁，它叫做内部锁或者Monitor锁。
    Monitor 是线程私有的数据结构，每一个线程都有一个可用monitor record列表，同时还有一个全局的可用列表。
    每一个被锁住的对象都会和一个monitor关联（对象头的MarkWord中的LockWord指向monitor的起始地址），
    同时monitor中有一个Owner字段存放拥有该锁的线程的唯一标识，表示该锁被这个线程占用。其结构如下
![](https://images2017.cnblogs.com/blog/918656/201708/918656-20170824181742996-1450027779.png)
* Owner：初始时为NULL表示当前没有任何线程拥有该monitor record，当线程成功拥有该锁后保存线程唯一标识，当锁被释放时又设置为NULL；
* EntryQ:关联一个系统互斥锁（semaphore），阻塞所有试图锁住monitor record失败的线程。
* RcThis:表示blocked或waiting在该monitor record上的所有线程的个数。
* Nest:用来实现重入锁的计数。
* HashCode:保存从对象头拷贝过来的HashCode值（可能还包含GC age）。
* Candidate:用来避免不必要的阻塞或等待线程唤醒，因为每一次只有一个线程能够成功拥有锁，如果每次前一个释放锁的线程唤醒所有正在阻塞或等待的线程，会引起不必要的上下文切换（从阻塞到就绪然后因为竞争锁失败又被阻塞）从而导致性能严重下降。Candidate只有两种可能的值0表示没有需要唤醒的线程1表示要唤醒一个继任线程来竞争锁

注意由于synchronized是基于monitor实现的，因此每次重入，monitor中的计数器仍会加1。退出时减1.当为0时说明没有任何线程持有该对象锁。


**Java虚拟机对synchronize的优化：**

锁的状态总共有四种，无锁状态、偏向锁、轻量级锁和重量级锁。随着锁的竞争，锁可以从偏向锁升级到轻量级锁，再升级的重量级锁，但是锁的升级是单向的，也就是说只能从低到高升级，不会出现锁的降级，关于重量级锁，前面我们已详细分析过，下面我们将介绍偏向锁和轻量级锁以及JVM的其他优化手段。

**偏向锁**
偏向锁是Java 6之后加入的新锁，它是一种针对加锁操作的优化手段，经过研究发现，在大多数情况下，锁不仅不存在多线程竞争，而且总是由同一线程多次获得，因此为了减少同一线程获取锁(会涉及到一些CAS操作,耗时)的代价而引入偏向锁。偏向锁的核心思想是，如果一个线程获得了锁，那么锁就进入偏向模式，此时Mark Word 的结构也变为偏向锁结构，当这个线程再次请求锁时，无需再做任何同步操作，即获取锁的过程，这样就省去了大量有关锁申请的操作，从而也就提供程序的性能。所以，对于没有锁竞争的场合，偏向锁有很好的优化效果，毕竟极有可能连续多次是同一个线程申请相同的锁。但是对于锁竞争比较激烈的场合，偏向锁就失效了，因为这样场合极有可能每次申请锁的线程都是不相同的，因此这种场合下不应该使用偏向锁，否则会得不偿失，需要注意的是，偏向锁失败后，并不会立即膨胀为重量级锁，而是先升级为轻量级锁。

**轻量级锁**
倘若偏向锁失败，虚拟机并不会立即升级为重量级锁，它还会尝试使用一种称为轻量级锁的优化手段(1.6之后加入的)，此时Mark Word 的结构也变为轻量级锁的结构。轻量级锁能够提升程序性能的依据是“对绝大部分的锁，在整个同步周期内都不存在竞争”，注意这是经验数据。需要了解的是，轻量级锁所适应的场景是线程交替执行同步块的场合，如果存在同一时间访问同一锁的场合，就会导致轻量级锁膨胀为重量级锁。

**自旋锁**
轻量级锁失败后，虚拟机为了避免线程真实地在操作系统层面挂起，还会进行一项称为自旋锁的优化手段。这是基于在大多数情况下，线程持有锁的时间都不会太长，如果直接挂起操作系统层面的线程可能会得不偿失，毕竟操作系统实现线程之间的切换时需要从用户态转换到核心态，这个状态之间的转换需要相对比较长的时间，时间成本相对较高，因此自旋锁会假设在不久将来，当前的线程可以获得锁，因此虚拟机会让当前想要获取锁的线程做几个空循环(这也是称为自旋的原因)，一般不会太久，可能是50个循环或100循环，在经过若干次循环后，如果得到锁，就顺利进入临界区。如果还不能获得锁，那就会将线程在操作系统层面挂起，这就是自旋锁的优化方式，这种方式确实也是可以提升效率的。最后没办法也就只能升级为重量级锁了。

**锁消除**
消除锁是虚拟机另外一种锁的优化，这种优化更彻底，Java虚拟机在JIT编译时(可以简单理解为当某段代码即将第一次被执行时进行编译，又称即时编译)，通过对运行上下文的扫描，去除不可能存在共享资源竞争的锁，通过这种方式消除没有必要的锁，可以节省毫无意义的请求锁时间，如下StringBuffer的append是一个同步方法，但是在add方法中的StringBuffer属于一个局部变量，并且不会被其他线程所使用，因此StringBuffer不可能存在共享资源竞争的情景，JVM会自动将其锁消除。

等待唤醒机制与synchronize：所谓等待唤醒机制本篇主要指的是notify/notifyAll和wait方法，在使用这3个方法时，必须处于synchronized代码块或者synchronized方法中，否则就会抛出IllegalMonitorStateException异常，这是因为调用这几个方法前必须拿到当前对象的监视器monitor对象，也就是说notify/notifyAll和wait方法依赖于monitor对象，在前面的分析中，我们知道monitor 存在于对象头的Mark Word 中(存储monitor引用指针)，而synchronized关键字可以获取 monitor ，这也就是为什么notify/notifyAll和wait方法必须在synchronized代码块或者synchronized方法调用的原因。


## 4.4. 线程间通信
### 4.4.1. 基本概念
```java
//释放锁，线程任务暂停
public final native void wait() throws InterruptedException;
public final native void wait(long timeout) throws InterruptedException;
public final void wait(long timeout, int nanos) throws InterruptedException;

//通知其中一个线程唤醒
public final native void notify();
//通知所有的线程唤醒
public final native void notifyAll();
```
* 这些方法都是位于Object对象中
* 这些方法必须在synchronized的临界区内被调用，否则将会抛出异常。并且调用wait和notify的必须是同一个对象，才能唤醒。
* 在等待的过程中，如果线程被中断，将会抛出异常InterruptedException。
* 调用wait将会释放锁，sleep将不会释放锁，wait将会随机选择一个线程进行唤醒

### 4.4.2. 实现消费者和生产者


## 4.5. Java内存模型
<a href="#menu" style="float:right">目录</a>   

## 4.6. volatile
<a href="#menu" style="float:right">目录</a>
 
## 4.7. Lock
<a href="#menu" style="float:right">目录</a>

## 4.8. 线程池
<a href="#menu" style="float:right">目录</a>


## 4.9. 并发工具类
<a href="#menu" style="float:right">目录</a>


## 4.10. 异步编程
<a href="#menu" style="float:right">目录</a>


## 4.11. 并发编程的挑战
<a href="#menu" style="float:right">目录</a>

### 4.11.1. 上下文切换
<a href="#menu" style="float:right">目录</a>

**基本概念**
* 即使是单核处理器也支持多线程执行代码，CPU通过给每个线程分配CPU时间片来实现这个机制。时间片是CPU分配给各个线程的时间，因为时间片非常短，所以CPU通过不停地切换线程执行，让我们感觉多个线程是同时执行的，时间片一般是几十毫秒（ms）.
* CPU通过时间片分配算法来循环执行任务，当前任务执行一个时间片后会切换到下一个任务。但是，在切换前会保存上一个任务的状态，以便下次切换回这个任务时，可以再加载这个任务的状态。所以任务从保存到再加载的过程就是一次上下文切换
* 由于每次切换都要进行状态保存与恢复等操作，因此切换越多，运行效率会降低。
* 可以使用vmstat进行检测，后面的参数为间隔时间。cs（Content switch）为切换次数

```bash
lgj@lgj-Lenovo-G470:~$ vmstat 5
procs -----------memory---------- ---swap-- -----io---- -system-- ------cpu-----
 r  b   swpd   free   buff  cache   si   so    bi    bo   in   cs us sy id wa st
 0  0      0 4736560 160668 2391128    0    0   127    66  260 1105 11  3 82  4  0
 0  0      0 4733284 160676 2406392    0    0     0     2 1064 4337  8  2 90  0  0

```
* 使用Lmbench3可以测量上下文切换的时长

**如何减少上下文切换**
* 无锁并发编程
    * 避免多线程争抢数据
* CAS算法
    * JDK的原子类使用了CAS算法,CAS算法是乐观锁，每次修改时进行比较，比较失败则进行重试，直到成功
* 使用最少线程
    * 避免无限使用更多的线程，原则上IO阻塞型使用较多的线程，CPU密集型使用较少的线程
* 使用协程
    * 在单线程里实现多任务的调度，并在但线程里维持多个任务间的切换
    

### 4.11.2. 死锁
<a href="#menu" style="float:right">目录</a>

```java
public class DeadLockDemo {
    privat static String A = "A";
    private static String B = "B";
    public static void main(String[] args) {
        new DeadLockDemo().deadLock();
    }
    private void deadLock() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            publicvoid run() {
                synchronized (A) {
                    try { 
                        Thread.currentThread().sleep(2000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
            
                    }
                    synchronized (B) {
                    System.out.println("1");
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            publicvoid run() {
                synchronized (B) {
                    synchronized (A) {
                        System.out.println("2");
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
```
* 避免死锁的几个常见方法。
    * 避免一个线程同时获取多个锁。
    * 避免一个线程在锁内同时占用多个资源，尽量保证每个锁只占用一个资源。
    * 尝试使用定时锁，使用lock.tryLock（timeout）来替代使用内部锁机制。
    * 对于数据库锁，加锁和解锁必须在一个数据库连接里，否则会出现解锁失败的情况


## 4.12. Java内存模型
<a href="#menu" style="float:right">目录</a>

### 4.12.1. Java内存模型基础
<a href="#menu" style="float:right">目录</a>


### 4.12.2. 重排序
<a href="#menu" style="float:right">目录</a>

* 重排序是指编译器和处理器为了优化程序性能而对指令序列进行重新排序的一种手段。
* 编译器和处理器可能会对操作做重排序。编译器和处理器在重排序时，会遵守数据依赖性，编译器和处理器不会改变存在数据依赖关系的两个操作的执行顺序。
* 这里所说的数据依赖性仅针对**单个处理器**中执行的指令序列和**单个线程**中执行的操作，**不同处理器**之间和**不同线程**之间的数据依赖性不被编译器和处理器考虑

```java
int a = 1;
int b = 2;
int c = a + b;
```
a happens-before b;
b happens-before c;
a happens-before c;

如上的例子，第一行和第二行没有依赖关系，因此可能会发生指令重排序。第三行和前面都有关，因此不会和前面的语句发生指令重排序。

```java
class ReorderExample {
    int a = 0;
    boolean flag = false;
    public void writer() {
        a = 1; // 1
        flag = true; // 2
    } 
    Public void reader() {
        if (flag) { // 3
            int i = a * a; // 4

        }
    }
}

```
两个线程分别执行writer()和reader()。reader()不一定能看到其他线程对a的写入修改。

操作1和2没有数据依赖关系，因此可能会发生指令重排序。同理3和4。因此执行到4时，a的值可能还是0.


### 4.12.3. 顺序一致性
<a href="#menu" style="float:right">目录</a>

### 4.12.4. volatile的内存语义
<a href="#menu" style="float:right">目录</a>

**特性**
* 内存可见性
    * 对一个volatile变量的读，总是能看到（任意线程）对这个volatile变量最后的写入
* 保证变量读写是原子性的
    * 对任意单个volatile变量的读/写具有原子性，但类似于volatile++这种复合操作不
具有原子性。
* 禁止指令重排序

**volatile写的内存语义如下**
当写一个volatile变量时，JMM会把该线程对应的本地内存中的共享变量值刷新到主内存


### 4.12.5. 锁的内存语义
<a href="#menu" style="float:right">目录</a>

### 4.12.6. final的内存语义
<a href="#menu" style="float:right">目录</a>

### 4.12.7. happens-before
<a href="#menu" style="float:right">目录</a>


### 4.12.8. 双重检查锁定与延迟初始化
<a href="#menu" style="float:right">目录</a>

### 4.12.9. Java内存模型综述
<a href="#menu" style="float:right">目录</a>

## 4.13. Java并发机制的底层实现原理
<a href="#menu" style="float:right">目录</a>


## 4.14. 并发编程基础
<a href="#menu" style="float:right">目录</a>


## 4.15. 锁
<a href="#menu" style="float:right">目录</a>

### 4.15.1. 提高锁性能方案
<a href="#menu" style="float:right">目录</a>

**减少锁持有的时间**
**减少锁粒度**
**使用读写分离锁来替换独占锁**
* 适合读多写少的场景

**锁分离**
* 也就是使用不同的锁进行控制，比如读写锁

**锁粗化**
* 虚拟机在遇到一连串连续地对同一个锁不断进行请求和释放的操作，便会把所有的锁操作整合成对锁的一次请求，从而减少对锁的请求的同步次数。



### 4.15.2. Java虚拟机的锁优化
<a href="#menu" style="float:right">目录</a>

**锁偏向**
锁偏向是一种针对加锁操作的优化手段。

如果一个线程获得了锁，那么锁就进入偏向模式。当这个线程再次请求锁时，无须再做任何同步操作。这样就节省了大量有关锁申请的操作，从而提高了程序性能。因此，对于几乎没有锁竞争的场合，偏向锁有比较红啊的优化效果，因为连续多次极有可能是同一个线程请求相同的锁。而对于锁竞争比较激烈的场合，其效果不佳。因为在竞争激烈的场合，最有可能的情况是每次都是不同的线程来请求相同的锁。

**轻量级锁**
如果偏向锁失败，即上一个请求的锁的线程和这个线程不是同一个。偏向锁失败意味者不能避免做同步操作。此时，虚拟机并不会立即挂起线程。他会使用一种成为轻量级锁的优化手段。 轻量级锁的操作也很方便，它只是简单地将对象头部作为指针，指向蚩尤锁的线程堆栈的内部，来判断一个线程是否持有对象锁。 如果线程获得轻量级锁成功，则可以顺利进入临界区。如果轻量级锁失败，则表示其他线程抢先争夺了锁，那么当前线程的锁请求就会膨胀为重量级锁。

**自选锁**
锁膨胀后，虚拟机为了避免线程真实地在操作系统层面挂起，虚拟机还会在做最后的努力–自选锁。由于当前线程暂时无法获得锁，但是什么时候可以获得锁是一个未知数。也许在CPU几个时钟周期后，就可以得到锁。如果这样，简单粗暴的挂起线程可能是一种得不偿失的操作，因此系统会进行一次赌注：它会假设在不久的将来，线程可以得到这把锁。因此虚拟机让当前线程做个空循环，在经过若干次循环后，如果可以得到锁，那么就顺利进入临界区。如果还不能得到锁，才会真实地将线程在操作系统层面挂起。

**锁消除**
锁消除是一种更彻底的锁优化。Java虚拟机在JIT编译时，通过对运行上下文的扫描，去除不可能存在共享资源竞争的锁。通过锁消除，可以节省毫无意义的请求锁时间。

下面这种这种情况，我们使用vector， 而vector内部使用了synchronize请求锁。

```java
public String []  createStrings(){
    Vector<String>  v= new Vector<String>();
    for(int i=0;i<100;i++){
        v.add(Integer.toString(i));
    }
    return v.toArray(new String[]{});
}
```
由于V只在函数 createStrnigs 中使用，因此它只是一个单纯的局部变量。局部变量是在线程栈上分配的，属于线程私有额数据，因此不可能被其他线程访问。所以，在这种情况下，Vector内部所有加锁同步都是没有必要的。如果虚拟机检测到这种情况，就会将这些无用的锁操作去除。

锁消除涉及的一项关键技术为逃逸分析。所谓逃逸分析就是观察某一个变量是否会逃出某一个作用域。在本例中，变量v显然没有逃出createString 函数之外。以此为基础，虚拟机才可以大胆的将v内部的加锁操作去除。如果createStrings 返回的不是String数组，而是v本身，那么就认为变量v逃逸出了当前函数，也就是说v有可能被其他线程访问。如是这样，虚拟机就不能消除v中的锁操作。

逃逸分析必须在 -server 模式下进行，可以使用 -XX:DoEscapeAnalysis 参数打开逃逸分析，使用 -XX:+EliminateLocks 参数可以打开锁消除。


## 4.16. 并发容器和框架
<a href="#menu" style="float:right">目录</a>

### 4.16.1. 常见的并发容器
<a href="#menu" style="float:right">目录</a>

* ConcurrentHashMap
* ConcurrentLinkedDeque
* ConcurrentLinkedQueue
* ConcurrentSkipListMap
* ConcurrentSkipListSet
* CopyOnWriteArrayList
* CopyOnWriteArraySet


### 4.16.2. Fork/Join框架
<a href="#menu" style="float:right">目录</a>

#### 4.16.2.1. 基本概念

Fork/Join框架是Java 7提供的一个用于并行执行任务的框架，是一个把大任务分割成若干个小任务，最终汇总每个小任务结果后得到大任务结果的框架
Fork就是把一个大任务切分为若干子任务并行的执行，Join就是合并这些子任务的执行结果，最后得到这个大任务的结果。比如计算1+2+…+10000，每个子任务分别对1000个数进行求和，最终汇总这10个子任务的结果。

![](https://yqfile.alicdn.com/3fa26593c0270f0ef92dfc9daf3013ca9e29dc7b.png)

#### 4.16.2.2. 工作窃取算法
工作窃取（work-stealing）算法是指某个线程从其他队列里窃取任务来执行。那么，为什么需要使用工作窃取算法呢？ 假如我们需要做一个比较大的任务，可以把这个任务分割为若干互不依赖的子任务，为了减少线程间的竞争，把这些子任务分别放到不同的队列里，并为每个队列创建一个单独的线程来执行队列里的任务，线程和队列一一对应。比如A线程负责处理A队列里的任务。但是，有的线程会先把自己队列里的任务干完，而其他线程对应的队列里还有任务等待处理。干完活的线程与其等着，不如去帮其他线程干活，于是它就去其他线程的队列里窃取一个任务来执行。而在这时它们会访问同一个队列，所以为了减少窃取任务线程和被窃取任务线程之间的竞争，通常会使用双端队列，被窃取任务线程永远从双端队列的头部拿任务执行，而窃取任务的线程永远从双端队列的尾部拿任务执行

* 工作窃取算法的优点：充分利用线程进行并行计算，减少了线程间的竞争。
* 工作窃取算法的缺点：在某些情况下还是存在竞争，比如双端队列里只有一个任务时。并且该算法会消耗了更多的系统资源，比如创建多个线程和多个双端队列。


#### 4.16.2.3. Fork/Join框架的设计

我们已经很清楚Fork/Join框架的需求了，那么可以思考一下，如果让我们来设计一个Fork/Join框架，该如何设计？ 这个思考有助于你理解Fork/Join框架的设计。
* 步骤1 分割任务。首先我们需要有一个fork类来把大任务分割成子任务，有可能子任务还是很大，所以还需要不停地分割，直到分割出的子任务足够小。
* 步骤2 执行任务并合并结果。分割的子任务分别放在双端队列里，然后几个启动线程分别从双端队列里获取任务执行。子任务执行完的结果都统一放在一个队列里，启动一个线程从队列里拿数据，然后合并这些数据。

Fork/Join使用两个类来完成以上两件事情。
* ForkJoinTask：我们要使用ForkJoin框架，必须首先创建一个ForkJoin任务。它提供在任务中执行fork()和join()操作的机制。通常情况下，我们不需要直接继承ForkJoinTask类，只需要继承它的子类，Fork/Join框架提供了以下两个子类
    * RecursiveAction：用于没有返回结果的任务。
    * RecursiveTask：用于有返回结果的任务。
* ForkJoinPool：ForkJoinTask需要通过ForkJoinPool来执行。
    * 任务分割出的子任务会添加到当前工作线程所维护的双端队列中，进入队列的头部。当一个工作线程的队列里暂时没有任务时，它会随机从其他工作线程的队列的尾部获取一个任务。

#### 4.16.2.4. 例子

```java
public class ForkJoinTaskExample extends RecursiveTask<Integer> {

    public static final int threshold = 2;
    private int start;
    private int end;

    public ForkJoinTaskExample(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;

        //如果任务足够小就计算任务
        boolean canCompute = (end - start) <= threshold;
        if (canCompute) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            // 如果任务大于阈值，就分裂成两个子任务计算
            int middle = (start + end) / 2;
            ForkJoinTaskExample leftTask = new ForkJoinTaskExample(start, middle);
            ForkJoinTaskExample rightTask = new ForkJoinTaskExample(middle + 1, end);

            // 执行子任务
            leftTask.fork();
            rightTask.fork();

            // 等待任务执行结束合并其结果
            int leftResult = leftTask.join();
            int rightResult = rightTask.join();

            // 合并子任务
            sum = leftResult + rightResult;
        }
        return sum;
    }

    public static void main(String[] args) {
        ForkJoinPool forkjoinPool = new ForkJoinPool();

        //生成一个计算任务，计算1+2+3+4
        ForkJoinTaskExample task = new ForkJoinTaskExample(1, 100);

        //执行一个任务
        Future<Integer> result = forkjoinPool.submit(task);

        try {
            log.info("result:{}", result.get());
        } catch (Exception e) {
            log.error("exception", e);
        }
    }
}

```
#### 4.16.2.5. Fork/Join框架的异常处理
ForkJoinTask在执行的时候可能会抛出异常，但是我们没办法在主线程里直接捕获异常，所以ForkJoinTask提供了isCompletedAbnormally()方法来检查任务是否已经抛出异常或已经被取消了，并且可以通过ForkJoinTask的getException方法获取异常

```java
if(task.isCompletedAbnormally())
{
    System.out.println(task.getException());
}

```

#### 4.16.2.6. 实现原理 

ForkJoinPool由ForkJoinTask数组和ForkJoinWorkerThread数组组成，ForkJoinTask数组负责将存放程序提交给ForkJoinPool的任务，而ForkJoinWorkerThread数组负责执行这些任务。

**ForkJoinTask的fork方法实现原理**
```java
public final ForkJoinTask<V> fork() {
    Thread t;
    if ((t = Thread.currentThread()) instanceof ForkJoinWorkerThread)
        ((ForkJoinWorkerThread)t).workQueue.push(this);
    else
        ForkJoinPool.common.externalPush(this);
    return this;
}
```

## 4.17. 原子操作类
<a href="#menu" style="float:right">目录</a>

### 4.17.1. CAS算法

CAS算法有三个值：预期值，内存值，需要设置的值。

比如进行以改革 a=a+1;操作。一共包含以下操作:
1. 读取内存中的值a
2. 对a进行+1操作得到新值
3. 将新a写入内存中

以上操作有一个问题，在高并发条件下，任何两个操作之间都有可能插入其他操作。比如2/3之间插入了完整的以上3个操作，那么最终值将会不正确。

因此，使用CAS算法来解决。JDK使用Unsafe类实现CAS算法。

CAS是乐观锁，只有在写入的时候才会检查是否出现并发问题。

比如自加1操作，在写入时，会提交预期值和需要设置的值。只有当**预期值**和**内存中的值**相同才会写入成功，否则重新获取内存中的值，加1之后再次重新写入。这是一个自旋的过程，一直到写入成功为止。

**问题**
1. ABA问题。CAS比较交换时，是检查当前值与期望值是否一致。试想一下，如果某个值由A变成了B，再由B变回了A，那么在做CAS比较时，会认为值没有变化，但实际是发生了变化。ABA问题的解决思路是给数据加一个版本号，每次更新后对其版本加1，这样在值变回A之后，其版本已不是原来的版本了。具体可参见jdk中的AtomicStampedReference
2. 开销大。在高并发情况下，自旋CAS如果长时间不成功，会一直执行循环操作，给CPU带来非常大的执行开销。所以其适用于那些并发不是很大的场景。





### 4.17.2. 原子更新基本类型
<a href="#menu" style="float:right">目录</a>

使用原子的方式更新基本类型，Atomic包提供了以下3个类。
* AtomicBoolean：原子更新布尔类型。
* AtomicInteger：原子更新整型。
* AtomicLong：原子更新长整型

### 4.17.3. 原子更新数组
<a href="#menu" style="float:right">目录</a>

通过原子的方式更新数组里的某个元素，Atomic包提供了以下4个类。
* AtomicIntegerArray：原子更新整型数组里的元素。
* AtomicLongArray：原子更新长整型数组里的元素。
* AtomicReferenceArray：原子更新引用类型数组里的元素。
* AtomicIntegerArray类主要是提供原子的方式更新数组里的整型


### 4.17.4. 原子更新引用类型
<a href="#menu" style="float:right">目录</a>

原子更新基本类型的AtomicInteger，只能更新一个变量，如果要原子更新多个变量，就需要使用这个原子更新引用类型提供的类。Atomic包提供了以下3个类。
* AtomicReference：原子更新引用类型。
* AtomicReferenceFieldUpdater：原子更新引用类型里的字段。
* AtomicMarkableReference：原子更新带有标记位的引用类型。可以原子更新一个布尔类型的标记位和引用类型

### 4.17.5. 原子更新字段类
<a href="#menu" style="float:right">目录</a>

如果需原子地更新某个类里的某个字段时，就需要使用原子更新字段类，Atomic包提供了以下3个类进行原子字段更新。
* AtomicIntegerFieldUpdater：原子更新整型的字段的更新器。
* AtomicLongFieldUpdater：原子更新长整型字段的更新器。
* AtomicStampedReference：原子更新带有版本号的引用类型。该类将整数值与引用关联起来，可用于原子的更新数据和数据的版本号，可以解决使用CAS进行原子更新时可能出现的ABA问题


## 4.18. 并发工具类
<a href="#menu" style="float:right">目录</a>

### 4.18.1. 等待多线程完成的CountDownLatch
<a href="#menu" style="float:right">目录</a>

#### 4.18.1.1. 基本概念

CountDownLatch允许一个或多个线程等待其他线程完成操作。
* 计数器必须大于等于0，只是等于0时候，计数器就是零，调用await方法时不会阻塞当前线程。
* CountDownLatch不可能重新初始化或者修改CountDownLatch对象的内部计数器的值。
* 一个线程调用countDown方法happen-before，另外一个线程调用await方法。

```java
CountDownLatch(int count) //实例化一个倒计数器，count指定计数个数
countDown() // 计数减一
await() //等待，当计数减到0时，所有线程并行执行
```

#### 4.18.1.2. 实现原理

```java
private static final class Sync extends AbstractQueuedSynchronizer {
    private static final long serialVersionUID = 4982264981922014374L;

    Sync(int count) {
        setState(count);
    }

    int getCount() {
        return getState();
    }

    protected int tryAcquireShared(int acquires) {
        return (getState() == 0) ? 1 : -1;
    }

    protected boolean tryReleaseShared(int releases) {
        // Decrement count; signal when transition to zero
        for (;;) {
            int c = getState();
            if (c == 0)
                return false;
            int nextc = c-1;
            if (compareAndSetState(c, nextc))
                return nextc == 0;
        }
    }
}
public CountDownLatch(int count) {
    if (count < 0) throw new IllegalArgumentException("count < 0");
    this.sync = new Sync(count);
}

public void await() throws InterruptedException {
    sync.acquireSharedInterruptibly(1);
}
public void countDown() {
    sync.releaseShared(1);
}

```

### 4.18.2. 同步屏障CyclicBarrier
<a href="#menu" style="float:right">目录</a>


CyclicBarrier的字面意思是可循环使用（Cyclic）的屏障（Barrier）。它要做的事情是，让一组线程到达一个屏障（也可以叫同步点）时被阻塞，直到最后一个线程到达屏障时，屏障才会开门，所有被屏障拦截的线程才会继续运行。
　
CountDownLatch的计数器只能使用一次，而CyclicBarrier的计数器可以使用reset()方法重置。所以CyclicBarrier能处理更为复杂的业务场景。例如，如果计算发生错误，可以重置计数器，并让线程重新执行一次。
CyclicBarrier还提供其他有用的方法，比如getNumberWaiting方法可以获得Cyclic-Barrier阻塞的线程数量。isBroken()方法用来了解阻塞的线程是否被中断



CyclicBarrier有两个构造函数:
```java
//int类型的参数表示有几个线程来参与这个屏障拦截
CyclicBarrier(int parties); 
//当所有线程到达一个屏障点时,优先执行barrierAction这个线程.
CyclicBarrier(int parties,Runnable barrierAction);
//最重要的一个方法:
//每个线程调用await(),表示我已经到达屏障点,然后当前线程被阻塞,(拿上面的例子讲就是游客A表示到达了景点A,然后他就在那儿等着大家到齐).
await();

```



parties用于定义一个最大线程计数值，当调用await()时阻塞，直到调用的次数达到parties，则可以继续执行。
简单的使用场景：校长要计算全校平均数，必须从A班级获取到成绩表，从B班级获取到成绩表等等 ，只有获取到全部班级的成绩表，校长才能计算总平均数。


#### 4.18.2.1. 实现原理

使用ReentrantLock和Condition实现
```java
 private int dowait(boolean timed, long nanos)
        throws InterruptedException, BrokenBarrierException,
               TimeoutException {
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            final Generation g = generation;

            if (g.broken)
                throw new BrokenBarrierException();

            //发生中断时退出
            if (Thread.interrupted()) {
                breakBarrier();
                throw new InterruptedException();
            }
            //计数值减1
            int index = --count;
            //为0说明达到条件
            if (index == 0) {  // tripped
                boolean ranAction = false;
                try {
                    final Runnable command = barrierCommand;
                    if (command != null)
                        //执行定义的任务
                        command.run();
                    ranAction = true;
                    //下一次循环
                    nextGeneration();
                    return 0;
                } finally {
                    if (!ranAction)
                        breakBarrier();
                }
            }

            // loop until tripped, broken, interrupted, or timed out
            for (;;) {
                try {
                    if (!timed)
                        trip.await();
                    else if (nanos > 0L)
                        nanos = trip.awaitNanos(nanos);
                } catch (InterruptedException ie) {
                    if (g == generation && ! g.broken) {
                        breakBarrier();
                        throw ie;
                    } else {
                        // We're about to finish waiting even if we had not
                        // been interrupted, so this interrupt is deemed to
                        // "belong" to subsequent execution.
                        Thread.currentThread().interrupt();
                    }
                }

                if (g.broken)
                    throw new BrokenBarrierException();

                if (g != generation)
                    return index;

                if (timed && nanos <= 0L) {
                    breakBarrier();
                    throw new TimeoutException();
                }
            }
        } finally {
            lock.unlock();
        }
    }
/**
    * Updates state on barrier trip and wakes up everyone.
    * Called only while holding lock.
    */
private void nextGeneration() {
    // signal completion of last generation
    trip.signalAll();
    // set up next generation
    count = parties;
    generation = new Generation();
}

/**
    * Sets current barrier generation as broken and wakes up everyone.
    * Called only while holding lock.
    */
private void breakBarrier() {
    generation.broken = true;
    count = parties;
    trip.signalAll();
} 
```
### 4.18.3. 控制并发线程数的Semaphore
<a href="#menu" style="float:right">目录</a>


#### 4.18.3.1. 基本概念

Semaphore（信号量）是用来控制同时访问特定资源的线程数量，它通过协调各个线程，以保证合理的使用公共资源。

主要方法
```java
public Semaphore(int permits) {
    sync = new NonfairSync(permits);
}
public Semaphore(int permits, boolean fair) {
    sync = fair ? new FairSync(permits) : new NonfairSync(permits);
}

public void acquire() throws InterruptedException {
    sync.acquireSharedInterruptibly(1);
}
public void release() {
    sync.releaseShared(1);
}
```
构造函数指定许可证数量，可以配置公平和非公平。
acquire()用于申请一个许可证，调用一次减少一个，如果超过则阻塞。直到有线程释放release() 。


#### 4.18.3.2. 实现原理


### 4.18.4. 线程间交换数据的Exchanger
<a href="#menu" style="float:right">目录</a>

Exchanger 是 JDK 1.5 开始提供的一个用于两个工作线程之间交换数据的封装工具类，简单说就是一个线程在完成一定的事务后想与另一个线程交换数据，则第一个先拿出数据的线程会一直等待第二个线程，直到第二个线程拿着数据到来时才能彼此交换对应数据。其定义为 Exchanger<V> 泛型类型，其中 V 表示可交换的数据类型，对外提供的接口很简单，具体如下：

Exchanger()：无参构造方法。
V exchange(V v)：等待另一个线程到达此交换点（除非当前线程被中断），然后将给定的对象传送给该线程，并接收该线程的对象。
V exchange(V v, long timeout, TimeUnit unit)：等待另一个线程到达此交换点（除非当前线程被中断或超出了指定的等待时间），然后将给定的对象传送给该线程，并接收该线程的对象。

可以看出，当一个线程到达 exchange 调用点时，如果其他线程此前已经调用了此方法，则其他线程会被调度唤醒并与之进行对象交换，然后各自返回；如果其他线程还没到达交换点，则当前线程会被挂起，直至其他线程到达才会完成交换并正常返回，或者当前线程被中断或超时返回。

```java
public class Test {
    static class Producer extends Thread {
        private Exchanger<Integer> exchanger;
        private static int data = 0;
        Producer(String name, Exchanger<Integer> exchanger) {
            super("Producer-" + name);
            this.exchanger = exchanger;
        }

        @Override
        public void run() {
            for (int i=1; i<5; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    data = i;
                    System.out.println(getName()+" 交换前:" + data);
                    data = exchanger.exchange(data);
                    System.out.println(getName()+" 交换后:" + data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer extends Thread {
        private Exchanger<Integer> exchanger;
        private static int data = 0;
        Consumer(String name, Exchanger<Integer> exchanger) {
            super("Consumer-" + name);
            this.exchanger = exchanger;
        }

        @Override
        public void run() {
            while (true) {
                data = 0;
                System.out.println(getName()+" 交换前:" + data);
                try {
                    TimeUnit.SECONDS.sleep(1);
                    data = exchanger.exchange(data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName()+" 交换后:" + data);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Exchanger<Integer> exchanger = new Exchanger<Integer>();
        new Producer("", exchanger).start();
        new Consumer("", exchanger).start();
        TimeUnit.SECONDS.sleep(7);
        System.exit(-1);
    }
}
```


## 4.19. 线程池
<a href="#menu" style="float:right">目录</a>

**线程池好处**
* 第一：降低资源消耗。通过重复利用已创建的线程降低线程创建和销毁造成的消耗。
* 第二：提高响应速度。当任务到达时，任务可以不需要等到线程创建就能立即执行。
* 第三：提高线程的可管理性。线程是稀缺资源，如果无限制地创建，不仅会消耗系统资源，还会降低系统的稳定性，使用线程池可以进行统一分配、调优和监控。但是，要做到合理利用线程池，必须对其实现原理了如指掌。

### 4.19.1. 线程池的实现原理
当向线程池提交一个任务之后，线程池是如何处理这个任务的呢？ 本节来看一下线程池
的主要处理流程，处理流程图如图9-1所示。
从图中可以看出，当提交一个新任务到线程池时，线程池的处理流程如下。
1）线程池判断核心线程池里的线程是否都在执行任务。如果不是，则创建一个新的工作
线程来执行任务。如果核心线程池里的线程都在执行任务，则进入下个流程。
2）线程池判断工作队列是否已经满。如果工作队列没有满，则将新提交的任务存储在这
个工作队列里。如果工作队列满了，则进入下个流程。
3）线程池判断线程池的线程是否都处于工作状态。如果没有，则创建一个新的工作线程
来执行任务。如果已经满了，则交给饱和策略来处理这个任务

![线程池实现基本原理](https://github.com/lgjlife/Java-Study/blob/master/pic/thread/thread-pool.png?raw=true)

![线程池实现基本原理](https://github.com/lgjlife/Java-Study/blob/master/pic/thread/thread-pool.png?raw=true)

**ThreadPoolExecutor执行execute方法分下面4种情况。**
1）如果当前运行的线程少于corePoolSize，则创建新线程来执行任务（注意，执行这一步骤
需要获取全局锁）。
2）如果运行的线程等于或多于corePoolSize，则将任务加入BlockingQueue。
3）如果无法将任务加入BlockingQueue（队列已满），则创建新的线程来处理任务（注意，执行这一步骤需要获取全局锁）。
4）如果创建新线程将使当前运行的线程超出maximumPoolSize，任务将被拒绝，并调用
RejectedExecutionHandler.rejectedExecution()方法。
ThreadPoolExecutor采取上述步骤的总体设计思路，是为了在执行execute()方法时，尽可能地避免获取全局锁（那将会是一个严重的可伸缩瓶颈）。在ThreadPoolExecutor完成预热之后（当前运行的线程数大于等于corePoolSize），几乎所有的execute()方法调用都是执行步骤2，而步骤2不需要获取全局锁。

**ThreadPoolExecutor**
```java
public void execute(Runnable command) {
        if (command == null)
            throw new NullPointerException();
        /*
         * Proceed in 3 steps:
         *
         * 1. If fewer than corePoolSize threads are running, try to
         * start a new thread with the given command as its first
         * task.  The call to addWorker atomically checks runState and
         * workerCount, and so prevents false alarms that would add
         * threads when it shouldn't, by returning false.
         *
         * 2. If a task can be successfully queued, then we still need
         * to double-check whether we should have added a thread
         * (because existing ones died since last checking) or that
         * the pool shut down since entry into this method. So we
         * recheck state and if necessary roll back the enqueuing if
         * stopped, or start a new thread if there are none.
         *
         * 3. If we cannot queue task, then we try to add a new
         * thread.  If it fails, we know we are shut down or saturated
         * and so reject the task.
         */
        int c = ctl.get();
        if (workerCountOf(c) < corePoolSize) {
            if (addWorker(command, true))
                return;
            c = ctl.get();
        }
        if (isRunning(c) && workQueue.offer(command)) {
            int recheck = ctl.get();
            if (! isRunning(recheck) && remove(command))
                reject(command);
            else if (workerCountOf(recheck) == 0)
                addWorker(null, false);
        }
        else if (!addWorker(command, false))
            reject(command);
    }
```



### 4.19.2. 线程池的使用

```java
   public ThreadPoolExecutor(int corePoolSize,
                              int maximumPoolSize,
                              long keepAliveTime,
                              TimeUnit unit,
                              BlockingQueue<Runnable> workQueue,
                              ThreadFactory threadFactory,
                              RejectedExecutionHandler handler)
```

**创建一个线程池时需要输入几个参数，如下。**
* 1）corePoolSize（线程池的基本大小）：当提交一个任务到线程池时，线程池会创建一个线程来执行任务，即使其他空闲的基本线程能够执行新任务也会创建线程，等到需要执行的任
务数大于线程池基本大小时就不再创建。如果调用了线程池的prestartAllCoreThreads()方法，线程池会提前创建并启动所有基本线程。
* 2）runnableTaskQueue（任务队列）：用于保存等待执行的任务的阻塞队列。可以选择以下几个阻塞队列。
    * ArrayBlockingQueue：是一个基于数组结构的有界阻塞队列，此队列按FIFO（先进先出）原则对元素进行排序。
    * LinkedBlockingQueue：一个基于链表结构的阻塞队列，此队列按FIFO排序元素，吞吐量通常要高于ArrayBlockingQueue。静态工厂方法Executors.newFixedThreadPool()使用了这个队列。
    * SynchronousQueue：一个不存储元素的阻塞队列。每个插入操作必须等到另一个线程调用移除操作，否则插入操作一直处于阻塞状态，吞吐量通常要高于Linked-BlockingQueue，静态工厂方法Executors.newCachedThreadPool使用了这个队列。
    * PriorityBlockingQueue：一个具有优先级的无限阻塞队列。
* maximumPoolSize（线程池最大数量）：线程池允许创建的最大线程数。如果队列满了，并且已创建的线程数小于最大线程数，则线程池会再创建新的线程执行任务。值得注意的是，如
果使用了无界的任务队列这个参数就没什么效果。
* ThreadFactory：用于设置创建线程的工厂，可以通过线程工厂给每个创建出来的线程设
置更有意义的名字。使用开源框架guava提供的ThreadFactoryBuilder可以快速给线程池里的线程设置有意义的名字，代码如下。
拒绝策略 
* RejectedExecutionHandler（拒绝策略）：当队列和线程池都满了，说明线程池处于饱和状态，那么必须采取一种策略处理提交的新任务。这个策略默认情况下是AbortPolicy，表示无法
处理新任务时抛出异常。在JDK 1.5中Java线程池框架提供了以下4种策略。
    * AbortPolicy：直接抛出异常。
    * CallerRunsPolicy：只用调用者所在线程来运行任务。
    * DiscardOldestPolicy：丢弃队列里最近的一个任务，并执行当前任务。
    * DiscardPolicy：不处理，丢弃掉。
    * 除此之外，还可以实现接口RejectedExecutionHandler进行自定义

### 4.19.3. 提交任务

execute 不没有返回者，submit可以通过Future获取线程执行结果。
```java
public interface Executor {
    void execute(Runnable command);
}

public interface ExecutorService extends Executor {
    <T> Future<T> submit(Callable<T> task);
    <T> Future<T> submit(Runnable task, T result);
    Future<?> submit(Runnable task);
}


```
### 4.19.4. 关闭线程池

可以通过调用线程池的shutdown或shutdownNow方法来关闭线程池。它们的原理是遍历线程池中的工作线程，然后逐个调用线程的interrupt方法来中断线程，所以无法响应中断的任务可能永远无法终止。但是它们存在一定的区别，shutdownNow首先将线程池的状态设置成STOP，然后尝试停止所有的正在执行或暂停任务的线程，并返回等待执行任务的列表，而shutdown只是将线程池的状态设置成SHUTDOWN状态，然后中断所有没有正在执行任务的线程。
只要调用了这两个关闭方法中的任意一个，isShutdown方法就会返回true。当所有的任务都已关闭后，才表示线程池关闭成功，这时调用isTerminaed方法会返回true。至于应该调用哪一种方法来关闭线程池，应该由提交到线程池的任务特性决定，通常调用shutdown方法来关闭线程池，如果任务不一定要执行完，则可以调用shutdownNow方法。

### 4.19.5. 合理地配置线程池

* 线程池大小太大会增加上下文切换，导致效率变低，太小则无法有效利用CPU资源。实际需要考虑任务的特性，系统资源状况(CPU,内存)，以及任务使用的稀缺资源状况。

要想合理地配置线程池，就必须首先分析任务特性，可以从以下几个角度来分析。
* 任务的性质：CPU密集型任务、IO密集型任务和混合型任务。
    * CPU密集型
        * 建议是比CPU多1个，因为某个CPU执行时可能会出现短暂阻塞，这时可以有多余的线程执行
        * IO密集型，可以适当增大。因为IO操作等待时间相比可能较长。可以为CPU的两倍
* 任务的优先级：高、中和低。
* 任务的执行时间：长、中和短。
* 任务的依赖性：是否依赖其他系统资源，如数据库连接

使用无界队列需要注意，如果线程任务执行缓慢，那么将可能导致队列过大，最终造成内存泄漏。

### 4.19.6. 线程池的监控
如果在系统中大量使用线程池，则有必要对线程池进行监控，方便在出现问题时，可以根据线程池的使用状况快速定位问题。可以通过线程池提供的参数进行监控，在监控线程池的时候可以使用以下属性。
* taskCount：线程池需要执行的任务数量。
* completedTaskCount：线程池在运行过程中已完成的任务数量，小于或等于taskCount。
* largestPoolSize：线程池里曾经创建过的最大线程数量。通过这个数据可以知道线程池是否曾经满过。如该数值等于线程池的最大大小，则表示线程池曾经满过。
* getPoolSize：线程池的线程数量。如果线程池不销毁的话，线程池里的线程不会自动销毁，所以这个大小只增不减。
* getActiveCount：获取活动的线程数。

通过扩展线程池进行监控。可以通过继承线程池来自定义线程池，重写线程池的beforeExecute、afterExecute和terminated方法，也可以在任务执行前、执行后和线程池关闭前执行一些代码来进行监控。例如，监控任务的平均执行时间、最大执行时间和最小执行时间等。

**线程池泄漏**
避免线程池任务长时间阻塞，导致可运行的线程数目越来越少。



## 4.20. Executor框架
<a href="#menu" style="float:right">目录</a>

### 4.20.1. Executor体系

**常用接口和类介绍**

```java
public interface Executor
public interface ExecutorService extends Executor 
public abstract class AbstractExecutorService implements ExecutorService
public class ThreadPoolExecutor extends AbstractExecutorService 

public interface ScheduledExecutorService extends ExecutorService
public class ScheduledThreadPoolExecutor  extends ThreadPoolExecutor  implements ScheduledExecutorService
```
* Executor是一个接口，它是Executor框架的基础，它将任务的提交与任务的执行分离开来。
* ThreadPoolExecutor是线程池的核心实现类，用来执行被提交的任务。
* ScheduledThreadPoolExecutor是一个实现类，可以在给定的延迟后运行命令，或者定期执行命令。ScheduledThreadPoolExecutor比Timer更灵活，功能更强大。
* Future接口和实现Future接口的FutureTask类，代表异步计算的结果。
* Runnable接口和Callable接口的实现类，都可以被ThreadPoolExecutor或ScheduledThreadPoolExecutor执行

**Future接口**
Future接口和实现Future接口的FutureTask类用来表示异步计算的结果。当我们把Runnable接口或Callable接口的实现类提交（submit）给ThreadPoolExecutor或ScheduledThreadPoolExecutor时，ThreadPoolExecutor或ScheduledThreadPoolExecutor会向我们返回一个FutureTask对象

ExecutorService
```java
<T> Future<T> submit(Callable<T> task);
<T> Future<T> submit(Runnable task, T result);
Future<?> submit(Runnable task);
```
Future
```java

public interface Future<V> {
    /**
    * 尝试取消任务，如果任务已经完成，或者任务已经被取消，或者其他原因，将会返回false.如果返回true,则将不会执行该任务
    */
    boolean cancel(boolean mayInterruptIfRunning);

    boolean isCancelled();
    boolean isDone();
    //获取执行结果
    V get() throws InterruptedException, ExecutionException;
    V get(long timeout, TimeUnit unit)
        throws InterruptedException, ExecutionException, TimeoutException;
}

```

**Runnable接口和Callable接口**
Runnable接口和Callable接口的实现类，都可以被ThreadPoolExecutor或ScheduledThreadPoolExecutor执行。它们之间的区别是Runnable不会返回结果，而Callable可以返回结果。
除了可以自己创建实现Callable接口的对象外，还可以使用工厂类Executors来把一个Runnable包装成一个Callable。
下面是Executors提供的，把一个Runnable包装成一个Callable的API。

```java
public static Callable<Object> callable(Runnable task) // 假设返回对象Callable1
public static <T> Callable<T> callable(Runnable task, T result) {
    if (task == null)
        throw new NullPointerException();
    return new RunnableAdapter<T>(task, result);
}
static final class RunnableAdapter<T> implements Callable<T> {
    final Runnable task;
    final T result;
    RunnableAdapter(Runnable task, T result) {
        this.task = task;
        this.result = result;
    }
    public T call() {
        task.run();
        return result;
    }
}
    

```

如果是Callable，线程任务可以有返回值
```java
public interface Callable<V> {
    V call() throws Exception;
}
public interface Runnable {
    public abstract void run();
}
```

### 4.20.2. Executors
Executors 相当于线程池的工厂类，提供了几种线程池创建方式

**固定线程数量的线程池**
```java
public static ExecutorService newFixedThreadPool(int nThreads) {
    return new ThreadPoolExecutor(nThreads, nThreads,
                                    0L, TimeUnit.MILLISECONDS,
                                    new LinkedBlockingQueue<Runnable>());
}
```
**只有单个线程的线程池**
```java
public static ExecutorService newSingleThreadExecutor() {
    return new FinalizableDelegatedExecutorService
        (new ThreadPoolExecutor(1, 1,
                                0L, TimeUnit.MILLISECONDS,
                                new LinkedBlockingQueue<Runnable>()));
}
```

**无限线程的线程池**
```java
public static ExecutorService newCachedThreadPool() {
    return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                                    60L, TimeUnit.SECONDS,
                                    new SynchronousQueue<Runnable>());
}
```
将会导致线程数量膨胀，慎用。

**具备定时执行的线程池**
```java
public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize) {
    return new ScheduledThreadPoolExecutor(corePoolSize);
}
public static ScheduledExecutorService newSingleThreadScheduledExecutor() {
    return new DelegatedScheduledExecutorService
        (new ScheduledThreadPoolExecutor(1));
}
```

ScheduledExecutorService

```java

public interface ScheduledExecutorService extends ExecutorService {

    public ScheduledFuture<?> schedule(Runnable command,
                                       long delay, TimeUnit unit);
    public <V> ScheduledFuture<V> schedule(Callable<V> callable,
                                           long delay, TimeUnit unit);

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable command,
                                                  long initialDelay,
                                                  long period,
                                                  TimeUnit unit);

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command,
                                                     long initialDelay,
                                                     long delay,
                                                     TimeUnit unit);

}

public class ScheduledThreadPoolExecutor
        extends ThreadPoolExecutor
        implements ScheduledExecutorService {
             public ScheduledThreadPoolExecutor(int corePoolSize) {
                super(corePoolSize, Integer.MAX_VALUE, 0, NANOSECONDS,
                    new DelayedWorkQueue());
            }
        }


```
scheduleAtFixedRate： 固定频率任务，任务启动的时间间隔时间是一致的。
scheduleWithFixedDelay: 固定延迟任务，本次任务执行结束再等待延迟时间才会执行下一次任务 


## 4.21. 并发编程实战
<a href="#menu" style="float:right">目录</a>


## 4.22. 队列
<a href="#menu" style="float:right">目录</a>

### 4.22.1. JDK队列概述
<a href="#menu" style="float:right">目录</a>

**Java  Queue基础**
* Queue： 基本上，一个队列就是一个先入先出（FIFO）的数据结构。
* offer，add区别： 一些队列有大小限制，因此如果想在一个满的队列中加入一个新项，多出的项就会被拒绝。 这时新的 offer 方法就可以起作用了。它不是对调用 add() 方法抛出一个 unchecked 异常，而只是得到由 offer() 返回的 false。
* poll，remove区别： remove() 和 poll() 方法都是从队列中删除第一个元素（head）。remove() 的行为与 Collection 接口的版本相似， 但是新的 poll() 方法在用空集合调用时不是抛出异常，只是返回 null。因此新的方法更适合容易出现异常条件的情况。
* peek，element区别： element() 和 peek() 用于在队列的头部查询元素。与 remove() 方法类似，在队列为空时， element() 抛出一个异常，而 peek() 返回 null。


**常见非阻塞队列**
* ArrayDeque, （数组双端队列）
* PriorityQueue, （优先级队列）
* ConcurrentLinkedQueue, （基于链表的并发队列）
* PriorityQueue 类实质上维护了一个有序列表。加入到 Queue 中的元素根据它们的天然排序（通过其 java.util.Comparable 实现）或者根据传递给构造函数的 java.util.Comparator 实现来定位。
* ConcurrentLinkedQueue 是基于链接节点的、线程安全的队列。并发访问不需要同步。因为它在队列的尾部添加元素并从头部删除它们，所以只要不需要知道队列的大小，ConcurrentLinkedQueue 对公共集合的共享访问就可以工作得很好。收集关于队列大小的信息会很慢，需要遍历队列。

**常见阻塞队列BlockingQueue**
* ArrayBlockingQueue和LinkedBlockingQueue是两个最普通也是最常用的阻塞队列，一般情况下，在处理多线程间的生产者消费者问题，使用这两个类足以。
* DelayQueue, （延期阻塞队列）（阻塞队列实现了BlockingQueue接口）
* ArrayBlockingQueue, （基于数组的并发阻塞队列） 底层是数组，有界队列，如果我们要使用生产者-消费者模式，这是非常好的选择。
* LinkedBlockingQueue, （基于链表的FIFO阻塞队列）  底层是链表，可以当做无界和有界队列来使用，所以大家不要以为它就是无界队列。
* LinkedBlockingDeque, （基于链表的FIFO双端阻塞队列）
* PriorityBlockingQueue, （带优先级的无界阻塞队列） 是无界队列，基于数组，数据结构为二叉堆，数组第一个也是树的根节点总是最小值。
* SynchronousQueue （并发同步阻塞队列）本身不带有空间来存储任何元素，使用上可以选择公平模式和非公平模式。

**BlockingQueue的核心方法：**
BlockingQueue 对插入操作、移除操作、获取元素操作提供了四种不同的方法用于不同的场景中使用：
* 1、抛出异常；
* 2、返回特殊值（null 或 true/false，取决于具体的操作）；
* 3、阻塞等待此操作，直到这个操作成功；
* 4、阻塞等待此操作，直到成功或者超时指定时间。

 

|抛出异常|	特殊值|	阻塞|	超时
|---|---|---|---|
|插入|	add(e)|	offer(e)|	put(e)|	offer(e, time, unit)
|删除|	remove()|	poll()|	take()|	poll(time, unit)
|获取|	element()|	peek()|	not applicable|	not applicable

* 放入数据：
    * offer(anObject):表示如果可能的话,将anObject加到BlockingQueue里,即如果BlockingQueue可以容纳,则返回true,否则返回false.（本方法不阻塞当前执行方法的线程）
    * offer(E o, long timeout, TimeUnit unit),可以设定等待的时间，如果在指定的时间内，还不能往队列中加入BlockingQueue，则返回失败。
    * put(anObject):把anObject加到BlockingQueue里,如果BlockQueue没有空间,则调用此方法的线程被阻断直到BlockingQueue里面有空间再继续.获取数据：
    * poll(time):取走BlockingQueue里排在首位的对象,若不能立即取出,则可以等time参数规定的时间,取不到时返回null;
    * poll(long timeout, TimeUnit unit)：从BlockingQueue取出一个队首的对象，如果在指定时间内，队列一旦有数据可取，则立即返回队列中的数据。否则知道时间超时还没有数据可取，返回失败。
    * take():取走BlockingQueue里排在首位的对象,若BlockingQueue为空,阻断进入等待状态直到BlockingQueue有新的数据被加入; 
    * drainTo():一次性从BlockingQueue获取所有可用的数据对象（还可以指定获取数据的个数），通过该方法，可以提升获取数据效率；不需要多次分批加锁或释放锁。

 



**1. ArrayBlockingQueue**
基于数组的阻塞队列实现，在ArrayBlockingQueue内部，维护了一个定长数组，以便缓存队列中的数据对象，这是一个常用的阻塞队列，除了 一个定长数组外，ArrayBlockingQueue内部还保存着两个整形变量，分别标识着队列的头部和尾部在数组中的位置。ArrayBlockingQueue在生产者放入数据和消费者获取数据，都是共用同一个锁对象，由此也意味着两者无法真正并行运行，这点尤其不同于 LinkedBlockingQueue；按照实现原理来分析，ArrayBlockingQueue完全可以采用分离锁，从而实现生产者和消费者操作的 完全并行运行。Doug Lea之所以没这样去做，也许是因为ArrayBlockingQueue的数据写入和获取操作已经足够轻巧，以至于引入独立的锁机制，除了给代码带来额外的复杂性外，其在性能上完全占不到任何便宜。 ArrayBlockingQueue和LinkedBlockingQueue间还有一个明显的不同之处在于，前者在插入或删除元素时不会产生或销毁任 何额外的对象实例，而后者则会生成一个额外的Node对象。这在长时间内需要高效并发地处理大批量数据的系统中，其对于GC的影响还是存在一定的区别。而 在创建ArrayBlockingQueue时，我们还可以控制对象的内部锁是否采用公平锁，默认采用非公平锁。

**2. LinkedBlockingQueue**
基于链表的阻塞队列，同ArrayListBlockingQueue类似，其内部也维持着一个数据缓冲队列（该队列由一个链表构成），当生产者往队列 中放入一个数据时，队列会从生产者手中获取数据，并缓存在队列内部，而生产者立即返回；只有当队列缓冲区达到最大值缓存容量时 （LinkedBlockingQueue可以通过构造函数指定该值），才会阻塞生产者队列，直到消费者从队列中消费掉一份数据，生产者线程会被唤醒，反之对于消费者这端的处理也基于同样的原理。而LinkedBlockingQueue之所以能够高效的处理并发数据，还因为其对于生产者端和消费者端分别采用了独立的锁来控制数据同步，这也意味着在高并发的情况下生产者和消费者可以并行地操作队列中的数据，以此来提高整个队列的并发性能。
作为开发者，我们需要注意的是，如果构造一个LinkedBlockingQueue对象，而没有指定其容量大小，LinkedBlockingQueue会默认 一个类似无限大小的容量（Integer.MAX_VALUE），这样的话，如果生产者的速度一旦大于消费者的速度，也许还没有等到队列满阻塞产生，系统内存就有可能已被消耗殆尽了。


**3. DelayQueue**
DelayQueue中的元素只有当其指定的延迟时间到了，才能够从队列中获取到该元素。DelayQueue是一个没有大小限制的队列，因此往队列中插入数据的操作（生产者）永远不会被阻塞，而只有获取数据的操作（消费者）才会被阻塞。
使用场景：DelayQueue使用场景较少，但都相当巧妙，常见的例子比如使用一个DelayQueue来管理一个超时未响应的连接队列。

**4. PriorityBlockingQueue**
基于优先级的阻塞队列（优先级的判断通过构造函数传入的Compator对象来决定），但需要注意的是PriorityBlockingQueue并不会阻塞数据生产者，而只会在没有可消费的数据时，阻塞数据的消费者。因此使用的时候要特别注意，生产者生产数据的速度绝对不能快于消费者消费数据的速度， 否则时间一长，会最终耗尽所有的可用堆内存空间。在实现PriorityBlockingQueue时，内部控制线程同步的锁采用的是公平锁。

**5. SynchronousQueue**
一种无缓冲的等待队列，类似于无中介的直接交易，有点像原始社会中的生产者和消费者，生产者拿着产品去集市销售给产品的最终消费者，而消费者必须亲自去 集市找到所要商品的直接生产者，如果一方没有找到合适的目标，那么对不起，大家都在集市等待。相对于有缓冲的BlockingQueue来说，少了一个中 间经销商的环节（缓冲区），如果有经销商，生产者直接把产品批发给经销商，而无需在意经销商最终会将这些产品卖给那些消费者，由于经销商可以库存一部分商 品，因此相对于直接交易模式，总体来说采用中间经销商的模式会吞吐量高一些（可以批量买卖）；但另一方面，又因为经销商的引入，使得产品从生产者到消费者 中间增加了额外的交易环节，单个产品的及时响应性能可能会降低。
声明一个SynchronousQueue有两种不同的方式，它们之间有着不太一样的行为。公平模式和非公平模式的区别:
如果采用公平模式：SynchronousQueue会采用公平锁，并配合一个FIFO队列来阻塞多余的生产者和消费者，从而体系整体的公平策略；
但如果是非公平模式（SynchronousQueue默认）：SynchronousQueue采用非公平锁，同时配合一个LIFO（后进先出法 Last In First Out ）队列来管理多余的生产者和消费者，而后一种模式，如果生产者和消费者的处理速度有差距，则很容易出现饥渴的情况，即可能有某些生产者或者是消费者的数据永远都得不到处理。

  

### 4.22.2. DelayedWorkQueue
<a href="#menu" style="float:right">目录</a>

我们知道线程池运行时，会不断从任务队列中获取任务，然后执行任务。如果我们想实现延时或者定时执行任务，重要一点就是任务队列会根据任务延时时间的不同进行排序，延时时间越短地就排在队列的前面，先被获取执行。

队列是先进先出的数据结构，就是先进入队列的数据，先被获取。但是有一种特殊的队列叫做优先级队列，它会对插入的数据进行优先级排序，保证优先级越高的数据首先被获取，与数据的插入顺序无关。

实现优先级队列高效常用的一种方式就是使用堆。

**用堆实现优先级队列**
在常用排序算法总结这篇文章中，我们详细地讲解了堆排序的实现。这里我们回顾一下。
* **1.1 什么是堆**


它是一个完全二叉树，即除了最后一层节点不是满的，其他层节点都是满的，即左右节点都有。
它不是二叉搜索树，即左节点的值都比父节点值小，右节点的值都不比父节点值小，这样查找的时候，就可以通过二分的方式，效率是(log N)。
它是特殊的二叉树，它要求父节点的值不能小于子节点的值。这样保证大的值在上面，小的值在下面。所以堆遍历和查找都是低效的，因为我们只知道
从根节点到子叶节点的每条路径都是降序的，但是各个路径之间都是没有联系的，查找一个值时，你不知道应该从左节点查找还是从右节点开始查找。
它可以实现快速的插入和删除，效率都在(log N)左右。所以它可以实现优先级队列。


堆是一个二叉树，但是它最简单的方式是通过数组去实现二叉树，而且因为堆是一个完全二叉树，就不存在数组空间的浪费。怎么使用数组来存储二叉树呢？

就是用数组的下标来模拟二叉树的各个节点,比如说根节点就是0，第一层的左节点是1，右节点是2。由此我们可以得出下列公式：

```java
// 对于n位置的节点来说：
int left = 2 * n + 1; // 左子节点
int right = 2 * n + 2; // 右子节点
int parent = (n - 1) / 2; // 父节点，当然n要大于0，根节点是没有父节点的
```
对于堆来说，只有两个操作，插入insert和删除remove，不管插入还是删除保证堆的成立条件，1.是完全二叉树，2.父节点的值不能小于子节点的值。
```java

  public void insert(int value) {
         // 第一步将插入的值，直接放在最后一个位置。并将长度加一
         store[size++] = value;
         // 得到新插入值所在位置。
         int index = size - 1;
         while(index > 0) {
             // 它的父节点位置坐标
             int parentIndex = (index - 1) / 2;
             // 如果父节点的值小于子节点的值，你不满足堆的条件，那么就交换值
             if (store[index] > store[parentIndex]) {
                 swap(store, index, parentIndex);
                 index = parentIndex;
             } else {
                 // 否则表示这条路径上的值已经满足降序，跳出循环
                 break;
             }
         }
     }
```

主要步骤:
直接将value插入到size位置，并将size自增，这样store数组中插入一个值了。
要保证从这个叶节点到根节点这条路径上的节点，满足父节点的值不能小于子节点。
通过int parentIndex = (index - 1) / 2得到父节点，如果比父节点值大，那么两者位置的值交换，然后再拿这个父节点和它的父父节点比较。
直到这个节点值比父节点值小，或者这个节点已经是根节点就退出循环。


因为我们每次只插入一个值，所以只需要保证新插入位置的叶节点到根节点路径满足堆的条件，因为其他路径没做操作，肯定是满足条件的。第二因为是直接在size位置插入值，所以肯定满足是完全二叉树这个条件。因为每次循环index都是除以2这种倍数递减的方式，所以它最多循环次数是(log N)次。

```java
   public int remove() {
          // 将根的值记录，最后返回
          int result = store[0];
          // 将最后位置的值放到根节点位置
          store[0] = store[--size];
          int index = 0;
          // 通过循环，保证父节点的值不能小于子节点。
          while(true) {
              int leftIndex = 2 * index + 1; // 左子节点
              int rightIndex = 2 * index + 2; // 右子节点
              // leftIndex >= size 表示这个子节点还没有值。
              if (leftIndex >= size) break;
              int maxIndex = leftIndex;
              if (store[leftIndex] < store[rightIndex]) maxIndex = rightIndex;
              if (store[index] < store[maxIndex]) {
                  swap(store, index, maxIndex);
                  index = maxIndex;
              } else {
                  break;
              }
          }
          return result;
      }
```
在堆中最大值就在根节点，所以操作步骤：

将根节点的值保存到result中。
将最后节点的值移动到根节点，再将长度减一，这样满足堆成立第一个条件，堆是一个完全二叉树。
使用循环，来满足堆成立的第二个条件，父节点的值不能小于子节点的值。
最后返回result。

那么怎么样满足堆的第二个条件呢？

因为根点的值现在是新值，那么就有可能比它的子节点小，所以就有可能要进行交换。

我们要找出左子节点和右子节点那个值更大，因为这个值可能要和父节点值进行交换，如果它不是较大值的话，它和父节点进行交换之后，就会出现父节点的值小于子节点。
将找到的较大子节点值和父节点值进行比较。
如果父节点的值小于它，那么将父节点和较大子节点值进行交换，然后再比较较大子节点和它的子节点。
如果父节点的值不小于子节点较大值，或者没有子节点(即这个节点已经是叶节点了)，就跳出循环。
每次循环我们都是以2的倍数递增，所以它也是最多循环次数是(log N)次。


所以通过堆这种方式可以快速实现优先级队列，它的插入和删除操作的效率都是O(log N)。
**二. DelayedWorkQueue类**
    static class DelayedWorkQueue extends AbstractQueue<Runnable>
        implements BlockingQueue<Runnable> {

从定义中看出DelayedWorkQueue是一个阻塞队列。
* **2.1 重要成员属性**
```java
// 初始时，数组长度大小。
private static final int INITIAL_CAPACITY = 16;
// 使用数组来储存队列中的元素。
private RunnableScheduledFuture<?>[] queue =
    new RunnableScheduledFuture<?>[INITIAL_CAPACITY];
// 使用lock来保证多线程并发安全问题。
private final ReentrantLock lock = new ReentrantLock();
// 队列中储存元素的大小
private int size = 0;

//特指队列头任务所在线程
private Thread leader = null;

// 当队列头的任务延时时间到了，或者有新的任务变成队列头时，用来唤醒等待线程
private final Condition available = lock.newCondition();
```

DelayedWorkQueue是用数组来储存队列中的元素，那么我们看看它是怎么实现优先级队列的。
* **2.2 插入元素排序siftUp方法**
```java
private void siftUp(int k, RunnableScheduledFuture<?> key) {
    // 当k==0时，就到了堆二叉树的根节点了，跳出循环
    while (k > 0) {
        // 父节点位置坐标, 相当于(k - 1) / 2
        int parent = (k - 1) >>> 1;
        // 获取父节点位置元素
        RunnableScheduledFuture<?> e = queue[parent];
        // 如果key元素大于父节点位置元素，满足条件，那么跳出循环
        // 因为是从小到大排序的。
        if (key.compareTo(e) >= 0)
            break;
        // 否则就将父节点元素存放到k位置
        queue[k] = e;
        // 这个只有当元素是ScheduledFutureTask对象实例才有用，用来快速取消任务。
        setIndex(e, k);
        // 重新赋值k，寻找元素key应该插入到堆二叉树的那个节点
        k = parent;
    }
    // 循环结束，k就是元素key应该插入的节点位置
    queue[k] = key;
    setIndex(key, k);
}
```
通过循环，来查找元素key应该插入在堆二叉树那个节点位置，并交互父节点的位置。具体流程在前面已经介绍过了。

* **2.3 移除元素排序siftDown方法**
```java
private void siftDown(int k, RunnableScheduledFuture<?> key) {
    int half = size >>> 1;
    // 通过循环，保证父节点的值不能小于子节点。
    while (k < half) {
        // 左子节点, 相当于 (k * 2) + 1
        int child = (k << 1) + 1;
        // 左子节点位置元素
        RunnableScheduledFuture<?> c = queue[child];
        // 右子节点, 相当于 (k * 2) + 2
        int right = child + 1;
        // 如果左子节点元素值大于右子节点元素值，那么右子节点才是较小值的子节点。
        // 就要将c与child值重新赋值
        if (right < size && c.compareTo(queue[right]) > 0)
            c = queue[child = right];
        // 如果父节点元素值小于较小的子节点元素值，那么就跳出循环
        if (key.compareTo(c) <= 0)
            break;
        // 否则，父节点元素就要和子节点进行交换
        queue[k] = c;
        setIndex(c, k);
        k = child;
    }
    queue[k] = key;
    setIndex(key, k);
}
```

通过循环，保证父节点的值不能小于子节点。

* **2.4 插入元素方法**
```java
public void put(Runnable e) {
    offer(e);
}

public boolean add(Runnable e) {
    return offer(e);
}

public boolean offer(Runnable e, long timeout, TimeUnit unit) {
    return offer(e);
}
```
我们发现与普通阻塞队列相比，这三个添加方法都是调用offer方法。那是因为它没有队列已满的条件，也就是说可以不断地向DelayedWorkQueue添加元素,当元素个数超过数组长度时，会进行数组扩容。

```java
public boolean offer(Runnable x) {
    if (x == null)
        throw new NullPointerException();
    RunnableScheduledFuture<?> e = (RunnableScheduledFuture<?>)x;
    // 使用lock保证并发操作安全
    final ReentrantLock lock = this.lock;
    lock.lock();
    try {
        int i = size;
        // 如果要超过数组长度，就要进行数组扩容
        if (i >= queue.length)
            // 数组扩容
            grow();
        // 将队列中元素个数加一
        size = i + 1;
        // 如果是第一个元素，那么就不需要排序，直接赋值就行了
        if (i == 0) {
            queue[0] = e;
            setIndex(e, 0);
        } else {
            // 调用siftUp方法，使插入的元素变得有序。
            siftUp(i, e);
        }
        // 表示新插入的元素是队列头，更换了队列头，
        // 那么就要唤醒正在等待获取任务的线程。
        if (queue[0] == e) {
            leader = null;
            // 唤醒正在等待等待获取任务的线程
            available.signal();
        }
    } finally {
        lock.unlock();
    }
    return true;
}
```
主要是三步：


元素个数超过数组长度，就会调用grow()方法，进行数组扩容。
将新元素e添加到优先级队列中对应的位置，通过siftUp方法，保证按照元素的优先级排序。
如果新插入的元素是队列头，即更换了队列头，那么就要唤醒正在等待获取任务的线程。这些线程可能是因为原队列头元素的延时时间没到，而等待的。


数组扩容方法：
```java
private void grow() {
    int oldCapacity = queue.length;
    // 每次扩容增加原来数组的一半数量。
    int newCapacity = oldCapacity + (oldCapacity >> 1); // grow 50%
    if (newCapacity < 0) // overflow
        newCapacity = Integer.MAX_VALUE;
    // 使用Arrays.copyOf来复制一个新数组
    queue = Arrays.copyOf(queue, newCapacity);
}
```
* **2.5 获取队列头元素**
2.5.1 立即获取队列头元素
```java
public RunnableScheduledFuture<?> poll() {
    final ReentrantLock lock = this.lock;
    lock.lock();
    try {
        RunnableScheduledFuture<?> first = queue[0];
        // 队列头任务是null，或者任务延时时间没有到，都返回null
        if (first == null || first.getDelay(NANOSECONDS) > 0)
            return null;
        else
            // 移除队列头元素
            return finishPoll(first);
    } finally {
        lock.unlock();
    }
}
```
当队列头任务是null，或者任务延时时间没有到，表示这个任务还不能返回，因此直接返回null。否则调用finishPoll方法，移除队列头元素并返回。

```java
// 移除队列头元素
private RunnableScheduledFuture<?> finishPoll(RunnableScheduledFuture<?> f) {
    // 将队列中元素个数减一
    int s = --size;
    // 获取队列末尾元素x
    RunnableScheduledFuture<?> x = queue[s];
    // 原队列末尾元素设置为null
    queue[s] = null;
    if (s != 0)
        // 因为移除了队列头元素，所以进行重新排序。
        siftDown(0, x);
    setIndex(f, -1);
    return f;
}
```

这个方法与我们在第一节中，介绍堆的删除方法一样。


先将队列中元素个数减一。
将原队列末尾元素设置成队列头元素，再将队列末尾元素设置为null。
调用siftDown(0, x)方法，保证按照元素的优先级排序。


2.5.2 等待获取队列头元素
```java
public RunnableScheduledFuture<?> take() throws InterruptedException {
            final ReentrantLock lock = this.lock;
            lock.lockInterruptibly();
            try {
                for (;;) {
                    RunnableScheduledFuture<?> first = queue[0];
                    // 如果没有任务，就让线程在available条件下等待。
                    if (first == null)
                        available.await();
                    else {
                        // 获取任务的剩余延时时间
                        long delay = first.getDelay(NANOSECONDS);
                        // 如果延时时间到了，就返回这个任务，用来执行。
                        if (delay <= 0)
                            return finishPoll(first);
                        // 将first设置为null，当线程等待时，不持有first的引用
                        first = null; // don't retain ref while waiting

                        // 如果还是原来那个等待队列头任务的线程，
                        // 说明队列头任务的延时时间还没有到，继续等待。
                        if (leader != null)
                            available.await();
                        else {
                            // 记录一下当前等待队列头任务的线程
                            Thread thisThread = Thread.currentThread();
                            leader = thisThread;
                            try {
                                // 当任务的延时时间到了时，能够自动超时唤醒。
                                available.awaitNanos(delay);
                            } finally {
                                if (leader == thisThread)
                                    leader = null;
                            }
                        }
                    }
                }
            } finally {
                if (leader == null && queue[0] != null)
                    // 唤醒等待任务的线程
                    available.signal();
                lock.unlock();
            }
        }
```
如果队列中没有任务，那么就让当前线程在available条件下等待。如果队列头任务的剩余延时时间delay大于0，那么就让当前线程在available条件下等待delay时间。

如果队列插入了新的队列头，它的剩余延时时间肯定小于原来队列头的时间，这个时候就要唤醒等待线程，看看它是否能获取任务。

2.5.3 超时等待获取队列头元素
```java
public RunnableScheduledFuture<?> poll(long timeout, TimeUnit unit)
    throws InterruptedException {
    long nanos = unit.toNanos(timeout);
    final ReentrantLock lock = this.lock;
    lock.lockInterruptibly();
    try {
        for (;;) {
            RunnableScheduledFuture<?> first = queue[0];
            // 如果没有任务。
            if (first == null) {
                // 超时时间已到，那么就直接返回null
                if (nanos <= 0)
                    return null;
                else
                    // 否则就让线程在available条件下等待nanos时间
                    nanos = available.awaitNanos(nanos);
            } else {
                // 获取任务的剩余延时时间
                long delay = first.getDelay(NANOSECONDS);
                // 如果延时时间到了，就返回这个任务，用来执行。
                if (delay <= 0)
                    return finishPoll(first);
                // 如果超时时间已到，那么就直接返回null
                if (nanos <= 0)
                    return null;
                // 将first设置为null，当线程等待时，不持有first的引用
                first = null; // don't retain ref while waiting
                // 如果超时时间小于任务的剩余延时时间，那么就有可能获取不到任务。
                // 在这里让线程等待超时时间nanos
                if (nanos < delay || leader != null)
                    nanos = available.awaitNanos(nanos);
                else {
                    Thread thisThread = Thread.currentThread();
                    leader = thisThread;
                    try {
                        // 当任务的延时时间到了时，能够自动超时唤醒。
                        long timeLeft = available.awaitNanos(delay);
                        // 计算剩余的超时时间
                        nanos -= delay - timeLeft;
                    } finally {
                        if (leader == thisThread)
                            leader = null;
                    }
                }
            }
        }
    } finally {
        if (leader == null && queue[0] != null)
            // 唤醒等待任务的线程
            available.signal();
        lock.unlock();
    }
}
```
与take方法相比较，就要考虑设置的超时时间，如果超时时间到了，还没有获取到有用任务，那么就返回null。其他的与take方法中逻辑一样。

**三. 总结**
使用优先级队列DelayedWorkQueue，保证添加到队列中的任务，会按照任务的延时时间进行排序，延时时间少的任务首先被获取。





<span id="menu"></span>

# 5. Spring 体系

## 5.1. Spring
<a href="#menu" style="float:right">目录</a>

### 5.1.1. IOC容器
### 5.1.2. AOP面向切面编程
### 5.1.3. Spring 事务管理
### 5.1.4. 常用注解
### 5.1.5. 常用工具类

## 5.2. Sppring MVC
### 5.2.1. Servlet



## 5.3. SpringBoot
<a href="#menu" style="float:right">目录</a>

### 5.3.1. 基本概念
SpringBoot的核心
* 自动配置，针对很多Spring应用常用框架进行自动默认配置，可以让你轻松启动项目。比如jedis。原先使用Jedis需要配置连接地址，配置连接池，使用SpringBoot之后，这些都会帮你配置好，只要引入相关依赖，调用其提供的接口，即可实现对Redis的访问。
* 起步依赖:告诉Spring使用什么功能，他都能引入需要的库。
* Actuator

### 5.3.2. Spring Boot 环境下创建Bean

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

# 6. SpringCloud
<a href="#menu" style="float:right">目录</a>



## 6.1. 测试
<a href="#menu" style="float:right">目录</a>

### 6.1.1. 基本测试
<a href="#menu" style="float:right">目录</a>

### 6.1.2. 控制层测试
<a href="#menu" style="float:right">目录</a>

### 6.1.3. 服务层测试
<a href="#menu" style="float:right">目录</a>

### 6.1.4. DAO层测试
<a href="#menu" style="float:right">目录</a>


## 6.2. 登录认证
### 6.2.1. Shiro
### 6.2.2. oauth2
### 6.2.3. token<span id="menu"></span>

# 7. MySQL
<a href="#menu" style="float:right">目录</a>

## 7.1. 基本概念
<a href="#menu" style="float:right">目录</a>

### 7.1.1. 基本概念
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


### 7.1.2. 常用工具
* workbench 跨平台可视化客户端

### 7.1.3. 逻辑架构图
<a href="#menu" style="float:right">目录</a>

![](https://github.com/lgjlife/Java-Study/blob/master/pic/mysql/mysql1.jpeg?raw=true)
![](https://github.com/lgjlife/Java-Study/blob/master/pic/mysql/mysql2.jpeg?raw=true)

* 连接--->认证---->确认可执行的权限
* MYSQL5.5及以上提供线程池插件，可以使用池中较少的线程来服务大量的连接
* MYSQL会对SQL进行相对应的优化，以提供最佳的访问性能
* 在解析查询之前，服务器会先检察查询缓存(如果开启的话)，存在缓存则直接将缓存返回客户端，更新操作将会修改缓存，缓存中没有数据，查询之后也会更新缓存。



### 7.1.4. 常用配置
<a href="#menu" style="float:right">目录</a>

## 7.2. 日志文件
<a href="#menu" style="float:right">目录</a>

### 7.2.1. 参数文件
<a href="#menu" style="float:right">目录</a>

* 告诉MYSQL实例启动时在哪里可以找到数据库文件，并且指定初始化参数，这些参数定义了某种内存结构的大小等设置，还会介绍参数的类型
也就是配置文件
```bash
lgj@lgj-Lenovo-G470:~$ mysql --help | grep my.cnf
                      order of preference, my.cnf, $MYSQL_TCP_PORT,
/etc/my.cnf /etc/mysql/my.cnf ~/.my.cnf 
```


### 7.2.2. 日志文件
<a href="#menu" style="float:right">目录</a>
* 用来记录运行时产生的日志，比如慢查询日志，二进制日志

### 7.2.3. socket文件
<a href="#menu" style="float:right">目录</a>
* 当用UNIX域套接字进行连接时需要的文件 

### 7.2.4. pid文件
<a href="#menu" style="float:right">目录</a>
* MYSQL实例的进程PID文件


### 7.2.5. MySQL表结构文件
<a href="#menu" style="float:right">目录</a>
* 表结构定义文件 

### 7.2.6. 存储引擎文件
<a href="#menu" style="float:right">目录</a>
* 存储了记录和索引等数据


## 7.3. NoSQL与关系型数据库设计理念比较　　

关系型数据库中的表都是存储一些格式化的数据结构，每个元组字段的组成都一样，即使不是每个元组都需要所有的字段，但数据库会为每个元组分配所有的字段，这样的结构可以便于表与表之间进行连接等操作，但从另一个角度来说它也是关系型数据库性能瓶颈的一个因素。而非关系型数据库以键值对存储，它的结构不固定，每一个元组可以有不一样的字段，每个元组可以根据需要增加一些自己的键值对，这样就不会局限于固定的结构，可以减少一些时间和空间的开销。

### 7.3.1. 关系型数据库
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

### 7.3.2. 非关系型数据库
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






## 7.4. 使用数据库
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



## 7.5. 数据类型
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

## 7.6. 数据更新

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


## 7.7. 查询入门
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


## 7.8. 多表连接查询
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

## 7.9. 函数
<a href="#menu" style="float:right">目录</a>

### 7.9.1. 聚集函数
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

### 7.9.2. 数学函数
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

### 7.9.3. 字符串函数
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

 
### 7.9.4. 日期和时间函数
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

### 7.9.5. 条件判断函数

* IF(expr,v1,v2)
    * 如果expr是TRUE则返回v1，否则返回v2
* IFNULL(v1,v2)
    * 如果v1不为NULL，则返回v1，否则返回v2
* CASE expr WHEN v1 THEN r1 [WHEN v2 THEN v2] [ELSE rn] END
    * 如果expr等于某个vn，则返回对应位置THEN后面的结果，如果与所有值都不想等，则返回ELSE后面的rn
 

### 7.9.6. 系统信息函数

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

 

### 7.9.7. 加密函数

* PASSWORD(str)
    * 从原明文密码str计算并返回加密后的字符串密码，注意这个函数的加密是单向的（不可逆），因此不应将它应用在个人的应用程序中而应该只在MySQL服务器的鉴定系统中使用
* MD5(str)
    * 为字符串算出一个MD5 128比特校验和，改值以32位十六进制数字的二进制字符串形式返回
* ENCODE(str, pswd_str)
    * 使用pswd_str作为密码，加密str
* DECODE(crypt_str,pswd_str)
    * 使用pswd_str作为密码，解密加密字符串crypt_str，crypt_str是由ENCODE函数返回的字符串
### 7.9.8. 其他函数
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


## 7.10. 存储过程
<a href="#menu" style="float:right">目录</a>

### 7.10.1. 基本概念
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

### 7.10.2. 使用存储过程


## 7.11. 视图
<a href="#menu" style="float:right">目录</a>

### 7.11.1. 基本概念

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

## 7.12. 触发器
<a href="#menu" style="float:right">目录</a>

### 7.12.1. 基本概念
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
### 7.12.2. 触发器操作
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


## 7.13. 事务
<a href="#menu" style="float:right">目录</a>

### 7.13.1. 基本概念

#### 7.13.1.1. 事务特点
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

#### 7.13.1.2. 锁
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

#### 7.13.1.3. 多版本并发控制

* MVCC是行级锁的一个变种，很多情况下可以避免加锁，所以开销更低。大都实现了非阻塞读操作，写操作也只锁定必要的行。

* InnoDB的实现
    * 每行记录后保存两个隐藏的列来实现
    * 一个列保存了行的创建版本号，一个列保存行的过期(删除)版本号
    * 每开始一个新事务，系统版本号都会自动递增。事务开始时刻的系统版本号会作为事务的版本号。用来和查询到的每行记录的版本号进行比较。
    
#### 7.13.1.4. 常见术语
* 术语：
    * 事务（transaction）指一组SQL语句；
    * 回退（rollback）指撤销指定SQL语句的过程；
    * 提交（commit）指将未存储的SQL语句结果写入数据库表；   
    * 保留点（ savepoint）指事务处理中设置的临时占位符（ placeholder），你可以对它发布回退（与回退整个事务处理不同）。

### 7.13.2. 基本语句
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


## 7.14. 数据库索引 
<a href="#menu" style="float:right">目录</a>


### 7.14.1. 基本概念

#### 7.14.1.1. 分类
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
#### 7.14.1.2. 索引用途
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

#### 7.14.1.3. 索引的误区
目前，MySQL的服务器可以提供足够大的内存来提供缓存索引相关数据，提高性能，因此有些规范不再适合当前的硬件环境。
* 误区
    * 索引层级不要超过5层
    * 单表的索引数不要超过6个
        * 不要给表的索引数目设置上限，保证性能才是最主要的。
    * 不应该索引不稳定的列
        
    
#### 7.14.1.4. 索引数据结构
<a href="#menu" style="float:right">目录</a>

## 7.15. 存储引擎
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
    
### 7.15.1. InnoDB存储引擎

InnoDB是事务型数据库的首选引擎，支持事务安全表（ACID），支持行锁定和外键，上图也看到了，InnoDB是默认的MySQL引擎。InnoDB主要特性有：
* InnoDB给MySQL提供了具有提交、回滚和崩溃恢复能力的事物安全（ACID兼容）存储引擎。InnoDB锁定在行级并且也在SELECT语句中提供一个类似Oracle的非锁定读。这些功能增加了多用户部署和性能。在SQL查询中，可以自由地将InnoDB类型的表和其他MySQL的表类型混合起来，甚至在同一个查询中也可以混合
* InnoDB是为处理巨大数据量的最大性能设计。它的CPU效率可能是任何其他基于磁盘的关系型数据库引擎锁不能匹敌的
* InnoDB存储引擎完全与MySQL服务器整合，InnoDB存储引擎为在主内存中缓存数据和索引而维持它自己的缓冲池。InnoDB将它的表和索引在一个逻辑表空间中，表空间可以包含数个文件（或原始磁盘文件）。这与MyISAM表不同，比如在MyISAM表中每个表被存放在分离的文件中。InnoDB表可以是任何尺寸，即使在文件尺寸被限制为2GB的操作系统上
* InnoDB支持外键完整性约束，存储表中的数据时，每张表的存储都按主键顺序存放，如果没有显示在表定义时指定主键，InnoDB会为每一行生成一个6字节的ROWID，并以此作为主键
* InnoDB被用在众多需要高性能的大型数据库站点上
InnoDB不创建目录，使用InnoDB时，MySQL将在MySQL数据目录下创建一个名为ibdata1的10MB大小的自动扩展数据文件，以及两个名为ib_logfile0和ib_logfile1的5MB大小的日志文件

### 7.15.2. MyISAM存储引擎

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

### 7.15.3. MEMORY存储引擎

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

### 7.15.4. 存储引擎的选择

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

## 7.16. 性能优化基本的分析命令
<a href="#menu" style="float:right">目录</a>

### 7.16.1. explain
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

### 7.16.2. show indexs
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
## 7.17. 分库分表

### 7.17.1. 基本概念
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

### 7.17.2. 分布式事务
<a href="#menu" style="float:right">目录</a>

### 7.17.3. 应对多机数据查询
<a href="#menu" style="float:right">目录</a>

#### 7.17.3.1. 跨库Join
* 应用层处理，将单次Join操作分成多次查询
* 数据冗余，将表增加字段，冗余其他表的数据，需要考虑数据一致性问题
* 借助外部系统，比如搜索引擎解决一些跨库问题
#### 7.17.3.2. 外键约束
* 跨库不支持外键约束
* 需要应用层解决跨库数据一致性问题


## 7.18. 高可用

<a href="#menu" style="float:right">目录</a>

### 7.18.1. 主从复制
#### 7.18.1.1. 常见形式
* 多主方式 ，主主之间互相复制
* 一主一从
* 一主多从
* 多主一从
* 联级复制，树形结构
#### 7.18.1.2. 主从同步复制原理
* 主库将所有的写操作记录在binlog日志中，并生成log dump线程，将binlog日志传给从库的I/O线程
* 从库生成两个线程，一个是I/O线程，另一个是SQL线程
* I/O线程去请求主库的binlog日志，并将binlog日志中的文件写入relay log（中继日志）中
* SQL线程会读取relay loy中的内容，并解析成具体的操作，来实现主从的操作一致，达到最终数据一致的目的
#### 7.18.1.3. 主从同步配置

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
#### 7.18.1.4. 添加更多从服务器
有时候我们希望配置多台从服务器。如果是新建立的主从环境，没有什么数据，那么无论多少从服务器，搭建方式和上面说的没有什么两样。重点是，如果在已经运行了一段时间的主从环境中添加更多的从服务器，那么这台从服务器的配置就有点不一样。原因是：在主从配置的过程中，我们需要对服务器进行锁表操作，也就是说，任何数据都不可以继续写入，且持续的时间有可能会很长，在生产环境下，基本上是不允许的。
也就是说，我们不能在主服务器上下手，相反，我们应该在已经存在的从服务器这边下手。基本过程如下：

* 停止旧slave服务器的MySQL服务
* 把旧的slave服务器上的数据复制到新的从服务器里
* 为新服务器分配唯一的server-id和开启其他选项
* 重启服务器



<span id="menu"></span>



# 8. Mybatis

<a href="#menu" style="float:right">目录</a>

## 8.1. 简介
<a href="#menu" style="float:right">目录</a>

### 8.1.1. 传统的JDBC编程

**流程**
* 使用JDBC编程需要连接数据库，注册驱动和数据库信息
* 操作Connection,打开Statement对象
* 通过Statement执行SQL，返回结果到ResultSet对象
* 使用ResultSet读取数据，然后转化为具体的POJO对象
* 关闭数据库连接资源

可以看到使用JDBC编程方式相对复杂。

### 8.1.2. ORM模型

* ORM(Object Relation Mapping)对象关系映射
* ORM就是数据库的表和简单的Java对象的映射关系模型，通过这种关系就能迅速地将数据库的表和POJO对象相互转化。


**什么是 MyBatis**
MyBatis 是一款优秀的持久层框架，它支持定制化 SQL、存储过程以及高级映射。MyBatis 避免了几乎所有的 JDBC 代码和手动设置参数以及获取结果集。MyBatis 可以使用简单的 XML 或注解来配置和映射原生类型、接口和 Java 的 POJO（Plain Old Java Objects，普通老式 Java 对象）为数据库中的记录。

### 8.1.3. HIBERNATE与MYBATIS的对比
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

### 8.1.4. Mybatis与iBatis的主要差异对比
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


### 8.1.5. Mybatis基本构成
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


### 8.1.6. 常见面试题
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





## 8.2. 配置
<a href="#menu" style="float:right">目录</a>

### 8.2.1. 配置
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

### 8.2.2. 属性（properties）
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

### 8.2.3. 类型别名（typeAliases）
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

### 8.2.4. 类型处理器（typeHandlers）
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

### 8.2.5. 处理枚举类型
<a href="#menu" style="float:right">目录</a>

若想映射枚举类型 Enum，则需要从 EnumTypeHandler 或者 EnumOrdinalTypeHandler 中选一个来使用。

比如说我们想存储取近似值时用到的舍入模式。默认情况下，MyBatis 会利用 EnumTypeHandler 来把 Enum 值转换成对应的名字。

注意 EnumTypeHandler 在某种意义上来说是比较特别的，其他的处理器只针对某个特定的类，而它不同，它会处理任意继承了 Enum 的类。
不过，我们可能不想存储名字，相反我们的 DBA 会坚持使用整形值代码。那也一样轻而易举： 在配置文件中把 EnumOrdinalTypeHandler 加到 typeHandlers 中即可， 这样每个 RoundingMode 将通过他们的序数值来映射成对应的整形数值。
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

### 8.2.6. 对象工厂（objectFactory）
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

### 8.2.7. 插件（plugins）
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

### 8.2.8. 事务管理器（transactionManager）
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

### 8.2.9. 数据源（dataSource）
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

### 8.2.10. 数据库厂商标识（databaseIdProvider）
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

### 8.2.11. 映射器（mappers）
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

## 8.3. XML 映射文件
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

### 8.3.1. select
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

### 8.3.2. Insert, Update, Delete 元素的属性
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

### 8.3.3. sql
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
### 8.3.4. 参数
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

### 8.3.5. 字符串替换
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

### 8.3.6. 结果映射
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

### 8.3.7. 高级结果映射
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

### 8.3.8. 结果映射（resultMap）
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

### 8.3.9. 支持的 JDBC 类型
<a href="#menu" style="float:right">目录</a>

为了以后可能的使用场景，MyBatis 通过内置的 jdbcType 枚举类型支持下面的 JDBC 类型。

|||||||
|---|---|---|---|---|---|
|BIT|	FLOAT|	CHAR	|TIMESTAMP|	OTHER	|UNDEFINED|
|TINYINT|	REAL|	VARCHAR	|BINARY|	BLOB|	NVARCHAR|
|SMALLINT|	DOUBLE|	LONGVARCHAR|	VARBINARY|	CLOB|	NCHAR|
|INTEGER|	NUMERIC|	DATE|	LONGVARBINARY	|BOOLEAN|	NCLOB|
|BIGINT|	DECIMAL|	TIME|	NULL|	CURSOR|	ARRAY|

### 8.3.10. 构造方法
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

### 8.3.11. 关联
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

### 8.3.12. 关联的嵌套 Select 查询
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

### 8.3.13. 关联的嵌套结果映射
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

### 8.3.14. 关联的多结果集（ResultSet）
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

### 8.3.15. 集合
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

### 8.3.16. 集合的嵌套 Select 查询
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
### 8.3.17. 集合的嵌套结果映射
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

### 8.3.18. 集合的多结果集（ResultSet）
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

### 8.3.19. 鉴别器
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

### 8.3.20. 自动映射
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


## 8.4. 动态 SQL
<a href="#menu" style="float:right">目录</a>

MyBatis 的强大特性之一便是它的动态 SQL。如果你有使用 JDBC 或其它类似框架的经验，你就能体会到根据不同条件拼接 SQL 语句的痛苦。例如拼接时要确保不能忘记添加必要的空格，还要注意去掉列表最后一个列名的逗号。利用动态 SQL 这一特性可以彻底摆脱这种痛苦。

虽然在以前使用动态 SQL 并非一件易事，但正是 MyBatis 提供了可以被用在任意 SQL 映射语句中的强大的动态 SQL 语言得以改进这种情形。

动态 SQL 元素和 JSTL 或基于类似 XML 的文本处理器相似。在 MyBatis 之前的版本中，有很多元素需要花时间了解。MyBatis 3 大大精简了元素种类，现在只需学习原来一半的元素便可。MyBatis 采用功能强大的基于 OGNL 的表达式来淘汰其它大部分元素。

* if
* choose (when, otherwise)
* trim (where, set)
* foreach

### 8.4.1. if
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

### 8.4.2. choose, when, otherwise
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

### 8.4.3. trim, where, set
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

### 8.4.4. WHERE
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

### 8.4.5. foreach
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

### 8.4.6. script
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
### 8.4.7. bind
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


## 8.5. 缓存
<a href="#menu" style="float:right">目录</a>

### 8.5.1. Mybatis 缓存

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

### 8.5.2. 使用自定义缓存
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

## 8.6. 插件
<a href="#menu" style="float:right">目录</a>

前言
MyBatis开放用户实现自己的插件，从而对整个调用过程进行个性化扩展。
这是MyBatis整个调用流程的主要参与者。
我们可以对其中的一些过程进行拦截，添加自己的功能，比如重写Sql添加分页参数。

![](https://img2018.cnblogs.com/blog/1404294/201906/1404294-20190610164312882-425922091.png)
 

### 8.6.1. 拦截的接口
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

### 8.6.2. 拦截器实现
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

## 8.7. 代码生成器
<a href="#menu" style="float:right">目录</a>

### 8.7.1. 创建需要生成的数据表
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

### 8.7.2. 创建Mybatis代码自动生成配置文件
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

### 8.7.3. 配置运行
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

## 8.8. Mybatis整体架构

<a href="#menu" style="float:right">目录</a>



MyBatis 的整体架构分为三层 ， 分别是基础支持层 、 核心处理层和接口层
![MyBatis 的整体架构](https://github.com/lgjlife/Java-Study/blob/master/pic/mybatis/mybatis.png?raw=true)

### 8.8.1. 基础支持层
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

### 8.8.2. 核心处理层
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

### 8.8.3. 接口层
<a href="#menu" style="float:right">目录</a>

接口层相对简单，其核心是 SqlSession 接口，该接口中定义了 MyBatis 暴露给应用程序调用的 API，也就是上层应用与 MyBatis 交互的桥梁。接口层在接收到调用请求时，会调用核心处理层的相应模块来完成具体的数据库操作

### 8.8.4. 模块说明
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

# 9. Redis
<a href="#menu" style="float:right">目录</a>

## 9.1. 数据结构和对象
<a href="#menu" style="float:right">目录</a>


### 9.1.1. 简单动态字符串
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
        

### 9.1.2. 链表
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


### 9.1.3. 字典
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
#### 9.1.3.1. Rehash

<a href="#menu" style="float:right">目录</a>

* 为了让哈希表的负载因子维持在一个合理的范围内，需要对字典表进行重新扩展或者收缩


### 9.1.4. 跳跃表
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

### 9.1.5. 整数集合
<a href="#menu" style="float:right">目录</a>


### 9.1.6. 压缩列表
<a href="#menu" style="float:right">目录</a>

* 压缩列表是列表键和哈希键的底层实现之一


### 9.1.7. 对象
<a href="#menu" style="float:right">目录</a>

* 前面章节介绍了Redis所有的主要数结构，但是Redis并没有使用这些数据结构来实现键值对数据库。而是基于这些数据结构创建不同的对象。
* 字符串对象，列表对象，哈希对象，集合对象，无序集合对象。
* 每种对象至少使用了前面一种数据结构实现
* Redis在执行命令之前，会根据对象的类型来判断是否可以执行给定的命令
* 使用对象可以针对不同的应用场景，为对象设置多种不同的数据结构实现，从而优化对象在不同场景下的使用效率。
* Redis的垃圾回收是基于引用计数器实现

#### 9.1.7.1. 对象类型和编码
<a href="#menu" style="float:right">目录</a>

#### 9.1.7.2. 字符串对象
<a href="#menu" style="float:right">目录</a>


#### 9.1.7.3. 列表对象
<a href="#menu" style="float:right">目录</a>


#### 9.1.7.4. 哈希对象
<a href="#menu" style="float:right">目录</a>


#### 9.1.7.5. 集合对象 
<a href="#menu" style="float:right">目录</a>


#### 9.1.7.6. 由于集合对象
<a href="#menu" style="float:right">目录</a>


#### 9.1.7.7. 类型检查和命令多态
<a href="#menu" style="float:right">目录</a>

#### 9.1.7.8. 内存回收
<a href="#menu" style="float:right">目录</a>

#### 9.1.7.9. 对象共享
<a href="#menu" style="float:right">目录</a>

#### 9.1.7.10. 对象空转时长
<a href="#menu" style="float:right">目录</a>


## 9.2. 单机数据库实现
<a href="#menu" style="float:right">目录</a>


### 9.2.1. 数据库
<a href="#menu" style="float:right">目录</a>


### 9.2.2. RDB持久化
<a href="#menu" style="float:right">目录</a>


### 9.2.3. AOF持久化
<a href="#menu" style="float:right">目录</a>


### 9.2.4. 事件
<a href="#menu" style="float:right">目录</a>


### 9.2.5. 客户端
<a href="#menu" style="float:right">目录</a>


### 9.2.6. 服务器
<a href="#menu" style="float:right">目录</a>


## 9.3. 多机数据库实现
<a href="#menu" style="float:right">目录</a>


### 9.3.1. 复制
<a href="#menu" style="float:right">目录</a>

### 9.3.2. 哨兵
<a href="#menu" style="float:right">目录</a>


### 9.3.3. 集群
<a href="#menu" style="float:right">目录</a>


## 9.4. 独立功能实现
<a href="#menu" style="float:right">目录</a>


### 9.4.1. 发布与订阅
<a href="#menu" style="float:right">目录</a>


### 9.4.2. 事务
<a href="#menu" style="float:right">目录</a>


### 9.4.3. LUA脚本
<a href="#menu" style="float:right">目录</a>



### 9.4.4. 排序
<a href="#menu" style="float:right">目录</a>


### 9.4.5. 二进制位数组
<a href="#menu" style="float:right">目录</a>



### 9.4.6. 慢查询日志
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
    

### 9.4.7. 监视器
<a href="#menu" style="float:right">目录</a>




<span id="menu"></span>

<a href="#menu" style="float:right">目录</a>

# 10. Nginx

## 10.1. 概述
<a href="#menu" style="float:right">目录</a>

### 10.1.1. 功能特性
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

### 10.1.2. Nginx快速理解

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




## 10.2. 基本使用和配置
<a href="#menu" style="float:right">目录</a>

### 10.2.1. Nginx平滑升级
<a href="#menu" style="float:right">目录</a>



### 10.2.2. 配置文件
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


## 10.3. 架构说明
<a href="#menu" style="float:right">目录</a>

### 10.3.1. 模块化结构
<a href="#menu" style="float:right">目录</a>

#### 10.3.1.1. 模块分类
<a href="#menu" style="float:right">目录</a>

**核心模块**
**标准HTTP模块**
**可选HTTP模块**
**邮件服务模块**
**第三方模块**
### 10.3.2. web请求处理机制
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

### 10.3.3. 设计架构概览
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




## 10.4. 高级配置
<a href="#menu" style="float:right">目录</a>


## 10.5. gzip压缩
<a href="#menu" style="float:right">目录</a>




## 10.6. rewrite功能
<a href="#menu" style="float:right">目录</a>

rewrite功能 用于重定向服务时起到作用。

### 10.6.1. nginx后端服务器组的配置的5个技术指令
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


### 10.6.2. rewrite功能的配置
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



### 10.6.3. rewrite使用
<a href="#menu" style="float:right">目录</a>



## 10.7. 代理服务
<a href="#menu" style="float:right">目录</a>

### 10.7.1. 正向代理和反向代理
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

### 10.7.2. Nginx正向代理服务

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

### 10.7.3. Nginx反向代理服务
<a href="#menu" style="float:right">目录</a>

#### 10.7.3.1. 反向代理基本设置的21个指令 
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

#### 10.7.3.2. proxy buffer 的配置的7个指令
<a href="#menu" style="float:right">目录</a>

* **proxy_buffering**
* **proxy_buffers**
* **proxy_buffer_size**
* **proxy_busy_buffer_size**
* **proxy_temp_path**
* **proxy_max_temp_file_size**
* **proxy_temp_write_size**

#### 10.7.3.3. proxy cache 的配置的12个指令
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


### 10.7.4. Nginx服务器负载均衡

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

## 10.8. 邮件服务
<a href="#menu" style="float:right">目录</a>


## 10.9. 源码结构
<a href="#menu" style="float:right">目录</a>


## 10.10. 基本数据结构
<a href="#menu" style="float:right">目录</a>


## 10.11. 启动初始化
<a href="#menu" style="float:right">目录</a>

### 10.11.1. 启动过程概览
* 解析输入参数，通过输入参数确定Nginx服务器具体行为
* 初始化时间和日志，备份输入参数，并初始化相关的全局变量。一些变量的值依赖于Nginx服务器所在操作系统的相关信息，比如内存页面大小，系统支持最大文件打开数目
* 保存输入参数
* 初始化描述网络套接字的相关结构
* 初始化ngx_module_t数组
* 读取并保存Nginx配置参数
* 初始化ngx_cycle_s结构体
* 保存工作进程ID到PID文件

## 10.12. 时间管理
<a href="#menu" style="float:right">目录</a>


## 10.13. 内存管理
<a href="#menu" style="float:right">目录</a>

### 10.13.1. 内存的逻辑结构
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




### 10.13.2. 内存池管理

### 10.13.3. 内存的使用


## 10.14. 工作进程
<a href="#menu" style="float:right">目录</a>

### 10.14.1. nginx服务进程间通信
<a href="#menu" style="float:right">目录</a>

#### 10.14.1.1. Linux进程间通信方式

* 进程间通信方式
    * 使用IPC（消息队列，信号量，共享存储）
        * 功能强大，但是不能支持Nginx服务器使用的事件驱动模型
    * 管道
        * 管道简单易用，但是限制比较多，一般只是单向通信
        * 一般在父子进程间通信
    * 套接字 socket
        * 用于网络通信，也可用于系统内进程间通信
        * 支持双向通信
          
#### 10.14.1.2. Linux进程间双工通信方式的实现


#### 10.14.1.3. 通信通道建立和设置


#### 10.14.1.4. 通信通道的使用


#### 10.14.1.5. 消息的读写

## 10.15. 模块编程
<a href="#menu" style="float:right">目录</a>


### 10.15.1. 模块的种类
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

### 10.15.2. 模块开发实战
<a href="#menu" style="float:right">目录</a>


### 10.15.3. 模块的编译和安装
<a href="#menu" style="float:right">目录</a>





<span id="menu"></span>

# 11. WEB容器
<a href="#menu" style="float:right">目录</a>


## 11.1. WEB容器比较
<a href="#menu" style="float:right">目录</a>

**Jetty和tomcat的比较**
* 相同点：
    * Tomcat和Jetty都是一种Servlet引擎，他们都支持标准的servlet规范和JavaEE的规范。
* 不同点：
    * 架构比较 
        * Jetty的架构比Tomcat的更为简单 
        * Jetty的架构是基于Handler来实现的，主要的扩展功能都可以用Handler来实现，扩展简单。 
        * Tomcat的架构是基于容器设计的，进行扩展是需要了解Tomcat的整体设计结构，不易扩展。
    * 性能比较 
        * Jetty和Tomcat性能方面差异不大 
        * Jetty可以同时处理大量连接而且可以长时间保持连接，适合于web聊天应用等等。 
        * Jetty的架构简单，因此作为服务器，Jetty可以按需加载组件，减少不需要的组件，减少了服务器内存开销，从而提高服务器性能。 
        * Jetty默认采用NIO结束在处理I/O请求上更占优势，在处理静态资源时，性能较高
        * 少数非常繁忙;Tomcat适合处理少数非常繁忙的链接，也就是说链接生命周期短的话，Tomcat的总体性能更高。 
        * Tomcat默认采用BIO处理I/O请求，在处理静态资源时，性能较差。
    * 其它比较 
        * Jetty的应用更加快速，修改简单，对新的Servlet规范的支持较好。 
        * Tomcat目前应用比较广泛，对JavaEE和Servlet的支持更加全面，很多特性会直接集成进来。
    
## 11.2. Servlet规范
<a href="#menu" style="float:right">目录</a>

**Servlet 是什么？**
* Java Servlet 是运行在 Web 服务器或应用服务器上的程序，它是作为来自 Web 浏览器或其他 HTTP 客户端的请求和 HTTP 服务器上的数据库或应用程序之间的中间层。

* 使用 Servlet，您可以收集来自网页表单的用户输入，呈现来自数据库或者其他源的记录，还可以动态创建网页。

* Java Servlet 通常情况下与使用 CGI（Common Gateway Interface，公共网关接口）实现的程序可以达到异曲同工的效果。但是相比于 CGI，Servlet 有以下几点优势：
性能明显更好。
    * Servlet 在 Web 服务器的地址空间内执行。这样它就没有必要再创建一个单独的进程来处理每个客户端请求。
    * Servlet 是独立于平台的，因为它们是用 Java 编写的。服务器上的 Java 安全管理器执行了一系列限制，以保护服务器计算机上的资源。因此，Servlet 是可信的。
    * Java 类库的全部功能对 Servlet 来说都是可用的。它可以通过 sockets 和 RMI 机制与 applets、数据库或其他软件进行交互。

**Servlet 任务**
* Servlet 执行以下主要任务：
    * 读取客户端（浏览器）发送的显式的数据。这包括网页上的 HTML 表单，或者也可以是来自 applet 或自定义的 HTTP 客户端程序的表单。
    * 读取客户端（浏览器）发送的隐式的 HTTP 请求数据。这包括 cookies、媒体类型和浏览器能理解的压缩格式等等。
    * 处理数据并生成结果。这个过程可能需要访问数据库，执行 RMI 或 CORBA 调用，调用 Web 服务，或者直接计算得出对应的响应。
    * 发送显式的数据（即文档）到客户端（浏览器）。该文档的格式可以是多种多样的，包括文本文件（HTML 或 XML）、二进制文件（GIF 图像）、Excel 等。
    * 发送隐式的 HTTP 响应到客户端（浏览器）。这包括告诉浏览器或其他客户端被返回的文档类型（例如 HTML），设置 cookies 和缓存参数，以及其他类似的任务。


**Servlet创建方式**
* 实现接口Servlet
* 继承抽象类GenericServlet
* 继承HttpServlet，并重写doGet,doPost等方法

**Servlet 生命周期**

* Servlet 生命周期可被定义为从创建直到毁灭的整个过程。以下是 Servlet 遵循的过程：
    * Servlet 通过调用 init () 方法进行初始化。
    * Servlet 调用 service() 方法来处理客户端的请求。
    * Servlet 通过调用 destroy() 方法终止（结束）。
    * 最后，Servlet 是由 JVM 的垃圾回收器进行垃圾回收的。

* **init() 方法**
    * init 方法被设计成只调用一次。它在第一次创建 Servlet 时被调用，在后续每次用户请求时不再调用。因此，它是用于一次性初始化，就像 Applet 的 init 方法一样。
    * Servlet 创建于用户第一次调用对应于该 Servlet 的 URL 时，但是您也可以指定 Servlet 在服务器第一次启动时被加载。
    * 当用户调用一个 Servlet 时，就会创建一个 Servlet 实例，每一个用户请求都会产生一个新的线程，适当的时候移交给 doGet 或 doPost 方法。init() 方法简单地创建或加载一些数据，这些数据将被用于 Servlet 的整个生命周期。
    * init 方法的定义如下：
```java
public void init() throws ServletException {
  // 初始化代码...
}
```
* **service() 方法**
    * service() 方法是执行实际任务的主要方法。Servlet 容器（即 Web 服务器）调用 service() 方法来处理来自客户端（浏览器）的请求，并把格式化的响应写回给客户端。
    * 每次服务器接收到一个 Servlet 请求时，服务器会产生一个新的线程并调用服务。service() 方法检查 HTTP 请求类型（GET、POST、PUT、DELETE 等），并在适当的时候调用 doGet、doPost、doPut，doDelete 等方法。
    * service() 方法由容器调用，service 方法在适当的时候调用 doGet、doPost、doPut、doDelete 等方法。所以，您不用对 service() 方法做任何动作，您只需要根据来自客户端的请求类型来重写 doGet() 或 doPost() 即可。
```java
public void service(ServletRequest request, 
                    ServletResponse response) 
      throws ServletException, IOException{
}
```
* **doGet() 方法**
    * GET 请求来自于一个 URL 的正常请求，或者来自于一个未指定 METHOD 的 HTML 表单，它由 doGet() 方法处理。
```java
public void doGet(HttpServletRequest request,
                  HttpServletResponse response)
    throws ServletException, IOException {
    // Servlet 代码
}
```
* **doPost() 方法**
POST 请求来自于一个特别指定了 METHOD 为 POST 的 HTML 表单，它由 doPost() 方法处理。

```java
public void doPost(HttpServletRequest request,
                   HttpServletResponse response)
    throws ServletException, IOException {
    // Servlet 代码
}
```
* **destroy() 方法**
    * destroy() 方法只会被调用一次，在 Servlet 生命周期结束时被调用。destroy() 方法可以让您的 Servlet 关闭数据库连接、停止后台线程、把 Cookie 列表或点击计数器写入到磁盘，并执行其他类似的清理活动。

    * 在调用 destroy() 方法之后，servlet 对象被标记为垃圾回收。destroy 方法定义如下所示：

```java
  public void destroy() {
    // 终止化代码...
  }
```
* 一个典型的 Servlet 生命周期方案。
    * 第一个到达服务器的 HTTP 请求被委派到 Servlet 容器。
    * Servlet 容器在调用 service() 方法之前加载 Servlet。
    * 然后 Servlet 容器处理由多个线程产生的多个请求，每个线程执行一个单一的 Servlet 实例的 service() 方法。
![](https://www.runoob.com/wp-content/uploads/2014/07/Servlet-LifeCycle.jpg)

**Servlet 编写过滤器**
* Servlet 过滤器可以动态地拦截请求和响应，以变换或使用包含在请求或响应中的信息。
可以将一个或多个 Servlet 过滤器附加到一个 Servlet 或一组 Servlet。Servlet 过滤器也可以附加到 JavaServer Pages (JSP) 文件和 HTML 页面。调用 Servlet 前调用所有附加的 Servlet 过滤器。
* Servlet 过滤器是可用于 Servlet 编程的 Java 类，可以实现以下目的：
* 在客户端的请求访问后端资源之前，拦截这些请求。
* 在服务器的响应发送回客户端之前，处理这些响应。
* 根据规范建议的各种类型的过滤器：
    * 身份验证过滤器（Authentication Filters）。
    * 数据压缩过滤器（Data compression Filters）。  
    * 加密过滤器（Encryption Filters）。
    * 触发资源访问事件过滤器。
    * 图像转换过滤器（Image Conversion Filters）。
    * 日志记录和审核过滤器（Logging and Auditing Filters）。
    * MIME-TYPE 链过滤器（MIME-TYPE Chain Filters）。
    * 标记化过滤器（Tokenizing Filters）。
    * XSL/T 过滤器（XSL/T Filters），转换 XML 内容。

* Servlet 过滤器方法
    * 过滤器是一个实现了 javax.servlet.Filter 接口的 Java 类。javax.servlet.Filter 接口定义了三个方法
        * public void doFilter (ServletRequest, ServletResponse, FilterChain)
            * 该方法完成实际的过滤操作，当客户端请求方法与过滤器设置匹配的URL时，Servlet容器将先调用过滤器的doFilter方法。FilterChain用户访问后续过滤器。
        * public void init(FilterConfig filterConfig)
            * web 应用程序启动时，web 服务器将创建Filter 的实例对象，并调用其init方法，读取web.xml配置，完成对象的初始化功能，从而为后续的用户请求作好拦截的准备工作（filter对象只会创建一次，init方法也只会执行一次）。开发人员通过init方法的参数，可获得代表当前filter配置信息的FilterConfig对象。
        * public void destroy()
            * Servlet容器在销毁过滤器实例前调用该方法，在该方法中释放Servlet过滤器占用的资源。

## 11.3. Session和Cookie的区别

### 11.3.1. 概念理解

首先呢，要了解session和cookie的区别先要了解以下几个概念：

1、无状态的HTTP协议：
协议，是指计算机通信网络中两台计算机之间进行通信所必须共同遵守的规定或规则，超文本传输协议(HTTP)是一种通信协议，它允许将超文本标记语言(HTML)文档从Web服务器
传送到客户端的浏览器。
HTTP协议是无状态的协议。一旦数据交换完毕，客户端与服务器端的连接就会关闭，再次交换数据需要建立新的连接。这就意味着服务器无法从连接上跟踪会话。

2、会话（Session）跟踪：
会话，指用户登录网站后的一系列动作，比如浏览商品添加到购物车并购买。会话（Session）跟踪是Web程序中常用的技术，用来跟踪用户的整个会话。常用的会话跟踪技术是Cookie与Session。Cookie通过在客户端记录信息确定用户身份，Session通过在服务器端记录信息确定用户身份。

### 11.3.2. cookie

由于HTTP是一种无状态的协议，服务器单从网络连接上无从知道客户身份。用户A购买了一件商品放入购物车内，当再次购买商品时服务器已经无法判断该购买行为是属于用户A的会话还是用户B的会话了。怎么办呢？就给客户端们颁发一个通行证吧，每人一个，无论谁访问都必须携带自己通行证。这样服务器就能从通行证上确认客户身份了。这就是Cookie 的工作原理。

Cookie实际上是一小段的文本信息。客户端请求服务器，如果服务器需要记录该用户状态，就使用response向客户端浏览器颁发一个Cookie。客户端会把Cookie保存起来。当浏览器再请求该网站时，浏览器把请求的网址连同该Cookie一同提交给服务器。服务器检查该Cookie，以此来辨认用户状态。服务器还可以根据需要修改Cookie的内容。

1、会话Cookie和持久Cookie
若不设置过期时间，则表示这个cookie的生命期为浏览器会话期间，关闭浏览器窗口，cookie就消失。这种生命期为浏览器会话期的cookie被称为会话cookie。会话cookie一般不存储在硬盘上而是保存在内存里，当然这种行为并不是规范规定的。
若设置了过期时间，浏览器就会把cookie保存到硬盘上，关闭后再次打开浏览器，这些cookie仍然有效直到超过设定的过期时间。存储在硬盘上的cookie可以在浏览器的不同进程间共享。这种称为持久Cookie。 

2、Cookie具有不可跨域名性
就是说，浏览器访问百度不会带上谷歌的cookie;

### 11.3.3. Session

Session是另一种记录客户状态的机制，不同的是Cookie保存在客户端浏览器中，而Session保存在服务器上。客户端浏览器访问服务器的时候，服务器把客户端信息以某种形式记录在服务器上。这就是Session。客户端浏览器再次访问时只需要从该Session中查找该客户的状态就可以了。
每个用户访问服务器都会建立一个session，那服务器是怎么标识用户的唯一身份呢？事实上，用户与服务器建立连接的同时，服务器会自动为其分配一个SessionId。

1、两个问题：
1）什么东西可以让你每次请求都把SessionId自动带到服务器呢？显然就是cookie了，如果你想为用户建立一次会话，可以在用户授权成功时给他一个唯一的cookie。当一个用户提交了表单时，浏览器会将用户的SessionId自动附加在HTTP头信息中，（这是浏览器的自动功能，用户不会察觉到），当服务器处理完这个表单后，将结果返回给SessionId所对应的用户。试想，如果没有 SessionId，当有两个用户同时进行注册时，服务器怎样才能知道到底是哪个用户提交了哪个表单呢。

2）储存需要的信息。服务器通过SessionId作为key，读写到对应的value，这就达到了保持会话信息的目的。

2、session的创建：
当程序需要为某个客户端的请求创建一个session时，服务器首先检查这个客户端的请求里是否已包含了sessionId，如果已包含则说明以前已经为此客户端创建过session，服务器就按照sessionId把这个session检索出来使用（检索不到，会新建一个），如果客户端请求不包含sessionId，则为此客户端创建一个session并且生成一个与此session相关联的sessionId，sessionId的值是一个既不会重复，又不容易被找到规律以仿造的字符串，这个sessionId将被在本次响应中返回给客户端保存。

3、禁用cookie：
如果客户端禁用了cookie，通常有两种方法实现session而不依赖cookie。
1）URL重写，就是把sessionId直接附加在URL路径的后面。
2）表单隐藏字段。就是服务器会自动修改表单，添加一个隐藏字段，以便在表单提交时能够把session id传递回服务器。比如： 

```html
<form name="testform" action="/xxx"> 
<input type="hidden" name="jsessionid" value="ByOK3vjFD75aPnrF7C2HmdnV6QZcEbzWoWiBYEnLerjQ99zWpBng!-145788764"> 
<input type="text"> 
</form> 
```

4、Session共享：
对于多网站(同一父域不同子域)单服务器，我们需要解决的就是来自不同网站之间SessionId的共享。由于域名不同(aaa.test.com和bbb.test.com)，而SessionId又分别储存在各自的cookie中，因此服务器会认为对于两个子站的访问,是来自不同的会话。解决的方法是通过修改cookies的域名为父域名达到cookie共享的目的,从而实现SessionId的共享。带来的弊端就是，子站间的cookie信息也同时被共享了。  

### 11.3.4. 总结

1、cookie数据存放在客户的浏览器上，session数据放在服务器上。
2、cookie不是很安全，别人可以分析存放在本地的cookie并进行cookie欺骗，考虑到安全应当使用session。
3、session会在一定时间内保存在服务器上。当访问增多，会比较占用你服务器的性能，考虑到减轻服务器性能方面，应当使用cookie。
4、单个cookie保存的数据不能超过4K，很多浏览器都限制一个站点最多保存20个cookie。
5、可以考虑将登陆信息等重要信息存放为session，其他信息如果需要保留，可以放在cookie中。

### 11.3.5. 应用场景
登录网站，今输入用户名密码登录了，第二天再打开很多情况下就直接打开了。这个时候用到的一个机制就是cookie。
session一个场景是购物车，添加了商品之后客户端处可以知道添加了哪些商品，而服务器端如何判别呢，所以也需要存储一些信息就用到了session



## 11.4. SpringBoot WEB相关配置
```properties
# EMBEDDED SERVER CONFIGURATION (ServerProperties)

#服务器绑定地址，默认为0.0.0.0
server.address= # Network address to which the server should bind to.
server.compression.enabled=false # If response compression is enabled.
server.compression.excluded-user-agents= # List of user-agents to exclude from compression.
server.compression.mime-types= # Comma-separated list of MIME types that should be compressed. For instance `text/html,text/css,application/json`
server.compression.min-response-size= # Minimum response size that is required for compression to be performed. For instance 2048
#服务器连接超时
server.connection-timeout= #3s, Time in milliseconds that connectors will wait for another HTTP request before closing the connection. When not set, the connector's container-specific default will be used. Use a value of -1 to indicate no (i.e. infinite) timeout.
server.display-name=application # Display name of the application.
#请求头的最大大小：
server.max-http-header-size=0 # Maximum size in bytes of the HTTP message header.
#确定显示有关错误的信息。例如，我们可以包含错误消息和堆栈跟踪：
server.error.include-exception=false # Include the "exception" attribute.
server.error.include-stacktrace=never # or always， When to include a "stacktrace" attribute.
#Whitelabel的默认路径是*/error*。可以通过设置server.error.path参数来自定义它：
server.error.path=/error # Path of the error controller.
#默认情况下，Spring Boot提供标准错误网页。此页面称为Whitelabel
server.error.whitelabel.enabled=true # Enable the default error page displayed in browsers in case of a server error.
server.jetty.acceptors= # Number of acceptor threads to use.
server.jetty.accesslog.append=false # Append to log.
server.jetty.accesslog.date-format=dd/MMM/yyyy:HH:mm:ss Z # Timestamp format of the request log.
server.jetty.accesslog.enabled=false # Enable access log.
server.jetty.accesslog.extended-format=false # Enable extended NCSA format.
server.jetty.accesslog.file-date-format= # Date format to place in log file name.
server.jetty.accesslog.filename= # Log filename. If not specified, logs will be redirected to "System.err".
server.jetty.accesslog.locale= # Locale of the request log.
server.jetty.accesslog.log-cookies=false # Enable logging of the request cookies.
server.jetty.accesslog.log-latency=false # Enable logging of request processing time.
server.jetty.accesslog.log-server=false # Enable logging of the request hostname.
server.jetty.accesslog.retention-period=31 # Number of days before rotated log files are deleted.
server.jetty.accesslog.time-zone=GMT # Timezone of the request log.
server.jetty.max-http-post-size=0 # Maximum size in bytes of the HTTP post or put content.
server.jetty.selectors= # Number of selector threads to use.

# 服务器端口，默认8080
server.port=8080 # Server HTTP port.
server.server-header= # Value to use for the Server response header (no header is sent if empty)
server.use-forward-headers= # If X-Forwarded-* headers should be applied to the HttpRequest.
server.servlet.context-parameters.*= # Servlet context init parameters
server.servlet.context-path= # Context path of the application.
server.servlet.jsp.class-name=org.apache.jasper.servlet.JspServlet # The class name of the JSP servlet.
server.servlet.jsp.init-parameters.*= # Init parameters used to configure the JSP servlet
server.servlet.jsp.registered=true # Whether or not the JSP servlet is registered
server.servlet.path=/ # Path of the main dispatcher servlet.
server.session.cookie.comment= # Comment for the session cookie.
server.session.cookie.domain= # Domain for the session cookie.
server.session.cookie.http-only= # "HttpOnly" flag for the session cookie.
server.session.cookie.max-age= # Maximum age of the session cookie in seconds.
server.session.cookie.name= # Session cookie name.
server.session.cookie.path= # Path of the session cookie.
server.session.cookie.secure= # "Secure" flag for the session cookie.
server.session.persistent=false # Persist session data between restarts.
server.session.servlet.filter-order=-2147483598 # Session repository filter order.
server.session.servlet.filter-dispatcher-types=ASYNC, ERROR, REQUEST # Session repository filter dispatcher types.
server.session.store-dir= # Directory used to store session data.
server.session.timeout= # Session timeout in seconds.
server.session.tracking-modes= # Session tracking modes (one or more of the following: "cookie", "url", "ssl").
server.ssl.ciphers= # Supported SSL ciphers.
server.ssl.client-auth= # Whether client authentication is wanted ("want") or needed ("need"). Requires a trust store.
server.ssl.enabled= # Enable SSL support.
server.ssl.enabled-protocols= # Enabled SSL protocols.
server.ssl.key-alias= # Alias that identifies the key in the key store.
server.ssl.key-password= # Password used to access the key in the key store.
server.ssl.key-store= # Path to the key store that holds the SSL certificate (typically a jks file).
server.ssl.key-store-password= # Password used to access the key store.
server.ssl.key-store-provider= # Provider for the key store.
server.ssl.key-store-type= # Type of the key store.
server.ssl.protocol=TLS # SSL protocol to use.
server.ssl.trust-store= # Trust store that holds SSL certificates.
server.ssl.trust-store-password= # Password used to access the trust store.
server.ssl.trust-store-provider= # Provider for the trust store.
server.ssl.trust-store-type= # Type of the trust store.
server.tomcat.accept-count= # Maximum queue length for incoming connection requests when all possible request processing threads are in use.
server.tomcat.accesslog.buffered=true # Buffer output such that it is only flushed periodically.
server.tomcat.accesslog.directory=logs # Directory in which log files are created. Can be relative to the tomcat base dir or absolute.
server.tomcat.accesslog.enabled=false # Enable access log.
server.tomcat.accesslog.file-date-format=.yyyy-MM-dd # Date format to place in log file name.
server.tomcat.accesslog.pattern=common # Format pattern for access logs.
server.tomcat.accesslog.prefix=access_log # Log file name prefix.
server.tomcat.accesslog.rename-on-rotate=false # Defer inclusion of the date stamp in the file name until rotate time.
server.tomcat.accesslog.request-attributes-enabled=false # Set request attributes for IP address, Hostname, protocol and port used for the request.
server.tomcat.accesslog.rotate=true # Enable access log rotation.
server.tomcat.accesslog.suffix=.log # Log file name suffix.
server.tomcat.additional-tld-skip-patterns= # Comma-separated list of additional patterns that match jars to ignore for TLD scanning.
server.tomcat.background-processor-delay=30 # Delay in seconds between the invocation of backgroundProcess methods.
server.tomcat.basedir= # Tomcat base directory. If not specified a temporary directory will be used.
server.tomcat.internal-proxies=10\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\
        192\\.168\\.\\d{1,3}\\.\\d{1,3}|\\
        169\\.254\\.\\d{1,3}\\.\\d{1,3}|\\
        127\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\
        172\\.1[6-9]{1}\\.\\d{1,3}\\.\\d{1,3}|\\
        172\\.2[0-9]{1}\\.\\d{1,3}\\.\\d{1,3}|\\
        172\\.3[0-1]{1}\\.\\d{1,3}\\.\\d{1,3} # regular expression matching trusted IP addresses.
server.tomcat.max-connections= # Maximum number of connections that the server will accept and process at any given time.
server.tomcat.max-http-header-size=0 # Maximum size in bytes of the HTTP message header.
#整个POST请求的最大大小：
server.tomcat.max-http-post-size=0 # 2MB, Maximum size in bytes of the HTTP post content.
Tomcat工作线程的最大数量：
server.tomcat.max-threads=0 # Maximum amount of worker threads.
server.tomcat.min-spare-threads=0 # Minimum amount of worker threads.
server.tomcat.port-header=X-Forwarded-Port # Name of the HTTP header used to override the original port value.
server.tomcat.protocol-header= # Header that holds the incoming protocol, usually named "X-Forwarded-Proto".
server.tomcat.protocol-header-https-value=https # Value of the protocol header that indicates that the incoming request uses SSL.
server.tomcat.redirect-context-root= # Whether requests to the context root should be redirected by appending a / to the path.
server.tomcat.remote-ip-header= # Name of the http header from which the remote ip is extracted. For instance `X-FORWARDED-FOR`
server.tomcat.uri-encoding=UTF-8 # Character encoding to use to decode the URI.
server.undertow.accesslog.dir= # Undertow access log directory.
server.undertow.accesslog.enabled=false # Enable access log.
server.undertow.accesslog.pattern=common # Format pattern for access logs.
server.undertow.accesslog.prefix=access_log. # Log file name prefix.
server.undertow.accesslog.rotate=true # Enable access log rotation.
server.undertow.accesslog.suffix=log # Log file name suffix.
server.undertow.buffer-size= # Size of each buffer in bytes.
server.undertow.direct-buffers= # Allocate buffers outside the Java heap.
server.undertow.io-threads= # Number of I/O threads to create for the worker.
server.undertow.eager-filter-init=true # Whether servlet filters should be initialized on startup.
server.undertow.max-http-post-size=0 # Maximum size in bytes of the HTTP post content.
server.undertow.worker-threads= # Number of worker threads.
```

**SpringBoot自定义Tomcat相关配置** 
```
@Component
public class MyEmbeddedServletContainerFactory  {



    @Bean
    public TomcatServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
            @Override
            protected void postProcessContext(Context context) {
                SecurityConstraint constraint = new SecurityConstraint();
                constraint.setUserConstraint("CONFIDENTIAL");
                SecurityCollection collection = new SecurityCollection();
                collection.addPattern("/*");
                constraint.addCollection(collection);
                context.addConstraint(constraint);
            }
        };
        tomcat.addAdditionalTomcatConnectors(httpConnector());
        return tomcat;
    }
    @Bean
    public Connector httpConnector() {
       ;
        Connector connector = new Connector( Http11NioProtocol.class.getName());
        connector.setScheme("http");
        //Connector监听的http的端口号
       // connector.setPort(httpPort);
        connector.setSecure(false);
        //监听到http的端口号后转向到的https的端口号
      //  connector.setRedirectPort(httpsPort);
        return connector;
    }
}

```






## 11.5. Tomcat
<a href="#menu" style="float:right">目录</a>

### 11.5.1. 概述
<a href="#menu" style="float:right">目录</a>


#### 11.5.1.1. Tomcat快速理解
<a href="#menu" style="float:right">目录</a>

### 11.5.2. Web服务机制
<a href="#menu" style="float:right">目录</a>

#### 11.5.2.1. 通信协议
<a href="#menu" style="float:right">目录</a>

* HTTP协议
    * Hyper Text Transfer Protocol 超文本传输协议
    * 用于从WEB服务器传输超文本到本地浏览器的过程
    * 能够使网络传输减少，保证计算机正确快速地传输超文本文档
    * 无状态协议，两次传输之间没有关系
    * 由请求和响应组成
* HTTPS协议
    * http的安全版本
    * 只是在HTTP中增加一个SSL或TLS协议层
    * 提供了加解密的机制,比HTTP明文传输更加安全

* 常用加解密算法分类
    * 对称加密
        * 密钥只有一个，加密，解密都是这个密码。DES，AES，RC4
    * 非对称加密
        * 密钥成对出现，使用公钥加密，私钥解密
        * RSA,DSA,DSS
    * Hash算法
        * 不可逆算法，用于验证数据的完整性
* HTTPS执行流程
    * 客户端浏览器向服务器发送SSL/TLS协议的版本号，加密算法的种类，产生的随机数，以其他需要的各种信息。
    * 服务器从客户端支持的加密算法中选择一组加密算法与Hash算法，并且把自己的证书(包含网址地址，加密公钥，证书颁发机构)也发送给客户端
    * 浏览器获取服务器的证书后验证其合法性，验证证书中的网址是否与正在访问的地址一致，通过验证的浏览器会显示一个小锁头，否则证书不受信。
    * 客户端浏览器生成一串随机数并用服务器传来的公钥加密，再使用约定好的Hash算法计算握手消息，发送到服务器
    * 服务器接到握手消息后用自己的私钥解密，并用Hash验证，这样双方都有了此次通信的密钥
    * 服务端再使用密钥加密一段握手消息，返回给客户端浏览器
    * 浏览器用密钥揭秘，并用Hash算法验证，确定算法与密钥
    * 双方利用此次协商好的密钥进行通信
    

### 11.5.3. Tomcat 总体架构
<a href="#menu" style="float:right">目录</a>

Tomcat总计架构
![](https://github.com/lgjlife/Java-Study/blob/master/pic/tomcat/tomcat.png?raw=true)
默认配置文件
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!--
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
-->
<!-- Note:  A "Server" is not itself a "Container", so you may not
     define subcomponents such as "Valves" at this level.
     Documentation at /docs/config/server.html
 -->
<Server port="8005" shutdown="SHUTDOWN">
  <Listener className="org.apache.catalina.startup.VersionLoggerListener" />
  <!-- Security listener. Documentation at /docs/config/listeners.html
  <Listener className="org.apache.catalina.security.SecurityListener" />
  -->
  <!--APR library loader. Documentation at /docs/apr.html -->
  <Listener className="org.apache.catalina.core.AprLifecycleListener" SSLEngine="on" />
  <!-- Prevent memory leaks due to use of particular java/javax APIs-->
  <Listener className="org.apache.catalina.core.JreMemoryLeakPreventionListener" />
  <Listener className="org.apache.catalina.mbeans.GlobalResourcesLifecycleListener" />
  <Listener className="org.apache.catalina.core.ThreadLocalLeakPreventionListener" />

  <!-- Global JNDI resources
       Documentation at /docs/jndi-resources-howto.html
  -->
  <GlobalNamingResources>
    <!-- Editable user database that can also be used by
         UserDatabaseRealm to authenticate users
    -->
    <Resource name="UserDatabase" auth="Container"
              type="org.apache.catalina.UserDatabase"
              description="User database that can be updated and saved"
              factory="org.apache.catalina.users.MemoryUserDatabaseFactory"
              pathname="conf/tomcat-users.xml" />
  </GlobalNamingResources>

  <!-- A "Service" is a collection of one or more "Connectors" that share
       a single "Container" Note:  A "Service" is not itself a "Container",
       so you may not define subcomponents such as "Valves" at this level.
       Documentation at /docs/config/service.html
   -->
  <Service name="Catalina">

    <!--The connectors can use a shared executor, you can define one or more named thread pools-->
    <!--
    <Executor name="tomcatThreadPool" namePrefix="catalina-exec-"
        maxThreads="150" minSpareThreads="4"/>
    -->


    <!-- A "Connector" represents an endpoint by which requests are received
         and responses are returned. Documentation at :
         Java HTTP Connector: /docs/config/http.html
         Java AJP  Connector: /docs/config/ajp.html
         APR (HTTP/AJP) Connector: /docs/apr.html
         Define a non-SSL/TLS HTTP/1.1 Connector on port 8080
    -->
    <Connector port="8180" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" />
    <!-- A "Connector" using the shared thread pool-->
    <!--
    <Connector executor="tomcatThreadPool"
               port="8080" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" />
    -->
    <!-- Define a SSL/TLS HTTP/1.1 Connector on port 8443
         This connector uses the NIO implementation. The default
         SSLImplementation will depend on the presence of the APR/native
         library and the useOpenSSL attribute of the
         AprLifecycleListener.
         Either JSSE or OpenSSL style configuration may be used regardless of
         the SSLImplementation selected. JSSE style configuration is used below.
    -->
    <!--
    <Connector port="8443" protocol="org.apache.coyote.http11.Http11NioProtocol"
               maxThreads="150" SSLEnabled="true">
        <SSLHostConfig>
            <Certificate certificateKeystoreFile="conf/localhost-rsa.jks"
                         type="RSA" />
        </SSLHostConfig>
    </Connector>
    -->
    <!-- Define a SSL/TLS HTTP/1.1 Connector on port 8443 with HTTP/2
         This connector uses the APR/native implementation which always uses
         OpenSSL for TLS.
         Either JSSE or OpenSSL style configuration may be used. OpenSSL style
         configuration is used below.
    -->
    <!--
    <Connector port="8443" protocol="org.apache.coyote.http11.Http11AprProtocol"
               maxThreads="150" SSLEnabled="true" >
        <UpgradeProtocol className="org.apache.coyote.http2.Http2Protocol" />
        <SSLHostConfig>
            <Certificate certificateKeyFile="conf/localhost-rsa-key.pem"
                         certificateFile="conf/localhost-rsa-cert.pem"
                         certificateChainFile="conf/localhost-rsa-chain.pem"
                         type="RSA" />
        </SSLHostConfig>
    </Connector>
    -->

    <!-- Define an AJP 1.3 Connector on port 8009 -->
    <Connector port="8009" protocol="AJP/1.3" redirectPort="8443" />


    <!-- An Engine represents the entry point (within Catalina) that processes
         every request.  The Engine implementation for Tomcat stand alone
         analyzes the HTTP headers included with the request, and passes them
         on to the appropriate Host (virtual host).
         Documentation at /docs/config/engine.html -->

    <!-- You should set jvmRoute to support load-balancing via AJP ie :
    <Engine name="Catalina" defaultHost="localhost" jvmRoute="jvm1">
    -->
    <Engine name="Catalina" defaultHost="localhost">

      <!--For clustering, please take a look at documentation at:
          /docs/cluster-howto.html  (simple how to)
          /docs/config/cluster.html (reference documentation) -->
      <!--
      <Cluster className="org.apache.catalina.ha.tcp.SimpleTcpCluster"/>
      -->

      <!-- Use the LockOutRealm to prevent attempts to guess user passwords
           via a brute-force attack -->
      <Realm className="org.apache.catalina.realm.LockOutRealm">
        <!-- This Realm uses the UserDatabase configured in the global JNDI
             resources under the key "UserDatabase".  Any edits
             that are performed against this UserDatabase are immediately
             available for use by the Realm.  -->
        <Realm className="org.apache.catalina.realm.UserDatabaseRealm"
               resourceName="UserDatabase"/>
      </Realm>

      <Host name="localhost"  appBase="webapps"
            unpackWARs="true" autoDeploy="true">

        <!-- SingleSignOn valve, share authentication between web applications
             Documentation at: /docs/config/valve.html -->
        <!--
        <Valve className="org.apache.catalina.authenticator.SingleSignOn" />
        -->

        <!-- Access log processes all example.
             Documentation at: /docs/config/valve.html
             Note: The pattern used is equivalent to using pattern="common" -->
        <Valve className="org.apache.catalina.valves.AccessLogValve" directory="logs"
               prefix="localhost_access_log" suffix=".txt"
               pattern="%h %l %u %t &quot;%r&quot; %s %b" />

      </Host>
    </Engine>
  </Service>
</Server>
```

配置文件
```xml
<Server>
    <Listener/>
    <GlobalNamingResources>
        <Resources/>
    </GlobalNamingResources>

    <Service>
        <Executor/>            
        <Connector/>
        <Engine>
            <Cluster/>
            <Realm/>
            <Host>
                <Context/>
            </Host>
        </Engine>
    </Service>
</Server>
```
**组件说明**

* Server
    * 最顶级组件，代表Tomcat的运行实例,一个JVM中只包含一个Server
    * 为了方便扩展，引入了监听器
    * 为了方便在Tomcat中集成JNDI，引入了GlobalNamingResources组件
* Service
    * 服务的抽象，代表请求从接收到处理的所有组件的集合
    * 一个Server可以有多个Service
    * 一个Service包含多个用于接收请求的Conneector和处理请求的Engine.
    * 不同的Connector可以提供不同的通信协议
    * Executor提供线程池
* Connector
    * 接收客户端连接和接收报文，经过处理后送往容器处理
    * 可以配置不同的协议，Http,AJP等
    * 可以配置多个Connector
* Engine
    * 处理所有Connector的请求
    * 包含以下组件
        * Host:虚拟主机
        * Listener:在Tomcat生命周期中完成某些Engine容器相关工作的监听器
        * AccessLog: 客户端访问日志，所有客户端访问都会被记录
        * Cluster：提供集群功能，可以将Engine容器需要共享的数据同步到集群中的其他Tomcat
        * Pipeline： Engine对请求进行处理的管道
        * Realm：提供Engine容器级别的用户，密码，权限数据对象，配合资源认证模块使用。        
* Host
    * 虚拟主机
    * 包含以下组件
        * Listener:在Tomcat生命周期中完成某些Host容器相关工作的监听器
        * AccessLog: 客户端访问日志，所有客户端访问都会被记录
        * Cluster：提供集群功能，可以将Host容器需要共享的数据同步到集群中的其他Tomcat
        * Pipeline： Host对请求进行处理的管道
        * Realm：提供Host容器级别的用户，密码，权限数据对象，配合资源认证模块使用。 
        * Context   
* Context
    * WEB应用的抽象，我们开发的WEB应用部署到Tomcat后运行时就会转化为Context对象。
    * 包含了各种静态资源，若干Servlet和其他动态资源
    * 包含以下组件
        * Listener:在Tomcat生命周期中完成某些Context容器相关工作的监听器
        * AccessLog: 客户端访问日志，所有客户端访问都会被记录
        * Pipeline： Context对请求进行处理的管道
        * Realm：提供Context容器级别的用户，密码，权限数据对象，配合资源认证模块使用。
        * Loader: WEB应用加载器，用于加载WEB应用的资源，保证不同WEB应用资源的隔离
        * Manager: 会话管理器，用于管理对应WEB容器的会话，包括维护会话多的生成，更新，和销毁
        * NamingResources: 命名资源。负责将Tomcat配置文件的server.xml和WEB应用的context.xml资源和属性映射到内存中。
        * Mapper:Servelet映射器，负责该Context容器的路由导航
        * Wrapper:Context子容器
* Wrapper
    * Servelet 组件
    * ServletPool ： Servlet对象池
    * Pipeline： Wrapper对请求进行处理的管道
**Tomcat请求处理过程**
![](https://github.com/lgjlife/Java-Study/blob/master/pic/tomcat/tomcat-request.png?raw=true)



### 11.5.4. Server和Service组件
<a href="#menu" style="float:right">目录</a>


### 11.5.5. Connect组件
<a href="#menu" style="float:right">目录</a>

* http11Protocol
    * HTTP阻塞模式协议
* http11NioProtocol
    * HTTP非阻塞模式协议
* http11ArpProtocol
    * HTTPARP模式协议
* http11AjpProtocol
    * HTTP阻塞模式协议

### 11.5.6. Engine组件
<a href="#menu" style="float:right">目录</a>

### 11.5.7. Host容器
<a href="#menu" style="float:right">目录</a>

### 11.5.8. Context容器
<a href="#menu" style="float:right">目录</a>


### 11.5.9. Wrapper容器
<a href="#menu" style="float:right">目录</a>


### 11.5.10. 生命周期管理
<a href="#menu" style="float:right">目录</a>


### 11.5.11. 日志框架和国家化
<a href="#menu" style="float:right">目录</a>

### 11.5.12. 公共与隔离类加载器
<a href="#menu" style="float:right">目录</a>


### 11.5.13. 请求URI映射器Mapper
<a href="#menu" style="float:right">目录</a>

### 11.5.14. Tomcat的JNDI
<a href="#menu" style="float:right">目录</a>


### 11.5.15. 运行、通信、及访问安全管理
<a href="#menu" style="float:right">目录</a>


### 11.5.16. 处理请求和响应的管道
<a href="#menu" style="float:right">目录</a>


### 11.5.17. 多样化的会话管理器
<a href="#menu" style="float:right">目录</a>


### 11.5.18. 高可用集群实现
<a href="#menu" style="float:right">目录</a>


### 11.5.19. 集群通信框架
<a href="#menu" style="float:right">目录</a>


### 11.5.20. 监控和管理
<a href="#menu" style="float:right">目录</a>



## 11.6. Jetty
<a href="#menu" style="float:right">目录</a>

## 11.7. 编码问题
<a href="#menu" style="float:right">目录</a>

* 需要编码的原因
    * 计算机中存储信息的最小单位是一个字节，所能表示的字符范围是0～255
    * 人类表示的符号太多，无法使用一个字节完全表示，比如汉字就有几千个。

* 当将一种编码格式的数据转化成另一种编码格式的数据就要进行翻译

### 11.7.1. 常见的编码格式
<a href="#menu" style="float:right">目录</a>

**ASCII码**
* 总共128个，用一个字节的低7位表示。
* 0-31是控制字符，比如换行回车等，都是不可打印的。
* 32~126是可打印字符，可以通过键盘输入并显示出来


**ISO-8859-1**
* 涵盖了大多数西欧的语言字符
* 单字节编码，总共能表示256字符

**GB2312**
* 双字节编，全称信息技术 中文编码字符集
* 编码范围：A1-F7，A1-A9是符号区，总共包含682个字符;B0-F7是汉字区，包含6763个汉字。

**GBK**
* 全称：汉字内码扩展规范,用于扩展GB2312,加入了更多的汉字，编码和GB2312兼容，只有多出来的汉字GB2312不能表示

**GB18030**
* 全称:信息技术 中文编码字符集
* 可能是单字节，双字节，或者四字节编码

**UTF-16**
* 两个字节表示
* 问题:有的字符只需要一个字节就可以表示，使用两个字节就会占用更多的空间。


**UTF-8**
* 采用变长技术，每个编码区域有不同的字码长度，不同类型的字符可以由1-6个字节组成
* 编码规则
    * 如果是一个字节，以0开头，则表示这是一个ASCII字符00-7F
    * 如果是一个字节，以11开头，则连续1的个数暗示这个字符的字节数
    * 如果一个字节以10开始，表示不是首字节，需要向前查找才能找到首字节。

```
0111 1111 :以0开头，单字节，有效数据是 111 1111；
1101 1111 1011 1010 ：首字节以11开头，说明有两个字节，第2个字节必须以10开头，有效数据是01 1111 11 1010.
1111 1111 1011 1010 1011 1010 ：首字节以111开头，说明有三个字节，第2个字节必须以10开头，有效数据是01 1111 11 1010 11 1010.

```


