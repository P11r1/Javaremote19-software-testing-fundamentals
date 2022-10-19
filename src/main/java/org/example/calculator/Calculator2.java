package org.example.calculator;

public class Calculator2 {
    //Divide
    public float divideArray(float[] inputArray) {
        float result = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            result /= inputArray[i];
        }

        return result;
    }
      //Multiply
    public float multiplyArray(float[] inputArray) {
        float result = 1;

        for (float input: inputArray) { // {1, 2, 3}
            result *= input; // result = result + input
        }

        return result;
    }

    //Subtract
    public float subtractArray(float[] inputArray) {
        float result = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            result -= inputArray[i];
        }
        return result;

    }
}
