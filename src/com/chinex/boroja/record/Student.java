package com.chinex.boroja.record;

public record Student(String name, String email) {

    public Student {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name should not be empty");
        }
    }
    public static void print() {
        System.out.println("This is a student record");
    }
}
