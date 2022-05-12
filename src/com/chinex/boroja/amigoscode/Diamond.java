package com.chinex.boroja.amigoscode;

public class Diamond {

    String name;

    public Diamond(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Diamond{" +
                "name='" + name + '\'' +
                '}';
    }
}
