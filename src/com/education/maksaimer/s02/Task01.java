package com.education.maksaimer.s02;

public class Task01 {

//     boolean remainder = false;
//     boolean notRemainder = true;

    public static void main(String[] args) {

        int[] array = division(5, 20, 5, 7);

        for (int j : array) {
            if (j != 0) {
                System.out.println(j);
            }

        }
    }

    static int[] division(int div, int ar1, int ar2, int ar3) {
        int[] array = new int[3];

        int result1 = ar1 % div;
        int result2 = ar2 % div;
        int result3 = ar3 % div;


        if (result1 == 0) {
            array[0] = ar1;
        }
        if (result2 == 0) {
            array[1] = ar2;
        }
        if (result3 == 0) {
            array[2] = ar3;
        }

        return array;
    }
}
