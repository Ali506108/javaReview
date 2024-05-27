package com.example.Multi;

public class Secrend {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Hello");
            }
        });


        t1.start();

        System.out.println("German empire");
    }
}
