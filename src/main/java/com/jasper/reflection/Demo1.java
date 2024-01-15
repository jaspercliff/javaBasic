package com.jasper.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.jasper.reflection.Person");
        Constructor<?> constructor = clazz.getConstructor();
        Object o = constructor.newInstance();
        Method setName = clazz.getMethod("setName", String.class);
        setName.invoke(o,"jasper");
        Method getName = clazz.getMethod("getName");
        System.out.println(getName.invoke(o));
    }
}
