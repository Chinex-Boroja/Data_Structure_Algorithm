package com.chinex.boroja.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a File instance
        File file = new File("scores1.txt");

        //Create a Scanner for the file
        Scanner input = new Scanner(file);

        // Read data from a file
        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();

            System.out.println( firstName + " " + mi +  " " + lastName + " " + score);
        }

        input.close();
    }
}
