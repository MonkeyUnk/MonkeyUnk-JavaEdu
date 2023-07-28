package com.education.zaurtregulov;

public class Human {
    String name;
    Car3 car;
    BankAccount ba;

    void info() {
        System.out.println("Name " + name + " Color " + car.color + " Balance " + ba.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human humanTest = new Human();
        humanTest.name = "Timosha";
        humanTest.car = new Car3("Yellow", "4boba");
        humanTest.ba = new BankAccount(2014, 1.3001);

        humanTest.info();


    }


}

class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;
    }

    String color;
    String engine;
}


class BankAccount {
    int id;
    double balance;

    BankAccount(int id2, double balance2) {
        id = id2;
        balance = balance2;

    }

    ;

}

