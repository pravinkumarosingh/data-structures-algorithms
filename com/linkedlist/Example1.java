package com.linkedlist;

import java.util.LinkedList;

public class Example1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.indexOf(10));
        System.out.println(list.size());
    }
}
