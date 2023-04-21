package com.chinex.boroja.abstraclass;

public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple(), new Orange()};
        for (Object object : objects) {
            if (object instanceof Edible)
                System.out.println(((Edible) object).howtoEat());

            if (object instanceof Animal)
                System.out.println(((Animal) object).sound());
        }
    }

}

interface Edible {
    public abstract String howtoEat();
}

abstract class Animal {
    /** returns animal sound */
    public abstract String sound();
}

class Chicken extends Animal implements Edible {

    @Override
    public String howtoEat() {
        return "Chicken: Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }
}

class Tiger extends Animal {

    @Override
    public String sound() {
        return "Tiger: RROOAAAR";
    }
}
abstract class Fruit implements Edible {

}

class Apple extends Fruit {

    @Override
    public String howtoEat() {
        return "Apple: Make apple cider";
    }
}

class Orange extends Fruit {

    @Override
    public String howtoEat() {
        return "Orange: Make orange juice";
    }
}
