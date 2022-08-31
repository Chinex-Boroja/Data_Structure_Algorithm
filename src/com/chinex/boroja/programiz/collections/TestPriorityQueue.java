package com.chinex.boroja.programiz.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.offer("Aba");
        queue1.offer("Umuahia");
        queue1.offer("Uyo");
        queue1.offer("Asaba");

        System.out.println("Priority queue using Comparable");
        while (queue1.size() > 0)
            System.out.print(queue1.remove() + " ");

        PriorityQueue<String> queue2 = new PriorityQueue<>(4, Collections.reverseOrder());
        queue2.offer("Aba");
        queue2.offer("Umuahia");
        queue2.offer("Uyo");
        queue2.offer("Asaba");

        System.out.println("\nPriority queue using Comparator: ");
        while (queue2.size() > 0)
            System.out.print(queue2.remove() + " ");
    }
}
