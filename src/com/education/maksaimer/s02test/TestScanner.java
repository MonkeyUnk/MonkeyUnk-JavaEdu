package com.education.maksaimer.s02test;

import java.util.Arrays;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        int n = requestNumber ();
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        return scanner.nextInt();
    }
}
