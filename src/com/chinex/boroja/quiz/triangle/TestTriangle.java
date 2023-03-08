package com.chinex.boroja.quiz.triangle;

import com.chinex.boroja.quiz.triangle.Triangle;

import java.util.Scanner;

public class TestTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter side1 pls: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2 pls: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3 pls: ");
        double side3 = input.nextDouble();

        System.out.print("Enter Color of the triangle: ");
        String color = input.next();

        System.out.print("is the triangle filled (True or False): ");
        boolean isFilled = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setFilled(isFilled);
        triangle.setColor(color);

        System.out.println("The area of the triangle is: " + triangle.getArea());
        System.out.println("The perimeter of the triangle is: " + triangle.getPerimeter());
        System.out.println("Is the triangle filled?: " + triangle.isFilled());
        System.out.println("The color of the triangle is: " + triangle.getColor());


    }
}
