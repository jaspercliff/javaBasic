package com.jasper.lock;

import javax.lang.model.element.VariableElement;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    private Lock lock = new ReentrantLock();

    public void fun1() {
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        lock.unlock();
    }
}
