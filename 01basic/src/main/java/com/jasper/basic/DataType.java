package com.jasper.basic;

public class DataType {
    public static void main(String[] args) {
        Integer a = new Integer(123);
        Integer b = new Integer(123);
        System.out.println(a==b);
        Integer c = Integer.valueOf(123);
        Integer d = Integer.valueOf(123);
        System.out.println(c==d);
    }
}
