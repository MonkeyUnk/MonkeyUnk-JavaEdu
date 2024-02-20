package books.course.stepik;

import java.util.Scanner;

public class Stepik {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");

        int number = in.nextInt();
        int sum = 0;

        while (number!=0) {
            sum+=number%10;
            number/=10;
        }
        System.out.println(sum);



    }
}




//       char c1='a';
//       char c2 ='b';
//       int sum = c1+c2;
//       char literal = (char) sum;
//        System.out.println(sum);
//        System.out.println(literal);

//    }

