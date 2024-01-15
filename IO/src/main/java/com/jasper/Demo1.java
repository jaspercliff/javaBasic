package com.jasper;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Demo1 {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("D:\\java\\basic8\\IO\\src\\main\\java\\com\\jasper\\input.txt")){
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedInputStream.mark(bufferedInputStream.available());
            for (int i = 0; i < 6; i++) {
                    System.out.print((char) bufferedInputStream.read());
            }
            System.out.println("已经读了6个字节");


            bufferedInputStream.reset();
            bufferedInputStream.skip(2);
            for (int i = 0; i < 6; i++) {
                System.out.print((char) bufferedInputStream.read());
            }
            System.out.println("跳了俩个字节读6个");


            bufferedInputStream.reset();
            int content;
            while ((content=bufferedInputStream.read())!=-1){
                System.out.print((char) content);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
