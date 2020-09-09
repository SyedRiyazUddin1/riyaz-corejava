package com.corejava.logicprograms.java8_logicalprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Program of printing the duplicates from an array of Integers
 */

public class DuplicatesPrintingFromListDemo {

    public static void main(String[] args) {

        Integer[] numbers = new Integer[]{1, 2, 1, 3, 4, 4};
        Set<Integer> allItems = new HashSet<>();

        // Set.add() returns false if the item was already in the set

        Set<Integer> duplicates =
                Arrays.stream(numbers)
                        .filter(element -> !allItems.add(element))
                        .collect(Collectors.toSet());
        System.out.println("Duplicates in a given arayy are: " + duplicates); // [1, 4]

    }
}
