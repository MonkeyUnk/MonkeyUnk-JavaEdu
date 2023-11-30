package books.course;

import java.util.Arrays;

public class OverloadDemo {
//    Демонстрация перегрузки методов
    void test () {
        System.out.println("Параметры отсутствуют");
    }
//    Перегрузить test для одного целочисленного параметра
    void test (int a) {
        System.out.println("a: "+ a);
    }
    //    Перегрузить test для целочисленных параметров
    void test (int a, int b) {
        System.out.println("a & b: "+  a+ " & " + b);
    }
    //    Перегрузить test одного double параметра
    double test (double a) {
        System.out.println("double a: "+ a);
        return a*a;
    }
}
class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
//        Вызвать все три test ()
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("Результат вызова ob.test(123.25):" + result);
    }
}