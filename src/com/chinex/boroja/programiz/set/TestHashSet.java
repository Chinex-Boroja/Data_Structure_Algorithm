package com.chinex.boroja.programiz.set;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("Abuja");
        set1.add("Beijing");

//        for (String s: set1) {
//            System.out.print(s.toUpperCase() + " ");
//        }
        System.out.println("Set1 is " + set1);
        System.out.println(set1.size() + " elements in set1");

        //Delete a string from set1
        set1.remove("Abuja");
        System.out.println("\nSet1 is " + set1);
        System.out.println(set1.size() + " elements in set1");

        Set<String> set2 = new HashSet<>();
        set2.add("London");
        set2.add("Paris");
        set2.add("Shanghai");
        System.out.println("\nset2 is " + set2);
        System.out.println(set2.size() + " elements in set2");

        System.out.println("\nIs Tunis in set? " + set2.contains("Tunis"));

        set1.addAll(set2);
        System.out.println("\nAfter adding set2 to set1, set1 is " + set1);

        set1.removeAll(set2);
        System.out.println("\nAfter removing set2 from set1, set1 is " + set1);

        set1.retainAll(set2);
        System.out.println("\nAfter removing common elements in set2 " +
                "from set1, set1 is " + set1);

    }
}
