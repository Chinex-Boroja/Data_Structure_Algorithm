package com.chinex.boroja.operations;

import java.util.Arrays;
import java.util.List;

public class ArraysManipulation {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("foo", "bar", "baz");
        String[] array = list.toArray(String[]::new);

        System.out.println(list);
        System.out.println(Arrays.toString(array));

        String[] array2 = list.toArray(new String[0]);
        System.out.println(Arrays.toString(array2));

    }
}
