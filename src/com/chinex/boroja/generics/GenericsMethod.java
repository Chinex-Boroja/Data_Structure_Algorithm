package com.chinex.boroja.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethod {
    static Character[] charArray = {'g','o','o','d','m','o','r','n','i','n','g'};
    static Integer[] intArray = {1,2,3,4,5};
    static Boolean[] boolArray = {true,false,true,false};

    public static List arrayToList(Object[] array, List<Object> list) {
        for (Object object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> characterList = arrayToList(charArray, new ArrayList<>());
        List<Character> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Character> integerList = arrayToList(intArray, new ArrayList<>());
    }
}
