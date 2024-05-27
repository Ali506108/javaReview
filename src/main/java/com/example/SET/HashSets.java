package com.example.SET;

import java.util.HashSet;

public class HashSets {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Ali");
        set.add("Alex");
        set.add("Alexandr");
        set.add("Geromy");
        set.add("George");

        for(String a: set){
            System.out.println(a);
        }
    }
}
