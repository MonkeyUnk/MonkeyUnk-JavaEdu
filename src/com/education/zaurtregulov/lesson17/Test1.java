package com.education.zaurtregulov.lesson17;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder (sb2);
        StringBuilder sb5 = new StringBuilder("Hello, ");
        StringBuilder sb6 = new StringBuilder("Good day!Today Good day!");
        StringBuilder sb7 = new StringBuilder("123");
        StringBuilder sb8 = sb7.append("45");
        sb8=sb8.append("6").append("7");
        StringBuilder sb9 = new StringBuilder("1234567");


//        Methods
        System.out.println(sb2.length());
        System.out.println(sb2.charAt(0));
        System.out.println(sb2.indexOf("a"));
        System.out.println(sb2.substring(5));
        System.out.println(sb2.subSequence(0,4));
        System.out.println(sb2.append("Today"+" "+sb2));
        System.out.println(sb2.insert(0,"Yesterday "+"and"+" "+"now "));
        System.out.println(sb5.insert(7,"world"));
        System.out.println(sb5.append("!"));
        System.out.println(sb5.delete(0,7));
        System.out.println(sb5.deleteCharAt(3));
        System.out.println(sb6.reverse());
        System.out.println(sb6.reverse());
        System.out.println(sb6.replace(8,24,", Timosha!"));
        System.out.println("sb7 =: "+ sb7+"sb8 =: "+sb8);
        System.out.println(sb9.equals(sb7));
//        В параметр конструктора String можно вставлять StringBuilder
        String s = new String(sb5);
        System.out.println(s.equals(sb5)); //false
        System.out.println(s);


    }
}
