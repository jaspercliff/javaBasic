package com.jasper.collect;

import com.jasper.domains.Student;

import java.util.ArrayList;
import java.util.List;

public class CountDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞", "175"));
        students.add(new Student("红发", "180"));
        students.add(new Student("白胡子", "185"));
        long count = students.stream().filter(student -> Integer.parseInt(student.getAge()) > 180).count();
        System.out.println("count = " + count);
    }
}
