package com.chinex.boroja.quiz.triangle;

import com.chinex.boroja.oop.inheritance.GeometricObject;

/**  Design a class named Triangle that extends GeometricObject. The class contains:
 ■ Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
 ■ A no-arg constructor that creates a default triangle.
 ■ A constructor that creates a triangle with the specified side1, side2, and side3.
 ■ The accessor methods for all three data fields.
 ■ A method named getArea() that returns the area of this triangle.
 ■ A method named getPerimeter() that returns the perimeter of this triangle.
 ■ A method named toString() that returns a string description for the triangle.

 The toString() method is implemented as follows:
 return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;

 -----------------------------------------------------------------------------------------
 Created by: IHEDIOHA Chinedu Innocent
 Date Created: 7th, March 2023
 */


public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double side = (side1 + side2 + side3) / 2;
        return Math.sqrt(side * (side - side1) * side *(side - side1) * side * (side - side1));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;

    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
