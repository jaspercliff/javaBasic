package com.jasper.Reader;

import java.io.FileWriter;

public class WriterDemo {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("D:\\java\\basic8\\IO\\src\\main\\java\\com\\jasper\\Reader\\output.txt")){
            fileWriter.write("jasper is so handsome");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
