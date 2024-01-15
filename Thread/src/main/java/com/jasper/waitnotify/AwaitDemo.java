package com.jasper.waitnotify;

import com.jasper.lock.LockDemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AwaitDemo {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    public void before(){
        lock.lock();
        System.out.println("before");
        condition.signal();
        lock.unlock();
    }

    public void after(){
        lock.lock();
        try {
            condition.await();
            System.out.println("after");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lock.unlock();
    }

}
