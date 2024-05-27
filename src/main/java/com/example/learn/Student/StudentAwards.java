package com.example.learn.Student;

import java.util.ArrayList;

public class StudentAwards implements BestStudent{

    public Student theMostGpa(ArrayList<Student> students){
        return students.stream().max((s1,s2) -> Double.compare(s1.getGpa(), s2.getGpa())).orElse(null);
    }

    public Student MostAge(ArrayList<Student> students){
        return students.stream().max((s1,s2) -> Integer.compare(s1.getAge(), s2.getAge())).orElse(null);
    }

    public Student MostHeight(ArrayList<Student> students){
        return students.stream().max((s1,s2) -> Integer.compare(s1.getHeight(), s2.getHeight())).orElse(null);
    }


    @Override
    public Student theBestStudent(ArrayList<Student> students) {
        return students.stream().max((s1,s2) -> Double.compare(s1.getGpa(), s2.getGpa())).orElse(null);
    }
}
