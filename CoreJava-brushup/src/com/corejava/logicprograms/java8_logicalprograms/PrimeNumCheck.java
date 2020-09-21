package com.corejava.logicprograms.java8_logicalprograms;

import com.corejava.util.MyLogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Program to filter the prime numbers from a list.
 */

public class PrimeNumCheck {

    public static void main(String[] args) {
        //creating a list
        List<Integer> myList = Arrays.asList(1, 3, 4, 6, 9, 11, 13, 15, 19, 21, 25, 17, 31, 33, 37);
        //saving the prime numbers in the new list
        List<Integer> newList =
                myList.stream().filter(PrimeNumCheck::isPrime)
                        .collect(Collectors.toList());

        MyLogger.consoleLogger.info("Prime numbers in the list are: " + newList);
    }

    //method which filter the prime numbers.

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }
//***************   Method: 2   ********************
//    public static boolean isPrime(int number) {
//        return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0);
//    }

    //***************   Method: 3   ********************
//    public static boolean isPrime(int i) {
//        IntPredicate isDivisible = index -> i % index == 0;
//        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
//    }

    //***************   Method: 4  ********************
    //  Java 7 impementation
    //        public static boolean isPrime(int number) {
    //            for (int i = 2; i <= number / 2; i++) {
    //                if (number % i == 0) {
    //                    return false;
    //                }
    //            }
    //            return true;
    //        }
}
