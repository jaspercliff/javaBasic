package com.jasper.collect;

import com.jasper.domains.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("cliff", "17","smoke"));
        students.add(new Student("红发", "18","smoke"));
        students.add(new Student("白胡子", "19","drink"));
        students.add(new Student("jasper", "30","gamble"));
        String names = students.stream().map(student -> student.getName()+"-"+student.getHobby()).collect(Collectors.joining(",", "[", "]"));
        System.out.println("names = " + names);
    }
}
