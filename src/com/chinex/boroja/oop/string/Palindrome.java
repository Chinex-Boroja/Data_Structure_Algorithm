package com.chinex.boroja.oop.string;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("Ignoring non-alphanumeric characters, \nis " + s + " a palindrome? " + isPalindrome(s));
    }

    /** Return true if a string is a palindrome */
    public static boolean isPalindrome(String string) {
        // Create a new string by eliminating non-alphanumeric chars
        String s1 = filter(string);

        // Create a new string that is the reversal of s1
        String s2 = reverse(s1);

        // Check if the reversal is the same as the original string
        return s2.equals(s1);
    }
    /** Create a new string by eliminating non-alphanumeric chars */
    public static String filter(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        // Examine each char in the string to skip alphanumeric char
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetterOrDigit(string.charAt(i))) {
                stringBuilder.append(string.charAt(i));
            }
        }
        //Return a new filtered string
        return stringBuilder.toString();
    }

    /** Create a new string by reversing a specified string */
    public static String reverse(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
