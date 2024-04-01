package com.jasper.AIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AsyncFileReadExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        Path path = Paths.get("C:\\code\\javaBasic\\IO\\src\\main\\java\\com\\jasper\\AIO\\input.txt");
        try(AsynchronousFileChannel asynchronousFileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ)){
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            asynchronousFileChannel.read(buffer, 0, buffer, new CompletionHandler<Integer, ByteBuffer>() {
                @Override
                public void completed(Integer result, ByteBuffer attachment) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Read done! Bytes read: " + result);
                    attachment.flip();
                    byte[] data = new byte[attachment.limit()];
                    attachment.get(data);
                    System.out.println(new String(data));
                    attachment.clear();
                }

                @Override
                public void failed(Throwable exc, ByteBuffer attachment) {
                    System.out.println("Read failed!");
                    exc.printStackTrace();
                }
            });
            System.out.println("haha");
            // 模拟其他任务执行
            Thread.sleep(2000); // 等待异步读取完成
            System.out.println("system exit");
        }
    }
}
