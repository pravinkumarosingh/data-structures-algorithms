package com.hash;

import java.util.HashSet;
import java.util.Set;

public class Example3 {
    public static void main(String[] args) {
        Set<Integer> sets = new HashSet<>();
        int[] numbers = {1,2,3,3,4,2,};

        for (Integer number : numbers){
            sets.add(number);
        }

        System.out.println(sets);
    }
}
