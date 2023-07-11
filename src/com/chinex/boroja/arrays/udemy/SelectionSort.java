package com.chinex.boroja.arrays.udemy;

public class SelectionSort {
    public static void main(String[] args) {

        int[] intArray = {1, 4, 6, 2, 9, 10, -1};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex ; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);

        }
    }

    public static void swap(int[] array, int i, int j) {

        if (i == j)
            return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
