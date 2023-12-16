package com.queue.library;

public class PriorityQueue {
    private static int[] queue;

    private static int count = 0;

    private static int DEFAULT_CAPACITY = 5;

    public PriorityQueue(){
        queue = new int[DEFAULT_CAPACITY];
    }

    public PriorityQueue(int capacity){
        queue = new int[capacity];
    }

    public void add(int element){
        if(count == queue.length)
            throw new IllegalStateException("Queue is Full");

        int i;
        for(i=count-1;i>=0;i--){
            if(queue[i]>element){
                queue[i+1] = queue[i];
            } else {
                break;
            }
        }
        queue[i+1] = element;
        count++;
    }

    public int remove(){
        if(count == 0) throw new IllegalStateException("Queue is Empty");

        int[] temp = new int[queue.length - 1];

        int first  = queue[0];

        for (int i=0;i<temp.length;i++){
            temp[i] = queue[i+1];
        }
        queue = temp;

        --count;

        return first;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        if(queue.length==0){
            return false;
        }
        return count == 0;
    }
}
