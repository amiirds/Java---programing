package library;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        int choice;
        while (running) {
            System.out.println("\n       book library system      ");
            System.out.println("enter 1 to add book");
            System.out.println("enter 2 to loan a book");
            System.out.println("enter 3  to return a book");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    info info = new info();
                    System.out.println(info.bookName);
                    System.out.println(info.authorName);
                    System.out.println(info.price);
                    System.out.println(info.sNo);
                    break;
                case 2:
                    Loan loan = new Loan();
                    break;
                case 3:
                    Returun return1 = new Returun();
                    break;

            }
        }
    }
}


