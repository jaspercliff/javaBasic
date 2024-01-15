package com.jasper;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("D:\\java\\basic8\\IO\\src\\main\\java\\com\\jasper\\output.txt")){
            Person person = new Person("jasper", 22);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
            FileInputStream fileInputStream = new FileInputStream("D:\\java\\basic8\\IO\\src\\main\\java\\com\\jasper\\output.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person person1 = (Person) objectInputStream.readObject();
            System.out.println("person1 = " + person1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
