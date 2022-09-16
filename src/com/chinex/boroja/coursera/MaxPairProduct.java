package com.chinex.boroja.coursera;


import java.util.Scanner;

public class MaxPairProduct {
    static int getMaxPairwiseProduct(int[] numbers) {
        int max_product = 0;
        int n = numbers.length;

        for (int first = 0; first < n; ++first) {
            for (int second = first + 1; second < n; ++second) {
                max_product = Math.max(max_product, numbers[first] * numbers[second]);
            }
        }
        return max_product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("____Enter the numbers pls____");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }


}
