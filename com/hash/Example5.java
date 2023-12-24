package com.hash;

import java.util.HashMap;
import java.util.Map;

public class Example5 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(123456,"Mosh");
        System.out.println(hash(123456));
    }

    public static int hash(int number){
        return number % 100;
    }
}
