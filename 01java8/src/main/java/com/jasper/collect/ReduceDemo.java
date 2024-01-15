package com.jasper.collect;

import java.util.stream.Stream;

public class ReduceDemo {
    public static void main(String[] args) {
        Integer reduce = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
        System.out.println("reduce = " + reduce);
    }
}
