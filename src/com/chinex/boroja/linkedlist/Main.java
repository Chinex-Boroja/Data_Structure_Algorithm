package com.chinex.boroja.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.addLast(10);
        list.add(90);
        list.add(45);
        list.addFirst(5);
        System.out.println(list.contains(10));
        System.out.println(list.size());
        System.out.println(list.indexOf(10));
        var array = list.toArray();
        System.out.println(Arrays.toString(array));

    }
}
