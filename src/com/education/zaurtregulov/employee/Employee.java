package com.education.zaurtregulov.employee;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String department;

    public Employee(int id, String surname, int age, int salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    void increaseSalary () {
      this.salary = this.salary*2;
        System.out.println("Зарплата удвоена: " + salary);
    }
    void InfoShow () {
        System.out.println("ID: "+ id+", surname: " + surname + ", age: "+ age+", salary: " + salary+ ", department: " + department);

    }
}
