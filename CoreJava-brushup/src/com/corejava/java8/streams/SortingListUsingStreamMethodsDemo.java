package com.corejava.java8.streams;

import com.corejava.util.MyLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingListUsingStreamMethodsDemo {

    public static void main(String[] args) {

        List<String> newList = new ArrayList<String>();
        newList.add("Syed Riyaz Uddin");
        newList.add("Avinash Edamadakala");
        newList.add("Rohit Mudunuri");
        newList.add("Junaid Khan");

        //sorting based on length of the strings from Ascending to descending
        List<String> list1 = newList.stream()
                .sorted((s1, s2) -> s1.length() < s2.length() ? -1 : s1.length() > s2.length() ? 1 : 0)
                .collect(Collectors.toList());
        //list1.forEach(list->MyLogger.consoleLogger.info(list));
        //can iterate same as above using method reference
        list1.forEach(MyLogger.consoleLogger::info);

        //sorting in descending order based on alphabetical order
        List<String> list2 = newList.stream()
                .sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
        MyLogger.consoleLogger.info(list2);



        List<Integer> newList1 = new ArrayList<Integer>();
        newList1.add(10);
        newList1.add(2);
        newList1.add(15);
        newList1.add(6);
        MyLogger.consoleLogger.info("List of numbers "+newList1);

        //print the minimum element from the list
        int num1 = newList1.stream().min((n1,n2)->n1.compareTo(n2)).get();
        MyLogger.consoleLogger.info("Min number from the list :"+num1);

        //printing the mximum element from the list
        int num2 = newList1.stream().max((n1,n2)->n1.compareTo(n2)).get();
        MyLogger.consoleLogger.info("Max number from the list :"+num2);




    }
}
