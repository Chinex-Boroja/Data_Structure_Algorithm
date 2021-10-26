package com.chinex.boroja;

public class EvenNumbers {

    /** This is a method that takes an array of integers and checks the length
     * of the numbers and returns the numbers that are even
     *
     * @param nums which is an array of integers to check for numbers that even
     * @return evenNumber_count
     */
    static int checkEvenNumbers(int[] nums) {
        int evenNumber_count = 0;

        for (int num : nums) {
            int length = String.valueOf(num).length();

            //Check if the length of an integer is divisible by 2,
            // increment the count and check for the next integer
            if (length % 2 == 0)
                evenNumber_count++;
        }
        //return the integers that are even
        return evenNumber_count;
    }

    /*
     * main method
     */
    public static void main(String[] args) {

        //Declare and Initialize an array with numbers
        int[] arrayOfNumbers = new int[]{90, 453, 1, 7894, 900023, 22, 2456};

        //Display even numbers
        System.out.println("The numbers that are even are " + checkEvenNumbers(arrayOfNumbers));
    }
}
