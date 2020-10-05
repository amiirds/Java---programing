package com.ds.usc;
import java.lang.Math;
import java.util.Scanner;

public class calculate {
    public calculate(){
        double x1;
        double x2;
        int a;
        int b;
        int c ;
        double delta;
        Scanner input = new Scanner(System.in);
        System.out.println("normal form of quadratic equations is\n'ax^2 + bx + c'");
        System.out.print("enter 'a' = ");
        a = input.nextInt();
        System.out.print("enter 'b' = ");
        b = input.nextInt();
        System.out.print("enter 'c' as constant value = ");
        c = input.nextInt();
        delta = (Math.pow(b , 2)) - (4 * a * c);
        x1 = ( -b + Math.sqrt(delta))/(2*a);
        x2 = ( -b - Math.sqrt(delta))/(2*a);
        if (0 <= delta){
            System.out.println(x1 + "is the first root ");
            System.out.println(x2 + "is the second root");
        }
        else System.out.println("Delta is negative ~~~> not roots ");

    }
}
