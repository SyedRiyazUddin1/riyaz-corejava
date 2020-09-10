package com.junit.mockito.operations;

import com.junit.mockito.service.ArithmeticService;

public class ArithmeticOperations {

    private ArithmeticService arithmeticService;

    public void setArithmeticService(ArithmeticService arithmeticService) {
        this.arithmeticService = arithmeticService;
    }

    public Long add2Long(long l1, long l2) {
        return arithmeticService.add(l1, l2);
    }

    public Long subtract(long l1, long l2) {

        if (l2 < 0) {
            throw new RuntimeException();
        }
        return arithmeticService.subtract(l1, l2);
    }
}
