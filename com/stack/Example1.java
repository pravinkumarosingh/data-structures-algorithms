package com.stack;

import java.util.Stack;

public class Example1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        int top = stack.pop();
        System.out.println(top);
        System.out.println(stack);

        int top2 = stack.peek();
        System.out.println(top2);
        System.out.println(stack);

        if(!stack.isEmpty()){
            System.out.println("Is stack empty -> no");
        } else {
            System.out.println("Is stack empty -> yes");
        }

        System.out.println("Size of stack -> "+stack.size());
    }
}
