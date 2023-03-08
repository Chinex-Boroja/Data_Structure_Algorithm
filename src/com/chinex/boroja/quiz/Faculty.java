package com.chinex.boroja.quiz;

import com.chinex.boroja.quiz.date.MyDate;

public class Faculty extends Employee {

    private String rank;
    private String officeHours;

    public Faculty(String office, double salary, MyDate dateHired, String rank, String officeHours) {
        super(office, salary, dateHired);
        this.rank = rank;
        this.officeHours = officeHours;
    }

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String rank, String officeHours) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.rank = rank;
        this.officeHours = officeHours;
    }
}
