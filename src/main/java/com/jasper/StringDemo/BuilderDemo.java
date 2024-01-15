package com.jasper.StringDemo;

import java.util.HashSet;

public class BuilderDemo {
    public static void main(String[] args) {
        HashSet<StringBuilder> hs = new HashSet<>();
        StringBuilder a = new StringBuilder("a");
        StringBuilder ab = new StringBuilder("ab");
        hs.add(a);
        hs.add(ab);
        System.out.println(hs);
        StringBuilder s = a;
        s.append("b");
        System.out.println(hs);
    }
}
