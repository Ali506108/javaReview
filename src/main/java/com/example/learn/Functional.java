package com.example.learn;

import java.util.Scanner;
import java.util.function.*;

public class Functional {
    public static void main(String[] args) {
        /*
        MyInterface myInterface = () -> System.out.println("Hi");
        myInterface.myMethod();


        Predicate<String> text = a -> !a.isEmpty();
        System.out.println(text.test("Hello"));
        System.out.println(text.test(""));


        Function<String,Integer> a = String::length;

        System.out.println(a.apply("Hello"));

         */

        Scanner scn = new Scanner(System.in);
        Supplier<Integer> supplier = () -> 5+5;

        System.out.println(supplier.get());


        Consumer<Integer> print = System.out::println;

        print.accept(5+5);


        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a+b;

        System.out.println(biFunction.apply(1, 2));
        Function<Integer , String> a = String::valueOf;
        System.out.println(a.apply(125));

        String astr = "STR";
        Supplier<Integer> supplier1 = astr::length;
        System.out.println(supplier1.get());
    }
}
