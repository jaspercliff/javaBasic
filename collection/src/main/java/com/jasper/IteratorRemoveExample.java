package com.jasper;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IteratorRemoveExample {
    public static void main(String[] args) {
//        List<String> programmingLanguages = new ArrayList<>(Arrays.asList("Java", "Python", "C++", "JavaScript", "Kotlin"));
//        Iterator<String> iterator = programmingLanguages.iterator();
//
//        // 自定义操作，打印并在满足条件时移除元素
//        Consumer<String> action = element -> {
//            System.out.println("Processing: " + element);
//            if (element.contains("o")) {
//                iterator.remove(); // 注意：此操作必须紧跟在next()调用之后 设计来删除由next()方法最后一次返回的元素
//            }
//        };
//
//        // 遍历并尝试移除元素
//        while (iterator.hasNext()) {
//            String current = iterator.next(); // 获取当前元素
//            action.accept(current); // 执行自定义操作
//        }
//
//        // 打印最终的列表
//        System.out.println("Filtered List: " + programmingLanguages);

        List<String> list = new ArrayList<>(Arrays.asList("Java", "C++", "Python"));
//        for (String s : list) {
//            if (s.equals("Java")) {
//                list.remove(s); // 这会抛出ConcurrentModificationException
//            }
//        }

        // 假设list是一个共享的集合
        Thread t1 = new Thread(() -> {
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
                try {
                    Thread.sleep(100); // 模拟长时间操作
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            list.add("Ruby"); // 修改集合
        });

        t1.start();
        t2.start();

    }
}

