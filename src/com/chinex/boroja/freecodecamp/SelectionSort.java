package com.chinex.boroja.freecodecamp;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] list = new int[]{2, 5, 8, 9, 1, 4, 8};
        sortSelectively(list);
        System.out.println(Arrays.toString(list));
    }
    public static void sortSelectively(int[] list) {

        for (int i = list.length - 1; i > -1; i--) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length ; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            //Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    public static void selectAndSort(int[] list) {

        /** Find the minimum in the list[i..list.length-1] and swap continuously until the array is sorted */
        for (int i = 0; i < list.length; i++) {
            int currentMinIndex = i;

            // Find the minimum value of the remaining element in the list
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[currentMinIndex]) {
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary
            int temp = list[currentMinIndex];
            list[currentMinIndex] = list[i];
            list[i] = temp;
        }
    }
}
