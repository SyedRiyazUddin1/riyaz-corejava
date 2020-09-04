package com.corejava.logicprograms.java8_logicalprograms;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Write a Java 8 program to sort an array
 * and then convert the sorted array into Stream?
 */

public class Assignment6 {

    public static void main(String[] args) {

        int myArray[] = {45, 35, 95, 65, 15, 25, 5, 85};
        Arrays.sort(myArray); //sorting an array based on natural ordering
        for (int i : myArray) {
            MyLogger.consoleLogger.info(i);
        }

        //Arrays.stream
        IntStream stream1 = Arrays.stream(myArray);
        //stream1.forEach(num -> System.out.println(num));

        OptionalInt firstElement = stream1.filter(num -> num < 5).findFirst();
        MyLogger.consoleLogger.info(firstElement);
        //returns OptionalInt.empty cause there is no element less than 5


    }
}
