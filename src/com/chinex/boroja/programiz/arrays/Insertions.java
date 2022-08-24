package com.chinex.boroja.programiz.arrays;

public class Insertions {
    public static void main(String[] args) {

        int[] arr = {18, 30, 15, 70, 12};
        int n = 5;
        System.out.println("Array elements before insertion\n");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\n");

        int x = 50;
        int position = 4;
        n++;

        for (int i = n - 1; i >= position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position - 1] = x;
        System.out.println("Array element after insertion\n");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\n");

    }
}
