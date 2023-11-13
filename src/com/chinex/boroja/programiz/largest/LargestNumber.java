package com.chinex.boroja.programiz.largest;

public class LargestNumber {
    public static void main(String[] args) {
        int largest = findLargest(11, 10, 12);

        System.out.println("The largest of the three numbers is: " + largest);
    }

    public static int findLargest(int num1, int num2, int num3) {

        if (num1 > num2) {
            if (num1 > num3) {
                return num1;
            }
            else {
                return num3;
            }
        }
        else
            if (num2 > num3 ) {
                return num2;
            }
            else
                return num3;
    }
}
