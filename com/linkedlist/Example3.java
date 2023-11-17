/**
 * find the kth node from the end in one pass
 */
package com.linkedlist;

public class Example3 {
    public static void main(String[] args) {
        Example2 list = new Example2();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println(list.getKthNodeFromTheEnd(-1));
    }
}
