package com.example.demo.thread;

public class ThreadTask {

    public static void main(String args[]){

        ThreadLocalService threadLocalService = new ThreadLocalService();

        for(int i = 0; i< 30; i++){

            try{

                Thread.sleep(1000);
                ThreadLocalService.ThreadDemo threadDemo =  new ThreadLocalService.ThreadDemo(threadLocalService);
                threadDemo.start();
            }
            catch(Exception ex){

            }


        }

        System.out.println("启动结束！");
        System.gc();
    }


}
