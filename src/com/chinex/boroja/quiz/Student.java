package com.chinex.boroja.quiz;

public class Student extends Person {

    public static final String[] STATUS = {"Freshman", "Sophomore", "Junior", "Senior"};
    private String classStatus;

    public Student() {
    }

    public Student(String classStatus) {
        this.classStatus = classStatus;
    }

    public Student(String name, String address, String phoneNumber, String emailAddress, String classStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }

}
