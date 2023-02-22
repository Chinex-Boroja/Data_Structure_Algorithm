package com.chinex.boroja.problems;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        findGCD(125, 2525);
    }

    public static void findGCD(int number1, int number2) {
        int gcd = 1; // Initial GCD
        int k = 2; // Possible GCD

        while (k <= number1 && k <= number2) {
            if (number1 % k == 0 && number2 % k == 0) {
                gcd = k;
            }
            k++;
        }

        System.out.println("GCD is " + gcd + " and K is " + k);
    }
}
