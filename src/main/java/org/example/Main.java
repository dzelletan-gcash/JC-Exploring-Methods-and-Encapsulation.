package org.example;

import org.example.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void changeStudentName(Student student, String newName) {
        student.name = newName;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name before change: " + student.name);
        changeStudentName(student, "Jordan");
        System.out.println("Name after change: " + student.name);
    }
}