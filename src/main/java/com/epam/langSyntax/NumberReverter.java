package com.epam.langSyntax;

import java.util.Scanner;

public class NumberReverter {
    public void revert(int number) {

        int num = number; //
        int temp;
        int reverseNum = 0;
        for (; num != 0; ) {
            temp = num % 10;
            reverseNum = reverseNum * 10 + temp;

            num = num / 10;
        }
        System.out.println(reverseNum);
    }
}

