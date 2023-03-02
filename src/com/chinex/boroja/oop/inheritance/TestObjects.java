package com.chinex.boroja.oop.inheritance;

public class TestObjects {
    public static void main(String[] args) {
        CircleObject circleObject = new CircleObject(1);
        System.out.println("A circle " + circleObject);
        System.out.println("The color is " + circleObject.getColor());
        System.out.println("The radius " + circleObject.getRadius());
        System.out.println("The area is " + circleObject.getArea());
        System.out.println("The diameter is " + circleObject.getDiameter());

        RectangleObject rectangleObject = new RectangleObject(2, 4);
        System.out.println("A rectangular " + rectangleObject);
        System.out.println("The area is " + rectangleObject.getArea());
        System.out.println("The perimeter is  " + rectangleObject.getPerimeter());

    }
}
