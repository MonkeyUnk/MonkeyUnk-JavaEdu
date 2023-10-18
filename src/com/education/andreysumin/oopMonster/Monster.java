package com.education.andreysumin.oopMonster;

public class Monster {
    int eyes;
    int hands;
    int foots;
    Monster () {
        this (2,2,2);
    }
    Monster (int count) {
        this (count, count,count);

    }
    Monster (int eyes, int hands, int foots) {
        this.foots = foots;
        this.hands = hands;
        this.eyes = eyes;
    }
    void voice () {
        voice(1);

    }
    void voice (int count) {
       voice(count, "Grrrrr....");

        }
        void voice (int count, String word){
        for (int i = 0;i<count;i++ )
            System.out.println(word);
        }
    }


