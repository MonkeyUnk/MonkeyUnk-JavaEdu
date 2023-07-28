package com.education.andreysumin;

public class Strings {
    public static void main(String[] args) {
        /*String s = "Hello";
        String world = " world";
        String result = s + world + "!";
        System.out.println(result);*/
        String name = "Timosha";
        double age = 9.5;
        // System.out.println("Hello " + name + "!");
        // System.out.println("Your is " + age + " " + "years old" + "." );

        String result = "Hello, \"" + name +"\"" + "!"+'\n' + "Your is " + age + " years old.";
        System.out.println(result);
    }
}
