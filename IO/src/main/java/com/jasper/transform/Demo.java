package com.jasper.transform;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(
                new File("D:\\java\\basic8\\IO\\src\\main\\java\\com\\jasper\\input.txt"));
//        装饰器模式
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        bufferedInputStream.mark(0);
        int content;
        while ((content=bufferedInputStream.read())!=-1){
            System.out.print((char) content);
        }
        System.out.println();
        bufferedInputStream.reset();
//        适配器模式
        InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream);
        while ((content=inputStreamReader.read())!=-1){
            System.out.print((char) content);
        }
    }
}
