package io.techinterview.codingproblems;

import java.util.*;
import java.util.logging.*;

/**
 * Given an string expression, write a program to examine whether the pairs and the orders of parentheses are correct.
 * {} () [] - Yes
 * { ( [] ) } - Yes
 * { () [] } - Yes
 * { ( [] } ) - No
 */
public class MatchingParentheses {

    private final static Map<Character, Character> parenthesesGroup = new HashMap<>();

    static {
        parenthesesGroup.put('(', ')');
        parenthesesGroup.put('[', ']');
        parenthesesGroup.put('{', '}');
    }

    public static void main(String[] args) {
        String a = "{[()]}";
        Optional<Boolean> result = checkPairAndOrder(a);
        Logger.getAnonymousLogger().info("Parentheses Match: " + result.orElse(Boolean.FALSE).toString());
    }

    private static Optional<Boolean> checkPairAndOrder(String a) {
        if (a == null) {
            return Optional.of(false);
        }

        final int length = a.length();
        if (length % 2 != 0) {
            return Optional.of(false);
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            if (a.charAt(i) == '{' || a.charAt(i) == '[' || a.charAt(i) == '(') {
                stack.push(a.charAt(i));
            } else if (stack.isEmpty() || parenthesesGroup.get(stack.pop()) != a.charAt(i)) {
                return Optional.of(false);
            }
        }
        return stack.isEmpty() ? Optional.of(true) : Optional.of(false);
    }
}