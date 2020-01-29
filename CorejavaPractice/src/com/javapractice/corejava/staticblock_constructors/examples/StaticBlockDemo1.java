//program to create a static block
package com.javapractice.corejava.staticblock_constructors.examples;

public class StaticBlockDemo1 {

    // This is a static method (method with a keyword "static"
    static void myMethod() {
        System.out.println("Static method called");
    }

    public static void main(String[] args) {
        //we are call this method without creating any object.

        myMethod();
    }
}
