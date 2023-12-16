/**
 * find the first non-repeating character in a given string.
 */

package com.hash;

import com.hash.library.CharFinder;

public class Example2 {
    public static void main(String[] args) {
        String string = "A Green Apple";
        CharFinder charFinder = new CharFinder();
        System.out.println(charFinder.findFirstNonRepeatingCharacter(string));
    }
}
