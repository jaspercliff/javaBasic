package com.jasper.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelExample {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("C:\\code\\javaBasic\\IO\\src\\main\\java\\com\\jasper\\nio\\data.txt", "rw");
        FileChannel channel = file.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(48);
        int read = channel.read(buffer);
        System.out.println("read = " + read);
        while (read != -1){
            buffer.flip();

            while (buffer.hasRemaining()){
                System.out.print((char) buffer.get());
            }
            buffer.clear();
        }
        file.close();
    }
}
