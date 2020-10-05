package com.ds.usc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a string ");
        String str = input.nextLine();
        if (str.matches(".*\\d.*")){
            System.out.println("there are a number");
        }
        else {
            System.out.println("\"" + str.length()  + "\" is the length of your string");
        }
    }
}
