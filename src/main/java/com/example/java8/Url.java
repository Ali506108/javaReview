package com.example.java8;

import java.util.Arrays;
import java.util.List;

public class Url {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("orange","banana" ,"grape","test","apple","meat");

        list.sort(String::compareTo);
        list.forEach(System.out::println);
    }
}
