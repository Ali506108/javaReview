package com.example.sexcend_week;

import java.util.stream.Stream;

public class Teacher extends Human{
    private static Student students;
    private String rang;

    public Teacher(String name, int age, String rang) {
        super(name, age);
        this.rang = rang;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }


    public static void allName(){
        System.out.println("Students taught by " + students.getName() + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }

    }
}
