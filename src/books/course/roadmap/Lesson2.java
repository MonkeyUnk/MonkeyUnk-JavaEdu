package books.course.roadmap;

import java.util.Scanner;

public class Lesson2 {
//    Напишите консольную программу, в которой пользователь вводит с клавиатуры число.
//    Если число одновременно меньше 9 и больше 2,
//    то программа выводит "Число больше 5 и меньше 10".
//    Иначе программа выводит сообщение "Неизвестное число".
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввeдите число:" );
        int number =  in.nextInt();
        if (number<9 & number>2) {
            System.out.println("Число больше 2 и меньше 10" );
        }
        else {
            System.out.println("Неизвестное числ" );
        }

    }
}
