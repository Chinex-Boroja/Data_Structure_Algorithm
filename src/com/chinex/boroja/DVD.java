package com.chinex.boroja;

import java.util.Arrays;

public class DVD {
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }
    @Override
    public String toString() { return
            this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }
}
class ImplementDVD {
    public static void main(String[] args) {
        //initialing an array of 15 objects
        DVD[] dvdCollection = new DVD[15];

        //Creating DVD objects for different movies
        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD incrediblesDVD = new DVD("The Incredibles", 2014, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

        //putting the objects in different indexes
        dvdCollection[3] = incrediblesDVD;
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