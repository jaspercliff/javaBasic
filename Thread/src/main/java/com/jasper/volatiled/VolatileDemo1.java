package com.jasper.volatiled;

/**
 * 种代码在某个环境下可能“看起来”工作正常，但在另一个环境或者在未来的JVM版本中就可能失败
 */
public class VolatileDemo1 {
    private static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            int i = 0;
            while (flag) {
                // 循环体故意留空或执行非内存同步操作
                i++;
            }
            System.out.println("Thread stops with i=" + i);
        }).start();

        Thread.sleep(1000); // 确保线程启动并运行
        System.out.println("main thread changes flag to false");
        flag = false;
    }
}
