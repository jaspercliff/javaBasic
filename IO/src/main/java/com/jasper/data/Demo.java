package com.jasper.data;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\java\\basic8\\IO\\src\\main\\java\\com\\jasper\\data\\input.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeInt(2);
        dataOutputStream.writeInt(3);
        dataOutputStream.writeDouble(2.0);
        dataOutputStream.writeBoolean(false);
        dataOutputStream.flush();
        dataOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("D:\\java\\basic8\\IO\\src\\main\\java\\com\\jasper\\data\\input.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readDouble());
        System.out.println(dataInputStream.readBoolean());

    }}
