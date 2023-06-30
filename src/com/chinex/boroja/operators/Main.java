package com.chinex.boroja.operators;

public class Main {
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 6;

        int bitOpe = value1 & value2;

        System.out.println(bitOpe);

        String string = "Hello";
        boolean stringValue = (string instanceof String);
        System.out.println(stringValue);
    }
}
