package com.jasper.bigDecimal;

import java.math.BigDecimal;

public class Demo2 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1");
        BigDecimal bigDecimal1 = new BigDecimal("1.0");
        System.out.println(bigDecimal1.equals(bigDecimal));
        System.out.println(bigDecimal1.compareTo(bigDecimal));
    }
}
