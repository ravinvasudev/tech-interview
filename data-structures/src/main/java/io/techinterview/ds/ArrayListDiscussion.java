package io.techinterview.ds;

import java.util.*;
import java.util.stream.*;

public class ArrayListDiscussion {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(5);

        // Insert item
        list.add(1); // O(1)
        list.add(2); // O(1)
        list.add(3); // O(1)
        list.add(4); // O(1)
        list.add(5); // O(1)

        printArrayList(list);

        // Insert item at
        list.add(1, 3); // O(N)
        printArrayList(list);

        // Retrieve value at given index. Since it is backed by array and has direct access to array indices
        int firstIndexValue = list.get(1); // O(1)

        // Delete value at given index. Requires to shift items to the left by 1
        int removeItemAtIndexTwo = list.remove(2); // O(N)

        // Delete value. Iterate array to search the value and then shift items to the left by 1
        boolean removeItemTwo = list.remove(new Integer(2)); // O(N)

        // Search Value. Iterate over array items to match a given item
        boolean contains = list.contains(2); // O(N)


    }

    private static void printArrayList(List list) {
        System.out.println("----------------");
        IntStream.range(0, list.size())
                .mapToObj(index -> String.format("%d -> %d", index, list.get(index)))
                .forEach(System.out::println);
    }
}
