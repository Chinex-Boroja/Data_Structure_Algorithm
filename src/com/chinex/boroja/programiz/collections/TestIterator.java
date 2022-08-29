package com.chinex.boroja.programiz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Chinex");
        collection.add("Chisom");
        collection.add("Kunle");
        collection.add("Oge");

        System.out.println("____________");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toUpperCase() + " ");
        }
//        for (String s : collection) {
//            System.out.println(s.toUpperCase() + " ");
//        }
        System.out.println("____________");
    }
}
