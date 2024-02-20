package com.education.zaurtregulov.lesson15;

public class Homework15 {
    static void time() {
        int hour = 0;
        OUTER:
        while (hour < 6) {
            hour++;
            int minutes = -1;

            MIDLE:
            do {

                minutes++;
                if (hour > 1 && minutes % 10 == 0) {
                    break OUTER;
                }
                int second = 0;

                INNER:
                while (second < 60) {
                    if (second * hour > minutes) {
                        continue MIDLE;
                    }
                    System.out.println(hour + ":" + minutes + ":" + second);
                    second++;
                }
            }
                while (minutes < 59) ;
                hour++;


        }
    }

    public static void main(String[] args) {
        time();
    }
}
