package com.nisum.corejava.basics.examples;

public class ExceptionExample {
public static void main (String []args) {
	int balance = 1000;
	int withdrawlAmount = 4000;
	//our throw, our catch
	try
	{
		if ( balance < withdrawlAmount)
			throw new ArithmeticException ("Insufficient balance");
		balance  = balance - withdrawlAmount;
		System.out.println("Transaction succesfully completed");
	}
	
	catch (ArithmeticException e)
	{
		System.out.println ("Exception: " + e.getMessage());
	}
	System.out.println ("Program continues..");
}
}
