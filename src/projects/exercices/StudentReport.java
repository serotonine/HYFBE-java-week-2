package exercices;
/*
 * Student Report (Arrays + Objects)
 * Concepts used: Arrays of objects, loops, classes.
 *
 * Create a Student class with fields: name, age, marks.
 * Create an array of Student objects.
 * Use a loop to display each student’s information.
 * Add a method isPassed() that checks if marks ≥ 40.
 * Print whether each student passed or failed.
 */

import java.util.Arrays;

public class StudentReport {
    public static void main(String[]args) {
        String[] names = {"Barnabé", "Clothilde", "Mourad", "Pauline", "Ahmed", "Bora", "Fatima", "Norbert", "Cleopatre", "Eric"};
        int[] ages = {32, 24, 19, 27, 45, 22, 34, 23, 19, 40};
        int[] marks = {25, 60, 80, 39, 45, 22, 99, 55, 41, 40};
        int limit = 10;
        Student[] students = new Student[limit];

        for (int i = 0; i < limit; i++) {
            students[i] = new Student(names[i], ages[i], marks[i]);
            String success = students[i].isSuccessful() ? " PASSED" : " FAILED";
            System.out.println(students[i].name + " age " + students[i].age + " | Score: " + students[i].marks + success );
        }
    }
}

class Student{
    String name;
    int age;
    int marks;
    Student(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public boolean isSuccessful(){
        return this.marks >= 40;
    }
}
