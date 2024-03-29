package com.chinex.boroja.quiz.date;

import java.util.GregorianCalendar;

/**
 * (The MyDate class) Design a class named MyDate. The class contains:
 *  ■ The data fields year, month, and day that represent a date. month is
 * 0-based, i.e., 0 is for January.
 *  ■ A no-arg constructor that creates a MyDate object for the current date.
 *  ■ A constructor that constructs a MyDate object with a specified elapsed time
 * since midnight, January 1, 1970, in milliseconds.
 *  ■ A constructor that constructs a MyDate object with the specified year,
 * month, and day.
 *  ■ Three getter methods for the data fields year, month, and day, respectively.
 *  ■ A method named setDate(long elapsedTime) that sets a new date for
 * the object using the elapsed time.
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        this(System.currentTimeMillis());
    }
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH) + 1;
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

}
