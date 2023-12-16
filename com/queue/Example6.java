package com.queue;

import com.queue.library.PriorityQueue;

public class Example6 {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(3);

        System.out.println(priorityQueue.size());

        System.out.println(priorityQueue.isEmpty());

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove());
        }
    //    System.out.println(priorityQueue.remove());
    }
}
