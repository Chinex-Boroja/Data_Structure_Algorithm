package com.chinex.boroja.problems;

public class TestPassByValue {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before invoking the swap method, num1 is " +
                 num1 + " and num2 is " + num2);
        swap(num1, num2);

        System.out.println("After invoking the swap method, num1 is " +
                num1 + " and num2 is " + num2);

        int max = 0;
        max(1, 2, max);
        System.out.println(max);

        int i = 1;
        while (i <= 6) {
            checkMethod(i, 2);
            i++;
        }
    }

    public static void swap(int num1, int num2) {
        System.out.println("\tInside the swap method");
        System.out.println("\t\tBefore swapping num1 is " + num1 + " and num2 is " + num2);

        //Swap the two numbers
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\t\tAfter swapping num1 is " + num1 + " and num2 is " + num2);

    }

    public static void max(int value1, int value2, int max) {
        if (value1 > value2)
            max = value1;
        else
            max = value2;

        System.out.println(max);
    }

    public static void checkMethod(int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }

}
