package com.jasper.collect;

import com.jasper.domains.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(3);
        students.add(new Student("路飞", "17"));
        students.add(new Student("红发", "18"));
        students.add(new Student("白胡子", "19"));
        Map<Boolean, List<Student>> collect = students.stream().collect(Collectors.partitioningBy(student -> Integer.parseInt(student.getAge()) > 18));
        System.out.println("collect = " + collect);
        List<Student> students1 = collect.get(true);
        System.out.println("students1 = " + students1);
        List<Student> students2 = collect.get(false);
        System.out.println("students2 = " + students2);

    }
}
