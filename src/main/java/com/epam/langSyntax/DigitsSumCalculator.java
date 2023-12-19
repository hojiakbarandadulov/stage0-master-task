package com.epam.langSyntax;

public class DigitsSumCalculator {

    public  int calculateSum(int number) {
        int sum=0;
        for (int i = number; i !=0  ; i=i/10) {
            sum=sum+i%10;
        }
        return sum;
    }

    public static void main(String[] args) {
        DigitsSumCalculator digitsSumCalculator=new DigitsSumCalculator();
        System.out.println(digitsSumCalculator.calculateSum(1234));
    }
}
