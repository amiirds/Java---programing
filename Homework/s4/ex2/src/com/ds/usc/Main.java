package com.ds.usc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner input = new Scanner(System.in);
        login_info p1 = new login_info();
        System.out.println("enter username");
        p1.user = input.nextLine();
        System.out.println("enter password");
        p1.pass = input.nextLine();

        login_info p2 = null;
        login_info p3 = null;
        login_info p4 = null;
        try {
            p2 = (login_info) p1.clone();
            p3 = (login_info) p1.clone();
            p4 = (login_info) p1.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println("1th username = " +p1.user);
        System.out.println("1th password = " +p1.pass);
        System.out.println("2th username = " +p2.user);
        System.out.println("2th password = " +p2.pass);
        System.out.println("3th username = " +p3.user);
        System.out.println("3th password = " +p3.pass);
        System.out.println("4th username = " +p4.user);
        System.out.println("4th password = " +p4.pass);


    }
}
