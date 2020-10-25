package com.ds.usc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        CarFactory carFactory = new CarFactory();
        System.out.println("enter car name that you want to know information");
        Cars cars = carFactory.get(input.nextLine());
        cars.bestcar();
        cars.power();
        cars.topspeed();
    }
}
