package com.chinex.boroja.oop.encapsulation;

import java.time.LocalDate;
import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(1111, "Peter");
        Date dateCreated = student.getDateCreated();

        dateCreated.setTime(2000000);
        String details = student.toString();
        System.out.println(details);

    }
}
