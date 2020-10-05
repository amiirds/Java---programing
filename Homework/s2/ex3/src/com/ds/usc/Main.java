package com.ds.usc;

import java.util.Scanner;

public class Main extends PosNeg {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer");
        x = input.nextInt();
        PosNeg posNeg = new PosNeg();
        if (x % 2 == 0) {
            posNeg.isEven(x);
        } else {
            posNeg.isOdd(x);
        }
        if (x > 0) {
            posNeg.isPositive(x);
        }
        if (x < 0) {
            posNeg.isNegative(x);
        }
        if (x == 0) {
            posNeg.isZero(x);
        }
    }
}
