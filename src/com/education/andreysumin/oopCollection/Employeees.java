package com.education.andreysumin.oopCollection;

import java.util.Arrays;

public class Employeees {
    public static void main(String[] args) {
//        String [] employees = getEmployees();
//        for (String emploee: employees) {
//            System.out.println(emploee);
//        }
//
//    }
//
//    private static String [] getEmployees () {
//        String [] employees = new String[5];
//        employees [0] = "John";
//        employees [1] = "Mila";
//        employees [2] = "Georg";
//        employees [3] = "Fabricio";
//        employees [4] = "Lila";
//        return employees;
        MyArrayList employees = new MyArrayList();
        employees.add("Ivan");
        employees.add("Mila");
        employees.add("Nina");
        employees.add("Georg");
        employees.add("John");
        employees.add("Sarah");
    employees.remove("Ivan" );
//        for (int i = 1; i <= 2; i++) {
//            employees.add("Employer" + i);
//        }


        for (int i = 0; i< employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }


    }
}
