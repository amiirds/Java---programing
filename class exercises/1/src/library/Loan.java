package library;

import java.util.Scanner;

public class Loan {
    public Loan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name of The book you want to loan\n");
        String loan = scanner.nextLine();
        System.out.println("\nYou borrowed " +loan);
    }
}
