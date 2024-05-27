package com.example.Multi;

public class Program {

    public static Multithreading mThing;

    public static void main(String[] args) {
        mThing = new Multithreading();

        Thread myThread = new Thread(mThing);

        myThread.start();

        System.out.println("Главный поток ");
    }
}
