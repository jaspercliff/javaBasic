package com.jasper.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class InventoryControl {
    // 假设初始库存为100
    private AtomicInteger inventory = new AtomicInteger(100);

    /**
     * 减少库存
     * @param quantity 需要减少的数量
     * @return 是否减少成功
     */
    public boolean reduceInventory(int quantity) {
        // 当前库存
        int currentInventory;
        // 减少后的库存
        int newInventory;

        do {
            // 获取当前库存的最新值
            currentInventory = inventory.get();
            // 如果库存不足，减少失败
            if (quantity > currentInventory) {
                System.out.println("库存不足，无法减少");
                return false;
            }
            // 计算减少后的库存
            newInventory = currentInventory - quantity;
            // 使用compareAndSet确保库存减少的原子性
            // 如果在执行compareAndSet时currentInventory不再是inventory的当前值，
            // 意味着有其他线程已经修改了inventory，这时compareAndSet会失败，循环会继续直到成功更新
        } while (!inventory.compareAndSet(currentInventory, newInventory));

        System.out.println("成功减少库存，当前库存: " + newInventory);
        return true;
    }

    public static void main(String[] args) {
        InventoryControl inventoryControl = new InventoryControl();

        // 模拟多线程环境下减少库存
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                inventoryControl.reduceInventory(10);
            }).start();
        }
    }
}
