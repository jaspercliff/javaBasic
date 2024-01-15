package com.jasper.StringDemo;

import java.sql.Array;

public class ArrayChangeDemo {
    public static void main(String[] args) {
        final int[] value = {1,2,3};
        int[] anotherValue = {4,5,6};
//        value =anotherValue;
        value[2]=6;
        System.out.println(value[2]);
    }
}
