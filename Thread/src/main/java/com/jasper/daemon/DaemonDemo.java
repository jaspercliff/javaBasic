package com.jasper.daemon;

import java.io.*;

public class DaemonDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    saveLogsToFile();
                    Thread.sleep(2000);
                } catch ( Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main Thread :"+i+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("All thread is completed");
        System.out.println(thread.getState());
    }

     public static void saveLogsToFile() throws FileNotFoundException {
         FileOutputStream fileOutputStream = new FileOutputStream("C:\\code\\javaBasic\\Thread\\src\\main\\java\\com\\jasper\\daemon\\output.txt",true);
         PrintStream printStream = new PrintStream(fileOutputStream);
         printStream.println("logs in");
     }
}
