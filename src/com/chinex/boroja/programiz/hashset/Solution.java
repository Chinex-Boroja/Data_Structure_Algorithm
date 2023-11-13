package com.chinex.boroja.programiz.hashset;

// Check if Number Has Equal Digit Count and Digit Value

import java.util.HashMap;
import java.util.Map;

/**
 * You are given a 0-indexed string num of length n consisting of digits.
 * Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num,
 * otherwise return false.
 */

public class Solution {

    public static boolean digitCount(String num) {

        // Get the length of the input string and assign it to the variable n
        int lengthOfString = num.length();

        // map will have characters as keys and integers as values
        // It will be used to store count of each character
        HashMap<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < lengthOfString; i++) {
            char charAtIndex = num.charAt(i); // retrieve characters at each index from num
            // update the count of characters in counter. if charAtIndex is already in the map
            // Increment by 1. If not, it sets the count to 1
            counter.put(charAtIndex, counter.getOrDefault(charAtIndex, 0) + 1);
        }

        // iterate the through the chars of string
        for (int i = 0; i < lengthOfString; i++) {
            char ch = (char) (i + '0'); // convert i to its character value in char
            // get the count of ch from counter, if ch is not in the map, return 0
            // and convert the character at index i to its corresponding integer value
            if (counter.getOrDefault(ch,0) != Character.getNumericValue(num.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
    }
}
