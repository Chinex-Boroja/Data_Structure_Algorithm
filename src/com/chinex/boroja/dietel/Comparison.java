package com.chinex.boroja.dietel;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        int x = 5;
        int y = 1;
        System.out.printf("x = %d%n", x + 5);
        System.out.printf("value of %d %d is %d\n", x, y, (x * y));
        System.out.printf("%d is not equal to %d%n", (x + y), (x * y));

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        if (number1 == number2) {
            System.out.printf("%d == %d%n", number1, number2);
        }

        if (number1 != number2) {
            System.out.printf("%d != %d%n", number1, number2);
        }

        if (number1 < number2) {
            System.out.printf("%d < %d%n", number1, number2);
        }

        if (number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2);
        }

        if (number1 <= number2) {
            System.out.printf("%d <= %d%n", number1, number2);
        }

        if (number1 >= number2) {
            System.out.printf("%d >= %d%n", number1, number2);
        }

    }
}
