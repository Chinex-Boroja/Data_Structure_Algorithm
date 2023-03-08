package com.chinex.boroja.oop.casting;

import com.chinex.boroja.oop.inheritance.CircleObject;
import com.chinex.boroja.oop.inheritance.RectangleObject;

public class CastingDemo {
    public static void main(String[] args) {
        // Create and initialize two objects
        Object object1 = new CircleObject(3);
        Object object2 = new RectangleObject(5, 4);

        displayObject(object1);
        displayObject(object2);
    }

    /** A method for displaying an object */
    public static void displayObject(Object object) {
        if (object instanceof CircleObject) {
            System.out.println("Circle area is " + ((CircleObject)object).getArea());
            System.out.println("Circle diameter is " + ((CircleObject)object).getDiameter());
        }
        else if (object instanceof RectangleObject) {
            System.out.println("The rectangle area is " + ((RectangleObject)object).getArea());
        }
    }
}
