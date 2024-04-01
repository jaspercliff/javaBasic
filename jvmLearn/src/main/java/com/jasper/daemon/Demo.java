package com.jasper.daemon;

public class Demo {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        method2();
        System.out.println("method1");
    }
    public static void method2(){
        method3();
        System.out.println("method2");
    }
    public static int method3(){
        int i =1;
        System.out.println("method3");
        return i;
    }
}
