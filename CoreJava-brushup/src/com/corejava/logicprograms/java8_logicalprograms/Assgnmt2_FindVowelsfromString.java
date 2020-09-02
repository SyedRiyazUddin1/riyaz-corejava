package com.corejava.logicprograms.java8_logicalprograms;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 3.Given a list contains strings.Find the strings which are starting with vowels
 * <p>
 * List<String> numberList={"hello","owl","mkitty","uber"}
 */

public class Assgnmt2_FindVowelsfromString {

    public static void main(String[] args) {


        //Given list
        List<String> strList = Arrays.asList("hello", "eagle","Owl", "mkitty", "uber","Elephant");

        List<String> stringStartingWithVowel =
                strList.stream()
                        .filter(ch ->
                                (ch.startsWith("a")
                                || ch.toLowerCase().startsWith("e")
                                || ch.toLowerCase().startsWith("i")
                                || ch.toLowerCase().startsWith("o")
                                || ch.toLowerCase().startsWith("u")))
                        .collect(Collectors.toList());

        MyLogger.consoleLogger.info("Strings starting with vowels are: " + stringStartingWithVowel);
    }


}
