package com.corejava.logicprograms.java8_logicalprograms;

import com.corejava.util.MyLogger;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class VowelsCountString {

    public static void main(String[] args) {

        String myStr = "How are you doing? Hope everything is fine";

        //filtering the words which starts with vowels.
        String myArray [] = Arrays.stream(myStr.split(" "))
                .filter(ch->ch.startsWith("a")
                        ||ch.startsWith("e")
                        ||ch.startsWith("i")
                        ||ch.startsWith("o")
                        ||ch.startsWith("u"))
                        .toArray(String[]::new);
        for (String str : myArray) {
            MyLogger.consoleLogger.info(str);
        }

        //counting the words which starts with vowel.
        Stream<String> myStream = Stream.of(myArray);

        MyLogger.consoleLogger.info("count of words which starts with vowel: "+myStream.count());










    }

}
