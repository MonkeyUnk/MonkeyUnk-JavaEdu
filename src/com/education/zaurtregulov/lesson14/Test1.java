package com.education.zaurtregulov.lesson14;

public class Test1 {
    public static void main(String[] args) {
        for (int i = 1, g = 10, k = 20; i <= 10 && k < 25; i++, k += 2) {
            System.out.println(i + " " + k);
        }
//        внутри цикла может быть метод
        for (int i = 0; i < 11; i++, sum("Summa increase")) {
            System.out.println(i);
        }
//вложенный цикл
        for (int i = 1; i <= 5; i++) {
            for (int k = 9; k >= 3; k -= 3) {
                System.out.println(" " + k);
            }
            System.out.println(i);

        }
        //break
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);

        }
        //continue
        for (int i = 1; i <= 100; i++) {
            if (i >= 4 & i <= 97) {
                continue;
            }
            System.out.println(i);

        }
time();
        timeless();

    }

    static void sum(String a) {
        System.out.println(a);
    }

    //nested loop
    static void time() {
        for (int hour = 0; hour <= 23; hour++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                System.out.println(hour+ ":" + minutes);
            }
        }
    }
    static void timeless() {
       OUTER: for (int hour = 0; hour <= 23; hour++) {
            INNER: for (int minutes = 0; minutes <= 59; minutes++) {
                System.out.println(hour+ ":" + minutes);
                if (minutes==30) {
                    break OUTER;
                }

            }

        }
    }
}

