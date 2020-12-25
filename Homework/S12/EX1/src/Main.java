
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
       Employeeinfo<String > employeeinfo = Employee::insert;

        for (int i=1 ; i<6 ; i++)
        {
            System.out.println("No " + i +" "+" please Enter required Info\n");
            try {
                System.out.println("your name =  \nyour education =  \nyour age =  \nyour email address = ");
                employeeinfo.info(input.next(),input.next(),input.next(),input.next());
            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


        } System.out.println("thank you ...");

    }
}
