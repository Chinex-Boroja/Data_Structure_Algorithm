package com.chinex.boroja.programiz.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProcess {
    public static void main(String[] args) {

        double[] myList = new double[10];
        //initializing an array with input values
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + myList.length + " values: ");
        double sum = 0;
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
            //myList[i] = Math.random() * 100;
            sum += myList[i];
            System.out.println(myList[i] + " ");
        }
        System.out.println(sum);

        //Print an array of type 'Char' type using on print statement
        char[] city = {'I', 'L', 'E', '-', 'I', 'F', 'E'};
        System.out.println(city);

        //Finding the largest element in an array
        double maximum = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > maximum) maximum = myList[i];
        }
        System.out.println("Max number in the array is: " + maximum);

        //finding the smallest index of the largest element
        double max = myList[0];
        int indexOfMax = 0;
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
                indexOfMax = i;
            }
        }
        System.out.println("Index of max is: " + indexOfMax);

//        //Random Shuffling
//        for (int i = myList.length - 1; i > 0; i--) {
//            //Generate an index J randomly with 0 <= j <= i
//            int j = (int)(Math.random() * (i + 1));
//
//            double temp = myList[i];
//            myList[i] = myList[j];
//            myList[j] = temp;
//            System.out.println("The new list: " + myList[j] + " ");
//        }

        //Shifting elements
        double temp = myList[0];
        //shifting elements left
        for (int i = 1; i < myList.length; i++) {
            myList[i - 1] = myList[i];
        }
        // Move the first element to fill in the last position
        myList[myList.length - 1] = temp;
        System.out.println(Arrays.toString(myList));

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        System.out.println("Please enter the month number");
        int monthNumber = input.nextInt();
        System.out.println("The month is " + months[monthNumber - 1]);
        input.close();

    }
}
