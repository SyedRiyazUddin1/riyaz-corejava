//Program using Try-with-resources

package com.javapractice.corejava.java8.try_with_resources.examples;

import com.javapractice.corejava.util.MyLogger;

import java.util.Scanner;

public class TryWithResourcesDemo {
    public static void main(String[] args) {

        //wirting a Try-statement that declares resources where we need not to worry about closing the resources
        try (Scanner scanner = new Scanner(System.in);) {
            int num1, num2, sum;

            MyLogger.consoleLogger.info("Please enter the first number:");
            num1 = scanner.nextInt();

            MyLogger.consoleLogger.info("Please enter the Second number:");
            num2 = scanner.nextInt();
            sum = num1 / num2;

            MyLogger.consoleLogger.info(sum);
        } catch (ArithmeticException exception) {
            MyLogger.consoleLogger.info("Cannot divide the number by Zero " + exception);
        }

    }
}
