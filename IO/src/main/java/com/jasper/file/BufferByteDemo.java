package com.jasper.file;

import java.io.*;

public class BufferByteDemo {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream
                ("C:\\code\\javaBasic\\IO\\src\\main\\java\\com\\jasper\\file\\test.png");
            FileOutputStream fileOutputStream = new FileOutputStream
                    ("C:\\code\\javaBasic\\IO\\src\\main\\java\\com\\jasper\\file\\testCopy.png");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)
        ) {
            int byteData;
            while ((byteData = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
