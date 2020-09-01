package com.corejava.logicprograms.java8_logicalprograms;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumCheck {

    public static void main(String[] args) {
        //creating a list
        List<Integer> myList = Arrays.asList(1, 3, 4, 6, 9, 11, 13, 15, 19, 21, 24, 17, 31, 34, 37);
        //saving the even numbers in the new list
        List<Integer> evenList =
                myList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        MyLogger.consoleLogger.info("Even numbers from the list: " + evenList);


        //saving the odd numbers in the new list
        List<Integer> oddList =
                myList.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        MyLogger.consoleLogger.info("Even numbers from the list: " + oddList);

    }
}