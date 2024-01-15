package com.jasper.bigDecimal;

import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(0.1F);
        System.out.println("bigDecimal = " + bigDecimal);
        BigDecimal bigDecimal1 = new BigDecimal("0.1");
        System.out.println("bigDecimal1 = " + bigDecimal1);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(0.1f);
        System.out.println("bigDecimal2 = " + bigDecimal2);
    }
}
