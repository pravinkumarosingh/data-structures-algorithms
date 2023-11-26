package com.stack;

public class Example4 {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(3);

        arrayStack.push(5);
        arrayStack.push(6);
        arrayStack.push(7);

        System.out.println(arrayStack.peek());

        arrayStack.pop();

        System.out.println(arrayStack.peek());
    }
}
