package io.techinterview.ds;

import java.util.*;
import java.util.stream.*;

public class ArrayDiscussion {

    private int length = 0;

    public static void main(String[] args) {

        /* Valid but not preferred array declaration
        int arr[];
        */

        /* Valid & recommended array declaration. Brackets should stand with data type, since we are declaring an array
        of data type. In this case it is an int, so preferred way of writing is
        int[] arr;
        */

        // Declare an array variable on stack
        int[] arr;

        // Reserve memory for 5 integer elements on heap and then assign base address ref to array variable on stack
        arr = new int[5];

        // Check array length. It should be the initialized size which is 5 in this case
        System.out.println("Array Length (should print 5): " + arr.length);

        /* There's no element added into array yet. Let's print empty array and see that it print zero 5 times.
        Array elements are initialized with default value of declared array type.
        In our case, it is int array and default value for int is zero (0) */
        printArray(arr);

        // Insert first element
        arr[0] = 5; // O(1) - constant time operation
        // Insert second element and so on, all are in O(1)
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;
        arr[4] = 25;

        // print array at this stage to see the new values
        printArray(arr);

        // Retrieve value at 2nd index
        int secondIndexValue = arr[2]; // O(1) - constant time operation

        // Delete value at 2nd index
        // We can update the value with something irrelevant but there is no way to delete that index from array
        // array does not support this operation
        // Note: Array size does not change after initialization
        arr[2] = 0;

        // Search an item in array
        // O(N) - Linear time operation - has to iterate over all array items
        int itemToSearch = 30;
        boolean itemFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (itemToSearch == arr[i]) {
                itemFound = true;
                System.out.println(itemToSearch + " found at index " + i);
                break;
            }
        }
        if (!itemFound) {
            System.out.println(itemToSearch + " does not exist in array");
        }

    }

    private static void printArray(int[] array) {
        System.out.println("------ PRINTING ARRAY ITEMS ------");
        IntStream.range(0, array.length)
                .mapToObj(index -> String.format("Index[%d] -> %d", index, array[index]))
                .forEach(System.out::println);
    }
}
