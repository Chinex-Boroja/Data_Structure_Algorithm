package com.chinex.boroja.record;

public class Main {
    public static void main(String[] args) {

        Student student= new Student("Chinedu", "ci@gmail");
        System.out.println(student);

        Student.print();

        EmployeeRecord record = new EmployeeRecord("Amaka", 89);
        System.out.println(record.name());
    }
}
