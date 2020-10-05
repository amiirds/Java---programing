package com.ds.usc;


public class PosNeg  implements MyInteger{
    public PosNeg() {

    }
    @Override
    public void isEven(int x) {
        System.out.println(x + " is even");

    }

    @Override
    public void isOdd(int x) {
        System.out.println(x +" is odd ");

    }

    @Override
    public void isPositive(int x) {
        System.out.println(x +" is positive");
    }

    @Override
    public void isNegative(int x) {
        System.out.println(x + " is Negative");

    }

    @Override
    public void isZero(int x) {
        System.out.println(x + " is zero ");

    }
}
