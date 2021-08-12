package com.chinex.boroja.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
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
