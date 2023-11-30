package books.course.loop;

import java.util.Arrays;
import java.util.Scanner;

public class RetiremetWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much money do you " + "need to retire?");
        double goal = in.nextDouble();
        System.out.println("How much money will you " + "contribute every year?");
        double payment = in.nextDouble();
        System.out.println("Interest rate in %: " );
        double interestRate = in.nextDouble();
        double balance=0;
        int years=0;
//        Обновить остаток на счету, пока не достигнута заданная сумма
        while (balance<goal)
        {
            balance+=payment;
            double interest = balance*interestRate/100;
            balance+=interest;
            years++;
        }
        System.out.println("You can retire in " + years + " years");
    }
}
