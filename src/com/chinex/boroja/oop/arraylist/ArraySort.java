package com.chinex.boroja.oop.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Enter 7 numbers");
        for (int i = 0; i < 7; i++) {
            double num = input.nextDouble();
            list.add(num);
        }

        //Get the sum of the numbers in the list
        double sum = sum(list);
        System.out.println("Sum of the numbers is: " + sum);
        // Sort the list in increasing order
//        sortIncrement(list);

        //Display the result
//        System.out.println("Sorted list");
//        for (int num : list) {
//            System.out.print(num + " ");
//        }
    }

    public static void sortIncrement(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (double num : list) {
            sum += num;
        }

        return sum;
    }


    public static void removeDuplicate(ArrayList<Integer> list) {
        // Create a new ArrayList to store the distinct elements
        ArrayList<Integer> distinctList = new ArrayList<>();

        // Iterate over the elements of the original list
        for (int num: list) {
            // If the element is not already in the distinct list, add it
            if (!distinctList.contains(num)) {
                distinctList.add(num);
            }
        }

        // Clear the original list and add the distinct elements back to it
        list.clear();
        list.addAll(distinctList);
    }
}
