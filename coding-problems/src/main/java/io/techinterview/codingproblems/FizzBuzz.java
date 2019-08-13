package io.techinterview.codingproblems;

public class FizzBuzz {

    public static void main(String[] args) {

        // TODO: For given numbers between 1 to N
        //  print Fizz if number is multiple of 3,
        //  print Buzz if number is multiple of 5 and
        //  print FizzBuzz if number is both multiple of 3 & 5
        //  print number otherwise

        printFizzBuzz(100);
    }

    public static void printFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
