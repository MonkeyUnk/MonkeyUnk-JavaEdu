package books.course.roadmap;

import java.util.Scanner;

public class Lesson4 {
//    Напишите консольную программу, которая выводит пользователю сообщение
//    "Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение".
//    Рядом с названием каждой операции указан ее номер, например, операция вычитания имеет номер 2.
//    Пусть пользователь вводит в программе номер операции, и в зависимости от этого номера программа
//    выводит название операции.
//Для определения операции по введенному номеру используйте конструкцию switch...case.
//Если введенное пользователем число не соответствует никакой операции (например, число 120),
// то выведите пользователю сообщение о том, что операция неопределена.
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите первое число ");
    double firsNumber = in.nextDouble();
    System.out.println("Введите второе число ");
    double secondNumber = in.nextDouble();
    System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение");
    int number = in.nextInt();
    double result=0;
    switch (number) {
        case 1:
            result = firsNumber + secondNumber;
            break;
        case 2:
            result = firsNumber - secondNumber;
            break;
        case 3:
            result = firsNumber * secondNumber;
            break;
        default:
            System.out.println("операция неопределена");
    }

            if (number >= 1 && number <= 3) {
                System.out.printf("Результат операции: %f",result);
            }

}
}
