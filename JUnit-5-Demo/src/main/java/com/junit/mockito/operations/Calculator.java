package com.junit.mockito.operations;

import com.junit.mockito.service.CalculatorService;

public class Calculator {

    CalculatorService service;

    public Calculator(CalculatorService service) {
        this.service = service;

    }

    public int perform(int num1, int num2) {

        return service.add(num1, num2) * num1; //2,3 =>(2+3)*2

        //return (num1+num2)*num1; if we comment the above line and run without service implementation,
        // verify method in Test calls shows an error that we are not using the mock service
    }
}
