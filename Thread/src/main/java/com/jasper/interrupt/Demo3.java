package com.jasper.interrupt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo3 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 15; i++) {
            final int taskNumber = i;
            executor.submit(()->{
                System.out.println("task:"+taskNumber+" started");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("task:"+taskNumber+" interrupted");
                }
                System.out.println("task:"+taskNumber+"completed");
            });
        }
        executor.shutdownNow();

        try {
            if(!executor.awaitTermination(5, TimeUnit.SECONDS)){
                System.out.println("some tasks are still running after 5 seconds");
            }else {
                System.out.println("all tasks are completed");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
