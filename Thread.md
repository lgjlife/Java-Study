<span id="menu">

<h1>多线程</h1>
<!-- TOC -->

- [1. 多线程](#1-多线程)
    - [1.1. 基本概念](#11-基本概念)
    - [1.2. Java多线程](#12-java多线程)
        - [1.2.1. 实现方式](#121-实现方式)
        - [1.2.2. 基本属性](#122-基本属性)
        - [1.2.3. 常用方法](#123-常用方法)
        - [1.2.4. 生命周期 & 线程状态](#124-生命周期--线程状态)
        - [1.2.5. 线程监控工具](#125-线程监控工具)
    - [1.3. Synchronized](#13-synchronized)
        - [1.3.1. 基本概念](#131-基本概念)
        - [1.3.2. 基本使用](#132-基本使用)
        - [1.3.3. 实现原理](#133-实现原理)
    - [1.4. 线程间通信](#14-线程间通信)
        - [1.4.1. 基本概念](#141-基本概念)
        - [1.4.2. 实现消费者和生产者](#142-实现消费者和生产者)
    - [1.5. 线程同步机制](#15-线程同步机制)
        - [1.5.1. 线程同步机制概述](#151-线程同步机制概述)
        - [1.5.2. 锁概述](#152-锁概述)
        - [1.5.3. 内部锁Synchronized](#153-内部锁synchronized)
            - [基本概念](#基本概念)
            - [实现原理](#实现原理)
        - [1.5.4. 显示锁Lock](#154-显示锁lock)
        - [1.5.5. 锁适用场景](#155-锁适用场景)
        - [1.5.6. 内存屏障](#156-内存屏障)
        - [1.5.7. 锁与重排序](#157-锁与重排序)
        - [1.5.8. 提高锁性能方案](#158-提高锁性能方案)
        - [1.5.9. Java虚拟机的锁优化](#159-java虚拟机的锁优化)
    - [1.6. 并发编程的挑战](#16-并发编程的挑战)
        - [1.6.1. 上下文切换](#161-上下文切换)
        - [1.6.2. 死锁](#162-死锁)
        - [1.6.3. 饥饿](#163-饥饿)
        - [1.6.4. 活锁](#164-活锁)
        - [1.6.5. 内存同步](#165-内存同步)
        - [1.6.6. 阻塞](#166-阻塞)
        - [1.6.7. 资源的争用与调度](#167-资源的争用与调度)
    - [1.7. Java内存模型](#17-java内存模型)
        - [1.7.1. Java内存模型基础](#171-java内存模型基础)
        - [1.7.2. 重排序](#172-重排序)
            - [1.7.2.1. 基本概念](#1721-基本概念)
            - [1.7.2.2. 指令重排序](#1722-指令重排序)
            - [1.7.2.3. 存储子系统重构排序](#1723-存储子系统重构排序)
        - [1.7.3. 顺序一致性](#173-顺序一致性)
        - [1.7.4. volatile的内存语义](#174-volatile的内存语义)
        - [1.7.5. 锁的内存语义](#175-锁的内存语义)
        - [1.7.6. final的内存语义](#176-final的内存语义)
        - [1.7.7. happens-before](#177-happens-before)
        - [1.7.8. 双重检查锁定与延迟初始化](#178-双重检查锁定与延迟初始化)
        - [1.7.9. Java内存模型综述](#179-java内存模型综述)
    - [1.8. Java并发机制的底层实现原理](#18-java并发机制的底层实现原理)
    - [1.9. 并发编程基础](#19-并发编程基础)
    - [1.10. 并发容器和框架](#110-并发容器和框架)
        - [1.10.1. 常见的并发容器](#1101-常见的并发容器)
        - [1.10.2. Fork/Join框架](#1102-forkjoin框架)
            - [1.10.2.1. 基本概念](#11021-基本概念)
            - [1.10.2.2. 工作窃取算法](#11022-工作窃取算法)
            - [1.10.2.3. Fork/Join框架的设计](#11023-forkjoin框架的设计)
            - [1.10.2.4. 例子](#11024-例子)
            - [1.10.2.5. Fork/Join框架的异常处理](#11025-forkjoin框架的异常处理)
            - [1.10.2.6. 实现原理](#11026-实现原理)
    - [1.11. 原子操作类](#111-原子操作类)
        - [1.11.1. CAS算法](#1111-cas算法)
        - [1.11.2. 原子更新基本类型](#1112-原子更新基本类型)
        - [1.11.3. 原子更新数组](#1113-原子更新数组)
        - [1.11.4. 原子更新引用类型](#1114-原子更新引用类型)
        - [1.11.5. 原子更新字段类](#1115-原子更新字段类)
    - [1.12. 并发工具类](#112-并发工具类)
        - [1.12.1. 等待多线程完成的CountDownLatch](#1121-等待多线程完成的countdownlatch)
            - [1.12.1.1. 基本概念](#11211-基本概念)
            - [1.12.1.2. 实现原理](#11212-实现原理)
        - [1.12.2. 同步屏障CyclicBarrier](#1122-同步屏障cyclicbarrier)
            - [1.12.2.1. 实现原理](#11221-实现原理)
        - [1.12.3. 控制并发线程数的Semaphore](#1123-控制并发线程数的semaphore)
            - [1.12.3.1. 基本概念](#11231-基本概念)
            - [1.12.3.2. 实现原理](#11232-实现原理)
        - [1.12.4. 线程间交换数据的Exchanger](#1124-线程间交换数据的exchanger)
        - [1.12.5. FutureTask](#1125-futuretask)
            - [1.12.5.1. Callable与Runnable](#11251-callable与runnable)
            - [1.12.5.2. Future](#11252-future)
            - [1.12.5.3. FutureTask](#11253-futuretask)
            - [1.12.5.4. 使用示例](#11254-使用示例)
    - [1.13. 线程池](#113-线程池)
        - [1.13.1. 线程池的实现原理](#1131-线程池的实现原理)
        - [1.13.2. 线程池的使用](#1132-线程池的使用)
        - [1.13.3. 提交任务](#1133-提交任务)
        - [1.13.4. 关闭线程池](#1134-关闭线程池)
        - [1.13.5. 合理地配置线程池](#1135-合理地配置线程池)
        - [1.13.6. 线程池的监控](#1136-线程池的监控)
    - [1.14. Executor框架](#114-executor框架)
        - [1.14.1. Executor体系](#1141-executor体系)
        - [1.14.2. Executors](#1142-executors)
    - [1.15. 并发编程实战](#115-并发编程实战)
    - [1.16. 队列](#116-队列)
        - [1.16.1. JDK队列概述](#1161-jdk队列概述)
        - [1.16.2. DelayedWorkQueue](#1162-delayedworkqueue)

<!-- /TOC -->

# 1. 多线程
## 1.1. 基本概念
<a href="#menu" style="float:right">目录</a>

* 进程
    * 受操作系统管理和资源分配的基本单元，进程之间的内存空间是相互独立的。
* 线程
    * 进程中独立运行的子任务，线程共享进程内存空间。
* 串行&并行&并发
    * 串行:一个任务执行完再去执行其他任务
    * 并行:任务交替执行，就好象同时执行一样
    * 并发:任务同步执行，多核CPU的计算机，可以同步执行任务
* 使用多线程
    * 优点
        * 多核CPU的时候，可以有效利用多核提高程序执行效率
        * 在程序任务阻塞的场景下，利用多线程执行其他任务，提高执行效率
    * 缺点
        * 上下文切换时的时间开销
            * vmstat(unix)和perfmon(win)可以查看
        * 需要保证内存同步
* 临界区
    * 临界区用来表示一种公共资源或者共享数据
* 线程安全
    * 一段操纵共享数据的代码能够保证在同一时间内被多个线程执行而仍然能够保持其正确性，就被称为是线程安全的

* 死锁
    * 多个线程阻塞在临界区，都无法获取到锁，程序无法继续执行
* 饥饿锁
    * 一个线程因为种种原因无法获取到所需要的资源，导致一直无法执行，比如线程优先级低。
* 活锁
    * 主动将资源让给他人而自己无法执行。
* 并发级别
    * 阻塞
    * 无饥饿
    * 无障碍
    * 无锁
    * 无等待
* JMM模型
    * 原子性
        * 一组不能够被打断的操作具有原子性
    * 可见性
        * 一个线程修改了某个变量的值，其他线程是否能改看到该值的变化
    * 有序性
        * 在执行程序时，为了提高性能，编译器和处理器常常会对指令进行重排序
    * Happen-before原则
        * 程序顺序规则：一个线程中的每个操作，happens-before于该线程中的任意后续操作。
        * 监视器锁规则：对一个锁的解锁，happens-before于随后对这个锁的加锁。
        * volatile变量规则：对一个volatile域的写，happens-before于任意后续对这个volatile域的读。
        * 传递性：如果A happens-before B，且B happens-before C，那么A happens-before C。
        * start()规则：如果线程A执行操作ThreadB.start()（启动线程B），那么A线程的ThreadB.start()操作happens-before于线程B中的任意操作。
        * Join()规则：如果线程A执行操作ThreadB.join()并成功返回，那么线程B中的任意操作happens-before于线程A从ThreadB.join()操作成功返回。
        * 程序中断规则：对线程interrupted()方法的调用先行于被中断线程的代码检测到中断时间的发生。
        * 对象finalize规则：一个对象的初始化完成（构造函数执行结束）先行于发生它的finalize()方法的开始

* 发布和逸出
    * 发布
        * 使对象能够在当前作用域之外的代码中使用
            * 将一个指向该对象的引用保存到其他代码可以访问的地方
            * 在某一个非私有的方法中返回该引用
            * 将引用传递到其他类的方法中
        * 发布可能会影响线程安全性
    * 逸出
        * 当某个不应该发布的对象被发布时，就叫做逸出

* 解决线程安全问题
    * 使用各种锁来实现同步
    * 线程封闭
        * 共享可变数据会存在线程安全问题，避免线程安全问题可以不共享该数据，也就是线程封闭。比如说局部变量。ThreadLocal实现。
    * 使用不可变对象，也就是只读变量


## 1.2. Java多线程
<a href="#menu" style="float:right">目录</a>

### 1.2.1. 实现方式
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

### 1.2.2. 基本属性
* 线程名称，主线程为main，其他线程为Thread-1,Thread-2,可自定义，用于区分不同的线程。
* 线程分组
* 线程优先级
* 守护线程标志，默认为非守护线程

### 1.2.3. 常用方法

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
    
### 1.2.4. 生命周期 & 线程状态

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
### 1.2.5. 线程监控工具
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

## 1.3. Synchronized
<a href="#menu" style="float:right">目录</a>
### 1.3.1. 基本概念
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

### 1.3.2. 基本使用
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
### 1.3.3. 实现原理
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


## 1.4. 线程间通信
### 1.4.1. 基本概念
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

### 1.4.2. 实现消费者和生产者

## 1.5. 线程同步机制
<a href="#menu" style="float:right">目录</a>
线程同步机制是一套用于协调线程间的数据访问及活动的机制，用于保障线程安全。

### 1.5.1. 线程同步机制概述
<a href="#menu" style="float:right">目录</a>


### 1.5.2. 锁概述
<a href="#menu" style="float:right">目录</a>

* 锁可以理解为对共享数据访问的许可证，对于任何一个许可证锁保持的共享数据，任何线程访问这些共享数据前都要获取到锁。并且只有释放之后其他线程才能以同样的方式获取到锁并进行访问
* 锁分类
    * 排他锁(互斥锁)
        * 具有排他性，也就是一个锁一次只能被一个线程锁持有。
    * 共享锁  
        * 共享锁，任何线程都可以访问
        * 常见的场景有读共享，写排他
    * 内部锁
        * 虚拟机内部实现，比如Synchronized
    * 显示锁
        * JDK的Lock接口实现类

* **锁的作用**
    * 资源互斥访问，避免并发问题
    * 整个临界区代码具有原子性
    * 保证可见性
        * 可见性的保障是通过写线程冲刷处理器缓存和读线程刷新处理器缓存这两个操作实现的
        * Java中，锁的获得隐含着刷新处理器缓存这个动作，锁的释放隐含着刷新处理器缓存的操作。因此对变量的任何修改都会更新到主内存中去。
    * 保证有序性
        * 只是保证整体有序性
        * 临界区内的代码仍然可能发生指令重排序，但不会重排序到临界区外。
    * 要保证以上特性，必须保证操作同一种数据加的是同一把锁

* **与锁相关的几个概念**
    * 可重入性
        * 一个线程在其持有一个锁的情况下能否多次获取到该锁。
        * 比如方法A和B都是使用同一把锁，A中调用B，如果没有可重入性，将会发生死锁。
    * 锁的争用与调度
        * Java锁的调度策略包括公平策略和非公平策略
        * 内部锁是非公平锁，Lock两个都支持
    * 锁的粒度
        * 一个锁所保护的资源的大小称为锁的粒度。比如一条语句和多条语句的差别。
        * 有些没必要的语句就无需加锁，提高程序的执行效率。

* **使用锁需要注意的问题**
    * 锁泄漏
        * 获取锁之后，任务执行完成，但是没有释放锁，其他线程也就无法获取到锁。将会发生死锁。
    * 锁的不正确使用出现死锁

### 1.5.3. 内部锁Synchronized

<a href="#menu" style="float:right">目录</a>

#### 基本概念

* synchronized的作用主要有三个
    * 确保线程互斥的访问同步代码
    * 保证共享变量的修改能够及时可见
    * 有效解决重排序问题。
* synchronized具备重入特性
* synchronized修饰的方法没有继承特性，也就是父类修饰了，子类重载的方法也要修饰才能具备同步特性
* 可以修饰方法或者局部代码块,修饰代码块时同步的对象可以是任何对象或者类

普通同步方法，锁是当前实例对象
```java

public synchronized void func(){

}

public void func(){
    synchronized(this){
        
    }

    synchronized(xxx.class){
        
    }
    synchronized(obj){
        
    }
}
```
* 还可以修饰静态方法，此时同步的对象就是类.以下同步的对象都是A.class

静态同步方法，锁是当前类的class对象
```java
Class A{
     public static synchronized void func(){

    }

    public void func(){
          synchronized(A.class){
            
        }   
    }
}
```


#### 实现原理
Java 虚拟机中的同步(Synchronization)基于进入和退出Monitor对象实现， 无论是显式同步(有明确的monitorenter 和 monitorexit 指令,即同步代码块)还是隐式同步都是如此。在 Java 语言中，同步用的最多的地方可能是被 synchronized 修饰的同步方法。同步方法 并不是由 monitorenter 和 monitorexit 指令来实现同步的，而是由方法调用指令读取运行时常量池中方法表结构的 ACC_SYNCHRONIZED 标志来隐式实现的，关于这点，稍后详细分析。

同步代码块：monitorenter指令插入到同步代码块的开始位置，monitorexit指令插入到同步代码块的结束位置，JVM需要保证每一个monitorenter都有一个monitorexit与之相对应。任何对象都有一个monitor与之相关联，当且一个monitor被持有之后，他将处于锁定状态。线程执行到monitorenter指令时，将会尝试获取对象所对应的monitor所有权，即尝试获取对象的锁；

在JVM中，对象在内存中的布局分为三块区域：对象头、实例变量和填充数据。如下

@import "/pic/thread/synchronized-1.png"


### 1.5.4. 显示锁Lock
<a href="#menu" style="float:right">目录</a>


### 1.5.5. 锁适用场景
<a href="#menu" style="float:right">目录</a>


### 1.5.6. 内存屏障
<a href="#menu" style="float:right">目录</a>


### 1.5.7. 锁与重排序
<a href="#menu" style="float:right">目录</a>

### 1.5.8. 提高锁性能方案
<a href="#menu" style="float:right">目录</a>

**减少锁持有的时间**
**减少锁粒度**
**使用读写分离锁来替换独占锁**
* 适合读多写少的场景

**锁分段**
比如一个数组，前部分使用一个锁，后部分使用一个锁。只有全局操作时才使用同一个锁。
旧版本的ConcurrentHashmap使用的就是分段锁

**锁分离**
* 也就是使用不同的锁进行控制，比如读写锁

**锁粗化**
* 虚拟机在遇到一连串连续地对同一个锁不断进行请求和释放的操作，便会把所有的锁操作整合成对锁的一次请求，从而减少对锁的请求的同步次数。



### 1.5.9. Java虚拟机的锁优化
<a href="#menu" style="float:right">目录</a>

**锁偏向**
锁偏向是一种针对加锁操作的优化手段。

如果一个线程获得了锁，那么锁就进入偏向模式。当这个线程再次请求锁时，无须再做任何同步操作。这样就节省了大量有关锁申请的操作，从而提高了程序性能。因此，对于几乎没有锁竞争的场合，偏向锁有比较红啊的优化效果，因为连续多次极有可能是同一个线程请求相同的锁。而对于锁竞争比较激烈的场合，其效果不佳。因为在竞争激烈的场合，最有可能的情况是每次都是不同的线程来请求相同的锁。

**轻量级锁**
如果偏向锁失败，即上一个请求的锁的线程和这个线程不是同一个。偏向锁失败意味者不能避免做同步操作。此时，虚拟机并不会立即挂起线程。他会使用一种成为轻量级锁的优化手段。 轻量级锁的操作也很方便，它只是简单地将对象头部作为指针，指向蚩尤锁的线程堆栈的内部，来判断一个线程是否持有对象锁。 如果线程获得轻量级锁成功，则可以顺利进入临界区。如果轻量级锁失败，则表示其他线程抢先争夺了锁，那么当前线程的锁请求就会膨胀为重量级锁。

**自选锁**
锁膨胀后，虚拟机为了避免线程真实地在操作系统层面挂起，虚拟机还会在做最后的努力–自选锁。由于当前线程暂时无法获得锁，但是什么时候可以获得锁是一个未知数。也许在CPU几个时钟周期后，就可以得到锁。如果这样，简单粗暴的挂起线程可能是一种得不偿失的操作，因此系统会进行一次赌注：它会假设在不久的将来，线程可以得到这把锁。因此虚拟机让当前线程做个空循环，在经过若干次循环后，如果可以得到锁，那么就顺利进入临界区。如果还不能得到锁，才会真实地将线程在操作系统层面挂起。

**锁消除**
锁消除是一种更彻底的锁优化。Java虚拟机在JIT编译时，通过对运行上下文的扫描，去除不可能存在共享资源竞争的锁。通过锁消除，可以节省毫无意义的请求锁时间。

下面这种这种情况，我们使用vector， 而vector内部使用了synchronize请求锁。

```java
public String []  createStrings(){
    Vector<String>  v= new Vector<String>();
    for(int i=0;i<100;i++){
        v.add(Integer.toString(i));
    }
    return v.toArray(new String[]{});
}
```
由于V只在函数 createStrnigs 中使用，因此它只是一个单纯的局部变量。局部变量是在线程栈上分配的，属于线程私有额数据，因此不可能被其他线程访问。所以，在这种情况下，Vector内部所有加锁同步都是没有必要的。如果虚拟机检测到这种情况，就会将这些无用的锁操作去除。

锁消除涉及的一项关键技术为逃逸分析。所谓逃逸分析就是观察某一个变量是否会逃出某一个作用域。在本例中，变量v显然没有逃出createString 函数之外。以此为基础，虚拟机才可以大胆的将v内部的加锁操作去除。如果createStrings 返回的不是String数组，而是v本身，那么就认为变量v逃逸出了当前函数，也就是说v有可能被其他线程访问。如是这样，虚拟机就不能消除v中的锁操作。

逃逸分析必须在 -server 模式下进行，可以使用 -XX:DoEscapeAnalysis 参数打开逃逸分析，使用 -XX:+EliminateLocks 参数可以打开锁消除。


## 1.6. 并发编程的挑战
<a href="#menu" style="float:right">目录</a>

### 1.6.1. 上下文切换
<a href="#menu" style="float:right">目录</a>

**基本概念**
* 即使是单核处理器也支持多线程执行代码，CPU通过给每个线程分配CPU时间片来实现这个机制。时间片是CPU分配给各个线程的时间，因为时间片非常短，所以CPU通过不停地切换线程执行，让我们感觉多个线程是同时执行的，时间片一般是几十毫秒（ms）.
* CPU通过时间片分配算法来循环执行任务，当前任务执行一个时间片后会切换到下一个任务。但是，在切换前会保存上一个任务的状态，以便下次切换回这个任务时，可以再加载这个任务的状态。所以任务从保存到再加载的过程就是一次上下文切换
* 由于每次切换都要进行状态保存与恢复等操作，因此切换越多，运行效率会降低。
* 可以使用vmstat进行检测，后面的参数为间隔时间。cs（Content switch）为切换次数



**上下文切换分类**
* 自发性上下文切换
    * 调用相关方法：sleep,wait,tield,join,park
    * 发起IO操作或者等待锁的时候
* 非自发性上下文切换
    * 操作系统进行线程任务调度

**上下文切换的开销和测量**

* 开销分类
    * 直接开销
        * 操作系统保存和恢复上下文所需的开销，这主要是处理器的时间开销
        * 线程调度器进行线程调度的开销（决定哪个线程获得执行）
    * 间接开销
        * 处理器高速缓存重新加载的开销。一个被切出的线程可能稍后在另外一个处理器上被切入继续运行。由于这个处理器之前可能未运行过该线程，那么这个线程在器继续运行过程中需要访问的变量仍然需要被该处理器重新从主内存或者通过缓存一致性协议从其他处理器加载到高速内存之中
        * 上下文切换也可能导致整个一级高速缓存中的内容被冲刷。即一级高速缓存中的内容 会被写入下一级高速缓存或者主内存。
    *一般上下文的消耗时间等级微秒级的

* 查看上下文切换次数
    * LINUX -- vmstat
    * WIN -- perfmon

以下的cs即为上下文切换次数。
```bash
lgj@lgj-Lenovo-G470:~$ vmstat 5
procs -----------memory---------- ---swap-- -----io---- -system-- ------cpu-----
 r  b   swpd   free   buff  cache   si   so    bi    bo   in   cs us sy id wa st
 0  0      0 4736560 160668 2391128    0    0   127    66  260 1105 11  3 82  4  0
 0  0      0 4733284 160676 2406392    0    0     0     2 1064 4337  8  2 90  0  0

```
* 使用Lmbench3可以测量上下文切换的时长



**如何减少上下文切换**
* 无锁并发编程
    * 避免多线程争抢数据
* CAS算法
    * JDK的原子类使用了CAS算法,CAS算法是乐观锁，每次修改时进行比较，比较失败则进行重试，直到成功
* 使用最少线程
    * 避免无限使用更多的线程，原则上IO阻塞型使用较多的线程，CPU密集型使用较少的线程
* 使用协程
    * 在单线程里实现多任务的调度，并在但线程里维持多个任务间的切换
    

### 1.6.2. 死锁
<a href="#menu" style="float:right">目录</a>

```java
public class DeadLockDemo {
    privat static String A = "A";
    private static String B = "B";
    public static void main(String[] args) {
        new DeadLockDemo().deadLock();
    }
    private void deadLock() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            publicvoid run() {
                synchronized (A) {
                    try { 
                        Thread.currentThread().sleep(2000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
            
                    }
                    synchronized (B) {
                    System.out.println("1");
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            publicvoid run() {
                synchronized (B) {
                    synchronized (A) {
                        System.out.println("2");
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
```
* 避免死锁的几个常见方法。
    * 避免一个线程同时获取多个锁。
    * 避免一个线程在锁内同时占用多个资源，尽量保证每个锁只占用一个资源。
    * 尝试使用定时锁，使用lock.tryLock（timeout）来替代使用内部锁机制。
    * 对于数据库锁，加锁和解锁必须在一个数据库连接里，否则会出现解锁失败的情况

### 1.6.3. 饥饿

当线程由于无法访问它所需的资源而不能继续执行时，就发生了饥饿(Starvation)。
引发饥饿的一般是由于线程的优先级比较低或者使用非公平锁时出现。

### 1.6.4. 活锁
线程可能一直处于可运行态，但是所要执行的任务一直无法进行。

### 1.6.5. 内存同步

在synchronized和volatile提供的可见性中使用一些特殊指令，即内存栅栏(Memory Barrier)，内存栅栏可以刷新缓存，使缓存无效，刷新硬件的写缓冲，以及停止执行管道。
内存栅栏可能同样对性能带来间接的影响，因为会抑制编译器的优化，在内存栅栏中，大多数操作都是不能被重排序的。


### 1.6.6. 阻塞

当一个线程发生阻塞时，操作系统会切换其他线程执行，这时发生一次上下文切换。当阻塞直到获取到资源时，再次发生一次上下文切换。

### 1.6.7. 资源的争用与调度

多个线程申请同一个排他性资源的情况下，决定哪个线程会获取到该资源的独占权，就是资源的调度。
资源的调度常见的一个特性是是否保持公平。
如果一个资源先申请则先获取到，则认为是公平的，反之则不公平。

* 公平调度策略
    * 维护一个内部队列来保证公平性
    * 按照先来后到的顺序来获取资源独占权
    * 吞吐率较小，可以避免饥饿问题
* 非公平调度策略
    * 允许插队现象，即一个线程释放其资源独占权的时候，等待队列中的一个线程会被唤醒再次申请相应的资源，而在这个过程中活跃线程(RUNABLE)页也将会参与争抢过程。
    * 非公平策略可能会出现饥饿问题
    * 吞吐率较大

## 1.7. Java内存模型
<a href="#menu" style="float:right">目录</a>

### 1.7.1. Java内存模型基础
<a href="#menu" style="float:right">目录</a>


### 1.7.2. 重排序
<a href="#menu" style="float:right">目录</a>

#### 1.7.2.1. 基本概念

* 重排序是指编译器和处理器为了优化程序性能而对指令序列进行重新排序的一种手段。
* 编译器和处理器可能会对操作做重排序。编译器和处理器在重排序时，会遵守数据依赖性，编译器和处理器不会改变存在数据依赖关系的两个操作的执行顺序。
* 这里所说的数据依赖性仅针对**单个处理器**中执行的指令序列和**单个线程**中执行的操作，**不同处理器**之间和**不同线程**之间的数据依赖性不被编译器和处理器考虑

* 重排序是对内存有关的操作(读写)所做的一种优化，可以在不影响单线程程序的正确性的情况下提升程序的性能。但是可能会对多线程程序的正确执行有影响。

* 指令重排序的来源一般有编译器，处理器，和存储子系统(写缓冲，高速缓存)。

```java
int a = 1;
int b = 2;
int c = a + b;
```
a happens-before b;
b happens-before c;
a happens-before c;

如上的例子，第一行和第二行没有依赖关系，因此可能会发生指令重排序。第三行和前面都有关，因此不会和前面的语句发生指令重排序。

```java
class ReorderExample {
    int a = 0;
    boolean flag = false;
    public void writer() {
        a = 1; // 1
        flag = true; // 2
    } 
    Public void reader() {
        if (flag) { // 3
            int i = a * a; // 4

        }
    }
}

```
两个线程分别执行writer()和reader()。reader()不一定能看到其他线程对a的写入修改。

操作1和2没有数据依赖关系，因此可能会发生指令重排序。同理3和4。因此执行到4时，a的值可能还是0.


**相关术语**
* 源代码顺序
    * 源代码中指定的内存访问操作顺序
* 程序顺序
    * 在给定的处理器上运行的目标代码(Java的字节码)所指定的访问操作顺序。
* 执行顺序
    * 内存访问操作在给定的处理器上实际执行的顺序
* 感知顺序
    * 最终执行时锁呈现的访问顺序

**重排序类型**


|重排序类型|重排序表现|重排序来源|
|---|---|--|
|指令重排序|程序执行顺序|编译器|
| ^ |执行顺序与程序顺序不一致|JIT编译器，处理器|
|存储子系统重排序|源代码顺序，程序顺序和执行顺序保持一类；感知顺序和执行顺序不一致|高速缓存，写缓冲器|

#### 1.7.2.2. 指令重排序

* Java平台包含两种编译器：
    * 静态编译器(Javax)
        * 将Java源码编译为字节码，它是在代码编译阶段介入的
        * 基本上不会执行指令重排序
    * 动态编译器(JIT编译器)
        * 将字节码动态编译为Java虚拟机宿主主机的本地代码(机器码)，它是在运行期介入的
        * 可能会发生指令重排序
    
* 处理器也可能执行指令重排序，这使得执行顺序和程序顺序不一致。现代处理器为了提高指令的执行效率。会进行动态调整，哪条就绪就先执行哪条指令，这就是处理器的乱序执行。
        
#### 1.7.2.3. 存储子系统重构排序

* 主内存（RAM）相对于处理器是一个慢速设备。因此处理器并不是直接访问主内存，而是通过高速缓存访问主内存。在此基础上，还引入了写缓冲器。先往写缓冲器里写入数据，再一次性写入到主内存中。



### 1.7.3. 顺序一致性
<a href="#menu" style="float:right">目录</a>

### 1.7.4. volatile的内存语义
<a href="#menu" style="float:right">目录</a>

**特性**
* 内存可见性
    * 对一个volatile变量的读，总是能看到（任意线程）对这个volatile变量最后的写入
* 保证变量读写是原子性的
    * 对任意单个volatile变量的读/写具有原子性，但类似于volatile++这种复合操作不
具有原子性。
* 禁止指令重排序

**volatile写的内存语义如下**
当写一个volatile变量时，JMM会把该线程对应的本地内存中的共享变量值刷新到主内存


### 1.7.5. 锁的内存语义
<a href="#menu" style="float:right">目录</a>

### 1.7.6. final的内存语义
<a href="#menu" style="float:right">目录</a>

### 1.7.7. happens-before
<a href="#menu" style="float:right">目录</a>


### 1.7.8. 双重检查锁定与延迟初始化
<a href="#menu" style="float:right">目录</a>

### 1.7.9. Java内存模型综述
<a href="#menu" style="float:right">目录</a>

## 1.8. Java并发机制的底层实现原理
<a href="#menu" style="float:right">目录</a>


## 1.9. 并发编程基础
<a href="#menu" style="float:right">目录</a>




## 1.10. 并发容器和框架
<a href="#menu" style="float:right">目录</a>

### 1.10.1. 常见的并发容器
<a href="#menu" style="float:right">目录</a>

* ConcurrentHashMap
* ConcurrentLinkedDeque
* ConcurrentLinkedQueue
* ConcurrentSkipListMap
* ConcurrentSkipListSet
* CopyOnWriteArrayList
* CopyOnWriteArraySet


### 1.10.2. Fork/Join框架
<a href="#menu" style="float:right">目录</a>

#### 1.10.2.1. 基本概念

Fork/Join框架是Java 7提供的一个用于并行执行任务的框架，是一个把大任务分割成若干个小任务，最终汇总每个小任务结果后得到大任务结果的框架
Fork就是把一个大任务切分为若干子任务并行的执行，Join就是合并这些子任务的执行结果，最后得到这个大任务的结果。比如计算1+2+…+10000，每个子任务分别对1000个数进行求和，最终汇总这10个子任务的结果。

![](https://yqfile.alicdn.com/3fa26593c0270f0ef92dfc9daf3013ca9e29dc7b.png)

#### 1.10.2.2. 工作窃取算法
工作窃取（work-stealing）算法是指某个线程从其他队列里窃取任务来执行。那么，为什么需要使用工作窃取算法呢？ 假如我们需要做一个比较大的任务，可以把这个任务分割为若干互不依赖的子任务，为了减少线程间的竞争，把这些子任务分别放到不同的队列里，并为每个队列创建一个单独的线程来执行队列里的任务，线程和队列一一对应。比如A线程负责处理A队列里的任务。但是，有的线程会先把自己队列里的任务干完，而其他线程对应的队列里还有任务等待处理。干完活的线程与其等着，不如去帮其他线程干活，于是它就去其他线程的队列里窃取一个任务来执行。而在这时它们会访问同一个队列，所以为了减少窃取任务线程和被窃取任务线程之间的竞争，通常会使用双端队列，被窃取任务线程永远从双端队列的头部拿任务执行，而窃取任务的线程永远从双端队列的尾部拿任务执行

* 工作窃取算法的优点：充分利用线程进行并行计算，减少了线程间的竞争。
* 工作窃取算法的缺点：在某些情况下还是存在竞争，比如双端队列里只有一个任务时。并且该算法会消耗了更多的系统资源，比如创建多个线程和多个双端队列。


#### 1.10.2.3. Fork/Join框架的设计

我们已经很清楚Fork/Join框架的需求了，那么可以思考一下，如果让我们来设计一个Fork/Join框架，该如何设计？ 这个思考有助于你理解Fork/Join框架的设计。
* 步骤1 分割任务。首先我们需要有一个fork类来把大任务分割成子任务，有可能子任务还是很大，所以还需要不停地分割，直到分割出的子任务足够小。
* 步骤2 执行任务并合并结果。分割的子任务分别放在双端队列里，然后几个启动线程分别从双端队列里获取任务执行。子任务执行完的结果都统一放在一个队列里，启动一个线程从队列里拿数据，然后合并这些数据。

Fork/Join使用两个类来完成以上两件事情。
* ForkJoinTask：我们要使用ForkJoin框架，必须首先创建一个ForkJoin任务。它提供在任务中执行fork()和join()操作的机制。通常情况下，我们不需要直接继承ForkJoinTask类，只需要继承它的子类，Fork/Join框架提供了以下两个子类
    * RecursiveAction：用于没有返回结果的任务。
    * RecursiveTask：用于有返回结果的任务。
* ForkJoinPool：ForkJoinTask需要通过ForkJoinPool来执行。
    * 任务分割出的子任务会添加到当前工作线程所维护的双端队列中，进入队列的头部。当一个工作线程的队列里暂时没有任务时，它会随机从其他工作线程的队列的尾部获取一个任务。

#### 1.10.2.4. 例子

```java
public class ForkJoinTaskExample extends RecursiveTask<Integer> {

    public static final int threshold = 2;
    private int start;
    private int end;

    public ForkJoinTaskExample(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;

        //如果任务足够小就计算任务
        boolean canCompute = (end - start) <= threshold;
        if (canCompute) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            // 如果任务大于阈值，就分裂成两个子任务计算
            int middle = (start + end) / 2;
            ForkJoinTaskExample leftTask = new ForkJoinTaskExample(start, middle);
            ForkJoinTaskExample rightTask = new ForkJoinTaskExample(middle + 1, end);

            // 执行子任务
            leftTask.fork();
            rightTask.fork();

            // 等待任务执行结束合并其结果
            int leftResult = leftTask.join();
            int rightResult = rightTask.join();

            // 合并子任务
            sum = leftResult + rightResult;
        }
        return sum;
    }

    public static void main(String[] args) {
        ForkJoinPool forkjoinPool = new ForkJoinPool();

        //生成一个计算任务，计算1+2+3+4
        ForkJoinTaskExample task = new ForkJoinTaskExample(1, 100);

        //执行一个任务
        Future<Integer> result = forkjoinPool.submit(task);

        try {
            log.info("result:{}", result.get());
        } catch (Exception e) {
            log.error("exception", e);
        }
    }
}

```
#### 1.10.2.5. Fork/Join框架的异常处理
ForkJoinTask在执行的时候可能会抛出异常，但是我们没办法在主线程里直接捕获异常，所以ForkJoinTask提供了isCompletedAbnormally()方法来检查任务是否已经抛出异常或已经被取消了，并且可以通过ForkJoinTask的getException方法获取异常

```java
if(task.isCompletedAbnormally())
{
    System.out.println(task.getException());
}

```

#### 1.10.2.6. 实现原理 

ForkJoinPool由ForkJoinTask数组和ForkJoinWorkerThread数组组成，ForkJoinTask数组负责将存放程序提交给ForkJoinPool的任务，而ForkJoinWorkerThread数组负责执行这些任务。

**ForkJoinTask的fork方法实现原理**
```java
public final ForkJoinTask<V> fork() {
    Thread t;
    if ((t = Thread.currentThread()) instanceof ForkJoinWorkerThread)
        ((ForkJoinWorkerThread)t).workQueue.push(this);
    else
        ForkJoinPool.common.externalPush(this);
    return this;
}
```

## 1.11. 原子操作类
<a href="#menu" style="float:right">目录</a>

### 1.11.1. CAS算法

CAS算法有三个值：预期值，内存值，需要设置的值。

比如进行以改革 a=a+1;操作。一共包含以下操作:
1. 读取内存中的值a
2. 对a进行+1操作得到新值
3. 将新a写入内存中

以上操作有一个问题，在高并发条件下，任何两个操作之间都有可能插入其他操作。比如2/3之间插入了完整的以上3个操作，那么最终值将会不正确。

因此，使用CAS算法来解决。JDK使用Unsafe类实现CAS算法。

CAS是乐观锁，只有在写入的时候才会检查是否出现并发问题。

比如自加1操作，在写入时，会提交预期值和需要设置的值。只有当**预期值**和**内存中的值**相同才会写入成功，否则重新获取内存中的值，加1之后再次重新写入。这是一个自旋的过程，一直到写入成功为止。

**问题**
1. ABA问题。CAS比较交换时，是检查当前值与期望值是否一致。试想一下，如果某个值由A变成了B，再由B变回了A，那么在做CAS比较时，会认为值没有变化，但实际是发生了变化。ABA问题的解决思路是给数据加一个版本号，每次更新后对其版本加1，这样在值变回A之后，其版本已不是原来的版本了。具体可参见jdk中的AtomicStampedReference
2. 开销大。在高并发情况下，自旋CAS如果长时间不成功，会一直执行循环操作，给CPU带来非常大的执行开销。所以其适用于那些并发不是很大的场景。





### 1.11.2. 原子更新基本类型
<a href="#menu" style="float:right">目录</a>

使用原子的方式更新基本类型，Atomic包提供了以下3个类。
* AtomicBoolean：原子更新布尔类型。
* AtomicInteger：原子更新整型。
* AtomicLong：原子更新长整型

### 1.11.3. 原子更新数组
<a href="#menu" style="float:right">目录</a>

通过原子的方式更新数组里的某个元素，Atomic包提供了以下4个类。
* AtomicIntegerArray：原子更新整型数组里的元素。
* AtomicLongArray：原子更新长整型数组里的元素。
* AtomicReferenceArray：原子更新引用类型数组里的元素。
* AtomicIntegerArray类主要是提供原子的方式更新数组里的整型


### 1.11.4. 原子更新引用类型
<a href="#menu" style="float:right">目录</a>

原子更新基本类型的AtomicInteger，只能更新一个变量，如果要原子更新多个变量，就需要使用这个原子更新引用类型提供的类。Atomic包提供了以下3个类。
* AtomicReference：原子更新引用类型。
* AtomicReferenceFieldUpdater：原子更新引用类型里的字段。
* AtomicMarkableReference：原子更新带有标记位的引用类型。可以原子更新一个布尔类型的标记位和引用类型

### 1.11.5. 原子更新字段类
<a href="#menu" style="float:right">目录</a>

如果需原子地更新某个类里的某个字段时，就需要使用原子更新字段类，Atomic包提供了以下3个类进行原子字段更新。
* AtomicIntegerFieldUpdater：原子更新整型的字段的更新器。
* AtomicLongFieldUpdater：原子更新长整型字段的更新器。
* AtomicStampedReference：原子更新带有版本号的引用类型。该类将整数值与引用关联起来，可用于原子的更新数据和数据的版本号，可以解决使用CAS进行原子更新时可能出现的ABA问题


## 1.12. 并发工具类
<a href="#menu" style="float:right">目录</a>

### 1.12.1. 等待多线程完成的CountDownLatch
<a href="#menu" style="float:right">目录</a>

#### 1.12.1.1. 基本概念

CountDownLatch允许一个或多个线程等待其他线程完成操作。
* 计数器必须大于等于0，只是等于0时候，计数器就是零，调用await方法时不会阻塞当前线程。
* CountDownLatch不可能重新初始化或者修改CountDownLatch对象的内部计数器的值。
* 一个线程调用countDown方法happen-before，另外一个线程调用await方法。

```java
CountDownLatch(int count) //实例化一个倒计数器，count指定计数个数
countDown() // 计数减一
await() //等待，当计数减到0时，所有线程并行执行
```

#### 1.12.1.2. 实现原理

```java
private static final class Sync extends AbstractQueuedSynchronizer {
    private static final long serialVersionUID = 4982264981922014374L;

    Sync(int count) {
        setState(count);
    }

    int getCount() {
        return getState();
    }

    protected int tryAcquireShared(int acquires) {
        return (getState() == 0) ? 1 : -1;
    }

    protected boolean tryReleaseShared(int releases) {
        // Decrement count; signal when transition to zero
        for (;;) {
            int c = getState();
            if (c == 0)
                return false;
            int nextc = c-1;
            if (compareAndSetState(c, nextc))
                return nextc == 0;
        }
    }
}
public CountDownLatch(int count) {
    if (count < 0) throw new IllegalArgumentException("count < 0");
    this.sync = new Sync(count);
}

public void await() throws InterruptedException {
    sync.acquireSharedInterruptibly(1);
}
public void countDown() {
    sync.releaseShared(1);
}

```

### 1.12.2. 同步屏障CyclicBarrier
<a href="#menu" style="float:right">目录</a>


CyclicBarrier的字面意思是可循环使用（Cyclic）的屏障（Barrier）。它要做的事情是，让一组线程到达一个屏障（也可以叫同步点）时被阻塞，直到最后一个线程到达屏障时，屏障才会开门，所有被屏障拦截的线程才会继续运行。
　
CountDownLatch的计数器只能使用一次，而CyclicBarrier的计数器可以使用reset()方法重置。所以CyclicBarrier能处理更为复杂的业务场景。例如，如果计算发生错误，可以重置计数器，并让线程重新执行一次。
CyclicBarrier还提供其他有用的方法，比如getNumberWaiting方法可以获得Cyclic-Barrier阻塞的线程数量。isBroken()方法用来了解阻塞的线程是否被中断



CyclicBarrier有两个构造函数:
```java
//int类型的参数表示有几个线程来参与这个屏障拦截
CyclicBarrier(int parties); 
//当所有线程到达一个屏障点时,优先执行barrierAction这个线程.
CyclicBarrier(int parties,Runnable barrierAction);
//最重要的一个方法:
//每个线程调用await(),表示我已经到达屏障点,然后当前线程被阻塞,(拿上面的例子讲就是游客A表示到达了景点A,然后他就在那儿等着大家到齐).
await();

```



parties用于定义一个最大线程计数值，当调用await()时阻塞，直到调用的次数达到parties，则可以继续执行。
简单的使用场景：校长要计算全校平均数，必须从A班级获取到成绩表，从B班级获取到成绩表等等 ，只有获取到全部班级的成绩表，校长才能计算总平均数。


#### 1.12.2.1. 实现原理

使用ReentrantLock和Condition实现
```java
 private int dowait(boolean timed, long nanos)
        throws InterruptedException, BrokenBarrierException,
               TimeoutException {
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            final Generation g = generation;

            if (g.broken)
                throw new BrokenBarrierException();

            //发生中断时退出
            if (Thread.interrupted()) {
                breakBarrier();
                throw new InterruptedException();
            }
            //计数值减1
            int index = --count;
            //为0说明达到条件
            if (index == 0) {  // tripped
                boolean ranAction = false;
                try {
                    final Runnable command = barrierCommand;
                    if (command != null)
                        //执行定义的任务
                        command.run();
                    ranAction = true;
                    //下一次循环
                    nextGeneration();
                    return 0;
                } finally {
                    if (!ranAction)
                        breakBarrier();
                }
            }

            // loop until tripped, broken, interrupted, or timed out
            for (;;) {
                try {
                    if (!timed)
                        trip.await();
                    else if (nanos > 0L)
                        nanos = trip.awaitNanos(nanos);
                } catch (InterruptedException ie) {
                    if (g == generation && ! g.broken) {
                        breakBarrier();
                        throw ie;
                    } else {
                        // We're about to finish waiting even if we had not
                        // been interrupted, so this interrupt is deemed to
                        // "belong" to subsequent execution.
                        Thread.currentThread().interrupt();
                    }
                }

                if (g.broken)
                    throw new BrokenBarrierException();

                if (g != generation)
                    return index;

                if (timed && nanos <= 0L) {
                    breakBarrier();
                    throw new TimeoutException();
                }
            }
        } finally {
            lock.unlock();
        }
    }
/**
    * Updates state on barrier trip and wakes up everyone.
    * Called only while holding lock.
    */
private void nextGeneration() {
    // signal completion of last generation
    trip.signalAll();
    // set up next generation
    count = parties;
    generation = new Generation();
}

/**
    * Sets current barrier generation as broken and wakes up everyone.
    * Called only while holding lock.
    */
private void breakBarrier() {
    generation.broken = true;
    count = parties;
    trip.signalAll();
} 
```
### 1.12.3. 控制并发线程数的Semaphore
<a href="#menu" style="float:right">目录</a>


#### 1.12.3.1. 基本概念

Semaphore（信号量）是用来控制同时访问特定资源的线程数量，它通过协调各个线程，以保证合理的使用公共资源。

主要方法
```java
public Semaphore(int permits) {
    sync = new NonfairSync(permits);
}
public Semaphore(int permits, boolean fair) {
    sync = fair ? new FairSync(permits) : new NonfairSync(permits);
}

public void acquire() throws InterruptedException {
    sync.acquireSharedInterruptibly(1);
}
public void release() {
    sync.releaseShared(1);
}
```
构造函数指定许可证数量，可以配置公平和非公平。
acquire()用于申请一个许可证，调用一次减少一个，如果超过则阻塞。直到有线程释放release() 。


#### 1.12.3.2. 实现原理


### 1.12.4. 线程间交换数据的Exchanger
<a href="#menu" style="float:right">目录</a>

Exchanger 是 JDK 1.5 开始提供的一个用于两个工作线程之间交换数据的封装工具类，简单说就是一个线程在完成一定的事务后想与另一个线程交换数据，则第一个先拿出数据的线程会一直等待第二个线程，直到第二个线程拿着数据到来时才能彼此交换对应数据。其定义为 Exchanger<V> 泛型类型，其中 V 表示可交换的数据类型，对外提供的接口很简单，具体如下：

Exchanger()：无参构造方法。
V exchange(V v)：等待另一个线程到达此交换点（除非当前线程被中断），然后将给定的对象传送给该线程，并接收该线程的对象。
V exchange(V v, long timeout, TimeUnit unit)：等待另一个线程到达此交换点（除非当前线程被中断或超出了指定的等待时间），然后将给定的对象传送给该线程，并接收该线程的对象。

可以看出，当一个线程到达 exchange 调用点时，如果其他线程此前已经调用了此方法，则其他线程会被调度唤醒并与之进行对象交换，然后各自返回；如果其他线程还没到达交换点，则当前线程会被挂起，直至其他线程到达才会完成交换并正常返回，或者当前线程被中断或超时返回。

```java
public class Test {
    static class Producer extends Thread {
        private Exchanger<Integer> exchanger;
        private static int data = 0;
        Producer(String name, Exchanger<Integer> exchanger) {
            super("Producer-" + name);
            this.exchanger = exchanger;
        }

        @Override
        public void run() {
            for (int i=1; i<5; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    data = i;
                    System.out.println(getName()+" 交换前:" + data);
                    data = exchanger.exchange(data);
                    System.out.println(getName()+" 交换后:" + data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer extends Thread {
        private Exchanger<Integer> exchanger;
        private static int data = 0;
        Consumer(String name, Exchanger<Integer> exchanger) {
            super("Consumer-" + name);
            this.exchanger = exchanger;
        }

        @Override
        public void run() {
            while (true) {
                data = 0;
                System.out.println(getName()+" 交换前:" + data);
                try {
                    TimeUnit.SECONDS.sleep(1);
                    data = exchanger.exchange(data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName()+" 交换后:" + data);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Exchanger<Integer> exchanger = new Exchanger<Integer>();
        new Producer("", exchanger).start();
        new Consumer("", exchanger).start();
        TimeUnit.SECONDS.sleep(7);
        System.exit(-1);
    }
}
```

### 1.12.5. FutureTask
<a href="#menu" style="float:right">目录</a>

#### 1.12.5.1. Callable与Runnable

先说一下java.lang.Runnable吧，它是一个接口，在它里面只声明了一个run()方法：

```java
public interface Runnable {
    public abstract void run();
}
```
由于run()方法返回值为void类型，所以在执行完任务之后无法返回任何结果。

　　Callable位于java.util.concurrent包下，它也是一个接口，在它里面也只声明了一个方法，只不过这个方法叫做call()：
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
```
可以看到，这是一个泛型接口，call()函数返回的类型就是传递进来的V类型。

那么怎么使用Callable呢？一般情况下是配合ExecutorService来使用的，在ExecutorService接口中声明了若干个submit方法的重载版本：

```java
<T> Future<T> submit(Callable<T> task);
<T> Future<T> submit(Runnable task, T result);
Future<?> submit(Runnable task);
```
第一个submit方法里面的参数类型就是Callable。

暂时只需要知道Callable一般是和ExecutorService配合来使用的，具体的使用方法讲在后面讲述。

一般情况下我们使用第一个submit方法和第三个submit方法，第二个submit方法很少使用。

#### 1.12.5.2. Future
Future就是对于具体的Runnable或者Callable任务的执行结果进行取消、查询是否完成、获取结果。必要时可以通过get方法获取执行结果，该方法会阻塞直到任务返回结果。

Future类位于java.util.concurrent包下，它是一个接口：

```java
public interface Future<V> {
    boolean cancel(boolean mayInterruptIfRunning);
    boolean isCancelled();
    boolean isDone();
    V get() throws InterruptedException, ExecutionException;
    V get(long timeout, TimeUnit unit)
        throws InterruptedException, ExecutionException, TimeoutException;
}
```
 在Future接口中声明了5个方法，下面依次解释每个方法的作用：
* cancel方法用来取消任务，如果取消任务成功则返回true，如果取消任务失败则返回false。参数mayInterruptIfRunning表示是否允许取消正在执行却没有执行完毕的任务，如果设置true，则表示可以取消正在执行过程中的任务。如果任务已经完成，则无论mayInterruptIfRunning为true还是false，此方法肯定返回false，即如果取消已经完成的任务会返回false；如果任务正在执行，若mayInterruptIfRunning设置为true，则返回true，若mayInterruptIfRunning设置为false，则返回false；如果任务还没有执行，则无论mayInterruptIfRunning为true还是false，肯定返回true。
* isCancelled方法表示任务是否被取消成功，如果在任务正常完成前被取消成功，则返回 true。
* isDone方法表示任务是否已经完成，若任务完成，则返回true；
* get()方法用来获取执行结果，这个方法会产生阻塞，会一直等到任务执行完毕才返回；
* get(long timeout, TimeUnit unit)用来获取执行结果，如果在指定时间内，还没获取到结果，就直接返回null。

也就是说Future提供了三种功能：
1）判断任务是否完成；
2）能够中断任务；
3）能够获取任务执行结果。

因为Future只是一个接口，所以是无法直接用来创建对象使用的，因此就有了下面的FutureTask。

#### 1.12.5.3. FutureTask

我们先来看一下FutureTask的实现
```java
public class FutureTask<V> implements RunnableFuture<V>
```

FutureTask类实现了RunnableFuture接口，我们看一下RunnableFuture接口的实现：

```java
public interface RunnableFuture<V> extends Runnable, Future<V> {
    void run();
}
```
 　　可以看出RunnableFuture继承了Runnable接口和Future接口，而FutureTask实现了RunnableFuture接口。所以它既可以作为Runnable被线程执行，又可以作为Future得到Callable的返回值。

　　FutureTask提供了2个构造器：
```java
public FutureTask(Callable<V> callable) {
}
public FutureTask(Runnable runnable, V result) {
}
```
事实上，FutureTask是Future接口的一个唯一实现类。

#### 1.12.5.4. 使用示例

1.使用Callable+Future获取执行结果

```java
public class Test {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Task task = new Task();
        Future<Integer> result = executor.submit(task);
        executor.shutdown();
         
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
         
        System.out.println("主线程在执行任务");
         
        try {
            System.out.println("task运行结果"+result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
         
        System.out.println("所有任务执行完毕");
    }
}
class Task implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        System.out.println("子线程在进行计算");
        Thread.sleep(3000);
        int sum = 0;
        for(int i=0;i<100;i++)
            sum += i;
        return sum;
    }
}
```

2.使用Callable+FutureTask获取执行结果

```java
public class Test {
    public static void main(String[] args) {
        //第一种方式
        ExecutorService executor = Executors.newCachedThreadPool();
        Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
        executor.submit(futureTask);
        executor.shutdown();
         
        //第二种方式，注意这种方式和第一种方式效果是类似的，只不过一个使用的是ExecutorService，一个使用的是Thread
        /*Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
        Thread thread = new Thread(futureTask);
        thread.start();*/
         
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
         
        System.out.println("主线程在执行任务");
         
        try {
            System.out.println("task运行结果"+futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
         
        System.out.println("所有任务执行完毕");
    }
}
class Task implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        System.out.println("子线程在进行计算");
        Thread.sleep(3000);
        int sum = 0;
        for(int i=0;i<100;i++)
            sum += i;
        return sum;
    }
}
```
如果为了可取消性而使用 Future 但又不提供可用的结果，则可以声明 Future<?> 形式类型、并返回 null 作为底层任务的结果。


## 1.13. 线程池
<a href="#menu" style="float:right">目录</a>

**线程池好处**
* 第一：降低资源消耗。通过重复利用已创建的线程降低线程创建和销毁造成的消耗。
* 第二：提高响应速度。当任务到达时，任务可以不需要等到线程创建就能立即执行。
* 第三：提高线程的可管理性。线程是稀缺资源，如果无限制地创建，不仅会消耗系统资源，还会降低系统的稳定性，使用线程池可以进行统一分配、调优和监控。但是，要做到合理利用线程池，必须对其实现原理了如指掌。

### 1.13.1. 线程池的实现原理
当向线程池提交一个任务之后，线程池是如何处理这个任务的呢？ 本节来看一下线程池
的主要处理流程，处理流程图如图9-1所示。
从图中可以看出，当提交一个新任务到线程池时，线程池的处理流程如下。
1）线程池判断核心线程池里的线程是否都在执行任务。如果不是，则创建一个新的工作
线程来执行任务。如果核心线程池里的线程都在执行任务，则进入下个流程。
2）线程池判断工作队列是否已经满。如果工作队列没有满，则将新提交的任务存储在这
个工作队列里。如果工作队列满了，则进入下个流程。
3）线程池判断线程池的线程是否都处于工作状态。如果没有，则创建一个新的工作线程
来执行任务。如果已经满了，则交给饱和策略来处理这个任务

![线程池实现基本原理](https://github.com/lgjlife/Java-Study/blob/master/pic/thread/thread-pool.png?raw=true)

![线程池实现基本原理](https://github.com/lgjlife/Java-Study/blob/master/pic/thread/thread-pool.png?raw=true)

**ThreadPoolExecutor执行execute方法分下面4种情况。**
1）如果当前运行的线程少于corePoolSize，则创建新线程来执行任务（注意，执行这一步骤
需要获取全局锁）。
2）如果运行的线程等于或多于corePoolSize，则将任务加入BlockingQueue。
3）如果无法将任务加入BlockingQueue（队列已满），则创建新的线程来处理任务（注意，执行这一步骤需要获取全局锁）。
4）如果创建新线程将使当前运行的线程超出maximumPoolSize，任务将被拒绝，并调用
RejectedExecutionHandler.rejectedExecution()方法。
ThreadPoolExecutor采取上述步骤的总体设计思路，是为了在执行execute()方法时，尽可能地避免获取全局锁（那将会是一个严重的可伸缩瓶颈）。在ThreadPoolExecutor完成预热之后（当前运行的线程数大于等于corePoolSize），几乎所有的execute()方法调用都是执行步骤2，而步骤2不需要获取全局锁。

**ThreadPoolExecutor**
```java
public void execute(Runnable command) {
        if (command == null)
            throw new NullPointerException();
        /*
         * Proceed in 3 steps:
         *
         * 1. If fewer than corePoolSize threads are running, try to
         * start a new thread with the given command as its first
         * task.  The call to addWorker atomically checks runState and
         * workerCount, and so prevents false alarms that would add
         * threads when it shouldn't, by returning false.
         *
         * 2. If a task can be successfully queued, then we still need
         * to double-check whether we should have added a thread
         * (because existing ones died since last checking) or that
         * the pool shut down since entry into this method. So we
         * recheck state and if necessary roll back the enqueuing if
         * stopped, or start a new thread if there are none.
         *
         * 3. If we cannot queue task, then we try to add a new
         * thread.  If it fails, we know we are shut down or saturated
         * and so reject the task.
         */
        int c = ctl.get();
        if (workerCountOf(c) < corePoolSize) {
            if (addWorker(command, true))
                return;
            c = ctl.get();
        }
        if (isRunning(c) && workQueue.offer(command)) {
            int recheck = ctl.get();
            if (! isRunning(recheck) && remove(command))
                reject(command);
            else if (workerCountOf(recheck) == 0)
                addWorker(null, false);
        }
        else if (!addWorker(command, false))
            reject(command);
    }
```



### 1.13.2. 线程池的使用

```java
   public ThreadPoolExecutor(int corePoolSize,
                              int maximumPoolSize,
                              long keepAliveTime,
                              TimeUnit unit,
                              BlockingQueue<Runnable> workQueue,
                              ThreadFactory threadFactory,
                              RejectedExecutionHandler handler)
```

**创建一个线程池时需要输入几个参数，如下。**
* 1）corePoolSize（线程池的基本大小）：当提交一个任务到线程池时，线程池会创建一个线程来执行任务，即使其他空闲的基本线程能够执行新任务也会创建线程，等到需要执行的任
务数大于线程池基本大小时就不再创建。如果调用了线程池的prestartAllCoreThreads()方法，线程池会提前创建并启动所有基本线程。
* 2）runnableTaskQueue（任务队列）：用于保存等待执行的任务的阻塞队列。可以选择以下几个阻塞队列。
    * ArrayBlockingQueue：是一个基于数组结构的有界阻塞队列，此队列按FIFO（先进先出）原则对元素进行排序。
    * LinkedBlockingQueue：一个基于链表结构的阻塞队列，此队列按FIFO排序元素，吞吐量通常要高于ArrayBlockingQueue。静态工厂方法Executors.newFixedThreadPool()使用了这个队列。
    * SynchronousQueue：一个不存储元素的阻塞队列。每个插入操作必须等到另一个线程调用移除操作，否则插入操作一直处于阻塞状态，吞吐量通常要高于Linked-BlockingQueue，静态工厂方法Executors.newCachedThreadPool使用了这个队列。
    * PriorityBlockingQueue：一个具有优先级的无限阻塞队列。
* maximumPoolSize（线程池最大数量）：线程池允许创建的最大线程数。如果队列满了，并且已创建的线程数小于最大线程数，则线程池会再创建新的线程执行任务。值得注意的是，如
果使用了无界的任务队列这个参数就没什么效果。
* ThreadFactory：用于设置创建线程的工厂，可以通过线程工厂给每个创建出来的线程设
置更有意义的名字。使用开源框架guava提供的ThreadFactoryBuilder可以快速给线程池里的线程设置有意义的名字，代码如下。
拒绝策略 
* RejectedExecutionHandler（拒绝策略）：当队列和线程池都满了，说明线程池处于饱和状态，那么必须采取一种策略处理提交的新任务。这个策略默认情况下是AbortPolicy，表示无法
处理新任务时抛出异常。在JDK 1.5中Java线程池框架提供了以下4种策略。
    * AbortPolicy：直接抛出异常。
    * CallerRunsPolicy：只用调用者所在线程来运行任务。
    * DiscardOldestPolicy：丢弃队列里最近的一个任务，并执行当前任务。
    * DiscardPolicy：不处理，丢弃掉。
    * 除此之外，还可以实现接口RejectedExecutionHandler进行自定义

### 1.13.3. 提交任务

execute 不没有返回者，submit可以通过Future获取线程执行结果。
```java
public interface Executor {
    void execute(Runnable command);
}

public interface ExecutorService extends Executor {
    <T> Future<T> submit(Callable<T> task);
    <T> Future<T> submit(Runnable task, T result);
    Future<?> submit(Runnable task);
}


```
### 1.13.4. 关闭线程池

可以通过调用线程池的shutdown或shutdownNow方法来关闭线程池。它们的原理是遍历线程池中的工作线程，然后逐个调用线程的interrupt方法来中断线程，所以无法响应中断的任务可能永远无法终止。但是它们存在一定的区别，shutdownNow首先将线程池的状态设置成STOP，然后尝试停止所有的正在执行或暂停任务的线程，并返回等待执行任务的列表，而shutdown只是将线程池的状态设置成SHUTDOWN状态，然后中断所有没有正在执行任务的线程。
只要调用了这两个关闭方法中的任意一个，isShutdown方法就会返回true。当所有的任务都已关闭后，才表示线程池关闭成功，这时调用isTerminaed方法会返回true。至于应该调用哪一种方法来关闭线程池，应该由提交到线程池的任务特性决定，通常调用shutdown方法来关闭线程池，如果任务不一定要执行完，则可以调用shutdownNow方法。

### 1.13.5. 合理地配置线程池

* 线程池大小太大会增加上下文切换，导致效率变低，太小则无法有效利用CPU资源。实际需要考虑任务的特性，系统资源状况(CPU,内存)，以及任务使用的稀缺资源状况。

要想合理地配置线程池，就必须首先分析任务特性，可以从以下几个角度来分析。
* 任务的性质：CPU密集型任务、IO密集型任务和混合型任务。
    * CPU密集型
        * 建议是比CPU多1个，因为某个CPU执行时可能会出现短暂阻塞，这时可以有多余的线程执行
        * IO密集型，可以适当增大。因为IO操作等待时间相比可能较长。可以为CPU的两倍
* 任务的优先级：高、中和低。
* 任务的执行时间：长、中和短。
* 任务的依赖性：是否依赖其他系统资源，如数据库连接

使用无界队列需要注意，如果线程任务执行缓慢，那么将可能导致队列过大，最终造成内存泄漏。

### 1.13.6. 线程池的监控
如果在系统中大量使用线程池，则有必要对线程池进行监控，方便在出现问题时，可以根据线程池的使用状况快速定位问题。可以通过线程池提供的参数进行监控，在监控线程池的时候可以使用以下属性。
* taskCount：线程池需要执行的任务数量。
* completedTaskCount：线程池在运行过程中已完成的任务数量，小于或等于taskCount。
* largestPoolSize：线程池里曾经创建过的最大线程数量。通过这个数据可以知道线程池是否曾经满过。如该数值等于线程池的最大大小，则表示线程池曾经满过。
* getPoolSize：线程池的线程数量。如果线程池不销毁的话，线程池里的线程不会自动销毁，所以这个大小只增不减。
* getActiveCount：获取活动的线程数。

通过扩展线程池进行监控。可以通过继承线程池来自定义线程池，重写线程池的beforeExecute、afterExecute和terminated方法，也可以在任务执行前、执行后和线程池关闭前执行一些代码来进行监控。例如，监控任务的平均执行时间、最大执行时间和最小执行时间等。

**线程池泄漏**
避免线程池任务长时间阻塞，导致可运行的线程数目越来越少。



## 1.14. Executor框架
<a href="#menu" style="float:right">目录</a>

### 1.14.1. Executor体系

**常用接口和类介绍**

```java
public interface Executor
public interface ExecutorService extends Executor 
public abstract class AbstractExecutorService implements ExecutorService
public class ThreadPoolExecutor extends AbstractExecutorService 

public interface ScheduledExecutorService extends ExecutorService
public class ScheduledThreadPoolExecutor  extends ThreadPoolExecutor  implements ScheduledExecutorService
```
* Executor是一个接口，它是Executor框架的基础，它将任务的提交与任务的执行分离开来。
* ThreadPoolExecutor是线程池的核心实现类，用来执行被提交的任务。
* ScheduledThreadPoolExecutor是一个实现类，可以在给定的延迟后运行命令，或者定期执行命令。ScheduledThreadPoolExecutor比Timer更灵活，功能更强大。
* Future接口和实现Future接口的FutureTask类，代表异步计算的结果。
* Runnable接口和Callable接口的实现类，都可以被ThreadPoolExecutor或ScheduledThreadPoolExecutor执行

**Future接口**
Future接口和实现Future接口的FutureTask类用来表示异步计算的结果。当我们把Runnable接口或Callable接口的实现类提交（submit）给ThreadPoolExecutor或ScheduledThreadPoolExecutor时，ThreadPoolExecutor或ScheduledThreadPoolExecutor会向我们返回一个FutureTask对象

ExecutorService
```java
<T> Future<T> submit(Callable<T> task);
<T> Future<T> submit(Runnable task, T result);
Future<?> submit(Runnable task);
```
Future
```java

public interface Future<V> {
    /**
    * 尝试取消任务，如果任务已经完成，或者任务已经被取消，或者其他原因，将会返回false.如果返回true,则将不会执行该任务
    */
    boolean cancel(boolean mayInterruptIfRunning);

    boolean isCancelled();
    boolean isDone();
    //获取执行结果
    V get() throws InterruptedException, ExecutionException;
    V get(long timeout, TimeUnit unit)
        throws InterruptedException, ExecutionException, TimeoutException;
}

```

**Runnable接口和Callable接口**
Runnable接口和Callable接口的实现类，都可以被ThreadPoolExecutor或ScheduledThreadPoolExecutor执行。它们之间的区别是Runnable不会返回结果，而Callable可以返回结果。
除了可以自己创建实现Callable接口的对象外，还可以使用工厂类Executors来把一个Runnable包装成一个Callable。
下面是Executors提供的，把一个Runnable包装成一个Callable的API。

```java
public static Callable<Object> callable(Runnable task) // 假设返回对象Callable1
public static <T> Callable<T> callable(Runnable task, T result) {
    if (task == null)
        throw new NullPointerException();
    return new RunnableAdapter<T>(task, result);
}
static final class RunnableAdapter<T> implements Callable<T> {
    final Runnable task;
    final T result;
    RunnableAdapter(Runnable task, T result) {
        this.task = task;
        this.result = result;
    }
    public T call() {
        task.run();
        return result;
    }
}
    

```

如果是Callable，线程任务可以有返回值
```java
public interface Callable<V> {
    V call() throws Exception;
}
public interface Runnable {
    public abstract void run();
}
```

### 1.14.2. Executors
Executors 相当于线程池的工厂类，提供了几种线程池创建方式

**固定线程数量的线程池**
```java
public static ExecutorService newFixedThreadPool(int nThreads) {
    return new ThreadPoolExecutor(nThreads, nThreads,
                                    0L, TimeUnit.MILLISECONDS,
                                    new LinkedBlockingQueue<Runnable>());
}
```
**只有单个线程的线程池**
```java
public static ExecutorService newSingleThreadExecutor() {
    return new FinalizableDelegatedExecutorService
        (new ThreadPoolExecutor(1, 1,
                                0L, TimeUnit.MILLISECONDS,
                                new LinkedBlockingQueue<Runnable>()));
}
```

**无限线程的线程池**
```java
public static ExecutorService newCachedThreadPool() {
    return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                                    60L, TimeUnit.SECONDS,
                                    new SynchronousQueue<Runnable>());
}
```
将会导致线程数量膨胀，慎用。

**具备定时执行的线程池**
```java
public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize) {
    return new ScheduledThreadPoolExecutor(corePoolSize);
}
public static ScheduledExecutorService newSingleThreadScheduledExecutor() {
    return new DelegatedScheduledExecutorService
        (new ScheduledThreadPoolExecutor(1));
}
```

ScheduledExecutorService

```java

public interface ScheduledExecutorService extends ExecutorService {

    public ScheduledFuture<?> schedule(Runnable command,
                                       long delay, TimeUnit unit);
    public <V> ScheduledFuture<V> schedule(Callable<V> callable,
                                           long delay, TimeUnit unit);

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable command,
                                                  long initialDelay,
                                                  long period,
                                                  TimeUnit unit);

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command,
                                                     long initialDelay,
                                                     long delay,
                                                     TimeUnit unit);

}

public class ScheduledThreadPoolExecutor
        extends ThreadPoolExecutor
        implements ScheduledExecutorService {
             public ScheduledThreadPoolExecutor(int corePoolSize) {
                super(corePoolSize, Integer.MAX_VALUE, 0, NANOSECONDS,
                    new DelayedWorkQueue());
            }
        }


```
scheduleAtFixedRate： 固定频率任务，任务启动的时间间隔时间是一致的。
scheduleWithFixedDelay: 固定延迟任务，本次任务执行结束再等待延迟时间才会执行下一次任务 


## 1.15. 并发编程实战
<a href="#menu" style="float:right">目录</a>


## 1.16. 队列
<a href="#menu" style="float:right">目录</a>

### 1.16.1. JDK队列概述
<a href="#menu" style="float:right">目录</a>

**Java  Queue基础**
* Queue： 基本上，一个队列就是一个先入先出（FIFO）的数据结构。
* offer，add区别： 一些队列有大小限制，因此如果想在一个满的队列中加入一个新项，多出的项就会被拒绝。 这时新的 offer 方法就可以起作用了。它不是对调用 add() 方法抛出一个 unchecked 异常，而只是得到由 offer() 返回的 false。
* poll，remove区别： remove() 和 poll() 方法都是从队列中删除第一个元素（head）。remove() 的行为与 Collection 接口的版本相似， 但是新的 poll() 方法在用空集合调用时不是抛出异常，只是返回 null。因此新的方法更适合容易出现异常条件的情况。
* peek，element区别： element() 和 peek() 用于在队列的头部查询元素。与 remove() 方法类似，在队列为空时， element() 抛出一个异常，而 peek() 返回 null。


**常见非阻塞队列**
* ArrayDeque, （数组双端队列）
* PriorityQueue, （优先级队列）
* ConcurrentLinkedQueue, （基于链表的并发队列）
* PriorityQueue 类实质上维护了一个有序列表。加入到 Queue 中的元素根据它们的天然排序（通过其 java.util.Comparable 实现）或者根据传递给构造函数的 java.util.Comparator 实现来定位。
* ConcurrentLinkedQueue 是基于链接节点的、线程安全的队列。并发访问不需要同步。因为它在队列的尾部添加元素并从头部删除它们，所以只要不需要知道队列的大小，ConcurrentLinkedQueue 对公共集合的共享访问就可以工作得很好。收集关于队列大小的信息会很慢，需要遍历队列。

**常见阻塞队列BlockingQueue**
* ArrayBlockingQueue和LinkedBlockingQueue是两个最普通也是最常用的阻塞队列，一般情况下，在处理多线程间的生产者消费者问题，使用这两个类足以。
* DelayQueue, （延期阻塞队列）（阻塞队列实现了BlockingQueue接口）
* ArrayBlockingQueue, （基于数组的并发阻塞队列） 底层是数组，有界队列，如果我们要使用生产者-消费者模式，这是非常好的选择。
* LinkedBlockingQueue, （基于链表的FIFO阻塞队列）  底层是链表，可以当做无界和有界队列来使用，所以大家不要以为它就是无界队列。
* LinkedBlockingDeque, （基于链表的FIFO双端阻塞队列）
* PriorityBlockingQueue, （带优先级的无界阻塞队列） 是无界队列，基于数组，数据结构为二叉堆，数组第一个也是树的根节点总是最小值。
* SynchronousQueue （并发同步阻塞队列）本身不带有空间来存储任何元素，使用上可以选择公平模式和非公平模式。

**BlockingQueue的核心方法：**
BlockingQueue 对插入操作、移除操作、获取元素操作提供了四种不同的方法用于不同的场景中使用：
* 1、抛出异常；
* 2、返回特殊值（null 或 true/false，取决于具体的操作）；
* 3、阻塞等待此操作，直到这个操作成功；
* 4、阻塞等待此操作，直到成功或者超时指定时间。

 

|抛出异常|	特殊值|	阻塞|	超时
|---|---|---|---|
|插入|	add(e)|	offer(e)|	put(e)|	offer(e, time, unit)
|删除|	remove()|	poll()|	take()|	poll(time, unit)
|获取|	element()|	peek()|	not applicable|	not applicable

* 放入数据：
    * offer(anObject):表示如果可能的话,将anObject加到BlockingQueue里,即如果BlockingQueue可以容纳,则返回true,否则返回false.（本方法不阻塞当前执行方法的线程）
    * offer(E o, long timeout, TimeUnit unit),可以设定等待的时间，如果在指定的时间内，还不能往队列中加入BlockingQueue，则返回失败。
    * put(anObject):把anObject加到BlockingQueue里,如果BlockQueue没有空间,则调用此方法的线程被阻断直到BlockingQueue里面有空间再继续.获取数据：
    * poll(time):取走BlockingQueue里排在首位的对象,若不能立即取出,则可以等time参数规定的时间,取不到时返回null;
    * poll(long timeout, TimeUnit unit)：从BlockingQueue取出一个队首的对象，如果在指定时间内，队列一旦有数据可取，则立即返回队列中的数据。否则知道时间超时还没有数据可取，返回失败。
    * take():取走BlockingQueue里排在首位的对象,若BlockingQueue为空,阻断进入等待状态直到BlockingQueue有新的数据被加入; 
    * drainTo():一次性从BlockingQueue获取所有可用的数据对象（还可以指定获取数据的个数），通过该方法，可以提升获取数据效率；不需要多次分批加锁或释放锁。

 



**1. ArrayBlockingQueue**
基于数组的阻塞队列实现，在ArrayBlockingQueue内部，维护了一个定长数组，以便缓存队列中的数据对象，这是一个常用的阻塞队列，除了 一个定长数组外，ArrayBlockingQueue内部还保存着两个整形变量，分别标识着队列的头部和尾部在数组中的位置。ArrayBlockingQueue在生产者放入数据和消费者获取数据，都是共用同一个锁对象，由此也意味着两者无法真正并行运行，这点尤其不同于 LinkedBlockingQueue；按照实现原理来分析，ArrayBlockingQueue完全可以采用分离锁，从而实现生产者和消费者操作的 完全并行运行。Doug Lea之所以没这样去做，也许是因为ArrayBlockingQueue的数据写入和获取操作已经足够轻巧，以至于引入独立的锁机制，除了给代码带来额外的复杂性外，其在性能上完全占不到任何便宜。 ArrayBlockingQueue和LinkedBlockingQueue间还有一个明显的不同之处在于，前者在插入或删除元素时不会产生或销毁任 何额外的对象实例，而后者则会生成一个额外的Node对象。这在长时间内需要高效并发地处理大批量数据的系统中，其对于GC的影响还是存在一定的区别。而 在创建ArrayBlockingQueue时，我们还可以控制对象的内部锁是否采用公平锁，默认采用非公平锁。

**2. LinkedBlockingQueue**
基于链表的阻塞队列，同ArrayListBlockingQueue类似，其内部也维持着一个数据缓冲队列（该队列由一个链表构成），当生产者往队列 中放入一个数据时，队列会从生产者手中获取数据，并缓存在队列内部，而生产者立即返回；只有当队列缓冲区达到最大值缓存容量时 （LinkedBlockingQueue可以通过构造函数指定该值），才会阻塞生产者队列，直到消费者从队列中消费掉一份数据，生产者线程会被唤醒，反之对于消费者这端的处理也基于同样的原理。而LinkedBlockingQueue之所以能够高效的处理并发数据，还因为其对于生产者端和消费者端分别采用了独立的锁来控制数据同步，这也意味着在高并发的情况下生产者和消费者可以并行地操作队列中的数据，以此来提高整个队列的并发性能。
作为开发者，我们需要注意的是，如果构造一个LinkedBlockingQueue对象，而没有指定其容量大小，LinkedBlockingQueue会默认 一个类似无限大小的容量（Integer.MAX_VALUE），这样的话，如果生产者的速度一旦大于消费者的速度，也许还没有等到队列满阻塞产生，系统内存就有可能已被消耗殆尽了。


**3. DelayQueue**
DelayQueue中的元素只有当其指定的延迟时间到了，才能够从队列中获取到该元素。DelayQueue是一个没有大小限制的队列，因此往队列中插入数据的操作（生产者）永远不会被阻塞，而只有获取数据的操作（消费者）才会被阻塞。
使用场景：DelayQueue使用场景较少，但都相当巧妙，常见的例子比如使用一个DelayQueue来管理一个超时未响应的连接队列。

**4. PriorityBlockingQueue**
基于优先级的阻塞队列（优先级的判断通过构造函数传入的Compator对象来决定），但需要注意的是PriorityBlockingQueue并不会阻塞数据生产者，而只会在没有可消费的数据时，阻塞数据的消费者。因此使用的时候要特别注意，生产者生产数据的速度绝对不能快于消费者消费数据的速度， 否则时间一长，会最终耗尽所有的可用堆内存空间。在实现PriorityBlockingQueue时，内部控制线程同步的锁采用的是公平锁。

**5. SynchronousQueue**
一种无缓冲的等待队列，类似于无中介的直接交易，有点像原始社会中的生产者和消费者，生产者拿着产品去集市销售给产品的最终消费者，而消费者必须亲自去 集市找到所要商品的直接生产者，如果一方没有找到合适的目标，那么对不起，大家都在集市等待。相对于有缓冲的BlockingQueue来说，少了一个中 间经销商的环节（缓冲区），如果有经销商，生产者直接把产品批发给经销商，而无需在意经销商最终会将这些产品卖给那些消费者，由于经销商可以库存一部分商 品，因此相对于直接交易模式，总体来说采用中间经销商的模式会吞吐量高一些（可以批量买卖）；但另一方面，又因为经销商的引入，使得产品从生产者到消费者 中间增加了额外的交易环节，单个产品的及时响应性能可能会降低。
声明一个SynchronousQueue有两种不同的方式，它们之间有着不太一样的行为。公平模式和非公平模式的区别:
如果采用公平模式：SynchronousQueue会采用公平锁，并配合一个FIFO队列来阻塞多余的生产者和消费者，从而体系整体的公平策略；
但如果是非公平模式（SynchronousQueue默认）：SynchronousQueue采用非公平锁，同时配合一个LIFO（后进先出法 Last In First Out ）队列来管理多余的生产者和消费者，而后一种模式，如果生产者和消费者的处理速度有差距，则很容易出现饥渴的情况，即可能有某些生产者或者是消费者的数据永远都得不到处理。

  

### 1.16.2. DelayedWorkQueue
<a href="#menu" style="float:right">目录</a>

我们知道线程池运行时，会不断从任务队列中获取任务，然后执行任务。如果我们想实现延时或者定时执行任务，重要一点就是任务队列会根据任务延时时间的不同进行排序，延时时间越短地就排在队列的前面，先被获取执行。

队列是先进先出的数据结构，就是先进入队列的数据，先被获取。但是有一种特殊的队列叫做优先级队列，它会对插入的数据进行优先级排序，保证优先级越高的数据首先被获取，与数据的插入顺序无关。

实现优先级队列高效常用的一种方式就是使用堆。

**用堆实现优先级队列**
在常用排序算法总结这篇文章中，我们详细地讲解了堆排序的实现。这里我们回顾一下。
* **1.1 什么是堆**


它是一个完全二叉树，即除了最后一层节点不是满的，其他层节点都是满的，即左右节点都有。
它不是二叉搜索树，即左节点的值都比父节点值小，右节点的值都不比父节点值小，这样查找的时候，就可以通过二分的方式，效率是(log N)。
它是特殊的二叉树，它要求父节点的值不能小于子节点的值。这样保证大的值在上面，小的值在下面。所以堆遍历和查找都是低效的，因为我们只知道
从根节点到子叶节点的每条路径都是降序的，但是各个路径之间都是没有联系的，查找一个值时，你不知道应该从左节点查找还是从右节点开始查找。
它可以实现快速的插入和删除，效率都在(log N)左右。所以它可以实现优先级队列。


堆是一个二叉树，但是它最简单的方式是通过数组去实现二叉树，而且因为堆是一个完全二叉树，就不存在数组空间的浪费。怎么使用数组来存储二叉树呢？

就是用数组的下标来模拟二叉树的各个节点,比如说根节点就是0，第一层的左节点是1，右节点是2。由此我们可以得出下列公式：

```java
// 对于n位置的节点来说：
int left = 2 * n + 1; // 左子节点
int right = 2 * n + 2; // 右子节点
int parent = (n - 1) / 2; // 父节点，当然n要大于0，根节点是没有父节点的
```
对于堆来说，只有两个操作，插入insert和删除remove，不管插入还是删除保证堆的成立条件，1.是完全二叉树，2.父节点的值不能小于子节点的值。
```java

  public void insert(int value) {
         // 第一步将插入的值，直接放在最后一个位置。并将长度加一
         store[size++] = value;
         // 得到新插入值所在位置。
         int index = size - 1;
         while(index > 0) {
             // 它的父节点位置坐标
             int parentIndex = (index - 1) / 2;
             // 如果父节点的值小于子节点的值，你不满足堆的条件，那么就交换值
             if (store[index] > store[parentIndex]) {
                 swap(store, index, parentIndex);
                 index = parentIndex;
             } else {
                 // 否则表示这条路径上的值已经满足降序，跳出循环
                 break;
             }
         }
     }
```

主要步骤:
直接将value插入到size位置，并将size自增，这样store数组中插入一个值了。
要保证从这个叶节点到根节点这条路径上的节点，满足父节点的值不能小于子节点。
通过int parentIndex = (index - 1) / 2得到父节点，如果比父节点值大，那么两者位置的值交换，然后再拿这个父节点和它的父父节点比较。
直到这个节点值比父节点值小，或者这个节点已经是根节点就退出循环。


因为我们每次只插入一个值，所以只需要保证新插入位置的叶节点到根节点路径满足堆的条件，因为其他路径没做操作，肯定是满足条件的。第二因为是直接在size位置插入值，所以肯定满足是完全二叉树这个条件。因为每次循环index都是除以2这种倍数递减的方式，所以它最多循环次数是(log N)次。

```java
   public int remove() {
          // 将根的值记录，最后返回
          int result = store[0];
          // 将最后位置的值放到根节点位置
          store[0] = store[--size];
          int index = 0;
          // 通过循环，保证父节点的值不能小于子节点。
          while(true) {
              int leftIndex = 2 * index + 1; // 左子节点
              int rightIndex = 2 * index + 2; // 右子节点
              // leftIndex >= size 表示这个子节点还没有值。
              if (leftIndex >= size) break;
              int maxIndex = leftIndex;
              if (store[leftIndex] < store[rightIndex]) maxIndex = rightIndex;
              if (store[index] < store[maxIndex]) {
                  swap(store, index, maxIndex);
                  index = maxIndex;
              } else {
                  break;
              }
          }
          return result;
      }
```
在堆中最大值就在根节点，所以操作步骤：

将根节点的值保存到result中。
将最后节点的值移动到根节点，再将长度减一，这样满足堆成立第一个条件，堆是一个完全二叉树。
使用循环，来满足堆成立的第二个条件，父节点的值不能小于子节点的值。
最后返回result。

那么怎么样满足堆的第二个条件呢？

因为根点的值现在是新值，那么就有可能比它的子节点小，所以就有可能要进行交换。

我们要找出左子节点和右子节点那个值更大，因为这个值可能要和父节点值进行交换，如果它不是较大值的话，它和父节点进行交换之后，就会出现父节点的值小于子节点。
将找到的较大子节点值和父节点值进行比较。
如果父节点的值小于它，那么将父节点和较大子节点值进行交换，然后再比较较大子节点和它的子节点。
如果父节点的值不小于子节点较大值，或者没有子节点(即这个节点已经是叶节点了)，就跳出循环。
每次循环我们都是以2的倍数递增，所以它也是最多循环次数是(log N)次。


所以通过堆这种方式可以快速实现优先级队列，它的插入和删除操作的效率都是O(log N)。
**二. DelayedWorkQueue类**
    static class DelayedWorkQueue extends AbstractQueue<Runnable>
        implements BlockingQueue<Runnable> {

从定义中看出DelayedWorkQueue是一个阻塞队列。
* **2.1 重要成员属性**
```java
// 初始时，数组长度大小。
private static final int INITIAL_CAPACITY = 16;
// 使用数组来储存队列中的元素。
private RunnableScheduledFuture<?>[] queue =
    new RunnableScheduledFuture<?>[INITIAL_CAPACITY];
// 使用lock来保证多线程并发安全问题。
private final ReentrantLock lock = new ReentrantLock();
// 队列中储存元素的大小
private int size = 0;

//特指队列头任务所在线程
private Thread leader = null;

// 当队列头的任务延时时间到了，或者有新的任务变成队列头时，用来唤醒等待线程
private final Condition available = lock.newCondition();
```

DelayedWorkQueue是用数组来储存队列中的元素，那么我们看看它是怎么实现优先级队列的。
* **2.2 插入元素排序siftUp方法**
```java
private void siftUp(int k, RunnableScheduledFuture<?> key) {
    // 当k==0时，就到了堆二叉树的根节点了，跳出循环
    while (k > 0) {
        // 父节点位置坐标, 相当于(k - 1) / 2
        int parent = (k - 1) >>> 1;
        // 获取父节点位置元素
        RunnableScheduledFuture<?> e = queue[parent];
        // 如果key元素大于父节点位置元素，满足条件，那么跳出循环
        // 因为是从小到大排序的。
        if (key.compareTo(e) >= 0)
            break;
        // 否则就将父节点元素存放到k位置
        queue[k] = e;
        // 这个只有当元素是ScheduledFutureTask对象实例才有用，用来快速取消任务。
        setIndex(e, k);
        // 重新赋值k，寻找元素key应该插入到堆二叉树的那个节点
        k = parent;
    }
    // 循环结束，k就是元素key应该插入的节点位置
    queue[k] = key;
    setIndex(key, k);
}
```
通过循环，来查找元素key应该插入在堆二叉树那个节点位置，并交互父节点的位置。具体流程在前面已经介绍过了。

* **2.3 移除元素排序siftDown方法**
```java
private void siftDown(int k, RunnableScheduledFuture<?> key) {
    int half = size >>> 1;
    // 通过循环，保证父节点的值不能小于子节点。
    while (k < half) {
        // 左子节点, 相当于 (k * 2) + 1
        int child = (k << 1) + 1;
        // 左子节点位置元素
        RunnableScheduledFuture<?> c = queue[child];
        // 右子节点, 相当于 (k * 2) + 2
        int right = child + 1;
        // 如果左子节点元素值大于右子节点元素值，那么右子节点才是较小值的子节点。
        // 就要将c与child值重新赋值
        if (right < size && c.compareTo(queue[right]) > 0)
            c = queue[child = right];
        // 如果父节点元素值小于较小的子节点元素值，那么就跳出循环
        if (key.compareTo(c) <= 0)
            break;
        // 否则，父节点元素就要和子节点进行交换
        queue[k] = c;
        setIndex(c, k);
        k = child;
    }
    queue[k] = key;
    setIndex(key, k);
}
```

通过循环，保证父节点的值不能小于子节点。

* **2.4 插入元素方法**
```java
public void put(Runnable e) {
    offer(e);
}

public boolean add(Runnable e) {
    return offer(e);
}

public boolean offer(Runnable e, long timeout, TimeUnit unit) {
    return offer(e);
}
```
我们发现与普通阻塞队列相比，这三个添加方法都是调用offer方法。那是因为它没有队列已满的条件，也就是说可以不断地向DelayedWorkQueue添加元素,当元素个数超过数组长度时，会进行数组扩容。

```java
public boolean offer(Runnable x) {
    if (x == null)
        throw new NullPointerException();
    RunnableScheduledFuture<?> e = (RunnableScheduledFuture<?>)x;
    // 使用lock保证并发操作安全
    final ReentrantLock lock = this.lock;
    lock.lock();
    try {
        int i = size;
        // 如果要超过数组长度，就要进行数组扩容
        if (i >= queue.length)
            // 数组扩容
            grow();
        // 将队列中元素个数加一
        size = i + 1;
        // 如果是第一个元素，那么就不需要排序，直接赋值就行了
        if (i == 0) {
            queue[0] = e;
            setIndex(e, 0);
        } else {
            // 调用siftUp方法，使插入的元素变得有序。
            siftUp(i, e);
        }
        // 表示新插入的元素是队列头，更换了队列头，
        // 那么就要唤醒正在等待获取任务的线程。
        if (queue[0] == e) {
            leader = null;
            // 唤醒正在等待等待获取任务的线程
            available.signal();
        }
    } finally {
        lock.unlock();
    }
    return true;
}
```
主要是三步：


元素个数超过数组长度，就会调用grow()方法，进行数组扩容。
将新元素e添加到优先级队列中对应的位置，通过siftUp方法，保证按照元素的优先级排序。
如果新插入的元素是队列头，即更换了队列头，那么就要唤醒正在等待获取任务的线程。这些线程可能是因为原队列头元素的延时时间没到，而等待的。


数组扩容方法：
```java
private void grow() {
    int oldCapacity = queue.length;
    // 每次扩容增加原来数组的一半数量。
    int newCapacity = oldCapacity + (oldCapacity >> 1); // grow 50%
    if (newCapacity < 0) // overflow
        newCapacity = Integer.MAX_VALUE;
    // 使用Arrays.copyOf来复制一个新数组
    queue = Arrays.copyOf(queue, newCapacity);
}
```
* **2.5 获取队列头元素**
2.5.1 立即获取队列头元素
```java
public RunnableScheduledFuture<?> poll() {
    final ReentrantLock lock = this.lock;
    lock.lock();
    try {
        RunnableScheduledFuture<?> first = queue[0];
        // 队列头任务是null，或者任务延时时间没有到，都返回null
        if (first == null || first.getDelay(NANOSECONDS) > 0)
            return null;
        else
            // 移除队列头元素
            return finishPoll(first);
    } finally {
        lock.unlock();
    }
}
```
当队列头任务是null，或者任务延时时间没有到，表示这个任务还不能返回，因此直接返回null。否则调用finishPoll方法，移除队列头元素并返回。

```java
// 移除队列头元素
private RunnableScheduledFuture<?> finishPoll(RunnableScheduledFuture<?> f) {
    // 将队列中元素个数减一
    int s = --size;
    // 获取队列末尾元素x
    RunnableScheduledFuture<?> x = queue[s];
    // 原队列末尾元素设置为null
    queue[s] = null;
    if (s != 0)
        // 因为移除了队列头元素，所以进行重新排序。
        siftDown(0, x);
    setIndex(f, -1);
    return f;
}
```

这个方法与我们在第一节中，介绍堆的删除方法一样。


先将队列中元素个数减一。
将原队列末尾元素设置成队列头元素，再将队列末尾元素设置为null。
调用siftDown(0, x)方法，保证按照元素的优先级排序。


2.5.2 等待获取队列头元素
```java
public RunnableScheduledFuture<?> take() throws InterruptedException {
            final ReentrantLock lock = this.lock;
            lock.lockInterruptibly();
            try {
                for (;;) {
                    RunnableScheduledFuture<?> first = queue[0];
                    // 如果没有任务，就让线程在available条件下等待。
                    if (first == null)
                        available.await();
                    else {
                        // 获取任务的剩余延时时间
                        long delay = first.getDelay(NANOSECONDS);
                        // 如果延时时间到了，就返回这个任务，用来执行。
                        if (delay <= 0)
                            return finishPoll(first);
                        // 将first设置为null，当线程等待时，不持有first的引用
                        first = null; // don't retain ref while waiting

                        // 如果还是原来那个等待队列头任务的线程，
                        // 说明队列头任务的延时时间还没有到，继续等待。
                        if (leader != null)
                            available.await();
                        else {
                            // 记录一下当前等待队列头任务的线程
                            Thread thisThread = Thread.currentThread();
                            leader = thisThread;
                            try {
                                // 当任务的延时时间到了时，能够自动超时唤醒。
                                available.awaitNanos(delay);
                            } finally {
                                if (leader == thisThread)
                                    leader = null;
                            }
                        }
                    }
                }
            } finally {
                if (leader == null && queue[0] != null)
                    // 唤醒等待任务的线程
                    available.signal();
                lock.unlock();
            }
        }
```
如果队列中没有任务，那么就让当前线程在available条件下等待。如果队列头任务的剩余延时时间delay大于0，那么就让当前线程在available条件下等待delay时间。

如果队列插入了新的队列头，它的剩余延时时间肯定小于原来队列头的时间，这个时候就要唤醒等待线程，看看它是否能获取任务。

2.5.3 超时等待获取队列头元素
```java
public RunnableScheduledFuture<?> poll(long timeout, TimeUnit unit)
    throws InterruptedException {
    long nanos = unit.toNanos(timeout);
    final ReentrantLock lock = this.lock;
    lock.lockInterruptibly();
    try {
        for (;;) {
            RunnableScheduledFuture<?> first = queue[0];
            // 如果没有任务。
            if (first == null) {
                // 超时时间已到，那么就直接返回null
                if (nanos <= 0)
                    return null;
                else
                    // 否则就让线程在available条件下等待nanos时间
                    nanos = available.awaitNanos(nanos);
            } else {
                // 获取任务的剩余延时时间
                long delay = first.getDelay(NANOSECONDS);
                // 如果延时时间到了，就返回这个任务，用来执行。
                if (delay <= 0)
                    return finishPoll(first);
                // 如果超时时间已到，那么就直接返回null
                if (nanos <= 0)
                    return null;
                // 将first设置为null，当线程等待时，不持有first的引用
                first = null; // don't retain ref while waiting
                // 如果超时时间小于任务的剩余延时时间，那么就有可能获取不到任务。
                // 在这里让线程等待超时时间nanos
                if (nanos < delay || leader != null)
                    nanos = available.awaitNanos(nanos);
                else {
                    Thread thisThread = Thread.currentThread();
                    leader = thisThread;
                    try {
                        // 当任务的延时时间到了时，能够自动超时唤醒。
                        long timeLeft = available.awaitNanos(delay);
                        // 计算剩余的超时时间
                        nanos -= delay - timeLeft;
                    } finally {
                        if (leader == thisThread)
                            leader = null;
                    }
                }
            }
        }
    } finally {
        if (leader == null && queue[0] != null)
            // 唤醒等待任务的线程
            available.signal();
        lock.unlock();
    }
}
```
与take方法相比较，就要考虑设置的超时时间，如果超时时间到了，还没有获取到有用任务，那么就返回null。其他的与take方法中逻辑一样。

**三. 总结**
使用优先级队列DelayedWorkQueue，保证添加到队列中的任务，会按照任务的延时时间进行排序，延时时间少的任务首先被获取。



