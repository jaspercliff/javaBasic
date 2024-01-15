package com.jasper.lock;

public class SynchronizedDemo {
    public void fun1(){
        synchronized (SynchronizedDemo.class) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print(i+" ");
            }
        }
    }
}
