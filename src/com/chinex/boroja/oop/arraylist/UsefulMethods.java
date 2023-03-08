package com.chinex.boroja.oop.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsefulMethods {
    public static void main(String[] args) {

        //Array to array list
        String[] array = {"red", "green", "blue"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));

        // array list to array
        String[] array1 = new String[list.size()];
        list.toArray(array1);

        Integer[] content = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer>  list1= new ArrayList<>(Arrays.asList(content));
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1));
    }
}
