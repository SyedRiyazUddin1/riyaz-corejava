package com.corejava.logicprograms.java8_logicalprograms;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a Java 8 program to square the list of numbers
 * and then filter out the numbers greater than 100
 * and then find the average of the remaining numbers?
 */

public class Assignment4 {

    public static void main(String[] args) {


        List<Integer> numberList = Arrays.asList(2, 4, 6, 8, 10, 15, 20, 40, 60, 90);

        Double newList = numberList.stream()
                .map(num -> num * num) //Squaring the numbers in the list
                .filter(num -> num < 100) //filtering the numbers less than 100
                .collect(Collectors.averagingDouble(num -> new Double(num))); //calculating the average of the list

        MyLogger.consoleLogger.info("Average of the list: "+newList);
    }

}
