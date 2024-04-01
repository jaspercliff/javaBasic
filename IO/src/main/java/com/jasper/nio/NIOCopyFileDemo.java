package com.jasper.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOCopyFileDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\code\\javaBasic\\IO\\src\\main\\java\\com\\jasper\\nio\\data.txt");
        FileChannel fci = fileInputStream.getChannel();
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\code\\javaBasic\\IO\\src\\main\\java\\com\\jasper\\nio\\output.txt");
        FileChannel fco = fileOutputStream.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        //将读取的数据写到缓冲区
        int read = fci.read(buffer); //此时position = read
        while (read != -1) {
            buffer.flip(); // 准备读取数据    limit设置为当前position position = 0
            fco.write(buffer); // 写入数据
            while (buffer.hasRemaining()){
                System.out.print((char) buffer.get());
            }
            buffer.clear();
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
}
