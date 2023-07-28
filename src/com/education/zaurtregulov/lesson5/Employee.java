package com.education.zaurtregulov.lesson5;
public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee (int i, String s, int a,double sal, String d) {
        id=i;
        surname=s;
        age=a;
        salary=sal;
        department=d;
    }
    void salaryPlus () {
        salary*=2;
    }

    void showInfo () {
        System.out.println("Surname: " + surname+"\n salary total: " + salary );
    }
}
class EmployeeTest {
    public static void main(String[] args) {
    Employee em1=new Employee(11,"Petrova",32,515.58,"Office");
    em1.salaryPlus();
    em1.showInfo();
    Employee em2=new Employee(10,"Sobaken",42,314.58,"Production");
    em2.salaryPlus();
    em2.showInfo();
    }
}



