package com.tree;

import com.tree.library.Tree;

import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(7);
        tree.insert(4);
        tree.insert(9);

        System.out.println(Arrays.toString(tree.nodesAtKDistance(0)));
    }
}
