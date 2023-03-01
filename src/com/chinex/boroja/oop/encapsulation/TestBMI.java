package com.chinex.boroja.oop.encapsulation;

public class TestBMI {
    public static void main(String[] args) {
        BMI bmi = new BMI("Chinedu", 18, 145, 70);
        System.out.println("The BMI for " + bmi.getName() + " is " + bmi.getBMI() + " " + bmi.getStatus());

        BMI bmi1 = new BMI("Peter", 215, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());

    }
}
