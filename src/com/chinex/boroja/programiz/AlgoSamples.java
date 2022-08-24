package com.chinex.boroja.programiz;

public class AlgoSamples {

    /**
     * Driver method
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(addTwoIntegers(8, 2));
        String displayContent = findTheLargestAmongThreeNumbers(3,4,1);
        System.out.println(displayContent);
        System.out.println(factorial(10));
        checkPrime(11);
    }

    /**
     * --------------ALGORITHM--------------
     * 1. START
     * 2. Declare variables sum, firstInteger, secondInteger
     * 3. Read firstInteger and secondInteger values
     * 4. Add firstInteger and secondInteger values
     * 5. Assign the result of firstInteger and secondInteger values to sum
     * 6. Print/Display sum
     * 7. END
     */
    public static int addTwoIntegers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    /**
     * --------------ALGORITHM--------------
     * 1. START
     * 2. Declare variables firstInteger, secondInteger, thirdInteger
     * 3. Read firstInteger, secondInteger and thirdInteger values
     * 4. If firstNumber > secondNumber
             If firstNumber > thirdNumber
                Print firstNumber is the largest
             Else
                Print thirdNumber is the largest
          Else
             if secondNumber > thirdNumber
                Print secondNumber is the largest
             Else
                Print thirdNumber is the largest
     * 5. END
     */
    public static String findTheLargestAmongThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                return "Number " + firstNumber + " is the largest";
            }
            else {
                return "Number " + thirdNumber + " is the largest";
            }
        }
        else  {
            if (secondNumber > thirdNumber) {
                return "Number " + secondNumber + " is the largest";
            }
            return "Number " + thirdNumber + " is the largest";
        }
    }

    /**
     * --------------ALGORITHM--------------
     * 1. START
     * 2. Declare variables n, factorial, i
     * 3. initialize variables factorial <- 1, i <- 1
     * 4. Read the value of n (the number to be determined)
     * 5. Repeat steps until i = n
     * 5.1: factorial <- factorial * i
     * 5.2: i <- i + 1
     * 6. Print/Display factorial
     * 7. END
     */
    public static int factorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void checkPrime(int n) {
        int flag = 1;
        for (int i = 2; i <= n/2; i++) {
            if (n / i == 0) {
                flag = 0;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(n + " is not prime");
        } else {
            System.out.println(n + " is prime");
        }
    }

    public static void findFibonacci() {
        int firstTerm;
        int secondTerm;
        int temp;

        firstTerm = 0;
        secondTerm = 1;

        System.out.println(firstTerm + " " + secondTerm);
        
    }
}
