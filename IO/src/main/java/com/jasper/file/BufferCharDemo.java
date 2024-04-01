package com.jasper.file;

import java.io.*;

public class BufferCharDemo {
    public static void main(String[] args) {
        try (FileReader
                     fileReader = new FileReader("C:\\code\\javaBasic\\IO\\src\\main\\java\\com\\jasper\\file\\source.txt");
             FileWriter fileWriter = new FileWriter("C:\\code\\javaBasic\\IO\\src\\main\\java\\com\\jasper\\file\\destination.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ){
            String line;
         while ((line =  bufferedReader.readLine())!= null){
             bufferedWriter.write(line);
         }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
