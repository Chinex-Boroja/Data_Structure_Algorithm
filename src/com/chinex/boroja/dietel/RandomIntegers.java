package com.chinex.boroja.dietel;

import java.security.SecureRandom;

public class RandomIntegers {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        for (int i = 0; i <= 20; i++) {
            int face = 1 + random.nextInt(6);

            System.out.printf("%d ", face);

            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
