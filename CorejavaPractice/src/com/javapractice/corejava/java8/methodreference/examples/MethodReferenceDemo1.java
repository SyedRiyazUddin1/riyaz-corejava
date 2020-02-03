package com.javapractice.corejava.java8.methodreference.examples;

public class MethodReferenceDemo1 {

    public static void main(String[] args) {
        // Thread t = new Thread(()-> printMessage());

        // replacing the above Lambda expression with Method reference expression
        Thread t = new Thread(MethodReferenceDemo1::printMessage);
        t.start();

    }

    public static void printMessage() {

        System.out.println("Hello");
    }
}
