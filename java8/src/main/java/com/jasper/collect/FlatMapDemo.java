package com.jasper.collect;

import com.jasper.domains.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞", "175"));
        students.add(new Student("红发", "180"));
        students.add(new Student("白胡子", "185"));
        List<Student> students1 = new ArrayList<>(3);
        students.add(new Student("路飞11", "175"));
        students.add(new Student("红发11", "180"));
        List<Stream<Student>> collect1 = Stream.of(students, students1).map(Collection::stream).collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);
        List<Student> collect = Stream.of(students, students1).flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}
