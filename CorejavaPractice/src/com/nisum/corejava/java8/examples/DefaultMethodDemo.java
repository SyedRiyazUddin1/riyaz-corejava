package com.nisum.corejava.java8.examples;

interface Phone { // creating an interface
	void call(); //abstract method
	// declaring call() method here and defining it in the below class which
					// implements Phone interface

	default void message() { // instead of declaring this method like the above one [call() method], we can define this method
		// here without declaring it with the help of default keyword (This can only be possible in Java 8)
		System.out.println("Message sent");
	} 
}

class AndroidPhone implements Phone { // this call is implementing Phone interface
	public void call() { // here, we are defining the call method
		System.out.println("Calling...");
	}
}

public class DefaultMethodDemo { // main class
	public static void main(String[] args) {
		Phone p = new AndroidPhone();
		p.call();
		p.message();
	}
}
