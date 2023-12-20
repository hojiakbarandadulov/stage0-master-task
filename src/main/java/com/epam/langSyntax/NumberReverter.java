package com.epam.langSyntax;

import java.util.Scanner;

public class NumberReverter {
    public void revert(int number) {
        int temp;
        int reverseNum = 0;

        for (; number != 0;) {
            temp = number % 10;
            reverseNum = reverseNum * 10 + temp;

            number = number / 10;
        }
        System.out.println(reverseNum);
    }
}

