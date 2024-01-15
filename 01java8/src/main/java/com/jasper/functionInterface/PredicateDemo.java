package com.jasper.functionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate = String::isEmpty;
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("haha"));

        List<String> list = Arrays.asList("java", "c", "php");
        List<String> collect = list.stream().filter(str -> {
            return str.length() == 4;
        }).collect(Collectors.toList());
        System.out.println(collect);
//        and concat two predicate
        Predicate<Integer> predicate1 = number -> number>5;
        Predicate<Integer> predicate2 = number-> number<10;
        List<Integer> list1 = Arrays.asList(1, 5, 9, 7, 6);
        Predicate<Integer> filter = predicate1.and(predicate2);
        List<Integer> collect1 = list1.stream().filter(filter).collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);
//negate 否定
        List<Integer> collect2 = list1.stream().filter(filter.negate()).collect(Collectors.toList());
        System.out.println("collect2 = " + collect2);
//        or
        Predicate<Integer> lessThan5 = number->number<5;
        Predicate<Integer> greaterThan10 = number->number>10;
        List<Integer> list2 = Arrays.asList(1, 2, 3, 6, 7, 11, 12, 15);
        Predicate<Integer> filter1 = lessThan5.or(greaterThan10);
        List<Integer> collect3 = list2.stream().filter(filter1).collect(Collectors.toList());
        System.out.println("collect3 = " + collect3);

    }
}
