package com.chinex.boroja.abstraclass;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumbers {
    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();
        list.add(45);
        list.add(3445.53);

        list.add(new BigInteger("3432233344555677889965"));
        list.add(new BigDecimal("2.09488839920038848850"));

        System.out.println("The largest number is " + getLargestNumber(list));

    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0)
            return null;

        Number number = list.get(0);
        for (int i = 1; i < list.size() ; i++) {
            if (number.doubleValue() < list.get(i).doubleValue())
                number = list.get(i);
        }
        return number;
    }
}
