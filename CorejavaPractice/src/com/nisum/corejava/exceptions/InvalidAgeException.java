package com.nisum.corejava.exceptions;

public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException() {
        super("Invalid age exception ||| try a valid age");
        // created a constructor that can pass a String to the parent class method using
        // a "super" keyword
    }
}
