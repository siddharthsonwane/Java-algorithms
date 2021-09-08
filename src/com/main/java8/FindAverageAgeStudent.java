package com.main.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindAverageAgeStudent {
    public static void main(String[] args) {

        List<Student> studentlist = new ArrayList<Student>();
        //Adding Students
        studentlist.add(new Student(11,"Jon",22));
        studentlist.add(new Student(22,"Steve",18));
        studentlist.add(new Student(33,"Lucy",22));
        studentlist.add(new Student(44,"Sansa",23));
        studentlist.add(new Student(55,"Maggie",18));

        Double avgAgeStudent = studentlist.stream()
                .collect(Collectors.averagingInt(s -> s.age));
        System.out.println(":::::::::"+avgAgeStudent);
    }
}
class Student{
    int id;
    String name;
    int age;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}