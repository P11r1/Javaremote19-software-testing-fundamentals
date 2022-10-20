package org.example.test;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    private static float[] testArray;

    //This will be called only once before all test/methods
    @BeforeAll
    public static void setupGlobal() {
        System.out.println("Starting calculator tests...");
         testArray = new float[]{3, 4, 45, 6.7f, 12, 3.8f};
    }


    // This method is called before start run of EACH test
    @BeforeEach
    public void setupEach() {
        calculator = new Calculator();
    }

    //This method will be called after run of EACH test
    @AfterEach
    public void finalSetupEach() {
        System.out.println("This test is finished running!");
    }

    //This method will be called after running ALL the methods/test
    @AfterAll
    public static void finalSetupGlobal() {
        System.out.println("Calculator test are finished successfully!");
    }

    @Test
    @Disabled
    public void shouldReturnSumWhenAddArrayIsCalled() {
        float result = calculator.addArray(testArray);

        Assertions.assertEquals(74.5f, result);
    }
    @Test

    public void shouldReturnMultiplydWhenMultiplyArrayIsCalled(){
        
        float result = calculator.multiplyArray(testArray);

        Assertions.assertAll(() -> Assertions.assertTrue(result > 0),

            () -> Assertions.assertEquals(164980.796875f, result));
    }
}