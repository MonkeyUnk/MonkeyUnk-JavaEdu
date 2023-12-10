package com.education.zaurtregulov.lesson17;

public class Homework17 {
   static boolean equality (StringBuilder num1,StringBuilder num2){
       boolean b = true;
       if (num1.length() == num2.length()) {
           for (int i = 0; i < num1.length(); i++) {
               if (num1.charAt(i)!=num2.charAt(i)){
                   b = false;
                   break;
               }
           }
       } else {
           b=false;
       }

       return b;
   }

    public static void main(String[] args) {
      StringBuilder st1 = new StringBuilder("123");
      StringBuilder st2 = new StringBuilder(" 123");
        System.out.println(equality(st1,st2));
    }
}