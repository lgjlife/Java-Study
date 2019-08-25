<span id="menu">


<!-- TOC -->

- [1. 多线程](#1-多线程)
    - [1.1. 基本概念](#11-基本概念)
    - [1.2. Java多线程](#12-java多线程)
        - [1.2.1. 实现方式](#121-实现方式)
        - [1.2.2. 基本属性](#122-基本属性)
        - [1.2.3. 常用方法](#123-常用方法)
        - [1.2.4. 生命周期 & 线程状态](#124-生命周期--线程状态)
        - [1.2.5. 线程监控工具](#125-线程监控工具)
        - [1.2.6. 有关并行的两个重要定律](#126-有关并行的两个重要定律)
            - [1.2.6.1. Amdahl(阿姆达尔)定律](#1261-amdahl阿姆达尔定律)
            - [1.2.6.2. Gustafson定律](#1262-gustafson定律)
    - [1.3. Synchronized](#13-synchronized)
        - [1.3.1. 基本概念](#131-基本概念)
        - [1.3.2. 基本使用](#132-基本使用)
        - [1.3.3. 实现原理](#133-实现原理)
    - [1.4. 线程间通信](#14-线程间通信)
        - [1.4.1. 基本概念](#141-基本概念)
        - [1.4.2. 实现消费者和生产者](#142-实现消费者和生产者)
    - [1.5. 线程阻塞工具LockSuport](#15-线程阻塞工具locksuport)
    - [1.6. 线程同步机制](#16-线程同步机制)
        - [1.6.1. 线程同步机制概述](#161-线程同步机制概述)
        - [1.6.2. 锁概述](#162-锁概述)
        - [1.6.3. 内部锁Synchronized](#163-内部锁synchronized)
            - [1.6.3.1. 基本概念](#1631-基本概念)
            - [1.6.3.2. 实现原理](#1632-实现原理)
        - [1.6.4. 显示锁Lock](#164-显示锁lock)
            - [1.6.4.1. 基本使用](#1641-基本使用)
            - [1.6.4.2. 实现原理](#1642-实现原理)
        - [1.6.5. 内存屏障](#165-内存屏障)
            - [1.6.5.1. 基本概念](#1651-基本概念)
            - [1.6.5.2. 标准](#1652-标准)
            - [1.6.5.3. x86架构的内存屏障](#1653-x86架构的内存屏障)
            - [1.6.5.4. volatile如何解决内存可见性与处理器重排序问题](#1654-volatile如何解决内存可见性与处理器重排序问题)
            - [1.6.5.5. JVM对内存屏障作出的其他封装](#1655-jvm对内存屏障作出的其他封装)
        - [1.6.6. 锁与重排序](#166-锁与重排序)
        - [1.6.7. 提高锁性能方案](#167-提高锁性能方案)
        - [1.6.8. Java虚拟机的锁优化](#168-java虚拟机的锁优化)
    - [1.7. 并发编程的挑战](#17-并发编程的挑战)
        - [1.7.1. 上下文切换](#171-上下文切换)
        - [1.7.2. 死锁](#172-死锁)
        - [1.7.3. 饥饿](#173-饥饿)
        - [1.7.4. 活锁](#174-活锁)
        - [1.7.5. 内存同步](#175-内存同步)
        - [1.7.6. 阻塞](#176-阻塞)
        - [1.7.7. 资源的争用与调度](#177-资源的争用与调度)
    - [1.8. Java内存模型](#18-java内存模型)
        - [1.8.1. Java内存模型基础](#181-java内存模型基础)
            - [1.8.1.1. Java内存模型带来的问题](#1811-java内存模型带来的问题)
        - [1.8.2. 重排序](#182-重排序)
            - [1.8.2.1. 基本概念](#1821-基本概念)
            - [1.8.2.2. 指令重排序](#1822-指令重排序)
            - [1.8.2.3. 存储子系统重构排序](#1823-存储子系统重构排序)
        - [1.8.3. volatile的内存语义](#183-volatile的内存语义)
            - [1.8.3.1. volatile的定义与实现原理](#1831-volatile的定义与实现原理)
        - [1.8.4. 锁的内存语义](#184-锁的内存语义)
        - [1.8.5. final的内存语义](#185-final的内存语义)
        - [1.8.6. happens-before](#186-happens-before)
        - [1.8.7. 双重检查锁定与延迟初始化](#187-双重检查锁定与延迟初始化)
        - [1.8.8. Java内存模型综述](#188-java内存模型综述)
    - [1.9. ThreadLocal](#19-threadlocal)
        - [1.9.1. 基本概念和使用](#191-基本概念和使用)
        - [1.9.2. 原理说明](#192-原理说明)
    - [1.10. 并发容器和框架](#110-并发容器和框架)
        - [1.10.1. 常见的并发容器](#1101-常见的并发容器)
        - [1.10.2. Fork/Join框架](#1102-forkjoin框架)
            - [1.10.2.1. 基本概念](#11021-基本概念)
            - [1.10.2.2. 工作窃取算法](#11022-工作窃取算法)
            - [1.10.2.3. Fork/Join框架的设计](#11023-forkjoin框架的设计)
            - [1.10.2.4. 例子](#11024-例子)
            - [1.10.2.5. Fork/Join框架的异常处理](#11025-forkjoin框架的异常处理)
            - [1.10.2.6. 实现原理](#11026-实现原理)
    - [1.11. 原子操作类](#111-原子操作类)
        - [1.11.1. CAS算法](#1111-cas算法)
        - [1.11.2. Unsafe类](#1112-unsafe类)
            - [1.11.2.1. 基本概念](#11121-基本概念)
            - [1.11.2.2. 获取实例](#11122-获取实例)
            - [1.11.2.3. 常用方法](#11123-常用方法)
            - [1.11.2.4. Unsafe 类的使用场景](#11124-unsafe-类的使用场景)
        - [1.11.3. 原子更新基本类型](#1113-原子更新基本类型)
        - [1.11.4. 原子更新数组](#1114-原子更新数组)
        - [1.11.5. 原子更新引用类型](#1115-原子更新引用类型)
        - [1.11.6. 原子更新字段类](#1116-原子更新字段类)
    - [1.12. Future模式](#112-future模式)
        - [1.12.1. Future](#1121-future)
        - [1.12.2. FutureTask](#1122-futuretask)
        - [1.12.3. CompletableFuture](#1123-completablefuture)
            - [1.12.3.1. 创建 CompletableFuture](#11231-创建-completablefuture)
            - [1.12.3.2. 在 CompletableFuture 转换和运行](#11232-在-completablefuture-转换和运行)
            - [1.12.3.3. 组合两个CompletableFuture](#11233-组合两个completablefuture)
            - [1.12.3.4. 组合多个CompletableFuture](#11234-组合多个completablefuture)
            - [1.12.3.5. CompletableFuture 异常处理](#11235-completablefuture-异常处理)
    - [1.13. 并发工具类](#113-并发工具类)
        - [1.13.1. 等待多线程完成的CountDownLatch](#1131-等待多线程完成的countdownlatch)
            - [1.13.1.1. 基本概念](#11311-基本概念)
            - [1.13.1.2. 实现原理](#11312-实现原理)
        - [1.13.2. 同步屏障CyclicBarrier](#1132-同步屏障cyclicbarrier)
            - [1.13.2.1. 实现原理](#11321-实现原理)
        - [1.13.3. 控制并发线程数的Semaphore](#1133-控制并发线程数的semaphore)
            - [1.13.3.1. 基本概念](#11331-基本概念)
            - [1.13.3.2. 实现原理](#11332-实现原理)
        - [1.13.4. 线程间交换数据的Exchanger](#1134-线程间交换数据的exchanger)
        - [1.13.5. FutureTask](#1135-futuretask)
            - [1.13.5.1. Callable与Runnable](#11351-callable与runnable)
            - [1.13.5.2. Future](#11352-future)
            - [1.13.5.3. FutureTask](#11353-futuretask)
            - [1.13.5.4. 使用示例](#11354-使用示例)
    - [1.14. 线程池](#114-线程池)
        - [1.14.1. 线程池的实现原理](#1141-线程池的实现原理)
        - [1.14.2. 线程池的使用](#1142-线程池的使用)
        - [1.14.3. 提交任务](#1143-提交任务)
        - [1.14.4. 关闭线程池](#1144-关闭线程池)
        - [1.14.5. 合理地配置线程池](#1145-合理地配置线程池)
        - [1.14.6. 线程池的监控](#1146-线程池的监控)
    - [1.15. Executor框架](#115-executor框架)
        - [1.15.1. Executor体系](#1151-executor体系)
        - [1.15.2. Executors](#1152-executors)
    - [1.16. 并发编程实战](#116-并发编程实战)
    - [1.17. 队列](#117-队列)
        - [1.17.1. JDK队列概述](#1171-jdk队列概述)
        - [1.17.2. DelayedWorkQueue](#1172-delayedworkqueue)
- [2. Spring 体系](#2-spring-体系)
    - [2.1. Spring](#21-spring)
        - [2.1.1. IOC容器](#211-ioc容器)
            - [2.1.1.1. 控制反转和依赖注入](#2111-控制反转和依赖注入)
            - [2.1.1.2. 注入方式](#2112-注入方式)
                - [2.1.1.2.1. setter注入与构造方法注入](#21121-setter注入与构造方法注入)
                - [2.1.1.2.2. 自动注入方式](#21122-自动注入方式)
        - [2.1.2. IOC容器](#212-ioc容器)
        - [2.1.3. AOP面向切面编程](#213-aop面向切面编程)
        - [2.1.4. Spring 事务管理](#214-spring-事务管理)
            - [2.1.4.1. 数据库事务基础知识](#2141-数据库事务基础知识)
            - [2.1.4.2. Spring 对事务管理的支持](#2142-spring-对事务管理的支持)
                - [2.1.4.2.1. Spring事务传播行为和隔离级别](#21421-spring事务传播行为和隔离级别)
                - [2.1.4.2.2. 事务管理关键抽象](#21422-事务管理关键抽象)
                - [2.1.4.2.3. 事务管理器实现类](#21423-事务管理器实现类)
            - [2.1.4.3. 编程式事务管理](#2143-编程式事务管理)
            - [2.1.4.4. 使用XML配置声明式事务](#2144-使用xml配置声明式事务)
            - [2.1.4.5. 使用注解配置事务](#2145-使用注解配置事务)
            - [2.1.4.6. 事务实现原理](#2146-事务实现原理)
        - [2.1.5. Spring Cache](#215-spring-cache)
            - [2.1.5.1. 几个重要概念&缓存注解](#2151-几个重要概念缓存注解)
            - [2.1.5.2. SpEL上下文数据](#2152-spel上下文数据)
            - [2.1.5.3. 基本使用](#2153-基本使用)
        - [2.1.6. 常用注解](#216-常用注解)
        - [2.1.7. 常用工具类](#217-常用工具类)
    - [2.2. Sppring MVC](#22-sppring-mvc)
        - [2.2.1. MVC体系概述](#221-mvc体系概述)
            - [2.2.1.1. MVC 架构](#2211-mvc-架构)
        - [2.2.2. Restful](#222-restful)
            - [2.2.2.1. URL 设计](#2221-url-设计)
            - [2.2.2.2. 状态码](#2222-状态码)
            - [2.2.2.3. 服务器回应](#2223-服务器回应)
        - [2.2.3. 注解说明](#223-注解说明)
        - [2.2.4. 拦截器](#224-拦截器)
        - [2.2.5. 过滤器](#225-过滤器)
            - [2.2.5.1. 过滤器和拦截器的区别：](#2251-过滤器和拦截器的区别)
            - [2.2.5.2. 拦截器（Interceptor）和过滤器（Filter）的一些用途](#2252-拦截器interceptor和过滤器filter的一些用途)
    - [2.3. SpringBoot](#23-springboot)
        - [2.3.1. 基本概念](#231-基本概念)
        - [2.3.2. Spring Boot 环境下创建Bean](#232-spring-boot-环境下创建bean)
    - [2.4. SpringCloud](#24-springcloud)
        - [2.4.1. 基础知识](#241-基础知识)
        - [2.4.2. 服务治理Eureka](#242-服务治理eureka)
            - [2.4.2.1. 基本使用](#2421-基本使用)
            - [2.4.2.2. 高可用注册中心](#2422-高可用注册中心)
            - [2.4.2.3. 原理说明](#2423-原理说明)
                - [2.4.2.3.1. 基础模块说明](#24231-基础模块说明)
                - [2.4.2.3.2. Region,Zone](#24232-regionzone)
                - [2.4.2.3.3. 源码分析](#24233-源码分析)
            - [2.4.2.4. 更多配置说明](#2424-更多配置说明)
        - [2.4.3. 负载均衡Ribbon](#243-负载均衡ribbon)
            - [2.4.3.1. 基本使用](#2431-基本使用)
            - [2.4.3.2. 原理说明](#2432-原理说明)
                - [2.4.3.2.1. 源码分析](#24321-源码分析)
                - [2.4.3.2.2. 负载均衡器](#24322-负载均衡器)
                - [2.4.3.2.3. 负载均衡策略](#24323-负载均衡策略)
                - [2.4.3.2.4. 配置详解](#24324-配置详解)
        - [2.4.4. 声明式服务调用feign](#244-声明式服务调用feign)
            - [2.4.4.1. 使用案例](#2441-使用案例)
        - [2.4.5. 服务容错保护 Hystrix](#245-服务容错保护-hystrix)
        - [2.4.6. API网关服务](#246-api网关服务)
            - [2.4.6.1. zuul](#2461-zuul)
            - [2.4.6.2. GateWay](#2462-gateway)
        - [2.4.7. 分布式配置中心Config](#247-分布式配置中心config)
            - [2.4.7.1. 基本使用](#2471-基本使用)
                - [2.4.7.1.1. 配置中心](#24711-配置中心)
                - [2.4.7.1.2. bootstrap.yml与application.yml区别](#24712-bootstrapyml与applicationyml区别)
                - [2.4.7.1.3. 客户端配置](#24713-客户端配置)
                - [2.4.7.1.4. 刷新配置](#24714-刷新配置)
            - [2.4.7.2. 原理说明](#2472-原理说明)
            - [2.4.7.3. 更多使用方式](#2473-更多使用方式)
        - [2.4.8. 消息总线bus](#248-消息总线bus)
            - [2.4.8.1. 消息代理](#2481-消息代理)
        - [2.4.9. 消息驱动的微服务Stream](#249-消息驱动的微服务stream)
        - [2.4.10. 分布式服务跟踪Sleuth](#2410-分布式服务跟踪sleuth)
            - [2.4.10.1. 基本使用](#24101-基本使用)
            - [2.4.10.2. 跟踪原理](#24102-跟踪原理)
                - [2.4.10.2.1. 基本实现原理](#241021-基本实现原理)
                - [2.4.10.2.2. 支持的组件](#241022-支持的组件)
                - [2.4.10.2.3. 一些基本概念](#241023-一些基本概念)
                - [2.4.10.2.4. zipkin](#241024-zipkin)
                - [2.4.10.2.5. 调用过程](#241025-调用过程)
    - [2.5. 测试](#25-测试)
        - [2.5.1. 基本测试](#251-基本测试)
        - [2.5.2. 控制层测试](#252-控制层测试)
        - [2.5.3. 服务层测试](#253-服务层测试)
        - [2.5.4. DAO层测试](#254-dao层测试)
- [3. MySQL](#3-mysql)
    - [3.1. 基本概念](#31-基本概念)
        - [3.1.1. 基本概念](#311-基本概念)
        - [3.1.2. 常用工具](#312-常用工具)
        - [3.1.3. 逻辑架构图](#313-逻辑架构图)
        - [3.1.4. 常用配置](#314-常用配置)
    - [3.2. 日志文件](#32-日志文件)
        - [3.2.1. 参数文件](#321-参数文件)
        - [3.2.2. 日志文件](#322-日志文件)
        - [3.2.3. socket文件](#323-socket文件)
        - [3.2.4. pid文件](#324-pid文件)
        - [3.2.5. MySQL表结构文件](#325-mysql表结构文件)
        - [3.2.6. 存储引擎文件](#326-存储引擎文件)
    - [3.3. NoSQL与关系型数据库设计理念比较](#33-nosql与关系型数据库设计理念比较)
        - [3.3.1. 关系型数据库](#331-关系型数据库)
        - [3.3.2. 非关系型数据库](#332-非关系型数据库)
    - [3.4. 使用数据库](#34-使用数据库)
    - [3.5. 数据类型](#35-数据类型)
    - [3.6. 数据更新](#36-数据更新)
    - [3.7. 查询入门](#37-查询入门)
    - [3.8. 多表连接查询](#38-多表连接查询)
    - [3.9. 函数](#39-函数)
        - [3.9.1. 聚集函数](#391-聚集函数)
        - [3.9.2. 数学函数](#392-数学函数)
        - [3.9.3. 字符串函数](#393-字符串函数)
        - [3.9.4. 日期和时间函数](#394-日期和时间函数)
        - [3.9.5. 条件判断函数](#395-条件判断函数)
        - [3.9.6. 系统信息函数](#396-系统信息函数)
        - [3.9.7. 加密函数](#397-加密函数)
        - [3.9.8. 其他函数](#398-其他函数)
    - [3.10. 存储过程](#310-存储过程)
        - [3.10.1. 基本概念](#3101-基本概念)
        - [3.10.2. 使用存储过程](#3102-使用存储过程)
    - [3.11. 视图](#311-视图)
        - [3.11.1. 基本概念](#3111-基本概念)
    - [3.12. 触发器](#312-触发器)
        - [3.12.1. 基本概念](#3121-基本概念)
        - [3.12.2. 触发器操作](#3122-触发器操作)
    - [3.13. 事务](#313-事务)
        - [3.13.1. 基本概念](#3131-基本概念)
            - [3.13.1.1. 事务特点](#31311-事务特点)
            - [3.13.1.2. 锁](#31312-锁)
            - [3.13.1.3. 多版本并发控制](#31313-多版本并发控制)
            - [3.13.1.4. 常见术语](#31314-常见术语)
        - [3.13.2. 基本语句](#3132-基本语句)
    - [3.14. 数据库索引](#314-数据库索引)
        - [3.14.1. 基本概念](#3141-基本概念)
            - [3.14.1.1. 分类](#31411-分类)
            - [3.14.1.2. 索引用途](#31412-索引用途)
            - [3.14.1.3. 索引的误区](#31413-索引的误区)
            - [3.14.1.4. 索引数据结构](#31414-索引数据结构)
    - [3.15. 存储引擎](#315-存储引擎)
        - [3.15.1. InnoDB存储引擎](#3151-innodb存储引擎)
        - [3.15.2. MyISAM存储引擎](#3152-myisam存储引擎)
        - [3.15.3. MEMORY存储引擎](#3153-memory存储引擎)
        - [3.15.4. 存储引擎的选择](#3154-存储引擎的选择)
    - [3.16. 性能优化基本的分析命令](#316-性能优化基本的分析命令)
        - [3.16.1. explain](#3161-explain)
        - [3.16.2. show indexs](#3162-show-indexs)
    - [3.17. 分库分表](#317-分库分表)
        - [3.17.1. 基本概念](#3171-基本概念)
        - [3.17.2. 分布式事务](#3172-分布式事务)
        - [3.17.3. 应对多机数据查询](#3173-应对多机数据查询)
            - [3.17.3.1. 跨库Join](#31731-跨库join)
            - [3.17.3.2. 外键约束](#31732-外键约束)
    - [3.18. 高可用](#318-高可用)
        - [3.18.1. 主从复制](#3181-主从复制)
            - [3.18.1.1. 常见形式](#31811-常见形式)
            - [3.18.1.2. 主从同步复制原理](#31812-主从同步复制原理)
            - [3.18.1.3. 主从同步配置](#31813-主从同步配置)
            - [3.18.1.4. 添加更多从服务器](#31814-添加更多从服务器)

<!-- /TOC -->

<a id="markdown-1-多线程" name="1-多线程"></a>
# 1. 多线程
<a id="markdown-11-基本概念" name="11-基本概念"></a>
## 1.1. 基本概念
<a href="#menu" style="float:right">目录</a>

* 进程
    * 受操作系统管理和资源分配的基本单元，进程之间的内存空间是相互独立的。
* 线程
    * 进程中独立运行的子任务，线程共享进程内存空间。
* 串行&并行&并发
    * 串行:一个任务执行完再去执行其他任务
    * 并行:任务交替执行，就好象同时执行一样
    * 并发:任务同步执行，多核CPU的计算机，可以同步执行任务
* 使用多线程
    * 优点
        * 多核CPU的时候，可以有效利用多核提高程序执行效率
        * 在程序任务阻塞的场景下，利用多线程执行其他任务，提高执行效率
    * 缺点
        * 上下文切换时的时间开销
            * vmstat(unix)和perfmon(win)可以查看
        * 需要保证内存同步
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

* 发布和逸出
    * 发布
        * 使对象能够在当前作用域之外的代码中使用
            * 将一个指向该对象的引用保存到其他代码可以访问的地方
            * 在某一个非私有的方法中返回该引用
            * 将引用传递到其他类的方法中
        * 发布可能会影响线程安全性
    * 逸出
        * 当某个不应该发布的对象被发布时，就叫做逸出

* 解决线程安全问题
    * 使用各种锁来实现同步
    * 线程封闭
        * 共享可变数据会存在线程安全问题，避免线程安全问题可以不共享该数据，也就是线程封闭。比如说局部变量。ThreadLocal实现。
    * 使用不可变对象，也就是只读变量


<a id="markdown-12-java多线程" name="12-java多线程"></a>
## 1.2. Java多线程
<a href="#menu" style="float:right">目录</a>

<a id="markdown-121-实现方式" name="121-实现方式"></a>
### 1.2.1. 实现方式
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

<a id="markdown-122-基本属性" name="122-基本属性"></a>
### 1.2.2. 基本属性
* 线程名称，主线程为main，其他线程为Thread-1,Thread-2,可自定义，用于区分不同的线程。
* 线程分组
* 线程优先级
* 守护线程标志，默认为非守护线程

<a id="markdown-123-常用方法" name="123-常用方法"></a>
### 1.2.3. 常用方法

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

* join和sleep的区别
    * sleep是直接由native方法实现
    * join内部由wait实现，因此会释放锁。
```java
public static native void sleep(long millis) throws InterruptedException;

//通过isAlive()方法判断线程是否执行结束
//参数为0,则一直等待，
public final synchronized void join(long millis)
    throws InterruptedException {
        long base = System.currentTimeMillis();
        long now = 0;

        if (millis < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }

        if (millis == 0) {
            while (isAlive()) {
                //参数为0,一直等待
                wait(0);
            }
        } else {
            //
            while (isAlive()) {
                long delay = millis - now;
                if (delay <= 0) {
                    //超时时间到，退出
                    break;
                }
                wait(delay);
                now = System.currentTimeMillis() - base;
            }
        }
    }
```

**子线程异常处理**

* 第一种，直接在子线程中使用try-catch解决

* 第二种，通获取是Future模式获取

* 第三种，通过Thread类的UncaughtExceptionHandler统一处理

```java
public interface UncaughtExceptionHandler {
        /**
         * Method invoked when the given thread terminates due to the
         * given uncaught exception.
         * <p>Any exception thrown by this method will be ignored by the
         * Java Virtual Machine.
         * @param t the thread
         * @param e the exception
         */
        void uncaughtException(Thread t, Throwable e);
    }
```
例子
```java
public class ChildThread implements Runnable {    
    private static ChildThreadExceptionHandler exceptionHandler;

    static {
        exceptionHandler = new ChildThreadExceptionHandler();
    }

    public void run() {
        Thread.currentThread().setUncaughtExceptionHandler(exceptionHandler);
        System.out.println("do something 1");
        exceptionMethod();
        System.out.println("do something 2");
    }

    public static class ChildThreadExceptionHandler implements Thread.UncaughtExceptionHandler {
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(String.format("handle exception in child thread. %s", e));
        }
    }
}
```
或者，设置所有线程的默认异常处理器
```java
public class ChildThread implements Runnable {
    private static ChildThreadExceptionHandler exceptionHandler;

    static {
        exceptionHandler = new ChildThreadExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(exceptionHandler);
    }

    public void run() {
        System.out.println("do something 1");
        exceptionMethod();
        System.out.println("do something 2");
    }

    private void exceptionMethod() {
        throw new RuntimeException("ChildThread exception");
    }

    public static class ChildThreadExceptionHandler implements Thread.UncaughtExceptionHandler {
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(String.format("handle exception in child thread. %s", e));
        }
    }
}
```
<a id="markdown-124-生命周期--线程状态" name="124-生命周期--线程状态"></a>
### 1.2.4. 生命周期 & 线程状态

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
<a id="markdown-125-线程监控工具" name="125-线程监控工具"></a>
### 1.2.5. 线程监控工具
<a href="#menu" style="float:right">目录</a>

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

<a id="markdown-126-有关并行的两个重要定律" name="126-有关并行的两个重要定律"></a>
### 1.2.6. 有关并行的两个重要定律
<a href="#menu" style="float:right">目录</a>

有关为什么要使用并行程序的问题前面已经进行了简单的探讨。总的来说，最重要的应该是处于两个目的。
* 第一，为了获得更好的性能；
* 第二，由于业务模型的需要，确实需要多个执行实体。

在这里，我将更加关注第一种情况，也就是有关性能的问题。将串行程序改造为并发程序，一般来说可以提高程序的整体性能，但是究竟能提高多少，甚至说究竟是否真的可以提高，还是一个需要研究的问题。目前，主要有两个定律对这个问题进行解答，一个是Amdahl定律，另外一个是Gustafson定律。

<a id="markdown-1261-amdahl阿姆达尔定律" name="1261-amdahl阿姆达尔定律"></a>
#### 1.2.6.1. Amdahl(阿姆达尔)定律
Amdahl定律是计算机科学中非常重要的定律。它定义了串行系统并行化后的加速比的计算公式和理论上线。

**加速比定义**：加速比 = 优化前系统耗时 / 优化后系统耗时

所谓加速比就是优化前耗时与优化后耗时的比值。加速比越高，表明优化效果越明显。图1.8显示了Amdahl公式的推到过程，其中n表示处理器个数，T表示时间，T1表示优化前耗时(也就是只有1个处理器时的耗时)，Tn表示使用n个处理器优化后的耗时。F是程序中只能串行执行的比例。
![](https://img2018.cnblogs.com/blog/687624/201907/687624-20190715171943232-1359994647.png)


根据这个公式，如果CPU处理器数量趋于无穷，那么加速比与系统的串行化比例成反比，如果系统中必须有50%的代码串行执行，那么系统的最大加速比为2。

假设有一个程序分为以下步骤执行，每个执行步骤花费100个单位时间。其中，只有步骤2和步骤5可以并行，步骤1、3、4必须串行，如图1.9所示。在全串行的情况下，系统合计耗时为500个单位时间。

![](https://img2018.cnblogs.com/blog/687624/201907/687624-20190715172001402-1096246663.png)

若步骤2和步骤5并行化，假设在双核处理器上，则有如图1.10所示的处理流程。在这种情况下，步骤2和步骤5的耗时将为50个单位时间。故系统整体耗时为400个单位时间。根据加速比的定义有：

加速比 = 优化前系统耗时 / 优化后系统耗时 = 500/400 = 1.25

![](https://img2018.cnblogs.com/blog/687624/201907/687624-20190715172012504-498615290.png)

由于5个步骤中，3个步骤必须串行，因此其串行化比例为3/5=0.6，即 F = 0.6，且双核处理器的处理器个数N为2。代入加速比公式得：

加速比 = 1/(0.6+(1-0.6)/2)=1.25

在极端情况下，假设并行处理器个数为无穷大，则有如图1.11所示的处理过程。步骤2和步骤5的处理时间趋于0。即使这样，系统整体耗时依然大于300个单位时间。使用加速比计算公式，N趋于无穷大，有加速比 = 1/F，且F=0.6，故有加速比=1.67。即加速比的极限为500/300=1.67。

由此可见，为了提高系统的速度，仅增加CPU处理的数量并不一定能起到有效的作用。需要从根本上修改程序的串行行为，提高系统内可并行化的模块比重，在此基础上，合理增加并行处理器数量，才能以最小的投入，得到最大的加速比。

![](https://img2018.cnblogs.com/blog/687624/201907/687624-20190715172023140-911390587.png)

注意：根据Amdahl定律，使用多核CPU对系统进行优化，优化的效果取决于CPU的数量，以及系统中串行化程序的比例。CPU数量越多，串行化比例越低，则优化效果越好。仅提高CPU数量而不降低程序的串行化比例，也无法提高系统的性能。

**阿姆达尔定律图示**

为了更好地理解阿姆达尔定律，我会尝试演示这个定定律是如何诞生的。

首先，一个程序可以被分割为两部分，一部分为不可并行部分B，一部分为可并行部分1 – B。如下图：

![](https://img2018.cnblogs.com/blog/687624/201907/687624-20190715172035054-177863473.png)

在顶部被带有分割线的那条直线代表总时间 T(1)。

下面你可以看到在并行因子为2的情况下的执行时间：

![](https://img2018.cnblogs.com/blog/687624/201907/687624-20190715172047032-563492380.png)

并行因子为3的情况：

![](https://img2018.cnblogs.com/blog/687624/201907/687624-20190715172059082-536715823.png)

**举个例子**

一个业务会串行调用2个方法，m1，m2，m1耗时100ms，m2耗时400ms，m2内部串行执行了4个无依赖的任务，每个任务100ms，如下图：

![](https://img2018.cnblogs.com/blog/687624/201907/687624-20190715172112089-852813220.png)

m2内部的4个任务无依赖的，即可以并行进行处理，4个任务同时并行，当cpu数量大于等于4的时候，可以让4个任务同时进行，此时m2耗时最小，即100ms，cpu为2个的时候，同时只能够执行2个任务，其他2个任务处于等待cpu分配时间片状态，此时m2耗时200ms；当cpu超过4个的时候，或者趋于无限大的时候，m2耗时还是100ms，此时cpu数量再怎么增加对性能也没有提升了，此时需要提升的是任务可以并行的数量。

从阿姆达尔定律可以看出，程序的可并行化部分可以通过使用更多的硬件（更多的线程或CPU）运行更快。对于不可并行化的部分，只能通过优化代码来达到提速的目的。因此，你可以通过优化不可并行化部分来提高你的程序的运行速度和并行能力。你可以对不可并行化在算法上做一点改动，如果有可能，你也可以把一些移到可并行化放的部分。

<a id="markdown-1262-gustafson定律" name="1262-gustafson定律"></a>
#### 1.2.6.2. Gustafson定律
Gustafson定律也试图说明处理器个数、串行化比例和加速比之间的关系，如图1.12所示，但是Gustafson定律和Amdahl定律的角度不同。同样，加速比都被定义为优化前的系统耗时除以优化后的系统耗时。

![](https://img2018.cnblogs.com/blog/687624/201907/687624-20190715172126047-611129314.png)

根据Gustafson定律，我们可以更容易地发现，如果串行化比例很小，并行化比例很大，那么加速比就是处理器的个数。只要不断地累加处理器，就能获得更快的速度。

Amdahl定律和Gustafson定律结论有所不同，并不是说其中有个是错误的，只是二者从不同的角度去看待问题的结果，他们的侧重点有所不同。

Amdahl强调：当串行换比例一定时，加速比是有上限的，不管你堆叠多少个CPU参与计算，都不能突破这个上限。
Gustafson定律关系的是：如果可被并行化的代码所占比例足够大，那么加速比就能随着CPU的数量线性增长。

总的来说，提升性能的方法：想办法提升系统并行的比例，同时增加CPU数量

<a id="markdown-13-synchronized" name="13-synchronized"></a>
## 1.3. Synchronized
<a href="#menu" style="float:right">目录</a>

<a id="markdown-131-基本概念" name="131-基本概念"></a>
### 1.3.1. 基本概念
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

<a id="markdown-132-基本使用" name="132-基本使用"></a>
### 1.3.2. 基本使用
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
<a id="markdown-133-实现原理" name="133-实现原理"></a>
### 1.3.3. 实现原理
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


<a id="markdown-14-线程间通信" name="14-线程间通信"></a>
## 1.4. 线程间通信

<a id="markdown-141-基本概念" name="141-基本概念"></a>
### 1.4.1. 基本概念
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

<a id="markdown-142-实现消费者和生产者" name="142-实现消费者和生产者"></a>
### 1.4.2. 实现消费者和生产者


<a id="markdown-15-线程阻塞工具locksuport" name="15-线程阻塞工具locksuport"></a>
## 1.5. 线程阻塞工具LockSuport
<a href="#menu" style="float:right">目录</a>

* LockSuport用于实现线程阻塞。可以在线程内任意位置让线程阻塞。
* 与suspend()相比，弥补了resume()方法没有发生导致的死锁问题。
* 与wait()相比，不需要先获得某个对象的锁。也不会抛出中断异常。
* LockSuport不需要在临界区内才能调用。

**基本原理**
* 类似于许可证设计，但是这个许可证不能累加。也就是有和无的区别
* 调用unpark给线程增加一个许可证
* 调用park如果有许可证，那么就取消这个许可证，继续往下执行。如果没有许可证，就阻塞等待unpark调用 。
* 这种方式解决了resume先于suspend调用导致的死锁问题。



```JAVA
public class LockSupport {
    private LockSupport() {} // Cannot be instantiated.

    private static void setBlocker(Thread t, Object arg) {
        // Even though volatile, hotspot doesn't need a write barrier here.
        UNSAFE.putObject(t, parkBlockerOffset, arg);
    }


    public static void unpark(Thread thread) {
        if (thread != null)
            UNSAFE.unpark(thread);
    }

    public static void park(Object blocker) {
        Thread t = Thread.currentThread();
        setBlocker(t, blocker);
        UNSAFE.park(false, 0L);
        setBlocker(t, null);
    }

    public static void parkNanos(Object blocker, long nanos) {
        if (nanos > 0) {
            Thread t = Thread.currentThread();
            setBlocker(t, blocker);
            UNSAFE.park(false, nanos);
            setBlocker(t, null);
        }
    }

   
    public static void parkUntil(Object blocker, long deadline) {
        Thread t = Thread.currentThread();
        setBlocker(t, blocker);
        UNSAFE.park(true, deadline);
        setBlocker(t, null);
    }
    public static Object getBlocker(Thread t) {
        if (t == null)
            throw new NullPointerException();
        return UNSAFE.getObjectVolatile(t, parkBlockerOffset);
    }

   //阻塞
    public static void park() {
        UNSAFE.park(false, 0L);
    }
    //超时阻塞
    public static void parkNanos(long nanos) {
        if (nanos > 0)
            UNSAFE.park(false, nanos);
    }

 
     //阻塞当前线程，直到deadline时间点，使用时间戳
    public static void parkUntil(long deadline) {
        UNSAFE.park(true, deadline);
    }



    // Hotspot implementation via intrinsics API
    private static final sun.misc.Unsafe UNSAFE;
    private static final long parkBlockerOffset;
    private static final long SEED;
    private static final long PROBE;
    private static final long SECONDARY;
    static {
        try {
            UNSAFE = sun.misc.Unsafe.getUnsafe();
            Class<?> tk = Thread.class;
            parkBlockerOffset = UNSAFE.objectFieldOffset
                (tk.getDeclaredField("parkBlocker"));
            SEED = UNSAFE.objectFieldOffset
                (tk.getDeclaredField("threadLocalRandomSeed"));
            PROBE = UNSAFE.objectFieldOffset
                (tk.getDeclaredField("threadLocalRandomProbe"));
            SECONDARY = UNSAFE.objectFieldOffset
                (tk.getDeclaredField("threadLocalRandomSecondarySeed"));
        } catch (Exception ex) { throw new Error(ex); }
    }

}


```

LockSupport 和 CAS 是Java并发包中很多并发工具控制机制的基础，它们底层其实都是依赖Unsafe实现。
LockSupport是用来创建锁和其他同步类的基本线程阻塞原语。LockSupport 提供park()和unpark()方法实现阻塞线程和解除线程阻塞，LockSupport和每个使用它的线程都与一个许可(permit)关联。permit相当于1，0的开关，默认是0，调用一次unpark就加1变成1，调用一次park会消费permit, 也就是将1变成0，同时park立即返回。再次调用park会变成block（因为permit为0了，会阻塞在这里，直到permit变为1）, 这时调用unpark会把permit置为1。每个线程都有一个相关的permit, permit最多只有一个，重复调用unpark也不会积累。
park()和unpark()不会有 Thread.suspend 和 Thread.resume 所可能引发的死锁问题，由于许可的存在，调用 park 的线程和另一个试图将其 unpark 的线程之间的竞争将保持活性。
如果调用线程被中断，则park方法会返回。同时park也拥有可以设置超时时间的版本。
三种形式的 park 还各自支持一个 blocker 对象参数。此对象在线程受阻塞时被记录，以允许监视工具和诊断工具确定线程受阻塞的原因。（这样的工具可以使用方法 getBlocker(java.lang.Thread) 访问 blocker。）建议最好使用这些形式，而不是不带此参数的原始形式。在锁实现中提供的作为 blocker 的普通参数是 this。
看下线程dump的结果来理解blocker的作用。

有blocker的可以传递给开发人员更多的现场信息，通过jstack命令可以非常方便的监控具体的阻塞对象，方便定位问题。所以java6新增加带blocker入参的系列park方法，替代原有的park方法


**LockSupport.park()和unpark()和object.wait()和notify()很相似，那么它们有什么区别呢？**
* 面向的主体不一样。LockSuport主要是针对Thread进进行阻塞处理，可以指定阻塞队列的目标对象，每次可以指定具体的线程唤醒。Object.wait()是以对象为纬度，阻塞当前的线程和唤醒单个(随机)或者所有线程。
* 实现机制不同。虽然LockSuport可以指定monitor的object对象，但和object.wait()，两者的阻塞队列并不交叉。可以看下测试例子。object.notifyAll()不能唤醒LockSupport的阻塞Thread.





<a id="markdown-16-线程同步机制" name="16-线程同步机制"></a>
## 1.6. 线程同步机制
<a href="#menu" style="float:right">目录</a>

线程同步机制是一套用于协调线程间的数据访问及活动的机制，用于保障线程安全。

<a id="markdown-161-线程同步机制概述" name="161-线程同步机制概述"></a>
### 1.6.1. 线程同步机制概述
<a href="#menu" style="float:right">目录</a>


<a id="markdown-162-锁概述" name="162-锁概述"></a>
### 1.6.2. 锁概述
<a href="#menu" style="float:right">目录</a>

* 锁可以理解为对共享数据访问的许可证，对于任何一个许可证锁保持的共享数据，任何线程访问这些共享数据前都要获取到锁。并且只有释放之后其他线程才能以同样的方式获取到锁并进行访问
* 锁分类
    * 排他锁(互斥锁)
        * 具有排他性，也就是一个锁一次只能被一个线程锁持有。
    * 共享锁  
        * 共享锁，任何线程都可以访问
        * 常见的场景有读共享，写排他
    * 内部锁
        * 虚拟机内部实现，比如Synchronized
    * 显示锁
        * JDK的Lock接口实现类

* **锁的作用**
    * 资源互斥访问，避免并发问题
    * 整个临界区代码具有原子性
    * 保证可见性
        * 可见性的保障是通过写线程冲刷处理器缓存和读线程刷新处理器缓存这两个操作实现的
        * Java中，锁的获得隐含着刷新处理器缓存这个动作，锁的释放隐含着刷新处理器缓存的操作。因此对变量的任何修改都会更新到主内存中去。
    * 保证有序性
        * 只是保证整体有序性
        * 临界区内的代码仍然可能发生指令重排序，但不会重排序到临界区外。
    * 要保证以上特性，必须保证操作同一种数据加的是同一把锁

* **与锁相关的几个概念**
    * 可重入性
        * 一个线程在其持有一个锁的情况下能否多次获取到该锁。
        * 比如方法A和B都是使用同一把锁，A中调用B，如果没有可重入性，将会发生死锁。
    * 锁的争用与调度
        * Java锁的调度策略包括公平策略和非公平策略
        * 内部锁是非公平锁，Lock两个都支持
    * 锁的粒度
        * 一个锁所保护的资源的大小称为锁的粒度。比如一条语句和多条语句的差别。
        * 有些没必要的语句就无需加锁，提高程序的执行效率。

* **使用锁需要注意的问题**
    * 锁泄漏
        * 获取锁之后，任务执行完成，但是没有释放锁，其他线程也就无法获取到锁。将会发生死锁。
    * 锁的不正确使用出现死锁

<a id="markdown-163-内部锁synchronized" name="163-内部锁synchronized"></a>
### 1.6.3. 内部锁Synchronized

<a href="#menu" style="float:right">目录</a>

<a id="markdown-1631-基本概念" name="1631-基本概念"></a>
#### 1.6.3.1. 基本概念

* synchronized的作用主要有三个
    * 确保线程互斥的访问同步代码
    * 保证共享变量的修改能够及时可见
    * 有效解决重排序问题。
* synchronized具备重入特性
* synchronized修饰的方法没有继承特性，也就是父类修饰了，子类重载的方法也要修饰才能具备同步特性
* 可以修饰方法或者局部代码块,修饰代码块时同步的对象可以是任何对象或者类

普通同步方法，锁是当前实例对象
```java

public synchronized void func(){

}

public void func(){
    synchronized(this){
        
    }

    synchronized(xxx.class){
        
    }
    synchronized(obj){
        
    }
}
```
* 还可以修饰静态方法，此时同步的对象就是类.以下同步的对象都是A.class

静态同步方法，锁是当前类的class对象
```java
Class A{
     public static synchronized void func(){

    }

    public void func(){
          synchronized(A.class){
            
        }   
    }
}
```


<a id="markdown-1632-实现原理" name="1632-实现原理"></a>
#### 1.6.3.2. 实现原理
Java 虚拟机中的同步(Synchronization)基于进入和退出Monitor对象实现， 无论是显式同步(有明确的monitorenter 和 monitorexit 指令,即同步代码块)还是隐式同步都是如此。在 Java 语言中，同步用的最多的地方可能是被 synchronized 修饰的同步方法。同步方法 并不是由 monitorenter 和 monitorexit 指令来实现同步的，而是由方法调用指令读取运行时常量池中方法表结构的 ACC_SYNCHRONIZED 标志来隐式实现的，关于这点，稍后详细分析。

同步代码块：monitorenter指令插入到同步代码块的开始位置，monitorexit指令插入到同步代码块的结束位置，JVM需要保证每一个monitorenter都有一个monitorexit与之相对应。任何对象都有一个monitor与之相关联，当且一个monitor被持有之后，他将处于锁定状态。线程执行到monitorenter指令时，将会尝试获取对象所对应的monitor所有权，即尝试获取对象的锁；

```java
package com.example.demo.thread;

public class ThreadDemo {

    public void func1(){

        synchronized (this){
            System.out.println("AA");
        }
    }

    public void func2(){
        System.out.println("BB");
    }
}
```
反编译后的class文件
```
lgj@lgj-Lenovo-G470:$ javap -c ThreadDemo.class
Compiled from "ThreadDemo.java"
public class com.example.demo.thread.ThreadDemo {
  public com.example.demo.thread.ThreadDemo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public void func1();
    Code:
       0: aload_0
       1: dup
       2: astore_1
       3: monitorenter
       4: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
       7: ldc           #3                  // String AA
       9: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      12: aload_1
      13: monitorexit
      14: goto          22
      17: astore_2
      18: aload_1
      19: monitorexit
      20: aload_2
      21: athrow
      22: return
    Exception table:
       from    to  target type
           4    14    17   any
          17    20    17   any

  public void func2();
    Code:
       0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #5                  // String BB
       5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return
}

```
* **monitorenter**:每个对象都是一个监视器锁（monitor）。当monitor被占用时就会处于锁定状态，线程执行monitorenter指令时尝试获取monitor的所有权，过程如下：
    * 如果monitor的进入数为0，则该线程进入monitor，然后将进入数设置为1，该线程即为monitor的所有者；
    * 如果线程已经占有该monitor，只是重新进入，则进入monitor的进入数加1；
    * 如果其他线程已经占用了monitor，则该线程进入阻塞状态，直到monitor的进入数为0，再重新尝试获取monitor的所有权；

* **monitorexit**：执行monitorexit的线程必须是objectref所对应的monitor的所有者。指令执行时，monitor的进入数减1，如果减1后进入数为0，那线程退出monitor，不再是这个monitor的所有者。其他被这个monitor阻塞的线程可以尝试去获取这个 monitor 的所有权
    * monitorexit指令出现了两次，第1次为同步正常退出释放锁；第2次为发生异步退出释放锁

* 通过上面两段描述，我们应该能很清楚的看出Synchronized的实现原理，Synchronized的语义底层是通过一个monitor的对象来完成，其实wait/notify等方法也依赖于monitor对象，这就是为什么只有在同步的块或者方法中才能调用wait/notify等方法，否则会抛出java.lang.IllegalMonitorStateException的异常的原因


**Java对象头**

在JVM中，对象在内存中的布局分为三块区域：对象头、实例变量和填充数据。如下
![](https://upload-images.jianshu.io/upload_images/2062729-9a78f7ea7671a031.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/881/format/webp)

* **实例变量**：存放类的属性数据信息，包括父类的属性信息，如果是数组的实例部分还包括数组的长度，这部分内存按4字节对齐
* **填充数据**：由于虚拟机要求对象起始地址必须是8字节的整数倍。填充数据不是必须存在的，仅仅是为了字节对齐，这点了解即可。
* **对象头**：Hotspot虚拟机的对象头主要包括两部分数据：Mark Word（标记字段）、Klass Pointer（类型指针）。其中Klass Point是是对象指向它的类元数据的指针，虚拟机通过这个指针来确定这个对象是哪个类的实例，Mark Word用于存储对象自身的运行时数据，它是实现轻量级锁和偏向锁的关键。

Synchronized用的锁就是存在Java对象头里的，那么什么是Java对象头呢？Hotspot虚拟机的对象头主要包括两部分数据：Mark Word（标记字段）、Class Pointer（类型指针）。其中 Class Pointer是对象指向它的类元数据的指针，虚拟机通过这个指针来确定这个对象是哪个类的实例，Mark Word用于存储对象自身的运行时数据，它是实现轻量级锁和偏向锁的关键。 Java对象头具体结构描述如下

![](https://upload-images.jianshu.io/upload_images/2062729-2ab6edc7f91a1535.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/677/format/webp)



Mark Word：用于存储对象自身的运行时数据，如哈希码（HashCode）、GC分代年龄、锁状态标志、线程持有的锁、偏向线程 ID、偏向时间戳等等。Java对象头一般占有两个机器码（在32位虚拟机中，1个机器码等于4字节，也就是32bit），但是如果对象是数组类型，则需要三个机器码，因为JVM虚拟机可以通过Java对象的元数据信息确定Java对象的大小，但是无法从数组的元数据来确认数组的大小，所以用一块来记录数组长度。

![](https://upload-images.jianshu.io/upload_images/2062729-063a9a5dc677cd12.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/679/format/webp)

对象头信息是与对象自身定义的数据无关的额外存储成本，但是考虑到虚拟机的空间效率，Mark Word被设计成一个非固定的数据结构以便在极小的空间内存存储尽量多的数据，它会根据对象的状态复用自己的存储空间，也就是说，Mark Word会随着程序的运行发生变化，可能变化为存储以下4种数据：

![](https://upload-images.jianshu.io/upload_images/2062729-c63ff6c2d337ad5f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/676/format/webp)

在64位虚拟机下，Mark Word是64bit大小的，其存储结构如下：

![](https://upload-images.jianshu.io/upload_images/2062729-5f6d3993ba018942.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/676/format/webp)

对象头的最后两位存储了锁的标志位，01是初始状态，未加锁，其对象头里存储的是对象本身的哈希码，随着锁级别的不同，对象头里会存储不同的内容。偏向锁存储的是当前占用此对象的线程ID；而轻量级则存储指向线程栈中锁记录的指针。从这里我们可以看到，“锁”这个东西，可能是个锁记录+对象头里的引用指针（判断线程是否拥有锁时将线程的锁记录地址和对象头里的指针地址比较)，也可能是对象头里的线程ID（判断线程是否拥有锁时将线程的ID和对象头里存储的线程ID比较）。

![](https://upload-images.jianshu.io/upload_images/2062729-36035cd1936bd2c6.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/964/format/webp)


**对象头中Mark Word与线程中Lock Record**
在线程进入同步代码块的时候，如果此同步对象没有被锁定，即它的锁标志位是01，则虚拟机首先在当前线程的栈中创建我们称之为“锁记录（Lock Record）”的空间，用于存储锁对象的Mark Word的拷贝，官方把这个拷贝称为Displaced Mark Word。整个Mark Word及其拷贝至关重要。
Lock Record是线程私有的数据结构，每一个线程都有一个可用Lock Record列表，同时还有一个全局的可用列表。每一个被锁住的对象Mark Word都会和一个Lock Record关联（对象头的MarkWord中的Lock Word指向Lock Record的起始地址），同时Lock Record中有一个Owner字段存放拥有该锁的线程的唯一标识（或者object mark word），表示该锁被这个线程占用。如下图所示为Lock Record的内部结构：



|Lock Record |描述|
|---|---|
|Owner|初始时为NULL表示当前没有任何线程拥有该monitor record，当线程成功拥有该锁后保存线程唯一标识，当锁被释放时又设置为NULL；
|EntryQ|关联一个系统互斥锁（semaphore），阻塞所有试图锁住monitor record失败的线程；
|RcThis|表示blocked或waiting在该monitor record上的所有线程的个数；
|Nest|用来实现 重入锁的计数；
|HashCode|保存从对象头拷贝过来的HashCode值（可能还包含GC age）。
|Candidate|用来避免不必要的阻塞或等待线程唤醒，因为每一次只有一个线程能够成功拥有锁，如果每次前一个释放锁的线程唤醒所有正在阻塞或等待的线程，会引起不必要的上下文切换（从阻塞到就绪然后因为竞争锁失败又被阻塞）从而导致性能严重下降。Candidate只有两种可能的值0表示没有需要唤醒的线程1表示要唤醒一个继任线程来竞争锁。



**监视器（Monitor）**
任何一个对象都有一个Monitor与之关联，当且一个Monitor被持有后，它将处于锁定状态。Synchronized在JVM里的实现都是 基于进入和退出Monitor对象来实现方法同步和代码块同步，虽然具体实现细节不一样，但是都可以通过成对的MonitorEnter和MonitorExit指令来实现。

* MonitorEnter指令：插入在同步代码块的开始位置，当代码执行到该指令时，将会尝试获取该对象Monitor的所有权，即尝试获得该对象的锁；
* MonitorExit指令：插入在方法结束处和异常处，JVM保证每个MonitorEnter必须有对应的MonitorExit；


那什么是Monitor？可以把它理解为 一个同步工具，也可以描述为 一种同步机制，它通常被 描述为一个对象。
与一切皆对象一样，所有的Java对象是天生的Monitor，每一个Java对象都有成为Monitor的潜质，因为在Java的设计中 ，每一个Java对象自打娘胎里出来就带了一把看不见的����，它叫做内部锁或者Monitor锁。
也就是通常说Synchronized的对象锁，MarkWord锁标识位为10，其中指针指向的是Monitor对象的起始地址。在Java虚拟机（HotSpot）中，Monitor是由ObjectMonitor实现的，其主要数据结构如下（位于HotSpot虚拟机源码ObjectMonitor.hpp文件，C++实现的）：

```cpp
ObjectMonitor() {
    _header       = NULL;
    _count        = 0; // 记录个数
    _waiters      = 0,
    _recursions   = 0;
    _object       = NULL;
    _owner        = NULL;
    _WaitSet      = NULL; // 处于wait状态的线程，会被加入到_WaitSet
    _WaitSetLock  = 0 ;
    _Responsible  = NULL ;
    _succ         = NULL ;
    _cxq          = NULL ;
    FreeNext      = NULL ;
    _EntryList    = NULL ; // 处于等待锁block状态的线程，会被加入到该列表
    _SpinFreq     = 0 ;
    _SpinClock    = 0 ;
    OwnerIsThread = 0 ;
  }
```

ObjectMonitor中有两个队列，_WaitSet 和 _EntryList，用来保存ObjectWaiter对象列表（ 每个等待锁的线程都会被封装成ObjectWaiter对象 ），_owner指向持有ObjectMonitor对象的线程，当多个线程同时访问一段同步代码时：
* 首先会进入 _EntryList 集合，当线程获取到对象的monitor后，进入 _Owner区域并把monitor中的owner变量设置为当前线程，同时monitor中的计数器count加1；
* 若线程调用 wait() 方法，将释放当前持有的monitor，owner变量恢复为null，count自减1，同时该线程进入 WaitSet集合中等待被唤醒；
* 若当前线程执行完毕，也将释放monitor（锁）并复位count的值，以便其他线程进入获取monitor(锁)；


同时，Monitor对象存在于每个Java对象的对象头Mark Word中（存储的指针的指向），Synchronized锁便是通过这种方式获取锁的，也是为什么Java中任意对象可以作为锁的原因，同时notify/notifyAll/wait等方法会使用到Monitor锁对象，所以必须在同步代码块中使用。
监视器Monitor有两种同步方式：互斥与协作。多线程环境下线程之间如果需要共享数据，需要解决互斥访问数据的问题，监视器可以确保监视器上的数据在同一时刻只会有一个线程在访问。


* 什么时候需要协作？ 比如：
一个线程向缓冲区写数据，另一个线程从缓冲区读数据，如果读线程发现缓冲区为空就会等待，当写线程向缓冲区写入数据，就会唤醒读线程，这里读线程和写线程就是一个合作关系。JVM通过Object类的wait方法来使自己等待，在调用wait方法后，该线程会释放它持有的监视器，直到其他线程通知它才有执行的机会。一个线程调用notify方法通知在等待的线程，这个等待的线程并不会马上执行，而是要通知线程释放监视器后，它重新获取监视器才有执行的机会。如果刚好唤醒的这个线程需要的监视器被其他线程抢占，那么这个线程会继续等待。Object类中的notifyAll方法可以解决这个问题，它可以唤醒所有等待的线程，总有一个线程执行。

![](https://upload-images.jianshu.io/upload_images/2062729-d1cc81ebcf0e912b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/593/format/webp)

如上图所示，一个线程通过1号门进入Entry Set(入口区)，如果在入口区没有线程等待，那么这个线程就会获取监视器成为监视器的Owner，然后执行监视区域的代码。如果在入口区中有其它线程在等待，那么新来的线程也会和这些线程一起等待。线程在持有监视器的过程中，有两个选择，一个是正常执行监视器区域的代码，释放监视器，通过5号门退出监视器；还有可能等待某个条件的出现，于是它会通过3号门到Wait Set（等待区）休息，直到相应的条件满足后再通过4号门进入重新获取监视器再执行。

* 注意：
当一个线程释放监视器时，在入口区和等待区的等待线程都会去竞争监视器，如果入口区的线程赢了，会从2号门进入；如果等待区的线程赢了会从4号门进入。只有通过3号门才能进入等待区，在等待区中的线程只有通过4号门才能退出等待区，也就是说一个线程只有在持有监视器时才能执行wait操作，处于等待的线程只有再次获得监视器才能退出等待状态。


<a id="markdown-164-显示锁lock" name="164-显示锁lock"></a>
### 1.6.4. 显示锁Lock
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1641-基本使用" name="1641-基本使用"></a>
#### 1.6.4.1. 基本使用

主要接口和类
```java

public interface Lock{
    void lock();    
    void lockInterruptibly() throws InterruptedException;    
    boolean tryLock();
    boolean tryLock(long time, TimeUnit unit) throws InterruptedException;
    void unlock();
    Condition newCondition();
}
public class ReentrantLock implements Lock, java.io.Serializable {
    public ReentrantLock(boolean fair) {
        sync = fair ? new FairSync() : new NonfairSync();
    }
}

public interface ReadWriteLock {
    Lock readLock();
    Lock writeLock();
}
public class ReentrantReadWriteLock
        implements ReadWriteLock, java.io.Serializable {

    public ReentrantReadWriteLock(boolean fair) {
        sync = fair ? new FairSync() : new NonfairSync();
        readerLock = new ReadLock(this);
        writerLock = new WriteLock(this);
    }
    
    public static class WriteLock implements Lock, java.io.Serializable {}
    public static class ReadLock implements Lock, java.io.Serializable {}
}
```

使用结构
```java

public void func(){
    Lock lock = new ReentrantLock();

    try{
        lock.lock();
    } 
    finally{
        lock.unlock();
    }
}
```
* 创建Lock的实例
* 调用lock()方法获取锁
* lock()方法和unlock()方法之间的代码块为临界区。
* 调用unlock()释放锁，为了保证一定释放锁，该条语句放在finally块中。

---
* Lock支持公平锁和非公平锁，可以通过构造器指定，默认是非公平锁。
* Lock支持可重入特性

* lockInterruptibly()
    * 当通过这个方法去获取锁时，如果其他线程正在等待获取锁，则这个线程能够响应中断，即中断线程的等待状态。也就使说，当两个线程同时通过lock.lockInterruptibly()想获取某个锁时，假若此时线程A获取到了锁，而线程B只有等待，那么对线程B调用threadB.interrupt()方法能够中断线程B的等待过程\
    * locK()方法不支持中断，也就是lock()调用等待锁时，此时线程发生中断，不会停止等待过程。

* **Lock与synchronized有以下区别：**
    * 首先synchronized是java内置关键字，在jvm层面，Lock是个java类；
    * synchronized会自动释放锁，而Lock必须手动释放锁。
    * synchronized无法判断是否获取锁的状态，Lock可以判断是否获取到锁；
    * Lock支持超时等待获取锁
    * Lock支持公平和非公平锁
    * Lock可以让等待锁的线程响应中断，而synchronized不会，线程会一直等待下去。
    * 通过Lock可以知道线程有没有拿到锁，而synchronized不能。
    * Lock能提高多个线程读操作的效率。
    * synchronized能锁住类、方法和代码块，而Lock是块范围内的
    * 在高争用环境下，synchronized性能极具下降。Lock性能下降少很多

**读写锁**
```java

ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
Lock writeLock = readWriteLock.writeLock();
Lock readLock = readWriteLock.readLock();

public void read(){
    

    try{
        readLock.lock();
    } 
    finally{
        readLock.unlock();
    }
}
public void write(){

    try{
        writeLock.lock();
    } 
    finally{
        writeLock.unlock();
    }
}
```
* 读写锁也是一个可重入锁
* 使用场景
    * 在读多写少的环境可以使用读写锁提高并发度。
    * 读线程持有锁的时间比较长
* 读锁
    * 读读共享
    * 只有在其他线程未获得**写锁**的情况下才能获取到
    * 在获取到读锁之后，其他线程也可以同时获取到读锁，因为读读共享
* 写锁
    * 读写互斥
    * 只有在其他线程未获得**读写锁**的情况下才能获取到
    * 在获取到写锁之后，其他线程都不能获取到读锁和写锁
* 锁降级
    * 读写锁支持锁降级
    * 一个线程持有**写锁**的情况下仍然可以获取到**读锁**(其他线程获取不到读锁和写锁
* 锁升级
    * 一个线程持有**读锁**的情况下仍然可以获取到**写锁**
    * ReadWriteLock不支持锁升级

<a id="markdown-1642-实现原理" name="1642-实现原理"></a>
#### 1.6.4.2. 实现原理




<a id="markdown-165-内存屏障" name="165-内存屏障"></a>
### 1.6.5. 内存屏障
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1651-基本概念" name="1651-基本概念"></a>
#### 1.6.5.1. 基本概念
内存屏障（Memory Barrier）与内存栅栏（Memory Fence）是同一个概念，不同的叫法。

通过volatile标记，可以解决编译器层面的可见性与重排序问题。而内存屏障则解决了硬件层面的可见性与重排序问题。

<a id="markdown-1652-标准" name="1652-标准"></a>
#### 1.6.5.2. 标准

先简单了解两个指令：
* Store：将处理器缓存的数据刷新到内存中。
* Load：将内存存储的数据拷贝到处理器的缓存中。

|屏障类型|指令示例|说明
|---|---|---|
|LoadLoad Barriers|Load1;LoadLoad;Load2|该屏障确保Load1数据的装载先于Load2及其后所有装载指令的的操作
|StoreStore Barriers|Store1;StoreStore;Store2|该屏障确保Store1立刻刷新数据到内存(使其对其他处理器可见)的操作先于Store2及其后所有存储指令的操作
|LoadStore Barriers|Load1;LoadStore;Store2|确保Load1的数据装载先于Store2及其后所有的存储指令刷新数据到内存的操作
|StoreLoad Barriers|Store1;StoreLoad;Load2|该屏障确保Store1立刻刷新数据到内存的操作先于Load2及其后所有装载装载指令的操作。它会使该屏障之前的所有内存访问指令(存储指令和访问指令)完成之后,才执行该屏障之后的内存访问指令



StoreLoad Barriers同时具备其他三个屏障的效果，因此也称之为全能屏障（mfence），是目前大多数处理器所支持的；但是相对其他屏障，该屏障的开销相对昂贵。
然而，除了mfence，不同的CPU架构对内存屏障的实现方式与实现程度非常不一样。相对来说，Intel CPU的强内存模型比DEC Alpha的弱复杂内存模型（缓存不仅分层了，还分区了）更简单。x86架构是在多线程编程中最常见的，下面讨论x86架构中内存屏障的实现。

查阅资料时，你会发现每篇讲内存屏障的文章讲的都不同。不过，重要的是理解基本原理，需要的时候再继续深究即可。
不过不管是那种方案，内存屏障的实现都要针对乱序执行的过程来设计。前文的注释中讲解了乱序执行的基本原理：核心是一个序列缓冲区，只要指令的数据运算对象是可以获取的，指令就被允许在先进入的、旧的指令之前离开序列缓冲区，开始执行。对于内存可见性的语义，内存屏障可以通过使用类似MESI协议的思路实现。对于重排序语义的实现机制，猴子没有继续研究，一种可行的思路是：
* 当CPU收到屏障指令时，不将屏障指令放入序列缓冲区，而将屏障指令及后续所有指令放入一个FIFO队列中（指令是按批发送的，不然没有乱序的必要）
* 允许乱序执行完序列缓冲区中的所有指令
* 从FIFO队列中取出屏障指令，执行（并刷新缓存等，实现内存可见性的语义）
* 将FIFO队列中的剩余指令放入序列缓冲区
* 恢复正常的乱序执行

对于x86架构中的sfence屏障指令而言，则保证sfence之前的store执行完，再执行sfence，最后执行sfence之后的store；除了禁用sfence前后store乱序带来的新的数据依赖外，不影响load命令的乱序。详细见后。

<a id="markdown-1653-x86架构的内存屏障" name="1653-x86架构的内存屏障"></a>
#### 1.6.5.3. x86架构的内存屏障

x86架构并没有实现全部的内存屏障。
**Store Barrier**
sfence指令实现了Store Barrier，相当于StoreStore Barriers。
强制所有在sfence指令之前的store指令，都在该sfence指令执行之前被执行，发送缓存失效信号，并把store buffer中的数据刷出到CPU的L1 Cache中；所有在sfence指令之后的store指令，都在该sfence指令执行之后被执行。即，禁止对sfence指令前后store指令的重排序跨越sfence指令，使所有Store Barrier之前发生的内存更新都是可见的。
这里的“可见”，指修改值可见（内存可见性）且操作结果可见（禁用重排序）。下同。

内存屏障的标准中，讨论的是缓存与内存间的相干性，实际上，同样适用于寄存器与缓存、甚至寄存器与内存间等多级缓存之间。x86架构使用了MESI协议的一个变种，由协议保证三层缓存与内存间的相关性，则内存屏障只需要保证store buffer（可以认为是寄存器与L1 Cache间的一层缓存）与L1 Cache间的相干性。下同。

**Load Barrier**
lfence指令实现了Load Barrier，相当于LoadLoad Barriers。
强制所有在lfence指令之后的load指令，都在该lfence指令执行之后被执行，并且一直等到load buffer被该CPU读完才能执行之后的load指令（发现缓存失效后发起的刷入）。即，禁止对lfence指令前后load指令的重排序跨越lfence指令，配合Store Barrier，使所有Store Barrier之前发生的内存更新，对Load Barrier之后的load操作都是可见的。
**Full Barrier**
mfence指令实现了Full Barrier，相当于StoreLoad Barriers。
mfence指令综合了sfence指令与lfence指令的作用，强制所有在mfence指令之前的store/load指令，都在该mfence指令执行之前被执行；所有在mfence指令之后的store/load指令，都在该mfence指令执行之后被执行。即，禁止对mfence指令前后store/load指令的重排序跨越mfence指令，使所有Full Barrier之前发生的操作，对所有Full Barrier之后的操作都是可见的。

<a id="markdown-1654-volatile如何解决内存可见性与处理器重排序问题" name="1654-volatile如何解决内存可见性与处理器重排序问题"></a>
#### 1.6.5.4. volatile如何解决内存可见性与处理器重排序问题

在编译器层面，仅将volatile作为标记使用，取消编译层面的缓存和重排序。

如果硬件架构本身已经保证了内存可见性（如单核处理器、一致性足够的内存模型等），那么volatile就是一个空标记，不会插入相关语义的内存屏障。
如果硬件架构本身不进行处理器重排序、有更强的重排序语义（能够分析多核间的数据依赖）、或在单核处理器上重排序，那么volatile就是一个空标记，不会插入相关语义的内存屏障。
如果不保证，仍以x86架构为例，JVM对volatile变量的处理如下：

在写volatile变量v之后，插入一个sfence。这样，sfence之前的所有store（包括写v）不会被重排序到sfence之后，sfence之后的所有store不会被重排序到sfence之前，禁用跨sfence的store重排序；且sfence之前修改的值都会被写回缓存，并标记其他CPU中的缓存失效。
在读volatile变量v之前，插入一个lfence。这样，lfence之后的load（包括读v）不会被重排序到lfence之前，lfence之前的load不会被重排序到lfence之后，禁用跨lfence的load重排序；且lfence之后，会首先刷新无效缓存，从而得到最新的修改值，与sfence配合保证内存可见性。


在另外一些平台上，JVM使用mfence代替sfence与lfence，实现更强的语义。

二者结合，共同实现了Happens-Before关系中的volatile变量规则。

<a id="markdown-1655-jvm对内存屏障作出的其他封装" name="1655-jvm对内存屏障作出的其他封装"></a>
#### 1.6.5.5. JVM对内存屏障作出的其他封装
除volatile外，常见的JVM实现还基于内存屏障作了一些其他封装。借助于内存屏障，这些封装也得到了内存屏障在可见性与重排序上的语义。

借助：piggyback。
在JVM中，借助通常指：将Happens-Before的程序顺序规则与其他某个顺序规则（通常是监视器锁规则、volatile变量规则）结合起来，从而对某个未被锁保护的变量的访问操作进行排序。
本文将借助的语义扩展到更大的范围，可以借助任何现有机制，以获得现有机制的某些属性。当然，并不是所有属性都能被借助，比如原子性。但基于前文对内存屏障的分析可知，可见性与重排序是可以被借助的。





<a id="markdown-166-锁与重排序" name="166-锁与重排序"></a>
### 1.6.6. 锁与重排序
<a href="#menu" style="float:right">目录</a>

* 临界区内的操作不允许被重排序到临界区外
    * 是锁保证原子性和可见性的基础，编译器和处理器必须遵守该规则
    * 虚拟机会在临界区的开始之前和结束之后分别插入一个获取屏障和释放屏障，从而禁止临界区内的操作被排到临界区之前和之后
* 临界区内允许指令重排序
* 临界区外(临界区前和后)允许重排序
* 锁申请(monitorEnter)和锁释放(MonitorExit)不能被重排序
    * 确保锁申请是配对的，只有成功申请，才能释放
* 两个锁申请操作不能被重排序
* 两个锁释放操作不能被重排序
    * 上面三条规则确保了Java语义支持重入锁，并且避免锁操作(申请和释放)可能导致的死锁。编译器和处理器必须遵守该规则
* 临界区外的代码可以被重排序到临界区内，只要没有违反happen-before

<a id="markdown-167-提高锁性能方案" name="167-提高锁性能方案"></a>
### 1.6.7. 提高锁性能方案
<a href="#menu" style="float:right">目录</a>

**减少锁持有的时间**
**减少锁粒度**
**使用读写分离锁来替换独占锁**
* 适合读多写少的场景

**锁分段**
比如一个数组，前部分使用一个锁，后部分使用一个锁。只有全局操作时才使用同一个锁。
旧版本的ConcurrentHashmap使用的就是分段锁

**锁分离**
* 也就是使用不同的锁进行控制，比如读写锁

**锁粗化**
* 虚拟机在遇到一连串连续地对同一个锁不断进行请求和释放的操作，便会把所有的锁操作整合成对锁的一次请求，从而减少对锁的请求的同步次数。



<a id="markdown-168-java虚拟机的锁优化" name="168-java虚拟机的锁优化"></a>
### 1.6.8. Java虚拟机的锁优化
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


<a id="markdown-17-并发编程的挑战" name="17-并发编程的挑战"></a>
## 1.7. 并发编程的挑战
<a href="#menu" style="float:right">目录</a>

<a id="markdown-171-上下文切换" name="171-上下文切换"></a>
### 1.7.1. 上下文切换
<a href="#menu" style="float:right">目录</a>

**基本概念**
* 即使是单核处理器也支持多线程执行代码，CPU通过给每个线程分配CPU时间片来实现这个机制。时间片是CPU分配给各个线程的时间，因为时间片非常短，所以CPU通过不停地切换线程执行，让我们感觉多个线程是同时执行的，时间片一般是几十毫秒（ms）.
* CPU通过时间片分配算法来循环执行任务，当前任务执行一个时间片后会切换到下一个任务。但是，在切换前会保存上一个任务的状态，以便下次切换回这个任务时，可以再加载这个任务的状态。所以任务从保存到再加载的过程就是一次上下文切换
* 由于每次切换都要进行状态保存与恢复等操作，因此切换越多，运行效率会降低。
* 可以使用vmstat进行检测，后面的参数为间隔时间。cs（Content switch）为切换次数



**上下文切换分类**
* 自发性上下文切换
    * 调用相关方法：sleep,wait,tield,join,park
    * 发起IO操作或者等待锁的时候
* 非自发性上下文切换
    * 操作系统进行线程任务调度

**上下文切换的开销和测量**

* 开销分类
    * 直接开销
        * 操作系统保存和恢复上下文所需的开销，这主要是处理器的时间开销
        * 线程调度器进行线程调度的开销（决定哪个线程获得执行）
    * 间接开销
        * 处理器高速缓存重新加载的开销。一个被切出的线程可能稍后在另外一个处理器上被切入继续运行。由于这个处理器之前可能未运行过该线程，那么这个线程在器继续运行过程中需要访问的变量仍然需要被该处理器重新从主内存或者通过缓存一致性协议从其他处理器加载到高速内存之中
        * 上下文切换也可能导致整个一级高速缓存中的内容被冲刷。即一级高速缓存中的内容 会被写入下一级高速缓存或者主内存。
    *一般上下文的消耗时间等级微秒级的

* 查看上下文切换次数
    * LINUX -- vmstat
    * WIN -- perfmon

以下的cs即为上下文切换次数。
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
    

<a id="markdown-172-死锁" name="172-死锁"></a>
### 1.7.2. 死锁
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

<a id="markdown-173-饥饿" name="173-饥饿"></a>
### 1.7.3. 饥饿

当线程由于无法访问它所需的资源而不能继续执行时，就发生了饥饿(Starvation)。
引发饥饿的一般是由于线程的优先级比较低或者使用非公平锁时出现。

<a id="markdown-174-活锁" name="174-活锁"></a>
### 1.7.4. 活锁
线程可能一直处于可运行态，但是所要执行的任务一直无法进行。

<a id="markdown-175-内存同步" name="175-内存同步"></a>
### 1.7.5. 内存同步

在synchronized和volatile提供的可见性中使用一些特殊指令，即内存栅栏(Memory Barrier)，内存栅栏可以刷新缓存，使缓存无效，刷新硬件的写缓冲，以及停止执行管道。
内存栅栏可能同样对性能带来间接的影响，因为会抑制编译器的优化，在内存栅栏中，大多数操作都是不能被重排序的。


<a id="markdown-176-阻塞" name="176-阻塞"></a>
### 1.7.6. 阻塞

当一个线程发生阻塞时，操作系统会切换其他线程执行，这时发生一次上下文切换。当阻塞直到获取到资源时，再次发生一次上下文切换。

<a id="markdown-177-资源的争用与调度" name="177-资源的争用与调度"></a>
### 1.7.7. 资源的争用与调度

多个线程申请同一个排他性资源的情况下，决定哪个线程会获取到该资源的独占权，就是资源的调度。
资源的调度常见的一个特性是是否保持公平。
如果一个资源先申请则先获取到，则认为是公平的，反之则不公平。

* 公平调度策略
    * 维护一个内部队列来保证公平性
    * 按照先来后到的顺序来获取资源独占权
    * 吞吐率较小，可以避免饥饿问题
* 非公平调度策略
    * 允许插队现象，即一个线程释放其资源独占权的时候，等待队列中的一个线程会被唤醒再次申请相应的资源，而在这个过程中活跃线程(RUNABLE)页也将会参与争抢过程。
    * 非公平策略可能会出现饥饿问题
    * 吞吐率较大

<a id="markdown-18-java内存模型" name="18-java内存模型"></a>
## 1.8. Java内存模型
<a href="#menu" style="float:right">目录</a>

<a id="markdown-181-java内存模型基础" name="181-java内存模型基础"></a>
### 1.8.1. Java内存模型基础
<a href="#menu" style="float:right">目录</a>

**现代计算机的内存模型**
物理计算机中的并发问题，物理机遇到的并发问题与虚拟机中的情况有不少相似之处，物理机对并发的处理方案对于虚拟机的实现也有相当大的参考意义。
其中一个重要的复杂性来源是绝大多数的运算任务都不可能只靠处理器“计算”就能完成，处理器至少要与内存交互，如读取运算数据、存储运算结果等，这个I/O操作是很难消除的（无法仅靠寄存器来完成所有运算任务）。早期计算机中cpu和内存的速度是差不多的，但在现代计算机中，cpu的指令速度远超内存的存取速度,由于计算机的存储设备与处理器的运算速度有几个数量级的差距，所以现代计算机系统都不得不加入一层读写速度尽可能接近处理器运算速度的高速缓存（Cache）来作为内存与处理器之间的缓冲：将运算需要使用到的数据复制到缓存中，让运算能快速进行，当运算结束后再从缓存同步回内存之中，这样处理器就无须等待缓慢的内存读写了。
基于高速缓存的存储交互很好地解决了处理器与内存的速度矛盾，但是也为计算机系统带来更高的复杂度，因为它引入了一个新的问题：缓存一致性（Cache Coherence）。在多处理器系统中，每个处理器都有自己的高速缓存，而它们又共享同一主内存（MainMemory）。当多个处理器的运算任务都涉及同一块主内存区域时，将可能导致各自的缓存数据不一致，举例说明变量在多个CPU之间的共享。如果真的发生这种情况，那同步回到主内存时以谁的缓存数据为准呢？为了解决一致性的问题，需要各个处理器访问缓存时都遵循一些协议，在读写时要根据协议来进行操作，这类协议有MSI、MESI（Illinois Protocol）、MOSI、Synapse、Firefly及Dragon Protocol等

**该内存模型带来的问题**
现代的处理器使用写缓冲区临时保存向内存写入的数据。写缓冲区可以保证指令流水线持续运行，它可以避免由于处理器停顿下来等待向内存写入数据而产生的延迟。同时，通过以批处理的方式刷新写缓冲区，以及合并写缓冲区中对同一内存地址的多次写，减少对内存总线的占用。虽然写缓冲区有这么多好处，但每个处理器上的写缓冲区，仅仅对它所在的处理器可见。这个特性会对内存操作的执行顺序产生重要的影响：处理器对内存的读/写操作的执行顺序，不一定与内存实际发生的读/写操作顺序一致！
处理器A和处理器B按程序的顺序并行执行内存访问，最终可能得到x=y=0的结果。
处理器A和处理器B可以同时把共享变量写入自己的写缓冲区（A1，B1），然后从内存中读取另一个共享变量（A2，B2），最后才把自己写缓存区中保存的脏数据刷新到内存中（A3，B3）。当以这种时序执行时，程序就可以得到x=y=0的结果。
从内存操作实际发生的顺序来看，直到处理器A执行A3来刷新自己的写缓存区，写操作A1才算真正执行了。虽然处理器A执行内存操作的顺序为：A1→A2，但内存操作实际发生的顺序却是A2→A1。

![](https://upload-images.jianshu.io/upload_images/4222138-3be912b80cb3f99d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/574/format/webp)

**Java内存模型JMM**
JMM定义了Java 虚拟机(JVM)在计算机内存(RAM)中的工作方式。JVM是整个计算机虚拟模型，所以JMM是隶属于JVM的。从抽象的角度来看，JMM定义了线程和主内存之间的抽象关系：线程之间的共享变量存储在主内存（Main Memory）中，每个线程都有一个私有的本地内存（Local Memory），本地内存中存储了该线程以读/写共享变量的副本。本地内存是JMM的一个抽象概念，并不真实存在。它涵盖了缓存、写缓冲区、寄存器以及其他的硬件和编译器优化。

在Java中，所有实例域、静态域和数组元素都存储在堆内存中，堆内存在线程之间共享
（这里用“共享变量”这个术语代指实例域，静态域和数组元素）。局部变量（Local Variables），方法定义参数（Java语言规范称之为Formal Method Parameters）和异常处理器参数（ExceptionHandler Parameters）不会在线程之间共享，它们不会有内存可见性问题，也不受内存模型的影响。
Java线程之间的通信由Java内存模型（本文简称为JMM）控制，JMM决定一个线程对共享
变量的写入何时对另一个线程可见。从抽象的角度来看，JMM定义了线程和主内存之间的抽
象关系：线程之间的共享变量存储在主内存（Main Memory）中，每个线程都有一个私有的本地内存（Local Memory），本地内存中存储了该线程以读/写共享变量的副本。本地内存是JMM的一个抽象概念，并不真实存在。它涵盖了缓存、写缓冲区、寄存器以及其他的硬件和编译器优化。Java内存模型的抽象示意如图
![](https://upload-images.jianshu.io/upload_images/4222138-96ca2a788ec29dc2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/579/format/webp)

如果线程A与线程B之间要通信的话，必须要经历下面2个步骤。
1）线程A把本地内存A中更新过的共享变量刷新到主内存中去。
2）线程B到主内存中去读取线程A之前已更新过的共享变量。


<a id="markdown-1811-java内存模型带来的问题" name="1811-java内存模型带来的问题"></a>
#### 1.8.1.1. Java内存模型带来的问题

**可见性问题**
CPU中运行的线程从主存中拷贝共享对象obj到它的CPU缓存，把对象obj的count变量改为2。但这个变更对运行在右边CPU中的线程不可见，因为这个更改还没有flush到主存中：要解决共享对象可见性这个问题，我们可以使用java volatile关键字或者是加锁

**竞争现象**
线程A和线程B共享一个对象obj。假设线程A从主存读取Obj.count变量到自己的CPU缓存，同时，线程B也读取了Obj.count变量到它的CPU缓存，并且这两个线程都对Obj.count做了加1操作。此时，Obj.count加1操作被执行了两次，不过都在不同的CPU缓存中。如果这两个加1操作是串行执行的，那么Obj.count变量便会在原始值上加2，最终主存中的Obj.count的值会是3。然而下图中两个加1操作是并行的，不管是线程A还是线程B先flush计算结果到主存，最终主存中的Obj.count只会增加1次变成2，尽管一共有两次加1操作。 要解决上面的问题我们可以使用java synchronized代码块。

![](https://upload-images.jianshu.io/upload_images/4222138-58dbd966b4f80fab.png?imageMogr2/auto-orient/)

<a id="markdown-182-重排序" name="182-重排序"></a>
### 1.8.2. 重排序
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1821-基本概念" name="1821-基本概念"></a>
#### 1.8.2.1. 基本概念

* 重排序是指编译器和处理器为了优化程序性能而对指令序列进行重新排序的一种手段。
* 如果两个操作访问同一个变量，且这两个操作中有一个为写操作，此时这两个操作之间就存在数据依赖性
    * 写后读
    * 读后写
    * 写后写
    * 以上对同一个变量的三种操作，只要改变顺序，结果就会不一样，因此存在数据依赖性
* 编译器和处理器可能会对操作做重排序。编译器和处理器在重排序时，会遵守数据依赖性，编译器和处理器不会改变存在数据依赖关系的两个操作的执行顺序。
* 这里所说的数据依赖性仅针对**单个处理器**中执行的指令序列和**单个线程**中执行的操作，**不同处理器**之间和**不同线程**之间的数据依赖性不被编译器和处理器考虑

* 重排序是对内存有关的操作(读写)所做的一种优化，可以在不影响单线程程序的正确性的情况下提升程序的性能。但是可能会对多线程程序的正确执行有影响。


     
* 指令重排序的来源一般有编译器，处理器，和存储子系统(写缓冲，高速缓存)。

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

**as-if-serial语义**
* as-if-serial语义的意思是：不管怎么重排序（编译器和处理器为了提高并行度），（单线程）程序的执行结果不能被改变。编译器、runtime和处理器都必须遵守as-if-serial语义
* 为了遵守as-if-serial语义，编译器和处理器不会对存在数据依赖关系的操作做重排序，因为这种重排序会改变执行结果。但是，如果操作之间不存在数据依赖关系，这些操作就可能被编译器和处理器重排序
* as-if-serial语义把单线程程序保护了起来，遵守as-if-serial语义的编译器、runtime和处理器共同为编写单线程程序的程序员创建了一个幻觉：单线程程序是按程序的顺序来执行的.asif-serial语义使单线程程序员无需担心重排序会干扰他们，也无需担心内存可见性问题

**相关术语**
* 源代码顺序
    * 源代码中指定的内存访问操作顺序
* 程序顺序
    * 在给定的处理器上运行的目标代码(Java的字节码)所指定的访问操作顺序。
* 执行顺序
    * 内存访问操作在给定的处理器上实际执行的顺序
* 感知顺序
    * 最终执行时锁呈现的访问顺序

**重排序类型**


|重排序类型|重排序表现|重排序来源|
|---|---|--|
|指令重排序|程序执行顺序|编译器|
| ^ |执行顺序与程序顺序不一致|JIT编译器，处理器|
|存储子系统重排序|源代码顺序，程序顺序和执行顺序保持一类；感知顺序和执行顺序不一致|高速缓存，写缓冲器|

<a id="markdown-1822-指令重排序" name="1822-指令重排序"></a>
#### 1.8.2.2. 指令重排序

* Java平台包含两种编译器：
    * 静态编译器(Javax)
        * 将Java源码编译为字节码，它是在代码编译阶段介入的
        * 基本上不会执行指令重排序
    * 动态编译器(JIT编译器)
        * 将字节码动态编译为Java虚拟机宿主主机的本地代码(机器码)，它是在运行期介入的
        * 可能会发生指令重排序
    
* 处理器也可能执行指令重排序，这使得执行顺序和程序顺序不一致。现代处理器为了提高指令的执行效率。会进行动态调整，哪条就绪就先执行哪条指令，这就是处理器的乱序执行。
        
<a id="markdown-1823-存储子系统重构排序" name="1823-存储子系统重构排序"></a>
#### 1.8.2.3. 存储子系统重构排序

* 主内存（RAM）相对于处理器是一个慢速设备。因此处理器并不是直接访问主内存，而是通过高速缓存访问主内存。在此基础上，还引入了写缓冲器。先往写缓冲器里写入数据，再一次性写入到主内存中。




<a id="markdown-183-volatile的内存语义" name="183-volatile的内存语义"></a>
### 1.8.3. volatile的内存语义
<a href="#menu" style="float:right">目录</a>

**特性**
* 内存可见性
    * 对一个volatile变量的读，总是能看到（任意线程）对这个volatile变量最后的写入
* 保证变量读写是原子性的
    * 对任意单个volatile变量的读/写具有原子性，但类似于volatile++这种复合操作不具有原子性。
* 禁止指令重排序

有volatile变量修饰的共享变量进行写操作的时候会使用CPU提供的Lock前缀指令：
将当前处理器缓存行的数据写回到系统内存这个写回内存的操作会使在其他CPU里缓存了该内存地址的数据无效。



**volatile写的内存语义如下**
当写一个volatile变量时，JMM会把该线程对应的本地内存中的共享变量值刷新到主内存

<a id="markdown-1831-volatile的定义与实现原理" name="1831-volatile的定义与实现原理"></a>
#### 1.8.3.1. volatile的定义与实现原理
Java语言规范第3版中对volatile的定义如下：Java编程语言允许线程访问共享变量，为了
确保共享变量能被准确和一致地更新，线程应该确保通过排他锁单独获得这个变量。Java语言
提供了volatile，在某些情况下比锁要更加方便。如果一个字段被声明成volatile，Java线程内存模型确保所有线程看到这个变量的值是一致的

**相关的CPU术语与说明**
|术语|英文单词|描述|
|---|---|---|
|内存屏障|memory|是一组处理器指令，用于实现对内存操作的顺序限制|
|缓冲行|cache line|缓存中可以分配的最小存储单位。处理器填写缓存线时会加载整个缓存线，需要使用多个主内存读周期|
|原子操作|atomic operations|不可中断的一个或一系列操作|
|缓存行填充|cache line fill|当处理器识别到从内存中读取操作数是可缓存的，处理器读取整个缓存行到适当的缓存L1 L2 L3的或所有的|
|缓存命中|cache hit | 如果进行高速缓存行填充操作的内存位置仍然是下次处理器访问的地址时，处理器从缓存中读取操作数，而不是从内存中读取|
|写命中|write hit|当处理器将操作数写回到一个内存缓存的区域时，它首先会检查这个缓存的内存地址是否在缓存行中，如果存在一个有效的缓存行，则处理器将这个操作数写回到缓存，而不是写回到内存，这个操作被称为写命中|
|写缺失|write misses the cache|一个有效的缓存行被写入到不存在的内存区域|





<a id="markdown-184-锁的内存语义" name="184-锁的内存语义"></a>
### 1.8.4. 锁的内存语义
<a href="#menu" style="float:right">目录</a>

<a id="markdown-185-final的内存语义" name="185-final的内存语义"></a>
### 1.8.5. final的内存语义
<a href="#menu" style="float:right">目录</a>
编译器和处理器要遵守两个重排序规则：

在构造函数内对一个final域的写入，与随后把这个被构造对象的引用赋值给一个引用变量，这两个操作之间不能重排序。
初次读一个包含final域的对象的引用，与随后初次读这个final域，这两个操作之间不能重排序。

final域为引用类型：

增加了如下规则：在构造函数内对一个final引用的对象的成员域的写入，与随后在构造函数外把这个被构造对象的引用赋值给一个引用变量，这两个操作之间不能重排序。

final语义在处理器中的实现：

会要求编译器在final域的写之后，构造函数return之前插入一个StoreStore障屏。
读final域的重排序规则要求编译器在读final域的操作前面插入一个LoadLoad屏障


<a id="markdown-186-happens-before" name="186-happens-before"></a>
### 1.8.6. happens-before
<a href="#menu" style="float:right">目录</a>

* Happen-before原则
    * 程序顺序规则：一个线程中的每个操作，happens-before于该线程中的任意后续操作。
    * 监视器锁规则：对一个锁的解锁，happens-before于随后对这个锁的加锁。
    * volatile变量规则：对一个volatile域的写，happens-before于任意后续对这个volatile域的读。
    * 传递性：如果A happens-before B，且B happens-before C，那么A happens-before C。
    * start()规则：如果线程A执行操作ThreadB.start()（启动线程B），那么A线程的ThreadB.start()操作happens-before于线程B中的任意操作。
    * Join()规则：如果线程A执行操作ThreadB.join()并成功返回，那么线程B中的任意操作happens-before于线程A从ThreadB.join()操作成功返回。
    * 程序中断规则：对线程interrupted()方法的调用先行于被中断线程的代码检测到中断时间的发生。
    * 对象finalize规则：一个对象的初始化完成（构造函数执行结束）先行于发生它的finalize()方法的开始

<a id="markdown-187-双重检查锁定与延迟初始化" name="187-双重检查锁定与延迟初始化"></a>
### 1.8.7. 双重检查锁定与延迟初始化
<a href="#menu" style="float:right">目录</a>

<a id="markdown-188-java内存模型综述" name="188-java内存模型综述"></a>
### 1.8.8. Java内存模型综述
<a href="#menu" style="float:right">目录</a>


<a id="markdown-19-threadlocal" name="19-threadlocal"></a>
## 1.9. ThreadLocal
<a href="#menu" style="float:right">目录</a>

<a id="markdown-191-基本概念和使用" name="191-基本概念和使用"></a>
### 1.9.1. 基本概念和使用

* 该类提供了线程局部（thread-local）变量。这些变量不同于它们的普通对应物，因为访问某个变量（通过其get或set方法）的每个线程都有自己的局部变量，它独立于变量的初始化副本。ThreadLocal实例通常是类中的private static字段，它们希望将状态与某一个线程（例如，用户ID或事物ID）相关联。

* ThreadLocal是线程私有的，用于变量并发访问带来的安全问题，因此使用场景是对象或者类的属性不需要在多线程间共享，但是需要在单线程环境下多次使用的场景。

* 三个要点：
    * 每个线程都有自己的局部变量
        * 每个线程都有一个独立于其它线程的上下文来保存这个变量，一个线程的本地变量对其它线程是不可见的。
    * 独立于变量的初始化副本
        * ThreadLocal可以给一个初始值，而每个线程都会获得这个初始化值的一个副本，这样才能保证不同的线程都有一份拷贝。
    * 状态与某一个线程相关联
        * ThreadLocal不是用于解决共享变量的问题的，不是为了协调线程同步而存在，而是为了方便每个线程处理自己的状态而引入的一个机制，就像《Thinking in Java》中描述的那样：”它们使得你可以将状态与线程关联起来。“理解这点对正确使用
* 主要方法
    * public T get() 
    * public void set(T value)
    * public void remove() 

* 指定初始值
    * 如果没有初始值，将会返回null
    * 可以继承ThreadLocal并重写initialValue()方法

* **InheritableThreadLocal**
    * ThreadLocal的子类
    * 可以在子线程中获取父线程继承下来的值，该值是创建子线程瞬间父线程中的值，两个值之间是独立，修改不会对对方产生影响

* ThreadLocal使用注意问题
    * 在线程池环境中使用时，由于线程可能不是新创建的，ThreadLocal保留的是上一次使用该线程的任务的值，如果获取到该值，可能就会出现问题。因此每一个线程使用完，应当将其设置为null或者某个初始值，避免污染下一次的任务。
    * 内存泄漏问题，也就是说使用完没有remove.导致垃圾回收时不能被回收

* 优势     
    * ThreadLocal 可以使得线程独有的局部变量，在整个线程存活期间内跨越类和实例的进行使用,等同于为线程内多个实例节点提供了数据bus
    * ThreadLocal 存储的是线程副本，线程消亡后，其内存留的副本数据会随着gc消亡
    * ThreadLocal 从某种角度上来看[线程并发的时候]，是牺牲空间来获取时间的一种操作
    * 能天然解决线程安全问题，因为是依据线程副本进行的保存，所以其保存的局部变量不会被其他线程获取
* 劣势
    * ThreadLocal 占用了内存空间，因为Threadl为每个线程都创建了副本
    * 使用不当会导致内存泄露，尤其是对没有良好编码习惯的人，尤其致命
    * 对线程池[会复用core线程的那种]或者执行耗时较长的线程，慎用！ 

<a id="markdown-192-原理说明" name="192-原理说明"></a>
### 1.9.2. 原理说明

**Thread**
```java
public class Thread{
    ThreadLocal.ThreadLocalMap threadLocals = null;
}
```
ThreadLocal的操作就是对上面的变量进行操作。

**set分析**

```java
public void set(T value) {
    Thread t = Thread.currentThread();
    ThreadLocalMap map = getMap(t);
    if (map != null)
        map.set(this, value);
    else
        createMap(t, value);
}
```
set的过程就是将要设置的值写入到ThreadLocalMap中，不存在则创建一个

```java
void createMap(Thread t, T firstValue) {
    t.threadLocals = new ThreadLocalMap(this, firstValue);
}
```

再来看ThreadLocalMap的构造函数

```java

private Entry[] table;

ThreadLocalMap(ThreadLocal<?> firstKey, Object firstValue) {
    table = new Entry[INITIAL_CAPACITY];
    int i = firstKey.threadLocalHashCode & (INITIAL_CAPACITY - 1);
    table[i] = new Entry(firstKey, firstValue);
    size = 1;
    setThreshold(INITIAL_CAPACITY);
}
static class Entry extends WeakReference<ThreadLocal<?>> {
    /** The value associated with this ThreadLocal. */
    Object value;

    Entry(ThreadLocal<?> k, Object v) {
        super(k);
        value = v;
    }
}
        
```
Entry继承自WeakReference（弱引用，生命周期只能存活到下次GC前），但只有Key是弱引用类型的，Value并非弱引用。key为当前操作的ThreadLocal对象，value为实际存储的值。

**get**
```java
 public T get() {
        Thread t = Thread.currentThread();
        ThreadLocalMap map = getMap(t);
        if (map != null) {
            ThreadLocalMap.Entry e = map.getEntry(this);
            if (e != null) {
                @SuppressWarnings("unchecked")
                T result = (T)e.value;
                return result;
            }
        }
        return setInitialValue();
    }
```
* 获取线程当前的ThreadLocalMap对象
* 获取ThreadLocalMap对象中ThreadLocal对应的Entry
* 从Entry获取保存的value
* 如果不存在则获取初值

**Hash冲突问题解决**
和HashMap的最大的不同在于，ThreadLocalMap结构非常简单，没有next引用，也就是说ThreadLocalMap中解决Hash冲突的方式并非链表的方式，而是采用线性探测的方式，所谓线性探测，就是根据初始key的hashcode值确定元素在table数组中的位置，如果发现这个位置上已经有其他key值的元素被占用，则利用固定的算法寻找一定步长的下个位置，依次判断，直至找到能够存放的位置。
ThreadLocalMap解决Hash冲突的方式就是简单的步长加1或减1，寻找下一个相邻的位置。如果超过阈值，将会进行扩容操作。

```java
private void set(ThreadLocal<?> key, Object value) {

            // We don't use a fast path as with get() because it is at
            // least as common to use set() to create new entries as
            // it is to replace existing ones, in which case, a fast
            // path would fail more often than not.

    Entry[] tab = table;
    int len = tab.length;
    //获取节点位置
    int i = key.threadLocalHashCode & (len-1);

    //查找节点，如果出现Hash冲突，则取下一个节点
    for (Entry e = tab[i];e != null;e = tab[i = nextIndex(i, len)]) {
        ThreadLocal<?> k = e.get();

        //是寻找的节点
        if (k == key) {
            //设置
            e.value = value;
            return;
        }
        //当前位置没有节点
        if (k == null) {
            //设置
            replaceStaleEntry(key, value, i);
            return;
        }
    }

   
    tab[i] = new Entry(key, value);
    int sz = ++size;
    if (!cleanSomeSlots(i, sz) && sz >= threshold){
        //说明已经满了，需要扩容
        rehash();
    }
        
}
private static int nextIndex(int i, int len) {
    return ((i + 1 < len) ? i + 1 : 0);
}
```






<a id="markdown-110-并发容器和框架" name="110-并发容器和框架"></a>
## 1.10. 并发容器和框架
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1101-常见的并发容器" name="1101-常见的并发容器"></a>
### 1.10.1. 常见的并发容器
<a href="#menu" style="float:right">目录</a>

* ConcurrentHashMap
* ConcurrentLinkedDeque
* ConcurrentLinkedQueue
* ConcurrentSkipListMap
* ConcurrentSkipListSet
* CopyOnWriteArrayList
* CopyOnWriteArraySet


<a id="markdown-1102-forkjoin框架" name="1102-forkjoin框架"></a>
### 1.10.2. Fork/Join框架
<a href="#menu" style="float:right">目录</a>

<a id="markdown-11021-基本概念" name="11021-基本概念"></a>
#### 1.10.2.1. 基本概念

Fork/Join框架是Java 7提供的一个用于并行执行任务的框架，是一个把大任务分割成若干个小任务，最终汇总每个小任务结果后得到大任务结果的框架
Fork就是把一个大任务切分为若干子任务并行的执行，Join就是合并这些子任务的执行结果，最后得到这个大任务的结果。比如计算1+2+…+10000，每个子任务分别对1000个数进行求和，最终汇总这10个子任务的结果。

![](https://yqfile.alicdn.com/3fa26593c0270f0ef92dfc9daf3013ca9e29dc7b.png)

<a id="markdown-11022-工作窃取算法" name="11022-工作窃取算法"></a>
#### 1.10.2.2. 工作窃取算法
工作窃取（work-stealing）算法是指某个线程从其他队列里窃取任务来执行。那么，为什么需要使用工作窃取算法呢？ 假如我们需要做一个比较大的任务，可以把这个任务分割为若干互不依赖的子任务，为了减少线程间的竞争，把这些子任务分别放到不同的队列里，并为每个队列创建一个单独的线程来执行队列里的任务，线程和队列一一对应。比如A线程负责处理A队列里的任务。但是，有的线程会先把自己队列里的任务干完，而其他线程对应的队列里还有任务等待处理。干完活的线程与其等着，不如去帮其他线程干活，于是它就去其他线程的队列里窃取一个任务来执行。而在这时它们会访问同一个队列，所以为了减少窃取任务线程和被窃取任务线程之间的竞争，通常会使用双端队列，被窃取任务线程永远从双端队列的头部拿任务执行，而窃取任务的线程永远从双端队列的尾部拿任务执行

* 工作窃取算法的优点：充分利用线程进行并行计算，减少了线程间的竞争。
* 工作窃取算法的缺点：在某些情况下还是存在竞争，比如双端队列里只有一个任务时。并且该算法会消耗了更多的系统资源，比如创建多个线程和多个双端队列。


<a id="markdown-11023-forkjoin框架的设计" name="11023-forkjoin框架的设计"></a>
#### 1.10.2.3. Fork/Join框架的设计

我们已经很清楚Fork/Join框架的需求了，那么可以思考一下，如果让我们来设计一个Fork/Join框架，该如何设计？ 这个思考有助于你理解Fork/Join框架的设计。
* 步骤1 分割任务。首先我们需要有一个fork类来把大任务分割成子任务，有可能子任务还是很大，所以还需要不停地分割，直到分割出的子任务足够小。
* 步骤2 执行任务并合并结果。分割的子任务分别放在双端队列里，然后几个启动线程分别从双端队列里获取任务执行。子任务执行完的结果都统一放在一个队列里，启动一个线程从队列里拿数据，然后合并这些数据。

Fork/Join使用两个类来完成以上两件事情。
* ForkJoinTask：我们要使用ForkJoin框架，必须首先创建一个ForkJoin任务。它提供在任务中执行fork()和join()操作的机制。通常情况下，我们不需要直接继承ForkJoinTask类，只需要继承它的子类，Fork/Join框架提供了以下两个子类
    * RecursiveAction：用于没有返回结果的任务。
    * RecursiveTask：用于有返回结果的任务。
* ForkJoinPool：ForkJoinTask需要通过ForkJoinPool来执行。
    * 任务分割出的子任务会添加到当前工作线程所维护的双端队列中，进入队列的头部。当一个工作线程的队列里暂时没有任务时，它会随机从其他工作线程的队列的尾部获取一个任务。

<a id="markdown-11024-例子" name="11024-例子"></a>
#### 1.10.2.4. 例子

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
<a id="markdown-11025-forkjoin框架的异常处理" name="11025-forkjoin框架的异常处理"></a>
#### 1.10.2.5. Fork/Join框架的异常处理
ForkJoinTask在执行的时候可能会抛出异常，但是我们没办法在主线程里直接捕获异常，所以ForkJoinTask提供了isCompletedAbnormally()方法来检查任务是否已经抛出异常或已经被取消了，并且可以通过ForkJoinTask的getException方法获取异常

```java
if(task.isCompletedAbnormally())
{
    System.out.println(task.getException());
}

```

<a id="markdown-11026-实现原理" name="11026-实现原理"></a>
#### 1.10.2.6. 实现原理 

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

<a id="markdown-111-原子操作类" name="111-原子操作类"></a>
## 1.11. 原子操作类
<a href="#menu" style="float:right">目录</a>



<a id="markdown-1111-cas算法" name="1111-cas算法"></a>
### 1.11.1. CAS算法

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
3. 只能保证一个共享变量的原子操作。可以使用AtomicReference来实现引用对象之间操作的原子性。


<a id="markdown-1112-unsafe类" name="1112-unsafe类"></a>
### 1.11.2. Unsafe类

<a id="markdown-11121-基本概念" name="11121-基本概念"></a>
#### 1.11.2.1. 基本概念

* Java 不能直接访问操作系统底层，而是通过本地方法来访问。Unsafe 类提供了硬件级别的原子操作。
* Unsafe 类在 sun.misc 包下，不属于 Java 标准。很多 Java 的基础类库，包括一些被广泛使用的高性能开发库都是基于 Unsafe 类开发，比如 Netty、Hadoop、Kafka 等。
* Unsafe 是用于在实质上扩展 Java 语言表达能力、便于在更高层（Java 层）代码里实现原本要在更低层（C 层）实现的核心库功能用的。
这些功能包括裸内存的申请/释放/访问，低层硬件的 atomic/volatile 支持，创建未初始化对象等。
* 由于能够直接访问内存，因此会存在误用的问题，它原本的设计就只应该被标准库使用，因此不建议在生产环境中使用


<a id="markdown-11122-获取实例" name="11122-获取实例"></a>
#### 1.11.2.2. 获取实例

Unsafe 对象不能直接通过 new Unsafe() 或调用 Unsafe.getUnsafe() 获取。

Unsafe 被设计成单例模式，构造方法私有。
getUnsafe 被设计成只能从引导类加载器（bootstrap class loader）加载。


```java
private Unsafe() {
}

public static Unsafe getUnsafe() {
        Class var0 = Reflection.getCallerClass(2);
        if (var0.getClassLoader() != null) {
            throw new SecurityException("Unsafe");
        } else {
            return theUnsafe;
        }
}
```

非启动类加载器直接调用 Unsafe.getUnsafe() 方法会抛出 SecurityException 异常。

解决办法有两个。
* 可以令代码 " 受信任 "。运行程序时，通过 JVM 参数设置 bootclasspath 选项，指定系统类路径加上使用的一个 Unsafe 路径。
java -Xbootclasspath:/usr/jdk1.7.0/jre/lib/rt.jar:. com.mishadoff.magic.UnsafeClient
* 通过 Java 反射机制。
通过将 private 单例实例暴力设置 accessible 为 true，然后通过 Field 的 get 方法，直接获取一个 Object 强制转换为 Unsafe。

```java
Field f = Unsafe.class.getDeclaredField("theUnsafe");
f.setAccessible(true);
Unsafe unsafe = (Unsafe) f.get(null);
```

在 IDE 中，这些方法会被标志为 Error，可以通过以下设置解决：

Preferences -> Java -> Compiler -> Errors/Warnings -> Deprecated and restricted API -> Forbidden reference -> Warning



<a id="markdown-11123-常用方法" name="11123-常用方法"></a>
#### 1.11.2.3. 常用方法

Unsafe 的大部分 API 都是 native 的方法。

**Class 相关**

主要提供 Class 和它的静态字段的操作方法。
```java
//静态属性的偏移量，用于在对应的 Class 对象中读写静态属性
public native long staticFieldOffset(Field f);
  
public native Object staticFieldBase(Field f);
//判断是否需要初始化一个类
public native boolean shouldBeInitialized(Class c);
//确保类被初始化
public native void ensureClassInitialized(Class c);
//定义一个类，可用于动态创建类
public native Class defineClass(String name, byte[] b, int off, int len, ClassLoader loader, ProtectionDomain protectionDomain);
//动态创建类
public native Class defineClass(String var1, byte[] var2, int var3, int var4);
//定义一个匿名类，可用于动态创建类
public native Class defineAnonymousClass(Class hostClass, byte[] data, Object[] cpPatches);
```

**Object 相关**

Java 中的基本类型（boolean、byte、char、short、int、long、float、double）及对象引用类型都有以下方法。
```java
//获得对象的字段偏移量 
public native long objectFieldOffset(Field f); 
//获得给定对象地址偏移量的int值
public native int getInt(Object o, long offset);
//设置给定对象地址偏移量的int值
public native void putInt(Object o, long offset, int x);
//获得给定对象地址偏移量的值
public native Object getObject(Object o, long offset);
//设置给定对象地址偏移量的值
public native void putObject(Object o, long offset, Object x);

//创建对象，但并不会调用其构造方法。如果类未被初始化，将初始化类。
public native Object allocateInstance(Class cls) throws InstantiationException;
```

**数组相关**

通过 arrayBaseOffset 和 arrayIndexScale 可定位数组中每个元素在内存中的位置。
```java
//返回数组中第一个元素的偏移地址
public native int arrayBaseOffset(Class arrayClass);
//boolean、byte、short、char、int、long、float、double，及对象类型均有以下方法
/** The value of {@code arrayBaseOffset(boolean[].class)} */
public static final int ARRAY_BOOLEAN_BASE_OFFSET = theUnsafe.arrayBaseOffset(boolean[].class);
  
/**
 * Report the scale factor for addressing elements in the storage
 * allocation of a given array class. However, arrays of "narrow" types
 * will generally not work properly with accessors like {@link
 * #getByte(Object, int)}, so the scale factor for such classes is reported
 * as zero.
 *
 * @see #arrayBaseOffset
 * @see #getInt(Object, long)
 * @see #putInt(Object, long, int)
 */
//返回数组中每一个元素占用的大小
public native int arrayIndexScale(Class arrayClass);
  
//boolean、byte、short、char、int、long、float、double，及对象类型均有以下方法
/** The value of {@code arrayIndexScale(boolean[].class)} */
public static final int ARRAY_BOOLEAN_INDEX_SCALE = theUnsafe.arrayIndexScale(boolean[].class);
```

**CAS 相关**

compareAndSwap，内存偏移地址 offset，预期值 expected，新值 x。如果变量在当前时刻的值和预期值 expected 相等，尝试将变量的值更新为 x。如果更新成功，返回 true；否则，返回 false。
```java
//更新变量值为x，如果当前值为expected
//o：对象 offset：偏移量 expected：期望值 x：新值
public final native boolean compareAndSwapObject(Object o, long offset, Object expected, Object x);
  
public final native boolean compareAndSwapInt(Object o, long offset, int expected, int x);
  
public final native boolean compareAndSwapLong(Object o, long offset, long expected, long x)
```

JDK 1.8 中基于 CAS 扩展。

作用都是，通过 CAS 设置新的值，返回旧的值。
```java
//增加
public final int getAndAddInt(Object o, long offset, int delta) {
 int v;
 do {
 v = getIntVolatile(o, offset);
 } while (!compareAndSwapInt(o, offset, v, v + delta));
 return v;
}
  
public final long getAndAddLong(Object o, long offset, long delta) {
 long v;
 do {
 v = getLongVolatile(o, offset);
 } while (!compareAndSwapLong(o, offset, v, v + delta));
 return v;
}
//设置
public final int getAndSetInt(Object o, long offset, int newValue) {
 int v;
 do {
 v = getIntVolatile(o, offset);
 } while (!compareAndSwapInt(o, offset, v, newValue));
 return v;
}
  
public final long getAndSetLong(Object o, long offset, long newValue) {
 long v;
 do {
 v = getLongVolatile(o, offset);
 } while (!compareAndSwapLong(o, offset, v, newValue));
 return v;
}

public final Object getAndSetObject(Object o, long offset, Object newValue) {
 Object v;
 do {
 v = getObjectVolatile(o, offset);
 } while (!compareAndSwapObject(o, offset, v, newValue));
 return v;
```
**ABA 问题**

在多线程环境中，使用 CAS，如果一个线程对变量修改 2 次，第 2 次修改后的值和第 1 次修改前的值相同，其他线程对此一无所知，这类现象称为 ABA 问题。

ABA 问题可以使用 JDK 并发包中的 AtomicStampedReference 和 AtomicMarkableReference 处理。


AtomicStampedReference 是通过版本号（时间戳）来解决 ABA 问题的，也可以使用版本号（verison）来解决 ABA，即乐观锁每次在执行数据的修改操作时，都带上一个版本号，一旦版本号和数据的版本号一致就可以执行修改操作并对版本号执行 +1 操作，否则执行失败。

AtomicMarkableReference 则是将一个 boolean 值作是否有更改的标记，本质就是它的版本号只有两个，true 和 false，修改的时候在两个版本号之间来回切换，虽然这样做并不能解决 ABA 的问题，但是会降低 ABA 问题发生的几率。



**线程调度相关**

主要包括监视器锁定、解锁等。
```java
//取消阻塞线程
public native void unpark(Object thread);
//阻塞线程
public native void park(boolean isAbsolute, long time);
//获得对象锁
public native void monitorEnter(Object o);
//释放对象锁
public native void monitorExit(Object o);
//尝试获取对象锁，返回 true 或 false 表示是否获取成功
public native boolean tryMonitorEnter(Object o);
```
**volatile 相关读写**
```java
//从对象的指定偏移量处获取变量的引用，使用 volatile 的加载语义
//相当于 getObject(Object, long) 的 volatile 版本
//从主存中获取值
public native Object getObjectVolatile(Object o, long offset);
  
//存储变量的引用到对象的指定的偏移量处，使用 volatile 的存储语义
//相当于 putObject(Object, long, Object) 的 volatile 版本
//设置值刷新主存
public native void putObjectVolatile(Object o, long offset, Object x);
/**
 * Version of {@link #putObjectVolatile(Object, long, Object)}
 * that does not guarantee immediate visibility of the store to
 * other threads. This method is generally only useful if the
 * underlying field is a Java volatile (or if an array cell, one
 * that is otherwise only accessed using volatile accesses).
 */
public native void putOrderedObject(Object o, long offset, Object x);
  
/** Ordered/Lazy version of {@link #putIntVolatile(Object, long, int)} */
public native void putOrderedInt(Object o, long offset, int x);
  
/** Ordered/Lazy version of {@link #putLongVolatile(Object, long, long)} */
public native void putOrderedLong(Object o, long offset, long x);
```

**内存屏障相关**

JDK 1.8 引入 ，用于定义内存屏障，避免代码重排序。
```java
//内存屏障，禁止 load 操作重排序，即屏障前的load操作不能被重排序到屏障后，屏障后的 load 操作不能被重排序到屏障前
public native void loadFence();
//内存屏障，禁止 store 操作重排序，即屏障前的 store 操作不能被重排序到屏障后，屏障后的 store 操作不能被重排序到屏障前
public native void storeFence();
//内存屏障，禁止 load、store 操作重排序
public native void fullFence();
```

**内存管理（非堆内存）**

allocateMemory 所分配的内存需要手动 free（不被 GC 回收）
```java
//（boolean、byte、char、short、int、long、float、double) 都有以下 get、put 两个方法。 
//获得给定地址上的 int 值
public native int getInt(long address);
//设置给定地址上的 int 值
public native void putInt(long address, int x);
//获得本地指针
public native long getAddress(long address);
//存储本地指针到给定的内存地址
public native void putAddress(long address, long x);
  
//分配内存
public native long allocateMemory(long bytes);
//重新分配内存
public native long reallocateMemory(long address, long bytes);
//初始化内存内容
public native void setMemory(Object o, long offset, long bytes, byte value);
//初始化内存内容
public void setMemory(long address, long bytes, byte value) {
 setMemory(null, address, bytes, value);
}
//内存内容拷贝
public native void copyMemory(Object srcBase, long srcOffset, Object destBase, long destOffset, long bytes);
//内存内容拷贝
public void copyMemory(long srcAddress, long destAddress, long bytes) {
 copyMemory(null, srcAddress, null, destAddress, bytes);
}
//释放内存
public native void freeMemory(long address);
```
**系统相关**
```java
//返回指针的大小。返回值为 4 或 8。
public native int addressSize();

/** The value of {@code addressSize()} */
public static final int ADDRESS_SIZE = theUnsafe.addressSize();
  
//内存页的大小。
public native int pageSize();
````
**其他**
```java
//获取系统的平均负载值，loadavg 这个 double 数组将会存放负载值的结果，nelems 决定样本数量，nelems 只能取值为 1 到 3，分别代表最近 1、5、15 分钟内系统的平均负载。
//如果无法获取系统的负载，此方法返回 -1，否则返回获取到的样本数量（loadavg 中有效的元素个数）。
public native int getLoadAverage(double[] loadavg, int nelems);
//绕过检测机制直接抛出异常。
public native void throwException(Throwable ee);
```

<a id="markdown-11124-unsafe-类的使用场景" name="11124-unsafe-类的使用场景"></a>
#### 1.11.2.4. Unsafe 类的使用场景
**避免初始化**

当想要绕过对象构造方法、安全检查器或者没有 public 的构造方法时，allocateInstance() 方法变得非常有用。
编写一个简单的 Java 类。
```java
public class TestA {
    private int a = 0; 

    public TestA() {
        a = 1;
    }

    public int getA() {
        return a;
    }
}

```
构造方法、反射方法和 allocateInstance 方法的不同实现。

将 public 构造方法修改为 private，allocateInstance 方法可以得到同样的结果。

```java

// constructor
TestA constructorA = new TestA();
System.out.println(constructorA.getA()); //print 1

// reflection
try {
     TestA reflectionA = TestA.class.newInstance();
     System.out.println(reflectionA.getA()); //print 1
} catch (InstantiationException e) {
     e.printStackTrace();
} catch (IllegalAccessException e) {
     e.printStackTrace();
}

// unsafe
Field f = null;
try {
     f = Unsafe.class.getDeclaredField("theUnsafe");
     f.setAccessible(true);
     Unsafe unsafe = (Unsafe) f.get(null);
     TestA unsafeA = (TestA) unsafe.allocateInstance(TestA.class);
     System.out.println(unsafeA.getA()); //print 0
} catch (NoSuchFieldException e) {
     e.printStackTrace();
} catch (IllegalAccessException e) {
     e.printStackTrace();
} catch (InstantiationException e) {
     e.printStackTrace();
}
```
**内存修改**

Unsafe 可用于绕过安全的常用技术，直接修改内存变量。

反射也可以实现相同的功能。但是 Unsafe 可以修改任何对象，甚至没有这些对象的引用。


编写一个简单的 Java 类。
```java
public class TestA {

    private int ACCESS_ALLOWED = 1;

    public boolean giveAccess() {
        return 40 == ACCESS_ALLOWED;
    }
}
```

在正常情况下，giveAccess 总会返回 false。

通过计算内存偏移，并使用 putInt() 方法，类的 ACCESS_ALLOWED 被修改。
在已知类结构的时候，数据的偏移总是可以计算出来（与 c++ 中的类中数据的偏移计算是一致的）。


```java
// constructor
TestA constructorA = new TestA();
System.out.println(constructorA.giveAccess()); //print false

// unsafe
Field f = null;
try {
    f = Unsafe.class.getDeclaredField("theUnsafe");
    f.setAccessible(true);
    Unsafe unsafe = (Unsafe) f.get(null);
    TestA unsafeA = (TestA) unsafe.allocateInstance(TestA.class);
    Field unsafeAField = unsafeA.getClass().getDeclaredField("ACCESS_ALLOWED");
    unsafe.putInt(unsafeA, unsafe.objectFieldOffset(unsafeAField), 40); // memory corruption
    System.out.println(unsafeA.giveAccess()); //print true
} catch (NoSuchFieldException e) {
    e.printStackTrace();
} catch (IllegalAccessException e) {
    e.printStackTrace();
} catch (InstantiationException e) {
    e.printStackTrace();
}
```
**动态类**

可以在运行时创建一个类，比如从已编译的 .class 文件中将类内容读取为字节数组，并正确地传递给 defineClass 方法。

当必须动态创建类，而现有代码中有一些代理，这非常有用。


编写一个简单的 Java 类。
```java
public class TestA {

    private int a = 1;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
```

动态创建类。

```java
byte[] classContents = new byte[0];
try {
      classContents = getClassContent();
      Class c = getUnsafe().defineClass(null, classContents, 0, classContents.length);
      System.out.println(c.getMethod("getA").invoke(c.newInstance(), null)); //print 1
} catch (Exception e) {
      e.printStackTrace();
}

private static Unsafe getUnsafe() {
        Field f = null;
        Unsafe unsafe = null;
        try {
            f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            unsafe = (Unsafe) f.get(null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return unsafe;
}

private static byte[] getClassContent() throws Exception {
        File f = new File("/home/test/TestA.class");
        FileInputStream input = new FileInputStream(f);
        byte[] content = new byte[(int) f.length()];
        input.read(content);
        input.close();
        return content;
}
```
**大数组**

Java 数组大小的最大值为 Integer.MAX_VALUE。使用直接内存分配，创建的数组大小受限于堆大小。
Unsafe 分配的内存，分配在非堆内存，因为不执行任何边界检查，所以任何非法访问都可能会导致 JVM 崩溃。

在需要分配大的连续区域、实时编程（不能容忍 JVM 延迟）时，可以使用它。java.nio 使用这一技术。


创建一个 Java 类。
```java
public class SuperArray {

    private final static int BYTE = 1;

    private long size;
    private long address;

    public SuperArray(long size) {
        this.size = size;
        address = getUnsafe().allocateMemory(size * BYTE);
    }

    public void set(long i, byte value) {
        getUnsafe().putByte(address + i * BYTE, value);
    }

    public int get(long idx) {
        return getUnsafe().getByte(address + idx * BYTE);
    }

    public long size() {
        return size;
    }

    private static Unsafe getUnsafe() {
        Field f = null;
        Unsafe unsafe = null;
        try {
            f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            unsafe = (Unsafe) f.get(null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return unsafe;
    }
}

```
使用大数组。
```java
long SUPER_SIZE = (long) Integer.MAX_VALUE * 2;
SuperArray array = new SuperArray(SUPER_SIZE);
System.out.println("Array size:" + array.size()); //print 4294967294
int sum = 0;
for (int i = 0; i < 100; i++) {
     array.set((long) Integer.MAX_VALUE + i, (byte) 3);
     sum += array.get((long) Integer.MAX_VALUE + i);
}
System.out.println("Sum of 100 elements:" + sum);  //print 300
```
**并发应用**
compareAndSwap 方法是原子的，并且可用来实现高性能的、无锁的数据结构。
创建一个 Java 类。
```java
public class CASCounter {

    private volatile long counter = 0;
    private Unsafe unsafe;
    private long offset;

    public CASCounter() throws Exception {
        unsafe = getUnsafe();
        offset = unsafe.objectFieldOffset(CASCounter.class.getDeclaredField("counter"));
    }

    public void increment() {
        long before = counter;
        while (!unsafe.compareAndSwapLong(this, offset, before, before + 1)) {
            before = counter;
        }
    }

    public long getCounter() {
        return counter;
    }

    private static Unsafe getUnsafe() {
        Field f = null;
        Unsafe unsafe = null;
        try {
            f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            unsafe = (Unsafe) f.get(null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return unsafe;
    }
}
````

使用无锁的数据结构。
```java
public static void main(String[] args) {
        final TestB b = new TestB();
        Thread threadA = new Thread(new Runnable() {
            @Override public void run() {
                b.counter.increment();
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override public void run() {
                b.counter.increment();
            }
        });
        Thread threadC = new Thread(new Runnable() {
            @Override public void run() {
                b.counter.increment();
            }
        });
        threadA.start();
        threadB.start();
        threadC.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(b.counter.getCounter()); //print 3
}

private static class TestB {
        private CASCounter counter;

        public TestB() {
            try {
                counter = new CASCounter();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
```
**挂起与恢复**
```java
public native void unpark(Thread jthread);  
public native void park(boolean isAbsolute, long time); // isAbsolute 参数是指明时间是绝对的，还是相对的。
```

将一个线程进行挂起是通过 park 方法实现，调用 park 后，线程将一直阻塞直到超时或者中断等条件出现。
unpark 可以终止一个挂起的线程，使其恢复正常。

整个并发框架中对线程的挂起操作被封装在 LockSupport 类中，LockSupport 类中有各种版本 pack 方法，但最终都调用的 Unsafe.park() 方法。


unpark 函数为线程提供 " 许可（permit）"，线程调用 park 函数则等待 " 许可 "。

这个有点像信号量，但是这个 " 许可 " 不能叠加，是一次性的。

比如线程 B 连续调用了三次 unpark 函数，当线程 A 调用 park 函数就使用掉这个 " 许可 "，如果线程 A 再次调用 park，则进入等待状态。

```java
Thread currThread = Thread.currentThread();
getUnsafe().unpark(currThread);
getUnsafe().unpark(currThread);
getUnsafe().unpark(currThread);

getUnsafe().park(false, 0);
getUnsafe().park(false, 0);
System.out.println("execute success"); // 线程挂起，不会打印。

```
unpark 函数可以先于 park 调用（但最好别这样做），比如线程 B 调用 unpark 函数，给线程 A 发了一个 " 许可 "，那么当线程 A 调用 park 时，发现已经有 " 许可 "，会马上再继续运行。
park 遇到线程终止时，会直接返回（不同于 Thread.sleep，Thread.sleep 遇到 thread.interrupt() 会抛异常）。
unpark 无法恢复处于 sleep 中的线程，只能与 park 配对使用，因为 unpark 发放的许可只有 park 能监听到。

**park 和 unpark 灵活之处**

因为 park 的特性，可以不用担心 park 的时序问题。
park / unpark 模型真正解耦了线程之间的同步，线程之间不再需要一个 Object 或者其它变量来存储状态，不再需要关心对方的状态。




<a id="markdown-1113-原子更新基本类型" name="1113-原子更新基本类型"></a>
### 1.11.3. 原子更新基本类型
<a href="#menu" style="float:right">目录</a>

使用原子的方式更新基本类型，Atomic包提供了以下3个类。
* AtomicBoolean：原子更新布尔类型。
* AtomicInteger：原子更新整型。
* AtomicLong：原子更新长整型

<a id="markdown-1114-原子更新数组" name="1114-原子更新数组"></a>
### 1.11.4. 原子更新数组
<a href="#menu" style="float:right">目录</a>

通过原子的方式更新数组里的某个元素，Atomic包提供了以下4个类。
* AtomicIntegerArray：原子更新整型数组里的元素。
* AtomicLongArray：原子更新长整型数组里的元素。
* AtomicReferenceArray：原子更新引用类型数组里的元素。
* AtomicIntegerArray类主要是提供原子的方式更新数组里的整型


<a id="markdown-1115-原子更新引用类型" name="1115-原子更新引用类型"></a>
### 1.11.5. 原子更新引用类型
<a href="#menu" style="float:right">目录</a>

原子更新基本类型的AtomicInteger，只能更新一个变量，如果要原子更新多个变量，就需要使用这个原子更新引用类型提供的类。Atomic包提供了以下3个类。
* AtomicReference：原子更新引用类型。
* AtomicReferenceFieldUpdater：原子更新引用类型里的字段。
* AtomicMarkableReference：原子更新带有标记位的引用类型。可以原子更新一个布尔类型的标记位和引用类型

<a id="markdown-1116-原子更新字段类" name="1116-原子更新字段类"></a>
### 1.11.6. 原子更新字段类
<a href="#menu" style="float:right">目录</a>

如果需原子地更新某个类里的某个字段时，就需要使用原子更新字段类，Atomic包提供了以下3个类进行原子字段更新。
* AtomicIntegerFieldUpdater：原子更新整型的字段的更新器。
* AtomicLongFieldUpdater：原子更新长整型字段的更新器。
* AtomicStampedReference：原子更新带有版本号的引用类型。该类将整数值与引用关联起来，可用于原子的更新数据和数据的版本号，可以解决使用CAS进行原子更新时可能出现的ABA问题

<a id="markdown-112-future模式" name="112-future模式"></a>
## 1.12. Future模式
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1121-future" name="1121-future"></a>
### 1.12.1. Future

Future就是对于具体的Runnable或者Callable任务的执行结果进行取消、查询是否完成、获取结果。必要时可以通过get方法获取执行结果，该方法会阻塞直到任务返回结果

```java
package java.util.concurrent;

public interface Future<V> {

    boolean cancel(boolean mayInterruptIfRunning);
    boolean isCancelled();
    boolean isDone();
    V get() throws InterruptedException, ExecutionException;
    V get(long timeout, TimeUnit unit)
        throws InterruptedException, ExecutionException, TimeoutException;
}
```

Future只是一个接口，所以是无法直接用来创建对象使用的，因此就有了下面的FutureTask。

<a id="markdown-1122-futuretask" name="1122-futuretask"></a>
### 1.12.2. FutureTask

可以看出RunnableFuture继承了Runnable接口和Future接口，而FutureTask实现了RunnableFuture接口。所以它既可以作为Runnable被线程执行，又可以作为Future得到Callable的返回值

```java

public interface RunnableFuture<V> extends Runnable, Future<V> {
    void run();
}

package java.util.concurrent;
import java.util.concurrent.locks.LockSupport;

public class FutureTask<V> implements RunnableFuture<V> {

    private volatile int state;
    private static final int NEW          = 0;
    private static final int COMPLETING   = 1;
    private static final int NORMAL       = 2;
    private static final int EXCEPTIONAL  = 3;
    private static final int CANCELLED    = 4;
    private static final int INTERRUPTING = 5;
    private static final int INTERRUPTED  = 6;

    public FutureTask(Callable<V> callable) {
    }
    public FutureTask(Runnable runnable, V result) {
    }

    public boolean isCancelled() {
        return state >= CANCELLED;
    }

    public boolean isDone() {
        return state != NEW;
    }

    public boolean cancel(boolean mayInterruptIfRunning) {
        if (!(state == NEW &&
              UNSAFE.compareAndSwapInt(this, stateOffset, NEW,
                  mayInterruptIfRunning ? INTERRUPTING : CANCELLED)))
            return false;
        try {    // in case call to interrupt throws exception
            if (mayInterruptIfRunning) {
                try {
                    Thread t = runner;
                    if (t != null)
                        t.interrupt();
                } finally { // final state
                    UNSAFE.putOrderedInt(this, stateOffset, INTERRUPTED);
                }
            }
        } finally {
            finishCompletion();
        }
        return true;
    }

    /**
     * @throws CancellationException {@inheritDoc}
     */
    public V get() throws InterruptedException, ExecutionException {
        int s = state;
        if (s <= COMPLETING)
            s = awaitDone(false, 0L);
        return report(s);
    }

    /**
     * @throws CancellationException {@inheritDoc}
     */
    public V get(long timeout, TimeUnit unit)
        throws InterruptedException, ExecutionException, TimeoutException {
        if (unit == null)
            throw new NullPointerException();
        int s = state;
        if (s <= COMPLETING &&
            (s = awaitDone(true, unit.toNanos(timeout))) <= COMPLETING)
            throw new TimeoutException();
        return report(s);
    }

   
}


```

**实例**

```java
//第一种方式
//Task为自定义的线程Thread实现类
ExecutorService executor = Executors.newCachedThreadPool();
Task task = new Task();
FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
executor.submit(futureTask);
executor.shutdown();

//第二种方式，注意这种方式和第一种方式效果是类似的，只不过一个使用的是ExecutorService，一个使用的是Thread
Task task = new Task();
FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
Thread thread = new Thread(futureTask);
thread.start();
```

**Future 的局限性**
* 不能手动完成
    * 当你写了一个函数，用于通过一个远程API获取一个电子商务产品最新价格。因为这个 API 太耗时，你把它允许在一个独立的线程中，并且从你的函数中返回一个 Future。现在假设这个API服务宕机了，这时你想通过该产品的最新缓存价格手工完成这个Future 。你会发现无法这样做。
* Future 的结果在非阻塞的情况下，不能执行更进一步的操作
    * Future 不会通知你它已经完成了，它提供了一个阻塞的 get() 方法通知你结果。你无法给 Future 植入一个回调函数，当 Future 结果可用的时候，用该回调函数自动的调用 Future 的结果。
* 多个 Future 不能串联在一起组成链式调用
    * 有时候你需要执行一个长时间运行的计算任务，并且当计算任务完成的时候，你需要把它的计算结果发送给另外一个长时间运行的计算任务等等。你会发现你无法使用 Future 创建这样的一个工作流。
* 不能组合多个 Future 的结果
    * 假设你有10个不同的Future，你想并行的运行，然后在它们运行未完成后运行一些函数。你会发现你也无法使用 Future 这样做。
* 没有异常处理
    * Future API 没有任务的异常处理结构居然有如此多的限制，幸好我们有CompletableFuture，你可以使用 CompletableFuture 达到以上所有目的。


<a id="markdown-1123-completablefuture" name="1123-completablefuture"></a>
### 1.12.3. CompletableFuture

CompletableFuture 实现了 Future 和 CompletionStage接口，并且提供了许多关于创建，链式调用和组合多个 Future 的便利方法集，而且有广泛的异常处理支持



```java
public class CompletableFuture<T> implements Future<T>, CompletionStage<T>{

}
```

<a id="markdown-11231-创建-completablefuture" name="11231-创建-completablefuture"></a>
#### 1.12.3.1. 创建 CompletableFuture
1. 简单的例子
可以使用如下无参构造函数简单的创建 CompletableFuture：

CompletableFuture<String> completableFuture = new CompletableFuture<String>();
这是一个最简单的 CompletableFuture，想获取CompletableFuture 的结果可以使用 CompletableFuture.get() 方法：

String result = completableFuture.get()
get() 方法会一直阻塞直到 Future 完成。因此，以上的调用将被永远阻塞，因为该Future一直不会完成。

你可以使用 CompletableFuture.complete() 手工的完成一个 Future：

completableFuture.complete("Future's Result")
所有等待这个 Future 的客户端都将得到一个指定的结果，并且 completableFuture.complete() 之后的调用将被忽略。

2. 使用 runAsync() 运行异步计算
如果你想异步的运行一个后台任务并且不想改任务返回任务东西，这时候可以使用 CompletableFuture.runAsync()方法，它持有一个Runnable 对象，并返回 CompletableFuture<Void>。

// Run a task specified by a Runnable Object asynchronously.
CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
    @Override
    public void run() {
        // Simulate a long-running Job
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("I'll run in a separate thread than the main thread.");
    }
});

// Block and wait for the future to complete
future.get()
你也可以以 lambda 表达式的形式传入 Runnable 对象：

// Using Lambda Expression
CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
    // Simulate a long-running Job   
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
        throw new IllegalStateException(e);
    }
    System.out.println("I'll run in a separate thread than the main thread.");
});
在本文中，我使用lambda表达式会比较频繁，如果以前你没有使用过，建议你也多使用lambda 表达式。

3. 使用 supplyAsync() 运行一个异步任务并且返回结果
当任务不需要返回任何东西的时候， CompletableFuture.runAsync() 非常有用。但是如果你的后台任务需要返回一些结果应该要怎么样？

CompletableFuture.supplyAsync() 就是你的选择。它持有supplier<T> 并且返回CompletableFuture<T>，T 是通过调用 传入的supplier取得的值的类型。

// Run a task specified by a Supplier object asynchronously
CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
    @Override
    public String get() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        return "Result of the asynchronous computation";
    }
});

// Block and get the result of the Future
String result = future.get();
System.out.println(result);
Supplier<T> 是一个简单的函数式接口，表示supplier的结果。它有一个get()方法，该方法可以写入你的后台任务中，并且返回结果。

你可以使用lambda表达式使得上面的示例更加简明：

// Using Lambda Expression
CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
        throw new IllegalStateException(e);
    }
    return "Result of the asynchronous computation";
});
一个关于Executor 和Thread Pool笔记
你可能想知道，我们知道runAsync() 和supplyAsync()方法在单独的线程中执行他们的任务。但是我们不会永远只创建一个线程。
CompletableFuture可以从全局的 ForkJoinPool.commonPool()获得一个线程中执行这些任务。
但是你也可以创建一个线程池并传给runAsync() 和supplyAsync()方法来让他们从线程池中获取一个线程执行它们的任务。
CompletableFuture API 的所有方法都有两个变体-一个接受Executor作为参数，另一个不这样：
// Variations of runAsync() and supplyAsync() methods
static CompletableFuture<Void>  runAsync(Runnable runnable)
static CompletableFuture<Void>  runAsync(Runnable runnable, Executor executor)
static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier)
static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier, Executor executor)
创建一个线程池，并传递给其中一个方法：

Executor executor = Executors.newFixedThreadPool(10);
CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
        throw new IllegalStateException(e);
    }
    return "Result of the asynchronous computation";
}, executor);

<a id="markdown-11232-在-completablefuture-转换和运行" name="11232-在-completablefuture-转换和运行"></a>
#### 1.12.3.2. 在 CompletableFuture 转换和运行
CompletableFuture.get()方法是阻塞的。它会一直等到Future完成并且在完成后返回结果。
但是，这是我们想要的吗？对于构建异步系统，我们应该附上一个回调给CompletableFuture，当Future完成的时候，自动的获取结果。
如果我们不想等待结果返回，我们可以把需要等待Future完成执行的逻辑写入到回调函数中。

可以使用 thenApply(), thenAccept() 和thenRun()方法附上一个回调给CompletableFuture。

**thenApply()**

可以使用 thenApply() 处理和改变CompletableFuture的结果。持有一个Function<R,T>作为参数。Function<R,T>是一个简单的函数式接口，接受一个T类型的参数，产出一个R类型的结果。

```java
// Create a CompletableFuture
CompletableFuture<String> whatsYourNameFuture = CompletableFuture.supplyAsync(() -> {
   try {
       TimeUnit.SECONDS.sleep(1);
   } catch (InterruptedException e) {
       throw new IllegalStateException(e);
   }
   return "Rajeev";
});

// Attach a callback to the Future using thenApply()
CompletableFuture<String> greetingFuture = whatsYourNameFuture.thenApply(name -> {
   return "Hello " + name;
});

// Block and get the result of the future.
System.out.println(greetingFuture.get()); // Hello Rajeev
```

你也可以通过附加一系列的thenApply()在回调方法 在CompletableFuture写一个连续的转换。这样的话，结果中的一个 thenApply方法就会传递给该系列的另外一个 thenApply方法。
```java
CompletableFuture<String> welcomeText = CompletableFuture.supplyAsync(() -> {
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
       throw new IllegalStateException(e);
    }
    return "Rajeev";
}).thenApply(name -> {
    return "Hello " + name;
}).thenApply(greeting -> {
    return greeting + ", Welcome to the CalliCoder Blog";
});

System.out.println(welcomeText.get());
// Prints - Hello Rajeev, Welcome to the CalliCoder Blog
```
**thenAccept() 和 thenRun()**
如果你不想从你的回调函数中返回任何东西，仅仅想在Future完成后运行一些代码片段，你可以使用thenAccept() 和 thenRun()方法，这些方法经常在调用链的最末端的最后一个回调函数中使用。
CompletableFuture.thenAccept() 持有一个Consumer<T> ，返回一个CompletableFuture<Void>。它可以访问CompletableFuture的结果：
```java
// thenAccept() example
CompletableFuture.supplyAsync(() -> {
    return ProductService.getProductDetail(productId);
}).thenAccept(product -> {
    System.out.println("Got product detail from remote service " + product.getName())
});
```
虽然thenAccept()可以访问CompletableFuture的结果，但thenRun()不能访Future的结果，它持有一个Runnable返回CompletableFuture<Void>：
```java
// thenRun() example
CompletableFuture.supplyAsync(() -> {
    // Run some computation  
}).thenRun(() -> {
    // Computation Finished.
});
```
异步回调方法的笔记
CompletableFuture提供的所有回调方法都有两个变体：
```java
// thenApply() variants
<U> CompletableFuture<U> thenApply(Function<? super T,? extends U> fn)
<U> CompletableFuture<U> thenApplyAsync(Function<? super T,? extends U> fn)
<U> CompletableFuture<U> thenApplyAsync(Function<? super T,? extends U> fn, Executor executor)`
```
这些异步回调变体通过在独立的线程中执行回调任务帮助你进一步执行并行计算。
以下示例：
```java
CompletableFuture.supplyAsync(() -> {
    try {
       TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      throw new IllegalStateException(e);
    }
    return "Some Result"
}).thenApply(result -> {
    /* 
      Executed in the same thread where the supplyAsync() task is executed
      or in the main thread If the supplyAsync() task completes immediately (Remove sleep() call to verify)
    */
    return "Processed Result"
})
```
在以上示例中，在thenApply()中的任务和在supplyAsync()中的任务执行在相同的线程中。任何supplyAsync()立即执行完成,那就是执行在主线程中（尝试删除sleep测试下）。
为了控制执行回调任务的线程，你可以使用异步回调。如果你使用thenApplyAsync()回调，将从ForkJoinPool.commonPool()获取不同的线程执行。

```java
CompletableFuture.supplyAsync(() -> {
    return "Some Result"
}).thenApplyAsync(result -> {
    // Executed in a different thread from ForkJoinPool.commonPool()
    return "Processed Result"
})
```
此外，如果你传入一个Executor到thenApplyAsync()回调中，，任务将从Executor线程池获取一个线程执行。

```java
Executor executor = Executors.newFixedThreadPool(2);
CompletableFuture.supplyAsync(() -> {
    return "Some result"
}).thenApplyAsync(result -> {
    // Executed in a thread obtained from the executor
    return "Processed Result"
}, executor);
```
<a id="markdown-11233-组合两个completablefuture" name="11233-组合两个completablefuture"></a>
#### 1.12.3.3. 组合两个CompletableFuture

**使用 thenCompose() 组合两个独立的future**
假设你想从一个远程API中获取一个用户的详细信息，一旦用户信息可用，你想从另外一个服务中获取他的贷方。
考虑下以下两个方法getUserDetail() 和getCreditRating()的实现：
```java
CompletableFuture<User> getUsersDetail(String userId) {
    return CompletableFuture.supplyAsync(() -> {
        UserService.getUserDetails(userId);
    });    
}

CompletableFuture<Double> getCreditRating(User user) {
    return CompletableFuture.supplyAsync(() -> {
        CreditRatingService.getCreditRating(user);
    });
}
```
现在让我们弄明白当使用了thenApply()后是否会达到我们期望的结果-
```java
CompletableFuture<CompletableFuture<Double>> result = getUserDetail(userId)
.thenApply(user -> getCreditRating(user));
```
在更早的示例中，Supplier函数传入thenApply将返回一个简单的值，但是在本例中，将返回一个CompletableFuture。以上示例的最终结果是一个嵌套的CompletableFuture。
如果你想获取最终的结果给最顶层future，使用 thenCompose()方法代替-
```java
CompletableFuture<Double> result = getUserDetail(userId)
.thenCompose(user -> getCreditRating(user));
```
因此，规则就是-如果你的回调函数返回一个CompletableFuture，但是你想从CompletableFuture链中获取一个直接合并后的结果，这时候你可以使用thenCompose()。

**使用thenCombine()组合两个独立的 future**
虽然thenCompose()被用于当一个future依赖另外一个future的时候用来组合两个future。thenCombine()被用来当两个独立的Future都完成的时候，用来做一些事情。

```java
System.out.println("Retrieving weight.");
CompletableFuture<Double> weightInKgFuture = CompletableFuture.supplyAsync(() -> {
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
       throw new IllegalStateException(e);
    }
    return 65.0;
});

System.out.println("Retrieving height.");
CompletableFuture<Double> heightInCmFuture = CompletableFuture.supplyAsync(() -> {
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
       throw new IllegalStateException(e);
    }
    return 177.8;
});

System.out.println("Calculating BMI.");
CompletableFuture<Double> combinedFuture = weightInKgFuture
        .thenCombine(heightInCmFuture, (weightInKg, heightInCm) -> {
    Double heightInMeter = heightInCm/100;
    return weightInKg/(heightInMeter*heightInMeter);
});

System.out.println("Your BMI is - " + combinedFuture.get());
```
当两个Future都完成的时候，传给``thenCombine()的回调函数将被调用。

<a id="markdown-11234-组合多个completablefuture" name="11234-组合多个completablefuture"></a>
#### 1.12.3.4. 组合多个CompletableFuture
我们使用thenCompose() 和 thenCombine()把两个CompletableFuture组合在一起。现在如果你想组合任意数量的CompletableFuture，应该怎么做？我们可以使用以下两个方法组合任意数量的CompletableFuture。
```java
static CompletableFuture<Void> allOf(CompletableFuture<?>... cfs)
static CompletableFuture<Object> anyOf(CompletableFuture<?>... cfs)
```
**CompletableFuture.allOf()**
CompletableFuture.allOf的使用场景是当你一个列表的独立future，并且你想在它们都完成后并行的做一些事情。

假设你想下载一个网站的100个不同的页面。你可以串行的做这个操作，但是这非常消耗时间。因此你想写一个函数，传入一个页面链接，返回一个CompletableFuture，异步的下载页面内容。

```java
CompletableFuture<String> downloadWebPage(String pageLink) {
    return CompletableFuture.supplyAsync(() -> {
        // Code to download and return the web page's content
    });
} 
```
现在，当所有的页面已经下载完毕，你想计算包含关键字CompletableFuture页面的数量。可以使用CompletableFuture.allOf()达成目的。

```java
List<String> webPageLinks = Arrays.asList(...)    // A list of 100 web page links

// Download contents of all the web pages asynchronously
List<CompletableFuture<String>> pageContentFutures = webPageLinks.stream()
        .map(webPageLink -> downloadWebPage(webPageLink))
        .collect(Collectors.toList());


// Create a combined Future using allOf()
CompletableFuture<Void> allFutures = CompletableFuture.allOf(
        pageContentFutures.toArray(new CompletableFuture[pageContentFutures.size()])
);
```
使用CompletableFuture.allOf()的问题是它返回CompletableFuture<Void>。但是我们可以通过写一些额外的代码来获取所有封装的CompletableFuture结果。
```java
// When all the Futures are completed, call `future.join()` to get their results and collect the results in a list -
CompletableFuture<List<String>> allPageContentsFuture = allFutures.thenApply(v -> {
   return pageContentFutures.stream()
           .map(pageContentFuture -> pageContentFuture.join())
           .collect(Collectors.toList());
});
```
花一些时间理解下以上代码片段。当所有future完成的时候，我们调用了future.join()，因此我们不会在任何地方阻塞。

join()方法和get()方法非常类似，这唯一不同的地方是如果最顶层的CompletableFuture完成的时候发生了异常，它会抛出一个未经检查的异常。

现在让我们计算包含关键字页面的数量。

```java
// Count the number of web pages having the "CompletableFuture" keyword.
CompletableFuture<Long> countFuture = allPageContentsFuture.thenApply(pageContents -> {
    return pageContents.stream()
            .filter(pageContent -> pageContent.contains("CompletableFuture"))
            .count();
});

System.out.println("Number of Web Pages having CompletableFuture keyword - " + 
        countFuture.get());
```
**CompletableFuture.anyOf()**

CompletableFuture.anyOf()和其名字介绍的一样，当任何一个CompletableFuture完成的时候【相同的结果类型】，返回一个新的CompletableFuture。以下示例：

```java
CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
    try {
        TimeUnit.SECONDS.sleep(2);
    } catch (InterruptedException e) {
       throw new IllegalStateException(e);
    }
    return "Result of Future 1";
});

CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
       throw new IllegalStateException(e);
    }
    return "Result of Future 2";
});

CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
    try {
        TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
       throw new IllegalStateException(e);
    }
    return "Result of Future 3";
});

CompletableFuture<Object> anyOfFuture = CompletableFuture.anyOf(future1, future2, future3);

System.out.println(anyOfFuture.get()); // Result of Future 2
```

在以上示例中，当三个中的任何一个CompletableFuture完成， anyOfFuture就会完成。因为future2的休眠时间最少，因此她最先完成，最终的结果将是future2的结果。

CompletableFuture.anyOf()传入一个Future可变参数，返回CompletableFuture<Object>。CompletableFuture.anyOf()的问题是如果你的CompletableFuture返回的结果是不同类型的，这时候你讲会不知道你最终CompletableFuture是什么类型。

<a id="markdown-11235-completablefuture-异常处理" name="11235-completablefuture-异常处理"></a>
#### 1.12.3.5. CompletableFuture 异常处理
我们探寻了怎样创建CompletableFuture，转换它们，并组合多个CompletableFuture。现在让我们弄明白当发生错误的时候我们应该怎么做。

首先让我们明白在一个回调链中错误是怎么传递的。思考下以下回调链：
```java
CompletableFuture.supplyAsync(() -> {
    // Code which might throw an exception
    return "Some result";
}).thenApply(result -> {
    return "processed result";
}).thenApply(result -> {
    return "result after further processing";
}).thenAccept(result -> {
    // do something with the final result
});
```
如果在原始的supplyAsync()任务中发生一个错误，这时候没有任何thenApply会被调用并且future将以一个异常结束。如果在第一个thenApply发生错误，这时候第二个和第三个将不会被调用，同样的，future将以异常结束。

**使用 exceptionally() 回调处理异常**
exceptionally()回调给你一个从原始Future中生成的错误恢复的机会。你可以在这里记录这个异常并返回一个默认值。
```java
Integer age = -1;

CompletableFuture<String> maturityFuture = CompletableFuture.supplyAsync(() -> {
    if(age < 0) {
        throw new IllegalArgumentException("Age can not be negative");
    }
    if(age > 18) {
        return "Adult";
    } else {
        return "Child";
    }
}).exceptionally(ex -> {
    System.out.println("Oops! We have an exception - " + ex.getMessage());
    return "Unknown!";
});

System.out.println("Maturity : " + maturityFuture.get()); 
```

**使用 handle() 方法处理异常**
API提供了一个更通用的方法 - handle()从异常恢复，无论一个异常是否发生它都会被调用。
```java
Integer age = -1;

CompletableFuture<String> maturityFuture = CompletableFuture.supplyAsync(() -> {
    if(age < 0) {
        throw new IllegalArgumentException("Age can not be negative");
    }
    if(age > 18) {
        return "Adult";
    } else {
        return "Child";
    }
}).handle((res, ex) -> {
    if(ex != null) {
        System.out.println("Oops! We have an exception - " + ex.getMessage());
        return "Unknown!";
    }
    return res;
});

System.out.println("Maturity : " + maturityFuture.get());
```

如果异常发生，res参数将是 null，否则，ex将是 null。创建 CompletableFuture


<a id="markdown-113-并发工具类" name="113-并发工具类"></a>
## 1.13. 并发工具类
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1131-等待多线程完成的countdownlatch" name="1131-等待多线程完成的countdownlatch"></a>
### 1.13.1. 等待多线程完成的CountDownLatch
<a href="#menu" style="float:right">目录</a>

<a id="markdown-11311-基本概念" name="11311-基本概念"></a>
#### 1.13.1.1. 基本概念

CountDownLatch允许一个或多个线程等待其他线程完成操作。
* 计数器必须大于等于0，只是等于0时候，计数器就是零，调用await方法时不会阻塞当前线程。
* CountDownLatch不可能重新初始化或者修改CountDownLatch对象的内部计数器的值。
* 一个线程调用countDown方法happen-before，另外一个线程调用await方法。

```java
CountDownLatch(int count) //实例化一个倒计数器，count指定计数个数
countDown() // 计数减一
await() //等待，当计数减到0时，所有线程并行执行
```

<a id="markdown-11312-实现原理" name="11312-实现原理"></a>
#### 1.13.1.2. 实现原理

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

<a id="markdown-1132-同步屏障cyclicbarrier" name="1132-同步屏障cyclicbarrier"></a>
### 1.13.2. 同步屏障CyclicBarrier
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


<a id="markdown-11321-实现原理" name="11321-实现原理"></a>
#### 1.13.2.1. 实现原理

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
<a id="markdown-1133-控制并发线程数的semaphore" name="1133-控制并发线程数的semaphore"></a>
### 1.13.3. 控制并发线程数的Semaphore
<a href="#menu" style="float:right">目录</a>


<a id="markdown-11331-基本概念" name="11331-基本概念"></a>
#### 1.13.3.1. 基本概念

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


<a id="markdown-11332-实现原理" name="11332-实现原理"></a>
#### 1.13.3.2. 实现原理


<a id="markdown-1134-线程间交换数据的exchanger" name="1134-线程间交换数据的exchanger"></a>
### 1.13.4. 线程间交换数据的Exchanger
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

<a id="markdown-1135-futuretask" name="1135-futuretask"></a>
### 1.13.5. FutureTask
<a href="#menu" style="float:right">目录</a>

<a id="markdown-11351-callable与runnable" name="11351-callable与runnable"></a>
#### 1.13.5.1. Callable与Runnable

先说一下java.lang.Runnable吧，它是一个接口，在它里面只声明了一个run()方法：

```java
public interface Runnable {
    public abstract void run();
}
```
由于run()方法返回值为void类型，所以在执行完任务之后无法返回任何结果。

　　Callable位于java.util.concurrent包下，它也是一个接口，在它里面也只声明了一个方法，只不过这个方法叫做call()：
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
```
可以看到，这是一个泛型接口，call()函数返回的类型就是传递进来的V类型。

那么怎么使用Callable呢？一般情况下是配合ExecutorService来使用的，在ExecutorService接口中声明了若干个submit方法的重载版本：

```java
<T> Future<T> submit(Callable<T> task);
<T> Future<T> submit(Runnable task, T result);
Future<?> submit(Runnable task);
```
第一个submit方法里面的参数类型就是Callable。

暂时只需要知道Callable一般是和ExecutorService配合来使用的，具体的使用方法讲在后面讲述。

一般情况下我们使用第一个submit方法和第三个submit方法，第二个submit方法很少使用。

<a id="markdown-11352-future" name="11352-future"></a>
#### 1.13.5.2. Future
Future就是对于具体的Runnable或者Callable任务的执行结果进行取消、查询是否完成、获取结果。必要时可以通过get方法获取执行结果，该方法会阻塞直到任务返回结果。

Future类位于java.util.concurrent包下，它是一个接口：

```java
public interface Future<V> {
    boolean cancel(boolean mayInterruptIfRunning);
    boolean isCancelled();
    boolean isDone();
    V get() throws InterruptedException, ExecutionException;
    V get(long timeout, TimeUnit unit)
        throws InterruptedException, ExecutionException, TimeoutException;
}
```
 在Future接口中声明了5个方法，下面依次解释每个方法的作用：
* cancel方法用来取消任务，如果取消任务成功则返回true，如果取消任务失败则返回false。参数mayInterruptIfRunning表示是否允许取消正在执行却没有执行完毕的任务，如果设置true，则表示可以取消正在执行过程中的任务。如果任务已经完成，则无论mayInterruptIfRunning为true还是false，此方法肯定返回false，即如果取消已经完成的任务会返回false；如果任务正在执行，若mayInterruptIfRunning设置为true，则返回true，若mayInterruptIfRunning设置为false，则返回false；如果任务还没有执行，则无论mayInterruptIfRunning为true还是false，肯定返回true。
* isCancelled方法表示任务是否被取消成功，如果在任务正常完成前被取消成功，则返回 true。
* isDone方法表示任务是否已经完成，若任务完成，则返回true；
* get()方法用来获取执行结果，这个方法会产生阻塞，会一直等到任务执行完毕才返回；
* get(long timeout, TimeUnit unit)用来获取执行结果，如果在指定时间内，还没获取到结果，就直接返回null。

也就是说Future提供了三种功能：
1）判断任务是否完成；
2）能够中断任务；
3）能够获取任务执行结果。

因为Future只是一个接口，所以是无法直接用来创建对象使用的，因此就有了下面的FutureTask。

<a id="markdown-11353-futuretask" name="11353-futuretask"></a>
#### 1.13.5.3. FutureTask

我们先来看一下FutureTask的实现
```java
public class FutureTask<V> implements RunnableFuture<V>
```

FutureTask类实现了RunnableFuture接口，我们看一下RunnableFuture接口的实现：

```java
public interface RunnableFuture<V> extends Runnable, Future<V> {
    void run();
}
```
 　　可以看出RunnableFuture继承了Runnable接口和Future接口，而FutureTask实现了RunnableFuture接口。所以它既可以作为Runnable被线程执行，又可以作为Future得到Callable的返回值。

　　FutureTask提供了2个构造器：
```java
public FutureTask(Callable<V> callable) {
}
public FutureTask(Runnable runnable, V result) {
}
```
事实上，FutureTask是Future接口的一个唯一实现类。

<a id="markdown-11354-使用示例" name="11354-使用示例"></a>
#### 1.13.5.4. 使用示例

1.使用Callable+Future获取执行结果

```java
public class Test {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Task task = new Task();
        Future<Integer> result = executor.submit(task);
        executor.shutdown();
         
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
         
        System.out.println("主线程在执行任务");
         
        try {
            System.out.println("task运行结果"+result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
         
        System.out.println("所有任务执行完毕");
    }
}
class Task implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        System.out.println("子线程在进行计算");
        Thread.sleep(3000);
        int sum = 0;
        for(int i=0;i<100;i++)
            sum += i;
        return sum;
    }
}
```

2.使用Callable+FutureTask获取执行结果

```java
public class Test {
    public static void main(String[] args) {
        //第一种方式
        ExecutorService executor = Executors.newCachedThreadPool();
        Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
        executor.submit(futureTask);
        executor.shutdown();
         
        //第二种方式，注意这种方式和第一种方式效果是类似的，只不过一个使用的是ExecutorService，一个使用的是Thread
        /*Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
        Thread thread = new Thread(futureTask);
        thread.start();*/
         
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
         
        System.out.println("主线程在执行任务");
         
        try {
            System.out.println("task运行结果"+futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
         
        System.out.println("所有任务执行完毕");
    }
}
class Task implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        System.out.println("子线程在进行计算");
        Thread.sleep(3000);
        int sum = 0;
        for(int i=0;i<100;i++)
            sum += i;
        return sum;
    }
}
```
如果为了可取消性而使用 Future 但又不提供可用的结果，则可以声明 Future<?> 形式类型、并返回 null 作为底层任务的结果。


<a id="markdown-114-线程池" name="114-线程池"></a>
## 1.14. 线程池
<a href="#menu" style="float:right">目录</a>

**线程池好处**
* 第一：降低资源消耗。通过重复利用已创建的线程降低线程创建和销毁造成的消耗。
* 第二：提高响应速度。当任务到达时，任务可以不需要等到线程创建就能立即执行。
* 第三：提高线程的可管理性。线程是稀缺资源，如果无限制地创建，不仅会消耗系统资源，还会降低系统的稳定性，使用线程池可以进行统一分配、调优和监控。但是，要做到合理利用线程池，必须对其实现原理了如指掌。

<a id="markdown-1141-线程池的实现原理" name="1141-线程池的实现原理"></a>
### 1.14.1. 线程池的实现原理
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



<a id="markdown-1142-线程池的使用" name="1142-线程池的使用"></a>
### 1.14.2. 线程池的使用

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

<a id="markdown-1143-提交任务" name="1143-提交任务"></a>
### 1.14.3. 提交任务

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
<a id="markdown-1144-关闭线程池" name="1144-关闭线程池"></a>
### 1.14.4. 关闭线程池

可以通过调用线程池的shutdown或shutdownNow方法来关闭线程池。它们的原理是遍历线程池中的工作线程，然后逐个调用线程的interrupt方法来中断线程，所以无法响应中断的任务可能永远无法终止。但是它们存在一定的区别，shutdownNow首先将线程池的状态设置成STOP，然后尝试停止所有的正在执行或暂停任务的线程，并返回等待执行任务的列表，而shutdown只是将线程池的状态设置成SHUTDOWN状态，然后中断所有没有正在执行任务的线程。
只要调用了这两个关闭方法中的任意一个，isShutdown方法就会返回true。当所有的任务都已关闭后，才表示线程池关闭成功，这时调用isTerminaed方法会返回true。至于应该调用哪一种方法来关闭线程池，应该由提交到线程池的任务特性决定，通常调用shutdown方法来关闭线程池，如果任务不一定要执行完，则可以调用shutdownNow方法。

<a id="markdown-1145-合理地配置线程池" name="1145-合理地配置线程池"></a>
### 1.14.5. 合理地配置线程池

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

<a id="markdown-1146-线程池的监控" name="1146-线程池的监控"></a>
### 1.14.6. 线程池的监控
如果在系统中大量使用线程池，则有必要对线程池进行监控，方便在出现问题时，可以根据线程池的使用状况快速定位问题。可以通过线程池提供的参数进行监控，在监控线程池的时候可以使用以下属性。
* taskCount：线程池需要执行的任务数量。
* completedTaskCount：线程池在运行过程中已完成的任务数量，小于或等于taskCount。
* largestPoolSize：线程池里曾经创建过的最大线程数量。通过这个数据可以知道线程池是否曾经满过。如该数值等于线程池的最大大小，则表示线程池曾经满过。
* getPoolSize：线程池的线程数量。如果线程池不销毁的话，线程池里的线程不会自动销毁，所以这个大小只增不减。
* getActiveCount：获取活动的线程数。

通过扩展线程池进行监控。可以通过继承线程池来自定义线程池，重写线程池的beforeExecute、afterExecute和terminated方法，也可以在任务执行前、执行后和线程池关闭前执行一些代码来进行监控。例如，监控任务的平均执行时间、最大执行时间和最小执行时间等。

**线程池泄漏**
避免线程池任务长时间阻塞，导致可运行的线程数目越来越少。



<a id="markdown-115-executor框架" name="115-executor框架"></a>
## 1.15. Executor框架
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1151-executor体系" name="1151-executor体系"></a>
### 1.15.1. Executor体系

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

<a id="markdown-1152-executors" name="1152-executors"></a>
### 1.15.2. Executors
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


<a id="markdown-116-并发编程实战" name="116-并发编程实战"></a>
## 1.16. 并发编程实战
<a href="#menu" style="float:right">目录</a>


<a id="markdown-117-队列" name="117-队列"></a>
## 1.17. 队列
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1171-jdk队列概述" name="1171-jdk队列概述"></a>
### 1.17.1. JDK队列概述
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

  

<a id="markdown-1172-delayedworkqueue" name="1172-delayedworkqueue"></a>
### 1.17.2. DelayedWorkQueue
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


<a id="markdown-2-spring-体系" name="2-spring-体系"></a>
# 2. Spring 体系

<a id="markdown-21-spring" name="21-spring"></a>
## 2.1. Spring
<a href="#menu" style="float:right">目录</a>

<a id="markdown-211-ioc容器" name="211-ioc容器"></a>
### 2.1.1. IOC容器
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2111-控制反转和依赖注入" name="2111-控制反转和依赖注入"></a>
#### 2.1.1.1. 控制反转和依赖注入
<a href="#menu" style="float:right">目录</a>

**IoC是什么**
　　Ioc—Inversion of Control，即“控制反转”，不是什么技术，而是一种设计思想。在Java开发中，Ioc意味着将你设计好的对象交给容器控制，而不是传统的在你的对象内部直接控制。如何理解好Ioc呢？理解好Ioc的关键是要明确“谁控制谁，控制什么，为何是反转（有反转就应该有正转了），哪些方面反转了”，那我们来深入分析一下：
* 谁控制谁，控制什么：传统Java SE程序设计，我们直接在对象内部通过new进行创建对象，是程序主动去创建依赖对象；而IoC是有专门一个容器来创建这些对象，即由Ioc容器来控制对 象的创建；谁控制谁？当然是IoC 容器控制了对象；控制什么？那就是主要控制了外部资源获取（不只是对象包括比如文件等）。
* 为何是反转，哪些方面反转了：有反转就有正转，传统应用程序是由我们自己在对象中主动控制去直接获取依赖对象，也就是正转；而反转则是由容器来帮忙创建及注入依赖对象；为何是反转？因为由容器帮我们查找及注入依赖对象，对象只是被动的接受依赖对象，所以是反转；哪些方面反转了？依赖对象的获取被反转了。

**IoC能做什么**
　　IoC 不是一种技术，只是一种思想，一个重要的面向对象编程的法则，它能指导我们如何设计出松耦合、更优良的程序。传统应用程序都是由我们在类内部主动创建依赖对象，从而导致类与类之间高耦合，难于测试；有了IoC容器后，把创建和查找依赖对象的控制权交给了容器，由容器进行注入组合对象，所以对象与对象之间是 松散耦合，这样也方便测试，利于功能复用，更重要的是使得程序的整个体系结构变得非常灵活。
其实IoC对编程带来的最大改变不是从代码上，而是从思想上，发生了“主从换位”的变化。应用程序原本是老大，要获取什么资源都是主动出击，但是在IoC/DI思想中，应用程序就变成被动的了，被动的等待IoC容器来创建并注入它所需要的资源了。

IoC很好的体现了面向对象设计法则之一—— 好莱坞法则：“别找我们，我们找你”；即由IoC容器帮对象找相应的依赖对象并注入，而不是由对象主动去找。

**IoC和DI**
　　DI—Dependency Injection，即“依赖注入”：组件之间依赖关系由容器在运行期决定，形象的说，即由容器动态的将某个依赖关系注入到组件之中。依赖注入的目的并非为软件系统带来更多功能，而是为了提升组件重用的频率，并为系统搭建一个灵活、可扩展的平台。通过依赖注入机制，我们只需要通过简单的配置，而无需任何代码就可指定目标需要的资源，完成自身的业务逻辑，而不需要关心具体的资源来自何处，由谁实现。

理解DI的关键是：“谁依赖谁，为什么需要依赖，谁注入谁，注入了什么”，那我们来深入分析一下：
* 谁依赖于谁：当然是应用程序依赖于IoC容器；
* 为什么需要依赖：应用程序需要IoC容器来提供对象需要的外部资源；
* 谁注入谁：很明显是IoC容器注入应用程序某个对象，应用程序依赖的对象；
* 注入了什么：就是注入某个对象所需要的外部资源（包括对象、资源、常量数据）。

IoC和DI由什么关系呢？其实它们是同一个概念的不同角度描述，由于控制反转概念比较含糊（可能只是理解为容器控制对象这一个层面，很难让人想到谁来维护对象关系），所以2004年大师级人物Martin Fowler又给出了一个新的名字：“依赖注入”，相对IoC 而言，“依赖注入”明确描述了“被注入对象依赖IoC容器配置依赖对象”。


**IoC(控制反转)**
　　首先想说说IoC（Inversion of Control，控制反转）。这是spring的核心，贯穿始终。所谓IoC，对于spring框架来说，就是由spring来负责控制对象的生命周期和对象间的关系。这是什么意思呢，举个简单的例子，我们是如何找女朋友的？常见的情况是，我们到处去看哪里有长得漂亮身材又好的mm，然后打听她们的兴趣爱好、qq号、电话号、ip号、iq号………，想办法认识她们，投其所好送其所要，然后嘿嘿……这个过程是复杂深奥的，我们必须自己设计和面对每个环节。传统的程序开发也是如此，在一个对象中，如果要使用另外的对象，就必须得到它（自己new一个，或者从JNDI中查询一个），使用完之后还要将对象销毁（比如Connection等），对象始终会和其他的接口或类藕合起来。

　　那么IoC是如何做的呢？有点像通过婚介找女朋友，在我和女朋友之间引入了一个第三者：婚姻介绍所。婚介管理了很多男男女女的资料，我可以向婚介提出一个列表，告诉它我想找个什么样的女朋友，比如长得像李嘉欣，身材像林熙雷，唱歌像周杰伦，速度像卡洛斯，技术像齐达内之类的，然后婚介就会按照我们的要求，提供一个mm，我们只需要去和她谈恋爱、结婚就行了。简单明了，如果婚介给我们的人选不符合要求，我们就会抛出异常。整个过程不再由我自己控制，而是有婚介这样一个类似容器的机构来控制。Spring所倡导的开发方式就是如此，所有的类都会在spring容器中登记，告诉spring你是个什么东西，你需要什么东西，然后spring会在系统运行到适当的时候，把你要的东西主动给你，同时也把你交给其他需要你的东西。所有的类的创建、销毁都由 spring来控制，也就是说控制对象生存周期的不再是引用它的对象，而是spring。对于某个具体的对象而言，以前是它控制其他对象，现在是所有对象都被spring控制，所以这叫控制反转。

**DI(依赖注入)**
　　IoC的一个重点是在系统运行中，动态的向某个对象提供它所需要的其他对象。这一点是通过DI（Dependency Injection，依赖注入）来实现的。比如对象A需要操作数据库，以前我们总是要在A中自己编写代码来获得一个Connection对象，有了 spring我们就只需要告诉spring，A中需要一个Connection，至于这个Connection怎么构造，何时构造，A不需要知道。在系统运行时，spring会在适当的时候制造一个Connection，然后像打针一样，注射到A当中，这样就完成了对各个对象之间关系的控制。A需要依赖 Connection才能正常运行，而这个Connection是由spring注入到A中的，依赖注入的名字就这么来的。那么DI是如何实现的呢？ Java 1.3之后一个重要特征是反射（reflection），它允许程序在运行的时候动态的生成对象、执行对象的方法、改变对象的属性，spring就是通过反射来实现注入的。

<a id="markdown-2112-注入方式" name="2112-注入方式"></a>
#### 2.1.1.2. 注入方式

<a id="markdown-21121-setter注入与构造方法注入" name="21121-setter注入与构造方法注入"></a>
##### 2.1.1.2.1. setter注入与构造方法注入
spring的两种依赖注入方式：setter注入与构造方法注入，这两种方法的不同主要就是在xml文件下对应使用property和constructor-arg属性。

```java
public class Id {  
    private int id;  
    private String name;  
    public Id(int id,String name){  
        this.id = id;  
        this.name = name;  
    }  
    public int getId() {  
        return id;  
    }  
    public void setId(int id) {  
        this.id = id;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
}  

```

注入例子
```xml
<bean id="id" class="com.loster.li.Id">  
    <property name="id" value="123"></property>  
    <property name="name" value="xiaoli"></property>  
</bean>  
<bean id="id" class="com.loster.li.Id">  
    <constructor-arg index="0" value="456"></constructor-arg>  
    <constructor-arg index="1" value="dawang"></constructor-arg>  
</bean>
```

**区别**
* setter方式
    * 设值注入需要该Bean包含这些属性的setter方法
    * 与传统的JavaBean的写法更相似，程序开发人员更容易理解、接收。通过setter方法设定依赖关系显得更加只管。
    * 对于复杂的依赖关系，如果采用构造注入，会导致构造器国语臃肿，难以阅读。Spring在创建Bean实例时，需要同时实例化器依赖的全部实例，因而导致性能下降。而使用设值注入，则能避免这些问题
    * 尤其是在某些属性可选的情况况下，多参数的构造器显得更加笨重
* 构造函数注入
    * 构造注入需要该Bean包含带有这些属性的构造器
    * 构造注入可以在构造器中决定依赖关系的注入顺序，优先依赖的优先注入。例如，组件中其他依赖关系的注入，常常要依赖于DataSrouce的注入。采用构造注入，可以在代码中清晰的决定注入顺序。
    * 对于依赖关系无需变化的Bean，构造注入更有用处。因为没有Setter方法，所有的依赖关系全部在构造器内设定。因此，无需担心后续的代码对依赖关系产生破坏。
    * 依赖关系只能在构造器中设定，则只有组件的创建者才能改变组件的依赖关系。对组件的调用者而言，组件内部的依赖关系完全透明，更符合高内聚的原则。

* 建议：采用以设值注入为主，构造注入为辅的注入策略。对于依赖关系无需变化的注入，尽量采用构造注入；而其他的依赖关系的注入，则考虑采用设值注入

**循环依赖问题**
所谓的循环依赖是指，A 依赖 B，B 又依赖 A，它们之间形成了循环依赖。或者是 A 依赖 B，B 依赖 C，C 又依赖 A

* 构造器参数循环依赖
    * 表示通过构造器注入构成的循环依赖，此依赖是无法解决的，只能抛出BeanCurrentlyIn CreationException异常表示循环依赖 
    * 因为循环依赖的问题，构造器注入的对象没有创建，构造器就无法执行，自己本身也就无法创建，那么另一个对象也无法创建。
* setter方式单例，默认方
    * 也是使用该方式解决循环依赖问题
    * 使用setter注入时，两个对象已经创建完成，就不会出现构造器循环依赖的问题

* setter方式原型，prototype
    * 对于"prototype"作用域bean，Spring容器无法完成依赖注入，因为Spring容器不进行缓存"prototype"作用域的bean，因此无法提前暴露一个创建中的bean

<a id="markdown-21122-自动注入方式" name="21122-自动注入方式"></a>
##### 2.1.1.2.2. 自动注入方式

上面是传统的XML配置方式,目前很少使用，一般使用自动注入

* spring自动注入的三种方式
所谓spring自动注入，是指容器中的一个组件中需要用到另一个组件（例如聚合关系）时，依靠spring容器创建对象，而不是手动创建，主要有三种方式：
1. @Autowired注解——由spring提供
2. @Resource注解——由JSR-250提供
3. @Inject注解——由JSR-330提供

**@Autowired注解的使用方法**

```java
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Autowired {

   /**
    * Declares whether the annotated dependency is required.
    * <p>Defaults to {@code true}.
    */
   boolean required() default true;
}
```

从源码可以看出：该注解可以用在构造器、方法、参数、属性上，最常见的是用在属性上。
该注解只有一个属性： required，默认为true，如果找不到匹配的bean则报错；设置为false，如果找不到匹配的bean则注入null，并不会报错。
可以配合@Qualifier使用，用于精准指定要注入的bean的名称。
可以配合@Primary使用，当容器中存在多个相同类型的组件时，用于指定优先加载哪一个，这个注解不能用在2个或更多同类型的组件上。
 1. 当容器中只有一个该类型的组件时
|-不使用@Qualifier，会按bean类型查找，即applicationContext.getBean(bean.class)，然后注入这个唯一的bean。
|-使用@Qualifier，会按Qualifier的value值跟bean名称匹配查找，即applicationContext.getBean("Qualifier的value值")。
2. 当容器中没有该类型的组件时
|-required=true——报错expected at least 1 bean which qualifies as autowire candidate。
|-required=false——注入null。
3. 当容器中存在多个该类型的组件时
|-不使用@Qualifier和@Primary时，会按属性名跟bean名称匹配查找，即applicationContext.getBean("属性名")。
|-使用@Primary、但不使用@Qualifier时，会优先加载带有@Primary注解的组件。
|-使用@Qualifier时，不管有没有使用@Primary，都会直接按Qualifier的value值跟bean名称匹配查找。
综上，当容器中存在多个同类型的组件时，加载优先级：@Qulifier>@Primary>属性名，例如下面这个容器中包含3个BookDao组件

```java
@Configuration
@ComponentScan(basePackages = {"cn.monolog.service"})
public class AutowiredBeanConfig {

    @Bean(value = "bookDao1")
    public BookDao bookDao1() {
        BookDao bookDao = new BookDao();
        bookDao.setLabel("bookDao1");
        return bookDao;
    }

    @Bean(value = "bookDao2")
    @Primary
    public BookDao bookDao2() {
        BookDao bookDao = new BookDao();
        bookDao.setLabel("bookDao2");
        return bookDao;
    }

    @Bean(value = "bookDao3")
    public BookDao bookDao3() {
        BookDao bookDao = new BookDao();
        bookDao.setLabel("bookDao3");
        return bookDao;
    }
}
```

自动注入方式是这样的：
@Autowired
@Qualifier(value = "bookDao1")
private BookDao bookDao3;
按照优先级顺序，@Qulifier(bookDao1) > @Primary(bookDao2) > 属性名(bookDao3)，最终加载的是名称为bookDao1的组件。
 
**@Resource注解的使用方法**
@Resource注解的使用跟@Autowired注解类似，但是需要注意：
1. 不支持@Primary注解，也不支持reuqired=false，即不允许注入null；
2. 该注解有一个属性name，类似于@Qualified精准匹配，优先级最高；
3. 默认按照属性名跟bean的名称匹配查找，如果不存在，再按类型匹配查找。
例如，下面这个容器中有两个CarDao组件
```java
@Configuration
@ComponentScan(basePackages = {"cn.monolog.service"})
public class ResourceBeanConfig {

    @Bean(value = "carDao1")
    public CarDao carDao1() {
        CarDao carDao = new CarDao();
        carDao.setLabel("1");
        return  carDao;
    }

    @Bean(value = "carDao2")
    public CarDao carDao() {
        CarDao carDao = new CarDao();
        carDao.setLabel("2");
        return  carDao;
    }
}
```

自动注入方式如下，会按属性名注入carDao2组件。
//自动注入
@Resource
private CarDao carDao2;
但是改为下面这种注入方式：
//自动注入
@Resource(name = "carDao1")
private CarDao carDao2;
由于使用了name精准匹配，会忽略属性名，注入carDao1组件。
 
**@Inject注解的使用方法**
@Inject注解的使用方法跟@Autowired也基本相似，但是需要注意
1. 使用前需要导入jar包——javax.inject；
2. 支持@Primary注解，而且因为没有精确匹配，@Primary的优先级最高；
2. 不支持required=false，即不能注入null，如果找不到组件肯定报错；
3. 默认按照属性名跟bean的名称匹配查找，如果不存在，再按类型匹配查找。
 
例如，下面这容器中有一个EmployeeDao组件
```java
@Configuration
public class InjectBeanConfig {
    @Bean(value = "employeeDao1")
    public EmployeeDao employeeDao1() {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.setLabel("1");
        return employeeDao;
    }
}
```

自动注入的方式如下
```java
@Inject
private EmployeeDao employeeDao3;
```
spring会先按属性名查找名称为employeDao3的组件，即applicationContext.getBean("employeeDao3")，结果不存在；
然后按照类型查找，即applicationContext.getBean(EmployeDao.class)，找到employeDao1组件，成功注入。
 
如果容器中有多个同类型组件，例如
```java
@Configuration
public class InjectBeanConfig {
    @Bean(value = "employeeDao1")
    public EmployeeDao employeeDao1() {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.setLabel("1");
        return employeeDao;
    }
    @Bean(value = "employeeDao2")
    public EmployeeDao employeeDao2() {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.setLabel("2");
        return employeeDao;
    }
    @Bean(value = "employeeDao3")
    public EmployeeDao employeeDao3() {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.setLabel("3");
        return employeeDao;
    }
}
```
注入方式还是这样

```java
@Inject
private EmployeeDao employeeDao3;
```
仍然会按属性名和bean的名称匹配，即applicationContext.getBean("employeeDao3")，找到employee3，成功注入。
 
但是如果其中某个组件加了@Primary注解，会忽略属性名，优先注入，例如

```java
@Configuration
public class InjectBeanConfig {

    @Bean(value = "employeeDao1")
    public EmployeeDao employeeDao1() {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.setLabel("1");
        return employeeDao;
    }

    @Bean(value = "employeeDao2")
    @Primary
    public EmployeeDao employeeDao2() {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.setLabel("2");
        return employeeDao;
    }

    @Bean(value = "employeeDao3")
    public EmployeeDao employeeDao3() {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.setLabel("3");
        return employeeDao;
    }
}
```

无论注入时使用什么样的属性名，都会注入employeeDao2。

<a id="markdown-212-ioc容器" name="212-ioc容器"></a>
### 2.1.2. IOC容器
<a href="#menu" style="float:right">目录</a>


<a id="markdown-213-aop面向切面编程" name="213-aop面向切面编程"></a>
### 2.1.3. AOP面向切面编程
<a href="#menu" style="float:right">目录</a>

<a id="markdown-214-spring-事务管理" name="214-spring-事务管理"></a>
### 2.1.4. Spring 事务管理
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2141-数据库事务基础知识" name="2141-数据库事务基础知识"></a>
#### 2.1.4.1. 数据库事务基础知识
<a href="#menu" style="float:right">目录</a>

**事务的四大特性（ACID）**
如果一个数据库声称支持事务的操作，那么该数据库必须要具备以下四个特性：
* 原子性（Atomicity）
    * 原子性是指事务包含的所有操作要么全部成功，要么全部失败回滚，因此事务的操作如果成功就必须要完全应用到数据库，如果操作失败则不能对数据库有任何影响。
* 一致性（Consistency）
    * 一致性是指事务必须使数据库从一个一致性状态变换到另一个一致性状态，也就是说一个事务执行之前和执行之后都必须处于一致性状态。
    * 拿转账来说，假设用户A和用户B两者的钱加起来一共是5000，那么不管A和B之间如何转账，转几次账，事务结束后两个用户的钱相加起来应该还得是5000，这就是事务的一致性。
* 隔离性（Isolation）
    * 隔离性是当多个用户并发访问数据库时，比如操作同一张表时，数据库为每一个用户开启的事务，不能被其他事务的操作所干扰，多个并发事务之间要相互隔离。
    * 即要达到这么一种效果：对于任意两个并发的事务T1和T2，在事务T1看来，T2要么在T1开始之前就已经结束，要么在T1结束之后才开始，这样每个事务都感觉不到有其他事务在并发地执行。
* 持久性（Durability）
    * 持久性是指一个事务一旦被提交了，那么对数据库中的数据的改变就是永久性的，即便是在数据库系统遇到故障的情况下也不会丢失提交事务的操作。
    * 例如我们在使用JDBC操作数据库时，在提交事务方法后，提示用户事务操作完成，当我们程序执行完成直到看到提示后，就可以认定事务以及正确提交，即使这时候数据库出现了问题，也必须要将我们的事务完全执行完成，否则就会造成我们看到提示事务处理完毕，但是数据库因为故障而没有执行事务的重大错误。

**事务的隔离级别（默认事务级别为可重复读）**
总的说，数据库事务无非就两种：读取事务（select）、修改事务（update,insert）。在没有事务隔离控制的时候，多个事务在同一时刻对同一数据的操作可能就会影响到最终期望的结果，通常有四种情况：
* 两个更新事务同时修改一条数据时，很显然这种情况是最严重的了，程序中无论如何也不能出现这种情况，因为它会造成更新的丢失！
* 一个更新事务更新一条数据时，另一个读取事务读取了还没提交的更新，这种情况下会出现读取到脏数据。
* 一个读取事务读取一条数据时，另一个更新事务修改了这条数据，这时就会出现不可重现的读取。
* 一个读取事务读取时，另一个插入事务（注意此处时插入）插入了一条新数据，这样就可能多读出一条数据，出现幻读。

以上四种情况描述完毕，相信大家也发现规律了，前三种是对同一条数据的并发操作，对程序的结果可能产生致命影响，尤其是金融等实时性，准确性要求极高的系统，绝不容许这三中情况的出现，
相比第四种情况不会影响数据的真实性，在很多情况下是允许的，如社交论坛等实时性要求不高的系统！
综上四个情况，我们可以大致这样简单的理解（最初说的两种事务的自由组合2*2=4）：
* 修改时允许修改（丢失更新）
* 修改时允许读取（脏读）
* 读取时允许修改（不可重复读）
* 读取时允许插入（幻读）
从上到下问题越来越不严重，但所需的性能开销却越大。因为不同的系统允许不同级别的情况，所以就出现了事务隔离这么一个东东，来允许我们设定数据库的并发行为。

总结下如果不考虑事务的隔离性，会发生的几种问题：

* 脏读
    * 脏读是指在一个事务处理过程里读取了另一个未提交的事务中的数据。
    * 当一个事务正在多次修改某个数据，而在这个事务中这多次的修改都还未提交，这时一个并发的事务来访问该数据，就会造成两个事务得到的数据不一致。例如：用户A向用户B转账100元，对应SQL命令如下
        * update account set money=money+100 where name=’B’;  (此时A通知B)
        * update account set money=money - 100 where name=’A’;
    * 当只执行第一条SQL时，A通知B查看账户，B发现确实钱已到账（此时即发生了脏读），而之后无论第二条SQL是否执行，只要该事务不提交，则所有操作都将回滚，那么当B以后再次查看账户时就会发现钱其实并没有转。
* 不可重复读
    * 不可重复读是指在对于数据库中的某个数据，一个事务范围内多次查询却返回了不同的数据值，这是由于在查询间隔，被另一个事务修改并提交了。
    * 例如事务T1在读取某一数据，而事务T2立马修改了这个数据并且提交事务给数据库，事务T1再次读取该数据就得到了不同的结果，发送了不可重复读。
    * 不可重复读和脏读的区别是，脏读是某一事务读取了另一个事务未提交的脏数据，而不可重复读则是读取了前一事务提交的数据。
    * 在某些情况下，不可重复读并不是问题，比如我们多次查询某个数据当然以最后查询得到的结果为主。但在另一些情况下就有可能发生问题，例如对于同一个数据A和B依次查询就可能不同，A和B就可能打起来了……
* 虚读(幻读)
    * 幻读是事务非独立执行时发生的一种现象。例如事务T1对一个表中所有的行的某个数据项做了从“1”修改为“2”的操作，这时事务T2又对这个表中插入了一行数据项，而这个数据项的数值还是为“1”并且提交给数据库。而操作事务T1的用户如果再查看刚刚修改的数据，会发现还有一行没有修改，其实这行是从事务T2中添加的，就好像产生幻觉一样，这就是发生了幻读。
    * 幻读和不可重复读都是读取了另一条已经提交的事务（这点就脏读不同），所不同的是不可重复读查询的都是同一个数据项，而幻读针对的是一批数据整体（比如数据的个数）。

SQL标准定义了4类隔离级别，包括了一些具体规则，用来限定事务内外的哪些改变是可见的，哪些是不可见的。低级别的隔离级一般支持更高的并发处理，并拥有更低的系统开销。
MySQL数据库的四种事务隔离级别
* Read Uncommitted（读取未提交内容）
    * 在该隔离级别，所有事务都可以看到其他未提交事务的执行结果。本隔离级别很少用于实际应用，因为它的性能也不比其他级别好多少。读取未提交的数据，也被称之为脏读（Dirty Read）；
* Read Committed（读取提交内容）
    * 这是大多数数据库系统的默认隔离级别（但不是MySQL默认的）。它满足了隔离的简单定义：一个事务只能看见已经提交事务所做的改变。这种隔离级别 也支持所谓的不可重复读（Nonrepeatable Read），因为同一事务的其他实例在该实例处理其间可能会有新的commit，所以同一select可能返回不同结果；
* Repeatable Read（可重读）
    * 这是MySQL的默认事务隔离级别，它确保同一事务的多个实例在并发读取数据时，会看到同样的数据行。不过理论上，这会导致另一个棘手的问题：幻读 （Phantom Read）。
    * 简单的说，幻读指当用户读取某一范围的数据行时，另一个事务又在该范围内插入了新行，当用户再读取该范围的数据行时，会发现有新的“幻影” 行。
    * InnoDB和Falcon存储引擎通过多版本并发控制（MVCC，Multiversion Concurrency Control）机制解决了该问题
* Serializable（可串行化） 
    * 这是最高的隔离级别，它通过强制事务排序，使之不可能相互冲突，从而解决幻读问题。简言之，它是在每个读的数据行上加上共享锁。在这个级别，可能导致大量的超时现象和锁竞争。
    * 这四种隔离级别采取不同的锁类型来实现，若读取的是同一个数据的话，就容易发生问题。例如：
        * 脏读(Drity Read)：某个事务已更新一份数据，另一个事务在此时读取了同一份数据，由于某些原因，前一个RollBack了操作，则后一个事务所读取的数据就会是不正确的。
        * 不可重复读(Non-repeatable read):在一个事务的两次查询之中数据不一致，这可能是两次查询过程中间插入了一个事务更新的原有的数据。
        * 幻读(Phantom Read):在一个事务的两次查询中数据笔数不一致，例如有一个事务查询了几列(Row)数据，而另一个事务却在此时插入了新的几列数据，先前的事务在接下来的查询中，就会发现有几列数据是它先前所没有的。
         
在MySQL中，实现了这四种隔离级别，分别有可能产生问题如下所示：
* Serializable (串行化)：可避免脏读、不可重复读、幻读的发生。
* Repeatable read (可重复读)：可避免脏读、不可重复读的发生。
* Read committed (读已提交)：可避免脏读的发生。
* Read uncommitted (读未提交)：最低级别，任何情况都无法保证。

　　以上四种隔离级别最高的是Serializable级别，最低的是Read uncommitted级别，当然级别越高，执行效率就越低。像Serializable这样的级别，就是以锁表的方式(类似于Java多线程中的锁)使得其他的线程只能在锁外等待，所以平时选用何种隔离级别应该根据实际情况。在MySQL数据库中默认的隔离级别为Repeatable read (可重复读)。

　　在MySQL数据库中，支持上面四种隔离级别，默认的为Repeatable read (可重复读)；而在Oracle数据库中，只支持Serializable (串行化)级别和Read committed (读已提交)这两种级别，其中默认的为Read committed级别。


总结：

隔离级别越高，越能保证数据的完整性和一致性，但是对并发性能的影响也越大。
大多数的数据库默认隔离级别为 Read Commited，比如 SqlServer、Oracle
少数数据库默认隔离级别为：Repeatable Read 比如： MySQL InnoDB

补充：
　　1、SQL规范所规定的标准，不同的数据库具体的实现可能会有些差异
　　2、mysql中默认事务隔离级别是可重复读时并不会锁住读取到的行
　　3、事务隔离级别为读提交时，写数据只会锁住相应的行
　　4、事务隔离级别为可重复读时，如果有索引（包括主键索引）的时候，以索引列为条件更新数据，会存在间隙锁间隙锁、行锁、下一键锁的问题，从而锁住一些行；如果没有索引，更新数据时会锁住整张表。
    5、事务隔离级别为串行化时，读写数据都会锁住整张表
    6、隔离级别越高，越能保证数据的完整性和一致性，但是对并发性能的影响也越大，鱼和熊掌不可兼得啊。对于多数应用程序，可以优先考虑把数据库系统的隔离级别设为Read Committed，它能够避免脏读取，而且具有较好的并发性能。尽管它会导致不可重复读、幻读这些并发问题，在可能出现这类问题的个别场合，可以由应用程序采用悲观锁或乐观锁来控制。

**事务的分类**
* 数据库分为本地事务跟全局事务
    * 本地事务：普通事务，独立一个数据库，能保证在该数据库上操作的ACID。
    * 分布式事务：涉及两个或多个数据库源的事务，即跨越多台同类或异类数据库的事务（由每台数据库的本地事务组成的），分布式事务旨在保证这些本地事务的所有操作的ACID，使事务可以跨越多台数据库；
* Java事务类型分为JDBC事务跟JTA事务
    * JDBC事务：即为上面说的数据库事务中的本地事务，通过connection对象控制管理。
    * JTA事务：JTA指Java事务API(Java Transaction API)，是Java EE数据库事务规范， JTA只提供了事务管理接口，由应用程序服务器厂商（如WebSphere Application Server）提供实现，JTA事务比JDBC更强大，支持分布式事务。
* 按是否通过编程分为声明式事务和编程式事务，参考http://blog.csdn.net/liaohaojian/article/details/70139151
    * 声明式事务：通过XML配置或者注解实现。
    * 编程式事务：通过编程代码在业务逻辑时需要时自行实现，粒度更小。

**事务的基本原理**
Spring事务的本质其实就是数据库对事务的支持，没有数据库的事务支持，spring是无法提供事务功能的。对于纯JDBC操作数据库，想要用到事务，可以按照以下步骤进行：

* 获取连接 Connection con = DriverManager.getConnection()
* 开启事务con.setAutoCommit(true/false);
* 执行CRUD
* 提交事务/回滚事务 con.commit() / con.rollback();
* 关闭连接 conn.close()；

使用Spring的事务管理功能后，我们可以不再写步骤 2 和 4 的代码，而是由Spirng 自动完成。那么Spring是如何在我们书写的 CRUD 之前和之后开启事务和关闭事务的呢？解决这个问题，也就可以从整体上理解Spring的事务管理实现原理了。下面简单地介绍下，注解方式为例子

* 配置文件开启注解驱动，在相关的类和方法上通过注解@Transactional标识。
* spring 在启动的时候会去解析生成相关的bean，这时候会查看拥有相关注解的类和方法，并且为这些类和方法生成代理，并根据@Transaction的相关参数进行相关配置注入，这样就在代理中为我们把相关的事务处理掉了（开启正常提交事务，异常回滚事务）。
* 真正的数据库层的事务提交和回滚是通过binlog或者redo log实现的


<a id="markdown-2142-spring-对事务管理的支持" name="2142-spring-对事务管理的支持"></a>
#### 2.1.4.2. Spring 对事务管理的支持
<a href="#menu" style="float:right">目录</a>

<a id="markdown-21421-spring事务传播行为和隔离级别" name="21421-spring事务传播行为和隔离级别"></a>
##### 2.1.4.2.1. Spring事务传播行为和隔离级别

**嵌套事务**
嵌套是子事务套在父事务中执行，子事务是父事务的一部分，在进入子事务之前，父事务建立一个回滚点，叫save point，然后执行子事务，这个子事务的执行也算是父事务的一部分，然后子事务执行结束，父事务继续执行。重点就在于那个save point。看几个问题就明了了：

* 如果子事务回滚，会发生什么？
父事务会回滚到进入子事务前建立的save point，然后尝试其他的事务或者其他的业务逻辑，父事务之前的操作不会受到影响，更不会自动回滚。

* 如果父事务回滚，会发生什么？
父事务回滚，子事务也会跟着回滚！为什么呢，因为父事务结束之前，子事务是不会提交的，我们说子事务是父事务的一部分，正是这个道理。

* 事务的提交，是什么情况？
是父事务先提交，然后子事务提交，还是子事务先提交，父事务再提交？答案是第二种情况，还是那句话，子事务是父事务的一部分，由父事务统一提交。


**事务传播行为**
* PROPAGATION_REQUIRED
    * 如果存在一个事务，则支持当前事务。如果没有事务则开启一个新的事务。
    * 默认的spring事务传播级别，使用该级别的特点是，如果上下文中已经存在事务，那么就加入到事务中执行，如果当前上下文中不存在事务，则新建事务执行。所以这个级别通常能满足处理大多数的业务场景。
* PROPAGATION_SUPPORTS 
    * 如果存在一个事务，支持当前事务。如果没有事务，则非事务的执行。但是对于事务同步的事务管理器，PROPAGATION_SUPPORTS与不使用事务有少许不同。
    * 从字面意思就知道，supports，支持，该传播级别的特点是，如果上下文存在事务，则支持事务加入事务，如果没有事务，则使用非事务的方式执行。所以说，并非所有的包在transactionTemplate.execute中的代码都会有事务支持。这个通常是用来处理那些并非原子性的非核心业务逻辑操作。应用场景较少。
* PROPAGATION_MANDATORY 
    * 如果已经存在一个事务，支持当前事务。如果没有一个活动的事务，则抛出异常。
    * 该级别的事务要求上下文中必须要存在事务，否则就会抛出异常！配置该方式的传播级别是有效的控制上下文调用代码遗漏添加事务控制的保证手段。比如一段代码不能单独被调用执行，但是一旦被调用，就必须有事务包含的情况，就可以使用这个传播级别。
* PROPAGATION_REQUIRES_NEW
    * 总是开启一个新的事务。如果一个事务已经存在，则将这个存在的事务挂起。
    * 从字面即可知道，new，每次都要一个新事务，该传播级别的特点是，每次都会新建一个事务，并且同时将上下文中的事务挂起，执行当前新建事务完成以后，上下文事务恢复再执行。
    * 这是一个很有用的传播级别，举一个应用场景：现在有一个发送100个红包的操作，在发送之前，要做一些系统的初始化、验证、数据记录操作，然后发送100封红包，然后再记录发送日志，发送日志要求100%的准确，如果日志不准确，那么整个父事务逻辑需要回滚。怎么处理整个业务需求呢？就是通过这个PROPAGATION_REQUIRES_NEW 级别的事务传播控制就可以完成。发送红包的子事务不会直接影响到父事务的提交和回滚。
* PROPAGATION_NOT_SUPPORTED 
    * 总是非事务地执行，并挂起任何存在的事务。
    * 这个也可以从字面得知，not supported ，不支持，当前级别的特点就是上下文中存在事务，则挂起事务，执行当前逻辑，结束后恢复上下文的事务。
    * 这个级别有什么好处？可以帮助你将事务极可能的缩小。我们知道一个事务越大，它存在的风险也就越多。所以在处理事务的过程中，要保证尽可能的缩小范围。比如一段代码，是每次逻辑操作都必须调用的，比如循环1000次的某个非核心业务逻辑操作。这样的代码如果包在事务中，势必造成事务太大，导致出现一些难以考虑周全的异常情况。所以这个事务这个级别的传播级别就派上用场了。用当前级别的事务模板抱起来就可以了。
* PROPAGATION_NEVER
    * 总是非事务地执行，如果存在一个活动事务，则抛出异常
    * 该事务更严格，上面一个事务传播级别只是不支持而已，有事务就挂起，而PROPAGATION_NEVER传播级别要求上下文中不能存在事务，一旦有事务，就抛出runtime异常，强制停止执行！
* PROPAGATION_NESTED
    * 如果一个活动的事务存在，则运行在一个嵌套的事务中. 如果没有活动事务, 则按TransactionDefinition.PROPAGATION_REQUIRED 属性执行
    * 字面也可知道，nested，嵌套级别事务。该传播级别特征是，如果上下文中存在事务，则嵌套事务执行，如果不存在事务，则新建事务


**例子讲解以上七中事务传播机制**
假设有类A的方法methodB(),有类B的方法methodB().
![](https://img-blog.csdn.net/20170228222731090)

* **PROPAGATION_REQUIRED**

A.methodA()调用B的methodB()方法，那么如果A的方法包含事务，则B的方法则不重新开启事务，
1. 如果B的methodB()抛出异常，A的methodB()没有捕获，则A和B的事务都会回滚；
2. 如果B的methodB()运行期间异常会导致B的methodB()的回滚，A如果捕获了异常，并正常提交事务，则会发生Transaction rolled back because it has been marked as rollback-only的异常。
3. 如果A的methodA()运行期间异常，则A和B的Method的事务都会被回滚

* **PROPAGATION_SUPPORTS**

A.methodA()调用B的methodB()方法，那么如果A的方法包含事务，则B运行在此事务环境中，如果A的方法不包含事务，则B运行在非事务环境；
1. 如果A没有事务，则A和B的运行出现异常都不会回滚。
2. 如果A有事务，A的method方法执行抛出异常，B.methodB和A.methodA都会回滚。
3. 如果A有事务，B.method抛出异常，B.methodB和A.methodA都会回滚，如果A捕获了B.method抛出的异常，则会出现异常Transactionrolled back because it has been marked as rollback-only。

 

* **PROPAGATION_MANDATORY**

表示当前方法必须在一个事务中运行，如果没有事务，将抛出异常，如下图调用关系：
B.methodB()事务传播特性定义为:PROPAGATION_MANDATORY
1. 如果A的methoda()方法没有事务运行环境，则B的methodB()执行的时候会报如下异常：No existingtransaction found for transaction marked with propagation 'mandatory'
2. 如果A的Methoda()方法有事务并且执行过程中抛出异常，则A.methoda（）和B.methodb（）执行的操作被回滚；
3. 如果A的methoda()方法有事务，则B.methodB()抛出异常时，A的methoda()和B.methodB()都会被回滚；如果A捕获了B.method抛出的异常，则会出现异常Transaction rolled back because ithas been marked as rollback-only

* **PROPAGATION_NESTED**

B的methodB()定义的事务为PROPAGATION_NESTED；
1. 如果A的MethodA()不存在事务，则B的methodB()运行在一个新的事务中，B.method()抛出的异常，B.methodB()回滚,但A.methodA()不回滚；如果A.methoda()抛出异常，则A.methodA()和B.methodB()操作不回。
2. 如果A的methodA()存在事务，则A的methoda()抛出异常，则A的methoda()和B的Methodb()都会被回滚；
3. 如果A的MethodA()存在事务，则B的methodB()抛出异常，B.methodB()回滚，如果A不捕获异常，则A.methodA()和B.methodB()都会回滚，如果A捕获异常，则B.methodB()回滚,A不回滚；

* **PROPAGATION_NEVER**

表示事务传播特性定义为PROPAGATION_NEVER的方法不应该运行在一个事务环境中

如果B.methodB()的事务传播特性被定义为PROPAGATION_NEVER，则如果A.methodA()方法存在事务，则会出现异常Existingtransaction found for transaction marked with propagation 'never'。

* **PROPAGATION_REQUIRES_NEW**

表示事务传播特性定义为PROPAGATION_REQUIRES_NEW的方法需要运行在一个新的事务中。
1. 如果A存在事务，A.methodA()抛出异常，A.methodA()的事务被回滚，但B.methodB()事务不受影响；如果B.methodB()抛出异常，A不捕获的话，A.methodA()和B.methodB()的事务都会被回滚。如果A捕获的话，A.methodA()的事务不受影响但B.methodB()的事务回滚。

* **PROPAGATION_NOT_SUPPORTED**

表示该方法不应该在一个事务中运行。如果有一个事务正在运行，他将在运行期被挂起，直到这个事务提交或者回滚才恢复执行。
1. 如果A.methodA()存在事务，如果B.methodB()抛出异常，A.methodA()不捕获的话，A.methodA()的事务被回滚，而B.methodB()出现异常前数据库操作不受影响。如果A.methodA()捕获的话，则A.methodA()的事务不受影响，B.methodB()异常抛出前的数据操作不受影响。


**实际场景中的七大事务传播行为的使用**
1. 在一个话费充值业务处理逻辑中，有如下图所示操作:
![](https://img-blog.csdn.net/20170228222113143?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcG1sMTg3MTA5NzMwMzY=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

业务需要扣款操作和创建订单操作同成功或者失败，因此，charger()和order()的事务不能相互独立，需要包含在chargeHandle()的事务中；
通过以上需求，可以给charge()和order()的事务传播行为定义成：PROPAGATION_MANDATORY
只要charge()或者order()抛出异常整个chargeHandle()都一起回滚，即使chargeHandle()捕获异常也没用，不允许提交事务。

2. 如果业务需求每接受到一次请求到要记录日志到数据库，如下图：
![](https://img-blog.csdn.net/20170228222320615?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcG1sMTg3MTA5NzMwMzY=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

因为log()的操作不管扣款和创建订单成功与否都要生成日志，并且日志的操作成功与否不影响充值处理，所以log()方法的事务传播行为可以定义为:PROPAGATION_REQUIRES_NEW.

3. 在订单的售后处理中，更新完订单金额后，需要自动统计销售报表，如下图所示：
![](https://img-blog.csdn.net/20170228222423429)
根据业务可知，售后是已经处理完订单的充值请求后的功能，是对订单的后续管理，统计报表report()方法耗时较长，因此，我们需要设置report()的事务传播行为为:PROPAGATION_NEVER,表示不适合在有事务的操作中调用，因为report()太耗时。


4. 在银行新增银行卡业务中，需要执行两个操作，一个是保存银行卡信息，一个是登记新创建的银行卡信息，其中登记银行卡信息成功与否不影响银行卡的创建。
![](https://img-blog.csdn.net/20170228222634004)


由以上需求，我们可知对于regster()方法的事务传播行为，可以设置为PROPAGATION_NESTED，action()事务的回滚，regster()保存的信息就没意义，也就需要跟着回滚，而regster()的回滚不影响action()事务；insert()的事务传播行为可以设置为PROPAGATION_REQUIRED, PROPAGATION_MANDATORY，即insert()回滚事务，action()的事务必须跟着回滚。





**spring 什么情况下进行事务回滚**

Spring、EJB的声明式事务默认情况下都是在抛出unchecked exception后才会触发事务的回滚

unchecked异常,即运行时异常runntimeException 回滚事务;

checked异常,即Exception可try{}捕获的不会回滚.当然也可配置spring参数让其回滚.

spring的事务边界是在调用业务方法之前开始的，业务方法执行完毕之后来执行commit or rollback(Spring默认取决于是否抛出runtime异常).
如果抛出runtime exception 并在你的业务方法中没有catch到的话，事务会回滚。
一般不需要在业务方法中catch异常，如果非要catch，在做完你想做的工作后（比如关闭文件等）一定要抛出runtime exception，否则spring会将你的操作commit,这样就会产生脏数据.所以你的catch代码是画蛇添足。

**Spring中的隔离级别**
|常量|	解释|
|---|---|
|ISOLATION_DEFAULT|	这是个 PlatfromTransactionManager 默认的隔离级别，使用数据库默认的事务隔离级别。另外四个与 JDBC 的隔离级别相对应。
|ISOLATION_READ_UNCOMMITTED	|这是事务最低的隔离级别，它充许另外一个事务可以看到这个事务未提交的数据。这种隔离级别会产生脏读，不可重复读和幻像读。
|ISOLATION_READ_COMMITTED|	保证一个事务修改的数据提交后才能被另外一个事务读取。另外一个事务不能读取该事务未提交的数据。
|ISOLATION_REPEATABLE_READ|	这种事务隔离级别可以防止脏读，不可重复读。但是可能出现幻像读。
|ISOLATION_SERIALIZABLE|这是花费最高代价但是最可靠的事务隔离级别。事务被处理为顺序执行。

<a id="markdown-21422-事务管理关键抽象" name="21422-事务管理关键抽象"></a>
##### 2.1.4.2.2. 事务管理关键抽象

事务管理的抽象主要包含以下三个接口
```java
org.springframework.transaction.PlatformTransactionManager
org.springframework.transaction.TransactionDefinition
org.springframework.transaction.TransactionStatus
```

**org.springframework.transaction.TransactionDefinition**
用于描述事务的隔离级别，超时时间，是否是只读事务和事务传播规则等控制事务具体行为的事务属性，这些事务属性可以通过XML方式、注解、编程方式指定
PlatformTransactionManager根据TransactionDefinition指定的参数创建事务，并用TransactionStatus描述事务状态


* **TransactionDefinition**
定义了事务传播行为和隔离特性的常量
```java

package org.springframework.transaction;

import org.springframework.lang.Nullable;

public interface TransactionDefinition {

    //事务传播行为
	int PROPAGATION_REQUIRED = 0;
	int PROPAGATION_SUPPORTS = 1;
	int PROPAGATION_MANDATORY = 2;
	int PROPAGATION_REQUIRES_NEW = 3;
	int PROPAGATION_NOT_SUPPORTED = 4;
	int PROPAGATION_NEVER = 5;
	int PROPAGATION_NESTED = 6;
    //事务隔离特性
	int ISOLATION_DEFAULT = -1;
	int ISOLATION_READ_UNCOMMITTED = 1;  // same as java.sql.Connection.TRANSACTION_READ_UNCOMMITTED;
	int ISOLATION_READ_COMMITTED = 2;  // same as java.sql.Connection.TRANSACTION_READ_COMMITTED;
	int ISOLATION_REPEATABLE_READ = 4;  // same as java.sql.Connection.TRANSACTION_REPEATABLE_READ;
	int ISOLATION_SERIALIZABLE = 8;  // same as java.sql.Connection.TRANSACTION_SERIALIZABLE;

    //事务超时时间，超时时间到就执行回滚
	int TIMEOUT_DEFAULT = -1;


	default int getPropagationBehavior() {
		return PROPAGATION_REQUIRED;
	}
	default int getIsolationLevel() {
		return ISOLATION_DEFAULT;
	}

	default int getTimeout() {
		return TIMEOUT_DEFAULT;
	}

    //只读状态，只读事务会进行相关的优化，提高运行性能
	default boolean isReadOnly() {
		return false;
	}
    //事务名称
	@Nullable
	default String getName() {
		return null;
	}

	static TransactionDefinition withDefaults() {
		return StaticTransactionDefinition.INSTANCE;
	}

}

```

* **TransactionStatus**

TransactionStatus代表一个事务的具体运行状态，事务管理器可以通过该接口获取事务运行期的状态信息，也可以通过该接口间接的回滚事务。相比于抛出异常时回滚事务的方式更具有可控性。
SavepointManager基于JDBC3.0保存点的分段事务控制能力提供了嵌套事务的机制
```java
public interface SavepointManager {

	/**
	 * Create a new savepoint. You can roll back to a specific savepoint
	 * via {@code rollbackToSavepoint}, and explicitly release a savepoint
	 * that you don't need anymore via {@code releaseSavepoint}.
	 * <p>Note that most transaction managers will automatically release
	 * savepoints at transaction completion.
	 * @return a savepoint object, to be passed into
	 * {@link #rollbackToSavepoint} or {@link #releaseSavepoint}
	 * @throws NestedTransactionNotSupportedException if the underlying
	 * transaction does not support savepoints
	 * @throws TransactionException if the savepoint could not be created,
	 * for example because the transaction is not in an appropriate state
	 * @see java.sql.Connection#setSavepoint
	 */
     //创建保存点对象
	Object createSavepoint() throws TransactionException;

	/**
	 * Roll back to the given savepoint.
	 * <p>The savepoint will <i>not</i> be automatically released afterwards.
	 * You may explicitly call {@link #releaseSavepoint(Object)} or rely on
	 * automatic release on transaction completion.
	 * @param savepoint the savepoint to roll back to
	 * @throws NestedTransactionNotSupportedException if the underlying
	 * transaction does not support savepoints
	 * @throws TransactionException if the rollback failed
	 * @see java.sql.Connection#rollback(java.sql.Savepoint)
	 */
     //将事务回滚到特定的保存点上，被回滚的保存点将自动释放
	void rollbackToSavepoint(Object savepoint) throws TransactionException;

	/**
	 * Explicitly release the given savepoint.
	 * <p>Note that most transaction managers will automatically release
	 * savepoints on transaction completion.
	 * <p>Implementations should fail as silently as possible if proper
	 * resource cleanup will eventually happen at transaction completion.
	 * @param savepoint the savepoint to release
	 * @throws NestedTransactionNotSupportedException if the underlying
	 * transaction does not support savepoints
	 * @throws TransactionException if the release failed
	 * @see java.sql.Connection#releaseSavepoint
	 */
     //释放保存点，如果事务提交，则所有的保存点将会自动释放，无需手动清除
	void releaseSavepoint(Object savepoint) throws TransactionException;

}
public interface TransactionExecution {

	/**
	 * Return whether the present transaction is new; otherwise participating
	 * in an existing transaction, or potentially not running in an actual
	 * transaction in the first place.
	 */
     //是否是一个新事务，false:当前事务是一个已经存在的事务，或者当前未运行在事务环境中
	boolean isNewTransaction();

	/**
	 * Set the transaction rollback-only. This instructs the transaction manager
	 * that the only possible outcome of the transaction may be a rollback, as
	 * alternative to throwing an exception which would in turn trigger a rollback.
	 */
     
	void setRollbackOnly();

	/**
	 * Return whether the transaction has been marked as rollback-only
	 * (either by the application or by the transaction infrastructure).
	 */
	boolean isRollbackOnly();

	/**
	 * Return whether this transaction is completed, that is,
	 * whether it has already been committed or rolled back.
	 */
     //事务是否已经结束(提交或者回滚)
	boolean isCompleted();

}


public interface TransactionStatus extends TransactionExecution, SavepointManager, Flushable {


	/**
	 * Return whether this transaction internally carries a savepoint,
	 * that is, has been created as nested transaction based on a savepoint.
	 * <p>This method is mainly here for diagnostic purposes, alongside
	 * {@link #isNewTransaction()}. For programmatic handling of custom
	 * savepoints, use the operations provided by {@link SavepointManager}.
	 * @see #isNewTransaction()
	 * @see #createSavepoint()
	 * @see #rollbackToSavepoint(Object)
	 * @see #releaseSavepoint(Object)
	 */
     //判断当前事务是否内部创建了一个保存点
	boolean hasSavepoint();

	/**
	 * Flush the underlying session to the datastore, if applicable:
	 * for example, all affected Hibernate/JPA sessions.
	 * <p>This is effectively just a hint and may be a no-op if the underlying
	 * transaction manager does not have a flush concept. A flush signal may
	 * get applied to the primary resource or to transaction synchronizations,
	 * depending on the underlying resource.
	 */
	@Override
	void flush();

}
```

* **PlatformTransactionManager**


```java

package org.springframework.transaction;

import org.springframework.lang.Nullable;

/**

 * @author Rod Johnson
 * @author Juergen Hoeller
 * @since 16.05.2003
 * @see org.springframework.transaction.support.TransactionTemplate
 * @see org.springframework.transaction.interceptor.TransactionInterceptor
 */
public interface PlatformTransactionManager extends TransactionManager {

	/**
	 * Return a currently active transaction or create a new one, according to
	 * the specified propagation behavior.
	 * <p>Note that parameters like isolation level or timeout will only be applied
	 * to new transactions, and thus be ignored when participating in active ones.
	 * <p>Furthermore, not all transaction definition settings will be supported
	 * by every transaction manager: A proper transaction manager implementation
	 * should throw an exception when unsupported settings are encountered.
	 * <p>An exception to the above rule is the read-only flag, which should be
	 * ignored if no explicit read-only mode is supported. Essentially, the
	 * read-only flag is just a hint for potential optimization.
	 * @param definition the TransactionDefinition instance (can be {@code null} for defaults),
	 * describing propagation behavior, isolation level, timeout etc.
	 * @return transaction status object representing the new or current transaction
	 * @throws TransactionException in case of lookup, creation, or system errors
	 * @throws IllegalTransactionStateException if the given transaction definition
	 * cannot be executed (for example, if a currently active transaction is in
	 * conflict with the specified propagation behavior)
	 * @see TransactionDefinition#getPropagationBehavior
	 * @see TransactionDefinition#getIsolationLevel
	 * @see TransactionDefinition#getTimeout
	 * @see TransactionDefinition#isReadOnly
	 */
	TransactionStatus getTransaction(@Nullable TransactionDefinition definition)
			throws TransactionException;

	/**
	 * Commit the given transaction, with regard to its status. If the transaction
	 * has been marked rollback-only programmatically, perform a rollback.
	 * <p>If the transaction wasn't a new one, omit the commit for proper
	 * participation in the surrounding transaction. If a previous transaction
	 * has been suspended to be able to create a new one, resume the previous
	 * transaction after committing the new one.
	 * <p>Note that when the commit call completes, no matter if normally or
	 * throwing an exception, the transaction must be fully completed and
	 * cleaned up. No rollback call should be expected in such a case.
	 * <p>If this method throws an exception other than a TransactionException,
	 * then some before-commit error caused the commit attempt to fail. For
	 * example, an O/R Mapping tool might have tried to flush changes to the
	 * database right before commit, with the resulting DataAccessException
	 * causing the transaction to fail. The original exception will be
	 * propagated to the caller of this commit method in such a case.
	 * @param status object returned by the {@code getTransaction} method
	 * @throws UnexpectedRollbackException in case of an unexpected rollback
	 * that the transaction coordinator initiated
	 * @throws HeuristicCompletionException in case of a transaction failure
	 * caused by a heuristic decision on the side of the transaction coordinator
	 * @throws TransactionSystemException in case of commit or system errors
	 * (typically caused by fundamental resource failures)
	 * @throws IllegalTransactionStateException if the given transaction
	 * is already completed (that is, committed or rolled back)
	 * @see TransactionStatus#setRollbackOnly
	 */
	void commit(TransactionStatus status) throws TransactionException;

	/**
	 * Perform a rollback of the given transaction.
	 * <p>If the transaction wasn't a new one, just set it rollback-only for proper
	 * participation in the surrounding transaction. If a previous transaction
	 * has been suspended to be able to create a new one, resume the previous
	 * transaction after rolling back the new one.
	 * <p><b>Do not call rollback on a transaction if commit threw an exception.</b>
	 * The transaction will already have been completed and cleaned up when commit
	 * returns, even in case of a commit exception. Consequently, a rollback call
	 * after commit failure will lead to an IllegalTransactionStateException.
	 * @param status object returned by the {@code getTransaction} method
	 * @throws TransactionSystemException in case of rollback or system errors
	 * (typically caused by fundamental resource failures)
	 * @throws IllegalTransactionStateException if the given transaction
	 * is already completed (that is, committed or rolled back)
	 */
	void rollback(TransactionStatus status) throws TransactionException;

}

```

<a id="markdown-21423-事务管理器实现类" name="21423-事务管理器实现类"></a>
##### 2.1.4.2.3. 事务管理器实现类
Spring 将事务管理委托给底层具体的持久化实现框架来完成。因此，Spring为不同的持久化框架提供了PlatformTransactionManager 接口的实现类。

|事务|	说明|
|---|---|
|org.springframework.transaction.jta.JtaTransactionManager|	使用JPA进行持久化时，使用该事务管理器
|org.springframework.orm.hibernate3.HibernateTransactionManager	|使用Hibernate X.0(X 可以为3 4 5)版本进行持久化时，使用该事务管理器
|org.springframework.jdbc.datasource.DataSourceTransactionManager|	使用Spring JDBC  或 Mybatis 等基于DataSource数据源的持久化技术时，使用 该事务管理器
|org.springframework.orm.jdo.JdoTransactionManager|	使用JDO进行持久化时 ，使用该事务管理器
|org.springframework.transaction.jta.JtaTransactionManager|	具有多个数据源的全局事务使用该事务管理器(不管采用何种持久化技术)



<a id="markdown-2143-编程式事务管理" name="2143-编程式事务管理"></a>
#### 2.1.4.3. 编程式事务管理
<a href="#menu" style="float:right">目录</a>

实际中很少使用

<a id="markdown-2144-使用xml配置声明式事务" name="2144-使用xml配置声明式事务"></a>
#### 2.1.4.4. 使用XML配置声明式事务
<a href="#menu" style="float:right">目录</a>

**使用原始的TransactionProxyFactoryBean**
Spring 2.0 之后， 由于可以通过aop/tx命名空间声明事务，因此该方式也不常用

```xml
<?xml version="1.0" encoding="UTF-8"?>  
<beans xmlns="http://www.springframework.org/schema/beans"  
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"  
    xmlns:aop="http://www.springframework.org/schema/aop" xmlns:p="http://www.springframework.org/schema/p"  
    xsi:schemaLocation="    
           http://www.springframework.org/schema/beans    
           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd    
           http://www.springframework.org/schema/aop    
           http://www.springframework.org/schema/aop/spring-aop-3.0.xsd  
           http://www.springframework.org/schema/context    
           http://www.springframework.org/schema/context/spring-context-3.0.xsd">  
    <!-- 配置数据源 -->  
    <bean id="dataSource"  
        class="org.springframework.jdbc.datasource.DriverManagerDataSource">  
        <property name="driverClassName" value="com.mysql.jdbc.Driver" />  
        <property name="url" value="jdbc:mysql://localhost:3306/test" />  
        <property name="username" value="root" />  
        <property name="password" value="christmas258@" />  
    </bean>  
    <!--配置一个JdbcTemplate实例，并将这个“共享的”，“安全的”实例注入到不同的DAO类中去 -->  
    <bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">  
        <property name="dataSource" ref="dataSource" />  
    </bean>  
    <!-- 声明事务管理器 -->  
    <bean id="txManager"  
        class="org.springframework.jdbc.datasource.DataSourceTransactionManager">  
        <property name="dataSource" ref="dataSource" />  
    </bean>  
    <!-- 需要实施事务增强的目标业务Bean -->  
    <bean id="libraryTarget" class="com.mucfc.dao.LibraryDaoImpl"  
        p:jdbcTemplate-ref="jdbcTemplate" />  
  
    <!-- 使用事务代理工厂类为目标业务Bean提供事务增强 -->  
    <bean id="libraryFactory"  
        class="org.springframework.transaction.interceptor.TransactionProxyFactoryBean"  
        p:transactionManager-ref="txManager" p:target-ref="libraryTarget">  
        <!-- 事务属性配置 -->  
        <property name="transactionAttributes">  
            <props>  
                <!-- 以get开头的方法采用只读型事务控制类型 -->  
                <prop key="get*">PROPAGATION_REQUIRED,readOnly</prop>  
                <!-- 所有方法均进行事务控制，如果当前没有事务，则新建一个事务 -->  
            <prop key="addBook">PROPAGATION_REQUIRED</prop>  
            </props>  
        </property>  
  
    </bean>  
</beans>  


```

缺点：
* 需要对每个需要事务支持的业务类进行单独的配置；
* 在指定事务方法时，只能通过方法名进行定义，无法利用方法签名的其他信息进行定位（如方法入参、访问与修饰符等）；
* 食物属性的配置串的规则比较麻烦，规则串虽然包括多项信息，但统一由逗号分隔的字符串来描述，不能利用IDE中的诱导输入功能，容易出错；
* 为业务类Bean添加事务支持时，在容器中既需要定义业务类Bean（通常命名为xxxTarget），又需要通过TransactionProxyFactoryBean对其进行代理以生成支持事务的代理Bean。实际上，我们只会从容器中返回代理的Bean，而业务类Bean仅是为了能代理才定义的，这样就造成相似的东西有两份配置，增强了配置信息量



**使用aop/tx命名空间的方式**
```xml
<?xml version="1.0" encoding="UTF-8"?>  
<beans xmlns="http://www.springframework.org/schema/beans"  
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"  
    xmlns:aop="http://www.springframework.org/schema/aop" xmlns:p="http://www.springframework.org/schema/p"  
    xmlns:tx="http://www.springframework.org/schema/tx"  
    xsi:schemaLocation="    
           http://www.springframework.org/schema/beans    
           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd    
           http://www.springframework.org/schema/tx    
           http://www.springframework.org/schema/tx/spring-tx-3.0.xsd  
           http://www.springframework.org/schema/aop    
           http://www.springframework.org/schema/aop/spring-aop-3.0.xsd  
           http://www.springframework.org/schema/context    
           http://www.springframework.org/schema/context/spring-context-3.0.xsd">  
    <!-- 配置数据源 -->  
    <bean id="dataSource"  
        class="org.springframework.jdbc.datasource.DriverManagerDataSource">  
        <property name="driverClassName" value="com.mysql.jdbc.Driver" />  
        <property name="url" value="jdbc:mysql://localhost:3306/test" />  
        <property name="username" value="root" />  
        <property name="password" value="christmas258@" />  
    </bean>  
    <!--配置一个JdbcTemplate实例，并将这个“共享的”，“安全的”实例注入到不同的DAO类中去 -->  
    <bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">  
        <property name="dataSource" ref="dataSource" />  
    </bean>  
    <!-- 声明事务管理器 -->  
    <bean id="txManager"  
        class="org.springframework.jdbc.datasource.DataSourceTransactionManager">  
        <property name="dataSource" ref="dataSource" />  
    </bean>  
    <!-- 需要实施事务增强的目标业务Bean -->  
    <bean id="libraryTarget" class="com.mucfc.dao.LibraryDaoImpl"  
        p:jdbcTemplate-ref="jdbcTemplate" />  
  
    <!-- 使用tx/aop来配置 -->  
    <aop:config>  
        <!-- 通过aop定义事务增强切面 -->  
        <aop:pointcut id="serviceMethod"  
            expression="execution(* com.mucfc.dao.LibraryDaoImpl.*(..))" />  
        <!-- 引用事务增强 -->  
        <aop:advisor pointcut-ref="serviceMethod" advice-ref="txAdvice" />  
    </aop:config>  
  
    <!--事务增强 -->  
    <tx:advice id="txAdvice" transaction-manager="txManager">  
        <!-- 事务属性定义 -->  
        <tx:attributes>  
            <tx:method name="get*" read-only="false" />  
            <tx:method name="add*" rollback-for="Exception" />  
            <tx:method name="del*" />  
        </tx:attributes>  
    </tx:advice>  
</beans>  
```

<a id="markdown-2145-使用注解配置事务" name="2145-使用注解配置事务"></a>
#### 2.1.4.5. 使用注解配置事务
<a href="#menu" style="float:right">目录</a>

```java

package org.springframework.transaction.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;
import org.springframework.transaction.TransactionDefinition;

//注解在类上或者方法上
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Transactional {

	@AliasFor("transactionManager")
	String value() default "";
	@AliasFor("value")
	String transactionManager() default "";

	Propagation propagation() default Propagation.REQUIRED;
	Isolation isolation() default Isolation.DEFAULT;
	int timeout() default TransactionDefinition.TIMEOUT_DEFAULT;
	boolean readOnly() default false;
	Class<? extends Throwable>[] rollbackFor() default {};
	String[] rollbackForClassName() default {};
	Class<? extends Throwable>[] noRollbackFor() default {};
	String[] noRollbackForClassName() default {};
}
```
**transactionManager**
表示应用那个应用那个TransactionManager.值是事务管理器的bea名称，相关的事务管理器查看上述内容几种事务管理器的说明。

**propagation**
事务传播特性

**isolation**
事务隔离特性

**timeout**
事务超时时间

**readOnly**
是否只读事务

**rollbackFor/rollbackForClassName**
导致事务回滚的异常类数组

**noRollbackFor/noRollbackForClassName**
不会导致事务回滚的异常类名字数组

**@Transactional 使用应该注意的地方**

* 默认情况下，如果在事务中抛出了未检查异常（继承自 RuntimeException 的异常）或者 Error，则 Spring 将回滚事务；除此之外，Spring 不会回滚事务。你如果想要在特定的异常回滚可以考虑rollbackFor()等属性
* @Transactional 只能应用到 public 方法才有效。这是因为在使用 Spring AOP 代理时，Spring 会调用 TransactionInterceptor在目标方法执行前后进行拦截之前，DynamicAdvisedInterceptor（CglibAopProxy的内部类）的的 intercept方法或 JdkDynamicAopProxy 的 invoke 方法会间接调用 AbstractFallbackTransactionAttributeSource（Spring 通过这个类获取@Transactional 注解的事务属性配置属性信息）的 computeTransactionAttribute 方法。
```java
protected TransactionAttribute computeTransactionAttribute(Method method, @Nullable Class<?> targetClass) {
		// Don't allow no-public methods as required.
		if (allowPublicMethodsOnly() && !Modifier.isPublic(method.getModifiers())) {
			return null;
		}
}
```
若不是 public，就不会获取@Transactional 的属性配置信息，最终会造成不会用 TransactionInterceptor 来拦截该目标方法进行事务管理。整个事务执行的时序图如下
![](https://upload-images.jianshu.io/upload_images/5281821-fecd22fffdc8d181.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1000/format/webp)

* Spring 的 AOP 的自调用问题
在 Spring 的 AOP 代理下，只有目标方法由外部调用，目标方法才由 Spring 生成的代理对象来管理，这会造成自调用问题。若同一类中的其他没有@Transactional注解的方法内部调用有@Transactional注解的方法，有@Transactional注解的方法的事务被忽略，不会发生回滚。这个问题是由于Spring AOP 代理造成的(如下面代码所示）。之所以没有应用事务，是因为在内部调用，而代理后的类(把目标类作为成员变量静态代理)只是调用成员变量中的对应方法，自然也就没有aop中的advice，造成只能调用父类的方法。另外一个问题是只能应用在public方法上。为解决这两个问题，使用 AspectJ 取代 Spring AOP 代理。
```java
@Transactional
public void saveUser(){
        User user = new User();
        user.setAge(22);
        user.setName("mask");
        logger.info("save the user{}",user);
        userRepository.save(user);
       // throw new RuntimeException("exception");
    }
public void saveUserBack(){
    saveUser();   //自调用发生
}
```
另外也可以把注解加到方法上来解决。


<a id="markdown-2146-事务实现原理" name="2146-事务实现原理"></a>
#### 2.1.4.6. 事务实现原理
<a href="#menu" style="float:right">目录</a>



<a id="markdown-215-spring-cache" name="215-spring-cache"></a>
### 2.1.5. Spring Cache
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2151-几个重要概念缓存注解" name="2151-几个重要概念缓存注解"></a>
#### 2.1.5.1. 几个重要概念&缓存注解

|名称|	解释|
|---|---|
|Cache|	缓存接口，定义缓存操作。实现有：RedisCache、EhCacheCache、ConcurrentMapCache等
|CacheManager|	缓存管理器，管理各种缓存（cache）组件
|@Cacheable	|主要针对方法配置，能够根据方法的请求参数对其进行缓存
|@CacheEvict	|清空缓存
|@CachePut|	保证方法被调用，又希望结果被缓存。与@Cacheable区别在于是否每次都调用方法，常用于更新
|@EnableCaching	|开启基于注解的缓存
|keyGenerator|	缓存数据时key生成策略
|serialize|	缓存数据时value序列化策略
|@CacheConfig|	统一配置本类的缓存注解的属性

**@Cacheable/@CachePut/@CacheEvict 主要的参数**
|名称|	解释|
|---|---|
|value|	缓存的名称，在 spring 配置文件中定义，必须指定至少一个.例如：@Cacheable(value=”mycache”) 或者@Cacheable(value={”cache1”,”cache2”}
|key	|缓存的 key，可以为空，如果指定要按照 SpEL 表达式编写，如果不指定，则缺省按照方法的所有参数进行组合.例如：@Cacheable(value=”testcache”,key=”#id”)
|condition|	缓存的条件，可以为空，使用 SpEL 编写，返回 true 或者 false，只有为 true 才进行缓存/清除缓存.例如：@Cacheable(value=”testcache”,condition=”#userName.length()>2”)
|unless	|否定缓存。当条件结果为TRUE时，就不会缓存。@Cacheable(value=”testcache”,unless=”#userName.length()>2”)
|allEntries(@CacheEvict )|	是否清空所有缓存内容，缺省为 false，如果指定为 true,则方法调用后将立即清空所有缓存.例如：@CachEvict(value=”testcache”,allEntries=true)
|beforeInvocation(@CacheEvict)	|是否在方法执行前就清空，缺省为 false，如果指定为 true，则在方法还没有执行的时候就清空缓存，缺省情况下，如果方法执行抛出异常，则不会清空缓存,例如：@CachEvict(value=”testcache”，beforeInvocation=true)

<a id="markdown-2152-spel上下文数据" name="2152-spel上下文数据"></a>
#### 2.1.5.2. SpEL上下文数据
Spring Cache提供了一些供我们使用的SpEL上下文数据，下表直接摘自Spring官方文档：

|名称|	位置|	描述	|示例|
|---|---|---|---|
|methodName|	root对象|	当前被调用的方法名|	#root.methodname
|method|	root对象|	当前被调用的方法|	#root.method.name
|target	|root对象	|当前被调用的目标对象实例	|#root.target
|targetClass|	root对象|	当前被调用的目标对象的类	|#root.targetClass
|args	|root对象|	当前被调用的方法的参数列表|	#root.args[0]
|caches|	root对象	|当前方法调用使用的缓存列表	|#root.caches[0].name
|Argument Name|	执行上下文	|当前被调用的方法的参数，如findArtisan(Artisan artisan),可以通过#artsian.id获得参数|	#artsian.id
|result|	执行上下文|	方法执行后的返回值（仅当方法执行后的判断有效，如 unless cacheEvict的beforeInvocation=false）|	#result


注意：
1. 当我们要使用root对象的属性作为key时我们也可以将“#root”省略，因为Spring默认使用的就是root对象的属性。 如
@Cacheable(key = "targetClass + methodName +#p0")
2. 使用方法参数时我们可以直接使用“#参数名”或者“#p参数index”。 如：
@Cacheable(value="users", key="#id")
@Cacheable(value="users", key="#p0")

SpEL提供了多种运算符

|类型|	运算符|
|---|---|
|关系	|<，>，<=，>=，==，!=，lt，gt，le，ge，eq，ne
|算术	|+，- ，* ，/，%，^
|逻辑	|&&，||，!，and，or，not，between，instanceof
|条件	|?: (ternary)，?: (elvis)
|正则表达式	|matches
|其他类型	|?.，?[…]，![…]，^[…]，$[…]

<a id="markdown-2153-基本使用" name="2153-基本使用"></a>
#### 2.1.5.3. 基本使用

**引入依赖**
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-cache</artifactId>
</dependency>
```
* 启动类添加@EnableCaching 注解

**缓存@Cacheable**
@Cacheable注解会先查询是否已经有缓存，有会使用缓存，没有则会执行方法并缓存。

* 注解说明
```java
String[] value() default {}; 
String key() default ""; //缓存键
String[] cacheNames() default {}; //缓存名称和value注解差不多，二选一
String keyGenerator() default ""; //key的生成器。key/keyGenerator二选一使用
String cacheManager() default ""; //指定缓存管理器
String cacheResolver() default ""; //或者指定获取解析器
String condition() default ""; //条件符合则缓存
String unless() default ""; //条件符合则不缓存
boolean sync() default false; //是否使用异步模式
```
* 例子
```java
@Cacheable(value = "emp" ,key = "targetClass + methodName +#p0")
public List<NewJob> queryAll(User uid) {
    return newJobDao.findAllByUid(uid);
}
```
此处的value是必需的，它指定了你的缓存存放在哪块命名空间。
此处的key是使用的spEL表达式，参考上章。这里有一个小坑，如果你把methodName换成method运行会报错，观察它们的返回类型，原因在于methodName是String而methoh是Method。
此处的User实体类一定要实现序列化public class User implements Serializable，否则会报java.io.NotSerializableException异常。
到这里，你已经可以运行程序检验缓存功能是否实现。



**配置@CacheConfig**
当我们需要缓存的地方越来越多，你可以使用@CacheConfig(cacheNames = {"myCache"})注解来统一指定value的值，这时可省略value，如果你在你的方法依旧写上了value，那么依然以方法的value值为准。

使用方法如下：
```java
@CacheConfig(cacheNames = {"myCache"})
public class BotRelationServiceImpl implements BotRelationService {
    @Override
    @Cacheable(key = "targetClass + methodName +#p0")//此处没写value
    public List<BotRelation> findAllLimit(int num) {
        return botRelationRepository.findAllLimit(num);
    }
    
}
```
查看它的其它属性
```java
String keyGenerator() default "";  //key的生成器。key/keyGenerator二选一使用
String cacheManager() default "";  //指定缓存管理器
String cacheResolver() default ""; //或者指定获取解析器
```

**更新@CachePut**
@CachePut注解的作用 主要针对方法配置，能够根据方法的请求参数对其结果进行缓存，和 @Cacheable 不同的是，它每次都会触发真实方法的调用 。简单来说就是用户更新缓存数据。但需要注意的是该注解的value 和 key 必须与要更新的缓存相同，也就是与@Cacheable 相同。示例：

```java
@CachePut(value = "emp", key = "targetClass + #p0")
public NewJob updata(NewJob job) {
    NewJob newJob = newJobDao.findAllById(job.getId());
    newJob.updata(job);
    return job;
}

@Cacheable(value = "emp", key = "targetClass +#p0")//清空缓存
public NewJob save(NewJob job) {
    newJobDao.save(job);
    return job;
}
```
查看它的其它属性
```java
String[] cacheNames() default {}; //与value二选一
String keyGenerator() default "";  //key的生成器。key/keyGenerator二选一使用
String cacheManager() default "";  //指定缓存管理器
String cacheResolver() default ""; //或者指定获取解析器
String condition() default ""; //条件符合则缓存
String unless() default ""; //条件符合则不缓存
```

**清除@CacheEvict**
@CachEvict 的作用 主要针对方法配置，能够根据一定的条件对缓存进行清空 。

* allEntries	
    * 是否清空所有缓存内容，缺省为 false，如果指定为 true，则方法调用后将立即清空所有缓存	
    * @CachEvict(value=”testcache”,allEntries=true)
* beforeInvocation	
    * 是否在方法执行前就清空，缺省为 false，如果指定为 true，则在方法还没有执行的时候就清空缓存，缺省情况下，如果方法执行抛出异常，则不会清空缓存	
    * @CachEvict(value=”testcache”，beforeInvocation=true)
示例：
```java
@Cacheable(value = "emp",key = "#p0.id")
public NewJob save(NewJob job) {
    newJobDao.save(job);
    return job;
}

//清除一条缓存，key为要清空的数据
@CacheEvict(value="emp",key="#id")
public void delect(int id) {
    newJobDao.deleteAllById(id);
}

//方法调用后清空所有缓存
@CacheEvict(value="accountCache",allEntries=true)
public void delectAll() {
    newJobDao.deleteAll();
}

//方法调用前清空所有缓存
@CacheEvict(value="accountCache",beforeInvocation=true)
public void delectAll() {
    newJobDao.deleteAll();
}
```
其他属性
```java
String[] cacheNames() default {}; //与value二选一
String keyGenerator() default "";  //key的生成器。key/keyGenerator二选一使用
String cacheManager() default "";  //指定缓存管理器
String cacheResolver() default ""; //或者指定获取解析器
String condition() default ""; //条件符合则清空
```

**组合@Caching**
有时候我们可能组合多个Cache注解使用，此时就需要@Caching组合多个注解标签了。

```java
@Caching(cacheable = {
        @Cacheable(value = "emp",key = "#p0"),
        ...
},
put = {
        @CachePut(value = "emp",key = "#p0"),
        ...
},evict = {
        @CacheEvict(value = "emp",key = "#p0"),
        ....
})
public User save(User user) {
    ....
}
```

<a id="markdown-216-常用注解" name="216-常用注解"></a>
### 2.1.6. 常用注解
<a href="#menu" style="float:right">目录</a>

<a id="markdown-217-常用工具类" name="217-常用工具类"></a>
### 2.1.7. 常用工具类
<a href="#menu" style="float:right">目录</a>


<a id="markdown-22-sppring-mvc" name="22-sppring-mvc"></a>
## 2.2. Sppring MVC
<a href="#menu" style="float:right">目录</a>

<a id="markdown-221-mvc体系概述" name="221-mvc体系概述"></a>
### 2.2.1. MVC体系概述
<a href="#menu" style="float:right">目录</a>

Spring MVC是一个基于Java的实现了MVC设计模式的请求驱动类型的轻量级Web框架，通过把Model，View，Controller分离，将web层进行职责解耦，把复杂的web应用分成逻辑清晰的几部分，简化开发，减少出错，方便组内开发人员之间的配合。

<a id="markdown-2211-mvc-架构" name="2211-mvc-架构"></a>
#### 2.2.1.1. MVC 架构
* 模型：包含了应用中所需的各种展现数据
* 视图：由数据的多种表述所组成，它将会展现给用户。
* 控制器：将会处理用户的操作，它是连接模型和视图的桥梁

![](http://dl.iteye.com/upload/attachment/0068/8752/620f63e1-ee68-30c9-a53d-13107e634364.png)


![Spring mvc 框架模型]()


* 客户端发出Http请求，Web应用服务器接收请求，如果匹配DispatcherServlet的请求路径(web.xml指定)，则web容器将该请求转交给DispatcherServlet处理
* DispatcherServlet接收请求后，将根据请求的信息(URL,HTTP方法，请求报文头，请求参数，Cookie)及HandlerMapping的配置找到处理请求的处理器(Handler).可将HandlerMapping看作路由控制器，将Handler看作目标主机。
* DispatcherServlet得到对应的Handler后，通过 HandlerAdapter对Handler进行封装，再以统一的适配器接口调用Handler. HandlerAdapter是Spring MVC的框架级接口， HandlerAdapter是一个适配器，它用统一的接口对各种Handler方法进行调用。
* 处理器完成业务逻辑后将返回一个ModelAndView给DispatcherServlet,ModelAndView包含了视图逻辑名和模型数据信息。
* ModelAndView中包含的是"逻辑视图名"而非真正的视图对象 ，DispatcherServlet借由ViewResolver完成逻辑视图名得到真实视图对象的解析工作
* 当得到真实的视图对象View后，DispatcherServlet就使用这个View对象对DispatcherServlet中的模型数据进行视图渲染
* 最终客户端得到的响应消息可能是一个普通的HTML页面，也可能是一个XML或JSON串，甚至一张图片或一个PDF文档等不同的媒体形式

![DispatcherServlet]()
DispatcherServlet.class
```java
protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
    this.logRequest(request);
    Map<String, Object> attributesSnapshot = null;
    if (WebUtils.isIncludeRequest(request)) {
        attributesSnapshot = new HashMap();
        Enumeration attrNames = request.getAttributeNames();

        label95:
        while(true) {
            String attrName;
            do {
                if (!attrNames.hasMoreElements()) {
                    break label95;
                }

                attrName = (String)attrNames.nextElement();
            } while(!this.cleanupAfterInclude && !attrName.startsWith("org.springframework.web.servlet"));

            attributesSnapshot.put(attrName, request.getAttribute(attrName));
        }
    }

    request.setAttribute(WEB_APPLICATION_CONTEXT_ATTRIBUTE, this.getWebApplicationContext());
    request.setAttribute(LOCALE_RESOLVER_ATTRIBUTE, this.localeResolver);
    request.setAttribute(THEME_RESOLVER_ATTRIBUTE, this.themeResolver);
    request.setAttribute(THEME_SOURCE_ATTRIBUTE, this.getThemeSource());
    if (this.flashMapManager != null) {
        FlashMap inputFlashMap = this.flashMapManager.retrieveAndUpdate(request, response);
        if (inputFlashMap != null) {
            request.setAttribute(INPUT_FLASH_MAP_ATTRIBUTE, Collections.unmodifiableMap(inputFlashMap));
        }

        request.setAttribute(OUTPUT_FLASH_MAP_ATTRIBUTE, new FlashMap());
        request.setAttribute(FLASH_MAP_MANAGER_ATTRIBUTE, this.flashMapManager);
    }

    try {
        this.doDispatch(request, response);
    } finally {
        if (!WebAsyncUtils.getAsyncManager(request).isConcurrentHandlingStarted() && attributesSnapshot != null) {
            this.restoreAttributesAfterInclude(request, attributesSnapshot);
        }

    }

}
```
DispatcherServlet.class
```java
protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
    //processedRequest是经过checkMultipart方法处理过的request请求
　　 HttpServletRequest processedRequest = request;　　
    HandlerExecutionChain mappedHandler = null;
    boolean multipartRequestParsed = false;

    WebAsyncManager asyncManager = WebAsyncUtils.getAsyncManager(request);

    try {
        ModelAndView mv = null;
        Exception dispatchException = null;

        try {
　　　　　　　　　　//1、文件上传解析，如果请求类型是multipart将通过MultipartResolver进行文件上传解析；  
            processedRequest = checkMultipart(request);
            multipartRequestParsed = (processedRequest != request);

　　　　　　　//2.通过HandlerMapping，将请求映射到处理器（返回一个HandlerExecutionChain，它包括一个处理器、多个HandlerInterceptor拦截器）；
            // Determine handler for the current request.　　　确定当前请求的处理程序。
            mappedHandler = getHandler(processedRequest);　　　　　　//解析第一个方法
            if (mappedHandler == null || mappedHandler.getHandler() == null) {
                noHandlerFound(processedRequest, response);
                return;
            }
　　　　　　　//3、通过HandlerAdapter支持多种类型的处理器(HandlerExecutionChain中的处理器)；  
            // Determine handler adapter for the current request.　　确定当前请求的处理程序适配器。
            HandlerAdapter ha = getHandlerAdapter(mappedHandler.getHandler());　　　　//解析第二个方法

            // Process last-modified header, if supported by the handler.　　如果处理程序支持，则处理最后修改的头文件。
            String method = request.getMethod();　　　　//得到当前的http方法。  
            boolean isGet = "GET".equals(method);
            if (isGet || "HEAD".equals(method)) {　　　　//处理http的head方法。这种方法应该很少用  
                long lastModified = ha.getLastModified(request, mappedHandler.getHandler());
                if (logger.isDebugEnabled()) {
                    logger.debug("Last-Modified value for [" + getRequestUri(request) + "] is: " + lastModified);
                }
                if (new ServletWebRequest(request, response).checkNotModified(lastModified) && isGet) {
                    return;
                }
            }
　　　　　　　　　　//4.1调用HandlerExecutionChain的interceptor  
            if (!mappedHandler.applyPreHandle(processedRequest, response)) {
                return;
            }
　　　　　　　//4.2执行解析handler中的args，调用（invoke） controller的方法。得到视图  
            // Actually invoke the handler.　　实际上调用处理程序。
            //解析第三个方法
            mv = ha.handle(processedRequest, response, mappedHandler.getHandler());　　　　

            if (asyncManager.isConcurrentHandlingStarted()) {
                return;
            }
　　　　　　　//4.3调用HandlerExecutionChain的interceptor  
            applyDefaultViewName(processedRequest, mv);
            mappedHandler.applyPostHandle(processedRequest, response, mv);
        }
        catch (Exception ex) {
            dispatchException = ex;
        }
　　　　　//5.解析视图、处理异常  
        processDispatchResult(processedRequest, response, mappedHandler, mv, dispatchException);
    }
    catch (Exception ex) {
        triggerAfterCompletion(processedRequest, response, mappedHandler, ex);
    }
    catch (Error err) {
        triggerAfterCompletionWithError(processedRequest, response, mappedHandler, err);
    }
    finally {
        if (asyncManager.isConcurrentHandlingStarted()) {
            // Instead of postHandle and afterCompletion　　而不是后处理和完成后
            if (mappedHandler != null) {
                mappedHandler.applyAfterConcurrentHandlingStarted(processedRequest, response);
            }
        }
        else {
            // Clean up any resources used by a multipart request.　　清理多部分请求使用的资源。
            if (multipartRequestParsed) {
                cleanupMultipart(processedRequest);
            }
        }
    }
}
```
DispatcherServlet.class
```java
@Nullable
protected HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
    if (this.handlerMappings != null) {
        Iterator var2 = this.handlerMappings.iterator();

        while(var2.hasNext()) {
            HandlerMapping mapping = (HandlerMapping)var2.next();
            HandlerExecutionChain handler = mapping.getHandler(request);
            if (handler != null) {
                return handler;
            }
        }
    }

    return null;
}
```
AbstractHandlerMapping.class
```java
public final HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
    Object handler = this.getHandlerInternal(request);
    if (handler == null) {
        handler = this.getDefaultHandler();
    }

    if (handler == null) {
        return null;
    } else {
        if (handler instanceof String) {
            String handlerName = (String)handler;
            handler = this.obtainApplicationContext().getBean(handlerName);
        }
        //获得处理程序执行链
        HandlerExecutionChain executionChain = this.getHandlerExecutionChain(handler, request);
        if (this.logger.isTraceEnabled()) {
            this.logger.trace("Mapped to " + handler);
        } else if (this.logger.isDebugEnabled() && !request.getDispatcherType().equals(DispatcherType.ASYNC)) {
            this.logger.debug("Mapped to " + executionChain.getHandler());
        }

        if (CorsUtils.isCorsRequest(request)) {
            CorsConfiguration globalConfig = this.corsConfigurationSource.getCorsConfiguration(request);
            CorsConfiguration handlerConfig = this.getCorsConfiguration(handler, request);
            CorsConfiguration config = globalConfig != null ? globalConfig.combine(handlerConfig) : handlerConfig;
            executionChain = this.getCorsHandlerExecutionChain(request, executionChain, config);
        }

        return executionChain;
    }
}
```
AbstractHandlerMapping.class
```JAVA
protected HandlerExecutionChain getHandlerExecutionChain(Object handler, HttpServletRequest request) {
     //如果没有获得则创建一个
　　　HandlerExecutionChain chain = (handler instanceof HandlerExecutionChain ?
            (HandlerExecutionChain) handler : new HandlerExecutionChain(handler));
　　　　　//获得IP地址及端口后的URL地址
    String lookupPath = this.urlPathHelper.getLookupPathForRequest(request);
    
　　　　　//在HandlerExecutionChain中添加拦截器
　　　　　// 遍历 SpringMVC 容器的所有拦截器
　　　　　for (HandlerInterceptor interceptor : this.adaptedInterceptors) {
　　　　　　　// 判断拦截器类型，属于 MappedInterceptor，则先匹配路径，否则直接添加
        if (interceptor instanceof MappedInterceptor) {
            MappedInterceptor mappedInterceptor = (MappedInterceptor) interceptor;
            
　　　　　　　　　　//根据lookupPath来获取Interceptor
　　　　　　　　　　if (mappedInterceptor.matches(lookupPath, this.pathMatcher)) {
                chain.addInterceptor(mappedInterceptor.getInterceptor());
            }
        }
        else {
            chain.addInterceptor(interceptor);
        }
    }
    return chain;
}
```
**结论：**处理器执行链=1个hanlder+N个Interceptor
![](https://img-my.csdn.net/uploads/201304/13/1365825551_8302.png)
![](https://img-blog.csdn.net/20170504161709191?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvSjA4MDYyNA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)
Spring工作流程描述
1. 用户向服务器发送请求，请求被Spring 前端控制Servelt DispatcherServlet捕获；
2. DispatcherServlet对请求URL进行解析，得到请求资源标识符（URI）。然后根据该URI，调用HandlerMapping获得该Handler配置的所有相关的对象（包括Handler对象以及Handler对象对应的拦截器），最后以HandlerExecutionChain对象的形式返回；
3. DispatcherServlet 根据获得的Handler，选择一个合适的HandlerAdapter。（附注：如果成功获得HandlerAdapter后，此时将开始执行拦截器的preHandler(...)方法）
4.  提取Request中的模型数据，填充Handler入参，开始执行Handler（Controller)。 在填充Handler的入参过程中，根据你的配置，Spring将帮你做一些额外的工作：
HttpMessageConveter： 将请求消息（如Json、xml等数据）转换成一个对象，将对象转换为指定的响应信息
数据转换：对请求消息进行数据转换。如String转换成Integer、Double等
数据根式化：对请求消息进行数据格式化。 如将字符串转换成格式化数字或格式化日期等
数据验证： 验证数据的有效性（长度、格式等），验证结果存储到BindingResult或Error中
5.  Handler执行完成后，向DispatcherServlet 返回一个ModelAndView对象；
6.  根据返回的ModelAndView，选择一个适合的ViewResolver（必须是已经注册到Spring容器中的ViewResolver)返回给DispatcherServlet ；
7. ViewResolver 结合Model和View，来渲染视图
8. 将渲染结果返回给客户端。
<a id="markdown-222-restful" name="222-restful"></a>
### 2.2.2. Restful
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2221-url-设计" name="2221-url-设计"></a>
#### 2.2.2.1. URL 设计

**动词 + 宾语**
RESTful 的核心思想就是，客户端发出的数据操作指令都是"动词 + 宾语"的结构。比如，GET /articles这个命令，GET是动词，/articles是宾语。

* 动词通常就是五种 HTTP 方法，对应 CRUD 操作。
    * GET：读取（Read）
    * POST：新建（Create）
    * PUT：更新（Update）
    * PATCH：更新（Update），通常是部分更新
    * DELETE：删除（Delete）
    * **根据 HTTP 规范，动词一律大写**

**动词的覆盖**
有些客户端只能使用GET和POST这两种方法。服务器必须接受POST模拟其他三个方法（PUT、PATCH、DELETE）。

这时，客户端发出的 HTTP 请求，要加上X-HTTP-Method-Override属性，告诉服务器应该使用哪一个动词，覆盖POST方法。
```
POST /api/Person/4 HTTP/1.1  
X-HTTP-Method-Override: PUT
```
上面代码中，X-HTTP-Method-Override指定本次请求的方法是PUT，而不是POST。

**宾语必须是名词**
宾语就是 API 的 URL，是 HTTP 动词作用的对象。它应该是名词，不能是动词。比如，/articles这个 URL 就是正确的，而下面的 URL 不是名词，所以都是错误的。

```
/getAllCars
/createNewCar
/deleteAllRedCars
```

**复数 URL**
既然 URL 是名词，那么应该使用复数，还是单数？

这没有统一的规定，但是常见的操作是读取一个集合，比如GET /articles（读取所有文章），这里明显应该是复数。

为了统一起见，建议都使用复数 URL，比如GET /articles/2要好于GET /article/2。

**避免多级 URL**
常见的情况是，资源需要多级分类，因此很容易写出多级的 URL，比如获取某个作者的某一类文章。


GET /authors/12/categories/2
这种 URL 不利于扩展，语义也不明确，往往要想一会，才能明白含义。

更好的做法是，除了第一级，其他级别都用查询字符串表达。


GET /authors/12?categories=2
下面是另一个例子，查询已发布的文章。你可能会设计成下面的 URL。


GET /articles/published
查询字符串的写法明显更好。


GET /articles?published=true
<a id="markdown-2222-状态码" name="2222-状态码"></a>
#### 2.2.2.2. 状态码
**状态码必须精确**
客户端的每一次请求，服务器都必须给出回应。回应包括 HTTP 状态码和数据两部分。

HTTP 状态码就是一个三位数，分成五个类别。
* 1xx：相关信息
* 2xx：操作成功
* 3xx：重定向
* 4xx：客户端错误
* 5xx：服务器错误

这五大类总共包含100多种状态码，覆盖了绝大部分可能遇到的情况。每一种状态码都有标准的（或者约定的）解释，客户端只需查看状态码，就可以判断出发生了什么情况，所以服务器应该返回尽可能精确的状态码。

API 不需要1xx状态码，下面介绍其他四类状态码的精确含义。

**2xx 状态码**
200状态码表示操作成功，但是不同的方法可以返回更精确的状态码。
```
GET: 200 OK
POST: 201 Created
PUT: 200 OK
PATCH: 200 OK
DELETE: 204 No Content
```
上面代码中，POST返回201状态码，表示生成了新的资源；DELETE返回204状态码，表示资源已经不存在。

此外，202 Accepted状态码表示服务器已经收到请求，但还未进行处理，会在未来再处理，通常用于异步操作。下面是一个例子。

```JSON
HTTP/1.1 202 Accepted

{
  "task": {
    "href": "/api/company/job-management/jobs/2130040",
    "id": "2130040"
  }
}
```

**3xx 状态码**
API 用不到301状态码（永久重定向）和302状态码（暂时重定向，307也是这个含义），因为它们可以由应用级别返回，浏览器会直接跳转，API 级别可以不考虑这两种情况。

API 用到的3xx状态码，主要是303 See Other，表示参考另一个 URL。它与302和307的含义一样，也是"暂时重定向"，区别在于302和307用于GET请求，而303用于POST、PUT和DELETE请求。收到303以后，浏览器不会自动跳转，而会让用户自己决定下一步怎么办。下面是一个例子。

```
HTTP/1.1 303 See Other
Location: /api/orders/12345
```

**4xx 状态码**
4xx状态码表示客户端错误，主要有下面几种。
* 400 Bad Request：服务器不理解客户端的请求，未做任何处理。
* 401 Unauthorized：用户未提供身份验证凭据，或者没有通过身份验证。
* 403 Forbidden：用户通过了身份验证，但是不具有访问资源所需的权限。
* 404 Not Found：所请求的资源不存在，或不可用。
* 405 Method Not Allowed：用户已经通过身份验证，但是所用的 HTTP 方法不在他的权限之内。
* 410 Gone：所请求的资源已从这个地址转移，不再可用。
* 415 Unsupported Media Type：客户端要求的返回格式不支持。比如，API 只能返回 JSON 格式，但是客户端要求返回 XML 格式。
* 422 Unprocessable Entity ：客户端上传的附件无法处理，导致请求失败。
* 429 Too Many Requests：客户端的请求次数超过限额。

**5xx 状态码**
5xx状态码表示服务端错误。一般来说，API 不会向用户透露服务器的详细信息，所以只要两个状态码就够了。
* 500 Internal Server Error：客户端请求有效，服务器处理时发生了意外。
* 503 Service Unavailable：服务器无法处理请求，一般用于网站维护状态。

<a id="markdown-2223-服务器回应" name="2223-服务器回应"></a>
#### 2.2.2.3. 服务器回应
**不要返回纯本文**
API 返回的数据格式，不应该是纯文本，而应该是一个 JSON 对象，因为这样才能返回标准的结构化数据。所以，服务器回应的 HTTP 头的Content-Type属性要设为application/json。

客户端请求时，也要明确告诉服务器，可以接受 JSON 格式，即请求的 HTTP 头的ACCEPT属性也要设成application/json。下面是一个例子。

```
GET /orders/2 HTTP/1.1 
Accept: application/json
```

**发生错误时，不要返回 200 状态码**
有一种不恰当的做法是，即使发生错误，也返回200状态码，把错误信息放在数据体里面，就像下面这样。

```JSON
HTTP/1.1 200 OK
Content-Type: application/json

{
  "status": "failure",
  "data": {
    "error": "Expected at least two items in list."
  }
}
```
上面代码中，解析数据体以后，才能得知操作失败。

这张做法实际上取消了状态码，这是完全不可取的。正确的做法是，状态码反映发生的错误，具体的错误信息放在数据体里面返回。下面是一个例子。

```JSON
HTTP/1.1 400 Bad Request
Content-Type: application/json

{
  "error": "Invalid payoad.",
  "detail": {
     "surname": "This field is required."
  }
}
```

**提供链接**
API 的使用者未必知道，URL 是怎么设计的。一个解决方法就是，在回应中，给出相关链接，便于下一步操作。这样的话，用户只要记住一个 URL，就可以发现其他的 URL。这种方法叫做 HATEOAS。

举例来说，GitHub 的 API 都在 api.github.com 这个域名。访问它，就可以得到其他 URL。

```JSON
{
  ...
  "feeds_url": "https://api.github.com/feeds",
  "followers_url": "https://api.github.com/user/followers",
  "following_url": "https://api.github.com/user/following{/target}",
  "gists_url": "https://api.github.com/gists{/gist_id}",
  "hub_url": "https://api.github.com/hub",
  ...
}
```
上面的回应中，挑一个 URL 访问，又可以得到别的 URL。对于用户来说，不需要记住 URL 设计，只要从 api.github.com 一步步查找就可以了。

HATEOAS 的格式没有统一规定，上面例子中，GitHub 将它们与其他属性放在一起。更好的做法应该是，将相关链接与其他属性分开。

```JSON
HTTP/1.1 200 OK
Content-Type: application/json

{
  "status": "In progress",
   "links": {[
    { "rel":"cancel", "method": "delete", "href":"/api/status/12345" } ,
    { "rel":"edit", "method": "put", "href":"/api/status/12345" }
  ]}
}
```

<a id="markdown-223-注解说明" name="223-注解说明"></a>
### 2.2.3. 注解说明
<a href="#menu" style="float:right">目录</a>

**@ControllerAdvice**
```java
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface ControllerAdvice {
    @AliasFor("basePackages")
    String[] value() default {};
    @AliasFor("value")
    String[] basePackages() default {};
    Class<?>[] basePackageClasses() default {};
    Class<?>[] assignableTypes() default {};
    Class<? extends Annotation>[] annotations() default {};
}
```
@ExceptionHandler的作用主要在于声明一个或多个类型的异常，当符合条件的Controller抛出这些异常之后将会对这些异常进行捕获，然后按照其标注的方法的逻辑进行处理，从而改变返回的视图信息。如下是@ExceptionHandler的属性结构

```java
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(NullPointerException.class)
    public BaseResult globalException(HttpServletResponse response,NullPointerException ex){


        log.info("GlobalExceptionHandler...");
        log.info("错误代码："  + response.getStatus());
        BaseResult result = new WebResult(WebResult.RESULT_FAIL,"request error:"+response.getStatus(),"GlobalExceptionHandler:"+ex.getMessage());
        return result;
    }
}

```

**@CookieValue**
用来获取Cookie中的值

```java
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CookieValue {
    @AliasFor("name")
    String value() default "";

    @AliasFor("value")
    String name() default "";

    boolean required() default true;

    String defaultValue() default "\n\t\t\n\t\t\n\ue000\ue001\ue002\n\t\t\t\t\n";
}
```
例子
```java
@RequestMapping("/testCookie")
public String testCookie(@CookieValue(value="name",required=false) String name,
         @CookieValue(value="age",required=false) Integer age){
     System.out.println(name+","+age);
     return "hello";
 }
```
**@CrossOrigin**

用于跨域配置
```java
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CrossOrigin {
    /** @deprecated */
    @Deprecated
    String[] DEFAULT_ORIGINS = new String[]{"*"};
    /** @deprecated */
    @Deprecated
    String[] DEFAULT_ALLOWED_HEADERS = new String[]{"*"};
    /** @deprecated */
    @Deprecated
    boolean DEFAULT_ALLOW_CREDENTIALS = false;
    /** @deprecated */
    @Deprecated
    long DEFAULT_MAX_AGE = 1800L;

    @AliasFor("origins")
    String[] value() default {};

    @AliasFor("value")
    String[] origins() default {};

    String[] allowedHeaders() default {};

    String[] exposedHeaders() default {};

    RequestMethod[] methods() default {};

    String allowCredentials() default "";

    long maxAge() default -1L;
}
```
细粒度跨域配置
使用@CrossOrigin,需要和@RequestMapping等映射注解相关配置放一起
```java
@CrossOrigin
@GetMapping("/{id}")
public Account retrieve(@PathVariable Long id) {
    // ...
}

```

全局跨域配置
```java
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/hello");
    }
}
```

**@RequestMapping相关**

```java
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface RequestMapping {
    String name() default "";

    @AliasFor("path")
    String[] value() default {};

    @AliasFor("value")
    String[] path() default {};

    RequestMethod[] method() default {};

    String[] params() default {};

    String[] headers() default {};

    String[] consumes() default {};

    String[] produces() default {};
}
```

RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
RequestMapping注解有六个属性，下面我们把她分成三类进行说明（下面有相应示例）。

* value：指定请求的实际地址，指定的地址可以是URI Template 模式（后面将会说明）；
* method：  指定请求的method类型， GET、POST、PUT、DELETE等；
* consumes： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
* produces:    指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回；
* params： 指定request中必须包含某些参数值是，才让该方法处理。
* headers： 指定request中必须包含某些指定的header值，才能让该方法处理请求。

类似的注解还有以下几种，分别对应不同的请求方法
* GetMapping
* PostMapping
* PutMapping
* DeleteMapping


**@InitBinder**
【作用】WebDataBinder实现将请求request绑定到复杂属性时的请求字符string到属性的转换 
【原因】一般的string, int, long会自动绑定到参数，但是自定义的格式spring就不知道如何绑定了 
【实现】所以要继承PropertyEditorSupport，实现自己的属性编辑器PropertyEditor,绑定到WebDataBinder ( binder.registerCustomEditor)，覆盖方法setAsText，需要注解@InitBinder 

【样例】表单发送数据mydate，格式201801–10，自定义数据绑定


```java
@Controller
public class UserController {
    //【控制器内】初始化绑定器
    //绑定一个属性编辑器
    //参数列表是解析后的类型class，要解析的属性field,自定义的PropertyEditor
    //表示当前控制器的所有类型是Date的mydate使用MyDateEditor属性编辑器
    //如果没有"mydate",表示所有Date都使用同一个MyDateEditor属性编辑器
    @InitBinder
    public void bind (WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(Date.class,"mydate",new MyDateEditor());
    }

    //user的mydate属性接收【表单】提交的参数，格式201801--10
    @RequestMapping("/date")
    public void find( User user, HttpServletResponse response) throws Exception{
        response.getWriter().write("my date:"+user.getMydate());
    }
}

```
```java
public class MyDateEditor extends PropertyEditorSupport{
    @Override
    public String getAsText() {
        //获取属性值
        Date date = (Date) getValue();
        DateFormat dateFormat = new SimpleDateFormat("yyyyMM--dd");
        String str = dateFormat.format(date);
        String mydate =  str.substring(0,4)+str.substring(4,6)+"--"+str.substring(8,10);
        System.out.println(mydate);
        return mydate;
    }

    //text: 201801--10
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMM--dd");
        try {
            System.out.println(dateFormat.parse(text));
            //设置属性值
            setValue(dateFormat.parse(text));
        }catch (ParseException e){
            System.out.println("ParseException....................");
        }
    }
}
```

**@MatrixVariable**
```java
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MatrixVariable {
    @AliasFor("name")
    String value() default "";

    @AliasFor("value")
    String name() default "";

    String pathVar() default "\n\t\t\n\t\t\n\ue000\ue001\ue002\n\t\t\t\t\n";

    boolean required() default true;

    String defaultValue() default "\n\t\t\n\t\t\n\ue000\ue001\ue002\n\t\t\t\t\n";
}

```
注解@MatrixVariable可以将键值对写到路径中映射作为controller中的方法参数，使用前需要配置

Springboot 默认是无法使用矩阵变量绑定参数的。需要覆盖WebMvcConfigurer中的configurePathMatch方法。

```java
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper urlPathHelper=new UrlPathHelper();
        urlPathHelper.setRemoveSemicolonContent(false);
        configurer.setUrlPathHelper(urlPathHelper);
    }
}
```

如果是传统的XML配置
```xml
<mvc:annotation-driven enable-matrix-variables="true"/>
```

* 在 Matrix Variable 中，多个变量可以使用 “;”（分号）分隔，例如：
    * /books;author=Tom;year=2016
* 如果一个变量对应多个值，那么可以使用 “,”（逗号）分隔，例如：
    * author=smart1,smart2,smart3
* 或者使用重复的变量名，例如：
    * author=smart1;author=smart2;author=smart3

下面举一个例子来说明，代码如下：
```java
//GET /books/22;a=12;b=22
@RequestMapping(value="/books/{bookId)",method=RequestMethod.GET)
public void findBookId (@PathVariable String bookId,@MatrixVariable int a){
    ...
}
```
相应的 bookId 和 a 都会被映射到这个方法中，如果匹配不到，则会报 "bad request”。如果 URI 只是 "/books/11”，则也可以映射到这个方法中，但需要指定空值不报错：@MatrixVariable(required=false）。

再来看一个更复杂的例子，以深入理解，代码如下：

```java
//GET /books/42;a=11/author/21;a=22
@RequestMapping(value="／books/{bookId}/authors/{authorId}", method=RequestMethod.GET)
public void findBook(
    @MatrixVariabIe(value="a", pathVar="bookId") int q1,
    @MatrixVariabIe(value="a", pathVar="authorId) int q2){
        //q1 == 11
        //q2 == 22
}
```

**ModelAttribute**
```java
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ModelAttribute {
    @AliasFor("name")
    String value() default "";

    @AliasFor("value")
    String name() default "";

    boolean binding() default true;
}
```
* 用在方法上    
    * 一个控制器可以拥有多个@ModelAttribute方法。同个控制器内的所有这些方法，都会在@RequestMapping方法之前被调用
    * 方法通过返回值的方式默认地将添加一个属性；
    * 方法接收一个Model对象，然后可以向其中添加任意数量的属性
* 用在方法参数上    
    * 标注在方法参数上的@ModelAttribute说明了该方法参数的值将由model中取得。如果model中找不到，那么该参数会先被实例化，然后被添加到model中。在model中存在以后，请求中所有名称匹配的参数都会填充到该参数中。        
    * 它可能因为@SessionAttributes标注的使用已经存在于model中。       
    * 它可能因为在同个控制器中使用了@ModelAttribute方法已经存在于model中。        
    * 它可能是由URI模板变量和类型转换中取得的。        
    * 它可能是调用了自身的默认构造器被实例化出来的

作者：eagle_king
链接：https://www.jianshu.com/p/56c70a69f349
来源：简书
简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。

**@Controller**
```java
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Controller {
    @AliasFor(
        annotation = Component.class
    )
    String value() default "";
}
```
在SpringMVC 中，控制器Controller 负责处理由DispatcherServlet 分发的请求，它把用户请求的数据经过业务处理层处理之后封装成一个Model ，然后再把该Model 返回给对应的View 进行展示。在SpringMVC 中提供了一个非常简便的定义Controller 的方法，你无需继承特定的类或实现特定的接口，只需使用@Controller 标记一个类是Controller ，然后使用@RequestMapping 和@RequestParam 等一些注解用以定义URL 请求和Controller 方法之间的映射，这样的Controller 就能被外界访问到。此外Controller 不会直接依赖于HttpServletRequest 和HttpServletResponse 等HttpServlet 对象，它们可以通过Controller 的方法参数灵活的获取到。

@Controller 用于标记在一个类上，使用它标记的类就是一个SpringMVC Controller 对象。分发处理器将会扫描使用了该注解的类的方法，并检测该方法是否使用了@RequestMapping 注解。@Controller 只是定义了一个控制器类，而使用@RequestMapping 注解的方法才是真正处理请求的处理器。单单使用@Controller 标记在一个类上还不能真正意义上的说它就是SpringMVC 的一个控制器类，因为这个时候Spring 还不认识它。那么要如何做Spring 才能认识它呢？这个时候就需要我们把这个控制器类交给Spring 来管理。有两种方式：
* 在SpringMVC 的配置文件中定义MyController 的bean 对象。
* 在SpringMVC 的配置文件中告诉Spring 该到哪里去找标记为@Controller 的Controller 控制器。

```xml
<!--方式一-->
<bean class="com.host.app.web.controller.MyController"/>
<!--方式二-->
< context:component-scan base-package = "com.host.app.web" />//路径写到controller的上一层(扫描包详解见下面浅析)
```

**@Resource和@Autowired**
@Resource和@Autowired都是做bean的注入时使用，其实@Resource并不是Spring的注解，它的包是javax.annotation.Resource，需要导入，但是Spring支持该注解的注入。

1、共同点
两者都可以写在字段和setter方法上。两者如果都写在字段上，那么就不需要再写setter方法。
2、不同
（1）@Autowired
@Autowired为Spring提供的注解，需要导入包org.springframework.beans.factory.annotation.Autowired;只按照byType注入。
```java
public class TestServiceImpl {
    // 下面两种@Autowired只要使用一种即可
    @Autowired
    private UserDao userDao; // 用于字段上
    
    @Autowired
    public void setUserDao(UserDao userDao) { // 用于属性的方法上
        this.userDao = userDao;
    }
}
```
@Autowired注解是按照类型（byType）装配依赖对象，默认情况下它要求依赖对象必须存在，如果允许null值，可以设置它的required属性为false。如果我们想使用按照名称（byName）来装配，可以结合@Qualifier注解一起使用。如下：
```java
public class TestServiceImpl {
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao; 
}
```
（2）@Resource

@Resource默认按照ByName自动注入，由J2EE提供，需要导入包javax.annotation.Resource。@Resource有两个重要的属性：name和type，而Spring将@Resource注解的name属性解析为bean的名字，而type属性则解析为bean的类型。所以，如果使用name属性，则使用byName的自动注入策略，而使用type属性时则使用byType自动注入策略。如果既不制定name也不制定type属性，这时将通过反射机制使用byName自动注入策略。

```java
public class TestServiceImpl {
    // 下面两种@Resource只要使用一种即可
    @Resource(name="userDao")
    private UserDao userDao; // 用于字段上
    
    @Resource(name="userDao")
    public void setUserDao(UserDao userDao) { // 用于属性的setter方法上
        this.userDao = userDao;
    }
}
```
注：最好是将@Resource放在setter方法上，因为这样更符合面向对象的思想，通过set、get去操作属性，而不是直接去操作属性。

@Resource装配顺序：

①如果同时指定了name和type，则从Spring上下文中找到唯一匹配的bean进行装配，找不到则抛出异常。

②如果指定了name，则从上下文中查找名称（id）匹配的bean进行装配，找不到则抛出异常。

③如果指定了type，则从上下文中找到类似匹配的唯一bean进行装配，找不到或是找到多个，都会抛出异常。

④如果既没有指定name，又没有指定type，则自动按照byName方式进行装配；如果没有匹配，则回退为一个原始类型进行匹配，如果匹配则自动装配。

@Resource的作用相当于@Autowired，只不过@Autowired按照byType自动注入。

**@ModelAttribute和 @SessionAttributes**
代表的是：该Controller的所有方法在调用前，先执行此@ModelAttribute方法，可用于注解和方法参数中，可以把这个@ModelAttribute特性，应用在BaseController当中，所有的Controller继承BaseController，即可实现在调用Controller时，先执行@ModelAttribute方法。

 @SessionAttributes即将值放到session作用域中，写在class上面。

具体示例参见下面：使用 @ModelAttribute 和 @SessionAttributes 传递和保存数据

**@PathVariable**
用于将请求URL中的模板变量映射到功能处理方法的参数上，即取出uri模板中的变量作为参数。如：
```java
@Controller  
public class TestController {  
     @RequestMapping(value="/user/{userId}/roles/{roleId}",method = RequestMethod.GET)  
     public String getLogin(@PathVariable("userId") String userId,  
         @PathVariable("roleId") String roleId){  
         System.out.println("User Id : " + userId);  
         System.out.println("Role Id : " + roleId);  
         return "hello";  
     }  
     @RequestMapping(value="/product/{productId}",method = RequestMethod.GET)  
     public String getProduct(@PathVariable("productId") String productId){  
           System.out.println("Product Id : " + productId);  
           return "hello";  
     }  
     @RequestMapping(value="/javabeat/{regexp1:[a-z-]+}",  
           method = RequestMethod.GET)  
     public String getRegExp(@PathVariable("regexp1") String regexp1){  
           System.out.println("URI Part 1 : " + regexp1);  
           return "hello";  
     }  
}
```
**@requestParam**
@requestParam主要用于在SpringMVC后台控制层获取参数，类似一种是request.getParameter("name")，它有三个常用参数：defaultValue = "0", required = false, value = "isApp"；defaultValue 表示设置默认值，required 铜过boolean设置是否是必须要传入的参数，value 值表示接受的传入的参数类型。

**@ResponseBody**
作用： 该注解用于将Controller的方法返回的对象，通过适当的HttpMessageConverter转换为指定格式后，写入到Response对象的body数据区。

使用时机：返回的数据不是html标签的页面，而是其他某种格式的数据时（如json、xml等）使用；

**@Component**
相当于通用的注解，当不知道一些类归到哪个层时使用，但是不建议。

**@Repository**
用于注解dao层，在daoImpl类上面注解。
注：
1、使用 @RequestMapping 来映射 Request 请求与处理器
方式一、通过常见的类路径和方法路径结合访问controller方法

方式二、使用uri模板

```java
@Controller
@RequestMapping ( "/test/{variable1}" )
public class MyController {

    @RequestMapping ( "/showView/{variable2}" )
    public ModelAndView showView( @PathVariable String variable1, @PathVariable ( "variable2" ) int variable2) {
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName( "viewName" );
       modelAndView.addObject( " 需要放到 model 中的属性名称 " , " 对应的属性值，它是一个对象 " );
       return modelAndView;
    }
} 
```
URI 模板就是在URI 中给定一个变量，然后在映射的时候动态的给该变量赋值。如URI 模板http://localhost/app/{variable1}/index.html ，这个模板里面包含一个变量variable1 ，那么当我们请求http://localhost/app/hello/index.html 的时候，该URL 就跟模板相匹配，只是把模板中的variable1 用hello 来取代。这个变量在SpringMVC 中是使用@PathVariable 来标记的。在SpringMVC 中，我们可以使用@PathVariable 来标记一个Controller 的处理方法参数，表示该参数的值将使用URI 模板中对应的变量的值来赋值。

代码中我们定义了两个URI 变量，一个是控制器类上的variable1 ，一个是showView 方法上的variable2 ，然后在showView 方法的参数里面使用@PathVariable 标记使用了这两个变量。所以当我们使用/test/hello/showView/2.do 来请求的时候就可以访问到MyController 的showView 方法，这个时候variable1 就被赋予值hello ，variable2 就被赋予值2 ，然后我们在showView 方法参数里面标注了参数variable1 和variable2 是来自访问路径的path 变量，这样方法参数variable1 和variable2 就被分别赋予hello 和2 。方法参数variable1 是定义为String 类型，variable2 是定义为int 类型，像这种简单类型在进行赋值的时候Spring 是会帮我们自动转换的。

   在上面的代码中我们可以看到在标记variable1 为path 变量的时候我们使用的是@PathVariable ，而在标记variable2 的时候使用的是@PathVariable(“variable2”) 。这两者有什么区别呢？第一种情况就默认去URI 模板中找跟参数名相同的变量，但是这种情况只有在使用debug 模式进行编译的时候才可以，而第二种情况是明确规定使用的就是URI 模板中的variable2 变量。当不是使用debug 模式进行编译，或者是所需要使用的变量名跟参数名不相同的时候，就要使用第二种方式明确指出使用的是URI 模板中的哪个变量。

 除了在请求路径中使用URI 模板，定义变量之外，@RequestMapping 中还支持通配符“* ”。如下面的代码我就可以使用/myTest/whatever/wildcard.do 访问到Controller 的testWildcard 方法。如：

```
@Controller
@RequestMapping ( "/myTest" )
public class MyController {
    @RequestMapping ( "*/wildcard" )
    public String testWildcard() {
       System. out .println( "wildcard------------" );
       return "wildcard" ;
    }  
}
```
当@RequestParam中没有指定参数名称时，Spring 在代码是debug 编译的情况下会默认取更方法参数同名的参数，如果不是debug 编译的就会报错。

2、使用 @RequestMapping 的一些高级用法
（1）params属性
```java
@RequestMapping (value= "testParams" , params={ "param1=value1" , "param2" , "!param3" })
    public String testParams() {
       System. out .println( "test Params..........." );
       return "testParams" ;
    }
```
用@RequestMapping 的params 属性指定了三个参数，这些参数都是针对请求参数而言的，它们分别表示参数param1 的值必须等于value1 ，参数param2 必须存在，值无所谓，参数param3 必须不存在，只有当请求/testParams.do 并且满足指定的三个参数条件的时候才能访问到该方法。所以当请求/testParams.do?param1=value1&param2=value2 的时候能够正确访问到该testParams 方法，当请求/testParams.do?param1=value1&param2=value2&param3=value3 的时候就不能够正常的访问到该方法，因为在@RequestMapping 的params 参数里面指定了参数param3 是不能存在的。

（2）method属性
```java
@RequestMapping (value= "testMethod" , method={RequestMethod. GET , RequestMethod. DELETE })
    public String testMethod() {
       return "method" ;
    }
```
在上面的代码中就使用method 参数限制了以GET 或DELETE 方法请求/testMethod 的时候才能访问到该Controller 的testMethod 方法。

（3）headers属性
```java
@RequestMapping (value= "testHeaders" , headers={ "host=localhost" , "Accept" })
    public String testHeaders() {
       return "headers" ;
    }
```
headers 属性的用法和功能与params 属性相似。在上面的代码中当请求/testHeaders.do 的时候只有当请求头包含Accept 信息，且请求的host 为localhost 的时候才能正确的访问到testHeaders 方法。

3、 @RequestMapping 标记的处理器方法支持的方法参数和返回类型
1. 支持的方法参数类型
（1 ）HttpServlet 对象，主要包括HttpServletRequest 、HttpServletResponse 和HttpSession 对象。 这些参数Spring 在调用处理器方法的时候���自动给它们赋值，所以当在处理器方法中需要使用到这些对象的时候，可以直接在方法上给定一个方法参数的申明，然后在方法体里面直接用就可以了。但是有一点需要注意的是在使用HttpSession 对象的时候，如果此时HttpSession 对象还没有建立起来的话就会有问题。
（2 ）Spring 自己的WebRequest 对象。 使用该对象可以访问到存放在HttpServletRequest 和HttpSession 中的属性值。
（3 ）InputStream 、OutputStream 、Reader 和Writer 。 InputStream 和Reader 是针对HttpServletRequest 而言的，可以从里面取数据；OutputStream 和Writer 是针对HttpServletResponse 而言的，可以往里面写数据。
（4 ）使用@PathVariable 、@RequestParam 、@CookieValue 和@RequestHeader 标记的参数。
（5 ）使用@ModelAttribute 标记的参数。
（6 ）java.util.Map 、Spring 封装的Model 和ModelMap 。 这些都可以用来封装模型数据，用来给视图做展示。
（7 ）实体类。 可以用来接收上传的参数。
（8 ）Spring 封装的MultipartFile 。 用来接收上传文件的。
（9 ）Spring 封装的Errors 和BindingResult 对象。 这两个对象参数必须紧接在需要验证的实体对象参数之后，它里面包含了实体对象的验证结果。

2. 支持的返回类型
（1 ）一个包含模型和视图的ModelAndView 对象。
（2 ）一个模型对象，这主要包括Spring 封装好的Model 和ModelMap ，以及java.util.Map ，当没有视图返回的时候视图名称将由RequestToViewNameTranslator 来决定。
（3 ）一个View 对象。这个时候如果在渲染视图的过程中模型的话就可以给处理器方法定义一个模型参数，然后在方法体里面往模型中添加值。
（4 ）一个String 字符串。这往往代表的是一个视图名称。这个时候如果需要在渲染视图的过程中需要模型的话就可以给处理器方法一个模型参数，然后在方法体里面往模型中添加值就可以了。
（5 ）返回值是void 。这种情况一般是我们直接把返回结果写到HttpServletResponse 中了，如果没有写的话，那么Spring 将会利用RequestToViewNameTranslator 来返回一个对应的视图名称。如果视图中需要模型的话，处理方法与返回字符串的情况相同。
（6 ）如果处理器方法被注解@ResponseBody 标记的话，那么处理器方法的任何返回类型都会通过HttpMessageConverters 转换之后写到HttpServletResponse 中，而不会像上面的那些情况一样当做视图或者模型来处理。
（7 ）除以上几种情况之外的其他任何返回类型都会被当做模型中的一个属性来处理，而返回的视图还是由RequestToViewNameTranslator 来决定，添加到模型中的属性名称可以在该方法上用@ModelAttribute(“attributeName”) 来定义，否则将使用返回类型的类名称的首字母小写形式来表示。使用@ModelAttribute 标记的方法会在@RequestMapping 标记的方法执行之前执行。

4. 使用 @ModelAttribute 和 @SessionAttributes 传递和保存数据
SpringMVC 支持使用 @ModelAttribute 和 @SessionAttributes 在不同的模型（model）和控制器之间共享数据。 @ModelAttribute 主要有两种使用方式，一种是标注在方法上，一种是标注在 Controller 方法参数上。

当 @ModelAttribute 标记在方法上的时候，该方法将在处理器方法执行之前执行，然后把返回的对象存放在 session 或模型属性中，属性名称可以使用 @ModelAttribute(“attributeName”) 在标记方法的时候指定，若未指定，则使用返回类型的类名称（首字母小写）作为属性名称。关于 @ModelAttribute 标记在方法上时对应的属性是存放在 session 中还是存放在模型中，我们来做一个实验，看下面一段代码。

```java
@Controller
@RequestMapping ( "/myTest" )
public class MyController {

    @ModelAttribute ( "hello" )
    public String getModel() {
       System. out .println( "-------------Hello---------" );
       return "world" ;
    }

    @ModelAttribute ( "intValue" )
    public int getInteger() {
       System. out .println( "-------------intValue---------------" );
       return 10;
    }

    @RequestMapping ( "sayHello" )
    public void sayHello( @ModelAttribute ( "hello" ) String hello, @ModelAttribute ( "intValue" ) int num, @ModelAttribute ( "user2" ) User user, Writer writer, HttpSession session) throws IOException {
       writer.write( "Hello " + hello + " , Hello " + user.getUsername() + num);
       writer.write( "\r" );
       Enumeration enume = session.getAttributeNames();
       while (enume.hasMoreElements())
           writer.write(enume.nextElement() + "\r" );
    }

    @ModelAttribute ( "user2" )
    public User getUser(){
       System. out .println( "---------getUser-------------" );
       return new User(3, "user2" );
    }
}
```
当我们请求 /myTest/sayHello.do 的时候使用 @ModelAttribute 标记的方法会先执行，然后把它们返回的对象存放到模型中。最终访问到 sayHello 方法的时候，使用 @ModelAttribute 标记的方法参数都能被正确的注入值。执行结果如下所示：

 Hello world,Hello user210

由执行结果我们可以看出来，此时 session 中没有包含任何属性，也就是说上面的那些对象都是存放在模型属性中，而不是存放在 session 属性中。那要如何才能存放在 session 属性中呢？这个时候我们先引入一个新的概念 @SessionAttributes ，它的用法会在讲完 @ModelAttribute 之后介绍，这里我们就先拿来用一下。我们在 MyController 类上加上 @SessionAttributes 属性标记哪些是需要存放到 session 中的。看下面的代码：

```java
@Controller
@RequestMapping ( "/myTest" )
@SessionAttributes (value={ "intValue" , "stringValue" }, types={User. class })
public class MyController {

    @ModelAttribute ( "hello" )
    public String getModel() {
       System. out .println( "-------------Hello---------" );
       return "world" ;
    }

    @ModelAttribute ( "intValue" )
    public int getInteger() {
       System. out .println( "-------------intValue---------------" );
       return 10;
    }
   
    @RequestMapping ( "sayHello" )
    public void sayHello(Map<String, Object> map, @ModelAttribute ( "hello" ) String hello, @ModelAttribute ( "intValue" ) int num, @ModelAttribute ( "user2" ) User user, Writer writer, HttpServletRequest request) throws IOException {
       map.put( "stringValue" , "String" );
       writer.write( "Hello " + hello + " , Hello " + user.getUsername() + num);
       writer.write( "\r" );
       HttpSession session = request.getSession();
       Enumeration enume = session.getAttributeNames();
       while (enume.hasMoreElements())
           writer.write(enume.nextElement() + "\r" );
       System. out .println(session);
    }

    @ModelAttribute ( "user2" )
    public User getUser() {
       System. out .println( "---------getUser-------------" );
       return new User(3, "user2" );
    }
}
```
在上面代码中我们指定了属性为 intValue 或 stringValue 或者类型为 User 的都会放到 Session中，利用上面的代码当我们访问 /myTest/sayHello.do 的时候，结果如下：

 Hello world,Hello user210

仍然没有打印出任何 session 属性，这是怎么回事呢？怎么定义了把模型中属性名为 intValue 的对象和类型为 User 的对象存到 session 中，而实际上没有加进去呢？难道我们错啦？我们当然没有错，只是在第一次访问 /myTest/sayHello.do 的时候 @SessionAttributes 定义了需要存放到 session 中的属性，而且这个模型中也有对应的属性，但是这个时候还没有加到 session 中，所以 session 中不会有任何属性，等处理器方法执行完成后 Spring 才会把模型中对应的属性添加到 session 中。所以当请求第二次的时候就会出现如下结果：

Hello world,Hello user210
user2
intValue
stringValue

当 @ModelAttribute 标记在处理器方法参数上的时候，表示该参数的值将从模型或者 Session 中取对应名称的属性值，该名称可以通过 @ModelAttribute(“attributeName”) 来指定，若未指定，则使用参数类型的类名称（首字母小写）作为属性名称。

5、@PathVariable和@RequestParam的区别 
请求路径上有个id的变量值，可以通过@PathVariable来获取  @RequestMapping(value = "/page/{id}", method = RequestMethod.GET)  
@RequestParam用来获得静态的URL请求入参     spring注解时action里用到。

简介：
handler method 参数绑定常用的注解,我们根据他们处理的Request的不同内容部分分为四类：（主要讲解常用类型）

A、处理requet uri 部分（这里指uri template中variable，不含queryString部分）的注解：   @PathVariable;

B、处理request header部分的注解：   @RequestHeader, @CookieValue;

C、处理request body部分的注解：@RequestParam,  @RequestBody;

D、处理attribute类型是注解： @SessionAttributes, @ModelAttribute;

（1）、@PathVariable
当使用@RequestMapping URI template 样式映射时， 即 someUrl/{paramId}, 这时的paramId可通过 @Pathvariable注解绑定它传过来的值到方法的参数上。

示例代码：

```java
@Controller  
@RequestMapping("/owners/{ownerId}")  
public class RelativePathUriTemplateController {  
  
  @RequestMapping("/pets/{petId}")  
  public void findPet(@PathVariable String ownerId, @PathVariable String petId, Model model) {      
    // implementation omitted   
  }  
} 
```
上面代码把URI template 中变量 ownerId的值和petId的值，绑定到方法的参数上。若方法参数名称和需要绑定的uri template中变量名称不一致，需要在@PathVariable("name")指定uri template中的名称。

（2）、 @RequestHeader、@CookieValue
@RequestHeader 注解，可以把Request请求header部分的值绑定到方法的参数上。

示例代码：

这是一个Request 的header部分：
```
Host                    localhost:8080  
Accept                  text/html,application/xhtml+xml,application/xml;q=0.9  
Accept-Language         fr,en-gb;q=0.7,en;q=0.3  
Accept-Encoding         gzip,deflate  
Accept-Charset          ISO-8859-1,utf-8;q=0.7,*;q=0.7  
Keep-Alive              300  
```
```java
@RequestMapping("/displayHeaderInfo.do")  
public void displayHeaderInfo(@RequestHeader("Accept-Encoding") String encoding,  
                              @RequestHeader("Keep-Alive") long keepAlive)  {  
}  
```
上面的代码，把request header部分的 Accept-Encoding的值，绑定到参数encoding上了， Keep-Alive header的值绑定到参数keepAlive上。

@CookieValue 可以把Request header中关于cookie的值绑定到方法的参数上。

例如有如下Cookie值：

JSESSIONID=415A4AC178C59DACE0B2C9CA727CDD84

```java
@RequestMapping("/displayHeaderInfo.do")  
public void displayHeaderInfo(@CookieValue("JSESSIONID") String cookie)  {  
} 
```
即把JSESSIONID的值绑定到参数cookie上。

（3）、@RequestParam, @RequestBody
@RequestParam 

A） 常用来处理简单类型的绑定，通过Request.getParameter() 获取的String可直接转换为简单类型的情况（ String--> 简单类型的转换操作由ConversionService配置的转换器来完成）；因为使用request.getParameter()方式获取参数，所以可以处理get 方式中queryString的值，也可以处理post方式中 body data的值；

B）用来处理Content-Type: 为 application/x-www-form-urlencoded编码的内容，提交方式GET、POST；

C) 该注解有两个属性： value、required； value用来指定要传入值的id名称，required用来指示参数是否必须绑定；

示例代码：

```java
@Controller  
@RequestMapping("/pets")  
@SessionAttributes("pet")  
public class EditPetForm {  
    @RequestMapping(method = RequestMethod.GET)  
 public String setupForm(@RequestParam("petId") int petId, ModelMap model) {  
       Pet pet = this.clinic.loadPet(petId);  
   model.addAttribute("pet", pet);  
   return "petForm";  
   }
} 
```

@RequestBody

该注解常用来处理Content-Type: 不是application/x-www-form-urlencoded编码的内容，例如application/json, application/xml等；

它是通过使用HandlerAdapter 配置的HttpMessageConverters来解析post data body，然后绑定到相应的bean上的。

因为配置有FormHttpMessageConverter，所以也可以用来处理 application/x-www-form-urlencoded的内容，处理完的结果放在一个MultiValueMap<String, String>里，这种情况在某些特殊需求下使用，详情查看FormHttpMessageConverter api;

示例代码：
```java
@RequestMapping(value = "/something", method = RequestMethod.PUT)  
public void handle(@RequestBody String body, Writer writer) throws IOException {  
  writer.write(body);  
} 
```
（4）、@SessionAttributes, @ModelAttribute@SessionAttributes:

该注解用来绑定HttpSession中的attribute对象的值，便于在方法中的参数里使用。

该注解有value、types两个属性，可以通过名字和类型指定要使用的attribute 对象；

```java
@Controller  
@RequestMapping("/editPet.do")  
@SessionAttributes("pet")  
public class EditPetForm {  
    // ...   
} 
```
@ModelAttribute

该注解有两个用法，一个是用于方法上，一个是用于参数上；

用于方法上时：  通常用来在处理@RequestMapping之前，为请求绑定需要从后台查询的model；

用于参数上时： 用来通过名称对应，把相应名称的值绑定到注解的参数bean上；要绑定的值来源于：

A） @SessionAttributes 启用的attribute 对象上；

B） @ModelAttribute 用于方法上时指定的model对象；

C） 上述两种情况都没有时，new一个需要绑定的bean对象，然后把request中按名称对应的方式把值绑定到bean中。

 

用到方法上@ModelAttribute的示例代码：
```java
@ModelAttribute  
public Account addAccount(@RequestParam String number) {  
    return accountManager.findAccount(number);  
} 
```
这种方式实际的效果就是在调用@RequestMapping的方法之前，为request对象的model里put（“account”， Account）。

用在参数上的@ModelAttribute示例代码：
```java
@RequestMapping(value="/owners/{ownerId}/pets/{petId}/edit", method = RequestMethod.POST)  
public String processSubmit(@ModelAttribute Pet pet) {  
     
} 
```
首先查询 @SessionAttributes有无绑定的Pet对象，若没有则查询@ModelAttribute方法层面上是否绑定了Pet对象，若没有则将URI template中的值按对应的名称绑定到Pet对象的各属性上。

 

6、< context:component-scan base-package = "" />浅析
component-scan 默认扫描的注解类型是 @Component，不过，在 @Component 语义基础上细化后的 @Repository, @Service 和 @Controller 也同样可以获得 component-scan 的青睐

有了< context:component-scan >，另一个< context:annotation-config />标签根本可以移除掉，因为已经被包含进去了

另外< context:annotation-config />还提供了两个子标签

1. < context:include-filter> //指定扫描的路径

2. < context:exclude-filter> //排除扫描的路径

< context:component-scan>有一个use-default-filters属性，属性默认为true,表示会扫描指定包下的全部的标有@Component的类，并注册成bean.也就是@Component的子注解@Service,@Reposity等。

这种扫描的粒度有点太大，如果你只想扫描指定包下面的Controller或其他内容则设置use-default-filters属性为false，表示不再按照scan指定的包扫描，而是按照< context:include-filter>指定的包扫描，示例：

```xml
<context:component-scan base-package="com.tan" use-default-filters="false">
        <context:include-filter type="regex" expression="com.tan.*"/>//注意后面要写.*
</context:component-scan>
当没有设置use-default-filters属性或者属性为true时，表示基于base-packge包下指定扫描的具体路径
<context:component-scan base-package="com.tan" >
        <context:include-filter type="regex" expression=".controller.*"/>
        <context:include-filter type="regex" expression=".service.*"/>
        <context:include-filter type="regex" expression=".dao.*"/>
</>
```

效果相当于：
```xml
<context:component-scan base-package="com.tan" >
        <context:exclude-filter type="regex" expression=".model.*"/>
</>
```

<a id="markdown-224-拦截器" name="224-拦截器"></a>
### 2.2.4. 拦截器 
<a href="#menu" style="float:right">目录</a>

拦截器的本质是责任链
HandlerInterceptor有三个方法，分别用于Controller调用前执行,如果返回false,则Controller不会被调用;Controller调用后执行(Controller异常不会调用);最终执行(异常或者正常都会被调用)
```java

public interface HandlerInterceptor {
    default boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    default void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    default void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}

```
```java
protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpServletRequest processedRequest = request;
        HandlerExecutionChain mappedHandler = null;
        boolean multipartRequestParsed = false;
        WebAsyncManager asyncManager = WebAsyncUtils.getAsyncManager(request);

        try {
            try {
                ModelAndView mv = null;
                Object dispatchException = null;

                try {
                    processedRequest = this.checkMultipart(request);
                    multipartRequestParsed = processedRequest != request;
                    mappedHandler = this.getHandler(processedRequest);
                    if (mappedHandler == null) {
                        this.noHandlerFound(processedRequest, response);
                        return;
                    }

                    HandlerAdapter ha = this.getHandlerAdapter(mappedHandler.getHandler());
                    String method = request.getMethod();
                    boolean isGet = "GET".equals(method);
                    if (isGet || "HEAD".equals(method)) {
                        long lastModified = ha.getLastModified(request, mappedHandler.getHandler());
                        if ((new ServletWebRequest(request, response)).checkNotModified(lastModified) && isGet) {
                            return;
                        }
                    }
                    //pre调用
                    if (!mappedHandler.applyPreHandle(processedRequest, response)) {
                        return;
                    }
                    //controler调用
                    mv = ha.handle(processedRequest, response, mappedHandler.getHandler());
                    if (asyncManager.isConcurrentHandlingStarted()) {
                        return;
                    }

                    this.applyDefaultViewName(processedRequest, mv);
                    //controler调用后调用
                    mappedHandler.applyPostHandle(processedRequest, response, mv);
                } catch (Exception var20) {
                    dispatchException = var20;
                } catch (Throwable var21) {
                    dispatchException = new NestedServletException("Handler dispatch failed", var21);
                }
                //完成时调用,在processDispatchResult进行调用
                this.processDispatchResult(processedRequest, response, mappedHandler, mv, (Exception)dispatchException);
            } catch (Exception var22) {
                this.triggerAfterCompletion(processedRequest, response, mappedHandler, var22);
            } catch (Throwable var23) {
                this.triggerAfterCompletion(processedRequest, response, mappedHandler, new NestedServletException("Handler processing failed", var23));
            }

        } finally {
            if (asyncManager.isConcurrentHandlingStarted()) {
                if (mappedHandler != null) {
                    
                    mappedHandler.applyAfterConcurrentHandlingStarted(processedRequest, response);
                }
            } else if (multipartRequestParsed) {
                this.cleanupMultipart(processedRequest);
            }

        }
    }


```
HandlerExecutionChain里面进行统一处理
```java
boolean applyPreHandle(HttpServletRequest request, HttpServletResponse response) throws Exception {
    HandlerInterceptor[] interceptors = this.getInterceptors();
    if (!ObjectUtils.isEmpty(interceptors)) {
        for(int i = 0; i < interceptors.length; this.interceptorIndex = i++) {
            HandlerInterceptor interceptor = interceptors[i];
            if (!interceptor.preHandle(request, response, this.handler)) {
                this.triggerAfterCompletion(request, response, (Exception)null);
                return false;
            }
        }
    }

    return true;
}

void applyPostHandle(HttpServletRequest request, HttpServletResponse response, @Nullable ModelAndView mv) throws Exception {
    HandlerInterceptor[] interceptors = this.getInterceptors();
    if (!ObjectUtils.isEmpty(interceptors)) {
        for(int i = interceptors.length - 1; i >= 0; --i) {
            HandlerInterceptor interceptor = interceptors[i];
            interceptor.postHandle(request, response, this.handler, mv);
        }
    }

}

void triggerAfterCompletion(HttpServletRequest request, HttpServletResponse response, @Nullable Exception ex) throws Exception {
    HandlerInterceptor[] interceptors = this.getInterceptors();
    if (!ObjectUtils.isEmpty(interceptors)) {
        for(int i = this.interceptorIndex; i >= 0; --i) {
            HandlerInterceptor interceptor = interceptors[i];

            try {
                interceptor.afterCompletion(request, response, this.handler, ex);
            } catch (Throwable var8) {
                logger.error("HandlerInterceptor.afterCompletion threw exception", var8);
            }
        }
    }

}
```

**Spring拦截器实现**

需要先行定义拦截器，addPathPatterns用于配置拦截器对应的URL
```java
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new OneInterceptor()).addPathPatterns("/one/**");

        registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/one/**")
                                                     .addPathPatterns("/two/**");

        super.addInterceptors(registry);
    }
}
```
拦截器的执行是会根据 registry 注入的先后顺序执行，比如：/one/**   同时被  OneInterceptor、TwoInterceptor 拦截，但会先执行 OneInterceptor拦截的业务请求，因为它先注入进来的

<a id="markdown-225-过滤器" name="225-过滤器"></a>
### 2.2.5. 过滤器
<a href="#menu" style="float:right">目录</a>


**SpringBoot实现过滤器**

方式1：实现Filter
Servlet 的 Filter 接口需要实现如下方法：
* void init(FilterConfig paramFilterConfig) – 当容器初始化 Filter 时调用，该方法在 Filter 的生命周期只会被调用一次，一般在该方法中初始化一些资源，FilterConfig 是容器提供给 Filter 的初始化参数，在该方法中可以抛出 ServletException 。init 方法必须执行成功，否则 Filter 可能不起作用，出现以下两种情况时，web 容器中 Filter 可能无效： 1）抛出 ServletException 2）超过 web 容器定义的执行时间。
* doFilter(ServletRequest paramServletRequest, ServletResponse paramServletResponse, FilterChain paramFilterChain) – Web 容器每一次请求都会调用该方法。该方法将容器的请求和响应作为参数传递进来， FilterChain 用来调用下一个 Filter。
* void destroy() – 当容器销毁 Filter 实例时调用该方法，可以在方法中销毁资源，该方法在 Filter 的生命周期只会被调用一次

```java
@Component
public class TimerFilter implements Filter{

    @Override
    public void destroy() {
        System.out.println("timer Filter is destoried");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("timer Filter begin");
        long start=new Date().getTime();
        chain.doFilter(request, response);
        long end=new Date().getTime();
        System.out.println("timer Filter end,cost time:"+(end-start));
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        System.out.println("timer Filter is inited");
    }

}
```

方式2：
这种方式可以实现更细化的配置，针对某个路径
```java
@Configuration
public class ProjectConfig {

    @Bean
    public FilterRegistrationBean timerFilter(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        
        filterRegistrationBean.setFilter(new TimerFilter());
        List<String>urls=Lists.newArrayList();
        urls.add("/*");
        filterRegistrationBean.setUrlPatterns(urls);
        
        return filterRegistrationBean;
    }
}
```

<a id="markdown-2251-过滤器和拦截器的区别" name="2251-过滤器和拦截器的区别"></a>
#### 2.2.5.1. 过滤器和拦截器的区别：

![](https://images2017.cnblogs.com/blog/330611/201710/330611-20171023144517066-24770749.png)

|Filter|	Interceptor|	Summary|
|---|---|---|
|Filter| 接口定义在 javax.servlet 包中|	接口 HandlerInterceptor 定义在org.springframework.web.servlet 包中	 
|Filter 定义在 web.xml 中|-| 	- 
|Filter在只在 Servlet 前后起作用。Filters 通常将 请求和响应（request/response） 当做黑盒子，Filter 通常不考虑servlet 的实现。	|拦截器能够深入到方法前后、异常抛出前后等，因此拦截器的使用具有更大的弹性。允许用户介入（hook into）请求的生命周期，在请求过程中获取信息，Interceptor 通常和请求更加耦合。|	在Spring构架的程序中，要优先使用拦截器。几乎所有 Filter 能够做的事情， interceptor 都能够轻松的实现
|Filter 是 Servlet 规范规定的。	|而拦截器既可以用于Web程序，也可以用于Application、Swing程序中。|	使用范围不同
|Filter 是在 Servlet 规范中定义的，是 Servlet 容器支持的。	|而拦截器是在 Spring容器内的，是Spring框架支持的。	|规范不同
|Filter 不能够使用 Spring 容器资源|	拦截器是一个Spring的组件，归Spring管理，配置在Spring文件中，因此能使用Spring里的任何资源、对象，例如 Service对象、数据源、事务管理等，通过IoC注入到拦截器即可	|Spring 中使用 interceptor 更容易
|Filter 是被 Server(like Tomcat) 调用|	Interceptor 是被 Spring 调用|因此Filter总是优先于拦截器执行


<a id="markdown-2252-拦截器interceptor和过滤器filter的一些用途" name="2252-拦截器interceptor和过滤器filter的一些用途"></a>
#### 2.2.5.2. 拦截器（Interceptor）和过滤器（Filter）的一些用途
* Authentication Filters
* Logging and Auditing Filters
* Image conversion Filters
* Data compression Filters
* Encryption Filters
* Tokenizing Filters
* Filters that trigger resource access events
* XSL/T filters
* Mime-type chain Filter
---
* Request Filters 可以:
    * 执行安全检查 perform security checks
    * 格式化请求头和主体 reformat request headers or bodies
    * 审查或者记录日志 audit or log requests
    * 根据请求内容授权或者限制用户访问 Authentication-Blocking requests based on user identity.
    * 根据请求频率限制用户访问

* Response Filters 可以:
    * 压缩响应内容,比如让下载的内容更小 Compress the response stream
    * 压缩响应内容,比如让下载的内容更小 Compress the response stream
    追加或者修改响应 append or alter the response stream
    * 压缩响应内容,比如让下载的内容更小 Compress the response stream
    创建或者整体修改响应 create a different response altogether
    * 压缩响应内容,比如让下载的内容更小 Compress the response stream
    根据地方不同修改响应内容 Localization-Targeting the request and response to a particular locale.


<a id="markdown-23-springboot" name="23-springboot"></a>
## 2.3. SpringBoot
<a href="#menu" style="float:right">目录</a>

<a id="markdown-231-基本概念" name="231-基本概念"></a>
### 2.3.1. 基本概念
SpringBoot的核心
* 自动配置，针对很多Spring应用常用框架进行自动默认配置，可以让你轻松启动项目。比如jedis。原先使用Jedis需要配置连接地址，配置连接池，使用SpringBoot之后，这些都会帮你配置好，只要引入相关依赖，调用其提供的接口，即可实现对Redis的访问。
* 起步依赖:告诉Spring使用什么功能，他都能引入需要的库。
* Actuator

<a id="markdown-232-spring-boot-环境下创建bean" name="232-spring-boot-环境下创建bean"></a>
### 2.3.2. Spring Boot 环境下创建Bean

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

<a id="markdown-24-springcloud" name="24-springcloud"></a>
## 2.4. SpringCloud
<a href="#menu" style="float:right">目录</a>

<a id="markdown-241-基础知识" name="241-基础知识"></a>
### 2.4.1. 基础知识
<a href="#menu" style="float:right">目录</a>

**什么是微服务**
微服务是系统架构上的一种设计风格， 它的主旨是将一个原本独立的系统拆分成多个小型服务，这些小型服务都在各自独立的进程中运行，服务之间通过基于HTTP的RESTful API进行通信协作。 被拆分成的每一个小型服务都围绕着系统中的某一项或一些耦合度较高的业务功能进行构建， 并且每个服务都维护着自身的数据存储、 业务开发、自动化测试案例以及独立部署机制。 由千有了轻量级的通信协作基础， 所以这些微服务可以使用不同的语言来编写

**微服务主要的优势如下：**
* 降低复杂度，易于开发和维护
    * 将原来偶合在一起的复杂业务拆分为单个服务，规避了原本复杂度无止境的积累。每一个微服务专注于单一功能，并通过定义良好的接口清晰表述服务边界。每个服务开发者只专注服务本身，通过使用缓存、DAL等各种技术手段来提升系统的性能，而对于消费方来说完全透明。
* 单个微服务启动较快
    * 代码量少，因此启动较快
* 可独立部署
    * 由于微服务具备独立的运行进程，所以每个微服务可以独立部署。当业务迭代时只需要发布相关服务的迭代即可，降低了测试的工作量同时也降低了服务发布的风险。
* 技术栈不受限制
    * 只要服务间定义好接口和访问方式，可以自行利用不同的语言框架实现
* 容错
    * 在微服务架构下，当某一组件发生故障时，故障会被隔离在单个服务中。 通过限流、熔断等方式降低错误导致的危害，保障核心业务正常运行。
* 扩展
    * 单块架构应用也可以实现横向扩展，就是将整个应用完整的复制到不同的节点。当应用的不同组件在扩展需求上存在差异时，微服务架构便体现出其灵活性，因为每个服务可以根据实际需求独立进行扩展。

**微服务带来的问题**
* 运维要求较高
    * 服务数量变大，会增加运维的难度
* 分布式固有的复杂性
    * 包括服务容错，网络延迟，分布式事务等问题都需要解决
* 接口调整成本高
    * 服务之间通过接口进行通信，如果接口发生修改，影响就比较大
* 重复劳动 
    * 有的服务可能会出现同样的功能需求，导致重复编码

**微服务设计原则**
* 单一职责原则
* 服务自治原则
* 轻量级通信原则
* 微服务粒度，确定好服务边界

**SpringCloud子项目**
* SpringCloudConfig: 配置管理工具， 支持使用Git存储 配置内容， 可以使用它实现应用配置的外部化存储， 并支持客户端配置信息刷新、 加密／解密配置内容 等。
* SpringCloudNetflix: 核心 组件， 对多个Netflix OSS开源套件进行整合。
* Eureka: 服务治理组件， 包含服务注册中心、 服务注册与发现机制的实现。
* Hystrix: 容错管理组件，实现断路器模式， 帮助服务依赖中出现的延迟和为故障提供强大的容错能力。
* ribbon: 客户端负载均衡的服务调用组件
* Feign: 基于伈bbon 和 Hystrix 的声明式服务调用组件。
* Zuul: 网关组件， 提供智能路由、 访问过滤等功能。
* gateway: 网关组件，用于替换zuul
* Archaius: 外部化配置组件。
* Spring Cloud Bus: 事件、 消息总线， 用于传播集群中的状态变化或事件， 以触发后续的处理， 比如用来动态刷新配置等。
* Spring Cloud Cluster: 针对 ZooKeeper、 Redis、 Hazelcast、 Consul 的选举算法和通用状态模式的实现。
* Spring Cloud Cloudfoundry: 与 Pivotal Cloudfoundry 的整合支持。
* Spring Cloud Consul: 服务发现与配置管理工具。
* Spring Cloud Stream: 通过 Redis、 Rabbit 或者 Kafka 实现的消费微服务， 可以通过简单的声明式模型来发送和接收消息。
* Spring Cloud AWS: 用千简化整合 Amazon Web Service 的组件。
* Spring Cloud Security: 安全工具包，提供在Zuul代理中对OAuth2 客户端请求的中继器。
* Spring Cloud Sleuth:Spring Cloud应用的分布式跟踪实现，可以完美整合Zipkn。
* Spring Cloud ZooKeeper: 基于 ZooKeeper 的服务发现与配置管理组件。
* Spring Cloud Starters: Spring Cloud 的基础组件， 它是基于 Spring Boot 风格项目的基础依赖模块。
* Spring Cloud CLI: 用于在 Groovy 中快速创建 Spring Cloud 应用的 Spring Boot CLI插件。

**版本说明**
由于 Spring Cloud 不像 Spring 社区其他一些项目那样相对独立， 它是一个拥有诸多子项目的大型综合项目， 可以说是对微服务架构解决方案的综合套件组合， 其包含的各个子项目也都独立进行着内容更新与迭代，各自都维护着自己的发布版本号。因此每一 个Spring
Cloud 的版本都会包含多个不同版本的子项目， 为了管理每个版本的子项目清单， 避免
Spring Cloud的版本号与其子项目的版本号相混淆，没有采用版本号的方式，而是通过命名
的方式。

这些版本的名字采用了伦敦地铁站的名字， 根据字母表的顺序来对应版本时间顺序，比如最早的Release版本为Angel, 第二个Release版本为Brixton

当一个版本的Spring Cloud项目的发布内容积累到临界点或者一 个严重bug解决可用后， 就会发布 一个"service releases"版本， 简称SRX版本， 其中 X是 一 个递增的数字，所以Brixton.SRS就是Brixton的第5个Release版本。

pom文件中指定cloud的版本，便可以不用指定各个子项目依赖的版本号
```xml
 <dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-dependencies</artifactId>
            <version>Finchley.RELEASE</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```


<a id="markdown-242-服务治理eureka" name="242-服务治理eureka"></a>
### 2.4.2. 服务治理Eureka
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2421-基本使用" name="2421-基本使用"></a>
#### 2.4.2.1. 基本使用

**注册中心**

* 依赖引入
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>
```
* 配置文件
```yml
server:
  port: 8001
eureka:
  instance:
    hostname: localhost
  client:
    #false 禁止向注册中心注册,默认true
    register-with-eureka: false
    #false进制获取注册中心中各个微服务的注册信息,默认true
    fetch-registry: false
    service-url:
      defaultZone:
          http://localhost:8001/eureka/
```

* 启动类通过@EnableEurekaServer使能配置中心
```java
@EnableEurekaServer
@SpringBootApplication
public class CenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CenterApplication.class, args);
    }
}
```
配置中心创建完成

**微服务**
* 依赖引入
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
```

* 指定配置中心地址
```yml
eureka:
  client:
    service-url:
      defaultZone: http://localhost:8001/eureka/
```
* 使用@EnableEurekaClient或者@EnableDiscoveryClien七使能微服务
```java
@EnableEurekaClient
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {


        SpringApplication.run(ConsumerApplication.class,args);
    }
}
```
微服务创建完成

**访问配置中心**

访问地址:http://localhost:8001/

![注册中心页面](https://github.com/lgjlife/Java-Study/blob/master/pic/spring/springcloud/center.png)
这里配置了一个消费者(8003)和两个服务提供者（8002/8012）

status的UP后面的字符串即为服务的唯一标识instance-id。可以通过eureka.instance.instance-id进行修改。

**给注册中心添加登录认证**

* 注册中心引入POM
```XML
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```
* 配置文件配置用户名和密码
```yml
security:
    basic:
        # 开启基于HTTP basic的认证
        enable: true
    user:
        name: user
        password: 123456
```
* 微服务配置
给defaultZone添加用户名和密码
```yml
eureka:
  client:
    service-url:
      defaultZone: http://user:123456@localhost:8001/eureka/
```

<a id="markdown-2422-高可用注册中心" name="2422-高可用注册中心"></a>
#### 2.4.2.2. 高可用注册中心

* 注册中心可以集群部署，提高高可用

* 只需要配置多个地址即可，并且把之前的几个禁止去掉
```yml
server:
  port: 8001
eureka:
  instance:
    hostname: localhost
  client:
    #false 禁止向注册中心注册,默认true
    #register-with-eureka: false
    #false进制获取注册中心中各个微服务的注册信息,默认true
    #fetch-registry: false
    service-url:
      defaultZone:
          http://localhost:8001/eureka/,http://localhost:8002/eureka/,http://localhost:8003/eureka/
```
EurekaServer的高可用实际上就是将自己作为服务向其他服务注册中心注册自己， 这样就可以形成一组互相注册的服务注册中心， 以实现服务清单的互相同步， 达到高可用的效果

<a id="markdown-2423-原理说明" name="2423-原理说明"></a>
#### 2.4.2.3. 原理说明
<a href="#menu" style="float:right">目录</a>

<a id="markdown-24231-基础模块说明" name="24231-基础模块说明"></a>
##### 2.4.2.3.1. 基础模块说明
<a href="#menu" style="float:right">目录</a>

**基础架构**
* 服务注册中心
    * Eureka 提供的服务端， 提供服务注册与发现的功能， 也就是在上一节中我们实现的 eureka-server。
* 服务提供者
    * 提供服务的应用， 可以是 Spring Boot 应用， 也可以是其他技术平台且遵循 Eureka 通信机制的应用。它将自己提供的服务注册到 Eureka, 以供其他应用发现，也就是在上一节中我们实现的 HELLO-SERVICE 应用。
* 服务消费者
    * 消费者应用从服务注册中心获取服务列表， 从而使消费者可以知道去何处调用其所需要的服务

**服务治理机制**
![Spring Cloud服务架构图](https://github.com/lgjlife/Java-Study/blob/master/pic/spring/springcloud/eureka.png)

* **服务提供者**
    * 服务注册
        * “服务提供者” 在启动的时候会通过发送REST请求的方式将自己注册到EurekaServer上，同时带上了自身服务的一些元数据信息。
        * Eureka Server接收到这个REST请求之后，将元数据信息存储在一个双层结构Map中， 其中第一层的key是服务名， 第二层的key是具体服务的实例名。
        * eureka.client.register-with-eureka=true默认为true。 若设置为false将不会启动注册操作。
        * 元数据
            * 标准元数据
                * 主机名，IP地址，端口号，状态页和健康检查等信息
            * 自定义元数据
                * 通过eureka.instance.metadata-map进行配置，key-value型
    * 服务同步
        * 如架构图中所示， 这里的两个服务提供者分别注册到了两个不同的服务注册中心上，也就是说， 它们的信息分别被两个服务注册中心所维护。 此时，由于服务注册中心之间因互相注册为服务， 当服务提供者发送注册请求到一个服务注册中心时， 它会将该请求转发给集群中相连的其他注册中心， 从而实现注册中心之间的服务同步 。 
        * 通过服务同步，两个服务提供者的服务信息就可以通过这两台服务注册中心中的任意一台获取到。
    * 服务续约
        * 服务注册中心和服务提供者将会进行心跳操作
        * eureka.instance.lease-renewal-interval-in-seconds 参数用于定义服务续约任务的调用间隔时间，默认为30秒。 eureka.instance.lease-expiration-duration-in-seconds参数用于定义服务失效的时间，默认为90秒
* **服务消费者**
    * 获取服务
        * 启动服务消费者的时候，它会发送一个REST请求给服务注册中心，来获取上面注册的服务清单
        * Eureka Server会维护一份只读的服务清单来返回给客户端，同时该缓存清单会每隔30秒更新一次.
        * 获取服务是服务消费者的基础，所以必须确保eureka.c巨ent.fetch-registry=true,默认值为true
        * 希望修改缓存清单的 更新时间，可以通过 eureka.client.registry-fetch-interval-seconds=30参数进行修改，该参数默认值为30, 单位为秒        
    * 服务调用
        * 服务消费者在 获取服务清单后，通过服务名可以获得具体提供服务的实例名和该实例的元数据信息。 因为有这些服务实例的详细信息， 所以客户端可以根据自己的需要决定具体调用哪个实例，在ribbon中会默认采用轮询的方式进行调用，从而实现客户端的负载均衡
        * 对于访问实例的选择，Eureka中有Region和Zone的概念， 一 个Region中可以包含多个Zone, 每个服务客户端需要被注册到 一个Zone中， 所以每个客户端对应一个Region和一个Zone。 在进行服务调用的时候， 优先访问同处一个 Zone 中的服务提供方， 若访问不到，就访问其他的Zone
    * 服务下线
        * 当服务实例进行正常的关闭操作时， 它会触发一个服务下线的REST请求给Eurkea-Server
        * 服务端在接收到请求 之后， 将该服务状态置为下线(DOWN), 并把该下线事件传播出去
* **服务注册中心**
    * 失效剔除
        * Eureka Server在启动的时候会创建一个定时任务，默认每隔一段时间（默认为60秒） 将当前清单中超时（默认为90秒）没有续约的服务剔除出去。
    * 自我保护
        * EurekaServer在运行期间，会统计心跳失败的比例在15分钟之内是否低于85%, 如果出现低于的情况（在单机调试的时候很容易满足， 实际在生产环境上通常是由于网络不稳定导致）， EurekaServer会将当前的实例注册信息保护起来， 让这些实例不会过期， 尽可能保护这些注册信息
        * 在这段保护期间内实例若出现问题， 那么客户端很容易拿到实际已经不存在的服务实例， 会出现调用失败的清况， 所以客户端必须要有容错机制， 比如可以使用请求重试、 断路器等机制。
        * eureka.server.enableself-preservation=true,默认使能


<a id="markdown-24232-regionzone" name="24232-regionzone"></a>
##### 2.4.2.3.2. Region,Zone
**背景**
用户量比较大或者用户地理位置分布范围很广的项目，一般都会有多个机房。这个时候如果上线springCloud服务的话，我们希望一个机房内的服务优先调用同一个机房内的服务，当同一个机房的服务不可用的时候，再去调用其它机房的服务，以达到减少延时的作用。

**概念**
eureka提供了region和zone两个概念来进行分区，这两个概念均来自于亚马逊的AWS：
* region：可以简单理解为地理上的分区，比如亚洲地区，或者华北地区，再或者北京等等，没有具体大小的限制。根据项目具体的情况，可以自行合理划分region。
* zone：可以简单理解为region内的具体机房，比如说region划分为北京，然后北京有两个机房，就可以在此region之下划分出zone1,zone2两个zone。

**分区服务架构图**
![](https://segmentfault.com/img/bV7lKo?w=865&h=343)
如图所示，有一个region:beijing，下面有zone-1和zone-2两个分区，每个分区内有一个注册中心Eureka Server和一个服务提供者Service。
我们在zone-1内创建一个Consumer-1服务消费者的话，其会优先调用同一个zone内的Service-1，当Service-1不可用时，才会去调用zone-2内的Service-2。

**配置**

* Eureka Server-1：
```yml
spring:
  application:
    name: Server-1
server:
  port: 30000
eureka:
  instance:
    prefer-ip-address: true
    status-page-url-path: /actuator/info
    health-check-url-path: /actuator/health
    hostname: localhost
  client:
    register-with-eureka: true
    fetch-registry: true
    prefer-same-zone-eureka: true
    #地区
    region: beijing
    availability-zones:
      beijing: zone-1,zone-2
    service-url:
      zone-1: http://localhost:30000/eureka/
      zone-2: http://localhost:30001/eureka/

```

* Eureka Server-2：

```yml
spring:
  application:
    name: Server-2
server:
  port: 30001
eureka:
  instance:
    prefer-ip-address: true
    status-page-url-path: /actuator/info
    health-check-url-path: /actuator/health
    hostname: localhost
  client:
    register-with-eureka: true
    fetch-registry: true
    prefer-same-zone-eureka: true
    #地区
    region: beijing
    availability-zones:
      beijing: zone-2,zone-1
    service-url:
      zone-1: http://localhost:30000/eureka/
      zone-2: http://localhost:30001/eureka/
```

Service-1:

测试代码：
```java
@RestController
public class HiController {
    @Value("${zone.name}")
    private String zoneName;
    
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
        return zoneName;
    }
}
```
配置文件：

```yml
spring:
  application:
    name: service
server:
  port: 30010
eureka:
  instance:
    prefer-ip-address: true
    status-page-url-path: /actuator/info
    health-check-url-path: /actuator/health
    metadata-map:
      zone: zone-1
  client:
    register-with-eureka: true
    fetch-registry: true
    prefer-same-zone-eureka: true
    #地区
    region: beijing
    availability-zones:
      beijing: zone-1,zone-2
    service-url:
      zone-1: http://localhost:30000/eureka/
      zone-2: http://localhost:30001/eureka/

zone.name: zone-
```


Service-2:
```yml
spring:
  application:
    name: service
server:
  port: 30011
eureka:
  instance:
    prefer-ip-address: true
    status-page-url-path: /actuator/info
    health-check-url-path: /actuator/health
    metadata-map:
      zone: zone-2
  client:
    register-with-eureka: true
    fetch-registry: true
    prefer-same-zone-eureka: true
    #地区
    region: beijing
    availability-zones:
      beijing: zone-2,zone-1
    service-url:
      zone-1: http://localhost:30000/eureka/
      zone-2: http://localhost:30001/eureka/

zone.name: zone-2
```

Consumer-1:

调用服务代码：
```java
@RestController
public class HiController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consumer")
    public String hi() {
        return restTemplate.getForObject("http://service/hi", String.class);
    }
}
```
配置文件：

```yml
spring:
  application:
    name: consumer
server:
  port: 30030
eureka:
  instance:
    prefer-ip-address: true
    status-page-url-path: /actuator/info
    health-check-url-path: /actuator/health
    metadata-map:
      zone: zone-1
  client:
    register-with-eureka: true
    fetch-registry: true
    prefer-same-zone-eureka: true
    #地区
    region: beijing
    availability-zones:
      beijing: zone-1,zone-2
    service-url:
      zone-1: http://localhost:30000/eureka/
      zone-2: http://localhost:30001/eureka/

```
* Consumer-1优先调用的是同一个zone-1的Service-1，这个时候，无论怎么刷新，调用多少次，都只会调用Service-1，不会调用Service-2.
* 当我们把Service-1服务停掉，再调用的话,才会调用zone-2分区下的Service-2。

**配置文件讲解**

整个分区分为两步：
* 服务注册：要保证服务注册到同一个zone内的注册中心，因为如果注册到别zone的注册中心的话，网络延时比较大，心跳检测很可能出问题。
* 服务调用：要保证优先调用同一个zone内的服务，只有在同一个zone内的服务不可用时，才去调用别zone的服务。

1. 服务注册的配置文件
```yml
eureka:
  client:
    prefer-same-zone-eureka: true
    #地区
    region: beijing
    availability-zones:
      beijing: zone-1,zone-2
    service-url:
      zone-1: http://localhost:30000/eureka/
      zone-2: http://localhost:30001/eureka/
```

当一个服务（作为一个eureka client）向注册中心（eureka server）注册的时候，会根据eureka.client下的配置来进行注册。这里我们主要关心有多个注册中心的情况下，服务会注册到哪个注册中心，并且和哪个注册中心来维持心跳检测。
注册中心选择逻辑：
1. 如果prefer-same-zone-eureka为false，按照service-url下的 list取第一个注册中心来注册，并和其维持心跳检测。不会再向list内的其它的注册中心注册和维持心跳。只有在第一个注册失败的情况下，才会依次向其它的注册中心注册，总共重试3次，如果3个service-url都没有注册成功，则注册失败。每隔一个心跳时间，会再次尝试。
2. 如果prefer-same-zone-eureka为true，先通过region取availability-zones内的第一个zone，然后通过这个zone取service-url下的list，并向list内的第一个注册中心进行注册和维持心跳，不会再向list内的其它的注册中心注册和维持心跳。只有在第一个注册失败的情况下，才会依次向其它的注册中心注册，总共重试3次，如果3个service-url都没有注册成功，则注册失败。每隔一个心跳时间，会再次尝试。

所以说，为了保证服务注册到同一个zone的注册中心，一定要注意availability-zones的顺序，必须把同一zone写在前面

2. 服务调用的配置文件
```yml
eureka:
  instance:
    metadata-map:
      zone: zone-1
```
服务消费者和服务提供者分别属于哪个zone，均是通过eureka.instance.metadata-map.zone来判定的。
服务消费者会先通过ribbon去注册中心拉取一份服务提供者的列表，然后通过eureka.instance.metadata-map.zone指定的zone进行过滤，过滤之后如果同一个zone内的服务提供者有多个实例，则会轮流调用。
只有在同一个zone内的所有服务提供者都不可用时，才会调用其它zone内的服务提供者。

* 扩展
```yml
eureka.instance.lease-renewal-interval-in-seconds: 30
```
服务和注册中心的心跳间隔时间，默认为30s
```yml
eureka.instance.lease-expiration-duration-in-seconds: 90
```
服务和注册中心的心跳超时时间，默认为90s

也就是说，当一个服务异常down掉后，90s之后注册中心才会知道这个服务不可用了。在此期间，依旧会把这个服务当成正常服务。ribbon调用仍会把请求转发到这个服务上。为了避免这段期间出现无法提供服务的情况，要开启ribbon的重试功能，去进行其它服务提供者的重试。

<a id="markdown-24233-源码分析" name="24233-源码分析"></a>
##### 2.4.2.3.3. 源码分析
<a href="#menu" style="float:right">目录</a>



<a id="markdown-2424-更多配置说明" name="2424-更多配置说明"></a>
#### 2.4.2.4. 更多配置说明
<a href="#menu" style="float:right">目录</a>

**前缀eureka.client**
|参数名| 说明| 默认值|
|---|---|---|
|enabled| 启用Eureka客户端| true
|registryFetcl让ntervalSeconds |从Eureka服务端获取注册信息的间隔时间，单位为秒 |30
|instancelnfoReplicationlnterva!Seconds 更新实例信息的变化到E田eka服务端的间隔时间， 单位为秒 30
|inItiallnstancelnfoRepIicationintervalSeconds| 初始化 实例信息到 Eureka 服务端的间隔时间， 单位为秒| 40
|eurekaServiceUrlPolllntervalSeconds|轮询Eureka服务端地址更改的间隔时间，单位为秒。当我们与Spring Cloud Config配合，动态刷新Eureka的serv1ceURL地址时需要关注该参数|300
|eurekaServerReadTimeoutSeconds| 读取Eureka Se1-ver信息的超时时间， 单位为秒| 8
|eurekaServerConnectTimeoutSeconds| 连接 Eureka Server的超时时间， 单位为秒| 5
|eurekaServerTotalConnections| 从Eureka客户端到所有Eureka服务端的连接总数| 200
|eurekaServerTotalConnectionsPerHost |从Eureka客户端到每个Eureka服务端主机的连接总数 |50
|eurekaConnectionldleTimeoutSeconds| Eureka服务端 连接的空闲关闭时间， 单位为秒| 30
|heartbeatExecutorT缸eadPoolSize |心跳连接池的初始化线程数| 2
|heartbeatExecutorExponentta!BackOffBound |心跳超时重试延迟时间的最大乘数值| 10
|cacheRefresl让xecutorThreadPoolS1ze| 缓存刷新线程池的初始化线程数| 2
|cacheRefreshExecutorExponentialBackOffBound |缓存刷新重试延迟时间的最大乘数值| 10
|useDnsForFetchmgServ1ceUrls| 使用DNS来获取Eureka服务端的serviceUri| false
|registerWitl也ureka |是否要将自身的实例信息 注册到Eureka服务端| true
|preferSameZoneEureka |是否偏好使用处于相同Zone的Eureka服务端| true
|filterOnlyUplnstances| 获取实例 时是否过滤， 仅保留UP状态的实例 |true
|fetchRegistry| 是否从Eureka服务端获取注册信息|true

**前缀eureka.instance**
|参数名| 说明| 默认值|
|---|---|---|
|preferlpAddress| 是否优先使用IP地址作为主机名的标识| false
|leaseRenewallntervallnSeconds| Eureka客户端向服务端发送心跳的时间间隔， 单位为秒| 30
|leaseExpirationDurationlnSeconds |Eureka服务端在收到砓后 一次心跳之后等待的时间上限，单位为秒。 超过该时间之后服务端会将该服务实例从服务消单中剔除， 从而禁止服务调用请求被发送到该实例上 |90
|nonSecurePort |非安全的通信端口号 |80
|securePort |安全的通信端口号| 443
|nonSecurePotiEnabled |是否启用非安全的通信端口号 |true
|securePortEnabled| 是否启用安全的通信端口号
|appname |服务名，默认取spring.application.name的配置值，如果没有则为unknown
|hostname |主机名， 不配置的时候将根据操作系统的主机名来获取

<a id="markdown-243-负载均衡ribbon" name="243-负载均衡ribbon"></a>
### 2.4.3. 负载均衡Ribbon
<a href="#menu" style="float:right">目录</a>

Spring Cloud Ribbon 是一个基于 HTTP 和 TCP 的客户端负载均衡工具，它基于 Netflixribbon 实现。 通过 Spring Cloud 的封装， 可以让我们轻松地将面向服务的 REST 模板请求自动转换成客户端负载均衡的服务调用。 Spring Cloud Ribbon 虽然只是一个工具类框架，它不像服务注册中心、 配置中心、 API 网关那样需要独立部署， 但是它几乎存在于每一个Spring Cloud 构建的微服务和基础设施中。 因为微服务间的调用，API 网关的请求转发等内容实际上都是通过伈bbon 来实现的，包括后续我们将要介绍的 Feign, 它也是基于 Ribbon实现的工具。 所以， 对 Spring Cloud Ribbon 的理解和使用， 对于我们使用 Spring Cloud 来构建微服务非常重要。

ribbon底层是基于RestTemplate实现Http请求
org.springframework.web.client.RestTemplate

<a id="markdown-2431-基本使用" name="2431-基本使用"></a>
#### 2.4.3.1. 基本使用
<a href="#menu" style="float:right">目录</a>

**引入依赖**
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
</dependency>
```
**代码**

```java
@Configuration
public class RibbonConfig {

    @Bean
    //开启客户端负载均衡
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

@Service
public class RibbonService {

    private  static Logger log = LoggerFactory.getLogger(RibbonService.class);

    //注入
    @Autowired
    private  RestTemplate restTemplate;

    //用于容错，可以不用
    @HystrixCommand(fallbackMethod = "ribbonFail")
    public String  ribbon(){
        //通过服务名称cloud-provider进行调用
        return  restTemplate.getForObject("http://cloud-provider/ribbon",String.class);
    }
    public String  ribbonFail(){
        log.info("ribbon 请求失败");
        return  "ribbon 请求失败" + new Date().getSeconds();
    }

}



```

<a id="markdown-2432-原理说明" name="2432-原理说明"></a>
#### 2.4.3.2. 原理说明
<a href="#menu" style="float:right">目录</a>

<a id="markdown-24321-源码分析" name="24321-源码分析"></a>
##### 2.4.3.2.1. 源码分析

**LoadBalancerAutoConfiguration配置类**

在该自动化配置类中， 主要做了下面三件事：
• 创建了一个LoadBalancer工吐erceptor的Bean, 用千实现对客户端发起请求
时进行拦截， 以实现客户端负载均衡。
• 创建了 一个RestTemplateCustomizer的Bean, 用于给Res七Template增加
LoadBalancer工nterceptor拦截器。
• 维护了 一个被@LoadBalanced 注解修饰的RestTempl琴e对象列表， 并在这里
进行初始化， 通过调用Res七TemplateCustomizer的实例来给需要客户端负载
均衡的Res七Template增加LoadBalancerin七erceptor拦截器。

```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.springframework.cloud.client.loadbalancer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.web.client.RestTemplate;

@Configuration
@ConditionalOnClass({RestTemplate.class})
@ConditionalOnBean({LoadBalancerClient.class})
@EnableConfigurationProperties({LoadBalancerRetryProperties.class})
public class LoadBalancerAutoConfiguration {
    @LoadBalanced
    @Autowired(
        required = false
    )
    private List<RestTemplate> restTemplates = Collections.emptyList();
    @Autowired(
        required = false
    )
    private List<LoadBalancerRequestTransformer> transformers = Collections.emptyList();

    public LoadBalancerAutoConfiguration() {
    }

    @Bean
    public SmartInitializingSingleton loadBalancedRestTemplateInitializerDeprecated(final ObjectProvider<List<RestTemplateCustomizer>> restTemplateCustomizers) {
        return () -> {
            restTemplateCustomizers.ifAvailable((customizers) -> {
                Iterator var2 = this.restTemplates.iterator();

                while(var2.hasNext()) {
                    RestTemplate restTemplate = (RestTemplate)var2.next();
                    Iterator var4 = customizers.iterator();

                    while(var4.hasNext()) {
                        RestTemplateCustomizer customizer = (RestTemplateCustomizer)var4.next();
                        customizer.customize(restTemplate);
                    }
                }

            });
        };
    }

    @Bean
    @ConditionalOnMissingBean
    public LoadBalancerRequestFactory loadBalancerRequestFactory(LoadBalancerClient loadBalancerClient) {
        return new LoadBalancerRequestFactory(loadBalancerClient, this.transformers);
    }

    @Configuration
    @ConditionalOnClass({RetryTemplate.class})
    public static class RetryInterceptorAutoConfiguration {
        public RetryInterceptorAutoConfiguration() {
        }

        @Bean
        @ConditionalOnMissingBean
        public RetryLoadBalancerInterceptor ribbonInterceptor(LoadBalancerClient loadBalancerClient, LoadBalancerRetryProperties properties, LoadBalancerRequestFactory requestFactory, LoadBalancedRetryFactory loadBalancedRetryFactory) {
            return new RetryLoadBalancerInterceptor(loadBalancerClient, properties, requestFactory, loadBalancedRetryFactory);
        }

        @Bean
        @ConditionalOnMissingBean
        public RestTemplateCustomizer restTemplateCustomizer(final RetryLoadBalancerInterceptor loadBalancerInterceptor) {
            return (restTemplate) -> {
                List<ClientHttpRequestInterceptor> list = new ArrayList(restTemplate.getInterceptors());
                list.add(loadBalancerInterceptor);
                restTemplate.setInterceptors(list);
            };
        }
    }

    @Configuration
    @ConditionalOnClass({RetryTemplate.class})
    public static class RetryAutoConfiguration {
        public RetryAutoConfiguration() {
        }

        @Bean
        @ConditionalOnMissingBean
        public LoadBalancedRetryFactory loadBalancedRetryFactory() {
            return new LoadBalancedRetryFactory() {
            };
        }
    }

    @Configuration
    @ConditionalOnMissingClass({"org.springframework.retry.support.RetryTemplate"})
    static class LoadBalancerInterceptorConfig {
        LoadBalancerInterceptorConfig() {
        }

        @Bean
        public LoadBalancerInterceptor ribbonInterceptor(LoadBalancerClient loadBalancerClient, LoadBalancerRequestFactory requestFactory) {
            return new LoadBalancerInterceptor(loadBalancerClient, requestFactory);
        }

        @Bean
        @ConditionalOnMissingBean
        public RestTemplateCustomizer restTemplateCustomizer(final LoadBalancerInterceptor loadBalancerInterceptor) {
            return (restTemplate) -> {
                List<ClientHttpRequestInterceptor> list = new ArrayList(restTemplate.getInterceptors());
                list.add(loadBalancerInterceptor);
                restTemplate.setInterceptors(list);
            };
        }
    }
}


```
当 一个被@LoadBalanced 注解修饰的 RestTemplate 对象向外发起 HTTP 请求时， 会被 LoadBalancerintercep七or 类的 intercept 函数所拦截。

![ribbon请求流程](https://github.com/lgjlife/Java-Study/blob/master/pic/spring/springcloud/ribbon-dorequest.png)

InterceptingClientHttpRequest

```java
public ClientHttpResponse execute(HttpRequest request, byte[] body) throws IOException {
    if (this.iterator.hasNext()) {
        //执行拦截器
        ClientHttpRequestInterceptor nextInterceptor = (ClientHttpRequestInterceptor)this.iterator.next();
        return nextInterceptor.intercept(request, body, this);
    } else {
        HttpMethod method = request.getMethod();
        Assert.state(method != null, "No standard HTTP method");
        ClientHttpRequest delegate = InterceptingClientHttpRequest.this.requestFactory.createRequest(request.getURI(), method);
        request.getHeaders().forEach((key, value) -> {
            delegate.getHeaders().addAll(key, value);
        });
        if (body.length > 0) {
            if (delegate instanceof StreamingHttpOutputMessage) {
                StreamingHttpOutputMessage streamingOutputMessage = (StreamingHttpOutputMessage)delegate;
                streamingOutputMessage.setBody((outputStream) -> {
                    StreamUtils.copy(body, outputStream);
                });
            } else {
                StreamUtils.copy(body, delegate.getBody());
            }
        }

        return delegate.execute();
    }
}
```
**通过负载均衡获取服务器并执行请求**

* @LoadBalanced注解 源码的注释中可以知道， 该注解用来给RestTemplate做标记， 以使用负载均衡的客户端(LoadBalancerClient)来配置它

```java
package org.springframework.cloud.client.loadbalancer;

import java.io.IOException;
import java.net.URI;
import org.springframework.cloud.client.ServiceInstance;

public interface LoadBalancerClient extends ServiceInstanceChooser {
    <T> T execute(String serviceId, LoadBalancerRequest<T> request) throws IOException;

    <T> T execute(String serviceId, ServiceInstance serviceInstance, LoadBalancerRequest<T> request) throws IOException;

    URI reconstructURI(ServiceInstance instance, URI original);
}
```
LoadBalancerClient的实现类是RibbonLoadBalancerClient，看下其具体实现
```java
public <T> T execute(String serviceId, LoadBalancerRequest<T> request) throws IOException {
    return this.execute(serviceId, (LoadBalancerRequest)request, (Object)null);
}
public <T> T execute(String serviceId, LoadBalancerRequest<T> request, Object hint) throws IOException {

    //获取负载均衡器
    ILoadBalancer loadBalancer = this.getLoadBalancer(serviceId);
    //通过负载均衡器获取服务
    Server server = this.getServer(loadBalancer, hint);
    if (server == null) {
        throw new IllegalStateException("No instances available for " + serviceId);
    } else {
        RibbonLoadBalancerClient.RibbonServer ribbonServer = new RibbonLoadBalancerClient.RibbonServer(serviceId, server, this.isSecure(server, serviceId), this.serverIntrospector(serviceId).getMetadata(server));
        //执行实际的Http请求
        return this.execute(serviceId, (ServiceInstance)ribbonServer, (LoadBalancerRequest)request);
    }
}

protected Server getServer(ILoadBalancer loadBalancer, Object hint) {
    return loadBalancer == null ? null : loadBalancer.chooseServer(hint != null ? hint : "default");
}

    
```
最终是由ILoadBalancer的实现类的chooseServer（）方法负责实现，系统提供了几个，用户也可以自己实现
```java
public interface ILoadBalancer {

    // 向负载均衡器中维护的实例列表增加服务实例。
    void addServers(List<Server> var1);
    //通过某种策略， 从负载均衡器中挑选出 一个具体的服务实例。
    Server chooseServer(Object var1);
    //用来通知和标识负载均衡器中某个具体实例已经停止服务， 不然负载均衡器在下一次获取服务实例清单前都会认为服务实例均是正常服务的
    void markServerDown(Server var1);

    /** @deprecated */
    @Deprecated    
    List<Server> getServerList(boolean var1);
    //获取当前正常服务的实例列表
    List<Server> getReachableServers();
    //获取所有已知的服务实例列表， 包括正常服务和停止服务的实例
    List<Server> getAllServers();
}
```
![负载均衡实现类](https://github.com/lgjlife/Java-Study/blob/master/pic/spring/springcloud/loadbalance-extends.png)

可以看到默认的是ZoneAwareLoadBalancer方式
```java
public class RibbonClientConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public IRule ribbonRule(IClientConfig config) {
        if (this.propertiesFactory.isSet(IRule.class, this.name)) {
            return (IRule)this.propertiesFactory.get(IRule.class, config, this.name);
        } else {
            ZoneAvoidanceRule rule = new ZoneAvoidanceRule();
            rule.initWithNiwsConfig(config);
            return rule;
        }
    }
    @Bean
    @ConditionalOnMissingBean
    public ILoadBalancer ribbonLoadBalancer(IClientConfig config, ServerList<Server> serverList, ServerListFilter<Server> serverListFilter, IRule rule, IPing ping, ServerListUpdater serverListUpdater) {
        return (ILoadBalancer)(this.propertiesFactory.isSet(ILoadBalancer.class, this.name) ? (ILoadBalancer)this.propertiesFactory.get(ILoadBalancer.class, config, this.name) : new ZoneAwareLoadBalancer(config, rule, ping, serverList, serverListFilter, serverListUpdater));
    } 
}
```
再回到 RibbonLoadBalancerC巨ent 的 execute 函数逻辑， 在通过ZoneAwareLoadBalancer 的 chooseServer 函数获取了负载均衡策略分配到的服务实例对象 Server 之后， 将其内容包装成贮bbonServer 对象（该对象除了存储了服务实例的信息之外， 还增加了服务名 service豆、 是否需要使用 HTTPS 等其他信息）， 然后使用该对象再回调 LoadBalancerinterceptor 请求拦截器中 LoadBalancerRequest的 apply(丘nal Serviceins七ance instance) 函数， 向 一个实际的具体服务实例发起请求，从而实现一开始以服务名为 host 的 URI 请求到 host:post 形式的实际访问地址的转换。

RibbonLoadBalancerClient类
```java
//
 public <T> T execute(String serviceId, LoadBalancerRequest<T> request, Object hint) throws IOException {
    ILoadBalancer loadBalancer = this.getLoadBalancer(serviceId);
    Server server = this.getServer(loadBalancer, hint);
    if (server == null) {
        throw new IllegalStateException("No instances available for " + serviceId);
    } else {
        RibbonLoadBalancerClient.RibbonServer ribbonServer = new RibbonLoadBalancerClient.RibbonServer(serviceId, server, this.isSecure(server, serviceId), this.serverIntrospector(serviceId).getMetadata(server));
        return this.execute(serviceId, (ServiceInstance)ribbonServer, (LoadBalancerRequest)request);
    }
}

public <T> T execute(String serviceId, ServiceInstance serviceInstance, LoadBalancerRequest<T> request) throws IOException {
    Server server = null;
    if (serviceInstance instanceof RibbonLoadBalancerClient.RibbonServer) {
        server = ((RibbonLoadBalancerClient.RibbonServer)serviceInstance).getServer();
    }

    if (server == null) {
        throw new IllegalStateException("No instances available for " + serviceId);
    } else {
        RibbonLoadBalancerContext context = this.clientFactory.getLoadBalancerContext(serviceId);
        RibbonStatsRecorder statsRecorder = new RibbonStatsRecorder(context, server);

        try {
            //最终执行请求LoadBalancerRequest实现
            T returnVal = request.apply(serviceInstance);
            statsRecorder.recordStats(returnVal);
            return returnVal;
        } catch (IOException var8) {
            statsRecorder.recordStats(var8);
            throw var8;
        } catch (Exception var9) {
            statsRecorder.recordStats(var9);
            ReflectionUtils.rethrowRuntimeException(var9);
            return null;
        }
    }
}

```

<a id="markdown-24322-负载均衡器" name="24322-负载均衡器"></a>
##### 2.4.3.2.2. 负载均衡器

![负载均衡实现类](https://github.com/lgjlife/Java-Study/blob/master/pic/spring/springcloud/loadbalance-extends.png)

**AbstractLoadBalancer**是ILoadBalancer接口的抽象实现。在该抽象类中定义了一个关于服务实例的分组枚举类 ServerGroup
```java
public abstract class AbstractLoadBalancer implements ILoadBalancer {
    public AbstractLoadBalancer() {
    }

    public Server chooseServer() {
        return this.chooseServer((Object)null);
    }

    public abstract List<Server> getServerList(AbstractLoadBalancer.ServerGroup var1);

    public abstract LoadBalancerStats getLoadBalancerStats();

    public static enum ServerGroup {
        //所有服务实例。
        ALL,
        //正常服务的实例。
        STATUS_UP,
        //停止服务的实例
        STATUS_NOT_UP;

        private ServerGroup() {
        }
    }
}
```
**BaseloadBalancer**
BaseLoadBalancer 类是和bbon 负载均衡器的基础实现类，在该类中定义了很多关于负载均衡器相关的基础内容。
* 定义并维护了两个存储服务实例 Server 对象的列表。 一个用千存储所有 服务实例的清单， 一个用于存储正常服务的实例清单。
* 定义了之前我 们提到的用来存储负载均衡器各服务 实 例 属性和统计信息的LoadBalancerS七ats 对象
* 定义了检查服务实例是否正常服务的工贮ng 对象， 在 BaseLoadBalancer 中默认为 null, 需要在构造时注入它的具体实现。
* 定义了检查服务实例操作的执行策略对象工贮ngStrategy,在 BaseLoadBalancer中默认使用了该类中定义的静态内部类 SerialPingStrategy 实现。 根据源码，我们可以看到该策略采用线性遍历 ping 服务实例的方式实现检查。 该策略在当IPing 的实现速度不理想， 或是 Server 列表过大时， 可能会影响系统性能， 这时候需要通过实现 IPingS七rategy 接口并重写 pingServers(Iping ping,Server[] servers) 函数去扩展 ping 的执行策略。
* 定 义 了负 载 均 衡的处理规 则 工Rule 对 象， 从 BaseLoadBalancer 中chooseServer(Object key) 的实现源码， 我们可以知道， 负载均衡器实际将服务实例选择任务委托给了IRule 实例中的 choose 函数来实现。 而在这里， 默认初始化了 RoundRob江Rule 为工Rule 的实现对象。 RoundRobinRule 实现了最基本且常用的线性负载均衡规则
* 启动 ping 任务：在 BaseLoadBalancer 的默认构造函数中，会直接启动一个用于定时检查 Server 是否健康的任务。 该任务默认的执行间隔为 10 秒。
* 实现了 ILoadBalancer 接口定义的负载均衡器应具备以下一系列基本操作。
* addServers(List newServers): 向负载均衡器中增加新的服务实例列表，该实现将原本已经维护着的所有服务实例清单 al1Server巨st 和新传入的服务 实 例 清 单 newServers 都加入到 newList 中， 然后通 过调用setServersList 函数对 new口st 进行处理，在 BaseLoadBalancer 中实现的时候会使用新的列表覆盖旧的列表。而之后介绍的几个扩展实现类对千服务实例清单更新的优化都是通过对 setServersLi江函数的重写来实现的

**DynamicServerlistloadBalancer**
DynamicServerListLoadBalancer 类继承于 BaseLoadBalancer 类， 它是对基础负载均衡器的扩展。 在该负载均衡器中， 实现了服务实例清单在运行期的动态更新能力；同时， 它还具备了对服务实例清单的过滤功能， 也就是说， 我们可以通过过滤器来选择性地获取一批服务实例清单

**ZoneAwareloadBalancer**
ZoneAwareLoadBalancer 负载均衡器是对 DynamicServerListLoadBalancer的扩展。在 DynamicServerLis七LoadBalancer 中， 我们可以看到它并没有重写选择具体服务实例的 chooseServer 函数， 所以它依然会采用在 BaseLoadBalancer 中实现的算法。 使用 RoundRobinRule 规则， 以线性轮询的方式来选择调用的服务实例， 该算法实现简单并没有区域 (Zone) 的概念， 所以它会把所有实例视为一个 Zone下的节点来看待， 这样就会周期性地产生跨区域 (Zone) 访问的情况， 由于跨区域会产生更高的延迟，这些实例主要以防止区域性故障实现高可用为目的而不能作为常规访问的实例， 所以在多区域部署的清况下会有一定的性能问题， 而该负载均衡器则 可以避免这样的问题.

<a id="markdown-24323-负载均衡策略" name="24323-负载均衡策略"></a>
##### 2.4.3.2.3. 负载均衡策略
<a href="#menu" style="float:right">目录</a>

* IRule
    * 负载均衡接口
    * AbstractLoadBalancerRule
        * 负载均衡策略的 抽象类，在该抽象类中定义了负载均衡器ILoadBalancer对象 ，该对象能够在具体实现选择服务 策略时，获取到一些负载均衡器中维护的信息来作为分配依据， 并以此设计一些符法来实现针对特定场景的高效策略
        * ClientConfigEnabledRoundRobinRule
            * 该策略较为特殊， 我们一般不直接使用它。 因为它本身并没有实现什么特殊的处理逻辑
            * 在它的内部定义了一个 RoundRobinRule 策略， 而 choose函数的实现也正是使用了 RoundRobinRule 的线性轮询机制， 所以它实现的功能实际上与 RoundRobinRule 相同
            * 默认的 choose 就实现了线性轮询机制， 在子类中做一些高级策略时通常有可能会存在一些无法实施的情况， 那么就可以用父类的实现作为备选 
            * BestAvailableRule
                * 通过遍历负载均衡器中维护的所有服务实例， 会过滤掉故障的实例， 并找出并发请求数最小的一个， 所以该策略的特性是可选出最空闲的实例。
            * PredicateBasedRule
                * 一个抽象策略,先过滤清单， 再轮询选择
                * ZoneAvoidanceRule
                * AvailabilityFilteringRule
                    * 该策略继承自上面介绍的抽象策略 Predic红eBasedRule, 所以它也继承了 “先过滤清单，再轮询选择 ”的基本处理逻辑
                    * 过滤故障的节点
        * RoundRobinRule
            * 该策略实现了按照线性轮询的方式依次选择每个服务实例的功能。
            * WeightedResponseTimeRule
                * 该策略是对 RoundRobinRule 的扩展， 增加了根据实例的运行情况来计算权重， 并根据权重来挑选实例， 以达到更优的分配效果
            * ResponseTimeWeightedRule
                * 旧的实现，废弃不用
        * RandomRule
            * 该策略实现了从服务实例清单中随机选择 一个服务实例的功能
        * RetryRule
            * 该策略实现了一个具备重试机制的实例选择功能
            * 若选择不到就根据设置的尝试结束时间为阙值 maxRetryMillis参数定义的值+ choose 方法开始执行的时间戳）， 当超过该阑值后就返回 null


**修改负载均衡策略**
```java
@Configuration
public class MyRuleConfig {

    @Bean //修改轮询规则为随机
    public IRule iRule(){
        return new RandomRule();
    }
}
```


```java
public interface IRule {
    Server choose(Object var1);

    void setLoadBalancer(ILoadBalancer var1);

    ILoadBalancer getLoadBalancer();
}
```
**AbstractLoadBalancerRule**
负载均衡策略的 抽象类，在该抽象类中定义了负载均衡器ILoadBalancer对象 ，该对象能够在具体实现选择服务 策略时，获取到一些负载均衡器中维护的信息来作为分配依据， 并以此设计一些符法来实现针对特定场景的高效策略 。

```java
public abstract class AbstractLoadBalancerRule implements IRule, IClientConfigAware {
    private ILoadBalancer lb;

    public AbstractLoadBalancerRule() {
    }

    public void setLoadBalancer(ILoadBalancer lb) {
        this.lb = lb;
    }

    public ILoadBalancer getLoadBalancer() {
        return this.lb;
    }
}

```

**RandomRule**

该策略实现了从服务实例清单中随机选择 一个服务实例的功能。

```java

public class RandomRule extends AbstractLoadBalancerRule {
    public RandomRule() {
    }

    @SuppressWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NULL_VALUE"})
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

                int index = this.chooseRandomInt(serverCount);
                server = (Server)upList.get(index);
                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    protected int chooseRandomInt(int serverCount) {
        return ThreadLocalRandom.current().nextInt(serverCount);
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}

```
****
```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.netflix.loadbalancer;

import com.netflix.client.config.IClientConfig;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RoundRobinRule extends AbstractLoadBalancerRule {
    private AtomicInteger nextServerCyclicCounter;
    private static final boolean AVAILABLE_ONLY_SERVERS = true;
    private static final boolean ALL_SERVERS = false;
    private static Logger log = LoggerFactory.getLogger(RoundRobinRule.class);

    public RoundRobinRule() {
        this.nextServerCyclicCounter = new AtomicInteger(0);
    }

    public RoundRobinRule(ILoadBalancer lb) {
        this();
        this.setLoadBalancer(lb);
    }

    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            log.warn("no load balancer");
            return null;
        } else {
            Server server = null;
            int count = 0;

            while(true) {
                if (server == null && count++ < 10) {
                    List<Server> reachableServers = lb.getReachableServers();
                    List<Server> allServers = lb.getAllServers();
                    int upCount = reachableServers.size();
                    int serverCount = allServers.size();
                    if (upCount != 0 && serverCount != 0) {
                        int nextServerIndex = this.incrementAndGetModulo(serverCount);
                        server = (Server)allServers.get(nextServerIndex);
                        if (server == null) {
                            Thread.yield();
                        } else {
                            if (server.isAlive() && server.isReadyToServe()) {
                                return server;
                            }

                            server = null;
                        }
                        continue;
                    }

                    log.warn("No up servers available from load balancer: " + lb);
                    return null;
                }

                if (count >= 10) {
                    log.warn("No available alive servers after 10 tries from load balancer: " + lb);
                }

                return server;
            }
        }
    }

    private int incrementAndGetModulo(int modulo) {
        int current;
        int next;
        do {
            current = this.nextServerCyclicCounter.get();
            next = (current + 1) % modulo;
        } while(!this.nextServerCyclicCounter.compareAndSet(current, next));

        return next;
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}

```
****
```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.netflix.loadbalancer;

import com.netflix.client.config.IClientConfig;
import com.netflix.client.config.IClientConfigKey;
import edu.umd.cs.findbugs.annotations.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeightedResponseTimeRule extends RoundRobinRule {
    public static final IClientConfigKey<Integer> WEIGHT_TASK_TIMER_INTERVAL_CONFIG_KEY = new IClientConfigKey<Integer>() {
        public String key() {
            return "ServerWeightTaskTimerInterval";
        }

        public String toString() {
            return this.key();
        }

        public Class<Integer> type() {
            return Integer.class;
        }
    };
    public static final int DEFAULT_TIMER_INTERVAL = 30000;
    private int serverWeightTaskTimerInterval = 30000;
    private static final Logger logger = LoggerFactory.getLogger(WeightedResponseTimeRule.class);
    private volatile List<Double> accumulatedWeights = new ArrayList();
    private final Random random = new Random();
    protected Timer serverWeightTimer = null;
    protected AtomicBoolean serverWeightAssignmentInProgress = new AtomicBoolean(false);
    String name = "unknown";

    public WeightedResponseTimeRule() {
    }

    public WeightedResponseTimeRule(ILoadBalancer lb) {
        super(lb);
    }

    public void setLoadBalancer(ILoadBalancer lb) {
        super.setLoadBalancer(lb);
        if (lb instanceof BaseLoadBalancer) {
            this.name = ((BaseLoadBalancer)lb).getName();
        }

        this.initialize(lb);
    }

    void initialize(ILoadBalancer lb) {
        if (this.serverWeightTimer != null) {
            this.serverWeightTimer.cancel();
        }

        this.serverWeightTimer = new Timer("NFLoadBalancer-serverWeightTimer-" + this.name, true);
        this.serverWeightTimer.schedule(new WeightedResponseTimeRule.DynamicServerWeightTask(), 0L, (long)this.serverWeightTaskTimerInterval);
        WeightedResponseTimeRule.ServerWeight sw = new WeightedResponseTimeRule.ServerWeight();
        sw.maintainWeights();
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                WeightedResponseTimeRule.logger.info("Stopping NFLoadBalancer-serverWeightTimer-" + WeightedResponseTimeRule.this.name);
                WeightedResponseTimeRule.this.serverWeightTimer.cancel();
            }
        }));
    }

    public void shutdown() {
        if (this.serverWeightTimer != null) {
            logger.info("Stopping NFLoadBalancer-serverWeightTimer-" + this.name);
            this.serverWeightTimer.cancel();
        }

    }

    List<Double> getAccumulatedWeights() {
        return Collections.unmodifiableList(this.accumulatedWeights);
    }

    @SuppressWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NULL_VALUE"})
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                List<Double> currentWeights = this.accumulatedWeights;
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

                int serverIndex = 0;
                double maxTotalWeight = currentWeights.size() == 0 ? 0.0D : (Double)currentWeights.get(currentWeights.size() - 1);
                if (maxTotalWeight >= 0.001D && serverCount == currentWeights.size()) {
                    double randomWeight = this.random.nextDouble() * maxTotalWeight;
                    int n = 0;

                    for(Iterator var13 = currentWeights.iterator(); var13.hasNext(); ++n) {
                        Double d = (Double)var13.next();
                        if (d >= randomWeight) {
                            serverIndex = n;
                            break;
                        }
                    }

                    server = (Server)allList.get(serverIndex);
                } else {
                    server = super.choose(this.getLoadBalancer(), key);
                    if (server == null) {
                        return server;
                    }
                }

                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                }
            }

            return server;
        }
    }

    void setWeights(List<Double> weights) {
        this.accumulatedWeights = weights;
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
        super.initWithNiwsConfig(clientConfig);
        this.serverWeightTaskTimerInterval = (Integer)clientConfig.get(WEIGHT_TASK_TIMER_INTERVAL_CONFIG_KEY, 30000);
    }

    class ServerWeight {
        ServerWeight() {
        }

        public void maintainWeights() {
            ILoadBalancer lb = WeightedResponseTimeRule.this.getLoadBalancer();
            if (lb != null) {
                if (WeightedResponseTimeRule.this.serverWeightAssignmentInProgress.compareAndSet(false, true)) {
                    try {
                        WeightedResponseTimeRule.logger.info("Weight adjusting job started");
                        AbstractLoadBalancer nlb = (AbstractLoadBalancer)lb;
                        LoadBalancerStats stats = nlb.getLoadBalancerStats();
                        if (stats != null) {
                            double totalResponseTime = 0.0D;

                            ServerStats ss;
                            for(Iterator var6 = nlb.getAllServers().iterator(); var6.hasNext(); totalResponseTime += ss.getResponseTimeAvg()) {
                                Server server = (Server)var6.next();
                                ss = stats.getSingleServerStat(server);
                            }

                            Double weightSoFar = 0.0D;
                            List<Double> finalWeights = new ArrayList();
                            Iterator var20 = nlb.getAllServers().iterator();

                            while(var20.hasNext()) {
                                Server serverx = (Server)var20.next();
                                ServerStats ssx = stats.getSingleServerStat(serverx);
                                double weight = totalResponseTime - ssx.getResponseTimeAvg();
                                weightSoFar = weightSoFar + weight;
                                finalWeights.add(weightSoFar);
                            }

                            WeightedResponseTimeRule.this.setWeights(finalWeights);
                            return;
                        }
                    } catch (Exception var16) {
                        WeightedResponseTimeRule.logger.error("Error calculating server weights", var16);
                        return;
                    } finally {
                        WeightedResponseTimeRule.this.serverWeightAssignmentInProgress.set(false);
                    }

                }
            }
        }
    }

    class DynamicServerWeightTask extends TimerTask {
        DynamicServerWeightTask() {
        }

        public void run() {
            WeightedResponseTimeRule.ServerWeight serverWeight = WeightedResponseTimeRule.this.new ServerWeight();

            try {
                serverWeight.maintainWeights();
            } catch (Exception var3) {
                WeightedResponseTimeRule.logger.error("Error running DynamicServerWeightTask for {}", WeightedResponseTimeRule.this.name, var3);
            }

        }
    }
}

```


```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.netflix.loadbalancer;

import com.netflix.client.config.IClientConfig;

public class RetryRule extends AbstractLoadBalancerRule {
    IRule subRule = new RoundRobinRule();
    long maxRetryMillis = 500L;

    public RetryRule() {
    }

    public RetryRule(IRule subRule) {
        this.subRule = (IRule)(subRule != null ? subRule : new RoundRobinRule());
    }

    public RetryRule(IRule subRule, long maxRetryMillis) {
        this.subRule = (IRule)(subRule != null ? subRule : new RoundRobinRule());
        this.maxRetryMillis = maxRetryMillis > 0L ? maxRetryMillis : 500L;
    }

    public void setRule(IRule subRule) {
        this.subRule = (IRule)(subRule != null ? subRule : new RoundRobinRule());
    }

    public IRule getRule() {
        return this.subRule;
    }

    public void setMaxRetryMillis(long maxRetryMillis) {
        if (maxRetryMillis > 0L) {
            this.maxRetryMillis = maxRetryMillis;
        } else {
            this.maxRetryMillis = 500L;
        }

    }

    public long getMaxRetryMillis() {
        return this.maxRetryMillis;
    }

    public void setLoadBalancer(ILoadBalancer lb) {
        super.setLoadBalancer(lb);
        this.subRule.setLoadBalancer(lb);
    }

    public Server choose(ILoadBalancer lb, Object key) {
        long requestTime = System.currentTimeMillis();
        long deadline = requestTime + this.maxRetryMillis;
        Server answer = null;
        answer = this.subRule.choose(key);
        if ((answer == null || !answer.isAlive()) && System.currentTimeMillis() < deadline) {
            InterruptTask task = new InterruptTask(deadline - System.currentTimeMillis());

            while(!Thread.interrupted()) {
                answer = this.subRule.choose(key);
                if (answer != null && answer.isAlive() || System.currentTimeMillis() >= deadline) {
                    break;
                }

                Thread.yield();
            }

            task.cancel();
        }

        return answer != null && answer.isAlive() ? answer : null;
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}

```

<a id="markdown-24324-配置详解" name="24324-配置详解"></a>
##### 2.4.3.2.4. 配置详解 

**Ribbon相关的配置**

* IClientConig: Ribbon 的 客户端配置 ， 默认采用 com.netflix.client.config.Defaul七ClientConfigimpl实现。
* IRule: Ribbon 的负载均衡策略 ， 默认采用 com.netflix.loadbalancer.ZoneAvoidanceRule实现，该策略能够在多区域环境下选出最佳区域的实例进行访问。
* IPing: Ribbon的实例检查策略，默认采用com.netflix.loadbalancer.NoOpping实现， 该 检查策略是一个特殊的实现，实际上它并不会检查实例是否可用， 而是始终返回true, 默认认为所有服务实例都是可用的 。
* ServerList<Server>: 服务实例清单的维护机制， 默认采用 com.netflix.loadbalancer.ConfigurationBasedServerList实现。
* ServerListFilter<Server>: 服 务 实 例 清 单过滤机 制 ， 默认采用 org.springframework.cloud.netflix.ribbon.ZonePreferenceServerListFilter实现， 该策略能够优先过滤出与请求调用 方处于同区域的服务实例。
* ILoadBalancer: 负载均衡器， 默 认采用 com.ne七flix.loadbalancer.ZoneAwareLoadBalancer实现， 它具备了区域感知的 能力。


```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.springframework.cloud.netflix.ribbon;

import com.netflix.client.DefaultLoadBalancerRetryHandler;
import com.netflix.client.RetryHandler;
import com.netflix.client.config.CommonClientConfigKey;
import com.netflix.client.config.DefaultClientConfigImpl;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.ConfigurationBasedServerList;
import com.netflix.loadbalancer.DummyPing;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PollingServerListUpdater;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;
import com.netflix.loadbalancer.ServerListFilter;
import com.netflix.loadbalancer.ServerListUpdater;
import com.netflix.loadbalancer.ZoneAvoidanceRule;
import com.netflix.loadbalancer.ZoneAwareLoadBalancer;
import com.netflix.niws.client.http.RestClient;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.client.apache4.ApacheHttpClient4;
import java.net.URI;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.commons.httpclient.HttpClientConfiguration;
import org.springframework.cloud.netflix.ribbon.apache.HttpClientRibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.okhttp.OkHttpRibbonConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties
@Import({HttpClientConfiguration.class, OkHttpRibbonConfiguration.class, RestClientRibbonConfiguration.class, HttpClientRibbonConfiguration.class})
public class RibbonClientConfiguration {
    public static final int DEFAULT_CONNECT_TIMEOUT = 1000;
    public static final int DEFAULT_READ_TIMEOUT = 1000;
    public static final boolean DEFAULT_GZIP_PAYLOAD = true;
    @RibbonClientName
    private String name = "client";
    @Autowired
    private PropertiesFactory propertiesFactory;

    public RibbonClientConfiguration() {
    }

    @Bean
    @ConditionalOnMissingBean
    public IClientConfig ribbonClientConfig() {
        DefaultClientConfigImpl config = new DefaultClientConfigImpl();
        config.loadProperties(this.name);
        config.set(CommonClientConfigKey.ConnectTimeout, 1000);
        config.set(CommonClientConfigKey.ReadTimeout, 1000);
        config.set(CommonClientConfigKey.GZipPayload, true);
        return config;
    }

    @Bean
    @ConditionalOnMissingBean
    public IRule ribbonRule(IClientConfig config) {
        if (this.propertiesFactory.isSet(IRule.class, this.name)) {
            return (IRule)this.propertiesFactory.get(IRule.class, config, this.name);
        } else {
            ZoneAvoidanceRule rule = new ZoneAvoidanceRule();
            rule.initWithNiwsConfig(config);
            return rule;
        }
    }

    @Bean
    @ConditionalOnMissingBean
    public IPing ribbonPing(IClientConfig config) {
        return (IPing)(this.propertiesFactory.isSet(IPing.class, this.name) ? (IPing)this.propertiesFactory.get(IPing.class, config, this.name) : new DummyPing());
    }

    @Bean
    @ConditionalOnMissingBean
    public ServerList<Server> ribbonServerList(IClientConfig config) {
        if (this.propertiesFactory.isSet(ServerList.class, this.name)) {
            return (ServerList)this.propertiesFactory.get(ServerList.class, config, this.name);
        } else {
            ConfigurationBasedServerList serverList = new ConfigurationBasedServerList();
            serverList.initWithNiwsConfig(config);
            return serverList;
        }
    }

    @Bean
    @ConditionalOnMissingBean
    public ServerListUpdater ribbonServerListUpdater(IClientConfig config) {
        return new PollingServerListUpdater(config);
    }

    @Bean
    @ConditionalOnMissingBean
    public ILoadBalancer ribbonLoadBalancer(IClientConfig config, ServerList<Server> serverList, ServerListFilter<Server> serverListFilter, IRule rule, IPing ping, ServerListUpdater serverListUpdater) {
        return (ILoadBalancer)(this.propertiesFactory.isSet(ILoadBalancer.class, this.name) ? (ILoadBalancer)this.propertiesFactory.get(ILoadBalancer.class, config, this.name) : new ZoneAwareLoadBalancer(config, rule, ping, serverList, serverListFilter, serverListUpdater));
    }

    @Bean
    @ConditionalOnMissingBean
    public ServerListFilter<Server> ribbonServerListFilter(IClientConfig config) {
        if (this.propertiesFactory.isSet(ServerListFilter.class, this.name)) {
            return (ServerListFilter)this.propertiesFactory.get(ServerListFilter.class, config, this.name);
        } else {
            ZonePreferenceServerListFilter filter = new ZonePreferenceServerListFilter();
            filter.initWithNiwsConfig(config);
            return filter;
        }
    }

    @Bean
    @ConditionalOnMissingBean
    public RibbonLoadBalancerContext ribbonLoadBalancerContext(ILoadBalancer loadBalancer, IClientConfig config, RetryHandler retryHandler) {
        return new RibbonLoadBalancerContext(loadBalancer, config, retryHandler);
    }

    @Bean
    @ConditionalOnMissingBean
    public RetryHandler retryHandler(IClientConfig config) {
        return new DefaultLoadBalancerRetryHandler(config);
    }

    @Bean
    @ConditionalOnMissingBean
    public ServerIntrospector serverIntrospector() {
        return new DefaultServerIntrospector();
    }

    @PostConstruct
    public void preprocess() {
        RibbonUtils.setRibbonProperty(this.name, CommonClientConfigKey.DeploymentContextBasedVipAddresses.key(), this.name);
    }

    static class OverrideRestClient extends RestClient {
        private IClientConfig config;
        private ServerIntrospector serverIntrospector;

        protected OverrideRestClient(IClientConfig config, ServerIntrospector serverIntrospector) {
            this.config = config;
            this.serverIntrospector = serverIntrospector;
            this.initWithNiwsConfig(this.config);
        }

        public URI reconstructURIWithServer(Server server, URI original) {
            URI uri = RibbonUtils.updateToSecureConnectionIfNeeded(original, this.config, this.serverIntrospector, server);
            return super.reconstructURIWithServer(server, uri);
        }

        protected Client apacheHttpClientSpecificInitialization() {
            ApacheHttpClient4 apache = (ApacheHttpClient4)super.apacheHttpClientSpecificInitialization();
            apache.getClientHandler().getHttpClient().getParams().setParameter("http.protocol.cookie-policy", "ignoreCookies");
            return apache;
        }
    }
}

```

**修改默认配置**

* 方式1

自定义一个Bean
```java
@Configuration
public class MyRibbonConfiguration {
    @Bean
    public IPing ribbonPing(IClientConfig config) {
        return new PingUrl();
    }
}
```

* 方式2
通过注解RibbonClient配置，实现更加细粒度的配置
```java
package org.springframework.cloud.netflix.ribbon;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({RibbonClientConfigurationRegistrar.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RibbonClient {
    String value() default "";

    String name() default "";

    Class<?>[] configuration() default {};
}

//配置某个服务的的策略
//HelloServiceConfiguration中定义了新的配置如方式1
@Configuration
@RibbonClient(name = "hello-service", configuration = HelloServiceConfiguration.class)
public class RibbonConfiguration 
}
```

<a id="markdown-244-声明式服务调用feign" name="244-声明式服务调用feign"></a>
### 2.4.4. 声明式服务调用feign
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2441-使用案例" name="2441-使用案例"></a>
#### 2.4.4.1. 使用案例

引入依赖，因为feign底层是依赖ribbon,因此也要引入该包
```xml
 <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
</dependency>
```

生明调用的接口，value为服务提供者的应用名称，@GetMapping用于定义服务提供者服务的方法和URL
```java
@FeignClient(value = "provider")
public interface DemoFeign {

    @GetMapping("/provider/demo")
    public String demo();
}
```
启动类添加注解
```java
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerFeignApplication.class, args);
    }

}
```
完成。

**多参数**

http://xxx?key1=xx&key2=xxx


get
```java
@FeignClient(value = "provider")
public interface DemoFeign {

    @GetMapping("/provider/demo")
    public String demo(@RequestParam("key1") String key1,@RequestParam("key1") String key2);
}

//或者使用map
@FeignClient(value = "provider")
public interface DemoFeign {

    @GetMapping("/provider/demo")
    public String demo(@RequestParam Map<String,Object> map);
}

//调用
map.put("key1",xxx);
map.put("key2",xxx);
demo(map);

```

post
```java
@FeignClient(value = "provider")
public interface DemoFeign {

    @PostMapping("/provider/demo")
    public String demo(@RequestBody User user);
}
```

<a id="markdown-245-服务容错保护-hystrix" name="245-服务容错保护-hystrix"></a>
### 2.4.5. 服务容错保护 Hystrix
<a href="#menu" style="float:right">目录</a>


<a id="markdown-246-api网关服务" name="246-api网关服务"></a>
### 2.4.6. API网关服务
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2461-zuul" name="2461-zuul"></a>
#### 2.4.6.1. zuul
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2462-gateway" name="2462-gateway"></a>
#### 2.4.6.2. GateWay
<a href="#menu" style="float:right">目录</a>



<a id="markdown-247-分布式配置中心config" name="247-分布式配置中心config"></a>
### 2.4.7. 分布式配置中心Config
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2471-基本使用" name="2471-基本使用"></a>
#### 2.4.7.1. 基本使用

<a id="markdown-24711-配置中心" name="24711-配置中心"></a>
##### 2.4.7.1.1. 配置中心

**引入依赖**
```xml
 <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-config-server</artifactId>
</dependency>
```

**SpringBoot配置文件**


这里有两种方式，一种是从git中读取配置文件，一种是从本地读取文件

* 从本地读取文件
```yml
spring:
  application:
    name: config-server
  cloud:
    config:
      server:
      #  git:
       #   uri: https://github.com/lgjlife/micro-blog
          #Spring Cloud Config Server强制从远程存储库中提取
       #   force-pull: true
        #  search-paths: config-repo
        native:
          search-locations: /home/lgj/config-repo #classpath:config-repo #
  profiles:
    active: native
```

* 从git中读取配置文件
micro-blog为仓库名称，search-paths为仓库中的文件夹名称，不要以"/"开头。如果是多级，则为 aa/bb
```yml
spring:
  application:
    name: config-server
  cloud:
    config:
      server:
        git:
          uri: https://github.com/lgjlife/micro-blog
          #Spring Cloud Config Server强制从远程存储库中提取
          username: xxx
          password: xxx
          force-pull: true
          search-paths: config-repo

```
**启动类添加注解@EnableConfigServer**
```java
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
```
**配置文件**
读取的配置文件的命名方式为 application-profile.yml/application-profile.properties

application和profile都是任意设置的,中间必须是"-"隔开。
比如本例中config-client.yml，config-client-test.yml,config-client-dev.yml


**运行启动,验证是否启动成功**
通过向 Config Server 发送 GET 请求以直接的方式获取， 可用下面的链接形式。
* 不带{label}分支信息，默认访问 master 分支， 可使用：
    * /{application}-{profile}.yml
    * /{application}-{profile}.properties
* 带{label}分支信息， 可使用：
    * /{label}/{application}-{profile}.yml
    * /{application}/{profile} [/{label}]
    * /{label}/{application}-{profile}.properties

比如要访问上面的配置文件,config-client-dev.yml
```yml
name: 123456adsfd3143
data: 7890fdff3413
server:
  port: 8004
```
使用http://localhost:9001/config-client/dev访问，可以看到返回的是JSON格式的数据，说明Config Server配置成功

```json
{"name":"config-client","profiles":["dev"],"label":null,"version":null,"state":null,"propertySources":[{"name":"file:/home/lgj/config-repo/config-client-dev.yml","source":{"name":"123456adsfd3143","data":"7890fdff3413","server.port":8004}},{"name":"file:/home/lgj/config-repo/config-client.yml","source":{"name":"default1"}}]}
```
使用http://localhost:9001/config-client-dev.yml访问,显示的是实际的yml结构配置
```yml
data: 7890fdff3413
name: 123456adsfd3143
server:
  port: 8004
```

<a id="markdown-24712-bootstrapyml与applicationyml区别" name="24712-bootstrapyml与applicationyml区别"></a>
##### 2.4.7.1.2. bootstrap.yml与application.yml区别
说明：其实yml和properties文件是一样的原理，主要是说明application和bootstrap的加载顺序。且一个项目上要么yml或者properties，二选一的存在

**执行顺序**
* bootstrap.yml（bootstrap.properties）用来程序引导时执行，应用于更加早期配置信息读取，如可以使用来配置application.yml中使用到参数等
* application.yml（application.properties) 应用程序特有配置信息，可以用来配置后续各个模块中需使用的公共参数等。
* bootstrap.yml 先于 application.yml 加载
* 如果两个配置文件都有相同的配置,application.yml将会覆盖bootstrap.yml的值

**典型的应用场景如下**
* 当使用 Spring Cloud Config Server 的时候，你应该在 bootstrap.yml 里面指定 spring.application.name 和 spring.cloud.config.server.git.uri和一些加密/解密的信息
技术上，bootstrap.yml 是被一个父级的 Spring ApplicationContext 加载的。这个父级的 Spring ApplicationContext是先加载的，在加载application.yml 的 ApplicationContext之前。

为何需要把 config server 的信息放在 bootstrap.yml 里？
当使用Spring Cloud的时候，配置信息一般是从config server加载的，为了取得配置信息（比如密码等），你需要一些提早的或引导配置。因此，把 config server 信息放在 bootstrap.yml，用来加载真正需要的配置信息。

**高级使用场景**

* 启动上下文
Spring Cloud会创建一个`Bootstrap Context`，作为Spring应用的`Application Context`的父上下文。初始化的时候，`Bootstrap Context`负责从外部源加载配置属性并解析配置。这两个上下文共享一个从外部获取的`Environment`。`Bootstrap`属性有高优先级，默认情况下，它们不会被本地配置覆盖。 `Bootstrap context`和`Application Context`有着不同的约定，所以新增了一个`bootstrap.yml`文件，而不是使用`application.yml` (或者`application.properties`)。保证`Bootstrap Context`和`Application Context`配置的分离。下面是一个例子： **bootstrap.yml**

```yml
spring:
  application:
    name: foo
  cloud:
    config:
      uri: ${SPRING_CONFIG_URI:http://localhost:8888}
```
推荐在`bootstrap.yml` or `application.yml`里面配置`spring.application.name`. 你可以通过设置`spring.cloud.bootstrap.enabled=false`来禁用`bootstrap`。

* 应用上下文层次结构
如果你通过`SpringApplication`或者`SpringApplicationBuilder`创建一个`Application Context`,那么会为spring应用的`Application Context`创建父上下文`Bootstrap Context`。在Spring里有个特性，子上下文会继承父类的`property sources` and `profiles` ，所以`main application context` 相对于没有使用Spring Cloud Config，会新增额外的`property sources`。额外的`property sources`有：

“bootstrap” : 如果在Bootstrap Context扫描到PropertySourceLocator并且有属性，则会添加到CompositePropertySource。Spirng Cloud Config就是通过这种方式来添加的属性的，详细看源码ConfigServicePropertySourceLocator`。下面也也有一个例子自定义的例子。
“applicationConfig: [classpath:bootstrap.yml]” ，（如果有spring.profiles.active=production则例如 applicationConfig: [classpath:/bootstrap.yml]#production）: 如果你使用bootstrap.yml来配置Bootstrap Context，他比application.yml优先级要低。它将添加到子上下文，作为Spring Boot应用程序的一部分。下文有介绍。
由于优先级规则，Bootstrap Context不包含从bootstrap.yml来的数据，但是可以用它作为默认设置。

你可以很容易的扩展任何你建立的上下文层次，可以使用它提供的接口，或者使用SpringApplicationBuilder包含的方法（parent()，child()，sibling()）。Bootstrap Context将是最高级别的父类。扩展的每一个Context都有有自己的bootstrap property source（有可能是空的）。扩展的每一个Context都有不同spring.application.name。同一层层次的父子上下文原则上也有一有不同的名称，因此，也会有不同的Config Server配置。子上下文的属性在相同名字的情况下将覆盖父上下文的属性。

注意SpringApplicationBuilder允许共享Environment到所有层次，但是不是默认的。因此，同级的兄弟上下文不在和父类共享一些东西的时候不一定有相同的profiles或者property sources。

* 修改Bootstrap属性配置
源码位置BootstrapApplicationListener。

```java
String configName = environment.resolvePlaceholders("${spring.cloud.bootstrap.name:bootstrap}");

String configLocation = environment.resolvePlaceholders("${spring.cloud.bootstrap.location:}");

Map<String, Object> bootstrapMap = new HashMap<>();bootstrapMap.put("spring.config.name",configName);
if(StringUtils.hasText(configLocation)){
    bootstrapMap.put("spring.config.location", configLocation);
}
```
bootstrap.yml是由spring.cloud.bootstrap.name（默认:”bootstrap”）或者spring.cloud.bootstrap.location（默认空）。这些属性行为与spring.config.*类似，通过它的Environment来配置引导ApplicationContext。如果有一个激活的profile（来源于spring.profiles.active或者Environment的Api构建），例如bootstrap-development.properties 就是配置了profile为development的配置文件.

* 覆盖远程属性
property sources被bootstrap context 添加到应用通常通过远程的方式，比如”Config Server”。默认情况下，本地的配置文件不能覆盖远程配置，但是可以通过启动命令行参数来覆盖远程配置。如果需要本地文件覆盖远程文件，需要在远程配置文件里设置授权 
spring.cloud.config.allowOverride=true（这个配置不能在本地被设置）。一旦设置了这个权限，你可以配置更加细粒度的配置来配置覆盖的方式，

比如： 
```
- spring.cloud.config.overrideNone=true 覆盖任何本地属性 
- spring.cloud.config.overrideSystemProperties=false 仅仅系统属性和环境变量 
```
源文件见PropertySourceBootstrapProperties

* 自定义启动配置
bootstrap context是依赖/META-INF/spring.factories文件里面的org.springframework.cloud.bootstrap.BootstrapConfiguration条目下面，通过逗号分隔的Spring  @Configuration类来建立的配置。任何main application context需要的自动注入的Bean可以在这里通过这种方式来获取。这也是ApplicationContextInitializer建立@Bean的方式。可以通过@Order来更改初始化序列，默认是”last”。

```yml
# spring-cloud-context-1.1.1.RELEASE.jar
# spring.factories
# AutoConfiguration
org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration,\
org.springframework.cloud.autoconfigure.RefreshAutoConfiguration,\
org.springframework.cloud.autoconfigure.RefreshEndpointAutoConfiguration,\
org.springframework.cloud.autoconfigure.LifecycleMvcEndpointAutoConfiguration

# Application Listeners
org.springframework.context.ApplicationListener=\
org.springframework.cloud.bootstrap.BootstrapApplicationListener,\
org.springframework.cloud.context.restart.RestartListener

# Bootstrap components
org.springframework.cloud.bootstrap.BootstrapConfiguration=\
org.springframework.cloud.bootstrap.config.PropertySourceBootstrapConfiguration,\
org.springframework.cloud.bootstrap.encrypt.EncryptionBootstrapConfiguration,\
org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration,\
org.springframework.boot.autoconfigure.PropertyPlaceholderAutoConfiguration
```

警告 
小心，你添加的自定义BootstrapConfiguration类没有错误的@ComponentScanned到你的主应用上下文，他们可能是不需要的。使用一个另外的包不被@ComponentScan或者@SpringBootApplication注解覆盖到。


bootstrap context通过spring.factories配置的类初始化的所有的Bean都会在SpingApplicatin启动前加入到它的上下文里去。

自定义引导配置来源：Bootstrap Property Sources
默认的`property source`添加额外的配置是通过配置服务（Config Server），你也可以自定义添加`property source`通过实现`PropertySourceLocator`接口来添加。你可以使用它加配置属性从不同的服务、数据库、或者其他。

下面是一个自定义的例子:
```java
@Configuration
public class CustomPropertySourceLocator implements PropertySourceLocator {

    @Override
    public PropertySource<?> locate(Environment environment) {
        return new MapPropertySource("customProperty",
                Collections.<String, Object>singletonMap("property.from.sample.custom.source", "worked as intended"));
    }
}
```

Environment被ApplicationContext建立，并传入property sources（可能不同个profile有不同的属性），所以，你可以从Environment寻找找一些特别的属性。比如spring.application.name，它是默认的Config Server property source。

如果你建立了一个jar包，里面添加了一个META-INF/spring.factories文件：

org.springframework.cloud.bootstrap.BootstrapConfiguration=sample.custom.CustomPropertySourceLocator
那么，”customProperty“的PropertySource将会被包含到应用。


<a id="markdown-24713-客户端配置" name="24713-客户端配置"></a>
##### 2.4.7.1.3. 客户端配置

**引入依赖**

```xml
 <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-config</artifactId>
</dependency>
```

**yml配置文件**
```yml
# 必须放在bootstrap.yml中
spring:
  application:
    name: config-client
  # cloud config 配置中心
  cloud:
    config:
      #config server 地址
      uri: http://localhost:9001
      #如果服务无法连接到配置服务器，则可能希望启动服务失败
      fail-fast: true
      label: master
  # 指定profiles
  profiles:
    active: dev

eureka:
  client:
    service-url:
      defaultZone: http://localhost:8001/eureka/

```

**java代码中使用**

使用@Value注解引入，由于上面设置 fail-fast: true，因此注入失败时将会报错，服务无法启动。
```java
@Slf4j
@RefreshScope // curl -X POST http://localhost:8004/actuator/refresh
@RestController
@RequestMapping("/config")
public class ConfigController {


    @Value("${data}")
    private String data;

    @Value("${name}")
    private String name;

    @RequestMapping("/name")
    public String name(){
        log.info("name = " + name );
        return name;
    }

    @RequestMapping("/data")
    public String data(){
        log.info("data = " + data );
        return data;
    }
}
```

<a id="markdown-24714-刷新配置" name="24714-刷新配置"></a>
##### 2.4.7.1.4. 刷新配置
有一种场景需要更改配置而不需要重启服务。

* 客户端需要进行相关的配置

必须要引入actuator依赖
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

默认端点是不开放的，需要使能打开
```yml
management:
  endpoints:
    web:
      exposure:
        include: "*"
```

向客户端发送post请求http://localhost:8004/actuator/refresh即可刷新配置
```
curl -X POST http://localhost:8004/actuator/refresh
```


<a id="markdown-2472-原理说明" name="2472-原理说明"></a>
#### 2.4.7.2. 原理说明
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2473-更多使用方式" name="2473-更多使用方式"></a>
#### 2.4.7.3. 更多使用方式
<a href="#menu" style="float:right">目录</a>

<a id="markdown-248-消息总线bus" name="248-消息总线bus"></a>
### 2.4.8. 消息总线bus
<a href="#menu" style="float:right">目录</a>

Spring Cloud Bus是用轻量的消息代理将分布式的节点连接起来,可以用于广播配置文件的更改或者服务的监控管理。一个关键的思想就是,消息总线可以为微服务做监控,也可以实现应用程序之间相互通信。 Spring Cloud Bus可选的消息代理线线泡括RabbitMQ、 AMQP和Kaka等。
     
为什么需要用 Spring Cloud Bus去刷新配置呢?
如果有几十个微服务,而每一个服务又是多实例,当更改配置时,需要重新启动多个微服务实例,会非常麻烦。 Spring Cloud Bus的一个功能就是让这个过程变得简单,当远程Git仓库的配置更改后,只需要向某一个微服务实例发送一个Post请求,通过消息组件通知其他微服务实例重新拉取配置文件

![](https://springcloud-oss.oss-cn-shanghai.aliyuncs.com/chapter8/configbus1.jpg)

根据此图我们可以看出利用Spring Cloud Bus做配置更新的步骤:
1. 提交代码触发post给客户端A发送bus/refresh
2. 客户端A接收到请求从Server端更新配置并且发送给Spring Cloud Bus
3. Spring Cloud bus接到消息并通知给其它客户端
4. 其它客户端接收到通知，请求Server端获取最新配置
5. 全部客户端均获取到最新的配置

<a id="markdown-2481-消息代理" name="2481-消息代理"></a>
#### 2.4.8.1. 消息代理
消息代理 (Message Broker) 是一种消息验证、 传输、 路由的架构模式。 它在应用程序之间起到通信调度并最小化应用之间的依赖的作用， 使得应用程序可以高效地解耦通信过程。 消息代理是一个中间件产品， 它的核心是一个消息的路由程序， 用来实现接收和分发消息， 并根据设定好的消息处理流来转发给正确的应用。 它包括独立的通信和消息传递协议， 能够实现组织内部和组织间的网络通信。 设计代理的目的就是为了能够从应用程序中传入消息， 并执行一些特别的操作， 下面这些是在企业应用中， 我们经常需要使用消息代理的场景：
* 将消息路由到一个或多个目的地
* 消息转化为其他的表现方式。
* 执行消息的聚集、 消息的分解， 并将结果发送到它们的目的地， 然后重新组合响应返回给消息用户。
* 调用Web服务来检索数据。
* 响应事件或错误。
* 使用发布－订阅模式来提供内容或基千主题的消息路由。

当前版本的Spring Cloud Bus仅支待两款中间件产品： RabbitMQ和Kafka

<a id="markdown-249-消息驱动的微服务stream" name="249-消息驱动的微服务stream"></a>
### 2.4.9. 消息驱动的微服务Stream
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2410-分布式服务跟踪sleuth" name="2410-分布式服务跟踪sleuth"></a>
### 2.4.10. 分布式服务跟踪Sleuth
<a href="#menu" style="float:right">目录</a>

<a id="markdown-24101-基本使用" name="24101-基本使用"></a>
#### 2.4.10.1. 基本使用 

pom配置
```xml
<!--  sleuth -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-sleuth</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-zipkin</artifactId>
</dependency>
```

**配置文件**
因为数据需要发送到zipkin进行可视化查看，所以要配置zipkin的地址
```yml
spring:
  zipkin:
    # ZIPKINF地址
    base-url: http://localhost:9411
    sleuth:
      sampler:
        percentage: 1.0
```

**zipkin可视化查看**
[下载zipkin](https://github.com/openzipkin/zipkin/tree/master/zipkin-server)
可以直接下载jar文件，默认端口是9411。
访问：http://localhost:9411

**数据说明**
消费者发起一个请求，输出日志

```
//消费者
2019-08-23 02:03:57.657  INFO [eureka-consumer-feign,c920e0c9f8dbb546,c920e0c9f8dbb546,false] 6682 --- [nio-8004-exec-5] c.s.e.controller.ClientController        : 客户端访问
//服务提供者
2019-08-23 02:03:57.667  INFO [provider,c920e0c9f8dbb546,5259cbee0117b850,false] 6558 --- [nio-8002-exec-3] c.s.e.provider.ProviderController        : THis is provider!,[null]

```
[eureka-consumer-feign,c920e0c9f8dbb546,c920e0c9f8dbb546,false]
[provider,c920e0c9f8dbb546,5259cbee0117b850,false]
* 第一个值： eureka-consumer-feign/provider,它记录了应用的名称，也就是spring.application.name参数配置的属性。
* 第二个值： c920e0c9f8dbb546,Spring Cloud Sleuth生成的一个ID, 称为Trace ID,它用来标识一条请求链路。 一条请求链路中包含一个TraceID, 多个SpanID。
* 第三个值： 5259cbee0117b850, Spring Cloud Sleuth生成的另外一个 ID, 称为SpanID, 它表示一个基本的工作单元， 比如发送一个HTTP请求。
* 第四个值： false, 表示是否要将该信息 输出到Zipkin等服务中来收集和展示 。

上面四个值中的**TraceID**和**SpanID**是Spring Cloud Sleuth实现分布式服务跟踪的核心。 在一次服务请求链路的调用过程中， 会保待并传递同一个**Trace ID**, 从而将整个分布于不同微服务进程中的请求跟踪 信息串联起来。 以上面输出内容为例， trace-1 和trace-2同属于一个前端服务请求来源，所以它们的TraceID是相同的，处于同一条请求链路中


<a id="markdown-24102-跟踪原理" name="24102-跟踪原理"></a>
#### 2.4.10.2. 跟踪原理

这里只讲feign和Sleuth的实现原理，其他方式基本原理上差不多。

<a id="markdown-241021-基本实现原理" name="241021-基本实现原理"></a>
##### 2.4.10.2.1. 基本实现原理

在了解其实现原理之前需要思考的问题是，假如消费者使用的Feign声明式服务调用，sleuth是如何接入的，是如何生成各种ID插入请求的？

在使用feign进行调用时，最终执行调用的是feign包下的execute(Request var1, Options var2)方法执行。
Feign使用其内部静态实现类Default进行具体的处理

```java
package feign;

public interface Client {
    Response execute(Request var1, Options var2) throws IOException;
    public static class Default implements Client {
        public Response execute(Request request, Options options) throws IOException {
            HttpURLConnection connection = this.convertAndSend(request, options);
            return this.convertResponse(connection, request);
        }
    }
}
```
因此我们只需要继承或者使用装饰模式即可对Request进行扩展，也就是添加各种ID。

```java
//使用继承模式
public class SleuthClient implements Client.Default {

    
    public Response execute(Request request, Options options) throws IOException {
        request.setHeader("X-B3-Traceld",1234);
        request.setHeader("X-B3-Spanld",1234);
        treturn super.client(request,options);        
    }
}

//使用装饰模式
public class SleuthClient implements Client {

    private Client client;

    public SleuthClient(Client client){
        this.client = client;
    }

    public Response execute(Request request, Options options) throws IOException {
        request.setHeader("X-B3-Traceld",1234);
        request.setHeader("X-B3-Spanld",1234);
        treturn this.client(request,options);        
    }
}

main(){
    //使用继承模式
    SleuthClient sleuthClient = new SleuthClient();
    sleuthClient.excute(request,opts);

    //使用装饰模式
    Client.Default default = new Client.Default();
    SleuthClient sleuthClient = new SleuthClient(default);
    sleuthClient.excute(request,opts);
}
```
----

<a id="markdown-241022-支持的组件" name="241022-支持的组件"></a>
##### 2.4.10.2.2. 支持的组件
Spring Cloud Sleuth可以追踪10种类型的组件，async、Hystrix，messaging，websocket，rxjava，scheduling，web（Spring MVC Controller，Servlet），webclient（Spring RestTemplate）、Feign、Zuul。下面是常用的八种类型。

![Sleuth支持的组件](https://github.com/lgjlife/Java-Study/blob/master/pic/spring/springcloud/sleuth-instructment.png?raw=true)
**Scheduled**
原理是AOP处理Scheduled注解TraceSchedulingAspect可以带出，只要是在IOC容器中的Bean带有@Scheduled注解的方法的调用都会被sleuth处理。

**Messaging**
原理是基于spring messaging的ChannelInterceptor。
TraceChannelInterceptor/IntegrationTraceChannelInterceptor 
MessagingSpanTextMapExtractor和MessagingSpanTextMapInjector

**Hystrix**
原理是使用HystrixPlugins添加trace相关的plugin，自定义了一个HystrixConcurrencyStrategy的实现SleuthHystrixConcurrencyStrategy 
具体参考TraceCommand和SleuthHystrixConcurrencyStrategy

**Feign**
原理是实现了两个Feign Client实例，一个不带Ribbon TraceFeignClient、一个带Ribbon，TraceLoadBalancerFeignClient 
TraceFeignAspect AOP里面的逻辑是，有地方想获取Client实例，就拦截返回自己封装的Client。

**Async**
@Async注解和ThreadPoolTaskExecutor下面的类 
具体参看TraceAsyncAspect

**RestTempate**
原理是spring client的Interceptor机制。具体参看TraceRestTemplateInterceptor。

**Zuul**
原理是zuul的Filter机制，ZuulFilter 
实现了三个TracePreZuulFilter、TracePostZuulFilter两个Filter。

<a id="markdown-241023-一些基本概念" name="241023-一些基本概念"></a>
##### 2.4.10.2.3. 一些基本概念

* 为了实现请求跟踪， 当请求发送到分布式系统的入口端点时， 只需要服务跟踪框架为该请求创建一个唯一的跟踪标识， 同时在分布式系统内部流转的时候， 框架始终保待传递 该唯一标识， 直到返回给请求方为止， 这个唯一 标识就是前文中提到的TraceID。 通过TraceID 的记录， 我们就能将所有请求过程的日志关联起来。
* 为了统计各处理单元的时间延迟， 当请求到达各个服务组件时， 或是处理逻辑到达某个状态时， 也通过一个唯一标识来标记它的开始、 具体过程以及结束， 该标识就是前文中提到的SpanID。 对于每个Span来说， 它必须有开始和结束 两个节点， 通过记录开始 Span和结束Span的时间戳，就能统计出该Span的时间延迟，除了时间戳记录之外， 它还可以包含一些其他元数据， 比如事件名称、 请求信息等


* cs - Client Sent -客户端发起一个请求，这个annotion描述了这个span的开始
* sr - Server Received -服务端获得请求并准备开始处理它，如果将其sr减去cs时间戳便可得到网络延迟
* ss - Server Sent -注解表明请求处理的完成(当请求返回客户端)，如果ss减去sr时间戳便可得到服务端需要的处理请求时间
* cr - Client Received -表明span的结束，客户端成功接收到服务端的回复，如果cr减去cs时间戳便可得到客户端从服务端获取回复的所有所需时间

在请求发送到下一个应用之前， Sleuth 会在该请求的Header中增加实现跟踪需要的重要信息，主要有下面这几个
* X-B3-Traceld: 一条请求链路 (Trace) 的唯一 标识， 必需的值。
* X-B3-Spanld: 一个工作单元 (Span) 的唯一 标识， 必需的值。
* X-B3-ParentSpanld: 标识当前工作单元所属的上一个工作单元 ， Root Span C 请求链路的第一个工作单元） 的该值为空。
* X-B3-Sampled: 是否被抽样输出的标志， 1 表示需要被输出 ， 0 表示不需要被输出
* X-B3-Flags: 用于Debug,为1代表采样

```java
package brave.propagation;
public final class B3Propagation<K> implements Propagation<K> {
    static final String TRACE_ID_NAME = "X-B3-TraceId";
    static final String SPAN_ID_NAME = "X-B3-SpanId";
    static final String PARENT_SPAN_ID_NAME = "X-B3-ParentSpanId";
    static final String SAMPLED_NAME = "X-B3-Sampled";
    static final String FLAGS_NAME = "X-B3-Flags";
}
```

<a id="markdown-241024-zipkin" name="241024-zipkin"></a>
##### 2.4.10.2.4. zipkin
Zipkin是Twitter的一个开源项目，我们可以使用它来收集各个服务器上请求链路的跟踪数据，并通过它提供的API接口来辅助查询跟踪数据以分布式系统的监控程序，通过UI组件帮助我们及时发现系统中出现的延迟升高问题以及系统性能瓶颈根源。
**基本概念**
下面展示Zipkin的基础架构，它主要由4个核心组件构成

![](https://img-blog.csdn.net/20181010190929921?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3pobGxhbnNlemhpbGlhbg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

* Collector（收集器组件）：主要负责收集外部系统跟踪信息，转化为Zipkin内部的Span格式。
* Storage（存储组件）：主要负责收到的跟踪信息的存储，默认为存储在内存中，同时支持存储到Mysql、Cassandra以及ElasticSearch。
* API（Query）： 负责查询Storage中存储的数据，提供简单的JSON API获取数据，主要提供给web UI使用。
* Web UI（展示组件）：提供简单的web界面，方便进行跟踪信息的查看以及查询，同时进行相关的分析。

Instrumented Client 和Instrumented Server，是指分布式架构中使用了Trace工具的两个应用，Client会调用Server提供的服务，两者都会向Zipkin上报Trace相关信息。在Client 和 Server通过Transport上报Trace信息后，由Zipkin的Collector模块接收，并由Storage模块将数据存储在对应的存储介质中，然后Zipkin提供API供UI界面查询Trace跟踪信息。Non-Instrumented Server，指的是未使用Trace工具的Server，显然它不会上报Trace信息。

**数据模型**
我们先来看看 Zipkin中关于跟踪信息的 一些基础概念。 由于 Zipkin的实现借鉴了Google的Dapper, 所以它们有着类似的核心术语， 主要有下面几项内容。

* **Span:** 它代表了一个基础的工作单元。 我们以 HTTP请求为例，一次完整的请求过程在客户端和服务端都会产生多个不同的事件状态（比如下面所说的4个核心Annotation 所标识的不同阶段）。对于同一个请求来说， 它们属于一个工作单元， 所以同一 HTTP 请求过程中的 4 个 Annotation 同属千一个 Span。每一个不同的工作单元都通过一个 64 位的 ID 来唯一标识， 称为 Span ID。 另外， 在工作单元中还存储了一个用来串联其他工作单元的 ID, 它也通过一个 64 位的 ID 来唯一标识， 称为Trace ID。 在同一条请求链路中的不同工作单元都会有不同的 Span ID, 但是它们的Trace ID 是相同的， 所以通过 Trace ID 可以将一次请求中依赖的所有依赖请求串联起来形成请求链路。 除了这两个核心的 ID 之外， Span 中还存储了一些其他信息，比如，描述信息、事件时间戳、Annotation 的键值对属性、上一级工作单元的 Span ID等。
* **Trace:** 它是由 一系列具有相同 Trace ID 的 Span 串联形成的一个树状结构。 在复杂的分布式系统中， 每一个外部请求通常都会产生一个复杂的树状结构的 Trace。
* **Annotation:** 它用来及时地记录一个事件的存在。我们可以把 Annotation 理解为一个包含有时间戳的事件标签， 对千一个 HTTP 请求来说， 在 Sleuth 中定义了下面 4 个核心 Annotation 来标识一个请求的开始和结束。
    * cs (Client Send): 该 Annotation 用来记录客户端发起了一个请求， 同时它也标识了这个 HTTP 请求的开始。
    * sr (Server Received): 该 Annotation 用来记录服务端接收到了请求， 并准备开始处理它。通过计算 sr 与 cs 两个Annotation 的时间戳之差，我们可以得到当前 HTTP请求的网络延迟。
    * ss (Server Send): 该 Annotation 用来记录服务端处理完请求后准备发送请求响应信息。 通过计算 ss 与 sr 两个 Annotation 的时间戳之差， 我们可以得到当前服务端处理请求的时间消耗。
    * cr (Client Received): 该 Annotation 用来记录客户端接收到服务端的回复， 同时它也标识了这个 HTTP 请求的结束。 通过计算 er 与 cs 两个 Annotation 的时间戳之差， 我们可以得到该 HTTP 请求从客户端发起到接收服务端响应的总时间消耗。
* **BinaryAnnotation:** 它用来对跟踪信息添加一些额外的补充说明， 一般以键值对的方式出现。 比如， 在记录 HTTP 请求接收后执行具体业务逻辑时， 此时并没有默认的Annotation 来标识该事件状态， 但是有 BinaryAnnotation 信息对其进行补充。


**追踪流程**
流程图如下：
![](https://img-blog.csdn.net/20181010190939687?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3pobGxhbnNlemhpbGlhbg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

由上图可以看出，用户的应用发起Http Get（User Request）请求（请求路径/trace），经过spring cloud Sleuth的Trace框架（Trace Instrumentation）拦截，并依次经过如下步骤，最后记录Trace信息到Zipkin中：

记录tags信息；
1. 将当前调用链的Trace信息记录到Http Headers中；
2. 记录当前调用的时间戳（timestamp）；
3. 发送http请求，并携带Trace相关的Header，如TraceId:11aa， SpanId:22bb；
4. 调用结束后，记录当次调用所花的时间（duration）；
5. 将步骤1-5，汇总成一个Span（最小的Trace单元），上报该Span信息给Zipkin Collector。

**sletuh+streaming+zipkin**
这种方式通过spring cloud streaming将追踪信息发送到zipkin。spring cloud streaming目前只支持kafka和rabbitmq。Zipkin Collector从消息中间件中读取数据并存储：
![](https://img-blog.csdn.net/20181010191040623?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3pobGxhbnNlemhpbGlhbg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

<a id="markdown-241025-调用过程" name="241025-调用过程"></a>
##### 2.4.10.2.5. 调用过程

![Sleuth支持的组件](https://github.com/lgjlife/Java-Study/blob/master/pic/spring/springcloud/sleuth-request.png?raw=true)

```
消费者feign声明式调用--->中间处理--->org.springframework.cloud.openfeign.ribbon.FeignLoadBalancer.execute()--->org.springframework.cloud.openfeign.ribbon.execute()--->org.springframework.cloud.sleuth.instrument.web.client.feign.LazyTracingFeignClient.execute()--->org.springframework.cloud.sleuth.instrument.web.client.feign.TracingFeignClient.execute()--->feign.Client.Default.execute()
```
其中在TracingFeignClient.execute()处添加了Headers
```java
//TracingFeignClient.execute(),handleSend执行修改 headers处理
Span span = this.handleSend(headers, request, (Span)null);
//org.springframework.cloud.sleuth.instrument.web.client.feign.TracingFeignClient
Span handleSend(Map<String, Collection<String>> headers, Request request, Span clientSpan) {
    return clientSpan != null ? this.handler.handleSend(this.injector, headers, request, clientSpan) : this.handler.handleSend(this.injector, headers, request);
}
//brave.http.HttpClientHandler。这是io.zipkin.brave下的类
public <C> Span handleSend(Injector<C> injector, C carrier, Req request, Span span) {
    injector.inject(span.context(), carrier);
    return this.handleStart(request, span);
} 
//B3Propagation类下的内部类
static final class B3Injector<C, K> implements Injector<C> {
final B3Propagation<K> propagation;
final Setter<C, K> setter;

B3Injector(B3Propagation<K> propagation, Setter<C, K> setter) {
    this.propagation = propagation;
    this.setter = setter;
}

public void inject(TraceContext traceContext, C carrier) {
    this.setter.put(carrier, this.propagation.traceIdKey, traceContext.traceIdString());
    this.setter.put(carrier, this.propagation.spanIdKey, traceContext.spanIdString());
    String parentId = traceContext.parentIdString();
    if (parentId != null) {
        this.setter.put(carrier, this.propagation.parentSpanIdKey, parentId);
    }

    if (traceContext.debug()) {
        this.setter.put(carrier, this.propagation.debugKey, "1");
    } else if (traceContext.sampled() != null) {
        this.setter.put(carrier, this.propagation.sampledKey, traceContext.sampled() ? "1" : "0");
    }

}
}
```







<a id="markdown-25-测试" name="25-测试"></a>
## 2.5. 测试
<a href="#menu" style="float:right">目录</a>

<a id="markdown-251-基本测试" name="251-基本测试"></a>
### 2.5.1. 基本测试
<a href="#menu" style="float:right">目录</a>

<a id="markdown-252-控制层测试" name="252-控制层测试"></a>
### 2.5.2. 控制层测试
<a href="#menu" style="float:right">目录</a>

<a id="markdown-253-服务层测试" name="253-服务层测试"></a>
### 2.5.3. 服务层测试
<a href="#menu" style="float:right">目录</a>

<a id="markdown-254-dao层测试" name="254-dao层测试"></a>
### 2.5.4. DAO层测试
<a href="#menu" style="float:right">目录</a>


<span id="menu"></span>

<a id="markdown-3-mysql" name="3-mysql"></a>
# 3. MySQL
<a href="#menu" style="float:right">目录</a>

<a id="markdown-31-基本概念" name="31-基本概念"></a>
## 3.1. 基本概念
<a href="#menu" style="float:right">目录</a>

<a id="markdown-311-基本概念" name="311-基本概念"></a>
### 3.1.1. 基本概念
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


<a id="markdown-312-常用工具" name="312-常用工具"></a>
### 3.1.2. 常用工具
* workbench 跨平台可视化客户端

<a id="markdown-313-逻辑架构图" name="313-逻辑架构图"></a>
### 3.1.3. 逻辑架构图
<a href="#menu" style="float:right">目录</a>

![](https://github.com/lgjlife/Java-Study/blob/master/pic/mysql/mysql1.jpeg?raw=true)
![](https://github.com/lgjlife/Java-Study/blob/master/pic/mysql/mysql2.jpeg?raw=true)

* 连接--->认证---->确认可执行的权限
* MYSQL5.5及以上提供线程池插件，可以使用池中较少的线程来服务大量的连接
* MYSQL会对SQL进行相对应的优化，以提供最佳的访问性能
* 在解析查询之前，服务器会先检察查询缓存(如果开启的话)，存在缓存则直接将缓存返回客户端，更新操作将会修改缓存，缓存中没有数据，查询之后也会更新缓存。



<a id="markdown-314-常用配置" name="314-常用配置"></a>
### 3.1.4. 常用配置
<a href="#menu" style="float:right">目录</a>

<a id="markdown-32-日志文件" name="32-日志文件"></a>
## 3.2. 日志文件
<a href="#menu" style="float:right">目录</a>

<a id="markdown-321-参数文件" name="321-参数文件"></a>
### 3.2.1. 参数文件
<a href="#menu" style="float:right">目录</a>

* 告诉MYSQL实例启动时在哪里可以找到数据库文件，并且指定初始化参数，这些参数定义了某种内存结构的大小等设置，还会介绍参数的类型
也就是配置文件
```bash
lgj@lgj-Lenovo-G470:~$ mysql --help | grep my.cnf
                      order of preference, my.cnf, $MYSQL_TCP_PORT,
/etc/my.cnf /etc/mysql/my.cnf ~/.my.cnf 
```


<a id="markdown-322-日志文件" name="322-日志文件"></a>
### 3.2.2. 日志文件
<a href="#menu" style="float:right">目录</a>
* 用来记录运行时产生的日志，比如慢查询日志，二进制日志

<a id="markdown-323-socket文件" name="323-socket文件"></a>
### 3.2.3. socket文件
<a href="#menu" style="float:right">目录</a>
* 当用UNIX域套接字进行连接时需要的文件 

<a id="markdown-324-pid文件" name="324-pid文件"></a>
### 3.2.4. pid文件
<a href="#menu" style="float:right">目录</a>
* MYSQL实例的进程PID文件


<a id="markdown-325-mysql表结构文件" name="325-mysql表结构文件"></a>
### 3.2.5. MySQL表结构文件
<a href="#menu" style="float:right">目录</a>
* 表结构定义文件 

<a id="markdown-326-存储引擎文件" name="326-存储引擎文件"></a>
### 3.2.6. 存储引擎文件
<a href="#menu" style="float:right">目录</a>
* 存储了记录和索引等数据


<a id="markdown-33-nosql与关系型数据库设计理念比较" name="33-nosql与关系型数据库设计理念比较"></a>
## 3.3. NoSQL与关系型数据库设计理念比较　　

关系型数据库中的表都是存储一些格式化的数据结构，每个元组字段的组成都一样，即使不是每个元组都需要所有的字段，但数据库会为每个元组分配所有的字段，这样的结构可以便于表与表之间进行连接等操作，但从另一个角度来说它也是关系型数据库性能瓶颈的一个因素。而非关系型数据库以键值对存储，它的结构不固定，每一个元组可以有不一样的字段，每个元组可以根据需要增加一些自己的键值对，这样就不会局限于固定的结构，可以减少一些时间和空间的开销。

<a id="markdown-331-关系型数据库" name="331-关系型数据库"></a>
### 3.3.1. 关系型数据库
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

<a id="markdown-332-非关系型数据库" name="332-非关系型数据库"></a>
### 3.3.2. 非关系型数据库
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






<a id="markdown-34-使用数据库" name="34-使用数据库"></a>
## 3.4. 使用数据库
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



<a id="markdown-35-数据类型" name="35-数据类型"></a>
## 3.5. 数据类型
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

<a id="markdown-36-数据更新" name="36-数据更新"></a>
## 3.6. 数据更新

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


<a id="markdown-37-查询入门" name="37-查询入门"></a>
## 3.7. 查询入门
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


<a id="markdown-38-多表连接查询" name="38-多表连接查询"></a>
## 3.8. 多表连接查询
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

<a id="markdown-39-函数" name="39-函数"></a>
## 3.9. 函数
<a href="#menu" style="float:right">目录</a>

<a id="markdown-391-聚集函数" name="391-聚集函数"></a>
### 3.9.1. 聚集函数
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

<a id="markdown-392-数学函数" name="392-数学函数"></a>
### 3.9.2. 数学函数
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

<a id="markdown-393-字符串函数" name="393-字符串函数"></a>
### 3.9.3. 字符串函数
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

 
<a id="markdown-394-日期和时间函数" name="394-日期和时间函数"></a>
### 3.9.4. 日期和时间函数
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

<a id="markdown-395-条件判断函数" name="395-条件判断函数"></a>
### 3.9.5. 条件判断函数

* IF(expr,v1,v2)
    * 如果expr是TRUE则返回v1，否则返回v2
* IFNULL(v1,v2)
    * 如果v1不为NULL，则返回v1，否则返回v2
* CASE expr WHEN v1 THEN r1 [WHEN v2 THEN v2] [ELSE rn] END
    * 如果expr等于某个vn，则返回对应位置THEN后面的结果，如果与所有值都不想等，则返回ELSE后面的rn
 

<a id="markdown-396-系统信息函数" name="396-系统信息函数"></a>
### 3.9.6. 系统信息函数

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

 

<a id="markdown-397-加密函数" name="397-加密函数"></a>
### 3.9.7. 加密函数

* PASSWORD(str)
    * 从原明文密码str计算并返回加密后的字符串密码，注意这个函数的加密是单向的（不可逆），因此不应将它应用在个人的应用程序中而应该只在MySQL服务器的鉴定系统中使用
* MD5(str)
    * 为字符串算出一个MD5 128比特校验和，改值以32位十六进制数字的二进制字符串形式返回
* ENCODE(str, pswd_str)
    * 使用pswd_str作为密码，加密str
* DECODE(crypt_str,pswd_str)
    * 使用pswd_str作为密码，解密加密字符串crypt_str，crypt_str是由ENCODE函数返回的字符串
<a id="markdown-398-其他函数" name="398-其他函数"></a>
### 3.9.8. 其他函数
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


<a id="markdown-310-存储过程" name="310-存储过程"></a>
## 3.10. 存储过程
<a href="#menu" style="float:right">目录</a>

<a id="markdown-3101-基本概念" name="3101-基本概念"></a>
### 3.10.1. 基本概念
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

<a id="markdown-3102-使用存储过程" name="3102-使用存储过程"></a>
### 3.10.2. 使用存储过程


<a id="markdown-311-视图" name="311-视图"></a>
## 3.11. 视图
<a href="#menu" style="float:right">目录</a>

<a id="markdown-3111-基本概念" name="3111-基本概念"></a>
### 3.11.1. 基本概念

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

<a id="markdown-312-触发器" name="312-触发器"></a>
## 3.12. 触发器
<a href="#menu" style="float:right">目录</a>

<a id="markdown-3121-基本概念" name="3121-基本概念"></a>
### 3.12.1. 基本概念
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
<a id="markdown-3122-触发器操作" name="3122-触发器操作"></a>
### 3.12.2. 触发器操作
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


<a id="markdown-313-事务" name="313-事务"></a>
## 3.13. 事务
<a href="#menu" style="float:right">目录</a>

<a id="markdown-3131-基本概念" name="3131-基本概念"></a>
### 3.13.1. 基本概念

<a id="markdown-31311-事务特点" name="31311-事务特点"></a>
#### 3.13.1.1. 事务特点
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

<a id="markdown-31312-锁" name="31312-锁"></a>
#### 3.13.1.2. 锁
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

<a id="markdown-31313-多版本并发控制" name="31313-多版本并发控制"></a>
#### 3.13.1.3. 多版本并发控制

* MVCC是行级锁的一个变种，很多情况下可以避免加锁，所以开销更低。大都实现了非阻塞读操作，写操作也只锁定必要的行。

* InnoDB的实现
    * 每行记录后保存两个隐藏的列来实现
    * 一个列保存了行的创建版本号，一个列保存行的过期(删除)版本号
    * 每开始一个新事务，系统版本号都会自动递增。事务开始时刻的系统版本号会作为事务的版本号。用来和查询到的每行记录的版本号进行比较。
    
<a id="markdown-31314-常见术语" name="31314-常见术语"></a>
#### 3.13.1.4. 常见术语
* 术语：
    * 事务（transaction）指一组SQL语句；
    * 回退（rollback）指撤销指定SQL语句的过程；
    * 提交（commit）指将未存储的SQL语句结果写入数据库表；   
    * 保留点（ savepoint）指事务处理中设置的临时占位符（ placeholder），你可以对它发布回退（与回退整个事务处理不同）。

<a id="markdown-3132-基本语句" name="3132-基本语句"></a>
### 3.13.2. 基本语句
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


<a id="markdown-314-数据库索引" name="314-数据库索引"></a>
## 3.14. 数据库索引 
<a href="#menu" style="float:right">目录</a>


<a id="markdown-3141-基本概念" name="3141-基本概念"></a>
### 3.14.1. 基本概念

<a id="markdown-31411-分类" name="31411-分类"></a>
#### 3.14.1.1. 分类
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
<a id="markdown-31412-索引用途" name="31412-索引用途"></a>
#### 3.14.1.2. 索引用途
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

<a id="markdown-31413-索引的误区" name="31413-索引的误区"></a>
#### 3.14.1.3. 索引的误区
目前，MySQL的服务器可以提供足够大的内存来提供缓存索引相关数据，提高性能，因此有些规范不再适合当前的硬件环境。
* 误区
    * 索引层级不要超过5层
    * 单表的索引数不要超过6个
        * 不要给表的索引数目设置上限，保证性能才是最主要的。
    * 不应该索引不稳定的列
        
    
<a id="markdown-31414-索引数据结构" name="31414-索引数据结构"></a>
#### 3.14.1.4. 索引数据结构
<a href="#menu" style="float:right">目录</a>

<a id="markdown-315-存储引擎" name="315-存储引擎"></a>
## 3.15. 存储引擎
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
    
<a id="markdown-3151-innodb存储引擎" name="3151-innodb存储引擎"></a>
### 3.15.1. InnoDB存储引擎

InnoDB是事务型数据库的首选引擎，支持事务安全表（ACID），支持行锁定和外键，上图也看到了，InnoDB是默认的MySQL引擎。InnoDB主要特性有：
* InnoDB给MySQL提供了具有提交、回滚和崩溃恢复能力的事物安全（ACID兼容）存储引擎。InnoDB锁定在行级并且也在SELECT语句中提供一个类似Oracle的非锁定读。这些功能增加了多用户部署和性能。在SQL查询中，可以自由地将InnoDB类型的表和其他MySQL的表类型混合起来，甚至在同一个查询中也可以混合
* InnoDB是为处理巨大数据量的最大性能设计。它的CPU效率可能是任何其他基于磁盘的关系型数据库引擎锁不能匹敌的
* InnoDB存储引擎完全与MySQL服务器整合，InnoDB存储引擎为在主内存中缓存数据和索引而维持它自己的缓冲池。InnoDB将它的表和索引在一个逻辑表空间中，表空间可以包含数个文件（或原始磁盘文件）。这与MyISAM表不同，比如在MyISAM表中每个表被存放在分离的文件中。InnoDB表可以是任何尺寸，即使在文件尺寸被限制为2GB的操作系统上
* InnoDB支持外键完整性约束，存储表中的数据时，每张表的存储都按主键顺序存放，如果没有显示在表定义时指定主键，InnoDB会为每一行生成一个6字节的ROWID，并以此作为主键
* InnoDB被用在众多需要高性能的大型数据库站点上
InnoDB不创建目录，使用InnoDB时，MySQL将在MySQL数据目录下创建一个名为ibdata1的10MB大小的自动扩展数据文件，以及两个名为ib_logfile0和ib_logfile1的5MB大小的日志文件

<a id="markdown-3152-myisam存储引擎" name="3152-myisam存储引擎"></a>
### 3.15.2. MyISAM存储引擎

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

<a id="markdown-3153-memory存储引擎" name="3153-memory存储引擎"></a>
### 3.15.3. MEMORY存储引擎

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

<a id="markdown-3154-存储引擎的选择" name="3154-存储引擎的选择"></a>
### 3.15.4. 存储引擎的选择

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

<a id="markdown-316-性能优化基本的分析命令" name="316-性能优化基本的分析命令"></a>
## 3.16. 性能优化基本的分析命令
<a href="#menu" style="float:right">目录</a>

<a id="markdown-3161-explain" name="3161-explain"></a>
### 3.16.1. explain
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

<a id="markdown-3162-show-indexs" name="3162-show-indexs"></a>
### 3.16.2. show indexs
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
<a id="markdown-317-分库分表" name="317-分库分表"></a>
## 3.17. 分库分表

<a id="markdown-3171-基本概念" name="3171-基本概念"></a>
### 3.17.1. 基本概念
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

<a id="markdown-3172-分布式事务" name="3172-分布式事务"></a>
### 3.17.2. 分布式事务
<a href="#menu" style="float:right">目录</a>

<a id="markdown-3173-应对多机数据查询" name="3173-应对多机数据查询"></a>
### 3.17.3. 应对多机数据查询
<a href="#menu" style="float:right">目录</a>

<a id="markdown-31731-跨库join" name="31731-跨库join"></a>
#### 3.17.3.1. 跨库Join
* 应用层处理，将单次Join操作分成多次查询
* 数据冗余，将表增加字段，冗余其他表的数据，需要考虑数据一致性问题
* 借助外部系统，比如搜索引擎解决一些跨库问题
<a id="markdown-31732-外键约束" name="31732-外键约束"></a>
#### 3.17.3.2. 外键约束
* 跨库不支持外键约束
* 需要应用层解决跨库数据一致性问题


<a id="markdown-318-高可用" name="318-高可用"></a>
## 3.18. 高可用

<a href="#menu" style="float:right">目录</a>

<a id="markdown-3181-主从复制" name="3181-主从复制"></a>
### 3.18.1. 主从复制
<a id="markdown-31811-常见形式" name="31811-常见形式"></a>
#### 3.18.1.1. 常见形式
* 多主方式 ，主主之间互相复制
* 一主一从
* 一主多从
* 多主一从
* 联级复制，树形结构
<a id="markdown-31812-主从同步复制原理" name="31812-主从同步复制原理"></a>
#### 3.18.1.2. 主从同步复制原理
* 主库将所有的写操作记录在binlog日志中，并生成log dump线程，将binlog日志传给从库的I/O线程
* 从库生成两个线程，一个是I/O线程，另一个是SQL线程
* I/O线程去请求主库的binlog日志，并将binlog日志中的文件写入relay log（中继日志）中
* SQL线程会读取relay loy中的内容，并解析成具体的操作，来实现主从的操作一致，达到最终数据一致的目的
<a id="markdown-31813-主从同步配置" name="31813-主从同步配置"></a>
#### 3.18.1.3. 主从同步配置

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
<a id="markdown-31814-添加更多从服务器" name="31814-添加更多从服务器"></a>
#### 3.18.1.4. 添加更多从服务器
有时候我们希望配置多台从服务器。如果是新建立的主从环境，没有什么数据，那么无论多少从服务器，搭建方式和上面说的没有什么两样。重点是，如果在已经运行了一段时间的主从环境中添加更多的从服务器，那么这台从服务器的配置就有点不一样。原因是：在主从配置的过程中，我们需要对服务器进行锁表操作，也就是说，任何数据都不可以继续写入，且持续的时间有可能会很长，在生产环境下，基本上是不允许的。
也就是说，我们不能在主服务器上下手，相反，我们应该在已经存在的从服务器这边下手。基本过程如下：

* 停止旧slave服务器的MySQL服务
* 把旧的slave服务器上的数据复制到新的从服务器里
* 为新服务器分配唯一的server-id和开启其他选项
* 重启服务器


