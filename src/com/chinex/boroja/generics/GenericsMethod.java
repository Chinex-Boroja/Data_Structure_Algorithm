package com.chinex.boroja.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethod {
    static Character[] charArray = {'g','o','o','d','m','o','r','n','i','n','g'};
    static Integer[] intArray = {1,2,3,4,5};
    static Boolean[] boolArray = {true,false,true,false};

    public static <T> List arrayToList(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> characterList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> integerList = arrayToList(intArray, new ArrayList<>());

        System.out.println(integerList.get(0));
        System.out.println(boolList);
        System.out.println(characterList);
        System.out.println(boolList.get(3));
    }
}
