package com.arrays;

public class Example2Main {
    public static void main(String[] args) {
        Example2 arrays = new Example2(3);

        arrays.insert(10);
        arrays.insert(20);
        arrays.insert(30);
        arrays.insert(40);

        arrays.print();

        System.out.println("Maximum of the array is "+arrays.max());

        Example2.reverse();

        Example2.insertAt(2, 30);

        Example2.print();
    }
}
