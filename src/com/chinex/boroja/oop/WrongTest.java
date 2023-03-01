package com.chinex.boroja.oop;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class WrongTest {
    private double radius = 1;

    private static int i = 0;
    private static int j = 0;

    /**
     * Find the area of this circle
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        WrongTest myCircle = new WrongTest();
//        System.out.println("Radius is " + myCircle.radius);

        Date[] date = new Date[10];
        for (int i = 0; i < date.length; i++) {
            date[i] = new Date();
        }
//        System.out.println(date[0]);
//        System.out.println(date[1]);
//        System.out.println(date[0].toString());

        int i = 2;
        int k = 3;

        {
            int j = 3;
//            System.out.println("i + j is " + (i + j));
        }
        k = i + j;
//        System.out.println("k is " + k);
//        System.out.println("j is " + j);

        System.out.println(Integer.parseInt("10"));
        System.out.println(Integer.parseInt("10", 10));
        System.out.println(Integer.parseInt("10", 16));
        System.out.println(Integer.parseInt("11"));
        System.out.println(Integer.parseInt("11", 10));
        System.out.println(Integer.parseInt("11", 16));

        BigInteger a = new BigInteger("94949499499499499499");
        BigInteger b = new BigInteger("2");

        BigInteger c = a.multiply(b);
        System.out.println(c);

        BigDecimal a1 = new BigDecimal("1.0");
        BigDecimal b1 = new BigDecimal("3");
        BigDecimal c1 = a1.divide(b1, 5, RoundingMode.UP);
        System.out.println(c1);

    }
}
