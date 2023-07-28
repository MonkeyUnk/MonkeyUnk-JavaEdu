package com.education.andreysumin;

public class Days29 {
    public static void main(String[] args) {
        int days = 10000;
        int years = days / 365;
        int month = (days % 365) / 30;
        int leftDays = days - years * 365 - month * 30;
        System.out.println(" Years " + years);
        System.out.println(" Month " + month);
        System.out.println(" Left days " + leftDays);

    }
}
