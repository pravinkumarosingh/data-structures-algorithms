package com.arrays;

public class Example2 {

    private static int[] items;
    private static int count;

    public Example2(int length){
        items = new int[length];
    }

    public static void insert(int item){
        if(items.length == count){
            int[] newItems = new int[count * 2];

            for(int i=0;i<items.length;i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }

        items[count++] = item;
    }

    public static void print(){
        for(int i=0 ; i < items.length ; i++){
            System.out.println(items[i]);
        }
    }

    public static int max(){
        int max = items[0];

        for (int i=0;i< items.length;i++){
            if(max < items[i]) {
                max = items[i];
            }
        }

        return max;
    }

    public static int[] intersect(int[] array1, int[] array2){
        int[] commonItems;

        commonItems = new int[array1.length+ array2.length];

        return commonItems;
    }

    public static void reverse(){
        int[] temp = new int[items.length];

        int counter = items.length-1;

        for(int i=0;i< items.length;i++){
            temp[i] = items[counter--];
        }

        items = temp;
        print();
    }

    public static void insertAt(int index, int number){
        int[] temp = new int[items.length+1];

        for(int i=0;i<temp.length;i++){
            temp[i]=items[i];
            if(index==i){
                temp[i] = number;
                i++;
            }

        }
        items=temp;
    }

}
