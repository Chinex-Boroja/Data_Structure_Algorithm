package com.chinex.boroja.freecodecamp;

import java.util.Arrays;

public class ProcessingArrays {
    static  double[] myList = {1, 2, 3, 4, 7, 8, 31, 31, 4, 1, 0, 20, 30, 31};

    //Driver Method
    public static void main(String[] args) {
        System.out.println(checkMonth(12));
    }

    /** A method to find the smallest index of a number in an array */
    public static void findSmallestIndex() {
        double max = myList[0];
        int indexOfMax = 0;

        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
                indexOfMax = i;
            }
        }
        System.out.println(indexOfMax);
    }

    /** A method to find the largest number in an array */
    public static void findMax() {
        double max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        System.out.println(max);
    }

    /** A method to find the minimum number in an array */
    public static void findMin() {
        double min = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] < min) min = myList[i];
        }
        System.out.println(min);
    }

    /** A method to print all the elements in an array */
    public static void printArray() {

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
    }

    /** A method to initialize an array with random numbers from 1 to 100 */
    public static void initializeRandomValues() {
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
        }
    }

    /** A method to Shuffle an array randomly */
    public static void shuffleRandomly() {
        for (int i = myList.length - 1; i > 0; i--) {
            // Generate an index j randomly with 0 <= j <= i
            int j = (int)(Math.random() * (i + 1));
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;

            System.out.print(myList[i] + " ");
        }
    }

    public static void shiftLeft() {
        double temp = myList[0]; // Retain first element

        //Shift elements left
        for (int i = 1; i < myList.length; i++) {
            myList[i - 1] = myList[i];
        }
        // Move the first element to fill in the last position
        myList[myList.length - 1] = temp;

    }

    /** A method to check the month of the year */
    public static String checkMonth(int monthNumber) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        return "The month is " + months[monthNumber - 1];
    }

    /*
     * A program that finds the number of items above the average of all items
     */
    public static void findAverage() {
        double[] numbers = {3.4, 5, 6, 1, 6.5, 7.8, 3.5, 8.5, 6.3, 9.5};

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum / numbers.length;

        // number of items above average
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (average < numbers[i]) {
                count++;
            }
        }

        System.out.println("The sum of all the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + average);
        System.out.println("The number of items above average is " + count);
    }

    public static void selectCards() {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        // Display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }

//        for (int i = 0; i < 4; i++) {
//            int cardNumber = (int)(Math.random() * deck.length);
//            String suit = suits[cardNumber / 13];
//            String rank = ranks[cardNumber % 13];
//            System.out.println("Card number " + cardNumber + ": "
//                    + rank + " of " + suit);
//        }
    }

    /** A program to copy the content of arrays from one point to another */
    public static void copyContentOfArrays() {
        int[] sourceArray = {2, 3, 5, 7, 10};
        int[] targetArray = new int[sourceArray.length];

        // Using for loop
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }

        // Using array copy class in Java
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
    }

    public static void passByValue(int number, int[] numbers) {
        number = 1001;
        numbers[0] = 5555;
    }

    /** Reverse an array*/
    public static int[] reverseList(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }

        return result;
    }

    public static void reverseList1() {
        int[] list = {1, 2, 3, 4};
        int[] result = new int[list.length];

        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            result[j]  = list[i];
        }
        System.out.println(Arrays.toString(result));

    }

    /** Variable args */
    public static void testVarArgs(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
        }

        double result = numbers[0];
        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i] > result)
                result = numbers[i];
        }
        System.out.println("The max value is " + result);
    }
 }
