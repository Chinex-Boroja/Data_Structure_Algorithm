package com.chinex.boroja.programiz.arrays;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        //Copy arrays using assignment(Shallow copy) operator

        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] positiveNumbers = numbers;

        for (int positiveNumber : positiveNumbers) {
            System.out.print(positiveNumber + ", ");
        }
        System.out.println();

        int[] source = {7, 8, 9, 10, 11, 12};
        int[] destination = new int[6];

        // iterate and copy elements from source to destination
        for (int i = 0; i < source.length; i++) {
            destination[3] = 4;
            destination[i] = source[i];
        }
        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(destination));

        // Using arraycopy()
        String[] sourceArray = {"Chisom", "Chinedu", "Oge"};
        String[] destinationArray = new String[3];

        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
        System.out.println(Arrays.toString(destinationArray));

        int[] num1 = {2, 3, 12, 4, 12, -2};
        int[] num3 = new int[5];

        int[] num2 = new int[num1.length];
        System.arraycopy(num1, 0, num2, 0, num1.length);
        System.out.println("num2 = " + Arrays.toString(num2));

        //Copying elements from index 2 on num1 array
        //copying elements to index 1 of num3 array
        // 2 elements will be copied
        System.arraycopy(num1, 2, num3, 1, 2);
        System.out.println("num3 = " + Arrays.toString(num3));

        //Copy Range method
        int[] source1 = {2, 3, 12, 4, 12, -2};
        int[] destination1 = Arrays.copyOfRange(source1, 0, source1.length);
        System.out.println("Destination 1 = " + Arrays.toString(destination1));

        int[] destination2 = Arrays.copyOfRange(source1, 2, 5);
        System.out.println("Destination 2 = " + Arrays.toString(destination2));

        // Copying 2D arrays using loop
        int[][] source3 = {{1, 2, 4, 4}, {5, 6}, {0, 2, 42, -4, 5}};

        int[][] destination3 = new int[source3.length][];

        for (int i = 0; i < destination3.length; i++) {
            //Allocating space for each row of destination array
            destination3[i] = new int[source3[i].length];

            for (int j = 0; j < destination3[i].length; j++) {
                destination3[i][j] = source3[i][j];

            }
        }
        System.out.println("Destination 3 = " + Arrays.deepToString(destination3));

        int[][] test = {{0, 6, 2, 1}, {2, 6, 8, 9}, {5, 2, 5, 8}};

        int[][] testDestination = new int[test.length][];
        for (int i = 0; i < testDestination.length; i++) {
            testDestination[i] = new int[test[i].length];

            System.arraycopy(test[i], 0, testDestination[i], 0, testDestination[i].length);
        }
        System.out.println("Test destination = " + Arrays.deepToString(testDestination));

    }

}
