package com.corejava.logicprograms.java8_logicalprograms;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AscDescListDemo {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(15,4,13,6,19,25,25,39,2,11);

        //printing the list in ascending order
        List<Integer> listInAscOrder = numberList.stream().sorted().collect(Collectors.toList());
        MyLogger.consoleLogger.info("List in Ascending order: "+ listInAscOrder);


        //printing the list in descending order
        List<Integer> listInDescOrder = numberList.stream()
                .sorted((n1,n2)->(n1<n2)?1:(n1>n2)?-1:0).collect(Collectors.toList());
        MyLogger.consoleLogger.info("List in Descending order: "+ listInDescOrder);


    }
}
