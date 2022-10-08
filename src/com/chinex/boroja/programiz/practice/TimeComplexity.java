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
        printPolynomials(3);
    }

    private int findSum(int n) {
//        return n * (n + 1) / 2;

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void printPolynomials(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {

                System.out.println("i = " + i + ", j = " + j);
            }
            System.out.println("End of inner Loop");

        }
        System.out.println("End of outer loop");

    }
}
