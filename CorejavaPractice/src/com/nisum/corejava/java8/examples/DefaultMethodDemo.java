package com.nisum.corejava.java8.examples;

@FunctionalInterface
interface Robot1 { // creating an interface
	void call();//abstract method
	// declaring call() method here and defining it in the below class which
					// implements Phone interface

	default void talk() { // instead of declaring this method like the above one [call() method], we can define this method
		// here without declaring it with the help of default keyword (This can only be possible in Java 8)
		System.out.println("Robot started talking...");
	} 
}

class AndroidPhone implements Robot1 { // this call is implementing Phone interface
	public void call() { // here, we are defining the call method
		System.out.println("Robot started calling...");
	}
}

public class DefaultMethodDemo { // main class
	public static void main(String[] args) {
		Robot1 p = new AndroidPhone();
		p.call();
		p.talk();
	}
}
