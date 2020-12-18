import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try {
            PeopleService peopleService=(PeopleService) Naming.lookup("//localhost/Server");
            System.out.println("welcome to Ds restaurant\n------------------------");
            String address;
            System.out.println("Enter your address :");
            address=scanner.nextLine();

            System.out.println("This is our Menu \n\n1) Pizza --> 100,000 toman\n2) Salad --> 60,000 toman\n3) Pasta --> 68,000 toman");
            String ans=scanner.next();

            switch (ans)
            {
                case "1":
                    Entity entity =new Entity(address,"100","pizza");
                    peopleService.save(entity);
                    System.out.println("Ok come back in 35 min later");
                    break;
                case "2":
                    Entity entity1 =new Entity(address,"60","salad");
                    peopleService.save(entity1);
                    System.out.println("Ok come back in 15 min later");
                    break;
                case "3":
                    Entity entity2 =new Entity(address,"68","pasta");
                    peopleService.save(entity2);
                    System.out.println("Ok come back in 30 min later");
                    break;


            }

        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
