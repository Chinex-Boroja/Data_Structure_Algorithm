package com.chinex.boroja;

import java.util.ArrayList;
import java.util.List;

public class JavaTest {

    public static void main(String[] args) {

        //Example without Generics
        List names = new ArrayList();
        names.add("Chinex");
        String name = (String) names.get(0);
        System.out.println("First name: " + name);

        //with Generics
        List<String> names2 = new ArrayList();
        names2.add("Chinex");
        String name2 = names2.get(0);
        System.out.println("first Name is " + name2);
    }
}
