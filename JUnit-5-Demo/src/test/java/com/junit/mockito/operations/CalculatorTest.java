package com.junit.mockito.operations;

import com.junit.mockito.operations.Calculator;
import com.junit.mockito.service.CalculatorService;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    Calculator calc = null;

//    Creating a fake service in order to run our test
//    CalculatorService service = new CalculatorService() {
//        @Override
//        public int add(int num1, int num2) {
//            return 0;
//        }
//    };

    //using Mockito framework
    //creating a fake object (mocking the CalculatorService) here
    //CalculatorService service = mock(CalculatorService.class);
    //or you can also add the @Mock annotation like below
    @Mock
    CalculatorService service;
    //along with mock annotation, we should also mention the Mockito rule that we are also using junit. else, we get null pointer exception
    @Rule public MockitoRule rule = MockitoJUnit.rule();

    @Before
    public void setUp() {
        calc = new Calculator(service);
    }

    @Test
    public void testPerform() {

        //add method in the CalculatorService should return 5
        when(service.add(2, 3)).thenReturn(5);

        //multiplying 5 with the add method in Calculator class
        assertEquals(10, calc.perform(2, 3));

        //to check whether we are using the mock service or ot
        verify(service).add(2, 3);
        /**
         * if we comment the service in Calculator, you will get the below error
         *         Wanted but not invoked:
         *         calculatorService.add(2, 3);
         */


    }
}
