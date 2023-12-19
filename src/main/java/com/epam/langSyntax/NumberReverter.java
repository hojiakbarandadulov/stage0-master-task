package com.epam.langSyntax;

import java.util.Scanner;

public class NumberReverter {
    public void revert(int number) {
        int kutilganRaqam = 0;

        while (number != 0) {
            int qoldiq = number % 10;
            kutilganRaqam = kutilganRaqam * 10 + qoldiq;
            number /= 10;
        }
    }
}

