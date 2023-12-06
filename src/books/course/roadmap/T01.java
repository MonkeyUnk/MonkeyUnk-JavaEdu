package books.course.roadmap;

import java.util.Scanner;

public class T01 {
    //    Ввести с клавиатуры целое число. Вывести в консоль его факториал.
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();
        int fact = 1;
        while (number>0) {
            fact = fact*number;
            number--;
        }
        System.out.println(fact);
    }
}





