package com.jasper;

public class DemoThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();
    }
    public static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("myThread");
            }
        }
    }

}
