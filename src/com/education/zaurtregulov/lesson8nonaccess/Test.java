package com.education.zaurtregulov.lesson8nonaccess;

public class Test {
    int a = 1;
   static int b= 2;
    void abc (int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test.b);
    }

}
class Test1 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.abc(4);
    }

}
