package com.jasper.serial;

import java.io.*;

public class JDKSerialInDemo {
    public static void main(String[] args) {
        Student jasper = new Student().setId("1").setName("jasper").setAge(18);
           try (FileInputStream fileInputStream = new FileInputStream("D:\\java\\javaBasic\\base\\src\\main\\java\\com\\jasper\\serial\\student.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
               Student student = (Student) objectInputStream.readObject();
               System.out.println(student);
           } catch (IOException | ClassNotFoundException e) {
               e.printStackTrace();
           }
    }
}
