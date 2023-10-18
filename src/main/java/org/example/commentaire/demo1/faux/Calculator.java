package org.example.commentaire.demo1.faux;

public class Calculator {

    // This is a method to add two numbers
    public int add(int num1, int num2) {
        // Return the sum of num1 and num2
        return num1 + num2;
    }

    // This is a method to subtract two numbers
    public int subtract(int num1, int num2) {
        // Return the difference of num1 and num2
        return num1 - num2;
    }

    /*
     * This is a method to multiply two numbers
     */
    public int multiply(int num1, int num2) {
        /*
         * Return the product of num1 and num2
         */
        return num1 * num2;
    }

    /**
     * This is a method to divide two numbers
     * @param num1 The first number
     * @param num2 The second number
     * @return The result of the division
     */
    public double divide(int num1, int num2) {
        // Check if num2 is zero
        if (num2 == 0) {
            // Return NaN if num2 is zero
            return Double.NaN; // NaN stands for "Not a Number"
        }

        // Return the result of the division
        return (double) num1 / num2;
    }
}

