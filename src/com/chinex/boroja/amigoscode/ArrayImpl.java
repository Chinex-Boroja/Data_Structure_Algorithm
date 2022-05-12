package com.chinex.boroja.amigoscode;

import java.util.Arrays;

public class ArrayImpl {

    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "yellow";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[2]);

        int[] numbers = {600, 67};

        //loop through the array
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        //loop in reverse order
        for (int i = colors.length - 1; i >= 0 ; i--) {
            System.out.println(colors[i]);
        }

        //Enhanced for loop
        for (String color : colors) {
            System.out.println(color);
        }

        //method reference
        Arrays.stream(colors).forEach(System.out::println);
    }
}
