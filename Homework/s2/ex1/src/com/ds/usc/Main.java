package com.ds.usc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;
        float a;
        float b;
        System.out.println("     calculator    ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = input.nextFloat();
        b = input.nextFloat();
        System.out.println("Enter 1 to sum");
        System.out.println("Enter 2 to minus");
        System.out.println("Enter 3 to multiply");
        System.out.println("Enter 4 to division");
        choice = input.nextInt();
        calculate calculate = new calculate();

        switch (choice) {
            case 1 -> calculate.sum(a, b);
            case 2 -> calculate.minus(a, b);
            case 3 -> calculate.multiply(a, b);
            case 4 -> calculate.div(a, b);
            default -> System.out.println(" please enter 1-4 ");
        }
    }
}
