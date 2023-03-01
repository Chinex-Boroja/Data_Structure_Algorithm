package com.chinex.boroja.problems;

/** A Program to print a 9x multiplication table */
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("            Multiplication Table");

        // Display the number title
        System.out.print("    ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("   " + i);
        }
        System.out.println("\n———————————————————————————————————————");

        // Display table body
        for (int i = 1; i <=9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <=9 ; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();

        }

    }
}
