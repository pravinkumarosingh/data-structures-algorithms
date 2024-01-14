package com.tree.library;

public class Tree {
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value){
            this.value = value;
        }

        @Override
        public String toString(){
            return "Value=" + value;
        }
    }

    private Node root;

    public void insert(int value){
        Node node = new Node(value);

        if(root==null){
            root = new Node(value);
            return;
        }

        Node current = root;
        while(true){
            if(value < current.value){
                if(current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if(current.rightChild == null){
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }

    }

    public boolean find(int value){
        Node current = root;
        while(current != null){
            if(value < current.value){
                current = current.leftChild;
            } else if (value > current.value){
                current = current.rightChild;
            } else {
                return true;
            }
        }
        return false;
    }
}
