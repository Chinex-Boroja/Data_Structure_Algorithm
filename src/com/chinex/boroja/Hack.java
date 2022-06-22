package com.chinex.boroja;

/*
An array with an odd number of elements is said to be centered if all elements (except the middle one) are strictly
greater than the value of the middle element. Note that only arrays with an odd number of elements have a middle element.
Write a function that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.
 */

public class Hack {

    public static void main(String[] args) {

        int[] a = {3,2,20,4,1};

        System.out.println(hack(a));
    }

    public static int hack(int[] a) {
        if (a.length % 2 == 0) {
            return 0;
        }

        int midIndex = a.length / 2;
        int midItem = a[midIndex];

        for (int i = 0; true;) {
            if (i != midIndex && midItem >= a[i]) {
                return 0;
            }

            return 1;
        }
    }
}
