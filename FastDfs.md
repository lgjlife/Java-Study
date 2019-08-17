
<span id="menu"></span>

[TOC]



<!-- TOC -->

- [1. FastDfs](#1-fastdfs)
    - [为什么要使用分布式文件系统](#为什么要使用分布式文件系统)
        - [单机时代](#单机时代)
        - [独立文件服务器](#独立文件服务器)
        - [分布式文件系统](#分布式文件系统)
    - [1.1. 基本概念](#11-基本概念)
        - [什么是FastDFS](#什么是fastdfs)
    - [1.2. 工作流程](#12-工作流程)
        - [1.2.1. 文件上传](#121-文件上传)
        - [1.2.2. 文件下载](#122-文件下载)
    - [1.3. FastDFS为什么要结合Nginx](#13-fastdfs为什么要结合nginx)
    - [1.4. 配置文件说明](#14-配置文件说明)
    - [1.5. FastDFS 同步机制说明：](#15-fastdfs-同步机制说明)
    - [1.6. 安装配置](#16-安装配置)
    - [1.7. Java客户端使用](#17-java客户端使用)

<!-- /TOC -->

# 1. FastDfs

<a href="#menu" style="float:right">目录</a>

## 为什么要使用分布式文件系统
<a href="#menu" style="float:right">目录</a>

### 单机时代
初创时期由于时间紧迫，在各种资源有限的情况下，通常就直接在项目目录下建立静态文件夹，用于用户存放项目中的文件资源。如果按不同类型再细分，可以在项目目录下再建立不同的子目录来区分。例如：resources\static\file、resources\static\img等。

* 优点
    * 这样做比较便利，项目直接引用就行，实现起来也简单，无需任何复杂技术，保存数据库记录和访问起来也很方便。
* 缺点
    * 如果只是后台系统的使用一般也不会有什么问题，但是作为一个前端网站使用的话就会存在弊端。一方面，文件和代码耦合在一起，文件越多存放越混乱；另一方面，如果流量比较大，静态文件访问会占据一定的资源，影响正常业务进行，不利于网站快速发展。

### 独立文件服务器
随着公司业务不断发展，将代码和文件放在同一服务器的弊端就会越来越明显。为了解决上面的问题引入独立图片服务器，工作流程如下：项目上传文件时，首先通过ftp或者ssh将文件上传到图片服务器的某个目录下，再通过ngnix或者apache来访问此目录下的文件，返回一个独立域名的图片URL地址，前端使用文件时就通过这个URL地址读取。

* 优点
    * 图片访问是很消耗服务器资源的（因为会涉及到操作系统的上下文切换和磁盘I/O操作），分离出来后，Web/App服务器可以更专注发挥动态处理的能力；独立存储，更方便做扩容、容灾和数据迁移；方便做图片访问请求的负载均衡，方便应用各种缓存策略（HTTP Header、Proxy Cache等），也更加方便迁移到CDN。
* 缺点
    * 单机存在性能瓶颈，容灾、垂直扩展性稍差

### 分布式文件系统
通过独立文件服务器可以解决一些问题，如果某天存储文件的那台服务突然down了怎么办？可能你会说，定时将文件系统备份，这台down机的时候，迅速切换到另一台就OK了，但是这样处理需要人工来干预。另外，当存储的文件超过100T的时候怎么办？单台服务器的性能问题？这个时候我们就应该考虑分布式文件系统了。

业务继续发展，单台服务器存储和响应也很快到达了瓶颈，新的业务需要文件访问具有高响应性、高可用性来支持系统。分布式文件系统，一般分为三块内容来配合，服务的存储、访问的仲裁系统，文件存储系统，文件的容灾系统来构成，仲裁系统相当于文件服务器的大脑，根据一定的算法来决定文件存储的位置，文件存储系统负责保存文件，容灾系统负责文件系统和自己的相互备份。

* 优点
    * 扩展能力: 毫无疑问，扩展能力是一个分布式文件系统最重要的特点；高可用性: 在分布式文件系统中，高可用性包含两层，一是整个文件系统的可用性，二是数据的完整和一致性；弹性存储: 可以根据业务需要灵活地增加或缩减数据存储以及增删存储池中的资源，而不需要中断系统运行
* 缺点
    系统复杂度稍高，需要更多服务器







## 1.1. 基本概念
<a href="#menu" style="float:right">目录</a>

### 什么是FastDFS
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



## 1.2. 工作流程
<a href="#menu" style="float:right">目录</a>

### 1.2.1. 文件上传
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






### 1.2.2. 文件下载
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



## 1.3. FastDFS为什么要结合Nginx
<a href="#menu" style="float:right">目录</a>

我们在使用FastDFS部署一个分布式文件系统的时候，通过FastDFS的客户端API来进行文件的上传、下载、删除等操作。同时通过FastDFS的HTTP服务器来提供HTTP服务。但是FastDFS的HTTP服务较为简单，无法提供负载均衡等高性能的服务，所以FastDFS的开发者——淘宝的架构师余庆同学，为我们提供了Nginx上使用的FastDFS模块（也可以叫FastDFS的Nginx模块）。其使用非常简单。

FastDFS通过Tracker服务器,将文件放在Storage服务器存储,但是同组之间的服务器需要复制文件,有延迟的问题.假设Tracker服务器将文件上传到了192.168.1.80,文件ID已经返回客户端,这时,后台会将这个文件复制到192.168.1.30,如果复制没有完成,客户端就用这个ID在192.168.1.30取文件,肯定会出现错误。这个fastdfs-nginx-module可以重定向连接到源服务器取文件,避免客户端由于复制延迟的问题,出现错误.

## 1.4. 配置文件说明
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

## 1.5. FastDFS 同步机制说明：

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

## 1.6. 安装配置
<a href="#menu" style="float:right">目录</a>

[参考](https://www.cnblogs.com/chiangchou/p/fastdfs.html)

## 1.7. Java客户端使用
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