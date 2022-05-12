package com.chinex.boroja.amigoscode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ImplSet {

    public static void main(String[] args) {
        Set<Ball> ballSet = new HashSet<>();
        ballSet.add(new Ball("Magenta"));
        ballSet.add(new Ball("Cyan"));
        ballSet.add(new Ball("Orange"));
        ballSet.add(new Ball("yellow"));
        ballSet.add(new Ball("Orange"));

        ballSet. remove(new Ball("yellow"));
        System.out.println(ballSet.size());
        ballSet.forEach(System.out::println);
    }
}

class Ball {
    String color;

    public Ball(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Objects.equals(color, ball.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
