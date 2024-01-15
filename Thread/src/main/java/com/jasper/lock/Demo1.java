package com.jasper.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo1 {
    public static void main(String[] args) {
        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
        SynchronizedDemo synchronizedDemo1 = new SynchronizedDemo();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->{synchronizedDemo.fun1();});
        executorService.execute(()->{synchronizedDemo1.fun1();});
        executorService.shutdown();
    }
}
