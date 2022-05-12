package com.chinex.boroja;

public class ImplementingArraysWithLoop {

    public static void main(String[] args) {
        int[] squareNumbers = new int[10];

        //Go through each of the array indexes, from 0 to 9
        for ( int i = 0; i < 10; i++) {
            int square =(i + 1) * (i + 1);
            squareNumbers [i] = square;
            //System.out.println(squareNumbers[i]);
        }
        for (int square : squareNumbers) {
            System.out.println(square);
        }
        //Array capacity
        System.out.println(squareNumbers.length);

        //Length of an Array
        int[] array = new int[6];

        //current length of an array
        int length = 0;
        //add 3 items into it
        for (int i = 0; i < 3; i++) {
            array[i] = i * i;
            //Each time we add an element, the length goes up by one
            length++;
        }
        System.out.println("The array has a capacity of " + array.length);
        System.out.println("The array has a length of " + length);
    }
}

class DSA {
    public static void main(String[] args) {
        int n = 9;
        int c = 1;
        for (int i = c; i <= n; i++) {
            c *= i;
        }
        System.out.println("c is: " + c);
    }
}
