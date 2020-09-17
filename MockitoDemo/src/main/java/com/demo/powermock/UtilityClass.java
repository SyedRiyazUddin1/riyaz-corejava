package com.demo.powermock;

//class which has static method
public class UtilityClass {

    static int staticMethod(long value) {
        // Some complex logic is done here...
        throw new RuntimeException(
                "I dont want to be executed. I will anyway be mocked out.");
    }
}