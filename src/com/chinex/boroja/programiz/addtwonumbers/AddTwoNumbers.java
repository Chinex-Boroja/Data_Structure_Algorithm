package com.chinex.boroja.programiz.addtwonumbers;

public class AddTwoNumbers {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        AddTwoNumbers demo = new AddTwoNumbers();
        System.out.println(demo.findSumOfNaturalNum(99999));
        System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " millisecs.");

        System.out.println(demo.addTwoNumbers(8, 9));

        System.out.println("The largest of the three numbers is: " + demo.findLargestOfThreeNumbers(11, 10, 16));
        System.out.println("The sum of natural occurring numbers is: " + demo.findSumOfNaturalNum(7));
    }
    public int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }
    public int findLargestOfThreeNumbers(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        }
        else {
            return num3;
        }
    }
    public int findSumOfNaturalNumbers(int num) {
        return (num * (num + 1)) / 2;
    }

    public int findSumOfNaturalNum(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        else {
            int k = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[k] != nums[i]) {
                    nums[k++] = nums[i];
                }
            }
            return k + 1;
        }
    }
}

