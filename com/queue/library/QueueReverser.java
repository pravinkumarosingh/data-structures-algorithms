package com.queue.library;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    private Queue<Integer> queue;

    public QueueReverser(){
        queue = new ArrayDeque<>();
    }

    public Queue<Integer> reverse(Queue<Integer> queue, int k){
        if(k>queue.size()){
            throw new IllegalArgumentException();
        } else if (queue.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            Stack<Integer> stack = new Stack<>();
            Queue<Integer> tempQueue = new ArrayDeque<>();
            while(k!=0){
                stack.push(queue.remove());
                --k;
            }

            while(!queue.isEmpty()){
                tempQueue.add(queue.remove());
            }

            while(!stack.isEmpty()){
                queue.add(stack.pop());
            }

            while (!tempQueue.isEmpty()){
                queue.add(tempQueue.remove());
            }
        }



        return queue;
    }
}
