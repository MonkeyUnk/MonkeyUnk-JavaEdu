package com.education.zaurtregulov.lesson18;

public class Test1 {
    public static void main(String[] args) {


        int[] array1 = new int[5];
        String[][] s1 = new String[3][];

        int[][] array2 = new int[3][];
        array2[0] = new int[5];//0-й Элемент array2 (одномерный массив) будет иметь длину 5.
        array2[1] = new int[2];
        array2[2] = new int[7];
        for (int i = 0; i< array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {

                array2[i][j] = j + i;
                System.out.print(array2[i][j]);
            }
            System.out.println(" ");
        }

    }
}


