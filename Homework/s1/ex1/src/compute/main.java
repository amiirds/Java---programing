package compute;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int length , width ;
        System.out.println("calculation only for rectangle & square ");
        System.out.println("-------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        length = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the width");
        width = sc.nextInt();
        mohit compute = new mohit();
        System.out.println("circumference is " +compute.Mohit(length, width));
        area compute1 = new area();
        System.out.println("area is " +compute1.area(length, width));


    }
}
