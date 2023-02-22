package com.chinex.boroja.problems;

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

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(i * j); // Executed 45 times
            }
        }

        for (int i = 1; i < 5; i++) {
            int j = 0;
            while (j < i) {
                System.out.print(j + " ");
                j++;
            }
        }
    }
}
