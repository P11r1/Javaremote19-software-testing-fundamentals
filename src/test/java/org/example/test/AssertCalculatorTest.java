package org.example.test;

import org.assertj.core.api.Assertions;
import org.example.calculator.Calculator2;
import org.junit.jupiter.api.Test;

/**
 * AssertJ calculator test examples
 *
 * @author Marko
 */

public class AssertCalculatorTest {
    @Test
    public float divideArray(float[] inputArray) {

            float result = inputArray[0];

            for (int i = 1; i < inputArray.length; i++) {
                result /= inputArray[i];
            }

            return result;

            Assertions.assertThat(result).;
    }

    @Test
    public void testDivideArray() {
        float[] array = {65, 3.7f, 42, 6.6f};

        Calculator2 calculator2 = new Calculator2();

        float result = calculator2.divideArray(array);

        Assertions.assertThat(array).hasSize(4)
                .contains(3.7f)
                .isNotEmpty();


    }
}
