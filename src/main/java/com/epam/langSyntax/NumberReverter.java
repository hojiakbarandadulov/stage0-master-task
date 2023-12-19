package com.epam.langSyntax;

import java.util.Scanner;

public class NumberReverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("raqam yozing: ");
        int berilganRaqam = scanner.nextInt();
        System.out.println(revert(berilganRaqam));
    }

    public static int revert(int number) {
        int teskari = 0;
        for (; number != 0; number /= 10) {
            int qoldiq = number % 10;
            teskari = teskari * 10 + qoldiq;
        }
        return teskari;
    }
}

