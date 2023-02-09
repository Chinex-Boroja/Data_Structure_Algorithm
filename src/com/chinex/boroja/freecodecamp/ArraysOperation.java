package com.chinex.boroja.freecodecamp;

import java.util.Arrays;

public class ArraysOperation {
    public static void main(String[] args) {
        // Declare and Initialize an array
        int[] myList = new int[10];

        //Assigns 1 to 10 my list
        for (int i = 0; i < myList.length; i++) {
            myList[i] = i + 1;

        }

        System.out.println(Arrays.toString(myList));
        operateOnArrays();
    }
    public static void operateOnArrays() {
        int[] newList = {1, 2, 3};
        newList[0] = 4;

        for (int j : newList) {
            if (j == 2) {
                System.out.println(true);
                break;
            }
        }

    }
}
