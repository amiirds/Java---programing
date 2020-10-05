package com.ds.usc;

import java.util.Scanner;

public class expetion {
    public expetion() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a string ");
        java.lang.String str = input.nextLine();
        if (str.matches(".*\\d.*")) {
            System.out.println("there are a number");
        } else {
            throw new Exception("\"" + str.length() + "\" is the length of your string");
        }
    }
}
