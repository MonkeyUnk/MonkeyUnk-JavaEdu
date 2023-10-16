package com.education.andreysumin.oopDog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.name = "Gendalf";
        dog2.name = "Gretel";
        dog3.name = "Georg";

        dog1.breed = "Borzoi";
        dog2.breed = "Corgi";
        dog3.breed = "Ksolo";

        dog1.weight = 20;
        dog2.weight = 15;
        dog3.weight = 35;

        dog1.speed = 5;
        dog2.speed = 3;
        dog3.speed = 5;

        dog1.infoText();
        dog2.infoText();
        dog3.infoText();


    }
}
