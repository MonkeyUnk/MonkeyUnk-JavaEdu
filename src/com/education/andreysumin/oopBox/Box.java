package com.education.andreysumin.oopBox;

import java.util.Arrays;

import static java.lang.System.*;

public class Box {
    double weight;
    double length;
    double height;

    void setDimens (double weight, double length, double height) {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }


    double getVolume () {
        return weight*length*height;

    }
    void showVolume () {
        System.out.println("volume: " + getVolume());

    }
}
