package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(int firstSide, int secondSide, int thirdSide) {
        if (isValidTriangle(firstSide, secondSide, thirdSide)) {
            System.out.println("this is a valid triangle\n");
        } else {
            System.out.println("it's not a triangle\n");
        }
    }

    private boolean isValidTriangle(int a, int b, int c) {
        return a*a+b*b == c*c;
    }
}
