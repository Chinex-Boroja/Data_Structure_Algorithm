package com.chinex.boroja.dietel;

import java.util.Scanner;

public class ProblemSets {
    public static void main(String[] args) {
       arithmeticCalculations();
    }
    public static void printMethods() {

        for (int i = 1; i < 5; i++) {
            System.out.printf("%d %s", i, "");
        }
        System.out.println();

        for (int i = 1; i < 5 ; i++) {
            System.out.print(i + " ");
        }
    }

    /**
     * Write an application that asks the user to enter two integers, obtains them from
     * the user and prints the square of each, the sum of their squares, and the difference of the squares (first
     * number squared minus the second number squared).
     */
    public static void arithmeticCalculations() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        int squareOfFirstNumber = number1 * number1;
        int squareOfSecondNumber = number2 * number2;

        System.out.println("squares of first number is: " + squareOfFirstNumber);
        System.out.println("squares of second number is: " + squareOfSecondNumber);

        int sumSquares = squareOfFirstNumber + squareOfSecondNumber;
        int diffSquares = squareOfFirstNumber - squareOfSecondNumber;

        System.out.println("Sum of squares of the first number is: " + sumSquares);
        System.out.println("Difference of squares of the second number is: " + diffSquares);

    }

    /**
     * Write an application that asks the user to enter one integer, obtains
     * it from the user and displays whether the number and its square are greater than, equal to, not equal
     * to, or less than the number 100
     */
    public static void compareIntegers() {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int squareOfNumber = number * number;

        if (number > 100 && squareOfNumber > 100) {
            System.out.println("The number and its square are greater than 100");
        }

        if (number < 100 && squareOfNumber < 100) {
            System.out.println("The number and its square are less than 100");
        }

        if (number == 100 && squareOfNumber == 100) {
            System.out.println("The number and its square are equal to 100");
        }

        if (number != 100 && squareOfNumber != 100) {
            System.out.println("The number and its square are not equal to 100");
        }

    }
}
