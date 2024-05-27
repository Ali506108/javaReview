package com.example.SET;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.util.TreeSet;

public class Person implements Comparable<Person> {
    @Override
    public int compareTo(@NotNull Person other) {
        return Integer.compare(this.age, other.age);
    }

    private String fullName;

    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }


    public Person(){}


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }


    public static void main(String[] args) {
        Person person = new Person();
        Scanner scn = new Scanner(System.in);
        TreeSet<Person> set = new TreeSet<>();

        while(true){
            System.out.println("нажмитк stop если хотите выйти");
            System.out.print("Write FullName: ");
            String input = scn.nextLine();

            if(input.equals("stop")){
                break;
            }
            System.out.print("Write age: ");
            int age = scn.nextInt();

            scn.nextLine();

            set.add(new Person(input, age));
        }
        set.forEach(System.out::println);
    }
}
