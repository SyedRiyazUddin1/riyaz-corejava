package com.nisum.corejava.basics.examples;

import java.util.Scanner; //importing Scanner Class
import com.nisum.corejava.exceptions.InsufficientBalanceException; //importing custom exception class
import com.nisum.corejava.util.MessageException;

class UserDefineExceptionTest {
	public static void main(String[] args) throws InsufficientBalanceException {

		int balance = 1000;
		int withDrawlAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the withDrawl amount: ");
		withDrawlAmount = sc.nextInt();
		sc.close();

		if (balance < withDrawlAmount) {
			throw new InsufficientBalanceException(MessageException.message);
		} else {
			System.out.println("Please collect the cash.. Thank you for using our ATM. :)");
		}

	}
}
