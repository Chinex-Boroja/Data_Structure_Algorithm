package com.chinex.boroja.oop.inheritance;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Display circle amd rectangle properties
        displayObject(new CircleObject("red", true, 1));

        displayObject(new RectangleObject("black", true, 1, 2));

    }

    public static void displayObject(GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}
