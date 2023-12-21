package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {

        // Bo'luvchining nolga bo'lishini tekshirish
        if (divider == 0) {
            System.out.println("Xatolik: Bo'luvchi 0 ga teng bo'lish mumkin emas.");
            return;
        }

        // Bo'linishi natijasini hisoblash
        int result = dividend / divider;

        // Natijani chiqarish
        System.out.println("The result: " + result);

        // To'liq bo'linishi yoki bo'linib bo'lmaganini tekshirish
        if (dividend % divider == 0) {
            System.out.println("can be divided completely\n");
        } else {
            System.out.println("cannot be divided completely\n");
        }
    }
}

