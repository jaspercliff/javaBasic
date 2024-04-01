package com.jasper.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class NioServerExample {
    public static void main(String[] args) throws Exception {
        // 创建选择器
        Selector selector = Selector.open();

        // 打开服务器套接字通道
        ServerSocketChannel serverSocket = ServerSocketChannel.open();
        serverSocket.bind(new InetSocketAddress(8080));
        serverSocket.configureBlocking(false);

        // 将服务器套接字注册到选择器以接受连接
        serverSocket.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            // 选择一组键，其相应的通道已为 I/O 操作准备就绪
            selector.select();

            // 获取选择键集
            Iterator<SelectionKey> keyIterator = selector.selectedKeys().iterator();

            while (keyIterator.hasNext()) {
                SelectionKey key = keyIterator.next();

                if (key.isAcceptable()) {
                    // 接受连接
                    ServerSocketChannel server = (ServerSocketChannel) key.channel();
                    SocketChannel client = server.accept();
                    client.configureBlocking(false);

                    // 将新连接注册到选择器
                    client.register(selector, SelectionKey.OP_READ);
                    System.out.println("Accepted connection from " + client);
                } else if (key.isReadable()) {
                    // 读取数据
                    SocketChannel client = (SocketChannel) key.channel();
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    int numBytesRead = client.read(buffer);
                    if (numBytesRead > 0) {
                        buffer.flip();
                        // 处理数据
                        System.out.println("Received: " + new String(buffer.array()));
                    }
                }
                keyIterator.remove();
            }
        }
    }
}

