
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
    - [Gradle](#gradle)
        - [基本介绍](#基本介绍)
        - [安装](#安装)
            - [Ubuntu下安装](#ubuntu下安装)
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
## Gradle

### 基本介绍
Gradle 是一种构建工具，它抛弃了基于XML的构建脚本，取而代之的是采用一种基于Groovy（现在也支持 Kotlin）的内部领域特定语言

**Gradle特点**
* Gradle是很成熟的技术，可以处理大规模构建
* Gradle对多语言、多平台支持性更好
* Gradle关注在构建效率上
* Gradle发布很频繁，重要feature开发计划透明化
* Gradle社区很活跃，并且增加迅速


### 安装

#### Ubuntu下安装
下载地址[http://services.gradle.org/distributions/](http://services.gradle.org/distributions/)

这里下载gradle-5.6-all.zip包

下载完成后，进入下载包所在位置，解压到/opt/gradle/
```bash
sudo unzip gradle-5.6-all.zip -d /opt/gradle/
```
修改环境配置变量文件/etc/profile

```
sudo vim /etc/profile
```
文件末尾添加
```
export GRADLE_HOME=/opt/gradle/gradle-5.6
export PATH=$GRADLE_HOME/bin:$PATH
```
使之生效
```
source profile
```

查看是否安装成功
```bash
lgj@lgj-Lenovo-G470:/opt/gradle$ gradle -v

Welcome to Gradle 5.6!

Here are the highlights of this release:
 - Incremental Groovy compilation
 - Groovy compile avoidance
 - Test fixtures for Java projects
 - Manage plugin versions via settings script

For more details see https://docs.gradle.org/5.6/release-notes.html


------------------------------------------------------------
Gradle 5.6
------------------------------------------------------------

Build time:   2019-08-14 21:05:25 UTC
Revision:     f0b9d60906c7b8c42cd6c61a39ae7b74767bb012

Kotlin:       1.3.41
Groovy:       2.5.4
Ant:          Apache Ant(TM) version 1.9.14 compiled on March 12 2019
JVM:          1.8.0_191 (Oracle Corporation 25.191-b12)
OS:           Linux 4.15.0-46-generic amd64

```
如果没显示，重启机器再尝试




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
