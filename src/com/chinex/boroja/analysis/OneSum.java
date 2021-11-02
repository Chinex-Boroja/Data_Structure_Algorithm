package com.chinex.boroja.analysis;

public class OneSum {
    private static final long startTime = System.currentTimeMillis();

    //Prints all triplets in arr[]  with 0 sum
    public static void findOneSum(int[] arr, int n) {
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                System.out.print(arr[i]);
                System.out.print("\n");
                found = true;
            }
        }
        //if no sum of 0 sum was found in the array, then:
        if (!found)
            System.out.println("not existing");
        long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
    }
    public static void main(String[] args) {
        int[] arr = {0, -1, 1, 2, -3};
        int n = arr.length;
        findOneSum(arr, n);
    }
}
