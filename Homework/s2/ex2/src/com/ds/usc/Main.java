package com.ds.usc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("         write the name of lesson that you want to see info     ");
        System.out.println("math2");
        System.out.println("ap");
        System.out.println("diff");
        System.out.println("physic2");

        String choice ;
        choice = input.nextLine();
        Lesson lesson = new Lesson();
//        if (choice == "math2"){  ////nemidonam chra in if kar nakard vase hamin ba swich case rftm
//            lesson.Math();
//        }
//        if (choice == "ap"){
//            lesson.Ap();
//        }
//        if (choice == "diff"){
//            lesson.Diff();
//        }
//        if (choice == "physic"){
//            lesson.physic2();
//        }
        switch (choice) {
            case "math2" ->  lesson.Math();
            case "ap" ->  lesson.Ap();
            case "diff" ->  lesson.Diff();
            case "physic2" ->  lesson.physic2();
            default -> System.out.println(" please write  one of the option other lesson is not defined ");
        }

    }
}
