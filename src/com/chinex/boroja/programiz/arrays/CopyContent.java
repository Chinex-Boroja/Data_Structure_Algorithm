package com.chinex.boroja.programiz.arrays;

public class CopyContent {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        // Using arraycopy method
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
    }
}
