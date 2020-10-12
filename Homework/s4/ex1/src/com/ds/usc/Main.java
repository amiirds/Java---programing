package com.ds.usc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map map = new HashMap();
        System.out.println("enter name ");
        String name = input.nextLine();
        System.out.println("enter last");
        String last = input.nextLine();
        System.out.println("enter student no ");
        long no = input.nextLong();
        System.out.println("enter your average");
        double average = input.nextDouble();
        map.put("name",name);
        map.put("last",last);
        map.put("student number",no);
        map.put("average",average);
            System.out.println(map.get("name"));
            System.out.println(map.get("last"));
            System.out.println(map.get("student number"));
            System.out.println(map.get("average"));

    }
}
