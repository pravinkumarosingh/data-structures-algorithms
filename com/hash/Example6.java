package com.hash;

import com.hash.library.HashTable;

import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) {
        HashTable<Integer,String> hashTable = new HashTable();

        hashTable.put(1,"orange");
        hashTable.put(2, "mango");

        System.out.println("Done");

        System.out.println(hashTable.get(1));
        System.out.println(hashTable.get(3));
    }
}
