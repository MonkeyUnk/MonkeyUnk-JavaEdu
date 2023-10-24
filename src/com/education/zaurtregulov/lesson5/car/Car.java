package com.education.zaurtregulov.lesson5.car;

public class Car {
    String color;
    String engine;
    int speed;
Car (String color,String engine,int speed) {
    this.color = color;
    this.engine = engine;
    this.speed = speed;
}


    int gas (int skorost) {
        speed+=skorost;
        return speed;
    }
    int tormoz (int skorost) {
        speed-=skorost;
        return speed;
    }
    void showInfo () {
        System.out.println("Color: " + color + ", engine: " + engine + ", speed: " + speed );
    }
}
