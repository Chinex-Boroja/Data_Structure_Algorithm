package com.chinex.boroja.problems;

/**
 * Created by Chinedu Ihedioha
 * Date: 02-02-2023
 */
public class Addition {
    public static int addNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int sum = (firstNumber + secondNumber + thirdNumber) % 2;
        return sum == 0 ? sum + 1 : sum;
    }
    public static void main(String[] args) {
        System.out.println(addNumbers(1, 4, 2));
    }
}



/**
 * This method takes three integers as input (a, b, and c) and adds them together using the + operator.
 * The result of the addition is then taken modulo 2, which means that the result will be either 0 or 1.
 * The value of result is then checked against 0. If result is 0,it is incremented by 1, so that the final result is 1.
 * Otherwise, result is returned as it is, since it already is 1.
 */
