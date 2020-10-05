import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("please enter the grade and Coefficient of math");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        double a;
        int a1;
        a = sc.nextDouble();
        a1 = sc1.nextInt();
        System.out.println("please enter the grade and Coefficient of history");
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        double b;
        int b1;
        b = sc2.nextDouble();
        b1 = sc3.nextInt();
        System.out.println("please enter the grade and Coefficient of programing");
        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);
        double c;
        int c1;
        c = sc4.nextDouble();
        c1 = sc5.nextInt();
        double average = ((a * a1) + (b * b1) + (c * c1)) / (a1 + b1 + c1);
        if (average > 12) {
            System.out.println("the average is " + average + " and it's pass");
        } else {
            System.out.println("the average is " + average + " and it's failed");
        }
    }
}
