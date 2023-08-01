package com.chinex.boroja.dietel;

import java.util.Scanner;

//Addition program that inputs two numbers then displays their sum
public class Addition {
    // main method begins execution of Java application
    public static void main(String[] args) {

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: "); //Prompt
        double number1 = input.nextInt(); // Read first number from user

        System.out.print("Enter second integer: "); //Prompt
        double number2 = input.nextInt();

        double sum = number1 / number2;

        System.out.printf("Sum is %.2f%n", sum);
        System.out.println(sum);

    }
}
