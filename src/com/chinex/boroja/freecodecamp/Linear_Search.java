package com.chinex.boroja.freecodecamp;

public class Linear_Search {

    public static int linearSearch(int[] data, int target) {
        /**
         * Returns the index position of the target if found, else returns None
         */
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void verify(int index) {
        if (index != -1) {
            System.out.println("Target found at index: " +  index);
        }
        else {
            System.out.println("Target not found in list");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = linearSearch(numbers, 7);
        verify(result);
    }
}
