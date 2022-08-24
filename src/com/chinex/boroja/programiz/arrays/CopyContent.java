package com.chinex.boroja.programiz.arrays;

public class CopyContent {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        // Using arraycopy method
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);

        int[] myList;
        myList = new int[10];
        // Sometime later you want to assign a new array to myList
        myList = new int[20];

        System.out.println(myList.length);
        printArray(new int[]{3, 1, 2, 6, 4, 2});

    }
    //Passing Arrays to Methods(Reference of the array is passed to the method)
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
