package com.chinex.boroja.generics.inout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//public class Generics<T> {}
public class Generics {
    /**public void doSomething(T t) {
        System.out.println(t);
    } */
    public void makeNoises(List<? extends Animal> animalList) {
        for (Animal a: animalList) {
            a.makeNoise();
        }
    }
//covariant in Java
    public void addToList(List<? super Mammal> animalList) {
        Mammal mammal1 = new Mammal();
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();

        animalList.add(animal1);
        animalList.add(mammal1);
        animalList.add(dog1);
    }
    public void getFromList(List<? extends Dog> animalList) {
        Dog animal = animalList.get(0);
    }
    public static void main(String[] args) {
        //Generics<Dog> dogGenerics = new Generics<>();
        Mammal mammal1 = new Mammal();
        Mammal mammal2 = new Mammal();
        List<Mammal> mammals = new ArrayList<>();
        mammals.add(mammal1);
        mammals.add(mammal2);

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);

        Generics g = new Generics();
        g.makeNoises(animals);

        Comparator<Dog> dogComparator = new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return 0;
            }
        };
        Comparator<Animal> animalComparator = new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return 0;
            }
        };
        dogs.sort(animalComparator);

        /**Mammal mammal = new Mammal();
        Animal animal = new Animal();
        Dog dog = new Dog();
        dogGenerics.doSomething(dog); */
    }
}
