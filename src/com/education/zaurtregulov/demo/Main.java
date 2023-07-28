package com.education.zaurtregulov.demo;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(12, "Vasiliy", "Popov", 123,
                23.4,
                41.2,
                23.2);

        Student student2 = new Student(13, "Vasiliy", "Popov", 523,
                244.4,
                421.2,
                213.2);

        Student student3 = new Student(13, "Vasiliy", "Popov", 523,
                2144.4,
                4231.2,
                2513.2);

        Main main=new Main();
        main.getArithmeticMiddleValue(student2);
        main.getArithmeticMiddleValue(student1);
        main.getArithmeticMiddleValue(student3);

    }

    public void getArithmeticMiddleValue(Student student) {

        double value = (student.averageMath + student.averageEconomic + student.averageLanguage) / 3;

        System.out.println("Arithmetic Middle Value: " + value);
    }
}
