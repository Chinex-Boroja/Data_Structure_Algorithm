package com.chinex.boroja.dietel;

public class DoWhileCounter {

    public static void main(String[] args) {

        int counter = 1;
        do {
            System.out.printf("%d ", counter);
            counter++;
        } while (counter <= 10);

        System.out.println();
        System.out.println("____ DONE EXECUTING ____");
    }
}
