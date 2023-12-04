package com.education.zaurtregulov.lesson8nonaccess;

public class StudentTest {
    public String name;
    public int course;
    static int count;

    public StudentTest(String name, int course) {
        this.name = name;
        this.course = course;
        count++;
        System.out.println("Student" + "  " + count + " " + name);
    }

    public static void showCount() {
        System.out.println("Total students:" + count);
    }

//    class StudentTest1 {
    public static void main(String[] args) {
        StudentTest s1 = new StudentTest("Ivan",2);
        StudentTest s2 = new StudentTest("Fedor", 3);
        StudentTest s3 = new StudentTest("Anna", 5);
        System.out.println(StudentTest.count);
        StudentTest.showCount();

    }
}
