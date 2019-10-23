
<span id="menu" >
<!-- TOC -->

- [1. RabbitMQ](#1-rabbitmq)
    - [1.1. 概述](#11-概述)
    - [1.2. 安装和使用](#12-安装和使用)
        - [1.2.1. 安装](#121-安装)
        - [1.2.2. 服务器管理](#122-服务器管理)
            - [1.2.2.1. 启动节点](#1221-启动节点)
            - [1.2.2.2. 停止节点](#1222-停止节点)
            - [1.2.2.3. 关闭和重启应用程序:有何差别](#1223-关闭和重启应用程序有何差别)
            - [1.2.2.4. 其他命令](#1224-其他命令)
        - [1.2.3. 请求许可](#123-请求许可)
            - [1.2.3.1. 权限系统](#1231-权限系统)
        - [1.2.4. 检查](#124-检查)
            - [1.2.4.1. 查看数据统计](#1241-查看数据统计)
            - [1.2.4.2. 理解日志](#1242-理解日志)
        - [1.2.5. 疑难解答](#125-疑难解答)
    - [1.3. 入门](#13-入门)
        - [1.3.1. 相关概念介绍](#131-相关概念介绍)
            - [1.3.1.1. 生产者和消费值](#1311-生产者和消费值)
            - [1.3.1.2. 队列](#1312-队列)
            - [1.3.1.3. 交换器,路由键,绑定](#1313-交换器路由键绑定)
            - [1.3.1.4. 交换器类型](#1314-交换器类型)
            - [1.3.1.5. 多租户模式:虚拟主机和隔离](#1315-多租户模式虚拟主机和隔离)
            - [1.3.1.6. 消息持久化](#1316-消息持久化)
            - [1.3.1.7. RabbitMQ运转流程](#1317-rabbitmq运转流程)
            - [1.3.1.8. 通信模式](#1318-通信模式)
        - [1.3.2. AMQP协议介绍](#132-amqp协议介绍)
            - [1.3.2.1. AMQP生产者流转过程](#1321-amqp生产者流转过程)
            - [1.3.2.2. AMQP消费者流转过程](#1322-amqp消费者流转过程)
        - [1.3.3. 配置](#133-配置)
            - [1.3.3.1. 环境变量](#1331-环境变量)
            - [1.3.3.2. 配置文件](#1332-配置文件)
                - [1.3.3.2.1. 常用配置说明](#13321-常用配置说明)
            - [1.3.3.3. 参数和策略](#1333-参数和策略)
    - [1.4. 客户端开发](#14-客户端开发)
        - [1.4.1. 依赖](#141-依赖)
        - [1.4.2. 连接RabbitMQ](#142-连接rabbitmq)
        - [1.4.3. 使用交换器和队列](#143-使用交换器和队列)
        - [1.4.4. 发送消息](#144-发送消息)
        - [1.4.5. 消费消息](#145-消费消息)
            - [1.4.5.1. 推模式(push)](#1451-推模式push)
            - [1.4.5.2. 拉模式(pull)](#1452-拉模式pull)
        - [1.4.6. 消息端的确认和拒绝](#146-消息端的确认和拒绝)
        - [1.4.7. 关闭连接](#147-关闭连接)
    - [1.5. 进阶](#15-进阶)
        - [1.5.1. 参数mandatory 和 immediate介绍](#151-参数mandatory-和-immediate介绍)
        - [1.5.2. 备份交换器](#152-备份交换器)
        - [1.5.3. 过期时间TTL](#153-过期时间ttl)
            - [1.5.3.1. 设置消息的过期时间](#1531-设置消息的过期时间)
            - [1.5.3.2. 设置队列的过期时间](#1532-设置队列的过期时间)
        - [1.5.4. 死信队列](#154-死信队列)
        - [1.5.5. 延迟队列](#155-延迟队列)
        - [1.5.6. 优先级队列](#156-优先级队列)
        - [1.5.7. RPC实现](#157-rpc实现)
        - [1.5.8. 持久化](#158-持久化)
        - [1.5.9. 生产者确认](#159-生产者确认)
            - [1.5.9.1. 事务机制](#1591-事务机制)
            - [1.5.9.2. 发送方确认机制](#1592-发送方确认机制)
        - [1.5.10. 消费端要点介绍](#1510-消费端要点介绍)
            - [1.5.10.1. 消息分发](#15101-消息分发)
            - [1.5.10.2. 消息顺序性](#15102-消息顺序性)
        - [1.5.11. 消息传输保障](#1511-消息传输保障)
    - [1.6. Spring集成RabbitMQ](#16-spring集成rabbitmq)
        - [1.6.1. 依赖](#161-依赖)
        - [1.6.2. 配置](#162-配置)
        - [1.6.3. 配置类](#163-配置类)
        - [1.6.4. 生产者](#164-生产者)
        - [1.6.5. 消费者](#165-消费者)
        - [1.6.6. 为Rabbitmq中的Jackson2JsonMessageConverter自定义ClassMapper](#166-为rabbitmq中的jackson2jsonmessageconverter自定义classmapper)
        - [1.6.7. SimpleMessageListenerContainer](#167-simplemessagelistenercontainer)
    - [1.7. RabbitMQ管理](#17-rabbitmq管理)
    - [1.8. 数据存储](#18-数据存储)
    - [1.9. 集群](#19-集群)
        - [1.9.1. 集群架构](#191-集群架构)
        - [1.9.2. 集群搭建](#192-集群搭建)
            - [1.9.2.1. 多机多节点配置](#1921-多机多节点配置)
            - [1.9.2.2. 集群节点类型](#1922-集群节点类型)
            - [1.9.2.3. 删除单个节点](#1923-删除单个节点)
            - [1.9.2.4. 集群节点的升级](#1924-集群节点的升级)
            - [1.9.2.5. 单机多节点配置](#1925-单机多节点配置)
        - [1.9.3. 镜像队列](#193-镜像队列)
    - [1.10. 网络分区](#110-网络分区)
        - [1.10.1. 网络分区的意义](#1101-网络分区的意义)
        - [1.10.2. 网络分区的判定](#1102-网络分区的判定)
        - [1.10.3. 网络分区的模拟](#1103-网络分区的模拟)
        - [1.10.4. 网络分区的影响](#1104-网络分区的影响)
            - [1.10.4.1. 未配置的镜像](#11041-未配置的镜像)
            - [1.10.4.2. 已配置的镜像](#11042-已配置的镜像)
        - [1.10.5. 手动处理网络分区](#1105-手动处理网络分区)
        - [1.10.6. 自动处理网络分区](#1106-自动处理网络分区)
            - [1.10.6.1. pause-minority模式](#11061-pause-minority模式)
            - [1.10.6.2. pause-if-all-down模式](#11062-pause-if-all-down模式)
            - [1.10.6.3. autoheal模式](#11063-autoheal模式)
            - [1.10.6.4. 模式选择](#11064-模式选择)
    - [1.11. RabbitMQ扩展](#111-rabbitmq扩展)
        - [1.11.1. 消息追踪](#1111-消息追踪)
            - [1.11.1.1. Firehose](#11111-firehose)
            - [1.11.1.2. rabbitmq_tracing 插件](#11112-rabbitmq_tracing-插件)
        - [1.11.2. 负载均衡](#1112-负载均衡)
            - [1.11.2.1. 客户端内部实现负载均衡](#11121-客户端内部实现负载均衡)
            - [1.11.2.2. 使用HAProxy实现负载均衡](#11122-使用haproxy实现负载均衡)
                - [1.11.2.2.1. HaProxy基本介绍](#111221-haproxy基本介绍)
                - [1.11.2.2.2. 安装](#111222-安装)
                - [1.11.2.2.3. 配置文件](#111223-配置文件)
            - [1.11.2.3. 使用Keepalived实现高可靠负载均衡](#11123-使用keepalived实现高可靠负载均衡)
            - [1.11.2.4. 使用Keepalived+LVS实现负载均衡](#11124-使用keepalivedlvs实现负载均衡)
    - [1.12. 源码说明](#112-源码说明)
    - [1.13. 面试总结](#113-面试总结)

<!-- /TOC -->
# 1. RabbitMQ
<a href="#menu" style="float:right">目录</a>

## 1.1. 概述
<a href="#menu" style="float:right">目录</a>

它是采用Erlang语言实现的AMQP(Advanced Message Queued Protocol)的消息中间件，最初起源于金融系统，用在分布式系统存储转发消息。

RabbitMQ发展到今天，被越来越多的人认可，这和它在易用性、扩展性、可靠性和高可用性等方面的卓著表现是分不开的。RabbitMQ的具体特点可以概括为以下几点:
* 可靠性:RabbitMQ使用一些机制来保证可靠性，如持久化、传输确认及发布确认等。
* 灵活的路由:在消息进入队列之前，通过交换器来路由消息。对于典型的路由功能，RabbitMQ己经提供了一些内置的交换器来实现。针对更复杂的路由功能，可以将多个交换器绑定在一起，也可以通过插件机制来实现自己的交换器。
* 扩展性:多个RabbitMQ节点可以组成一个集群，也可以根据实际业务情况动态地扩展集群中节点。
* 高可用性:队列可以在集群中的机器上设置镜像，使得在部分节点出现问题的情况下队仍然可用。
* 多种协议:RabbitMQ除了原生支持AMQP协议，还支持STOMP，MQTT等多种消息中间件协议。
* 多语言客户端:RabbitMQ几乎支持所有常用语言，比如Jav a、Python、Ruby、PHP、C#、JavaScript等。
* 管理界面:RabbitMQ提供了一个易用的用户界面，使得用户可以监控和管理消息、集群中的节点等。
* 插件机制:RabbitMQ提供了许多插件，以实现从多方面进行扩展，当然也可以编写自己的插件。



## 1.2. 安装和使用 
<a href="#menu" style="float:right">目录</a>

### 1.2.1. 安装
<a href="#menu" style="float:right">目录</a>

**安装 Erlang**

下面首先演示 Erlang 的安装。

第一步，解压安装包，并配置安装目录，这里我们预备安装
到 /opt/erlang 目录下:
```
[root@hidden -)# tar zxvf otp_src_19 . 3.tar . gz
[root@hidden -)# cd otp src 19 . 3
[root@hidden otp src_19.3)# ./configure --prefix=/opt/er1ang
```

第二步，如果出现类似关键报错信息 : No curses library functions found。那么此时需要安装
ncurses ，安装步骤(遇到提示输入 y 后直接回车即可)如下:
```
[root@hidden otp_src_19.3)# yum install ncurses-devel
```

第三步，安装 Erlang:
```
[root@hidden otp_src_19 . 3)# make
[root@hidden otp_src_19 . 3)# make install
```

如果在安装的过程中出现类似 "No ***** found" 的提示，可根据提示信息安装相应的包，
之后再执行第二或者第三步，直到提示安装完毕为止。


第四步，修改 /etc/profile 配置文件，添加下面的环境变量:
```
ERLANG HOME=/opt/erlang
export PATH=$PATH:$ERLANG HOME/bin
export ERLANG_HOME
```
最后执行如下命令让配置文件生效 :
```
[root@hidden otp_src_19 .3) # source /etc/profile
```
可以输入 erl 命令来验证 Erlang 是否安装成功，如果出现类似以下的提示即表示安装成功:
```
lgj@lgj-Lenovo-G470:$ erl
Erlang/OTP 20 [erts-9.2] [source] [64-bit] [smp:4:4] [ds:4:4:10] [async-threads:10] [kernel-poll:false]

Eshell V9.2  (abort with ^G)
1> 
```

**RabbitMQ 的安装**
RabbitMQ 的安装比 Erlang 的安装要简单，直接将下载的安装包解压到相应的目录下即可，官网下载地址 : http://www.rabbitmq.comlreleases/rabbitmq-server/。
这里选择将 RabbitMQ 安装到与 Erlang 同一个目录 (/ opt) 下面 :
```
[root@hidden -]# tar zvxf rabbitmq-server- generic-unix-3.6.10 . tar . gz -c lopt
[root@hidden - ]# cd lopt
[root@hidden -]# mv rabbitmq_server-3 . 6.10 rabbitmq
```
同样修改 /etc/profile 文件 ， 添加下面的环境变量 :
```
export PATH=$PATH : /opt/rabbitmq/sbin
export RABBITMQ HOME=/opt/rabbitmq
```
之后执行 source/etc/profile 命令让配置文件生效。

### 1.2.2. 服务器管理
<a href="#menu" style="float:right">目录</a>

RabbitMQ是基于Erlang编写的,Erlang也有虚拟机,而虚拟机的每个实例称之为节点(node),不同于JVM,多个Erlang应用程序可以运行在同一个节点之上,节点之间可以进行本地通信,

![erlang](https://github.com/lgjlife/Java-Study/blob/master/pic/rabbitmq/erlang.png?raw=true)


#### 1.2.2.1. 启动节点
<a href="#menu" style="float:right">目录</a>

在修改了 /etc/profile 配置文件之后，可以任意打开一个 Shell 窗口，输入如下命令以运行 RabbitMQ 服务 :
```
rabbitmq-server -detached
```

在 rabbitmq-s erver 命令后面添加一个 "-detached" 参数是为了能够让 RabbitMQ服务以守护进程的方式在后台运行，这样就不会因为当前 Shell 窗口的关闭而影响服务。

启动之后可以在 /var/log/rabbitmq查看日志文件
```java
lgj@lgj-Lenovo-G470:/var/log/rabbitmq$ ls -l
total 8
-rw-r--r-- 1 rabbitmq rabbitmq    0 Jan  6  2019 rabbit@lgj-Lenovo-G470-sasl.log
-rw-r--r-- 1 rabbitmq rabbitmq    0 Jan 13  2019 rabbit@lgj-Lenovo-G470.log
-rw-r--r-- 1 rabbitmq rabbitmq 3946 Jan  6  2019 rabbit@lgj-Lenovo-G470.log.1
-rw-r--r-- 1 rabbitmq rabbitmq    0 Jan  6  2019 startup_err
-rw-r--r-- 1 rabbitmq rabbitmq  364 Jan  6  2019 startup_log

```

运行 rabbitmqctl status 命令查看 RabbitMQ 是否正常启动

```java
lgj@lgj-Lenovo-G470:~/java/rabbitmq_server-3.7.9/sbin$ ./rabbitmqctl status
warning: the VM is running with native name encoding of latin1 which may cause Elixir to malfunction as it expects utf8. Please ensure your locale is set to UTF-8 (which can be verified by running "locale" in your shell)
Status of node rabbit@lgj-Lenovo-G470 ...
[{pid,10267},
 {running_applications,
     [{rabbitmq_management,"RabbitMQ Management Console","3.7.9"},
      {rabbitmq_web_dispatch,"RabbitMQ Web Dispatcher","3.7.9"},
      {cowboy,"Small, fast, modern HTTP server.","2.4.0"},
      {rabbitmq_management_agent,"RabbitMQ Management Agent","3.7.9"},
      {rabbit,"RabbitMQ","3.7.9"},
      {amqp_client,"RabbitMQ AMQP Client","3.7.9"},
      {rabbit_common,
          "Modules shared by rabbitmq-server and rabbitmq-erlang-client",
          "3.7.9"},
      {ranch_proxy_protocol,"Ranch Proxy Protocol Transport","2.1.1"},
      {ranch,"Socket acceptor pool for TCP protocols.","1.6.2"},
      {ssl,"Erlang/OTP SSL application","8.2.3"},
      {public_key,"Public key infrastructure","1.5.2"},
      {asn1,"The Erlang ASN1 compiler version 5.0.4","5.0.4"},
      {cowlib,"Support library for manipulating Web protocols.","2.3.0"},
      {crypto,"CRYPTO","4.2"},
      {recon,"Diagnostic tools for production use","2.3.6"},
      {os_mon,"CPO  CXC 138 46","2.4.4"},
      {jsx,"a streaming, evented json parsing toolkit","2.9.0"},
      {inets,"INETS  CXC 138 49","6.4.5"},
      {xmerl,"XML parser","1.3.16"},
      {mnesia,"MNESIA  CXC 138 12","4.15.3"},
      {lager,"Erlang logging framework","3.6.5"},
      {goldrush,"Erlang event stream processor","0.1.9"},
      {compiler,"ERTS  CXC 138 10","7.1.4"},
      {syntax_tools,"Syntax tools","2.1.4"},
      {sasl,"SASL  CXC 138 11","3.1.1"},
      {stdlib,"ERTS  CXC 138 10","3.4.3"},
      {kernel,"ERTS  CXC 138 10","5.4.1"}]},
 {os,{unix,linux}},
 {erlang_version,
     "Erlang/OTP 20 [erts-9.2] [source] [64-bit] [smp:4:4] [ds:4:4:10] [async-threads:64] [kernel-poll:true]\n"},
 {memory,
     [{connection_readers,56696},
      {connection_writers,3104},
      {connection_channels,10648},
      {connection_other,149464},
      {queue_procs,76816},
      {queue_slave_procs,0},
      {plugins,1964632},
      {other_proc,24516952},
      {metrics,223656},
      {mgmt_db,444384},
      {mnesia,98688},
      {other_ets,2306064},
      {binary,5362208},
      {msg_index,62816},
      {code,28496931},
      {atom,1131721},
      {other_system,11206564},
      {allocated_unused,18481680},
      {reserved_unallocated,0},
      {strategy,rss},
      {total,[{erlang,76111344},{rss,80449536},{allocated,94593024}]}]},
 {alarms,[]},
 {listeners,[{clustering,25672,"::"},{amqp,5672,"::"},{http,15672,"::"}]},
 {vm_memory_calculation_strategy,rss},
 {vm_memory_high_watermark,0.4},
 {vm_memory_limit,4167485030},
 {disk_free_limit,50000000},
 {disk_free,9088753664},
 {file_descriptors,
     [{total_limit,924},{total_used,8},{sockets_limit,829},{sockets_used,2}]},
 {processes,[{limit,1048576},{used,410}]},
 {run_queue,0},
 {uptime,153140},
 {kernel,{net_ticktime,60}}]

```

#### 1.2.2.2. 停止节点
<a href="#menu" style="float:right">目录</a>

使用rabbitmqctl stop来停止节点
注意这里是停止整个RabbitMQ节点(应用程序和Erlang节点一起).
```
lgj@lgj-Lenovo-G470:~/java/rabbitmq_server-3.7.9/sbin$ ./rabbitmqctl stop 
 
warning: the VM is running with native name encoding of latin1 which may cause Elixir to malfunction as it expects utf8. Please ensure your locale is set to UTF-8 (which can be verified by running "locale" in your shell)
Stopping and halting node rabbit@lgj-Lenovo-G470 ...
```
也可以关闭远程节点: rabbitmqctl stop -n rabbit@[hostname]
再次查看状态
```
lgj@lgj-Lenovo-G470:~/java/rabbitmq_server-3.7.9/sbin$ ./rabbitmqctl status

warning: the VM is running with native name encoding of latin1 which may cause Elixir to malfunction as it expects utf8. Please ensure your locale is set to UTF-8 (which can be verified by running "locale" in your shell)
Status of node rabbit@lgj-Lenovo-G470 ...
Error: unable to perform an operation on node 'rabbit@lgj-Lenovo-G470'. Please see diagnostics information and suggestions below.

Most common reasons for this are:

 * Target node is unreachable (e.g. due to hostname resolution, TCP connection or firewall issues)
 * CLI tool fails to authenticate with the server (e.g. due to CLI tool's Erlang cookie not matching that of the server)
 * Target node is not running

In addition to the diagnostics info below:

 * See the CLI, clustering and networking guides on http://rabbitmq.com/documentation.html to learn more
 * Consult server logs on node rabbit@lgj-Lenovo-G470

DIAGNOSTICS
===========

attempted to contact: ['rabbit@lgj-Lenovo-G470']

rabbit@lgj-Lenovo-G470:
  * connected to epmd (port 4369) on lgj-Lenovo-G470
  * epmd reports: node 'rabbit' not running at all
                  no other nodes on lgj-Lenovo-G470
  * suggestion: start the node

Current node details:
 * node name: 'rabbitmqcli-31202-rabbit@lgj-Lenovo-G470'
 * effective user's home directory: /home/lgj
 * Erlang cookie hash: 5OQcUQr6ixZUDypELnFO3g==



```
#### 1.2.2.3. 关闭和重启应用程序:有何差别
<a href="#menu" style="float:right">目录</a>

rabbitmqctl stop来停止节点,如果只是需要重启节点上的应用程序而保持节点的运行.

使用rabbitmqctl stop_app来关闭应用

```
rabbitmqctl stop_app
```

#### 1.2.2.4. 其他命令
<a href="#menu" style="float:right">目录</a>

```
rabbitmqctl list_queues：查看所有队列信息

rabbitmqctl stop_app：关闭应用（关闭当前启动的节点）

rabbitmqctl start_app：启动应用，和上述关闭命令配合使用，达到清空队列的目的

rabbitmqctl reset：从管理数据库中移除所有数据，例如配置过的用户和虚拟宿主, 删除所有持久化的消息（这个命令要在rabbitmqctl stop_app之后使用）

rabbitmqctl force_reset：作用和rabbitmqctl reset一样，区别是无条件重置节点，不管当前管理数据库状态以及集群的配置。如果数据库或者集群配置发生错误才使用这个最后的手段

rabbitmqctl status：节点状态

rabbitmqctl add_user username password：添加用户

rabbitmqctl list_users：列出所有用户

rabbitmqctl list_user_permissions username：列出用户权限

rabbitmqctl change_password username newpassword：修改密码

rabbitmqctl add_vhost vhostpath：创建虚拟主机

rabbitmqctl list_vhosts：列出所有虚拟主机

rabbitmqctl set_permissions -p vhostpath username ".*" ".*" ".*"：设置用户权限

rabbitmqctl list_permissions -p vhostpath：列出虚拟主机上的所有权限 

rabbitmqctl clear_permissions -p vhostpath username：清除用户权限

rabbitmqctl -p vhostpath purge_queue blue：清除队列里的消息

rabbitmqctl delete_user username：删除用户

rabbitmqctl delete_vhost vhostpath：删除虚拟主机
```
### 1.2.3. 请求许可
<a href="#menu" style="float:right">目录</a>


#### 1.2.3.1. 权限系统
<a href="#menu" style="float:right">目录</a>


**权限**
* 读
    * 有关消费消息的任何操作,包括清除整个队列
* 写
    * 发布消息
* 配置
    * 队列和交换器的创建和删除

每个用户创建时都有tags
* management
    * User can access the management plugin
* policymaker
    * User can access the management plugin and manage policies and parameters for the vhosts they have access to.
* monitoring
    * User can access the management plugin and see all connections and channels as well as node-related information.
* administrator
    * User can do everything monitoring can do, manage users, vhosts and permissions, close other user's connections, and manage policies and parameters for all vhosts.

AMQP操作到RabbitMQ权限的映射关系

|AMQP命令|配置|写|读|
|---|---|---|---|
|exchange.declare|exchange|-|-|
|exchange.delete|exchange|-|-|
|queue.declare|queue|-|-|
|queue.delete|queue|-|-|
|queue.bind|-|queue|-|
|basic.publish|-|exchange|-|
|basic.get|-|-|queue|
|basic.consume|-|-|queue|
|queue.purge|-|-|queue|

每一条访问控制条目由以下四部分组成
* 被授予访问权限的用户
* 权限控制应用的vhost
* 需要授予的读写配置权限的组合
* 权限范围--权限控制仅应用于客户端命名的队列/交换器还是仅应用于服务端命名的队列/交换器?抑或两者兼顾

注意用户不是和权限绑定的,用户只是提供访问认证,而访问权限由vhost-(用户+权限)控制.也就是说vhost可以配置不同的访问用户,并为该用户分配权限. 


web配置vhost权限

![vhost-permissions](https://github.com/lgjlife/Java-Study/blob/master/pic/rabbitmq/vhost-permissions.png?raw=true)

可以看到,图中的".*"即为分配权限的表达式
* ".*" 匹配任何队列和交换器
* "check-.*" 只匹配名字以"check-"开头的队列和交换器
* ""不匹配任何队列和交换器,也就是不分配权限
 

 
### 1.2.4. 检查
<a href="#menu" style="float:right">目录</a>

#### 1.2.4.1. 查看数据统计
<a href="#menu" style="float:right">目录</a>

#### 1.2.4.2. 理解日志
<a href="#menu" style="float:right">目录</a>

### 1.2.5. 疑难解答
<a href="#menu" style="float:right">目录</a>









## 1.3. 入门
<a href="#menu" style="float:right">目录</a>

整体模型
![rabbitmq](https://github.com/lgjlife/Java-Study/blob/master/pic/rabbitmq/rabbitmq.png?raw=true)

### 1.3.1. 相关概念介绍
<a href="#menu" style="float:right">目录</a>


#### 1.3.1.1. 生产者和消费值
<a href="#menu" style="float:right">目录</a>

* 生产者:生产者创建消息,然后发布到RabbitMQ中.
* 消息
    * 标签
        * 消息相关的内容,比如交换器名称等信息
    * 消息体
        * 具体的消息内容
    * 路由之后,存入到队列的消息只有消息体,没有标签
* 消费者
    * 从RabbitMQ中获取消息
    * 分为推模式和拉模式
* Broker
    * 消息中间件的服务节点
* 消息流转流程
    * 连接到RabbitMQ
    * 从连接中获取信道
    * 声明信道和队列并绑定
    * 应用数据被序列化为字节数据
    * 创建消息
    * 生产者发送数据    
    * 指定交换器路由方式等信息
    * 发送到Broker
    * 消息根据指定的策略分发到队列中
    * 消费者获取消息
    * 对消息进行反序列化操作
    * 获取到实际的消息,并进行处理
    * 关闭信道
    * 关闭连接

消费者收到消息之后,必须进行确认回复,可以配置成手动和自动的方式.如果,没有确认,rabbit将不会给该消费者再发送数据.这是因为rabbit认为没有收到确认之前,消费者还没有准备好接收下一条消息.如果确认之前,发生宕积,rabbit将会将该条消息重新放入队列从而发送给其他消费者.除此之外,还可以使用basicReject拒绝消息,rabbit收到后也会将消息重新入队.

```JAVA
public void basicReject(long deliveryTag, boolean requeue) throws IOException {
    //deliveryTag:相当于消息的ID
    //requeue:是否需要重新放入队列,以便进行继续消费,false的消息将可以被放入死信队列
    this.transmit(new Reject(deliveryTag, requeue));
    this.metricsCollector.basicReject(this, deliveryTag);
}
```
其中 deliveryTag 可以看作消息的编号 ，它是一个 64 位的长整型值，最大值是9223372036854775807 。如果 requeue 参数设置为 true ，则 RabbitMQ 会重新将这条消息存入队列，以便可以发送给下一个订阅的消费者;如果 requeue 参数设置为 false，则 RabbitMQ立即会把消息从队列中移除，而不会把它发送给新的消费者。


#### 1.3.1.2. 队列
<a href="#menu" style="float:right">目录</a>

Queue: 队列，是 RabbitMQ 的内部对象，用于存储消息

RabbitMQ中消息都只能存储在队列中，这一点和Katka这种消息中间件相反 。Katka 将消息存储在 topic(主题)这个逻辑层面，而相对应的队列逻辑只是topic实际存储文件中的位移标识。 RabbitMQ 的生产者生产消息井最终技递到队列中，消费者可以从队列中获取消息并消费 。

多个消费者可以订阅同一个队列，这时队列中的消息会被平均分摊 CRound-Robin ，即轮询)给多个消费者进行处理，而不是每个消费者都收到所有的消息井处理.RabbitMQ 不支持队列层面的广播消费，如果需要广播消费,可在消费端进行处理.

**消息分发:**当队列有多个消费者订阅时,队列将收到的消息循环发送给消费者,每条消息只会发送给一个消费者.



#### 1.3.1.3. 交换器,路由键,绑定
<a href="#menu" style="float:right">目录</a>

* Exchange (交换器)
    * 生产者将消息发送到 Exchange (交换器，通常也可以用大写的 "X" 来表示)，由交换器将消息路由到一个或者多个队列中。如果路由不到，或许会返回给生产者，或许直接丢弃。这里可以将 RabbitMQ 中的交换器看作一个简单的实体，
* RoutingKey: 路由键
    * 生产者将消息发给交换器 的时候， 一般会指定 一个 RoutingKey ，用来指定这个消息的路由规则，而这个 RoutingKey 需要与交换器类型和绑定键 (BindingKey) 联合使用才能最终生效。
* Binding: 绑定
    * RabbitMQ 中通过绑定将交换器与队列关联起来
    * 在绑定的时候一般会指定一个绑定键 ( BindingKey ) ，这样 RabbitMQ 就知道如何正确地将消息路由到队列

生产者将消息发送给交换器时， 需要一个 RoutingKey ， 当 BindingKey 和 RoutingKey 相匹配时， 消息会被路由 到对应的 队列 中。在绑定多个队列到同一个交换器的时候 ， 这些绑定允许使用相 同的 BindingKey 0 BindingKey 并不是在所有的情况下都生效，它依赖于交换器类型 ， 比如 fanout 类型 的交换器就会无视 BindingKey ， 而是将消息路由到所有绑定到该交换器的队列中 。



#### 1.3.1.4. 交换器类型
<a href="#menu" style="float:right">目录</a>

RabbitMQ 常用的交换器类型有 fanout 、 direct 、topic 、headers 这四种 。 AMQP协议里还提到另外两种类型: System 和自定义

* fanout
    * 它会把所有发送到该交换器的消息路由到所有与该交换器绑定的队列中。
* direct
    * direct 类型的交换器路由规则也很简单，它会把消息路由到那些 BindingKey 和 RoutingKey完全匹配的队列中。
* topic
    * topic 类型的交换器在匹配规则上进行了扩展，它与 direct 类型的交换器相似，也是将消息路由到 BindingKey 和 RoutingKey 相匹配的队列中
    * 匹配规则
        * RoutingKey 为一个点号"."分隔的字符串(被点号"."分隔开的每一段独立的字符串称为一个单词 )，如 "com.rabbimq.client"
        * BindingKey 和 RoutingKey 一样也是点号"."分隔的字符串;
        * BindingKey 中可以存在两种特殊字符串"*"和"#"，用于做模糊匹配，其中"*"用于匹配一个单词，"#"用于匹配多规格单词(可以是零个)。
* headers
    * headers 类型的交换器不依赖于路由键的匹配规则来路由消息，而是根据发送的消息内容中的 headers 属性进行匹配。在绑定队列和交换器时制定一组键值对 ， 当发送消息到交换器时，RabbitMQ 会获取到该消息的 headers (也是一个键值对的形式) ，对比其中的键值对是否完全匹配队列和交换器绑定时指定的键值对，如果完全匹配则消息会路由到该队列，否则不会路由到该队列 。 headers 类型的交换器性能会很差，而且也不实用，基本上不会看到它的存在。

#### 1.3.1.5. 多租户模式:虚拟主机和隔离
<a href="#menu" style="float:right">目录</a>

每个RabbitMQ都能创建虚拟消息服务器(也就是虚拟主机vhost),每一个vhost本质上是一个mini版的RabbitMQ服务器,每个vhost之间相互独立,有独立的权限控制,可以创建同名的交换器和队列.但还是同一个实例,只是逻辑上的隔离.

![rabbitmq](https://github.com/lgjlife/Java-Study/blob/master/pic/rabbitmq/vhost.png?raw=true)

如上图,根主机是"/",如果不需要配置新的虚拟主机,使用"/"即可.上面配置了两个虚拟主机"/blog"和"/rabbitmq",可以分配不同的用户进行管理


#### 1.3.1.6. 消息持久化
<a href="#menu" style="float:right">目录</a>

发送消息时,需要把投递模式(delivery mode)选项设置为2来把消息标记为持久化.它还必须被发布到持久化的交换器并且到达持久化队列中才行.否则,会在崩溃后重启消息不复存在.
因为消息想要实现从崩溃中恢复:
* 消息投递模式选项设计为2(持久化)
* 消息发送到持久化的交换器
* 消息发送到持久化的队列

RabbitMQ确保持久性消息能从服务器重启中恢复的方式是,将它们写入磁盘上的一个持久化日志文件.当发布一条持久性的消息到持久交换器上时,RabbitMQ会在消息提交到日志文件后才发送响应.如果这条消息被路由到非持久化的队列中,这条消息会从持久化文件中删除,并且无法恢复.一旦从持久化队列中消费了一条持久化消息(必须收到消费者消费成功的消息ack),Rabbit会将持久化日志中的这条消息标记为等待垃圾收集.
当出现异常并重启RabbitMQ服务器,服务器会自动重建交换器和队列,并重播消息到交换器或者队列上(取决于宕积时消息路由所在的过程)

使用持久化会增加性能消耗,降低吞吐量.因为写入磁盘速度较慢.

持久消息在RabbitMQ内建集群环境下工作并不是很好.虽然Rabbit集群允许客户端和集群中的任何节点的任一队列进行通信,但是事实上那些队列均匀地分布在各个节点而没有冗余(在集群中任何一个队列都没有备份地拷贝),如果运行某个队列的集群节点崩溃了,那么直到节点恢复之前,这个队列也就从整个集群中消失了(如果队列是可持久化的),这时这些消息将暂时无法被消费.

**发送方确认模式**
RabbitMQ没有使用事务来提高消息可靠性,而是使用发送方确认模式(异步).使用时需要将信道设置成confirm模式,而且只能通过重新创建信道来关闭该设置.一旦信道进入confirm模式,所有在信道上发布的消息都会被指派一个唯一的ID号.一旦消息被投递到所有匹配的队列后,信道会发送一个发送方确认模式给生产者应用程序(包括消息的唯一ID).这使得生产者可以知道消息是否发送成功.如果消息和队列都是持久化的,那么消息只有在写入磁盘后才会返回应答消息.如果Rabbit发生内部错误导致消息的丢失,其会返回nack(not acknowledged,未确认)消息.由于没有消息回滚的概念(同事务相比),因此发送方确认模式更加轻量级.



#### 1.3.1.7. RabbitMQ运转流程
<a href="#menu" style="float:right">目录</a>

**生产者**
(1) 生产者连接到 RabbitMQ Broker ， 建立一个连接( Connection) ，开启 一个信道 (Channel)
(2) 生产者声明一个交换器 ，并设置相关属性，比如 交换机类型、是否持久化等
(3) 生产者声明 一个队列井设置相关属性，比如是否排他、是否持久化、是否自动删除等
(4) 生产者通过路由键将交换器和队列绑定起来
(5) 生产者发送消息至 RabbitMQ Broker，其中包含路由键、交换器等信息
(6) 相应的交换器根据接收到的路由键查找相匹配的队列 。
(7) 如果找到 ，则将从生产者发送过来的消息存入相应的队列中。
(8) 如果没有找到 ，则根据生产者配置的属性选择丢弃还是回退给生产者
(9) 关闭信道。
(10) 关闭连接。

**消费者**
(1) 消费者连接到 RabbitMQ Broker，建立一个连接 (Connection ) ，开启 一个信道 (Channel) 。
(2) 消费者向 RabbitMQ Broker 请求消费相应队列中的消息，可能会设置相应的回调函数，以及做一些准备工作
(3) 等待 RabbitMQ Broker 回应并投递相应队列中的消息， 消费者接收消息。
(4) 消费者确认 ( ack) 接收到的消息 。
(5) RabbitMQ 从队列中删除相应己经被确认的消息 。
(6) 关闭信道。
(7) 关闭连接。


两个新的概念: Connection 和 Channel。我们知道无论是生产者还是消费者，都需要和 RabbitMQ Broker 建立连接，这个连接就是一条 TCP 连接，也就是Connection 。 一旦 TCP 连接建立起来，客户端紧接着可以创建一个 AMQP 信道 (Channel) ，每个信道都会被指派一个唯一的 D。信道是建立在 Connection 之上的虚拟连接， RabbitMQ 处理的每条 AMQP 指令都是通过信道完成的。

我们完全可以直接使用 Connection 就能完成信道的工作，为什么还要引入信道呢?试想这样一个场景， 一个应用程序中有很多个线程需要从 RabbitMQ 中消费消息，或者生产消息，那么必然需要建立很多个 Connection，也就是许多个 TCP 连接。然而对于操作系统而言，建立和销毁 TCP 连接是非常昂贵的开销，如果遇到使用高峰，性能瓶颈也随之显现。 RabbitMQ 采用类似 NIO' (Non-blocking 1/0) 的做法，选择 TCP 连接复用，不仅可以减少性能开销，同时也便于管理 。

NIO，也称非阻塞 UO ， 包含三大核心部分 Channel (信道)、 Buffer (缓冲区)和 Selector (选择器). NIO 基于 Channel 和Buffer 进行操作，数据总是从信道读取数据到缓冲区中，或者从缓冲区写入到信道中。 Selector 用于监听多个信道的事件(比如连接打开，数据到达等)。因此，单线程可以监听多个数据的信道。

每个线程把持一个信道，所以信道复用了 Connection 的 TCP 连接。同时 RabbitMQ 可以确保每个线程的私密性，就像拥有独立的连接一样。当每个信道的流量不是很大时，复用单一 的Connection 可以在产生性能瓶颈的情况下有效地节省 TCP 连接资源。但是当信道本身的流量很大时，这时候多个信道复用一个 Connection 就会产生性能瓶颈，进而使整体的流量被限制了。此时就需要开辟多个 Connection，将这些信道均摊到这些 Connection 中， 至于这些相关的调优策略需要根据业务自身的实际情况进行调节

信道在 AMQP 中是一个很重要的概念，大多数操作都是在信道这个层面展开的。


#### 1.3.1.8. 通信模式
<a href="#menu" style="float:right">目录</a>

* TCP的创建和销毁，开销大，创建需要三次握手，销毁需要四次分手
* 如果不使用信道，那么应用程序就会使用TCP的方式连接到rabbitmq，高峰时每秒成千上万条连接会造成资源的巨大浪费(一条tcp消耗资源，成千上万的tcp会非常消耗资源)，而且操作系统每秒处理TCP连接数量也是有限的，必定会造成性能瓶颈
* 信道的原理是一条线程一条信道，多条线程多条信道共同使用一条TCP连接。一条TCP连接可以容纳无限的信道，及时每秒造成成千上万的请求也不会造成性能瓶颈

**为什么使用信道而不是连接**
对操作系统来说,建立和销毁TCP会话是非常昂贵的开销.假设每个线程都需要自行连接到RabbitMQ服务器.将会导致高峰期连接数很高.导致连接资源不够用,造成性能问题.

### 1.3.2. AMQP协议介绍
<a href="#menu" style="float:right">目录</a>

RabbitMQ 就是 AMQP协议的 Erlang 的实现(当然 RabbitMQ 还支持 STOMP2 、 MQTT3 等协议 ) AMQP 的模型架构和 RabbitMQ 的模型架构是一样的，生产者将消息发送给交换器，交换器和队列绑定 。当生产者发送消息时所携带的 RoutingKey 与绑定时 的 BindingKey 相匹配时，消息即被存入相应的队列之中 。 消费者可以订阅相应的队列来获取消息 。

RabbitMQ 中的交换器、交换器类型、队列、绑定 、路由键等都是遵循的 AMQP 协议中相应的概念

AMQP 协议本身包括三层。
* Module Layer: 位于协议最高层，主要定义了一些供客户端调用的命令，客户端可以利用这些命令实现自己的业务逻辑。例如，客户端可以使用 Queue . Declare 命令声明一个队列或者使用 Basic.Consume 订阅消费一个队列中的消息。
* Session Layer: 位于中间层，主要负责将客户端的命令发送给服务器，再将服务端的应答返回给客户端，主要为客户端与服务器之间的通信提供可靠性同步机制和错误处理。
* Transport Layer: 位于最底层，主要传输二进制数据流 ，提供帧的处理、信道复用、错误检测和数据表示等。

AMQP 说到底还是一个通信协议，通信协议都会涉及报文交互，从 low-level 举例来说，AMQP 本身是应用层的协议，其填充于 TCP 协议层的数据部分。而从 high-level 来说， AMQP是通过协议命令进行交互的。 AMQP 协议可以看作一系列结构化命令的集合，这里的命令代表一种操作，类似于 HTTP 中的方法 (GET、 POST 、 PUT、 DELETE 等) 。

#### 1.3.2.1. AMQP生产者流转过程
<a href="#menu" style="float:right">目录</a>

#### 1.3.2.2. AMQP消费者流转过程
<a href="#menu" style="float:right">目录</a>

### 1.3.3. 配置
<a href="#menu" style="float:right">目录</a>

RabbitMQ提供了三种方式来定制化服务:
(1)环境变量(EnviromentVariables).RabbitMQ服务端参数可以通过环境变量进行配置，例如，节点名称、RabbitMQ配直文件的地址、节点内部通信端口等。
(2)配直文件(ConfigurationFile).可以定义RabbitMQ服务和插件设直，例如，TCP监听端口，以及其他网络相关的设直、内存限制、磁盘限制等。
(3)运行时参数和策略(RuntimeParametersandPolicies)。可以在运行时定义集群层面的服务设直.

#### 1.3.3.1. 环境变量
<a href="#menu" style="float:right">目录</a>

#### 1.3.3.2. 配置文件
<a href="#menu" style="float:right">目录</a>

Ubuntu系统上RabbitMQ的配置文件应该存储在/etc/rabbitmq/rabbitmq.conf

如果没有，在RabbitMQ的启动log里面会有如下的信息：
```
=INFO REPORT==== 6-Jan-2019::04:27:20 ===
Starting RabbitMQ 3.6.10 on Erlang 20.2.2
Copyright (C) 2007-2017 Pivotal Software, Inc.
Licensed under the MPL.  See http://www.rabbitmq.com/

=INFO REPORT==== 6-Jan-2019::04:27:20 ===
node           : rabbit@lgj-Lenovo-G470
home dir       : /var/lib/rabbitmq
config file(s) : /etc/rabbitmq/rabbitmq.config (not found)
cookie hash    : MzWDEruAg0nLfcY+xw6MOg==
log            : /var/log/rabbitmq/rabbit@lgj-Lenovo-G470.log
sasl log       : /var/log/rabbitmq/rabbit@lgj-Lenovo-G470-sasl.log
database dir   : /var/lib/rabbitmq/mnesia/rabbit@lgj-Lenovo-G470

```

这个时候可以复制RabbitMQ的example文件: https://github.com/rabbitmq/rabbitmq-server/blob/master/docs/rabbitmq.conf.example

如果系统不能识别， 试试在/etc/rabbitmq下面增加rabbitmq-env.conf, 内容如下：
```
root@iZuf6cdovpqjj6q2xqxrjlZ:/etc/rabbitmq# vim /etc/rabbitmq/rabbitmq-env.conf
```
CONFIG_FILE=/etc/rabbitmq/rabbitmq
 注意： 没有.conf后缀！

配置文件改动之后， 需要杀掉rabbitmq-server的进程重新启动。

官方提供的配置文件

```yml
# ======================================
# RabbitMQ broker section
# ======================================

## Related doc guide: https://rabbitmq.com/configure.html. See
## https://rabbitmq.com/documentation.html for documentation ToC.

## Networking
## ====================
##
## Related doc guide: https://rabbitmq.com/networking.html.
##
## By default, RabbitMQ will listen on all interfaces, using
## the standard (reserved) AMQP 0-9-1 and 1.0 port.
##
# listeners.tcp.default = 5672


## To listen on a specific interface, provide an IP address with port.
## For example, to listen only on localhost for both IPv4 and IPv6:
##
# IPv4
# listeners.tcp.local    = 127.0.0.1:5672
# IPv6
# listeners.tcp.local_v6 = ::1:5672

## You can define multiple listeners using listener names
# listeners.tcp.other_port = 5673
# listeners.tcp.other_ip   = 10.10.10.10:5672


## TLS listeners are configured in the same fashion as TCP listeners,
## including the option to control the choice of interface.
##
# listeners.ssl.default = 5671

## Number of Erlang processes that will accept connections for the TCP
## and TLS listeners.
##
# num_acceptors.tcp = 10
# num_acceptors.ssl = 10


## Maximum amount of time allowed for the AMQP 0-9-1 and AMQP 1.0 handshake
## (performed after socket connection and TLS handshake) to complete, in milliseconds.
##
# handshake_timeout = 10000

## Set to 'true' to perform reverse DNS lookups when accepting a
## connection. rabbitmqctl and management UI will then display hostnames
## instead of IP addresses. Default value is `false`.
##
# reverse_dns_lookups = false

##
## Security, Access Control
## ==============
##

## Related doc guide: https://rabbitmq.com/access-control.html.

## The default "guest" user is only permitted to access the server
## via a loopback interface (e.g. localhost).
## {loopback_users, [<<"guest">>]},
##
# loopback_users.guest = true

## Uncomment the following line if you want to allow access to the
## guest user from anywhere on the network.
# loopback_users.guest = false

## TLS configuration.
##
## Related doc guide: https://rabbitmq.com/ssl.html.
##
# ssl_options.verify               = verify_peer
# ssl_options.fail_if_no_peer_cert = false
# ssl_options.cacertfile           = /path/to/cacert.pem
# ssl_options.certfile             = /path/to/cert.pem
# ssl_options.keyfile              = /path/to/key.pem
#
# ssl_options.honor_cipher_order   = true
# ssl_options.honor_ecc_order      = true

# ssl_options.ciphers.1  = ECDHE-ECDSA-AES256-GCM-SHA384
# ssl_options.ciphers.2  = ECDHE-RSA-AES256-GCM-SHA384
# ssl_options.ciphers.3  = ECDHE-ECDSA-AES256-SHA384
# ssl_options.ciphers.4  = ECDHE-RSA-AES256-SHA384
# ssl_options.ciphers.5  = ECDH-ECDSA-AES256-GCM-SHA384
# ssl_options.ciphers.6  = ECDH-RSA-AES256-GCM-SHA384
# ssl_options.ciphers.7  = ECDH-ECDSA-AES256-SHA384
# ssl_options.ciphers.8  = ECDH-RSA-AES256-SHA384
# ssl_options.ciphers.9  = DHE-RSA-AES256-GCM-SHA384
# ssl_options.ciphers.10 = DHE-DSS-AES256-GCM-SHA384
# ssl_options.ciphers.11 = DHE-RSA-AES256-SHA256
# ssl_options.ciphers.12 = DHE-DSS-AES256-SHA256
# ssl_options.ciphers.13 = ECDHE-ECDSA-AES128-GCM-SHA256
# ssl_options.ciphers.14 = ECDHE-RSA-AES128-GCM-SHA256
# ssl_options.ciphers.15 = ECDHE-ECDSA-AES128-SHA256
# ssl_options.ciphers.16 = ECDHE-RSA-AES128-SHA256
# ssl_options.ciphers.17 = ECDH-ECDSA-AES128-GCM-SHA256
# ssl_options.ciphers.18 = ECDH-RSA-AES128-GCM-SHA256
# ssl_options.ciphers.19 = ECDH-ECDSA-AES128-SHA256
# ssl_options.ciphers.20 = ECDH-RSA-AES128-SHA256
# ssl_options.ciphers.21 = DHE-RSA-AES128-GCM-SHA256
# ssl_options.ciphers.22 = DHE-DSS-AES128-GCM-SHA256
# ssl_options.ciphers.23 = DHE-RSA-AES128-SHA256
# ssl_options.ciphers.24 = DHE-DSS-AES128-SHA256
# ssl_options.ciphers.25 = ECDHE-ECDSA-AES256-SHA
# ssl_options.ciphers.26 = ECDHE-RSA-AES256-SHA
# ssl_options.ciphers.27 = DHE-RSA-AES256-SHA
# ssl_options.ciphers.28 = DHE-DSS-AES256-SHA
# ssl_options.ciphers.29 = ECDH-ECDSA-AES256-SHA
# ssl_options.ciphers.30 = ECDH-RSA-AES256-SHA
# ssl_options.ciphers.31 = ECDHE-ECDSA-AES128-SHA
# ssl_options.ciphers.32 = ECDHE-RSA-AES128-SHA
# ssl_options.ciphers.33 = DHE-RSA-AES128-SHA
# ssl_options.ciphers.34 = DHE-DSS-AES128-SHA
# ssl_options.ciphers.35 = ECDH-ECDSA-AES128-SHA
# ssl_options.ciphers.36 = ECDH-RSA-AES128-SHA

## Select an authentication/authorisation backend to use.
##
## Alternative backends are provided by plugins, such as rabbitmq-auth-backend-ldap.
##
## NB: These settings require certain plugins to be enabled.
##
## Related doc guides:
##
##  * https://rabbitmq.com/plugins.html
##  * https://rabbitmq.com/access-control.html
##

# auth_backends.1   = rabbit_auth_backend_internal

## uses separate backends for authentication and authorisation,
## see below.
# auth_backends.1.authn = rabbit_auth_backend_ldap
# auth_backends.1.authz = rabbit_auth_backend_internal

## The rabbitmq_auth_backend_ldap plugin allows the broker to
## perform authentication and authorisation by deferring to an
## external LDAP server.
##
## Relevant doc guides:
##
## * https://rabbitmq.com/ldap.html
## * https://rabbitmq.com/access-control.html
##
## uses LDAP for both authentication and authorisation
# auth_backends.1 = rabbit_auth_backend_ldap

## uses HTTP service for both authentication and
## authorisation
# auth_backends.1 = rabbit_auth_backend_http

## uses two backends in a chain: HTTP first, then internal
# auth_backends.1   = rabbit_auth_backend_http
# auth_backends.2   = rabbit_auth_backend_internal

## Authentication
## The built-in mechanisms are 'PLAIN',
## 'AMQPLAIN', and 'EXTERNAL' Additional mechanisms can be added via
## plugins.
##
## Related doc guide: https://rabbitmq.com/authentication.html.
##
# auth_mechanisms.1 = PLAIN
# auth_mechanisms.2 = AMQPLAIN

## The rabbitmq-auth-mechanism-ssl plugin makes it possible to
## authenticate a user based on the client's x509 (TLS) certificate.
## Related doc guide: https://rabbitmq.com/authentication.html.
##
## To use auth-mechanism-ssl, the EXTERNAL mechanism should
## be enabled:
##
# auth_mechanisms.1 = PLAIN
# auth_mechanisms.2 = AMQPLAIN
# auth_mechanisms.3 = EXTERNAL

## To force x509 certificate-based authentication on all clients,
## exclude all other mechanisms (note: this will disable password-based
## authentication even for the management UI!):
##
# auth_mechanisms.1 = EXTERNAL

## This pertains to both the rabbitmq-auth-mechanism-ssl plugin and
## STOMP ssl_cert_login configurations. See the RabbitMQ STOMP plugin
## configuration section later in this file and the README in
## https://github.com/rabbitmq/rabbitmq-auth-mechanism-ssl for further
## details.
##
## To use the TLS cert's CN instead of its DN as the username
##
# ssl_cert_login_from   = common_name

## TLS handshake timeout, in milliseconds.
##
# ssl_handshake_timeout = 5000


## Cluster name
##
# cluster_name = dev3.eng.megacorp.local

## Password hashing implementation. Will only affect newly
## created users. To recalculate hash for an existing user
## it's necessary to update her password.
##
## To use SHA-512, set to rabbit_password_hashing_sha512.
##
# password_hashing_module = rabbit_password_hashing_sha256

## When importing definitions exported from versions earlier
## than 3.6.0, it is possible to go back to MD5 (only do this
## as a temporary measure!) by setting this to rabbit_password_hashing_md5.
##
# password_hashing_module = rabbit_password_hashing_md5

##
## Default User / VHost
## ====================
##

## On first start RabbitMQ will create a vhost and a user. These
## config items control what gets created.
## Relevant doc guide: https://rabbitmq.com/access-control.html
##
# default_vhost = /
# default_user = guest
# default_pass = guest

# default_permissions.configure = .*
# default_permissions.read = .*
# default_permissions.write = .*

## Tags for default user
##
## For more details about tags, see the documentation for the
## Management Plugin at https://rabbitmq.com/management.html.
##
# default_user_tags.administrator = true

## Define other tags like this:
# default_user_tags.management = true
# default_user_tags.custom_tag = true

##
## Additional network and protocol related configuration
## =====================================================
##

## Set the default AMQP 0-9-1 heartbeat interval (in seconds).
## Related doc guides:
##
## * https://rabbitmq.com/heartbeats.html
## * https://rabbitmq.com/networking.html
##
# heartbeat = 60

## Set the max permissible size of an AMQP frame (in bytes).
##
# frame_max = 131072

## Set the max frame size the server will accept before connection
## tuning occurs
##
# initial_frame_max = 4096

## Set the max permissible number of channels per connection.
## 0 means "no limit".
##
# channel_max = 128

## Customising TCP Listener (Socket) Configuration.
##
## Related doc guides:
##
## * https://rabbitmq.com/networking.html
## * https://www.erlang.org/doc/man/inet.html#setopts-2
##

# tcp_listen_options.backlog = 128
# tcp_listen_options.nodelay = true
# tcp_listen_options.exit_on_close = false
#
# tcp_listen_options.keepalive = true
# tcp_listen_options.send_timeout = 15000
#
# tcp_listen_options.buffer = 196608
# tcp_listen_options.sndbuf = 196608
# tcp_listen_options.recbuf = 196608

##
## Resource Limits & Flow Control
## ==============================
##
## Related doc guide: https://rabbitmq.com/memory.html.

## Memory-based Flow Control threshold.
##
# vm_memory_high_watermark.relative = 0.4

## Alternatively, we can set a limit (in bytes) of RAM used by the node.
##
# vm_memory_high_watermark.absolute = 1073741824

## Or you can set absolute value using memory units (with RabbitMQ 3.6.0+).
## Absolute watermark will be ignored if relative is defined!
##
# vm_memory_high_watermark.absolute = 2GB
##
## Supported unit symbols:
##
## k, kiB: kibibytes (2^10 - 1,024 bytes)
## M, MiB: mebibytes (2^20 - 1,048,576 bytes)
## G, GiB: gibibytes (2^30 - 1,073,741,824 bytes)
## kB: kilobytes (10^3 - 1,000 bytes)
## MB: megabytes (10^6 - 1,000,000 bytes)
## GB: gigabytes (10^9 - 1,000,000,000 bytes)



## Fraction of the high watermark limit at which queues start to
## page message out to disc in order to free up memory.
## For example, when vm_memory_high_watermark is set to 0.4 and this value is set to 0.5,
## paging can begin as early as when 20% of total available RAM is used by the node.
##
## Values greater than 1.0 can be dangerous and should be used carefully.
##
## One alternative to this is to use durable queues and publish messages
## as persistent (delivery mode = 2). With this combination queues will
## move messages to disk much more rapidly.
##
## Another alternative is to configure queues to page all messages (both
## persistent and transient) to disk as quickly
## as possible, see https://rabbitmq.com/lazy-queues.html.
##
# vm_memory_high_watermark_paging_ratio = 0.5

## Selects Erlang VM memory consumption calculation strategy. Can be `allocated`, `rss` or `legacy` (aliased as `erlang`),
## Introduced in 3.6.11. `rss` is the default as of 3.6.12.
## See https://github.com/rabbitmq/rabbitmq-server/issues/1223 and rabbitmq/rabbitmq-common#224 for background.
# vm_memory_calculation_strategy = rss

## Interval (in milliseconds) at which we perform the check of the memory
## levels against the watermarks.
##
# memory_monitor_interval = 2500

## The total memory available can be calculated from the OS resources
## - default option - or provided as a configuration parameter.
# total_memory_available_override_value = 2GB

## Set disk free limit (in bytes). Once free disk space reaches this
## lower bound, a disk alarm will be set - see the documentation
## listed above for more details.
##
## Absolute watermark will be ignored if relative is defined!
# disk_free_limit.absolute = 50000

## Or you can set it using memory units (same as in vm_memory_high_watermark)
## with RabbitMQ 3.6.0+.
# disk_free_limit.absolute = 500KB
# disk_free_limit.absolute = 50mb
# disk_free_limit.absolute = 5GB

## Alternatively, we can set a limit relative to total available RAM.
##
## Values lower than 1.0 can be dangerous and should be used carefully.
# disk_free_limit.relative = 2.0

##
## Clustering
## =====================
##
# cluster_partition_handling = ignore

## pause_if_all_down strategy require additional configuration
# cluster_partition_handling = pause_if_all_down

## Recover strategy. Can be either 'autoheal' or 'ignore'
# cluster_partition_handling.pause_if_all_down.recover = ignore

## Node names to check
# cluster_partition_handling.pause_if_all_down.nodes.1 = rabbit@localhost
# cluster_partition_handling.pause_if_all_down.nodes.2 = hare@localhost

## Mirror sync batch size, in messages. Increasing this will speed
## up syncing but total batch size in bytes must not exceed 2 GiB.
## Available in RabbitMQ 3.6.0 or later.
##
# mirroring_sync_batch_size = 4096

## Make clustering happen *automatically* at startup. Only applied
## to nodes that have just been reset or started for the first time.
##
## Relevant doc guide: https://rabbitmq.com//cluster-formation.html
##

# cluster_formation.peer_discovery_backend     = rabbit_peer_discovery_classic_config
#
# cluster_formation.classic_config.nodes.1 = rabbit1@hostname
# cluster_formation.classic_config.nodes.2 = rabbit2@hostname
# cluster_formation.classic_config.nodes.3 = rabbit3@hostname
# cluster_formation.classic_config.nodes.4 = rabbit4@hostname

## DNS-based peer discovery. This backend will list A records
## of the configured hostname and perform reverse lookups for
## the addresses returned.

# cluster_formation.peer_discovery_backend = rabbit_peer_discovery_dns
# cluster_formation.dns.hostname = discovery.eng.example.local

## This node's type can be configured. If you are not sure
## what node type to use, always use 'disc'.
# cluster_formation.node_type = disc

## Interval (in milliseconds) at which we send keepalive messages
## to other cluster members. Note that this is not the same thing
## as net_ticktime; missed keepalive messages will not cause nodes
## to be considered down.
##
# cluster_keepalive_interval = 10000

##
## Statistics Collection
## =====================
##

## Set (internal) statistics collection granularity.
##
## Can be none, coarse or fine
# collect_statistics = none

# collect_statistics = coarse

## Statistics collection interval (in milliseconds). Increasing
## this will reduce the load on management database.
##
# collect_statistics_interval = 5000

##
## Misc/Advanced Options
## =====================
##
## NB: Change these only if you understand what you are doing!
##

## Explicitly enable/disable hipe compilation.
##
# hipe_compile = false

## Timeout used when waiting for Mnesia tables in a cluster to
## become available.
##
# mnesia_table_loading_retry_timeout = 30000

## Retries when waiting for Mnesia tables in the cluster startup. Note that
## this setting is not applied to Mnesia upgrades or node deletions.
##
# mnesia_table_loading_retry_limit = 10

## Size in bytes below which to embed messages in the queue index.
## Related doc guide: https://rabbitmq.com/persistence-conf.html
##
# queue_index_embed_msgs_below = 4096

## You can also set this size in memory units
##
# queue_index_embed_msgs_below = 4kb

## Whether or not to enable background periodic forced GC runs for all
## Erlang processes on the node in "waiting" state.
##
## Disabling background GC may reduce latency for client operations,
## keeping it enabled may reduce median RAM usage by the binary heap
## (see https://www.erlang-solutions.com/blog/erlang-garbage-collector.html).
##
## Before trying this option, please take a look at the memory
## breakdown (https://www.rabbitmq.com/memory-use.html).
##
# background_gc_enabled = false

## Target (desired) interval (in milliseconds) at which we run background GC.
## The actual interval will vary depending on how long it takes to execute
## the operation (can be higher than this interval). Values less than
## 30000 milliseconds are not recommended.
##
# background_gc_target_interval = 60000

## Whether or not to enable proxy protocol support.
## Once enabled, clients cannot directly connect to the broker
## anymore. They must connect through a load balancer that sends the
## proxy protocol header to the broker at connection time.
## This setting applies only to AMQP clients, other protocols
## like MQTT or STOMP have their own setting to enable proxy protocol.
## See the plugins documentation for more information.
##
# proxy_protocol = false

## ----------------------------------------------------------------------------
## Advanced Erlang Networking/Clustering Options.
##
## Related doc guide: https://rabbitmq.com/clustering.html
## ----------------------------------------------------------------------------

# ======================================
# Kernel section
# ======================================

## Timeout used to detect peer unavailability, including CLI tools.
## Related doc guide: https://www.rabbitmq.com/nettick.html.
##
# net_ticktime = 60

## Inter-node communication port range.
## The parameters inet_dist_listen_min and inet_dist_listen_max
## can be configured in the classic config format only.
## Related doc guide: https://www.rabbitmq.com/networking.html#epmd-inet-dist-port-range.


## ----------------------------------------------------------------------------
## RabbitMQ Management Plugin
##
## Related doc guide: https://rabbitmq.com/management.html.
## ----------------------------------------------------------------------------

# =======================================
# Management section
# =======================================

## Preload schema definitions from the following JSON file.
## Related doc guide: https://rabbitmq.com/management.html#load-definitions.
##
# management.load_definitions = /path/to/exported/definitions.json

## Log all requests to the management HTTP API to a file.
##
# management.http_log_dir = /path/to/access.log

## HTTP listener and embedded Web server settings.
# ## See https://rabbitmq.com/management.html for details.
#
# management.tcp.port = 15672
# management.tcp.ip   = 0.0.0.0
#
# management.tcp.shutdown_timeout   = 7000
# management.tcp.max_keepalive      = 120
# management.tcp.idle_timeout       = 120
# management.tcp.inactivity_timeout = 120
# management.tcp.request_timeout    = 120
# management.tcp.compress           = true

## HTTPS listener settings.
## See https://rabbitmq.com/management.html and https://rabbitmq.com/ssl.html for details.
##
# management.ssl.port       = 15671
# management.ssl.cacertfile = /path/to/ca_certificate.pem
# management.ssl.certfile   = /path/to/server_certificate.pem
# management.ssl.keyfile    = /path/to/server_key.pem

## More TLS options
# management.ssl.honor_cipher_order   = true
# management.ssl.honor_ecc_order      = true
# management.ssl.client_renegotiation = false
# management.ssl.secure_renegotiate   = true

## Supported TLS versions
# management.ssl.versions.1 = tlsv1.2
# management.ssl.versions.2 = tlsv1.1

## Cipher suites the server is allowed to use
# management.ssl.ciphers.1 = ECDHE-ECDSA-AES256-GCM-SHA384
# management.ssl.ciphers.2 = ECDHE-RSA-AES256-GCM-SHA384
# management.ssl.ciphers.3 = ECDHE-ECDSA-AES256-SHA384
# management.ssl.ciphers.4 = ECDHE-RSA-AES256-SHA384
# management.ssl.ciphers.5 = ECDH-ECDSA-AES256-GCM-SHA384
# management.ssl.ciphers.6 = ECDH-RSA-AES256-GCM-SHA384
# management.ssl.ciphers.7 = ECDH-ECDSA-AES256-SHA384
# management.ssl.ciphers.8 = ECDH-RSA-AES256-SHA384
# management.ssl.ciphers.9 = DHE-RSA-AES256-GCM-SHA384



## One of 'basic', 'detailed' or 'none'. See
## https://rabbitmq.com/management.html#fine-stats for more details.
# management.rates_mode = basic

## Configure how long aggregated data (such as message rates and queue
## lengths) is retained. Please read the plugin's documentation in
## https://rabbitmq.com/management.html#configuration for more
## details.
## Your can use 'minute', 'hour' and 'day' keys or integer key (in seconds)
# management.sample_retention_policies.global.minute    = 5
# management.sample_retention_policies.global.hour  = 60
# management.sample_retention_policies.global.day = 1200

# management.sample_retention_policies.basic.minute   = 5
# management.sample_retention_policies.basic.hour = 60

# management.sample_retention_policies.detailed.10 = 5

## ----------------------------------------------------------------------------
## RabbitMQ Shovel Plugin
##
## Related doc guide: https://rabbitmq.com/shovel.html
## ----------------------------------------------------------------------------

## See advanced.config.example for a Shovel plugin example


## ----------------------------------------------------------------------------
## RabbitMQ STOMP Plugin
##
## Related doc guide: https://rabbitmq.com/stomp.html
## ----------------------------------------------------------------------------

# =======================================
# STOMP section
# =======================================

## See https://rabbitmq.com/stomp.html for details.

## TCP listeners.
##
# stomp.listeners.tcp.1 = 127.0.0.1:61613
# stomp.listeners.tcp.2 = ::1:61613

## TCP listener settings
##
# stomp.tcp_listen_options.backlog   = 2048
# stomp.tcp_listen_options.recbuf    = 131072
# stomp.tcp_listen_options.sndbuf    = 131072
#
# stomp.tcp_listen_options.keepalive = true
# stomp.tcp_listen_options.nodelay   = true
#
# stomp.tcp_listen_options.exit_on_close = true
# stomp.tcp_listen_options.send_timeout  = 120

## Proxy protocol support
##
# stomp.proxy_protocol = false

## TLS listeners
## See https://rabbitmq.com/stomp.html and https://rabbitmq.com/ssl.html for details.
# stomp.listeners.ssl.default = 61614
#
# ssl_options.cacertfile = path/to/cacert.pem
# ssl_options.certfile   = path/to/cert.pem
# ssl_options.keyfile    = path/to/key.pem
# ssl_options.verify     =  verify_peer
# ssl_options.fail_if_no_peer_cert = true


## Number of Erlang processes that will accept connections for the TCP
## and TLS listeners.
##
# stomp.num_acceptors.tcp = 10
# stomp.num_acceptors.ssl = 1

## Additional TLS options

## Extract a name from the client's certificate when using TLS.
##
# stomp.ssl_cert_login = true

## Set a default user name and password. This is used as the default login
## whenever a CONNECT frame omits the login and passcode headers.
##
## Please note that setting this will allow clients to connect without
## authenticating!
##
# stomp.default_user = guest
# stomp.default_pass = guest

## If a default user is configured, or you have configured use TLS client
## certificate based authentication, you can choose to allow clients to
## omit the CONNECT frame entirely. If set to true, the client is
## automatically connected as the default user or user supplied in the
## TLS certificate whenever the first frame sent on a session is not a
## CONNECT frame.
##
# stomp.implicit_connect = true

## Whether or not to enable proxy protocol support.
## Once enabled, clients cannot directly connect to the broker
## anymore. They must connect through a load balancer that sends the
## proxy protocol header to the broker at connection time.
## This setting applies only to STOMP clients, other protocols
## like MQTT or AMQP have their own setting to enable proxy protocol.
## See the plugins or broker documentation for more information.
##
# stomp.proxy_protocol = false

## ----------------------------------------------------------------------------
## RabbitMQ MQTT Adapter
##
## See https://github.com/rabbitmq/rabbitmq-mqtt/blob/stable/README.md
## for details
## ----------------------------------------------------------------------------

# =======================================
# MQTT section
# =======================================

## TCP listener settings.
##
# mqtt.listeners.tcp.1 = 127.0.0.1:61613
# mqtt.listeners.tcp.2 = ::1:61613

## TCP listener options (as per the broker configuration).
##
# mqtt.tcp_listen_options.backlog = 4096
# mqtt.tcp_listen_options.recbuf  = 131072
# mqtt.tcp_listen_options.sndbuf  = 131072
#
# mqtt.tcp_listen_options.keepalive = true
# mqtt.tcp_listen_options.nodelay   = true
#
# mqtt.tcp_listen_options.exit_on_close = true
# mqtt.tcp_listen_options.send_timeout  = 120

## TLS listener settings
## ## See https://rabbitmq.com/mqtt.html and https://rabbitmq.com/ssl.html for details.
#
# mqtt.listeners.ssl.default = 8883
#
# ssl_options.cacertfile = /path/to/tls/ca_certificate_bundle.pem
# ssl_options.certfile   = /path/to/tls/server_certificate.pem
# ssl_options.keyfile    = /path/to/tls/server_key.pem
# ssl_options.verify     = verify_peer
# ssl_options.fail_if_no_peer_cert  = true
#


## Number of Erlang processes that will accept connections for the TCP
## and TLS listeners.
##
# mqtt.num_acceptors.tcp = 10
# mqtt.num_acceptors.ssl = 10

## Whether or not to enable proxy protocol support.
## Once enabled, clients cannot directly connect to the broker
## anymore. They must connect through a load balancer that sends the
## proxy protocol header to the broker at connection time.
## This setting applies only to STOMP clients, other protocols
## like STOMP or AMQP have their own setting to enable proxy protocol.
## See the plugins or broker documentation for more information.
##
# mqtt.proxy_protocol = false

## Set the default user name and password used for anonymous connections (when client
## provides no credentials). Anonymous connections are highly discouraged!
##
# mqtt.default_user = guest
# mqtt.default_pass = guest

## Enable anonymous connections. If this is set to false, clients MUST provide
## credentials in order to connect. See also the mqtt.default_user/mqtt.default_pass
## keys. Anonymous connections are highly discouraged!
##
# mqtt.allow_anonymous = true

## If you have multiple vhosts, specify the one to which the
## adapter connects.
##
# mqtt.vhost = /

## Specify the exchange to which messages from MQTT clients are published.
##
# mqtt.exchange = amq.topic

## Specify TTL (time to live) to control the lifetime of non-clean sessions.
##
# mqtt.subscription_ttl = 1800000

## Set the prefetch count (governing the maximum number of unacknowledged
## messages that will be delivered).
##
# mqtt.prefetch = 10


## ----------------------------------------------------------------------------
## RabbitMQ AMQP 1.0 Support
##
## See https://github.com/rabbitmq/rabbitmq-amqp1.0/blob/stable/README.md.
## ----------------------------------------------------------------------------

# =======================================
# AMQP 1.0 section
# =======================================


## Connections that are not authenticated with SASL will connect as this
## account. See the README for more information.
##
## Please note that setting this will allow clients to connect without
## authenticating!
##
# amqp1_0.default_user = guest

## Enable protocol strict mode. See the README for more information.
##
# amqp1_0.protocol_strict_mode = false

## Logging settings.
##
## See https://rabbitmq.com/logging.html and https://github.com/erlang-lager/lager for details.
##

## Log directory, taken from the RABBITMQ_LOG_BASE env variable by default.
##
# log.dir = /var/log/rabbitmq

## Logging to file. Can be false or a filename.
## Default:
# log.file = rabbit.log

## To disable logging to a file
# log.file = false

## Log level for file logging
##
# log.file.level = info

## File rotation config. No rotation by default.
## DO NOT SET rotation date to ''. Leave the value unset if "" is the desired value
# log.file.rotation.date = $D0
# log.file.rotation.size = 0

## Logging to console (can be true or false)
##
# log.console = false

## Log level for console logging
##
# log.console.level = info

## Logging to the amq.rabbitmq.log exchange (can be true or false)
##
# log.exchange = false

## Log level to use when logging to the amq.rabbitmq.log exchange
##
# log.exchange.level = info



## ----------------------------------------------------------------------------
## RabbitMQ LDAP Plugin
##
## Related doc guide: https://rabbitmq.com/ldap.html.
##
## ----------------------------------------------------------------------------

# =======================================
# LDAP section
# =======================================

##
## Connecting to the LDAP server(s)
## ================================
##

## Specify servers to bind to. You *must* set this in order for the plugin
## to work properly.
##
# auth_ldap.servers.1 = your-server-name-goes-here

## You can define multiple servers
# auth_ldap.servers.2 = your-other-server

## Connect to the LDAP server using TLS
##
# auth_ldap.use_ssl = false

## Specify the LDAP port to connect to
##
# auth_ldap.port = 389

## LDAP connection timeout, in milliseconds or 'infinity'
##
# auth_ldap.timeout = infinity

## Or number
# auth_ldap.timeout = 500

## Enable logging of LDAP queries.
## One of
##   - false (no logging is performed)
##   - true (verbose logging of the logic used by the plugin)
##   - network (as true, but additionally logs LDAP network traffic)
##
## Defaults to false.
##
# auth_ldap.log = false

## Also can be true or network
# auth_ldap.log = true
# auth_ldap.log = network

##
## Authentication
## ==============
##

## Pattern to convert the username given through AMQP to a DN before
## binding
##
# auth_ldap.user_dn_pattern = cn=${username},ou=People,dc=example,dc=com

## Alternatively, you can convert a username to a Distinguished
## Name via an LDAP lookup after binding. See the documentation for
## full details.

## When converting a username to a dn via a lookup, set these to
## the name of the attribute that represents the user name, and the
## base DN for the lookup query.
##
# auth_ldap.dn_lookup_attribute = userPrincipalName
# auth_ldap.dn_lookup_base      = DC=gopivotal,DC=com

## Controls how to bind for authorisation queries and also to
## retrieve the details of users logging in without presenting a
## password (e.g., SASL EXTERNAL).
## One of
##  - as_user (to bind as the authenticated user - requires a password)
##  - anon    (to bind anonymously)
##  - {UserDN, Password} (to bind with a specified user name and password)
##
## Defaults to 'as_user'.
##
# auth_ldap.other_bind = as_user

## Or can be more complex:
# auth_ldap.other_bind.user_dn  = User
# auth_ldap.other_bind.password = Password

## If user_dn and password defined - other options is ignored.

# -----------------------------
# Too complex section of LDAP
# -----------------------------

##
## Authorisation
## =============
##

## The LDAP plugin can perform a variety of queries against your
## LDAP server to determine questions of authorisation.
##
## Related doc guide: https://rabbitmq.com/ldap.html#authorisation.

## Following configuration should be defined in advanced.config file
## DO NOT UNCOMMENT THESE LINES!

## Set the query to use when determining vhost access
##
## {vhost_access_query, {in_group,
##                       "ou=${vhost}-users,ou=vhosts,dc=example,dc=com"}},

## Set the query to use when determining resource (e.g., queue) access
##
## {resource_access_query, {constant, true}},

## Set queries to determine which tags a user has
##
## {tag_queries, []}
#   ]},
# -----------------------------

```

##### 1.3.3.2.1. 常用配置说明

* tcp_listeners 
    * 用于监听 AMQP连接的端口列表(无SSL). 可以包含整数 (即"监听所有接口")或者元组如 {"127.0.0.1", 5672} 用于监听一个或多个接口.
    * Default: [5672]
* num_tcp_acceptors
    * 接受TCP侦听器连接的Erlang进程数。
    * Default: 10

* handshake_timeout
    * AMQP 0-8/0-9/0-9-1 handshake (在 socket连接和SSL 握手之后）的最大时间, 毫秒为单位.
    * Default: 10000
* ssl_listeners
    * 如上所述，用于SSL连接。
    * Default: []
* num_ssl_acceptors
    * 接受SSL侦听器连接的Erlang进程数。
    * Default: 1
* ssl_options
    * SSL配置.参考SSL documentation.
    * Default: []
* ssl_handshake_timeout
    * SSL handshake超时时间,毫秒为单位.
    * Default: 5000
* vm_memory_high_watermark
    * 流程控制触发的内存阀值．相看memory-based flow control 文档.
    * Default: 0.4
* vm_memory_high_watermark_paging_ratio
    * 高水位限制的分数，当达到阀值时，队列中消息消息会转移到磁盘上以释放内存. 参考memory-based flow control 文档.
    * Default: 0.5
* disk_free_limit
    * RabbitMQ存储数据分区的可用磁盘空间限制．当可用空间值低于阀值时，流程控制将被触发.此值可根据RAM的总大小来相对设置 (如.{mem_relative, 1.0}).此值也可以设为整数(单位为bytes)或者使用数字单位(如．"50MB").默认情况下，可用磁盘空间必须超过50MB.参考 Disk Alarms 文档.
    * Default: 50000000
* log_levels
    * 控制日志的粒度.其值是日志事件类别(category)和日志级别(level)成对的列表．
    * level 可以是 'none' (不记录日志事件), 'error' (只记录错误), 'warning' (只记录错误和警告), 'info' (记录错误，警告和信息), or 'debug' (记录错误，警告，信息以及调试信息).
    * 目前定义了４种日志类别. 它们是：
        * channel -针对所有与AMQP channels相关的事件
        * connection - 针对所有与网络连接相关的事件
        * federation - 针对所有与federation相关的事件
        * mirroring -针对所有与 mirrored queues相关的事件
    * Default: [{connection, info}]
* frame_max
    * 与客户端协商的允许最大frame大小. 设置为０表示无限制，但在某些QPid客户端会引发bug. 设置较大的值可以提高吞吐量;设置一个较小的值可能会提高延迟.
    * Default: 131072
* channel_max
    * 与客户端协商的允许最大chanel大小. 设置为０表示无限制．该数值越大，则broker使用的内存就越高．
    * Default: 0
* channel_operation_timeout
    * Channel 操作超时时间(毫秒为单位） (内部使用，因为消息协议的区别和限制，不暴露给客户端).
    * Default: 5000
* heartbeat
    * 表示心跳延迟(单位为秒) ，服务器将在connection.tune frame中发送.如果设置为 0, 心跳将被禁用. 客户端可以不用遵循服务器的建议, 查看 AMQP reference 来了解详情. 禁用心跳可以在有大量连接的场景中提高性能，但可能会造成关闭了非活动连接的网络设备上的连接落下．
    * Default: 60 (3.5.5之前的版本是580)
* default_vhost
    * 当RabbitMQ从头开始创建数据库时创建的虚拟主机. amq.rabbitmq.log交换器会存在于这个虚拟主机中.
    * Default: <<"/">>
* default_user
    * RabbitMQ从头开始创建数据库时，创建的用户名.
    * Default: <<"guest">>
* default_pass
    * 默认用户的密码.
    * Default: <<"guest">>
* default_user_tags
    * 默认用户的Tags.
    * Default: [administrator]
* default_permissions
    * 创建用户时分配给它的默认Permissions .
    * Default: [<<".*">>, <<".*">>, <<".*">>]
* loopback_users
    * 只能通过环回接口(即localhost)连接broker的用户列表
    * 如果你希望默认的guest用户能远程连接,你必须将其修改为[].
    * Default: [<<"guest">>]
* cluster_nodes
    * 当节点第一次启动的时候，设置此选项会导致集群动作自动发生. 元组的第一个元素是其它节点想与其建立集群的节点. 第二个元素是节点的类型，要么是disc,要么是ram
    * Default: {[], disc}
* server_properties
    * 连接时向客户端声明的键值对列表
    * Default: []
* collect_statistics
    * 统计收集模式。主要与管理插件相关。选项：
        * none (不发出统计事件)
        * coarse (发出每个队列 /每个通道 /每个连接的统计事件)
        * fine (也发出每个消息统计事件)
        * 你自已可不用修改此选项.
    * Default: none
* collect_statistics_interval
    * 统计收集时间间隔(毫秒为单位)． 主要针对于 management plugin.
    * Default: 5000
* auth_mechanisms
    * 提供给客户端的SASL authentication mechanisms.
    * Default: ['PLAIN', 'AMQPLAIN']
* auth_backends
    * 用于 authentication / authorisation backends 的列表. 此列表可包含模块的名称(在模块相同的情况下，将同时用于认证来授权)或像{ModN, ModZ}这样的元组，在这里ModN将用于认证，ModZ将用于授权.
    * 在２元组的情况中, ModZ可由列表代替,列表中的所有元素必须通过每个授权的确认，如{ModN, [ModZ1, ModZ2]}.这就允许授权插件进行组合提供额外的安全约束.
    * 除rabbit_auth_backend_internal外，其它数据库可以通常 plugins来使用.
    * Default: [rabbit_auth_backend_internal]
* reverse_dns_lookups
    * 设置为true,可让客户端在连接时让RabbitMQ 执行一个反向DNS查找, 然后通过 rabbitmqctl 和 管理插件来展现信息.
    * Default: false
* delegate_count
    * 内部集群通信中，委派进程的数目. 在一个有非常多核的机器(集群的一部分)上,你可以增加此值.
    * Default: 16
* trace_vhosts
    * tracer内部使用.你不应该修改.
    * Default: []
* tcp_listen_options
    * 默认socket选项. 你可能不想修改这个选项.
    * Default:
    * [{backlog,       128},          {nodelay,       true},          {exit_on_close, false}]
* hipe_compile
    * 将此选项设置为true,将会使用HiPE预编译部分RabbitMQ,Erlang的即时编译器.
    * 这可以增加服务器吞吐量，但会增加服务器的启动时间．
    * 你可以看到花费几分钟延迟启动的成本，就可以带来20-50% 更好性能.这些数字与高度依赖于工作负载和硬件．
    * HiPE 支持可能没有编译进你的Erlang安装中.如果没有的话，启用这个选项,并启动RabbitMQ时，会看到警告消息． 例如, Debian / Ubuntu 用户需要安装erlang-base-hipe 包.
    * HiPE并非在所有平台上都可用,尤其是Windows.
    * 在 Erlang/OTP 1７.５版本之前，HiPE有明显的问题 . 对于HiPE,使用最新的OTP版本是高度推荐的．
    * Default: false
* cluster_partition_handling
    * 如何处理网络分区.可用模式有:
        * ignore
        * pause_minority
        * {pause_if_all_down, [nodes], ignore | autoheal}where [nodes] is a list of node names(ex: ['rabbit@node1', 'rabbit@node2'])
        * autoheal
    * 参考documentation on partitions 来了解更多信息
    * Default: ignore
* cluster_keepalive_interval
    * 节点向其它节点发送存活消息和频率(毫秒). 注意，这与 net_ticktime是不同的;丢失存活消息不会引起节点掉线
    * Default: 10000

* queue_index_embed_msgs_below
    * 消息大小在此之下的会直接内嵌在队列索引中. 在修改此值时，建议你先阅读　 persister tuning 文档.
    * Default: 4096
* msg_store_index_module
    * 队列索引的实现模块. 在修改此值时，建议你先阅读　 persister tuning 文档.
    * Default: rabbit_msg_store_ets_index
* backing_queue_module
    * 队列内容的实现模块. 你可能不想修改此值．
    * Default: rabbit_variable_queue
* msg_store_file_size_limit
    * Tunable value for the persister. 你几乎肯定不应该改变此值。
    * Default: 16777216
* mnesia_table_loading_timeout
    * 在集群中等待使用Mnesia表可用的超时时间。
    * Default: 30000
* queue_index_max_ journal_entries
    * Tunable value for the persister. 你几乎肯定不应该改变此值。
    * Default: 65536
* queue_master_locator
    * Queue master 位置策略.可用策略有:
        * <<"min-masters">>
        * <<"client-local">>
        * <<"random">>
    * 查看documentation on queue master location 来了解更多信息．
    * Default: <<"client-local">>


#### 1.3.3.3. 参数和策略
<a href="#menu" style="float:right">目录</a>



## 1.4. 客户端开发
<a href="#menu" style="float:right">目录</a>


### 1.4.1. 依赖

```xml
 <dependency>
    <groupId>com.rabbitmq</groupId>
    <artifactId>amqp-client</artifactId>
    <version>5.5.1</version>
</dependency>
```

### 1.4.2. 连接RabbitMQ
<a href="#menu" style="float:right">目录</a>

```java
//获取工厂类
ConnectionFactory factory = new ConnectionFactory();
//设置连接信息
factory.setUsername("lgj");
factory.setPassword("lgj");
factory.setHost(HOST);
factory.setPort(PORT);
factory.setVirtualHost("/blog");
//获取连接
Connection connection = factory.newConnection();  
//通过连接获取channel
Channel channel = connection.createChannel();

```

Connection 可以 用来创建多个 Channel 实例，但是 Channel 实例不能在线程问共享，应用程序应该为每一个线程开辟一个 Channel 。某些情况下 Channel 的操作可以并发运行，但是在其他情况下会导致在网络上出现错误的通信帧交错，同时也会影响友送方确认( publisherconfrrm)机制的运行，所以多线程问共享 Channel 实例是非线程安全的 。




### 1.4.3. 使用交换器和队列
<a href="#menu" style="float:right">目录</a>

**创建交换器**
```java
//创建一个交换器
AMQP.Exchange.DeclareOk declareOk = channel.exchangeDeclare(EXCHANGE_NAME,ExchangeType.DIRECT_TYPE,true,false,null);
//创建一个队列
AMQP.Queue.DeclareOk queueOk =  channel.queueDeclare(QUEUE_NAME,true,false,false,null);
//通过绑定键将队列和交换器绑定
channel.queueBind(QUEUE_NAME,EXCHANGE_NAME,ROUTING_KEY);
```

```JAVA
 public DeclareOk exchangeDeclare(String exchange, BuiltinExchangeType type, boolean durable, boolean autoDelete, boolean internal, Map<String, Object> arguments) throws IOException {
        return this.exchangeDeclare(exchange, type.getType(), durable, autoDelete, internal, arguments);
    }
```
* exchange : 交换器的名称。
* type : 交换器的类型，常见的如 fanout、 direct 、 topic
* durable: 设置是否持久化 。 durable 设置为 true 表示持久化， 反之是非持久化 。持久化可以将交换器存盘，在服务器重启 的时候不会丢失相关信息。
* autoDelete : 设置是否自动删除。 autoDelete 设置为 true 则表示自动删除。自动删除的前提是至少有一个队列或者交换器与这个交换器绑定 ， 之后所有与这个交换器绑定的队列或者交器都与此解绑。注意不能错误地把这个参数理解为 : "当与此交换器连接的客户端都断开时 ， RabbitMQ 会自动删除本交换器 "。
* internal : 设置是否是内置的。如果设置为 true ，则表示是内置的交换器，客户端程序无法直接发送消息到这个交换器中，只能通过交换器路由到交换器这种方式。
* argument : 其他一些结构化参数，比如 alternate - exchange

上面的是同步创建,下面是异步创建交换器.
一般不建议使用,有可能客户端调用完之后,立即使用这个交换器,但是服务端还未创建完成,这时会抛出异常.
```JAVA
public void exchangeDeclareNoWait(String exchange, String type, boolean durable, boolean autoDelete, boolean internal, Map<String, Object> arguments) throws IOException {
    RecordedExchange x = (new RecordedExchange(this, exchange)).type(type).durable(durable).autoDelete(autoDelete).arguments(arguments);
    this.recordExchange(exchange, x);
    this.delegate.exchangeDeclareNoWait(exchange, type, durable, autoDelete, internal, arguments);
}
```

**创建队列**

```java
public com.rabbitmq.client.AMQP.Queue.DeclareOk queueDeclare(String queue, boolean durable, boolean exclusive, boolean autoDelete, Map<String, Object> arguments) throws IOException {
    com.rabbitmq.client.AMQP.Queue.DeclareOk ok = this.delegate.queueDeclare(queue, durable, exclusive, autoDelete, arguments);
    this.recordQueue(ok, queue, durable, exclusive, autoDelete, arguments);
    return ok;
}

public void queueDeclareNoWait(String queue, boolean durable, boolean exclusive, boolean autoDelete, Map<String, Object> arguments) throws IOException {
    RecordedQueue meta = (new RecordedQueue(this, queue)).durable(durable).exclusive(exclusive).autoDelete(autoDelete).arguments(arguments);
    this.delegate.queueDeclareNoWait(queue, durable, exclusive, autoDelete, arguments);
    this.recordQueue(queue, meta);
}

```
* queue : 队列的名称。
* durable: 设置是否持久化。为 true 则设置队列为持久化。持久化的队列会存盘，在服务器重启的时候可以保证不丢失相关信息。
* exclusive : 设置是否排他。为 true 则设置队列为排他的。如果一个队列被声明为排他队列，该队列仅对首次声明它的连接可见，并在连接断开时自动删除。这里需要注意三点:排他队列是基于连接( Connection) 可见的，同一个连接的不同信道 (Channel)是可以同时访问同一连接创建的排他队列; "首次"是指如果一个连接己经声明了 一个排他队列，其他连接是不允许建立同名的排他队列的，这个与普通队列不同:即使该队列是持久化的，一旦连接关闭或者客户端退出，该排他队列都会被自动删除，这种队列适用于一个客户端同时发送和读取消息的应用场景。
* autoDelete: 设置是否自动删除。为 true 则设置队列为自动删除。自动删除的前提是:至少有一个消费者连接到这个队列，之后所有与这个队列连接的消费者都断开时，才会自动删除。不能把这个参数错误地理解为: "当连接到此队列的所有客户端断开时，这个队列自动删除"，因为生产者客户端创建这个队列，或者没有消费者客户端与这个队列连接时，都不会自动删除这个队列。
* argurnents: 设置队列的其他一些参数，如 x-rnessage-ttl 、 x-expires ,x -rnax-length 、 x-rnax-length-bytes 、 x-dead-letter-exchange 、x-deadletter-routing-key, x-rnax-priority 等。

生产者和消费者都能够使用 queueDeclare 来声明一个队列，但是如果消费者在同一个信道上订阅了另一个队列，就无法再声明队列了。必须先取消订阅，然后将信道直为"传输"模式，之后才能声明队列。


**queueBind 方法详解**

将队列和交换器绑定 的方法
```java
public com.rabbitmq.client.AMQP.Queue.BindOk queueBind(String queue, String exchange, String routingKey, Map<String, Object> arguments) throws IOException {
    com.rabbitmq.client.AMQP.Queue.BindOk ok = this.delegate.queueBind(queue, exchange, routingKey, arguments);
    this.recordQueueBinding(queue, exchange, routingKey, arguments);
    return ok;
}
```

* queue: 队列名称:
* exchange: 交换器的名称:
* routingKey: 用来绑定队列和交换器的路由键;
* argument: 定义绑定的一些参数。

**exchangeBind 方法详解**

我们不仅可以将交换器与队列绑定，也可以将交换器与交换器绑定，后者和前者的用法如出一辙

```java
 public BindOk exchangeBind(String destination, String source, String routingKey, Map<String, Object> arguments) throws IOException {
    BindOk ok = this.delegate.exchangeBind(destination, source, routingKey, arguments);
    this.recordExchangeBinding(destination, source, routingKey, arguments);
    return ok;
}
```

**何时创建**

RabbitMQ 的消息存储在队列中，交换器的使用 并不真正耗费服务器的性能，而队列会。如果要衡量 RabbitMQ当前的QPS只需看队列的即可。在实际业务应用中，需要对所创建的队列的流量、内存占用及网卡占用有一个清晰的认知，预估其平均值和峰值，以便在固定硬件资源的情况下能够进行合理有效的分配。

按照 RabbitMQ 官方建议，生产者和消费者都应该尝试创建(这里指声明操作)队列。这是一个很好的建议，但不适用于所有的情况。如果业务本身在架构设计之初己经充分地预估了队列的使用情况，完全可以在业务程序上线之前在服务器上创建好(比如通过页面管理、 RabbitMQ命令或者更好的是从配置中心下发)，这样业务程序也可以免去声明的过程，直接使用即可。

预先创建好资源还有一个好处是，可以确保交换器和队列之间正确地绑定匹配。很多时候，由于人为因素、代码缺陷等，发送消息的交换器并没有绑定任何队列，那么消息将会丢失:或者交换器绑定了某个队列，但是发送消息时的路由键无法与现存的队列匹配，那么消息也会丢失。当然可以配合 mandatory 参数或者备份交换器(详细可参考 4.1节〉来提高程序的健壮性。

与此同时，预估好队列的使用情况非常重要，如果在后期运行过程中超过预定的阔值，可以根据实际情况对当前集群进行扩容或者将相应的队列迁移到其他集群。迁移的过程也可以对业务程序完全透明。此种方法也更有利于开发和运维分工，便于相应资源的管理。

如果集群资源充足，而即将使用的队列所占用的资源又在可控的范围之内，为了增加业务程序的灵活性，也完全可以在业务程序中声明队列。至于是使用预先分配创建资源的静态方式还是动态的创建方式，需要从业务逻辑本身、公司运维体系和公司硬件资源等方面考虑。

### 1.4.4. 发送消息
<a href="#menu" style="float:right">目录</a>

```java

//普通方式
channe1.basicPub1ish(exchangeName , rout 工 ngKey ， mandatory,MessageProperties.PERSISTENT TEXT PLAIN,messageBodyBytes);

//BasicPropertie构建属性
channe1.basicPub1ish(exchangeName , routingKey,
    new AMQP.BasicProperties.Builder()
    .contentType("text/p1ain")
    .deliveryMode(2)
    .priority (1)
    .userld( "hidden " )
    .build()) ,
    messageBodyBytes) ;

//带有 headers 的消息
Map<String, Object> headers = new HashMap<String, Object>() ;
headers.put( "loca1tion" , "here " );
headers . put( " time " , " today" );
channel.basicPublish(exchangeName ， routingKey ，
    new AMQP.BasicProperties.Builder()
    .headers(headers)
    .build()) ,
    messageBodyBytes) ;

```

```java
public void basicPublish(String exchange, String routingKey, boolean mandatory, boolean immediate, BasicProperties props, byte[] body) throws IOException {
    this.delegate.basicPublish(exchange, routingKey, mandatory, immediate, props, body);
}
```

* exchange: 交换器的名称，指明消息需要发送到哪个交换器中 。 如果设置为空字符串，则消息会被发送到 RabbitMQ 默认的交换器中。
* routingKey : 路由键，交换器根据路由键将消息存储到相应的队列之中 。
* props : 消息的基本属性集，其包含 14 个属性成员，分别有 contentType 、contentencoding 、headers ( Map<String ， Object>)、deliveryMode、priority 、correlationld 、 replyTo 、 expiration 、 messageld、 timestamp 、type 、 userld 、appld 、 clusterId。其中常用的几种都在上面的示例中进行了演示 。
* byte[] body : 消息体 ( pay1oad ) ，真正需要发送的消息 。
* mandatory 和工mmediate 的详细内容


### 1.4.5. 消费消息
<a href="#menu" style="float:right">目录</a>

RabbitMQ 的消费模式分两种 : 推 ( Push )模式和拉 ( Pull )模式 。 推模式采用 Basic.Consume进行消费，而拉模式则是调用 Basic.Get 进行消费。

推模式由RabbitMQ向消费者推送数据.
而拉模式由消费者主动向RabbitMQ获取数据.

#### 1.4.5.1. 推模式(push)
<a href="#menu" style="float:right">目录</a>

```JAVA
public void  recdata() throws Exception{

    final  Channel  channel = connection.createChannel();
    //
    channel.basicQos(64);
    Consumer consumer  = new DefaultConsumer(channel) {
        @Override
        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
            // System.out.println("接收到的数据：" + new String(body));

            User obj = serialize.deserialize(body,User.class);

            System.out.println("接收到的数据：" +obj.toString());

            channel.basicAck(envelope.getDeliveryTag(),false);
        }

    };
    channel.basicConsume(QUEUE_NAME,consumer);
}
```
```java

public String basicConsume(String queue, boolean autoAck, String consumerTag, boolean noLocal, boolean exclusive, Map<String, Object> arguments, DeliverCallback deliverCallback, CancelCallback cancelCallback, ConsumerShutdownSignalCallback shutdownSignalCallback) throws IOException {
        return this.basicConsume(queue, autoAck, consumerTag, noLocal, exclusive, arguments, this.consumerFromDeliverCancelShutdownCallbacks(deliverCallback, cancelCallback, shutdownSignalCallback));
    }
```
* queue : 队列的名称:
* autoAck : 设置是否自动确认。建议设成 false ，即不自动确认:
* consumerTag: 消费者标签，用来区分多个消费者:
* noLocal : 设置为 true 则表示不能将同一个 Connectio口中生产者发送的消息传送给这个 Connection 中的消费者:
* exclusive : 设置是否排他 :
* arguments : 设置消费者的其他参数:
* callback : 设置消费者的回调函数。可以在创建consumer时重写DefaultConsumer相关方法进行处理
    * deliverCallback
    * cancelCallback
    * shutdownSignalCallback

每个 Channel 都拥有自己独立的线程。最常用的做法是一个 Channel 对应一个消费者，也就是意味着消费者彼此之间没有任何关联。当然也可以在一个 Channel 中维持多个消费者，但是要注意一个问题，如果 Channel 中的一个消费者一直在运行，那么其他消费者的 callback会被"耽搁"。

#### 1.4.5.2. 拉模式(pull)
<a href="#menu" style="float:right">目录</a>

```java
public void pushMode()throws Exception{
    final  Channel  channel = connection.createChannel();
    GetResponse response = channel.basicGet(QUEUE_NAME, false) ;
    System.out.println(new String(response.getBody()));
    channel .basicAck(response.getEnvelope().getDeliveryTag() , false);
}
```
通过 channel.basicGet方法可以单条地获取消息，其返回值是GetRespone.Channel 类的 basicGet 方法没有其他重载方法，只有:GetResponse basicGet(String queue ,boolean autoAck) throws IOException;
其中 queue 代表队列的名称，如果设置 autoAck 为 false ， 那么同样需要调用channel.basicAck 来确认消息己被成功接收。

Basic.Consume 将信道 (Channel) 设置为接收模式，直到取消队列的订阅为止。在接收模式期间， RabbitMQ 会不断地推送消息给消费者，当然推送消息的个数还是会受到 Basic.Qos的限制.如果只想从队列获得单条消息而不是持续订阅，建议还是使用 Basic.Get 进行消费.但是不能将 Basic.Get 放在一个循环里来代替 Basic.Consume ，这样做会严重影响 RabbitMQ的性能.如果要实现高吞吐量，消费者理应使用 Basic.Consume 方法。

Spring 的amqp包中使用的是推模式(push).



### 1.4.6. 消息端的确认和拒绝
<a href="#menu" style="float:right">目录</a>

为了保证消息从队列可靠地达到消费者， RabbitMQ 提供了消息确认机制( messageacknowledgement) 。 消费者在订阅队列时，可以指定 autoAck 参数，当 autoAck 等于 false时， RabbitMQ 会等待消费者显式地回复确认信号后才从内存(或者磁盘)中移去消息(实质上是先打上删除标记，之后再删除) 。当 autoAck 等于 true 时， RabbitMQ 会自动把发送出去的消息置为确认，然后从内存(或者磁盘)中删除，而不管消费者是否真正地消费到了这些消息 。

采用消息确认机制后，只要设置 autoAck 参数为 false，消费者就有足够的时间处理消息(任务) ，不用担心处理消息过程中消费者进程挂掉后消息丢失的问题 ， 因为 RabbitMQ 会一直等待持有消息直到消费者显式调用 Basic.Ack 命令为止 。

```java
public void basicAck(long deliveryTag, boolean multiple) throws IOException {
    this.delegate.basicAck(deliveryTag, multiple);
}
```
当autoAck参数置为false，对于RabbitMQ 服务端而言，队列中的消息分成了两个部分 :一部分是等待投递给消费者的消息:一部分是己经投递给消费者，但是还没有收到消费者确认信号的消息。如果 RabbitMQ 一直没有收到消费者的确认信号，并且消费此消息的消费者己经断开连接，则 RabbitMQ 会安排该消息重新进入队列，等待投递给下一个消费者，当然也有可能还是原来的那个消费者。

RabbitMQ 不会为未确认的消息设置过期时间，它判断此消息是否需要重新投递给消费者的唯一依据是消费该消息的消费者连接是否己经断开，这么设计的原因是 RabbitMQ 允许消费者消费一条消息的时间可以很久很久。


可以通过basicReject来拒绝消息.服务器收到该请求之后,会将消息重新投递.
```java
 public void basicReject(long deliveryTag, boolean requeue) throws IOException {
    this.delegate.basicReject(deliveryTag, requeue);
}

```
其中 deliveryTag 可以看作消息的编号 ，它是一个 64 位的长整型值，最大值是9223372036854775807 。如果 requeue 参数设置为 true ，则 RabbitMQ 会重新将这条消息存入队列，以便可以发送给下一个订阅的消费者;如果 requeue 参数设置为 false，则 RabbitMQ立即会把消息从队列中移除，而不会把它发送给新的消费者。

Basic.Reject 命令一次只能拒绝一条消息 ，如果想要批量拒绝消息，则可以使用Basic.Nack 这个命令 。 消费者客户端可以调用 channel.basicNack 方法来实现，方法定义如下:

```java
void basicNack(long deliveryTag, boolean multiple, boolean requeue) throws IOException;
```
其中 deliveryTag 和 requeue的含义可以参考basicReject 方法。multiple参数设置为false则表示拒绝编号为deliveryT坷的这一条消息，这时候basicNack和basicReject 方法一样; multiple 参数设置为 true 则表示拒绝 deliveryTag 编号之前所有未被当前消费者确认的消息。

对于 requeue ， AMQP 中还有一个命令 Basic.Recover 具备可重入队列的特性 。其对应的客户端方法为:
(1) Basic.RecoverOk basicRecover() throws IOException;
(2) Basic.RecoverOk basicRecover(boolean requeue) throws IOException;
这个 channel.basicRecover 方法用来请求 RabbitMQ 重新发送还未被确认的消息 。 如果 requeue 参数设置为 true ，则未被确认的消息会被重新加入到队列中，这样对于同一条消息来说，可能会被分配给与之前不同的消费者。如果 requeue 参数设置为 false，那么同一条消息会被分配给与之前相同的消费者。默认情况下，如果不设置 requeue 这个参数，相当于channel.basicRecover(true) ，即 requeue 默认为 true



### 1.4.7. 关闭连接
<a href="#menu" style="float:right">目录</a>

在应用程序使用完之后，需要关闭连接，释放资源:
channel.close();
conn.close() ;
显式地关闭 Channel 是个好习惯，但这不是必须的，在 Conection 关闭的时候，Channel 也会自动关闭。

AMQP 协议中的 C on口 ection 和 Channel 采用 同样的方式来管理网络失败、内部错误和显式地关闭连接。 Connection 和 Channel 所具备的生命周期如下所述。
* Open : 开启状态，代表当前对象可以使用。
* Closi 口 g : 正在关闭状态。当前对象被显式地通知调用关闭方法( shutdown) ，这样就产生了一个关闭请求让其内部对象进行相应的操作， 并等待这些关闭操作的完成。
* Closed : 已经关闭状态。当前对象己经接收到所有的内部对象己完成关闭动作的通知，并且其也关闭了自身。

Connection 和 Channel 最终都是会成为 Closed 的状态，不论是程序正常调用的关闭方法，或者是客户端的异常，再或者是发生了网络异常。
在 Connection 和 Channel 中，与关闭相关的方法有 addShutdownListener(ShutdownListener listener) 和 removeShutdownListener (ShutdownListnerlistener) 。当 Connection 或者 Channel 的状 态转变为 Closed 的时候会调用ShutdownListener 。而且如果将一个 ShutdownListener 注册到一个己经处于 Closed状态的对象(这里特指 Connection 和 Channel 对象)时，会立刻调用 ShutdownListener 。

getCloseReason 方法可以让你知道对象关闭的原因 ; isOpen 方法检测对象当前是否处于开启状态; close(int closeCode , String closeMessage ) 方法显式地通知当前对象执行关闭操作 。

```java
channel.addShutdownListener(new ShutdownListener() {
    @Override
    public void shutdownCompleted(ShutdownSignalException e) {


    }
});
public class ShutdownSignalException extends RuntimeException implements SensibleClone<ShutdownSignalException> {
    private static final long serialVersionUID = 1L;

    //isHardError 方法可以知道是 Collectio丑的还是 Channel 的错误;
    private final boolean _hardError;
    private final boolean _initiatedByApplication;
    //异常相关信息
    private final Method _reason;
    private final Object _ref;
}
```


## 1.5. 进阶
<a href="#menu" style="float:right">目录</a>

### 1.5.1. 参数mandatory 和 immediate介绍
<a href="#menu" style="float:right">目录</a>

mandatory 和 immediate 是 channel . basicPublish 方法中的两个参数，它们都有当消息传递过程中不可达目的地时将消息返回给生产者的功能。 RabbitMQ 提供的备份交换器(Altemate Exchange) 可以将未能被交换器路由的消息(没有绑定队列或者没有匹配的绑定〉存储起来，而不用返回给客户端。

**mandatory**
当 mandatory 参数设为 true 时，交换器无法根据自身的类型和路由键找到一个**符合条件的队列**，那么 RabbitMQ 会调用 Basic.Return 命令将消息返回给生产者 。当 mandatory 参数设置为 false 时，出现上述情形，则消息直接被丢弃 。

以通过调用channel.addReturnListener 来添加 ReturnListener 监昕器实现获取到没有被正确路由到合适队列的消息.

```java
channel.addReturnListener(new ReturnListener() {
    public void handleReturn(int replyCode, String replyText,
                                String exchange, String routingKey,
                                AMQP.BasicProperties basicProperties,
                                byte[] body) throws IOException {
        String message = new String(body);
        System.out.println("Basic.Return 返回的结果是: " + message);
    }
});
```
**immediate**

当 imrnediate 参数设为 true 时，如果交换器在将消息路由到队列时发现**队列上并不存在任何消费者**，那么这条消息将不会存入队列中。当与路由键匹配的所有队列都没有消费者时 ，该消息会通过 Basic.Return 返回至生产者。

概括来说 ， ma口datory 参数告诉服务器至少将该消息路由到一个队列 中， 否则将消息返回给生产者。 imrnediate 参数告诉服务器 ， 如果该消息关联的队列上有消费者， 则 立刻投递:
如果所有匹配的队列上都没有消费者，则直接将消息返还给生产者 ， 不用将消息存入队列而等待消费者了。

RabbitMQ 3.0版本开始去掉了对imrnediate参数的支持，对此 RabbitMQ 官方解释是 :imrnediate 参数会影响镜像队列的性能，增加了代码复杂性，建议采用 TTL 和 DLX 的方法替代

### 1.5.2. 备份交换器
<a href="#menu" style="float:right">目录</a>

备份交换器，英文名称为 Altemate Exchange，简称庙，或者更直白地称之为"备胎交换器"。
生产者在发送消息的时候如果不设置 mandatory 参数 ， 那么消息在未被路由的情况下将会丢失 :如果设置了 mandatory 参数，那么需要添加 ReturnListener 的编程逻辑，生产者的代码将
变得复杂。如果既不想复杂化生产者的编程逻辑，又不想消息丢失，那么可以使用备份交换器，这样可以将未被路由的消息存储在 RabbitMQ 中，再在需要的时候去处理这些消息。

可以通过在声明交换器(调用 channel.exchangeDeclare 方法)的时候添加alternate-exchange 参数来实现
```java
Map<String, Object> args = new HashMap<String, Object>();
args.put("a1ternate-exchange" , "myAe");
channe1.exchangeDec1are( "norma1Exchange" , "direct" , true , fa1se , args);
channe1 . exchangeDec1are( "myAe " , "fanout" , true, fa1se , nu11) ;
channe1 .queueDec1are( "norma1Queue " , true , fa1se , fa1se , nu11);
channe1 .queueB 工 nd( " norma1Queue " ， " norma1Exchange" , " norma1Key");
channe1 .queueDec1are( "unroutedQueue " , true , fa1se , fa1se , nu11);
```
上面的代码中声明了两个交换器 nonnallixchange 和 myAe，分别绑定了 nonnalQueue 和umoutedQueue 这两个队列

如果此时发送一条消息到 nonnalExchange 上，当路由键等于" nonnalKey" 的时候，消息能正确路由到 nonnalQueue 这个队列中。如果路由键设为其他值，比如 "errorKey飞即消息不能被正确地路由到与 nonnallixchange 绑定的任何队列上，此时就会发送给 myAe，进而发送到 unroutedQueue 这个队列 

备份交换器其实和普通的交换器没有太大的区别，为了方便使用，建议设置为 fanout 类型，如若读者想设置为 direct 或者 topic 的类型也没有什么不妥。需要注意的是，消息被重新发送到备份交换器时的路由键和从生产者发出的路由键是一样的。

考虑这样一种情况，如果备份交换器的类型是 direct ， 并且有一个与其绑定的队列，假设绑定的路由键是 keyl ， 当某条携带路由键为 key2 的消息被转发到这个备份交换器的时候，备份交换器没有匹配到合适的队列，则消息丢失。如果消息携带的路由键为 keyl，则可以存储到队列中。

对于备份交换器，总结了以下几种特殊情况:
* 令如果设置的备份交换器不存在，客户端和 RabbitMQ 服务端都不会有异常出现，此时消息会丢失。
* 令如果备份交换器没有绑定任何队列，客户端和 RabbitMQ 服务端都不会有异常出现，此时消息会丢失。
* 令如果备份交换器没有任何匹配的队列，客户端和 RabbitMQ 服务端都不会有异常出现，此时消息会丢失。
* 如果备份交换器和 mandatory 参数一起使用，那么 mandatory 参数无效。



### 1.5.3. 过期时间TTL
<a href="#menu" style="float:right">目录</a>

RabbitMQ 可以对消息和队列设置 TTL 。

#### 1.5.3.1. 设置消息的过期时间
<a href="#menu" style="float:right">目录</a>

* 目前有两种方法可以设置消息的 TTL
    * 第一种方法是通过**队列属性**设置，队列中所有消息都有相同的过期时间。
    * 第二种方法是对**消息本身**进行单独设置，每条消息的 TTL 可以不同。
    * 如果两种方法一起使用，则消息的 TTL 以两者之间较小的那个数值为准。
    * 消息在队列中的生存时间一旦超过设置 的 TTL 值时，就会变成"死信" (Dead Message) ，消费者将无法再收到该消息

通过队列属性设置消息 TTL 的方法是在 channel.queueDeclare 方法中加入x-message -ttl 参数实现的，这个参数的单位是毫秒。

```java
Map<String, Object> argss = new HashMap<String , Object>();
argss.put("x-message-ttl " , 6000);
channel.queueDeclare(queueName , durable , exclusive , autoDelete , argss) ;
```
如果不设置 TTL.则表示此消息不会过期 ;如果将 TTL 设置为 0，则表示除非此时可以直接将消息投递到消费者，否则该消息会被立即丢弃

针对每条消息设置 TTL 的方法是在 channel.basicPublish 方法中加入 expiration的属性参数，单位为毫秒。

```java
AMQP.BasicProperties.Builder builder = new AMQP.BasicProperties.Builder();
builder.deliveryMode(2); / / 持久化消息
builder.expiration("60000" );/ / 设置 TTL=60000ms
AMQP.BasicProperties properties = builder.build() ;
channel.basicPublish(exchangeName, routingKey, mandatory, properties ,"ttlTestMessage".getBytes());

//或者
AMQP.BasicProperties properties = new AMQP.BasicProperties() ;
Properties.setDeliveryMode(2);
properties.setExpiration("60000");
channel.basicPublish (exchangeName,routingKey,mandatory，properties，"ttlTestMessage".getBytes());
```
对于第一种设置队列 TTL 属性的方法，一旦消息过期，就会从队列中抹去，而在第二种方法中，即使消息过期，也不会马上从队列中抹去，因为每条消息是否过期是在即将投递到消费者之前判定的。
因为第一种方法里，队列中己过期的消息肯定在队列头部， RabbitMQ 只要定期从队头开始扫描是否有过期的消息即可。而第二种方法里，每条消息的过期时间不同，如果要删除所有过期消息势必要扫描整个队列，所以不如等到此消息即将被消费时再判定是否过期 ， 如果过期再进行删除即可。

#### 1.5.3.2. 设置队列的过期时间
<a href="#menu" style="float:right">目录</a>

通过 channel.queueDeclare 方法中的 x-expires 参数可以控制队列被自动删除前处于未使用状态的时间。未使用的意思是队列上没有任何的消费者，队列也没有被重新声明，并且在过期时间段内也未调用过 Basic.Get 命令。

```java
Map<String, Object> args = new HashMap<String, Object>{) ;
args.put( "x-expires" , 1800000);
channel.queueDeclare("myqueue " , false , false , false , args) ;

```

RabbitMQ 会确保在过期时间到达后将队列删除，但是不保障删除的动作有多及时 。在RabbitMQ 重启后，持久化的队列的过期时间会被重新计算。
用于表示过期时间的 x-expires 参数以毫秒为单位 ， 井且服从和 x-message-ttl 一样的约束条件，不过不能设置为 0。比如该参数设置为 1 000 ，则表示该队列如果在 1 秒钟之内未使用则会被删除。


### 1.5.4. 死信队列
<a href="#menu" style="float:right">目录</a>


DLX ，全称为 Dead-Letter-Exchange ，可以称之为死信交换器，也有人称之为死信邮箱。当消息在一个队列中变成死信 (dead message) 之后，它能被重新被发送到另一个交换器中，这个
交换器就是 DLX，绑定 DLX 的队列就称之为死信队列。

消息变成死信一般是由于以下几种情况:
* 消息被拒绝 (Basic.Reject/Basic.Nack) ，井且设置 requeue 参数为 false;
* 消息过期;
* 队列达到最大长度。
DLX也是一个正常的交换器，和一般的交换器没有区别，它能在任何的队列上被指定，实际上就是设置某个队列的属性。当这个队列中存在死信时，RabbitMQ 就会自动地将这个消息重新发布到设置的 DLX上去 ，进而被路由到另一个队列，即死信队列。可以监听这个队列中的消息、以进行相应的处理，这个特性与将消息的 TTL 设置为 0 配合使用可以弥补 imrnediate 参数的功能。

通过在 channel.queueDeclare 方法中设置 x-dead-letter-exchange 参数来为这个队列添加 DLX (代码清单 4-7 中的 dl x exchange):

```java
channel.exchangeDeclare("dlx_exchange " , "direct "); //创建 DLX: dlx_exchange
Map<String, Object> args = new HashMap<String, Object>();
args.put("x-dead-letter-exchange" , "dlx_exchange");
//为队列 myqueue 添加 DLX
channel.queueDeclare("myqueue", false , false , false , args);
```

也可以为这个 DLX 指定路由键，如果没有特殊指定，则使用原队列的路由键:
```java
args.put("x-dead-letter-routing-key" , "dlx-routing-key");
```

```java
channel.exchangeDeclare("exchange.dlx" , "direct" , true);
channel.exchangeDeclare( "exchange.normal" , "fanout" , true);
Map<String , Object> args = new HashMap<String, Object>( );
args.put("x-message-ttl " , 10000);
args.put( "x-dead-letter-exchange " , "exchang.dlx");
args.put( "x-dead-letter-routing-key", "routingkey");
channe1.queueDec1are( "queue.norma1" , true , fa1se , fa1se , args);
channe1.queueBind( "queue.normal" , "exchange .normal" , "");
channe1.queueDec1are( "queue.d1x" , true , false , false , null) ;
channel.queueBind( "queue.dlx" , "exchange.dlx" , Wroutingkey");
channel.basicPublish( "exchange.normal" , "rk" ,MessageProperties.PERSISTENT_TEXT_PLAIN, "dlx".getBytes()) ;


```
这里创建了两个交换器 exchange.normal 和 exchange.dlx ， 分别绑定两个队列 queue.normal和 queue.dlx 。

生产者首先发送一条携带路由键为 "rk" 的消息，然后经过交换器exchange .normal 顺利地存储到队列 queue.normal 中 。由于队列 queue.normal 设置了过期时间为10s ， 在这 10s 内没有消费者消费这条消息，那么判定这条消息为过期。由于设置了 DLX ， 过期之时 ， 消息被丢给交换器 exchange.dlx 中，这时找到与 exchange.dlx 匹配的队列 queue.dlx，最后消息被存储在 queue.dlx 这个死信队列中。


对于 RabbitMQ 来说， DLX 是一个非常有用的特性 。 它可以处理异常情况下，消息不能够被消费者正确消费(消费者调用了 Basic.Nack 或者 Basic.Reject) 而被置入死信队列中的情况，后续分析程序可以通过消费这个死信队列中的内容来分析当时所遇到的异常情况，进而可以改善和优化系统。 DLX 配合 TTL 使用还可以实现延迟队列的功能


### 1.5.5. 延迟队列
<a href="#menu" style="float:right">目录</a>


延迟队列存储的对象是对应的延迟消息，所谓"延迟消息"是指当消息被发送以后，并不想让消费者立刻拿到消息，而是等待特定时间后，消费者才能拿到这个消息进行消费 

延迟队列的使用场景有很多，比如:
* 令在订单系统中， 一个用户下单之后通常有 3 0 分钟的时间进行支付，如果 30 分钟之内没有支付成功，那么这个订单将进行异常处理，这时就可以使用延迟队列来处理这些订单了 。
* 用户希望通过手机远程遥控家里的智能设备在指定的时间进行工作。这时候就可以将用户指令发送到延迟队列，当指令设定的时间到了再将指令推送到智能设备 。

在 AMQP 协议中，或者 RabbitMQ 本身没有直接支持延迟队列的功能，但是可以通过前面所介绍的 DLX 和 TTL 模拟出延迟队列的功能。

假设一个应用中需要将每条消息都设置为 10 秒的延迟，生产者通过 exchange.normal 这个交换器将发送的消息存储在 queue.normal 这个队列中。消费者订阅的并非是 queue.normal 这个队列，而是 queue.dlx 这个队列 。当消息从 queue.normal 这个队列中过期之后被存入 queue.dlx 这个队列中，消费者就恰巧消费到了延迟 10 秒的这条消息 。



### 1.5.6. 优先级队列
<a href="#menu" style="float:right">目录</a>

优先级队列，顾名思义，具有高优先级的队列具有高的优先权，优先级高的消息具备优先被消费的特权。
可以通过设置队列的 x -max -priority 参数来实现

```java
Map<String, Object> args = new HashMap<String, Object>() ;
//设置最大优先级
args.put( "x-max-priority" , 10) ;
channel.queueDeclare( "queue.priority" , true, fa1se , false , args) ;
```
发送数据
```java
AMQP.BasicProperties.Bui1der builder = new AMQP.BasicProperties.Builder();
//指定消息优先级,如果不设置,默认为0
builder.priority(5) ;
AMQP.BasicProperties properties = builder.build () ;
channel.basicPub1ish( "exchange_priority" , " rk_priority " , properties , "messages".getBytes () ) ;
```
优先级高的消息可以被优先消费，这个也是有前提的:如果在消费者的消费速度大于生产者的速度且Broker中没有消息堆积的情况下，对发送的消息设置优先级也就没有什么实际意义。因为生产者刚发送完一条消息就被消费者消费了，那么就相当于 Broker 中至多只有一条消息，对于单条消息来说优先级是没有什么意义的。




### 1.5.7. RPC实现
<a href="#menu" style="float:right">目录</a>


### 1.5.8. 持久化
<a href="#menu" style="float:right">目录</a>

* 交换器持久化
    * 声明队列时将 durable 参数置为 true 
    * 如果交换器不设置持久化，那么在 RabbitMQ 服务重启之后，相关的交换器元数据会丢失
    * 由于消息存放在队列中,因此消息不会丢失，只是不能将消息发送到这个交换器中。
    * 对一个长期使用的交换器来说，建议将其置为持久化的。

* 队列的持久化
    * 声明队列时将 durable 参数置为 true 
    * 如果队列不设置持久化，那么在 RabbitMQ 服务重启之后，相关队列的元数据会丢失，此时数据也会丢失
    * 队列的持久化能保证其本身的元数据不会因异常情况而丢失，但是并不能保证内部所存储的消息不会丢失,消息也必须实现持久化

* 消息持久化
    * 通过将消息的投递模式(BasicProperties 中的 deliveryMode 属性)设置为 2 即可实现消息的持久化
    * 前面示例中多次提及的 MessageProperties.PERSISTENT_TEXT_PLAIN 实际上是封装了这个属性 

可以将所有的消息都设直为持久化，但是这样会严重影响 RabbitMQ 的性能(随机)。写入磁盘的速度比写入内存的速度慢得不只一点点。对于可靠性不是那么高的消息可以不采用持久化处理以提高整体的吞吐量。在选择是否要将消息持久化时，需要在可靠性和吐吞量之间做一个权衡。

将交换器、队列、消息都设置了持久化之后就能百分之百保证数据不丢失了吗?答案是否定的 。
首先从消费者来说，如果在订阅消费队列时将 autoAck 参数设置为 true，那么 当消费者接收到相关消息之后，还没来得及处理就看机了，这样也算数据丢失。这种情况很好解决，将autoAck 参数设置为 false ， 并进行手动确认.
其次，在持久化的消息正确存入RabbitMQ之后，还需要有一段时间(虽然很短，但是不可忽视)才能存入磁盘之中。RabbitMQ 并不会为每条消息都进行同步存盘(调用内核的 fsync方法)的处理，可能仅仅保存到操作系统缓存之中而不是物理磁盘之中。如果在这段时间内RabbitMQ 服务节点发生了岩机、重启等异常情况，消息保存还没来得及落盘，那么这些消息将会丢失。

这个问题怎么解决呢?这里可以引入 RabbitMQ 的镜像队列机制，相当于配置了副本，如果主节点 C master ) 在此特殊时间内挂掉，可以自动切换到从节点 Cslave ),这样有效地保证了高可用性，除非整个集群都挂掉。虽然这样也不能完全保证 RabbitMQ 消息不丢失，但是配置了镜像队列要比没有配置镜像队列的可靠性要高很多，在实际生产环境中的关键业务队列一般都会设置镜像队列。

还可以在发送端引入事务机制或者发送方确认机制来保证消息己经正确地发送并存储至RabbitMQ 中，前提还要保证在调用 channel.basicPublish 方法的时候交换器能够将消息正确路由到相应的队列之中。

### 1.5.9. 生产者确认
<a href="#menu" style="float:right">目录</a>

#### 1.5.9.1. 事务机制
<a href="#menu" style="float:right">目录</a>

RabbitMQ客户端中与事务机制相关的方法有 三 个: channel.txSelect 、channel.txCommit 和 channel.txRollbacko channel.txSelect 用于将当前的信道设置成事务模式
* 在通过 channel.txSelect 方法开启事务之后，我们便可以发布消息给 RabbitMQ 了
* channel.txCommit 用于提交事务
* channel.txRollback 用于事务回滚。
如果事务提交成功，则消息一定到达了RabbitMQ 中，如果在事务提交执行之前由于 RabbitMQ异常崩溃或者其他原因抛出异常，这个时候我们便可以将其捕获，进而通过执行channel.txRollback 方法来实现事务回滚。注意这里的 RabbitMQ 中的事务机制与大多数数据库中的事务概念井不相同，需要注意区分。

```java
try {
    channel.txSelect() ;
    channel.basicPublish(exchange, rout 工口gKey ，
    MessageProperties . PERSISTENT TEXT PLAIN , msg.getBytes());
    int result = 1 / 0 ;
    channel . txCommit() ;
}
 catch (Exception e) {
    e.printStackTrace();
    channel.txRollback();
 }

```
如果要发送多条消息，则将 channel.basicPublish 和 channel.txCommit 等方法包裹进循环内即可，可以参考如下示例代码，

```java
channel.txSelect();
for (int i=O ; i<LOOP_TIMES;i++) {
    try {
        channel.basicPublish ("exchange " , "routingKey" , null ,("messages" + i) . getBytes()) ;
        channel.txCommit();
    } catch (IOException e){
        e.printStackTrace();
        channel.txRollback();
    }
}
```

事务确实能够解决消息发送方和 RabbitMQ 之间消息确认的问题，只有消息成功被RabbitMQ 接收，事务才能提交成功，否则便可在捕获异常之后进行事务回滚 ，与此同时可以进行消息重发。但是使用事务机制会"吸干" RabbitMQ 的性能，那么有没有更好的方法既能保证消息发送方确认消息已经正确送达，又能基本上不带来性能上的损失呢?从 AMQP 协议层面来看并没有更好的办法，但是 RabbitMQ 提供了一个改进方案，即发送方确认机制，

#### 1.5.9.2. 发送方确认机制
<a href="#menu" style="float:right">目录</a>

生产者将信道设置成 confirm (确认)模式，一旦信道进入 confirm 模式，所有在该信道上面发布的消息都会被指派一个唯一的 ID(从1开始)，一旦消息被投递到所有匹配的队列之后，RabbitMQ 就会发送一个确认 (Basic.Ack) 给生产者(包含消息的唯一 ID) ，这就使得生产者知晓消息已经正确到达了目的地了。如果消息和队列是可持久化的，那么确认消息会在消息写入磁盘之后发出。 RabbitMQ 回传给生产者的确认消息中的 deliveryTag 包含了确认消息的序号，此外 RabbitMQ 也可以设置 channel.basicAck 方法中的 multiple 参数，表示到这个序号之前的所有消息都己经得到了处理。注意辨别这里的确认和消费时候的确认之间的异同。

事务机制在一条消息发送之后会使发送端阻塞，以等待 RabbitMQ 的回应，之后才能继续发送下一条消息。相比之下 ， 发送方确认机制最大的好处在于它是异步的，一旦发布一条消息，生产者应用程序就可以在等信道返回确认的同时继续发送下一条消息，当消息最终得到确认之后，生产者应用程序便可以通过回调方法来处理该确认消息，如果 RabbitMQ 因为自身内部错误导致消息丢失，就会发送一条 nack (Basic.Nack) 命令，生产者应用程序同样可以在回调方法中处理该 nack 命令。

生产者通过调用 channel . confirmSelect 方法(即 Confirm.Select 命令)将信道设置为 confrrm 模式，之后 RabbitMQ 会返回 Confirm . Select-Ok 命令表示同意生产者将当
前信道设置为 confirm 模式。所有被发送的后续消息都被 ack 或者 nack 一次，不会出现一条消息既被 ack 又被 nack 的情况 ， 并且 RabbitMQ 也并没有对消息被 confrrm 的快慢做任何保证。

```java
channel.confirmSelect(); //将信道置为 publisher confirm 模式
//之后正常发送消息
channel.basicPublish( "exchange" , "routingKey" , null ,"publisher confirm test ".getBytes());
if(!channel.waitForConfirms()) {
    System.out .println( "send message failed " ) ;
}

```

如果发送多条消息，只需要将 channel.basicPublish 和 channel.waitForConfirms 方法包裹在循环里面即可，可以参考事务机制，不过不需要把channel.confirmSelect 方法包裹在循环内部。

如果信道没有开启 publisher confirm 模式，则调用任何 waitForConfirms 方法都会报出java.lang.IllegalStateException 。

```java
public boolean waitForConfirms() throws InterruptedException {
        return this.delegate.waitForConfirms();
}

public boolean waitForConfirms(long timeout) throws InterruptedException, TimeoutException {
    return this.delegate.waitForConfirms(timeout);
}

public void waitForConfirmsOrDie() throws IOException, InterruptedException {
    this.delegate.waitForConfirmsOrDie();
}

public void waitForConfirmsOrDie(long timeout) throws IOException, InterruptedException, TimeoutException {
    this.delegate.waitForConfirmsOrDie(timeout);
}
```
对于没有参数的 waitForConfirms 方法来说，其返回的条件是客户端收到了相应的 Basic.Ack/.Nack 或者被中断。参数 timeout 表示超时时间， 一旦等待RabbitMQ回应超时就会抛出 java.util.concurrent.TimeoutException 的异常。两个 waitForConfirmsOrDie 方法在接收到 RabbitMQ 返回的 Basic.Nack 之后会抛出 java.io.IOException 。业务代码可以根据自身的特性灵活地运用这四种方法来保障消息的可靠发送。

**注意要点**
* 事务机制和 publisher confirm 机制两者是互斥的，不能共存
* 事务和 publisher confirm 机制确保的是消息能够正确地发送至 RabbitMQ ，这里的"发送至 RabbitMQ" 的含义是指消息被正确地发往至 RabbitMQ 的交换器，如果此交换器没有匹配的队列，那么消息也会丢失。所以在使用这两种机制的时候要确保所涉及的交换器能够有匹配的队列 . 更进一步地讲，发送方要配合 mandatory 参数或者备份交换器一起使用来提高消息传输的可靠性 。


publisher confirm的优势在于并不一定需要同步确认.其他优化方法
* 批量confirm方法:每发送一批消息后，调用channel.waitForConfirms方法，等待服务器的确认返回。
* 异步confirm方法:提供一个回调方法，服务端确认了一条或者多条消息后客户端会回调这个方法进行处理。

在批量confirm方法中，客户端程序需要定期或者定量(达到多少条)，亦或者两者结合起来调用channel.waitForConfirms来等待RabbitMQ的确认返回。相比于前面示例中的普通confirm方法，批量极大地提升了confirm的效率，但是问题在于出现返回Basic.Nack或者超时情况时，客户端需要将这一批次的消息全部重发，这会带来明显的重复消息���量，并且当消息经常丢失时，批量confirm的性能应该是不升反降的。

异步confirm方法的编程实现最为复杂。在客户端Channel接口中提供的addConfirmListener方法可以添加ConfirmListener这个回调接口，这个ConfirmListener接口包含两个方法:handleAck和handleNack，分别用来处理RabbitMQ回传的Basic.Ack和Basic.Nack。在这两个方法中都包含有一个参数deliveryTag(在publisher  confirm模式下用来标记消息的唯一有序序号),我们需要为每一个信道维护一个"unconfirm"的消息序号集合，每发送一条消息，集合中的元素加1。每当调用ConfirmListener中的handleAck方法时，"unconfirm"集合中删掉相应的一条(multiple设置为false)或者多条(multiple设置为true)记录。从程序运行效率上来看，这个"unconfirm"集合最好采用有序集合SortedSet的存储结构。事实上，Java客户端SDK中的waitForConfirms方法也是通过SortedSet维护消息序号的。


```java
public void addConfirmListener(ConfirmListener listener) {
    this.confirmListeners.add(listener);
    this.delegate.addConfirmListener(listener);
}

public ConfirmListener addConfirmListener(final ConfirmCallback ackCallback, final ConfirmCallback nackCallback) {
    ConfirmListener confirmListener = new ConfirmListener() {
        public void handleAck(long deliveryTag, boolean multiple) throws IOException {
            ackCallback.handle(deliveryTag, multiple);
        }

        public void handleNack(long deliveryTag, boolean multiple) throws IOException {
            nackCallback.handle(deliveryTag, multiple);
        }
    };
    this.addConfirmListener(confirmListener);
    return confirmListener;
}
public interface ConfirmListener {
    void handleAck(long var1, boolean var3) throws IOException;

    void handleNack(long var1, boolean var3) throws IOException;
}

public interface ConfirmCallback {
    void handle(long var1, boolean var3) throws IOException;
}
```

### 1.5.10. 消费端要点介绍
<a href="#menu" style="float:right">目录</a>

#### 1.5.10.1. 消息分发
<a href="#menu" style="float:right">目录</a>

当 RabbitMQ 队列拥有多个消费者时 ，队列收到的消息将以轮询 (round-robin )的分发方式发送给消费者。每条消息只会发送给订阅列表里的一个消费者。这种方式非常适合扩展，而且它是专门为并发程序设计的。如果现在负载加重，那么只需要创建更多的消费者来消费处理消息即可。

很多时候轮询的分发机制也不是那么优雅。默认情况下，如果有 n 个消费者，那么 RabbitMQ会将第 m 条消息分发给第 m%n (取余的方式)个消费者， RabbitMQ 不管消费者是否消费并己经确认 (Basic.Ack) 了消息。试想一下，如果某些消费者任务繁重，来不及消费那么多的消息，而某些其他消费者由于某些原因(比如业务逻辑简单、机器性能卓越等)很快地处理完了所分配到的消息，进而进程空闲，这样就会造成整体应用吞吐量的下降。

那么该如何处理这种情况呢?这里就要用到 channel.basicQos(int prefetchCount)这个方法，如前面章节所述， channel.basicQos 方法允许限制信道上的消费者所能保持的最大未确认消息的数量。

```JAVA
public void  recdata() throws Exception{

    final  Channel  channel = connection.createChannel();
    //
    channel.basicQos(64);
    Consumer consumer  = new DefaultConsumer(channel) {
        @Override
        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
            // System.out.println("接收到的数据：" + new String(body));

            User obj = serialize.deserialize(body,User.class);

            System.out.println("接收到的数据：" +obj.toString());

            channel.basicAck(envelope.getDeliveryTag(),false);
        }

    };
    channel.basicConsume(QUEUE_NAME,consumer);
}
```

在订阅消费队列之前，消费端程序调用了 channel.basicQos(5) ，之后订阅了某个队列进行消费。 RabbitMQ 会保存一个消费者的列表，每发送一条消息都会为对应的消费者计数，如果达到了所设定的上限，那么 RabbitMQ 就不会向这个消费者再发送任何消息。直到消费者确认了某条消息之后 ， RabbitMQ 将相应的计数减1，之后消费者可以继续接收消息，直到再次到达计数上限。这种机制可以类比于 TCP!IP中的"滑动窗口"。

```java
 public void basicQos(int prefetchSize, int prefetchCount, boolean global) throws IOException {
    if (global) {
        this.prefetchCountGlobal = prefetchCount;
    } else {
        this.prefetchCountConsumer = prefetchCount;
    }

    this.delegate.basicQos(prefetchSize, prefetchCount, global);
}

public void basicQos(int prefetchCount) throws IOException {
    this.basicQos(0, prefetchCount, false);
}

public void basicQos(int prefetchCount, boolean global) throws IOException {
    this.basicQos(0, prefetchCount, global);
}
```
前面介绍的都只用到了 prefetchCount 这个参数，当 prefetchCount 设置为 0 则表示没有上限。还有 prefetchSize 这个参数表示消费者所能接收未确认消息的总体大小的上限，单位为 B ，设置为 0 则表示没有上限。

对于一个信道来说，它可以同时消费多个队列，当设置了prefetchCount大于0时，这个信道需要和各个队列协调以确保发送的消息都没有超过所限定的prefetchCoun的值，这样会使 RabbitMQ 的性能降低，尤其是这些队列分散在集群中的多个 Broker 节点之中。RabbitMQ 为了提升相关的性能，在 AMQPO-9-1 协议之上重新定义了 global 这个参数

|global参数 |AMQP 0-9-1| RabbitMQ
|---|---|---|
|false|信道上所有的消费者都需要遵从 prefetchCount 的限定值| 信道上新的消费者需要遵从 prefetchCount 的限定值
|true|当前通信链路( Connection) 上所有的消费者都需要遵从 prefetchCount 的限定值 | 信道上所有的消费者都需要遵从 prefetchCount 的限定值

前面章节中的channel.basicQos方法的示例都是针对单个消费者的，而对于同一个信道上的多个消费者而言，如果设置了prefetchCount的值，那么都会生效

如果在订阅消息之前，既设置了global为true的限制，又设置了global为false的限制，那么哪个会生效呢?RabbitMQ会确保两者都会生效。举例说明，当前有两个队列queue1
和queue2:queue1有10条消息，分别为1到10;queue2也有10条消息，分别为11到20。有两个消费者分别消费这两个队列
```java
Channel channel = . ..;
Consumer consumerl = ...;
Consumer consumer2 = ...;
channel.basicQos(3 , false); // Per consumer limit
channel.basicQos(5 , true); // Per channel limit
channel.basicConsume( "queuel" , false , consumerl) ;
channel.basicConsume("queue2 " , false , consumer2) ;
```
那么这里每个消费者最多只能收到3个未确认的消息，两个消费者能收到的未确认的消息个数之和的上限为5。在未确认消息的情况下，如果consumerl接收到了消息1、2和3，那么consumer2至多只能收到11和12。如果像这样同时使用两种global的模式，则会增加RabbitMQ的负载，因为RabbitMQ需要更多的资源来协调完成这些限制。如无特殊需要，最好只使用global为false的设置，这也是默认的设置。

#### 1.5.10.2. 消息顺序性

<a href="#menu" style="float:right">目录</a>

消息的顺序性是指消费者消费到的消息和发送者发布的消息的顺序是一致的。举个例子，不考虑消息重复的情况，如果生产者发布的消息分别为msgl、msg2、msg3，那么消费者必然也是按照msgl、msg2、msg3的顺序进行消费的。

哪些情况下RabbitMQ的消息顺序性会被打破?
* 在使用事务机制或者publisher confirm时,消息发送失败情况下应用重新发送,就有可能导致消息的顺序性出现问题.
* 如果生产者发送的消息设置了不同的超时时间，井且也设置了死信队列，整体上来说相当于一个延迟队列，那么消费者在消费这个延迟队列的时候，消息的顺序必然不会和生产者发送消息的顺序一致。
* 如果消息设置了优先级，那么消费者消费到的消息也必然不是顺序性的

包括但不仅限于以上几种情形会使RabbitMQ消息错序。如果要保证消息的顺序性，需要业务方使用RabbitMQ之后做进一步的处理，比如在消息体内添加全局有序标识(类似Sequence
ID)来实现

### 1.5.11. 消息传输保障
<a href="#menu" style="float:right">目录</a>

消息可靠传输一般是业务系统接入消息中间件时首要考虑的问题，一般消息中间件的消息传输保障分为三个层级。
* At most once: 最多一次。消息可能会丢失 ，但绝不会重复传输 。
* At least once: 最少一次。消息绝不会丢失，但可能会重复传输。
* Exactly once: 恰好一次。每条消息肯定会被传输一次且仅传输一次。

RabbitMQ支持其中的"最多一次"和"最少一次"。其中"最少一次"投递实现需要考虑以下这个几个方面的内容:
(1)消息生产者需要开启事务机制或者publisherconfirm机制，以确保消息可以可靠地传输到RabbitMQ中。
(2)消息生产者需要配合使用mandatory参数或者备份交换器来确保消息能够从交换器路由到队列中，进而能够保存下来而不会被丢弃。
(3)消息和队列都需要进行持久化处理，以确保RabbitMQ服务器在遇到异常情况时不会造成消息丢失。
(4)消费者在消费消息的同时需要将autoAck设置为false，然后通过手动确认的方式去确认己经正确消费的消息，以避免在消费端引起不必要的消息丢失。

"恰好一次"是RabbitMQ目前无法保障的。考虑这样一种情况，消费者在消费完一条消息之后向RabbitMQ发送确认Basic.Ack命令，此时由于网络断开或者其他原因造成RabbitMQ
并没有收到这个确认命令，那么RabbitMQ不会将此条消息标记删除。在重新建立连接之后，消费者还是会消费到这一条消息，这就造成了重复消费。再考虑一种情况，生产者在使用
publisherconfirm机制的时候，发送完一条消息等待RabbitMQ返回确认通知，此时网络断开，生产者捕获到异常情况，为了确保消息可靠性选择重新发送，这样RabbitMQ中就有两条同样
的消息，在消费的时候，消费者就会重复消费。

那么RabbitMQ有没有去重的机制来保证"恰好一次"呢?答案是并没有，不仅是RabbitMQ，目前大多数主流的消息中间件都没有消息去重机制，也不保障"恰好一次"。去重处理一般是在业务客户端实现，比如引入GUID(GloballyUniqueIdentifier)的概念。针对GUID，如果从客户端的角度去重，那么需要引入集中式缓存，必然会增加依赖复杂度，另外缓存的大小也难以界定。建议在实际生产环境中，业务方根据自身的业务特性进行去重，比如业务消息本身具备军等'性，或者借助Redis等其他产品进行去重处理。

## 1.6. Spring集成RabbitMQ

### 1.6.1. 依赖
<a href="#menu" style="float:right">目录</a>

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>
```

### 1.6.2. 配置
<a href="#menu" style="float:right">目录</a>

```java
@ConfigurationProperties(
    prefix = "spring.rabbitmq"
)
public class RabbitProperties {
    //ip
    private String host = "localhost";
    //端口
    private int port = 5672;
    //用户名称和密码
    private String username = "guest";
    private String password = "guest";
    private final RabbitProperties.Ssl ssl = new RabbitProperties.Ssl();
    //虚拟主机
    private String virtualHost;
    //
    private String addresses;
    @DurationUnit(ChronoUnit.SECONDS)
    private Duration requestedHeartbeat;
    private boolean publisherConfirms;
    private boolean publisherReturns;
    private Duration connectionTimeout;
    private final RabbitProperties.Cache cache = new RabbitProperties.Cache();
    private final RabbitProperties.Listener listener = new RabbitProperties.Listener();
    private final RabbitProperties.Template template = new RabbitProperties.Template();
    private List<RabbitProperties.Address> parsedAddresses;
}
```

```yml
spring:
  rabbitmq:
    host: 127.0.0.1
    port: 5672
    username: guest
    password: guest
    virtual-host: /rabbitmq
```
### 1.6.3. 配置类

```java
@Slf4j
@Configuration
public class RabbitConfig {

    @Value("${spring.rabbitmq.host}")
    private String host;

    @Value("${spring.rabbitmq.port}")
    private int port;

    @Value("${spring.rabbitmq.username}")
    private String username;

    @Value("${spring.rabbitmq.password}")
    private String password;

    @Value("${spring.rabbitmq.virtual-host}")
    private String virtualhost;


    public static final String EXCHANGE_A = "my-mq-exchange_A";
    public static final String EXCHANGE_B = "my-mq-exchange_B";
    public static final String EXCHANGE_C = "my-mq-exchange_C";


    public static final String QUEUE_A = "QUEUE_A";
    public static final String QUEUE_B = "QUEUE_B";
    public static final String QUEUE_C = "QUEUE_C";

    public static final String ROUTINGKEY_A = "spring-boot-routingKey_A";
    public static final String ROUTINGKEY_B = "spring-boot-routingKey_B";
    public static final String ROUTINGKEY_C = "spring-boot-routingKey_C";

    /*
    配置工厂
    */
    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory(host,port);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        connectionFactory.setVirtualHost(virtualhost);
        connectionFactory.setPublisherConfirms(true);
        return connectionFactory;
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    //必须是prototype类型
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate template = new RabbitTemplate(connectionFactory());
        return template;
    }


    //配置队列
    /**
     * 获取队列A
     * @return
     */
    @Bean
    public Queue queueA() {
        return new Queue(QUEUE_A, true); //队列持久
    }

    /**
     * 获取队列A
     * @return
     */
    @Bean
    public Queue queueB() {
        return new Queue(QUEUE_B, true); //队列持久
    }





    /**
     * 针对消费者配置
     * 1. 设置交换机类型
     * 2. 将队列绑定到交换机
     FanoutExchange: 将消息分发到所有的绑定队列，无routingkey的概念
     HeadersExchange ：通过添加属性key-value匹配
     DirectExchange:按照routingkey分发到指定队列
     TopicExchange:多关键字匹配
     */
    @Bean
    public DirectExchange defaultExchange() {
        return new DirectExchange(EXCHANGE_A);
    }

    //绑定
    @Bean
    public Binding bindingA() {
        return BindingBuilder.bind(queueA()).to(defaultExchange()).with(RabbitConfig.ROUTINGKEY_A);
    }
    @Bean
    public Binding bindingB(){
        return BindingBuilder.bind(queueB()).to(defaultExchange()).with(RabbitConfig.ROUTINGKEY_B);
    }
}
```

从上面可以看到主要有以下几个步骤
* 配置连接工厂,用于创建连接
* 配置RabbitTemplate,后续通过这个对象发送数据
* 配置队列Queue
* 配置交换器Exchange
* 绑定交换器和队列

**队列**
```java
 public Queue(String name, boolean durable, boolean exclusive, boolean autoDelete, Map<String, Object> arguments);
```
* name : 队列的名称。
* durable: 设置是否持久化。为 true 则设置队列为持久化。持久化的队列会存盘，在服务器重启的时候可以保证不丢失相关信息。
* exclusive : 设置是否排他。为 true 则设置队列为排他的。如果一个队列被声明为排他队列，该队列仅对首次声明它的连接可见，并在连接断开时自动删除。这里需要注意三点:排他队列是基于连接( Connection) 可见的，同一个连接的不同信道 (Channel)是可以同时访问同一连接创建的排他队列; "首次"是指如果一个连接己经声明了 一个排他队列，其他连接是不允许建立同名的排他队列的，这个与普通队列不同:即使该队列是持久化的，一旦连接关闭或者客户端退出，该排他队列都会被自动删除，这种队列适用于一个客户端同时发送和读取消息的应用场景。
* autoDelete: 设置是否自动删除。为 true 则设置队列为自动删除。自动删除的前提是:至少有一个消费者连接到这个队列，之后所有与这个队列连接的消费者都断开时，才会自动删除。不能把这个参数错误地理解为: "当连接到此队列的所有客户端断开时，这个队列自动删除"，因为生产者客户端创建这个队列，或者没有消费者客户端与这个队列连接时，都不会自动删除这个队列。
* argurnents: 设置队列的其他一些参数，如 x-rnessage-ttl 、 x-expires ,x -rnax-length 、 x-rnax-length-bytes 、 x-dead-letter-exchange 、x-deadletter-routing-key, x-rnax-priority 等。

**交换器**
```java
public Exchange(String name, boolean durable, boolean autoDelete, Map<String, Object> arguments)
```
* name : 交换器的名称。
* durable: 设置是否持久化 。 durable 设置为 true 表示持久化， 反之是非持久化 。持久化可以将交换器存盘，在服务器重启 的时候不会丢失相关信息。
* autoDelete : 设置是否自动删除。 autoDelete 设置为 true 则表示自动删除。自动删除的前提是至少有一个队列或者交换器与这个交换器绑定 ， 之后所有与这个交换器绑定的队列或者交器都与此解绑。注意不能错误地把这个参数理解为 : "当与此交换器连接的客户端都断开时 ， RabbitMQ 会自动删除本交换器 "。
* argument : 其他一些结构化参数，比如 alternate - exchange

根据不同的类型,一共有以下几种交换器
* DirectExchange
* FanoutExchange
* CustomExchange(自定义)
* TopicExchange
* HeadersExchange



### 1.6.4. 生产者
<a href="#menu" style="float:right">目录</a>

```java
@Slf4j
@Component
public class MsgProducer implements RabbitTemplate.ConfirmCallback {

 
    //由于rabbitTemplate的scope属性设置为ConfigurableBeanFactory.SCOPE_PROTOTYPE，所以不能自动注入
    private RabbitTemplate rabbitTemplate;
    /**
     * 构造方法注入rabbitTemplate
     */
    @Autowired
    public MsgProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
        rabbitTemplate.setConfirmCallback(this); //rabbitTemplate如果为单例的话，那回调就是最后设置的内容
    }

    public void sendMsg(String content) {
        CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
        //把消息放入ROUTINGKEY_A对应的队列当中去，对应的是队列A
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_A, RabbitConfig.ROUTINGKEY_A, content, correlationId);
    }
    /**
     * 回调
     */
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        logger.info(" 回调id:" + correlationData);
        if (ack) {
            logger.info("消息成功消费");
        } else {
            logger.info("消息消费失败:" + cause);
        }
    }
}
```

### 1.6.5. 消费者
<a href="#menu" style="float:right">目录</a>


```java
@Slf4j
@Component
@RabbitListener(queues = RabbitConfig.QUEUE_A)
public class MsgReceiver {
    
    @RabbitHandler
    public void process(String content) {
        log.info("接收处理队列A当中的消息： " + content);
    }
}

```

### 1.6.6. 为Rabbitmq中的Jackson2JsonMessageConverter自定义ClassMapper
<a href="#menu" style="float:right">目录</a>

每次发消息都要自己构造 Message 对象比较麻烦。Spring-AMQP 允许我们直接使用自定义的类，然后会利用指定好的 MessageConverter 将自定义的类转换为 Message 进行发送，在接收时也会利用 MessageConverter 将接收到的 Message 对象转成需要的对象。Spring-AMQP 提供了多种 MessageConverter，比如 SimpleMessageConverter，SerializerMessageConverter，Jackson2JsonMessageConverter，MarshallingMessageConverter等等，如果发送的消息对象不是 Message 实例，并且没有指定 MessageConverter 的话，默认用 SimpleMessageConverter。以上各种 MessageConverter 归根结底都是实现了 MessageConverter 接口，该接口只有两个方法：

```java
public interface MessageConverter {
    Message toMessage(Object var1, MessageProperties var2) throws MessageConversionException;

    default Message toMessage(Object object, MessageProperties messageProperties, @Nullable Type genericType) throws MessageConversionException {
        return this.toMessage(object, messageProperties);
    }

    Object fromMessage(Message var1) throws MessageConversionException;
}
```
这两个方法一个是在发送消息时将我们的消息对象转换成标准的 Message 对象，另一个是在接受消息时将 Message 对象转换为相应的对象。
比较常用的 Converter 就是 Jackson2JsonMessageConverter(以下简称 JsonMessageConverter)，在发送消息时，它会先将自定义的消息类序列化成json格式，再转成byte构造 Message，在接收消息时，会将接收到的 Message 再反序列化成自定义的类

不过使用 JsonMessageConverter 时有一个小问题，在不对它进行任何改造的前提下，发送消息的类和接受消息的类必须是一样的，不仅是要里面的字段一样，类名一样，连类的包路径都要一样。

所以当系统1使用 JsonMessageConverter 发送消息类A给系统2时，系统2可以有如下几种方式来接收：
1.依赖系统1的jar包,直接使用类A来接收
2.不依赖系统1的jar包，自己建一个和A一模一样的类，连名称，包路径都一样
3.负责监听 queue 的类实现 MessageListener 接口，直接接收 Message 类，再自己转换
上面三个方法都不是很好，按照正常的想法，我们肯定是期望系统2直接使用自己的类来接收就可以了，只要与A类的字段名一样即可。那有没有方法可以让系统2既不依赖无用的jar包，也不用建立个与自己命名规范不相符的类， 也无需自己转换呢?

要解决这个问题，就要先看看 JsonMessageConverter 是如何将 Message 进行反序列化的。
在 JsonMessageConverter 的 fromMessage 方法中有这么一段:
```java
if (conversionHint instanceof ParameterizedTypeReference) {
    content = this.convertBytesToObject(message.getBody(), encoding, this.objectMapper.getTypeFactory().constructType(((ParameterizedTypeReference)conversionHint).getType()));
} else if (this.getClassMapper() == null) {
    JavaType targetJavaType = this.getJavaTypeMapper().toJavaType(message.getMessageProperties());
    content = this.convertBytesToObject(message.getBody(), encoding, targetJavaType);
} else {
    Class<?> targetClass = this.getClassMapper().toClass(message.getMessageProperties());
    content = this.convertBytesToObject(message.getBody(), encoding, targetClass);
}
```

就是说默认情况下，JsonMessageConverter 使用的 ClassMapper 是 DefaultJackson2JavaTypeMapper，在转换时通过 Message 的 Properties 来获取要转换的目标类的类型。通过 Debug 可以发现，目标类的类型是存储在 Message 的 Proterties 的 一个 headers 的 Map 中，Key 叫“__TypeId__”。所以只要想办法在传输消息时更改__TypeId__的值即可。

下面是解决办法，在消息的生产者端为 JsonMessageConverter， 设置一个自定义的 ClassMapper，重写 fromClass 方法，将 __TypeId__ 的值设为消费端用来接收的类的路径+名称。当然了，也可以在消费者端重写toClass方法，直接返回想要转换的目标类的类类型。两种选一种就可以。

```java
Jackson2JsonMessageConverter converter = new Jackson2JsonMessageConverter();
converter.setClassMapper(new ClassMapper() {

    //发送端重写
    @Override
    public void fromClass(Class<?> aClass, MessageProperties messageProperties) {

        // messageProperties.setHeader("__TypeId__", "com.xxx.B");
        throw new UnsupportedOperationException("this mapper is only for outbound, do not use for receive message");

    }
    //消费端重写
    @Override
    public Class<?> toClass(MessageProperties messageProperties) {
        // messageProperties.setHeader("__TypeId__", "com.xxx.B");
        return UserRecDto.class;
    }
});
```

### 1.6.7. SimpleMessageListenerContainer
<a href="#menu" style="float:right">目录</a>

SimpleMessageListenerContainer 即简单消息监听容器。

这个类非常的强大，我们可以对他进行很多的设置，用对于消费者的配置项，这个类都可以满足。它有监听单个或多个队列、自动启动、自动声明功能。
* 它可以设置事务特性、事务管理器、事务属性、事务并发、是否开启事务、回滚消息等。但是我们在实际生产中，很少使用事务，基本都是采用补偿机制。
* 它可以设置消费者数量、最小最大数量、批量消费。
* 它可以设置消息确认和自动确认模式、是否重回队列、异常捕获 Handler 函数。
* 它可以设置消费者标签生成策略、是否独占模式、消费者属性等。
* 它还可以设置具体的监听器、消息转换器等等。
注意: SimpleMessageListenerContainer 可以进行动态设置，比如在运行中的应用可以动态的修改其消费者数量的大小、接收消息的模式等。
很多基于 rabbitMQ 的自制定化后端管控台在进行设置的时候，也是根据这一去实现的。所以可以看出 SpringAMQP 非常的强大。

```java
@Bean
public SimpleMessageListenerContainer messageContainer() {
    //加载处理消息A的队列
    SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory());
    //设置接收多个队列里面的消息，这里设置接收队列A
    //假如想一个消费者处理多个队列里面的信息可以如下设置：
    //container.setQueues(queueA(),queueB(),queueC());
    //container.setQueues(queueA());
    container.setQueueNames(RabbitConfig.QUEUE_A);
    container.setExposeListenerChannel(true);
    //设置最大的并发的消费者数量
    container.setMaxConcurrentConsumers(10);
    //最小的并发消费者的数量
    container.setConcurrentConsumers(1);
    //设置确认模式手工确认
    container.setAcknowledgeMode(AcknowledgeMode.MANUAL);


    MessageListenerAdapter messageListener = new MessageListenerAdapter(new Object() {

        @SuppressWarnings("unused")
        public void handleMessage(UserRecDto object) {
            System.out.println("Got a " + object);
        }

    });


    Jackson2JsonMessageConverter converter = new Jackson2JsonMessageConverter();
    converter.setClassMapper(new ClassMapper() {
        @Override
        public void fromClass(Class<?> aClass, MessageProperties messageProperties) {

            throw new UnsupportedOperationException("this mapper is only for outbound, do not use for receive message");

        }

        @Override
        public Class<?> toClass(MessageProperties messageProperties) {
            // messageProperties.setHeader("__TypeId__", "com.xxx.B");
            return UserRecDto.class;
        }
    });
    container.setMessageConverter(converter);

    //定义接收监听器
    container.setMessageListener(new ChannelAwareMessageListener(){

        @Override
        public void onMessage(Message message, Channel channel) throws Exception {

            /**通过basic.qos方法设置prefetch_count=1，这样RabbitMQ就会使得每个Consumer在同一个时间点最多处理一个Message，
                换句话说,在接收到该Consumer的ack前,它不会将新的Message分发给它 */
            channel.basicQos(1);

            UserRecDto userRecDto = (UserRecDto)container.getMessageConverter().fromMessage(message);

            log.info("接收处理队列A当中的消息:" + userRecDto);
            long deliveryTag = message.getMessageProperties().getDeliveryTag();
            /**为了保证永远不会丢失消息，RabbitMQ支持消息应答机制。
                当消费者接收到消息并完成任务后会往RabbitMQ服务器发送一条确认的命令，然后RabbitMQ才会将消息删除。*/
            channel.basicAck(deliveryTag,false);
        }
    });
    
    return container;
}
```

同时生产者要设定MessageConverter为jackson2JsonMessageConverter.
```java
@Bean
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//必须是prototype类型
public RabbitTemplate rabbitTemplate() {
    RabbitTemplate template = new RabbitTemplate(connectionFactory());
    template.setMessageConverter(jackson2JsonMessageConverter());
    return template;
}
```
发送消息
```java
public void sendMsgObject(Object content) {
    CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
    //把消息放入ROUTINGKEY_A对应的队列当中去，对应的是队列A
    rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_A, RabbitConfig.ROUTINGKEY_A, content, correlationId);
}
```


## 1.7. RabbitMQ管理
<a href="#menu" style="float:right">目录</a>

## 1.8. 数据存储
<a href="#menu" style="float:right">目录</a>


## 1.9. 集群
<a href="#menu" style="float:right">目录</a>

### 1.9.1. 集群架构
<a href="#menu" style="float:right">目录</a>



在单一节点内,RabbitMQ会将所有这些信息存储在内存中,同时将那些标记为持久化的队列和交换器(以及它们的绑定)存储在磁盘上.以确保重启之后能够恢复.

RabbitMQ集群允许消费者和生产者在RabbitMQ单个节点崩惯的情况下继续运行，它可以通过添加更多的节点来线性地扩展消息通信的吞吐量。当失去一个RabbitMQ节点时,客户端能够重新连接到集群中的任何其他节点并继续生产或者消费。

不过RabbitMQ集群不能保证消息的万无一失，即将消息、队列、交换器等都设置为可持久化，生产端和消费端都正确地使用了确认方式。当集群中一个RabbitMQ节点崩溃时，该节点上的所有队列中的消息也会丢失。RabbitMQ集群中的所有节点都会备份所有的元数据信息，包括以下内容
RabbitMQ会记录以下四种类型的内部元数据
* 队列元数据
    * 队列名称和它们的属性(是否可持久化,是否可删除)
* 交换器元数据
    * 交换器名称.类型,属性(可持久化等)
* 绑定元数据
    * 一张简单的表格展示了如何将消息路由到队列
* vhost元数据
    * 为vhost内的队列,交换器和绑定提供命名空间和安全属性

在将两个节点组成集群之后,不是每一个节点都有所有队列的完全拷贝,如果在集群中创建队列,集群只会在单个节点而不是所有节点上创建完整的队列信息(元数据,状态,内容).结果是只有队列的所有者节点知道队列的所有信息.其他非所有者节点只知道队列的元数据和指向该队列存在的那个节点的指针.因此,当集群节点崩溃时,该节点的队列和关联的绑定就都消失了.附加在那些队列上的消费者丢失了其订阅的信息,并且任何匹配该队列绑定信息的新消息也丢失了.

独立节点和集群配置下的队列行为
![独立节点和集群配置下的队列行为](https://github.com/lgjlife/Java-Study/blob/master/pic/rabbitmq/cluster-queue.png?raw=true)


但是不会备份消息(当然通过特殊的配置比如镜像队列可以解决这个问题)。基于存储空间和性能的考虑，在RabbitMQ集群中创建队列，集群只会在单个节点而不是在所有节点上创建队列的进程井包含完整的队列信息(元数据、状态、内容)。这样只有队列的宿主节点，即所有者节点知道队列的所有信息，所有其他非所有者节点只知道队列的元数据和指向该队列存在的那个节点的指针。因此当集群节点崩溃时，该节点的队列进程和关联的绑定都会消失。附加在那些队列上的消费者也会丢失其所订阅的信息，井且任何匹配该队列绑定信息的新消息也都会消失。

不同于队列那样拥有自己的进程，交换器其实只是一个名称和绑定列表。当消息发布到交换器时，实际上是由所连接的信道将消息上的路由键同交换器的绑定列表进行比较，然后再路由消息。当创建一个新的交换器时，RabbitMQ所要做的就是将绑定列表添加到集群中的所有节点上。这样，每个节点上的每条信道都可以访问到新的交换器了

### 1.9.2. 集群搭建
<a href="#menu" style="float:right">目录</a>

RabbitMQ 集群对延迟非常敏感，应当只在本地局域网内使用。在广域网中不应该使用集群，而应该使用 Federation 或者 Shove1 来代替。

#### 1.9.2.1. 多机多节点配置
<a href="#menu" style="float:right">目录</a>

第一步，配置各个节点的hosts文件，让各个节点都能互相识别对方的存在。比如在Linux系统中可以编辑/etc/hosts文件，在其上添加IP地址与节点名称的映射信息:
192.168.0.2 node1
192.168.0.3 node2
192.168.0.4 node3

第二步，编辑RabbitMQ的cookie文件，以确保各个节点的cookie文件使用的是同一个值。可以读取node1节点的cookie值，然后将其复制到node2和node3节点中。cookie文件默认路径为/var/lib/rabbitmq/.erlang.cookie或者$HOME/.erlang.cookieocookie相当于密钥令牌，集群中的RabbitMQ节点需要通过交换密钥令牌以获得相互认证。如果节点的密钥令牌不一致，那么在配置节点时就会报错
```
lgj@lgj-Lenovo-G470:/var/lib/rabbitmq$ sudo cat .erlang.cookie 
JRIGDZZMGHCTSBWBLRFO
```

第三步，配置集群。配置集群有三种方式:通过rabbitmqctl工具配置;通过rabbitmq.config配置文件配置;通过rabbitmq-autocluster插件配置。这里主要讲的是通过rabbitmqctl工具的方式配置集群，这种方式也是最常用的方式

首先启动 nodel ， node2 和 node3 这 3 个节点 的 RabbitMQ 服务。
```
[root@nodel -]# rabbitmq- server -detached
[root@node2 -]# rabbitmq- server - detached
[root@node3 - ]# rabbitmq-server - detached
```
这 3 个节点目前都是以独立节点存在的单个集群。通过 rabbitmqctl cluster_status 命令来查看各个节点的状态。
```
[root@nodel -]# rabbitmqctl cluster_status
Cluster status of node rabbit@nodel
[{nodes , [{disc , [rabbit@nodel]}]} ,
{running_nodes , [rabbit@nodel]} ,
{cluster name, <<" rabbit@nodel " >>} ,
{partitions , []} ,
{alarms , [{rabbit@nodel , []}]}]
```


#### 1.9.2.2. 集群节点类型
<a href="#menu" style="float:right">目录</a>


#### 1.9.2.3. 删除单个节点
<a href="#menu" style="float:right">目录</a>


#### 1.9.2.4. 集群节点的升级
<a href="#menu" style="float:right">目录</a>


#### 1.9.2.5. 单机多节点配置
<a href="#menu" style="float:right">目录</a>



### 1.9.3. 镜像队列
<a href="#menu" style="float:right">目录</a>

如果RabbitMQ集群中只有一个Broker节点，那么该节点的失效将导致整体服务的临时'性不可用，并且也可能会导致消息的丢失。可以将所有消息都设置为持久化，并且对应队列的durable属性也设置为true，但是这样仍然无法避免由于缓存导致的问题:因为消息在发送之后和被写入磁盘井执行刷盘动作之间存在一个短暂却会产生问题的时间窗。通过publisherconfmn机制能够确保客户端知道哪些消息己经存入磁盘，尽管如此，一般不希望遇到因单点故障导致的服务不可用。

如果RabbitMQ集群是由多个Broker节点组成的，那么从服务的整体可用性上来讲，该集群对于单点故障是有弹性的，但是同时也需要注意:尽管交换器和绑定关系能够在单点故障问题上幸免于难，但是队列和其上的存储的消息却不行，这是因为队列进程及其内容仅仅维持在单个节点之上，所以一个节点的失效表现为其对应的队列不可用。

引入镜像队列(MirrorQueue)的机制，可以将队列镜像到集群中的其他Broker节点之上，如果集群中的一个节点失效了，队列能自动地切换到镜像中的另一个节点上以保证服务的可用性。在通常的用法中，针对每一个配置镜像的队列(以下简称镜像队列〉都包含一个主节点(master)和若干个从节点(slave)

* 生产者发送消息时会同时向master和slave节点发送,除发送消息外,其他命令只向master发送.再由master将命令执行的结果广播给各个slave。
* 如果master挂掉.那么运行最长的slave(最早加入)会被提升为master.
* 如果消费者与slaver建立连接,发送获取消息的请求,slave收到后会将请求转发给master,再由master准备好数据返回给slave，最后由slave投递给消费者

大多的读写压力都落到了master上，那么这样是否负载会做不到有效的均衡?或者说是否可以像MySQL一样能够实现master写而slave读呢?注意这里的master和slave是针对队列而言的，而队列可以均匀地散落在集群的各个Broker节点中以达到负载均衡的目的，因为真正的负载还是针对实际的物理机器而言的，而不是内存中驻留的队列进程。

集群中的每个Broker节点都包含1个队列的master和2个队列的slave，Ql的负载大多都集中在brokerl上，Q2的负载大多都集中在broker2上，Q3的负载大多都集中在broker3上，只要确保队列的master节点均匀散落在集群中的各个Broker节点即可确保很大程度上的负载均衡(每个队列的流量会有不同，因此均匀散落各个队列的master也无法确保绝对的负载均衡)。至于为什么不像MySQL一样读写分离，RabbitMQ从编程逻辑上来说完全可以实现，但是这样得不到更好的收益，即读写分离并不能进一步优化负载，却会增加编码实现的复杂度，增加出错的可能

![集群架构](https://github.com/lgjlife/Java-Study/blob/master/pic/rabbitmq/cluster.png?raw=true)


## 1.10. 网络分区
<a href="#menu" style="float:right">目录</a>

### 1.10.1. 网络分区的意义
<a href="#menu" style="float:right">目录</a>

当出现网络分区时，不同分区里的节点会认为不属于自身所在分区的节点都已经挂(down)了，对于队列、交换器、绑定的操作仅对当前分区有效。在RabbitMQ的默认配置下，即使网络恢复了也不会自动处理网络分区带来的问题。RabbitMQ从3.1版本开始会自动探测网络分区，并且提供了相应的配置来解决这个问题。

当一个集群发生网络分区时，这个集群会分成两个部分或者更多，它们各自为政，互相都认为对方分区内的节点已经挂了，包括队列、交换器及绑定等元数据的创建和销毁都处于自身分区内，与其他分区无关。如果原集群中配置了镜像队列，而这个镜像队列又牵涉两个或者更多个网络分区中的节点时，每一个网络分区中都会出现一个master节点，对于各个网络分区，此队列都是相互独立的。当然也会有一些其他未知的、怪异的事情发生。当网络恢复时，网络分区的状态还是会保持，除非你采取了一些措施去解决它。极端情况下不仅会造成数据丢失，还会影响服务的可用性。

RabbitMQ采用的镜像队列是一种环形的逻辑结构,某队列配置了4个镜像，其中A节点作为master节点，其余B、C和D节点作为slave节点，4个镜像节点组成一个环形结构。假如需要确认(ack)一条消息，先会在A节点即master节点上执行确认命令，之后转向B节点，然后是C和D节点，最后由D将执行操作返回给A节点，这样才真正确认了一条消息，之后才可以继续相应的处理。这种复制原理和ZooKeeperl的Quorum2原理不同，它可以保证更强的一致性。在这种一致性数据模型下，如果出现网络波动或者网络故障等异常情况，那么整个数据链的性能就会大大降低。如果C节点网络异常，那么整个A→B→C→D→A的数据链就会被阻塞，继而相关服务也会被阻塞，所以这里就需要寻|入网络分区来将异常的节点剥离出整个分区，以确保RabbitMQ服务的可用性及可靠性。等待网络恢复之后，可以进行相应的处理来将此前的异常节点加入集群中。

许多情况下，网络分区都是由单个节点的网络故障引起的，且通常会形成一个大分区和一个单节点的分区，如果之前又配置了镜像，那么可以在不影响服务可用性，不丢失消息的情况下从网络分区的情形下得以恢复 。

### 1.10.2. 网络分区的判定
<a href="#menu" style="float:right">目录</a>

### 1.10.3. 网络分区的模拟
<a href="#menu" style="float:right">目录</a>

### 1.10.4. 网络分区的影响
<a href="#menu" style="float:right">目录</a>

#### 1.10.4.1. 未配置的镜像
<a href="#menu" style="float:right">目录</a>

#### 1.10.4.2. 已配置的镜像
<a href="#menu" style="float:right">目录</a>

### 1.10.5. 手动处理网络分区
<a href="#menu" style="float:right">目录</a>

### 1.10.6. 自动处理网络分区
<a href="#menu" style="float:right">目录</a>

#### 1.10.6.1. pause-minority模式
<a href="#menu" style="float:right">目录</a>

#### 1.10.6.2. pause-if-all-down模式
<a href="#menu" style="float:right">目录</a>

#### 1.10.6.3. autoheal模式
<a href="#menu" style="float:right">目录</a>

#### 1.10.6.4. 模式选择
<a href="#menu" style="float:right">目录</a>



## 1.11. RabbitMQ扩展
<a href="#menu" style="float:right">目录</a>


### 1.11.1. 消息追踪
<a href="#menu" style="float:right">目录</a>

在使用任何消息中间件的过程中，难免会出现消息异常丢失的情况。对于RabbitMQ而言，可能是生产者与Broker断开了连接并且也没有任何重试机制;也可能是消费者在处理消息时发生了异常，不过却提前进行了ack;甚至是交换器并没有与任何队列进行绑定，生产者感知不到或者没有采取相应的措施;另外RabbitMQ本身的集群策略也可能导致消息的丢失。这个时候就需要有一个良好的机制来跟踪记录消息的投递过程，以此协助开发或者运维人员快速地定位问题。

#### 1.11.1.1. Firehose
<a href="#menu" style="float:right">目录</a>

在RabbitMQ中可以使用Firehose功能来实现消息追踪，Firehose可以记录每一次发送或者消费消息的记录，方便RabbitMQ的使用者进行调试、排错等。

Firehose的原理是将生产者投递给RabbitMQ的消息，或者RabbitMQ投递给消费者的消息按照指定的格式发送到默认的交换器上。这个默认的交换器的名称为amq.rabbitmq.trace，它是一个topic类型的交换器,每个虚拟主机都有一个。发送到这个交换器上的消息的路由键为publish.{exchangenam}和deliver.{queuename}。其中exchangename和queuename为交换器和队列的名称，分别对应生产者投递到交换器的消息和消费者从队列中获取的消息。

也就是说
* Firehose功能相当于将消息记录下来,以便后续调试和排错
* 默认的交换器的名称为amq.rabbitmq.trace,该交换器为topic类型,也就是通配符匹配
* 该功能默认关闭,必须打开才能使用
    * 开启:rabbitmqctl trace_on [-p vhost]
    * 关闭: rabbitmqctl trace_off [-p vhost]
* 消息发送到正常的交换器时或者消费消息时,同时会封装成一条特殊的消息,分别以路由键publish.{exchangenam}和deliver.{queuename}发送到trace交换器
* 交换器可以使用不同的绑定键来绑定不同的队列,比如 "#",publish.#,deliver.queuename

Firehose默认情况下处于关闭状态，并且Firehose的状态也是非持久化的，会在RabbitMQ服务重启的时候还原成默认的状态。Firehose开启之后多少会影响RabbitMQ整体服务的性能，因为它会引起额外的消息生成、路由和存储

在Firehose开启状态下，当有客户端发送或者消费消息时，Firehose会自动封装相应的消息体，并添加详细的headers属性。

#### 1.11.1.2. rabbitmq_tracing 插件
<a href="#menu" style="float:right">目录</a>

rabbitrnq_tracing插件相当于Firehose的GUI版本，它同样能跟踪RabbitMQ中消息的流入流出情况。rabbitrnqtracing插件同样会对流入流出的消息进行封装，然后将封装后的消息日志存入相应的trace文件之中。
* 打开:rabbitmq-plugins enable rabbitmq_tracing
* 关闭:rabbitmq-plugins disable rabbitmq_tracing

```
lgj@lgj-Lenovo-G470:~/java/rabbitmq_server-3.7.9/sbin$ ./rabbitmq-plugins enable rabbitmq_tracing
warning: the VM is running with native name encoding of latin1 which may cause Elixir to malfunction as it expects utf8. Please ensure your locale is set to UTF-8 (which can be verified by running "locale" in your shell)
The following plugins have been configured:
  rabbitmq_management
  rabbitmq_management_agent
  rabbitmq_tracing
  rabbitmq_web_dispatch
Applying plugin configuration to rabbit@lgj-Lenovo-G470...
The following plugins have been enabled:
  rabbitmq_tracing

started 1 plugins.

```
使能之后web管理页面的admin选型即增加tracing选项.


### 1.11.2. 负载均衡
<a href="#menu" style="float:right">目录</a>

面对大量业务访问、高并发请求，可以使用高性能的服务器来提升RabbitMQ服务的负载能力。当单机容量达到极限时，可以采取集群的策略来对负载能力做进一步的提升，但这里还存在一个负载不均衡的问题。试想如果一个集群中有3个节点，那么所有的客户端都与其中的单个节点nodel建立TCP连接，那么nodel的网络负载必然会大大增加而显得难以承受，其他节点又由于没有那么多的负载而造成硬件资源的浪费，所以负载均衡显得尤为重要。

对于RabbitMQ而言，客户端与集群建立的TCP连接不是与集群中所有的节点建立连接，而是挑选其中一个节点建立连接,在引入了负载均衡之后，各个客户端的连接可以分摊到集群的各个节点之中，进而避免了前面所讨论的缺陷。


负载均衡(Loadbalance)是一种计算机网络技术，用于在多个计算机(计算机集群〉、网络连接、CPU、磁盘驱动器或其他资源中分配负载，以达到最佳资源使用、最大化吞吐率、最小响应时间及避免过载的目的。使用带有负载均衡的多个服务器组件，取代单一的组件，可以通过冗余提高可靠性。

负载均衡通常分为软件负载均衡和硬件负载均衡两种。

软件负载均衡是指在一个或者多个交互的网络系统中的多台服务器上安装一个或多个相应的负载均衡软件来实现的一种均衡负载技术。软件可以很方便地安装在服务器上，并且实现一定的均衡负载功能。软件负载均衡技术配置简单、操作也方便，最重要的是成本很低。
硬件负载均衡是指在多台服务器间安装相应的负载均衡设备，也就是负载均衡器(如F5)来完成均衡负载技术，与软件负载均衡技术相比，能达到更好的负载均衡效果。由于硬件负载均衡技术需要额外增加负载均衡器，成本比较高，所以适用于流量高的大型网站系统。

这里主要讨论的是如何有效地对RabbitMQ集群使用软件负载均衡技术，目前主流的方式有在客户端内部实现负载均衡，或者使用HAProxy、LVS等负载均衡软件来实现


#### 1.11.2.1. 客户端内部实现负载均衡
<a href="#menu" style="float:right">目录</a>

#### 1.11.2.2. 使用HAProxy实现负载均衡
<a href="#menu" style="float:right">目录</a>

##### 1.11.2.2.1. HaProxy基本介绍
<a href="#menu" style="float:right">目录</a>

（1）HAProxy 是一款提供高可用性、负载均衡以及基于TCP（第四层）和HTTP（第七层）应用的代理软件，支持虚拟主机，它是免费、快速并且可靠的一种解决方案。 HAProxy特别适用于那些负载特大的web站点，这些站点通常又需要会话保持或七层处理。HAProxy运行在时下的硬件上，完全可以支持数以万计的 并发连接。并且它的运行模式使得它可以很简单安全的整合进您当前的架构中， 同时可以保护你的web服务器不被暴露到网络上。

（2）HAProxy 实现了一种事件驱动、单一进程模型，此模型支持非常大的并发连接数。多进程或多线程模型受内存限制 、系统调度器限制以及无处不在的锁限制，很少能处理数千并发连接。事件驱动模型因为在有更好的资源和时间管理的用户端(User-Space) 实现所有这些任务，所以没有这些问题。此模型的弊端是，在多核系统上，这些程序通常扩展性较差。这就是为什么他们必须进行优化以 使每个CPU时间片(Cycle)做更多的工作。

（3）HAProxy 支持连接拒绝 : 因为维护一个连接的打开的开销是很低的，有时我们很需要限制攻击蠕虫（attack bots），也就是说限制它们的连接打开从而限制它们的危害。 这个已经为一个陷于小型DDoS攻击的网站开发了而且已经拯救

了很多站点，这个优点也是其它负载均衡器没有的。

（4）HAProxy 支持全透明代理（已具备硬件防火墙的典型特点）: 可以用客户端IP地址或者任何其他地址来连接后端服务器. 这个特性仅在Linux 2.4/2.6内核打了cttproxy补丁后才可以使用. 这个特性也使得为某特殊服务器处理部分流量同时又不修改服务器的地址成为可能。

**性能**

HAProxy借助于OS上几种常见的技术来实现性能的最大化。
1，单进程、事件驱动模型显著降低了上下文切换的开销及内存占用。
2，O(1)事件检查器(event checker)允许其在高并发连接中对任何连接的任何事件实现即时探测。
3，在任何可用的情况下，单缓冲(single buffering)机制能以不复制任何数据的方式完成读写操作，这会节约大量的CPU时钟周期及内存带宽；
4，借助于Linux 2.6 (>= 2.6.27.19)上的splice()系统调用，HAProxy可以实现零复制转发(Zero-copy forwarding)，在Linux 3.5及以上的OS中还可以实现零复制启动(zero-starting)；
5，内存分配器在固定大小的内存池中可实现即时内存分配，这能够显著减少创建一个会话的时长；
6，树型存储：侧重于使用作者多年前开发的弹性二叉树，实现了以O(log(N))的低开销来保持计时器命令、保持运行队列命令及管理轮询及最少连接队列；
7，优化的HTTP首部分析：优化的首部分析功能避免了在HTTP首部分析过程中重读任何内存区域；
8，精心地降低了昂贵的系统调用，大部分工作都在用户空间完成，如时间读取、缓冲聚合及文件描述符的启用和禁用等；

所有的这些细微之处的优化实现了在中等规模负载之上依然有着相当低的CPU负载，甚至于在非常高的负载场景中，5%的用户空间占用率和95%的系统空间占用率也是非常普遍的现象，这意味着HAProxy进程消耗比系统空间消耗低20倍以上。因此，对OS进行性能调优是非常重要的。即使用户空间的占用率提高一倍，其CPU占用率也仅为10%，这也解释了为何7层处理对性能影响有限这一现象。由此，在高端系统上HAProxy的7层性能可轻易超过硬件负载均衡设备。

在生产环境中，在7层处理上使用HAProxy作为昂贵的高端硬件负载均衡设备故障故障时的紧急解决方案也时长可见。硬件负载均衡设备在“报文”级别处理请求，这在支持跨报文请求(request across multiple packets)有着较高的难度，并且它们不缓冲任何数据，因此有着较长的响应时间。对应地，软件负载均衡设备使用TCP缓冲，可建立极长的请求，且有着较大的响应时间。

##### 1.11.2.2.2. 安装
<a href="#menu" style="float:right">目录</a>

下载解压,进入解压后的目录
安装 
```
lgj@lgj-Lenovo-G470:~/java/haproxy-2.0.0$ uname -r
4.15.0-46-generic
lgj@lgj-Lenovo-G470:~/java/haproxy-2.0.0$ sudo make TARGET=4.15.0-46-generic PREFIX=/usr/local/haproxy
lgj@lgj-Lenovo-G470:~/java/haproxy-2.0.0$ sudo make install PREFIX=/usr/local/haproxy
```
参数说明：

* TARGET=linux310，内核版本，使用uname -r查看内核，如：3.10.0-514.el7，此时该参数就为linux310；kernel 大于2.6.28的可以用：TARGET=linux2628；
* ARCH=x86_64，系统位数；
* PREFIX=/usr/local/haprpxy #/usr/local/haprpxy，为haprpxy安装路径。

1.79及以后的版本解压后文件内就没有haproxy.cfg配置文件,进入上面的安装路径,创建文件haproxy.cfg,相关配置查看下一节内容

进入/usr/local/haproxy/sbin.
启动: haproxy -f haproxy.cfg命令运行HAProxy服务之后，可以在浏览器上输入 htφ://192.168.0.9:8100/stats 来加载相关的页面，


##### 1.11.2.2.3. 配置文件
<a href="#menu" style="float:right">目录</a>
haproxy 的配置文件由两部分组成：全局设定和对代理的设定，共分为五段：global，defaults，frontend，backend，listen。

HAProxy的配置处理3类来主要参数来源：
* 最优先处理的命令行参数;
* “global”配置段，用于设定全局配置参数；
* proxy相关配置段，如“defaults”、“listen”、“frontend”和“backend”；

**时间格式**
一些包含了值的参数表示时间，如超时时长。这些值一般以毫秒为单位，但也可以使用其它的时间单位后缀。
```
us: 微秒(microseconds)，即1/1000000秒；
ms: 毫秒(milliseconds)，即1/1000秒；
s: 秒(seconds)；
m: 分钟(minutes)；
h：小时(hours)；
d: 天(days)；
```

更多配置参考[配置文说明](http://www.ttlsa.com/linux/haproxy-study-tutorial/)

RabbitMQ负载均衡配置示例
```yml
#全局配置
global
    #日志输出配置，所有日志都记录在本机 ， 通过 localO 输出
    log 127.0.0.1 local0 info
    #最大连接数
    maxconn 4096
    #改变当前的工作目录
    chroot /opt/haproxy-1.7.8
    #以指定的 UID 运行 haproxy 进程
    uid 99
    #以指定的 GID 运行 haproxy 进程
    gid 99
    #以守护进程方式运行 haproxy #debug #quiet
    daemon
    #debug
    #当前进程 pid 文件
    pidfile /opt/haproxy-1.7.8/haproxy.pid

#默认配置
defaults
    #应用全局的日志配置
    log global
    #默认的模式 mode{tcplhttplhealth}
    #T CP 是 4 层， HTTP 是 7 层， health 只返回 OK
    mode tcp
    #日志类别 tcplog
    option tcplog
    #不记录健康检查日志信息
    option dontlognull
    #3 次失败则认为服务不可用
    retries 3
    #每个进程可用 的最大连接数
    maxconn 2000
    #连接超时
    timeout connect 55
    #客户端超时
    timeout client 1205
    #服务端超时
    timeout 5erver 1205
    
#绑定配置
1isten rabbitmq c1uster : 5671
    #配置 TCP 模式
    mode tcp
    #简单的轮询
    ba1ance roundrobin
    #RabbitMQ 集群节点配置
    server rmq_node1 192.168.0.2:5672 check inter 5000 rise 2 fa11 3 weight 1
    server rmq_node2 192.168.0.3:5672 check inter 5000 rise 2 fa11 3 weight 1
    server rmq_node3 192.168.0.4:5672 check inter 5000 rise 2 fa11 3 weight 1

#haproxy 监控页面地址
1isten monitor : 8100
    mode http
    option httplog
    stats enab1e
    stats uri /stats
    stats refresh 5s
```
```
(1) server <name> : 定义 RabbitMQ 服务的内部标识，注意这里的 "rmq_nodel "是指
包含有含义的字符串名称，不是指 RabbitMQ 的节点名称。
(2) <ip>:<port> : 定义 RabbitMQ 服务连接的 IP 地址和端口号。
(3) check inter <va1ue> : 定义每隔多少毫秒检查 RabbitMQ 服务是否可用。
(4) rise <value> : 定义 RabbitMQ 服务在发生故障之后，需要多少次健康检查才能被
再次确认可用。
(5) fall <value > : 定义需要经历多少次失败的健康检查之后 ， HAProxy 才会停止使用
此 RabbitMQ 服务。
(6) weight <value> : 定义当前 RabbitMQ 服务的权重。
```


#### 1.11.2.3. 使用Keepalived实现高可靠负载均衡
<a href="#menu" style="float:right">目录</a>

试想如果前面配置的HAProxy主机192.168.0.9突然岩机或者网卡失效，那么虽然RabbitMQ集群没有任何故障，但是对于外界的客户端来说所有的连接都会被断开，结果将是灾难性的。
确保负载均衡服务的可靠性同样显得十分重要。这里就需要引入Keepalived工具，它能够通过自身健康检查、资源接管功能做高可用(双机热备)，实现故障转移

Keepalived采用VRRP(VirtualRouterRedundancyProtocol，虚拟路由冗余协议)，以软件的形式实现服务的热备功能。通常情况下是将两台Linux服务器组成一个热备组(Master和Backup)，同一时间内热备组只有一台主服务器Master提供服务，同时Master会虚拟出一个公用的虚拟E地址，简称VIP。这个VIP只存在于Master上并对外提供服务。如果Keepalived检测到Master宿机或者服务故障，备份服务器Backup会自动接管VIP并成为Master，Keepalived将原Master从热备组中移除。当原Master恢复后，会自动加入到热备组，默认再抢占成为Master，起到故障转移的功能。

Keepalived工作在OSI模型中的第3层、第4层和第7层。
工作在第3层是指Keepalived会定期向热备组中的服务器发送一个ICMP数据包来判断某台服务器是否故障，如果故障则将这台服务器从热备组移除。
工作在第4层是指Keepalived以TCP端口的状态判断服务器是否故障，比如检测RabbitMQ的5672端口，如果故障则将这台服务器从热备组中移除。
工作在第7层是指Keepalived根据用户设定的策略(通常是一个自定义的检测脚本)判断服务器上的程序是否正常运行，如果故障将这台服务器从热备组移除。


#### 1.11.2.4. 使用Keepalived+LVS实现负载均衡
<a href="#menu" style="float:right">目录</a>



## 1.12. 源码说明

```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.rabbitmq.client;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.AMQP.Basic.RecoverOk;
import com.rabbitmq.client.AMQP.Exchange.BindOk;
import com.rabbitmq.client.AMQP.Exchange.DeclareOk;
import com.rabbitmq.client.AMQP.Exchange.DeleteOk;
import com.rabbitmq.client.AMQP.Exchange.UnbindOk;
import com.rabbitmq.client.AMQP.Queue.PurgeOk;
import com.rabbitmq.client.AMQP.Tx.CommitOk;
import com.rabbitmq.client.AMQP.Tx.RollbackOk;
import com.rabbitmq.client.AMQP.Tx.SelectOk;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;

public interface Channel extends ShutdownNotifier, AutoCloseable {
    int getChannelNumber();
    Connection getConnection();
    void close() throws IOException, TimeoutException;
    void close(int var1, String var2) throws IOException, TimeoutException;
    void abort() throws IOException;
    void abort(int var1, String var2) throws IOException;
    void addReturnListener(ReturnListener var1);
    ReturnListener addReturnListener(ReturnCallback var1);
    boolean removeReturnListener(ReturnListener var1);
    void clearReturnListeners();
    void addConfirmListener(ConfirmListener var1);
    ConfirmListener addConfirmListener(ConfirmCallback var1, ConfirmCallback var2);
    boolean removeConfirmListener(ConfirmListener var1);
    void clearConfirmListeners();
    Consumer getDefaultConsumer();
    void setDefaultConsumer(Consumer var1);
    void basicQos(int var1, int var2, boolean var3) throws IOException;
    void basicQos(int var1, boolean var2) throws IOException;
    void basicQos(int var1) throws IOException;
    void basicPublish(String var1, String var2, BasicProperties var3, byte[] var4) throws IOException;
    void basicPublish(String var1, String var2, boolean var3, BasicProperties var4, byte[] var5) throws IOException;
    void basicPublish(String var1, String var2, boolean var3, boolean var4, BasicProperties var5, byte[] var6) throws IOException;
    DeclareOk exchangeDeclare(String var1, String var2) throws IOException;
    DeclareOk exchangeDeclare(String var1, BuiltinExchangeType var2) throws IOException;
    DeclareOk exchangeDeclare(String var1, String var2, boolean var3) throws IOException;
    DeclareOk exchangeDeclare(String var1, BuiltinExchangeType var2, boolean var3) throws IOException;
    DeclareOk exchangeDeclare(String var1, String var2, boolean var3, boolean var4, Map<String, Object> var5) throws IOException;
    DeclareOk exchangeDeclare(String var1, BuiltinExchangeType var2, boolean var3, boolean var4, Map<String, Object> var5) throws IOException;
    DeclareOk exchangeDeclare(String var1, String var2, boolean var3, boolean var4, boolean var5, Map<String, Object> var6) throws IOException;
    DeclareOk exchangeDeclare(String var1, BuiltinExchangeType var2, boolean var3, boolean var4, boolean var5, Map<String, Object> var6) throws IOException;
    void exchangeDeclareNoWait(String var1, String var2, boolean var3, boolean var4, boolean var5, Map<String, Object> var6) throws IOException;
    void exchangeDeclareNoWait(String var1, BuiltinExchangeType var2, boolean var3, boolean var4, boolean var5, Map<String, Object> var6) throws IOException;
    DeclareOk exchangeDeclarePassive(String var1) throws IOException;
    DeleteOk exchangeDelete(String var1, boolean var2) throws IOException;
    void exchangeDeleteNoWait(String var1, boolean var2) throws IOException;
    DeleteOk exchangeDelete(String var1) throws IOException;
    BindOk exchangeBind(String var1, String var2, String var3) throws IOException;
    BindOk exchangeBind(String var1, String var2, String var3, Map<String, Object> var4) throws IOException;
    void exchangeBindNoWait(String var1, String var2, String var3, Map<String, Object> var4) throws IOException;
    UnbindOk exchangeUnbind(String var1, String var2, String var3) throws IOException;
    UnbindOk exchangeUnbind(String var1, String var2, String var3, Map<String, Object> var4) throws IOException;
    void exchangeUnbindNoWait(String var1, String var2, String var3, Map<String, Object> var4) throws IOException;
    com.rabbitmq.client.AMQP.Queue.DeclareOk queueDeclare() throws IOException;
    com.rabbitmq.client.AMQP.Queue.DeclareOk queueDeclare(String var1, boolean var2, boolean var3, boolean var4, Map<String, Object> var5) throws IOException;
    void queueDeclareNoWait(String var1, boolean var2, boolean var3, boolean var4, Map<String, Object> var5) throws IOException;
    com.rabbitmq.client.AMQP.Queue.DeclareOk queueDeclarePassive(String var1) throws IOException;
    com.rabbitmq.client.AMQP.Queue.DeleteOk queueDelete(String var1) throws IOException;
    com.rabbitmq.client.AMQP.Queue.DeleteOk queueDelete(String var1, boolean var2, boolean var3) throws IOException;
    void queueDeleteNoWait(String var1, boolean var2, boolean var3) throws IOException;
    com.rabbitmq.client.AMQP.Queue.BindOk queueBind(String var1, String var2, String var3) throws IOException;
    com.rabbitmq.client.AMQP.Queue.BindOk queueBind(String var1, String var2, String var3, Map<String, Object> var4) throws IOException;
    void queueBindNoWait(String var1, String var2, String var3, Map<String, Object> var4) throws IOException;
    com.rabbitmq.client.AMQP.Queue.UnbindOk queueUnbind(String var1, String var2, String var3) throws IOException;    com.rabbitmq.client.AMQP.Queue.UnbindOk queueUnbind(String var1, String var2, String var3, Map<String, Object> var4) throws IOException;
    PurgeOk queuePurge(String var1) throws IOException;
    GetResponse basicGet(String var1, boolean var2) throws IOException;
    void basicAck(long var1, boolean var3) throws IOException;
    void basicNack(long var1, boolean var3, boolean var4) throws IOException;
    void basicReject(long var1, boolean var3) throws IOException;
    String basicConsume(String var1, Consumer var2) throws IOException;
    String basicConsume(String var1, DeliverCallback var2, CancelCallback var3) throws IOException;
    String basicConsume(String var1, DeliverCallback var2, ConsumerShutdownSignalCallback var3) throws IOException;
    String basicConsume(String var1, DeliverCallback var2, CancelCallback var3, ConsumerShutdownSignalCallback var4) throws IOException;
    String basicConsume(String var1, boolean var2, Consumer var3) throws IOException;
    String basicConsume(String var1, boolean var2, DeliverCallback var3, CancelCallback var4) throws IOException;
    String basicConsume(String var1, boolean var2, DeliverCallback var3, ConsumerShutdownSignalCallback var4) throws IOException;
    String basicConsume(String var1, boolean var2, DeliverCallback var3, CancelCallback var4, ConsumerShutdownSignalCallback var5) throws OException;
    String basicConsume(String var1, boolean var2, Map<String, Object> var3, Consumer var4) throws IOException;
    String basicConsume(String var1, boolean var2, Map<String, Object> var3, DeliverCallback var4, CancelCallback var5) throws IOException;
    String basicConsume(String var1, boolean var2, Map<String, Object> var3, DeliverCallback var4, ConsumerShutdownSignalCallback var5) throws OException;
    String basicConsume(String var1, boolean var2, Map<String, Object> var3, DeliverCallback var4, CancelCallback var5, ConsumerShutdownSignalCallback var6) throws IOException;
    String basicConsume(String var1, boolean var2, String var3, Consumer var4) throws IOException;
    String basicConsume(String var1, boolean var2, String var3, DeliverCallback var4, CancelCallback var5) throws IOException;
    String basicConsume(String var1, boolean var2, String var3, DeliverCallback var4, ConsumerShutdownSignalCallback var5) throws IOException;
    String basicConsume(String var1, boolean var2, String var3, DeliverCallback var4, CancelCallback var5, ConsumerShutdownSignalCallback var6) throws IOException;
    String basicConsume(String var1, boolean var2, String var3, boolean var4, boolean var5, Map<String, Object> var6, Consumer var7) throws IOException;
    String basicConsume(String var1, boolean var2, String var3, boolean var4, boolean var5, Map<String, Object> var6, DeliverCallback var7, CancelCallback var8) throws IOException;
    String basicConsume(String var1, boolean var2, String var3, boolean var4, boolean var5, Map<String, Object> var6, DeliverCallback var7, ConsumerShutdownSignalCallback var8) throws IOException;
    String basicConsume(String var1, boolean var2, String var3, boolean var4, boolean var5, Map<String, Object> var6, DeliverCallback var7, CancelCallback var8, ConsumerShutdownSignalCallback var9) throws IOException;
    void basicCancel(String var1) throws IOException;
    RecoverOk basicRecover() throws IOException;
    RecoverOk basicRecover(boolean var1) throws IOException;
    SelectOk txSelect() throws IOException;
    CommitOk txCommit() throws IOException;
    RollbackOk txRollback() throws IOException;
    com.rabbitmq.client.AMQP.Confirm.SelectOk confirmSelect() throws IOException;
    long getNextPublishSeqNo();
    boolean waitForConfirms() throws InterruptedException;
    boolean waitForConfirms(long var1) throws InterruptedException, TimeoutException;
    void waitForConfirmsOrDie() throws IOException, InterruptedException;
    void waitForConfirmsOrDie(long var1) throws IOException, InterruptedException, TimeoutException;
    void asyncRpc(Method var1) throws IOException;
    Command rpc(Method var1) throws IOException;
    long messageCount(String var1) throws IOException;
    long consumerCount(String var1) throws IOException;
    CompletableFuture<Command> asyncCompletableRpc(Method var1) throws IOException;
}

```
## 1.13. 面试总结
