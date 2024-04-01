package com.jasper.cas;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class CourseRegistration {
    private final AtomicIntegerArray courseRegistrations;

    public CourseRegistration(int numberOfCourses) {
        // 有5个课程 然后初始化每个课程的注册人数为0
        this.courseRegistrations = new AtomicIntegerArray(numberOfCourses);
    }

    /**
     * 注册课程
     * @param courseId 课程ID（数组索引）
     */
    public void register(int courseId) {
        // 原子地将选定课程的注册人数加1
        courseRegistrations.incrementAndGet(courseId);
    }

    /**
     * 获取课程的注册人数
     * @param courseId 课程ID（数组索引）
     * @return 该课程的注册人数
     */
    public int getRegistrations(int courseId) {
        return courseRegistrations.get(courseId);
    }

    public static void main(String[] args) throws InterruptedException {
        CourseRegistration registration = new CourseRegistration(5); // 假设有5门课程

        // 模拟多线程环境下的课程注册
        for (int i = 0; i < 10; i++) {
            int courseId = i % 5; // 为了示例简单，这里简单使用模运算模拟课程ID
            new Thread(() -> {
                registration.register(courseId);
                System.out.println("Course " + courseId + " registrations: " + registration.getRegistrations(courseId));
            }).start();
        }
        Thread.sleep(1000);
        System.out.println("registration.courseRegistrations = " + registration.courseRegistrations);
    }
}

