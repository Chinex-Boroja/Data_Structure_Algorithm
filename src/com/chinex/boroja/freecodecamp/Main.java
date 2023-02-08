package com.chinex.boroja.freecodecamp;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate after100Days = today.plusDays(100);
        String dayOfWeek = after100Days.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println("100 days from today, it will be " + dayOfWeek);

        checkDay(2);
        checkDay100(100);
        showCurrentTime();

        // Augmented Operators
        double a = 6.5;
        a += a + 1;
        System.out.println(a);
        a = 6;
        a /= 2;
        System.out.println(a);
    }
    public static void checkDay(int day) {
        int findDay = (day + 10) % 7;
        System.out.println("10 days from now is day: " + findDay);
    }
    public static void checkDay100(int day) {
        int findDay = (day + 100) % 7;
        System.out.println("10 days from now is day: " + findDay);
    }

    public static void showCurrentTime() {
        // obtain the current milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute
                + ":" + currentSecond + " GMT");
    }
}
