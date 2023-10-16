package com.education.andreysumin.homeworkRectangle;

public class Rectangle {
    double length;
    double width;

    void setDimens (double length, double width) {
        this.length=length;
        this.width=width;
    }
    double squareRectangle () {
        double result = length * width;
        System.out.println("Square: " + result);
        return result;

    }
}
