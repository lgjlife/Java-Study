

<span id="menu"></span>

<!-- TOC -->

- [1. Java与面向对象](#1-java与面向对象)
    - [1.1. Java基础](#11-java基础)
        - [1.1.1. 数据类型](#111-数据类型)
            - [1.1.1.1. Integer 缓存对象](#1111-integer-缓存对象)
            - [1.1.1.2. 数组](#1112-数组)
            - [1.1.1.3. String](#1113-string)
    - [1.2. 面向对象](#12-面向对象)
        - [1.2.1. 三大特性](#121-三大特性)
            - [1.2.1.1. 权限修饰符](#1211-权限修饰符)
            - [1.2.1.2. 接口和抽象类](#1212-接口和抽象类)
            - [1.2.1.3. 建议](#1213-建议)
            - [1.2.1.4. 内部类](#1214-内部类)
            - [1.2.1.5. 枚举类](#1215-枚举类)
        - [1.2.2. 泛型](#122-泛型)
        - [1.2.3. 概述](#123-概述)
        - [1.2.4. 集合](#124-集合)
        - [1.2.5. 异常](#125-异常)
        - [1.2.6. 注解](#126-注解)
    - [1.3. IO](#13-io)
        - [1.3.1. File](#131-file)
            - [1.3.1.1. IO流](#1311-io流)
            - [1.3.1.2. 序列化](#1312-序列化)
        - [1.3.2. NIO](#132-nio)
            - [1.3.2.1. 内存映射](#1321-内存映射)
    - [1.4. Javac编译原理](#14-javac编译原理)
        - [1.4.1. Javac编译器的基本结构](#141-javac编译器的基本结构)
        - [1.4.2. Javac的工作原理分析](#142-javac的工作原理分析)
    - [1.5. 类加载和反射](#15-类加载和反射)
        - [1.5.1. Class文件结构](#151-class文件结构)
            - [1.5.1.1. JVM指令集简介](#1511-jvm指令集简介)
            - [1.5.1.2. class文件头的表示形式](#1512-class文件头的表示形式)
            - [1.5.1.3. 常量池](#1513-常量池)
            - [1.5.1.4. 类信息](#1514-类信息)
            - [1.5.1.5. Fields和Method定义](#1515-fields和method定义)
            - [1.5.1.6. 类属性描述](#1516-类属性描述)
            - [1.5.1.7. Javap生成的class文件结构](#1517-javap生成的class文件结构)
        - [1.5.2. 类加载器](#152-类加载器)
            - [1.5.2.1. 基本概念](#1521-基本概念)
            - [1.5.2.2. 常见的类加载器](#1522-常见的类加载器)
            - [1.5.2.3. 类加载过程](#1523-类加载过程)
            - [1.5.2.4. 全盘委托机制](#1524-全盘委托机制)
            - [1.5.2.5. 定义自已的ClassLoader](#1525-定义自已的classloader)
            - [常见加载类错误](#常见加载类错误)
            - [1.5.2.6. 线程上下文类加载器](#1526-线程上下文类加载器)
            - [1.5.2.7. 类加载器与Web容器](#1527-类加载器与web容器)
            - [1.5.2.8. 常见问题分析](#1528-常见问题分析)
        - [1.5.3. 反射](#153-反射)
    - [1.6. JDBC](#16-jdbc)
    - [1.7. 函数式编程](#17-函数式编程)
    - [1.8. Java 8 的新特性：](#18-java-8-的新特性)
        - [1.8.1. Java 8 Lambda 表达式](#181-java-8-lambda-表达式)
        - [1.8.2. Java 8 函数式接口](#182-java-8-函数式接口)
        - [1.8.3. 默认方法](#183-默认方法)
        - [1.8.4. Optional 类](#184-optional-类)
        - [1.8.5. Stream](#185-stream)
        - [1.8.6. Java 8 日期时间 API](#186-java-8-日期时间-api)
        - [1.8.7. Java8 Base64](#187-java8-base64)
    - [1.9. JDK版本变化](#19-jdk版本变化)
    - [1.10. 设计模式](#110-设计模式)
        - [1.10.1. 设计原则](#1101-设计原则)
            - [1.10.1.1. 单一职责原则](#11011-单一职责原则)
            - [1.10.1.2. 里氏替换原则](#11012-里氏替换原则)
            - [1.10.1.3. 依赖倒置原则](#11013-依赖倒置原则)
            - [1.10.1.4. 接口隔离原则](#11014-接口隔离原则)
            - [1.10.1.5. 迪米特法则](#11015-迪米特法则)
            - [1.10.1.6. 开闭原则](#11016-开闭原则)
        - [1.10.2. UML图](#1102-uml图)
        - [1.10.3. 单例模式](#1103-单例模式)
            - [1.10.3.1. 基本概念](#11031-基本概念)
            - [1.10.3.2. 实现](#11032-实现)
        - [1.10.4. 工厂方法模式](#1104-工厂方法模式)
        - [1.10.5. 抽象工厂模式](#1105-抽象工厂模式)
        - [1.10.6. 模板方法模式](#1106-模板方法模式)
        - [1.10.7. 建造者模式](#1107-建造者模式)
        - [1.10.8. 代理模式](#1108-代理模式)
        - [1.10.9. 原型模式](#1109-原型模式)
        - [1.10.10. 中介者模式](#11010-中介者模式)
        - [1.10.11. 命令模式](#11011-命令模式)
        - [1.10.12. 责任链模式](#11012-责任链模式)
        - [1.10.13. 装饰模式](#11013-装饰模式)
        - [1.10.14. 策略模式](#11014-策略模式)
        - [1.10.15. 适配器模式](#11015-适配器模式)
        - [1.10.16. 迭代器模式](#11016-迭代器模式)
        - [1.10.17. 组合模式](#11017-组合模式)
        - [1.10.18. 观察者模式](#11018-观察者模式)
        - [1.10.19. 门面模式](#11019-门面模式)
        - [1.10.20. 备忘录模式](#11020-备忘录模式)
        - [1.10.21. 访问者模式](#11021-访问者模式)
        - [1.10.22. 状态模式](#11022-状态模式)
        - [1.10.23. 解释器模式](#11023-解释器模式)
        - [1.10.24. 享元模式](#11024-享元模式)
        - [1.10.25. 桥梁模式](#11025-桥梁模式)

<!-- /TOC -->


<a id="markdown-1-java与面向对象" name="1-java与面向对象"></a>
# 1. Java与面向对象

<a id="markdown-11-java基础" name="11-java基础"></a>
## 1.1. Java基础
<a href="#menu" style="float:right">目录</a>

<a id="markdown-111-数据类型" name="111-数据类型"></a>
### 1.1.1. 数据类型
<a href="#menu" style="float:right">目录</a>


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

<a id="markdown-1111-integer-缓存对象" name="1111-integer-缓存对象"></a>
#### 1.1.1.1. Integer 缓存对象
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
<a id="markdown-1112-数组" name="1112-数组"></a>
#### 1.1.1.2. 数组
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
<a id="markdown-1113-string" name="1113-string"></a>
#### 1.1.1.3. String 
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


<a id="markdown-12-面向对象" name="12-面向对象"></a>
## 1.2. 面向对象
<a href="#menu" style="float:right">目录</a>

<a id="markdown-121-三大特性" name="121-三大特性"></a>
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



**创建对象的多种方式**
* 用new关键字创建.会调用构造器
* 利用反射，调用Class类的或者是Constructor类的newInstance（）方法.会调用构造器
* 用反序列化，调用ObjectInputStream类的readObject（）方法，不会调用构造器
* 调用对象的clone方法，不会调用构造器





<a id="markdown-1211-权限修饰符" name="1211-权限修饰符"></a>
#### 1.2.1.1. 权限修饰符
<a href="#menu" style="float:right">目录</a>
* private 本类可见
* default 同一个包/子包可见
* protect 子类可见
* public 所有可见

<a id="markdown-1212-接口和抽象类" name="1212-接口和抽象类"></a>
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

<a id="markdown-1213-建议" name="1213-建议"></a>
#### 1.2.1.3. 建议
* 考虑使用静态工厂方法代替构造器
    * 如果类的实例化参数较复杂，应当通过工厂方法向用户提供简单明了的实例化方法
* 参数较多时使用构建器
    * 由用户决定初始化哪个属性
* 避免创建不必要的对象
    * 创建对象将占用JVM堆内存，为了减少堆内存的使用，要么减少不必要的对象，重复使用的对象可使用对象池，比如数据库连接池
* 消除过期的对象引用
    * 不再使用的对象应当消除其引用
    * 栈中创建的引用不需要显示消除
    * 需要注意的是使用集合存储对象时，如果不再使用应当移除该对象，以便JVM能够对其进行回收
* 避免使用终结方法
    * 终结方法finalizer在垃圾回收之前会被调用
    * 因为何时被调用并不确定，可能很快，可能很长时间，如果使用其来释放资源，将存在很大的不确定性。
* 覆盖equals应遵循的约定
    * 自反性
        * 对于任何非null的对象x，x.equals(x) 必须返回 true
    * 对称性
        * 对于任何非null的对象x、y ,x.equals(y) 和y.equals(x)结果必须相同
    * 传递性
        * 对于任何非null的对象x、y、z，x.equals(y)并且y.equals(z)都返回true，那么必须x.equals(z)返回true.
    * 一致性
        *  对于任何非null的对象x、y,如果equals中比较的信息没改，那么多次调用的结果都是一致的。
    * 对于任何非null的对象，x.equals(null)必须返回false.
* 重写equals时也要重写HashCode
    * 规范:如果两个对象根据equals方法比较的结果是true,那么它们的hashCode方法结果也一样,反过来没有强制
    * 在应用程序的执行期间，只要对象的equals方法的比较操作所用到的信息没有被修改，那么多次调用hashCode获得的整数是一致的
    

<a id="markdown-1214-内部类" name="1214-内部类"></a>
#### 1.2.1.4. 内部类
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
<a id="markdown-1215-枚举类" name="1215-枚举类"></a>
#### 1.2.1.5. 枚举类
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
<a id="markdown-122-泛型" name="122-泛型"></a>
### 1.2.2. 泛型
<a href="#menu" style="float:right">目录</a>

<a id="markdown-123-概述" name="123-概述"></a>
### 1.2.3. 概述
泛型在java中有很重要的地位，在面向对象编程及各种设计模式中有非常广泛的应用。

**什么是泛型？为什么要使用泛型？**
* 泛型，即“参数化类型”。一提到参数，最熟悉的就是定义方法时有形参，然后调用此方法时传递实参。那么参数化类型怎么理解呢？
* 顾名思义，就是将类型由原来的具体的类型参数化，类似于方法中的变量参数，此时类型也定义成参数形式（可以称之为类型形参），然后在使用/调用时传入具体的类型（类型实参）。
* 泛型的本质是为了参数化类型（在不创建新的类型的情况下，通过泛型指定的不同类型来控制形参具体限制的类型）。也就是说在泛型使用过程中，
* 操作的数据类型被指定为一个参数，这种参数类型可以用在类、接口和方法中，分别被称为泛型类、泛型接口、泛型方法。

```java
List arrayList = new ArrayList();
arrayList.add("aaaa");
arrayList.add(100);

for(int i = 0; i< arrayList.size();i++){
    String item = (String)arrayList.get(i);
    Log.d("泛型测试","item = " + item);
}
```
毫无疑问，程序的运行结果会以崩溃结束：
java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
ArrayList可以存放任意类型，例子中添加了一个String类型，添加了一个Integer类型，再使用时都以String的方式使用，因此程序崩溃了。为了解决类似这样的问题（在编译阶段就可以解决），泛型应运而生。

我们将第一行声明初始化list的代码更改一下，编译器会在编译阶段就能够帮我们发现类似这样的问题。
```
List<String> arrayList = new ArrayList<String>();
//arrayList.add(100); 在编译阶段，编译器就会报错
```
* 如果不使用范型，可以把任意类型的对象放入集合，但这将丢失对象的状态信息，集合只知道它盛装的是Object,因此取出需要进行强制转换，如果类型不同，将会发送异常
* 如果使用范型，如果放入对象的类型与集合定义的范型类型不一致，将会发生异常，该对象不会被放入集合。


* 泛型只在编译阶段有效。看下面的代码：
```java
List<String> stringArrayList = new ArrayList<String>();
List<Integer> integerArrayList = new ArrayList<Integer>();

Class classStringArrayList = stringArrayList.getClass();
Class classIntegerArrayList = integerArrayList.getClass();

if(classStringArrayList.equals(classIntegerArrayList)){
    Log.d("泛型测试类型相同");
}
```
输出结果：泛型测试: 类型相同。

通过上面的例子可以证明，在编译之后程序会采取去泛型化的措施。也就是说Java中的泛型，只在编译阶段有效。在编译过程中，正确检验泛型结果后，会将泛型的相关信息擦出，并且在对象进入和离开方法的边界处添加类型检查和类型转换的方法。也就是说，泛型信息不会进入到运行时阶段。
对此总结成一句话：泛型类型在逻辑上看以看成是多个不同的类型，实际上都是相同的基本类型。

**泛型的使用**
泛型有三种使用方式，分别为：泛型类、泛型接口、泛型方法

**泛型类**
泛型类型用于类的定义中，被称为泛型类。通过泛型可以完成对一组类的操作对外开放相同的接口。最典型的就是各种容器类，如：List、Set、Map。

泛型类的最基本写法（这么看可能会有点晕，会在下面的例子中详解）：

```java
class 类名称 <泛型标识：可以随便写任意标识号，标识指定的泛型的类型>{
  private 泛型标识 /*（成员变量类型）*/ var; 
  .....

  }
}
```
一个最普通的泛型类：
```java
//此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
//在实例化泛型类时，必须指定T的具体类型
public class Generic<T>{ 
    //key这个成员变量的类型为T,T的类型由外部指定  
    private T key;

    public Generic(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }

    public T getKey(){ //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }
}

//泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
//传入的实参类型需与泛型的类型参数类型相同，即为Integer.
Generic<Integer> genericInteger = new Generic<Integer>(123456);

//传入的实参类型需与泛型的类型参数类型相同，即为String.
Generic<String> genericString = new Generic<String>("key_vlaue");
Log.d("泛型测试","key is " + genericInteger.getKey());
Log.d("泛型测试","key is " + genericString.getKey());
```
12-27 09:20:04.432 13063-13063/? D/泛型测试: key is 123456
12-27 09:20:04.432 13063-13063/? D/泛型测试: key is key_vlaue

定义的泛型类，就一定要传入泛型类型实参么？并不是这样，在使用泛型的时候如果传入泛型实参，则会根据传入的泛型实参做相应的限制，此时泛型才会起到本应起到的限制作用。如果不传入泛型类型实参的话，在泛型类中使用泛型的方法或成员变量定义的类型可以为任何的类型。

看一个例子：

```java
Generic generic = new Generic("111111");
Generic generic1 = new Generic(4444);
Generic generic2 = new Generic(55.55);
Generic generic3 = new Generic(false);

Log.d("泛型测试","key is " + generic.getKey());
Log.d("泛型测试","key is " + generic1.getKey());
Log.d("泛型测试","key is " + generic2.getKey());
Log.d("泛型测试","key is " + generic3.getKey());
```

D/泛型测试: key is 111111
D/泛型测试: key is 4444
D/泛型测试: key is 55.55
D/泛型测试: key is false
 

注意：
泛型的类型参数只能是类类型，不能是简单类型。
不能对确切的泛型类型使用instanceof操作。如下面的操作是非法的，编译时会出错。
if(ex_num instanceof Generic<Number>){ }

**泛型接口**
泛型接口与泛型类的定义及使用基本相同。泛型接口常被用在各种类的生产器中，可以看一个例子：

//定义一个泛型接口
public interface Generator<T> {
    public T next();
}
当实现泛型接口的类，未传入泛型实参时：

```java
/**
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
 * 即：class FruitGenerator<T> implements Generator<T>{
 * 如果不声明泛型，如：class FruitGenerator implements Generator<T>，编译器会报错："Unknown class"
 */
class FruitGenerator<T> implements Generator<T>{
    @Override
    public T next() {
        return null;
    }
}
```

当实现泛型接口的类，传入泛型实参时：

```java
/**
 * 传入泛型实参时：
 * 定义一个生产器实现这个接口,虽然我们只创建了一个泛型接口Generator<T>
 * 但是我们可以为T传入无数个实参，形成无数种类型的Generator接口。
 * 在实现类实现泛型接口时，如已将泛型类型传入实参类型，则所有使用泛型的地方都要替换成传入的实参类型
 * 即：Generator<T>，public T next();中的的T都要替换成传入的String类型。
 */
public class FruitGenerator implements Generator<String> {

    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    @Override
    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }
}
```

**泛型通配符**
我们知道Ingeter是Number的一个子类，同时在特性章节中我们也验证过Generic<Ingeter>与Generic<Number>实际上是相同的一种基本类型。那么问题来了，在使用Generic<Number>作为形参的方法中，能否使用Generic<Ingeter>的实例传入呢？在逻辑上类似于Generic<Number>和Generic<Ingeter>是否可以看成具有父子关系的泛型类型呢？

为了弄清楚这个问题，我们使用Generic<T>这个泛型类继续看下面的例子：

public void showKeyValue1(Generic<Number> obj){
    Log.d("泛型测试","key value is " + obj.getKey());
}
 

```java
Generic<Integer> gInteger = new Generic<Integer>(123);
Generic<Number> gNumber = new Generic<Number>(456);

showKeyValue(gNumber);

// showKeyValue这个方法编译器会为我们报错：Generic<java.lang.Integer> 
// cannot be applied to Generic<java.lang.Number>
// showKeyValue(gInteger);
```
 

通过提示信息我们可以看到Generic<Integer>不能被看作为`Generic<Number>的子类。由此可以看出:同一种泛型可以对应多个版本（因为参数类型是不确定的），不同版本的泛型类实例是不兼容的。

回到上面的例子，如何解决上面的问题？总不能为了定义一个新的方法来处理Generic<Integer>类型的类，这显然与java中的多台理念相违背。因此我们需要一个在逻辑上可以表示同时是Generic<Integer>和Generic<Number>父类的引用类型。由此类型通配符应运而生。

我们可以将上面的方法改一下：

public void showKeyValue1(Generic<?> obj){
    Log.d("泛型测试","key value is " + obj.getKey());
}
类型通配符一般是使用？代替具体的类型实参，注意了，此处’？’是类型实参，而不是类型形参 。重要说三遍！此处’？’是类型实参，而不是类型形参 ！ 此处’？’是类型实参，而不是类型形参 ！再直白点的意思就是，此处的？和Number、String、Integer一样都是一种实际的类型，可以把？看成所有类型的父类。是一种真实的类型。

可以解决当具体类型不确定的时候，这个通配符就是 ?  ；当操作类型时，不需要使用类型的具体功能时，只使用Object类中的功能。那么可以用 ? 通配符来表未知类型。

**泛型方法**
在java中,泛型类的定义非常简单，但是泛型方法就比较复杂了。

尤其是我们见到的大多数泛型类中的成员方法也都使用了泛型，有的甚至泛型类中也包含着泛型方法，这样在初学者中非常容易将泛型方法理解错了。
泛型类，是在实例化类的时候指明泛型的具体类型；泛型方法，是在调用方法的时候指明泛型的具体类型 。

```java
/**
 * 泛型方法的基本介绍
 * @param tClass 传入的泛型实参
 * @return T 返回值为T类型
 * 说明：
 *     1）public 与 返回值中间<T>非常重要，可以理解为声明此方法为泛型方法。
 *     2）只有声明了<T>的方法才是泛型方法，泛型类中的使用了泛型的成员方法并不是泛型方法。
 *     3）<T>表明该方法将使用泛型类型T，此时才可以在方法中使用泛型类型T。
 *     4）与泛型类的定义一样，此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型。
 */
public <T> T genericMethod(Class<T> tClass)throws InstantiationException ,
  IllegalAccessException{
        T instance = tClass.newInstance();
        return instance;
}
```
 

Object obj = genericMethod(Class.forName("com.test.test"));
4.6.1 泛型方法的基本用法
光看上面的例子有的同学可能依然会非常迷糊，我们再通过一个例子，把我泛型方法再总结一下。

```java
public class GenericTest {
   //这个类是个泛型类，在上面已经介绍过
   public class Generic<T>{     
        private T key;

        public Generic(T key) {
            this.key = key;
        }

        //我想说的其实是这个，虽然在方法中使用了泛型，但是这并不是一个泛型方法。
        //这只是类中一个普通的成员方法，只不过他的返回值是在声明泛型类已经声明过的泛型。
        //所以在这个方法中才可以继续使用 T 这个泛型。
        public T getKey(){
            return key;
        }

        /**
         * 这个方法显然是有问题的，在编译器会给我们提示这样的错误信息"cannot reslove symbol E"
         * 因为在类的声明中并未声明泛型E，所以在使用E做形参和返回值类型时，编译器会无法识别。
        public E setKey(E key){
             this.key = keu
        }
        */
    }

    /** 
     * 这才是一个真正的泛型方法。
     * 首先在public与返回值之间的<T>必不可少，这表明这是一个泛型方法，并且声明了一个泛型T
     * 这个T可以出现在这个泛型方法的任意位置.
     * 泛型的数量也可以为任意多个 
     *    如：public <T,K> K showKeyName(Generic<T> container){
     *        ...
     *        }
     */
    public <T> T showKeyName(Generic<T> container){
        System.out.println("container key :" + container.getKey());
        //当然这个例子举的不太合适，只是为了说明泛型方法的特性。
        T test = container.getKey();
        return test;
    }

    //这也不是一个泛型方法，这就是一个普通的方法，只是使用了Generic<Number>这个泛型类做形参而已。
    public void showKeyValue1(Generic<Number> obj){
        Log.d("泛型测试","key value is " + obj.getKey());
    }

    //这也不是一个泛型方法，这也是一个普通的方法，只不过使用了泛型通配符?
    //同时这也印证了泛型通配符章节所描述的，?是一种类型实参，可以看做为Number等所有类的父类
    public void showKeyValue2(Generic<?> obj){
        Log.d("泛型测试","key value is " + obj.getKey());
    }

     /**
     * 这个方法是有问题的，编译器会为我们提示错误信息："UnKnown class 'E' "
     * 虽然我们声明了<T>,也表明了这是一个可以处理泛型的类型的泛型方法。
     * 但是只声明了泛型类型T，并未声明泛型类型E，因此编译器并不知道该如何处理E这个类型。
    public <T> T showKeyName(Generic<E> container){
        ...
    }  
    */

    /**
     * 这个方法也是有问题的，编译器会为我们提示错误信息："UnKnown class 'T' "
     * 对于编译器来说T这个类型并未项目中声明过，因此编译也不知道该如何编译这个类。
     * 所以这也不是一个正确的泛型方法声明。
    public void showkey(T genericObj){

    }
    */

    public static void main(String[] args) {


    }
}
```
**类中的泛型方法**
当然这并不是泛型方法的全部，泛型方法可以出现杂任何地方和任何场景中使用。但是有一种情况是非常特殊的，当泛型方法出现在泛型类中时，我们再通过一个例子看一下

```java
public class GenericFruit {
    class Fruit{
        @Override
        public String toString() {
            return "fruit";
        }
    }

    class Apple extends Fruit{
        @Override
        public String toString() {
            return "apple";
        }
    }

    class Person{
        @Override
        public String toString() {
            return "Person";
        }
    }

    class GenerateTest<T>{
        public void show_1(T t){
            System.out.println(t.toString());
        }

        //在泛型类中声明了一个泛型方法，使用泛型E，这种泛型E可以为任意类型。可以类型与T相同，也可以不同。
        //由于泛型方法在声明的时候会声明泛型<E>，因此即使在泛型类中并未声明泛型，编译器也能够正确识别泛型方法中识别的泛型。
        public <E> void show_3(E t){
            System.out.println(t.toString());
        }

        //在泛型类中声明了一个泛型方法，使用泛型T，注意这个T是一种全新的类型，可以与泛型类中声明的T不是同一种类型。
        public <T> void show_2(T t){
            System.out.println(t.toString());
        }
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Person person = new Person();

        GenerateTest<Fruit> generateTest = new GenerateTest<Fruit>();
        //apple是Fruit的子类，所以这里可以
        generateTest.show_1(apple);
        //编译器会报错，因为泛型类型实参指定的是Fruit，而传入的实参类是Person
        //generateTest.show_1(person);

        //使用这两个方法都可以成功
        generateTest.show_2(apple);
        generateTest.show_2(person);

        //使用这两个方法也都可以成功
        generateTest.show_3(apple);
        generateTest.show_3(person);
    }
}
```

**泛型方法与可变参数**

再看一个泛型方法和可变参数的例子：
```java
public <T> void printMsg( T... args){
    for(T t : args){
        Log.d("泛型测试","t is " + t);
    }
}
printMsg("111",222,"aaaa","2323.4",55.55);
```

**静态方法与泛型**
静态方法有一种情况需要注意一下，那就是在类中的静态方法使用泛型：静态方法无法访问类上定义的泛型；如果静态方法操作的引用数据类型不确定的时候，必须要将泛型定义在方法上。

即：如果静态方法要使用泛型的话，必须将静态方法也定义成泛型方法 。

```java
public class StaticGenerator<T> {
    ....
    ....
    /**
     * 如果在类中定义使用泛型的静态方法，需要添加额外的泛型声明（将这个方法定义成泛型方法）
     * 即使静态方法要使用泛型类中已经声明过的泛型也不可以。
     * 如：public static void show(T t){..},此时编译器会提示错误信息：
          "StaticGenerator cannot be refrenced from static context"
     */
    public static <T> void show(T t){

    }
}
```
**泛型方法总结**
泛型方法能使方法独立于类而产生变化，以下是一个基本的指导原则：

无论何时，如果你能做到，你就该尽量使用泛型方法。也就是说，如果使用泛型方法将整个类泛型化，

那么就应该使用泛型方法。另外对于一个static的方法而已，无法访问泛型类型的参数。

所以如果static方法要使用泛型能力，就必须使其成为泛型方法。
**泛型上下边界**
在使用泛型的时候，我们还可以为传入的泛型类型实参进行上下边界的限制，如：类型实参只准传入某种类型的父类或某种类型的子类。

为泛型添加上边界，即传入的类型实参必须是指定类型的子类型

public void showKeyValue1(Generic<? extends Number> obj){
    Log.d("泛型测试","key value is " + obj.getKey());
}
```java
Generic<String> generic1 = new Generic<String>("11111");
Generic<Integer> generic2 = new Generic<Integer>(2222);
Generic<Float> generic3 = new Generic<Float>(2.4f);
Generic<Double> generic4 = new Generic<Double>(2.56);

//这一行代码编译器会提示错误，因为String类型并不是Number类型的子类
//showKeyValue1(generic1);

showKeyValue1(generic2);
showKeyValue1(generic3);
showKeyValue1(generic4);
```
如果我们把泛型类的定义也改一下:

```java
public class Generic<T extends Number>{
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey(){
        return key;
    }
}
```
 

//这一行代码也会报错，因为String不是Number的子类
Generic<String> generic1 = new Generic<String>("11111");
再来一个泛型方法的例子：

 

```java
//在泛型方法中添加上下边界限制的时候，必须在权限声明与返回值之间的<T>上添加上下边界，即在泛型声明的时候添加
//public <T> T showKeyName(Generic<T extends Number> container)，编译器会报错："Unexpected bound"
public <T extends Number> T showKeyName(Generic<T> container){
    System.out.println("container key :" + container.getKey());
    T test = container.getKey();
    return test;
}
```
通过上面的两个例子可以看出：泛型的上下边界添加，必须与泛型的声明在一起 。

**泛型数组**
看到了很多文章中都会提起泛型数组，经过查看sun的说明文档，在java中是”不能创建一个确切的泛型类型的数组”的。

也就是说下面的这个例子是不可以的：

List<String>[] ls = new ArrayList<String>[10];  
而使用通配符创建泛型数组是可以的，如下面这个例子：

List<?>[] ls = new ArrayList<?>[10]; 
这样也是可以的：

List<String>[] ls = new ArrayList[10];
下面使用Sun的一篇文档的一个例子来说明这个问题：

```java
List<String>[] lsa = new ArrayList<String>[10]; // Not really allowed.    
Object o = lsa;    
Object[] oa = (Object[]) o;    
List<Integer> li = new ArrayList<Integer>();    
li.add(new Integer(3));    
oa[1] = li; // Unsound, but passes run time store check    
String s = lsa[1].get(0); // Run-time error: ClassCastException.
```
这种情况下，由于JVM泛型的擦除机制，在运行时JVM是不知道泛型信息的，所以可以给oa[1]赋上一个ArrayList而不会出现异常，但是在取出数据的时候却要做一次类型转换，所以就会出现ClassCastException，如果可以进行泛型数组的声明，上面说的这种情况在编译期将不会出现任何的警告和错误，只有在运行时才会出错。而对泛型数组的声明进行限制，对于这样的情况，可以在编译期提示代码有类型安全问题，比没有任何提示要强很多。 

下面采用通配符的方式是被允许的:数组的类型不可以是类型变量，除非是采用通配符的方式，因为对于通配符的方式，最后取出数据是要做显式的类型转换的。

```java
List<?>[] lsa = new ArrayList<?>[10]; // OK, array of unbounded wildcard type.    
Object o = lsa;    
Object[] oa = (Object[]) o;    
List<Integer> li = new ArrayList<Integer>();    
li.add(new Integer(3));    
oa[1] = li; // Correct.    
Integer i = (Integer) lsa[1].get(0); // OK 
```


<a id="markdown-124-集合" name="124-集合"></a>
### 1.2.4. 集合
<a href="#menu" style="float:right">目录</a>

![](http://images2015.cnblogs.com/blog/745114/201603/745114-20160314011243365-185967687.png)

**Collections**

Collections则是集合类的一个工具类/帮助类，其中提供了一系列静态方法，用于对集合中元素进行排序、搜索以及线程安全等各种操作。
* 排序(Sort)
    * 使用sort方法可以根据元素的自然顺序 对指定列表按升序进行排序。列表中的所有元素都必须实现 Comparable 接口。此列表内的所有元素都必须是使用指定比较器可相互比较的
* 混排（Shuffling）
    * 混排算法所做的正好与 sort 相反: 它打乱在一个 List 中可能有的任何排列的踪迹。也就是说，基于随机源的输入重排该 List, 这样的排列具有相同的可能性（假设随机源是公正的）。这个算法在实现一个碰运气的游戏中是非常有用的。例如，它可被用来混排代表一副牌的 Card 对象的一个 List 。另外，在生成测试案例时，它也是十分有用的。
    * Collections.Shuffling(list)
* 反转(Reverse)
    * 使用Reverse方法可以根据元素的自然顺序 对指定列表按降序进行排序。
    * Collections.reverse(list)
* 替换所以的元素(Fill)
    * 使用指定元素替换指定列表中的所有元素。
    * Collections.fill(li,"aaa");
* 拷贝(Copy)
    * 用两个参数，一个目标 List 和一个源 List, 将源的元素拷贝到目标，并覆盖它的内容。目标 List 至少与源一样长。如果它更长，则在目标 List 中的剩余元素不受影响。
    * Collections.copy(list,li): 前面一个参数是目标列表 ,后一个是源列表。

* 返回Collections中最小元素(min)
    * 根据指定比较器产生的顺序，返回给定 collection 的最小元素。collection 中的所有元素都必须是通过指定比较器可相互比较的。
    * Collections.min(list)
* 返回Collections中最小元素(max)
    * 根据指定比较器产生的顺序，返回给定 collection 的最大元素。collection 中的所有元素都必须是通过指定比较器可相互比较的。
    * Collections.max(list)
* lastIndexOfSubList
    * 返回指定源列表中最后一次出现指定目标列表的起始位置
    * int count = Collections.lastIndexOfSubList(list,li);
* IndexOfSubList
    * 返回指定源列表中第一次出现指定目标列表的起始位置
    * int count = Collections.indexOfSubList(list,li);
* Rotate
    * 根据指定的距离循环移动指定列表中的元素
    * Collections.rotate(list,-1);
    * 如果是负数，则正向移动，正数则方向移动

**Arrays**
java.util.Arrays 类是 JDK 提供的一个工具类，用来处理数组的各种方法，而且每个方法基本上都是静态方法，能直接通过类名Arrays调用。
* 转化成List
```java
public static <T> List<T> asList(T... a) {
    return new ArrayList<>(a);
}
```
这个方法返回的 ArrayList 不是我们常用的集合类 java.util.ArrayList。这里的 ArrayList 是 Arrays 的一个内部类 java.util.Arrays.ArrayList
返回的 ArrayList 数组是一个定长列表，我们只能对其进行查看或者修改，但是不能进行添加或者删除操作
返回的列表ArrayList里面的元素都是引用，不是独立出来的对象
```java
private static class ArrayList<E> extends AbstractList<E>
        implements RandomAccess, java.io.Serializable
    {
        private static final long serialVersionUID = -2764017481108945198L;
        private final E[] a;

        ArrayList(E[] array) {
            a = Objects.requireNonNull(array);
        }

        @Override
        public int size() {
            return a.length;
        }

        @Override
        public Object[] toArray() {
            return a.clone();
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T> T[] toArray(T[] a) {
            int size = size();
            if (a.length < size)
                return Arrays.copyOf(this.a, size,
                                     (Class<? extends T[]>) a.getClass());
            System.arraycopy(this.a, 0, a, 0, size);
            if (a.length > size)
                a[size] = null;
            return a;
        }

        @Override
        public E get(int index) {
            return a[index];
        }

        @Override
        public E set(int index, E element) {
            E oldValue = a[index];
            a[index] = element;
            return oldValue;
        }

        @Override
        public int indexOf(Object o) {
            E[] a = this.a;
            if (o == null) {
                for (int i = 0; i < a.length; i++)
                    if (a[i] == null)
                        return i;
            } else {
                for (int i = 0; i < a.length; i++)
                    if (o.equals(a[i]))
                        return i;
            }
            return -1;
        }

        @Override
        public boolean contains(Object o) {
            return indexOf(o) != -1;
        }

        @Override
        public Spliterator<E> spliterator() {
            return Spliterators.spliterator(a, Spliterator.ORDERED);
        }

        @Override
        public void forEach(Consumer<? super E> action) {
            Objects.requireNonNull(action);
            for (E e : a) {
                action.accept(e);
            }
        }

        @Override
        public void replaceAll(UnaryOperator<E> operator) {
            Objects.requireNonNull(operator);
            E[] a = this.a;
            for (int i = 0; i < a.length; i++) {
                a[i] = operator.apply(a[i]);
            }
        }

        @Override
        public void sort(Comparator<? super E> c) {
            Arrays.sort(a, c);
        }
    }
```
* Arrays.asList() 方法使用场景
    * Arrays工具类提供了一个方法asList, 使用该方法可以将一个变长参数或者数组转换成List 。但是，生成的List的长度是固定的；能够进行修改操作（比如，修改某个位置的元素）；不能执行影响长度的操作（如add、remove等操作），否则会抛出UnsupportedOperationException异常。
    * 所以 Arrays.asList 比较适合那些已经有数组数据或者一些元素，而需要快速构建一个List，只用于读取操作，而不进行添加或删除操作的场景。

* 排序 sort 
    * 七种基本类型和引用对象排序(自定义Comparator或者引用对象实现Comparable)
* 查找元素 binarySearch
* 拷贝数组元素 copyOf
    * 底层采用 System.arraycopy() 实现，这是一个native方法。
```java
public static native void arraycopy(Object src,  int  srcPos,
                                        Object dest, int destPos,
                                        int length);
```
* equals
    * equals 用来比较两个数组中对应位置的每个元素是否相等。
* deepEquals
    * 也是用来比较两个数组的元素是否相等，不过 deepEquals 能够进行比较多维数组，而且是任意层次的嵌套数组。

* 给数组赋值fill 
```java
//给a数组所有元素赋值 val
public static void fill(int[] a, int val) {
    for (int i = 0, len = a.length; i < len; i++)
        a[i] = val;
}

//给从 fromIndex 开始的下标，toIndex-1结尾的下标都赋值 val,左闭右开
public static void fill(int[] a, int fromIndex, int toIndex, int val) {
    rangeCheck(a.length, fromIndex, toIndex);//判断范围是否合理
    for (int i = fromIndex; i < toIndex; i++)
        a[i] = val;
}
```
* toString 和 deepToString
    * toString 用来打印一维数组的元素，而 deepToString 用来打印多层次嵌套的数组元素。

**Comparator 和 Comparable 比较**

**Comparable 简介**
Comparable 是排序接口。
若一个类实现了Comparable接口，就意味着“该类支持排序”。  即然实现Comparable接口的类支持排序，假设现在存在“实现Comparable接口的类的对象的List列表(或数组)”，则该List列表(或数组)可以通过 Collections.sort（或 Arrays.sort）进行排序。
此外，“实现Comparable接口的类的对象”可以用作“有序映射(如TreeMap)”中的键或“有序集合(TreeSet)”中的元素，而不需要指定比较器。

Comparable 定义

Comparable 接口仅仅只包括一个函数，它的定义如下：
```java
package java.lang;
import java.util.*;

public interface Comparable<T> {
    public int compareTo(T o);
}
```
说明：
假设我们通过 x.compareTo(y) 来“比较x和y的大小”。若返回“负数”，意味着“x比y小”；返回“零”，意味着“x等于y”；返回“正数”，意味着“x大于y”。

**Comparator 简介**

Comparator 是比较器接口。
我们若需要控制某个类的次序，而该类本身不支持排序(即没有实现Comparable接口)；那么，我们可以建立一个“该类的比较器”来进行排序。这个“比较器”只需要实现Comparator接口即可。
也就是说，我们可以通过“实现Comparator类来新建一个比较器”，然后通过该比较器对类进行排序。

Comparator 定义
Comparator 接口仅仅只包括两个个函数，它的定义如下：

```java
package java.util;

public interface Comparator<T> {

    int compare(T o1, T o2);

    boolean equals(Object obj);
}
```
说明：
(01) 若一个类要实现Comparator接口：它一定要实现compareTo(T o1, T o2) 函数，但可以不实现 equals(Object obj) 函数。
为什么可以不实现 equals(Object obj) 函数呢？ 因为任何类，默认都是已经实现了equals(Object obj)的。 Java中的一切类都是继承于java.lang.Object，在Object.java中实现了equals(Object obj)函数；所以，其它所有的类也相当于都实现了该函数。
(02) int compare(T o1, T o2) 是“比较o1和o2的大小”。返回“负数”，意味着“o1比o2小”；返回“零”，意味着“o1等于o2”；返回“正数”，意味着“o1大于o2”。

* Comparator 和 Comparable 比较
    * Comparable是排序接口；若一个类实现了Comparable接口，就意味着“该类支持排序”。
    * 而Comparator是比较器；我们若需要控制某个类的次序，可以建立一个“该类的比较器”来进行排序。
    * 我们不难发现：Comparable相当于“内部比较器”，而Comparator相当于“外部比较器”。


<a id="markdown-125-异常" name="125-异常"></a>
### 1.2.5. 异常
<a href="#menu" style="float:right">目录</a>

![](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1564945249663&di=9c6ee8dcda7a4b1e21c970cef177ec3f&imgtype=jpg&src=http%3A%2F%2Fimg4.imgtn.bdimg.com%2Fit%2Fu%3D1403341014%2C2801110274%26fm%3D214%26gp%3D0.jpg)

* Error是无法处理的异常，比如OutOfMemoryError，一般发生这种异常，JVM会选择终止程序。因此我们编写程序时不需要关心这类异常。
* Exception，也就是我们经常见到的一些异常情况，比如NullPointerException、IndexOutOfBoundsException，这些异常是我们可以处理的异常。
* Exception类还包含运行异常类Runtime_Exception和非运行异常类Non_RuntimeException这两个直接的子类。

运行异常类对应于编译错误，它是指Java程序在运行时产生的由解释器引发的各种异常。运行异常可能出现在任何地方，且出现频率很高，因此为了避免巨大的系统资源开销，编译器不对异常进行检查。所以Java语言中的运行异常不一定被捕获。出现运行错误往往表示代码有错误，如：算数异常（如被0除）、下标异常（如数组越界）等。

非运行异常时Non_RuntimeException类及其子类的实例，又称为可检测异常。Java编译器利用分析方法或构造方法中可能产生的结果来检测Java程序中是否含有检测异常的处理程序，对于每个可能的可检测异常，方法或构造方法的throws子句必须列出该异常对应的类。在Java的标准包java.lang java.util 和 java.net 中定义的异常都是非运行异常。

* try-catch-finally语句
    * try块：负责捕获异常，一旦try中发现异常，程序的控制权将被移交给catch块中的异常处理程序。
    * try语句块不可以独立存在，必须与 catch 或者 finally 块同存】
    * catch块：如何处理？比如发出警告：提示、检查配置、网络连接，记录错误等。执行完catch块之后程序跳出catch块，继续执行后面的代码。
    * 【编写catch块的注意事项：多个catch块处理的异常类，要按照先catch子类后catch父类的处理方式，因为会【就近处理】异常（由上自下）。】
    * finally：最终执行的代码，用于关闭和释放资源。
```java
try{

}
catch(Exception ex1){

}
catch(Exception ex2){

}
finally{
    
}

```
* **总结：**
    * 不管有木有出现异常或者try和catch中有返回值return，finally块中代码都会执行；
    * finally中最好不要包含return，否则程序会提前退出，返回会覆盖try或catch中保存的返回值。
    * e.printStackTrace()可以输出异常信息。
    * return值为-1为抛出异常的习惯写法。
    * 如果方法中try,catch,finally中没有返回语句，则会调用这三个语句块之外的return结果。
    * finally 在try中的return之后,在返回主调函数之前执行。

* **throw和throws关键字**
throws: 方法声明抛出的异常 
throw： 抛出异常
```java
public void func() throws IOException{
   throw new IOException();
}
```

```java
public class TryCatch {
    public static void main(String[] args) {
        int num = 0;
        try {
             num = 11;
             return;

        } catch (Exception e) {
             num = 22;
             return;
        }
        finally {
             num = 33;
             return;
        }
    }
}

//使用该指令查看编译后的字节码
javap -c TryCatch 

//当finally块中有return时
public class org.TryCatch.TryCatch {
  public org.TryCatch.TryCatch();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
      //try块
       0: iconst_0
       1: istore_1
       2: bipush        11
       4: istore_1
       //如果finally块中有return，则使用goto跳转到finally块
       5: goto          16
       //catch块
       8: astore_2
       9: bipush        22
      11: istore_1
       //如果finally块中有return，则使用goto跳转到finally块
      12: goto          16
      15: pop
      //finally块
      16: bipush        33
      18: istore_1
      //最后在这里返回
      19: return
    Exception table:
       from    to  target type
           2     8     8   Class java/lang/Exception
           2    15    15   any
}
当finally块中不存在return时
public class org.TryCatch.TryCatch {
  public org.TryCatch.TryCatch();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       //try块
       0: iconst_0
       1: istore_1
       2: bipush        11
       4: istore_1
        //复制一份finally块中的代码
       5: bipush        33
       7: istore_1
       //try最后返回
       8: return
       //catch块
       9: astore_2
      10: bipush        22
      //复制一份finally块中的代码
      12: istore_1
      13: bipush        33
      15: istore_1
      //catch最后返回
      16: return
      //finally块
      17: astore_3
      18: bipush        33
      20: istore_1
      21: aload_3
      22: athrow
    Exception table:
       from    to  target type
           2     5     9   Class java/lang/Exception
           2     5    17   any
           9    13    17   any
}

```
1 . 从以上两段字节码可以看出，当finally和try中都存在return语句时，try中指令执行完后会跳转到finally，执行finally块中的指令，最后执行finally块中的return指令，注意这里不会再跳转到try中执行try块中的return指令. 
2 . 当只有try中存在return语句时，try会复制一份finally中的指令到try中执行。 
3 . catch和try的处理相同。

```java

//三个语句块中都不存在return时
public static void main(java.lang.String[]);
    Code:
    //try
       0: iconst_0
       1: istore_1
       2: bipush        11
       4: istore_1
       5: goto          24
       //catch
       8: astore_2
       9: bipush        22
       //复制finally中的语句
      11: istore_1
      12: bipush        33
      14: istore_1
      15: goto          27
      //finally
      18: astore_3
      19: bipush        33
      21: istore_1
      22: aload_3
      23: athrow
      //为什么多这个？？
      24: bipush        33
      26: istore_1
      //自动添加return
      27: return

```
三个语句块中都不存在return时 
1. try中执行完会跳转去执行finally的指令 ，再执行try-catch-finally之后的指令，最后执行return指令结束方法。 
2. 如果出现异常，catch中会复制一份finally的指令，执行完后跳转到27: return结束方法。




<a id="markdown-126-注解" name="126-注解"></a>
### 1.2.6. 注解
<a href="#menu" style="float:right">目录</a>

**概念定义**
* 注解
    * 提供一种为程序元素设置元数据的方法
* 基本原则
    * 注解不能够直接干扰程序代码的运行，无论增加或者删除注解。代码都能够正常运行
* 注解分类
    * 标注注解,没有元素的注解
    * 单值注解
    * 完整注解
* 元数据
    * 就是关于数据的数据
    * 作用
        * 编写文档：通过代码里标识的元数据生成文档
        * 代码分析:通过代码里标识的元数据对代码进行分析
        * 编译检查:通过代码里标识的元数据让编译器能实现基本的编译检查
* 标准注解
    * @Override
        * 保证编译的时候Override函数的声明正确
        * target：METHOD
    * @Deprecated
        * 标识该类或者方法，参数不再推荐使用，相当于过期，仍可以使用，但是不推荐使用
        * target：CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE
    * @SuppressWarnings
        * 关闭特定的警告信息
        * target：TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE
        * 参数
            * deprecation : 使用了过时的类或者方法时的警告  
            * unchecked :  执行了未检查时转换的警告
            * fallthrough :  当Switch程序块直接通往下一种情况而没有Break时的警告
            * path :  在类路径，源文件路径中有不存在的路径时的警告
            * serial  :  当在可序列化的类上缺少serialVersionUID定义时的警告  
            * finally : 任何finally子句不能正常完成时的警告 
            * all :  关于以上所有情况的警告
        * @SuppressWarnings(value={"deprecation"})

* 元注解
    * 负责注解其他注解
    * @Retention
        * 表示需要在什么级别保留该注解信息
        * SOURCE：注解仅保留在源代码中，在编译时被去掉
        * CLASS：保留在类级别，运行时不存在
        * RUNTIME: 保留到运行时
    * @Target
        * CONSTRUCTOR(构造器的声明), FIELD, LOCAL_VARIABLE(局部变量), METHOD, PACKAGE, PARAMETER（参数声明）, TYPE(类，接口)
    * @Documented
        * JavaDOC提取文档时，如果注解上有@Documented，那么被注解的对象（类，方法等）将显示该注解
    * @Inhertied
        * 允许子类继承父类中的注释
    * @Repeatable
        * 支持注解在同一个地方添加多个
        * 参数:Class<? extends Annotation> value();       
```java

//声明支持重复注解
@Repeatable(Persons.class)
public  @interface Person{
	String role() default "";
}
//多次使用
@Person(role="CEO")
@Person(role="husband")
@Person(role="father")
@Person(role="son")
public   class Man {
	String name="";
}

```

* 自定义注解
```java

@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.METHOD, ElementType.TYPE })
public @interface MyAnnotation {

    Integer age();
    //default设置默认值 xx 
    String color() default "xx"; 

    Class[] zlz;
}
//
@MyAnnotation(age=13,color="red",zlz={xx.class,xxx.class})
```

**AnnotatedElement**
* **简介**
    * 这个接口（AnnotatedElement）的对象代表了在当前JVM中的一个“被注解元素”（可以是Class，Method，Field，Constructor，Package等）。在Java语言中，所有实现了这个接口的“元素”都是可以“被注解的元素”。使用这个接口中声明的方法可以读取（通过Java的反射机制）“被注解元素”的注解。这个接口中的所有方法返回的注解都是不可变的、并且都是可序列化的。这个接口中所有方法返回的数组可以被调用者修改，而不会影响其返回给其他调用者的数组。
* **子接口**
    * AnnotatedArrayType （被注解的数组类型）
    * AnnotatedParameterizedType （被注解的参数化类型）
    * AnnotatedType （被注解的类型）
    * AnnotatedTypeVariable （被注解的类型变量）
    * AnnotatedWildcardType （被注解的通配类型）
    * GenericDeclaration （通用声明，用于表示声明型元素，如：类、方法、构造器等）
    * TypeVariable<D> （类型变量）

* **其实现类**
    * AccessibleObject（可访问对象，如：方法、构造器、属性等）
    * Class（类，就是你用Java语言编程时每天都要写的那个东西）
    * Constructor（构造器，类的构造方法的类型）
    * Executable（可执行的，如构造器和方法）
    * Field（属性，类中属性的类型）
    * Method（方法，类中方法的类型）
    * Package（包，你每天都在声明的包的类型）
    * Parameter（参数，主要指方法或函数的参数，其实是这些参数的类型）

以上类型对象都可以通过 AnnotatedElement相关方法获取注解信息
```java
public interface AnnotatedElement {

    default boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {}
    <T extends Annotation> T getAnnotation(Class<T> annotationClass);
    Annotation[] getAnnotations();
    default <T extends Annotation> T[] getAnnotationsByType(Class<T> annotationClass) {}
    default <T extends Annotation> T getDeclaredAnnotation(Class<T> annotationClass) { }
    default <T extends Annotation> T[] getDeclaredAnnotationsByType(Class<T> annotationClass) { }
    Annotation[] getDeclaredAnnotations();
}
```

<a id="markdown-13-io" name="13-io"></a>
## 1.3. IO
<a href="#menu" style="float:right">目录</a>

<a id="markdown-131-file" name="131-file"></a>
### 1.3.1. File
* File是java.io包下与平台无关的文件和目录操作类。
* File能改新建，删除和重命名文件和目录。
* File不能访问文件内容，访问文件内容使用相关的流操作类。
* 绝对路径: Linux：以根路径开头的路径(/xx/xx),WIN：以磁盘开头的路径(d://,c://)
* 相对路径: 相对当前项目的路径( pic/header)

**常用方法**
```java
//返回由此抽象路径名表示的文件或目录的名称。
public String getName()
//返回此抽象路径名的父路径名的路径名字符串，如果此路径名没有指定父目录，则返回 null。
public String getParent()、
//返回此抽象路径名的父路径名的抽象路径名，如果此路径名没有指定父目录，则返回 null。
public File getParentFile()
//将此抽象路径名转换为一个路径名字符串。
public String getPath()
//测试此抽象路径名是否为绝对路径名。
public boolean isAbsolute()
//返回抽象路径名的绝对路径名字符串。
public String getAbsolutePath()
//测试应用程序是否可以读取此抽象路径名表示的文件。
public boolean canRead()
//测试应用程序是否可以修改此抽象路径名表示的文件。
public boolean canWrite()
//测试此抽象路径名表示的文件或目录是否存在
public boolean exists()
//测试此抽象路径名表示的文件是否是一个目录。
public boolean isDirectory()
//测试此抽象路径名表示的文件是否是一个标准文件。
public boolean isFile()
//返回此抽象路径名表示的文件最后一次被修改的时间。
public long lastModified()
//返回由此抽象路径名表示的文件的长度。
public long length()
//当且仅当不存在具有此抽象路径名指定的名称的文件时，原子地创建由此抽象路径名指定的一个新的空文件。
public boolean createNewFile() throws IOException
// 删除此抽象路径名表示的文件或目录。
public boolean delete()
//在虚拟机终止时，请求删除此抽象路径名表示的文件或目录。
public void deleteOnExit()
//返回由此抽象路径名所表示的目录中的文件和目录的名称所组成字符串数组。
public String[] list()
//返回由包含在目录中的文件和目录的名称所组成的字符串数组，这一目录是通过满足指定过滤器的抽象路径名来表示的。
public String[] list(FilenameFilter filter)
 // 返回一个抽象路径名数组，这些路径名表示此抽象路径名所表示目录中的文件。
public File[] listFiles()
//返回表示此抽象路径名所表示目录中的文件和目录的抽象路径名数组，这些路径名满足特定过滤器。
public File[] listFiles(FileFilter filter)
//创建此抽象路径名指定的目录。
public boolean mkdir()
//创建此抽象路径名指定的目录，包括创建必需但不存在的父目录。
public boolean mkdirs()
 //重新命名此抽象路径名表示的文件。
public boolean renameTo(File dest)
//设置由此抽象路径名所指定的文件或目录的最后一次修改时间。
public boolean setLastModified(long time)
//标记此抽象路径名指定的文件或目录，以便只可对其进行读操作。
public boolean setReadOnly()
//在指定目录中创建一个新的空文件，使用给定的前缀和后缀字符串生成其名称。
public static File createTempFile(String prefix, String suffix, File directory) throws IOException
//在默认临时文件目录中创建一个空文件，使用给定前缀和后缀生成其名称。
public static File createTempFile(String prefix, String suffix) throws IOException
//按字母顺序比较两个抽象路径名。
public int compareTo(File pathname)
//按字母顺序比较抽象路径名与给定对象。
public int compareTo(Object o)
//测试此抽象路径名与给定对象是否相等。
public boolean equals(Object obj)
 //返回此抽象路径名的路径名字符串。
public String toString()
```
**文件过滤器**
```java
public interface FilenameFilter {
    /**
     * Tests if a specified file should be included in a file list.
     *
     * @param   dir    the directory in which the file was found.
     * @param   name   the name of the file.
     * @return  <code>true</code> if and only if the name should be
     * included in the file list; <code>false</code> otherwise.
     */
    boolean accept(File dir, String name);
}
@FunctionalInterface
public interface FileFilter {

    /**
     * Tests whether or not the specified abstract pathname should be
     * included in a pathname list.
     *
     * @param  pathname  The abstract pathname to be tested
     * @return  <code>true</code> if and only if <code>pathname</code>
     *          should be included
     */
    boolean accept(File pathname);
}
//File获取文件列表时添加过滤器
public File[] listFiles(FileFilter filter) ;
public File[] listFiles(FilenameFilter filter)
```
<a id="markdown-1311-io流" name="1311-io流"></a>
#### 1.3.1.1. IO流

**流的概念和作用**

流是一组有顺序的，有起点和终点的字节集合，是对数据传输的总称或抽象。即数据在两设备间的传输称为流，流的本质是数据传输，根据数据传输特性将流抽象为各种类，方便更直观的进行数据操作。 

**IO流的分类**
根据处理数据类型的不同分为：字符流和字节流
根据数据流向不同分为：输入流和输出流
 
**字符流和字节流**
字符流的由来： 因为数据编码的不同，而有了对字符进行高效操作的流对象。本质其实就是基于字节流读取时，去查了指定的码表。 字节流和字符流的区别：
* 读写单位不同：字节流以字节（8bit）为单位，字符流以字符为单位，根据码表映射字符，一次可能读多个字节。
* 处理对象不同：字节流能处理所有类型的数据（如图片、avi等），而字符流只能处理字符类型的数据。
* 结论：只要是处理纯文本数据，就优先考虑使用字符流。 除此之外都使用字节流。

**输入流和输出流**
对输入流只能进行读操作，对输出流只能进行写操作，程序中需要根据待传输数据的不同特性而使用不同的流。  

**节点流和处理流**
* 节点流
    * 可以从一个特定的IO设备(磁盘，网络)读写数据的流，称为节点流
    * 当使用节点流来进行输入输出时，程序直接连接到实际的数据源，和实际的输入输出节点连接
* 处理流
    * 对一个已存在的流进行连接或封装，通过封装后实现数据的读写
    * 当使用处理流来进行输入输出时，程序并不会直接连接到实际的数据源，没有和实际的输入输出节点连接
    * 只要使用相同的处理流，程序就可以采用完全相同的输入输出代码访问不同的数据源，相当于做了顶层封装，提供公共的访问接口。
    


|分类|字节输入流|字节输出流|字符输入流|字符输出流|
|---|---|---|---|---|
|抽象基类|InputStream|OutputStream|Reader|Writer|
|访问文件|FileInputStream|FileOutoutStream|FileReader|FileWriter|
|访问数组|ByteArrayInputStream|ByteArrayOutputStream|CharArrayReader|CharArrayWriter|
|访问管道|PipedInputStream|PipedOutputStream|PipedReader|PipedWriter|
|访问字符串|||StringReader|StringWriter|
|缓冲流|BufferedInputStream|BufferedOutputStream|BufferedReader|BufferedWriter|
|转换流|||InputStreamReader|OutputStreamWriter|
|对象流|ObjectInputStream|ObjectOutputStream|||
|抽象基类|FilterInputStream|FilterOutputStream|FilterReader|FilterWriter|
|打印流||PrintOutputStream||PrintWriter|
|推回输入流|PushbackInputStream||PushbackOutputStream||
|特殊流|DataInputStream|DataOutputStream|||

**输出追加内容**

append 参数控制，默认是不追加，写入文件时全部覆盖。
```java
public FileOutputStream(String name, boolean append)
        throws FileNotFoundException
{
    this(name != null ? new File(name) : null, append);
}

```
**关闭输出流**
* 不要忘记关闭输出流
* 关闭输出流可以保证物理资源被回
* 还可以将输出流缓冲区中的数据flush到物理节点中
* Java很多输出流默认都提供了缓冲功能

**什么时候使用字节流、什么时候使用字符流，二者的区别**
* 在程序中所有的数据都是以流的方式进行传输或保存的，程序需要数据的时候要使用输入流读取数据，而当程序需要将一些数据保存起来的时候，就要使用输出流完成。
* InputStream 和OutputStream,两个是为字节流设计的,主要用来处理字节或二进制对象,
* Reader和 Writer.两个是为字符流（一个字符占两个字节）设计的,主要用来处理字符或字符串.
 
* 字符流处理的单元为2个字节的Unicode字符，操作字符、字符数组或字符串，
字节流处理单元为1个字节，操作字节和字节数组。
所以字符流是由Java虚拟机将字节转化为2个字节的Unicode字符为单位的字符而成的，
所以它对多国语言支持性比较好！
如果是音频文件、图片、歌曲，就用字节流好点，
如果是关系到中文（文本）的，用字符流好点


* 所有文件的储存是都是字节（byte）的储存，在磁盘上保留的并不是文件的字符而是先把字符编码成字节，再储存这些字节到磁盘。在读取文件（特别是文本文件）时，也是一个字节一个字节地读取以形成字节序列
字节流可用于任何类型的对象，包括二进制对象，而字符流只能处理字符或者字符串；
字节流提供了处理任何类型的IO操作的功能，但它不能直接处理Unicode字符，而字符流就可以
* 字节流是最基本的，所有的InputStrem和OutputStream的子类都是,主要用在处理二进制数据，它是按字节来处理的,但实际中很多的数据是文本，又提出了字符流的概念，它是按虚拟机的encode来处理，也就是要进行字符集的转化 .这两个之间通过 InputStreamReader,OutputStreamWriter来关联，实际上是通过byte[]和String来关联 .在实际开发中出现的汉字问题实际上都是在字符流和字节流之间转化不统一而造成的 


* Reader类的read()方法返回类型为int ：作为整数读取的字符（占两个字节共16位），范围在 0 到 65535 之间 (0x00-0xffff)，如果已到达流的末尾，则返回 -1

* inputStream的read()虽然也返回int，但由于此类是面向字节流的，一个字节占8个位，所以返回 0 到 255 范围内的 int 字节值。如果因为已经到达流末尾而没有可用的字节，则返回值 -1。因此对于不能用0-255来表示的值就得用字符流来读取！比如说汉字.

* 字节流和字符流的主要区别是什么呢？
    * 字节流在操作时不会用到缓冲区（内存），是直接对文件本身进行操作的。而字符流在操作时使用了缓冲区，通过缓冲区再操作文件。
        *  我们知道，如果一个程序频繁对一个资源进行IO操作，效率会非常低。此时，通过缓冲区，先把需要操作的数据暂时放入内存中，以后直接从内存中读取数据，则可以避免多次的IO操作，提高效率
    * 在硬盘上的所有文件都是以字节形式存在的（图片，声音，视频），而字符值在内存中才会形成。
        * 真正存储和传输数据时都是以字节为单位的，字符只是存在与内存当中的，所以，字节流适用范围更为宽广

**缓冲流**
BufferedInputStream和BufferedOutputStream这两个类分别是FilterInputStream和FilterOutputStream的子类，作为装饰器子类，使用它们可以防止每次读取/发送数据时进行实际的写操作，代表着使用缓冲区。

我们有必要知道不带缓冲的操作，每读一个字节就要写入一个字节，由于涉及磁盘的IO操作相比内存的操作要慢很多，所以不带缓冲的流效率很低。带缓冲的流，可以一次读很多字节，但不向磁盘中写入，只是先放到内存里。等凑够了缓冲区大小的时候一次性写入磁盘，这种方式可以减少磁盘操作次数，速度就会提高很多！

同时正因为它们实现了缓冲功能，所以要注意在使用BufferedOutputStream写完数据后，要调用flush()方法或close()方法，强行将缓冲区中的数据写出。否则可能无法写出数据。与之相似还BufferedReader和BufferedWriter两个类。

**RandomAccessFile**
* 除了常规的读写功能，还支持任意位置读写内容
* long getFilePointer(); 返回文件记录指针的当前位置
* void seek(long pos); 将文件指针定位到pos 
* 支持读和写
    * RandomAccessFile(String name, String mode)
    * mode : 
        * r :以只读方式打开文件 
        * rw : 以读写方式打开文件
        * rws : 除了rw,还要求对文件的内容或者元数据的每个更新都同步写入到底层存储设备
        * rwd : 除了rw,还要求对文件内容的每个更新都同步写入到底层的存储设备。
* 如果seek 定位后写入内容，将会覆盖后续内容，如果需要实现插入写，需要先读出后面的内容，写入之后再追加写入读出的内容。
  
<a id="markdown-1312-序列化" name="1312-序列化"></a>
#### 1.3.1.2. 序列化
* 序列化
    * 将对象转化为二进制字节数组，以方便存储到磁盘或者进行网络传输
* 反序列化
    * 将二进制字节数组转化为对象

* 需要序列化的对象必须实现Serializable接口
* transient 修饰的属性不会被序列化
* 引用类型的属性只有也实现Serializable接口才会被序列化
* 自定义序列化属性,对象类加入以下方法
    * private void writeObject（ObjectOutputStream out） throws IOException;
        * out.writeInt(this.name);
    * private void readObject（ObjectInputStream in throws IOException;
        * this.name = in.readInt();
    * private void readObjectNoData（ObjectInputStream in throws IOException;
        * 当序列化版本不一致，流被更改等情况，掉用该方法提供默认值。
    * 属性读写顺序必须一致，否则会出现问题
* serialVersionUID
    * 对象的序列化版本ID，可设置任何值
    * 如果不显示指定，JVM将根据类的相关信息进行修改，修改后的类的计算结果可能和之前的不一样，就会导致序列化失败，因此显示指定版本ID，并根据以下情况决定当类信息修改时是否更新序列化ID
        * 仅仅修改了方法，不会影响反序列化
        * 修改了类静态属性或瞬态属性，不会影响反序列化
        * 如果修改了**非类静态属性或瞬态属性**,如果新增属性，不会影响，如果修改之前的属性，将会影响，反序列化时将会失败，应当修改serialVersionUID。
    * 如果序列化版本ID和当前类中的ID不一样，那么序列化将会失败

* 注意点
    * 对象的类名，属性（包括基本类型，数组，对其他对象的引用）都会被序列化，static,transient属性不会被序列化
    * 反序列化时该JVM必须有该类类文件，否则将抛出异常
    


**方式1:实现Serializable**


```java
public class Person implements  Serializable{
    
}
```

**方式2:实现Externalizable**

强制自定义序列化方式，需要程序员决定需要序列化哪些属性

```java
public class Person implements  Externalizable{

    private String name = null;

    transient private Integer age = null;

    private Gender gender = null;

    public Person() {
        System.out.println("none-arg constructor");
    }

    public Person(String name, Integer age, Gender gender) {
        System.out.println("arg constructor");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //自定义
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //自定义
    }
    
}
```
**序列化操作**
```java
Person person = new Person();
FileOutputStream fs = new FileOutputStream("foo.ser");  
ObjectOutputStream os =  new ObjectOutputStream(fs);  
os.writeObject(person);  

```

<a id="markdown-132-nio" name="132-nio"></a>
### 1.3.2. NIO

<a id="markdown-1321-内存映射" name="1321-内存映射"></a>
#### 1.3.2.1. 内存映射  

内存映射的方式是指操作系统将内存中的某一块区域与磁盘中的文件相关联，当访问内存中的一段数据时，转换为访问文件的某一段数据。这种方式的目的同样是减少数据从内核空间缓存到用户空间缓存的数据复制操作，因为这两个空间的数据是共享的。


![内存映射方式](https://github.com/lgjlife/Java-Study/blob/master/pic/java/nio-storage-mapping.png?raw=true)


Java类库中的NIO包相对于IO 包来说有一个新功能是内存映射文件，日常编程中并不是经常用到，但是在处理大文件时是比较理想的提高效率的手段。本文我主要想结合操作系统中（OS）相关方面的知识介绍一下原理。

在传统的文件IO操作中，我们都是调用操作系统提供的底层标准IO系统调用函数  read()、write() ，此时调用此函数的进程（在JAVA中即java进程）由当前的用户态切换到内核态，然后OS的内核代码负责将相应的文件数据读取到内核的IO缓冲区，然后再把数据从内核IO缓冲区拷贝到进程的私有地址空间中去，这样便完成了一次IO操作。至于为什么要多此一举搞一个内核IO缓冲区把原本只需一次拷贝数据的事情搞成需要2次数据拷贝呢？ 我想学过操作系统或者计算机系统结构的人都知道，这么做是为了减少磁盘的IO操作，为了提高性能而考虑的，因为我们的程序访问一般都带有局部性，也就是所谓的局部性原理，在这里主要是指的空间局部性，即我们访问了文件的某一段数据，那么接下去很可能还会访问接下去的一段数据，由于磁盘IO操作的速度比直接访问内存慢了好几个数量级，所以OS根据局部性原理会在一次 read()系统调用过程中预读更多的文件数据缓存在内核IO缓冲区中，当继续访问的文件数据在缓冲区中时便直接拷贝数据到进程私有空间，避免了再次的低效率磁盘IO操作。在JAVA中当我们采用IO包下的文件操作流，如：

```JAVA
FileInputStream in = new FileInputStream("D:\\java.txt");  
in.read();
```

JAVA虚拟机内部便会调用OS底层的 read()系统调用完成操作，如上所述，在第二次调用 in.read()的时候可能就是从内核缓冲区直接返回数据了（可能还有经过 native堆做一次中转，因为这些函数都被声明为 native，即本地平台相关，所以可能在C代码中有做一次中转，如 win32中是通过 C代码从OS读取数据，然后再传给JVM内存）。既然如此，JAVA的IO包中为啥还要提供一个 BufferedInputStream 类来作为缓冲区呢。关键在于四个字，"系统调用"！当读取OS内核缓冲区数据的时候，便发起了一次系统调用操作（通过native的C函数调用），而系统调用的代价相对来说是比较高的，涉及到进程用户态和内核态的上下文切换等一系列操作，所以我们经常采用如下的包装：

```JAVA
FileInputStream in = new FileInputStream("D:\\java.txt"); 
BufferedInputStream buf_in = new BufferedInputStream(in); 
buf_in.read();
```

这样一来，我们每一次 buf_in.read() 时候，BufferedInputStream 会根据情况自动为我们预读更多的字节数据到它自己维护的一个内部字节数组缓冲区中，这样我们便可以减少系统调用次数，从而达到其缓冲区的目的。所以要明确的一点是 BufferedInputStream 的作用不是减少 磁盘IO操作次数（这个OS已经帮我们做了），而是通过减少系统调用次数来提高性能的。同理 BufferedOuputStream , BufferedReader/Writer 也是一样的。在 C语言的函数库中也有类似的实现，如 fread()，这个函数就是 C语言中的缓冲IO，作用与BufferedInputStream()相同.

    这里简单的引用下JDK6 中 BufferedInputStream 的源码验证下：

```JAVA
 1 public  
 2 class BufferedInputStream extends FilterInputStream {  
 3   
 4     private static int defaultBufferSize = 8192;  
 5   
 6     /** 
 7      * The internal buffer array where the data is stored. When necessary, 
 8      * it may be replaced by another array of 
 9      * a different size. 
10      */  
11     protected volatile byte buf[];  
12   /** 
13      * The index one greater than the index of the last valid byte in  
14      * the buffer.  
15      * This value is always 
16      * in the range <code>0</code> through <code>buf.length</code>; 
17      * elements <code>buf[0]</code>  through <code>buf[count-1] 
18      * </code>contain buffered input data obtained 
19      * from the underlying  input stream. 
20      */  
21     protected int count;  
22   
23     /** 
24      * The current position in the buffer. This is the index of the next  
25      * character to be read from the <code>buf</code> array.  
26      * <p> 
27      * This value is always in the range <code>0</code> 
28      * through <code>count</code>. If it is less 
29      * than <code>count</code>, then  <code>buf[pos]</code> 
30      * is the next byte to be supplied as input; 
31      * if it is equal to <code>count</code>, then 
32      * the  next <code>read</code> or <code>skip</code> 
33      * operation will require more bytes to be 
34      * read from the contained  input stream. 
35      * 
36      * @see     java.io.BufferedInputStream#buf 
37      */  
38     protected int pos;  
39   
40  /* 这里省略去 N 多代码 ------>>  */  
41   
42   /** 
43      * See 
44      * the general contract of the <code>read</code> 
45      * method of <code>InputStream</code>. 
46      * 
47      * @return     the next byte of data, or <code>-1</code> if the end of the 
48      *             stream is reached. 
49      * @exception  IOException  if this input stream has been closed by 
50      *              invoking its {@link #close()} method, 
51      *              or an I/O error occurs.  
52      * @see        java.io.FilterInputStream#in 
53      */  
54     public synchronized int read() throws IOException {  
55     if (pos >= count) {  
56         fill();  
57         if (pos >= count)  
58         return -1;  
59     }  
60     return getBufIfOpen()[pos++] & 0xff;  
61     } 
```
 我们可以看到，BufferedInputStream 内部维护着一个 字节数组 byte[] buf 来实现缓冲区的功能，我们调用的  buf_in.read() 方法在返回数据之前有做一个 if 判断，如果 buf 数组的当前索引不在有效的索引范围之内，即 if 条件成立， buf 字段维护的缓冲区已经不够了，这时候会调用 内部的 fill() 方法进行填充，而fill()会预读更多的数据到 buf 数组缓冲区中去，然后再返回当前字节数据，如果 if 条件不成立便直接从 buf缓冲区数组返回数据了。其中getBufIfOpen()返回的就是 buf字段的引用。顺便说下，源码中的 buf 字段声明为  protected volatile byte buf[];  主要是为了通过 volatile 关键字保证 buf数组在多线程并发环境中的内存可见性.

和 Java NIO 的内存映射无关的部分说了这么多篇幅，主要是为了做个铺垫，这样才能建立起一个知识体系，以便更好的理解内存映射文件的优点。

内存映射文件和之前说的 标准IO操作最大的不同之处就在于它虽然最终也是要从磁盘读取数据，但是它并不需要将数据读取到OS内核缓冲区，而是直接将进程的用户私有地址空间中的一部分区域与文件对象建立起映射关系，就好像直接从内存中读、写文件一样，速度当然快了。为了说清楚这个，我们以 Linux操作系统为例子，看下图：
![](https://images2015.cnblogs.com/blog/1025117/201703/1025117-20170317110759276-1661554576.jpg)
    

 此图为 Linux 2.X 中的进程虚拟存储器，即进程的虚拟地址空间，如果你的机子是 32 位，那么就有  2^32 = 4G的虚拟地址空间，我们可以看到图中有一块区域： “Memory mapped region for shared libraries” ，这段区域就是在内存映射文件的时候将某一段的虚拟地址和文件对象的某一部分建立起映射关系，此时并没有拷贝数据到内存中去，而是当进程代码第一次引用这段代码内的虚拟地址时，触发了缺页异常，这时候OS根据映射关系直接将文件的相关部分数据拷贝到进程的用户私有空间中去，当有操作第N页数据的时候重复这样的OS页面调度程序操作。注意啦，原来内存映射文件的效率比标准IO高的重要原因就是因为少了把数据拷贝到OS内核缓冲区这一步（可能还少了native堆中转这一步）。

java中提供了3种内存映射模式，即：只读(readonly)、读写(read_write)、专用(private) ，对于  只读模式来说，如果程序试图进行写操作，则会抛出ReadOnlyBufferException异常；第二种的读写模式表明了通过内存映射文件的方式写或修改文件内容的话是会立刻反映到磁盘文件中去的，别的进程如果共享了同一个映射文件，那么也会立即看到变化！而不是像标准IO那样每个进程有各自的内核缓冲区，比如JAVA代码中，没有执行 IO输出流的 flush() 或者  close() 操作，那么对文件的修改不会更新到磁盘去，除非进程运行结束；最后一种专用模式采用的是OS的“写时拷贝”原则，即在没有发生写操作的情况下，多个进程之间都是共享文件的同一块物理内存（进程各自的虚拟地址指向同一片物理地址），一旦某个进程进行写操作，那么将会把受影响的文件数据单独拷贝一份到进程的私有缓冲区中，不会反映到物理文件中去。

 

在JAVA NIO中可以很容易的创建一块内存映射区域，代码如下：
```JAVA
1 File file = new File("E:\\download\\office2007pro.chs.ISO");  
2 FileInputStream in = new FileInputStream(file);  
3 FileChannel channel = in.getChannel();  
4 MappedByteBuffer buff = channel.map(FileChannel.MapMode.READ_ONLY, 0,channel.size());
```

这里创建了一个只读模式的内存映射文件区域，接下来我就来测试下与普通NIO中的通道操作相比性能上的优势，先看如下代码：

```JAVA
 1 public class IOTest {  
 2     static final int BUFFER_SIZE = 1024;  
 3   
 4     public static void main(String[] args) throws Exception {  
 5   
 6         File file = new File("F:\\aa.pdf");  
 7         FileInputStream in = new FileInputStream(file);  
 8         FileChannel channel = in.getChannel();  
 9         MappedByteBuffer buff = channel.map(FileChannel.MapMode.READ_ONLY, 0,  
10                 channel.size());  
11   
12         byte[] b = new byte[1024];  
13         int len = (int) file.length();  
14   
15         long begin = System.currentTimeMillis();  
16   
17         for (int offset = 0; offset < len; offset += 1024) {  
18   
19             if (len - offset > BUFFER_SIZE) {  
20                 buff.get(b);  
21             } else {  
22                 buff.get(new byte[len - offset]);  
23             }  
24         }  
25   
26         long end = System.currentTimeMillis();  
27         System.out.println("time is:" + (end - begin));  
28   
29     }  
30 } 
```

输出为 63，即通过内存映射文件的方式读取 86M多的文件只需要78毫秒，我现在改为普通NIO的通道操作看下：

```JAVA
 1 File file = new File("F:\\liq.pdf");  
 2 FileInputStream in = new FileInputStream(file);  
 3 FileChannel channel = in.getChannel();  
 4 ByteBuffer buff = ByteBuffer.allocate(1024);   
 5   
 6 long begin = System.currentTimeMillis();  
 7 while (channel.read(buff) != -1) {  
 8     buff.flip();  
 9     buff.clear();  
10 }  
11 long end = System.currentTimeMillis();  
12 System.out.println("time is:" + (end - begin));  
```

输出为 468毫秒，几乎是 6 倍的差距，文件越大，差距便越大。所以内存映射文件特别适合于对大文件的操作，JAVA中的限制是最大不得超过 Integer.MAX_VALUE，即2G左右，不过我们可以通过分次映射文件(channel.map)的不同部分来达到操作整个文件的目的。

按照jdk文档的官方说法，内存映射文件属于JVM中的直接缓冲区，还可以通过 ByteBuffer.allocateDirect() ，即DirectMemory的方式来创建直接缓冲区。他们相比基础的 IO操作来说就是少了中间缓冲区的数据拷贝开销。同时他们属于JVM堆外内存，不受JVM堆内存大小的限制。

 

其中 DirectMemory 默认的大小是等同于JVM最大堆，理论上说受限于 进程的虚拟地址空间大小，比如 32位的windows上，每个进程有4G的虚拟空间除去 2G为OS内核保留外，再减去 JVM堆的最大值，剩余的才是DirectMemory大小。通过 设置 JVM参数 -Xmx64M，即JVM最大堆为64M，然后执行以下程序可以证明DirectMemory不受JVM堆大小控制：

```JAVA
1 public static void main(String[] args) {       
2     ByteBuffer.allocateDirect(1024*1024*100); // 100MB  
3 } 
``` 
我们设置了JVM堆 64M限制，然后在 直接内存上分配了 100MB空间，程序执行后直接报错：Exception in thread "main" java.lang.OutOfMemoryError: Direct buffer memory。接着我设置 -Xmx200M，程序正常结束。然后我修改配置： -Xmx64M  -XX:MaxDirectMemorySize=200M，程序正常结束。因此得出结论： 直接内存DirectMemory的大小默认为 -Xmx 的JVM堆的最大值，但是并不受其限制，而是由JVM参数 MaxDirectMemorySize单独控制。接下来我们来证明直接内存不是分配在JVM堆中。我们先执行以下程序，并设置 JVM参数 -XX:+PrintGC，

```JAVA
1 public static void main(String[] args) {         
2  for(int i=0;i<20000;i++) {  
3            ByteBuffer.allocateDirect(1024*100);  //100K  
4       }  
5   } 
```

```
[GC 1371K->1328K(61312K), 0.0070033 secs]
[Full GC 1328K->1297K(61312K), 0.0329592 secs]
[GC 3029K->2481K(61312K), 0.0037401 secs]
[Full GC 2481K->2435K(61312K), 0.0102255 secs]
```
   我们看到这里执行 GC的次数较少，但是触发了 两次 Full GC，原因在于直接内存不受 GC(新生代的Minor GC)影响，只有当执行老年代的 Full GC时候才会顺便回收直接内存！而直接内存是通过存储在JVM堆中的DirectByteBuffer对象来引用的，所以当众多的DirectByteBuffer对象从新生代被送入老年代后才触发了 full gc。

 再看直接在JVM堆上分配内存区域的情况：
```JAVA
1 public static void main(String[] args) {         
2     for(int i=0;i<10000;i++) {  
3           ByteBuffer.allocate(1024*100);  //100K  
4     }
5 }  
```

ByteBuffer.allocate 意味着直接在 JVM堆上分配内存，所以受 新生代的 Minor GC影响，输出如下：

```
[GC 16023K->224K(61312K), 0.0012432 secs]
[GC 16211K->192K(77376K), 0.0006917 secs]
[GC 32242K->176K(77376K), 0.0010613 secs]
[GC 32225K->224K(109504K), 0.0005539 secs]
[GC 64423K->192K(109504K), 0.0006151 secs]
[GC 64376K->192K(171392K), 0.0004968 secs]
[GC 128646K->204K(171392K), 0.0007423 secs]
[GC 128646K->204K(299968K), 0.0002067 secs]
[GC 257190K->204K(299968K), 0.0003862 secs]
[GC 257193K->204K(287680K), 0.0001718 secs]
[GC 245103K->204K(276480K), 0.0001994 secs]
[GC 233662K->204K(265344K), 0.0001828 secs]
[GC 222782K->172K(255232K), 0.0001998 secs]
[GC 212374K->172K(245120K), 0.0002217 secs]
```

可以看到，由于直接在 JVM堆上分配内存，所以触发了多次GC，且不会触及  Full GC，因为对象根本没机会进入老年代。


我想提个疑问，NIO中的DirectMemory和内存文件映射同属于直接缓冲区，但是前者和 -Xmx和-XX:MaxDirectMemorySize有关，而后者完全没有JVM参数可以影响和控制，这让我不禁怀疑两者的直接缓冲区是否相同，前者指的是 JAVA进程中的 native堆，即涉及底层平台如 win32的dll 部分，因为 C语言中的 malloc()分配的内存就属于 native堆，不属于 JVM堆，这也是DirectMemory能在一些场景中显著提高性能的原因，因为它避免了在 native堆和jvm堆之间数据的来回复制；而后者则是没有经过 native堆，是由 JAVA进程直接建立起 某一段虚拟地址空间和文件对象的关联映射关系，参见 Linux虚拟存储器图中的 “Memory mapped region for shared libraries”  区域，所以内存映射文件的区域并不在JVM GC的回收范围内，因为它本身就不属于堆区，卸载这部分区域只能通过系统调用 unmap()来实现 (Linux)中，而 JAVA API 只提供了 FileChannel.map 的形式创建内存映射区域，却没有提供对应的 unmap()，让人十分费解，导致要卸载这部分区域比较麻烦。

最后再试试通过 DirectMemory来操作前面 内存映射和基本通道操作的例子，来看看直接内存操作的话，程序的性能如何：

```JAVA
 1 File file = new File("F:\\liq.pdf");  
 2 FileInputStream in = new FileInputStream(file);  
 3 FileChannel channel = in.getChannel();  
 4 ByteBuffer buff = ByteBuffer.allocateDirect(1024);   
 5   
 6 long begin = System.currentTimeMillis();  
 7 while (channel.read(buff) != -1) {  
 8     buff.flip();  
 9     buff.clear();  
10 }  
11 long end = System.currentTimeMillis();  
12 System.out.println("time is:" + (end - begin));
```

程序输出为 312毫秒，看来比普通的NIO通道操作（468毫秒）来的快，但是比 mmap 内存映射的 63秒差距太多了，我想应该不至于吧，通过修改;ByteBuffer buff = ByteBuffer.allocateDirect(1024);  为 ByteBuffer buff = ByteBuffer.allocateDirect((int)file.length())，即一次性分配整个文件长度大小的堆外内存，最终输出为 78毫秒，由此可以得出两个结论：
1.堆外内存的分配耗时比较大.   
2.还是比mmap内存映射来得慢，都不要说通过mmap读取数据的时候还涉及缺页异常、页面调度的系统调用了，看来内存映射文件确实NB啊，这还只是 86M的文件，如果上 G 的大小呢？

最后一点为 DirectMemory的内存只有在 JVM执行 full gc 的时候才会被回收，那么如果在其上分配过大的内存空间，那么也将出现 OutofMemoryError，即便 JVM 堆中的很多内存处于空闲状态。


<a id="markdown-14-javac编译原理" name="14-javac编译原理"></a>
## 1.4. Javac编译原理
<a href="#menu" style="float:right">目录</a>

* Javac是一种编译器，将Java源码编译成Java字节码。.Java文件转化成。class文件。
* 经过以下流程
    * 词法分析器
        * 将Java源文件的字符流 转变成对应的Token流
    * 语法分析器
        * 将Token流组建成更加结构化的语法树
    * 语义分析器
<a id="markdown-141-javac编译器的基本结构" name="141-javac编译器的基本结构"></a>
### 1.4.1. Javac编译器的基本结构
<a href="#menu" style="float:right">目录</a>

<a id="markdown-142-javac的工作原理分析" name="142-javac的工作原理分析"></a>
### 1.4.2. Javac的工作原理分析
<a href="#menu" style="float:right">目录</a>


<a id="markdown-15-类加载和反射" name="15-类加载和反射"></a>
## 1.5. 类加载和反射
<a href="#menu" style="float:right">目录</a>

<a id="markdown-151-class文件结构" name="151-class文件结构"></a>
### 1.5.1. Class文件结构
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1511-jvm指令集简介" name="1511-jvm指令集简介"></a>
#### 1.5.1.1. JVM指令集简介
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1512-class文件头的表示形式" name="1512-class文件头的表示形式"></a>
#### 1.5.1.2. class文件头的表示形式
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1513-常量池" name="1513-常量池"></a>
#### 1.5.1.3. 常量池
<a href="#menu" style="float:right">目录</a>


<a id="markdown-1514-类信息" name="1514-类信息"></a>
#### 1.5.1.4. 类信息
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1515-fields和method定义" name="1515-fields和method定义"></a>
#### 1.5.1.5. Fields和Method定义
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1516-类属性描述" name="1516-类属性描述"></a>
#### 1.5.1.6. 类属性描述
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1517-javap生成的class文件结构" name="1517-javap生成的class文件结构"></a>
#### 1.5.1.7. Javap生成的class文件结构
<a href="#menu" style="float:right">目录</a>

javap用法

```bash
lgj@lgj-Lenovo-G470:~/aProject/aRealPrj/Java-Interview$ javap --help
Usage: javap <options> <classes>
where possible options include:
  -help  --help  -?        Print this usage message
  -version                 Version information
  -v  -verbose             Print additional information
  -l                       Print line number and local variable tables
  -public                  Show only public classes and members
  -protected               Show protected/public classes and members
  -package                 Show package/protected/public classes
                           and members (default)
  -p  -private             Show all classes and members
  -c                       Disassemble the code
  -s                       Print internal type signatures
  -sysinfo                 Show system info (path, size, date, MD5 hash)
                           of class being processed
  -constants               Show final constants
  -classpath <path>        Specify where to find user class files
  -cp <path>               Specify where to find user class files
  -bootclasspath <path>    Override location of bootstrap class files

```

源代码
```java
package com.code.base.javap;

public class JavapTest {

    private  String name;

    private  Integer age;


    public Integer func1(){

        int aaa;

        int bbb = 123;

        try{
            System.out.println("func1");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            System.out.println("finally");
        }

        return 12;

    }


    public void func2(){
        System.out.println("func2");
    }


    public static void   func3(){
        System.out.println("func3");
    }
}


```
javap -c 
类文件
```
Compiled from "JavapTest.java"
public class com.code.base.javap.JavapTest {
  public com.code.base.javap.JavapTest();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: sipush        456
       8: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      11: putfield      #3                  // Field age:Ljava/lang/Integer;
      14: return

  public java.lang.Integer func1();
    Code:
       0: bipush        123
       2: istore_2
       3: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
       6: ldc           #5                  // String func1
       8: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      11: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
      14: ldc           #7                  // String finally
      16: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      19: goto          51
      22: astore_3
      23: aload_3
      24: invokevirtual #9                  // Method java/lang/Exception.printStackTrace:()V
      27: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
      30: ldc           #7                  // String finally
      32: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      35: goto          51
      38: astore        4
      40: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
      43: ldc           #7                  // String finally
      45: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      48: aload         4
      50: athrow
      51: bipush        12
      53: invokestatic  #2                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      56: areturn
    Exception table:
       from    to  target type
           3    11    22   Class java/lang/Exception
           3    11    38   any
          22    27    38   any
          38    40    38   any

  public void func2();
    Code:
       0: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #10                 // String func2
       5: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return

  public static void func3();
    Code:
       0: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #11                 // String func3
       5: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return
}


```


<a id="markdown-152-类加载器" name="152-类加载器"></a>
### 1.5.2. 类加载器
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1521-基本概念" name="1521-基本概念"></a>
#### 1.5.2.1. 基本概念
<a href="#menu" style="float:right">目录</a>

类加载器是负责将可能是网络上、也可能是磁盘上的class文件加载到内存中。并为其生成对应的java.lang.class对象。一旦一个类被载入JVM了，同一个类就不会被再次加载。那么怎样才算是同一个类？在JAVA中一个类用其全限定类名（包名和类名）作为其唯一标识，但是在JVM中，一个类用其全限定类名和其类加载器作为其唯一标识。也就是说，在JAVA中的同一个类，如果用不同的类加载器加载，则生成的class对象认为是不同的。

**JAVA类装载方式**
* 隐式加载
    * 不通过在代码里调用ClassLoader来加载需要的类。而是通过JVM来自动加载需要的类到内存的方式
    * 例如，当我们在类中继承或者引用某个类时，JVM在解析当前这个类时发现引用的类不存在，那么就会自动将这些类加载到内存中。
* 显示加载
    * 显示调用ClassLoader的相关方法加载类

**类加载的动态性体现:**
一个应用程序总是由n多个类组成，Java程序启动时，并不是一次把所有的类全部加载后再运行，它总是先把保证程序运行的基础类一次性加载到jvm中，其它类等到jvm用到的时候再加载，这样的好处是节省了内存的开销，因为java最早就是为嵌入式系统而设计的，内存宝贵，这是一种可以理解的机制，而用到时再加载这也是java动态性的一种体现


<a id="markdown-1522-常见的类加载器" name="1522-常见的类加载器"></a>
#### 1.5.2.2. 常见的类加载器
<a href="#menu" style="float:right">目录</a>

* JDK 默认提供了如下几种ClassLoader
    * Bootstrp loader
        * Bootstrp加载器是用C++语言写的，它是在Java虚拟机启动后初始化的，它主要负责加载%JAVA_HOME%/jre/lib,-Xbootclasspath参数指定的路径以及%JAVA_HOME%/jre/classes中的类。
    * ExtClassLoader  
        * Bootstrp loader加载ExtClassLoader,并且将ExtClassLoader的父加载器设置为Bootstrp loader.ExtClassLoader是用Java写的，具体来说就是 sun.misc.Launcher$ExtClassLoader，ExtClassLoader主要加载%JAVA_HOME%/jre/lib/ext，此路径下的所有classes目录以及java.ext.dirs系统变量指定的路径中类库。
        * ExtClassLoader的父类不是Bootstrp loader
    * AppClassLoader 
        * Bootstrp loader加载完ExtClassLoader后，就会加载AppClassLoader,并且将AppClassLoader的父加载器指定为 ExtClassLoader。AppClassLoader也是用Java写成的，它的实现类是 sun.misc.Launcher$AppClassLoader，另外我们知道ClassLoader中有个getSystemClassLoader方法,此方法返回的正是AppclassLoader.AppClassLoader主要负责加载classpath所指定的位置的类或者是jar文档，它也是Java程序默认的类加载器。

![java类装载器](http://static.oschina.net/uploads/img/201405/09113619_cx03.png)

* 为什么要有三个类加载器
    * 一方面是分工，各自负责各自的区块，另一方面为了实现委托模型。

 类加载器之间是如何协调工作的

前面说了，java中有三个类加载器，问题就来了，碰到一个类需要加载时，它们之间是如何协调工作的，即java是如何区分一个类该由哪个类加载器来完成呢。 在这里java采用了委托模型机制，这个机制简单来讲，就是“类装载器有载入类的需求时，会先请示其Parent使用其搜索路径帮忙载入，如果Parent 找不到,那么才由自己依照自己的搜索路径搜索类”

下面举一个例子来说明，为了更好的理解，先弄清楚几行代码：

```Java
Public class Test{
 
    Public static void main(String[] arg){
 
      ClassLoader c  = Test.class.getClassLoader();  //获取Test类的类加载器
 
        System.out.println(c); 
 
      ClassLoader c1 = c.getParent();  //获取c这个类加载器的父类加载器
 
        System.out.println(c1);
 
      ClassLoader c2 = c1.getParent();//获取c1这个类加载器的父类加载器
 
        System.out.println(c2);
 
  }
 
}
```
运行结果：
```
……AppClassLoader……
 
……ExtClassLoader……
Null
``` 
可以看出Test是由AppClassLoader加载器加载的，AppClassLoader的Parent 加载器是 ExtClassLoader,但是ExtClassLoader的Parent为 null 是怎么回事呵，朋友们留意的话，前面有提到Bootstrap Loader是用C++语言写的，依java的观点来看，逻辑上并不存在Bootstrap Loader的类实体，所以在java程序代码里试图打印出其内容时，我们就会看到输出为null。


<a id="markdown-1523-类加载过程" name="1523-类加载过程"></a>
#### 1.5.2.3. 类加载过程
<a href="#menu" style="float:right">目录</a>

类装载器就是寻找类或接口字节码文件进行解析并构造JVM内部对象表示的组件，在java中类装载器把一个类装入JVM，经过以下步骤：
* 装载：查找和导入Class文件 
* 链接：其中解析步骤是可以选择的 
    * 检查：检查载入的class文件数据的正确性 
    * 准备：给类的静态变量分配存储空间 
    * 解析：将符号引用转成直接引用 
* 初始化：对静态变量，静态代码块执行初始化工作

类装载工作由ClassLoder和其子类负责。JVM在运行时会产生三个ClassLoader：根装载器，ExtClassLoader(扩展类装载器)和AppClassLoader，其中根装载器不是ClassLoader的子类，由C++编写，因此在java中看不到他，负责装载JRE的核心类库，如JRE目录下的rt.jar,charsets.jar等。ExtClassLoader是ClassLoder的子类，负责装载JRE扩展目录ext下的jar类包；AppClassLoader负责装载classpath路径下的类包，这三个类装载器存在父子层级关系****，即根装载器是ExtClassLoader的父装载器，ExtClassLoader是AppClassLoader的父装载器。默认情况下使用AppClassLoader装载应用程序的类

<a id="markdown-1524-全盘委托机制" name="1524-全盘委托机制"></a>
#### 1.5.2.4. 全盘委托机制
<a href="#menu" style="float:right">目录</a>

Java装载类使用“全盘负责委托机制”。“全盘负责”是指当一个ClassLoder装载一个类时，除非显示的使用另外一个ClassLoder，该类所依赖及引用的类也由这个ClassLoder载入；“委托机制”是指先委托父类装载器寻找目标类，只有在找不到的情况下才从自己的类路径中查找并装载目标类。这一点是从安全方面考虑的，试想如果一个人写了一个恶意的基础类（如java.lang.String）并加载到JVM将会引起严重的后果，但有了全盘负责制，java.lang.String永远是由根装载器来装载，避免以上情况发生 除了JVM默认的三个ClassLoder以外，第三方可以编写自己的类装载器，以实现一些特殊的需求。类文件被装载解析后，在JVM中都有一个对应的java.lang.Class对象，提供了类结构信息的描述。数组，枚举及基本数据类型，甚至void都拥有对应的Class对象。Class类没有public的构造方法，Class对象是在装载类时由JVM通过调用类装载器中的defineClass()方法自动构造的。

**为什么要使用这种双亲委托模式呢？**
因为这样可以避免重复加载，当父亲已经加载了该类的时候，就没有必要子ClassLoader再加载一次。
考虑到安全因素，我们试想一下，如果不使用这种委托模式，那我们就可以随时使用自定义的String来动态替代java核心api中定义类型，这样会存在非常大的安全隐患，而双亲委托的方式，就可以避免这种情况，因为String已经在启动时被加载，所以用户自定义类是无法加载一个自定义的ClassLoader。

**思考：假如我们自己写了一个java.lang.String的类，我们是否可以替换调JDK本身的类？**
答案是否定的。我们不能实现。为什么呢？我看很多网上解释是说双亲委托机制解决这个问题，其实不是非常的准确。因为双亲委托机制是可以打破的，你完全可以自己写一个classLoader来加载自己写的java.lang.String类，但是你会发现也不会加载成功，具体就是因为针对java.*开头的类，jvm的实现中已经保证了必须由bootstrp来加载。

<a id="markdown-1525-定义自已的classloader" name="1525-定义自已的classloader"></a>
#### 1.5.2.5. 定义自已的ClassLoader
<a href="#menu" style="float:right">目录</a>

* 有以下几个情景是值得我们花费时间实现自己的classLoader的:
    * 我们需要的类不一定存放在已经设置好的classPath下(有系统类加载器AppClassLoader加载的路径)，对于自定义路径中的class类文件的加载，我们需要自己的ClassLoader
    * 有时我们不一定是从类文件中读取类，可能是从网络的输入流中读取类，这就需要做一些加密和解密操作，这就需要自己实现加载类的逻辑，当然其他的特殊处理也同样适用。
    * 可以定义类的实现机制，实现类的热部署,如OSGi中的bundle模块就是通过实现自己的ClassLoader实现的。
 
* 定义自已的类加载器分为两步：
    * 继承java.lang.ClassLoader
    * 重写父类的findClass方法
 
父类有那么多方法，为什么偏偏只重写findClass方法？
```java
protected synchronized Class<?> loadClass ( String name , boolean resolve ) throws ClassNotFoundException{
    //检查指定类是否被当前类加载器加载过
    Class c = findLoadedClass(name);
    if( c == null ){//如果没被加载过，委派给父加载器加载
        try{
            if( parent != null )
                c = parent.loadClass(name,resolve);
            else 
                c = findBootstrapClassOrNull(name);
        }catch ( ClassNotFoundException e ){
            //如果父加载器无法加载
        }
        if( c == null ){//父类不能加载，由当前的类加载器加载
            c = findClass(name);
        }
    }
    if( resolve ){//如果要求立即链接，那么加载完类直接链接
        resolveClass();
    }
    //将加载过这个类对象直接返回
    return c;
}

```
从上面的代码中，我们可以看到在父加载器不能完成加载任务时，会调用findClass(name)函数，这个就是我们自己实现的ClassLoader的查找类文件的规则，所以在继承后，我们只需要覆盖findClass()这个函数，实现我们在本加载器中的查找逻辑，而且还不会破坏双亲委托模型

```java
public class MyClassLoader extends ClassLoader{

    private String rootPath;
    
    public MyClassLoader(String rootPath){
        this.rootPath = rootPath;
    }
    
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        //check if the class have been loaded
        Class<?> c = findLoadedClass(name);        
        if(c!=null){
            return c;
        }
        //load the class
        byte[] classData = getClassData(name);
        if(classData==null){
            throw new ClassNotFoundException();
        }
        else{
            c = defineClass(name,classData, 0, classData.length);
            return c;
        }    
    }
    
    private byte[] getClassData(String className){
        String path = rootPath+"/"+className.replace('.', '/')+".class";
        
        InputStream is = null;
        ByteArrayOutputStream bos = null;
        try {
            is = new FileInputStream(path);
            bos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int temp = 0;
            while((temp = is.read(buffer))!=-1){
                bos.write(buffer,0,temp);
            }
            return bos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                is.close();
                bos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }            
        }
        
        return null;        
    }    

}

```

测试自定义的类加载器

创建一个测试类HelloWorld

```java
package testOthers;

public class HelloWorld {

}
```
在D盘根目录创建一个testOthers文件夹，编译HelloWorld.java，将得到的class文件放到testOthers文件夹下。

利用如下代码进行测试

```java
public class testMyClassLoader {
    @Test
    public void test() throws Exception{
        MyClassLoader loader = new MyClassLoader("D:");
        Class<?> c = loader.loadClass("testOthers.HelloWorld");
        System.out.println(c.getClassLoader());
    }
}
```
输出：

 

说明HelloWorld类是被我们的自定义类加载器MyClassLoader加载的


<a id="markdown-常见加载类错误" name="常见加载类错误"></a>
#### 常见加载类错误

* ClassNotFoudException
    * 类不存在
* NoClassDefFoundError
* UnsatisfiedLinkError
* ClassCastException
    * 强制类型转换时出现得到错误，比如将A类型转换为没有继承或实现关系的B类型时出现
* ExceptionOInInitializerError

<a id="markdown-1526-线程上下文类加载器" name="1526-线程上下文类加载器"></a>
#### 1.5.2.6. 线程上下文类加载器
<a href="#menu" style="float:right">目录</a>

　　线程上下文类加载器（context class loader）是从 JDK 1.2 开始引入的。类 java.lang.Thread中的方法 getContextClassLoader()和 setContextClassLoader(ClassLoader cl)用来获取和设置线程的上下文类加载器。如果没有通过 setContextClassLoader(ClassLoader cl)方法进行设置的话，线程将继承其父线程的上下文类加载器。Java 应用运行的初始线程的上下文类加载器是系统类加载器。在线程中运行的代码可以通过此类加载器来加载类和资源。

　　前面提到的类加载器的代理模式并不能解决 Java 应用开发中会遇到的类加载器的全部问题。Java 提供了很多服务提供者接口（Service Provider Interface，SPI），允许第三方为这些接口提供实现。常见的 SPI 有 JDBC、JCE、JNDI、JAXP 和 JBI 等。这些 SPI 的接口由 Java 核心库来提供，如 JAXP 的 SPI 接口定义包含在 javax.xml.parsers包中。这些 SPI 的实现代码很可能是作为 Java 应用所依赖的 jar 包被包含进来，可以通过类路径（CLASSPATH）来找到，如实现了 JAXP SPI 的 Apache Xerces所包含的 jar 包。SPI 接口中的代码经常需要加载具体的实现类。如 JAXP 中的 javax.xml.parsers.DocumentBuilderFactory类中的 newInstance()方法用来生成一个新的 DocumentBuilderFactory的实例。这里的实例的真正的类是继承自 javax.xml.parsers.DocumentBuilderFactory，由 SPI 的实现所提供的。如在 Apache Xerces 中，实现的类是 org.apache.xerces.jaxp.DocumentBuilderFactoryImpl。而问题在于，SPI 的接口是 Java 核心库的一部分，是由引导类加载器来加载的；SPI 实现的 Java 类一般是由系统类加载器来加载的。引导类加载器是无法找到 SPI 的实现类的，因为它只加载 Java 的核心库。它也不能代理给系统类加载器，因为它是系统类加载器的祖先类加载器。也就是说，类加载器的代理模式无法解决这个问题。
　　线程上下文类加载器正好解决了这个问题。如果不做任何的设置，Java 应用的线程的上下文类加载器默认就是系统上下文类加载器。在 SPI 接口的代码中使用线程上下文类加载器，就可以成功的加载到 SPI 实现的类。线程上下文类加载器在很多 SPI 的实现中都会用到。



<a id="markdown-1527-类加载器与web容器" name="1527-类加载器与web容器"></a>
#### 1.5.2.7. 类加载器与Web容器
<a href="#menu" style="float:right">目录</a>
　　对于运行在 Java EE容器中的 Web 应用来说，类加载器的实现方式与一般的 Java 应用有所不同。不同的 Web 容器的实现方式也会有所不同。以 Apache Tomcat 来说，每个 Web 应用都有一个对应的类加载器实例。该类加载器也使用代理模式，所不同的是它是首先尝试去加载某个类，如果找不到再代理给父类加载器。这与一般类加载器的顺序是相反的。这是 Java Servlet 规范中的推荐做法，其目的是使得 Web 应用自己的类的优先级高于 Web 容器提供的类。这种代理模式的一个例外是：Java 核心库的类是不在查找范围之内的。这也是为了保证 Java 核心库的类型安全。
　　
绝大多数情况下，Web 应用的开发人员不需要考虑与类加载器相关的细节。下面给出几条简单的原则：
（1）每个 Web 应用自己的 Java 类文件和使用的库的 jar 包，分别放在 WEB-INF/classes和 WEB-INF/lib目录下面。
（2）多个应用共享的 Java 类文件和 jar 包，分别放在 Web 容器指定的由所有 Web 应用共享的目录下面。
（3）当出现找不到类的错误时，检查当前类的类加载器和当前线程的上下文类加载器是否正确。


<a id="markdown-1528-常见问题分析" name="1528-常见问题分析"></a>
#### 1.5.2.8. 常见问题分析
**由不同的类加载器加载的指定类还是相同的类型吗？**

　　在Java中，一个类用其完全匹配类名(fully qualified class name)作为标识，这里指的完全匹配类名包括包名和类名。但在JVM中，一个类用其 全名 和 一个ClassLoader的实例 作为唯一标识，不同类加载器加载的类将被置于不同的命名空间。我们可以用两个自定义类加载器去加载某自定义类型（注意不要将自定义类型的字节码放置到系统路径或者扩展路径中，否则会被系统类加载器或扩展类加载器抢先加载），然后用获取到的两个Class实例进行java.lang.Object.equals（…）判断，将会得到不相等的结果，如下所示：

```java
public class TestBean {

    public static void main(String[] args) throws Exception {
        // 一个简单的类加载器，逆向双亲委派机制
        // 可以加载与自己在同一路径下的Class文件
        ClassLoader myClassLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name)
                    throws ClassNotFoundException {
                try {
                    String filename = name.substring(name.lastIndexOf(".") + 1)
                            + ".class";
                    InputStream is = getClass().getResourceAsStream(filename);
                    if (is == null) {
                        return super.loadClass(name);   // 递归调用父类加载器
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (Exception e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };

        Object obj = myClassLoader.loadClass("classloader.test.bean.TestBean")
                .newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof classloader.test.bean.TestBean);
    }
}/* Output: 
        class classloader.test.bean.TestBean
        false  
 *///:~    
```
　　我们发现，obj 确实是类classloader.test.bean.TestBean实例化出来的对象，但当这个对象与类classloader.test.bean.TestBean做所属类型检查时却返回了false。这是因为虚拟机中存在了两个TestBean类，一个是由系统类加载器加载的，另一个则是由我们自定义的类加载器加载的，虽然它们来自同一个Class文件，但依然是两个独立的类，因此做所属类型检查时返回false。

**在代码中直接调用Class.forName(String name)方法，到底会触发那个类加载器进行类加载行为？**

Class.forName(String name)默认会使用调用类的类加载器来进行类加载。我们直接来分析一下对应的jdk的代码：

```java
//java.lang.Class.java  
public static Class<?> forName(String className) throws ClassNotFoundException {  
    return forName0(className, true, ClassLoader.getCallerClassLoader());  
}  

//java.lang.ClassLoader.java  
//Returns the invoker's class loader, or null if none.  
static ClassLoader getCallerClassLoader() {  
    // 获取调用类（caller）的类型  
    Class caller = Reflection.getCallerClass(3);  
    // This can be null if the VM is requesting it  
    if (caller == null) {  
        return null;  
    }  
    // 调用java.lang.Class中本地方法获取加载该调用类（caller）的ClassLoader  
    return caller.getClassLoader0();  
}  

//java.lang.Class.java  
//虚拟机本地实现，获取当前类的类加载器，前面介绍的Class的getClassLoader()也使用此方法  
native ClassLoader getClassLoader0(); 

```

**在编写自定义类加载器时，如果没有设定父加载器，那么父加载器是谁？**
　　前面讲过，在不指定父类加载器的情况下，默认采用系统类加载器。可能有人觉得不明白，现在我们来看一下JDK对应的代码实现。众所周知，我们编写自定义的类加载器直接或者间接继承自java.lang.ClassLoader抽象类，对应的无参默认构造函数实现如下：

```java
//摘自java.lang.ClassLoader.java  
protected ClassLoader() {  
    SecurityManager security = System.getSecurityManager();  
    if (security != null) {  
        security.checkCreateClassLoader();  
    }  
    this.parent = getSystemClassLoader();  
    initialized = true;  
} 
```

我们再来看一下对应的getSystemClassLoader()方法的实现：
```java
private static synchronized void initSystemClassLoader() {  
    //...  
    sun.misc.Launcher l = sun.misc.Launcher.getLauncher();  
    scl = l.getClassLoader();  
    //...  
}  
```
我们可以写简单的测试代码来测试一下：
```java
System.out.println(sun.misc.Launcher.getLauncher().getClassLoader());  
```
本机对应输出如下：
```java
sun.misc.Launcher$AppClassLoader@73d16e93 
```
　　所以，我们现在可以相信当自定义类加载器没有指定父类加载器的情况下，默认的父类加载器即为系统类加载器。同时，我们可以得出如下结论：即使用户自定义类加载器不指定父类加载器，那么，同样可以加载如下三个地方的类：

```
<Java_Runtime_Home>/lib下的类；
<Java_Runtime_Home>/lib/ext下或者由系统变量java.ext.dir指定位置中的类；
```
当前工程类路径下或者由系统变量java.class.path指定位置中的类。

**在编写自定义类加载器时，如果将父类加载器强制设置为null，那么会有什么影响？如果自定义的类加载器不能加载指定类，就肯定会加载失败吗？**

　　JVM规范中规定如果用户自定义的类加载器将父类加载器强制设置为null，那么会自动将启动类加载器设置为当前用户自定义类加载器的父类加载器（这个问题前面已经分析过了）。同时，我们可以得出如下结论：即使用户自定义类加载器不指定父类加载器，那么，同样可以加载到<JAVA_HOME>/lib下的类，但此时就不能够加载<JAVA_HOME>/lib/ext目录下的类了。

　　Ps：问题3和问题4的推断结论是基于用户自定义的类加载器本身延续了java.lang.ClassLoader.loadClass（…）默认委派逻辑，如果用户对这一默认委派逻辑进行了改变，以上推断结论就不一定成立了，详见问题5。

**编写自定义类加载器时，一般有哪些注意点？**

1)、一般尽量不要覆写已有的loadClass(…)方法中的委派逻辑（Old Generation）

　　一般在JDK 1.2之前的版本才这样做，而且事实证明，这样做极有可能引起系统默认的类加载器不能正常工作。在JVM规范和JDK文档中（1.2或者以后版本中），都没有建议用户覆写loadClass(…)方法，相比而言，明确提示开发者在开发自定义的类加载器时覆写findClass(…)逻辑。举一个例子来验证该问题：

```java
//用户自定义类加载器WrongClassLoader.Java（覆写loadClass逻辑）  
public class WrongClassLoader extends ClassLoader {  

    public Class<?> loadClass(String name) throws ClassNotFoundException {  
        return this.findClass(name);  
    }  

    protected Class<?> findClass(String name) throws ClassNotFoundException {  
        // 假设此处只是到工程以外的特定目录D:\library下去加载类  
        // 具体实现代码省略  
    }  
}  
```
　　通过前面的分析我们已经知道，这个自定义类加载器WrongClassLoader的默认类加载器是系统类加载器，但是现在问题4中的结论就不成立了。大家可以简单测试一下，现在JAVA_HOME/lib、JAVA_HOME/lib/ext 和 工程类路径上的类都加载不上了。

```java
//问题5测试代码一  
public class WrongClassLoaderTest {  
    publicstaticvoid main(String[] args) {  
        try {  
            WrongClassLoader loader = new WrongClassLoader();  
            Class classLoaded = loader.loadClass("beans.Account");  
            System.out.println(classLoaded.getName());  
            System.out.println(classLoaded.getClassLoader());  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}/* Output: 
        java.io.FileNotFoundException: D:"classes"java"lang"Object.class (系统找不到指定的路径。)  
        at java.io.FileInputStream.open(Native Method)  
        at java.io.FileInputStream.<init>(FileInputStream.java:106)  
        at WrongClassLoader.findClass(WrongClassLoader.java:40)  
        at WrongClassLoader.loadClass(WrongClassLoader.java:29)  
        at java.lang.ClassLoader.loadClassInternal(ClassLoader.java:319)  
        at java.lang.ClassLoader.defineClass1(Native Method)  
        at java.lang.ClassLoader.defineClass(ClassLoader.java:620)  
        at java.lang.ClassLoader.defineClass(ClassLoader.java:400)  
        at WrongClassLoader.findClass(WrongClassLoader.java:43)  
        at WrongClassLoader.loadClass(WrongClassLoader.java:29)  
        at WrongClassLoaderTest.main(WrongClassLoaderTest.java:27)  
Exception in thread "main" java.lang.NoClassDefFoundError: java/lang/Object  
        at java.lang.ClassLoader.defineClass1(Native Method)  
        at java.lang.ClassLoader.defineClass(ClassLoader.java:620)  
        at java.lang.ClassLoader.defineClass(ClassLoader.java:400)  
        at WrongClassLoader.findClass(WrongClassLoader.java:43)  
        at WrongClassLoader.loadClass(WrongClassLoader.java:29)  
        at WrongClassLoaderTest.main(WrongClassLoaderTest.java:27)  
 *///:~    
```
　　注意，这里D:”classes”beans”Account.class是物理存在的。这说明，连要加载的类型的超类型java.lang.Object都加载不到了。这里列举的由于覆写loadClass()引起的逻辑错误明显是比较简单的，实际引起的逻辑错误可能复杂的多。

```java
//问题5测试二  
//用户自定义类加载器WrongClassLoader.Java(不覆写loadClass逻辑)  
public class WrongClassLoader extends ClassLoader {  
    protected Class<?> findClass(String name) throws ClassNotFoundException {  
        //假设此处只是到工程以外的特定目录D:\library下去加载类  
        //具体实现代码省略  
    }  
}/* Output: 
        beans.Account  
        WrongClassLoader@1c78e57  
 *///:~  
```
　　将自定义类加载器代码WrongClassLoader.Java做以上修改后，再运行测试代码，输出正确。

2). 正确设置父类加载器

　　通过上面问题4和问题5的分析我们应该已经理解，个人觉得这是自定义用户类加载器时最重要的一点，但常常被忽略或者轻易带过。有了前面JDK代码的分析作为基础，我想现在大家都可以随便举出例子了。

3). 保证findClass(String name)方法的逻辑正确性

　　事先尽量准确理解待定义的类加载器要完成的加载任务，确保最大程度上能够获取到对应的字节码内容。

**如何在运行时判断系统类加载器能加载哪些路径下的类？**

　　一是可以直接调用ClassLoader.getSystemClassLoader()或者其他方式获取到系统类加载器（系统类加载器和扩展类加载器本身都派生自URLClassLoader），调用URLClassLoader中的getURLs()方法可以获取到。二是可以直接通过获取系统属性java.class.path来查看当前类路径上的条目信息 ：System.getProperty(“java.class.path”)。如下所示，
```java
public class Test {
    public static void main(String[] args) {
        System.out.println("Rico");
        Gson gson = new Gson();
        System.out.println(gson.getClass().getClassLoader());
        System.out.println(System.getProperty("java.class.path"));
    }
}/* Output: 
        Rico
        sun.misc.Launcher$AppClassLoader@6c68bcef
        I:\AlgorithmPractice\TestClassLoader\bin;I:\Java\jars\Gson\gson-2.3.1.jar
 *///:~ 
```
　　如上述程序所示，Test类和Gson类由系统类加载器加载，并且其加载路径就是用户类路径，包括当前类路径和引用的第三方类库的路径。

**如何在运行时判断标准扩展类加载器能加载哪些路径下的类？**

利用如下方式即可判断：

```java
import java.net.URL;
import java.net.URLClassLoader;  

public class ClassLoaderTest {  

    /** 
     * @param args the command line arguments 
     */  
    public static void main(String[] args) {  
        try {  
            URL[] extURLs = ((URLClassLoader) ClassLoader.getSystemClassLoader().getParent()).getURLs();  
            for (int i = 0; i < extURLs.length; i++) {  
                System.out.println(extURLs[i]);  
            }  
        } catch (Exception e) {  
            //…  
        }  
    }  
} 
/* Output: 
        file:/C:/Program%20Files/Java/jdk1.7.0_79/jre/lib/ext/access-bridge-64.jar
        file:/C:/Program%20Files/Java/jdk1.7.0_79/jre/lib/ext/dnsns.jar
        file:/C:/Program%20Files/Java/jdk1.7.0_79/jre/lib/ext/jaccess.jar
        file:/C:/Program%20Files/Java/jdk1.7.0_79/jre/lib/ext/localedata.jar
        file:/C:/Program%20Files/Java/jdk1.7.0_79/jre/lib/ext/sunec.jar
        file:/C:/Program%20Files/Java/jdk1.7.0_79/jre/lib/ext/sunjce_provider.jar
        file:/C:/Program%20Files/Java/jdk1.7.0_79/jre/lib/ext/sunmscapi.jar
        file:/C:/Program%20Files/Java/jdk1.7.0_79/jre/lib/ext/zipfs.jar
 */

```

 
<a id="markdown-153-反射" name="153-反射"></a>
### 1.5.3. 反射
<a href="#menu" style="float:right">目录</a>


<a id="markdown-16-jdbc" name="16-jdbc"></a>
## 1.6. JDBC
<a href="#menu" style="float:right">目录</a>

**数据库驱动**
这里的驱动的概念和平时听到的那种驱动的概念是一样的，比如平时购买的声卡，网卡直接插到计算机上面是不能用的，必须要安装相应的驱动程序之后才能够使用声卡和网卡，同样道理，我们安装好数据库之后，我们的应用程序也是不能直接使用数据库的，必须要通过相应的数据库驱动程序，通过驱动程序去和数据库打交道，如下所示：
* 应用程序-->Mysq驱动--Mysql
* 应用程序-->Oracle驱动--Oracle

**JDBC介绍**
　　SUN公司为了简化、统一对数据库的操作，定义了一套Java操作数据库的规范（接口），称之为JDBC。这套接口由数据库厂商去实现，这样，开发人员只需要学习jdbc接口，并通过jdbc加载具体的驱动，就可以操作数据库。
```java
package me.gacl.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcFirstDemo {

    public static void main(String[] args) throws Exception {
        //要连接的数据库URL
        String url = "jdbc:mysql://localhost:3306/jdbcStudy";
        //连接的数据库时使用的用户名
        String username = "root";
        //连接的数据库时使用的密码
        String password = "XDP";
        
        //1.加载驱动
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());不推荐使用这种方式来加载驱动
        Class.forName("com.mysql.jdbc.Driver");//推荐使用这种方式来加载驱动
        //2.获取与数据库的链接
        Connection conn = DriverManager.getConnection(url, username, password);
        
        //3.获取用于向数据库发送sql语句的statement
        Statement st = conn.createStatement();
        
        String sql = "select id,name,password,email,birthday from users";
        //4.向数据库发sql,并获取代表结果集的resultset
        ResultSet rs = st.executeQuery(sql);
        
        //5.取出结果集的数据
        while(rs.next()){
            System.out.println("id=" + rs.getObject("id"));
            System.out.println("name=" + rs.getObject("name"));
            System.out.println("password=" + rs.getObject("password"));
            System.out.println("email=" + rs.getObject("email"));
            System.out.println("birthday=" + rs.getObject("birthday"));
        }
        
        //6.关闭链接，释放资源
        rs.close();
        st.close();
        conn.close();
    }
}
```
* **JDBC之Statement,PreparedStatement,CallableStatement的区别**
    * Statement、PreparedStatement和CallableStatement都是接口(interface)。 
    * Statement继承自Wrapper、PreparedStatement继承自Statement、CallableStatement继承自PreparedStatement。 
    * Statement接口提供了执行语句和获取结果的基本方法； 
        * PreparedStatement接口添加了处理 IN 参数的方法； 
        * CallableStatement接口添加了处理 OUT 参数的方法。 
    * Statement: 
        * 普通的不带参的查询SQL；支持批量更新,批量删除; 
    * PreparedStatement: 
        * 可变参数的SQL,编译一次,执行多次,效率高; 
        * 安全性好，有效防止Sql注入等问题; 
        * 支持批量更新,批量删除; 
    * CallableStatement: 
        * 继承自PreparedStatement,支持带参数的SQL操作; 
        * 支持调用存储过程,提供了对输出和输入/输出参数(INOUT)的支持; 
    * Statement每次执行sql语句，数据库都要执行sql语句的编译 ，最好用于仅执行一次查询并返回结果的情形时，效率高于PreparedStatement。
    * PreparedStatement是预编译的，使用PreparedStatement有几个好处 
        * 在执行可变参数的一条SQL时，PreparedStatement比Statement的效率高，因为DBMS预编译一条SQL当然会比多次编译一条SQL的效率要高。 
        * 安全性好，有效防止Sql注入等问题。 
        * 对于多次重复执行的语句，使用PreparedStament效率会更高一点，并且在这种情况下也比较适合使用batch； 
        * 代码的可读性和可维护性。 
    * 其他
        * executeQuery：返回结果集(ResultSet)。 
        * executeUpdate: 执行给定SQL语句,该语句可能为 INSERT、UPDATE 或 DELETE 语句， 
        * 或者不返回任何内容的SQL语句（如 SQL DDL 语句）。 
        * execute: 可用于执行任何SQL语句，返回一个boolean值， 
        * 表明执行该SQL语句是否返回了ResultSet。如果执行后第一个结果是ResultSet，则返回true，否则返回false。 

```java
//Statement用法:  
String sql = "select seq_orderdetailid.nextval as test dual";  
Statement stat1=conn.createStatement();  
ResultSet rs1 = stat1.executeQuery(sql);  
if ( rs1.next() ) {  
    id = rs1.getLong(1);  
}  

//Statement的Batch使用:  
Statement stmt  = conn.createStatement();  
String sql = null;  
for(int i =0;i<20;i++){  
    sql = "insert into test(id,name)values("+i+","+i+"_name)";  
    stmt.addBatch(sql);  
}  
stmt.executeBatch();  

   
//PreparedStatement用法:  
PreparedStatement pstmt  = con.prepareStatement("UPDATE EMPLOYEES  SET SALARY = ? WHERE ID =?");  
pstmt.setBigDecimal(1, 153.00);  
pstmt.setInt(2, 1102);  
pstmt. executeUpdate()
   
//PreparedStatement的Batch使用:  
PreparedStatement pstmt  = con.prepareStatement("UPDATE EMPLOYEES  SET SALARY = ? WHERE ID =?");  
for(int i =0;i<length;i++){  
    pstmt.setBigDecimal(1, param1[i]);  
    pstmt.setInt(2, param2[i]);  
    pstmt.addBatch();  
}  
pstmt.executeBatch();  

//CallableStatement
CallableStatement cstmt = conn.prepareCall("{call revise_total(?)}");  
cstmt.setByte(1, 25);  
cstmt.registerOutParameter(1, java.sql.Types.TINYINT);  
cstmt.executeUpdate();  
byte x = cstmt.getByte(1);  
```
<a id="markdown-17-函数式编程" name="17-函数式编程"></a>
## 1.7. 函数式编程

函数式编程就是一种抽象程度很高的编程范式，纯粹的函数式编程语言编写的函数没有变量，因此，任意一个函数，只要输入是确定的，输出就是确定的，这种纯函数我们称之为没有副作用。而允许使用变量的程序设计语言，由于函数内部的变量状态不确定，同样的输入，可能得到不同的输出，因此，这种函数是有副作用的。

函数式编程的一个特点就是，允许把函数本身作为参数传入另一个函数，还允许返回一个函数！
<a id="markdown-18-java-8-的新特性" name="18-java-8-的新特性"></a>
## 1.8. Java 8 的新特性：

<a id="markdown-181-java-8-lambda-表达式" name="181-java-8-lambda-表达式"></a>
### 1.8.1. Java 8 Lambda 表达式
Lambda 表达式，也可称为闭包，它是推动 Java 8 发布的最重要新特性。
Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
使用 Lambda 表达式可以使代码变的更加简洁紧凑。
法
lambda 表达式的语法格式如下：

```java
(parameters) -> expression
或
(parameters) ->{ statements; }
```
* 以下是lambda表达式的重要特征:
    * 可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
    * 可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
    * 可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
    * 可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值。

**Lambda 表达式实例**

```java
// 1. 不需要参数,返回值为 5  
() -> 5    
// 2. 接收一个参数(数字类型),返回其2倍的值  
x -> 2 * x    
// 3. 接受2个参数(数字),并返回他们的差值  
(x, y) -> x – y    
// 4. 接收2个int型整数,返回他们的和  
(int x, int y) -> x + y   
// 5. 接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void)  
(String s) -> System.out.print(s)
```
* lambda 表达式只能引用标记了 final 的外层局部变量，这就是说不能在 lambda 内部修改定义在域外的局部变量，否则会编译错误。
* lambda 表达式的局部变量可以不用声明为 final，但是必须不可被后面的代码修改（即隐性的具有 final 的语义）
* 在Lambda 表达式当中不允许声明一个与外部局部变量同名的参数或者局部变量

<a id="markdown-182-java-8-函数式接口" name="182-java-8-函数式接口"></a>
### 1.8.2. Java 8 函数式接口
函数式接口(Functional Interface)就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。

函数式接口可以被隐式转换为 lambda 表达式。

Lambda 表达式和方法引用（实际上也可认为是Lambda表达式）上。

如定义了一个函数式接口如下：

@FunctionalInterface
interface GreetingService 
{
    void sayMessage(String message);
}
那么就可以使用Lambda表达式来表示该接口的一个实现(注：JAVA 8 之前一般是用匿名类实现的)：

GreetingService greetService1 = message -> System.out.println("Hello " + message);
函数式接口可以对现有的函数友好地支持 lambda。

JDK 1.8 之前已有的函数式接口:

java.lang.Runnable
java.util.concurrent.Callable
java.security.PrivilegedAction
java.util.Comparator
java.io.FileFilter
java.nio.file.PathMatcher
java.lang.reflect.InvocationHandler
java.beans.PropertyChangeListener
java.awt.event.ActionListener
javax.swing.event.ChangeListener
JDK 1.8 新增加的函数接口：

java.util.function
java.util.function 它包含了很多类，用来支持 Java的 函数式编程，该包中的函数式接口有：

|序号	|接口 & 描述
|---|---|
|1|	BiConsumer<T,U>代表了一个接受两个输入参数的操作，并且不返回任何结果
|2|	BiFunction<T,U,R>代表了一个接受两个输入参数的方法，并且返回一个结果
|3|	BinaryOperator<T>代表了一个作用于于两个同类型操作符的操作，并且返回了操作符同类型的结果
|4|	BiPredicate<T,U>代表了一个两个参数的boolean值方法
|5|BooleanSupplier代表了boolean值结果的提供方
|6|	Consumer<T>代表了接受一个输入参数并且无返回的操作
|7|	DoubleBinaryOperator代表了作用于两个double值操作符的操作，并且返回了一个double值的结果。
|8|	DoubleConsumer代表一个接受double值参数的操作，并且不返回结果。
|9|	DoubleFunction<R>代表接受一个double值参数的方法，并且返回结果
|10|	DoublePredicate代表一个拥有double值参数的boolean值方法
|11|	DoubleSupplier代表一个double值结构的提供方
|12|	DoubleToIntFunction接受一个double类型输入，返回一个int类型结果。
|13|	DoubleToLongFunction接受一个double类型输入，返回一个long类型结果
|14|	DoubleUnaryOperator接受一个参数同为类型double,返回值类型也为double 。
|15|	Function<T,R>接受一个输入参数，返回一个结果。
|16|	IntBinaryOperator接受两个参数同为类型int,返回值类型也为int 。
|17|	IntConsumer接受一个int类型的输入参数，无返回值 。
|18|	IntFunction<R>接受一个int类型输入参数，返回一个结果 。
|19|	IntPredicate接受一个int输入参数，返回一个布尔值的结果。
|20|	IntSupplie无参数，返回一个int类型结果。
|21|	IntToDoubleFunction接受一个int类型输入，返回一个double类型结果 。
|22|	IntToLongFunction接受一个int类型输入，返回一个long类型结果。
|23|	IntUnaryOperator接受一个参数同为类型int,返回值类型也为int 。
|24|	LongBinaryOperator接受两个参数同为类型long,返回值类型也为long。
|25|	LongConsumer接受一个long类型的输入参数，无返回值。
|26	|LongFunction<R>接受一个long类型输入参数，返回一个结果。
|27|	LongPredicate接受一个long输入参数，返回一个布尔值类型结果。
|28|	LongSupplier无参数，返回一个结果long类型的值。
|29|	LongToDoubleFunction接受一个long类型输入，返回一个double类型结果。
|30|	LongToIntFunction接受一个long类型输入，返回一个int类型结果。
|31|	LongUnaryOperator接受一个参数同为类型long,返回值类型也为long。
|32|	ObjDoubleConsumer<T>接受一个object类型和一个double类型的输入参数，无返回值。
|33	|ObjIntConsumer<T>接受一个object类型和一个int类型的输入参数，无返回值。
|34|	ObjLongConsumer<T>接受一个object类型和一个long类型的输入参数，无返回值。
|35	|Predicate<T>\接受一个输入参数，返回一个布尔值结果。
|36|	Supplier<T>无参数，返回一个结果。
|37|	ToDoubleBiFunction<T,U>接受两个输入参数，返回一个double类型结果
|38|	ToDoubleFunction<T>接受一个输入参数，返回一个double类型结果
|39|	ToIntBiFunction<T,U>接受两个输入参数，返回一个int类型结果。
|40|	ToIntFunction<T>接受一个输入参数，返回一个int类型结果。
|41|	ToLongBiFunction<T,U>接受两个输入参数，返回一个long类型结果。
|42	|ToLongFunction<T>接受一个输入参数，返回一个long类型结果。
|43|	UnaryOperator<T>接受一个参数为类型T,返回值类型也为T。

**函数式接口实例**
Predicate <T> 接口是一个函数式接口，它接受一个输入参数 T，返回一个布尔值结果。

该接口包含多种默认方法来将Predicate组合成其他复杂的逻辑（比如：与，或，非）。

该接口用于测试对象是 true 或 false。

我们可以通过以下实例（Java8Tester.java）来了解函数式接口 Predicate <T> 的使用：
```java
Java8Tester.java 文件
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
 
public class Java8Tester {
   public static void main(String args[]){
      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
      // Predicate<Integer> predicate = n -> true
      // n 是一个参数传递到 Predicate 接口的 test 方法
      // n 如果存在则 test 方法返回 true
        
      System.out.println("输出所有数据:");
        
      // 传递参数 n
      eval(list, n->true);
        
      // Predicate<Integer> predicate1 = n -> n%2 == 0
      // n 是一个参数传递到 Predicate 接口的 test 方法
      // 如果 n%2 为 0 test 方法返回 true
        
      System.out.println("输出所有偶数:");
      eval(list, n-> n%2 == 0 );
        
      // Predicate<Integer> predicate2 = n -> n > 3
      // n 是一个参数传递到 Predicate 接口的 test 方法
      // 如果 n 大于 3 test 方法返回 true
        
      System.out.println("输出大于 3 的所有数字:");
      eval(list, n-> n > 3 );
   }
    
   public static void eval(List<Integer> list, Predicate<Integer> predicate) {
      for(Integer n: list) {
        
         if(predicate.test(n)) {
            System.out.println(n + " ");
         }
      }
   }
}
```
<a id="markdown-183-默认方法" name="183-默认方法"></a>
### 1.8.3. 默认方法
Java 8 新增了接口的默认方法。
简单说，默认方法就是接口可以有实现方法，而且不需要实现类去实现其方法。
我们只需在方法名前面加个 default 关键字即可实现默认方法。

为什么要有这个特性？

首先，之前的接口是个双刃剑，好处是面向抽象而不是面向具体编程，缺陷是，当需要修改接口时候，需要修改全部实现该接口的类，目前的 java 8 之前的集合框架没有 foreach 方法，通常能想到的解决办法是在JDK里给相关的接口添加新的方法及实现。然而，对于已经发布的版本，是没法在给接口添加新方法的同时不影响已有的实现。所以引进的默认方法。他们的目的是为了解决接口的修改与现有的实现不兼容的问题。
```java
public interface Vehicle {
   default void print(){
      System.out.println("我是一辆车!");
   }
}
默认方法也可以设置为静态。
```

<a id="markdown-184-optional-类" name="184-optional-类"></a>
### 1.8.4. Optional 类
Optional 类是一个可以为null的容器对象。如果值存在则isPresent()方法会返回true，调用get()方法会返回该对象。

Optional 是个容器：它可以保存类型T的值，或者仅仅保存null。Optional提供很多有用的方法，这样我们就不用显式进行空值检测。

Optional 类的引入很好的解决空指针异常。

类声明
以下是一个 java.util.Optional<T> 类的声明：

public final class Optional<T>
extends Object
类方法
|序号|	方法 & 描述
|---|---|
|1|	static <T> Optional<T> empty()返回空的 Optional 实例。
|2|	boolean equals(Object obj判断其他对象是否等于 Optional。
|3|	Optional<T> filter(Predicate<? super <T> predicate)如果值存在，并且这个值匹配给定的 predicate，返回一个Optional用以描述这个值，否则返回一个空的Optional。
|4|	<U> Optional<U> flatMap(Function<? super T,Optional<U>> mapper)如果值存在，返回基于Optional包含的映射方法的值，否则返回一个空的Optional
|5|	T get()如果在这个Optional中包含这个值，返回值，否则抛出异常：NoSuchElementException
|6|	int hashCode()返回存在值的哈希码，如果值不存在 返回 0。
|7|	void ifPresent(Consumer<? super T> consumer)如果值存在则使用该值调用 consumer , 否则不做任何事情。
|8|	boolean isPresent()如果值存在则方法会返回true，否则返回 false。
|9|	<U>Optional<U> map(Function<? super T,? extends U> mapper)如果有值，则对其执行调用映射函数得到返回值。如果返回值不为 null，则创建包含映射返回值的Optional作为map方法返回值，否则返回空Optional。
|10|	static <T> Optional<T> of(T value)返回一个指定非null值的Optional。
|11|	static <T> Optional<T> ofNullable(T value)如果为非空，返回 Optional 描述的指定值，否则返回空的 Optional。
|12|	T orElse(T other)如果存在该值，返回值， 否则返回 other。
|13|	T orElseGet(Supplier<? extends T> other)如果存在该值，返回值， 否则触发 other，并返回 other 调用的结果。
|14|	<X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier)如果存在该值，返回包含的值，否则抛出由 Supplier 继承的异常
|15|	String toString()返回一个Optional的非空字符串，用来调试

注意： 这些方法是从 java.lang.Object 类继承来的。

Optional 实例
我们可以通过以下实例来更好的了解 Optional 类的使用：

Java8Tester.java 文件
```java
import java.util.Optional;
 
public class Java8Tester {
   public static void main(String args[]){
   
      Java8Tester java8Tester = new Java8Tester();
      Integer value1 = null;
      Integer value2 = new Integer(10);
        
      // Optional.ofNullable - 允许传递为 null 参数
      Optional<Integer> a = Optional.ofNullable(value1);
        
      // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
      Optional<Integer> b = Optional.of(value2);
      System.out.println(java8Tester.sum(a,b));
   }
    
   public Integer sum(Optional<Integer> a, Optional<Integer> b){
    
      // Optional.isPresent - 判断值是否存在
        
      System.out.println("第一个参数值存在: " + a.isPresent());
      System.out.println("第二个参数值存在: " + b.isPresent());
        
      // Optional.orElse - 如果值存在，返回它，否则返回默认值
      Integer value1 = a.orElse(new Integer(0));
        
      //Optional.get - 获取值，值需要存在
      Integer value2 = b.get();
      return value1 + value2;
   }
}
```

<a id="markdown-185-stream" name="185-stream"></a>
### 1.8.5. Stream
Java 8 API添加了一个新的抽象称为流Stream，可以让你以一种声明的方式处理数据。

Stream 使用一种类似用 SQL 语句从数据库查询数据的直观方式来提供一种对 Java 集合运算和表达的高阶抽象。

Stream API可以极大提高Java程序员的生产力，让程序员写出高效率、干净、简洁的代码。

这种风格将要处理的元素集合看作一种流， 流在管道中传输， 并且可以在管道的节点上进行处理， 比如筛选， 排序，聚合等。

元素流在管道中经过中间操作（intermediate operation）的处理，最后由最终操作(terminal operation)得到前面处理的结果。

+--------------------+       +------+   +------+   +---+   +-------+
| stream of elements +-----> |filter+-> |sorted+-> |map+-> |collect|
+--------------------+       +------+   +------+   +---+   +-------+
以上的流程转换为 Java 代码为：
```java
List<Integer> transactionsIds = 
widgets.stream()
             .filter(b -> b.getColor() == RED)
             .sorted((x,y) -> x.getWeight() - y.getWeight())
             .mapToInt(Widget::getWeight)
             .sum();
```

**什么是 Stream？**
* Stream（流）是一个来自数据源的元素队列并支持聚合操作
* 元素是特定类型的对象，形成一个队列。 Java中的Stream并不会存储元素，而是按需计算。
* 数据源 流的来源。 可以是集合，数组，I/O channel， 产生器generator 等。
* 聚合操作 类似SQL语句一样的操作， 比如filter, map, reduce, find, match, sorted等。

和以前的Collection操作不同， Stream操作还有两个基础的特征：
* Pipelining: 中间操作都会返回流对象本身。 这样多个操作可以串联成一个管道， 如同流式风格（fluent style）。 这样做可以对操作进行优化， 比如延迟执行(laziness)和短路( short-circuiting)。
* 内部迭代： 以前对集合遍历都是通过Iterator或者For-Each的方式, 显式的在集合外部进行迭代， 这叫做外部迭代。 Stream提供了内部迭代的方式， 通过访问者模式(Visitor)实现。

**生成流**
在 Java 8 中, 集合接口有两个方法来生成流：
* stream() − 为集合创建串行流。
* parallelStream() − 为集合创建并行流。

**forEach**
Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。以下代码片段使用 forEach 输出了10个随机数：
```JAVA
Random random = new Random();
random.ints().limit(10).forEach(System.out::println);
```
**map**

map 方法用于映射每个元素到对应的结果，以下代码片段使用 map 输出了元素对应的平方数：
```JAVA
List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
// 获取对应的平方数
List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
```

**filter**

filter 方法用于通过设置的条件过滤出元素。以下代码片段使用 filter 方法过滤出空字符串：
```JAVA
List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
// 获取空字符串的数量
int count = strings.stream().filter(string -> string.isEmpty()).count();
```
**limit**
limit 方法用于获取指定数量的流。 以下代码片段使用 limit 方法打印出 10 条数据：
```JAVA
Random random = new Random();
random.ints().limit(10).forEach(System.out::println);
```
**sorted**
sorted 方法用于对流进行排序。以下代码片段使用 sorted 方法对输出的 10 个随机数进行排序：
```JAVA
Random random = new Random();
random.ints().limit(10).sorted().forEach(System.out::println);
并行（parallel）程序
parallelStream 是流并行处理程序的代替方法。以下实例我们使用 parallelStream 来输出空字符串的数量：

List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
// 获取空字符串的数量
int count = strings.parallelStream().filter(string -> string.isEmpty()).count();
```
我们可以很容易的在顺序运行和并行直接切换。

**Collectors**
Collectors 类实现了很多归约操作，例如将流转换成集合和聚合元素。Collectors 可用于返回列表或字符串：
```JAVA
List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
 
System.out.println("筛选列表: " + filtered);
String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
System.out.println("合并字符串: " + mergedString);
```

统计
另外，一些产生统计结果的收集器也非常有用。它们主要用于int、double、long等基本类型上，它们可以用来产生类似如下的统计结果。
```JAVA
List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
 
IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
 
System.out.println("列表中最大的数 : " + stats.getMax());
System.out.println("列表中最小的数 : " + stats.getMin());
System.out.println("所有数之和 : " + stats.getSum());
System.out.println("平均数 : " + stats.getAverage());
```
Stream 完整实例
将以下代码放入 Java8Tester.java 文件中：

```JAVA
Java8Tester.java 文件
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Map;
 
public class Java8Tester {
   public static void main(String args[]){
      System.out.println("使用 Java 7: ");
        
      // 计算空字符串
      List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
      System.out.println("列表: " +strings);
      long count = getCountEmptyStringUsingJava7(strings);
        
      System.out.println("空字符数量为: " + count);
      count = getCountLength3UsingJava7(strings);
        
      System.out.println("字符串长度为 3 的数量为: " + count);
        
      // 删除空字符串
      List<String> filtered = deleteEmptyStringsUsingJava7(strings);
      System.out.println("筛选后的列表: " + filtered);
        
      // 删除空字符串，并使用逗号把它们合并起来
      String mergedString = getMergedStringUsingJava7(strings,", ");
      System.out.println("合并字符串: " + mergedString);
      List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        
      // 获取列表元素平方数
      List<Integer> squaresList = getSquares(numbers);
      System.out.println("平方数列表: " + squaresList);
      List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
        
      System.out.println("列表: " +integers);
      System.out.println("列表中最大的数 : " + getMax(integers));
      System.out.println("列表中最小的数 : " + getMin(integers));
      System.out.println("所有数之和 : " + getSum(integers));
      System.out.println("平均数 : " + getAverage(integers));
      System.out.println("随机数: ");
        
      // 输出10个随机数
      Random random = new Random();
        
      for(int i=0; i < 10; i++){
         System.out.println(random.nextInt());
      }
        
      System.out.println("使用 Java 8: ");
      System.out.println("列表: " +strings);
        
      count = strings.stream().filter(string->string.isEmpty()).count();
      System.out.println("空字符串数量为: " + count);
        
      count = strings.stream().filter(string -> string.length() == 3).count();
      System.out.println("字符串长度为 3 的数量为: " + count);
        
      filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
      System.out.println("筛选后的列表: " + filtered);
        
      mergedString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
      System.out.println("合并字符串: " + mergedString);
        
      squaresList = numbers.stream().map( i ->i*i).distinct().collect(Collectors.toList());
      System.out.println("Squares List: " + squaresList);
      System.out.println("列表: " +integers);
        
      IntSummaryStatistics stats = integers.stream().mapToInt((x) ->x).summaryStatistics();
        
      System.out.println("列表中最大的数 : " + stats.getMax());
      System.out.println("列表中最小的数 : " + stats.getMin());
      System.out.println("所有数之和 : " + stats.getSum());
      System.out.println("平均数 : " + stats.getAverage());
      System.out.println("随机数: ");
        
      random.ints().limit(10).sorted().forEach(System.out::println);
        
      // 并行处理
      count = strings.parallelStream().filter(string -> string.isEmpty()).count();
      System.out.println("空字符串的数量为: " + count);
   }
    
   private static int getCountEmptyStringUsingJava7(List<String> strings){
      int count = 0;
        
      for(String string: strings){
        
         if(string.isEmpty()){
            count++;
         }
      }
      return count;
   }
    
   private static int getCountLength3UsingJava7(List<String> strings){
      int count = 0;
        
      for(String string: strings){
        
         if(string.length() == 3){
            count++;
         }
      }
      return count;
   }
    
   private static List<String> deleteEmptyStringsUsingJava7(List<String> strings){
      List<String> filteredList = new ArrayList<String>();
        
      for(String string: strings){
        
         if(!string.isEmpty()){
             filteredList.add(string);
         }
      }
      return filteredList;
   }
    
   private static String getMergedStringUsingJava7(List<String> strings, String separator){
      StringBuilder stringBuilder = new StringBuilder();
        
      for(String string: strings){
        
         if(!string.isEmpty()){
            stringBuilder.append(string);
            stringBuilder.append(separator);
         }
      }
      String mergedString = stringBuilder.toString();
      return mergedString.substring(0, mergedString.length()-2);
   }
    
   private static List<Integer> getSquares(List<Integer> numbers){
      List<Integer> squaresList = new ArrayList<Integer>();
        
      for(Integer number: numbers){
         Integer square = new Integer(number.intValue() * number.intValue());
            
         if(!squaresList.contains(square)){
            squaresList.add(square);
         }
      }
      return squaresList;
   }
    
   private static int getMax(List<Integer> numbers){
      int max = numbers.get(0);
        
      for(int i=1;i < numbers.size();i++){
        
         Integer number = numbers.get(i);
            
         if(number.intValue() > max){
            max = number.intValue();
         }
      }
      return max;
   }
    
   private static int getMin(List<Integer> numbers){
      int min = numbers.get(0);
        
      for(int i=1;i < numbers.size();i++){
         Integer number = numbers.get(i);
        
         if(number.intValue() < min){
            min = number.intValue();
         }
      }
      return min;
   }
    
   private static int getSum(List numbers){
      int sum = (int)(numbers.get(0));
        
      for(int i=1;i < numbers.size();i++){
         sum += (int)numbers.get(i);
      }
      return sum;
   }
    
   private static int getAverage(List<Integer> numbers){
      return getSum(numbers) / numbers.size();
   }
}
```
<a id="markdown-186-java-8-日期时间-api" name="186-java-8-日期时间-api"></a>
### 1.8.6. Java 8 日期时间 API

Java 8通过发布新的Date-Time API (JSR 310)来进一步加强对日期与时间的处理。
在旧版的 Java 中，日期时间 API 存在诸多问题，其中有：
非线程安全 − java.util.Date 是非线程安全的，所有的日期类都是可变的，这是Java日期类最大的问题之一。

设计很差 − Java的日期/时间类的定义并不一致，在java.util和java.sql的包中都有日期类，此外用于格式化和解析的类在java.text包中定义。java.util.Date同时包含日期和时间，而java.sql.Date仅包含日期，将其纳入java.sql包并不合理。另外这两个类都有相同的名字，这本身就是一个非常糟糕的设计。
时区处理麻烦 − 日期类并不提供国际化，没有时区支持，因此Java引入了java.util.Calendar和java.util.TimeZone类，但他们同样存在上述所有的问题。
Java 8 在 java.time 包下提供了很多新的 API。以下为两个比较重要的 API：
Local(本地) − 简化了日期时间的处理，没有时区的问题。
Zoned(时区) − 通过制定的时区处理日期时间。
新的java.time包涵盖了所有处理日期，时间，日期/时间，时区，时刻（instants），过程（during）与时钟（clock）的操作。

**本地化日期时间 API**
LocalDate/LocalTime 和 LocalDateTime 类可以在处理时区不是必须的情况。代码如下：

Java8Tester.java 文件
```JAVA
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
 
public class Java8Tester {
   public static void main(String args[]){
      Java8Tester java8tester = new Java8Tester();
      java8tester.testLocalDateTime();
   }
    
   public void testLocalDateTime(){
    
      // 获取当前的日期时间
      LocalDateTime currentTime = LocalDateTime.now();
      System.out.println("当前时间: " + currentTime);
        
      LocalDate date1 = currentTime.toLocalDate();
      System.out.println("date1: " + date1);
        
      Month month = currentTime.getMonth();
      int day = currentTime.getDayOfMonth();
      int seconds = currentTime.getSecond();
        
      System.out.println("月: " + month +", 日: " + day +", 秒: " + seconds);
        
      LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
      System.out.println("date2: " + date2);
        
      // 12 december 2014
      LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
      System.out.println("date3: " + date3);
        
      // 22 小时 15 分钟
      LocalTime date4 = LocalTime.of(22, 15);
      System.out.println("date4: " + date4);
        
      // 解析字符串
      LocalTime date5 = LocalTime.parse("20:15:30");
      System.out.println("date5: " + date5);
   }
}
```
<a id="markdown-187-java8-base64" name="187-java8-base64"></a>
### 1.8.7. Java8 Base64


在Java 8中，Base64编码已经成为Java类库的标准。

Java 8 内置了 Base64 编码的编码器和解码器。

Base64工具类提供了一套静态方法获取下面三种BASE64编解码器：

基本：输出被映射到一组字符A-Za-z0-9+/，编码不添加任何行标，输出的解码仅支持A-Za-z0-9+/。
URL：输出映射到一组字符A-Za-z0-9+_，输出是URL和文件。
MIME：输出隐射到MIME友好格式。输出每行不超过76字符，并且使用'\r'并跟随'\n'作为分割。编码输出最后没有行分割。
内嵌类
|序号|	内嵌类 & 描述
|---|---|
|1|	static class Base64.Decoder
该类实现一个解码器用于，使用 Base64 编码来解码字节数据。

|2|	static class Base64.Encoder
该类实现一个编码器，使用 Base64 编码来编码字节数据。


|序号|	方法名 & 描述
|---|---|
|1|	static Base64.Decoder getDecoder()返回一个 Base64.Decoder ，解码使用基本型 base64 编码方案。
|2|	static Base64.Encoder getEncoder()返回一个 Base64.Encoder ，编码使用基本型 base64 编码方案。
|3|	static Base64.Decoder getMimeDecoder()返回一个 Base64.Decoder ，解码使用 MIME 型 base64 编码方案。
|4|	static Base64.Encoder getMimeEncoder()返回一个 Base64.Encoder ，编码使用 MIME 型 base64 编码方案。
|5|	static Base64.Encoder getMimeEncoder(int lineLength, byte[] lineSeparator)返回一个 Base64.Encoder ，编码使用 MIME 型 base64 编码方案，可以通过参数指定每行的长度及行的分隔符。
|6|	static Base64.Decoder getUrlDecoder()
返回一个 Base64.Decoder ，解码使用 URL 和文件名安全型 base64 编码方案。
|7|	static Base64.Encoder getUrlEncoder()返回一个 Base64.Encoder ，编码使用 URL 和文件名安全型 base64 编码方案。




<a id="markdown-19-jdk版本变化" name="19-jdk版本变化"></a>
## 1.9. JDK版本变化
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





<a id="markdown-110-设计模式" name="110-设计模式"></a>
## 1.10. 设计模式
<a href="#menu" style="float:right">目录</a>

<a id="markdown-1101-设计原则" name="1101-设计原则"></a>
### 1.10.1. 设计原则
<a href="#menu" style="float:right">目录</a>

<a id="markdown-11011-单一职责原则" name="11011-单一职责原则"></a>
#### 1.10.1.1. 单一职责原则
* 每个类只负责单一的功能，避免出现复杂臃肿的类。造成维护困难。
<a id="markdown-11012-里氏替换原则" name="11012-里氏替换原则"></a>
#### 1.10.1.2. 里氏替换原则
* 父类出现的地方子类也可以出现。方便实现类替换，减少代码修改。
<a id="markdown-11013-依赖倒置原则" name="11013-依赖倒置原则"></a>
#### 1.10.1.3. 依赖倒置原则
* 高层模块不应该依赖细节，而应该依赖其抽象
* 也就是说定义类属性时，使用接口或者抽象类来定义，而不是实现类。
<a id="markdown-11014-接口隔离原则" name="11014-接口隔离原则"></a>
#### 1.10.1.4. 接口隔离原则
* 创建单一的接口，不要创建臃肿的接口。每个接口应该只是负责单一的功能，避免增加新抽象方法时，造成较多的实现类页需要修改。
<a id="markdown-11015-迪米特法则" name="11015-迪米特法则"></a>
#### 1.10.1.5. 迪米特法则
* 一个类应当降低对其他类的依赖,避免其他类修改时，使用类也要进行修改。
<a id="markdown-11016-开闭原则" name="11016-开闭原则"></a>
#### 1.10.1.6. 开闭原则
* 对修改关闭，对扩展开放
* 当需要增加新功能时，应当避免修改原类的代码，应当通过一些设计模式来进行功能扩展。比如装饰模式，这样可以达到对其他使用类的影响。
* 以上的原则都是施行指南，开闭原则是最终目标。

<a id="markdown-1102-uml图" name="1102-uml图"></a>
### 1.10.2. UML图

![](https://github.com/lgjlife/Java-Study/blob/master/pic/designerPattern/uml.png?raw=true)

<a id="markdown-1103-单例模式" name="1103-单例模式"></a>
### 1.10.3. 单例模式
<a href="#menu" style="float:right">目录</a>

<a id="markdown-11031-基本概念" name="11031-基本概念"></a>
#### 1.10.3.1. 基本概念

**定义**:确保某一个类只有一个对象实例。
**衍生**：有限多例，比如对象池技术，使用缓存将创建的对象缓存起来。
**优点**:
* 减少内存开支，每创建一个对象都会占用一定的系统内存，创建过多容易造成JVM进行垃圾回收。
* 降低系统性能开销，创建和垃圾回收会耗费一定的系统性能
* 从业务层面讲。可以提供公共的资源访问点。

**缺点**:

<a id="markdown-11032-实现" name="11032-实现"></a>
#### 1.10.3.2. 实现
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

<a id="markdown-1104-工厂方法模式" name="1104-工厂方法模式"></a>
### 1.10.4. 工厂方法模式
<a href="#menu" style="float:right">目录</a>
工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。

![](https://www.runoob.com/wp-content/uploads/2014/08/factory_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
* 主要解决
    * 主要解决接口选择的问题。
* 何时使用
    * 我们明确地计划不同条件下创建不同实例时。
* 如何解决
    * 让其子类实现工厂接口，返回的也是一个抽象的产品。
* 关键代码
    * 创建过程在其子类执行。
* 应用实例
    * 您需要一辆汽车，可以直接从工厂里面提货，而不用去管这辆汽车是怎么做出来的，以及这个汽车里面的具体实现
    * Hibernate 换数据库只需换方言和驱动就可以。
* 优点
    * 一个调用者想创建一个对象，只要知道其名称就可以了。 
    * 扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。 
    * 屏蔽产品的具体实现，调用者只关心产品的接口。
* 缺点
    * 每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
* 使用场景
    * 日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。 
    * 数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。 
    * 设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。
* 注意事项
    * 作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。


<a id="markdown-1105-抽象工厂模式" name="1105-抽象工厂模式"></a>
### 1.10.5. 抽象工厂模式
<a href="#menu" style="float:right">目录</a>
抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。

![](https://www.runoob.com/wp-content/uploads/2014/08/abstractfactory_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
* 主要解决
    * 主要解决接口选择的问题。
* 何时使用
    * 系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
* 如何解决
    * 在一个产品族里面，定义多个产品。
* 关键代码
    * 在一个工厂里聚合多个同类产品。
* 应用实例：工作了，为了参加一些聚会，肯定有两套或多套衣服吧，比如说有商务装（成套，一系列具体产品）、时尚装（成套，一系列具体产品），甚至对于一个家庭来说，可能有商务女装、商务男装、时尚女装、时尚男装，这些也都是成套的，即一系列具体产品。假设一种情况（现实中是不存在的，要不然，没法进入共产主义了，但有利于说明抽象工厂模式），在您的家中，某一个衣柜（具体工厂）只能存放某一种这样的衣服（成套，一系列具体产品），每次拿这种成套的衣服时也自然要从这个衣柜中取出了。用 OOP 的思想去理解，所有的衣柜（具体工厂）都是衣柜类的（抽象工厂）某一个，而每一件成套的衣服又包括具体的上衣（某一具体产品），裤子（某一具体产品），这些具体的上衣其实也都是上衣（抽象产品），具体的裤子也都是裤子（另一个抽象产品）。
* 优点
    * 当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
* 缺点
    * 产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
* 使用场景
    * QQ 换皮肤，一整套一起换。 
    * 生成不同操作系统的程序。
* 注意事项
    * 产品族难扩展，产品等级易扩展。

<a id="markdown-1106-模板方法模式" name="1106-模板方法模式"></a>
### 1.10.6. 模板方法模式
<a href="#menu" style="float:right">目录</a>
在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。

![](https://www.runoob.com/wp-content/uploads/2014/08/template_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
* 主要解决
    * 一些方法通用，却在每一个子类都重新写了这一方法。
* 何时使用
    * 有一些通用的方法。
* 如何解决
    * 将这些通用算法抽象出来。
* 关键代码
    * 在抽象类实现，其他步骤在子类实现。
* 应用实例
    * 在造房子的时候，地基、走线、水管都一样，只有在建筑的后期才有加壁橱加栅栏等差异。
    * 西游记里面菩萨定好的 81 难，这就是一个顶层的逻辑骨架。 3、spring 中对 Hibernate 的支持，将一些已经定好的方法封装起来，比如开启事务、获取 Session、关闭 Session 等，程序员不重复写那些已经规范好的代码，直接丢一个实体就可以保存。
* 优点
    * 封装不变部分，扩展可变部分。
    * 提取公共代码，便于维护。 
    * 行为由父类控制，子类实现。
* 缺点
    * 每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。
* 使用场景
    * 有多个子类共有的方法，且逻辑相同。
    * 重要的、复杂的方法，可以考虑作为模板方法。
* 注意事项
    * 为防止恶意操作，一般模板方法都加上 final 关键词。

<a id="markdown-1107-建造者模式" name="1107-建造者模式"></a>
### 1.10.7. 建造者模式
<a href="#menu" style="float:right">目录</a>
建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。

![](https://www.runoob.com/wp-content/uploads/2014/08/builder_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
* 主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
* 何时使用
    * 一些基本部件不会变，而其组合经常变化的时候。
* 如何解决
    * 将变与不变分离开。
* 关键代码
    * 建造者：创建和提供实例，导演：管理建造出来的实例的依赖关系。
* 应用实例
    * 去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"。 
    * JAVA 中的 StringBuilder。
* 优点
    * 建造者独立，易扩展。
    * 便于控制细节风险。
* 缺点
    * 产品必须有共同点，范围有限制。
    * 如内部变化复杂，会有很多的建造类。
* 使用场景
    * 需要生成的对象具有复杂的内部结构。
    * 需要生成的对象内部属性本身相互依赖。
* 注意事项
    * 与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。
    
<a id="markdown-1108-代理模式" name="1108-代理模式"></a>
### 1.10.8. 代理模式
<a href="#menu" style="float:right">目录</a>

代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。

![](https://www.runoob.com/wp-content/uploads/2014/08/proxy_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 为其他对象提供一种代理以控制对这个对象的访问。
* 主要解决
    * 在直接访问对象时带来的问题，比如说：要访问的对象在远程的机器上。在面向对象系统中，有些对象由于某些原因（比如对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问），直接访问会给使用者或者系统结构带来很多麻烦，我们可以在访问此对象时加上一个对此对象的访问层。
* 何时使用
    * 想在访问一个类时做一些控制。
* 如何解决
    * 增加中间层。
* 关键代码
    * 实现与被代理类组合。
* 应用实例
    * Windows 里面的快捷方式。 
    * 猪八戒去找高翠兰结果是孙悟空变的，可以这样理解：把高翠兰的外貌抽象出来，高翠兰本人和孙悟空都实现了这个接口，猪八戒访问高翠兰的时候看不出来这个是孙悟空，所以说孙悟空是高翠兰代理类。 
    * 买火车票不一定在火车站买，也可以去代售点。
    * 一张支票或银行存单是账户中资金的代理。支票在市场交易中用来代替现金，并提供对签发人账号上资金的控制。 
    * spring aop。
* 优点
    * 职责清晰。 
    * 高扩展性。 
    * 智能化。
* 缺点
    * 由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢
    * 实现代理模式需要额外的工作，有些代理模式的实现非常复杂。
* 使用场景
    * 按职责来划分，通常有以下使用场景
        * 远程代理。 
        * 虚拟代理。 
        * Copy-on-Write 代理。 
        * 保护（Protect or Access）代理。 
        * Cache代理。 
        * 防火墙（Firewall）代理。 
        * 同步化（Synchronization）代理。 
        * 智能引用（Smart Reference）代理。
* 注意事项
    * 和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。 
    * 和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制。

<a id="markdown-1109-原型模式" name="1109-原型模式"></a>
### 1.10.9. 原型模式
<a href="#menu" style="float:right">目录</a>
原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。例如，一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。

![](https://www.runoob.com/wp-content/uploads/2014/08/prototype_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
* 主要解决
    * 在运行期建立和删除原型。
* 何时使用
    * 当一个系统应该独立于它的产品创建，构成和表示时。
    * 当要实例化的类是在运行时刻指定时，例如，通过动态装载。
    * 为了避免创建一个与产品类层次平行的工厂类层次时。
    * 当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。
* 如何解决
    * 利用已有的一个原型对象，快速地生成和原型对象一样的实例。
* 关键代码
    * 实现克隆操作，在 JAVA 继承 Cloneable，重写 clone()，在 .NET 中可以使用 Object 类的 MemberwiseClone() 方法来实现对象的浅拷贝或通过序列化的方式来实现深拷贝。 
    * 原型模式同样用于隔离类对象的使用者和具体类型（易变类）之间的耦合关系，它同样要求这些"易变类"拥有稳定的接口。
* 应用实例
    * 细胞分裂。 
    * JAVA 中的 Object clone() 方法。
* 优点
    * 性能提高。
    * 逃避构造函数的约束。
* 缺点
    * 配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类不是很难，但对于已有的类不一定很容易，特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候。
    * 必须实现 Cloneable 接口。
* 使用场景
    * 资源优化场景。
    * 类初始化需要消化非常多的资源，这个资源包括数据、硬件资源等。 
    * 性能和安全要求的场景。 
    * 通过 new 产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。 
    * 一个对象多个修改者的场景。 
    * 一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以考虑使用原型模式拷贝多个对象供调用者使用。
    * 在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过 clone 的方法创建一个对象，然后由工厂方法提供给调用者。原型模式已经与 Java 融为浑然一体，大家可以随手拿来使用。
* 注意事项
    * 与通过对一个类进行实例化来构造新对象不同的是，原型模式是通过拷贝一个现有对象生成新对象的。浅拷贝实现 Cloneable，重写，深拷贝是通过实现 Serializable 读取二进制流。

<a id="markdown-11010-中介者模式" name="11010-中介者模式"></a>
### 1.10.10. 中介者模式
<a href="#menu" style="float:right">目录</a>
中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。中介者模式属于行为型模式。

![](https://www.runoob.com/wp-content/uploads/2014/08/mediator_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
* 主要解决
    * 对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，同时若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时做出相应的处理。
* 何时使用
    * 多个类相互耦合，形成了网状结构。
* 如何解决
    * 将上述网状结构分离为星型结构。
* 关键代码
    * 对象 Colleague 之间的通信封装到一个类中单独处理。
* 应用实例
    * 中国加入 WTO 之前是各个国家相互贸易，结构复杂，现在是各个国家通过 WTO 来互相贸易。
    * 机场调度系统。 3、MVC 框架，其中C（控制器）就是 M（模型）和 V（视图）的中介者。
* 优点
    * 降低了类的复杂度，将一对多转化成了一对一。 
    * 各个类之间的解耦。 3、符合迪米特原则。
* 缺点
    * 中介者会庞大，变得复杂难以维护。
* 使用场景
    * 系统中对象之间存在比较复杂的引用关系，导致它们之间的依赖关系结构混乱而且难以复用该对象。 
    * 想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。
* 注意事项
    * 不应当在职责混乱的时候使用。


```java

```

<a id="markdown-11011-命令模式" name="11011-命令模式"></a>
### 1.10.11. 命令模式
<a href="#menu" style="float:right">目录</a>
命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。

![](https://www.runoob.com/wp-content/uploads/2014/08/command_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。
* 主要解决
    * 在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
* 何时使用
    * 在某些场合，比如要对行为进行"记录、撤销/重做、事务"等处理，这种无法抵御变化的紧耦合是不合适的。在这种情况下，如何将"行为请求者"与"行为实现者"解耦？将一组行为抽象为对象，可以实现二者之间的松耦合。
* 如何解决
    * 通过调用者调用接受者执行命令，顺序：调用者→接受者→命令。
* 关键代码
    * 定义三个角色：
        * received 真正的命令执行对象 
        * Command 
        * invoker 使用命令对象的入口
* 应用实例：
    * struts 1 中的 action 核心控制器 ActionServlet 只有一个，相当于 Invoker，而模型层的类会随着不同的应用有不同的模型类，相当于具体的 Command。
* 优点
    * 降低了系统耦合度。 
    * 新的命令可以很容易添加到系统中去。
* 缺点
    * 使用命令模式可能会导致某些系统有过多的具体命令类。
* 使用场景
    * 认为是命令的地方都可以使用命令模式，比如： 1、GUI 中每一个按钮都是一条命令。 2、模拟 CMD。
* 注意事项
    * 系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作，也可以考虑使用命令模式，见命令模式的扩展。
```java
public interface Order {
   void execute();
}
public class Stock {
   
   private String name = "ABC";
   private int quantity = 10;
 
   public void buy(){
      System.out.println("Stock [ Name: "+name+", 
         Quantity: " + quantity +" ] bought");
   }
   public void sell(){
      System.out.println("Stock [ Name: "+name+", 
         Quantity: " + quantity +" ] sold");
   }
}
public class BuyStock implements Order {
   private Stock abcStock;
 
   public BuyStock(Stock abcStock){
      this.abcStock = abcStock;
   }
 
   public void execute() {
      abcStock.buy();
   }
}
public class SellStock implements Order {
   private Stock abcStock;
 
   public SellStock(Stock abcStock){
      this.abcStock = abcStock;
   }
 
   public void execute() {
      abcStock.sell();
   }
}
public class Broker {
   private List<Order> orderList = new ArrayList<Order>(); 
 
   public void takeOrder(Order order){
      orderList.add(order);      
   }
 
   public void placeOrders(){
      for (Order order : orderList) {
         order.execute();
      }
      orderList.clear();
   }
}
public class CommandPatternDemo {
   public static void main(String[] args) {
      Stock abcStock = new Stock();
 
      BuyStock buyStockOrder = new BuyStock(abcStock);
      SellStock sellStockOrder = new SellStock(abcStock);
 
      Broker broker = new Broker();
      broker.takeOrder(buyStockOrder);
      broker.takeOrder(sellStockOrder);
 
      broker.placeOrders();
   }
}

```
<a id="markdown-11012-责任链模式" name="11012-责任链模式"></a>
### 1.10.12. 责任链模式
<a href="#menu" style="float:right">目录</a>
顾名思义，责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。

在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。

![]()

**介绍**
* 意图
    * 避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。
* 主要解决
    * 职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，所以职责链将请求的发送者和请求的处理者解耦了。
* 何时使用
    * 在处理消息的时候以过滤很多道。
* 如何解决
    * 拦截的类都实现统一接口。
* 关键代码
    * Handler 里面聚合它自己，在 HandlerRequest 里判断是否合适，如果没达到条件则向下传递，向谁传递之前 set 进去。
* 应用实例
    * 红楼梦中的"击鼓传花"。 
    * JS 中的事件冒泡。 
    * JAVA WEB 中 Apache Tomcat 对 Encoding 的处理，Struts2 的拦截器，jsp servlet 的 Filter。
* 优点
    * 降低耦合度。它将请求的发送者和接收者解耦。 
    * 简化了对象。使得对象不需要知道链的结构。 
    * 增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。 
    * 增加新的请求处理类很方便。
* 缺点
    * 不能保证请求一定被接收。 
    * 系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用。 
    * 可能不容易观察运行时的特征，有碍于除错。
* 使用场景
    * 有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定。 
    * 在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。 
    * 可动态指定一组对象处理请求。
* 注意事项
    * 在 JAVA WEB 中遇到很多应用。
    
<a id="markdown-11013-装饰模式" name="11013-装饰模式"></a>
### 1.10.13. 装饰模式
<a href="#menu" style="float:right">目录</a>
装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。

这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。

我们通过下面的实例来演示装饰器模式的用法。其中，我们将把一个形状装饰上不同的颜色，同时又不改变形状类。

![](https://www.runoob.com/wp-content/uploads/2014/08/decorator_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
* 主要解决
    * 一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。
* 何时使用
    * 在不想增加很多子类的情况下扩展类。
* 如何解决
    * 将具体功能职责划分，同时继承装饰者模式。
* 关键代码
    * Component 类充当抽象角色，不应该具体实现。 
    * 修饰类引用和继承 Component 类，具体扩展类重写父类方法。
* 应用实例
    * 孙悟空有 72 变，当他变成"庙宇"后，他的根本还是一只猴子，但是他又有了庙宇的功能。 
    * 不论一幅画有没有画框都可以挂在墙上，但是通常都是有画框的，并且实际上是画框被挂在墙上。在挂在墙上之前，画可以被蒙上玻璃，装到框子里；这时画、玻璃和画框形成了一个物体。
* 优点
    * 装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
* 缺点
    * 多层装饰比较复杂。
* 使用场景
    * 扩展一个类的功能。
    * 动态增加功能，动态撤销。
* 注意事项
    * 可代替继承。

<a id="markdown-11014-策略模式" name="11014-策略模式"></a>
### 1.10.14. 策略模式
<a href="#menu" style="float:right">目录</a>
在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。

在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。

![](https://www.runoob.com/wp-content/uploads/2014/08/strategy_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
* 主要解决
    * 在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
* 何时使用
    * 一个系统有许多许多类，而区分它们的只是他们直接的行为。
* 如何解决
    * 将这些算法封装成一个一个的类，任意地替换。
* 关键代码
    * 实现同一个接口。
* 应用实例
    * 诸葛亮的锦囊妙计，每一个锦囊就是一个策略。
    * 旅行的出游方式，选择骑自行车、坐汽车，每一种旅行方式都是一个策略。 
    * JAVA AWT 中的 LayoutManager。
* 优点
    * 算法可以自由切换。 
    * 避免使用多重条件判断。 
    * 扩展性良好。
* 缺点
    * 策略类会增多。 
    * 所有策略类都需要对外暴露。
* 使用场景
    * 如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为。
    * 一个系统需要动态地在几种算法中选择一种。
    * 如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用多重的条件选择语句来实现。
* 注意事项
    * 如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题。
```java
public interface Strategy {
   public int doOperation(int num1, int num2);
}
public class OperationAdd implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 + num2;
   }
}

public class OperationSubstract implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 - num2;
   }
}
public class OperationMultiply implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 * num2;
   }
}
public class Context {
   private Strategy strategy;
 
   public Context(Strategy strategy){
      this.strategy = strategy;
   }
 
   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
}
public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context(new OperationAdd());    
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
 
      context = new Context(new OperationSubstract());      
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
 
      context = new Context(new OperationMultiply());    
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
   }
}


```

<a id="markdown-11015-适配器模式" name="11015-适配器模式"></a>
### 1.10.15. 适配器模式
<a href="#menu" style="float:right">目录</a>
适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。

这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能。举个真实的例子，读卡器是作为内存卡和笔记本之间的适配器。您将内存卡插入读卡器，再将读卡器插入笔记本，这样就可以通过笔记本来读取内存卡。

我们通过下面的实例来演示适配器模式的使用。其中，音频播放器设备只能播放 mp3 文件，通过使用一个更高级的音频播放器来播放 vlc 和 mp4 文件。

![](https://www.runoob.com/wp-content/uploads/2014/08/adapter_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
* 主要解决
    * 主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，而新环境要求的接口是现对象不能满足的。
* 何时使用
    * 系统需要使用现有的类，而此类的接口不符合系统的需要。
    * 想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作，这些源类不一定有一致的接口。
    * 通过接口转换，将一个类插入另一个类系中。（比如老虎和飞禽，现在多了一个飞虎，在不增加实体的需求下，增加一个适配器，在里面包容一个虎对象，实现飞的接口。）
* 如何解决
    * 继承或依赖（推荐）。
* 关键代码
    * 适配器继承或依赖已有的对象，实现想要的目标接口。

* 应用实例
    * 美国电器 110V，中国 220V，就要有一个适配器将 110V 转化为 220V。 
    * JAVA JDK 1.1 提供了 Enumeration 接口，而在 1.2 中提供了 Iterator 接口，想要使用 1.2 的 JDK，则要将以前系统的 Enumeration 接口转化为 Iterator 接口，这时就需要适配器模式。
    * 在 LINUX 上运行 WINDOWS 程序。 
    * JAVA 中的 jdbc。
* 优点
    * 可以让任何两个没有关联的类一起运行。
    * 提高了类的复用。 
    * 增加了类的透明度。 
    * 灵活性好。
* 缺点
    * 过多地使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是 A 接口，其实内部被适配成了 B 接口的实现，一个系统如果太多出现这种情况，无异于一场灾难。因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构。 2.由于 JAVA 至多继承一个类，所以至多只能适配一个适配者类，而且目标类必须是抽象类。

* 使用场景
    * 有动机地修改一个正常运行的系统的接口，这时应该考虑使用适配器模式。
* 注意事项
    * 适配器不是在详细设计时添加的，而是解决正在服役的项目的问题。
```java
public interface MediaPlayer {
   public void play(String audioType, String fileName);
}
public interface AdvancedMediaPlayer { 
   public void playVlc(String fileName);
   public void playMp4(String fileName);
}
public class VlcPlayer implements AdvancedMediaPlayer{
   @Override
   public void playVlc(String fileName) {
      System.out.println("Playing vlc file. Name: "+ fileName);      
   }
 
   @Override
   public void playMp4(String fileName) {
      //什么也不做
   }
}
public class Mp4Player implements AdvancedMediaPlayer{
 
   @Override
   public void playVlc(String fileName) {
      //什么也不做
   }
 
   @Override
   public void playMp4(String fileName) {
      System.out.println("Playing mp4 file. Name: "+ fileName);      
   }
}
public class MediaAdapter implements MediaPlayer {
 
   AdvancedMediaPlayer advancedMusicPlayer;
 
   public MediaAdapter(String audioType){
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();       
      } else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }  
   }
 
   @Override
   public void play(String audioType, String fileName) {
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}
public class AudioPlayer implements MediaPlayer {
   MediaAdapter mediaAdapter; 
 
   @Override
   public void play(String audioType, String fileName) {    
 
      //播放 mp3 音乐文件的内置支持
      if(audioType.equalsIgnoreCase("mp3")){
         System.out.println("Playing mp3 file. Name: "+ fileName);         
      } 
      //mediaAdapter 提供了播放其他文件格式的支持
      else if(audioType.equalsIgnoreCase("vlc") 
         || audioType.equalsIgnoreCase("mp4")){
         mediaAdapter = new MediaAdapter(audioType);
         mediaAdapter.play(audioType, fileName);
      }
      else{
         System.out.println("Invalid media. "+
            audioType + " format not supported");
      }
   }   
}
public class AdapterPatternDemo {
   public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();
 
      audioPlayer.play("mp3", "beyond the horizon.mp3");
      audioPlayer.play("mp4", "alone.mp4");
      audioPlayer.play("vlc", "far far away.vlc");
      audioPlayer.play("avi", "mind me.avi");
   }
}

```

<a id="markdown-11016-迭代器模式" name="11016-迭代器模式"></a>
### 1.10.16. 迭代器模式
<a href="#menu" style="float:right">目录</a>
迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。

迭代器模式属于行为型模式。

![]()

**介绍** 
* 意图
    * 提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
* 主要解决
    * 不同的方式来遍历整个整合对象。
* 何时使用
    * 遍历一个聚合对象。
* 如何解决
    * 把在元素之间游走的责任交给迭代器，而不是聚合对象。
* 关键代码
    * 定义接口：hasNext, next。
* 应用实例
    * JAVA 中的 iterator。
* 优点
    * 它支持以不同的方式遍历一个聚合对象。
    * 迭代器简化了聚合类。
    * 在同一个聚合上可以有多个遍历。 
    * 在迭代器模式中，增加新的聚合类和迭代器类都很方便，无须修改原有代码。
* 缺点
    * 由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性。
* 使用场景
    * 访问一个聚合对象的内容而无须暴露它的内部表示。 
    * 需要为聚合对象提供多种遍历方式。 
    * 为遍历不同的聚合结构提供一个统一的接口。
* 注意事项
    * 迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器类来负责，这样既可以做到不暴露集合的内部结构，又可让外部代码透明地访问集合内部的数据。

<a id="markdown-11017-组合模式" name="11017-组合模式"></a>
### 1.10.17. 组合模式
<a href="#menu" style="float:right">目录</a>
组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。

这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。

我们通过下面的实例来演示组合模式的用法。实例演示了一个组织中员工的层次结构。

![]()

**介绍**  
* 意图
    * 将对象组合成树形结构以表示"部分-整体"的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
* 主要解决
    * 它在我们树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以向处理简单元素一样来处理复杂元素，从而使得客户程序与复杂元素的内部结构解耦。
* 何时使用
    * 您想表示对象的部分-整体层次结构（树形结构）。 
    * 您希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
* 如何解决
    * 树枝和叶子实现统一接口，树枝内部组合该接口。
* 关键代码
    * 树枝内部组合该接口，并且含有内部属性 List，里面放 Component。

* 应用实例
    * 算术表达式包括操作数、操作符和另一个操作数，其中，另一个操作符也可以是操作数、操作符和另一个操作数。
    * 在 JAVA AWT 和 SWING 中，对于 Button 和 Checkbox 是树叶，Container 是树枝。
* 优点
    * 高层模块调用简单。 
    * 节点自由增加。
* 缺点
    * 在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
* 使用场景
    * 部分、整体场景，如树形菜单，文件、文件夹的管理。
* 注意事项
    * 定义时为具体类。


<a id="markdown-11018-观察者模式" name="11018-观察者模式"></a>
### 1.10.18. 观察者模式
<a href="#menu" style="float:right">目录</a>
当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知它的依赖对象。观察者模式属于行为型模式。

![](https://www.runoob.com/wp-content/uploads/2014/08/observer_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
* 主要解决
    * 一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。
* 何时使用
    * 一个对象（目标对象）的状态发生改变，所有的依赖对象（观察者对象）都将得到通知，进行广播通知。
* 如何解决
    * 使用面向对象技术，可以将这种依赖关系弱化。
* 关键代码
    * 在抽象类里有一个 ArrayList 存放观察者们。
* 应用实例
    * 拍卖的时候，拍卖师观察最高标价，然后通知给其他竞价者竞价。 
    * 西游记里面悟空请求菩萨降服红孩儿，菩萨洒了一地水招来一个老乌龟，这个乌龟就是观察者，他观察菩萨洒水这个动作。
* 优点
    * 观察者和被观察者是抽象耦合的。 
    * 建立一套触发机制。
* 缺点
    * 如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。
    * 如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。 
    * 观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。
* 使用场景：
    * 一个抽象模型有两个方面，其中一个方面依赖于另一个方面。将这些方面封装在独立的对象中使它们可以各自独立地改变和复用。
    * 一个对象的改变将导致其他一个或多个对象也发生改变，而不知道具体有多少对象将发生改变，可以降低对象之间的耦合度。
    * 一个对象必须通知其他对象，而并不知道这些对象是谁。
    * 需要在系统中创建一个触发链，A对象的行为将影响B对象，B对象的行为将影响C对象……，可以使用观察者模式创建一种链式触发机制。
* 注意事项
    * JAVA 中已经有了对观察者模式的支持类。 
    * 避免循环引用。 
    * 如果顺序执行，某一观察者错误会导致系统卡壳，一般采用异步方式。
```java
public class Subject {
   
   private List<Observer> observers 
      = new ArrayList<Observer>();
   private int state;
 
   public int getState() {
      return state;
   }
 
   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }
 
   public void attach(Observer observer){
      observers.add(observer);      
   }
 
   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   }  
}
public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}
public class BinaryObserver extends Observer{
 
   public BinaryObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
 
   @Override
   public void update() {
      System.out.println( "Binary String: " 
      + Integer.toBinaryString( subject.getState() ) ); 
   }
}
public class OctalObserver extends Observer{
 
   public OctalObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
 
   @Override
   public void update() {
     System.out.println( "Octal String: " 
     + Integer.toOctalString( subject.getState() ) ); 
   }
}
public class HexaObserver extends Observer{
 
   public HexaObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
 
   @Override
   public void update() {
      System.out.println( "Hex String: " 
      + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
}
public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();
 
      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);
 
      System.out.println("First state change: 15");   
      subject.setState(15);
      System.out.println("Second state change: 10");  
      subject.setState(10);
   }
}

```

<a id="markdown-11019-门面模式" name="11019-门面模式"></a>
### 1.10.19. 门面模式
<a href="#menu" style="float:right">目录</a>
外观模式（Facade Pattern）隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。

这种模式涉及到一个单一的类，该类提供了客户端请求的简化方法和对现有系统类方法的委托调用。

![](https://www.runoob.com/wp-content/uploads/2014/08/facade_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
* 主要解决
    * 降低访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口。
* 何时使用
    * 客户端不需要知道系统内部的复杂联系，整个系统只需提供一个"接待员"即可。 
    * 定义系统的入口。
* 如何解决
    * 客户端不与系统耦合，外观类与系统耦合。
* 关键代码
    * 在客户端和复杂系统之间再加一层，这一层将调用顺序、依赖关系等处理好。
* 应用实例
    * 去医院看病，可能要去挂号、门诊、划价、取药，让患者或患者家属觉得很复杂，如果有提供接待人员，只让接待人员来处理，就很方便。
    * JAVA 的三层开发模式。
* 优点
    * 减少系统相互依赖。 
    * 提高灵活性。 
    * 提高了安全性。
* 缺点
    * 不符合开闭原则，如果要改东西很麻烦，继承重写都不合适。
* 使用场景
    * 为复杂的模块或子系统提供外界访问的模块。 
    * 子系统相对独立。 
    * 预防低水平人员带来的风险。
* 注意事项
    * 在层次化结构中，可以使用外观模式定义系统中每一层的入口。

<a id="markdown-11020-备忘录模式" name="11020-备忘录模式"></a>
### 1.10.20. 备忘录模式
<a href="#menu" style="float:right">目录</a>
备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。

![](https://www.runoob.com/wp-content/uploads/2014/08/memento_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
* 主要解决
    * 所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。
* 何时使用
    * 很多时候我们总是需要记录一个对象的内部状态，这样做的目的就是为了允许用户取消不确定或者错误的操作，能够恢复到他原先的状态，使得他有"后悔药"可吃。
* 如何解决
    * 通过一个备忘录类专门存储对象状态。
* 关键代码
    * 客户不与备忘录类耦合，与备忘录管理类耦合。
* 应用实例
    * 后悔药。 
    * 打游戏时的存档。 
    * Windows 里的 ctri + z。 
    * IE 中的后退。 
    * 数据库的事务管理。
* 优点
    * 给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。 
    * 实现了信息的封装，使得用户不需要关心状态的保存细节。
* 缺点
    * 消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。
* 使用场景
    * 需要保存/恢复数据的相关状态场景。 
    * 提供一个可回滚的操作。
* 注意事项
    * 为了符合迪米特原则，还要增加一个管理备忘录的类。 
    * 为了节约内存，可使用原型模式+备忘录模式。

```java
public class Memento {
   private String state;
 
   public Memento(String state){
      this.state = state;
   }
 
   public String getState(){
      return state;
   }  
}
public class Originator {
   private String state;
 
   public void setState(String state){
      this.state = state;
   }
 
   public String getState(){
      return state;
   }
 
   public Memento saveStateToMemento(){
      return new Memento(state);
   }
 
   public void getStateFromMemento(Memento Memento){
      state = Memento.getState();
   }
}

public class CareTaker {
   private List<Memento> mementoList = new ArrayList<Memento>();
 
   public void add(Memento state){
      mementoList.add(state);
   }
 
   public Memento get(int index){
      return mementoList.get(index);
   }
}
public class MementoPatternDemo {
   public static void main(String[] args) {
      Originator originator = new Originator();
      CareTaker careTaker = new CareTaker();
      originator.setState("State #1");
      originator.setState("State #2");
      careTaker.add(originator.saveStateToMemento());
      originator.setState("State #3");
      careTaker.add(originator.saveStateToMemento());
      originator.setState("State #4");
 
      System.out.println("Current State: " + originator.getState());    
      originator.getStateFromMemento(careTaker.get(0));
      System.out.println("First saved State: " + originator.getState());
      originator.getStateFromMemento(careTaker.get(1));
      System.out.println("Second saved State: " + originator.getState());
   }
}
```


<a id="markdown-11021-访问者模式" name="11021-访问者模式"></a>
### 1.10.21. 访问者模式
<a href="#menu" style="float:right">目录</a>
在访问者模式（Visitor Pattern）中，我们使用了一个访问者类，它改变了元素类的执行算法。通过这种方式，元素的执行算法可以随着访问者改变而改变。这种类型的设计模式属于行为型模式。根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。

![](https://www.runoob.com/wp-content/uploads/2014/08/visitor_pattern_uml_diagram.jpg)

**介绍**
* 意图
    * 主要将数据结构与数据操作分离。
* 主要解决
    * 稳定的数据结构和易变的操作耦合问题。
* 何时使用
    * 需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，使用访问者模式将这些封装到类中。
* 如何解决
    * 在被访问的类里面加一个对外提供接待访问者的接口。
* 关键代码
    * 在数据基础类里面有一个方法接受访问者，将自身引用传入访问者。
* 应用实例
    * 您在朋友家做客，您是访问者，朋友接受您的访问，您通过朋友的描述，然后对朋友的描述做出一个判断，这就是访问者模式。
* 优点
    * 符合单一职责原则。 
    * 优秀的扩展性。 
    * 灵活性。
* 缺点
    * 具体元素对访问者公布细节，违反了迪米特原则。 
    * 具体元素变更比较困难。 
    * 违反了依赖倒置原则，依赖了具体类，没有依赖抽象。
* 使用场景
    * 对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作。 
    * 需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，也不希望在增加新操作时修改这些类。
* 注意事项：访问者可以对功能进行统一，可以做报表、UI、拦截器与过滤器。
```java
public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}
public class Keyboard  implements ComputerPart {
 
   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}
public class Monitor  implements ComputerPart {
 
   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}

public class Mouse  implements ComputerPart {
 
   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}
public class Computer implements ComputerPart {
   
   ComputerPart[] parts;
 
   public Computer(){
      parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};      
   } 
 
 
   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      for (int i = 0; i < parts.length; i++) {
         parts[i].accept(computerPartVisitor);
      }
      computerPartVisitor.visit(this);
   }
}
public interface ComputerPartVisitor {
   public void visit(Computer computer);
   public void visit(Mouse mouse);
   public void visit(Keyboard keyboard);
   public void visit(Monitor monitor);
}
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
 
   @Override
   public void visit(Computer computer) {
      System.out.println("Displaying Computer.");
   }
 
   @Override
   public void visit(Mouse mouse) {
      System.out.println("Displaying Mouse.");
   }
 
   @Override
   public void visit(Keyboard keyboard) {
      System.out.println("Displaying Keyboard.");
   }
 
   @Override
   public void visit(Monitor monitor) {
      System.out.println("Displaying Monitor.");
   }
}
public class VisitorPatternDemo {
   public static void main(String[] args) {
 
      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
   }
}


```


<a id="markdown-11022-状态模式" name="11022-状态模式"></a>
### 1.10.22. 状态模式
<a href="#menu" style="float:right">目录</a>
在状态模式（State Pattern）中，类的行为是基于它的状态改变的。这种类型的设计模式属于行为型模式。

在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。

![](https://www.runoob.com/wp-content/uploads/2014/08/state_pattern_uml_diagram.png)
**介绍**
* 意图
    * 允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
* 主要解决
    * 对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。
* 何时使用
    * 代码中包含大量与对象状态有关的条件语句。
* 如何解决
    * 将各种具体的状态类抽象出来。
* 关键代码
    * 通常命令模式的接口中只有一个方法。而状态模式的接口中有一个或者多个方法。而且，状态模式的实现类的方法，一般返回值，或者是改变实例变量的值。也就是说，状态模式一般和对象的状态有关。实现类的方法有不同的功能，覆盖接口中的方法。状态模式和命令模式一样，也可以用于消除 if...else 等条件选择语句。
* 应用实例
    * 打篮球的时候运动员可以有正常状态、不正常状态和超常状态。 
    * 曾侯乙编钟中，'钟是抽象接口','钟A'等是具体状态，'曾侯乙编钟'是具体环境（Context）。
* 优点
    * 封装了转换规则。
    * 枚举可能的状态，在枚举状态之前需要确定状态种类。 
    * 将所有与某个状态有关的行为放到一个类中，并且可以方便地增加新的状态，只需要改变对象状态即可改变对象的行为。
    * 允许状态转换逻辑与状态对象合成一体，而不是某一个巨大的条件语句块。 
    * 可以让多个环境对象共享一个状态对象，从而减少系统中对象的个数。
* 缺点
    * 状态模式的使用必然会增加系统类和对象的个数。 
    * 状态模式的结构与实现都较为复杂，如果使用不当将导致程序结构和代码的混乱。 
    * 状态模式对"开闭原则"的支持并不太好，对于可以切换状态的状态模式，增加新的状态类需要修改那些负责状态转换的源代码，否则无法切换到新增状态，而且修改某个状态类的行为也需修改对应类的源代码。
* 使用场景
    * 行为随状态改变而改变的场景。 
    * 条件、分支语句的代替者。
* 注意事项
    * 在行为受状态约束的时候使用状态模式，而且状态不超过 5 个。
```java
public interface State {
   public void doAction(Context context);
}
public class StartState implements State {
 
   public void doAction(Context context) {
      System.out.println("Player is in start state");
      context.setState(this); 
   }
 
   public String toString(){
      return "Start State";
   }
}
public class StopState implements State {
 
   public void doAction(Context context) {
      System.out.println("Player is in stop state");
      context.setState(this); 
   }
 
   public String toString(){
      return "Stop State";
   }
}
public class Context {
   private State state;
 
   public Context(){
      state = null;
   }
 
   public void setState(State state){
      this.state = state;     
   }
 
   public State getState(){
      return state;
   }
}

public class StatePatternDemo {
   public static void main(String[] args) {
      Context context = new Context();
 
      StartState startState = new StartState();
      startState.doAction(context);
 
      System.out.println(context.getState().toString());
 
      StopState stopState = new StopState();
      stopState.doAction(context);
 
      System.out.println(context.getState().toString());
   }
}
```



<a id="markdown-11023-解释器模式" name="11023-解释器模式"></a>
### 1.10.23. 解释器模式
<a href="#menu" style="float:right">目录</a>
解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，它属于行为型模式。这种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。

![](https://www.runoob.com/wp-content/uploads/2014/08/interpreter_pattern_uml_diagram.jpg)
**介绍**
* 意图
    * 给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。
* 主要解决
    * 对于一些固定文法构建一个解释句子的解释器。
* 何时使用
    * 如果一种特定类型的问题发生的频率足够高，那么可能就值得将该问题的各个实例表述为一个简单语言中的句子。这样就可以构建一个解释器，该解释器通过解释这些句子来解决该问题。
* 如何解决
    * 构建语法树，定义终结符与非终结符。
* 关键代码
    * 构建环境类，包含解释器之外的一些全局信息，一般是 HashMap。
* 应用实例
    * 编译器、运算表达式计算。
* 优点
    * 可扩展性比较好，灵活。 
    * 增加了新的解释表达式的方式。
    * 易于实现简单文法。
* 缺点
    * 可利用场景比较少。 
    * 对于复杂的文法比较难维护。 
    * 解释器模式会引起类膨胀。 
    * 解释器模式采用递归调用方法。
* 使用场景
    * 可以将一个需要解释执行的语言中的句子表示为一个抽象语法树。 
    * 一些重复出现的问题可以用一种简单的语言来进行表达。 
    * 一个简单语法需要解释的场景。
* 注意事项
    * 可利用场景比较少，JAVA 中如果碰到可以用 expression4J 代替
```java

public interface Expression {
   public boolean interpret(String context);
}
public class TerminalExpression implements Expression {
   
   private String data;
 
   public TerminalExpression(String data){
      this.data = data; 
   }
 
   @Override
   public boolean interpret(String context) {
      if(context.contains(data)){
         return true;
      }
      return false;
   }
}
public class OrExpression implements Expression {
    
   private Expression expr1 = null;
   private Expression expr2 = null;
 
   public OrExpression(Expression expr1, Expression expr2) { 
      this.expr1 = expr1;
      this.expr2 = expr2;
   }
 
   @Override
   public boolean interpret(String context) {      
      return expr1.interpret(context) || expr2.interpret(context);
   }
}
public class AndExpression implements Expression {
    
   private Expression expr1 = null;
   private Expression expr2 = null;
 
   public AndExpression(Expression expr1, Expression expr2) { 
      this.expr1 = expr1;
      this.expr2 = expr2;
   }
 
   @Override
   public boolean interpret(String context) {      
      return expr1.interpret(context) && expr2.interpret(context);
   }
}
public class InterpreterPatternDemo {
 
   //规则：Robert 和 John 是男性
   public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert, john);    
   }
 
   //规则：Julie 是一个已婚的女性
   public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);    
   }
 
   public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();
 
      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie is a married women? " 
      + isMarriedWoman.interpret("Married Julie"));
   }
}
```


<a id="markdown-11024-享元模式" name="11024-享元模式"></a>
### 1.10.24. 享元模式
<a href="#menu" style="float:right">目录</a>
享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。

享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。我们将通过创建 5 个对象来画出 20 个分布于不同位置的圆来演示这种模式。由于只有 5 种可用的颜色，所以 color 属性被用来检查现有的 Circle 对象。

![](https://www.runoob.com/wp-content/uploads/2014/08/flyweight_pattern_uml_diagram-1.jpg)


**介绍**
* 意图
    * 运用共享技术有效地支持大量细粒度的对象。
* 主要解决
    * 在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建。
* 何时使用
    * 系统中有大量对象。 
    * 这些对象消耗大量内存。 
    * 这些对象的状态大部分可以外部化。 
    * 这些对象可以按照内蕴状态分为很多组，当把外蕴对象从对象中剔除出来时，每一组对象都可以用一个对象来代替。 
    * 系统不依赖于这些对象身份，这些对象是不可分辨的。
* 如何解决
    * 用唯一标识码判断，如果在内存中有，则返回这个唯一标识码所标识的对象。
* 关键代码
    * 用 HashMap 存储这些对象。
* 应用实例
    * JAVA 中的 String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面。
    * 数据库的数据池。
* 优点
    * 大大减少对象的创建，降低系统的内存，使效率提高。
* 缺点
    * 提高了系统的复杂度，需要分离出外部状态和内部状态，而且外部状态具有固有化的性质，不应该随着内部状态的变化而变化，否则会造成系统的混乱。
* 使用场景
    * 系统有大量相似对象
    * 需要缓冲池的场景。
* 注意事项
    * 注意划分外部状态和内部状态，否则可能会引起线程安全问题。
    * 这些类必须有一个工厂对象加以控制。


<a id="markdown-11025-桥梁模式" name="11025-桥梁模式"></a>
### 1.10.25. 桥梁模式
<a href="#menu" style="float:right">目录</a>
桥梁模式（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。

这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。

我们通过下面的实例来演示桥接模式（Bridge Pattern）的用法。其中，可以使用相同的抽象类方法但是不同的桥接实现类，来画出不同颜色的圆。

![](https://www.runoob.com/wp-content/uploads/2014/08/bridge_pattern_uml_diagram.jpg)
**介绍**



* 意图
    * 将抽象部分与实现部分分离，使它们都可以独立的变化。
* 主要解决
    * 在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
* 何时使用
    * 实现系统可能有多个角度分类，每一种角度都可能变化。
* 如何解决
    * 把这种多角度分类分离出来，让它们独立变化，减少它们之间耦合。
* 关键代码
    * 抽象类依赖实现类。
* 应用实例
    * 猪八戒从天蓬元帅转世投胎到猪，转世投胎的机制将尘世划分为两个等级，即：灵魂和肉体，前者相当于抽象化，后者相当于实现化。生灵通过功能的委派，调用肉体对象的功能，使得生灵可以动态地选择。 2、墙上的开关，可以看到的开关是抽象的，不用管里面具体怎么实现的。
* 优点
    * 抽象和实现的分离。 
    * 优秀的扩展能力。 
    * 实现细节对客户透明。
* 缺点
    * 桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。
* 使用场景
    * 如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系
    * 对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。 
    * 一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
* 注意事项
    * 对于两个独立变化的维度，使用桥接模式再适合不过了。
```java
public interface DrawAPI {
   public void drawCircle(int radius, int x, int y);
}
public class RedCircle implements DrawAPI {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing Circle[ color: red, radius: "
         + radius +", x: " +x+", "+ y +"]");
   }
}
public class GreenCircle implements DrawAPI {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing Circle[ color: green, radius: "
         + radius +", x: " +x+", "+ y +"]");
   }
}
public abstract class Shape {
   protected DrawAPI drawAPI;
   protected Shape(DrawAPI drawAPI){
      this.drawAPI = drawAPI;
   }
   public abstract void draw();  
}
public class Circle extends Shape {
   private int x, y, radius;
 
   public Circle(int x, int y, int radius, DrawAPI drawAPI) {
      super(drawAPI);
      this.x = x;  
      this.y = y;  
      this.radius = radius;
   }
 
   public void draw() {
      drawAPI.drawCircle(radius,x,y);
   }
}
public class BridgePatternDemo {
   public static void main(String[] args) {
      Shape redCircle = new Circle(100,100, 10, new RedCircle());
      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
 
      redCircle.draw();
      greenCircle.draw();
   }
}
```






