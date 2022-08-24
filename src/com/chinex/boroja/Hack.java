package com.chinex.boroja;

/*
An array with an odd number of elements is said to be centered if all elements (except the middle one) are strictly
greater than the value of the middle element. Note that only arrays with an odd number of elements have a middle element.
Write a function that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.
 */
public class Hack {
    public static int hack(int[] arr) {

        if (arr.length % 2 == 0) {
            return 0;
        }

        int firstElement = 0;
        int lastElement = arr.length - 1;
        int mid = (firstElement + lastElement) / 2;

//        System.out.println(arr[mid]);

        for (int i = 0; i < arr.length; i++) {
            if (i != mid && arr[i] <= arr[mid]) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {

        int[] a = {10};
        System.out.println(hack(a));
    }
}