package com.chinex.boroja.leetcode.easy;

import java.util.Arrays;

public class LongestPrefix {

    public String longestCommonPrefix(String[] arr) {

        if (arr.length == 0) {
            return "";
        }
//        Arrays.sort(arr);
        // take temp_prefix string and assign first element of arr
        String output = arr[0];

        // iterate the rest of element in string
        for (int i = 1; i  < arr.length;  i++) {
            // .indexOf() return index of that substring from string.
            while (arr[i].indexOf(output) != 0 ) {

                // update matched substring prefix
                output = output.substring(0, output.length() - 1);

                // check for empty case. direct return if true
                if (output.isEmpty())
                    return "";
            }
        }

        return output;
    }

    public static void main(String[] args) {
        LongestPrefix gfg = new LongestPrefix();
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println("The longest common prefix is: " + gfg.longestCommonPrefix(input));

    }

}

class HelloWorld {
    public static void main(String args[]) {
        String[] arr = {"mint", "mini", "mineral"};
        int size = arr.length;
        // The longest common prefix of an empty array is "".
        if (size == 0){
            System.out.println("Longest common prefix: ");
        }
        // The longest common prefix of an array containing
        // only one element is that element itself.
        else if (size == 1){
            System.out.println("Longest common prefix: " + arr[0]);
        }
        else{
            // Sort the array
            Arrays.sort(arr);
            int length = arr[0].length();
            StringBuilder res = new StringBuilder();
            // Comapre the first and the last strings character
            // by character.
            for(int i = 0; i < length; i++){
                // If the characters match, append the character to the result.
                if(arr[0].charAt(i) == arr[size - 1].charAt(i)){
                    res.append(arr[0].charAt(i));
                }
                // Else, stop the comparison.
                else{
                    break;
                }
            }
            String result = res.toString();
            System.out.println("Longest common prefix: " + result);
        }
    }
}
