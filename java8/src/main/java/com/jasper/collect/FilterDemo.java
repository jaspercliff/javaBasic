package com.jasper.collect;

import com.jasper.domains.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {
        Student jasper = new Student().setAge("18").setName("jasper");
        Student cliff = new Student().setAge("19").setName("cliff");
//            Stream<T> filter(Predicate<? super T> predicate);
        List<Student> collect = Stream.of(jasper, cliff).filter(student -> Integer.parseInt(student.getAge()) > 18)
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}
