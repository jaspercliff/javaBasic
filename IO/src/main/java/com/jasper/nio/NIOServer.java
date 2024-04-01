package com.jasper.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NIOServer {
    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        ServerSocketChannel serverSocket = ServerSocketChannel.open();
//        配置非阻塞
        serverSocket.configureBlocking(false);
        serverSocket.bind(new InetSocketAddress("localhost", 8080));
        //通道注册到选择器上
        serverSocket.register(selector, SelectionKey.OP_ACCEPT);
        while (true){
            //选择一组键 其相应的通道已经准备好io操作
            selector.select();
//          返回已选择键集
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()){
                SelectionKey key = iterator.next();
                if (key.isAcceptable()){
                    //接受连接
                    ServerSocketChannel server =  (ServerSocketChannel)key.channel();
                    SocketChannel client = server.accept();

                    client.configureBlocking(false);
//                注册读操作
                    client.register(selector,SelectionKey.OP_READ);
                }else if(key.isReadable()){
                    //读数据
                    SocketChannel client = (SocketChannel)key.channel();

                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    int read = client.read(buffer);
                    if (read > 0) {
                        buffer.flip();
                        //返回当前位置和限制之间的元素数
                        byte[] bytes = new byte[buffer.remaining()];
                        // 从缓冲区读取字节到字节数组
                        buffer.get(bytes);
                        String message = new String(bytes);
                        System.out.println("Message received: " + message);

                        // 响应客户端
                        ByteBuffer writeBuffer = ByteBuffer.wrap(("Echo: " + message).getBytes());
                        client.write(writeBuffer);
                    } else if (read < 0) {
                        // 结束通道
                        client.close();
                    }
                    }
                // 移除处理过的键
                iterator.remove();
                }
            }
        }
    }
