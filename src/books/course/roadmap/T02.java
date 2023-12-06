package books.course.roadmap;

import java.util.Scanner;

public class T02 {
    //    Ввести с клавиатуры целое число. Вывести в консоль сумму его цифр.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int sum = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            sum += tempNumber % 10;
            tempNumber /= 10;
        }
        System.out.println("Сумма всех цифр в числе:" + sum);


//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите число");
//        String text = in.nextLine();

//        int number = in.nextInt();
//        int fact = 1;
//        while (number>0) {
//            fact = fact*number;
//            number--;
//        }
//        System.out.println(fact);
    }
}



