package com.company;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {


        // ask how many students will be added to database
        System.out.println("Enter number of a new students to enroll :");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];

        // create a N number of students /new/
        for(int n = 0; n < numberOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuiton();

        }
        for(int n = 0; n < numberOfStudents; n++) {
            System.out.println(students[n].toString());
        }

    }
}
