package com.education.andreysumin.oopWorker;

public class Main {
    public static void main(String[] args) {
        Worker worker1= new Worker("John Wick","manager", 14.09);
        worker1.showInfo();
        Worker worker2= new Worker("Cristina Charles", "doctor", 87.34);
        worker2.showInfo();
    }


}
