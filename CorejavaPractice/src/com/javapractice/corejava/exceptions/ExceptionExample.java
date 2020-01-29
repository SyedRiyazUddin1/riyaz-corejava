package com.javapractice.corejava.exceptions;

public class ExceptionExample {
public static void main (String []args) {
	int balance = 1000;
	int withdrawlAmount = 1100;
	//our throw, our catch
	try
	{
		if ( balance < withdrawlAmount)
			throw new ArithmeticException ("Insufficient balance");
		balance  = balance - withdrawlAmount;
		System.out.println("Remaining Balance: " + balance);
	}
	
	catch (ArithmeticException e)
	{
		System.out.println ("Exception: " + e.getMessage());
	}
	System.out.println ("Program continues..");
}
}
