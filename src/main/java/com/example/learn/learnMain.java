package com.example.learn;

public class learnMain {

    public static void main(String[] args) {
        Runnable runnable = () -> SayYes();
        new Thread(runnable).start();

        System.out.println("Запуск программы");

        System.out.println("Перед объявлением лямбды");

        Runnable r8 = () -> System.out.println("Я - лямбда!");

        System.out.println("После объявления лямбды");


        System.out.println("Перед передачей лямбды в тред");
        new Thread(r8).start();

    }

    protected static void SayYes(){
        System.out.println("Hey yes");
    }


}
