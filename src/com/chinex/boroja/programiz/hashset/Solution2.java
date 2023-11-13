package com.chinex.boroja.programiz.hashset;

import java.util.HashSet;

public class Solution2 {

    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
    }
    public static boolean digitCount(String num) {
        HashSet<Character> uniqueDigits = new HashSet<>();
        for (char ch: num.toCharArray()) {
            if (ch < '0' || ch > '9') {
                return false; // Check if the character is a valid digit
            }
            uniqueDigits.add(ch);
        }

        for (char ch: uniqueDigits) {
            int count = 0;
            for (char digitChar :num.toCharArray()) {
                if (digitChar == ch) {
                    count++;
                }
            }
            if (count != Character.getNumericValue(ch)) {
                return false;
            }
        }
        return true;
    }
}
