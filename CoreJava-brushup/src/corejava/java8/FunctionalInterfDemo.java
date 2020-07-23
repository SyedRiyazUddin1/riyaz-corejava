package com.corejava.java8;

import com.corejava.util.MyLogger;

interface Interf{
	public void add(int a, int b);
}

public class FunctionalInterfDemo {
	
	public static void main(String[] args) {
		
		Interf intrf = (a,b)->MyLogger.consoleLogger.info(a+b);
		intrf.add(7, 8);
	}

}