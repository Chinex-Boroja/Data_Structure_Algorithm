package com.chinex.boroja.abstraclass;

import java.util.Date;

public class HouseClone implements Cloneable, Comparable<HouseClone>{

    private int id;
    private double area;
    private Date whenBuilt;

    public HouseClone(int id, double area, Date whenBuilt) {
        this.id = id;
        this.area = area;
        this.whenBuilt = whenBuilt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    public void setWhenBuilt(Date whenBuilt) {
        this.whenBuilt = whenBuilt;
    }

    // override the protected clone method defined in the object class,
    // and strengthen its accessibility
    public Object clone() throws CloneNotSupportedException {
        // Perform a shallow copy
        // HouseClone houseClone = (HouseClone) super.clone();
        // Deep copy on whenBuilt
        // houseClone.whenBuilt = (Date)(whenBuilt.clone());
        return super.clone();
    }
    @Override
    public int compareTo(HouseClone o) {
        if (area > o.area)
            return 1;
        else if (area < o.area) {
            return -1;
        }
        else
            return 0;
    }
}

// protected native Object clone() throws ClassNotSupportedException;
// The keyword native indicates that this method is not written in Java but is implemented
//in the JVM for the native platform.
