package com.corejava.java8.supplier;

//Random OTP generator

import java.util.function.Supplier;

import com.corejava.util.MyLogger;

public class SupplierDemo2 {

	public static void main(String[] args) {

		Supplier<String> supplier = () -> {

			String otp = "";
			for (int loop = 0; loop < 6; loop++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};

		MyLogger.consoleLogger.info(supplier.get());
	}
}
