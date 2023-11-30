package com.education.zaurtregulov.employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Petrov",38,5000,"marketing");
        System.out.println(employee1);;
        employee1.increaseSalary();
        System.out.println(employee1);;



    }
}
