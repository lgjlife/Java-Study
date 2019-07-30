
<span id="menu"></span>

# 1. 技术社区
<a href="#menu" style="float:right">目录</a>
* [博客园](https://www.cnblogs.com/)
* [开源中国](https://www.oschina.net/)
* [stackoverflow](https://stackoverflow.com/)
* [CSDN](https://www.csdn.net/)
* [掘金](https://juejin.im/)
* [技术文档下载](http://www.java1234.com/)
* [leetcode](https://leetcode.com/)
* [牛客网](https://www.nowcoder.com/)
# 2. 常用工具

## 2.1. 编译器
* IDEA （个人觉得IDEA比较好用）
* Eclipse
* MyEclipse

## 2.2. IDEA插件
* Lombok： 使用注解，免去实体类中get /set/构造器等代码 ，需要引入lombok包
* Alibaba Java Coding Guidelines ：《阿里巴巴Java开发规约》扫描插件,安装后右键单击选择扫描，会提示哪些地方不符合规范
* MyBatis plugin ： 可以从mybatis mappe接口的方法直接跳转到mapper.xml配置文件
* jclasslib: JClassLib不但是一个字节码阅读器而且还包含一个类库允许开发者读取,修改,写入Java Class文件与字节码


## 2.3. HTTP请求
* POSTMAN（https://www.getpostman.com/）:一款功能强大的网页调试与发送网页HTTP请求的工具
* curl指令

## 2.4. 前端开发编辑
* [vscode](https://code.visualstudio.com/Download)
* IDEA
* Brackets   代码提示，颜色区分
* sublime_text_3   这个Linux下安装后，不支持中文输入，网上有解决办法。

## 2.5. 绘图工具
### 2.5.1. 思维导图
* MindMaster   多平台，免费，可以导出为图片。
### 2.5.2. UML
* https://www.draw.io/ ：在线UML绘制工具，可以保存到本地或者Github
* Dia
```bash
//安装Dia
sudo apt install dia
//运行Dia
dia
```
## 2.6. 编辑器
* VIM
* GEDIT　

## 2.7. 调优工具
* visualVm(https://visualvm.github.io/):是一款免费的,集成了多个 JDK 命令行工具的可视化工具,它能为您提供强大的分析能力,对 Java 应用程序做性能分析和调优.

## 2.8. 压测工具
* Jmeter   可以开多个线程对接口进行压测，并分析压测结果。

## 2.9. 版本管理
* git     
* svn
* 码云
* Git在线练习 [try git](https://try.github.io/)/[git real](https://www.pluralsight.com/courses/code-school-git-real)/[Learn Git Branching](https://learngitbranching.js.org/)

## 2.10. 其他
* SpringBoot Banner 字符生成 [根据图片生成](https://www.degraeve.com/img2txt.php)/[根据文字生成](http://patorjk.com/software/taag/#p=display&f=3D-ASCII&t=MicroBlog%0A)


# 3. Git
<a href="#menu" style="float:right">目录</a>

## 3.1. 基本概念
* 工作区：当前的工作目录
* 本地库: 工作区有一个隐藏目录.git，这个不算工作区，而是Git的版本库
  Git的版本库里存了很多东西，其中最重要的就是称为stage（或者叫index）的暂存区，还有Git为我们自动创建的第一个分支master，以及指向master的一个指针叫HEAD
![](https://www.liaoxuefeng.com/files/attachments/919020037470528/0)
* 远端仓库: 存放在GitHub网站上的版本库

工作区---git add --> 暂存区 ---git commit--->本地仓库---git push --->远程仓库

![](http://img5.imgtn.bdimg.com/it/u=4071081808,3892000553&fm=26&gp=0.jpg)
* 分支相当于给当前的文件创建一个副本，在副本上进行修改，可以创建无数个分支进行同步开发，开发完成后再进行合并操作。

## 3.2. 常用命令
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
# 4. Maven
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

# 5. Jenkins
<a href="#menu" style="float:right">目录</a>

# 6. Docker
<a href="#menu" style="float:right">目录</a>

## 6.1. Docker常用指令

### 6.1.1. 基本概念
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
            
## 6.2. 常用指令
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

## 6.3. 容器
<a href="#menu" style="float:right">目录</a>

### 6.3.1. 容器的管理操作
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
### 6.3.2. 容器内部信息的获取
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
    
## 6.4. 镜像
<a href="#menu" style="float:right">目录</a>

### 6.4.1. 基本概念
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

### 6.4.2. 本地镜像的管理

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
## 6.5. Docker File
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
## 6.6. 数据卷和容器连接
<a href="#menu" style="float:right">目录</a>

### 6.6.1. 容器网络基础
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



### 6.6.2. 数据卷
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


## 6.7. 案例
<a href="#menu" style="float:right">目录</a>

### 6.7.1. docker 安装Mysqk主从复制
* https://www.cnblogs.com/songwenjie/p/9371422.html

### 6.7.2. docker 安装mycat


* 安装openjdk:8镜像
    * docker pull  openjdk:8
* 下载mycat
    * http://www.mycat.io/
    * http://dl.mycat.io/1.6.7.1/
* 

# 7. VIM
<a href="#menu" style="float:right">目录</a>

* 安装
    * apt-get update && apt install vim

* 启动配置文件
    * /etc/vim/vimrc 全局配置文件
    * ~/vimrc

* 支持鼠标操作
    * 输入命令 set mouse=a


# 8. NMON监控工具

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

<a href="#menu" style="float:right">目录</a>
# 1. 计算机基础
<a href="#menu" style="float:right">目录</a>
## 1.1. 数据类型
### 1.1.1. ASCII
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

# 2. 操作系统
## 2.1. 操作系统基本概念
#### 2.1.0.1. 操作系统发展过程

* 无操作系统的计算机
* 单道批处理系统
* 分时系统
* 实时系统
#### 2.1.0.2. 基本特性
* 
# 3. 算法
<a href="#menu" style="float:right">目录</a>

# 4. 网络TCP
<a href="#menu" style="float:right">目录</a>

## 4.1. OSI网路分层



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
## 4.2. IP(Internet Protocol,网际协议)
### 4.2.1. 基本概念
IP协议负责将数据包发送给最终的目标主机。
通信链路层是负责两个直连两个设备之间的通信，而IP是负责两个没有直连设备之间的通信。每个计算机都有自己的IP地址，发送端在发送数据之前要先确定接收者是属于哪台计算机。也就是ARP地址解析协议，通过广播发送请求，有回应的是便是目标主机，然后获取目标主机的网卡地址，缓在发送端，下次发送的时候，就可以从缓存中获取到目标主机的网卡地址。

* IP协议是面向无连接的，通信可靠性由上层解决
    * 一是为了简化
    * 二是为了快速
### 4.2.2. IP地址定义

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

### 4.2.3. IP协议相关技术
#### 4.2.3.1. DNS
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

#### 4.2.3.2. ARP
DNS是通过访问名称获取到IP地址，但是有进行访问还需要获取到这个IP地址对应的MAC地址。

* 查找流程:
    * 主机A访问主机B
    * 主机A广播发送一个ARP请求包，这个包包括主机B的IP地址
    * 这个广播包将会被链路上所有的计算机接收并解析
    * 如果请求包中的IP地址和自己的IP地址一致，那么这个节点将会把自己的MAC地址塞入ARP响应包并返回给主机A
    * 主机A获取到主机B的MAC地址，就可以和主机B进行通信了。
    * 主机A会将主机B的MAC地址进行缓存到本地，以供下次使用
    * 这个缓存会按照一定机制被清除，也就是有过期时间。同时若请求失败，也会重新发起获取MAC地址请求。

## 4.3. 传输层
<a href="#menu" style="float:right">目录</a>

### 4.3.1. 基本概念

#### 4.3.1.1. TCP和UDP差别

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

#### 4.3.1.2. 端口
数据链路中的MAC地址: 识别同一链路中的不同计算机
IP中的IP地址:识别TCP/IP网络中互联的主机和路由器
端口号:用于识别同一台计算机中不同的应用程序


端口号的范围万为0-65535之间
（1）公认端口（WellKnownPorts）：从0到1023，它们紧密绑定（binding）于一些服务。通常这些端口的通讯明确表明了某种服务的协议。例如：80端口实际上总是HTTP通讯。
（2）注册端口（RegisteredPorts）：从1024到49151。它们松散地绑定于一些服务。也就是说有许多服务绑定于这些端口，这些端口同样用于许多其它目的。例如：许多系统处理动态端口从1024左右开始。
（3）动态和/或私有端口（Dynamicand/orPrivatePorts）：从49152到65535。理论上，不应为服务分配这些端口。实际上，机器通常从1024起分配动态端口。但也有例外：SUN的RPC端口从32768开始

### 4.3.2. UDP
### 4.3.3. TCP
TCP通信中的四元组:源IP，源端口，目标IP，目标端口

#### 4.3.3.1. 连接管理
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


#### 4.3.3.2. 超时重传机制
#### 4.3.3.3. 数据流和窗口机制
#### 4.3.3.4. 阻塞控制 


# 5. 网络HTTP
<a href="#menu" style="float:right">目录</a>

## 5.1. 基本概念
### 5.1.1. 访问一个网站的流程
* 输入网址
* DNS域名解析服务解析域名，获取域名对应的服务器IP
* ARP地址解析协议根据IP查找服务端的MAC地址
* TCP 3次连接流程，客户端和服务端建立连接
* 连接建立之后，客户端发送请求
* 服务端收到请求之后，进行业务处理，根据请求返回客户端的数据。
* 客户端收到服务端响应，渲染页面
* 如果是短连接，客户端将发送关闭连接请求。也就是四次挥手。
### 5.1.2. 媒体类型(MIME)
* 因特网上有数千种不同的数据类型，http会给每种要通过web传输的对象都打上一个名为MIME类型（MIME type）的数据格式标签
* web服务器会为所有http对象数据附加一个MIME类型。
* 当web浏览器从服务器中取回一个对象时，会去查看相关的MIME类型，看看他们是否知道如何处理这个对象。
* 大多数浏览器都可以处理数百种常见的对象类型：显示图片文件、解析并格式化html文件等等。
* MIME类型是一种文本标记，表示一种主要的对象类型和一个特定的子类型，中间由一个斜杠来分割。

## 5.2. URL和资源
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


## 5.3. HTTP报文
<a href="#menu" style="float:right">目录</a>

### 5.3.1. 请求报文和响应报文

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

### 5.3.2. 首部
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
### 5.3.3. 方法

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

### 5.3.4. 状态码

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

## 5.4. 连接管理
<a href="#menu" style="float:right">目录</a>
HTTP要传送一条报文时，会以流的形式将报文数据的内容通过一条打开的TCP连接按序传输，TCP收到数据流之后，会将数据流砍成被称作段的小数据块。并将段封装在IP分组中，通过因特网进行传输。

### 5.4.1. 对TCP性能的考虑
HTTP是TCP的上层，主要通信实现由TCP/IP层实现，因此影响性能的主要也是这两层。
影响性能主要以下几点
* 首次访问时的DNS域名解析，可能花费数十秒，后续访问会进行缓存。
* TCP连接建立过程
### 5.4.2. 持久连接

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
   
## 5.5. WEB服务器
<a href="#menu" style="float:right">目录</a>

## 5.6. 代理
<a href="#menu" style="float:right">目录</a>

## 5.7. 缓存
<a href="#menu" style="float:right">目录</a>

## 5.8. 网关 
<a href="#menu" style="float:right">目录</a>

## 5.9. 客户端识别与Cookie机制
<a href="#menu" style="float:right">目录</a>

## 5.10. 基本认证机制
<a href="#menu" style="float:right">目录</a>

## 5.11. 摘要认证
<a href="#menu" style="float:right">目录</a>

## 5.12. 安全HTTP
<a href="#menu" style="float:right">目录</a>

## 5.13. 实体和编码
<a href="#menu" style="float:right">目录</a>

## 5.14. 国际化
<a href="#menu" style="float:right">目录</a>

## 5.15. WEB主机托管
<a href="#menu" style="float:right">目录</a>

## 5.16. 重定向和负载均衡
<a href="#menu" style="float:right">目录</a>


# 6. Unix环境编程
<a href="#menu" style="float:right">目录</a>
# 7. Shell
<a href="#menu" style="float:right">目录</a>
## 7.1. 文件相关
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

## 7.2. 系统监控
<a href="#menu" style="float:right">目录</a>
## 7.3. 处理数据文件
<a href="#menu" style="float:right">目录</a>
## 7.4. 环境变量
<a href="#menu" style="float:right">目录</a>
## 7.5. 基本脚本命令
<a href="#menu" style="float:right">目录</a>
## 7.6. 结构化命令
<a href="#menu" style="float:right">目录</a>
## 7.7. 处理用户输入
<a href="#menu" style="float:right">目录</a>
## 7.8. 控制脚本
<a href="#menu" style="float:right">目录</a><span id="menu"></span>


# 1. Java基础
<a href="#menu" style="float:right">目录</a>
## 1.1. 数据类型
<a href="#menu" style="float:right">目录</a>
### 1.1.1. 数据类型
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
### 1.1.2. Integer 缓存对象
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
### 1.1.3. 数组
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
### 1.1.4. String 
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


## 1.2. 面向对象
<a href="#menu" style="float:right">目录</a>
### 1.2.1. 三大特性
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
### 1.2.2. 权限修饰符
<a href="#menu" style="float:right">目录</a>
* private 本类可见
* default 同一个包/子包可见
* protect 子类可见
* public 所有可见

### 1.2.3. 接口和抽象类
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


### 1.2.4. 内部类
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
### 1.2.5. 枚举类
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
## 1.3. 范型
<a href="#menu" style="float:right">目录</a>
## 1.4. 集合
<a href="#menu" style="float:right">目录</a>
## 1.5. 异常
<a href="#menu" style="float:right">目录</a>
## 1.6. 注解
<a href="#menu" style="float:right">目录</a>
## 1.7. IO
<a href="#menu" style="float:right">目录</a>
## 1.8. 反射
<a href="#menu" style="float:right">目录</a>
## 1.9. JDBC
<a href="#menu" style="float:right">目录</a>

# 2. JAVA Socket编程
<a href="#menu" style="float:right">目录</a>

# 4. JDK版本变化
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


# 5. Java性能优化
<a href="#menu" style="float:right">目录</a>

## 5.1. Java 性能调优概述

### 5.1.1. 性能概述
* 性能参考指标
    * 执行时间
    * CPU时间
    * 内存分配
    * 磁盘吞吐量
    * 网络吞吐量
    * 响应时间 

* 最有可能影响系统性能的原因
    * 磁盘IO
        * 磁盘IO读写的速度比内存要慢很多，如果CPU等待IO读写，将会影响整个性能。可以使用异步IO等解决
    * 网络操作
        * 由于网络环境不确定性，可能存在较大延迟。
    * CPU
        * CPU代表计算能力，CPU性能越好，代码执行越快，同时多核还可以实现程序并行执行
    * 异常
        * 异常的捕获和处理是非常耗资源的
    * 数据库
        * 数据库读写涉及到网络通信，磁盘读写，锁竞争，所以也会影响系统性能。
    * 锁竞争
        * 锁竞争带来上下文切换，消耗较大的CPU资源
    * 内存
        * 内存用于缓存数据，内存不足，导致应用出现内存溢出，频繁进行垃圾回收。垃圾回收是一项很耗费系统性能的过程，同时也可能造成Stop the world出现。

### 5.1.2. 性能调优的层次     

* 设计调优
    * 比如选择好的组件，使用NIO替换BIO
    * 单体做成微服务
* 代码调优
    * 单例模式的使用
    * 使用更好的算法
* JVM调优
    * 垃圾收集器的选择
    * 内存参数的设置
* 数据库调优
    * 缓存
    * 读写分离
    * 索引
* 操作系统调优
## Java程序优化
<a href="#menu" style="float:right">目录</a>

### 有助于改善性能的技巧
* try-catch不要在循环中使用
* 使用局部变量
    * 局部变量在栈中创建，速度快
* 位运算代替乘除法
* 使用clone代替new



## 设计优化
<a href="#menu" style="float:right">目录</a>

### 
<a href="#menu" style="float:right">目录</a>
* 缓冲
* 缓存
* 对象复用
* 并行代替串行
* 负载均衡
* 时间换空间
* 空间换时间

## 5.2. JVM内存模型介绍
<a href="#menu" style="float:right">目录</a>

### 运行时数据区域
![](https://github.com/lgjlife/Java-Study/blob/master/pic/jvm/jvm.jpg?raw=true)

* 程序计数器
    * 线程私有
    * 当前线程所执行字节码的行号指示器
    * 字节码解释器就是通过改变这个计数器的值来选取下一条需要执行的指令
    * 如果执行的是Java代码，则记录的是正在执行的虚拟机字节码指令的地址
    * 如果执行的是Native方法，则为Undefined
    * 此内存区域唯一一个不会出现OutOfMemoryError异常的区域
* Java 虚拟机栈
    * 线程私有
    * 虚拟机栈描述方法执行的内存模型
    * 每个方法在执行时都会创建一个栈帧，用于存储局部变量表，操作数栈，动态链接，方法出口等信息
    * 每个方法在调用到执行完成的过程，就对应着一个栈帧在虚拟机栈中入栈到出栈的过程
    * 会抛出OutOfMemoryError和StackOverFlowError异常
* 本地方法栈
    * Native的方法栈
    * 会抛出OutOfMemoryError和StackOverFlowError异常
* Java堆
    * 线程共享
    * 所有对象和实例都在堆上分配
    * 会抛出OutOfMemoryError和StackOverFlowError异常
* 方法区
    * 线程共享
    * 存储已被虚拟机加载的类信息，常量，静态变量，即时编译器编译后的代码
    * 方法区是一种规范，JDK7使用永久代来实现，JDK8使用metadata元空间来实现
    * 会抛出OutOfMemoryError和StackOverFlowError异常
## 5.3. 垃圾收集器和内存分配策略
<a href="#menu" style="float:right">目录</a>

## 5.4. 虚拟机性能监控和故障处理工具
<a href="#menu" style="float:right">目录</a>

## 5.5. 类文件结构
<a href="#menu" style="float:right">目录</a>

## 5.6. 虚拟机类加载机制
<a href="#menu" style="float:right">目录</a>

## 5.7. 虚拟机字节码执行引擎
<a href="#menu" style="float:right">目录</a>


## 5.8. 编译期优化
<a href="#menu" style="float:right">目录</a>

## 5.9. 运行期优化
<a href="#menu" style="float:right">目录</a>

## 5.10. Java内存模型与线程
<a href="#menu" style="float:right">目录</a>

## 5.11. 线程安全与锁优化
<a href="#menu" style="float:right">目录</a>




# 6. 设计模式
<a href="#menu" style="float:right">目录</a>

## 6.1. 设计原则
<a href="#menu" style="float:right">目录</a>

### 6.1.1. 单一职责原则
* 每个类只负责单一的功能，避免出现复杂臃肿的类。造成维护困难。
### 6.1.2. 里氏替换原则
* 父类出现的地方子类也可以出现。方便实现类替换，减少代码修改。
### 6.1.3. 依赖倒置原则
* 高层模块不应该依赖细节，而应该依赖其抽象
* 也就是说定义类属性时，使用接口或者抽象类来定义，而不是实现类。
### 6.1.4. 接口隔离原则
* 创建单一的接口，不要创建臃肿的接口。每个接口应该只是负责单一的功能，避免增加新抽象方法时，造成较多的实现类页需要修改。
### 6.1.5. 迪米特法则
* 一个类应当降低对其他类的依赖,避免其他类修改时，使用类也要进行修改。
### 6.1.6. 开闭原则
* 对修改关闭，对扩展开放
* 当需要增加新功能时，应当避免修改原类的代码，应当通过一些设计模式来进行功能扩展。比如装饰模式，这样可以达到对其他使用类的影响。
* 以上的原则都是施行指南，开闭原则是最终目标。

## 6.2. UML图

## 6.3. 单例模式
<a href="#menu" style="float:right">目录</a>

### 6.3.1. 基本概念

**定义**:确保某一个类只有一个对象实例。
**衍生**：有限多例，比如对象池技术，使用缓存将创建的对象缓存起来。
**优点**:
* 减少内存开支，每创建一个对象都会占用一定的系统内存，创建过多容易造成JVM进行垃圾回收。
* 降低系统性能开销，创建和垃圾回收会耗费一定的系统性能
* 从业务层面讲。可以提供公共的资源访问点。

**缺点**:

### 6.3.2. 实现
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

## 6.4. 工厂方法模式
<a href="#menu" style="float:right">目录</a>

## 6.5. 抽象工厂模式
<a href="#menu" style="float:right">目录</a>

## 6.6. 模板方法模式
<a href="#menu" style="float:right">目录</a>

## 6.7. 建造者模式
<a href="#menu" style="float:right">目录</a>

## 6.8. 代理模式
<a href="#menu" style="float:right">目录</a>

## 6.9. 原型模式
<a href="#menu" style="float:right">目录</a>

## 6.10. 中介者模式
<a href="#menu" style="float:right">目录</a>

## 6.11. 命令模式
<a href="#menu" style="float:right">目录</a>

## 6.12. 责任链模式
<a href="#menu" style="float:right">目录</a>

## 6.13. 装饰模式
<a href="#menu" style="float:right">目录</a>

## 6.14. 策略模式
<a href="#menu" style="float:right">目录</a>

## 6.15. 适配器模式
<a href="#menu" style="float:right">目录</a>

## 6.16. 迭代器模式
<a href="#menu" style="float:right">目录</a>

## 6.17. 组合模式
<a href="#menu" style="float:right">目录</a>

## 6.18. 观察者模式
<a href="#menu" style="float:right">目录</a>

## 6.19. 门面模式
<a href="#menu" style="float:right">目录</a>

## 6.20. 备忘录模式
<a href="#menu" style="float:right">目录</a>

## 6.21. 访问者模式
<a href="#menu" style="float:right">目录</a>

## 6.22. 状态模式
<a href="#menu" style="float:right">目录</a>

## 6.23. 解释器模式
<a href="#menu" style="float:right">目录</a>

## 6.24. 享元模式
<a href="#menu" style="float:right">目录</a>

## 6.25. 桥梁模式
<a href="#menu" style="float:right">目录</a>
<h1>多线程</h1>



# 1. 基本概念
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

# 2. Java多线程
<a href="#menu" style="float:right">目录</a>

## 2.1. 实现方式
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

## 2.2. 基本属性
* 线程名称，主线程为main，其他线程为Thread-1,Thread-2,可自定义，用于区分不同的线程。
* 线程分组
* 线程优先级
* 守护线程标志，默认为非守护线程

## 2.3. 常用方法

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
    
## 2.4. 生命周期 & 线程状态

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
## 2.5. 线程监控工具
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

# 3. Synchronized
<a href="#menu" style="float:right">目录</a>
### 3.0.1. 基本概念
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

## 3.1. 基本使用
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
## 3.2. 实现原理
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


# 4. 线程间通信
## 4.1. 基本概念
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

## 4.2. 实现消费者和生产者


# 5. Java内存模型
<a href="#menu" style="float:right">目录</a>   

# 6. volatile
<a href="#menu" style="float:right">目录</a>
 
# 7. Lock
<a href="#menu" style="float:right">目录</a>

# 8. 线程池
<a href="#menu" style="float:right">目录</a>


# 9. 并发工具类
<a href="#menu" style="float:right">目录</a>


# 10. 异步编程
<a href="#menu" style="float:right">目录</a>


<span id="menu"></span>

# 1. Spring
<a href="#menu" style="float:right">目录</a>

## 1.1. IOC容器
## 1.2. AOP面向切面编程
## 1.3. Spring 事务管理
## 常用注解
## 常用工具类

# 2. Sppring MVC
## Servlet



# 3. SpringBoot
<a href="#menu" style="float:right">目录</a>

## 3.1. 基本概念
SpringBoot的核心
* 自动配置，针对很多Spring应用常用框架进行自动默认配置，可以让你轻松启动项目。比如jedis。原先使用Jedis需要配置连接地址，配置连接池，使用SpringBoot之后，这些都会帮你配置好，只要引入相关依赖，调用其提供的接口，即可实现对Redis的访问。
* 起步依赖:告诉Spring使用什么功能，他都能引入需要的库。
* Actuator

## 3.2. Spring Boot 环境下创建Bean

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

# 4. SpringCloud
<a href="#menu" style="float:right">目录</a>



# 5. 测试
<a href="#menu" style="float:right">目录</a>
## 5.1. 基本测试
<a href="#menu" style="float:right">目录</a>
## 5.2. 控制层测试
<a href="#menu" style="float:right">目录</a>
## 5.3. 服务层测试
<a href="#menu" style="float:right">目录</a>
## 5.4. DAO层测试
<a href="#menu" style="float:right">目录</a>


# 6. 登录认证
## 6.1. Shiro
## 6.2. oauth2
## 6.3. token
<a href="#menu" style="float:right">目录</a>

# 2. RocketMQ
<a href="#menu" style="float:right">目录</a>

# 3. RabbitMQ
<a href="#menu" style="float:right">目录</a>

# 4. Kafka
<a href="#menu" style="float:right">目录</a>


# 7. elasticsearch
<a href="#menu" style="float:right">目录</a>

# 8. FastDfs
<a href="#menu" style="float:right">目录</a>


# 9. Zookeeper
<a href="#menu" style="float:right">目录</a>

## 9.1. 基本概念
<a href="#menu" style="float:right">目录</a>

### 9.1.1. zk架构
![](https://zookeeper.apache.org/doc/r3.5.5/images/zkservice.jpg)
zk的结构如下，类似于一个Linux文件系统，根节点是"/"。
同时你可以在每个节点上添加监听器，当数据发生变化(增加，修改，删除)时，将会通知客户端。
因此zk简单理解就是一个类似文件系统结构的并且具有变更通知功能的分布式协调系统。
每一个节点称为zode。每个节点下可以创建多个子节点，每个节点还可以存放数据。

![](https://zookeeper.apache.org/doc/r3.5.5/images/zknamespace.jpg)


* 适用场景
在分布式系统中，多个服务需要共享一些系统配置信息，比如微服务环境下，服务提供者向zookeeper注册自己多的元数据信息(比如服务名称，地址等)。服务消费者通过注册监听器，获取到zk中服务信息的变化，服务消费者拉取新的配置信息同时更新本地缓存。就解决了服务提供者变更信息的情况下，服务消费者无需更新配置，所有过程都是自动化进行高的。

目前使用zk作为分布式协调系统的有Dubbo和Kafka

* 不适用场景
不适合做海量数据存储，海量数据应当使用数据库，分布式文件系统等。

* 主从模式
为了提高系统的可靠性，zk提供主从模式的分布式部署方式。

**主节点**: 主节点负责监视新的从节点和任务，分配任务给可用的从节点。每个集群只能有一个主节点。
**从节点**: 从节点通过系统注册自己，以确保主节点看到它们可以执行任务，然后开始监视新任务。

* 可靠性和快速性保证
    * 顺序一致性 - 客户端的更新将按发送顺序执行。
    * 原子性 - 更新成功或失败。 没有部分结果。
    * 单系统映像 - 无论服务器连接到哪个服务器，客户端都将看到相同的服务视图。
    * 可靠性 - 一旦应用了更新，它将从那时起持续到客户端覆盖更新。
    * 及时性 - 系统的客户视图保证在特定时间范围内是最新的。

### 9.1.2. 提供的功能
* 给节点创建监听器
* create : 创建节点
* delete : 删除节点
* exists : 检测节点是否存在
* get data : 从节点读取数据
* set data : 向节点写入数据
* get children : 获取子节点列表
* sync : 等待数据传播

### 9.1.3. 节点类型

以下两种类型可以交叉组合，比如持久有序，持久无序。
* 持久化节点(persistent)和临时节点(ephemeral)，临时节点在与创建它的客户端连接断开以后，判定连接失效之后将会被删除,或者客户端主动删除。持久化节点在创建成功之后，将会一直存在，除非手动删除。
* 有序节点和无序节点，有序节点在每次创建时同一个名称的节点时会自动在节点名称后面加上序列号。

**应用场景**:微服务中的失效剔除可以使用临时节点来实现，当服务提供者失效时，zk判断连接失败之后将服务信息删除，如果消费者监听该节点，将会收到删除请求。


<a href="#menu" style="float:right">目录</a><h1>高并发</h1>


<span id="menu"></span>




# 1. 概述
<a href="#menu" style="float:right">目录</a>

## 1.1. 高并发原则
* 无状态
    * 应用无状态，可以方便的进行集群扩展
    * 应用的配置从配置文件中读取，或者从配置中心读取
* 拆分
    * 服务垂直拆分，合理利用计算机资源
    * 降低某个模块出现故障导致其他模块无法使用的问题
    * 拆分原则
        * 系统维度，按照业务进行拆分，比如用户服务，积分服务
        * 功能维度，系统维度拆分之后再进行进一步按照功能进行拆分,比如积分分为领取系统，消费积分系统
        * 读写维度，按照读写差异进行拆分、读写分离
        * 模块维度，比如MVC架构
* 服务化
    * 系统拆分之后的微服务化
* 消息队列
    * 服务解耦
    * 异步处理
    * 流量消峰
* 数据异构
    * 分库分表
* 缓存
    * 客户端缓存
    * 代理缓存
    * 广域网缓存
        * CDN
        * 镜像服务器
        * P2P技术
    * 进程缓存
    * 分布式缓存
* 并发化
    * 多线程处理
## 1.2. 高可用原则
<a href="#menu" style="float:right">目录</a>

* 降级
    * 降级为在高并发下，将某些应用或者某些功能暂停使用，减少对资源的争抢，保障系统可用
    * 降级处理
        * 开关集中化，可以通过服务配置中心进行降级操作
        * 可降级的多级读服务，比如降级为只读本地缓存，只读分布式缓存
        * 开关前置化，比如并发流量大时，在Nginx处进行限流
        * 业务降级
            * 不重要的业务暂停工作
            * 同步调用改异步调用，保证数据最终一致即可
* 限流
    * 防止恶意请求流量，恶意攻击，防止流量超出系统峰值。
    * 恶意请求流量只访问到cache
    * 对于穿透到后端的可以考虑Nginx的Limit模块处理
    * 对于恶意IP可以使用nginx deny进行屏蔽
    
* 切流量
    * 机房挂了或者某台服务器挂了需要切流量
    * DNS:切换机房入口
    * HttpsDNS,在客户端分配好流量入口，绕过运营商的LocalDNS,并实现更精准流量调度
    * LVS/HAProxy:切换故障的Nginx接入层
    * Nginx:切换故障的应用层
* 可回滚
    * 版本回滚，新版本上线出现问题，可以回滚到之前的版本
* 集群部署，负载均衡，避免单点故障
    * 硬件负载均衡
    * 软件负载均衡
* 设计可容错的系统
    * 当某个服务不可用时，请求该服务应当有容错处理，避免频繁地重试。或者阻塞等待。造成系统线程武无限增长，最后宕积
* 限制使用资源
    * 比如使用堆内存时，应当限制最大内存限值，避免无限制的使用造成频繁地GC
    * 线程以及线程池中的无限队列不合适使用都有可能造成内存溢出
    * 循环使用也有可能出现CPU飙升
    * 限制网络的使用， 频繁地建立连接和关闭连接非常地耗性能,可以使用长连接或者连接池
* 热备
* 使用多机房
    
# 2. 负载均衡
<a href="#menu" style="float:right">目录</a>

## 2.1. 什么是负载均衡
　互联网早期，业务流量比较小并且业务逻辑比较简单，单台服务器便可以满足基本的需求；但随着互联网的发展，业务流量越来越大并且业务逻辑也越来越复杂，单台机器的性能问题以及单点问题凸显了出来，因此需要多台机器来进行性能的水平扩展以及避免单点故障。但是要如何将不同的用户的流量分发到不同的服务器上面呢？

　 早期的方法是使用DNS做负载，通过给客户端解析不同的IP地址，让客户端的流量直接到达各个服务器。但是这种方法有一个很大的缺点就是延时性问题，在做出调度策略改变以后，由于DNS各级节点的缓存并不会及时的在客户端生效，而且DNS负载的调度策略比较简单，无法满足业务需求，因此就出现了负载均衡。


　客户端的流量首先会到达负载均衡服务器，由负载均衡服务器通过一定的调度算法将流量分发到不同的应用服务器上面，同时负载均衡服务器也会对应用服务器做周期性的健康检查，当发现故障节点时便动态的将节点从应用服务器集群中剔除，以此来保证应用的高可用。


　负载均衡又分为四层负载均衡和七层负载均衡。四层负载均衡工作在OSI模型的传输层，主要工作是转发，它在接收到客户端的流量以后通过修改数据包的地址信息将流量转发到应用服务器。

　七层负载均衡工作在OSI模型的应用层，因为它需要解析应用层流量，所以七层负载均衡在接到客户端的流量以后，还需要一个完整的TCP/IP协议栈。七层负载均衡会与客户端建立一条完整的连接并将应用层的请求流量解析出来，再按照调度算法选择一个应用服务器，并与应用服务器建立另外一条连接将请求发送过去，因此七层负载均衡的主要工作就是代理。

## 2.2. 硬件负载均衡

硬件负载均衡解决方案是直接在服务器和外部网络间安装负载均衡设备，这种设备我们通常称之为负载均衡器，由于专门的设备完成网络请求转发的任务，独立于操作系统，整体性能高，负载均衡策略多样化，流量管理智能化。

**硬件负载均衡的优缺点是什么？**

* 优点
    * 直接连接交换机,处理网络请求能力强，与系统无关，负载性可以强。可以应用于大量设施、适应大访问量、使用简单。
* 缺点
    * 成本高，配置冗余．即使网络请求分发到服务器集群，负载均衡设施却是单点配置；无法有效掌握服务器及应使用状态.

**使用的注意事项以及应用的场景？**

注意事项，需要注意的是硬件负载均衡技术只专注网络判断，不考虑业务系统与应用使用的情况。有时候系统处理能力已经达到了瓶颈，但是此时网络并没有异常，由于硬件负载均衡并没有察觉到应用服务器的异常，还是让流量继续进入到应用服务器。

**硬件负载均衡器实现哪些功能？**

目前市面上有NetScaler, F5, Radware, Array 等产品，基本实现原理大致相同，我们这里把使用的比较多的 F5做为例子给大家做简单解释，算是窥豹一斑。

**多链路负载均衡**

关键业务都需要安排和配置多条ISP（网络服务供应商）接入链路以保证网络服务的质量。如果某个ISP停止服务或者服务异常了，那么可以利用另一个ISP替代服务，提高了网络的可用性。不同的ISP有不同自治域,因此需要考虑两种情况:INBOUND 和 OUTBOUND。

INBOUND，来自网络的请求信息。F5 分别绑定两个ISP 服务商的公网地址,解析来自两个ISP服务商的DNS解析请求。F5可以根据服务器状况和响应情况对DNS进行发送,也可以通过多条链路分别建立DNS连接。
OUTBOUND，返回给请求者的应答信息。F5可以将流量分配到不同的网络接口，并做源地址的NAT（网络地址转换）,即通过IP地址转换为源请求地址。也可以用接口地址自动映射,保证数据包返回时能够被源头正确接收。

**防火墙负载均衡**

针对大量网络请求的情况单一防火墙的能力就有限了，而且防火墙本身要求数据同进同出，为了解决多防火墙负载均衡的问题，F5提出了防火墙负载均衡的“防火墙三明治"方案

防火墙会对用户会话的双向数据流进行监控，从而确定数据的合法性。如果采取多台防火墙进行负载均衡，有可能会造成同一个用户会话的双向数据在多台防火墙上都进行处理，而单个防火墙上看不到完成用户会话的信息，就会认为数据非法因此抛弃数据。所以在每个防火墙的两端要架设四层交换机，可以在作流量分发的同时，维持用户会话的完整性，使同一用户的会话由一个防火墙来处理。而F5 会协调上述方案的配置和实现，把“交换机”，“防火墙”，“交换机”夹在了一起好像三明治一样。

![](http://5b0988e595225.cdn.sohucs.com/images/20190123/daf62f34338741818adada510f393b91.jpeg)

防火墙“三明治”

**服务器负载均衡**

对于应用服务器服务器可以在F5上配置并且实现负载均衡，F5可以检查服务器的健康状态如果发现故障，将其从负载均衡组中移除。
F5 对于外网而言有一个真实的IP，对于内网的每个服务器都生成一个虚拟IP，进行负载均衡和管理工作。因此,它能够为大量的基于TCP/IP的网络应用提供服务器负载均衡服务。
根据服务类型不同定义不同的服务器群组。
根据不同服务端口将流量导向对应的服务器。甚至可以对VIP用户的请求进行特殊的处理，把这类请求导入到高性能的服务器使VIP客户得到最好的服务响应。
根据用户访问内容的不同将流量导向指定服务器。

* 可用性
    * 自身高可用性，在双机冗余模式下工作时实现毫秒级切换。
    * 设备冗余电源模块可选。
    * 每台设备通过心跳线监控其他设备的电频，发现故障的时候可以完成自动切换。
    * 链路冗余：对链路故障进行实时检测，一旦发现故障进行自动流量切换，过程透明。
    * 服务器冗余：对服务器进行心跳检测，一旦发现故障立即从服务器列表中移除，如果恢复工作又重新加入到服务器列表中。

* 安全性
    * 站点安全防护
    * 拆除空闲连接防止拒绝服务攻击
    * 能够执行源路由跟踪防止IP欺骗
    * 拒绝没有ACK缓冲确认的SYN防止SYN攻击
    * 拒绝teartop和land攻击;保护自己和服务器免受ICMP攻击
* 系统管理
    * 提供浏览器级别管理软件，Web图形用户界面。
    * 总结：对于高并发，高访问量的互联网应用可以考虑加入硬件负载均衡器作为接入层，协助代理层的软件负载均衡器进行负载均衡的工作。硬件负载均衡器的特点是独立于操作系统，处理大访问量，费用高。从功能上来说支持多链路，多服务器，多防火墙的负载均衡，在可用性和安全性上也有良好的表现

## 2.3. 四层和七层负载均衡的区别？
<a href="#menu" style="float:right">目录</a>

### 2.3.1. 技术原理上的区别。
　所谓四层负载均衡，也就是主要通过报文中的目标地址和端口，再加上负载均衡设备设置的服务器选择方式，决定最终选择的内部服务器。

　以常见的TCP为例，负载均衡设备在接收到第一个来自客户端的SYN 请求时，即通过上述方式选择一个最佳的服务器，并对报文中目标IP地址进行修改(改为后端服务器IP），直接转发给该服务器。TCP的连接建立，即三次握手是客户端和服务器直接建立的，负载均衡设备只是起到一个类似路由器的转发动作。在某些部署情况下，为保证服务器回包可以正确返回给负载均衡设备，在转发报文的同时可能还会对报文原来的源地址进行修改。

　所谓七层负载均衡，也称为“内容交换”，也就是主要通过报文中的真正有意义的应用层内容，再加上负载均衡设备设置的服务器选择方式，决定最终选择的内部服务器。

　以常见的TCP为例，负载均衡设备如果要根据真正的应用层内容再选择服务器，只能先代理最终的服务器和客户端建立连接(三次握手)后，才可能接受到客户端发送的真正应用层内容的报文，然后再根据该报文中的特定字段，再加上负载均衡设备设置的服务器选择方式，决定最终选择的内部服务器。
　
　负载均衡设备在这种情况下，更类似于一个代理服务器。负载均衡和前端的客户端以及后端的服务器会分别建立TCP连接。所以从这个技术原理上来看，七层负载均衡明显的对负载均衡设备的要求更高，处理七层的能力也必然会低于四层模式的部署方式。那么，为什么还需要七层负载均衡呢？

### 2.3.2. 应用场景的需求。
　七层应用负载的好处，是使得整个网络更"智能化", 参考我们之前的另外一篇专门针对HTTP应用的优化的介绍，就可以基本上了解这种方式的优势所在。例如访问一个网站的用户流量，可以通过七层的方式，将对图片类的请求转发到特定的图片服务器并可以使用缓存技术；将对文字类的请求可以转发到特定的文字服务器并可以使用压缩技术。

　当然这只是七层应用的一个小案例，从技术原理上，这种方式可以对客户端的请求和服务器的响应进行任意意义上的修改，极大的提升了应用系统在网络层的灵活性。很多在后台，(例如Nginx或者Apache)上部署的功能可以前移到负载均衡设备上，例如客户请求中的Header重写，服务器响应中的关键字过滤或者内容插入等功能。

　另外一个常常被提到功能就是安全性。网络中最常见的SYN Flood攻击，即黑客控制众多源客户端，使用虚假IP地址对同一目标发送SYN攻击，通常这种攻击会大量发送SYN报文，耗尽服务器上的相关资源，以达到Denial of Service(DoS)的目的。

　从技术原理上也可以看出，四层模式下这些SYN攻击都会被转发到后端的服务器上；而七层模式下这些SYN攻击自然在负载均衡设备上就截止，不会影响后台服务器的正常运营。另外负载均衡设备可以在七层层面设定多种策略，过滤特定报文，例如SQL Injection等应用层面的特定攻击手段，从应用层面进一步提高系统整体安全。

　现在的7层负载均衡，主要还是着重于应用广泛的HTTP协议，所以其应用范围主要是众多的网站或者内部信息平台等基于B/S开发的系统。 4层负载均衡则对应其他TCP应用，例如基于C/S开发的ERP等系统。

### 2.3.3. 七层应用需要考虑的问题。
是否真的必要，七层应用的确可以提高流量智能化，同时必不可免的带来设备配置复杂，负载均衡压力增高以及故障排查上的复杂性等问题。在设计系统时需要考虑四层七层同时应用的混杂情况。

是否真的可以提高安全性。例如SYN Flood攻击，七层模式的确将这些流量从服务器屏蔽，但负载均衡设备本身要有强大的抗DDoS能力，否则即使服务器正常而作为中枢调度的负载均衡设备故障也会导致整个应用的崩溃。

是否有足够的灵活度。七层应用的优势是可以让整个应用的流量智能化，但是负载均衡设备需要提供完善的七层功能，满足客户根据不同情况的基于应用的调度。最简单的一个考核就是能否取代后台Nginx或者Apache等服务器上的调度功能。能够提供一个七层应用开发接口的负载均衡设备，可以让客户根据需求任意设定功能，才真正有可能提供强大的灵活性和智能性。

## 2.4. 负载均衡的算法
<a href="#menu" style="float:right">目录</a>

### 2.4.1. 随机算法
* Random随机，按权重设置随机概率。在一个截面上碰撞的概率高，但调用量越大分布越均匀，而且按概率使用权重后也比较均匀，有利于动态调整提供者权重。
* 加权随机

### 2.4.2. 轮询及加权轮询
* 轮询(Round Robbin)当服务器群中各服务器的处理能力相同时，且每笔业务处理量差异不大时，最适合使用这种算法。 轮循，按公约后的权重设置轮循比率。存在慢的提供者累积请求问题，比如：第二台机器很慢，但没挂，当请求调到第二台时就卡在那，久而久之，所有请求都卡在调到第二台上。
* 加权轮询(Weighted Round Robbin)为轮询中的每台服务器附加一定权重的算法。比如服务器1权重1，服务器2权重2，服务器3权重3，则顺序为1-2-2-3-3-3-1-2-2-3-3-3- ......
### 2.4.3. 最小连接及加权最小连接
* 最少连接(Least Connections)在多个服务器中，与处理连接数(会话数)最少的服务器进行通信的算法。即使在每台服务器处理能力各不相同，每笔业务处理量也不相同的情况下，也能够在一定程度上降低服务器的负载。
加权最少连接(Weighted Least Connection)为最少连接算法中的每台服务器附加权重的算法，该算法事先为每台服务器分配处理连接的数量，并将客户端请求转至连接数最少的服务器上。
### 2.4.4. 哈希算法
* 普通哈希
* 一致性哈希一致性Hash，相同参数的请求总是发到同一提供者。当某一台提供者挂时，原本发往该提供者的请求，基于虚拟节点，平摊到其它提供者，不会引起剧烈变动。
### 2.4.5. IP地址散列
* 通过管理发送方IP和目的地IP地址的散列，将来自同一发送方的分组(或发送至同一目的地的分组)统一转发到相同服务器的算法。当客户端有一系列业务需要处理而必须和一个服务器反复通信时，该算法能够以流(会话)为单位，保证来自相同客户端的通信能够一直在同一服务器中进行处理。
### 2.4.6. URL散列
* 通过管理客户端请求URL信息的散列，将发送至相同URL的请求转发至同一服务器的算法。

### 2.4.7. 一致性哈希算法
先构造一个长度为232的整数环（这个环被称为一致性Hash环），根据节点名称的Hash值（其分布为[0, 232-1]）将服务器节点放置在这个Hash环上，然后根据数据的Key值计算得到其Hash值（其分布也为[0, 232-1]），接着在Hash环上顺时针查找距离这个Key值的Hash值最近的服务器节点，完成Key到服务器的映射查找。
一致性hash算法还可以实现一个消费者一直命中一个服务提供者。

如下图，一共有四个服务提供者
provider-1: 127.0.0.1:8001
provider-2: 127.0.5.2:8145
provider-3: 127.0.1.2:8123
provider-4: 127.1.3.2:8256
通过hash计算后，四个节点分布在hash环的不同位置上
当有一个消费者(127.0.0.1:8011)通过hash计算后，定位到如图中所示位置，它会顺时针查找下一个节点，选择第一个查找到的节点。
![](https://img2018.cnblogs.com/blog/1404294/201904/1404294-20190418012355339-761343066.png)

**这里存在几个关键问题：**
* hash算法的影响
如果hash算法计算结果过于集中，如下图，节点分布再很小的范围内，如果消费者大部分命中范围之外，就会导致node1负载异常的大，出现负载不均衡的问题。

所以需要一个比较好的hash算法。
![](https://img2018.cnblogs.com/blog/1404294/201904/1404294-20190418013347849-699391562.png)


解决这个问题的办法是需要选择一个好的hashcode算法,hash算法比较 

* 增加或者删除节点时会导致负载不均衡
如下图：
正常情况下每个节点都是25%的命中概率
节点node2失效时，之前节点2的所有命中全部加到节点３,导致节点3的负载变大
当增加节点5时，之前节点３的命中全部给了节点５,也还是出现了负载不均衡。
![](https://img2018.cnblogs.com/blog/1404294/201904/1404294-20190418014307245-148213017.png)
解决这个问题的办法是增加虚拟节点
如下图，为每个节点都增加了虚拟节点，增加虚拟节点，可以使整个hash环分布的更加均匀，但有个问题是，节点越多，维护的性能越大，因此，需要增加多少个虚拟节点，需要根据实际需要进行测试。
![](https://img2018.cnblogs.com/blog/1404294/201904/1404294-20190418015507692-1757023041.png)

**实现**
虚拟节点的格式为　127.0.0.1:8001&&node1
分别使用jdk 的hashcode算法和FNV1_32_HASH算法进行比较。　.
```java
public class UniformityHashLoadbalanceStrategy  implements  LoadbalanceStrategy{

    private static final int VIRTUAL_NODES = 5;


    public ProviderConfig select(List<ProviderConfig> configs, Object object){

        SortedMap<Integer, ProviderConfig> sortedMap = new TreeMap();

        for(ProviderConfig config:configs){
            for(int j = 0; j < VIRTUAL_NODES; j++){
                sortedMap.put(caculHash(getKey(config.getHost(),config.getPort(),"&&node"+j)),config);
            }
        }

        System.out.println(sortedMap);
        Integer requestHashcCode = caculHash((String)object);


        SortedMap<Integer, ProviderConfig> subMap = sortedMap.subMap(requestHashcCode,Integer.MAX_VALUE);
        ProviderConfig result= null;
        if(subMap.size()  != 0){
            Integer index = subMap.firstKey();
            result =  subMap.get(index);
        }
        else{
            result = sortedMap.get(0);
        }

        ////　打印测试数据

        new PrintResult(sortedMap,requestHashcCode).print();

        /////

        return  result;


    }
    private String getKey(String host,int port,String node){
        return new StringBuilder().append(host).append(":").append(port).append(node).toString();
    }

    private int caculHash(String str){

       /* int hashCode =  str.hashCode();
        hashCode = (hashCode<0)?(-hashCode):hashCode;
        return hashCode;*/

        final int p = 16777619;
        int hash = (int)2166136261L;
        for (int i = 0; i < str.length(); i++)
            hash = (hash ^ str.charAt(i)) * p;
        hash += hash << 13;
        hash ^= hash >> 7;
        hash += hash << 3;
        hash ^= hash >> 17;
        hash += hash << 5;

        // 如果算出来的值为负数则取其绝对值
        if (hash < 0)
            hash = Math.abs(hash);
        return hash;

    }

}
//用于打印测试数据
@Data
class PrintResult{

    private  boolean flag =false;
    private SortedMap<Integer, ProviderConfig> sortedMap;
    private int requestHashcCode;

    public PrintResult(SortedMap<Integer, ProviderConfig> sortedMap, int requestHashcCode) {
        this.sortedMap = sortedMap;
        this.requestHashcCode = requestHashcCode;
    }

    public void print(){

        sortedMap.forEach((k,v)->{

            if( (false == flag) && ( k > requestHashcCode)){
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            }
            System.out.println("hashcode: " + k + "  " + v.getHost()+":"+v.getPort());
            if( (false == flag) && ( k > requestHashcCode)){
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                flag = true;
            }

        });

        System.out.println("------------------请求的hashcode:"+requestHashcCode);

    }
}
```
测试：
```java
public void uniformityHashLoadbalanceStrategyTest(LoadbalanceStrategy strategy ,int configNum){

        List<ProviderConfig> configs = new ArrayList<>();
        for(int i = 0; i< configNum; i++){
            ProviderConfig config = new ProviderConfig();
            config.setInterfaceName("com.serviceImpl");
            config.setHost("127.0.0.1");
            config.setPort(new Random().nextInt(9999));
            config.setWeight(i);
            config.setCallTime(new Random().nextInt(100));
            configs.add(config);
        }

        ProviderConfig config = strategy.select(configs,"127.0.0.1:1234");
        System.out.println("选择结果:" + config.getHost() + ":" + config.getPort());
    }
```
jdk 的　hashcode 算法

```
hashcode: 441720772  127.0.0.1:1280
hashcode: 441720773  127.0.0.1:1280
hashcode: 441720774  127.0.0.1:1280
hashcode: 441720775  127.0.0.1:1280
hashcode: 441720776  127.0.0.1:1280
hashcode: 1307619854  127.0.0.1:3501
hashcode: 1307619855  127.0.0.1:3501
hashcode: 1307619856  127.0.0.1:3501
hashcode: 1307619857  127.0.0.1:3501
hashcode: 1307619858  127.0.0.1:3501
hashcode: 1363372970  127.0.0.1:779
hashcode: 1363372971  127.0.0.1:779
hashcode: 1363372972  127.0.0.1:779
hashcode: 1363372973  127.0.0.1:779
hashcode: 1363372974  127.0.0.1:779
hashcode: 1397780469  127.0.0.1:5928
hashcode: 1397780470  127.0.0.1:5928
hashcode: 1397780471  127.0.0.1:5928
hashcode: 1397780472  127.0.0.1:5928
hashcode: 1397780473  127.0.0.1:5928
hashcode: 1700521830  127.0.0.1:4065
hashcode: 1700521831  127.0.0.1:4065
hashcode: 1700521832  127.0.0.1:4065
hashcode: 1700521833  127.0.0.1:4065
hashcode: 1700521834  127.0.0.1:4065
hashcode: 1774961903  127.0.0.1:5931
hashcode: 1774961904  127.0.0.1:5931
hashcode: 1774961905  127.0.0.1:5931
hashcode: 1774961906  127.0.0.1:5931
hashcode: 1774961907  127.0.0.1:5931
hashcode: 1814135809  127.0.0.1:5050
hashcode: 1814135810  127.0.0.1:5050
hashcode: 1814135811  127.0.0.1:5050
hashcode: 1814135812  127.0.0.1:5050
hashcode: 1814135813  127.0.0.1:5050
hashcode: 1881959435  127.0.0.1:1991
hashcode: 1881959436  127.0.0.1:1991
hashcode: 1881959437  127.0.0.1:1991
hashcode: 1881959438  127.0.0.1:1991
hashcode: 1881959439  127.0.0.1:1991
hashcode: 1889283041  127.0.0.1:4071
hashcode: 1889283042  127.0.0.1:4071
hashcode: 1889283043  127.0.0.1:4071
hashcode: 1889283044  127.0.0.1:4071
hashcode: 1889283045  127.0.0.1:4071
hashcode: 2118931362  127.0.0.1:7152
hashcode: 2118931363  127.0.0.1:7152
hashcode: 2118931364  127.0.0.1:7152
hashcode: 2118931365  127.0.0.1:7152
hashcode: 2118931366  127.0.0.1:7152
------------------请求的hashcode:35943393
选择结果:127.0.0.1:1280
```
 

可以看到ＪＤＫ默认的hashcode方法的问题，各个虚拟节点都是比较集中，会出现很严重的负载不均衡问题。

２.使用　FNV1_32_HASH算法
```
hashcode: 87760808 127.0.0.1:1926
hashcode: 127858684 127.0.0.1:2285
hashcode: 137207685 127.0.0.1:4429
hashcode: 189558739 127.0.0.1:4429
hashcode: 345597173 127.0.0.1:1926
hashcode: 411873143 127.0.0.1:5844
hashcode: 427733007 127.0.0.1:4429
hashcode: 429935214 127.0.0.1:5844
hashcode: 471059330 127.0.0.1:6013
hashcode: 508134701 127.0.0.1:6141
hashcode: 537200659 127.0.0.1:4429
hashcode: 572740331 127.0.0.1:9615
hashcode: 584730561 127.0.0.1:4429
hashcode: 586630909 127.0.0.1:6013
hashcode: 588198036 127.0.0.1:6297
hashcode: 601750027 127.0.0.1:6013
hashcode: 670864146 127.0.0.1:6297
hashcode: 823792818 127.0.0.1:9615
hashcode: 832758991 127.0.0.1:2285
hashcode: 847195135 127.0.0.1:1926
hashcode: 852642706 127.0.0.1:92
hashcode: 855431312 127.0.0.1:1926
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
hashcode: 1008339891 127.0.0.1:6430
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
hashcode: 1126143483 127.0.0.1:9615
hashcode: 1127241369 127.0.0.1:9615
hashcode: 1169946536 127.0.0.1:6297
hashcode: 1184995718 127.0.0.1:92
hashcode: 1204728048 127.0.0.1:5844
hashcode: 1218277576 127.0.0.1:2285
hashcode: 1253667665 127.0.0.1:92
hashcode: 1294893013 127.0.0.1:9615
hashcode: 1334096245 127.0.0.1:2285
hashcode: 1591823392 127.0.0.1:92
hashcode: 1597482385 127.0.0.1:6141
hashcode: 1647613853 127.0.0.1:6430
hashcode: 1653621871 127.0.0.1:6013
hashcode: 1749432497 127.0.0.1:6297
hashcode: 1765516223 127.0.0.1:92
hashcode: 1860173617 127.0.0.1:6430
hashcode: 1883591368 127.0.0.1:2285
hashcode: 1941022162 127.0.0.1:6430
hashcode: 1952262824 127.0.0.1:6141
hashcode: 1991871891 127.0.0.1:1926
hashcode: 2009814649 127.0.0.1:5844
hashcode: 2011432907 127.0.0.1:6297
hashcode: 2020508878 127.0.0.1:6141
hashcode: 2083262842 127.0.0.1:6013
hashcode: 2086348077 127.0.0.1:6141
hashcode: 2107422149 127.0.0.1:6430
hashcode: 2117355968 127.0.0.1:5844
------------------请求的hashcode:986344464
选择结果:127.0.0.1:6430
```
* 总结
    * 随机算法：
        * 好的随机算法可以使选择比较均衡，但还是会出现机器性能差异导致的调用耗时不一样。优点是实现简单。
    * 加权随机算法：
        * 可以根据不同的机器性能调整不同的权重比，从而降低机器性能差异带来的问题。
    * 轮询算法：
        * 可以使每个节点的选中概率一致，但也会出现随机算法的问题。
    * 加权轮询：
        * 可以根据不同的机器性能调整不同的权重比，从而降低机器性能差异带来的问题。
    * 最小时延算法：
        * 根据服务调用耗时动态调整，可以达到比较好的负载均衡。缺点是实现比较复杂。
    * 一致性hash算法：
        * 可以使消费者始终对应一个服务提供者。缺点是实现相对复杂。同时通过优化hashcode算法和增加虚拟节点解决分布不均的问题。

## 2.5. 负载均衡的实现（DNS > 数据链路层 > IP层 > Http层）
<a href="#menu" style="float:right">目录</a>


### 2.5.1. DNS域名解析负载均衡（延迟）
DNS域名解析负载均衡

　利用DNS处理域名解析请求的同时进行负载均衡是另一种常用的方案。在DNS服务器中配置多个A记录，如：www.mysite.com IN A 114.100.80.1、www.mysite.com IN A 114.100.80.2、www.mysite.com IN A 114.100.80.3.
　每次域名解析请求都会根据负载均衡算法计算一个不同的IP地址返回，这样A记录中配置的多个服务器就构成一个集群，并可以实现负载均衡。
　DNS域名解析负载均衡的优点是将负载均衡工作交给DNS，省略掉了网络管理的麻烦，缺点就是DNS可能缓存A记录，不受网站控制。事实上，大型网站总是部分使用DNS域名解析，作为第一级负载均衡手段，然后再在内部做第二级负载均衡。

### 2.5.2. 数据链路层负载均衡(LVS)
数据链路层负载均衡(LVS)

　数据链路层负载均衡是指在通信协议的数据链路层修改mac地址进行负载均衡。
　这种数据传输方式又称作三角传输模式，负载均衡数据分发过程中不修改IP地址，只修改目的的mac地址，通过配置真实物理服务器集群所有机器虚拟IP和负载均衡服务器IP地址一样，从而达到负载均衡，这种负载均衡方式又称为直接路由方式（DR）.
　在上图中，用户请求到达负载均衡服务器后，负载均衡服务器将请求数据的目的mac地址修改为真是WEB服务器的mac地址，并不修改数据包目标IP地址，因此数据可以正常到达目标WEB服务器，该服务器在处理完数据后可以经过网管服务器而不是负载均衡服务器直接到达用户浏览器。
　使用三角传输模式的链路层负载均衡是目前大型网站所使用的最广的一种负载均衡手段。在linux平台上最好的链路层负载均衡开源产品是LVS(linux virtual server)。

### 2.5.3. IP负载均衡(SNAT)
IP负载均衡
　IP负载均衡：即在网络层通过修改请求目标地址进行负载均衡。
　用户请求数据包到达负载均衡服务器后，负载均衡服务器在操作系统内核进行获取网络数据包，根据负载均衡算法计算得到一台真实的WEB服务器地址，然后将数据包的IP地址修改为真实的WEB服务器地址，不需要通过用户进程处理。真实的WEB服务器处理完毕后，相应数据包回到负载均衡服务器，负载均衡服务器再将数据包源地址修改为自身的IP地址发送给用户浏览器。
　这里的关键在于真实WEB服务器相应数据包如何返回给负载均衡服务器，一种是负载均衡服务器在修改目的IP地址的同时修改源地址，将数据包源地址改为自身的IP，即源地址转换（SNAT），另一种方案是将负载均衡服务器同时作为真实物理服务器的网关服务器，这样所有的数据都会到达负载均衡服务器。
　IP负载均衡在内核进程完成数据分发，较反向代理均衡有更好的处理性能。但由于所有请求响应的数据包都需要经过负载均衡服务器，因此负载均衡的网卡带宽成为系统的瓶颈。

### 2.5.4. HTTP重定向负载均衡(少见)
HTTP重定向负载均衡
　HTTP重定向服务器是一台普通的应用服务器，其唯一的功能就是根据用户的HTTP请求计算一台真实的服务器地址，并将真实的服务器地址写入HTTP重定向响应中（响应状态吗302）返回给浏览器，然后浏览器再自动请求真实的服务器。
　这种负载均衡方案的优点是比较简单，缺点是浏览器需要每次请求两次服务器才能拿完成一次访问，性能较差；使用HTTP302响应码重定向，可能是搜索引擎判断为SEO作弊，降低搜索排名。重定向服务器自身的处理能力有可能成为瓶颈。因此这种方案在实际使用中并不见多。

### 2.5.5. 反向代理负载均衡(nginx)
反向代理负载均衡
　传统代理服务器位于浏览器一端，代理浏览器将HTTP请求发送到互联网上。而反向代理服务器则位于网站机房一侧，代理网站web服务器接收http请求。
　反向代理的作用是保护网站安全，所有互联网的请求都必须经过代理服务器，相当于在web服务器和可能的网络攻击之间建立了一个屏障。
　除此之外，代理服务器也可以配置缓存加速web请求。当用户第一次访问静态内容的时候，静态内存就被缓存在反向代理服务器上，这样当其他用户访问该静态内容时，就可以直接从反向代理服务器返回，加速web请求响应速度，减轻web服务器负载压力。
　另外，反向代理服务器也可以实现负载均衡的功能。
反向代理服务器
　由于反向代理服务器转发请求在HTTP协议层面，因此也叫应用层负载均衡。优点是部署简单，缺点是可能成为系统的瓶颈。

# 3. 隔离
<a href="#menu" style="float:right">目录</a>

## 3.1. 概述
* 隔离是将系统或者资源分隔开，系统隔离是为了某个系统发生故障或者业务发生故障时，尽量减少影响面。保证其他服务或者业务能够继续运行。

* 线程隔离
    * 使用线程池，某一个线程出现故障时，不会影响其他线程。
* 进程隔离
* 集群隔离
* 机房隔离
    * 为了提高可用性，进行多机房部署，每个机房都会有自己的服务分组
    * 本机房的服务应该只调用本机房的服务，不进行跨机房调用
    * 当一个机房发生问题时，可以通过DNS负载均衡将请求全部切换到另一个机房，或者考虑服务能够重试其他机房的服务。
* 读写隔离
* 动静隔离
    * 将动态内容和静态资源分离
    * 一般将静态资源放在CDN上
* 爬虫隔离
    * 限流
    * 识别，路由到单独集群
* 热点隔离
    * 比如秒杀服务单独部署
* 资源隔离
    * 磁盘，CPU，网络等会存在竞争
    * 不同需求的应用部署在不同的硬件环境上
* 环境隔离
    * 测试环境，预发布环境，灰度环境，正式环境
* 压测隔离
    * 真实数据，压测数据隔离
    * AB测试，为不同的用户提供不同版本的服务
* 缓存隔离
    * 不同的应用使用不同得到缓存服务器
* 查询隔离
    * 简单，复杂，批量查询分别路由到不同的集群

# 4. 限流
<a href="#menu" style="float:right">目录</a>

## 4.1. 概述
<a href="#menu" style="float:right">目录</a>
* 限流的目的是通过对并发访问的请求进行限速或者对于一定窗口内的请求进行限速，一旦达到系统的限制值就可以拒绝服务(定向错误页，返回错误通知，排队，降级)。
* 可以通过压测来测试系统的处理峰值
* 也可以根据系统的吞吐量，响应时间，可用率来动态调整限流峰值
* 常见的限流策略
    * 限制总并发数
        * 数据库连接出，线程池
    * 限制瞬时并发数
        * Nginx的limit_conn模块
    * 限制时间窗口内的平均速率
        * Guava的RateLimiter ,Nginx的limit_req 
    * 限制远程接口的调用速率
    * 限制MQ的消费速率
    * 还可以根据网络连接数，网络流量，CPU或内存负载等来限流  


## 4.2. 限流算法


### 4.2.1. 计数器法
计数器法是限流算法里最简单也是最容易实现的一种算法。比如我们规定，对于A接口来说，我们1分钟的访问次数不能超过100个。那么我们可以这么做：在一开 始的时候，我们可以设置一个计数器counter，每当一个请求过来的时候，counter就加1，如果counter的值大于100并且该请求与第一个 请求的间隔时间还在1分钟之内，那么说明请求数过多；如果该请求与第一个请求的间隔时间大于1分钟，且counter的值还在限流范围内，那么就重置 counter

### 4.2.2. 滑动窗口
滑动窗口，又称rolling window。为了解决这个问题，我们引入了滑动窗口算法。如果学过TCP网络协议的话，那么一定对滑动窗口这个名词不会陌生。下面这张图，很好地解释了滑动窗口算法：

在上图中，整个红色的矩形框表示一个时间窗口，在我们的例子中，一个时间窗口就是一分钟。然后我们将时间窗口进行划分，比如图中，我们就将滑动窗口 划成了6格，所以每格代表的是10秒钟。每过10秒钟，我们的时间窗口就会往右滑动一格。每一个格子都有自己独立的计数器counter，比如当一个请求 在0:35秒的时候到达，那么0:30~0:39对应的counter就会加1。

那么滑动窗口怎么解决刚才的临界问题的呢？我们可以看上图，0:59到达的100个请求会落在灰色的格子中，而1:00到达的请求会落在橘黄色的格 子中。当时间到达1:00时，我们的窗口会往右移动一格，那么此时时间窗口内的总请求数量一共是200个，超过了限定的100个，所以此时能够检测出来触 发了限流。

我再来回顾一下刚才的计数器算法，我们可以发现，计数器算法其实就是滑动窗口算法。只是它没有对时间窗口做进一步地划分，所以只有1格。

由此可见，当滑动窗口的格子划分的越多，那么滑动窗口的滚动就越平滑，限流的统计就会越精确。

* 计数器 VS 滑动窗口
计数器算法是最简单的算法，可以看成是滑动窗口的低精度实现。滑动窗口由于需要存储多份的计数器（每一个格子存一份），所以滑动窗口在实现上需要更多的存储空间。也就是说，如果滑动窗口的精度越高，需要的存储空间就越大。

### 4.2.3. 漏桶算法
<a href="#menu" style="float:right">目录</a>
<a href="#menu" style="float:right">目录</a>
漏桶(Leaky Bucket)算法思路很简单，水（请求）先进入到漏桶里，漏桶以一定的速度出水（接口有响应速率），当水流入速度过大会直接溢出（访问频率超过接口响应速率），然后就拒绝请求，可以看出漏桶算法能强行限制数据的传输速率。示意图如下：
![](https://img2018.cnblogs.com/blog/1136672/201904/1136672-20190421202927762-1718486905.png)

### 4.2.4. 令牌桶算法
<a href="#menu" style="float:right">目录</a>

令牌桶算法（Token Bucket）和 Leaky Bucket 效果一样但方向相反的算法，更加容易理解。随着时间流逝，系统会按恒定1/QPS时间间隔（如果QPS=100，则间隔是10ms）往桶里加入Token（想象和漏洞漏水相反，有个水龙头在不断的加水），如果桶已经满了就不再加了。新请求来临时，会各自拿走一个Token，如果没有Token可拿了就阻塞或者拒绝服务。示意图如下：
![](https://img2018.cnblogs.com/blog/1136672/201904/1136672-20190421202936084-459487536.jpg)

漏桶算法与令牌桶算法的区别在于，漏桶算法能够强行限制数据的传输速率，令牌桶算法能够在限制数据的平均传输速率的同时还允许某种程度的突发传输。令牌桶的另外一个好处是可以方便的改变速度。 一旦需要提高速率，则按需提高放入桶中的令牌的速率。一般会定时（比如100毫秒）往桶中增加一定数量的令牌, 有些变种算法则实时的计算应该增加的令牌的数量。

## 4.3. 分布式限流
<a href="#menu" style="float:right">目录</a>

# 5. 降级
<a href="#menu" style="float:right">目录</a>
*  降级的最终目的是保证核心服务可用，降级也是要根据系统的吞吐量，响应时间，可用率等条件进行手动降级或者自动降级。
* 降级等级分类
    * 一般
        * 比如服务偶尔因为网络抖动或者服务正在上线而超时，可以自动降级
    * 警告
        * 有些服务在一段时间内成功率有波动，可以自动降级或者人工降级，并发送警告
    * 错误
        * 比如可用率降低，访问量猛增超过系统阈值
    * 严重错误
* 按照自动化分类
    * 自动开关降级
    * 人工降级
* 功能区分
    * 读服务降级
    * 写服务降级
* 系统层次区分
    * 多级降级
* 降级处理
    * 页面降级
    * 页面片段降级
    * 页面异步请求降级
    * 服务功能降级
    * 读降级
    * 服务降级
    * 爬虫降级
    * 风控降级

# 6. 超时与重试
<a href="#menu" style="float:right">目录</a>

# 7. 回滚机制
<a href="#menu" style="float:right">目录</a>

## 7.1. 事务回滚
* 事务回滚是为了防止出现数据不一致的问题。
* 对于单库回滚，数据库支持单库回滚
* 分布式事务方案
    * 强一致性
        * 两阶段提交
        * 三阶段协议
        * 这两种实现回滚难度较低，但是对性能影响较大
    * 最终一致性实现
        * 事务表
        * 消息队列
        * 补偿机制（执行/回滚）
        * TCC模式（预占/确认/消息）
        * Sagas（拆分事务/补偿机制）
## 7.2. 代码库回滚
* Git
* SVN
## 7.3. 部署版本回滚
* 部署版本化
    * 发布时全量发布，避免增量发布（只发布修改过的类），全版本可以直接回滚，不会受到约束或限制。
* 小版本增量发布
* 大版本灰度发布
    * 两个版本同时发布，一些用户访问老版本，一些用户访问新版本
    * 不同版本就是不同的服务，在一套集群内部署
    * 运行一段时间后没问题再全量发布
* 架构升级
    * 在nginx层面慢慢将流量路由到新版本，直到100%
    * 如中间出现故障，可立即切换到旧版本
## 7.4. 静态资源回滚

# 8. 压测与预案
<a href="#menu" style="float:right">目录</a>

一般通过系统压测发现系统瓶颈和问题，然后进行系统优化啊和容灾，进而提升系统的健壮性和处理能力。

* TP=Top Percentile，Top百分数，是一个统计学里的术语，与平均数、中位数都是一类。
    * TP50、TP90和TP99等指标常用于系统性能监控场景，指高于50%、90%、99%等百分线的情况。
    * TP50：指在一个时间段内（如5分钟），统计该方法每次调用所消耗的时间，并将这些时间按从小到大的顺序进行排序，取第50%的那个值作为TP50的值；配置此监控指标对应的报警阀值后，需要保证在这个时间段内该方法所有调用的消耗时间至少有50%的值要小于此阀值，否则系统将会报警
    * TP90，TP99，TP999与TP50值计算方式一致，它们分别代表着对方法的不同性能要求，TP50相对较低，TP90则比较高，TP99，TP999则对方法性能要求很高
    
* 在系统的高可靠性（也称为可用性，英文描述为HA，High Available）里有个衡量其可靠性的标准——X个9，这个X是代表数字3~5。X个9表示在系统1年时间的使用过程中，系统可以正常使用时间与总时间（1年）之比，我们通过下面的计算来感受下X个9在不同级别的可靠性差异。
    * 3个9：(1-99.9%)*365*24=8.76小时，表示该系统在连续运行1年时间里最多可能的业务中断时间是8.76小时。
    * 4个9：(1-99.99%)*365*24=0.876小时=52.6分钟，表示该系统在连续运行1年时间里最多可能的业务中断时间是52.6分钟。
    * 5个9：(1-99.999%)*365*24*60=5.26分钟，表示该系统在连续运行1年时间里最多可能的业务中断时间是5.26分钟
## 8.1. 系统压测
* 压测方案
    * 压测接口
    * 并发量
    * 压测策略(突发,逐步加压,并发量)
* 压测指标
    * 机器负载
    * QPS/TPS
    * 响应时间(平均，最小，最大)
* 压测报告
    * 相关参数以及测试结果
### 8.1.1. 线下压测
* 线下通过Jmeter或者Apache ab压测系统的某个接口，然后进行调优。以达到组件性能最优状态
* 线下压测环境和线上环境(服务器，网络，数据量)和线上完全不一样，因此测试结果只能作为参考

### 8.1.2. 线上压测
* 读写区分
    * 读压测
    * 写压测
    * 混合压测
* 数据仿真度
    * 仿真压测
    * 引流压测
* 是否给用户提供服务
    * 隔离集群压测
    * 线上集群压测
    * 单机压测
* 压测可靠性保证
    * 数据离散化，比如分库分表情况下，避免压测的数据都是路由到同一个数据库
    * 全链路压测，对所有的服务进行压测

## 8.2. 系统优化和容灾
* 很据压测报告进行相应的优化和升级，比如硬件升级，集群扩容，参数优化，代码优化




# 9. 缓存
<a href="#menu" style="float:right">目录</a>
* 缓存命中率
    * 缓存命中的次数/缓存查询次数
    * 命中率越高越好
    * 通过监控该参数确认是否工作良好

## 9.1. 应用级缓存
<a href="#menu" style="float:right">目录</a>

### 9.1.1. 缓存回收策略
<a href="#menu" style="float:right">目录</a>

* 基于空间
    * 占用的存储空间大小
* 基于容量
    * 缓存的数量
* 基于时间
    * 缓存的存在时间
* 基于Java对象引用
    
### 9.1.2. 回收算法
<a href="#menu" style="float:right">目录</a>

#### 9.1.2.1. FIFO
* FIFO ：（First In First Out）：先进先出算法，即先放入缓存的先被移除。
* 存在的问题
    * 当大量的新缓存插入会使早期进入的热点缓存会被移除掉。
#### 9.1.2.2. LRU 
* LRU（Least Recently Used）：最近最少使用算法，使用时间距离现在最久的那个被移除。
* 实现
    * 当有新数据时插入链表头部
    * 当缓存命中，则将数据移到链表头部
    * 当链表满的时候，移除链表尾部的数据
* 存在的问题
    * 如果最近一段时间没有访问热点缓存，访问的是冷数据，热点缓存会被移除掉

#### 9.1.2.3. LFU
* LFU（Least Frequently Used）：最不常用算法，一定时间段内使用【次数（频率）】最少的那个被移除。
* 给每一个缓存添加访问计数器，缓存不足时移除计数器最小的缓存
* 存在的问题
    * 如果频率时间度量是1小时，则平均一天每个小时内的访问频率1000的热点数据可能会被2个小时的一段时间内的访问频率是1001的数据剔除掉；
    *  最近新加入的数据总会易于被剔除掉，由于其起始的频率值低。本质上其“重要性”指标访问频率是指在多长的时间维度进行衡量？其难以标定，所以在业界很少单一直接使用。也由于两种算法的各自特点及缺点，所以通常在生产线上会根据业务场景联合LRU与LFU一起使用，称之为LRFU。
#### 9.1.2.4. LRFU
* 利用两个队列维护访问的数据元素，按被访问的频率的维度把元素分别搁在热端与冷端队列；而在同一个队列内，最后访问时间越久的元素会越被排在队列尾。
 
### 9.1.3. Java 缓存类型
<a href="#menu" style="float:right">目录</a>

#### 9.1.3.1. 堆缓存
* 使用堆内存来存储对象
* 好处是不需要序列化和反序列化，速度快。
* 当缓存比较大时，GC回收时间比较长
* 一般通过软引用/弱引用来存储对象,即当堆内存不足时，可以强制回收这部分内存。
* 一般用于缓存少量的热点数据，并且不是频繁修改的，因为集群环境下会出现数据不一致问题，需要做好过期时间设置
* 常用实现方案有: Guava ,Ehcache ,MapDB

#### 9.1.3.2. 对外缓存
* 使用堆外内存进行缓存,减少GC暂停时间
* 可以使用更大的缓存空间，受机器内存限制
* 实现方案:Ehcache ,MapDB

#### 9.1.3.3. 磁盘缓存
* 存储磁盘，重启后仍可以加载缓存
* 实现方案:Ehcache ,MapDB

#### 9.1.3.4. 分布式缓存
* 实现多应用共享缓存
* 实现方案:Redis

#### 9.1.3.5. 多级缓存
多级缓存就是根据不同的访问速率来设置多级缓存。优先访问速率高的缓存，提升系统性能。
比如先访问本地缓存，本地缓存不存在，再访问分布式缓存。可以尽量减少一次网络操作。

### 9.1.4. 应用级缓存示例
<a href="#menu" style="float:right">目录</a>

* 设计策略
    * 统一API封装
    * 可选的缓存方案
    * 失败统计以提供系统监控和分析
    * 命中率低通知报警
    * 缓存一致性考虑


### 9.1.5. 缓存使用模式实践
<a href="#menu" style="float:right">目录</a>

* SOR
    * 记录系统，实际存储原始数据的系统，比如数据库
* Cache
    * 缓存，访问速度比SOR快
* 回源
    * 缓存没有命中，回源数据库拿数据

#### 9.1.5.1. Cache-Aside
* 业务代码维护缓存，也就是业务代码和缓存操作混在一起
* 并发更新问题，多个实例同时更新
    * 如果是用户维度的问题，比如用户的订单数据、用户数据，并发更新的情况很少，加上过去时间就可以
    * 对于商品数据，可以考虑canal订阅binlog.来进行增量更新，不会出现不一致情况，但会存在延迟
    * 
#### 9.1.5.2. Cache-As-SOR
* Cache 看作SOR，所有操作都是对Cache进行，然后Cache再委托给SOR进行真实的读写，即代码中只看到Cache的操作
* 有三种实现: Read-Through, Write-Through,Write-Behind

#### 9.1.5.3. Read-Through
* 先查询缓存，缓存不命中再回源SOR，而不是业务代码进行回源。比如Guava的失败回调
* 优点:业务代码更加简洁
* 缺点：不适合复杂的查询，因为每次回源的查询条件 是不一样的，需要根据每个查询单独编写代码，可以使用回调函数解决

#### 9.1.5.4. Write-Through
* 穿透写模式/直写模式
* 业务代码首先调用Cache写数据，然后由Cache负责写缓存和写Sor,而不是由业务代码操作

#### 9.1.5.5. Write-Behind
* 回写模式,异步操作，异步之后可以实现批量写，合并写，延时写和限流

#### 9.1.5.6. Copy-Pattern
* 两种复制模式，Copy on read,copy on write
* Guava Cache 和Ehcache中堆缓存都是基于引用，有可能发生有人拿到缓存后修改，导致数据出现修改问题。
* Ehcache3.x提供解决方案

### 9.1.6. 缓存一致性处理
<a href="#menu" style="float:right">目录</a>

先做一个说明，从理论上来说，给缓存设置过期时间，是保证最终一致性的解决方案。这种方案下，我们可以对存入缓存的数据设置过期时间，所有的写操作以数据库为准，对缓存操作只是尽最大努力即可。也就是说如果数据库写成功，缓存更新失败，那么只要到达过期时间，则后面的读请求自然会从数据库中读取新值然后回填缓存。因此，接下来讨论的思路不依赖于给缓存设置过期时间这个方案。

在这里，我们讨论三种更新策略：
* 先更新数据库，再更新缓存
* 先删除缓存，再更新数据库
* 先更新数据库，再删除缓存

* 先更新数据库，再更新缓存
这套方案，大家是普遍反对的。为什么呢？有如下两点原因。
原因一（线程安全角度）
同时有请求A和请求B进行更新操作，那么会出现
（1）线程A更新了数据库
（2）线程B更新了数据库
（3）线程B更新了缓存
（4）线程A更新了缓存
这就出现请求A更新缓存应该比请求B更新缓存早才对，但是因为网络等原因，B却比A更早更新了缓存。这就导致了脏数据，因此不考虑。
原因二（业务场景角度）
有如下两点：
（1）如果你是一个写数据库场景比较多，而读数据场景比较少的业务需求，采用这种方案就会导致，数据压根还没读到，缓存就被频繁的更新，浪费性能。
（2）如果你写入数据库的值，并不是直接写入缓存的，而是要经过一系列复杂的计算再写入缓存。那么，每次写入数据库后，都再次计算写入缓存的值，无疑是浪费性能的。显然，删除缓存更为适合。

* 先删缓存，再更新数据库
该方案会导致不一致的原因是。同时有一个请求A进行更新操作，另一个请求B进行查询操作。那么会出现如下情形:
（1）请求A进行写操作，删除缓存
（2）请求B查询发现缓存不存在
（3）请求B去数据库查询得到旧值
（4）请求B将旧值写入缓存
（5）请求A将新值写入数据库
上述情况就会导致不一致的情形出现。而且，如果不采用给缓存设置过期时间策略，该数据永远都是脏数据。
那么，如何解决呢？采用延时双删策略
伪代码如下

public void write(String key,Object data){
        redis.delKey(key);
        db.updateData(data);
        Thread.sleep(1000);
        redis.delKey(key);
    }
转化为中文描述就是
（1）先淘汰缓存
（2）再写数据库（这两步和原来一样）
（3）休眠1秒，再次淘汰缓存
这么做，可以将1秒内所造成的缓存脏数据，再次删除。
那么，这个1秒怎么确定的，具体该休眠多久呢？
针对上面的情形，读者应该自行评估自己的项目的读数据业务逻辑的耗时。然后写数据的休眠时间则在读数据业务逻辑的耗时基础上，加几百ms即可。这么做的目的，就是确保读请求结束，写请求可以删除读请求造成的缓存脏数据。
如果你用了mysql的读写分离架构怎么办？
ok，在这种情况下，造成数据不一致的原因如下，还是两个请求，一个请求A进行更新操作，另一个请求B进行查询操作。
（1）请求A进行写操作，删除缓存
（2）请求A将数据写入数据库了，
（3）请求B查询缓存发现，缓存没有值
（4）请求B去从库查询，这时，还没有完成主从同步，因此查询到的是旧值
（5）请求B将旧值写入缓存
（6）数据库完成主从同步，从库变为新值
上述情形，就是数据不一致的原因。还是使用双删延时策略。只是，睡眠时间修改为在主从同步的延时时间基础上，加几百ms。
采用这种同步淘汰策略，吞吐量降低怎么办？
ok，那就将第二次删除作为异步的。自己起一个线程，异步删除。这样，写的请求就不用沉睡一段时间后了，再返回。这么做，加大吞吐量。
第二次删除,如果删除失败怎么办？
这是个非常好的问题，因为第二次删除失败，就会出现如下情形。还是有两个请求，一个请求A进行更新操作，另一个请求B进行查询操作，为了方便，假设是单库：
（1）请求A进行写操作，删除缓存
（2）请求B查询发现缓存不存在
（3）请求B去数据库查询得到旧值
（4）请求B将旧值写入缓存
（5）请求A将新值写入数据库
（6）请求A试图去删除请求B写入对缓存值，结果失败了。
ok,这也就是说。如果第二次删除缓存失败，会再次出现缓存和数据库不一致的问题。
如何解决呢？
具体解决方案，且看博主对第(3)种更新策略的解析。

* 先更新数据库，再删缓存
首先，先说一下。老外提出了一个缓存更新套路，名为《Cache-Aside pattern》。其中就指出

失效：应用程序先从cache取数据，没有得到，则从数据库中取数据，成功后，放到缓存中。
命中：应用程序从cache中取数据，取到后返回。
更新：先把数据存到数据库中，成功后，再让缓存失效。
另外，知名社交网站facebook也在论文《Scaling Memcache at Facebook》中提出，他们用的也是先更新数据库，再删缓存的策略。
这种情况不存在并发问题么？
不是的。假设这会有两个请求，一个请求A做查询操作，一个请求B做更新操作，那么会有如下情形产生
（1）缓存刚好失效
（2）请求A查询数据库，得一个旧值
（3）请求B将新值写入数据库
（4）请求B删除缓存
（5）请求A将查到的旧值写入缓存
ok，如果发生上述情况，确实是会发生脏数据。
然而，发生这种情况的概率又有多少呢？
发生上述情况有一个先天性条件，就是步骤（3）的写数据库操作比步骤（2）的读数据库操作耗时更短，才有可能使得步骤（4）先于步骤（5）。可是，大家想想，数据库的读操作的速度远快于写操作的（不然做读写分离干嘛，做读写分离的意义就是因为读操作比较快，耗资源少），因此步骤（3）耗时比步骤（2）更短，这一情形很难出现。
假设，有人非要抬杠，有强迫症，一定要解决怎么办？
如何解决上述并发问题？
首先，给缓存设有效时间是一种方案。其次，采用策略（2）里给出的异步延时删除策略，保证读请求完成以后，再进行删除操作。
还有其他造成不一致的原因么？
有的，这也是缓存更新策略（2）和缓存更新策略（3）都存在的一个问题，如果删缓存失败了怎么办，那不是会有不一致的情况出现么。比如一个写数据请求，然后写入数据库了，删缓存失败了，这会就出现不一致的情况了。这也是缓存更新策略（2）里留下的最后一个疑问。
如何解决？
提供一个保障的重试机制即可，这里给出两套方案。
方案一：
如下图所示
![](https://images.cnblogs.com/cnblogs_com/rjzheng/1202350/o_update1.png)
流程如下所示
（1）更新数据库数据；
（2）缓存因为种种问题删除失败
（3）将需要删除的key发送至消息队列
（4）自己消费消息，获得需要删除的key
（5）继续重试删除操作，直到成功
然而，该方案有一个缺点，对业务线代码造成大量的侵入。于是有了方案二，在方案二中，启动一个订阅程序去订阅数据库的binlog，获得需要操作的数据。在应用程序中，另起一段程序，获得这个订阅程序传来的信息，进行删除缓存操作。
方案二：
![](https://images.cnblogs.com/cnblogs_com/rjzheng/1202350/o_update2.png)
流程如下图所示：
（1）更新数据库数据
（2）数据库会将操作信息写入binlog日志当中
（3）订阅程序提取出所需要的数据以及key
（4）另起一段非业务代码，获得该信息
（5）尝试删除缓存操作，发现删除失败
（6）将这些信息发送至消息队列
（7）重新从消息队列中获得该数据，重试操作。

备注说明：上述的订阅binlog程序在mysql中有现成的中间件叫canal，可以完成订阅binlog日志的功能。至于oracle中，博主目前不知道有没有现成中间件可以使用。另外，重试机制，博主是采用的是消息队列的方式。如果对一致性要求不是很高，直接在程序中另起一个线程，每隔一段时间去重试即可，这些大家可以灵活自由发挥，只是提供一个思路。


### 9.1.7. 缓存异常处理
<a href="#menu" style="float:right">目录</a>

#### 9.1.7.1. 缓存穿透
缓存击穿表示恶意用户模拟请求很多缓存中不存在的数据，由于缓存中都没有，导致这些请求短时间内直接落在了数据库上，导致数据库异常。这个我们在实际项目就遇到了，有些抢购活动、秒杀活动的接口API被大量的恶意用户刷，导致短时间内数据库宕机了，好在数据库是多主多从的，hold住了。
#### 9.1.7.2. 缓存击穿
对于一些设置了过期时间的key，如果这些key可能会在某些时间点被超高并发地访问，是一种非常“热点”的数据。这个时候，需要考虑一个问题：缓存被“击穿”的问题，这个和缓存雪崩的区别在于这里针对某一key缓存，前者则是很多key。
缓存在某个时间点过期的时候，恰好在这个时间点对这个Key有大量的并发请求过来，这些请求发现缓存过期一般都会从后端DB加载数据并回设到缓存，这个时候大并发的请求可能会瞬间把后端DB压垮。
#### 9.1.7.3. 缓存雪崩
缓存在同一时间内大量键过期（失效），接着来的一大波请求瞬间都落在了数据库中导致连接异常。

#### 9.1.7.4. 解决方案

**一、 缓存空数据**
如果数据库查询不到数据，仍将向缓存存入一个空数据。

**二、 使用互斥锁排队**

业界比价普遍的一种做法，即根据key获取value值为空时，锁上，从数据库中load数据后再释放锁。若其它线程获取锁失败，则等待一段时间后重试。这里要注意，分布式环境中要使用分布式锁，单机的话用普通的锁（synchronized、Lock）就够了。


```java
public String getWithLock( String key, Jedis jedis, String lockKey, String uniqueId, long expireTime )
{
	/* 通过key获取value */
	String value = redisService.get( key );
	if ( StringUtil.isEmpty( value ) )
	{
		/*
		 * 分布式锁，详细可以参考https://blog.csdn.net/fanrenxiang/article/details/79803037
		 * 封装的tryDistributedLock包括setnx和expire两个功能，在低版本的redis中不支持
		 */
		try {
			boolean locked = redisService.tryDistributedLock( jedis, lockKey, uniqueId, expireTime );
			if ( locked )
			{
				value = userService.getById( key );
				redisService.set( key, value );
				redisService.del( lockKey );
				return(value);
			} else {
				/* 其它线程进来了没获取到锁便等待50ms后重试 */
				Thread.sleep( 50 );
				getWithLock( key, jedis, lockKey, uniqueId, expireTime );
			}
		} catch ( Exception e ) {
			log.error( "getWithLock exception=" + e );
			return(value);
		} finally {
			redisService.releaseDistributedLock( jedis, lockKey, uniqueId );
		}
	}
	return(value);
}
```

这样做思路比较清晰，也从一定程度上减轻数据库压力，但是锁机制使得逻辑的复杂度增加，吞吐量也降低了，有点治标不治本。

**三、 布隆过滤器（推荐）**

bloomfilter就类似于一个hash set，用于快速判某个元素是否存在于集合中，其典型的应用场景就是快速判断一个key是否存在于某容器，不存在就直接返回。布隆过滤器的关键就在于hash算法和容器大小，下面先来简单的实现下看看效果，我这里用guava实现的布隆过滤器：

```
 <dependency>
    <groupId>com.google.guava</groupId>
    <artifactId>guava</artifactId>
    <version> 23.0 </version>
    </dependency>
 </dependencies >
```
```java
 public class BloomFilterTest {
	 private static final int capacity	= 1000000;
	 private static final int key		= 999998;
	 private static BloomFilter<Integer> bloomFilter = BloomFilter.create( Funnels.integerFunnel(), capacity );
	 static {
		 for ( int i = 0; i < capacity; i++ )
		 {
			 bloomFilter.put( i );
		 }
	 }
	 public static void main( String[] args )
	 {
 /*返回计算机最精确的时间，单位微妙*/
		 long start = System.nanoTime();
		 if ( bloomFilter.mightContain( key ) )
		 {
			 System.out.println( "成功过滤到" + key );
		 }
		 long end = System.nanoTime();
		 System.out.println( "布隆过滤器消耗时间:" + (end - start) );
		 int sum = 0;
		 for ( int i = capacity + 20000; i < capacity + 30000; i++ )
		 {
			 if ( bloomFilter.mightContain( i ) )
			 {
				 sum = sum + 1;
			 }
		 }
		 System.out.println( "错判率为:" + sum );
	 }
 }
```
 
 成功过滤到999998
 布隆过滤器消 耗 时间 : 215518
 错判率 为 : 318
可以看到，100w个数据中只消耗了约0.2毫秒就匹配到了key，速度足够快。然后模拟了1w个不存在于布隆过滤器中的key，匹配错误率为318/10000，也就是说，出错率大概为3%，跟踪下BloomFilter的源码发现默认的容错率就是0.03：

```java
public static < T > BloomFilter<T> create( Funnel<T> funnel, int expectedInsertions)
{
	return(create( funnel, expectedInsertions, 0.03 ) ); /* FYI, for 3%, we always get 5 hash functions */
}
```
我们可调用BloomFilter的这个方法显式的指定误判率：

```java
private static BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(), capacity,0.01);
```

我们断点跟踪下，误判率为0.02和默认的0.03时候的区别:

对比两个出错率可以发现，误判率为0.02时数组大小为8142363，0.03时为7298440，误判率降低了0.01，BloomFilter维护的数组大小也减少了843923，可见BloomFilter默认的误判率0.03是设计者权衡系统性能后得出的值。要注意的是，布隆过滤器不支持删除操作。用在这边解决缓存穿透问题就是：
```java
public String getByKey( String key )
{
	/* 通过key获取value */
	String value = redisService.get( key );
	if ( StringUtil.isEmpty( value ) )
	{
		if ( bloomFilter.mightContain( key ) )
		{
			value = userService.getById( key );
			redisService.set( key, value );
			return(value);
		} else {
			return(null);
		}
	}
	return(value);
}
```

**四、永远不过期**
不过期则不会出现失效问题，可以解决缓存击穿和雪崩问题。

**五、建立备份缓存，设置多级缓存**
缓存A和缓存B，A设置超时时间，B不设值超时时间，先从A读缓存，A没有读B，并且更新A缓存和B缓存;

```java
public String getByKey( String keyA, String keyB )
{
	String value = redisService.get( keyA );
	if ( StringUtil.isEmpty( value ) )
	{
		value = redisService.get( keyB );
		String newValue = getFromDbById();
		redisService.set( keyA, newValue, 31, TimeUnit.DAYS );
		redisService.set( keyB, newValue );
	}
	return(value);
}
```

#### 9.1.7.5. 缓存并发问题

这里的并发指的是多个redis的client同时set key引起的并发问题。比较有效的解决方案就是把redis.set操作放在队列中使其串行化，必须的一个一个执行，具体的代码就不上了，当然加锁也是可以的，至于为什么不用redis中的事务，留给各位看官自己思考探究。


## 9.2. HTTP缓存
<a href="#menu" style="float:right">目录</a>

### 9.2.1. 浏览器缓存

* Cookie
    * Cookie 是小甜饼的意思。顾名思义，cookie 确实非常小，它的大小限制为4KB左右。它的主要用途有保存登录信息，比如你登录某个网站市场可以看到“记住密码”，这通常就是通过在 Cookie 中存入一段辨别用户身份的数据来实现的。

* localStorage
    * localStorage 是 HTML5 标准中新加入的技术，它并不是什么划时代的新东西。早在 IE 6 时代，就有一个叫 userData 的东西用于本地存储，而当时考虑到浏览器兼容性，更通用的方案是使用 Flash。而如今，localStorage 被大多数浏览器所支持，如果你的网站需要支持 IE6+，那以 userData 作为你的 polyfill 的方案是种不错的选择。

* sessionStorage
    * sessionStorage 与 localStorage 的接口类似，但保存数据的生命周期与 localStorage 不同。做过后端开发的同学应该知道 Session 这个词的意思，直译过来是“会话”。而 sessionStorage 是一个前端的概念，它只是可以将一部分数据在当前会话中保存下来，刷新页面数据依旧存在。但当页面关闭后，sessionStorage 中的数据就会被清空。

|特性|	Cookie|	localStorage|	sessionStorage|
|---|---|---|---|
|数据的生命期|	一般由服务器生成，可设置失效时间。如果在浏览器端生成Cookie，默认是关闭浏览器后失效|	除非被清除，否则永久保存|	仅在当前会话下有效，关闭页面或浏览器后被清除|	仅在当前会话下有效，关闭页面或浏览器后被清除
|存放数据大小|	4K左右|  	一般为5MB|一般为5MB|
|与服务器端通信	|每次都会携带在HTTP头中，如果使用cookie保存过多数据会带来性能问题	|仅在客户端（即浏览器）中保存，不参与和服务器的通信|仅在客户端（即浏览器）中保存，不参与和服务器的通信
|易用性	|需要程序员自己封装，源生的Cookie接口不友好	|源生接口可以接受，亦可再次封装来对Object和Array有更好的支持|源生接口可以接受，亦可再次封装来对Object和Array有更好的支持

* 这三者都是无法跨域的。

**应用场景**
因为考虑到每个 HTTP 请求都会带着 Cookie 的信息，所以 Cookie 当然是能精简就精简啦，比较常用的一个应用场景就是判断用户是否登录。针对登录过的用户，服务器端会在他登录时往 Cookie 中插入一段加密过的唯一辨识单一用户的辨识码，下次只要读取这个值就可以判断当前用户是否登录啦。曾经还使用 Cookie 来保存用户在电商网站的购物车信息，如今有了 localStorage，似乎在这个方面也可以给 Cookie 放个假了~

而另一方面 localStorage 接替了 Cookie 管理购物车的工作，同时也能胜任其他一些工作。比如HTML5游戏通常会产生一些本地数据，localStorage 也是非常适用的。如果遇到一些内容特别多的表单，为了优化用户体验，我们可能要把表单页面拆分成多个子页面，然后按步骤引导用户填写。这时候 sessionStorage 的作用就发挥出来了。

**安全性的考虑**
需要注意的是，不是什么数据都适合放在 Cookie、localStorage 和 sessionStorage 中的。使用它们的时候，需要时刻注意是否有代码存在 XSS 注入的风险。因为只要打开控制台，你就随意修改它们的值，也就是说如果你的网站中有 XSS 的风险，它们就能对你的 localStorage 肆意妄为。所以千万不要用它们存储你系统中的敏感数据。

**操作**
localStorage和sessionStorage都具有相同的操作方法，例如setItem、getItem和removeItem，clear
localStorage和sessionStorage没有过期时间和超时回收策略，因此可以保存数据的时候顺便保存当前时间和超时，读取时再检测是否超时。


### 9.2.2. CDN缓存
* **基本概念**
    * CDN的全称是Content Delivery Network，即内容分发网络。CDN是构建在现有网络基础之上的智能虚拟网络，依靠部署在各地的边缘服务器，通过中心平台的负载均衡、内容分发、调度等功能模块，使用户就近获取所需内容，降低网络拥塞，提高用户访问响应速度和命中率。CDN的关键技术主要有内容存储和分发技术。
* **组成**
    * CDN网络中包含的功能实体包括内容缓存设备、内容交换机、内容路由器、CDN内容管理系统等组成。 
    * 内容缓存为CDN网络节点，位于用户接入点，是面向最终用户的内容提供设备，可缓存静态Web内容和流媒体内容，实现内容的边缘传播和存储，以便用户的就近访问。 
    * 内容交换机处于用户接入集中点，可以均衡单点多个内容缓存设备的负载，并对内容进行缓存负载平衡及访问控制 
    * 内容路由器负责将用户的请求调度到适当的设备上。内容路由通常通过负载均衡系统来实现，动态均衡各个内容缓存站点的载荷分配，为用户的请求选择最佳的访问站点，同时提高网站的可用性。内容路由器可根据多种因素制定路由，包括站点与用户的临近度、内容的可用性、网络负载、设备状况等。负载均衡系统是整个CDN的核心。负载均衡的准确性和效率直接决定了整个CDN的效率和性能。
    * 内容管理系统负责整个CDN的管理，是可选部件，作用是进行内容管理，如内容的注入和发布、内容的分发、内容的审核、内容的服务等。 
* **功能**
    * 节省骨干网带宽，减少带宽需求量； 
    * 提供服务器端加速，解决由于用户访问量大造成的服务器过载问题；
    * 服务商能使用Web Cache技术在本地缓存用户访问过的Web页面和对象，实现相同对象的访问无须占用主干的出口带宽，并提高用户访问因特网页面的相应时间的需求；
    * 能克服网站分布不均的问题，并且能降低网站自身建设和维护成本； 
    * 降低“通信风暴”的影响，提高网络访问的稳定性。 
* **基本原理**
    * CDN的基本原理是广泛采用各种缓存服务器，将这些缓存服务器分布到用户访问相对集中的地区或网络中，在用户访问网站时，利用全局负载技术将用户的访问指向距离最近的工作正常的缓存服务器上，由缓存服务器直接响应用户请求。 
    * CDN的基本思路是尽可能避开互联网上有可能影响数据传输速度和稳定性的瓶颈和环节，使内容传输的更快、更稳定。通过在网络各处放置节点服务器所构成的在现有的互联网基础之上的一层智能虚拟网络，CDN系统能够实时地根据网络流量和各节点的连接、负载状况以及到用户的距离和响应时间等综合信息将用户的请求重新导向离用户最近的服务节点上。其目的是使用户可就近取得所需内容，解决 Internet网络拥挤的状况，提高用户访问网站的响应速度。 
* **服务模式**
    * 内容分发网络（CDN）是一种新型网络构建方式，它是为能在传统的IP网发布宽带丰富媒体而特别优化的网络覆盖层；而从广义的角度，CDN代表了一种基于质量与秩序的网络服务模式。 
    * 简单地说，内容分发网络（CDN）是一个经策略性部署的整体系统，包括分布式存储、负载均衡、网络请求的重定向和内容管理4个要件，而内容管理和全局的网络流量管理（Traffic Management）是CDN的核心所在。通过用户就近性和服务器负载的判断，CDN确保内容以一种极为高效的方式为用户的请求提供服务。  
    * 总的来说，内容服务基于缓存服务器，也称作代理缓存（Surrogate），它位于网络的边缘，距用户仅有"一跳"（Single Hop）之遥。同时，代理缓存是内容提供商源服务器（通常位于CDN服务提供商的数据中心）的一个透明镜像。这样的架构使得CDN服务提供商能够代表他们客户，即内容供应商，向最终用户提供尽可能好的体验，而这些用户是不能容忍请求响应时间有任何延迟的。  
* **主要特点**
    * 本地Cache加速：提高了企业站点（尤其含有大量图片和静态页面站点）的访问速度，并大大提高以上性质站点的稳定性。  
    * 镜像服务：消除了不同运营商之间互联的瓶颈造成的影响，实现了跨运营商的网络加速，保证不同网络中的用户都能得到良好的访问质量。 
    * 远程加速：远程访问用户根据DNS负载均衡技术智能自动选择Cache服务器，选择最快的Cache服务器，加快远程访问的速度。 
    * 带宽优化：自动生成服务器的远程Mirror（镜像）cache服务器，远程用户访问时从cache服务器上读取数据，减少远程访问的带宽、分担网络流量、减轻原站点WEB服务器负载等功能。
    * 集群抗攻击：广泛分布的CDN节点加上节点之间的智能冗余机制，可以有效地预防黑客入侵以及降低各种D.D.o.S攻击对网站的影响，同时保证较好的服务质量 。 
* **关键技术**
    * 内容发布
        * 它借助于建立索引、缓存、流分裂、组播（Multicast）等技术，将内容发布或投递到距离用户最近的远程服务点（POP）处。
        * 内容分发包含从内容源到CDN边缘的Cache的过程。从实现上，有两种主流的内容分发技术：PUSH和PULL。 
        * PUSH是一种主动分发的技术。通常，PUSH由内容管理系统发起，将内容从源或者中心媒体资源库分发到各边缘的 Cache节点。分发的协议可以采用 Http/ftp等。通过PUSH分发的内容一般是比较热点的内容，这些内容通过PUSH方式预分发（ Preload）到边缘Cache，可以实现有针对的内容提供。对于PUSH分发需要考虑的主要问题是分发策略，即在什么时候分发什么内容。一般来说，内容分发可以由CP（内容提供商）或者CDN内容管理员人工确定，也可以通过智能的方式决定，即所谓的智能分发，它根据用户访问的统计信息，以及预定义的内容分发的规则，确定内容分发的过程PULL是一种被动的分发技术，PULL分发通常由用户请求驱动。当用户请求的内容在本地的边缘 Cache上不存在（未命中）时， Cache启动PUL方法从内容源或者其他CDN节点实时获取内容。在PULL方式下，内容的分发是按需的。 
    * 内容路由
        * 它是整体性的网络负载均衡技术，通过内容路由器中的重定向（DNS）机制，在多个远程POP上均衡用户的请求，以使用户请求得到最近内容源的响应。 
        * CDN负载均衡系统实现CDN的内容路由功能。它的作用是将用户的请求导向整个CDN网络中的最佳节点。最佳节点的选定可以根据多种策略，例如距离最近、节点负载最轻等。负载均衡系统是整个CDN的核心，负载均衡的准确性和效率直接决定了整个CDN的效率和性能。通常负载均衡可以分为两个层次:全局负载均衡（GSLB）和本地负载均衡（SLB）。全局负载均衡主要的目的是在整个网络范围内将用户的请求定向到最近的节点（或者区域）。因此，就近性判断是全局负载均衡的主要功能。本地负载均衡一般局限于一定的区域范围内，其目标是在特定的区域范围内寻找一台最适合的节点提供服务，因此，CDN节点的健康性、负载情况、支持的媒体格式等运行状态是本地负载均衡进行决策的主要依据。 
    * 内容存储
        * 对于CDN系统而言，需要考虑两个方面的内容存储问题。一个是内容源的存储，一个是内容在 Cache节点中的存储。
        * 对于内容源的存储，由于内容的规模比较大（通常可以达到几个甚至几十个TB），而且内容的吞吐量较大，因此，通常采用海量存储架构，如NAS和SON。对于在 Cache节点中的存储，是 Cache设计的一个关键问题。需要考虑的因素包括功能和性能两个方面:功能上包括对各种内容格式的支持，对部分缓存的支持;在性能上包括支持的容量、多文件吞吐率、可靠性、稳定性。
        * 其中，多种内容格式的支持要求存储系统根据不同文件格式的读写特点进行优化，以提高文件内容读写的效率。特别是对针对流媒体文件的读写。部分缓存能力指流媒体内容可以以不完整的方式存储和读取。部分缓存的需求来自用户访问行为的随机性，因为许多用户并不会完整地收看整个流媒体节目。事实上，许多用户访问单个流媒体节目的时间不超过10分钟。因此，部分缓存能力能够大大提高存储空间的利用率，并有效提高用户请求的响应时间。但是部分缓存可能导致内容的碎片问题，需要进行良好的设计和控制。 
        * Cache存储的另一个重要因素是存储的可靠性，目前，多数存储系统都采用了独立磁盘冗余阵列（RAID）技术进行可靠存储。但是不同设备使用的RAID方式各有不同。 
    * 内容管理
        * 它通过内部和外部监控系统，获取网络部件的状况信息，测量内容发布的端到端性能（如包丢失、延时、平均带宽、启动时间、帧速率等），保证网络处于最佳的运行状态。  
        * 内容管理在广义上涵盖了从内容的发布、注入、分发、调整、传递等一系列过程。在这里，内容管理重点强调内容进人 Cache点后的内容管理，称其为本地内容管理。本地内容管理主要针对一个ODN节点（有多个 CDN Cache设备和一个SLB设备构成）进行。本地内容管理的主要目标是提高内容服务的效率，提高本地节点的存储利用率。通过本地内容管理，可以在CDN节点实现基于内容感知的调度，通过内容感知的调度，可以避免将用户重定向到没有该内容的 Cache设备上，从而提高负载均衡的效率。通过本地内容管理还可以有效实现在ODN节点内容的存储共享，提高存储空间的利用率

**浏览器访问网站流程**
* 没有CDN的时候
    * 用户向浏览器提交要访问的域名
    * 浏览器对域名进行解析，得到域名对应的IP地址
    * 浏览器向所得到的IP地址发送请求
    * 浏览器根据返回的数据进行显示
* 存在CDN的时候
    * 用户向浏览器提交要访问的域名
    * 浏览器对域名进行解析
    * 由于CDN对域名解析过程进行了调整，所以得到的是该域名对应的CNAME记录
    * 对CNAME再次进行解析，得到实际的IP地址。
        * 使用全局负载均衡DNS解析，获取到最近的访问IP地址
        * 需要根据地理位置和所在的ISP来确定返回结果
        * 让身处不同地域，连接不同接入商的用户得到最适合自己访问的CDN地址，才能做到最近访问，从而提升速度
    * 得到实际的IP地址，向服务器发出请求
    * 如果不存在，则CDN请求源站，获取内容，然后再返回结果
* 关键技术
    * 全局调度
    * 缓存技术
    * 内容分发
    * 带宽优化
* CDN意义
    * 把资源放到离用户近的地方，从而提高访问速度
    * 可以让用户上传的文件传到CDN，CDN再传到源站，从而提高上传速度
    
### 9.2.3. NGINX缓存





<span id="menu"></span>


# 1. 分布式系统
<a href="#menu" style="float:right">目录</a>

## 1.1. 基本概念
* **分布式**
组成系统的多个应用在不同服务器上部署，应用之间通过网络进行通信，即可称为分布式系统，如Tomcat和数据库分别部署在不同的服务器上，或两个相同功能的Tomcat分别部署在不同服务器上.
* 为什么需要分布式系统
    * 升级单机处理能力的性价比越来越低
    * 单机处理能力存在瓶颈 
    * 处于稳定性和可靠性的考虑
    
* **高可用**
系统中部分节点失效时，其他节点能够接替它继续提供服务，则可认为系统具有高可用性
* **集群**
一个特定领域的软件部署在多台服务器上并作为一个整体提供一类服务，这个整体称为集群。如Zookeeper中的Master和Slave分别部署在多台服务器上，共同组成一个整体提供集中配置服务。在常见的集群中，客户端往往能够连接任意一个节点获得服务，并且当集群中一个节点掉线时，其他节点往往能够自动的接替它继续提供服务，这时候说明集群具有高可用性
* **负载均衡**
请求发送到系统时，通过某些方式把请求均匀分发到多个节点上，使系统中每个节点能够均匀的处理请求负载，则可认为系统是负载均衡的
* **正向代理和反向代理**
系统内部要访问外部网络时，统一通过一个代理服务器把请求转发出去，在外部网络看来就是代理服务器发起的访问，此时代理服务器实现的是正向代理；当外部请求进入系统时，代理服务器把该请求转发到系统中的某台服务器上，对外部请求来说，与之交互的只有代理服务器，此时代理服务器实现的是反向代理。简单来说，**正向代理**是代理服务器代替系统内部来访问外部网络的过程，**反向代理**是外部请求访问系统时通过代理服务器转发到内部服务器的过程。

* **分布式系统难点**
    * 缺乏全局时钟，每个节点都有单独的时钟，依据时序来做一些业务处理就比较难。比如雪花漂移生成分布式ID就可能因为时钟漂移出现重复ID
    * 分布式事务问题 
    
## 1.2. 大型网站的特点
<a href="#menu" style="float:right">目录</a>

### 1.2.1. 特点
高并发，大流量;高可用；海量数据;用户分布广泛，网络情况复杂;安全环境恶劣；需求快速变更，发布频繁；渐进式发展.
### 1.2.2. 模式
* 分层
    * 将系统进行横向分层，比如视图层，业务层，数据层
    * 各层之间通过接口实现交流
    * 降低耦合，便于开发，一层进行修改很少影响其他的层
* 分割 
    * 对网站进行纵向分割，按业务分割，比如用户服务，订单服务，支付服务，也就是微服务化
    * 每一个服务之间通过网络进行沟通，比如消息中间件，RPC，HTTP ResFul
    * 对复杂系统简单化，降低模块间的耦合度
    * 同时微服务化之后也会衍生出一系列问题，比如分布式事务，分布式锁等问题
* 分布式
    * 应用进行服务化之后，就需要进行分布式部署
    * 分布式应用和服务
        * 改善网站性能和并发特性
        * 单个应用复杂度降低，加快开发和发布速度
        * 不同应用复用共同的服务，便于扩展。比如用户服务，基本是其他服务共享的。
        * 缺点是将会增加运维的难度，单体服务只需要监控一个服务，分布式之后将需要监控多个服务
    * 分布式静态资源
        * 将JS，CSS，Html，图片等静态资源文件发布在不同的CDN节点上，用户将会访问最近的节点，因此可以提高页面静态资源的响应速度
    * 分布式数据和存储
        * 大型网站的特点是数据量大
        * 数据库分库分表
        * 使用分布式缓存
        * 使用分布式文件系统
    * 分布式计算
        * 大数据处理领域，需要多台计算机共同完成计算
* 集群
    * 分布式是将不同的应用部署在不同的计算机上(当然也可以部署在同一个计算机上，端口不一样)
    * 集群是将同一个应用发布在不同的计算机上(当然也可以部署在同一个计算机上，端口不一样)，每个应用之间的代码一致
    * 集群部署可以提高网站的并发性，因为有更多的计算机共同处理同一个业务
    * 集群还涉及到请求路由的问题，也就是负载均衡。

* 缓存
    * 使用缓存可以减少对后端的访问，减少对数据库的访问。从而提高网站性能。
    * CDN缓存页面静态文件
    * 客户端缓存，比如浏览器的localStorage,SessionStorage,减少对页面的请求
    * 反向代理服务器。这里也可以实现页面静态数据的缓存，比如nginx具备缓存功能
    * 本地缓存，本地缓存可以缓存一些热点数据，减少对数据库和分布式缓存的请求，但本地缓存使用的是应用的内存，空间有限。实现方案有GUAVA
    * 分布式缓存，缓存实例可以发布在不同的计算机上，可以持久化到本地存储，因此空间大。
* 异步
    * 同步是指发出请求之后一直等待响应才会返回
    * 异步是指发出请求之后立即返回，再通过其他方式查看结果
    * 比如消息中间件，RPC的异步请求
    * 提高网站的响应速度
    * 提高对网络洪峰的处理
* 冗余
    * 冗余就是当整个系统中部分节点出现问题，如何保证系统的高可用性
    * 集群化，数据备份等解决
    
* 自动化
    * 自动化部署，自动化监控，自动化故障修复等
* 安全
    * 登录认证
    * 脚本攻击，跨域攻击，SQL注入攻击等的应对
## 1.3. 常用的RPC框架
<a href="#menu" style="float:right">目录</a>
RPC(Remote Procedure Call,远程过程调用)一般用来实现部署在不同的机器上的系统之间的方法调用，使得程序能够像访问本地系统资源一样，通过网络去访问远端系统资源。
这里通过网络访问，并不限制使用何种协议，RPC不等价于TCP方式。

### 1.3.1. Thrift
* FaceBook开发
* 跨平台和语言，支持多种与语言，比如C/C++，Erlang,Java,Js
* 采用二进制编码协议，使用TCP/IP传输协议

### 1.3.2. gRPC
* 谷歌开发,面向移动和**HTTP2**设计
* 支持C，Java,Go，分别是grpc,grpc-java,grpc-go
* 具备诸如双向流，流空，头部压缩，单TCP连接上的多路复用请求等待特性
* 一般用在移动设备上
* 默认为protocol buffers序列化协议，也可以用其他序列化协议，比如json

## 1.4. Dubbo

### 1.4.1. 架构
![](http://dubbo.apache.org/docs/zh-cn/user/sources/images/dubbo-architecture.jpg)

**节点角色说明**

|节点	|角色说明|
|---|---|
|Provider|	暴露服务的服务提供方
|Consumer|	调用远程服务的服务消费方
|Registry|	服务注册与发现的注册中心
|Monitor|	统计服务的调用次数和调用时间的监控中心
|Container|	服务运行容器

**调用关系说明**
* 服务容器负责启动，加载，运行服务提供者。
* 服务提供者在启动时，向注册中心注册自己提供的服务。
* 服务消费者在启动时，向注册中心订阅自己所需的服务。
* 注册中心返回服务提供者地址列表给消费者，如果有变更，注册中心将基于长连接推送变更数据给消费者。
* 服务消费者，从提供者地址列表中，基于软负载均衡算法，选一台提供者进行调用，如果调用失败，再选另一台调用。
* 服务消费者和提供者，在内存中累计调用次数和调用时间，定时每分钟发送一次统计数据到监控中心。
* Dubbo 架构具有以下几个特点，分别是连通性、健壮性、伸缩性、以及向未来架构的升级性。

**连通性**
* 注册中心负责服务地址的注册与查找，相当于目录服务，服务提供者和消费者只在启动时与注册中心交互，注册中心不转发请求，压力较小
* 监控中心负责统计各服务调用次数，调用时间等，统计先在内存汇总后每分钟一次发送到监控中心服务器，并以报表展示
* 服务提供者向注册中心注册其提供的服务，并汇报调用时间到监控中心，此时间不包含网络开销
* 服务消费者向注册中心获取服务提供者地址列表，并根据负载算法直接调用提供者，同时汇报调用时间到监控中心，此时间包含网络开销
* 注册中心，服务提供者，服务消费者三者之间均为长连接，监控中心除外
* 注册中心通过长连接感知服务提供者的存在，服务提供者宕机，注册中心将立即推送事件通知消费者
* 注册中心和监控中心全部宕机，不影响已运行的提供者和消费者，消费者在本地缓存了提供者列表
* 注册中心和监控中心都是可选的，服务消费者可以直连服务提供者

**健壮性**
* 监控中心宕掉不影响使用，只是丢失部分采样数据
* 数据库宕掉后，注册中心仍能通过缓存提供服务列表查询，但不能注册新服务
* 注册中心对等集群，任意一台宕掉后，将自动切换到另一台
* 注册中心全部宕掉后，服务提供者和服务消费者仍能通过本地缓存通讯
* 服务提供者无状态，任意一台宕掉后，不影响使用
* 服务提供者全部宕掉后，服务消费者应用将无法使用，并无限次重连等待服务提供者恢复

**伸缩性**
* 注册中心为对等集群，可动态增加机器部署实例，所有客户端将自动发现新的注册中心
* 服务提供者无状态，可动态增加机器部署实例，注册中心将推送新的服务提供者信息给消费者

### 1.4.2. 功能

**启动时检查**
* 启动时检查依赖的服务是否可用，不可用时会抛出异常，导致应用无法启动
* 通过该强制保证依赖的服务必须先启动
* 默认为检查，通过check=true|false进行配置

**集群容错**
* **Failfast Cluster**
    * 快速失败，只发起一次调用，失败立即报错。通常用于非幂等性的写操作，比如新增记录。
* **Failsafe Cluster**  
    * 失败安全，出现异常时，直接忽略。通常用于写入审计日志等操作。
* **Failback Cluster**
    * 失败自动恢复，后台记录失败请求，定时重发。通常用于消息通知操作。
* **Forking Cluster**
    * 并行调用多个服务器，只要一个成功即返回。通常用于实时性要求较高的读操作，但需要浪费更多服务资源。可通过 forks="2" 来设置最大并行数。
* **Broadcast Cluster**
    * 广播调用所有提供者，逐个调用，任意一台报错则报错 [2]。通常用于通知所有提供者更新缓存或日志等本地资源信息。

**负载均衡**
* **Random LoadBalance**
    * 默认 
    * 随机，按权重设置随机概率。
    * 在一个截面上碰撞的概率高，但调用量越大分布越均匀，而且按概率使用权重后也比较均匀，有利于动态调整提供者权重。
* **RoundRobin LoadBalance**
    * 轮询，按公约后的权重设置轮询比率。
    * 存在慢的提供者累积请求的问题，比如：第二台机器很慢，但没挂，当请求调到第二台时就卡在那，久而久之，所有请求都卡在调到第二台上。
* **LeastActive LoadBalance**
    * 最少活跃调用数，相同活跃数的随机，活跃数指调用前后计数差。
    * 使慢的提供者收到更少请求，因为越慢的提供者的调用前后计数差会越大。
* **ConsistentHash LoadBalance**
    * 一致性 Hash，相同参数的请求总是发到同一提供者。
    * 当某一台提供者挂时，原本发往该提供者的请求，基于虚拟节点，平摊到其它提供者，不会引起剧烈变动。
    * 算法参见：http://en.wikipedia.org/wiki/Consistent_hashing

**线程模型**

* 如果事件处理的逻辑能迅速完成，并且不会发起新的 IO 请求，比如只是在内存中记个标识，则直接在 IO 线程上处理更快，因为减少了线程池调度。

* 但如果事件处理逻辑较慢，或者需要发起新的 IO 请求，比如需要查询数据库，则必须派发到线程池，否则 IO 线程阻塞，将导致不能接收其它请求。

* 如果用 IO 线程处理事件，又在事件处理过程中发起新的 IO 请求，比如在连接事件中发起登录请求，会报“可能引发死锁”异常，但不会真死锁。


* Dispatcher
    * all 
        * 所有消息都派发到线程池，包括请求，响应，连接事件，断开事件，心跳等。
    * direct
        * 所有消息都不派发到线程池，全部在 IO 线程上直接执行。
    * message
        *  只有请求响应消息派发到线程池，其它连接断开事件，心跳等消息，直接在 IO 线程上执行。
    * execution 
        * 只请求消息派发到线程池，不含响应，响应和其它连接断开事件，心跳等消息，直接在 IO 线程上执行。
    * connection 
        * 在 IO 线程上，将连接断开事件放入队列，有序逐个执行，其它消息派发到线程池。
* ThreadPool
    * fixed 
        * 固定大小线程池，启动时建立线程，不关闭，一直持有。(缺省)
    * cached
        * 缓存线程池，空闲一分钟自动删除，需要时重建。
    * limited 
        * 可伸缩线程池，但池中的线程数只会增长不会收缩。只增长不收缩的目的是为了避免收缩时突然来了大流量引起的性能问题。
    * eager
        *  优先创建Worker线程池。在任务数量大于corePoolSize但是小于maximumPoolSize时，优先创建Worker来处理任务。当任务数量大于maximumPoolSize时，将任务放入阻塞队列中。阻塞队列充满时抛出RejectedExecutionException。(相比于cached:cached在任务数量超过maximumPoolSize时直接抛出异常而不是将任务放入阻塞队列)

**直连提供者**
* 在开发及测试环境下，经常需要绕过注册中心，只测试指定服务提供者，这时候可能需要点对点直连，点对点直连方式，将以服务接口为单位，忽略注册中心的提供者列表，A 接口配置点对点，不影响 B 接口从注册中心获取列表。

**只订阅**
* 为方便开发测试，经常会在线下共用一个所有服务可用的注册中心，这时，如果一个正在开发中的服务提供者注册，可能会影响消费者不能正常运行。
* 可以让服务提供者开发方，只订阅服务(开发的服务可能依赖其它服务)，而不注册正在开发的服务，通过直连测试正在开发的服务。

**只注册**
* 如果有两个镜像环境，两个注册中心，有一个服务只在其中一个注册中心有部署，另一个注册中心还没来得及部署，而两个注册中心的其它应用都需要依赖此服务。这个时候，可以让服务提供者方只注册服务到另一注册中心，而不从另一注册中心订阅服务。

**多协议**
* dubbo 
* rmi
* hessian
* http
* webservice
* thrift
* memcache
* redis
* rest

**多注册中心**
* Multicast
* Zookeeper
* Nacos
* Redis
* Simple

**服务分组**
* 当服务有多个版本时，可以通过分组进行区分

**多版本**
* 一般用于本版升级，对比新版本和旧版本，如果新版本有问题，可以很快进行切换 

**分组聚合**
按组合并返回结果，比如菜单服务，接口一样，但有多种实现，用group区分，现在消费方需从每种group中调用一次返回结果，合并结果返回，这样就可以实现聚合菜单项。


**参数验证**
参数验证功能是基于 JSR303 实现的，用户只需标识 JSR303 标准的验证 annotation，并通过声明 filter 来实现验证。
```xml
<dependency>
    <groupId>javax.validation</groupId>
    <artifactId>validation-api</artifactId>
    <version>1.0.0.GA</version>
</dependency>
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-validator</artifactId>
    <version>4.2.0.Final</version>
</dependency>
```
```java

    @NotNull // 不允许为空
    @Size(min = 1, max = 20) // 长度或大小范围
    private String name;
 
    @NotNull(groups = ValidationService.Save.class) // 保存时不允许为空，更新时允许为空 ，表示不更新该字段
    @Pattern(regexp = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$")
    private String email;
 
    @Min(18) // 最小值
    @Max(100) // 最大值
    private int age;
```


**结果缓存**
* 结果缓存，用于加速热门数据的访问速度，Dubbo 提供声明式缓存，以减少用户加缓存的工作量。
* 缓存类型
    * lru 基于最近最少使用原则删除多余缓存，保持最热的数据被缓存。
    * threadlocal 当前线程缓存，比如一个页面渲染，用到很多 portal，每个 portal 都要去查用户信息，通过线程缓存，可以减少这种多余访问。
    * jcache 与 JSR107 集成，可以桥接各种缓存实现。


**泛化引用**
* 泛化接口调用方式主要用于客户端没有 API 接口及模型类元的情况，参数及返回值中的所有 POJO 均用 Map 表示，通常用于框架集成，比如：实现一个通用的服务测试框架，可通过 GenericService 调用所有服务实现。

**泛化实现**
泛接口实现方式主要用于服务器端没有API接口及模型类元的情况，参数及返回值中的所有POJO均用Map表示，通常用于框架集成，比如：实现一个通用的远程服务Mock框架，可通过实现GenericService接口处理所有服务请求。

在 Java 代码中实现 GenericService 接口：
```java
package com.foo;
public class MyGenericService implements GenericService {
 
    public Object $invoke(String methodName, String[] parameterTypes, Object[] args) throws GenericException {
        if ("sayHello".equals(methodName)) {
            return "Welcome " + args[0];
        }
    }
}
```
通过 Spring 暴露泛化实现
在 Spring 配置申明服务的实现：
```xml
<bean id="genericService" class="com.foo.MyGenericService" />
<dubbo:service interface="com.foo.BarService" ref="genericService" />
```
通过 API 方式暴露泛化实现

```java 
// 用org.apache.dubbo.rpc.service.GenericService可以替代所有接口实现 
GenericService xxxService = new XxxGenericService(); 

// 该实例很重量，里面封装了所有与注册中心及服务提供方连接，请缓存 
ServiceConfig<GenericService> service = new ServiceConfig<GenericService>();
// 弱类型接口名 
service.setInterface("com.xxx.XxxService");  
service.setVersion("1.0.0"); 
// 指向一个通用服务实现 
service.setRef(xxxService); 
 
// 暴露及注册服务 
service.export();
```
**回声测试**
回声测试用于检测服务是否可用，回声测试按照正常请求流程执行，能够测试整个调用是否通畅，可用于监控。

所有服务自动实现 EchoService 接口，只需将任意服务引用强制转型为 EchoService，即可使用。

Spring 配置：
```xml
<dubbo:reference id="memberService" interface="com.xxx.MemberService" />
```
代码：
```java
// 远程服务引用
MemberService memberService = ctx.getBean("memberService"); 
EchoService echoService = (EchoService) memberService; // 强制转型为EchoService
// 回声测试可用性
String status = echoService.$echo("OK"); 
assert(status.equals("OK"));
```
**上下文信息**

上下文中存放的是当前调用过程中所需的环境信息。所有配置信息都将转换为 URL 的参数，参见 schema 配置参考手册 中的对应URL参数一列。

RpcContext 是一个 ThreadLocal 的临时状态记录器，当接收到 RPC 请求，或发起 RPC 请求时，RpcContext 的状态都会变化。比如：A 调 B，B 再调 C，则 B 机器上，在 B 调 C 之前，RpcContext 记录的是 A 调 B 的信息，在 B 调 C 之后，RpcContext 记录的是 B 调 C 的信息。

服务消费方
```java
// 远程调用
xxxService.xxx();
// 本端是否为消费端，这里会返回true
boolean isConsumerSide = RpcContext.getContext().isConsumerSide();
// 获取最后一次调用的提供方IP地址
String serverIP = RpcContext.getContext().getRemoteHost();
// 获取当前服务配置信息，所有配置信息都将转换为URL的参数
String application = RpcContext.getContext().getUrl().getParameter("application");
// 注意：每发起RPC调用，上下文状态会变化
yyyService.yyy();
```
服务提供方
```java
public class XxxServiceImpl implements XxxService {
 
    public void xxx() {
        // 本端是否为提供端，这里会返回true
        boolean isProviderSide = RpcContext.getContext().isProviderSide();
        // 获取调用方IP地址
        String clientIP = RpcContext.getContext().getRemoteHost();
        // 获取当前服务配置信息，所有配置信息都将转换为URL的参数
        String application = RpcContext.getContext().getUrl().getParameter("application");
        // 注意：每发起RPC调用，上下文状态会变化
        yyyService.yyy();
        // 此时本端变成消费端，这里会返回false
        boolean isProviderSide = RpcContext.getContext().isProviderSide();
    } 
}
```


**隐式参数**
可以通过 RpcContext 上的 setAttachment 和 getAttachment 在服务消费方和提供方之间进行参数的隐式传递。
在服务消费方端设置隐式参数
setAttachment 设置的 KV 对，在完成下面一次远程调用会被清空，即多次远程调用要多次设置。
```java
RpcContext.getContext().setAttachment("index", "1"); // 隐式传参，后面的远程调用都会隐式将这些参数发送到服务器端，类似cookie，用于框架集成，不建议常规业务使用
xxxService.xxx(); // 远程调用
//在服务提供方端获取隐式参数
public class XxxServiceImpl implements XxxService {
 
    public void xxx() {
        // 获取客户端隐式传入的参数，用于框架集成，不建议常规业务使用
        String index = RpcContext.getContext().getAttachment("index"); 
    }
}
```
**异步调用**
**异步执行**
**本地调用**
**参数回调**
**事件通知**
**本地存根**
**本地伪装**
**延迟暴露**
**并发控制**
**连接控制**
**延迟连接**
**粘滞连接**
**令牌验证**
**路由规则**
**配置规则**
**服务降级**
**优雅停机**
**主机绑定**
**日志适配**
**访问日志**
**服务容器**
**配置缓存**
**分布式事务**
**线程栈自动dump**
**Netty4**
**Kryo与Fst序列化**
**简化注册中心URL**

### 1.4.3. 连接协议
<a href="#menu" style="float:right">目录</a>

#### 1.4.3.1. dubbo
Dubbo 缺省协议采用单一长连接和 NIO 异步通讯，适合于小数据量大并发的服务调用，以及服务消费者机器数远大于服务提供者机器数的情况。

反之，Dubbo 缺省协议不适合传送大数据量的服务，比如传文件，传视频等，除非请求量很低。
![](http://dubbo.apache.org/docs/zh-cn/user/sources/images/dubbo-protocol.jpg)
* Transporter: mina, netty, grizzy
* Serialization: dubbo, hessian2, java, json
* Dispatcher: all, direct, message, execution, connection
* ThreadPool: fixed, cached

**特性**
缺省协议，使用基于 mina 1.1.7 和 hessian 3.2.1 的 tbremoting 交互。
* 连接个数：单连接
* 连接方式：长连接
* 传输协议：TCP
* 传输方式：NIO 异步传输
* 序列化：Hessian 二进制序列化
* 适用范围：传入传出参数数据包较小（建议小于100K），消费者比提供者个数多，单一消费者无法压满提供者，尽量不要用 dubbo 协议传输大文件或超大字符串。
* 适用场景：常规远程服务方法调用
**约束**
* 参数及返回值需实现 Serializable 接口
* 参数及返回值不能自定义实现 List, Map, Number, Date, Calendar 等接口，只能* 用 JDK 自带的实现，因为 hessian 会做特殊处理，自定义实现类中的属性值都会丢失。
* Hessian 序列化，只传成员属性值和值的类型，不传方法或静态变量，兼容情况：

|数据通讯|	情况|	结果|
|---|---|---|
|A->B	|类A多一种 属性（或者说类B少一种 属性）	|不抛异常，A多的那 个属性的值，B没有， 其他正常
|A->B	|枚举A多一种 枚举（或者说B少一种 枚举），A使用多| 出来的枚举进行传输	抛异常
|A->B	|枚举A多一种 枚举（或者说B少一种 枚举），A不使用 |多出来的枚举进行传输	不抛异常，B正常接 收数据
|A->B	|A和B的属性 名相同，但类型不相同|	抛异常
|A->B	|serialId 不相同	|正常传输
接口增加方法，对客户端无影响，如果该方法不是客户端需要的，客户端不需要重新部署。输入参数和结果集中增加属性，对客户端无影响，如果客户端并不需要新属性，不用重新部署。

输入参数和结果集属性名变化，对客户端序列化无影响，但是如果客户端不重新部署，不管输入还是输出，属性名变化的属性值是获取不到的。

总结：服务器端和客户端对领域对象并不需要完全一致，而是按照最大匹配原则。

**常见问题**
* 为什么要消费者比提供者个数多?
    * 因 dubbo 协议采用单一长连接，假设网络为千兆网卡 [3]，根据测试经验数据每条连接最多只能压满 7MByte(不同的环境可能不一样，供参考)，理论上 1 个服务提供者需要 20 个服务消费者才能压满网卡。

* 为什么不能传大包?
    *  因 dubbo 协议采用单一长连接，如果每次请求的数据包大小为 500KByte，假设网络为千兆网卡 [3:1]，每条连接最大 7MByte(不同的环境可能不一样，供参考)，单个服务提供者的 TPS(每秒处理事务数)最大为：128MByte / 500KByte = 262。单个消费者调用单个服务提供者的 TPS(每秒处理事务数)最大为：7MByte / 500KByte = 14。如果能接受，可以考虑使用，否则网络将成为瓶颈。

* 为什么采用异步单一长连接?
    * 因为服务的现状大都是服务提供者少，通常只有几台机器，而服务的消费者多，可能整个网站都在访问该服务，比如 Morgan 的提供者只有 6 台提供者，却有上百台消费者，每天有 1.5 亿次调用，如果采用常规的 hessian 服务，服务提供者很容易就被压跨，通过单一连接，保证单一消费者不会压死提供者，长连接，减少连接握手验证等，并使用异步 IO，复用线程池，防止 C10K 问题。

#### 1.4.3.2. rmi
* RMI 协议采用 JDK 标准的 java.rmi.* 实现，采用阻塞式短连接和 JDK 标准序列化方式。

* 注意：如果正在使用 RMI 提供服务给外部访问 [1]，同时应用里依赖了老的 common-collections 包 [2] 的情况下，存在反序列化安全风险 [3]。

**特性**
* 连接个数：多连接
* 连接方式：短连接
* 传输协议：TCP
* 传输方式：同步传输
* 序列化：Java 标准二进制序列化
* 适用范围：传入传出参数数据包大小混合，消费者与提供者个数差不多，可传文件。
* 适用场景：常规远程服务方法调用，与原生RMI服务互操作
**约束**
* 参数及返回值需实现 Serializable 接口
* dubbo 配置中的超时时间对 RMI 无效，需使用 java 启动参数设置：-Dsun.rmi.transport.tcp.responseTimeout=3000，参见下面的 RMI 配置

#### 1.4.3.3. hessian
Hessian [1] 协议用于集成 Hessian 的服务，Hessian 底层采用 Http 通讯，采用 Servlet 暴露服务，Dubbo 缺省内嵌 Jetty 作为服务器实现。

Dubbo 的 Hessian 协议可以和原生 Hessian 服务互操作，即：

提供者用 Dubbo 的 Hessian 协议暴露服务，消费者直接用标准 Hessian 接口调用
或者提供方用标准 Hessian 暴露服务，消费方用 Dubbo 的 Hessian 协议调用。
**特性**
* 连接个数：多连接
* 连接方式：短连接
* 传输协议：HTTP
* 传输方式：同步传输
* 序列化：Hessian二进制序列化
* 适用范围：传入传出参数数据包较大，提供者比消费者个数多，提供者压力较大，可传文件。
* 适用场景：页面传输，文件传输，或与原生hessian服务互操作
**依赖**
```xml
<dependency>
    <groupId>com.caucho</groupId>
    <artifactId>hessian</artifactId>
    <version>4.0.7</version>
</dependency>
```

**约束**
* 参数及返回值需实现 Serializable 接口
* 参数及返回值不能自定义实现 List, Map, Number, Date, Calendar 等接口，只能用 JDK 自带的实现，因为 hessian 会做特殊处理，自定义实现类中的属性值都会丢失。


#### 1.4.3.4. http
基于 HTTP 表单的远程调用协议，采用 Spring 的 HttpInvoker 实现 [1]

**特性**
* 连接个数：多连接
* 连接方式：短连接
* 传输协议：HTTP
* 传输方式：同步传输
* 序列化：表单序列化
* 适用范围：传入传出参数数据包大小混合，提供者比消费者个数多，可用浏览器查看，可用表单或URL传入参数，暂不支持传文件。
* 适用场景：需同时给应用程序和浏览器 JS 使用的服务。

**约束**
参数及返回值需符合 Bean 规范

#### 1.4.3.5. webservice
基于 WebService 的远程调用协议，基于 Apache CXF [1] 的 frontend-simple 和 transports-http 实现 [2]。

可以和原生 WebService 服务互操作，即：
* 提供者用 Dubbo 的 WebService 协议暴露服务，消费者直接用标准 WebService 接口调用，
* 或者提供方用标准 WebService 暴露服务，消费方用 Dubbo 的 WebService 协议调用。
**依赖**

```xml
<dependency>
    <groupId>org.apache.cxf</groupId>
    <artifactId>cxf-rt-frontend-simple</artifactId>
    <version>2.6.1</version>
</dependency>
<dependency>
    <groupId>org.apache.cxf</groupId>
    <artifactId>cxf-rt-transports-http</artifactId>
    <version>2.6.1</version>
</dependency>
```

**特性**
* 连接个数：多连接
* 连接方式：短连接
* 传输协议：HTTP
* 传输方式：同步传输
* 序列化：SOAP 文本序列化
* 适用场景：系统集成，跨语言调用

**约束**
* 参数及返回值需实现 Serializable 接口
* 参数尽量使用基本类型和 POJO

#### 1.4.3.6. thrift
基于 WebService 的远程调用协议，基于 Apache CXF [1] 的 frontend-simple 和 transports-http 实现 [2]。

可以和原生 WebService 服务互操作，即：

提供者用 Dubbo 的 WebService 协议暴露服务，消费者直接用标准 WebService 接口调用，
或者提供方用标准 WebService 暴露服务，消费方用 Dubbo 的 WebService 协议调用。
**依赖**
```xml
<dependency>
    <groupId>org.apache.cxf</groupId>
    <artifactId>cxf-rt-frontend-simple</artifactId>
    <version>2.6.1</version>
</dependency>
<dependency>
    <groupId>org.apache.cxf</groupId>
    <artifactId>cxf-rt-transports-http</artifactId>
    <version>2.6.1</version>
</dependency>
```

**特性**
* 连接个数：多连接
* 连接方式：短连接
* 传输协议：HTTP
* 传输方式：同步传输
* 序列化：SOAP 文本序列化
* 适用场景：系统集成，跨语言调用

**约束**
* 参数及返回值需实现 Serializable 接口
* 参数尽量使用基本类型和 POJO

#### 1.4.3.7. memcached
#### 1.4.3.8. redis
#### 1.4.3.9. rest
基于标准的Java REST API——JAX-RS 2.0（Java API for RESTful Web Services的简写）实现的REST调用支持

**快速入门**
在dubbo中开发一个REST风格的服务会比较简单，下面以一个注册用户的简单服务为例说明。

这个服务要实现的功能是提供如下URL（注：这个URL不是完全符合REST的风格，但是更简单实用）：

http://localhost:8080/users/register
而任何客户端都可以将包含用户信息的JSON字符串POST到以上URL来完成用户注册。

首先，开发服务的接口：
```java
public interface UserService {    
   void registerUser(User user);
}
```
然后，开发服务的实现：
```java
@Path("/users")
public class UserServiceImpl implements UserService {
       
    @POST
    @Path("/register")
    @Consumes({MediaType.APPLICATION_JSON})
    public void registerUser(User user) {
        // save the user...
    }
}
```
上面的实现非常简单，但是由于该 REST 服务是要发布到指定 URL 上，供任意语言的客户端甚至浏览器来访问，所以这里额外添加了几个 JAX-RS 的标准 annotation 来做相关的配置。
```java
@Path("/users")：指定访问UserService的URL相对路径是/users，即http://localhost:8080/users

@Path("/register")：指定访问registerUser()方法的URL相对路径是/register，再结合上一个@Path为UserService指定的路径，则调用UserService.register()的完整路径为http://localhost:8080/users/register

@POST：指定访问registerUser()用HTTP POST方法

@Consumes({MediaType.APPLICATION_JSON})：指定registerUser()接收JSON格式
的数据。REST框架会自动将JSON数据反序列化为User对象
```
最后，在spring配置文件中添加此服务，即完成所有服务开发工作：
```xml
<!-- 用rest协议在8080端口暴露服务 -->
<dubbo:protocol name="rest" port="8080"/>

<!-- 声明需要暴露的服务接口 -->
<dubbo:service interface="xxx.UserService" ref="userService"/>

<!-- 和本地bean一样实现服务 -->
<bean id="userService" class="xxx.UserServiceImpl" />
```

**REST服务提供端详解**
下面我们扩充“快速入门”中的UserService，进一步展示在dubbo中REST服务提供端的开发要点。

HTTP POST/GET的实现
REST服务中虽然建议使用HTTP协议中四种标准方法POST、DELETE、PUT、GET来分别实现常见的“增删改查”，但实际中，我们一般情况直接用POST来实现“增改”，GET来实现“删查”即可（DELETE和PUT甚至会被一些防火墙阻挡）。

前面已经简单演示了POST的实现，在此，我们为UserService添加一个获取注册用户资料的功能，来演示GET的实现。

这个功能就是要实现客户端通过访问如下不同URL来获取不同ID的用户资料：

http://localhost:8080/users/1001
http://localhost:8080/users/1002
http://localhost:8080/users/1003
当然，也可以通过其他形式的URL来访问不同ID的用户资料，例如：

http://localhost:8080/users/load?id=1001
JAX-RS本身可以支持所有这些形式。但是上面那种在URL路径中包含查询参数的形式（http://localhost:8080/users/1001） 更符合REST的一般习惯，所以更推荐大家来使用。下面我们就为UserService添加一个getUser()方法来实现这种形式的URL访问：
```java
@GET
@Path("/{id : \\d+}")
@Produces({MediaType.APPLICATION_JSON})
public User getUser(@PathParam("id") Long id) {
    // ...
}
```
@GET：指定用HTTP GET方法访问

@Path("/{id : \d+}")：根据上面的功能需求，访问getUser()的URL应当是“http://localhost:8080/users/ + 任意数字"，并且这个数字要被做为参数传入getUser()方法。 这里的annotation配置中，@Path中间的{id: xxx}指定URL相对路径中包含了名为id参数，而它的值也将被自动传递给下面用@PathParam("id")修饰的方法参数id。{id:后面紧跟的\d+是一个正则表达式，指定了id参数必须是数字。

@Produces({MediaType.APPLICATION_JSON})：指定getUser()输出JSON格式的数据。框架会自动将User对象序列化为JSON数据。

Annotation放在接口类还是实现类
在Dubbo中开发REST服务主要都是通过JAX-RS的annotation来完成配置的，在上面的示例中，我们都是将annotation放在服务的实现类中。但其实，我们完全也可以将annotation放到服务的接口上，这两种方式是完全等价的，例如：
```java
@Path("/users")
public interface UserService {
    
    @GET
    @Path("/{id : \\d+}")
    @Produces({MediaType.APPLICATION_JSON})
    User getUser(@PathParam("id") Long id);
}
```
在一般应用中，我们建议将annotation放到服务实现类，这样annotation和java实现代码位置更接近，更便于开发和维护。另外更重要的是，我们一般倾向于避免对接口的污染，保持接口的纯净性和广泛适用性。

但是，如后文所述，如果我们要用dubbo直接开发的消费端来访问此服务，则annotation必须放到接口上。

如果接口和实现类都同时添加了annotation，则实现类的annotation配置会生效，接口上的annotation被直接忽略。

JSON、XML等多数据格式的支持
在dubbo中开发的REST服务可以同时支持传输多种格式的数据，以给客户端提供最大的灵活性。其中我们目前对最常用的JSON和XML格式特别添加了额外的功能。

比如，我们要让上例中的getUser()方法支持分别返回JSON和XML格式的数据，只需要在annotation中同时包含两种格式即可：

@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
User getUser(@PathParam("id") Long id);
或者也可以直接用字符串（还支持通配符）表示MediaType：

@Produces({"application/json", "text/xml"})
User getUser(@PathParam("id") Long id);
如果所有方法都支持同样类型的输入输出数据格式，则我们无需在每个方法上做配置，只需要在服务类上添加annotation即可：
```java
@Path("/users")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public class UserServiceImpl implements UserService {
    // ...
}
```
在一个REST服务同时对多种数据格式支持的情况下，根据JAX-RS标准，一般是通过HTTP中的MIME header（content-type和accept）来指定当前想用的是哪种格式的数据。

但是在dubbo中，我们还自动支持目前业界普遍使用的方式，即用一个URL后缀（.json和.xml）来指定想用的数据格式。例如，在添加上述annotation后，直接访问http://localhost:8888/users/1001.json则表示用json格式，直接访问http://localhost:8888/users/1002.xml则表示用xml格式，比用HTTP Header更简单直观。Twitter、微博等的REST API都是采用这种方式。

如果你既不加HTTP header，也不加后缀，则dubbo的REST会优先启用在以上annotation定义中排位最靠前的那种数据格式。

注意：这里要支持XML格式数据，在annotation中既可以用MediaType.TEXT_XML，也可以用MediaType.APPLICATION_XML，但是TEXT_XML是更常用的，并且如果要利用上述的URL后缀方式来指定数据格式，只能配置为TEXT_XML才能生效。

中文字符支持
为了在dubbo REST中正常输出中文字符，和通常的Java web应用一样，我们需要将HTTP响应的contentType设置为UTF-8编码。

基于JAX-RS的标准用法，我们只需要做如下annotation配置即可：

@Produces({"application/json; charset=UTF-8", "text/xml; charset=UTF-8"})
User getUser(@PathParam("id") Long id);
为了方便用户，我们在dubbo REST中直接添加了一个支持类，来定义以上的常量，可以直接使用，减少出错的可能性。

@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
User getUser(@PathParam("id") Long id);
XML数据格式的额外要求
由于JAX-RS的实现一般都用标准的JAXB（Java API for XML Binding）来序列化和反序列化XML格式数据，所以我们需要为每一个要用XML传输的对象添加一个类级别的JAXB annotation，否则序列化将报错。例如为getUser()中返回的User添加如下：

@XmlRootElement
public class User implements Serializable {
    // ...
}
此外，如果service方法中的返回值是Java的 primitive类型（如int，long，float，double等），最好为它们添加一层wrapper对象，因为JAXB不能直接序列化primitive类型。

例如，我们想让前述的registerUser()方法返回服务器端为用户生成的ID号：

long registerUser(User user);
由于primitive类型不被JAXB序列化支持，所以添加一个wrapper对象：
```java
@XmlRootElement
public class RegistrationResult implements Serializable {
    
    private Long id;
    
    public RegistrationResult() {
    }
    
    public RegistrationResult(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
}
```
并修改service方法：

RegistrationResult registerUser(User user);
这样不但能够解决XML序列化的问题，而且使得返回的数据都符合XML和JSON的规范。例如，在JSON中，返回的将是如下形式：

{"id": 1001}
如果不加wrapper，JSON返回值将直接是

1001 	
而在XML中，加wrapper后返回值将是：
```xml
<registrationResult>
    <id>1002</id>
</registrationResult>
```
这种wrapper对象其实利用所谓Data Transfer Object（DTO）模式，采用DTO还能对传输数据做更多有用的定制。

定制序列化
如上所述，REST的底层实现会在service的对象和JSON/XML数据格式之间自动做序列化/反序列化。但有些场景下，如果觉得这种自动转换不满足要求，可以对其做定制。

Dubbo中的REST实现是用JAXB做XML序列化，用Jackson做JSON序列化，所以在对象上添加JAXB或Jackson的annotation即可以定制映射。

例如，定制对象属性映射到XML元素的名字：
```java
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable {
    
    @XmlElement(name="username") 
    private String name;  
}
定制对象属性映射到JSON字段的名字：

public class User implements Serializable {
    
    @JsonProperty("username")
    private String name;
}
```
更多资料请参考JAXB和Jackson的官方文档，或自行google。

配置REST Server的实现
目前在dubbo中，我们支持5种嵌入式rest server的实现，并同时支持采用外部应用服务器来做rest server的实现。rest server可以通过如下配置实现：
```xml
<dubbo:protocol name="rest" server="jetty"/>
```
以上配置选用了嵌入式的jetty来做rest server，同时，如果不配置server属性，rest协议默认也是选用jetty。jetty是非常成熟的java servlet容器，并和dubbo已经有较好的集成（目前5种嵌入式server中只有jetty和后面所述的tomcat、tjws，与dubbo监控系统等完成了无缝的集成），所以，如果你的dubbo系统是单独启动的进程，你可以直接默认采用jetty即可。
```xml
<dubbo:protocol name="rest" server="tomcat"/>
```
以上配置选用了嵌入式的tomcat来做rest server。在嵌入式tomcat上，REST的性能比jetty上要好得多（参见后面的基准测试），建议在需要高性能的场景下采用tomcat。
```xml
<dubbo:protocol name="rest" server="netty"/>
```
以上配置选用嵌入式的netty来做rest server。（TODO more contents to add）
```xml
<dubbo:protocol name="rest" server="tjws"/> (tjws is now deprecated)
<dubbo:protocol name="rest" server="sunhttp"/>
```
以上配置选用嵌入式的tjws或Sun HTTP server来做rest server。这两个server实现非常轻量级，非常方便在集成测试中快速启动使用，当然也可以在负荷不高的生产环境中使用。	注：tjws目前已经被deprecated掉了，因为它不能很好的和servlet 3.1 API工作。

如果你的dubbo系统不是单独启动的进程，而是部署到了Java应用服务器中，则建议你采用以下配置：
```xml
<dubbo:protocol name="rest" server="servlet"/>
```
通过将server设置为servlet，dubbo将采用外部应用服务器的servlet容器来做rest server。同时，还要在dubbo系统的web.xml中添加如下配置：
```xml
<web-app>
    <context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>/WEB-INF/classes/META-INF/spring/dubbo-demo-provider.xml</param-value>
    </context-param>
    
    <listener>
        <listener-class>org.apache.dubbo.remoting.http.servlet.BootstrapListener</listener-class>
    </listener>
    
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>
    
    <servlet>
        <servlet-name>dispatcher</servlet-name>
        <servlet-class>org.apache.dubbo.remoting.http.servlet.DispatcherServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
    
    <servlet-mapping>
        <servlet-name>dispatcher</servlet-name>
        <url-pattern>/*</url-pattern>
    </servlet-mapping>
</web-app>
```
即必须将dubbo的BootstrapListener和DispatherServlet添加到web.xml，以完成dubbo的REST功能与外部servlet容器的集成。

注意：如果你是用spring的ContextLoaderListener来加载spring，则必须保证BootstrapListener配置在ContextLoaderListener之前，否则dubbo初始化会出错。

其实，这种场景下你依然可以坚持用嵌入式server，但外部应用服务器的servlet容器往往比嵌入式server更加强大（特别是如果你是部署到更健壮更可伸缩的WebLogic，WebSphere等），另外有时也便于在应用服务器做统一管理、监控等等。

获取上下文（Context）信息
在远程调用中，值得获取的上下文信息可能有很多种，这里特别以获取客户端IP为例。

在dubbo的REST中，我们有两种方式获取客户端IP。

第一种方式，用JAX-RS标准的@Context annotation：
```java
public User getUser(@PathParam("id") Long id, @Context HttpServletRequest request) {
    System.out.println("Client address is " + request.getRemoteAddr());
} 
用Context修饰getUser()的一个方法参数后，就可以将当前的HttpServletRequest注入进来，然后直接调用servlet api获取IP。

注意：这种方式只能在将server设置为 tjws、tomcat、jetty 或者 servlet 的时候才能工作，因为只有这几种 server 的实现才提供了 servlet 容器。另外，标准的JAX-RS还支持用@Context修饰service类的一个实例字段来获取HttpServletRequest，但在dubbo中我们没有对此作出支持。

第二种方式，用dubbo中常用的RpcContext：

public User getUser(@PathParam("id") Long id) {
    System.out.println("Client address is " + RpcContext.getContext().getRemoteAddressString());
} 
注意：这种方式只能在设置server="jetty"或者server="tomcat"或者server="servlet"或者server="tjws"的时候才能工作。另外，目前dubbo的RpcContext是一种比较有侵入性的用法，未来我们很可能会做出重构。

如果你想保持你的项目对JAX-RS的兼容性，未来脱离dubbo也可以运行，请选择第一种方式。如果你想要更优雅的服务接口定义，请选用第二种方式。

此外，在最新的dubbo rest中，还支持通过RpcContext来获取HttpServletRequest和HttpServletResponse，以提供更大的灵活性来方便用户实现某些复杂功能，比如在dubbo标准的filter中访问HTTP Header。用法示例如下：

if (RpcContext.getContext().getRequest() != null && RpcContext.getContext().getRequest() instanceof HttpServletRequest) {
    System.out.println("Client address is " + ((HttpServletRequest) RpcContext.getContext().getRequest()).getRemoteAddr());
}

if (RpcContext.getContext().getResponse() != null && RpcContext.getContext().getResponse() instanceof HttpServletResponse) {
    System.out.println("Response object from RpcContext: " + RpcContext.getContext().getResponse());
}
```
注意：为了保持协议的中立性，RpcContext.getRequest()和RpcContext.getResponse()返回的仅仅是一个Object类，而且可能为null。所以，你必须自己做null和类型的检查。

注意：只有在设置server="jetty"或者server="tomcat"或者server="servlet"的时候，你才能通过以上方法正确的得到HttpServletRequest和HttpServletResponse，因为只有这几种server实现了servlet容器。

为了简化编程，在此你也可以用泛型的方式来直接获取特定类型的request/response：
```java
if (RpcContext.getContext().getRequest(HttpServletRequest.class) != null) {
    System.out.println("Client address is " + RpcContext.getContext().getRequest(HttpServletRequest.class).getRemoteAddr());
}

if (RpcContext.getContext().getResponse(HttpServletResponse.class) != null) {
    System.out.println("Response object from RpcContext: " + RpcContext.getContext().getResponse(HttpServletResponse.class));
}
```
如果request/response不符合指定的类型，这里也会返回null。

配置端口号和Context Path
dubbo中的rest协议默认将采用80端口，如果想修改端口，直接配置：
```xml
<dubbo:protocol name="rest" port="8888"/>
```
另外，如前所述，我们可以用@Path来配置单个rest服务的URL相对路径。但其实，我们还可以设置一个所有rest服务都适用的基础相对路径，即java web应用中常说的context path。

只需要添加如下contextpath属性即可：

<dubbo:protocol name="rest" port="8888" contextpath="services"/>
以前面代码为例：
```xml
@Path("/users")
public class UserServiceImpl implements UserService {
       
    @POST
    @Path("/register")
    @Consumes({MediaType.APPLICATION_JSON})
    public void registerUser(User user) {
        // save the user...
    }	
}
```
现在registerUser()的完整访问路径为：

http://localhost:8888/services/users/register
注意：如果你是选用外部应用服务器做rest server，即配置:
```xml
<dubbo:protocol name="rest" port="8888" contextpath="services" server="servlet"/>
```
则必须保证这里设置的port、contextpath，与外部应用服务器的端口、DispatcherServlet的上下文路径（即webapp path加上servlet url pattern）保持一致。例如，对于部署为tomcat ROOT路径的应用，这里的contextpath必须与web.xml中DispacherServlet的<url-pattern/>完全一致：
```xml
<servlet-mapping>
     <servlet-name>dispatcher</servlet-name>
     <url-pattern>/services/*</url-pattern>
</servlet-mapping>
```
配置线程数和IO线程数
可以为rest服务配置线程池大小：
```
<dubbo:protocol name="rest" threads="500"/>
```
注意：目前线程池的设置只有当server="netty"或者server="jetty"或者server="tomcat"的时候才能生效。另外，如果server="servlet"，由于这时候启用的是外部应用服务器做rest server，不受dubbo控制，所以这里的线程池设置也无效。

如果是选用netty server，还可以配置Netty的IO worker线程数：
```xml
<dubbo:protocol name="rest" iothreads="5" threads="100"/>
```
配置长连接
Dubbo中的rest服务默认都是采用http长连接来访问，如果想切换为短连接，直接配置：
```xml
<dubbo:protocol name="rest" keepalive="false"/>
```
注意：这个配置目前只对server="netty"和server="tomcat"才能生效。

配置最大的HTTP连接数
可以配置服务器提供端所能同时接收的最大HTTP连接数，防止REST server被过多连接撑爆，以作为一种最基本的自我保护机制：
```xml
<dubbo:protocol name="rest" accepts="500" server="tomcat/>
```
注意：这个配置目前只对server="tomcat"才能生效。

配置每个消费端的超时时间和HTTP连接数
如果rest服务的消费端也是dubbo系统，可以像其他dubbo RPC机制一样，配置消费端调用此rest服务的最大超时时间以及每个消费端所能启动的最大HTTP连接数。
```xml
<dubbo:service interface="xxx" ref="xxx" protocol="rest" timeout="2000" connections="10"/>
```
当然，由于这个配置针对消费端生效的，所以也可以在消费端配置：
```xml
<dubbo:reference id="xxx" interface="xxx" timeout="2000" 
```connections="10"/>
但是，通常我们建议配置在服务提供端提供此类配置。按照dubbo官方文档的说法：“Provider上尽量多配置Consumer端的属性，让Provider实现者一开始就思考Provider服务特点、服务质量的问题。”

注意：如果dubbo的REST服务是发布给非dubbo的客户端使用，则这里<dubbo:service/>上的配置完全无效，因为这种客户端不受dubbo控制。

用Annotation取代部分Spring XML配置
以上所有的讨论都是基于dubbo在spring中的xml配置。但是，dubbo/spring本身也支持用annotation来作配置，所以我们也可以按dubbo官方文档中的步骤，把相关annotation加到REST服务的实现中，取代一些xml配置，例如：
```java
@Service(protocol = "rest")
@Path("/users")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
       
    @POST
    @Path("/register")
    @Consumes({MediaType.APPLICATION_JSON})
    public void registerUser(User user) {
        // save the user
        userRepository.save(user);
    }	
}
```
annotation的配置更简单更精确，通常也更便于维护（当然现代IDE都可以在xml中支持比如类名重构，所以就这里的特定用例而言，xml的维护性也很好）。而xml对代码的侵入性更小一些，尤其有利于动态修改配置，特别是比如你要针对单个服务配置连接超时时间、每客户端最大连接数、集群策略、权重等等。另外，特别对复杂应用或者模块来说，xml提供了一个中心点来涵盖的所有组件和配置，更一目了然，一般更便于项目长时期的维护。

当然，选择哪种配置方式没有绝对的优劣，和个人的偏好也不无关系。

添加自定义的Filter、Interceptor等
Dubbo的REST也支持JAX-RS标准的Filter和Interceptor，以方便对REST的请求与响应过程做定制化的拦截处理。

其中，Filter主要用于访问和设置HTTP请求和响应的参数、URI等等。例如，设置HTTP响应的cache header：
```java
public class CacheControlFilter implements ContainerResponseFilter {

    public void filter(ContainerRequestContext req, ContainerResponseContext res) {
        if (req.getMethod().equals("GET")) {
            res.getHeaders().add("Cache-Control", "someValue");
        }
    }
}
```
Interceptor主要用于访问和修改输入与输出字节流，例如，手动添加GZIP压缩：
```java
public class GZIPWriterInterceptor implements WriterInterceptor {
 
    @Override
    public void aroundWriteTo(WriterInterceptorContext context)
                    throws IOException, WebApplicationException {
        OutputStream outputStream = context.getOutputStream();
        context.setOutputStream(new GZIPOutputStream(outputStream));
        context.proceed();
    }
}
```
在标准JAX-RS应用中，我们一般是为Filter和Interceptor添加@Provider annotation，然后JAX-RS runtime会自动发现并启用它们。而在dubbo中，我们是通过添加XML配置的方式来注册Filter和Interceptor：
```xml
<dubbo:protocol name="rest" port="8888" extension="xxx.TraceInterceptor, xxx.TraceFilter"/>
```
在此，我们可以将Filter、Interceptor和DynamicFeature这三种类型的对象都添加到extension属性上，多个之间用逗号分隔。（DynamicFeature是另一个接口，可以方便我们更动态的启用Filter和Interceptor，感兴趣请自行google。）

当然，dubbo自身也支持Filter的概念，但我们这里讨论的Filter和Interceptor更加接近协议实现的底层，相比dubbo的filter，可以做更底层的定制化。

注：这里的XML属性叫extension，而不是叫interceptor或者filter，是因为除了Interceptor和Filter，未来我们还会添加更多的扩展类型。

如果REST的消费端也是dubbo系统（参见下文的讨论），则也可以用类似方式为消费端配置Interceptor和Filter。但注意，JAX-RS中消费端的Filter和提供端的Filter是两种不同的接口。例如前面例子中服务端是ContainerResponseFilter接口，而消费端对应的是ClientResponseFilter:
```java
public class LoggingFilter implements ClientResponseFilter {
 
    public void filter(ClientRequestContext reqCtx, ClientResponseContext resCtx) throws IOException {
        System.out.println("status: " + resCtx.getStatus());
	    System.out.println("date: " + resCtx.getDate());
	    System.out.println("last-modified: " + resCtx.getLastModified());
	    System.out.println("location: " + resCtx.getLocation());
	    System.out.println("headers:");
	    for (Entry<String, List<String>> header : resCtx.getHeaders().entrySet()) {
     	    System.out.print("\t" + header.getKey() + " :");
	        for (String value : header.getValue()) {
	            System.out.print(value + ", ");
	        }
	        System.out.print("\n");
	    }
	    System.out.println("media-type: " + resCtx.getMediaType().getType());
    } 
}
```
添加自定义的Exception处理
Dubbo的REST也支持JAX-RS标准的ExceptionMapper，可以用来定制特定exception发生后应该返回的HTTP响应。
```java
public class CustomExceptionMapper implements ExceptionMapper<NotFoundException> {

    public Response toResponse(NotFoundException e) {     
        return Response.status(Response.Status.NOT_FOUND).entity("Oops! the requested resource is not found!").type("text/plain").build();
    }
}
```
和Interceptor、Filter类似，将其添加到XML配置文件中即可启用：
```xml
<dubbo:protocol name="rest" port="8888" extension="xxx.CustomExceptionMapper"/>
```
配置HTTP日志输出
Dubbo rest支持输出所有HTTP请求/响应中的header字段和body消息体。

在XML配置中添加如下自带的REST filter：
```xml
<dubbo:protocol name="rest" port="8888" extension="org.apache.dubbo.rpc.protocol.rest.support.LoggingFilter"/>
```
然后配置在logging配置中至少为org.apache.dubbo.rpc.protocol.rest.support打开INFO级别日志输出，例如，在log4j.xml中配置：
```xml
<logger name="org.apache.dubbo.rpc.protocol.rest.support">
    <level value="INFO"/>
    <appender-ref ref="CONSOLE"/>
</logger>
```
当然，你也可以直接在ROOT logger打开INFO级别日志输出：
```xml
<root>
	<level value="INFO" />
	<appender-ref ref="CONSOLE"/>
</root>
```
然后在日志中会有类似如下的内容输出：
```
The HTTP headers are: 
accept: application/json;charset=UTF-8
accept-encoding: gzip, deflate
connection: Keep-Alive
content-length: 22
content-type: application/json
host: 192.168.1.100:8888
user-agent: Apache-HttpClient/4.2.1 (java 1.5)
The contents of request body is: 
{"id":1,"name":"dang"}
```
打开HTTP日志输出后，除了正常日志输出的性能开销外，也会在比如HTTP请求解析时产生额外的开销，因为需要建立额外的内存缓冲区来为日志的输出做数据准备。

输入参数的校验
dubbo的rest支持采用Java标准的bean validation annotation（JSR 303)来做输入校验http://beanvalidation.org/

为了和其他dubbo远程调用协议保持一致，在rest中作校验的annotation必须放在服务的接口上，例如：
```java
public interface UserService {
   
    User getUser(@Min(value=1L, message="User ID must be greater than 1") Long id);
}
```
当然，在很多其他的bean validation的应用场景都是将annotation放到实现类而不是接口上。把annotation放在接口上至少有一个好处是，dubbo的客户端可以共享这个接口的信息，dubbo甚至不需要做远程调用，在本地就可以完成输入校验。

然后按照dubbo的标准方式在XML配置中打开验证：
```xml
<dubbo:service interface=xxx.UserService" ref="userService" protocol="rest" validation="true"/>
```
在dubbo的其他很多远程调用协议中，如果输入验证出错，是直接将RpcException抛向客户端，而在rest中由于客户端经常是非dubbo，甚至非java的系统，所以不便直接抛出Java异常。因此，目前我们将校验错误以XML的格式返回：
```xml
<violationReport>
    <constraintViolations>
        <path>getUserArgument0</path>
        <message>User ID must be greater than 1</message>
        <value>0</value>
    </constraintViolations>
</violationReport>
```
稍后也会支持其他数据格式的返回值。至于如何对验证错误消息作国际化处理，直接参考bean validation的相关文档即可。

如果你认为默认的校验错误返回格式不符合你的要求，可以如上面章节所述，添加自定义的ExceptionMapper来自由的定制错误返回格式。需要注意的是，这个ExceptionMapper必须用泛型声明来捕获dubbo的RpcException，才能成功覆盖dubbo rest默认的异常处理策略。为了简化操作，其实这里最简单的方式是直接继承dubbo rest的RpcExceptionMapper，并覆盖其中处理校验异常的方法即可：
```java
public class MyValidationExceptionMapper extends RpcExceptionMapper {

    protected Response handleConstraintViolationException(ConstraintViolationException cve) {
        ViolationReport report = new ViolationReport();
        for (ConstraintViolation cv : cve.getConstraintViolations()) {
            report.addConstraintViolation(new RestConstraintViolation(
                    cv.getPropertyPath().toString(),
                    cv.getMessage(),
                    cv.getInvalidValue() == null ? "null" : cv.getInvalidValue().toString()));
        }
        // 采用json输出代替xml输出
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(report).type(ContentType.APPLICATION_JSON_UTF_8).build();
    }
}
```
然后将这个ExceptionMapper添加到XML配置中即可：
```xml
<dubbo:protocol name="rest" port="8888" extension="xxx.MyValidationExceptionMapper"/>
```

## 1.5. 架构演进
<a href="#menu" style="float:right">目录</a>


[来源](https://segmentfault.com/a/1190000018626163)
* **单机架构**
![](https://segmentfault.com/img/bVbqHnQ?w=579&h=210)

以淘宝作为例子。在网站最初时，应用数量与用户数都较少，可以把Tomcat和数据库部署在同一台服务器上。浏览器往www.taobao.com发起请求时，首先经过DNS服务器（域名系统）把域名转换为实际IP地址10.102.4.1，浏览器转而访问该IP对应的Tomcat。

随着用户数的增长，Tomcat和数据库之间竞争资源，单机性能不足以支撑业务
* **第一次演进：Tomcat与数据库分开部署**
![](https://segmentfault.com/img/bVbqHnF?w=581&h=207)

Tomcat和数据库分别独占服务器资源，显著提高两者各自性能。

随着用户数的增长，并发读写数据库成为瓶颈
* **第二次演进：引入本地缓存和分布式缓存**
![](https://segmentfault.com/img/bVbqHo5?w=581&h=321)

在Tomcat同服务器上或同JVM中增加本地缓存，并在外部增加分布式缓存，缓存热门商品信息或热门商品的html页面等。通过缓存能把绝大多数请求在读写数据库前拦截掉，大大降低数据库压力。其中涉及的技术包括：使用memcached作为本地缓存，使用Redis作为分布式缓存，还会涉及缓存一致性、缓存穿透/击穿、缓存雪崩、热点数据集中失效等问题。

缓存抗住了大部分的访问请求，随着用户数的增长，并发压力主要落在单机的Tomcat上，响应逐渐变慢
* **第三次演进：引入反向代理实现负载均衡**
![](https://segmentfault.com/img/bVbqjM7?w=401&h=330)

在多台服务器上分别部署Tomcat，使用反向代理软件（Nginx）把请求均匀分发到每个Tomcat中。此处假设Tomcat最多支持100个并发，Nginx最多支持50000个并发，那么理论上Nginx把请求分发到500个Tomcat上，就能抗住50000个并发。其中涉及的技术包括：Nginx、HAProxy，两者都是工作在网络第七层的反向代理软件，主要支持http协议，还会涉及session共享、文件上传下载的问题。

反向代理使应用服务器可支持的并发量大大增加，但并发量的增长也意味着更多请求穿透到数据库，单机的数据库最终成为瓶颈
* **第四次演进：数据库读写分离**
![](https://segmentfault.com/img/bVbqjPI?w=427&h=293)

把数据库划分为读库和写库，读库可以有多个，通过同步机制把写库的数据同步到读库，对于需要查询最新写入数据场景，可通过在缓存中多写一份，通过缓存获得最新数据。其中涉及的技术包括：Mycat，它是数据库中间件，可通过它来组织数据库的分离读写和分库分表，客户端通过它来访问下层数据库，还会涉及数据同步，数据一致性的问题。

业务逐渐变多，不同业务之间的访问量差距较大，不同业务直接竞争数据库，相互影响性能
* **第五次演进：数据库按业务分库**
![](https://segmentfault.com/img/bVbqknA?w=537&h=442)

把不同业务的数据保存到不同的数据库中，使业务之间的资源竞争降低，对于访问量大的业务，可以部署更多的服务器来支撑。这样同时导致跨业务的表无法直接做关联分析，需要通过其他途径来解决，但这不是本文讨论的重点，有兴趣的可以自行搜索解决方案。

随着用户数的增长，单机的写库会逐渐会达到性能瓶颈
* **第六次演进：把大表拆分为小表**
![](https://segmentfault.com/img/bVbqjUO?w=584&h=442)

比如针对评论数据，可按照商品ID进行hash，路由到对应的表中存储；针对支付记录，可按照小时创建表，每个小时表继续拆分为小表，使用用户ID或记录编号来路由数据。只要实时操作的表数据量足够小，请求能够足够均匀的分发到多台服务器上的小表，那数据库就能通过水平扩展的方式来提高性能。其中前面提到的Mycat也支持在大表拆分为小表情况下的访问控制。

这种做法显著的增加了数据库运维的难度，对DBA的要求较高。数据库设计到这种结构时，已经可以称为分布式数据库，但是这只是一个逻辑的数据库整体，数据库里不同的组成部分是由不同的组件单独来实现的，如分库分表的管理和请求分发，由Mycat实现，SQL的解析由单机的数据库实现，读写分离可能由网关和消息队列来实现，查询结果的汇总可能由数据库接口层来实现等等，这种架构其实是MPP（大规模并行处理）架构的一类实现。

目前开源和商用都已经有不少MPP数据库，开源中比较流行的有Greenplum、TiDB、Postgresql XC、HAWQ等，商用的如南大通用的GBase、睿帆科技的雪球DB、华为的LibrA等等，不同的MPP数据库的侧重点也不一样，如TiDB更侧重于分布式OLTP场景，Greenplum更侧重于分布式OLAP场景，这些MPP数据库基本都提供了类似Postgresql、Oracle、MySQL那样的SQL标准支持能力，能把一个查询解析为分布式的执行计划分发到每台机器上并行执行，最终由数据库本身汇总数据进行返回，也提供了诸如权限管理、分库分表、事务、数据副本等能力，并且大多能够支持100个节点以上的集群，大大降低了数据库运维的成本，并且使数据库也能够实现水平扩展。

数据库和Tomcat都能够水平扩展，可支撑的并发大幅提高，随着用户数的增长，最终单机的Nginx会成为瓶颈
* **第七次演进：使用LVS或F5来使多个Nginx负载均衡**
![](https://segmentfault.com/img/bVbqkrJ?w=589&h=515)

由于瓶颈在Nginx，因此无法通过两层的Nginx来实现多个Nginx的负载均衡。图中的LVS和F5是工作在网络第四层的负载均衡解决方案，其中LVS是软件，运行在操作系统内核态，可对TCP请求或更高层级的网络协议进行转发，因此支持的协议更丰富，并且性能也远高于Nginx，可假设单机的LVS可支持几十万个并发的请求转发；F5是一种负载均衡硬件，与LVS提供的能力类似，性能比LVS更高，但价格昂贵。由于LVS是单机版的软件，若LVS所在服务器宕机则会导致整个后端系统都无法访问，因此需要有备用节点。可使用keepalived软件模拟出虚拟IP，然后把虚拟IP绑定到多台LVS服务器上，浏览器访问虚拟IP时，会被路由器重定向到真实的LVS服务器，当主LVS服务器宕机时，keepalived软件会自动更新路由器中的路由表，把虚拟IP重定向到另外一台正常的LVS服务器，从而达到LVS服务器高可用的效果。

此处需要注意的是，上图中从Nginx层到Tomcat层这样画并不代表全部Nginx都转发请求到全部的Tomcat，在实际使用时，可能会是几个Nginx下面接一部分的Tomcat，这些Nginx之间通过keepalived实现高可用，其他的Nginx接另外的Tomcat，这样可接入的Tomcat数量就能成倍的增加。

由于LVS也是单机的，随着并发数增长到几十万时，LVS服务器最终会达到瓶颈，此时用户数达到千万甚至上亿级别，用户分布在不同的地区，与服务器机房距离不同，导致了访问的延迟会明显不同
* **第八次演进：通过DNS轮询实现机房间的负载均衡**
![](https://segmentfault.com/img/bVbqkuH?w=752&h=535)

在DNS服务器中可配置一个域名对应多个IP地址，每个IP地址对应到不同的机房里的虚拟IP。当用户访问www.taobao.com时，DNS服务器会使用轮询策略或其他策略，来选择某个IP供用户访问。此方式能实现机房间的负载均衡，至此，系统可做到机房级别的水平扩展，千万级到亿级的并发量都可通过增加机房来解决，系统入口处的请求并发量不再是问题。

随着数据的丰富程度和业务的发展，检索、分析等需求越来越丰富，单单依靠数据库无法解决如此丰富的需求
* **第九次演进：引入NoSQL数据库和搜索引擎等技术**
![](https://segmentfault.com/img/bVbqHtd?w=685&h=443)

当数据库中的数据多到一定规模时，数据库就不适用于复杂的查询了，往往只能满足普通查询的场景。对于统计报表场景，在数据量大时不一定能跑出结果，而且在跑复杂查询时会导致其他查询变慢，对于全文检索、可变数据结构等场景，数据库天生不适用。因此需要针对特定的场景，引入合适的解决方案。如对于海量文件存储，可通过分布式文件系统HDFS解决，对于key value类型的数据，可通过HBase和Redis等方案解决，对于全文检索场景，可通过搜索引擎如ElasticSearch解决，对于多维分析场景，可通过Kylin或Druid等方案解决。

当然，引入更多组件同时会提高系统的复杂度，不同的组件保存的数据需要同步，需要考虑一致性的问题，需要有更多的运维手段来管理这些组件等。

引入更多组件解决了丰富的需求，业务维度能够极大扩充，随之而来的是一个应用中包含了太多的业务代码，业务的升级迭代变得困难
* **第十次演进：大应用拆分为小应用**
![](https://segmentfault.com/img/bVbqHzB?w=687&h=455)

按照业务板块来划分应用代码，使单个应用的职责更清晰，相互之间可以做到独立升级迭代。这时候应用之间可能会涉及到一些公共配置，可以通过分布式配置中心Zookeeper来解决。

不同应用之间存在共用的模块，由应用单独管理会导致相同代码存在多份，导致公共功能升级时全部应用代码都要跟着升级
* **第十一次演进：复用的功能抽离成微服务**
![](https://segmentfault.com/img/bVbqHAs?w=682&h=536)

如用户管理、订单、支付、鉴权等功能在多个应用中都存在，那么可以把这些功能的代码单独抽取出来形成一个单独的服务来管理，这样的服务就是所谓的微服务，应用和服务之间通过HTTP、TCP或RPC请求等多种方式来访问公共服务，每个单独的服务都可以由单独的团队来管理。此外，可以通过Dubbo、SpringCloud等框架实现服务治理、限流、熔断、降级等功能，提高服务的稳定性和可用性。

不同服务的接口访问方式不同，应用代码需要适配多种访问方式才能使用服务，此外，应用访问服务，服务之间也可能相互访问，调用链将会变得非常复杂，逻辑变得混乱
* **第十二次演进：引入企业服务总线ESB屏蔽服务接口的访问差异**
![](https://segmentfault.com/img/bVbqHBi?w=693&h=593)

通过ESB统一进行访问协议转换，应用统一通过ESB来访问后端服务，服务与服务之间也通过ESB来相互调用，以此降低系统的耦合程度。这种单个应用拆分为多个应用，公共服务单独抽取出来来管理，并使用企业消息总线来解除服务之间耦合问题的架构，就是所谓的SOA（面向服务）架构，这种架构与微服务架构容易混淆，因为表现形式十分相似。个人理解，微服务架构更多是指把系统里的公共服务抽取出来单独运维管理的思想，而SOA架构则是指一种拆分服务并使服务接口访问变得统一的架构思想，SOA架构中包含了微服务的思想。

业务不断发展，应用和服务都会不断变多，应用和服务的部署变得复杂，同一台服务器上部署多个服务还要解决运行环境冲突的问题，此外，对于如大促这类需要动态扩缩容的场景，需要水平扩展服务的性能，就需要在新增的服务上准备运行环境，部署服务等，运维将变得十分困难
* **第十三次演进：引入容器化技术实现运行环境隔离与动态服务管理**
![](https://segmentfault.com/img/bVbqHBG?w=645&h=614)

目前最流行的容器化技术是Docker，最流行的容器管理服务是Kubernetes(K8S)，应用/服务可以打包为Docker镜像，通过K8S来动态分发和部署镜像。Docker镜像可理解为一个能运行你的应用/服务的最小的操作系统，里面放着应用/服务的运行代码，运行环境根据实际的需要设置好。把整个“操作系统”打包为一个镜像后，就可以分发到需要部署相关服务的机器上，直接启动Docker镜像就可以把服务起起来，使服务的部署和运维变得简单。

在大促的之前，可以在现有的机器集群上划分出服务器来启动Docker镜像，增强服务的性能，大促过后就可以关闭镜像，对机器上的其他服务不造成影响（在3.14节之前，服务运行在新增机器上需要修改系统配置来适配服务，这会导致机器上其他服务需要的运行环境被破坏）。

使用容器化技术后服务动态扩缩容问题得以解决，但是机器还是需要公司自身来管理，在非大促的时候，还是需要闲置着大量的机器资源来应对大促，机器自身成本和运维成本都极高，资源利用率低
* **第十四次演进：以云平台承载系统**
![](https://segmentfault.com/img/bVbqHDy?w=977&h=583)

系统可部署到公有云上，利用公有云的海量机器资源，解决动态硬件资源的问题，在大促的时间段里，在云平台中临时申请更多的资源，结合Docker和K8S来快速部署服务，在大促结束后释放资源，真正做到按需付费，资源利用率大大提高，同时大大降低了运维成本。

所谓的云平台，就是把海量机器资源，通过统一的资源管理，抽象为一个资源整体，在之上可按需动态申请硬件资源（如CPU、内存、网络等），并且之上提供通用的操作系统，提供常用的技术组件（如Hadoop技术栈，MPP数据库等）供用户使用，甚至提供开发好的应用，用户不需要关系应用内部使用了什么技术，就能够解决需求（如音视频转码服务、邮件服务、个人博客等）。在云平台中会涉及如下几个概念：

IaaS：基础设施即服务。对应于上面所说的机器资源统一为资源整体，可动态申请硬件资源的层面；
PaaS：平台即服务。对应于上面所说的提供常用的技术组件方便系统的开发和维护；
SaaS：软件即服务。对应于上面所说的提供开发好的应用或服务，按功能或性能要求付费。
至此，以上所提到的从高并发访问问题，到服务的架构和系统实施的层面都有了各自的解决方案，但同时也应该意识到，在上面的介绍中，其实是有意忽略了诸如跨机房数据同步、分布式事务实现等等的实际问题，这些问题以后有机会再拿出来单独讨论
* **架构设计总结**
* 架构的调整是否必须按照上述演变路径进行？
不是的，以上所说的架构演变顺序只是针对某个侧面进行单独的改进，在实际场景中，可能同一时间会有几个问题需要解决，或者可能先达到瓶颈的是另外的方面，这时候就应该按照实际问题实际解决。如在政府类的并发量可能不大，但业务可能很丰富的场景，高并发就不是重点解决的问题，此时优先需要的可能会是丰富需求的解决方案。
* 对于将要实施的系统，架构应该设计到什么程度？
对于单次实施并且性能指标明确的系统，架构设计到能够支持系统的性能指标要求就足够了，但要留有扩展架构的接口以便不备之需。对于不断发展的系统，如电商平台，应设计到能满足下一阶段用户量和性能指标要求的程度，并根据业务的增长不断的迭代升级架构，以支持更高的并发和更丰富的业务。
* 服务端架构和大数据架构有什么区别？
所谓的“大数据”其实是海量数据采集清洗转换、数据存储、数据分析、数据服务等场景解决方案的一个统称，在每一个场景都包含了多种可选的技术，如数据采集有Flume、Sqoop、Kettle等，数据存储有分布式文件系统HDFS、FastDFS，NoSQL数据库HBase、MongoDB等，数据分析有Spark技术栈、机器学习算法等。总的来说大数据架构就是根据业务的需求，整合各种大数据组件组合而成的架构，一般会提供分布式存储、分布式计算、多维分析、数据仓库、机器学习算法等能力。而服务端架构更多指的是应用组织层面的架构，底层能力往往是由大数据架构来提供。
* 有没有一些架构设计的原则？
    * N+1设计。系统中的每个组件都应做到没有单点故障；
    * 回滚设计。确保系统可以向前兼容，在系统升级时应能有办法回滚版本；
    * 禁用设计。应该提供控制具体功能是否可用的配置，在系统出现故障时能够快速下线功能；
    * 监控设计。在设计阶段就要考虑监控的手段；
    * 多活数据中心设计。若系统需要极高的高可用，应考虑在多地实施数据中心进行多活，至少在一个机房断电的情况下系统依然可用；
    * 采用成熟的技术。刚开发的或开源的技术往往存在很多隐藏的bug，出了问题没有商业支持可能会是一个灾难；
    * 资源隔离设计。应避免单一业务占用全部资源；
    * 架构应能水平扩展。系统只有做到能水平扩展，才能有效避免瓶颈问题；
    * 非核心则购买。非核心功能若需要占用大量的研发资源才能解决，则考虑购买成熟的产品；
    * 使用商用硬件。商用硬件能有效降低硬件故障的机率；
    * 快速迭代。系统应该快速开发小功能模块，尽快上线进行验证，早日发现问题大大降低系统交付的风险；
    * 无状态设计。服务接口应该做成无状态的，当前接口的访问不依赖于接口上次访问的状态。
## 1.6. Java 中间件
* **定义**
    * 中间件不是上层的业务，也不是底层的支撑系统，而是处于中间位置的作用，是应用和应用之间的桥梁。
    * 常见的中间件:
        * 数据库中间件,解决应用访问数据库的共性问题，比如分库分表下的数据访问。
        * 消息中间件，解决应用之间消息传递，解耦和异步的问题。

## 1.7. 序列化机制
<a href="#menu" style="float:right">目录</a>
### 1.7.1. 基本概念
**序列化**:将对象序列化为字节数组，用于网络传输或者磁盘存储。
**反序列化**:将从网络或者磁盘获取的字节数组转化为对象。

* 序列化选择关键点
    * 序列化和反序列化过程的性能
    * 序列化之后的字节长度，这将会影响网络传输。
    * 功能丰富度，比如支持List,Map，复杂对象等
    * 跨语言需求，有的系统由几个不同的应用组成，每个应用可能使用不同的语言开发，因此可能存在跨语言需求。
### 1.7.2. 常用序列化方式性能比较

![](https://img2018.cnblogs.com/blog/1404294/201904/1404294-20190418171605508-1194073956.jpg)
从图上可以看出，protostuff的性能最好，而JDK序列化方式相对来说性能是比较差的。

### 1.7.3. 常用序列化方式实现
#### 1.7.3.1. JDK方式
```java
public class JdkSerializeUtil extends AbstractSerialize {

    public <T> byte[] serialize(T obj) {

        if (obj  == null){
            throw new NullPointerException();
        }

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(obj);
            return bos.toByteArray();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new byte[0];
    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {
        ByteArrayInputStream bis = new ByteArrayInputStream(data);

        try {
            ObjectInputStream ois = new ObjectInputStream(bis);
            T obj = (T)ois.readObject();
            return obj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return  null;
    }
}
```
#### 1.7.3.2. FastJSON
```xml
 <dependency>
     <groupId>com.alibaba</groupId>
     <artifactId>fastjson</artifactId>
     <version>1.2.56</version>
 </dependency>
            
```
```java
public class FastjsonSerializeUtil  extends AbstractSerialize {

    public <T> byte[] serialize(T obj) {
        if (obj  == null){
            throw new NullPointerException();
        }

        String json = JSON.toJSONString(obj);
        byte[] data = json.getBytes();
        return data;
    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {

        T obj = JSON.parseObject(new String(data),clazz);
        return obj;
    }
}
```
#### 1.7.3.3. Hessian
```xml
<dependency>
    <groupId>com.caucho</groupId>
    <artifactId>hessian</artifactId>
    <version>4.0.60</version>
 </dependency>
```
```java
public class HessianSerializeUtil extends AbstractSerialize {



    public <T> byte[] serialize(T obj) {

        if (obj  == null){
            throw new NullPointerException();
        }
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            HessianOutput ho = new HessianOutput(bos);
            ho.writeObject(obj);

            return  bos.toByteArray();
        }
        catch(Exception ex){
            log.error("HessianSerializeUtil序列化发生异常!"+ex);
            throw new  RuntimeException();
        }

    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {

        if (data == null){
            throw  new  NullPointerException();
        }
        try{
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            HessianInput hi = new HessianInput(bis);
            return (T)hi.readObject();

        }
        catch(Exception ex){
            log.error("HessianSerializeUtil反序列化发生异常!"+ex);
            throw new  RuntimeException();
        }

    }
}
```
#### 1.7.3.4. Protostuff
```xml
<dependency>
    <groupId>io.protostuff</groupId>
    <artifactId>protostuff-core</artifactId>
    <version>1.6.0</version>
     <scope>compile</scope>
</dependency>


<!-- https://mvnrepository.com/artifact/io.protostuff/protostuff-runtime -->
 <dependency>
    <groupId>io.protostuff</groupId>
    <artifactId>protostuff-runtime</artifactId>
    <version>1.6.0</version>
</dependency>
```
```java
public class ProtostuffSerializeUtil  extends AbstractSerialize {

    /**
     * 避免每次序列化都重新申请Buffer空间
     */
    private static LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
    /**
     * 缓存Schema
     */
    private static Map<Class<?>, Schema<?>> schemaCache = new ConcurrentHashMap<Class<?>, Schema<?>>();

    public   <T> byte[] serialize(T obj) {

        if (obj  == null){
            throw new NullPointerException();
        }
        Class<T> clazz = (Class<T>) obj.getClass();
        Schema<T> schema = getSchema(clazz);
        byte[] data;
        try {
            data = ProtostuffIOUtil.toByteArray(obj, schema, buffer);
        } finally {
            buffer.clear();
        }

        return data;
    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {
        Schema<T> schema = getSchema(clazz);
        T obj = schema.newMessage();
        ProtostuffIOUtil.mergeFrom(data, obj, schema);
        return obj;
    }


    private static <T> Schema<T> getSchema(Class<T> clazz) {
        Schema<T> schema = (Schema<T>) schemaCache.get(clazz);
        if (schema == null) {
            //这个schema通过RuntimeSchema进行懒创建并缓存
            //所以可以一直调用RuntimeSchema.getSchema(),这个方法是线程安全的
            schema = RuntimeSchema.getSchema(clazz);
            if (schema != null) {
                schemaCache.put(clazz, schema);
            }
        }

        return schema;
    }


}
```
* 测试

|	|码流大小(byte)	|10次(us)	|100次(us)|	1000次(us)|	10000次(us)	|100000次(us)|	 
|---|---|---|---|---|---|---|
|FastJson	|305	|116-243|	106-185|	90-140|	26-39|	8-12|	 
|JDK	|866	|383-777	|502-1101|	123-334	|54-237|	15-76	 |
|Hessian|	520|	959-3836	|376-567|	191-329|	99-161	|30-47|	 
|Protostuff|	193|	103-145|	90-137	|75-135	|15-24|	5-8|

## 1.8. 定时任务
<a href="#menu" style="float:right">目录</a>
在项目开发过程中，我们经常需要执行具有周期性的任务。通过定时任务可以很好的帮助我们实现。
当出现应用进行集群部署，此时单体的定时任务管理就会出问题：两个集群中的应用会执行相同的任务。又衍生出处理分布式定时任务，它利用数据库等方式共享定时任务的信息，当集群中有一个应用运行了定时任务。其他应用便不会再次重复执行任务。

单体应用中常使用的定时任务方式是Spring Scheduler,分布式定时任务框架有Quartz.

## 1.9. Cron表达式
[在线Cron表达式生成:http://cron.qqe2.com/](http://cron.qqe2.com/)
![](https://github.com/lgjlife/Java-Study/blob/master/pic/distribution/cron.png?raw=true)
Cron表达式是一个字符串，字符串以5或6个空格隔开，分为6或7个域，每一个域代表一个含义，Cron有如下两种语法格式：
* Seconds Minutes Hours DayofMonth Month DayofWeek Year
* Seconds Minutes Hours DayofMonth Month DayofWeek

|字段	|允许值	|允许的特殊字符|
|---|---|---|
|秒（Seconds）	|0~59的整数|	, - * /    四个字符|
|分（Minutes）	|0~59的整数	|, - * /    四个字符
|小时（Hours）|	0~23的整数|	, - * /    四个字符
|日期（DayofMonth）	|1~31的整数（但是你需要考虑你月的天数）|	,- * ? / L W C     八个字符
|月份（Month）|	1~12的整数或者 JAN-DEC|	, - * /    四个字符
|星期（DayofWeek）|	1~7的整数或者 SUN-SAT （1=SUN）|	, - * ? / L C #     八个字符
|年(可选，留空)（Year）|	1970~2099|	, - * /    四个字符

**说明：**

* *：表示匹配该域的任意值。假如在Minutes域使用*, 即表示每分钟都会触发事件。
* ?：只能用在DayofMonth和DayofWeek两个域。它也匹配域的任意值，但实际不会。因为DayofMonth和DayofWeek会相互影响。例如想在每月的20日触发调度，不管20日到底是星期几，则只能使用如下写法： 13 13 15 20 * ?, 其中最后一位只能用？，而不能使用*，如果使用*表示不管星期几都会触发，实际上并不是这样。
* -：表示范围。例如在Minutes域使用5-20，表示从5分到20分钟每分钟触发一次 
* /：表示起始时间开始触发，然后每隔固定时间触发一次。例如在Minutes域使用5/20,则意味着5分钟触发一次，而25，45等分别触发一次. 
* ,：表示列出枚举值。例如：在Minutes域使用5,20，则意味着在5和20分每分钟触发一次。 
* L：表示最后，只能出现在DayofWeek和DayofMonth域。如果在DayofWeek域使用5L,意味着在最后的一个星期四触发。 
* W:表示有效工作日(周一到周五),只能出现在DayofMonth域，系统将在离指定日期的最近的有效工作日触发事件。例如：在 DayofMonth使用5W，如果5日是星期六，则将在最近的工作日：星期五，即4日触发。如果5日是星期天，则在6日(周一)触发；如果5日在星期一到星期五中的一天，则就在5日触发。另外一点，W的最近寻找不会跨过月份 。
* LW:这两个字符可以连用，表示在某个月最后一个工作日，即最后一个星期五。 
* #:用于确定每个月第几个星期几，只能出现在DayofMonth域。例如在4#2，表示某月的第二个星期三。

**常用表达式例子**
* 0 0 2 1 * ? *   表示在每月的1日的凌晨2点调整任务
* 0 15 10 ? * MON-FRI   表示周一到周五每天上午10:15执行作业
* 0 15 10 ? 6L 2002-2006   表示2002-2006年的每个月的最后一个星期五上午10:15执行作
* 0 0 10,14,16 * * ?   每天上午10点，下午2点，4点 
* 0 0/30 9-17 * * ?   朝九晚五工作时间内每半小时 
* 0 0 12 ? * WED    表示每个星期三中午12点 
* 0 0 12 * * ?   每天中午12点触发 
* 0 15 10 ? * *    每天上午10:15触发 
* 0 15 10 * * ?     每天上午10:15触发 
* 0 15 10 * * ? *    每天上午10:15触发 
* 0 15 10 * * ? 2005    2005年的每天上午10:15触发 
* 0 * 14 * * ?     在每天下午2点到下午2:59期间的每1分钟触发 
* 0 0/5 14 * * ?    在每天下午2点到下午2:55期间的每5分钟触发 
* 0 0/5 14,18 * * ?     在每天下午2点到2:55期间和下午6点到6:55期间的每5分钟触发 
* 0 0-5 14 * * ?    在每天下午2点到下午2:05期间的每1分钟触发 
* 0 10,44 14 ? 3 WED    每年三月的星期三的下午2:10和2:44触发 
* 0 15 10 ? * MON-FRI    周一至周五的上午10:15触发 
* 0 15 10 15 * ?    每月15日上午10:15触发 
* 0 15 10 L * ?    每月最后一日的上午10:15触发 
* 0 15 10 ? * 6L    每月的最后一个星期五上午10:15触发 
* 0 15 10 ? * 6L 2002-2005   2002年至2005年的每月的最后一个星期五上午10:15触发 
* 0 15 10 ? * 6#3   每月的第三个星期五上午10:15触发

### 1.9.1. Spring Scheduler
<a href="#menu" style="float:right">目录</a>

注解Scheduled
```java
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(Schedules.class)
public @interface Scheduled {
    String CRON_DISABLED = "-";

    String cron() default "";

    String zone() default "";

    long fixedDelay() default -1L;

    String fixedDelayString() default "";

    long fixedRate() default -1L;

    String fixedRateString() default "";

    long initialDelay() default -1L;

    String initialDelayString() default "";
}
````
```java
//在启动类上添加@EnableScheduling
@EnableScheduling
@SpringBootApplication
public class SpringSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSchedulerApplication.class, args);
    }

}

//创建任务类
@Slf4j
@Component
public class Task1 {

    //使用Cron表达式 ，5秒执行一次
    @Scheduled(cron = "0/5 * * * * *")
    public void work1(){
        log.info("work1");
    }


    //下一次的任务执行时间，是从方法最后一次任务执行结束时间开始计算。并以此规则开始周期性的执行任务。
    //也就是说间隔时间是:任务执行的时间+fixedDelay
    @Scheduled(fixedDelay = 1000*3)
    public void work2(){
        log.info("work2");
        try{
            Thread.sleep(5*1000);
        }
        catch(Exception ex){
            log.error(ex.getMessage());
        }

    }

    //按照指定频率执行任务，并以此规则开始周期性的执行调度。
    //以固定周期fixedRate执行
    @Scheduled(fixedRate = 1000*3)
    public void work3(){
        log.info("work3");
        try{
            Thread.sleep(5*1000);
        }
        catch(Exception ex){
            log.error(ex.getMessage());
        }

    }
}
```
Spring Scheduler 底层是由ScheduledThreadPoolExecutor实现，默认只创建一个线程，如果单个应用中出现多个定时任务，将会出现时间漂移，定时时间不准确。因此应当一个任务配置一个线程。需要自定义线程数。
```java
@Configuration
public class ScheduleConfig implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(taskExecutor());
    }

    @Bean
    public Executor taskExecutor() {
        //自定义线程池的线程数，和应用中的任务数量一致
        return Executors.newScheduledThreadPool(2);
    }
}
```
### 1.9.2. Quartz
<a href="#menu" style="float:right">目录</a>
#### 1.9.2.1. Quartz 核心概念
* Job 表示一个工作，要执行的具体内容。此接口中只有一个方法，如下：
* JobDetail 表示一个具体的可执行的调度程序，Job 是这个可执行程调度程序所要执行的内容，另外 JobDetail 还包含了这个任务调度的方案和策略。 
* Trigger 代表一个调度参数的配置，什么时候去调。 
* Scheduler 代表一个调度容器，一个调度容器中可以注册多个 JobDetail 和 Trigger。当 Trigger 与 JobDetail 组合，就可以被 Scheduler 容器调度了。 
[更多使用方式参考](https://www.w3cschool.cn/quartz_doc/)

## 1.10. 分布式ID
<a href="#menu" style="float:right">目录</a>

### 1.10.1. 应用场景
分布式ID的应用场景：
* 数据库主键，在进行分库分表时，如果数据库仍然使用自增，可能会出现主键重复的问题，因此需要应用生成主键。
* 在一些消息中间件的使用场景，在处理消息幂等性时，会为每个消息添加一个唯一ID，消费者通过该ID校验消息是否已经被消费。

### 1.10.2. 分布式ID生成方案

* 分布式ID一般的要求是：
    * 占用空间少，利于存储数字优先于字符串
    * 单调变化
    * 全局唯一
    * 高可用
    * 生成性能好，低延迟
    * 接入简单

**方案1：JDK的UUID方式**
```java
UUID.randomUUID();

0ffe6419-c69c-4266-a5f3-c6327a7d6bf1
```
从上面可以看出，UUID的方式所生成的ID过长，不利于存储，也没有顺序，优点是生成简单。

**方式2：Redis**
使用Redis的自增命令,缺点是如果应用中没有Redis，需要引入新的组件。

**方式3:Zookeeper**
使用ZK的版本号，ZK每次对节点数据进行修改，版本号都会自增。缺点也是要引入新的组件。读写效率也需要进行验证。

**方式4：snowflake算法**
64比特位的数据，使用Long型即可表达。
主要分为三部分： 时间戳(ms)+自定义机器ID+序列号。每个部分的长度根据需求自定义。
机器ID是固定的，时间戳是当前的时间戳，如果两次获取ID都是同一个时间戳，则序列号部分自增，如果是新的时间戳，则将序列号清零。
优点是占用空间小，仅仅8个字节。生成效率高。整体单调递增。但是无法解决时钟漂移问题。假如机器时钟回拨，可能会出现重复ID的问题。分布式环境下也会因为时钟问题出现非单调递增。同时页需要考虑润秒的情况。

**方式5:数据库生成方式**
[Leaf：美团分布式ID生成服务开源](https://tech.meituan.com/2019/03/07/open-source-project-leaf.html)
Leaf是美团基础研发平台推出的一个分布式ID生成服务，名字取自德国哲学家、数学家莱布尼茨的一句话：“There are no two identical leaves in the world.”Leaf具备高可靠、低延迟、全局唯一等特点。目前已经广泛应用于美团金融、美团外卖、美团酒旅等多个部门。具体的技术细节，可参考此前美团技术博客的一篇文章：《Leaf美团分布式ID生成服务》。近日，Leaf项目已经在Github上开源：https://github.com/Meituan-Dianping/Leaf，希望能和更多的技术同行一起交流、共建。

Leaf特性
Leaf在设计之初就秉承着几点要求：

全局唯一，绝对不会出现重复的ID，且ID整体趋势递增。
高可用，服务完全基于分布式架构，即使MySQL宕机，也能容忍一段时间的数据库不可用。
高并发低延时，在CentOS 4C8G的虚拟机上，远程调用QPS可达5W+，TP99在1ms内。
接入简单，直接通过公司RPC服务或者HTTP调用即可接入。
Leaf诞生
Leaf第一个版本采用了预分发的方式生成ID，即可以在DB之上挂N个Server，每个Server启动时，都会去DB拿固定长度的ID List。这样就做到了完全基于分布式的架构，同时因为ID是由内存分发，所以也可以做到很高效。接下来是数据持久化问题，Leaf每次去DB拿固定长度的ID List，然后把最大的ID持久化下来，也就是并非每个ID都做持久化，仅仅持久化一批ID中最大的那一个。这个方式有点像游戏里的定期存档功能，只不过存档的是未来某个时间下发给用户的ID，这样极大地减轻了DB持久化的压力。

整个服务的具体处理过程如下：
![](https://p1.meituan.net/travelcube/210ca1564c70b228ed46f3b33c9bb9b161120.png)


Leaf Server 1：从DB加载号段[1，1000]。
Leaf Server 2：从DB加载号段[1001，2000]。
Leaf Server 3：从DB加载号段[2001，3000]。
用户通过Round-robin的方式调用Leaf Server的各个服务，所以某一个Client获取到的ID序列可能是：1，1001，2001，2，1002，2002……也可能是：1，2，1001，2001，2002，2003，3，4……当某个Leaf Server号段用完之后，下一次请求就会从DB中加载新的号段，这样保证了每次加载的号段是递增的。

Leaf数据库中的号段表格式如下：
```sql
+-------------+--------------+------+-----+-------------------+-----------------------------+
| Field       | Type         | Null | Key | Default           | Extra                       |
+-------------+--------------+------+-----+-------------------+-----------------------------+
| biz_tag     | varchar(128) | NO   | PRI |                   |                             |
| max_id      | bigint(20)   | NO   |     | 1                 |                             |
| step        | int(11)      | NO   |     | NULL              |                             |
| desc        | varchar(256) | YES  |     | NULL              |                             |
| update_time | timestamp    | NO   |     | CURRENT_TIMESTAMP | on update CURRENT_TIMESTAMP |
+-------------+--------------+------+-----+-------------------+-----------------------------+
```
Leaf Server加载号段的SQL语句如下：
```sql
Begin
UPDATE table SET max_id=max_id+step WHERE biz_tag=xxx
SELECT tag, max_id, step FROM table WHERE biz_tag=xxx
Commit
```
整体上，V1版本实现比较简单，主要是为了尽快解决业务层DB压力的问题，而快速迭代出的一个版本。因而在生产环境中，也发现了些问题。比如：

在更新DB的时候会出现耗时尖刺，系统最大耗时取决于更新DB号段的时间。
当更新DB号段的时候，如果DB宕机或者发生主从切换，会导致一段时间的服务不可用。
Leaf双Buffer优化
为了解决这两个问题，Leaf采用了异步更新的策略，同时通过双Buffer的方式，保证无论何时DB出现问题，都能有一个Buffer的号段可以正常对外提供服务，只要DB在一个Buffer的下发的周期内恢复，就不会影响整个Leaf的可用性。

![](https://p1.meituan.net/travelcube/64a44ac6db45e4b7b88b10c85a76614a52159.png)

这个版本代码在线上稳定运行了半年左右，Leaf又遇到了新的问题：

号段长度始终是固定的，假如Leaf本来能在DB不可用的情况下，维持10分钟正常工作，那么如果流量增加10倍就只能维持1分钟正常工作了。
号段长度设置的过长，导致缓存中的号段迟迟消耗不完，进而导致更新DB的新号段与前一次下发的号段ID跨度过大。
Leaf动态调整Step
假设服务QPS为Q，号段长度为L，号段更新周期为T，那么Q * T = L。最开始L长度是固定的，导致随着Q的增长，T会越来越小。但是Leaf本质的需求是希望T是固定的。那么如果L可以和Q正相关的话，T就可以趋近一个定值了。所以Leaf每次更新号段的时候，根据上一次更新号段的周期T和号段长度step，来决定下一次的号段长度nextStep：

T < 15min，nextStep = step * 2
15min < T < 30min，nextStep = step
T > 30min，nextStep = step / 2
至此，满足了号段消耗稳定趋于某个时间区间的需求。当然，面对瞬时流量几十、几百倍的暴增，该种方案仍不能满足可以容忍数据库在一段时间不可用、系统仍能稳定运行的需求。因为本质上来讲，Leaf虽然在DB层做了些容错方案，但是号段方式的ID下发，最终还是需要强依赖DB。

MySQL高可用
在MySQL这一层，Leaf目前采取了半同步的方式同步数据，通过公司DB中间件Zebra加MHA做的主从切换。未来追求完全的强一致，会考虑切换到MySQL Group Replication。

现阶段由于公司数据库强一致的特性还在演进中，Leaf采用了一个临时方案来保证机房断网场景下的数据一致性：

多机房部署数据库，每个机房一个实例，保证都是跨机房同步数据。
半同步超时时间设置到无限大，防止半同步方式退化为异步复制。
Leaf监控
针对服务自身的监控，Leaf提供了Web层的内存数据映射界面，可以实时看到所有号段的下发状态。比如每个号段双buffer的使用情况，当前ID下发到了哪个位置等信息都可以在Web界面上查看。



Leaf Snowflake
Snowflake，Twitter开源的一种分布式ID生成算法。基于64位数实现，下图为Snowflake算法的ID构成图。

![](https://p0.meituan.net/travelcube/96034f8fa0f2cb14c21844a4fa12f50441574.png)

第1位置为0。
第2-42位是相对时间戳，通过当前时间戳减去一个固定的历史时间戳生成。
第43-52位是机器号workerID，每个Server的机器ID不同。
第53-64位是自增ID。
这样通过时间+机器号+自增ID的组合来实现了完全分布式的ID下发。

在这里，Leaf提供了Java版本的实现，同时对Zookeeper生成机器号做了弱依赖处理，即使Zookeeper有问题，也不会影响服务。Leaf在第一次从Zookeeper拿取workerID后，会在本机文件系统上缓存一个workerID文件。即使ZooKeeper出现问题，同时恰好机器也在重启，也能保证服务的正常运行。这样做到了对第三方组件的弱依赖，一定程度上提高了SLA。

未来规划
号段加载优化：Leaf目前重启后的第一次请求还是会同步加载MySQL，之所以这么做而非服务初始化加载号段的原因，主要是MySQL中的Leaf Key并非一定都被这个Leaf服务节点所加载，如果每个Leaf节点都在初始化加载所有的Leaf Key会导致号段的大量浪费。因此，未来会在Leaf服务Shutdown时，备份这个服务节点近一天使用过的Leaf Key列表，这样重启后会预先从MySQL加载Key List中的号段。
单调递增：简易的方式，是只要保证同一时间、同一个Leaf Key都从一个Leaf服务节点获取ID，即可保证递增。需要注意的问题是Leaf服务节点切换时，旧Leaf 服务用过的号段需要废弃。路由逻辑，可采用主备的模型或者每个Leaf Key 配置路由表的方式来实现。
关于开源
分布式ID生成的方案有很多种，Leaf开源版本提供了两种ID的生成方式：

号段模式：低位趋势增长，较少的ID号段浪费，能够容忍MySQL的短时间不可用。
Snowflake模式：完全分布式，ID有语义。
读者可以按需选择适合自身业务场景的ID下发方式。希望美团的方案能给予大家一些帮助，同时也希望各位能够一起交流、共建。

Leaf项目Github地址：https://github.com/Meituan-Dianping/Leaf 。

## 1.11. 分布式锁
[How to do distributed locking](https://martin.kleppmann.com/2016/02/08/how-to-do-distributed-locking.html)
<a href="#menu" style="float:right">目录</a>
不管使用什么中间件，有几点是实现分布式锁必须要考虑到的。
* 互斥：互斥好像是必须的，否则怎么叫锁。
* 死锁: 如果一个线程获得锁，然后挂了，并没有释放锁，致使其他节点(线程)永远无法获取锁，这就是死锁。分布式锁必须做到避免死锁。
* 性能: 高并发分布式系统中，线程互斥等待会成为性能瓶颈，需要好的中间件和实现来保证性能。
* 锁特性：考虑到复杂的场景，分布式锁不能只是加锁，然后一直等待。最好实现如Java Lock的一些功能如：锁判断，超时设置，可重入性等。

### 1.11.1. 使用数据库实现

### 1.11.2. Redis实现分布式锁
redis-2.9之后的set指令如下，提供了不存在则设置，设者超时时间的功能，这条语句具备原子性。
```
set key value px milliseconds nx；
```
使用Redis实现分布式锁需要考虑的问题是：
* 获取到锁之后，该应用宕机了，这个锁还没释放，如何解决
* 获取锁失败如何处理
* 设置了超时时间，但是本次的执行任务的时间超过了锁的超时时间，导致可能出现竞争性问题，如何解决
* 使用主从模式或者哨兵模式提高分布式锁的高可用，但是写入master成功，但是数据还未同步到slave，此时master宕机，slave升级为新的master,其他线程申请该所将会获取到锁，从而发生竞争性问题，如何解决。
* 如何解决操作原子性问题
* 如何实现更加复杂的功能，比如可重入特性

下面讲解如何使用Redis实现分布式锁



### 1.11.3. Zookeeper实现分布式锁

## 1.12. 微服务化
<a href="#menu" style="float:right">目录</a>

### 1.12.1. 微服务和SOA

|微服务|SOA|
|---|---|
|能拆分的就拆分|是整体的，服务能放在一起就放在一起|
|纵向业务划分|是水平分多层|
|由单一组织负责|按层级划分不同的组织负责|
|细粒度|粗粒度|
|组件小|存在复杂的组件|
|业务逻辑存在于每一个服务中|业务逻辑横跨多个业务领域|
|使用轻量级的通信方式如HTTP|企业服务总线ESB充当了服务之间通信的角色|

### 1.12.2. 拆分原则
* 公共的业务功能
    * 基础服务
        * 用户服务
        * 计算服务
        * 配置服务
* 重点业务
* 对系统影响较大的业务
‘   * 性能和资源消耗比较大的服务
* 经常变化的业务
    * 说明需要经常变更发布
* 特殊业务主体
    



## 1.13. 消息机制
<a href="#menu" style="float:right">目录</a>

## 1.14. 服务降级
<a href="#menu" style="float:right">目录</a>

## 1.15. 流量限流
<a href="#menu" style="float:right">目录</a>

## 1.16. 幂等设计
<a href="#menu" style="float:right">目录</a>

## 1.17. 数据一致性
<a href="#menu" style="float:right">目录</a>

### 1.17.1. CAP理论
### 1.17.2. Base理论

## 1.18. 分布式事务实现
<a href="#menu" style="float:right">目录</a>

## 1.19. 负载均衡算法
<a href="#menu" style="float:right">目录</a>

## 1.20. 服务容错设计
<a href="#menu" style="float:right">目录</a>

## 1.21. 集群
<a href="#menu" style="float:right">目录</a>

## 1.22. 分库分表
<a href="#menu" style="float:right">目录</a>

## 1.23. 反向代理&正向代理
<a href="#menu" style="float:right">目录</a>

## 1.24. 客户端优化
<a href="#menu" style="float:right">目录</a>

<h1>WEB安全</h1>

<span id="menu"></span>


# 1. 浏览器安全
<a href="#menu" style="float:right">目录</a>

## 1.1. 同源策略

* 定义
    * 脚本只访问同源的服务器 
    * 同源策略是浏览器的行为，是为了保护本地数据不被JavaScript代码获取回来的数据污染，因此拦截的是客户端发出的请求回来的数据接收，即请求发送了，服务器响应了，但是无法被浏览器接收
    * html中的 img / a /link / script /  ifame 等标签不受此限制，脚本访问才会受限制
    * DOM,Cookie,XMLHttpRequest(ajax)受同源限制,以及浏览器加载的第三方插件比如Flash,JavaApplet等有自己的控制策略
    * 脚本访问不同源的数据叫跨域访问
    
* 同源区分
    * 协议
    * host
    * 端口
    * 子域名
* 破解跨域访问
    * 通过响应的HTTP头来授权
    * Access-Control-Allow-Origin   
        * https://www.zhoutao123.com	
        * 标明允许https://www.zhoutao123.com	发起跨域请求
    * Access-Control-Max-Age	
        * 3628800	
        * 表明在3628800秒内，不需要再发送预检验请求
    * Access-Control-Allow-Methods	
        * GET，PUT, DELETE	允许GET、PUT、DELETE的外域请求
    * Access-Control-Allow-Headers
        * content-type	
        * 允许跨域请求包含content-type头
* Spring Boot开启
方式1：
```java
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CrossOrigin {
    
    //允许跨域的服务器
    @AliasFor("origins")
    String[] value() default {};
    
    //和上面是一样的 AliasFor
    @AliasFor("value")
    String[] origins() default {};

    //允许头部
    String[] allowedHeaders() default {};

    String[] exposedHeaders() default {};
    
    /**
     * The list of supported HTTP request methods.
     * <p>By default the supported methods are the same as the ones to which a
     * controller method is mapped.
     */
    RequestMethod[] methods() default {};
    
    String allowCredentials() default "";
    
    /**
     * The maximum age (in seconds) of the cache duration for preflight responses.
     * <p>This property controls the value of the {@code Access-Control-Max-Age}
     * response header of preflight requests.
     * <p>Setting this to a reasonable value can reduce the number of preflight
     * request/response interactions required by the browser.
     * A negative value means <em>undefined</em>.
     * <p>By default this is set to {@code 1800} seconds (30 minutes).
     */
    long maxAge() default -1;
}
 //根据CrossOrigin的注释可以再请求参数的不存在的时候,CORS支持的方法和Mapper支持的方法一致
@CrossOrigin(origins = "http://localhost:9000")
@GetMapping("/test")
public Greeting greeting(@RequestParam(required=false, defaultValue="World") String name) {
    System.out.println("==== in tesing ====");
    return "SUCCESS";
}
```  
方式2
```java
 @Bean
  @SuppressWarnings("deprecation")
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurerAdapter() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        log.info("CORS 配置参数 origins = {}  url = {}", allowedOrigins, allowedUrl);
        registry
            .addMapping("/**")
            .allowedMethods("GET", "POST", "PATCH", "DELETE", "PUT", "OPTIONS")
            .allowedOrigins("http://localhost:9090");
      }
    };
  }
```

# 2. 跨站脚本攻击XSS
<a href="#menu" style="float:right">目录</a>

## 2.1. 简介
<a href="#menu" style="float:right">目录</a>
* 全称 Cross Site Script,为与CSS区别，使用XSS
* 概念
    * 通过HTML注入篡改了网页，插入恶意的脚本，从而在用户浏览网页的时候，控制用户浏览器的一种攻击。
    * 这种攻击是跨域的，所以叫跨站脚本。
    * 操作
        * 输入用户名为lxx,输入成功后显示的也是lxx
        * 如果存在恶意的脚本攻击，发送到服务器的为 < script>alter(xxx)</ script>
        * 页面显示将会弹出弹框 
* 根据效果区分
    * 反射型
        * 用户点击一个恶意链接，才能攻击成功
        * 脚本不会传输到服务器
    * 存储型
        * 恶意脚本将会存储到服务端
        * 比如在一篇博客中嵌入恶意脚本，用户访问时将会执行这段恶意代码

## 2.2. XSS攻击
<a href="#menu" style="float:right">目录</a>

## 2.3. XSS防御
<a href="#menu" style="float:right">目录</a>

* 服务端设置Cookie时，将属性设置为HttpOnly,将禁止页面的js访问该Cookie
    * Cookie的使用过程
        * 浏览器向服务器发起请求，这个时候没有Cookie
        * 服务器返回时发送Set-Cookie头，向客户端浏览器写入Cookie
        * 在该Cookie到期前，浏览器访问该域下的所有请求，都将发送该Cookie
        * 服务器可以设置多个Cookie,HttpOnl可以有选择性的设置
* 输入检查
    * 比如电话邮箱正确性校验，特殊字符校验
* 输出编码
    * 服务器返回的参数进行编码
    * 即死恶意脚本获取到编码后的数据，可能也无法破解出原始数据


# 3. 跨站点请求伪造CSRF

<a href="#menu" style="float:right">目录</a>

## 3.1. 基本概念
* Cross Site Request Forgery
 
# 4. 点击劫持
<a href="#menu" style="float:right">目录</a>

# 5. HTML5安全
<a href="#menu" style="float:right">目录</a>

# 6. 注入攻击
<a href="#menu" style="float:right">目录</a>

# 7. 文件上传漏洞
<a href="#menu" style="float:right">目录</a>

# 8. 认证和会话管理
<a href="#menu" style="float:right">目录</a>

# 9. 访问控制
<a href="#menu" style="float:right">目录</a>

# 10. 加密算法和随机数
<a href="#menu" style="float:right">目录</a>

# 11. WEB框架安全
<a href="#menu" style="float:right">目录</a>

# 12. 应用拒绝服务攻击
<a href="#menu" style="float:right">目录</a>

# 13. WEB SERVER配置安全
<a href="#menu" style="float:right">目录</a>

