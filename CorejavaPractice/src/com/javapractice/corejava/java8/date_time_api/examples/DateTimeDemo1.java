//program using Date and Time Api
package com.javapractice.corejava.java8.date_time_api.examples;

import com.javapractice.corejava.util.MyLogger;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeDemo1 {

    public void testLocalDateTime() {
        // Get the current date and time
        LocalDateTime currentTime = LocalDateTime.now();
        MyLogger.consoleLogger.info("Current DateTime: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        MyLogger.consoleLogger.info("date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        MyLogger.consoleLogger.info("Month: " + month +"day: " + day +"seconds: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        MyLogger.consoleLogger.info("date2: " + date2);

        //12 december 2014
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        MyLogger.consoleLogger.info("date3: " + date3);

        //22 hour 15 minutes
        LocalTime date4 = LocalTime.of(22, 15);
        MyLogger.consoleLogger.info("date4: " + date4);

        //parse a string
        LocalTime date5 = LocalTime.parse("20:15:30");
        MyLogger.consoleLogger.info("date5: " + date5);
    }

    public static void main(String args[]) {
        DateTimeDemo1 dateTime = new DateTimeDemo1();
        dateTime.testLocalDateTime();
    }
}
