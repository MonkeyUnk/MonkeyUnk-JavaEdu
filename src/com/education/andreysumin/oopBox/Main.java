package com.education.andreysumin.oopBox;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box current = new Box(12,12,12);
        Box another = new Box(10,100,12);
        current.compare(another);

    }
}
