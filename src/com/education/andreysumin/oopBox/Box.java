package com.education.andreysumin.oopBox;

public class Box {
    double weight;
    double length;
    double height;

    Box() {
        this.length = 10;
        this.height = 10;
        this.weight = 10;
    }

    Box(Box another) {
        this(another.length, another.height, another.weight);
    }
    Box(double weight, double length, double height) {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }


    void setDimens(double weight, double length, double height) {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }


    double getVolume() {
        return weight * length * height;

    }

    void showVolume() {
        System.out.println("volume: " + getVolume());

    }

//    void compare(Box another) {
//        double currentVolume = getVolume();
//        double anotherVolume = another.getVolume();
//        if (currentVolume > anotherVolume) {
//            System.out.println("Another box < current box" );
//        } else if (currentVolume < anotherVolume) {
//            System.out.println("Another box > current box");
//        } else  {
//            System.out.println("Another box == current box");
//        }

//    }

    int compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        int result;
        if (currentVolume > anotherVolume) {
            result = 1;
        } else if (currentVolume < anotherVolume) {
            result = -1;
        } else {
            result =  0;
        }
        return result;
    }
    Box copy () {
        return new Box(this.weight,this.height,this.length);
    }
    Box increase () {
        return new Box(weight*2,length*2,height*2);
    }
}


