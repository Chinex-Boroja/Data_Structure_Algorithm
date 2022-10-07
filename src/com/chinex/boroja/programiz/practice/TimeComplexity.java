package com.chinex.boroja.programiz.practice;

/**
 * Find the sum of first n natural occurring numbers
 */

public class TimeComplexity {
    public static void main(String[] args) {
        double time = System.currentTimeMillis();

        TimeComplexity demo = new TimeComplexity();
        System.out.println(demo.findSum(99999));

        System.out.println("Time taken: " + (System.currentTimeMillis() - time) + " milliseconds");
    }

    private int findSum(int n) {
//        return n * (n + 1) / 2;

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
