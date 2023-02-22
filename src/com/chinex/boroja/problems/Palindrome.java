package com.chinex.boroja.problems;

public class Palindrome {
    public static void main(String[] args) {
        checkPalindrome("neen");
        displayPrimeNumbers();
    }

    public static void checkPalindrome(String word) {
        int low = 0;
        int high = word.length() - 1;

        boolean isPalindrome = true;
        while (low < high) {
            if (word.charAt(low) != word.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        if (isPalindrome) {
            System.out.println(word +  " is a palindrome");
        }
        else {
            System.out.println(word + " is not a palindrome");
        }
    }

    public static void displayPrimeNumbers() {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int initialNumber = 2;

        System.out.println("The first 50 prime numbers are \n");


        while (count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= initialNumber / 2; divisor++) {
                if (initialNumber % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println(initialNumber);
                }
                else {
                    System.out.print(initialNumber + " ");
                }

            }
            initialNumber++;

        }
    }
}
