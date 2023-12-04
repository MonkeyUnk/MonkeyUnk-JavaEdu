package com.education.zaurtregulov.lesson8nonaccess;

public class Homework {
    static double multiplication (double a,double b, double c) {
        double result = a*b*c;
        System.out.println(result);
        return result;
    }
    static void division (double a,double b) {

        System.out.println("result: " + (a - a%b)/b + ", " + a%b);

    }
}
class HomeworkTest {
    public static void main(String[] args) {
        Homework.multiplication(3,4,5);
        Homework.division(27,5);
        Homework.multiplication(25,6,4.1);
        Homework.division(365,12.87);
    }
}