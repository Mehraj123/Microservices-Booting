package com.student.util;

import java.util.ArrayList;
import java.util.List;

import com.student.model.Student;

public class Util {

    public static List<Student> provideStudents() {
        Student ironMan = new Student(1, "Iron Man");
        Student hulk = new Student(2, "Hulk");
        Student caption = new Student(3, "Caption America");
        Student bucky = new Student(4, "Winter Soldier");
        Student quickSilver = new Student(5, "Quick Silver");
        Student warMachine = new Student(6, "War Machine");
        Student blackWidow = new Student(7, "Black Widow");
        List students = new ArrayList();
        students.add(ironMan);
        students.add(hulk);
        students.add(caption);
        students.add(bucky);
        students.add(quickSilver);
        students.add(warMachine);
        students.add(blackWidow);
        return students;
    }
}
