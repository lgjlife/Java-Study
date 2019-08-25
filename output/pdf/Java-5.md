
<span id="menu"></span>


<!-- TOC -->

- [1. FastDfs](#1-fastdfs)
    - [1.1. 为什么要使用分布式文件系统](#11-为什么要使用分布式文件系统)
        - [1.1.1. 单机时代](#111-单机时代)
        - [1.1.2. 独立文件服务器](#112-独立文件服务器)
        - [1.1.3. 分布式文件系统](#113-分布式文件系统)
    - [1.2. 基本概念](#12-基本概念)
        - [1.2.1. 什么是FastDFS](#121-什么是fastdfs)
    - [1.3. 工作流程](#13-工作流程)
        - [1.3.1. 文件上传](#131-文件上传)
        - [1.3.2. 文件下载](#132-文件下载)
    - [1.4. FastDFS为什么要结合Nginx](#14-fastdfs为什么要结合nginx)
    - [1.5. 配置文件说明](#15-配置文件说明)
    - [1.6. FastDFS 同步机制说明：](#16-fastdfs-同步机制说明)
    - [1.7. 安装配置](#17-安装配置)
    - [1.8. Java客户端使用](#18-java客户端使用)
- [2. 性能调优](#2-性能调优)
    - [2.1. 性能调优概述](#21-性能调优概述)
    - [2.2. 操作系统性能监控](#22-操作系统性能监控)
    - [2.3. IDEA安装hsdis查看JIT编译的汇编代码](#23-idea安装hsdis查看jit编译的汇编代码)
    - [2.4. 使用JMH做Benchmark基准测试](#24-使用jmh做benchmark基准测试)
    - [2.5. JVM](#25-jvm)
        - [2.5.1. JIT编译器](#251-jit编译器)
            - [2.5.1.1. 概述](#2511-概述)
        - [2.5.2. JVM内存模型](#252-jvm内存模型)
        - [2.5.3. JVM的内存空间](#253-jvm的内存空间)
            - [2.5.3.1. 对象内存布局](#2531-对象内存布局)
            - [2.5.3.2. 对象访问定位](#2532-对象访问定位)
        - [2.5.4. 垃圾回收算法](#254-垃圾回收算法)
            - [2.5.4.1. 对象回收判定](#2541-对象回收判定)
            - [2.5.4.2. 对象引用分类](#2542-对象引用分类)
            - [2.5.4.3. 标记清除算法](#2543-标记清除算法)
            - [2.5.4.4. 复制算法](#2544-复制算法)
            - [2.5.4.5. 标记整理算法](#2545-标记整理算法)
            - [2.5.4.6. 分代收集算法](#2546-分代收集算法)
        - [2.5.5. 垃圾收集器](#255-垃圾收集器)
            - [2.5.5.1. Serial收集器](#2551-serial收集器)
            - [2.5.5.2. ParNew收集器](#2552-parnew收集器)
            - [2.5.5.3. Parallel Scavenge收集器](#2553-parallel-scavenge收集器)
            - [2.5.5.4. Serial Old收集器](#2554-serial-old收集器)
            - [2.5.5.5. Parallel Old收集器](#2555-parallel-old收集器)
            - [2.5.5.6. CMS收集器](#2556-cms收集器)
            - [2.5.5.7. G1收集器](#2557-g1收集器)
        - [2.5.6. 内存分配和回收策略](#256-内存分配和回收策略)
        - [2.5.7. JVM相关参数介绍](#257-jvm相关参数介绍)
        - [2.5.8. 性能监控与故障处理工具](#258-性能监控与故障处理工具)
            - [2.5.8.1. JDK命令行工具](#2581-jdk命令行工具)
            - [2.5.8.2. Jdk可视化工具](#2582-jdk可视化工具)
        - [2.5.9. JVM性能调优](#259-jvm性能调优)
        - [2.5.10. 类文件结构](#2510-类文件结构)
        - [2.5.11. 类加载器](#2511-类加载器)
- [3. Elasticsearch搜索引擎](#3-elasticsearch搜索引擎)
    - [3.1. 基本概念](#31-基本概念)
    - [3.2. Elasticsearch工作流程](#32-elasticsearch工作流程)
        - [3.2.1. 启动过程](#321-启动过程)
        - [3.2.2. 故障检测](#322-故障检测)
        - [3.2.3. 与El通信](#323-与el通信)
            - [3.2.3.1. 索引数据](#3231-索引数据)
            - [3.2.3.2. 查询数据](#3232-查询数据)
    - [3.3. 安装与配置](#33-安装与配置)
        - [3.3.1. 配置文件说明](#331-配置文件说明)
            - [3.3.1.1. elasticsearch.yml](#3311-elasticsearchyml)
    - [3.4. 索引](#34-索引)
        - [3.4.1. 索引](#341-索引)
        - [3.4.2. 映射配置](#342-映射配置)
    - [3.5. 集群管理](#35-集群管理)
        - [3.5.1. 集群健康](#351-集群健康)
        - [3.5.2. 添加索引](#352-添加索引)
    - [3.6. 数据](#36-数据)
        - [3.6.1. 文档](#361-文档)
        - [3.6.2. 处理冲突](#362-处理冲突)
    - [3.7. 分布式增删改查](#37-分布式增删改查)
        - [3.7.1. 路由文档到分片](#371-路由文档到分片)
        - [3.7.2. 分片交互](#372-分片交互)
            - [3.7.2.1. 新建，索引和删除文档](#3721-新建索引和删除文档)
            - [3.7.2.2. 索引文档](#3722-索引文档)
    - [3.8. 面试小结之Elasticsearch篇](#38-面试小结之elasticsearch篇)

<!-- /TOC -->


<a id="markdown-1-fastdfs" name="1-fastdfs"></a>
# 1. FastDfs

<a href="#menu" style="float:right">目录</a>

<a id="markdown-11-为什么要使用分布式文件系统" name="11-为什么要使用分布式文件系统"></a>
## 1.1. 为什么要使用分布式文件系统
<a href="#menu" style="float:right">目录</a>

<a id="markdown-111-单机时代" name="111-单机时代"></a>
### 1.1.1. 单机时代
初创时期由于时间紧迫，在各种资源有限的情况下，通常就直接在项目目录下建立静态文件夹，用于用户存放项目中的文件资源。如果按不同类型再细分，可以在项目目录下再建立不同的子目录来区分。例如：resources\static\file、resources\static\img等。

* 优点
    * 这样做比较便利，项目直接引用就行，实现起来也简单，无需任何复杂技术，保存数据库记录和访问起来也很方便。
* 缺点
    * 如果只是后台系统的使用一般也不会有什么问题，但是作为一个前端网站使用的话就会存在弊端。一方面，文件和代码耦合在一起，文件越多存放越混乱；另一方面，如果流量比较大，静态文件访问会占据一定的资源，影响正常业务进行，不利于网站快速发展。

<a id="markdown-112-独立文件服务器" name="112-独立文件服务器"></a>
### 1.1.2. 独立文件服务器
随着公司业务不断发展，将代码和文件放在同一服务器的弊端就会越来越明显。为了解决上面的问题引入独立图片服务器，工作流程如下：项目上传文件时，首先通过ftp或者ssh将文件上传到图片服务器的某个目录下，再通过ngnix或者apache来访问此目录下的文件，返回一个独立域名的图片URL地址，前端使用文件时就通过这个URL地址读取。

* 优点
    * 图片访问是很消耗服务器资源的（因为会涉及到操作系统的上下文切换和磁盘I/O操作），分离出来后，Web/App服务器可以更专注发挥动态处理的能力；独立存储，更方便做扩容、容灾和数据迁移；方便做图片访问请求的负载均衡，方便应用各种缓存策略（HTTP Header、Proxy Cache等），也更加方便迁移到CDN。
* 缺点
    * 单机存在性能瓶颈，容灾、垂直扩展性稍差

<a id="markdown-113-分布式文件系统" name="113-分布式文件系统"></a>
### 1.1.3. 分布式文件系统
通过独立文件服务器可以解决一些问题，如果某天存储文件的那台服务突然down了怎么办？可能你会说，定时将文件系统备份，这台down机的时候，迅速切换到另一台就OK了，但是这样处理需要人工来干预。另外，当存储的文件超过100T的时候怎么办？单台服务器的性能问题？这个时候我们就应该考虑分布式文件系统了。

业务继续发展，单台服务器存储和响应也很快到达了瓶颈，新的业务需要文件访问具有高响应性、高可用性来支持系统。分布式文件系统，一般分为三块内容来配合，服务的存储、访问的仲裁系统，文件存储系统，文件的容灾系统来构成，仲裁系统相当于文件服务器的大脑，根据一定的算法来决定文件存储的位置，文件存储系统负责保存文件，容灾系统负责文件系统和自己的相互备份。

* 优点
    * 扩展能力: 毫无疑问，扩展能力是一个分布式文件系统最重要的特点；高可用性: 在分布式文件系统中，高可用性包含两层，一是整个文件系统的可用性，二是数据的完整和一致性；弹性存储: 可以根据业务需要灵活地增加或缩减数据存储以及增删存储池中的资源，而不需要中断系统运行
* 缺点
    系统复杂度稍高，需要更多服务器







<a id="markdown-12-基本概念" name="12-基本概念"></a>
## 1.2. 基本概念
<a href="#menu" style="float:right">目录</a>

<a id="markdown-121-什么是fastdfs" name="121-什么是fastdfs"></a>
### 1.2.1. 什么是FastDFS
FastDFS是一个开源的轻量级分布式文件系统。它解决了大数据量存储和负载均衡等问题。特别适合以中小文件（建议范围：4KB < file_size <500MB）为载体的在线服务，如相册网站、视频网站等等。在UC基于FastDFS开发向用户提供了：网盘，社区，广告和应用下载等业务的存储服务。

FastDFS是一款开源的轻量级分布式文件系统纯C实现，支持Linux、FreeBSD等UNIX系统类google FS，不是通用的文件系统，只能通过专有API访问，目前提供了C、Java和PHP API为互联网应用量身定做，解决大容量文件存储问题，追求高性能和高扩展性FastDFS可以看做是基于文件的key value pair存储系统，称作分布式文件存储服务更为合适。

* FastDFS特性：
    * 文件不分块存储，上传的文件和OS文件系统中的文件一一对应
    * 支持相同内容的文件只保存一份，节约磁盘空间
    * 下载文件支持HTTP协议，可以使用内置Web Server，也可以和其他Web Server配合使用
    * 支持在线扩容
    * 支持主从文件
    * 存储服务器上可以保存文件属性（meta-data）V2.0网络通信采用libevent，支持大并发访问，整体性能更好

存储节点采用了分组（group）的方式。存储系统由一个或多个group组成，group与group之间的文件是相互独立的，所有group的文件容量累加就是整个存储系统中的文件容量。一个group可以由一台或多台存储服务器组成，一个group下的存储服务器中的文件都是相同的，group中的多台存储服务器起到了冗余备份和负载均衡的作用（一个组的存储容量为该组内存储服务器容量最小的那个，不同组的Storage server之间不会相互通信，同组内的Storage server之间会相互连接进行文件同步）。

在group中增加服务器时，同步已有的文件由系统自动完成，同步完成后，系统自动将新增服务器切换到线上提供服务。

当存储空间不足或即将耗尽时，可以动态添加group。只需要增加一台或多台服务器，并将它们配置为一个新的group，这样就扩大了存储系统的容量。

FastDFS只有两个角色：Tracker server和Storage server。Tracker server作为中心结点，其主要作用是负载均衡和调度。Tracker server在内存中记录分组和Storage server的状态等信息，不记录文件索引信息，占用的内存量很少。另外，客户端（应用）和Storage server访问Tracker server时，Tracker server扫描内存中的分组和Storage server信息，然后给出应答。由此可以看出Tracker server非常轻量化，不会成为系统瓶颈。

FastDFS中的Storage server在其他文件系统中通常称作Trunk server或Data server。Storage server直接利用OS的文件系统存储文件。FastDFS不会对文件进行分块存储，客户端上传的文件和Storage server上的文件一一对应（FastDFS中的文件标识分为两个部分：组名和文件名，二者缺一不可）


* FastDFS是一个轻量级分布式文件系统。能够对文件进行管理，功能包括：文件存储、文件同步、文件访问（文件上传、文件下载）等。

![网络拓扑图](http://www.ityouknow.com/assets/images/2018/fastdfs/fastdfs_arch.png)

* client
    * 客户端
* tracker
    * 调度服务器,负载均衡和调度，管理所有的卷[volume]包括其中的storage server
    * 每个storage在启动后会连接Tracker，告知自己所属的group等信息，并保持周期性的心跳，tracker根据storage的心跳信息，建立group==>[storage server list]的映射表。
    * Tracker的集群中所有的tracker是平等的，客户端请求tracker server采用轮询的方法，如果请求的tracker不能提供服务就换另一个tracker。
* storage
    * 存储服务器,主要作用是文件存储
    * 如上图，storage做集群时，以组[group]为单位（也可以将一个组看成一个卷[volume]，不同材料称呼不同。集群的总容量为所有组的总和。
    * 一个卷内storage server之间相互通信，文件进行同步，保证组内storage完全一致，所以一个卷的容量以最小的服务器为准。不同的卷之间相互不通信。
    * 当某个卷的压力较大时可以添加storage server（纵向扩展），如果系统容量不够可以添加卷（横向扩展）。

**Storage server**

存储服务器（又称：存储节点或数据服务器），文件和文件属性（meta data）都保存到存储服务器上。Storage server直接利用OS的文件系统调用管理文件。

Storage server（后简称storage）以组（卷，group或volume）为单位组织，一个group内包含多台storage机器，数据互为备份，存储空间以group内容量最小的storage为准，所以建议group内的多个storage尽量配置相同，以免造成存储空间的浪费。

以group为单位组织存储能方便的进行应用隔离、负载均衡、副本数定制（group内storage server数量即为该group的副本数），比如将不同应用数据存到不同的group就能隔离应用数据，同时还可根据应用的访问特性来将应用分配到不同的group来做负载均衡；缺点是group的容量受单机存储容量的限制，同时当group内有机器坏掉时，数据恢复只能依赖group内地其他机器，使得恢复时间会很长。

group内每个storage的存储依赖于本地文件系统，storage可配置多个数据存储目录，比如有10块磁盘，分别挂载在/data/disk1-/data/disk10，则可将这10个目录都配置为storage的数据存储目录。

storage接受到写文件请求时，会根据配置好的规则（后面会介绍），选择其中一个存储目录来存储文件。为了避免单个目录下的文件数太多，在storage第一次启动时，会在每个数据存储目录里创建2级子目录，每级256个，总共65536个文件，新写的文件会以hash的方式被路由到其中某个子目录下，然后将文件数据直接作为一个本地文件存储到该目录中。

**Tracker server**
和数据服务器交互的枢纽。相比GFS中的master更为精简，不记录文件索引信息，占用的内存量很少。

Tracker是FastDFS的协调者，负责管理所有的storage server和group，每个storage在启动后会连接Tracker，告知自己所属的group等信息，并保持周期性的心跳，tracker根据storage的心跳信息，建立group==>[storage server list]的映射表。

Tracker需要管理的元信息很少，会全部存储在内存中；另外tracker上的元信息都是由storage汇报的信息生成的，本身不需要持久化任何数据，这样使得tracker非常容易扩展，直接增加tracker机器即可扩展为tracker cluster来服务，cluster里每个tracker之间是完全对等的，所有的tracker都接受stroage的心跳信息，生成元数据信息来提供读写服务。

**client**
客户端，作为业务请求的发起方，通过专有接口，使用TCP/IP协议与跟踪器服务器或存储节点进行数据交互。FastDFS向使用者提供基本文件访问接口，比如upload、download、append、delete等，以客户端库的方式提供给用户使用。

**group**
组， 也可称为卷。 同组内服务器上的文件是完全相同的 ，同一组内的storage server之间是对等的， 文件上传、 删除等操作可以在任意一台storage server上进行 。

**meta data**
文件相关属性，键值对（ Key Value Pair） 方式，如：width=1024,heigth=768 。



<a id="markdown-13-工作流程" name="13-工作流程"></a>
## 1.3. 工作流程
<a href="#menu" style="float:right">目录</a>

<a id="markdown-131-文件上传" name="131-文件上传"></a>
### 1.3.1. 文件上传
<a href="#menu" style="float:right">目录</a>

首先客户端请求Tracker服务获取到存储服务器的ip地址和端口，然后客户端根据返回的IP地址和端口号请求上传文件，存储服务器接收到请求后生产文件，并且将文件内容写入磁盘并返回给客户端file_id、路径信息、文件名等信息，客户端保存相关信息上传完毕。

![文件上传示意图](https://img-blog.csdn.net/20161225092626091?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXhmbG92ZWdzMjAxMg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

**选择tracker server**
当集群中不止一个tracker server时，由于tracker之间是完全对等的关系，客户端在upload文件时可以任意选择一个trakcer。
选择存储的group
当tracker接收到upload file的请求时，会为该文件分配一个可以存储该文件的group，支持如下选择group的规则：
* Round robin，所有的group间轮询
* Specified group，指定某一个确定的group
* Load balance，剩余存储空间多多group优先

**选择storage server**
当选定group后，tracker会在group内选择一个storage server给客户端，支持如下选择storage的规则：
* Round robin，在group内的所有storage间轮询
* First server ordered by ip，按ip排序
* First server ordered by priority，按优先级排序（优先级在storage上配置）

**选择storage path**
当分配好storage server后，客户端将向storage发送写文件请求，storage将会为文件分配一个数据存储目录，支持如下规则：
* Round robin，多个存储目录间轮询
* 剩余存储空间最多的优先

**生成Fileid**
选定存储目录之后，storage会为文件生一个Fileid，由storage server ip、文件创建时间、文件大小、文件crc32和一个随机数拼接而成，然后将这个二进制串进行base64编码，转换为可打印的字符串。
选择两级目录
当选定存储目录之后，storage会为文件分配一个fileid，每个存储目录下有两级256*256的子目录，storage会按文件fileid进行两次hash（猜测），路由到其中一个子目录，然后将文件以fileid为文件名存储到该子目录下。

**生成文件名**
当文件存储到某个子目录后，即认为该文件存储成功，接下来会为该文件生成一个文件名，文件名由group、存储目录、两级子目录、fileid、文件后缀名（由客户端指定，主要用于区分文件类型）拼接而成。



**文件索引FID**
![文件路径名称](https://img-blog.csdn.net/20161225092446927?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXhmbG92ZWdzMjAxMg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)
* 组名
    * 文件上传后所在的存储组名称，在文件上传成功后有存储服务器返回，需要客户端自行保存。
* 虚拟磁盘路径
    * 存储服务器配置的虚拟路径，与磁盘选项store_path*对应。
* 数据两级目录
    * 存储服务器在每个虚拟磁盘路径下创建的两级目录，用于存储数据文件。
* 文件名
    * 与文件上传时不同。是由存储服务器根据特定信息生成，文件名包含：源存储服务器IP地址、文件创建时间戳、文件大小、随机数和文件拓展名等信息。

**文件快速定位**
![快速定位文件](http://www.ityouknow.com/assets/images/2018/fastdfs/find.jpg)
知道FastDFS FID的组成后，我们来看看FastDFS是如何通过这个精巧的FID定位到需要访问的文件。
1、通过组名tracker能够很快的定位到客户端需要访问的存储服务器组，并将选择合适的存储服务器提供客户端访问；
2、存储服务器根据“文件存储虚拟磁盘路径”和“数据文件两级目录”可以很快定位到文件所在目录，并根据文件名找到客户端需要访问的文件






<a id="markdown-132-文件下载" name="132-文件下载"></a>
### 1.3.2. 文件下载
<a href="#menu" style="float:right">目录</a>
客户端带上文件名信息请求Tracker服务获取到存储服务器的ip地址和端口，然后客户端根据返回的IP地址和端口号请求下载文件，存储服务器接收到请求后返回文件给客户端。
![文件下载](https://img-blog.csdn.net/20161225092601950?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXhmbG92ZWdzMjAxMg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

* 选择tracker server：和upload file一样，在download file时随机选择tracker server。
* 选择group：tracker发送download请求给某个tracker，必须带上文件名信息，tracke从文件名中解析出文件的group、大小、创建时间等信息，根据group信息选择对应的group
* 选择storage server：从group中选择一个storage用来服务读请求。由于group内的文件同步时在后台异步进行的，所以有可能出现在读到时候，文件还没有同步到某些storage server上，为了尽量避免访问到这样的storage，tracker按照一定的规则选择group内可读的storage。

客户端upload file成功后，会拿到一个storage生成的文件名，接下来客户端根据这个文件名即可访问到该文件。
跟upload file一样，在download file时客户端可以选择任意tracker server。
tracker发送download请求给某个tracker，必须带上文件名信息，tracke从文件名中解析出文件的group、大小、创建时间等信息，然后为该请求选择一个storage用来服务读请求。由于group内的文件同步时在后台异步进行的，所以有可能出现在读到时候，文件还没有同步到某些storage server上，为了尽量避免访问到这样的storage，tracker按照如下规则选择group内可读的storage。

该文件上传到的源头storage -源头storage只要存活着，肯定包含这个文件，源头的地址被编码在文件名中。
文件创建时间戳==storage被同步到的时间戳且(当前时间-文件创建时间戳)>文件同步最大时间（如5分钟)-文件创建后，
认为经过最大同步时间后，肯定已经同步到其他storage了。
文件创建时间戳< storage被同步到的时间戳。-同步时间戳之前的文件确定已经同步了
4.(当前时间-文件创建时间戳)>同步延迟阀值（如一天）。-经过同步延迟阈值时间，认为文件肯定已经同步了。



<a id="markdown-14-fastdfs为什么要结合nginx" name="14-fastdfs为什么要结合nginx"></a>
## 1.4. FastDFS为什么要结合Nginx
<a href="#menu" style="float:right">目录</a>

我们在使用FastDFS部署一个分布式文件系统的时候，通过FastDFS的客户端API来进行文件的上传、下载、删除等操作。同时通过FastDFS的HTTP服务器来提供HTTP服务。但是FastDFS的HTTP服务较为简单，无法提供负载均衡等高性能的服务，所以FastDFS的开发者——淘宝的架构师余庆同学，为我们提供了Nginx上使用的FastDFS模块（也可以叫FastDFS的Nginx模块）。其使用非常简单。

FastDFS通过Tracker服务器,将文件放在Storage服务器存储,但是同组之间的服务器需要复制文件,有延迟的问题.假设Tracker服务器将文件上传到了192.168.1.80,文件ID已经返回客户端,这时,后台会将这个文件复制到192.168.1.30,如果复制没有完成,客户端就用这个ID在192.168.1.30取文件,肯定会出现错误。这个fastdfs-nginx-module可以重定向连接到源服务器取文件,避免客户端由于复制延迟的问题,出现错误.

<a id="markdown-15-配置文件说明" name="15-配置文件说明"></a>
## 1.5. 配置文件说明
<a href="#menu" style="float:right">目录</a>

**track.conf**

```
 # is this config file disabled
 # false for enabled
 # true for disabled
 disabled=false
 # 这个配置文件是否不生效,呵呵(改成是否生效是不是会让人感觉好点呢?) false 为生效(否则不生效) true反之

# bind an address of this host
 # empty for bind all addresses of this host
 bind_addr=
 # 是否绑定IP,
 # bind_addr= 后面为绑定的IP地址 (常用于服务器有多个IP但只希望一个IP提供服务)。如果不填则表示所有的(一般不填就OK),相信较熟练的SA都常用到类似功能,很多系统和应用都有

# the tracker server port
 port=22122
 # 提供服务的端口,不作过多解释了

# connect timeout in seconds
 # default value is 30s
 connect_timeout=30
 #连接超时时间，针对socket套接字函数connect

 # network timeout in seconds
 network_timeout=60
 #  tracker server的网络超时，单位为秒。发送或接收数据时，如果在超时时间后还不能发送或接收数据，则本次网络通信失败。

# the base path to store data and log files
 base_path=/home/yuqing/fastdfs
 # base_path 目录地址(根目录必须存在,子目录会自动创建)
 # 附目录说明: 
  tracker server目录及文件结构：
  ${base_path}
    |__data
    |    |__storage_groups.dat：存储分组信息
    |    |__storage_servers.dat：存储服务器列表
    |__logs
          |__trackerd.log：tracker server日志文件

 数据文件storage_groups.dat和storage_servers.dat中的记录之间以换行符（\n）分隔，字段之间以西文逗号（,）分隔。
storage_groups.dat中的字段依次为：
  1. group_name：组名
  2. storage_port：storage server端口号

storage_servers.dat中记录storage server相关信息，字段依次为：
  1. group_name：所属组名
  2. ip_addr：ip地址
  3. status：状态
  4. sync_src_ip_addr：向该storage server同步已有数据文件的源服务器
  5. sync_until_timestamp：同步已有数据文件的截至时间（UNIX时间戳）
  6. stat.total_upload_count：上传文件次数
  7. stat.success_upload_count：成功上传文件次数
  8. stat.total_set_meta_count：更改meta data次数
  9. stat.success_set_meta_count：成功更改meta data次数
  10. stat.total_delete_count：删除文件次数
  11. stat.success_delete_count：成功删除文件次数
  12. stat.total_download_count：下载文件次数
  13. stat.success_download_count：成功下载文件次数
  14. stat.total_get_meta_count：获取meta data次数
  15. stat.success_get_meta_count：成功获取meta data次数
  16. stat.last_source_update：最近一次源头更新时间（更新操作来自客户端）
  17. stat.last_sync_update：最近一次同步更新时间（更新操作来自其他storage server的同步）

# max concurrent connections this server supported
 # max_connections worker threads start when this service startup
 max_connections=256
 # 系统提供服务时的最大连接数。对于V1.x，因一个连接由一个线程服务，也就是工作线程数。
# 对于V2.x，最大连接数和工作线程数没有任何关系

# work thread count, should <= max_connections
 # default value is 4
 # since V2.00
 # V2.0引入的这个参数，工作线程数，通常设置为CPU数
work_threads=4

 # the method of selecting group to upload files
 # 0: round robin
 # 1: specify group
 # 2: load balance, select the max free space group to upload file
 store_lookup=2
 # 上传组(卷) 的方式 0:轮询方式 1: 指定组 2: 平衡负载(选择最大剩余空间的组(卷)上传)
 # 这里如果在应用层指定了上传到一个固定组,那么这个参数被绕过

# which group to upload file
 # when store_lookup set to 1, must set store_group to the group name
 store_group=group2
 # 当上一个参数设定为1 时 (store_lookup=1，即指定组名时)，必须设置本参数为系统中存在的一个组名。如果选择其他的上传方式，这个参数就没有效了。

# which storage server to upload file
 # 0: round robin (default)
 # 1: the first server order by ip address
 # 2: the first server order by priority (the minimal)
 store_server=0
 # 选择哪个storage server 进行上传操作(一个文件被上传后，这个storage server就相当于这个文件的storage server源，会对同组的storage server推送这个文件达到同步效果)
 # 0: 轮询方式 
 # 1: 根据ip 地址进行排序选择第一个服务器（IP地址最小者）
# 2: 根据优先级进行排序（上传优先级由storage server来设置，参数名为upload_priority）

# which path(means disk or mount point) of the storage server to upload file
 # 0: round robin
 # 2: load balance, select the max free space path to upload file
 store_path=0
 # 选择storage server 中的哪个目录进行上传。storage server可以有多个存放文件的base path（可以理解为多个磁盘）。
# 0: 轮流方式，多个目录依次存放文件
# 2: 选择剩余空间最大的目录存放文件（注意：剩余磁盘空间是动态的，因此存储到的目录或磁盘可能也是变化的）

# which storage server to download file
 # 0: round robin (default)
 # 1: the source storage server which the current file uploaded to
 download_server=0
 # 选择哪个 storage server 作为下载服务器 
# 0: 轮询方式，可以下载当前文件的任一storage server
 # 1: 哪个为源storage server 就用哪一个 (前面说过了这个storage server源 是怎样产生的) 就是之前上传到哪个storage server服务器就是哪个了

# reserved storage space for system or other applications.
 # if the free(available) space of any stoarge server in
 # a group <= reserved_storage_space,
 # no file can be uploaded to this group.
 # bytes unit can be one of follows:
 ### G or g for gigabyte(GB)
 ### M or m for megabyte(MB)
 ### K or k for kilobyte(KB)
 ### no unit for byte(B)
 ### XX.XX% as ratio such as reserved_storage_space = 10%
 reserved_storage_space = 10%
 # storage server 上保留的空间，保证系统或其他应用需求空间。可以用绝对值或者百分比（V4开始支持百分比方式）。
#(指出 如果同组的服务器的硬盘大小一样,以最小的为准,也就是只要同组中有一台服务器达到这个标准了,这个标准就生效,原因就是因为他们进行备份)

 #standard log level as syslog, case insensitive, value list:
 ### emerg for emergency
 ### alert
 ### crit for critical
 ### error
 ### warn for warning
 ### notice
 ### info
 ### debug
 log_level=info
 # 选择日志级别(日志写在哪?看前面的说明了,有目录介绍哦 呵呵)

 #unix group name to run this program, 
 #not set (empty) means run by the group of current user
 run_by_group=
 # 操作系统运行FastDFS的用户组 (不填 就是当前用户组,哪个启动进程就是哪个)

 #unix username to run this program,
 #not set (empty) means run by current user
 run_by_user=
 # 操作系统运行FastDFS的用户 (不填 就是当前用户,哪个启动进程就是哪个)

 # allow_hosts can ocur more than once, host can be hostname or ip address,
 # "*" means match all ip addresses, can use range like this: 10.0.1.[1-15,20] or
 # host[01-08,20-25].domain.com, for example:
 # allow_hosts=10.0.1.[1-15,20]
 # allow_hosts=host[01-08,20-25].domain.com
 allow_hosts=*
 # 可以连接到此 tracker server 的ip范围（对所有类型的连接都有影响，包括客户端，storage server）

# sync log buff to disk every interval seconds
 # default value is 10 seconds
 sync_log_buff_interval = 10
 # 同步或刷新日志信息到硬盘的时间间隔，单位为秒
# 注意：tracker server 的日志不是时时写硬盘的，而是先写内存。

# check storage server alive interval
 check_active_interval = 120
 # 检测 storage server 存活的时间隔，单位为秒。
# storage server定期向tracker server 发心跳，如果tracker server在一个check_active_interval内还没有收到storage server的一次心跳，那边将认为该storage server已经下线。所以本参数值必须大于storage server配置的心跳时间间隔。通常配置为storage server心跳时间间隔的2倍或3倍。

# thread stack size, should > 512KB
 # default value is 1MB
 thread_stack_size=1MB
 # 线程栈的大小。FastDFS server端采用了线程方式。更正一下，tracker server线程栈不应小于64KB，不是512KB。
# 线程栈越大，一个线程占用的系统资源就越多。如果要启动更多的线程（V1.x对应的参数为max_connections，
V2.0为work_threads），可以适当降低本参数值。

# auto adjust when the ip address of the storage server changed
 # default value is true
 storage_ip_changed_auto_adjust=true
 # 这个参数控制当storage server IP地址改变时，集群是否自动调整。注：只有在storage server进程重启时才完成自动调整。

# storage sync file max delay seconds
 # default value is 86400 seconds (one day)
 # since V2.00
 storage_sync_file_max_delay = 86400
 # V2.0引入的参数。存储服务器之间同步文件的最大延迟时间，缺省为1天。根据实际情况进行调整
# 注：本参数并不影响文件同步过程。本参数仅在下载文件时，判断文件是否已经被同步完成的一个阀值（经验值）

# the max time of storage sync a file
 # default value is 300 seconds
 # since V2.00
 storage_sync_file_max_time = 300
 # V2.0引入的参数。存储服务器同步一个文件需要消耗的最大时间，缺省为300s，即5分钟。
# 注：本参数并不影响文件同步过程。本参数仅在下载文件时，作为判断当前文件是否被同步完成的一个阀值（经验��）

# if use a trunk file to store several small files
 # default value is false
 # since V3.00
 use_trunk_file = false
 # V3.0引入的参数。是否使用小文件合并存储特性，缺省是关闭的。

# the min slot size, should <= 4KB
 # default value is 256 bytes
 # since V3.00
 slot_min_size = 256
 # V3.0引入的参数。
# trunk file分配的最小字节数。比如文件只有16个字节，系统也会分配slot_min_size个字节。

# the max slot size, should > slot_min_size
 # store the upload file to trunk file when it's size <=  this value
 # default value is 16MB
 # since V3.00
 slot_max_size = 16MB
 # V3.0引入的参数。
# 只有文件大小<=这个参数值的文件，才会合并存储。如果一个文件的大小大于这个参数值，将直接保存到一个文件中（即不采用合并存储方式）。

# the trunk file size, should >= 4MB
 # default value is 64MB
 # since V3.00
 trunk_file_size = 64MB
 # V3.0引入的参数。
# 合并存储的trunk file大小，至少4MB，缺省值是64MB。不建议设置得过大。

# if create trunk file advancely
 # default value is false
 trunk_create_file_advance = false
 # 是否提前创建trunk file。只有当这个参数为true，下面3个以trunk_create_file_打头的参数才有效。

# the time base to create trunk file
 # the time format: HH:MM
 # default value is 02:00
 trunk_create_file_time_base = 02:00
 # 提前创建trunk file的起始时间点（基准时间），02:00表示第一次创建的时间点是凌晨2点。

# the interval of create trunk file, unit: second
 # default value is 38400 (one day)
 trunk_create_file_interval = 86400
 # 创建trunk file的时间间隔，单位为秒。如果每天只提前创建一次，则设置为86400

 # the threshold to create trunk file
 # when the free trunk file size less than the threshold, will create 
 # the trunk files
 # default value is 0
 trunk_create_file_space_threshold = 20G
 # 提前创建trunk file时，需要达到的空闲trunk大小
# 比如本参数为20G，而当前空闲trunk为4GB，那么只需要创建16GB的trunk file即可。

# if check trunk space occupying when loading trunk free spaces
 # the occupied spaces will be ignored
 # default value is false
 # since V3.09
 # NOTICE: set this parameter to true will slow the loading of trunk spaces
 # when startup. you should set this parameter to true when neccessary.
 trunk_init_check_occupying = false
 #trunk初始化时，是否检查可用空间是否被占用

# if ignore storage_trunk.dat, reload from trunk binlog
 # default value is false
 # since V3.10
 # set to true once for version upgrade when your version less than V3.10
 trunk_init_reload_from_binlog = false
 # 是否无条件从trunk binlog中加载trunk可用空间信息
# FastDFS缺省是从快照文件storage_trunk.dat中加载trunk可用空间，
# 该文件的第一行记录的是trunk binlog的offset，然后从binlog的offset开始加载

# if use storage ID instead of IP address
 # default value is false
 # since V4.00
 use_storage_id = false
 # 是否使用server ID作为storage server标识

# specify storage ids filename, can use relative or absolute path
 # since V4.00
 storage_ids_filename = storage_ids.conf
 # use_storage_id 设置为true，才需要设置本参数
# 在文件中设置组名、server ID和对应的IP地址，参见源码目录下的配置示例：conf/storage_ids.conf

 # if store slave file use symbol link
 # default value is false
 # since V4.01
 store_slave_file_use_link = false
 # 存储从文件是否采用symbol link（符号链接）方式
# 如果设置为true，一个从文件将占用两个文件：原始文件及指向它的符号链接。

# if rotate the error log every day
 # default value is false
 # since V4.02
 rotate_error_log = false
 # 是否定期轮转error log，目前仅支持一天轮转一次

# rotate error log time base, time format: Hour:Minute
 # Hour from 0 to 23, Minute from 0 to 59
 # default value is 00:00
 # since V4.02
 error_log_rotate_time=00:00
 # error log定期轮转的时间点，只有当rotate_error_log设置为true时有效

# rotate error log when the log file exceeds this size
 # 0 means never rotates log file by log file size
 # default value is 0
 # since V4.02
 rotate_error_log_size = 0
 # error log按大小轮转
# 设置为0表示不按文件大小轮转，否则当error log达到该大小，就会轮转到新文件中

# 以下是关于http的设置了 默认编译是不生效的 要求更改 #WITH_HTTPD=1 将 注释#去掉 再编译
# 关于http的应用 说实话 不是很了解 没有见到 相关说明 ,望 版主可以完善一下 以下是字面解释了
#HTTP settings
 http.disabled=false  # HTTP服务是否不生效 
http.server_port=8080  # HTTP服务端口


#use "#include" directive to include http other settiongs
 ##include http.conf  # 如果加载http.conf的配置文件 去掉第一个#

```

**storage.conf**

```
 # is this config file disabled
 # false for enabled
 # true for disabled
 disabled=false  
 #同上文了 就不多说了

# the name of the group this storage server belongs to
 group_name=group1
 # 指定 此 storage server 所在 组(卷)

 # bind an address of this host
 # empty for bind all addresses of this host
 bind_addr=
 # 同上文

# if bind an address of this host when connect to other servers 
 # (this storage server as a client)
 # true for binding the address configed by above parameter: "bind_addr"
 # false for binding any address of this host
 client_bind=true
 # bind_addr通常是针对server的。当指定bind_addr时，本参数才有效。
# 本storage server作为client连接其他服务器（如tracker server、其他storage server），是否绑定bind_addr。

# the storage server port
 port=23000
 #  storage server服务端口

# connect timeout in seconds
 # default value is 30s
 connect_timeout=30
 #连接超时时间，针对socket套接字函数connect

 # network timeout in seconds
 network_timeout=60
 #  storage server 网络超时时间，单位为秒。发送或接收数据时，如果在超时时间后还不能发送或接收数据，则本次网络通信失败。

# heart beat interval in seconds
 heart_beat_interval=30
 # 心跳间隔时间，单位为秒 (这里是指主动向tracker server 发送心跳)

 # disk usage report interval in seconds
 stat_report_interval=60
 # storage server向tracker server报告磁盘剩余空间的时间间隔，单位为秒。


# the base path to store data and log files
 base_path=/home/yuqing/fastdfs
 # base_path 目录地址,根目录必须存在  子目录会自动生成 (注 :这里不是上传的文件存放的地址,之前是的,在某个版本后更改了)
 # 目录结构 因为 版主没有更新到 论谈上 这里就不发了 大家可以看一下置顶贴:

 # max concurrent connections server supported
 # max_connections worker threads start when this service startup
 max_connections=256
 # 同上文

# work thread count, should <= max_connections
 # default value is 4
 # since V2.00
 # V2.0引入的这个参数，工作线程数，通常设置为CPU数
work_threads=4

 # the buff size to recv / send data
 # default value is 64KB
 # since V2.00
 buff_size = 256KB
 # V2.0引入本参数。设置队列结点的buffer大小。工作队列消耗的内存大小 = buff_size * max_connections
 # 设置得大一些，系统整体性能会有所提升。
# 消耗的内存请不要超过系统物理内存大小。另外，对于32位系统，请注意使用到的内存不要超过3GB

 # if read / write file directly
 # if set to true, open file will add the O_DIRECT flag to avoid file caching
 # by the file system. be careful to set this parameter.
 # default value is false
 disk_rw_direct = false
 # V2.09引入本参数。设置为true，表示不使用操作系统的文件内容缓冲特性。
# 如果文件数量很多，且访问很分散，可以考虑将本参数设置为true

 # if disk read / write separated
 ##  false for mixed read and write
 ##  true for separated read and write
 # default value is true
 # since V2.00
 disk_rw_separated = true
 # V2.0引入本参数。磁盘IO读写是否分离，缺省是分离的。

# disk reader thread count per store base path
 # for mixed read / write, this parameter can be 0
 # default value is 1
 # since V2.00
 disk_reader_threads = 1
 # V2.0引入本参数。针对单个存储路径的读线程数，缺省值为1。
# 读写分离时，系统中的读线程数 = disk_reader_threads * store_path_count
 # 读写混合时，系统中的读写线程数 = (disk_reader_threads + disk_writer_threads) * store_path_count

 # disk writer thread count per store base path
 # for mixed read / write, this parameter can be 0
 # default value is 1
 # since V2.00
 disk_writer_threads = 1
 # V2.0引入本参数。针对单个存储路径的写线程数，缺省值为1。
# 读写分离时，系统中的写线程数 = disk_writer_threads * store_path_count
 # 读写混合时，系统中的读写线程数 = (disk_reader_threads + disk_writer_threads) * store_path_count

 # when no entry to sync, try read binlog again after X milliseconds
 # 0 for try again immediately (not need to wait)
 sync_wait_msec=200
 # 同步文件时，如果从binlog中没有读到要同步的文件，休眠N毫秒后重新读取。0表示不休眠，立即再次尝试读取。
# 出于CPU消耗考虑，不建议设置为0。如何希望同步尽可能快一些，可以将本参数设置得小一些，比如设置为10ms

 # after sync a file, usleep milliseconds
 # 0 for sync successively (never call usleep)
 sync_interval=0
 # 同步上一个文件后，再同步下一个文件的时间间隔，单位为毫秒，0表示不休眠，直接同步下一个文件。

# sync start time of a day, time format: Hour:Minute
 # Hour from 0 to 23, Minute from 0 to 59
 sync_start_time=00:00

 # sync end time of a day, time format: Hour:Minute
 # Hour from 0 to 23, Minute from 0 to 59
 sync_end_time=23:59
 # 上面二个一起解释。允许系统同步的时间段 (默认是全天) 。一般用于避免高峰同步产生一些问题而设定，相信sa都会明白

# write to the mark file after sync N files
 # default value is 500
 write_mark_file_freq=500
 # 同步完N个文件后，把storage的mark文件同步到磁盘
# 注：如果mark文件内容没有变化，则不会同步

# path(disk or mount point) count, default value is 1
 store_path_count=1
 # 存放文件时storage server支持多个路径（例如磁盘）。这里配置存放文件的基路径数目，通常只配一个目录。

# store_path#, based 0, if store_path0 not exists, it's value is base_path
 # the paths must be exist
 store_path0=/home/yuqing/fastdfs
 #store_path1=/home/yuqing/fastdfs2
 # 逐一配置store_path个路径，索引号基于0。注意配置方法后面有0,1,2 ......，需要配置0到store_path - 1。
# 如果不配置base_path0，那边它就和base_path对应的路径一样。

# subdir_count  * subdir_count directories will be auto created under each 
 # store_path (disk), value can be 1 to 256, default value is 256
 subdir_count_per_path=256
 # FastDFS存储文件时，采用了两级目录。这里配置存放文件的目录个数 (系统的存储机制,大家看看文件存储的目录就知道了)
 # 如果本参数只为N（如：256），那么storage server在初次运行时，会自动创建 N * N 个存放文件的子目录。

# tracker_server can ocur more than once, and tracker_server format is
 #  "host:port", host can be hostname or ip address
 tracker_server=10.62.164.84:22122
 tracker_server=10.62.245.170:22122
 # tracker_server 的列表 要写端口的哦 (再次提醒是主动连接tracker_server )
 # 有多个tracker server时，每个tracker server写一行

#standard log level as syslog, case insensitive, value list:
 ### emerg for emergency
 ### alert
 ### crit for critical
 ### error
 ### warn for warning
 ### notice
 ### info
 ### debug
 log_level=info
 # 日志级别不多说

#unix group name to run this program, 
 #not set (empty) means run by the group of current user
 run_by_group=
 # 同上文了

#unix username to run this program,
 #not set (empty) means run by current user
 run_by_user=
 # 同上文了 (提醒注意权限 如果和 webserver不搭 可以会产生错误 哦)

 # allow_hosts can ocur more than once, host can be hostname or ip address,
 # "*" means match all ip addresses, can use range like this: 10.0.1.[1-15,20] or
 # host[01-08,20-25].domain.com, for example:
 # allow_hosts=10.0.1.[1-15,20]
 # allow_hosts=host[01-08,20-25].domain.com
 allow_hosts=*
 # 允许连接本storage server的IP地址列表 （不包括自带HTTP服务的所有连接）
# 可以配置多行，每行都会起作用

# the mode of the files distributed to the data path 
 # 0: round robin(default)
 # 1: random, distributted by hash code
 file_distribute_path_mode=0
 #  文件在data目录下分散存储策略。
# 0: 轮流存放，在一个目录下存储设置的文件数后（参数file_distribute_rotate_count中设置文件数），使用下一个目录进行存储。
# 1: 随机存储，根据文件名对应的hash code来分散存储。

# valid when file_distribute_to_path is set to 0 (round robin), 
 # when the written file count reaches this number, then rotate to next path
 # default value is 100
 file_distribute_rotate_count=100  
 # 当上面的参数file_distribute_path_mode配置为0（轮流存放方式）时，本参数有效。
# 当一个目录下的文件存放的文件数达到本参数值时，后���上传的文件存储到下一个目录中。

# call fsync to disk when write big file
 # 0: never call fsync
 # other: call fsync when written bytes >= this bytes
 # default value is 0 (never call fsync)
 fsync_after_written_bytes=0
 # 当写入大文件时，每写入N个字节，调用一次系统函数fsync将内容强行同步到硬盘。0表示从不调用fsync 

 # sync log buff to disk every interval seconds
 # default value is 10 seconds
 sync_log_buff_interval=10
 # 同步或刷新日志信息到硬盘的时间间隔，单位为秒
# 注意：storage server 的日志信息不是时时写硬盘的，而是先写内存。

# sync binlog buff / cache to disk every interval seconds
 # this parameter is valid when write_to_binlog set to 1
 # default value is 60 seconds
 sync_binlog_buff_interval=60
 # 同步binglog（更新操作日志）到硬盘的时间间隔，单位为秒
# 本参数会影响新上传文件同步延迟时间

# sync storage stat info to disk every interval seconds
 # default value is 300 seconds
 sync_stat_file_interval=300
 # 把storage的stat文件同步到磁盘的时间间隔，单位为秒。
# 注：如果stat文件内容没有变化，不会进行同步

# thread stack size, should >= 512KB
 # default value is 512KB
 thread_stack_size=512KB
 # 线程栈的大小。FastDFS server端采用了线程方式。
# 对于V1.x，storage server线程栈不应小于512KB；对于V2.0，线程栈大于等于128KB即可。
# 线程栈越大，一个线程占用的系统资源就越多。
# 对于V1.x，如果要启动更多的线程（max_connections），可以适当降低本参数值。

# the priority as a source server for uploading file.
 # the lower this value, the higher its uploading priority.
 # default value is 10
 upload_priority=10
 #  本storage server作为源服务器，上传文件的优先级，可以为负数。值越小，优先级越高。这里就和 tracker.conf 中store_server= 2时的配置相对应了

# if check file duplicate, when set to true, use FastDHT to store file indexes
 # 1 or yes: need check
 # 0 or no: do not check
 # default value is 0
 check_file_duplicate=0
 # 是否检测上传文件已经存在。如果已经存在，则不存在文件内容，建立一个符号链接以节省磁盘空间。 
 # 这个应用要配合FastDHT 使用，所以打开前要先安装FastDHT 
 # 1或yes 是检测，0或no 是不检测

# file signature method for check file duplicate
 ## hash: four 32 bits hash code
 ## md5: MD5 signature
 # default value is hash
 # since V4.01
 file_signature_method=hash
 # 文件去重时，文件内容的签名方式：
## hash： 4个hash code
 ## md5：MD5

 # namespace for storing file indexes (key-value pairs)
 # this item must be set when check_file_duplicate is true / on
 key_namespace=FastDFS
 # 当上个参数设定为1 或 yes时 (true/on也是可以的) ， 在FastDHT中的命名空间。

# set keep_alive to 1 to enable persistent connection with FastDHT servers
 # default value is 0 (short connection)
 keep_alive=0
 # 与FastDHT servers 的连接方式 (是否为持久连接) ，默认是0（短连接方式）。可以考虑使用长连接，这要看FastDHT server的连接数是否够用。

# 下面是关于FastDHT servers 的设定 需要对FastDHT servers 有所了解,这里只说字面意思了
# you can use "#include filename" (not include double quotes) directive to 
 # load FastDHT server list, when the filename is a relative path such as 
 # pure filename, the base path is the base path of current/this config file.
 # must set FastDHT server list when check_file_duplicate is true / on
 # please see INSTALL of FastDHT for detail
 ##include /home/yuqing/fastdht/conf/fdht_servers.conf
 # 可以通过 #include filename 方式来加载 FastDHT servers  的配置，装上FastDHT就知道该如何配置啦。
# 同样要求 check_file_duplicate=1 时才有用，不然系统会忽略
# fdht_servers.conf 记载的是 FastDHT servers 列表

# if log to access log
 # default value is false
 # since V4.00
 use_access_log = false
 # 是否将文件操作记录到access log

 # if rotate the access log every day
 # default value is false
 # since V4.00
 rotate_access_log = false
 # 是否定期轮转access log，目前仅支持一天轮转一次

# rotate access log time base, time format: Hour:Minute
 # Hour from 0 to 23, Minute from 0 to 59
 # default value is 00:00
 # since V4.00
 access_log_rotate_time=00:00
 # access log定期轮转的时间点，只有当rotate_access_log设置为true时有效

# if rotate the error log every day
 # default value is false
 # since V4.02
 rotate_error_log = false
 # 是否定期轮转error log，目前仅支持一天轮转一次

# rotate error log time base, time format: Hour:Minute
 # Hour from 0 to 23, Minute from 0 to 59
 # default value is 00:00
 # since V4.02
 error_log_rotate_time=00:00
 # error log定期轮转的时间点，只有当rotate_error_log设置为true时有效

# rotate access log when the log file exceeds this size
 # 0 means never rotates log file by log file size
 # default value is 0
 # since V4.02
 rotate_access_log_size = 0
 # access log按文件大小轮转
# 设置为0表示不按文件大小轮转，否则当access log达到该大小，就会轮转到新文件中

# rotate error log when the log file exceeds this size
 # 0 means never rotates log file by log file size
 # default value is 0
 # since V4.02
 rotate_error_log_size = 0
 # error log按文件大小轮转
# 设置为0表示不按文件大小轮转，否则当error log达到该大小，就会轮转到新文件中

# if skip the invalid record when sync file
 # default value is false
 # since V4.02
 file_sync_skip_invalid_record=false
 # 文件同步的时候，是否忽略无效的binlog记录

 下面是http的配置了。如果系统较大，这个服务有可能支持不了，可以自行换一个webserver，我喜欢lighttpd，当然ng也很好了。具体不说明了。相应这一块的说明大家都懂，不明白见上文。
#HTTP settings
 http.disabled=false

 # the port of the web server on this storage server
 http.server_port=8888

 http.trunk_size=256KB
 # http.trunk_size表示读取文件内容的buffer大小（一次读取的文件内容大小），也就是回复给HTTP client的块大小。


# use the ip address of this storage server if domain_name is empty,
 # else this domain name will ocur in the url redirected by the tracker server
 http.domain_name=
 # storage server上web server域名，通常仅针对单独部署的web server。这样URL中就可以通过域名方式来访问storage server上的文件了，
# 这个参数为空就是IP地址的方式。

#use "#include" directive to include HTTP other settiongs
 ##include http.conf
 
```

<a id="markdown-16-fastdfs-同步机制说明" name="16-fastdfs-同步机制说明"></a>
## 1.6. FastDFS 同步机制说明：

写文件时，客户端将文件写至group内一个storage server即认为写文件成功，storage server写完文件后，会由后台线程将文件同步至同group内其他的storage server。
每个storage写文件后，同时会写一份binlog，binlog里不包含文件数据，只包含文件名等元信息，这份binlog用于后台同步，storage会记录向group内其他storage同步的进度，以便重启后能接上次的进度继续同步；进度以时间戳的方式进行记录，所以最好能保证集群内所有server的时钟保持同步。
storage的同步进度会作为元数据的一部分汇报到tracker上，tracke在选择读storage的时候会以同步进度作为参考



tracker server会在内存中保存storage分组及各个组下的storage server，并将连接过自己的storage server及其分组保存到文件中，以便下次重启服务时能直接从本地磁盘中获得storage相关信息。storage server会在内存中记录本组的所有服务器，并将服务器信息记录到文件中。tracker server和storage server之间相互同步storage server列表：

1. 如果一个组内增加了新的storage
server或者storage server的状态发生了改变，tracker server都会将storage server列表同步给该组内的所有storage server。以新增storage server为例，因为新加入的storage
server主动连接tracker server，tracker server发现有新的storage server加入，就会将该组内所有的storage server返回给新加入的storage server，并重新将该组的storage server列表返回给该组内的其他storage server；
2. 如果新增加一台tracker server，storage server连接该tracker server，发现该tracker server返回的本组storage server列表比本机记录的要少，就会将该tracker server上没有的storage server同步给该tracker server。同一组内的storage server之间是对等的，文件上传、删除等操作可以在任意一台storage server上进行。文件同步只在同组内的storage server之间进行，采用push方式，即源服务器同步给目标服务器。以文件上传为例，假设一个组内有3台storage server A、B和C，文件F上传到服务器B，由B将文件F同步到其余的两台服务器A和C。我们不妨把文件F上传到服务器B的操作为源头操作，在服务器B上的F文件为源头数据；文件F被同步到服务器A和C的操作为备份操作，在A和C上的F文件为备份数据。同步规则总结如下：
1. 只在本组内的storage server之间进行同步；
2. 源头数据才需要同步，备份数据不需要再次同步，否则就构成环路了；
3. 上述第二条规则有个例外，就是新增加一台storage server时，由已有的一台storage server将已有的所有数据（包括源头数据和备份数据）同步给该新增服务器。storage server有7个状态，如下：
* FDFS_STORAGE_STATUS_INIT :初始化，尚未得到同步已有数据的源服务器
* FDFS_STORAGE_STATUS_WAIT_SYNC :等待同步，已得到同步已有数据的源服务器
* FDFS_STORAGE_STATUS_SYNCING :同步中
* FDFS_STORAGE_STATUS_DELETED :已删除，该服务器从本组中摘除（注：本状态的功能尚未实现）
* FDFS_STORAGE_STATUS_OFFLINE :离线
* FDFS_STORAGE_STATUS_ONLINE :在线，尚不能提供服务
* FDFS_STORAGE_STATUS_ACTIVE :在线，可以提供服务

当storageserver的状态为FDFS_STORAGE_STATUS_ONLINE时，当该storage server向tracker server发起一次heart beat时，tracker server将其状态更改为FDFS_STORAGE_STATUS_ACTIVE。


组内新增加一台storage server A时，由系统自动完成已有数据同步，处理逻辑如下：
1. storage server A连接tracker server，tracker server将storage server A的状态设置为FDFS_STORAGE_STATUS_INIT。storage server A询问追加同步的源服务器和追加同步截至时间点，如果该组内只有storage server A或该组内已成功上传的文件数为0，则没有数据需要同步，storage server A就可以提供在线服务，此时tracker将其状态设置为FDFS_STORAGE_STATUS_ONLINE，否则tracker
server将其状态设置为FDFS_STORAGE_STATUS_WAIT_SYNC，进入第二步的处理；
2. 假设tracker
server分配向storage server A同步已有数据的源storage server为B。同组的storage server和tracker server通讯得知新增了storage server A，将启动同步线程，并向tracker server询问向storage server A追加同步的源服务器和截至时间点。storage server B将把截至时间点之前的所有数据同步给storage server A；而其余的storage server从截至时间点之后进行正常同步，只把源头数据同步给storage server A。到了截至时间点之后，storage server B对storage server A的同步将由追加同步切换为正常同步，只同步源头数据；
3. storage server
B向storage server A同步完所有数据，暂时没有数据要同步时，storage server B请求tracker server将storage server A的状态设置为FDFS_STORAGE_STATUS_ONLINE；
4 当storage server A向tracker server发起heart beat时，tracker server将其状态更改为FDFS_STORAGE_STATUS_ACTIVE。

<a id="markdown-17-安装配置" name="17-安装配置"></a>
## 1.7. 安装配置
<a href="#menu" style="float:right">目录</a>

[参考](https://www.cnblogs.com/chiangchou/p/fastdfs.html)

<a id="markdown-18-java客户端使用" name="18-java客户端使用"></a>
## 1.8. Java客户端使用
<a href="#menu" style="float:right">目录</a>

```xml
<dependency>
    <groupId>com.github.tobato</groupId>
    <artifactId>fastdfs-client</artifactId>
    <version>1.26.6-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>

```

[参考GitHub](https://github.com/tobato/FastDFS_Client)
<span id="menu"></span>


<a id="markdown-2-性能调优" name="2-性能调优"></a>
# 2. 性能调优
<a href="#menu" style="float:right">目录</a>

<a id="markdown-21-性能调优概述" name="21-性能调优概述"></a>
## 2.1. 性能调优概述

<a id="markdown-22-操作系统性能监控" name="22-操作系统性能监控"></a>
## 2.2. 操作系统性能监控
<a href="#menu" style="float:right">目录</a>

**vmstat**

```bash
lgj@lgj-Lenovo-G470:~/aProject/aRealPrj/Java-Interview$ vmstat 5
procs -----------memory---------- ---swap-- -----io---- -system-- ------cpu-----
 r  b   swpd   free   buff  cache   si   so    bi    bo   in   cs us sy id wa st
 0  0      0 2583376 206884 2458524    0    0    17    17  204  216  8  2 89  1  0
 0  0      0 2600524 206892 2439504    0    0     0    91  485 1380  2  1 97  0  0

```

<a id="markdown-23-idea安装hsdis查看jit编译的汇编代码" name="23-idea安装hsdis查看jit编译的汇编代码"></a>
## 2.3. IDEA安装hsdis查看JIT编译的汇编代码

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



<a id="markdown-24-使用jmh做benchmark基准测试" name="24-使用jmh做benchmark基准测试"></a>
## 2.4. 使用JMH做Benchmark基准测试
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



<a id="markdown-25-jvm" name="25-jvm"></a>
## 2.5. JVM
<a href="#menu" style="float:right">目录</a>

<a id="markdown-251-jit编译器" name="251-jit编译器"></a>
### 2.5.1. JIT编译器

<a id="markdown-2511-概述" name="2511-概述"></a>
#### 2.5.1.1. 概述

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

**客户端版或服务器版**
一般只需要选择是使用客户端版或者服务器版的JIT编译器即可。
* 客户端版的JIT编译器使用：
    * -client
* 指定，服务器版的使用：
    * -server
* 选择哪种类型一般和硬件的配置相关，当然随着硬件的发展，也没有一个确定的标准哪种硬件适合哪种配置。
* 两种JIT编译器的区别：
    * Client版对于代码的编译早于Server版，也意味着代码的执行速度在程序执行早期Client版更快。
    * Server版对代码的编译会稍晚一些，这是为了获取到程序本身的更多信息，以便编译得到优化程度更高的代码。因为运行在Server上的程序通常都会持续很久。
* Tiered编译的原理：
    * XX:+TieredCompilation
    * JVM启动之初使用Client版JIT编译器
    * 当HotSpot形成之后使用Server版JIT编译器再次编译
* 在Java 8中，默认使用Tiered编译方式。



<a id="markdown-252-jvm内存模型" name="252-jvm内存模型"></a>
### 2.5.2. JVM内存模型
<a href="#menu" style="float:right">目录</a>
![](https://img2018.cnblogs.com/blog/163758/201811/163758-20181101131229284-1189515543.png)

<a id="markdown-253-jvm的内存空间" name="253-jvm的内存空间"></a>
### 2.5.3. JVM的内存空间
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
    * 在JDK8之前的HotSpot JVM，存放这些”永久的”的区域叫做“永久代(permanent generation)”。永久代是一片连续的堆空间，在JVM启动之前通过在命令行设置参数-XX:MaxPermSize来设定永久代最大可分配的内存空间，默认大小是64M（64位JVM默认是85M）。
    * 随着JDK8的到来，JVM不再有 永久代(PermGen)。但类的元数据信息（metadata）还在，只不过不再是存储在连续的堆空间上，而是移动到叫做“Metaspace”的本地内存（Native memory。
    * 方法区是一种规范，永久代和元空间只是实现方式
    * 由于永久代使用应用内存，很可能导致OOM，因此更换为元空间，可以无限制使用本地内存
* **虚拟机栈(JVM Stack)**
    * 描述的是java方法执行的内存模型：每个方法被执行的时候都会创建一个"栈帧",用于存储局部变量表(包括参数)、操作栈、方法出口等信息。每个方法被调用到执行完的过程，就对应着一个栈帧在虚拟机栈中从入栈到出栈的过程。
    * 本地方法栈(Native Stack)
    * 本地方法栈（Native Method Stacks）与虚拟机栈所发挥的作用是非常相似的，其区别不过是虚拟机栈为虚拟机执行Java方法（也就是字节码）服务，而本地方法栈则是为虚拟机使用到的Native方法服务。

* **程序计数器（PC Register）**
    *  程序计数器是用于标识当前线程执行的字节码文件的行号指示器。多线程情况下，每个线程都具有各自独立的程序计数器，所以该区域是非线程共享的内存区域。
    * 当执行java方法时候，计数器中保存的是字节码文件的行号；当执行Native方法时，计数器的值为空。

* **直接内存**
    * 直接内存并不是虚拟机内存的一部分，也不是Java虚拟机规范中定义的内存区域。jdk1.4中新加入的NIO，引入了通道与缓冲区的IO方式，它可以调用Native方法直接分配堆外内存，这个堆外内存就是本机内存，不会影响到堆内存的大小。

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
<a id="markdown-2531-对象内存布局" name="2531-对象内存布局"></a>
#### 2.5.3.1. 对象内存布局
* HotSpot对象头
    * 用于存储对象自身运行时数据
    * 类型指针，即对象指向类元数据的指针
        * 通过这个指针确定对象是哪个类的实例
        * 如果Java对象是一个Java数组，那么对象头中还必须有一块用于记录数组长度的数据

HotSpot对象头 Mark Word

|存储内容|标志位|状态|
|---|---|---|
|对象哈希码，对象分代年龄|01|未锁定|
|指向锁记录的指针|00|轻量级锁定|
|指向重量级锁的指针|10|膨胀(重量级锁定)|
|空，不需要记录信息|11|GC标志|
|偏向线程ID，偏向时间戳，对象分代年龄 |01|可偏向|

Mark Word有32bit,25bit对象哈希码，4bit存储对象分代年龄，2bit用于存储锁标志位，1bit固定为0。

<a id="markdown-2532-对象访问定位" name="2532-对象访问定位"></a>
#### 2.5.3.2. 对象访问定位

* 句柄访问
    * 使用句柄访问方式，java堆将会划分出来一部分内存去来作为句柄池，reference中存储的就是对象的句柄地址。而句柄中则包含对象实例数据的地址和对象类型数据（如对象的类型，实现的接口、方法、父类、field等）的具体地址信息。
    * 使用句柄访最大的好处是reference中存储着稳定的句柄地址，当对象移动之后（垃圾收集时移动对象是非常普遍的行为），只需要改变句柄中的对象实例地址即可，reference不用修改。
* 直接指针访问(hotspot使用)
    * 如果使用指针访问，那么java堆对象的布局中就必须考虑如何放置访问类型的相关信息（如对象的类型，实现的接口、方法、父类、field等），而reference中存储的就是对象的地址。
    * 使用指针访问的好处是访问速度快，它减少了一次指针定位的时间开销，由于java是面向对象的语言，在开发中java对象的访问非常的频繁，因此这类开销积少成多也是非常可观的，反之则提升访问速度。

<a id="markdown-254-垃圾回收算法" name="254-垃圾回收算法"></a>
### 2.5.4. 垃圾回收算法
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2541-对象回收判定" name="2541-对象回收判定"></a>
#### 2.5.4.1. 对象回收判定

**引用计数法**
* 给对象添加一个引用计数器，引用一次则计数器+1,引用失效计数器-1，当计数器为0的时候，说明没有地方引用，垃圾收集器可以将它进行回收
* 缺点：无法解决循环引用

**可达性分析算法**
* 以GC ROOTS为起始点，从这些节点开始向下搜索，搜索所走过的路径称为引用链，当一个对象到GC ROOTS没有引用链相连时，说明不可达，也说明没有任何引用。
* GC Roots对象
    * 虚拟机栈中引用的对象
    * 方法区中类静态对象引用的对象
    * 方法区中常量引用的对象
    * 本地方法栈中引用的对象

<a id="markdown-2542-对象引用分类" name="2542-对象引用分类"></a>
#### 2.5.4.2. 对象引用分类
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

<a id="markdown-2543-标记清除算法" name="2543-标记清除算法"></a>
#### 2.5.4.3. 标记清除算法
* 先标记可回收的对象空间，在标记完成之后进行统一的回收
* 缺点
    * 效率问题，标记和清除两个过程的效率都不高
    * 空间问题，清除后将产生内存碎片，不利于二次使用

<a id="markdown-2544-复制算法" name="2544-复制算法"></a>
#### 2.5.4.4. 复制算法
* 内存按容量分为两个区块，每次只使用一个区块用于内存分配
* 垃圾回收时，将存活的对象复制到另一个区块，按顺序存放
* 复制完成后，一次性清理之前的区块
* 新创建对象将在另一个区块中分配
* 优点
    * 不产生碎片内存
* 缺点
    * 空间利用率不高，每次只能有一块区域分配内存。
    * 复制效率不高

<a id="markdown-2545-标记整理算法" name="2545-标记整理算法"></a>
#### 2.5.4.5. 标记整理算法
* 标记对象，然后让存活的对象往一边移动，最后一次性清理掉端边界以外的内存。

<a id="markdown-2546-分代收集算法" name="2546-分代收集算法"></a>
#### 2.5.4.6. 分代收集算法
* 将内存分为老年代和新生代
* 新创建的对象在新生代进行内存分配，经过多次垃圾回收之后仍然存活的对象将被放到老年代
* 新生代的对象一般生命周期短，大部分都会被回收掉，因此每次垃圾收集只有很少的对象存活，因此使用复制算法效率比较高
* 老年代的对象经过多次回收仍然存活，说明生命周期长，不容易被回收。因此每次垃圾回收只有少量的对象被回收，因此使用标记清除/标记整理算法效率比较高。


<a id="markdown-255-垃圾收集器" name="255-垃圾收集器"></a>
### 2.5.5. 垃圾收集器
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

* 并发和并行
    * 并发:多条垃圾收集线程并行工作，此时用户线程处于等待状态
    * 并发:用户线程和垃圾收集线程同时进行，此时用户线程也可以工作，垃圾收集线程在另一个CPU工作
* stop the world
    * 由于执行垃圾回收，用户线程无法执行，将会导致不可预知的错误，比如响应缓慢，任务超时等
    * 垃圾收集器应当尽量避免发生这种情况
    
<a id="markdown-2551-serial收集器" name="2551-serial收集器"></a>
#### 2.5.5.1. Serial收集器
<a href="#menu" style="float:right">目录</a>
* 进行垃圾收集时，将会暂停其他工作线程，直到回收完成
* 这将导致出现"stop the world"问题，应用代码会发生不可预知的问题
* 桌面应用场景，分配内存不多，可以使用该垃圾收集器
* client 模式中比较好的选择

<a id="markdown-2552-parnew收集器" name="2552-parnew收集器"></a>
#### 2.5.5.2. ParNew收集器
<a href="#menu" style="float:right">目录</a>

* Serial收集器的多线程版本
* Server环境下比较好的新生代收集器
* 与CMS(老年代收集器)很好的配合
* 单CPU环境下，由于存在线程切换，因此效率可能会比Serial收集器低
* 参数配置
    * 配置-XX:+UseConcMarkSweepGC将默认新生代使用ParNew收集器
    * 也可以通过 -XX:+UseParNewGC进行配置
    * 通过-XX：ParallelGCThreads限制线程数


<a id="markdown-2553-parallel-scavenge收集器" name="2553-parallel-scavenge收集器"></a>
#### 2.5.5.3. Parallel Scavenge收集器
<a href="#menu" style="float:right">目录</a>

* 使用复制算法和多线程方式实现
* 目标是达到一个可控制的吞吐量，吞吐量=用户运行代码时间/(用户运行代码时间+垃圾收集时间)
* 参数配置
    * 控制垃圾收集最大停顿时间，-XX:MaxGCPauseMillis
        * 设置过小，将发生频繁的垃圾收集行为，因为每次只能收集很少的一部分，导致吞吐量降低
    * 设置吞吐量大小:-XX:GCTimeRation (0-100)
        


<a id="markdown-2554-serial-old收集器" name="2554-serial-old收集器"></a>
#### 2.5.5.4. Serial Old收集器
<a href="#menu" style="float:right">目录</a>

* 老年代单线程收集算法，使用标记整理
* 将会发生stop the world 问题

<a id="markdown-2555-parallel-old收集器" name="2555-parallel-old收集器"></a>
#### 2.5.5.5. Parallel Old收集器
<a href="#menu" style="float:right">目录</a>

* Parallel Scavenge收集器的老年代版本
* 使用标记整理算法

<a id="markdown-2556-cms收集器" name="2556-cms收集器"></a>
#### 2.5.5.6. CMS收集器
<a href="#menu" style="float:right">目录</a>

* 以获取最短停顿时间为目标的收集器，能够给用户带来更好的响应速度
* 标记清除算法
* 垃圾收集过程
    * 初始标记
        * 需要 stop the world
        * 标记GC Roots能之间关联到的对象 
    * 并发标记
        * 需要 stop the world
        * 进行GC Roots Tracing 的过程
    * 重新标记
        * 修正并发标记期间由于用户线程工作而产生标记变动的那一部分对象的标记记录
        * 停顿时间比初始标记时间长，比并发标记时间短很多
    * 并发清除
* 问题
    * 对CPU资源敏感
    * 无法处理浮动垃圾（Floating Garbage）,可能出现Concurrent Mode Failure失败而导致另一次Fullgc.
    * 使用标记清除算法，会产生比较多的垃圾碎片
        * 碎片过多，老年代没有空间分配，将会触发FULL GC。
        * -XX:UseCMSCompactAtFullCollection（默认开启）
            * FullGC时同时进行内存碎片整理，同时将导致停顿时间变长
        * -XX:CMSFullGCsBeforeCompaction
            * 执行多少次FullGC后才会进行内存碎片整理，默认为0  


<a id="markdown-2557-g1收集器" name="2557-g1收集器"></a>
#### 2.5.5.7. G1收集器
<a href="#menu" style="float:right">目录</a>

* JDK7+ 默认的垃圾收集器
* 场景
    * 垃圾收集线程和应用线程并发执行，和CMS一样
    * 空闲内存压缩时避免冗长的暂停时间
    * 应用需要更多可预测的GC暂停时间
    * 不希望牺牲太多的吞吐性能
    * 不需要很大的Java堆
* 特点
    * 并行和并发
        * 充分利用多核来缩短stop the world时间
    * 分代收集
    * 空间整合
        * 从整体看是标记-整理算法，从局部看是基于复制算法
        * 收集后不产生内存碎片
    * 可预测的停顿
        * 让使用者指定Mms的时间片段内，垃圾收集的时间不超过Mms.

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

**GC模式**

G1中提供了三种模式垃圾回收模式，young gc、mixed gc 和 full gc，在不同的条件下被触发。

**young gc**
发生在年轻代的GC算法，一般对象（除了巨型对象）都是在eden region中分配内存，当所有eden region被耗尽无法申请内存时，就会触发一次young gc，这种触发机制和之前的young gc差不多，执行完一次young gc，活跃对象会被拷贝到survivor region或者晋升到old region中，空闲的region会被放入空闲列表中，等待下次被使用。



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

**full gc**
如果对象内存分配速度过快，mixed gc来不及回收，导致老年代被填满，就会触发一次full gc，G1的full gc算法就是单线程执行的serial old gc，会导致异常长时间的暂停时间，需要进行不断的调优，尽可能的避免full gc.

<a id="markdown-256-内存分配和回收策略" name="256-内存分配和回收策略"></a>
### 2.5.6. 内存分配和回收策略
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
                



<a id="markdown-257-jvm相关参数介绍" name="257-jvm相关参数介绍"></a>
### 2.5.7. JVM相关参数介绍
<a href="#menu" style="float:right">目录</a>

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


<a id="markdown-258-性能监控与故障处理工具" name="258-性能监控与故障处理工具"></a>
### 2.5.8. 性能监控与故障处理工具
<a href="#menu" style="float:right">目录</a>

<a id="markdown-2581-jdk命令行工具" name="2581-jdk命令行工具"></a>
#### 2.5.8.1. JDK命令行工具
<a href="#menu" style="float:right">目录</a>

**javap**
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
    
**jps**
* 虚拟机进程状况工具

```
usage: jps [-help]
       jps [-q] [-m | -l|-v|-V] [<hostid>]

Definitions:
    <hostid>:      <hostname>[:<port>]
    
```

**jstat**
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
**jinfo**
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
**jmap**
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
**jhat**
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
**jstack**
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
    -m  to print both java and native frames (mixed mode)
    -l  long listing. Prints additional information about locks
    -h or -help to print this help message


```
****


<a id="markdown-2582-jdk可视化工具" name="2582-jdk可视化工具"></a>
#### 2.5.8.2. Jdk可视化工具
<a href="#menu" style="float:right">目录</a>

* JConsole
* JVisualVM
![](https://github.com/lgjlife/Java-Study/blob/master/pic/jvm/monitor.png?raw=true)
![](https://github.com/lgjlife/Java-Study/blob/master/pic/jvm/thread.png?raw=true)
![](https://github.com/lgjlife/Java-Study/blob/master/pic/jvm/gc.png?raw=true)
<a id="markdown-259-jvm性能调优" name="259-jvm性能调优"></a>
### 2.5.9. JVM性能调优

<a id="markdown-2510-类文件结构" name="2510-类文件结构"></a>
### 2.5.10. 类文件结构

<a id="markdown-2511-类加载器" name="2511-类加载器"></a>
### 2.5.11. 类加载器





<span id="menu"></span>




<a id="markdown-3-elasticsearch搜索引擎" name="3-elasticsearch搜索引擎"></a>
# 3. Elasticsearch搜索引擎
<a href="#menu" style="float:right">目录</a>

<a id="markdown-31-基本概念" name="31-基本概念"></a>
## 3.1. 基本概念
<a href="#menu" style="float:right">目录</a>

* 索引
    * 逻辑数据的存储，可以看作一个数据库
    * 一个索引有一个或者多个分片，每个分片可以有多个副本
* 文档类型
    * 可以看作数据库的表名，用于区分不同类型文档
* 文档 document
    * 索引和搜索时使用的主要数据载体，包含一个或者多个存有数据的字段，可以看作数据库的一行数据
* 文档ID
    * 索引的唯一标识符，如果索引建立时不指定，el将会随机生成一个随机字符串当作文档哪个ID
    * 两个不同的文档类型可以有相同的文档ID
* 字段 Field
    * 文档的一部分，包含名称和值两部分
* 词 term
    * 搜索的词
* 标记 token
    * 表示字段在文本中出现的词，由这个词的文本、开始偏移量以及类型组成

* 倒排索引
文档1： 中国伟大
文档2： 中建公司

|词|计数|文档|
|---|---|---|
|中|2|<1><2>|
|中国|1|<1>|
|公司|1|<2>|
|...|...|...|

每一个词指向包含它的文档编号。这样就可以执行一种非常高效且快速的搜索，比如基于词的查询。此外，每个词有一个计数，告诉Lucene该词出现的频率。


* 输入数据分析
    * 传入文档中的数据怎么转化为到排索引，这个过程叫做分析
    * 分析的工作由分析器完成，分析器由一个分词器和零或多个标记过滤器组成，也可以有零个或多个字符映射器
        * 分词器
            * 把文本分隔成多个标记‘
            * 基本就是词加上一些额外的信息，比如该词在原始文本中的位置和长度
            * 分词器的处理结果称为标记流（ token stream），它是一个接一个的标记，准备被过滤器处理
        * 过滤器
            * 小写过滤器，把所有标记变为小写
            * 同义词过滤器，基于基本的同义词规则，把一个标记换成另一个同义的标记。
            * 多语言词干提取过滤器（ multiple language stemming filter）：减少标记（实际上是标记中的文本部分），得到词根或者基本形式，即词干
            * 过滤器是一个接一个进行处理，可以使用多个过滤器进行处理
        * 字符映射器
            * 对未经分析的文本其作用，在分词器之前进行工作
            * 可以将文本中的Html标签去除

* el集群基本概念
    * 节点和集群
        * el可以作为一个独立的搜索的服务器
        * 但为了处理大型数据集，实现容错和可用性，可以多个服务器组成集群。
    * 分片
        * 当存在大量的文档时，由于内存的限制、硬盘能力、处理能力不足、无法足够快地响应客户端请求等，一个节点可能不够
        * 在这种情况下，数据可以分为较小的称为分片（ shard）的部分（其中每个分片都是一个独立的Apache Lucene索引）。每个分片可以放在不同的服务器上
        * 当你查询的索引分布在多个分片上时， Elasticsearch会把查询发送给每个相关的分片，并将结果合并在一起，而应用程序并不知道分片的存在
    * 副本
        * 副本（ replica）只是一个分片的精确复制，每个分片可以有零个或多个副本
        * 副本分为主分片和副本分片
        * 主分片不可用时，则集群将副本分片提升为主分片
        * 使用副本机制可以提高查询吞吐量和实现高可用
        * 索引建立时，副本只是作为额外的位置来存放数据
        * 索引查询时，el会尽量平衡分片和它副本之间的负载
        
* 索引建立和搜索
    * 索引建立
        * 发送一个新的文档给集群，这个节点是任意选择的。
        * 这个节点知道目标索引有多少分片，并且能够确定哪个分片应该用来存储你的文档
        * Elasticsearch使用文档的唯一标识符来计算文档应该被放到哪个分片中
    * 索引查询
        * 使用文档标识符进行查询，根据ID确认持有的节点和分片，然后转发请求，获取结果，返回给客户端

* Elasticsearch架构特点
    * 合理的默认配置，使得用户在简单安装后能直接使用，而不需要额外的调优，这其中包括内置的发现(例如字段类型检测)和自动配置功能
    * 默认的分布式工作模式，每个节点总是假定自己是某个集群的一部分或将是某个集群的一部分
    * 对等架构，可以避免单点故障，节点会自动连接到集群中的其他节点，进行相互的数据交换和监控操作。这其中包括索引分片的自动复制
    * 容易扩充新节点至集群，不论是从数据容量的角度还是数量的角度
    * 没有对索引中的数据结构强加任何限制
    * 准实时搜索和版本同步，由于分布式特性，无法保证数据实时同步，el尝试解决这些问题，并且提供额外的机制用于版本同步。




<a id="markdown-32-elasticsearch工作流程" name="32-elasticsearch工作流程"></a>
## 3.2. Elasticsearch工作流程
<a href="#menu" style="float:right">目录</a>

<a id="markdown-321-启动过程" name="321-启动过程"></a>
### 3.2.1. 启动过程
<a href="#menu" style="float:right">目录</a>

* 当节点启动时，它使用发现模块来发现同一个集群(集群名称需要一样)中的其他节点，并与他们连接，默认情况下节点会发送广播请求，以找到拥有相同集群名称的其他节点。
* 集群中的一个节点被选为主(master)节点。该节点负责集群的状态管理以及在集群拓扑变化时做出反映，分发索引分片至集群相应的节点上去。
* 用户不需要关注哪个是master,请求可以发送到任何的节点其内部会自行转发处理。
* 管理节点读取集群的状态信息，如果有必要，它会进行会恢复处理，在该阶段，管理节点会检查哪些索引分片，并决定哪些分片将用作主分片，然后整个集群进入**黄色状态**。
* 黄色状态意味着集群可以进行查询，但是系统的吞吐量以及各种可能的状态是未知的(可以理解为所有的主分片已经分配，但是副本分片还没有分配)
* el寻找冗余的分片用作副本，如果某个主分片的副本数过少，管理节点将决定基于某个主分片创建分片和副本，如果主分片和副本分片已经分配好，那么将进入**绿色状态**

<a id="markdown-322-故障检测" name="322-故障检测"></a>
### 3.2.2. 故障检测
<a href="#menu" style="float:right">目录</a>

* 集群正常工作时，管理节点会监控所有可用的节点，检查它们是否正常工作。
* 如果任何节点在预订的超时时间内不响应，则认为该节点已经断开，然后错误处理开始启动
    * 这意味着集群-分片之间重新做平衡，选择新的主节点等
    * 对每个丢失的主分片，一个新的主分片将会从原来的主分片副本中选出来


<a id="markdown-323-与el通信" name="323-与el通信"></a>
### 3.2.3. 与El通信
<a href="#menu" style="float:right">目录</a>

<a id="markdown-3231-索引数据" name="3231-索引数据"></a>
#### 3.2.3.1. 索引数据
<a href="#menu" style="float:right">目录</a>

![索引建立](https://github.com/lgjlife/Java-Study/blob/master/pic/elasticsearch/index-create.png?raw=true)

* 索引操作只能发生在主分片上，而不是副本，当一个索引请求被发送到一个节点上时
* 如果该节点没有对应的主分片或者只有副本，那么这个请求会被转发到拥有正确的主分片节点。
* 然后该主节点会将请求发送到各个副本，然后等待响应，当达到规定数目的副本返回响应，完成索引过程并返回响应给客户端。


<a id="markdown-3232-查询数据" name="3232-查询数据"></a>
#### 3.2.3.2. 查询数据
<a href="#menu" style="float:right">目录</a>

![索引搜索](https://github.com/lgjlife/Java-Study/blob/master/pic/elasticsearch/index-search.png?raw=true)

* 查询分为分散阶段和合并阶段
    * 分散阶段
        * 查询请求分发到包含相关文档的多个分片中执行查询
    * 合并阶段
        * 从众多分片中收集返回结果，。然后进行合并，排序等操作之后再返回客户端。

<a id="markdown-33-安装与配置" name="33-安装与配置"></a>
## 3.3. 安装与配置
<a href="#menu" style="float:right">目录</a>

新创建的目录中。应该可以看到下面的目录结构：
|目录 |描述|
|---|---|
|bin| 运行Elasticsearch实例和插件管理所需的脚本
|config| 配置文件所在的目录
|lib| Elasticsearch使用的库
Elasticsearch启动后，会创建如下目录（如果目录不存在）：
|目 录 |描 述
|---|---|
|data| Elasticsearch使用的所有数据的存储位置
|logs| 关于事件和错误记录的文件
|plugins| 存储所安装插件的地方
|work| Elasticsearch使用的临时文件

<a id="markdown-331-配置文件说明" name="331-配置文件说明"></a>
### 3.3.1. 配置文件说明
<a href="#menu" style="float:right">目录</a>

* elasticsearch.yml  Elasticsearch配置文件
* jvm.options jvm参数配置
* log4j2.properties 日志配置


<a id="markdown-3311-elasticsearchyml" name="3311-elasticsearchyml"></a>
#### 3.3.1.1. elasticsearch.yml
<a href="#menu" style="float:right">目录</a>

```
cluster.name: elasticsearch                 配置集群名称，默认elasticsearch
node.name: node1                            配置节点名称
node.master: true                           配置当前节点是否具有可选为master节点的资格，默认值为true
node.data: true                             配置当前节点是否允许存储数据，默认值为true
node.rack: rack314                          每个节点都可以定义一些与之关联的通用属性，用于后期集群进行碎片分配时的过滤
node.max_local_storage_nodes: 1             默认情况下，多个节点可以在同一个安装路径启动，如果你想让你的es只启动一个节点，可以进行如下设置
index.number_of_shards: 5                   配置索引的默认分片数，默认值为5
index.number_of_replicas: 1                 配置索引的默认副本数，默认值为1
path.conf: /path/to/conf                    配置文件所在的位置，即elasticsearch.yml和logging.yml所在的位置
path.data: /path/to/data                    分配给当前节点的索引数据所在的位置
path.work: /path/to/work                    临时文件位置
path.logs: /path/to/logs                    日志文件所在位置
path.plugins: /path/to/plugins              插件安装位置
plugin.mandatory: mapper-attachments,lang-groovy 
                                            插件托管位置，若列表中的某一个插件未安装，则节点无法启动： 
bootstrap.mlockall: true                    JVM开始交换时，ElasticSearch表现并不好：你需要保障JVM不进行交换，可以将bootstrap.mlockall设置为true禁止交换
network.bind_host: 192.168.0.1              默认情况下，ElasticSearch使用0.0.0.0地址，并为http传输开启9200-9300端口，为节点到节点的通信开启9300-9400端口，也可以自行设置IP地址
network.publish_host: 192.168.0.1           publish_host设置其他节点连接此节点的地址，如果不设置的话，则自动获取，publish_host的地址必须为真实地址
network.host: 192.168.0.1                   bind_host和publish_host可以一起设置
transport.tcp.port: 9300                    配置节点之间交互的端口
transport.tcp.compress: true                节点间交互时，可以设置是否压缩，转为为不压缩
http.port: 9200                             可以为Http传输监听定制端口
http.max_content_length: 100mb              设置内容的最大长度
http.enabled: false                         禁止HTTP 
http.cors.enabled: true                     设置运行跨域访问，默认为false
http.cors.allow-origin: "*"                 设置跨域访问的允许范围
gateway.type: local                         网关允许在所有集群重启后持有集群状态，集群状态的变更都会被保存下来，当第一次启用集群时，可以从网关中读取到状态
gateway.recover_after_nodes: 1              允许在N个节点启动后恢复过程
gateway.recover_after_time: 5m              设置初始化恢复过程的超时时间
gateway.expected_nodes: 2                   设置该集群中可存在的节点上限
cluster.routing.allocation.node_initial_primaries_recoveries: 4 
                                            设置一个节点的并发数量，有两种情况，一种是在初始复苏过程中，另一种是在添加、删除节点及调整时
indices.recovery.max_size_per_sec: 0        设置复苏时的吞吐量，默认情况下是无限的
indices.recovery.concurrent_streams: 5      设置从对等节点恢复片段时打开的流的数量上限
discovery.zen.minimum_master_nodes: 1       设置一个集群中主节点的数量，当多于三个节点时，该值可在2-4之间
discovery.zen.ping.timeout: 3s              设置ping其他节点时的超时时间，网络比较慢时可将该值设大
discovery.zen.ping.multicast.group:224.2.2.4组地址
discovery.zen.ping.multicast.port：54328    端口
discovery.zen.ping.multicast.ttl:3          广播消息ttl
discovery.zen.ping.multicast.address:null   绑定的地址，null表示绑定所有可用的网络接口
discovery.zen.ping.multicast.enabled:true   多播自动发现禁用开关，默认值为true

discovery.zen.ping.unicast.hosts: ["host1", "host2:port", "host3[portX-portY]"] 
                                            设置新节点被启动时能够发现的主节点列表（主要用于不同网段机器连接）


action.destructive_requires_name            设置是否可以通过正则或者_all删除或者关闭索引，默认false 允许 可设置true不允许
action.auto_create_index: true              是否允许自动创建索引，除了true或者false,还可以使用名字匹配模式
action.auto_create_index: -an*,+a*,-*       允许自动创建以a开头的索引，但以an开头的索引则允许。其他索引也必须手动创建（因为指令中的-*）。注意顺序，匹配到就不会继续往下匹配。
```



<a id="markdown-34-索引" name="34-索引"></a>
## 3.4. 索引
<a href="#menu" style="float:right">目录</a>

<a id="markdown-341-索引" name="341-索引"></a>
### 3.4.1. 索引
<a href="#menu" style="float:right">目录</a>

* 分片和副本
    * 每个索引是由一个或者多个分片组成，每个分片包含了文档集的一部分
    * 每个分片可以有副本，每个副本是分片的完整数据副本
    * 创建索引，可以指定分片和副本数，也可以按照配置文件中的默认值
    * 分片分为主分片和副分片副本。
    * 更多分片使索引能传送到更多服务器，意味着可以处理更多文件，而不会降低性能。
    * 更多分片意味着获取特定文档所需的资源量会减少，因为相较于部署更少分片时，存储在单个分片中的文件数量更少。
    * 更多分片意味着搜索索引时会面临更多问题，因为必须从更多分片中合并结果，使得查询的聚合阶段需要更多资源。
    * 更多副本会增强集群系统的容错性，因为当原始分片不可用时，其副本将替代原始分片发挥作用。只拥有单个副本，集群可能在不丢失数据的情况下遗失分片。当有两个副本时，即使丢失了原始分片及其中一个副本，一切工作仍可以很好地持续下去。
    * 更多副本意味着查询吞吐量将会增加，因为执行查询可以使用分片或分片的任一副本。
    * 一旦建立好分片，就无法更新分片数量，涉及到数据迁移的问题。副本数量可以改变。

<a id="markdown-342-映射配置" name="342-映射配置"></a>
### 3.4.2. 映射配置
<a href="#menu" style="float:right">目录</a>

* Elasticsearch有以下核心类型
    * string 字符串
    * number 数字
    * date 日期
    * boolean 布尔型
    * binary 二进制

现在来讨论Elasticsearch中可用的每个核心类型，以及它们用来定义行为的属性。

* **公共属性**
    * index_name：该属性定义将存储在索引中的字段名称。若未定义，字段将以对象的名字来命名。
    * index：可设置值为analyzed和no。另外，对基于字符串的字段，也可以设置为not_analyzed。如果设置为analyzed，该字段将被编入索引以供搜索。如果设置为no，将无法搜索该字段。默认值为analyzed。在基于字符串的字段中，还有一个额外的选项not_analyzed。此设置意味着字段将不经分析而编入索引，使用原始值被编入索引，在搜索的过程中必须全部匹配。索引属性设置为no将使include_in_all属性失效。
    * store：这个属性的值可以是yes或no，指定了该字段的原始值是否被写入索引中。默认值设置为no，这意味着在结果中不能返回该字段（然而，如果你使用_source字段，即使没有存储也可返回这个值），但是如果该值编入索引，仍可以基于它来搜索数据。
    * boost：该属性的默认值是1。基本上，它定义了在文档中该字段的重要性。 boost的值越高，字段中值的重要性也越高。
    * null_value：如果该字段并非索引文档的一部分，此属性指定应写入索引的值。默认的行为是忽略该字段。
    * copy_to：此属性指定一个字段，字段的所有值都将复制到该指定字段。
    * include_in_all：此属性指定该字段是否应包括在_all字段中。默认情况下，如果使用_all字段，所有字段都会包括在其中。 2.4节将更详细地介绍_all字段。
* **字符串**
字符串是最基本的文本类型，我们能够用它存储一个或多个字符。字符串字段的示例定义如
下所示：

```json
"contents" : { "type" : "string", "store" : "no", "index" :"analyzed" }
```
* 除了公共属性，基于字符串的字段还可以使用以下属性。
    * term_vector ： 此 属 性 的 值 可 以 设 置 为 no （ 默 认 值 ）、 yes 、 with_offsets 、with_positions和with_positions_offsets。它定义是否要计算该字段的Lucene词向量（ term vector）。如果你使用高亮，那就需要计算这个词向量。
    * omit_norms：该属性可以设置为true或false。对于经过分析的字符串字段，默认值为false，而对于未经分析但已编入索引的字符串字段，默认值设置为true。当属性为true时，它会禁用Lucene对该字段的加权基准计算（ norms calculation），这样就无法使用索引期间的加权，从而可以为只用于过滤器中的字段节省内存（在计算所述文件的得分时不会被考虑在内）。
    * analyzer：该属性定义用于索引和搜索的分析器名称。它默认为全局定义的分析器名称。
    * index_analyzer：该属性定义了用于建立索引的分析器名称。
    * search_analyzer：该属性定义了的分析器，用于处理发送到特定字段的那部分查询字符串。
    * norms.enabled：此属性指定是否为字段加载加权基准（ norms）。默认情况下，为已分析字段设置为true（这意味着字段可加载加权基准），而未经分析字段则设置为false。
    * norms.loading：该属性可设置eager和lazy。第一个属性值表示此字段总是载入加权基准。第二个属性值是指只在需要时才载入。
    * position_offset_gap：此属性的默认值为0，它指定索引中在不同实例中具有相同名称的字段的差距。若想让基于位置的查询（如短语查询）只与一个字段实例相匹配，可将该属性值设为较高值。
    * index_options：该属性定义了信息列表（ postings list）的索引选项（ 2.2.4节将详细讨论）。可能的值是docs（仅对文档编号建立索引）， freqs（对文档编号和词频建立索引），positions（对文档编号、词频和它们的位置建立索引）， offsets（对文档编号、词频、它们的位置和偏移量建立索引）。对于经分析的字段，此属性的默认值是positions，对于未经分析的字段，默认值为docs。
    * ignore_above：该属性定义字段中字符的最大值。当字段的长度高于指定值时，分析器会将其忽略。
* **数值**

* 这一核心类型汇集了所有适用的数值字段类型Elasticsearch中可使用以下类型（使用type属性指定）。
    * byte：定义字节值，例如1。
    * short：定义短整型值，例如12。
    * integer：定义整型值，例如134。
    * long：定义长整型值，例如123456789。   
    * float：定义浮点值，例如12.23。
    * double：定义双精度值，例如123.45。
* 数值类型字段的定义如下所示：
```json
"price" : { "type" : "float", "store" : "yes", "precision_step" : "4" }
```
* 除了公共属性，以下属性也适用于数值字段。
    * precision_step：此属性指定为某个字段中每个值生成的词条数。值越低，产生的词条数越高。对于每个值的词条数更高的字段，范围查询（ range query）会更快，但索引会稍微大点，默认值为4。
    * ignore_malformed：此属性值可以设为true或false。默认值是false。若要忽略格式错误的值，则应设置属性值为true。
    * 布尔值
        布尔值核心类型是专为索引布尔值（ true或false）设计的。基于布尔值类型的字段定义如下所示："allowed" : { "type" : "boolean", "store": "yes" }
    * 二进制
        * 二进制字段是存储在索引中的二进制数据的Base64表示，可用来存储以二进制形式正常写入的数据，例如图像。基于此类型的字段在默认情况下只被存储，而不索引，因此只能提取，但无法对其执行搜索操作。二进制类型只支持index_name属性。基于binary字段的字段定义如下所示："image" : { "type" : "binary" }
    * 日期
        * 日期核心类型被设计用于日期的索引。它遵循一个特定的、可改变的格式，并默认使用UTC保存。能被Elasticsearch理解的默认日期格式是相当普遍的，它允许指定日期，也可指定时间，例如， 2012-12-24T12:10:22。基于日期类型的字段的示例定义如下所示："published" : { "type" : "date", "store" : "yes", "format" :"YYYY-mm-dd" }使用上述字段的示例文档如下所示{"name" : "Sample document","published" : "2012-12-22"}
* 除了公共属性，日期类型的字段还可以设置以下属性。
    * format：此属性指定日期的格式。默认值为dateOptionalTime。对于格式的完整列表，请 访 问 http://www.elasticsearch.org/guide/en/elasticsearch/reference/current/mapping-dateormat.html。
    * precision_step：此属性指定在该字段中的每个值生成的词条数。该值越低，产生的词条数越高，从而范围查询的速度越快（但索引大小增加）。默认值是4。
    * ignore_malformed：此属性值可以设为true或false，默认值是false。若要忽略格式错误的值，则应设置属性值为true。

* 多字段
    * 有时候你希望两个字段中有相同的字段值，例如，一个字段用于搜索，一个字段用于排序；或一个经语言分析器分析，一个只基于空白字符来分析。 Elasticsearch允许加入多字段对象来拓展字段定义，从而解决这个需求。它允许把几个核心类型映射到单个字段，并逐个分析。例如，想计算切面并在name字段中搜索，可以定义以下字段：

```json
"name": {
    "type": "string",
    "fields": {
        "facet": { "type" : "string", "index": "not_analyzed" }
    }
}
```
上述定义将创建两个字段：我们将第一个字段称为name，第二个称为name.facet。当然，你不必在索引的过程中指定两个独立字段，指定一个name字段就足够了。 Elasticsearch会处理余下的工作，将该字段的数值复制到多字段定义的所有字段。

* **IP地址类型**
Elasticsearch添加了IP字段类型，以数字形式简化IPv4地址的使用。此字段类型可以帮搜索作为IP地址索引的数据、对这些数据排序，并使用IP值做范围查询。基于IP地址类型的字段示例定义如下所示：
```json
"address" : { "type" : "ip", "store" : "yes" }
```
除公共属性外， IP地址类型的字段还可以设置precision_step属性。该属性指定了字段中的每个值生成的词条数。值越低，词条数越高。对于每个值的词条数更高的字段，范围查询会更快，但索引会稍微大点，默认值为4。

* **使用分析器**
正如我们提到的那样，对于字符串类型的字段，可以指定Elasticsearch应该使用哪个分析器。
回想第1章的内容，分析器是一个用于分析数据或以我们想要的方式查询数据的工具。例如，用
空格和小写字符把单词隔开时，不必担心用户发送的单词是小写还是大写。 Elasticsearch使我们
能够在索引和查询时使用不同的分析器，并且可以在搜索过程的每个阶段选择处理数据的方式。
使用分析器时，只需在指定字段的正确属性上设置它的名字，就这么简单。

* 开箱即用的分析器,Elasticsearch允许我们使用众多默认定义的分析器中的一种。如下分析器可以开箱即用。
    * standard：方便大多数欧洲语言的标准分析器（关于参数的完整列表，请参阅http://www.lasticsearch.org/guide/en/elasticsearch/reference/current/analysis-standard-analyzer.html）。
    * simple：这个分析器基于非字母字符来分离所提供的值，并将其转换为小写形式。
    * whitespace：这个分析器基于空格字符来分离所提供的值。
    * stop：这个分析器类似于simple分析器，但除了simple分析器的功能，它还能基于所提供的停用词（ stop word）过滤数据（参数的完整列表，请参阅http://www.elasticsearch.rg/guide/en/elasticsearch/reference/current/analysis-stop-analyzer.html）。
    * keyword：这是一个非常简单的分析器，只传入提供的值。你可以通过指定字段为not_analyzed来达到相同的目的。
    * pattern：这个分析器通过使用正则表达式灵活地分离文本（参数的完整列表，请参阅http://www.elasticsearch.org/guide/en/elasticsearch/reference/current/analysis-pattern-analyzer.html）。
    * language：这个分析器旨在特定的语言环境下工作。该分析器所支持语言的完整列表可参考http://www.elasticsearch.org/guide/en/elasticsearch/reference/current/nalysis-lang-analyzer. tml。
    * snowball：这个分析器类似于standard分析器，但提供了词干提取算法（ stemmingalgorithm ， 参 数 的 完 整 列 表 请 参 阅 http://www.elasticsearch.org/guide/en/elasticsearch/eference/current/analysis-snowball-analyzer.html）。


<a id="markdown-35-集群管理" name="35-集群管理"></a>
## 3.5. 集群管理
<a href="#menu" style="float:right">目录</a>

一个节点(node)就是一个Elasticsearch实例， 而一个集群(cluster)由一个或多个节点组成， 它们具有相同的 cluster.name 它们协同工作， 分享数据和负载。 当加入新的节点或者删除一个节点时， 集群就会感知到并平衡数据。

集群中一个节点会被选举为主节点(master),它将临时管理集群级别的一些变更， 例如新建或删除索引、 增加或移除节点等。主节点不参与文档级别的变更或搜索， 这意味着在流量增长的时候， 该主节点不会成为集群的瓶颈。 任何节点都可以成为主节点。 我们例子中的集群只有一个节点， 所以它会充当主节点的角色。

做为用户， 我们能够与集群中的任何节点通信， 包括主节点。 每一个节点都知道文档存在于哪个节点上，它们可以转发请求到相应的节点上。 我们访问的节点负责收集各节点返回的数据， 最后一起返回给客户端。 这一切都由Elasticsearch处理。

<a id="markdown-351-集群健康" name="351-集群健康"></a>
### 3.5.1. 集群健康
<a href="#menu" style="float:right">目录</a>

|颜色| 意义|
|---|---|
|green| 所有主要分片和复制分片都可用
|yellow| 所有主要分片可用， 但不是所有复制分片都可用
|red| 不是所有的主要分片都可用

比如你定义三个分片，每个分片有2个副本。
* 当只启动一个节点时，主分片可用，但是副本只有一个。此时为**yellow**
* 当启动两个节点时，主分片和副本分片都可用，此时为**green**.此时el平衡负载，可能两个节点都有主分片。
* 此时关闭一个节点，必然至少有一个主分片被关掉，此时状态为**red**.经过内部调整，被关掉的主分片的副本分片升级为主分片，此时所有主要分片可用， 但不是所有复制分片都可用，因此为yellow

<a id="markdown-352-添加索引" name="352-添加索引"></a>
### 3.5.2. 添加索引
<a href="#menu" style="float:right">目录</a>


为了将数据添加到Elasticsearch， 我们需要索引(index)——一个存储关联数据的地方。 实际上， 索引只是一个用来指向一个或多个分片(shards)的“逻辑命名空间(logical namespace)”.
一个分片(shard)是一个最小级别“工作单元(worker unit)”,它只是保存了索引中所有数据的一部分。 在接下来的《深入分片》 一章， 我们将详细说明分片的工作原理， 但是现在我们只要知道分片就是一个Lucene实例， 并且它本身就是一个完整的搜索引擎。 我们的文档存储在分片中， 并且在分片中被索引， 但是我们的应用程序不会直接与它们通信， 取而代之的是， 直接与索引通信。
分片是Elasticsearch在集群中分发数据的关键。 把分片想象成数据的容器。 文档存储在分片中， 然后分片分配到你集群中的节点上。 当你的集群扩容或缩小， Elasticsearch将会自动在你的节点间迁移分片， 以使集群保持平衡。
分片可以是主分片(primary shard)或者是复制分片(replica shard)。 你索引中的每个文档属于一个单独的主分片， 所以主分片的数量决定了索引最多能存储多少数据。
理论上主分片能存储的数据大小是没有限制的， 限制取决于你实际的使用情况。 分片的最大容量完全取决于你的使用状况： 硬件存储的大小、 文档的大小和复杂度、 如何索引和查询你的文档， 以及你期望的响应时间。
复制分片只是主分片的一个副本， 它可以防止硬件故障导致的数据丢失， 同时可以提供读请求， 比如搜索或者从别的shard取回文档。
当索引创建完成的时候， 主分片的数量就固定了， 但是复制分片的数量可以随时调整。
让我们在集群中唯一一个空节点上创建一个叫做 blogs 的索引。 默认情况下， 一个索引被分配5个主分片，但是为了演示的目的， 我们只分配3个主分片和一个复制分片（每个主分片都有一个复制分片）

```json
PUT /blogs
{
    "settings" : {
        "number_of_shards" : 3,
        "number_of_replicas" : 1
    }
}
```


<a id="markdown-36-数据" name="36-数据"></a>
## 3.6. 数据
<a href="#menu" style="float:right">目录</a>

<a id="markdown-361-文档" name="361-文档"></a>
### 3.6.1. 文档
<a href="#menu" style="float:right">目录</a>

在Elasticsearch中， 文档(document)这个术语有着特殊含义。 它特指最顶层结构或者根对象(root object)序列化成的JSON数据（以唯一ID标识并存储于Elasticsearch中） 。

**文档元数据**
一个文档不只有数据。 它还包含了元数据(metadata)——关于文档的信息。 三个必须的元数据节点是：
|节点| 说明
|---|---|
|_index| 文档存储的地方
|_type| 文档代表的对象的类
|_id| 文档的唯一标识

**_index**
索引(index)类似于关系型数据库里的“数据库”——它是我们存储和索引关联数据的地方。
提示：
事实上，我们的数据被存储和索引在分片(shards)中， 索引只是一个把一个或多个分片分组在一起的逻辑空间。 然而， 这只是一些内部细节——我们的程序完全不用关心分片。 对于我们的程序而言， 文档存储在索引(index)中。 剩下的细节由Elasticsearch关心既可。

索引名必须是全部小写，不能以下划线开头，不能包含逗号。 让我们使用 website 做为索引名。

**_type**
在应用中， 我们使用对象表示一些“事物”， 例如一个用户、 一篇博客、 一个评论， 或者一封邮件。 每个对象都属于一个类(class)， 这个类定义了属性或与对象关联的数据。 user 类的对象可能包含姓名、 性别、 年龄和Email地址。
在关系型数据库中， 我们经常将相同类的对象存储在一个表里， 因为它们有着相同的结构。 同理， 在Elasticsearch中， 我们使用相同类型(type)的文档表示相同的“事物”， 因为他们的数据结构也是相同的。
每个类型(type)都有自己的映射(mapping)或者结构定义， 就像传统数据库表中的列一样。 所有类型下的文档被存储在同一个索引下， 但是类型的映射(mapping)会告诉Elasticsearch不同的文档如何被索引。 我们将会在《映射》 章节探讨如何定义和管理映射， 但是现在我们将依赖ELasticsearch去自动处理数据结构。
_type 的名字可以是大写或小写， 不能包含下划线或逗号。 我们将使用 `blog 做为类型名。

**_id**
d仅仅是一个字符串， 它与 _index 和 _type 组合时， 就可以在ELasticsearch中唯一标识一个文档。 当创建一个文档， 你可以自定义 _id ， 也可以让Elasticsearch帮你自动生成。


<a id="markdown-362-处理冲突" name="362-处理冲突"></a>
### 3.6.2. 处理冲突
<a href="#menu" style="float:right">目录</a>

当某个文档被并发修改时，如何确保修改丢失?

在数据库中， 有两种通用的方法确保在并发更新时修改不丢失：
* 悲观并发控制
    * 这在关系型数据库中被广泛的使用， 假设冲突的更改经常发生， 为了解决冲突我们把访问区块化。 典型的例子是在读一行数据前锁定这行， 然后确保只有加锁的那个线程可以修改这行数据。
* 乐观并发控制
    * 被Elasticsearch使用， 假设冲突不经常发生， 也不区块化访问， 然而， 如果在读写过程中数据发生了变化， 更新操作将失败。 这时候由程序决定在失败后如何解决冲突。 实际情况中， 可以重新尝试更新， 刷新数据（重新读取） 或者直接反馈给用户。

Elasticsearch是分布式的。 当文档被创建、 更新或删除， 文档的新版本会被复制到集群的其它节点。 Elasticsearch即是同步的又是异步的， 意思是这些复制请求都是平行发送的， 并无序(out of sequence)的到达目的地。 这就需要一种方法确保老版本的文档永远不会覆盖新的版本.

每个文档都有一个 _version 号码， 这个号码在文档被改变时加一。Elasticsearch使用这个_version 保证所有修改都被正确排序。 当一个旧版本出现在新版本之后， 它会被简单的忽略。



<a id="markdown-37-分布式增删改查" name="37-分布式增删改查"></a>
## 3.7. 分布式增删改查
<a href="#menu" style="float:right">目录</a>

<a id="markdown-371-路由文档到分片" name="371-路由文档到分片"></a>
### 3.7.1. 路由文档到分片
<a href="#menu" style="float:right">目录</a>

当你索引一个文档， 它被存储在单独一个主分片上。 Elasticsearch是如何知道文档属于哪个分片的呢？ 当你创建一个新文档， 它是如何知道是应该存储在分片1还是分片2上的呢？
进程不能是随机的， 因为我们将来要检索文档。 事实上， 它根据一个简单的算法决定：shard = hash(routing) % number_of_primary_shards ，routing 值是一个任意字符串， 它默认是 _id 但也可以自定义。 这个 routing 字符串通过哈希函数生成一个数字， 然后除以主切片的数量得到一个余数(remainder)， 余数的范围永远是 0 到 number_of_primary_shards - 1 ， 这个数字就是特定文档所在的分片。
这也解释了为什么主分片的数量只能在创建索引时定义且不能修改： 如果主分片的数量在未来改变了， 所有先前的路由值就失效了， 文档也就永远找不到了。
有时用户认为固定数量的主分片会让之后的扩展变得很困难。 现实中， 有些技术会在你需要的时候让扩展变得容易。

<a id="markdown-372-分片交互" name="372-分片交互"></a>
### 3.7.2. 分片交互
<a href="#menu" style="float:right">目录</a>

每个节点都能够接收客户端的请求，每个节点都能知道任意文档所在的节点，所以也可以将请求转发到需要的节点。

<a id="markdown-3721-新建索引和删除文档" name="3721-新建索引和删除文档"></a>
#### 3.7.2.1. 新建，索引和删除文档
<a href="#menu" style="float:right">目录</a>


新建、索引和删除请求都是写(write)操作， 它们必须在主分片上成功完成才能复制到相关的复制分片上。

* 在主分片和复制分片上成功新建、 索引或删除一个文档必要的顺序步骤：
1. 客户端给 Node 1 发送新建、 索引或删除请求。
2. 节点使用文档的 _id 确定文档属于分片 0 。 它转发请求到 Node 3 ， 分片 0 位于这个节点上。
3. Node 3 在主分片上执行请求， 如果成功， 它转发请求到相应的位于 Node 1 和 Node 2 的复制节点上。 当所有的复制节点报告成功， Node 3 报告成功到请求的节点， 请求的节点再报告给客户端。

![document-write](https://github.com/lgjlife/Java-Study/blob/master/pic/elasticsearch/document-write.png?raw=true)

客户端接收到成功响应的时候， 文档的修改已经被应用于主分片和所有的复制分片。 你的修改生效了。
有很多可选的请求参数允许你更改这一过程。 你可能想牺牲一些安全来提高性能。 这一选项很少使用因为Elasticsearch已经足够快， 不过为了内容的完整我们将做一些阐述。

**replication**

复制默认的值是 sync 。 这将导致主分片得到复制分片的成功响应后才返回。
如果你设置 replication 为 async ， 请求在主分片上被执行后就会返回给客户端。 它依旧会转发请求给复制节点， 但你将不知道复制节点成功与否。
上面的这个选项不建议使用。 默认的 sync 复制允许Elasticsearch强制反馈传输。 async 复制可能会因为在不等待其它分片就绪的情况下发送过多的请求而使Elasticsearch过载。

**consistency**

默认主分片在尝试写入时需要规定数量(quorum)或过半的分片（可以是主节点或复制节点） 可用。 这是防止数据被写入到错的网络分区。 规定的数量计算公式如下：
int( (primary + number_of_replicas) / 2 ) + 1
consistency 允许的值为 one （只有一个主分片） ， all （所有主分片和复制分片） 或者默认的 quorum 或过半分片。
注意 number_of_replicas 是在索引中的的设置， 用来定义复制分片的数量， 而不是现在活动的复制节点的数量。 如果你定义了索引有3个复制节点， 那规定数量是：

int( (primary + 3 replicas) / 2 ) + 1 = 3
但如果你只有2个节点， 那你的活动分片不够规定数量， 也就不能索引或删除任何文档。

**timeout**
当分片副本不足时会怎样？ Elasticsearch会等待更多的分片出现。 默认等待一分钟。 如果需要， 你可以设置 timeout 参数让它终止的更早： 100 表示100毫秒， 30s 表示30秒。
注意：
新索引默认有 1 个复制分片， 这意味着为了满足 quorum 的要求需要两个活动的分片。 当然， 这个默认设置将阻止我们在单一节点集群中进行操作。 为了避开这个问题， 规定数量只有在 number_of_replicas 大于一时才生效。

<a id="markdown-3722-索引文档" name="3722-索引文档"></a>
#### 3.7.2.2. 索引文档
<a href="#menu" style="float:right">目录</a>


文档能够从主分片或任意一个复制分片被检索。

![document-write](https://github.com/lgjlife/Java-Study/blob/master/pic/elasticsearch/document-read.png?raw=true)

1. 客户端给 Node 1 发送get请求。
2. 节点使用文档的 _id 确定文档属于分片 0 。 分片 0 对应的复制分片在三个节点上都有。 此时， 它转发请求到 Node 2 。
3. Node 2 返回endangered给 Node 1 然后返回给客户端。

对于读请求， 为了平衡负载， 请求节点会为每个请求选择不同的分片——它会循环所有分片副本。

可能的情况是， 一个被索引的文档已经存在于主分片上却还没来得及同步到复制分片上。 这时复制分片会报告文档未找到，主分片会成功返回文档。一旦索引请求成功返回给用户，文档则在主分片和复制分片都是可用的。

<a id="markdown-38-面试小结之elasticsearch篇" name="38-面试小结之elasticsearch篇"></a>
## 3.8. 面试小结之Elasticsearch篇
<a href="#menu" style="float:right">目录</a>

**Elasticsearch是如何实现Master选举的？**
* Elasticsearch的选主是ZenDiscovery模块负责的，主要包含Ping（节点之间通过这个RPC来发现彼此）和Unicast（单播模块包含一个主机列表以控制哪些节点需要ping通）这两部分；
* 对所有可以成为master的节点（node.master: true）根据nodeId字典排序，每次选举每个节点都把自己所知道节点排一次序，然后选出第一个（第0位）节点，暂且认为它是master节点。
* 如果对某个节点的投票数达到一定的值（可以成为master节点数n/2+1）并且该节点自己也选举自己，那这个节点就是master。否则重新选举一直到满足上述条件。
* 补充：master节点的职责主要包括集群、节点和索引的管理，不负责文档级别的管理；data节点可以关闭http功能。

**Elasticsearch中的节点（比如共20个），其中的10个选了一个master，另外10个选了另一个master，怎么办？**

* 当集群master候选数量不小于3个时，可以通过设置最少投票通过数量（discovery.zen.minimum_master_nodes）超过所有候选节点一半以上来解决脑裂问题；
* 当候选数量为两个时，只能修改为唯一的一个master候选，其他作为data节点，避免脑裂问题。

**客户端在和集群连接时，如何选择特定的节点执行请求的？**

* TransportClient利用transport模块远程连接一个elasticsearch集群。它并不加入到集群中，只是简单的获得一个或者多个初始化的transport地址，并以 轮询 的方式与这些地址进行通信。

**详细描述一下Elasticsearch索引文档的过程。**
* 协调节点默认使用文档ID参与计算（也支持通过routing），以便为路由提供合适的分片。
shard = hash(document_id) % (num_of_primary_shards)
* 当分片所在的节点接收到来自协调节点的请求后，会将请求写入到Memory Buffer，然后定时（默认是每隔1秒）写入到Filesystem Cache，这个从Momery Buffer到Filesystem Cache的过程就叫做refresh；
* 当然在某些情况下，存在Momery Buffer和Filesystem Cache的数据可能会丢失，ES是通过translog的机制来保证数据的可靠性的。其实现机制是接收到请求后，同时也会写入到translog中，当Filesystem cache中的数据写入到磁盘中时，才会清除掉，这个过程叫做flush；
* 在flush过程中，内存中的缓冲将被清除，内容被写入一个新段，段的fsync将创建一个新的提交点，并将内容刷新到磁盘，旧的translog将被删除并开始一个新的translog。
* flush触发的时机是定时触发（默认30分钟）或者translog变得太大（默认为512M）时；
![Elasticsearch索引文档的过程](https://upload-images.jianshu.io/upload_images/3709321-2084bd0268a42ae1.jpeg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

* 补充：关于Lucene的Segement：
    * Lucene索引是由多个段组成，段本身是一个功能齐全的倒排索引。
    * 段是不可变的，允许Lucene将新的文档增量地添加到索引中，而不用从头重建索引。
    * 对于每一个搜索请求而言，索引中的所有段都会被搜索，并且每个段会消耗CPU的时钟周、文件句柄和内存。这意味着段的数量越多，搜索性能会越低。
    * 为了解决这个问题，Elasticsearch会合并小段到一个较大的段，提交新的合并段到磁盘，并删除那些旧的小段。
    
**详细描述一下Elasticsearch更新和删除文档的过程**
* 删除和更新也都是写操作，但是Elasticsearch中的文档是不可变的，因此不能被删除或者改动以展示其变更；
* 磁盘上的每个段都有一个相应的.del文件。当删除请求发送后，文档并没有真的被删除，而是在.del文件中被标记为删除。该文档依然能匹配查询，但是会在结果中被过滤掉。当段合并时，在.del文件中被标记为删除的文档将不会被写入新段。
* 在新的文档被创建时，Elasticsearch会为该文档指定一个版本号，当执行更新时，旧版本的文档在.del文件中被标记为删除，新版本的文档被索引到一个新段。旧版本的文档依然能匹配查询，但是会在结果中被过滤掉。

**详细描述一下Elasticsearch搜索的过程。**
* 搜索被执行成一个两阶段过程，我们称之为 Query Then Fetch；
* 在初始查询阶段时，查询会广播到索引中每一个分片拷贝（主分片或者副本分片）。 每个分片在本地执行搜索并构建一个匹配文档的大小为 from + size 的优先队列。PS：在搜索的时候是会查询Filesystem Cache的，但是有部分数据还在Memory Buffer，所以搜索是近实时的。
* 每个分片返回各自优先队列中 所有文档的 ID 和排序值 给协调节点，它合并这些值到自己的优先队列中来产生一个全局排序后的结果列表。
* 接下来就是 取回阶段，协调节点辨别出哪些文档需要被取回并向相关的分片提交多个 GET 请求。每个分片加载并 丰富 文档，如果有需要的话，接着返回文档给协调节点。一旦所有的文档都被取回了，协调节点返回结果给客户端。
* 补充：Query Then Fetch的搜索类型在文档相关性打分的时候参考的是本分片的数据，这样在文档数量较少的时候可能不够准确，DFS Query Then Fetch增加了一个预查询的处理，询问Term和Document frequency，这个评分更准确，但是性能会变差。

![Elasticsearch执行搜索的过程](https://upload-images.jianshu.io/upload_images/3709321-88f589037638c93d.jpeg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


**在Elasticsearch中，是怎么根据一个词找到对应的倒排索引的？**

* SEE：
    * Lucene的索引文件格式(1)
    * Lucene的索引文件格式(2)

**Elasticsearch在部署时，对Linux的设置有哪些优化方法？**
* 64GB内存的机器是非常理想的，但是32GB和16GB机器也是很常见的。少于8GB会适得其反。
* 如果你要在更快的 CPUs 和更多的核心之间选择，选择更多的核心更好。多个内核提供的额外并发远胜过稍微快一点点的时钟频率。
* 如果你负担得起 SSD，它将远远超出任何旋转介质。 基于 SSD 的节点，查询和索引性能都有提升。如果你负担得起，SSD 是一个好的选择。
* 即使数据中心们近在咫尺，也要避免集群跨越多个数据中心。绝对要避免集群跨越大的地理距离。
* 请确保运行你应用程序的 JVM 和服务器的 JVM 是完全一样的。 在 Elasticsearch 的几个地方，使用 Java 的本地序列化。
* 通过设置gateway.recover_after_nodes、gateway.expected_nodes、gateway.recover_after_time可以在集群重启的时候避免过多的分片交换，这可能会让数据恢复从数个小时缩短为几秒钟。
* Elasticsearch 默认被配置为使用单播发现，以防止节点无意中加入集群。只有在同一台机器上运行的节点才会自动组成集群。最好使用单播代替组播。
* 不要随意修改垃圾回收器（CMS）和各个线程池的大小。
* 把你的内存的（少于）一半给 Lucene（但不要超过 32 GB！），通过ES_HEAP_SIZE 环境变量设置。
* 内存交换到磁盘对服务器性能来说是致命的。如果内存交换到磁盘上，一个 100 微秒的操作可能变成 10 毫秒。 再想想那么多 10 微秒的操作时延累加起来。 不难看出 swapping 对于性能是多么可怕。
* Lucene 使用了大量的文件。同时，Elasticsearch 在节点和 HTTP 客户端之间进行通信也使用了大量的套接字。 所有这一切都需要足够的文件描述符。你应该增加你的文件描述符，设置一个很大的值，如 64,000。

* 补充：索引阶段性能提升方法
    * 使用批量请求并调整其大小：每次批量数据 5–15 MB 大是个不错的起始点。
    * 存储：使用 SSD
    * 段和合并：Elasticsearch 默认值是 20 MB/s，对机械磁盘应该是个不错的设置。如果你用的是 SSD，可以考虑提高到 100–200 MB/s。如果你在做批量导入，完全不在意搜索，你可以彻底关掉合并限流。另外还可以增加 index.translog.flush_threshold_size 设置，从默认的 512 MB 到更大一些的值，比如 1 GB，这可以在一次清空触发的时候在事务日志里积累出更大的段。 
    * 如果你的搜索结果不需要近实时的准确度，考虑把每个索引的index.refresh_interval 改到30s。
    * 如果你在做大批量导入，考虑通过设置index.number_of_replicas: 0 关闭副本。

**对于GC方面，在使用Elasticsearch时要注意什么？**
* SEE：https://elasticsearch.cn/article/32
* 倒排词典的索引需要常驻内存，无法GC，需要监控data node上segment memory增长趋势。
* 各类缓存，field cache, filter cache, indexing cache, bulk queue等等，要设置合理的大小，并且要应该根据最坏的情况来看heap是否够用，也就是各类缓存全部占满的时候，还有heap空间可以分配给其他任务吗？避免采用clear cache等“自欺欺人”的方式来释放内存。
* 避免返回大量结果集的搜索与聚合。确实需要大量拉取数据的场景，可以采用scan & scroll api来实现。
* cluster stats驻留内存并无法水平扩展，超大规模集群可以考虑分拆成多个集群通过tribe node连接。
想知道heap够不够，必须结合实际应用场景，并对集群的heap使用情况做持续的监控。


**Elasticsearch对于大数据量（上亿量级）的聚合如何实现？**
* Elasticsearch 提供的首个近似聚合是cardinality 度量。它提供一个字段的基数，即该字段的distinct或者unique值的数目。它是基于HLL算法的。HLL 会先对我们的输入作哈希运算，然后根据哈希运算的结果中的 bits 做概率估算从而得到基数。其特点是：可配置的精度，用来控制内存的使用（更精确 ＝ 更多内存）；小的数据集精度是非常高的；我们可以通过配置参数，来设置去重需要的固定内存使用量。无论数千还是数十亿的唯一值，内存使用量只与你配置的精确度相关。

**在并发情况下，Elasticsearch如果保证读写一致？**
* 可以通过版本号使用乐观并发控制，以确保新版本不会被旧版本覆盖，由应用层来处理具体的冲突；
另外对于写操作，一致性级别支持quorum/one/all，默认为quorum，即只有当大多数分片可用时才允许写操作。但即使大多数可用，也可能存在因为网络等原因导致写入副本失败，这样该副本被认为故障，分片将会在一个不同的节点上重建。
* 对于读操作，可以设置replication为sync(默认)，这使得操作在主分片和副本分片都完成后才会返回；* 如果设置replication为async时，也可以通过设置搜索请求参数_preference为primary来查询主分片，确保文档是最新版本。

**如何监控Elasticsearch集群状态？**
* Marvel 让你可以很简单的通过 Kibana 监控 Elasticsearch。你可以实时查看你的集群健康状态和性能，也可以分析过去的集群、索引和节点指标。

**介绍下你们电商搜索的整体技术架构**
![整体技术架构](https://upload-images.jianshu.io/upload_images/3709321-3a013fdb77aa88fc.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


**介绍一下你们的个性化搜索方案？**

* SEE 基于word2vec和Elasticsearch实现个性化搜索

**是否了解字典树？**

* 常用字典数据结构如下所示：
![常用字典数据结构](https://upload-images.jianshu.io/upload_images/3709321-7b6f0fab6f412f51.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

* Trie的核心思想是空间换时间，利用字符串的公共前缀来降低查询时间的开销以达到提高效率的目的。它有3个基本性质：
根节点不包含字符，除根节点外每一个节点都只包含一个字符。
从根节点到某一节点，路径上经过的字符连接起来，为该节点对应的字符串。
每个节点的所有子节点包含的字符都不相同。
![字典树](https://github.com/julycoding/The-Art-Of-Programming-By-July/raw/master/ebook/images/8/8.4/1.jpg)


可以看到，trie树每一层的节点数是26^i级别的。所以为了节省空间，我们还可以用动态链表，或者用数组来模拟动态。而空间的花费，不会超过单词数×单词长度。
实现：对每个结点开一个字母集大小的数组，每个结点挂一个链表，使用左儿子右兄弟表示法记录这棵树；
对于中文的字典树，每个节点的子节点用一个哈希表存储，这样就不用浪费太大的空间，而且查询速度上可以保留哈希的复杂度O(1)。

**拼写纠错是如何实现的？**
* 拼写纠错是基于编辑距离来实现；编辑距离是一种标准的方法，它用来表示经过插入、删除和替换操作从一个字符串转换到另外一个字符串的最小操作步数；
* 编辑距离的计算过程：比如要计算batyu和beauty的编辑距离，先创建一个7×8的表（batyu长度为5，coffee长度为6，各加2），接着，在如下位置填入黑色数字。其他格的计算过程是取以下三个值的最小值：
如果最上方的字符等于最左方的字符，则为左上方的数字。否则为左上方的数字+1。（对于3,3来说为0）
左方数字+1（对于3,3格来说为2）
上方数字+1（对于3,3格来说为2）
最终取右下角的值即为编辑距离的值3。

![编辑距离](https://upload-images.jianshu.io/upload_images/3709321-31bef8a5bbf14a13.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


对于拼写纠错，我们考虑构造一个度量空间（Metric Space），该空间内任何关系满足以下三条基本条件：
d(x,y) = 0 -- 假如x与y的距离为0，则x=y
d(x,y) = d(y,x)  -- x到y的距离等同于y到x的距离
d(x,y) + d(y,z) >= d(x,z) -- 三角不等式
* 根据三角不等式，则满足与query距离在n范围内的另一个字符转B，其与A的距离最大为d+n，最小为d-n。
* BK树的构造就过程如下：每个节点有任意个子节点，每条边有个值表示编辑距离。所有子节点到父节点的边上标注n表示编辑距离恰好为n。比如，我们有棵树父节点是”book”和两个子节点”cake”和”books”，”book”到”books”的边标号1，”book”到”cake”的边上标号4。从字典里构造好树后，无论何时你想插入新单词时，计算该单词与根节点的编辑距离，并且查找数值为d(neweord, root)的边。递归得与各子节点进行比较，直到没有子节点，你就可以创建新的子节点并将新单词保存在那。比如，插入”boo”到刚才上述例子的树中，我们先检查根节点，查找d(“book”, “boo”) = 1的边，然后检查标号为1的边的子节点，得到单词”books”。我们再计算距离d(“books”, “boo”)=2，则将新单词插在”books”之后，边标号为2。
* 查询相似词如下：计算单词与根节点的编辑距离d，然后递归查找每个子节点标号为d-n到d+n（包含）的边。假如被检查的节点与搜索单词的距离d小于n，则返回该节点并继续查询。比如输入cape且最大容忍距离为1，则先计算和根的编辑距离d(“book”, “cape”)=4，然后接着找和根节点之间编辑距离为3到5的，这个就找到了cake这个节点，计算d(“cake”, “cape”)=1，满足条件所以返回cake，然后再找和cake节点编辑距离是0到2的，分别找到cape和cart节点，这样就得到cape这个满足条件的结果。

![BK树](https://upload-images.jianshu.io/upload_images/3709321-7cdb109e6f73c192.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

