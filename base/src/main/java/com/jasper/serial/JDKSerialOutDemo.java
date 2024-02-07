package com.jasper.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class JDKSerialOutDemo {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("D:\\java\\javaBasic\\base\\src\\main\\java\\com\\jasper\\serial\\student.ser");
                    ObjectOutputStream ObjectOutputStream=new ObjectOutputStream(fileOutputStream))
        {
            Student jasper = new Student().setId("1").setName("jasper").setAge(18);
            ObjectOutputStream.writeObject(jasper);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
