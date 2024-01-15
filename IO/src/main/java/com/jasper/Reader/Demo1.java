package com.jasper.Reader;

import java.io.FileReader;

public class Demo1 {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("D:\\java\\basic8\\IO\\src\\main\\java\\com\\jasper\\Reader\\input.txt")){
            int content;
            long skip = fileReader.skip(2);
            while ((content=fileReader.read())!=-1){
                System.out.print((char) content);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
