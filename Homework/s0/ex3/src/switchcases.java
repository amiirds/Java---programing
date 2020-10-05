import java.util.Scanner;
public class switchcases {
    public static void main(String[] args) {
        int a1 = 10;
        int a2 = 23;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 if you want to see the sum of the numbr");
        System.out.println("press 2 if you want to see the difrence of the number");
        System.out.println("press 3 if you want to multiply the number");
        System.out.println("press 4 if you want to division the number");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(a1+a2);
                break;
            case 2:
                System.out.println(a2-a1);
                break;
            case 3:
                System.out.println(a2*a1);
                break;
            case 4:
                System.out.println(a2/a1);
                break;
            default:
                System.out.println("not defind");

        }

    }
}
