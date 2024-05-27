package com.example.java8;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SecendTask {
    public static void main(String[] args) {
        int num = 4;
        Predicate<Integer> a = i -> i % 2 == 0;

        System.out.println(a.test(num));


        Function<String , Integer> func = String::length;

        System.out.println(func.apply("abc"));


        Supplier<Date> date = Date::new;

        System.out.println(date.get());


        Consumer<String> out = s -> System.out.println("Hello " + s);

        out.accept("Aser");
    }
}
