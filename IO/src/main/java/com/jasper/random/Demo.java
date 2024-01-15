package com.jasper.random;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class Demo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rws = new RandomAccessFile(
                new File("D:\\java\\basic8\\IO\\src\\main\\java\\com\\jasper\\random\\input.txt"), "rws");
        System.out.println("读取之前的指针位置："+rws.getFilePointer()+"读取的内容："+(char)rws.read()+"读取之后的指针位置"+rws.getFilePointer());
        rws.seek(6);
        System.out.println("读取之前的指针位置："+rws.getFilePointer()+"读取的内容："+(char)rws.read()+"读取之后的指针位置"+rws.getFilePointer());
        rws.write(new byte[]{'h','i','j','k'});
        rws.seek(0);
        System.out.println("读取之前的指针位置："+rws.getFilePointer()+"读取的内容："+(char)rws.read()+"读取之后的指针位置"+rws.getFilePointer());
        rws.seek(0);
        int content;
        while ((content = rws.read())!=-1){
            System.out.print((char) content);
        }
    }
}
