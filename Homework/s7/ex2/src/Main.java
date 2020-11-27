import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Entity tmp = new Entity();
        System.out.print("Enter Full Name: ");
        tmp.setName(scanner.next());
        System.out.print("Melli ID: ");
        tmp.setMelliID(scanner.nextInt());
        System.out.printf("Choose Car Model:\n1  tiba\t\t99\t120  M\n2  cerato\t98\t900  M\n3  praide\t98\t120  M\n");
        switch (scanner.nextInt()) {
            case 1:
                editor("tiba",99,"120 M",tmp);
                break;
            case 2:
                editor("cerato",98,"900 M",tmp);
                break;
            case 3:
                editor("praide",98,"120 M",tmp);
                break;
            default:
                System.out.println("invalid");
        }
        reporter();
    }
    public static void editor(String t1, int t2, String t3, Entity tmp) {
        try {
            Service.getInstance().save(new Entity().setMelliID(tmp.getMelliID()).setName(tmp.getName()).setCar_name(t1).setCar_year(t2).setCar_price(t3));
        } catch (Exception e) {
            System.out.println("failed to save " + e.getMessage());
        }
    }
    public static void reporter() {
        List<Entity> entityList = null;
        try {
            entityList = Service.getInstance().report();
        } catch (Exception e) {
            System.out.println("failed to report " + e.getMessage());
        }
        for (Entity entity : entityList) {
            System.out.println(" code melli = " + entity.getMelliID());
            System.out.println(" name is =  " + entity.getName());
            System.out.println(" car name = " + entity.getCar_name());
            System.out.println(" car year = " + entity.getCar_year());
            System.out.println(" car price = " + entity.getCar_price());
            System.out.println("----------------------");
        }
    }
}