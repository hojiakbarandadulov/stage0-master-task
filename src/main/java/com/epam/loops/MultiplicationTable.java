package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        System.out.println(numberTableToPrint+" \"'s multiplication table:");
        for (int i = 1; i <=10 ; i++) {
            int sum=numberTableToPrint*i;
            System.out.println(numberTableToPrint+" x "+ i+" = " +sum);
        }
    }

}
