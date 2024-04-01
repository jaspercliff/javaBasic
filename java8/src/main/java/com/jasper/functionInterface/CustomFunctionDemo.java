package com.jasper.functionInterface;

import com.jasper.custom.Worker;

public class CustomFunctionDemo {
    public static void main(String[] args) {
        Worker worker = String::toUpperCase;
        System.out.println(worker.work("hello world"));
    }
}
