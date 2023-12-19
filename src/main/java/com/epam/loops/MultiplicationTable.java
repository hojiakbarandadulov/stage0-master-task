package com.epam.loops;

public class MultiplicationTable {

    public static int printTable(int numberTableToPrint) {
        int limit = 10; // Ko'rsatilgan ko'paytirish jadvali oralig'ini o'zgartirishingiz mumkin

        // Ko'paytirish jadvalini generatsiya qilish va chiqarish
        for (int i = 1; i <= limit; i++) {
            int multiplicationResult = numberTableToPrint * i;
            System.out.println(i + " x " + numberTableToPrint + " = " + multiplicationResult);

        }
        return numberTableToPrint;
    }
}