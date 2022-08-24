package com.chinex.boroja.leetcode.twosum;

import java.util.Arrays;

public class TwoSomeSolution {

    //Brute force
    public static int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; i < nums.length; i++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};

    }

    //Using two pointer approach
    public static int[] twoSum(int[] nums, int target) {
        int firstIndex = 0;
        int lastIndex = nums.length - 1;

        while (firstIndex < lastIndex){
            if (nums[firstIndex] + nums[lastIndex] == target) {
                int[] indices =  new int[2];
                indices[0] = firstIndex;
                indices[1] = lastIndex;
                return indices;
                //return new int[] {nums[firstIndex], nums[lastIndex]};
            } else if (nums[firstIndex] + nums[lastIndex] < target) {
                firstIndex++;
            } else {
                lastIndex--;
            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] indices = twoSumBrute(new int[]{2, 7, 11, 15, 8}, 10);
        if (indices.length == 2 ) {
            int[] index = new int[]{indices[0] + indices[1]};
            System.out.println(Arrays.toString(index));
        }
//        System.out.println(Arrays.toString(twoSumBrute(new int[]{2, 7, 11, 15, 8}, 10)));
    }
}
