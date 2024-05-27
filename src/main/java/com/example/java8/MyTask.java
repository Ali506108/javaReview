package com.example.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyTask {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Asel" , "Kairat", "Aidin" ,"Jeims" ,"Aldiar" , "Fergus" , "Asil");

        List<String> result = list.stream().filter(name -> name.startsWith("A"))
                .map(String::toUpperCase).collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
