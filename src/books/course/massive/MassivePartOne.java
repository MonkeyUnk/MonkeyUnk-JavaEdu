package books.course.massive;

import java.util.Arrays;

public class MassivePartOne {
    public static void main(String[] args) {
//        int[] smallPrimes = {1, 2, 3, 4, 5};
//        smallPrimes = new int[]{13, 32, 12};
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.println(a[i]);

        }
    }
}

