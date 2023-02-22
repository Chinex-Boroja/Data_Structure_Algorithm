package com.chinex.boroja.problems;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        checkLeapYear(2003);
        checkChineseZodiac(2033);
        System.out.println(Math.floor(2.1));
        System.out.println("\\t He said");

        int i = '2' + '3';
        System.out.println("i is " + i);
        System.out.println(Character.isLetter('a'));

        // Strings
        String message = "Just a refresher";
        System.out.println(message.length());
        System.out.println(message.charAt(8));
        System.out.println( message.charAt(message.length() - 1));
        String checkout = "\t Good Night \n".trim();
        System.out.println(checkout);

        System.out.println(extractSubstring("Chinedu Ihedioha"));

        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";
        hexToDigitConversion("F");

        System.out.println(s1.compareTo(s2));

        //Format output
        double amount = 12618.98;
        double interestRate = 0.000348;
        double interest = amount * interestRate;
        System.out.printf("Interest is $%4.2f", interest);

        System.out.println();

        int sum = 0;
        for (int j = 0; j < 10; ++j) {
            sum +=j;
        }
        System.out.println("sum is " + sum);
    }
    public static void checkLeapYear(int year) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(year + " is leap year? " + isLeapYear);
    }

    public static void checkChineseZodiac(int year) {

        switch (year % 12) {
            case 0:
                System.out.println("Monkey");break;
            case 1:
                System.out.println("Rooster"); break;
            case 2:
                System.out.println("Dog"); break;
            case 3:
                System.out.println("Pig"); break;
            case 4:
                System.out.println("Rat"); break;
            case 5:
                System.out.println("Ox"); break;
            case 6:
                System.out.println("Tiger"); break;
            case 7:
                System.out.println("Rabbit"); break;
            case 8:
                System.out.println("Dragon"); break;
            case 9:
                System.out.println("Snake"); break;
            case 10:
                System.out.println("Horse"); break;
            case 11:
                System.out.println("Sheep");
        }
    }
    public static int randomGenerator() {

        Random random = new Random();
        return random.nextBoolean() ? 1 : -1;
    }

    public static String extractSubstring(String s) {
        int k = s.indexOf(' ');
        String firstName = s.substring(0, k);
        String lastName = s.substring(k + 1);

       return firstName;
    }

    public static void hexToDigitConversion(String hexString) {

        //Check if the hex string has exactly one character
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }
        // Display decimal value for the hex digit
        char ch = hexString.charAt(0);
        if (ch >= 'A' && ch <= 'F') {
            int value = ch - 'A' + 10;

            System.out.println("The decimal value for hex digit " + ch + " is " + value);
        }
        else if(Character.isDigit(ch)) {
            System.out.println("The decimal value for hex digit " + ch + " is " + ch);
        }
        else {
            System.out.println(ch + " is an invalid input");
        }
    }

    public static void guessNumber() {

        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess the magic number between 0 and 100");

        int guess = -1;

        while (guess != number) {
            System.out.println("\nEnter your guess");
            guess = input.nextInt();
            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            }
            else if (guess > number) {
                System.out.println("The guess is too high");
            }
            else {
                System.out.println("Your guess is too low");
            }

        }
    }

    public static void subtractQuiz() {

        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        StringBuilder output = new StringBuilder();
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.println("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            if (number1 - number2 == answer) {
                System.out.println("You are correct");
                correctCount++;
            }
            else {
                System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));

            }
            count++;

            output.append("\n").append(number1).append(" - ").append(number2).append(" = ").append(answer).append((number1 - number2 == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("The correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }

    public static void sentinelValue() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a digit (If the input is 0, the program ends): ");
        int data = input.nextInt();

        int sum = 0;
        while (data != 0) {
            sum += data;

            System.out.println("Enter a digit (If the input is 0, the program ends): ");
            data = input.nextInt();
        }

        System.out.println("The sum is " + sum);
    }

    public static void main0() {
        Scanner input = new Scanner(System.in);
        int number, max;
        number = input.nextInt();
        max = number;
        do {
            number = input.nextInt();
            if (number > max)
                max = number;
        } while (number != 0);
        System.out.println("max is " + max);
        System.out.println("number " + number);
    }
}
