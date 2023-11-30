package books.course.loop;

import java.util.Arrays;

public class LoopIfElse {
    public static void main(String[] args) {
        int target;
        int yourSales;
        double bonus;

        target=5;
        yourSales=8;

//        if (yourSales>=target)
//        {
//             bonus =100 + 0.01*(yourSales-target);
//            System.out.println("Satisfactory " + bonus);
//        }
//        else {
//            System.out.println("Unsatisfactory " );
//        }
        if (yourSales>=2*target) {
            bonus = 1000;
            System.out.println("Excellent " +"Your bonus: "+ bonus);
        } else if (yourSales>=1.5*target) {
            bonus = 500;
            System.out.println("Fine " +"Your bonus: "+ bonus);

        } else if (yourSales>=target) {
            bonus = 100;
            System.out.println("Satisfactory " +"Your bonus: "+ bonus);

        }
        else {
            System.out.println("You're fired" );
        }
    }
}
