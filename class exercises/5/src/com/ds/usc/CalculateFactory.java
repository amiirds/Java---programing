package com.ds.usc;

public class CalculateFactory {
    public Calculate getcalc(String c){
        return switch (c) {
            case "+" -> new CalPlus();
            case "-" -> new CalMinus();
            default -> null;
        };
    }
}
