package com.jasper;

/**
 * Hello world!
 *
 */
public class DemoRun
{
    public static void main( String[] args )
    {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);//new
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main Thread");
        }
    }
}
