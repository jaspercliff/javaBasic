package com.jasper.functionInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b) ->a*b;
        System.out.println(binaryOperator.apply(2, 3));
    }
}
