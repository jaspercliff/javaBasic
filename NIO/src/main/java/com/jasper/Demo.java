package com.jasper;

import java.nio.CharBuffer;

public class Demo {
    public static void main(String[] args) {
        CharBuffer buffer = CharBuffer.allocate(8);
        System.out.println("initial:");
        printState(buffer);

        buffer.put('a').put('b').put('c');
        System.out.println("after_writing_three_characters");
        printState(buffer);
//The limit is set to the current position and then
//     * the position is set to zero.  If the mark is defined then it is
//     * discarded.
        buffer.flip();
        System.out.println("the state after calling flip");
        printState(buffer);
//        read characters
        while (buffer.hasRemaining()){
            System.out.println("characters read:"+buffer.get());
        }
//        The position is set to zero, the limit is set to
//     * the capacity, and the mark is discarded
        buffer.clear();
        System.out.println("the state after calling clear");
        printState(buffer);
    }

    // 打印buffer的capacity、limit、position、mark的位置
    private static void printState(CharBuffer buffer) {
        System.out.print("capacity: " + buffer.capacity());
        System.out.print(", limit: " + buffer.limit());
        System.out.print(", position: " + buffer.position());
        System.out.print(", mark 开始读取的字符: " + buffer.mark());
        System.out.println("\n");
    }
}
