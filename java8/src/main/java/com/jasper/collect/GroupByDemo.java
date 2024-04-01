package com.jasper.collect;

import com.jasper.domains.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞", "17","smoke"));
        students.add(new Student("红发", "18","smoke"));
        students.add(new Student("白胡子", "19","drink"));
        students.add(new Student("jasper", "30","gamble"));

        Map<String, List<Student>> collect = students.stream().collect(Collectors.groupingBy(Student::getHobby));
        System.out.println("collect = " + collect);
    }
}
