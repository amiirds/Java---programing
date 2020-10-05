package library;

import java.util.Scanner;

public class Returun {
    public Returun(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the book you want to return\n");
        String return1 = scanner.nextLine();
        System.out.println("\nYou returned " + return1 + " Thanks");
    }
}
