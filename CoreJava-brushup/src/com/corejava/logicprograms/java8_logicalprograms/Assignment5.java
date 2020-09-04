package com.corejava.logicprograms.java8_logicalprograms;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Write a Java 8 program to find the lowest and highest number of a Stream?
 */

public class Assignment5 {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(20, 15, 40, 2, 4, 6, 60, 90, 8, 10);


        Optional<Integer> newList = numberList.stream()
                .sorted() //sorting based on natural order
                .findFirst();//getting the first element
        MyLogger.consoleLogger.info("Lowest number in the list: " + newList);

        Optional<Integer> newList1 = numberList.stream()
                .sorted((num1, num2) -> (num1 < num2) ? 1 : (num1 > num2) ? -1 : 0) //sorting in descending order
                .findFirst(); //getting the first element
        MyLogger.consoleLogger.info("Highest number in the list: " + newList1);

    }
}
