package com.chinex.boroja.oop.inheritance;

public class DynamicBinding {
    public static void main(String[] args) {
        print(new Customers());
        print(new AccessBank());
        print(new CBN());
        print(new Object());
    }
    public static void print(Object object) {
        System.out.println(object.toString());
    }
}
class Customers extends AccessBank {
}
class AccessBank extends CBN {
    @Override
    public String toString() {
        return "My Money";
    }
}
class CBN {
    @Override
    public String toString() {
        return "Emefiele Dey Play";
    }
}

