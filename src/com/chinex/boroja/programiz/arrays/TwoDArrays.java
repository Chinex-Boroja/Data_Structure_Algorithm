package com.chinex.boroja.programiz.arrays;

import java.util.Arrays;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        int[][][] b = new int[4][3][2];
        int[][] c = {{1, 2, 3}, {4, 5, 6, 9}, {7}};

        // first for...each loop access the individual array
        // inside the 2d array
        for (int[] ints : c) {
            // second for...each loop access each element inside the row
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }

        int[][][] d = {{{1, -2, 3},{2, 3, 4}}, {{-4, -5, 6, 9}, {1}, {2,3}}};

        for (int[][] ints : d) {
            for (int j = 0; j < ints.length; j++) {
                for (int k = 0; k < d[j].length; k++) {
                    System.out.println(ints[j][k]);
                }
            }
        }
    }
}
