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
    - [1.7. Java编程思想阅读总结](#17-java编程思想阅读总结)
        - [1.7.1. 对象导论](#171-对象导论)
        - [1.7.2. 一切都是对象](#172-一切都是对象)
        - [1.7.3. 操作符](#173-操作符)
        - [1.7.4. 控制执行流程](#174-控制执行流程)
        - [1.7.5. 初始化和清理](#175-初始化和清理)
        - [1.7.6. 访问权限控制](#176-访问权限控制)
        - [1.7.7. 复用类](#177-复用类)
        - [1.7.8. 多态](#178-多态)
        - [1.7.9. 接口](#179-接口)
        - [1.7.10. 内部类](#1710-内部类)
        - [1.7.11. 持有对象](#1711-持有对象)
        - [1.7.12. 通过异常处理错误](#1712-通过异常处理错误)
        - [1.7.13. 字符串](#1713-字符串)
        - [1.7.14. 类型信息](#1714-类型信息)
        - [1.7.15. 范型](#1715-范型)
        - [1.7.16. 数组](#1716-数组)
        - [1.7.17. 容器深入研究](#1717-容器深入研究)
        - [1.7.18. Java IO系统](#1718-java-io系统)
        - [1.7.19. 枚举类型](#1719-枚举类型)
        - [1.7.20. 注解](#1720-注解)
        - [1.7.21. 并发](#1721-并发)
        - [1.7.22.](#1722)

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


### 1.2.4. 异常
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




### 1.2.5. 注解
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

### 1.2.6. IO
<a href="#menu" style="float:right">目录</a>

### 1.2.7. 反射
<a href="#menu" style="float:right">目录</a>

### 1.2.8. JDBC
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

![](https://github.com/lgjlife/Java-Study/blob/master/pic/designerPattern/uml.png?raw=true)

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


### 1.5.5. 抽象工厂模式
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

### 1.5.6. 模板方法模式
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

### 1.5.7. 建造者模式
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
    
### 1.5.8. 代理模式
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

### 1.5.9. 原型模式
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

### 1.5.10. 中介者模式
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

### 1.5.11. 命令模式
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
### 1.5.12. 责任链模式
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
    
### 1.5.13. 装饰模式
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

### 1.5.14. 策略模式
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

### 1.5.15. 适配器模式
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

### 1.5.16. 迭代器模式
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

### 1.5.17. 组合模式
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


### 1.5.18. 观察者模式
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

### 1.5.19. 门面模式
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

### 1.5.20. 备忘录模式
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


### 1.5.21. 访问者模式
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


### 1.5.22. 状态模式
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



### 1.5.23. 解释器模式
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


### 1.5.24. 享元模式
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


### 1.5.25. 桥梁模式
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

## 1.7. Java编程思想阅读总结

### 1.7.1. 对象导论

### 1.7.2. 一切都是对象

### 1.7.3. 操作符

### 1.7.4. 控制执行流程

### 1.7.5. 初始化和清理

### 1.7.6. 访问权限控制

### 1.7.7. 复用类

### 1.7.8. 多态

### 1.7.9. 接口

### 1.7.10. 内部类

### 1.7.11. 持有对象


### 1.7.12. 通过异常处理错误

### 1.7.13. 字符串

### 1.7.14. 类型信息


### 1.7.15. 范型

### 1.7.16. 数组


### 1.7.17. 容器深入研究

### 1.7.18. Java IO系统


### 1.7.19. 枚举类型

### 1.7.20. 注解

### 1.7.21. 并发

### 1.7.22.  


