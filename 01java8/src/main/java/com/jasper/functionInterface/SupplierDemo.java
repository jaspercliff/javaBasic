package com.jasper.functionInterface;

import java.math.BigDecimal;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        /*
         - 运行时需要动态提供值时
         */
        Supplier<Integer> supplier = () -> Integer.valueOf(BigDecimal.TEN.toString());
        System.out.println(supplier.get());
    }
}
