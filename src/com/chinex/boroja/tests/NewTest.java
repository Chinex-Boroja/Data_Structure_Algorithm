package com.chinex.boroja.tests;

public class NewTest {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

    public static String reverseString(String inputString) {

        String reversedString = "";

//        for (int i = 0; i < inputString.length(); i++) {
//            reversedString = inputString.charAt(i) + reversedString;
//        }

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + inputString.charAt(i);
        }
        return reversedString;
    }

}

// First Iteration:
// originalStr.charAt(i) (at index 0): 'H'
//reversedStr (before): ""
//originalStr.charAt(i) + reversedStr: "H" + "" = "H"
//reversedStr (after): "H"

//Second Iteration:
//originalStr.charAt(i) (at index 1): 'e'
//reversedStr (before): "H"
//originalStr.charAt(i) + reversedStr: "e" + "H" = "eH"
//reversedStr (after): "eH"