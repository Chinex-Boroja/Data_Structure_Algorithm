package com.chinex.boroja.oop;

import com.chinex.boroja.oop.encapsulation.CircleWithPrivateDataFields;

/** Passing Objects to Methods */
public class Test {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
        printCircle(myCircle);
    }
    public static void printCircle(CircleWithPrivateDataFields c) {
        System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
    }
}
