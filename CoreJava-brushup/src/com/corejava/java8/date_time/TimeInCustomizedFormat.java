package com.corejava.java8.date_time;

import java.time.LocalTime;

import com.corejava.util.MyLogger;

public class TimeInCustomizedFormat {
	
	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		MyLogger.consoleLogger.info(time);

		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		int nsec = time.getNano();

		MyLogger.consoleLogger.info("Printing time in our own format: " + nsec + ":" + sec + ":" + min + ":" + hour);
	}

}
