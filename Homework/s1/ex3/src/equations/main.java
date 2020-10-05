package equations;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int i;
        int a;
        int b;
        int c;
        int d;
        double e;
        double f;
        for ( i = 1; i <= 4; i++) {
            System.out.println("enter the" +i+ "th coefficient");
        }
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        b = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        c = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        d = sc3.nextInt();
        System.out.println("enter two Fixed numbers");
        Scanner sc4 = new Scanner(System.in);
        e = sc4.nextInt();
        Scanner sc5 = new Scanner(System.in);
        f = sc5.nextInt();
        solv solv = new solv();
        compute compute = new compute();
        System.out.println(compute.k(a, b, d, c)  + solv.j(a, b, c, d, e, f));

    }
}
