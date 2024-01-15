package com.jasper.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo2 {
    public static void main(String[] args) {
        LockDemo lockDemo = new LockDemo();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->{
            lockDemo.fun1();
        });
        executorService.execute(()->lockDemo.fun1());
        executorService.shutdown();
    }
}
