package com.education.zaurtregulov.lesson6overload;

import java.util.Arrays;

public class MethodsOverloading {
    int sum (int a,int b, int c ) {
     return a+b+c;
    }
    double medAr (int a, int b , int c ) {
        return sum(a, b, c)/3;
    }

    public static void main(String[] args) {
        MethodsOverloading m1 = new MethodsOverloading();
        System.out.println (m1.sum(5,10,15));
        System.out.println(m1.medAr(5,10,15));


    }
}
