package com.chinex.boroja.amigoscode;

import java.util.ArrayList;
import java.util.List;

public class ImplList {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Yellow");
        colors.add("Cyan");

        System.out.println(colors.size());
        colors.add(4, "Purple");
        System.out.println(colors.size());
        System.out.println(colors.get(4));
        System.out.println(colors.contains("Green"));
        System.out.println(colors);
        System.out.println();

        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println();

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        System.out.println();

        colors.forEach(System.out::println);

        //creating an immutable list
        List<String> colorUnmodifiable = List.of(
                "Yellow",
                "Green",
                "white"
        );
    }
}
