package com.jasper;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> programmingLanguages = Arrays.asList("Java", "Python", "C++", "JavaScript", "Kotlin");
        Iterator<String> iterator = programmingLanguages.iterator();

        // 假设我们已经遍历了前两个元素
        if (iterator.hasNext()) iterator.next(); // 遍历"Java"
        if (iterator.hasNext()) {
            iterator.next(); // 遍历"Python"

        }

        // 现在，我们想对剩余的元素执行操作
        Consumer<String> action = System.out::println; // 定义一个简单的打印操作

        // 使用forEachRemaining应用这个操作
        iterator.forEachRemaining(action);
    }
}
