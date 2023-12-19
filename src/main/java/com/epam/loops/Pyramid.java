package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength; j++) {
                if (j < cathetusLength - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
