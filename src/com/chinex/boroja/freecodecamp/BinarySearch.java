package com.chinex.boroja.freecodecamp;

public class BinarySearch {
    public static int binarySearch(int[] data, int target) {
        int firstPosition = 0;
        int lastPosition = data.length - 1;

        while (firstPosition <= lastPosition) {
            int mid = (firstPosition + lastPosition) / 2;

            if (data[mid] == target) {
                return mid;
            }
            else if (data[mid] < target) {
                firstPosition = mid + 1;
            }
            else {
                lastPosition = mid - 1;
            }
        }
        return -1;
    }

    public static void verify(int index) {
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        }
        else {
            System.out.println("Target not found in list");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int result = binarySearch(numbers, 10);
        verify(result);
    }
}
