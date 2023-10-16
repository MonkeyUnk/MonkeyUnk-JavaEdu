package com.education.andreysumin.oopDog;

public class Dog {
    String name;
    String breed;
    double weight;
    int speed;

    void infoText () {
        System.out.println("Name:"+ name+", breed:" + breed + ", weight:" + weight);
        for (int i = 0; i<speed; i++) {
            System.out.println("Run");
        }
    }

}
