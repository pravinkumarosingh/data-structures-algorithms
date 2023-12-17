package com.hash.library;

import java.util.HashMap;
import java.util.Map;


public class CharFinder {


    public char findFirstNonRepeatingCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();

        char[] chars = str.toCharArray();

        int count = 0;

        for (char ch : chars) {
            if(map.containsKey(ch)){
                count = map.get(ch);
                map.put(ch,++count);
            } else {
                map.put(ch,1);
            }
        }

        for (char ch : chars){
            if(map.get(ch) == 1){
                return ch;
            }
        }

        return Character.MIN_VALUE;

    }

    public char firstRepeatedCharacter(String string){
        Map<Character, Integer> map = new HashMap<>();

        char[] chars = string.toCharArray();

        int count = 0;

        for (char ch : chars) {
            if(map.containsKey(ch)){
                count = map.get(ch);
                map.put(ch,++count);
            } else {
                map.put(ch,1);
            }
        }

        for (char ch : chars){
            if(map.get(ch) > 1){
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }
}
