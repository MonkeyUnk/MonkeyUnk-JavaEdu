package com.education.zaurtregulov.lesson12;

import com.education.zaurtregulov.lesson8nonaccess.StudentTest;

public class Homework12 {



    public static void compare (StudentTest s1,StudentTest s2) {
       if (s1==s2) {
           System.out.println("Students equals");
       }
       else
           System.out.println("Students not equals");
    }
    public static void compareDetails (StudentTest s1,StudentTest s2) {
        if (s1.name.equals(s2.name) & s1.course== s2.course) {
            System.out.println("Students total equals");
        } else if (s1.name.equals(s2.name)) {
            System.out.println("Students name equals");} else if (s1.course== s2.course) {System.out.println("Students course equals");}
           else {
            System.out.println("Students no equals");}
        }




    public static void main(String[] args) {


        StudentTest s2 = new StudentTest("Ivan",4);
        StudentTest s3 = new StudentTest("Ivan",3);
        StudentTest s4 = new StudentTest("Olga",3);
        StudentTest s5 = new StudentTest("Dmitry",1);

        compare(s4,s3);
        compareDetails(s5,s3);

    }

}
