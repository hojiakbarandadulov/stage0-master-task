package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        try {
            // Perform integer division
            int result = dividend / divider;

            // Multiply the result by the divider
            int product = result * divider;

            // Check if the product is equal to the dividend
            if (product == dividend) {
                System.out.println("division by zero\n");
            } else {
                System.out.println("cannot be divided completely\n");
            }
        } catch (ArithmeticException e) {
        }
    }
}
