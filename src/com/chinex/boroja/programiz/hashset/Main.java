package com.chinex.boroja.programiz.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> evenNumber = new HashSet<>();

        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("Hashset: " + evenNumber);

        // using addAll() method
        HashSet<Integer> numbers = new HashSet<>(evenNumber);
        numbers.add(8);
        System.out.println("New Hashset: " + numbers);

        // Using Iterator method to access elements
        Iterator<Integer> iterate = numbers.iterator();
        System.out.println("Hashset using Iterator: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        System.out.println();

        // Removing element from a Hashset
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);

        // union of sets
        HashSet<Integer> evenIntegers = new HashSet<>();
        evenIntegers.add(4);
        evenIntegers.add(2);
        evenIntegers.add(8);
        evenIntegers.add(10);
        evenIntegers.add(12);
        System.out.println("Hashset1: " + evenIntegers);

        HashSet<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(5);
        integers.add(7);
        System.out.println("Hashset2: " + integers);

        // Union of two set
        integers.addAll(evenIntegers);
        System.out.println("Union of the two sets is: " + integers);

        // intersection of two sets
        integers.retainAll(evenIntegers); //Specifically for prime numbers
        System.out.println("Intersection is: " + integers);

        // checking for difference
        evenIntegers.removeAll(integers);
        // Subset of another set
        boolean result = evenIntegers.containsAll(integers);
        System.out.println("Is Hashset2 the subset of Hashset1? " + result);
    }
}
