package hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scanner = new Scanner(new File("/Users/chinexboroja/chinex-devhub/Data_Structure_Algorithm/text_scores.txt"));
//        while (scanner.hasNextLong()) {
//            long n = scanner.nextLong();
//            System.out.println("This is :::: " + n);
//        }
//
//        scanner.close();
//        System.out.println("PROGRAMMING DONE EXECUTION");

        int N = scanner.nextInt();

        if (N % 2 == 1) {
            System.out.println("Weird");
        }

        if (N % 2 == 0 && (N > 1 && N < 5)) {
            System.out.println("Not Weird");
        }

        if (N % 2 == 0 && (N > 5 && N < 21)) {
            System.out.println("Weird");
        }

        if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");
        }

        scanner.close();
    }


}
