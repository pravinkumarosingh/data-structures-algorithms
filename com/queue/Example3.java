package com.queue;

import com.queue.library.QueueReverser;

import java.util.ArrayDeque;
import java.util.Queue;

public class Example3 {
    public static void main(String[] args) {
        QueueReverser queueReverser = new QueueReverser();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println(queue);
        System.out.println(queueReverser.reverse(queue,0));

    }
}
