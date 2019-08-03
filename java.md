<span id="menu"></span>
<!-- TOC -->

- [1. Java与面向对象](#1-java与面向对象)
    - [1.1. Java基础](#11-java基础)
        - [1.1.1. 数据类型](#111-数据类型)
        - [1.1.2. 数据类型](#112-数据类型)
            - [1.1.2.1. Integer 缓存对象](#1121-integer-缓存对象)
            - [1.1.2.2. 数组](#1122-数组)
            - [1.1.2.3. String](#1123-string)
    - [1.2. 面向对象](#12-面向对象)
        - [1.2.1. 三大特性](#121-三大特性)
            - [1.2.1.1. 权限修饰符](#1211-权限修饰符)
            - [1.2.1.2. 接口和抽象类](#1212-接口和抽象类)
            - [1.2.1.3. 内部类](#1213-内部类)
            - [1.2.1.4. 枚举类](#1214-枚举类)
        - [1.2.2. 范型](#122-范型)
        - [1.2.3. 集合](#123-集合)
        - [1.2.4. 异常](#124-异常)
        - [1.2.5. 注解](#125-注解)
        - [1.2.6. IO](#126-io)
        - [1.2.7. 反射](#127-反射)
        - [1.2.8. JDBC](#128-jdbc)
    - [1.3. JAVA Socket编程](#13-java-socket编程)
    - [1.4. JDK版本变化](#14-jdk版本变化)
    - [1.5. 设计模式](#15-设计模式)
        - [1.5.1. 设计原则](#151-设计原则)
            - [1.5.1.1. 单一职责原则](#1511-单一职责原则)
            - [1.5.1.2. 里氏替换原则](#1512-里氏替换原则)
            - [1.5.1.3. 依赖倒置原则](#1513-依赖倒置原则)
            - [1.5.1.4. 接口隔离原则](#1514-接口隔离原则)
            - [1.5.1.5. 迪米特法则](#1515-迪米特法则)
            - [1.5.1.6. 开闭原则](#1516-开闭原则)
        - [1.5.2. UML图](#152-uml图)
        - [1.5.3. 单例模式](#153-单例模式)
            - [1.5.3.1. 基本概念](#1531-基本概念)
            - [1.5.3.2. 实现](#1532-实现)
        - [1.5.4. 工厂方法模式](#154-工厂方法模式)
        - [1.5.5. 抽象工厂模式](#155-抽象工厂模式)
        - [1.5.6. 模板方法模式](#156-模板方法模式)
        - [1.5.7. 建造者模式](#157-建造者模式)
        - [1.5.8. 代理模式](#158-代理模式)
        - [1.5.9. 原型模式](#159-原型模式)
        - [1.5.10. 中介者模式](#1510-中介者模式)
        - [1.5.11. 命令模式](#1511-命令模式)
        - [1.5.12. 责任链模式](#1512-责任链模式)
        - [1.5.13. 装饰模式](#1513-装饰模式)
        - [1.5.14. 策略模式](#1514-策略模式)
        - [1.5.15. 适配器模式](#1515-适配器模式)
        - [1.5.16. 迭代器模式](#1516-迭代器模式)
        - [1.5.17. 组合模式](#1517-组合模式)
        - [1.5.18. 观察者模式](#1518-观察者模式)
        - [1.5.19. 门面模式](#1519-门面模式)
        - [1.5.20. 备忘录模式](#1520-备忘录模式)
        - [1.5.21. 访问者模式](#1521-访问者模式)
        - [1.5.22. 状态模式](#1522-状态模式)
        - [1.5.23. 解释器模式](#1523-解释器模式)
        - [1.5.24. 享元模式](#1524-享元模式)
        - [1.5.25. 桥梁模式](#1525-桥梁模式)
    - [1.6. Effective Java总结](#16-effective-java总结)
        - [1.6.1. 创建和销毁对象](#161-创建和销毁对象)
        - [1.6.2. 对于所有对象都通用的方法](#162-对于所有对象都通用的方法)
        - [1.6.3. 类和接口](#163-类和接口)
        - [1.6.4. 范型](#164-范型)
        - [1.6.5. 枚举和注解](#165-枚举和注解)
        - [1.6.6. 方法](#166-方法)
        - [1.6.7. 通用程序设计](#167-通用程序设计)
        - [1.6.8. 异常](#168-异常)
        - [1.6.9. 并发](#169-并发)
        - [1.6.10. 序列化](#1610-序列化)
    - [Java编程思想阅读总结](#java编程思想阅读总结)
        - [对象导论](#对象导论)
        - [一切都是对象](#一切都是对象)
        - [操作符](#操作符)
        - [控制执行流程](#控制执行流程)
        - [初始化和清理](#初始化和清理)
        - [访问权限控制](#访问权限控制)
        - [复用类](#复用类)
        - [多态](#多态)
        - [接口](#接口)
        - [内部类](#内部类)
        - [持有对象](#持有对象)
        - [通过异常处理错误](#通过异常处理错误)
        - [字符串](#字符串)
        - [类型信息](#类型信息)
        - [范型](#范型)
        - [数组](#数组)
        - [容器深入研究](#容器深入研究)
        - [Java IO系统](#java-io系统)
        - [枚举类型](#枚举类型)
        - [注解](#注解)
        - [并发](#并发)
        - [](#)

<!-- /TOC -->
# 1. Java与面向对象

## 1.1. Java基础
<a href="#menu" style="float:right">目录</a>

### 1.1.1. 数据类型
<a href="#menu" style="float:right">目录</a>
### 1.1.2. 数据类型
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
#### 1.1.2.1. Integer 缓存对象
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
#### 1.1.2.2. 数组
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
#### 1.1.2.3. String 
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
#### 1.2.1.1. 权限修饰符
<a href="#menu" style="float:right">目录</a>
* private 本类可见
* default 同一个包/子包可见
* protect 子类可见
* public 所有可见

#### 1.2.1.2. 接口和抽象类
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


#### 1.2.1.3. 内部类
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
#### 1.2.1.4. 枚举类
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
### 1.2.2. 范型
<a href="#menu" style="float:right">目录</a>

### 1.2.3. 集合
<a href="#menu" style="float:right">目录</a>

### 1.2.4. 异常
<a href="#menu" style="float:right">目录</a>

### 1.2.5. 注解
<a href="#menu" style="float:right">目录</a>

### 1.2.6. IO
<a href="#menu" style="float:right">目录</a>

### 1.2.7. 反射
<a href="#menu" style="float:right">目录</a>

### 1.2.8. JDBC
<a href="#menu" style="float:right">目录</a>

## 1.3. JAVA Socket编程
<a href="#menu" style="float:right">目录</a>

## 1.4. JDK版本变化
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





## 1.5. 设计模式
<a href="#menu" style="float:right">目录</a>

### 1.5.1. 设计原则
<a href="#menu" style="float:right">目录</a>

#### 1.5.1.1. 单一职责原则
* 每个类只负责单一的功能，避免出现复杂臃肿的类。造成维护困难。
#### 1.5.1.2. 里氏替换原则
* 父类出现的地方子类也可以出现。方便实现类替换，减少代码修改。
#### 1.5.1.3. 依赖倒置原则
* 高层模块不应该依赖细节，而应该依赖其抽象
* 也就是说定义类属性时，使用接口或者抽象类来定义，而不是实现类。
#### 1.5.1.4. 接口隔离原则
* 创建单一的接口，不要创建臃肿的接口。每个接口应该只是负责单一的功能，避免增加新抽象方法时，造成较多的实现类页需要修改。
#### 1.5.1.5. 迪米特法则
* 一个类应当降低对其他类的依赖,避免其他类修改时，使用类也要进行修改。
#### 1.5.1.6. 开闭原则
* 对修改关闭，对扩展开放
* 当需要增加新功能时，应当避免修改原类的代码，应当通过一些设计模式来进行功能扩展。比如装饰模式，这样可以达到对其他使用类的影响。
* 以上的原则都是施行指南，开闭原则是最终目标。

### 1.5.2. UML图

### 1.5.3. 单例模式
<a href="#menu" style="float:right">目录</a>

#### 1.5.3.1. 基本概念

**定义**:确保某一个类只有一个对象实例。
**衍生**：有限多例，比如对象池技术，使用缓存将创建的对象缓存起来。
**优点**:
* 减少内存开支，每创建一个对象都会占用一定的系统内存，创建过多容易造成JVM进行垃圾回收。
* 降低系统性能开销，创建和垃圾回收会耗费一定的系统性能
* 从业务层面讲。可以提供公共的资源访问点。

**缺点**:

#### 1.5.3.2. 实现
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

### 1.5.4. 工厂方法模式
<a href="#menu" style="float:right">目录</a>

### 1.5.5. 抽象工厂模式
<a href="#menu" style="float:right">目录</a>

### 1.5.6. 模板方法模式
<a href="#menu" style="float:right">目录</a>

### 1.5.7. 建造者模式
<a href="#menu" style="float:right">目录</a>

### 1.5.8. 代理模式
<a href="#menu" style="float:right">目录</a>

### 1.5.9. 原型模式
<a href="#menu" style="float:right">目录</a>

### 1.5.10. 中介者模式
<a href="#menu" style="float:right">目录</a>

### 1.5.11. 命令模式
<a href="#menu" style="float:right">目录</a>

### 1.5.12. 责任链模式
<a href="#menu" style="float:right">目录</a>

### 1.5.13. 装饰模式
<a href="#menu" style="float:right">目录</a>

### 1.5.14. 策略模式
<a href="#menu" style="float:right">目录</a>

### 1.5.15. 适配器模式
<a href="#menu" style="float:right">目录</a>

### 1.5.16. 迭代器模式
<a href="#menu" style="float:right">目录</a>

### 1.5.17. 组合模式
<a href="#menu" style="float:right">目录</a>

### 1.5.18. 观察者模式
<a href="#menu" style="float:right">目录</a>

### 1.5.19. 门面模式
<a href="#menu" style="float:right">目录</a>

### 1.5.20. 备忘录模式
<a href="#menu" style="float:right">目录</a>

### 1.5.21. 访问者模式
<a href="#menu" style="float:right">目录</a>

### 1.5.22. 状态模式
<a href="#menu" style="float:right">目录</a>

### 1.5.23. 解释器模式
<a href="#menu" style="float:right">目录</a>

### 1.5.24. 享元模式
<a href="#menu" style="float:right">目录</a>

### 1.5.25. 桥梁模式
<a href="#menu" style="float:right">目录</a>


## 1.6. Effective Java总结
<a href="#menu" style="float:right">目录</a>

### 1.6.1. 创建和销毁对象

### 1.6.2. 对于所有对象都通用的方法

### 1.6.3. 类和接口

### 1.6.4. 范型

### 1.6.5. 枚举和注解

### 1.6.6. 方法


### 1.6.7. 通用程序设计

### 1.6.8. 异常

### 1.6.9. 并发

### 1.6.10. 序列化

## Java编程思想阅读总结

### 对象导论

### 一切都是对象

### 操作符

### 控制执行流程

### 初始化和清理

### 访问权限控制

### 复用类

### 多态

### 接口

### 内部类

### 持有对象


### 通过异常处理错误

### 字符串

### 类型信息


### 范型

### 数组


### 容器深入研究

### Java IO系统


###  枚举类型

### 注解

### 并发

### 


