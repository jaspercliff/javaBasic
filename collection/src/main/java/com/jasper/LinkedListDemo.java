package com.jasper;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("LinkedList: " + list);

        list.remove("Banana");

        System.out.println("LinkedList after removing Banana: " + list);

        list.add(1, "Grape");

        System.out.println("LinkedList after adding Grape at index 1: " + list);

    }
}
