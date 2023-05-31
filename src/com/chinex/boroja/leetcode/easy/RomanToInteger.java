package com.chinex.boroja.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String inputRomanSymbol = "XXX";
        System.out.println("The decimal number equivalent of the Roman symbol " + inputRomanSymbol + " is: " + romanToDecimal(inputRomanSymbol));
    }

    /* Function to return the Int value of a Roman symbol */
   public static int getRomanValue(char rom) {
        if (rom == 'I')
            return 1;
        if (rom == 'V')
            return 5;
        if (rom == 'X')
            return 10;
        if (rom == 'L')
            return 50;
        if (rom == 'C')
            return 100;
        if (rom == 'D')
            return 500;
        if (rom == 'M')
            return 1000;

        return -1;
    }

    /* Function to return the int value of given of a Roman figure */
    public static int romanToDecimal(String strValue) {

        // Initial sum to zero
        int sum = 0;

        for (int i = 0; i < strValue.length(); i++) {
            int firstSymbol = getRomanValue(strValue.charAt(i));
            // Get the value of the next symbol
            if (i + 1 < strValue.length()) {
                int secondSymbol = getRomanValue(strValue.charAt(i + 1));

                if (firstSymbol >= secondSymbol)
                    sum += firstSymbol;
                else
                    sum -= firstSymbol;
            }
            else
                sum += firstSymbol;
        }

        return sum;
    }
}

class Solution {
    public int romanToInt(String s) {

        if (s.length() < 1) {
            return -1;
        }

        Map<Character, Integer> map = new HashMap<>();

        int sum = 0;

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");

        for (int i = 0; i < s.length(); i++) {
            sum += map.get(s.charAt(i));
        }

        return sum;
    }
}
