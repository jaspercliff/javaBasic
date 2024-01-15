package com.jasper.interrupt;

import static java.lang.Thread.interrupted;

public class Demo1 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (!interrupted()) {
                System.out.println(Thread.currentThread().getState()+"--" + Thread.currentThread().getName());
            }
            System.out.println(Thread.currentThread().getName() + "end");
        });
        thread.start();
        for (int i = 0; i < 4; i++) {
            System.out.println("main");
        }
        System.out.println(Thread.currentThread().getName()+" end");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.interrupt();
    }
}
