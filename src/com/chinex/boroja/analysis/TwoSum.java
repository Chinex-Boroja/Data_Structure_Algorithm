package com.chinex.boroja.analysis;

public class TwoSum {
    private static final long startTime = System.currentTimeMillis();
    public static void findTwoSum(int arr[], int n) {
        boolean found = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == 0) {
                    System.out.print(arr[i]);
                    System.out.print(" ");
                    System.out.print(arr[j]);
                    System.out.print("\n");
                    found = true;
                }
            }
        }
        if (!found)
            System.out.println("not existing");
        long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
    }
    //main entry of the program
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1, 6, -6,};
        int n = arr.length;
        findTwoSum(arr, n);
    }

}
