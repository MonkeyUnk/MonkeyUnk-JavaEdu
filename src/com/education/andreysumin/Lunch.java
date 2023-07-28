package com.education.andreysumin;

public class Lunch {
    public static void main(String[] args) {
        int cash = 10;
        if (cash >= 10) {
            System.out.println(" Pizza ");
        } else if (cash < 6 ) {
            System.out.println(" Sandwich ");
        } else {
            System.out.println(" Hamburger ");
        }
    }
}
