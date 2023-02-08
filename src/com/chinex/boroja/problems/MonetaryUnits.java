package com.chinex.boroja.problems;

import java.util.Scanner;

/**
 * A program that breaks a large amount into smaller units
 */
public class MonetaryUnits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter amount to be changed ");
        double amount = input.nextDouble();

        // Convert to amount to cents
        int amountRemaining = (int)(amount * 100);

        //find the number of a single dollars
        int numberOfOneDollars = amountRemaining / 100;
        amountRemaining %= 100;

        // Find the number of quarters
        int numberOfQuarters = amountRemaining / 25;
        amountRemaining %= 25;

        // Find the number of dimes
        int numberOfDimes = amountRemaining / 10;
        amountRemaining %= 10;

        // Find the number of nickel
        int nickels = amountRemaining / 5;
        amountRemaining %= 5;

        // Find number of pennies
        int numberOfPennies = amountRemaining;

        // Display amount
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + nickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");

    }
}
