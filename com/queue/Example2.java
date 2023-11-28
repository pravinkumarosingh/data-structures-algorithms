package com.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Example2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(reverse(queue));
    }

    public static Queue<Integer> reverse(Queue<Integer> queue){
        if(queue.isEmpty()){
            throw new IllegalStateException();
        }

        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }

        return queue;
    }
}
