package com.chinex.boroja.programiz.arrays;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number of items: ");
//        int n = input.nextInt();
//        double[] numbers = new double[n];
//
//        System.out.print("Enter the numbers: ");
//        for (int i = 0; i < n; i++) {
//            numbers[i] = input.nextDouble();
//            sum += numbers[i];
//        }
        double[] numbers = {79.0, 20.12, 30.5, 45.2, 1.0, 5.0, 60.9, 90.3, 56.0, 51.0, 15.3, 16.3, 71.8};
        double sum = 0;
        double average;
        int count = 0;

        for (double number : numbers) {
            sum += number;
        }

        average = sum / numbers.length;
        for (double number : numbers) {
            if (number > average) count++;
        }
        System.out.println(average);
        System.out.println(count);

    }

}