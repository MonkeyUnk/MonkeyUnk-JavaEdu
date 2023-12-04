package com.education.andreysumin.oopMan;

public class Man {
    private String name;
    private String grade;
    private int age;
    private double weight;

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public Man(String name, String grade, int age, double weight) {
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.weight = weight;

    }
}
