package books.course.stack;

import java.util.Arrays;

public class Stack {
    int[] stck = new int[10];
    int tos;

    //  инициализировать верхушку стека
    Stack() {
        tos = -1;
    }

    //     поместить элемент в стек
    void push(int item) {
        if (tos == stck.length-1) {
            System.out.println("Stack is full");}
        else {
            stck[++tos] = item;}
    }

    //    извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

class StackTest {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
//        поместить несколько чисел в стеки

        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);
        //        извлечь эти чсла из стека
        System.out.println("Stack in mystack1: ");
        for (int i = 0; i < 10; i++) mystack1.pop();
        System.out.println(mystack1.pop());
        System.out.println("Stack in mystack2: ");
        for (int i = 0; i < 10; i++) mystack2.pop();
        System.out.println(mystack2.pop());
    }
}
