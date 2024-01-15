package com.jasper.waitnotify;
public class WaitNotifyDemo {
    public static void main(String[] args) {
        final  Object monitor = new Object();
        Thread before = new Thread(() -> {
            synchronized (monitor) {
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("before");
            }
        });
        Thread  after = new Thread(() -> {
            synchronized (monitor) {
                monitor.notify();
                System.out.println("after");
            }
        });
        before.start();
        after.start();
    }
}
