package com.jasper.collect;

import com.jasper.domains.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxMinDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞", "175"));
        students.add(new Student("红发", "180"));
        students.add(new Student("白胡子", "185"));
//        按照字符串去比较的大小
        Optional<Student> max = students.stream().max(Comparator.comparing(Student::getAge));
        Optional<Student> min = students.stream().min(Comparator.comparing(Student::getAge));
        //判断是否有值
        max.ifPresent(System.out::println);
        min.ifPresent(System.out::println);
    }
}
