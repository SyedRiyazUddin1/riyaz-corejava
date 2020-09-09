package com.corejava.logicprograms.java8_logicalprograms;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfNumsOfArray {

    public static void main(String[] args) {

        int[] myArray = {2,4,6,9,8};

        int sumOfArrayElements = Arrays.stream(myArray).sum();

        MyLogger.consoleLogger.info("sum of ArrayElements: "+sumOfArrayElements);
    }
}
