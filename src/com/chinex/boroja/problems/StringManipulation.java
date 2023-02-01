package com.chinex.boroja.problems;

/**
 * Question 1: String Manipulation: Answer this question or the other one below
 * 1.	A string to be encoded must be of minimum of 10 characters in length
 * 2.   The string is first divided into two substrings of roughly equal lengths, A and B.
 * 3.   To encode, substrings A and B are then traversed from left to right and all characters Found at the even indexes
 *      of substring A are swapped with those at the odd indexes of substring B.
 *  For instance,
 *  if substring A= "African" and
 * substring B= "Journal,
 * then newA AJrucnn and
 * newB = foiraal.
 * 4.   The two new strings are then concatenated in the order newBnewA (e.g. foiraalAJrucnn) and sent to the receiver.
 * 5.   To decode at the receiving end, the whole process is repeated in reversed order from steps 4 to 2 above.
 * 6.   Test your code with the string: "1 am a boy now in the University
 * Implement the above problem using Object-Oriented Programming Concept
 */
public class StringManipulation {
    private final String inputString;

    public StringManipulation(String inputString) {
        if (inputString.length() < 10) {
            throw new IllegalArgumentException("Input String must be at least 10 characters long.");
        }
        this.inputString = inputString;
    }

    public String encode() {
//        int half = inputString.length() % 2 == 0 ? inputString.length()/2 : inputString.length()/2 + 1;
        int half = inputString.length() / 2;
        String A = inputString.substring(0, half);
        String B = inputString.substring(half);

        StringBuilder newA = new StringBuilder();
        StringBuilder newB = new StringBuilder();

        for (int i = 0; i < half; i++) {
            if (i % 2 == 0) {
                newB.append(A.charAt(i));
                newA.append(B.charAt(i));

            } else {
                newB.append(B.charAt(i));
                newA.append(A.charAt(i));

            }

        }
        return newB + newA.toString().trim();

    }

    public String decode(String encoded) {
        int half = encoded.length() / 2;
        String A = encoded.substring(half);
        String B = encoded.substring(0, half);

        StringBuilder originalString = new StringBuilder();
        for (int i = 0; i < half; i++) {
            if (i % 2 == 0) {
                originalString.append(B.charAt(i));
            } else {
                originalString.append(A.charAt(i));
            }
        }
        for (int i = 0; i < half; i++) {
            if (i % 2 == 0) {
                originalString.append(A.charAt(i));
            } else {
                originalString.append(B.charAt(i));
            }
        }
        return originalString.toString();
    }

    public static void main(String[] args) {
        String inputString = "African Journal";
        StringManipulation encoder = new StringManipulation(inputString);
        String encoded = encoder.encode();
        System.out.println("Encoded String: " + encoded);

        String decoded = encoder.decode(encoded);
        System.out.println("Decoded String: " + decoded);
    }
}
