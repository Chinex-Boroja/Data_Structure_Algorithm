package com.chinex.boroja.generics.kotlin

import com.chinex.boroja.generics.inout.Animal
import com.chinex.boroja.generics.inout.Dog
import com.chinex.boroja.generics.inout.Generics
import com.chinex.boroja.generics.inout.Mammal

/**class Generics<T> {
    fun doSomething(t: T) {
        println(t)
    }
}*/
class Generics {

    fun makeNoises(animalList: List<Animal>) {
        for (a in animalList) {
            a.makeNoise()
        }
    }

    fun addToList(animalList: MutableList<in Mammal?>) {
        val mammal1 = Mammal()
        val animal1 = Animal()
        val dog1 = Dog()
        animalList.add(animal1)
        animalList.add(mammal1)
        animalList.add(dog1)
    }

    fun getFromList(animalList: List<out Animal>) {
        val animal = animalList[0]
    }
    //how to copy
    fun copy(src: List<out Animal>, dest: MutableList<in Animal>) {
          for (animal in src) {
            dest.add(animal)
        }
    }

}

fun main(args: Array<String>) {

    //Generics<Dog> dogGenerics = new Generics<>();
    val mammal1 = Mammal()
    val mammal2 = Mammal()
    val mammals: List<Mammal> = listOf(mammal1, mammal2)

    val animal1 = Animal()
    val animal2 = Animal()
    val animals: List<Animal> = listOf(animal1, animal2)

    val dog1 = Dog()
    val dog2 = Dog()
    val dogs: List<Dog> = listOf(dog1, dog2)

    val g = com.chinex.boroja.generics.kotlin.Generics()
    g.makeNoises(dogs)

    val copy = com.chinex.boroja.generics.kotlin.Generics()
    copy.copy(dogs, mutableListOf())

    val dogComparator: Comparator<Dog> =
        Comparator<Dog> { o1, o2 -> 0 }
    val animalComparator: Comparator<Animal> =
        Comparator<Animal> { o1, o2 -> 0 }
    //dogs.sortedWith(dogComparator)

    /**val dogGenerics: Generics<Dog> = Generics<Dog>()
    val mammal = Mammal()
    val animal = TestEdible()
    val dog = Dog()
    dogGenerics.doSomething(dog)*/
}
