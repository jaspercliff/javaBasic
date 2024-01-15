package com.jasper;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        System.out.println(list);

        ArrayList<Object> objects = new ArrayList<>();
        final int n = 10000000;
        long start = System.currentTimeMillis();
        objects.ensureCapacity(n);
        for (int i = 0; i < n; i++) {
            objects.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
