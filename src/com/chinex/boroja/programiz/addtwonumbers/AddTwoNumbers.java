package com.chinex.boroja.programiz.addtwonumbers;

public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println(addTwoNumbers(8, 9));

        System.out.println("The largest of the three numbers is: " + findLargestOfThreeNumbers(11, 10, 16));
    }
    public static int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }
    public static int findLargestOfThreeNumbers(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        }
        else {
            return num3;
        }
    }
}

