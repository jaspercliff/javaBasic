package com.jasper;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SocketServeMulti {
    public static void main(String[] args) {
        int clientNo =1;
        int port = 7000;
        ExecutorService executorService = Executors.newCachedThreadPool();
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true){
                Socket socket= serverSocket.accept();
                executorService.execute(new singleServer(socket,clientNo));
                clientNo++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

class singleServer implements Runnable{
    private Socket socket;
    private int clientNo;

    public singleServer(Socket socket, int clientNo) {
        this.socket = socket;
        this.clientNo = clientNo;
    }

    @Override
    public void run() {
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
            double length = dataInputStream.readDouble();
            System.out.println("the length get from client is "+length);
            double result = length*length;
            dataOutputStream.writeDouble(result);
            dataOutputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("与"+clientNo+"close");
        }
    }
}