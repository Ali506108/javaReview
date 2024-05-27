package com.example.sexcend_week;

import java.util.ArrayList;
import java.util.List;

public class Main_Os {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Dr. Smith", 45, "Professor");

        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Alice", 19, "CS2025", new ArrayList<>());
        students.add(student1);

        Course course = new Course("Computer Science 101", teacher, students);

        student1.addCourse(course);


    }

}
