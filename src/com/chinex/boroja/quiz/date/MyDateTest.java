package com.chinex.boroja.quiz.date;

import com.chinex.boroja.quiz.date.MyDate;

public class MyDateTest {
    public static void main(String[] args) {

        MyDate myDate = new MyDate();
        System.out.println("Current date:");
        System.out.println("Year: " + myDate.getYear());
        System.out.println("Month: " + myDate.getMonth());
        System.out.println("Day: " + myDate.getDay());

        MyDate myDate1 = new MyDate(561555550000L);
        System.out.println("Date for elapsed time of 34355555133101L milliseconds since January 1, 1970:");
        System.out.println("Year: " + myDate1.getYear());
        System.out.println("Month: " + myDate1.getMonth());
        System.out.println("Day: " + myDate1.getDay());


    }
}
