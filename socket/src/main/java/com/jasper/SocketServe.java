package com.jasper;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServe {
    public static void main(String[] args) {
        int port = 6666;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
//            监听来自客户端的连接
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
                double sideLength = dataInputStream.readDouble();
                System.out.println("the sideLength server accept = " + sideLength);
                double result = sideLength*sideLength;
                dataOutputStream.writeDouble(result);
                dataOutputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
