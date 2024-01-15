package com.jasper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class demo {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("D:\\java\\basic8\\IO\\src\\main\\java\\com\\jasper\\input.txt")){
            System.out.println("number of stream remaining bytes: "+fileInputStream.available());
            System.out.println("the number of bytes skipped: "+fileInputStream.skip(6));
            int content;
            while ((content=fileInputStream.read())!=-1){
                System.out.print((char) content);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
