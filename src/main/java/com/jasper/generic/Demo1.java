package com.jasper.generic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        Method add = list.getClass().getDeclaredMethod("add", Object.class);
        add.invoke(list,"jasper");
        System.out.println(list);
    }
}
