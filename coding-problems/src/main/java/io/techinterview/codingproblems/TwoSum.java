package io.techinterview.codingproblems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] items = {-1, -2, 0, 1, 1};
        int sum = -3;

        int[] result = twoSum(items, sum);
        System.out.println(result == null || result.length == 0 ? "Does not exist!" : result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] items, int sum) {
        if(items == null || items.length == 0) {
            return null;
        }

        Map<Integer, Integer> numberVisited = new HashMap<>();

        for(int i = 0; i < items.length; i++) {
            int numberToLookFor = sum - items[i];

            if(numberVisited.containsKey(numberToLookFor)) {
                return new int[] {numberVisited.get(numberToLookFor), i};
            }
            numberVisited.put(items[i], i);
        }
        return new int[] {-1, -1};
    }
}
