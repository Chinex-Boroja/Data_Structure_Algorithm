package com.chinex.boroja.analysis;

/**
 * A simple java program to find the three elements
 * whose sum equals zero
 */
public class ThreeSums {
    private static final long startTime = System.currentTimeMillis();

    //Prints all triplets in arr[]  with 0 sum
    public static void findTriplets(int[] arr, int n) {
        boolean found = false;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i+1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.print(arr[i]);
                        System.out.print(" ");
                        System.out.print(arr[j]);
                        System.out.print(" ");
                        System.out.print(arr[k]);
                        System.out.print("\n");
                        found = true;
                    }
                }
            }
        }
        //if no triplet of 0 sum was found in the array, then:
        if (!found)
            System.out.println("not existing");
        long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
    }
    //main entry of the program
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1, 6, -6, 0, 7, -7, 4, 5};
        int n = arr.length;
        findTriplets(arr, n);
    }
}
