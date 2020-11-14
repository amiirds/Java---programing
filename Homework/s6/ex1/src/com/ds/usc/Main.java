package com.ds.usc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "amir",
                "amirreza44")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into user_information (user_code ,username, email, password ,age ,education) values (?,?,?,?,?,?)");

            preparedStatement.setLong(1 , 981113019);
            preparedStatement.setString(2, "amirreza");
            preparedStatement.setString(3,"amiirds@gmail.com");
            preparedStatement.setString(4, "amiirds24");
            preparedStatement.setInt(5, 19);
            preparedStatement.setString(6,"diploma");
            connection.prepareStatement("select * from user_information");
//            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver Not Exist!!");
        }
    }
}
