package com.chinex.boroja.programiz.fibonacci;

public class TestFib {

    public static long fib(long index) {
        //Base case
        if (index == 0) {
           return 0;
        } else if (index == 1) {
            return 1;
        }
        else {
            //Reduction and recursive calls
            return fib(index - 1) + fib(index - 2);
        }
    }
}
