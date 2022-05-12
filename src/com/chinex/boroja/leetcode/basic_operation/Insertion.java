package com.chinex.boroja.leetcode.basic_operation;

public class Insertion {
    // Declare an integer array of 6 elements
    static int[] intArray = new int[6];
    static int length = 0;

    public static void main(String[] args) {

        //Add 3 elements to the Array
        for (int i = 0; i < 3; i++) {
            intArray[length] = i;
            length++;
        }
        intArray[length] = 10;
        length++;

        for (int i = 3; i >=0; i--) {
            intArray[i + 1] = intArray[i];
        }
        intArray[0] = 20;
        printArray();
    }

    public static void printArray() {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }

}
