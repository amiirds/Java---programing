package library;

import java.util.Scanner;

public class info {
    public int sNo;
    public String bookName;
    public String authorName;
    public double price;
    Scanner sc = new Scanner(System.in);
    public info() {
        System.out.println("Enter the Serial No of book");
        this.sNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the book name");
        this.bookName = sc.nextLine();
        System.out.println("Enter author name ");
        this.authorName = sc.nextLine();
        System.out.println("Enter price of Books:");
        this.price = sc.nextInt();
    }
}

