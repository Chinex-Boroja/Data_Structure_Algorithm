package com.chinex.boroja.anonymous;

public class AnonymousInnerClasses {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeNoise();

        Animal bigfoot = new Animal() {
            @Override
            public void makeNoise() {
                System.out.println("Big Noise Maker");
            }
        };
        bigfoot.makeNoise();

        Runnable myAnonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am an anonymous runnable");
            }
        };
        myAnonymousRunnable.run();


    }
}
