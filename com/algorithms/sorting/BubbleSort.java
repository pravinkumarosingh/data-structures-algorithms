package com.algorithms.sorting;

public class BubbleSort {

    private static int DEFAULT_CAPACITY = 5;

    int[] arr = new int[DEFAULT_CAPACITY];

    public BubbleSort(){
        throw new RuntimeException();
    }
    public BubbleSort(int[] arr){
        this.arr = arr;
    }

    public int[] sort(){
        int temp;

        for(int i = 0 ; i < arr.length - 1  ; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public void swap(int[] arr, int index1, int index2){
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
