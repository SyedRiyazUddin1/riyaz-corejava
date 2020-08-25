package com.corejava.java8.streams;

//Program to demonstrate Stream's reduce method in Java 8..

import com.corejava.util.MyLogger;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

@Data
class Emp {

    String empName;
    int empId;
    double empSalary;

    public Emp(String empName, int empId, double empSalary) {
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
    }
}

public class ReduceMethodDemo {

    public static void main(String[] args) {

        List<Emp> empList = new ArrayList<Emp>();
        empList.add(new Emp("Syed Riyaz", 101, 15000));
        empList.add(new Emp("Avinash Edamadakala", 102, 11000));
        empList.add(new Emp("Rohit Mudunuri", 103, 19000));
        empList.add(new Emp("Abdul Azeem", 104, 25000));
        empList.add(new Emp("Shipra Singh", 105, 21500));

        /**
         * * 1st flavour of reduce method which takes an accumulator (a lambda expression)
         * reduce(accumulator);
         * Using reduce method to perform operations on the numbers ranges from 1 to 4, here 4 will be excluded
         * Output will be 1+2+3 = 6
         */

        OptionalInt reduced = IntStream.range(1, 4).reduce((num1, num2) -> num1 + num2);
        MyLogger.consoleLogger.info(reduced);

        /**
         * 2nd flavour of reduce method which additionally takes an identity and an accumulator (a lambda expression)
         * reduce(identity, accumulator);
         * Output will be 11+12+13=25 ->25+11 = 36
         */

        int reducedWith2Params = IntStream.range(1, 4).reduce(10, (num1, num2) -> num1 + num2);
        MyLogger.consoleLogger.info(reducedWith2Params);


        /**
         * 3rd flavour of reduce method which takes an identity, an accumulator (a lambda expression) and a combiner
         * reduce(identity, accumulator, combiner);
         * Output will be 10+1+2+3 = 16
         */

        int reduce = Arrays.asList(1, 2, 3).parallelStream().reduce(10, (n1, n2) -> n1 + n2, (n1, n2) -> {
            MyLogger.consoleLogger.info("Combiner was called");
            return n1 + n2;
        });
        MyLogger.consoleLogger.info(reduce);


    }

}
