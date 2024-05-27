package com.example.learn;

import java.util.LinkedList;
import java.util.List;

public class lMain {
    public static void main(String[] args) {
        List<User> user = new LinkedList<>();

        user.add(new User("Ali"));
        user.add(new User("Bob"));
        user.add(new User("Dan"));

        user.forEach(User::print);

    }

    private static class User {
        private String name;

        public User(String name){
            this.name = name;
        }

        public void print(){
            System.out.println("Hello " + name);
        }
    }

}
