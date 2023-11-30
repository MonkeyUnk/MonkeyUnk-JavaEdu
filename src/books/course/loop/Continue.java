package books.course.loop;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        int sum = 0;
        int goal = 10;
        Scanner in = new Scanner(System.in);
        while (sum < goal) {
            System.out.println("Enter a number");
            int n = in.nextInt();
            if (n < 0) continue;
            sum += n;
        }
        for (int count = 1; count <= 100; count++) ;
        {
            System.out.println("Enter a number, -1 to quit:  ");
            int k = in.nextInt();
//            if (k < 0) continue;
            sum += k;




        }
    }
}
