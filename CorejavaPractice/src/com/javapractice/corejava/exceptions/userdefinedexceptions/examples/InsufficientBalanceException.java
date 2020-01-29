package com.javapractice.corejava.exceptions.userdefinedexceptions.examples;

//creating a user-defined exception class below

public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException(String message) {
        super(message);

    }

}

