package com.epam.loops;

public class Power {

    public static int printPower(int numberToPrint, int power) {
        int print=1;
        for (int i = 0; i < power; i++) {
            print *= numberToPrint;
        }
        return print;
    }

    public static void main(String[] args) {
//        new Power().printPower(-10, 3);
        System.out.println(printPower(-10,3));
    }
}
