package com.chinex.boroja.oop.inheritance;

import java.util.Date;

public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    /** Construct a default geometric object */
    public GeometricObject() {
        dateCreated = new Date();
    }

    /** Construct a geometric object with the specified color and filled value */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
