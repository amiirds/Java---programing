package com.ds.usc;

import java.util.Scanner;

public class Sign_Info {
    private static Sign_Info sign_info;

    public synchronized static Sign_Info getInstance(){
        if (sign_info == null){
            sign_info = new Sign_Info();
        }
        return sign_info;
    }
    private Sign_Info(){}
    public void site(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name = input.nextLine();
        System.out.println("enter your username");
        String username = input.nextLine();
        System.out.println("enter your password");
        String password = input.nextLine();
        System.out.println(name);
        System.out.println(username);
        System.out.println(password);
    }
}
