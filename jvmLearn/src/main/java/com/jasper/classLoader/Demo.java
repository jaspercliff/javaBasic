package com.jasper.classLoader;

public class Demo {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("systemClassLoader = " + systemClassLoader);
        ClassLoader  extensionClassLoader= systemClassLoader.getParent();
        System.out.println("extensionClassLoader = " + extensionClassLoader);
        ClassLoader bootStrapClassLoader = extensionClassLoader.getParent();
        System.out.println("bootStrapClassLoader = " + bootStrapClassLoader);
    }
}
