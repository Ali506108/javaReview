package com.example.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Number {

    public static void main(String[] args) {
        List<Integer> listNum = Arrays.asList(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 ,
                11 , 12 , 13 , 14 , 15 , 15 , 16 , 17 , 18 , 19 , 20);

        List<Integer> result = listNum.stream().filter(num -> num % 2 == 0)
                .map(n -> n * 2)
                .sorted((a,b) -> b - a)
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
