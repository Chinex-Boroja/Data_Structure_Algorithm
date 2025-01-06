package com.chinex.boroja.dietel.object_classes;

public class SingletonDemo {

    private static SingletonDemo instance;

    private SingletonDemo() {
        System.out.println("Singleton instance created");
    }

    public static SingletonDemo getInstance() {
        if (instance == null) {
            instance = new SingletonDemo();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonDemo singletonDemo = SingletonDemo.getInstance();
        SingletonDemo singletonDemo2 = SingletonDemo.getInstance();
        System.out.println(singletonDemo == singletonDemo2);

    }
}
