package com.corejava.strings;

import com.corejava.util.MyLogger;

public class StringBuilderReverseDemo {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Riyaz");

		MyLogger.consoleLogger.info(sb.reverse());

	}
}
