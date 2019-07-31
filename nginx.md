<span id="menu"></span>

<a href="#menu" style="float:right">目录</a>

# Nginx

## 概述
<a href="#menu" style="float:right">目录</a>

### 功能特性
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

## 架构初探
<a href="#menu" style="float:right">目录</a>


## 高级配置
<a href="#menu" style="float:right">目录</a>


## gzip压缩
<a href="#menu" style="float:right">目录</a>


## rewrite功能
<a href="#menu" style="float:right">目录</a>


## 代理服务
<a href="#menu" style="float:right">目录</a>


## 缓存机制
<a href="#menu" style="float:right">目录</a>


## 邮件服务
<a href="#menu" style="float:right">目录</a>


## 源码结构
<a href="#menu" style="float:right">目录</a>


## 基本数据结构
<a href="#menu" style="float:right">目录</a>


## 启动初始化
<a href="#menu" style="float:right">目录</a>


## 时间管理
<a href="#menu" style="float:right">目录</a>


## 内存管理
<a href="#menu" style="float:right">目录</a>


## 工作 进程
<a href="#menu" style="float:right">目录</a>


## 模块编程
<a href="#menu" style="float:right">目录</a>


