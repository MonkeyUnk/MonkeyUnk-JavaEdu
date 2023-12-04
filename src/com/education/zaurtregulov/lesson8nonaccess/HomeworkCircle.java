package com.education.zaurtregulov.lesson8nonaccess;

public class HomeworkCircle {
    static final double PI = 3.14;


    double square(double radius) {
        return PI * radius * radius;

    }

    static double length(double radius) {
        return 2 * PI * radius;
    }

    void showInfo(double radius) {
        System.out.println("Radius: " + radius + ", " + "Square: " + PI * radius * radius + ", "+ "Lenght: " + PI * 2 * radius);
    }
}

    class HomeworkCircleTest {
        public static void main(String[] args) {
            HomeworkCircle circle1 = new HomeworkCircle();
            circle1.square(5);
            circle1.length(5);
            circle1.showInfo(5);

        }
    }


