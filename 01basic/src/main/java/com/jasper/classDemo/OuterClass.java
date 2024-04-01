package com.jasper.classDemo;

public class OuterClass {
    private int value = 10;
    public class InnerClass {
        public void printValue() {
            System.out.println("Value: " + value);
        }
    }

    public static void main(String[] args) {
        new OuterClass().new InnerClass().printValue();
    }
}
