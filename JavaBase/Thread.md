# Java多线程知识点总结

* 进程：受操作系统进行资源分配和任务调度的一个基本单元。每个进程都有独立的内存空间。
* 线程：进程中的一个独立运行的子任务，共享进程的内存空间。
* 使用多线程的优点
    * 有效利用多核心CPU资源
    * 利用多线程当并发特性，提高程序的运行效率。
* 使用多线程的方式
方式1：继承Thread类
```java
class MyThread1  extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread1");
    }
}
public static void main(String args[]){
    Thread thread = new MyThread1();
    thread.start();
}


       

```
方式2：实现Runnable接口
```java
class MyThread2  implements Runnable{

    public void run() {
        System.out.println("MyThread2");
    }
}
public static void main(String args[]){
    MyThread2 thread2 = new MyThread2();
    Thread  th =  new Thread(thread2);
    th.start();
}


```

方式3 实现Callable接口
```java

class MyThread3  implements Callable {

    public Object call() throws Exception {
        System.out.println("MyThread3");
        return 123;
    }

}
public static void main(String args[]){
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
1. Java是单继承，使用方式1会导致无法继承其他类
2. 如果想获取线程调用后返回的值，选用方式3.

## 停止线程
* 抛出异常，不捕获
* 调用stop方法，不推荐使用。强制中断，导致一些资源未能释放或处理。
* 任务执行完
* 调用return
* 其他线程调用thread.interrupt(),使线程thread中断位使能,注意该调用并不会导致线程异常或者停止，线程在run中随时检查中断位，进行处理之后再退出线程。
* 如果thread.interrupt()时，线程正在执行wait或者sleep方法，会自动抛出异常InterruptedException
```java
public class ThreadStop {

    public static void main(String args[]) throws Exception{

        StopThread stopThread =  new StopThread();
        stopThread.start();

        Thread.sleep(10);
        stopThread.interrupt();

    }
}

class StopThread extends Thread{


    @Override
    public void run() {
        super.run();

        for(int i = 0; i< 999999999 ; i++){


            try{
              //  System.out.println(this.isInterrupted());
                Thread.sleep(1000);
             //不断检测中断位
                if(this.isInterrupted()){
                    throw new InterruptedException();
                }
            }
            catch(Exception ex){
                System.out.println("thread exception...");
                break; // or return
            }
        }

        System.out.println("线程结束");

    }
}
```
* 暂停和恢复线程
    * suspend() : 暂停线程，不释放锁
    * resume(): 恢复线程。
    * 缺点:由于不释放锁，有可能线程不能被唤醒，导致出现死锁。
* 另一种暂停方式：yield().放弃当前的CPU，但是放弃时间不确定，有可能刚放弃，CPU又分配时间。
* 线程优先级：1-10个等级，等级越高，优先级越大。线程的任务也会分配更多的时间，但不一定先完成。
    * 继承特性，子线程继承父线程的优先级
* 守护线程： 线程包括两种：用户线程和守护线程。垃圾回收器就是一个守护线程。用户线程全部停止工作后，守护线程自动销毁。
```java
thread.setDaemon(true);
//必须先设置守护线程才能start
thread.start();
```

* 调用start和直接调用run的区别，直接调用run，那么run程序就会再当前线程直接执行，为同步执行。而调用start，交由JVM管理，为异步执行。
* start只能被调用一次。多次调用会产生异常：IllegalThreadStateException

## 线程同步

### synchronized
* 线程互斥性
* 可重入性

以下四种情况中，第一和第二个是同一个锁，都是调用的当前对象，同时执行两个方法时会同步。
第三和第四是同一个锁，都是类。执行这两个方法时会同步。
而任意的func1 ,func2 和func3,fun4其中两个同时执行，不需要同步。比如类；两个线程同时调用func1和func3不会进行同步。

```java
public Demo{
    
    //1.普通方法
    public synchronized void func1(){
        
    }
    
    //2.同步方法块，使用this来同步
    public synchronized void func2(){
         synchronized(this){
             
         }   
    }
        
        
    //3.静态类
    public synchronized static void func3(){
            
    }
    
    //4.同步方法块,使用类来同步
    public synchronized void func4(){
         synchronized(Demo.class){
             
         }   
    }

}
```
* 可重入锁
synchronized具有可重入特性。
如下的例子，func1调用func2。如果没有可重入性，由于线程还未执行完func1，锁未释放，因此调用fun2时将会产生死锁。
由于其具有可重入性，调用func2时发现是同一个锁，便可以直接调用。
```java

 public synchronized void func1(){
       func2(); 
 }
 
 public synchronized void func2(){
         
}

```


