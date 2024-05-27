package com.example.sexcend_week;

import java.util.List;

public class Student extends Human implements System{

    private String group;
    private List<Course> courses;


    public Student(String name, int age, String group, List<Course> courses) {
        super(name, age);
        this.group = group;
        this.courses = courses;
    }

    public Student() {
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void deleteCourse(Course course) {
        courses.remove(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
