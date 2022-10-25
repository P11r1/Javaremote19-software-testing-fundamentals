package org.example.test;

import org.example.calculator.Calculator2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Calculator2Test2 {

    @Test
    public void shouldReturnSumWhenMultiplyArrayIsCalled() {
        float[] array = {2, 86.2f, 7, 3.25f};



        //Given
        Calculator2 calculator2 = new Calculator2();

        //When
        float result = calculator2.multiplyArray(array);

        //Then
        Assertions.assertEquals(3922.099853515625, result);

    }
}