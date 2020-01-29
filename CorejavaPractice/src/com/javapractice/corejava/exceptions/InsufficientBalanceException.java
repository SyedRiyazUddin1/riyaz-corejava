package com.javapractice.corejava.exceptions;

import java.util.Scanner; //importing Scanner Class

//creating a user-defined exception class below


public class InsufficientBalanceException extends RuntimeException {

	public InsufficientBalanceException(String message) {
		super(message);

	}

}

