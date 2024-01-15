package com.jasper.reflection;

public class Person {
    private String name;
    private String age;

    public Person() {
    }

     private Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void print(){
        System.out.println("print method");
    }

    private void print(String name){
        System.out.println(name);
    }
}
