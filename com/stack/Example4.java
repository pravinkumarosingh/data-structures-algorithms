package com.stack;

import com.stack.library.ArrayStack;

public class Example4 {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();

        arrayStack.push(5);
        arrayStack.push(6);
        arrayStack.push(7);

        System.out.println(arrayStack.peek());

        arrayStack.pop();

        System.out.println(arrayStack.peek());

        System.out.println(arrayStack.isEmpty());
    }
}
