package com.education.zaurtregulov.lesson15;

public class While {
    public static void main(String[] args) {
        boolean b = true;
        int a = 1;
        while (b) {
            System.out.println(a);

            if (a%3==0 && a%7==0) {
                b=false;
            }
            a++;
        }
        int a1 = 5;
        while (++a1<10) {
            System.out.println(a1);
            a1++;
        }
//        внимание на место переменной!!! (см. ниже sout)
        int a2 = 5;
        while (a2++<10) {
            a2++;
            System.out.println(a2);

        }
        System.out.println(a2);


        int i = 1;

        do {System.out.println(i);
        i++;
        }
        while (i<=10);

        int hour = 0;
        OUTER:
        do {
            int minute = 0;
            INNER:
            while (minute < 60) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
            hour++;
        } while (hour < 24);
        time();
    }
    static void time () {
        OUTER:
        for (int hour = 0;hour<24;hour++) {
            int minute = 0;
           INNER:
           while (minute<60) {
                System.out.println(hour+":"+minute);
                minute++;
            }
        }
    }
}
