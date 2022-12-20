package com.chinex.boroja.problem_solving_in_java;

public class ShowCurrentTime {
    public static void main(String[] args) {

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;

        long currenMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        System.out.println("Current time: " + currentHour + ":" + currenMinute + ":" + currentSecond + " GMT");
    }
}
