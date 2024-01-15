package com.jasper.interrupt;

public class Demo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("thread:" + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();
        System.out.println("main Thread"+Thread.currentThread().getName());
        thread.interrupt();
    }
}
