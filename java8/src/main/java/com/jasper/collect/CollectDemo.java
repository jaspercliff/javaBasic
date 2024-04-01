package com.jasper.collect;

import com.jasper.domains.Student;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student().setName("jasper").setAge("18"),
                new Student().setName("cliff").setAge("19")
        );
//        List<Student> collect = studentStream.collect(Collectors.toList());
//        System.out.println("collect = " + collect);
//        Set<Student> collect1 = studentStream.collect(Collectors.toSet());
//        System.out.println("collect1 = " + collect1);
        Map<String, String> collect = studentStream.collect(Collectors.toMap(Student::getName, Student::getAge));
        System.out.println("collect = " + collect);
    }
}
