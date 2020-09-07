package com.corejava.logicprograms.java8_logicalprograms;

import com.corejava.util.MyLogger;
import java.util.stream.Stream;

//Program to count the words and characters in a given string

public class CountWordsJava8 {

    public static void main(String[] args) {
        String str = "My Name is Riyaz";

        //storing the words from a string to an array

        String myArray[]= str
                .trim() //used to remove the whitespaces from beginning and ending of a string
                .split(" "); //splitting a string by space using split method

        MyLogger.consoleLogger.info("Count of words in a given string " +str+" are: "+myArray.length);

        //storing the words from a string to an array

        String myArray1[]= str
                .trim() //used to remove the whitespaces from beginning and ending of a string
                .split(""); //splitting a string using split method (not passing a space here)

        MyLogger.consoleLogger.info("Count of words in a given string " +str+" are: "+myArray1.length);


    }
}
