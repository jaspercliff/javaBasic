package com.jasper.basic;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3 == s4);

    }
}
