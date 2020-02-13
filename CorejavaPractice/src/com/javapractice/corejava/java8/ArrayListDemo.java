package com.javapractice.corejava.java8;

import com.javapractice.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> newList1 =numbers.stream()
                .sorted((num1,num2)->-num1.compareTo(num2)).collect(Collectors.toList());

       MyLogger.consoleLogger.info("Ascending order" +newList1);

        List<Integer> newList2 =numbers.stream()
                .sorted((num1,num2)->-num2.compareTo(num1)).collect(Collectors.toList());

        MyLogger.consoleLogger.info("Descending order" + newList2);
    }
}
