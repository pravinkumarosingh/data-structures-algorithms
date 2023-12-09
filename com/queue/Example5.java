package com.queue;

import java.util.PriorityQueue;

public class Example5 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);

        System.out.println(priorityQueue.size());

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove());
        }
    }
}
