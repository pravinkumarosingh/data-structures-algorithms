package com.tree;

import com.tree.library.Tree;

public class Example1 {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(7);
        tree.insert(4);
        tree.insert(21);
        tree.insert(9);

        System.out.println("Done inserting in Tree 1");

//        Tree tree2 = new Tree();
//
//        tree2.insert(7);
//        tree2.insert(4);
//        tree2.insert(9);

        System.out.println("Done inserting in Tree 2");

        System.out.println(tree.find(4));

        System.out.println("Pre Order");
        tree.traversePreOrder();

        System.out.println("In Order");
        tree.traverseInOrder();

        System.out.println("Post Order");
        tree.traversePostOrder();

        System.out.println("Height of the tree -> " + tree.height());
        System.out.println("Minimum value in a tree -> " + tree.min());
        //System.out.println(tree.equals(tree2));

        System.out.println("Is Binary Search Tree -> " + tree.isBinarySearchTree());
    }
}
