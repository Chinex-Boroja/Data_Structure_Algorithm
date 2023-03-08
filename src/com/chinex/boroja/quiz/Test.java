package com.chinex.boroja.quiz;

import com.chinex.boroja.quiz.date.MyDate;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Chinedu", "4 Jump Street", "081344666",
                "chinex@gmail.com");
        System.out.println(person);

        Student student = new Student("Jane Doe", "6 Jump street", "0947844",
                "Jane@gmail.com", Student.STATUS[0]);
        System.out.println(student);

        Employee employee = new Employee("Bob Man", "6 Jump street", "0947844",
                "Jane@gmail.com", "2-AB", 7000, new MyDate(2022, 6, 8));
        System.out.println(employee);

        Faculty faculty = new Faculty("Sarah Lee", "246 Oak Ln", "555-555-7878",
                "slee@email.com", "456-B", 70000, new MyDate(2010, 5, 1),
                "Associate Professor", "MWF 10-12");
        System.out.println(faculty);

        Staff staff = new Staff("Tom Brown", "789 Pine St", "555-555-8989", "tbrown@email.com",
                "789-C", 40000, new MyDate(2018, 9, 1), "Receptionist");
        System.out.println(staff);

    }
}
