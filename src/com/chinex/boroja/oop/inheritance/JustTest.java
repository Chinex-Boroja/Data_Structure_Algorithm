package com.chinex.boroja.oop.inheritance;

import com.chinex.boroja.oop.encapsulation.Loan;

public class JustTest {
    private double radius;
    public JustTest(double radius) {
        radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
class B extends JustTest {
    private double length;
    B(double radius, double length) {
        super(radius);
        length = length;
    }
    @Override
    public double getArea() {
        return getArea() * length;
    }
}

class Test {
    public static void main(String[] args) {
        Integer[] list1 = {12, 24, 55, 1};
        Double[] list2 = {12.4, 24.0, 55.2, 1.0};
        Long[] list3 = {1L, 2L, 3L};

        printArray(list1);
        printArray(list2);
        printArray(list3);

        new Person().printPerson();
        new Student().printPerson();
    }

    public static void printArray(Object[] list) {
        for (Object lists: list) {
            System.out.println(lists + " ");
        }
        System.out.println();
    }
}

class Student extends Person {
    @Override
    public String getInfo() {
        return "Student";
    }
}
class Person {
    public String getInfo() {
        return "Person";
    }
    public void printPerson() {
        System.out.println(getInfo());
    }
}
