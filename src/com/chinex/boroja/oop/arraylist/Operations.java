package com.chinex.boroja.oop.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(8);
        list.add(5);
        list.add(89);
        sort(list);
        System.out.println(list);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}
/*
* import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Prompt the user to enter 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            list.add(num);
        }

        // Sort the list in increasing order
        sort(list);

        // Display the sorted list
        System.out.println("Sorted list:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    // Sorts an ArrayList of integers in increasing order
    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}

*
* import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        // Prompt the user to enter 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            double num = input.nextDouble();
            list.add(num);
        }

        // Get the sum of the numbers in the list
        double sum = sum(list);

        // Display the sum to the user
        System.out.println("The sum of the numbers is: " + sum);
    }

    // Returns the sum of all numbers in an ArrayList of doubles
    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (double num : list) {
            sum += num;
        }
        return sum;
    }
}

*
* import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Prompt the user to enter 10 integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            list.add(num);
        }

        // Remove duplicates from the list
        removeDuplicate(list);

        // Display the distinct integers
        System.out.println("The distinct integers are:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    // Removes duplicate elements from an ArrayList of integers
    public static void removeDuplicate(ArrayList<Integer> list) {
        // Create a new ArrayList to store the distinct elements
        ArrayList<Integer> distinctList = new ArrayList<>();

        // Iterate over the elements of the original list
        for (int num : list) {
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

* Write a method that returns the union of two array lists of
integers using the following header:
public static ArrayList<Integer> union(
 ArrayList<Integer> list1, ArrayList<Integer> list2)
* */