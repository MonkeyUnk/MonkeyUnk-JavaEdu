package com.education.andreysumin.oopBox;

public class Box {
    double weight;
    double length;
    double height;

    Box ()  {
        this.length = 10;
        this.height = 10;
        this.weight = 10;
    }

    Box(double weight, double length, double height)  {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }



    void setDimens (double weight, double length, double height) {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }


    double getVolume() {
        return weight * length * height;

    }

    void showVolume() {
        System.out.println("volume: " + getVolume());

    }
}
