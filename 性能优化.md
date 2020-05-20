
<span id="menu"></span>

<!-- TOC -->

- [1. 性能调优](#1-性能调优)
    - [1.1. 性能调优概述](#11-性能调优概述)
        - [1.1.1. 性能分析的两种方法：自顶向下和自底向上](#111-性能分析的两种方法自顶向下和自底向上)
            - [1.1.1.1. 自顶向下](#1111-自顶向下)
            - [1.1.1.2. 自底向上](#1112-自底向上)
    - [1.2. 操作系统性能监控](#12-操作系统性能监控)
        - [1.2.1. 概述](#121-概述)
            - [1.2.1.1. 性能问题](#1211-性能问题)
            - [1.2.1.2. CPU消耗分析](#1212-cpu消耗分析)
            - [1.2.1.3. 文件IO消耗分析](#1213-文件io消耗分析)
            - [程序执行慢的原因](#程序执行慢的原因)
            - [1.2.1.4. 工具选择](#1214-工具选择)
        - [1.2.2. Linux系统监控常用命令](#122-linux系统监控常用命令)
            - [1.2.2.1. 必不可少的基础命令和工真](#1221-必不可少的基础命令和工真)
                - [1.2.2.1.1. grep](#12211-grep)
            - [1.2.2.2. 显示系统总体资源使用情况工具top](#1222-显示系统总体资源使用情况工具top)
            - [1.2.2.3. 监控内存和CPU工具vmstat](#1223-监控内存和cpu工具vmstat)
            - [1.2.2.4. 监控IO工具iostat](#1224-监控io工具iostat)
            - [1.2.2.5. 多功能诊断器pidstat](#1225-多功能诊断器pidstat)
            - [1.2.2.6. 查看网络接口信息的命令ifconfig](#1226-查看网络接口信息的命令ifconfig)
            - [1.2.2.7. 网络流量统计实用工具nicstat](#1227-网络流量统计实用工具nicstat)
            - [1.2.2.8. 查看网络信息和网络监控命令](#1228-查看网络信息和网络监控命令)
                - [1.2.2.8.1. ifconfig](#12281-ifconfig)
                - [1.2.2.8.2. ping](#12282-ping)
                - [1.2.2.8.3. telnet](#12283-telnet)
                - [1.2.2.8.4. mtr](#12284-mtr)
                - [1.2.2.8.5. nslookup](#12285-nslookup)
                - [1.2.2.8.6. sar](#12286-sar)
                - [1.2.2.8.7. netstat](#12287-netstat)
                - [1.2.2.8.8. iptraf](#12288-iptraf)
                - [1.2.2.8.9. tcpdump](#12289-tcpdump)
                - [1.2.2.8.10. nmap](#122810-nmap)
                - [1.2.2.8.11. ethtool](#122811-ethtool)
            - [1.2.2.9. 查看磁盘空间du&df](#1229-查看磁盘空间dudf)
    - [1.3. IDEA安装hsdis查看JIT编译的汇编代码](#13-idea安装hsdis查看jit编译的汇编代码)
    - [1.4. 使用JMH做Benchmark基准测试](#14-使用jmh做benchmark基准测试)
    - [1.5. JVM](#15-jvm)
        - [1.5.1. JRE/JDK/JVM是什么关系](#151-jrejdkjvm是什么关系)
        - [1.5.2. Java 虚拟机](#152-java-虚拟机)
            - [1.5.2.1. Java虚拟机规范](#1521-java虚拟机规范)
        - [1.5.3. HotSpot VM的基本架构](#153-hotspot-vm的基本架构)
        - [1.5.4. Javac编译器和JIT编译器](#154-javac编译器和jit编译器)
            - [1.5.4.1. 解释执行和编译执行](#1541-解释执行和编译执行)
            - [1.5.4.2. 编译过程](#1542-编译过程)
            - [1.5.4.3. Javac编译](#1543-javac编译)
            - [1.5.4.4. JIT编译](#1544-jit编译)
                - [1.5.4.4.1. 概述](#15441-概述)
                - [1.5.4.4.2. 客户端版或服务器版](#15442-客户端版或服务器版)
            - [1.5.4.5. Java 与 C/C++ 的编译器对比](#1545-java-与-cc-的编译器对比)
                - [1.5.4.5.1. Java 编译器“劣势”的原因](#15451-java-编译器劣势的原因)
                - [1.5.4.5.2. Java 编译器的“优势”](#15452-java-编译器的优势)
                - [1.5.4.5.3. 总结](#15453-总结)
        - [1.5.5. JVM内存模型](#155-jvm内存模型)
            - [1.5.5.1. JVM的内存空间](#1551-jvm的内存空间)
            - [1.5.5.2. HotSpot 虚拟机的对象头](#1552-hotspot-虚拟机的对象头)
            - [1.5.5.3. 对象访问定位](#1553-对象访问定位)
            - [1.5.5.4. 内存泄漏和内存溢出](#1554-内存泄漏和内存溢出)
        - [1.5.6. 垃圾回收算法](#156-垃圾回收算法)
            - [1.5.6.1. 对象回收判定](#1561-对象回收判定)
            - [1.5.6.2. Minor GC和Major GC](#1562-minor-gc和major-gc)
            - [1.5.6.3. 对象引用分类](#1563-对象引用分类)
            - [1.5.6.4. 标记清除算法](#1564-标记清除算法)
            - [1.5.6.5. 复制算法](#1565-复制算法)
            - [1.5.6.6. 标记整理算法](#1566-标记整理算法)
            - [1.5.6.7. 分代收集算法](#1567-分代收集算法)
        - [1.5.7. 垃圾收集器](#157-垃圾收集器)
            - [1.5.7.1. 基本概念](#1571-基本概念)
            - [1.5.7.2. 垃圾收集器评价指标](#1572-垃圾收集器评价指标)
            - [1.5.7.3. 并行垃圾收集器&串行垃圾收集器&并发垃圾收集器](#1573-并行垃圾收集器串行垃圾收集器并发垃圾收集器)
                - [1.5.7.3.1. 串行垃圾收集器](#15731-串行垃圾收集器)
                - [1.5.7.3.2. 并行垃圾收集器](#15732-并行垃圾收集器)
                - [1.5.7.3.3. 并发标记清除垃圾收集器CMS](#15733-并发标记清除垃圾收集器cms)
                - [1.5.7.3.4. 收集器概括总结](#15734-收集器概括总结)
            - [1.5.7.4. Serial收集器](#1574-serial收集器)
            - [1.5.7.5. ParNew收集器](#1575-parnew收集器)
            - [1.5.7.6. Parallel Scavenge收集器](#1576-parallel-scavenge收集器)
            - [1.5.7.7. Serial Old收集器](#1577-serial-old收集器)
            - [1.5.7.8. Parallel Old收集器](#1578-parallel-old收集器)
            - [1.5.7.9. CMS收集器](#1579-cms收集器)
        - [1.5.8. G1收集器](#158-g1收集器)
            - [1.5.8.1. 综述](#1581-综述)
            - [1.5.8.2. 完整的G1垃圾收集日志](#1582-完整的g1垃圾收集日志)
            - [1.5.8.3. G1相关参数](#1583-g1相关参数)
        - [1.5.9. 深入G1垃圾收集器](#159-深入g1垃圾收集器)
            - [1.5.9.1. 背景](#1591-背景)
            - [1.5.9.2. G1中的垃圾收集](#1592-g1中的垃圾收集)
            - [1.5.9.3. 年轻代](#1593-年轻代)
            - [1.5.9.4. 年轻代收集暂停](#1594-年轻代收集暂停)
            - [1.5.9.5. 对象老化以及老年代](#1595-对象老化以及老年代)
            - [1.5.9.6. 巨型区分](#1596-巨型区分)
            - [1.5.9.7. 混合收集](#1597-混合收集)
            - [1.5.9.8. 收集集合及其重要性](#1598-收集集合及其重要性)
            - [1.5.9.9. 并发优化线程以及栅栏](#1599-并发优化线程以及栅栏)
            - [1.5.9.10. G1 GC的并发标记](#15910-g1-gc的并发标记)
            - [1.5.9.11. 并发标记阶段](#15911-并发标记阶段)
            - [1.5.9.12. 初始标记](#15912-初始标记)
            - [1.5.9.13. 根分区扫描](#15913-根分区扫描)
            - [1.5.9.14. 并发标记](#15914-并发标记)
            - [1.5.9.15. 重新标记](#15915-重新标记)
            - [1.5.9.16. 清除](#15916-清除)
            - [1.5.9.17. 转移失败与FULL收集](#15917-转移失败与full收集)
        - [1.5.10. G1性能优化](#1510-g1性能优化)
            - [1.5.10.1. 年轻代收集的各阶段](#15101-年轻代收集的各阶段)
            - [1.5.10.2. 所有并行活动的开始](#15102-所有并行活动的开始)
            - [1.5.10.3. 外部根分区](#15103-外部根分区)
            - [1.5.10.4. 已记忆集合总结](#15104-已记忆集合总结)
            - [1.5.10.5. 转移和回收](#15105-转移和回收)
            - [1.5.10.6. 终止](#15106-终止)
            - [1.5.10.7. GC外部的并行活动](#15107-gc外部的并行活动)
            - [1.5.10.8. 所有并行活动总结](#15108-所有并行活动总结)
            - [1.5.10.9. 其他串行活动](#15109-其他串行活动)
            - [1.5.10.10. 年轻代优化](#151010-年轻代优化)
            - [1.5.10.11. 并发标记阶段调优](#151011-并发标记阶段调优)
            - [1.5.10.12. 混合垃圾收集阶段回顾](#151012-混合垃圾收集阶段回顾)
            - [1.5.10.13. 混合垃圾收集阶段调优](#151013-混合垃圾收集阶段调优)
            - [1.5.10.14. 避免转移失败](#151014-避免转移失败)
            - [1.5.10.15. 引用处理](#151015-引用处理)
            - [1.5.10.16. 观察引用处理](#151016-观察引用处理)
            - [1.5.10.17. 引用处理调优](#151017-引用处理调优)
        - [1.5.11. GC模式](#1511-gc模式)
        - [1.5.12. 内存分配和回收策略](#1512-内存分配和回收策略)
        - [1.5.13. JVM相关参数介绍](#1513-jvm相关参数介绍)
        - [1.5.14. 调优总结](#1514-调优总结)
        - [1.5.15. 性能监控与故障处理工具](#1515-性能监控与故障处理工具)
            - [1.5.15.1. JDK命令行工具](#15151-jdk命令行工具)
                - [1.5.15.1.1. javap](#151511-javap)
                - [1.5.15.1.2. 查看Java进程 jps](#151512-查看java进程-jps)
                - [1.5.15.1.3. 查看虚拟机运行时些信息jstat](#151513-查看虚拟机运行时些信息jstat)
                - [1.5.15.1.4. 查看虚拟机参数jinfo](#151514-查看虚拟机参数jinfo)
                - [1.5.15.1.5. 导出堆到文件jmap](#151515-导出堆到文件jmap)
                - [1.5.15.1.6. 虚拟机堆转储快照分析工具jhat](#151516-虚拟机堆转储快照分析工具jhat)
                - [1.5.15.1.7. 查看线程堆栈jstack](#151517-查看线程堆栈jstack)
                - [1.5.15.1.8. jcmd](#151518-jcmd)
            - [1.5.15.2. Jdk可视化工具](#15152-jdk可视化工具)
            - [1.5.15.3. 重要的垃圾收集数据](#15153-重要的垃圾收集数据)
        - [1.5.16. JVM性能调优案例](#1516-jvm性能调优案例)
            - [1.5.16.1. 常用参数](#15161-常用参数)
            - [1.5.16.2. 调整堆的大小](#15162-调整堆的大小)
            - [1.5.16.3. 代空间调整](#15163-代空间调整)
            - [1.5.16.4. 永久代和元空空间](#15164-永久代和元空空间)
            - [1.5.16.5. 控制并发](#15165-控制并发)
            - [1.5.16.6. 自适应调整](#15166-自适应调整)
            - [1.5.16.7. 将新对象预留在新生代](#15167-将新对象预留在新生代)
            - [1.5.16.8. 大对象进入老年代](#15168-大对象进入老年代)
            - [1.5.16.9. 设置对象进入老年代的年龄](#15169-设置对象进入老年代的年龄)
            - [1.5.16.10. 稳定与震荡的堆大小](#151610-稳定与震荡的堆大小)
            - [1.5.16.11. 吞吐量优先案例](#151611-吞吐量优先案例)
            - [1.5.16.12. 使用大页案例](#151612-使用大页案例)
            - [1.5.16.13. 降低停顿案例](#151613-降低停顿案例)
            - [1.5.16.14. 堆快照（堆Dump）](#151614-堆快照堆dump)
            - [1.5.16.15. 控制GC](#151615-控制gc)
        - [1.5.17. 类文件结构](#1517-类文件结构)
            - [1.5.17.1. 模数和Class文件的版本](#15171-模数和class文件的版本)
            - [1.5.17.2. 常量池](#15172-常量池)
            - [1.5.17.3. 访问标志](#15173-访问标志)
            - [1.5.17.4. 类索引，父类索引与接口集合](#15174-类索引父类索引与接口集合)
            - [1.5.17.5. 字段表集合](#15175-字段表集合)
            - [1.5.17.6. 方法表集合](#15176-方法表集合)
            - [1.5.17.7. 属性表集合](#15177-属性表集合)
        - [1.5.18. 类加载过程](#1518-类加载过程)
            - [1.5.18.1. 类装载流程](#15181-类装载流程)
                - [1.5.18.1.1. 类加载条件](#151811-类加载条件)
                - [1.5.18.1.2. 加载类](#151812-加载类)
                - [1.5.18.1.3. 连接](#151813-连接)
                    - [1.5.18.1.3.1. 验证类](#1518131-验证类)
                    - [1.5.18.1.3.2. 准备](#1518132-准备)
                    - [1.5.18.1.3.3. 解析](#1518133-解析)
                - [1.5.18.1.4. 初始化](#151814-初始化)
        - [1.5.19. 类加载器](#1519-类加载器)
            - [1.5.19.1. 基本概念](#15191-基本概念)
            - [1.5.19.2. 常见的类加载器](#15192-常见的类加载器)
            - [1.5.19.3. 类加载过程](#15193-类加载过程)
            - [1.5.19.4. ClassLoader的重要方法](#15194-classloader的重要方法)
            - [1.5.19.5. 全盘负责与双亲委托机制](#15195-全盘负责与双亲委托机制)
            - [1.5.19.6. 双亲委托机制的弊端](#15196-双亲委托机制的弊端)
            - [1.5.19.7. 双亲委托模式的补充](#15197-双亲委托模式的补充)
            - [1.5.19.8. 突破双亲模式](#15198-突破双亲模式)
            - [1.5.19.9. 定义自已的ClassLoader](#15199-定义自已的classloader)
            - [1.5.19.10. 实现类的热部署](#151910-实现类的热部署)
            - [1.5.19.11. 常见加载类错误](#151911-常见加载类错误)
            - [1.5.19.12. 线程上下文类加载器](#151912-线程上下文类加载器)
            - [1.5.19.13. 类加载器与Web容器](#151913-类加载器与web容器)
            - [1.5.19.14. 常见问题分析](#151914-常见问题分析)
        - [1.5.20. 字节码执行](#1520-字节码执行)
            - [1.5.20.1. 查看类文件的字节码工具javap](#15201-查看类文件的字节码工具javap)
            - [1.5.20.2. 虚拟机常用指令](#15202-虚拟机常用指令)
            - [1.5.20.3. 常见的字节码操作工具](#15203-常见的字节码操作工具)
            - [1.5.20.4. ASM字节码操作工具](#15204-asm字节码操作工具)
                - [1.5.20.4.1. 什么是ASM](#152041-什么是asm)
                - [1.5.20.4.2. ASM框架中的核心类](#152042-asm框架中的核心类)
                - [1.5.20.4.3. 为什么选择 ASM](#152043-为什么选择-asm)
                - [1.5.20.4.4. ASM编程框架](#152044-asm编程框架)
                - [1.5.20.4.5. AOP 底层技术比较](#152045-aop-底层技术比较)
                - [1.5.20.4.6. 例子](#152046-例子)
                    - [1.5.20.4.6.1. 使用ASM实现方法耗时计算的AOP功能](#1520461-使用asm实现方法耗时计算的aop功能)
                - [1.5.20.4.7. 建议](#152047-建议)
        - [1.5.21. Java内存模型和线程](#1521-java内存模型和线程)
            - [1.5.21.1. 硬件效率与一致性](#15211-硬件效率与一致性)
            - [1.5.21.2. Java内存模型](#15212-java内存模型)
                - [1.5.21.2.1. 主内存和工作内存](#152121-主内存和工作内存)
                - [1.5.21.2.2. 内存间交互操作](#152122-内存间交互操作)
                - [1.5.21.2.3. 对于volatile型变量的特殊规则](#152123-对于volatile型变量的特殊规则)
                - [1.5.21.2.4. 对于long和double的特殊规则](#152124-对于long和double的特殊规则)
                - [1.5.21.2.5. 原子性，可见性，有序性](#152125-原子性可见性有序性)
                - [1.5.21.2.6. 先行发生原则](#152126-先行发生原则)
            - [1.5.21.3. Java与线程](#15213-java与线程)
                - [1.5.21.3.1. 线程的实现](#152131-线程的实现)
                - [1.5.21.3.2. 线程调度](#152132-线程调度)
                - [1.5.21.3.3. 状态转换](#152133-状态转换)

<!-- /TOC -->
# 1. 性能调优
<a href="#menu" style="float:right">目录</a>

## 1.1. 性能调优概述

### 1.1.1. 性能分析的两种方法：自顶向下和自底向上
<a href="#menu" style="float:right">目录</a>

自顶向下和自底向上是两种常用的性能分析方法。
自顶向下（Top Down）着眼于应用顶层，从上往下寻找软件栈中的优化机会和问题。
自底向上（Bottom Up）则从软件栈最底层的CPU统计数据（例如CPU缓存未命中率、CPU指令效率）开始，逐渐上升到应用自身的结构或该应用常见的使用方式。
应用开发人员常常使用自顶向下的方法，而性能问题专家则通常采用自底向上的方法，用以辨别因不同硬件架构、操作系统或不同的Java虚拟机实现所导致的性能差异。如你所想，不同方法可以用来查找不同类型的性能问题。

#### 1.1.1.1. 自顶向下
<a href="#menu" style="float:right">目录</a>

自顶向下是最常用的性能调优方法。如果调优涉及软件栈顶层应用代码的更改，也常用这招。
自顶向下时，你通常会从干系人发现性能问题的负载开始监控应用。应用的配置变化或日常负荷变化都可能导致性能降低，所以需要持续监控应用。此外，一旦应用的性能和扩展性需求发生变化，应用就可能无法满足新要求，所以也要监控应用程序的性能。
不管何种原因引起的性能调优，自顶向下的第一步总是对运行在特定负载之下的应用进行监控。监控的范围包括操作系统、Java虚拟机、Java EE容器以及应用的性能测量统计指标。基于监控信息所给出的提示再开展下一步工作，例如JVM垃圾收集器调优、JVM命令行选项调优、操作系统调优，或者应用程序性能分析。性能分析可能导致应用程序的更改，或者发现第三方库或Java SE类库在实现上的不足。

#### 1.1.1.2. 自底向上
<a href="#menu" style="float:right">目录</a>

在不同平台（指底层的CPU架构或CPU数量不同）上进行应用性能调优时，性能专家常使用自底向上的方法。将应用迁移到其他操作系统上时，也常用这种方法改善性能。在无法更改应用源代码，例如应用已经部署在生产环境中，或者系统供应商为了在竞争中占得先机而必须将性能发挥到极致时，也常常会使用这种方法。

自底向上需要收集和监控最底层CPU的性能统计数据。监控的CPU统计数据包括执行特定任务所需要的CPU指令数（通常称为路径长度，Path Length），以及应用在一定负载下运行时的CPU高速缓存未命中率。虽然还有其他重要的CPU统计数据，但这两项是自底向上中最常用的。在一定负载下，应用执行和扩展所需的CPU指令越少，运行得就越快。降低CPU高速缓存未命中率也能改善应用的性能，因为CPU高速缓存未命中会导致CPU为了等待从内存获取数据而浪费若干个周期，而降低CPU高速缓存未命中率，意味着CPU可以减少等待内存数据的时间，应用也就能运行得更快。

自底向上关注的通常是在不更改应用的前提下，改善CPU使用率。假如应用可以更改，自底向上也能为如何修改应用提供建议。这些更改包括应用源代码的变动，如将经常使用的数据移到一起，使得只要访问一条CPU高速缓存行（CPU Cache Line）就能获取所有这些数据，而不用从内存获取数据。这个改动可以降低CPU高速缓存未命中率，从而减少CPU等待内存数据的时间。

现代Java虚拟机集成了成熟的JIT编译器，可以在Java应用的执行过程中进行优化，比如依据应用的内存访问模式或应用特定的代码路径，生成更有效的机器码。也可以调整操作系统的设置来改善性能，例如更改CPU调度算法，或者修改操作系统的等待时间（操作系统在将应用执行线程迁移到其他CPU硬件线程之前所花费的时间）。

如果你觉得可以用自底向上的方法，那应该先从收集操作系统和JVM的统计数据开始。监控这些统计数据可以为下一步应该关注哪些重点提供线索。依据这些数据，你再判断对应用和JVM进行性能分析是否有意义。应用和JVM的性能分析可以借助于工具。Oracle Solaris SPARC、Oracle Solaris x86/x64及Linux x86/x64上可以用Oracle Solaris Studio Performance Analyzer进行性能分析。其他流行的工具如Intel VTune或AMD的CodeAnalyst Performance Analyzer在Windows和Linux上也可以提供类似的信息。这3种工具都可以收集特定的CPU计数器信息，例如Java虚拟机执行特定Java方法或功能所用的CPU指令数和CPU高速缓存未命中率。如何在自底向上中使用这些性能分析工具非常重要。

## 1.2. 操作系统性能监控
<a href="#menu" style="float:right">目录</a>

### 1.2.1. 概述
<a href="#menu" style="float:right">目录</a>

改善性能涉及3种不同的活动：性能监控、性能分析以及性能调优。
* **性能监控**是一种以非侵入式方式收集或查看应用运行性能数据的活动。监控通常是指一种在生产、质量评估或者开发环境中实施的带有预防或主动性的活动。当应用的干系人报出性能问题却没有足以定位根本原因的线索时，首先会进行性能监控，随后是性能分析。
* **性能分析**是一种以侵入式方式收集运行性能数据的活动，它会影响应用的吞吐量或响应性。性能分析是对性能监控或是对干系人所报问题的回应，关注的范围通常比性能监控更集中。性能分析很少在生产环境中进行，通常是在质量评估、测试或开发环境中，常常是性能监控之后的行动。
* **性能调优**是一种为改善应用响应性或吞吐量而更改参数、源代码、或属性配置的活动。性能调优通常是在性能监控或性能分析之后进行。

#### 1.2.1.1. 性能问题

通常我们所说的性能问题，不外乎就是CPU/Memory/IO/Network这四个方面，这四个方面每个都有各自独特之处，同时也都是相互关联的。

**CPU**

关于CPU，有下面一些经验可供参考：
* Run Queue: 每个run queue最好不要超过3个threads在等待，转换到load, 就是load的值最好不要超过3倍的cpu核数，1倍核数是比较理想的状态，2-3倍是比较饱和的状态，再高就会影响系统正常运行了。
* CPU Utilization: 推荐的比例是 us 60-70%, sy 30-35%, id 0-5%, 简单可以记us:sy=70:30, 这个是比较合适的比例，如果sy超过30，就会影响系统的正常运行
* Context Switch: 上下文切换跟cpu利用率是直接相关的，如果cpu利用率符合上面说的比例，那么比较高的context switch是可以接受的

**Memory**

1. Memory Pages: Linux系统中内存是以页(Page)为基本来存取的，默认的页大小是4096Bytes, Linux下内存页可以分为下面几种类型:
* Unreclaimable – locked, kernel, reserved pages
* Swappable – anonymous memory pages
* Syncable – pages backed by a disk file
* Discardable – static pages, discarded pages

2. kswapd: kswapd是用来保证系统有足够多的free memory的Linux daemon。它监控了内核的pages_high和pages_low这两个值，如果free memory的值低于pages_low, 它就会开始扫描内存并尝试free一些内存页，每次32个页，它会重复这个过程，一直到free memory的值达到pages_high这个值。kswapd在free内存页时，主要有下面几种情况：
* 如果内存页没有被修改，它会直接放到free list
* 如果内存页被修改了，而且该内存页是Syncable的，把该内存页的内容写回磁盘，然后把该内存页放到free list
* 如果内存页被修改了，页且该内存页是Swappable(Anonymous)的，把该内存页写入到swap device, 然后把该内存页放到free list

3. pdflush: pdflush是用来把内存页同步到对应的磁盘文件的Linux daemon. 比如说，一个文件在内存中被修改了，那么pdflush会把它写到磁盘上。当内存页中有10%的dirty页的话，pdflush就开始向文件系统同步这些dirty页。这个阈值可以通过vm.dirty_background_ratio这个内核参数来配置，缺省是10%.

关于memory, 有下面一些经验之谈:
* 比较低的free memory大小，表明系统有效地使用了内存；除非是在大量、持续的写swap device
* 如果系统在持续读、写swap device, 表明系统内存不够了

**IO**

1. Page fault: 当应用程序要访问的数据不在正在使用的memory中的时候，就会发生page fault, 具体有下面两种类型的page faults:
* Minor(MnPF): 数据在物理内存中，但在Fault发生的时候，还没在MMU(Memory Management Unit)登记，此时发生的Fault为Minor Page Fault.
* Major(MPF): 数据不在物理内存中，需要从磁盘加载，此时发生的Fault为Major Page Fault.

2. File Buffer Cache: 它是系统发生IO时，系统与磁盘之间的Cache, 主要目的就是最大化MnPF, 最小化MPF。前文中vmstat/top的截图中，buff对应的就是它的大小。

3. Page Type: 前文中从回收的角度对memory page进行了分类，从IO的角度可以分为下面几类:
* Read Pages:系统从磁盘加载的只读的Page, 这些Page会一直在内存中驻留，一直到系统内存紧张，内核才会将这些Page加入到free list,另做它用
* Dirty Pages:系统从磁盘加载的Page, 并且做了修改。这些Page会被pdflush同步到磁盘。当系统内存紧张时，kswapd会将这些Page写入到磁盘
* Anonymous Pages: 不属于某个进程的Page, 不能同步到磁盘。当系统内存紧张时，kswapd会将其swap到swap device, 以此来释放内存

4. 磁盘IOPS计算：
IOPS = 1000 / {((1 / (RPM / 60)) * 1000 / 2)[rotation] + 3[seek] + 2[latency]}

解释一下上面的公式:
* rotation: 磁盘旋转时间，1/(RPM/60)是每转一圈所用的秒，*1000是转化为毫秒，/2是平均情况下，需要转半圈
* seek: 寻道时间，3ms
* latency: 数据传输时间，2ms
* 最后用1000/(rotation + seek + latency)就是磁盘的IOPS，正常用的10000RPM的磁盘，算下来约是125 IOPS

关于IO，有下面一些经验之谈:
* iowait正常情况下应该是0，如果持续非0的话，就说明对应的io设备overloaded了
* 根据你的磁盘转数，计算它所能承受的IOPS，以此来判断当前的iops是否正常
* 顺序读和随机读有一定的差异，这个也是要考虑的因素
* 如果要监控磁盘的话，可以考虑监控持续一段时间的iowait和svctm, 如果这两个值持续比较大的话，对应的磁盘设备很大可能有问题
* 监控swap和file system分区，确认虚拟内存和fs IO之间没有竞争

**Network**

带宽: 当下比较常用的带宽用100Mbps, 1000Mbps, 10000Mbps，分别对应于我们平时提的百兆网、千兆网和万兆网。通常，我们在说带宽的时候，单位用的是bit, 但是在实际应用的时候，我们用的单位大多是Byte, 因此，上述三种网对应的Byte带宽分别约是12.5MBps, 125MBps, 1250MBps

#### 1.2.1.2. CPU消耗分析

在Ｌinux中，CPU主要用于中断，内核以及用户进程的任务处理，优先级为中断>内核>用户进程．

1. 内核调度的优先级：在Linux系统中，内核scheduler调度资源包括两种：threads(Process是由threads组成)和interrupt，这些被调度的资源是有特定的优先级的，以下从高到底：
* Interrupts: Interrupt被设备用来通知内核相关的事件，优先级是最高的
* Kernel(System) Processes：所有的系统进程都是以仅次于Interrupt的优先级被调度的
* User Processes: 所有的应用程序都是run在用户态空间，以最低的优先级被内核调度
 
2. 上下文切换(Context Switch): 线程在运行过程中，CPU时间片用完，或者是被更高优先级的的资源抢占了CPU，该线程都会被放到一个等待队列，等待下一次被调度，这样的一次过程称为一次上下文切换。另外，在用户程序调用系统调用(System call)的时候，也会发生上下文切换(这个也有叫Mode Switch的, 确实跟前面两种情况有所区别)。

3. 运行队列(Run Queue)和负载(Load):
* Run Queue: 在Linux系统中，每个CPU维护着一个run queue, 里面放着等待被执行的threads, run queue越大，在里面的线程等的时间越长
* Load: Linux系统提供了1/5/15分钱的load, load是的值指的是当前running的threads数加上run queue中等待被执行的threads数

4. CPU利用率(Utilization):
* User Time(us): CPU在用户空间运行线程所花的时间的百分比
* System Time(sy): CPU执行内核线程和中断(interrupt)所花的时间的百分比
* Wait IO(wa): 所有进程因为等待IO完成而被阻塞，导致CPU idle所花的时间的百分比
* Idle(id): CPU完全idle的时间的百分比

**评价参数**

* CPU utilization：最直观最重要的就是CPU的使用率。如果长期超过80%，则表明CPU遇到了瓶颈；
* User time: 用户进程使用的CPU；该数值越高越好，表明越多的CPU用在了用户实际的工作上；
* System time: 内核使用的CPU，包括了硬中断、软中断使用的CPU；该数值越低越好，太高表明在网络和驱动层遇到瓶颈；
* Waiting: CPU花在等待IO操作上的时间；该数值很高，表明IO子系统遇到瓶颈；
* Idel time: CPU空闲的时间；
* Load average: 在特定时间间隔内运行队列中(在CPU上运行或者等待运行多少进程)的平均进程数；在Linux中，进程分为三种状态:一种是阻塞的进程blocked process，一种是可运行的进程runnableprocess，另外就是正在运行的进程runningprocess。当进程阻塞时，进程会等待I/O设备的数据或者系统调用。进程可运行状态时，它处在一个运行队列run queue中，与其他可运行进程争夺CPU时间。 系统的load是指正在运行running one和准备好运行runnableone的进程的总数。比如现在系统有2个正在运行的进程，3个可运行进程，那么系统的load就是5，load average就是一定时间内的load数量均值；
* Context Switch: 上下文切换。

#### 1.2.1.3. 文件IO消耗分析

Ｌinux在操作文件时，将数据放入文件缓冲区，直到内存不够或者系统要释放内存给用户进程使用，因此在查看Linux内存状况时经常会发现可用的(free)的物理内存不多，但是cached用了很多，这是Ｌinux提升文件io的一种方式．如果物理空闲内存够用，只有在写文件和第一次读取文件时会产生真正的文件io．


#### 程序执行慢的原因

* 锁竞争激烈
* 未充分使用硬件资源
* 数据量的增长



#### 1.2.1.4. 工具选择
* cpu消耗分析
    * top
    * pidstat
* 文件io消耗分析
    * pidstat
    * iostat
* 网络io消耗分析
    * sar
* 内存消耗分析
    * vmstat
    * sar
    * top
    * pidstat 

### 1.2.2. Linux系统监控常用命令

<a href="#menu" style="float:right">目录</a>



#### 1.2.2.1. 必不可少的基础命令和工真

##### 1.2.2.1.1. grep



#### 1.2.2.2. 显示系统总体资源使用情况工具top

```
lgj@lgj-Lenovo-G470:~$ top

top - 15:42:15 up 1 day,  5:26,  1 user,  load average: 1.05, 0.85, 0.88
Tasks: 287 total,   1 running, 237 sleeping,   0 stopped,   0 zombie
%Cpu(s):  4.8 us,  1.4 sy,  0.0 ni, 93.7 id,  0.0 wa,  0.0 hi,  0.2 si,  0.0 st
KiB Mem : 10174540 total,   465444 free,  6383888 used,  3325208 buff/cache
KiB Swap:  2097148 total,  2097148 free,        0 used.  3206432 avail Mem 

  PID USER      PR  NI    VIRT    RES    SHR S  %CPU %MEM     TIME+ COMMAND                                                         2003 lgj       20   0 3518024 236512  77784 S  10.9  2.3  19:57.87 gnome-shell                                                    1762 lgj       20   0  629204 153588 104216 S  10.6  1.5  20:23.80 Xorg                                                           8520 lgj       20   0  670000  44544  31016 S   5.0  0.4   0:11.43 gnome-terminal-                                                3829 lgj       20   0 1628536 148496  96356 S   3.0  1.5  14:15.51 code                                                           1063 root      20   0    4552    760    696 S   1.0  0.0   1:13.36 acpid                                                          15936 lgj       20   0 2674372 284760  88684 S   1.0  2.8  11:35.65 FoxitReader 
```
**第一行：**
```
top - 15:42:15 up 1 day,  5:26,  1 user,  load average: 1.05, 0.85, 0.88
```
分别表示的是：当前系统时间；up 1 day表示已经系统已经运行1天； 1 users：表示系统中有1个登录用户；load average: 分别表示最近 1 分钟， 5 分钟， 15分钟 CPU的负载的平均值。

这一行最重要的就是 load average。

**第二行：**
```
Tasks: 287 total,   1 running, 237 sleeping,   0 stopped,   0 zombie
```
分别表示系统中的进程数：总共287个进程， 1个在运行，237个在sleep，0个stopped, 0个僵尸。

**第三行：**
```
%Cpu(s):  4.8 us,  1.4 sy,  0.0 ni, 93.7 id,  0.0 wa,  0.0 hi,  0.2 si,  0.0 st
```
这一行提供了关于CPU使用率的最重要的信息，分别表示 users time, system time, nice time, idle time, wait time, hard interrupte time, soft interrupted time, steal time; 其中最终要的是：users time, system time, wait time ,idle time 等等。nice time 表示用于调准进程nice level所花的时间。

* us:用户进程处理所占的百分比
* sy:内核线程处理所占的百分比
* ni:被nice命令改变优先级的任务所占的百分比
* id:cpu的空闲时间所占的百分比
* wa:执行过程中等待IO所占的百分比
* hi:硬件中断所占的百分比
* si:软件中断所占的百分比

对于计算机是多核cpu，上面显示的是多个cpu所占百分比的总和，因此会出现超过100%的情况．

要想看到每个cpu的情况，按"1"即可
```
%Cpu0  :  5.2 us,  6.8 sy,  0.0 ni, 80.6 id,  7.4 wa,  0.0 hi,  0.0 si,  0.0 st
%Cpu1  :  6.3 us,  5.7 sy,  0.0 ni, 88.1 id,  0.0 wa,  0.0 hi,  0.0 si,  0.0 st
%Cpu2  :  7.0 us,  5.4 sy,  0.0 ni, 87.6 id,  0.0 wa,  0.0 hi,  0.0 si,  0.0 st
%Cpu3  :  4.9 us,  3.6 sy,  0.0 ni, 91.5 id,  0.0 wa,  0.0 hi,  0.0 si,  0.0 st

```
**第四行：**

```
KiB Mem : 10174540 total,   465444 free,  6383888 used,  3325208 buff/cache
```
提供的是关于内存的信息，因为Linux会尽量的来使用内存来进行缓存，所以这些信息没有多大的价值，free数值小，并不代表存在内存瓶颈。

**第五行：**
```
KiB Swap:  2097148 total,  2097148 free,        0 used.  3206432 avail Mem 
```
提供的是关于swap分区的使用情况，这些信息也没有太大的价值，因为Linux的使用内存的机制决定的。used值很大并不代表存在内存瓶颈。

剩下是关于每个进程使用的资源的情况，进程的各种信息，按照使用CPU的多少排序，每个字段的含义如下：
* PID: 表示进程ID；
* USER: 表示运行进程的用户；
* PR：表示进程优先级；
* NI：表示进程nice值，默认为0；
* VIRT：The  total  amount  of  virtual  memory  used by the task.进程占用的虚拟内存大小，包括了swap out的内存page。
* RES: Resident size (kb).The non-swapped physical memory a task is using. 进程使用的常驻内存大小，没有包括swap out的内存。
* SHR：Shared Mem size (kb).The amount of shared memory used by a task.  It simply reflects memory that could be potentially shared with other processes. 其实应该就是使用 shmget() 系统调用分配的共享内存，可以在多个进程之间共享访问。
* S: 表示进程处于哪种状态：R: Running; S: sleeping; T: stoped; D: interrupted; Z:zomobie;
* %CPU: 进程占用的CPU；
* %MEM：进程占用的内存；
* %TIME+: 进程运行时间；
* COMMAND: 进程运行命令；

上面的 top 命令默认是以 进程为单位来显示的，我们也可以以线程为单位来显示： top -H,也可以在显示时按下＂shift+h＂进行切换，切换后则为线程pid．

如果仅仅想查看 CPU 的 load average，使用uptime命令就行了：
```
lgj@lgj-Lenovo-G470:~$ uptime
 15:48:51 up 1 day,  5:32,  1 user,  load average: 0.70, 0.89, 0.90
```

当cpu消耗严重时，主要体现在us,sy,wa,或hi的变高，wa值是io等待造成的，hi值变高主要为硬件中断造成的，例如网卡接收数据频繁的情况．

对于java应用，cpu消耗严重主要体现在us,sy值上．

**us**

当us值过高时，表示运行的应用消耗了大部分的cpu。在这种情况下，对于java应用而言，最重要的是找到具体消耗cpu的线程所执行的代码，可以采用如下方法。
* 首先通过linux命令top命令查看us过高的pid值
* 通过top -Hp pid查看该pid进程下的线程的cpu消耗状况，得到具体pid值
* 将pid值转化为16进制，这个转化后的值对应nid值的线程
* 通过jstack pid | grep -C 20 “16进制的值” 命令查看运行程序的线程信息


该线程就是消耗cpu的线程，在采样时须多执行几次上述的过程，以确保找到真实的消耗cpu的线程。

java应用造成us过高的原因主要是线程一直处于可运行的状态Runnable，通常是这些线程在执行无阻塞、循环、正则或纯粹的计算等动作造成。 另外一个可能会造成us过高的原因是频繁的gc。如每次请求都需要分配较多内存，当访问量高时就导致不断的进行gc，系统响应速度下降， 进而造成堆积的请求更多，消耗的内存严重不足，最严重的时候会导致系统不断进行FullGC，对于频繁的gc需要通过分析jvm内存的消耗来查找原因。

```java
//代码,线程代码为空循环，将会产生很大的cpu消耗
public class SimpleThread {

    public static void main(String args[]){
        MyThread thread  = new MyThread("test thread");
        thread.start();
    }
}
class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        while(true){   }
    }
}

//查询进程pid为19184
lgj@lgj-Lenovo-G470:~$ jps
19184 SimpleThread
19495 Jps
18873 RemoteMavenServer
16894 Main

//查询进程中线程的信息，可以看到其消耗cpu最高的为19204，其16进制为0x4b04
lgj@lgj-Lenovo-G470:~$ top -Hp 19184

top - 17:25:06 up 16:48,  1 user,  load average: 2.45, 2.33, 2.07
Threads:  18 total,   1 running,  17 sleeping,   0 stopped,   0 zombie
%Cpu(s):  4.5 us,  1.1 sy,  0.0 ni, 93.8 id,  0.6 wa,  0.0 hi,  0.1 si,  0.0 st
KiB Mem : 10174540 total,   198812 free,  7171736 used,  2803992 buff/cache
KiB Swap:  2097148 total,  2095856 free,     1292 used.  2075680 avail Mem 

PID USER      PR  NI    VIRT    RES    SHR S %CPU %MEM     TIME+ COMMAND                                                                                                                                  
19204 lgj       20   0 5182764  30664  17324 R 93.3  0.3   8:18.17 java                                                                                                                                     
19184 lgj       20   0 5182764  30664  17324 S  0.0  0.3   0:00.00 java  

//查询该线程的运行信息
lgj@lgj-Lenovo-G470:~$ jstack 19184 | grep -A 5 'nid=0x4b04'
"test thread" #10 prio=5 os_prio=0 tid=0x00007f37ec2c5000 nid=0x4b04 runnable [0x00007f37d928c000]
   java.lang.Thread.State: RUNNABLE
	at com.code.base.thread.MyThread.run(SimpleThread.java:24)
```
从上面可以看出，主要是SimpleThread.java的MyThread线程消耗了cpu，但是不能确定消耗cpu的是哪行的代码，需要根据实际代码进行分析．

**sy**

当sy值过高时，表示linux花费了更多的时间在进行线程切换。java应用造成这种现象的主要原因是启动的线程比较多， 且这些线程多处于不断的阻塞（例如锁等待，io等待）和执行状态的变化过程中，这就导致了操作系统要不断的切换执行的线程， 产生大量的上下文切换。在这种情况下，对java应用而言，最重要的是找出不断切换状态的原因， 可采用的方法为通过kill -3 pid 或jstack -l pid的方法dump出java应用程序的线程信息，查看线程的状态信息以及锁信息， 找出等待状态或锁竞争过多的线程。

```
lgj@lgj-Lenovo-G470:~$ jstack -l 16894 | grep -A 5 "on object monitor"
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(Native Method)
	at java.lang.Object.wait(Object.java:502)
	at java.lang.UNIXProcess.waitFor(UNIXProcess.java:395)
	- locked <0x00000000b107f008> (a java.lang.UNIXProcess)
	at com.intellij.execution.process.ProcessWaitFor$1$1.run(ProcessWaitFor.java:52)
--
   java.lang.Thread.State: TIMED_WAITING (on object monitor)
	at java.lang.Object.wait(Native Method)
	at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:143)
	- locked <0x00000000bc295c50> (a java.lang.ref.ReferenceQueue$Lock)
	at sun.rmi.transport.DGCClient$EndpointEntry$RenewCleanThread.run(DGCClient.java:553)
	at java.lang.Thread.run(Thread.java:745)
--
   java.lang.Thread.State: TIMED_WAITING (on object monitor)
	at java.lang.Object.wait(Native Method)
	at sun.misc.GC$Daemon.run(GC.java:117)
	- locked <0x00000000bc295cb0> (a sun.misc.GC$LatencyLock)

```
#### 1.2.2.3. 监控内存和CPU工具vmstat

**vmstat**

```bash
lgj@lgj-Lenovo-G470:~/aProject/aRealPrj/Java-Interview$ vmstat 5
procs -----------memory---------- ---swap-- -----io---- -system-- ------cpu-----
 r  b   swpd   free   buff  cache   si   so    bi    bo   in   cs us sy id wa st
 0  0      0 2583376 206884 2458524    0    0    17    17  204  216  8  2 89  1  0
 0  0      0 2600524 206892 2439504    0    0     0    91  485 1380  2  1 97  0  0

```


```
FIELD DESCRIPTION FOR VM MODE
   Procs
       r: The number of processes waiting for run time.等待运行的进程数
       b: The number of processes in uninterruptible sleep.处在非中断睡眠的进程数
   Memory
       swpd: the amount of virtual memory used.
       free: the amount of idle memory.
       buff: the amount of memory used as buffers.
       cache: the amount of memory used as cache.
       inact: the amount of inactive memory. (-a option)
       active: the amount of active memory. (-a option)
   Swap
       si: Amount of memory swapped in from disk (/s).每秒从硬盘读入到内存的数据量
       so: Amount of memory swapped to disk (/s)，每秒从内存写入硬盘的数据量
   IO
       bi: Blocks received from a block device (blocks/s).
       bo: Blocks sent to a block device (blocks/s).
   System
       in: The number of interrupts per second, including the clock.
       cs: The number of context switches per second.
   CPU
       These are percentages of total CPU time.
       us: Time spent running non-kernel code. (user time, including nice time)
       sy: Time spent running kernel code. (system time)
       id: Time spent idle. Prior to Linux 2.5.41, this includes IO-wait time.
       wa: Time spent waiting for IO. Prior to Linux 2.5.41, included in idle.
       st: Time stolen from a virtual machine. Prior to Linux 2.6.11, unknown.
```
和CPU相关的信息有 user time, system time, idle time, wait time, steal time;
另外提供了关于中断和上下文切换的信息。System 中的in，表示每秒的中断数，cs表示每秒的上下文切换数；
其它的字段是关于内存和磁盘的。

swpd值过高通常是由于物理内存不够用了，os将物理内存中的一部分数据转为存入硬盘上进行存储，以腾出空间给当前的运行的进程使用．在目前运行的程序变化后，即从硬盘中将数据读取到内存，以便恢复程序的运行，这个过程就会产生swap IO.因此看swap的消耗情况主要关注的是swap  io的状况，如果swap io发生较为频繁，那么会严重影响系统的性能．

由于Java是单进程应用，因此只要JVM内存设置不是过大，是不会操作到swap区域．物理内存消耗过多主要是jvm内存参数设置过大，创建的Java线程过多或通过Direct ByteBuffer往物理内存中放置了过多的对象造成．



#### 1.2.2.4. 监控IO工具iostat 

```
iostat   
Linux 4.15.0-46-generic (lgj-Lenovo-G470) 	12/27/19 	_x86_64_	(4 CPU)

avg-cpu:  %user   %nice %system %iowait  %steal   %idle
          12.05    0.01    0.93    0.54    0.00   86.46

Device             tps    kB_read/s    kB_wrtn/s    kB_read    kB_wrtn
loop0             0.00         0.01         0.00        534          0
loop1             0.00         0.00         0.00        329          0
loop2             0.12         0.13         0.00      11727          0
loop3             0.01         0.01         0.00        823          0
loop4             0.00         0.02         0.00       1438          0

#查看所有信息
$ iostat -x
Linux 4.15.0-46-generic (lgj-Lenovo-G470) 	12/27/19 	_x86_64_	(4 CPU)

avg-cpu:  %user   %nice %system %iowait  %steal   %idle
          12.02    0.01    0.93    0.54    0.00   86.50

Device  r/s     w/s     rkB/s     wkB/s   rrqm/s   wrqm/s  %rrqm  %wrqm r_await w_await aqu-sz rareq-sz wareq-sz  svctm  %util
loop0   0.00    0.00      0.01      0.00     0.00     0.00   0.00   0.00    5.69    0.00   0.00     2.23     0.00   0.00   0.00
loop1   0.00    0.00      0.00      0.00     0.00     0.00   0.00   0.00   55.24    0.00   0.00     8.89     0.00   7.46   0.00
loop2   0.12    0.00      0.13      0.00     0.00     0.00   0.00   0.00   15.65    0.00   0.00     1.09     0.00   0.51   0.01

```
* Device：设备卷标名或者分区名
* tps：设备每秒的传输次数
* kB_read/s：每秒从设备读取的数据量
* kB_wrtn/s：每秒从设备写入的数据量
* kB_read：读取的总数据量
* kB_wrtn：写入的总数据量
* r/s：每秒读的请求数
* w/s:每秒写的请求数
* r_await/w_await：　平均每次ＩＯ操作的等待时间
* aqu-sz:等待请求队列的平均长度
* svctm：平均每次设备的执行IO操作的时间
* %util：一秒之中有百分之几用于ＩＯ操作

在使用iostat查看IO消耗的情况时，首先要关注%iowai所占的百分比，如果占比较大，就需要关注io的消耗情况了．

当文件IO消耗过高时，对于Java应用最重要的是找出io消耗高的代码．先通过pidstat直接找到文件io操作多的线程，再通过jstack找到对应的代码．

Java应用造成文件io消耗严重的主要原因是多个线程需要进行大量内容的写入的动作．或者磁盘设备本身的处理速度慢．或文件系统慢．或操作的文件本身已经很大造成．



#### 1.2.2.5. 多功能诊断器pidstat  

iostat只能查看整个系统的文件IO消耗情况．pidstat 可以只查看进程的文件IO消耗情况．
pidstat是进程分析的终极利器，利用它可以分析进程(包括进程中所有每个线程)的各种信息：
cpu使用(默认就是cpu， -u 也是cpu),  内存使用(-r 包括page fault)，IO情况(-d)，进程切换(-w)，pidstat 可以使用 -p xxx 指定进程pid，单独分析一个进程及其所有线程；也可以是所有进程 -p ALL，或者是所有活动进程(默认是所有活动进程)：
默认是所有活动进程的 CPU信息：

```
lgj@lgj-Lenovo-G470:~$ pidstat  
Linux 4.15.0-46-generic (lgj-Lenovo-G470) 	09/08/19 	_x86_64_	(4 CPU)

15:53:18      UID       PID    %usr %system  %guest   %wait    %CPU   CPU  Command
15:53:18        0         1    0.00    0.03    0.00    0.02    0.04     3  systemd
15:53:18        0         2    0.00    0.00    0.00    0.00    0.00     3  kthreadd
15:53:18        0         7    0.00    0.01    0.00    0.01    0.01     0  ksoftirqd/0
15:53:18        0         8    0.00    0.22    0.00    0.06    0.22     1  rcu_sched
15:53:18        0        11    0.00    0.00    0.00    0.00    0.00     0  watchdog/0
15:53:18        0        14    0.00    0.00    0.00    0.00    0.00     1  watchdog/1
15:53:18        0        15    0.00    0.00    0.00    0.00    0.00     1  migration/1

```
可以通过pidstat　-d -t -p [pid] 1 100,查看线程的io的消耗情况．1和100分别为间隔时间和次数．

#### 1.2.2.6. 查看网络接口信息的命令ifconfig
<a href="#menu" style="float:right">目录</a>

ifconfig：  最常用的配置和查看网络接口信息的命令，服务器上执行此命令会得到类下文的内容，一下内容可看到多个设备和设备状态、信息。

```
lgj@lgj-Lenovo-G470:~$ ifconfig
br-4b7cc08aeb43: flags=4099<UP,BROADCAST,MULTICAST>  mtu 1500
        inet 172.18.0.1  netmask 255.255.0.0  broadcast 172.18.255.255
        ether 02:42:7f:e3:39:51  txqueuelen 0  (Ethernet)
        RX packets 0  bytes 0 (0.0 B)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 0  bytes 0 (0.0 B)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

docker0: flags=4099<UP,BROADCAST,MULTICAST>  mtu 1500
        inet 172.17.0.1  netmask 255.255.0.0  broadcast 172.17.255.255
        ether 02:42:f0:9b:99:39  txqueuelen 0  (Ethernet)
        RX packets 0  bytes 0 (0.0 B)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 0  bytes 0 (0.0 B)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

enp7s0: flags=4099<UP,BROADCAST,MULTICAST>  mtu 1500
        ether dc:0e:a1:84:e2:67  txqueuelen 1000  (Ethernet)
        RX packets 0  bytes 0 (0.0 B)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 0  bytes 0 (0.0 B)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        inet6 ::1  prefixlen 128  scopeid 0x10<host>
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 143450  bytes 47837466 (47.8 MB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 143450  bytes 47837466 (47.8 MB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

wlp8s0b1: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.1.104  netmask 255.255.255.0  broadcast 192.168.1.255
        inet6 fe80::929c:df46:dae:5a8b  prefixlen 64  scopeid 0x20<link>
        ether 7c:e9:d3:64:43:16  txqueuelen 1000  (Ethernet)
        RX packets 1628873  bytes 2205910252 (2.2 GB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 1111356  bytes 117686490 (117.6 MB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

```

#### 1.2.2.7. 网络流量统计实用工具nicstat
<a href="#menu" style="float:right">目录</a>

**安装**
```
sudo apt install nicstat
```

**使用命令**
```
lgj@lgj-Lenovo-G470:~$ nicstat --help
nicstat: invalid option -- '-'
USAGE: nicstat [-hvnsxpztualMU] [-i int[,int...]]
   [-S int:mbps[,int:mbps...]] [interval [count]]

         -h                 # help
         -v                 # show version (1.95)
         -i interface       # track interface only
         -n                 # show non-local interfaces only (exclude lo0)
         -s                 # summary output
         -x                 # extended output 查看扩展信息
         -p                 # parseable output
         -z                 # skip zero value lines
         -t                 # show TCP statistics 查看tcp相关信息
         -u                 # show UDP statistics  
         -a                 # equivalent to "-x -u -t"
         -l                 # list interface(s)
         -M                 # output in Mbits/sec 默认使用KB/S，更改为使用MB/S
         -U                 # separate %rUtil and %wUtil
         -S int:mbps[fd|hd] # tell nicstat the interface
                            # speed (Mbits/sec) and duplex
    eg,
       nicstat              # print summary since boot only
       nicstat 1            # print every 1 second
       nicstat 1 5          # print 5 times only
       nicstat -z 1         # print every 1 second, skip zero lines
       nicstat -i hme0 1    # print hme0 only every 1 second

```
**基本使用**
```
lgj@lgj-Lenovo-G470:~$ nicstat
    Time      Int   rKB/s   wKB/s   rPk/s   wPk/s    rAvs    wAvs %Util    Sat
01:19:42 wlp8s0b1   72.08    3.83   54.48   37.15  1354.9   105.7  0.00   0.00
01:19:42       lo    1.56    1.56    4.80    4.80   333.7   333.7  0.00   0.00

```
Time列:表示当前采样的响应时间.
lo and eth0 : 网卡名称.
rKB/s : 每秒接收到千字节数.
wKB/s : 每秒写的千字节数.
rPk/s : 每秒接收到的数据包数目.
wPk/s : 每秒写的数据包数目.
rAvs : 接收到的数据包平均大小.
wAvs : 传输的数据包平均大小.
%Util : 网卡利用率(百分比).
Sat : 网卡每秒的错误数.网卡是否接近饱满的一个指标.尝试去诊断网络问题的时候,推荐使用-x选项去查看更多的统计信息.


**查看tcp相关信息(-t):**
```
[root@centos192 nicstat-1.92]# ./nicstat.sh -t
05:15:05    InKB   OutKB   InSeg  OutSeg Reset  AttF %ReTX InConn OutCon Drops
TCP         0.00    0.00    4.01    3.50  0.00  0.01 0.000   0.05   0.09  0.0
```

InKB : 表示每秒接收到的千字节.
OutKB : 表示每秒传输的千字节.
InSeg : 表示每秒接收到的TCP数据段(TCP Segments).
OutSeg : 表示每秒传输的TCP数据段(TCP Segments).
Reset : 表示TCP连接从ESTABLISHED或CLOSE-WAIT状态直接转变为CLOSED状态的次数.
AttF : 表示TCP连接从SYN-SENT或SYN-RCVD状态直接转变为CLOSED状态的次数,再加上TCP连接从SYN-RCVD状态直接转变为LISTEN状态的次数
%ReTX : 表示TCP数据段(TCP Segments)重传的百分比.即传输的TCP数据段包含有一个或多个之前传输的八位字节.
InConn : 表示TCP连接从LISTEN状态直接转变为SYN-RCVD状态的次数.
OutCon : 表示TCP连接从CLOSED状态直接转变为SYN-SENT状态的次数.
Drops : 表示从完成连接(completed connection)的队列和未完成连接(incomplete connection)的队列中丢弃的连接次数.

**查看udp相关信息(-u):**
```
[root@centos192 nicstat-1.92]# ./nicstat.sh -u
06:39:42                    InDG   OutDG     InErr  OutErr
UDP                         0.01    0.01      0.00    0.00
```
InDG : 每秒接收到的UDP数据报(UDP Datagrams)
OutDG : 每秒传输的UDP数据报(UDP Datagrams)
InErr : 接收到的因包含错误而不能被处理的数据包
OutErr :因错误而不能成功传输的数据包.

#### 1.2.2.8. 查看网络信息和网络监控命令 
<a href="#menu" style="float:right">目录</a>

##### 1.2.2.8.1. ifconfig
该命令用于查看机器挂载的网卡情况 。
```bash
# 查看所有网卡信息
ifconfig -a 
# 查看特定网卡信息
ifconfig ethO
```
输出
```
ethO    Link encap：以太网硬件地址 08: 00: 27: 2 £: 70 : b6
        inet 地址： 192.168.1.102 广播： 192.168 . 1.255 掩码： 255.255 . 255.0
        inet6 地址： fe80:: aOO: 27 ff: fe 2 f : 70b6 /6 4 Scope: Link
        UP BROADCAST RUNNING MULTICAST MTU: 1500 跃点数： 1
        接收数据包 ： 14392 错误：。丢弃： 0 过载 ： 0 帧数：。
        发送数据包 ： 8665 错误：。丢弃： 0 过载 ： 0 载波：。
        碰撞： 0 发送队列长度： 1000
        接收字节： 15021524 (1 5.0 MB) 发送字节： 858553 (858 . 5 KB)
```
##### 1.2.2.8.2. ping

ping 命令是用于检测网络故障的常用命令 ，可以用来测试一 台主机到另外一台主机的网络是否连通。
使用方式：
```
ping www.baidu.com

ping 127.0.0.1 
```
##### 1.2.2.8.3. telnet

telnet 是 TCP/IP 协议族的一员，是网络远程登录服务的标准协议，帮助用户在本地计算机上连接远程主机。
使用方式 ：
```
telnet IP PORT
```

##### 1.2.2.8.4. mtr
m仕命令是 Linux 系统中的网络连通性测试工具，也可以用来检测丢包率。
使用方式 ：
mtr -r sina.com
命令输出 ：
```
$ mtr -r www.baidu.com
Start: 2019-12-20T01:30:53+0800
HOST: lgj-Lenovo-G470             Loss%   Snt   Last   Avg  Best  Wrst StDev
  1.|-- promote.cache-dns.local    0.0%    10    7.0   4.5   0.7  18.5   5.5
  2.|-- 115.174.70.1               0.0%    10    3.9   5.9   3.3  12.8   3.5
  3.|-- 10.144.14.242              0.0%    10   13.2   6.0   2.4  13.5   4.5
  4.|-- 14.197.177.41              0.0%    10    4.6   9.3   3.9  28.4   8.1
  5.|-- 14.197.225.117             0.0%    10   13.6  13.0   5.5  42.7  10.9
  6.|-- 14.197.197.253             0.0%    10   53.8  47.6  42.7  54.9   4.6
  7.|-- 14.197.219.206             0.0%    10   43.2  44.6  42.4  52.0   3.2
  8.|-- 168.160.254.222            0.0%    10   48.3  46.7  43.3  50.8   2.6
  9.|-- 182.61.252.218             0.0%    10   46.3  47.5  43.2  58.2   4.5
 10.|-- ???                       100.0    10    0.0   0.0   0.0   0.0   0.0
 11.|-- ???                       100.0    10    0.0   0.0   0.0   0.0   0.0
 12.|-- ???                       100.0    10    0.0   0.0   0.0   0.0   0.0
 13.|-- ???                       100.0    10    0.0   0.0   0.0   0.0   0.0
 14.|-- 182.61.200.6               0.0%    10   66.5  49.9  44.0  66.5   7.7
```
其中的第 2 列为丢包率，可以用来判断网络中两台机器的连通质量。

##### 1.2.2.8.5. nslookup

这是一款检测网络中 DNS 服务器能否正确解析域名的工具命令，并且可以输出 

```
$ nslookup www.baidu.com
Server:		127.0.0.53
Address:	127.0.0.53#53

Non-authoritative answer:
www.baidu.com	canonical name = www.a.shifen.com.
Name:	www.a.shifen.com
Address: 182.61.200.6
Name:	www.a.shifen.com
Address: 182.61.200.7

```

##### 1.2.2.8.6. sar

sar 是一个多功能的监控工具，使用简单，不需要管理员权限，可以输出每秒的网卡存取速度，适合线上排查问题时使用。
使用方式：
```
sar -n DEV 1 1
```
```
$ sar -n DEV 1 1
Linux 4.15.0-46-generic (lgj-Lenovo-G470) 	12/20/19 	_x86_64_	(4 CPU)

01:37:55        IFACE   rxpck/s   txpck/s    rxkB/s    txkB/s   rxcmp/s   txcmp/s  rxmcst/s   %ifutil
01:37:56           lo      0.00      0.00      0.00      0.00      0.00      0.00      0.00      0.00
01:37:56     wlp8s0b1      0.00      1.00      0.00      0.09      0.00      0.00      0.00      0.00
01:37:56      docker0      0.00      0.00      0.00      0.00      0.00      0.00      0.00      0.00
01:37:56    br-4b7cc08aeb43      0.00      0.00      0.00      0.00      0.00      0.00      0.00      0.00
01:37:56       enp7s0      0.00      0.00      0.00      0.00      0.00      0.00      0.00      0.00
01:37:56    br-c92fe5a4f7e1      0.00      0.00      0.00      0.00      0.00      0.00      0.00      0.00

Average:        IFACE   rxpck/s   txpck/s    rxkB/s    txkB/s   rxcmp/s   txcmp/s  rxmcst/s   %ifutil
Average:           lo      0.00      0.00      0.00      0.00      0.00      0.00      0.00      0.00
Average:     wlp8s0b1      0.00      1.00      0.00      0.09      0.00      0.00      0.00      0.00
Average:      docker0      0.00      0.00      0.00      0.00      0.00      0.00      0.00      0.00
Average:    br-4b7cc08aeb43      0.00      0.00      0.00      0.00      0.00      0.00      0.00      0.00
Average:       enp7s0      0.00      0.00      0.00      0.00      0.00      0.00      0.00      0.00
Average:    br-c92fe5a4f7e1      0.00      0.00      0.00      0.00      0.00      0.00      0.00      0.00

```
从输出中可以看到网卡的读写速度和流量，在应急过程中可以用来判断服务器是否上量。
* -A：所有报告的总和。
* -u: CPU 利用率 。
* -v：进程、 I 节点、文件和锁表状态。
* -d：硬盘的使用报告。
* -r: 没有使用的内存页面和硬盘块。
* -g ： 串口 1/0 的情况。
* -b：缓冲区的使用情况。
* -a：文件的读写情况 。
* -c：系统的调用情况。
* -R：进程的活动情况 。
* -y：终端设备的活动情况。
* -w：系统的交换活动。

通过sar -r　查看内存的消耗情况．
```
sar -r 2 5
Linux 4.15.0-46-generic (lgj-Lenovo-G470) 	12/27/19 	_x86_64_	(4 CPU)

02:17:23    kbmemfree   kbavail kbmemused  %memused kbbuffers  kbcached  kbcommit   %commit  kbactive   kbinact   kbdirty
02:17:25       660228   1405196   9514312     93.51    409296   1220868  16877352    137.53   7523728   1558744       620
02:17:27       659576   1404552   9514964     93.52    409304   1220948  16877352    137.53   7524368   1558808       652
02:17:29       659608   1404584   9514932     93.52    409304   1220948  16877352    137.53   7524468   1558808       664
02:17:31       659484   1404460   9515056     93.52    409304   1220952  16877352    137.53   7524656   1558812       488
02:17:33       657376   1402352   9517164     93.54    409304   1223228  16877352    137.53   7524620   1560976       488
Average:       659254   1404229   9515286     93.52    409302   1221389  16877352    137.53   7524368   1559230       582
```
sar和vmstat的共同弱点是不能分析单个进程所占用的内存量．可以通过top或者pidstat查看进程所消耗的内存量．但是to得到的java的运行内存和之外占用的物理内存的总和．

##### 1.2.2.8.7. netstat

此命令显示网络连接、端口信息等，另外一个命令 SS 与 netstat 命令类似， 不再单独介绍。

**基本使用**
```
lgj@lgj-Lenovo-G470:~$ netstat -h
usage: netstat [-vWeenNcCF] [<Af>] -r         netstat {-V|--version|-h|--help}
       netstat [-vWnNcaeol] [<Socket> ...]
       netstat { [-vWeenNac] -i | [-cnNe] -M | -s [-6tuw] }

        -r, --route              display routing table
        -i, --interfaces         display interface table
        -g, --groups             display multicast group memberships
        -s, --statistics         display networking statistics (like SNMP)
        -M, --masquerade         display masqueraded connections

        -v, --verbose            be verbose
        -W, --wide               don't truncate IP addresses
        -n, --numeric            don't resolve names
        --numeric-hosts          don't resolve host names
        --numeric-ports          don't resolve port names
        --numeric-users          don't resolve user names
        -N, --symbolic           resolve hardware names
        -e, --extend             display other/more information
        -p, --programs           display PID/Program name for sockets
        -o, --timers             display timers
        -c, --continuous         continuous listing

        -l, --listening          display listening server sockets
        -a, --all                display all sockets (default: connected)
        -F, --fib                display Forwarding Information Base (default)
        -C, --cache              display routing cache instead of FIB
        -Z, --context            display SELinux security context for sockets

  <Socket>={-t|--tcp} {-u|--udp} {-U|--udplite} {-S|--sctp} {-w|--raw}
           {-x|--unix} --ax25 --ipx --netrom
  <AF>=Use '-6|-4' or '-A <af>' or '--<af>'; default: inet
  List of possible address families (which support routing):
    inet (DARPA Internet) inet6 (IPv6) ax25 (AMPR AX.25) 
    netrom (AMPR NET/ROM) ipx (Novell IPX) ddp (Appletalk DDP) 
    x25 (CCITT X.25) 

```
```
-a或--all：显示所有连线中的Socket； 
-A<网络类型>或--<网络类型>：列出该网络类型连线中的相关地址； 
-c或--continuous：持续列出网络状态； 
-C或--cache：显示路由器配置的快取信息； 
-e或--extend：显示网络其他相关信息； 
-F或--fib：显示FIB； 
-g或--groups：显示多重广播功能群组组员名单； 
-h或--help：在线帮助； 
-i或--interfaces：显示网络界面信息表单； 
-l或--listening：显示监控中的服务器的Socket； 
-M或--masquerade：显示伪装的网络连线； 
-n或--numeric：直接使用ip地址，而不通过域名服务器； 
-N或--netlink或--symbolic：显示网络硬件外围设备的符号连接名称； 
-o或--timers：显示计时器； 
-p或--programs：显示正在使用Socket的程序识别码和程序名称； 
-r或--route：显示Routing Table； 
-s或--statistice：显示网络工作信息统计表； 
-t或--tcp：显示TCP传输协议的连线状况； 
-u或--udp：显示UDP传输协议的连线状况； 
-v或--verbose：显示指令执行过程； 
-V或--version：显示版本信息； 
-w或--raw：显示RAW传输协议的连线状况； 
-x或--unix：此参数的效果和指定"-A unix"参数相同； 
--ip或--inet：此参数的效果和指定"-A inet"参数相同。
```

```
lgj@lgj-Lenovo-G470:~$ netstat
Active Internet connections (w/o servers)
Proto Recv-Q Send-Q Local Address           Foreign Address         State      
tcp        0      0 localhost:51188         localhost:46561         ESTABLISHED
tcp        0      1 bogon:52244             tsa03s02-in-f14.1:https SYN_SENT   
tcp        0      1 bogon:52232             tsa03s02-in-f14.1:https SYN_SENT   
tcp        0      1 bogon:52230             tsa03s02-in-f14.1:https SYN_SENT 
```

```bash
#根据进程查找踹口
ps -elf I grep 进程
#根据进程 D 查找进程开启的端口 ：
netstat -nap I grep 2862
#查找使用端口的进程号
netstat -nap I grep 8080
#根据进程 ID 查找进程的详细信息
ps -elf | grep 2862
```
##### 1.2.2.8.8. iptraf

iptraf 是一个实时监控网络流量的交互式的彩色文本屏幕界面。它监控的数据比较全面，可以输出 TCP 连接、网络接口 、 协议、端口 、 网络包大小等信息，但是耗费的系统资源比较多，且需要管理员权限。

##### 1.2.2.8.9. tcpdump
tcpdump 是网络状况分析和跟踪工具，是可以用来抓包的实用命令，使用前需要对 TCP/IP有所熟悉，因为过滤使用的信息都是 TCP/IP 格式 。
显示来源 IP 或者目的四为 192.168.1.102 的网络通信：
```
sudo tcpdump -i ethO host 192.168.1.102
```
显示去往 102.168 .1.102 的所有 FTP 会话信息：
```
sudo tcpdump -i ethl ’ dst 192 . 168.1.102 and (port 21 or 20 ) ’
```
显示去往 102.168 . 1.102 的所有 HTTP 会话信息 ：
```
sudo tcpdump -ni ethO ’ dst 192.168.1.102 and tcp and port 8080 ’
```
##### 1.2.2.8.10. nmap

扫描某一主机打开的端口及端口提供的服务信息 ，通常用于查看本机有哪些端口对外提供服务，或者确定服务器有哪些端口对外开放。
使用方式 ：
```
nmap -v -A localhost
```
##### 1.2.2.8.11. ethtool

ethtool 用于查看网卡 的配置情况。

使用方式 ：

```
ethtool 网卡名称
```

#### 1.2.2.9. 查看磁盘空间du&df
<a href="#menu" style="float:right">目录</a>

* **du : 显示每个文件和目录的磁盘使用空间~~~文件的大小**
    * -a   显示目录中文件的大小  单位 KB 。
    * -b  显示目录中文件的大小，以字节byte为单位。
    * -c  显示目录中文件的大小，同时也显示总和；单位KB。
    * -k 、-m  显示目录中文件的大小，-k 单位KB，-m 单位MB.
    * -s  仅显示目录的总值，单位KB。
    * -h  以K  M  G为单位显示，提高可读性~~~（最常用的一个~也可能只用这一个就满足需求了）
    * -x  以一开始处理时的文件系统为准，若遇上其它不同的文件系统目录则略过。 
    * -L  显示选项中所指定符号链接的源文件大小。   
    * -S  显示个别目录的大小时，并不含其子目录的大小。 
    * -X  在<文件>指定目录或文件。   
    * --exclude=<目录或文件>    略过指定的目录或文件。    
    * -D   显示指定符号链接的源文件大小。   
    * -H或--si 与-h参数相同，但是K，M，G是以1000为换算单位。   
    * -l 重复计算硬件链接的文件。

```
lgj@lgj-Lenovo-G470:~/aProject/aRealPrj/Java-Interview$ du -h
52K	./.git/hooks
4.0K	./.git/branches
8.0K	./.git/info
12K	./.git/logs/refs/remotes/origin
16K	./.git/logs/refs/remotes
16K	./.git/logs/refs/heads
36K	./.git/logs/refs
52K	./.git/logs
164K	./.git/objects/4f
28K	./.git/objects/08
356K	./.git/objects/d5

```

* **df：显示磁盘分区上可以使用的磁盘空间**
    * -a   查看全部文件系统，单位默认KB
    * -h   使用-h选项以KB、MB、GB的单位来显示，可读性高~~~（最常用）
```
lgj@lgj-Lenovo-G470:~/aProject/aRealPrj/Java-Interview$ df   
Filesystem     1K-blocks     Used Available Use% Mounted on
udev             5065656        0   5065656   0% /dev
tmpfs            1017456     2180   1015276   1% /run
/dev/sdb2       72417352 58251612  10444064  85% /
tmpfs            5087268    79772   5007496   2% /dev/shm
tmpfs               5120        4      5116   1% /run/lock
tmpfs            5087268        0   5087268   0% /sys/fs/cgroup
/dev/loop0         15104    15104         0 100% /snap/gnome-characters/296
/dev/loop1          1024     1024         0 100% /snap/gnome-logs/57
/dev/loop2         36224    36224         0 100% /snap/gtk-common-themes/1198
/dev/loop6        153600   153600         0 100% /snap/gnome-3-28-1804/71
/dev/loop7          4224     4224         0 100% /snap/gnome-calculator/352
/dev/loop8          2304     2304         0 100% /snap/gnome-calculator/260
/dev/loop10         4224     4224         0 100% /snap/gnome-calculator/406

----
lgj@lgj-Lenovo-G470:~/aProject/aRealPrj/Java-Interview$ df -a
Filesystem     1K-blocks     Used Available Use% Mounted on
sysfs                  0        0         0    - /sys
proc                   0        0         0    - /proc
udev             5065656        0   5065656   0% /dev
devpts                 0        0         0    - /dev/pts
tmpfs            1017456     2180   1015276   1% /run
/dev/sdb2       72417352 58251708  10443968  85% /
securityfs             0        0         0    - /sys/kernel/security
tmpfs            5087268    79772   5007496   2% /dev/shm
tmpfs               5120        4      5116   1% /run/lock
tmpfs            5087268        0   5087268   0% /sys/fs/cgroup
cgroup                 0        0         0    - /sys/fs/cgroup/unified
cgroup                 0        0         0    - /sys/fs/cgroup/systemd

---
lgj@lgj-Lenovo-G470:~/aProject/aRealPrj/Java-Interview$ df -h
Filesystem      Size  Used Avail Use% Mounted on
udev            4.9G     0  4.9G   0% /dev
tmpfs           994M  2.2M  992M   1% /run
/dev/sdb2        70G   56G   10G  85% /
tmpfs           4.9G   79M  4.8G   2% /dev/shm
tmpfs           5.0M  4.0K  5.0M   1% /run/lock
tmpfs           4.9G     0  4.9G   0% /sys/fs/cgroup
/dev/loop0       15M   15M     0 100% /snap/gnome-characters/296
/dev/loop1      1.0M  1.0M     0 100% /snap/gnome-logs/57
/dev/loop2       36M   36M     0 100% /snap/gtk-common-themes/1198
/dev/loop6      150M  150M     0 100% /snap/gnome-3-28-1804/71
/dev/loop7      4.2M  4.2M     0 100% /snap/gnome-calculator/352

```
* **free  可以显示Linux系统中空闲的、已用的物理内存及swap内存,及被内核使用的buffer**
    * 命令格式：free [参数]
    * -b 　以Byte为单位显示内存使用情况。   
    * -k 　以KB为单位显示内存使用情况。 
    * -m 　以MB为单位显示内存使用情况。
    * -g   以GB为单位显示内存使用情况。 
    * -o 　不显示缓冲区调节列。 
    * -s<间隔秒数> 　持续观察内存使用状况。 
    * -t 　显示内存总和列。 
    * -V 　显示版本信息。 
```bash
lgj@lgj-Lenovo-G470:~/aProject/aRealPrj/Java-Interview$ free -b -s 5
              total        used        free      shared  buff/cache   available
Mem:    10418728960  6505390080   513257472   621293568  3400081408  3327586304
Swap:    2147479552           0  2147479552

              total        used        free      shared  buff/cache   available
Mem:    10418728960  6507880448   510742528   621293568  3400105984  3325095936
Swap:    2147479552           0  2147479552

              total        used        free      shared  buff/cache   available
Mem:    10418728960  6504284160   514330624   621293568  3400114176  3328692224
Swap:    2147479552           0  2147479552

```



## 1.3. IDEA安装hsdis查看JIT编译的汇编代码

You need an hsdis plugin to use PrintAssembly. A convenient choice is the hsdis plugin based on FCML library.

It can be compiled for UNIX-like systems and on Windows you can use pre-built libraries available in the FCML download section on [下载](https://sourceforge.net/projects/fcml/files/):

**To install in Windows:**
Extract the dll (it can be found in hsdis-1.1.2-win32-i386.zip and hsdis-1.1.2-win32-amd64.zip).
Copy the dll to wherever exists java.dll (use Windows search). On my system, I found it at two locations:
C:\Program Files\Java\jre1.8.0_45\bin\server
C:\Program Files\Java\jdk1.8.0_45\jre\bin\server
To install in Linux:
Download source code, extract it
```bash
cd <source code dir>
./configure && make && sudo make install
cd example/hsdis && make && sudo make install
sudo ln -s /usr/local/lib/libhsdis.so <JDK PATH>/lib/amd64/hsdis-amd64.so
sudo ln -s /usr/local/lib/libhsdis.so <JDK PATH>/jre/lib/amd64/hsdis-amd64.so
On my system, the JDK is in /usr/lib/jvm/java-8-oracle
```

**How to run it:**

```bash
java -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly 
-XX:+LogCompilation -XX:PrintAssemblyOptions=intel,mpad=10,cpad=10,code 
-jar fcml-test.jar
```
Additional configuration parameters:

code Print machine code before the mnemonic.
intel Use the Intel syntax.
gas Use the AT&T assembler syntax (GNU assembler compatible).
dec Prints IMM and displacement as decimal values.
mpad=XX Padding for the mnemonic part of the instruction.
cpad=XX Padding for the machine code.
seg Shows the default segment registers.
zeros Show leading zeros in case of HEX literals.

The Intel syntax is a default one in case of Windows, whereas the AT&T one is a default for the GNU/Linux.

For more details see the FCML Library Reference Manual



## 1.4. 使用JMH做Benchmark基准测试
<a href="#menu" style="float:right">目录</a>

**BenchMark介绍**
BenchMark 又叫做基准测试，主要用来测试一些方法的性能，可以根据不同的参数以不同的单位进行计算（例如可以使用吞吐量为单位，也可以使用平均时间作为单位，在 BenchmarkMode 里面进行调整）。

**开始前的步骤**
项目使用的是 Maven，因此只要对 pom.xml 添加依赖即可。

```XML
<dependency>
    <groupId>org.openjdk.jmh</groupId>
    <artifactId>jmh-core</artifactId>
    <version>1.19</version>
</dependency>
<dependency>
    <groupId>org.openjdk.jmh</groupId>
    <artifactId>jmh-generator-annprocess</artifactId>
    <version>1.19</version>
    <scope>provided</scope>
</dependency>
```

**例子**

```JAVA
package com.psd.benchmark;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Author: Shadowdsp
 * Date: 18/07/22
 */

@BenchmarkMode(Mode.Throughput) // 吞吐量
@OutputTimeUnit(TimeUnit.MILLISECONDS) // 结果所使用的时间单位
@State(Scope.Thread) // 每个测试线程分配一个实例
@Fork(2) // Fork进行的数目
@Warmup(iterations = 4) // 先预热4轮
@Measurement(iterations = 10) // 进行10轮测试
public class BenchMark {

    @Param({"10", "40", "70", "100"}) // 定义四个参数，之后会分别对这四个参数进行测试
    private int n;

    private List<Integer> array;
    private List<Integer> list;

    @Setup(Level.Trial) // 初始化方法，在全部Benchmark运行之前进行
    public void init() {
        array = new ArrayList<>(0);
        list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            array.add(i);
            list.add(i);
        }
    }

    @Benchmark
    public void arrayTraverse() {
        for (int i = 0; i < n; i++) {
            array.get(i);
        }
    }

    @Benchmark
    public void listTraverse() {
        for (int i = 0; i < n; i++) {
            list.get(i);
        }
    }

    @TearDown(Level.Trial) // 结束方法，在全部Benchmark运行之后进行
    public void arrayRemove() {
        for (int i = 0; i < n; i++) {
            array.remove(0);
            list.remove(0);
        }
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder().include(BenchMark.class.getSimpleName()).build();
        new Runner(options).run();
    }
}
```

```
# JMH version: 1.19
# VM version: JDK 1.8.0_144, VM 25.144-b01
# VM invoker: E:\Java\JDK8\jre\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.3.1\lib\idea_rt.jar=6182:C:\Program Files\JetBrains\IntelliJ IDEA 2017.3.1\bin -Dfile.encoding=UTF-8
# Warmup: 4 iterations, 1 s each
# Measurement: 10 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.psd.benchmark.BenchMark.arrayTraverse
# Parameters: (n = 10)

# Run progress: 0.00% complete, ETA 00:03:44
# Fork: 1 of 2
# Warmup Iteration   1: 189538.902 ops/ms
# Warmup Iteration   2: 287165.702 ops/ms
# Warmup Iteration   3: 282388.510 ops/ms
# Warmup Iteration   4: 277296.753 ops/ms
Iteration   1: 288687.174 ops/ms
Iteration   2: 277046.541 ops/ms
Iteration   3: 288680.458 ops/ms
Iteration   4: 279775.705 ops/ms
Iteration   5: 289098.257 ops/ms
Iteration   6: 287462.515 ops/ms
Iteration   7: 255330.788 ops/ms
Iteration   8: 282631.894 ops/ms
Iteration   9: 277038.372 ops/ms
Iteration  10: 277690.784 ops/ms

# Run progress: 6.25% complete, ETA 00:03:42
# Fork: 2 of 2
# Warmup Iteration   1: 286568.900 ops/ms
# Warmup Iteration   2: 288014.591 ops/ms
# Warmup Iteration   3: 281790.934 ops/ms
# Warmup Iteration   4: 279647.288 ops/ms
Iteration   1: 280839.175 ops/ms
Iteration   2: 289208.462 ops/ms
Iteration   3: 282724.949 ops/ms
Iteration   4: 289762.265 ops/ms
Iteration   5: 284551.820 ops/ms
Iteration   6: 283700.745 ops/ms
Iteration   7: 261083.800 ops/ms
Iteration   8: 283651.988 ops/ms
Iteration   9: 284418.725 ops/ms
Iteration  10: 282418.733 ops/ms




# Run complete. Total time: 00:03:56
(一般只需要关注这下面的东西)

Benchmark                (n)   Mode  Cnt       Score       Error   Units
BenchMark.arrayTraverse   10  thrpt   20  281290.158 ±  7750.303  ops/ms
BenchMark.arrayTraverse   40  thrpt   20  279251.339 ±  6287.385  ops/ms
BenchMark.arrayTraverse   70  thrpt   20  281224.067 ±  7376.077  ops/ms
BenchMark.arrayTraverse  100  thrpt   20  269576.123 ± 14237.446  ops/ms
BenchMark.listTraverse    10  thrpt   20   36438.771 ±  1680.987  ops/ms
BenchMark.listTraverse    40  thrpt   20    5912.221 ±   271.819  ops/ms
BenchMark.listTraverse    70  thrpt   20    1752.306 ±    77.143  ops/ms
BenchMark.listTraverse   100  thrpt   20     767.444 ±    28.363  ops/ms


Process finished with exit code 0

```

大多数情况只需要关注最下面的结果。

可以结合 Score 和 Unit 这两列，看到方法的效率。这里显然 arrayTraverse 的效率比 listTraverse 的高很多，因为 Unit 单位是 ops/ms，即单位时间内执行的操作数。所以显然在遍历的时候，ArrayList的效率是比LinkedList高的。

**注解介绍**

* **@BenchmarkMode**
Mode 表示 JMH 进行 Benchmark 时所使用的模式。通常是测量的维度不同，或是测量的方式不同。目前 JMH 共有四种模式：

    Throughput: 整体吞吐量，例如“1秒内可以执行多少次调用”，单位是操作数/时间。
    AverageTime: 调用的平均时间，例如“每次调用平均耗时xxx毫秒”，单位是时间/操作数。
    SampleTime: 随机取样，最后输出取样结果的分布，例如“99%的调用在xxx毫秒以内，99.99%的调用在xxx毫秒以内”
    SingleShotTime: 以上模式都是默认一次 iteration 是 1s，唯有 SingleShotTime 是只运行一次。往往同时把 warmup 次数设为0，用于测试冷启动时的性能。
    
* **@OutputTimeUnit**
输出的时间单位。

* **@Iteration**
Iteration 是 JMH 进行测试的最小单位。在大部分模式下，一次 iteration 代表的是一秒，JMH 会在这一秒内不断调用需要 Benchmark 的方法，然后根据模式对其采样，计算吞吐量，计算平均执行时间等。

* **@WarmUp**
Warmup 是指在实际进行 Benchmark 前先进行预热的行为。

    为什么需要预热？因为 JVM 的 JIT 机制的存在，如果某个函数被调用多次之后，JVM 会尝试将其编译成为机器码从而提高执行速度。为了让 Benchmark 的结果更加接近真实情况就需要进行预热。

* **@State**
类注解，JMH测试类必须使用 @State 注解，它定义了一个类实例的生命周期，可以类比 Spring Bean 的 Scope。由于 JMH 允许多线程同时执行测试，不同的选项含义如下：

    Scope.Thread：默认的 State，每个测试线程分配一个实例；
    Scope.Benchmark：所有测试线程共享一个实例，用于测试有状态实例在多线程共享下的性能；
    Scope.Group：每个线程组共享一个实例；

* **@Fork**
进行 fork 的次数。如果 fork 数是2的话，则 JMH 会 fork 出两个进程来进行测试。

* **@Meansurement**
提供真正的测试阶段参数。指定迭代的次数，每次迭代的运行时间和每次迭代测试调用的数量(通常使用 @BenchmarkMode(Mode.SingleShotTime) 测试一组操作的开销——而不使用循环)

* **@Setup**
方法注解，会在执行 benchmark 之前被执行，正如其名，主要用于初始化。

* **@TearDown**
方法注解，与@Setup 相对的，会在所有 benchmark 执行结束以后执行，主要用于资源的回收等。

* **@Setup/@TearDown注解使用Level参数来指定何时调用fixture：**

|名称|	描述
|---|---|	
|Level.Trial|	默认level。全部benchmark运行(一组迭代)之前/之后	
|Level.Iteration|	一次迭代之前/之后(一组调用)	
|Level.Invocation|	每个方法调用之前/之后(不推荐使用，除非你清楚这样做的目的)	

* **@Benchmark**
方法注解，表示该方法是需要进行 benchmark 的对象。

* **@Param**
成员注解，可以用来指定某项参数的多种情况。特别适合用来测试一个函数在不同的参数输入的情况下的性能。@Param 注解接收一个String数组，在 @Setup 方法执行前转化为为对应的数据类型。多个 @Param 注解的成员之间是乘积关系，譬如有两个用 @Param 注解的字段，第一个有5个值，第二个字段有2个值，那么每个测试方法会跑5*2=10次。



## 1.5. JVM
<a href="#menu" style="float:right">目录</a>

### 1.5.1. JRE/JDK/JVM是什么关系

**JRE**(JavaRuntimeEnvironment，Java运行环境)，也就是Java平台。所有的Java 程序都要在JRE下才能运行。普通用户只需要运行已开发好的java程序，安装JRE即可。

**JDK**(Java Development Kit)是程序开发者用来来编译、调试java程序用的开发工具包。JDK的工具也是Java程序，也需要JRE才能运行。为了保持JDK的独立性和��整性，在JDK的安装过程中，JRE也是 安装的一部分。所以，在JDK的安装目录下有一个名为jre的目录，用于存放JRE文件。

**JVM**(JavaVirtualMachine，Java虚拟机)是JRE的一部分。它是一个虚构出来的计算机，是通过在实际的计算机上仿真模拟各种计算机功能来实现的。JVM有自己完善的硬件架构，如处理器、堆栈、寄存器等，还具有相应的指令系统。Java语言最重要的特点就是跨平台运行。使用JVM就是为了支持与操作系统无关，实现跨平台。


### 1.5.2. Java 虚拟机

所谓虚拟机，就是一台虚拟计算机。它是一款软件，用来执行一系列虚拟计算机指令。
虚拟机可以分为系统虚拟机和程序虚拟机。
* 系统虚拟机
    * Visual Box , VMware
    * 对物理计算机的仿真，提供了一个可运行完整操作系统的软件平台
* 程序虚拟机
    * JVM
    * 专门为执行单个计算机程序而设计
* 无论是什么虚拟机，在上面运行的软件都被限制于虚拟机提供的资源中

* 每个平台都有不同的虚拟机，将程序代码编译为符合该平台的可运行代码，从而实现软件的跨平台特性

* 目前Java相关的虚拟机常用的是Hotspot虚拟机


#### 1.5.2.1. Java虚拟机规范

* 定义了虚拟机的内部结构
* 定义了虚拟机执行的字节码类型和功能
* 定义了类的装载，连接和初始化
* 定义了类文件的结构




### 1.5.3. HotSpot VM的基本架构

 HotSpot VM有三个组件：VM运行时，JIT编译器，以及内存管理器
 

### 1.5.4. Javac编译器和JIT编译器



#### 1.5.4.1. 解释执行和编译执行

**解释执行**：将编译好的字节码一行一行地翻译为机器码执行。
**编译执行**：以方法为单位，将字节码一次性翻译为机器码后执行

在编译示时期，我们通过将源代码编译成.class ，配合JVM这种跨平台的抽象，屏蔽了底层计算机操作系统和硬件的区别，实现了“一次编译，到处运行” 。 而在运行时期，目前主流的JVM 都是混合模式（-Xmixed），即解释运行 和编译运行配合使用。

　　以 Oracle JDK提供的HotSpot虚拟机为例，在HotSpot虚拟机中，提供了两种编译模式：解释执行 和 即时编译（JIT，Just-In-Time）。解释执行即逐条翻译字节码为可运行的机器码，而即时编译则以方法为单位将字节码翻译成机器码（上述提到的“编译执行”）。前者的优势在于不用等待，后者则在实际运行当中效率更高。

　　即时编译存在的意义在于它是提高程序性能的重要手段之一。根据“二八定律”（即：百分之二十的代码占据百分之八十的系统资源），对于大部分不常用的代码，我们无需耗时间将之编译为机器码，而是采用解释执行的方式，用到就去逐条解释运行；对于一些仅占据小部分的热点代码（可认为是反复执行的重要代码），则可将之翻译为符合机器的机器码高效执行，提高程序的效率，此为运行时的即时编译。

　　为了满足不同的场景，HotSpot虚拟机内置了多个即时编译器：C1,C2与Graal。Graal 是Java10正式引入的实验性即时编译器
C1：即Client编译器，面向对启动性能有要求的客户端GUI程序，采用的优化手段比较简单，因此编译的时间较短。
C2：即Server编译器，面向对性能峰值有要求的服务端程序，采用的优化手段复杂，因此编译时间长，但是在运行过程中性能更好。

　　从Java7开始，HotSpot虚拟机默认采用分层编译的方式：热点方法首先被C1编译器编译，而后 热点方法中的热点再进一步被C2编译（理解为二次编译，根据前面的运行计算出更优的编译优化）。为了不干扰程序的正常运行，JIT编译时放在额外的线程中执行的，HotSpot根据实际CPU的资源，以 1:2的比例分配给C1和C2线程数。在计算机资源充足的情况，字节码的解释运行和编译运行时可以同时进行，编译执行完后的机器码会在下次调用该方法时启动，已替换原本的解释执行（意思就是已经翻译出效率更高的机器码，自然替换原来的相对低效率执行的方法）。

　　以上，可以看出在Java中不单单是解释执行，即时编译（编译执行）在Java性能优化中彰显重要的作用，所以现在应该说：Java是解释执行和编译执行共同存在的，至少大部分是这样。




#### 1.5.4.2. 编译过程

不论是物理机还是虚拟机，大部分的程序代码从开始编译到最终转化成物理机的目标代码或虚拟机能执行的指令集之前，都会按照如下图所示的各个步骤进行：
![](https://img-blog.csdn.net/20140108200742312)

其中绿色的模块可以选择性实现。很容易看出，上图中间的那条分支是解释执行的过程（即一条字节码一条字节码地解释执行，如JavaScript），而下面的那条分支就是传统编译原理中从源代码到目标机器代码的生成过程。

如今，基于物理机、虚拟机等的语言，大多都遵循这种基于现代经典编译原理的思路，在执行前先对程序源码进行词法解析和语法解析处理，把源码转化为抽象语法树。对于一门具体语言的实现来说，词法和语法分析乃至后面的优化器和目标代码生成器都可以选择独立于执行引擎，形成一个完整意义的编译器去实现，这类代表是C/C++语言。也可以把抽象语法树或指令流之前的步骤实现一个半独立的编译器，这类代表是Java语言。又或者可以把这些步骤和执行引擎全部集中在一起实现，如大多数的JavaScript执行器。


#### 1.5.4.3. Javac编译
   
在Java中提到“编译”，自然很容易想到Javac编译器将*.java文件编译成为*.class文件的过程，这里的Javac编译器称为前端编译器，其他的前端编译器还有诸如Eclipse JDT中的增量式编译器ECJ等。相对应的还有后端编译器，它在程序运行期间将字节码转变成机器码（现在的Java程序在运行时基本都是解释执行加编译执行），如HotSpot虚拟机自带的JIT（Just In Time Compiler）编译器（分Client端和Server端）。另外，有时候还有可能会碰到静态提前编译器（AOT，Ahead Of Time Compiler）直接把*.java文件编译成本地机器代码，如GCJ、Excelsior JET等，这类编译器我们应该比较少遇到。

下面简要说下Javac编译（前端编译）的过程。

* 词法、语法分析
    * 词法分析是将源代码的字符流转变为标记（Token）集合。单个字符是程序编写过程中的的最小元素，而标记则是编译过程的最小元素，关键字、变量名、字面量、运算符等都可以成为标记，比如整型标志int由三个字符构成，但是它只是一个标记，不可拆分。
    * 语法分析是根据Token序列来构造抽象语法树的过程。抽象语法树是一种用来描述程序代码语法结构的树形表示方式，语法树的每一个节点都代表着程序代码中的一个语法结构，如bao、类型、修饰符、运算符等。经过这个步骤后，编译器就基本不会再对源码文件进行操作了，后续的操作都建立在抽象语法树之上。

* 填充符号表
    * 完成了语法分析和词法分析之后，下一步就是填充符号表的过程。符号表是由一组符号地址和符号信息构成的表格。符号表中所登记的信息在编译的不同阶段都要用到，在语义分析（后面的步骤）中，符号表所登记的内容将用于语义检查和产生中间代码，在目标代码生成阶段，党对符号名进行地址分配时，符号表是地址分配的依据。
* 语义分析
    * 语法树能表示一个结构正确的源程序的抽象，但无法保证源程序是符合逻辑的。而语义分析的主要任务是读结构上正确的源程序进行上下文有关性质的审查。语义分析过程分为标注检查和数据及控制流分析两个步骤：
        * 标注检查步骤检查的内容包括诸如变量使用前是否已被声明、变量和赋值之间的数据类型是否匹配等。
        * 数据及控制流分析是对程序上下文逻辑更进一步的验证，它可以检查出诸如程序局部变量在使用前是否有赋值、方法的每条路径是否都有返回值、是否所有的受查异常都被正确处理了等问题。
* 字节码生成
    * 字节码生成是Javac编译过程的最后一个阶段。字节码生成阶段不仅仅是把前面各个步骤所生成的信息转化成字节码写到磁盘中，编译器还进行了少量的代码添加和转换工作。 实例构造器< init>（）方法和类构造器< clinit>（）方法就是在这个阶段添加到语法树之中的（这里的实例构造器并不是指默认的构造函数，而是指我们自己重载的构造函数，如果用户代码中没有提供任何构造函数，那编译器会自动添加一个没有参数、访问权限与当前类一致的默认构造函数，这个工作在填充符号表阶段就已经完成了）。

#### 1.5.4.4. JIT编译
    Java程序最初是仅仅通过解释器解释执行的，即对字节码逐条解释执行，这种方式的执行速度相对会比较慢，尤其当某个方法或代码块运行的特别频繁时，这种方式的执行效率就显得很低。于是后来在虚拟机中引入了JIT编译器（即时编译器），当虚拟机发现某个方法或代码块运行特别频繁时，就会把这些代码认定为“Hot Spot Code”（热点代码），为了提高热点代码的执行效率，在运行时，虚拟机将会把这些代码编译成与本地平台相关的机器码，并进行各层次的优化，完成这项任务的正是JIT编译器。

    现在主流的商用虚拟机（如Sun HotSpot、IBM J9）中几乎都同时包含解释器和编译器（三大商用虚拟机之一的JRockit是个例外，它内部没有解释器，因此会有启动相应时间长之类的缺点，但它主要是面向服务端的应用，这类应用一般不会重点关注启动时间）。二者各有优势：当程序需要迅速启动和执行时，解释器可以首先发挥作用，省去编译的时间，立即执行；当程序运行后，随着时间的推移，编译器逐渐会返回作用，把越来越多的代码编译成本地代码后，可以获取更高的执行效率。解释执行可以节约内存，而编译执行可以提升效率。

    HotSpot虚拟机中内置了两个JIT编译器：Client Complier和Server Complier，分别用在客户端和服务端，目前主流的HotSpot虚拟机中默认是采用解释器与其中一个编译器直接配合的方式工作。

运行过程中会被即时编译器编译的“热点代码”有两类：
* 被多次调用的方法。
* 被多次调用的循环体。
  
  两种情况，编译器都是以整个方法作为编译对象，这种编译也是虚拟机中标准的编译方式。要知道一段代码或方法是不是热点代码，是不是需要触发即时编译，需要进行Hot Spot Detection（热点探测）。目前主要的热点 判定方式有以下两种：
* 基于采样的热点探测：采用这种方法的虚拟机会周期性地检查各个线程的栈顶，如果发现某些方法经常出现在栈顶，那这段方法代码就是“热点代码”。这种探测方法的好处是实现简单高效，还可以很容易地获取方法调用关系，缺点是很难精确地确认一个方法的热度，容易因为受到线程阻塞或别的外界因素的影响而扰乱热点探测。
* 基于计数器的热点探测：采用这种方法的虚拟机会为每个方法，甚至是代码块建立计数器，统计方法的执行次数，如果执行次数超过一定的阀值，就认为它是“热点方法”。这种统计方法实现复杂一些，需要为每个方法建立并维护计数器，而且不能直接获取到方法的调用关系，但是它的统计结果相对更加精确严谨。

在HotSpot虚拟机中使用的是第二种——基于计数器的热点探测方法，因此它为每个方法准备了两个计数器：方法调用计数器和回边计数器。
* 方法调用计数器用来统计方法调用的次数，在默认设置下，方法调用计数器统计的并不是方法被调用的绝对次数，而是一个相对的执行频率，即一段时间内方法被调用的次数。
* 回边计数器用于统计一个方法中循环体代码执行的次数（准确地说，应该是回边的次数，因为并非所有的循环都是回边），在字节码中遇到控制流向后跳转的指令就称为“回边”。

    在确定虚拟机运行参数的前提下，这两个计数器都有一个确定的阀值，当计数器的值超过了阀值，就会触发JIT编译。触发了JIT编译后，在默认设置下，执行引擎并不会同步等待编译请求完成，而是继续进入解释器按照解释方式执行字节码，直到提交的请求被编译器编译完成为止（编译工作在后台线程中进行）。当编译工作完成后，下一次调用该方法或代码时，就会使用已编译的版本。

    由于方法计数器触发即时编译的过程与回边计数器触发即时编译的过程类似，因此这里仅给出方法调用计数器触发即时编译的流程：

![](https://img-blog.csdn.net/20140108202856171)

**Javac字节码编译器与虚拟机内的JIT编译器的执行过程合起来其实就等同于一个传统的编译器所执行的编译过程。**



##### 1.5.4.4.1. 概述

* JIT编译器，英文写作Just-In-Time Compiler，中文意思是即时编译器。
JIT是一种提高程序运行效率的方法。通常，程序有两种运行方式：静态编译与动态解释。静态编译的程序在执行前全部被翻译为机器码，而动态解释执行的则是一句一句边运行边翻译。
* 在Java编程语言和环境中，即时编译器（JIT compiler，just-in-time compiler）是一个把Java的字节码（包括需要被解释的指令的程序）转换成可以直接发送给处理器的指令的程序。当你写好一个Java程序后，源语言的语句将由Java编译器编译成字节码，而不是编译成与某个特定的处理器硬件平台对应的指令代码（比如，Intel的Pentium微处理器或IBM的System/390处理器）。字节码是可以发送给任何平台并且能在那个平台上运行的独立于平台的代码。
* JIT编译器是JVM的核心。它对于程序性能的影响最大。
* CPU只能执行汇编代码或者二进制代码，所有程序都需要被翻译成它们，然后才能被CPU执行。
* C++以及Fortran这类编译型语言都会通过一个静态的编译器将程序编译成CPU相关的二进制代码。
* PHP以及Perl这列语言则是解释型语言，只需要安装正确的解释器，它们就能运行在任何CPU之上。当程序被执行的时候，程序代码会被逐行解释并执行。
* 编译型语言的优缺点：
    * 速度快：因为在编译的时候它们能够获取到更多的有关程序结构的信息，从而有机会对它们进行优化。
    * 适用性差：它们编译得到的二进制代码往往是CPU相关的，在需要适配多种CPU时，可能需要编译多次。
* 解释型语言的优缺点：
    * 适应性强：只需要安装正确的解释器，程序在任何CPU上都能够被运行
    * 速度慢：因为程序需要被逐行翻译，导致速度变慢。同时因为缺乏编译这一过程，执行代码不能通过编译器进行优化。
* Java的做法是找到编译型语言和解释性语言的一个中间点：
    * Java代码会被编译：被编译成Java字节码，而不是针对某种CPU的二进制代码。
    * Java代码会被解释：Java字节码需要被java程序解释执行，此时，Java字节码被翻译成CPU相关的二进制代码。
    * JIT编译器的作用：在程序运行期间，将Java字节码编译成平台相关的二进制代码。正因为此编译行为发生在程序运行期间，所以该编译器被称为Just-In-Time编译器。
* HotSpot VM名字也体现了JIT编译器的工作方式。在VM开始运行一段代码时，并不会立即对它们进行编译。在程序中，总有那么一些“热点”区域，该区域的代码会被反复的执行。而JIT编译器只会编译这些“热点”区域的代码。这么做的原因在于：
    * 编译那些只会被运行一次的代码性价比太低，直接解释执行Java字节码反而更快。
    * JVM在执行这些代码的时候，能获取到这些代码的信息，一段代码被执行的次数越多，JVM也对它们愈加熟悉，因此能够在对它们进行编译的时候做出一些优化。
    * 一个例子是：当在解释执行
        b = obj.equals(otherObj)
        的时候，需要查询该equals方法定义在哪个类型上，因为equals方法可能存在于继承树上的任意一个类。如果这段代码被会执行很多次，那么查询操作会耗费很多时间。而在JVM运行这段代码的时候，也许会发现equals方法定义在String类型上，那么当JIT编译器编译这段代码的时候，就会直接调用String类型上的equals方法(当然，在JIT编译得到的代码中，也会考虑到当obj的引用发生变化的时候，需要再次进行查询)。此时，这段代码会在两个方面被优化：
        * 由解释执行转换为编译执行
        * 跳过了方法查询阶段(直接调用String的equals方法)

##### 1.5.4.4.2. 客户端版或服务器版
一般只需要选择是使用客户端版或者服务器版的JIT编译器即可。
* 客户端版的JIT编译器使用：
    * -client
* 服务器版的使用：
    * -server
* 选择哪种类型一般和硬件的配置相关，当然随着硬件的发展，也没有一个确定的标准哪种硬件适合哪种配置。
* 两种JIT编译器的区别：
    * Client版对于代码的编译早于Server版，也意味着代码的执行速度在程序执行早期(程序启动阶段)Client版更快。
    * Server版对代码的编译会稍慢一些，这是为了获取到程序本身的更多信息，以便编译得到优化程度更高的代码。因为运行在Server上的程序通常都会持续很久。
        * 只有在该模式下，才可以启用逃逸分许技术
* Tiered编译的原理：
    * -XX:+TieredCompilation
    * JVM启动之初使用Client版JIT编译器
    * 当HotSpot形成之后使用Server版JIT编译器再次编译
* 在Java 8中，默认使用Tiered编译方式。

#### 1.5.4.5. Java 与 C/C++ 的编译器对比

##### 1.5.4.5.1. Java 编译器“劣势”的原因
Java虚拟机的即时编译器与C/C++的静态优化编译器相比，可能会由于下列原因，而导致输出的本地代码有一些劣势（下面列举的也包括一些虚拟机执行子系统的性能劣势）：

第一，因为即时编译器运行占用的是用户程序的运行时间，具有很大的时间压力，它能提供的优化手段也严重受制于编译成本。如果编译速度达不到要求，那用户将在启动程序或程序的某部分察觉到重大延迟，这点使得即时编译器不敢随便引入大规模的优化技术，而编译的时间成本在静态优化编译器中并不是主要的关注点。

第二，Java语言是动态的类型安全语言，这就意味着需要由虚拟机来确保程序不会违反语言语义或访问非结构化内存。从实现层面上看，这就意味着虚拟机必须频繁地进行动态检查，如实例方法访问时检查空指针、数组元素访问时检查上下界范围、类型转换时检查继承关系等。对于这类程序代码没有明确写出的检查行为，尽管编译器会努力进行优化，但是总体上仍然要消耗不少的运行时间。

第三，Java语言中虽然没有virtual关键字，但是使用虚方法的频率却远远大于C/C++语言，这意味着运行时对方法接收者进行多态选择的频率要远远大于C/C++语言，也意味着即时编译器在进行一些优化（如方法内联）时的难度要远远大于C/C++的静态优化编译器。

第四，Java语言是可以动态扩展的语言，运行时加载新的类可能改变程序类型的继承关系，这使得很多全局的优化难以进行，因为编译器无法看清程序的全貌，许多全局的优化都只能以激进优化的方式来完成，编译器不得不时刻注意并随着类型的变化而在运行时撤销或重新进行一些优化。

第五，Java语言的对象内存是在堆上，只有方法的局部变量才能在栈上分配，而C/C++的对象则有多重内存分配方式，既可能在堆上分配，又可能在栈上分配，如果可以在栈上分配线程私有的对象，将减轻内存回收的压力。另外，C/C++中主要由用户用程序代码来回收分配的内存，这就不存在无用对象筛选的过程，因此效率上（仅是运行效率，排除开发效率）也比Java的垃圾收集机制要高。

##### 1.5.4.5.2. Java 编译器的“优势”
上面所了一堆Java语言在性能上的劣势，这些都是为了换取「开发效率」上的优势而付出的代价，动态安全、动态扩展、垃圾回收这些“拖后腿”的特性，都为Java语言的开发效率做出了很大贡献。
何况，还有许多优化是Java的即时编译器能做，而C/C++的静态优化编译器不能做或者不好做的。例如，在C/C++中，别名分析（Alias Analysis）的难度就要远远高于Java。Java的类型安全保证了在类似如下代码中，只要ClassA和ClassB没有继承关系，那对象objA和objB就绝不可能是同一个对象，即不会是同一块内存两个不同别名。

void foo(ClassA objA, ClassB objB) {
    objA.x = 123;
    objB.y = 456;
    // 只要objB.y不是objA.x的别名，下面就可以保证输出为123
    print(objA.x);
}
确定了objA和objB并非对方的别名后，许多与数据依赖相关的优化才可以进行（重排序、变量替换）。具体到这个例子中，就是无需担心objB.y与objA.x指向同一块内存，这样就可以安全地确定打印语句中的objA.x为123。

Java编译器另外一个红利是由它的动态性所带来的，由于C/C++编译器所有优化都在编译期完成，以运行期性能监控为基础的优化措施它都无法进行，如：

调用频率预测：Call Frequency Prediction
分支频率预测：Branch Frequency Prediction
裁剪未被选择的分支：UNtaken Branch Pruning
这些都是Java语言独有的性能优势。

##### 1.5.4.5.3. 总结
随着Java JIT编译技术的发展，Java的运行速度已经足够快。Java能够在运行时动态加载类（可以从zip包、网络、运行时计算、其他文件生成），C/C++则完全做不到这一点。总的来说，Java的动态安全、动态扩展、垃圾回收等特性，使得开发效率很高，并且足够灵活；同时随着编译技术的不断发展，性能的劣势正在逐渐减小。

### 1.5.5. JVM内存模型
<a href="#menu" style="float:right">目录</a>
![](https://img2018.cnblogs.com/blog/163758/201811/163758-20181101131229284-1189515543.png)

#### 1.5.5.1. JVM的内存空间
* 堆内存
    * 新生代
        * Eden区
        * From Survivor区
        * To Survivor区
    * 老年代
* 方法区
* 栈内存(线程私有)
    * java虚拟机栈
    * 本地方法栈
* 程序计数器（线程私有）



* **堆内存（Heap）**
    * 对于大多数应用来说，Java 堆（Java Heap）是Java 虚拟机所管理的内存中最大的一块。Java 堆是被所有线程共享的一块内存区域，在虚拟机启动时创建。
    * 此内存区域的唯一目的就是存放对象实例，几乎所有的对象实例都在这里分配内存。
    * 堆内存是所有线程共有的，可以分为两个部分：年轻代和老年代。
    * 下图中的Perm代表的是永久代，但是注意永久代并不属于堆内存中的一部分，同时jdk1.8之后永久代已经被移除。
![](https://img2018.cnblogs.com/blog/163758/201811/163758-20181101131302208-1666214046.png)
    * 新生代 ( Young ) 与老年代 ( Old ) 的比例的值为 1:2 ( 该值可以通过参数 –XX:NewRatio 来指定 )
    * 默认的，Eden : from : to = 8 : 1 : 1 ( 可以通过参数 –XX:SurvivorRatio 来设定 )，即： Eden = 8/10 的新生代空间大小，from = to = 1/10 的新生代空间大小。

* **方法区（Method Area）**
    * 方法区也称"永久代"，它用于存储虚拟机加载的类信息、常量、静态变量、是各个线程共享的内存区域。
    * 如果系统定义的类太多，导致空间不足，导致方法区溢出，虚拟机同样会抛出内存溢出错误
    * 在JDK8之前的HotSpot JVM，存放这些”永久的”的区域叫做“永久代(permanent generation)”。永久代是一片连续的堆空间，在JVM启动之前通过在命令行设置参数-XX:MaxPermSize来设定永久代最大可分配的内存空间，默认大小是64M（64位JVM默认是85M）。
    * 随着JDK8的到来，JVM不再有 永久代(PermGen)。但类的元数据信息（metadata）还在，只不过不再是存储在连续的堆空间上，而是移动到叫做“Metaspace”的本地内存（Native memory。
        * -XX:MaxMetadataspaceSize指定最大值，如果不指定，会耗尽操作系统的所有物理内存
    * 方法区是一种规范，永久代和元空间只是实现方式
    * 由于永久代使用应用内存，很可能导致OOM，因此更换为元空间，可以无限制使用本地内存
* **虚拟机栈(JVM Stack)**
    * 描述的是java方法执行的内存模型：每个方法被执行的时候都会创建一个"栈帧",用于存储局部变量表(包括参数)、操作数栈、方法出口等信息。每个方法被调用到执行完的过程，就对应着一个栈帧在虚拟机栈中从入栈到出栈的过程。
        * 局部变量表
            * 保存函数的参数和局部变量
            * 由于局部变量表在栈帧中，因此如果函数的参数和局部变量比较多，会使得局部变量表膨胀，从而每一次函数调用就会占用更多的栈空间，最终导致函数的嵌套调用次数减少(在栈空间固定的情况下)。
        * 操作数栈
            * 用于保存计算过程中的中间结果，同时作为计算过程中变量临时的存储空间
            * 操作数栈也是一个先进后出的数据结构，只支持入栈和出栈两种操作
        * 帧数据区
            * 保存访问常量池的指针，方便程序访问常量池
    * 本地方法栈(Native Stack)
    * 本地方法栈（Native Method Stacks）与虚拟机栈所发挥的作用是非常相似的，其区别不过是虚拟机栈为虚拟机执行Java方法（也就是字节码）服务，而本地方法栈则是为虚拟机使用到的Native方法服务。
    * 栈的大小通过-Xss来设置，当栈中存储数据比较多时，需要适当调大这个值，否则会出现java.lang.StackOverflowError异常。常见的出现这个异常的是无法返回的递归，因为此时栈中保存的信息都是方法返回的记录点。

* **程序计数器（PC Register）**
    *  程序计数器是用于标识当前线程执行的字节码文件的行号指示器。多线程情况下，每个线程都具有各自独立的程序计数器，所以该区域是非线程共享的内存区域。
    * 当执行java方法时候，计数器中保存的是字节码文件的行号；当执行Native方法时，计数器的值为空。

* **直接内存**
    * 直接内存并不是虚拟机内存的一部分，也不是Java虚拟机规范中定义的内存区域。jdk1.4中新加入的NIO，引入了通道与缓冲区的IO方式，它可以调用Native方法直接分配堆外内存，这个堆外内存就是本机内存，不会影响到堆内存的大小。

* **为什么要把堆和栈区分出来呢？栈中不是也可以存储数据吗？**
    * 从软件设计的角度看，栈代表了处理逻辑，而堆代表了数据。这样分开，使得处理逻辑更为清晰。分而治之的思想。这种隔离、模块化的思想在软件设计的方方面面都有体现。
    * 堆与栈的分离，使得堆中的内容可以被多个栈共享（也可以理解为多个线程访问同一个对象）。这种共享的收益是很多的。一方面这种共享提供了一种有效的数据交互方式(如：共享内存)，另一方面，堆中的共享常量和缓存可以被所有栈访问，节省了空间。
    * 栈因为运行时的需要，比如保存系统运行的上下文，需要进行地址段的划分。由于栈只能向上增长，因此就会限制住栈存储内容的能力。而堆不同，堆中的对象是可以根据需要动态增长的，因此栈和堆的拆分，使得动态增长成为可能，相应栈中只需记录堆中的一个地址即可。
    * 面向对象就是堆和栈的完美结合。其实，面向对象方式的程序与以前结构化的程序在执行上没有任何区别。但是，面向对象的引入，使得对待问题的思考方式发生了改变，而更接近于自然方式的思考。当我们把对象拆开，你会发现，对象的属性其实就是数据，存放在堆中；而对象的行为（方法），就是运行逻辑，放在栈中。我们在编写对象的时候，其实即编写了数据结构，也编写的处理数据的逻辑。不得不承认，面向对象的设计，确实很美。

* 在Java中，Main函数就是栈的起始点，也是程序的起始点。程序要运行总是有一个起点的。同C语言一样，java中的Main就是那个起点。无论什么java程序，找到main就找到了程序执行的入口

* 堆中存什么？栈中存什么？
    * 堆中存的是对象。栈中存的是基本数据类型和堆中对象的引用。一个对象的大小是不可估计的，或者说是可以动态变化的，但是在栈中，一个对象只对应了一个4btye的引用（堆栈分离的好处：））。
    * 为什么不把基本类型放堆中呢？因为其占用的空间一般是1~8个字节——需要空间比较少，而且因为是基本类型，所以不会出现动态增长的情况——长度固定，因此栈中存储就够了，如果把他存在堆中是没有什么意义的（还会浪费空间，后面说明）。可以这么说，基本类型和对象的引用都是存放在栈中，而且都是几个字节的一个数，因此在程序运行时，他们的处理方式是统一的。但是基本类型、对象引用和对象本身就有所区别了，因为一个是栈中的数据一个是堆中的数据。最常见的一个问题就是，Java中参数传递时的问题

* Java中的参数传递时传值呢？还是传引用？
    * 不要试图与C进行类比，Java中没有指针的概念
    * 程序运行永远都是在栈中进行的，因而参数传递时，只存在传递基本类型和对象引用的问题。不会直接传对象本身
    * 明确以上两点后。Java在方法调用传递参数时，因为没有指针，所以它都是进行传值调用（这点可以参考C的传值调用）。因此，很多书里面都说Java是进行传值调用，这点没有问题，而且也简化的C中复杂性。
    * 但是传引用的错觉是如何造成的呢？在运行栈中，基本类型和引用的处理是一样的，都是传值，所以，如果是传引用的方法调用，也同时可以理解为“传引用值”的传值调用，即引用的处理跟基本类型是完全一样的。但是当进入被调用方法时，被传递的这个引用的值，被程序解释（或者查找）到堆中的对象，这个时候才对应到真正的对象。如果此时进行修改，修改的是引用对应的对象，而不是引用本身，即：修改的是堆中的数据。所以这个修改是可以保持的了。
    * 对象，从某种意义上说，是由基本类型组成的。可以把一个对象看作为一棵树，对象的属性如果还是对象，则还是一颗树（即非叶子节点），基本类型则为树的叶子节点。程序参数传递时，被传递的值本身都是不能进行修改的，但是，如果这个值是一个非叶子节点（即一个对象引用），则可以修改这个节点下面的所有内容

堆和栈中，栈是程序运行最根本的东西。程序运行可以没有堆，但是不能没有栈。而堆是为栈进行数据存储服务，说白了堆就是一块共享的内存。不过，正是因为堆和栈的分离的思想，才使得Java的垃圾回收成为可能

**栈上分配**
栈上分配是虚拟机一项优化技术。基本思想是，对于线程私有的对象(不会被其他线程访问的对象)，可以将它们打散分配在堆上。分配在栈上的好处是可以在函数调用结束后自行销毁，而不需要垃圾回收器的介入，从而提高系统的性能。

栈上分配的基础是进行逃逸分析。逃逸分析的目的是判断对象是否有可能逃逸出函数体。

```java

//不会逃逸出本体
public void func1(){

    User user = new User();
}
//可能会逃逸出本体从而在其他地方使用
public User func1(){

    User user = new User();
    return user;
}

```
对于第一种情况，虚拟机就有可能将User分配在栈上而不是堆上。

一些指令
* -server :只有在server模式下，才可能启用逃逸分析技术
* -XX:+DoESCAPEaNALYSIS启用逃逸分析
* -XX:EliminateAllocations开启了标量替换，允许将对象打散分配在栈上，比如对象有id和name,这两个字段将会被视为两个独立的局部变量进行分配。

可以做个测试，使用以上参数，测试不存在逃逸条件下，大量分配内存是否会发生GC。



* **JVM内存参数设置**             
    * -Xms设置堆的最小空间大小。
    * -Xmx设置堆的最大空间大小。
    * -Xmn:设置年轻代大小
    * -XX:NewSize设置新生代最小空间大小。
    * -XX:MaxNewSize设置新生代最大空间大小。
    * -XX:PermSize设置永久代最小空间大小。
    * -XX:MaxPermSize设置永久代最大空间大小。
    * -Xss设置每个线程的堆栈大小
    * -XX:+UseParallelGC:选择垃圾收集器为并行收集器。此配置仅对年轻代有效。即上述配置下,年轻代使用并发收集,而年老代仍旧使用串行收集。
    * -XX:ParallelGCThreads=20:配置并行收集器的线程数,即:同时多少个线程一起进行垃圾回收。此值最好配置与处理器数目相等。

```
java -Xmx3550m -Xms3550m -Xmn2g –Xss128k
```

* 内存泄露
    * 强引用所指向的对象不会被回收，可能导致内存泄漏，虚拟机宁愿抛出OOM也不会去回收他指向的对象
    * 分类
        * 常发性内存泄漏。发生内存泄漏的代码会被多次执行到，每次被执行的时候都会导致一块内存泄漏。 
        * 偶发性内存泄漏。发生内存泄漏的代码只有在某些特定环境或操作过程下才会发生。常发性和偶发性是相对的。对于特定的环境，偶发性的也许就变成了常发性的。所以测试环境和测试方法对检测内存泄漏至关重要。 
        * 一次性内存泄漏。发生内存泄漏的代码只会被执行一次，或者由于算法上的缺陷，导致总会有一块仅且一块内存发生泄漏。比如，在类的构造函数中分配内存，在析构函数中却没有释放该内存，所以内存泄漏只会发生一次。 
        * 隐式内存泄漏。程序在运行过程中不停的分配内存，但是直到结束的时候才释放内存。严格的说这里并没有发生内存泄漏，因为最终程序释放了所有申请的内存。但是对于一个服务器程序，需要运行几天，几周甚至几个月，不及时释放内存也可能导致最终耗尽系统的所有内存。所以，我们称这类内存泄漏为隐式内存泄漏
* 内存溢出
    * 系统已经不能再分配出你所需要的空间
    * 内存泄露将导致内存溢出
    * 内存溢出分析
        * 内存中加载的数据量过于庞大，如一次从数据库取出过多数据； 
        * 集合类中有对对象的引用，使用完后未清空，使得JVM不能回收； 
        * 代码中存在死循环或循环产生过多重复的对象实体； 
        * 使用的第三方软件中的BUG； 
        * 启动参数内存值设定的过小
    * 解决方法
        * 修改JVM启动参数，直接增加内存。(-Xms，-Xmx参数一定不要忘记加。)
        * 检查错误日志，查看“OutOfMemory”错误前是否有其 它异常或错误。        
        * 使用内存查看工具动态查看内存使用情况　
        * 对代码进行走查和分析，找出可能发生内存溢出的位置。
            * 检查对数据库查询中，是否有一次获得全部数据的查询。一般来说，如果一次取十万条记录到内存，就可能引起内存溢出。这个问题比较隐蔽，在上线前，数据库中数据较少，不容易出问题，上线后，数据库中数据多了，一次查询就有可能引起内存溢出。因此对于数据库查询尽量采用分页的方式查询。
            * 检查代码中是否有死循环或递归调用。
            * 检查是否有大循环重复产生新对象实体。
            * 检查对数据库查询中，是否有一次获得全部数据的查询。一般来说，如果一次取十万条记录到内存，就可能引起内存溢出。这个问题比较隐蔽，在上线前，数据库中数据较少，不容易出问题，上线后，数据库中数据多了，一次查询就有可能引起内存溢出。因此对于数据库查询尽量采用分页的方式查询。
            * 检查List、MAP等集合对象是否有使用完后，未清除的问题。List、MAP等集合对象会始终存有对对象的引用，使得这些对象不能被GC回收。 
* 异常
    * OutOfMemoryError
        * 堆内存不足，无法分配新的内存
    * StackOverflowError
        * 递归调用导致方法深度过高
#### 1.5.5.2. HotSpot 虚拟机的对象头

|机器|内容|说明|
|---|---|---|
|32/64bit|Mark Word|存储对象的HashCode或锁信息等|
|32/64bit|Class Metadata|存储对象类型数据的指针|
|32/64bit|Array length|数组的长度(如果当前对象是数组)|

* 第一部分用于存储对象自身的运行时数据，如哈希码（HashCode）、GC 分代年龄、锁状态标志、线程持有的锁、偏向线程 ID、偏向时间戳、对象分代年龄，这部分信息称为“Mark Word”；Mark Word 被设计成一个非固定的数据结构以便在极小的空间内存储尽量多的信息，它会根据自己的状态复用自己的存储空间。
* 第二部分是类型指针，即对象指向它的类元数据的指针，虚拟机通过这个指针来确定这个对象是哪个类的实例；
* 如果对象是一个 Java 数组，那在对象头中还必须有一块用于记录数组长度的数据。因为虚拟机可以通过普通 Java 对象的元数据信息确定 Java 对象的大小，但是从数组的元数据中无法确定数组的大小。


这部分数据的长度在 32 位和 64 位的虚拟机（未开启压缩指针）中分别为 32bit 和 64bit。

例如，在 32 位的 HotSpot 虚拟机中，如果对象处于未被锁定的状态下，那么 Mark Word 的 32bit 空间中的 25bit 用于存储对象哈希码，4bit 用于存储对象分代年龄，2bit 用于存储锁标志位，1bit 固定为 0，如下表所示：
![](http://images2015.cnblogs.com/blog/731716/201703/731716-20170302152004001-388228627.png)

在 32 位系统下，存放 Class 指针的空间大小是 4 字节，Mark Word 空间大小也是4字节，因此头部就是 8 字节，如果是数组就需要再加 4 字节表示数组的长度，如下表所示：
![](http://images2015.cnblogs.com/blog/731716/201703/731716-20170302152048845-1639352445.png)

在 64 位系统及 64 位 JVM 下，开启指针压缩，那么头部存放 Class 指针的空间大小还是4字节，而 Mark Word 区域会变大，变成 8 字节，也就是头部最少为 12 字节，如下表所示：
![](http://images2015.cnblogs.com/blog/731716/201703/731716-20170302152202938-44866486.png)


压缩指针：开启指针压缩使用算法开销带来内存节约，Java 对象都是以 8 字节对齐的，也就是以 8 字节为内存访问的基本单元，那么在地理处理上，就有 3 个位是空闲的，这 3 个位可以用来虚拟，利用 32 位的地址指针原本最多只能寻址 4GB，但是加上 3 个位的 8 种内部运算，就可以变化出 32GB 的寻址。




HotSpot对象头 Mark Word

|存储内容|标志位|状态|
|---|---|---|
|对象哈希码，对象分代年龄|01|未锁定|
|指向锁记录的指针|00|轻量级锁定|
|指向重量级锁的指针|10|膨胀(重量级锁定)|
|空，不需要记录信息|11|GC标志|
|偏向线程ID，偏向时间戳，对象分代年龄 |01|可偏向|

Mark Word有32bit,25bit对象哈希码，4bit存储对象分代年龄，2bit用于存储锁标志位，1bit固定为0。

#### 1.5.5.3. 对象访问定位

* 句柄访问
    * 使用句柄访问方式，java堆将会划分出来一部分内存去来作为句柄池，reference中存储的就是对象的句柄地址。而句柄中则包含对象实例数据的地址和对象类型数据（如对象的类型，实现的接口、方法、父类、field等）的具体地址信息。
    * 使用句柄访最大的好处是reference中存储着稳定的句柄地址，当对象移动之后（垃圾收集时移动对象是非常普遍的行为），只需要改变句柄中的对象实例地址即可，reference不用修改。
* 直接指针访问(hotspot使用)
    * 如果使用指针访问，那么java堆对象的布局中就必须考虑如何放置访问类型的相关信息（如对象的类型，实现的接口、方法、父类、field等），而reference中存储的就是对象的地址。
    * 使用指针访问的好处是访问速度快，它减少了一次指针定位的时间开销，由于java是面向对象的语言，在开发中java对象的访问非常的频繁，因此这类开销积少成多也是非常可观的，反之则提升访问速度。

#### 1.5.5.4. 内存泄漏和内存溢出
<a href="#menu" style="float:right">目录</a>

* 内存泄漏memory leak :是指程序在申请内存后，无法释放已申请的内存空间，一次内存泄漏似乎不会有大的影响，但内存泄漏堆积后的后果就是内存溢出。 
* 内存溢出 out of memory :指程序申请内存时，没有足够的内存供申请者使用，或者说，给了你一块存储int类型数据的存储空间，但是你却存储long类型的数据，那么结果就是内存不够用，此时就会报错OOM,即所谓的内存溢出。 

* 二者的关系
    * 内存泄漏的堆积最终会导致内存溢出内存溢出就是你要的内存空间超过了系统实际分配给你的空间，此时系统相当于没法满足你的需求，就会报内存溢出的错误。内存泄漏是指你向系统申请分配内存进行使用(new)，可是使用完了以后却不归还(delete)，结果你申请到的那块内存你自己也不能再访问（也许你把它的地址给弄丢了），而系统也不能再次将它分配给需要的程序。就相当于你租了个带钥匙的柜子，你存完东西之后把柜子锁上之后，把钥匙丢了或者没有将钥匙还回去，那么结果就是这个柜子将无法供给任何人使用，也无法被垃圾回收器回收，因为找不到他的任何信息。内存溢出：一个盘子用尽各种方法只能装4个果子，你装了5个，结果掉倒地上不能吃了。这就是溢出。比方说栈，栈满时再做进栈必定产生空间溢出，叫上溢，栈空时再做退栈也产生空间溢出，称为下溢。就是分配的内存不足以放下数据项序列,称为内存溢出。说白了就是我承受不了那么多，那我就报错，

* 内存泄漏的分类（按发生方式来分类）
    * 常发性内存泄漏。发生内存泄漏的代码会被多次执行到，每次被执行的时候都会导致一块内存泄漏。
    * 偶发性内存泄漏。发生内存泄漏的代码只有在某些特定环境或操作过程下才会发生。
    * 常发性和偶发性是相对的。对于特定的环境，偶发性的也许就变成了常发性的。所以测试环境和测试方法对检测内存泄漏至关重要。一次性内存泄漏。发生内存泄漏的代码只会被执行一次，或者由于算法上的缺陷，导致总会有一块仅且一块内存发生泄漏。比如，在类的构造函数中分配内存，在析构函数中却没有释放该内存，所以内存泄漏只会发生一次。隐式内存泄漏。程序在运行过程中不停的分配内存，但是直到结束的时候才释放内存。严格的说这里并没有发生内存泄漏，因为最终程序释放了所有申请的内存。但是对于一个服务器程序，需要运行几天，几周甚至几个月，不及时释放内存也可能导致最终耗尽系统的所有内存。所以，我们称这类内存泄漏为隐式内存泄漏。

* 内存溢出的原因及解决方法：
    * 内存溢出原因： 
        * 内存中加载的数据量过于庞大，如一次从数据库取出过多数据； 
        * 集合类中有对对象的引用，使用完后未清空，使得JVM不能回收； 
        * 代码中存在死循环或循环产生过多重复的对象实体； 
        * 使用的第三方软件中的BUG； 
        * 启动参数内存值设定的过小
    * 内存溢出的解决方案： 
        * 第一步，修改JVM启动参数，直接增加内存。(-Xms，-Xmx参数一定不要忘记加。)
        * 第二步，检查错误日志，查看“OutOfMemory”错误前是否有其 它异常或错误。
        * 第三步，对代码进行走查和分析，找出可能发生内存溢出的位置。
            * 重点排查以下几点： 
                * 检查对数据库查询中，是否有一次获得全部数据的查询。一般来说，如果一次取十万条记录到内存，就可能引起内存溢出。这个问题比较隐蔽，在上线前，数据库中数据较少，不容易出问题，上线后，数据库中数据多了，一次查询就有可能引起内存溢出。因此对于数据库查询尽量采用分页的方式查询。
                * 检查代码中是否有死循环或递归调用。
                * 检查是否有大循环重复产生新对象实体。
                * 检查对数据库查询中，是否有一次获得全部数据的查询。一般来说，如果一次取十万条记录到内存，就可能引起内存溢出。这个问题比较隐蔽，在上线前，数据库中数据较少，不容易出问题，上线后，数据库中数据多了，一次查询就有可能引起内存溢出。因此对于数据库查询尽量采用分页的方式查询。
                * 检查List、MAP等集合对象是否有使用完后，未清除的问题。List、MAP等集合对象会始终存有对对象的引用，使得这些对象不能被GC回收。
        * 第四步，使用内存查看工具动态查看内存使用情况

### 1.5.6. 垃圾回收算法
<a href="#menu" style="float:right">目录</a>

#### 1.5.6.1. 对象回收判定

**引用计数法**
* 给对象添加一个引用计数器，引用一次则计数器+1,引用失效计数器-1，当计数器为0的时候，说明没有地方引用，垃圾收集器可以将它进行回收
* 缺点
    * 无法解决循环引用

**可达性分析算法**
* 以GC ROOTS为起始点，从这些节点开始向下搜索，搜索所走过的路径称为引用链，当一个对象到GC ROOTS没有引用链相连时，说明不可达，也说明没有任何引用。
* 可达对象:指通过对象进行引用搜索，最终可以达到的对象
* 不可达对象:通过根对象进行引用搜索，最终没有被引用到的对象
* GC Roots对象
    * 虚拟机栈中引用的对象
    * 方法区中类静态对象引用的对象
    * 方法区中常量引用的对象
    * 本地方法栈中引用的对象

#### 1.5.6.2. Minor GC和Major GC



**Minor GC/young gc**
* Minor GC：简单理解就是发生在年轻代的GC。
* Minor GC的触发条件为：当产生一个新对象，新对象优先在Eden区分配。如果Eden区放不下这个对象，虚拟机会使用复制算法发生一次Minor GC，清除掉无用对象，同时将存活对象移动到Survivor的其中一个区(fromspace区或者tospace区)。虚拟机会给每个对象定义一个对象年龄(Age)计数器，对象在Survivor区中每“熬过”一次GC，年龄就会+1。待到年龄到达一定岁数(默认是15岁)，虚拟机就会将对象移动到年老代。如果新生对象在Eden区无法分配空间时，此时发生Minor GC。发生MinorGC，对象会从Eden区进入Survivor区，如果Survivor区放不下从Eden区过来的对象时，此时会使用分配担保机制将对象直接移动到年老代。


|参数|含义
|---|---|
|-XX:MaxGCPauseMillis|设置G1收集过程目标时间，默认值200ms
|-XX:G1NewSizePercent|新生代最小值，默认值5%
|-XX:G1MaxNewSizePercent|新生代最大值，默认值60%

**mixed gc**
当越来越多的对象晋升到老年代old region时，为了避免堆内存被耗尽，虚拟机会触发一个混合的垃圾收集器，即mixed gc，该算法并不是一个old gc，除了回收整个young region，还会回收一部分的old region，这里需要注意：是一部分老年代，而不是全部老年代，可以选择哪些old region进行收集，从而可以对垃圾回收的耗时时间进行控制。
那么mixed gc什么时候被触发？
先回顾一下cms的触发机制，如果添加了以下参数：
-XX:CMSInitiatingOccupancyFraction=80 
-XX:+UseCMSInitiatingOccupancyOnly

当老年代的使用率达到80%时，就会触发一次cms gc。相对的，mixed gc中也有一个阈值参数 -XX:InitiatingHeapOccupancyPercent，当老年代大小占整个堆大小百分比达到该阈值时，会触发一次mixed gc.
mixed gc的执行过程有点类似cms，主要分为以下几个步骤：

initial mark: 初始标记过程，整个过程STW，标记了从GC Root可达的对象
concurrent marking: 并发标记过程，整个过程gc collector线程与应用线程可以并行执行，标记出GC Root可达对象衍生出去的存活对象，并收集各个Region的存活对象信息
remark: 最终标记过程，整个过程STW，标记出那些在并发标记过程中遗漏的，或者内部引用发生变化的对象
clean up: 垃圾清除过程，如果发现一个Region中没有存活对象，则把该Region加入到空闲列表中

**Major GC/full gc**
如果对象内存分配速度过快，mixed gc来不及回收，导致老年代被填满，就会触发一次full gc，G1的full gc算法就是单线程执行的serial old gc，会导致异常长时间的暂停时间，需要进行不断的调优，尽可能的避免full gc.

* Major GC的触发条件：Major GC又称为Full GC。当年老代空间不够用的时候，虚拟机会使用“标记—清除”或者“标记—整理”算法清理出连续的内存空间，分配对象使用。

**full GC触发的条件**
除直接调用System.gc外，触发Full GC执行的情况有如下四种。
1. 旧生代空间不足
旧生代空间只有在新生代对象转入及创建为大对象、大数组时才会出现不足的现象，当执行Full GC后空间仍然不足，则抛出如下错误：
java.lang.OutOfMemoryError: Java heap space 
为避免以上两种状况引起的FullGC，调优时应尽量做到让对象在Minor GC阶段被回收、让对象在新生代多存活一段时间及不要创建过大的对象及数组。
2. Permanet Generation空间满
PermanetGeneration中存���的为一些class的信息等，当系统中要加载的类、反射的类和调用的方法较多时，Permanet Generation可能会被占满，在未配置为采用CMS GC的情况下会执行Full GC。如果经过Full GC仍然回收不了，那么JVM会抛出如下错误信息：
java.lang.OutOfMemoryError: PermGen space 
为避免Perm Gen占满造成Full GC现象，可采用的方法为增大Perm Gen空间或转为使用CMS GC。
3. CMS GC时出现promotion failed和concurrent mode failure
对于采用CMS进行旧生代GC的程序而言，尤其要注意GC日志中是否有promotion failed和concurrent mode failure两种状况，当这两种状况出现时可能会触发Full GC。
promotionfailed是在进行Minor GC时，survivor space放不下、对象只能放入旧生代，而此时旧生代也放不下造成的；concurrent mode failure是在执行CMS GC的过程中同时有对象要放入旧生代，而此时旧生代空间不足造成的。
应对措施为：增大survivorspace、旧生代空间或调低触发并发GC的比率，但在JDK 5.0+、6.0+的版本中有可能会由于JDK的bug29导致CMS在remark完毕后很久才触发sweeping动作。对于这种状况，可通过设置-XX:CMSMaxAbortablePrecleanTime=5（单位为ms）来避免。
4. 统计得到的Minor GC晋升到旧生代的平均大小大于旧生代的剩余空间
这是一个较为复杂的触发情况，Hotspot为了避免由于新生代对象晋升到旧生代导致旧生代空间不足的现象，在进行Minor GC时，做了一个判断，如果之前统计所得到的Minor GC晋升到旧生代的平均大小大于旧生代的剩余空间，那么就直接触发Full GC。
例如程序第一次触发MinorGC后，有6MB的对象晋升到旧生代，那么当下一次Minor GC发生时，首先检查旧生代的剩余空间是否大于6MB，如果小于6MB，则执行Full GC。
当新生代采用PSGC时，方式稍有不同，PS GC是在Minor GC后也会检查，例如上面的例子中第一次Minor GC后，PS GC会检查此时旧生代的剩余空间是否大于6MB，如小于，则触发对旧生代的回收。
除了以上4种状况外，对于使用RMI来进行RPC或管理的Sun JDK应用而言，默认情况下会一小时执行一次Full GC。可通过在启动时通过- java-Dsun.rmi.dgc.client.gcInterval=3600000来设置Full GC执行的间隔时间或通过-XX:+ DisableExplicitGC来禁止RMI调用System.gc。


#### 1.5.6.3. 对象引用分类
**强引用**
* Object obj = new Object();
* 只要强引用存在，就不会被垃圾回收
* 对于Map,List中存放的对象是强引用，因此一般通过虚引用和弱引用来缓存数据

**软引用**
* 通过SoftReference来实现 
* 内存不足时才会回收，回收之后内存不足将抛出OOM异常
* 可以通过get来获取对象实例
* 用于缓存热数据

**弱引用**
* 通过WeakReference来实现
* 只要发生垃圾回收，将会被回收
* 可以通过get来获取对象实例
* 用于缓存冷数据

**虚引用**
* 通过PhantomReference来实现
* 无法通过虚引用来获取对象的实例
* 虚引用和前面的软引用、弱引用不同，它并不影响对象的生命周期
* 如果一个对象与虚引用关联，则跟没有引用与之关联一样，在任何时候都可能被垃圾回收器回收。
* 虚引用必须和引用队列关联使用，当垃圾回收器准备回收一个对象时，如果发现它还有虚引用，就会把这个虚引用加入到与之 关联的引用队列中

#### 1.5.6.4. 标记清除算法
* 先标记可回收的对象空间，在标记完成之后进行统一的回收
* 缺点
    * 效率问题，标记和清除两个过程的效率都不高
    * 空间问题，清除后将产生内存碎片，不利于二次使用

#### 1.5.6.5. 复制算法
* 内存按容量分为两个区块，每次只使用一个区块用于内存分配
* 垃圾回收时，将存活的对象复制到另一个区块，按顺序存放
* 复制完成后，一次性清理之前的区块
* 新创建对象将在另一个区块中分配
* 优点
    * 不产生碎片内存
* 缺点
    * 空间利用率不高，每次只能有一块区域分配内存。
    * 复制效率不高

#### 1.5.6.6. 标记整理算法
* 标记对象，然后让存活的对象往一边移动，最后一次性清理掉端边界以外的内存。

#### 1.5.6.7. 分代收集算法
* 将内存分为老年代和新生代
* 新创建的对象在新生代进行内存分配，经过多次垃圾回收之后仍然存活的对象将被放到老年代
* 新生代的对象一般生命周期短，大部分都会被回收掉，因此每次垃圾收集只有很少的对象存活，因此使用复制算法效率比较高
* 老年代的对象经过多次回收仍然存活，说明生命周期长，不容易被回收。因此每次垃圾回收只有少量的对象被回收，因此使用标记清除/标记整理算法效率比较高。


### 1.5.7. 垃圾收集器
<a href="#menu" style="float:right">目录</a>

#### 1.5.7.1. 基本概念
<a href="#menu" style="float:right">目录</a>


* HotSpot虚拟机的垃圾收集器
    * 年轻代
        * Serial收集器
        * ParNew收集器
        * Parallel Scavenge收集器
        * G1收集器
    * 老年代
        * CMS收集器
        * Serial Old收集器
        * Parallel Old收集器
        * G1收集器

* 按系统线程分
    * 串行收集:串行收集使用单线程处理所有垃圾回收工作，因为无需多线程交互，实现容易，而且效率比较高。但是，其局限性也比较明显，即无法使用多处理器的优势，所以此收集适合单处理器机器。当然，此收集器也可以用在小数据量（100M左右）情况下的多处理器机器上。
    * 并行收集:并行收集使用多线程处理垃圾回收工作，因而速度快，效率高。而且理论上CPU数目越多，越能体现出并行收集器的优势。
    * 并发收集:用户线程和垃圾收集线程同时进行，此时用户线程也可以工作，垃圾收集线程在另一个CPU工作.相对于串行收集和并行收集而言，前面两个在进行垃圾回收工作时，需要暂停整个运行环境，而只有垃圾回收程序在运行，因此，系统在垃圾回收时会有明显的暂停，而且暂停时间会因为堆越大而越长。

* stop the world
    * 由于执行垃圾回收，用户线程无法执行，将会导致不可预知的错误，比如响应缓慢，任务超时等
    * 垃圾收集器应当尽量避免发生这种情况

**如何解决同时存在的对象创建和对象回收问题**
垃圾回收线程是回收内存的，而程序运行线程则是消耗（或分配）内存的，一个回收内存，一个分配内存，从这点看，两者是矛盾的。因此，在现有的垃圾回收方式中，要进行垃圾回收前，一般都需要暂停整个应用（即：暂停内存的分配），然后进行垃圾回收，回收完成后再继续应用。这种实现方式是最直接，而且最有效的解决二者矛盾的方式。

但是这种方式有一个很明显的弊端，就是当堆空间持续增大时，垃圾回收的时间也将会相应的持续增大，对应应用暂停的时间也会相应的增大。一些对相应时间要求很高的应用，比如最大暂停时间要求是几百毫秒，那么当堆空间大于几个G时，就很有可能超过这个限制，在这种情况下，垃圾回收将会成为系统运行的一个瓶颈。为解决这种矛盾，有了并发垃圾回收算法，使用这种算法，垃圾回收线程与程序运行线程同时运行。在这种方式下，解决了暂停的问题，但是因为需要在新生成对象的同时又要回收对象，算法复杂性会大大增加，系统的处理能力也会相应降低，同时，“碎片”问题将会比较难解决


#### 1.5.7.2. 垃圾收集器评价指标
<a href="#menu" style="float:right">目录</a>

* 吞吐量
    * 在应用程序的生命周期内，应用程序所花费的时间和系统总运行时间的比值。
* 垃圾回收器负载
    * 垃圾回收耗时和系统运行时间的比值
* 停顿时间
    * 垃圾回收式，应用线程停止的时间长度
* 垃圾回收频率
    * 指垃圾回收器多长时间运行一次，回收频率越低越好，可以减少总的停顿时间
* 反应时间
    * 指当一个对象称为垃圾后，多长时间内，它锁占据的内存空间会被释放
* 堆分配
    * 不同的垃圾回收器对堆内存的分配方式可能是不同的，一个良好的垃圾收集器应该有一个合理的堆内存区间划分

#### 1.5.7.3. 并行垃圾收集器&串行垃圾收集器&并发垃圾收集器
<a href="#menu" style="float:right">目录</a>

##### 1.5.7.3.1. 串行垃圾收集器

* 使用单线程处理所有的垃圾收集任务，导致的问题是STW时间变长。
* -XX:+UserSerialGC


##### 1.5.7.3.2. 并行垃圾收集器

* 每发生一次垃圾收集器，就会停掉所有的应用线程，并使用多线程处理垃圾回收任务。因此垃圾回收工作可以不受任何中断非常高效的完成。
* 并行垃圾回收器是为了应对服务端要求吞吐量最优化的使用场景。
* 在并行垃圾回收器中，年轻代和老年代的回收都是并行的。年轻代并行，但是老年代是单线程处理。而且会stop-the-world.老年代的回收还会同时进行压缩动作。压缩可以将相邻的对象移动到一起，以消除它们之间被浪费的空间。形成一个最理想的堆布局。然而压缩可能会花费较多的时间。
* 随着堆空间的增大以及老年代中存活对象的数量和大小不断增加，老年代收集的时间也越来越长，因此推出了增强型的并行垃圾收集器(JAVA 6)。年轻代和老年代都是多线程并行处理。降低了收集和压缩堆的时间开销。参数使用:-XX:+UseParalleOldGC.JDK 7U4中-XX:+UseParalleGC也会使能。

* 在以下场景中优先使用并行垃圾收集器
    * 对应用吞吐量的要求远远高于对延迟的要求
        * 批处理的应用就是一个例子，因为是非交互性质的，当你启动一个批量执行，你会希望它越快执行完越好
    * 如果能满足应用的最差延迟要求，并行垃圾收集器将提供最佳吞吐量。最差延迟要求包含两个方面:最差延迟时间和中断发生的频度，比如说，一个应用可能会有这样的延迟需求，超过500ms的暂停每两个小时不能多于1次，同时所有暂停不超过3s
    * 对于满足这些要求的应用来说，并行垃圾收集器可以工作得很好。但对于那些不满足要求的应用来说，暂停时间会变得很长，因为一次full GC必须标记整个Java堆空间，同时还要压缩老年代空间，导致一个结果就是随着Java堆空间的增大，暂停时间也会随之增加。


##### 1.5.7.3.3. 并发标记清除垃圾收集器CMS

* 并行垃圾收集器与CMS垃圾收集器主要的区别是在老年代的收集上。CMS收集器的老年代收集活动试图避免应用线程的长时间中断。
* 并发标记清除垃圾收集器是牺牲吞吐量，但是减少了停顿的时间。
* 

##### 1.5.7.3.4. 收集器概括总结

上面的收集器都有几个共同的问题。一个就是所有老年代收集器的大部分操作都必须扫描整个老年代空间，比如标记，清除以及压缩。这意味着执行工作的时间将随着Java堆空间的变化而线性地增加或者减少。另一个问题是因为年轻代和老年代是独立的连续内存块，所以要先决定年轻代和老年代放在虚拟地址空间的什么位置。


#### 1.5.7.4. Serial收集器
<a href="#menu" style="float:right">目录</a>

* 进行垃圾收集时，将会暂停其他工作线程，直到回收完成
* 这将导致出现"stop the world"问题，应用代码会发生不可预知的问题
* 桌面应用场景，分配内存不多，可以使用该垃圾收集器
* client 模式中比较好的选择

#### 1.5.7.5. ParNew收集器
<a href="#menu" style="float:right">目录</a>

* Serial收集器的多线程版本
* Server环境下比较好的新生代收集器
* 与CMS(老年代收集器)很好的配合
* 单CPU环境下，由于存在线程切换，因此效率可能会比Serial收集器低
* 参数配置
    * 配置-XX:+UseConcMarkSweepGC将默认新生代使用ParNew收集器
    * 也可以通过 -XX:+UseParNewGC进行配置
    * 通过-XX：ParallelGCThreads限制线程数


#### 1.5.7.6. Parallel Scavenge收集器
<a href="#menu" style="float:right">目录</a>

* 使用复制算法和多线程方式实现
* 目标是达到一个可控制的吞吐量，吞吐量=用户运行代码时间/(用户运行代码时间+垃圾收集时间)
* 参数配置
    * 控制垃圾收集最大停顿时间，-XX:MaxGCPauseMillis
        * 设置过小，将发生频繁的垃圾收集行为，因为每次只能收集很少的一部分，导致吞吐量降低
    * 设置吞吐量大小:-XX:GCTimeRation (0-100)
        


#### 1.5.7.7. Serial Old收集器
<a href="#menu" style="float:right">目录</a>

* 老年代单线程收集算法，使用标记整理
* 将会发生stop the world 问题

#### 1.5.7.8. Parallel Old收集器
<a href="#menu" style="float:right">目录</a>

* Parallel Scavenge收集器的老年代版本
* 使用标记整理算法

#### 1.5.7.9. CMS收集器
<a href="#menu" style="float:right">目录</a>

* CMS垃圾收集器3种基本操作
    * CMS收集器会对新生代对象进行回收(所有的应用线程都会停止)
    * CMS收集器会启动一个并发线程对老年代空间的垃圾进行回收
    * 如果有必要，CMS会发起Full GC

* CMS也是将Eden区和s区的对象移动到另一个s区或者老年代空间。


* 以获取最短停顿时间为目标的收集器，能够给用户带来更好的响应速度
* 标记清除算法
* 垃圾收集过程
    * 初始标记
        * 需要 stop the world
        * 找到堆中所有的垃圾回收根节点对象
        * 标记GC Roots能之间关联到的对象 
    * 并发标记
        * 应用线程可以执行
        * 仅仅是用于标记
        * 进行GC Roots Tracing 的过程
    * 重新标记
        * 修正并发标记期间由于用户线程工作而产生标记变动的那一部分对象的标记记录
        * 停顿时间比初始标记时间长，比并发标记时间短很多
    * 并发清除
        * 回收线程和应用线程一起工作
* 问题
    * 对CPU资源敏感
    * 无法处理浮动垃圾（Floating Garbage）,可能出现Concurrent Mode Failure失败而导致另一次Fullgc.
    * 使用标记清除算法，会产生比较多的垃圾碎片
        * 碎片过多，老年代没有空间分配，将会触发FULL GC。
        * -XX:UseCMSCompactAtFullCollection（默认开启）
            * FullGC时同时进行内存碎片整理，同时将导致停顿时间变长
        * -XX:CMSFullGCsBeforeCompaction
            * 执行多少次FullGC后才会进行内存碎片整理，默认为0  


### 1.5.8. G1收集器
<a href="#menu" style="float:right">目录</a>


#### 1.5.8.1. 综述
<a href="#menu" style="float:right">目录</a>

**垃圾回收的瓶颈**
传统分代垃圾回收方式，已经在一定程度上把垃圾回收给应用带来的负担降到了最小，把应用的吞吐量推到了一个极限。但是他无法解决的一个问题，就是Full GC所带来的应用暂停。在一些对实时性要求很高的应用场景下，GC暂停所带来的请求堆积和请求失败是无法接受的。这类应用可能要求请求的返回时间在几百甚至几十毫秒以内，如果分代垃圾回收方式要达到这个指标，只能把最大堆的设置限制在一个相对较小范围内，但是这样有限制了应用本身的处理能力，同样也是不可接收的。
分代垃圾回收方式确实也考虑了实时性要求而提供了并发回收器，支持最大暂停时间的设置，但是受限于分代垃圾回收的内存划分模型，其效果也不是很理想。
为了达到实时性的要求（其实Java语言最初的设计也是在嵌入式系统上的），一种新垃圾回收方式呼之欲出，它既支持短的暂停时间，又支持大的内存空间分配。可以很好的解决传统分代方式带来的问题。

**增量收集的演进**
增量收集的方式在理论上可以解决传统分代方式带来的问题。增量收集把对堆空间划分成一系列内存块，使用时，先使用其中一部分（不会全部用完），垃圾收集时把之前用掉的部分中的存活对象再放到后面没有用的空间中，这样可以实现一直边使用边收集的效果，避免了传统分代方式整个使用完了再暂停的回收的情况。当然，传统分代收集方式也提供了并发收集，但是他有一个很致命的地方，就是把整个堆做为一个内存块，这样一方面会造成碎片（无法压缩），另一方面他的每次收集都是对整个堆的收集，无法进行选择，在暂停时间的控制上还是很弱。而增量方式，通过内存空间的分块，恰恰可以解决上面问题。

**G1收集器**
* 支持很大的堆
* 高吞吐量
    * 支持多CPU和垃圾回收线程
    * 在主线程暂停的情况下，使用并行收集
    * 在主线程运行的情况下，使用并发收集
* 实时目标：可配置在N毫秒内最多只占用M毫秒的时间进行垃圾回收
当然G1要达到实时性的要求，相对传统的分代回收算法，在性能上会有一些损失

---

* JDK7+ 默认的垃圾收集器
* 场景
    * 垃圾收集线程和应用线程并发执行，和CMS一样
    * 空闲内存压缩时避免冗长的暂停时间
    * 应用需要更多可预测的GC暂停时间
    * 不希望牺牲太多的吞吐性能
    * 不需要很大的Java堆
* 特点
    * 并行性
        * G1在回收期间，可以由多个GC线程同时工作，有效利用多核计算能力
    * 并发性
        * G1拥有与应用程序交替执行的能力，部分工作可以和应用程序同时执行，因此不会在整个回收期间完全阻塞应用程序
    * 分代GC
        * G1仍然是一个分代收集器，但是和之前回收器不同，它同时兼顾年轻代和老年代。对比其他回收器，它们或者工作在年轻代，或者工作在老年代
    * 空间整理
        * G1在回收的过程中，会进行适当的对象移动，不像CMS，只是简单地标记清理对象，在若干次GC后，CMS必须进行一次碎片整理，而G1不同，它每次回收都有效地复制对象。减少空间碎片
    * 可预见性
        * 由于分区的原因，G1可以只选取部分区域进行内存回收，这样缩小了回收的范围，因此对于全局停顿也能得到较好的控制


**内存结构**
* 以往的垃圾回收算法，如CMS，使用的堆内存结构如下：
![](https://upload-images.jianshu.io/upload_images/2184951-f6a73e5ef608cfa8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1000/format/webp)
* 新生代：eden space + 2个survivor
* 老年代：old space
* 持久代：1.8之前的perm space
* 元空间：1.8之后的metaspace
这些space必须是地址连续的空间。

* 在G1算法中，采用了另外一种完全不同的方式组织堆内存，堆内存被划分为多个大小相等的内存块（Region），每个Region是逻辑连续的一段内存，结构如下：
![](https://upload-images.jianshu.io/upload_images/2184951-715388c6f6799bd9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1000/format/webp)

* 每个Region被标记了E、S、O和H，说明每个Region在运行时都充当了一种角色，其中H是以往算法中没有的，它代表Humongous，这表示这些Region存储的是巨型对象（humongous object，H-obj），当新建对象大小超过Region大小一半时，直接在新的一个或多个连续Region中分配，并标记为H。

**Region**
堆内存中一个Region的大小可以通过-XX:G1HeapRegionSize参数指定，大小区间只能是1M、2M、4M、8M、16M和32M，总之是2的幂次方，如果G1HeapRegionSize为默认值，则在堆初始化时计算Region的实践大小，具体实现如下：
![](https://upload-images.jianshu.io/upload_images/2184951-c6194652e3232be2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1000/format/webp)

默认把堆内存按照2048份均分，最后得到一个合理的大小。



G1可谓博采众家之长，力求到达一种完美。他吸取了增量收集优点，把整个堆划分为一个一个等大小的区域（region）。内存的回收和划分都以region为单位；同时，他也吸取了CMS的特点，把这个垃圾回收过程分为几个阶段，分散一个垃圾回收过程；而且，G1也认同分代垃圾回收的思想，认为不同对象的生命周期不同，可以采取不同收集方式，因此，它也支持分代的垃圾回收。为了达到对回收时间的可预计性，G1在扫描了region以后，对其中的活跃对象的大小进行排序，首先会收集那些活跃对象小的region，以便快速回收空间（要复制的活跃对象少了），因为活跃对象小，里面可以认为多数都是垃圾，所以这种方式被称为Garbage First（G1）的垃圾回收算法，即：垃圾优先的回收

* G1收集过程
    * 新生代GC
        * 新生代GC主要回收eden和survivor区，一旦eden区被占满，新生代GC就会启动
        * 回收后，所有的eden区都会被清空，s区会保留一部分数据，也就是至少存在一个survivor区，类比其他的新生代收集器
        * 老年代可能会增多，因为可能有部分eden和survivor区晋升为老年代
    * 并发标记周期
        * 初始标记
            * 标记从根节点直接可达的对象。这个阶段会伴随一次新生代GC，它是会产生全局停顿的，应用程序线程在这个阶段必须停止执行
        * 根区域扫描
            * 由于初始初始标记会伴随一次新生代GC，所以在初始化后，eden被清空，并且存活对象被移动到survivor区。
            * 在这个阶段，将扫描由survivor区直接可达的老年代区域，并且标记这些可达的对象。
            * 这个过程是可以和应用程序并发执行的，但是根区域扫描不能和新生代GC同时执行(因为根区域扫描依赖survivor区的对象，而新生代GC会修改这个区域)，因此如果恰巧在此时需要进行新生代GC，GC就需要等待根区域扫描结束后才能进行，如果发生这种情况，这次新生代GC的时间就会延长。
        * 并发标记
            * 和CMS类似，并发标记会扫描整个堆的存活对象，并做好标记，这是一个并发的过程，并且这个过程可以被一次新生代GC打断
        * 重新标记
            * 和CMS一样，重新标记也会产生应用程序停顿
            * 由于并发标记过程中，应用程序依然在运行，因此标记结果可能要进行修正，所以在此对上一次标记的结果进行补充。
            * 在G1中，这个过程使用SATB(Snapshot-At-The-Beginning算法完成，即G1会在标记之初为存活对象创建一个快照，这个快照有助于加速重新标记的速度
        * 独占清理
            * 这个阶段会引起停顿的
            * 它将计算各个区域的存活对象和GC回收比例并进行排序，识别可供混合回收的区域，在这个阶段，还会更新记忆集
            * 该阶段给出了需要被混合回收的区域并进行了标记，在混合回收阶段，需要这些信息。
        * 并发清理
            * 这里会识别并清理完全空闲的区域，它是并发的清理，不会出现停顿
    * 混合回收
        * 在并发标记周期中，虽然有部分对象被回收，但是总体上，回收的比例是相当低的。
        * 但是在并发标记周期后，G1已经明确哪些区域含有较多的垃圾对象，在混合回收阶段，就可以专门针对这些区域进行回收。
        * 当然，G1会优先回收垃圾比例较高的区域，因此回收这些区域的性价比也比较高。
        * 这个阶段叫做含混和回收，是因为在这个阶段，既会执行正常的年轻代GC，又会选取一些被标记的老年代进行回收，它同时处理了新生代和老年代。
    * 如果需要，可能会进行Full GC
        * 和CMS类似，并发收集由于让应用程序和GC线程交替工作，因此总是不能完全避免在特别繁忙的场合会出现在回收过程中内存不充足的情况。当遇到这种情况时，G1也会转入一个FullGC进行回收




* 回收步骤
    * **初始标记（Initial Marking）**
        * G1对于每个region都保存了两个标识用的bitmap，一个为previous marking bitmap，一个为nextmarking bitmap，bitmap中包含了一个bit的地址信息来指向对象的起始点
        * 开始Initial Marking之前，首先并发的清空next marking bitmap，然后停止所有应用线程，并扫描标识出每个region中root可直接访问到的对象，将region中top的值放入next top at mark start（TAMS）中，之后恢复所有应用线程。
        * 触发这个步骤执行的条件为：
            * G1定义了一个JVM Heap大小的百分比的阀值，称为h，另外还有一个H，H的值为(1-h)*HeapSize，目前这个h的值是固定的，后续G1也许会将其改为动态的，根据jvm的运行情况来动态的调整，在分代方式下，G1还定义了一个u以及soft limit，soft limit的值为H-u*Heap Size，当Heap中使用的内存超过了soft limit值时，就会在一次clean up执行完毕后在应用允许的GC暂停时间范围内尽快的执行此步骤；
            * 在pure方式下，G1将marking与clean up组成一个环，以便clean up能充分的使用marking的信息，当clean up开始回收时，首先回收能够带来最多内存空间的regions，当经过多次的clean up，回收到没多少空间的regions时，G1重新初始化一个新的marking与clean up构成的环。

    * **并发标记（Concurrent Marking）**
        * 按照之前Initial Marking扫描到的对象进行遍历，以识别这些对象的下层对象的活跃状态，对于在此期间应用线程并发修改的对象的以来关系则记录到remembered set logs中，新创建的对象则放入比top值更高的地址区间中，这些新创建的对象默认状态即为活跃的，同时修改top值。
    * **最终标记暂停（Final Marking Pause）**
        * 当应用线程的remembered set logs未满时，是不会放入filled RS buffers中的，在这样的情况下，这些remebered set logs中记录的card的修改就会被更新了，因此需要这一步，这一步要做的就是把应用线程中存在的remembered set logs的内容进行处理，并相应的修改remembered sets，这一步需要暂停应用，并行的运行。
        
**存活对象计算及清除（Live Data Counting and Cleanup）**
值得注意的是，在G1中，并不是说Final Marking Pause执行完了，就肯定执行Cleanup这步的，由于这步需要暂停应用，G1为了能够达到准实时的要求，需要根据用户指定的最大的GC造成的暂停时间来合理的规划什么时候执行Cleanup，另外还有几种情况也是会触发这个步骤的执行的：G1采用的是复制方法来进行收集，必须保证每次的”to space”的空间都是够的，因此G1采取的策略是当已经使用的内存空间达到了H时，就执行Cleanup这个步骤；

对于full-young和partially-young的分代模式的G1而言，则还有情况会触发Cleanup的执行，fullyoung模式下，G1根据应用可接受的暂停时间、回收young regions需要消耗的时间来估算出一个yound regions的数量值，当JVM中分配对象的young regions的数量达到此值时，Cleanup就会执行；partially-young模式下，则会尽量频繁的在应用可接受的暂停时间范围内执行Cleanup，并最大限度的去执行non-young regions的Cleanup


#### 1.5.8.2. 完整的G1垃圾收集日志

```
-Xms80m -Xmx100m -Xmn40m  -XX:+PrintHeapAtGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseG1GC
```
1. 如果设置PrintHeapAtGC参数,则HotSpot在GC前后都会将GC堆的概要状况输出到log中
```
//前
{Heap before GC invocations=0 (full 0):
 garbage-first heap   total 81920K, used 2048K [0x00000000f9c00000, 0x00000000f9d00280, 0x0000000100000000)
  region size 1024K, 3 young (3072K), 0 survivors (0K)
 Metaspace       used 3036K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 332K, capacity 388K, committed 512K, reserved 1048576K

//后
Heap after GC invocations=1 (full 0):
 garbage-first heap   total 81920K, used 460K [0x00000000f9c00000, 0x00000000f9d00280, 0x0000000100000000)
  region size 1024K, 1 young (1024K), 1 survivors (1024K)
 Metaspace       used 3036K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 332K, capacity 388K, committed 512K, reserved 1048576K
}

```

2. -XX:+PrintGCDetails 打印GGC时的详细日志

3. -XX:+PrintGCTimeStamps 打印gc时已经启动的时间

4. -XX:+UseG1GC 使用G1收集器

```
{Heap before GC invocations=0 (full 0):
 garbage-first heap   total 81920K, used 2048K [0x00000000f9c00000, 0x00000000f9d00280, 0x0000000100000000)
  region size 1024K, 3 young (3072K), 0 survivors (0K)
 Metaspace       used 3036K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 332K, capacity 388K, committed 512K, reserved 1048576K
1.222: [GC pause (G1 Humongous Allocation) (young) (initial-mark), 0.0020575 secs]
   [Parallel Time: 1.5 ms, GC Workers: 4]
      [GC Worker Start (ms): Min: 1221.8, Avg: 1221.9, Max: 1221.9, Diff: 0.1]
      [Ext Root Scanning (ms): Min: 0.5, Avg: 0.7, Max: 1.4, Diff: 0.9, Sum: 3.0]
      [Update RS (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
         [Processed Buffers: Min: 0, Avg: 0.0, Max: 0, Diff: 0, Sum: 0]
      [Scan RS (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
      [Code Root Scanning (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
      [Object Copy (ms): Min: 0.0, Avg: 0.5, Max: 0.7, Diff: 0.7, Sum: 2.1]
      [Termination (ms): Min: 0.0, Avg: 0.1, Max: 0.2, Diff: 0.2, Sum: 0.5]
         [Termination Attempts: Min: 1, Avg: 1.0, Max: 1, Diff: 0, Sum: 4]
      [GC Worker Other (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.1]
      [GC Worker Total (ms): Min: 1.4, Avg: 1.4, Max: 1.4, Diff: 0.1, Sum: 5.6]
      [GC Worker End (ms): Min: 1223.3, Avg: 1223.3, Max: 1223.3, Diff: 0.0]
   [Code Root Fixup: 0.0 ms]
   [Code Root Purge: 0.0 ms]
   [Clear CT: 0.1 ms]
   [Other: 0.5 ms]
      [Choose CSet: 0.0 ms]
      [Ref Proc: 0.3 ms]
      [Ref Enq: 0.0 ms]
      [Redirty Cards: 0.1 ms]
      [Humongous Register: 0.0 ms]
      [Humongous Reclaim: 0.0 ms]
      [Free CSet: 0.0 ms]
   [Eden: 3072.0K(40.0M)->0.0B(39.0M) Survivors: 0.0B->1024.0K Heap: 2562.0K(80.0M)->461.0K(80.0M)]
Heap after GC invocations=1 (full 0):
 garbage-first heap   total 81920K, used 460K [0x00000000f9c00000, 0x00000000f9d00280, 0x0000000100000000)
  region size 1024K, 1 young (1024K), 1 survivors (1024K)
 Metaspace       used 3036K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 332K, capacity 388K, committed 512K, reserved 1048576K
}
 [Times: user=0.00 sys=0.00, real=0.01 secs] 
1.224: [GC concurrent-root-region-scan-start]
1.225: [GC concurrent-root-region-scan-end, 0.0008394 secs]
1.225: [GC concurrent-mark-start]
1.225: [GC concurrent-mark-end, 0.0000886 secs]
1.248: [GC remark 1.248: [Finalize Marking, 0.0001961 secs] 1.248: [GC ref-proc, 0.0001534 secs] 1.248: [Unloading, 0.0007679 secs], 0.0013138 secs]
 [Times: user=0.00 sys=0.01, real=0.00 secs] 
1.249: [GC cleanup 50M->50M(80M), 0.0002353 secs]
 [Times: user=0.00 sys=0.00, real=0.00 secs] 

```


1. 表示应用程序在开启1.222秒时发生了一次新生代的GC，这是在初始标记时发生的，耗时0.0020575 secs，意味着应用程序暂停了0.0020575 secs
```
1.222: [GC pause (G1 Humongous Allocation) (young) (initial-mark), 0.0020575 secs]
```
2. 表示GC线程总的花费时间，这里为1.5ms

```
[Parallel Time: 1.5 ms, GC Workers: 4]
```
3. 给出每一个GC线程的执行情况。diff表示最大值和最小值的差值

```
[GC Worker Start (ms): Min: 1221.8, Avg: 1221.9, Max: 1221.9, Diff: 0.1]
```
4. 根扫描的耗时
```
[Ext Root Scanning (ms): Min: 0.5, Avg: 0.7, Max: 1.4, Diff: 0.9, Sum: 3.0]
```

5. 更新记忆集(Remembered Sets)的耗时
```
[Update RS (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
         [Processed Buffers: Min: 0, Avg: 0.0, Max: 0, Diff: 0, Sum: 0]
```

记忆集是G1中维护一个数据结构，简称RS.每一个G1区域都有一个RS与其关联。由于G1回收时，是按照区域回收的，比如在回收区域A的对象时，很可能并不回收区域B的对象。此时，为了回收区域A的对象，要扫描区域B甚至整个堆区来判定区域A的对象是否可达，这样的代价很大。因此G1在A的RS中，记录了在区域A中被其他区域引用的对象，这样在回收A时，只要将RS视为A根集的一部分即可，从而可以避免做整个堆的扫描。由于系统在运行的过程中，对象的引用关系是时刻变化的，因此为了更加高效地跟踪这些引用关系，会将这些变化记录在Update Buffers中。这里的Processed Buffers 指的是处理这些Update Buffers数据。

6.  扫描RS的时间

```
[Scan RS (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.0]
```

7. 在正式回收时，G1会对被回收区域的对象进行疏散，即将存活对象放置在其他区域中，因此需要进行对象的复制

```
[Object Copy (ms): Min: 0.0, Avg: 0.5, Max: 0.7, Diff: 0.7, Sum: 2.1]
```

8. GC工作线程的终止信息

这里的终止时间是线程花在终止阶段的耗时。在GC线程终止前，它们会检查其他GC线程的工作队列，查看是否仍然还有对象引用没有处理完，如果其他线程仍然有没有处理完的数据，请求终止的GC线程就会帮助它尽快完成，随后后，再尝试终止，其中Termination Attempts展示了每一个工作线程尝试终止的次数

```
[Termination (ms): Min: 0.0, Avg: 0.1, Max: 0.2, Diff: 0.2, Sum: 0.5]
         [Termination Attempts: Min: 1, Avg: 1.0, Max: 1, Diff: 0, Sum: 4]
```

9. 
* GC工作线程花费在其他任务中的耗时
* GC工作线程存活时间
* GC工作线程完成时间

```
[GC Worker Other (ms): Min: 0.0, Avg: 0.0, Max: 0.0, Diff: 0.0, Sum: 0.1]
[GC Worker Total (ms): Min: 1.4, Avg: 1.4, Max: 1.4, Diff: 0.1, Sum: 5.6]
[GC Worker End (ms): Min: 1223.3, Avg: 1223.3, Max: 1223.3, Diff: 0.0]
```

10. 清空CardTable的时间,RS就是依靠CardTable来记录哪些是存活的对象

```
[Clear CT: 0.1 ms]
```

11. 显示了其他几个任务的耗时

```
[Other: 0.5 ms]
        //选择Collection Set的时间
      [Choose CSet: 0.0 ms]
      //处理弱引用，软引用的时间
      [Ref Proc: 0.3 ms]
      //弱引用软引用入队的时间
      [Ref Enq: 0.0 ms]
      [Redirty Cards: 0.1 ms]
      [Humongous Register: 0.0 ms]
      [Humongous Reclaim: 0.0 ms]
      //释放被回收的CSet中区域的时间
      [Free CSet: 0.0 ms]
```

12. 垃圾收集堆变化情况

(40.0M)->0.0B(39.0M) --》回收前->回收后(可用空间)
```
 [Eden: 3072.0K(40.0M)->0.0B(39.0M) Survivors: 0.0B->1024.0K Heap: 2562.0K(80.0M)->461.0K(80.0M)]
Heap after GC invocations=1 (full 0):
 garbage-first heap   total 81920K, used 460K [0x00000000f9c00000, 0x00000000f9d00280, 0x0000000100000000)
  region size 1024K, 1 young (1024K), 1 survivors (1024K)
 Metaspace       used 3036K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 332K, capacity 388K, committed 512K, reserved 1048576K
```
#### 1.5.8.3. G1相关参数
<a href="#menu" style="float:right">目录</a>

* -XX:+UseG1GC
    * 启用G1垃圾收集器
* -XX:G1HeapRegionSize=n
    * 区域的大小。值是2的幂，范围是1 MB到32 MB之间。目标是根据最小的Java 堆大小划分出约 2048 个区域。这个值的默认值是根据堆的大小决定的。
* -XX:MaxGCPauseMillis=200
    * 最长暂停时间设置目标值。默认值是200 毫秒。
* -XX:InitiatingHeapOccupancyPercent=45
    * 触发标记周期的Java堆占用率阈值。默认占用率是整个Java堆的 45%。
* -XX:G1ReservePercent=10
    * 作为空闲空间的预留内存百分比，以降低目标空间溢出的风险。默认值是10%。保留的空间用于年代之间的提升，注意这个空间保留后就不会用在年轻代。
* -XX:G1HeapWastePercent=5
    * 可容忍的浪费堆空间百分比。如果可回收百分比小于该设置的百分比，JVM不会启动混合垃圾回收周期。
* -XX:G1MixedGCCountTarget=8
    * 标记周期完成后，对要执行垃圾回收的候选old区域收集完毕需要执行Mixed GC的目标次数。默认值是8。MixedGC的目标是要控制在此目标次数以内完成对上次标记周期标记出的候选old region的回收。该值设置过小，会导致每次Mixed GC疏散的old region数量过多，导致停顿时间变长。该值可以限制每次Mixed GC最少要回收的old region数量。
* -XX:G1OldCSetRegionThresholdPercent=10
    * 混合垃圾收集期间，每次能进入CSet的old region的最大阈值（进入CSet表示要垃圾收集）。默认值是Java堆的 10%。如果该值设置过大，则每次Mixed GC需要疏散的old region数量会变多，导致停顿时间拉长。该值可以限制每次Mixed GC最多能回收的old region数量。
* -XX:ParallelGCThreads=n
    * STW时并行工作的线程数。一般可以将 n 的值设置为逻辑处理器数的 5/8 左右。
* -XX:ConcGCThreads=n
    * 并行标记的线程数。可以将 n 设置为并行垃圾回收线程数 (ParallelGCThreads) 的 1/4 左右。
* -XX:+ParallelRefProcEnabled
    * 并行处理Ref Proc阶段，默认HotSpot使用单线程处理引用对象。
* -XX:+UnlockExperimentalVMOptions
    * 要更改实验性标志的值，必须先对其解锁。显式地设置该参数。
* -XX:G1NewSizePercent=5
    * 设置年轻代大小最小值的堆百分比。默认值是Java 堆的5%。这是一个实验性的标志。
* -XX:G1MaxNewSizePercent=60
    * 设置要用作年轻代大小最大值的堆大小百分比。默认值是Java堆的 60%。这是一个实验性的标志。
* -XX:+G1PrintRegionLivenessInfo
    * 打印堆内存里每个Region的存活对象信息。这个信息在标记结束后打印出来。这是一个实验性的标志。
* -XX:+G1TraceConcRefinement
    * 如果启用，并行回收阶段的日志就会被详细打印出来；这是一个实验性的标志。
* -XX:+G1TraceEagerReclaimHumongousObject
    * 如果启用，会打印大对象的回收日志；这是一个实验性的标志。
* -XX:+UseStringDeduplication
    * 开启Java String对象的分割工作，这个是JDK8u20之后新增的参数，主要用于相同String避免重复申请内存，节约Region的使用。
* -XX:G1MixedGCLiveThresholdPercent=85
    * 在并发标记阶段怎么识别old region需要被回收而标记成candidate old region，以便在Mixed GC阶段进入CSet而被回收呢？是通过G1MixedGCLiveThresholdPercent来控制的，当region中的存活数据占比率不超过该阈值时，则表示要被回收，默认占用率为85%。
    * 在并发标记阶段每个region中的存活数据占比率会被重新计算，那些存活数据占比较多的region，疏散时的代价相对较昂贵，它们还会被标记为expensive region。如果在MixedGC阶段这种region大量进入CSet中可能会导致MixedGC的停顿时间过长。G1为了区分开这些region而做了分开标记，在MixedGC阶段优先回收candidate old region，如果代价许可，会尝试回收expensive region。


### 1.5.9. 深入G1垃圾收集器
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.1. 背景
<a href="#menu" style="float:right">目录</a>

* 是一种压缩型收集器。基本原则是首先收集尽可能多的垃圾。G1 GC有增量并行的STW方式的暂停，它是通过拷贝的方式来实现压缩，同时还有并行的多级并发标记，这有助于将标记、重新标记、以及因清除导致的暂停减少到最小程度。

* HotSpot将传统的各个代必须相邻的堆布局方式，改变为现在这种由多个不相邻分区组合而成的方式。因此，对于一个有效的Java堆。特定的分区既可以是eden,也可以是survicor或老年代的组成部分，或者成为一个巨型分区，甚至是个空闲分区。这些分区汇集起来组成一个逻辑上的代，这个代也符合过去HotSpot垃圾收集器中对代空间概念的常规定义。

#### 1.5.9.2. G1中的垃圾收集
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.3. 年轻代
<a href="#menu" style="float:right">目录</a>

G1垃圾收集器是一种分代卡及收集器，它由年轻代和老年代组成。除了一些例外的情况，比如巨型对象本身，还有那些小于巨型对象但依然很大，以至于无法放入分配线程的本地分配缓冲区(TLAB)的对象，大部分特定线程的分配结果则都将落到线程的TLAB中。因为独享的Java线程

#### 1.5.9.4. 年轻代收集暂停
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.5. 对象老化以及老年代
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.6. 巨型区分
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.7. 混合收集
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.8. 收集集合及其重要性
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.9. 并发优化线程以及栅栏
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.10. G1 GC的并发标记
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.11. 并发标记阶段
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.12. 初始标记 
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.13. 根分区扫描
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.14. 并发标记
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.15. 重新标记
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.16. 清除
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.17. 转移失败与FULL收集
<a href="#menu" style="float:right">目录</a>




### 1.5.10. G1性能优化
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.1. 年轻代收集的各阶段
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.2. 所有并行活动的开始
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.3. 外部根分区
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.4. 已记忆集合总结
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.5. 转移和回收 
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.6. 终止
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.7. GC外部的并行活动
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.8. 所有并行活动总结
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.9. 其他串行活动
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.10. 年轻代优化
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.11. 并发标记阶段调优
<a href="#menu" style="float:right">目录</a>


#### 1.5.10.12. 混合垃圾收集阶段回顾
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.13. 混合垃圾收集阶段调优
<a href="#menu" style="float:right">目录</a>


#### 1.5.10.14. 避免转移失败   
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.15. 引用处理
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.16. 观察引用处理
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.17. 引用处理调优
<a href="#menu" style="float:right">目录</a>



### 1.5.11. GC模式
<a href="#menu" style="float:right">目录</a>

G1中提供了三种模式垃圾回收模式，young gc、mixed gc 和 full gc，在不同的条件下被触发。



### 1.5.12. 内存分配和回收策略
<a href="#menu" style="float:right">目录</a>

* 大多数情况下，对象优先在Eden区中分配，当Eden中没有足够空间，虚拟机将发生一次minor GC.
* 大对象（需要大量连续内存空间的Java对象，比如长字符串和数组）直接进入老年代
* 长期存活的对象将进入老年代
    * 虚拟机给每一个对象定义了一个Age年龄计数器，每经过一次Minor GC.年龄增加1,超过阈值将被移动到老年代，默认是15岁。
* 动态对象年龄判定
    * 如果Survivor空间中相同年龄的对象大小的总和大于Survivor空间中总和的一半，则年龄大于或者和等于该年龄的对象则直接进入老年代，不受上面年龄阈值的限制
* 空间分配担保
    * 为什么要进行老年代担保
        * Minor GC最差的情况就是垃圾收集完所有的对象都存活，此时将超过 survivor空间，导致这些对象进入老年代，最终可能导致OOM
    * 在Minor GC之前，虚拟机会先检查老年代最大可用的连续空间是否大于新生代所有对象的空间。
        * 如果成立，那么Minor GC就确认是安全的
        * 如果不成立，那么Minor GC就是不安全的
            * 检查HandlerPromotionFailure是否允许担保失败
                * 如果允许，继续检查老年代最大的连续空间是否大于历次晋升到老年代对象的平均大小，如果大于，则进行Monor GC,尽管存在风险。
                * 如果不允许，那么则进行一次Full GC
                



### 1.5.13. JVM相关参数介绍
<a href="#menu" style="float:right">目录</a>

**JVM内存参数设置**             
* -Xms设置堆的最小空间大小。
* -Xmx设置堆的最大空间大小。
* -Xmn:设置年轻代大小
* -XX:NewSize设置新生代最小空间大小。
* -XX:MaxNewSize设置新生代最大空间大小。
* -XX:PermSize设置永久代最小空间大小。
* -XX:MaxPermSize设置永久代最大空间大小。
* -Xss设置每个线程的堆栈大小
* -XX:+UseParallelGC:选择垃圾收集器为并行收集器。此配置仅对年轻代有效。即上述配置下,年轻代使用并发收集,而年老代仍旧使用串行收集。
* -XX:ParallelGCThreads=20:配置并行收集器的线程数,即:同时多少个线程一起进行垃圾回收。此值最好配置与处理器数目相等。

```
java -Xmx3550m -Xms3550m -Xmn2g –Xss128k
```

**收集器设置**
* -XX:+UseSerialGC:设置串行收集器
* -XX:+UseParallelGC:设置并行收集器
* -XX:+UseParalledlOldGC:设置并行年老代收集器
* -XX:+UseConcMarkSweepGC:设置并发收集器

**垃圾回收统计信息**
* -XX:+PrintGC
* -XX:+PrintGCDetails
* -XX:+PrintGCTimeStamps
* -Xloggc:filename

**并行收集器设置**
* -XX:ParallelGCThreads=n:设置并行收集器收集时使用的CPU数。并行收集线程数。
* -XX:MaxGCPauseMillis=n:设置并行收集最大暂停时间
* -XX:GCTimeRatio=n:设置垃圾回收时间占程序运行时间的百分比。公式为1/(1+n)

**并发收集器设置**
* -XX:+CMSIncrementalMode:设置为增量模式。适用于单CPU情况。
* -XX:ParallelGCThreads=n:设置并发收集器年轻代收集方式为并行收集时，使用的CPU数。并行收集线程数。

除少数例外外，大多数参数都是以下格式
* 布尔标志
    * -XX：+FlagName 标识开启
    * -XX：-FlagName 标识关闭
* 属性参数
    * -XX:FlagName=xxx

**内存管理参数**
|参数|默认值|说明 |
|---|---|---|

**即时编译参数**
|参数|默认值|说明 |
|---|---|---|

**类型加载参数**
|参数|默认值|说明 |
|---|---|---|

**多线程相关参数**
|参数|默认值|说明 |
|---|---|---|

**性能参数**
|参数|默认值|说明 |
|---|---|---|

**调试参数**
|参数|默认值|说明 |
|---|---|---|


### 1.5.14. 调优总结
<a href="#menu" style="float:right">目录</a>

**年轻代大小选择**
* 响应时间优先的应用：尽可能设大，直到接近系统的最低响应时间限制（根据实际情况选择）。在此种情况下，年轻代收集发生的频率也是最小的。同时，减少到达年老代的对象。
* 吞吐量优先的应用：尽可能的设置大，可能到达Gbit的程度。因为对响应时间没有要求，垃圾收集可以并行进行，一般适合8CPU以上的应用。

**年老代大小选择**
响应时间优先的应用：年老代使用并发收集器，所以其大小需要小心设置，一般要考虑并发会话率和会话持续时间等一些参数。如果堆设置小了，可以会造成内存碎片、高回收频率以及应用暂停而使用传统的标记清除方式；如果堆大了，则需要较长的收集时间。最优化的方案，一般需要参考以下数据获得：
1. 并发垃圾收集信息
2. 持久代并发收集次数
3. 传统GC信息
4. 花在年轻代和年老代回收上的时间比例
减少年轻代和年老代花费的时间，一般会提高应用的效率

**吞吐量优先的应用**
一般吞吐量优先的应用都有一个很大的年轻代和一个较小的年老代。原因是，这样可以尽可能回收掉大部分短期对象，减少中期的对象，而年老代尽存放长期存活对象。

**较小堆引起的碎片问题**
因为年老代的并发收集器使用标记、清除算法，所以不会对堆进行压缩。当收集器回收时，他会把相邻的空间进行合并，这样可以分配给较大的对象。但是，当堆空间较小时，运行一段时间以后，就会出现“碎片”，如果并发收集器找不到足够的空间，那么并发收集器将会停止，然后使用传统的标记、清除方式进行回收。如果出现“碎片”，可能需要进行如下配置：
1. -XX:+UseCMSCompactAtFullCollection：使用并发收集器时，开启对年老代的压缩。
2. -XX:CMSFullGCsBeforeCompaction=0：上面配置开启的情况下，这里设置多少次Full GC后，对年老代进行压缩



### 1.5.15. 性能监控与故障处理工具
<a href="#menu" style="float:right">目录</a>

#### 1.5.15.1. JDK命令行工具
<a href="#menu" style="float:right">目录</a>


| 场 景 |命 令|
|---|---|
|没有源码的 Jar包出 了问题、破解别人的代码、新上线的代码不符合预期 |jad
|线上出问题，无法增加日志、无法线上调试，需要实现切面功能| btrace
|内存不足、 OutOfMemoryError |Jmap
|内存不足、 OutO伽lemoryE盯or、 GC 频繁、服务超时、出现长尾 II向应现象| jstat
|服务超时、钱程卡死、线程死锁、服务器负载高 |jstack
|查看或者修改 Java 进程的环境变量和 Java 虚拟机变量 |jinfo
|使用 JN（开发 Java 本地程序库| javah
|查找 Java 进程 ID |JPS
|分析 jmap 产生的 Java 堆的快照 |jhat
|QA 环境无法重现，需要在准生产线上远程调试 |jdb
|与 jstat 相同，是 jstat 的服务器版本，但是可以在线下用客户端连接，可线下操作 |jstatd
|简单的有界面的内存分析工具，是 JDK 自带的，已被 JvisualVM 取代 |JConsole
|全面的有界面的内存分析工具，功能丰富， JDK 自带 |JVisualVM
|专业的 Java 进程性能分析和跟踪工具 |JMAT
|商业化的 Java 进程性能分析和跟踪工具 |JProfile


##### 1.5.15.1.1. javap
* 反编译工具,可用来查看java编译器生成的字节码
    * -help 帮助
    * -l 输出行和变量的表
    * -public 只输出public方法和域
    * -protected 只输出public和protected类和成员
    * -package 只输出包，public和protected类和成员，这是默认的
    * -p -private 输出所有类和成员
    * -s 输出内部类型签名
    * -c 输出分解后的代码，例如，类中每一个方法内，包含java字节码的指令
    * -verbose 输出栈大小，方法参数的个数
    * -constants 输出静态final常量
    
##### 1.5.15.1.2. 查看Java进程 jps
* 虚拟机进程状况工具

```
usage: jps [-help]
       jps [-q] [-m | -l|-v|-V] [<hostid>]

Definitions:
    <hostid>:      <hostname>[:<port>]
    
```
-q: 只输出进程ID
-m：传递给main函数的参数
-l:输出主函数的完整路径
-v：传递给虚拟机的参数

##### 1.5.15.1.3. 查看虚拟机运行时些信息jstat
* 虚拟机统计信息监视工具
```
Usage: jstat -help|-options
       jstat -<option> [-t] [-h<lines>] <vmid> [<interval> [<count>]]

Definitions:
  <option>      An option reported by the -options option
  <vmid>        Virtual Machine Identifier. A vmid takes the following form:
                     <lvmid>[@<hostname>[:<port>]]
                Where <lvmid> is the local vm identifier for the target
                Java virtual machine, typically a process id; <hostname> is
                the name of the host running the target Java virtual machine;
                and <port> is the port number for the rmiregistry on the
                target host. See the jvmstat documentation for a more complete
                description of the Virtual Machine Identifier.
  <lines>       Number of samples between header lines.
  <interval>    Sampling interval. The following forms are allowed:
                    <n>["ms"|"s"]
                Where <n> is an integer and the suffix specifies the units as 
                milliseconds("ms") or seconds("s"). The default units are "ms".
  <count>       Number of samples to take before terminating.
  -J<flag>      Pass <flag> directly to the runtime system.
```

Jstat是JDK自带的一个轻量级小工具。全称“Java Virtual Machine statistics monitoring tool”，它位于java的bin目录下，主要利用JVM内建的指令对Java应用程序的资源和性能进行实时的命令行的监控，包括了对Heap size和垃圾回收状况的监控。可见，Jstat是轻量级的、专门针对JVM的工具，非常适用。

jstat工具特别强大，有众多的可选项，详细查看堆内各个部分的使用量，以及加载类的数量。使用时，需加上查看进程的进程id，和所选参数。参考格式如下：

jstat -options 



可以列出当前JVM版本支持的选项，常见的有

* options
    * class (类加载器) 
    * compiler (JIT) 
    * gc (GC堆状态) 
    * gccapacity (各区大小) 
    * gccause (最近一次GC统计和原因) 
    * gcnew (新区统计)
    * gcnewcapacity (新区大小)
    * gcold (老区统计)
    * gcoldcapacity (老区大小)
    * gcpermcapacity (永久区大小)
    * gcutil (GC统计汇总)
    * printcompilation (HotSpot编译统计)
* 其他参数
    * -t: 显示程序的运行时间
    * -h: 指定周期性输出多少行数据后跟着输出一个表头信息
    * interval: 周期输出间隔时间    
    * count：指定输出的行数

* jstat –class < pid> : 显示加载class的数量，及所占空间等信息。
    * Loaded
        * 装载的类的数量
    * Bytes
        * 装载类所占用的字节数
    * Unloaded
        * 卸载类的数量
    * Bytes
        * 卸载类的字节数
    * Time
        * 装载和卸载类所花费的时间

* jstat -compiler < pid>显示VM实时编译的数量等信息。
    * Compiled
        * 编译任务执行数量
    * Failed
        * 编译任务执行失败数量
    * Invalid  
        * 编译任务执行失效数量
    * Time  
        * 编译任务消耗时间
    * FailedType
        * 最后一个编译失败任务的类型
    * FailedMethod
        * 最后一个编译失败任务所在的类及方法

* jstat -gc < pid>: 可以显示gc的信息，查看gc的次数，及时间。
    * S0C   
        * 年轻代中第一个survivor（幸存区）的容量 (字节)
    * S1C   
        * 年轻代中第二个survivor（幸存区）的容量 (字节)
    * S0U   
        * 年轻代中第一个survivor（幸存区）目前已使用空间 (字节)
    * S1U     
        * 年轻代中第二个survivor（幸存区）目前已使用空间 (字节)
    * EC      
        * 年轻代中Eden（伊甸园）的容量 (字节)
    * EU       
        * 年轻代中Eden（伊甸园）目前已使用空间 (字节)
    * OC        
        * Old代的容量 (字节)
    * OU      
        * Old代目前已使用空间 (字节)
    * MC    
        * Metadata的容量 (字节)
    * MU
        * Metadata目前已使用空间 (字节)
    * YGC    
        * 从应用程序启动到采样时年轻代中gc次数
    * YGCT   
        * 从应用程序启动到采样时年轻代中gc所用时间(s)
    * FGC   
        * 从应用程序启动到采样时old代(全gc)gc次数
    * FGCT    
        * 从应用程序启动到采样时old代(全gc)gc所用时间(s)
    * GCT
        * 从应用程序启动到采样时gc用的总时间(s)

* jstat -gccapacity < pid>:可以显示，VM内存中三代（young,old,perm）对象的使用和占用大小
    * NGCMN   
        * 年轻代(young)中初始化(最小)的大小(字节)
    * NGCMX    
        * 年轻代(young)的最大容量 (字节)
    * NGC    
        * 年轻代(young)中当前的容量 (字节)
    * S0C  
        * 年轻代中第一个survivor（幸存区）的容量 (字节)
    * S1C      
        * 年轻代中第二个survivor（幸存区）的容量 (字节)
    * EC     
        * 年轻代中Eden（伊甸园）的容量 (字节)
    * OGCMN     
        * old代中初始化(最小)的大小 (字节)
    * OGCMX      
        * old代的最大容量(字节)
    * OGC
        * old代当前新生成的容量 (字节)
    * OC     
        * Old代的容量 (字节)
    * PGCMN   
        * perm代中初始化(最小)的大小 (字节)
    * PGCMX    
        * perm代的最大容量 (字节)  
    * PGC      
        * perm代当前新生成的容量 (字节)
    * PC    
        * Perm(持久代)的容量 (字节)
    * YGC   
        * 从应用程序启动到采样时年轻代中gc次数
    * FGC
        * 从应用程序启动到采样时old代(全gc)gc次数

* jstat -gcutil < pid>:统计gc信息
    * S0    
        * 年轻代中第一个survivor（幸存区）已使用的占当前容量百分比
    * S1    
        * 年轻代中第二个survivor（幸存区）已使用的占当前容量百分比
    * E     
        * 年轻代中Eden（伊甸园）已使用的占当前容量百分比
    * O     
        * old代已使用的占当前容量百分比
    * P    
        * perm代已使用的占当前容量百分比
    * YGC       
        * 从应用程序启动到采样时年轻代中gc次数
    * YGCT   
        * 从应用程序启动到采样时年轻代中gc所用时间(s)
    * FGC   
        * 从应用程序启动到采样时old代(全gc)gc次数
    * FGCT    
        * 从应用程序启动到采样时old代(全gc)gc所用时间(s)
    * GCT
        * 从应用程序启动到采样时gc用的总时间(s)
* jstat -gcnew < pid>:年轻代对象的信息。
    * S0C   
        * 年轻代中第一个survivor（幸存区）的容量 (字节)
    * S1C   
        * 年轻代中第二个survivor（幸存区）的容量 (字节)
    * S0U   
        * 年轻代中第一个survivor（幸存区）目前已使用空间 (字节)
    * S1U  
        * 年轻代中第二个survivor（幸存区）目前已使用空间 (字节)
    * TT
        * 持有次数限制
    * MTT 
        * 最大持有次数限制
    * EC      
        * 年轻代中Eden（伊甸园）的容量 (字节)
    * EU    
        * 年轻代中Eden（伊甸园）目前已使用空间 (字节)
    * YGC    
        * 从应用程序启动到采样时年轻代中gc次数
    * YGCT
        * 从应用程序启动到采样时年轻代中gc所用时间(s)

* jstat -gcnewcapacity< pid>: 年轻代对象的信息及其占用量。
    * NGCMN     
        * 年轻代(young)中初始化(最小)的大小(字节)
    * NGCMX      
        * 年轻代(young)的最大容量 (字节)
    * NGC     
        * 年轻代(young)中当前的容量 (字节)
    * S0CMX    
        * 年轻代中第一个survivor（幸存区）的最大容量 (字节)
    * S0C    
        * 年轻代中第一个survivor（幸存区）的容量 (字节)
    * S1CMX    
        * 年轻代中第二个survivor（幸存区）的最大容量 (字节)
    * S1C      
        * 年轻代中第二个survivor（幸存区）的容量 (字节)
    * ECMX
        * 年轻代中Eden（伊甸园）的最大容量 (字节)
    * EC     
        * 年轻代中Eden（伊甸园）的容量 (字节)
    * YGC
        * 从应用程序启动到采样时年轻代中gc次数
    * FGC
        * 从应用程序启动到采样时old代(全gc)gc次数

* jstat -gcold < pid>：old代对象的信息。
    * PC      
        * Perm(持久代)的容量 (字节)
    * PU       
        * Perm(持久代)目前已使用空间 (字节)
    * OC         
        * Old代的容量 (字节)
    * OU      
        * Old代目前已使用空间 (字节)
    * YGC   
        * 从应用程序启动到采样时年轻代中gc次数
    * FGC   
        * 从应用程序启动到采样时old代(全gc)gc次数
    * FGCT    
        * 从应用程序启动到采样时old代(全gc)gc所用时间(s)
    * GCT
        * 从应用程序启动到采样时gc用的总时间(s)

* stat -gcoldcapacity < pid>: old代对象的信息及其占用量。
    * OGCMN      
        * old代中初始化(最小)的大小 (字节)
    * OGCMX       
        * old代的最大容量(字节)
    * OGC        
        * old代当前新生成的容量 (字节)
    * OC      
        * Old代的容量 (字节)
    * YGC  
        * 从应用程序启动到采样时年轻代中gc次数
    * FGC   
        * 从应用程序启动到采样时old代(全gc)gc次数
    * FGCT    
        * 从应用程序启动到采样时old代(全gc)gc所用时间(s)
    * GCT
        * 从应用程序启动到采样时gc用的总时间(s)

* jstat -gcpermcapacity< pid>: perm对象的信息及其占用量。
    * PGCMN     
        * perm代中初始化(最小)的大小 (字节)
    * PGCMX      
        * perm代的最大容量 (字节)  
    * PGC        
        * perm代当前新生成的容量 (字节)
    * PC     
        * Perm(持久代)的容量 (字节)
    * YGC  
        * 从应用程序启动到采样时年轻代中gc次数
    * FGC   
        * 从应用程序启动到采样时old代(全gc)gc次数
    * FGCT    
        * 从应用程序启动到采样时old代(全gc)gc所用时间(s)
    * GCT
        * 从应用程序启动到采样时gc用的总时间(s)

* jstat -printcompilation < pid>：当前VM执行的信息。
    * Compiled 
        * 编译任务的数目
    * Size 
        * 方法生成的字节码的大小
    * Type
        * 编译类型
    * Method
        * 类名和方法名用来标识编译的方法。类名使用/做为一个命名空间分隔符。方法名是给定类中的方法。上述格式是由-XX:+PrintComplation选项进行设置的


##### 1.5.15.1.4. 查看虚拟机参数jinfo
* Java配置信息工具类
```
Usage:
    jinfo [option] <pid>
        (to connect to running process)
    jinfo [option] <executable <core>
        (to connect to a core file)
    jinfo [option] [server_id@]<remote server IP or hostname>
        (to connect to remote debug server)

where <option> is one of:
    -flag <name>         to print the value of the named VM flag
    -flag [+|-]<name>    to enable or disable the named VM flag
    -flag <name>=<value> to set the named VM flag to the given value
    -flags               to print VM flags
    -sysprops            to print Java system properties
    <no option>          to print both of the above
    -h | -help           to print this help message

```
##### 1.5.15.1.5. 导出堆到文件jmap

jmap可以生成程序的堆Dump文件，也可以查看堆内对象实例的统计信息，查看ClassLoader的信息以及finalizer队列。

Java内存映像工具
```
Usage:
    jmap [option] <pid>
        (to connect to running process)
    jmap [option] <executable <core>
        (to connect to a core file)
    jmap [option] [server_id@]<remote server IP or hostname>
        (to connect to remote debug server)

where <option> is one of:
    <none>               to print same info as Solaris pmap
    -heap                to print java heap summary
    -histo[:live]        to print histogram of java object heap; if the "live"
                         suboption is specified, only count live objects
    -clstats             to print class loader statistics
    -finalizerinfo       to print information on objects awaiting finalization
    -dump:<dump-options> to dump java heap in hprof binary format
                         dump-options:
                           live         dump only live objects; if not specified,
                                        all objects in the heap are dumped.
                           format=b     binary format
                           file=<file>  dump heap to <file>
                         Example: jmap -dump:live,format=b,file=heap.bin <pid>
    -F                   force. Use with -dump:<dump-options> <pid> or -histo
                         to force a heap dump or histogram when <pid> does not
                         respond. The "live" suboption is not supported
                         in this mode.
    -h | -help           to print this help message
    -J<flag>             to pass <flag> directly to the runtime system


```

* 参数：
    * option： 选项参数。
    * pid： 需要打印配置信息的进程ID。
    * executable： 产生核心dump的Java可执行文件。
    * core： 需要打印配置信息的核心文件。
    * server-id 可选的唯一id，如果相同的远程主机上运行了多台调试服务器，用此选项参数标识服务器。
    * remote server IP or hostname 远程调试服务器的IP地址或主机名。
* option
    * no option： 查看进程的内存映像信息,类似 Solaris pmap 命令。
    * heap： 显示Java堆详细信息
    * histo[:live]： 显示堆中对象的统计信息
    * clstats：打印类加载器信息
    * finalizerinfo： 显示在F-Queue队列等待Finalizer线程执行finalizer方法的对象
    * dump:< dump-options>：生成堆转储快照
    * F： 当-dump没有响应时，使用-dump或者-histo参数. 在这个模式下,live子参数无效.
    * help：打印帮助信息
    * J< flag>：指定传递给运行jmap的JVM的参数

**ubuntu下执行出错解决**

出错表现
```
lgj@lgj-Lenovo-G470:~/Downloads$ jmap 10028
Attaching to process ID 10028, please wait...
Error attaching to process: sun.jvm.hotspot.debugger.DebuggerException: Can't attach to the process: ptrace(PTRACE_ATTACH, ..) failed for 10028: Operation not permitted
sun.jvm.hotspot.debugger.DebuggerException: sun.jvm.hotspot.debugger.DebuggerException: Can't attach to the process: ptrace(PTRACE_ATTACH, ..) failed for 10028: Operation not permitted

```
解决方式
```
lgj@lgj-Lenovo-G470:~/Downloads$ echo 0 | sudo tee /proc/sys/kernel/yama/ptrace_scope
```

**例子**

* **示例一：no option**
命令：jmap pid
描述：查看进程的内存映像信息
```
lgj@lgj-Lenovo-G470:~/Downloads$ jmap 10028
Attaching to process ID 10028, please wait...
Debugger attached successfully.
Server compiler detected.
JVM version is 25.191-b12
0x0000000000400000	8K	/home/lgj/java/jdk1.8.0_191/bin/java
0x00007f7110caa000	110K	/home/lgj/java/jdk1.8.0_191/jre/lib/amd64/libnet.so
0x00007f714cf22000	123K	/home/lgj/java/jdk1.8.0_191/jre/lib/amd64/libzip.so
0x00007f714d13e000	46K	/lib/x86_64-linux-gnu/libnss_files-2.27.so
0x00007f714d350000	94K	/lib/x86_64-linux-gnu/libnsl-2.27.so
0x00007f714d56a000	46K	/lib/x86_64-linux-gnu/libnss_nis-2.27.so
0x00007f714d776000	38K	/lib/x86_64-linux-gnu/libnss_compat-2.27.so
0x00007f714d980000	50K	/home/lgj/java/jdk1.8.0_191/jre/lib/amd64/libinstrument.so
0x00007f714db8b000	226K	/home/lgj/java/jdk1.8.0_191/jre/lib/amd64/libjava.so
0x00007f714ddba000	64K	/home/lgj/java/jdk1.8.0_191/jre/lib/amd64/libverify.so
0x00007f714dfc9000	30K	/lib/x86_64-linux-gnu/librt-2.27.so
0x00007f714e1d1000	1660K	/lib/x86_64-linux-gnu/libm-2.27.so
0x00007f714e56f000	16623K	/home/lgj/java/jdk1.8.0_191/jre/lib/amd64/server/libjvm.so
0x00007f714f553000	1982K	/lib/x86_64-linux-gnu/libc-2.27.so
0x00007f714f944000	14K	/lib/x86_64-linux-gnu/libdl-2.27.so
0x00007f714fb48000	106K	/home/lgj/java/jdk1.8.0_191/lib/amd64/jli/libjli.so
0x00007f714fd60000	141K	/lib/x86_64-linux-gnu/libpthread-2.27.so
0x00007f714ff7f000	166K	/lib/x86_64-linux-gnu/ld-2.27.so

```
* **示例二：heap**
命令：jmap -heap pid
描述：显示Java堆详细信息

打印一个堆的摘要信息，包括使用的GC算法、堆配置信息和各内存区域内存使用信息


```
lgj@lgj-Lenovo-G470:~/Downloads$ jmap -heap 10028
Attaching to process ID 10028, please wait...
Debugger attached successfully.
Server compiler detected.
JVM version is 25.191-b12

using thread-local object allocation.
Garbage-First (G1) GC with 4 thread(s)

Heap Configuration:
   MinHeapFreeRatio         = 40
   MaxHeapFreeRatio         = 70
   MaxHeapSize              = 104857600 (100.0MB)
   NewSize                  = 41943040 (40.0MB)
   MaxNewSize               = 41943040 (40.0MB)
   OldSize                  = 5452592 (5.1999969482421875MB)
   NewRatio                 = 2
   SurvivorRatio            = 8
   MetaspaceSize            = 21807104 (20.796875MB)
   CompressedClassSpaceSize = 1073741824 (1024.0MB)
   MaxMetaspaceSize         = 17592186044415 MB
   G1HeapRegionSize         = 1048576 (1.0MB)

Heap Usage:
G1 Heap:
   regions  = 100
   capacity = 104857600 (100.0MB)
   used     = 3145728 (3.0MB)
   free     = 101711872 (97.0MB)
   3.0% used
G1 Young Generation:
Eden Space:
   regions  = 3
   capacity = 44040192 (42.0MB)
   used     = 3145728 (3.0MB)
   free     = 40894464 (39.0MB)
   7.142857142857143% used
Survivor Space:
   regions  = 0
   capacity = 0 (0.0MB)
   used     = 0 (0.0MB)
   free     = 0 (0.0MB)
   0.0% used
G1 Old Generation:
   regions  = 0
   capacity = 39845888 (38.0MB)
   used     = 0 (0.0MB)
   free     = 39845888 (38.0MB)
   0.0% used

```

* **示例三：histo[:live]**
命令：jmap -histo:live pid
描述：显示堆中对象的统计信息
其中包括每个Java类、对象数量、内存大小(单位：字节)、完全限定的类名。打印的虚拟机内部的类名称将会带有一个’*’前缀。如果指定了live子选项，则只计算活动的对象。

```
lgj@lgj-Lenovo-G470:~/Downloads$ jmap -histo 10028

 num     #instances         #bytes  class name
----------------------------------------------
   1:           633        1318328  [I
   2:          1896        1255704  [B
   3:          6206         626184  [C
   4:          4740         113760  java.lang.String
   5:           661          75496  java.lang.Class
   6:          1292          58120  [Ljava.lang.Object;
   7:           639          25560  java.util.LinkedHashMap$Entry
   8:           318          16320  [Ljava.lang.String;
   9:            39          12112  [Ljava.util.HashMap$Node;
  10:           375          12000  java.util.HashMap$Node
  11:           152          10944  java.lang.reflect.Field
  12:           387           9288  java.lang.StringBuilder

```
* **示例四：clstats**
命令：jmap -clstats pid
描述：打印类加载器信息
-clstats是-permstat的替代方案，在JDK8之前，-permstat用来打印类加载器的数据
打印Java堆内存的永久保存区域的类加载器的智能统计信息。对于每个类加载器而言，它的名称、活跃度、地址、父类加载器、它所加载的类的数量和大小都会被打印。此外，包含的字符串数量和大小也会被打印。

```
lgj@lgj-Lenovo-G470:~/Downloads$ jmap  -clstats 10028
Attaching to process ID 10028, please wait...
Debugger attached successfully.
Server compiler detected.
JVM version is 25.191-b12
finding class loader instances ..done.
computing per loader stat ..done.
please wait.. computing liveness.....................done.
class_loader	classes	bytes	parent_loader	alive?	type

<bootstrap>	577	1082828	  null  	live	<internal>
0x00000000feb3cbc0	0	0	  null  	live	sun/misc/Launcher$ExtClassLoader@0x000000010000fc80
0x00000000fe80e608	0	0	0x00000000feb62768	live	java/util/ResourceBundle$RBClassLoader@0x000000010005e9b0
0x00000000feb62768	4	5126	0x00000000feb3cbc0	live	sun/misc/Launcher$AppClassLoader@0x000000010000f8d8

total = 4	581	1087954	    N/A    	alive=4, dead=0	    N/A  
```

* **示例五：finalizerinfo**
命令：jmap -finalizerinfo pid
描述：打印等待终结的对象信息

```
lgj@lgj-Lenovo-G470:~/Downloads$ jmap  -finalizerinfo  10028
Attaching to process ID 10028, please wait...
Debugger attached successfully.
Server compiler detected.
JVM version is 25.191-b12
Number of objects pending for finalization: 0

```

* **示例六：dump:< dump-options>**
命令：jmap -dump:format=b,file=heapdump.phrof pid
描述：生成堆转储快照dump文件。
以hprof二进制格式转储Java堆到指定filename的文件中。live子选项是可选的。如果指定了live子选项，堆中只有活动的对象会被转储。想要浏览heap dump，你可以使用jhat(Java堆分析工具)读取生成的文件。

这个命令执行，JVM会将整个heap的信息dump写入到一个文件，heap如果比较大的话，就会导致这个过程比较耗时，并且执行的过程中为了保证dump的信息是可靠的，所以会暂停应用， 线上系统慎用。


```
lgj@lgj-Lenovo-G470:~/Downloads$ jmap -dump:format=b,file=heapdump.phrof 10028
Dumping heap to /home/lgj/Downloads/heapdump.phrof ...

```
然后使用 jvisualvm 或者jhat等工具导入进行分析

##### 1.5.15.1.6. 虚拟机堆转储快照分析工具jhat

主要是用来分析java堆的命令，可以将堆中的对象以html的形式显示出来，包括对象的数量，大小等等，并支持对象查询语言。

* 虚拟机堆转储快照分析工具
```
Usage:  jhat [-stack <bool>] [-refs <bool>] [-port <port>] [-baseline <file>] [-debug <int>] [-version] [-h|-help] <file>

	-J<flag>          Pass <flag> directly to the runtime system. For
			  example, -J-mx512m to use a maximum heap size of 512MB
	-stack false:     Turn off tracking object allocation call stack.
	-refs false:      Turn off tracking of references to objects
	-port <port>:     Set the port for the HTTP server.  Defaults to 7000
	-exclude <file>:  Specify a file that lists data members that should
			  be excluded from the reachableFrom query.
	-baseline <file>: Specify a baseline object dump.  Objects in
			  both heap dumps with the same ID and same class will
			  be marked as not being "new".
	-debug <int>:     Set debug level.
			    0:  No debug output
			    1:  Debug hprof file parsing
			    2:  Debug hprof file parsing, no server
	-version          Report version number
	-h|-help          Print this help and exit
	<file>            The file to read

For a dump file that contains multiple heap dumps,
you may specify which dump in the file
by appending "#<number>" to the file name, i.e. "foo.hprof#3".

All boolean options default to "true"

```
分析jmap生成的堆快照文件heapdump.phrof 
```
lgj@lgj-Lenovo-G470:~/Downloads$ jhat heapdump.phrof 
Reading from heapdump.phrof...
Dump file created Wed Sep 11 16:26:25 CST 2019
Snapshot read, resolving...
Resolving 20815 objects...
Chasing references, expect 4 dots....
Eliminating duplicate references....
Snapshot resolved.
Started HTTP server on port 7000
Server is ready.

```
访问 www.localhost:7000 就可以访问html页面。可以通过-port配置端口。

##### 1.5.15.1.7. 查看线程堆栈jstack

* Java堆栈跟踪工具
```
Usage:
    jstack [-l] <pid>
        (to connect to running process)
    jstack -F [-m] [-l] <pid>
        (to connect to a hung process)
    jstack [-m] [-l] <executable> <core>
        (to connect to a core file)
    jstack [-m] [-l] [server_id@]<remote server IP or hostname>
        (to connect to a remote debug server)

Options:
    -F  to force a thread dump. Use when jstack <pid> does not respond (process is hung)
    -m  to print both java and native frames (mixed mode) 打印java和本地混合调用栈.
    -l  long listing. Prints additional information about locks 打印锁的附加信息
    -h or -help to print this help message


```


说明：
Attach Listener是线程名称, prio优先级, tid java线程id, nid native线程id. java.lang.Thread.State:WAITING线程状态.
locked <0x00000007955b0850>已经进入临界区
waiting:线程等待被唤醒

```

lgj@lgj-Lenovo-G470:~/Downloads$ jstack 10028
2019-09-11 16:37:32
Full thread dump Java HotSpot(TM) 64-Bit Server VM (25.191-b12 mixed mode):

"Attach Listener" #11 daemon prio=9 os_prio=0 tid=0x00007f70f0001000 nid=0x2755 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Service Thread" #10 daemon prio=9 os_prio=0 tid=0x00007f7148296000 nid=0x2742 runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C1 CompilerThread2" #9 daemon prio=9 os_prio=0 tid=0x00007f7148289000 nid=0x2741 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread1" #8 daemon prio=9 os_prio=0 tid=0x00007f7148287800 nid=0x2740 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread0" #7 daemon prio=9 os_prio=0 tid=0x00007f7148284800 nid=0x273f waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Monitor Ctrl-Break" #6 daemon prio=5 os_prio=0 tid=0x00007f7148283800 nid=0x273e runnable [0x00007f71112c3000]
   java.lang.Thread.State: RUNNABLE
	at java.net.SocketInputStream.socketRead0(Native Method)
	at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
	at java.net.SocketInputStream.read(SocketInputStream.java:171)
	at java.net.SocketInputStream.read(SocketInputStream.java:141)
	at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:284)
	at sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:326)
	at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:178)
	- locked <0x00000000fea37fd0> (a java.io.InputStreamReader)
	at java.io.InputStreamReader.read(InputStreamReader.java:184)
	at java.io.BufferedReader.fill(BufferedReader.java:161)
	at java.io.BufferedReader.readLine(BufferedReader.java:324)
	- locked <0x00000000fea37fd0> (a java.io.InputStreamReader)
	at java.io.BufferedReader.readLine(BufferedReader.java:389)
	at com.intellij.rt.execution.application.AppMainV2$1.run(AppMainV2.java:64)

"Signal Dispatcher" #5 daemon prio=9 os_prio=0 tid=0x00007f7148162800 nid=0x273d runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Surrogate Locker Thread (Concurrent GC)" #4 daemon prio=9 os_prio=0 tid=0x00007f7148161000 nid=0x273c waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Finalizer" #3 daemon prio=8 os_prio=0 tid=0x00007f7148129800 nid=0x273b in Object.wait() [0x00007f71117fe000]
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(Native Method)
	- waiting on <0x00000000feb08ed0> (a java.lang.ref.ReferenceQueue$Lock)
	at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:144)
	- locked <0x00000000feb08ed0> (a java.lang.ref.ReferenceQueue$Lock)
	at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:165)
	at java.lang.ref.Finalizer$FinalizerThread.run(Finalizer.java:216)

"Reference Handler" #2 daemon prio=10 os_prio=0 tid=0x00007f7148127000 nid=0x273a in Object.wait() [0x00007f713812a000]
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(Native Method)
	- waiting on <0x00000000feb06bf8> (a java.lang.ref.Reference$Lock)
	at java.lang.Object.wait(Object.java:502)
	at java.lang.ref.Reference.tryHandlePending(Reference.java:191)
	- locked <0x00000000feb06bf8> (a java.lang.ref.Reference$Lock)
	at java.lang.ref.Reference$ReferenceHandler.run(Reference.java:153)

"main" #1 prio=5 os_prio=0 tid=0x00007f714800e800 nid=0x272d waiting on condition [0x00007f7150189000]
   java.lang.Thread.State: TIMED_WAITING (sleeping)
	at java.lang.Thread.sleep(Native Method)
	at com.code.base.jvm.JvmDemo.main(JvmDemo.java:18)

"VM Thread" os_prio=0 tid=0x00007f714811d000 nid=0x2739 runnable 

"Gang worker#0 (Parallel GC Threads)" os_prio=0 tid=0x00007f7148025800 nid=0x272e runnable 

"Gang worker#1 (Parallel GC Threads)" os_prio=0 tid=0x00007f7148027800 nid=0x272f runnable 

"Gang worker#2 (Parallel GC Threads)" os_prio=0 tid=0x00007f7148029000 nid=0x2730 runnable 

"Gang worker#3 (Parallel GC Threads)" os_prio=0 tid=0x00007f714802b000 nid=0x2731 runnable 

"G1 Main Concurrent Mark GC Thread" os_prio=0 tid=0x00007f7148040800 nid=0x2737 runnable 

"Gang worker#0 (G1 Parallel Marking Threads)" os_prio=0 tid=0x00007f7148042800 nid=0x2738 runnable 

"G1 Concurrent Refinement Thread#0" os_prio=0 tid=0x00007f7148034800 nid=0x2736 runnable 

"G1 Concurrent Refinement Thread#1" os_prio=0 tid=0x00007f7148032800 nid=0x2735 runnable 

"G1 Concurrent Refinement Thread#2" os_prio=0 tid=0x00007f7148031000 nid=0x2734 runnable 

"G1 Concurrent Refinement Thread#3" os_prio=0 tid=0x00007f714802f000 nid=0x2733 runnable 

"G1 Concurrent Refinement Thread#4" os_prio=0 tid=0x00007f714802d800 nid=0x2732 runnable 

"VM Periodic Task Thread" os_prio=0 tid=0x00007f7148299800 nid=0x2743 waiting on condition 

JNI global references: 12


```

##### 1.5.15.1.8. jcmd

命令说明
```
Usage: jcmd <pid | main class> <command ...|PerfCounter.print|-f file>
   or: jcmd -l                                                    
   or: jcmd -h                                                    
                                                                  
  command must be a valid jcmd command for the selected jvm.      
  Use the command "help" to see which commands are available.   
  If the pid is 0, commands will be sent to all Java processes.   
  The main class argument will be used to match (either partially 
  or fully) the class used to start Java.                         
  If no options are given, lists Java processes (same as -p).     
                                                                  
  PerfCounter.print display the counters exposed by this process  
  -f  read and execute commands from the file                     
  -l  list JVM processes on the local machine                     
  -h  this help 
```

* 描述
    * pid：接收诊断命令请求的进程ID。
    * main class ：接收诊断命令请求的进程的main类。匹配进程时，main类名称中包含指定子字符串的任何进程均是匹配的。如果多个正在运行的Java进程共享同一个main类，诊断命令请求将会发送到所有的这些进程中。
    * command：接收诊断命令请求的进程的main类。匹配进程时，main类名称中包含指定子字符串的任何进程均是匹配的。如果多个正在运行的Java进程共享同一个main类，诊断命令请求将会发送到所有的这些进程中。
        * 注意: 如果任何参数含有空格，你必须使用英文的单引号或双引号将其包围起来。 此外，你必须使用转义字符来转移参数中的单引号或双引号，以阻止操作系统shell处理这些引用标记。当然，你也可以在参数两侧加上单引号，然后在参数内使用双引号(或者，在参数两侧加上双引号，在参数中使用单引号)。
    * Perfcounter.print：打印目标Java进程上可用的性能计数器。性能计数器的列表可能会随着Java进程的不同而产生变化。
    * -f file：从文件file中读取命令，然后在目标Java进程上调用这些命令。在file中，每个命令必须写在单独的一行。以"#"开头的行会被忽略。当所有行的命令被调用完毕后，或者读取到含有stop关键字的命令，将会终止对file的处理。
    * -l：查看所有的进程列表信息。
    * -h：查看帮助信息。（同 -help）




#### 1.5.15.2. Jdk可视化工具
<a href="#menu" style="float:right">目录</a>

* JConsole
jdk自带，功能简单，但是可以在系统有一定负荷的情况下使用。对垃圾回收算法有很详细的跟踪

* JProfiler
商业软件，需要付费。功能强大

* JVisualVM
VisualVM：JDK自带，功能强大，与JProfiler类似。推荐。
![](https://github.com/lgjlife/Java-Study/blob/master/pic/jvm/monitor.png?raw=true)
![](https://github.com/lgjlife/Java-Study/blob/master/pic/jvm/thread.png?raw=true)
![](https://github.com/lgjlife/Java-Study/blob/master/pic/jvm/gc.png?raw=true)

#### 1.5.15.3. 重要的垃圾收集数据
<a href="#menu" style="float:right">目录</a>

* 当前使用的垃圾收集器
* Java堆的大小
* 新生代和老年到的大小
* Minor GC的持续时间
* Minor GC的频率
* Minor GC的空间回收量
* Full GC的持续时间
* Full GC的频率
* 每个并发垃圾收集器周期内的空间回收量
* 垃圾收集前后的Java堆的占用量
* 垃圾收集前后新生代和老年代的占用量

**GC相关参数总结**

* 与串行回收器相关的参数
    * -XX:+UseSerialGC：在新生代和老年代使用串行回收器。
    * -XX:+SuivivorRatio：设置 eden 区大小和 survivor 区大小的比例。
    * -XX:+PretenureSizeThreshold：设置大对象直接进入老年代的阈值。当对象的大小超过这个值时，将直接在老年代分配。
    * -XX:MaxTenuringThreshold：设置对象进入老年代的年龄的最大值。每一次 Minor GC 后，对象年龄就加 1。任何大于这个年龄的对象，一定会进入老年代。
* 与并行 GC 相关的参数
    * -XX:+UseParNewGC：在新生代使用并行回收收集器。
    * -XX:+UseParallelOldGC：老年代使用并行回收收集器。
    * -XX:ParallelGCThreads：设置用于垃圾回收的线程数。通常情况下可以和 CPU 数量相等。但在 CPU 数量比较多的情况下，设置相对较小的数值也是合理的。
    * -XX:MaxGCPauseMills：设置最大垃圾收集停顿时间。它的值是一个大于 0 的整数。收集器在工作时，会调整 Java 堆大小或者其他一些参数，尽可能地把停顿时间控制在 MaxGCPauseMills 以内。
    * -XX:GCTimeRatio：设置吞吐量大小，它的值是一个 0-100 之间的整数。假设 GCTimeRatio 的值为 n，那么系统将花费不超过 1/(1+n) 的时间用于垃圾收集。
    * -XX:+UseAdaptiveSizePolicy：打开自适应 GC 策略。在这种模式下，新生代的大小，eden 和 survivor 的比例、晋升老年代的对象年龄等参数会被自动调整，以达到在堆大小、吞吐量和停顿时间之间的平衡点。
* 与 CMS 回收器相关的参数
    * -XX:+UseConcMarkSweepGC：新生代使用并行收集器，老年代使用 CMS+串行收集器。
    * -XX:+ParallelCMSThreads：设定 CMS 的线程数量。
    * -XX:+CMSInitiatingOccupancyFraction：设置 CMS 收集器在老年代空间被使用多少后触发，默认为 68%。
    * -XX:+UseFullGCsBeforeCompaction：设定进行多少次 CMS 垃圾回收后，进行一次内存压缩。
    * -XX:+CMSClassUnloadingEnabled：允许对类元数据进行回收。
    * -XX:+CMSParallelRemarkEndable：启用并行重标记。
    * -XX:CMSInitatingPermOccupancyFraction：当永久区占用率达到这一百分比后，启动 CMS 回收 (前提是-XX:+CMSClassUnloadingEnabled 激活了)。
    * -XX:UseCMSInitatingOccupancyOnly：表示只在到达阈值的时候，才进行 CMS 回收。
    * -XX:+CMSIncrementalMode：使用增量模式，比较适合单 CPU。
* 与 G1 回收器相关的参数
    * -XX:+UseG1GC：使用 G1 回收器。
    * -XX:+UnlockExperimentalVMOptions:允许使用实验性参数。
    * -XX:+MaxGCPauseMills:设置最大垃圾收集停顿时间。
    * -XX:+GCPauseIntervalMills:设置停顿间隔时间。
* 其他参数
    * -XX:+DisableExplicitGC: 禁用显示 GC


### 1.5.16. JVM性能调优案例

#### 1.5.16.1. 常用参数
<a href="#menu" style="float:right">目录</a>

* -XX:+PrintGCTimeStamps输出格式：
```
289.556: [GC [PSYoungGen: 314113K->15937K(300928K)] 405513K->107901K(407680K), 0.0178568 secs] [Times: user=0.06 sys=0.00, real=0.01 secs] 
293.271: [GC [PSYoungGen: 300865K->6577K(310720K)] 392829K->108873K(417472K), 0.0176464 secs] [Times: user=0.06 sys=0.00, real=0.01 secs] 
```
详解：
293.271是从jvm启动直到垃圾收集发生所经历的时间，GC表示这是一次Minor GC（新生代垃圾收集）；[PSYoungGen: 300865K->6577K(310720K)] 提供了新生代空间的信息，PSYoungGen，表示新生代使用的是多线程垃圾收集器Parallel Scavenge。300865K表示垃圾收集之前新生代占用空间，6577K表示垃圾收集之后新生代的空间。新生代又细分为一个Eden区和两个Survivor区,Minor GC之后Eden区为空，6577K就是Survivor占用的空间。
括号里的310720K表示整个年轻代的大小。
392829K->108873K(417472K),表示垃圾收集之前（392829K）与之后（108873K）Java堆的大小（总堆417472K，堆大小包括新生代和年老代）
由新生代和Java堆占用大小可以算出年老代占用空间，如，Java堆大小417472K，新生代大小310720K那么年老代占用空间是417472K-310720K=106752k；垃圾收集之前老年代占用的空间为392829K-300865K=91964k 垃圾收集之后老年代占用空间108873K-6577K=102296k.
0.0176464 secs表示垃圾收集过程所消耗的时间。
[Times: user=0.06 sys=0.00, real=0.01 secs] 提供cpu使用及时间消耗，user是用户模式垃圾收集消耗的cpu时间，实例中垃圾收集器消耗了0.06秒用户态cpu时间，sys是消耗系统态cpu时间,real是指垃圾收集器消耗的实际时间。

 

* -XX:+PrintGCDetails输出格式：
```
293.289: [Full GC [PSYoungGen: 6577K->0K(310720K)] 

[PSOldGen: 102295K->102198K(134208K)] 108873K->102198K(444928K) 

[PSPermGen: 59082K->58479K(104192K)], 0.3332354 secs] 

[Times: user=0.33 sys=0.00, real=0.33 secs] 
```
说明：

Full GC表示执行全局垃圾回收

[PSYoungGen: 6577K->0K(310720K)] 提供新生代空间信息，解释同上

[PSOldGen: 102295K->102198K(134208K)]提供了年老代空间信息；

108873K->102198K(444928K)整个堆空间信息；

[PSPermGen: 59082K->58479K(104192K)]提供了持久代空间信息。

```
************************************jdk  1.8  ***************************************

928.242: [GC (Allocation Failure) [PSYoungGen: 1253249K->30225K(1289728K)] 1779754K->556738K(2020864K), 0.0356346 secs] [Times: user=0.11 sys=0.00, real=0.03 secs] 
931.770: [GC (Allocation Failure) [PSYoungGen: 1260049K->58346K(1269760K)] 1786562K->605128K(2000896K), 0.0383538 secs] [Times: user=0.23 sys=0.01, real=0.04 secs] 
935.178: [GC (Allocation Failure) [PSYoungGen: 1269738K->74746K(1286144K)] 1816520K->628896K(2017280K), 0.0545040 secs] [Times: user=0.23 sys=0.00, real=0.06 secs] 
938.592: [GC (Allocation Failure) [PSYoungGen: 1286138K->74730K(1234944K)] 1840288K->634580K(1966080K), 0.0466145 secs] [Times: user=0.23 sys=0.00, real=0.05 secs] 
(Allocation Failure)  是 触发原因，内存分配失败  Yong 区！
[Full GC (System.gc()) [PSYoungGen: 64606K->0K(1250304K)] [ParOldGen: 560282K->70636K(731136K)]
624888K->70636K(1981440K), [Metaspace: 80870K->80870K(1122304K)], 0.3997928 secs] [Times: user=1.22 sys=0.02, real=0.40 secs] 
```

这是fullGC 触发原因系统调用  jvm 退出
```
704.975: [Full GC (Ergonomics) [PSYoungGen: 113660K->0K(1078272K)]
[ParOldGen: 608998K->319617K(731136K)] 722659K->319617K(1809408K), [Metaspace: 78468K->78468K(1120256K)], 0.7647321 secs] [Times: user=3.06 sys=0.06, real=0.77 secs] 
```
这是fullGC 触发原因系统调用，表示JVM内部环境认为此时可以进行一次垃圾收集。

 
```
97.172: [Full GC (Metadata GC Threshold) [PSYoungGen: 19117K->0K(1314304K)][ParOldGen: 92121K->102831K(393728K)] 111239K->102831K(1708032K),
[Metaspace: 57037K->57037K(1101824K)], 0.7376882 secs] [Times: user=2.40 sys=0.03, real=0.74 secs] 
```
这是fullGC 触发原因元空间不足，方法区

 
```
14.622: [Full GC (Metadata GC Threshold) [PSYoungGen: 22862K->0K(1009152K)]
 [ParOldGen: 74731K->84004K(307712K)] 97593K->84004K(1316864K),
 [Metaspace: 34473K->34473K(1081344K)], 0.2161652 secs] [Times: user=0.87 sys=0.01, real=0.21 secs] 
```
这是fullGC 触发原因元空间不足，方法区

 
```
392.288: [Full GC [PSYoungGen: 33356K->0K(943104K)] [ParOldGen: 63939K->65555K(659968K)] 
97295K->65555K(1603072K) [PSPermGen: 37621K->33623K(74240K)], 0.2658880 secs] [Times: user=0.88 sys=0.00, real=0.27 secs] 
```
这是fullGC 触发原因老年区


#### 1.5.16.2. 调整堆的大小
<a href="#menu" style="float:right">目录</a>

如果分配的堆过于小，那么应用就会频繁地进行GC，没有足够的时间运行应用程序的逻辑。
如果分配的堆过于大，能改降低停顿的频率，但是GC时停顿的时间也会加大，因为有更多的垃圾需要回收。

使用超大堆还有一个风险。操作系统使用虚拟内存机制管理机器的物理内存。一台机器可能有8G的物理内存，不过操作系统可能让你觉得有更多的可用内存，虚拟内存的数量取决于操作系统的设置。操作系统通过交换swapping来实现。你可以载入需要16G内存的应用程序，操作系统在需要时会将应用程序运行时不活跃的数据由内存复制到磁盘。再次需要时这部分内存的内容时，操作系统再将他们由磁盘重新载入内存，为了腾出空间，它会将另一部分内存的内容复制到磁盘。

系统中运行大量的不同应用的程序时，这个流程工作很顺畅。因为大多数的应用程序不会同时处于活跃状态。

但是对于Java应用程序，如果设置了超过物理内存的堆大小，运行时Java并不知道这个虚拟内存的存在，如果全部分配完全，将会降低性能，因为会有部分数据需要不断地写入磁盘读出磁盘。尤其是在进行Full GC时，必须扫描全部的堆空间，如果此时发生内存交换，将会导致停顿的时间更长。

因此，调整堆的大小不应超过机器物理内存。如果存在多个JVM，这个数据就是所有JVM堆的总和。除此之外，还需要为其他的应用预留一定的内存空间。

堆大小由两个参数值控制：分别是初始值(-Xms N)和最大值(-Xmx N)。默认的值受操作系统类型。系统内存大小，使用的JVM影响。其他的命令行标志也会对该值有影响。堆大小的调节是JVM自适应调优的核心。

JVM的目标是依据系统可用的资源找到一个合理的默认初始值，当切仅当应用程序需要更多的内存时将堆大小增大到一个合理的最大值。

堆的大小具有初始值和最大值的这种设计让JVM能改根据实际负荷情况更灵活地调整JVM的行为。如果JVM发现使用初始的堆大小，频繁地发生GC，它就会尝试增加堆的空间，直到JVM的GC的频率回归到正常的范围，或者直到堆大小增大到它的上限值。

对很多应用来说，这意味着堆的大小不再需要调整，实际上 ，只需要为选择的GC算法设定性能目标，譬如停顿时间，垃圾回收在整个时间中所占用的百分比等。

一个经验法则是每次Full GC后，应该释放出70%的空间。

即使显示设置了堆的最大值，还是会发生堆的自动调节，初始值以默认的大小开始运行，为了达到设定的垃圾收集算法设置的性能目标，JVM会逐步增大堆的大小。将堆的大小设置比实际需要更大不一定会带来性能目标，堆并不会无限增大，JVM会自动调节堆的大小直到其满足GC的性能目标。



#### 1.5.16.3. 代空间调整
<a href="#menu" style="float:right">目录</a>

**常用参数**
* -XX:NewRation=N
    * 新生代和老年代的占用比率
* -XX:NewSize=N
    * 新生代空间的初始大小
* -XX:MaxNewSize=N
    * 新生代空间的最大大小
* -XmnN
    * 将NewSize和MaxNewSize设置为同一个值的快捷方法



#### 1.5.16.4. 永久代和元空空间
<a href="#menu" style="float:right">目录</a>

#### 1.5.16.5. 控制并发
<a href="#menu" style="float:right">目录</a>

#### 1.5.16.6. 自适应调整
<a href="#menu" style="float:right">目录</a>


#### 1.5.16.7. 将新对象预留在新生代
<a href="#menu" style="float:right">目录</a>

Full GC的成本远高于Minor GC，因此应当尽可能将对象分配在新生代。
大部分情况下，JVM会尝试在eden区分配对象，如果对象过大，会直接在老年代进行分配。因此可以设置一个合理的新生代大小，尽可能让对象在新生代分配空间。
一般来说，当survicor空间不够或者占用量达到50%时，就会在老年代进行空间分配。

将这个比例提高到90%
```
-XX:TargeT-SurvivorRatio=90
```
这个参数只对串行收集器和新生代并行收集器有效。


#### 1.5.16.8. 大对象进入老年代
<a href="#menu" style="float:right">目录</a>

大部分情况下，将对象分配在新生代是合理的，但是对于大对象，大对象很可能扰乱新生代GC，并破坏新生代原有的对象结构，因为尝试在新生代分配大对象，很可能导致空间不足，为了有足够的空间容纳大对象，JVM不得不将新生代中的小对象移动到老年代，这并不是一个好结果。老年代应该存放年龄较大的对象或者大对象。

通过该参数进行设置阈值
```
-XX:PretenureSizeThreshold=1000
```

#### 1.5.16.9. 设置对象进入老年代的年龄
<a href="#menu" style="float:right">目录</a>


这个值默认是15，如果对象在EDEN区，经过一次GC后还存活，对象年龄加1，当对象年龄达到阈值时，就移入老年代。

这里设置的是最大值，虚拟机会根据实际情况进行动态调整，可能还不到15就被移动带老年代了。
```
-XX:MaxTenuringThreshold=10
```
#### 1.5.16.10. 稳定与震荡的堆大小
<a href="#menu" style="float:right">目录</a>当 -Xms与 -Xmx设置大小一样，是一个稳定的堆，这样做的好处是，减少GC的次数。
当 -Xms与 -Xmx设置大小不一样，是一个不稳定的堆，它会增加GC的次数，但是它在系统不需要使用大内存时，压缩堆空间，使得GC应对一个较小的堆，可以加快单次GC的次数。

可以通过两个参数设置用语压缩和扩展堆空间：
* -XX:MinHeapFreeRatio: 设置堆的最小空闲比例，默认是40，当堆空间的空闲空间小于这个数值时，jvm会自动扩展空间。
* -XX：MaxHeapFreeRatio: 设置堆的最大空闲比例，默认是70，当堆空间的空闲空间大于这个数值时，jvm会自动压缩空间。

#### 1.5.16.11. 吞吐量优先案例
<a href="#menu" style="float:right">目录</a>

吞吐量优先的方案将会尽可能减少系统执行垃圾回收的总时间，故可以考虑关注系统吞吐量的并行回收收集器。在拥有4GB内存和32核CPU的计算机上，进行吞吐量的优化，可以使用参数：

java –Xmx3800m –Xms3800m –Xmn2G –Xss128k –XX:+UseParallelGC 
   –XX:ParallelGCThreads=20 –XX:+UseParallelOldGC
–Xmx380m –Xms3800m：设置 Java 堆的最大值和初始值。一般情况下，为了避免堆内存的频繁震荡，导致系统性能下降，我们的做法是设置最大堆等于最小堆。假设这里把最小堆减少为最大堆的一半，即 1900m，那么 JVM 会尽可能在 1900MB 堆空间中运行，如果这样，发生 GC 的可能性就会比较高；

-Xss128k：减少线程栈的大小，这样可以使剩余的系统内存支持更多的线程；

-Xmn2g：设置年轻代区域大小为 2GB；

–XX:+UseParallelGC：年轻代使用并行垃圾回收收集器。这是一个关注吞吐量的收集器，可以尽可能地减少 GC 时间。

–XX:ParallelGCThreads：设置用于垃圾回收的线程数，通常情况下，可以设置和 CPU 数量相等。但在 CPU 数量比较多的情况下，设置相对较小的数值也是合理的；

–XX:+UseParallelOldGC：设置年老代使用并行回收收集器。



#### 1.5.16.12. 使用大页案例
<a href="#menu" style="float:right">目录</a>

在 Solaris 系统中，JVM 可以支持 Large Page Size 的使用。使用大的内存分页可以增强 CPU 的内存寻址能力，从而提升系统的性能。


对同样大小的内存空间， 使用大页后， 内存分页的表项就会减少， 从而可以提升CPU从虚拟内存地址映射到物理内存地址的能力。 在支持大页的操作系统中，使用JVM参数让虚拟机使用大页，从而提升系统性能。
* -XX:+UserlargePages: 启用大页。
* -XX:LargePageSizeInBytes: 指定大页的大小。

```
java –Xmx2506m –Xms2506m –Xmn1536m –Xss128k -XX:++UseParallelGC
 –XX:ParallelGCThreads=20 –XX:+UseParallelOldGC –XX:+LargePageSizeInBytes=256m
–XX:+LargePageSizeInBytes：设置大页的大小。
```

#### 1.5.16.13. 降低停顿案例
<a href="#menu" style="float:right">目录</a>

为降低应用软件的垃圾回收时的停顿，首先考虑的是使用关注系统停顿的 CMS 回收器，其次，为了减少 Full GC 次数，应尽可能将对象预留在年轻代，因为年轻代 Minor GC 的成本远远小于年老代的 Full GC。
```
java –Xmx3550m –Xms3550m –Xmn2g –Xss128k –XX:ParallelGCThreads=20
 –XX:+UseConcMarkSweepGC –XX:+UseParNewGC –XX:+SurvivorRatio=8 –XX:TargetSurvivorRatio=90
 –XX:MaxTenuringThreshold=31
–XX:ParallelGCThreads=20：设置 20 个线程进行垃圾回收；
–XX:+UseParNewGC：新生代使用并行回收器；
–XX:+UseConcMarkSweepGC：老年代使用 CMS 收集器降低停顿；
```

–XX:+SurvivorRatio：设置 Eden 区和 Survivor 区的比例为 8:1。稍大的 Survivor 空间可以提高在新生代回收生命周期较短的对象的可能性（如果 Survivor 不够大，一些短命的对象可能直接进入老年代，这对系统来说是不利的）。

–XX:TargetSurvivorRatio：设置 Survivor 区的可使用率。这里设置为 90%，则允许 90%的 Survivor 空间被使用。默认值是 50%。故该设置提高了 Survivor 区的使用率。当存放的对象超过这个百分比，则对象会向老年代压缩。因此，这个选项更有助于将对象留在新生代。

–XX:MaxTenuringThreshold：设置年轻对象晋升到老年代的年龄。默认值是 15 次，即对象经过 15 次 Minor GC 依然存活，则进入老年代。这里设置为 31，即尽可能地让对象保存在新生代。

#### 1.5.16.14. 堆快照（堆Dump）

获得程序的堆快照文件有很多方法， 比较常用的取得堆快照文件的方法是使用-XX:+HeapDumpOnOutOfMemoryError 参数在程序发生OOM时，导出应用程序的当前堆快照。

通过参数 -XX:heapDumpPath 可以指定堆快照的保存位置。

```
-Xmx10m -XX:+HeapDumpOnOutOfMemoryError -XX:heapDumpPath=C:\m.hprof
```

#### 1.5.16.15. 控制GC

-XX:+DisableExplicitGC 选项用于禁止显式的GC操作， 即禁止在程序中使用System.gc() 触发Full GC。
-Xnoclassgc 参数用于禁止系统进行类的回收， 即系统不会卸载任何类，进而提升GC的性能。
-Xincgc 参数，一旦启用这个参数，系统便会进行增量式的 GC，增量式的GC使用特定算法让GC线程和应用程序线程交叉执行，从而减小应用程序因GC而产生的停顿时间。



### 1.5.17. 类文件结构


Class文件是一组以8位字节为基础单位的二进制流，各个数据项目严格按照顺序紧凑地排列在Class文件之中，中间没有添加任何分隔符，这使得整个Class文件中存储的内容几乎全部是程序运行的必要数据，没有空隙存在。当遇到需要多于8位字节以上空间的数据项时，则会按照高位在前的方式分割成若干个8位字节进行存储。


一个 Java 类文件大致可以归为 10 个项：
* Magic：该项存放了一个 Java 类文件的魔数（magic number）和版本信息。一个 Java 类文件的前 4 个字节被称为它的魔数。每个正确的 Java 类文件都是以 0xCAFEBABE 开头的，这样保证了 Java 虚拟机能很轻松的分辨出 Java 文件和非 Java 文件。
* Version：该项存放了 Java 类文件的版本信息，它对于一个 Java 文件具有重要的意义。因为 Java 技术一直在发展，所以类文件的格式也处在不断变化之中。类文件的版本信息让虚拟机知道如何去读取并处理该类文件。
* Constant Pool：该项存放了类中各种文字字符串、类名、方法名和接口名称、final 变量以及对外部类的引用信息等常量。虚拟机必须为每一个被装载的类维护一个常量池，常量池中存储了相应类型所用到的所有类型、字段和方法的符号引用，因此它在 Java 的动态链接中起到了核心的作用。常量池的大小平均占到了整个类大小的 60% 左右。
* Access_flag：该项指明了该文件中定义的是类还是接口（一个 class 文件中只能有一个类或接口），同时还指名了类或接口的访问标志，如 public，private, abstract 等信息。
* This Class：指向表示该类全限定名称的字符串常量的指针。
* Super Class：指向表示父类全限定名称的字符串常量的指针。
* Interfaces：一个指针数组，存放了该类或父类实现的所有接口名称的字符串常量的指针。以上三项所指向的常量，特别是前两项，在我们用 ASM 从已有类派生新类时一般需要修改：将类名称改为子类名称；将父类改为派生前的类名称；如果有必要，增加新的实现接口。
* Fields：该项对类或接口中声明的字段进行了细致的描述。需要注意的是，fields 列表中仅列出了本类或接口中的字段，并不包括从超类和父接口继承而来的字段。
* Methods：该项对类或接口中声明的方法进行了细致的描述。例如方法的名称、参数和返回值类型等。需要注意的是，methods 列表里仅存放了本类或本接口中的方法，并不包括从超类和父接口继承而来的方法。使用 ASM 进行 AOP 编程，通常是通过调整 Method 中的指令来实现的。
* Class attributes：该项存放了在该文件中类或接口所定义的属性的基本信息。

**使用hexdump工具查看Class十六进制值**
```
lgj@lgj-Lenovo-G470:~/aProject/JavaCode/Java-base/target/classes/com/code/base/collector$ hexdump ArraysDemo.class 
0000000 feca beba 0000 3400 1a00 000a 0002 0712
0000010 1300 000a 0014 0715 1600 0001 3c06 6e69
0000020 7469 013e 0300 2928 0156 0400 6f43 6564
0000030 0001 4c0f 6e69 4e65 6d75 6562 5472 6261
0000040 656c 0001 4c12 636f 6c61 6156 6972 6261
0000050 656c 6154 6c62 0165 0400 6874 7369 0001
0000060 4c24 6f63 2f6d 6f63 6564 622f 7361 2f65
0000070 6f63 6c6c 6365 6f74 2f72 7241 6172 7379
0000080 6544 6f6d 013b 0400 616d 6e69 0001 2816
0000090 4c5b 616a 6176 6c2f 6e61 2f67 7453 6972
00000a0 676e 293b 0156 0400 7261 7367 0001 5b13
00000b0 6a4c 7661 2f61 616c 676e 532f 7274 6e69
00000c0 3b67 0001 530a 756f 6372 4665 6c69 0165
00000d0 0f00 7241 6172 7379 6544 6f6d 6a2e 7661
00000e0 0c61 0500 0600 0001 6a10 7661 2f61 616c
00000f0 676e 4f2f 6a62 6365 0774 1700 000c 0018
0000100 0119 2200 6f63 2f6d 6f63 6564 622f 7361
0000110 2f65 6f63 6c6c 6365 6f74 2f72 7241 6172
0000120 7379 6544 6f6d 0001 6a10 7661 2f61 7475
0000130 6c69 412f 7272 7961 0173 0600 7361 694c
0000140 7473 0001 2825 4c5b 616a 6176 6c2f 6e61
0000150 2f67 624f 656a 7463 293b 6a4c 7661 2f61
0000160 7475 6c69 4c2f 7369 3b74 2100 0400 0200
0000170 0000 0000 0200 0100 0500 0600 0100 0700
0000180 0000 2f00 0100 0100 0000 0500 b72a 0100
0000190 00b1 0000 0002 0008 0000 0006 0001 0000
00001a0 0005 0009 0000 000c 0001 0000 0005 000a
00001b0 000b 0000 0009 000c 000d 0001 0007 0000
00001c0 0037 0001 0001 0000 0309 00bd b802 0300
00001d0 b157 0000 0200 0800 0000 0a00 0200 0000
00001e0 0a00 0800 0d00 0900 0000 0c00 0100 0000
00001f0 0900 0e00 0f00 0000 0100 1000 0000 0200
0000200 1100                                   
0000202

```

**使用javap工具查看反编译后的字节码javap**
```
lgj@lgj-Lenovo-G470:~/aProject/JavaCode/Java-base/target/classes/com/code/base/collector$ javap -v ArraysDemo.class 
Classfile /home/lgj/aProject/JavaCode/Java-base/target/classes/com/code/base/collector/ArraysDemo.class
  Last modified Sep 12, 2019; size 514 bytes
  MD5 checksum 53801876d383dc25492a98f309774012
  Compiled from "ArraysDemo.java"
public class com.code.base.collector.ArraysDemo
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #2.#18         // java/lang/Object."<init>":()V
   #2 = Class              #19            // java/lang/Object
   #3 = Methodref          #20.#21        // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
   #4 = Class              #22            // com/code/base/collector/ArraysDemo
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Utf8               Code
   #8 = Utf8               LineNumberTable
   #9 = Utf8               LocalVariableTable
  #10 = Utf8               this
  #11 = Utf8               Lcom/code/base/collector/ArraysDemo;
  #12 = Utf8               main
  #13 = Utf8               ([Ljava/lang/String;)V
  #14 = Utf8               args
  #15 = Utf8               [Ljava/lang/String;
  #16 = Utf8               SourceFile
  #17 = Utf8               ArraysDemo.java
  #18 = NameAndType        #5:#6          // "<init>":()V
  #19 = Utf8               java/lang/Object
  #20 = Class              #23            // java/util/Arrays
  #21 = NameAndType        #24:#25        // asList:([Ljava/lang/Object;)Ljava/util/List;
  #22 = Utf8               com/code/base/collector/ArraysDemo
  #23 = Utf8               java/util/Arrays
  #24 = Utf8               asList
  #25 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
{
  public com.code.base.collector.ArraysDemo();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 5: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/code/base/collector/ArraysDemo;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: anewarray     #2                  // class java/lang/Object
         4: invokestatic  #3                  // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
         7: pop
         8: return
      LineNumberTable:
        line 10: 0
        line 13: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  args   [Ljava/lang/String;
}
SourceFile: "ArraysDemo.java"

```

#### 1.5.17.1. 模数和Class文件的版本
<a href="#menu" style="float:right">目录</a>

魔数一共4个字节，作用是确定这个文件是否为一个能够被虚拟机接受的Class文件。
值为 0xCAFEBABE(咖啡宝贝)。

版本号又分别为主版本号(major version)和次版本号(minor version),都是两个字节表示 如上的版本就是52.0。虚拟机兼容旧版本的Class文件，不兼容超过其版本的Class文件。

#### 1.5.17.2. 常量池
<a href="#menu" style="float:right">目录</a>

版本号之后就是常量池入口，常量池可以理解为Class文件之中的资源仓库，它是Class文件结构中与其他项目关联最多的数据类型，也是占用Class文件空间内最大啊的数据项目之一，同时还是在CLass文件中第一个出现的表类型数据项目。

该项存放了类中各种文字字符串、类名、方法名和接口名称、final 变量以及对外部类的引用信息等常量。虚拟机必须为每一个被装载的类维护一个常量池，常量池中存储了相应类型所用到的所有类型、字段和方法的符号引用，因此它在 Java 的动态链接中起到了核心的作用。常量池的大小平均占到了整个类大小的 60% 左右。

常量池主要存放两大类常量:字面量(Literal)和符号引用(Symbolic References).字面量比较接近于Java语言层面的常量概念，如文本字符串，声明为final的常量值等，而符号引用则属于编译原理方面的概念，包括以下三类常量 :
* 类和接口的全限定名
* 字段的名称和描述符
* 方法的名称和描述符

#### 1.5.17.3. 访问标志
<a href="#menu" style="float:right">目录</a>

#### 1.5.17.4. 类索引，父类索引与接口集合
<a href="#menu" style="float:right">目录</a>

#### 1.5.17.5. 字段表集合
<a href="#menu" style="float:right">目录</a>

#### 1.5.17.6. 方法表集合
<a href="#menu" style="float:right">目录</a>

#### 1.5.17.7. 属性表集合
<a href="#menu" style="float:right">目录</a>




### 1.5.18. 类加载过程

#### 1.5.18.1. 类装载流程
<a href="#menu" style="float:right">目录</a>

虚拟机加载class文件经过的流程:加载，连接(验证，准备，解析)，初始化



##### 1.5.18.1.1. 类加载条件
<a href="#menu" style="float:right">目录</a>

Class只有必须要使用才会被装载，虚拟机不会无条件地装载Class文件，Java虚拟机规定，一个类或者接口在初次使用前，必须进行初始化。
* 当创建一个类的实例时，比如new，反射，克隆，反序列化等方式
* 当调用类的静态方法时，即当使用了invokestatic指令
* 当使用反射包中的方法反射类的方法
* 初始化子类时，要求先初始化父类
* 作为启动虚拟机，含有main()方法的那个类


##### 1.5.18.1.2. 加载类
<a href="#menu" style="float:right">目录</a>

在加载类时，Java虚拟机必须完成以下工作
* 通过类的全名，获取类的二进制数据流
* 解析类的二进制数据流为方法区内的数据结构
* 创建java.lang.Class类的实例，标识该类型

---
* 获取类的二进制数据流
    * 通过文件系统读入一个class后缀的文件
    * 读入JAR，ZIP等归档数据包，提取类文件
    * 事先将类的二进制数据存放在数据库中
    * 通过网络进行加载
    * 运行时生成

##### 1.5.18.1.3. 连接 

加载之后就进行连接操作,连接包括验证，准备，解析。

###### 1.5.18.1.3.1. 验证类
<a href="#menu" style="float:right">目录</a>

验证是保证加载的字节码是合法，合理并符合规范的。


**验证步骤**

* 格式检查
    * 魔术检查
    * 版本检查
    * 长度检查
* 语义检查
    * 是否继承final
    * 是否有父类
    * 抽象方法是否有实现
* 字节码验证
    * 跳转指令是否指向正确位置
    * 操作数类型是否合理
* 符号引用验证
    * 符号引用的直接引用是否存在

1. 必须判断类的二进制数据是否符合格式要求和规范的，比如，是否以魔数0xCAFEBABE开头，主板本和小版本号是否在当前Java虚拟机的支持范围内，数据中每一项是否都拥有正确的长度等等
2. Java虚拟机会进行字节码的语义检查，比如是否所有的类都有父类的存在(除了Object,其他类都有父类)。是否一些被定义为final的方法或者类被重载或者继承了。非抽象类是否实现了所有抽象方法或者接口方法，是否存在不兼容的方法
3. Java虚拟机还会进行字节码验证，它视图通过字节码流的分析，判断字节码是否可以被正确的执行。比如，在字节码的执行过程中，是否会跳到一条不存在的指令，函数的调用是否传递了正确类型的参数，变量的赋值是否给了正确的数据类型等
4. 校验器还将进行符号引用的验证。Class文件在其常量池会通过字符串记录自己将要使用的其他类或者方法。因此，在验证阶段，虚拟机就会检查这些类或者方法确实存在的，并且当前类有权限访问，如果一个类找不到则抛出NoClassDefFoundError,如果一个方法无法被找到，则会抛出NoSuchMethodError.


###### 1.5.18.1.3.2. 准备
<a href="#menu" style="float:right">目录</a>

验证通过以后，就会进入准备阶段。

准备阶段是正式为类变量分配内存并设置类变量初始值的阶段，这些内存都将在方法区中分配。对于该阶段有以下几点需要注意：
1. 这时候进行内存分配的仅包括类变量（static），而不包括实例变量，实例变量会在对象实例化时随着对象一块分配在Java堆中。
2. 这里所设置的初始值通常情况下是数据类型默认的零值（如0、0L、null、false等），而不是被在Java代码中被显式地赋予的值。

假设一个类变量的定义为：public static int value = 3；
那么变量value在准备阶段过后的初始值为0，而不是3，因为这时候尚未开始执行任何Java方法，而把value赋值为3的putstatic指令是在程序编译后，存放于类构造器<clinit>（）方法之中的，所以把value赋值为3的动作将在初始化阶段才会执行。

这里还需要注意如下几点：
* 对基本数据类型来说，对于类变量（static）和全局变量，如果不显式地对其赋值而直接使用，则系统会为其赋予默认的零值，而对于局部变量来说，在使用前必须显式地为其赋值，否则编译时不通过。
* 对于同时被static和final修饰的常量，必须在声明的时候就为其显式地赋值，否则编译时不通过；而只被final修饰的常量则既可以在声明时显式地为其赋值，也可以在类初始化时显式地为其赋值，总之，在使用前必须为其显式地赋值，系统不会为其赋予默认零值。
* 对于引用数据类型reference来说，如数组引用、对象引用等，如果没有对其进行显式地赋值而直接使用，系统都会为其赋予默认的零值，即null。
* 如果在数组初始化时没有对数组中的各元素赋值，那么其中的元素将根据对应的数据类型而被赋予默认的零值。

3. 如果类字段的字段属性表中存在ConstantValue属性，即同时被final和static修饰，那么在准备阶段变量value就会被初始化为ConstValue属性所指定的值。

假设上面的类变量value被定义为： public static final int value = 3；

编译时Javac将会为value生成ConstantValue属性，在准备阶段虚拟机就会根据ConstantValue的设置将value赋值为3。回忆上一篇博文中对象被动引用的第2个例子，便是这种情况。我们可以理解为static final常量在编译期就将其结果放入了调用它的类的常量池中

这个阶段，虚拟机会为其分配相应的内存空间，并设置初始值。

|类型|初始值|
|---|---|
|int|0|
|long|0L|
|short|(short)0|
|char|\u0000|
|boolean| false|
|reference|null|
|float|0f|
|double|0f|
Java不支持boolean,对于boolean,内部实现是int,int的初始值是0,因此是false.


###### 1.5.18.1.3.3. 解析
<a href="#menu" style="float:right">目录</a>

解析阶段是虚拟机将常量池内的符号引用替换为直接引用的过程，解析动作主要针对类或接口、字段、类方法、接口方法、方法类型、方法句柄和调用点限定符7类符号引用进行。符号引用就是一组符号来描述目标，可以是任何字面量。

直接引用就是直接指向目标的指针、相对偏移量或一个间接定位到目标的句柄。

##### 1.5.18.1.4. 初始化
<a href="#menu" style="float:right">目录</a>

初始化，为类的静态变量赋予正确的初始值，JVM负责对类进行初始化，主要对类变量进行初始化。在Java中对类变量进行初始值设定有两种方式：
* 声明类变量是指定初始值
* 使用静态代码块为类变量指定初始值

* JVM初始化步骤
    * 假如这个类还没有被加载和连接，则程序先加载并连接该类
    * 假如该类的直接父类还没有被初始化，则先初始化其直接父类
    * 假如类中有初始化语句，则系统依次执行这些初始化语句

类初始化时机：只有当对类的主动使用的时候才会导致类的初始化，类的主动使用包括以下六种：
* 创建类的实例，也就是new的方式
* 访问某个类或接口的静态变量，或者对该静态变量赋值
* 调用类的静态方法
* 反射（如Class.forName(“com.shengsiyuan.Test”)）
* 初始化某个类的子类，则其父类也会被初始化
* Java虚拟机启动时被标明为启动类的类（Java Test），直接使用java.exe命令来运行某个主类

### 1.5.19. 类加载器
<a href="#menu" style="float:right">目录</a>

#### 1.5.19.1. 基本概念
<a href="#menu" style="float:right">目录</a>

类加载器是负责将可能是网络上、也可能是磁盘上的class文件加载到内存中。并为其生成对应的java.lang.class对象。一旦一个类被载入JVM了，同一个类就不会被再次加载。那么怎样才算是同一个类？在JAVA中一个类用其全限定类名（包名和类名）作为其唯一标识，但是在JVM中，一个类用其全限定类名和其类加载器作为其唯一标识。也就是说，在JAVA中的同一个类，如果用不同的类加载器加载，则生成的class对象认为是不同的。

**ClassLoader重要方法**
* **Class loadClass(String name)** ：name参数指定类装载器需要装载类的名字，必须使用全限定类名，如：com.smart.bean.Car。该方法有一个重载方法 loadClass(String name,boolean resolve)，resolve参数告诉类装载器时候需要解析该类，在初始化之前，因考虑进行类解析的工作，但并不是所有的类都需要解析。如果JVM只需要知道该类是否存在或找出该类的超类，那么就不需要进行解析。
* **Class defineClass(String name,byte[] b,int len)**：将类文件的字节数组转换成JVM内部的java.lang.Class对象。字节数组可以从本地文件系统、远程网络获取。参数name为字节数组对应的全限定类名。
* **Class findClass(String name)**： 查找一个类，是重载ClassLoader时，重要的系统扩展点。这个方法会在loaderClass（）时被调用，用于自定义查找类的逻辑。如果
* **Class findSystemClass(String name)**：从本地文件系统在来Class文件。如果本地系统不存在该Class文件。则抛出ClassNotFoundException异常。该方法是JVM默认使用的装载机制
* **Class findLoadedClass(String name)**：调用该方法来查看ClassLoader是否已载入某个类。如果已载入，那么返回java.lang.Class对象；否则返回null。如果强行装载某个已存在的类，那么则抛出链接错误。
* **ClassLoader getParent()**：获取类装载器的父装载器。除根装载器外，所有的类装载器都有且仅有一个父装载器。ExtClassLoader的父装载器是根装载器，因为根装载器非java语言编写，所以无法获取，将返回null。



**JAVA类装载方式**
* 隐式加载
    * 不通过在代码里调用ClassLoader来加载需要的类。而是通过JVM来自动加载需要的类到内存的方式
    * 例如，当我们在类中继承或者引用某个类时，JVM在解析当前这个类时发现引用的类不存在，那么就会自动将这些类加载到内存中。
* 显示加载
    * 显示调用ClassLoader的相关方法加载类

**类加载的动态性体现:**
一个应用程序总是由n多个类组成，Java程序启动时，并不是一次把所有的类全部加载后再运行，它总是先把保证程序运行的基础类一次性加载到jvm中，其它类等到jvm用到的时候再加载，这样的好处是节省了内存的开销，因为java最早就是为嵌入式系统而设计的，内存宝贵，这是一种可以理解的机制，而用到时再加载这也是java动态性的一种体现


#### 1.5.19.2. 常见的类加载器
<a href="#menu" style="float:right">目录</a>

* JDK 默认提供了如下几种ClassLoader
    * Bootstrp loader
        * 启动类加载器主要加载的是JVM自身需要的类，这个类加载使用C++语言实现的，是虚拟机自身的一部分，它负责将 <JAVA_HOME>/lib路径下的核心类库或-Xbootclasspath参数指定的路径下的jar包加载到内存中，注意必由于虚拟机是按照文件名识别加载jar包的，如rt.jar，如果文件名不被虚拟机识别，即使把jar包丢到lib目录下也是没有作用的(出于安全考虑，Bootstrap启动类加载器只加载包名为java、javax、sun等开头的类)。
    * ExtClassLoader  
        * Bootstrp loader加载ExtClassLoader,并且将ExtClassLoader的父加载器设置为Bootstrp loader.ExtClassLoader是用Java写的，具体来说就是 sun.misc.Launcher$ExtClassLoader，ExtClassLoader主要加载%JAVA_HOME%/jre/lib/ext，此路径下的所有classes目录以及java.ext.dirs系统变量指定的路径中类库。
        * ExtClassLoader的父类不是Bootstrp loader
    * AppClassLoader 
        * Bootstrp loader加载完ExtClassLoader后，就会加载AppClassLoader,并且将AppClassLoader的父加载器指定为 ExtClassLoader。AppClassLoader也是用Java写成的，它的实现类是 sun.misc.Launcher$AppClassLoader，另外我们知道ClassLoader中有个getSystemClassLoader方法,此方法返回的正是AppclassLoader.AppClassLoader主要负责加载classpath所指定的位置的类或者是jar文档，它也是Java程序默认的类加载器。
        * 它负责加载系统类路径java -classpath或-D java.class.path 指定路径下的类库，也就是我们经常用到的classpath路径，开发者可以直接使用系统类加载器，一般情况下该类加载是程序中默认的类加载器，通过ClassLoader#getSystemClassLoader()方法可以获取到该类加载器。

在Java的日常应用程序开发中，类的加载几乎是由上述3种类加载器相互配合执行的，在必要时，我们还可以自定义类加载器，需要注意的是，Java虚拟机对class文件采用的是按需加载的方式，也就是说当需要使用该类时才会将它的class文件加载到内存生成class对象，而且加载某个类的class文件时，Java虚拟机采用的是双亲委派模式即把请求交由父类处理，它一种任务委派模式

* 类加载器间的关系(**并非指继承关系**)，主要可以分为以下4点
    * 启动类加载器，由C++实现，没有父类。
    * 拓展类加载器(ExtClassLoader)，由Java语言实现，父类加载器为null
    * 系统类加载器(AppClassLoader)，由Java语言实现，父类加载器为ExtClassLoader
    * 自定义类加载器，父类加载器肯定为AppClassLoader。
    
* 为什么要有三个类加载器
    * 一方面是分工，各自负责各自的区块，另一方面为了实现委托模型。


**类加载器之间是如何协调工作的**

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



#### 1.5.19.3. 类加载过程
<a href="#menu" style="float:right">目录</a>

类装载器就是寻找类或接口字节码文件进行解析并构造JVM内部对象表示的组件，在java中类装载器把一个类装入JVM，经过以下步骤：

* 加载：类加载过程的一个阶段：通过一个类的完全限定查找此类字节码文件，并利用字节码文件创建一个Class对象
* 链接
    * 验证：目的在于确保Class文件的字节流中包含信息符合当前虚拟机要求，不会危害虚拟机自身安全。主要包括四种验证，文件格式验证，元数据验证，字节码验证，符号引用验证。
    * 准备：为类变量(即static修饰的字段变量)分配内存并且设置该类变量的初始值即0(如static int i=5;这里只将i初始化为0，至于5的值将在初始化时赋值)，这里不包含用final修饰的static，因为final在编译的时候就会分配了，注意这里不会为实例变量分配初始化，类变量会分配在方法区中，而实例变量是会随着对象一起分配到Java堆中。
    * 解析：主要将常量池中的符号引用替换为直接引用的过程。符号引用就是一组符号来描述目标，可以是任何字面量，而直接引用就是直接指向目标的指针、相对偏移量或一个间接定位到目标的句柄。有类或接口的解析，字段解析，类方法解析，接口方法解析(这里涉及到字节码变量的引用，如需更详细了解，可参考《深入Java虚拟机》)。
* 初始化：类加载最后阶段，若该类具有超类，则对其进行初始化，执行静态初始化器和静态初始化成员变量(如前面只初始化了默认值的static变量将会在这个阶段赋值，成员变量也将被初始化)。


这便是类加载的5个过程，而类加载器的任务是根据一个类的全限定名来读取此类的二进制字节流到JVM中，然后转换为一个与目标类对应的java.lang.Class对象实例


类装载工作由ClassLoder和其子类负责。JVM在运行时会产生三个ClassLoader：根装载器，ExtClassLoader(扩展类装载器)和AppClassLoader，其中根装载器不是ClassLoader的子类，由C++编写，因此在java中看不到他，负责装载JRE的核心类库，如JRE目录下的rt.jar,charsets.jar等。ExtClassLoader是ClassLoder的子类，负责装载JRE扩展目录ext下的jar类包；AppClassLoader负责装载classpath路径下的类包，这三个类装载器存在父子层级关系****，即根装载器是ExtClassLoader的父装载器，ExtClassLoader是AppClassLoader的父装载器。默认情况下使用AppClassLoader装载应用程序的类


#### 1.5.19.4. ClassLoader的重要方法

**Class loadClass(String name)**
name参数指定类装载器需要装载类的名字，必须使用全限定类名，如：com.smart.bean.Car。该方法有一个重载方法 loadClass(String name,boolean resolve)，resolve参数告诉类装载器时候需要解析该类，在初始化之前，因考虑进行类解析的工作，但并不是所有的类都需要解析。如果JVM只需要知道该类是否存在或找出该类的超类，那么就不需要进行解析。

该方法加载指定名称（包括包名）的二进制类型，该方法在JDK1.2之后不再建议用户重写但用户可以直接调用该方法，loadClass()方法是ClassLoader类自己实现的，该方法中的逻辑就是双亲委派模式的实现，其源码如下，loadClass(String name, boolean resolve)是一个重载方法，resolve参数代表是否生成class对象的同时进行解析相关操作

```java
protected Class<?> loadClass(String name, boolean resolve)
      throws ClassNotFoundException
  {
      synchronized (getClassLoadingLock(name)) {
          // 先从缓存查找该class对象，找到就不用重新加载
          Class<?> c = findLoadedClass(name);
          if (c == null) {
              long t0 = System.nanoTime();
              try {
                  if (parent != null) {
                      //如果找不到，则委托给父类加载器去加载
                      c = parent.loadClass(name, false);
                  } else {
                  //如果没有父类，则委托给启动加载器去加载
                      c = findBootstrapClassOrNull(name);
                  }
              } catch (ClassNotFoundException e) {
                  // ClassNotFoundException thrown if class not found
                  // from the non-null parent class loader
              }

              if (c == null) {
                  // If still not found, then invoke findClass in order
                  // 如果都没有找到，则通过自定义实现的findClass去查找并加载
                  c = findClass(name);

                  // this is the defining class loader; record the stats
                  sun.misc.PerfCounter.getParentDelegationTime().addTime(t1 - t0);
                  sun.misc.PerfCounter.getFindClassTime().addElapsedTimeFrom(t1);
                  sun.misc.PerfCounter.getFindClasses().increment();
              }
          }
          if (resolve) {//是否需要在加载时进行解析
              resolveClass(c);
          }
          return c;
      }
  }

```
正如loadClass方法所展示的，当类加载请求到来时，先从缓存中查找该类对象，如果存在直接返回，如果不存在则交给该类加载去的父加载器去加载，倘若没有父加载则交给顶级启动类加载器去加载，最后倘若仍没有找到，则使用findClass()方法去加载（关于findClass()稍后会进一步介绍）。从loadClass实现也可以知道如果不想重新定义加载类的规则，也没有复杂的逻辑，只想在运行时加载自己指定的类，那么我们可以直接使用this.getClass().getClassLoder.loadClass("className")，这样就可以直接调用ClassLoader的loadClass方法获取到class对象。

**Class<?> findClass(String)**

 在JDK 1.2之前，在自定义类加载时，总会去继承ClassLoader类并重写loadClass方法，从而实现自定义的类加载类，但是在JDK1.2之后已不再建议用户去覆盖loadClass()方法，而是建议把自定义的类加载逻辑写在findClass()方法中，从前面的分析可知，findClass()方法是在loadClass()方法中被调用的，当loadClass()方法中父加载器加载失败后，则会调用自己的findClass()方法来完成类加载，这样就可以保证自定义的类加载器也符合双亲委托模式。需要注意的是ClassLoader类中并没有实现findClass()方法的具体代码逻辑，取而代之的是抛出ClassNotFoundException异常，同时应该知道的是findClass方法通常是和defineClass方法一起使用的(稍后会分析)，ClassLoader类中findClass()方法源码如下：

```java

//直接抛出异常
protected Class<?> findClass(String name) throws ClassNotFoundException {
        throw new ClassNotFoundException(name);
}


```

**Class defineClass(String name,byte[] b,int len)**

将类文件的字节数组转换成JVM内部的java.lang.Class对象。字节数组可以从本地文件系统、远程网络获取。参数name为字节数组对应的全限定类名。

defineClass()方法是用来将byte字节流解析成JVM能够识别的Class对象(ClassLoader中已实现该方法逻辑)，通过这个方法不仅能够通过class文件实例化class对象，也可以通过其他方式实例化class对象，如通过网络接收一个类的字节码，然后转换为byte字节流创建对应的Class对象，defineClass()方法通常与findClass()方法一起使用，一般情况下，在自定义类加载器时，会直接覆盖ClassLoader的findClass()方法并编写加载规则，取得要加载类的字节码后转换成流，然后调用defineClass()方法生成类的Class对象，简单例子如下：

```java
protected Class<?> findClass(String name) throws ClassNotFoundException {
	  // 获取类的字节数组
      byte[] classData = getClassData(name);  
      if (classData == null) {
          throw new ClassNotFoundException();
      } else {
	      //使用defineClass生成class对象
          return defineClass(name, classData, 0, classData.length);
      }
  }

```

需要注意的是，如果直接调用defineClass()方法生成类的Class对象，这个类的Class对象并没有解析(也可以理解为链接阶段，毕竟解析是链接的最后一步)，其解析操作需要等待初始化阶段进行。

**resolveClass(Class≺?≻ c)**

使用该方法可以使用类的Class对象创建完成也同时被解析。前面我们说链接阶段主要是对字节码进行验证，为类变量分配内存并设置初始值同时将字节码文件中的符号引用转换为直接引用。
上述4个方法是ClassLoader类中的比较重要的方法，也是我们可能会经常用到的方法。接看SercureClassLoader扩展了 ClassLoader，新增了几个与使用相关的代码源(对代码源的位置及其证书的验证)和权限定义类验证(主要指对class源码的访问权限)的方法，一般我们不会直接跟这个类打交道，更多是与它的子类URLClassLoader有所关联，前面说过，ClassLoader是一个抽象类，很多方法是空的没有实现，比如 findClass()、findResource()等。而URLClassLoader这个实现类为这些方法提供了具体的实现，并新增了URLClassPath类协助取得Class字节码流等功能，在编写自定义类加载器时，如果没有太过于复杂的需求，可以直接继承URLClassLoader类，这样就可以避免自己去编写findClass()方法及其获取字节码流的方式，使自定义类加载器编写更加简洁，下面是URLClassLoader的类图(利用IDEA生成的类图)

![](https://img-blog.csdn.net/20170620232230987?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvamF2YXplamlhbg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

从类图结构看出URLClassLoader中存在一个URLClassPath类，通过这个类就可以找到要加载的字节码流，也就是说URLClassPath类负责找到要加载的字节码，再读取成字节流，最后通过defineClass()方法创建类的Class对象。从URLClassLoader类的结构图可以看出其构造方法都有一个必须传递的参数URL[]，该参数的元素是代表字节码文件的路径,换句话说在创建URLClassLoader对象时必须要指定这个类加载器的到那个目录下找class文件。同时也应该注意URL[]也是URLClassPath类的必传参数，在创建URLClassPath对象时，会根据传递过来的URL数组中的路径判断是文件还是jar包，然后根据不同的路径创建FileLoader或者JarLoader或默认Loader类去加载相应路径下的class文件，而当JVM调用findClass()方法时，就由这3个加载器中的一个将class文件的字节码流加载到内存中，最后利用字节码流创建类的class对象。请记住，如果我们在定义类加载器时选择继承ClassLoader类而非URLClassLoader，必须手动编写findclass()方法的加载逻辑以及获取字节码流的逻辑。了解完URLClassLoader后接着看看剩余的两个类加载器，即拓展类加载器ExtClassLoader和系统类加载器AppClassLoader，这两个类都继承自URLClassLoader，是sun.misc.Launcher的静态内部类。sun.misc.Launcher主要被系统用于启动主应用程序，ExtClassLoader和AppClassLoader都是由sun.misc.Launcher创建的，其类主要类结构如下：

![](https://img-blog.csdn.net/20170621075845201?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvamF2YXplamlhbg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

它们间的关系正如前面所阐述的那样，同时我们发现ExtClassLoader并没有重写loadClass()方法，这足矣说明其遵循双亲委派模式，而AppClassLoader重载了loadCass()方法，但最终调用的还是父类loadClass()方法，因此依然遵守双亲委派模式，重载方法源码如下：

```java
 /**
  * Override loadClass 方法，新增包权限检测功能
  */
 public Class loadClass(String name, boolean resolve)
     throws ClassNotFoundException
 {
     int i = name.lastIndexOf('.');
     if (i != -1) {
         SecurityManager sm = System.getSecurityManager();
         if (sm != null) {
             sm.checkPackageAccess(name.substring(0, i));
         }
     }
     //依然调用父类的方法
     return (super.loadClass(name, resolve));
 }

```

其实无论是ExtClassLoader还是AppClassLoader都继承URLClassLoader类，因此它们都遵守双亲委托模型，这点是毋庸置疑的.

* Class findSystemClass(String name)：从本地文件系统在来Class文件。如果本地系统不存在该Class文件。则抛出ClassNotFoundException异常。该方法是JVM默认使用的装载机制
* Class findLoadedClass(String name)：调用该方法来查看ClassLoader是否已载入某个类。如果已载入，那么返回java.lang.Class对象；否则返回null。如果强行装载某个已存在的类，那么则抛出链接错误。
* ClassLoader getParent()：获取类装载器的父装载器。除根装载器外，所有的类装载器都有且仅有一个父装载器。ExtClassLoader的父装载器是根装载器，因为根装载器非java语言编写，所以无法获取，将返回null。


#### 1.5.19.5. 全盘负责与双亲委托机制
<a href="#menu" style="float:right">目录</a>

Java装载类使用“全盘负责委托机制”。“全盘负责”是指当一个ClassLoder装载一个类时，除非显示的使��另外一个ClassLoder，该类所依赖及引用的类也由这个ClassLoder载入；“委托机制”是指先委托父类装载器寻找目标类，只有在找不到的情况下才从自己的类路径中查找并装载目标类。这一点是从安全方面考虑的，试想如果一个人写了一个恶意的基础类（如java.lang.String）并加载到JVM将会引起严重的后果，但有了全盘负责制，java.lang.String永远是由根装载器来装载，避免以上情况发生 除了JVM默认的三个ClassLoder以外，第三方可以编写自己的类装载器，以实现一些特殊的需求。类文件被装载解析后，在JVM中都有一个对应的java.lang.Class对象，提供了类结构信息的描述。数组，枚举及基本数据类型，甚至void都拥有对应的Class对象。Class类没有public的构造方法，Class对象是在装载类时由JVM通过调用类装载器中的defineClass()方法自动构造的。


全盘负责”是指当一个ClassLoader装载一个类时，除非显示地使用另一个ClassLoader，则该类所依赖及引用的类也由这个CladdLoader载入。

例如，系统类加载器AppClassLoader加载入口类（含有main方法的类）时，会把main方法所依赖的类及引用的类也载入，依此类推。“全盘负责”机制也可称为当前类加载器负责机制。显然，入口类所依赖的类及引用的类的当前类加载器就是入口类的类加载器。

以上步骤只是调用了ClassLoader.loadClass(name)方法，并没有真正定义类。真正加载class字节码文件生成Class对象由“双亲委派”机制完成。

“双亲委派”是指子类加载器如果没有加载过该目标类，就先委托父类加载器加载该目标类，只有在父类加载器找不到字节码文件的情况下才从自己的类路径中查找并装载目标类。

* “双亲委派”机制加载Class的具体过程是：
    * 源ClassLoader先判断该Class是否已加载，如果已加载，则返回Class对象；如果没有则委托给父类加载器。
    * 父类加载器判断是否加载过该Class，如果已加载，则返回Class对象；如果没有则委托给祖父类加载器。
    * 依此类推，直到始祖类加载器（引用类加载器）。
    * 始祖类加载器判断是否加载过该Class，如果已加载，则返回Class对象；如果没有则尝试从其对应的类路径下寻找class字节码文件并载入。如果载入成功，则返回Class对象；如果载入失败，则委托给始祖类加载器的子类加载器。
    * 始祖类加载器的子类加载器尝试从其对应的类路径下寻找class字节码文件并载入。如果载入成功，则返回Class对象；如果载入失败，则委托给始祖类加载器的孙类加载器。
    * 依此类推，直到源ClassLoader。
    * 源ClassLoader尝试从其对应的类路径下寻找class字节码文件并载入。如果载入成功，则返回Class对象；如果载入失败，源ClassLoader不会再委托其子类加载器，而是抛出异常。
 

“双亲委派”机制只是Java推荐的机制，并不是强制的机制。

我们可以继承java.lang.ClassLoader类，实现自己的类加载器。如果想保持双亲委派模型，就应该重写findClass(name)方法；如果想破坏双亲委派模型，可以重写loadClass(name)方法。

**为什么要使用这种双亲委托模式呢？**
因为这样可以避免重复加载，当父亲已经加载了该类的时候，就没有必要子ClassLoader再加载一次。也就是避免类的重复加载.
考虑到安全因素，我们试想一下，如果不使用这种委托模式，那我们就可以随时使用自定义的String来动态替代java核心api中定义类型，这样会存在非常大的安全隐患，而双亲委托的方式，就可以避免这种情况，因为String已经在启动时被加载，所以用户自定义类是无法加载一个自定义的ClassLoader。

**思考：假如我们自己写了一个java.lang.String的类，我们是否可以替换调JDK本身的类？**
答案是否定的。我们不能实现。为什么呢？我看很多网上解释是说双亲委托机制解决这个问题，其实不是非常的准确。因为双亲委托机制是可以打破的，你完全可以自己写一个classLoader来加载自己写的java.lang.String类，但是你会发现也不会加载成功，具体就是因为针对java.*开头的类，jvm的实现中已经保证了必须由bootstrp来加载。

#### 1.5.19.6. 双亲委托机制的弊端
<a href="#menu" style="float:right">目录</a>

检查类是否已经加载的委托过程是单向的。这种方式虽然从lassLoader结构上说比较清晰，使各个ClassLoader的职责非常明确，但是同时会带来一个问题，即顶层的ClassLoader无法访问底层的ClassLoader所加载的类。


![](https://github.com/lgjlife/Java-Study/blob/master/pic/jvm/classloader.png?raw=true)

通常情况下，启动类加载器中的类为系统核心类，包括一些重要的系统接口，而在应用类加载器中，为应用类。按照这种模式，应用类访问系统类自然是没有问题的。但是系统类访问应用类就会出现问题。比如系统类中，提供了一个接口，该接口需要在应用类中得以实现，该接口还绑定一个工厂方法，用于创建该接口的实例，而接口和工厂方法都在启动类加载器中。这时，就会出现该工厂方法无法创建由应用类加载器加载的应用实例问题，拥有这种问题的组件有很多，比如JDBC等

#### 1.5.19.7. 双亲委托模式的补充
<a href="#menu" style="float:right">目录</a>

#### 1.5.19.8. 突破双亲模式
<a href="#menu" style="float:right">目录</a>





#### 1.5.19.9. 定义自已的ClassLoader
<a href="#menu" style="float:right">目录</a>

* 有以下几个情景是值得我们花费时间实现自己的classLoader的:
    * 我们需要的类不一定存放在已经设置好的classPath下(有系统类加载器AppClassLoader加载的路径)，对于自定义路径中的class类文件的加载，我们需要自己的ClassLoader
    * 有时我们不一定是从类文件中读取类，可能是从网络的输入流中读取类，这就需要做一些加密和解密操作，这就需要自己实现加载类的逻辑，当然其他的特殊处理也同样适用。
    * 可以定义类的实现机制，实现类的热部署,如OSGi中的bundle模块就是通过实现自己的ClassLoader实现的。

**在JVM中表示两个class对象是否为同一个类对象存在两个必要条件**
* 类的完整类名必须一致，包括包名。
* 加载这个类的ClassLoader(指ClassLoader实例对象)必须相同。

也就是说，在JVM中，即使这个两个类对象(class对象)来源同一个Class文件，被同一个虚拟机所加载，但只要加载它们的ClassLoader实例对象不同，那么这两个类对象也是不相等的，这是因为不同的ClassLoader实例对象都拥有不同的独立的类名称空间，所以加载的class对象也会存在不同的类名空间中，但前提是覆写loadclass方法，从前面双亲委派模式对loadClass()方法的源码分析中可以知，在方法第一步会通过Class<?> c = findLoadedClass(name);从缓存查找，类名完整名称相同则不会再次被加载，因此我们必须绕过缓存查询才能重新加载class对象。当然也可直接调用findClass()方法，这样也避免从缓存查找

```java
String rootDir="/Users/zejian/Downloads/Java8_Action/src/main/java/";
//创建两个不同的自定义类加载器实例
FileClassLoader loader1 = new FileClassLoader(rootDir);
FileClassLoader loader2 = new FileClassLoader(rootDir);
//通过findClass创建类的Class对象
Class<?> object1=loader1.findClass("com.zejian.classloader.DemoObj");
Class<?> object2=loader2.findClass("com.zejian.classloader.DemoObj");

System.out.println("findClass->obj1:"+object1.hashCode());
System.out.println("findClass->obj2:"+object2.hashCode());

/**
  * 直接调用findClass方法输出结果:
  * findClass->obj1:723074861
    findClass->obj2:895328852
    生成不同的实例
  */

```
如果调用父类的loadClass方法，结果如下，除非重写loadClass()方法去掉缓存查找步骤，不过现在一般都不建议重写loadClass()方法。

```java
//直接调用父类的loadClass()方法
Class<?> obj1 =loader1.loadClass("com.zejian.classloader.DemoObj");
Class<?> obj2 =loader2.loadClass("com.zejian.classloader.DemoObj");

//不同实例对象的自定义类加载器
System.out.println("loadClass->obj1:"+obj1.hashCode());
System.out.println("loadClass->obj2:"+obj2.hashCode());
//系统类加载器
System.out.println("Class->obj3:"+DemoObj.class.hashCode());

/**
* 直接调用loadClass方法的输出结果,注意并没有重写loadClass方法
* loadClass->obj1:1872034366
  loadClass->obj2:1872034366
  Class->    obj3:1872034366
  都是同一个实例
*/


```
所以如果不从缓存查询相同完全类名的class对象，那么只有ClassLoader的实例对象不同，同一字节码文件创建的class对象自然也不会相同。

实现自定义类加载器需要继承ClassLoader或者URLClassLoader，继承ClassLoader则需要自己重写findClass()方法并编写加载逻辑，继承URLClassLoader则可以省去编写findClass()方法以及class文件加载转换成字节码流的代码。


**方式1:继承ClassLoader**
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
说明HelloWorld类是被我们的自定义类加载器MyClassLoader加载的

调用了父类的loadClass()方法，该方法使用指定的二进制名称来加载类，下面是loadClass方法的源代码：
```java
protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException
    {
        synchronized (getClassLoadingLock(name))
        {
            // 第一步先检查这个类是否已经被加载
            Class<?> c = findLoadedClass(name);
            if (c == null)
            {
                //没有被加载
                long t0 = System.nanoTime();
                try
                {
                    //parent为父加载器
                    if (parent != null)
                    {
                        //将搜索类或资源的任务委托给其父类加载器
                        c = parent.loadClass(name, false);
                    } else
                    {
                        //检查该class是否被BootstrapClassLoader加载
                        c = findBootstrapClassOrNull(name);
                    }
                } 
                catch (ClassNotFoundException e)
                {
                    // ClassNotFoundException thrown if class not found
                    // from the non-null parent class loader
                }
                if (c == null)
                {
                    //如果上述两步均没有找到加载的class，则调用findClass()方法
                    long t1 = System.nanoTime();
                    c = findClass(name);
                    // this is the defining class loader; record the stats
                    sun.misc.PerfCounter.getParentDelegationTime().addTime(t1 - t0);
                    sun.misc.PerfCounter.getFindClassTime().addElapsedTimeFrom(t1);
                    sun.misc.PerfCounter.getFindClasses().increment();
                }
            }
            if (resolve)
            {
                resolveClass(c);
            }
            return c;
        }
    }
```
这个方法首先检查指定class是否已经被加载，如果已被加载过，则调用resolveClass()方法链接指定的类,如果还未加载，则先将搜索类或资源的任务委托给其父类加载器，检查该class是否被BootstrapClassLoader加载，如果上述两步均没有找到加载的class，则调用findClass()方法，在我们自定义的加载器中，我们重写了findClass方法，去我们指定的路径下加载class文件。

　另外，我们自定义的类加载器没有指定父加载器，在JVM规范中不指定父类加载器的情况下，默认采用系统类加载器即AppClassLoader作为其父加载器，所以在使用该自定义类加载器时，需要加载的类不能在类路径中，否则的话根据双亲委派模型的原则，待加载的类会由系统类加载器加载。如果一定想要把自定义加载器需要加载的类放在类路径中, 就要把自定义类加载器的父加载器设置为null。 


**方式二**：继承URLClassLoader类，然后设置自定义路径的URL来加载URL下的类。
我们将指定的目录转换为URL路径，然后重写findClass方法。

```java
/**
 * Created by zejian on 2017/6/21.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
public class FileUrlClassLoader extends URLClassLoader {

    public FileUrlClassLoader(URL[] urls, ClassLoader parent) {
        super(urls, parent);
    }

    public FileUrlClassLoader(URL[] urls) {
        super(urls);
    }

    public FileUrlClassLoader(URL[] urls, ClassLoader parent, URLStreamHandlerFactory factory) {
        super(urls, parent, factory);
    }


    public static void main(String[] args) throws ClassNotFoundException, MalformedURLException {
        String rootDir="/Users/zejian/Downloads/Java8_Action/src/main/java/";
        //创建自定义文件类加载器
        File file = new File(rootDir);
        //File to URI
        URI uri=file.toURI();
        URL[] urls={uri.toURL()};

        FileUrlClassLoader loader = new FileUrlClassLoader(urls);

        try {
            //加载指定的class文件
            Class<?> object1=loader.loadClass("com.zejian.classloader.DemoObj");
            System.out.println(object1.newInstance().toString());
          
            //输出结果:I am DemoObj
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

```
非常简洁除了需要重写构造器外无需编写findClass()方法及其class文件的字节流转换逻辑。




#### 1.5.19.10. 实现类的热部署

**什么是类的热部署？**
　　所谓热部署，就是在应用正在运行的时候升级软件，不需要重新启用应用。

　　对于Java应用程序来说，热部署就是运行时更新Java类文件。在基于Java的应用服务器实现热部署的过程中，类装入器扮演着重要的角色。大多数基于Java的应用服务器，包括EJB服务器和Servlet容器，都支持热部署。

　　类装入器不能重新装入一个已经装入的类，但只要使用一个新的类装入器实例，就可以将类再次装入一个正在运行的应用程序。

**如何实现Java类的热部署**
　　前面的分析，我们已经知道，JVM在加载类之前会检查请求的类是否已经被加载过来，也就是要调用findLoadedClass方法查看是否能够返回类实例。如果类已经加载过来，再调用loadClass会导致类冲突。

　　但是，JVM判断一个类是否是同一个类有两个条件：一是看这个类的完整类名是否一样(包括包名)，二是看加载这个类的ClassLoader加载器是否是同一个(既是是同一个ClassLoader类的两个实例，加载同一个类也会不一样)。

　　所以，要实现类的热部署可以创建不同的ClassLoader的实例对象，然后通过这个不同的实例对象来加载同名的类。


#### 1.5.19.11. 常见加载类错误

* ClassNotFoudException
    * 类不存在
* NoClassDefFoundError
* UnsatisfiedLinkError
* ClassCastException
    * 强制类型转换时出现得到错误，比如将A类型转换为没有继承或实现关系的B类型时出现
* ExceptionOInInitializerError

#### 1.5.19.12. 线程上下文类加载器
<a href="#menu" style="float:right">目录</a>

　　线程上下文类加载器（context class loader）是从 JDK 1.2 开始引入的。类 java.lang.Thread中的方法 getContextClassLoader()和 setContextClassLoader(ClassLoader cl)用来获取和设置线程的上下文类加载器。如果没有通过 setContextClassLoader(ClassLoader cl)方法进行设置的话，线程将继承其父线程的上下文类加载器。Java 应用运行的初始线程的上下文类加载器是系统类加载器。在线程中运行的代码可以通过此类加载器来加载类和资源。

　　前面提到的类加载器的代理模式并不能解决 Java 应用开发中会遇到的类加载器的全部问题。Java 提供了很多服务提供者接口（Service Provider Interface，SPI），允许第三方为这些接口提供实现。常见的 SPI 有 JDBC、JCE、JNDI、JAXP 和 JBI 等。这些 SPI 的接口由 Java 核心库来提供，如 JAXP 的 SPI 接口定义包含在 javax.xml.parsers包中。这些 SPI 的实现代码很可能是作为 Java 应用所依赖的 jar 包被包含进来，可以通过类路径（CLASSPATH）来找到，如实现了 JAXP SPI 的 Apache Xerces所包含的 jar 包。SPI 接口中的代码经常需要加载具体的实现类。如 JAXP 中的 javax.xml.parsers.DocumentBuilderFactory类中的 newInstance()方法用来生成一个新的 DocumentBuilderFactory的实例。这里的实例的真正的类是继承自 javax.xml.parsers.DocumentBuilderFactory，由 SPI 的实现所提供的。如在 Apache Xerces 中，实现的类是 org.apache.xerces.jaxp.DocumentBuilderFactoryImpl。而问题在于，SPI 的接口是 Java 核心库的一部分，是由引导类加载器来加载的；SPI 实现的 Java 类一般是由系统类加载器来加载的。引导类加载器是无法找到 SPI 的实现类的，因为它只加载 Java 的核心库。它也不能代理给系统类加载器，因为它是系统类加载器的祖先类加载器。也就是说，类加载器的代理模式无法解决这个问题。
　　线程上下文类加载器正好解决了这个问题。如果不做任何的设置，Java 应用的线程的上下文类加载器默认就是系统上下文类加载器。在 SPI 接口的代码中使用线程上下文类加载器，就可以成功的加载到 SPI 实现的类。线程上下文类加载器在很多 SPI 的实现中都会用到。

在Java应用中存在着很多服务提供者接口（Service Provider Interface，SPI），这些接口允许第三方为它们提供实现，如常见的 SPI 有 JDBC、JNDI等，这些 SPI 的接口属于 Java 核心库，一般存在rt.jar包中，由Bootstrap类加载器加载，而 SPI 的第三方实现代码则是作为Java应用所依赖的 jar 包被存放在classpath路径下，由于SPI接口中的代码经常需要加载具体的第三方实现类并调用其相关方法，但SPI的核心接口类是由引导类加载器来加载的，而Bootstrap类加载器无法直接加载SPI的实现类，同时由于双亲委派模式的存在，Bootstrap类加载器也无法反向委托AppClassLoader加载器SPI的实现类。在这种情况下，我们就需要一种特殊的类加载器来加载第三方的类库，而线程上下文类加载器就是很好的选择。
    线程上下文类加载器（contextClassLoader）是从 JDK 1.2 开始引入的，我们可以通过java.lang.Thread类中的getContextClassLoader()和 setContextClassLoader(ClassLoader cl)方法来获取和设置线程的上下文类加载器。如果没有手动设置上下文类加载器，线程将继承其父线程的上下文类加载器，初始线程的上下文类加载器是系统类加载器（AppClassLoader）,在线程中运行的代码可以通过此类加载器来加载类和资源，如下图所示，以jdbc.jar加载为例

![](https://img-blog.csdn.net/20170625143404387?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvamF2YXplamlhbg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

从图可知rt.jar核心包是有Bootstrap类加载器加载的，其内包含SPI核心接口类，由于SPI中的类经常需要调用外部实现类的方法，而jdbc.jar包含外部实现类(jdbc.jar存在于classpath路径)无法通过Bootstrap类加载器加载，因此只能委派线程上下文类加载器把jdbc.jar中的实现类加载到内存以便SPI相关类使用。显然这种线程上下文类加载器的加载方式破坏了“双亲委派模型”，它在执行过程中抛弃双亲委派加载链模式，使程序可以逆向使用类加载器，当然这也使得Java类加载器变得更加灵活。


#### 1.5.19.13. 类加载器与Web容器
<a href="#menu" style="float:right">目录</a>
　　对于运行在 Java EE容器中的 Web 应用来说，类加载器的实现方式与一般的 Java 应用有所不同。不同的 Web 容器的实现方式也会有所不同。以 Apache Tomcat 来说，每个 Web 应用都有一个对应的类加载器实例。该类加载器也使用代理模式，所不同的是它是首先尝试去加载某个类，如果找不到再代理给父类加载器。这与一般类加载器的顺序是相反的。这是 Java Servlet 规范中的推荐做法，其目的是使得 Web 应用自己的类的优先级高于 Web 容器提供的类。这种代理模式的一个例外是：Java 核心库的类是不在查找范围之内的。这也是为了保证 Java 核心库的类型安全。
　　
绝大多数情况下，Web 应用的开发人员不需要考虑与类加载器相关的细节。下面给出几条简单的原则：
（1）每个 Web 应用自己的 Java 类文件和使用的库的 jar 包，分别放在 WEB-INF/classes和 WEB-INF/lib目录下面。
（2）多个应用共享的 Java 类文件和 jar 包，分别放在 Web 容器指定的由所有 Web 应用共享的目录下面。
（3）当出现找不到类的错误时，检查当前类的类加载器和当前线程的上下文类加载器是否正确。


#### 1.5.19.14. 常见问题分析
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

　　Ps：���题3和问题4的推断结论是基于用户自定义的类加载器本身延续了java.lang.ClassLoader.loadClass（…）默认委派逻辑，如果用户对这一默认委派逻辑进行了改变，以上推断结论就不一定成立了，详见问题5。

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



### 1.5.20. 字节码执行
<a href="#menu" style="float:right">目录</a>

* 机器码
    * 机器码(machine code)是CPU可直接解读的指令。机器码与硬件等有关，不同的CPU架构支持的硬件码也不相同。
* 字节码
    * 字节码（bytecode）是一种包含执行程序、由一序列 op 代码/数据对 组成的二进制文件。字节码是一种中间码，它比机器码更抽象，需要直译器转译后才能成为机器码的中间代码。通常情况下它是已经经过编译，但与特定机器码无关。字节码主要为了实现特定软件运行和软件环境、与硬件环境无关。


字节码的实现方式是通过编译器和虚拟机器。编译器将源码编译成字节码，特定平台上的虚拟机器将字节码转译为可以直接执行的指令。

![](https://segmentfault.com/img/remote/1460000009956537?w=835&h=236)


#### 1.5.20.1. 查看类文件的字节码工具javap
<a href="#menu" style="float:right">目录</a>


javap是jdk自带的反解析工具。它的作用就是根据class字节码文件，反解析出当前类对应的code区（汇编指令）、本地变量表、异常表和代码行偏移量映射表、常量池等等信息。
当然这些信息中，有些信息（如本地变量表、指令和代码行偏移量映射表、常量池中方法的参数名称等等）需要在使用javac编译成class文件时，指定参数才能输出，比如，你直接javac xx.java，就不会在生成对应的局部变量表等信息，如果你使用javac -g xx.java就可以生成所有相关信息了。如果你使用的eclipse，则默认情况下，eclipse在编译时会帮你生成局部变量表、指令和代码行偏移量映射表等信息的。
通过反编译生成的汇编代码，我们可以深入的了解java代码的工作机制。比如我们可以查看i++；这行代码实际运行时是先获取变量i的值，然后将这个值加1，最后再将加1后的值赋值给变量i。
通过局部变量表，我们可以查看局部变量的作用域范围、所在槽位等信息，甚至可以看到槽位复用等信息。

```
lgj@lgj-Lenovo-G470:~$ javap --help
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
* -hep  --hep  -?        输出此用法消息
* -version                 版本信息，其实是当前javap所在jdk的版本信息，不是cass在哪个jdk下生成的。
* -v  -verbose             输出附加信息（包括行号、本地变量表，反汇编等详细信息）
* -l                        输出行号和本地变量表
* -pubic                    仅显示公共类和成员
* -protected               显示受保护的/公共类和成员
* -package                 显示程序包/受保护的/公共类 和成员 (默认)
* -p  -private             显示所有类和成员
* -c                       对代码进行反汇编
* -s                       输出内部类型签名
* -sysinfo                 显示正在处理的类的系统信息 (路径, 大小, 日期, MD5 散列)
* -constants               显示静态最终常量
* -casspath < path>        指定查找用户类文件的位置
* -bootcasspath < path>    覆盖引导类文件的位置

一般常用的是-v -l -c三个选项。
javap -v classxx，不仅会输出行号、本地变量表信息、反编译汇编代码，还会输出当前类用到的常量池等信息。
javap -l 会输出行号和本地变量表信息。
javap -c 会对当前class字节码进行反编译生成汇编代码。
查看汇编代码时，需要知道里面的jvm指令，可以参考[官方文档:https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-6.html#jvms-6.5.iconst_i](https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-6.html#jvms-6.5.iconst_i)：

另外通过jclasslib工具也可以看到上面这些信息，而且是可视化的，效果更好一些。

```java
package com.code.base.collector;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String args[]){
        Arrays.asList();
    }
}

```
javap -c -v ArraysDemo.class

```yml
#源文件名称
Classfile /home/lgj/aProject/JavaCode/Java-base/target/classes/com/code/base/collector/ArraysDemo.class
  Last modified Aug 5, 2019; size 514 bytes
  MD5 checksum 53801876d383dc25492a98f309774012
  Compiled from "ArraysDemo.java"
public class com.code.base.collector.ArraysDemo
#小版本和大版本号
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
  #类中所有的常量
Constant pool:
   #1 = Methodref          #2.#18         // java/lang/Object."<init>":()V
   #2 = Class              #19            // java/lang/Object
   #3 = Methodref          #20.#21        // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
   #4 = Class              #22            // com/code/base/collector/ArraysDemo
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Utf8               Code
   #8 = Utf8               LineNumberTable
   #9 = Utf8               LocalVariableTable
  #10 = Utf8               this
  #11 = Utf8               Lcom/code/base/collector/ArraysDemo;
  #12 = Utf8               main
  #13 = Utf8               ([Ljava/lang/String;)V
  #14 = Utf8               args
  #15 = Utf8               [Ljava/lang/String;
  #16 = Utf8               SourceFile
  #17 = Utf8               ArraysDemo.java
  #18 = NameAndType        #5:#6          // "<init>":()V
  #19 = Utf8               java/lang/Object
  #20 = Class              #23            // java/util/Arrays
  #21 = NameAndType        #24:#25        // asList:([Ljava/lang/Object;)Ljava/util/List;
  #22 = Utf8               com/code/base/collector/ArraysDemo
  #23 = Utf8               java/util/Arrays
  #24 = Utf8               asList
  #25 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
{
    #方法
    #第一个方法为类的构造函数，是编译器自动插入的
  public com.code.base.collector.ArraysDemo();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
    #栈的大小，局部变量表大小，字节码指令，行号，局部变量表等信息
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 5: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/code/base/collector/ArraysDemo;
    #第二个方法为main方法
  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
    #
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: anewarray     #2                  // class java/lang/Object
         4: invokestatic  #3                  // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
         7: pop
         8: return
      LineNumberTable:
        line 10: 0
        line 13: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  args   [Ljava/lang/String;
}
SourceFile: "ArraysDemo.java"


```


#### 1.5.20.2. 虚拟机常用指令
<a href="#menu" style="float:right">目录</a>

可以看到大多数指令都有前缀i,f，d等，代表操作的类型
* i int整形
* l long
* f float
* d double
* a 对象索引
* b byte
* c char
* s short

|指令码|助记符|说明
|---|---|---|
|0x00|nop|什么都不做
|0x01|aconst_null|将null推送至栈顶
|0x02|iconst_m1|将int型-1推送至栈顶
|0x03|iconst_0|将int型0推送至栈顶
|0x04|iconst_1|将int型1推送至栈顶
|0x05|iconst_2|将int型2推送至栈顶
|0x06|iconst_3|将int型3推送至栈顶
|0x07|iconst_4|将int型4推送至栈顶
|0x08|iconst_5|将int型5推送至栈顶
|0x09|lconst_0|将long型0推送至栈顶
|0x0a|lconst_1|将long型1推送至栈顶
|0x0b|fconst_0|将float型0推送至栈顶
|0x0c|fconst_1|将float型1推送至栈顶
|0x0d|fconst_2|将float型2推送至栈顶
|0x0e|dconst_0|将double型0推送至栈顶
|0x0f|dconst_1|将double型1推送至栈顶
|0x10|bipush|将单字节的常量值(-128~127)推送至栈顶
|0x11|sipush|将一个短整型常量值(-32768~32767)推送至栈顶
|0x12|ldc|将int, float或String型常量值从常量池中推送至栈顶
|0x13|ldc_w|将int, float或String型常量值从常量池中推送至栈顶（宽索引）
|0x14|ldc2_w|将long或double型常量值从常量池中推送至栈顶（宽索引）
|0x15|iload|将指定的int型本地变量推送至栈顶
|0x16|lload|将指定的long型本地变量推送至栈顶
|0x17|fload|将指定的float型本地变量推送至栈顶
|0x18|dload|将指定的double型本地变量推送至栈顶
|0x19|aload|将指定的引用类型本地变量推送至栈顶
|0x1a|iload_0|将第一个int型本地变量推送至栈顶
|0x1b|iload_1|将第二个int型本地变量推送至栈顶
|0x1c|iload_2|将第三个int型本地变量推送至栈顶
|0x1d|iload_3|将第四个int型本地变量推送至栈顶
|0x1e|lload_0|将第一个long型本地变量推送至栈顶
|0x1f|lload_1|将第二个long型本地变量推送至栈顶
|0x20|lload_2|将第三个long型本地变量推送至栈顶
|0x21|lload_3|将第四个long型本地变量推送至栈顶
|0x22|fload_0|将第一个float型本地变量推送至栈顶
|0x23|fload_1|将第二个float型本地变量推送至栈顶
|0x24|fload_2|将第三个float型本地变量推送至栈顶
|0x25|fload_3|将第四个float型本地变量推送至栈顶
|0x26|dload_0|将第一个double型本地变量推送至栈顶
|0x27|dload_1|将第二个double型本地变量推送至栈顶
|0x28|dload_2|将第三个double型本地变量推送至栈顶
|0x29|dload_3|将第四个double型本地变量推送至栈顶
|0x2a|aload_0|将第一个引用类型本地变量推送至栈顶
|0x2b|aload_1|将第二个引用类型本地变量推送至栈顶
|0x2c|aload_2|将第三个引用类型本地变量推送至栈顶
|0x2d|aload_3|将第四个引用类型本地变量推送至栈顶
|0x2e|iaload|将int型数组指定索引的值推送至栈顶
|0x2f|laload|将long型数组指定索引的值推送至栈顶
|0x30|faload|将float型数组指定索引的值推送至栈顶
|0x31|daload|将double型数组指定索引的值推送至栈顶
|0x32|aaload|将引用型数组指定索引的值推送至栈顶
|0x33|baload|将boolean或byte型数组指定索引的值推送至栈顶
|0x34|caload|将char型数组指定索引的值推送至栈顶
|0x35|saload|将short型数组指定索引的值推送至栈顶
|0x36|istore|将栈顶int型数值存入指定本地变量
|0x37|lstore|将栈顶long型数值存入指定本地变量
|0x38|fstore|将栈顶float型数值存入指定本地变量
|0x39|dstore|将栈顶double型数值存入指定本地变量
|0x3a|astore|将栈顶引用型数值存入指定本地变量
|0x3b|istore_0|将栈顶int型数值存入第一个本地变量
|0x3c|istore_1|将栈顶int型数值存入第二个本地变量
|0x3d|istore_2|将栈顶int型数值存入第三个本地变量
|0x3e|istore_3|将栈顶int型数值存入第四个本地变量
|0x3f|lstore_0|将栈顶long型数值存入第一个本地变量
|0x40|lstore_1|将栈顶long型数值存入第二个本地变量
|0x41|lstore_2|将栈顶long型数值存入第三个本地变量
|0x42|lstore_3|将栈顶long型数值存入第四个本地变量
|0x43|fstore_0|将栈顶float型数值存入第一个本地变量
|0x44|fstore_1|将栈顶float型数值存入第二个本地变量
|0x45|fstore_2|将栈顶float型数值存入第三个本地变量
|0x46|fstore_3|将栈顶float型数值存入第四个本地变量
|0x47|dstore_0|将栈顶double型数值存入第一个本地变量
|0x48|dstore_1|将栈顶double型数值存入第二个本地变量
|0x49|dstore_2|将栈顶double型数值存入第三个本地变量
|0x4a|dstore_3|将栈顶double型数值存入第四个本地变量
|0x4b|astore_0|将栈顶引用型数值存入第一个本地变量
|0x4c|astore_1|将栈顶引用型数值存入第二个本地变量
|0x4d|astore_2|将栈顶引用型数值存入第三个本地变量
|0x4e|astore_3|将栈顶引用型数值存入第四个本地变量
|0x4f|iastore|将栈顶int型数值存入指定数组的指定索引位置
|0x50|lastore|将栈顶long型数值存入指定数组的指定索引位置
|0x51|fastore|将栈顶float型数值存入指定数组的指定索引位置
|0x52|dastore|将栈顶double型数值存入指定数组的指定索引位置
|0x53|aastore|将栈顶引用型数值存入指定数组的指定索引位置
|0x54|bastore|将栈顶boolean或byte型数值存入指定数组的指定索引位置
|0x55|castore|将栈顶char型数值存入指定数组的指定索引位置
|0x56|sastore|将栈顶short型数值存入指定数组的指定索引位置
|0x57|pop|将栈顶数值弹出 (数值不能是long或double类型的)
|0x58|pop2|将栈顶的一个（long或double类型的)或两个数值弹出（其它）
|0x59|dup|复制栈顶数值并将复制值压入栈顶
|0x5a|dup_x1|复制栈顶数值并将两个复制值压入栈顶
|0x5b|dup_x2|复制栈顶数值并将三个（或两个）复制值压入栈顶
|0x5c|dup2|复制栈顶一个（long或double类型的)或两个（其它）数值并将复制值压入栈顶
|0x5d|dup2_x1|<待补充>
|0x5e|dup2_x2|<待补充>
|0x5f|swap|将栈最顶端的两个数值互换(数值不能是long或double类型的)
|0x60|iadd|将栈顶两int型数值相加并将结果压入栈顶
|0x61|ladd|将栈顶两long型数值相加并将结果压入栈顶
|0x62|fadd|将栈顶两float型数值相加并将结果压入栈顶
|0x63|dadd|将栈顶两double型数值相加并将结果压入栈顶
|0x64|isub|将栈顶两int型数值相减并将结果压入栈顶
|0x65|lsub|将栈顶两long型数值相减并将结果压入栈顶
|0x66|fsub|将栈顶两float型数值相减并将结果压入栈顶
|0x67|dsub|将栈顶两double型数值相减并将结果压入栈顶
|0x68|imul|将栈顶两int型数值相乘并将结果压入栈顶
|0x69|lmul|将栈顶两long型数值相乘并将结果压入栈顶
|0x6a|fmul|将栈顶两float型数值相乘并将结果压入栈顶
|0x6b|dmul|将栈顶两double型数值相乘并将结果压入栈顶
|0x6c|idiv|将栈顶两int型数值相除并将结果压入栈顶
|0x6d|ldiv|将栈顶两long型数值相除并将结果压入栈顶
|0x6e|fdiv|将栈顶两float型数值相除并将结果压入栈顶
|0x6f|ddiv|将栈顶两double型数值相除并将结果压入栈顶
|0x70|irem|将栈顶两int型数值作取模运算并将结果压入栈顶
|0x71|lrem|将栈顶两long型数值作取模运算并将结果压入栈顶
|0x72|frem|将栈顶两float型数值作取模运算并将结果压入栈顶
|0x73|drem|将栈顶两double型数值作取模运算并将结果压入栈顶
|0x74|ineg|将栈顶int型数值取负并将结果压入栈顶
|0x75|lneg|将栈顶long型数值取负并将结果压入栈顶
|0x76|fneg|将栈顶float型数值取负并将结果压入栈顶
|0x77|dneg|将栈顶double型数值取负并将结果压入栈顶
|0x78|ishl|将int型数值左移位指定位数并将结果压入栈顶
|0x79|lshl|将long型数值左移位指定位数并将结果压入栈顶
|0x7a|ishr|将int型数值右（符号）移位指定位数并将结果压入栈顶
|0x7b|lshr|将long型数值右（符号）移位指定位数并将结果压入栈顶
|0x7c|iushr|将int型数值右（无符号）移位指定位数并将结果压入栈顶
|0x7d|lushr|将long型数值右（无符号）移位指定位数并将结果压入栈顶
|0x7e|iand|将栈顶两int型数值作“按位与”并将结果压入栈顶
|0x7f|land|将栈顶两long型数值作“按位与”并将结果压入栈顶
|0x80|ior|将栈顶两int型数值作“按位或”并将结果压入栈顶
|0x81|lor|将栈顶两long型数值作“按位或”并将结果压入栈顶
|0x82|ixor|将栈顶两int型数值作“按位异或”并将结果压入栈顶
|0x83|lxor|将栈顶两long型数值作“按位异或”并将结果压入栈顶
|0x84|iinc|将指定int型变量增加指定值（i++, i--, i+=2）
|0x85|i2l|将栈顶int型数值强制转换成long型数值并将结果压入栈顶
|0x86|i2f|将栈顶int型数值强制转换成float型数值并将结果压入栈顶
|0x87|i2d|将栈顶int型数值强制转换成double型数值并将结果压入栈顶
|0x88|l2i|将栈顶long型数值强制转换成int型数值并将结果压入栈顶
|0x89|l2f|将栈顶long型数值强制转换成float型数值并将结果压入栈顶
|0x8a|l2d|将栈顶long型数值强制转换成double型数值并将结果压入栈顶
|0x8b|f2i|将栈顶float型数值强制转换成int型数值并将结果压入栈顶
|0x8c|f2l|将栈顶float型数值强制转换成long型数值并将结果压入栈顶
|0x8d|f2d|将栈顶float型数值强制转换成double型数值并将结果压入栈顶
|0x8e|d2i|将栈顶double型数值强制转换成int型数值并将结果压入栈顶
|0x8f|d2l|将栈顶double型数值强制转换成long型数值并将结果压入栈顶
|0x90|d2f|将栈顶double型数值强制转换成float型数值并将结果压入栈顶
|0x91|i2b|将栈顶int型数值强制转换成byte型数值并将结果压入栈顶
|0x92|i2c|将栈顶int型数值强制转换成char型数值并将结果压入栈顶
|0x93|i2s|将栈顶int型数值强制转换成short型数值并将结果压入栈顶
|0x94|lcmp|比较栈顶两long型数值大小，并将结果（1，0，-1）压入栈顶
|0x95|fcmpl|比较栈顶两float型数值大小，并将结果（1，0，-1）压入栈顶；当其中一个数值为NaN时，将-1压入栈顶
|0x96|fcmpg|比较栈顶两float型数值大小，并将结果（1，0，-1）压入栈顶；当其中一个数值为NaN时，将1压入栈顶
|0x97|dcmpl|比较栈顶两double型数值大小，并将结果（1，0，-1）压入栈顶；当其中一个数值为NaN时，将-1压入栈顶
|0x98|dcmpg|比较栈顶两double型数值大小，并将结果（1，0，-1）压入栈顶；当其中一个数值为NaN时，将1压入栈顶
|0x99|ifeq|当栈顶int型数值等于0时跳转
|0x9a|ifne|当栈顶int型数值不等于0时跳转
|0x9b|iflt|当栈顶int型数值小于0时跳转
|0x9c|ifge|当栈顶int型数值大于等于0时跳转
|0x9d|ifgt|当栈顶int型数值大于0时跳转
|0x9e|ifle|当栈顶int型数值小于等于0时跳转
|0x9f|if_icmpeq|比较栈顶两int型数值大小，当结果等于0时跳转
|0xa0|if_icmpne|比较栈顶两int型数值大小，当结果不等于0时跳转
|0xa1|if_icmplt|比较栈顶两int型数值大小，当结果小于0时跳转
|0xa2|if_icmpge|比较栈顶两int型数值大小，当结果大于等于0时跳转
|0xa3|if_icmpgt|比较栈顶两int型数值大小，当结果大于0时跳转
|0xa4|if_icmple|比较栈顶两int型数值大小，当结果小于等于0时跳转
|0xa5|if_acmpeq|比较栈顶两引用型数值，当结果相等时跳转
|0xa6|if_acmpne|比较栈顶两引用型数值，当结果不相等时跳转
|0xa7|goto|无条件跳转
|0xa8|jsr|跳转至指定16位offset位置，并将jsr下一条指令地址压入栈顶
|0xa9|ret|返回至本地变量指定的index的指令位置（一般与jsr, jsr_w联合使用）
|0xaa|tableswitch|用于switch条件跳转，case值连续（可变长度指令）
|0xab|lookupswitch|用于switch条件跳转，case值不连续（可变长度指令）
|0xac|ireturn|从当前方法返回int
|0xad|lreturn|从当前方法返回long
|0xae|freturn|从当前方法返回float
|0xaf|dreturn|从当前方法返回double
|0xb0|areturn|从当前方法返回对象引用
|0xb1|return|从当前方法返回void
|0xb2|getstatic|获取指定类的静态域，并将其值压入栈顶
|0xb3|putstatic|为指定的类的静态域赋值
|0xb4|getfield|获取指定类的实例域，并将其值压入栈顶
|0xb5|putfield|为指定的类的实例域赋值
|0xb6|invokevirtual|调用实例方法
|0xb7|invokespecial|调用超类构造方法，实例初始化方法，私有方法
|0xb8|invokestatic|调用静态方法
|0xb9|invokeinterface|调用接口方法
|0xba|-- 
|0xbb|new|创建一个对象，并将其引用值压入栈顶
|0xbc|newarray|创建一个指定原始类型（如int, float, char…）的数组，并将其引用值压入栈顶
|0xbd|anewarray|创建一个引用型（如类，接口，数组）的数组，并将其引用值压入栈顶
|0xbe|arraylength|获得数组的长度值并压入栈顶
|0xbf|athrow|将栈顶的异常抛出
|0xc0|checkcast|检验类型转换，检验未通过将抛出ClassCastException
|0xc1|instanceof|检验对象是否是指定的类的实例，如果是将1压入栈顶，否则将0压入栈顶
|0xc2|monitorenter|获得对象的锁，用于同步方法或同步块
|0xc3|monitorexit|释放对象的锁，用于同步方法或同步块
|0xc4|wide|<待补充>
|0xc5|multianewarray|创建指定类型和指定维度的多维数组（执行该指令时，操作栈中必须包含各维度的长度值），并将其引用值压入栈顶
|0xc6|ifnull|为null时跳转
|0xc7|ifnonnull|不为null时跳转
|0xc8|goto_w|无条件跳转（宽索引）
|0xc9|jsr_w|跳转至指定32位offset位置，并将jsr_w下一条指令地址压入栈顶


#### 1.5.20.3. 常见的字节码操作工具

字节码是作用于运行期，所以一般用来在运行期改变类的行为，基本上都会结合代理模式使用。

* ASM
* BCEL
* CGLIB
* Javassist
* Byte Buddy



#### 1.5.20.4. ASM字节码操作工具
<a href="#menu" style="float:right">目录</a>

##### 1.5.20.4.1. 什么是ASM
<a href="#menu" style="float:right">目录</a>

　　ASM是一个java字节码操纵框架，它能被用来动态生成类或者增强既有类的功能。ASM 可以直接产生二进制 class 文件，也可以在类被加载入 Java 虚拟机之前动态改变类行为。Java class 被存储在严格格式定义的 .class文件里，这些类文件拥有足够的元数据来解析类中的所有元素：类名称、方法、属性以及 Java 字节码（指令）。ASM从类文件中读入信息后，能够改变类行为，分析类信息，甚至能够根据用户要求生成新类。asm字节码增强技术主要是用来反射的时候提升性能的，如果单纯用jdk的反射调用，性能是非常低下的，而使用字节码增强技术后反射调用的时间已经基本可以与直接调用相当了

依赖
```xml
<!-- https://mvnrepository.com/artifact/asm/asm -->
<dependency>
    <groupId>asm</groupId>
    <artifactId>asm</artifactId>
    <version>3.3.1</version>
</dependency>

```

##### 1.5.20.4.2. ASM框架中的核心类
<a href="#menu" style="float:right">目录</a>

ASM框架中的核心类有以下几个：
* ClassReader:该类用来解析编译过的class字节码文件。
* ClassWriter:该类用来重新构建编译后的类，比如说修改类名、属性以及方法，甚至可以生成新的类的字节码文件。
* ClassAdapter:该类也实现了ClassVisitor接口，它将对它的方法调用委托给另一个ClassVisitor对象。

ASM字节码处理框架是用Java开发的而且使用基于访问者模式生成字节码及驱动类到字节码的转换，通俗的讲，它就是对class文件的CRUD，经过CRUD后的字节码可以转换为类。ASM的解析方式类似于SAX解析XML文件，它综合运用了访问者模式、职责链模式、桥接模式等多种设计模式，相对于其他类似工具如BCEL、SERP、Javassist、CGLIB，它的最大的优势就在于其性能更高，其jar包仅30K。Hibernate和Spring都使用了cglib代理，而cglib本身就是使用的ASM，可见ASM在各种开源框架都有广泛的应用。
ASM是一个强大的框架，利用它我们可以做到：
1、获得class文件的详细信息，包括类名、父类名、接口、成员名、方法名、方法参数名、局部变量名、元数据等
2、对class文件进行动态修改，如增加、删除、修改类方法、在某个方法中添加指令等

CGLIB（动态代理）是对ASM的封装，简化了ASM的操作，降低了ASM的使用门槛，

其中，hibernate的懒加载使用到了asm，spring的AOP也使用到了。你建立一个hibernate映射对象并使用懒加载配置的时候，在内存中生成的对象使用的不再是你实现的那个类了，而是hibernate根据字节码技术已你的类为模板构造的一个新类，证明就是当你获得那个对象输出类名是，不是你自己生成的类名了。spring可能是proxy$xxx，hibernate可能是<你的类名>$xxx$xxx之类的名字。

![](https://segmentfault.com/img/remote/1460000009956540?w=860&h=339)
ClassReader用来读取原有的字节码，ClassWriter用于写入字节码，ClassVisitor、FieldVisitor、MethodVisitor、AnnotationVisitor访问修改对应组件。(一般不要通过ClassReader读取再通过Vistor修改类型为再ClassWriter回写，覆盖原有类行为，采用继承会更安全)

##### 1.5.20.4.3. 为什么选择 ASM
<a href="#menu" style="float:right">目录</a>

最直接的改造 Java 类的方法莫过于直接改写 class 文件。Java 规范详细说明了 class 文件的格式，直接编辑字节码确实可以改变 Java 类的行为。直到今天，还有一些 Java 高手们使用最原始的工具，如 UltraEdit 这样的编辑器对 class 文件动手术。是的，这是最直接的方法，但是要求使用者对 Java class 文件的格式了熟于��：小心地推算出想改造的函数相对文件首部的偏移量，同时重新计算 class 文件的校验码以通过 Java 虚拟机的安全机制。

Java 5 中提供的 Instrument 包也可以提供类似的功能：启动时往 Java 虚拟机中挂上一个用户定义的 hook 程序，可以在装入特定类的时候改变特定类的字节码，从而改变该类的行为。但是其缺点也是明显的：
* Instrument 包是在整个虚拟机上挂了一个钩子程序，每次装入一个新类的时候，都必须执行一遍这段程序，即使这个类不需要改变。
* 直接改变字节码事实上类似于直接改写 class 文件，无论是调用 ClassFileTransformer. transform(ClassLoader loader, String className, Class classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer)，还是Instrument.redefineClasses(ClassDefinition[] definitions)，都必须提供新 Java 类的字节码。也就是说，同直接改写 class 文件一样，使用 Instrument 也必须了解想改造的方法相对类首部的偏移量，才能在适当的位置上插入新的代码。
尽管 Instrument 可以改造类，但事实上，Instrument 更适用于监控和控制虚拟机的行为。

一种比较理想且流行的方法是使用 java.lang.ref.proxy。我们仍旧使用上面的例子，给 Account类加上 checkSecurity 功能 :

首先，Proxy 编程是面向接口的。下面我们会看到，Proxy 并不负责实例化对象，和 Decorator 模式一样，要把 Account定义成一个接口，然后在AccountImpl里实现Account接口，接着实现一个 InvocationHandlerAccount方法被调用的时候，虚拟机都会实际调用这个InvocationHandler的invoke方法：
```java
 class SecurityProxyInvocationHandler implements InvocationHandler { 
	 private Object proxyedObject; 
	 public SecurityProxyInvocationHandler(Object o) { 
		 proxyedObject = o; 
	 } 
		
	 public Object invoke(Object object, Method method, Object[] arguments) 
		 throws Throwable { 			
		 if (object instanceof Account && method.getName().equals("opertaion")) { 
			 SecurityChecker.checkSecurity(); 
		 } 
		 return method.invoke(proxyedObject, arguments); 
	 } 
 }
```
最后，在应用程序中指定 InvocationHandler生成代理对象：
```java
 public static void main(String[] args) { 
	 Account account = (Account) Proxy.newProxyInstance( 
		 Account.class.getClassLoader(), 
		 new Class[] { Account.class }, 
		 new SecurityProxyInvocationHandler(new AccountImpl()) 
	 ); 
	 account.function(); 
 }
```
其不足之处在于：
* Proxy 是面向接口的，所有使用 Proxy 的对象都必须定义一个接口，而且用这些对象的代码也必须是对接口编程的：Proxy 生成的对象是接口一致的而不是对象一致的：例子中Proxy.newProxyInstance生成的是实现Account接口的对象而不是 AccountImpl的子类。这对于软件架构设计，尤其对于既有软件系统是有一定掣肘的。
* Proxy 毕竟是通过反射实现的，必须在效率上付出代价：有实验数据表明，调用反射比一般的函数开销至少要大 10 倍。而且，从程序实现上可以看出，对 proxy class 的所有方法调用都要通过使用反射的 invoke 方法。因此，对于性能关键的应用，使用 proxy class 是需要精心考虑的，以避免反射成为整个应用的瓶颈。
ASM 能够通过改造既有类，直接生成需要的代码。增强的代码是硬编码在新生成的类文件内部的，没有反射带来性能上的付出。同时，ASM 与 Proxy 编程不同，不需要为增强代码而新定义一个接口，生成的代码可以覆盖原来的类，或者是原始类的子类。它是一个普通的 Java 类而不是 proxy 类，甚至可以在应用程序的类框架中拥有自己的位置，派生自己的子类。

相比于其他流行的 Java 字节码操纵工具，ASM 更小更快。ASM 具有类似于 BCEL 或者 SERP 的功能，而只有 33k 大小，而后者分别有 350k 和 150k。同时，同样类转换的负载，如果 ASM 是 60% 的话，BCEL 需要 700%，而 SERP 需要 1100% 或者更多。

ASM 已经被广泛应用于一系列 Java 项目：AspectWerkz、AspectJ、BEA WebLogic、IBM AUS、OracleBerkleyDB、Oracle TopLink、Terracotta、RIFE、EclipseME、Proactive、Speedo、Fractal、EasyBeans、BeanShell、Groovy、Jamaica、CGLIB、dynaop、Cobertura、JDBCPersistence、JiP、SonarJ、Substance L&F、Retrotranslator 等。Hibernate 和 Spring 也通过 cglib，另一个更高层一些的自动代码生成工具使用了 ASM。

##### 1.5.20.4.4. ASM编程框架
<a href="#menu" style="float:right">目录</a>

ASM 通过树这种数据结构来表示复杂的字节码结构，并利用 Push 模型来对树进行遍历，在遍历过程中对字节码进行修改。所谓的 Push 模型类似于简单的 Visitor 设计模式，因为需要处理字节码结构是固定的，所以不需要专门抽象出一种 Vistable 接口，而只需要提供 Visitor 接口。所谓 Visitor 模式和 Iterator 模式有点类似，它们都被用来遍历一些复杂的数据结构。Visitor 相当于用户派出的代表，深入到算法内部，由算法安排访问行程。Visitor 代表可以更换，但对算法流程无法干涉，因此是被动的，这也是它和 Iterator 模式由用户主动调遣算法方式的最大的区别。

在 ASM 中，提供了一个 ClassReader类，这个类可以直接由字节数组或由 class 文件间接的获得字节码数据，它能正确的分析字节码，构建出抽象的树在内存中表示字节码。它会调用accept方法，这个方法接受一个实现了ClassVisitor接口的对象实例作为参数，然后依次调用 ClassVisitor接口的各个方法。字节码空间上的偏移被转换成 visit 事件时间上调用的先后，所谓 visit 事件是指对各种不同 visit 函数的调用，ClassReader知道如何调用各种 visit 函数。在这个过程中用户无法对操作进行干涉，所以遍历的算法是确定的，用户可以做的是提供不同的 Visitor 来对字节码树进行不同的修改。ClassVisitor会产生一些子过程，比如visitMethod会返回一个实现MethordVisitor接口的实例，visitField会返回一个实现FieldVisitor接口的实例，完成子过程后控制返回到父过程，继续访问下一节点。因此对于ClassReader来说，其内部顺序访问是有一定要求的。实际上用户还可以不通过ClassReader类，自行手工控制这个流程，只要按照一定的顺序，各个 visit 事件被先后正确的调用，最后就能生成可以被正确加载的字节码。当然获得更大灵活性的同时也加大了调整字节码的复杂度。

各个 ClassVisitor通过职责链 （Chain-of-responsibility） 模式，可以非常简单的封装对字节码的各种修改，而无须关注字节码的字节偏移，因为这些实现细节对于用户都被隐藏了，用户要做的只是覆写相应的 visit 函数。

ClassAdaptor类实现了 ClassVisitor接口所定义的所有函数，当新建一个 ClassAdaptor对象的时候，需要传入一个实现了 ClassVisitor接口的对象，作为职责链中的下一个访问者 （Visitor），这些函数的默认实现就是简单的把调用委派给这个对象，然后依次传递下去形成职责链。当用户需要对字节码进行调整时，只需从ClassAdaptor类派生出一个子类，覆写需要修改的方法，完成相应功能后再把调用传递下去。这样，用户无需考虑字节偏移，就可以很方便的控制字节码。

每个 ClassAdaptor类的派生类可以仅封装单一功能，比如删除某函数、修改字段可见性等等，然后再加入到职责链中，这样耦合更小，重用的概率也更大，但代价是产生很多小对象，而且职责链的层次太长的话也会加大系统调用的开销，用户需要在低耦合和高效率之间作出权衡

##### 1.5.20.4.5. AOP 底层技术比较
<a href="#menu" style="float:right">目录</a>

|AOP| 底层技术|	功能|	性能|	面向接口编程	|编程难度|
|---|---|---|---|---|---|
|直接改写 class 文件|	完全控制类	|无明显性能代价	|不要求	|高，要求对 class 文件结构和 Java 字节码有深刻了解
|JDK Instrument	完全控制类|	无论是否改写，每个类装入时都要执行 hook 程序|	不要求|	高，要求对 class 文件结构和 Java 字节码有深刻了解
|JDK Proxy	|只能改写 method|	反射引入性能代价|	要求|	低
|ASM|	几乎能完全控制类|	无明显性能代价	|不要求	|中，能操纵需要改写部分的 Java 字节码

##### 1.5.20.4.6. 例子

###### 1.5.20.4.6.1. 使用ASM实现方法耗时计算的AOP功能


##### 1.5.20.4.7. 建议

* 操作字节码作用于运行期，对于开发人员是完全透明的。
* 字节码编程的可阅读可维护性比较差，不要滥用字节码编程。
* 能通过设计模式实现的场景尽量通过设计模式实现；
* 字节码编程中复杂的逻辑也尽量使用java实现，在字节码中调用；
* 使用字节码解决一些框架性的问题，不要用于处理易变逻辑；
* 字节码编程从逻辑块着手，优先明确程序跳转Label，再补充逻辑执行
* 借助工具
    * 推荐使用intellj idea插件ASM Bytecode Outline，目前生成的字节码对应到 ASM 5.x。

### 1.5.21. Java内存模型和线程

#### 1.5.21.1. 硬件效率与一致性

由于计算机的存储设备与处理器的运算速度有几个数量级的差距，所以现代计算机不得不加入一层读写速度尽可能接近处理器运算速度的高速缓存来作为内存与处理器之间的缓冲。将运算需要使用到的数据复制到缓存中，让运算能够快速进行，当运算结束后再从缓存同步回内存之中，这样处理器就无需等待缓慢的内存读写了。

基于高速缓存的存储交互很好地解决了处理器与内存的速度矛盾，但是也为计算机系统带来更高的复杂度，因为它引入了一个新的问题：缓存一致性（Cache Coherence）。在多处理器系统中，每个处理器都有自己的高速缓存，而它们又共享同一主内存（MainMemory）。当多个处理器的运算任务都涉及同一块主内存区域时，将可能导致各自的缓存数据不一致，举例说明变量在多个CPU之间的共享。如果真的发生这种情况，那同步回到主内存时以谁的缓存数据为准呢？为了解决一致性的问题，需要各个处理器访问缓存时都遵循一些协议，在读写时要根据协议来进行操作，这类协议有MSI、MESI（Illinois Protocol）、MOSI、Synapse、Firefly及Dragon Protocol等。

![](https://upload-images.jianshu.io/upload_images/4222138-49df5535c55287c4.png?imageMogr2/auto-orient/strip|imageView2/2/w/562/format/webp)

该内存模型带来的问题
现代的处理器使用写缓冲区临时保存向内存写入的数据。写缓冲区可以保证指令流水线持续运行，它可以避免由于处理器停顿下来等待向内存写入数据而产生的延迟。同时，通过以批处理的方式刷新写缓冲区，以及合并写缓冲区中对同一内存地址的多次写，减少对内存总线的占用。虽然写缓冲区有这么多好处，但每个处理器上的写缓冲区，仅仅对它所在的处理器可见。这个特性会对内存操作的执行顺序产生重要的影响：处理器对内存的读/写操作的执行顺序，不一定与内存实际发生的读/写操作顺序一致！
处理器A和处理器B按程序的顺序并行执行内存访问，最终可能得到x=y=0的结果。
处理器A和处理器B可以同时把共享变量写入自己的写缓冲区（A1，B1），然后从内存中读取另一个共享变量（A2，B2），最后才把自己写缓存区中保存的脏数据刷新到内存中（A3，B3）。当以这种时序执行时，程序就可以得到x=y=0的结果。
从内存操作实际发生的顺序来看，直到处理器A执行A3来刷新自己的写缓存区，写操作A1才算真正执行了。虽然处理器A执行内存操作的顺序为：A1→A2，但内存操作实际发生的顺序却是A2→A1。

![](https://upload-images.jianshu.io/upload_images/4222138-3be912b80cb3f99d.png?imageMogr2/auto-orient/strip|imageView2/2/w/574/format/webp)

#### 1.5.21.2. Java内存模型

Java虚拟机规范中视图定义一种Java内存模型（JAVA Memory Model,JMM）来屏蔽掉各种硬件和操作系统的内存访问差异，以实现让Java程序在各种平台下都能达到一致的内存访问效果。在此之前，主流的语言C/C++直接使用物理硬件和操作系统的内存，模型，因此，会由于不同平台上内存模型的差异，有可能导致程序无法跨平台。

##### 1.5.21.2.1. 主内存和工作内存

Java内存模型主要目标：定义程序中各个变量的访问规则，即在虚拟机中将变量存储到内存和从内存中取出变量这样的底层细节。此处的变量（Variable）与Java编程中的变量略有区别，它包括实例变量/静态字段和构成数组对象的元素，不包括局部变量和方法参数（线程私有）。为获得较好的执行效能，Java内存模型并没有限制执行引擎使用处理器的特定寄存器或缓存来和主内存进行交换，也没有限制即时编译器调整代码执行顺序这类权利。 

Java内存模型规定所有变量都存储在主存（Main Memory）中（虚拟机内存的一部分）。每条线程还有自己的工作内存（Working Memory），线程的工作内存保存了被线程使用到的变量的主内存副本拷贝，线程对变量的所有操作（读取/赋值等）都必须在工作内存中进行，而不能直接读写主内存中的变量。不同线程之间也无法直接访问对方工作内存中的变量，线程间变量值的传递均需要通过主存来完成。

这里的主内存/工作内存与Java内存区域中的Java栈/堆/方法区并不是同一个层次的内存划分。如果两者一定要勉强对应起来，那从变量/主内存/工作内存的定义来看，主内存主要对应于Java堆中对象的实例数据部分，而工作内存则对应于虚拟机栈中的部分区域。从更低的层次来说，主存就是硬件的内存，而为获取更好的运算速度，虚拟机及硬件系统可能会让工作内存优先存储于寄存器和高速缓存。

![](https://images2015.cnblogs.com/blog/624066/201702/624066-20170228174652266-1875177352.png)



##### 1.5.21.2.2. 内存间交互操作

主内存与工作内存之间具体的交互协议，即一个变量如何从主内存拷贝到工作内存、从工作内存同步回主内存之类的实现细节，Java内存模型中定义了以下8种操作来完成：
* Lock（锁定）：作用于主内存的变量，将主内存该变量标记成当前线程私有的，其他线程无法访问它把一个变量标识为一条线程独占的状态。 
* Unlock（解锁）：作用于主内存的变量，把一个处于锁定状态的变量释放出来，才能被其他线程锁定。 
* Read（读取）：作用于主内存的变量，把一个变量的值从主内存传输到线程的工作内存中，以便随后的load动作使用。
* Load（加载）：作用于工作内存中的变量，把read操作从内存中得到的变量值放入工作内存的变量副本中。
* Use（使用）：作用于工作内存中的变量，把工作内存中一个变量的值传递给执行引擎，每当虚拟机遇到一个需要使用到变量的值的字节码指令时将会执行这个操作。
* Assgin（赋值）：作用于工作内存中的变量，把一个从执行引擎接收到的值赋值给工作内存的变量，每当虚拟机遇到一个给变量赋值的字节码指令时执行这个操作。
* Store（存储）：作用于工作内存中的变量，把工作内存中一个变量的值传递到主内存中，以便随后的write操作使用。
* Write（写入）：作用于主内存中的变量，把store操作从工作内存中得到的变量的值放入主内存的变量中。

如果把一个变量从主内存复制到工作内存，按顺序执行read和load操作；如果把变量从工作内存同步回主内存，按顺序执行store和write操作。Java内存模型还规定在执行上述8种基本操作时必须满足如下规则：
* 不允许read和load、store和write操作之一单独出现，即不允许一个变量从主内存读取了但工作内存不接受，或者从工作内存发起回写了但主内存不接受的情况。
* 不允许一个线程丢弃它的最近assign操作，即变量在工作内存中改变了之后必须把该变化同步回主内存。
* 不允许一个线程无原因的（没有发生过任何assign操作）把数据从线程的工作内存同步回主内存中。
* 一个新的变量只能在主内存中“诞生”，不允许在工作内存中直接使用一个未被初始化（load或assign）的变量，就是对一个变量执行use和store之前必须先执行过了assign和load操作。
* 一个变量在同一个时刻只允许一条线程对其进行lock操作，但lock操作可以被同一条线程重复执行多次，多次执行lock后，只有执行相同次数的unlock操作，变量才会被解锁。
* 如果对一个变量执行lock操作，僵尸清空工作内存中此变量的值，在执行引擎使用这个变量前，需要重新执行load或assign操作初始化变量的值。
* 如果一个变量事先没有被lock操作锁定，则不允许对它执行unlock操作，也不允许去unlock一个被其他线程锁定住的变量。
* 对一个变量执行unlock操作之前，必须先把此变量同步回主内存中（执行store和write操作）。


##### 1.5.21.2.3. 对于volatile型变量的特殊规则

关键字volatile可以说是Java虚拟机提供的最轻量级的同步机制。
当一个变量被定义成volatile后，它将具备两种特性：
第一是保证对所有线程的可见性，“可见性”指当一条线程修改了这个变量的值，新值对于其他线程来说是可以立即得知的。

关于volatile变量的可见性的误解：“volatile变量对所有线程立即可见的，对volatile变量所有的写操作都能立刻反映到其他线程中，换句话说，volatile变量在各个线程中是一致的，所以基于volatile变量的运算在并发下是安全的”。这句话的论据部分并没有错，但是其论据并不能得出“基于volatile变量的运算在并发下是安全的”这个结论。
volatile变量在各个线程中的工作内存中不存在一致性问题（在各个线程的工作内存中volatile变量也可以存在不一致的情况，但由于每次使用之前都要先刷新，执行引擎看不到不一致的情况，因此可以认为不存在不一致问题），但是Java里面的运算并非原子操作，导致volatile变量的运算在并发下一样是不安全的。

客观地说，此时使用字节码来分析并发问题，仍然是不严谨的，因为即使编译出来只有一条指令，也并不意味执行这条指令就是一个原子操作。一条字节码指令在解释执行时，解释器将要运行许多行代码才能实现它的语义，如果是编译执行，一条字节码指令也可能转化成若干条本地机器码指令，此处使用 -XX:+PrintAssembly 参数输出反编译来分析会更加严谨一些。

由于volatile变量只能保证可见性，在不符合以下两条规则的运算场景中，我们仍然要通过加锁（使用synchronized或java.util.concurrent中的原子类）来保证原子性：
* 运算结果并不依赖变量的当前值，或者能够确保只有单一的线程修改变量的值。
* 变量不需要与其他的状态变量共同参与不变约束。

使用volatile变量的第二个语义是禁止指令重排序优化，普通变量仅仅会保证在该方法的执行过程中所有依赖赋值结果的地方都能获取到正确的结果，而不能保证变量赋值操作的顺序与程序代码中的执行顺序一致。因为在一个线程的方法执行过程中无法感知到这点，这也就是Java内存模型中描述的所谓的“线程内表现为串行的语义”（WithinThread As-If-Serial Semantics）。

在众多保障并发安全工具中选用volatile的意义：在某些情况下，volatile的同步机制的性能确实要优先于锁（使用synchronized关键字或java.util.concurrent包里面的锁），但是由于虚拟机对锁实行的许多消除和优化，使得很难量化地认为volatile就会比synchronized快多少。volatile变量的读操作的性能消耗与普通变量几乎没有差别，但写操作可能会慢一些，因为它需要在本地代码中插入许多内存屏障指令来保证处理器不发生乱序执行。不过即便如此，大多数场景下volatile的总开销仍然要比锁低，我们在volatile与锁之中选择的唯一依据仅仅是volatile的语义能否满足使用场景的需求。

java内存模型中对volatile变量定义的特殊规则。假定T表示一个线程，V和W分别表示volatile型变量，那么在进行read、load、use、assign、store和write操作时需要满足如下规则：
* 只有当线程T对变量V执行的前一个动作为load时，T才能对V执行use；并且，只有T对V执行的后一个动作为use时，T才能对V执行load。T对V的use，可以认为是和T对V的load。read动作相关联，必须连续一起出现（这条规则要求在工作内存中，每次使用V前都必须先从主内存刷新最新的值，用于保证能看见其他线程对V修改后的值）。
* 只有当T对V的前一个动作是assign时，T才能对V执行store；并且，只有当T对V执行的后一个动作是store时，T才能对V执行assign。T对V的assign可以认为和T对V的store、write相关联，必须连续一起出现（这条规则要求在工作内存中，每次修改V后都必须立刻同步回主内存中，用于保证其他线程看到自己对V的修改）。
* 假定动作A是T对V实施的use或assign动作，假定动作F是和动作A相关联的load或store动作，假定动作P是和动作F相应的对V的read或write动作；类似的，假定动作B是T对W实施的use或assign动作，假定动作G是和动作B相关联的load或store动作，假定动作Q是和动作G相应的对W的read或write动作。如果A先于B，那么P先于Q（这条规则要求volatile修饰的变量不会被指令的重排序优化，保证代码的执行顺序与程序的顺序相同）。


##### 1.5.21.2.4. 对于long和double的特殊规则

Java允许虚拟机将没有被volatile修饰的64位数据类型（long和double）的读取操作划分为两次32位的操作来进行，即允许虚拟机实现选择可以不保证64位数据类型的load、store、read和write这4个操作的原子性，就点就是long和double的非原子协定（Nonatomic Treatment of double and long Variables）。

如果多个线程共享一个为声明为volatile的long或double类型变量，并同时对他们进行读取和修改操作，那么有些线程可能会读取到一个即非原值，也不是其他线程修改值得代表了“半个变量”的数值。

不过这种读取带“半个变量”的情况非常罕见（在目前商用虚拟机中不会出现），因为Java内存模型虽然允许虚拟机不把long和double变量的读写实现成原子操作，但允许虚拟机选择把这些操作实现为具有原子性的操作，而且还“强烈建议”虚拟机这样实现。

目前各种平台下的商用虚拟机几乎选择把64位数据的读写操作作为原子操作来对待，因此写代码时不需要在long,double上加上volatile



##### 1.5.21.2.5. 原子性，可见性，有序性

**原子性（Atomicity）**：由Java内存模型来直接保证的原子性变量操作包括read、load、assign、use、store和write，我们大致可以认为基本数据类型的访问具备原子性（long和double例外）。

如果应用场景需要一个更大范围的原子性保证，Java内存模型还提供了lock和unlock操作来满足需求，尽管虚拟机未把lock和unlock操作直接开放给用户，但是却提供了更高层次的字节码指令monitorenter和monitorexit来隐式地使用这两个操作，这两个字节码指令反应到Java代码中就是同步块——synchronized关键字，因此在synchronized块之间的操作也具备原子性。

**可见性（Visibility）**：指当一个线程修改了共享变量的值，其他线程能够立即得知这个修改。

除了volatile，Java还有两个关键字能实现可见性，synchronized和final。同步块的可见性是由“对一个变量执行unlock操作之前，必须把此变量同步回主内存中（执行store和write操作）”这条规则获得的，而final关键字的可见性是指：被final修饰的字段在构造器中一旦被初始化完成，并且构造器没有把“this”的引用传递出去（this引用逃逸是一件很危险的事情，其他线程有可能通过这个引用访问到“初始化了一半”的对象），那么其他线程中就能看见final字段的值。

**有序性（Ordering）**：Java程序中天然的有序性可以总结为一句话：如果在本线程内观察，所有的操作都是有序的；如果在一个线程中观察另外一个线程，所有的操作都是无序的。前半句是指“线程内表现为串行的语义”（Within-Thread As-if-Serial Semantics），后半句是指“指令重排序”现象和“工作内存与主内存同步延迟”现象。

Java语言提供了volatile和synchronized两个关键字来保证线程之间操作的有序性，volatile关键字本身就包含了禁止指令重排序的语义，而synchronized则是由“一个变量在同一时刻只允许一条线程对其进行lock操作”这条规则获得的，这个规则决定了持有同一个锁的两个同步块只能串行地进入。


##### 1.5.21.2.6. 先行发生原则
先行发生是Java内存模型中定义的两项操作之间的偏序关系，如果操作A先行发生于操作B，其实就是说在发生操作B之前，操作A产生的影响能被操作B观察到，“影响”包括修改了内存中共享变量的值/发送了消息/调用了方法等。

下面是Java内存模型下一些“天然的”先行发生关系，无须任何同步器协助就已经存在，可直接在编码中使用。如果两个操作之间的关系不在此列，并且无法从下列规则推倒出来，它们就没有顺序性的保障，虚拟机可以对它们进行随意地重排序。

1）程序次序规则（Program Order Rule）：在一个线程内，按照程序代码顺序，书写在前面的操作先行发生于书写在后面的操作。准确地来说应该是控制流顺序而不是程序代码顺序，因为要考虑分支/循环结构。
2）管程锁定规则（Monitor Lock Rule）：一个unlock操作先行发生于后面对同一锁的lock操作。这里必须强调的是同一锁，而“后面”是指时间上的先后顺序。
3）volatile变量规则（Volatile Variable Rule）：对一个volatile变量的写操作先行发生于后面对这个变量的读操作，这里的“后面”是指时间上的先后顺序。
4）线程启动规则（Thread Start Rule）：Thread对象的start()方法先行发生于此线程的每一个动作。
5）线程终止规则（Thread Termination Rule）：线程中的所有操作都先行发生于对此线程的终止检测，我们可以通过Thread.join()方法结束/Thread.isAlive()的返回值等手段检测到县城已经终止执行。
6）线程中断规则（Thread Interruption Rule）：对线程interrupt()方法的调用先行发生于被中断线程的代码检测到中断事件的发生，可以通过Thread.interrupted()方法检测到是否有中断发生。
7）对象终结规则（Finalizer Rule）：一个对象的初始化完成（构造函数执行结束）先行发生于它的finalize()方法的开始。
8）传递性（Transitivity）：如果操作A先行发生于操作B，操作B先行发生于操作C，那么操作A先行发生于操作C。

时间上的先后顺序与先行发生原则之间基本没有太大的关系，所以我们衡量并发安全问题时不要受时间顺序的干扰，一切必须以先行发生原则为准。


#### 1.5.21.3. Java与线程

##### 1.5.21.3.1. 线程的实现

主流操作系统都提供了线程实现，Java语言则提供了在不同硬件和操作系统平台对线程的同一处理，每个java.lang.Thread类的实例就代表了一个线程。Thread类与大部分Java API有着显著的差别，它的所有关键方法都被声明为Native。在Java API中一个Native方法可能就意味着这个方法没有使用或无法使用平台无关的手段实现。正因为这个原因，我们这里的“线程的实现”而不是“Java线程的实现”。

实现线程主要三种方式：

1. **使用内核线程实现**

内核线程（Kernel Thread， KLT）就是直接由操作系统内核（Kernel，下称内核）支持的线程，这种线程由内核来完成线程切换，内核通过操纵调度器（Scheduler）对线程进行调度，并负责将线程的任务映射到各个处理器上。每个内核线程都可以看作是内核的一个分身，这样操作系统就有能力同时处理多件事情，支持多线程的内核就叫多线程内核（Multi-Thread Kernel）。

程序一般不会直接去使用内核线程，而是去使用内核线程的一种高级接口——轻量级进程（Light Weight Process， LWP），轻量级进程就是我们通常意义上所讲的线程，由于每个轻量级进程都由一个内核线程支持，因此只有先支持内核线程，才能有轻量级进程。这种轻量级进程与内核线程之间1：1的关系称为一对一的线程模型。

轻量级进程的局限性：由于是基于内核线程实现的，所以各种进程操作，如创建/析构及同步，都需要进行系统调用。而系统调用的代价相对较高，需要在用户态（User Mode）和内核态（Kernel Mode）中来回切换；每个轻量级进程都需要有一个内核线程的支持，因此轻量级进程需要消耗一定的内核资源（如内核线程的栈空间），因此一个系统支持轻量级进程是有限的。

![](https://images2015.cnblogs.com/blog/624066/201703/624066-20170301151529501-131579757.png)

优点：在多处理器系统，内核能够同时调度同一进程中的多个线程并发执行；如果一个进程的某个线程被阻塞，内核可以调度该进程的其他线程运行，也可以调度其他进程的线程运行；线程的切换比较快，切换开销小；内核本身也可以采用多线程技术，可以提高系统的执行速度和效率；

缺点：对于用户线程的调度，其模式切换开销比较大，在同一个进程中，从一个线程切换到另一个线程时，需要从用户态转到核心态实现，这是因为，线程运行在用户态，而线程调度和管理是在内核实现的，因此系统开销较大；

2. **使用用户线程实现**

用户线程（User Thread）是在用户空间实现的，对线程的创建、撤销、通信、同步等功能的实现，无需内核的支持，因而内核完全不知道用户级线程的存在；此时进程和用户线程是一对多的关系。

线程切换不需要转到内核空间。对一个进程而言，其所有的线程管理数据结构均在该进程自己的用户空间，管理线程切换的线程库也在用户地址空间运行，从而不需要切换到内核方式来管理线程，从而节省了内核态和用户态之间切换的开销；

又因为对线程的创建、撤销、通信、同步等功能的实现不需要内核来完成，都需要用户程序自己来处理，用户程序一般都比较复杂，所以，用这种方式来处理创建多线程的程序越来越少。


狭义上的用户线程指的是完全建立在用户空间的线程库上，系统内核不能感知到线程存在的实现。用户线程的建立/同步/销毁和调度完全在用户态完成，不需要内核的帮助。如果程序实现得当，这种线程不需要切换到内核态，因此操作快速且低消耗，也可以支持规模更大的线程数量，部分高性能数据库中的多线程就是由用户线程实现的。这种进程与用户线程之间1：N的关系称为一对多的线程模型。


3. **使用用户线程加轻量级进程混合实现**

在这种模式下，即存在用户线程，也存在轻量级进程。用户线程还是完全建立在用户空间中，因此用户线程的创建、切换等操作依然廉价，并且可以支持大规模的用户线程并发。

而操作系统提供支持的轻量级进程则作为用户线程和内核线程之间的桥梁，这样可以使用内核提供的线程调度功能及时处理映射，并且用户线程的系统要通过轻量级进程来完成，大大降低了整个进程被完全阻塞的风险。在这种混合模式中，用户线程和轻量级进程的数量比是不确定的，即为 N:M 的关系。 

![](https://img-blog.csdn.net/20170725134805587?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvSVRlcm1lbmc=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

**Java线程的实现**
1.2之前使用用户线程实现，1.2开始基于操作系统原生线程模型实现。对于不同的平台，线程模型只对线程的并发规模和操作成本产生影响，对Java编码和运行过程来讲，这些差异都是透明的.

##### 1.5.21.3.2. 线程调度

Java线程调度

线程调度是指系统为线程分配处理器使用权的过程。主要调度方式两种：
* 使用协同调度的多线程系统，线程执行时间由线程本身控制，线程把自己的工作执行完后，要主动通知系统切换到另外一个线程上去。优点：实现简单。缺点：执行时间不可控制。
* 使用抢占调用的多线程系统，每个线程由系统分配执行时间，线程的切换不由线程本身决定。Java使用的就是这种线程调度方式。

Java提供10个级别的线程优先级设置，不过，线程优先级不靠谱，因为Java线程是被映射到系统的原生线程上实现的，所以线程调度最终还是由操作系统决定。


##### 1.5.21.3.3. 状态转换

Java语言定义了5种进程状态，在任意一个时间点，一个线程只能有且只有其中一种状态：
* 新建（New）：创建尚未启动的线程处于这种状态。
* 运行（Runable）：包括操作系统线程状态中的Running和Ready，处于此状态的线程可能正在运行，也可能等待着CPU为它分配执行时间。
* 无限期等待（Waiting）：处于这种状态的线程不会被分配CPU执行时间，它们要等待其他线程显示地唤醒。以下方法会让线程陷入无限期的等待状态：
    * 没有设置Timeout参数的Object.wait()方法。
    * 没有设置Timeout参数的Thread.join()方法。
    * LockSupport.park()方法。
* 限期等待（Timed Waiting）：处于这种状态的线程也不会被分配CPU执行时间，不过无须等待被其他线程显示地唤醒，在一定时间后由系统自动唤醒。以下方法会让线程陷入限期的等待状态：
    * Thread.sleep()方法。
    * 设置了Timeout参数的Object.wait()方法。
    * 设置了Timeout参数的Thread.join()方法。
    * LockSupport.parkNanos()方法。
    * LockSupport.parkUntil()方法。
* 阻塞（Blocked）：线程被阻塞了，“阻塞状态”与“等待状态”的区别是：“阻塞状态”在等待获取一个排它锁，这个事件将在另外一个线程放弃这个锁的时候发生；“等待状态”则是在等待一段时间，或者唤醒动作的发生。在程序进入等待进入同步块区域的时候，线程将进入这种状态。
* 结束（Terminated）：已终止线程的线程状态，线程已经结束执行。

![](https://images2015.cnblogs.com/blog/624066/201703/624066-20170301142922345-689169159.png)