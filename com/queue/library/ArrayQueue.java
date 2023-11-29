package com.queue.library;



public class ArrayQueue {
    private static int[] queue;

    private static int count = 0;

    public ArrayQueue(int capacity){
        queue = new int[capacity];
    }

    public void enqueue(int item){
        //int[] temp = new int[queue.length];

        queue[count++] = item;

    }

    public int peek(){
        return queue[queue.length-1];
    }

    public boolean isEmpty(){
        if(queue.length==0){
            return false;
        }
        return count == 0;
    }

    public boolean isFull(){
        return count == queue.length;
    }
}
