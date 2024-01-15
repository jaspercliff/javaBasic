package com.jasper.reflection;

import java.lang.reflect.Method;

public class Demo3 {
    public static void main(String[] args) throws Exception  {
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        Method print = clazz.getDeclaredMethod("print", String.class);
        print.setAccessible(true);
        print.invoke(person,"jasper");

        Class<?> clazz1 = ClassLoader.getSystemClassLoader().loadClass("com.jasper.reflection.Person");
        System.out.println(clazz1 == clazz);
    }
}
