import java.util.Scanner;
public class searcharray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array [] = {2, 3, 6, 8, 8};
        int a;
        int count = 0;
        int found;
        System.out.println("please enter a numbr");
        a = sc.nextInt();
        boolean x = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                x = true;
                break;
            }
        }
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++)
                if (array[i] == array[j]){
                    count ++;
                   break;
                }
        }
            if (x) {
                System.out.println("the " + a + " is true." +count+ ".");
            } else {
                System.out.println("false");
            }

    }
}
