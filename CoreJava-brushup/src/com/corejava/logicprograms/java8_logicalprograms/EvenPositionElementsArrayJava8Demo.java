package com.corejava.logicprograms.java8_logicalprograms;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Program to print the even indexed elements from an array
 */

public class EvenPositionElementsArrayJava8Demo {


    public static void main(String[] args) {

        //Given array
        String myArray[] = {"Syed", "Riyaz", "Zeeshan", "Avinash", "Rohit", "Junaid", "Azeem"};

        //converting an array to a list
        List<String> myList = Arrays.asList(myArray);

        //initializing an array
        int[] n = {0};

        List<String> evenPositionList = myList.stream()
                .filter(element -> n[0]++ % 2 != 0) //filtering elements which are on even indexed position
                .collect(Collectors.toList());

        MyLogger.consoleLogger.info("Elements on even index: "+evenPositionList);

    }
}
