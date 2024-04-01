package com.jasper.functionInterface;

import com.jasper.domains.Student;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Student s = new Student().setName("jasper").setAge("18");
        Function<Student,String> function = Student::getName;
        System.out.println("function.apply(s) = " + function.apply(s));

    }
}
