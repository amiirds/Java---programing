package com.ds.usc;

import java.util.Scanner;

public class info {
    public info() throws Exception {
        String org_name = "amirreza";
        String user_name = "amiirds";
        String pass_word = "amirreza44";
        Scanner input = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("              login         ");
        System.out.println("***********************************");
        System.out.print("enter your name = ");
        String name = input.nextLine();
        System.out.print("enter your user_name = ");
        String username = input.nextLine();
        System.out.print("enter your password = ");
        String password = input.nextLine();
        if (!name.equals(org_name) && !username.equals(user_name) && !password.equals(pass_word)) {
            System.out.println("false information\ntry again");
            throw new Exception("false information\ntry again");
        }
        else System.out.println("you have been logged in");
    }
}
