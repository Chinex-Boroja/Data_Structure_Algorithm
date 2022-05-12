package com.chinex.boroja.problems;

import java.util.Arrays;

public class SquaresOfSortedArrays {

    public static int[] sortedSquares(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        int[] array = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(array)));

    }
}
