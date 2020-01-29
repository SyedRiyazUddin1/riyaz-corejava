package com.javapractice.corejava.java8.examples;

/*
 * Multiple Inheritance in Java Interfaces
 */

interface DiamondInterf1 {
	default void method1() {
		System.out.println("From InterfaceA default method");

	}
}

interface DiamondInterf2 {
	default void method1() {
		System.out.println("From InterfaceB default method");

	}
}

public class DiamondProblem implements DiamondInterf1, DiamondInterf2 {
	public static void main(String[] args) {
		DiamondProblem a = new DiamondProblem();
		a.method1();
	}

	@Override
	public void method1() {
			DiamondInterf2.super.method1();
	}
}
