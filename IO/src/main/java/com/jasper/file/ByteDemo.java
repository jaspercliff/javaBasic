package com.jasper.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDemo {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream
                ("C:\\code\\javaBasic\\IO\\src\\main\\java\\com\\jasper\\file\\test.png");
            FileOutputStream fileOutputStream = new FileOutputStream
                    ("C:\\code\\javaBasic\\IO\\src\\main\\java\\com\\jasper\\file\\testCopy.png")

        ) {
            int byteValue;
            while ((byteValue = fileInputStream.read())!=-1){
                fileOutputStream.write(byteValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
