package com.education.andreysumin;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
//        String [] studentsNames = {"Ivan","Ann", "Vasya", "Tima","Olga" };
//       for (String names: studentsNames) {
//           System.out.println(names);
//       }
        int [] numbers = new int[100];
        for (int i = 0; i< numbers.length; i++) {
            numbers [i] = i + 100;
            System.out.println(numbers[i]);
        }
        for (int number: numbers) {
            System.out.println(number);
        }


    }
}
