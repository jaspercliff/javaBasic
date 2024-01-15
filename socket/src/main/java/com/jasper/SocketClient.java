package com.jasper;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
    public static void main(String[] args) {
        int port = 7000;
        try {
            Socket socket = new Socket("127.0.0.1", port);
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
            Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter the side length of the square");
                double sideLength = scanner.nextDouble();
                dataOutputStream.writeDouble(sideLength);
                dataOutputStream.flush();
                double area = dataInputStream.readDouble();
                System.out.println("the area client accept is"+area);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
