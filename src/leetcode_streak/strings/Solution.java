package leetcode_streak.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubString1("pwwkew"));
    }

    public static int lengthOfLongestSubString(String string) {

        // create variable count to store the length of the substring
        // iterate through the first loop
        // iterate the second loop
        // check if charAt(i) not equals to charAt(i + 1), increment count
        // return length of the substring

        int maxLength = 0;

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length() ; j++) {
                if (allUnique(string, i, j))
                    maxLength = Math.max(maxLength, j - i);
            }
        }
        return maxLength;

    }

    public static boolean allUnique(String s, int start, int end) {
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j < end ; j++) {
                if (s.charAt(i) == s.charAt(j))
                    return false;
            }

        }

        return true;
    }

    public static int lengthOfLongestSubString1(String string) {

        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;

        for (int i = 0; i < string.length(); i++) {
            if (!charMap.containsKey(string.charAt(i)) || charMap.get(string.charAt(i)) < left) {
                charMap.put(string.charAt(i), i);
                maxLength = Math.max(maxLength, i - left + 1);
            }
            else {
                left = charMap.get(string.charAt(i)) + 1;
                charMap.put(string.charAt(i), i);
            }

        }

        return maxLength;
    }

}
