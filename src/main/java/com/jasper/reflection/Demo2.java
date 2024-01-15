package com.jasper.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo2 {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("com.jasper.reflection.Person");
//        Class<Person> clazz1 = Person.class;
//        Person person = new Person();
//        Class<? extends Person> clazz2 = person.getClass();
//        System.out.println(clazz == clazz1);
//        System.out.println(clazz1 == clazz2);
//
        Object o = clazz.newInstance();
//        Object o1 = clazz.getConstructor().newInstance();
//        System.out.println(o);
//        System.out.println(o1);

//        Constructor<?> constructor = clazz.getConstructor(String.class, String.class);
//        System.out.println(constructor);
//        no param 无参constructor
        System.out.println(clazz.getConstructor());

//        include private and protected method
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
        System.out.println("declaredConstructor = " + declaredConstructor);
        Constructor<?> declaredConstructor1 = clazz.getDeclaredConstructor(String.class, String.class);
        System.out.println("declaredConstructor1 = " + declaredConstructor1);
//        get all public constructor
        Constructor<?>[] constructors = clazz.getConstructors();
        System.out.println("constructors = " + constructors);
//        get all constructor include private
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println("declaredConstructors = " + declaredConstructors);


        Method print = clazz.getMethod("print");
        System.out.println("print = " + print);
        Method print1 = clazz.getDeclaredMethod("print", String.class);
        System.out.println("print1 = " + print1);
        print1.setAccessible(true);
        print1.invoke(o,"jasper");
    }
}
