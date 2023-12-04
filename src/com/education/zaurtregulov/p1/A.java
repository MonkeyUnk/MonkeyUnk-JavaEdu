package com.education.zaurtregulov.p1;

import com.education.zaurtregulov.p1.p2.p3.C;
import com.education.zaurtregulov.p1.p2.p3.p4.D;
import com.education.zaurtregulov.p1.p2.p3.p4.p5.E;

import static com.education.zaurtregulov.p1.p2.B.kof;


public class A {



    public static void showInfo() {
        E parametr = new E ();
        System.out.println(parametr.height+ " "+ parametr.weight);
        D face = new D();
        System.out.println(face.colorEye+" "+face.colorHair);
        C car = new C("V8","black");
        System.out.println(car);
        System.out.println("Example" + kof);
        System.out.println(parametr.height/ parametr.weight*kof);



    }


}
