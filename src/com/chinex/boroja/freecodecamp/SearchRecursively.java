package com.chinex.boroja.freecodecamp;

public class SearchRecursively {

    public static boolean recursive_binary_search(int[] data, int target) {
        if (data.length == 0) {
            return false;
        }
        else {
            int mid = data.length / 2;
            if (data[mid] == target) {
                return true;
            }
            else {
                if (data[mid] < target){
                    return recursive_binary_search(new int[]{data[mid + 1]}, target);
                }
                else {
                    return recursive_binary_search(new int[]{data[mid]}, target);
                }
            }
        }

    }
    public static void verify(boolean result) {
        System.out.println("Target found: " + result);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = recursive_binary_search(numbers, 12, 0, numbers.length - 1);
        verify(result);

        result = recursive_binary_search(numbers, 6, 0, numbers.length - 1);
        verify(result);

    }

    // Second method
    // Recursive binary search
    // Returns index of target if it is present
    // in arr[start..end], else return -1
    /**
     *
     * @param data array of integers
     * @param target key or index of the data being found
     * @param start first element of the array
     * @param end last element of the array
     * @return -1 if the element is not found
     */
    public static int recursive_binary_search(int[] data, int target, int start, int end) {
       // edge case and base condition
        if (start >= end) {
            return -1;
        }
        else {
            //Find the middle of the array
            int mid = start + (end - start) / 2;

            //if the element is smaller than mid, then it can only be present in left subarray
            if (target < data[mid]){
                return recursive_binary_search(data, target, start, mid - 1);
            }
            // if element greater than mid, then it can be present in right subarray
            else if (target > data[mid]) {
                return recursive_binary_search(data, target, mid+1, end);
            }
            else {
                // if the element is present at the middle itself
                return mid;
            }
        }
    }

    // Test Method
    public static void verify(int result) {
        System.out.println("Target found at: " + result);
    }

}
