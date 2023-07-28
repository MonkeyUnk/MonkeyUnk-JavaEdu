package com.education.andreysumin;

public class Second {
    public static void main(String[] args) {
        int second = 2146787564;
        int secondInMinutes = 60;
        int secondInHours = secondInMinutes * 60;
        int secondInDays = secondInHours * 24;

        int days = second / secondInDays;
        int hours = (second % secondInDays) / secondInHours;
        int minutes = ((second % secondInDays) % secondInHours) / secondInMinutes;
        int leftSeconds = second - days * secondInDays - hours * secondInHours - minutes * secondInMinutes;

        System.out.println("Total time: " + second);
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes:  " + minutes);
        System.out.println("Seconds: " + leftSeconds);










    }
}
