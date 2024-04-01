package com.jasper;

import java.util.HashMap;
import java.util.Map;

public class Test {
   static Map<Integer,String> map;

    public static void main(String[] args) {
        map.put(1,"Value1");
        System.out.println(map.toString());
    }
}
