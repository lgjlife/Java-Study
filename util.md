
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
        - [1.3.3. 远程仓库版本回退](#133-远程仓库版本回退)
    - [1.4. Maven](#14-maven)
        - [1.4.1. 基本概念](#141-基本概念)
        - [1.4.2. 基本命令](#142-基本命令)
        - [1.4.3. Maven中的dependency详解](#143-maven中的dependency详解)
    - [1.5. Gradle](#15-gradle)
        - [1.5.1. 基本介绍](#151-基本介绍)
        - [1.5.2. 安装](#152-安装)
            - [1.5.2.1. Ubuntu下安装](#1521-ubuntu下安装)
    - [1.6. Jenkins](#16-jenkins)
    - [1.7. Docker](#17-docker)
        - [1.7.1. Docker常用指令](#171-docker常用指令)
            - [1.7.1.1. 基本概念](#1711-基本概念)
        - [1.7.2. 常用指令](#172-常用指令)
        - [1.7.3. 容器](#173-容器)
            - [1.7.3.1. 容器的管理操作](#1731-容器的管理操作)
            - [1.7.3.2. 容器内部信息的获取](#1732-容器内部信息的获取)
        - [1.7.4. 镜像](#174-镜像)
            - [1.7.4.1. 基本概念](#1741-基本概念)
            - [1.7.4.2. 本地镜像的管理](#1742-本地镜像的管理)
        - [1.7.5. Docker File](#175-docker-file)
        - [1.7.6. 数据卷和容器连接](#176-数据卷和容器连接)
            - [1.7.6.1. 容器网络基础](#1761-容器网络基础)
            - [1.7.6.2. 数据卷](#1762-数据卷)
        - [1.7.7. 案例](#177-案例)
            - [1.7.7.1. docker 安装Mysqk主从复制](#1771-docker-安装mysqk主从复制)
            - [1.7.7.2. docker 安装mycat](#1772-docker-安装mycat)
    - [1.8. Docker Compose](#18-docker-compose)
        - [1.8.1. 编排和部署](#181-编排和部署)
        - [1.8.2. 多容器的问题](#182-多容器的问题)
        - [1.8.3. Docker Compose 概述与安装](#183-docker-compose-概述与安装)
        - [1.8.4. 安装 Docker Compose](#184-安装-docker-compose)
        - [1.8.5. 基本使用](#185-基本使用)
        - [1.8.6. 快速入门](#186-快速入门)
        - [1.8.7. 工程、服务、容器](#187-工程服务容器)
        - [1.8.8. Docker Compose 常用命令与配置](#188-docker-compose-常用命令与配置)
        - [1.8.9. docker-compose.yml 属性](#189-docker-composeyml-属性)
        - [1.8.10. Docker Compose 其它](#1810-docker-compose-其它)
        - [1.8.11. Compose 原理](#1811-compose-原理)
    - [1.9. VIM](#19-vim)
        - [1.9.1. 命令模式](#191-命令模式)
        - [1.9.2. 常用命令](#192-常用命令)
    - [1.10. NMON监控工具](#110-nmon监控工具)
    - [1.11. 正则表达式](#111-正则表达式)
    - [1.12. curl命令](#112-curl命令)
    - [1.13. 常见时区缩写](#113-常见时区缩写)
    - [1.14. 日志](#114-日志)
        - [1.14.1. SLF4J](#1141-slf4j)
            - [1.14.1.1. slf4j绑定log4j2日志系统启动分析](#11411-slf4j绑定log4j2日志系统启动分析)
        - [1.14.2. LOG4J2](#1142-log4j2)
            - [1.14.2.1. 基本特性](#11421-基本特性)
            - [1.14.2.2. 配置文件优先级](#11422-配置文件优先级)
            - [1.14.2.3. 配置文件](#11423-配置文件)
            - [1.14.2.4. 执行流程](#11424-执行流程)
            - [1.14.2.5. 同步日志和异步日志](#11425-同步日志和异步日志)
                - [1.14.2.5.1. AsyncAppender](#114251-asyncappender)
                - [1.14.2.5.2. AsyncLogger](#114252-asynclogger)
        - [1.14.3. LOGBACK](#1143-logback)
    - [1.15. IDEA](#115-idea)
        - [1.15.1. 常用快捷键](#1151-常用快捷键)
        - [1.15.2. 常用插件](#1152-常用插件)
    - [1.16. 面试考察](#116-面试考察)
        - [1.16.1. 技术广度的考察](#1161-技术广度的考察)
        - [1.16.2. 底层技术的考察](#1162-底层技术的考察)
        - [1.16.3. 技术深度的考察](#1163-技术深度的考察)

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
        * 全局配置文件，优先级次之，用户目录下的.gitconfig
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
    * git diff之后按enter键查看更多的更改内容
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
        * --no-ff：不使用fast-forward方式合并，保留分支的commit历史
        * --squash：使用squash方式合并，把多次分支commit历史压缩为一次


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

### 1.3.3. 远程仓库版本回退
<a href="#menu" style="float:right">目录</a>

有两种方法：git reset 和 git revert

一. 问题
如果提交了一个错误的版本，怎么回退版本？
如果提交了一个错误的版本到远程分支（一个人用），怎么回退版本？
如果提交了一个错误的版本到公共远程分支，怎么回退版本？

二. 本地分支版本回退
git reflog 找到要回退的版本 commit id：xxxxx
git reset --hard xxxxx 回退版本

三. 自己远程分支版本回退
首先回退本地分支：
1. get reflog
2. git reset --hard xxxx
接着强制推送到远程分支：
git push -f


四. 公共远程分支版本回退
考虑这样一种情况：假如你的远程 master 分支情况是这样的：

A1-A2-B1
其中A、B分别代表两个人，A1、A2、B1代表各自的提交。并且所有人的本地分支都已经更新到最新版本，和远程分支一致。

这个时候你发现 A2 这次提交有错误，你用 reset 回滚远程分支 master 到A1，那么理想状态是你的队友 Tony 一拉代码 git pull，他们的 master 分支也回滚了，然而现实却是，Tony 会看到下面的提示：

$ git status
On branch master
Your branch is ahead of 'origin/master' by 2 commits.
  (use "git push" to publish your local commits)
nothing to commit, working directory clean
也就是说，Tony 的分支并没有主动回退，而是比远程分支超前了两次提交，因为远程分支回退了嘛。

这时，Tony 应该：

1. git reflog 找出 B1 的 commitid
2. git checkout tony_branch 回到自己的分支
3. git reset --hard B1 回到被覆盖的B1的提交
4. git checkout -b tony_backup 拉个分支，用于保存 B1
5. git checkout tony_branch  回到自己分支
6. git reset --hard 0bbbb 回到自己分支最前端
这时，B1的那次提交被找回来了，接着要将本地 master 与远程 master 保持一致：

git reset --hard origin/master
这时，Tony 的 master 分支才算真正回退了，也就是说你的回滚才对 Tony 生效，这时 Tony 的本地 master 是这样的：

A1
接着 Tony 要再次合并那个被丢掉的 B1 到 master：

git checkout master
git merge tony_backup
这时，Tony 的 master 是这样的：A1-B1

五. 公共远程分支回退使用 git revert
使用 git reset 回退公共远程分支的版本后，需要其他所有人手动用远程 master 分支覆盖本地 master 分支，显然，这不是优雅的回退方法，下面我们使用另个一个命令来回退版本：

git revert HEAD                     //撤销最近一次提交
git revert HEAD~1                //撤销上上次的提交，注意：数字从0开始
git revert 0ffaacc                  //撤销0ffaacc这次提交
git revert 命令意思是撤销某次提交。它会产生一个新的提交，虽然代码回退了，但是版本依然是向前的，所以，当你用 revert 回退之后，所有人 pull 之后，他们的代码也自动的回退了。

但是，要注意以下几点：

revert 是撤销一次提交，所以后面的 commit id 是你需要回滚到的版本的前一次提交
使用 revert HEAD 是撤销最近的一次提交，如果你最近一次提交是用revert 命令产生的，那么你再执行一次，就相当于撤销了上次的撤销操作，换句话说，你连续执行两次 revert HEAD 命令，就跟没执行是一样的
使用 revert HEAD~1 表示撤销最近2次提交，这个数字是从 0 开始的，如果你之前撤销过产生了commi id，那么也会计算在内的。
如果使用 revert 撤销的不是最近一次提交，那么一定会有代码冲突，需要你合并代码，合并代码只需要把当前的代码全部去掉，保留之前版本的代码就可以了.
git revert 命令的好处就是不会丢掉别人的提交，即使你撤销后覆盖了别人的提交，他更新代码后，可以在本地用 reset 向前回滚，找到自己的代码，然后拉一下分支，再回来合并上去就可以找回被你覆盖的提交了。

六. 如果错的太远，revert 又要解决大面积冲突，可以从错误提交的前一次拉取一份代码放到其他目录，然后将 master 的代码全部删除，把那份新的代码放上去，然后提交。

## 1.4. Maven
<a href="#menu" style="float:right">目录</a>

### 1.4.1. 基本概念

Maven主要做了两件事：
* 统一开发规范与工具
* 统一管理jar包

用户可以将创建的jar包上传到官方提供的maven仓库,当在配置文件中引入该依赖时,maven会自动从中央仓库中搜索并下载到本地仓库.
本地仓库和远程仓库是这样的，Maven工程首先会从本地仓库中获取jar包，当无法获取指定jar包时，本地仓库会从远程仓库（中央仓库）中下载jar包，并放入本地仓库以备将来使用。

groupId、artifactId、version共同组成一个jar包的唯一标识.

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" 
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.xrq.withmaven</groupId>
  <artifactId>withmaven</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <build/>
</project>
```

* modelVersion
    * 指定了当前Maven模型的版本号，对于Maven2和Maven3来说，它只能是4.0.0
* groupId
    * 顾名思义，这个应该是公司名或是组织名。一般来说groupId是由三个部分组成，每个部分之间以"."分隔，第一部分是项目用途，比如用于商业的就是"com"，用于非营利性组织的就　　是"org"；第二部分是公司名，比如"tengxun"、"baidu"、"alibaba"；第三部分是你的项目名
* artifactId
    * 可以认为是Maven构建的项目名，比如你的项目中有子项目，就可以使用"项目名-子项目名"的命名方式
* version
    * 版本号，SNAPSHOT意为快照，说明该项目还在开发中，是不稳定的版本。在Maven中很重要的一点是，groupId、artifactId、version三个元素生成了一个Maven项目的基本坐标，这非常重要，我在使用和研究Maven的时候多次感受到了这点。
* packing
    * 项目打包的类型，可以使jar、war、rar、ear、pom，默认是jar
* dependencies和dependency
    * 前者包含后者。前面说了，Maven的一个重要作用就是统一管理jar包，为了一个项目可以build或运行，项目中不可避免的，会依赖很多其他的jar包，在Maven中，这些依赖就被称为dependency。
* properties
    * properties是用来定义一些配置属性的，例如project.build.sourceEncoding（项目构建源码编码方式），可以设置为UTF-8，防止中文乱码，也可定义相关构建版本号，便于日后统一升级。
* build
    * build表示与构建相关的配置，比如build下有finalName，表示的就是最终构建之后的名称。

Maven的目录结构：
* main目录下是项目的主要代码，test目录下存放测试相关的代码
* 编译输出后的代码会放在target目录下
* src/main/java下存放Java代码，src/main/resources下存放配置文件
* 这里没有webapp，Web项目会有webapp目录，webapp下存放Web应用相关代码
* pom.xml是Maven项目的配置文件

### 1.4.2. 基本命令

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

### 1.4.3. Maven中的dependency详解

```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-logging</artifactId>
    <version>4.12</version>
    <scope>test</scope>
    <exclusions>
        <exclusion>
            <groupId>*</groupId>
            <artifactId>*</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```
* **groupId** ：创建项目的组织或团体的唯一 Id.可视为公司名
* **artifactId** ：项目的唯一 Id, 可视为项目名 .
* **version**  ：产品的版本号 
* **scope**为jar包作用范围
    * test范围指的是测试范围有效，在编译和打包时都不会使用这个依赖.比较典型的如junit。
    * compile范围指的是编译范围有效，在编译和打包时都会将依赖存储进去
    * provided依赖：在编译和测试的过程有效，最后生成war包时不会加入，诸如：servlet-api，因为servlet-api，tomcat等web服务器已经存在了，如果再打包会冲突 
    * runtime在运行的时候依赖，在编译的时候不依赖 
    * 默认的依赖范围是compile 
* **type**
    * 有时候我们引入某一个依赖时，必须指定type，这是因为用于匹配dependency引用和dependencyManagement部分的最小信息集实际上是{groupId，artifactId，type，classifier}。在很多情况下，这些依赖关系将引用没有classifier的jar依赖。这允许我们将标识设置为{groupId，artifactId}，因为type的默认值是jar，并且默认classifier为null。
    * type的值一般有jar、war、pom等，声明引入的依赖的类型
* **classifier**
    * Classifier可能是最容易被忽略的Maven特性，但它确实非常重要，我们也需要它来帮助规划坐标。设想这样一个情况，有一个jar项目，就说是 dog-cli-1.0.jar 吧，运行它用户就能在命令行上画一只小狗出来。现在用户的要求是希望你能提供一个zip包，里面不仅包含这个可运行的jar，还得包含源代码和文档，换句话说，这是比较正式的分发包。这个文件名应该是怎样的呢？dog-cli-1.0.zip？不够清楚，仅仅从扩展名很难分辨什么是Maven默认生成的构件，什么是额外配置生成分发包。如果能是dog-cli-1.0-dist.zip就最好了。这里的dist就是classifier，默认Maven只生成一个构件，我们称之为主构件，那当我们希望Maven生成其他附属构件的时候，就能用上classifier。常见的classifier还有如dog-cli-1.0-sources.jar表示源码包，dog-cli-1.0-javadoc.jar表示JavaDoc包等等。

classifier它表示在相同版本下针对不同的环境或者jdk使用的jar,如果配置了这个元素，则会将这个元素名在加在最后来查找相应的jar，例如：

```xml
给相同的version，构建不同的环境使用依赖
<classifier>jdk17</classifier>
<classifier>jdk18</classifier>
```

* **optional**
当project-A 依赖project-B, project-B 依赖project-D时
```xml
<dependency>
  <groupid>sample.ProjectD</groupid>
  <artifactid>ProjectD</artifactid>
  <version>1.0-SNAPSHOT</version>
  <optional>true</optional>
</dependency>
```

所以当project-B的true时, project-A中如果没有显式的引入project-D, 则project-A不依赖project-D, 即project-A可以自己选择是否依赖project-D

默认的值为false, 及子项目必须依赖。

* **systemPath**
当maven依赖本地而非repository中的jar包，sytemPath指明本地jar包路径,例如：
```xml
<dependency>
    <groupid>org.hamcrest</groupid>
    <artifactid>hamcrest-core</artifactid>
    <version>1.5</version>
    <scope>system</scope>
    <systempath>${basedir}/WebContent/WEB-INF/lib/hamcrest-core-1.3.jar</systempath>
</dependency>
```
* **exclusions**
依赖排除，就是有时候引入某一个依赖的时候，该依赖下有jar包冲突，可以排除掉，不引用该jar，例如：

```xml
<dependency>
    <groupid>test</groupid>
    <artifactid>test</artifactid>
    <version>1.0.2-SNAPSHOT</version>
    <exclusions>
        <exclusion>
            <groupid>org.springframework</groupid>
            <artifactid>spring</artifactid>
        </exclusion>
        <exclusion>
            <artifactid>slf4j-log4j12</artifactid>
            <groupid>org.slf4j</groupid>
        </exclusion>
    </exclusions>
</dependency>
```

## 1.5. Gradle

### 1.5.1. 基本介绍
Gradle 是一种构建工具，它抛弃了基于XML的构建脚本，取而代之的是采用一种基于Groovy（现在也支持 Kotlin）的内部领域特定语言

**Gradle特点**
* Gradle是很成熟的技术，可以处理大规模构建
* Gradle对多语言、多平台支持性更好
* Gradle关注在构建效率上
* Gradle发布很频繁，重要feature开发计划透明化
* Gradle社区很活跃，并且增加迅速


### 1.5.2. 安装

#### 1.5.2.1. Ubuntu下安装
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

Build time:  2019-08-1421:05:25 UTC
Revision:     f0b9d60906c7b8c42cd6c61a39ae7b74767bb012

Kotlin:       1.3.41
Groovy:      2.5.4
Ant:          Apache Ant(TM) version 1.9.14 compiled on March 122019
JVM:          1.8.0_191 (Oracle Corporation25.191-b12)
OS:           Linux 4.15.0-46-generic amd64

```
如果没显示，重启机器再尝试




## 1.6. Jenkins
<a href="#menu" style="float:right">目录</a>

## 1.7. Docker
<a href="#menu" style="float:right">目录</a>

### 1.7.1. Docker常用指令

#### 1.7.1.1. 基本概念
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
 Built:             Wed Feb20 02:28:102019
 OS/Arch:           linux/amd64
 Experimental:      false

Server:
 Engine:
  Version:          18.06.3-ce
  API version:      1.38 (minimum version 1.12)
  Go version:       go1.10.3
  Git commit:       d7080c1
  Built:            Wed Feb20 02:26:342019
  OS/Arch:          linux/amd64
  Experimental:     false


```
            
### 1.7.2. 常用指令
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

### 1.7.3. 容器
<a href="#menu" style="float:right">目录</a>

#### 1.7.3.1. 容器的管理操作
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
      --ip6 string                     IPv6 address (e.g.,2001:db8::33)
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
#### 1.7.3.2. 容器内部信息的获取
* 查看容器日志
    * docker logs -f --tail=5 name|id
```bash
lgj@lgj-Lenovo-G470:~$ docker logs --help

Usage:	docker logs [OPTIONS] CONTAINER

Fetch the logs of a container

Options:
      --details        Show extra details provided to logs
  -f, --follow         Follow log output //动态更新
      --since string   Show logs since timestamp (e.g.2013-01-02T13:23:37) or relative (e.g. 42m for 42 minutes)
      --tail string    Number of lines to show from the end of the logs (default "all") //显示行数
  -t, --timestamps     Show timestamps
      --until string   Show logs before a timestamp (e.g.2013-01-02T13:23:37) or relative (e.g. 42m for 42 minutes)

```

* 查看容器进程
    * docker top name|id

* 查看容器信息
    * docker inspect name|id

* 容器内执行命令
    * docker exec -it name /bin/bash 执行时确保容器处于运行状态
    
### 1.7.4. 镜像
<a href="#menu" style="float:right">目录</a>

#### 1.7.4.1. 基本概念
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

#### 1.7.4.2. 本地镜像的管理

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
### 1.7.5. Docker File
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
### 1.7.6. 数据卷和容器连接
<a href="#menu" style="float:right">目录</a>

#### 1.7.6.1. 容器网络基础
ifconfig 可以看到docker的默认分配地址是172.17.0.1
```bash
lgj@lgj-Lenovo-G470:~$ ifconfig
docker0: flags=4099<UP,BROADCAST,MULTICAST>  mtu 1500
        inet 172.17.0.1  netmask255.255.0.0  broadcast 172.17.255.255
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



#### 1.7.6.2. 数据卷
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


### 1.7.7. 案例
<a href="#menu" style="float:right">目录</a>

#### 1.7.7.1. docker 安装Mysqk主从复制
* https://www.cnblogs.com/songwenjie/p/9371422.html

#### 1.7.7.2. docker 安装mycat


* 安装openjdk:8镜像
    * docker pull  openjdk:8
* 下载mycat
    * http://www.mycat.io/
    * http://dl.mycat.io/1.6.7.1/
* 

## 1.8. Docker Compose
<a href="#menu" style="float:right">目录</a>

### 1.8.1. 编排和部署

**编排(orchestration)**
编排指根据被部署的对象之间的耦合关系，以及被部署对象对环境的依赖，制定部署流程中各个动作的执行顺序，部署过程所需要的依赖文件和被部署文件的存储位置和获取方式，以及如何验证部署成功。这些信息都会在编排工具中以指定的格式(比如配置文件或特定的代码)来要求运维人员定义并保存起来，从而保证这个流程能够随时在全新的环境中可靠有序地重现出来。

**部署(deployment)**
部署是指按照编排所指定的内容和流程，在目标机器上执行环境初始化，存放指定的依赖文件，运行指定的部署动作，最终按照编排中的规则来确认部署成功。

所以说，编排是一个指挥家，他的大脑里存储了整个乐曲此起彼伏的演奏流程，对于每一个小节每一段音乐的演奏方式都了然于胸。而部署就是整个乐队，他们严格按照指挥家的意图用乐器来完成乐谱的执行。最终，两者通过协作就能把每一位演奏者独立的演奏通过组合、重叠、衔接来形成高品位的交响乐。这也是 docker compose 要完成的使命。

### 1.8.2. 多容器的问题

* 要从Dockerfile build image 或者去dockerhub拉取image
* 要创建多个container
* 要管理这些container（启动停止删除）

Docker Compose 通过文本的方式，把要处理的容器按照顺序执行，如果是多容器也就是通过一条命令就搞定了

### 1.8.3. Docker Compose 概述与安装

* 使用 Docker 的时候，定义 Dockerfile 文件，然后使用 docker build、docker run 等命令操作容器。然而微服务架构的应用系统一般包含若干个微服务，每个微服务一般都会部署多个实例，如果每个微服务都要手动启停，那么效率之低，维护量之大可想而知
* 使用 Docker Compose 可以轻松、高效的管理容器，它是一个用于定义和运行多容器 Docker 的应用程序工具

### 1.8.4. 安装 Docker Compose

安装 Docker Compose 可以通过下面命令自动下载适应版本的 Compose，并为安装脚本添加执行权限
```
sudo curl -L https://github.com/docker/compose/releases/download/1.21.2/docker-compose-$(uname -s)-$(uname -m) -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose

或者

sudo apt install docker-compose
```

查看安装是否成功
```
docker-compose -v
```

### 1.8.5. 基本使用

* Compose 的使用方式非常简单，基本上就是下面的三板斧：
    * 定义 Dockerfile
    * 定义 docker-compose.yml
    * 运行 docker-compose up
    * 其实 compose 提供的命令可以管理应用的整个生命周期：

* Start, stop, rebuild services
    * 查看运行中 service 的状态
    * 输出运行中 service 的日志
    * 在 service 中执行一次性的命令



### 1.8.6. 快速入门

打包项目，获得 jar 包 docker-demo-0.0.1-SNAPSHOT.jar
```
mvn clean package
```

在 jar 包所在路径创建 Dockerfile 文件，添加以下内容
```
FROM java:8
VOLUME /tmp
ADD docker-demo-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 9000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
```

在 jar 包所在路径创建文件 docker-compose.yml，添加以下内容
```
version: '2' # 表示当前的配置文件使用的语法版本。
services: # services 中的内容指明该应用一共定义了多少个服务(容器镜像)
  docker-demo:  # 指定服务名称
    build: .  # 指定 Dockerfile 所在路径
    ports:    # 指定端口映射
      - "9000:8761"
```

在 docker-compose.yml 所在路径下执行该命令 Compose 就会自动构建镜像并使用镜像启动容器
```
docker-compose up
docker-compose up -d  // 后台启动并运行容器
```

访问 http://localhost:9000/hello 即可访问微服务接口

### 1.8.7. 工程、服务、容器

* Docker Compose 将所管理的容器分为三层，分别是工程（project）、服务（service）、容器（container）
* Docker Compose 运行目录下的所有文件（docker-compose.yml）组成一个工程,一个工程包含多个服务，每个服务中定义了容器运行的镜像、参数、依赖，一个服务可包括多个容器实例

### 1.8.8. Docker Compose 常用命令与配置

ps：列出所有运行容器
```
docker-compose ps
```

logs：查看服务日志输出
```
docker-compose logs
```
port：打印绑定的公共端口，下面命令可以输出 eureka 服务 8761 端口所绑定的公共端口
```
docker-compose port eureka 8761
```
build：构建或者重新构建服务
```
docker-compose build
```
start：启动指定服务已存在的容器
```
docker-compose start eureka
```
stop：停止已运行的服务的容器
```
docker-compose stop eureka
```
rm：删除指定服务的容器
```
docker-compose rm eureka
```
up：构建、启动容器
```
docker-compose up
```

kill：通过发送 SIGKILL 信号来停止指定服务的容器
```
docker-compose kill eureka
```
pull：下载服务镜像

scale：设置指定服务运气容器的个数，以 service=num 形式指定
```
docker-compose scale user=3 movie=3
```


run：在一个服务上执行一个命令
```
docker-compose run web bash
```

### 1.8.9. docker-compose.yml 属性


* version：指定 docker-compose.yml 文件的写法格式
* services：多个容器集合
    * 一个service代表一个container，这个container可以从dockerhub的image来创建，或者从本地的Dockerfile build出来的image来创建。
    * service的�����动类似docker run，我们可以给其指定network和volme，所以可以给service指定network和volume的引用
* build：配置构建时，Compose 会利用它自动构建镜像，该值可以是一个路径，也可以是一个对象，用于指定 Dockerfile 参数

```yml
#docker-Compse的版本
version: '3'

#建立2个service 一个wordpress 一个 mysql
services:

  wordpress:
    image: wordpress
#端口映射80 映射到8080端口
    ports:
      - 8080:80
#环境变量2个
    environment:
      WORDPRESS_DB_HOST: mysql
      WORDPRESS_DB_PASSWORD: root
    networks:
      - my-bridge
  mysql:
    image: mysql
    environment:
      MYSQL_ROOT_PASSWORD: root
      MYSQL_DATABASE: wordpress
    volumes:
      - mysql-data:/var/lib/mysql
    networks:
      - my-bridge
#建立一个volumes 
volumes:
  mysql-data:
#建立一个networks
networks:
  my-bridge:
    driver: bridge
```



```
build: ./dir
---------------
build:
    context: ./dir
    dockerfile: Dockerfile
    args:
        buildno: 1
```


* command：覆盖容器启动后默认执行的命令
```
command: bundle exec thin -p 3000
----------------------------------
command: [bundle,exec,thin,-p,3000]
```


dns：配置 dns 服务器，可以是一个值或列表
```
dns: 8.8.8.8
------------
dns:
    - 8.8.8.8
    - 9.9.9.9
```


dns_search：配置 DNS 搜索域，可以是一个值或列表
```
dns_search: example.com
------------------------
dns_search:
    - dc1.example.com
    - dc2.example.com
```


environment：环境变量配置，可以用数组或字典两种方式
```
environment:
    RACK_ENV: development
    SHOW: 'ture'
-------------------------
environment:
    - RACK_ENV=development
    - SHOW=ture
```


env_file：从文件中获取环境变量，可以指定一个文件路径或路径列表，其优先级低于 environment 指定的环境变量
```
env_file: .env
---------------
env_file:
    - ./common.env
```


expose：暴露端口，只将端口暴露给连接的服务，而不暴露给主机
```
expose:
    - "3000"
    - "8000"
```


image：指定服务所使用的镜像
```
image: java
```


network_mode：设置网络模式
```
network_mode: "bridge"
network_mode: "host"
network_mode: "none"
network_mode: "service:[service name]"
network_mode: "container:[container name/id]"
```


ports：对外暴露的端口定义，和 expose 对应
```
ports:   # 暴露端口信息  - "宿主机端口:容器暴露端口"
- "8763:8763"
- "8763:8763"
```


links：将指定容器连接到当前连接，可以设置别名，避免ip方式导致的容器重启动态改变的无法连接情况
```
links:    # 指定服务名称:别名 
    - docker-compose-eureka-server:compose-eureka
```


volumes：卷挂载路径
```
volumes:
  - /lib
  - /var
```


logs：日志输出信息
```
--no-color          单色输出，不显示其他颜.
-f, --follow        跟踪日志输出，就是可以实时查看日志
-t, --timestamps    显示时间戳
--tail              从日志的结尾显示，--tail=200
```

### 1.8.10. Docker Compose 其它
更新容器

当服务的配置发生更改时，可使用 docker-compose up 命令更新配置
此时，Compose 会删除旧容器并创建新容器，新容器会以不同的 IP 地址加入网络，名称保持不变，任何指向旧容起的连接都会被关闭，重新找到新容器并连接上去

* links:服务之间可以使用服务名称相互访问，links 允许定义一个别名，从而使用该别名访问其它服务
```
version: '2'
services:
    web:
        build: .
        links:
            - "db:database"
    db:
        image: postgres
```

这样 Web 服务就可以使用 db 或 database 作为 hostname 访问 db 服务了

### 1.8.11. Compose 原理

**project**
通过 docker compose 管理的一个项目被抽象称为一个 project，它是由一组关联的应用容器组成的一个完整的业务单元。简单点说就是一个 docker-compose.yml 文件定义一个 project。
我们可以在执行 docker-compose 命令时通过 -p 选项指定 project 的名称，如果不指定，则默认是 docker-compose.yml 文件所在的目录名称。

**service**
运行一个应用的容器，实际上可以是一个或多个运行相同镜像的容器。可以通过 docker-compose up 命令的 --scale 选项指定某个 service 运行的容器个数，比如：
```
$ docker-compose up -d --scale redis=2
```
compose 的调用流程
![](https://img2018.cnblogs.com/blog/952033/201810/952033-20181014204846210-692201852.png)

右上角的 docker-compose 定义了一组 service 来组成一个 project，通过 docker-compose.yml 中 service 的定义与 container 建立关系(service 与容器的对应关系)，最后使用 container 来完成对 docker-py(Python 版的 docker client) 的调用，向 docker daemon 发起 http 请求。注意，这里的 project, service 和 container 对应的都是 docker-compose 实现中的数据结构。下面让我们结合上图来介绍 docker-compose 工作的大致流程。

**首先**，用户执行的 docker-compose up 命令调用了命令行中的启动方法，功能非常简单。一个 docker-compose.yml 文件定义了一个 project，docker-compose up 提供的命令行参数则作为这个 project 的启动参数交由 project 模块处理。

**然后**，如果当前宿主机已经存在与该应用对应的容器，docker-compose 则进行行为逻辑判断。如果用户指定可以重新启动已有服务，docker-compose 就会执行 service 模块的容器重启方法，否则就直接启动已有容器。这两种操作的区别在于前者会停止旧的容器，创建并启动新的容器，并把旧容器移除掉。在这个过程中创建容器的各项自定义参数都是从 docker-compose up 命令和 docker-compose.yml 中传入的。

**接下来**，启动容器的方法也很简洁，这个方法中完成了一个 docker 容器启动所需的主要参数的封装，并在 container 模块执行启动。

**最后**，contaier 模块会调用 docker-py 客户端来执行向 docker daemon 发起创建容器的 POST 请求。


## 1.9. VIM
<a href="#menu" style="float:right">目录</a>

* 安装
    * apt-get update && apt install vim

* 启动配置文件
    * /etc/vim/vimrc 全局配置文件
    * ~/vimrc

* 支持鼠标操作
    * 输入命令 set mouse=a

### 1.9.1. 命令模式


基本上 vi/vim 共分为三种模式，分别是命令模式（Command mode），输入模式（Insert mode）和底线命令模式（Last line mode）。 这三种模式的作用分别是：

**命令模式**：
用户刚刚启动 vi/vim，便进入了命令模式。

此状态下敲击键盘动作会被Vim识别为命令，而非输入字符。比如我们此时按下i，并不会输入一个字符，i被当作了一个命令。

以下是常用的几个命令：
* i 切换到输入模式，以输入字符。
* x 删除当前光标所在处的字符。
* : 切换到底线命令模式，以在最底一行输入命令。
若想要编辑文本：启动Vim，进入了命令模式，按下i，切换到输入模式。

命令模式只有一些最基本的命令，因此仍要依靠底线命令模式输入更多命令。

**输入模式**
在命令模式下按下i就进入了输入模式。

在输入模式中，可以使用以下按键：

* 字符按键以及Shift组合，输入字符
* ENTER，回车键，换行
* BACK SPACE，退格键，删除光标前一个字符
* DEL，删除键，删除光标后一个字符
* 方向键，在文本中移动光标
* HOME/END，移动光标到行首/行尾
* Page Up/Page Down，上/下翻页
* Insert，切换光标为输入/替换模式，光标将变成竖线/下划线
* ESC，退出输入模式，切换到命令模式
* Ctrl+q　是 Linux 快捷键，　当 Ctrl+s 锁定屏幕后，只能用　Ctrl+q 退出

**底线命令模式**
在命令模式下按下:（英文冒号）就进入了底线命令模式。

底线命令模式可以输入单个或多个字符的命令，可用的命令非常多。

在底线命令模式中，基本的命令有（已经省略了冒号）：
* q 退出程序
* w 保存文件
* 按ESC键可随时退出底线命令模式。



### 1.9.2. 常用命令

![](https://img2018.cnblogs.com/blog/685007/201902/685007-20190219103545499-1516663381.png)
![](https://img2018.cnblogs.com/blog/685007/201902/685007-20190219103431877-1441653557.png)

第一部份：一般模式可用的光标移动、复制粘贴、搜索替换等
**移动光标的方法**
|||
|---|---|
|h 或 向左箭头键(←)|	光标向左移动一个字符
|j 或 向下箭头键(↓)|	光标向下移动一个字符
|k 或 向上箭头键(↑)	|光标向上移动一个字符
|l 或 向右箭头键(→)|	光标向右移动一个字符

如果你将右手放在键盘上的话，你会发现 hjkl 是排列在一起的，因此可以使用这四个按钮来移动光标。 如果想要进行多次移动的话，例如向下移动 30 行，可以使用 "30j" 或 "30↓" 的组合按键， 亦即加上想要进行的次数(数字)后，按下动作即可！
|||
|---|---|
|[Ctrl] + [f]|	屏幕『向下』移动一页，相当于 [Page Down]按键 (常用)
|[Ctrl] + [b]|	屏幕『向上』移动一页，相当于 [Page Up] 按键 (常用)
|[Ctrl] + [d]|	屏幕『向下』移动半页
|[Ctrl] + [u]|	屏幕『向上』移动半页
|+	|光标移动到非空格符的下一行
|-	|光标移动到非空格符的上一行
|n< space>	|那个 n 表示『数字』，例如20 。按下数字后再按空格键，光标会向右移动这一行的 n 个字|符。例如20< space> 则光标会向后面移动20 个字符距离。
|0 或功能键[Home]|	这是数字『 0 』：移动到这一行的最前面字符处 (常用)
|$ 或功能键[End]|	移动到这一行的最后面字符处(常用)
|H|	光标移动到这个屏幕的最上方那一行的第一个字符
|M	|光标移动到这个屏幕的中央那一行的第一个字符
|L|	光标移动到这个屏幕的最下方那一行的第一个字符
|G|	移动到这个档案的最后一行(常用)
|nG||	n 为数字。移动到这个档案的第 n 行。例如20G 则会移动到这个档案的第20 行(可配合 :set nu)
|gg	|移动到这个档案的第一行，相当于 1G 啊！ (常用)
|n< Enter>|	n 为数字。光标向下移动 n 行(常用)

**搜索替换**

|||
|---|---|
|/word	|向光标之下寻找一个名称为 word 的字符串。例如要在档案内搜寻 vbird 这个字符串，就输入 /vbird 即可！ (常用)
|?word|	向光标之上寻找一个字符串名称为 word 的字符串。
|n|	这个 n 是英文按键。代表重复前一个搜寻的动作。举例来说， 如果刚刚我们执行 /vbird 去向下搜寻 vbird 这个字符串，则按下 n 后，会向下继续搜寻下一个名称为 vbird 的字符串。如果是执行 ?vbird 的话，那么按下 n 则会向上继续搜寻名称为 vbird 的字符串！
|N|	这个 N 是英文按键。与 n 刚好相反，为『反向』进行前一个搜寻动作。 例如 /vbird 后，按下 N 则表示『向上』搜寻 vbird 。
|使用 /word 配合 n 及 N 是非常有帮助的！可以让你重复的找到一些你搜寻的关键词！
|:n1,n2s/word1/word2/g	n1 与 n2 为数字。在第 n1 与 n2 行之间寻找 word1 这个字符串，并将该字符串取代为 word2 ！举例来说，在 100 到200 行之间搜寻 vbird 并取代为 VBIRD 则：『:100,200s/vbird/VBIRD/g』。(常用)
|:1,$s/word1/word2/g 或 :%s/word1/word2/g|	从第一行到最后一行寻找 word1 字符串，并将该字符串取代为 word2 ！(常用)
|:1,$s/word1/word2/gc 或 :%s/word1/word2/gc|	从第一行到最后一行寻找 word1 字符串，并将该字符串取代为 word2 ！且在取代前显示提示字符给用户确认 (confirm) 是否需要取代！(常用)

**删除、复制粘贴**

|||
|---|---|
|x, X|	在一行字当中，x 为向后删除一个字符 (相当于 [del] 按键)， X 为向前删除一个字符(相当于 [backspace] 亦即是退格键) (常用)
|nx	|n 为数字，连续向后删除 n 个字符。举例来说，我要连续删除 10 个字符， 『10x』。
|dd	|删除游标所在的那一整行(常用)
|ndd|	n 为数字。删除光标所在的向下 n 行，例如20dd 则是删除20 行 (常用)
|d1G|	删除光标所在到第一行的所有数据
|dG|	删除光标所在到最后一行的所有数据
|d$|	删除游标所在处，到该行的最后一个字符
|d0|	那个是数字的 0 ，删除游标所在处，到该行的最前面一个字符
|yy	|复制游标所在的那一行(常用)
|nyy|	n 为数字。复制光标所在的向下 n 行，例如20yy 则是复制20 行(常用)
|y1G|	复制游标所在行到第一行的所有数据
|yG|	复制游标所在行到最后一行的所有数据
|y0|	复制光标所在的那个字符到该行行首的所有数据
|y$|	复制光标所在的那个字符到该行行尾的所有数据
|p, P|	p 为将已复制的数据在光标下一行贴上，P 则为贴在游标上一行！ 举例来说，我目前光标在第20 行，且已经复制了 10 行数据。则按下 p 后， 那 10 行数据会贴在原本的20 行之后，亦即由21 行开始贴。但如果是按下 P 呢？ 那么原本的第20 行会被推到变成 30 行。 (常用)
|J|	将光标所在行与下一行的数据结合成同一行
|c|	重复删除多个数据，例如向下删除 10 行，[ 10cj ]
|u|	复原前一个动作。(常用)
|[Ctrl]+r|	重做上一个动作。(常用)
|这个 u 与 [Ctrl]+r 是很常用的指令！一个是复原，另一个则是重做一次～ 利用这两个功能按键，你的编辑，嘿嘿！很快乐的啦！
|.|不要怀疑！这就是小数点！意思是重复前一个动作的意思。 如果你想要重复删除、重复贴上等等动作，按下小数点『.』就好了！ (常用)

**第二部份：一般模式切换到编辑模式的可用的按钮说明**

* 进入输入或取代的编辑模式

|||
|---|---|
|i, I|	进入输入模式(Insert mode)：i 为『从目前光标所在处输入』， I 为『在目前所在行的第一个非空格符处开始输入』。 (常用)
|a, A	|进入输入模式(Insert mode)：a 为『从目前光标所在的下一个字符处开始输入』， A 为『从光标所在行的最后一个字符处开始输入』。(常用)
|o, O	|进入输入模式(Insert mode)：这是英文字母 o 的大小写。o 为『在目前光标所在的下一行处输入新的一行』； O 为在目前光标所在处的上一行输入新的一行！(常用)
|r, R	|进入取代模式(Replace mode)：r 只会取代光标所在的那一个字符一次；R会一直取代光标所在的文字，直到按下 ESC 为止；(常用)
|上面这些按键中，在 vi 画面的左下角处会出现『--INSERT--』或『--REPLACE--』的字样。 由名称就知道该动作了吧！！特别注意的是，我们上面也提过了，你想要在档案里面输入字符时， 一定要在左下角处看到 INSERT 或 REPLACE 才能输入喔！
|[Esc]|	退出编辑模式，回到一般模式中(常用)

**第三部份：一般模式切换到指令行模式的可用的按钮说明**
* 指令行的储存、离开等指令

|||
|---|---|
|:w	|将编辑的数据写入硬盘档案中(常用)
|:w!|	若文件属性为『只读』时，强制写入该档案。不过，到底能不能写入， 还是跟你对该档案的档案权限有关啊！
|:q|	离开 vi (常用)
|:q!|	若曾修改过档案，又不想储存，使用 ! 为强制离开不储存档案。注意一下啊，那个惊叹号 (!) 在 vi 当中，常常具有『强制』的意思～
|:wq|	储存后离开，若为 :wq! 则为强制储存后离开 (常用)
|ZZ|	这是大写的 Z 喔！若档案没有更动，则不储存离开，若档案已经被更动过，则储存后离开！
|:w|[filename]	将编辑的数据储存成另一个档案（类似另存新档）
|:r| [filename]	在编辑的数据中，读入另一个档案的数据。亦即将 『filename』 这个档案内容加到游标所在行后面
|:n1,n2 w [filename]	将 n1 到 n2 的内容储存成 filename 这个档案。
|:! command	|暂时离开 vi 到指令行模式下执行 command 的显示结果！例如『:! ls /home』即可在 vi 当中察看 /home 底下以 ls 输出的档案信息！

* vim 环境的变更

|||
|---|---|
|:set nu|	显示行号，设定之后，会在每一行的前缀显示该行的行号
|:set nonu	|与 set nu 相反，为取消行号！

特别注意，在 vi/vim 中，数字是很有意义的！数字通常代表重复做几次的意思！ 也有可能是代表去到第几个什么什么的意思。

举例来说，要删除 50 行，则是用 『50dd』 对吧！ 数字加在动作之前，如我要向下移动20 行呢？那就是『20j』或者是『20↓』即可。


## 1.10. NMON监控工具

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

## 1.11. 正则表达式
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
　　[A-Z]26个大写字母
　　[a-z]26个小写字母
　　[0-9] 0至9数字
[A-Za-z0-9]26个大写字母、26个小写字母和0至9数字
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


## 1.12. curl命令
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
Date: Tue,23 Aug2016 08:30:16 GMT
Content-Type: text/html
Location: http://www.sina.com.cn/
Expires: Tue,23 Aug2016 08:32:16 GMT
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
*   Trying202.108.33.60...
* Connected to www.sina.com (202.108.33.60) port 80 (#0)
> GET / HTTP/1.1
> User-Agent: curl/7.35.0
> Host: www.sina.com
> Accept: */*
> 
< HTTP/1.1 301 Moved Permanently
* Server nginx is not blacklisted
< Server: nginx
< Date: Tue,23 Aug2016 08:48:14 GMT
< Content-Type: text/html
< Location: http://www.sina.com.cn/
< Expires: Tue,23 Aug2016 08:50:14 GMT
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
     --http2.0       Use HTTP2.0 (H)
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
     --oauth2-bearer TOKEN  OAuth2 Bearer Token (IMAP, POP3, SMTP)
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

## 1.13. 常见时区缩写
<a href="#menu" style="float:right">目录</a>

IDLE +12:00 国际日期变更线，东边 
NZDT +13:00 新西兰夏时制 
NZST +12:00 新西兰标准时间 
NZT +12:00 新西兰时间 
AESST +11:00 澳大利亚东部标准夏时制 
ACSST +10:30 中澳大利亚标准夏时制 
CADT +10:30 中澳大利亚夏时制 
SADT +10:30 南澳大利亚夏时制 
AEST +10:00 澳大利亚东部标准时间 
EAST +10:00 东澳大利亚标准时间 
GST +10:00 关岛标准时间，俄罗斯时区 9 
LIGT +10:00 澳大利亚墨尔本 
SAST +09:30 南澳大利亚标准时间 
CAST +09:30 中澳大利亚标准时间 
AWSST +09:00 澳大利亚西部标准夏时制 
JST +09:00 日本标准时间，（俄罗斯时区 8） 
KST +09:00 韩国标准时间 
WDT +09:00 西澳大利亚夏时制
SST +02:00 瑞典夏时制 
BST +01:00 英国夏时制 
CET +01:00 中欧时间
FST +01:00 法国夏时制 
MET +01:00 中欧时间 
MEWT +01:00 中欧冬时制
NDT -02:30 纽芬兰（Newfoundland）白昼时间
ADT -03:00 大西洋白昼时间 
AWT -03:00 (未知) 
BRT -03:00 Brasilia 时间 
NFT -03:30 纽芬兰（Newfoundland）标准时间 
NST -03:30 纽芬兰（Newfoundland）标准时间 
AST -04:00 大西洋标准时间（加拿大） 
ACST -04:00 Atlantic/Porto Acre 夏令时 
ACT -05:00 Atlantic/Porto Acre 标准时间 
EDT -04:00 东部白昼时间 
CDT -05:00 中部白昼时间 
EST -05:00 东部标准时间 
CST -06:00 中部标准时间 
MDT -06:00 山区白昼时间 
MST -07:00 山区标准时间 
PDT -07:00 太平洋白昼时间 
AKDT -08:00 阿拉斯加白昼时间 
PST -08:00 太平洋标准时间 
YDT -08:00 Yukon 白昼时间 
AKST -09:00 阿拉斯加标准时间 
HDT -09:00 夏威仪/阿拉斯加白昼时间 
YST -09:00 Yukon 标准时 
MART -09:30 马克萨司群岛时间 
AHST -10:00 夏威夷-阿拉斯加标准时间
HST -10:00 夏威夷标准时间 
CAT -10:00 中阿拉斯加时间 
NT -11:00 州时间（Nome Time） 
IDLW -12:00 国际日期变更线，西边


## 1.14. 日志 

### 1.14.1. SLF4J
<a href="#menu" style="float:right">目录</a>

![](https://images0.cnblogs.com/blog/449064/201412/071507136869713.jpg)

commons-logging和slf4j都是日志的接口，供用户使用，而没有提供实现！log4j,logback等等才是日志的真正实现。
slf4j是门面模式的典型应用.门面模式，其核心为外部与一个子系统的通信必须通过一个统一的外观对象进行，使得子系统更易于使用.

当我们调用接口时，接口的工厂会自动寻找恰当的实现(通过寻找类路径中是否有相关的实现类，比如log4j,logback)，返回一个实现的实例给我服务。这些过程都是透明化的，用户不需要进行任何操作

* 日志实现(log4j、logback、log4j2)
    * log4j是apache实现的一个开源日志组件
    * logback同样是由log4j的作者设计完成的，拥有更好的特性，用来取代log4j的一个日志框架，是slf4j的原生实现
    * log4j2是log4j 1.x和logback的改进版，据说采用了一些新技术（无锁异步、等等），使得日志的吞吐量、性能比log4j 1.x提高10倍，并解决了一些死锁的bug，而且配置更加简单灵活。


**为什么需要日志接口，直接使用具体的实现不就行了吗？**
接口用于定制规范，可以有多个实现，使用时是面向接口的(导入的包都是slf4j的包而不是具体某个日志框架中的包)，即直接和接口交互，不直接使用实现，所以可以任意的更换实现而不用更改代码中的日志相关代码。

比如：slf4j定义了一套日志接口，项目中使用的日志框架是logback，开发中调用的所有接口都是slf4j的，不直接使用logback，调用是 自己的工程调用slf4j的接口，slf4j的接口去调用logback的实现，可以看到整个过程应用程序并没有直接使用logback，当项目需要更换更加优秀的日志框架时(如log4j2)只需要引入Log4j2的jar和Log4j2对应的配置文件即可，完全不用更改Java代码中的日志相关的代码logger.info(“xxx”)，也不用修改日志相关的类的导入的包(import org.slf4j.Logger; import org.slf4j.LoggerFactory;)

使用日志接口便于更换为其他日志框架
log4j、logback、log4j2都是一种日志具体实现框架，所以既可以单独使用也可以结合slf4j一起搭配使用。


#### 1.14.1.1. slf4j绑定log4j2日志系统启动分析
<a href="#menu" style="float:right">目录</a>

```java
public class LogUtil {
	//获取Logger
	public static Logger testLog = LoggerFactory.getLogger(LogUtil.class);
}
```
也就是以下方法
LoggerFactory.class
```java
public static Logger getLogger(String name) {
    ILoggerFactory iLoggerFactory = getILoggerFactory();
    return iLoggerFactory.getLogger(name);
}
```
```java
public static ILoggerFactory getILoggerFactory() {
    if (INITIALIZATION_STATE == 0) {
        Class var0 = LoggerFactory.class;
        synchronized(LoggerFactory.class) {
            if (INITIALIZATION_STATE == 0) {
                INITIALIZATION_STATE = 1;
                performInitialization();
            }
        }
    }

    switch(INITIALIZATION_STATE) {
    case 1:
        return SUBST_FACTORY;
    case 2:
        throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
    case 3:
        return StaticLoggerBinder.getSingleton().getLoggerFactory();
    case 4:
        return NOP_FALLBACK_FACTORY;
    default:
        throw new IllegalStateException("Unreachable code");
    }
}
private static final void performInitialization() {
    //调用bind方法
    bind();
    if (INITIALIZATION_STATE == 3) {
        versionSanityCheck();
    }

}
```

查看bind方法
```java
 private static final void bind() {
    String msg;
    try {
        Set<URL> staticLoggerBinderPathSet = null;
        if (!isAndroid()) {
            staticLoggerBinderPathSet = findPossibleStaticLoggerBinderPathSet();
            reportMultipleBindingAmbiguity(staticLoggerBinderPathSet);
        }

        StaticLoggerBinder.getSingleton();
        //设置初始化状态为3
        INITIALIZATION_STATE = 3;
        reportActualBinding(staticLoggerBinderPathSet);
        fixSubstituteLoggers();
        replayEvents();
        SUBST_FACTORY.clear();
    } catch (NoClassDefFoundError var2) {
        msg = var2.getMessage();
        if (!messageContainsOrgSlf4jImplStaticLoggerBinder(msg)) {
            failedBinding(var2);
            throw var2;
        }

        INITIALIZATION_STATE = 4;
        Util.report("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
        Util.report("Defaulting to no-operation (NOP) logger implementation");
        Util.report("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
    } catch (NoSuchMethodError var3) {
        msg = var3.getMessage();
        if (msg != null && msg.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
            INITIALIZATION_STATE = 2;
            Util.report("slf4j-api 1.6.x (or later) is incompatible with this binding.");
            Util.report("Your binding is version 1.5.5 or earlier.");
            Util.report("Upgrade your binding to version 1.6.x.");
        }

        throw var3;
    } catch (Exception var4) {
        failedBinding(var4);
        throw new IllegalStateException("Unexpected initialization failure", var4);
    }

}
```
staticLoggerBinderPathSet存放的是StaticLoggerBinder类的类路径.
findPossibleStaticLoggerBinderPathSet()发现可能的binder路径，从类路径中寻找org/slf4j/impl/StaticLoggerBinder.class类：LoggerFactory.java

如果类中同时引入了logback和log4j2相关的包,将会触发警告.也就是同时发现了两个StaticLoggerBinder.class的实现类
```
SLF4J: Class path contains multiple SLF4J bindings.
SLF4J: Found binding in [jar:file:/home/lgj/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: Found binding in [jar:file:/home/lgj/.m2/repository/org/apache/logging/log4j/log4j-slf4j-impl/2.11.2/log4j-slf4j-impl-2.11.2.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.
SLF4J: Actual binding is of type [ch.qos.logback.classic.util.ContextSelectorStaticBinder]
```

获取到staticLoggerBinderPathSet,可以看到初始化状态为3.
```java
 case 3:
        return StaticLoggerBinder.getSingleton().getLoggerFactory();
```

```java
public final class StaticLoggerBinder implements LoggerFactoryBinder {
    public static String REQUESTED_API_VERSION = "1.6";
    private static final String LOGGER_FACTORY_CLASS_STR = Log4jLoggerFactory.class.getName();
    private static final StaticLoggerBinder SINGLETON = new StaticLoggerBinder();

    //最终返回的是log4j2的工厂类Log4jLoggerFactory
    private final ILoggerFactory loggerFactory = new Log4jLoggerFactory();

    private StaticLoggerBinder() {
    }

    public static StaticLoggerBinder getSingleton() {
        return SINGLETON;
    }

    public ILoggerFactory getLoggerFactory() {
        return this.loggerFactory;
    }

    public String getLoggerFactoryClassStr() {
        return LOGGER_FACTORY_CLASS_STR;
    }
}
```

返回到最开始的地方
```java
public static Logger getLogger(String name) {
    ILoggerFactory iLoggerFactory = getILoggerFactory();
    return iLoggerFactory.getLogger(name);
}
```
获取到ILoggerFactory后,则调用方法getLogger.
调用的是其抽象父类的方法
Log4jLoggerFactory.class
```java
public class Log4jLoggerFactory extends AbstractLoggerAdapter<Logger> implements ILoggerFactory {
    private static final String FQCN = Log4jLoggerFactory.class.getName();
    private static final String PACKAGE = "org.slf4j";

    public Log4jLoggerFactory() {
    }

    protected Logger newLogger(String name, LoggerContext context) {
        String key = "ROOT".equals(name) ? "" : name;
        return new Log4jLogger(context.getLogger(key), name);
    }

    protected LoggerContext getContext() {
        Class<?> anchor = StackLocatorUtil.getCallerClass(FQCN, "org.slf4j");
        return anchor == null ? LogManager.getContext() : this.getContext(StackLocatorUtil.getCallerClass(anchor));
    }
}
```
AbstractLoggerAdapter的getLogger
```java
public L getLogger(String name) {
    LoggerContext context = this.getContext();
    ConcurrentMap<String, L> loggers = this.getLoggersInContext(context);
    L logger = loggers.get(name);
    if (logger != null) {
        return logger;
    } else {
        loggers.putIfAbsent(name, this.newLogger(name, context));
        return loggers.get(name);
    }
}
```
```java

protected LoggerContext getContext() {
    Class<?> anchor = StackLocatorUtil.getCallerClass(FQCN, "org.slf4j");
    //anchor = 
    org.slf4j.LoggerFactory
    return anchor == null ? LogManager.getContext() : this.getContext(StackLocatorUtil.getCallerClass(anchor));
}
```
最终调用的是log4j2中的Log4jContextFactory的getContext方法
```java
 public static LoggerContext getContext(ClassLoader loader, boolean currentContext) {
    try {
        return factory.getContext(FQCN, loader, (Object)null, currentContext);
    } catch (IllegalStateException var3) {
        LOGGER.warn(var3.getMessage() + " Using SimpleLogger");
        return (new SimpleLoggerContextFactory()).getContext(FQCN, loader, (Object)null, currentContext);
    }
}

public LoggerContext getContext(String fqcn, ClassLoader loader, Object externalContext, boolean currentContext) {
    LoggerContext ctx = this.selector.getContext(fqcn, loader, currentContext);
    if (externalContext != null && ctx.getExternalContext() == null) {
        ctx.setExternalContext(externalContext);
    }

    if (ctx.getState() == State.INITIALIZED) {
        // //初始获取，会解析配置文件log4j2.xml
        ctx.start();
    }

    return ctx;
}
    
```

没有配置的情况下，默认的配置为

```java
public class DefaultConfiguration extends AbstractConfiguration {
    public static final String DEFAULT_NAME = "Default";
    public static final String DEFAULT_LEVEL = "org.apache.logging.log4j.level";
    public static final String DEFAULT_PATTERN = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n";

    public DefaultConfiguration() {
        super((LoggerContext)null, ConfigurationSource.NULL_SOURCE);
        this.setToDefault();
    }

    protected void doConfigure() {
    }
}

 protected void setToDefault() {
    this.setName("Default@" + Integer.toHexString(this.hashCode()));
    Layout<? extends Serializable> layout = PatternLayout.newBuilder().withPattern("%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n").withConfiguration(this).build();
    Appender appender = ConsoleAppender.createDefaultAppenderForLayout(layout);
    appender.start();
    this.addAppender(appender);
    LoggerConfig rootLoggerConfig = this.getRootLogger();
    rootLoggerConfig.addAppender(appender, (Level)null, (Filter)null);
    Level defaultLevel = Level.ERROR;
    String levelName = PropertiesUtil.getProperties().getStringProperty("org.apache.logging.log4j.level", defaultLevel.name());
    Level level = Level.valueOf(levelName);
    rootLoggerConfig.setLevel(level != null ? level : defaultLevel);
}
    

```



### 1.14.2. LOG4J2

<a href="#menu" style="float:right">目录</a>

#### 1.14.2.1. 基本特性
<a href="#menu" style="float:right">目录</a>

* Log4j2旨在用作审计日志框架。 Log4j 1.x和Logback都会在重新配置时丢失事件。 Log4j2不会。在Logback中，Appender中的异常永远不会对应用程序可见。在Log4j中，可以将Appender配置为允许异常渗透到应用程序。
* Log4j2包含基于LMAX Disruptor库的下一代异步记录器。在多线程场景中，异步记录器的吞吐量比Log4j 1.x和Logback高10倍，延迟低几个数量级。
* Log4j2对于独立应用程序是无垃圾的，对于稳定状态日志记录期间的Web应用程序来说是低垃圾。这减少了垃圾收集器的压力，并且可以提供更好的响应时间性能。
* Log4j2使用插件系统，通过添加新的Appender，过滤器，布局，查找和模式转换器，可以非常轻松地扩展框架，而无需对Log4j进行任何更改。
* 由于插件系统配置更简单。配置中的条目不需要指定类名。
* 支持自定义日志级别。可以在代码或配置中定义自定义日志级别。
* 支持lambda表达式。只有在启用了请求的日志级别时，在Java 8上运行的客户端代码才能使用lambda表达式来延迟构造日志消息。不需要显式级别检查，从而产生更清晰的代码。
* 支持Message对象。消息允许支持有趣和复杂的构造通过日志系统传递并被有效地操作。用户可以自由创建自己的消息类型，并编写自定义布局，过滤器和查找来操作它们。
* Log4j 1.x支持Appender上的过滤器。 Logback添加了TurboFilters，允许在事件由Logger处理之前过滤事件。 Log4j2支持可以配置为在Logger处理事件之前处理事件的过滤器，因为它们由Logger或Appender处理。
* 许多Logback Appender不接受布局，只会以固定格式发送数据。大多数Log4j2 Appender接受布局，允许以任何所需格式传输数据。
* Log4j 1.x和Logback中的布局返回一个String。这导致了Logback Encoders中讨论的问题。 Log4j2采用更简单的方法，Layouts总是返回一个字节数组。这样做的好处是，它意味着它们几乎可以在任何Appender中使用，而不仅仅是写入OutputStream的Appender。
* Syslog Appender支持TCP和UDP，并支持BSD syslog和RFC 5424格式。
* Log4j2利用Java 5并发支持并在尽可能低的级别执行锁定。 Log4j 1.x已知死锁问题。其中许多都是在Logback中修复的，但许多Logback类仍然需要在相当高的级别进行同步。
* 它是一个Apache Software Foundation项目，遵循所有ASF项目使用的社区和支持模型。如果您想贡献或获得提交更改的权利，请按照贡献中列出的路径进行操作。

![](http://logging.apache.org/log4j/2.x/images/Log4jClasses.jpg)

#### 1.14.2.2. 配置文件优先级
<a href="#menu" style="float:right">目录</a>

* Log4j will inspect the "log4j.configurationFile" system property and, if set, will attempt to load the configuration using the ConfigurationFactory that matches the file extension.
* If no system property is set the properties ConfigurationFactory will look for log4j2-test.properties in the classpath.
* If no such file is found the YAML ConfigurationFactory will look for log4j2-test.yaml or log4j2-test.yml in the classpath.
* If no such file is found the JSON ConfigurationFactory will look for log4j2-test.json or log4j2-test.jsn in the classpath.
* If no such file is found the XML ConfigurationFactory will look for log4j2-test.xml in the classpath.
* If a test file cannot be located the properties ConfigurationFactory will look for log4j2.properties on the classpath.
* If a properties file cannot be located the YAML ConfigurationFactory will look for log4j2.yaml or log4j2.yml on the classpath.
* If a YAML file cannot be located the JSON ConfigurationFactory will look for log4j2.json or log4j2.jsn on the classpath.
* If a JSON file cannot be located the XML ConfigurationFactory will try to locate log4j2.xml on the classpath.
* If no configuration file could be located the DefaultConfiguration will be used. This will cause logging output to go to the console.

#### 1.14.2.3. 配置文件
<a href="#menu" style="float:right">目录</a>

```xml
<?xml version="1.0" encoding="UTF-8"?>
 <!--日志级别以及优先级排序: OFF > FATAL > ERROR > WARN > INFO > DEBUG > TRACE > ALL -->
 <!--Configuration后面的status，这个用于设置log4j2自身内部的信息输出，可以不设置，当设置成trace时，你会看到log4j2内部各种详细输出-->
 <!--monitorInterval：Log4j能够自动检测修改配置 文件和重新配置本身，设置间隔秒数-->
 <configuration status="WARN" monitorInterval="30">
     <!--先定义所有的appender-->
     <appenders>
     <!--这个输出控制台的配置-->
         <console name="Console" target="SYSTEM_OUT">
         <!--输出日志的格式-->
             <PatternLayout pattern="[%d{HH:mm:ss:SSS}] [%p] - %l - %m%n"/>
         </console>
     <!--文件会打印出所有信息，这个log每次运行程序会自动清空，由append属性决定，这个也挺有用的，适合临时测试用-->
     <File name="log" fileName="log/test.log" append="false">
        <PatternLayout pattern="%d{HH:mm:ss.SSS} %-5level %class{36} %L %M - %msg%xEx%n"/>
     </File>
     <!-- 这个会打印出所有的info及以下级别的信息，每次大小超过size，则这size大小的日志会自动存入按年份-月份建立的文件夹下面并进行压缩，作为存档-->
         <RollingFile name="RollingFileInfo" fileName="${sys:user.home}/logs/info.log"
                      filePattern="${sys:user.home}/logs/$${date:yyyy-MM}/info-%d{yyyy-MM-dd}-%i.log">
             <!--控制台只输出level及以上级别的信息（onMatch），其他的直接拒绝（onMismatch）-->        
             <ThresholdFilter level="info" onMatch="ACCEPT" onMismatch="DENY"/>
             <PatternLayout pattern="[%d{HH:mm:ss:SSS}] [%p] - %l - %m%n"/>
             <Policies>
                 <TimeBasedTriggeringPolicy/>
                 <SizeBasedTriggeringPolicy size="100 MB"/>
             </Policies>
         </RollingFile>
         <RollingFile name="RollingFileWarn" fileName="${sys:user.home}/logs/warn.log"
                      filePattern="${sys:user.home}/logs/$${date:yyyy-MM}/warn-%d{yyyy-MM-dd}-%i.log">
             <ThresholdFilter level="warn" onMatch="ACCEPT" onMismatch="DENY"/>
             <PatternLayout pattern="[%d{HH:mm:ss:SSS}] [%p] - %l - %m%n"/>
             <Policies>
                 <TimeBasedTriggeringPolicy/>
                 <SizeBasedTriggeringPolicy size="100 MB"/>
             </Policies>
         <!-- DefaultRolloverStrategy属性如不设置，则默认为最多同一文件夹下7个文件，这里设置了20 -->
             <DefaultRolloverStrategy max="20"/>
         </RollingFile>
         <RollingFile name="RollingFileError" fileName="${sys:user.home}/logs/error.log"
                      filePattern="${sys:user.home}/logs/$${date:yyyy-MM}/error-%d{yyyy-MM-dd}-%i.log">
             <ThresholdFilter level="error" onMatch="ACCEPT" onMismatch="DENY"/>
             <PatternLayout pattern="[%d{HH:mm:ss:SSS}] [%p] - %l - %m%n"/>
             <Policies>
                 <TimeBasedTriggeringPolicy/>
                 <SizeBasedTriggeringPolicy size="100 MB"/>
             </Policies>
         </RollingFile>
     </appenders>
     <!--然后定义logger，只有定义了logger并引入的appender，appender才会生效-->
     <loggers>
         <!--过滤掉spring和mybatis的一些无用的DEBUG信息-->
         <logger name="org.springframework" level="INFO"></logger>
         <logger name="org.mybatis" level="INFO"></logger>
         <root level="all">
             <appender-ref ref="Console"/>
             <appender-ref ref="RollingFileInfo"/>
             <appender-ref ref="RollingFileWarn"/>
             <appender-ref ref="RollingFileError"/>
         </root>
     </loggers>
 </configuration>
```
**对于Appender的理解**
* 简单说Appender就是一个管道，定义了日志内容的去向(保存位置)。
* 配置一个或者多个Filter，Filter的过滤机制和Servlet的Filter有些差别，下文会进行说明。
* 配置Layout来控制日志信息的输出格式。
* 配置Policies以控制日志何时(When)进行滚动。
* 配置Strategy以控制日志如何(How)进行滚动。

**对于Logger的理解**
简单说Logger就是一个路由器，指定类、包中的日志信息流向哪个管道，以及控制他们的流量(日志级别)


* 配置文件节点解析　　　　
    * 根节点Configuration有两个属性:status和monitorinterval,有两个子节点:Appenders和Loggers(表明可以定义多个Appender和Logger).
        * status用来指定log4j本身的打印日志的级别.
        * monitorinterval用于指定log4j自动重新配置的监测间隔时间，单位是s,最小是5s.
    * Appenders节点，常见的有三种子节点:Console、RollingFile、File.
        * Console节点用来定义输出到控制台的Appender.
        * name:指定Appender的名字.
        * target:SYSTEM_OUT 或 SYSTEM_ERR,一般只设置默认:SYSTEM_OUT.
        * PatternLayout:输出格式，不设置默认为:%m%n.
        * File节点用来定义输出到指定位置的文件的Appender.
        * name:指定Appender的名字.
        * fileName:指定输出日志的目的文件带全路径的文件名.
        * PatternLayout:输出格式，不设置默认为:%m%n.
        * RollingFile节点用来定义超过指定大小自动删除旧的创建新的的Appender.
        * name:指定Appender的名字.
        * fileName:指定输出日志的目的文件带全路径的文件名.
        * PatternLayout:输出格式，不设置默认为:%m%n.
        * filePattern:指定新建日志文件的名称格式.
        * Policies:指定滚动日志的策略，就是什么时候进行新建日志文件输出日志.
        * TimeBasedTriggeringPolicy:Policies子节点，基于时间的滚动策略，interval属性用来指定多久滚动一次，默认是1 hour。modulate=true用来调整时间：比如现在是早上3am，interval是4，那么第一次滚动是在4am，接着是8am，12am...而不是7am.
        * SizeBasedTriggeringPolicy:Policies子节点，基于指定文件大小的滚动策略，size属性用来定义每个日志文件的大小.
        * DefaultRolloverStrategy:用来指定同一个文件夹下最多有几个日志文件时开始删除最旧的，创建新的(通过max属性)。
    * Loggers节点，常见的有两种:Root和Logger.
        * Root节点用来指定项目的根日志，如果没有单独指定Logger，那么就会默认使用该Root日志输出
            * level:日志输出级别，共有8个级别，按照从低到高为：All < Trace < Debug < Info < Warn < Error < Fatal < OFF.
            * AppenderRef：Root的子节点，用来指定该日志输出到哪个Appender.
        * Logger节点用来单独指定日志的形式，比如要为指定包下的class指定不同的日志级别等。
            * level:日志输出级别，共有8个级别，按照从低到高为：All < Trace < Debug < Info < Warn < Error < Fatal < OFF.
            * name:用来指定该Logger所适用的类或者类所在的包全路径,继承自Root节点.
            * AppenderRef：Logger的子节点，用来指定该日志输出到哪个Appender,如果没有指定，就会默认继承自Root.如果指定了，那么会在指定的这个Appender和Root的Appender中都会输出，此时我们可以设置Logger的additivity="false"只在自定义的Appender中进行输出。
        * 关于日志level.
            * 共有8个级别，按照从低到高为：All < Trace < Debug < Info < Warn < Error < Fatal < OFF.
                * All:最低等级的，用于打开所有日志记录.
                * Trace:是追踪，就是程序推进以下，你就可以写个trace输出，所以trace应该会特别多，不过没关系，我们可以设置最低日志级别不让他输出.
                * Debug:指出细粒度信息事件对调试应用程序是非常有帮助的.
                * Info:消息在粗粒度级别上突出强调应用程序的运行过程.
                * Warn:输出警告及warn以下级别的日志.
                * Error:输出错误信息日志.
                * Fatal:输出每个严重的错误事件将会导致应用程序的退出的日志.
                * OFF:最高等级的，用于关闭所有日志记录.
            * 程序会打印高于或等于所设置级别的日志，设置的日志等级越高，打印出来的日志就越少。

**Pattern及各个参数的意义**

```xml
<PatternLayout pattern="%d{HH:mm:ss.SSS} %-5level %class{36} %L %M - %msg%xEx%n"/>
```
* %c
    * 列出logger名字空间的全称，如果加上{<层数>}表示列出从最内层算起的指定层数的名字空间
    * 例子
        * 假设当前logger名字空间是"a.b.c"
        * %c	a.b.c
        * %c{2}	b.c
        * %20c	（若名字空间长度小于20，则左边用空格填充）
        * %-20c	（若名字空间长度小于20，则右边用空格填充）
        * %.30c	（若名字空间长度超过30，截去多余字符）
        * %20.30c	（若名字空间长度小于20，则左边用空格填充；若名字空间长度超过30，截去多余字符）
        * %-20.30c	（若名字空间长度小于20，则右边用空格填充；若名字空间长度超过30，截去多余字符）
        * %c{1}	org.apache.commons.Foo ---	Foo
        * %c{2}	org.apache.commons.Foo---	commons.Foo
        * %c{10}	org.apache.commons.Foo	---org.apache.commons.Foo
        * %c{-1}	org.apache.commons.Foo	---apache.commons.Foo
        * %c{-2}	org.apache.commons.Foo	---commons.Foo
        * %c{-10}	org.apache.commons.Foo	---org.apache.commons.Foo
        * %c{1.}	org.apache.commons.Foo	---o.a.c.Foo
        * %c{1.1.~.~}	org.apache.commons.test.Foo	  ---o.a.~.~.Foo
        * %c{.}	org.apache.commons.test.Foo	---....Foo
* %C
    * 列出调用logger的类的全名（包含包路径）
    * 例子
        * 假设当前类是"org.apache.xyz.SomeClass"
        * %C	org.apache.xyz.SomeClass
        * %C{1}	SomeClass
* %d
    * 显示日志记录时间，{<日期格式>}使用ISO8601定义的日期格式
    * 例子
        * %d{ISO8601}	2005-10-12 22:23:30,117
        * %d{DATE}	12 Oct 2005 22:23:30,117
        * %d{ABSOLUTE}	22:23:30,117
        * %d{yyyy/MM/dd HH:mm:ss,SSS}	2005/10/12 22:23:30,117
* %F
    * 显示调用logger的源文件名
    * 例子
        * %F	MyClass.java
        
* %l
    * 输出日志事件的发生位置，包括类目名、发生的线程，以及在代码中的行数
    * 例子
        * %l	MyClass.main(MyClass.java:129)
* %L
    * 显示调用logger的代码行
    * 例子
        * %L	129
* %m
    * 显示输出消息
    * 例子
        * %m	This is a message for debug
* %M
    * 显示调用logger的方法名
    * 例子
        * %M	main
* %n
    * 当前平台下的换行符
    * 例子
        * %n	Windows平台下表示rn UNIX平台下表示n
* %p
    * 显示该条日志的优先级
    * 例子
        * %p	INFO
* %r
    * 显示从程序启动时到记录该条日志时已经经过的毫秒数
    * 例子
        * %r	1215
* %t
    * 输出产生该日志事件的线程名
    * 例子
        * %t	MyClass
* %x
    * 按NDC（Nested Diagnostic Context，线程堆栈）顺序输出日志
    * 例子
        * 假设某程序调用顺序是MyApp调用com.foo.Bar
        * %c %x - %m%n	MyApp - Call com.foo.Bar.com.foo.Bar - Log in Bar MyApp - Return to MyApp.
* %X
    * 按MDC（Mapped Diagnostic Context，线程映射表）输出日志。通常用于多个客户端连接同一台服务器，方便服务器区分是那个客户端访问留下来的日志。
    * 例子
        * %X{5}	（记录代号为5的客户端的日志）
* %%
    * 显示一个百分号
    * 例子
        * %%	% 
        
有些特殊符号不能直接打印，需要使用实体名称或者编号
```

//
& —— &amp; 或者 &#38;
< —— &lt;  或者 &#60;
> —— &gt;  或者 &#62;
“ —— &quot; 或者 &#34;
‘ —— &apos; 或者 &#39;
```

[更多配置参考官网文档：http://logging.apache.org/log4j/2.x/manual/layouts.html](http://logging.apache.org/log4j/2.x/manual/layouts.html)

#### 1.14.2.4. 执行流程

* Log4j2中日志输出的详细过程如下：
    * 1.首先使用全局Filter对日志事件进行过滤。
        * Log4j2中的日志Level分为8个级别，优先级从高到低依次为OFF、FATAL、ERROR、WARN、INFO、DEBUG、TRACE、 ALL。
        * 全局Filter的Level为ALL，表示允许输出所有级别的日志。logger.info()请求输出INFO级别的日志，通过。
    * 2.使用Logger的Level对日志事件进行过滤。
        * Logger的Level为TRACE，表示允许输出TRACE级别及以上级别的日志。logger.info()请求输出INFO级别的日志，通过。
    * 3.生成日志输出内容Message。
        * 使用占位符的方式输出日志，输出语句为logger.info("increase {} from {} to {}", arg1, arg2, arg3)的形式，最终输出时{}占位符处的内容将用arg1,arg2,arg3的字符串填充。
        * log4j2用Object[]保存参数信息，在这一阶段会将Object[]转换为String[]，生成含有输出模式串"increase {} from {} to {}"和参数数组String[]的Message，为后续日志格式化输出做准备。
    * 4.生成LogEvent。
        * LogEvent中含有loggerName（日志的输出者），level（日志级别），timeMillis（日志的输出时间），message（��志��出内容），threadName（线程名称）等信息。
        * 在上述程序中，生成的LogEvent的属性值为loggerName=com.meituan.Main，Level=INFO，timeMillis=1505659461759，message为步骤3中创建的Message，threadNama=main。
    * 5.使用Logger配置的Filter对日志事件进行过滤。
        * Logger配置的Filter的Level为DEBUG，表示允许输出DEBUG及以上级别的日志。logger.info()请求输出INFO级别的日志，通过。
    * 6.使用Logger对应的Appender配置的Filter对日志事件进行过滤。
        * Appender配置的Filter配置的INFO级别日志onMatch=ACCEPT，表示允许输出INFO级别的日志。logger.info()请求输出INFO级别的日志，通过。
    * 7.判断是否需要触发rollover。
        * 此步骤不是日志输出的必须步骤，如配置的Appender为无需进行rollover的Appender，则无此步骤。
        * 因为使用RollingFileAppender，且配置了基于文件大小的rollover触发策略，在此阶段会判断是否需要触发rollover。判断方式为当前的文件大小是否达到了指定的size，如果达到了，触发rollover操作。关于Log4j2中的RollingFileAppender的rollover，可参见Log4j2中RollingFile的文件滚动更新机制。
    * 8.PatternLayout对LogEvent进行格式化，生成可输出的字符串。
        * PatternLayout将根据Pattern的模式，利用各种Converter对LogEvent的相关信息进行转换，最终拼接成可输出的日志字符串。
        * 如DatePatternConverter对LogEvent的日志输出时间进行格式化转换；LevelPatternConverter对LogEvent的日志级别信息进行格式化转换；
        * LoggerPatternConverter对*LogEvent的Logger的名字进行格式化转换；MessagePatternConverter对LogEvent的日志输出内容进行格式化转换等
    * 使用OutputStream，将日志输出到文件。
        * 将日志字符串序列化为字节数组，使用字节流OutoutStream将日志输出到文件中。如果配置了immediateFlush为true，打开app.log就可观察到输出的日志了

#### 1.14.2.5. 同步日志和异步日志
<a href="#menu" style="float:right">目录</a>

所谓同步日志，即当输出日志时，必须等待日志输出语句执行完毕后，才能执行后面的业务逻辑语句。

使用异步日志进行输出时，日志输出语句与业务逻辑语句并不是在同一个线程中运行，而是有专门的线程用于进行日志输出操作，处理业务逻辑的主线程不用等待即可执行后续业务逻辑。

Log4j2中的异步日志实现方式有AsyncAppender和AsyncLogger两种。

其中，AsyncAppender采用了ArrayBlockingQueue来保存需要异步输出的日志事件；AsyncLogger则使用了Disruptor框架来实现高吞吐。


 
||日志输出方式|
|---|---|
|sync	|同步打印日志，日志输出与业务逻辑在同一线程内，当日志输出完毕，才能进行后续业务逻辑操作
|Async Appender	|异步打印日志，内部采用ArrayBlockingQueue，对每个AsyncAppender创建一个线程用于处理日志输出。
|Async Logger	|异步打印日志，采用了高性能并发框架Disruptor，创建一个线程用于处理日志输出。


##### 1.14.2.5.1. AsyncAppender

```XML
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="warn">
  <Appenders>
    <RollingFile name="MyFile" fileName="logs/app.log">
      <PatternLayout>
        <Pattern>%d %p %c{1.} [%t] %m%n</Pattern>
      </PatternLayout>
      <SizeBasedTriggeringPolicy size="500MB"/>
    </RollingFile>

    
    <Async name="Async">
      <AppenderRef ref="MyFile"/>
    </Async>


  </Appenders>
  <Loggers>
    <Root level="error">
      <AppenderRef ref="Async"/>
    </Root>
  </Loggers>
</Configuration>
```
AsyncAppender的常用参数

|参数名| 类型| 说明|
|---|---|---|
|name	|String	|Async Appender的名字。
|AppenderRef	|String| 异步调用的Appender的名字，可以配置多个。
|blocking|	boolean|	默认为true。如果为true，appender将一直等待直到queue中有空闲；如果为false，当队列满的时候，日志事件将被丢弃。(如果配置了error appender，要丢弃的日志事件将由error appender处理)
|bufferSize|	integer|	队列中可存储的日志事件的最大数量，默认为128。(源码中为128，Log4j2官网为1024，官网信息有误)

![](https://img2018.cnblogs.com/blog/676975/201908/676975-20190827212857292-1887643935.png)


每个Async Appender，内部维护了一个ArrayBlockingQueue，并将创建一个线程用于输出日志事件，如果配置了多个AppenderRef，将分别使用对应的Appender进行日志输出。

##### 1.14.2.5.2. AsyncLogger

Log4j2中的AsyncLogger的内部使用了Disruptor框架。

使用时必须引入该依赖

```xml
<!-- https://mvnrepository.com/artifact/com.lmax/disruptor -->
<dependency>
    <groupId>com.lmax</groupId>
    <artifactId>disruptor</artifactId>
    <version>3.4.2</version>
</dependency>

```

**Disruptor简介**
Disruptor是英国外汇交易公司LMAX开发的一个高性能队列，基于Disruptor开发的系统单线程能支撑每秒600万订单。

目前，包括Apache Strom、Log4j2在内的很多知名项目都应用了Disruptor来获取高性能。

Disruptor框架内部核心数据结构为RingBuffer，其为无锁环形队列
![](https://img2018.cnblogs.com/blog/676975/201908/676975-20190827212953252-997291815.png)

* 单线程每秒能够处理600万订单，Disruptor为什么这么快？
    * a.lock-free-使用了CAS来实现线程安全
        * ArrayBlockingQueue使用锁实现并发控制，当get或put时，当前访问线程将上锁，当多生产者、多消费者的大量并发情形下，由于锁竞争、线程切换等，会有性能损失。
        * Disruptor通过CAS实现多生产者、多消费者对RingBuffer的并发访问。CAS相当于乐观锁，其性能优于Lock的性能。
    * b.使用缓存行填充解决伪共享问题
        * 计算机体系结构中，内存的访问速度远远低于CPU的运行速度，在内存和CPU之间，加入Cache，CPU首先访问Cache中的数据，CaChe未命中，才访问内存中的数据。
        * 伪共享：Cache是以缓存行（cache line）为单位存储的，当多个线程修改互相独立的变量时，如果这些变量共享同一个缓存行，就会无意中影响彼此的性能。

```XML
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="debug" name="MyApp" packages="">
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n" />
        </Console>
        <RollingFile name="RollingFile" fileName="logs/app.log"
                     filePattern="logs/app-%d{yyyy-MM-dd HH}.log">
            <PatternLayout>
                <Pattern>%d %p %c{1.} [%t] %m%n</Pattern>
            </PatternLayout>
            <Policies>
                <SizeBasedTriggeringPolicy size="500MB"/>
            </Policies>
        </RollingFile>
        <RollingFile name="RollingFile2" fileName="logs/app2.log"
                     filePattern="logs/app2-%d{yyyy-MM-dd HH}.log">
            <PatternLayout>
                <Pattern>%d %p %c{1.} [%t] %m%n</Pattern>
            </PatternLayout>
            <Policies>
                <SizeBasedTriggeringPolicy size="500MB"/>
            </Policies>
        </RollingFile>
    </Appenders>
    <Loggers>
        <AsyncLogger name="com.meituan.Main" level="trace" additivity="false">
            <appender-ref ref="RollingFile"/>
        </AsyncLogger>
        <AsyncLogger name="RollingFile2" level="trace" additivity="false">
            <appender-ref ref="RollingFile2"/>
        </AsyncLogger>
        <Root level="debug">
            <AppenderRef ref="Console"/>
            <AppenderRef ref="RollingFile"/>
        </Root>
    </Loggers>
</Configuration>
```
**additivity属性**
它是 子Logger 是否继承 父Logger 的 输出源（appender）的标志位。具体说，默认情况下子Logger会继承父Logger的appender，也就是说子Logger会在父Logger的appender里输出。若是additivity设为false，则子Logger只会在自己的appender里输出，而不会在父Logger的appender里输出。

优化Log4j2的配置方案：1） 混合异步和同步Logger；root logger 为同步，其它为异步；2）AsyncLogger 的additivity属性设置为false；


上述log4j2.xml中配置了两个AsyncLogger，名字分别为com.meituan.Main和RollingFile2
并且，在main方法中分别使用两个logger来输出两条日志。 

在加载log4j2.xml的启动阶段，如果检测到配置了AsyncRoot或AsyncLogger，将启动一个disruptor实例。
![](https://img2018.cnblogs.com/blog/676975/201908/676975-20190827213227668-1176986869.png)

上述程序中，main线程作为生产者，EventProcessor线程作为消费者。
**生产者生产消息**
当运行到类似于logger.info、logger.debug的输出语句时，将生成的LogEvent放入RingBuffer中。
**消费者消费消息**
如果RingBuffer中有LogEvent需要处理，EventProcessor线程从RingBuffer中取出LogEvent，调用Logger相关联的Appender输出LogEvent（具体输出过程与同步过程相同，同样需要过滤器过滤、PatternLayout格式化等步骤）。

如果RingBuffer中没有LogEvent需要处理，EventProcessor线程将处于等待阻塞状态（默认策略）。

需要注意的是，虽然在log4j2.xml中配置了多个AsyncLogger，但是并不是每个AsyncLogger对应着一个处理线程，而是仅仅有一个EventProcessor线程进行日志的异步处理。

* Log4j 2的异步记录日志在一定程度上提供更好的吞吐量，但是一旦队列已满，appender线程需要等待，这个时候就需要设置等待策略，AsyncAppender是依赖于消费者最序列最后的消费者，会持续等待。至于异步性能图可以看下官方提供的吞吐量比较图，差异很明显。
* 因为AsyncAppender是采用Disruptor，通过环形队列无阻塞队列作为缓冲，多生产者多线程的竞争是通过CAS实现，无锁化实现，可以降低极端大的日志量时候的延迟尖峰，Disruptor 可是号称一个线程里每秒处理600万订单的高性能队列。

![吞吐量比较图](http://logging.apache.org/log4j/2.x/images/async-throughput-comparison.png)


### 1.14.3. LOGBACK
<a href="#menu" style="float:right">目录</a>

## 1.15. IDEA 

### 1.15.1. 常用快捷键
<a href="#menu" style="float:right">目录</a>

```
Ctrl+Shift + Enter，语句完成
“！”，否定完成，输入表达式时按 “！”键
Ctrl+E，最近的文件
Ctrl+Shift+E，最近更改的文件
Shift+Click，可以关闭文件
Ctrl+[ OR ]，可以跑到大括号的开头与结尾
Ctrl+F12，可以显示当前文件的结构
Ctrl+F7，可以查询当前元素在当前文件中的引用，然后按 F3 可以选择
Ctrl+N，可以快速打开类
Ctrl+Shift+N，可以快速打开文件
Alt+Q，可以看到当前方法的声明
Ctrl+P，可以显示参数信息
Ctrl+Shift+Insert，可以选择剪贴板内容并插入
Alt+Insert，可以生成构造器/Getter/Setter等
Ctrl+Alt+V，可以引入变量。例如：new String(); 自动导入变量定义
Ctrl+Alt+T，可以把代码包在一个块内，例如：try/catch
Ctrl+Enter，导入包，自动修正
Ctrl+Alt+L，格式化代码
Ctrl+Alt+I，将选中的代码进行自动缩进编排，这个功能在编辑 JSP 文件时也可以工作
Ctrl+Alt+O，优化导入的类和包
Ctrl+R，替换文本
Ctrl+F，查找文本
Ctrl+Shift+Space，自动补全代码
Ctrl+空格，代码提示（与系统输入法快捷键冲突）
Ctrl+Shift+Alt+N，查找类中的方法或变量
Alt+Shift+C，最近的更改
Alt+Shift+Up/Down，上/下移一行
Shift+F6，重构 – 重命名
Ctrl+X，删除行
Ctrl+D，复制行
Ctrl+/或Ctrl+Shift+/，注释（//或者/**/）
Ctrl+J，自动代码（例如：serr）
Ctrl+Alt+J，用动态模板环绕
Ctrl+H，显示类结构图（类的继承层次）
Ctrl+Q，显示注释文档
Alt+F1，查找代码所在位置
Alt+1，快速打开或隐藏工程面板
Ctrl+Alt+left/right，返回至上次浏览的位置
Alt+left/right，切换代码视图
Alt+Up/Down，在方法间快速移动定位
Ctrl+Shift+Up/Down，向上/下移动语句
F2 或 Shift+F2，高亮错误或警告快速定位
Tab，代码标签输入完成后，按 Tab，生成代码
Ctrl+Shift+F7，高亮显示所有该文本，按 Esc 高亮消失
Alt+F3，逐个往下查找相同文本，并高亮显示
Ctrl+Up/Down，光标中转到第一行或最后一行下
Ctrl+B/Ctrl+Click，快速打开光标处的类或方法（跳转到定义处）
Ctrl+Alt+B/更新为Ctrl+Shift+I，跳转到方法实现处
Ctrl+Shift+Backspace，跳转到上次编辑的地方
Ctrl+O，重写方法
Ctrl+Alt+Space，类名自动完成
Ctrl+Alt+Up/Down，快速跳转搜索结果
Ctrl+Shift+J，整合两行
Alt+F8，计算变量值
Ctrl+Shift+V，可以将最近使用的剪贴板内容选择插入到文本
Ctrl+Alt+Shift+V，简单粘贴
Shift+Esc，不仅可以把焦点移到编辑器上，而且还可以隐藏当前（或最后活动的）工具窗口
F12，把焦点从编辑器移到最近使用的工具窗口
Shift+F1，要打开编辑器光标字符处使用的类或者方法 Java 文档的浏览器
Ctrl+W，可以选择单词继而语句继而行继而函数
Ctrl+Shift+W，取消选择光标所在词
Alt+F7，查找整个工程中使用地某一个类、方法或者变量的位置
Ctrl+I，实现方法
Ctrl+Shift+U，大小写转化
Ctrl+Y，删除当前行


Shift+Enter，向下插入新行
psvm/sout，main/System.out.println(); Ctrl+J，查看更多
Ctrl+Shift+F，全局查找
Ctrl+F，查找/Shift+F3，向上查找/F3，向下查找
Ctrl+Shift+S，高级搜索
Ctrl+U，转到父类
Ctrl+Alt+S，打开设置对话框
Alt+Shift+Inert，开启/关闭列选择模式
Ctrl+Alt+Shift+S，打开当前项目/模块属性
Ctrl+G，定位行
Alt+Home，跳转到导航栏
Ctrl+Enter，上插一行
Ctrl+Backspace，按单词删除
Ctrl+”+/-”，当前方法展开、折叠
Ctrl+Shift+”+/-”，全部展开、折叠
【调试部分、编译】
Ctrl+F2，停止
Alt+Shift+F9，选择 Debug
Alt+Shift+F10，选择 Run
Ctrl+Shift+F9，编译
Ctrl+Shift+F10，运行
Ctrl+Shift+F8，查看断点
F8，步过
F7，步入
Shift+F7，智能步入
Shift+F8，步出
Alt+Shift+F8，强制步过
Alt+Shift+F7，强制步入
Alt+F9，运行至光标处
Ctrl+Alt+F9，强制运行至光标处
F9，恢复程序
Alt+F10，定位到断点
Ctrl+F8，切换行断点
Ctrl+F9，生成项目
Alt+1，项目
Alt+2，收藏
Alt+6，TODO
Alt+7，结构
Ctrl+Shift+C，复制路径
Ctrl+Alt+Shift+C，复制引用，必须选择类名
Ctrl+Alt+Y，同步
Ctrl+~，快速切换方案（界面外观、代码风格、快捷键映射等菜单）
Shift+F12，还原默认布局
Ctrl+Shift+F12，隐藏/恢复所有窗口
Ctrl+F4，关闭
Ctrl+Shift+F4，关闭活动选项卡
Ctrl+Tab，转到下一个拆分器
Ctrl+Shift+Tab，转到上一个拆分器
【重构】
Ctrl+Alt+Shift+T，弹出重构菜单
Shift+F6，重命名
F6，移动
F5，复制
Alt+Delete，安全删除
Ctrl+Alt+N，内联
【查找】
Ctrl+F，查找
Ctrl+R，替换
F3，查找下一个
Shift+F3，查找上一个
Ctrl+Shift+F，在路径中查找
Ctrl+Shift+R，在路径中替换
Ctrl+Shift+S，搜索结构
Ctrl+Shift+M，替换结构
Alt+F7，查找用法
Ctrl+Alt+F7，显示用法
Ctrl+F7，在文件中查找用法
Ctrl+Shift+F7，在文件中高亮显示用法
```

### 1.15.2. 常用插件
<a href="#menu" style="float:right">目录</a>

**Maven Helper**

分析依赖冲突插件

此插件可用来方便显示maven的依赖树，在没有此插件时，如果想看maven的依赖树需要输入命令行： mvn dependency:tree  才可查看依赖。如果想看是否有依赖包冲突的话也需要输入命令行等等的操作。而如果安装Maven Helper插件就可免去命令行困扰。通过界面即可操作完成


**Lombok Plugin**
Lombok必须安装该插件才能使用

**Lua**
编写Lua脚本时可以高亮关键字

**Free Mybatis plugin**
可以方便地在xml和java的mapper文件之间跳转

**zookeeper**
安装之后查看操作各个节点

**Alibaba Java Coding Guidelines**
阿里代码规约检测：

**Key promoter X**
快捷键提示工

**IdeaJad**
查看class文件

**CodeMaker**
代码生成工具

**JUnitGenerator**
单元测试测试生成工具

**GsonFormat**
JSON转领域对象工具

**String Manipulation**
字符串工具


**Iedis**
Redis可视化

**Kubernetes**
K8s工具

**Translation**
中英文翻译工具：







## 1.16. 面试考察
<a href="#menu" style="float:right">目录</a>

### 1.16.1. 技术广度的考察
<a href="#menu" style="float:right">目录</a>

首先考察候选人技术面的完整性，因为工作中是需要具备一定的技术视野的，不能说光知道消息中间件，但是分布式缓存却一无所知。

类似于以前高考的时候，你语文特别好，结果物理特别差，那也是不太合适的。

所以工程师首先要避免自己的技术短板，尤其是三到五年经验的同学，已经彻底度过了自己人生的职场生涯的初期小白入门菜鸟阶段。

所以，务必在工作三到五年的时候，保证自己的技术绝对没有任何短板，整体技术栈要或多或少都知道一些，不能出现盲区。


比如，我现在问你，你们公司有没有什么业务场景是可以用NoSQL的?现在国内各个公司用NoSQL的技术都有哪些选型?具体NoSQL可以解决什么问题?

如果你一问三不知，这就是典型的技术短板，你至少需要大概知道，每个技术一般在什么情况下用，怎么来用，解决的是什么问题。

因此，上面说的消息中间件、分布式缓存、海量数据、分布式搜索、NoSQL、分布式架构、高并发、高可用、高性能这些技术。并不是说真的要求工作几年的同学都要精通到源码层面。

而是说你工作几年以后，应该有一定的技术广度，开阔的技术视野。


### 1.16.2. 底层技术的考察
<a href="#menu" style="float:right">目录</a>

现在很多互联网大厂都会有基本功的考察，举个例子，Java虚拟机的核心原理、内存模型、垃圾回收、线上FullGC卡顿性能优化、线上OOM内存溢出问题你处理。

Java并发中的volatile、锁优化、AQS源码;

Netty背后的IO、网络相关的知识。

其实这种底层技术，是线上高负载大型系统的架构设计和开发，必须要具备的。

因为底层技术不扎实，很多中间件或其他高阶的技术，都无法深入理解其原理。

而且很多时候，解决线上系统的生产故障，都需要这些技术。因此，底层技术的掌握是一个优秀工程师必须具备的素养。


### 1.16.3. 技术深度的考察
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
