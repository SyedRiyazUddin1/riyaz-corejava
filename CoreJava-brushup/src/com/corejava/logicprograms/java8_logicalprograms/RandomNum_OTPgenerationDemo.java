package com.corejava.logicprograms.java8_logicalprograms;

import com.corejava.util.MyLogger;

import java.util.function.Supplier;

/**
 * Program which generates an OTP (random number)
 */

public class RandomNum_OTPgenerationDemo {

    public static void main(String[] args) {

        //Using Supplier interface which only supplies output
        Supplier<String> otp = () -> {
            String randomNo = "";
            for (int i = 1; i <= 4; i++) {
                randomNo = randomNo + (int) (Math.random() * 10);
            }
            return randomNo;
        };

        MyLogger.consoleLogger.info("OTP (random number) "+otp.get());
        MyLogger.consoleLogger.info("OTP (random number) "+otp.get());
        MyLogger.consoleLogger.info("OTP (random number) "+otp.get());
        MyLogger.consoleLogger.info("OTP (random number) "+otp.get());
    }
}

