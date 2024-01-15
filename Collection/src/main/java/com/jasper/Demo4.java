package com.jasper;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Demo4 {
    public static void main(String[] args) {
        TreeMap<Person,String>  map= new TreeMap<>();
        map.put(new Person("jasper",20),"jasper");
        map.put(new Person("cliff",18),"cliff");
        map.put(new Person("hzq",90),"hzq");
        map.forEach(
                (key,value)->{
                    System.out.println(key + ":" +value);
                }
        );
    }
}
