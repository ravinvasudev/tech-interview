package io.techinterview.ds;

import java.util.*;
import java.util.stream.*;

public class LinkedListDiscussion {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // Insert item
        list.add(1); // O(1)
        list.add(2); // O(1)
        list.add(3); // O(1)
        list.add(4); // O(1)
        list.add(5); // O(1)

        printArrayList(list);

        // Insert item at
        list.add(1, 3); // O(Log N)
        printArrayList(list);

        // Retrieve value at given index.
        // Iterate through list starting from head or tail. Starting point depends on the index proportionate to list mid.
        // Start from head if index is between 0 & mid OR from tail if index is between mid & N
        // Either way, it has to iterate half of the list
        int firstIndexValue = list.get(1); // O(Log N)

        // Delete value at given index
        int removeItemAtIndexTwo = list.remove(2); // O(Log N)

        // Delete value. Iterate list to search the value and then update pointers
        boolean removeItemTwo = list.remove(new Integer(2)); // O(N)

        // Search value. Iterate over list items to match a given item
        boolean contains = list.contains(2); // O(N)

    }

    private static void printArrayList(LinkedList list) {
        System.out.println("----------------");
        IntStream.range(0, list.size())
                .mapToObj(index -> String.format("%d -> %d", index, list.get(index)))
                .forEach(System.out::println);
    }
}
