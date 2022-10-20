package org.example.calculator;

public class Calculator {
    public float addArray(float[] inputArray) {
        float result = 0;

        for (float input: inputArray) { // {1, 2, 3}
            result += input; // result = result + input
        }

        return result;
    }



    public float multiplyArray(float[] inputArray) {
        float result = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            float input = inputArray[i]; // {1, 2, 3}
            result *= inputArray[i]; // result = result + input
        }

        return result;
    }
}
