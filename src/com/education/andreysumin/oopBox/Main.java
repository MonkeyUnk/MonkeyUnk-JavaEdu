package com.education.andreysumin.oopBox;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.height = 10;
        box1.length = 10;
        box1.weight = 10;
        box1.showVolume();

        Box box2 = new Box();
        box2.height = 10.5;
        box2.length = 11.5;
        box2.weight = 12.5;
        box2.showVolume();

        Box box3 = new Box();
        box3.height = 11.5;
        box3.length = 12.5;
        box3.weight = 13.5;
        box3.showVolume();
    }
}
