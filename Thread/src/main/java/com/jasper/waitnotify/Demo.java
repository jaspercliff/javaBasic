package com.jasper.waitnotify;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        AwaitDemo awaitDemo = new AwaitDemo();
        executorService.execute(()->{
            awaitDemo.after();
        });
        executorService.execute(()->{awaitDemo.before();});
    }
}
