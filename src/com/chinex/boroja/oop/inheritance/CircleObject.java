package com.chinex.boroja.oop.inheritance;

public class CircleObject extends GeometricObject {
    private double radius;

    public CircleObject() {

    }

    public CircleObject(double radius) {
        this.radius = radius;
    }

    public CircleObject(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + "\n radius is " + radius;
    }
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }
}
