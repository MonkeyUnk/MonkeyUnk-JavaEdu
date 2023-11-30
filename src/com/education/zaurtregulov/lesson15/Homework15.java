package com.education.zaurtregulov.lesson15;

public class Homework15 {
    static void time() {
        int hour = 0;
        OUTER:
        while (hour < 6) {
            hour++;
            int minutes = 0;

            MIDLE:
            do {

                minutes++;
            }
            while (minutes < 60);

            int second = 0;
            INNERT:
            while (second * hour > minutes) {
                second++;

            }
            System.out.println(hour + ":" + minutes + ":" + second);

        }
    }

    public static void main(String[] args) {
        time();
    }
}
