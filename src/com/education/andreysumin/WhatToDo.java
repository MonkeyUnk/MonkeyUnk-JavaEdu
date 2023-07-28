package com.education.andreysumin;

public class WhatToDo {
    public static void main(String[] args) {
        boolean goodWeather = false;
        boolean night = true;

        if (night) {
            System.out.println("Sleep");}
        if (goodWeather && !night)
        {System.out.println("Walk");}
        if (!goodWeather && !night) {
            System.out.println("Read book");};


    }
}
