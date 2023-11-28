package com.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Example1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue);

        Integer front = queue.remove();
        System.out.println(front);
    }
}
