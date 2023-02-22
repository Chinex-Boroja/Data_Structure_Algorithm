package com.chinex.boroja.freecodecamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class NullRemoval {

    public static void main(String[] args) {
        removeAllNullsFromList();
    }
    public static void removeAllNullsFromList() {
        List<String> list = new ArrayList<>(Arrays.asList("A", null, "B", null, "C"));
        list.removeIf(Objects::isNull);

        System.out.println(list.size());
        System.out.println(list);
    }
}
