package com.chinex.boroja.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        // Create a file
        PrintWriter output = new PrintWriter(file);

        // Write formatted output to the file
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);

        // Close file
        output.close();

        // Using try-with-resources
        // Declare resources
//        try( PrintWriter output1 = new PrintWriter(file)) {
//            // Write formatted output to the file while using resources
//            output1.print("John T Smith ");
//            output1.println(90);
//            output1.print("Eric K Jones ");
//            output1.println(85);
//        }
     }
}
