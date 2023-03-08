package com.chinex.boroja.oop.arraylist;

import com.chinex.boroja.oop.inheritance.CircleObject;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        // Create a list to store cities
        ArrayList<String> cityList = new ArrayList<>();

        // Add some cities in the list
        cityList.add("Aba");
        cityList.add("Umuahia");
        cityList.add("Isuikwuato");
        cityList.add("Bende");
        cityList.add("Arochukwu");
        cityList.add("Ugwunagbo");
        cityList.add("Obingwa");
        cityList.add("Ukwa East");
        cityList.add("Isuochi");
        cityList.add("Ngwa");

        System.out.println("List size? " + cityList.size());
        boolean check = cityList.contains("Aba");
        System.out.println("Is Aba in the list? " + check);

        System.out.println("The location of Bende in the list? " + cityList.indexOf("Bende"));
        System.out.println("Is the list empty? " + cityList.isEmpty());

        cityList.add(2, "Osisioma");
        cityList.remove("Ngwa");

        System.out.println(cityList);

        // Display the contents in the list in reverse order
        for (int i = cityList.size() - 1; i >= 0; i--) {
            System.out.print(cityList.get(i) + " ");
        }
        System.out.println();

        ArrayList<CircleObject> list = new ArrayList<>();

        list.add(new CircleObject(3));
        list.add(new CircleObject(4));

        System.out.println("The area of the circle? " + list.get(1).getRadius());
    }
}
