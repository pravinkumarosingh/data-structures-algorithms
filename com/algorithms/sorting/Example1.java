package com.algorithms.sorting;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] arr = {8,2,4,1,3};
        BubbleSort bubbleSort = new BubbleSort();

        System.out.println(Arrays.toString(bubbleSort.sort()));
    }
}
