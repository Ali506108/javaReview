package com.example.Multithreading;

public class Main {

    public static void main(String[] args) throws InterruptedException {
    /*    MyMultithreading t1 = new MyMultithreading();
        SecendTask t2 = new SecendTask();
        t1.start();
        t2.run();*/

        Counter count = new Counter();
        Thread t1 = new Thread(() -> {
            for(int i = 0 ; i < 10;i++){
                count.increment();
            }
        });

        Thread t2v = new Thread(() -> {
            for(int i = 0 ; i<12;i++){
                count.increment();
            }
        });

        Thread t3 = new Thread(() -> {
            for(int i = 0 ; i < 10;i++){
                count.increment();
            }
        });

        t1.start();
        t2v.start();
        t3.start();

        t1.join();
        t2v.join();
        t3.join();
        System.out.println("final count: " + count.getCount());
    }
}
