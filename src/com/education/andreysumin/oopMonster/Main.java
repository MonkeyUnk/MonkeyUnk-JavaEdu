package com.education.andreysumin.oopMonster;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        monster1.voice();
        monster1.voice(4);
       monster1.voice(1,"Rdozzz");
        Monster monster2 = new Monster(2);
        System.out.println(monster2.eyes+ ""+monster2.hands+""+ monster2.hands);
        Monster monster3 = new Monster(4,6,3);
        System.out.println("Eyes" + monster3.eyes+" hands"+ monster3.hands);
monster3.voice(1,"Craaaaashhhhh");

    }


    }

