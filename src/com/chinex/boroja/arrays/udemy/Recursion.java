package com.chinex.boroja.arrays.udemy;

public class Recursion {
    public static void main(String[] args) {

        // Factorial Algorithm
        // 1. if num is equal to 0, the factorial is 1. Stop, we have the result.
        // 2. Set the multiplier to 1
        // 3. Set factorial to 1
        // 4. While multiplier is not equal to num, do steps 5 and 6
        // 5. Multiply factorial by multiplier and assign the result to factorial
        // 6. add 1 to multiplier
        // 7. Stop. The result is factorial

        System.out.println(iterativeFactorial(8));
        System.out.println(recursiveFactorial(8));
      }

      public static int iterativeFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;
          for (int i = 1; i <= num; i++) {
              factorial *= i;
          }

          return factorial;
      }

      /* Recursion
      * 1! = 1 * 0! = 1
      * 2! = 2 * 1 = 2 * 1!
      * 3! = 3 * 2 * 1 = 3 * 2!
      * 4! = 4 * 3 * 2 * 1 = 4 * 3!
      * n! = n * (n - 1)!
      * */

    public static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }
}
