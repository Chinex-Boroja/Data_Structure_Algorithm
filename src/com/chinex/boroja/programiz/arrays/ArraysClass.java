package com.chinex.boroja.programiz.arrays;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        double[] numbers = {9, 9.2, 10, 2, 4, 6, 8, 5, 89, 4, 3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        java.util.Arrays.sort(chars, 1, 4);
        System.out.println(chars);

        //Check equality of an array
        int[] list1 = {1, 2, 3, 4};
        int[] list2 = {1, 2, 3, 4};
        int[] list3 = {4, 2, 3, 4};

        System.out.println(Arrays.equals(list1, list2));
        System.out.println(Arrays.equals(list2, list3));

        //Fill up an array
        int[] list4 = {1, 2, 4, 3, 6};
        int[] list5 = {7, 8, 9, 10, 6, 6};
        Arrays.fill(list4, 5);
        Arrays.fill(list5, 1, 5, 8);

        System.out.println(Arrays.toString(list4));
        System.out.println(Arrays.toString(list5));

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
