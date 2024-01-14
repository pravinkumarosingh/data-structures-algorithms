package com.tree;

import com.tree.library.Tree;

public class Example1 {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        System.out.println("Done inserting");
        System.out.println(tree.find(4));
    }
}
