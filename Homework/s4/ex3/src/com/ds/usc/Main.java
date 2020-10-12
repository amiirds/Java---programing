package com.ds.usc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        student_information student_information = new student_information();
        Scanner input = new Scanner(System.in);
        System.out.println("enter your fullname");
        student_information.setFullname(input.nextLine());
        System.out.println("enter your fathername");
        student_information.setFathername(input.nextLine());
        System.out.println("enter student number");
        student_information.setStudent_number(input.nextLine());
        List <Double> grade = new ArrayList<>();
        System.out.println("enter your first grade");
        grade.add(input.nextDouble());
        System.out.println("enter your second grade");
        grade.add(input.nextDouble());
        System.out.println("enter your third grade");
        grade.add(input.nextDouble());
        System.out.println("enter your fourth grade");
        grade.add(input.nextDouble());
        System.out.println("enter your fifth grade");
        grade.add(input.nextDouble());
        System.out.println(student_information.getFullname());
        System.out.println(student_information.getFathername());
        System.out.println(student_information.getStudent_number());

    }
}
