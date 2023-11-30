package com.queue.library;



public class ArrayQueue {
    private static int[] queue;

    private static int count = 0;

    private static int defaultCapacity = 5;

    public ArrayQueue(){
        queue = new int[defaultCapacity];
    }

    public ArrayQueue(int capacity){
        queue = new int[capacity];
    }

    public void enqueue(int item){
        //int[] temp = new int[queue.length];

        queue[count++] = item;

    }

    public void dequeue(){
        int[] temp = new int[queue.length - 1];

        for (int i=1;i<queue.length - 1;i++){
            temp[count++] = queue[i];
        }

        queue = temp;
    }

    public int peek(){
        return queue[queue.length-1];
    }

    public int poll(){
        return queue[0];
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
