package com.jasper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnmodifiedDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        List<Integer> integers = Collections.unmodifiableList(arrayList);
//        UnsupportedOperationException
        integers.add(2);
        System.out.println(arrayList);
    }
}
