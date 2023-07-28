package com.education.maksaimer.s02;

public class Task03 {


   public static int typeTetragon(int a, int b, int c, int d) {
        int sum = (a + b + c + d) % 4;
        if (sum == 0) {
            System.out.println("Quadro");

        } else {
            System.out.println("Parallepipid");
        }
        {
        }
        return sum;
    }

    public static void main(String[] args) {
       typeTetragon(1,1,1,1);


    }

    }








