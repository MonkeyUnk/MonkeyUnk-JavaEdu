package com.education.andreysumin.oopBox;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(13,12.5,16.9);
        box1.showVolume();

        Box box2 = new Box();
        box2.showVolume();

        Box box3 = new Box (0.555,6.31,12.8994);
        box3.showVolume();
    }
}
