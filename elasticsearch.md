

<span id="menu"></span>

<!-- TOC -->

- [1. Elasticsearch搜索引擎](#1-elasticsearch搜索引擎)
    - [1.1. 基本概念](#11-基本概念)
    - [1.2. 配置文件说明](#12-配置文件说明)
        - [1.2.1. elasticsearch.yml](#121-elasticsearchyml)
    - [1.3. 索引](#13-索引)
        - [1.3.1. 索引](#131-索引)
    - [1.4. 搜索](#14-搜索)
    - [1.5. 扩展索引结构](#15-扩展索引结构)
    - [1.6. 更好的搜索](#16-更好的搜索)
    - [1.7. 超越全文索引](#17-超越全文索引)
    - [1.8. 深入集群](#18-深入集群)
    - [1.9. 集群管理](#19-集群管理)

<!-- /TOC -->


# 1. Elasticsearch搜索引擎
<a href="#menu" style="float:right">目录</a>

## 1.1. 基本概念
* 索引
    * 逻辑数据的存储，可以看作一个数据库
    * 一个索引有一个或者多个分片，每个分片可以有多个副本
* 文档类型
    * 可以看作数据库的表
* 文档 document
    * 索引和搜索时使用的主要数据载体，包含一个或者多个存有数据的字段，可以看作数据库的一行数据
* 文档ID
    * 索引的唯一标识符，如果索引建立时不指定，el将会随机生成一个随机字符串当作文档哪个ID
* 字段 Field
    * 文档的一部分，包含名称和值两部分
* 词 tern
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

## 1.2. 配置文件说明
* elasticsearch.yml  Elasticsearch配置文件
* jvm.options jvm参数配置
* log4j2.properties 日志配置


### 1.2.1. elasticsearch.yml
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
```



## 1.3. 索引
<a href="#menu" style="float:right">目录</a>

### 1.3.1. 索引
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
## 1.4. 搜索
<a href="#menu" style="float:right">目录</a>

## 1.5. 扩展索引结构
<a href="#menu" style="float:right">目录</a>

## 1.6. 更好的搜索
<a href="#menu" style="float:right">目录</a>

## 1.7. 超越全文索引
<a href="#menu" style="float:right">目录</a>

## 1.8. 深入集群
<a href="#menu" style="float:right">目录</a>

## 1.9. 集群管理
<a href="#menu" style="float:right">目录</a>


