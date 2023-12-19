package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {

        for (int i = 1; i <= cathetusLength; i++) {
            // Bo'sh joylar
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }

            // Birlar sonlari
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // 2 dan boshlab chiqadigan sonlar
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public void printPyramid(long cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Bo'sh joylar
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }

            // Birlar sonlari
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // 2 dan boshlab chiqadigan sonlar
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}



