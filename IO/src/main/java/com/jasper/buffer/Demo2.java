package com.jasper.buffer;

import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\java\\basic8\\IO\\src\\main\\java\\com\\jasper\\buffer\\input.txt");
        FileChannel channelIn = fileInputStream.getChannel();
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\java\\basic8\\IO\\src\\main\\java\\com\\jasper\\buffer\\out.txt");
        FileChannel channelOut = fileOutputStream.getChannel();
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        while (true){
            int read = channelIn.read(allocate);
            if (read == -1){
                break;
            }
            allocate.flip();
            channelOut.write(allocate);
            allocate.clear();
        }

    }
}
