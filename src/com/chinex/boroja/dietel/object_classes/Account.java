package com.chinex.boroja.dietel.object_classes;

/**
 * Account class that contains a name instance variable and methods to set and get its value.
 */
public class Account {
    //Instance variable
    private String name;

    // constructor initializes name with parameter name
    public Account(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
