package com.chinex.boroja.recursion;

public class CallStack {
    public static void main(String[] args) {

        int fourFactorial = iterativeFactorial(0);
        System.out.println(fourFactorial);

        int recursiveSolution = recursiveFactorial(6);
        System.out.println(recursiveSolution);
    }

    public static int iterativeFactorial(int number) {

        int result = 1;
        while (number > 0) {
            result = result * number;
            number--;
        }

        return result;
    }

    public static int recursiveFactorial(int number) {
        if (number > 0) {
            System.out.println("Execution context: " + number);

            return  number * recursiveFactorial(number - 1);
        }
        else
            return 1;
    }

//    public static int[] add(int[] list) {
//        if (list.length != 0) {
//
//            return add(list[0] + list.length-1);
//
//        }
//
//        return 0;
//    }
}
