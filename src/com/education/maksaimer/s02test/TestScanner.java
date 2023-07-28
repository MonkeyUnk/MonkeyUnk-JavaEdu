package com.education.maksaimer.s02test;

import java.util.Arrays;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        int n = requestNumber ();
        for (int b = 0; b < n; b++) {
            if (b % 2 != 0) {
                System.out.println(b);
            }
        }

    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        return scanner.nextInt();
    }
}
