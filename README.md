<h1> Java知识点总结</h1>

声明：本文档由本人总结整理，版权归个人所有，如果转载使用，需保留此段声明。
[博客园:https://www.cnblogs.com/lgjlife/](https://www.cnblogs.com/lgjlife/)
[GitHub:https://github.com/lgjlife](https://github.com/lgjlife)



<H2 id="menu">目录</H2>
[toc]



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

## 2.3. UML绘制
* https://www.draw.io/ ：在线UML绘制工具，可以保存到本地或者Github

## 2.4. HTTP请求
* POSTMAN（https://www.getpostman.com/）:一款功能强大的网页调试与发送网页HTTP请求的工具
* curl指令

## 2.5. 前端开发编辑
* [vscode](https://code.visualstudio.com/Download)
* IDEA
* Brackets   代码提示，颜色区分
* sublime_text_3   这个Linux下安装后，不支持中文输入，网上有解决办法。

## 2.6. 思维导图软件
* MindMaster   多平台，免费，可以导出为图片。
## 2.7. 编辑器
* VIM
* GEDIT　

## 2.8. 调优工具
* visualVm(https://visualvm.github.io/):是一款免费的,集成了多个 JDK 命令行工具的可视化工具,它能为您提供强大的分析能力,对 Java 应用程序做性能分析和调优.

## 2.9. 压测工具
* Jmeter   可以开多个线程对接口进行压测，并分析压测结果。

## 2.10. 版本管理
* git     
* svn
* 码云
* Git在线练习 [try git](https://try.github.io/)/[git real](https://www.pluralsight.com/courses/code-school-git-real)/[Learn Git Branching](https://learngitbranching.js.org/)

## 2.11. 其他
* SpringBoot Banner 字符生成 [根据图片生成](https://www.degraeve.com/img2txt.php)/[根据文字生成](http://patorjk.com/software/taag/#p=display&f=3D-ASCII&t=MicroBlog%0A)


<a href="#menu" style="float:right">目录</a>
# 3. 计算机基础
<a href="#menu" style="float:right">目录</a>
# 4. 算法
<a href="#menu" style="float:right">目录</a>
# 5. 网络TCP
<a href="#menu" style="float:right">目录</a>
# 6. 网络HTTP
<a href="#menu" style="float:right">目录</a>
# 7. Unix环境编程
<a href="#menu" style="float:right">目录</a>
# 8. Shell
<a href="#menu" style="float:right">目录</a>
## 8.1. 文件相关
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

## 8.2. 系统监控
<a href="#menu" style="float:right">目录</a>
## 8.3. 处理数据文件
<a href="#menu" style="float:right">目录</a>
## 8.4. 环境变量
<a href="#menu" style="float:right">目录</a>
## 8.5. 基本脚本命令
<a href="#menu" style="float:right">目录</a>
## 8.6. 结构化命令
<a href="#menu" style="float:right">目录</a>
## 8.7. 处理用户输入
<a href="#menu" style="float:right">目录</a>
## 8.8. 控制脚本
<a href="#menu" style="float:right">目录</a>

<a href="#menu" style="float:right">目录</a>
# 9. Git
<a href="#menu" style="float:right">目录</a>
# 10. Maven
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
# 11. Jenkins
<a href="#menu" style="float:right">目录</a>
# 12. Docker
<a href="#menu" style="float:right">目录</a>
# 13. Java基础
<a href="#menu" style="float:right">目录</a>
## 数据类型
<a href="#menu" style="float:right">目录</a>
## 面向对象
<a href="#menu" style="float:right">目录</a>
## 范型
<a href="#menu" style="float:right">目录</a>
## 集合
<a href="#menu" style="float:right">目录</a>
## 异常
<a href="#menu" style="float:right">目录</a>
## 注解
<a href="#menu" style="float:right">目录</a>
## IO
<a href="#menu" style="float:right">目录</a>
## 反射
<a href="#menu" style="float:right">目录</a>
## JDBC
<a href="#menu" style="float:right">目录</a>


# 14. 测试
<a href="#menu" style="float:right">目录</a>
## 14.1. 基本测试
<a href="#menu" style="float:right">目录</a>
## 14.2. 控制层测试
<a href="#menu" style="float:right">目录</a>
## 14.3. 服务层测试
<a href="#menu" style="float:right">目录</a>
## 14.4. DAO层测试
<a href="#menu" style="float:right">目录</a>
# 15. JVM
<a href="#menu" style="float:right">目录</a>
# 16. MySQL
<a href="#menu" style="float:right">目录</a>
# 17. MyBatis
<a href="#menu" style="float:right">目录</a>
# 18. Netty 
<a href="#menu" style="float:right">目录</a>
# 19. Dubbo
<a href="#menu" style="float:right">目录</a>
# 20. Redis
<a href="#menu" style="float:right">目录</a>
# 21. Spring
<a href="#menu" style="float:right">目录</a>
# 22. SpringBoot
<a href="#menu" style="float:right">目录</a>
# 23. SpringCloud
<a href="#menu" style="float:right">目录</a>
# 24. Dubbo
<a href="#menu" style="float:right">目录</a>
# 25. RocketMQ
<a href="#menu" style="float:right">目录</a>
# 26. RabbitMQ
<a href="#menu" style="float:right">目录</a>
# 27. Kafka
<a href="#menu" style="float:right">目录</a>
# 28. Nginx
<a href="#menu" style="float:right">目录</a>
# 29. Tomcat
<a href="#menu" style="float:right">目录</a>
# 30. elasticsearch
<a href="#menu" style="float:right">目录</a>
# 31. FastDfs
<a href="#menu" style="float:right">目录</a>
# 32. Quartz
<a href="#menu" style="float:right">目录</a>
# 33. 设计模式
<a href="#menu" style="float:right">目录</a>
## 33.1. 设计原则
<a href="#menu" style="float:right">目录</a>
### 33.1.1. 单一职责原则
* 每个类只负责单一的功能，避免出现复杂臃肿的类。造成维护困难。
### 33.1.2. 里氏替换原则
* 父类出现的地方子类也可以出现。方便实现类替换，减少代码修改。
### 33.1.3. 依赖倒置原则
* 高层模块不应该依赖细节，而应该依赖其抽象
* 也就是说定义类属性时，使用接口或者抽象类来定义，而不是实现类。
### 33.1.4. 接口隔离原则
* 创建单一的接口，不要创建臃肿的接口。每个接口应该只是负责单一的功能，避免增加新抽象方法时，造成较多的实现类页需要修改。
### 33.1.5. 迪米特法则
* 一个类应当降低对其他类的依赖,避免其他类修改时，使用类也要进行修改。
### 33.1.6. 开闭原则
* 对修改关闭，对扩展开放
* 当需要增加新功能时，应当避免修改原类的代码，应当通过一些设计模式来进行功能扩展。比如装饰模式，这样可以达到对其他使用类的影响。
* 以上的原则都是施行指南，开闭原则是最终目标。

## 33.2. 单例模式
<a href="#menu" style="float:right">目录</a>
## 33.3. 工厂方法模式
<a href="#menu" style="float:right">目录</a>
## 33.4. 抽象工厂模式
<a href="#menu" style="float:right">目录</a>
## 33.5. 模板方法模式
<a href="#menu" style="float:right">目录</a>
## 33.6. 建造者模式
<a href="#menu" style="float:right">目录</a>
## 33.7. 代理模式
<a href="#menu" style="float:right">目录</a>
## 33.8. 原型模式
<a href="#menu" style="float:right">目录</a>
## 33.9. 中介者模式
<a href="#menu" style="float:right">目录</a>
## 33.10. 命令模式
<a href="#menu" style="float:right">目录</a>
## 33.11. 责任链模式
<a href="#menu" style="float:right">目录</a>
## 33.12. 装饰模式
<a href="#menu" style="float:right">目录</a>
## 33.13. 策略模式
<a href="#menu" style="float:right">目录</a>
## 33.14. 适配器模式
<a href="#menu" style="float:right">目录</a>
## 33.15. 迭代器模式
<a href="#menu" style="float:right">目录</a>
## 33.16. 组合模式
<a href="#menu" style="float:right">目录</a>
## 33.17. 观察者模式
<a href="#menu" style="float:right">目录</a>
## 33.18. 门面模式
<a href="#menu" style="float:right">目录</a>
## 33.19. 备忘录模式
<a href="#menu" style="float:right">目录</a>
## 33.20. 访问者模式
<a href="#menu" style="float:right">目录</a>
## 33.21. 状态模式
<a href="#menu" style="float:right">目录</a>
## 33.22. 解释器模式
<a href="#menu" style="float:right">目录</a>
## 33.23. 享元模式
<a href="#menu" style="float:right">目录</a>
## 33.24. 桥梁模式
<a href="#menu" style="float:right">目录</a>

# 34. Zookeeper
<a href="#menu" style="float:right">目录</a>
# 35. 分布式系统
<a href="#menu" style="float:right">目录</a>