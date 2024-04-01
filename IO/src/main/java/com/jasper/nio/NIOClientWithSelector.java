package com.jasper.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NIOClientWithSelector {

    public static void main(String[] args) throws Exception {
        // 打开选择器
        Selector selector = Selector.open();

        // 打开一个SocketChannel并配置为非阻塞
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);

        // 连接到服务器地址和端口
        socketChannel.connect(new InetSocketAddress("localhost", 8080));

        // 将通道注册到选择器上，对连接完成事件感兴趣
        socketChannel.register(selector, SelectionKey.OP_CONNECT);

        while (true) {
            // 等待事件
            selector.select();

            // 获取事件集合
            Set<SelectionKey> selectedKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectedKeys.iterator();

            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                iterator.remove();

                if (key.isConnectable()) {
                    handleConnect(key);
                } else if (key.isReadable()) {
                    handleRead(key);
                }
            }
        }
    }

    private static void handleConnect(SelectionKey key) throws Exception {
        SocketChannel channel = (SocketChannel) key.channel();

        // 完成连接
        if (channel.isConnectionPending()) {
            channel.finishConnect();
        }

        // 注册读事件
        channel.register(key.selector(), SelectionKey.OP_READ);

        // 发送消息到服务器
        String message = "Hello, Server!";
        ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());
        while (buffer.hasRemaining()) {
            channel.write(buffer);
        }
    }

    private static void handleRead(SelectionKey key) throws Exception {
        SocketChannel channel = (SocketChannel) key.channel();

        // 读取服务器响应
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        int readBytes = channel.read(readBuffer);

        if (readBytes > 0) {
            readBuffer.flip();
            byte[] bytes = new byte[readBuffer.remaining()];
            readBuffer.get(bytes);
            String response = new String(bytes);
            System.out.println("Message from server: " + response);

            // 关闭连接
            channel.close();
            key.selector().close();
            System.exit(0); // 正常退出程序
        }
    }
}
