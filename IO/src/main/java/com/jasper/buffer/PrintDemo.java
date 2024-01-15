package com.jasper.buffer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintDemo {
    public static void main(String[] args) {
        try {
            PrintStream printStream = new PrintStream(new FileOutputStream("D:\\java\\basic8\\IO\\src\\main\\java\\com\\jasper\\buffer\\out.txt"), true);
            printStream.println("jasper is handsome 孩子气");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
