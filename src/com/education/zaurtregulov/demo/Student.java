package com.education.zaurtregulov.demo;

public class Student {

    int ticketNumber;
    String name;
    String surname;
    int dataLearn;
    double averageMath;
    double averageEconomic;
    double averageLanguage;

    Student(int ticketNumber, String name, String surname, int dataLearn,
                   double averageMath, double averageEconomic, double averageLanguage) {
        this.ticketNumber = ticketNumber;
        this.name = name;
        this.surname = surname;
        this.dataLearn = dataLearn;
        this.averageMath = averageMath;
        this.averageEconomic = averageEconomic;
        this.averageLanguage = averageLanguage;

    }

    Student(int ticketNumber, String surname) {
        this (ticketNumber,null,surname,0,0.0,0.0,0.0);
    }
    Student() {
    }

    public void getArithmeticMiddleValue(Student student) {

        double value = (student.averageMath + student.averageEconomic + student.averageLanguage) / 3;

        System.out.println("Arithmetic Middle Value: " + value);
        }

}
