package books.course.roadmap.lesson4;

import java.util.Scanner;

public class T02 {
    //    Ввести с клавиатуры целое число. Вывести в консоль сумму его цифр.
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        int number = scanner.nextInt();
//
//        int sum = 0;
//        int tempNumber = number;
//
//        while (tempNumber != 0) {
//            sum += tempNumber % 10;
//            tempNumber /= 10;
//        }
//        System.out.println("Сумма всех цифр в числе:" + sum);

//второй способ
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String number = scanner.nextLine();

        char [] simbols = new char[number.length()];
        number.getChars(0,number.length(),simbols,0 );

        int numbers [] = new int[simbols.length];
        for (int i = 0; i<simbols.length; i++) {
            numbers[i] = Character.getNumericValue(simbols[i]);
        }

        int sum=0;
        for (int i=0; i <numbers.length;i++){
            sum+=numbers[i];
        }
        System.out.println(numbers[0]);

        System.out.println(sum);


        }

    }




