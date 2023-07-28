package com.education.zaurtregulov.demo;

public class Student {

    int ticketNumber;
    String name;
    String surname;
    int dataLearn;
    double averageMath;
    double averageEconomic;
    double averageLanguage;

    public Student(int ticketNumber, String name, String surname, int dataLearn,
                   double averageMath, double averageEconomic, double averageLanguage) {
        this.ticketNumber = ticketNumber;
        this.name = name;
        this.surname = surname;
        this.dataLearn = dataLearn;
        this.averageMath = averageMath;
        this.averageEconomic = averageEconomic;
        this.averageLanguage = averageLanguage;
    }

}
