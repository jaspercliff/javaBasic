package com.jasper;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class DemoCall {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());
    }

    public static class MyCallable implements Callable {
        @Override
        public Object call() throws Exception {
            for (int i = 0; i < 5; i++) {
                System.out.println("my callable");
            }
            return 1;
        }
    }
}
