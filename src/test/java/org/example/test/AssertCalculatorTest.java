package org.example.test;

import org.assertj.core.api.Assertions;
import org.example.calculator.Calculator;
import org.example.calculator.Calculator2;
import org.junit.jupiter.api.Test;

/**
 * AssertJ calculator test examples
 *
 * @author Marko
 */

public class AssertCalculatorTest {
   @Test
    public void testDivideArray() {
        float[] testArray = {1, 46, 2, 2.3f};
        Calculator2 calculator2 = new Calculator2();

        float result = calculator2.divideArray(testArray);

        Assertions.assertThat(result).isEqualTo(0.004725898f)
                .isNotEqualTo(32);
   }




    @Test
    public void testSubtractArray() {
        float[] testArray = {65, 3.7f, 42, 6.6f};
        Calculator2 calculator2 = new Calculator2();

        float result = calculator2.subtractArray(testArray);

        Assertions.assertThat(result).isLessThan(100)
                .isEqualTo(12.699999f)
                .isGreaterThan(2);
    }

    @Test
    public void testAddArray() {
        float[] testArray = {2, 6, 64.82f, 3215};
        Calculator calculator = new Calculator();

        float result = calculator.addArray(testArray);

        Assertions.assertThat(result).isEqualTo(3287.82f)
                .isLessThan(5000);

    }
    @Test
    public void testMultiplyArray() {
        float[] testArray = {32, 7, 6.25f, 3};
        Calculator2 calculator2 = new Calculator2();

        float result = calculator2.multiplyArray(testArray);

        Assertions.assertThat(result).isLessThan(10000)
                .isEqualTo(4200);

    }
}
