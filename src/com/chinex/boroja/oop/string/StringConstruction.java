package com.chinex.boroja.oop.string;

import java.util.Arrays;

public class StringConstruction {
    public static void main(String[] args) {
        char[] charArray = {'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'};
        String message = new String(charArray);

        System.out.println(message);

        //Interned String
        String s1 = "Welcome to Java";
        String s2 = new String("Welcome to Java");
        String s3 = "Welcome to Java";
        System.out.println("s1 == s2 is " + (s1 == s2));
        System.out.println("s1 == s3 is " + (s1 == s3));

        //Conversion
        char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
        "CS3720".getChars(2, 6, dst, 4);
        System.out.println(dst);

        String str = new String(new char[]{'j', 'a', 'v', 'a'});
        String str1 = String.valueOf(new char[]{'j', 'a', 'v', 'a'});
    }
}
