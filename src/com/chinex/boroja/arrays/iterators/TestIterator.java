package com.chinex.boroja.arrays.iterators;

import java.util.ArrayList;
import java.util.Collection;

public class TestIterator {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        for (String iterator : collection) {
            System.out.println(iterator.toUpperCase() + " ");
        }
        System.out.println();
    }
}
