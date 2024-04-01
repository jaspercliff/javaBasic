package com.jasper.basic;

/**
 * Hello world!
 *
 */
public class AutoBoxing
{
    public static void main( String[] args )
    {
//        Integer c1 = 33;//装箱
//        int c2 = c1;//拆箱
//        List<Integer> li = new ArrayList<>();
//        for (int i = 1; i < 50; i ++){
//            li.add(i);
//        }
//        Integer a=1;
//        System.out.println(a==1?"等于":"不等于");
//        Boolean bool=false;
//        System.out.println(bool?"真":"假");
//        Integer i = 10;
//        Integer j = 20;
//        System.out.println(i+j);
        boolean flag = true;
        Integer i = null;
        int j = 1;
        int k = flag ? i : j;
        System.out.println(k);
    }
}
