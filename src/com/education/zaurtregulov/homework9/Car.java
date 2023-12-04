package com.education.zaurtregulov.homework9;

public class Car {

    String color;
    String engine;
    int doors;

    public Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}


class CarTest {
public static void changeDoors (Car c1, int i) {
    c1.doors = i;
}
public static void changeColor (Car c1,Car c2) {
  String color = c1.color;
    c1.color = c2.color;
    c2.color = color;
}

    public static void main(String[] args) {
    Car car1 = new Car("Red","V6",4);
    Car car2 = new Car("White","V6",6);

        System.out.println(car2.color);
        changeColor(car1,car2);
        System.out.println(car2.color);
        changeDoors(car2,2);
        System.out.println(car2.doors);


    }
    }

