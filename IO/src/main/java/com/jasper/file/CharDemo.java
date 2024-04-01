package com.jasper.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDemo {
    public static void main(String[] args) {
        try (FileReader
                     fileReader = new FileReader("C:\\code\\javaBasic\\IO\\src\\main\\java\\com\\jasper\\file\\source.txt");
             FileWriter fileWriter = new FileWriter("C:\\code\\javaBasic\\IO\\src\\main\\java\\com\\jasper\\file\\destination.txt");
        ){
            int byteValue;
            while ((byteValue = fileReader.read())!= -1){
                fileWriter.write(byteValue);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
