package com.javapractice.corejava.collectionsframework;

import com.javapractice.corejava.util.MyLogger;

import java.util.HashMap;
import java.util.Map;

public class HashCollisionDemo {
    public static void main(String[] args) {
        String s1 = "FB";
        String s2 = "Ea";

        MyLogger.consoleLogger.info(s1.hashCode() + " " + s2.hashCode());

        Map<String, Integer> myMap = new HashMap<>();
        //hashcollision due to same hashcodes
        myMap.put(s1, 1);
        myMap.put(s2, 2);

//same key, with each duplicate key entry, the value will get updated internally and the result will be bb=2
        myMap.put("bb", 1);
        myMap.put("bb", 2);

        MyLogger.consoleLogger.info(myMap);


    }
}
