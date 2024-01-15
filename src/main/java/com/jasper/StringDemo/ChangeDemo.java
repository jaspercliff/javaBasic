package com.jasper.StringDemo;

public class ChangeDemo {
    public static void main(String[] args) {
                String myString = "Hello";
                printString(myString);
                // 在调用方法后，我们期望myString保持不变
                System.out.println("After method call: " + myString);
            }
public static void printString(String str) {
        str = "asd";
        System.out.println(str);
        }
}


