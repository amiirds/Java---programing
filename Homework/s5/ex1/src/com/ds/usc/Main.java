package com.ds.usc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Information information = new Information()
                .setUsername("amir")
                .setName("amirreza")
                .setPassword("amiirds")
                .setPhone_number(923213990)
                .setEducation_rate("diploma")
                .setAddress("afshin")
                .setAge(18);
        System.out.println(information.getUsername());
        System.out.println(information.getPassword());
        System.out.println(information.getName());
        System.out.println(information.getAddress());
        System.out.println(information.getAge());
        System.out.println(information.getPhone_number());
        System.out.println(information.getEducation_rate());

    }
}
