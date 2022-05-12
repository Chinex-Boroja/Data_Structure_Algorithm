package com.chinex.boroja.arrays;

public class Main {

    public static void main(String[] args) {
        Array numbers = new Array(5);
        numbers.insert(9);
        numbers.insert(3);
        numbers.insert(2);
        numbers.insert(12);
        numbers.insert(21);
        numbers.insert(14);
        numbers.removeAt(5);
        System.out.println(numbers.indexOf(2));
        //numbers.print();
    }
}
