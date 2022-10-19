package org.example.test;

import org.example.calculator.Calculator2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Calculator2Test {

    @Test
    public void shouldReturnSumWhenDivideArrayIsCalled() {
        float[] array = {100, 3.5f, 8, 64, 6.2f};

        //Given
        Calculator2 calculator2 = new Calculator2();

        //When
        float result = calculator2.divideArray(array);


        //Then
        Assertions.assertEquals(0.009000576101243496, result);
    }
}