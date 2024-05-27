package com.example.SET;


import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSets {

    public static void main(String[] args) {
        LinkedHashSet<String> hashset = new LinkedHashSet<>();

        hashset.add("France");
        hashset.add("British");
        hashset.add("German");
        hashset.add("Sweden");


        for(String s: hashset){
            System.out.println(s);
        }
        System.out.println();
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Alex");
        treeSet.add("Michael");
        treeSet.add("Jeremy");
        treeSet.add("Mike");

        for(String q:treeSet){
            System.out.println(q);
        }

    }
}
