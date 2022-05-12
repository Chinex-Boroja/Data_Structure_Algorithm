package com.chinex.boroja.problems;

// Java program to count maximum consecutive
// 1's in a binary array.
public class CountOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0; // initialize currentCount
        int maxCount = 0; //initialize maxCount

        //if 1 is found, increment currentCount and update results if currentCount becomes more
        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            }
            //reset currentCount if zero is found
            else {
                currentCount = 0;
            }
        }
        return maxCount;
    }

    //Driver Method
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 1, 1, 1, 1, 1, 1};
        int n = array.length;
        System.out.println("The number of consecutive 1's is: " + findMaxConsecutiveOnes(array));
        System.out.println("The array is made up of " + n + " elements");
        System.out.println("end of program");

        System.out.println("hello chinedu");
    }
}