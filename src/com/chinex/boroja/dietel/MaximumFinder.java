package com.chinex.boroja.dietel;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers:::::");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();

        double maxNumber = calculateMaximumNumber(firstNumber, secondNumber, thirdNumber);

        System.out.println("The maximum number is " + maxNumber);
    }

    private static double calculateMaximumNumber(double firstNumber, double secondNumber, double thirdNumber) {

        double maximumNumber = firstNumber;

        if (secondNumber > firstNumber) {
           maximumNumber = secondNumber;
        }

        if (thirdNumber > firstNumber) {
            maximumNumber = thirdNumber;
        }

        return maximumNumber;
    }
}
