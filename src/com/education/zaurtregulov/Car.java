package com.education.zaurtregulov;

public class Car {
    String color;
    String engine;
    int speed;

    int gaz (int skorost) {
        speed+=skorost;
        return speed;
    }

    int tormoz (int skorost) {
        speed-=skorost;
        return speed;
    }

    void showInfo (){
        System.out.println( "Color: " +color+'\n'+"Engine: " + engine + '\n'+"Speed: " + speed);
    }

}
 class CarTest {
     public static void main(String[] args) {
         Car carTest = new Car();
         carTest.color = "Black";
         carTest.engine = "V6";
         carTest.speed = 60;

         carTest.showInfo();
         carTest.gaz(20);
         carTest.showInfo();
         carTest.tormoz(40);
         carTest.showInfo();
     }
 }
