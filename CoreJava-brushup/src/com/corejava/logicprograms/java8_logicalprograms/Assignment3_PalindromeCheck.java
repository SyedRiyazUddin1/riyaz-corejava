package com.corejava.logicprograms.java8_logicalprograms;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 4.Given a list contains  strings. find the the string which are in palindrome
 * <p>
 * List<String> numberList={"hello","aoa","mkitty","uber"}
 */

public class Assignment3_PalindromeCheck {

    public static void main(String[] args) {


        //Given list
        List<String> strList = Arrays.asList("hello", "bob", "Owl", "mkitty", "uber", "mom");

        List<String> stringsWhichArePalindrome =
                strList.stream()
                        .filter(str -> isPalindrome(str))
                        .collect(Collectors.toList());

        MyLogger.consoleLogger.info("Palindrome Strings in a list are: " + stringsWhichArePalindrome);


    }

    //method which returns the Palindrome Strings
    static boolean isPalindrome(String str) {

        // compare each character from starting
        // with its corresponding character from last

        //   m o m
        //   0 1 2 index
        for (int i = 0; i < str.length() / 2; i++)
            if (str.charAt(i) == str.charAt(str.length() - i - 1))
                return true;
        return false;
    }
}
