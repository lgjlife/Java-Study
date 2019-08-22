package com.example.demo.thread;

import java.util.concurrent.locks.LockSupport;

public class ThreadLocalService {

    ThreadLocal threadLocal = new ThreadLocal();

    public void print(){

        System.out.println(Thread.currentThread().getName() +":"+ threadLocal.get());
    }

    public void init(){
        threadLocal.set(Thread.currentThread().getName());

    }


    public  static class ThreadDemo extends Thread{

        ThreadLocalService threadLocalService;


        public ThreadDemo(ThreadLocalService threadLocalService) {
            this.threadLocalService = threadLocalService;
        }

        @Override
        public void run() {

            threadLocalService.init();

            while (true){
                try{

                    Thread.sleep(1000);
                    threadLocalService.print();
                }
                catch(Exception ex){

                }
            }
        }
    }
}
