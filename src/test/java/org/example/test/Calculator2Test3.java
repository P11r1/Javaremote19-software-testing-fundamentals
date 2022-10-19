package org.example.test;

import org.example.calculator.Calculator2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Calculator2Test3 {

    @Test
    public void shouldReturnSumWhenSubtractArrayIsCalled() {
        //random number array
        float[] array = {65, 3.7f, 42, 6.6f};



        //new object
        Calculator2 calculator2 = new Calculator2();
        // calling calculator subtract method
        float result = calculator2.subtractArray(array);

        //Method
        Assertions.assertEquals(12.69999885559082, result);
    }
}