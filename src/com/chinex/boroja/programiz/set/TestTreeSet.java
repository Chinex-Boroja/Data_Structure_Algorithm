package com.chinex.boroja.programiz.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Chinedu");
        set.add("Water");
        set.add("Malomo");
        set.add("Ebuka");
        set.add("Kunle");
        set.add("Sensei");
        set.add("Headies");
        set.add("Malomo");

        for (String s: set) {
            System.out.println(s.toUpperCase() + " ");
        }

        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Sorted tree set: " + treeSet);

        //Use the methods in sortedSet interface
        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): " + treeSet.last());
        System.out.println("headSet(\"Kunle\"): " + treeSet.headSet("Kunle"));
        System.out.println("tailSet(\"Kunle\"): " + treeSet.tailSet("Kunle"));

        // Use the methods in NavigableSet interface
        System.out.println("lower(\"E\"): " + treeSet.lower("E"));
        System.out.println("higher(\"E\"): " + treeSet.higher("E"));
        System.out.println("floor(\"E\"): " + treeSet.floor("E"));
        System.out.println("ceiling(\"E\"): " + treeSet.ceiling("E"));
        System.out.println("pollFirst(): " + treeSet.pollFirst());
        System.out.println("pollLast(): " + treeSet.pollLast());
        System.out.println("New tree set: " + treeSet);


    }
}
