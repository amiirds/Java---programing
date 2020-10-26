package com.ds.usc;


public class CalPlus implements Calculate {

    @Override
    public void calc(String[] strings) {
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[2]);
        System.out.println(a+b);
    }
}
