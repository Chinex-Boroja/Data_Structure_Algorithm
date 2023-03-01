package com.chinex.boroja.oop.string;

public class ReplaceSplit {
    public static void main(String[] args) {
        String message = "Welcome".replace('e', 'A');
        message = "Welcome".replaceFirst("e", "AB");
        message = "Welcome".replace("e", "AB");
        message = "Welcome".replace("el", "AB");

        // Split method
        String[]tokens = "Java#HTML#Perl".split("#");
        for (String token : tokens) {
            System.out.print(token + " ");
        }

        Boolean check= "440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}");
        String s = "a+b$#c".replaceAll("[$+#]", "NNN");
    }
}
