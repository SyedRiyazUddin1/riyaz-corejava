//program to pass parameters in a method
package com.javapractice.corejava.variables_datatypes.examples;

public class MethodParamsDemo {

    static void myMethod(String lastname) {
        System.out.println("Mr. " + lastname);
        System.out.println("Present");
    }

    public static void main(String[] args) {
        myMethod("Syed");
        myMethod("Kumar");
        myMethod("Chopra");
    }
}

