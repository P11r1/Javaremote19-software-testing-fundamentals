package org.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExample {
    @Test
    public void shouldReturnCorrectAddedNumbers() {
        //given
        final int a = 8; // object
        final int b = 55; // object

        //When
        final int addResult = a + b; //operation

        //Then
        Assertions.assertEquals(63, addResult);
    }
}
