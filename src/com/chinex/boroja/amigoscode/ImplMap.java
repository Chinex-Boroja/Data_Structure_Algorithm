package com.chinex.boroja.amigoscode;

import java.util.HashMap;
import java.util.Map;

public class ImplMap {

    public static void main(String[] args) {

        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Jamila", 89), new Diamond("African Diamond"));
        System.out.println(new Person("Jamila", 89).hashCode());
        System.out.println(new Person("Jamila", 89).hashCode());
        System.out.println(map.get(new Person("Jamila", 89)));

        System.out.println(map);
    }

    private static void maps() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Chinedu", 40));
        map.put(2, new Person("Alex", 20));
        map.put(3, new Person("Magnus", 19));
        map.put(4, new Person("Paul", 45));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        map.entrySet().forEach(System.out::println);
        System.out.println();

        map.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println(map.getOrDefault(5, new Person("default", 0)));
    }
}
