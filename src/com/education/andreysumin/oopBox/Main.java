package com.education.andreysumin.oopBox;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box current = new Box(12,12,12);
        Box another = current.increase();

        current.showVolume();
        another.showVolume();




    }
}
