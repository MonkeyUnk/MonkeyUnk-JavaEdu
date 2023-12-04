package com.education.andreysumin.oopMan;

public class Main {
    public static void main(String[] args) {
        String s1 = "Это Иван, ему 34 года, его рост 166.3 см.Должность-программист)";
        String name = s1.substring(4,8);
        String grade = s1.substring(51,62);
        int age = Integer.parseInt(s1.substring(14,16));
        double weight = Double.parseDouble(s1.substring(32,37));

        Man man = new Man (name,grade,age,weight);


        System.out.println("Имя: "+ man.getName());
        System.out.println("Должность: "+ man.getGrade());
        System.out.println("Возраст: "+ man.getAge());
        System.out.println("Рост: "+ man.getWeight());
//

    }
}
