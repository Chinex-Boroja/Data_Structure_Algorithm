package com.chinex.boroja.oop.inheritance;

public class RectangleObject extends GeometricObject {
    private double height;
    private double width;

    public RectangleObject() {
    }

    public RectangleObject(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public RectangleObject(String color, boolean filled, double height, double width) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
