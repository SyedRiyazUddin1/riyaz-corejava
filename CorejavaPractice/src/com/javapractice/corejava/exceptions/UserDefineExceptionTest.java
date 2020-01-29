package com.javapractice.corejava.exceptions;


import java.util.Scanner; //importing Scanner Class

import com.javapractice.corejava.util.MessageException;


class UserDefineExceptionTest {
	public static void main(String[] args) throws InsufficientBalanceException {

		int balance = 1000;
		int withDrawlAmount;
		double remainingBalance;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the withDrawl amount: ");
		withDrawlAmount = sc.nextInt();
		sc.close();

		if (balance < withDrawlAmount) {
			throw new InsufficientBalanceException(MessageException.message);
		} else {
			remainingBalance = balance - withDrawlAmount;
			System.out.println("Please collect the cash.. Thank you for using our ATM.\nRemaining Balance: " + remainingBalance);
		}

	}
}
