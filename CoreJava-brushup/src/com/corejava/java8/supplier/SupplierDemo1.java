package com.corejava.java8.supplier;

import java.util.Date;
import java.util.function.Supplier;

import com.corejava.util.MyLogger;

public class SupplierDemo1 {

	public static void main(String[] args) {
		
		Supplier<Date> sup = ()->new Date();
		MyLogger.consoleLogger.info(sup.get());
	}

}
