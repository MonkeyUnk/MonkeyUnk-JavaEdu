package com.education.zaurtregulov.lesson18;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        int index1 = Arrays.binarySearch(array1, -8);
        System.out.println(index1);
        double array [] =  {-12.5,-13.3,-5.5,-273,0};
        Test2.maxmin(array);
        maxmin(new double[] {-10,8,34,12,123.34,-134.25});
        char [] arrays = {'H','e','l','l','o'};
//        String s = new String(arrays);
//        System.out.println(s);
//
        StringBuilder sb1 = new StringBuilder("hello world");
        System.out.println(sb1.append(arrays,2,3));
        System.out.println(sb1.insert(2,arrays,1,3));
    }

    public static void maxmin(double[] array1) {
        double max = array1[0];
        double min = array1[0];

        for (int i = 1; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            }
            if (min > array1[i]) {
                min = array1[i];
            }

        }
        System.out.println("Value max: " + max+" Value min:" + min);
    }
}
