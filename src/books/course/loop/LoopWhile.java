package books.course.loop;

import java.util.Arrays;

public class LoopWhile {
    public static void main(String[] args) {


        double balance;
        double goal;
        int payment;
        int years;
        double interestRate=10.0;
        years=0;
        balance=100;
        goal=10000;
        payment=20;
        while (balance<goal){
            balance+=payment;
            double interest = balance*interestRate/100;
            balance+=interest;
            years++;
        }
        System.out.println("Years: " + years);

    }
}
