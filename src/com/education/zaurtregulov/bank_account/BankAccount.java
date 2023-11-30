package com.education.zaurtregulov.bank_account;

public class BankAccount {
    int id;
    double balance;

    BankAccount(int id, double balance) {
        this.balance = balance;
        this.id = id;
    }

    double popolneniueSheta (int summa) {
        balance+=summa;
        System.out.println("Popolnene cheta: " + summa + " Vash balance sostovlyaet: " + balance);
        return balance;
    }
    double snyatieSheta (int summa) {
        if (balance >= summa && summa >=0) {
        balance-=summa;
        System.out.println("Snyatie so cheta: " + summa+" Vash balance sostovlyaet: " + balance);}
        else {
            System.out.println("Sredstv nedostatochno" +" Vash balance sostovlyaet: "+ balance);
        }
            return summa;
    }


}
