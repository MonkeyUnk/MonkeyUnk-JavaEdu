package com.education.zaurtregulov.bank_account;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(1,100.15);
        bankAccount1.popolneniueSheta(20);
        bankAccount1.snyatieSheta(120);
        bankAccount1.popolneniueSheta(800);

    }
}
