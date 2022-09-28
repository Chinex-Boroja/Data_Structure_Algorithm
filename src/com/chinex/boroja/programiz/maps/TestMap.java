package com.chinex.boroja.programiz.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 80);
        hashMap.put("Anderson", 32);
        hashMap.put("Jimmy Cooks", 45);
        hashMap.put("Jeff", 28);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);

        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

        System.out.println("Display entries in LinkedHashMap");
        System.out.println(linkedHashMap);


    }
}
