package com.nisum.corejava.controlstructures.examples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ExampleCS {
public static void main (String[] args) {
	Logger logger = Logger.getLogger(ExampleCS.class);
	BasicConfigurator.configure();
    int num1 = 6;
	if (num1>5) {
	logger.info("num1 is greater than 5");	
	} else {
		logger.info("num1 is lesser than 5");
	}
}
}
