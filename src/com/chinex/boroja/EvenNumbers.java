package com.chinex.boroja;

public class EvenNumbers {
    static int checkEvenNumbers(int[] nums) {

        int even_count = 0;

        for (int i = 0; i < nums.length; i++) {
            int length = String.valueOf(nums[i]).length();
            if (length % 2 == 0)
                even_count++;
        }
        return even_count;
    }

    public static void main(String[] args) {
        int[] array = new int[]{555, 901, 482, 1771, 4565};
        System.out.println(checkEvenNumbers(array));
    }
}
