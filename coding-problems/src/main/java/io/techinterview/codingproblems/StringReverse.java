package io.techinterview.codingproblems;

public class StringReverse {

    public static void main(String[] args) {
        String originalString = "Hello";

        System.out.println(approach1(originalString));
        System.out.println(approach2(originalString));
        System.out.println(approach3(originalString));
    }

    // Using Java provided API
    public static String approach1(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // write your own logic
    public static String approach2(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // write your own logic but poor
    public static String approach3(String str) {
        // String in Java is immutable
        String newString = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            newString += str.charAt(i);
        }
        return newString;
    }

}
