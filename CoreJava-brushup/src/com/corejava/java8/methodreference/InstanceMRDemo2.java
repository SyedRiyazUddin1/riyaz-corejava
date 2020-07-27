package com.corejava.java8.methodreference;

import com.corejava.util.MyLogger;

interface Interf {

	public void add(int num1, int num2);
}

public class InstanceMRDemo2 {

	public static void main(String[] args) {

		Interf interf = (num1, num2) -> MyLogger.consoleLogger.info("The sum:" + (num1 + num2));
		interf.add(4, 5);

	}

}
