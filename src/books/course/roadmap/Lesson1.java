package books.course.roadmap;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int i = in.nextInt();
        System.out.print("Введите второе число: ");
        int k = in.nextInt();
        if (i>k) {
            System.out.println("Первое число больше второго" );
        } else if (i<k) {
            System.out.println("Второе число больше первого" );
        }
        else {
            System.out.println("Числа равны" );
        }
    }
}
