package com.chinex.boroja.lambdas;

public class Lambdas {
    public static void main(String[] args) {
       Printable printable = (s) -> System.out.println("Meow");
        printThing(printable);
    }


    static void printThing(Printable thing) {
        thing.print("Done!!");
    }
}
