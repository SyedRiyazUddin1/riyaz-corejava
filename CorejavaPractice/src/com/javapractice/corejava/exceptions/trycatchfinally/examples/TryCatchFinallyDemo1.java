//program to handle exceptions using try, catch and finally
package com.javapractice.corejava.exceptions.trycatchfinally.examples;

public class TryCatchFinallyDemo1 {
    public static void main(String[] args) {
        //writing the risky code in try block
        try {
            int divideByZero = 5 / 0;
        }
        //catching the exception in catch block
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
        //code in the finally block will execute irrespective of exception handling
        finally {
            System.out.println("Finally block is always executed");
        }
    }
}
