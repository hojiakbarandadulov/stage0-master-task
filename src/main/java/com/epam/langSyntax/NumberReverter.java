package com.epam.langSyntax;

import java.util.Scanner;

public class NumberReverter {
    static  int number;
    public void revert(int number) {
        int a = number / 100;
        int b = (number % 100) / 10;
        int c = number % 10;
        System.out.println("" + a+b+c);
    }

    public static void main(String[] args) {
        NumberReverter numberReverter=new NumberReverter();
        numberReverter.revert(number);
    }
}

