package com.jasper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("D:\\java\\basic8\\NIO\\src\\main\\java\\com\\jasper\\test.txt","rws");
        FileChannel channel = randomAccessFile.getChannel();
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        char a = (char)channel.read(allocate);
        System.out.println("a = " + a);

    }
}
