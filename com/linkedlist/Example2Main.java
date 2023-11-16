package com.linkedlist;

import java.util.Arrays;

public class Example2Main {
    public static void main(String[] args) {
        Example2 list = new Example2();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        int array[] = list.toArray();
        System.out.println(Arrays.toString(array));

        list.removeFirst();
        list.removeLast();

        System.out.println(list.indexOf(40));
        System.out.println(list.contains(40));
        System.out.println(list.size());

    }
}
