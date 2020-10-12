package com.ds.usc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Information information = new Information();
        information.Setuser();
        System.out.println( "name = " + information.getName());
        System.out.println("lastname = " + information.getLastname());
        System.out.println("age = " + information.getAge());
        System.out.println("job = " + information.getJob());
    }
}
