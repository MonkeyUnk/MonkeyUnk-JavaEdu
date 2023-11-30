package books.course.roadmap;

import java.util.Scanner;

public class Lesson5 {
//    За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//    Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
//    А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
//    Для вычисления суммы с учетом процентов используйте цикл for.
//    Пусть сумма вклада будет представлять тип float.

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Deposit amount");
//        float deposit = in.nextFloat();
//        System.out.println("Period");
//        int period = in.nextInt();
//        for (int i = 0; i<period;i++) {
//            deposit+=deposit*7/100;
//
//        }
//        System.out.printf("После %d месяцев сумма вклада составит %f", period, deposit);
        Scanner in = new Scanner(System.in);
        System.out.println("Deposit amount");
        float deposit = in.nextFloat();
        System.out.println("Period");
        int period = in.nextInt();
        int i = 1;
        while (i<=period){
            if (period>0)
            deposit+=deposit*1.2/100;
            i++;
        }
        System.out.printf("После %d месяцев сумма вклада составит %f", period, deposit);
    }
}
