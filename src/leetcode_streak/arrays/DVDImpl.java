package leetcode_streak.arrays;

import java.util.Arrays;

public class DVDImpl {
    public static void main(String[] args) {

        DVD[] dvdCollection = new DVD[15];

        DVD avengersDVD = new DVD("Avenger's Wrath", 2015, "Chine Boroja");
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

        // writing to dvdCollection Memory
        dvdCollection[2] = avengersDVD;
        dvdCollection[0] = incrediblesDVD;
        dvdCollection[1] = findingDoryDVD;
        dvdCollection[14] = lionKingDVD;

        // reading from dvdCollection Memoty
        System.out.println(dvdCollection[0]);
        System.out.println(dvdCollection[14]);
        System.out.println(Arrays.toString(dvdCollection));
    }
}
