package io.techinterview.codingproblems;

import java.util.*;

/*
    Implement an algorithm to determine if a string has all unique characters.

    What if you cannot use additional data structures?
 */
public class UniqueCharactersString {

    public static void main(String[] args) {

        System.out.println("REPEAT has unique characters: " + hasUniqueCharacters("REPEAT"));
        System.out.println("REPEAT has unique characters: " + hasUniqueCharacters2("REPEAT"));

        System.out.println("RAVIN has unique characters: " + hasUniqueCharacters("RAVIN"));
        System.out.println("RAVIN has unique characters: " + hasUniqueCharacters2("RAVIN"));
    }

    // O(N)
    private static boolean hasUniqueCharacters(String str) {
        if(str == null || str.isEmpty()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            if (map.containsValue(ch)) {
                return false;
            }
            map.put(ch, ch);
        }
        return true;
    }

    // O(N)
    private static boolean hasUniqueCharacters2(String str) {
        if(str == null || str.isEmpty()) {
            return false;
        }
        boolean[] chars = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(chars[val]) {
                return false;
            }
            chars[val] = true;
        }
        return true;
    }

    // O(N^2)
    private static boolean hasUniqueCharacters3(String str) {
        int len = str.length();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

}
