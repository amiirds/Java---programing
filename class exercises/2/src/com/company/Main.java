package com.company;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.job();
        student.salary();
        System.out.println("------------");
        Teacher teacher = new Teacher();
        teacher.job();
        teacher.salary();
        System.out.println("------------");
        Employee employee = new Employee();
        employee.job();
        employee.salary();
    }
}
