package com.jasper.collect;

import com.jasper.domains.Student;

import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        Student jasper = new Student().setAge("18").setName("jasper");
        Student cliff = new Student().setAge("19").setName("cliff");
//            <R> Stream<R> map(Function<? super T, ? extends R> mapper);
        Stream.of(jasper, cliff).map(student -> student.setName(student.getName().toUpperCase()))
                .forEach(System.out::println);
    }
}
