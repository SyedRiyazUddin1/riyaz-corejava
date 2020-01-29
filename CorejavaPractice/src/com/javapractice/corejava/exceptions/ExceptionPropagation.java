package com.javapractice.corejava.exceptions;

class ExceptionPropagation {
	void method1() throws ArithmeticException {
		throw new ArithmeticException("Calculation error");
	}

	void method2()  {
		method1();
	}
 
	void method3() {
		try {
			method2();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException handled");
		}
	}

	public static void main(String args[]) {
		ExceptionPropagation obj = new ExceptionPropagation();
		obj.method3();
		System.out.println("End Of Program");
	}
}