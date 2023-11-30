package com.education.zaurtregulov.lesson14;

public class Homework14 {
    static void taimer() {
        OUTER:
        for (int hour = 0; hour <= 6; hour++) {
            MUDDLE:
            for (int minutes = 0; minutes <= 59; minutes++) {

                if (hour > 1 && minutes % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int seconds = 0; seconds <= 59; seconds++) {
                    if (seconds * hour > minutes) {
                        continue MUDDLE;
                    }
                    System.out.println(hour + ":" + minutes + ":" + seconds);
                }
            }

        }

    }

    public static void main(String[] args) {
        taimer();
    }
}







