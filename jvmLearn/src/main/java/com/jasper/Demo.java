package com.jasper;

public class Demo {
    private int m;
    private int[] num;
    private Test test;

    public Demo(int m, int[] num, Test test) {
        this.m = m;
        this.num = num;
        this.test = test;
    }

    public Demo() {
    }

    public int inc(){
        return m+1;
    }
}
