package com.company;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private int coustOfCourse = 600;
    private static int id = 1001;

    // const    for students name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name : ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name : ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level : ");
        this.gradeYear = in.nextInt();


        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + studentID);

    }

    // generate ID
    private void setStudentID() {

        //grade lvl + id
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // enroll in courses
    public void enroll() {
        // loop user hits Q
        do {
            System.out.println("Enter course to enroll ( Q to quit) : ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + coustOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
        System.out.println("Enrolled in course: " + courses);
        System.out.println("Tuition Balance: " + tuitionBalance);

    }

    // view balance
    public void viewBalance() {
        System.out.println("Your balance is: " + tuitionBalance);
    }

    // pay tuition
    public void payTuiton() {
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $ : " + payment);
        viewBalance();
    }

    // show status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade level : " + gradeYear +
                "\nStudentID : " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance : $" + tuitionBalance;
    }
}
