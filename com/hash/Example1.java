package com.hash;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1,"Pravin");
        map.put(2,"Ranga");
        map.put(3,"Mosh");
        map.put(4,"Andrei");

        System.out.println(map);

        System.out.println(map.get(3));

        map.remove(4);
        System.out.println(map);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Pravin"));

        for(Integer item : map.keySet()){
            System.out.println(item);
        }

        for(Map.Entry<Integer, String> item : map.entrySet()){
            System.out.println(item);
        }

    }
}
