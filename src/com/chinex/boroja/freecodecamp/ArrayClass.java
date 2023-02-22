package com.chinex.boroja.freecodecamp;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.fill(numbers, 1, 5, 7);
        System.out.println(Arrays.toString(numbers));

        Arrays.parallelSort(numbers);
        System.out.println(Arrays.toString(numbers));

        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        Arrays.sort(chars, 1, 4);
        System.out.println(chars);

        String[] strings = {"Chinedu", "Ihedioha", "Innocent"};

//        ArrayClass.main(strings);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }
}
