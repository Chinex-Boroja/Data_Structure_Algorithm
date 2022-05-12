package com.chinex.boroja.leetcode;

import java.util.Arrays;

public class ArrayTester {

    public static void main(String[] args) {

        //initialing an array of 15 objects
        DVD[] dvdCollection = new DVD[15];

        //Creating DVD objects for different movies
        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD incredibleDVD = new DVD("The Incredible", 2014, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

        //putting/writing the objects in different indexes
        dvdCollection[3] = incredibleDVD;
        dvdCollection[7] = avengersDVD;
        dvdCollection[9] = findingDoryDVD;
        dvdCollection[2] = lionKingDVD;

        //Reading items from an array
        System.out.println(Arrays.deepToString(dvdCollection));
        System.out.println(dvdCollection[7]);
        System.out.println(dvdCollection[10]);
        System.out.println(dvdCollection[3]);
    }
}
