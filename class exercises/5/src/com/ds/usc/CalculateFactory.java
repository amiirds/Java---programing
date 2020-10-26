package com.ds.usc;

public class CalculateFactory {
    public Calculate getcalc(String c){
        switch (c){
            case "+" :
                return new CalPlus();
            case "-" :
                return new CalMinus();
            default:
                return null;
        }
    }
}
