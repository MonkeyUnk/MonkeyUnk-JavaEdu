package com.education.andreysumin.oopBox;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setDimens(10,10,10);
        box1.showVolume();

        Box box2 = new Box();
        box2.setDimens(11.5,12.5,13.5);
        box2.showVolume();

        Box box3 = new Box();
        box3.setDimens(1,1,1);
        box3.showVolume();
    }
}
