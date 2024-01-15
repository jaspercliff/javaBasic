package com.jasper.StringDemo.stringdemo;

public class Demo2 {
    public static void main(String[] args) {
        String[] arr = {"he", "llo", "world"};
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        System.out.println(s);
    }
}
