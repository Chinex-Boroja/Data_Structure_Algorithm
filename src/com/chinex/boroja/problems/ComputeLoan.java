package com.chinex.boroja.problems;

import java.util.Scanner;

/**
 * This is a program that computes loan.
 * It allows the user enter the interest rate, the loan amount, the number of years
 * for which payments will be made
 * It must compute and display the monthly payment and total payment amounts.
 */
public class ComputeLoan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println("Please Enter Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.println("Please Enter number of years: ");
        int numberOfYears = input.nextInt();

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("The monthly payment for the loan is #" + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment of the loan is #" + (int)(totalPayment * 100) / 100.0);

    }
}
