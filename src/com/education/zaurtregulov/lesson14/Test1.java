package com.education.zaurtregulov.lesson14;

public class Test1 {

    public static void time () {

        OUTER:
        for (int hours = 0; hours <= 2; hours++) {
            System.out.println("Start OUTER LOOP");
            MIDDLE:
            for (int minutes = 0; minutes < 3; minutes++) {
                System.out.println("Start MIDDLE LOOP");
                INNER:
                for (int second = 0; second < 5; second++) {

                    System.out.println(hours + ":" + minutes + ":" + second);

                }
                System.out.println("End MIDDLE LOOP");
            }
            System.out.println("End OUTER LOOP");
        }


    }

    public static void main(String[] args) {
        time();
    }
}

