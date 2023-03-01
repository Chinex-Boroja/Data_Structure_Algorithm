package com.chinex.boroja.problems;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
    static int[][] matrix = {
            {8, 4, 5, 2, 0},
            {9, 3, 2, 1, 7},
            {2, 13, 6, 9, 43},
            {6, 2, 3, 4, 1},
            {3, 5, 0, 6, 4}
    };

    public static void main(String[] args) {
        int[][] matrix = getArray();

        //Display the sum of elements
        System.out.println("\nSum of all elements is " + sumAllElements(matrix));
    }

    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);
        int[][] matrix1 = new int[5][5];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix1[row][column] = input.nextInt();
            }
        }
        return matrix1;
    }

    public static int sumAllElements(int[][] matrix) {
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }
       return total;
    }

    public static void largestSum() {
        int maxRow = 0;
        int indexOfMaxRow = 0;

        // get the sum of the first row in maxRow
        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        }

        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                totalOfThisRow += matrix[row][column];
            }
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum " + maxRow);
    }
}
