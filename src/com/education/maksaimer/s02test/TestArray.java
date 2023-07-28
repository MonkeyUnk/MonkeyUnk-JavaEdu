package com.education.maksaimer.s02test;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int n = 10;

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i * i;
        }
        ;


        for (int i = 0; i < n; i++) {
            System.out.println("args = " + array[i]);

        }
    }
}

