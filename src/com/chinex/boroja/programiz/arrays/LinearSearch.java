package com.chinex.boroja.programiz.arrays;

public class LinearSearch {

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int i = linearSearch(list,-4);
        int j = linearSearch(list,1);
        int k = linearSearch(list,2);

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
