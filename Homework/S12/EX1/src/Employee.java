
import java.sql.*;

public class Employee {
    private static  Connection connection;
    private static  PreparedStatement preparedStatement ;

    public static String  insert (String  name, String  education ,String age ,String email) throws ClassNotFoundException, SQLException {
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521/xepdb1", "amirds", "ds123");
        preparedStatement = connection.prepareStatement("create  table employee1 (name varchar(40),education varchar(50),age number , email varchar(40))");
//        preparedStatement.executeUpdate();
        preparedStatement=connection.prepareStatement ("INSERT INTO employee1 (name, education, age, email) VALUES (?,?,?,?)");
        preparedStatement.setString (1,name);
        preparedStatement.setString (2,education);
        preparedStatement.setString (3,age);
        preparedStatement.setString (4,email);
        preparedStatement.executeUpdate ();
        preparedStatement.close ();
        connection.close ();

    return "saved ...";
    }
}
