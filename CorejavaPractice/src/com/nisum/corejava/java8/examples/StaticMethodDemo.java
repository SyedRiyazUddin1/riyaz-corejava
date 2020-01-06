package com.nisum.corejava.java8.examples;

interface Robot {
	default void run() // defining this method here without declaring it with the help of default keyword
						// (This can only be possible in Java 8)
	{
		System.out.println("Started running...");
	}

	static void cook() { //defining static methods in interface
		System.out.println("Started cooking...");
	}
}

public class StaticMethodDemo implements Robot // main class implementing Robot interface
{
	public static void main(String[] args) {
		StaticMethodDemo sm = new StaticMethodDemo();
		sm.run();
		Robot.cook(); //Static methods must be called by using the interface name preceding the method name.
	}

}
