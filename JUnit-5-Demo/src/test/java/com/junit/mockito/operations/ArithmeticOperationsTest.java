package com.junit.mockito.operations;

import com.junit.mockito.service.ArithmeticService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class ArithmeticOperationsTest {

    @InjectMocks
    private ArithmeticOperations arithematicOperations;

    private ArithmeticService arithematicService;


    @BeforeEach
    public void setUp() {
        //arithematicOperations = new ArithmeticOperations();
        initMocks(this);
    }

    @Test
    public void returnAdditionOf2Long() {
        when(arithematicService.add(anyLong(), anyLong()))
                .thenReturn(30L);
        assertEquals(Long.valueOf(30L), arithematicOperations.add2Long(1, 2));
    }

    @Test
    public void returnSubtractOf2Long() {
        when(arithematicService.subtract(anyLong(), anyLong()))
                .thenThrow(new RuntimeException());
        assertThrows(RuntimeException.class, () -> arithematicOperations.subtract(1, -1));
    }


}
