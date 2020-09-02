package com.corejava.logicprograms.java8_logicalprograms;

import com.corejava.util.MyLogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given a list contains a number as string.Find the numbers which are divisible by 3.
 * List<String> numberList={"3","4","21,"18","24","19","30","42"}
 */

public class Assignment1 {

    public static void main(String[] args) {

        //Given list
        List<String> strList = Arrays.asList("3", "4", "21", "18", "24", "19", "30", "42");

        //converting list of string to list of integers
        List<Integer> numList = strList.stream()
                //converting String elements to Integer elements in the list
                .map(s -> Integer.parseInt(s))
                //filtering the numbers which are divisible by 3
                .filter(num -> num % 3 == 0)
                .collect(Collectors.toList());
        MyLogger.consoleLogger.info("numbers in the list which are divisible by 3: "+numList);

        /**
         * ASSIGNMENT-2:
         *
         * 2.Given a list contains a number as string.Find the numbers even numbers and which are less than 20
         * List<String> numberList={"3","4","21,"18","24","19","30","42"}
         */


        List<Integer> numList1 = strList.stream()
                .map(num->Integer.parseInt(num))
                .filter(num->num<20)
                .filter(num->num%2==0)
                .collect(Collectors.toList());
        MyLogger.consoleLogger.info("numbers in the list which are even and are less than 20: "+numList1);


    }
}
