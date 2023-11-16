package com.linkedlist;

import java.util.NoSuchElementException;

public class Example2 {
    private Node first;
    private Node last;
    private int size;

    private class Node{
        private Node next;
        private int value;

        Node(int value){
            this.value = value;
        }
    }

    public void addLast(int item){
        Node node = new Node(item);
        if(isEmpty()){
            first = last = node;
        }else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item){
        Node node = new Node(item);
        if(isEmpty()){
            first = last = null;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item){
        int index = 0;
        Node current =first;
        while(current!=null){
            if(current.value == item){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        Node current = first;
        while(current!=null){
            if(current.value==item){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        if(first == last){
            first = last = null;
        } else {
            Node second = first.next;
            first.next = null;
            first = second;
        }
        --size;
    }
    
    public void removeLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        if (first == last){
            first = last = null;
        } else {
            Node previous = getPrevious(last);
            last = previous;
            last.next = null;

        }


         --size;
    }

    private Node getPrevious(Node node) {
        Node current = first;
        while(current!=null){
            if(current.next==node){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public int size(){
        return size;
    }

    private boolean isEmpty() {
        return first == null;
    }
}
