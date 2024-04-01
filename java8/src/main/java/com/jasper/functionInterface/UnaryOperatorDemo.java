package com.jasper.functionInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<Boolean> unaryOperator = (Boolean b) -> !b;
        System.out.println(unaryOperator.apply(true));
    }
}
