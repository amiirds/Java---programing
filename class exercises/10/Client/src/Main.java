import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Service service = (Service) Naming.lookup("//localhost/Service");
            Entity entity = new Entity().setId(2).setUser("amirreza").setPass("123").setBalance(3500);
            service.save(entity);
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Enter Username: ");
            if (scanner.next().equals("amirreza")) {
                System.out.printf("Enter Password: ");
                if (scanner.next().equals("123")) {
                    System.out.printf("Login Successful\n1 Deposit\n2 Withdraw\n");
                    switch (scanner.nextInt()) {
                        case 1:
                            System.out.printf("Enter deposit amount: ");
                            int sum = entity.getBalance()+scanner.nextInt();
                            entity = new Entity().setId(entity.getId()).setUser(entity.getUser()).setPass(entity.getPass()).setBalance(sum);
                            service.edit(entity);
                            System.out.printf("done your balance now is " + sum);
                            break;
                        case 2:
                            System.out.printf("Enter withdraw amount: ");
                            int sum1 = entity.getBalance()-scanner.nextInt();
                            entity = new Entity().setId(entity.getId()).setUser(entity.getUser()).setPass(entity.getPass()).setBalance(sum1);
                            service.edit(entity);
                            System.out.printf("done your balance now is " + sum1);
                            break;
                    }
                } else {
                    System.out.println("Wrong Password");
                    System.exit(0);
                }
            } else {
                System.out.println("User doesn't exist");
                System.exit(0);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}