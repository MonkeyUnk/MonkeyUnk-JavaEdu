package com.education.zaurtregulov;

public class Method {
    int summa (int a, int b, int c) {
        int result = a+b+c;
        result++;

        return result;
    }
}
class MethodTest {
    public static void main(String[] args) {
        Method MethodTest = new Method ();
        int summaTrexChisel = MethodTest.summa(5,10,0);
        System.out.println(summaTrexChisel);
        System.out.println(MethodTest.summa(1,2,3));

    }
}
