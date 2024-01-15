package com.jasper.StringDemo.stringdemo;

public class Demo3 {
    public static void main(String[] args) {
        String  s1 = new String("abc");
        String s2 = s1.intern();
        System.out.println(s1 == s2);
        String s3 = new String("a")+new String("b");
        String s4 = s3.intern();
        System.out.println(s3 == s4);
    }
}
