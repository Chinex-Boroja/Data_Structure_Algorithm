package com.chinex.boroja.amigoscode;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Queue;

public class ImplQueues {
    public static void main(String[] args) {
        //queues();

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alexa", 34));
        linkedList.add(new Person("Alex", 24));
        linkedList.add(new Person("Alex", 24));
        System.out.println(linkedList.size());
        System.out.println(linkedList);

        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    public static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Amara", 21));
        supermarket.add(new Person("Alex", 26));
        supermarket.add(new Person("Gabriel", 23));
        supermarket.add(new Person("Nanny", 45));

        System.out.println(supermarket.peek());
        System.out.println(supermarket);
    }

}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person[" +
                "name=" + name  +
                ", age=" + age +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
