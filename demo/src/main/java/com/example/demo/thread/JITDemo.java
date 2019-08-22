package com.example.demo.thread;

//-server -Xcomp -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly -XX:CompileCommand=compileonly,*JITDemo.main
public class JITDemo {

    private static volatile  int name = 0x1234;

    private static volatile Object object= null;

    public static void main(String args[]){



        object = new Object();
        for(int i = 0; i< 10; i++){
            name++;
        }
    }
}
