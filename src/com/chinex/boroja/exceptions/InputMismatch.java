package com.chinex.boroja.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integer: ");
                int number = input.nextInt();

                System.out.println("The number entered is " + number);
                continueInput = false;
            }
            catch (InputMismatchException exception) {
                System.out.println("Try Again. (" + "Incorrect input: an integer is required)");
                input.nextInt(); // Disregard input
            }
        }while (continueInput);
    }
}
