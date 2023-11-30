package com.education.zaurtregulov.lesson12;

public class Test10 {
    int engine;
    int doors;

    public Test10(int engine, int doors) {
        this.engine = engine;
        this.doors = doors;
    }
static void maximum (int a, int b, int c) {
        if (a>b & a>c) {
            System.out.println("A=maximum: "+a);
        }
        else if (b>a & b>c) {
        System.out.println("B=maximum: "+b);
    }
        else if (c>a & c>b) {
            System.out.println("C=maximum: "+c);
        }
        else
            System.out.println("Некоторые или все значения равны");


}

    public static void main(String[] args) {
        Test10 car01 = new Test10(1, 3);
        Test10 car02 = new Test10(2, 5);

        if (car01.engine > car02.engine) {
            if (car01.doors > car02.doors) {
                System.out.println("The engine and doors of c1 is greater than c2");}
            else
                System.out.println("The engine  of c1 is greater than c2, but doors of c2 greater than c1");}

        else {

        System.out.println("The engine and doors of c2 is greater than c1");}

maximum(25,1,10);
        int a = 10;
        int b = 20;
        int maximum = (a>b?a:b);
        System.out.println(maximum);
    }
}