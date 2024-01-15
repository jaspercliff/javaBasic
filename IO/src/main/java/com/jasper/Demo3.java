package com.jasper;
import java.beans.Transient;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\java\\basic8\\IO\\src\\main\\java\\com\\jasper\\output.txt");
        byte[] bytes = "jasper handsome".getBytes();
        fileOutputStream.write(bytes);

    }
}