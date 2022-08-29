package com.chinex.boroja.programiz.collections;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("Abuja");
        collection1.add("Asaba");
        collection1.add("lagos");
        collection1.add("Enugu");
        collection1.add("Aba");

        System.out.println("List of the cities in Nigeria: " + collection1);
        System.out.println("\nIs Asaba in collection1? " + collection1.contains("Asaba"));

        collection1.remove("Asaba");
        System.out.println("\n" + collection1.size() + " cities are in collection now");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Ile-Ife");
        collection2.add("Akure");
        collection2.add("Kano");
        collection2.add("Aba");
        collection2.add("Kaduna");

        System.out.println("\nA list of cities in collection2:");
        System.out.println(collection2);

        ArrayList<String> c1 = (ArrayList<String>) (collection1.clone());
        c1.addAll(collection2);
        System.out.println("\nCities in collection1 or collection2: " + "\n" + c1);

        c1 = (ArrayList<String>) (collection1.clone());
        c1.retainAll(collection2);
        System.out.println("\nCities in collection1 and collection2: " + "\n" + c1);

        c1 = (ArrayList<String>) collection1.clone();
        c1.removeAll(collection2);
        System.out.println("\nCities in collection1, but not in 2: ");
        System.out.println(c1);

    }
}
